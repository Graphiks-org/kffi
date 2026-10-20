package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

/** Typed native failure for the WGC frontier; HRESULT carrier only. */
public class Win32GraphicsCaptureException(public val hresult: Int) :
    RuntimeException("Win32 Graphics Capture failure 0x" + hresult.toUInt().toString(16))

/** One copied BGRA8 frame: tightly packed rows, no native retention. */
public class Win32CaptureFrameValue(
    public val width: Int,
    public val height: Int,
    public val systemRelativeTimeTicks: Long,
    public val contentWidth: Int,
    public val contentHeight: Int,
    public val bytes: ByteArray,
)

/**
 * Injectable native frontier over the generated flat exports (WinRT activation,
 * HSTRING, D3D11). Interfaces and vtable slots stay in [Win32GraphicsCapture].
 */
public interface Win32GraphicsCaptureNativePort {
    public fun roInitialize(initType: Int): Int
    public fun roUninitialize()
    public fun roGetActivationFactory(classId: MemorySegment, iid: MemorySegment, factory: MemorySegment): Int
    public fun windowsCreateString(source: MemorySegment, length: Int, hstring: MemorySegment): Int
    public fun windowsDeleteString(hstring: MemorySegment): Int
    public fun windowsGetStringRawBuffer(hstring: MemorySegment, length: MemorySegment): MemorySegment
    public fun d3d11CreateDevice(
        adapter: MemorySegment, driverType: Int, software: MemorySegment, flags: Int,
        levels: MemorySegment, levelCount: Int, sdkVersion: Int,
        device: MemorySegment, featureLevel: MemorySegment, context: MemorySegment,
    ): Int

    public fun createDirect3D11DeviceFromDXGIDevice(dxgiDevice: MemorySegment, graphicsDevice: MemorySegment): Int
}

/** The real generated frontier; injectable for tests. */
public object Win32GraphicsCaptureGeneratedPort : Win32GraphicsCaptureNativePort {
    override fun roInitialize(initType: Int): Int =
        org.graphiks.kffi.win32.generated.RoInitialize(org.graphiks.kffi.win32.generated.RO_INIT_TYPE.entries.first { it.value == initType.toLong() })

    override fun roUninitialize() = org.graphiks.kffi.win32.generated.RoUninitialize()
    override fun roGetActivationFactory(classId: MemorySegment, iid: MemorySegment, factory: MemorySegment): Int =
        org.graphiks.kffi.win32.generated.RoGetActivationFactory(classId, iid, factory)

    override fun windowsCreateString(source: MemorySegment, length: Int, hstring: MemorySegment): Int =
        org.graphiks.kffi.win32.generated.WindowsCreateString(source, length, hstring)

    override fun windowsDeleteString(hstring: MemorySegment): Int =
        org.graphiks.kffi.win32.generated.WindowsDeleteString(hstring)

    override fun windowsGetStringRawBuffer(hstring: MemorySegment, length: MemorySegment): MemorySegment =
        org.graphiks.kffi.win32.generated.WindowsGetStringRawBuffer(hstring, length)

    override fun d3d11CreateDevice(
        adapter: MemorySegment, driverType: Int, software: MemorySegment, flags: Int,
        levels: MemorySegment, levelCount: Int, sdkVersion: Int,
        device: MemorySegment, featureLevel: MemorySegment, context: MemorySegment,
    ): Int = org.graphiks.kffi.win32.generated.D3D11CreateDevice(
        adapter, org.graphiks.kffi.win32.generated.D3D_DRIVER_TYPE.entries.first { it.value == driverType.toLong() }, software, flags,
        levels, levelCount, sdkVersion, device, featureLevel, context,
    )

    override fun createDirect3D11DeviceFromDXGIDevice(dxgiDevice: MemorySegment, graphicsDevice: MemorySegment): Int =
        org.graphiks.kffi.win32.generated.CreateDirect3D11DeviceFromDXGIDevice(dxgiDevice, graphicsDevice)
}

/**
 * Managed Windows Graphics Capture for one window or monitor, on the calling
 * thread's MTA apartment. ABI facts are pinned from the Windows SDK headers
 * (winrt/windows.graphics.capture.h, Windows.Graphics.Capture.Interop.h,
 * windows.graphics.directx.direct3d11.interop.h, d3d11.h): IInspectable
 * methods start at slot 6; interop/dxgi-access are IUnknown-derived (slot 3);
 * D3D11 device CreateTexture2D is slot 5, immediate-context Map 14 /
 * CopyResource 47 (C vtbl and C++ declarations agree). All frame pixels are
 * copied to a [Win32CaptureFrameValue] inside the FrameArrived callback and
 * nothing native is retained. Close order: remove handler, IClosable session,
 * IClosable frame pool, release refs, RoUninitialize.
 */
