@file:OptIn(
    CallbackRuntimeApi::class,
    kotlin.concurrent.atomics.ExperimentalAtomicApi::class,
)

package org.graphiks.kffi

import kotlin.concurrent.atomics.AtomicInt
import kotlin.concurrent.atomics.AtomicLong
import kotlin.concurrent.atomics.AtomicReference
import kotlin.concurrent.atomics.atomicArrayOfNulls

internal enum class DeliveryState {
    PREPARED,
    ACTIVE,
    CLAIMING,
    CLAIMED,
    CLOSED,
    ABORTED,
}

internal class DeliveryStateMachine(
    private val policy: CallbackPolicy,
    initialState: DeliveryState = DeliveryState.ACTIVE,
    private val beforeTryEnterCompareAndSet: (() -> Unit)? = null,
) {
    private val packed = AtomicLong(pack(initialState, 0))

    val state: DeliveryState
        get() = unpackState(packed.load())

    val inFlight: Int
        get() = unpackInFlight(packed.load())

    val isClosed: Boolean
        get() {
            val s = unpackState(packed.load())
            return s != DeliveryState.PREPARED && s != DeliveryState.ACTIVE
        }

    val isQuiescent: Boolean
        get() {
            val raw = packed.load()
            val s = unpackState(raw)
            return s != DeliveryState.PREPARED && s != DeliveryState.ACTIVE &&
                unpackInFlight(raw) == 0
        }

    fun activate(): Boolean = transitionState(DeliveryState.PREPARED, DeliveryState.ACTIVE)

    fun abort(): Boolean = transitionState(DeliveryState.PREPARED, DeliveryState.ABORTED)

    fun close(): Boolean = transitionState(DeliveryState.ACTIVE, DeliveryState.CLOSED)

    fun tryEnter(): Boolean = when (policy) {
        CallbackPolicy.ONCE -> tryEnterOnce()
        CallbackPolicy.REPEATING -> tryEnterRepeating()
    }

    private fun tryEnterOnce(): Boolean {
        val current = packed.load()
        if (unpackState(current) != DeliveryState.ACTIVE) return false
        beforeTryEnterCompareAndSet?.invoke()
        val claiming = pack(DeliveryState.CLAIMING, 1)
        if (!packed.compareAndSet(current, claiming)) return false
        check(
            packed.compareAndSet(
                claiming,
                pack(DeliveryState.CLAIMED, 1),
            ),
        ) { "ONCE callback claim was unexpectedly modified" }
        return true
    }

    private fun tryEnterRepeating(): Boolean {
        while (true) {
            val current = packed.load()
            if (unpackState(current) != DeliveryState.ACTIVE) return false
            beforeTryEnterCompareAndSet?.invoke()
            if (
                packed.compareAndSet(
                    current,
                    pack(DeliveryState.ACTIVE, unpackInFlight(current) + 1),
                )
            ) {
                return true
            }
        }
    }

    fun leave() {
        while (true) {
            val current = packed.load()
            val currentInFlight = unpackInFlight(current)
            check(currentInFlight > 0) { "Callback delivery left without entering" }
            if (
                packed.compareAndSet(
                    current,
                    pack(unpackState(current), currentInFlight - 1),
                )
            ) {
                return
            }
        }
    }

    private fun transitionState(expected: DeliveryState, updated: DeliveryState): Boolean {
        while (true) {
            val current = packed.load()
            if (unpackState(current) != expected) return false
            if (
                packed.compareAndSet(
                    current,
                    pack(updated, unpackInFlight(current)),
                )
            ) {
                return true
            }
        }
    }

    // bits 0-3 = state, bits 4+ = inFlight
    private companion object {
        private const val STATE_BITS = 4
        private const val IN_FLIGHT_SHIFT = STATE_BITS
        private const val STATE_MASK = (1L shl STATE_BITS) - 1

        init {
            require(DeliveryState.entries.size <= (1 shl STATE_BITS)) {
                "DeliveryState has ${DeliveryState.entries.size} values; " +
                    "packed encoding supports ${1 shl STATE_BITS}"
            }
        }

        private fun pack(state: DeliveryState, inFlight: Int): Long =
            (state.ordinal.toLong() and STATE_MASK) or (inFlight.toLong() shl IN_FLIGHT_SHIFT)

        private fun unpackState(packed: Long): DeliveryState =
            DeliveryState.entries[(packed and STATE_MASK).toInt()]

        private fun unpackInFlight(packed: Long): Int =
            (packed shr IN_FLIGHT_SHIFT).toInt()
    }
}

