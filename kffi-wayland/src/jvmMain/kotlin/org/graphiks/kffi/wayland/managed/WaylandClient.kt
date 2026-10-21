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
import org.graphiks.kffi.posix.LinuxErrno
import org.graphiks.kffi.posix.PollFd
import org.graphiks.kffi.wayland.invokeNativePoll
import org.graphiks.kffi.wayland.wlKeyboardInterface
import org.graphiks.kffi.wayland.wlOutputInterface
import org.graphiks.kffi.wayland.wlPointerInterface
import org.graphiks.kffi.wayland.wlProxyMarshalArrayFlags
import org.graphiks.kffi.wayland.wlDataDeviceInterface
import org.graphiks.kffi.wayland.wlDataDeviceManagerInterface
import org.graphiks.kffi.wayland.zwpTextInputManagerInterfaceV1
import org.graphiks.kffi.wayland.zwpTextInputInterfaceV1
import org.graphiks.kffi.wayland.wlSeatInterface
import org.graphiks.kffi.wayland.wlDisplayCancelRead
import org.graphiks.kffi.wayland.wlDisplayConnect
import org.graphiks.kffi.wayland.wlDisplayDisconnect
import org.graphiks.kffi.wayland.wlDisplayDispatchPending
import org.graphiks.kffi.wayland.wlDisplayFlush
import org.graphiks.kffi.wayland.wlDisplayGetFd
import org.graphiks.kffi.wayland.wlDisplayPrepareRead
import org.graphiks.kffi.wayland.wlDisplayReadEvents
import org.graphiks.kffi.wayland.wlDisplayRoundtrip
import org.graphiks.kffi.wayland.wlProxyAddListener
import org.graphiks.kffi.wayland.wlProxyGetVersion
import org.graphiks.kffi.wayland.wlProxyMarshalBind
import org.graphiks.kffi.wayland.wlProxyMarshalNewId
import org.graphiks.kffi.wayland.wlRegistryInterface
import org.graphiks.kffi.wayland.WL_REGISTRY_BIND
import org.graphiks.kffi.wayland.wlCompositorInterface
import org.graphiks.kffi.wayland.generated.xdg_wm_base_interface
import org.graphiks.kffi.wayland.wlShmInterface

/** Outcome of a display+wake poll issued by [WaylandClient.pollForEvents]. */
public enum class WaylandPollOutcome { DisplayReady, WakeOnly, Interrupted, Failed }

/**
 * Managed Wayland client: a typed facade over `libwayland-client`. KFFI owns
 * every native segment, upcall stub and listener struct; the consumer never
 * touches a protocol `MemorySegment`.
 *
 * Lifecycle: [connect] → (registry, pump) → idempotent [close]. Closing first
 * revokes the listeners (quiescence: no consumer lambda is invoked after the
 * call returns), cancels a prepared read, disconnects the display, then frees
 * the upcall arena.
 */
