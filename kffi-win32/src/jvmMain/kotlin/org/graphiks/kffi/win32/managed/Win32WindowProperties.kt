package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/** Copied physical coordinates. Windows RECT uses signed 32-bit LONG on Win64. */
public data class Win32WindowRect(public val x: Int, public val y: Int, public val width: Int, public val height: Int)
public data class Win32WindowSize(public val width: Int, public val height: Int)
public data class Win32WindowSnapshot(
    public val title: String,
    public val outer: Win32WindowRect,
    public val clientWidth: Int,
    public val clientHeight: Int,
    public val style: Int,
    public val extendedStyle: Int,
    public val dpi: Int,
    public val visible: Boolean,
    public val minimized: Boolean,
    public val maximized: Boolean,
)

/** Owner-thread operations. Native buffers are confined to each call; no borrowed pointer escapes. */
public object Win32WindowProperties {
    public fun read(hwnd: Long): Win32WindowSnapshot {
        val h = live(hwnd)
        return Arena.ofConfined().use { arena ->
            val outer = arena.allocate(16, 4)
            checked(GetWindowRect(h, outer), "GetWindowRect")
            val client = arena.allocate(16, 4)
            checked(GetClientRect(h, client), "GetClientRect")
            SetLastError(0)
            val length = GetWindowTextLengthW(h)
            val lengthError = GetLastError()
            check(length != 0 || lengthError == 0) { "GetWindowTextLengthW failed: $lengthError" }
            check(length in 0..1_048_576) { "Window title exceeds bounded readback" }
            val text = arena.allocate((length + 1L) * 2, 2)
            SetLastError(0)
            val count = GetWindowTextW(h, text, length + 1)
            val textError = GetLastError()
            check(count != 0 || textError == 0) { "GetWindowTextW failed: $textError" }
            val title = CharArray(count) { text.get(ValueLayout.JAVA_CHAR, it * 2L) }.concatToString()
            val dpi = GetDpiForWindow(h)
            check(dpi > 0) { "GetDpiForWindow returned zero" }
            Win32WindowSnapshot(title, decodeRect(outer),
                extent(client.get(ValueLayout.JAVA_INT, 0), client.get(ValueLayout.JAVA_INT, 8)),
                extent(client.get(ValueLayout.JAVA_INT, 4), client.get(ValueLayout.JAVA_INT, 12)),
                readStyle(h, -16), readStyle(h, -20), dpi, IsWindowVisible(h) != 0, IsIconic(h) != 0, IsZoomed(h) != 0)
        }
    }

    public fun setTitle(hwnd: Long, title: String) {
        require('\u0000' !in title) { "title contains NUL" }
        val h = live(hwnd)
        Arena.ofConfined().use { arena ->
            val text = arena.allocate((title.length + 1L) * 2, 2)
            title.forEachIndexed { i, c -> text.set(ValueLayout.JAVA_CHAR, i * 2L, c) }
            text.set(ValueLayout.JAVA_CHAR, title.length * 2L, '\u0000')
            checked(SetWindowTextW(h, text), "SetWindowTextW")
        }
    }

    public fun setStyle(hwnd: Long, style: Int) {
        val h = live(hwnd)
        SetLastError(0)
        val previous = SetWindowLongPtrW(h, -16, style.toLong() and 0xffffffffL)
        val error = GetLastError()
        check(previous != 0L || error == 0) { "SetWindowLongPtrW failed: $error" }
    }

    public fun setBounds(hwnd: Long, x: Int? = null, y: Int? = null, width: Int? = null, height: Int? = null, frameChanged: Boolean = false) {
        require((x == null) == (y == null)) { "position needs both coordinates" }
        require((width == null) == (height == null)) { "size needs both dimensions" }
        require(width == null || width > 0 && height!! > 0) { "size must be positive" }
        val h = live(hwnd)
        val flags = 0x4 or 0x10 or 0x200 or (if (x == null) 0x2 else 0) or
            (if (width == null) 0x1 else 0) or (if (frameChanged) 0x20 else 0)
        checked(SetWindowPos(h, MemorySegment.NULL, x ?: 0, y ?: 0, width ?: 0, height ?: 0, flags), "SetWindowPos")
    }

