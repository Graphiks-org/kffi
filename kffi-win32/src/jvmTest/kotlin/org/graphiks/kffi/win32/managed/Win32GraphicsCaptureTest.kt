package org.graphiks.kffi.win32.managed

import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Win32GraphicsCaptureTest {
    private class FakePort : Win32GraphicsCaptureNativePort {
        var initFailure = 0
        var activationFailure = 0
        var deviceFailure = 0
        var roInitCalls = 0
        var roUninitCalls = 0

        override fun roInitialize(initType: Int): Int = initFailure.also { if (it == 0) roInitCalls++ }
        override fun roUninitialize() { roUninitCalls++ }

        override fun roGetActivationFactory(classId: MemorySegment, iid: MemorySegment, factory: MemorySegment): Int =
            activationFailure

        override fun windowsCreateString(source: MemorySegment, length: Int, hstring: MemorySegment): Int = 0
        override fun windowsDeleteString(hstring: MemorySegment): Int = 0
        override fun windowsGetStringRawBuffer(hstring: MemorySegment, length: MemorySegment): MemorySegment =
            MemorySegment.NULL

        override fun d3d11CreateDevice(
            adapter: MemorySegment, driverType: Int, software: MemorySegment, flags: Int,
            levels: MemorySegment, levelCount: Int, sdkVersion: Int,
            device: MemorySegment, featureLevel: MemorySegment, context: MemorySegment,
        ): Int = deviceFailure

        override fun createDirect3D11DeviceFromDXGIDevice(dxgiDevice: MemorySegment, graphicsDevice: MemorySegment): Int = 0
    }

    @Test fun balancedRoInitializeAroundTheProbe() {
        val port = FakePort()
        Win32GraphicsCapture.forTesting(port).use { capture ->
            assertTrue(capture.probe())
            assertEquals(1, port.roInitCalls)
            assertEquals(1, port.roUninitCalls, "the probe balances its own apartment pair")
        }
        assertEquals(1, port.roUninitCalls, "close adds no unbalanced release after a probe")
    }

    @Test fun activationFailureIsHonestAndStillBalanced() {
        val port = FakePort().apply { activationFailure = 0x80004018.toInt() }
        Win32GraphicsCapture.forTesting(port).use { capture ->
            assertFalse(capture.probe(), "a failed activation must not become an availability claim")
        }
        assertEquals(1, port.roInitCalls)
        assertEquals(1, port.roUninitCalls, "the balanced uninitialize still runs after the failure")
    }

    @Test fun roInitializeFailureIsHonestWithoutUninitialize() {
        val port = FakePort().apply { initFailure = -2147024891 } // E_ACCESSDENIED-shaped
        Win32GraphicsCapture.forTesting(port).use { capture ->
            assertFalse(capture.probe())
        }
        assertEquals(0, port.roUninitCalls, "nothing is unbalanced by a failed initialize")
    }

    @Test fun typedExceptionCarriesTheHresult() {
        val failure = Win32GraphicsCaptureException(0x80070490.toInt())
        assertEquals(0x80070490.toInt(), failure.hresult)
        assertTrue(failure.message!!.contains("80070490"))
    }

    @Test fun closeIsIdempotentAndNeverUnbalancesTheApartment() {
        val port = FakePort()
        val capture = Win32GraphicsCapture.forTesting(port)
        capture.close()
        capture.close()
        assertEquals(0, port.roInitCalls)
        assertEquals(0, port.roUninitCalls, "close without open releases nothing")
    }

    @Test fun openRefusedAfterClose() {
        val port = FakePort()
        val capture = Win32GraphicsCapture.forTesting(port)
        capture.close()
        assertFailsWith<IllegalStateException> { capture.open(0xdeadbeefL, window = true) { } }
        assertEquals(0, port.roInitCalls, "the refusal happens before any apartment ownership")
    }
}