internal enum class NoUserdataPhase {
    UNUSED,
    ACTIVE,
    RETIRED,
}

private class NoUserdataSnapshot<T : Any>(
    val phase: NoUserdataPhase,
    val value: T?,
)

internal class NoUserdataSlotStateMachine<T : Any> {
    private val snapshot = AtomicReference(
        NoUserdataSnapshot<T>(NoUserdataPhase.UNUSED, null),
    )

    val phase: NoUserdataPhase
        get() = snapshot.load().phase

    val activeValue: T?
        get() = snapshot.load().takeIf { it.phase == NoUserdataPhase.ACTIVE }?.value

    fun activate(value: T): Boolean = transitionToActive(NoUserdataPhase.UNUSED, value)

    fun rearm(value: T): Boolean = transitionToActive(NoUserdataPhase.RETIRED, value)

    private fun transitionToActive(expectedPhase: NoUserdataPhase, value: T): Boolean {
        val current = snapshot.load()
        if (current.phase != expectedPhase) return false
        return snapshot.compareAndSet(
            current,
            NoUserdataSnapshot(NoUserdataPhase.ACTIVE, value),
        )
    }

    fun retire(value: T): Boolean {
        val current = snapshot.load()
        if (current.phase != NoUserdataPhase.ACTIVE || current.value !== value) return false
        return snapshot.compareAndSet(
            current,
            NoUserdataSnapshot(NoUserdataPhase.RETIRED, null),
        )
    }
}

/** Canonical generated descriptor for one callback typedef. */
@CallbackRuntimeApi
class CallbackType<C : Callback>(
    val canonicalId: String,
    val hasRoutingUserdata: Boolean,
) {
    init {
        require(canonicalId.isNotBlank()) { "Callback canonical ID must not be blank" }
    }

    internal val noUserdataSlot = NoUserdataSlotStateMachine<RegistryEntry<C>>()
}

internal class RegistryEntry<C : Callback>(
    val type: CallbackType<C>,
    val callback: C,
    val policy: CallbackPolicy,
    val onError: CallbackExceptionHandler,
    val token: ULong?,
    initialState: DeliveryState,
) {
    val lifecycle = DeliveryStateMachine(policy, initialState)
    private val quiescenceActions = QuiescenceActionRegistry()
    private val routeRevoked = AtomicInt(0)

    val isRouteRevoked: Boolean
        get() = routeRevoked.load() != 0

    val isQuiescent: Boolean
        get() = quiescenceActions.isSignaled

    fun markRouteRevoked() {
        routeRevoked.store(1)
    }

    fun registerQuiescenceAction(action: () -> Unit): List<() -> Unit> =
        quiescenceActions.register(action)

    fun signalQuiescenceIfReady(): List<() -> Unit> {
        if (!isRouteRevoked || !lifecycle.isQuiescent) return emptyList()
        return quiescenceActions.signal()
    }
}

private sealed interface QuiescenceActionState

private class PendingQuiescenceActions(
    val actions: List<() -> Unit>,
) : QuiescenceActionState

private data object QuiescenceReached : QuiescenceActionState

private class QuiescenceActionRegistry {
    private val state = AtomicReference<QuiescenceActionState>(
        PendingQuiescenceActions(emptyList()),
    )

    val isSignaled: Boolean
        get() = state.load() === QuiescenceReached

    fun register(action: () -> Unit): List<() -> Unit> {
        while (true) {
            when (val current = state.load()) {
                QuiescenceReached -> return listOf(action)
                is PendingQuiescenceActions -> {
                    val updated = PendingQuiescenceActions(current.actions + action)
                    if (state.compareAndSet(current, updated)) return emptyList()
                }
            }
        }
    }

