package org.graphiks.kffi.x11

import org.graphiks.kffi.x11.generated.AllPlanes
import org.graphiks.kffi.x11.generated.ClientMessage
import org.graphiks.kffi.x11.generated.ConfigureNotify
import org.graphiks.kffi.x11.generated.CWOverrideRedirect
import org.graphiks.kffi.x11.generated.Expose
import org.graphiks.kffi.x11.generated.ExposureMask
import org.graphiks.kffi.x11.generated.IsViewable
import org.graphiks.kffi.x11.generated.KffiXEventStorage
import org.graphiks.kffi.x11.generated.SelectionNotify
import org.graphiks.kffi.x11.generated.StructureNotifyMask
import org.graphiks.kffi.x11.generated.XAllocNamedColor
import org.graphiks.kffi.x11.generated.XChangeWindowAttributes
import org.graphiks.kffi.x11.generated.XClientMessageEvent
import org.graphiks.kffi.x11.generated.XCloseDisplay
import org.graphiks.kffi.x11.generated.XCloseIM
import org.graphiks.kffi.x11.generated.XConnectionNumber
import org.graphiks.kffi.x11.generated.XColor
import org.graphiks.kffi.x11.generated.XCreateColormap
import org.graphiks.kffi.x11.generated.XCreateGC
import org.graphiks.kffi.x11.generated.XCreateIC
import org.graphiks.kffi.x11.generated.XCreateSimpleWindow
import org.graphiks.kffi.x11.generated.XDefaultDepth
import org.graphiks.kffi.x11.generated.XDefaultRootWindow
import org.graphiks.kffi.x11.generated.XDefaultScreen
import org.graphiks.kffi.x11.generated.XDefaultVisual
import org.graphiks.kffi.x11.generated.XDestroyIC
import org.graphiks.kffi.x11.generated.XDestroyImage
import org.graphiks.kffi.x11.generated.XDestroyWindow
import org.graphiks.kffi.x11.generated.XFillRectangle
import org.graphiks.kffi.x11.generated.XFlush
import org.graphiks.kffi.x11.generated.XFreeColormap
import org.graphiks.kffi.x11.generated.XFreeGC
import org.graphiks.kffi.x11.generated.XGetImage
import org.graphiks.kffi.x11.generated.XGetWindowAttributes
import org.graphiks.kffi.x11.generated.XImage
import org.graphiks.kffi.x11.generated.XIMPreeditNothing
import org.graphiks.kffi.x11.generated.XIMStatusNothing
import org.graphiks.kffi.x11.generated.XInternAtom
import org.graphiks.kffi.x11.generated.XMapWindow
import org.graphiks.kffi.x11.generated.XNextEvent
import org.graphiks.kffi.x11.generated.XOpenDisplay
import org.graphiks.kffi.x11.generated.XOpenIM
import org.graphiks.kffi.x11.generated.XPending
import org.graphiks.kffi.x11.generated.XPoint
import org.graphiks.kffi.x11.generated.XResizeWindow
import org.graphiks.kffi.x11.generated.XSelectInput
import org.graphiks.kffi.x11.generated.XSelectionEvent
import org.graphiks.kffi.x11.generated.XSendEvent
import org.graphiks.kffi.x11.generated.XSetForeground
import org.graphiks.kffi.x11.generated.XSetICValues
import org.graphiks.kffi.x11.generated.XSetWindowAttributes
import org.graphiks.kffi.x11.generated.XShmCreateImage
import org.graphiks.kffi.x11.generated.XShmQueryExtension
import org.graphiks.kffi.x11.generated.XShmSegmentInfoCompat
import org.graphiks.kffi.x11.generated.XSync
import org.graphiks.kffi.x11.generated.XWindowAttributes
import org.graphiks.kffi.x11.generated.XNClientWindow
import org.graphiks.kffi.x11.generated.XNFocusWindow
import org.graphiks.kffi.x11.generated.XNInputStyle
import org.graphiks.kffi.x11.generated.XSHM_ZPIXMAP
import org.graphiks.kffi.x11.generated.ZPixmap
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.awt.image.BufferedImage
import java.io.File
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.nio.ByteOrder
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.concurrent.TimeUnit
import javax.imageio.ImageIO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.fail

