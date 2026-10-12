@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.Callback
import org.graphiks.kffi.CallbackPolicy
import org.graphiks.kffi.CallbackRegistration
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackType
import org.graphiks.kffi.NativeAddress
import java.util.concurrent.atomic.AtomicReference
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

public fun interface Win32WndProcHandler {
    /** Receives a copied, scalar-only window message. Never suspends, never throws across FFI. */
    public fun onMessage(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long
}

/** Revocable owner for one managed WNDPROC registration. Close is idempotent. */
public interface Win32WndProcFunction : AutoCloseable {
    public val callback: NativeAddress
    public val isQuiescent: Boolean
    public fun onQuiescent(action: () -> Unit)
}

/** Closed managed Win32 callback factories. */
public object Win32ManagedFunctions {
    public fun wndProc(handler: Win32WndProcHandler): Win32WndProcFunction {
        val registration = CallbackRuntime.register(
            type = WndProcCallback.type,
            trampoline = Win32WndProcBridge.wndProc,
            policy = CallbackPolicy.REPEATING,
            callback = WndProcCallback(handler),
        )
        val token = requireNotNull(registration.userdata) {
            "Win32 WndProc registration did not allocate routing userdata"
        }
        val state = WndProcState(registration)
        try {
            state.attach(
                Win32WndProcBridge.install(token.rawValue) { hwnd, message, wParam, lParam ->
                    CallbackRuntime.dispatchSafely(
                        WndProcCallback.type,
                        token,
                        0L,
                    ) { callback -> callback.handler.onMessage(hwnd, message, wParam, lParam) }
                },
            )
            registration.onQuiescent(state::detach)
            return WndProcOwner(state, token)
        } catch (failure: Throwable) {
            try {
                registration.close()
            } catch (closeFailure: Throwable) {
                failure.addSuppressed(closeFailure)
            }
            throw failure
        }
    }
}

private class WndProcCallback(
    val handler: Win32WndProcHandler,
) : Callback {
    companion object {
        val type = CallbackType<WndProcCallback>(
            canonicalId = "win32-managed-wndproc",
            hasRoutingUserdata = true,
        )
    }
}

private class WndProcState(
    registration: CallbackRegistration<out Callback>,
) {
    private val registration = AtomicReference<CallbackRegistration<out Callback>?>(registration)
    private val nativeRoute = AtomicReference<AutoCloseable?>(null)

    @Volatile
    var isQuiescent: Boolean = false
        private set

    fun attach(route: AutoCloseable) {
        check(nativeRoute.compareAndSet(null, route)) { "Win32 WndProc route is already attached" }
    }

    fun close() {
        registration.get()?.close()
    }

    fun onQuiescent(action: () -> Unit) {
        val activeRegistration = registration.get()
        if (activeRegistration == null) action() else activeRegistration.onQuiescent(action)
    }

    fun detach() {
        try {
            nativeRoute.getAndSet(null)?.close()
        } finally {
            registration.set(null)
            isQuiescent = true
        }
    }
}

private class WndProcOwner(
    private val state: WndProcState,
    private val token: NativeAddress,
) : Win32WndProcFunction {
    private val closeLock = ReentrantLock()

    override val callback: NativeAddress
        get() = Win32WndProcBridge.wndProc
    override val isQuiescent: Boolean
        get() = state.isQuiescent

    override fun onQuiescent(action: () -> Unit) = state.onQuiescent(action)

    internal fun route(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long =
        Win32WndProcBridge.dispatchWndProc(hwnd, message, wParam, lParam, token.rawValue)

    override fun close() {
        closeLock.withLock { state.close() }
    }
}

internal fun Win32WndProcFunction.routeForTest(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long =
    (this as WndProcOwner).route(hwnd, message, wParam, lParam)
