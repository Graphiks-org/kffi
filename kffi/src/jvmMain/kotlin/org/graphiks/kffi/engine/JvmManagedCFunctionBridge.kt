@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.engine

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.NativeAddress
import java.util.concurrent.ConcurrentHashMap

/** Loader-neutral route invoked by process-lifetime managed C function trampolines. */
@CallbackRuntimeApi
interface JvmManagedCFunctionRoute {
    fun dispatchEventTap(type: Int, event: Long): Long

    fun dispatchDisplayReconfiguration(display: Int, flags: Int)

    fun dispatchHidDeviceLifecycle(registryId: Long, connected: Boolean)
}

/**
 * Parent-loader owner for managed C function trampolines.
 *
 * Upcall stubs target only this bridge. Child-loader routes remain installed until their callback
 * registration reaches quiescence, then removal releases the final parent-to-child reference.
 */
@CallbackRuntimeApi
object JvmManagedCFunctionBridge {
    private val routes = ConcurrentHashMap<Long, JvmManagedCFunctionRoute>()

    val eventTap: NativeAddress by lazy { allocate("dispatchEventTap", "(JIJJ)J") }
    val displayReconfiguration: NativeAddress by lazy {
        allocate("dispatchDisplayReconfiguration", "(IIJ)V")
    }
    val hidConnected: NativeAddress by lazy { allocate("dispatchHidConnected", "(JJ)V") }
    val hidDisconnected: NativeAddress by lazy { allocate("dispatchHidDisconnected", "(JJ)V") }

    fun install(userdata: Long, route: JvmManagedCFunctionRoute): AutoCloseable {
        require(userdata != 0L) { "Managed C function userdata must not be null" }
        check(routes.putIfAbsent(userdata, route) == null) {
            "A managed C function route already exists for userdata $userdata"
        }
        return AutoCloseable { routes.remove(userdata, route) }
    }

    @JvmStatic
    fun dispatchEventTap(proxy: Long, type: Int, event: Long, userdata: Long): Long =
        contain(0L) { routes[userdata]?.dispatchEventTap(type, event) ?: 0L }

    @JvmStatic
    fun dispatchDisplayReconfiguration(display: Int, flags: Int, userdata: Long) {
        contain(Unit) { routes[userdata]?.dispatchDisplayReconfiguration(display, flags) }
    }

    @JvmStatic
    fun dispatchHidConnected(registryId: Long, userdata: Long) {
        contain(Unit) {
            routes[userdata]?.dispatchHidDeviceLifecycle(registryId, connected = true)
        }
    }

    @JvmStatic
    fun dispatchHidDisconnected(registryId: Long, userdata: Long) {
        contain(Unit) {
            routes[userdata]?.dispatchHidDeviceLifecycle(registryId, connected = false)
        }
    }

    private fun allocate(method: String, signature: String): NativeAddress =
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = JvmManagedCFunctionBridge::class.java,
            dispatchMethod = method,
            dispatchSig = signature,
        )

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
