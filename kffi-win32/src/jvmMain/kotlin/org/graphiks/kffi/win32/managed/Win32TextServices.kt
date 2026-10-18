package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicBoolean
import org.graphiks.kffi.win32.generated.*

/** Thread-owned TSF services. Worker close is revoked immediately and reaped through an HWND. */
public class Win32TextServices private constructor(
    private val apartment: Win32ComApartment,
    private val resources: Win32ComResources,
    internal val managerAddress: Long,
    internal val clientId: Int,
    private val keyManager: Long,
    private val control: Win32ControlWindow,
) : AutoCloseable {
    private val thread = Thread.currentThread()
    private val closing = AtomicBoolean()
    private val wakePending = AtomicBoolean()
    private val stores = ConcurrentHashMap<Long, Win32TextStore>()
    private val retired = ConcurrentHashMap.newKeySet<Win32TextStore>()
    @Volatile private var nativeClosed = false
    private var draining = false

    public fun createStore(hwnd: Long, initial: Win32TextSnapshot, config: Win32TextConfiguration,
        limits: Win32TextLimits, onChange: (Win32TextChange) -> Boolean, onFailure: (Throwable) -> Unit): Win32TextStore {
        checkThread()
        if (closing.get()) throw Win32TextException(Win32TextDocument.DISCONNECTED)
        if (GetWindowThreadProcessId(MemorySegment.ofAddress(hwnd), MemorySegment.NULL) != GetCurrentThreadId())
            throw Win32TextException(Win32TextDocument.WRONG_THREAD)
        if (stores.size >= limits.maxCollectionElements) throw Win32TextException(Win32TextDocument.OUT_OF_MEMORY)
        val store = Win32TextStore(this, hwnd, initial, config, limits, onChange, onFailure)
        if (stores.putIfAbsent(hwnd, store) != null) {
            store.closeNative()
            throw Win32TextException(0x800700aa.toInt())
        }
        try { store.openNative(); store.checkAdmitted(); return store }
        catch (failure: Throwable) { stores.remove(hwnd, store); store.closeNative(); throw failure }
    }

    public fun filterKey(hwnd: Long, message: Int, wParam: Long, lParam: Long): Boolean {
        checkThread()
        val store = stores[hwnd] ?: return false
        if (!store.acceptsKeys || closing.get()) return false
        val down = when (message) { 0x100, 0x104 -> true; 0x101, 0x105 -> false; else -> return false }
        return try { Arena.ofConfined().use { arena ->
            val eaten = arena.allocate(4, 4)
            val result = Win32TextComAbi.call(keyManager, if (down) 6 else 7, "llp", wParam, lParam, eaten)
            Win32TextComAbi.check(result)
            if (result != 0 || eaten.get(ValueLayout.JAVA_INT, 0) == 0) return false
            eaten.set(ValueLayout.JAVA_INT, 0, 0)
            Win32TextComAbi.check(Win32TextComAbi.call(keyManager, if (down) 8 else 9, "llp", wParam, lParam, eaten))
            eaten.get(ValueLayout.JAVA_INT, 0) != 0
        } } catch (failure: Throwable) { store.fail(failure); false }
    }

    internal fun checkThread() {
        if (Thread.currentThread() !== thread) throw Win32TextException(Win32TextDocument.WRONG_THREAD)
    }

    internal fun closeStore(store: Win32TextStore) {
        retired.add(store)
        if (Thread.currentThread() === thread && store.nativeCalls == 0) drain()
        else wake()
    }

    private fun wake() {
        if (!wakePending.compareAndSet(false, true)) return
        if (PostMessageW(MemorySegment.ofAddress(control.hwnd), Win32ControlWindow.COMMAND_MESSAGE, 0, 0) == 0) {
            wakePending.set(false)
            val failure = Win32TextException(0x80004005.toInt())
            retired.forEach { it.report(failure) }
        }
    }

    private fun drain() {
        checkThread()
        if (nativeClosed || draining) return
        draining = true
        try {
        wakePending.set(false)
        for (store in retired.toList()) {
            if (store.nativeCalls != 0) continue
            try { store.closeNative() }
            catch (failure: Throwable) { store.report(failure) }
            finally { retired.remove(store); stores.remove(store.hwnd, store) }
        }
        if (closing.get() && stores.isEmpty() && retired.isEmpty()) {
            nativeClosed = true
            try { resources.close() }
            finally { try { apartment.close() } finally { control.close() } }
        } else if (retired.isNotEmpty()) wake()
        } finally { draining = false }
    }

    override fun close() {
        if (closing.compareAndSet(false, true)) stores.values.toList().forEach { it.close() }
        if (Thread.currentThread() === thread) drain() else if (!nativeClosed) wake()
    }

    public companion object {
        public fun open(): Win32TextServices {
            check(Win32ControlWindow.isSupported()) { "Native text services require Windows" }
            init()
            val apartment = Win32ComApartment.open(object : Win32ComApartmentPort {
                override fun initializeSta(): Int = CoInitializeEx(MemorySegment.NULL, 2)
                override fun uninitialize() = CoUninitialize()
            })
            val resources = Win32ComResources()
            var control: Win32ControlWindow? = null
            try {
                return Arena.ofConfined().use { arena ->
                    val output = arena.allocate(ValueLayout.ADDRESS)
                    Win32TextComAbi.check(CoCreateInstance(Win32TextComAbi.guid(arena, Win32TextComAbi.THREAD_MANAGER_CLASS),
                        MemorySegment.NULL, 1, Win32TextComAbi.guid(arena, Win32TextComAbi.THREAD_MANAGER), output))
                    val manager = resources.own(output.get(ValueLayout.ADDRESS, 0).address(), Win32TextComAbi::release)
                    val id = arena.allocate(4, 4)
                    Win32TextComAbi.check(Win32TextComAbi.call(manager, 3, "p", id))
                    resources.defer { Win32TextComAbi.check(Win32TextComAbi.call(manager, 4, "")) }
                    val keyManager = resources.own(Win32TextComAbi.query(manager, Win32TextComAbi.KEYSTROKE_MANAGER), Win32TextComAbi::release)
                    var service: Win32TextServices? = null
                    val endpoint = Win32ControlWindow.open { _, message, _, _ ->
                        if (message == Win32ControlWindow.COMMAND_MESSAGE) service?.drain()
                        0
                    }
                    control = endpoint
                    Win32TextServices(apartment, resources, manager, id.get(ValueLayout.JAVA_INT, 0), keyManager, endpoint)
                        .also { service = it }
                }
            } catch (failure: Throwable) {
                runCatching { control?.close() }
                runCatching { resources.close() }
                runCatching { apartment.close() }
                throw failure
            }
        }
    }
}
