package org.graphiks.kffi.objc.appkit

import kotlin.test.Test
import kotlin.test.assertEquals

class CGDisplayReconfigurationObserverTest {
    @Test
    fun observerCopiesTheNativeValuesAndRevokesAdmissionBeforeClosingTheRegistration() {
        val native = RecordingDisplayReconfigurationNative()
        val observed = mutableListOf<CGDisplayReconfiguration>()
        val observer = CGDisplayReconfigurationObserver(native, observed::add)

        native.emit(displayId = 41, flags = 0x1_0000_0001L)
        observer.close()
        native.emit(displayId = 99, flags = 2L)
        observer.close()

        assertEquals(
            listOf(CGDisplayReconfiguration(displayId = 41, flags = 0x1_0000_0001L)),
            observed,
        )
        assertEquals(1, native.closeCount)
    }
}

private class RecordingDisplayReconfigurationNative : DisplayReconfigurationNative {
    private var listener: ((CGDisplayReconfiguration) -> Unit)? = null
    var closeCount = 0
        private set

    override fun register(listener: (CGDisplayReconfiguration) -> Unit): AutoCloseable {
        check(this.listener == null)
        this.listener = listener
        return AutoCloseable {
            if (this.listener != null) {
                this.listener = null
                closeCount += 1
            }
        }
    }

    fun emit(displayId: Int, flags: Long) {
        listener?.invoke(CGDisplayReconfiguration(displayId, flags))
    }
}
