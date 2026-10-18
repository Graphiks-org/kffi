package org.graphiks.kffi.wayland.managed

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.atomic.AtomicBoolean
import org.graphiks.kffi.wayland.XDG_SURFACE_ACK_CONFIGURE
import org.graphiks.kffi.wayland.XDG_SURFACE_GET_TOPLEVEL
import org.graphiks.kffi.wayland.XDG_TOPLEVEL_SET_APP_ID
import org.graphiks.kffi.wayland.XDG_TOPLEVEL_SET_TITLE
import org.graphiks.kffi.wayland.WL_COMPOSITOR_CREATE_SURFACE
import org.graphiks.kffi.wayland.WL_SURFACE_ATTACH
import org.graphiks.kffi.wayland.WL_SURFACE_COMMIT
import org.graphiks.kffi.wayland.WL_SURFACE_SET_BUFFER_SCALE
import org.graphiks.kffi.wayland.WL_SURFACE_DAMAGE_BUFFER
import org.graphiks.kffi.wayland.WL_SURFACE_FRAME
import org.graphiks.kffi.wayland.generated.wl_callback_interface
import org.graphiks.kffi.wayland.wlProxyAddListener
import org.graphiks.kffi.wayland.wlProxyDestroy
import org.graphiks.kffi.wayland.wlCompositorInterface
import org.graphiks.kffi.wayland.wlProxyGetVersion
import org.graphiks.kffi.wayland.wlProxyMarshalFlagsFourInt
import org.graphiks.kffi.wayland.wlProxyMarshalFlagsObjectTwoInt
import org.graphiks.kffi.wayland.wlProxyMarshalFlagsString
import org.graphiks.kffi.wayland.wlProxyMarshalFlagsUint
import org.graphiks.kffi.wayland.wlProxyMarshalFlagsVoid
import org.graphiks.kffi.wayland.wlProxyMarshalFlagsGetXdgSurface
import org.graphiks.kffi.wayland.wlProxyMarshalNewId
import org.graphiks.kffi.wayland.wlSurfaceInterface
import org.graphiks.kffi.wayland.generated.xdg_surface_interface
import org.graphiks.kffi.wayland.generated.xdg_toplevel_interface
import org.graphiks.kffi.wayland.generated.xdg_wm_base_interface
import org.graphiks.kffi.wayland.XDG_WM_BASE_GET_XDG_SURFACE

/** Token of a managed windowing listener; revocation is terminal and idempotent. */
public class WaylandSurfaceListener internal constructor(
    private val revoked: AtomicBoolean,
) : AutoCloseable {

    public fun revoke(): Boolean = revoked.compareAndSet(false, true)

    public fun isActive(): Boolean = !revoked.get()

    override fun close() {
        revoke()
    }
}

/** Failure raised by the managed windowing layer when a native step cannot complete. */
public class WaylandWindowingException(message: String, cause: Throwable? = null) : IllegalStateException(message, cause)

internal class ManagedProxy internal constructor(
    internal val proxy: MemorySegment,
    internal val version: Int,
)

internal object WindowingFactory {

    private const val XDG_WM_BASE_PONG: Int = 3

    fun createSurface(client: WaylandClient): WaylandSurface {
        val compositor = client.bindGlobal("wl_compositor", maxVersion = 4)
            ?: throw WaylandWindowingException("wl_compositor is not advertised by the compositor")
        val surface = newId(
            proxy = compositor.proxy,
            opcode = WL_COMPOSITOR_CREATE_SURFACE,
            interfacePointer = requireInterface(wlSurfaceInterface, "wl_surface_interface"),
            version = compositor.version,
        )
        return WaylandSurface(client, client.managedArena, surface, client.managedLock)
    }

