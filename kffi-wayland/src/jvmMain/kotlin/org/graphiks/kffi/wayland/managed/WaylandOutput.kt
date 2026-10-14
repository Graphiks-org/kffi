package org.graphiks.kffi.wayland.managed

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.atomic.AtomicBoolean

/** Immutable snapshot of one output's state, rebuilt and delivered at every `done`. */
public data class WaylandOutputState(
    public val geometryX: Int,
    public val geometryY: Int,
    public val physicalWidthMm: Int,
    public val physicalHeightMm: Int,
    public val subpixel: Int,
    public val transform: Int,
    public val scale: Int,
    public val name: String?,
    public val description: String?,
    public val modes: List<WaylandOutputMode>,
    public val currentModeIndex: Int,
) {
    public companion object {
        public const val MODE_CURRENT: Int = 1
        public const val MODE_PREFERRED: Int = 2
    }
}

/** One mode reported by the output: [flags] carries CURRENT/PREFERRED bits. */
public data class WaylandOutputMode(
    public val flags: Int,
    public val width: Int,
    public val height: Int,
    public val refreshMillihertz: Int,
)

/** Revocable handle for a registered output state consumer. */
public class WaylandOutputListener internal constructor(
    private val revoked: AtomicBoolean,
) {
    public fun revoke(): Boolean = revoked.compareAndSet(false, true)
    public fun isActive(): Boolean = !revoked.get()
}

/**
 * Managed facade over one bound `wl_output`. Exactly one native listener is
 * installed per output proxy and fanned out to every consumer; string
 * payloads are copied inside the upcall; consumers receive the accumulated
 * [WaylandOutputState] at every `done` event (server-side batching point).
 * All resources live in the owning [WaylandClient] arena until close.
 */
