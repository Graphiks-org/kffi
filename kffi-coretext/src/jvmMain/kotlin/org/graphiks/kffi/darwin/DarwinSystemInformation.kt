package org.graphiks.kffi.darwin

import org.graphiks.kffi.MemoryAllocator
import org.graphiks.kffi.apple.AppleBindingException
import org.graphiks.kffi.apple.AppleBindingFailure
import org.graphiks.kffi.apple.AppleNativeSymbols
import org.graphiks.kffi.engine.JvmDowncallEngine
import org.graphiks.kffi.engine.JvmDowncallEngine.AbiType
import org.graphiks.kffi.engine.JvmDowncallEngine.FunctionShape

/** Bounded, detached system information bytes from 64-bit macOS sysctlbyname. */
public object DarwinSystemInformation {
    private val symbols by lazy { AppleNativeSymbols(listOf("/usr/lib/libSystem.B.dylib")) }
    private val sysctl by lazy { symbols.address("sysctlbyname") }
    private val engine by lazy { JvmDowncallEngine }
    private val shape = FunctionShape(AbiType.I32,
        listOf(AbiType.Pointer, AbiType.Pointer, AbiType.Pointer, AbiType.Pointer, AbiType.I64))

    /**
     * Reads [name] with two native queries and returns exactly the final reported bytes,
     * including a terminating byte when present. No string interpretation or fallback is used.
     * [name] must be nonempty with no NUL; [maxBytes] must be positive and fit a JVM byte array.
     * Invalid arguments throw IllegalArgumentException. Unsupported platform, linking failures,
     * nonzero query status and incomplete or oversized reads throw AppleBindingException.
     * Temporary native memory is confined to this call and its executing thread.
     */
    public fun readSysctlBytes(name: String, maxBytes: Long): ByteArray {
        require(name.isNotEmpty() && '\u0000' !in name) { "sysctl name must be nonempty and contain no NUL" }
        require(maxBytes in 1..Int.MAX_VALUE.toLong()) { "maxBytes must be positive and fit a JVM byte array" }
        AppleNativeSymbols.requireSupportedPlatform()
        val function = sysctl
        return MemoryAllocator().use { allocator ->
            val nativeName = allocator.allocateFrom(name)
            val length = allocator.bufferOf(0L)
            val firstStatus = engine.callGeneric(function, shape,
                nativeName.handler.rawValue, 0L, length.handler.rawValue, 0L, 0L) as Int
            if (firstStatus != 0) incomplete("Size query failed with status $firstStatus")
            val capacity = length.readULong()
            if (capacity > maxBytes.toULong()) incomplete("Native size exceeds maxBytes")
            val output = allocator.allocateBuffer(capacity)
            val secondStatus = engine.callGeneric(function, shape,
                nativeName.handler.rawValue, output.handler.rawValue, length.handler.rawValue, 0L, 0L) as Int
            if (secondStatus != 0) incomplete("Data query failed with status $secondStatus")
            val returned = length.readULong()
            if (returned > capacity) incomplete("Native size exceeds allocated capacity")
            ByteArray(returned.toInt()).also { output.readBytes(it) }
        }
    }

    private fun incomplete(message: String): Nothing =
        throw AppleBindingException(AppleBindingFailure.SYSTEM_INFORMATION, message)
}
