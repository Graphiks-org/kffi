package org.graphiks.kffi.objc.appkit

import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs

class AppKitWindowGeometryServicesTest {
    @Test
    fun setOuterPositionTransformsCoreGraphicsPixelsThenReturnsWindowServerReadback() {
        val native = WindowGeometryFixture(
            screen = AppKitWindowGeometryScreen(
                displayId = 17,
                coreGraphicsBounds = CGDisplayBoundsSnapshot(-3000.0, 0.0, 3000.0, 2000.0),
                appKitFrame = CGDisplayBoundsSnapshot(-1500.0, 300.0, 1500.0, 1000.0),
                backingScaleFactor = 2.0,
            ),
            bounds = WindowOuterBoundsSnapshot(-2500.0, 400.0, 1300.0, 900.0),
        )

        val result = AppKitWindowGeometryServices.setOuterPosition(
            window = WINDOW,
            x = -2500,
            y = 400,
            native = native,
        )

        assertEquals(
            AppKitWindowGeometrySetResult.Moved(
                WindowOuterBoundsSnapshot(-2500.0, 400.0, 1300.0, 900.0),
            ),
            result,
        )
        assertEquals(
            listOf(
                "display-at:-2500.0,400.0",
                "screen:17",
                "set-top-left:-1250.0,1100.0",
                "read:99",
            ),
            native.calls,
        )
    }

    @Test
    fun gapInCoreGraphicsDesktopRejectsBeforeMutatingTheWindow() {
        val native = WindowGeometryFixture(screen = null)

        val result = AppKitWindowGeometryServices.setOuterPosition(
            window = WINDOW,
            x = 4800,
            y = -260,
            native = native,
        )

        assertEquals(AppKitWindowGeometrySetResult.Unmappable, result)
        assertEquals(listOf("display-at:4800.0,-260.0"), native.calls)
    }

    @Test
    fun setterNeverEchoesTheRequestedPositionWhenTheWindowServerCannotCertifyIt() {
        val native = WindowGeometryFixture(bounds = null)

        val result = AppKitWindowGeometryServices.setOuterPosition(
            window = WINDOW,
            x = 800,
            y = 600,
            native = native,
        )

        assertEquals(AppKitWindowGeometrySetResult.ReadbackUnavailable, result)
        assertEquals(
            listOf(
                "display-at:800.0,600.0",
                "screen:17",
                "set-top-left:800.0,480.0",
                "read:99",
            ),
            native.calls,
        )
    }

    @Test
    fun readOuterBoundsPreservesAWindowThatStraddlesDisplaysWithoutApplyingScaleAgain() {
        val native = WindowGeometryFixture(
            bounds = WindowOuterBoundsSnapshot(-200.0, 80.0, 1400.0, 900.0),
        )

        val result = AppKitWindowGeometryServices.readOuterBounds(WINDOW, native)

        assertEquals(
            AppKitWindowGeometryReadResult.Read(
                WindowOuterBoundsSnapshot(-200.0, 80.0, 1400.0, 900.0),
            ),
            result,
        )
        assertEquals(listOf("read:99"), native.calls)
    }

    @Test
    fun publicResultsNeverExposeNativePointers() {
        assertFalse(WindowOuterBoundsSnapshot::class.java.declaredFields.any { it.type == MemorySegment::class.java })
    }
}

private const val WINDOW = 0x44L

private class WindowGeometryFixture(
    private val screen: AppKitWindowGeometryScreen? = AppKitWindowGeometryScreen(
        displayId = 17,
        coreGraphicsBounds = CGDisplayBoundsSnapshot(0.0, 0.0, 1920.0, 1080.0),
        appKitFrame = CGDisplayBoundsSnapshot(0.0, 0.0, 1920.0, 1080.0),
        backingScaleFactor = 1.0,
    ),
    private val bounds: WindowOuterBoundsSnapshot? = WindowOuterBoundsSnapshot(0.0, 0.0, 800.0, 600.0),
) : AppKitWindowGeometryNative {
    val calls = mutableListOf<String>()

    override fun isMacOs26OrLater(): Boolean = true

    override fun isMainThread(): Boolean = true

    override fun windowNumber(window: Long): Long {
        check(window == WINDOW)
        return 99L
    }

    override fun displayAt(x: Double, y: Double): Int? {
        calls += "display-at:$x,$y"
        return screen?.displayId
    }

    override fun screen(displayId: Int): AppKitWindowGeometryScreen? {
        calls += "screen:$displayId"
        return screen?.takeIf { it.displayId == displayId }
    }

    override fun setFrameTopLeft(window: Long, x: Double, y: Double) {
        check(window == WINDOW)
        calls += "set-top-left:$x,$y"
    }

    override fun readOuterBounds(windowNumber: Long): WindowOuterBoundsSnapshot? {
        calls += "read:$windowNumber"
        return bounds
    }
}
