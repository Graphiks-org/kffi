package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.ValueLayout
import java.lang.foreign.MemorySegment
import org.graphiks.kffi.win32.generated.XInputGetCapabilities
import org.graphiks.kffi.win32.generated.XInputGetBatteryInformation
import org.graphiks.kffi.win32.generated.XInputGetState
import org.graphiks.kffi.win32.generated.XInputSetState
import org.graphiks.kffi.win32.generated._XINPUT_BATTERY_INFORMATION
import org.graphiks.kffi.win32.generated._XINPUT_CAPABILITIES
import org.graphiks.kffi.win32.generated._XINPUT_GAMEPAD
import org.graphiks.kffi.win32.generated._XINPUT_STATE
import org.graphiks.kffi.win32.generated._XINPUT_VIBRATION
import org.graphiks.kffi.win32.generated.init

/** Typed native failure for the XInput frontier; numeric Win32 error code only. */
public class Win32XInputException(public val code: Int) :
    RuntimeException("Win32 XInput failure 0x" + code.toUInt().toString(16))

/** One copied XInput pad observation: packet number, buttons bitmask and analog values. */
public class Win32XInputStateValue(
    public val packetNumber: Int,
    public val buttons: Int,
    public val leftTrigger: Int,
    public val rightTrigger: Int,
    public val thumbLX: Int,
    public val thumbLY: Int,
    public val thumbRX: Int,
    public val thumbRY: Int,
)

/** One copied XInput capability observation. */
public class Win32XInputCapabilitiesValue(
    public val type: Int,
    public val subType: Int,
    public val flags: Int,
    public val buttons: Int,
    public val leftTrigger: Int,
    public val rightTrigger: Int,
    public val thumbLX: Int,
    public val thumbLY: Int,
    public val thumbRX: Int,
    public val thumbRY: Int,
    public val vibrationLeft: Int,
    public val vibrationRight: Int,
)

/** One copied battery observation. */
public class Win32XInputBatteryValue(
    public val type: Int,
    public val level: Int,
)

/**
 * Managed XInput polling for the four user slots. All calls copy native
 * structs into scalars before returning; `ERROR_DEVICE_NOT_CONNECTED`
 * (1167) surfaces as a null/typed result, never as an invented value.
 * Thread-safe: XInput is documented as thread-safe.
 */
public class Win32XInput private constructor() {

