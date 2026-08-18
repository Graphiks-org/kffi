package org.graphiks.kffi.engine

import org.graphiks.kffi.C_POINTER
import org.graphiks.kffi.MemoryAllocator
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.findOrThrow
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle

/**
 * JVM downcall engine typed by call shape — symmetric with NativeEngine (Android).
 *
 * Each wrapper looks up a two-level cache: the outer key is the function
 * address (the exact Long, so two addresses cannot collide) and the inner key
 * is `(layoutVersion shl 8) or shapeId`. An FFM MethodHandle (invokeExact) is
 * built once per (address × shape), and the layout version in the inner key
 * ensures that registerStructLayout rebuilds the descriptor instead of reusing
 * a stale MethodHandle. In practice, the cache is bounded by the number of
 * distinct exported addresses resolved by the bindings. The supported shapes
 * are the ones referenced by generated bindings (the union of wgpu
 * signatures); the table grows by adding wrappers, never combinatorially.
 *
 * Signatures with structs passed or returned by value are covered by wrappers
 * built from the layout registry: generated code registers metadata (size,
 * alignment, and fields) through [registerStructLayout], and the engine builds
 * FFM GroupLayouts internally.
 */
object JvmDowncallEngine {

    private val linker = Linker.nativeLinker()

    /** Stable shapeId values per wrapper, encoded in the low eight bits of [handleCache]'s key. */
    private object ShapeId {
        const val V0 = 1
        const val V1P = 2
        const val V2PP = 3
        const val V3PPL = 4
        const val V4PPPP = 5
        const val V5PIIII = 6
        const val I0 = 7
        const val I1I = 8
        const val I1P = 9
        const val I4IIII = 10
        const val L8LLLLLLLL = 11
        const val P1P = 12
        const val P2PP = 13
        const val P2PI = 14
        const val P3PLL = 15
        const val F1P = 16
        const val D1P = 17

        /** Struct-by-value shapes: dedicated shapeId values per struct × shape.
         *  The struct layout is part of the shape, so each cache key remains
         *  unique per (address, shape). */
        const val S_ARG_BOX = 18
        const val S_RET_BOX = 19

        // --- wgpu signature union: scalar values ---
        const val I2PP = 20
        const val I2PI = 21
        const val L1P = 22
        const val I4PLPL = 23
        const val V2PI = 24
        const val V3PLP = 25
        const val V5PPLPL = 26
        const val V6PPPLPP = 27
        const val V6PIIIII = 28
        const val V5PIPLP = 29
        const val V5PPILL = 30
        const val V5PIPLL = 31
        const val I3PPP = 32
        const val L3PPP = 33
        const val L3PLP = 34
        const val I3PIP = 35
        const val V1I = 36
        const val V4PIIP = 37
        const val V4PPLI = 38
        const val V6PPLPLI = 39
        const val V3PPI = 40
        const val V4PPLL = 41
        const val V6PPLPLL = 42
        const val V6PPIIPL = 43
        const val V4PIII = 44
        const val V7PFFFFFF = 45

        // --- wgpu signature union: structs passed by value ---
        const val S_ARG_ADAPTER_INFO = 46
        const val S_ARG_SUPPORTED_FEATURES = 47
        const val S_ARG_SUPPORTED_INSTANCE_FEATURES = 48
        const val S_ARG_SUPPORTED_WGSL_LANGUAGE_FEATURES = 49
        const val S_ARG_SURFACE_CAPABILITIES = 50
        const val S_ARG_STRINGVIEW_P = 51
        const val S_ARG_STRINGVIEW_RET_P = 52
        const val S_RET_FUTURE_P = 53
        const val S_RET_FUTURE_P_QUEUE_WORK_DONE = 54
        const val S_RET_FUTURE_P_POP_ERROR_SCOPE = 55
        const val S_RET_FUTURE_P_COMPILATION_INFO = 56
        const val S_RET_FUTURE_PP_REQUEST_ADAPTER = 57
        const val S_RET_FUTURE_PP_REQUEST_DEVICE = 58
        const val S_RET_FUTURE_PP_CREATE_RENDER_PIPELINE_ASYNC = 59
        const val S_RET_FUTURE_PP_CREATE_COMPUTE_PIPELINE_ASYNC = 60
        const val S_RET_FUTURE_PLLL_BUFFER_MAP = 61
    }

