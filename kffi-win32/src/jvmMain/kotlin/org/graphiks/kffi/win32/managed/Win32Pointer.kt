package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.GetLastError
import org.graphiks.kffi.win32.generated.ScreenToClient
import org.graphiks.kffi.win32.generated.ClientToScreen
import org.graphiks.kffi.win32.generated.SystemParametersInfoW
import org.graphiks.kffi.win32.generated.TrackMouseEvent
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

public data class Win32Point(public val x: Int, public val y: Int)

/** null denotes WHEEL_PAGESCROLL; zero is an explicitly disabled axis. */
public data class Win32WheelSettings(
    public val verticalLines: Long?,
    public val horizontalCharacters: Long?,
)

/** The only owner of the native TRACKMOUSEEVENT and POINT buffers used for input. */
public object Win32Pointer {
    public fun trackLeave(hwnd: Long) { track(hwnd, 0x2) }
    public fun cancelLeave(hwnd: Long) { track(hwnd, 0x80000002.toInt()) }

    private fun track(hwnd: Long, flags: Int) {
        requireWin32Input()
        Arena.ofConfined().use { arena ->
            // Win64: DWORD cbSize, DWORD flags, HWND, DWORD hoverTime, padding.
            val event = arena.allocate(24, 8)
            event.set(ValueLayout.JAVA_INT, 0, 24)
            event.set(ValueLayout.JAVA_INT, 4, flags)
            event.set(ValueLayout.ADDRESS, 8, MemorySegment.ofAddress(hwnd))
            check(TrackMouseEvent(event) != 0) { "TrackMouseEvent failed for $hwnd: ${GetLastError()}" }
        }
    }

    public fun screenToClient(hwnd: Long, x: Int, y: Int): Win32Point {
        requireWin32Input()
        return Arena.ofConfined().use { arena ->
            val point = arena.allocate(8, 4)
            point.set(ValueLayout.JAVA_INT, 0, x)
            point.set(ValueLayout.JAVA_INT, 4, y)
            check(ScreenToClient(MemorySegment.ofAddress(hwnd), point) != 0) {
                "ScreenToClient failed for $hwnd: ${GetLastError()}"
            }
            Win32Point(point.get(ValueLayout.JAVA_INT, 0), point.get(ValueLayout.JAVA_INT, 4))
        }
    }

    public fun clientToScreen(hwnd: Long, x: Int, y: Int): Win32Point {
        requireWin32Input()
        return Arena.ofConfined().use { arena ->
            val point = arena.allocate(8, 4)
            point.set(ValueLayout.JAVA_INT, 0, x)
            point.set(ValueLayout.JAVA_INT, 4, y)
            check(ClientToScreen(MemorySegment.ofAddress(hwnd), point) != 0) {
                "ClientToScreen failed: ${GetLastError()}"
            }
            Win32Point(point.get(ValueLayout.JAVA_INT, 0), point.get(ValueLayout.JAVA_INT, 4))
        }
    }

    public fun wheelSettings(): Win32WheelSettings {
        requireWin32Input()
        fun read(action: Int): Long? = Arena.ofConfined().use { arena ->
            val value = arena.allocate(4, 4)
            check(SystemParametersInfoW(action, 0, value, 0) != 0) {
                "SystemParametersInfoW($action) failed: ${GetLastError()}"
            }
            val raw = value.get(ValueLayout.JAVA_INT, 0)
            if (raw == -1) null else raw.toLong() and 0xffffffffL
        }
        return Win32WheelSettings(read(0x68), read(0x6c))
    }
}