public class WaylandClient private constructor(
    private val display: MemorySegment,
    private val arena: Arena,
    public val fileDescriptor: Int,
) : AutoCloseable {

    private val closed = AtomicBoolean(false)
    private val errorSeen = AtomicBoolean(false)
    private val prepared = AtomicBoolean(false)
    private val registryListeners = ArrayList<WaylandRegistryListener>()
    private val lock = Any()
    private val advertisedGlobals = HashMap<String, Pair<Int, Int>>() // interface -> (numeric name, version)

    // `wl_display_get_registry` is a static inline header helper: no such
    // symbol exists in libwayland-client — the request goes through the
    // generic marshal (opcode 1, wl_registry interface), like everywhere else.
    private val registryProxy: MemorySegment = createRegistryProxy(display)

    /**
     * Binds one advertised global through `wl_registry.bind` and returns the
     * resulting proxy with its negotiated version (`min(advertised,
     * [maxVersion])`). Returns `null` when the global is not advertised or
     * the roundtrip cannot refresh the registry.
     */
    /**
     * Binds the zwp_text_input_manager_v3 global and creates one
     * `zwp_text_input_v3` for [seat] through the fixed-arity array marshal
     * (wire order: new_id slot then the seat object).
     */
    public fun createTextInput(seat: WaylandSeat): WaylandTextInput? {
        registry
        if (!roundtrip()) return null
        val (name, advertised) = synchronized(advertisedGlobals) {
            advertisedGlobals["zwp_text_input_manager_v3"] ?: return null
        }
        val manager = bindWithInterface(
            name,
            zwpTextInputManagerInterfaceV1,
            minOf(advertised, 1),
            "zwp_text_input_manager_v3",
        ) ?: return null
        // get_text_input: new_id + seat — through the array marshal
        val marshal = requireHandle(wlProxyMarshalArrayFlags)
        val interfacePointer = zwpTextInputInterfaceV1
        Arena.ofConfined().use { arena ->
            val args = arena.allocate(ValueLayout.ADDRESS, 2)
            args.set(ValueLayout.ADDRESS, 0, MemorySegment.NULL)
            args.set(ValueLayout.ADDRESS, 8, seat.rawProxy)
            val proxy = marshal.invoke(manager, 1, interfacePointer, 1, 0, args) as MemorySegment
            return WaylandTextInput(proxy, managedArena, managedLock)
        }
    }

    /**
     * Creates the `wl_data_device` for [seat] through the fixed-arity
     * array marshal (wire order: new_id then the seat object).
     */
    public fun createDataDevice(seat: WaylandSeat): WaylandDataDevice? {
        registry
        if (!roundtrip()) return null
        val (name, advertised) = synchronized(advertisedGlobals) {
            advertisedGlobals["wl_data_device_manager"] ?: return null
        }
        val manager = bindWithInterface(
            name,
            wlDataDeviceManagerInterface ?: return null,
            minOf(advertised, 3),
            "wl_data_device_manager",
        ) ?: return null
        val marshal = requireHandle(wlProxyMarshalArrayFlags)
        val interfacePointer = wlDataDeviceInterface ?: return null
        Arena.ofConfined().use { arena ->
            val args = arena.allocate(ValueLayout.ADDRESS, 2)
            args.set(ValueLayout.ADDRESS, 0, MemorySegment.NULL)
            args.set(ValueLayout.ADDRESS, 8, seat.rawProxy)
            val proxy = marshal.invoke(manager, 1, interfacePointer, 1, 0, args) as MemorySegment
            return WaylandDataDevice(proxy, managedArena, managedLock)
        }
    }

    /**
     * Binds the zwlr_virtual_pointer_manager_v1 global (authored interface:
     * the wlr protocol is not exported by libwayland-client). Returns the
     * raw manager proxy for the injection harness.
     */
    public fun bindVirtualPointerManager(): MemorySegment? {
        registry
        if (!roundtrip()) return null
        val (name, advertised) = synchronized(advertisedGlobals) {
            advertisedGlobals["zwlr_virtual_pointer_manager_v1"] ?: return null
        }
        return bindWithInterface(
            name,
            org.graphiks.kffi.wayland.virtualPointerManagerInterfaceV1,
            minOf(advertised, 2),
            "zwlr_virtual_pointer_manager_v1",
        )
    }

    /**
     * Creates the virtual pointer attached to [seat] through [managerProxy];
     * attaching it grants the seat the pointer capability and the injected
     * events flow to every regular pointer listener.
     */
    public fun createVirtualPointer(managerProxy: MemorySegment, seat: WaylandSeat): MemorySegment? =
        org.graphiks.kffi.wayland.createVirtualPointer(managerProxy, seat.rawProxy)

    /** Injects one absolute pointer motion (centre of a 640x480 layout). */
    public fun injectPointerMotion(virtualPointer: MemorySegment, x: Double, y: Double) {
        org.graphiks.kffi.wayland.virtualPointerMotionAbsolute(virtualPointer, 0, x, y, 640.0, 480.0)
    }

    /** Injects one button event (BTN_LEFT=0x110). */
    public fun injectPointerButton(virtualPointer: MemorySegment, button: Int, state: Int) {
        org.graphiks.kffi.wayland.virtualPointerButton(virtualPointer, 0, button, state)
    }

    /** Terminates the injected pointer batch. */
    public fun injectPointerFrame(virtualPointer: MemorySegment) {
        org.graphiks.kffi.wayland.virtualPointerFrame(virtualPointer)
    }

    /** Injects one value120 scroll unit (0 = vertical axis). */
    public fun injectPointerAxisValue120(virtualPointer: MemorySegment, axis: Int, value120: Int) {
        org.graphiks.kffi.wayland.virtualPointerAxisValue120(virtualPointer, 0, axis, value120)
    }

    /**
     * Binds one advertised `wl_seat` global and wraps it in the managed
     * [WaylandSeat] facade; pointer/keyboard sub-objects are created lazily
     * when their listener is requested (the get_pointer/get_keyboard
     * requests go through the fixed-arity array marshal).
     */
    public fun bindSeat(name: Int, maxVersion: Int = 9): WaylandSeat? {
        // clamp to the advertised version: binding above it is a protocol error
        registry
        if (!roundtrip()) {
            throw WaylandWindowingException("wl_display roundtrip failed while resolving 'wl_seat'")
        }
        val advertised = synchronized(advertisedGlobals) { advertisedGlobals["wl_seat"]?.second } ?: return null
        val proxy = bindByGlobalName(name, "wl_seat", minOf(advertised, maxVersion)) ?: return null
        return WaylandSeat(proxy.proxy, managedArena, managedLock, ::requestSubObject)
    }

    /**
     * Issues one new_id request (get_pointer/get_keyboard) through the
     * fixed-arity array marshal: the array carries only the new_id slot,
     * which libwayland fills from the interface.
     */
    private fun requestSubObject(proxy: MemorySegment, opcode: Int, interfaceName: String): MemorySegment {
        val marshalArray = requireHandle(wlProxyMarshalArrayFlags)
        val interfacePointer = requireNotNull(interfacePointer(interfaceName)) {
            "required libwayland interface '$interfaceName' is unavailable"
        }
        Arena.ofConfined().use { arena ->
            val args = arena.allocate(ValueLayout.ADDRESS, 1)
            return marshalArray.invoke(
                proxy, opcode, interfacePointer, 1, 0, args,
            ) as MemorySegment
        }
    }

    /**
     * Binds one advertised `wl_output` global and wraps it in the managed
     * [WaylandOutput] facade (native listener installed lazily at the first
     * consumer). The global [name] comes from the registry globals listener.
     */
    public fun bindOutput(name: Int, maxVersion: Int = 4): WaylandOutput? {
        val proxy = bindByGlobalName(name, "wl_output", maxVersion) ?: return null
        return WaylandOutput(proxy.proxy, managedArena, managedLock)
    }

    internal fun bindGlobal(interfaceName: String, maxVersion: Int): ManagedProxy? {
        // force the internal globals-tracking listener to install before any
        // event dispatch
        registry
        if (!roundtrip()) {
            throw WaylandWindowingException("wl_display roundtrip failed while resolving '$interfaceName'")
        }
        val (name, advertised) = synchronized(advertisedGlobals) { advertisedGlobals[interfaceName] }
            ?: return null
        return bindByGlobalName(name, interfaceName, minOf(advertised, maxVersion))
    }

    private fun bindWithInterface(
        name: Int,
        interfacePointer: MemorySegment,
        version: Int,
        interfaceName: String,
    ): MemorySegment? {
        val bind = requireHandle(wlProxyMarshalBind)
        Arena.ofConfined().use { temp ->
            val namePointer = temp.allocateFrom(interfaceName)
            val proxy = bind.invoke(
                registryProxy,
                WL_REGISTRY_BIND,
                interfacePointer,
                version,
                0,
                name,
                namePointer,
                version,
                MemorySegment.NULL,
            ) as MemorySegment
            return proxy.takeIf { it != MemorySegment.NULL }
        }
    }

    private fun bindByGlobalName(name: Int, interfaceName: String, version: Int): ManagedProxy? {
        val bind = requireHandle(wlProxyMarshalBind)
        val interfacePointer = requireNotNull(interfacePointer(interfaceName)) {
            "required libwayland interface '$interfaceName' is unavailable"
        }
        // the interface name string is consumed synchronously by the marshal:
        // a confined temp arena is enough
        Arena.ofConfined().use { temp ->
            val namePointer = temp.allocateFrom(interfaceName)
            val proxy = bind.invoke(
                registryProxy,
                WL_REGISTRY_BIND,
                interfacePointer,
                version,
                0,
                name,
                namePointer,
                version,
                MemorySegment.NULL,
            ) as MemorySegment
            if (proxy == MemorySegment.NULL) {
                return null
            }
            return ManagedProxy(proxy, version)
        }
    }

    private fun interfacePointer(name: String): MemorySegment? = when (name) {
        "wl_compositor" -> wlCompositorInterface
        "xdg_wm_base" -> xdg_wm_base_interface
        "wl_shm" -> wlShmInterface
        "wl_output" -> wlOutputInterface
        "wl_seat" -> wlSeatInterface
        "wl_pointer" -> wlPointerInterface
        "wl_keyboard" -> wlKeyboardInterface
        else -> null
    }

    private fun createRegistryProxy(display: MemorySegment): MemorySegment {
        val marshalNewId = requireHandle(wlProxyMarshalNewId)
        val registryInterface = requireNotNull(wlRegistryInterface) {
            "required libwayland symbol 'wl_registry_interface' is unavailable"
        }
        val version = requireHandle(wlProxyGetVersion).invoke(display) as Int
        return marshalNewId.invoke(display, 1, registryInterface, version, 0, MemorySegment.NULL) as MemorySegment
    }

    /**
     * Address of the native `wl_display` pointer, for consumers that must hand
     * the display to external renderers (EGL/Vulkan platforms) alongside a
     * surface address. Valid until [close].
     */
    public val displayProxyAddress: Long
        get() = display.address()

    /** Managed entry point to this connection's `wl_registry`. */
    public val registry: WaylandRegistry by lazy {
        val managed = WaylandRegistry(registryProxy, arena, registryListeners, lock)
        managed.addGlobalsListener(
            onGlobal = { name, interfaceName, version ->
                synchronized(advertisedGlobals) {
                    advertisedGlobals[interfaceName] = name to version
                }
            },
        )
        managed
    }

    /** Blocking roundtrip; `false` = a display error was observed. */
    public fun roundtrip(): Boolean = expectOk(wlDisplayRoundtrip)

    /** Dispatches already-received events; `false` = a display error was observed. */
    public fun dispatchPending(): Boolean = expectOk(wlDisplayDispatchPending)

    /**
     * `wl_display_prepare_read`: 0 = read prepared, -1 = queue not empty
     * (call [dispatchPending]) or a display error ([hasError]).
     */
    public fun prepareRead(): Int {
        if (closed.get()) {
            return -1
        }
        val handle = wlDisplayPrepareRead ?: return errorInt()
        val rc = handle.invoke(display) as Int
        if (rc == 0) {
            prepared.set(true)
        }
        return rc
    }

    /** Completes a prepared read; `false` = a display error was observed. */
    public fun readEvents(): Boolean {
        val ok = expectOk(wlDisplayReadEvents)
        prepared.set(false)
        return ok
    }

    /** Cancels a prepared read (stop path, application wake); idempotent. */
    public fun cancelRead() {
        if (prepared.compareAndSet(true, false)) {
            wlDisplayCancelRead?.let { handle -> handle.invoke(display) }
        }
    }

    /**
     * `wl_display_flush`: raw libwayland return code (0 = queue empty, 1 =
     * sent, -1 = error or EAGAIN — the caller then watches writability; a
     * failed flush does not raise [hasError], connection loss is observed by
     * the next primitive).
     */
    public fun flush(): Int {
        if (closed.get()) {
            return -1
        }
        val handle = wlDisplayFlush ?: return -1
        return handle.invoke(display) as Int
    }

    /** A read/dispatch/roundtrip primitive returned a display error. */
    public fun hasError(): Boolean = errorSeen.get()

    internal val managedArena: Arena get() = arena
    internal val managedLock: Any get() = lock
    internal fun managedClosed(): Boolean = closed.get()

    /** Creates a managed `wl_surface` bound to this connection's compositor. */
    public fun createSurface(): WaylandSurface = WindowingFactory.createSurface(this)

    /** Creates a managed `xdg_surface` role for [surface] through `xdg_wm_base`. */
    public fun createXdgSurface(surface: WaylandSurface): WaylandXdgSurface =
        WindowingFactory.createXdgSurface(this, surface)

    /** Creates a managed `xdg_toplevel` for [xdgSurface]. */
    public fun createToplevel(xdgSurface: WaylandXdgSurface): WaylandToplevel =
        WindowingFactory.createToplevel(this, xdgSurface)

    /** Creates a managed shm-backed ARGB8888 buffer of [width] × [height]. */
    public fun createShmBuffer(width: Int, height: Int): WaylandShmBuffer =
        ShmFactory.createShmBuffer(this, width, height)

    /**
     * Blocking poll over the display fd (plus `POLLOUT` when [watchWrite]) and
     * the consumer-provided wake fd (e.g. `PosixWakeup` from `kffi-posix`). KFFI
     * builds the `struct pollfd` array; the timeout is infinite; `EINTR` comes
     * back as [WaylandPollOutcome.Interrupted] without consuming the prepared
     * read.
     */
    public fun pollForEvents(wakeFd: Int, watchWrite: Boolean): WaylandPollOutcome {
        if (closed.get() || wakeFd < 0) {
            return WaylandPollOutcome.Failed
        }
        val arena = Arena.ofConfined()
        try {
            val descriptors = PollFd.allocate(arena, 2)
            val displayEvents: Short =
                if (watchWrite) (PollFd.POLLIN + PollFd.POLLWRNORM).toShort() else PollFd.POLLIN
            PollFd.set(descriptors, 0, fileDescriptor, displayEvents)
            PollFd.set(descriptors, 1, wakeFd, PollFd.POLLIN)
            val result = invokeNativePoll(descriptors, 2, -1)
            if (result.value < 0) {
                return if (result.errno == LinuxErrno.EINTR) {
                    WaylandPollOutcome.Interrupted
                } else {
                    WaylandPollOutcome.Failed
                }
            }
            // A hung-up or erroneous display is terminal: treating HUP as a
            // plain readable event leaves a session spinning forever against
            // a dead peer (EOF is not surfaced by wl_display_read_events).
            val displayRevents = PollFd.revents(descriptors, 0)
            val terminalEvents = PollFd.POLLERR.toInt() or
                PollFd.POLLHUP.toInt() or
                PollFd.POLLNVAL.toInt()
            if (displayRevents.toInt() and terminalEvents != 0) {
                return WaylandPollOutcome.Failed
            }
            val displayReady = displayRevents != 0.toShort()
            val wakeReady = PollFd.revents(descriptors, 1) != 0.toShort()
            return when {
                wakeReady -> WaylandPollOutcome.WakeOnly
                displayReady -> WaylandPollOutcome.DisplayReady
                else -> WaylandPollOutcome.Interrupted
            }
        } catch (_: Throwable) {
            return WaylandPollOutcome.Failed
        } finally {
            arena.close()
        }
    }

    /** Idempotent close: listener quiescence, then disconnect, then arena. */
    override fun close() {
        if (!closed.compareAndSet(false, true)) {
            return
        }
        synchronized(lock) {
            registryListeners.forEach(WaylandRegistryListener::revoke)
        }
        cancelRead()
        runCatching { wlDisplayDisconnect?.invoke(display) }
        arena.close()
    }

    public companion object {
        /**
         * Connects by socket name (`null` = libwayland default; an absolute
         * path is accepted). Returns `null` when the library is unavailable
         * or the compositor refuses the connection.
         */
        public fun connect(socketName: String? = null): WaylandClient? {
            val arena = Arena.ofShared()
            try {
                val connectHandle = wlDisplayConnect ?: return disposed(arena)
                val namePointer = socketName?.let { arena.allocateFrom(it) } ?: MemorySegment.NULL
                val display = connectHandle.invoke(namePointer) as MemorySegment
                if (display == MemorySegment.NULL) {
                    return disposed(arena)
                }
                val fd = (wlDisplayGetFd ?: return disposed(arena)).invoke(display) as Int
                return WaylandClient(display, arena, fd)
            } catch (_: Throwable) {
                return disposed(arena)
            }
        }

        private fun disposed(arena: Arena): WaylandClient? {
            arena.close()
            return null
        }
    }

    private fun expectOk(handle: MethodHandle?): Boolean {
        val resolved = handle ?: return error()
        return try {
            val rc = resolved.invoke(display) as Int
            if (rc < 0) error() else true
        } catch (_: Throwable) {
            error()
        }
    }

    private fun error(): Boolean {
        errorSeen.set(true)
        return false
    }

    private fun errorInt(): Int {
        errorSeen.set(true)
        return -1
    }

    private fun requireHandle(handle: MethodHandle?): MethodHandle =
        requireNotNull(handle) { "required libwayland symbol is unavailable" }
}

