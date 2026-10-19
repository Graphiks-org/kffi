package org.graphiks.kffi.win32.managed

import java.lang.foreign.Linker
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.*

class Win32DisplaysIntegrationTest {
    @BeforeTest fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }

    @Test fun diagEnumDirect() {
        org.graphiks.kffi.win32.generated.init()
        java.lang.foreign.Arena.ofConfined().use { arena ->
            val seen = java.util.concurrent.atomic.AtomicInteger()
            val descriptor = java.lang.foreign.FunctionDescriptor.of(
                java.lang.foreign.ValueLayout.JAVA_INT,
                java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS,
                java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG)
            val dispatcher = java.lang.invoke.MethodHandles.lookup().findStatic(
                Win32DisplaysIntegrationTest::class.java, "diagCb",
                java.lang.invoke.MethodType.methodType(Int::class.javaPrimitiveType,
                    java.lang.foreign.MemorySegment::class.java, java.lang.foreign.MemorySegment::class.java,
                    java.lang.foreign.MemorySegment::class.java, Long::class.javaPrimitiveType))
            val stub = java.lang.foreign.Linker.nativeLinker().upcallStub(dispatcher, descriptor, arena)
            val rc = org.graphiks.kffi.win32.generated.EnumDisplayMonitors(
                java.lang.foreign.MemorySegment.NULL, java.lang.foreign.MemorySegment.NULL, stub, 0L)
            println("DIAG rc=$rc seen=${seen.get()} lastError=${org.graphiks.kffi.win32.generated.GetLastError()}")
        }
    }

    @Test fun realInventoryEnumeratesAtLeastThePrimaryWithRealModes() {
        val snapshot = Win32Displays.snapshot()
        assertTrue(snapshot.isNotEmpty(), "at least one monitor must enumerate")
        val primary = snapshot.first()
        assertTrue(primary.right > primary.left && primary.bottom > primary.top, "bounds must be non-degenerate")
        assertTrue(primary.scale > 0.0, "per-monitor scale must be readable")
        assertTrue(primary.modes.isNotEmpty(), "the mode walk must find modes")
        val current = assertNotNull(primary.current, "ENUM_CURRENT_SETTINGS must resolve a current mode")
        assertTrue(primary.modes.any { it.width == current.width && it.height == current.height && it.hz == current.hz },
            "the current mode must appear among the enumerated modes")
    }

    internal companion object {
        @JvmStatic
        public fun diagCb(hmon: java.lang.foreign.MemorySegment, hdc: java.lang.foreign.MemorySegment, rect: java.lang.foreign.MemorySegment, data: Long): Int {
            println("DIAG cb hmon=${hmon.address()}")
            return 1
        }
    }
}