    /** Converts a positive physical client size using the actual style and per-window DPI. */
    public fun outerSize(hwnd: Long, width: Int, height: Int): Win32WindowSize =
        outerSize(hwnd, width, height, readStyle(live(hwnd), -16))

    /** Preflights a target style at the current window DPI without changing native styles. */
    public fun outerSize(hwnd: Long, width: Int, height: Int, style: Int): Win32WindowSize {
        require(width > 0 && height > 0) { "client size must be positive" }
        val h = live(hwnd)
        return Arena.ofConfined().use { arena ->
            val rect = arena.allocate(16, 4)
            rect.set(ValueLayout.JAVA_INT, 8, width)
            rect.set(ValueLayout.JAVA_INT, 12, height)
            val dpi = GetDpiForWindow(h)
            check(dpi > 0) { "GetDpiForWindow returned zero" }
            checked(AdjustWindowRectExForDpi(rect, style, 0, readStyle(h, -20), dpi), "AdjustWindowRectExForDpi")
            val outer = decodeRect(rect)
            require(outer.width > 0 && outer.height > 0) { "outer size overflows Windows LONG" }
            Win32WindowSize(outer.width, outer.height)
        }
    }

    public fun monitorBounds(hwnd: Long): Win32WindowRect {
        val h = live(hwnd)
        val monitor = MonitorFromWindow(h, 2) // MONITOR_DEFAULTTONEAREST
        check(monitor.address() != 0L) { "MonitorFromWindow returned null" }
        return Arena.ofConfined().use { arena ->
            val info = arena.allocate(40, 4) // MONITORINFO: cbSize + two RECTs + flags
            info.set(ValueLayout.JAVA_INT, 0, 40)
            checked(GetMonitorInfoW(monitor, info), "GetMonitorInfoW")
            decodeRect(info.asSlice(4, 16))
        }
    }

    /** Invoke only during WM_GETMINMAXINFO after DefWindowProcW, before returning to Windows. */
    public fun applyTrackLimits(hwnd: Long, lParam: Long, minWidth: Int? = null, minHeight: Int? = null, maxWidth: Int? = null, maxHeight: Int? = null) {
        require(lParam != 0L) { "MINMAXINFO pointer is null" }
        require((minWidth == null) == (minHeight == null) && (maxWidth == null) == (maxHeight == null))
        live(hwnd)
        val minimum = minWidth?.let { outerSize(hwnd, it, minHeight!!) }
        val maximum = maxWidth?.let { outerSize(hwnd, it, maxHeight!!) }
        val info = MemorySegment.ofAddress(lParam).reinterpret(40)
        minimum?.let { info.set(ValueLayout.JAVA_INT, 24, it.width); info.set(ValueLayout.JAVA_INT, 28, it.height) }
        maximum?.let { info.set(ValueLayout.JAVA_INT, 32, it.width); info.set(ValueLayout.JAVA_INT, 36, it.height) }
    }

    private fun live(hwnd: Long): MemorySegment {
        check(System.getProperty("os.name").startsWith("Windows")) { "Win32 windows require Windows" }
        init()
        return MemorySegment.ofAddress(hwnd).also { check(IsWindow(it) != 0) { "native window is not live" } }
    }
    private fun checked(result: Int, operation: String) {
        if (result == 0) { val error = GetLastError(); error("$operation failed: $error") }
    }
    private fun readStyle(h: MemorySegment, index: Int): Int {
        SetLastError(0)
        val value = GetWindowLongPtrW(h, index)
        val error = GetLastError()
        check(value != 0L || error == 0) { "GetWindowLongPtrW failed: $error" }
        return value.toInt()
    }
    internal fun decodeRect(rect: MemorySegment): Win32WindowRect = Win32WindowRect(
        rect.get(ValueLayout.JAVA_INT, 0), rect.get(ValueLayout.JAVA_INT, 4),
        extent(rect.get(ValueLayout.JAVA_INT, 0), rect.get(ValueLayout.JAVA_INT, 8)),
        extent(rect.get(ValueLayout.JAVA_INT, 4), rect.get(ValueLayout.JAVA_INT, 12)))
    private fun extent(start: Int, end: Int): Int {
        val difference = end.toLong() - start
        require(difference in 0..Int.MAX_VALUE.toLong()) { "RECT extent overflows Windows LONG" }
        return difference.toInt()
    }
}
