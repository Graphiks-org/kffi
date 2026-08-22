package org.graphiks.kffi.win32

import org.graphiks.kffi.win32.generated.BitBlt
import org.graphiks.kffi.win32.generated.CreateCompatibleBitmap
import org.graphiks.kffi.win32.generated.CreateCompatibleDC
import org.graphiks.kffi.win32.generated.CreateSolidBrush
import org.graphiks.kffi.win32.generated.CreateWindowExW
import org.graphiks.kffi.win32.generated.DeleteDC
import org.graphiks.kffi.win32.generated.DeleteObject
import org.graphiks.kffi.win32.generated.DestroyWindow
import org.graphiks.kffi.win32.generated.FillRect
import org.graphiks.kffi.win32.generated.GetClientRect
import org.graphiks.kffi.win32.generated.GetDC
import org.graphiks.kffi.win32.generated.GetDIBits
import org.graphiks.kffi.win32.generated.ReleaseDC
import org.graphiks.kffi.win32.generated.SelectObject
import org.graphiks.kffi.win32.generated.ShowWindow
import org.graphiks.kffi.win32.generated.UpdateWindow
import org.graphiks.kffi.win32.generated.init
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.awt.image.BufferedImage
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.nio.file.Files
import java.nio.file.Path
import javax.imageio.ImageIO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

private const val SURFACE_WIDTH = 320
private const val SURFACE_HEIGHT = 240
private const val RECT_SIZE = 16L
private const val BITMAP_INFO_SIZE = 40L
private const val WS_POPUP = -0x80000000
private const val SW_SHOWNORMAL = 1
private const val BI_RGB = 0
private const val DIB_RGB_COLORS = 0
private const val SRCCOPY = 0x00CC0020

private const val RED_BRUSH = 0x000000FF
private const val GREEN_BRUSH = 0x0000FF00
private const val BLUE_BRUSH = 0x00FF0000
private const val YELLOW_BRUSH = 0x0000FFFF

private data class Rgb(val red: Int, val green: Int, val blue: Int)

private val TOP_LEFT = Rgb(255, 0, 0)
private val TOP_RIGHT = Rgb(0, 255, 0)
private val BOTTOM_LEFT = Rgb(0, 0, 255)
private val BOTTOM_RIGHT = Rgb(255, 255, 0)

