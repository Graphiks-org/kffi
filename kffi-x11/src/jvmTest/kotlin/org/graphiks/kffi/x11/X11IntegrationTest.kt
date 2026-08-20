package org.graphiks.kffi.x11

import org.graphiks.kffi.x11.generated.ConfigureNotify
import org.graphiks.kffi.x11.generated.Expose
import org.graphiks.kffi.x11.generated.ExposureMask
import org.graphiks.kffi.x11.generated.KffiXEventStorage
import org.graphiks.kffi.x11.generated.StructureNotifyMask
import org.graphiks.kffi.x11.generated.XCloseDisplay
import org.graphiks.kffi.x11.generated.XConnectionNumber
import org.graphiks.kffi.x11.generated.XCreateSimpleWindow
import org.graphiks.kffi.x11.generated.XDefaultRootWindow
import org.graphiks.kffi.x11.generated.XDefaultScreen
import org.graphiks.kffi.x11.generated.XDestroyImage
import org.graphiks.kffi.x11.generated.XDestroyWindow
import org.graphiks.kffi.x11.generated.XFlush
import org.graphiks.kffi.x11.generated.XGetImage
import org.graphiks.kffi.x11.generated.XMapWindow
import org.graphiks.kffi.x11.generated.XNextEvent
import org.graphiks.kffi.x11.generated.XOpenDisplay
import org.graphiks.kffi.x11.generated.XPending
import org.graphiks.kffi.x11.generated.XResizeWindow
import org.graphiks.kffi.x11.generated.XSelectInput
import org.graphiks.kffi.x11.generated.XSync
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.io.File
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
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
private const val Z_PIXMAP = 2

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
            val event = KffiXEventStorage.allocate(arena)
            val displayName = arena.allocateFrom(environment.displayName)
            var display = MemorySegment.NULL
            var window = 0L
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

                assertEquals(
                    1,
                    XSelectInput(display, window, ExposureMask() or StructureNotifyMask()),
                    "XSelectInput should succeed",
                )
                assertEquals(1, XMapWindow(display, window), "XMapWindow should succeed")
                assertEquals(1, XFlush(display), "XFlush should succeed")
                assertEquals(0, XSync(display, 0), "XSync should succeed")
                appendLog(clientLog, "window mapped and flushed\n")

                assertEquals(1, XResizeWindow(display, window, WINDOW_WIDTH + 1, WINDOW_HEIGHT + 1))
                assertEquals(1, XResizeWindow(display, window, WINDOW_WIDTH, WINDOW_HEIGHT))
                assertEquals(1, XFlush(display), "XFlush after resize should succeed")
                assertEquals(0, XSync(display, 0), "XSync after resize should succeed")
                appendLog(clientLog, "window resized before polling\n")

                val observedEvents = waitForEvents(display, event, eventStorage, clientLog)
                assertTrue(observedEvents.sawExpose, "Expected Expose after mapping the child window")
                assertTrue(
                    observedEvents.sawConfigureNotify,
                    "Expected ConfigureNotify after resizing the child window",
                )

                image = XGetImage(display, window, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, -1L, Z_PIXMAP)
                assertNativePointer(image, "XGetImage")
                appendLog(clientLog, "XGetImage succeeded\n")
                assertEquals(1, XDestroyImage(image), "XDestroyImage should succeed")
                image = null

                val captureStatuses = captureWindow(window, windowPng, captureLog)
                assertEquals(0, captureStatuses.shellExit, "capture shell pipeline should exit zero")
                assertEquals(0, captureStatuses.xwdExit, "xwd should exit zero")
                assertEquals(0, captureStatuses.convertExit, "convert should exit zero")

                val bufferedImage = ImageIO.read(windowPng.toFile())
                    ?: fail("ImageIO could not decode the captured PNG at $windowPng")
                assertEquals(WINDOW_WIDTH, bufferedImage.width, "captured PNG width mismatch")
                assertEquals(WINDOW_HEIGHT, bufferedImage.height, "captured PNG height mismatch")
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
