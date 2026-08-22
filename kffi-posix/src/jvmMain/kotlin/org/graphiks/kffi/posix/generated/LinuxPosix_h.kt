package org.graphiks.kffi.posix.generated

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

private object kextract_runtime {
    val C_BOOL: ValueLayout = ValueLayout.JAVA_BOOLEAN
    val C_CHAR: ValueLayout = ValueLayout.JAVA_BYTE
    val C_SHORT: ValueLayout = ValueLayout.JAVA_SHORT
    val C_INT: ValueLayout = ValueLayout.JAVA_INT
    val C_LONG: ValueLayout = ValueLayout.JAVA_LONG
    val C_LONG_LONG: ValueLayout = ValueLayout.JAVA_LONG
    val C_FLOAT: ValueLayout = ValueLayout.JAVA_FLOAT
    val C_DOUBLE: ValueLayout = ValueLayout.JAVA_DOUBLE
    val C_POINTER: ValueLayout = ValueLayout.ADDRESS
}

private val LOOKUP: SymbolLookup = run {
    var lu: SymbolLookup = SymbolLookup.loaderLookup()
    lu = SymbolLookup.libraryLookup("libc.so.6", Arena.global()).or(lu)
    lu
}

/**
 * {@snippet lang=c : #define EINTR 4
 */