public class Win32GraphicsCapture private constructor(
    private val port: Win32GraphicsCaptureNativePort,
) : AutoCloseable {
    private val arena = Arena.ofShared()
    private val references = ArrayList<Long>()
    private val lock = Object()
    private var closed = false
    private var handler: Win32CaptureFrameHandler? = null
    private var framePool: Long = 0
    private var session: Long = 0
    private var item: Long = 0
    private var device: Long = 0
    private var context: Long = 0
    private var directDevice: Long = 0
    private var token: Long = 0
    private var delegateAddress: Long = 0

    /** Probe without owning anything: activation + device must both succeed. */
    public fun probe(): Boolean = try {
        port.roInitialize(RO_INIT_MULTITHREADED)
        try {
            val factory = activationFactory(CLASS_FRAME_POOL, Win32GraphicsCaptureAbi.FRAME_POOL_STATICS)
            Win32TextComAbi.release(factory)
            true
        } finally {
            port.roUninitialize()
        }
    } catch (failure: Win32GraphicsCaptureException) {
        false
    }

    /**
     * Opens capture for one HWND (window=true) or HMONITOR (window=false).
     * [onFrame] runs on the OS frame thread with an already-copied value;
     * native context operations are serialized under [frameLock].
     */
    public fun open(target: Long, window: Boolean, onFrame: (Win32CaptureFrameValue) -> Unit) {
        synchronized(lock) {
            check(!closed) { "capture session is closed" }
            check(handler == null) { "capture session already open" }
        }
        port.roInitialize(RO_INIT_MULTITHREADED)
        try {
            val item = Win32GraphicsCaptureAbi.createItem(port, arena, target, window).also { references += it }
            val size = Win32GraphicsCaptureAbi.itemSize(item)
            val poolStatics = activationFactory(CLASS_FRAME_POOL, Win32GraphicsCaptureAbi.FRAME_POOL_STATICS2)
            try {
                createDeviceAndPool(poolStatics, size.width, size.height)
            } finally {
                Win32TextComAbi.release(poolStatics)
                references.remove(poolStatics)
            }
            val session = Win32GraphicsCaptureAbi.createSession(framePool, item)
            references += session
            val delegate = Win32CaptureFrameArrived { drainFrame() }
            delegateAddress = delegate.address
            val tokenOut = outPointer(arena)
            Win32TextComAbi.check(
                Win32TextComAbi.call(framePool, SLOT_ADD_FRAME_ARRIVED, "pp",
                    MemorySegment.ofAddress(delegateAddress), tokenOut),
            )
            token = tokenOut.get(ValueLayout.JAVA_LONG, 0)
            synchronized(lock) {
                this.item = item; this.session = session; this.handler = Win32CaptureFrameHandler(onFrame)
            }
            Win32GraphicsCaptureAbi.startCapture(session)
        } catch (failure: Throwable) {
            runCatching { closeOwners() }
            throw failure
        }
    }

    internal fun drainFrame() {
        val handler = synchronized(lock) { handler } ?: return
        val value = Win32GraphicsCaptureAbi.copyNextFrame(port, framePool, device, context)
        if (value != null) handler.deliver(value)
    }

    override fun close() {
        synchronized(lock) {
            if (closed) return
            closed = true
            handler = null
        }
        closeOwners()
    }

    private fun closeOwners() {
        synchronized(lock) {
            if (framePool != 0L && token != 0L) {
                runCatching { Win32TextComAbi.call(framePool, SLOT_REMOVE_FRAME_ARRIVED, "l", token) }
            }
            token = 0
        }
        if (delegateAddress != 0L) Win32CaptureFrameArrivedBridge.revoke(delegateAddress)
        sequenceOf(session, framePool).forEach { address ->
            if (address != 0L) runCatching { Win32GraphicsCaptureAbi.closableClose(address) }
        }
        val owned = synchronized(lock) {
            val list = references.toList()
            references.clear()
            item = 0; session = 0; framePool = 0; device = 0; context = 0; directDevice = 0; delegateAddress = 0
            list
        }
        owned.reversed().forEach { runCatching { Win32TextComAbi.release(it) } }
        runCatching { port.roUninitialize() }
    }

    private fun createDeviceAndPool(poolStatics: Long, width: Int, height: Int) {
        val deviceOut = outPointer(arena)
        val levelOut = arena.allocate(4)
        val contextOut = outPointer(arena)
        Win32TextComAbi.check(
            port.d3d11CreateDevice(
                MemorySegment.NULL, DRIVER_TYPE_HARDWARE, MemorySegment.NULL,
                D3D11_CREATE_DEVICE_BGRA_SUPPORT, MemorySegment.NULL, 0, D3D11_SDK_VERSION,
                deviceOut, levelOut, contextOut,
            ),
        )
        device = deviceOut.get(ValueLayout.ADDRESS, 0).address()
        context = contextOut.get(ValueLayout.ADDRESS, 0).address()
        references += device
        references += context
        val dxgiDevice = Arena.ofConfined().use { tmp ->
            val qi = tmp.allocate(ValueLayout.ADDRESS)
            Win32TextComAbi.check(Win32TextComAbi.call(device, 0, "pp", Win32TextComAbi.guid(tmp, Win32GraphicsCaptureAbi.IDXGI_DEVICE), qi))
            qi.get(ValueLayout.ADDRESS, 0).address()
        }
        references += dxgiDevice
        val directOut = outPointer(arena)
        Win32TextComAbi.check(port.createDirect3D11DeviceFromDXGIDevice(MemorySegment.ofAddress(dxgiDevice), directOut))
        directDevice = directOut.get(ValueLayout.ADDRESS, 0).address()
        references += directDevice
        val poolOut = outPointer(arena)
        Win32TextComAbi.check(
            Win32TextComAbi.call(
                poolStatics, SLOT_CREATE_FREE_THREADED, "ppiip",
                MemorySegment.ofAddress(directDevice), FORMAT_BGRA8, 2,
                sizeStruct(arena, width, height), poolOut,
            ),
        )
        framePool = poolOut.get(ValueLayout.ADDRESS, 0).address()
        references += framePool
    }

    private fun activationFactory(classId: String, iid: String): Long {
        val hstring = Win32GraphicsCaptureAbi.createHstring(port, arena, classId)
        try {
            val out = outPointer(arena)
            Win32TextComAbi.check(port.roGetActivationFactory(hstring, Win32TextComAbi.guid(arena, iid), out))
            return out.get(ValueLayout.ADDRESS, 0).address().also { references += it }
        } finally {
            port.windowsDeleteString(hstring)
        }
    }

    private fun Long.toHstringArg(arena: Arena): MemorySegment = MemorySegment.ofAddress(this)

    internal companion object {
        internal const val RO_INIT_MULTITHREADED: Int = 1
        internal const val DRIVER_TYPE_HARDWARE: Int = 1
        internal const val D3D11_CREATE_DEVICE_BGRA_SUPPORT: Int = 0x20
        internal const val D3D11_SDK_VERSION: Int = 7
        internal const val FORMAT_BGRA8: Int = 87 // DXGI_FORMAT_B8G8R8A8_UNORM
        internal const val SLOT_CREATE_FREE_THREADED: Int = 6
        internal const val SLOT_ADD_FRAME_ARRIVED: Int = 8
        internal const val SLOT_REMOVE_FRAME_ARRIVED: Int = 9
        internal const val CLASS_FRAME_POOL: String = "windows.graphics.capture.Direct3D11CaptureFramePool"
        internal const val CLASS_ITEM: String = "windows.graphics.capture.GraphicsCaptureItem"

        internal fun outPointer(arena: Arena): MemorySegment = arena.allocate(ValueLayout.ADDRESS)

        internal fun sizeStruct(arena: Arena, width: Int, height: Int): MemorySegment =            arena.allocate(8).also {
                it.set(ValueLayout.JAVA_INT, 0, width)
                it.set(ValueLayout.JAVA_INT, 4, height)
            }

        /** Public entry: verify the frontier at run time; never assume availability. */
        @JvmStatic public fun probe(port: Win32GraphicsCaptureNativePort = Win32GraphicsCaptureGeneratedPort): Boolean =
            Win32GraphicsCapture(port).use { it.probe() }
    }
}

internal class Win32CaptureFrameHandler(private val deliver: (Win32CaptureFrameValue) -> Unit) {
    fun deliver(value: Win32CaptureFrameValue) { deliver(value) }
}
