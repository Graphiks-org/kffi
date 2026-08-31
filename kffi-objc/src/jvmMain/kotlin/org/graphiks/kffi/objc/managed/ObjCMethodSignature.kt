@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.engine.JvmManagedObjCBridge
import org.graphiks.kffi.objc.ObjCRuntime

/** One finite Objective-C method ABI shape supported by the managed bridge. */
class ObjCMethodSignature<R> internal constructor(
    val identity: String,
    val typeEncoding: String,
    internal val trampoline: NativeAddress,
    internal val abiZero: R,
)

/** Scalar Objective-C method shapes needed by lifecycle and window delegates. */
object ObjCMethodSignatures {
    val VoidObject: ObjCMethodSignature<Unit> = ObjCMethodSignature(
        identity = "void-object",
        typeEncoding = "v@:@",
        trampoline = JvmManagedObjCBridge.voidObject,
        abiZero = Unit,
    )

    val BooleanObject: ObjCMethodSignature<Boolean> = ObjCMethodSignature(
        identity = "boolean-object",
        typeEncoding = booleanObjectEncoding(),
        trampoline = JvmManagedObjCBridge.booleanObject,
        abiZero = false,
    )

    val Boolean: ObjCMethodSignature<Boolean> = ObjCMethodSignature(
        identity = "boolean",
        typeEncoding = booleanNoArgumentEncoding(),
        trampoline = JvmManagedObjCBridge.boolean,
        abiZero = false,
    )

    val Void: ObjCMethodSignature<Unit> = ObjCMethodSignature(
        identity = "void",
        typeEncoding = "v@:",
        trampoline = JvmManagedObjCBridge.void,
        abiZero = Unit,
    )

    val ULongObject: ObjCMethodSignature<Long> = ObjCMethodSignature(
        identity = "ulong-object",
        typeEncoding = "Q@:@",
        trampoline = JvmManagedObjCBridge.uLongObject,
        abiZero = 0L,
    )

    private fun booleanObjectEncoding(): String = when (System.getProperty("os.arch")) {
        "aarch64", "arm64" -> "B@:@"
        "amd64", "x86_64" -> "c@:@"
        else -> error("Unsupported Objective-C host architecture: ${System.getProperty("os.arch")}")
    }

    private fun booleanNoArgumentEncoding(): String = when (System.getProperty("os.arch")) {
        "aarch64", "arm64" -> "B@:"
        "amd64", "x86_64" -> "c@:"
        else -> error("Unsupported Objective-C host architecture: ${System.getProperty("os.arch")}")
    }
}

internal object ObjCManagedTrampolines {
    fun dispatchVoidObject(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
        argument: Long,
    ) {
        var boundary: ObjCNativeBoundary<Unit>? = null
        try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(Unit)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchVoidObject(installedBoundary, route, command, argument)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, Unit)
        }
    }

    fun dispatchBooleanObject(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
        argument: Long,
    ): Boolean {
        var boundary: ObjCNativeBoundary<Boolean>? = null
        return try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(ObjCMethodSignatures.BooleanObject.abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchBooleanObject(installedBoundary, route, command, argument)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure)
                ?: ObjCMethodDispatch.containUnrouted(failure, false)
        }
    }

    fun dispatchBooleanNoArgument(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
    ): Boolean {
        var boundary: ObjCNativeBoundary<Boolean>? = null
        return try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(ObjCMethodSignatures.Boolean.abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchBooleanNoArgument(installedBoundary, route, command)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure)
                ?: ObjCMethodDispatch.containUnrouted(failure, false)
        }
    }

    fun dispatchVoid(route: ObjCMethodDispatch.NativeRoute, command: Long) {
        var boundary: ObjCNativeBoundary<Unit>? = null
        try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(Unit)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchVoid(installedBoundary, route, command)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, Unit)
        }
    }

    fun dispatchULongObject(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
        argument: Long,
    ): Long {
        var boundary: ObjCNativeBoundary<Long>? = null
        return try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(ObjCMethodSignatures.ULongObject.abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchULongObject(installedBoundary, route, command, argument)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure)
                ?: ObjCMethodDispatch.containUnrouted(failure, 0L)
        }
    }
}
