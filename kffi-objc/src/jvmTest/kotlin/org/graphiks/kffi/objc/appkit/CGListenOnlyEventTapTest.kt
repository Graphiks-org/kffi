package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CGEventTapLocation
import org.graphiks.kffi.objc.CGEventTapOptions
import org.graphiks.kffi.objc.CGEventTapPlacement
import org.graphiks.kffi.objc.CGEventType
import org.graphiks.kffi.objc.managed.BorrowedCGEvent
import org.graphiks.kffi.objc.managed.ManagedCFunctionNativeHandle
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertSame
import kotlin.test.assertTrue

class CGListenOnlyEventTapTest {
    @Test
    fun preflightMapsPermissionWithoutRequestingIt() {
        val granted = RecordingEventTapNative(permissionGranted = true)
        val denied = RecordingEventTapNative(permissionGranted = false)

        assertEquals(EventTapPermissionState.Granted, CGListenOnlyEventTap.preflight(granted))
        assertEquals(EventTapPermissionState.Denied, CGListenOnlyEventTap.preflight(denied))
        assertEquals(listOf("preflight"), granted.calls)
        assertEquals(listOf("preflight"), denied.calls)
    }

    @Test
    fun installUsesSessionListenOnlyTapAndReturnsTheBorrowedEventUnchanged() {
        val native = RecordingEventTapNative()
        var observed: BorrowedCGEvent? = null
        val tap = CGListenOnlyEventTap.install(0x440L, native) { event -> observed = event }

        val returned = native.emit(CGEventType.kCGEventMouseMoved, 0xCAFE)

        assertEquals(0xCAFE, returned.address())
        assertEquals(0xCAFE, observed?.native?.address())
        assertEquals(
            listOf(
                "create:kCGSessionEventTap:kCGHeadInsertEventTap:kCGEventTapOptionListenOnly:1088",
                "source:256",
                "runLoop",
                "commonModes",
                "add:768:512:1024",
                "enable:256:true",
            ),
            native.calls,
        )

        tap.close()
        tap.close()

        assertTrue(tap.isClosed)
        assertTrue(tap.isQuiescent)
        assertEquals(
            listOf(
                "create:kCGSessionEventTap:kCGHeadInsertEventTap:kCGEventTapOptionListenOnly:1088",
                "source:256",
                "runLoop",
                "commonModes",
                "add:768:512:1024",
                "enable:256:true",
                "remove:768:512:1024",
                "enable:256:false",
                "release:512",
                "release:256",
            ),
            native.calls,
        )
        assertTrue(native.callbackWasClosedBeforeRelease)
        assertEquals(MemorySegment.NULL, native.emit(CGEventType.kCGEventMouseMoved, 0xBEEF))
    }

    @Test
    fun annotatedSessionIsAllowedButHidTapIsRejectedBeforeAllocation() {
        val annotatedNative = RecordingEventTapNative()
        CGListenOnlyEventTap.install(
            mask = 1L,
            location = CGEventTapLocation.kCGAnnotatedSessionEventTap,
            native = annotatedNative,
            handler = {},
        ).close()
        assertTrue(annotatedNative.calls.first().startsWith("create:kCGAnnotatedSessionEventTap:"))

        val hidNative = RecordingEventTapNative()
        assertFailsWith<IllegalArgumentException> {
            CGListenOnlyEventTap.install(
                mask = 1L,
                location = CGEventTapLocation.kCGHIDEventTap,
                native = hidNative,
                handler = {},
            )
        }
        assertTrue(hidNative.calls.isEmpty())
    }

    @Test
    fun closeDefersCoreFoundationReleaseUntilAnAdmittedCallbackReturns() {
        val native = RecordingEventTapNative()
        val entered = CountDownLatch(1)
        val resume = CountDownLatch(1)
        val invocations = AtomicInteger()
        val tap = CGListenOnlyEventTap.install(1L, native) {
            invocations.incrementAndGet()
            entered.countDown()
            assertTrue(resume.await(5, TimeUnit.SECONDS))
        }
        val executor = Executors.newSingleThreadExecutor()

        try {
            val delivery = executor.submit<MemorySegment> {
                native.emit(CGEventType.kCGEventKeyDown, 0x1234)
            }
            assertTrue(entered.await(5, TimeUnit.SECONDS))

            tap.close()

            assertTrue(tap.isClosed)
            assertFalse(tap.isQuiescent)
            assertEquals(1, invocations.get())
            assertEquals(
                listOf("remove:768:512:1024", "enable:256:false"),
                native.calls.takeLast(2),
            )
            assertEquals(MemorySegment.NULL, native.emit(CGEventType.kCGEventKeyUp, 0x5678))
            assertEquals(1, invocations.get())

            resume.countDown()
            assertEquals(0x1234, delivery.get(5, TimeUnit.SECONDS).address())

            assertTrue(tap.isQuiescent)
            assertEquals(listOf("release:512", "release:256"), native.calls.takeLast(2))
        } finally {
            resume.countDown()
            tap.close()
            executor.shutdownNow()
        }
    }

