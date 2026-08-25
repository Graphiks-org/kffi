package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class ObjCSelectorCapabilityTest {
    @Test
    fun omittedSelectorIsNotReportedByTheObjectiveCRuntime() {
        requireMacOS()
        val instance = selectorFixture().createInstance {
            onVoidObject(INSTALLED_SELECTOR) {}
        }

        try {
            assertFalse(instance.receiver.respondsToSelector(OMITTED_SELECTOR))
        } finally {
            instance.close()
        }
    }

    @Test
    fun installedSelectorIsReportedByTheObjectiveCRuntime() {
        requireMacOS()
        val instance = selectorFixture().createInstance {
            onVoidObject(INSTALLED_SELECTOR) {}
        }

        try {
            assertTrue(instance.receiver.respondsToSelector(INSTALLED_SELECTOR))
        } finally {
            instance.close()
        }
    }

    @Test
    fun strongReferenceReleasesItsRetainExactlyOnce() {
        requireMacOS()
        val allocated = ObjCRuntime.msgSend(
            ValueLayout.ADDRESS,
            ObjCRuntime.getClass("NSObject"),
            ObjCRuntime.sel("alloc"),
        ) as MemorySegment
        val initialized = ObjCRuntime.msgSend(
            ValueLayout.ADDRESS,
            allocated,
            ObjCRuntime.sel("init"),
        ) as MemorySegment
        assertNotEquals(MemorySegment.NULL, initialized)
        val receiver = NSObject(initialized)

        try {
            val initialRetainCount = retainCount(receiver)
            val strong = receiver.retainStrong()
            assertEquals(initialRetainCount + 1L, retainCount(receiver))

            strong.close()
            assertEquals(initialRetainCount, retainCount(receiver))

            strong.close()
            assertEquals(initialRetainCount, retainCount(receiver))
        } finally {
            ObjCRuntime.msgSend(null, initialized, ObjCRuntime.sel("release"))
        }
    }

    private fun selectorFixture(): ObjCManagedClass = ObjCManagedClass.registerOnce(
        methods = mapOf(INSTALLED_SELECTOR to ObjCMethodSignatures.VoidObject),
    )

    private fun retainCount(receiver: NSObject): Long = ObjCRuntime.msgSend(
        ValueLayout.JAVA_LONG,
        receiver.ptr,
        ObjCRuntime.sel("retainCount"),
    ) as Long

    private fun requireMacOS() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )
    }

    private companion object {
        const val INSTALLED_SELECTOR = "kffiInstalledSelectorCapability:"
        const val OMITTED_SELECTOR = "kffiOmittedSelectorCapability:"
    }
}
