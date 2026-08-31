package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.NSData
import org.graphiks.kffi.objc.NSDraggingInfo
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.NSPasteboard
import org.graphiks.kffi.objc.NSURL
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.reflect.Proxy
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicReference
import kotlin.concurrent.thread
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

class AppKitDropTransferTest {
    @Test
    fun copyToByteArrayRejectsOversizedDataBeforeReadingBytes() {
        val data = object : NSData(MemorySegment.NULL) {
            override fun length(): Long = 5L

            override fun bytes(): MemorySegment =
                error("bytes must not be queried after the length exceeds maxBytes")
        }

        assertFailsWith<IllegalArgumentException> {
            data.copyToByteArray(maxBytes = 4)
        }
    }

    @Test
    fun copyToByteArrayReturnsDetachedBytes() {
        val nativeBytes = byteArrayOf(0x10, 0x20, 0x30, 0x40)
        Arena.ofConfined().use { arena ->
            val storage = arena.allocate(nativeBytes.size.toLong())
            MemorySegment.copy(
                nativeBytes,
                0,
                storage,
                ValueLayout.JAVA_BYTE,
                0,
                nativeBytes.size,
            )
            val data = object : NSData(MemorySegment.NULL) {
                override fun length(): Long = nativeBytes.size.toLong()
                override fun bytes(): MemorySegment = storage
            }

            val copy = data.copyToByteArray(maxBytes = nativeBytes.size)
            storage.set(ValueLayout.JAVA_BYTE, 0, 0x7f.toByte())

            assertContentEquals(nativeBytes, copy)
        }
    }

    @Test
    fun draggingPasteboardIsAvailableOnlyInsideBorrowedScope() {
        val pasteboardPointer = MemorySegment.ofAddress(0x1234L)
        var draggingPasteboardCalls = 0
        val draggingInfo = Proxy.newProxyInstance(
            NSDraggingInfo::class.java.classLoader,
            arrayOf(NSDraggingInfo::class.java),
        ) { _, method, _ ->
            when (method.name) {
                "draggingPasteboard" -> {
                    draggingPasteboardCalls += 1
                    pasteboardPointer
                }

                else -> error("Unexpected NSDraggingInfo call: ${method.name}")
            }
        } as NSDraggingInfo
        lateinit var escaped: BorrowedNSDraggingInfo

        val result = draggingInfo.withBorrowed { borrowed ->
            escaped = borrowed
            assertFalse(NSPasteboard::class.java.isInstance(borrowed.draggingPasteboard()))
            "handled"
        }

        assertEquals("handled", result)
        assertEquals(1, draggingPasteboardCalls)
        assertFailsWith<IllegalStateException> {
            escaped.draggingPasteboard()
        }
        assertNoNativeObjectReferences(escaped)
        assertEquals(1, draggingPasteboardCalls)
    }

    @Test
    fun borrowedPasteboardExposesNoNativeObjectAndCannotOutliveScope() {
        val draggingInfo = draggingInfo { MemorySegment.ofAddress(0x2345L) }

        val escaped = draggingInfo.withBorrowed { it.draggingPasteboard() }

        assertFalse(NSPasteboard::class.java.isInstance(escaped))
        assertTrue(
            escaped.javaClass.methods.none { method ->
                method.name == "getPtr" ||
                    method.name == "retain" ||
                    method.returnType == MemorySegment::class.java ||
                    NSObject::class.java.isAssignableFrom(method.returnType)
            },
        )
        assertFailsWith<IllegalStateException> {
            escaped.copyDataForType("public.data", maxBytes = 16)
        }
        assertNoNativeObjectReferences(escaped)
    }

