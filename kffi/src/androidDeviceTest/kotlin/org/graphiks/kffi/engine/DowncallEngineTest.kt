package org.graphiks.kffi.engine

import androidx.test.platform.app.InstrumentationRegistry
import java.nio.ByteBuffer
import java.nio.ByteOrder
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test

class DowncallEngineTest {

    companion object {
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

    @Test
    fun resolvesSymbolsAndCallsVoid0AndInt0() {
        val fn = resolve("bench_empty")
        assertEquals(42L, NativeEngine.callI0(fn))
        val voidFn = resolve("bench_void_takes_void")
        NativeEngine.callV0(voidFn)
    }

    @Test
    fun callI4IIIIAddsIntegers() {
        val fn = resolve("bench_add4")
        assertEquals(10L, NativeEngine.callI4IIII(fn, 1, 2, 3, 4))
    }

    @Test
    fun structByValueArgAndReturn() {
        val sum = resolve("bench_pair_sum")
        val buf = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder())
        buf.putLong(0, 7L); buf.putLong(8, 9L)
        val out = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder())
        val sumResult = NativeEngine.callStructArgL(sum, 16, NativeEngine.directBufferAddress(buf), 0L)
        assertEquals(16L, sumResult)

        val makePair = resolve("bench_make_pair")
        NativeEngine.callStructReturn(makePair, 7L, 9L, 16, NativeEngine.directBufferAddress(out))
        assertEquals(7L, out.getLong(0))
        assertEquals(9L, out.getLong(8))
    }

    @Test
    fun genericFallbackUsesDeclaredScalarWidths() {
        val fn = resolve("bench_add4")
        // Allocate the legacy 8-byte carriers as padding too: the pre-fix reader
        // incorrectly indexes them and must fail this assertion rather than read
        // past the direct buffer while this test is red.
        val args = ByteBuffer.allocateDirect(4 * 8).order(ByteOrder.nativeOrder())
        args.putInt(0, 1); args.putInt(4, 2); args.putInt(8, 3); args.putInt(12, 4)
        val out = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder())

        NativeEngine.callGeneric(
            fn,
            4,
            "u64:i32,i32,i32,i32",
            NativeEngine.directBufferAddress(args),
            NativeEngine.directBufferAddress(out),
        )

        assertEquals(10L, out.getLong(0))
    }

    @Test
    fun genericFallbackUsesStableEightBytePointerCarrier() {
        val fn = resolve("bench_read_int_plus")
        val value = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder())
        value.putInt(0, 40)
        val args = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder())
        args.putLong(0, NativeEngine.directBufferAddress(value))
        args.putInt(8, 2)
        val out = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder())

        NativeEngine.callGeneric(
            fn,
            2,
            "u32:p,u32",
            NativeEngine.directBufferAddress(args),
            NativeEngine.directBufferAddress(out),
        )

        assertEquals(42, out.getInt(0))
    }

    @Test
    fun genericFallbackRejectsMalformedTypeSpec() {
        val fn = resolve("bench_add4")
        val args = ByteBuffer.allocateDirect(4 * 8).order(ByteOrder.nativeOrder())
        args.putLong(0, 1); args.putLong(8, 2); args.putLong(16, 3); args.putLong(24, 4)
        val out = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder())

        try {
            NativeEngine.callGeneric(
                fn,
                4,
                "this is not a native signature",
                NativeEngine.directBufferAddress(args),
                NativeEngine.directBufferAddress(out),
            )
            fail("callGeneric must reject a malformed typeSpec")
        } catch (_: IllegalArgumentException) {
            // Expected: parsing happens before libffi receives a call signature.
        }
    }

    @Test
    fun genericFallbackMarshalsStructByValueFromItsFieldLayout() {
        val fn = resolve("bench_pair_sum")
        val args = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder())
        args.putLong(0, 7L)
        args.putLong(8, 9L)
        val out = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder())

        NativeEngine.callGeneric(
            fn,
            1,
            "u64:s16@8(u64,u64)",
            NativeEngine.directBufferAddress(args),
            NativeEngine.directBufferAddress(out),
        )

        assertEquals(16L, out.getLong(0))
    }

    @Test
    fun genericFallbackReturnsStructByValueFromItsFieldLayout() {
        val fn = resolve("bench_make_pair")
        val args = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder())
        args.putLong(0, 7L)
        args.putLong(8, 9L)
        val out = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder())

        NativeEngine.callGeneric(
            fn,
            2,
            "s16@8(u64,u64):u64,u64",
            NativeEngine.directBufferAddress(args),
            NativeEngine.directBufferAddress(out),
        )

        assertEquals(7L, out.getLong(0))
        assertEquals(9L, out.getLong(8))
    }

    @Test
    fun genericFallbackMarshalsNestedStructsAndFixedArrays() {
        val fn = resolve("bench_packet_checksum")
        val args = ByteBuffer.allocateDirect(20).order(ByteOrder.nativeOrder())
        args.putInt(0, 1)
        args.putFloat(4, 2f)
        args.putFloat(8, 3f)
        args.putShort(12, 4)
        args.putShort(14, 5)
        args.putShort(16, 6)
        val out = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder())

        NativeEngine.callGeneric(
            fn,
            1,
            "u32:s20@4(i32,s8@4(f32,f32),a3(i16))",
            NativeEngine.directBufferAddress(args),
            NativeEngine.directBufferAddress(out),
        )

        assertEquals(21, out.getInt(0))
    }

    @Test
    fun genericFallbackRejectsStructLayoutThatDoesNotMatchTheAbi() {
        val fn = resolve("bench_pair_sum")
        val args = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder())
        val out = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder())

        try {
            NativeEngine.callGeneric(
                fn,
                1,
                "u64:s8@4(u64)",
                NativeEngine.directBufferAddress(args),
                NativeEngine.directBufferAddress(out),
            )
            fail("callGeneric must reject a struct typeSpec inconsistent with libffi")
        } catch (_: IllegalArgumentException) {
            // Expected: the declared C layout cannot be represented by libffi.
        }
    }
}
