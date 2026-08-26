package org.graphiks.kffi.objc

import org.junit.jupiter.api.Assumptions.assumeTrue
import java.io.File
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class ObjCAppearanceProtocolRequirementTest {
    @Test
    fun exposesRequiredAppearanceProtocolAccessorsOnViewAndWindow() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C appearance protocol tests require macOS",
        )

        val process = ProcessBuilder(
            File(System.getProperty("java.home"), "bin/java").path,
            "-XstartOnFirstThread",
            "--enable-native-access=ALL-UNNAMED",
            "-cp",
            System.getProperty("java.class.path"),
            ObjCAppearanceProtocolRequirementProbe::class.java.name,
        ).redirectErrorStream(true).start()
        val output = StringBuilder()
        val outputLock = Any()
        val outputReader = thread(
            start = true,
            isDaemon = true,
            name = "objc-appearance-probe-output",
        ) {
            process.inputStream.bufferedReader().use { reader ->
                val buffer = CharArray(4_096)
                while (true) {
                    val count = reader.read(buffer)
                    if (count < 0) break
                    synchronized(outputLock) {
                        output.append(buffer, 0, count)
                    }
                }
            }
        }
        fun capturedOutput(): String = synchronized(outputLock) { output.toString() }

        val completed = process.waitFor(30, TimeUnit.SECONDS)
        if (!completed) {
            process.destroyForcibly()
            assertTrue(
                process.waitFor(5, TimeUnit.SECONDS),
                "AppKit probe did not terminate within 5 seconds after destroyForcibly; output:\n${capturedOutput()}",
            )
            outputReader.join(5_000)
            error("AppKit probe timed out after 30 seconds; output:\n${capturedOutput()}")
        }
        outputReader.join(5_000)
        assertTrue(!outputReader.isAlive, "AppKit probe output reader did not finish; output:\n${capturedOutput()}")
        assertEquals(0, process.exitValue(), capturedOutput())
    }

    @Suppress("UNUSED_VARIABLE")
    private val typedNSWindowContract:
        (NSWindow, NSRect, NSWindowStyleMask, NSBackingStoreType, NSPoint) -> Unit =
        { window, contentRect, styleMask, backingStoreType, point ->
            val frameRect: NSRect = NSWindow.frameRectForContentRect_styleMask(contentRect, styleMask)
            val windowNumber: Long = NSWindow.windowNumberAtPoint_belowWindowWithWindowNumber(point, 0L)
            val initializedWindow: MemorySegment = window.initWithContentRect_styleMask_backing_defer(
                contentRect,
                styleMask,
                backingStoreType,
                false,
            )
        }
}

object ObjCAppearanceProtocolRequirementProbe {
    @JvmStatic
    fun main(args: Array<String>) {
        ObjCRuntime.autoreleasePool {
            check(NSThread.isMainThread()) { "AppKit probe must run on the native main thread" }
            check(NSAppearance_supportsSecureCoding()) {
                "NSAppearance class property must remain a public top-level binding"
            }
            val application = NSApplication(NSApplication.sharedApplication())
            application.finishLaunching()
            val window = NSWindow(NSWindow(alloc("NSWindow")).init())
            val view = NSView(NSView(alloc("NSView")).init())
            try {
                window.setContentView(view.ptr)
                release(view.ptr)
                val viewAppearance = view.effectiveAppearance()
                val windowAppearance = window.effectiveAppearance()
                assertNotEquals(MemorySegment.NULL, viewAppearance)
                assertNotEquals(MemorySegment.NULL, windowAppearance)
                assertNotEquals(MemorySegment.NULL, NSAppearance(viewAppearance).name())
                assertNotEquals(MemorySegment.NULL, NSAppearance(windowAppearance).name())
            } finally {
                window.close()
            }
        }
    }

    private fun alloc(className: String): MemorySegment =
        ObjCRuntime.msgSend(
            ValueLayout.ADDRESS,
            ObjCRuntime.getClass(className),
            ObjCRuntime.sel("alloc"),
        ) as MemorySegment

    private fun release(instance: MemorySegment) {
        ObjCRuntime.msgSend(null, instance, ObjCRuntime.sel("release"))
    }
}
