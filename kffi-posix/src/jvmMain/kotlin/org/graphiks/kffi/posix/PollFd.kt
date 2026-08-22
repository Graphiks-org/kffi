package org.graphiks.kffi.posix

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import org.graphiks.kffi.posix.generated.POLLERR as generatedPollerr
import org.graphiks.kffi.posix.generated.POLLHUP as generatedPollhup
import org.graphiks.kffi.posix.generated.POLLIN as generatedPollin
import org.graphiks.kffi.posix.generated.POLLMSG as generatedPollmsg
import org.graphiks.kffi.posix.generated.POLLNVAL as generatedPollnval
import org.graphiks.kffi.posix.generated.POLLOUT as generatedPollout
import org.graphiks.kffi.posix.generated.POLLPRI as generatedPollpri
import org.graphiks.kffi.posix.generated.POLLRDBAND as generatedPollrdband
import org.graphiks.kffi.posix.generated.POLLRDHUP as generatedPollrdhup
import org.graphiks.kffi.posix.generated.POLLRDNORM as generatedPollrdnorm
import org.graphiks.kffi.posix.generated.POLLREMOVE as generatedPollremove
import org.graphiks.kffi.posix.generated.POLLWRBAND as generatedPollwrband
import org.graphiks.kffi.posix.generated.POLLWRNORM as generatedPollwrnorm

/** Layout helpers for the POSIX `struct pollfd`. */
object PollFd {
    val POLLIN: Short get() = generatedPollin().toShort()
    val POLLPRI: Short get() = generatedPollpri().toShort()
    val POLLOUT: Short get() = generatedPollout().toShort()
    val POLLERR: Short get() = generatedPollerr().toShort()
    val POLLHUP: Short get() = generatedPollhup().toShort()
    val POLLNVAL: Short get() = generatedPollnval().toShort()
    val POLLRDNORM: Short get() = generatedPollrdnorm().toShort()
    val POLLRDBAND: Short get() = generatedPollrdband().toShort()
    val POLLWRNORM: Short get() = generatedPollwrnorm().toShort()
    val POLLWRBAND: Short get() = generatedPollwrband().toShort()
    val POLLMSG: Short get() = generatedPollmsg().toShort()
    val POLLREMOVE: Short get() = generatedPollremove().toShort()
    val POLLRDHUP: Short get() = generatedPollrdhup().toShort()
    const val SIZE_BYTES: Long = 8

    fun allocate(arena: Arena, count: Int): MemorySegment {
        require(count >= 0) { "count must be non-negative" }
        return arena.allocate(SIZE_BYTES * count, ValueLayout.JAVA_INT.byteAlignment())
    }

    fun set(segment: MemorySegment, index: Int, fd: Int, events: Short) {
        val offset = index * SIZE_BYTES
        segment.set(ValueLayout.JAVA_INT, offset, fd)
        segment.set(ValueLayout.JAVA_SHORT, offset + 4, events)
        segment.set(ValueLayout.JAVA_SHORT, offset + 6, 0)
    }

    fun revents(segment: MemorySegment, index: Int): Short =
        segment.get(ValueLayout.JAVA_SHORT, index * SIZE_BYTES + 6)

    fun poll(segment: MemorySegment, count: Long, timeoutMillis: Int): Int {
        require(count >= 0) { "count must be non-negative" }
        require(timeoutMillis >= -1) { "timeoutMillis must be -1 or non-negative" }
        return LinuxPosix.poll(segment, count, timeoutMillis)
    }

    fun isReadable(fd: Int, timeoutMillis: Int): Boolean {
        require(fd >= 0) { "fd must be non-negative" }
        require(timeoutMillis >= -1) { "timeoutMillis must be -1 or non-negative" }
        Arena.ofConfined().use { arena ->
            val descriptor = allocate(arena, 1)
            set(descriptor, 0, fd, POLLIN)
            while (true) {
                try {
                    return poll(descriptor, 1, timeoutMillis) > 0 &&
                        (revents(descriptor, 0).toInt() and POLLIN.toInt()) != 0
                } catch (failure: PosixException) {
                    if (failure.errno != EINTR) throw failure
                }
            }
        }
    }

    internal fun isReadable(
        fd: Int,
        timeoutMillis: Int,
        symbols: PosixSymbolLookup,
        syscalls: PosixSyscalls,
    ): Boolean {
        require(fd >= 0) { "fd must be non-negative" }
        require(timeoutMillis >= -1) { "timeoutMillis must be -1 or non-negative" }
        val poll = symbols.require("poll")
        while (true) {
            val result = syscalls.poll(poll, fd, timeoutMillis)
            if (result.succeeded) return result.value == true
            if (result.errno == EINTR) continue
            throw PosixException("poll", result.requireErrno())
        }
    }
}