    @Test
    fun borrowedScopeWaitsForAdmittedCallsAndRejectsNewNativeCalls() {
        val firstNativeCallEntered = CountDownLatch(1)
        val allowFirstNativeCallToReturn = CountDownLatch(1)
        val scopeReturned = CountDownLatch(1)
        val nativeCallCount = AtomicInteger()
        val draggingInfo = draggingInfo {
            if (nativeCallCount.incrementAndGet() == 1) {
                firstNativeCallEntered.countDown()
                check(allowFirstNativeCallToReturn.await(5, TimeUnit.SECONDS)) {
                    "Timed out waiting to release the admitted native call"
                }
            }
            MemorySegment.ofAddress(0x3456L)
        }
        lateinit var escaped: BorrowedNSDraggingInfo
        lateinit var admittedCall: Thread
        val rejectedFailure = AtomicReference<Throwable?>()

        val scopeThread = thread(name = "borrowed-dragging-info-scope") {
            draggingInfo.withBorrowed { borrowed ->
                escaped = borrowed
                admittedCall = thread(name = "admitted-dragging-pasteboard-call") {
                    borrowed.draggingPasteboard()
                }
                check(firstNativeCallEntered.await(5, TimeUnit.SECONDS)) {
                    "Timed out waiting for the admitted native call"
                }
            }
            scopeReturned.countDown()
        }

        assertTrue(awaitThreadState(scopeThread, Thread.State.WAITING, 5, TimeUnit.SECONDS))
        assertEquals(1L, scopeReturned.count, "Scope returned before its admitted call completed")
        val rejectedCall = thread(name = "rejected-dragging-pasteboard-call") {
            try {
                escaped.draggingPasteboard()
            } catch (failure: Throwable) {
                rejectedFailure.set(failure)
            }
        }
        assertEquals(1, nativeCallCount.get(), "A native call began after scope invalidation")

        allowFirstNativeCallToReturn.countDown()
        assertTrue(scopeReturned.await(5, TimeUnit.SECONDS), "Borrowed scope did not finish")
        admittedCall.join(5_000)
        rejectedCall.join(5_000)
        scopeThread.join(5_000)
        assertTrue(rejectedFailure.get() is IllegalStateException)
        assertEquals(1, nativeCallCount.get(), "A native call began after scope invalidation")
        assertFalse(admittedCall.isAlive)
        assertFalse(rejectedCall.isAlive)
        assertFalse(scopeThread.isAlive)
    }

    @Test
    fun securityScopedAccessStopsAndReleasesExactlyOnce() {
        val calls = mutableListOf<String>()
        val url = object : NSURL(MemorySegment.ofAddress(0x5678L)) {
            override fun startAccessingSecurityScopedResource(): Boolean {
                calls += "start"
                return true
            }

            override fun stopAccessingSecurityScopedResource() {
                calls += "stop"
            }
        }
        SecurityScopedUrlNativeLifetime.installOverrideForTest(
            retain = { calls += "retain" },
            release = { calls += "release" },
        ).use {
            val access = requireNotNull(SecurityScopedUrlAccess.acquire(url))

            access.close()
            access.close()
        }

        assertEquals(listOf("retain", "start", "stop", "release"), calls)
    }

    @Test
    fun failedSecurityScopedAccessReleasesWithoutStopping() {
        val calls = mutableListOf<String>()
        val url = object : NSURL(MemorySegment.ofAddress(0x9abcL)) {
            override fun startAccessingSecurityScopedResource(): Boolean {
                calls += "start"
                return false
            }

            override fun stopAccessingSecurityScopedResource() {
                calls += "stop"
            }
        }
        SecurityScopedUrlNativeLifetime.installOverrideForTest(
            retain = { calls += "retain" },
            release = { calls += "release" },
        ).use {
            assertNull(SecurityScopedUrlAccess.acquire(url))
        }

        assertEquals(listOf("retain", "start", "release"), calls)
    }

    private fun draggingInfo(draggingPasteboard: () -> MemorySegment): NSDraggingInfo =
        Proxy.newProxyInstance(
            NSDraggingInfo::class.java.classLoader,
            arrayOf(NSDraggingInfo::class.java),
        ) { _, method, _ ->
            when (method.name) {
                "draggingPasteboard" -> draggingPasteboard()
                else -> error("Unexpected NSDraggingInfo call: ${method.name}")
            }
        } as NSDraggingInfo

    private fun awaitThreadState(
        target: Thread,
        state: Thread.State,
        timeout: Long,
        unit: TimeUnit,
    ): Boolean {
        val deadline = System.nanoTime() + unit.toNanos(timeout)
        while (System.nanoTime() < deadline) {
            if (target.state == state) return true
            if (!target.isAlive) return false
            Thread.onSpinWait()
        }
        return target.state == state
    }

    private fun assertNoNativeObjectReferences(value: Any) {
        value.javaClass.declaredFields
            .filter {
                NSObject::class.java.isAssignableFrom(it.type) ||
                    NSDraggingInfo::class.java.isAssignableFrom(it.type)
            }
            .forEach { field ->
                field.trySetAccessible()
                assertNull(field.get(value), "${value.javaClass.simpleName}.${field.name} retained a native wrapper")
            }
    }
}
