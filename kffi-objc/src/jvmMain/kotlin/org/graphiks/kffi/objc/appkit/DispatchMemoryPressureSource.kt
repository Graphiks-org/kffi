@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.CallbackRuntime
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

internal const val DISPATCH_MEMORYPRESSURE_WARN: Long = 0x2L
internal const val DISPATCH_MEMORYPRESSURE_CRITICAL: Long = 0x4L

/** A typed event emitted by a Dispatch memory-pressure source. */
enum class DispatchMemoryPressureEvent {
    WARN,
    CRITICAL,
}

/**
 * A resumed, closeable Dispatch source for warning and critical memory pressure.
 *
 * Closing revokes handler admission before requesting native cancellation. Native storage is
 * released only after Dispatch delivers its cancellation callback and every already-admitted JVM
 * handler returns.
 */
class DispatchMemoryPressureSource internal constructor(
    native: DispatchMemoryPressureNative,
    eventHandler: (DispatchMemoryPressureEvent) -> Unit,
) : AutoCloseable {
    constructor(handler: (DispatchMemoryPressureEvent) -> Unit) :
        this(LibDispatchMemoryPressureNative, handler)

    private val lock = ReentrantLock()
    private var handler: ((DispatchMemoryPressureEvent) -> Unit)? = eventHandler
    private var closed = false
    private var cancellationDelivered = false
    private var activeDeliveries = 0
    private var releaseStarted = false
    private var quiescent = false
    private val nativeSource: DispatchMemoryPressureNativeSource = native.create(
        mask = DISPATCH_MEMORYPRESSURE_WARN or DISPATCH_MEMORYPRESSURE_CRITICAL,
        eventHandler = ::deliver,
        cancellationHandler = ::cancellationDelivered,
    )

    init {
        try {
            nativeSource.resume()
        } catch (failure: Throwable) {
            lock.withLock { closed = true }
            try {
                nativeSource.release()
            } catch (releaseFailure: Throwable) {
                failure.addSuppressed(releaseFailure)
            }
            lock.withLock {
                handler = null
                releaseStarted = true
                quiescent = true
            }
            throw failure
        }
    }

    val isClosed: Boolean
        get() = lock.withLock { closed }

    val isQuiescent: Boolean
        get() = lock.withLock { quiescent }

    override fun close() {
        val shouldCancel = lock.withLock {
            if (closed) return
            closed = true
            true
        }
        if (shouldCancel) nativeSource.cancel()
    }

    private fun deliver(data: Long) {
        if (data and DISPATCH_MEMORYPRESSURE_WARN != 0L) {
            deliver(DispatchMemoryPressureEvent.WARN)
        }
        if (data and DISPATCH_MEMORYPRESSURE_CRITICAL != 0L) {
            deliver(DispatchMemoryPressureEvent.CRITICAL)
        }
    }

    private fun deliver(event: DispatchMemoryPressureEvent) {
        val admittedHandler = lock.withLock {
            if (closed) return
            activeDeliveries += 1
            checkNotNull(handler)
        }
        try {
            admittedHandler(event)
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        } finally {
            val release = lock.withLock {
                activeDeliveries -= 1
                takeReleaseIfReady()
            }
            release?.let(::releaseAndMarkQuiescent)
        }
    }

    private fun cancellationDelivered() {
        val release = lock.withLock {
            cancellationDelivered = true
            takeReleaseIfReady()
        }
        release?.let(::releaseAndMarkQuiescent)
    }

    private fun takeReleaseIfReady(): DispatchMemoryPressureNativeSource? {
        if (!cancellationDelivered || activeDeliveries != 0 || releaseStarted) return null
        releaseStarted = true
        return nativeSource
    }

    private fun releaseAndMarkQuiescent(source: DispatchMemoryPressureNativeSource) {
        try {
            source.release()
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        } finally {
            lock.withLock {
                handler = null
                quiescent = true
            }
        }
    }
}

internal interface DispatchMemoryPressureNative {
    fun create(
        mask: Long,
        eventHandler: (Long) -> Unit,
        cancellationHandler: () -> Unit,
    ): DispatchMemoryPressureNativeSource
}

internal interface DispatchMemoryPressureNativeSource {
    fun resume()
    fun cancel()
    fun release()
}

private object LibDispatchMemoryPressureNative : DispatchMemoryPressureNative {
    override fun create(
        mask: Long,
        eventHandler: (Long) -> Unit,
        cancellationHandler: () -> Unit,
    ): DispatchMemoryPressureNativeSource = DispatchMemoryPressureRuntime.create(
        mask,
        eventHandler,
        cancellationHandler,
    )
}

private object DispatchMemoryPressureRuntime {
    private data class Registration(
        val source: LibDispatchMemoryPressureSource,
        val eventHandler: (Long) -> Unit,
        val cancellationHandler: () -> Unit,
    )