    fun signal(): List<() -> Unit> {
        while (true) {
            when (val current = state.load()) {
                QuiescenceReached -> return emptyList()
                is PendingQuiescenceActions -> {
                    if (state.compareAndSet(current, QuiescenceReached)) return current.actions
                }
            }
        }
    }
}

private class RuntimeCallbackRegistration<C : Callback>(
    override val callback: NativeAddress,
    override val userdata: NativeAddress?,
    internal val entry: RegistryEntry<C>,
) : CallbackRegistration<C> {
    override val policy: CallbackPolicy
        get() = entry.policy

    override val isClosed: Boolean
        get() = entry.lifecycle.isClosed

    override val isQuiescent: Boolean
        get() = entry.isQuiescent

    override fun onQuiescent(action: () -> Unit) {
        CallbackRuntime.onQuiescent(entry, action)
    }

    override fun close() {
        CallbackRuntime.close(entry)
    }
}

/** A generated binding's non-published registration for a transactional native call. */
@CallbackRuntimeApi
class PreparedCallbackRegistration<C : Callback> internal constructor(
    val callback: NativeAddress,
    val userdata: NativeAddress?,
    internal val entry: RegistryEntry<C>,
) : AutoCloseable {
    val policy: CallbackPolicy
        get() = entry.policy

    val isAborted: Boolean
        get() = entry.lifecycle.state == DeliveryState.ABORTED

    override fun close() {
        entry.lifecycle.abort()
    }
}

/**
 * Token → RegistryEntry index table. The token is a monotonic counter
 * (never reused): the slot index is token - 1. Capacity grows by doubling;
 * free slots remain null after close (the token is never reused, and a null
 * slot means "no longer active").
 *
 * Concurrency: a slot is written ONCE (publish) and read CAS-free
 * (volatile) — AtomicArray guarantees visibility. Removal sets the slot to
 * null (without copying a map). Growth is lock-free: the current generation
 * is published with CAS (AtomicReference); every slot operation reloads the
 * reference after its CAS and retries against the current generation if a
 * growth operation replaced its own, recognizing an entry already copied by
 * the growth operation by identity.
 *
 * Counter invariant: count == the number of visible entries in the current
 * generation (non-null slots). The runtime API publishes an entry at most
 * once and removes it at most once (lifecycle); each publishing insert
 * increments once and each table-removing remove decrements once — the
 * retries above are precisely what preserves that balance during concurrent
 * growth.
 *
 * Termination: every retry iteration consumes a new generation published by
 * a growth operation; capacity doubles at each growth and is capped at
 * Int.MAX_VALUE, so the total number of generations is bounded by
 * O(log(MAX_INDEXABLE_TOKEN)) and every loop terminates.
 *
 * Token bounds: the index (token - 1) must fit in a positive Int —
 * MAX_INDEXABLE_TOKEN is 2³¹−1, below the codec's validated range
 * (1..Long.MAX_VALUE, requireValidCallbackToken). A token above the limit is
 * rejected by require with a dedicated message (never confused with reuse) in
 * insert/remove, and read as "unknown" (null) in get.
 */
private class TokenIndexTable {
    private val INITIAL_CAPACITY = 64

    // token = index + 1; the index must fit in a positive Int.
    private val MAX_INDEXABLE_TOKEN = Int.MAX_VALUE.toULong()

    private val slots = AtomicReference(atomicArrayOfNulls<RegistryEntry<*>>(INITIAL_CAPACITY))

    private val count = AtomicLong(0L)

    fun insert(token: ULong, entry: RegistryEntry<*>): Boolean {
        val index = tokenIndex(token)
        while (true) {
            ensureCapacity(index + 1)
            val current = slots.load()
            val published = current.compareAndSetAt(index, null, entry)
            val latest = slots.load()
            if (latest === current) {
                // The generation was stable during the CAS: the result is final.
                if (published) break
                return false
            }
            // A growth operation published a newer generation during the CAS.
            // If our entry was copied there (the CAS succeeded before copying),
            // it is already published: count it and finish.
            if (published && latest.loadAt(index) === entry) break
            // Otherwise, retry against the current generation.
        }
        count.fetchAndAdd(1)
        return true
    }