    /** MethodHandle per (function address, shape, layout version). */
    private val handleCache =
        java.util.concurrent.ConcurrentHashMap<Long, java.util.concurrent.ConcurrentHashMap<Int, MethodHandle>>()

    fun resolveSymbol(name: String): Long = findOrThrow(name)

    private fun segment(address: Long): MemorySegment =
        MemorySegment.ofAddress(address)

    /**
     * Two-level cache: the outer key is the function address (the exact Long,
     * so two addresses cannot collide, unlike a shift encoding that folds bits
     * 48+ of canonical addresses into the key's low bits); the inner key is
     * `(layoutVersion shl 8) or shapeId`. The layout version belongs to the
     * inner key so registerStructLayout creates a new MethodHandle instead of
     * reusing the previous descriptor's handle (which would silently corrupt
     * the ABI). The inner table is tiny: a few shapes per function address.
     */
    private fun handle(fn: Long, shapeId: Int, descriptor: FunctionDescriptor, layoutVersion: Int = 0): MethodHandle {
        require(fn != 0L) { "Cannot downcall through null function address" }
        val key = (layoutVersion shl 8) or shapeId
        return handleCache
            .computeIfAbsent(fn) { java.util.concurrent.ConcurrentHashMap() }
            .computeIfAbsent(key) { linker.downcallHandle(segment(fn), descriptor) }
    }

    // --- void returns ---

    fun callV0(fn: Long) {
        val handle = handle(fn, ShapeId.V0, FunctionDescriptor.ofVoid())
        handle.invokeExact()
    }

    fun callV1P(fn: Long, p1: Long) {
        val handle = handle(fn, ShapeId.V1P, FunctionDescriptor.ofVoid(C_POINTER))
        handle.invokeExact(segment(p1))
    }

