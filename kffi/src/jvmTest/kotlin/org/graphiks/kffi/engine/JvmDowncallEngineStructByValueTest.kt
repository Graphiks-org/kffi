@file:OptIn(ExperimentalUnsignedTypes::class)

package org.graphiks.kffi.engine

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.throwables.shouldThrow
import org.graphiks.kffi.MemoryAllocator
import org.graphiks.kffi.MemoryBuffer
import org.graphiks.kffi.NativeAddress

/**
 * Exercises the engine's struct-by-value wrappers against the C fixture: the
 * "Box" layout is registered as generated code does (registerStructLayout),
 * then the wrappers marshal the struct argument (reinterpret to the layout
 * size) and the struct return (the caller allocator's SegmentAllocator, per
 * the FFM convention).
 */
class JvmDowncallEngineStructByValueTest : FreeSpec({

    beforeSpec {
        JvmDowncallEngine.registerStructLayout(
            "Box",
            sizeBytes = 8L,
            alignmentBytes = 4L,
            fields = listOf(
                JvmDowncallEngine.StructField("a", JvmDowncallEngine.FieldKind.INT32, 0L),
                JvmDowncallEngine.StructField("b", JvmDowncallEngine.FieldKind.INT32, 4L),
            ),
        )
    }

    "struct-by-value return copies the callee result into the caller allocator" {
        MemoryAllocator().use { allocator ->
            val result = JvmDowncallEngine.callStructReturnBox(
                JvmDowncallFixture.symbol("bench_make_box"),
                allocator,
                5,
            )
            val buffer = MemoryBuffer(result, 8uL)
            buffer.readInt(0uL) shouldBe 5
            buffer.readInt(4uL) shouldBe 6
        }
    }

    "struct-by-value argument is copied from the raw struct buffer" {
        MemoryAllocator().use { allocator ->
            val box = allocator.allocateBuffer(8uL)
            box.writeInt(20, 0uL)
            box.writeInt(22, 4uL)
            JvmDowncallEngine.callStructArgBox(
                JvmDowncallFixture.symbol("bench_consume_box"),
                box.handler.rawValue,
            )
            JvmDowncallEngine.callI0(JvmDowncallFixture.symbol("bench_consume_box_get")) shouldBe 42L
        }
    }

    "registry reproduces Clang offsets with explicit padding and trailing gap" {
        JvmDowncallEngine.registerStructLayout(
            "Padded",
            sizeBytes = 16L,
            alignmentBytes = 8L,
            fields = listOf(
                JvmDowncallEngine.StructField("c", JvmDowncallEngine.FieldKind.INT8, 0L),
                JvmDowncallEngine.StructField("__pad", JvmDowncallEngine.FieldKind.PADDING, 3L),
                JvmDowncallEngine.StructField("i", JvmDowncallEngine.FieldKind.INT32, 4L),
                JvmDowncallEngine.StructField("t", JvmDowncallEngine.FieldKind.INT64, 8L),
            ),
        )
        val layout = JvmDowncallEngine.structLayout("Padded")
        layout.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("c")) shouldBe 0L
        layout.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("i")) shouldBe 4L
        layout.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("t")) shouldBe 8L
        layout.byteSize() shouldBe 16L
        layout.byteAlignment() shouldBe 8L
    }

    "registry resolves nested struct layouts through the STRUCT cName" {
        JvmDowncallEngine.registerStructLayout(
            "Inner",
            sizeBytes = 4L,
            alignmentBytes = 4L,
            fields = listOf(
                JvmDowncallEngine.StructField("x", JvmDowncallEngine.FieldKind.INT32, 0L),
            ),
        )
        JvmDowncallEngine.registerStructLayout(
            "Outer",
            sizeBytes = 12L,
            alignmentBytes = 4L,
            fields = listOf(
                JvmDowncallEngine.StructField("tag", JvmDowncallEngine.FieldKind.INT8, 0L),
                JvmDowncallEngine.StructField("__pad", JvmDowncallEngine.FieldKind.PADDING, 3L),
                JvmDowncallEngine.StructField("Inner", JvmDowncallEngine.FieldKind.STRUCT, 4L),
                JvmDowncallEngine.StructField("tail", JvmDowncallEngine.FieldKind.INT16, 8L),
                JvmDowncallEngine.StructField("__pad", JvmDowncallEngine.FieldKind.PADDING, 2L),
            ),
        )
        val layout = JvmDowncallEngine.structLayout("Outer")
        layout.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("tag")) shouldBe 0L
        layout.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("Inner")) shouldBe 4L
        layout.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("tail")) shouldBe 8L
        layout.byteSize() shouldBe 12L
        layout.byteAlignment() shouldBe 4L
    }

    "registry rejects metadata whose field sizes disagree with the declared size" {
        JvmDowncallEngine.registerStructLayout(
            "Broken",
            sizeBytes = 8L,
            alignmentBytes = 4L,
            fields = listOf(
                JvmDowncallEngine.StructField("a", JvmDowncallEngine.FieldKind.INT32, 0L),
            ),
        )
        shouldThrow<IllegalStateException> {
            JvmDowncallEngine.structLayout("Broken")
        }
    }

    "re-registering a struct layout rebuilds the cached downcall handle descriptor" {
        // The handleCache key carries a layout version. Re-registering "Box"
        // must invalidate the MethodHandle built from the old descriptor;
        // otherwise the wrapper would keep marshaling the old size (here, 8
        // bytes read from a 4-byte argument segment → IndexOutOfBoundsException).
        MemoryAllocator().use { allocator ->
            val box = allocator.allocateBuffer(8uL)
            box.writeInt(20, 0uL)
            box.writeInt(22, 4uL)
            JvmDowncallEngine.callStructArgBox(
                JvmDowncallFixture.symbol("bench_consume_box"),
                box.handler.rawValue,
            )
            JvmDowncallEngine.callI0(JvmDowncallFixture.symbol("bench_consume_box_get")) shouldBe 42L

            JvmDowncallEngine.registerStructLayout(
                "Box",
                sizeBytes = 4L,
                alignmentBytes = 4L,
                fields = listOf(
                    JvmDowncallEngine.StructField("a", JvmDowncallEngine.FieldKind.INT32, 0L),
                ),
            )
            val narrow = allocator.allocateBuffer(4uL)
            narrow.writeInt(20, 0uL)
            JvmDowncallEngine.callStructArgBox(
                JvmDowncallFixture.symbol("bench_consume_box"),
                narrow.handler.rawValue,
            )

            // Restore the canonical layout for the class's other tests.
            JvmDowncallEngine.registerStructLayout(
                "Box",
                sizeBytes = 8L,
                alignmentBytes = 4L,
                fields = listOf(
                    JvmDowncallEngine.StructField("a", JvmDowncallEngine.FieldKind.INT32, 0L),
                    JvmDowncallEngine.StructField("b", JvmDowncallEngine.FieldKind.INT32, 4L),
                ),
            )
        }
    }

    // wgpu shapes: mirror layouts for wgpu structs registered under their
    // planned names (with the same fields as the C fixture structs).

    "WGPUStringView arg after a pointer passes both (SetLabel shape)" {
        JvmDowncallEngine.registerStructLayout(
            "WGPUStringView",
            sizeBytes = 16L,
            alignmentBytes = 8L,
            fields = listOf(
                JvmDowncallEngine.StructField("data", JvmDowncallEngine.FieldKind.POINTER, 0L),
                JvmDowncallEngine.StructField("length", JvmDowncallEngine.FieldKind.UINT64, 8L),
            ),
        )
        MemoryAllocator().use { allocator ->
            val label = allocator.allocateBuffer(16uL)
            label.writePointer(NativeAddress(0x1234L), 0uL)
            label.writeLong(26, 8uL)
            JvmDowncallEngine.callStructArgWGPUStringView(
                JvmDowncallFixture.symbol("bench_set_label"),
                p1 = 0x1000L,
                structPtr = label.handler.rawValue,
            )
            JvmDowncallEngine.callI0(JvmDowncallFixture.symbol("bench_label_sink_get")) shouldBe 0x1000L + 26L
        }
    }

    "WGPUStringView arg alone returns the proc address (GetProcAddress shape)" {
        MemoryAllocator().use { allocator ->
            val name = allocator.allocateBuffer(16uL)
            name.writePointer(NativeAddress(0x5000L), 0uL) // non-null data
            name.writeLong(7, 8uL) // length = 7
            val proc = JvmDowncallEngine.callStructArgWGPUStringViewRetP(
                JvmDowncallFixture.symbol("bench_get_proc_address"),
                name.handler.rawValue,
            )
            proc shouldBe 14L
        }
    }

    "struct arg alone consumes the struct by value (FreeMembers shape)" {
        // The S|V shape of *FreeMembers functions: the wrapper marshals the
        // struct by value and the callee consumes it. The C fixture exposes
        // bench_consume_future(bench_future_t), with the same ABI as a
        // FreeMembers function (an 8-byte struct {uint64_t} passed by value).
        // The layout is registered under the exercised wrapper's name.
        JvmDowncallEngine.registerStructLayout(
            "WGPUAdapterInfo",
            sizeBytes = 8L,
            alignmentBytes = 8L,
            fields = listOf(
                JvmDowncallEngine.StructField("id", JvmDowncallEngine.FieldKind.UINT64, 0L),
            ),
        )
        MemoryAllocator().use { allocator ->
            val info = allocator.allocateBuffer(8uL)
            info.writeLong(0xDEADBEEF, 0uL)
            JvmDowncallEngine.callStructArgWGPUAdapterInfo(
                JvmDowncallFixture.symbol("bench_consume_future"),
                info.handler.rawValue,
            )
            JvmDowncallEngine.callI0(JvmDowncallFixture.symbol("bench_consumed_future_id")) shouldBe 0xDEADBEEFL
        }
    }

    "WGPUFuture return with callbackInfo struct arg (OnSubmittedWorkDone shape)" {
        JvmDowncallEngine.registerStructLayout(
            "WGPUFuture",
            sizeBytes = 8L,
            alignmentBytes = 8L,
            fields = listOf(
                JvmDowncallEngine.StructField("id", JvmDowncallEngine.FieldKind.UINT64, 0L),
            ),
        )
        JvmDowncallEngine.registerStructLayout(
            "WGPUQueueWorkDoneCallbackInfo",
            sizeBytes = 16L,
            alignmentBytes = 8L,
            fields = listOf(
                JvmDowncallEngine.StructField("callback", JvmDowncallEngine.FieldKind.POINTER, 0L),
                JvmDowncallEngine.StructField("userdata", JvmDowncallEngine.FieldKind.POINTER, 8L),
            ),
        )
        MemoryAllocator().use { allocator ->
            val info = allocator.allocateBuffer(16uL)
            info.writePointer(NativeAddress(0x2000L), 0uL)
            info.writePointer(NativeAddress(0x2008L), 8uL)
            val future = JvmDowncallEngine.callStructReturnWGPUFutureWGPUQueueWorkDoneCallbackInfo(
                JvmDowncallFixture.symbol("bench_on_work_done"),
                allocator,
                p1 = 0x30L,
                structPtr = info.handler.rawValue,
            )
            MemoryBuffer(future, 8uL).readLong(0uL) shouldBe 0x30L + 0x2008L
        }
    }

    "WGPUFuture return with a pointer arg only (GetLostFuture shape)" {
        MemoryAllocator().use { allocator ->
            val future = JvmDowncallEngine.callStructReturnWGPUFuture(
                JvmDowncallFixture.symbol("bench_get_lost_future"),
                allocator,
                p1 = 0x40L,
            )
            MemoryBuffer(future, 8uL).readLong(0uL) shouldBe 0x40L + 7L
        }
    }

    "WGPUFuture return with pointer + three longs + callbackInfo struct arg (BufferMap shape)" {
        JvmDowncallEngine.registerStructLayout(
            "WGPUBufferMapCallbackInfo",
            sizeBytes = 16L,
            alignmentBytes = 8L,
            fields = listOf(
                JvmDowncallEngine.StructField("callback", JvmDowncallEngine.FieldKind.POINTER, 0L),
                JvmDowncallEngine.StructField("userdata", JvmDowncallEngine.FieldKind.POINTER, 8L),
            ),
        )
        MemoryAllocator().use { allocator ->
            val info = allocator.allocateBuffer(16uL)
            info.writePointer(NativeAddress(0x2000L), 0uL)
            info.writePointer(NativeAddress(0x2008L), 8uL)
            val future = JvmDowncallEngine.callStructReturnWGPUFutureWGPUBufferMapCallbackInfo(
                JvmDowncallFixture.symbol("bench_buffer_map_async"),
                allocator,
                p1 = 0x10L,
                a2 = 0x20L,
                a3 = 0x30L,
                a4 = 0x40L,
                structPtr = info.handler.rawValue,
            )
            MemoryBuffer(future, 8uL).readLong(0uL) shouldBe 0x10L + 0x20L + 0x30L + 0x40L + 0x2008L
        }
    }
})
