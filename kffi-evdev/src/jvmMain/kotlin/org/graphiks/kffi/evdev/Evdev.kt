package org.graphiks.kffi.evdev

import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import org.graphiks.kffi.evdev.generated.ABS_X
import org.graphiks.kffi.evdev.generated.BTN_GAMEPAD
import org.graphiks.kffi.evdev.generated.BTN_JOYSTICK
import org.graphiks.kffi.evdev.generated.BTN_THUMBR
import org.graphiks.kffi.evdev.generated.BTN_TRIGGER_HAPPY
import org.graphiks.kffi.evdev.generated.EV_ABS
import org.graphiks.kffi.evdev.generated.EV_FF
import org.graphiks.kffi.evdev.generated.EV_KEY
import org.graphiks.kffi.evdev.generated.EV_SYN
import org.graphiks.kffi.evdev.generated.EVIOCGID
import org.graphiks.kffi.evdev.generated.EVIOCRMFF
import org.graphiks.kffi.evdev.generated.EVIOCSFF
import org.graphiks.kffi.evdev.generated.FF_RUMBLE
import org.graphiks.kffi.evdev.generated.F_GETFL
import org.graphiks.kffi.evdev.generated.F_SETFL
import org.graphiks.kffi.evdev.generated.KffiFfEffectStorage
import org.graphiks.kffi.evdev.generated.O_NONBLOCK
import org.graphiks.kffi.evdev.generated.ff_replay
import org.graphiks.kffi.evdev.generated.O_RDONLY
import org.graphiks.kffi.evdev.generated.O_RDWR
import org.graphiks.kffi.evdev.generated._IOC_DIRSHIFT
import org.graphiks.kffi.evdev.generated._IOC_NRSHIFT
import org.graphiks.kffi.evdev.generated._IOC_SIZESHIFT
import org.graphiks.kffi.evdev.generated._IOC_TYPESHIFT
import org.graphiks.kffi.evdev.generated.close
import org.graphiks.kffi.evdev.generated.fcntl
import org.graphiks.kffi.evdev.generated.input_absinfo
import org.graphiks.kffi.evdev.generated.input_event
import org.graphiks.kffi.evdev.generated.input_id
import org.graphiks.kffi.evdev.generated.ioctl
import org.graphiks.kffi.evdev.generated.open
import org.graphiks.kffi.evdev.generated.read
import org.graphiks.kffi.evdev.generated.write
import org.graphiks.kffi.evdev.generated._errno_location

/**
 * Managed layer over the kextract-generated bindings
 * (`generated/LinuxEvdev_h.kt`, regenerated through
 * `scripts/gen-kffi-evdev.sh`): the policy of the evdev service lives
 * here — which ioctls mean what, how events decode, what a gamepad is.
 *
 * Outside Linux the generated symbol lookups throw; every wrapper keeps
 * that contract as `-1`/`null` instead, and `KFFI_EVDEV_DISABLE_NATIVE=1`
 * forces it everywhere.
 */
public fun evdevNativeDisabled(): Boolean =
    System.getenv("KFFI_EVDEV_DISABLE_NATIVE") == "1" ||
        System.getProperty("kffi.evdev.disableNative") == "true"

/** Decoded struct input_id. */
public data class EvdevInputId(
    public val bustype: Int,
    public val vendor: Int,
    public val product: Int,
    public val version: Int,
)

/** Decoded struct input_absinfo. */
public data class EvdevAbsInfo(
    public val value: Int,
    public val minimum: Int,
    public val maximum: Int,
    public val fuzz: Int,
    public val flat: Int,
    public val resolution: Int,
)

/** One decoded kernel input event. */
public data class EvdevInputEvent(
    public val type: Int,
    public val code: Int,
    public val value: Int,
    public val timeMicros: Long,
)

/** Event type constants (linux/input-event-codes.h, generated). */
public object EvdevEvent {
    public val SYN: Int get() = EV_SYN()
    public val KEY: Int get() = EV_KEY()
    public val ABS: Int get() = EV_ABS()
    public val FF: Int get() = EV_FF()
    public val UINPUT: Int get() = org.graphiks.kffi.evdev.generated.EV_UINPUT()
}