    fun remove(token: ULong, entry: RegistryEntry<*>): Boolean {
        val index = tokenIndex(token)
        var removedFromTable = false
        while (true) {
            val current = slots.load()
            if (index >= current.size) {
                // Reached only on the first iteration (the token was never
                // inserted and no generation covers it): removedFromTable must
                // be false because a successful CAS requires size > index and
                // generations never shrink.
                return removedFromTable
            }
            val nulled = current.compareAndSetAt(index, entry, null)
            val latest = slots.load()
            if (latest === current) {
                if (nulled) {
                    count.fetchAndAdd(-1)
                    return true
                }
                // The current generation's slot does not contain this entry
                // (it was already removed or contains a different entry).
                if (removedFromTable) count.fetchAndAdd(-1)
                return removedFromTable
            }
            if (nulled) removedFromTable = true
            // Nulling targeted an older generation: the current generation may
            // still contain the entry (copied before it was nulled), so retry
            // to remove it there too.
            if (latest.loadAt(index) !== entry) {
                // The current generation no longer contains the entry: removal
                // is complete (it was copied as null or nulled above).
                if (removedFromTable) count.fetchAndAdd(-1)
                return removedFromTable
            }
            // The entry is still present in the current generation: retry CAS.
        }
    }

    operator fun get(token: ULong): RegistryEntry<*>? {
        // route() remains null-safe for every token (an unvalidated decoded
        // foreign pointer): values above the limit are unknown, as with the
        // previous map.
        if (token < 1uL || token > MAX_INDEXABLE_TOKEN) return null
        val index = (token - 1uL).toInt()
        val current = slots.load()
        if (index >= current.size) return null
        return current.loadAt(index)
    }

    val size: Long
        get() = count.load()

    private fun tokenIndex(token: ULong): Int {
        require(token in 1uL..MAX_INDEXABLE_TOKEN) {
            "Callback token $token is outside the token index table range (1..$MAX_INDEXABLE_TOKEN)"
        }
        return (token - 1uL).toInt() // token ≥ 1 (monotone)
    }

    private fun ensureCapacity(required: Int) {
        while (true) {
            val current = slots.load()
            if (required <= current.size) return
            var newCapacity = current.size
            while (newCapacity < required) {
                newCapacity = if (newCapacity > Int.MAX_VALUE / 2) Int.MAX_VALUE else newCapacity * 2
            }
            val grown = atomicArrayOfNulls<RegistryEntry<*>>(newCapacity)
            for (i in 0 until current.size) grown.storeAt(i, current.loadAt(i))
            if (slots.compareAndSet(current, grown)) return
        }
    }
}

/** Registration and dispatch primitives reserved for generated callback bindings. */
@CallbackRuntimeApi
object CallbackRuntime {
    private val lastAllocatedToken = AtomicLong(0L)
    private val tokenIndexTable = TokenIndexTable()
    private val activeNoUserdataRegistrations = AtomicInt(0)

    fun <C : Callback> register(
        type: CallbackType<C>,
        trampoline: NativeAddress,
        policy: CallbackPolicy,
        onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
        callback: C,
    ): CallbackRegistration<C> {
        val token = if (type.hasRoutingUserdata) allocateToken() else null
        val entry = RegistryEntry(
            type = type,
            callback = callback,
            policy = policy,
            onError = onError,
            token = token,
            initialState = DeliveryState.ACTIVE,
        )
        val registration = RuntimeCallbackRegistration(
            callback = trampoline,
            userdata = token?.let(PlatformCallbackTokenAddressCodec::encode),
            entry = entry,
        )
        publish(entry, allowNoUserdataRearm = false)
        return registration
    }

    fun <C : Callback> prepare(
        type: CallbackType<C>,
        trampoline: NativeAddress,
        policy: CallbackPolicy,
        onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
        callback: C,
    ): PreparedCallbackRegistration<C> {
        val token = if (type.hasRoutingUserdata) allocateToken() else null
        return PreparedCallbackRegistration(
            callback = trampoline,
            userdata = token?.let(PlatformCallbackTokenAddressCodec::encode),
            entry = RegistryEntry(
                type = type,
                callback = callback,
                policy = policy,
                onError = onError,
                token = token,
                initialState = DeliveryState.PREPARED,
            ),
        )
    }

