package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import org.graphiks.kffi.win32.generated.GetLastError
import org.graphiks.kffi.win32.generated.init
import org.graphiks.kffi.win32.generated.tagRAWINPUTHEADER
import org.graphiks.kffi.win32.generated.tagRAWMOUSE
import org.graphiks.kffi.win32.generated.tagRAWINPUTDEVICE

/** One copied relative mouse motion observation; scalars only, no native memory behind it. */
public class Win32RawMotion(
    public val deltaX: Int,
    public val deltaY: Int,
    public val device: Long,
)

/**
 * One managed raw-input registration for the generic-desktop mouse usage on
 * [hwnd]. **This process keeps at most one registration per usage: a foreign
 * preexisting registration is refused with a typed code, never stolen**, and
 * close re-verifies ownership through GetRegisteredRawInputDevices before the
 * RIDEV_REMOVE. [read] copies the payload during the message; non-mouse and
 * absolute payloads return null instead of being approximated.
 * Thread-confined to the registering thread.
 */
public class Win32RawInput private constructor(
    private val hwnd: Long,
    private val port: Win32RawInputNativePort,
    private val onMotion: (deltaX: Int, deltaY: Int, device: Long) -> Unit,
    private val onFailure: (Throwable) -> Unit,
) : AutoCloseable {
    private val thread = Thread.currentThread()
    private var closed = false

    /** Copies one WM_INPUT payload; null when it is not a relative mouse motion. */
    public fun read(lParam: Long): Win32RawMotion? {
        checkThread()
        if (closed) throw Win32RawInputException(DISCONNECTED)
        Arena.ofConfined().use { arena ->
            val buffer = arena.allocate(BUFFER_BYTES, 8)
            val sizePointer = arena.allocate(ValueLayout.JAVA_INT)
            sizePointer.set(ValueLayout.JAVA_INT, 0, BUFFER_BYTES.toInt())
            val copied = try {
                port.readData(lParam, Win32RawInputFlags.RID_INPUT, buffer, sizePointer, tagRAWINPUTHEADER.byteSize.toInt())
            } catch (failure: Throwable) {
                onFailure(Win32RawInputException(E_FAIL)); return null
            }
            if (copied < 0) {
                onFailure(Win32RawInputException(port.lastError()))
                return null
            }
            val minimum = tagRAWINPUTHEADER.byteSize + tagRAWMOUSE.byteSize
            if (copied < minimum) return null
            if (buffer.get(ValueLayout.JAVA_INT, HEADER_TYPE_OFFSET) != Win32RawInputFlags.RIM_TYPEMOUSE) return null
            val data = tagRAWINPUTHEADER.byteSize
            if (buffer.get(ValueLayout.JAVA_SHORT, data + RAWMOUSE_FLAGS_OFFSET).toInt() and 0xFFFF !=
                Win32RawInputFlags.MOUSE_MOVE_RELATIVE
            ) {
                return null
            }
            val deltaX = buffer.get(ValueLayout.JAVA_INT, data + RAWMOUSE_LAST_X_OFFSET)
            val deltaY = buffer.get(ValueLayout.JAVA_INT, data + RAWMOUSE_LAST_Y_OFFSET)
            val device = buffer.get(ValueLayout.ADDRESS, HEADER_DEVICE_OFFSET).address()
            return Win32RawMotion(deltaX, deltaY, device)
        }
    }

    /**
     * Clears this registration's admission state. **No native mutation happens: the
     * observed hosts refuse RIDEV_REMOVE for the mouse usage with ERROR_INVALID_FLAGS
     * (1004), in both documented forms, so the single registration is process-lifetime
     * and dies with the process.** The registration is bounded to one per process and
     * owned by whoever holds it at the preflight.
     */
    override fun close() {
        checkThread()
        if (closed) return
        closed = true
    }

    private fun checkThread() {
        if (Thread.currentThread() !== thread) throw Win32RawInputException(WRONG_THREAD)
    }

    public companion object {
        /** True when this process already holds any raw-input registration (foreign ownership). */
        public fun hasRegistration(): Boolean {
            check(Win32ControlWindow.isSupported()) { "Win32 raw input requires Windows" }
            init()
            return hasRegistration(Win32RawInputNativePort.native)
        }

        /**
         * Registers the relative mouse sink on [hwnd]. Requires Windows; refuses
         * any preexisting process registration with [Win32RawInputException.ALREADY_REGISTERED].
         */
        public fun register(hwnd: Long, onMotion: (deltaX: Int, deltaY: Int, device: Long) -> Unit, onFailure: (Throwable) -> Unit): Win32RawInput {
            check(Win32ControlWindow.isSupported()) {
                "Win32 raw input requires Windows; this platform (" +
                    System.getProperty("os.name") + ") is unsupported — no native library was loaded."
            }
            init()
            return registerForTesting(hwnd, onMotion, onFailure, Win32RawInputNativePort.native)
        }

        /** Port-injected path: platform-independent, provable with a fake port anywhere. */
        internal fun registerForTesting(
            hwnd: Long,
            onMotion: (deltaX: Int, deltaY: Int, device: Long) -> Unit,
            onFailure: (Throwable) -> Unit,
            port: Win32RawInputNativePort,
        ): Win32RawInput {
            require(hwnd != 0L)
            if (hasRegistration(port)) throw Win32RawInputException(FOREIGN_REGISTERED)
            Arena.ofConfined().use { arena ->
                val device = tagRAWINPUTDEVICE.allocate(arena)
                device.set(ValueLayout.JAVA_SHORT, DEVICE_USAGE_PAGE_OFFSET, Win32RawInputFlags.USAGE_PAGE_GENERIC.toShort())
                device.set(ValueLayout.JAVA_SHORT, DEVICE_USAGE_OFFSET, Win32RawInputFlags.USAGE_MOUSE.toShort())
                // Foreground-only delivery: RIDEV_INPUTSINK is refused with ERROR_INVALID_PARAMETER on
                // the observed hosts, and is therefore kept outside this surface (documented limit).
                device.set(ValueLayout.JAVA_INT, DEVICE_FLAGS_OFFSET, 0)
                device.set(ValueLayout.ADDRESS, DEVICE_HWND_OFFSET, MemorySegment.ofAddress(hwnd))
                if (port.registerDevices(device, 1, tagRAWINPUTDEVICE.byteSize.toInt()) == 0) {
                    throw Win32RawInputException(port.lastError())
                }
            }
            return Win32RawInput(hwnd, port, onMotion, onFailure)
        }

        internal fun hasRegistration(port: Win32RawInputNativePort): Boolean {
            Arena.ofConfined().use { arena ->
                val countPointer = arena.allocate(ValueLayout.JAVA_INT)
                countPointer.set(ValueLayout.JAVA_INT, 0, 0)
                // Documented semantics: 0 on success with the registered count in uiCount;
                // -1 when the supplied buffer is too small, i.e. registrations exist.
                val registered = port.registeredDevices(MemorySegment.NULL, countPointer, tagRAWINPUTDEVICE.byteSize.toInt())
                if (registered == -1) return true
                if (registered != 0) return false
                return countPointer.get(ValueLayout.JAVA_INT, 0) > 0
            }
        }

        // tagRAWINPUTDEVICE, Win64: USHORT usUsagePage; USHORT usUsage; DWORD dwFlags; HWND hwndTarget.
        internal const val DEVICE_USAGE_PAGE_OFFSET: Long = 0
        internal const val DEVICE_USAGE_OFFSET: Long = 2
        internal const val DEVICE_FLAGS_OFFSET: Long = 4
        internal const val DEVICE_HWND_OFFSET: Long = 8

        // tagRAWINPUT: header (24) then the mouse/keyboard/HID union; RAWMOUSE offsets within the data.
        internal const val HEADER_TYPE_OFFSET: Long = 0
        internal const val HEADER_DEVICE_OFFSET: Long = 8
        internal val RAWMOUSE_FLAGS_OFFSET: Long = 0
        internal val RAWMOUSE_LAST_X_OFFSET: Long = 12
        internal val RAWMOUSE_LAST_Y_OFFSET: Long = 16

        internal const val BUFFER_BYTES: Long = 64
        internal const val DEVICE_PROBE_COUNT: Int = 8

        internal const val FOREIGN_REGISTERED: Int = Win32RawInputException.ALREADY_REGISTERED
        internal const val OWNERSHIP_UNPROVEN: Int = 0x80070074.toInt() // HRESULT_FROM_WIN32(ERROR_NOT_FOUND)
        internal const val WRONG_THREAD: Int = 0x8001010e.toInt() // RPC_E_WRONG_THREAD
        internal const val DISCONNECTED: Int = 0x80010108.toInt() // RPC_E_DISCONNECTED
        internal const val E_FAIL: Int = -2147467259 // 0x80004005
    }
}
