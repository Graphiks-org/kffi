package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSArray
import org.graphiks.kffi.objc.NSBackingStoreType
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSRect
import org.graphiks.kffi.objc.NSSize
import org.graphiks.kffi.objc.NSThread
import org.graphiks.kffi.objc.NSView
import org.graphiks.kffi.objc.NSWindow
import org.graphiks.kffi.objc.NSWindowStyleMask
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.acceptsMouseMovedEvents
import org.graphiks.kffi.objc.setAcceptsMouseMovedEvents
import org.graphiks.kffi.objc.trackingAreas
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.io.File
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ObjCPointerTrackingTest {
    @Test
    fun installsAndRevokesPeerLocalTrackingOnTheAppKitMainThread() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C pointer tracking tests require macOS",
        )

        val process = ProcessBuilder(
            File(System.getProperty("java.home"), "bin/java").path,
            "-XstartOnFirstThread",
            "--enable-native-access=ALL-UNNAMED",
            "-cp",
            System.getProperty("java.class.path"),
            ObjCPointerTrackingProbe::class.java.name,
        ).redirectErrorStream(true).start()
        val output = StringBuilder()
        val reader = thread(start = true, isDaemon = true) {
            process.inputStream.bufferedReader().use { output.append(it.readText()) }
        }

        assertTrue(process.waitFor(30, TimeUnit.SECONDS), "AppKit pointer tracking probe timed out")
        reader.join(5_000)
        assertEquals(0, process.exitValue(), output.toString())
    }
}

object ObjCPointerTrackingProbe {
    @JvmStatic
    fun main(args: Array<String>) {
        ObjCRuntime.autoreleasePool {
            check(NSThread.isMainThread()) { "AppKit pointer tracking probe must run on the native main thread" }
            val window = newWindow()
            val primary = newView()
            val secondary = newView()
            try {
                window.setContentView(primary.ptr)
                primary.addSubview(secondary.ptr)
                release(primary.ptr)
                release(secondary.ptr)

                window.setAcceptsMouseMovedEvents(false)
                val first = primary.installPointerTracking(window)
                assertTrue(window.acceptsMouseMovedEvents())
                assertEquals(1L, trackingAreaCount(primary))

                val second = secondary.installPointerTracking(window)
                assertTrue(window.acceptsMouseMovedEvents())
                assertEquals(1L, trackingAreaCount(secondary))

                first.close()
                assertTrue(window.acceptsMouseMovedEvents(), "The first close must not restore a shared window lease")
                assertEquals(0L, trackingAreaCount(primary))
                assertEquals(1L, trackingAreaCount(secondary))

                second.close()
                assertFalse(window.acceptsMouseMovedEvents(), "The last close must restore the original window value")
                assertEquals(0L, trackingAreaCount(secondary))

                second.close()
                assertFalse(window.acceptsMouseMovedEvents(), "Close must be idempotent")

                window.setAcceptsMouseMovedEvents(true)
                primary.installPointerTracking(window).use { }
                assertTrue(window.acceptsMouseMovedEvents(), "A released lease must not retain a stale original value")

                val failure = arrayOf<Throwable?>(null)
                thread(start = true) {
                    failure[0] = runCatching { primary.installPointerTracking(window) }.exceptionOrNull()
                }.join()
                assertTrue(failure[0] is IllegalStateException, "Pointer tracking must reject non-AppKit-main threads")
            } finally {
                window.close()
            }
        }
    }

    private fun newWindow(): NSWindow = NSWindow(
        NSWindow(alloc("NSWindow")).initWithContentRect_styleMask_backing_defer(
            contentRect = NSRect(origin = NSPoint(0.0, 0.0), size = NSSize(100.0, 100.0)),
            style = NSWindowStyleMask.NSWindowStyleMaskTitled,
            backingStoreType = NSBackingStoreType.NSBackingStoreBuffered,
            flag = false,
        ),
    )

    private fun newView(): NSView = NSView(
        NSView(alloc("NSView")).initWithFrame(
            NSRect(origin = NSPoint(0.0, 0.0), size = NSSize(100.0, 100.0)),
        ),
    )

    private fun trackingAreaCount(view: NSView): Long = NSArray(view.trackingAreas()).count()

    private fun alloc(className: String): MemorySegment = ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        ObjCRuntime.getClass(className),
        ObjCRuntime.sel("alloc"),
    ) as MemorySegment

    private fun release(instance: MemorySegment) {
        ObjCRuntime.msgSend(null, instance, ObjCRuntime.sel("release"))
    }
}
