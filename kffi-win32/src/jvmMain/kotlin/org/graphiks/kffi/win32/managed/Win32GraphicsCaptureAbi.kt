package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.foreign.FunctionDescriptor
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap

/**
 * ABI facts for the Windows Graphics Capture frontier, pinned from the
 * Windows SDK headers (winrt/windows.graphics.capture.h et al.). IInspectable
 * methods start at slot 6; IUnknown-derived interop/access interfaces use
 * slot 3; classic D3D11 slots follow the C vtbl (CreateTexture2D 5, Map 14,
 * CopyResource 47 — C and C++ declarations agree).
 */
internal object Win32GraphicsCaptureAbi {
    const val ITEM_INTEROP = "3628e81b-3cac-4c60-b7f4-23ce0e0c3356"
    const val ITEM = "79c3f95b-31f7-4ec2-a464-632ef5d30760"
    const val FRAME_POOL = "24eb6d22-1975-422e-82e7-780dbd8ddf24"
    const val FRAME_POOL_STATICS = "7784056a-67aa-4d53-ae54-1088d5a8ca21"
    const val FRAME_POOL_STATICS2 = "589b103f-6bbc-5df5-a991-02e28b3b66d5"
    const val SESSION = "814e42a9-f70f-4ad7-939b-fddcc6eb880d"
    const val FRAME = "fa50c623-38da-4b32-acf3-fa9734ad800e"
    const val DXGI_ACCESS = "a9b3d012-3df2-4ee3-b8d1-8695f457d3c1"
    const val IDXGI_DEVICE = "54ec77fa-1377-44e6-8c32-88fd5f44c84c"
    const val D3D11_TEXTURE2D = "6f15aaf2-d208-4e89-9ab4-489535d34f9c"
    const val ICLOSABLE = "30d5a829-7fa4-4026-83bb-d75bae4ea99e"

    // IGraphicsCaptureItemInterop (IUnknown-derived)
    const val SLOT_CREATE_FOR_WINDOW = 3
    const val SLOT_CREATE_FOR_MONITOR = 4
    // IGraphicsCaptureItem (IInspectable-derived)
    const val ITEM_GET_SIZE = 7
    const val ITEM_ADD_CLOSED = 8
    // IDirect3D11CaptureFramePool (IInspectable-derived)
    const val POOL_TRY_GET_NEXT_FRAME = 7
    const val POOL_ADD_FRAME_ARRIVED = 8
    const val POOL_REMOVE_FRAME_ARRIVED = 9
    const val POOL_CREATE_SESSION = 10
    // IGraphicsCaptureSession (IInspectable-derived, v6)
    const val SESSION_START_CAPTURE = 6
    // IDirect3D11CaptureFrame (IInspectable-derived)
    const val FRAME_GET_SURFACE = 6
    const val FRAME_GET_TIME = 7
    const val FRAME_GET_CONTENT_SIZE = 8
    // IDirect3DDxgiInterfaceAccess (IUnknown-derived)
    const val DXGI_ACCESS_GET_INTERFACE = 3
    // Classic D3D11
    const val DEVICE_CREATE_TEXTURE2D = 5
    const val CONTEXT_MAP = 14
    const val CONTEXT_UNMAP = 15
    const val CONTEXT_COPY_RESOURCE = 47
    const val CONTEXT_RELEASE = 2

    const val D3D11_USAGE_STAGING: Int = 3
    const val D3D11_CPU_ACCESS_READ: Int = 0x20000
    const val D3D11_MAP_READ: Int = 1

    fun createHstring(port: Win32GraphicsCaptureNativePort, arena: Arena, value: String): MemorySegment {
        val bytes = value.toByteArray(Charsets.UTF_16LE)
        val source = arena.allocate((bytes.size + 2).toLong(), 2).also { segment ->
            bytes.forEachIndexed { index, byte -> segment.set(ValueLayout.JAVA_BYTE, index.toLong(), byte) }
        }
        val out = arena.allocate(ValueLayout.ADDRESS)
        Win32TextComAbi.check(port.windowsCreateString(source, value.length, out))
        return out.get(ValueLayout.ADDRESS, 0)
    }
    fun itemSize(item: Long): Size {
        Arena.ofConfined().use { arena ->
            val out = arena.allocate(8)
            Win32TextComAbi.check(Win32TextComAbi.call(item, ITEM_GET_SIZE, "p", out))
            return Size(out.get(ValueLayout.JAVA_INT, 0), out.get(ValueLayout.JAVA_INT, 4))
        }
    }

    fun createItem(port: Win32GraphicsCaptureNativePort, arena: Arena, target: Long, window: Boolean): Long {
        val factory = createActivationFactoryForItem(port, arena)
        try {
            val out = arena.allocate(ValueLayout.ADDRESS)
            val slot = if (window) SLOT_CREATE_FOR_WINDOW else SLOT_CREATE_FOR_MONITOR
            run {
                val code = Win32TextComAbi.call(factory, slot, "ppp", MemorySegment.ofAddress(target), Win32TextComAbi.guid(arena, ITEM), out)
                if (code < 0) throw Win32GraphicsCaptureException(0x10000000.toInt() or code)
            }
            return out.get(ValueLayout.ADDRESS, 0).address()
        } finally {
            Win32TextComAbi.release(factory)
        }
    }