    fun <C : Callback> activateForNativeCall(
        prepared: PreparedCallbackRegistration<C>,
        downcall: (CallbackRegistration<C>) -> Unit,
    ): CallbackRegistration<C> {
        val entry = prepared.entry
        check(entry.lifecycle.activate()) { "Prepared callback registration is no longer available" }
        val registration = RuntimeCallbackRegistration(
            callback = prepared.callback,
            userdata = prepared.userdata,
            entry = entry,
        )
        try {
            publish(entry, allowNoUserdataRearm = false)
            downcall(registration)
            return registration
        } catch (failure: Throwable) {
            registration.close()
            throw failure
        }
    }

    /**
     * Re-arms a retired callback slot after the caller has established native quiescence.
     * This operation neither performs nor verifies native quiescence.
     */
    @UnsafeCallbackRearmApi
    fun <C : Callback> rearmAfterNativeQuiescence(
        type: CallbackType<C>,
        trampoline: NativeAddress,
        policy: CallbackPolicy,
        onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
        callback: C,
    ): CallbackRegistration<C> {
        check(!type.hasRoutingUserdata) {
            "Only callback types without routing userdata require unsafe re-arming"
        }
        val entry = RegistryEntry(
            type = type,
            callback = callback,
            policy = policy,
            onError = onError,
            token = null,
            initialState = DeliveryState.ACTIVE,
        )
        val registration = RuntimeCallbackRegistration(
            callback = trampoline,
            userdata = null,
            entry = entry,
        )
        publish(entry, allowNoUserdataRearm = true)
        return registration
    }

    /**
     * Safe native upcall dispatch: the entry point of the upcall engine. No
     * Throwable escapes to native code — every failure is contained and routed
     * through one of two reporting channels:
     *
     * - routing and entry failures (route, tryEnter, unpublish ONCE)
     *   → reportUnroutedFailure ;
     * - callback and leave failures → reportDeliveryFailure(onError).
     *
     * The inner try/finally guards leave: it runs at most once, only after a
     * successful tryEnter, and its own failure is contained (never propagated
     * or masking another failure) and reported through onError. An unknown
     * token or a failed tryEnter is a silent no-op: return without side effects
     * (neither leave nor reporting).
     */
    fun <C : Callback> dispatchSafely(
        type: CallbackType<C>,
        userdata: NativeAddress?,
        invoke: (C) -> Unit,
    ) {
        dispatchSafely(type, userdata, Unit, invoke)
    }

    /**
     * Safe result-returning native upcall dispatch. [defaultValue] is returned
     * when routing or admission fails, when [invoke] throws, or when the
     * acquired delivery cannot leave cleanly.
     */
    fun <C : Callback, R> dispatchSafely(
        type: CallbackType<C>,
        userdata: NativeAddress?,
        defaultValue: R,
        invoke: (C) -> R,
    ): R {
        try {
            val entry = route(type, userdata) ?: return defaultValue
            if (!entry.lifecycle.tryEnter()) return defaultValue
            var result = defaultValue
            var deliverySucceeded = false
            try {
                // ONCE: removal happens only after a successful claim — a
                // losing racer never unpublishes.
                if (entry.policy == CallbackPolicy.ONCE) revokeRoute(entry)
                try {
                    result = invoke(entry.callback)
                    deliverySucceeded = true
                } catch (failure: Throwable) {
                    reportDeliveryFailure(entry.onError, failure)
                }
            } finally {
                try {
                    entry.lifecycle.leave()
                    signalQuiescenceIfReady(entry)
                } catch (failure: Throwable) {
                    deliverySucceeded = false
                    reportDeliveryFailure(entry.onError, failure)
                }
            }
            return if (deliverySucceeded) result else defaultValue
        } catch (failure: Throwable) {
            reportUnroutedFailure(failure)
            return defaultValue
        }
    }

    fun reportUnroutedFailure(error: Throwable) {
        reportUnhandledCallbackException(error)
    }

    internal fun activeRegistrationCountForTest(): Int =
        tokenIndexTable.size.toInt() + activeNoUserdataRegistrations.load()

