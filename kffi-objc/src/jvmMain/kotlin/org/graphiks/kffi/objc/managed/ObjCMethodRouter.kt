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
import org.graphiks.kffi.engine.JvmManagedObjCBridge
import org.graphiks.kffi.engine.JvmManagedObjCObjectRangeResult
import org.graphiks.kffi.engine.JvmManagedObjCPoint
import org.graphiks.kffi.engine.JvmManagedObjCRange
import org.graphiks.kffi.engine.JvmManagedObjCRoute
import org.graphiks.kffi.engine.JvmManagedObjCRectRangeResult
import org.graphiks.kffi.objc.NSEvent
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSRange
import org.graphiks.kffi.objc.NSRect
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.MemorySegment
import java.util.concurrent.atomic.AtomicReference

/** Nominal object return plus the value to write to an Objective-C NSRange out parameter. */
data class ObjCObjectRangeResult(
    val value: NSObject?,
    val actualRange: NSRange,
)

/** Nominal rect return plus the value to write to an Objective-C NSRange out parameter. */
data class ObjCRectRangeResult(
    val value: NSRect,
    val actualRange: NSRange,
)

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

    fun onVoidObjectRange(
        selector: String,
        handler: (NSObject, NSRange) -> Unit,
    ) {
        bind(selector, ObjCMethodSignatures.VoidObjectRange, VoidObjectRangeBinding(handler))
    }

    fun onVoidObjectRangeRange(
        selector: String,
        handler: (NSObject, NSRange, NSRange) -> Unit,
    ) {
        bind(
            selector,
            ObjCMethodSignatures.VoidObjectRangeRange,
            VoidObjectRangeRangeBinding(handler),
        )
    }

    fun onRange(
        selector: String,
        fallback: NSRange,
        handler: () -> NSRange,
    ) {
        bind(selector, ObjCMethodSignatures.Range, RangeBinding(fallback, handler))
    }

    fun onObjectRangeOutRange(
        selector: String,
        fallback: ObjCObjectRangeResult,
        handler: (NSRange) -> ObjCObjectRangeResult,
    ) {
        bind(
            selector,
            ObjCMethodSignatures.ObjectRangeOutRange,
            ObjectRangeOutRangeBinding(fallback, handler),
        )
    }

    fun onRectRangeOutRange(
        selector: String,
        fallback: ObjCRectRangeResult,
        handler: (NSRange) -> ObjCRectRangeResult,
    ) {
        bind(
            selector,
            ObjCMethodSignatures.RectRangeOutRange,
            RectRangeOutRangeBinding(fallback, handler),
        )
    }

    fun onULongPoint(
        selector: String,
        fallback: Long,
        handler: (NSPoint) -> Long,
    ) {
        bind(selector, ObjCMethodSignatures.ULongPoint, ULongPointBinding(fallback, handler))
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

    internal fun invokeVoidObjectRange(
        command: Long,
        argument: Long,
        range: JvmManagedObjCRange,
    ) {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? VoidObjectRangeBinding ?: return
        binding.handler(NSObject(segment(argument)), range.toNSRange())
    }

    internal fun invokeVoidObjectRangeRange(
        command: Long,
        argument: Long,
        firstRange: JvmManagedObjCRange,
        secondRange: JvmManagedObjCRange,
    ) {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? VoidObjectRangeRangeBinding ?: return
        binding.handler(
            NSObject(segment(argument)),
            firstRange.toNSRange(),
            secondRange.toNSRange(),
        )
    }

    internal fun invokeRange(command: Long): NSRange {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? RangeBinding ?: return NSRange(0L, 0L)
        return binding.handler()
    }

    internal fun invokeObjectRangeOutRange(
        command: Long,
        range: JvmManagedObjCRange,
    ): ObjCObjectRangeResult {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? ObjectRangeOutRangeBinding
            ?: return ObjCObjectRangeResult(null, NSRange(0L, 0L))
        return binding.handler(range.toNSRange())
    }

    internal fun invokeRectRangeOutRange(
        command: Long,
        range: JvmManagedObjCRange,
    ): ObjCRectRangeResult {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? RectRangeOutRangeBinding
            ?: return ObjCRectRangeResult(
                ObjCMethodSignatures.RectRangeOutRange.abiZero,
                NSRange(0L, 0L),
            )
        return binding.handler(range.toNSRange())
    }

    internal fun invokeULongPoint(command: Long, point: JvmManagedObjCPoint): Long {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? ULongPointBinding ?: return 0L
        return binding.handler(NSPoint(point.x, point.y))
    }

    internal fun booleanFallback(command: Long): Boolean =
        (bindings[command] as? BooleanObjectBinding)?.fallback ?: false

    internal fun noArgumentBooleanFallback(command: Long): Boolean =
        (bindings[command] as? BooleanBinding)?.fallback ?: false

    internal fun uLongFallback(command: Long): Long =
        (bindings[command] as? ULongObjectBinding)?.fallback ?: 0L

    internal fun rangeFallback(command: Long): NSRange =
        (bindings[command] as? RangeBinding)?.fallback ?: NSRange(0L, 0L)

    internal fun objectRangeFallback(command: Long): ObjCObjectRangeResult =
        (bindings[command] as? ObjectRangeOutRangeBinding)?.fallback
            ?: ObjCObjectRangeResult(null, NSRange(0L, 0L))

    internal fun rectRangeFallback(command: Long): ObjCRectRangeResult =
        (bindings[command] as? RectRangeOutRangeBinding)?.fallback
            ?: ObjCRectRangeResult(
                ObjCMethodSignatures.RectRangeOutRange.abiZero,
                NSRange(0L, 0L),
            )

    internal fun uLongPointFallback(command: Long): Long =
        (bindings[command] as? ULongPointBinding)?.fallback ?: 0L

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

private class VoidObjectRangeBinding(
    val handler: (NSObject, NSRange) -> Unit,
) : ObjCMethodBinding

private class VoidObjectRangeRangeBinding(
    val handler: (NSObject, NSRange, NSRange) -> Unit,
) : ObjCMethodBinding

private class RangeBinding(
    val fallback: NSRange,
    val handler: () -> NSRange,
) : ObjCMethodBinding

private class ObjectRangeOutRangeBinding(
    val fallback: ObjCObjectRangeResult,
    val handler: (NSRange) -> ObjCObjectRangeResult,
) : ObjCMethodBinding

private class RectRangeOutRangeBinding(
    val fallback: ObjCRectRangeResult,
    val handler: (NSRange) -> ObjCRectRangeResult,
) : ObjCMethodBinding

private class ULongPointBinding(
    val fallback: Long,
    val handler: (NSPoint) -> Long,
) : ObjCMethodBinding

private fun JvmManagedObjCRange.toNSRange(): NSRange = NSRange(location, length)

/** Admission marker; the quiescence-revoked native route owns the router and its handlers. */
internal class ManagedObjCCallback : Callback

internal object ObjCMethodDispatch {
    val loaderGeneration: Long = JvmManagedObjCBridge.allocateLoaderGeneration()

    val callbackType = CallbackType<ManagedObjCCallback>(
        canonicalId = "objc-managed-instance-$loaderGeneration",
        hasRoutingUserdata = true,
    )

    internal data class NativeRoute(
        val token: NativeAddress,
        val router: ObjCMethodRouter,
        val onError: CallbackExceptionHandler,
    ) : JvmManagedObjCRoute {
        override fun dispatchVoidObject(self: Long, command: Long, argument: Long) {
            ObjCManagedTrampolines.dispatchVoidObject(this, command, argument)
        }

        override fun dispatchBooleanObject(self: Long, command: Long, argument: Long): Boolean =
            ObjCManagedTrampolines.dispatchBooleanObject(this, command, argument)

        override fun dispatchBoolean(self: Long, command: Long): Boolean =
            ObjCManagedTrampolines.dispatchBooleanNoArgument(this, command)

        override fun dispatchVoid(self: Long, command: Long) {
            ObjCManagedTrampolines.dispatchVoid(this, command)
        }

        override fun dispatchULongObject(self: Long, command: Long, argument: Long): Long =
            ObjCManagedTrampolines.dispatchULongObject(this, command, argument)

        override fun dispatchVoidObjectRange(
            self: Long,
            command: Long,
            argument: Long,
            range: JvmManagedObjCRange,
        ) {
            ObjCManagedTrampolines.dispatchVoidObjectRange(this, command, argument, range)
        }

        override fun dispatchVoidObjectRangeRange(
            self: Long,
            command: Long,
            argument: Long,
            firstRange: JvmManagedObjCRange,
            secondRange: JvmManagedObjCRange,
        ) {
            ObjCManagedTrampolines.dispatchVoidObjectRangeRange(
                this,
                command,
                argument,
                firstRange,
                secondRange,
            )
        }

        override fun dispatchRange(self: Long, command: Long): JvmManagedObjCRange =
            ObjCManagedTrampolines.dispatchRange(this, command)

        override fun dispatchObjectRangeOutRange(
            self: Long,
            command: Long,
            range: JvmManagedObjCRange,
        ): JvmManagedObjCObjectRangeResult =
            ObjCManagedTrampolines.dispatchObjectRangeOutRange(this, command, range)

        override fun dispatchRectRangeOutRange(
            self: Long,
            command: Long,
            range: JvmManagedObjCRange,
        ): JvmManagedObjCRectRangeResult =
            ObjCManagedTrampolines.dispatchRectRangeOutRange(this, command, range)

        override fun dispatchULongPoint(
            self: Long,
            command: Long,
            point: JvmManagedObjCPoint,
        ): Long = ObjCManagedTrampolines.dispatchULongPoint(this, command, point)
    }

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
        return JvmManagedObjCBridge.install(receiver.address(), route)
    }

    fun dispatchVoidObject(
        boundary: ObjCNativeBoundary<Unit>,
        route: NativeRoute,
        command: Long,
        argument: Long,
    ) {
        acquireRoute(boundary, route)
        beforeCallbackAdmissionForTest.get()?.invoke()
        CallbackRuntime.dispatchSafely(callbackType, route.token) {
            route.router.invokeVoidObject(command, argument)
        }
    }

    fun dispatchBooleanObject(
        boundary: ObjCNativeBoundary<Boolean>,
        route: NativeRoute,
        command: Long,
        argument: Long,
    ): Boolean {
        acquireRoute(boundary, route)
        val fallback = route.router.booleanFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) {
            admitted = true
            route.router.invokeBooleanObject(command, argument)
        }
        return if (admitted) result else ObjCMethodSignatures.BooleanObject.abiZero
    }

    fun dispatchBooleanNoArgument(
        boundary: ObjCNativeBoundary<Boolean>,
        route: NativeRoute,
        command: Long,
    ): Boolean {
        acquireRoute(boundary, route)
        val fallback = route.router.noArgumentBooleanFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) {
            admitted = true
            route.router.invokeBoolean(command)
        }
        return if (admitted) result else ObjCMethodSignatures.Boolean.abiZero
    }

    fun dispatchVoid(boundary: ObjCNativeBoundary<Unit>, route: NativeRoute, command: Long) {
        acquireRoute(boundary, route)
        beforeCallbackAdmissionForTest.get()?.invoke()
        CallbackRuntime.dispatchSafely(callbackType, route.token) {
            route.router.invokeVoid(command)
        }
    }

    fun dispatchULongObject(
        boundary: ObjCNativeBoundary<Long>,
        route: NativeRoute,
        command: Long,
        argument: Long,
    ): Long {
        acquireRoute(boundary, route)
        val fallback = route.router.uLongFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) {
            admitted = true
            route.router.invokeULongObject(command, argument)
        }
        return if (admitted) result else ObjCMethodSignatures.ULongObject.abiZero
    }

    fun dispatchVoidObjectRange(
        boundary: ObjCNativeBoundary<Unit>,
        route: NativeRoute,
        command: Long,
        argument: Long,
        range: JvmManagedObjCRange,
    ) {
        acquireRoute(boundary, route)
        beforeCallbackAdmissionForTest.get()?.invoke()
        CallbackRuntime.dispatchSafely(callbackType, route.token) {
            route.router.invokeVoidObjectRange(command, argument, range)
        }
    }

    fun dispatchVoidObjectRangeRange(
        boundary: ObjCNativeBoundary<Unit>,
        route: NativeRoute,
        command: Long,
        argument: Long,
        firstRange: JvmManagedObjCRange,
        secondRange: JvmManagedObjCRange,
    ) {
        acquireRoute(boundary, route)
        beforeCallbackAdmissionForTest.get()?.invoke()
        CallbackRuntime.dispatchSafely(callbackType, route.token) {
            route.router.invokeVoidObjectRangeRange(
                command,
                argument,
                firstRange,
                secondRange,
            )
        }
    }

    fun dispatchRange(
        boundary: ObjCNativeBoundary<NSRange>,
        route: NativeRoute,
        command: Long,
    ): NSRange {
        acquireRoute(boundary, route)
        val fallback = route.router.rangeFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) {
            admitted = true
            route.router.invokeRange(command)
        }
        return if (admitted) result else ObjCMethodSignatures.Range.abiZero
    }

    fun dispatchObjectRangeOutRange(
        boundary: ObjCNativeBoundary<ObjCObjectRangeResult>,
        route: NativeRoute,
        command: Long,
        range: JvmManagedObjCRange,
    ): ObjCObjectRangeResult {
        acquireRoute(boundary, route)
        val fallback = route.router.objectRangeFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) {
            admitted = true
            route.router.invokeObjectRangeOutRange(command, range)
        }
        return if (admitted) {
            result
        } else {
            ObjCObjectRangeResult(ObjCMethodSignatures.ObjectRangeOutRange.abiZero, NSRange(0L, 0L))
        }
    }

    fun dispatchRectRangeOutRange(
        boundary: ObjCNativeBoundary<ObjCRectRangeResult>,
        route: NativeRoute,
        command: Long,
        range: JvmManagedObjCRange,
    ): ObjCRectRangeResult {
        acquireRoute(boundary, route)
        val fallback = route.router.rectRangeFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) {
            admitted = true
            route.router.invokeRectRangeOutRange(command, range)
        }
        return if (admitted) {
            result
        } else {
            ObjCRectRangeResult(
                ObjCMethodSignatures.RectRangeOutRange.abiZero,
                NSRange(0L, 0L),
            )
        }
    }

    fun dispatchULongPoint(
        boundary: ObjCNativeBoundary<Long>,
        route: NativeRoute,
        command: Long,
        point: JvmManagedObjCPoint,
    ): Long {
        acquireRoute(boundary, route)
        val fallback = route.router.uLongPointFallback(command)
        boundary.fallback = fallback
        beforeCallbackAdmissionForTest.get()?.invoke()
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) {
            admitted = true
            route.router.invokeULongPoint(command, point)
        }
        return if (admitted) result else ObjCMethodSignatures.ULongPoint.abiZero
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

    private fun <R> acquireRoute(boundary: ObjCNativeBoundary<R>, route: NativeRoute) {
        beforeRouteLookupForTest.get()?.invoke()
        boundary.onError = route.onError
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