/** Button bases used for gamepad detection (kernel gamepad API, generated). */
public object EvdevButton {
    public val JOYSTICK_BASE: Int get() = BTN_JOYSTICK()
    public val GAMEPAD_BASE: Int get() = BTN_GAMEPAD()
    public val GAMEPAD_END: Int get() = BTN_THUMBR()
    public val TRIGGER_HAPPY_BASE: Int get() = BTN_TRIGGER_HAPPY()
    // BTN_TRIGGER_HAPPY40 (0x2e7) closes the range; no named constant exists
    public val TRIGGER_HAPPY_END: Int get() = TRIGGER_HAPPY_BASE + 39
}

/** Force-feedback effect types (generated). */
public object EvdevFf {
    public val RUMBLE: Int get() = FF_RUMBLE()
}

public val INPUT_ID_LAYOUT: MemoryLayout get() = input_id.layout
public val INPUT_ABSINFO_LAYOUT: MemoryLayout get() = input_absinfo.layout
public val INPUT_EVENT_LAYOUT: MemoryLayout get() = input_event.layout

/** The 48-byte struct ff_effect storage (union flattened to the rumble arm). */
public val FF_EFFECT_LAYOUT: MemoryLayout get() = KffiFfEffectStorage.layout

public val EVIOCSFF: Int get() = org.graphiks.kffi.evdev.generated.EVIOCSFF().toInt()
public val EVIOCRMFF: Int get() = org.graphiks.kffi.evdev.generated.EVIOCRMFF().toInt()

// ------------------------------------------------------------------ syscalls

private inline fun <T> guarded(default: T, block: () -> T): T =
    if (evdevNativeDisabled()) default else runCatching(block).getOrDefault(default)

/** Opens an evdev node read-only, non-blocking; -1 on error. */
public fun evdevOpen(path: String): Int = guarded(-1) {
    Arena.ofConfined().use { arena ->
        open(arena.allocateFrom(path), O_RDONLY() or O_NONBLOCK(), MemorySegment.NULL)
    }
}

/** Opens a node read-write non-blocking (the uinput owner); -1 on error. */
public fun evdevOpenReadWrite(path: String): Int = guarded(-1) {
    Arena.ofConfined().use { arena ->
        open(arena.allocateFrom(path), O_RDWR() or O_NONBLOCK(), MemorySegment.NULL)
    }
}

/**
 * ioctl with an integer argument. The generated binding routes the
 * variadic slot through one address register; ints travel zero-extended,
 * matching the C unsigned promotion.
 */
public fun evdevIoctlInt(fd: Int, request: Int, arg: Int): Int = guarded(-1) {
    ioctl(fd, request.toLong(), MemorySegment.ofAddress(arg.toLong() and 0xffffffffL))
}

/** ioctl with a buffer argument — the *_into-pointer forms. */
public fun evdevIoctlPtr(fd: Int, request: Int, buffer: MemorySegment): Int = guarded(-1) {
    ioctl(fd, request.toLong(), buffer)
}

/** Reads up to buffer.byteLength bytes; -1 on error/EAGAIN. */
public fun evdevRead(fd: Int, buffer: MemorySegment): Long = guarded(-1L) {
    read(fd, buffer, buffer.byteSize())
}

/** Writes buffer.byteLength bytes (FF play/stop, uinput injection); -1 on error. */
public fun evdevWrite(fd: Int, buffer: MemorySegment): Long = guarded(-1L) {
    write(fd, buffer, buffer.byteSize())
}

public fun evdevClose(fd: Int): Int = guarded(-1) {
    close(fd)
}

/** Sets O_NONBLOCK on [fd] (the udev monitor fd); false on error. */
public fun evdevSetNonBlocking(fd: Int): Boolean = guarded(false) {
    val flags = fcntl(fd, F_GETFL(), MemorySegment.NULL)
    if (flags < 0) return@guarded false
    if (flags and O_NONBLOCK() != 0) return@guarded true
    fcntl(fd, F_SETFL(), MemorySegment.ofAddress((flags or O_NONBLOCK()).toLong())) >= 0
}

/** errno of the last failed call on this thread (0 when unknown). */
public fun evdevErrno(): Int = guarded(0) {
    _errno_location().reinterpret(4).get(ValueLayout.JAVA_INT, 0)
}

// ------------------------------------------------------------ _IOC helpers

