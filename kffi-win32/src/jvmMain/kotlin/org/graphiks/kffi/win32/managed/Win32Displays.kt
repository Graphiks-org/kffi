package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import org.graphiks.kffi.win32.generated.EnumDisplayMonitors
import org.graphiks.kffi.win32.generated.EnumDisplaySettingsExW
import org.graphiks.kffi.win32.generated.GetDpiForMonitor
import org.graphiks.kffi.win32.generated.GetLastError
import org.graphiks.kffi.win32.generated.GetMonitorInfoW
import org.graphiks.kffi.win32.generated.MONITOR_DPI_TYPE
import org.graphiks.kffi.win32.generated._devicemodeW
import org.graphiks.kffi.win32.generated.init

/** Typed native failure for the display frontier; numeric HRESULT or Win32 error code only. */
public class Win32DisplayException(public val code: Int) :
    RuntimeException("Win32 display failure 0x" + code.toUInt().toString(16))

/** Stable display scalars for the win32 inventory. */
public object Win32DisplayFlags {
    public const val WM_DISPLAYCHANGE: Int = 0x007E
    public const val WM_SETTINGCHANGE: Int = 0x001A
    public const val ENUM_CURRENT_SETTINGS: Int = -1
    public const val MDT_EFFECTIVE_DPI: Int = 0
}

/** One copied display mode; scalars only. */
public class Win32DisplayModeValue(
    public val key: Long,
    public val width: Int,
    public val height: Int,
    public val hz: Int,
    public val bits: Int,
)

/** One copied monitor observation: bounds, work area, scale and modes; no native memory behind it. */
public class Win32DisplaySnapshotValue(
    public val monitor: Long,
    public val left: Int,
    public val top: Int,
    public val right: Int,
    public val bottom: Int,
    public val workLeft: Int,
    public val workTop: Int,
    public val workRight: Int,
    public val workBottom: Int,
    public val scale: Double,
    public val modes: List<Win32DisplayModeValue>,
    public val current: Win32DisplayModeValue?,
)

/** Native display primitives behind an injectable port, provable without Windows. */
internal interface Win32DisplayNativePort {
    /** EnumDisplayMonitors; calls [onMonitor] per HMONITOR during the synchronous walk. */
    fun enumMonitors(onMonitor: (Long) -> Unit): Boolean

    /** GetMonitorInfoW into a MONITORINFOEXW-sized buffer of [cbSize] bytes. */
    fun monitorInfo(hmonitor: Long, buffer: MemorySegment, cbSize: Int): Boolean

    /** GetDpiForMonitor (MDT_EFFECTIVE_DPI); writes dpiX/dpiY, false when unsupported. */
    fun dpiForMonitor(hmonitor: Long, dpiOut: MemorySegment): Boolean

    /** EnumDisplaySettingsExW; [indexOrCurrent] is an index or ENUM_CURRENT_SETTINGS. */
    fun enumSettings(device: String, indexOrCurrent: Int, devmode: MemorySegment): Boolean

    fun lastError(): Int

    companion object {
        // The enumeration callback is a process-lifetime stub; the collector travels
        // through a thread local because the walk is synchronous and thread-confined.
        private val collector = ThreadLocal<((Long) -> Unit)?>()
        private val stub: MemorySegment by lazy {
            val descriptor = FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS,
            )
            val dispatcher = MethodHandles.lookup().findStatic(
                Win32DisplayNativePort::class.java, "enumDispatch",
                MethodType.methodType(
                    Int::class.javaPrimitiveType,
                    MemorySegment::class.java, MemorySegment::class.java,
                    MemorySegment::class.java, MemorySegment::class.java,
                ),
            )
            Linker.nativeLinker().upcallStub(dispatcher, descriptor, Arena.global())
        }

        @JvmStatic
        public fun enumDispatch(
            monitor: MemorySegment,
            hdc: MemorySegment,
            rect: MemorySegment,
            data: MemorySegment,
        ): Int {
            collector.get()?.invoke(monitor.address())
            return 1 // TRUE: continue the walk
        }

