package org.graphiks.kffi.wayland.managed

import org.graphiks.kffi.wayland.WL_DATA_OFFER_ACCEPT
import org.graphiks.kffi.wayland.WL_DATA_OFFER_DESTROY
import org.graphiks.kffi.wayland.WL_DATA_OFFER_FINISH
import org.graphiks.kffi.wayland.WL_DATA_OFFER_RECEIVE
import org.graphiks.kffi.wayland.WL_DATA_DEVICE_RELEASE

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.atomic.AtomicBoolean

/** One wl_data_device lifecycle event with its offer proxy (0 when none). */
public class WaylandDataDeviceEvent public constructor(
    public val kind: Kind,
    public val serial: Int,
    public val surfaceAddress: Long,
    public val x: Double,
    public val y: Double,
    public val offerProxy: MemorySegment,
    public val offerProxyAddress: Long,
) {
    public enum class Kind { DataOffer, Enter, Leave, Motion, Drop, Selection }
}

/** One wl_data_offer event: a MIME type announce or an action change. */
public class WaylandDataOfferEvent public constructor(
    public val kind: Kind,
    public val mime: String?,
    public val sourceActions: Int,
    public val action: Int,
) {
    public enum class Kind { Offer, SourceActions, Action }
}

/** Revocable handle for one registered device/offer consumer. */
public class WaylandDataListener internal constructor(
    private val revoked: AtomicBoolean,
) {
    public fun revoke(): Boolean = revoked.compareAndSet(false, true)
    public fun isActive(): Boolean = !revoked.get()
}