fun EINTR(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define EAGAIN 11
 */
fun EAGAIN(): Int = (11).toInt()

/**
 * {@snippet lang=c : #define ENOMEM 12
 */
fun ENOMEM(): Int = (12).toInt()

/**
 * {@snippet lang=c : #define EINVAL 22
 */
fun EINVAL(): Int = (22).toInt()

/**
 * {@snippet lang=c : #define ENOSYS 38
 */
fun ENOSYS(): Int = (38).toInt()

/**
 * {@snippet lang=c : #define O_ACCMODE 3
 */
fun O_ACCMODE(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define O_RDONLY 0
 */
fun O_RDONLY(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define O_WRONLY 1
 */
fun O_WRONLY(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define O_RDWR 2
 */
fun O_RDWR(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define O_CREAT 64
 */
fun O_CREAT(): Int = (64).toInt()

/**
 * {@snippet lang=c : #define O_EXCL 128
 */
fun O_EXCL(): Int = (128).toInt()

/**
 * {@snippet lang=c : #define O_NOCTTY 256
 */
fun O_NOCTTY(): Int = (256).toInt()

/**
 * {@snippet lang=c : #define O_TRUNC 512
 */
fun O_TRUNC(): Int = (512).toInt()

/**
 * {@snippet lang=c : #define O_APPEND 1024
 */
fun O_APPEND(): Int = (1024).toInt()

/**
 * {@snippet lang=c : #define O_NONBLOCK 2048
 */
fun O_NONBLOCK(): Int = (2048).toInt()

/**
 * {@snippet lang=c : #define O_SYNC 1052672
 */
fun O_SYNC(): Int = (1052672).toInt()

/**
 * {@snippet lang=c : #define O_ASYNC 8192
 */
fun O_ASYNC(): Int = (8192).toInt()

/**
 * {@snippet lang=c : #define F_GETFD 1
 */
fun F_GETFD(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define F_SETFD 2
 */
fun F_SETFD(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define F_GETFL 3
 */
fun F_GETFL(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define F_SETFL 4
 */
fun F_SETFL(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define POLLIN 1
 */
fun POLLIN(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define POLLPRI 2
 */
fun POLLPRI(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define POLLOUT 4
 */
fun POLLOUT(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define POLLRDNORM 64
 */
fun POLLRDNORM(): Int = (64).toInt()

/**
 * {@snippet lang=c : #define POLLRDBAND 128
 */
fun POLLRDBAND(): Int = (128).toInt()

/**
 * {@snippet lang=c : #define POLLWRNORM 256
 */
fun POLLWRNORM(): Int = (256).toInt()

/**
 * {@snippet lang=c : #define POLLWRBAND 512
 */
fun POLLWRBAND(): Int = (512).toInt()

/**
 * {@snippet lang=c : #define POLLMSG 1024
 */
fun POLLMSG(): Int = (1024).toInt()

/**
 * {@snippet lang=c : #define POLLREMOVE 4096
 */
fun POLLREMOVE(): Int = (4096).toInt()

/**
 * {@snippet lang=c : #define POLLRDHUP 8192
 */
fun POLLRDHUP(): Int = (8192).toInt()

/**
 * {@snippet lang=c : #define POLLERR 8
 */
fun POLLERR(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define POLLHUP 16
 */
fun POLLHUP(): Int = (16).toInt()

/**
 * {@snippet lang=c : #define POLLNVAL 32
 */
fun POLLNVAL(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define IPC_CREAT 512
 */
fun IPC_CREAT(): Int = (512).toInt()

/**
 * {@snippet lang=c : #define IPC_EXCL 1024
 */
fun IPC_EXCL(): Int = (1024).toInt()

/**
 * {@snippet lang=c : #define IPC_NOWAIT 2048
 */
fun IPC_NOWAIT(): Int = (2048).toInt()

/**
 * {@snippet lang=c : #define IPC_RMID 0
 */
fun IPC_RMID(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define IPC_SET 1
 */
fun IPC_SET(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define IPC_STAT 2
 */
fun IPC_STAT(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define IPC_INFO 3
 */
fun IPC_INFO(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define MAP_32BIT 64
 */
fun MAP_32BIT(): Int = (64).toInt()

/**
 * {@snippet lang=c : #define MAP_ABOVE4G 128
 */
fun MAP_ABOVE4G(): Int = (128).toInt()

/**
 * {@snippet lang=c : #define MAP_GROWSDOWN 256
 */
fun MAP_GROWSDOWN(): Int = (256).toInt()

/**
 * {@snippet lang=c : #define MAP_DENYWRITE 2048
 */
fun MAP_DENYWRITE(): Int = (2048).toInt()

/**
 * {@snippet lang=c : #define MAP_EXECUTABLE 4096
 */
fun MAP_EXECUTABLE(): Int = (4096).toInt()

/**
 * {@snippet lang=c : #define MAP_LOCKED 8192
 */
fun MAP_LOCKED(): Int = (8192).toInt()

/**
 * {@snippet lang=c : #define MAP_NORESERVE 16384
 */
fun MAP_NORESERVE(): Int = (16384).toInt()

/**
 * {@snippet lang=c : #define MAP_POPULATE 32768
 */
fun MAP_POPULATE(): Int = (32768).toInt()

/**
 * {@snippet lang=c : #define MAP_NONBLOCK 65536
 */
fun MAP_NONBLOCK(): Int = (65536).toInt()

/**
 * {@snippet lang=c : #define MAP_STACK 131072
 */
fun MAP_STACK(): Int = (131072).toInt()

/**
 * {@snippet lang=c : #define MAP_HUGETLB 262144
 */
fun MAP_HUGETLB(): Int = (262144).toInt()

/**
 * {@snippet lang=c : #define MAP_SYNC 524288
 */
fun MAP_SYNC(): Int = (524288).toInt()

/**
 * {@snippet lang=c : #define MAP_FIXED_NOREPLACE 1048576
 */
fun MAP_FIXED_NOREPLACE(): Int = (1048576).toInt()

/**
 * {@snippet lang=c : #define PROT_READ 1
 */
fun PROT_READ(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define PROT_WRITE 2
 */
fun PROT_WRITE(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define PROT_EXEC 4
 */
fun PROT_EXEC(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define PROT_NONE 0
 */
fun PROT_NONE(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define PROT_GROWSDOWN 16777216
 */
fun PROT_GROWSDOWN(): Int = (16777216).toInt()

/**
 * {@snippet lang=c : #define PROT_GROWSUP 33554432
 */
fun PROT_GROWSUP(): Int = (33554432).toInt()

/**
 * {@snippet lang=c : #define MAP_SHARED 1
 */
fun MAP_SHARED(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define MAP_PRIVATE 2
 */
fun MAP_PRIVATE(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define MAP_SHARED_VALIDATE 3
 */
fun MAP_SHARED_VALIDATE(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define MAP_TYPE 15
 */
fun MAP_TYPE(): Int = (15).toInt()

/**
 * {@snippet lang=c : #define MAP_FIXED 16
 */
fun MAP_FIXED(): Int = (16).toInt()

/**
 * {@snippet lang=c : #define MAP_FILE 0
 */
fun MAP_FILE(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define MAP_ANONYMOUS 32
 */
fun MAP_ANONYMOUS(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define MAP_HUGE_SHIFT 26
 */
fun MAP_HUGE_SHIFT(): Int = (26).toInt()

/**
 * {@snippet lang=c : #define MAP_HUGE_MASK 63
 */
fun MAP_HUGE_MASK(): Int = (63).toInt()

/**
 * {@snippet lang=c : typedef Int error_t;}
 */
typealias error_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char __u_char;}
 */
typealias _u_char = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __u_short;}
 */
typealias _u_short = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __u_int;}
 */
typealias _u_int = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __u_long;}
 */
typealias _u_long = Long

/**
 * {@snippet lang=c : typedef SIGNED = Char __int8_t;}
 */
typealias _int8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char __uint8_t;}
 */
typealias _uint8_t = Byte

/**
 * {@snippet lang=c : typedef Short __int16_t;}
 */
typealias _int16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __uint16_t;}
 */
typealias _uint16_t = Short

/**
 * {@snippet lang=c : typedef Int __int32_t;}
 */
typealias _int32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __uint32_t;}
 */
typealias _uint32_t = Int

/**
 * {@snippet lang=c : typedef Long __int64_t;}
 */
typealias _int64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __uint64_t;}
 */
typealias _uint64_t = Long

/**
 * {@snippet lang=c : typedef SIGNED = Char __int_least8_t;}
 */
typealias _int_least8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char __uint_least8_t;}
 */
typealias _uint_least8_t = Byte

/**
 * {@snippet lang=c : typedef Short __int_least16_t;}
 */
typealias _int_least16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __uint_least16_t;}
 */
typealias _uint_least16_t = Short

/**
 * {@snippet lang=c : typedef Int __int_least32_t;}
 */
typealias _int_least32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __uint_least32_t;}
 */
typealias _uint_least32_t = Int

/**
 * {@snippet lang=c : typedef Long __int_least64_t;}
 */
typealias _int_least64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __uint_least64_t;}
 */
typealias _uint_least64_t = Long

/**
 * {@snippet lang=c : typedef Long __quad_t;}
 */
typealias _quad_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __u_quad_t;}
 */
typealias _u_quad_t = Long

/**
 * {@snippet lang=c : typedef Long __intmax_t;}
 */
typealias _intmax_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __uintmax_t;}
 */
typealias _uintmax_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __dev_t;}
 */
typealias _dev_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __uid_t;}
 */
typealias _uid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __gid_t;}
 */
typealias _gid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __ino_t;}
 */
typealias _ino_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __ino64_t;}
 */
typealias _ino64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __mode_t;}
 */
typealias _mode_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __nlink_t;}
 */
typealias _nlink_t = Long

/**
 * {@snippet lang=c : typedef Long __off_t;}
 */
typealias _off_t = Long

/**
 * {@snippet lang=c : typedef Long __off64_t;}
 */
typealias _off64_t = Long

/**
 * {@snippet lang=c : typedef Int __pid_t;}
 */
typealias _pid_t = Int

/**
 * {@snippet lang=c : typedef Long __clock_t;}
 */
typealias _clock_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __rlim_t;}
 */
typealias _rlim_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __rlim64_t;}
 */
typealias _rlim64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __id_t;}
 */
typealias _id_t = Int

/**
 * {@snippet lang=c : typedef Long __time_t;}
 */
typealias _time_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __useconds_t;}
 */
typealias _useconds_t = Int

/**
 * {@snippet lang=c : typedef Long __suseconds_t;}
 */
typealias _suseconds_t = Long

/**
 * {@snippet lang=c : typedef Long __suseconds64_t;}
 */
typealias _suseconds64_t = Long

/**
 * {@snippet lang=c : typedef Int __daddr_t;}
 */
typealias _daddr_t = Int

/**
 * {@snippet lang=c : typedef Int __key_t;}
 */
typealias _key_t = Int

/**
 * {@snippet lang=c : typedef Int __clockid_t;}
 */
typealias _clockid_t = Int

/**
 * {@snippet lang=c : typedef Long __blksize_t;}
 */
typealias _blksize_t = Long

/**
 * {@snippet lang=c : typedef Long __blkcnt_t;}
 */
typealias _blkcnt_t = Long

/**
 * {@snippet lang=c : typedef Long __blkcnt64_t;}
 */
typealias _blkcnt64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __fsblkcnt_t;}
 */
typealias _fsblkcnt_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __fsblkcnt64_t;}
 */
