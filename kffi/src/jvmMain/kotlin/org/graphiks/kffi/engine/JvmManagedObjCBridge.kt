@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.engine

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.NativeAddress
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong

/** Loader-neutral route invoked by process-lifetime managed Objective-C IMPs. */
@CallbackRuntimeApi
interface JvmManagedObjCRoute {
    fun dispatchVoidObject(self: Long, command: Long, argument: Long)

    fun dispatchBooleanObject(self: Long, command: Long, argument: Long): Boolean

    fun dispatchBoolean(self: Long, command: Long): Boolean

    fun dispatchVoid(self: Long, command: Long)

    fun dispatchULongObject(self: Long, command: Long, argument: Long): Long
}

/**
 * Parent-loader bridge for managed Objective-C classes.
 *
 * Native classes retain these IMPs for the process lifetime. A route may belong to an isolated
 * child loader, but it remains in this bridge only until its callback registration is quiescent.
 */
@CallbackRuntimeApi
object JvmManagedObjCBridge {
    private val lastLoaderGeneration = AtomicLong(0L)
    private val routes = ConcurrentHashMap<Long, JvmManagedObjCRoute>()

    val voidObject: NativeAddress by lazy { allocate("dispatchVoidObject", "(JJJ)V") }
    val booleanObject: NativeAddress by lazy { allocate("dispatchBooleanObject", "(JJJ)Z") }
    val boolean: NativeAddress by lazy { allocate("dispatchBoolean", "(JJ)Z") }
    val void: NativeAddress by lazy { allocate("dispatchVoid", "(JJ)V") }
    val uLongObject: NativeAddress by lazy { allocate("dispatchULongObject", "(JJJ)J") }

    fun allocateLoaderGeneration(): Long {
        val generation = lastLoaderGeneration.incrementAndGet()
        check(generation > 0L) { "Managed Objective-C loader generation space exhausted" }
        return generation
    }

    fun install(receiver: Long, route: JvmManagedObjCRoute): AutoCloseable {
        require(receiver != 0L) { "Managed Objective-C receiver address must not be null" }
        check(routes.putIfAbsent(receiver, route) == null) {
            "A managed Objective-C route already exists for receiver $receiver"
        }
        return AutoCloseable { routes.remove(receiver, route) }
    }

    @JvmStatic
    fun dispatchVoidObject(self: Long, command: Long, argument: Long) {
        contain(Unit) { routes[self]?.dispatchVoidObject(self, command, argument) }
    }

    @JvmStatic
    fun dispatchBooleanObject(self: Long, command: Long, argument: Long): Boolean =
        contain(false) { routes[self]?.dispatchBooleanObject(self, command, argument) ?: false }

    @JvmStatic
    fun dispatchBoolean(self: Long, command: Long): Boolean =
        contain(false) { routes[self]?.dispatchBoolean(self, command) ?: false }

    @JvmStatic
    fun dispatchVoid(self: Long, command: Long) {
        contain(Unit) { routes[self]?.dispatchVoid(self, command) }
    }

    @JvmStatic
    fun dispatchULongObject(self: Long, command: Long, argument: Long): Long =
        contain(0L) { routes[self]?.dispatchULongObject(self, command, argument) ?: 0L }

    private fun allocate(method: String, signature: String): NativeAddress =
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = JvmManagedObjCBridge::class.java,
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
