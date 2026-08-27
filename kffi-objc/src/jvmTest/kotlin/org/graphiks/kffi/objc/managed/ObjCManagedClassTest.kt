package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.ObjCSubclassing
import org.graphiks.kffi.engine.JvmUpcallEngine
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
    fun nsViewAcceptsFirstResponderCrossesTheObjectiveCRuntime() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            superclassName = "NSView",
            methods = mapOf("acceptsFirstResponder" to ObjCMethodSignatures.Boolean),
        )
        val instance = managedClass.createInstance {
            onBoolean("acceptsFirstResponder", fallback = false) { true }
        }

        try {
            assertTrue(sendNoArgumentBoolean(instance, "acceptsFirstResponder"))
        } finally {
            instance.close()
        }
    }

    @Test
    fun noArgumentBooleanExceptionIsReportedAndReturnsBindingFallback() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiThrowingNoArgumentDecision" to ObjCMethodSignatures.Boolean),
        )
        val failures = ConcurrentLinkedQueue<Throwable>()
        val expected = IllegalStateException("managed no-argument callback failed")
        val instance = managedClass.createInstance(
            onError = CallbackExceptionHandler(failures::add),
        ) {
            onBoolean("kffiThrowingNoArgumentDecision", fallback = true) { throw expected }
        }

        try {
            assertTrue(sendNoArgumentBoolean(instance, "kffiThrowingNoArgumentDecision"))
            assertSame(expected, failures.single())
        } finally {
            instance.close()
        }
    }

    @Test
    fun noArgumentBooleanMessageAfterCloseDoesNotInvokeHandlerAndReturnsAbiZero() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiClosedNoArgumentDecision" to ObjCMethodSignatures.Boolean),
        )
        val invocations = AtomicInteger()
        val instance = managedClass.createInstance {
            onBoolean("kffiClosedNoArgumentDecision", fallback = true) {
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

            assertFalse(sendNoArgumentBoolean(instance, "kffiClosedNoArgumentDecision"))
            assertEquals(0, invocations.get())
        } finally {
            ObjCRuntime.msgSend(null, instance.receiver.ptr, ObjCRuntime.sel("release"))
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

    @Test
    fun publicLifecycleDelegatesClosureQuiescenceAndOneShotActions() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiLifecycle" to ObjCMethodSignatures.Void),
        )
        val instance = managedClass.createInstance {
            onVoid("kffiLifecycle") {}
        }
        val registeredBeforeClose = AtomicInteger()
        val registeredAfterClose = AtomicInteger()
        instance.onQuiescent { registeredBeforeClose.incrementAndGet() }

        assertFalse(instance.isClosed)
        assertFalse(instance.isQuiescent)

        instance.close()
        instance.close()

        assertTrue(instance.isClosed)
        assertTrue(instance.isQuiescent)
        assertEquals(1, registeredBeforeClose.get())

        instance.onQuiescent { registeredAfterClose.incrementAndGet() }
        instance.close()

        assertEquals(1, registeredAfterClose.get())
    }

    @Test
    fun trampolineContainsFailureBeforeRouteLookupAndReturnsAbiZero() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiBoundaryBeforeLookup:" to ObjCMethodSignatures.BooleanObject),
        )
        val invocations = AtomicInteger()
        val instance = managedClass.createInstance {
            onBooleanObject("kffiBoundaryBeforeLookup:", fallback = true) {
                invocations.incrementAndGet()
                true
            }
        }
        val expected = IllegalStateException("failure before native route lookup")
        val failures = ConcurrentLinkedQueue<Throwable>()
        val thread = Thread.currentThread()
        val previousHandler = thread.uncaughtExceptionHandler
        val seam = ObjCMethodDispatch.installBeforeRouteLookupForTest { throw expected }

        try {
            thread.uncaughtExceptionHandler = Thread.UncaughtExceptionHandler { _, failure ->
                failures += failure
            }

            assertFalse(sendBoolean(instance, "kffiBoundaryBeforeLookup:"))
            assertSame(expected, failures.single())
            assertEquals(0, invocations.get())
        } finally {
            seam.close()
            thread.uncaughtExceptionHandler = previousHandler
            instance.close()
        }
    }

    @Test
    fun trampolineUsesRouteReporterAndExplicitFallbackAfterRouteLookup() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiBoundaryBeforeAdmission:" to ObjCMethodSignatures.BooleanObject),
        )
        val invocations = AtomicInteger()
        val failures = ConcurrentLinkedQueue<Throwable>()
        val expected = IllegalStateException("failure before callback admission")
        val instance = managedClass.createInstance(
            onError = CallbackExceptionHandler(failures::add),
        ) {
            onBooleanObject("kffiBoundaryBeforeAdmission:", fallback = true) {
                invocations.incrementAndGet()
                false
            }
        }
        val seam = ObjCMethodDispatch.installBeforeCallbackAdmissionForTest { throw expected }

        try {
            assertTrue(sendBoolean(instance, "kffiBoundaryBeforeAdmission:"))
            assertSame(expected, failures.single())
            assertEquals(0, invocations.get())
        } finally {
            seam.close()
            instance.close()
        }
    }

    @Test
    fun nilInitializerDoesNotReleaseConsumedAllocResultAgain() {
        requireMacOS()
        NilInitializerFixture.consumedSelf.set(0)
        val managedClass = ObjCManagedClass.registerOnce(
            superclassName = NilInitializerFixture.registerSuperclass(),
            methods = mapOf("kffiNeverCalled:" to ObjCMethodSignatures.VoidObject),
        )
        val managedReleaseAttempts = AtomicInteger()

        ObjCManagedInstanceNativeLifetime.installReleaseOverrideForTest {
            managedReleaseAttempts.incrementAndGet()
        }.use {
            assertFailsWith<IllegalStateException> {
                managedClass.createInstance {
                    onVoidObject("kffiNeverCalled:") {}
                }
            }
        }

        assertEquals(1, NilInitializerFixture.consumedSelf.get())
        assertEquals(0, managedReleaseAttempts.get())
    }

    private fun sendBoolean(instance: ObjCManagedInstance, selector: String): Boolean =
        ObjCRuntime.msgSend(
            ValueLayout.JAVA_BOOLEAN,
            instance.receiver.ptr,
            ObjCRuntime.sel(selector),
            MemorySegment.NULL,
        ) as Boolean

    private fun sendNoArgumentBoolean(instance: ObjCManagedInstance, selector: String): Boolean =
        ObjCRuntime.msgSend(
            ValueLayout.JAVA_BOOLEAN,
            instance.receiver.ptr,
            ObjCRuntime.sel(selector),
        ) as Boolean

    private fun requireMacOS() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )
    }
}

