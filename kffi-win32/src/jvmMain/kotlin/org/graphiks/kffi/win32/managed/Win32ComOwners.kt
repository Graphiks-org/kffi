package org.graphiks.kffi.win32.managed

internal interface Win32ComApartmentPort {
    fun initializeSta(): Int
    fun uninitialize()
}

internal class Win32ComApartment private constructor(private val port: Win32ComApartmentPort) : AutoCloseable {
    private val thread = Thread.currentThread()
    private var closed = false
    override fun close() {
        if (closed) return
        if (thread !== Thread.currentThread()) throw Win32TextException(0x8001010e.toInt())
        closed = true
        port.uninitialize()
    }
    companion object {
        fun open(port: Win32ComApartmentPort): Win32ComApartment {
            if (Thread.currentThread().isVirtual) throw Win32TextException(0x8001010e.toInt())
            val result = port.initializeSta()
            if (result < 0) throw Win32TextException(result)
            return Win32ComApartment(port)
        }
    }
}

/** Every acquired reference is registered immediately, before the next fallible native call. */
internal class Win32ComResources : AutoCloseable {
    private val releases = ArrayDeque<() -> Unit>()
    private var closed = false
    fun own(address: Long, release: (Long) -> Unit): Long {
        check(!closed)
        require(address != 0L)
        defer { release(address) }
        return address
    }
    fun defer(release: () -> Unit) { check(!closed); releases.addFirst(release) }
    override fun close() {
        if (closed) return
        closed = true
        var first: Throwable? = null
        while (releases.isNotEmpty()) {
            try { releases.removeFirst().invoke() }
            catch (failure: Throwable) { if (first == null) first = failure else first.addSuppressed(failure) }
        }
        first?.let { throw it }
    }
}

/** Revocation is immediate; the native owner is reaped only after the final admitted callback. */
internal class Win32ComCallbackGate {
    private val monitor = Any()
    private var revoked = false
    private var active = 0
    private var onQuiescent: (() -> Unit)? = null
    fun <T> call(fallback: T, body: () -> T): T {
        synchronized(monitor) {
            if (revoked) return fallback
            active++
        }
        try { return body() }
        finally {
            val action = synchronized(monitor) {
                active--
                if (revoked && active == 0) onQuiescent.also { onQuiescent = null } else null
            }
            action?.invoke()
        }
    }
    fun revoke(action: (() -> Unit)? = null) {
        val ready = synchronized(monitor) {
            revoked = true
            if (active == 0) true else {
                if (action != null) {
                    check(onQuiescent == null)
                    onQuiescent = action
                }
                false
            }
        }
        if (ready) action?.invoke()
    }
}