private const val WINDOW_WIDTH = 96
private const val WINDOW_HEIGHT = 64
private const val EVENT_TIMEOUT_MILLIS = 10_000L
private const val CAPTURE_TIMEOUT_SECONDS = 15L

private data class ColoredRectangle(
    val name: String,
    val x: Int,
    val y: Int,
    val width: Int,
    val height: Int,
    val expectedRgb: Int,
)

private val COLORED_RECTANGLES = listOf(
    ColoredRectangle("red", 0, 0, WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2, 0xFF0000),
    ColoredRectangle("green", WINDOW_WIDTH / 2, 0, WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2, 0x00FF00),
    ColoredRectangle("blue", 0, WINDOW_HEIGHT / 2, WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2, 0x0000FF),
    ColoredRectangle("yellow", WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2, WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2, 0xFFFF00),
)

private data class X11IntegrationEnvironment(
    val displayName: String,
    val artifactDirectory: Path,
)

private data class ObservedEvents(
    val sawExpose: Boolean,
    val sawConfigureNotify: Boolean,
)

private data class CaptureStatuses(
    val shellExit: Int,
    val xwdExit: Int,
    val convertExit: Int,
)

class X11IntegrationTest {
    @Test
    fun createsMapsProcessesAndCapturesWindow() {
        assumeTrue(
            System.getProperty("os.name").lowercase().contains("linux"),
            "X11 screenshot integration is Linux-only",
        )
        assumeTrue(
            System.getenv("KFFI_X11_INTEGRATION") == "1",
            "Set KFFI_X11_INTEGRATION=1 to run the X11 screenshot integration test",
        )

        val environment = requireIntegrationEnvironment()
        requireExecutable("xwd")
        requireExecutable("convert")

        Files.createDirectories(environment.artifactDirectory)
        val windowPng = environment.artifactDirectory.resolve("window.png")
        val clientLog = environment.artifactDirectory.resolve("client.log")
        val captureLog = environment.artifactDirectory.resolve("capture.log")
        Files.deleteIfExists(windowPng)
        Files.deleteIfExists(clientLog)
        Files.deleteIfExists(captureLog)
        appendLog(clientLog, "DISPLAY=${environment.displayName}\n")

        Arena.ofConfined().use { arena ->
            val eventStorage = KffiXEventStorage()
            val clientMessageBinding = XClientMessageEvent()
            val selectionEventBinding = XSelectionEvent()
            val imageBinding = XImage()
            val setWindowAttributesBinding = XSetWindowAttributes()
            val windowAttributesBinding = XWindowAttributes()
            val event = KffiXEventStorage.allocate(arena)
            val displayName = arena.allocateFrom(environment.displayName)
            var display = MemorySegment.NULL
            var window = 0L
            var colormap = 0L
            var gc = MemorySegment.NULL
            var image: MemorySegment? = null
            var primaryFailure: Throwable? = null

            try {
                display = XOpenDisplay(displayName)
                assertNativePointer(display, "XOpenDisplay(${environment.displayName})")

                val connectionNumber = XConnectionNumber(display)
                assertTrue(connectionNumber >= 0, "XConnectionNumber should be non-negative, got $connectionNumber")
                val defaultScreen = XDefaultScreen(display)
                assertTrue(defaultScreen >= 0, "XDefaultScreen should be non-negative, got $defaultScreen")
                val rootWindow = XDefaultRootWindow(display)
                assertTrue(rootWindow != 0L, "XDefaultRootWindow should be non-zero")

                appendLog(
                    clientLog,
                    "connection=$connectionNumber screen=$defaultScreen root=0x${rootWindow.toString(16)}\n",
                )

                window = XCreateSimpleWindow(
                    display,
                    rootWindow,
                    0,
                    0,
                    WINDOW_WIDTH,
                    WINDOW_HEIGHT,
                    0,
                    0L,
                    0L,
                )
                assertTrue(window != 0L, "XCreateSimpleWindow should return a non-zero window id")
                appendLog(clientLog, "window=0x${window.toString(16)}\n")

                val setWindowAttributes = XSetWindowAttributes.allocate(arena)
                setWindowAttributesBinding.override_redirect(setWindowAttributes, 1)
                assertEquals(
                    1,
                    XChangeWindowAttributes(display, window, CWOverrideRedirect(), setWindowAttributes),
                    "XChangeWindowAttributes should accept generated XSetWindowAttributes",
                )

                assertEquals(
                    1,
                    XSelectInput(display, window, ExposureMask() or StructureNotifyMask()),
                    "XSelectInput should succeed",
                )
                assertEquals(1, XMapWindow(display, window), "XMapWindow should succeed")
                assertEquals(1, XFlush(display), "XFlush should succeed")
                XSync(display, 0)
                appendLog(clientLog, "window mapped and flushed\n")

                val windowAttributes = XWindowAttributes.allocate(arena)
                assertEquals(
                    1,
                    XGetWindowAttributes(display, window, windowAttributes),
                    "XGetWindowAttributes should fill generated XWindowAttributes",
                )
                assertEquals(1, windowAttributesBinding.override_redirect(windowAttributes))
                assertEquals(IsViewable(), windowAttributesBinding.map_state(windowAttributes))

                assertEquals(1, XResizeWindow(display, window, WINDOW_WIDTH + 1, WINDOW_HEIGHT + 1))
                assertEquals(1, XResizeWindow(display, window, WINDOW_WIDTH, WINDOW_HEIGHT))
                assertEquals(1, XFlush(display), "XFlush after resize should succeed")
                XSync(display, 0)
                appendLog(clientLog, "window resized before polling\n")

                val observedEvents = waitForEvents(display, event, eventStorage, clientLog)
                assertTrue(observedEvents.sawExpose, "Expected Expose after mapping the child window")
                assertTrue(
                    observedEvents.sawConfigureNotify,
                    "Expected ConfigureNotify after resizing the child window",
                )

                val visual = XDefaultVisual(display, defaultScreen)
                assertNativePointer(visual, "XDefaultVisual")
                val defaultDepth = XDefaultDepth(display, defaultScreen)
                assertTrue(defaultDepth > 0, "XDefaultDepth should be positive")
                colormap = XCreateColormap(display, rootWindow, visual, 0)
                assertTrue(colormap != 0L, "XCreateColormap should return a non-zero colormap id")
                gc = XCreateGC(display, window, 0L, MemorySegment.NULL)
                assertNativePointer(gc, "XCreateGC")

                val colorStorage = XColor()
                val expectedPixels = mutableMapOf<String, Long>()
                COLORED_RECTANGLES.forEach { rectangle ->
                    val colorName = arena.allocateFrom(rectangle.name)
                    val screenColor = XColor.allocate(arena)
                    val exactColor = XColor.allocate(arena)
                    assertEquals(
                        1,
                        XAllocNamedColor(display, colormap, colorName, screenColor, exactColor),
                        "XAllocNamedColor should resolve ${rectangle.name}",
                    )
                    val pixel = colorStorage.pixel(screenColor)
                    expectedPixels[rectangle.name] = pixel
                    assertEquals(
                        1,
                        XSetForeground(display, gc, pixel),
                        "XSetForeground should accept ${rectangle.name}",
                    )
                    assertEquals(
                        1,
                        XFillRectangle(display, window, gc, rectangle.x, rectangle.y, rectangle.width, rectangle.height),
                        "XFillRectangle should draw ${rectangle.name}",
                    )
                }
                assertEquals(1, XFlush(display), "XFlush after drawing should succeed")
                XSync(display, 0)
                appendLog(clientLog, "drew four colored rectangles\n")

                image = XGetImage(display, window, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, AllPlanes(), ZPixmap())
                assertNativePointer(image, "XGetImage")
                val capturedImage = XImage.reinterpret(image)
                assertEquals(ZPixmap(), imageBinding.format(capturedImage))
                val bytesPerLine = imageBinding.bytes_per_line(capturedImage)
                val bitsPerPixel = imageBinding.bits_per_pixel(capturedImage)
                assertTrue(bytesPerLine >= WINDOW_WIDTH * 4, "XImage bytes_per_line should cover 32-bit pixels")
                assertEquals(32, bitsPerPixel, "Xvfb should expose 32-bit ZPixmap pixels")
                val imageData = imageBinding.data(capturedImage)
                assertNativePointer(imageData, "XImage.data")
                val imageByteOrder = if (imageBinding.byte_order(capturedImage) == 0) {
                    ByteOrder.LITTLE_ENDIAN
                } else {
                    ByteOrder.BIG_ENDIAN
                }
                val pixels = imageData.reinterpret(bytesPerLine.toLong() * WINDOW_HEIGHT)
                val pixelLayout = ValueLayout.JAVA_INT.withOrder(imageByteOrder)
                COLORED_RECTANGLES.forEach { rectangle ->
                    val x = rectangle.x + rectangle.width / 2
                    val y = rectangle.y + rectangle.height / 2
                    val actualPixel = pixels.get(pixelLayout, y.toLong() * bytesPerLine + x.toLong() * 4)
                    assertEquals(
                        expectedPixels.getValue(rectangle.name).toInt(),
                        actualPixel,
                        "generated XImage accessor pixel mismatch for ${rectangle.name}",
                    )
                }
                appendLog(clientLog, "XGetImage succeeded\n")
                assertEquals(1, XDestroyImage(image), "XDestroyImage should succeed")
                image = null

                verifyXShmImagePath(
                    display = display,
                    visual = visual,
                    depth = defaultDepth,
                    arena = arena,
                    imageBinding = imageBinding,
                    clientLog = clientLog,
                )

                verifySyntheticEvents(
                    display = display,
                    window = window,
                    event = event,
                    eventStorage = eventStorage,
                    clientMessageBinding = clientMessageBinding,
                    selectionEventBinding = selectionEventBinding,
                    arena = arena,
                    clientLog = clientLog,
                )

                val captureStatuses = captureWindow(window, windowPng, captureLog)
                assertEquals(0, captureStatuses.shellExit, "capture shell pipeline should exit zero")
                assertEquals(0, captureStatuses.xwdExit, "xwd should exit zero")
                assertEquals(0, captureStatuses.convertExit, "convert should exit zero")

                val bufferedImage = ImageIO.read(windowPng.toFile())
                    ?: fail("ImageIO could not decode the captured PNG at $windowPng")
                assertEquals(WINDOW_WIDTH, bufferedImage.width, "captured PNG width mismatch")
                assertEquals(WINDOW_HEIGHT, bufferedImage.height, "captured PNG height mismatch")
                COLORED_RECTANGLES.forEach { rectangle ->
                    assertPixelColor(
                        bufferedImage,
                        rectangle.x + rectangle.width / 2,
                        rectangle.y + rectangle.height / 2,
                        rectangle.expectedRgb,
                        rectangle.name,
                    )
                }
                assertTrue(Files.exists(clientLog), "client.log should be retained under ${environment.artifactDirectory}")
                assertTrue(Files.exists(captureLog), "capture.log should be retained under ${environment.artifactDirectory}")
            } catch (throwable: Throwable) {
                primaryFailure = throwable
                throw throwable
            } finally {
                val cleanupFailures = mutableListOf<Throwable>()

                fun cleanup(resource: String, block: () -> Unit) {
                    try {
                        block()
                    } catch (throwable: Throwable) {
                        cleanupFailures += AssertionError("Failed to clean up $resource", throwable)
                    }
                }

                image?.let { ownedImage ->
                    cleanup("XImage") {
                        assertEquals(1, XDestroyImage(ownedImage), "XDestroyImage during cleanup should succeed")
                    }
                }
                if (gc != MemorySegment.NULL) {
                    cleanup("X11 graphics context") {
                        assertEquals(1, XFreeGC(display, gc), "XFreeGC should succeed")
                    }
                }
                if (colormap != 0L) {
                    cleanup("X11 colormap") {
                        assertEquals(1, XFreeColormap(display, colormap), "XFreeColormap should succeed")
                    }
                }
                if (window != 0L) {
                    cleanup("X11 window") {
                        assertEquals(1, XDestroyWindow(display, window), "XDestroyWindow should succeed")
                    }
                }
                if (display != MemorySegment.NULL) {
                    cleanup("X11 display") {
                        assertEquals(0, XCloseDisplay(display), "XCloseDisplay should succeed")
                    }
                }

                if (cleanupFailures.isNotEmpty()) {
                    val existingFailure = primaryFailure
                    if (existingFailure != null) {
                        cleanupFailures.forEach(existingFailure::addSuppressed)
                    } else {
                        val cleanupFailure = AssertionError("X11 integration cleanup failed")
                        cleanupFailures.forEach(cleanupFailure::addSuppressed)
                        throw cleanupFailure
                    }
                }
            }
        }
    }