typealias _fsblkcnt64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __fsfilcnt_t;}
 */
typealias _fsfilcnt_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __fsfilcnt64_t;}
 */
typealias _fsfilcnt64_t = Long

/**
 * {@snippet lang=c : typedef Long __fsword_t;}
 */
typealias _fsword_t = Long

/**
 * {@snippet lang=c : typedef Long __ssize_t;}
 */
typealias _ssize_t = Long

/**
 * {@snippet lang=c : typedef Long __syscall_slong_t;}
 */
typealias _syscall_slong_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __syscall_ulong_t;}
 */
typealias _syscall_ulong_t = Long

/**
 * {@snippet lang=c : typedef Long __loff_t;}
 */
typealias _loff_t = Long

/**
 * {@snippet lang=c : typedef Long __intptr_t;}
 */
typealias _intptr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __socklen_t;}
 */
typealias _socklen_t = Int

/**
 * {@snippet lang=c : typedef Int __sig_atomic_t;}
 */
typealias _sig_atomic_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long size_t;}
 */
typealias size_t = Long

/**
 * NS_ENUM: {@snippet lang=c : enum __pid_type}
 */
enum class _pid_type(val value: Long) {
    F_OWNER_TID(0L), F_OWNER_PID(1L), F_OWNER_PGRP(2L), F_OWNER_GID(2L);

    companion object {
        fun fromValue(v: Long): _pid_type = entries.firstOrNull { it.value == v }
            ?: error("Unknown _pid_type value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mode_t;}
 */
typealias mode_t = Int

/**
 * {@snippet lang=c : typedef Long off_t;}
 */
typealias off_t = Long

/**
 * {@snippet lang=c : typedef Long off64_t;}
 */
typealias off64_t = Long

/**
 * {@snippet lang=c : typedef Int pid_t;}
 */
typealias pid_t = Int

/**
 * {@snippet lang=c : typedef Long time_t;}
 */
typealias time_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long nfds_t;}
 */
typealias nfds_t = Long

/**
 * {@snippet lang=c : poll Int((Declared(pollfd))*,UNSIGNED = Long,Int)
 */
private val poll_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val poll_ADDR: MemorySegment = LOOKUP.find("poll").orElseThrow()
private val poll_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(poll_ADDR, poll_DESC)

fun poll(arg0: MemorySegment, arg1: Long, arg2: Int): Int {
    try {
        return poll_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef Long int64_t;}
 */
typealias int64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uint64_t;}
 */
typealias uint64_t = Long

/**
 * {@snippet lang=c : typedef Long int_least64_t;}
 */
typealias int_least64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uint_least64_t;}
 */
typealias uint_least64_t = Long

/**
 * {@snippet lang=c : typedef Long int_fast64_t;}
 */
typealias int_fast64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uint_fast64_t;}
 */