class Win32WindowIntegrationTest {
    @Test
    fun createsWindowAndCapturesPaintedQuadrants() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Windows") == true,
            "Win32 integration tests require Windows",
        )
        assumeTrue(
            System.getenv("KFFI_WIN32_INTEGRATION") == "1",
            "Set KFFI_WIN32_INTEGRATION=1 to run the window screenshot integration test",
        )

        init()
        val artifactDirectory = integrationArtifactDirectory()
        Files.createDirectories(artifactDirectory)
        val screenshot = artifactDirectory.resolve("screenshot.png")
        Files.deleteIfExists(screenshot)

        Arena.ofConfined().use { arena ->
            var window = MemorySegment.NULL
            try {
                window = CreateWindowExW(
                    0,
                    wideString(arena, "STATIC"),
                    wideString(arena, "kffi Win32 integration"),
                    WS_POPUP,
                    80,
                    80,
                    SURFACE_WIDTH,
                    SURFACE_HEIGHT,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                )
                assertNotEquals(0L, window.address(), "CreateWindowExW must return a window handle")

                ShowWindow(window, SW_SHOWNORMAL)
                UpdateWindow(window)
                paintQuadrants(window, arena)

                val image = captureClient(window, arena)
                assertEquals(SURFACE_WIDTH, image.width)
                assertEquals(SURFACE_HEIGHT, image.height)
                assertQuadrants(image)
                assertTrue(ImageIO.write(image, "png", screenshot.toFile()))
            } finally {
                if (window.address() != 0L) {
                    DestroyWindow(window)
                }
            }
        }

        assertTrue(Files.isRegularFile(screenshot), "Expected screenshot artifact at $screenshot")
        assertTrue(Files.size(screenshot) > 0L, "Screenshot artifact should not be empty")
    }

    private fun paintQuadrants(window: MemorySegment, arena: Arena) {
        val clientRect = arena.allocate(RECT_SIZE, 4)
        assertNotEquals(0, GetClientRect(window, clientRect), "GetClientRect must succeed")
        val width = clientRect.get(ValueLayout.JAVA_INT, 8L)
        val height = clientRect.get(ValueLayout.JAVA_INT, 12L)
        assertEquals(SURFACE_WIDTH, width)
        assertEquals(SURFACE_HEIGHT, height)

        val deviceContext = GetDC(window)
        assertNotEquals(0L, deviceContext.address(), "GetDC must return a device context")
        try {
            fillRect(deviceContext, arena, 0, 0, width / 2, height / 2, RED_BRUSH)
            fillRect(deviceContext, arena, width / 2, 0, width, height / 2, GREEN_BRUSH)
            fillRect(deviceContext, arena, 0, height / 2, width / 2, height, BLUE_BRUSH)
            fillRect(deviceContext, arena, width / 2, height / 2, width, height, YELLOW_BRUSH)
        } finally {
            assertEquals(1, ReleaseDC(window, deviceContext), "ReleaseDC must release the window context")
        }
    }

    private fun fillRect(
        deviceContext: MemorySegment,
        arena: Arena,
        left: Int,
        top: Int,
        right: Int,
        bottom: Int,
        color: Int,
    ) {
        val rect = arena.allocate(RECT_SIZE, 4)
        rect.set(ValueLayout.JAVA_INT, 0L, left)
        rect.set(ValueLayout.JAVA_INT, 4L, top)
        rect.set(ValueLayout.JAVA_INT, 8L, right)
        rect.set(ValueLayout.JAVA_INT, 12L, bottom)

        val brush = CreateSolidBrush(color)
        assertNotEquals(0L, brush.address(), "CreateSolidBrush must return a brush")
        try {
            assertNotEquals(0, FillRect(deviceContext, rect, brush), "FillRect must paint the quadrant")
        } finally {
            assertNotEquals(0, DeleteObject(brush), "DeleteObject must release the brush")
        }
    }

    private fun captureClient(window: MemorySegment, arena: Arena): BufferedImage {
        val clientRect = arena.allocate(RECT_SIZE, 4)
        assertNotEquals(0, GetClientRect(window, clientRect), "GetClientRect must succeed")
        val width = clientRect.get(ValueLayout.JAVA_INT, 8L)
        val height = clientRect.get(ValueLayout.JAVA_INT, 12L)

        val sourceContext = GetDC(window)
        assertNotEquals(0L, sourceContext.address(), "GetDC must return a device context for capture")
        var memoryContext = MemorySegment.NULL
        var bitmap = MemorySegment.NULL
        var previousBitmap = MemorySegment.NULL
        try {
            memoryContext = CreateCompatibleDC(sourceContext)
            assertNotEquals(0L, memoryContext.address(), "CreateCompatibleDC must succeed")
            bitmap = CreateCompatibleBitmap(sourceContext, width, height)
            assertNotEquals(0L, bitmap.address(), "CreateCompatibleBitmap must succeed")
            previousBitmap = SelectObject(memoryContext, bitmap)
            assertNotEquals(0L, previousBitmap.address(), "SelectObject must select the capture bitmap")
            assertNotEquals(
                0,
                BitBlt(memoryContext, 0, 0, width, height, sourceContext, 0, 0, SRCCOPY),
                "BitBlt must copy the window pixels",
            )
            assertNotEquals(
                0L,
                SelectObject(memoryContext, previousBitmap).address(),
                "SelectObject must deselect the capture bitmap before GetDIBits",
            )
            previousBitmap = MemorySegment.NULL

            val bitmapInfo = arena.allocate(BITMAP_INFO_SIZE, 4)
            bitmapInfo.set(ValueLayout.JAVA_INT, 0L, BITMAP_INFO_SIZE.toInt())
            bitmapInfo.set(ValueLayout.JAVA_INT, 4L, width)
            bitmapInfo.set(ValueLayout.JAVA_INT, 8L, -height)
            bitmapInfo.set(ValueLayout.JAVA_SHORT, 12L, 1.toShort())
            bitmapInfo.set(ValueLayout.JAVA_SHORT, 14L, 32.toShort())
            bitmapInfo.set(ValueLayout.JAVA_INT, 16L, BI_RGB)

            val pixels = arena.allocate(width.toLong() * height.toLong() * 4L, 4)
            assertEquals(
                height,
                GetDIBits(sourceContext, bitmap, 0, height, pixels, bitmapInfo, DIB_RGB_COLORS),
                "GetDIBits must return every captured scanline",
            )
            return imageFromPixels(pixels, width, height)
        } finally {
            if (previousBitmap.address() != 0L) SelectObject(memoryContext, previousBitmap)
            if (bitmap.address() != 0L) DeleteObject(bitmap)
            if (memoryContext.address() != 0L) DeleteDC(memoryContext)
            assertEquals(1, ReleaseDC(window, sourceContext), "ReleaseDC must release the capture context")
        }
    }

    private fun imageFromPixels(pixels: MemorySegment, width: Int, height: Int): BufferedImage {
        val image = BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)
        for (y in 0 until height) {
            for (x in 0 until width) {
                val offset = (y.toLong() * width + x) * 4L
                val blue = pixels.get(ValueLayout.JAVA_BYTE, offset).toInt() and 0xff
                val green = pixels.get(ValueLayout.JAVA_BYTE, offset + 1L).toInt() and 0xff
                val red = pixels.get(ValueLayout.JAVA_BYTE, offset + 2L).toInt() and 0xff
                image.setRGB(x, y, (0xff shl 24) or (red shl 16) or (green shl 8) or blue)
            }
        }
        return image
    }

    private fun assertQuadrants(image: BufferedImage) {
        assertPixel(image, image.width / 4, image.height / 4, TOP_LEFT)
        assertPixel(image, image.width * 3 / 4, image.height / 4, TOP_RIGHT)
        assertPixel(image, image.width / 4, image.height * 3 / 4, BOTTOM_LEFT)
        assertPixel(image, image.width * 3 / 4, image.height * 3 / 4, BOTTOM_RIGHT)
    }

    private fun assertPixel(image: BufferedImage, x: Int, y: Int, expected: Rgb) {
        val actual = image.getRGB(x, y)
        assertEquals(expected.red, actual shr 16 and 0xff, "Unexpected red channel at ($x, $y)")
        assertEquals(expected.green, actual shr 8 and 0xff, "Unexpected green channel at ($x, $y)")
        assertEquals(expected.blue, actual and 0xff, "Unexpected blue channel at ($x, $y)")
    }

    private fun wideString(arena: Arena, value: String): MemorySegment {
        val result = arena.allocate((value.length + 1L) * ValueLayout.JAVA_CHAR.byteSize(), ValueLayout.JAVA_CHAR.byteAlignment())
        value.forEachIndexed { index, character ->
            result.set(ValueLayout.JAVA_CHAR, index.toLong() * ValueLayout.JAVA_CHAR.byteSize(), character)
        }
        result.set(ValueLayout.JAVA_CHAR, value.length.toLong() * ValueLayout.JAVA_CHAR.byteSize(), '\u0000')
        return result
    }

    private fun integrationArtifactDirectory(): Path =
        System.getenv("KFFI_WIN32_ARTIFACT_DIR")
            ?.takeIf(String::isNotBlank)
            ?.let(Path::of)
            ?: System.getProperty("kffi.win32.defaultArtifactDir")
                ?.takeIf(String::isNotBlank)
                ?.let(Path::of)
            ?: Path.of("kffi-win32/build/win32-integration")
}
