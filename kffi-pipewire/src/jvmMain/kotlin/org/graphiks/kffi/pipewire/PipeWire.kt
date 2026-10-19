package org.graphiks.kffi.pipewire

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicBoolean
import org.graphiks.kffi.pipewire.generated.KFFI_PW_ID_ANY
import org.graphiks.kffi.pipewire.generated.KFFI_PW_VERSION_STREAM_EVENTS
import org.graphiks.kffi.pipewire.generated.pw_stream_events
import org.graphiks.kffi.pipewire.generated.pw_stream_flags
import org.graphiks.kffi.pipewire.generated.pw_stream_state
import org.graphiks.kffi.pipewire.generated.pw_buffer
import org.graphiks.kffi.pipewire.generated.pw_context_connect_fd
import org.graphiks.kffi.pipewire.generated.pw_context_new
import org.graphiks.kffi.pipewire.generated.pw_deinit
import org.graphiks.kffi.pipewire.generated.pw_init
import org.graphiks.kffi.pipewire.generated.pw_properties_free
import org.graphiks.kffi.pipewire.generated.pw_properties_new_string
import org.graphiks.kffi.pipewire.generated.pw_stream_add_listener
import org.graphiks.kffi.pipewire.generated.pw_stream_connect
import org.graphiks.kffi.pipewire.generated.pw_stream_dequeue_buffer
import org.graphiks.kffi.pipewire.generated.pw_stream_destroy
import org.graphiks.kffi.pipewire.generated.pw_stream_get_state
import org.graphiks.kffi.pipewire.generated.pw_stream_new
import org.graphiks.kffi.pipewire.generated.pw_stream_queue_buffer
import org.graphiks.kffi.pipewire.generated.pw_stream_update_params
import org.graphiks.kffi.pipewire.generated.pw_thread_loop_destroy
import org.graphiks.kffi.pipewire.generated.pw_thread_loop_lock
import org.graphiks.kffi.pipewire.generated.pw_thread_loop_new
import org.graphiks.kffi.pipewire.generated.pw_thread_loop_signal
import org.graphiks.kffi.pipewire.generated.pw_thread_loop_start
import org.graphiks.kffi.pipewire.generated.pw_thread_loop_stop
import org.graphiks.kffi.pipewire.generated.pw_thread_loop_unlock
import org.graphiks.kffi.pipewire.generated.pw_thread_loop_wait
import org.graphiks.kffi.pipewire.generated.pw_core_disconnect
import org.graphiks.kffi.pipewire.generated.pw_context_destroy
import org.graphiks.kffi.pipewire.generated.spa_buffer
import org.graphiks.kffi.pipewire.generated.spa_chunk
import org.graphiks.kffi.pipewire.generated.spa_data
import org.graphiks.kffi.pipewire.generated.spa_hook

/**
 * Managed process-wide PipeWire bootstrap. `pw_init` is idempotent in C but
 * paired bookkeeping (`pw_deinit`) belongs to the last owner, so this facade
 * initializes once per JVM and never deinitializes: the process keeps the
 * library reference until exit, matching what long-running clients do.
 */
public object PipeWire {
    private val initialized = AtomicBoolean(false)

    public val idAny: Int get() = KFFI_PW_ID_ANY()

    public fun ensureInitialized() {
        if (initialized.compareAndSet(false, true)) {
            pw_init(MemorySegment.NULL, MemorySegment.NULL)
        }
    }
}

/**
 * `pw_properties` built from a single `"key=value ..."` string — the varargs
 * `pw_properties_new` constructor is intentionally not bound.
 */
public class PipeWireProperties private constructor(
    private val handle: MemorySegment,
) : AutoCloseable {
    public fun handle(): MemorySegment = handle

    override public fun close() {
        pw_properties_free(handle)
    }

    public companion object {
        public fun fromString(allocator: SegmentAllocator, specification: String): PipeWireProperties {
            PipeWire.ensureInitialized()
            val cString = allocator.allocateFrom(specification)
            val handle = pw_properties_new_string(cString)
            check(handle != MemorySegment.NULL) { "pw_properties_new_string failed for: $specification" }
            return PipeWireProperties(handle)
        }
    }
}