    fun createXdgSurface(client: WaylandClient, surface: WaylandSurface): WaylandXdgSurface {
        val wmBase = client.bindGlobal("xdg_wm_base", maxVersion = 2)
            ?: throw WaylandWindowingException("xdg_wm_base is not advertised by the compositor")
        installWmBasePong(wmBase, client.managedArena)
        // get_xdg_surface carries the wl_surface as an object argument
        val getXdgSurface = WindowingFactory.requireHandle(
            org.graphiks.kffi.wayland.wlProxyMarshalFlagsGetXdgSurface,
            "wl_proxy_marshal_flags",
        )
        val xdgSurface = getXdgSurface.invoke(
            wmBase.proxy,
            XDG_WM_BASE_GET_XDG_SURFACE,
            requireInterface(xdg_surface_interface, "xdg_surface_interface"),
            wmBase.version,
            0,
            MemorySegment.NULL,
            surface.proxy,
        ) as MemorySegment
        return WaylandXdgSurface(client.managedArena, xdgSurface, surface, client.managedLock)
    }

    fun createToplevel(client: WaylandClient, xdgSurface: WaylandXdgSurface): WaylandToplevel {
        val toplevel = newId(
            proxy = xdgSurface.proxy,
            opcode = XDG_SURFACE_GET_TOPLEVEL,
            interfacePointer = requireInterface(xdg_toplevel_interface, "xdg_toplevel_interface"),
            version = proxyVersion(xdgSurface.proxy),
        )
        return WaylandToplevel(client, client.managedArena, toplevel, client.managedLock)
    }

    private fun installWmBasePong(wmBase: ManagedProxy, arena: Arena) {
        val pong = requireHandle(wlProxyMarshalFlagsUint, "wl_proxy_marshal_flags")
        val sink = object : Any() {
            // the reply goes to the REAL wm_base proxy: the upcall `data`
            // argument is the registered (null) consumer data, never a proxy
            @Suppress("UNUSED_PARAMETER")
            fun pingUpcall(data: MemorySegment, wmBaseSegment: MemorySegment, serial: Int) {
                try {
                    pong.invoke(wmBase.proxy, XDG_WM_BASE_PONG, MemorySegment.NULL, wmBase.version, 0, serial)
                } catch (_: Throwable) {
                }
            }
        }
        installListener(
            wmBase.proxy,
            arrayOf(
                upcallStub(
                    sink,
                    "pingUpcall",
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
                    arena,
                ),
            ),
        )
    }

    private fun newId(proxy: MemorySegment, opcode: Int, interfacePointer: MemorySegment, version: Int): MemorySegment {
        val marshal = requireHandle(wlProxyMarshalNewId, "wl_proxy_marshal_flags")
        return marshal.invoke(proxy, opcode, interfacePointer, version, 0, MemorySegment.NULL) as MemorySegment
    }

    private fun proxyVersion(proxy: MemorySegment): Int =
        requireHandle(wlProxyGetVersion, "wl_proxy_get_version").invoke(proxy) as Int

    internal fun requireInterface(pointer: MemorySegment?, name: String): MemorySegment =
        requireNotNull(pointer) { "required libwayland interface '$name' is unavailable" }

    internal fun requireHandle(handle: MethodHandle?, symbol: String): MethodHandle =
        requireNotNull(handle) { "required libwayland symbol '$symbol' is unavailable" }

    internal fun upcallStub(
        sink: Any,
        methodName: String,
        descriptor: FunctionDescriptor,
        arena: Arena,
    ): MemorySegment {
        val parameterTypes = descriptor.argumentLayouts().map { layout -> (layout as ValueLayout).carrier() }
        val target = MethodHandles.lookup()
            .findVirtual(sink.javaClass, methodName, MethodType.methodType(Void.TYPE, parameterTypes))
            .bindTo(sink)
        return Linker.nativeLinker().upcallStub(target, descriptor, arena)
    }

    internal fun installListener(proxy: MemorySegment, stubs: Array<MemorySegment>) {
        val add = requireHandle(wlProxyAddListener, "wl_proxy_add_listener")
        val pointerSize = ValueLayout.ADDRESS.byteSize()
        val struct = Arena.ofShared().allocate(pointerSize * stubs.size, ValueLayout.ADDRESS.byteAlignment())
        stubs.forEachIndexed { index, stub -> struct.set(ValueLayout.ADDRESS, pointerSize * index.toLong(), stub) }
        val rc = add.invoke(proxy, struct, MemorySegment.NULL) as Int
        check(rc == 0) { "wl_proxy_add_listener failed with rc=$rc" }
    }
}

