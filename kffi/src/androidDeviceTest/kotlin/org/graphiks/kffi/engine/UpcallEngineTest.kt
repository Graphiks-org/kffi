package org.graphiks.kffi.engine

import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test

class UpcallEngineTest {

    private companion object {
        private var fixtureHandle = 0L
    }

    @Before
    fun setUp() {
        if (fixtureHandle == 0L) {
            System.loadLibrary("kffi")
            val nativeLibraryDir = InstrumentationRegistry.getInstrumentation()
                .targetContext.applicationInfo.nativeLibraryDir
            fixtureHandle =
                NativeEngine.loadNativeLibrary("$nativeLibraryDir/libkffi_bench_fixture.so")
            check(fixtureHandle != 0L) { "kffi: failed to dlopen libkffi_bench_fixture.so" }
        }
    }

    private fun resolve(name: String): Long = NativeEngine.resolveSymbolIn(fixtureHandle, name)

    private fun allocateDispatchTrampoline(
        dispatchMethod: String,
        dispatchJvmSignature: String,
        dispatchAbiSignature: String,
    ): Long {
        val trampoline = UpcallEngine.allocateTrampoline(
            dispatcherClass = UpcallDispatcher::class.java,
            dispatchMethod = dispatchMethod,
            dispatchJvmSignature = dispatchJvmSignature,
            dispatchAbiSignature = dispatchAbiSignature,
        )
        check(trampoline != 0L) { "kffi: allocateTrampoline returned null trampoline" }
        return trampoline
    }

    private fun allocateLegacyDispatchTrampoline(
        dispatchMethod: String,
        dispatchSig: String,
    ): Long {
        val trampoline = UpcallEngine.allocateTrampoline(
            dispatcherClass = UpcallDispatcher::class.java,
            dispatchMethod = dispatchMethod,
            dispatchSig = dispatchSig,
        )
        check(trampoline != 0L) { "kffi: allocateTrampoline returned null trampoline" }
        return trampoline
    }

    private fun verifyValidAllocationStillWorks() {
        val trampoline = allocateLegacyDispatchTrampoline(
            dispatchMethod = "dispatch",
            dispatchSig = "(JI)V",
        )
        UpcallEngine.freeTrampoline(trampoline)
    }

    @Test
    fun callbackFiresFromNativeIntoKotlinLambda() {
        val registration = UpcallDispatcher.register()
        var trampoline = 0L
        try {
            trampoline = allocateDispatchTrampoline(
                dispatchMethod = "dispatch",
                dispatchJvmSignature = "(JI)V",
                dispatchAbiSignature = "v(u32,ptr)",
            )
            val setFn = resolve("bench_set_callback")
            val fireFn = resolve("bench_fire_one")
            // bench_set_callback(callback_fn, routing_userdata) — userdata carries the token.
            NativeEngine.callV2PP(setFn, trampoline, registration.userdata!!.rawValue)
            NativeEngine.callV1I(fireFn, 42)
            assertEquals(42, UpcallDispatcher.lastValue)
        } finally {
            UpcallDispatcher.lastValue = -1
            registration.close()
            if (trampoline != 0L) {
                UpcallEngine.freeTrampoline(trampoline)
            }
        }
    }

    @Test
    fun callbackFiresFromDetachedNativeThread() {
        val registration = UpcallDispatcher.register()
        var trampoline = 0L
        try {
            trampoline = allocateDispatchTrampoline(
                dispatchMethod = "dispatch",
                dispatchJvmSignature = "(JI)V",
                dispatchAbiSignature = "v(u32,ptr)",
            )
            val setFn = resolve("bench_set_callback")
            val fireFromThreadFn = resolve("bench_fire_one_from_thread")
            NativeEngine.callV2PP(setFn, trampoline, registration.userdata!!.rawValue)
            // The fixture spawns a detached pthread that waits on a gate, then fires.
            NativeEngine.callV1I(fireFromThreadFn, 7)
            assertEquals(7, UpcallDispatcher.lastValue)
        } finally {
            UpcallDispatcher.lastValue = -1
            registration.close()
            if (trampoline != 0L) {
                UpcallEngine.freeTrampoline(trampoline)
            }
        }
    }

