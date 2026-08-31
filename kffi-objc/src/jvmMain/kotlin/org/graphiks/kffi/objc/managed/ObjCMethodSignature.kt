@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.engine.JvmManagedObjCBridge
import org.graphiks.kffi.engine.JvmManagedObjCObjectRangeResult
import org.graphiks.kffi.engine.JvmManagedObjCPoint
import org.graphiks.kffi.engine.JvmManagedObjCRange
import org.graphiks.kffi.engine.JvmManagedObjCRect
import org.graphiks.kffi.engine.JvmManagedObjCRectRangeResult
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSRange
import org.graphiks.kffi.objc.NSRect
import org.graphiks.kffi.objc.NSSize
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.ValueLayout

/** One finite Objective-C method ABI shape supported by the managed bridge. */
class ObjCMethodSignature<R> internal constructor(
    val identity: String,
    val typeEncoding: String,
    internal val trampoline: NativeAddress,
    internal val abiZero: R,
)

/** One finite Objective-C block ABI shape owned by the managed block bridge. */
internal class ObjCBlockSignature(
    val identity: String,
    val typeEncoding: String,
    val functionDescriptor: FunctionDescriptor,
    val trampoline: NativeAddress,
)

/** The only Objective-C block ABI shapes currently admitted by the managed layer. */
internal object ObjCBlockSignatures {
    val VoidError: ObjCBlockSignature = signature(
        identity = "void-error",
        typeEncoding = "v16@?0@8",
        trampoline = JvmManagedObjCBridge.blockVoidError,
        ValueLayout.ADDRESS,
    )

    val VoidObjectObject: ObjCBlockSignature = signature(
        identity = "void-object-object",
        typeEncoding = "v24@?0@8@16",
        trampoline = JvmManagedObjCBridge.blockVoidObjectObject,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
    )

    val VoidObjectObjectObject: ObjCBlockSignature = signature(
        identity = "void-object-object-object",
        typeEncoding = "v32@?0@8@16@24",
        trampoline = JvmManagedObjCBridge.blockVoidObjectObjectObject,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
    )

    val VoidObjectFloatBoolean: ObjCBlockSignature = signature(
        identity = "void-object-float-boolean",
        typeEncoding = "v24@?0@8f16${booleanEncoding()}20",
        trampoline = JvmManagedObjCBridge.blockVoidObjectFloatBoolean,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_BOOLEAN,
    )

    val VoidObjectFloat: ObjCBlockSignature = signature(
        identity = "void-object-float",
        typeEncoding = "v20@?0@8f16",
        trampoline = JvmManagedObjCBridge.blockVoidObjectFloat,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_FLOAT,
    )

    val VoidObjectFloatFloat: ObjCBlockSignature = signature(
        identity = "void-object-float-float",
        typeEncoding = "v24@?0@8f16f20",
        trampoline = JvmManagedObjCBridge.blockVoidObjectFloatFloat,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
    )