/**
 * Managed `wl_surface`: commit, attach of a managed shm buffer with full
 * buffer-space damage, one-shot frame callbacks and enter/leave observers.
 * Listeners are revocable with quiescence; payloads are consumed inside the
 * upcall; consumer exceptions never cross the native upcall. The surface must
 * be [close]d before its owning [WaylandClient] is closed.
 */
public class WaylandSurface internal constructor(
    private val client: WaylandClient,
    private val arena: Arena,
    internal val proxy: MemorySegment,
    private val lock: Any,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val listeners = ArrayList<WaylandSurfaceListener>()

    public val proxyAddress: Long
        get() = proxy.address()

    /**
     * `wl_surface.set_buffer_scale` (v6+): the compositor scales the buffer
     * contents by [factor] on the outputs it lands on. Ignored (silently)
     * by servers where the surface negotiated below v6.
     */
    public fun setBufferScale(factor: Int) {
        val uint = WindowingFactory.requireHandle(wlProxyMarshalFlagsUint, "wl_proxy_marshal_flags")
        uint.invoke(proxy, WL_SURFACE_SET_BUFFER_SCALE, MemorySegment.NULL, proxyVersion(), 0, factor) as Int
    }

    /** `wl_surface.commit` — publishes the current pending state. */
    public fun commit() {
        val void = WindowingFactory.requireHandle(wlProxyMarshalFlagsVoid, "wl_proxy_marshal_flags")
        void.invoke(proxy, WL_SURFACE_COMMIT, MemorySegment.NULL, proxyVersion(), 0) as Int
    }

    /**
     * `wl_surface.attach` + full `wl_surface.damage_buffer` + [commit]:
     * the standard mapping/repaint sequence for a shm-backed surface.
     */
    public fun attachAndCommit(buffer: WaylandShmBuffer, x: Int = 0, y: Int = 0) {
        val objectTwoInt = WindowingFactory.requireHandle(wlProxyMarshalFlagsObjectTwoInt, "wl_proxy_marshal_flags")
        objectTwoInt.invoke(proxy, WL_SURFACE_ATTACH, MemorySegment.NULL, proxyVersion(), 0, buffer.proxy, x, y) as Int
        val fourInt = WindowingFactory.requireHandle(wlProxyMarshalFlagsFourInt, "wl_proxy_marshal_flags")
        fourInt.invoke(
            proxy,
            WL_SURFACE_DAMAGE_BUFFER,
            MemorySegment.NULL,
            proxyVersion(),
            0,
            0,
            0,
            buffer.width,
            buffer.height,
        ) as Int
        commit()
    }

    /** Installs a one-shot `wl_surface.frame` callback; auto-revoked after it fires. */
    public fun addFrameListener(
        onFrame: (milliseconds: Int) -> Unit,
        onFailure: (Throwable) -> Unit = {},
    ): WaylandSurfaceListener {
        val revoked = AtomicBoolean(false)
        val listener = WaylandSurfaceListener(revoked)
        val frame = WindowingFactory.requireHandle(wlProxyMarshalNewId, "wl_proxy_marshal_flags")
        val callback = frame.invoke(
            proxy,
            WL_SURFACE_FRAME,
            WindowingFactory.requireInterface(wl_callback_interface, "wl_callback_interface"),
            proxyVersion(),
            0,
            MemorySegment.NULL,
        ) as MemorySegment
        val sink = object : Any() {
            fun frameDoneUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") callback: MemorySegment,
                milliseconds: Int,
            ) {
                if (revoked.get()) {
                    return
                }
                try {
                    onFrame(milliseconds)
                } catch (throwable: Throwable) {
                    runCatching { onFailure(throwable) }
                }
            }
        }
        installListener(
            callback,
            arrayOf(
                WindowingFactory.upcallStub(
                    sink,
                    "frameDoneUpcall",
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
                    arena,
                ),
            ),
        )
        return listener
    }

    /** Installs enter/leave observers delivering the output proxy address. */
    public fun addEnterLeaveListener(
        onEnter: (outputProxyAddress: Long) -> Unit,
        onLeave: (outputProxyAddress: Long) -> Unit,
        onFailure: (Throwable) -> Unit = {},
    ): WaylandSurfaceListener {
        val revoked = AtomicBoolean(false)
        val listener = WaylandSurfaceListener(revoked)
        val sink = object : Any() {
            fun enterUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") surface: MemorySegment,
                output: MemorySegment,
            ) {
                deliver(onEnter, output)
            }

            fun leaveUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") surface: MemorySegment,
                output: MemorySegment,
            ) {
                deliver(onLeave, output)
            }

            private fun deliver(target: (Long) -> Unit, output: MemorySegment) {
                if (revoked.get()) {
                    return
                }
                try {
                    target(output.address())
                } catch (throwable: Throwable) {
                    runCatching { onFailure(throwable) }
                }
            }
        }
        installListener(
            proxy,
            arrayOf(
                WindowingFactory.upcallStub(
                    sink,
                    "enterUpcall",
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    arena,
                ),
                WindowingFactory.upcallStub(
                    sink,
                    "leaveUpcall",
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    arena,
                ),
            ),
        )
        synchronized(lock) { listeners.add(listener) }
        return listener
    }

    override fun close() {
        if (!closed.compareAndSet(false, true)) {
            return
        }
        synchronized(lock) { listeners.forEach(WaylandSurfaceListener::revoke) }
        runCatching { wlProxyDestroy?.invoke(proxy) }
    }

    private fun proxyVersion(): Int =
        WindowingFactory.requireHandle(wlProxyGetVersion, "wl_proxy_get_version").invoke(proxy) as Int
}

