package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.objc.NSNotification
import org.graphiks.kffi.objc.NSNotificationCenter
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.MemorySegment

private const val NOTIFICATION_SELECTOR = "kffiHandleNotification:"

private val notificationReceiverClass: ObjCManagedClass by lazy {
    ObjCManagedClass.registerOnce(
        methods = mapOf(NOTIFICATION_SELECTOR to ObjCMethodSignatures.VoidObject),
    )
}

/**
 * Observes matching notifications with a selector-based managed receiver.
 *
 * The [NSNotification] passed to [handler] is borrowed and is valid only for the dynamic extent
 * of the handler call. Do not retain or use it after the handler returns unless explicit strong
 * ownership is acquired before returning.
 */
fun NSNotificationCenter.observe(
    name: MemorySegment = MemorySegment.NULL,
    objectFilter: MemorySegment = MemorySegment.NULL,
    onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
    handler: (NSNotification) -> Unit,
): ObjCNotificationObservation {
    val retainedCenter = retainStrong()
    val instance = try {
        notificationReceiverClass.createInstance(onError) {
            onVoidObject(NOTIFICATION_SELECTOR) { notification ->
                handler(NSNotification(notification.ptr))
            }
        }
    } catch (failure: Throwable) {
        retainedCenter.close()
        throw failure
    }
    val retainedReceiver = try {
        instance.receiver.retainStrong()
    } catch (failure: Throwable) {
        instance.close()
        instance.onQuiescent { retainedCenter.close() }
        throw failure
    }
    val observation = ObjCNotificationObservation(retainedCenter, instance, retainedReceiver)

    return try {
        addObserver_selector_name_object(
            instance.receiver.ptr,
            ObjCRuntime.sel(NOTIFICATION_SELECTOR),
            name,
            objectFilter,
        )
        observation
    } catch (failure: Throwable) {
        observation.close()
        throw failure
    }
}
