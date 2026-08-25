@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.CallbackPolicy
import org.graphiks.kffi.CallbackRegistration
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicReference

/** One independently closeable receiver of a shared [ObjCManagedClass]. */
class ObjCManagedInstance private constructor(
    val receiver: NSObject,
    private val registration: CallbackRegistration<ManagedObjCCallback>,
) : AutoCloseable {
    override fun close() {
        registration.close()
    }

    internal companion object {
        fun create(
            nativeClass: MemorySegment,
            router: ObjCMethodRouter,
            onError: CallbackExceptionHandler,
        ): ObjCManagedInstance {
            val registration = CallbackRuntime.register(
                type = ObjCMethodDispatch.callbackType,
                trampoline = ObjCMethodSignatures.Void.trampoline,
                policy = CallbackPolicy.REPEATING,
                onError = onError,
                callback = ManagedObjCCallback(router),
            )
            val ownedReceiver = AtomicReference(MemorySegment.NULL)
            val nativeRoute = AtomicReference<AutoCloseable?>(null)
            registration.onQuiescent {
                nativeRoute.getAndSet(null)?.close()
                val receiver = ownedReceiver.getAndSet(MemorySegment.NULL)
                if (receiver != MemorySegment.NULL) {
                    ObjCRuntime.msgSend(null, receiver, ObjCRuntime.sel("release"))
                }
            }

            try {
                val allocated = ObjCRuntime.msgSend(
                    ValueLayout.ADDRESS,
                    nativeClass,
                    ObjCRuntime.sel("alloc"),
                ) as MemorySegment
                check(allocated != MemorySegment.NULL) { "Managed Objective-C receiver allocation failed" }
                ownedReceiver.set(allocated)

                val initialized = ObjCRuntime.msgSend(
                    ValueLayout.ADDRESS,
                    allocated,
                    ObjCRuntime.sel("init"),
                ) as MemorySegment
                check(initialized != MemorySegment.NULL) { "Managed Objective-C receiver initialization failed" }
                ownedReceiver.set(initialized)

                nativeRoute.set(ObjCMethodDispatch.install(initialized, registration, router))
                return ObjCManagedInstance(NSObject(initialized), registration)
            } catch (failure: Throwable) {
                registration.close()
                throw failure
            }
        }
    }
}