    private val arena = Arena.global()
    private val linker = Linker.nativeLinker()
    private val registrations = ConcurrentHashMap<Long, Registration>()
    private val nextToken = AtomicLong(1L)
    private val eventStub = linker.upcallStub(
        MethodHandles.lookup().findStatic(
            DispatchMemoryPressureTrampolines::class.java,
            "event",
            MethodType.methodType(Void.TYPE, MemorySegment::class.java),
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
        arena,
    )
    private val cancelStub = linker.upcallStub(
        MethodHandles.lookup().findStatic(
            DispatchMemoryPressureTrampolines::class.java,
            "cancel",
            MethodType.methodType(Void.TYPE, MemorySegment::class.java),
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
        arena,
    )

    fun create(
        mask: Long,
        eventHandler: (Long) -> Unit,
        cancellationHandler: () -> Unit,
    ): DispatchMemoryPressureNativeSource {
        val queue = DispatchFunctions.queueCreate(
            arena.allocateFrom("org.graphiks.kffi.memory-pressure"),
        )
        check(queue != MemorySegment.NULL) { "dispatch_queue_create returned null" }
        val sourceSegment = try {
            DispatchFunctions.sourceCreate(mask, queue)
        } catch (failure: Throwable) {
            DispatchFunctions.release(queue)
            throw failure
        }
        if (sourceSegment == MemorySegment.NULL) {
            DispatchFunctions.release(queue)
            error("dispatch_source_create returned null")
        }

        val token = nextToken.getAndIncrement()
        check(token != 0L) { "Dispatch memory-pressure token space exhausted" }
        val source = LibDispatchMemoryPressureSource(token, sourceSegment, queue)
        val registration = Registration(source, eventHandler, cancellationHandler)
        check(registrations.putIfAbsent(token, registration) == null) {
            "Dispatch memory-pressure token collision: $token"
        }
        try {
            DispatchFunctions.setContext(sourceSegment, MemorySegment.ofAddress(token))
            DispatchFunctions.setEventHandler(sourceSegment, eventStub)
            DispatchFunctions.setCancelHandler(sourceSegment, cancelStub)
            return source
        } catch (failure: Throwable) {
            registrations.remove(token, registration)
            source.release()
            throw failure
        }
    }

    fun event(token: Long) {
        val registration = registrations[token] ?: return
        try {
            registration.eventHandler(DispatchFunctions.sourceData(registration.source.source))
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        }
    }

    fun cancel(token: Long) {
        val registration = registrations[token] ?: return
        try {
            registration.cancellationHandler()
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        }
    }

    private class LibDispatchMemoryPressureSource(
        private val token: Long,
        val source: MemorySegment,
        private val queue: MemorySegment,
    ) : DispatchMemoryPressureNativeSource {
        private val resumed = AtomicBoolean(false)
        private val cancelled = AtomicBoolean(false)
        private val released = AtomicBoolean(false)

        override fun resume() {
            check(resumed.compareAndSet(false, true)) { "Dispatch source is already resumed" }
            DispatchFunctions.resume(source)
        }

        override fun cancel() {
            if (cancelled.compareAndSet(false, true)) DispatchFunctions.cancel(source)
        }

        override fun release() {
            if (!released.compareAndSet(false, true)) return
            registrations.remove(token)
            DispatchFunctions.release(source)
            DispatchFunctions.release(queue)
        }
    }
}

private object DispatchMemoryPressureTrampolines {
    @JvmStatic
    fun event(context: MemorySegment) {
        DispatchMemoryPressureRuntime.event(context.address())
    }

    @JvmStatic
    fun cancel(context: MemorySegment) {
        DispatchMemoryPressureRuntime.cancel(context.address())
    }
}

private object DispatchFunctions {
    private val arena = Arena.global()
    private val linker = Linker.nativeLinker()
    private val symbols = SymbolLookup.libraryLookup("/usr/lib/libSystem.B.dylib", arena)
    private val memoryPressureSourceType = symbols.find("_dispatch_source_type_memorypressure")
        .orElseThrow { UnsatisfiedLinkError("_dispatch_source_type_memorypressure not found") }
    private val queueCreate = linker.downcallHandle(
        symbols.find("dispatch_queue_create").orElseThrow(),
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val sourceCreate = linker.downcallHandle(
        symbols.find("dispatch_source_create").orElseThrow(),
        FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
        ),
    )
    private val setContext = linker.downcallHandle(
        symbols.find("dispatch_set_context").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val setEventHandler = linker.downcallHandle(
        symbols.find("dispatch_source_set_event_handler_f").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val setCancelHandler = linker.downcallHandle(
        symbols.find("dispatch_source_set_cancel_handler_f").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val resume = linker.downcallHandle(
        symbols.find("dispatch_resume").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
    )
    private val sourceData = linker.downcallHandle(
        symbols.find("dispatch_source_get_data").orElseThrow(),
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
    )
    private val cancel = linker.downcallHandle(
        symbols.find("dispatch_source_cancel").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
    )
    private val release = linker.downcallHandle(
        symbols.find("dispatch_release").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
    )

    fun queueCreate(label: MemorySegment): MemorySegment =
        queueCreate.invokeExact(label, MemorySegment.NULL) as MemorySegment

    fun sourceCreate(mask: Long, queue: MemorySegment): MemorySegment =
        sourceCreate.invokeExact(memoryPressureSourceType, 0L, mask, queue) as MemorySegment

    fun setContext(source: MemorySegment, context: MemorySegment) {
        setContext.invokeExact(source, context)
    }

    fun setEventHandler(source: MemorySegment, handler: MemorySegment) {
        setEventHandler.invokeExact(source, handler)
    }

    fun setCancelHandler(source: MemorySegment, handler: MemorySegment) {
        setCancelHandler.invokeExact(source, handler)
    }

    fun resume(source: MemorySegment) {
        resume.invokeExact(source)
    }

    fun sourceData(source: MemorySegment): Long = sourceData.invokeExact(source) as Long

    fun cancel(source: MemorySegment) {
        cancel.invokeExact(source)
    }

    fun release(objectPointer: MemorySegment) {
        release.invokeExact(objectPointer)
    }
}