    fun callV2PP(fn: Long, p1: Long, p2: Long) {
        val handle = handle(fn, ShapeId.V2PP, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER))
        handle.invokeExact(segment(p1), segment(p2))
    }

    fun callV3PPL(fn: Long, p1: Long, p2: Long, a3: Long) {
        val handle = handle(fn, ShapeId.V3PPL, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_LONG))
        handle.invokeExact(segment(p1), segment(p2), a3)
    }

    fun callV4PPPP(fn: Long, p1: Long, p2: Long, p3: Long, p4: Long) {
        val handle = handle(fn, ShapeId.V4PPPP, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, C_POINTER, C_POINTER))
        handle.invokeExact(segment(p1), segment(p2), segment(p3), segment(p4))
    }

    fun callV5PIIII(fn: Long, p1: Long, a2: Int, a3: Int, a4: Int, a5: Int) {
        val handle = handle(fn, ShapeId.V5PIIII, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT))
        handle.invokeExact(segment(p1), a2, a3, a4, a5)
    }

    // --- long returns ---

    fun callI0(fn: Long): Long {
        val handle = handle(fn, ShapeId.I0, FunctionDescriptor.of(ValueLayout.JAVA_LONG))
        return handle.invokeExact() as Long
    }

    fun callI1I(fn: Long, a1: Int): Long {
        val handle = handle(fn, ShapeId.I1I, FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT))
        return handle.invokeExact(a1) as Long
    }

    fun callI1P(fn: Long, a1: Long): Long {
        val handle = handle(fn, ShapeId.I1P, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER))
        return handle.invokeExact(segment(a1)) as Long
    }

    fun callI4IIII(fn: Long, a1: Int, a2: Int, a3: Int, a4: Int): Long {
        val handle = handle(fn, ShapeId.I4IIII, FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT))
        return handle.invokeExact(a1, a2, a3, a4) as Long
    }

    fun callL8LLLLLLLL(fn: Long, a1: Long, a2: Long, a3: Long, a4: Long, a5: Long, a6: Long, a7: Long, a8: Long): Long {
        val handle = handle(fn, ShapeId.L8LLLLLLLL, FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG))
        return handle.invokeExact(a1, a2, a3, a4, a5, a6, a7, a8) as Long
    }

    fun callP1P(fn: Long, a1: Long): Long {
        val handle = handle(fn, ShapeId.P1P, FunctionDescriptor.of(C_POINTER, C_POINTER))
        return (handle.invokeExact(segment(a1)) as MemorySegment).address()
    }

    fun callP2PP(fn: Long, a1: Long, a2: Long): Long {
        val handle = handle(fn, ShapeId.P2PP, FunctionDescriptor.of(C_POINTER, C_POINTER, C_POINTER))
        return (handle.invokeExact(segment(a1), segment(a2)) as MemorySegment).address()
    }

    fun callP2PI(fn: Long, a1: Long, a2: Int): Long {
        val handle = handle(fn, ShapeId.P2PI, FunctionDescriptor.of(C_POINTER, C_POINTER, ValueLayout.JAVA_INT))
        return (handle.invokeExact(segment(a1), a2) as MemorySegment).address()
    }

    fun callP3PLL(fn: Long, a1: Long, a2: Long, a3: Long): Long {
        val handle = handle(fn, ShapeId.P3PLL, FunctionDescriptor.of(C_POINTER, C_POINTER, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG))
        return (handle.invokeExact(segment(a1), a2, a3) as MemorySegment).address()
    }

    fun callF1P(fn: Long, a1: Long): Float {
        val handle = handle(fn, ShapeId.F1P, FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, C_POINTER))
        return handle.invokeExact(segment(a1)) as Float
    }

    fun callD1P(fn: Long, a1: Long): Double {
        val handle = handle(fn, ShapeId.D1P, FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, C_POINTER))
        return handle.invokeExact(segment(a1)) as Double
    }

    // --- wgpu signature union: scalar values ---
    // Every wrapper covers a wgpu engine signature and follows the same typed
    // pattern: cache by (address, shape) and guard against null addresses.

    fun callI2PP(fn: Long, a1: Long, a2: Long): Long {
        val handle = handle(fn, ShapeId.I2PP, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER, C_POINTER))
        return handle.invokeExact(segment(a1), segment(a2)) as Long
    }

    fun callI2PI(fn: Long, a1: Long, a2: Int): Long {
        val handle = handle(fn, ShapeId.I2PI, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER, ValueLayout.JAVA_INT))
        return handle.invokeExact(segment(a1), a2) as Long
    }

    fun callL1P(fn: Long, a1: Long): Long {
        val handle = handle(fn, ShapeId.L1P, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER))
        return handle.invokeExact(segment(a1)) as Long
    }

    fun callI4PLPL(fn: Long, a1: Long, a2: Long, a3: Long, a4: Long): Long {
        val handle = handle(fn, ShapeId.I4PLPL, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER, ValueLayout.JAVA_LONG, C_POINTER, ValueLayout.JAVA_LONG))
        return handle.invokeExact(segment(a1), a2, segment(a3), a4) as Long
    }

    fun callV2PI(fn: Long, p1: Long, a2: Int) {
        val handle = handle(fn, ShapeId.V2PI, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_INT))
        handle.invokeExact(segment(p1), a2)
    }

    fun callV3PLP(fn: Long, p1: Long, a2: Long, p3: Long) {
        val handle = handle(fn, ShapeId.V3PLP, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_LONG, C_POINTER))
        handle.invokeExact(segment(p1), a2, segment(p3))
    }

    fun callV5PPLPL(fn: Long, p1: Long, p2: Long, a3: Long, p4: Long, a5: Long) {
        val handle = handle(fn, ShapeId.V5PPLPL, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_LONG, C_POINTER, ValueLayout.JAVA_LONG))
        handle.invokeExact(segment(p1), segment(p2), a3, segment(p4), a5)
    }

    fun callV6PPPLPP(fn: Long, p1: Long, p2: Long, p3: Long, a4: Long, p5: Long, p6: Long) {
        val handle = handle(fn, ShapeId.V6PPPLPP, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, C_POINTER, ValueLayout.JAVA_LONG, C_POINTER, C_POINTER))
        handle.invokeExact(segment(p1), segment(p2), segment(p3), a4, segment(p5), segment(p6))
    }

    fun callV6PIIIII(fn: Long, p1: Long, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int) {
        val handle = handle(fn, ShapeId.V6PIIIII, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT))
        handle.invokeExact(segment(p1), a2, a3, a4, a5, a6)
    }

    fun callV5PIPLP(fn: Long, p1: Long, a2: Int, p3: Long, a4: Long, p5: Long) {
        val handle = handle(fn, ShapeId.V5PIPLP, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_INT, C_POINTER, ValueLayout.JAVA_LONG, C_POINTER))
        handle.invokeExact(segment(p1), a2, segment(p3), a4, segment(p5))
    }

    fun callV5PPILL(fn: Long, p1: Long, p2: Long, a3: Int, a4: Long, a5: Long) {
        val handle = handle(fn, ShapeId.V5PPILL, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG))
        handle.invokeExact(segment(p1), segment(p2), a3, a4, a5)
    }

    fun callV5PIPLL(fn: Long, p1: Long, a2: Int, p3: Long, a4: Long, a5: Long) {
        val handle = handle(fn, ShapeId.V5PIPLL, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_INT, C_POINTER, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG))
        handle.invokeExact(segment(p1), a2, segment(p3), a4, a5)
    }

    fun callI3PPP(fn: Long, a1: Long, a2: Long, a3: Long): Long {
        val handle = handle(fn, ShapeId.I3PPP, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER, C_POINTER, C_POINTER))
        return handle.invokeExact(segment(a1), segment(a2), segment(a3)) as Long
    }

    fun callL3PPP(fn: Long, a1: Long, a2: Long, a3: Long): Long {
        val handle = handle(fn, ShapeId.L3PPP, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER, C_POINTER, C_POINTER))
        return handle.invokeExact(segment(a1), segment(a2), segment(a3)) as Long
    }

    fun callL3PLP(fn: Long, a1: Long, a2: Long, a3: Long): Long {
        val handle = handle(fn, ShapeId.L3PLP, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER, ValueLayout.JAVA_LONG, C_POINTER))
        return handle.invokeExact(segment(a1), a2, segment(a3)) as Long
    }

    fun callI3PIP(fn: Long, a1: Long, a2: Int, a3: Long): Long {
        val handle = handle(fn, ShapeId.I3PIP, FunctionDescriptor.of(ValueLayout.JAVA_LONG, C_POINTER, ValueLayout.JAVA_INT, C_POINTER))
        return handle.invokeExact(segment(a1), a2, segment(a3)) as Long
    }

    fun callV1I(fn: Long, a1: Int) {
        val handle = handle(fn, ShapeId.V1I, FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT))
        handle.invokeExact(a1)
    }

    fun callV4PIIP(fn: Long, p1: Long, a2: Int, a3: Int, p4: Long) {
        val handle = handle(fn, ShapeId.V4PIIP, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, C_POINTER))
        handle.invokeExact(segment(p1), a2, a3, segment(p4))
    }

    fun callV4PPLI(fn: Long, p1: Long, p2: Long, a3: Long, a4: Int) {
        val handle = handle(fn, ShapeId.V4PPLI, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT))
        handle.invokeExact(segment(p1), segment(p2), a3, a4)
    }

    fun callV6PPLPLI(fn: Long, p1: Long, p2: Long, a3: Long, p4: Long, a5: Long, a6: Int) {
        val handle = handle(fn, ShapeId.V6PPLPLI, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_LONG, C_POINTER, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT))
        handle.invokeExact(segment(p1), segment(p2), a3, segment(p4), a5, a6)
    }

    fun callV3PPI(fn: Long, p1: Long, p2: Long, a3: Int) {
        val handle = handle(fn, ShapeId.V3PPI, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_INT))
        handle.invokeExact(segment(p1), segment(p2), a3)
    }

    fun callV4PPLL(fn: Long, p1: Long, p2: Long, a3: Long, a4: Long) {
        val handle = handle(fn, ShapeId.V4PPLL, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG))
        handle.invokeExact(segment(p1), segment(p2), a3, a4)
    }

    fun callV6PPLPLL(fn: Long, p1: Long, p2: Long, a3: Long, p4: Long, a5: Long, a6: Long) {
        val handle = handle(fn, ShapeId.V6PPLPLL, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_LONG, C_POINTER, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG))
        handle.invokeExact(segment(p1), segment(p2), a3, segment(p4), a5, a6)
    }

    fun callV6PPIIPL(fn: Long, p1: Long, p2: Long, a3: Int, a4: Int, p5: Long, a6: Long) {
        val handle = handle(fn, ShapeId.V6PPIIPL, FunctionDescriptor.ofVoid(C_POINTER, C_POINTER, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, C_POINTER, ValueLayout.JAVA_LONG))
        handle.invokeExact(segment(p1), segment(p2), a3, a4, segment(p5), a6)
    }

    fun callV4PIII(fn: Long, p1: Long, a2: Int, a3: Int, a4: Int) {
        val handle = handle(fn, ShapeId.V4PIII, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT))
        handle.invokeExact(segment(p1), a2, a3, a4)
    }

    fun callV7PFFFFFF(fn: Long, p1: Long, a2: Float, a3: Float, a4: Float, a5: Float, a6: Float, a7: Float) {
        val handle = handle(fn, ShapeId.V7PFFFFFF, FunctionDescriptor.ofVoid(C_POINTER, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT))
        handle.invokeExact(segment(p1), a2, a3, a4, a5, a6, a7)
    }

    // --- Structs passed by value: layout registry ---

    data class StructField(val cName: String, val kind: FieldKind, val offsetBytes: Long)

    enum class FieldKind { INT8, UINT8, INT16, UINT16, INT32, UINT32, INT64, UINT64, FLOAT32, FLOAT64, POINTER, STRUCT, PADDING }

    private val structLayouts = java.util.concurrent.ConcurrentHashMap<String, Pair<Long, List<StructField>>>()

    private val structAlignments = java.util.concurrent.ConcurrentHashMap<String, Long>()

    /**
     * Per-struct version incremented by [registerStructLayout]. It is part of
     * the [handleCache] key (bits 8–15) so struct-by-value wrappers rebuild the
     * MethodHandle when the descriptor changes.
     */
    private val layoutVersions = java.util.concurrent.ConcurrentHashMap<String, Int>()

    /**
     * Registers layout metadata for a struct passed by value, emitted by
     * generated code (kextract) when the bindings file loads. [StructField]
     * contains the type ([FieldKind]) and, for PADDING, the padding SIZE (the
     * gap between consecutive fields, including final padding). For every other
     * field, [StructField.offsetBytes] is informational — the FFM GroupLayout
     * is rebuilt from elements and their sizes.
     */
    fun registerStructLayout(name: String, sizeBytes: Long, alignmentBytes: Long, fields: List<StructField>) {
        structLayouts[name] = sizeBytes to fields
        structAlignments[name] = alignmentBytes
        layoutVersions[name] = (layoutVersions[name] ?: 0) + 1
        structDescriptors.remove(name)
    }

    private fun layoutVersion(name: String): Int = layoutVersions[name] ?: 0

    private val structDescriptors = java.util.concurrent.ConcurrentHashMap<String, MemoryLayout>()

    /**
     * FFM layout of a registered struct, built from [registerStructLayout]
     * metadata (size, alignment, fields, and explicit padding).
 *
     * Public API used by generated code (kextract), including fallback FFM
     * callback trampolines, to build function descriptors with structs passed
     * by value.
 *
     * Contract:
     * - [name] must be registered through [registerStructLayout] before its
     *   first use (generated code does this during file initialization, before
     *   any downcall or upcall);
     * - an unknown name throws `NoSuchElementException`;
     * - metadata inconsistent with the computed size throws
     *   `IllegalStateException` through `check`;
     * - the layout is cached and rebuilt after each re-registration (a version
     *   bump), invalidating descriptors derived from the previous layout.
     */
    fun structLayout(name: String): MemoryLayout =
        structDescriptors.computeIfAbsent(name) { structName ->
            val (size, fields) = structLayouts.getValue(structName)
            val elements = fields.map { field ->
                when (field.kind) {
                    // A PADDING field's offsetBytes holds the padding SIZE: FFM
                    // places elements sequentially without implicit padding, and
                    // withByteAlignment does not round the size. Explicit gaps,
                    // including final padding, are therefore required to match
                    // Clang's offsets and size.
                    FieldKind.PADDING -> MemoryLayout.paddingLayout(field.offsetBytes)
                    // A STRUCT field's cName holds the registered nested type name.
                    FieldKind.STRUCT -> structLayout(field.cName).withName(field.cName)
                    else -> primitiveLayout(field.kind).withName(field.cName)
                }
            }
            val layout = MemoryLayout.structLayout(*elements.toTypedArray())
                .withByteAlignment(structAlignments.getValue(structName))
            check(layout.byteSize() == size) {
                "Registered size for $structName ($size bytes) disagrees with the layout built " +
                    "from its fields (${layout.byteSize()} bytes)"
            }
            layout
        }

    private fun primitiveLayout(kind: FieldKind): ValueLayout = when (kind) {
        FieldKind.INT8, FieldKind.UINT8 -> ValueLayout.JAVA_BYTE
        FieldKind.INT16, FieldKind.UINT16 -> ValueLayout.JAVA_SHORT
        FieldKind.INT32, FieldKind.UINT32 -> ValueLayout.JAVA_INT
        FieldKind.INT64, FieldKind.UINT64 -> ValueLayout.JAVA_LONG
        FieldKind.FLOAT32 -> ValueLayout.JAVA_FLOAT
        FieldKind.FLOAT64 -> ValueLayout.JAVA_DOUBLE
        FieldKind.POINTER -> ValueLayout.ADDRESS
        FieldKind.STRUCT -> error("nested struct layouts resolve through structLayout")
        FieldKind.PADDING -> error("padding handled separately")
    }

    // --- Per-struct wrappers for structs passed by value ---
    //
    // Dedicated shapes per struct: the layout is resolved from the registry at
    // every call (cached in structDescriptors), while the MethodHandle per
    // (address, shape) remains in handleCache. The argument segment is bounded
    // to the layout size (reinterpret); a struct return requires a
    // SegmentAllocator as the MethodHandle's first argument (FFM convention),
    // using the caller's MemoryAllocator arena to carry the returned struct's scope.

    fun callStructArgBox(fn: Long, structPtr: Long) {
        val layout = structLayout("Box")
        val handle = handle(fn, ShapeId.S_ARG_BOX, FunctionDescriptor.ofVoid(layout), layoutVersion("Box"))
        handle.invokeExact(segment(structPtr).reinterpret(layout.byteSize()))
    }

    fun callStructReturnBox(fn: Long, allocator: MemoryAllocator, a1: Int): NativeAddress {
        val layout = structLayout("Box")
        val handle = handle(fn, ShapeId.S_RET_BOX, FunctionDescriptor.of(layout, ValueLayout.JAVA_INT), layoutVersion("Box"))
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(segmentAllocator, a1) as MemorySegment
        return NativeAddress(result.address())
    }

    // --- wgpu signature union: structs passed by value ---
    //
    // Extended shapes: wgpu signatures pass structs by value together with
    // scalar arguments (for example, StringView after a pointer or callbackInfo
    // structs to a function returning WGPUFuture). Each wrapper is dedicated to
    // one shape and struct pair. Each struct layout is resolved from the
    // registry, and the descriptor is built once per (address, shape, layout
    // version) in handleCache. Struct argument segments are bounded to their
    // layout size; struct returns require the caller allocator's SegmentAllocator
    // (FFM convention).

    /**
     * MethodHandle for a wrapper with a struct-by-value argument:
     * [scalarArgLayouts] are the layouts of scalar/pointer arguments that
     * PRECEDE the struct in C order (the struct is always the last argument, as
     * checked by kextract during generation). [returnLayout] is null for Unit
     * returns; otherwise it is the return layout (for example, C_POINTER for
     * wgpuGetProcAddress). There is one shape per wrapper name, never overloads.
     */
    private fun structArgHandle(
        fn: Long,
        shapeId: Int,
        structName: String,
        scalarArgLayouts: List<ValueLayout> = emptyList(),
        returnLayout: MemoryLayout? = null,
    ): MethodHandle {
        val layout = structLayout(structName)
        val descriptor = if (returnLayout == null) {
            FunctionDescriptor.ofVoid(*(scalarArgLayouts + layout).toTypedArray())
        } else {
            FunctionDescriptor.of(returnLayout, *(scalarArgLayouts + layout).toTypedArray())
        }
        return handle(fn, shapeId, descriptor, layoutVersion(structName))
    }

    /**
     * MethodHandle for a wrapper returning a struct by value, with zero or one
     * struct-by-value argument ([argStructNames], the last argument). The cache
     * key's layout version combines the versions of ALL structs in the
     * descriptor (return and arguments), so re-registering any one of them
     * rebuilds the MethodHandle instead of reusing a stale descriptor.
     */
    private fun structReturnHandle(
        fn: Long,
        shapeId: Int,
        returnName: String,
        argStructNames: List<String> = emptyList(),
        scalarArgLayouts: List<ValueLayout> = emptyList(),
    ): MethodHandle {
        val argLayouts = argStructNames.map(::structLayout)
        val descriptor = FunctionDescriptor.of(
            structLayout(returnName),
            *(scalarArgLayouts + argLayouts).toTypedArray(),
        )
        val version = (listOf(returnName) + argStructNames).fold(0) { acc, name ->
            acc * 31 + layoutVersion(name)
        }
        return handle(fn, shapeId, descriptor, version)
    }

    private fun structSegment(structPtr: Long, structName: String): MemorySegment {
        val layout = structLayout(structName)
        return segment(structPtr).reinterpret(layout.byteSize())
    }

    // --- Struct argument with a Unit return (freeMembers and similar functions) ---

    fun callStructArgWGPUAdapterInfo(fn: Long, structPtr: Long) {
        val handle = structArgHandle(fn, ShapeId.S_ARG_ADAPTER_INFO, "WGPUAdapterInfo")
        handle.invokeExact(structSegment(structPtr, "WGPUAdapterInfo"))
    }

    fun callStructArgWGPUSupportedFeatures(fn: Long, structPtr: Long) {
        val handle = structArgHandle(fn, ShapeId.S_ARG_SUPPORTED_FEATURES, "WGPUSupportedFeatures")
        handle.invokeExact(structSegment(structPtr, "WGPUSupportedFeatures"))
    }

    fun callStructArgWGPUSupportedInstanceFeatures(fn: Long, structPtr: Long) {
        val handle = structArgHandle(fn, ShapeId.S_ARG_SUPPORTED_INSTANCE_FEATURES, "WGPUSupportedInstanceFeatures")
        handle.invokeExact(structSegment(structPtr, "WGPUSupportedInstanceFeatures"))
    }

    fun callStructArgWGPUSupportedWGSLLanguageFeatures(fn: Long, structPtr: Long) {
        val handle = structArgHandle(fn, ShapeId.S_ARG_SUPPORTED_WGSL_LANGUAGE_FEATURES, "WGPUSupportedWGSLLanguageFeatures")
        handle.invokeExact(structSegment(structPtr, "WGPUSupportedWGSLLanguageFeatures"))
    }

    fun callStructArgWGPUSurfaceCapabilities(fn: Long, structPtr: Long) {
        val handle = structArgHandle(fn, ShapeId.S_ARG_SURFACE_CAPABILITIES, "WGPUSurfaceCapabilities")
        handle.invokeExact(structSegment(structPtr, "WGPUSurfaceCapabilities"))
    }

    // --- WGPUStringView argument (SetLabel / PushDebugGroup / InsertDebugMarker) ---

    fun callStructArgWGPUStringView(fn: Long, p1: Long, structPtr: Long) {
        val handle = structArgHandle(fn, ShapeId.S_ARG_STRINGVIEW_P, "WGPUStringView", listOf(C_POINTER))
        handle.invokeExact(segment(p1), structSegment(structPtr, "WGPUStringView"))
    }

    // --- WGPUStringView argument with a pointer return (wgpuGetProcAddress) ---
    // Distinct from callStructArgWGPUStringView (which returns Unit): it has a
    // dedicated name, with one shape per wrapper name and no overloads.

    fun callStructArgWGPUStringViewRetP(fn: Long, structPtr: Long): Long {
        val handle = structArgHandle(
            fn,
            ShapeId.S_ARG_STRINGVIEW_RET_P,
            "WGPUStringView",
            returnLayout = C_POINTER,
        )
        return (handle.invokeExact(structSegment(structPtr, "WGPUStringView")) as MemorySegment).address()
    }

    // --- WGPUFuture return ---

    fun callStructReturnWGPUFuture(fn: Long, allocator: MemoryAllocator, p1: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_P,
            returnName = "WGPUFuture",
            scalarArgLayouts = listOf(C_POINTER),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(segmentAllocator, segment(p1)) as MemorySegment
        return NativeAddress(result.address())
    }

    fun callStructReturnWGPUFutureWGPUQueueWorkDoneCallbackInfo(fn: Long, allocator: MemoryAllocator, p1: Long, structPtr: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_P_QUEUE_WORK_DONE,
            returnName = "WGPUFuture",
            argStructNames = listOf("WGPUQueueWorkDoneCallbackInfo"),
            scalarArgLayouts = listOf(C_POINTER),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(
            segmentAllocator,
            segment(p1),
            structSegment(structPtr, "WGPUQueueWorkDoneCallbackInfo"),
        ) as MemorySegment
        return NativeAddress(result.address())
    }

    fun callStructReturnWGPUFutureWGPUPopErrorScopeCallbackInfo(fn: Long, allocator: MemoryAllocator, p1: Long, structPtr: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_P_POP_ERROR_SCOPE,
            returnName = "WGPUFuture",
            argStructNames = listOf("WGPUPopErrorScopeCallbackInfo"),
            scalarArgLayouts = listOf(C_POINTER),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(
            segmentAllocator,
            segment(p1),
            structSegment(structPtr, "WGPUPopErrorScopeCallbackInfo"),
        ) as MemorySegment
        return NativeAddress(result.address())
    }

    fun callStructReturnWGPUFutureWGPUCompilationInfoCallbackInfo(fn: Long, allocator: MemoryAllocator, p1: Long, structPtr: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_P_COMPILATION_INFO,
            returnName = "WGPUFuture",
            argStructNames = listOf("WGPUCompilationInfoCallbackInfo"),
            scalarArgLayouts = listOf(C_POINTER),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(
            segmentAllocator,
            segment(p1),
            structSegment(structPtr, "WGPUCompilationInfoCallbackInfo"),
        ) as MemorySegment
        return NativeAddress(result.address())
    }

    fun callStructReturnWGPUFutureWGPURequestAdapterCallbackInfo(fn: Long, allocator: MemoryAllocator, p1: Long, p2: Long, structPtr: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_PP_REQUEST_ADAPTER,
            returnName = "WGPUFuture",
            argStructNames = listOf("WGPURequestAdapterCallbackInfo"),
            scalarArgLayouts = listOf(C_POINTER, C_POINTER),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(
            segmentAllocator,
            segment(p1),
            segment(p2),
            structSegment(structPtr, "WGPURequestAdapterCallbackInfo"),
        ) as MemorySegment
        return NativeAddress(result.address())
    }

    fun callStructReturnWGPUFutureWGPURequestDeviceCallbackInfo(fn: Long, allocator: MemoryAllocator, p1: Long, p2: Long, structPtr: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_PP_REQUEST_DEVICE,
            returnName = "WGPUFuture",
            argStructNames = listOf("WGPURequestDeviceCallbackInfo"),
            scalarArgLayouts = listOf(C_POINTER, C_POINTER),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(
            segmentAllocator,
            segment(p1),
            segment(p2),
            structSegment(structPtr, "WGPURequestDeviceCallbackInfo"),
        ) as MemorySegment
        return NativeAddress(result.address())
    }

    fun callStructReturnWGPUFutureWGPUCreateRenderPipelineAsyncCallbackInfo(fn: Long, allocator: MemoryAllocator, p1: Long, p2: Long, structPtr: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_PP_CREATE_RENDER_PIPELINE_ASYNC,
            returnName = "WGPUFuture",
            argStructNames = listOf("WGPUCreateRenderPipelineAsyncCallbackInfo"),
            scalarArgLayouts = listOf(C_POINTER, C_POINTER),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(
            segmentAllocator,
            segment(p1),
            segment(p2),
            structSegment(structPtr, "WGPUCreateRenderPipelineAsyncCallbackInfo"),
        ) as MemorySegment
        return NativeAddress(result.address())
    }

    fun callStructReturnWGPUFutureWGPUCreateComputePipelineAsyncCallbackInfo(fn: Long, allocator: MemoryAllocator, p1: Long, p2: Long, structPtr: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_PP_CREATE_COMPUTE_PIPELINE_ASYNC,
            returnName = "WGPUFuture",
            argStructNames = listOf("WGPUCreateComputePipelineAsyncCallbackInfo"),
            scalarArgLayouts = listOf(C_POINTER, C_POINTER),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(
            segmentAllocator,
            segment(p1),
            segment(p2),
            structSegment(structPtr, "WGPUCreateComputePipelineAsyncCallbackInfo"),
        ) as MemorySegment
        return NativeAddress(result.address())
    }

    fun callStructReturnWGPUFutureWGPUBufferMapCallbackInfo(fn: Long, allocator: MemoryAllocator, p1: Long, a2: Long, a3: Long, a4: Long, structPtr: Long): NativeAddress {
        val handle = structReturnHandle(
            fn,
            ShapeId.S_RET_FUTURE_PLLL_BUFFER_MAP,
            returnName = "WGPUFuture",
            argStructNames = listOf("WGPUBufferMapCallbackInfo"),
            scalarArgLayouts = listOf(C_POINTER, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG),
        )
        val segmentAllocator: SegmentAllocator = allocator.arena
        val result = handle.invokeExact(
            segmentAllocator,
            segment(p1),
            a2,
            a3,
            a4,
            structSegment(structPtr, "WGPUBufferMapCallbackInfo"),
        ) as MemorySegment
        return NativeAddress(result.address())
    }
}
