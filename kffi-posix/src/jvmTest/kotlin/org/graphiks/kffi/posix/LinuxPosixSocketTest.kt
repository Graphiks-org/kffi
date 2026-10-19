package org.graphiks.kffi.posix

import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.test.Test
import kotlin.test.assertEquals
import org.graphiks.kffi.posix.generated.cmsghdr
import org.graphiks.kffi.posix.generated.iovec
import org.graphiks.kffi.posix.generated.msghdr
import org.graphiks.kffi.posix.generated.sockaddr_un

/**
 * Linux proofs of the AF_UNIX socket surface: stream pairs, connect over
 * a filesystem path, and ancillary fd passing (SCM_RIGHTS) — the exact
 * path the D-Bus control plane rides for capture (design
 * kadre/LINUX-CAPTURE-PORTAL-DESIGN.md D2).
 */
class LinuxPosixSocketTest {

    private fun isLinux(): Boolean = System.getProperty("os.name") == "Linux"

    @Test
    fun socketPairCarriesAStreamBothWays() {
        if (!isLinux()) return
        val pair = LinuxPosix.socketpair(type = LinuxPosix.SOCK_STREAM)
        try {
            Arena.ofConfined().use { arena ->
                // allocateFrom(String) carries the NUL terminator: 5 bytes
                val outgoing = arena.allocateFrom("ping")
                assertEquals(outgoing.byteSize(), LinuxPosix.send(pair.readFd, outgoing))

                val incoming = arena.allocate(8)
                assertEquals(outgoing.byteSize(), LinuxPosix.recv(pair.writeFd, incoming))
                assertEquals("ping", incoming.getString(0))
            }
        } finally {
            LinuxPosix.close(pair.readFd)
            LinuxPosix.close(pair.writeFd)
        }
    }

    @Test
    fun unixPathConnectsToAListeningPeer() {
        if (!isLinux()) return
        val path = "/tmp/kffi-posix-proof-${System.nanoTime()}"
        val server = LinuxPosix.socket(LinuxPosix.AF_UNIX, LinuxPosix.SOCK_STREAM)
        val client = -1
        var accepted = -1
        try {
            Arena.ofConfined().use { arena ->
                val address = sockaddr_un.allocate(arena)
                address.set(ValueLayout.JAVA_SHORT, sockaddr_un.layout.byteOffset(groupElement("sun_family")), LinuxPosix.AF_UNIX.toShort())
                val pathOffset = sockaddr_un.layout.byteOffset(groupElement("sun_path"))
                val bytes = path.toByteArray()
                arena.run {
                    for (index in bytes.indices) {
                        address.set(ValueLayout.JAVA_BYTE, pathOffset + index, bytes[index])
                    }
                    address.set(ValueLayout.JAVA_BYTE, pathOffset + bytes.size, 0)
                }
                val length = (pathOffset + bytes.size + 1).toInt()
                LinuxPosix.bind(server, address, length)
                LinuxPosix.listen(server)

                val clientFd = LinuxPosix.socket(LinuxPosix.AF_UNIX, LinuxPosix.SOCK_STREAM)
                try {
                    LinuxPosix.connect(clientFd, address, length)
                    accepted = LinuxPosix.accept(server)

                    val greeting = arena.allocateFrom("hello-portal")
                    LinuxPosix.send(clientFd, greeting)
                    val incoming = arena.allocate(32)
                    assertEquals(greeting.byteSize(), LinuxPosix.recv(accepted, incoming))
                    assertEquals("hello-portal", incoming.getString(0))
                } finally {
                    if (clientFd >= 0) LinuxPosix.close(clientFd)
                }
                client // (kept for readability of the fd lifecycle)
            }
        } finally {
            LinuxPosix.close(server)
            if (accepted >= 0) LinuxPosix.close(accepted)
            java.io.File(path).delete()
        }
    }