    @Test
    fun createsAndUpdatesXimWithGeneratedVariadicBindings() {
        assumeTrue(
            System.getProperty("os.name").lowercase().contains("linux"),
            "XIM integration is Linux-only",
        )
        assumeTrue(
            System.getenv("KFFI_X11_INTEGRATION") == "1",
            "Set KFFI_X11_INTEGRATION=1 to run the XIM integration test",
        )

        val environment = requireIntegrationEnvironment()
        Arena.ofConfined().use { arena ->
            val displayName = arena.allocateFrom(environment.displayName)
            var display = MemorySegment.NULL
            var inputMethod = MemorySegment.NULL
            var inputContext = MemorySegment.NULL
            var window = 0L
            try {
                display = XOpenDisplay(displayName)
                assertNativePointer(display, "XOpenDisplay(${environment.displayName})")
                inputMethod = XOpenIM(display, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL)
                assumeTrue(
                    inputMethod != MemorySegment.NULL && inputMethod.address() != 0L,
                    "XOpenIM returned null; no XIM implementation is available in this Xvfb environment",
                )

                val rootWindow = XDefaultRootWindow(display)
                window = XCreateSimpleWindow(display, rootWindow, 0, 0, 32, 24, 0, 0L, 0L)
                assertTrue(window != 0L, "XCreateSimpleWindow should return a non-zero XIM client window")

                val inputStyleName = arena.allocateFrom(XNInputStyle)
                val clientWindowName = arena.allocateFrom(XNClientWindow)
                val focusWindowName = arena.allocateFrom(XNFocusWindow)
                val windowValue = MemorySegment.ofAddress(window)
                inputContext = XCreateIC(
                    inputMethod,
                    inputStyleName,
                    MemorySegment.ofAddress(XIMPreeditNothing() or XIMStatusNothing()),
                    clientWindowName,
                    windowValue,
                    focusWindowName,
                    windowValue,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                )
                assertNativePointer(inputContext, "XCreateIC")

                val pointBinding = XPoint()
                val spot = XPoint.allocate(arena)
                pointBinding.x(spot, 6)
                pointBinding.y(spot, 9)
                assertEquals(6, pointBinding.x(spot))
                assertEquals(9, pointBinding.y(spot))
                val setResult = XSetICValues(
                    inputContext,
                    focusWindowName,
                    windowValue,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                )
                assertEquals(MemorySegment.NULL, setResult, "XSetICValues should accept generated variadic values")
            } finally {
                if (inputContext != MemorySegment.NULL) {
                    XDestroyIC(inputContext)
                }
                if (inputMethod != MemorySegment.NULL) {
                    assertEquals(1, XCloseIM(inputMethod), "XCloseIM should succeed")
                }
                if (window != 0L && display != MemorySegment.NULL) {
                    assertEquals(1, XDestroyWindow(display, window), "XDestroyWindow should succeed")
                }
                if (display != MemorySegment.NULL) {
                    assertEquals(0, XCloseDisplay(display), "XCloseDisplay should succeed")
                }
            }
        }
    }
}