    /** Activation of GraphicsCaptureItem QI'd straight to the interop interface. */
    fun createActivationFactoryForItem(port: Win32GraphicsCaptureNativePort, arena: Arena): Long {
        val hstring = createHstring(port, arena, "Windows.Graphics.Capture.GraphicsCaptureItem")
        try {
            val out = arena.allocate(ValueLayout.ADDRESS)
            Win32TextComAbi.check(port.roGetActivationFactory(hstring, Win32TextComAbi.guid(arena, ITEM_INTEROP), out))
            return out.get(ValueLayout.ADDRESS, 0).address()
        } finally {
            port.windowsDeleteString(hstring)
        }
    }

    fun createSession(framePool: Long, item: Long): Long {
        Arena.ofConfined().use { arena ->
            val out = arena.allocate(ValueLayout.ADDRESS)
            val code = Win32TextComAbi.call(framePool, POOL_CREATE_SESSION, "pp", MemorySegment.ofAddress(item), out)
            if (code < 0) throw Win32GraphicsCaptureException(0x10000000.toInt() or code)
            return out.get(ValueLayout.ADDRESS, 0).address()
        }
    }

    fun startCapture(session: Long) {
        val code = Win32TextComAbi.call(session, SESSION_START_CAPTURE, "")
        if (code < 0) throw Win32GraphicsCaptureException(0x40000000.toInt() or code)
    }

    fun closableClose(address: Long) {
        Arena.ofConfined().use { arena ->
            val out = arena.allocate(ValueLayout.ADDRESS)
            val code = Win32TextComAbi.call(address, 0, "pp", Win32TextComAbi.guid(arena, ICLOSABLE), out)
            if (code < 0) return
            val closable = out.get(ValueLayout.ADDRESS, 0).address()
            if (closable != 0L) {
                try { Win32TextComAbi.call(closable, 6, "") } finally { Win32TextComAbi.release(closable) }
            }
        }
    }

    /**
     * Copies the next frame to a [Win32CaptureFrameValue] under the caller's
     * serialization; returns null when the pool has nothing new. All borrowed
     * COM references are released before return, success or failure.
     */
    fun copyNextFrame(port: Win32GraphicsCaptureNativePort, framePool: Long, device: Long, context: Long): Win32CaptureFrameValue? {
        Arena.ofConfined().use { arena ->
            val frameOut = arena.allocate(ValueLayout.ADDRESS)
            val code = Win32TextComAbi.call(framePool, POOL_TRY_GET_NEXT_FRAME, "p", frameOut)
            Win32TextComAbi.check(code)
            val frame = frameOut.get(ValueLayout.ADDRESS, 0).address()
            if (frame == 0L) return null
            try {
                val time = arena.allocate(8)
                Win32TextComAbi.check(Win32TextComAbi.call(frame, FRAME_GET_TIME, "p", time))
                val content = arena.allocate(8)
                Win32TextComAbi.check(Win32TextComAbi.call(frame, FRAME_GET_CONTENT_SIZE, "p", content))
                val surfaceOut = arena.allocate(ValueLayout.ADDRESS)
                Win32TextComAbi.check(Win32TextComAbi.call(frame, FRAME_GET_SURFACE, "p", surfaceOut))
                val surface = surfaceOut.get(ValueLayout.ADDRESS, 0).address()
                if (surface == 0L) return null
                try {
                    return copySurface(arena, surface, device, context, time.get(ValueLayout.JAVA_LONG, 0),
                        content.get(ValueLayout.JAVA_INT, 0), content.get(ValueLayout.JAVA_INT, 4))
                } finally {
                    Win32TextComAbi.release(surface)
                }
            } finally {
                Win32TextComAbi.release(frame)
            }
        }
    }

