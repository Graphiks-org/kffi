package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.CGDisplayChangeSummaryFlags
import org.graphiks.kffi.objc.CGEventType
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.ref.Reference
import java.lang.ref.WeakReference
import java.util.concurrent.Callable
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class ManagedCFunctionTest {
    @Test
    fun eventTapDeliversABorrowedEventAndReturnsTheHandlerResult() {
        var observedType: CGEventType? = null
        var observedEvent: BorrowedCGEvent? = null
        val callback = ManagedCFunctions.eventTap { type, event ->
            observedType = type
            observedEvent = event
            event
        }

        try {
            val event = address(0x1234)
            val returned = ManagedCFunctionFixture.invokeEventTap(
                callback.eventTapNativeHandle(),
                CGEventType.kCGEventKeyDown.value.toInt(),
                event,
            )

            assertEquals(CGEventType.kCGEventKeyDown, observedType)
            assertEquals(event, observedEvent?.native)
            assertEquals(event, returned)
        } finally {
            callback.close()
        }
    }

    @Test
    fun displayReconfigurationDeliversTypedDisplayAndFlags() {
        var observedDisplay = 0
        var observedFlags = CGDisplayChangeSummaryFlags(0)
        val callback = ManagedCFunctions.displayReconfiguration { display, flags ->
            observedDisplay = display
            observedFlags = flags
        }

        try {
            ManagedCFunctionFixture.invokeDisplayReconfiguration(
                callback.displayReconfigurationNativeHandle(),
                display = 73,
                flags = 0x810,
            )

            assertEquals(73, observedDisplay)
            assertEquals(CGDisplayChangeSummaryFlags(0x810), observedFlags)
        } finally {
            callback.close()
        }
    }

    @Test
    fun hidLifecycleEntryPointsDeliverImmutableRegistrySnapshots() {
        val observations = mutableListOf<HidDeviceEvent>()
        val callback = ManagedCFunctions.hidDeviceLifecycle { event -> observations += event }

        try {
            val handles = callback.hidDeviceLifecycleNativeHandles()
            ManagedCFunctionFixture.invokeHidLifecycle(handles.connected, 0x1122334455667788L)
            ManagedCFunctionFixture.invokeHidLifecycle(handles.disconnected, 0x8877665544332211uL.toLong())

            assertEquals(
                listOf(
                    HidDeviceEvent(0x1122334455667788L, connected = true),
                    HidDeviceEvent(0x8877665544332211uL.toLong(), connected = false),
                ),
                observations,
            )
        } finally {
            callback.close()
        }
    }

    @Test
    fun closeRevokesEveryEntryPointAndEventTapFallsBackToNull() {
        val eventInvocations = AtomicInteger()
        val displayInvocations = AtomicInteger()
        val hidInvocations = AtomicInteger()
        val eventTap = ManagedCFunctions.eventTap { _, event ->
            eventInvocations.incrementAndGet()
            event
        }
        val display = ManagedCFunctions.displayReconfiguration { _, _ ->
            displayInvocations.incrementAndGet()
        }
        val hid = ManagedCFunctions.hidDeviceLifecycle {
            hidInvocations.incrementAndGet()
        }
        val eventTapHandle = eventTap.eventTapNativeHandle()
        val displayHandle = display.displayReconfigurationNativeHandle()
        val hidHandles = hid.hidDeviceLifecycleNativeHandles()

        eventTap.close()
        display.close()
        hid.close()
        eventTap.close()
        display.close()
        hid.close()

        val returned = ManagedCFunctionFixture.invokeEventTap(
            eventTapHandle,
            CGEventType.kCGEventKeyDown.value.toInt(),
            address(0x4567),
        )
        ManagedCFunctionFixture.invokeDisplayReconfiguration(displayHandle, 12, 16)
        ManagedCFunctionFixture.invokeHidLifecycle(hidHandles.connected, 99)
        ManagedCFunctionFixture.invokeHidLifecycle(hidHandles.disconnected, 99)

        assertEquals(MemorySegment.NULL, returned)
        assertEquals(0, eventInvocations.get())
        assertEquals(0, displayInvocations.get())
        assertEquals(0, hidInvocations.get())
        assertTrue(eventTap.isQuiescentForManagedAdapter())
        assertTrue(display.isQuiescentForManagedAdapter())
        assertTrue(hid.isQuiescentForManagedAdapter())
    }

    @Test
    fun callbackFailureIsContainedAndUsesTheEventTapAbiFallback() {
        val expected = IllegalStateException("event tap failed")
        var borrowed: BorrowedCGEvent? = null
        val callback = ManagedCFunctions.eventTap { _, event ->
            borrowed = event
            throw expected
        }

        try {
            val returned = ManagedCFunctionFixture.invokeEventTap(
                callback.eventTapNativeHandle(),
                CGEventType.kCGEventMouseMoved.value.toInt(),
                address(0x9876),
            )

            assertEquals(0x9876, borrowed?.native?.address())
            assertEquals(MemorySegment.NULL, returned)
        } finally {
            callback.close()
        }
    }

    @Test
    fun concurrentCloseRevokesAdmissionWhileAnAdmittedCallbackReachesQuiescence() {
        val entered = CountDownLatch(1)
        val resume = CountDownLatch(1)
        val completed = CountDownLatch(1)
        val invocations = AtomicInteger()
        val callback = ManagedCFunctions.eventTap { _, event ->
            invocations.incrementAndGet()
            entered.countDown()
            assertTrue(resume.await(5, TimeUnit.SECONDS))
            completed.countDown()
            event
        }
        val handle = callback.eventTapNativeHandle()
        val executor = Executors.newFixedThreadPool(3)

        try {
            val delivery = executor.submit(Callable {
                ManagedCFunctionFixture.invokeEventTap(
                    handle,
                    CGEventType.kCGEventLeftMouseDown.value.toInt(),
                    address(0xCAFE),
                )
            })
            assertTrue(entered.await(5, TimeUnit.SECONDS))

            val firstClose = executor.submit { callback.close() }
            val secondClose = executor.submit { callback.close() }
            firstClose.get(5, TimeUnit.SECONDS)
            secondClose.get(5, TimeUnit.SECONDS)

            assertFalse(callback.isQuiescentForManagedAdapter())
            assertEquals(
                MemorySegment.NULL,
                ManagedCFunctionFixture.invokeEventTap(
                    handle,
                    CGEventType.kCGEventLeftMouseUp.value.toInt(),
                    address(0xBEEF),
                ),
            )
            assertEquals(1, invocations.get())

            resume.countDown()
            assertEquals(address(0xCAFE), delivery.get(5, TimeUnit.SECONDS))
            assertTrue(completed.await(5, TimeUnit.SECONDS))
            assertTrue(callback.isQuiescentForManagedAdapter())
        } finally {
            resume.countDown()
            callback.close()
            executor.shutdownNow()
        }
    }

    @Test
    fun quiescenceDetachesTheHandlerWhileTheClosedOwnerRemainsReachable() {
        val probe = closedOwnerAndHandlerReference()

        assertEventuallyCollected(probe.handler)
        Reference.reachabilityFence(probe.owner)
    }

    private fun address(value: Long): MemorySegment = MemorySegment.ofAddress(value)

    private fun closedOwnerAndHandlerReference(): ClosedHandlerProbe {
        val instance = CollectableEventTapHandler()
        var handler: CollectableEventTapHandler? = instance
        val reference = WeakReference(instance)
        val owner = ManagedCFunctions.eventTap(requireNotNull(handler))
        owner.close()
        check(owner.isQuiescentForManagedAdapter())
        handler = null
        return ClosedHandlerProbe(owner, reference)
    }

    private fun assertEventuallyCollected(reference: WeakReference<*>) {
        val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(10)
        val pressure = ArrayDeque<ByteArray>()
        while (reference.get() != null && System.nanoTime() < deadline) {
            System.gc()
            pressure += ByteArray(1024 * 1024)
            if (pressure.size > 16) pressure.removeFirst()
            Thread.sleep(25)
        }
        assertNull(reference.get(), "callback handler remained reachable after quiescence")
    }
}