// The variable-size ioctls are function-like macros in the uapi, which the
// generated constants cannot carry; they are recomputed from the generated
// _IOC_* bit constants exactly as the macros do.
private const val IOC_NONE = 0
private const val IOC_WRITE = 1
private const val IOC_READ = 2

private fun ioc(dir: Int, type: Char, nr: Int, size: Int): Int =
    (dir shl _IOC_DIRSHIFT()) or
        (size shl _IOC_SIZESHIFT()) or
        (type.code shl _IOC_TYPESHIFT()) or
        (nr shl _IOC_NRSHIFT())

private fun eviocgName(len: Int): Int = ioc(IOC_READ, 'E', 0x06, len)
private fun eviocgBit(ev: Int, len: Int): Int = ioc(IOC_READ, 'E', 0x20 + ev, len)
private fun eviocgAbs(abs: Int): Int = ioc(IOC_READ, 'E', 0x40 + abs, INPUT_ABSINFO_LAYOUT.byteSize().toInt())
private fun eviocgUniq(len: Int): Int = ioc(IOC_READ, 'E', 0x08, len)


/**
 * Uploads one rumble effect (EVIOCSFF) and returns the kernel-assigned
 * effect id, or -1 when the device refuses it. Magnitudes are the usual
 * 0..1 doubles scaled to the u16 range.
 */
public fun evdevUploadRumble(fd: Int, strong: Double, weak: Double, durationMillis: Int): Int {
    if (evdevNativeDisabled()) return -1
    return runCatching {
        Arena.ofConfined().use { arena ->
            val effect = KffiFfEffectStorage.allocate(arena)
            fun offset(name: String) = FF_EFFECT_LAYOUT.byteOffset(groupElement(name))
            fun magnitude(value: Double): Short =
                (value.coerceIn(0.0, 1.0) * 0xffff).toInt().coerceIn(0, 0xffff).toShort()
            effect.set(ValueLayout.JAVA_SHORT, offset("type"), EvdevFf.RUMBLE.toShort())
            effect.set(ValueLayout.JAVA_SHORT, offset("id"), (-1).toShort())
            effect.set(
                ValueLayout.JAVA_SHORT,
                offset("replay") + ff_replay.layout.byteOffset(groupElement("length")),
                durationMillis.coerceAtMost(0x7fff).toShort(),
            )
            effect.set(ValueLayout.JAVA_SHORT, offset("rumble_strong_magnitude"), magnitude(strong))
            effect.set(ValueLayout.JAVA_SHORT, offset("rumble_weak_magnitude"), magnitude(weak))
            if (evdevIoctlPtr(fd, EVIOCSFF, effect) < 0) return@use -1
            effect.get(ValueLayout.JAVA_SHORT, offset("id")).toInt()
        }
    }.getOrDefault(-1)
}

// ------------------------------------------------------------- event codec

/** Decodes whole input_events from [buffer] (0..[bytes] valid). */
public fun evdevDecodeEvents(buffer: MemorySegment, bytes: Long): List<EvdevInputEvent> {
    if (bytes <= 0) return emptyList()
    val stride = INPUT_EVENT_LAYOUT.byteSize()
    val count = (bytes / stride).toInt()
    return (0 until count).map { index ->
        val slice = buffer.asSlice(index * stride, stride)
        EvdevInputEvent(
            type = slice.get(ValueLayout.JAVA_SHORT, INPUT_EVENT_LAYOUT.byteOffset(groupElement("type"))).toInt() and 0xFFFF,
            code = slice.get(ValueLayout.JAVA_SHORT, INPUT_EVENT_LAYOUT.byteOffset(groupElement("code"))).toInt() and 0xFFFF,
            value = slice.get(ValueLayout.JAVA_INT, INPUT_EVENT_LAYOUT.byteOffset(groupElement("value"))),
            timeMicros = slice.get(ValueLayout.JAVA_LONG, 0),
        )
    }
}