/**
 * Managed `xdg_surface`: per-serial configure observation and acknowledgement.
 * `ackConfigure` must only be called for the latest observed serial; stale
 * serials must never be acknowledged twice.
 */
public class WaylandXdgSurface internal constructor(
    private val arena: Arena,
    internal val proxy: MemorySegment,
    private val surface: WaylandSurface,
    private val lock: Any,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val listeners = ArrayList<WaylandSurfaceListener>()

    /** The managed `wl_surface` this role was created on. */
    public val managedSurface: WaylandSurface
        get() = surface

    public val proxyAddress: Long
        get() = proxy.address()

    /** Installs the configure observer delivering the mandatory serial. */
    public fun addConfigureListener(
        onConfigure: (serial: Int) -> Unit,
        onFailure: (Throwable) -> Unit = {},
    ): WaylandSurfaceListener {
        val revoked = AtomicBoolean(false)
        val listener = WaylandSurfaceListener(revoked)
        val sink = object : Any() {
            fun configureUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") xdgSurface: MemorySegment,
                serial: Int,
            ) {
                if (revoked.get()) {
                    return
                }
                try {
                    onConfigure(serial)
                } catch (throwable: Throwable) {
                    runCatching { onFailure(throwable) }
                }
            }
        }
        installListener(
            proxy,
            arrayOf(
                WindowingFactory.upcallStub(
                    sink,
                    "configureUpcall",
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
                    arena,
                ),
            ),
        )
        synchronized(lock) { listeners.add(listener) }
        return listener
    }

    /** `xdg_surface.ack_configure` for the given serial. */
    public fun ackConfigure(serial: Int) {
        if (closed.get()) {
            throw WaylandWindowingException("xdg_surface is closed")
        }
        val ack = WindowingFactory.requireHandle(wlProxyMarshalFlagsUint, "wl_proxy_marshal_flags")
        ack.invoke(proxy, XDG_SURFACE_ACK_CONFIGURE, MemorySegment.NULL, proxyVersion(), 0, serial) as Int
    }

    override fun close() {
        if (!closed.compareAndSet(false, true)) {
            return
        }
        synchronized(lock) { listeners.forEach(WaylandSurfaceListener::revoke) }
        runCatching { wlProxyDestroy?.invoke(proxy) }
    }

    private fun proxyVersion(): Int =
        WindowingFactory.requireHandle(wlProxyGetVersion, "wl_proxy_get_version").invoke(proxy) as Int
}

/**
 * Managed `xdg_toplevel`: title/app id setters and the configure/close event
 * pair. Configure delivers the proposed size (zero means "not imposed") and a
 * copy of the states array taken before the upcall returns.
 */
