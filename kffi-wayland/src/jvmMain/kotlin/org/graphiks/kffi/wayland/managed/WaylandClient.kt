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
import org.graphiks.kffi.wayland.wlDisplayCancelRead
import org.graphiks.kffi.wayland.wlDisplayConnect
import org.graphiks.kffi.wayland.wlDisplayDisconnect
import org.graphiks.kffi.wayland.wlDisplayDispatchPending
import org.graphiks.kffi.wayland.wlDisplayFlush
import org.graphiks.kffi.wayland.wlDisplayGetFd
import org.graphiks.kffi.wayland.wlDisplayGetRegistry
import org.graphiks.kffi.wayland.wlDisplayPrepareRead
import org.graphiks.kffi.wayland.wlDisplayReadEvents
import org.graphiks.kffi.wayland.wlDisplayRoundtrip
import org.graphiks.kffi.wayland.wlRegistryAddListener
import org.graphiks.kffi.wayland.wlRegistryInterface

/**
 * Client Wayland managé : facade typée au-dessus de `libwayland-client`.
 * KFFI possède tous les segments natifs, stubs d'upcall et structs de
 * listeners ; le consommateur ne manipule aucun `MemorySegment` de protocole.
 *
 * Cycle de vie : [connect] → (registry, pompe) → [close] idempotent. La
 * fermeture révoque d'abord les listeners (quiescence : plus aucune lambda
 * consommateur n'est invoquée après le retour), annule une lecture préparée,
 * déconnecte le display, puis libère l'arène d'upcalls.
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

    private val registryProxy: MemorySegment = requireHandle(wlDisplayGetRegistry).invoke(display) as MemorySegment

    /** Point d'entrée managé du `wl_registry` de cette connexion. */
    public val registry: WaylandRegistry by lazy {
        WaylandRegistry(registryProxy, arena, registryListeners, lock)
    }

    /** Roundtrip bloquant ; `false` = erreur display constatée. */
    public fun roundtrip(): Boolean = expectOk(wlDisplayRoundtrip)

    /** Vide les événements déjà reçus ; `false` = erreur display constatée. */
    public fun dispatchPending(): Boolean = expectOk(wlDisplayDispatchPending)

    /**
     * `wl_display_prepare_read` : 0 = lecture préparée, -1 = file non vide
     * (appeler [dispatchPending]) ou erreur display ([hasError]).
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

    /** Termine une lecture préparée ; `false` = erreur display constatée. */
    public fun readEvents(): Boolean {
        val ok = expectOk(wlDisplayReadEvents)
        prepared.set(false)
        return ok
    }

    /** Annule une lecture préparée (chemin d'arrêt, réveil applicatif) ; idempotent. */
    public fun cancelRead() {
        if (prepared.compareAndSet(true, false)) {
            wlDisplayCancelRead?.let { handle -> handle.invoke(display) }
        }
    }

    /**
     * `wl_display_flush` : rc brut libwayland (0 = file vide, 1 = envoyé,
     * -1 = erreur ou EAGAIN — l'appelant surveille alors l'écriture ; un
     * flush en échec ne pose pas [hasError], la perte de connexion est
     * constatée par la primitive suivante).
     */
    public fun flush(): Int {
        if (closed.get()) {
            return -1
        }
        val handle = wlDisplayFlush ?: return -1
        return handle.invoke(display) as Int
    }

    /** Une primitive de lecture/dispatch/roundtrip a renvoyé une erreur display. */
    public fun hasError(): Boolean = errorSeen.get()

    /** Fermeture idempotente : quiescence des listeners, puis déconnexion, puis arène. */
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
         * Connecte par nom de socket (`null` = défaut libwayland ; un chemin
         * absolu est accepté). Renvoie `null` si la librairie est indisponible
         * ou si le compositor refuse la connexion.
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
 * Listener managé du `wl_registry` : owner révocable. Après un retour `true`
 * de [revoke], plus aucune nouvelle invocation des lambdas consommateur n'a
 * lieu ; les payloads (chaîne d'interface) sont copiés avant le retour de
 * l'upcall ; les exceptions Kotlin des lambdas sont isolées et routées vers
 * le reporter fourni à l'installation, jamais déroulées à travers l'upcall.
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

/** Facade managée du `wl_registry` d'un [WaylandClient]. */
public class WaylandRegistry internal constructor(
    private val registryProxy: MemorySegment,
    private val arena: Arena,
    private val listeners: MutableList<WaylandRegistryListener>,
    private val lock: Any,
) {

    /**
     * Installe un listener globals révocable. L'arène et les stubs appartiennent
     * au client : ils vivent jusqu'à [WaylandClient.close].
     */
    public fun addGlobalsListener(
        onGlobal: (name: Int, interfaceName: String, version: Int) -> Unit,
        onGlobalRemove: (name: Int) -> Unit = {},
        onFailure: (Throwable) -> Unit = {},
    ): WaylandRegistryListener {
        val revoked = AtomicBoolean(false)
        val listener = WaylandRegistryListener(revoked)
        val globalStub = upcallStub(
            "globalUpcall",
            FunctionDescriptor.ofVoid(
                ValueLayout.ADDRESS, ValueLayout.ADDRESS,
                ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT,
            ),
            GlobalSink(onGlobal, onFailure, revoked),
        )
        val removeStub = upcallStub(
            "globalRemoveUpcall",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            RemoveSink(onGlobalRemove, onFailure, revoked),
        )
        val pointerSize = ValueLayout.ADDRESS.byteSize()
        val listenerStruct = arena.allocate(pointerSize * 2L, ValueLayout.ADDRESS.byteAlignment())
        listenerStruct.set(ValueLayout.ADDRESS, 0, globalStub)
        listenerStruct.set(ValueLayout.ADDRESS, pointerSize.toLong(), removeStub)
        val addHandle = requireHandle(org.graphiks.kffi.wayland.wlRegistryAddListener)
        val registryInterface = requireNotNull(org.graphiks.kffi.wayland.wlRegistryInterface) {
            "required libwayland symbol 'wl_registry_interface' is unavailable"
        }
        val rc = addHandle.invoke(registryProxy, listenerStruct, MemorySegment.NULL) as Int
        check(rc == 0) { "wl_registry_add_listener failed with rc=$rc" }
        synchronized(lock) { listeners.add(listener) }
        return listener
    }

    private fun upcallStub(
        method: String,
        descriptor: FunctionDescriptor,
        sink: Any,
    ): MemorySegment {
        val parameterTypes = descriptor.argumentLayouts().map { layout -> (layout as ValueLayout).carrier() }
        val target = MethodHandles.lookup()
            .findVirtual(sink.javaClass, method, MethodType.methodType(Void.TYPE, parameterTypes))
            .bindTo(sink)
        return Linker.nativeLinker().upcallStub(target, descriptor, arena)
    }

    private fun requireHandle(handle: MethodHandle?): MethodHandle =
        requireNotNull(handle) { "required libwayland symbol is unavailable" }

    internal class GlobalSink(
        private val onGlobal: (name: Int, interfaceName: String, version: Int) -> Unit,
        private val onFailure: (Throwable) -> Unit,
        private val revoked: AtomicBoolean,
    ) {
        @Suppress("UNUSED_PARAMETER")
        fun globalUpcall(
            data: MemorySegment,
            registry: MemorySegment,
            name: Int,
            interfaceName: MemorySegment,
            version: Int,
        ) {
            if (revoked.get()) {
                return
            }
            try {
                // copie immédiate : la chaîne C n'est valide que pendant l'upcall
                onGlobal(name, interfaceName.reinterpret(512).getString(0), version)
            } catch (throwable: Throwable) {
                runCatching { onFailure(throwable) }
            }
        }
    }

    internal class RemoveSink(
        private val onGlobalRemove: (name: Int) -> Unit,
        private val onFailure: (Throwable) -> Unit,
        private val revoked: AtomicBoolean,
    ) {
        @Suppress("UNUSED_PARAMETER")
        fun globalRemoveUpcall(data: MemorySegment, registry: MemorySegment, name: Int) {
            if (revoked.get()) {
                return
            }
            try {
                onGlobalRemove(name)
            } catch (throwable: Throwable) {
                runCatching { onFailure(throwable) }
            }
        }
    }
}