private fun verifyXShmImagePath(
    display: MemorySegment,
    visual: MemorySegment,
    depth: Int,
    arena: Arena,
    imageBinding: XImage,
    clientLog: Path,
) {
    if (XShmQueryExtension(display) == 0) {
        appendLog(clientLog, "XShmQueryExtension unavailable; skipped XShmCreateImage round-trip\n")
        return
    }

    val shmInfoBinding = XShmSegmentInfoCompat()
    val shmInfo = XShmSegmentInfoCompat.allocate(arena)
    val backing = arena.allocate(WINDOW_WIDTH.toLong() * WINDOW_HEIGHT * 4L)
    shmInfoBinding.shmaddr(shmInfo, backing)
    shmInfoBinding.shmid(shmInfo, -1)
    shmInfoBinding.readOnly(shmInfo, 0)

    val shmImage = XShmCreateImage(
        display,
        visual,
        depth,
        XSHM_ZPIXMAP(),
        backing,
        shmInfo,
        WINDOW_WIDTH,
        WINDOW_HEIGHT,
    )
    assertNativePointer(shmImage, "XShmCreateImage")
    try {
        val generatedShmImage = XImage.reinterpret(shmImage)
        assertEquals(backing.address(), imageBinding.data(generatedShmImage).address())
        assertEquals(ZPixmap(), imageBinding.format(generatedShmImage))
        assertTrue(imageBinding.bytes_per_line(generatedShmImage) > 0)
        assertTrue(imageBinding.bits_per_pixel(generatedShmImage) > 0)
        appendLog(clientLog, "XShmCreateImage returned a generated XImage record\n")
    } finally {
        assertEquals(1, XDestroyImage(shmImage), "XDestroyImage should destroy the XShm image")
    }
}