public class WaylandOutput internal constructor(
    private val proxy: MemorySegment,
    private val arena: Arena,
    private val lock: Any,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val nativeInstalled = AtomicBoolean(false)
    private val consumers = ArrayList<StateConsumer>()

    // accumulated state, written on the dispatching thread under [lock]
    private var geometryX: Int = 0
    private var geometryY: Int = 0
    private var physicalWidthMm: Int = 0
    private var physicalHeightMm: Int = 0
    private var subpixel: Int = 0
    private var transform: Int = 0
    private var scale: Int = 1
    private var name: String? = null
    private var description: String? = null
    private val modes = ArrayList<WaylandOutputMode>()
    private var currentModeIndex: Int = -1

    /**
     * Registers a revocable consumer. The consumer receives the accumulated
     * state at every `done`; events arriving before registration still count
     * (the first delivery happens at the next done, typically immediately
     * after the binding roundtrip).
     */
    public fun addListener(
        onState: (WaylandOutputState) -> Unit,
        onFailure: (Throwable) -> Unit = {},
    ): WaylandOutputListener {
        val revoked = AtomicBoolean(false)
        val listener = WaylandOutputListener(revoked)
        synchronized(lock) {
            if (nativeInstalled.compareAndSet(false, true)) {
                installNativeDispatcher()
            }
            consumers.add(StateConsumer(onState, onFailure, revoked))
        }
        return listener
    }

    private class StateConsumer(
        val onState: (WaylandOutputState) -> Unit,
        val onFailure: (Throwable) -> Unit,
        val revoked: AtomicBoolean,
    )

    private fun snapshotConsumers(): List<StateConsumer> = synchronized(lock) {
        consumers.filter { !it.revoked.get() }
    }

    private fun installNativeDispatcher() {
        val dispatcher = object : Any() {
            fun geometryUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") output: MemorySegment,
                x: Int, y: Int,
                physicalWidth: Int, physicalHeight: Int,
                subpixelArrived: Int,
                @Suppress("UNUSED_PARAMETER") make: MemorySegment,
                @Suppress("UNUSED_PARAMETER") model: MemorySegment,
                transformArrived: Int,
            ) {
                synchronized(lock) {
                    geometryX = x
                    geometryY = y
                    physicalWidthMm = physicalWidth
                    physicalHeightMm = physicalHeight
                    subpixel = subpixelArrived
                    transform = transformArrived
                }
            }

            fun modeUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") output: MemorySegment,
                flags: Int, width: Int, height: Int, refresh: Int,
            ) {
                synchronized(lock) {
                    modes.add(WaylandOutputMode(flags, width, height, refresh))
                    if (flags and WaylandOutputState.MODE_CURRENT != 0) {
                        currentModeIndex = modes.size - 1
                    }
                }
            }

            fun doneUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") output: MemorySegment,
            ) {
                val state = synchronized(lock) {
                    WaylandOutputState(
                        geometryX = geometryX,
                        geometryY = geometryY,
                        physicalWidthMm = physicalWidthMm,
                        physicalHeightMm = physicalHeightMm,
                        subpixel = subpixel,
                        transform = transform,
                        scale = scale,
                        name = name,
                        description = description,
                        modes = ArrayList(modes),
                        currentModeIndex = currentModeIndex,
                    )
                }
                snapshotConsumers().forEach { consumer ->
                    try {
                        consumer.onState(state)
                    } catch (throwable: Throwable) {
                        runCatching { consumer.onFailure(throwable) }
                    }
                }
            }

            fun scaleUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") output: MemorySegment,
                factor: Int,
            ) {
                synchronized(lock) { scale = factor }
            }

            fun nameUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") output: MemorySegment,
                value: MemorySegment,
            ) {
                val copied = value.reinterpret(512).getString(0)
                synchronized(lock) { name = copied }
            }

            fun descriptionUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") output: MemorySegment,
                value: MemorySegment,
            ) {
                val copied = value.reinterpret(512).getString(0)
                synchronized(lock) { description = copied }
            }
        }

        fun stub(method: String, descriptor: FunctionDescriptor): MemorySegment {
            val parameterTypes = descriptor.argumentLayouts().map { layout -> (layout as ValueLayout).carrier() }
            val target = MethodHandles.lookup()
                .findVirtual(dispatcher.javaClass, method, MethodType.methodType(Void.TYPE, parameterTypes))
                .bindTo(dispatcher)
            return Linker.nativeLinker().upcallStub(target, descriptor, arena)
        }

        fun str(): MemoryLayout = ValueLayout.ADDRESS

        val geometry = stub(
            "geometryUpcall",
            FunctionDescriptor.ofVoid(
                ValueLayout.ADDRESS, ValueLayout.ADDRESS,
                ValueLayout.JAVA_INT, ValueLayout.JAVA_INT,
                ValueLayout.JAVA_INT, ValueLayout.JAVA_INT,
                ValueLayout.JAVA_INT, str(), str(), ValueLayout.JAVA_INT,
            ),
        )
        val mode = stub(
            "modeUpcall",
            FunctionDescriptor.ofVoid(
                ValueLayout.ADDRESS, ValueLayout.ADDRESS,
                ValueLayout.JAVA_INT, ValueLayout.JAVA_INT,
                ValueLayout.JAVA_INT, ValueLayout.JAVA_INT,
            ),
        )
        val done = stub(
            "doneUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        )
        val scale = stub(
            "scaleUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        )
        val name = stub(
            "nameUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, str()),
        )
        val description = stub(
            "descriptionUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, str()),
        )

        val pointerSize = ValueLayout.ADDRESS.byteSize()
        // event order per wl_output v4: geometry, mode, done, scale, name, description
        val listenerStruct = arena.allocate(pointerSize * 6L, ValueLayout.ADDRESS.byteAlignment())
        listenerStruct.set(ValueLayout.ADDRESS, 0 * pointerSize, geometry)
        listenerStruct.set(ValueLayout.ADDRESS, 1 * pointerSize, mode)
        listenerStruct.set(ValueLayout.ADDRESS, 2 * pointerSize, done)
        listenerStruct.set(ValueLayout.ADDRESS, 3 * pointerSize, scale)
        listenerStruct.set(ValueLayout.ADDRESS, 4 * pointerSize, name)
        listenerStruct.set(ValueLayout.ADDRESS, 5 * pointerSize, description)

        // wl_output_add_listener is a static inline helper: use the real symbol
        val add = WaylandClientAccess.proxyAddListener()
        val rc = add.invoke(proxy, listenerStruct, MemorySegment.NULL) as Int
        check(rc == 0) { "wl_output_add_listener failed with rc=$rc" }
    }

    /** Releases the output with `wl_output.release` (v3+); idempotent. */
    override fun close() {
        if (!closed.compareAndSet(false, true)) {
            return
        }
        synchronized(lock) { consumers.clear() }
        WaylandClientAccess.outputRelease(proxy)
    }
}

/** Internal bridge to the generated handles without widening the public surface. */
internal object WaylandClientAccess {
    fun proxyAddListener(): MethodHandle =
        org.graphiks.kffi.wayland.wlProxyAddListener
            ?: error("required libwayland symbol 'wl_proxy_add_listener' is unavailable")

    fun outputRelease(proxy: MemorySegment) {
        val release = org.graphiks.kffi.wayland.wlOutputRelease ?: return
        try {
            release.invokeExact(proxy) as Unit
        } catch (_: Throwable) {
        }
    }
}