public class WaylandToplevel internal constructor(
    @Suppress("UNUSED_PARAMETER") private val client: WaylandClient,
    private val arena: Arena,
    internal val proxy: MemorySegment,
    private val lock: Any,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val listeners = ArrayList<WaylandSurfaceListener>()

    /** Installs the configure/close observer pair for this toplevel. */
    public fun addEventsListener(
        onConfigure: (width: Int, height: Int, states: List<Int>) -> Unit,
        onClose: () -> Unit,
        onFailure: (Throwable) -> Unit = {},
    ): WaylandSurfaceListener {
        val revoked = AtomicBoolean(false)
        val listener = WaylandSurfaceListener(revoked)
        val sink = object : Any() {
            fun configureUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") toplevel: MemorySegment,
                width: Int,
                height: Int,
                states: MemorySegment,
            ) {
                if (revoked.get()) {
                    return
                }
                try {
                    // copy the states array immediately: it is only valid inside the upcall
                    val size = states.get(ValueLayout.JAVA_LONG, 0)
                    val data = states.get(ValueLayout.ADDRESS, 16)
                    val count = (size / 4).toInt()
                    val copied = ArrayList<Int>(count)
                    val segment = data.reinterpret((count * 4).toLong())
                    for (index in 0 until count) {
                        copied.add(segment.get(ValueLayout.JAVA_INT, (index * 4).toLong()))
                    }
                    onConfigure(width, height, copied)
                } catch (throwable: Throwable) {
                    runCatching { onFailure(throwable) }
                }
            }

            fun closeUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") toplevel: MemorySegment,
            ) {
                if (revoked.get()) {
                    return
                }
                try {
                    onClose()
                } catch (throwable: Throwable) {
                    runCatching { onFailure(throwable) }
                }
            }
        }
        installListener(
            proxy,
            arrayOf(
                WindowingFactory.upcallStub(
                    sink,
                    "configureUpcall",
                    FunctionDescriptor.ofVoid(
                        ValueLayout.ADDRESS, ValueLayout.ADDRESS,
                        ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS,
                    ),
                    arena,
                ),
                WindowingFactory.upcallStub(
                    sink,
                    "closeUpcall",
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    arena,
                ),
            ),
        )
        synchronized(lock) { listeners.add(listener) }
        return listener
    }

    /** `xdg_toplevel.set_title`. */
    public fun setTitle(title: String) {
        val string = WindowingFactory.requireHandle(wlProxyMarshalFlagsString, "wl_proxy_marshal_flags")
        Arena.ofConfined().use { temp ->
            string.invoke(proxy, XDG_TOPLEVEL_SET_TITLE, MemorySegment.NULL, proxyVersion(), 0, temp.allocateFrom(title)) as Int
        }
    }

    /** `xdg_toplevel.set_app_id`. */
    public fun setAppId(appId: String) {
        val string = WindowingFactory.requireHandle(wlProxyMarshalFlagsString, "wl_proxy_marshal_flags")
        Arena.ofConfined().use { temp ->
            string.invoke(proxy, XDG_TOPLEVEL_SET_APP_ID, MemorySegment.NULL, proxyVersion(), 0, temp.allocateFrom(appId)) as Int
        }
    }

    override fun close() {
        if (!closed.compareAndSet(false, true)) {
            return
        }
        synchronized(lock) { listeners.forEach(WaylandSurfaceListener::revoke) }
        runCatching { wlProxyDestroy?.invoke(proxy) }
    }

    private fun proxyVersion(): Int =
        WindowingFactory.requireHandle(wlProxyGetVersion, "wl_proxy_get_version").invoke(proxy) as Int
}

private fun installListener(proxy: MemorySegment, stubs: Array<MemorySegment>) {
    val add = WindowingFactory.requireHandle(wlProxyAddListener, "wl_proxy_add_listener")
    val pointerSize = ValueLayout.ADDRESS.byteSize()
    val struct = Arena.ofShared().allocate(pointerSize * stubs.size, ValueLayout.ADDRESS.byteAlignment())
    stubs.forEachIndexed { index, stub -> struct.set(ValueLayout.ADDRESS, pointerSize * index.toLong(), stub) }
    val rc = add.invoke(proxy, struct, MemorySegment.NULL) as Int
    check(rc == 0) { "wl_proxy_add_listener failed with rc=$rc" }
}