/** `pw_thread_loop`: one dedicated loop thread for a stream client. */
public class PipeWireThreadLoop private constructor(
    private val handle: MemorySegment,
) : AutoCloseable {
    private val closed = AtomicBoolean(false)

    public fun handle(): MemorySegment = handle

    public fun start(): Int = pw_thread_loop_start(handle)

    /** Runs [block] under the loop lock (reentrant from the same thread). */
    public fun <T> withLock(block: () -> T): T {
        pw_thread_loop_lock(handle)
        try {
            return block()
        } finally {
            pw_thread_loop_unlock(handle)
        }
    }

    /** Waits (loop lock held by caller) for a matching [signal]. */
    public fun await() {
        pw_thread_loop_wait(handle)
    }

    public fun signal(waitFor: Boolean = false) {
        pw_thread_loop_signal(handle, waitFor)
    }

    override public fun close() {
        if (closed.compareAndSet(false, true)) {
            pw_thread_loop_stop(handle)
            pw_thread_loop_destroy(handle)
        }
    }

    public companion object {
        public fun create(name: String?, properties: PipeWireProperties?): PipeWireThreadLoop {
            PipeWire.ensureInitialized()
            Arena.ofShared().use { arena ->
                val nameSegment = name?.let { arena.allocateFrom(it) } ?: MemorySegment.NULL
                val propsSegment = properties?.handle() ?: MemorySegment.NULL
                val handle = pw_thread_loop_new(nameSegment, propsSegment)
                check(handle != MemorySegment.NULL) { "pw_thread_loop_new failed" }
                return PipeWireThreadLoop(handle)
            }
        }
    }
}

/** `pw_context` bound to a thread loop. */
public class PipeWireContext private constructor(
    private val handle: MemorySegment,
) : AutoCloseable {
    private val closed = AtomicBoolean(false)

    public fun handle(): MemorySegment = handle

    /**
     * Connects the portal-provided [fd] (`OpenPipeWireRemote`) — the fd names
     * a live PipeWire socket connection, not a framebuffer. Ownership stays
     * with the caller: [PipeWireCore.close] disconnects the core but never
     * closes the fd.
     */
    public fun connectFd(fd: Int, properties: PipeWireProperties?): PipeWireCore {
        val propsSegment = properties?.handle() ?: MemorySegment.NULL
        val core = pw_context_connect_fd(handle, fd, propsSegment, 0L)
        check(core != MemorySegment.NULL) { "pw_context_connect_fd failed for fd=$fd" }
        return PipeWireCore(core)
    }

    override public fun close() {
        if (closed.compareAndSet(false, true)) {
            pw_context_destroy(handle)
        }
    }

    public companion object {
        public fun create(loop: PipeWireThreadLoop, properties: PipeWireProperties?): PipeWireContext {
            PipeWire.ensureInitialized()
            val propsSegment = properties?.handle() ?: MemorySegment.NULL
            val context = pw_context_new(loop.handle(), propsSegment, 0L)
            check(context != MemorySegment.NULL) { "pw_context_new failed" }
            return PipeWireContext(context)
        }
    }
}

/** `pw_core` produced by [PipeWireContext.connectFd]. */
public class PipeWireCore internal constructor(
    private val handle: MemorySegment,
) : AutoCloseable {
    private val closed = AtomicBoolean(false)

    public fun handle(): MemorySegment = handle

    override public fun close() {
        if (closed.compareAndSet(false, true)) {
            pw_core_disconnect(handle)
        }
    }
}

/** Typed consumer callbacks for one [PipeWireStream]. */
public interface PipeWireStreamEvents {
    public fun onStreamDestroyed() {}

    public fun onStateChanged(old: pw_stream_state, state: pw_stream_state, error: String?) {}

    /** [id] is the param id (EnumFormat/Format/Buffers); [param] may be null on clear. */
    public fun onParamChanged(id: Int, param: MemorySegment?) {}

    public fun onBufferAdded(buffer: MemorySegment) {}

    public fun onBufferRemoved(buffer: MemorySegment) {}

    public fun onProcess() {}

    public fun onError(throwable: Throwable) {}
}

/**
 * Managed `pw_stream`. The native events struct, spa_hook storage and every
 * upcall stub live in one arena closed by [close] — after close returns, no
 * consumer callback runs again (the loop must be stopped first: PipeWire
 * teardown order is stream → core → context → thread loop).
 *
 * Callbacks arrive on the thread-loop thread; calls into this facade from
 * other threads must hold the loop lock.
 */
