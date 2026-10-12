@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.engine.JvmUpcallEngine
import java.util.concurrent.atomic.AtomicReference

/**
 * Loader-neutral route invoked by the process-lifetime Win32 WndProc
 * trampoline. The native WNDPROC ABI carries exactly four arguments
 * (HWND, UINT, WPARAM, LPARAM) — no userdata travels through the native
 * call, so this bridge owns ONE live route and the token routing happens
 * inside the route closure.
 */
@CallbackRuntimeApi
public fun interface Win32WndProcRoute {
    public fun dispatchWndProc(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long
}

/**
 * Parent-loader owner for the Win32 WndProc trampoline, mirroring
 * `JvmManagedCFunctionBridge`. The trampoline is process-lifetime; the single
 * live route is installed by its registration and removed at quiescence.
 */
@CallbackRuntimeApi
public object Win32WndProcBridge {
    private val route = AtomicReference<Win32WndProcRoute?>(null)

    public val wndProc: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = Win32WndProcBridge::class.java,
            dispatchMethod = "dispatchWndProc",
            dispatchSig = "(JIJJ)J",
        )
    }

    /** Installs the single live route; a second live install is rejected. */
    public fun install(newRoute: Win32WndProcRoute): AutoCloseable {
        check(route.compareAndSet(null, newRoute)) {
            "A Win32 WndProc route is already installed"
        }
        return AutoCloseable { route.compareAndSet(newRoute, null) }
    }

    @JvmStatic
    public fun dispatchWndProc(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long =
        contain(0L) { route.get()?.dispatchWndProc(hwnd, message, wParam, lParam) ?: 0L }

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
