package org.graphiks.kffi.harfbuzz

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle

/**
 * The JVM entry point of the bundled HarfBuzz library.
 *
 * The constructor loads and verifies the embedded native library through [HarfBuzzNativeLoader].
 * The loaded loader and its symbol handles remain valid for the process lifetime, so the
 * instance is safe to share across threads once created.
 */
public actual class HarfBuzz private actual constructor() {
    private val loader: HarfBuzzNativeLoader = HarfBuzzNativeLoader.load()
    private val operations: HarfBuzzOperations = HarfBuzzOperations(loader)

    public actual fun version(): String = loader.versionString()

    public actual val bindingIdentity: HarfBuzzBindingIdentity get() = loader.identity

    public actual fun createBlob(bytes: ByteArray): HarfBuzzBlob = HarfBuzzBlob(operations, bytes)

    public actual fun createBuffer(): HarfBuzzBuffer = HarfBuzzBuffer(
        operations,
        requireNativeHandle(address(operations.bufferCreate), "buffer"),
    )

    public actual fun parseScript(value: String): HarfBuzzScript = Arena.ofConfined().use { arena ->
        int(operations.scriptFromString, arena.allocateFrom(value), -1)
        HarfBuzzScript(value)
    }

    public actual fun parseLanguage(value: String): HarfBuzzLanguage = Arena.ofConfined().use { arena ->
        val language = address(operations.languageFromString, arena.allocateFrom(value), -1)
        if (language == MemorySegment.NULL) {
            throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.LIBRARY_LOAD,
                "HarfBuzz could not parse the language identifier: $value",
                cause = null,
            )
        }
        HarfBuzzLanguage(value)
    }

    public actual companion object {
        public actual fun open(): HarfBuzz = HarfBuzz()
    }
}

/**
 * An owned native blob copying [bytes] into a dedicated shared arena.
 *
 * The arena and native blob live until [close]. Creating a face transfers ownership to the
 * returned [HarfBuzzFace], which closes the blob when the face is released.
 */
public actual class HarfBuzzBlob internal constructor(
    private val operations: HarfBuzzOperations,
    bytes: ByteArray,
) : AutoCloseable {
    private val arena: Arena = Arena.ofShared()
    private var closed: Boolean = false
    private val blob: MemorySegment

    init {
        val copiedBytes = arena.allocate(bytes.size.toLong(), 1)
        copiedBytes.copyFrom(MemorySegment.ofArray(bytes))
        blob = try {
            requireNativeHandle(
                address(
                    operations.blobCreate,
                    copiedBytes,
                    bytes.size,
                    HB_MEMORY_MODE_READONLY,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                ),
                "blob",
            )
        } catch (error: Throwable) {
            arena.close()
            throw error
        }
    }

    public actual fun createFace(faceIndex: Int): HarfBuzzFace {
        val face = requireNativeHandle(address(operations.faceCreate, blob, faceIndex), "face")
        return HarfBuzzFace(operations, this, face)
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        callVoid(operations.blobDestroy, blob)
        arena.close()
    }
}

/**
 * An owned native face retaining the [HarfBuzzBlob] whose memory backs it.
 *
 * Releasing the face destroys the native face first, then releases the retained blob.
 */
public actual class HarfBuzzFace internal constructor(
    private val operations: HarfBuzzOperations,
    private val blob: HarfBuzzBlob,
    private val face: MemorySegment,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun unitsPerEm(): Int = int(operations.faceGetUpem, face)

    public actual fun makeImmutable() {
        callVoid(operations.faceMakeImmutable, face)
    }

    public actual fun createFont(): HarfBuzzFont {
        val font = requireNativeHandle(address(operations.fontCreate, face), "font")
        return HarfBuzzFont(operations, this, font)
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        callVoid(operations.faceDestroy, face)
        blob.close()
    }
}

/**
 * An owned native font retaining the [HarfBuzzFace] it was created from.
 *
 * Releasing the font destroys the native font first, then releases the retained face.
 */
