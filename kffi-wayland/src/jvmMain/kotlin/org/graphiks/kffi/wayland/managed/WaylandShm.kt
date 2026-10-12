package org.graphiks.kffi.wayland.managed

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicBoolean
import org.graphiks.kffi.wayland.WL_SHM_FORMAT_ARGB8888
import org.graphiks.kffi.wayland.createMemFd
import org.graphiks.kffi.wayland.createShmBuffer
import org.graphiks.kffi.wayland.createShmPool
import org.graphiks.kffi.wayland.closeFd
import org.graphiks.kffi.wayland.mmapFd
import org.graphiks.kffi.wayland.munmap
import org.graphiks.kffi.wayland.wlProxyDestroy

/**
 * Managed shm-backed `wl_buffer` (ARGB8888, `width` × `height`). The backing
 * memory is exposed through [content] — the consumer owns the pixels, kffi
 * owns the file descriptor, the mapping, the pool and the buffer proxy. The
 * release listener observes the compositor's `wl_buffer.release`; revocation
 * follows the managed listener contract. The buffer must be [close]d before
 * its owning [WaylandClient] is closed.
 */
public class WaylandShmBuffer internal constructor(
    internal val proxy: MemorySegment,
    private val poolProxy: MemorySegment,
    public val width: Int,
    public val height: Int,
    private val mapping: MemorySegment,
    private val byteSize: Int,
    private val fd: Int,
    private val lock: Any,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val listeners = ArrayList<WaylandSurfaceListener>()

    /** Direct view over the pixel memory (ARGB8888, `stride = width * 4`). */
    public fun content(): MemorySegment = mapping

    /** Observes the compositor's `release` event for this buffer. */
    public fun addReleaseListener(
        onRelease: () -> Unit,
        onFailure: (Throwable) -> Unit = {},
    ): WaylandSurfaceListener {
        val revoked = AtomicBoolean(false)
        val listener = WaylandSurfaceListener(revoked)
        val sink = object : Any() {
            fun releaseUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") buffer: MemorySegment,
            ) {
                if (revoked.get()) {
                    return
                }
                try {
                    onRelease()
                } catch (throwable: Throwable) {
                    runCatching { onFailure(throwable) }
                }
            }
        }
        val stub = WindowingFactory.upcallStub(
            sink,
            "releaseUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            Arena.ofShared(),
        )
        WindowingFactory.installListener(proxy, arrayOf(stub))
        synchronized(lock) { listeners.add(listener) }
        return listener
    }

    override fun close() {
        if (!closed.compareAndSet(false, true)) {
            return
        }
        synchronized(lock) { listeners.forEach(WaylandSurfaceListener::revoke) }
        runCatching { wlProxyDestroy?.invoke(proxy) }
        runCatching { wlProxyDestroy?.invoke(poolProxy) }
        runCatching { munmap(mapping, byteSize) }
        runCatching { closeFd(fd) }
    }
}

internal object ShmFactory {

    fun createShmBuffer(client: WaylandClient, width: Int, height: Int): WaylandShmBuffer {
        require(width > 0 && height > 0) { "buffer size must be positive" }
        val shm = client.bindGlobal("wl_shm", maxVersion = 1)
            ?: throw WaylandWindowingException("wl_shm is not advertised by the compositor")
        val stride = width * 4
        val byteSize = stride * height
        val fd = createMemFd("kffi-wayland-shm", byteSize)
        if (fd < 0) {
            throw WaylandWindowingException("memfd_create failed for a $width x $height buffer")
        }
        val mapping = mmapFd(fd, byteSize)
        if (mapping == null) {
            closeFd(fd)
            throw WaylandWindowingException("mmap failed for a $width x $height buffer")
        }
        // FFM cannot know the mapping size: expose exactly the pool bytes
        val mapped = mapping.reinterpret(byteSize.toLong())
        val poolAddress = org.graphiks.kffi.wayland.createShmPool(shm.proxy.address(), fd, byteSize)
        if (poolAddress == 0L) {
            munmap(mapping, byteSize)
            closeFd(fd)
            throw WaylandWindowingException("wl_shm.create_pool failed")
        }
        val poolProxy = MemorySegment.ofAddress(poolAddress)
        val bufferAddress = org.graphiks.kffi.wayland.createShmBuffer(shm.proxy.address(), poolAddress, 0, width, height, stride, WL_SHM_FORMAT_ARGB8888)
        if (bufferAddress == 0L) {
            org.graphiks.kffi.wayland.wlProxyDestroy?.let { destroy ->
                runCatching { destroy.invoke(poolProxy) }
            }
            munmap(mapping, byteSize)
            closeFd(fd)
            throw WaylandWindowingException("wl_shm_pool.create_buffer failed")
        }
        return WaylandShmBuffer(
            proxy = MemorySegment.ofAddress(bufferAddress),
            poolProxy = poolProxy,
            width = width,
            height = height,
            mapping = mapped,
            byteSize = byteSize,
            fd = fd,
            lock = client.managedLock,
        )
    }
}
