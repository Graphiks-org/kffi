package org.graphiks.kffi.win32.managed

import java.lang.foreign.MemorySegment
import java.util.concurrent.atomic.AtomicBoolean
import org.graphiks.kffi.win32.generated.GetWindowThreadProcessId
import org.graphiks.kffi.win32.generated.GetCurrentThreadId
import org.graphiks.kffi.win32.generated.OleInitialize
import org.graphiks.kffi.win32.generated.OleUninitialize
import org.graphiks.kffi.win32.generated.RevokeDragDrop
import org.graphiks.kffi.win32.generated.RegisterDragDrop
import org.graphiks.kffi.win32.generated.init

/** Application drop callbacks. Values only: no native pointer, buffer or layout crosses this interface. */
public interface Win32DropTargetHandler {
    /** One offered drag. The receiver owns [data] and must close it exactly once, possibly after this call returns. */
    public fun dragEnter(data: Win32DropData, x: Long, y: Long, keyState: Int, allowedEffects: Int): Int
    public fun dragOver(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int
    public fun dragLeave()
    /** The same offered drag completing; the DragEnter-retained [Win32DropData] stays authoritative. */
    public fun drop(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int
}

/** One registered drop target for one live HWND; close revokes the native registration first. */
public class Win32DropTarget private constructor(
    private val services: Win32DropServices,
    public val hwnd: Long,
    private val comObject: Win32DropComObject,
    private val revoked: AtomicBoolean,
) : AutoCloseable {
    internal fun openNative() {
        val result = RegisterDragDrop(MemorySegment.ofAddress(hwnd), MemorySegment.ofAddress(comObject.address))
        if (result != 0) throw Win32DropException(result)
    }

    override fun close() {
        services.checkThread()
        if (!revoked.compareAndSet(false, true)) return
        try {
            val result = RevokeDragDrop(MemorySegment.ofAddress(hwnd))
            if (result != 0) throw Win32DropException(result)
        } finally {
            comObject.close()
            services.forget(hwnd, this)
        }
    }

    internal companion object {
        internal fun create(services: Win32DropServices, hwnd: Long, handler: Win32DropTargetHandler, onFailure: (Throwable) -> Unit): Win32DropTarget {
            val target = Win32DropTarget(services, hwnd, Win32DropComObject(handler, onFailure), AtomicBoolean())
            try { target.openNative() } catch (failure: Throwable) { target.comObject.close(); throw failure }
            return target
        }
    }
}

/**
 * Thread-owned OLE drop services: one balanced OleInitialize on the opening
 * thread and the registered targets of that thread. **S_OK and S_FALSE are
 * each consumed exactly once; a thread already in another apartment fails with
 * a typed HRESULT instead of being converted.** Close revokes every target
 * first, then uninitializes OLE.
 */
public class Win32DropServices private constructor(
    private val apartment: Win32ComApartment,
) : AutoCloseable {
    private val thread = Thread.currentThread()
    private val targets = HashMap<Long, Win32DropTarget>()
    private val closed = AtomicBoolean()

    /** Registers one drop target on [hwnd]; the caller thread must own the window and the OLE apartment. */
    public fun register(hwnd: Long, handler: Win32DropTargetHandler, onFailure: (Throwable) -> Unit): Win32DropTarget {
        require(hwnd != 0L)
        checkThread()
        checkOpen()
        synchronized(targets) { if (targets.containsKey(hwnd)) throw Win32DropException(0x800700aa.toInt()) } // already a target for this window
        if (GetWindowThreadProcessId(MemorySegment.ofAddress(hwnd), MemorySegment.NULL) != GetCurrentThreadId()) {
            throw Win32DropException(WRONG_THREAD)
        }
        val target = Win32DropTarget.create(this, hwnd, handler, onFailure)
        synchronized(targets) { targets[hwnd] = target }
        return target
    }

    internal fun forget(hwnd: Long, target: Win32DropTarget) {
        synchronized(targets) { if (targets[hwnd] === target) targets.remove(hwnd) }
    }

    internal fun checkThread() {
        if (Thread.currentThread() !== thread) throw Win32DropException(WRONG_THREAD)
    }

    private fun checkOpen() {
        if (closed.get()) throw Win32DropException(DISCONNECTED)
    }

    override fun close() {
        if (!closed.compareAndSet(false, true)) return
        checkThread()
        val pending = synchronized(targets) { targets.values.toList() }
        var first: Throwable? = null
        for (target in pending) {
            try { target.close() }
            catch (failure: Throwable) { if (first == null) first = failure else first.addSuppressed(failure) }
        }
        try { apartment.close() } catch (failure: Throwable) { if (first == null) first = failure else first.addSuppressed(failure) }
        first?.let { throw it }
    }

    public companion object {
        /** Opens OLE drop services on the calling thread; requires Windows. */
        public fun open(): Win32DropServices {
            check(Win32ControlWindow.isSupported()) {
                "Win32 OLE drop services require Windows; this platform (" +
                    System.getProperty("os.name") + ") is unsupported — no native library was loaded."
            }
            init()
            val apartment = try {
                Win32ComApartment.open(object : Win32ComApartmentPort {
                    override fun initializeSta(): Int = OleInitialize(MemorySegment.NULL)
                    override fun uninitialize() { OleUninitialize() }
                })
            } catch (failure: Win32TextException) {
                throw Win32DropException(failure.hresult)
            }
            return Win32DropServices(apartment)
        }

        internal const val WRONG_THREAD: Int = 0x8001010e.toInt() // RPC_E_WRONG_THREAD
        internal const val DISCONNECTED: Int = 0x80010108.toInt() // RPC_E_DISCONNECTED
    }
}
