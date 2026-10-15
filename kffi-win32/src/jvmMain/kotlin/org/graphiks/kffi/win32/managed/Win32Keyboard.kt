package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.GetKeyboardLayout
import org.graphiks.kffi.win32.generated.GetKeyboardState
import org.graphiks.kffi.win32.generated.GetLastError
import org.graphiks.kffi.win32.generated.MapVirtualKeyExW
import org.graphiks.kffi.win32.generated.ToUnicodeEx
import org.graphiks.kffi.win32.generated.init
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/** Scalar copy of the documented key-message bits; no keyboard layout is assumed. */
public data class Win32KeyPacket(
    public val virtualKey: Int,
    public val scanCode: Int,
    public val extended: Boolean,
    public val pressed: Boolean,
    public val repeat: Boolean,
    public val repeatCount: Int,
    public val altContext: Boolean,
) {
    public companion object {
        public fun decode(virtualKey: Int, lParam: Long): Win32KeyPacket? {
            val count = (lParam and 0xffff).toInt()
            if (virtualKey !in 0..255 || count == 0) return null
            val pressed = lParam and 0x80000000L == 0L
            return Win32KeyPacket(
                virtualKey, ((lParam ushr 16) and 0xff).toInt(),
                lParam and 0x01000000L != 0L, pressed,
                pressed && lParam and 0x40000000L != 0L, count,
                lParam and 0x20000000L != 0L,
            )
        }
    }
}

/** A dead key is identified without turning its spacing accent into committed text. */
public data class Win32KeyTranslation(public val characters: String?, public val deadKey: Boolean)

/** A copied observation. [layoutId] is an identifier, never an owned native resource. */
public data class Win32KeyboardSnapshot(
    public val packet: Win32KeyPacket,
    public val layoutId: Long,
    public val translation: Win32KeyTranslation,
    public val shift: Boolean,
    public val control: Boolean,
    public val alt: Boolean,
    public val meta: Boolean,
    public val capsLock: Boolean,
    public val numLock: Boolean,
)

internal fun translatedKey(count: Int, units: CharArray): Win32KeyTranslation = when {
    count < 0 -> Win32KeyTranslation(null, true)
    count == 0 -> Win32KeyTranslation(null, false)
    else -> {
        check(count <= units.size) { "ToUnicodeEx returned more UTF-16 units than its buffer" }
        Win32KeyTranslation(units.concatToString(0, count), false)
    }
}

/** Windows input reads with confined native buffers and no keyboard-state mutation. */
public object Win32Keyboard {
    /** Call on the queue's thread, before TranslateMessage for this packet. */
    public fun read(virtualKey: Int, lParam: Long): Win32KeyboardSnapshot? {
        val packet = Win32KeyPacket.decode(virtualKey, lParam) ?: return null
        requireWin32Input()
        val layout = GetKeyboardLayout(0)
        check(layout.address() != 0L) { "GetKeyboardLayout failed: ${GetLastError()}" }
        val keys = Arena.ofConfined().use { arena ->
            val buffer = arena.allocate(256)
            check(GetKeyboardState(buffer) != 0) { "GetKeyboardState failed: ${GetLastError()}" }
            buffer.toArray(ValueLayout.JAVA_BYTE)
        }
        // Preserve all toggle bits. Reconcile only this packet's make/break;
        // posted test messages do not change the thread's native key state.
        val side = if (virtualKey in listOf(0x10, 0x11, 0x12) && packet.scanCode != 0) {
            MapVirtualKeyExW(packet.scanCode or if (packet.extended) 0xe000 else 0, 3, layout)
                .takeIf { it in 1..255 } ?: virtualKey
        } else virtualKey
        fun down(vk: Int): Boolean = keys[vk].toInt() and 0x80 != 0
        fun setDown(vk: Int, value: Boolean) {
            keys[vk] = ((keys[vk].toInt() and 0x7f) or if (value) 0x80 else 0).toByte()
        }
        setDown(side, packet.pressed)
        when (side) {
            0xa0, 0xa1 -> setDown(0x10, down(0xa0) || down(0xa1))
            0xa2, 0xa3 -> setDown(0x11, down(0xa2) || down(0xa3))
            0xa4, 0xa5 -> setDown(0x12, down(0xa4) || down(0xa5))
        }
        val translation = if (packet.pressed) {
            translate(virtualKey, packet.scanCode, keys, layout.address())
        } else Win32KeyTranslation(null, false)
        return Win32KeyboardSnapshot(
            packet, layout.address(), translation,
            down(0x10), down(0x11), down(0x12), down(0x5b) || down(0x5c),
            keys[0x14].toInt() and 1 != 0, keys[0x90].toInt() and 1 != 0,
        )
    }

    /** Copies [keyState]; bit 2 of ToUnicodeEx leaves the kernel dead-key buffer unchanged. */
    public fun translate(
        virtualKey: Int,
        scanCode: Int,
        keyState: ByteArray,
        layoutId: Long,
    ): Win32KeyTranslation {
        require(virtualKey in 0..255 && scanCode in 0..255)
        require(keyState.size == 256) { "a Win32 keyboard state has 256 entries" }
        require(layoutId != 0L) { "a keyboard layout is required" }
        requireWin32Input()
        fun translateCopy(state: ByteArray): Win32KeyTranslation = Arena.ofConfined().use { arena ->
            val keys = arena.allocate(256)
            MemorySegment.copy(MemorySegment.ofArray(state), 0, keys, 0, 256)
            val output = arena.allocate(64, 2)
            val count = ToUnicodeEx(
                virtualKey, scanCode, keys, output, 32, 4, MemorySegment.ofAddress(layoutId),
            )
            translatedKey(count, output.toArray(ValueLayout.JAVA_CHAR))
        }
        val initial = translateCopy(keyState)
        // Ctrl+A is the logical letter A, not a U+0001 text commit. Printable
        // AltGr output wins and is never retried with its modifiers stripped.
        if (initial.characters?.all { it.isISOControl() } == true) {
            val neutral = keyState.copyOf()
            for (vk in intArrayOf(0x11, 0x12, 0xa2, 0xa3, 0xa4, 0xa5)) neutral[vk] = 0
            return translateCopy(neutral)
        }
        return initial
    }
}

internal fun requireWin32Input() {
    check(System.getProperty("os.name").startsWith("Windows")) { "Win32 input requires Windows" }
    init()
}