private fun verifySyntheticEvents(
    display: MemorySegment,
    window: Long,
    event: MemorySegment,
    eventStorage: KffiXEventStorage,
    clientMessageBinding: XClientMessageEvent,
    selectionEventBinding: XSelectionEvent,
    arena: Arena,
    clientLog: Path,
) {
    val messageType = XInternAtom(display, arena.allocateFrom("KFFI_CLIENT_MESSAGE"), 0)
    assertTrue(messageType != 0L, "XInternAtom should create a client-message atom")
    clientMessageBinding.type(event, ClientMessage())
    clientMessageBinding.serial(event, 0L)
    clientMessageBinding.send_event(event, 0)
    clientMessageBinding.display(event, display)
    clientMessageBinding.window(event, window)
    clientMessageBinding.message_type(event, messageType)
    clientMessageBinding.format(event, 32)
    clientMessageBinding.data_l0(event, 0x101L)
    clientMessageBinding.data_l1(event, 0x202L)
    assertEquals(1, XSendEvent(display, window, 0, 0L, event))
    XSync(display, 0)
    assertEquals(0, XNextEvent(display, event))
    assertEquals(ClientMessage(), eventStorage.type(event))
    assertEquals(window, clientMessageBinding.window(event))
    assertEquals(messageType, clientMessageBinding.message_type(event))
    assertEquals(32, clientMessageBinding.format(event))
    assertEquals(0x101L, clientMessageBinding.data_l0(event))
    assertEquals(0x202L, clientMessageBinding.data_l1(event))

    val selection = XInternAtom(display, arena.allocateFrom("KFFI_SELECTION"), 0)
    val target = XInternAtom(display, arena.allocateFrom("KFFI_TARGET"), 0)
    val property = XInternAtom(display, arena.allocateFrom("KFFI_PROPERTY"), 0)
    assertTrue(selection != 0L && target != 0L && property != 0L)
    selectionEventBinding.type(event, SelectionNotify())
    selectionEventBinding.serial(event, 0L)
    selectionEventBinding.send_event(event, 0)
    selectionEventBinding.display(event, display)
    selectionEventBinding.requestor(event, window)
    selectionEventBinding.selection(event, selection)
    selectionEventBinding.target(event, target)
    selectionEventBinding.property_(event, property)
    selectionEventBinding.time(event, 777L)
    assertEquals(1, XSendEvent(display, window, 0, 0L, event))
    XSync(display, 0)
    assertEquals(0, XNextEvent(display, event))
    assertEquals(SelectionNotify(), eventStorage.type(event))
    assertEquals(window, selectionEventBinding.requestor(event))
    assertEquals(selection, selectionEventBinding.selection(event))
    assertEquals(target, selectionEventBinding.target(event))
    assertEquals(property, selectionEventBinding.property_(event))
    assertEquals(777L, selectionEventBinding.time(event))
    appendLog(clientLog, "ClientMessage and SelectionNotify round-trips verified\n")
}