public actual class HarfBuzzFont internal constructor(
    private val operations: HarfBuzzOperations,
    private val face: HarfBuzzFace,
    internal val nativeFont: MemorySegment,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun useOpenTypeFunctions() {
        callVoid(operations.otFontSetFuncs, nativeFont)
    }

    public actual fun setScale(x: Int, y: Int) {
        callVoid(operations.fontSetScale, nativeFont, x, y)
    }

    public actual fun makeImmutable() {
        callVoid(operations.fontMakeImmutable, nativeFont)
    }

    public actual fun glyphHorizontalAdvance(glyphId: Int): Int =
        int(operations.fontGetGlyphHorizontalAdvance, nativeFont, glyphId)

    public actual fun ligatureCarets(
        direction: HarfBuzzDirection,
        glyphId: Int,
        offset: Int,
        maxCount: Int,
    ): HarfBuzzLigatureCarets = Arena.ofConfined().use { arena ->
        val count = arena.allocateFrom(ValueLayout.JAVA_INT, maxCount)
        val positions = arena.allocate(ValueLayout.JAVA_INT, maxCount.toLong())
        val totalCount = int(
            operations.ligatureCarets,
            nativeFont,
            direction.toNativeDirection(),
            glyphId,
            offset,
            count,
            positions,
        )
        val copiedCount = count.get(ValueLayout.JAVA_INT, 0).coerceIn(0, maxCount)
        HarfBuzzLigatureCarets(
            totalCount = totalCount,
            copiedCount = copiedCount,
            positions = IntArray(copiedCount) { index ->
                positions.getAtIndex(ValueLayout.JAVA_INT, index.toLong())
            },
        )
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        callVoid(operations.fontDestroy, nativeFont)
        face.close()
    }
}

/**
 * An owned native shaping buffer.
 *
 * All setters and queries must be used before [close]; the buffer is not thread-safe and is
 * intended to be confined to one shaping operation at a time.
 */
