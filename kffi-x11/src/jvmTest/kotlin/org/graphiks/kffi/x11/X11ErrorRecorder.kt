package org.graphiks.kffi.x11

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentLinkedQueue
import org.graphiks.kffi.x11.generated.XErrorEvent

internal data class RecordedX11Error(
    val callbackDisplay: Long,
    val type: Int,
    val display: Long,
    val resource: Long,
    val serial: Long,
    val code: Int,
    val request: Int,
    val minor: Int,
)

internal class X11ErrorRecorder {
    val events = ConcurrentLinkedQueue<RecordedX11Error>()
    @Volatile var failure: Throwable? = null
        private set

    fun stub(arena: Arena): MemorySegment {
        val target = MethodHandles.lookup().findVirtual(
            X11ErrorRecorder::class.java,
            "handleError",
            MethodType.methodType(Int::class.javaPrimitiveType, MemorySegment::class.java, MemorySegment::class.java),
        ).bindTo(this)
        return Linker.nativeLinker().upcallStub(
            target,
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            arena,
        )
    }

    @Suppress("unused")
    fun handleError(display: MemorySegment, pointer: MemorySegment): Int {
        // Native callback data is borrowed: copy it, and never throw through C.
        try {
            val event = XErrorEvent.reinterpret(pointer)
            val fields = XErrorEvent()
            events.add(RecordedX11Error(
                display.address(), fields.type(event), fields.display(event).address(),
                fields.resourceid(event), fields.serial(event),
                fields.error_code(event).toInt() and 255,
                fields.request_code(event).toInt() and 255,
                fields.minor_code(event).toInt() and 255,
            ))
        } catch (cause: Throwable) {
            failure = cause
        }
        return 0
    }
}
