package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.ConcurrentLinkedQueue
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

class ObjCManagedClassTest {
    @Test
    fun twoInstancesRouteOneSelectorToDifferentHandlersThroughObjCRuntime() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiShouldAccept:" to ObjCMethodSignatures.BooleanObject),
        )
        val first = managedClass.createInstance {
            onBooleanObject("kffiShouldAccept:", fallback = false) { true }
        }
        val second = managedClass.createInstance {
            onBooleanObject("kffiShouldAccept:", fallback = true) { false }
        }

        try {
            assertTrue(sendBoolean(first, "kffiShouldAccept:"))
            assertFalse(sendBoolean(second, "kffiShouldAccept:"))
        } finally {
            first.close()
            second.close()
        }
    }

    @Test
    fun oneInstanceRoutesSelectorsIndependentlyByNativeSel() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf(
                "kffiFirst:" to ObjCMethodSignatures.VoidObject,
                "kffiSecond:" to ObjCMethodSignatures.VoidObject,
            ),
        )
        val calls = mutableListOf<String>()
        val instance = managedClass.createInstance {
            onVoidObject("kffiFirst:") { calls += "first" }
            onVoidObject("kffiSecond:") { calls += "second" }
        }

        try {
            ObjCRuntime.msgSend(
                null,
                instance.receiver.ptr,
                ObjCRuntime.sel("kffiSecond:"),
                MemorySegment.NULL,
            )
            ObjCRuntime.msgSend(
                null,
                instance.receiver.ptr,
                ObjCRuntime.sel("kffiFirst:"),
                MemorySegment.NULL,
            )

            assertEquals(listOf("second", "first"), calls)
        } finally {
            instance.close()
        }
    }

    @Test
    fun allFourFiniteAbiShapesCrossTheObjectiveCRuntime() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf(
                "kffiConsume:" to ObjCMethodSignatures.VoidObject,
                "kffiAccept:" to ObjCMethodSignatures.BooleanObject,
                "kffiPing" to ObjCMethodSignatures.Void,
                "kffiUnsignedValue:" to ObjCMethodSignatures.ULongObject,
            ),
        )
        val calls = mutableListOf<String>()
        val instance = managedClass.createInstance {
            onVoidObject("kffiConsume:") { calls += "object:${it.ptr.address()}" }
            onBooleanObject("kffiAccept:", fallback = false) { it.ptr == MemorySegment.NULL }
            onVoid("kffiPing") { calls += "void" }
            onULongObject("kffiUnsignedValue:", fallback = 0L) { 42L }
        }

        try {
            ObjCRuntime.msgSend(
                null,
                instance.receiver.ptr,
                ObjCRuntime.sel("kffiConsume:"),
                MemorySegment.NULL,
            )
            val accepted = ObjCRuntime.msgSend(
                ValueLayout.JAVA_BOOLEAN,
                instance.receiver.ptr,
                ObjCRuntime.sel("kffiAccept:"),
                MemorySegment.NULL,
            ) as Boolean
            ObjCRuntime.msgSend(
                null,
                instance.receiver.ptr,
                ObjCRuntime.sel("kffiPing"),
            )
            val value = ObjCRuntime.msgSend(
                ValueLayout.JAVA_LONG,
                instance.receiver.ptr,
                ObjCRuntime.sel("kffiUnsignedValue:"),
                MemorySegment.NULL,
            ) as Long

            assertEquals(listOf("object:0", "void"), calls)
            assertTrue(accepted)
            assertEquals(42L, value)
        } finally {
            instance.close()
        }
    }

    @Test
    fun exceptionIsReportedAndReturnsBindingFallback() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiThrowingDecision:" to ObjCMethodSignatures.BooleanObject),
        )
        val failures = ConcurrentLinkedQueue<Throwable>()
        val expected = IllegalStateException("managed callback failed")
        val instance = managedClass.createInstance(
            onError = CallbackExceptionHandler(failures::add),
        ) {
            onBooleanObject("kffiThrowingDecision:", fallback = true) { throw expected }
        }

        try {
            val result = sendBoolean(instance, "kffiThrowingDecision:")

            assertTrue(result)
            assertSame(expected, failures.single())
        } finally {
            instance.close()
        }
    }

    @Test
    fun messageAfterCloseDoesNotInvokeHandlerAndReturnsAbiZero() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiClosedDecision:" to ObjCMethodSignatures.BooleanObject),
        )
        val invocations = AtomicInteger()
        val instance = managedClass.createInstance {
            onBooleanObject("kffiClosedDecision:", fallback = true) {
                invocations.incrementAndGet()
                true
            }
        }
        ObjCRuntime.msgSend(
            ValueLayout.ADDRESS,
            instance.receiver.ptr,
            ObjCRuntime.sel("retain"),
        )

        try {
            instance.close()

            assertFalse(sendBoolean(instance, "kffiClosedDecision:"))
            assertEquals(0, invocations.get())
        } finally {
            ObjCRuntime.msgSend(null, instance.receiver.ptr, ObjCRuntime.sel("release"))
        }
    }

    @Test
    fun concurrentRegisterOnceReturnsOneNativeClass() {
        requireMacOS()
        val start = CountDownLatch(1)
        val executor = Executors.newFixedThreadPool(8)
        try {
            val registrations = (0 until 32).map {
                executor.submit<ObjCManagedClass> {
                    assertTrue(start.await(10, TimeUnit.SECONDS))
                    ObjCManagedClass.registerOnce(
                        methods = mapOf("kffiConcurrent:" to ObjCMethodSignatures.VoidObject),
                    )
                }
            }

            start.countDown()
            val nativeAddresses = registrations.map { it.get(10, TimeUnit.SECONDS).nativeClass.address() }.toSet()

            assertEquals(1, nativeAddresses.size)
        } finally {
            executor.shutdownNow()
        }
    }

    @Test
    fun instanceConfigurationRequiresEveryDeclaredSelectorExactlyOnce() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf(
                "kffiRequired:" to ObjCMethodSignatures.VoidObject,
                "kffiOther:" to ObjCMethodSignatures.VoidObject,
            ),
        )

        assertFailsWith<IllegalArgumentException> {
            managedClass.createInstance {
                onVoidObject("kffiRequired:") {}
            }
        }
        assertFailsWith<IllegalArgumentException> {
            managedClass.createInstance {
                onVoidObject("kffiRequired:") {}
                onVoidObject("kffiOther:") {}
                onVoidObject("kffiExtra:") {}
            }
        }
        assertFailsWith<IllegalArgumentException> {
            managedClass.createInstance {
                onVoidObject("kffiRequired:") {}
                onVoidObject("kffiRequired:") {}
                onVoidObject("kffiOther:") {}
            }
        }
    }

    private fun sendBoolean(instance: ObjCManagedInstance, selector: String): Boolean =
        ObjCRuntime.msgSend(
            ValueLayout.JAVA_BOOLEAN,
            instance.receiver.ptr,
            ObjCRuntime.sel(selector),
            MemorySegment.NULL,
        ) as Boolean

    private fun requireMacOS() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )
    }
}
