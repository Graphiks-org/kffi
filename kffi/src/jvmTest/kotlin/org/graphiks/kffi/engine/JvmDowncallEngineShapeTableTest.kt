package org.graphiks.kffi.engine

import io.kotest.assertions.fail
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import org.graphiks.kffi.MemoryAllocator

/**
 * Mechanical verification: every engine wrapper's Java signature is pinned to
 * the letter string declared and emitted by kextract
 * (`jvmEngineWrappers` / `jvmEngineStructWrapperShapes` in
 * KotlinKmpJvmBuilder). Three tables exist in parallel (engine, kextract
 * guard, and test stub). A mismatch generally fails loudly, but an existing
 * entry with the same Kotlin types and a different ABI would compile silently;
 * this test limits that silent drift at the Java-signature level.
 *
 * - Scalar wrappers: their names encode the shape (`call` + R + N + letters,
 *   the wrapperForm convention). The test parses the name and verifies arity
 *   and the carrier classes of parameters and return values. A name or
 *   signature change outside that contract fails.
 * - Struct-by-value wrappers: a mirror table of
 *   `jvmEngineStructWrapperShapes` (emitted name → letters, S = a Long carrying
 *   a struct by value in its C position). The test verifies every emitted name's
 *   Java signature, including the allocator.
 * - One shape per name: no specialized public `call*` wrapper may be
 *   overloaded, and every such method must be covered by one of the two
 *   mechanisms (no silent wrapper or orphan entry). `callGeneric` is the
 *   explicit escape hatch for shapes that are not encoded in wrapper names.
 *
 * Runtime fixture tests pin the deep ABI layer (FunctionDescriptor / ValueLayout
 * widths): a descriptor that disagrees with a wrapper's Java signature causes
 * invokeExact to fail with WrongMethodTypeException on first use.
 */
class JvmDowncallEngineShapeTableTest : FreeSpec({

    "scalar wrapper names encode their exact Java signature" {
        val byName = callMethodsByKotlinName()
        val scalarNames = byName.keys - STRUCT_SHAPES.keys
        scalarNames.forEach { name ->
            val method = byName.getValue(name).single()
            val returnLetter = name[4]
            val rest = name.drop(5)
            val count = rest.takeWhile { it.isDigit() }.toInt()
            val letters = rest.dropWhile { it.isDigit() }
            letters.length shouldBe count

            // fn + N arguments, with carriers defined by the letters.
            method.parameterCount shouldBe 1 + count
            method.parameterTypes[0] shouldBe java.lang.Long.TYPE
            method.parameterTypes.drop(1).toList() shouldBe letters.map(::carrier)
            method.returnType shouldBe returnCarrier(returnLetter)
        }
    }

    "struct wrapper signatures match the kextract-declared letter strings" {
        val byName = callMethodsByKotlinName()
        STRUCT_SHAPES.forEach { (name, shape) ->
            val method = byName[name]?.single() ?: fail("wrapper struct manquant : $name")
            val (argLetters, returnKind) = shape.split('|').let { it[0] to it[1].single() }
            val params = buildList {
                add(java.lang.Long.TYPE) // fn
                if (returnKind == 'S') add(MemoryAllocator::class.java) // allocator FFM
                argLetters.forEach { letter -> add(carrier(letter)) }
            }
            method.parameterTypes.toList() shouldBe params
            method.returnType shouldBe returnCarrier(returnKind)
        }
    }

    "one wrapper per shape: no overloads, no orphan methods" {
        val byName = callMethodsByKotlinName()
        byName.values.forEach { overloads -> overloads.size shouldBe 1 }
        val allNames = byName.keys
        val scalarNames = allNames - STRUCT_SHAPES.keys
        // Every method that is not a known struct entry must follow the
        // wrapperForm convention (call + R + N + letters). A wrapper added
        // outside the table (named callFoo or callStructX without an entry)
        // fails here.
        scalarNames.forEach { name ->
            val pattern = Regex("call[VILPDF][0-9]+[PILFDSB]*")
            pattern.matches(name) shouldBe true
        }
    }
})

// Mirror of kextract's jvmEngineStructWrapperShapes: emitted name →
// "argLetters|returnKind". S = a struct-by-value argument (Long carrier).
private val STRUCT_SHAPES: Map<String, String> = mapOf(
    "callStructArgBox" to "S|V",
    "callStructArgWGPUStringView" to "PS|V",
    "callStructArgWGPUStringViewRetP" to "S|P",
    "callStructArgWGPUAdapterInfo" to "S|V",
    "callStructArgWGPUSupportedFeatures" to "S|V",
    "callStructArgWGPUSupportedInstanceFeatures" to "S|V",
    "callStructArgWGPUSupportedWGSLLanguageFeatures" to "S|V",
    "callStructArgWGPUSurfaceCapabilities" to "S|V",
    "callStructReturnBox" to "I|S",
    "callStructReturnWGPUFuture" to "P|S",
    "callStructReturnWGPUFutureWGPUQueueWorkDoneCallbackInfo" to "PS|S",
    "callStructReturnWGPUFutureWGPUPopErrorScopeCallbackInfo" to "PS|S",
    "callStructReturnWGPUFutureWGPUCompilationInfoCallbackInfo" to "PS|S",
    "callStructReturnWGPUFutureWGPURequestAdapterCallbackInfo" to "PPS|S",
    "callStructReturnWGPUFutureWGPURequestDeviceCallbackInfo" to "PPS|S",
    "callStructReturnWGPUFutureWGPUCreateRenderPipelineAsyncCallbackInfo" to "PPS|S",
    "callStructReturnWGPUFutureWGPUCreateComputePipelineAsyncCallbackInfo" to "PPS|S",
    "callStructReturnWGPUFutureWGPUBufferMapCallbackInfo" to "PLLLS|S",
)

private fun carrier(letter: Char): Class<*> = when (letter) {
    'P', 'L' -> java.lang.Long.TYPE
    'I' -> java.lang.Integer.TYPE
    'F' -> java.lang.Float.TYPE
    'D' -> java.lang.Double.TYPE
    // S = a struct passed by value → structPtr (Long). The struct table has no
    // scalar short; a scalar wrapper with an I16 argument would extend the
    // table and require disambiguation here.
    'S' -> java.lang.Long.TYPE
    'B' -> java.lang.Byte.TYPE
    else -> error("lettre d'argument inconnue : $letter")
}

private fun returnCarrier(returnKind: Char): Class<*> = when (returnKind) {
    'V' -> java.lang.Void.TYPE
    'F' -> java.lang.Float.TYPE
    'D' -> java.lang.Double.TYPE
    // Engine convention: I/L/P returns use Long (JAVA_LONG); generated code
    // narrows them to Int/Short/… while emitting bindings.
    'P', 'I', 'L' -> java.lang.Long.TYPE
    // Struct return: NativeAddress, unboxed to long at the JVM level (value class).
    'S' -> java.lang.Long.TYPE
    else -> error("lettre de retour inconnue : $returnKind")
}

/**
 * Indexes public `call*` methods by their KOTLIN NAME. The compiler suffixes
 * functions with a non-unboxable value-class parameter (MemoryAllocator on
 * struct-return wrappers) with a JVM hash (`callStructReturnBox-eTG-Znw`),
 * which raw reflection by name does not see.
 */
private fun callMethodsByKotlinName(): Map<String, List<java.lang.reflect.Method>> =
    JvmDowncallEngine::class.java.methods
        .filter { it.name.startsWith("call") && it.name != "callGeneric" }
        .groupBy { it.name.substringBefore('-') }
