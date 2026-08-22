package org.graphiks.kffi.posix

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.util.concurrent.ConcurrentHashMap
import org.graphiks.kffi.posix.generated.KFFI_MAP_FAILED_ADDRESS as generatedMapFailedAddress
import org.graphiks.kffi.posix.generated.KFFI_SHMAT_FAILED_ADDRESS as generatedShmatFailedAddress
import org.graphiks.kffi.posix.generated.F_GETFD as generatedFGetFd
import org.graphiks.kffi.posix.generated.F_GETFL as generatedFGetFl
import org.graphiks.kffi.posix.generated.F_SETFD as generatedFSetFd
import org.graphiks.kffi.posix.generated.F_SETFL as generatedFSetFl
import org.graphiks.kffi.posix.generated.IPC_CREAT as generatedIpcCreat
import org.graphiks.kffi.posix.generated.IPC_PRIVATE as generatedIpcPrivate
import org.graphiks.kffi.posix.generated.IPC_RMID as generatedIpcRmid
import org.graphiks.kffi.posix.generated.MAP_ANONYMOUS as generatedMapAnonymous
import org.graphiks.kffi.posix.generated.MAP_PRIVATE as generatedMapPrivate
import org.graphiks.kffi.posix.generated.MAP_SHARED as generatedMapShared
import org.graphiks.kffi.posix.generated.MFD_CLOEXEC as generatedMfdCloexec
import org.graphiks.kffi.posix.generated.O_CLOEXEC as generatedOCloexec
import org.graphiks.kffi.posix.generated.O_CREAT as generatedOCreat
import org.graphiks.kffi.posix.generated.O_EXCL as generatedOExcl
import org.graphiks.kffi.posix.generated.O_NONBLOCK as generatedONonblock
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
        vararg options: Linker.Option,
    ): CapturedCall<T> = Arena.ofConfined().use { arena ->
        val state = arena.allocate(captureLayout)
        val handle = handles.computeIfAbsent(CallKey(name, descriptor)) {
            val symbol = PosixSymbols.find(name)
                ?: throw IllegalStateException("required POSIX symbol '$name' is unavailable")
            linker.downcallHandle(symbol, descriptor, captureErrno, *options)
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
    val MAP_FAILED_ADDRESS: Long get() = generatedMapFailedAddress()

    val O_RDWR: Int get() = generatedORdwr()
    val O_CREAT: Int get() = generatedOCreat()
    val O_EXCL: Int get() = generatedOExcl()
    val O_CLOEXEC: Int get() = generatedOCloexec()
    val O_NONBLOCK: Int get() = generatedONonblock()
    val MFD_CLOEXEC: Int get() = generatedMfdCloexec()

    val IPC_PRIVATE: Int get() = generatedIpcPrivate()
    val IPC_CREAT: Int get() = generatedIpcCreat()
    val IPC_RMID: Int get() = generatedIpcRmid()

    val F_GETFD: Int get() = generatedFGetFd()
    val F_SETFD: Int get() = generatedFSetFd()
    val F_GETFL: Int get() = generatedFGetFl()
    val F_SETFL: Int get() = generatedFSetFl()

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
        if (result.value.address() == MAP_FAILED_ADDRESS) throw PosixException("mmap", result.errno)
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

    fun eventfd(initialValue: Int, flags: Int): Int = scalar(
        "eventfd",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
        listOf(initialValue, flags),
    )

    fun poll(descriptors: MemorySegment, count: Long, timeoutMillis: Int): Int {
        require(count >= 0) { "count must be non-negative" }
        require(timeoutMillis >= -1) { "timeoutMillis must be -1 or non-negative" }
        require(count <= descriptors.byteSize() / PollFd.SIZE_BYTES) {
            "count exceeds the descriptor segment capacity"
        }
        return scalar(
            "poll",
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                ValueLayout.JAVA_LONG,
                ValueLayout.JAVA_INT,
            ),
            listOf(descriptors, count, timeoutMillis),
        )
    }

    fun pipe(): FdPair = pipe("pipe", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS), emptyList())

    fun pipe2(flags: Int): FdPair = pipe(
        "pipe2",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        listOf(flags),
    )

    fun fcntl(fd: Int, command: Int, argument: Int = 0): Int = scalar(
        "fcntl",
        FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
        ),
        listOf(fd, command, argument),
        Linker.Option.firstVariadicArg(2),
    )

    fun read(
        fd: Int,
        destination: MemorySegment,
        byteCount: Long = destination.byteSize(),
    ): Long {
        require(byteCount >= 0) { "byteCount must be non-negative" }
        require(byteCount <= destination.byteSize()) {
            "byteCount exceeds the destination segment size"
        }
        return count(
            "read",
            listOf(fd, destination, byteCount),
        )
    }

    fun write(
        fd: Int,
        source: MemorySegment,
        byteCount: Long = source.byteSize(),
    ): Long {
        require(byteCount >= 0) { "byteCount must be non-negative" }
        require(byteCount <= source.byteSize()) {
            "byteCount exceeds the source segment size"
        }
        return count(
            "write",
            listOf(fd, source, byteCount),
        )
    }

    fun close(fd: Int) {
        scalar("close", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT), listOf(fd))
    }

    fun shmget(key: Int, size: Long, flags: Int): Int = scalar(
        "shmget",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT),
        listOf(key, size, flags),
    )

    fun shmat(
        shmid: Int,
        address: MemorySegment = MemorySegment.NULL,
        flags: Int = 0,
    ): MemorySegment {
        val result = LinuxNativeCalls.call<MemorySegment>(
            "shmat",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            listOf(shmid, address, flags),
        )
        if (result.value.address() == generatedShmatFailedAddress()) {
            throw PosixException("shmat", result.errno)
        }
        return result.value
    }

    fun shmdt(address: MemorySegment) {
        scalar("shmdt", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS), listOf(address))
    }

    fun shmctl(shmid: Int, command: Int, buffer: MemorySegment = MemorySegment.NULL) {
        scalar(
            "shmctl",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            listOf(shmid, command, buffer),
        )
    }

    private fun scalar(
        name: String,
        descriptor: FunctionDescriptor,
        arguments: List<Any>,
        vararg options: Linker.Option,
    ): Int {
        val result = LinuxNativeCalls.call<Int>(name, descriptor, arguments, *options)
        if (result.value < 0) throw PosixException(name, result.errno)
        return result.value
    }

    private fun pipe(name: String, descriptor: FunctionDescriptor, arguments: List<Any>): FdPair =
        Arena.ofConfined().use { arena ->
            val descriptors = arena.allocate(ValueLayout.JAVA_INT, 2)
            val result = LinuxNativeCalls.call<Int>(name, descriptor, listOf(descriptors) + arguments)
            if (result.value < 0) throw PosixException(name, result.errno)
            FdPair(
                descriptors.getAtIndex(ValueLayout.JAVA_INT, 0),
                descriptors.getAtIndex(ValueLayout.JAVA_INT, 1),
            )
        }

    private fun count(name: String, arguments: List<Any>): Long {
        val result = LinuxNativeCalls.call<Long>(
            name,
            FunctionDescriptor.of(
                ValueLayout.JAVA_LONG,
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                ValueLayout.JAVA_LONG,
            ),
            arguments,
        )
        if (result.value < 0) throw PosixException(name, result.errno)
        return result.value
    }

    private inline fun <T> withName(name: String, block: (MemorySegment) -> T): T =
        Arena.ofConfined().use { arena -> block(arena.allocateFrom(name)) }
}