public actual class HarfBuzzBuffer internal constructor(
    private val operations: HarfBuzzOperations,
    private val buffer: MemorySegment,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun setDirection(direction: HarfBuzzDirection) {
        callVoid(operations.bufferSetDirection, buffer, direction.toNativeDirection())
    }

    public actual fun setScript(script: HarfBuzzScript) {
        Arena.ofConfined().use { arena ->
            callVoid(operations.bufferSetScript, buffer, int(operations.scriptFromString, arena.allocateFrom(script.value), -1))
        }
    }

    public actual fun setLanguage(language: HarfBuzzLanguage) {
        Arena.ofConfined().use { arena ->
            callVoid(
                operations.bufferSetLanguage,
                buffer,
                address(operations.languageFromString, arena.allocateFrom(language.value), -1),
            )
        }
    }

    public actual fun setClusterLevel(level: HarfBuzzClusterLevel) {
        val nativeLevel = when (level) {
            HarfBuzzClusterLevel.MONOTONE_GRAPHEMES -> 0
            HarfBuzzClusterLevel.MONOTONE_CHARACTERS -> 1
            HarfBuzzClusterLevel.CHARACTERS -> 2
        }
        callVoid(operations.bufferSetClusterLevel, buffer, nativeLevel)
    }

    public actual fun setFlags(flags: HarfBuzzBufferFlags) {
        var nativeFlags = 0
        if (flags.beginningOfText) nativeFlags = nativeFlags or HB_BUFFER_FLAG_BOT
        if (flags.endOfText) nativeFlags = nativeFlags or HB_BUFFER_FLAG_EOT
        if (flags.produceUnsafeToConcat) nativeFlags = nativeFlags or HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT
        callVoid(operations.bufferSetFlags, buffer, nativeFlags)
    }

    public actual fun addUtf32(codePoints: IntArray, itemOffset: Int, itemLength: Int) {
        Arena.ofConfined().use { arena ->
            val text = arena.allocate(ValueLayout.JAVA_INT, codePoints.size.toLong())
            for (index in codePoints.indices) {
                text.setAtIndex(ValueLayout.JAVA_INT, index.toLong(), codePoints[index])
            }
            callVoid(operations.bufferAddUtf32, buffer, text, codePoints.size, itemOffset, itemLength)
        }
    }

    public actual fun shape(font: HarfBuzzFont, features: List<HarfBuzzFeature>): Boolean =
        Arena.ofConfined().use { arena ->
            val featureArray = if (features.isEmpty()) {
                MemorySegment.NULL
            } else {
                val segment = arena.allocate(
                    FEATURE_BYTES * features.size,
                    ValueLayout.JAVA_INT.byteAlignment(),
                )
                features.forEachIndexed { index, feature ->
                    val offset = index.toLong() * FEATURE_BYTES
                    segment.set(ValueLayout.JAVA_INT, offset, feature.tag.rawValue())
                    segment.set(ValueLayout.JAVA_INT, offset + 4, feature.value)
                    segment.set(ValueLayout.JAVA_INT, offset + 8, feature.start)
                    segment.set(ValueLayout.JAVA_INT, offset + 12, feature.end)
                }
                segment
            }
            val shapers = arena.allocate(ValueLayout.ADDRESS, 2)
            shapers.setAtIndex(ValueLayout.ADDRESS, 0, arena.allocateFrom("ot"))
            shapers.setAtIndex(ValueLayout.ADDRESS, 1, MemorySegment.NULL)
            int(
                operations.shapeFull,
                font.nativeFont,
                buffer,
                featureArray,
                features.size,
                shapers,
            ) != 0
        }

    public actual fun glyphCount(): Int = int(operations.bufferGetLength, buffer)

    public actual fun glyphInfos(): List<HarfBuzzGlyphInfo> {
        val count = glyphCount()
        if (count == 0) return emptyList()
        val infos = address(operations.bufferGetGlyphInfos, buffer, MemorySegment.NULL)
            .reinterpret(count.toLong() * GLYPH_INFO_BYTES)
        return List(count) { index ->
            val offset = index.toLong() * GLYPH_INFO_BYTES
            val flags = int(operations.glyphInfoGetGlyphFlags, infos.asSlice(offset, GLYPH_INFO_BYTES))
            HarfBuzzGlyphInfo(
                glyphId = infos.get(ValueLayout.JAVA_INT, offset),
                cluster = infos.get(ValueLayout.JAVA_INT, offset + 8),
                flags = HarfBuzzGlyphFlags(
                    unsafeToBreak = flags and HB_GLYPH_FLAG_UNSAFE_TO_BREAK != 0,
                    unsafeToConcat = flags and HB_GLYPH_FLAG_UNSAFE_TO_CONCAT != 0,
                ),
            )
        }
    }

    public actual fun glyphPositions(): List<HarfBuzzGlyphPosition> {
        val count = glyphCount()
        if (count == 0) return emptyList()
        val positions = address(operations.bufferGetGlyphPositions, buffer, MemorySegment.NULL)
            .reinterpret(count.toLong() * GLYPH_POSITION_BYTES)
        return List(count) { index ->
            val offset = index.toLong() * GLYPH_POSITION_BYTES
            HarfBuzzGlyphPosition(
                xAdvance = positions.get(ValueLayout.JAVA_INT, offset),
                yAdvance = positions.get(ValueLayout.JAVA_INT, offset + 4),
                xOffset = positions.get(ValueLayout.JAVA_INT, offset + 8),
                yOffset = positions.get(ValueLayout.JAVA_INT, offset + 12),
            )
        }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        callVoid(operations.bufferDestroy, buffer)
    }
}

/**
 * The resolved HarfBuzz downcall handles used by the binding.
 *
 * All handles are resolved from a single [HarfBuzzNativeLoader]; the loader keeps the library
 * scope alive for the process lifetime, so the handles stay valid.
 */
