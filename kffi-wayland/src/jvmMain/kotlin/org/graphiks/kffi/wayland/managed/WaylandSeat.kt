package org.graphiks.kffi.wayland.managed

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.atomic.AtomicBoolean

/** Capabilities bitset of one seat (wl_seat.capabilities). */
public object WaylandSeatCapabilities {
    public const val POINTER: Int = 1
    public const val KEYBOARD: Int = 2
    public const val TOUCH: Int = 4
}

/** One raw pointer event with its owning surface proxy address (0 when none). */
public class WaylandPointerEvent public constructor(
    public val kind: Kind,
    public val serial: Int,
    public val time: Int,
    public val surfaceAddress: Long,
    public val x: Double,
    public val y: Double,
    public val button: Int,
    public val state: Int,
    public val axis: Int,
    public val value: Double,
    public val discrete: Int,
) {
    public enum class Kind { Enter, Leave, Motion, Button, Axis, AxisSource, AxisStop, AxisDiscrete, AxisValue120, Frame }
}

/** One raw keyboard event; keymap carries the fd (NOT consumed) and size. */
public class WaylandKeyboardEvent public constructor(
    public val kind: Kind,
    public val serial: Int,
    public val time: Int,
    public val surfaceAddress: Long,
    public val format: Int,
    public val keymapFd: Int,
    public val keymapSize: Int,
    public val pressedKeys: IntArray,
    public val key: Int,
    public val state: Int,
    public val modsDepressed: Int,
    public val modsLatched: Int,
    public val modsLocked: Int,
    public val group: Int,
    public val rate: Int,
    public val delay: Int,
) {
    public enum class Kind { Keymap, Enter, Leave, Key, Modifiers, RepeatInfo }
}

/** Revocable handle for a registered event consumer. */
public class WaylandInputListener internal constructor(
    private val revoked: AtomicBoolean,
) {
    public fun revoke(): Boolean = revoked.compareAndSet(false, true)
    public fun isActive(): Boolean = !revoked.get()
}

/**
 * Managed facade over one bound `wl_seat` and its pointer/keyboard
 * sub-objects. Exactly one native listener per proxy, fanned out to
 * revocable consumers; payloads (including the pressed-keys array and the
 * keymap descriptor) are copied inside the upcall. The keymap fd belongs
 * to libwayland: the consumer reads the map through its own mmap and must
 * not close it.
 */
