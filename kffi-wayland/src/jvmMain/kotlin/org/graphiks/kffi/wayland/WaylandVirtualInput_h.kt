package org.graphiks.kffi.wayland

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle

/*
 * Authored interfaces for the two injection protocols supported by sway and
 * wlroots-based compositors: zwp_virtual_keyboard_v1 (wayland-protocols) and
 * zwlr_virtual_pointer_v1 (wlr-protocols). These are test-harness primitives:
 * they attach virtual devices to an existing seat so compositor-side input
 * injection reaches regular clients — the production mapper is never its own
 * oracle (kadre roadmap phase 4).
 */

private val VIRTUAL_INPUT_ARENA: Arena = Arena.ofShared()

private val MSG_LAYOUT: MemoryLayout = MemoryLayout.structLayout(
    ValueLayout.ADDRESS.withName("name"),
    ValueLayout.ADDRESS.withName("signature"),
    ValueLayout.ADDRESS.withName("types"),
)

private val IFACE_LAYOUT: MemoryLayout = MemoryLayout.structLayout(
    ValueLayout.ADDRESS.withName("name"),
    ValueLayout.JAVA_INT.withName("version"),
    ValueLayout.JAVA_INT.withName("method_count"),
    ValueLayout.ADDRESS.withName("methods").withByteAlignment(8),
    ValueLayout.JAVA_INT.withName("event_count"),
    MemoryLayout.paddingLayout(4),
    ValueLayout.ADDRESS.withName("events").withByteAlignment(8),
).withByteAlignment(8)

private fun msg(name: String, signature: String, vararg types: MemorySegment?): MemorySegment {
    val seg = VIRTUAL_INPUT_ARENA.allocate(MSG_LAYOUT)
    seg.set(ValueLayout.ADDRESS, 0, VIRTUAL_INPUT_ARENA.allocateFrom(name))
    seg.set(ValueLayout.ADDRESS, 8, VIRTUAL_INPUT_ARENA.allocateFrom(signature))
    if (types.isEmpty()) {
        seg.set(ValueLayout.ADDRESS, 16, MemorySegment.NULL)
    } else {
        val arr = VIRTUAL_INPUT_ARENA.allocate(ValueLayout.ADDRESS, types.size + 1L)
        for (i in types.indices) arr.set(ValueLayout.ADDRESS, (i * 8).toLong(), types[i] ?: MemorySegment.NULL)
        arr.set(ValueLayout.ADDRESS, (types.size * 8).toLong(), MemorySegment.NULL)
        seg.set(ValueLayout.ADDRESS, 16, arr)
    }
    return seg
}

private fun iface(
    name: String,
    version: Int,
    methods: Array<MemorySegment>,
    events: Array<MemorySegment> = arrayOf(),
): MemorySegment {
    val seg = VIRTUAL_INPUT_ARENA.allocate(IFACE_LAYOUT)
    seg.set(ValueLayout.ADDRESS, 0, VIRTUAL_INPUT_ARENA.allocateFrom(name))
    seg.set(ValueLayout.JAVA_INT, 8, version)
    seg.set(ValueLayout.JAVA_INT, 12, methods.size)
    val m = VIRTUAL_INPUT_ARENA.allocate(MSG_LAYOUT, methods.size.toLong())
    for (i in methods.indices) m.asSlice(i * 24L).copyFrom(methods[i])
    seg.set(ValueLayout.ADDRESS, 16, m)
    seg.set(ValueLayout.JAVA_INT, 24, events.size)
    seg.set(ValueLayout.ADDRESS, 32, MemorySegment.NULL)
    return seg
}

val virtualKeyboardManagerInterface: MemorySegment by lazy {
    iface(
        "zwp_virtual_keyboard_v1", 1,
        arrayOf(
            msg("keymap", "uhu"),
            msg("key", "uuu"),
            msg("modifiers", "uuuuu"),
            msg("destroy", ""),
        ),
    )
}

private val textInputInterface: MemorySegment by lazy {
    iface(
        "zwp_text_input_v3", 1,
        arrayOf(
            msg("destroy", ""),
            msg("enable", ""),
            msg("disable", ""),
            msg("set_surrounding_text", "sii"),
            msg("set_text_change_cause", "u"),
            msg("set_content_type", "uu"),
            msg("set_cursor_rectangle", "iiii"),
            msg("commit", ""),
        ),
        arrayOf(
            msg("enter", "o", null),
            msg("leave", "o", null),
            msg("preedit_string", "?sii"),
            msg("commit_string", "?s"),
            msg("delete_surrounding_text", "uu"),
            msg("done", "u"),
        ),
    )
}

