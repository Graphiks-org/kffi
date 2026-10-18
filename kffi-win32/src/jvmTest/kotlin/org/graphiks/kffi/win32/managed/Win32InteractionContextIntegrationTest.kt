package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness
import org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness.Contact
import java.lang.foreign.MemorySegment
import kotlin.math.abs
import kotlin.test.*

class Win32InteractionContextIntegrationTest {
    @BeforeTest fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
        Win32InjectedTouchHarness.resetTrace()
    }

    @Test fun realWindowsRecognizerEmitsManipulationAndDoubleTap() {
        val outputs = mutableListOf<Win32InteractionOutput>()
        val firstFrames = mutableListOf<String>()
        var lastManipulationFrame: Int? = null
        Win32ManagedWindow.open("interaction-native") { h, m, w, l -> DefWindowProcW(MemorySegment.ofAddress(h), m, w, l) }.use { window ->
            Win32InteractionContext.open(4, onOutput = outputs::add).use { context ->
                assertEquals(Win32InteractionConfiguration(true, true, true, true, true), context.configuration)
                Win32InjectedTouchHarness.run(onFrame = { batch ->
                    lastManipulationFrame = batch.frames.first().frameId
                    if (firstFrames.size < 6) firstFrames += batch.frames.joinToString { f -> "${f.frameId}:" + f.pointers.joinToString { p -> "${p.id}/${p.flags.toUInt().toString(16)}" } }
                    context.process(batch)
                }) {
                    frame(Contact(0, 100, 200, DOWN))
                    frame(Contact(0, 100, 200, MOVE), Contact(1, 200, 200, DOWN))
                    repeat(8) { index -> frame(Contact(0, 105 + index * 5, 205 + index * 5, MOVE), Contact(1, 205 + index * 5, 205 + index * 5, MOVE)) }
                    repeat(8) { index -> frame(Contact(0, 140, 240, MOVE), Contact(1, 245 + index * 5, 240 + index * 5, MOVE)) }
                    frame(Contact(0, 140, 240, UP), Contact(1, 280, 275, UP))
                }
                val manipulations = outputs.filter { it.interactionId == 1 }
                assertTrue(manipulations.any { abs(it.translationX ?: 0.0) > 0.01 }, "No native translation: $outputs")
                assertTrue(manipulations.any { abs((it.scale ?: 1.0) - 1.0) > 0.001 }, "No native scaling; starts=$firstFrames outputs=$outputs")
                assertTrue(manipulations.any { abs(it.rotationRadians ?: 0.0) > 0.001 }, "No native rotation: $outputs")
                assertTrue(manipulations.any { it.flags and 1 != 0 })
                assertTrue(manipulations.any { it.flags and 2 != 0 })
                // Native deltas must be pixels; a HIMETRIC interpretation would be orders of magnitude larger.
                assertTrue(manipulations.all { abs(it.translationX ?: 0.0) < 100.0 && abs(it.translationY ?: 0.0) < 100.0 })
                assertTrue(outputs.all { it.flags and 8 == 0 }, "Inertia was not configured")
                context.reset()
                val tapFrames = mutableListOf<String>()
                Win32InjectedTouchHarness.run(onFrame = { batch ->
                    if (tapFrames.size < 32) tapFrames += describe(batch)
                    context.process(batch)
                }) {
                    frame(Contact(0, 300, 300, DOWN)); frame(Contact(0, 300, 300, UP))
                    frame(Contact(0, 300, 300, DOWN)); frame(Contact(0, 300, 300, UP))
                }
                assertTrue(outputs.any { it.interactionId == 2 && it.tapCount == 2 }, "No Windows double tap: beforeReset=$lastManipulationFrame frames=$tapFrames outputs=$outputs trace=${Win32InjectedTouchHarness.traceSnapshot()}")
            }
        }
    }

    @Test fun closeDuringOutputDefersNativeDestruction() {
        lateinit var context: Win32InteractionContext
        var delivered = 0
        val frames = mutableListOf<String>()
        context = Win32InteractionContext.open(2) {
            delivered++
            context.close()
            assertFalse(context.nativeClosed, "DestroyInteractionContext must wait until native processing returns")
        }
        context.use {
            Win32InjectedTouchHarness.run(onFrame = {
                if (frames.size < 32) frames += describe(it)
                if(!context.nativeClosed) context.process(it)
            }) {
                frame(Contact(0, 100, 100, DOWN))
                repeat(10) { index -> frame(Contact(0, 120 + index * 20, 100, MOVE)) }
                frame(Contact(0, 300, 100, UP))
            }
            assertTrue(delivered > 0, "Native callback was not reached: frames=$frames closed=${context.nativeClosed} trace=${Win32InjectedTouchHarness.traceSnapshot()}")
            assertTrue(context.nativeClosed)
        }
    }

    @Test fun aFreshWindowsContextRecognizesTwoNativeTaps() {
        val outputs = mutableListOf<Win32InteractionOutput>()
        val frames = mutableListOf<String>()
        Win32InteractionContext.open(2, onOutput=outputs::add).use { context ->
            Win32InjectedTouchHarness.run(onFrame = {
                if (frames.size < 32) frames += describe(it)
                context.process(it)
            }) {
                frame(Contact(0, 300, 300, DOWN)); frame(Contact(0, 300, 300, UP))
                frame(Contact(0, 300, 300, DOWN)); frame(Contact(0, 300, 300, UP))
            }
            assertTrue(outputs.any { it.interactionId == 2 && it.tapCount == 2 }, "Native taps: frames=$frames outputs=$outputs trace=${Win32InjectedTouchHarness.traceSnapshot()}")
        }
    }

    @Test fun workerCloseRevokesAndReapsOnTheOwnerThread() {
        val context = Win32InteractionContext.open(2) { error("No callback is expected without frames") }
        Thread { context.close() }.apply { start(); join() }
        assertFalse(context.nativeClosed)
        Win32ControlWindow.open { _, _, _, _ -> 0 }.use { pump ->
            val deadline = System.nanoTime() + 5_000_000_000L
            while (!context.nativeClosed && System.nanoTime() < deadline) pump.pollOne(1)
        }
        assertTrue(context.nativeClosed)
        context.close()
    }

    companion object {
        private fun describe(batch: Win32PointerBatch) = batch.frames.joinToString { frame ->
            "frame=${frame.frameId}:" + frame.pointers.joinToString { pointer ->
                "id=${pointer.id}/flags=${pointer.flags.toUInt().toString(16)}/time=${pointer.time}/qpc=${pointer.performanceCount}/history=${pointer.historyCount}"
            }
        }
        private const val DOWN = 0x10006
        private const val MOVE = 0x20006
        private const val UP = 0x40000
    }
}