    private fun signature(
        identity: String,
        typeEncoding: String,
        trampoline: NativeAddress,
        vararg argumentLayouts: java.lang.foreign.MemoryLayout,
    ): ObjCBlockSignature {
        val descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, *argumentLayouts)
        return ObjCBlockSignature(
            identity = identity,
            typeEncoding = typeEncoding,
            functionDescriptor = descriptor,
            trampoline = trampoline,
        )
    }

    private fun booleanEncoding(): String = when (System.getProperty("os.arch")) {
        "aarch64", "arm64" -> "B"
        "amd64", "x86_64" -> "c"
        else -> error("Unsupported Objective-C host architecture: ${System.getProperty("os.arch")}")
    }
}

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

    val VoidObjectRange: ObjCMethodSignature<Unit> = ObjCMethodSignature(
        identity = "void-object-range",
        typeEncoding = "v@:@{_NSRange=QQ}",
        trampoline = JvmManagedObjCBridge.voidObjectRange,
        abiZero = Unit,
    )

    val VoidObjectRangeRange: ObjCMethodSignature<Unit> = ObjCMethodSignature(
        identity = "void-object-range-range",
        typeEncoding = "v@:@{_NSRange=QQ}{_NSRange=QQ}",
        trampoline = JvmManagedObjCBridge.voidObjectRangeRange,
        abiZero = Unit,
    )

    val Range: ObjCMethodSignature<NSRange> = ObjCMethodSignature(
        identity = "range",
        typeEncoding = "{_NSRange=QQ}@:",
        trampoline = JvmManagedObjCBridge.range,
        abiZero = NSRange(0L, 0L),
    )

    val ObjectRangeOutRange: ObjCMethodSignature<NSObject?> = ObjCMethodSignature(
        identity = "object-range-out-range",
        typeEncoding = "@@:{_NSRange=QQ}^{_NSRange=QQ}",
        trampoline = JvmManagedObjCBridge.objectRangeOutRange,
        abiZero = null,
    )

    val RectRangeOutRange: ObjCMethodSignature<NSRect> = ObjCMethodSignature(
        identity = "rect-range-out-range",
        typeEncoding = "{CGRect={CGPoint=dd}{CGSize=dd}}@:{_NSRange=QQ}^{_NSRange=QQ}",
        trampoline = JvmManagedObjCBridge.rectRangeOutRange,
        abiZero = NSRect(NSPoint(0.0, 0.0), NSSize(0.0, 0.0)),
    )

    val ULongPoint: ObjCMethodSignature<Long> = ObjCMethodSignature(
        identity = "ulong-point",
        typeEncoding = "Q@:{CGPoint=dd}",
        trampoline = JvmManagedObjCBridge.uLongPoint,
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

    fun dispatchVoidObjectRange(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
        argument: Long,
        range: JvmManagedObjCRange,
    ) {
        var boundary: ObjCNativeBoundary<Unit>? = null
        try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(Unit)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchVoidObjectRange(
                    installedBoundary,
                    route,
                    command,
                    argument,
                    range,
                )
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, Unit)
        }
    }

    fun dispatchVoidObjectRangeRange(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
        argument: Long,
        firstRange: JvmManagedObjCRange,
        secondRange: JvmManagedObjCRange,
    ) {
        var boundary: ObjCNativeBoundary<Unit>? = null
        try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(Unit)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchVoidObjectRangeRange(
                    installedBoundary,
                    route,
                    command,
                    argument,
                    firstRange,
                    secondRange,
                )
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, Unit)
        }
    }

    fun dispatchRange(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
    ): JvmManagedObjCRange {
        var boundary: ObjCNativeBoundary<NSRange>? = null
        val result = try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(ObjCMethodSignatures.Range.abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchRange(installedBoundary, route, command)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure)
                ?: ObjCMethodDispatch.containUnrouted(failure, ObjCMethodSignatures.Range.abiZero)
        }
        return result.toBridgeRange()
    }

    fun dispatchObjectRangeOutRange(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
        range: JvmManagedObjCRange,
    ): JvmManagedObjCObjectRangeResult {
        val abiZero = ObjCObjectRangeResult(null, NSRange(0L, 0L))
        var boundary: ObjCNativeBoundary<ObjCObjectRangeResult>? = null
        val result = try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchObjectRangeOutRange(
                    installedBoundary,
                    route,
                    command,
                    range,
                )
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, abiZero)
        }
        return JvmManagedObjCObjectRangeResult(
            value = result.value?.ptr?.address() ?: 0L,
            actualRange = result.actualRange.toBridgeRange(),
        )
    }

    fun dispatchRectRangeOutRange(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
        range: JvmManagedObjCRange,
    ): JvmManagedObjCRectRangeResult {
        val abiZero = ObjCRectRangeResult(
            ObjCMethodSignatures.RectRangeOutRange.abiZero,
            NSRange(0L, 0L),
        )
        var boundary: ObjCNativeBoundary<ObjCRectRangeResult>? = null
        val result = try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchRectRangeOutRange(
                    installedBoundary,
                    route,
                    command,
                    range,
                )
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, abiZero)
        }
        return JvmManagedObjCRectRangeResult(
            value = JvmManagedObjCRect(
                x = result.value.origin.x,
                y = result.value.origin.y,
                width = result.value.size.width,
                height = result.value.size.height,
            ),
            actualRange = result.actualRange.toBridgeRange(),
        )
    }

    fun dispatchULongPoint(
        route: ObjCMethodDispatch.NativeRoute,
        command: Long,
        point: JvmManagedObjCPoint,
    ): Long {
        var boundary: ObjCNativeBoundary<Long>? = null
        return try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(ObjCMethodSignatures.ULongPoint.abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchULongPoint(installedBoundary, route, command, point)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, 0L)
        }
    }
}

private fun NSRange.toBridgeRange(): JvmManagedObjCRange =
    JvmManagedObjCRange(location = location, length = length)