private fun requireIntegrationEnvironment(): X11IntegrationEnvironment {
    val displayName = System.getenv("DISPLAY")?.takeIf(String::isNotBlank)
        ?: integrationFailure(
            "DISPLAY is missing; start the Xvfb runner before invoking the X11 screenshot integration test",
        )
    val configuredArtifactDirectory = System.getenv("KFFI_X11_ARTIFACT_DIR")
        ?.takeIf(String::isNotBlank)
        ?: System.getProperty("kffi.x11.defaultArtifactDir")
            ?.takeIf(String::isNotBlank)
        ?: "kffi-x11/build/x11-integration"
    return X11IntegrationEnvironment(
        displayName = displayName,
        artifactDirectory = Path.of(configuredArtifactDirectory).toAbsolutePath().normalize(),
    )
}

private fun requireExecutable(name: String) {
    val executable = System.getenv("PATH").orEmpty()
        .split(File.pathSeparatorChar)
        .asSequence()
        .filter(String::isNotBlank)
        .map { Path.of(it).resolve(name) }
        .firstOrNull(Files::isExecutable)
    if (executable == null) {
        integrationFailure("Required executable '$name' is unavailable in PATH")
    }
}

private fun waitForEvents(
    display: MemorySegment,
    event: MemorySegment,
    eventStorage: KffiXEventStorage,
    clientLog: Path,
): ObservedEvents {
    val deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(EVENT_TIMEOUT_MILLIS)
    var sawExpose = false
    var sawConfigureNotify = false

    while (System.nanoTime() < deadline && !(sawExpose && sawConfigureNotify)) {
        val pending = XPending(display)
        if (pending <= 0) {
            Thread.sleep(10L)
            continue
        }

        repeat(pending) {
            assertEquals(0, XNextEvent(display, event), "XNextEvent should succeed")
            when (val eventType = eventStorage.type(event)) {
                Expose() -> {
                    sawExpose = true
                    appendLog(clientLog, "event: Expose\n")
                }
                ConfigureNotify() -> {
                    sawConfigureNotify = true
                    appendLog(clientLog, "event: ConfigureNotify\n")
                }
                else -> appendLog(clientLog, "event: $eventType\n")
            }
        }
    }

    return ObservedEvents(
        sawExpose = sawExpose,
        sawConfigureNotify = sawConfigureNotify,
    )
}

