package org.graphiks.kffi.objc

import org.graphiks.kffi.objc.appkit.AppKitScrollWheelEvent
import org.graphiks.kffi.objc.appkit.postScrollWheelEvent
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.io.File
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AppKitScrollWheelEventPostingTest {
    @Test
    fun enqueuesDiscreteAndPreciseScrollEventsInFifoOrder() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "AppKit scroll-wheel posting requires macOS",
        )

        val process = ProcessBuilder(
            File(System.getProperty("java.home"), "bin/java").path,
            "-XstartOnFirstThread",
            "--enable-native-access=ALL-UNNAMED",
            "-cp",
            System.getProperty("java.class.path"),
            AppKitScrollWheelEventPostingProbe::class.java.name,
        ).redirectErrorStream(true).start()
        val output = StringBuilder()
        val outputLock = Any()
        val outputReader = thread(
            start = true,
            isDaemon = true,
            name = "objc-scroll-wheel-probe-output",
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
                "AppKit scroll-wheel probe did not terminate within 5 seconds after destroyForcibly; output:\n${capturedOutput()}",
            )
            outputReader.join(5_000)
            error("AppKit scroll-wheel probe timed out after 30 seconds; output:\n${capturedOutput()}")
        }
        outputReader.join(5_000)
        assertTrue(
            !outputReader.isAlive,
            "AppKit scroll-wheel probe output reader did not finish; output:\n${capturedOutput()}",
        )
        assertEquals(0, process.exitValue(), capturedOutput())
    }
}

object AppKitScrollWheelEventPostingProbe {
    @JvmStatic
    fun main(args: Array<String>) {
        ObjCRuntime.autoreleasePool {
            check(NSThread.isMainThread()) { "AppKit scroll-wheel probe must run on the native main thread" }

            val application = NSApplication(NSApplication.sharedApplication())
            check(
                application.setActivationPolicy(
                    NSApplicationActivationPolicy.NSApplicationActivationPolicyAccessory,
                ),
            ) { "AppKit probe could not select accessory activation policy" }
            application.finishLaunching()

            application.postScrollWheelEvent(
                AppKitScrollWheelEvent(
                    unit = CGScrollEventUnit.kCGScrollEventUnitLine,
                    deltaX = -3.0,
                    deltaY = 7.0,
                    phase = CGScrollPhase.kCGScrollPhaseEnded,
                    momentumPhase = CGMomentumScrollPhase.kCGMomentumScrollPhaseNone,
                    isContinuous = false,
                ),
            )
            application.postScrollWheelEvent(
                AppKitScrollWheelEvent(
                    unit = CGScrollEventUnit.kCGScrollEventUnitPixel,
                    deltaX = 2.5,
                    deltaY = -1.75,
                    phase = CGScrollPhase.kCGScrollPhaseChanged,
                    momentumPhase = CGMomentumScrollPhase.kCGMomentumScrollPhaseContinue,
                    isContinuous = true,
                ),
            )

            val first = application.dequeueScrollWheelEvent()
            val second = application.dequeueScrollWheelEvent()
            application.assertNoAdditionalQueuedScrollWheelEvent()

            assertQueuedScrollWheelEvent(
                event = first,
                expectedDeltaX = -3.0,
                expectedDeltaY = 7.0,
                expectedPrecise = false,
                expectedPhase = NSEventPhase.NSEventPhaseEnded,
                expectedMomentumPhase = NSEventPhase.NSEventPhaseNone,
            )
            assertQueuedScrollWheelEvent(
                event = second,
                expectedDeltaX = 2.5,
                expectedDeltaY = -1.75,
                expectedPrecise = true,
                expectedPhase = NSEventPhase.NSEventPhaseChanged,
                expectedMomentumPhase = NSEventPhase.NSEventPhaseChanged,
            )
        }
    }

    private fun NSApplication.dequeueScrollWheelEvent(): NSEvent {
        val event = nextEventMatchingMask_untilDate_inMode_dequeue(
            NSEventMask.NSEventMaskScrollWheel,
            NSDate_distantFuture(),
            ObjCRuntime.newNSString(Arena.global(), "kCFRunLoopDefaultMode"),
            true,
        )
        check(event != MemorySegment.NULL) { "AppKit queue did not contain a posted scroll-wheel event" }
        return NSEvent(event)
    }

    private fun NSApplication.assertNoAdditionalQueuedScrollWheelEvent() {
        val event = nextEventMatchingMask_untilDate_inMode_dequeue(
            NSEventMask.NSEventMaskScrollWheel,
            NSDate_date(),
            ObjCRuntime.newNSString(Arena.global(), "kCFRunLoopDefaultMode"),
            true,
        )
        check(event == MemorySegment.NULL) {
            "Each post must add exactly one scroll-wheel event to the AppKit queue"
        }
    }

    private fun assertQueuedScrollWheelEvent(
        event: NSEvent,
        expectedDeltaX: Double,
        expectedDeltaY: Double,
        expectedPrecise: Boolean,
        expectedPhase: NSEventPhase,
        expectedMomentumPhase: NSEventPhase,
    ) {
        assertEquals(
            0L,
            event.windowNumber(),
            "CoreGraphics-created scroll-wheel events are application-routed and have no target window",
        )
        assertEquals(NSEventType.NSEventTypeScrollWheel, event.type())
        assertEquals(expectedPrecise, event.hasPreciseScrollingDeltas())
        assertEquals(expectedDeltaX, event.deltaX())
        assertEquals(expectedDeltaY, event.deltaY())
        assertEquals(expectedPhase, event.phase())
        assertEquals(expectedMomentumPhase, event.momentumPhase())
    }
}
