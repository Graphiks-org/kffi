package org.graphiks.kffi.wayland

import org.graphiks.kffi.wayland.generated.xdg_surface_interface
import org.graphiks.kffi.wayland.generated.xdg_toplevel_interface
import org.graphiks.kffi.wayland.generated.xdg_wm_base_interface
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.io.File
import java.io.IOException
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.concurrent.TimeUnit
import javax.imageio.ImageIO
import kotlin.math.min
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

private const val TEST_WIDTH = 640
private const val TEST_HEIGHT = 480
private const val TEST_STRIDE = TEST_WIDTH * 4
private const val TEST_BUFFER_SIZE = TEST_STRIDE * TEST_HEIGHT
private const val EVENT_TIMEOUT_MILLIS = 10_000L
private const val GRIM_TIMEOUT_SECONDS = 15L

private const val TOP_LEFT_COLOR = 0x00ff0000
private const val TOP_RIGHT_COLOR = 0x0000ff00
private const val BOTTOM_LEFT_COLOR = 0x000000ff
private const val BOTTOM_RIGHT_COLOR = 0x00ffff00

private const val WL_COMPOSITOR_CREATE_SURFACE = 0
private const val WL_SURFACE_DESTROY = 0
private const val WL_SURFACE_FRAME = 3
private const val WL_SURFACE_COMMIT = 6
private const val WL_SHM_POOL_DESTROY = 1
private const val WL_BUFFER_DESTROY = 0
private const val WL_MARSHAL_FLAG_DESTROY = 1

private const val POLLIN = 0x0001
private const val POLLERR = 0x0008
private const val POLLHUP = 0x0010
private const val POLLNVAL = 0x0020

data class WaylandIntegrationGlobal(val name: Int, val version: Int)

class WaylandIntegrationRegistryEvents {
    val globals: MutableMap<String, WaylandIntegrationGlobal> = linkedMapOf()
    var failure: Throwable? = null

    @Suppress("UNUSED_PARAMETER")
    fun onGlobal(
        data: MemorySegment,
        registry: MemorySegment,
        name: Int,
        interfaceName: MemorySegment,
        version: Int,
    ) {
        try {
            val decodedName = interfaceName.reinterpret(256).getString(0)
            globals.putIfAbsent(decodedName, WaylandIntegrationGlobal(name, version))
        } catch (throwable: Throwable) {
            failure = failure ?: throwable
        }
    }

    @Suppress("UNUSED_PARAMETER")
    fun onGlobalRemove(data: MemorySegment, registry: MemorySegment, name: Int) = Unit
}

class WaylandIntegrationWmBaseEvents(private val version: Int) {
    var failure: Throwable? = null

    @Suppress("UNUSED_PARAMETER")
    fun onPing(data: MemorySegment, wmBase: MemorySegment, serial: Int) {
        try {
            val pong = wlProxyMarshalFlagsUint
                ?: error("required libwayland symbol 'wl_proxy_marshal_flags' is unavailable")
            pong.invokeExact(wmBase, XDG_WM_BASE_PONG, MemorySegment.NULL, version, 0, serial)
        } catch (throwable: Throwable) {
            failure = failure ?: throwable
        }
    }
}

class WaylandIntegrationXdgSurfaceEvents {
    var configureSerial: Int? = null

    @Suppress("UNUSED_PARAMETER")
    fun onConfigure(data: MemorySegment, xdgSurface: MemorySegment, serial: Int) {
        configureSerial = serial
    }
}

class WaylandIntegrationToplevelEvents {
    var configuredWidth: Int = 0
    var configuredHeight: Int = 0
    var closed: Boolean = false

    @Suppress("UNUSED_PARAMETER")
    fun onConfigure(
        data: MemorySegment,
        toplevel: MemorySegment,
        width: Int,
        height: Int,
        states: MemorySegment,
    ) {
        configuredWidth = width
        configuredHeight = height
    }

    @Suppress("UNUSED_PARAMETER")
    fun onClose(data: MemorySegment, toplevel: MemorySegment) {
        closed = true
    }

    @Suppress("UNUSED_PARAMETER")
    fun onConfigureBounds(data: MemorySegment, toplevel: MemorySegment, width: Int, height: Int) = Unit

    @Suppress("UNUSED_PARAMETER")
    fun onWmCapabilities(data: MemorySegment, toplevel: MemorySegment, capabilities: MemorySegment) = Unit
}

class WaylandIntegrationSurfaceEvents {
    @Suppress("UNUSED_PARAMETER")
    fun onEnter(data: MemorySegment, surface: MemorySegment, output: MemorySegment) = Unit

    @Suppress("UNUSED_PARAMETER")
    fun onLeave(data: MemorySegment, surface: MemorySegment, output: MemorySegment) = Unit

    @Suppress("UNUSED_PARAMETER")
    fun onPreferredBufferScale(data: MemorySegment, surface: MemorySegment, factor: Int) = Unit

    @Suppress("UNUSED_PARAMETER")
    fun onPreferredBufferTransform(data: MemorySegment, surface: MemorySegment, transform: Int) = Unit
}

class WaylandIntegrationShmEvents {
    val formats: MutableSet<Int> = linkedSetOf()

    @Suppress("UNUSED_PARAMETER")
    fun onFormat(data: MemorySegment, shm: MemorySegment, format: Int) {
        formats += format
    }
}

class WaylandIntegrationBufferEvents {
    var released: Boolean = false

    @Suppress("UNUSED_PARAMETER")
    fun onRelease(data: MemorySegment, buffer: MemorySegment) {
        released = true
    }
}

class WaylandIntegrationFrameEvents {
    var done: Boolean = false

    @Suppress("UNUSED_PARAMETER")
    fun onDone(data: MemorySegment, callback: MemorySegment, callbackData: Int) {
        done = true
    }
}

