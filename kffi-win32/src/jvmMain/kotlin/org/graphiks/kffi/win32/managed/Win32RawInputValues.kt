package org.graphiks.kffi.win32.managed

import java.lang.foreign.MemorySegment

/** Typed native failure for the raw input frontier; numeric HRESULT or Win32 error code only. */
public class Win32RawInputException(public val code: Int) :
    RuntimeException("Win32 raw input failure 0x" + code.toUInt().toString(16)) {
    internal companion object {
        /** HRESULT_FROM_WIN32(ERROR_ALREADY_EXISTS): this process already holds a raw-input registration. */
        internal const val ALREADY_REGISTERED: Int = 0x800700B7.toInt()
    }
}

/** Stable raw-input scalars for the mouse-relative source; every other usage stays outside this surface. */
public object Win32RawInputFlags {
    public const val WM_INPUT: Int = 0x00FF
    public const val WM_INPUT_DEVICE_CHANGE: Int = 0x00FE

    public const val RID_INPUT: Int = 0x10000003
    public const val RIM_TYPEMOUSE: Int = 0

    public const val MOUSE_MOVE_RELATIVE: Int = 0

    public const val USAGE_PAGE_GENERIC: Int = 0x01
    public const val USAGE_MOUSE: Int = 0x02

    // RIDEV_INPUTSINK (0x00000001) and RIDEV_REMOVE (0x20000000) are deliberately not
    // offered: the OS refuses INPUTSINK for the mouse usage with ERROR_INVALID_PARAMETER
    // and refuses every RIDEV_REMOVE form with ERROR_INVALID_FLAGS on the observed hosts.
}

/**
 * Raw-input primitives behind an injectable port so the registration and copy
 * discipline stays provable without Windows. No removal primitive exists: the
 * observed hosts refuse RIDEV_REMOVE for the mouse usage, so registrations are
 * process-lifetime.
 */
internal interface Win32RawInputNativePort {
    /** RegisterRawInputDevices; nonzero on success. */
    fun registerDevices(devices: MemorySegment, count: Int, structSize: Int): Int

    /** GetRegisteredRawInputDevices; 0 on success with the registered count in [countPointer], -1 when too small. */
    fun registeredDevices(output: MemorySegment, countPointer: MemorySegment, structSize: Int): Int

    /** GetRawInputData; returns copied bytes or -1 on failure. */
    fun readData(lParam: Long, command: Int, buffer: MemorySegment, sizePointer: MemorySegment, headerSize: Int): Int

    fun lastError(): Int

    companion object {
        val native: Win32RawInputNativePort = object : Win32RawInputNativePort {
            override fun registerDevices(devices: MemorySegment, count: Int, structSize: Int): Int =
                org.graphiks.kffi.win32.generated.RegisterRawInputDevices(devices, count, structSize)
            override fun registeredDevices(output: MemorySegment, countPointer: MemorySegment, structSize: Int): Int =
                org.graphiks.kffi.win32.generated.GetRegisteredRawInputDevices(output, countPointer, structSize)
            override fun readData(lParam: Long, command: Int, buffer: MemorySegment, sizePointer: MemorySegment, headerSize: Int): Int =
                org.graphiks.kffi.win32.generated.GetRawInputData(MemorySegment.ofAddress(lParam), command, buffer, sizePointer, headerSize)
            override fun lastError(): Int = org.graphiks.kffi.win32.generated.GetLastError()
        }
    }
}