    internal fun <C : Callback> onQuiescent(
        entry: RegistryEntry<C>,
        action: () -> Unit,
    ) {
        runQuiescenceActions(entry, entry.registerQuiescenceAction(action))
        signalQuiescenceIfReady(entry)
    }

    internal fun <C : Callback> close(entry: RegistryEntry<C>) {
        if (!entry.lifecycle.close()) {
            signalQuiescenceIfReady(entry)
            return
        }
        revokeRoute(entry)
    }

    private fun revokeRoute(entry: RegistryEntry<*>) {
        unpublish(entry)
        entry.markRouteRevoked()
        signalQuiescenceIfReady(entry)
    }

    private fun signalQuiescenceIfReady(entry: RegistryEntry<*>) {
        runQuiescenceActions(entry, entry.signalQuiescenceIfReady())
    }

    private fun runQuiescenceActions(
        entry: RegistryEntry<*>,
        actions: List<() -> Unit>,
    ) {
        actions.forEach { action ->
            try {
                action()
            } catch (failure: Throwable) {
                reportDeliveryFailure(entry.onError, failure)
            }
        }
    }

    private fun allocateToken(): ULong {
        while (true) {
            val previous = lastAllocatedToken.load()
            if (previous == Long.MAX_VALUE) {
                throw IllegalStateException("Callback token space exhausted")
            }
            val next = previous + 1L
            if (lastAllocatedToken.compareAndSet(previous, next)) return next.toULong()
        }
    }

    private fun <C : Callback> publish(
        entry: RegistryEntry<C>,
        allowNoUserdataRearm: Boolean,
    ) {
        val token = entry.token
        if (token != null) {
            insertToken(token, entry)
            return
        }

        val published = if (allowNoUserdataRearm) {
            entry.type.noUserdataSlot.rearm(entry)
        } else {
            entry.type.noUserdataSlot.activate(entry)
        }
        if (!published) {
            entry.lifecycle.close()
            val phase = entry.type.noUserdataSlot.phase
            throw IllegalStateException(
                "Callback type '${entry.type.canonicalId}' cannot be registered from no-userdata state $phase",
            )
        }
        activeNoUserdataRegistrations.fetchAndAdd(1)
    }

    private fun insertToken(token: ULong, entry: RegistryEntry<*>) {
        check(tokenIndexTable.insert(token, entry)) { "Callback token was unexpectedly reused" }
    }

    private fun unpublish(entry: RegistryEntry<*>) {
        val token = entry.token
        if (token != null) {
            removeToken(token, entry)
        } else {
            retireNoUserdata(entry)
        }
    }

    private fun removeToken(token: ULong, entry: RegistryEntry<*>): Boolean =
        tokenIndexTable.remove(token, entry)

    @Suppress("UNCHECKED_CAST")
    private fun retireNoUserdata(entry: RegistryEntry<*>): Boolean {
        val typedEntry = entry as RegistryEntry<Callback>
        val retired = typedEntry.type.noUserdataSlot.retire(typedEntry)
        if (retired) activeNoUserdataRegistrations.fetchAndAdd(-1)
        return retired
    }

    @Suppress("UNCHECKED_CAST")
    private fun <C : Callback> route(
        type: CallbackType<C>,
        userdata: NativeAddress?,
    ): RegistryEntry<C>? {
        if (!type.hasRoutingUserdata) {
            require(userdata == null) {
                "Callback type '${type.canonicalId}' does not accept routing userdata"
            }
            return type.noUserdataSlot.activeValue
        }

        val token = requireNotNull(PlatformCallbackTokenAddressCodec.decode(userdata)) {
            "Callback type '${type.canonicalId}' requires routing userdata"
        }
        val entry = tokenIndexTable[token] ?: return null
        require(entry.type === type) {
            "Callback token $token belongs to '${entry.type.canonicalId}', not '${type.canonicalId}'"
        }
        return entry as RegistryEntry<C>
    }

    private fun reportDeliveryFailure(
        handler: CallbackExceptionHandler,
        callbackFailure: Throwable,
    ) {
        try {
            handler.onException(callbackFailure)
        } catch (handlerFailure: Throwable) {
            reportUnroutedFailure(
                CallbackExceptionHandlerFailure(callbackFailure, handlerFailure),
            )
        }
    }
}