public class WaylandSeat internal constructor(
    private val seatProxy: MemorySegment,
    private val arena: Arena,
    private val lock: Any,
    private val handleFactory: (proxy: MemorySegment, opcode: Int, interfaceName: String) -> MemorySegment,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val seatConsumers = ArrayList<(Int, String?) -> Unit>()
    private val pointerConsumers = ArrayList<(WaylandPointerEvent) -> Unit>()
    private val keyboardConsumers = ArrayList<(WaylandKeyboardEvent) -> Unit>()

    private var pointerProxy: MemorySegment? = null
    private var keyboardProxy: MemorySegment? = null
    private var pointerInstalled = false
    private var keyboardInstalled = false
    private var pointerWanted = false
    private var keyboardWanted = false
    private var capabilitiesSeen = -1

    public fun addSeatListener(
        onCapabilities: (capabilities: Int) -> Unit,
        onName: (name: String) -> Unit = {},
    ): WaylandInputListener {
        val revoked = AtomicBoolean(false)
        synchronized(lock) {
            installSeatListener()
            seatConsumers.add { capabilities, name ->
                if (!revoked.get()) {
                    if (name != null) onName(name) else onCapabilities(capabilities)
                }
            }
        }
        return WaylandInputListener(revoked)
    }

    /** Requires the POINTER capability; delivers raw pointer events. */
    public fun addPointerListener(
        onEvent: (WaylandPointerEvent) -> Unit,
    ): WaylandInputListener {
        val revoked = AtomicBoolean(false)
        synchronized(lock) {
            ensurePointer()
            pointerConsumers.add { event -> if (!revoked.get()) onEvent(event) }
        }
        return WaylandInputListener(revoked)
    }

    /** Requires the KEYBOARD capability; delivers raw keyboard events. */
    public fun addKeyboardListener(
        onEvent: (WaylandKeyboardEvent) -> Unit,
    ): WaylandInputListener {
        val revoked = AtomicBoolean(false)
        synchronized(lock) {
            ensureKeyboard()
            keyboardConsumers.add { event -> if (!revoked.get()) onEvent(event) }
        }
        return WaylandInputListener(revoked)
    }

    /**
     * Requests the pointer only once the capability has been ANNOUNCED:
     * calling get_pointer before the capabilities event carries the pointer
     * bit is a protocol error (observed as error 0 on sway).
     */
    private fun ensurePointer() {
        pointerWanted = true
        if (capabilitiesSeen == -1 ||
            capabilitiesSeen and WaylandSeatCapabilities.POINTER == 0
        ) {
            return
        }
        requestPointer()
    }

    private fun ensureKeyboard() {
        keyboardWanted = true
        if (capabilitiesSeen == -1 ||
            capabilitiesSeen and WaylandSeatCapabilities.KEYBOARD == 0
        ) {
            return
        }
        requestKeyboard()
    }

    private fun maybeCreateWantedSubObjects() {
        if (pointerWanted && pointerProxy == null &&
            capabilitiesSeen != -1 && capabilitiesSeen and WaylandSeatCapabilities.POINTER != 0
        ) {
            requestPointer()
        }
        if (keyboardWanted && keyboardProxy == null &&
            capabilitiesSeen != -1 && capabilitiesSeen and WaylandSeatCapabilities.KEYBOARD != 0
        ) {
            requestKeyboard()
        }
    }

    private fun requestPointer() {
        if (pointerProxy != null) return
        val proxy = handleFactory(seatProxy, WL_SEAT_GET_POINTER, "wl_pointer")
        pointerProxy = proxy
        if (!pointerInstalled) {
            pointerInstalled = true
            installPointerListener(proxy)
        }
    }

    private fun requestKeyboard() {
        if (keyboardProxy != null) return
        val proxy = handleFactory(seatProxy, WL_SEAT_GET_KEYBOARD, "wl_keyboard")
        keyboardProxy = proxy
        if (!keyboardInstalled) {
            keyboardInstalled = true
            installKeyboardListener(proxy)
        }
    }

    private fun deliverSeat(capabilities: Int) {
        synchronized(lock) { capabilitiesSeen = capabilities }
        maybeCreateWantedSubObjects()
        synchronized(lock) { ArrayList(seatConsumers) }.forEach { it(capabilities, null) }
    }

    private fun deliverSeatName(name: String) {
        synchronized(lock) { ArrayList(seatConsumers) }.forEach { it(0, name) }
    }

    private fun deliverPointer(event: WaylandPointerEvent) {
        synchronized(lock) { ArrayList(pointerConsumers) }.forEach { it(event) }
    }

    private fun deliverKeyboard(event: WaylandKeyboardEvent) {
        synchronized(lock) { ArrayList(keyboardConsumers) }.forEach { it(event) }
    }

    private fun installSeatListener() {
        val dispatcher = object : Any() {
            fun capabilitiesUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") seat: MemorySegment,
                capabilities: Int,
            ) = deliverSeat(capabilities)

            fun nameUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") seat: MemorySegment,
                value: MemorySegment,
            ) = deliverSeatName(value.reinterpret(512).getString(0))
        }
        val capabilities = stub(
            dispatcher, "capabilitiesUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        )
        val name = stub(
            dispatcher, "nameUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        )
        addListener(seatProxy, arrayOf(capabilities, name))
    }

    private fun installPointerListener(proxy: MemorySegment) {
        val dispatcher = object : Any() {
            fun enter(d: MemorySegment, p: MemorySegment, serial: Int, surface: MemorySegment, sxFixed: Int, syFixed: Int) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.Enter, serial, 0, surface.address(), sxFixed / 256.0, syFixed / 256.0, 0, 0, 0, 0.0, 0))

            fun leave(d: MemorySegment, p: MemorySegment, serial: Int, surface: MemorySegment) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.Leave, serial, 0, surface.address(), 0.0, 0.0, 0, 0, 0, 0.0, 0))

            fun motion(d: MemorySegment, p: MemorySegment, time: Int, sxFixed: Int, syFixed: Int) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.Motion, 0, time, 0L, sxFixed / 256.0, syFixed / 256.0, 0, 0, 0, 0.0, 0))

            fun button(d: MemorySegment, p: MemorySegment, serial: Int, time: Int, button: Int, state: Int) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.Button, serial, time, 0L, 0.0, 0.0, button, state, 0, 0.0, 0))

            fun axis(d: MemorySegment, p: MemorySegment, time: Int, axis: Int, valueFixed: Int) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.Axis, 0, time, 0L, 0.0, 0.0, 0, 0, axis, valueFixed / 256.0, 0))

            fun frame(d: MemorySegment, p: MemorySegment) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.Frame, 0, 0, 0L, 0.0, 0.0, 0, 0, 0, 0.0, 0))

            fun axisSource(d: MemorySegment, p: MemorySegment, source: Int) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.AxisSource, 0, 0, 0L, 0.0, 0.0, 0, 0, source, 0.0, 0))

            fun axisStop(d: MemorySegment, p: MemorySegment, time: Int, axis: Int) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.AxisStop, 0, time, 0L, 0.0, 0.0, 0, 0, axis, 0.0, 0))

            fun axisDiscrete(d: MemorySegment, p: MemorySegment, time: Int, axis: Int, discrete: Int) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.AxisDiscrete, 0, time, 0L, 0.0, 0.0, 0, 0, axis, 0.0, discrete))

            fun axisValue120(d: MemorySegment, p: MemorySegment, time: Int, axis: Int, value120: Int) =
                deliverPointer(WaylandPointerEvent(WaylandPointerEvent.Kind.AxisValue120, 0, time, 0L, 0.0, 0.0, 0, 0, axis, 0.0, value120))
        }
        addListener(
            proxy,
            arrayOf(
                stub(dispatcher, "enter", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "leave", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)),
                stub(dispatcher, "motion", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "button", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "axis", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "frame", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)),
                stub(dispatcher, "axisSource", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)),
                stub(dispatcher, "axisStop", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "axisDiscrete", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "axisValue120", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
            ),
        )
    }

    private fun installKeyboardListener(proxy: MemorySegment) {
        val dispatcher = object : Any() {
            fun keymap(d: MemorySegment, p: MemorySegment, format: Int, fd: Int, size: Int) =
                deliverKeyboard(WaylandKeyboardEvent(WaylandKeyboardEvent.Kind.Keymap, 0, 0, 0L, format, fd, size, IntArray(0), 0, 0, 0, 0, 0, 0, 0, 0))

            fun enter(d: MemorySegment, p: MemorySegment, serial: Int, surface: MemorySegment, keys: MemorySegment) {
                // copy immediately: the array is only valid inside the upcall
                val count = countArrayElements(keys)
                val copied = IntArray(count)
                for (index in 0 until count) {
                    copied[index] = keys.get(ValueLayout.JAVA_INT, index * 4L)
                }
                deliverKeyboard(WaylandKeyboardEvent(WaylandKeyboardEvent.Kind.Enter, serial, 0, surface.address(), 0, 0, 0, copied, 0, 0, 0, 0, 0, 0, 0, 0))
            }

            fun leave(d: MemorySegment, p: MemorySegment, serial: Int, surface: MemorySegment) =
                deliverKeyboard(WaylandKeyboardEvent(WaylandKeyboardEvent.Kind.Leave, serial, 0, surface.address(), 0, 0, 0, IntArray(0), 0, 0, 0, 0, 0, 0, 0, 0))

            fun key(d: MemorySegment, p: MemorySegment, serial: Int, time: Int, key: Int, state: Int) =
                deliverKeyboard(WaylandKeyboardEvent(WaylandKeyboardEvent.Kind.Key, serial, time, 0L, 0, 0, 0, IntArray(0), key, state, 0, 0, 0, 0, 0, 0))

            fun modifiers(d: MemorySegment, p: MemorySegment, serial: Int, depressed: Int, latched: Int, locked: Int, group: Int) =
                deliverKeyboard(WaylandKeyboardEvent(WaylandKeyboardEvent.Kind.Modifiers, serial, 0, 0L, 0, 0, 0, IntArray(0), 0, 0, depressed, latched, locked, group, 0, 0))

            fun repeatInfo(d: MemorySegment, p: MemorySegment, rate: Int, delay: Int) =
                deliverKeyboard(WaylandKeyboardEvent(WaylandKeyboardEvent.Kind.RepeatInfo, 0, 0, 0L, 0, 0, 0, IntArray(0), 0, 0, 0, 0, 0, 0, rate, delay))
        }
        addListener(
            proxy,
            arrayOf(
                stub(dispatcher, "keymap", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "enter", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)),
                stub(dispatcher, "leave", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)),
                stub(dispatcher, "key", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "modifiers", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
                stub(dispatcher, "repeatInfo", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)),
            ),
        )
    }

    private fun countArrayElements(array: MemorySegment): Int {
        // wl_array: size_t size; void *data  (16 bytes on LP64)
        val size = array.get(ValueLayout.JAVA_LONG, 0)
        return (size / 4L).toInt()
    }

    private fun addListener(proxy: MemorySegment, stubs: Array<MemorySegment>) {
        val pointerSize = ValueLayout.ADDRESS.byteSize()
        val struct = arena.allocate(pointerSize * stubs.size.toLong(), ValueLayout.ADDRESS.byteAlignment())
        stubs.forEachIndexed { index, stub ->
            struct.set(ValueLayout.ADDRESS, index * pointerSize, stub)
        }
        val add = SeatAccess.proxyAddListener()
        val rc = add.invoke(proxy, struct, MemorySegment.NULL) as Int
        check(rc == 0) { "seat listener installation failed with rc=$rc" }
    }

    /** Raw seat proxy for the injection harness (create_virtual_pointer). */
    internal val rawProxy: MemorySegment
        get() = seatProxy

    private fun stub(sink: Any, method: String, descriptor: FunctionDescriptor): MemorySegment {
        val parameterTypes = descriptor.argumentLayouts().map { layout -> (layout as ValueLayout).carrier() }
        val target = MethodHandles.lookup()
            .findVirtual(sink.javaClass, method, MethodType.methodType(Void.TYPE, parameterTypes))
            .bindTo(sink)
        return java.lang.foreign.Linker.nativeLinker().upcallStub(target, descriptor, arena)
    }

    /** Releases the seat (v5+); idempotent. */
    override fun close() {
        if (!closed.compareAndSet(false, true)) {
            return
        }
        synchronized(lock) {
            seatConsumers.clear()
            pointerConsumers.clear()
            keyboardConsumers.clear()
        }
        SeatAccess.releaseProxy(seatProxy)
        pointerProxy?.let(SeatAccess::releaseProxy)
        keyboardProxy?.let(SeatAccess::releaseProxy)
    }

    private companion object {
        const val WL_SEAT_GET_POINTER = 0
        const val WL_SEAT_GET_KEYBOARD = 1
    }
}

/** Internal bridge to generated handles without widening the public surface. */
internal object SeatAccess {
    fun proxyAddListener(): MethodHandle =
        org.graphiks.kffi.wayland.wlProxyAddListener
            ?: error("required libwayland symbol 'wl_proxy_add_listener' is unavailable")

    fun releaseProxy(proxy: MemorySegment) {
        val release = org.graphiks.kffi.wayland.wlProxyDestroy ?: return
        try {
            release.invokeExact(proxy)
        } catch (_: Throwable) {
        }
    }
}
