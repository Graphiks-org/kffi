package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/** Checked native operations; callers execute on the live HWND's owner thread. */
public object Win32WindowOperations {
    public fun readTopmost(hwnd: Long): Boolean = GetWindowLongPtrW(live(hwnd), -20) and 8L != 0L
    public fun setTopmost(hwnd: Long, topmost: Boolean) {
        checked(SetWindowPos(live(hwnd), MemorySegment.ofAddress(if (topmost) -1 else -2), 0, 0, 0, 0, 0x213), "SetWindowPos(topmost)")
        check(readTopmost(hwnd) == topmost) { "native topmost readback differs" }
    }

    /** FlashWindowEx returns the previous caption activity, NOT a success BOOL. */
    public fun requestAttention(hwnd: Long, mode: Int) {
        require(mode in 0..2)
        val h = live(hwnd)
        Arena.ofConfined().use { arena ->
            val info = arena.allocate(32, 8)
            info.set(ValueLayout.JAVA_INT, 0, 32)
            info.set(ValueLayout.ADDRESS, 8, h)
            info.set(ValueLayout.JAVA_INT, 16, when(mode) { 0 -> 0; 1 -> 3; else -> 15 })
            info.set(ValueLayout.JAVA_INT, 20, if(mode == 2) -1 else if(mode == 1) 3 else 0)
            FlashWindowEx(info)
        }
    }

    public fun setContentProtection(hwnd: Long, enabled: Boolean): Boolean {
        checked(SetWindowDisplayAffinity(live(hwnd), if(enabled) 1 else 0), "SetWindowDisplayAffinity")
        return readContentProtection(hwnd).also { check(it == enabled) { "display affinity readback differs" } }
    }
    /** Exact WDA_MONITOR policy, not exclusion from every capture implementation. */
    public fun readContentProtection(hwnd: Long): Boolean = Arena.ofConfined().use { arena ->
        val value = arena.allocate(4, 4)
        checked(GetWindowDisplayAffinity(live(hwnd), value), "GetWindowDisplayAffinity")
        when(val raw = value.get(ValueLayout.JAVA_INT, 0)) { 0 -> false; 1 -> true; else -> error("unmapped display affinity: $raw") }
    }

    public fun setIcon(hwnd: Long, handle: Long) {
        SendMessageW(live(hwnd), 0x80, 1, handle)
        SendMessageW(live(hwnd), 0x80, 0, handle)
        check(readIcon(hwnd) == handle) { "native icon readback differs" }
    }
    public fun readIcon(hwnd: Long): Long {
        val big = SendMessageW(live(hwnd), 0x7f, 1, 0)
        val small = SendMessageW(live(hwnd), 0x7f, 0, 0)
        check(big == small) { "native icon slots disagree" }
        return big
    }
    public fun iconSlots(hwnd: Long): Set<Long> = setOf(SendMessageW(live(hwnd), 0x7f, 1, 0), SendMessageW(live(hwnd), 0x7f, 0, 0))
    public fun systemCursor(resourceId: Int): Long {
        require(resourceId in 1..65535)
        requireWin32Input()
        return LoadCursorW(MemorySegment.NULL, MemorySegment.ofAddress(resourceId.toLong())).address().also { check(it != 0L) { "LoadCursorW failed: ${GetLastError()}" } }
    }
    public fun currentCursor(): Long { requireWin32Input(); return GetCursor().address() }
    public fun setCursor(handle: Long) { requireWin32Input(); SetCursor(MemorySegment.ofAddress(handle)) }

    public fun beginMoveResize(hwnd: Long, hitTest: Int, clientX: Int, clientY: Int) {
        require(hitTest == 2 || hitTest in 10..17)
        val h = live(hwnd)
        val capture = GetCapture().address()
        check(capture == 0L || capture == hwnd) { "another window owns pointer capture" }
        Arena.ofConfined().use { arena ->
            val point = arena.allocate(8, 4)
            point.set(ValueLayout.JAVA_INT, 0, clientX); point.set(ValueLayout.JAVA_INT, 4, clientY)
            checked(ClientToScreen(h, point), "ClientToScreen")
            val x = point.get(ValueLayout.JAVA_INT, 0); val y = point.get(ValueLayout.JAVA_INT, 4)
            require(x in -32768..32767 && y in -32768..32767) { "native drag screen coordinates exceed signed words" }
            if(capture == hwnd) checked(ReleaseCapture(), "ReleaseCapture")
            SendMessageW(h, 0xA1, hitTest.toLong(), (x.toLong() and 0xffff) or ((y.toLong() and 0xffff) shl 16))
        }
    }

    /** Enters a genuine nested User32 menu loop; zero denotes cancellation. */
    public fun showSystemMenu(hwnd: Long, screenX: Int, screenY: Int): Int {
        val h = live(hwnd)
        val menu = GetSystemMenu(h, 0)
        check(menu.address() != 0L) { "window has no native system menu" }
        SetLastError(0)
        val command = TrackPopupMenu(menu, 0x102, screenX, screenY, 0, h, MemorySegment.NULL)
        val error = GetLastError()
        check(command != 0 || error == 0) { "TrackPopupMenu failed: $error" }
        if(command != 0 && IsWindow(h) != 0) PostMessageW(h, 0x112, command.toLong(), 0)
        return command
    }

    private fun live(hwnd: Long): MemorySegment { requireWin32Input(); return MemorySegment.ofAddress(hwnd).also { check(IsWindow(it) != 0) { "native window is not live" } } }
    private fun checked(result: Int, operation: String) { if(result == 0) { val error = GetLastError(); error("$operation failed: $error") } }
}