class WaylandIntegrationTest {
    @Test
    fun rendersShmQuadrantsThroughXdgShell() {
        assumeTrue(
            System.getenv("KFF_WAYLAND_INTEGRATION") == "1",
            "Set KFF_WAYLAND_INTEGRATION=1 to run the compositor-backed test",
        )

        val environment = requireIntegrationEnvironment()
        requireIntegrationNativeSymbols()
        requireExecutable("grim")

        val wmBaseDescriptor = requireGeneratedDescriptor("xdg_wm_base") { xdg_wm_base_interface }
        val xdgSurfaceDescriptor = requireGeneratedDescriptor("xdg_surface") { xdg_surface_interface }
        val toplevelDescriptor = requireGeneratedDescriptor("xdg_toplevel") { xdg_toplevel_interface }
        val callbackDescriptor = requireCoreDescriptor("wl_callback")
        val compositorDescriptor = wlCompositorInterface
            ?: integrationFailure("libwayland does not expose wl_compositor_interface")
        val shmDescriptor = wlShmInterface
            ?: integrationFailure("libwayland does not expose wl_shm_interface")

        Files.createDirectories(environment.artifactDirectory)
        val screenshot = environment.artifactDirectory.resolve("screenshot.png")
        val grimLog = environment.artifactDirectory.resolve("grim.log")
        val clientLog = environment.artifactDirectory.resolve("client.log")
        Files.deleteIfExists(screenshot)
        Files.deleteIfExists(grimLog)
        Files.deleteIfExists(clientLog)
        appendLog(
            clientLog,
            "WAYLAND_DISPLAY=${environment.displayName} XDG_RUNTIME_DIR=${environment.runtimeDirectory}\n",
        )

        Arena.ofShared().use { listenerArena ->
            var display = 0L
            var registry = 0L
            var compositor = 0L
            var shm = 0L
            var wmBase = 0L
            var surface = 0L
            var xdgSurface = 0L
            var toplevel = 0L
            var pool = 0L
            var buffer = 0L
            var frameCallback = 0L
            var fd = -1
            var mappedMemory: MemorySegment? = null
            var primaryFailure: Throwable? = null

            try {
                display = connectWayland()
                    ?: integrationFailure(
                        "Could not connect to compositor '${environment.displayName}' under " +
                            "${environment.runtimeDirectory}; verify WAYLAND_DISPLAY, XDG_RUNTIME_DIR, and compositor.log",
                    )

                registry = getRegistryProxy(display)
                requireProxy(registry, "wl_registry")
                val registryEvents = WaylandIntegrationRegistryEvents()
                requireListener(registry, registryListener(registryEvents, listenerArena), "wl_registry")
                if (!roundtripWayland(display)) {
                    integrationFailure("The compositor disconnected while enumerating registry globals")
                }
                registryEvents.failure?.let {
                    integrationFailure("The wl_registry listener could not decode a global", it)
                }

                val compositorGlobal = requireGlobal(registryEvents, WL_COMPOSITOR_INTERFACE_NAME)
                val shmGlobal = requireGlobal(registryEvents, WL_SHM_INTERFACE_NAME)
                val wmBaseGlobal = requireGlobal(registryEvents, XDG_WM_BASE_INTERFACE_NAME)
                appendLog(
                    clientLog,
                    "globals: wl_compositor=${compositorGlobal.version} wl_shm=${shmGlobal.version} " +
                        "xdg_wm_base=${wmBaseGlobal.version}\n",
                )

                compositor = registryBind(
                    MemorySegment.ofAddress(registry),
                    compositorDescriptor,
                    compositorGlobal.name,
                    min(compositorGlobal.version, WL_COMPOSITOR_VERSION),
                )
                requireProxy(compositor, "wl_compositor")
                shm = registryBind(MemorySegment.ofAddress(registry), shmDescriptor, shmGlobal.name, 1)
                requireProxy(shm, "wl_shm")
                val shmEvents = WaylandIntegrationShmEvents()
                requireListener(shm, shmListener(shmEvents, listenerArena), "wl_shm")
                wmBase = registryBind(
                    MemorySegment.ofAddress(registry),
                    wmBaseDescriptor,
                    wmBaseGlobal.name,
                    min(wmBaseGlobal.version, XDG_WM_BASE_VERSION),
                )
                requireProxy(wmBase, "xdg_wm_base")
                val wmBaseEvents = WaylandIntegrationWmBaseEvents(proxyVersion(wmBase))
                requireListener(wmBase, wmBaseListener(wmBaseEvents, listenerArena), "xdg_wm_base")

                surface = createSurface(compositor)
                requireListener(
                    surface,
                    surfaceListener(WaylandIntegrationSurfaceEvents(), listenerArena),
                    "wl_surface",
                )
                xdgSurface = createXdgSurface(wmBase, surface, xdgSurfaceDescriptor)
                val xdgSurfaceEvents = WaylandIntegrationXdgSurfaceEvents()
                requireListener(
                    xdgSurface,
                    xdgSurfaceListener(xdgSurfaceEvents, listenerArena),
                    "xdg_surface",
                )
                toplevel = createToplevel(xdgSurface, toplevelDescriptor)
                val toplevelEvents = WaylandIntegrationToplevelEvents()
                requireListener(
                    toplevel,
                    toplevelListener(toplevelEvents, listenerArena),
                    "xdg_toplevel",
                )

                marshalString(toplevel, XDG_TOPLEVEL_SET_TITLE, "kffi Wayland integration", listenerArena)
                marshalString(toplevel, XDG_TOPLEVEL_SET_APP_ID, "org.graphiks.kffi.wayland.integration", listenerArena)
                marshalObject(toplevel, XDG_TOPLEVEL_SET_FULLSCREEN, 0L)
                marshalVoid(surface, WL_SURFACE_COMMIT)

                dispatchUntil(
                    display,
                    "the initial xdg_surface.configure event",
                    { xdgSurfaceEvents.configureSerial != null || toplevelEvents.closed },
                    { wmBaseEvents.failure },
                )
                if (toplevelEvents.closed) {
                    integrationFailure("The compositor closed the xdg_toplevel before its initial configure")
                }
                val configureSerial = xdgSurfaceEvents.configureSerial
                    ?: integrationFailure("The compositor never configured the xdg_surface")
                marshalUint(xdgSurface, XDG_SURFACE_ACK_CONFIGURE, configureSerial)
                marshalFourInt(
                    xdgSurface,
                    XDG_SURFACE_SET_WINDOW_GEOMETRY,
                    0,
                    0,
                    TEST_WIDTH,
                    TEST_HEIGHT,
                )
                appendLog(
                    clientLog,
                    "configure: serial=$configureSerial size=${toplevelEvents.configuredWidth}x" +
                        "${toplevelEvents.configuredHeight}\n",
                )

                fd = createMemFd("kffi-wayland-integration", TEST_BUFFER_SIZE)
                if (fd < 0) {
                    integrationFailure("memfd_create/ftruncate failed for the $TEST_BUFFER_SIZE-byte wl_shm buffer")
                }
                mappedMemory = mmapFd(fd, TEST_BUFFER_SIZE)
                    ?: integrationFailure("mmap failed for the $TEST_BUFFER_SIZE-byte wl_shm buffer (fd=$fd)")
                fillQuadrants(mappedMemory.reinterpret(TEST_BUFFER_SIZE.toLong()))

                pool = createIntegrationShmPool(shm, fd, TEST_BUFFER_SIZE)
                requireProxy(pool, "wl_shm_pool")
                buffer = createIntegrationShmBuffer(
                    pool,
                    0,
                    TEST_WIDTH,
                    TEST_HEIGHT,
                    TEST_STRIDE,
                    WL_SHM_FORMAT_XRGB8888,
                )
                requireProxy(buffer, "wl_buffer")
                val bufferEvents = WaylandIntegrationBufferEvents()
                requireListener(buffer, bufferListener(bufferEvents, listenerArena), "wl_buffer")

                frameCallback = createFrameCallback(surface, callbackDescriptor)
                val frameEvents = WaylandIntegrationFrameEvents()
                requireListener(frameCallback, frameListener(frameEvents, listenerArena), "wl_callback")
                wlSurfaceAttach(surface, buffer, 0, 0)
                wlSurfaceDamage(surface, 0, 0, TEST_WIDTH, TEST_HEIGHT)
                marshalVoid(surface, WL_SURFACE_COMMIT)

                dispatchUntil(
                    display,
                    "the first wl_surface frame and fullscreen configure",
                    {
                        (frameEvents.done && xdgSurfaceEvents.configureSerial != configureSerial) ||
                            toplevelEvents.closed
                    },
                    { wmBaseEvents.failure },
                )
                if (toplevelEvents.closed) {
                    integrationFailure("The compositor closed the xdg_toplevel before presenting its first frame")
                }
                assertTrue(frameEvents.done, "The compositor did not process the committed wl_shm frame")
                val fullscreenConfigureSerial = xdgSurfaceEvents.configureSerial
                    ?.takeIf { it != configureSerial }
                    ?: integrationFailure("The compositor did not send a fullscreen configure after mapping the buffer")
                marshalUint(xdgSurface, XDG_SURFACE_ACK_CONFIGURE, fullscreenConfigureSerial)
                appendLog(
                    clientLog,
                    "fullscreen configure: serial=$fullscreenConfigureSerial " +
                        "size=${toplevelEvents.configuredWidth}x${toplevelEvents.configuredHeight}\n",
                )

                proxyDestroy(frameCallback)
                frameCallback = createFrameCallback(surface, callbackDescriptor)
                val presentedFrameEvents = WaylandIntegrationFrameEvents()
                requireListener(
                    frameCallback,
                    frameListener(presentedFrameEvents, listenerArena),
                    "wl_callback",
                )
                wlSurfaceDamage(surface, 0, 0, TEST_WIDTH, TEST_HEIGHT)
                marshalVoid(surface, WL_SURFACE_COMMIT)
                dispatchUntil(
                    display,
                    "the fullscreen wl_surface frame callback",
                    { presentedFrameEvents.done || toplevelEvents.closed },
                    { wmBaseEvents.failure },
                )
                if (toplevelEvents.closed) {
                    integrationFailure("The compositor closed the xdg_toplevel before presenting the fullscreen frame")
                }
                assertTrue(presentedFrameEvents.done, "The compositor did not present the fullscreen wl_shm frame")
                appendLog(clientLog, "frame: fullscreen presented; bufferReleased=${bufferEvents.released}\n")

                captureWithGrim(screenshot, grimLog)
                val image = ImageIO.read(screenshot.toFile())
                    ?: integrationFailure("ImageIO could not decode grim output at $screenshot")
                assertEquals(
                    TEST_WIDTH,
                    image.width,
                    "Expected grim to capture the runner's ${TEST_WIDTH}x$TEST_HEIGHT output; " +
                        "actual image is ${image.width}x${image.height}. See $grimLog",
                )
                assertEquals(
                    TEST_HEIGHT,
                    image.height,
                    "Expected grim to capture the runner's ${TEST_WIDTH}x$TEST_HEIGHT output; " +
                        "actual image is ${image.width}x${image.height}. See $grimLog",
                )
                assertPixel(image.getRGB(TEST_WIDTH / 4, TEST_HEIGHT / 4), TOP_LEFT_COLOR, "top-left")
                assertPixel(image.getRGB(TEST_WIDTH * 3 / 4, TEST_HEIGHT / 4), TOP_RIGHT_COLOR, "top-right")
                assertPixel(image.getRGB(TEST_WIDTH / 4, TEST_HEIGHT * 3 / 4), BOTTOM_LEFT_COLOR, "bottom-left")
                assertPixel(
                    image.getRGB(TEST_WIDTH * 3 / 4, TEST_HEIGHT * 3 / 4),
                    BOTTOM_RIGHT_COLOR,
                    "bottom-right",
                )
                appendLog(clientLog, "capture: ${image.width}x${image.height} quadrants verified\n")
            } catch (throwable: Throwable) {
                primaryFailure = throwable
                throw throwable
            } finally {
                val cleanupFailures = mutableListOf<Throwable>()
                fun cleanup(resource: String, action: () -> Unit) {
                    try {
                        action()
                    } catch (throwable: Throwable) {
                        cleanupFailures += AssertionError("Failed to clean up $resource", throwable)
                    }
                }

                if (frameCallback != 0L) cleanup("wl_callback") { proxyDestroy(frameCallback) }
                if (buffer != 0L) cleanup("wl_buffer") { destroyProtocolProxy(buffer, WL_BUFFER_DESTROY) }
                if (pool != 0L) cleanup("wl_shm_pool") { destroyProtocolProxy(pool, WL_SHM_POOL_DESTROY) }
                if (toplevel != 0L) cleanup("xdg_toplevel") { destroyProtocolProxy(toplevel, XDG_TOPLEVEL_DESTROY) }
                if (xdgSurface != 0L) cleanup("xdg_surface") { destroyProtocolProxy(xdgSurface, XDG_SURFACE_DESTROY) }
                if (surface != 0L) cleanup("wl_surface") { destroyProtocolProxy(surface, WL_SURFACE_DESTROY) }
                if (wmBase != 0L) cleanup("xdg_wm_base") { destroyProtocolProxy(wmBase, XDG_WM_BASE_DESTROY) }
                if (display != 0L && cleanupFailures.isEmpty()) {
                    cleanup("Wayland destroy requests") {
                        if (!roundtripWayland(display)) error("wl_display_roundtrip failed")
                    }
                }
                if (shm != 0L) cleanup("wl_shm proxy") { proxyDestroy(shm) }
                if (compositor != 0L) cleanup("wl_compositor proxy") { proxyDestroy(compositor) }
                if (registry != 0L) cleanup("wl_registry proxy") { proxyDestroy(registry) }
                if (display != 0L) cleanup("wl_display") { disconnectWayland(display) }
                mappedMemory?.let { memory -> cleanup("mmap") { munmap(memory, TEST_BUFFER_SIZE) } }
                if (fd >= 0) cleanup("memfd") { closeFd(fd) }

                if (cleanupFailures.isNotEmpty()) {
                    val existingFailure = primaryFailure
                    if (existingFailure != null) {
                        cleanupFailures.forEach(existingFailure::addSuppressed)
                    } else {
                        val cleanupFailure = AssertionError("Wayland integration cleanup failed")
                        cleanupFailures.forEach(cleanupFailure::addSuppressed)
                        throw cleanupFailure
                    }
                }
            }
        }
    }
}