    @Test
    fun handlerFailureIsContainedAndStillReturnsTheBorrowedEventUnchanged() {
        val native = RecordingEventTapNative()
        val tap = CGListenOnlyEventTap.install(1L, native) {
            throw IllegalStateException("observer failed")
        }

        try {
            assertEquals(
                0xABCD,
                native.emit(CGEventType.kCGEventKeyDown, 0xABCD).address(),
            )
        } finally {
            tap.close()
        }
    }

    @Test
    fun installationFailureReleasesTapWhenSourceReleaseFailsAndSuppressesCleanupFailure() {
        val installFailure = IllegalStateException("enable failed")
        val sourceReleaseFailure = IllegalArgumentException("source release failed")
        val native = RecordingEventTapNative(
            enableFailure = installFailure,
            sourceReleaseFailure = sourceReleaseFailure,
        )

        val thrown = assertFailsWith<IllegalStateException> {
            CGListenOnlyEventTap.install(1L, native) {}
        }

        assertSame(installFailure, thrown)
        assertEquals(listOf(sourceReleaseFailure), thrown.suppressed.toList())
        assertEquals(listOf("release:512", "release:256"), native.calls.takeLast(2))
        assertTrue(native.callbackWasClosedBeforeRelease)
    }

    @Test
    fun nativeHarnessDoesNotPromptAndOnlyInstallsWhenPermissionIsAlreadyGranted() {
        assumeTrue(System.getProperty("os.name").contains("Mac", ignoreCase = true))
        val permission = CGListenOnlyEventTap.preflight()
        assumeTrue(permission == EventTapPermissionState.Granted)

        CGListenOnlyEventTap.install(1L shl CGEventType.kCGEventMouseMoved.value.toInt()) {}.use { tap ->
            assertFalse(tap.isClosed)
        }
    }
}

private class RecordingEventTapNative(
    private val permissionGranted: Boolean = true,
    private val enableFailure: Throwable? = null,
    private val sourceReleaseFailure: Throwable? = null,
) : CGEventTapNative {
    val calls = mutableListOf<String>()
    var callbackWasClosedBeforeRelease = false
        private set
    private lateinit var callback: ManagedCFunctionNativeHandle

    override fun preflight(): Boolean {
        calls += "preflight"
        return permissionGranted
    }

    override fun createTap(
        location: CGEventTapLocation,
        placement: CGEventTapPlacement,
        options: CGEventTapOptions,
        mask: Long,
        callback: ManagedCFunctionNativeHandle,
    ): Long {
        calls += "create:${location.name}:${placement.name}:${options.name}:$mask"
        this.callback = callback
        return 0x100
    }

    override fun createRunLoopSource(tap: Long): Long {
        calls += "source:$tap"
        return 0x200
    }

    override fun currentRunLoop(): Long {
        calls += "runLoop"
        return 0x300
    }

    override fun commonModes(): Long {
        calls += "commonModes"
        return 0x400
    }

    override fun addSource(runLoop: Long, source: Long, modes: Long) {
        calls += "add:$runLoop:$source:$modes"
    }

    override fun removeSource(runLoop: Long, source: Long, modes: Long) {
        calls += "remove:$runLoop:$source:$modes"
    }

    override fun enableTap(tap: Long, enabled: Boolean) {
        calls += "enable:$tap:$enabled"
        if (enabled) enableFailure?.let { throw it }
    }

    override fun release(handle: Long) {
        calls += "release:$handle"
        if (handle == 0x200L) {
            callbackWasClosedBeforeRelease =
                emit(CGEventType.kCGEventMouseMoved, 0xDEAD) == MemorySegment.NULL
            sourceReleaseFailure?.let { throw it }
        }
    }

    fun emit(type: CGEventType, address: Long): MemorySegment {
        val downcall = Linker.nativeLinker().downcallHandle(
            callback.callback,
            FunctionDescriptor.of(
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
            ),
        )
        return downcall.invokeExact(
            MemorySegment.NULL,
            type.value.toInt(),
            MemorySegment.ofAddress(address),
            callback.userdata,
        ) as MemorySegment
    }
}
