package org.graphiks.kffi.engine

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import org.graphiks.kffi.memoryScope

class JvmDowncallEngineGenericShapeTest : FreeSpec({

    "generic shape invokes an otherwise un-specialized scalar signature" {
        val shape = JvmDowncallEngine.FunctionShape(
            result = JvmDowncallEngine.AbiType.F64,
            arguments = listOf(
                JvmDowncallEngine.AbiType.I8,
                JvmDowncallEngine.AbiType.F64,
            ),
        )

        JvmDowncallEngine.callGeneric(
            JvmDowncallFixture.symbol("bench_mix_i8_double"),
            shape,
            (-2).toByte(),
            3.5,
        ) shouldBe 1.5
    }

    "generic shape builds fixed array struct layouts" {
        JvmDowncallEngine.registerStructLayout(
            name = "BenchArrayBox",
            sizeBytes = 12L,
            alignmentBytes = 4L,
            fields = listOf(
                JvmDowncallEngine.StructField(
                    cName = "values",
                    kind = JvmDowncallEngine.FieldKind.ARRAY,
                    offsetBytes = 0L,
                    arrayElementKind = JvmDowncallEngine.FieldKind.INT32,
                    arrayLength = 3L,
                ),
            ),
        )
        val shape = JvmDowncallEngine.FunctionShape(
            result = JvmDowncallEngine.AbiType.I32,
            arguments = listOf(JvmDowncallEngine.AbiType.Struct("BenchArrayBox")),
        )

        memoryScope { scope ->
            val box = scope.allocateBuffer(12u).apply {
                writeInt(10, 0u)
                writeInt(20, 4u)
                writeInt(12, 8u)
            }

            JvmDowncallEngine.callGeneric(
                JvmDowncallFixture.symbol("bench_sum_array_box"),
                shape,
                box.handler.rawValue,
            ) shouldBe 42
        }
    }

    "nested struct layout cache follows child re-registration" {
        JvmDowncallEngine.registerStructLayout(
            name = "BenchInner",
            sizeBytes = 4L,
            alignmentBytes = 4L,
            fields = listOf(
                JvmDowncallEngine.StructField("value", JvmDowncallEngine.FieldKind.INT32, 0L),
            ),
        )
        JvmDowncallEngine.registerStructLayout(
            name = "BenchOuter",
            sizeBytes = 4L,
            alignmentBytes = 4L,
            fields = listOf(
                JvmDowncallEngine.StructField(
                    cName = "inner",
                    kind = JvmDowncallEngine.FieldKind.STRUCT,
                    offsetBytes = 0L,
                    structName = "BenchInner",
                ),
            ),
        )
        JvmDowncallEngine.structLayout("BenchOuter").byteSize() shouldBe 4L

        JvmDowncallEngine.registerStructLayout(
            name = "BenchInner",
            sizeBytes = 8L,
            alignmentBytes = 8L,
            fields = listOf(
                JvmDowncallEngine.StructField("value", JvmDowncallEngine.FieldKind.INT64, 0L),
            ),
        )
        JvmDowncallEngine.registerStructLayout(
            name = "BenchOuter",
            sizeBytes = 8L,
            alignmentBytes = 8L,
            fields = listOf(
                JvmDowncallEngine.StructField(
                    cName = "inner",
                    kind = JvmDowncallEngine.FieldKind.STRUCT,
                    offsetBytes = 0L,
                    structName = "BenchInner",
                ),
            ),
        )

        JvmDowncallEngine.structLayout("BenchOuter").byteSize() shouldBe 8L
    }
})
