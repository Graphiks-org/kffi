@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.experimental.ExperimentalNativeApi::class)

package org.graphiks.kffi.benchmark.native

import benchFixture.bench_empty
import org.graphiks.kffi.benchmark.BenchmarkReport
import org.graphiks.kffi.benchmark.BenchmarkResult
import org.graphiks.kffi.benchmark.BenchmarkScenario
import kotlin.native.CpuArchitecture
import kotlin.native.Platform
import kotlin.time.measureTime

private val backendLabel: String =
    if (Platform.cpuArchitecture == CpuArchitecture.ARM64) "native-macosArm64" else "native-macosX64"

private fun measureDowncallEmpty(): Double {
    repeat(1000) { bench_empty() } // warmup
    val elapsed = measureTime {
        repeat(100_000) { bench_empty() }
    }
    return elapsed.inWholeNanoseconds / 100_000.0
}

// P3 NOTE: native bounds-check overhead is measured by the difference between
// this bounds-checked scenario (KFFI_NATIVE_UNSAFE=false) and the unsafe
// variant (build the module with the constant set to true).
private fun measureMarshaling(): Double {
    repeat(100) {
        org.graphiks.kffi.memoryScope { allocator ->
            allocator.allocateBuffer(4096uL)
        }
    } // warmup
    val elapsed = measureTime {
        repeat(10_000) {
            org.graphiks.kffi.memoryScope { allocator ->
                val buffer = allocator.allocateBuffer(4096uL)
                val values = IntArray(16) { it }
                buffer.writeInts(values)
            }
        }
    }
    return elapsed.inWholeNanoseconds / 10_000.0
}

/*
 * Unsafe variant (KFFI_NATIVE_UNSAFE=true) — documented structure, not
 * compiled by default: the build-time constant lives in the kffi module
 * (MemoryBuffer.native.kt) and cannot be changed at runtime (I3/P3).
 * To measure bounds-check overhead, build kffi with
 * KFFI_NATIVE_UNSAFE=true and then run THIS scenario — the code is identical
 * to measureMarshaling; only the compile-time constant changes. It is not
 * wired into main(): the default build must remain bounds-checked.
 *
 * private fun measureMarshalingUnsafeVariant(): Double {
 *     repeat(100) {
 *         org.graphiks.kffi.memoryScope { allocator ->
 *             allocator.allocateBuffer(4096uL)
 *         }
 *     } // warmup
 *     val elapsed = measureTime {
 *         repeat(10_000) {
 *             org.graphiks.kffi.memoryScope { allocator ->
 *                 val buffer = allocator.allocateBuffer(4096uL)
 *                 val values = IntArray(16) { it }
 *                 buffer.writeInts(values)
 *             }
 *         }
 *     }
 *     return elapsed.inWholeNanoseconds / 10_000.0
 * }
 */

fun main() {
    val results = listOf(
        BenchmarkResult(BenchmarkScenario.DOWN_EMPTY.axis, BenchmarkScenario.DOWN_EMPTY.id, backendLabel, measureDowncallEmpty()),
        BenchmarkResult(BenchmarkScenario.MARSHAL_ARRAY_I32_16.axis, BenchmarkScenario.MARSHAL_ARRAY_I32_16.id, backendLabel, measureMarshaling()),
    )
    println(BenchmarkReport.toMarkdown(backendLabel, results))
}
