@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.engine.JvmUpcallEngine
import java.util.concurrent.ConcurrentHashMap

/** Loader-neutral route invoked by the process-lifetime Win32 WndProc trampoline. */
@CallbackRuntimeApi
public fun interface Win32WndProcRoute {
    public fun dispatchWndProc(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long
}

/**
 * Parent-loader owner for the Win32 WndProc trampoline, mirroring
 * `JvmManagedCFunctionBridge`. The trampoline is process-lifetime; per-userdata
 * routes are installed and removed with quiescence by their registrations.
 */
@CallbackRuntimeApi
public object Win32WndProcBridge {
    private val routes = ConcurrentHashMap<Long, Win32WndProcRoute>()

    public val wndProc: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = Win32WndProcBridge::class.java,
            dispatchMethod = "dispatchWndProc",
            dispatchSig = "(JJIJJ)J",
        )
    }

    public fun install(userdata: Long, route: Win32WndProcRoute): AutoCloseable {
        require(userdata != 0L) { "Win32 WndProc userdata must not be null" }
        check(routes.putIfAbsent(userdata, route) == null) {
            "A Win32 WndProc route already exists for userdata $userdata"
        }
        return AutoCloseable { routes.remove(userdata, route) }
    }

    @JvmStatic
    public fun dispatchWndProc(hwnd: Long, message: Int, wParam: Long, lParam: Long, userdata: Long): Long =
        contain(0L) { routes[userdata]?.dispatchWndProc(hwnd, message, wParam, lParam) ?: 0L }

    private inline fun <R> contain(fallback: R, block: () -> R): R = try {
        block()
    } catch (failure: Throwable) {
        try {
            CallbackRuntime.reportUnroutedFailure(failure)
        } catch (_: Throwable) {
            // Last-resort native boundary: reporting must never escape.
        }
        fallback
    }
}