/** Managed facade over one `wl_data_offer`. */
public class WaylandDataOffer internal constructor(
    internal val proxy: MemorySegment,
    private val arena: Arena,
    private val lock: Any,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val consumers = ArrayList<(WaylandDataOfferEvent) -> Unit>()
    private var installed = false

    public fun addListener(
        onEvent: (WaylandDataOfferEvent) -> Unit,
    ): WaylandDataListener {
        val revoked = AtomicBoolean(false)
        synchronized(lock) {
            if (!installed) {
                installed = true
                installListener()
            }
            consumers.add { event -> if (!revoked.get()) onEvent(event) }
        }
        return WaylandDataListener(revoked)
    }

    /** `accept(serial, mime)` — null mime refuses the offer. */
    public fun accept(serial: Int, mime: String?) {
        val handle = DataAccess.stringNullableHandle() ?: return
        Arena.ofConfined().use { temp ->
            val mimePointer = mime?.let { temp.allocateFrom(it) } ?: MemorySegment.NULL
            handle.invoke(proxy, WL_DATA_OFFER_ACCEPT, MemorySegment.NULL, 1, 0, serial, mimePointer) as Int
        }
    }

    /**
     * `receive(mime)` — the static-inline helper delegates to
     * `wl_proxy_receive`, which returns the read fd OWNED by the caller
     * (-1 on error).
     */
    public fun receive(mime: String): Int {
        val handle = DataAccess.receiveFdHandle() ?: return -1
        Arena.ofConfined().use { temp ->
            val mimePointer = temp.allocateFrom(mime)
            return handle.invoke(proxy, mimePointer) as Int
        }
    }

    /** `finish` (v3) — terminalises an accepted drop. */
    public fun finish() {
        val handle = DataAccess.voidHandle() ?: return
        handle.invoke(proxy, WL_DATA_OFFER_FINISH, MemorySegment.NULL, 1, 0)
    }

    /** `destroy`; idempotent. */
    override fun close() {
        if (!closed.compareAndSet(false, true)) return
        synchronized(lock) { consumers.clear() }
        val handle = DataAccess.voidHandle() ?: return
        handle.invoke(proxy, WL_DATA_OFFER_DESTROY, MemorySegment.NULL, 1, 0)
    }

    private fun deliver(event: WaylandDataOfferEvent) {
        synchronized(lock) { ArrayList(consumers) }.forEach { it(event) }
    }

    private fun installListener() {
        val dispatcher = object : Any() {
            fun offerUpcall(data: MemorySegment, p: MemorySegment, mime: MemorySegment) {
                val copied = if (mime.address() == 0L) null else mime.reinterpret(1024).getString(0)
                deliver(WaylandDataOfferEvent(WaylandDataOfferEvent.Kind.Offer, copied, 0, 0))
            }

            fun sourceActionsUpcall(data: MemorySegment, p: MemorySegment, actions: Int) {
                deliver(WaylandDataOfferEvent(WaylandDataOfferEvent.Kind.SourceActions, null, actions, 0))
            }

            fun actionUpcall(data: MemorySegment, p: MemorySegment, action: Int) {
                deliver(WaylandDataOfferEvent(WaylandDataOfferEvent.Kind.Action, null, 0, action))
            }
        }

        fun stub(method: String, descriptor: FunctionDescriptor): MemorySegment {
            val parameterTypes = descriptor.argumentLayouts().map { layout -> (layout as ValueLayout).carrier() }
            val target = MethodHandles.lookup()
                .findVirtual(dispatcher.javaClass, method, MethodType.methodType(Void.TYPE, parameterTypes))
                .bindTo(dispatcher)
            return java.lang.foreign.Linker.nativeLinker().upcallStub(target, descriptor, arena)
        }

        val pointerSize = ValueLayout.ADDRESS.byteSize()
        val struct = arena.allocate(pointerSize * 3L, ValueLayout.ADDRESS.byteAlignment())
        struct.set(ValueLayout.ADDRESS, 0 * pointerSize, stub("offerUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)))
        struct.set(ValueLayout.ADDRESS, 1 * pointerSize, stub("sourceActionsUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)))
        struct.set(ValueLayout.ADDRESS, 2 * pointerSize, stub("actionUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)))

        val add = DataAccess.proxyAddListener()
        val rc = add.invoke(proxy, struct, MemorySegment.NULL) as Int
        check(rc == 0) { "wl_data_offer listener installation failed with rc=$rc" }
    }
}

/** Managed facade over one `wl_data_device` bound to a seat. */
public class WaylandDataDevice internal constructor(
    internal val proxy: MemorySegment,
    private val arena: Arena,
    private val lock: Any,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val consumers = ArrayList<(WaylandDataDeviceEvent) -> Unit>()
    private var installed = false

    public fun addListener(
        onEvent: (WaylandDataDeviceEvent) -> Unit,
    ): WaylandDataListener {
        val revoked = AtomicBoolean(false)
        synchronized(lock) {
            if (!installed) {
                installed = true
                installListener()
            }
            consumers.add { event -> if (!revoked.get()) onEvent(event) }
        }
        return WaylandDataListener(revoked)
    }

    private fun deliver(event: WaylandDataDeviceEvent) {
        synchronized(lock) { ArrayList(consumers) }.forEach { it(event) }
    }

    private fun installListener() {
        val dispatcher = object : Any() {
            fun dataOfferUpcall(data: MemorySegment, p: MemorySegment, offer: MemorySegment) {
                deliver(WaylandDataDeviceEvent(WaylandDataDeviceEvent.Kind.DataOffer, 0, 0L, 0.0, 0.0, offer, offer.address()))
            }

            fun enterUpcall(data: MemorySegment, p: MemorySegment, serial: Int, surface: MemorySegment, xFixed: Int, yFixed: Int, offer: MemorySegment) {
                deliver(
                    WaylandDataDeviceEvent(
                        WaylandDataDeviceEvent.Kind.Enter, serial, surface.address(),
                        xFixed / 256.0, yFixed / 256.0, offer, offer.address(),
                    ),
                )
            }

            fun leaveUpcall(data: MemorySegment, p: MemorySegment) {
                deliver(WaylandDataDeviceEvent(WaylandDataDeviceEvent.Kind.Leave, 0, 0L, 0.0, 0.0, MemorySegment.NULL, 0L))
            }

            fun motionUpcall(data: MemorySegment, p: MemorySegment, time: Int, xFixed: Int, yFixed: Int) {
                deliver(WaylandDataDeviceEvent(WaylandDataDeviceEvent.Kind.Motion, 0, 0L, xFixed / 256.0, yFixed / 256.0, MemorySegment.NULL, 0L))
            }

            fun dropUpcall(data: MemorySegment, p: MemorySegment) {
                deliver(WaylandDataDeviceEvent(WaylandDataDeviceEvent.Kind.Drop, 0, 0L, 0.0, 0.0, MemorySegment.NULL, 0L))
            }

            fun selectionUpcall(data: MemorySegment, p: MemorySegment, offer: MemorySegment) {
                deliver(WaylandDataDeviceEvent(WaylandDataDeviceEvent.Kind.Selection, 0, 0L, 0.0, 0.0, offer, offer.address()))
            }
        }

        fun stub(method: String, descriptor: FunctionDescriptor): MemorySegment {
            val parameterTypes = descriptor.argumentLayouts().map { layout -> (layout as ValueLayout).carrier() }
            val target = MethodHandles.lookup()
                .findVirtual(dispatcher.javaClass, method, MethodType.methodType(Void.TYPE, parameterTypes))
                .bindTo(dispatcher)
            return java.lang.foreign.Linker.nativeLinker().upcallStub(target, descriptor, arena)
        }

        val pointerSize = ValueLayout.ADDRESS.byteSize()
        val struct = arena.allocate(pointerSize * 6L, ValueLayout.ADDRESS.byteAlignment())
        struct.set(ValueLayout.ADDRESS, 0 * pointerSize, stub("dataOfferUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)))
        struct.set(ValueLayout.ADDRESS, 1 * pointerSize, stub("enterUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)))
        struct.set(ValueLayout.ADDRESS, 2 * pointerSize, stub("leaveUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)))
        struct.set(ValueLayout.ADDRESS, 3 * pointerSize, stub("motionUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)))
        struct.set(ValueLayout.ADDRESS, 4 * pointerSize, stub("dropUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)))
        struct.set(ValueLayout.ADDRESS, 5 * pointerSize, stub("selectionUpcall", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)))

        val add = DataAccess.proxyAddListener()
        val rc = add.invoke(proxy, struct, MemorySegment.NULL) as Int
        check(rc == 0) { "wl_data_device listener installation failed with rc=$rc" }
    }

    /** `release` (v2); idempotent. */
    override fun close() {
        if (!closed.compareAndSet(false, true)) return
        synchronized(lock) { consumers.clear() }
        val handle = DataAccess.voidHandle() ?: return
        handle.invoke(proxy, WL_DATA_DEVICE_RELEASE, MemorySegment.NULL, 1, 0)
    }
}

/** Bridge to the generated handles. */
internal object DataAccess {
    fun proxyAddListener(): MethodHandle =
        org.graphiks.kffi.wayland.wlProxyAddListener
            ?: error("required libwayland symbol 'wl_proxy_add_listener' is unavailable")

    fun voidHandle(): java.lang.invoke.MethodHandle? =
        org.graphiks.kffi.wayland.wlProxyMarshalFlagsVoid

    fun receiveFdHandle(): java.lang.invoke.MethodHandle? =
        org.graphiks.kffi.wayland.wlProxyReceiveFd

    fun stringNullableHandle(): java.lang.invoke.MethodHandle? =
        org.graphiks.kffi.wayland.wlProxyMarshalFlagsUintString
}