public class PipeWireStream private constructor(
    private val handle: MemorySegment,
    private val arena: Arena,
) : AutoCloseable {
    private val closed = AtomicBoolean(false)

    internal fun handle(): MemorySegment = handle

    /**
     * Connects the stream. [pods] are serialized synchronously into the
     * connect command: their segments only need to outlive this call.
     */
    public fun connect(
        direction: org.graphiks.kffi.pipewire.generated.spa_direction,
        targetId: Int,
        flags: pw_stream_flags,
        pods: List<MemorySegment>,
    ): Int {
        val params = arena.allocate(ValueLayout.ADDRESS, pods.size.toLong())
        pods.forEachIndexed { index, pod ->
            params.set(ValueLayout.ADDRESS, index.toLong(), pod)
        }
        return pw_stream_connect(handle, direction, targetId, flags, params, pods.size)
    }

    /** Updates stream params (serialized synchronously, as [connect]). */
    public fun updateParams(pods: List<MemorySegment>): Int {
        val params = arena.allocate(ValueLayout.ADDRESS, pods.size.toLong())
        pods.forEachIndexed { index, pod ->
            params.set(ValueLayout.ADDRESS, index.toLong(), pod)
        }
        return pw_stream_update_params(handle, params, pods.size)
    }

    /** Returns the dequeued `pw_buffer*`, or NULL when the queue is empty. */
    public fun dequeueBuffer(): MemorySegment = pw_stream_dequeue_buffer(handle)

    public fun queueBuffer(buffer: MemorySegment): Int = pw_stream_queue_buffer(handle, buffer)

    public fun state(): pw_stream_state = pw_stream_get_state(handle, MemorySegment.NULL)

    override public fun close() {
        if (closed.compareAndSet(false, true)) {
            pw_stream_destroy(handle)
            arena.close()
        }
    }

    public companion object {
        private val eventsAccess = pw_stream_events()

        public fun create(
            core: PipeWireCore,
            name: String,
            properties: PipeWireProperties?,
            events: PipeWireStreamEvents,
        ): PipeWireStream {
            PipeWire.ensureInitialized()
            val arena = Arena.ofShared()
            try {
                val propsSegment = properties?.handle() ?: MemorySegment.NULL
                val handle = pw_stream_new(core.handle(), arena.allocateFrom(name), propsSegment)
                check(handle != MemorySegment.NULL) { "pw_stream_new failed" }

                val stream = PipeWireStream(handle, arena)
                stream.installListener(events)
                return stream
            } catch (t: Throwable) {
                arena.close()
                throw t
            }
        }

        private fun PipeWireStream.installListener(events: PipeWireStreamEvents) {
            val dispatcher = StreamDispatcher(events)
            val destroy = upcall(dispatcher, "destroyUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))
            val stateChanged = upcall(
                dispatcher,
                "stateChangedUpcall",
                FunctionDescriptor.ofVoid(
                    ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS,
                ),
            )
            val paramChanged = upcall(
                dispatcher,
                "paramChangedUpcall",
                FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            )
            val addBuffer = upcall(
                dispatcher,
                "addBufferUpcall",
                FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            )
            val removeBuffer = upcall(
                dispatcher,
                "removeBufferUpcall",
                FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            )
            val process = upcall(dispatcher, "processUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))

            val eventsStruct = pw_stream_events.allocate(arena)
            // The generated field accessors are instance members carrying
            // their own VarHandles: dispatch through one shared instance.
            with(eventsAccess) {
                version(eventsStruct, KFFI_PW_VERSION_STREAM_EVENTS())
                destroy(eventsStruct, destroy)
                state_changed(eventsStruct, stateChanged)
                param_changed(eventsStruct, paramChanged)
                add_buffer(eventsStruct, addBuffer)
                remove_buffer(eventsStruct, removeBuffer)
                process(eventsStruct, process)
            }

            val hookStorage: MemorySegment = arena.allocate(spa_hook.layout)
            pw_stream_add_listener(handle, hookStorage, eventsStruct, MemorySegment.NULL)
        }

        private fun upcall(sink: Any, method: String, descriptor: FunctionDescriptor): MemorySegment {
            val parameterTypes = descriptor.argumentLayouts().map { (it as ValueLayout).carrier() }
            val target: MethodHandle = MethodHandles.lookup().findVirtual(
                sink.javaClass,
                method,
                MethodType.methodType(Void.TYPE, parameterTypes),
            ).bindTo(sink)
            return LinkerHolder.linker().upcallStub(target, descriptor, Arena.ofShared())
        }
    }

    private class StreamDispatcher(private val events: PipeWireStreamEvents) {
        fun destroyUpcall(@Suppress("UNUSED_PARAMETER") data: MemorySegment) = guarded { events.onStreamDestroyed() }

        fun stateChangedUpcall(
            @Suppress("UNUSED_PARAMETER") data: MemorySegment,
            old: Int,
            state: Int,
            error: MemorySegment,
        ) = guarded {
            val oldState = pw_stream_state.entries.firstOrNull { it.value == old.toLong() }
            val newState = pw_stream_state.entries.firstOrNull { it.value == state.toLong() }
            val message = if (error == MemorySegment.NULL) null else error.reinterpret(Long.MAX_VALUE).getString(0)
            when {
                oldState == null || newState == null ->
                    events.onError(IllegalStateException("unknown pw_stream_state transition $old -> $state"))
                else -> events.onStateChanged(oldState, newState, message)
            }
        }

        fun paramChangedUpcall(
            @Suppress("UNUSED_PARAMETER") data: MemorySegment,
            id: Int,
            param: MemorySegment,
        ) = guarded {
            events.onParamChanged(id, if (param == MemorySegment.NULL) null else param)
        }

        fun addBufferUpcall(@Suppress("UNUSED_PARAMETER") data: MemorySegment, buffer: MemorySegment) =
            guarded { events.onBufferAdded(buffer) }

        fun removeBufferUpcall(@Suppress("UNUSED_PARAMETER") data: MemorySegment, buffer: MemorySegment) =
            guarded { events.onBufferRemoved(buffer) }

        fun processUpcall(@Suppress("UNUSED_PARAMETER") data: MemorySegment) = guarded { events.onProcess() }

        private fun guarded(block: () -> Unit) {
            try {
                block()
            } catch (t: Throwable) {
                try {
                    events.onError(t)
                } catch (_: Throwable) {
                    // never unwind across the native upcall
                }
            }
        }
    }
}

private object LinkerHolder {
    fun linker(): java.lang.foreign.Linker = java.lang.foreign.Linker.nativeLinker()
}

/** Reads one dequeued `pw_buffer` without retaining any native memory. */
public object PipeWireBuffers {
    public data class PlaneView(
        public val type: Int,
        public val data: MemorySegment,
        public val maxSize: Int,
        public val offset: Int,
        public val size: Int,
        public val stride: Int,
    )

    private val bufferAccess = pw_buffer()
    private val spaBufferAccess = spa_buffer()
    private val spaDataAccess = spa_data()
    private val spaChunkAccess = spa_chunk()

    /** Number of data planes described by the buffer. */
    public fun planeCount(pwBuffer: MemorySegment): Int {
        val spa = bufferAccess.buffer(pwBuffer)
        return spaBufferAccess.n_datas(spa)
    }

    /**
     * Materializes [index] with the chunk values valid at read time. The
     * returned view borrows native memory: it must not outlive the
     * queue_buffer call that recycles this buffer.
     */
    public fun plane(pwBuffer: MemorySegment, index: Int): PlaneView {
        val spa = bufferAccess.buffer(pwBuffer)
        val datas = spaBufferAccess.datas(spa)
        val count = spaBufferAccess.n_datas(spa)
        require(index in 0 until count) { "plane index $index out of 0..${count - 1}" }
        val data = spa_data.asSlice(datas, index.toLong())
        val chunk = spaDataAccess.chunk(data)
        return PlaneView(
            type = spaDataAccess.type(data),
            data = spaDataAccess.data(data),
            maxSize = spaDataAccess.maxsize(data),
            offset = spaChunkAccess.offset(chunk),
            size = spaChunkAccess.size(chunk),
            stride = spaChunkAccess.stride(chunk),
        )
    }
}