private data class IntegrationEnvironment(
    val displayName: String,
    val runtimeDirectory: Path,
    val artifactDirectory: Path,
)

private fun requireIntegrationEnvironment(): IntegrationEnvironment {
    val displayName = System.getenv("WAYLAND_DISPLAY")?.takeIf(String::isNotBlank)
        ?: integrationFailure(
            "WAYLAND_DISPLAY is missing; start the compositor runner before invoking waylandIntegrationTest",
        )
    val runtimeDirectoryValue = System.getenv("XDG_RUNTIME_DIR")?.takeIf(String::isNotBlank)
        ?: integrationFailure(
            "XDG_RUNTIME_DIR is missing; the test cannot locate the Wayland compositor socket",
        )
    val runtimeDirectory = Path.of(runtimeDirectoryValue).toAbsolutePath().normalize()
    if (!Files.isDirectory(runtimeDirectory)) {
        integrationFailure("XDG_RUNTIME_DIR '$runtimeDirectory' is not an accessible directory")
    }
    val displayPath = Path.of(displayName)
    val socketPath = if (displayPath.isAbsolute) displayPath else runtimeDirectory.resolve(displayPath)
    if (!Files.exists(socketPath)) {
        integrationFailure(
            "Wayland compositor socket '$socketPath' does not exist; verify the runner and compositor.log",
        )
    }

    val configuredArtifactDirectory = System.getenv("KFF_WAYLAND_ARTIFACT_DIR")
        ?.takeIf(String::isNotBlank)
        ?: System.getProperty("kff.wayland.defaultArtifactDir")
            ?.takeIf(String::isNotBlank)
        ?: "kffi-wayland/build/wayland-integration"
    return IntegrationEnvironment(
        displayName,
        runtimeDirectory,
        Path.of(configuredArtifactDirectory).toAbsolutePath().normalize(),
    )
}