/** Encodes one input_event (FF play/stop, uinput injections). */
public fun evdevEncodeEvent(arena: Arena, type: Int, code: Int, value: Int): MemorySegment {
    val segment = arena.allocate(INPUT_EVENT_LAYOUT)
    segment.set(ValueLayout.JAVA_SHORT, INPUT_EVENT_LAYOUT.byteOffset(groupElement("type")), type.toShort())
    segment.set(ValueLayout.JAVA_SHORT, INPUT_EVENT_LAYOUT.byteOffset(groupElement("code")), code.toShort())
    segment.set(ValueLayout.JAVA_INT, INPUT_EVENT_LAYOUT.byteOffset(groupElement("value")), value)
    return segment
}

// ------------------------------------------------------------------ probes

/** Reads the device identity (EVIOCGID). */
public fun evdevGetId(fd: Int): EvdevInputId? = guarded(null) {
    Arena.ofConfined().use { arena ->
        val buffer = arena.allocate(INPUT_ID_LAYOUT)
        if (evdevIoctlPtr(fd, EVIOCGID().toInt(), buffer) < 0) return@guarded null
        fun field(name: String) = buffer.get(ValueLayout.JAVA_SHORT, INPUT_ID_LAYOUT.byteOffset(groupElement(name))).toInt() and 0xFFFF
        EvdevInputId(
            bustype = field("bustype"),
            vendor = field("vendor"),
            product = field("product"),
            version = field("version"),
        )
    }
}

/** Reads the device name (EVIOCGNAME). */
public fun evdevGetName(fd: Int): String? = guarded(null) {
    Arena.ofConfined().use { arena ->
        val buffer = arena.allocate(256)
        if (evdevIoctlPtr(fd, eviocgName(256), buffer) < 0) return@guarded null
        val length = (0 until 256).firstOrNull { buffer.get(ValueLayout.JAVA_BYTE, it.toLong()) == 0.toByte() } ?: return@guarded null
        if (length == 0) return@guarded ""
        buffer.getString(0).take(length)
    }
}

/** Reads the serial (EVIOCGUNIQ) — empty when the device has none. */
public fun evdevGetUniq(fd: Int): String = guarded("") {
    Arena.ofConfined().use { arena ->
        val buffer = arena.allocate(256)
        if (evdevIoctlPtr(fd, eviocgUniq(256), buffer) < 0) return@guarded ""
        buffer.getString(0)
    }
}

/** Reads one capability bitset (EVIOCGBIT(ev, len)) — [bytes] sized. */
public fun evdevGetBits(fd: Int, ev: Int, bytes: Int): ByteArray? = guarded(null) {
    Arena.ofConfined().use { arena ->
        val buffer = arena.allocate(bytes.toLong())
        if (evdevIoctlPtr(fd, eviocgBit(ev, bytes), buffer) < 0) return@guarded null
        buffer.toArray(ValueLayout.JAVA_BYTE)
    }
}

/** Reads one abs axis info (EVIOCGABS(abs)). */
public fun evdevGetAbs(fd: Int, abs: Int): EvdevAbsInfo? = guarded(null) {
    Arena.ofConfined().use { arena ->
        val buffer = arena.allocate(INPUT_ABSINFO_LAYOUT)
        if (evdevIoctlPtr(fd, eviocgAbs(abs), buffer) < 0) return@guarded null
        fun field(name: String) = buffer.get(ValueLayout.JAVA_INT, INPUT_ABSINFO_LAYOUT.byteOffset(groupElement(name)))
        EvdevAbsInfo(
            value = field("value"),
            minimum = field("minimum"),
            maximum = field("maximum"),
            fuzz = field("fuzz"),
            flat = field("flat"),
            resolution = field("resolution"),
        )
    }
}

/** True when the KEY bitset carries any gamepad/joystick button. */
public fun evdevBitsetHasGamepadButton(keyBits: ByteArray): Boolean {
    fun bit(code: Int): Boolean {
        val index = code / 8
        if (index < 0 || index >= keyBits.size) return false
        return (keyBits[index].toInt() and (1 shl (code % 8))) != 0
    }
    for (code in EvdevButton.GAMEPAD_BASE..EvdevButton.GAMEPAD_END) {
        if (bit(code)) return true
    }
    for (code in EvdevButton.TRIGGER_HAPPY_BASE..EvdevButton.TRIGGER_HAPPY_END) {
        if (bit(code)) return true
    }
    // legacy joystick range: same detection kernel-side (joydev)
    if (bit(EvdevButton.JOYSTICK_BASE)) return true
    return false
}
