package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.*

class Win32RawInputTest {
    private class FakePort : Win32RawInputNativePort {
        var registrationAnswer = 1 // BOOL success
        var lastErrorCode = 0
        var registeredCount = 0 // count reported by registeredDevices (0 = none)

        // RegisterRawInputDevices consumes the device struct synchronously: copy the values during the call.
        var registeredUsagePage: Short = 0
            private set
        var registeredUsage: Short = 0
            private set
        var registeredFlags: Int = 0
            private set
        var registeredHwnd: Long = 0
            private set
        var readBehavior: ((buffer: MemorySegment, sizePointer: MemorySegment) -> Int)? = null

        val registerCalls = AtomicInteger()
        override fun registerDevices(devices: MemorySegment, count: Int, structSize: Int): Int {
            registerCalls.incrementAndGet()
            registeredUsagePage = devices.get(ValueLayout.JAVA_SHORT, 0)
            registeredUsage = devices.get(ValueLayout.JAVA_SHORT, 2)
            registeredFlags = devices.get(ValueLayout.JAVA_INT, 4)
            registeredHwnd = devices.get(ValueLayout.ADDRESS, 8).address()
            registeredCount = 1 // a successful registration becomes the process-wide one
            return registrationAnswer
        }
        override fun registeredDevices(output: MemorySegment, countPointer: MemorySegment, structSize: Int): Int {
            // NULL output is the preflight size query; a real buffer receives the entries.
            if (output.address() != 0L && registeredCount > 0) {
                output.set(ValueLayout.JAVA_SHORT, 0, Win32RawInputFlags.USAGE_PAGE_GENERIC.toShort())
                output.set(ValueLayout.JAVA_SHORT, 2, Win32RawInputFlags.USAGE_MOUSE.toShort())
                output.set(ValueLayout.JAVA_INT, 4, 0)
                output.set(ValueLayout.ADDRESS, 8, MemorySegment.ofAddress(77L))
            }
            countPointer.set(ValueLayout.JAVA_INT, 0, registeredCount)
            return 0 // success; the count travels through countPointer
        }
        override fun readData(lParam: Long, command: Int, buffer: MemorySegment, sizePointer: MemorySegment, headerSize: Int): Int =
            readBehavior?.invoke(buffer, sizePointer) ?: -1
        override fun lastError(): Int = lastErrorCode
    }

    private fun syntheticRawInput(dwType: Int, hDevice: Long, usFlags: Int, lastX: Int, lastY: Int): ByteArray {
        val bytes = ByteArray(48)
        fun int(offset: Int, value: Int) {
            bytes[offset] = (value and 0xFF).toByte(); bytes[offset + 1] = ((value shr 8) and 0xFF).toByte()
            bytes[offset + 2] = ((value shr 16) and 0xFF).toByte(); bytes[offset + 3] = ((value shr 24) and 0xFF).toByte()
        }
        int(0, dwType) // header.dwType
        int(4, 48) // header.dwSize
        // hDevice at 8 (long, little endian)
        for (index in 0 until 8) bytes[8 + index] = ((hDevice ushr (index * 8)) and 0xFF).toByte()
        // RAWMOUSE at 24: usFlags at 0, lLastX at 12, lLastY at 16
        int(24, usFlags)
        int(24 + 12, lastX)
        int(24 + 16, lastY)
        return bytes
    }

    @Test fun registrationRefusesAForeignPreexistingRegistration() {
        val port = FakePort().apply { registeredCount = 1 }
        val failure = assertFailsWith<Win32RawInputException> {
            Win32RawInput.registerForTesting(77L, { _, _, _ -> }, {}, port)
        }
        assertEquals(Win32RawInputException.ALREADY_REGISTERED, failure.code)
        assertEquals(0, port.registeredFlags, "no registration may be issued over a foreign one")
    }