private fun requireIntegrationNativeSymbols() {
    if (libWaylandClient == null) {
        integrationFailure(
            "libwayland-client.so.0 is unavailable; install the Wayland client runtime and enable native access",
        )
    }
    val missingWaylandSymbols = listOf(
        "wl_display_connect" to wlDisplayConnect,
        "wl_display_disconnect" to wlDisplayDisconnect,
        "wl_display_roundtrip" to wlDisplayRoundtrip,
        "wl_display_get_fd" to wlDisplayGetFd,
        "wl_display_prepare_read" to wlDisplayPrepareRead,
        "wl_display_read_events" to wlDisplayReadEvents,
        "wl_display_cancel_read" to wlDisplayCancelRead,
        "wl_display_dispatch_pending" to wlDisplayDispatchPending,
        "wl_display_flush" to wlDisplayFlush,
        "wl_proxy_get_version" to wlProxyGetVersion,
        "wl_proxy_add_listener" to wlProxyAddListener,
        "wl_proxy_destroy" to wlProxyDestroy,
        "wl_proxy_marshal_flags(new_id)" to wlProxyMarshalNewId,
        "wl_proxy_marshal_flags(bind)" to wlProxyMarshalBind,
        "wl_proxy_marshal_flags(xdg_surface)" to wlProxyMarshalFlagsGetXdgSurface,
        "wl_proxy_marshal_flags(void)" to wlProxyMarshalFlagsVoid,
        "wl_proxy_marshal_flags(uint)" to wlProxyMarshalFlagsUint,
        "wl_proxy_marshal_flags(string)" to wlProxyMarshalFlagsString,
        "wl_proxy_marshal_flags(object)" to wlProxyMarshalFlagsObject,
        "wl_proxy_marshal_flags(four-int)" to wlProxyMarshalFlagsFourInt,
        "wl_compositor.create_surface" to wlCompositorCreateSurface,
        "wl_shm.create_pool" to integrationWlShmCreatePool,
        "wl_shm_pool.create_buffer" to integrationWlShmPoolCreateBuffer,
    ).filter { (_, handle) -> handle == null }.map { (name, _) -> name }
    if (missingWaylandSymbols.isNotEmpty()) {
        integrationFailure(
            "libwayland-client.so.0 is missing required FFM entry points: ${missingWaylandSymbols.joinToString()}",
        )
    }

    val missingPosixSymbols = listOf(
        "memfd_create" to nativeMemfdCreate,
        "ftruncate" to nativeFtruncate,
        "mmap" to nativeMmap,
        "munmap" to nativeMunmap,
        "close" to nativeClose,
    ).filter { (_, handle) -> handle == null }.map { (name, _) -> name }
    if (missingPosixSymbols.isNotEmpty()) {
        integrationFailure(
            "The POSIX FFM layer is missing required wl_shm helpers: ${missingPosixSymbols.joinToString()}",
        )
    }
}