private val textInputManagerInterface: MemorySegment by lazy {
    iface(
        "zwp_text_input_manager_v3", 1,
        arrayOf(
            msg("destroy", ""),
            msg("get_text_input", "no", null),
        ),
    )
}

/** Authored zwp_text_input_v3 interface (wire order per the protocol XML). */
val zwpTextInputInterfaceV1: MemorySegment get() = textInputInterface

/** Authored zwp_text_input_manager_v3 interface. */
val zwpTextInputManagerInterfaceV1: MemorySegment get() = textInputManagerInterface

val virtualKeyboardManagerInterfaceV1: MemorySegment by lazy {
    // wire order per the protocol: seat object first, then the new_id
    iface(
        "zwp_virtual_keyboard_manager_v1", 1,
        arrayOf(msg("create_virtual_keyboard", "on", null, null)),
    )
}

val virtualPointerInterface: MemorySegment by lazy {
    iface(
        "zwlr_virtual_pointer_v1", 2,
        arrayOf(
            msg("motion", "uff"),
            msg("motion_absolute", "uufff"),
            msg("button", "uuu"),
            msg("axis", "uuf"),
            msg("frame", ""),
            msg("axis_discrete", "uuff"),
            msg("axis_value120", "uui"),
            msg("axis_stop", "uu"),
            msg("destroy", ""),
        ),
    )
}

val virtualPointerManagerInterfaceV1: MemorySegment by lazy {
    // wire order per the wlr protocol: seat object first, then the new_id
    iface(
        "zwlr_virtual_pointer_manager_v1", 2,
        arrayOf(msg("create_virtual_pointer", "?on", null, null)),
    )
}

/** Generic array-marshal new_id request: args carry only the object slots. */
private val virtualInputMarshalArray: MethodHandle? by lazy {
    val lookup = runCatching { SymbolLookup.libraryLookup("libwayland-client.so.0", Arena.global()) }.getOrNull()
    val symbol = lookup?.find("wl_proxy_marshal_array_flags")?.orElse(null) ?: return@lazy null
    java.lang.foreign.Linker.nativeLinker().downcallHandle(
        symbol,
        FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
        ),
    )
}

/** Generic array-marshal void request. */
private val virtualInputMarshalArrayVoid: MethodHandle? by lazy {
    val lookup = runCatching { SymbolLookup.libraryLookup("libwayland-client.so.0", Arena.global()) }.getOrNull()
    val symbol = lookup?.find("wl_proxy_marshal_array_flags")?.orElse(null) ?: return@lazy null
    java.lang.foreign.Linker.nativeLinker().downcallHandle(
        symbol,
        FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
        ),
    )
}

/** Creates the virtual keyboard for [seat] through the bound manager proxy. */
fun createVirtualKeyboard(managerProxy: MemorySegment, seatProxy: MemorySegment): MemorySegment? {
    val marshal = virtualInputMarshalArray ?: return null
    val interfacePointer = virtualKeyboardManagerInterface
    return Arena.ofConfined().use { arena ->
        val args = arena.allocate(ValueLayout.ADDRESS, 2)
        args.set(ValueLayout.ADDRESS, 0, seatProxy)
        args.set(ValueLayout.ADDRESS, 8, MemorySegment.NULL)
        marshal.invoke(managerProxy, 0, interfacePointer, 1, 0, args) as MemorySegment
    }
}

/** Uploads a text keymap (the server compiles it; fd ownership transfers). */
fun virtualKeyboardKeymap(keyboardProxy: MemorySegment, format: Int, fd: Int, size: Int) {
    val marshal = virtualInputMarshalArrayVoid ?: return
    Arena.ofConfined().use { arena ->
        val args = arena.allocate(ValueLayout.ADDRESS, 3)
        args.set(ValueLayout.JAVA_INT, 0, format)
        args.set(ValueLayout.JAVA_INT, 8, fd)
        args.set(ValueLayout.JAVA_INT, 16, size)
        marshal.invoke(keyboardProxy, 0, MemorySegment.NULL, 0, 0, args)
    }
}

