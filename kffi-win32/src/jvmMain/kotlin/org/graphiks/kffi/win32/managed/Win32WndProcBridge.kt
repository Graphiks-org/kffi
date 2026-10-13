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
 * `JvmManagedCFunctionBridge`.
 *
 * Window messages reach the trampoline on the owning thread. Routing solves
 * the WM_NCCREATE chicken-and-egg: messages dispatched while a creation is
 * in flight on this thread route through that thread's [beginCreation] slot;
 * afterwards the permanent hwnd table routes. Entries are removed before the
 * native window is destroyed, so a reused address never reaches an old owner.
 */
@CallbackRuntimeApi
public object Win32WndProcBridge {
    private val routes = ConcurrentHashMap<Long, Win32WndProcRoute>()
    private val creationSlots = ThreadLocal.withInitial { arrayOfNulls<Win32WndProcRoute>(1) }

    public val wndProc: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = Win32WndProcBridge::class.java,
            dispatchMethod = "dispatchWndProc",
            dispatchSig = "(JIJJ)J",
        )
    }

    /**
     * Routes messages arriving while this thread is inside `CreateWindowExW`
     * to [route]. The returned handle ends the slot; nesting is one level.
     */
    public fun beginCreation(route: Win32WndProcRoute): AutoCloseable {
        val slot = creationSlots.get()
        check(slot[0] == null) { "A Win32 window creation is already in flight on this thread" }
        slot[0] = route
        return AutoCloseable { slot[0] = null }
    }

    /** Binds [hwnd] to [route] permanently until the returned handle is closed. */
    public fun registerRoute(hwnd: Long, route: Win32WndProcRoute): AutoCloseable {
        check(routes.putIfAbsent(hwnd, route) == null) {
            "A Win32 WndProc route is already registered for hwnd $hwnd"
        }
        return AutoCloseable { routes.remove(hwnd, route) }
    }

    @JvmStatic
    public fun dispatchWndProc(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long =
        contain(0L) {
            creationSlots.get()[0]?.dispatchWndProc(hwnd, message, wParam, lParam)
                ?: routes[hwnd]?.dispatchWndProc(hwnd, message, wParam, lParam)
                ?: 0L
        }

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