private fun requireExecutable(name: String) {
    val executable = System.getenv("PATH").orEmpty()
        .split(File.pathSeparatorChar)
        .asSequence()
        .filter(String::isNotBlank)
        .map { Path.of(it).resolve(name) }
        .firstOrNull(Files::isExecutable)
    if (executable == null) {
        integrationFailure("Required executable '$name' is unavailable in PATH; install grim before running the test")
    }
}

private fun requireGeneratedDescriptor(
    expectedName: String,
    descriptor: () -> MemorySegment,
): MemorySegment {
    val generatedDescriptor = try {
        descriptor()
    } catch (throwable: Throwable) {
        integrationFailure(
            "Generated $expectedName descriptor is unavailable; regenerate the Wayland protocol sources and verify libwayland",
            throwable,
        )
    }
    val actualName = descriptorName(generatedDescriptor)
    if (actualName != expectedName) {
        integrationFailure("Generated descriptor mismatch: expected '$expectedName', found '$actualName'")
    }
    return generatedDescriptor
}

private fun requireCoreDescriptor(expectedName: String): MemorySegment {
    val lookup = libWaylandClient
        ?: integrationFailure("libwayland-client.so.0 is unavailable while resolving $expectedName")
    val descriptor = lookup.find("${expectedName}_interface").orElse(null)
        ?: integrationFailure("libwayland does not expose the required ${expectedName}_interface descriptor")
    val actualName = descriptorName(descriptor)
    if (actualName != expectedName) {
        integrationFailure("Core descriptor mismatch: expected '$expectedName', found '$actualName'")
    }
    return descriptor
}

private fun descriptorName(descriptor: MemorySegment): String = try {
    val nameAddress = descriptor.reinterpret(ValueLayout.ADDRESS.byteSize())
        .get(ValueLayout.ADDRESS, 0L)
    if (nameAddress == MemorySegment.NULL || nameAddress.address() == 0L) {
        integrationFailure("Wayland interface descriptor has a null name pointer")
    }
    nameAddress.reinterpret(256).getString(0)
} catch (throwable: Throwable) {
    integrationFailure("Could not read a Wayland interface descriptor name", throwable)
}

private fun requireGlobal(
    events: WaylandIntegrationRegistryEvents,
    interfaceName: String,
): WaylandIntegrationGlobal = events.globals[interfaceName]
    ?: integrationFailure(
        "Compositor does not advertise required global '$interfaceName'; available globals: " +
            events.globals.keys.sorted().joinToString(),
    )

private fun requireProxy(proxy: Long, interfaceName: String) {
    if (proxy == 0L) integrationFailure("Failed to create or bind Wayland proxy '$interfaceName'")
}

private fun requireListener(proxy: Long, listener: MemorySegment, interfaceName: String) {
    if (!proxyAddListener(proxy, listener)) {
        integrationFailure("wl_proxy_add_listener failed for '$interfaceName'")
    }
}

private fun proxyVersion(proxy: Long): Int {
    val getVersion = wlProxyGetVersion
        ?: integrationFailure("libwayland symbol 'wl_proxy_get_version' is unavailable")
    return try {
        getVersion.invokeExact(MemorySegment.ofAddress(proxy)) as Int
    } catch (throwable: Throwable) {
        integrationFailure("wl_proxy_get_version failed for proxy 0x${proxy.toString(16)}", throwable)
    }
}

private fun createSurface(compositor: Long): Long {
    val createSurface = wlCompositorCreateSurface
        ?: integrationFailure("libwayland marshal handle for wl_compositor.create_surface is unavailable")
    val surfaceDescriptor = wlSurfaceInterface
        ?: integrationFailure("libwayland does not expose wl_surface_interface")
    return try {
        val result = createSurface.invokeExact(
            MemorySegment.ofAddress(compositor),
            WL_COMPOSITOR_CREATE_SURFACE,
            surfaceDescriptor,
            proxyVersion(compositor),
            0,
            MemorySegment.NULL,
        ) as MemorySegment
        result.address().also { requireProxy(it, "wl_surface") }
    } catch (throwable: Throwable) {
        integrationFailure("wl_compositor.create_surface failed", throwable)
    }
}

private fun createXdgSurface(wmBase: Long, surface: Long, descriptor: MemorySegment): Long {
    val marshal = wlProxyMarshalFlagsGetXdgSurface
        ?: integrationFailure("libwayland marshal handle for xdg_wm_base.get_xdg_surface is unavailable")
    return try {
        val result = marshal.invokeExact(
            MemorySegment.ofAddress(wmBase),
            XDG_WM_BASE_GET_XDG_SURFACE,
            descriptor,
            proxyVersion(wmBase),
            0,
            MemorySegment.NULL,
            MemorySegment.ofAddress(surface),
        ) as MemorySegment
        result.address().also { requireProxy(it, "xdg_surface") }
    } catch (throwable: Throwable) {
        integrationFailure("xdg_wm_base.get_xdg_surface failed", throwable)
    }
}

private fun createToplevel(xdgSurface: Long, descriptor: MemorySegment): Long {
    val marshal = wlProxyMarshalNewId
        ?: integrationFailure("libwayland marshal handle for xdg_surface.get_toplevel is unavailable")
    return try {
        val result = marshal.invokeExact(
            MemorySegment.ofAddress(xdgSurface),
            XDG_SURFACE_GET_TOPLEVEL,
            descriptor,
            proxyVersion(xdgSurface),
            0,
            MemorySegment.NULL,
        ) as MemorySegment
        result.address().also { requireProxy(it, "xdg_toplevel") }
    } catch (throwable: Throwable) {
        integrationFailure("xdg_surface.get_toplevel failed", throwable)
    }
}