        val native: Win32DisplayNativePort = object : Win32DisplayNativePort {
            override fun enumMonitors(onMonitor: (Long) -> Unit): Boolean {
                collector.set(onMonitor)
                try {
                    return EnumDisplayMonitors(MemorySegment.NULL, MemorySegment.NULL, stub, 0L) != 0
                } finally {
                    collector.set(null)
                }
            }

            override fun monitorInfo(hmonitor: Long, buffer: MemorySegment, cbSize: Int): Boolean =
                GetMonitorInfoW(MemorySegment.ofAddress(hmonitor), buffer) != 0

            override fun dpiForMonitor(hmonitor: Long, dpiOut: MemorySegment): Boolean =
                GetDpiForMonitor(
                    MemorySegment.ofAddress(hmonitor),
                    MONITOR_DPI_TYPE.fromValue(Win32DisplayFlags.MDT_EFFECTIVE_DPI.toLong())!!,
                    dpiOut,
                    dpiOut.asSlice(4),
                ) == 0

            override fun enumSettings(device: String, indexOrCurrent: Int, devmode: MemorySegment): Boolean {
                Arena.ofConfined().use { arena ->
                    val wide = arena.allocate((device.length + 1L) * 2L, 2)
                    device.forEachIndexed { index, character -> wide.set(ValueLayout.JAVA_CHAR, index * 2L, character) }
                    wide.set(ValueLayout.JAVA_CHAR, device.length * 2L, '\u0000')
                    return EnumDisplaySettingsExW(wide, indexOrCurrent, devmode, 0) != 0
                }
            }

            override fun lastError(): Int = GetLastError()
        }
    }
}
/**
 * Managed multi-monitor inventory. One snapshot call enumerates every monitor
 * synchronously and copies everything into scalars: bounds and work area from
 * GetMonitorInfoW, per-monitor scale from GetDpiForMonitor (MDT_EFFECTIVE_DPI),
 * modes from EnumDisplaySettingsExW walked from index 0 until the first miss
 * and capped. A monitor whose scale or modes cannot be read fails the whole
 * snapshot with a typed code instead of being published with approximated
 * values. Thread-confined to the calling thread; the enumeration callback
 * carries no application state and is revoked after use.
 */
public class Win32Displays private constructor(private val port: Win32DisplayNativePort) {