    public companion object {
        public const val XUSER_MAX_COUNT: Int = 4
        public const val ERROR_DEVICE_NOT_CONNECTED: Int = 1167
        /** Polls one slot; null when the slot has no connected gamepad. */
        public fun getState(index: Int): Win32XInputStateValue? = getState(index, Win32XInputNativePort.native)

        internal fun getState(index: Int, port: Win32XInputNativePort): Win32XInputStateValue? {
            require(index in 0 until XUSER_MAX_COUNT)
            init()
            Arena.ofConfined().use { arena ->
                val state = _XINPUT_STATE.allocate(arena)
                val rc = port.getState(index, state)
                if (rc == ERROR_DEVICE_NOT_CONNECTED) return null
                if (rc != 0) throw Win32XInputException(rc)
                val accessor = _XINPUT_STATE()
                val gamepad = accessor.Gamepad(state)
                return Win32XInputStateValue(
                    packetNumber = accessor.dwPacketNumber(state),
                    buttons = _XINPUT_GAMEPAD().wButtons(gamepad).toInt() and 0xFFFF,
                    leftTrigger = _XINPUT_GAMEPAD().bLeftTrigger(gamepad).toInt() and 0xFF,
                    rightTrigger = _XINPUT_GAMEPAD().bRightTrigger(gamepad).toInt() and 0xFF,
                    thumbLX = _XINPUT_GAMEPAD().sThumbLX(gamepad).toInt(),
                    thumbLY = _XINPUT_GAMEPAD().sThumbLY(gamepad).toInt(),
                    thumbRX = _XINPUT_GAMEPAD().sThumbRX(gamepad).toInt(),
                    thumbRY = _XINPUT_GAMEPAD().sThumbRY(gamepad).toInt(),
                )
            }
        }

        /** Sets both vibration motors; false when the slot has no connected gamepad. */
        public fun setVibration(index: Int, leftMotorSpeed: Int, rightMotorSpeed: Int): Boolean =
            setVibration(index, leftMotorSpeed, rightMotorSpeed, Win32XInputNativePort.native)

        internal fun setVibration(
            index: Int,
            leftMotorSpeed: Int,
            rightMotorSpeed: Int,
            port: Win32XInputNativePort,
        ): Boolean {
            require(index in 0 until XUSER_MAX_COUNT)
            require(leftMotorSpeed in 0..0xFFFF) { "leftMotorSpeed out of range" }
            require(rightMotorSpeed in 0..0xFFFF) { "rightMotorSpeed out of range" }
            init()
            Arena.ofConfined().use { arena ->
                val vibration = _XINPUT_VIBRATION.allocate(arena)
                vibration.set(ValueLayout.JAVA_SHORT, 0, leftMotorSpeed.toShort())
                vibration.set(ValueLayout.JAVA_SHORT, 2, rightMotorSpeed.toShort())
                return port.setVibration(index, vibration) != ERROR_DEVICE_NOT_CONNECTED
            }
        }

        /** Reads capabilities; null when the slot has no connected gamepad. */
        public fun getCapabilities(index: Int): Win32XInputCapabilitiesValue? =
            getCapabilities(index, Win32XInputNativePort.native)

        internal fun getCapabilities(index: Int, port: Win32XInputNativePort): Win32XInputCapabilitiesValue? {
            require(index in 0 until XUSER_MAX_COUNT)
            init()
            Arena.ofConfined().use { arena ->
                val caps = _XINPUT_CAPABILITIES.allocate(arena)
                val rc = port.getCapabilities(index, caps)
                if (rc == ERROR_DEVICE_NOT_CONNECTED) return null
                if (rc != 0) throw Win32XInputException(rc)
                val accessor = _XINPUT_CAPABILITIES()
                val gamepadAccessor = _XINPUT_GAMEPAD()
                val vibrationAccessor = _XINPUT_VIBRATION()
                val gamepad = accessor.Gamepad(caps)
                val vibration = accessor.Vibration(caps)
                return Win32XInputCapabilitiesValue(
                    type = caps.get(ValueLayout.JAVA_BYTE, 0).toInt() and 0xFF,
                    subType = caps.get(ValueLayout.JAVA_BYTE, 1).toInt() and 0xFF,
                    flags = caps.get(ValueLayout.JAVA_SHORT, 2).toInt() and 0xFFFF,
                    buttons = gamepadAccessor.wButtons(gamepad).toInt() and 0xFFFF,
                    leftTrigger = gamepadAccessor.bLeftTrigger(gamepad).toInt() and 0xFF,
                    rightTrigger = gamepadAccessor.bRightTrigger(gamepad).toInt() and 0xFF,
                    thumbLX = gamepadAccessor.sThumbLX(gamepad).toInt(),
                    thumbLY = gamepadAccessor.sThumbLY(gamepad).toInt(),
                    thumbRX = gamepadAccessor.sThumbRX(gamepad).toInt(),
                    thumbRY = gamepadAccessor.sThumbRY(gamepad).toInt(),
                    vibrationLeft = vibrationAccessor.wLeftMotorSpeed(vibration).toInt(),
                    vibrationRight = vibrationAccessor.wRightMotorSpeed(vibration).toInt(),
                )
            }
        }

        /** Reads the battery level for one slot; null when no gamepad is connected. */
        public fun getBatteryInformation(index: Int): Win32XInputBatteryValue? =
            getBatteryInformation(index, Win32XInputNativePort.native)

        internal fun getBatteryInformation(index: Int, port: Win32XInputNativePort): Win32XInputBatteryValue? {
            require(index in 0 until XUSER_MAX_COUNT)
            init()
            Arena.ofConfined().use { arena ->
                val battery = arena.allocate(2, 1)
                val rc = port.getBatteryInformation(index, battery)
                if (rc == ERROR_DEVICE_NOT_CONNECTED) return null
                if (rc != 0) throw Win32XInputException(rc)
                return Win32XInputBatteryValue(
                    type = battery.get(ValueLayout.JAVA_BYTE, 0).toInt() and 0xFF,
                    level = battery.get(ValueLayout.JAVA_BYTE, 1).toInt() and 0xFF,
                )
            }
        }
    }
}

/** Native XInput primitives behind an injectable port, provable without Windows. */
internal interface Win32XInputNativePort {
    fun getState(index: Int, state: MemorySegment): Int
    fun setVibration(index: Int, vibration: MemorySegment): Int
    fun getCapabilities(index: Int, caps: MemorySegment): Int
    fun getBatteryInformation(index: Int, battery: MemorySegment): Int
    fun lastError(): Int

    companion object {
        val native: Win32XInputNativePort = object : Win32XInputNativePort {
            override fun getState(index: Int, state: MemorySegment): Int =
                XInputGetState(index, state)

            override fun setVibration(index: Int, vibration: MemorySegment): Int =
                XInputSetState(index, vibration)

            override fun getCapabilities(index: Int, caps: MemorySegment): Int =
                XInputGetCapabilities(index, 0, caps)

            override fun getBatteryInformation(index: Int, battery: MemorySegment): Int =
                XInputGetBatteryInformation(index, 0 /* BATTERY_DEVTYPE_GAMEPAD */, battery)

            override fun lastError(): Int = org.graphiks.kffi.win32.generated.GetLastError()
        }
    }
}
