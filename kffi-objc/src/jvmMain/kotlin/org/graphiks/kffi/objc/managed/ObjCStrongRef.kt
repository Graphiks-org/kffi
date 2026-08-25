package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicBoolean

/** One explicit strong Objective-C ownership claim for [value]. */
class ObjCStrongRef<out T : NSObject> internal constructor(
    val value: T,
) : AutoCloseable {
    private val closed = AtomicBoolean()

    override fun close() {
        if (closed.compareAndSet(false, true)) {
            ObjCRuntime.release(value.ptr)
        }
    }
}

/** Retains this Objective-C object and returns an idempotent owner for that retain. */
fun <T : NSObject> T.retainStrong(): ObjCStrongRef<T> {
    ObjCRuntime.retain(ptr)
    return ObjCStrongRef(this)
}

/** Queries the receiver through Objective-C's real `respondsToSelector:` dispatch. */
fun NSObject.respondsToSelector(selectorName: String): Boolean = ObjCRuntime.msgSend(
    ValueLayout.JAVA_BOOLEAN,
    ptr,
    ObjCRuntime.sel("respondsToSelector:"),
    ObjCRuntime.sel(selectorName),
) as Boolean