private object NilInitializerFixture {
    private const val CLASS_NAME = "KFFIManagedNilInitializerFixture"

    val consumedSelf = AtomicInteger()

    private val initializer by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = NilInitializerFixture::class.java,
            dispatchMethod = "initReturningNil",
            dispatchSig = "(JJ)J",
        )
    }

    fun registerSuperclass(): String {
        if (ObjCManagedRuntime.lookupClassOrNull(CLASS_NAME) != MemorySegment.NULL) return CLASS_NAME
        val nativeClass = ObjCSubclassing.allocateClass("NSObject", CLASS_NAME)
        check(nativeClass != MemorySegment.NULL)
        check(
            ObjCSubclassing.addMethod(
                nativeClass,
                "init",
                MemorySegment.ofAddress(initializer.rawValue),
                "@@:",
            ),
        )
        ObjCSubclassing.registerClass(nativeClass)
        return CLASS_NAME
    }

    @JvmStatic
    fun initReturningNil(
        self: Long,
        @Suppress("UNUSED_PARAMETER") command: Long,
    ): Long {
        consumedSelf.incrementAndGet()
        ObjCRuntime.msgSend(
            null,
            MemorySegment.ofAddress(self),
            ObjCRuntime.sel("release"),
        )
        return 0L
    }
}
