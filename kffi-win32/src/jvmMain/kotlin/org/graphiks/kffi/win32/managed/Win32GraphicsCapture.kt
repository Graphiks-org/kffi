package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

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
    @Suppress("unused") private val loaded = org.graphiks.kffi.win32.generated.init()

    override fun roInitialize(initType: Int): Int =
        org.graphiks.kffi.win32.generated.RoInitialize(
            org.graphiks.kffi.win32.generated.RO_INIT_TYPE.entries.first { it.value == initType.toLong() },
        )

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
        adapter,
        org.graphiks.kffi.win32.generated.D3D_DRIVER_TYPE.entries.first { it.value == driverType.toLong() },
        software, flags, levels, levelCount, sdkVersion, device, featureLevel, context,
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
 * CopyResource 47 (C vtbl and C++ declarations agree). WinRT structs of eight
 * bytes travel by value in a register: SizeInt32 rides one LONG, packed as
 * width | height shl 32. `RoGetActivationFactory` is case sensitive: runtime
 * class names carry the `Windows.Graphics.Capture.` prefix verbatim.
 *
 * Frames are pulled on a daemon poller rather than pushed through
 * FrameArrived: the WinRT event registration answers 0x8000001C on the
 * observed hosts, while a bounded TryGetNextFrame walk delivers the same
 * stream contract without it. All frame pixels are copied into a
 * [Win32CaptureFrameValue] inside the poller and nothing native is retained.
 * Close order: IClosable session, IClosable frame pool, release refs,
 * RoUninitialize.
 */