private fun createFrameCallback(surface: Long, descriptor: MemorySegment): Long {
    val marshal = wlProxyMarshalNewId
        ?: integrationFailure("libwayland marshal handle for wl_surface.frame is unavailable")
    return try {
        val result = marshal.invokeExact(
            MemorySegment.ofAddress(surface),
            WL_SURFACE_FRAME,
            descriptor,
            proxyVersion(surface),
            0,
            MemorySegment.NULL,
        ) as MemorySegment
        result.address().also { requireProxy(it, "wl_callback") }
    } catch (throwable: Throwable) {
        integrationFailure("wl_surface.frame failed", throwable)
    }
}

private val integrationWlShmCreatePool by lazy {
    libWaylandDowncall(
        "wl_proxy_marshal_flags",
        FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
        ),
    )
}

private val integrationWlShmPoolCreateBuffer by lazy {
    libWaylandDowncall(
        "wl_proxy_marshal_flags",
        FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
        ),
    )
}

private fun createIntegrationShmPool(shm: Long, fd: Int, size: Int): Long {
    val marshal = integrationWlShmCreatePool
        ?: integrationFailure("libwayland marshal handle for wl_shm.create_pool is unavailable")
    val descriptor = wlShmPoolInterface
        ?: integrationFailure("libwayland does not expose wl_shm_pool_interface")
    return try {
        val result = marshal.invokeExact(
            MemorySegment.ofAddress(shm),
            0,
            descriptor,
            proxyVersion(shm),
            0,
            MemorySegment.NULL,
            fd,
            size,
        ) as MemorySegment
        result.address().also { requireProxy(it, "wl_shm_pool") }
    } catch (throwable: Throwable) {
        integrationFailure("wl_shm.create_pool failed for fd=$fd size=$size", throwable)
    }
}

private fun createIntegrationShmBuffer(
    pool: Long,
    offset: Int,
    width: Int,
    height: Int,
    stride: Int,
    format: Int,
): Long {
    val marshal = integrationWlShmPoolCreateBuffer
        ?: integrationFailure("libwayland marshal handle for wl_shm_pool.create_buffer is unavailable")
    val descriptor = wlBufferInterface
        ?: integrationFailure("libwayland does not expose wl_buffer_interface")
    return try {
        val result = marshal.invokeExact(
            MemorySegment.ofAddress(pool),
            0,
            descriptor,
            proxyVersion(pool),
            0,
            MemorySegment.NULL,
            offset,
            width,
            height,
            stride,
            format,
        ) as MemorySegment
        result.address().also { requireProxy(it, "wl_buffer") }
    } catch (throwable: Throwable) {
        integrationFailure(
            "wl_shm_pool.create_buffer failed for ${width}x$height stride=$stride format=$format",
            throwable,
        )
    }
}

private fun marshalVoid(proxy: Long, opcode: Int, flags: Int = 0) {
    val marshal = wlProxyMarshalFlagsVoid
        ?: integrationFailure("libwayland void marshal handle is unavailable")
    try {
        marshal.invokeExact(
            MemorySegment.ofAddress(proxy),
            opcode,
            MemorySegment.NULL,
            proxyVersion(proxy),
            flags,
        )
    } catch (throwable: Throwable) {
        integrationFailure("Wayland request opcode $opcode failed for proxy 0x${proxy.toString(16)}", throwable)
    }
}

private fun marshalUint(proxy: Long, opcode: Int, value: Int) {
    val marshal = wlProxyMarshalFlagsUint
        ?: integrationFailure("libwayland uint marshal handle is unavailable")
    try {
        marshal.invokeExact(
            MemorySegment.ofAddress(proxy), opcode, MemorySegment.NULL, proxyVersion(proxy), 0, value,
        )
    } catch (throwable: Throwable) {
        integrationFailure("Wayland uint request opcode $opcode failed for proxy 0x${proxy.toString(16)}", throwable)
    }
}

private fun marshalObject(proxy: Long, opcode: Int, objectProxy: Long) {
    val marshal = wlProxyMarshalFlagsObject
        ?: integrationFailure("libwayland object marshal handle is unavailable")
    try {
        marshal.invokeExact(
            MemorySegment.ofAddress(proxy),
            opcode,
            MemorySegment.NULL,
            proxyVersion(proxy),
            0,
            if (objectProxy == 0L) MemorySegment.NULL else MemorySegment.ofAddress(objectProxy),
        )
    } catch (throwable: Throwable) {
        integrationFailure("Wayland object request opcode $opcode failed for proxy 0x${proxy.toString(16)}", throwable)
    }
}

private fun marshalString(proxy: Long, opcode: Int, value: String, arena: Arena) {
    val marshal = wlProxyMarshalFlagsString
        ?: integrationFailure("libwayland string marshal handle is unavailable")
    try {
        marshal.invokeExact(
            MemorySegment.ofAddress(proxy),
            opcode,
            MemorySegment.NULL,
            proxyVersion(proxy),
            0,
            arena.allocateFrom(value),
        )
    } catch (throwable: Throwable) {
        integrationFailure("Wayland string request opcode $opcode failed for proxy 0x${proxy.toString(16)}", throwable)
    }
}

private fun marshalFourInt(proxy: Long, opcode: Int, first: Int, second: Int, third: Int, fourth: Int) {
    val marshal = wlProxyMarshalFlagsFourInt
        ?: integrationFailure("libwayland four-int marshal handle is unavailable")
    try {
        marshal.invokeExact(
            MemorySegment.ofAddress(proxy),
            opcode,
            MemorySegment.NULL,
            proxyVersion(proxy),
            0,
            first,
            second,
            third,
            fourth,
        )
    } catch (throwable: Throwable) {
        integrationFailure("Wayland four-int request opcode $opcode failed for proxy 0x${proxy.toString(16)}", throwable)
    }
}