internal class HarfBuzzOperations(loader: HarfBuzzNativeLoader) {
    val blobCreate: MethodHandle = loader.handle(
        "hb_blob_create",
        FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
        ),
    )
    val blobDestroy: MethodHandle = loader.handle("hb_blob_destroy", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))
    val faceCreate: MethodHandle = loader.handle(
        "hb_face_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
    )
    val faceDestroy: MethodHandle = loader.handle("hb_face_destroy", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))
    val faceGetUpem: MethodHandle =
        loader.handle("hb_face_get_upem", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS))
    val faceMakeImmutable: MethodHandle =
        loader.handle("hb_face_make_immutable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))
    val fontCreate: MethodHandle =
        loader.handle("hb_font_create", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS))
    val fontDestroy: MethodHandle = loader.handle("hb_font_destroy", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))
    val fontMakeImmutable: MethodHandle =
        loader.handle("hb_font_make_immutable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))
    val otFontSetFuncs: MethodHandle =
        loader.handle("hb_ot_font_set_funcs", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))
    val fontSetScale: MethodHandle = loader.handle(
        "hb_font_set_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
    )
    val bufferCreate: MethodHandle =
        loader.handle("hb_buffer_create", FunctionDescriptor.of(ValueLayout.ADDRESS))
    val bufferDestroy: MethodHandle = loader.handle("hb_buffer_destroy", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS))
    val bufferSetDirection: MethodHandle = loader.handle(
        "hb_buffer_set_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
    )
    val bufferSetScript: MethodHandle = loader.handle(
        "hb_buffer_set_script",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
    )
    val bufferSetLanguage: MethodHandle = loader.handle(
        "hb_buffer_set_language",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    val bufferSetClusterLevel: MethodHandle = loader.handle(
        "hb_buffer_set_cluster_level",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
    )
    val bufferSetFlags: MethodHandle = loader.handle(
        "hb_buffer_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
    )
    val bufferAddUtf32: MethodHandle = loader.handle(
        "hb_buffer_add_utf32",
        FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
        ),
    )
    val languageFromString: MethodHandle = loader.handle(
        "hb_language_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
    )
    val scriptFromString: MethodHandle = loader.handle(
        "hb_script_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
    )
    val shapeFull: MethodHandle = loader.handle(
        "hb_shape_full",
        FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
        ),
    )
    val bufferGetLength: MethodHandle =
        loader.handle("hb_buffer_get_length", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS))
    val bufferGetGlyphInfos: MethodHandle = loader.handle(
        "hb_buffer_get_glyph_infos",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    val bufferGetGlyphPositions: MethodHandle = loader.handle(
        "hb_buffer_get_glyph_positions",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    val glyphInfoGetGlyphFlags: MethodHandle = loader.handle(
        "hb_glyph_info_get_glyph_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
    )
    val fontGetGlyphHorizontalAdvance: MethodHandle = loader.handle(
        "hb_font_get_glyph_h_advance",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
    )
    val ligatureCarets: MethodHandle = loader.handle(
        "hb_ot_layout_get_ligature_carets",
        FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
        ),
    )
}

/** Maps a portable direction to the HarfBuzz `hb_direction_t` constant. */
private fun HarfBuzzDirection.toNativeDirection(): Int = when (this) {
    HarfBuzzDirection.LEFT_TO_RIGHT -> HB_DIRECTION_LTR
    HarfBuzzDirection.RIGHT_TO_LEFT -> HB_DIRECTION_RTL
    HarfBuzzDirection.TOP_TO_BOTTOM -> HB_DIRECTION_TTB
}

/** Invokes a downcall [handle] and narrows its result to a machine integer. */
private fun int(handle: MethodHandle, vararg arguments: Any?): Int =
    handle.invokeWithArguments(*arguments) as Int

/** Invokes a downcall [handle] whose result is ignored. */
private fun callVoid(handle: MethodHandle, vararg arguments: Any?) {
    handle.invokeWithArguments(*arguments)
}

/**
 * Returns [handle] unchanged, or throws a [HarfBuzzBindingException] when native creation
 * returned a null pointer.
 */
private fun requireNativeHandle(handle: MemorySegment, label: String): MemorySegment =
    if (handle == MemorySegment.NULL) {
        throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.LIBRARY_LOAD,
            "HarfBuzz could not create a native $label.",
            cause = null,
        )
    } else {
        handle
    }

private const val HB_MEMORY_MODE_READONLY: Int = 1
private const val HB_DIRECTION_LTR: Int = 4
private const val HB_DIRECTION_RTL: Int = 5
private const val HB_DIRECTION_TTB: Int = 6
private const val HB_BUFFER_FLAG_BOT: Int = 0x00000001
private const val HB_BUFFER_FLAG_EOT: Int = 0x00000002
private const val HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT: Int = 0x00000040
private const val HB_GLYPH_FLAG_UNSAFE_TO_BREAK: Int = 0x00000001
private const val HB_GLYPH_FLAG_UNSAFE_TO_CONCAT: Int = 0x00000002
private const val FEATURE_BYTES: Long = 16L
private const val GLYPH_INFO_BYTES: Long = 20L
private const val GLYPH_POSITION_BYTES: Long = 20L