    public companion object {
        internal const val HIGHCONTRAST_BYTE_SIZE: Long = 8 // sizeof(HIGHCONTRAST): UINT cbSize + DWORD dwFlags
        internal const val CCHDEVICENAME: Int = 32
        internal const val MONITORINFOEXW_BYTE_SIZE: Long = 104
        internal const val RC_MONITOR_OFFSET: Long = 4
        internal const val RC_WORK_OFFSET: Long = 20
        internal const val SZ_DEVICE_OFFSET: Long = 40
        internal const val DEVMODE_SIZE_OFFSET: Long = 68
        internal val DEVMODE_PELSW_OFFSET: Long =
            _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement("dmPelsWidth"))
        internal val DEVMODE_PELSH_OFFSET: Long =
            _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement("dmPelsHeight"))
        internal val DEVMODE_HZ_OFFSET: Long =
            _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement("dmDisplayFrequency"))
        internal val DEVMODE_BITS_OFFSET: Long =
            _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement("dmBitsPerPel"))
        internal const val MAX_MODES: Int = 256
        internal const val E_NO_DISPLAYS: Int = -2147024895 // HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED)
        internal const val E_SCALE_UNAVAILABLE: Int = -2147024894 // HRESULT_FROM_WIN32(ERROR_NOT_FOUND)

        /** Assembles the full monitor inventory; requires Windows. */
        public fun snapshot(): List<Win32DisplaySnapshotValue> {
            check(Win32ControlWindow.isSupported()) {
                "Win32 display enumeration requires Windows; this platform (" +
                    System.getProperty("os.name") + ") is unsupported - no native library was loaded."
            }
            init()
            return snapshot(Win32DisplayNativePort.native)
        }

        internal fun snapshot(port: Win32DisplayNativePort): List<Win32DisplaySnapshotValue> {
            Arena.ofConfined().use { arena ->
                val collected = ArrayList<Long>()
                val failed = arrayOfNulls<Throwable>(1)
                if (!port.enumMonitors(onMonitor = { monitor ->
                        try { collected += monitor } catch (failure: Throwable) { failed[0] = failure }
                    }) || failed[0] != null) {
                    throw Win32DisplayException(port.lastError())
                }
                if (collected.isEmpty()) throw Win32DisplayException(E_NO_DISPLAYS)
                return collected.map { monitor -> copyMonitor(port, arena, monitor) }
            }
        }

        private fun copyMonitor(port: Win32DisplayNativePort, arena: Arena, monitor: Long): Win32DisplaySnapshotValue {
            val info = arena.allocate(MONITORINFOEXW_BYTE_SIZE, 4)
            info.set(ValueLayout.JAVA_INT, 0, MONITORINFOEXW_BYTE_SIZE.toInt())
            if (!port.monitorInfo(monitor, info, MONITORINFOEXW_BYTE_SIZE.toInt())) {
                throw Win32DisplayException(port.lastError())
            }
            val dpi = arena.allocate(8, 4)
            if (!port.dpiForMonitor(monitor, dpi)) throw Win32DisplayException(E_SCALE_UNAVAILABLE)
            val dpiX = dpi.get(ValueLayout.JAVA_INT, 0)
            if (dpiX <= 0) throw Win32DisplayException(E_SCALE_UNAVAILABLE)

            val device = readDeviceName(info)
            val current = readMode(port, device, Win32DisplayFlags.ENUM_CURRENT_SETTINGS, arena, modeKey(monitor, -1))
            val modes = ArrayList<Win32DisplayModeValue>()
            for (index in 0 until MAX_MODES) {
                val mode = readMode(port, device, index, arena, modeKey(monitor, index)) ?: break
                modes += mode
            }
            return Win32DisplaySnapshotValue(
                monitor = monitor,
                left = info.get(ValueLayout.JAVA_INT, RC_MONITOR_OFFSET),
                top = info.get(ValueLayout.JAVA_INT, RC_MONITOR_OFFSET + 4),
                right = info.get(ValueLayout.JAVA_INT, RC_MONITOR_OFFSET + 8),
                bottom = info.get(ValueLayout.JAVA_INT, RC_MONITOR_OFFSET + 12),
                workLeft = info.get(ValueLayout.JAVA_INT, RC_WORK_OFFSET),
                workTop = info.get(ValueLayout.JAVA_INT, RC_WORK_OFFSET + 4),
                workRight = info.get(ValueLayout.JAVA_INT, RC_WORK_OFFSET + 8),
                workBottom = info.get(ValueLayout.JAVA_INT, RC_WORK_OFFSET + 12),
                scale = dpiX / 96.0,
                modes = modes,
                current = current,
            )
        }

        private fun readMode(
            port: Win32DisplayNativePort,
            device: String,
            indexOrCurrent: Int,
            arena: Arena,
            key: Long,
        ): Win32DisplayModeValue? {
            val devmode = _devicemodeW.allocate(arena)
            devmode.set(ValueLayout.JAVA_SHORT, DEVMODE_SIZE_OFFSET, _devicemodeW.byteSize.toShort())
            if (!port.enumSettings(device, indexOrCurrent, devmode)) return null
            return Win32DisplayModeValue(
                key = key,
                width = devmode.get(ValueLayout.JAVA_INT, DEVMODE_PELSW_OFFSET),
                height = devmode.get(ValueLayout.JAVA_INT, DEVMODE_PELSH_OFFSET),
                hz = devmode.get(ValueLayout.JAVA_INT, DEVMODE_HZ_OFFSET),
                bits = devmode.get(ValueLayout.JAVA_INT, DEVMODE_BITS_OFFSET),
            )
        }

        private fun readDeviceName(info: MemorySegment): String {
            val characters = ArrayList<Char>(CCHDEVICENAME)
            for (index in 0 until CCHDEVICENAME) {
                val character = info.get(ValueLayout.JAVA_CHAR, SZ_DEVICE_OFFSET + index * 2L)
                if (character == '\u0000') break
                characters += character
            }
            return characters.joinToString("")
        }

        private fun modeKey(monitor: Long, index: Int): Long = (monitor shl 8) or (index and 0xff).toLong()
    }
}
