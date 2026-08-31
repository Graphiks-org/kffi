@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.engine

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.NativeAddress
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong

@CallbackRuntimeApi
data class JvmManagedObjCRange(val location: Long, val length: Long)

@CallbackRuntimeApi
data class JvmManagedObjCPoint(val x: Double, val y: Double)

@CallbackRuntimeApi
data class JvmManagedObjCRect(
    val x: Double,
    val y: Double,
    val width: Double,
    val height: Double,
)

@CallbackRuntimeApi
data class JvmManagedObjCObjectRangeResult(
    val value: Long,
    val actualRange: JvmManagedObjCRange,
)

@CallbackRuntimeApi
data class JvmManagedObjCRectRangeResult(
    val value: JvmManagedObjCRect,
    val actualRange: JvmManagedObjCRange,
)

/** Loader-neutral route invoked by process-lifetime managed Objective-C IMPs. */
@CallbackRuntimeApi
interface JvmManagedObjCRoute {
    fun dispatchVoidObject(self: Long, command: Long, argument: Long)

    fun dispatchBooleanObject(self: Long, command: Long, argument: Long): Boolean

    fun dispatchBoolean(self: Long, command: Long): Boolean

    fun dispatchVoid(self: Long, command: Long)

    fun dispatchULongObject(self: Long, command: Long, argument: Long): Long

    fun dispatchVoidObjectRange(
        self: Long,
        command: Long,
        argument: Long,
        range: JvmManagedObjCRange,
    )

    fun dispatchVoidObjectRangeRange(
        self: Long,
        command: Long,
        argument: Long,
        firstRange: JvmManagedObjCRange,
        secondRange: JvmManagedObjCRange,
    )

    fun dispatchRange(self: Long, command: Long): JvmManagedObjCRange

    fun dispatchObjectRangeOutRange(
        self: Long,
        command: Long,
        range: JvmManagedObjCRange,
    ): JvmManagedObjCObjectRangeResult

    fun dispatchRectRangeOutRange(
        self: Long,
        command: Long,
        range: JvmManagedObjCRange,
    ): JvmManagedObjCRectRangeResult

    fun dispatchULongPoint(self: Long, command: Long, point: JvmManagedObjCPoint): Long
}

/** Loader-neutral route invoked by process-lifetime managed Objective-C block trampolines. */
@CallbackRuntimeApi
interface JvmManagedObjCBlockRoute {
    fun dispatchVoidError(block: Long, error: Long)

    fun dispatchVoidObjectObject(block: Long, first: Long, second: Long)

    fun dispatchVoidObjectObjectObject(block: Long, first: Long, second: Long, third: Long)

    fun dispatchVoidObjectFloatBoolean(block: Long, value: Long, amount: Float, enabled: Boolean)

    fun dispatchVoidObjectFloat(block: Long, value: Long, amount: Float)

    fun dispatchVoidObjectFloatFloat(block: Long, value: Long, first: Float, second: Float)
}

/**
 * Parent-loader bridge for managed Objective-C classes.
 *
 * Native classes retain these IMPs for the process lifetime. A route may belong to an isolated
 * child loader, but it remains in this bridge only until its callback registration is quiescent.
 */
@CallbackRuntimeApi
object JvmManagedObjCBridge {
    private val lastLoaderGeneration = AtomicLong(0L)
    private val routes = ConcurrentHashMap<Long, JvmManagedObjCRoute>()
    private val blockRoutes = ConcurrentHashMap<Long, JvmManagedObjCBlockRoute>()