typealias uint_fast64_t = Long

/**
 * {@snippet lang=c : typedef Int int32_t;}
 */
typealias int32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint32_t;}
 */
typealias uint32_t = Int

/**
 * {@snippet lang=c : typedef Int int_least32_t;}
 */
typealias int_least32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint_least32_t;}
 */
typealias uint_least32_t = Int

/**
 * {@snippet lang=c : typedef Int int_fast32_t;}
 */
typealias int_fast32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint_fast32_t;}
 */
typealias uint_fast32_t = Int

/**
 * {@snippet lang=c : typedef Short int16_t;}
 */
typealias int16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint16_t;}
 */
typealias uint16_t = Short

/**
 * {@snippet lang=c : typedef Short int_least16_t;}
 */
typealias int_least16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint_least16_t;}
 */
typealias uint_least16_t = Short

/**
 * {@snippet lang=c : typedef Short int_fast16_t;}
 */
typealias int_fast16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint_fast16_t;}
 */
typealias uint_fast16_t = Short

/**
 * {@snippet lang=c : typedef SIGNED = Char int8_t;}
 */
typealias int8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint8_t;}
 */
typealias uint8_t = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char int_least8_t;}
 */
typealias int_least8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint_least8_t;}
 */
typealias uint_least8_t = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char int_fast8_t;}
 */
typealias int_fast8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint_fast8_t;}
 */
typealias uint_fast8_t = Byte

/**
 * {@snippet lang=c : typedef Long intptr_t;}
 */
typealias intptr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uintptr_t;}
 */
typealias uintptr_t = Long

/**
 * {@snippet lang=c : typedef Long intmax_t;}
 */
typealias intmax_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uintmax_t;}
 */
typealias uintmax_t = Long

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/eventfd.h:23:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_eventfd_h_23_1_(val value: Long) {
    EFD_SEMAPHORE(1L), EFD_CLOEXEC(524288L), EFD_NONBLOCK(2048L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_eventfd_h_23_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_eventfd_h_23_1_ value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long eventfd_t;}
 */
typealias eventfd_t = Long

/**
 * {@snippet lang=c : eventfd Int(UNSIGNED = Int,Int)
 */
private val eventfd_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val eventfd_ADDR: MemorySegment = LOOKUP.find("eventfd").orElseThrow()
private val eventfd_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(eventfd_ADDR, eventfd_DESC)

fun eventfd(arg0: Int, arg1: Int): Int {
    try {
        return eventfd_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef Int __ipc_pid_t;}
 */
typealias _ipc_pid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uid_t;}
 */
typealias uid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int gid_t;}
 */
typealias gid_t = Int

/**
 * {@snippet lang=c : typedef Int key_t;}
 */
typealias key_t = Int

/**
 * {@snippet lang=c : memfd_create Int((Char)*,UNSIGNED = Int)
 */
private val memfd_create_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val memfd_create_ADDR: MemorySegment = LOOKUP.find("memfd_create").orElseThrow()
private val memfd_create_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(memfd_create_ADDR, memfd_create_DESC)