/** Injects one key event on the virtual keyboard. */
fun virtualKeyboardKey(keyboardProxy: MemorySegment, time: Int, key: Int, state: Int) {
    val marshal = virtualInputMarshalArrayVoid ?: return
    Arena.ofConfined().use { arena ->
        val args = arena.allocate(ValueLayout.ADDRESS, 3)
        args.set(ValueLayout.JAVA_INT, 0, time)
        args.set(ValueLayout.JAVA_INT, 8, key)
        args.set(ValueLayout.JAVA_INT, 16, state)
        marshal.invoke(keyboardProxy, 1, MemorySegment.NULL, 0, 0, args)
    }
}

/** Creates the virtual pointer for [seat] through the bound manager proxy. */
fun createVirtualPointer(managerProxy: MemorySegment, seatProxy: MemorySegment): MemorySegment? {
    val marshal = virtualInputMarshalArray ?: return null
    val interfacePointer = virtualPointerInterface
    return Arena.ofConfined().use { arena ->
        val args = arena.allocate(ValueLayout.ADDRESS, 2)
        args.set(ValueLayout.ADDRESS, 0, seatProxy)
        args.set(ValueLayout.ADDRESS, 8, MemorySegment.NULL)
        marshal.invoke(managerProxy, 0, interfacePointer, 1, 0, args) as MemorySegment
    }
}

/** Injects one absolute pointer motion into the virtual pointer. */
fun virtualPointerMotionAbsolute(
    pointerProxy: MemorySegment,
    time: Int,
    x: Double,
    y: Double,
    xExtent: Double,
    yExtent: Double,
) {
    val marshal = virtualInputMarshalArrayVoid ?: return
    Arena.ofConfined().use { arena ->
        // wl_fixed_t is int32 (24.8): doubles are encoded before the wire
        val args = arena.allocate(ValueLayout.ADDRESS, 5)
        args.set(ValueLayout.JAVA_INT, 0, time)
        args.set(ValueLayout.JAVA_INT, 8, wlFixedFromDouble(x))
        args.set(ValueLayout.JAVA_INT, 16, wlFixedFromDouble(y))
        args.set(ValueLayout.JAVA_INT, 24, wlFixedFromDouble(xExtent))
        args.set(ValueLayout.JAVA_INT, 32, wlFixedFromDouble(yExtent))
        marshal.invoke(pointerProxy, 1, MemorySegment.NULL, 0, 0, args)
    }
}

/** wl_fixed_from_double: 24.8 fixed-point encoding. */
private fun wlFixedFromDouble(value: Double): Int = (value * 256.0).toInt()

/** Injects one button event into the virtual pointer. */
fun virtualPointerButton(pointerProxy: MemorySegment, time: Int, button: Int, state: Int) {
    val marshal = virtualInputMarshalArrayVoid ?: return
    Arena.ofConfined().use { arena ->
        val args = arena.allocate(ValueLayout.ADDRESS, 3)
        args.set(ValueLayout.JAVA_INT, 0, time)
        args.set(ValueLayout.JAVA_INT, 8, button)
        args.set(ValueLayout.JAVA_INT, 16, state)
        marshal.invoke(pointerProxy, 2, MemorySegment.NULL, 0, 0, args)
    }
}

/** Terminates one virtual pointer event batch. */
fun virtualPointerFrame(pointerProxy: MemorySegment) {
    val marshal = virtualInputMarshalArrayVoid ?: return
    Arena.ofConfined().use { arena ->
        val args = arena.allocate(ValueLayout.ADDRESS, 1)
        marshal.invoke(pointerProxy, 4, MemorySegment.NULL, 0, 0, args)
    }
}

/** Injects one value120 scroll unit on the virtual pointer. */
fun virtualPointerAxisValue120(pointerProxy: MemorySegment, time: Int, axis: Int, value120: Int) {
    val marshal = virtualInputMarshalArrayVoid ?: return
    Arena.ofConfined().use { arena ->
        val args = arena.allocate(ValueLayout.ADDRESS, 3)
        args.set(ValueLayout.JAVA_INT, 0, time)
        args.set(ValueLayout.JAVA_INT, 8, axis)
        args.set(ValueLayout.JAVA_INT, 16, value120)
        marshal.invoke(pointerProxy, 6, MemorySegment.NULL, 0, 0, args)
    }
}