    @Test
    fun callbackFiresFullAbiAndCopiesStructMessage() {
        val registration = UpcallDispatcher.register()
        var trampoline = 0L
        try {
            trampoline = allocateDispatchTrampoline(
                dispatchMethod = "dispatchAllTypes",
                dispatchJvmSignature = "(JBBSSIIJJFDJJJJ)V",
                dispatchAbiSignature = "v(i8,u8,i16,u16,i32,u32,i64,u64,float,double,ptr,struct(ptr,size_t),size_t,uintptr_t,ptr)",
            )
            val setFn = resolve("bench_set_all_types_callback")
            val fireFn = resolve("bench_fire_all_types")
            NativeEngine.callV2PP(setFn, trampoline, registration.userdata!!.rawValue)
            NativeEngine.callV0(fireFn)

            val captured = requireNotNull(UpcallDispatcher.lastAllTypes)
            assertEquals(registration.userdata!!.rawValue, captured.token)
            assertEquals((-8).toByte(), captured.i8)
            assertEquals(248, captured.u8.toUByte().toInt())
            assertEquals((-16000).toShort(), captured.i16)
            assertEquals(60000, captured.u16.toUShort().toInt())
            assertEquals(-1234567, captured.i32)
            assertEquals(0xfedcba98u.toInt(), captured.u32)
            assertEquals(0xfedcba98u, captured.u32.toUInt())
            assertEquals(-0x102030405060708L, captured.i64)
            assertEquals(java.lang.Long.parseUnsignedLong("fedcba9876543210", 16), captured.u64)
            assertEquals(1.25f, captured.f32, 0f)
            assertEquals(-2.5, captured.f64, 0.0)
            assertEquals(0x1234L, captured.pointer)
            assertEquals("WebGPU", captured.message)
            assertEquals(6, captured.messageLength)
            assertTrue(captured.messageAddressWasNonZero)
            assertEquals(6L, captured.size)
            assertEquals(0x5678L, captured.address)
        } finally {
            UpcallDispatcher.lastAllTypes = null
            registration.close()
            if (trampoline != 0L) {
                UpcallEngine.freeTrampoline(trampoline)
            }
        }
    }

    @Test
    fun callbackReturnsScalarValueThroughRoutedDispatcher() {
        val registration = UpcallDispatcher.register()
        var trampoline = 0L
        try {
            trampoline = allocateDispatchTrampoline(
                dispatchMethod = "dispatchReturn",
                dispatchJvmSignature = "(JI)I",
                dispatchAbiSignature = "u32(u32,ptr)",
            )
            val setFn = resolve("bench_set_return_callback")
            val fireFn = resolve("bench_fire_return")
            NativeEngine.callV2PP(setFn, trampoline, registration.userdata!!.rawValue)

            assertEquals(42L, NativeEngine.callI1I(fireFn, 41))
        } finally {
            registration.close()
            if (trampoline != 0L) {
                UpcallEngine.freeTrampoline(trampoline)
            }
        }
    }

    @Test
    fun allocateTrampolineRejectsMalformedAbiSignatureAndReusesSlot() {
        try {
            repeat(257) {
                try {
                    UpcallEngine.allocateTrampoline(
                        dispatcherClass = UpcallDispatcher::class.java,
                        dispatchMethod = "dispatchReturn",
                        dispatchJvmSignature = "(JI)I",
                        dispatchAbiSignature = "u32(u32,ptr",
                    )
                    fail("allocateTrampoline must reject a malformed ABI signature")
                } catch (_: IllegalArgumentException) {
                    // Expected.
                }
            }
        } finally {
            verifyValidAllocationStillWorks()
        }
    }

    @Test
    fun allocateTrampolineRejectsAbiJvmParameterCountMismatchAndReusesSlot() {
        try {
            try {
                UpcallEngine.allocateTrampoline(
                    dispatcherClass = UpcallDispatcher::class.java,
                    dispatchMethod = "dispatchReturnCountMismatch",
                    dispatchJvmSignature = "(JII)I",
                    dispatchAbiSignature = "u32(u32,ptr)",
                )
                fail("allocateTrampoline must reject an ABI/JVM parameter count mismatch")
            } catch (_: IllegalArgumentException) {
                // Expected.
            }
        } finally {
            verifyValidAllocationStillWorks()
        }
    }

    @Test
    fun allocateTrampolineRejectsRoutedDispatcherWithoutLeadingJAndReusesSlot() {
        try {
            try {
                UpcallEngine.allocateTrampoline(
                    dispatcherClass = UpcallDispatcher::class.java,
                    dispatchMethod = "dispatchReturnMissingLeadingJ",
                    dispatchJvmSignature = "(IJ)I",
                    dispatchAbiSignature = "u32(u32,ptr)",
                )
                fail("allocateTrampoline must reject a routed dispatcher without a leading J")
            } catch (_: IllegalArgumentException) {
                // Expected.
            }
        } finally {
            verifyValidAllocationStillWorks()
        }
    }

    @Test
    fun allocateTrampolineRejectsStructReturnSignatureAndReusesSlot() {
        try {
            try {
                UpcallEngine.allocateTrampoline(
                    dispatcherClass = UpcallDispatcher::class.java,
                    dispatchMethod = "dispatchStructReturn",
                    dispatchJvmSignature = "(JI)J",
                    dispatchAbiSignature = "struct(u32)(u32,ptr)",
                )
                fail("allocateTrampoline must reject a struct return signature")
            } catch (_: IllegalArgumentException) {
                // Expected.
            }
        } finally {
            verifyValidAllocationStillWorks()
        }
    }
}