    val voidObject: NativeAddress by lazy { allocate("dispatchVoidObject", "(JJJ)V") }
    val booleanObject: NativeAddress by lazy { allocate("dispatchBooleanObject", "(JJJ)Z") }
    val boolean: NativeAddress by lazy { allocate("dispatchBoolean", "(JJ)Z") }
    val void: NativeAddress by lazy { allocate("dispatchVoid", "(JJ)V") }
    val uLongObject: NativeAddress by lazy { allocate("dispatchULongObject", "(JJJ)J") }
    val voidObjectRange: NativeAddress by lazy {
        JvmUpcallEngine.allocateObjCVoidObjectRangeTrampoline(
            JvmManagedObjCBridge::class.java,
            "dispatchVoidObjectRange",
        )
    }
    val voidObjectRangeRange: NativeAddress by lazy {
        JvmUpcallEngine.allocateObjCVoidObjectRangeRangeTrampoline(
            JvmManagedObjCBridge::class.java,
            "dispatchVoidObjectRangeRange",
        )
    }
    val range: NativeAddress by lazy {
        JvmUpcallEngine.allocateObjCRangeTrampoline(
            JvmManagedObjCBridge::class.java,
            "dispatchRange",
        )
    }
    val objectRangeOutRange: NativeAddress by lazy {
        JvmUpcallEngine.allocateObjCObjectRangeOutRangeTrampoline(
            JvmManagedObjCBridge::class.java,
            "dispatchObjectRangeOutRange",
        )
    }
    val rectRangeOutRange: NativeAddress by lazy {
        JvmUpcallEngine.allocateObjCRectRangeOutRangeTrampoline(
            JvmManagedObjCBridge::class.java,
            "dispatchRectRangeOutRange",
        )
    }
    val uLongPoint: NativeAddress by lazy {
        JvmUpcallEngine.allocateObjCULongPointTrampoline(
            JvmManagedObjCBridge::class.java,
            "dispatchULongPoint",
        )
    }
    val blockVoidError: NativeAddress by lazy { allocate("dispatchBlockVoidError", "(JJ)V") }
    val blockVoidObjectObject: NativeAddress by lazy {
        allocate("dispatchBlockVoidObjectObject", "(JJJ)V")
    }
    val blockVoidObjectObjectObject: NativeAddress by lazy {
        allocate("dispatchBlockVoidObjectObjectObject", "(JJJJ)V")
    }
    val blockVoidObjectFloatBoolean: NativeAddress by lazy {
        allocate("dispatchBlockVoidObjectFloatBoolean", "(JJFZ)V")
    }
    val blockVoidObjectFloat: NativeAddress by lazy {
        allocate("dispatchBlockVoidObjectFloat", "(JJF)V")
    }
    val blockVoidObjectFloatFloat: NativeAddress by lazy {
        allocate("dispatchBlockVoidObjectFloatFloat", "(JJFF)V")
    }

    fun allocateLoaderGeneration(): Long {
        val generation = lastLoaderGeneration.incrementAndGet()
        check(generation > 0L) { "Managed Objective-C loader generation space exhausted" }
        return generation
    }

    fun install(receiver: Long, route: JvmManagedObjCRoute): AutoCloseable {
        require(receiver != 0L) { "Managed Objective-C receiver address must not be null" }
        check(routes.putIfAbsent(receiver, route) == null) {
            "A managed Objective-C route already exists for receiver $receiver"
        }
        return AutoCloseable { routes.remove(receiver, route) }
    }

    fun installBlock(block: Long, route: JvmManagedObjCBlockRoute): AutoCloseable {
        require(block != 0L) { "Managed Objective-C block address must not be null" }
        check(blockRoutes.putIfAbsent(block, route) == null) {
            "A managed Objective-C block route already exists for block $block"
        }
        return AutoCloseable { blockRoutes.remove(block, route) }
    }

    @JvmStatic
    fun dispatchVoidObject(self: Long, command: Long, argument: Long) {
        contain(Unit) { routes[self]?.dispatchVoidObject(self, command, argument) }
    }

    @JvmStatic
    fun dispatchBooleanObject(self: Long, command: Long, argument: Long): Boolean =
        contain(false) { routes[self]?.dispatchBooleanObject(self, command, argument) ?: false }

    @JvmStatic
    fun dispatchBoolean(self: Long, command: Long): Boolean =
        contain(false) { routes[self]?.dispatchBoolean(self, command) ?: false }

    @JvmStatic
    fun dispatchVoid(self: Long, command: Long) {
        contain(Unit) { routes[self]?.dispatchVoid(self, command) }
    }

    @JvmStatic
    fun dispatchULongObject(self: Long, command: Long, argument: Long): Long =
        contain(0L) { routes[self]?.dispatchULongObject(self, command, argument) ?: 0L }

    @JvmStatic
    fun dispatchVoidObjectRange(
        self: Long,
        command: Long,
        argument: Long,
        range: MemorySegment,
    ) {
        contain(Unit) {
            routes[self]?.dispatchVoidObjectRange(self, command, argument, range.readRange())
        }
    }

    @JvmStatic
    fun dispatchVoidObjectRangeRange(
        self: Long,
        command: Long,
        argument: Long,
        firstRange: MemorySegment,
        secondRange: MemorySegment,
    ) {
        contain(Unit) {
            routes[self]?.dispatchVoidObjectRangeRange(
                self,
                command,
                argument,
                firstRange.readRange(),
                secondRange.readRange(),
            )
        }
    }

    @JvmStatic
    fun dispatchRange(self: Long, command: Long): MemorySegment = contain(zeroRange.toSegment()) {
        (routes[self]?.dispatchRange(self, command) ?: zeroRange).toSegment()
    }

    @JvmStatic
    fun dispatchObjectRangeOutRange(
        self: Long,
        command: Long,
        range: MemorySegment,
        actualRange: Long,
    ): Long = contain(0L) {
        val result = routes[self]?.dispatchObjectRangeOutRange(self, command, range.readRange())
            ?: zeroObjectRangeResult
        writeRange(actualRange, result.actualRange)
        result.value
    }