private fun destroyProtocolProxy(proxy: Long, destructorOpcode: Int) {
    marshalVoid(proxy, destructorOpcode, WL_MARSHAL_FLAG_DESTROY)
}

private fun fillQuadrants(memory: MemorySegment) {
    for (y in 0 until TEST_HEIGHT) {
        for (x in 0 until TEST_WIDTH) {
            val color = when {
                y < TEST_HEIGHT / 2 && x < TEST_WIDTH / 2 -> TOP_LEFT_COLOR
                y < TEST_HEIGHT / 2 -> TOP_RIGHT_COLOR
                x < TEST_WIDTH / 2 -> BOTTOM_LEFT_COLOR
                else -> BOTTOM_RIGHT_COLOR
            }
            val offset = y.toLong() * TEST_STRIDE + x.toLong() * Int.SIZE_BYTES
            memory.set(ValueLayout.JAVA_INT, offset, color)
        }
    }
}

private fun dispatchUntil(
    display: Long,
    description: String,
    condition: () -> Boolean,
    callbackFailure: () -> Throwable?,
) {
    val getFd = wlDisplayGetFd
        ?: integrationFailure("libwayland symbol 'wl_display_get_fd' is unavailable")
    val prepareRead = wlDisplayPrepareRead
        ?: integrationFailure("libwayland symbol 'wl_display_prepare_read' is unavailable")
    val readEvents = wlDisplayReadEvents
        ?: integrationFailure("libwayland symbol 'wl_display_read_events' is unavailable")
    val cancelRead = wlDisplayCancelRead
        ?: integrationFailure("libwayland symbol 'wl_display_cancel_read' is unavailable")
    val dispatchPending = wlDisplayDispatchPending
        ?: integrationFailure("libwayland symbol 'wl_display_dispatch_pending' is unavailable")
    val flush = wlDisplayFlush
        ?: integrationFailure("libwayland symbol 'wl_display_flush' is unavailable")
    val displaySegment = MemorySegment.ofAddress(display)
    val displayFd = try {
        getFd.invokeExact(displaySegment) as Int
    } catch (throwable: Throwable) {
        integrationFailure("wl_display_get_fd failed while waiting for $description", throwable)
    }
    if (displayFd < 0) integrationFailure("wl_display_get_fd returned $displayFd while waiting for $description")

    val deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(EVENT_TIMEOUT_MILLIS)
    Arena.ofConfined().use { pollArena ->
        val pollFd = pollArena.allocate(8, ValueLayout.JAVA_INT.byteAlignment())
        pollFd.set(ValueLayout.JAVA_INT, 0L, displayFd)
        pollFd.set(ValueLayout.JAVA_SHORT, 4L, POLLIN.toShort())
        var readPrepared = false
        try {
            while (!condition()) {
                callbackFailure()?.let {
                    integrationFailure("A Wayland callback failed while waiting for $description", it)
                }
                while ((prepareRead.invokeExact(displaySegment) as Int) != 0) {
                    val dispatched = dispatchPending.invokeExact(displaySegment) as Int
                    if (dispatched < 0) {
                        integrationFailure("wl_display_dispatch_pending failed while waiting for $description")
                    }
                    callbackFailure()?.let {
                        integrationFailure("A Wayland callback failed while waiting for $description", it)
                    }
                    if (condition()) return
                }
                readPrepared = true

                if (condition()) {
                    cancelRead.invokeExact(displaySegment)
                    readPrepared = false
                    return
                }
                val flushed = flush.invokeExact(displaySegment) as Int
                if (flushed < 0) integrationFailure("wl_display_flush failed while waiting for $description")

                val remainingNanos = deadline - System.nanoTime()
                if (remainingNanos <= 0L) {
                    integrationFailure("Timed out after ${EVENT_TIMEOUT_MILLIS}ms waiting for $description")
                }
                val remainingMillis = TimeUnit.NANOSECONDS.toMillis(remainingNanos)
                    .coerceIn(1L, Int.MAX_VALUE.toLong())
                    .toInt()
                pollFd.set(ValueLayout.JAVA_SHORT, 6L, 0)
                val pollResult = try {
                    invokeNativePoll(pollFd, 1L, remainingMillis)
                } catch (throwable: Throwable) {
                    integrationFailure("POSIX poll failed while waiting for $description", throwable)
                }
                if (pollResult.value == 0) {
                    integrationFailure("Timed out after ${EVENT_TIMEOUT_MILLIS}ms waiting for $description")
                }
                if (pollResult.value < 0) {
                    integrationFailure(
                        "POSIX poll failed while waiting for $description (errno=${pollResult.errno})",
                    )
                }
                val revents = pollFd.get(ValueLayout.JAVA_SHORT, 6L).toInt()
                val terminalEvents = revents and (POLLERR or POLLHUP or POLLNVAL)
                if (terminalEvents != 0) {
                    integrationFailure(
                        "Wayland display fd reported terminal poll events 0x${terminalEvents.toString(16)} " +
                            "while waiting for $description",
                    )
                }
                if (revents and POLLIN == 0) {
                    integrationFailure(
                        "Wayland display fd became ready without POLLIN while waiting for $description " +
                            "(revents=0x${revents.toString(16)})",
                    )
                }

                val readResult = readEvents.invokeExact(displaySegment) as Int
                readPrepared = false
                if (readResult < 0) {
                    integrationFailure("wl_display_read_events failed while waiting for $description")
                }
                val dispatched = dispatchPending.invokeExact(displaySegment) as Int
                if (dispatched < 0) {
                    integrationFailure("wl_display_dispatch_pending failed while waiting for $description")
                }
            }
            callbackFailure()?.let {
                integrationFailure("A Wayland callback failed while waiting for $description", it)
            }
        } finally {
            if (readPrepared) {
                try {
                    cancelRead.invokeExact(displaySegment)
                } catch (_: Throwable) {
                    // Preserve the primary timeout or protocol failure.
                }
            }
        }
    }
}