private data class ClosedHandlerProbe(
    val owner: ManagedCFunction,
    val handler: WeakReference<CollectableEventTapHandler>,
)

private class CollectableEventTapHandler :
    (CGEventType, BorrowedCGEvent) -> BorrowedCGEvent {
    override fun invoke(type: CGEventType, event: BorrowedCGEvent): BorrowedCGEvent = event
}

private object ManagedCFunctionFixture {
    private val linker = Linker.nativeLinker()

    fun invokeEventTap(
        handle: ManagedCFunctionNativeHandle,
        type: Int,
        event: MemorySegment,
    ): MemorySegment {
        val downcall = linker.downcallHandle(
            handle.callback,
            FunctionDescriptor.of(
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
            ),
        )
        return downcall.invokeExact(MemorySegment.NULL, type, event, handle.userdata) as MemorySegment
    }

    fun invokeDisplayReconfiguration(
        handle: ManagedCFunctionNativeHandle,
        display: Int,
        flags: Int,
    ) {
        val downcall = linker.downcallHandle(
            handle.callback,
            FunctionDescriptor.ofVoid(
                ValueLayout.JAVA_INT,
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
            ),
        )
        downcall.invokeExact(display, flags, handle.userdata)
    }

    fun invokeHidLifecycle(handle: ManagedCFunctionNativeHandle, registryId: Long) {
        val downcall = linker.downcallHandle(
            handle.callback,
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
        )
        downcall.invokeExact(registryId, handle.userdata)
    }
}