    @Test fun registrationInstallsTheRelativeMouseSinkOnTheTargetWindow() {
        val port = FakePort()
        val received = mutableListOf<Long>()
        Win32RawInput.registerForTesting(77L, { _, _, device -> received += device }, {}, port).use { owner ->
            assertEquals(Win32RawInputFlags.USAGE_PAGE_GENERIC.toShort(), port.registeredUsagePage)
            assertEquals(Win32RawInputFlags.USAGE_MOUSE.toShort(), port.registeredUsage)
            assertEquals(0, port.registeredFlags, "foreground-only registration")
            assertEquals(77L, port.registeredHwnd)
        }
        assertEquals(0, received.size)
    }

    @Test fun registrationFailureSurfacesTheLastErrorAsTypedCode() {
        val port = FakePort().apply { registrationAnswer = 0; lastErrorCode = 5 }
        val failure = assertFailsWith<Win32RawInputException> {
            Win32RawInput.registerForTesting(77L, { _, _, _ -> }, {}, port)
        }
        assertEquals(5, failure.code)
    }

    @Test fun readParsesRelativeMouseDeltasAndDeviceFromTheCopiedPayload() {
        val port = FakePort()
        port.readBehavior = { buffer, sizePointer ->
            sizePointer.set(ValueLayout.JAVA_INT, 0, 48)
            val payload = syntheticRawInput(dwType = 0, hDevice = 0x1234, usFlags = 0, lastX = -7, lastY = 13)
            MemorySegment.copy(MemorySegment.ofArray(payload), 0, buffer, 0, payload.size.toLong())
            48
        }
        Win32RawInput.registerForTesting(77L, { _, _, _ -> }, {}, port).use { owner ->
            val motion = owner.read(0xABCDL)
            assertEquals(-7, motion?.deltaX)
            assertEquals(13, motion?.deltaY)
            assertEquals(0x1234L, motion?.device)
        }
    }

    @Test fun readRefusesAbsoluteAndNonMousePayloadsWithoutApproximation() {
        val port = FakePort()
        val readCalls = AtomicInteger()
        val payloads = listOf(
            syntheticRawInput(dwType = 0, hDevice = 1, usFlags = 1, lastX = 100, lastY = 200), // absolute
            syntheticRawInput(dwType = 1, hDevice = 1, usFlags = 0, lastX = 5, lastY = 5), // keyboard
        )
        port.readBehavior = { buffer, sizePointer ->
            val payload = payloads[readCalls.getAndIncrement() % payloads.size]
            sizePointer.set(ValueLayout.JAVA_INT, 0, payload.size)
            MemorySegment.copy(MemorySegment.ofArray(payload), 0, buffer, 0, payload.size.toLong())
            payload.size
        }
        Win32RawInput.registerForTesting(77L, { _, _, _ -> }, {}, port).use { owner ->
            assertNull(owner.read(1L))
            assertNull(owner.read(2L))
        }
    }

    @Test fun readFailureReportsThroughTheConfiguredReporterWithoutThrowing() {
        val port = FakePort()
        port.readBehavior = { _, _ -> -1 }
        val failures = mutableListOf<Throwable>()
        Win32RawInput.registerForTesting(77L, { _, _, _ -> }, { failures += it }, port).use { owner ->
            assertNull(owner.read(1L))
        }
        assertEquals(1, failures.size)
        assertIs<Win32RawInputException>(failures.single())
    }

    @Test fun closePerformsNoNativeMutationBecauseRemovalIsRefusedByTheOs() {
        // RIDEV_REMOVE fails with ERROR_INVALID_FLAGS on the observed hosts: the single
        // registration is process-lifetime and close only clears the admission state.
        val port = FakePort()
        val owner = Win32RawInput.registerForTesting(77L, { _, _, _ -> }, {}, port)
        assertEquals(1, port.registerCalls.get())
        owner.close()
        owner.close()
        assertEquals(1, port.registerCalls.get(), "no native call may follow the registration")
    }

    @Test fun closeIsIdempotentAndThreadConfined() {
        val owner = Win32RawInput.registerForTesting(77L, { _, _, _ -> }, {}, FakePort())
        owner.close()
        owner.close()
        val failure = arrayOfNulls<Throwable>(1)
        val worker = Thread { failure[0] = runCatching { owner.close() }.exceptionOrNull() }
        worker.start(); worker.join(5_000)
        assertEquals(0x8001010e.toInt(), assertIs<Win32RawInputException>(failure[0]).code)
    }
}