private fun captureWithGrim(screenshot: Path, grimLog: Path) {
    val process = try {
        ProcessBuilder("grim", screenshot.toString())
            .redirectErrorStream(true)
            .redirectOutput(grimLog.toFile())
            .start()
    } catch (exception: IOException) {
        integrationFailure("Could not launch required executable 'grim'; verify PATH", exception)
    }
    if (!process.waitFor(GRIM_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
        process.destroyForcibly()
        process.waitFor(5, TimeUnit.SECONDS)
        integrationFailure("grim timed out after ${GRIM_TIMEOUT_SECONDS}s; inspect compositor.log and $grimLog")
    }
    if (process.exitValue() != 0) {
        val output = runCatching { Files.readString(grimLog) }.getOrDefault("<grim log unavailable>")
        integrationFailure("grim exited with code ${process.exitValue()}: $output")
    }
    if (!Files.isRegularFile(screenshot) || Files.size(screenshot) == 0L) {
        integrationFailure("grim reported success but did not create a non-empty PNG at $screenshot")
    }
}

private fun assertPixel(actualArgb: Int, expectedRgb: Int, quadrant: String) {
    assertEquals(
        expectedRgb,
        actualArgb and 0x00ffffff,
        "Unexpected representative pixel in the $quadrant quadrant",
    )
}

private fun appendLog(path: Path, message: String) {
    try {
        Files.writeString(path, message, StandardOpenOption.CREATE, StandardOpenOption.APPEND)
    } catch (throwable: Throwable) {
        integrationFailure("Could not write Wayland integration log at $path", throwable)
    }
}

private fun registryListener(events: WaylandIntegrationRegistryEvents, arena: Arena): MemorySegment {
    val global = listenerStub(
        events,
        "onGlobal",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
        ),
        arena,
    )
    val globalRemove = listenerStub(
        events,
        "onGlobalRemove",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        arena,
    )
    return listenerArray(arena, global, globalRemove)
}

private fun wmBaseListener(events: WaylandIntegrationWmBaseEvents, arena: Arena): MemorySegment = listenerArray(
    arena,
    listenerStub(
        events,
        "onPing",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        arena,
    ),
)

private fun xdgSurfaceListener(
    events: WaylandIntegrationXdgSurfaceEvents,
    arena: Arena,
): MemorySegment = listenerArray(
    arena,
    listenerStub(
        events,
        "onConfigure",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        arena,
    ),
)

private fun toplevelListener(events: WaylandIntegrationToplevelEvents, arena: Arena): MemorySegment {
    val configure = listenerStub(
        events,
        "onConfigure",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
            Int::class.javaPrimitiveType!!,
            MemorySegment::class.java,
        ),
        FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
        ),
        arena,
    )
    val close = listenerStub(
        events,
        "onClose",
        arrayOf(MemorySegment::class.java, MemorySegment::class.java),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        arena,
    )
    val configureBounds = listenerStub(
        events,
        "onConfigureBounds",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
        ),
        arena,
    )
    val wmCapabilities = listenerStub(
        events,
        "onWmCapabilities",
        arrayOf(MemorySegment::class.java, MemorySegment::class.java, MemorySegment::class.java),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        arena,
    )
    return listenerArray(arena, configure, close, configureBounds, wmCapabilities)
}

private fun surfaceListener(events: WaylandIntegrationSurfaceEvents, arena: Arena): MemorySegment {
    val enter = listenerStub(
        events,
        "onEnter",
        arrayOf(MemorySegment::class.java, MemorySegment::class.java, MemorySegment::class.java),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        arena,
    )
    val leave = listenerStub(
        events,
        "onLeave",
        arrayOf(MemorySegment::class.java, MemorySegment::class.java, MemorySegment::class.java),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        arena,
    )
    val preferredBufferScale = listenerStub(
        events,
        "onPreferredBufferScale",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        arena,
    )
    val preferredBufferTransform = listenerStub(
        events,
        "onPreferredBufferTransform",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        arena,
    )
    return listenerArray(arena, enter, leave, preferredBufferScale, preferredBufferTransform)
}

private fun shmListener(events: WaylandIntegrationShmEvents, arena: Arena): MemorySegment = listenerArray(
    arena,
    listenerStub(
        events,
        "onFormat",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        arena,
    ),
)

private fun bufferListener(events: WaylandIntegrationBufferEvents, arena: Arena): MemorySegment = listenerArray(
    arena,
    listenerStub(
        events,
        "onRelease",
        arrayOf(MemorySegment::class.java, MemorySegment::class.java),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        arena,
    ),
)

private fun frameListener(events: WaylandIntegrationFrameEvents, arena: Arena): MemorySegment = listenerArray(
    arena,
    listenerStub(
        events,
        "onDone",
        arrayOf(
            MemorySegment::class.java,
            MemorySegment::class.java,
            Int::class.javaPrimitiveType!!,
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
        arena,
    ),
)

private fun listenerStub(
    receiver: Any,
    methodName: String,
    parameterTypes: Array<Class<*>>,
    descriptor: FunctionDescriptor,
    arena: Arena,
): MemorySegment {
    val methodType = MethodType.methodType(Void.TYPE, parameterTypes.toList())
    val handle = try {
        MethodHandles.lookup()
            .findVirtual(receiver.javaClass, methodName, methodType)
            .bindTo(receiver)
    } catch (throwable: Throwable) {
        integrationFailure("Could not resolve listener callback ${receiver.javaClass.simpleName}.$methodName", throwable)
    }
    return try {
        upcallStub(handle, descriptor, arena)
    } catch (throwable: Throwable) {
        integrationFailure("Could not create listener callback ${receiver.javaClass.simpleName}.$methodName", throwable)
    }
}

private fun listenerArray(arena: Arena, vararg callbacks: MemorySegment): MemorySegment {
    val pointerSize = ValueLayout.ADDRESS.byteSize()
    val listener = arena.allocate(pointerSize * callbacks.size, ValueLayout.ADDRESS.byteAlignment())
    callbacks.forEachIndexed { index, callback ->
        listener.set(ValueLayout.ADDRESS, pointerSize * index, callback)
    }
    return listener
}

private fun integrationFailure(message: String, cause: Throwable? = null): Nothing =
    throw AssertionError(message, cause)
