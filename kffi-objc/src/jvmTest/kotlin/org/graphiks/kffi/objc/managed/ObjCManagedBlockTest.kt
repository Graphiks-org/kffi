package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertSame
import kotlin.test.assertTrue

class ObjCManagedBlockTest {
    @Test
    fun sixFiniteBlockSignaturesDeliverTypedBorrowedArguments() {
        requireMacOS()
        val observations = mutableListOf<String>()
        val blocks = listOf(
            ObjCManagedBlock.voidError(RecordingSetter()) { error ->
                observations += "error:${error?.ptr?.address()}"
            },
            ObjCManagedBlock.voidObjectObject(RecordingSetter()) { first, second ->
                observations += "objects:${first?.ptr?.address()}:${second?.ptr?.address()}"
            },
            ObjCManagedBlock.voidObjectObjectObject(RecordingSetter()) { first, second, third ->
                observations +=
                    "three:${first?.ptr?.address()}:${second?.ptr?.address()}:${third?.ptr?.address()}"
            },
            ObjCManagedBlock.voidObjectFloatBoolean(RecordingSetter()) { value, amount, enabled ->
                observations += "float-bool:${value?.ptr?.address()}:$amount:$enabled"
            },
            ObjCManagedBlock.voidObjectFloat(RecordingSetter()) { value, amount ->
                observations += "float:${value?.ptr?.address()}:$amount"
            },
            ObjCManagedBlock.voidObjectFloatFloat(RecordingSetter()) { value, first, second ->
                observations += "floats:${value?.ptr?.address()}:$first:$second"
            },
        )
        val setters = blocks.map { it.setterForTest() }

        try {
            BlockTestRuntime.invokeError(setters[0].current, address(101))
            BlockTestRuntime.invokeObjectObject(setters[1].current, address(201), address(202))
            BlockTestRuntime.invokeObjectObjectObject(
                setters[2].current,
                address(301),
                address(302),
                address(303),
            )
            BlockTestRuntime.invokeObjectFloatBoolean(
                setters[3].current,
                address(401),
                1.5f,
                true,
            )
            BlockTestRuntime.invokeObjectFloat(setters[4].current, address(501), 2.5f)
            BlockTestRuntime.invokeObjectFloatFloat(setters[5].current, address(601), 3.5f, 4.5f)

            assertEquals(
                listOf(
                    "error:101",
                    "objects:201:202",
                    "three:301:302:303",
                    "float-bool:401:1.5:true",
                    "float:501:2.5",
                    "floats:601:3.5:4.5",
                ),
                observations,
            )
        } finally {
            blocks.forEach(ObjCManagedBlock<*>::close)
        }
    }

    @Test
    fun closeClearsSetterBeforeReleaseAndRevokesRetainedNativeCopy() {
        requireMacOS()
        val invocations = AtomicInteger()
        val events = mutableListOf<String>()
        val setter = RecordingSetter(events)
        val releaseObservation = ObjCManagedBlockNativeLifetime.installReleaseObserverForTest {
            events += "release"
        }
        val block = ObjCManagedBlock.voidObjectFloat(setter) { _, _ ->
            invocations.incrementAndGet()
        }
        val retained = BlockTestRuntime.copy(setter.current)

        try {
            block.close()
            block.close()
            BlockTestRuntime.invokeObjectFloat(retained, MemorySegment.NULL, 1.0f)

            assertTrue(block.isClosed)
            assertTrue(block.isQuiescent)
            assertEquals(0, invocations.get())
            assertEquals(listOf("set", "clear", "release"), events)
            assertEquals(MemorySegment.NULL, setter.current)
        } finally {
            BlockTestRuntime.release(retained)
            block.close()
            releaseObservation.close()
        }
    }

    @Test
    fun closeDefersNativeReleaseUntilAdmittedCallbackReturns() {
        requireMacOS()
        val setter = RecordingSetter()
        val entered = CountDownLatch(1)
        val resume = CountDownLatch(1)
        val released = CountDownLatch(1)
        val releaseObservation = ObjCManagedBlockNativeLifetime.installReleaseObserverForTest {
            released.countDown()
        }
        val block = ObjCManagedBlock.voidObjectFloat(setter) { _, _ ->
            entered.countDown()
            assertTrue(resume.await(5, TimeUnit.SECONDS))
        }
        val executor = Executors.newSingleThreadExecutor()

        try {
            val delivery = executor.submit {
                BlockTestRuntime.invokeObjectFloat(setter.current, MemorySegment.NULL, 2.0f)
            }
            assertTrue(entered.await(5, TimeUnit.SECONDS))

            block.close()

            assertTrue(block.isClosed)
            assertFalse(block.isQuiescent)
            assertEquals(MemorySegment.NULL, setter.current)
            assertFalse(released.await(100, TimeUnit.MILLISECONDS))

            resume.countDown()
            delivery.get(5, TimeUnit.SECONDS)

            assertTrue(released.await(5, TimeUnit.SECONDS))
            assertTrue(block.isQuiescent)
        } finally {
            resume.countDown()
            block.close()
            executor.shutdownNow()
            releaseObservation.close()
        }
    }

