package org.graphiks.kffi.engine

import org.graphiks.kffi.Callback
import org.graphiks.kffi.CallbackPolicy
import org.graphiks.kffi.CallbackRegistration
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.CallbackType
import org.graphiks.kffi.MemoryBuffer
import org.graphiks.kffi.NativeAddress

@OptIn(CallbackRuntimeApi::class)
object UpcallDispatcher {

    fun interface BenchCallback : Callback {
        fun invoke(value: UInt)
    }

    private val type: CallbackType<BenchCallback> = CallbackType(
        canonicalId = "bench:UpcallDispatcher",
        hasRoutingUserdata = true,
    )

    @Volatile
    var lastValue: Int = -1

    data class AllTypes(
        val token: Long,
        val i8: Byte,
        val u8: Byte,
        val i16: Short,
        val u16: Short,
        val i32: Int,
        val u32: Int,
        val i64: Long,
        val u64: Long,
        val f32: Float,
        val f64: Double,
        val pointer: Long,
        val message: String,
        val messageLength: Int,
        val messageAddressWasNonZero: Boolean,
        val size: Long,
        val address: Long,
    )

    @Volatile
    var lastAllTypes: AllTypes? = null

    fun register(): CallbackRegistration<BenchCallback> =
        CallbackRuntime.register(
            type = type,
            trampoline = NativeAddress(0L), // unused for routing; token routing is via userdata
            policy = CallbackPolicy.REPEATING,
            callback = BenchCallback { lastValue = it.toInt() },
        )

    @JvmStatic
    fun dispatch(token: Long, value: Int) {
        CallbackRuntime.dispatchSafely(type, NativeAddress(token)) { cb ->
            cb.invoke(value.toUInt())
        }
    }

    @JvmStatic
    fun dispatchReturn(token: Long, value: Int): Int {
        check(token != 0L) { "kffi: routing token must be nonzero" }
        return value + 1
    }

    @JvmStatic
    fun dispatchReturnCountMismatch(token: Long, value: Int, extra: Int): Int {
        check(token != 0L) { "kffi: routing token must be nonzero" }
        return value + extra
    }

    @JvmStatic
    fun dispatchReturnMissingLeadingJ(value: Int, token: Long): Int {
        check(token != 0L) { "kffi: routing token must be nonzero" }
        return value + 1
    }

    @JvmStatic
    fun dispatchStructReturn(token: Long, value: Int): Long {
        check(token != 0L) { "kffi: routing token must be nonzero" }
        return value.toLong()
    }

    @JvmStatic
    fun dispatchAllTypes(
        token: Long,
        i8: Byte,
        u8: Byte,
        i16: Short,
        u16: Short,
        i32: Int,
        u32: Int,
        i64: Long,
        u64: Long,
        f32: Float,
        f64: Double,
        pointer: Long,
        messageAddress: Long,
        size: Long,
        address: Long,
    ) {
        val messageView = MemoryBuffer(NativeAddress(messageAddress), 16uL)
        val messageDataAddress = messageView.readPointer(0uL)
        val messageLength = messageView.readLong(8uL).toInt()
        val messageBytes = ByteArray(messageLength)
        MemoryBuffer(messageDataAddress, messageLength.toULong()).readBytes(messageBytes)

        lastAllTypes = AllTypes(
            token = token,
            i8 = i8,
            u8 = u8,
            i16 = i16,
            u16 = u16,
            i32 = i32,
            u32 = u32,
            i64 = i64,
            u64 = u64,
            f32 = f32,
            f64 = f64,
            pointer = pointer,
            message = messageBytes.decodeToString(),
            messageLength = messageLength,
            messageAddressWasNonZero = messageAddress != 0L,
            size = size,
            address = address,
        )
    }
}
