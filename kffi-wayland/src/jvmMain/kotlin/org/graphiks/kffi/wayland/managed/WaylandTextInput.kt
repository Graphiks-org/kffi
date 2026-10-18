package org.graphiks.kffi.wayland.managed

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.atomic.AtomicBoolean

/** One IME state change accumulated until the done batching point. */
public data class WaylandImeEvent(
    public val kind: Kind,
    public val surfaceAddress: Long,
    public val text: String?,
    /** UTF-8 byte offsets within the surrounding text / preedit cursor pair */
    public val byteCursor: Int,
    public val byteAnchor: Int,
    /** delete_surrounding_text: bytes before and after the cursor */
    public val deleteBeforeBytes: Int,
    public val deleteAfterBytes: Int,
    /** done serial — the batch revision base */
    public val serial: Int,
) {
    public enum class Kind { Enter, Leave, Preedit, Commit, DeleteSurrounding, Done }
}

/** Revocable handle for one registered IME consumer. */
public class WaylandImeListener internal constructor(
    private val revoked: AtomicBoolean,
) {
    public fun revoke(): Boolean = revoked.compareAndSet(false, true)
    public fun isActive(): Boolean = !revoked.get()
}

/**
 * Managed facade over one `zwp_text_input_v3` object. State requests
 * (surrounding text, change cause, content type, cursor rectangle) are
 * accumulated and sealed by [commit] per the protocol discipline. Events
 * (enter/leave/preedit/commit_string/delete_surrounding) accumulate and
 * deliver at every `done(serial)` — the protocol batching point. All
 * payloads are copied inside the upcall; strings convert from UTF-8 at
 * the boundary.
 */
public class WaylandTextInput internal constructor(
    internal val proxy: MemorySegment,
    private val arena: Arena,
    private val lock: Any,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val consumers = ArrayList<(WaylandImeEvent) -> Unit>()
    private var installed = false

    // batch accumulation (reset at each done)
    private var batchPreedit: String? = null
    private var batchPreeditCursor = 0
    private var batchPreeditAnchor = 0
    private var batchCommit: String? = null
    private var batchDeleteBefore = 0
    private var batchDeleteAfter = 0
    private var batchSerial = -1

    public fun addListener(
        onEvent: (WaylandImeEvent) -> Unit,
    ): WaylandImeListener {
        val revoked = AtomicBoolean(false)
        synchronized(lock) {
            if (!installed) {
                installed = true
                installNativeListener()
            }
            consumers.add { event -> if (!revoked.get()) onEvent(event) }
        }
        return WaylandImeListener(revoked)
    }

    /** `enable` (opcode 1) — activates the input method for this surface. */
    public fun enable() {
        TextAccess.marshalVoid(proxy, 1)
    }

    /** `disable` (opcode 2). */
    public fun disable() {
        TextAccess.marshalVoid(proxy, 2)
    }

    /** `set_surrounding_text` (opcode 3) with UTF-8 byte cursor/anchor. */
    public fun setSurroundingText(text: String, cursorBytes: Int, anchorBytes: Int) {
        TextAccess.marshalStringTwoInt(proxy, 3, text, cursorBytes, anchorBytes)
    }

    /** `set_text_change_cause` (opcode 4). */
    public fun setTextChangeCause(cause: Int) {
        TextAccess.marshalUint(proxy, 4, cause)
    }

    /** `set_content_type` (opcode 5). */
    public fun setContentType(hint: Int, purpose: Int) {
        TextAccess.marshalTwoUint(proxy, 5, hint, purpose)
    }

    /** `set_cursor_rectangle` (opcode 6), surface-local. */
    public fun setCursorRectangle(x: Int, y: Int, width: Int, height: Int) {
        TextAccess.marshalFourInt(proxy, 6, x, y, width, height)
    }

    /** `commit` (opcode 7) — seals the pending state requests. */
    public fun commit() {
        TextAccess.marshalVoid(proxy, 7)
    }

    private fun deliver(event: WaylandImeEvent) {
        synchronized(lock) { ArrayList(consumers) }.forEach { it(event) }
    }

    private fun installNativeListener() {
        val dispatcher = object : Any() {
            fun enter(data: MemorySegment, p: MemorySegment, surface: MemorySegment) {
                deliver(WaylandImeEvent(WaylandImeEvent.Kind.Enter, surface.address(), null, 0, 0, 0, 0, -1))
            }

            fun leave(data: MemorySegment, p: MemorySegment, surface: MemorySegment) {
                deliver(WaylandImeEvent(WaylandImeEvent.Kind.Leave, surface.address(), null, 0, 0, 0, 0, -1))
            }

            fun preeditString(data: MemorySegment, p: MemorySegment, text: MemorySegment, cursor: Int, anchor: Int) {
                val copied = if (text.address() == 0L) null else text.reinterpret(8192).getString(0)
                synchronized(lock) {
                    batchPreedit = copied
                    batchPreeditCursor = cursor
                    batchPreeditAnchor = anchor
                }
            }

            fun commitString(data: MemorySegment, p: MemorySegment, text: MemorySegment) {
                val copied = if (text.address() == 0L) null else text.reinterpret(8192).getString(0)
                synchronized(lock) { batchCommit = copied }
            }

            fun deleteSurroundingText(data: MemorySegment, p: MemorySegment, before: Int, after: Int) {
                synchronized(lock) {
                    batchDeleteBefore = before
                    batchDeleteAfter = after
                }
            }

            fun done(data: MemorySegment, p: MemorySegment, serial: Int) {
                val batch = synchronized(lock) {
                    val captured = WaylandImeEvent(
                        WaylandImeEvent.Kind.Done, 0L,
                        batchPreedit ?: batchCommit,
                        batchPreeditCursor, batchPreeditAnchor,
                        batchDeleteBefore, batchDeleteAfter,
                        serial,
                    )
                    batchPreedit = null
                    batchPreeditCursor = 0
                    batchPreeditAnchor = 0
                    batchCommit = null
                    batchDeleteBefore = 0
                    batchDeleteAfter = 0
                    batchSerial = serial
                    captured
                }
                deliver(batch)
            }
        }

        fun stub(method: String, descriptor: FunctionDescriptor): MemorySegment {
            val parameterTypes = descriptor.argumentLayouts().map { layout -> (layout as ValueLayout).carrier() }
            val target = MethodHandles.lookup()
                .findVirtual(dispatcher.javaClass, method, MethodType.methodType(Void.TYPE, parameterTypes))
                .bindTo(dispatcher)
            return java.lang.foreign.Linker.nativeLinker().upcallStub(target, descriptor, arena)
        }

        val pointerSize = ValueLayout.ADDRESS.byteSize()
        // event order per zwp_text_input_v3: enter, leave, preedit_string,
        // commit_string, delete_surrounding_text, done
        val struct = arena.allocate(pointerSize * 6L, ValueLayout.ADDRESS.byteAlignment())
        struct.set(ValueLayout.ADDRESS, 0 * pointerSize, stub("enter", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)))
        struct.set(ValueLayout.ADDRESS, 1 * pointerSize, stub("leave", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)))
        struct.set(ValueLayout.ADDRESS, 2 * pointerSize, stub("preeditString", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)))
        struct.set(ValueLayout.ADDRESS, 3 * pointerSize, stub("commitString", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)))
        struct.set(ValueLayout.ADDRESS, 4 * pointerSize, stub("deleteSurroundingText", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)))
        struct.set(ValueLayout.ADDRESS, 5 * pointerSize, stub("done", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)))

        val add = TextAccess.proxyAddListener()
        val rc = add.invoke(proxy, struct, MemorySegment.NULL) as Int
        check(rc == 0) { "zwp_text_input_v3 listener installation failed with rc=$rc" }
    }

    /** `destroy` (opcode 0); idempotent. */
    override fun close() {
        if (!closed.compareAndSet(false, true)) {
            return
        }
        synchronized(lock) { consumers.clear() }
        TextAccess.marshalVoid(proxy, 0)
    }
}

