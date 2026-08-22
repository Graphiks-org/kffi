package org.graphiks.kffi.posix

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.util.concurrent.ConcurrentHashMap
import org.graphiks.kffi.posix.generated.MAP_ANONYMOUS as generatedMapAnonymous
import org.graphiks.kffi.posix.generated.MAP_PRIVATE as generatedMapPrivate
import org.graphiks.kffi.posix.generated.MAP_SHARED as generatedMapShared
import org.graphiks.kffi.posix.generated.O_CREAT as generatedOCreat
import org.graphiks.kffi.posix.generated.O_EXCL as generatedOExcl
import org.graphiks.kffi.posix.generated.O_RDWR as generatedORdwr
import org.graphiks.kffi.posix.generated.PROT_READ as generatedProtRead
import org.graphiks.kffi.posix.generated.PROT_WRITE as generatedProtWrite

/** Captures errno for Linux libc downcalls before their temporary call state is released. */
internal object LinuxNativeCalls {
    private val linker = Linker.nativeLinker()
    private val captureErrno = Linker.Option.captureCallState("errno")
    private val captureLayout = Linker.Option.captureStateLayout()
    private val errnoOffset = captureLayout.byteOffset(groupElement("errno"))
    private val handles = ConcurrentHashMap<CallKey, MethodHandle>()

    fun <T> call(
        name: String,
        descriptor: FunctionDescriptor,
        arguments: List<Any>,
    ): CapturedCall<T> = Arena.ofConfined().use { arena ->
        val state = arena.allocate(captureLayout)
        val handle = handles.computeIfAbsent(CallKey(name, descriptor)) {
            val symbol = PosixSymbols.find(name)
                ?: throw IllegalStateException("required POSIX symbol '$name' is unavailable")
            linker.downcallHandle(symbol, descriptor, captureErrno)
        }
        @Suppress("UNCHECKED_CAST")
        val value = handle.invokeWithArguments(listOf(state) + arguments) as T
        CapturedCall(value, state.get(ValueLayout.JAVA_INT, errnoOffset))
    }

    private data class CallKey(val name: String, val descriptor: FunctionDescriptor)
}

internal data class CapturedCall<T>(val value: T, val errno: Int)

/** Linux mapping, POSIX shared-memory, and memfd calls with captured native errors. */
object LinuxPosix {
    val O_RDWR: Int get() = generatedORdwr()
    val O_CREAT: Int get() = generatedOCreat()
    val O_EXCL: Int get() = generatedOExcl()

    val PROT_READ: Int get() = generatedProtRead()
    val PROT_WRITE: Int get() = generatedProtWrite()

    val MAP_SHARED: Int get() = generatedMapShared()
    val MAP_PRIVATE: Int get() = generatedMapPrivate()
    val MAP_ANONYMOUS: Int get() = generatedMapAnonymous()

    fun mmap(
        address: MemorySegment,
        length: Long,
        protection: Int,
        flags: Int,
        fd: Int,
        offset: Long,
    ): MemorySegment {
        val result = LinuxNativeCalls.call<MemorySegment>(
            "mmap",
            FunctionDescriptor.of(
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
                ValueLayout.JAVA_LONG,
                ValueLayout.JAVA_INT,
                ValueLayout.JAVA_INT,
                ValueLayout.JAVA_INT,
                ValueLayout.JAVA_LONG,
            ),
            listOf(address, length, protection, flags, fd, offset),
        )
        if (result.value.address() == -1L) throw PosixException("mmap", result.errno)
        return result.value.reinterpret(length)
    }

    fun munmap(address: MemorySegment, length: Long) {
        scalar("munmap", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG), listOf(address, length))
    }

    fun shmOpen(name: String, flags: Int, mode: Int): Int = withName(name) { cName ->
        scalar(
            "shm_open",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            listOf(cName, flags, mode),
        )
    }

    fun shmUnlink(name: String) {
        withName(name) { cName ->
            scalar("shm_unlink", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS), listOf(cName))
        }
    }

    fun memfdCreate(name: String, flags: Int): Int = withName(name) { cName ->
        scalar(
            "memfd_create",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            listOf(cName, flags),
        )
    }

    fun ftruncate(fd: Int, length: Long) {
        scalar(
            "ftruncate",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG),
            listOf(fd, length),
        )
    }

    private fun scalar(name: String, descriptor: FunctionDescriptor, arguments: List<Any>): Int {
        val result = LinuxNativeCalls.call<Int>(name, descriptor, arguments)
        if (result.value < 0) throw PosixException(name, result.errno)
        return result.value
    }

    private inline fun <T> withName(name: String, block: (MemorySegment) -> T): T =
        Arena.ofConfined().use { arena -> block(arena.allocateFrom(name)) }
}
