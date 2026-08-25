package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSNotificationCenter
import org.graphiks.kffi.objc.NSObject

/** Deterministic owner for one selector-based Objective-C notification registration. */
class ObjCNotificationObservation internal constructor(
    private val center: ObjCStrongRef<NSNotificationCenter>,
    private val instance: ObjCManagedInstance,
    private val receiver: ObjCStrongRef<NSObject>,
) : AutoCloseable {
    private val closeLock = Any()
    private var closed = false

    override fun close() {
        synchronized(closeLock) {
            if (closed) return

            instance.close()
            center.value.removeObserver(receiver.value.ptr)
            instance.onQuiescent {
                try {
                    receiver.close()
                } finally {
                    center.close()
                }
            }
            closed = true
        }
    }
}
