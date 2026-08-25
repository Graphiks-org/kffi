@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.Callback
import org.graphiks.kffi.CallbackRegistration
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackType
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.MemorySegment
import java.util.concurrent.ConcurrentHashMap

/** Typed per-instance bindings for a registered managed Objective-C class. */
class ObjCMethodRouter internal constructor(
    private val declaredMethods: Map<String, ObjCMethodSignature<*>>,
) {
    private val bindings = mutableMapOf<Long, ObjCMethodBinding>()
    private var frozen = false

    fun onVoidObject(selector: String, handler: (NSObject) -> Unit) {
        bind(selector, ObjCMethodSignatures.VoidObject, VoidObjectBinding(handler))
    }

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

    fun onVoid(selector: String, handler: () -> Unit) {
        bind(selector, ObjCMethodSignatures.Void, VoidBinding(handler))
    }

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
        (bindings[command] as? VoidObjectBinding)?.handler(NSObject(segment(argument)))
    }

    internal fun invokeBooleanObject(command: Long, argument: Long): Boolean {
        check(frozen) { "Managed Objective-C router is not frozen" }
        val binding = bindings[command] as? BooleanObjectBinding ?: return false
        return binding.handler(NSObject(segment(argument)))
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

private class BooleanObjectBinding(
    val fallback: Boolean,
    val handler: (NSObject) -> Boolean,
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
    )

    private val nativeRoutes = ConcurrentHashMap<Long, NativeRoute>()

    fun install(
        receiver: MemorySegment,
        registration: CallbackRegistration<ManagedObjCCallback>,
        router: ObjCMethodRouter,
    ): AutoCloseable {
        val token = requireNotNull(registration.userdata) {
            "Managed Objective-C callback registration did not allocate routing userdata"
        }
        val route = NativeRoute(token, router)
        check(nativeRoutes.putIfAbsent(receiver.address(), route) == null) {
            "A managed Objective-C route already exists for receiver ${receiver.address()}"
        }
        return AutoCloseable { nativeRoutes.remove(receiver.address(), route) }
    }

    fun dispatchVoidObject(self: Long, command: Long, argument: Long) {
        val route = nativeRoutes[self] ?: return
        CallbackRuntime.dispatchSafely(callbackType, route.token) { callback ->
            callback.router.invokeVoidObject(command, argument)
        }
    }

    fun dispatchBooleanObject(self: Long, command: Long, argument: Long): Boolean {
        val abiZero = ObjCMethodSignatures.BooleanObject.abiZero
        val route = nativeRoutes[self] ?: return abiZero
        val fallback = route.router.booleanFallback(command)
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) { callback ->
            admitted = true
            callback.router.invokeBooleanObject(command, argument)
        }
        return if (admitted) result else abiZero
    }

    fun dispatchVoid(self: Long, command: Long) {
        val route = nativeRoutes[self] ?: return
        CallbackRuntime.dispatchSafely(callbackType, route.token) { callback ->
            callback.router.invokeVoid(command)
        }
    }

    fun dispatchULongObject(self: Long, command: Long, argument: Long): Long {
        val abiZero = ObjCMethodSignatures.ULongObject.abiZero
        val route = nativeRoutes[self] ?: return abiZero
        val fallback = route.router.uLongFallback(command)
        var admitted = false
        val result = CallbackRuntime.dispatchSafely(callbackType, route.token, fallback) { callback ->
            admitted = true
            callback.router.invokeULongObject(command, argument)
        }
        return if (admitted) result else abiZero
    }
}