    @Test
    fun ancillaryDataPassesAFileDescriptor() {
        if (!isLinux()) return
        val pair = LinuxPosix.socketpair(type = LinuxPosix.SOCK_STREAM)
        try {
            Arena.ofConfined().use { arena ->
                // the payload fd carries one readable byte
                val payload = arena.allocate(1)
                payload.set(ValueLayout.JAVA_BYTE, 0, 42)

                // iovec: the data riding the message
                val vector = iovec.allocate(arena)
                vector.set(ValueLayout.ADDRESS, iovec.layout.byteOffset(groupElement("iov_base")), payload)
                vector.set(ValueLayout.JAVA_LONG, iovec.layout.byteOffset(groupElement("iov_len")), 1L)

                // control: one cmsghdr carrying one int fd
                val control = arena.allocate(64)
                val controlLength = (cmsghdr.layout.byteSize() + ValueLayout.JAVA_INT.byteSize()).toInt()
                control.set(ValueLayout.JAVA_LONG, cmsghdr.layout.byteOffset(groupElement("cmsg_len")), controlLength.toLong())
                control.set(ValueLayout.JAVA_INT, cmsghdr.layout.byteOffset(groupElement("cmsg_level")), LinuxPosix.SOL_SOCKET)
                control.set(ValueLayout.JAVA_INT, cmsghdr.layout.byteOffset(groupElement("cmsg_type")), LinuxPosix.SCM_RIGHTS)

                val transferred = LinuxPosix.socketpair(type = LinuxPosix.SOCK_STREAM)
                // the transferred fd must hold the byte the receiver reads
                val transferredPayload = arena.allocate(1)
                transferredPayload.set(ValueLayout.JAVA_BYTE, 0, 42)
                LinuxPosix.send(transferred.writeFd, transferredPayload)
                control.set(ValueLayout.JAVA_INT, cmsghdr.layout.byteSize(), transferred.readFd)
                try {
                    val message = msghdr.allocate(arena)
                    message.set(ValueLayout.ADDRESS, msghdr.layout.byteOffset(groupElement("msg_iov")), vector)
                    message.set(ValueLayout.JAVA_LONG, msghdr.layout.byteOffset(groupElement("msg_iovlen")), 1L)
                    message.set(ValueLayout.ADDRESS, msghdr.layout.byteOffset(groupElement("msg_control")), control)
                    message.set(ValueLayout.JAVA_LONG, msghdr.layout.byteOffset(groupElement("msg_controllen")), controlLength.toLong())

                    assertEquals(1L, LinuxPosix.sendmsg(pair.readFd, message))

                    // receive: fresh msghdr, control buffer, one iovec
                    val received = arena.allocate(1)
                    val receiveVector = iovec.allocate(arena)
                    receiveVector.set(ValueLayout.ADDRESS, iovec.layout.byteOffset(groupElement("iov_base")), received)
                    receiveVector.set(ValueLayout.JAVA_LONG, iovec.layout.byteOffset(groupElement("iov_len")), 1L)
                    val receiveControl = arena.allocate(64)
                    val receiveMessage = msghdr.allocate(arena)
                    receiveMessage.set(ValueLayout.ADDRESS, msghdr.layout.byteOffset(groupElement("msg_iov")), receiveVector)
                    receiveMessage.set(ValueLayout.JAVA_LONG, msghdr.layout.byteOffset(groupElement("msg_iovlen")), 1L)
                    receiveMessage.set(ValueLayout.ADDRESS, msghdr.layout.byteOffset(groupElement("msg_control")), receiveControl)
                    receiveMessage.set(ValueLayout.JAVA_LONG, msghdr.layout.byteOffset(groupElement("msg_controllen")), 64L)

                    assertEquals(1L, LinuxPosix.recvmsg(pair.writeFd, receiveMessage))
                    assertEquals(42, received.get(ValueLayout.JAVA_BYTE, 0).toInt())

                    val receivedLevel = receiveControl.get(ValueLayout.JAVA_INT, cmsghdr.layout.byteOffset(groupElement("cmsg_level")))
                    val receivedType = receiveControl.get(ValueLayout.JAVA_INT, cmsghdr.layout.byteOffset(groupElement("cmsg_type")))
                    assertEquals(LinuxPosix.SOL_SOCKET, receivedLevel)
                    assertEquals(LinuxPosix.SCM_RIGHTS, receivedType)

                    val receivedFd = receiveControl.get(ValueLayout.JAVA_INT, cmsghdr.layout.byteSize())
                    // the kernel duplicated the fd: it reads the same byte
                    val duplicated = arena.allocate(1)
                    assertEquals(1L, LinuxPosix.read(receivedFd, duplicated))
                    assertEquals(42, duplicated.get(ValueLayout.JAVA_BYTE, 0).toInt())
                    LinuxPosix.close(receivedFd)
                } finally {
                    LinuxPosix.close(transferred.readFd)
                    LinuxPosix.close(transferred.writeFd)
                }
            }
        } finally {
            LinuxPosix.close(pair.readFd)
            LinuxPosix.close(pair.writeFd)
        }
    }
}
