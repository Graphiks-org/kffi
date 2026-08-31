package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference
import java.net.URL
import java.net.URLClassLoader
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ObjCManagedClassLoaderTest {
    @Test
    fun secondIsolatedLoaderReceivesItsOwnNativeObjectiveCMessage() {
        requireMacOS()
        ClassLoaderProbe.runTwice(
            selector = "kffiCrossLoaderDecision:",
            expected = listOf(true, false),
        )
    }

    @Test
    fun closedQuiescentIsolatedLoadersBecomeCollectable() {
        requireMacOS()
        val references = ClassLoaderProbe.runTwice(
            selector = "kffiCollectableLoaderDecision:",
            expected = listOf(true, false),
        )

        ClassLoaderProbe.assertEventuallyCollected(references)
    }

    private fun requireMacOS() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )
    }
}

private object ClassLoaderProbe {
    fun runTwice(selector: String, expected: List<Boolean>): List<LoaderReference> {
        assertEquals(2, expected.size)
        val queue = ReferenceQueue<ClassLoader>()
        return expected.mapIndexed { index, decision ->
            runIsolated(index, selector, decision, queue)
        }
    }

    fun assertEventuallyCollected(references: List<LoaderReference>) {
        val deadline = System.nanoTime() + java.util.concurrent.TimeUnit.SECONDS.toNanos(10)
        val pressure = ArrayDeque<ByteArray>()
        while (references.any { it.get() != null } && System.nanoTime() < deadline) {
            System.gc()
            pressure += ByteArray(1024 * 1024)
            if (pressure.size > 16) pressure.removeFirst()
            references.first().queue.remove(25)
        }
        val retained = references.mapIndexedNotNull { index, reference ->
            if (reference.get() == null) null else index + 1
        }
        assertTrue(retained.isEmpty(), "isolated loaders remained reachable after quiescence: $retained")
    }

    private fun runIsolated(
        index: Int,
        selector: String,
        decision: Boolean,
        queue: ReferenceQueue<ClassLoader>,
    ): LoaderReference {
        val loader = IsolatedObjCClassLoader(classPath())
        try {
            val target = loader.loadClass(IsolatedManagedClassProbe::class.java.name)
            val run = target.getDeclaredMethod("run", String::class.java, Boolean::class.javaPrimitiveType)
            val observations = run.invoke(null, selector, decision) as BooleanArray

            assertEquals(decision, observations[0], "loader ${index + 1} returned the wrong decision")
            assertTrue(observations[1], "loader ${index + 1} did not invoke its own handler exactly once")
        } finally {
            loader.close()
        }
        return LoaderReference(loader, queue)
    }

    private fun classPath(): Array<URL> = arrayOf(
        ObjCManagedClassLoaderTest::class.java.protectionDomain.codeSource.location,
        ObjCManagedClass::class.java.protectionDomain.codeSource.location,
    ).distinct().toTypedArray()
}

private class LoaderReference(
    loader: ClassLoader,
    val queue: ReferenceQueue<ClassLoader>,
) : WeakReference<ClassLoader>(loader, queue)

private class IsolatedObjCClassLoader(
    classPath: Array<URL>,
) : URLClassLoader(classPath, ObjCManagedClassLoaderTest::class.java.classLoader) {
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

internal object IsolatedManagedClassProbe {
    @JvmStatic
    fun run(selector: String, decision: Boolean): BooleanArray {
        val managedClass = ObjCManagedClass.registerOnce(
            methods = mapOf(selector to ObjCMethodSignatures.BooleanObject),
        )
        val retired = managedClass.createInstance {
            onBooleanObject(selector, fallback = decision) { !decision }
        }
        retired.close()
        check(retired.isQuiescent) { "Retired managed instance did not reach quiescence" }

        val invocations = AtomicInteger()
        val fallback = !decision
        val instance = managedClass.createInstance {
            onBooleanObject(selector, fallback = fallback) {
                invocations.incrementAndGet()
                decision
            }
        }

        return try {
            val result = ObjCRuntime.msgSend(
                ValueLayout.JAVA_BOOLEAN,
                instance.receiver.ptr,
                ObjCRuntime.sel(selector),
                MemorySegment.NULL,
            ) as Boolean
            booleanArrayOf(result, invocations.get() == 1)
        } finally {
            instance.close()
            check(instance.isQuiescent) { "Managed instance did not reach quiescence" }
        }
    }
}
