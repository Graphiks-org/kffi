package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.engine.JvmUpcallEngine
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
        trampoline = ObjCManagedTrampolines.voidObject,
        abiZero = Unit,
    )

    val BooleanObject: ObjCMethodSignature<Boolean> = ObjCMethodSignature(
        identity = "boolean-object",
        typeEncoding = booleanObjectEncoding(),
        trampoline = ObjCManagedTrampolines.booleanObject,
        abiZero = false,
    )

    val Void: ObjCMethodSignature<Unit> = ObjCMethodSignature(
        identity = "void",
        typeEncoding = "v@:",
        trampoline = ObjCManagedTrampolines.void,
        abiZero = Unit,
    )

    val ULongObject: ObjCMethodSignature<Long> = ObjCMethodSignature(
        identity = "ulong-object",
        typeEncoding = "Q@:@",
        trampoline = ObjCManagedTrampolines.uLongObject,
        abiZero = 0L,
    )

    private fun booleanObjectEncoding(): String = when (System.getProperty("os.arch")) {
        "aarch64", "arm64" -> "B@:@"
        "amd64", "x86_64" -> "c@:@"
        else -> error("Unsupported Objective-C host architecture: ${System.getProperty("os.arch")}")
    }
}

internal object ObjCManagedTrampolines {
    val voidObject: NativeAddress by lazy {
        allocate("dispatchVoidObject", "(JJJ)V")
    }
    val booleanObject: NativeAddress by lazy {
        allocate("dispatchBooleanObject", "(JJJ)Z")
    }
    val void: NativeAddress by lazy {
        allocate("dispatchVoid", "(JJ)V")
    }
    val uLongObject: NativeAddress by lazy {
        allocate("dispatchULongObject", "(JJJ)J")
    }

    @JvmStatic
    fun dispatchVoidObject(self: Long, command: Long, argument: Long) {
        var boundary: ObjCNativeBoundary<Unit>? = null
        try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(Unit)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchVoidObject(installedBoundary, self, command, argument)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, Unit)
        }
    }

    @JvmStatic
    fun dispatchBooleanObject(self: Long, command: Long, argument: Long): Boolean {
        var boundary: ObjCNativeBoundary<Boolean>? = null
        return try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(ObjCMethodSignatures.BooleanObject.abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchBooleanObject(installedBoundary, self, command, argument)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure)
                ?: ObjCMethodDispatch.containUnrouted(failure, false)
        }
    }

    @JvmStatic
    fun dispatchVoid(self: Long, command: Long) {
        var boundary: ObjCNativeBoundary<Unit>? = null
        try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(Unit)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchVoid(installedBoundary, self, command)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure) ?: ObjCMethodDispatch.containUnrouted(failure, Unit)
        }
    }

    @JvmStatic
    fun dispatchULongObject(self: Long, command: Long, argument: Long): Long {
        var boundary: ObjCNativeBoundary<Long>? = null
        return try {
            ObjCRuntime.autoreleasePool {
                val installedBoundary = ObjCNativeBoundary(ObjCMethodSignatures.ULongObject.abiZero)
                boundary = installedBoundary
                ObjCMethodDispatch.dispatchULongObject(installedBoundary, self, command, argument)
            }
        } catch (failure: Throwable) {
            boundary?.contain(failure)
                ?: ObjCMethodDispatch.containUnrouted(failure, 0L)
        }
    }

    private fun allocate(method: String, signature: String): NativeAddress =
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = ObjCManagedTrampolines::class.java,
            dispatchMethod = method,
            dispatchSig = signature,
        )
}