/** Bridge to the generated handles without widening the public surface. */
internal object TextAccess {
    fun proxyAddListener(): MethodHandle =
        org.graphiks.kffi.wayland.wlProxyAddListener
            ?: error("required libwayland symbol 'wl_proxy_add_listener' is unavailable")

    fun marshalVoid(proxy: MemorySegment, opcode: Int) {
        val handle = org.graphiks.kffi.wayland.wlProxyMarshalFlagsVoid ?: return
        handle.invoke(proxy, opcode, MemorySegment.NULL, 1, 0)
    }

    fun marshalUint(proxy: MemorySegment, opcode: Int, value: Int) {
        val handle = org.graphiks.kffi.wayland.wlProxyMarshalFlagsUint ?: return
        handle.invoke(proxy, opcode, MemorySegment.NULL, 1, 0, value)
    }

    fun marshalTwoUint(proxy: MemorySegment, opcode: Int, a: Int, b: Int) {
        val handle = org.graphiks.kffi.wayland.wlProxyMarshalFlagsTwoInt ?: return
        handle.invoke(proxy, opcode, MemorySegment.NULL, 1, 0, a, b)
    }

    fun marshalFourInt(proxy: MemorySegment, opcode: Int, a: Int, b: Int, c: Int, d: Int) {
        val handle = org.graphiks.kffi.wayland.wlProxyMarshalFlagsFourInt ?: return
        handle.invoke(proxy, opcode, MemorySegment.NULL, 1, 0, a, b, c, d)
    }

    fun marshalStringTwoInt(proxy: MemorySegment, opcode: Int, text: String, a: Int, b: Int) {
        val handle = org.graphiks.kffi.wayland.wlProxyMarshalFlagsStringTwoInt ?: return
        Arena.ofConfined().use { temp ->
            handle.invoke(proxy, opcode, MemorySegment.NULL, 1, 0, temp.allocateFrom(text), a, b)
        }
    }
}