    @JvmStatic
    fun dispatchRectRangeOutRange(
        self: Long,
        command: Long,
        range: MemorySegment,
        actualRange: Long,
    ): MemorySegment = contain(zeroRectRangeResult.value.toSegment()) {
        val result = routes[self]?.dispatchRectRangeOutRange(self, command, range.readRange())
            ?: zeroRectRangeResult
        writeRange(actualRange, result.actualRange)
        result.value.toSegment()
    }

    @JvmStatic
    fun dispatchULongPoint(self: Long, command: Long, point: MemorySegment): Long = contain(0L) {
        routes[self]?.dispatchULongPoint(
            self,
            command,
            JvmManagedObjCPoint(
                x = point.get(ValueLayout.JAVA_DOUBLE, 0L),
                y = point.get(ValueLayout.JAVA_DOUBLE, 8L),
            ),
        ) ?: 0L
    }

    @JvmStatic
    fun dispatchBlockVoidError(block: Long, error: Long) {
        contain(Unit) { blockRoutes[block]?.dispatchVoidError(block, error) }
    }

    @JvmStatic
    fun dispatchBlockVoidObjectObject(block: Long, first: Long, second: Long) {
        contain(Unit) { blockRoutes[block]?.dispatchVoidObjectObject(block, first, second) }
    }

    @JvmStatic
    fun dispatchBlockVoidObjectObjectObject(block: Long, first: Long, second: Long, third: Long) {
        contain(Unit) {
            blockRoutes[block]?.dispatchVoidObjectObjectObject(block, first, second, third)
        }
    }

    @JvmStatic
    fun dispatchBlockVoidObjectFloatBoolean(
        block: Long,
        value: Long,
        amount: Float,
        enabled: Boolean,
    ) {
        contain(Unit) {
            blockRoutes[block]?.dispatchVoidObjectFloatBoolean(block, value, amount, enabled)
        }
    }

    @JvmStatic
    fun dispatchBlockVoidObjectFloat(block: Long, value: Long, amount: Float) {
        contain(Unit) { blockRoutes[block]?.dispatchVoidObjectFloat(block, value, amount) }
    }

    @JvmStatic
    fun dispatchBlockVoidObjectFloatFloat(block: Long, value: Long, first: Float, second: Float) {
        contain(Unit) {
            blockRoutes[block]?.dispatchVoidObjectFloatFloat(block, value, first, second)
        }
    }

    private fun allocate(method: String, signature: String): NativeAddress =
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = JvmManagedObjCBridge::class.java,
            dispatchMethod = method,
            dispatchSig = signature,
        )

    private fun MemorySegment.readRange(): JvmManagedObjCRange = JvmManagedObjCRange(
        location = get(ValueLayout.JAVA_LONG, 0L),
        length = get(ValueLayout.JAVA_LONG, 8L),
    )

    private fun JvmManagedObjCRange.toSegment(): MemorySegment =
        Arena.ofAuto().allocate(16L, 8L).also { segment ->
            segment.set(ValueLayout.JAVA_LONG, 0L, location)
            segment.set(ValueLayout.JAVA_LONG, 8L, length)
        }

    private fun JvmManagedObjCRect.toSegment(): MemorySegment =
        Arena.ofAuto().allocate(32L, 8L).also { segment ->
            segment.set(ValueLayout.JAVA_DOUBLE, 0L, x)
            segment.set(ValueLayout.JAVA_DOUBLE, 8L, y)
            segment.set(ValueLayout.JAVA_DOUBLE, 16L, width)
            segment.set(ValueLayout.JAVA_DOUBLE, 24L, height)
        }

    private fun writeRange(address: Long, value: JvmManagedObjCRange) {
        if (address == 0L) return
        val segment = MemorySegment.ofAddress(address).reinterpret(16L)
        segment.set(ValueLayout.JAVA_LONG, 0L, value.location)
        segment.set(ValueLayout.JAVA_LONG, 8L, value.length)
    }

    private inline fun <R> contain(fallback: R, block: () -> R): R = try {
        block()
    } catch (failure: Throwable) {
        try {
            CallbackRuntime.reportUnroutedFailure(failure)
        } catch (_: Throwable) {
            // Last-resort native boundary: reporting must never escape.
        }
        fallback
    }

    private val zeroRange = JvmManagedObjCRange(0L, 0L)
    private val zeroObjectRangeResult = JvmManagedObjCObjectRangeResult(0L, zeroRange)
    private val zeroRectRangeResult = JvmManagedObjCRectRangeResult(
        value = JvmManagedObjCRect(0.0, 0.0, 0.0, 0.0),
        actualRange = zeroRange,
    )
}
