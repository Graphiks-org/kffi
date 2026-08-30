@file:OptIn(
    org.graphiks.kffi.CallbackRuntimeApi::class,
    org.graphiks.kffi.objc.PlatformAvailability::class,
)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.Callback
import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.CallbackRegistration
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackType
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.objc.NSEvent
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.MemorySegment
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicReference

/** Typed per-instance bindings for a registered managed Objective-C class. */
class ObjCMethodRouter internal constructor(
    private val declaredMethods: Map<String, ObjCMethodSignature<*>>,
) {
    private val bindings = mutableMapOf<Long, ObjCMethodBinding>()
    private var frozen = false

    /**
     * Binds [selector] to [handler]. The [NSObject] argument is borrowed and is valid only for the
     * dynamic extent of the handler call. Do not retain or use it after the handler returns unless
     * explicit strong ownership is acquired before returning.
     */
    fun onVoidObject(selector: String, handler: (NSObject) -> Unit) {
        bind(selector, ObjCMethodSignatures.VoidObject, VoidObjectBinding(handler))
    }

    /**
     * Binds an AppKit event selector to [handler].
     *
     * The borrowed native [NSEvent] is copied into [NSEventObservation] before [handler] runs, so
     * the handler may retain the observation after the Objective-C callback has returned.
     */
    fun onNSEvent(selector: String, handler: (NSEventObservation) -> Unit) {
        bind(selector, ObjCMethodSignatures.VoidObject, NSEventBinding(handler))
    }

    /**
     * Binds [selector] to [handler]. The [NSObject] argument is borrowed and is valid only for the
     * dynamic extent of the handler call. Do not retain or use it after the handler returns unless
     * explicit strong ownership is acquired before returning.
     */
    fun onBooleanObject(
        selector: String,
        fallback: Boolean,
        handler: (NSObject) -> Boolean,
    ) {
        bind(
            selector,
            ObjCMethodSignatures.BooleanObject,
            BooleanObjectBinding(fallback, handler),
        )
    }

    fun onBoolean(
        selector: String,
        fallback: Boolean,
        handler: () -> Boolean,
    ) {
        bind(selector, ObjCMethodSignatures.Boolean, BooleanBinding(fallback, handler))
    }

    fun onVoid(selector: String, handler: () -> Unit) {
        bind(selector, ObjCMethodSignatures.Void, VoidBinding(handler))
    }

    /**
     * Binds [selector] to [handler]. The [NSObject] argument is borrowed and is valid only for the
     * dynamic extent of the handler call. Do not retain or use it after the handler returns unless
     * explicit strong ownership is acquired before returning.
     */
    fun onULongObject(
        selector: String,
        fallback: Long,
        handler: (NSObject) -> Long,
    ) {
        bind(
            selector,
            ObjCMethodSignatures.ULongObject,
            ULongObjectBinding(fallback, handler),
        )
    }

    internal fun freeze() {
        val boundSelectors = bindings.keys
        val missing = declaredMethods.keys.filter { ObjCRuntime.sel(it).address() !in boundSelectors }
        require(missing.isEmpty()) {
            "Missing managed Objective-C bindings: ${missing.sorted().joinToString()}"
        }
        frozen = true
    }

    internal fun invokeVoidObject(command: Long, argument: Long) {
        check(frozen) { "Managed Objective-C router is not frozen" }
        when (val binding = bindings[command]) {
            is VoidObjectBinding -> binding.handler(NSObject(segment(argument)))
            is NSEventBinding -> {
                require(argument != 0L) { "Managed NSEvent callback received a nil event" }
                binding.handler(NSEventObservation.from(NSEvent(segment(argument))))
            }

            else -> Unit
        }
    }

    internal fun invokeBooleanObject(command: Long, argument: Long): Boolean {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? BooleanObjectBinding ?: return false
        return binding.handler(NSObject(segment(argument)))
    }

    internal fun invokeBoolean(command: Long): Boolean {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? BooleanBinding ?: return false
        return binding.handler()
    }

    internal fun invokeVoid(command: Long) {
        check(frozen) { "Managed Objective-C router is not frozen" }
        (bindings[command] as? VoidBinding)?.handler?.invoke()
    }

    internal fun invokeULongObject(command: Long, argument: Long): Long {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? ULongObjectBinding ?: return 0L
        return binding.handler(NSObject(segment(argument)))
    }

    internal fun booleanFallback(command: Long): Boolean =
        (bindings[command] as? BooleanObjectBinding)?.fallback ?: false

    internal fun noArgumentBooleanFallback(command: Long): Boolean =
        (bindings[command] as? BooleanBinding)?.fallback ?: false

    internal fun uLongFallback(command: Long): Long =
        (bindings[command] as? ULongObjectBinding)?.fallback ?: 0L

    private fun bind(
        selector: String,
        expectedSignature: ObjCMethodSignature<*>,
        binding: ObjCMethodBinding,
    ) {
        check(!frozen) { "Managed Objective-C router is already frozen" }
        val declaredSignature = requireNotNull(declaredMethods[selector]) {
            "Selector '$selector' was not declared by this managed Objective-C class"
        }
        require(declaredSignature.identity == expectedSignature.identity) {
            "Selector '$selector' uses '${declaredSignature.identity}', not '${expectedSignature.identity}'"
        }
        val selectorAddress = ObjCRuntime.sel(selector).address()
        require(bindings.putIfAbsent(selectorAddress, binding) == null) {
            "Selector '$selector' was bound more than once"
        }
    }

    private fun segment(address: Long): MemorySegment =
        if (address == 0L) MemorySegment.NULL else MemorySegment.ofAddress(address)
}

