package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/** One owned HICON or HCURSOR. Never close while a live window still references it. */
public class Win32OwnedImage private constructor(public val handle: Long, private val cursor: Boolean) : AutoCloseable {
    private var closed = false
    public companion object {
        public fun icon(width: Int, height: Int, rgba: ByteArray): Win32OwnedImage = create(width, height, rgba, false, 0, 0)
        public fun cursor(width: Int, height: Int, rgba: ByteArray, hotspotX: Int, hotspotY: Int): Win32OwnedImage =
            create(width, height, rgba, true, hotspotX, hotspotY)

        private fun create(width: Int, height: Int, rgba: ByteArray, cursor: Boolean, x: Int, y: Int): Win32OwnedImage {
            val maximum = if(cursor) 128 else 256
            require(width in 1..maximum && height in 1..maximum) { "image exceeds native bounds" }
            require(rgba.size.toLong() == width.toLong() * height * 4) { "RGBA8 byte count differs" }
            require(!cursor || x in 0 until width && y in 0 until height) { "cursor hotspot is outside image" }
            requireWin32Input()
            return Arena.ofConfined().use { arena ->
                val header = arena.allocate(40, 4) // BITMAPINFOHEADER, top-down BGRA DIB
                header.set(ValueLayout.JAVA_INT, 0, 40); header.set(ValueLayout.JAVA_INT, 4, width)
                header.set(ValueLayout.JAVA_INT, 8, -height)
                header.set(ValueLayout.JAVA_SHORT, 12, 1); header.set(ValueLayout.JAVA_SHORT, 14, 32)
                val bits = arena.allocate(ValueLayout.ADDRESS)
                val color = CreateDIBSection(MemorySegment.NULL, header, 0, bits, MemorySegment.NULL, 0)
                check(color.address() != 0L) { "CreateDIBSection failed: ${GetLastError()}" }
                var mask = MemorySegment.NULL
                try {
                    val pixels = bits.get(ValueLayout.ADDRESS, 0).reinterpret(rgba.size.toLong())
                    for(i in rgba.indices step 4) {
                        val alpha = rgba[i + 3].toInt() and 255
                        fun premultiply(index: Int): Byte = (((rgba[index].toInt() and 255) * alpha + 127) / 255).toByte()
                        pixels.set(ValueLayout.JAVA_BYTE, i.toLong(), premultiply(i + 2))
                        pixels.set(ValueLayout.JAVA_BYTE, i + 1L, premultiply(i + 1))
                        pixels.set(ValueLayout.JAVA_BYTE, i + 2L, premultiply(i))
                        pixels.set(ValueLayout.JAVA_BYTE, i + 3L, alpha.toByte())
                    }
                    val maskBits = arena.allocate(((width + 15) / 16 * 2L) * height, 2)
                    mask = CreateBitmap(width, height, 1, 1, maskBits)
                    check(mask.address() != 0L) { "CreateBitmap failed: ${GetLastError()}" }
                    val info = arena.allocate(32, 8) // ICONINFO Win64
                    info.set(ValueLayout.JAVA_INT, 0, if(cursor) 0 else 1)
                    info.set(ValueLayout.JAVA_INT, 4, x); info.set(ValueLayout.JAVA_INT, 8, y)
                    info.set(ValueLayout.ADDRESS, 16, mask); info.set(ValueLayout.ADDRESS, 24, color)
                    val handle = CreateIconIndirect(info).address()
                    check(handle != 0L) { "CreateIconIndirect failed: ${GetLastError()}" }
                    Win32OwnedImage(handle, cursor)
                } finally { if(mask.address() != 0L) DeleteObject(mask); DeleteObject(color) }
            }
        }
    }
    override fun close() {
        if(closed) return
        if(cursor && Win32WindowOperations.currentCursor() == handle) Win32WindowOperations.setCursor(Win32WindowOperations.systemCursor(32512))
        val ok = if(cursor) DestroyCursor(MemorySegment.ofAddress(handle)) else DestroyIcon(MemorySegment.ofAddress(handle))
        check(ok != 0) { "native image release failed: ${GetLastError()}" }
        closed = true
    }
}