    @Test
    fun concurrentCloseWaitsForSetterClearAndAdmissionRevocation() {
        requireMacOS()
        val clearEntered = CountDownLatch(1)
        val allowClear = CountDownLatch(1)
        val secondStarted = CountDownLatch(1)
        val secondReturned = CountDownLatch(1)
        val setter = BlockingClearSetter(clearEntered, allowClear)
        val invocations = AtomicInteger()
        val block = ObjCManagedBlock.voidObjectFloat(setter) { _, _ ->
            invocations.incrementAndGet()
        }
        val retained = BlockTestRuntime.copy(setter.current)
        val executor = Executors.newFixedThreadPool(2)

        try {
            val firstClose = executor.submit { block.close() }
            assertTrue(clearEntered.await(5, TimeUnit.SECONDS))
            val secondClose = executor.submit {
                try {
                    secondStarted.countDown()
                    block.close()
                } finally {
                    secondReturned.countDown()
                }
            }

            assertTrue(secondStarted.await(5, TimeUnit.SECONDS))
            assertFalse(secondReturned.await(100, TimeUnit.MILLISECONDS))
            assertFalse(block.isClosed)

            allowClear.countDown()
            firstClose.get(5, TimeUnit.SECONDS)
            secondClose.get(5, TimeUnit.SECONDS)

            assertTrue(block.isClosed)
            BlockTestRuntime.invokeObjectFloat(retained, MemorySegment.NULL, 3.0f)
            assertEquals(0, invocations.get())
        } finally {
            allowClear.countDown()
            block.close()
            BlockTestRuntime.release(retained)
            executor.shutdownNow()
        }
    }

    @Test
    fun callbackExceptionIsReportedAndDoesNotCrossNativeInvocation() {
        requireMacOS()
        val setter = RecordingSetter()
        val expected = IllegalStateException("managed block failed")
        var observed: Throwable? = null
        val block = ObjCManagedBlock.voidObjectObject(
            setter = setter,
            onError = CallbackExceptionHandler { observed = it },
        ) { _, _ ->
            throw expected
        }

        try {
            BlockTestRuntime.invokeObjectObject(
                setter.current,
                MemorySegment.NULL,
                MemorySegment.NULL,
            )

            assertSame(expected, observed)
        } finally {
            block.close()
        }
    }

    private fun requireMacOS() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C block runtime tests require macOS",
        )
    }

    private fun address(value: Long): MemorySegment = MemorySegment.ofAddress(value)
}

private class RecordingSetter(
    val events: MutableList<String> = mutableListOf(),
) : ObjCManagedBlockSetter {
    var current: MemorySegment = MemorySegment.NULL

    override fun set(block: MemorySegment) {
        current = block
        events += if (block == MemorySegment.NULL) "clear" else "set"
    }
}

private class BlockingClearSetter(
    private val clearEntered: CountDownLatch,
    private val allowClear: CountDownLatch,
) : ObjCManagedBlockSetter {
    @Volatile
    var current: MemorySegment = MemorySegment.NULL

    override fun set(block: MemorySegment) {
        if (block == MemorySegment.NULL) {
            clearEntered.countDown()
            check(allowClear.await(5, TimeUnit.SECONDS)) { "Timed out waiting to clear block setter" }
        }
        current = block
    }
}

private fun ObjCManagedBlock<*>.setterForTest(): RecordingSetter =
    requireNotNull(setter as? RecordingSetter)

private object BlockTestRuntime {
    private const val BLOCK_INVOKE_OFFSET = 16L
    private const val BLOCK_LITERAL_SIZE = 32L
    private val arena = Arena.global()
    private val linker = Linker.nativeLinker()
    private val symbols = SymbolLookup.libraryLookup("/usr/lib/libSystem.B.dylib", arena)
    private val copy = linker.downcallHandle(
        symbols.find("_Block_copy").orElseThrow(),
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val release = linker.downcallHandle(
        symbols.find("_Block_release").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
    )

    fun copy(block: MemorySegment): MemorySegment = copy.invokeExact(block) as MemorySegment

    fun release(block: MemorySegment) {
        release.invokeExact(block)
    }

    fun invokeError(block: MemorySegment, error: MemorySegment) {
        invoke(block, FunctionDescriptor.ofVoid(ValueLayout.ADDRESS), error)
    }

    fun invokeObjectObject(block: MemorySegment, first: MemorySegment, second: MemorySegment) {
        invoke(
            block,
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            first,
            second,
        )
    }

    fun invokeObjectObjectObject(
        block: MemorySegment,
        first: MemorySegment,
        second: MemorySegment,
        third: MemorySegment,
    ) {
        invoke(
            block,
            FunctionDescriptor.ofVoid(
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
            ),
            first,
            second,
            third,
        )
    }

    fun invokeObjectFloatBoolean(
        block: MemorySegment,
        value: MemorySegment,
        amount: Float,
        enabled: Boolean,
    ) {
        invoke(
            block,
            FunctionDescriptor.ofVoid(
                ValueLayout.ADDRESS,
                ValueLayout.JAVA_FLOAT,
                ValueLayout.JAVA_BOOLEAN,
            ),
            value,
            amount,
            enabled,
        )
    }

    fun invokeObjectFloat(block: MemorySegment, value: MemorySegment, amount: Float) {
        invoke(
            block,
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT),
            value,
            amount,
        )
    }

    fun invokeObjectFloatFloat(
        block: MemorySegment,
        value: MemorySegment,
        first: Float,
        second: Float,
    ) {
        invoke(
            block,
            FunctionDescriptor.ofVoid(
                ValueLayout.ADDRESS,
                ValueLayout.JAVA_FLOAT,
                ValueLayout.JAVA_FLOAT,
            ),
            value,
            first,
            second,
        )
    }

    private fun invoke(
        block: MemorySegment,
        descriptorWithoutBlock: FunctionDescriptor,
        vararg arguments: Any,
    ) {
        val literal = block.reinterpret(BLOCK_LITERAL_SIZE)
        val function = literal.get(ValueLayout.ADDRESS, BLOCK_INVOKE_OFFSET)
        val descriptor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            *descriptorWithoutBlock.argumentLayouts().toTypedArray(),
        )
        linker.downcallHandle(function, descriptor).invokeWithArguments(block, *arguments)
    }
}