fun memfd_create(arg0: MemorySegment, arg1: Int): Int {
    try {
        return memfd_create_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : mmap (Void)*((Void)*,UNSIGNED = Long,Int,Int,Int,Long)
 */
private val mmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private val mmap_ADDR: MemorySegment = LOOKUP.find("mmap").orElseThrow()
private val mmap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(mmap_ADDR, mmap_DESC)

fun mmap(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int, arg4: Int, arg5: Long): MemorySegment {
    try {
        return mmap_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : munmap Int((Void)*,UNSIGNED = Long)
 */
private val munmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val munmap_ADDR: MemorySegment = LOOKUP.find("munmap").orElseThrow()
private val munmap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(munmap_ADDR, munmap_DESC)

fun munmap(arg0: MemorySegment, arg1: Long): Int {
    try {
        return munmap_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : shm_open Int((Char)*,Int,UNSIGNED = Int)
 */
private val shm_open_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val shm_open_ADDR: MemorySegment = LOOKUP.find("shm_open").orElseThrow()
private val shm_open_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(shm_open_ADDR, shm_open_DESC)

fun shm_open(arg0: MemorySegment, arg1: Int, arg2: Int): Int {
    try {
        return shm_open_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : shm_unlink Int((Char)*)
 */
private val shm_unlink_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val shm_unlink_ADDR: MemorySegment = LOOKUP.find("shm_unlink").orElseThrow()
private val shm_unlink_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(shm_unlink_ADDR, shm_unlink_DESC)

fun shm_unlink(arg0: MemorySegment): Int {
    try {
        return shm_unlink_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long shmatt_t;}
 */
typealias shmatt_t = Long

/**
 * {@snippet lang=c : shmctl Int(Int,Int,(Declared(shmid_ds))*)
 */
private val shmctl_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val shmctl_ADDR: MemorySegment = LOOKUP.find("shmctl").orElseThrow()
private val shmctl_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(shmctl_ADDR, shmctl_DESC)

fun shmctl(arg0: Int, arg1: Int, arg2: MemorySegment): Int {
    try {
        return shmctl_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : shmget Int(Int,UNSIGNED = Long,Int)
 */
private val shmget_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val shmget_ADDR: MemorySegment = LOOKUP.find("shmget").orElseThrow()
private val shmget_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(shmget_ADDR, shmget_DESC)

fun shmget(arg0: Int, arg1: Long, arg2: Int): Int {
    try {
        return shmget_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : shmat (Void)*(Int,(Void)*,Int)
 */
private val shmat_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val shmat_ADDR: MemorySegment = LOOKUP.find("shmat").orElseThrow()
private val shmat_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(shmat_ADDR, shmat_DESC)

fun shmat(arg0: Int, arg1: MemorySegment, arg2: Int): MemorySegment {
    try {
        return shmat_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : shmdt Int((Void)*)
 */
private val shmdt_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val shmdt_ADDR: MemorySegment = LOOKUP.find("shmdt").orElseThrow()
private val shmdt_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(shmdt_ADDR, shmdt_DESC)

fun shmdt(arg0: MemorySegment): Int {
    try {
        return shmdt_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef Long ssize_t;}
 */
typealias ssize_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int useconds_t;}
 */
typealias useconds_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int socklen_t;}
 */
typealias socklen_t = Int

/**
 * {@snippet lang=c : close Int(Int)
 */
private val close_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val close_ADDR: MemorySegment = LOOKUP.find("close").orElseThrow()
private val close_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(close_ADDR, close_DESC)

fun close(arg0: Int): Int {
    try {
        return close_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : read Long(Int,(Void)*,UNSIGNED = Long)
 */
private val read_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val read_ADDR: MemorySegment = LOOKUP.find("read").orElseThrow()
private val read_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(read_ADDR, read_DESC)

fun read(arg0: Int, arg1: MemorySegment, arg2: Long): Long {
    try {
        return read_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : write Long(Int,(Void)*,UNSIGNED = Long)
 */
private val write_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val write_ADDR: MemorySegment = LOOKUP.find("write").orElseThrow()
private val write_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(write_ADDR, write_DESC)

fun write(arg0: Int, arg1: MemorySegment, arg2: Long): Long {
    try {
        return write_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pipe Int((Int)*)
 */
private val pipe_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val pipe_ADDR: MemorySegment = LOOKUP.find("pipe").orElseThrow()
private val pipe_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(pipe_ADDR, pipe_DESC)

fun pipe(arg0: MemorySegment): Int {
    try {
        return pipe_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pipe2 Int((Int)*,Int)
 */
private val pipe2_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val pipe2_ADDR: MemorySegment = LOOKUP.find("pipe2").orElseThrow()
private val pipe2_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(pipe2_ADDR, pipe2_DESC)

fun pipe2(arg0: MemorySegment, arg1: Int): Int {
    try {
        return pipe2_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/confname.h:24:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_24_1_(val value: Long) {
    _PC_LINK_MAX(0L), _PC_MAX_CANON(1L), _PC_MAX_INPUT(2L), _PC_NAME_MAX(3L), _PC_PATH_MAX(4L), _PC_PIPE_BUF(5L), _PC_CHOWN_RESTRICTED(6L), _PC_NO_TRUNC(7L), _PC_VDISABLE(8L), _PC_SYNC_IO(9L), _PC_ASYNC_IO(10L), _PC_PRIO_IO(11L), _PC_SOCK_MAXBUF(12L), _PC_FILESIZEBITS(13L), _PC_REC_INCR_XFER_SIZE(14L), _PC_REC_MAX_XFER_SIZE(15L), _PC_REC_MIN_XFER_SIZE(16L), _PC_REC_XFER_ALIGN(17L), _PC_ALLOC_SIZE_MIN(18L), _PC_SYMLINK_MAX(19L), _PC_2_SYMLINKS(20L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_24_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_24_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/confname.h:71:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_71_1_(val value: Long) {
    _SC_ARG_MAX(0L), _SC_CHILD_MAX(1L), _SC_CLK_TCK(2L), _SC_NGROUPS_MAX(3L), _SC_OPEN_MAX(4L), _SC_STREAM_MAX(5L), _SC_TZNAME_MAX(6L), _SC_JOB_CONTROL(7L), _SC_SAVED_IDS(8L), _SC_REALTIME_SIGNALS(9L), _SC_PRIORITY_SCHEDULING(10L), _SC_TIMERS(11L), _SC_ASYNCHRONOUS_IO(12L), _SC_PRIORITIZED_IO(13L), _SC_SYNCHRONIZED_IO(14L), _SC_FSYNC(15L), _SC_MAPPED_FILES(16L), _SC_MEMLOCK(17L), _SC_MEMLOCK_RANGE(18L), _SC_MEMORY_PROTECTION(19L), _SC_MESSAGE_PASSING(20L), _SC_SEMAPHORES(21L), _SC_SHARED_MEMORY_OBJECTS(22L), _SC_AIO_LISTIO_MAX(23L), _SC_AIO_MAX(24L), _SC_AIO_PRIO_DELTA_MAX(25L), _SC_DELAYTIMER_MAX(26L), _SC_MQ_OPEN_MAX(27L), _SC_MQ_PRIO_MAX(28L), _SC_VERSION(29L), _SC_PAGESIZE(30L), _SC_RTSIG_MAX(31L), _SC_SEM_NSEMS_MAX(32L), _SC_SEM_VALUE_MAX(33L), _SC_SIGQUEUE_MAX(34L), _SC_TIMER_MAX(35L), _SC_BC_BASE_MAX(36L), _SC_BC_DIM_MAX(37L), _SC_BC_SCALE_MAX(38L), _SC_BC_STRING_MAX(39L), _SC_COLL_WEIGHTS_MAX(40L), _SC_EQUIV_CLASS_MAX(41L), _SC_EXPR_NEST_MAX(42L), _SC_LINE_MAX(43L), _SC_RE_DUP_MAX(44L), _SC_CHARCLASS_NAME_MAX(45L), _SC_2_VERSION(46L), _SC_2_C_BIND(47L), _SC_2_C_DEV(48L), _SC_2_FORT_DEV(49L), _SC_2_FORT_RUN(50L), _SC_2_SW_DEV(51L), _SC_2_LOCALEDEF(52L), _SC_PII(53L), _SC_PII_XTI(54L), _SC_PII_SOCKET(55L), _SC_PII_INTERNET(56L), _SC_PII_OSI(57L), _SC_POLL(58L), _SC_SELECT(59L), _SC_UIO_MAXIOV(60L), _SC_IOV_MAX(60L), _SC_PII_INTERNET_STREAM(61L), _SC_PII_INTERNET_DGRAM(62L), _SC_PII_OSI_COTS(63L), _SC_PII_OSI_CLTS(64L), _SC_PII_OSI_M(65L), _SC_T_IOV_MAX(66L), _SC_THREADS(67L), _SC_THREAD_SAFE_FUNCTIONS(68L), _SC_GETGR_R_SIZE_MAX(69L), _SC_GETPW_R_SIZE_MAX(70L), _SC_LOGIN_NAME_MAX(71L), _SC_TTY_NAME_MAX(72L), _SC_THREAD_DESTRUCTOR_ITERATIONS(73L), _SC_THREAD_KEYS_MAX(74L), _SC_THREAD_STACK_MIN(75L), _SC_THREAD_THREADS_MAX(76L), _SC_THREAD_ATTR_STACKADDR(77L), _SC_THREAD_ATTR_STACKSIZE(78L), _SC_THREAD_PRIORITY_SCHEDULING(79L), _SC_THREAD_PRIO_INHERIT(80L), _SC_THREAD_PRIO_PROTECT(81L), _SC_THREAD_PROCESS_SHARED(82L), _SC_NPROCESSORS_CONF(83L), _SC_NPROCESSORS_ONLN(84L), _SC_PHYS_PAGES(85L), _SC_AVPHYS_PAGES(86L), _SC_ATEXIT_MAX(87L), _SC_PASS_MAX(88L), _SC_XOPEN_VERSION(89L), _SC_XOPEN_XCU_VERSION(90L), _SC_XOPEN_UNIX(91L), _SC_XOPEN_CRYPT(92L), _SC_XOPEN_ENH_I18N(93L), _SC_XOPEN_SHM(94L), _SC_2_CHAR_TERM(95L), _SC_2_C_VERSION(96L), _SC_2_UPE(97L), _SC_XOPEN_XPG2(98L), _SC_XOPEN_XPG3(99L), _SC_XOPEN_XPG4(100L), _SC_CHAR_BIT(101L), _SC_CHAR_MAX(102L), _SC_CHAR_MIN(103L), _SC_INT_MAX(104L), _SC_INT_MIN(105L), _SC_LONG_BIT(106L), _SC_WORD_BIT(107L), _SC_MB_LEN_MAX(108L), _SC_NZERO(109L), _SC_SSIZE_MAX(110L), _SC_SCHAR_MAX(111L), _SC_SCHAR_MIN(112L), _SC_SHRT_MAX(113L), _SC_SHRT_MIN(114L), _SC_UCHAR_MAX(115L), _SC_UINT_MAX(116L), _SC_ULONG_MAX(117L), _SC_USHRT_MAX(118L), _SC_NL_ARGMAX(119L), _SC_NL_LANGMAX(120L), _SC_NL_MSGMAX(121L), _SC_NL_NMAX(122L), _SC_NL_SETMAX(123L), _SC_NL_TEXTMAX(124L), _SC_XBS5_ILP32_OFF32(125L), _SC_XBS5_ILP32_OFFBIG(126L), _SC_XBS5_LP64_OFF64(127L), _SC_XBS5_LPBIG_OFFBIG(128L), _SC_XOPEN_LEGACY(129L), _SC_XOPEN_REALTIME(130L), _SC_XOPEN_REALTIME_THREADS(131L), _SC_ADVISORY_INFO(132L), _SC_BARRIERS(133L), _SC_BASE(134L), _SC_C_LANG_SUPPORT(135L), _SC_C_LANG_SUPPORT_R(136L), _SC_CLOCK_SELECTION(137L), _SC_CPUTIME(138L), _SC_THREAD_CPUTIME(139L), _SC_DEVICE_IO(140L), _SC_DEVICE_SPECIFIC(141L), _SC_DEVICE_SPECIFIC_R(142L), _SC_FD_MGMT(143L), _SC_FIFO(144L), _SC_PIPE(145L), _SC_FILE_ATTRIBUTES(146L), _SC_FILE_LOCKING(147L), _SC_FILE_SYSTEM(148L), _SC_MONOTONIC_CLOCK(149L), _SC_MULTI_PROCESS(150L), _SC_SINGLE_PROCESS(151L), _SC_NETWORKING(152L), _SC_READER_WRITER_LOCKS(153L), _SC_SPIN_LOCKS(154L), _SC_REGEXP(155L), _SC_REGEX_VERSION(156L), _SC_SHELL(157L), _SC_SIGNALS(158L), _SC_SPAWN(159L), _SC_SPORADIC_SERVER(160L), _SC_THREAD_SPORADIC_SERVER(161L), _SC_SYSTEM_DATABASE(162L), _SC_SYSTEM_DATABASE_R(163L), _SC_TIMEOUTS(164L), _SC_TYPED_MEMORY_OBJECTS(165L), _SC_USER_GROUPS(166L), _SC_USER_GROUPS_R(167L), _SC_2_PBS(168L), _SC_2_PBS_ACCOUNTING(169L), _SC_2_PBS_LOCATE(170L), _SC_2_PBS_MESSAGE(171L), _SC_2_PBS_TRACK(172L), _SC_SYMLOOP_MAX(173L), _SC_STREAMS(174L), _SC_2_PBS_CHECKPOINT(175L), _SC_V6_ILP32_OFF32(176L), _SC_V6_ILP32_OFFBIG(177L), _SC_V6_LP64_OFF64(178L), _SC_V6_LPBIG_OFFBIG(179L), _SC_HOST_NAME_MAX(180L), _SC_TRACE(181L), _SC_TRACE_EVENT_FILTER(182L), _SC_TRACE_INHERIT(183L), _SC_TRACE_LOG(184L), _SC_LEVEL1_ICACHE_SIZE(185L), _SC_LEVEL1_ICACHE_ASSOC(186L), _SC_LEVEL1_ICACHE_LINESIZE(187L), _SC_LEVEL1_DCACHE_SIZE(188L), _SC_LEVEL1_DCACHE_ASSOC(189L), _SC_LEVEL1_DCACHE_LINESIZE(190L), _SC_LEVEL2_CACHE_SIZE(191L), _SC_LEVEL2_CACHE_ASSOC(192L), _SC_LEVEL2_CACHE_LINESIZE(193L), _SC_LEVEL3_CACHE_SIZE(194L), _SC_LEVEL3_CACHE_ASSOC(195L), _SC_LEVEL3_CACHE_LINESIZE(196L), _SC_LEVEL4_CACHE_SIZE(197L), _SC_LEVEL4_CACHE_ASSOC(198L), _SC_LEVEL4_CACHE_LINESIZE(199L), _SC_IPV6(235L), _SC_RAW_SOCKETS(236L), _SC_V7_ILP32_OFF32(237L), _SC_V7_ILP32_OFFBIG(238L), _SC_V7_LP64_OFF64(239L), _SC_V7_LPBIG_OFFBIG(240L), _SC_SS_REPL_MAX(241L), _SC_TRACE_EVENT_NAME_MAX(242L), _SC_TRACE_NAME_MAX(243L), _SC_TRACE_SYS_MAX(244L), _SC_TRACE_USER_EVENT_MAX(245L), _SC_XOPEN_STREAMS(246L), _SC_THREAD_ROBUST_PRIO_INHERIT(247L), _SC_THREAD_ROBUST_PRIO_PROTECT(248L), _SC_MINSIGSTKSZ(249L), _SC_SIGSTKSZ(250L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_71_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_71_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/confname.h:539:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_539_1_(val value: Long) {
    _CS_PATH(0L), _CS_V6_WIDTH_RESTRICTED_ENVS(1L), _CS_GNU_LIBC_VERSION(2L), _CS_GNU_LIBPTHREAD_VERSION(3L), _CS_V5_WIDTH_RESTRICTED_ENVS(4L), _CS_V7_WIDTH_RESTRICTED_ENVS(5L), _CS_LFS_CFLAGS(1000L), _CS_LFS_LDFLAGS(1001L), _CS_LFS_LIBS(1002L), _CS_LFS_LINTFLAGS(1003L), _CS_LFS64_CFLAGS(1004L), _CS_LFS64_LDFLAGS(1005L), _CS_LFS64_LIBS(1006L), _CS_LFS64_LINTFLAGS(1007L), _CS_XBS5_ILP32_OFF32_CFLAGS(1100L), _CS_XBS5_ILP32_OFF32_LDFLAGS(1101L), _CS_XBS5_ILP32_OFF32_LIBS(1102L), _CS_XBS5_ILP32_OFF32_LINTFLAGS(1103L), _CS_XBS5_ILP32_OFFBIG_CFLAGS(1104L), _CS_XBS5_ILP32_OFFBIG_LDFLAGS(1105L), _CS_XBS5_ILP32_OFFBIG_LIBS(1106L), _CS_XBS5_ILP32_OFFBIG_LINTFLAGS(1107L), _CS_XBS5_LP64_OFF64_CFLAGS(1108L), _CS_XBS5_LP64_OFF64_LDFLAGS(1109L), _CS_XBS5_LP64_OFF64_LIBS(1110L), _CS_XBS5_LP64_OFF64_LINTFLAGS(1111L), _CS_XBS5_LPBIG_OFFBIG_CFLAGS(1112L), _CS_XBS5_LPBIG_OFFBIG_LDFLAGS(1113L), _CS_XBS5_LPBIG_OFFBIG_LIBS(1114L), _CS_XBS5_LPBIG_OFFBIG_LINTFLAGS(1115L), _CS_POSIX_V6_ILP32_OFF32_CFLAGS(1116L), _CS_POSIX_V6_ILP32_OFF32_LDFLAGS(1117L), _CS_POSIX_V6_ILP32_OFF32_LIBS(1118L), _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS(1119L), _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS(1120L), _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS(1121L), _CS_POSIX_V6_ILP32_OFFBIG_LIBS(1122L), _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS(1123L), _CS_POSIX_V6_LP64_OFF64_CFLAGS(1124L), _CS_POSIX_V6_LP64_OFF64_LDFLAGS(1125L), _CS_POSIX_V6_LP64_OFF64_LIBS(1126L), _CS_POSIX_V6_LP64_OFF64_LINTFLAGS(1127L), _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS(1128L), _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS(1129L), _CS_POSIX_V6_LPBIG_OFFBIG_LIBS(1130L), _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS(1131L), _CS_POSIX_V7_ILP32_OFF32_CFLAGS(1132L), _CS_POSIX_V7_ILP32_OFF32_LDFLAGS(1133L), _CS_POSIX_V7_ILP32_OFF32_LIBS(1134L), _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS(1135L), _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS(1136L), _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS(1137L), _CS_POSIX_V7_ILP32_OFFBIG_LIBS(1138L), _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS(1139L), _CS_POSIX_V7_LP64_OFF64_CFLAGS(1140L), _CS_POSIX_V7_LP64_OFF64_LDFLAGS(1141L), _CS_POSIX_V7_LP64_OFF64_LIBS(1142L), _CS_POSIX_V7_LP64_OFF64_LINTFLAGS(1143L), _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS(1144L), _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS(1145L), _CS_POSIX_V7_LPBIG_OFFBIG_LIBS(1146L), _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS(1147L), _CS_V6_ENV(1148L), _CS_V7_ENV(1149L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_539_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_539_1_ value: $v")
    }
}

/**
 * {@snippet lang=c : ftruncate Int(Int,Long)
 */
private val ftruncate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private val ftruncate_ADDR: MemorySegment = LOOKUP.find("ftruncate").orElseThrow()
private val ftruncate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(ftruncate_ADDR, ftruncate_DESC)

fun ftruncate(arg0: Int, arg1: Long): Int {
    try {
        return ftruncate_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : #define O_NDELAY 2048
 */
fun O_NDELAY(): Int = (2048).toInt()

/**
 * {@snippet lang=c : #define O_FSYNC 1052672
 */
fun O_FSYNC(): Int = (1052672).toInt()

/**
 * {@snippet lang=c : #define O_LARGEFILE 0
 */
fun O_LARGEFILE(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define O_DIRECTORY 65536
 */
fun O_DIRECTORY(): Int = (65536).toInt()

/**
 * {@snippet lang=c : #define O_NOFOLLOW 131072
 */
fun O_NOFOLLOW(): Int = (131072).toInt()

/**
 * {@snippet lang=c : #define O_CLOEXEC 524288
 */
fun O_CLOEXEC(): Int = (524288).toInt()

/**
 * {@snippet lang=c : #define O_DIRECT 16384
 */
fun O_DIRECT(): Int = (16384).toInt()

/**
 * {@snippet lang=c : #define O_NOATIME 262144
 */
fun O_NOATIME(): Int = (262144).toInt()

/**
 * {@snippet lang=c : #define O_PATH 2097152
 */
fun O_PATH(): Int = (2097152).toInt()

/**
 * {@snippet lang=c : #define O_TMPFILE 4259840
 */
fun O_TMPFILE(): Int = (4259840).toInt()

/**
 * {@snippet lang=c : #define O_DSYNC 4096
 */
fun O_DSYNC(): Int = (4096).toInt()

/**
 * {@snippet lang=c : #define O_RSYNC 1052672
 */
fun O_RSYNC(): Int = (1052672).toInt()

/**
 * {@snippet lang=c : #define IPC_PRIVATE 0
 */
fun IPC_PRIVATE(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define MAP_ANON 32
 */
fun MAP_ANON(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define MFD_CLOEXEC 1
 */
fun MFD_CLOEXEC(): Int = (1).toInt()

// Skipped constant MAP_FAILED: numeric value cannot be represented as MemorySegment

/**
 * {@snippet lang=c : #define KFFI_MAP_FAILED_ADDRESS -1
 */
fun KFFI_MAP_FAILED_ADDRESS(): Long = -1

/**
 * {@snippet lang=c : #define KFFI_SHMAT_FAILED_ADDRESS -1
 */
fun KFFI_SHMAT_FAILED_ADDRESS(): Long = -1