private sealed interface ObjCMethodBinding

private class VoidObjectBinding(
    val handler: (NSObject) -> Unit,
) : ObjCMethodBinding

private class NSEventBinding(
    val handler: (NSEventObservation) -> Unit,
) : ObjCMethodBinding

private class BooleanObjectBinding(
    val fallback: Boolean,
    val handler: (NSObject) -> Boolean,
) : ObjCMethodBinding

private class BooleanBinding(
    val fallback: Boolean,
    val handler: () -> Boolean,
) : ObjCMethodBinding

private class VoidBinding(
    val handler: () -> Unit,
) : ObjCMethodBinding

private class ULongObjectBinding(
    val fallback: Long,
    val handler: (NSObject) -> Long,
) : ObjCMethodBinding

internal class ManagedObjCCallback(
    val router: ObjCMethodRouter,
) : Callback

internal object ObjCMethodDispatch {
    val callbackType = CallbackType<ManagedObjCCallback>(
        canonicalId = "objc-managed-instance",
        hasRoutingUserdata = true,
    )

    private data class NativeRoute(
        val token: NativeAddress,
        val router: ObjCMethodRouter,
        val onError: CallbackExceptionHandler,
    )

    private val nativeRoutes = ConcurrentHashMap<Long, NativeRoute>()
    private val beforeRouteLookupForTest = AtomicReference<(() -> Unit)?>(null)
    private val beforeCallbackAdmissionForTest = AtomicReference<(() -> Unit)?>(null)

    fun install(
        receiver: MemorySegment,
        registration: CallbackRegistration<ManagedObjCCallback>,
        router: ObjCMethodRouter,
        onError: CallbackExceptionHandler,
    ): AutoCloseable {
        val token = requireNotNull(registration.userdata) {
            "Managed Objective-C callback registration did not allocate routing userdata"
        }
        val route = NativeRoute(token, router, onError)
        check(nativeRoutes.putIfAbsent(receiver.address(), route) == null) {
            "A managed Objective-C route already exists for receiver ${receiver.address()}"
        }
        return AutoCloseable { nativeRoutes.remove(receiver.address(), route) }
    }

    fun dispatchVoidObject(
        boundary: ObjCNativeBoundary<Unit>,
        self: Long,
        command: Long,
        argument: Long,
    ) {
        val route = acquireRoute(boundary, self) ?: return
        beforeCallbackAdmissionForTest.get()?.invoke()
        CallbackRuntime.dispatchSafely(callbackType, route.token) { callback ->
            callback.router.invokeVoidObject(command, argument)
        }
    }