/**
 * Managed `wl_registry` listener: a revocable owner. Once [revoke] returns
 * `true`, no consumer lambda is invoked again; payloads (the interface string)
 * are copied before the upcall returns; Kotlin exceptions thrown by the
 * lambdas are isolated and routed to the reporter supplied at installation,
 * never unwound across the native upcall.
 */
public class WaylandRegistryListener internal constructor(
    private val revoked: AtomicBoolean,
) : AutoCloseable {

    public fun revoke(): Boolean = revoked.compareAndSet(false, true)

    public fun isActive(): Boolean = !revoked.get()

    override fun close() {
        revoke()
    }
}

/** Managed facade over a [WaylandClient]'s `wl_registry`. */
public class WaylandRegistry internal constructor(
    private val registryProxy: MemorySegment,
    private val arena: Arena,
    private val listeners: MutableList<WaylandRegistryListener>,
    private val lock: Any,
) {

    private val nativeInstalled = AtomicBoolean(false)
    private val consumers = ArrayList<GlobalConsumer>()

    /**
     * Installs a revocable globals listener. `wl_proxy_add_listener` replaces
     * (and fails on re-add for some compositors), so exactly one native
     * listener is installed per registry and fanned out to every consumer.
     * The arena and stubs belong to the client and live until
     * [WaylandClient.close].
     */
    public fun addGlobalsListener(
        onGlobal: (name: Int, interfaceName: String, version: Int) -> Unit,
        onGlobalRemove: (name: Int) -> Unit = {},
        onFailure: (Throwable) -> Unit = {},
    ): WaylandRegistryListener {
        val revoked = AtomicBoolean(false)
        val listener = WaylandRegistryListener(revoked)
        synchronized(lock) {
            if (nativeInstalled.compareAndSet(false, true)) {
                installNativeDispatcher()
            }
            consumers.add(GlobalConsumer(onGlobal, onGlobalRemove, onFailure, revoked))
            listeners.add(listener)
        }
        return listener
    }

    private fun installNativeDispatcher() {
        val dispatcher = object : Any() {
            fun globalUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") registry: MemorySegment,
                name: Int,
                interfaceName: MemorySegment,
                version: Int,
            ) {
                // copy immediately: the C string is only valid inside the upcall
                val copied = interfaceName.reinterpret(512).getString(0)
                snapshotConsumers().forEach { it.deliverGlobal(name, copied, version) }
            }

            fun globalRemoveUpcall(
                @Suppress("UNUSED_PARAMETER") data: MemorySegment,
                @Suppress("UNUSED_PARAMETER") registry: MemorySegment,
                name: Int,
            ) {
                snapshotConsumers().forEach { it.deliverRemove(name) }
            }
        }
        val globalStub = upcallStub(
            dispatcher,
            "globalUpcall",
            FunctionDescriptor.ofVoid(
                ValueLayout.ADDRESS, ValueLayout.ADDRESS,
                ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT,
            ),
        )
        val removeStub = upcallStub(
            dispatcher,
            "globalRemoveUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        )
        val pointerSize = ValueLayout.ADDRESS.byteSize()
        val listenerStruct = arena.allocate(pointerSize * 2L, ValueLayout.ADDRESS.byteAlignment())
        listenerStruct.set(ValueLayout.ADDRESS, 0, globalStub)
        listenerStruct.set(ValueLayout.ADDRESS, pointerSize.toLong(), removeStub)
        // `wl_registry_add_listener` is a static inline helper: go through the
        // real `wl_proxy_add_listener` symbol.
        val addHandle = requireHandle(wlProxyAddListener)
        val rc = addHandle.invoke(registryProxy, listenerStruct, MemorySegment.NULL) as Int
        check(rc == 0) { "wl_registry_add_listener failed with rc=$rc" }
    }

    private fun snapshotConsumers(): List<GlobalConsumer> = synchronized(lock) {
        consumers.filter { !it.revoked.get() }
    }

    private fun upcallStub(
        sink: Any,
        method: String,
        descriptor: FunctionDescriptor,
    ): MemorySegment {
        val parameterTypes = descriptor.argumentLayouts().map { layout -> (layout as ValueLayout).carrier() }
        val target = MethodHandles.lookup()
            .findVirtual(sink.javaClass, method, MethodType.methodType(Void.TYPE, parameterTypes))
            .bindTo(sink)
        return Linker.nativeLinker().upcallStub(target, descriptor, arena)
    }

    private fun requireHandle(handle: MethodHandle?): MethodHandle =
        requireNotNull(handle) { "required libwayland symbol is unavailable" }

    internal class GlobalConsumer(
        private val onGlobal: (name: Int, interfaceName: String, version: Int) -> Unit,
        private val onGlobalRemove: (name: Int) -> Unit,
        private val onFailure: (Throwable) -> Unit,
        internal val revoked: AtomicBoolean,
    ) {
        fun deliverGlobal(name: Int, interfaceName: String, version: Int) {
            try {
                onGlobal(name, interfaceName, version)
            } catch (throwable: Throwable) {
                runCatching { onFailure(throwable) }
            }
        }

        fun deliverRemove(name: Int) {
            try {
                onGlobalRemove(name)
            } catch (throwable: Throwable) {
                runCatching { onFailure(throwable) }
            }
        }
    }
}
