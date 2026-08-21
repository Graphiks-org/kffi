package org.graphiks.kffi.objc

import org.junit.jupiter.api.Assumptions.assumeTrue
import java.awt.image.BufferedImage
import java.io.ByteArrayInputStream
import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import javax.imageio.ImageIO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

private const val IMAGE_WIDTH = 128
private const val IMAGE_HEIGHT = 96

private val CG_SIZE_LAYOUT = MemoryLayout.structLayout(
    ValueLayout.JAVA_DOUBLE.withName("width"),
    ValueLayout.JAVA_DOUBLE.withName("height"),
).withName("CGSize")

private val CG_RECT_LAYOUT = MemoryLayout.structLayout(
    MemoryLayout.structLayout(
        ValueLayout.JAVA_DOUBLE.withName("x"),
        ValueLayout.JAVA_DOUBLE.withName("y"),
    ).withName("origin"),
    MemoryLayout.structLayout(
        ValueLayout.JAVA_DOUBLE.withName("width"),
        ValueLayout.JAVA_DOUBLE.withName("height"),
    ).withName("size"),
).withName("CGRect")

class ObjCIntegrationTest {
    @Test
    fun rendersAndCapturesAppKitImage() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "AppKit screenshot integration is macOS-only",
        )
        assumeTrue(
            System.getenv("KFFI_OBJC_INTEGRATION") == "1",
            "Set KFFI_OBJC_INTEGRATION=1 to run the AppKit screenshot integration test",
        )

        val artifactDirectory = integrationArtifactDirectory()
        Files.createDirectories(artifactDirectory)
        val screenshot = artifactDirectory.resolve("screenshot.png")
        val clientLog = artifactDirectory.resolve("client.log")
        Files.deleteIfExists(screenshot)
        Files.deleteIfExists(clientLog)

        ObjCRuntime.autoreleasePool {
            Arena.ofConfined().use { arena ->
                val application = NSApplication(NSApplication.sharedApplication())
                application.finishLaunching()

                val image = createImage(arena)
                image.lockFocusFlipped(true)
                try {
                    fillRect(arena, 0.0, 0.0, IMAGE_WIDTH / 2.0, IMAGE_HEIGHT / 2.0, 1.0, 0.0, 0.0)
                    fillRect(arena, IMAGE_WIDTH / 2.0, 0.0, IMAGE_WIDTH / 2.0, IMAGE_HEIGHT / 2.0, 0.0, 1.0, 0.0)
                    fillRect(arena, 0.0, IMAGE_HEIGHT / 2.0, IMAGE_WIDTH / 2.0, IMAGE_HEIGHT / 2.0, 0.0, 0.0, 1.0)
                    fillRect(arena, IMAGE_WIDTH / 2.0, IMAGE_HEIGHT / 2.0, IMAGE_WIDTH / 2.0, IMAGE_HEIGHT / 2.0, 1.0, 1.0, 0.0)
                } finally {
                    image.unlockFocus()
                }

                val tiffData = image.TIFFRepresentation()
                assertNotEquals(MemorySegment.NULL, tiffData, "NSImage.TIFFRepresentation should return NSData")
                val bitmapRep = NSBitmapImageRep(
                    NSBitmapImageRep.imageRepWithData(tiffData),
                )
                assertNotEquals(MemorySegment.NULL, bitmapRep.ptr, "NSBitmapImageRep should decode the AppKit image")

                // AppKit declares NSBitmapImageFileType as NSInteger. The generated category
                // currently exposes that parameter as MemorySegment, so call the same selector
                // with its native 64-bit scalar representation until kextract maps that typedef.
                val pngData = ObjCRuntime.msgSend(
                    ValueLayout.ADDRESS,
                    bitmapRep.ptr,
                    ObjCRuntime.sel("representationUsingType:properties:"),
                    NSBitmapImageFileType.NSBitmapImageFileTypePNG.value,
                    MemorySegment.NULL,
                ) as MemorySegment
                assertNotEquals(MemorySegment.NULL, pngData, "NSBitmapImageRep should encode PNG data")

                val data = NSData(pngData)
                val pngBytes = data.bytes().reinterpret(data.length()).toArray(ValueLayout.JAVA_BYTE)
                assertTrue(pngBytes.isNotEmpty(), "PNG data should not be empty")
                assertTrue(
                    data.writeToFile_atomically(
                        ObjCRuntime.newNSString(arena, screenshot.toString()),
                        true,
                    ),
                    "NSData should write the PNG artifact",
                )

                val decoded = ImageIO.read(ByteArrayInputStream(pngBytes))
                    ?: error("ImageIO could not decode the AppKit PNG")
                assertEquals(IMAGE_WIDTH, decoded.width)
                assertEquals(IMAGE_HEIGHT, decoded.height)
                assertQuadrantColors(decoded)
                val applicationDescription = ObjCRuntime.toJavaString(
                    ObjCRuntime.msgSend(
                        ValueLayout.ADDRESS,
                        application.ptr,
                        ObjCRuntime.sel("description"),
                    ) as MemorySegment,
                )

                Files.writeString(
                    clientLog,
                    "application=$applicationDescription\n" +
                        "image=${decoded.width}x${decoded.height}\n" +
                        "pngBytes=${pngBytes.size}\n",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                )
            }
        }

        assertTrue(Files.isRegularFile(screenshot), "Expected screenshot artifact at $screenshot")
        assertTrue(Files.size(screenshot) > 0L, "Screenshot artifact should not be empty")
    }

    private fun createImage(arena: Arena): NSImage {
        val image = NSImage(
            ObjCRuntime.msgSend(
                ValueLayout.ADDRESS,
                ObjCRuntime.getClass("NSImage"),
                ObjCRuntime.sel("alloc"),
            ) as MemorySegment,
        )
        val initialized = image.initWithSize(size(arena, IMAGE_WIDTH.toDouble(), IMAGE_HEIGHT.toDouble()))
        assertNotEquals(MemorySegment.NULL, initialized, "NSImage.initWithSize should succeed")
        return NSImage(initialized)
    }

    private fun fillRect(
        arena: Arena,
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        red: Double,
        green: Double,
        blue: Double,
    ) {
        NSColor(
            NSColor.colorWithSRGBRed_green_blue_alpha(red, green, blue, 1.0),
        ).set()
        NSBezierPath.fillRect(rect(arena, x, y, width, height))
    }

    private fun size(arena: Arena, width: Double, height: Double): MemorySegment =
        arena.allocate(CG_SIZE_LAYOUT).also {
            it.set(ValueLayout.JAVA_DOUBLE, 0, width)
            it.set(ValueLayout.JAVA_DOUBLE, 8, height)
        }

    private fun rect(arena: Arena, x: Double, y: Double, width: Double, height: Double): MemorySegment =
        arena.allocate(CG_RECT_LAYOUT).also {
            it.set(ValueLayout.JAVA_DOUBLE, 0, x)
            it.set(ValueLayout.JAVA_DOUBLE, 8, y)
            it.set(ValueLayout.JAVA_DOUBLE, 16, width)
            it.set(ValueLayout.JAVA_DOUBLE, 24, height)
        }

    private fun integrationArtifactDirectory(): Path = Path.of(
        System.getProperty("kffi.objc.defaultArtifactDir")
            ?: System.getenv("KFFI_OBJC_INTEGRATION_ARTIFACT_DIR")
            ?: System.getenv("KFFI_OBJC_ARTIFACT_DIR")
            ?: "kffi-objc/build/objc-integration",
    )

    private fun assertQuadrantColors(image: BufferedImage) {
        assertDominantColor(image, IMAGE_WIDTH / 4, IMAGE_HEIGHT / 4, 0, "top-left quadrant")
        assertDominantColor(image, IMAGE_WIDTH * 3 / 4, IMAGE_HEIGHT / 4, 1, "top-right quadrant")
        assertDominantColor(image, IMAGE_WIDTH / 4, IMAGE_HEIGHT * 3 / 4, 2, "bottom-left quadrant")
        assertDominantColor(image, IMAGE_WIDTH * 3 / 4, IMAGE_HEIGHT * 3 / 4, 3, "bottom-right quadrant")
    }

    private fun assertDominantColor(image: BufferedImage, x: Int, y: Int, expected: Int, label: String) {
        val rgb = image.getRGB(x, y)
        val red = (rgb ushr 16) and 0xFF
        val green = (rgb ushr 8) and 0xFF
        val blue = rgb and 0xFF
        val matches = when (expected) {
            0 -> red >= 180 && green <= 130 && blue <= 130
            1 -> green >= 180 && red <= 130 && blue <= 130
            2 -> blue >= 180 && red <= 130 && green <= 130
            else -> red >= 180 && green >= 180 && blue <= 130
        }
        assertTrue(
            matches,
            "$label should contain its expected dominant color, got #${rgb and 0x00FFFFFF}",
        )
    }
}