    fun dispatchBooleanObject(
        boundary: ObjCNativeBoundary<Boolean>,
        self: Long,
        command: Long,
        argument: Long,
    ): Boolean {
        val route = acquireRoute(boundary, self) ?: return boundary.fallback
        val fallback = route.router.booleanFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) { callback ->
            admitted = true
            callback.router.invokeBooleanObject(command, argument)
        }
        return if (admitted) result else ObjCMethodSignatures.BooleanObject.abiZero
    }

    fun dispatchBooleanNoArgument(
        boundary: ObjCNativeBoundary<Boolean>,
        self: Long,
        command: Long,
    ): Boolean {
        val route = acquireRoute(boundary, self) ?: return boundary.fallback
        val fallback = route.router.noArgumentBooleanFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) { callback ->
            admitted = true
            callback.router.invokeBoolean(command)
        }
        return if (admitted) result else ObjCMethodSignatures.Boolean.abiZero
    }

    fun dispatchVoid(boundary: ObjCNativeBoundary<Unit>, self: Long, command: Long) {
        val route = acquireRoute(boundary, self) ?: return
        beforeCallbackAdmissionForTest.get()?.invoke()
        CallbackRuntime.dispatchSafely(callbackType, route.token) { callback ->
            callback.router.invokeVoid(command)
        }
    }

    fun dispatchULongObject(
        boundary: ObjCNativeBoundary<Long>,
        self: Long,
        command: Long,
        argument: Long,
    ): Long {
        val route = acquireRoute(boundary, self) ?: return boundary.fallback
        val fallback = route.router.uLongFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) { callback ->
            admitted = true
            callback.router.invokeULongObject(command, argument)
        }
        return if (admitted) result else ObjCMethodSignatures.ULongObject.abiZero
    }

    fun installBeforeRouteLookupForTest(action: () -> Unit): AutoCloseable =
        installTestHook(beforeRouteLookupForTest, action, "route lookup")

    fun installBeforeCallbackAdmissionForTest(action: () -> Unit): AutoCloseable =
        installTestHook(beforeCallbackAdmissionForTest, action, "callback admission")

    fun <R> containUnrouted(failure: Throwable, fallback: R): R {
        reportUnroutedSafely(failure)
        return fallback
    }

    fun reportUnroutedSafely(failure: Throwable) {
        try {
            CallbackRuntime.reportUnroutedFailure(failure)
        } catch (_: Throwable) {
            // Last-resort native boundary: reporting must never escape.
        }
    }

    private fun <R> acquireRoute(boundary: ObjCNativeBoundary<R>, self: Long): NativeRoute? {
        beforeRouteLookupForTest.get()?.invoke()
        val route = nativeRoutes[self] ?: return null
        boundary.onError = route.onError
        return route
    }

    private fun installTestHook(
        target: AtomicReference<(() -> Unit)?>,
        action: () -> Unit,
        stage: String,
    ): AutoCloseable {
        check(target.compareAndSet(null, action)) {
            "Managed Objective-C $stage test hook is already installed"
        }
        return AutoCloseable {
            check(target.compareAndSet(action, null)) {
                "Managed Objective-C $stage test hook changed before close"
            }
        }
    }
}

internal class ObjCNativeBoundary<R>(
    initialFallback: R,
) {
    var fallback: R = initialFallback
    var onError: CallbackExceptionHandler? = null

    fun contain(failure: Throwable): R {
        try {
            val reporter = onError
            if (reporter == null) {
                ObjCMethodDispatch.reportUnroutedSafely(failure)
            } else {
                try {
                    reporter.onException(failure)
                } catch (reporterFailure: Throwable) {
                    ObjCMethodDispatch.reportUnroutedSafely(
                        ObjCNativeBoundaryReportingFailure(failure, reporterFailure),
                    )
                }
            }
        } catch (reportingFailure: Throwable) {
            ObjCMethodDispatch.reportUnroutedSafely(reportingFailure)
        }
        return fallback
    }
}

private class ObjCNativeBoundaryReportingFailure(
    callbackFailure: Throwable,
    reporterFailure: Throwable,
) : RuntimeException("Managed Objective-C callback and reporter both failed", callbackFailure) {
    init {
        addSuppressed(reporterFailure)
    }
}