private fun captureWindow(window: Long, output: Path, captureLog: Path): CaptureStatuses {
    appendLog(captureLog, "capturing window 0x${window.toString(16)} to $output\n")
    val script = """
        set -o pipefail
        xwd -id $window -nobdrs -silent | convert xwd:- ${shellQuote("png:$output")}
        statuses=("${'$'}{PIPESTATUS[@]}")
        printf 'xwd=%s convert=%s\n' "${'$'}{statuses[0]}" "${'$'}{statuses[1]}"
        if [[ "${'$'}{statuses[0]}" -ne 0 ]]; then
            exit "${'$'}{statuses[0]}"
        fi
        exit "${'$'}{statuses[1]}"
    """.trimIndent()
    val process = ProcessBuilder("/bin/bash", "-lc", script)
        .redirectError(ProcessBuilder.Redirect.appendTo(captureLog.toFile()))
        .start()

    if (!process.waitFor(CAPTURE_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
        process.destroyForcibly()
        fail("Timed out waiting for xwd/convert capture after ${CAPTURE_TIMEOUT_SECONDS}s")
    }

    val stdout = process.inputStream.bufferedReader().use { it.readText() }
    appendLog(captureLog, stdout)
    val statuses = parseCaptureStatuses(stdout)
    return CaptureStatuses(
        shellExit = process.exitValue(),
        xwdExit = statuses.first,
        convertExit = statuses.second,
    )
}

private fun parseCaptureStatuses(stdout: String): Pair<Int, Int> {
    val line = stdout.lineSequence().firstOrNull { it.startsWith("xwd=") }
        ?: integrationFailure("capture pipeline did not report xwd/convert exit statuses")
    val match = Regex("""xwd=(\d+)\s+convert=(\d+)""").matchEntire(line.trim())
        ?: integrationFailure("could not parse capture exit statuses from '$line'")
    return match.groupValues[1].toInt() to match.groupValues[2].toInt()
}

private fun assertNativePointer(segment: MemorySegment?, label: String) {
    if (segment == null || segment == MemorySegment.NULL || segment.address() == 0L) {
        fail("$label returned a null native pointer")
    }
}

private fun assertPixelColor(image: BufferedImage, x: Int, y: Int, expectedRgb: Int, label: String) {
    val actualRgb = image.getRGB(x, y) and 0x00FFFFFF
    assertEquals(expectedRgb, actualRgb, "$label pixel mismatch at ($x, $y)")
}

private fun appendLog(path: Path, line: String) {
    Files.writeString(
        path,
        line,
        StandardOpenOption.CREATE,
        StandardOpenOption.APPEND,
    )
}

private fun shellQuote(value: String): String = buildString {
    append('\'')
    value.forEach { character ->
        if (character == '\'') {
            append("'\"'\"'")
        } else {
            append(character)
        }
    }
    append('\'')
}

private fun integrationFailure(message: String): Nothing = fail(message)