public class Win32GraphicsCapture private constructor(
    private val port: Win32GraphicsCaptureNativePort,
) : AutoCloseable {
    private val arena = Arena.ofShared()
    private val references = ArrayList<Long>()
    private val lock = Object()
    private var closed = false
    private var handler: ((Win32CaptureFrameValue) -> Unit)? = null
    private var framePool: Long = 0
    private var session: Long = 0
    private var item: Long = 0
    private var device: Long = 0
    private var context: Long = 0
    private var directDevice: Long = 0
    private var d3dDevice: Long = 0
    private var poller: Thread? = null
    private var apartmentOwned: Boolean = false

    internal var probeFailureCode: Int = 0
        private set

    /** Probe without owning anything: activation must succeed; the apartment pair stays balanced. */
    public fun probe(): Boolean {
        if (port.roInitialize(RO_INIT_MULTITHREADED) < 0) return false
        try {
            val factory = activationFactory(CLASS_FRAME_POOL, Win32GraphicsCaptureAbi.FRAME_POOL_STATICS)
            references.remove(factory)
            Win32TextComAbi.release(factory)
            return true
        } catch (failure: Win32TextException) {
            probeFailureCode = failure.hresult
            return false
        } finally {
            port.roUninitialize()
        }
    }

    /**
     * Opens capture for one HWND (window=true) or HMONITOR (window=false).
     * [onFrame] runs on the poller thread with an already-copied value; D3D11
     * immediate-context work is serialized under [lock].
     */
    public fun open(target: Long, window: Boolean, onFrame: (Win32CaptureFrameValue) -> Unit) {
        synchronized(lock) {
            check(!closed) { "capture session is closed" }
            check(handler == null) { "capture session already open" }
        }
        port.roInitialize(RO_INIT_MULTITHREADED)
        apartmentOwned = true
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
            poller = Thread({
                while (!synchronized(lock) { closed }) {
                    drainFrame()
                    Thread.sleep(16)
                }
            }, "kffi-wgc-frame-poll").apply { isDaemon = true; start() }
            synchronized(lock) {
                this.item = item
                this.session = session
                this.handler = onFrame
            }
            Win32GraphicsCaptureAbi.startCapture(session)
        } catch (failure: Throwable) {
            runCatching { closeOwners() }
            throw failure
        }
    }

    internal fun drainFrame() {
        val handler = synchronized(lock) { handler } ?: return
        val value = synchronized(lock) {
            Win32GraphicsCaptureAbi.copyNextFrame(port, framePool, device, context)
        }
        if (value != null) handler(value)
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
        val poller = poller
        this.poller = null
        poller?.join(500)
        sequenceOf(session, framePool).forEach { address ->
            if (address != 0L) runCatching { Win32GraphicsCaptureAbi.closableClose(address) }
        }
        val owned = synchronized(lock) {
            val list = references.toList()
            references.clear()
            item = 0; session = 0; framePool = 0; device = 0; context = 0; directDevice = 0; d3dDevice = 0
            list
        }
        owned.reversed().forEach { runCatching { Win32TextComAbi.release(it) } }
        if (apartmentOwned) {
            apartmentOwned = false
            runCatching { port.roUninitialize() }
        }
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
            Win32TextComAbi.check(
                Win32TextComAbi.call(device, 0, "pp", Win32TextComAbi.guid(tmp, Win32GraphicsCaptureAbi.IDXGI_DEVICE), qi),
            )
            qi.get(ValueLayout.ADDRESS, 0).address()
        }
        references += dxgiDevice
        val directOut = outPointer(arena)
        Win32TextComAbi.check(port.createDirect3D11DeviceFromDXGIDevice(MemorySegment.ofAddress(dxgiDevice), directOut))
        directDevice = directOut.get(ValueLayout.ADDRESS, 0).address()
        references += directDevice
        val d3dDeviceOut = outPointer(arena)
        Win32TextComAbi.check(
            Win32TextComAbi.call(directDevice, 0, "pp", Win32TextComAbi.guid(arena, Win32GraphicsCaptureAbi.DIRECT3D_DEVICE), d3dDeviceOut),
        )
        d3dDevice = d3dDeviceOut.get(ValueLayout.ADDRESS, 0).address()
        references += d3dDevice
        val poolOut = outPointer(arena)
        Win32TextComAbi.check(
            Win32TextComAbi.call(
                poolStatics, SLOT_CREATE_FREE_THREADED, "piilp",
                MemorySegment.ofAddress(d3dDevice), FORMAT_BGRA8, 2,
                (width.toLong() and 0xffffffffL) or (height.toLong() shl 32), poolOut,
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

    public companion object {
        internal const val RO_INIT_MULTITHREADED: Int = 1
        internal const val DRIVER_TYPE_HARDWARE: Int = 1
        internal const val D3D11_CREATE_DEVICE_BGRA_SUPPORT: Int = 0x20
        internal const val D3D11_SDK_VERSION: Int = 7
        internal const val FORMAT_BGRA8: Int = 87 // DXGI_FORMAT_B8G8R8A8_UNORM
        internal const val SLOT_CREATE_FREE_THREADED: Int = 6
        internal const val CLASS_FRAME_POOL: String = "Windows.Graphics.Capture.Direct3D11CaptureFramePool"
        internal const val CLASS_ITEM: String = "Windows.Graphics.Capture.GraphicsCaptureItem"

        internal fun outPointer(arena: Arena): MemorySegment = arena.allocate(ValueLayout.ADDRESS)

        /** Public entry: verify the frontier at run time; never assume availability. */
        @JvmStatic public fun probe(port: Win32GraphicsCaptureNativePort = Win32GraphicsCaptureGeneratedPort): Boolean =
            Win32GraphicsCapture(port).use { it.probe() }

        /**
         * Opens one live capture session for a caller-owned consumer; the
         * returned handle closes the session (owners closed in the documented
         * order). Throws on any native failure instead of half-opening.
         */
        @JvmStatic public fun openCapture(
            target: Long,
            window: Boolean,
            port: Win32GraphicsCaptureNativePort = Win32GraphicsCaptureGeneratedPort,
            onFrame: (Win32CaptureFrameValue) -> Unit,
        ): Win32GraphicsCapture {
            val capture = Win32GraphicsCapture(port)
            capture.open(target, window, onFrame)
            return capture
        }

        internal fun forTesting(port: Win32GraphicsCaptureNativePort): Win32GraphicsCapture = Win32GraphicsCapture(port)
    }
}