    private fun copySurface(
        arena: Arena,
        surface: Long,
        device: Long,
        context: Long,
        ticks: Long,
        contentWidth: Int,
        contentHeight: Int,
    ): Win32CaptureFrameValue {
        val accessOut = arena.allocate(ValueLayout.ADDRESS)
        Win32TextComAbi.check(Win32TextComAbi.call(surface, 0, "pp", Win32TextComAbi.guid(arena, DXGI_ACCESS), accessOut))
        val access = accessOut.get(ValueLayout.ADDRESS, 0).address()
        try {
            val textureOut = arena.allocate(ValueLayout.ADDRESS)
            Win32TextComAbi.check(Win32TextComAbi.call(access, DXGI_ACCESS_GET_INTERFACE, "pp", Win32TextComAbi.guid(arena, D3D11_TEXTURE2D), textureOut))
            val texture = textureOut.get(ValueLayout.ADDRESS, 0).address()
            try {
                val desc = arena.allocate(44)
                Win32TextComAbi.call(texture, 10, "p", desc)
                val width = desc.get(ValueLayout.JAVA_INT, 0)
                val height = desc.get(ValueLayout.JAVA_INT, 4)
                val staging = stagingDesc(arena, desc)
                val stagedOut = arena.allocate(ValueLayout.ADDRESS)
                Win32TextComAbi.check(Win32TextComAbi.call(device, DEVICE_CREATE_TEXTURE2D, "ppp", staging, MemorySegment.NULL, stagedOut))
                val staged = stagedOut.get(ValueLayout.ADDRESS, 0).address()
                try {
                    Win32TextComAbi.call(context, CONTEXT_COPY_RESOURCE, "pp", MemorySegment.ofAddress(staged), MemorySegment.ofAddress(texture))
                    val mapped = arena.allocate(16)
                    Win32TextComAbi.check(Win32TextComAbi.call(context, CONTEXT_MAP, "piip", MemorySegment.ofAddress(staged), 0, D3D11_MAP_READ, 0, mapped))
                    try {
                        val data = mapped.get(ValueLayout.ADDRESS, 0).address()
                        val rowPitch = mapped.get(ValueLayout.JAVA_INT, 8)
                        val bytes = ByteArray(width * 4 * height)
                        val source = MemorySegment.ofAddress(data).reinterpret(rowPitch.toLong() * height.toLong())
                        for (row in 0 until height) {
                            MemorySegment.copy(source, ValueLayout.JAVA_BYTE, row * rowPitch.toLong(), bytes, row * width * 4, width * 4)
                        }
                        return Win32CaptureFrameValue(width, height, ticks, contentWidth, contentHeight, bytes)
                    } finally {
                        Win32TextComAbi.call(context, CONTEXT_UNMAP, "pii", MemorySegment.ofAddress(staged), 0, 0)
                    }
                } finally {
                    Win32TextComAbi.release(staged)
                }
            } finally {
                Win32TextComAbi.release(texture)
            }
        } finally {
            Win32TextComAbi.release(access)
        }
    }

    private fun stagingDesc(arena: Arena, desc: MemorySegment): MemorySegment =
        arena.allocate(44).also { staging ->
            for (offset in longArrayOf(0, 4, 8, 12, 16)) staging.set(ValueLayout.JAVA_INT, offset, desc.get(ValueLayout.JAVA_INT, offset))
            staging.set(ValueLayout.JAVA_INT, 20, 1)
            staging.set(ValueLayout.JAVA_INT, 24, 0)
            staging.set(ValueLayout.JAVA_INT, 28, D3D11_USAGE_STAGING)
            staging.set(ValueLayout.JAVA_INT, 32, 0)
            staging.set(ValueLayout.JAVA_INT, 36, D3D11_CPU_ACCESS_READ)
            staging.set(ValueLayout.JAVA_INT, 40, 0)
        }

    internal data class Size(val width: Int, val height: Int)
}
internal object Win32CaptureFrameArrivedBridge {
    private val routes = ConcurrentHashMap<Long, () -> Unit>()
    private val arena = Arena.global()
    private val signatures = listOf("p", "p", "p", "pp") // QI, AddRef, Release, Invoke(receiver, args)

    private val table: MemorySegment by lazy {
        val vtable = arena.allocate(signatures.size * 8L, 8)
        signatures.forEachIndexed { slot, signature ->
            val descriptor = Win32TextComAbi.descriptor(signature)
            val dispatcher = MethodHandles.lookup().findStatic(
                Win32CaptureFrameArrivedBridge::class.java, "dispatch",
                MethodType.methodType(Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Array<Any>::class.java),
            )
            val target = MethodHandles.insertArguments(dispatcher, 0, slot)
                .asCollector(Array<Any>::class.java, signature.length + 1)
                .asType(descriptor.toMethodType())
            vtable.set(ValueLayout.ADDRESS, slot * 8L, Win32TextComAbi.linker.upcallStub(target, descriptor, arena))
        }
        vtable
    }

    fun register(onSignal: () -> Unit, ownerArena: Arena): MemorySegment =
        ownerArena.allocate(ValueLayout.ADDRESS).also {
            it.set(ValueLayout.ADDRESS, 0, table)
            check(routes.putIfAbsent(it.address(), onSignal) == null)
        }

    fun revoke(interfaceObject: Long) { routes.remove(interfaceObject) }

    @JvmStatic fun dispatch(slot: Int, arguments: Array<Any>): Int {
        val receiver = (arguments[0] as MemorySegment).address()
        val onSignal = routes[receiver] ?: return Win32DropComBridge.DISCONNECTED
        return try {
            if (slot == 3) onSignal()
            0
        } catch (failure: Throwable) {
            Win32DropComBridge.E_FAIL
        }
    }
}

internal class Win32CaptureFrameArrived(private val onSignal: () -> Unit) {
    private val registered = Win32CaptureFrameArrivedBridge.register(onSignal, Arena.ofShared())
    internal val address: Long get() = registered.address()
}
