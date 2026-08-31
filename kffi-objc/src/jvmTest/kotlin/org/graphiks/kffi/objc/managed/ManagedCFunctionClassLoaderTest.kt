package org.graphiks.kffi.objc.managed

import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference
import java.net.URL
import java.net.URLClassLoader
import java.util.concurrent.TimeUnit
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ManagedCFunctionClassLoaderTest {
    @Test
    fun closedQuiescentManagedCFunctionDoesNotRetainItsIsolatedLoader() {
        val reference = ManagedCFunctionLoaderProbe.runIsolated()

        ManagedCFunctionLoaderProbe.assertEventuallyCollected(reference)
    }
}

private object ManagedCFunctionLoaderProbe {
    fun runIsolated(): ManagedCFunctionLoaderReference {
        val queue = ReferenceQueue<ClassLoader>()
        val loader = IsolatedManagedCFunctionClassLoader(classPath())
        try {
            val target = loader.loadClass(IsolatedManagedCFunctionProbe::class.java.name)
            val result = target.getDeclaredMethod("run").invoke(null) as Boolean
            assertEquals(true, result, "isolated managed C callback did not route its event")
        } finally {
            loader.close()
        }
        return ManagedCFunctionLoaderReference(loader, queue)
    }

    fun assertEventuallyCollected(reference: ManagedCFunctionLoaderReference) {
        val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(10)
        val pressure = ArrayDeque<ByteArray>()
        while (reference.get() != null && System.nanoTime() < deadline) {
            System.gc()
            pressure += ByteArray(1024 * 1024)
            if (pressure.size > 16) pressure.removeFirst()
            reference.queue.remove(25)
        }
        assertNull(reference.get(), "isolated loader remained reachable after callback quiescence")
    }

    private fun classPath(): Array<URL> = arrayOf(
        ManagedCFunctionClassLoaderTest::class.java.protectionDomain.codeSource.location,
        ManagedCFunction::class.java.protectionDomain.codeSource.location,
    ).distinct().toTypedArray()
}

private class ManagedCFunctionLoaderReference(
    loader: ClassLoader,
    val queue: ReferenceQueue<ClassLoader>,
) : WeakReference<ClassLoader>(loader, queue)

private class IsolatedManagedCFunctionClassLoader(
    classPath: Array<URL>,
) : URLClassLoader(classPath, ManagedCFunctionClassLoaderTest::class.java.classLoader) {
    override fun loadClass(name: String, resolve: Boolean): Class<*> {
        if (!name.startsWith("org.graphiks.kffi.objc.")) return super.loadClass(name, resolve)
        synchronized(getClassLoadingLock(name)) {
            val loaded = findLoadedClass(name)
            if (loaded != null) return loaded
            return try {
                findClass(name).also { if (resolve) resolveClass(it) }
            } catch (_: ClassNotFoundException) {
                super.loadClass(name, resolve)
            }
        }
    }
}

internal object IsolatedManagedCFunctionProbe {
    @JvmStatic
    fun run(): Boolean {
        var invoked = false
        val callback = ManagedCFunctions.eventTap { _, event ->
            invoked = true
            event
        }
        val handle = callback.eventTapNativeHandle()

        return try {
            val event = MemorySegment.ofAddress(0x1234)
            val downcall = Linker.nativeLinker().downcallHandle(
                handle.callback,
                FunctionDescriptor.of(
                    ValueLayout.ADDRESS,
                    ValueLayout.ADDRESS,
                    ValueLayout.JAVA_INT,
                    ValueLayout.ADDRESS,
                    ValueLayout.ADDRESS,
                ),
            )
            val returned = downcall.invokeExact(
                MemorySegment.NULL,
                10,
                event,
                handle.userdata,
            ) as MemorySegment
            invoked && returned == event
        } finally {
            callback.close()
            check(callback.isQuiescentForManagedAdapter())
        }
    }
}
