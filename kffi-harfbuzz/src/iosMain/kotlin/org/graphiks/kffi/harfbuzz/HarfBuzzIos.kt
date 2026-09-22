@file:OptIn(ExperimentalForeignApi::class)

package org.graphiks.kffi.harfbuzz

import cnames.structs.hb_blob_t
import cnames.structs.hb_buffer_t
import cnames.structs.hb_face_t
import cnames.structs.hb_font_t
import harfbuzz.hb_blob_create_or_fail
import harfbuzz.hb_blob_destroy
import harfbuzz.hb_buffer_add_utf32
import harfbuzz.hb_buffer_create
import harfbuzz.hb_buffer_destroy
import harfbuzz.hb_buffer_get_glyph_infos
import harfbuzz.hb_buffer_get_glyph_positions
import harfbuzz.hb_buffer_get_length
import harfbuzz.hb_buffer_set_cluster_level
import harfbuzz.hb_buffer_set_direction
import harfbuzz.hb_buffer_set_flags
import harfbuzz.hb_buffer_set_language
import harfbuzz.hb_buffer_set_script
import harfbuzz.hb_face_create
import harfbuzz.hb_face_destroy
import harfbuzz.hb_face_get_upem
import harfbuzz.hb_face_make_immutable
import harfbuzz.hb_feature_t
import harfbuzz.hb_font_create
import harfbuzz.hb_font_destroy
import harfbuzz.hb_font_get_glyph_h_advance
import harfbuzz.hb_font_get_glyph_v_advance
import harfbuzz.hb_font_make_immutable
import harfbuzz.hb_font_set_scale
import harfbuzz.hb_font_set_var_coords_normalized
import harfbuzz.hb_font_set_variations
import harfbuzz.hb_variation_t
import harfbuzz.hb_glyph_info_get_glyph_flags
import harfbuzz.hb_language_from_string
import harfbuzz.hb_language_to_string
import harfbuzz.hb_memory_mode_t
import harfbuzz.hb_ot_font_set_funcs
import harfbuzz.hb_ot_layout_get_ligature_carets
import harfbuzz.hb_script_from_string
import harfbuzz.hb_shape_full
import harfbuzz.hb_version_string
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.alloc
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.cstr
import kotlinx.cinterop.get
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.set
import kotlinx.cinterop.toKString
import kotlinx.cinterop.usePinned
import kotlinx.cinterop.value

/**
 * The iOS entry point of the statically linked HarfBuzz library.
 *
 * Unlike the Android and JVM bindings, iOS links the pinned `libharfbuzz.a` directly at compile
 * time through the `harfbuzz` cinterop, so there is no library to load, verify or resolve. The
 * engine is therefore always available and the instance is safe to share across threads.
 */
public actual class HarfBuzz private actual constructor() {
    private val reportedVersion: String = requireVersion()

    public actual fun version(): String = reportedVersion

    public actual val bindingIdentity: HarfBuzzBindingIdentity
        get() = harfBuzzBindingIdentity(reportedVersion)

    public actual fun createBlob(bytes: ByteArray): HarfBuzzBlob = HarfBuzzBlob(bytes)

    public actual fun createBuffer(): HarfBuzzBuffer =
        HarfBuzzBuffer(requireNativeHandle(hb_buffer_create(), "buffer"))

    public actual fun parseScript(value: String): HarfBuzzScript {
        val script = hb_script_from_string(value, -1)
        if (script == HB_SCRIPT_INVALID) {
            throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.NATIVE_OPERATION,
                "HarfBuzz could not parse the script identifier: $value",
                cause = null,
            )
        }
        return HarfBuzzScript(canonicalScriptTag(script.toInt()))
    }

    public actual fun parseLanguage(value: String): HarfBuzzLanguage {
        val language = hb_language_from_string(value, -1) ?: throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.NATIVE_OPERATION,
            "HarfBuzz could not parse the language identifier: $value",
            cause = null,
        )
        val text = hb_language_to_string(language) ?: throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.NATIVE_OPERATION,
            "HarfBuzz could not parse the language identifier: $value",
            cause = null,
        )
        return HarfBuzzLanguage(text.toKString())
    }

    public actual companion object {
        public actual fun open(): HarfBuzz = HarfBuzz()
    }

    private fun requireVersion(): String {
        val reported = harfBuzzVersionString()
        if (reported != HARFBUZZ_VERSION) {
            throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.VERSION_MISMATCH,
                "The loaded HarfBuzz library reports $reported, expected $HARFBUZZ_VERSION.",
            )
        }
        return reported
    }
}

/**
 * An owned native blob retaining a private copy of the source bytes.
 *
 * The blob is a reference-counted `hb_blob_t` that owns a duplicate of the font bytes
 * (`HB_MEMORY_MODE_DUPLICATE`); the copy is released by `hb_blob_destroy`, so the original Kotlin
 * array may be collected as soon as the blob is created. A blob may create several faces and each
 * face several fonts; [close] defers destruction until the last live descendant has been released,
 * so every child must be closed before its parent. Close is idempotent, but it is not synchronised
 * across threads.
 *
 * The cinterop `hb_blob_create_or_fail` binding disables string conversion (`noStringConversion` in
 * `harfbuzz.def`), so its `const char* data` parameter is a raw pointer and can carry arbitrary
 * font bytes losslessly.
 */
public actual class HarfBuzzBlob internal constructor(bytes: ByteArray) : AutoCloseable {
    private var closed: Boolean = false
    private var descendants: Int = 0
    private val blob: CPointer<hb_blob_t>

    init {
        blob = requireNativeHandle(createMemoryBlob(bytes), "blob")
    }

    public actual fun createFace(faceIndex: Int): HarfBuzzFace {
        requireOpen()
        addDescendant()
        val face = try {
            requireNativeHandle(hb_face_create(blob, faceIndex.toUInt()), "face")
        } catch (error: Throwable) {
            releaseDescendant()
            throw error
        }
        return HarfBuzzFace(this, face)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz blob has been closed." }
    }

    /** Registers a live face or font that retains this blob. */
    internal fun addDescendant() {
        descendants += 1
    }

    /** Releases one descendant, destroying the blob once the last live one is gone. */
    internal fun releaseDescendant() {
        check(descendants > 0) { "The HarfBuzz blob has no live descendant to release." }
        descendants -= 1
        if (closed && descendants == 0) destroy()
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        if (descendants == 0) destroy()
    }

    private fun destroy() {
        hb_blob_destroy(blob)
    }
}

/**
 * An owned native face retaining the [HarfBuzzBlob] whose memory backs it.
 *
 * A face may create several fonts. Releasing the face releases only its own reference to the blob;
 * the blob is not destroyed until every font created here is also closed. Close is idempotent, but
 * it is not synchronised across threads.
 */
public actual class HarfBuzzFace internal constructor(
    private val blob: HarfBuzzBlob,
    private val face: CPointer<hb_face_t>,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun unitsPerEm(): Int {
        requireOpen()
        return hb_face_get_upem(face).toInt()
    }

    public actual fun makeImmutable() {
        requireOpen()
        hb_face_make_immutable(face)
    }

    public actual fun createFont(): HarfBuzzFont {
        requireOpen()
        blob.addDescendant()
        val font = try {
            requireNativeHandle(hb_font_create(face), "font")
        } catch (error: Throwable) {
            blob.releaseDescendant()
            throw error
        }
        return HarfBuzzFont(blob, font)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz face has been closed." }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        try {
            hb_face_destroy(face)
        } finally {
            blob.releaseDescendant()
        }
    }
}

/**
 * An owned native font retaining the [HarfBuzzBlob] that backs its face.
 *
 * Releasing the font destroys the native font first, then releases its own reference to the blob.
 * Close is idempotent, but it is not synchronised across threads.
 */
public actual class HarfBuzzFont internal constructor(
    private val blob: HarfBuzzBlob,
    internal val nativeFont: CPointer<hb_font_t>,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun useOpenTypeFunctions() {
        requireOpen()
        hb_ot_font_set_funcs(nativeFont)
    }

    public actual fun setScale(x: Int, y: Int) {
        requireOpen()
        hb_font_set_scale(nativeFont, x, y)
    }

    public actual fun setVarCoordsNormalized(coords: IntArray) {
        requireOpen()
        if (coords.isEmpty()) {
            hb_font_set_var_coords_normalized(nativeFont, null, 0u)
            return
        }
        coords.usePinned { pinned ->
            hb_font_set_var_coords_normalized(nativeFont, pinned.addressOf(0), coords.size.toUInt())
        }
    }

    public actual fun setVariations(variations: List<HarfBuzzVariation>) {
        requireOpen()
        if (variations.isEmpty()) {
            hb_font_set_variations(nativeFont, null, 0u)
            return
        }
        memScoped {
            val array = allocArray<hb_variation_t>(variations.size)
            variations.forEachIndexed { index, variation ->
                array[index].tag = variation.tag.rawValue().toUInt()
                array[index].value = variation.value
            }
            hb_font_set_variations(nativeFont, array, variations.size.toUInt())
        }
    }

    public actual fun makeImmutable() {
        requireOpen()
        hb_font_make_immutable(nativeFont)
    }

    public actual fun glyphHorizontalAdvance(glyphId: Int): Int {
        requireOpen()
        return hb_font_get_glyph_h_advance(nativeFont, glyphId.toUInt())
    }

    public actual fun glyphVerticalAdvance(glyphId: Int): Int {
        requireOpen()
        return hb_font_get_glyph_v_advance(nativeFont, glyphId.toUInt())
    }

    public actual fun ligatureCarets(
        direction: HarfBuzzDirection,
        glyphId: Int,
        offset: Int,
        maxCount: Int,
    ): HarfBuzzLigatureCarets {
        requireOpen()
        return getLigatureCarets(nativeFont, direction.toNativeDirection(), glyphId, offset, maxCount)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz font has been closed." }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        try {
            hb_font_destroy(nativeFont)
        } finally {
            blob.releaseDescendant()
        }
    }
}

/**
 * An owned native shaping buffer.
 *
 * All setters and queries must be used before [close]; the buffer is not thread-safe and is intended
 * to be confined to one shaping operation at a time.
 */
public actual class HarfBuzzBuffer internal constructor(
    private val buffer: CPointer<hb_buffer_t>,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun setDirection(direction: HarfBuzzDirection) {
        requireOpen()
        hb_buffer_set_direction(buffer, direction.toNativeDirection().toUInt())
    }

    public actual fun setScript(script: HarfBuzzScript) {
        requireOpen()
        hb_buffer_set_script(buffer, hb_script_from_string(script.value, -1))
    }

    public actual fun setLanguage(language: HarfBuzzLanguage) {
        requireOpen()
        val nativeLanguage = hb_language_from_string(language.value, -1)
            ?: throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.NATIVE_OPERATION,
                "HarfBuzz could not parse the language identifier: ${language.value}",
                cause = null,
            )
        hb_buffer_set_language(buffer, nativeLanguage)
    }

    public actual fun setClusterLevel(level: HarfBuzzClusterLevel) {
        requireOpen()
        val nativeLevel = when (level) {
            HarfBuzzClusterLevel.MONOTONE_GRAPHEMES -> 0
            HarfBuzzClusterLevel.MONOTONE_CHARACTERS -> 1
            HarfBuzzClusterLevel.CHARACTERS -> 2
        }
        hb_buffer_set_cluster_level(buffer, nativeLevel.toUInt())
    }

    public actual fun setFlags(flags: HarfBuzzBufferFlags) {
        requireOpen()
        var nativeFlags = 0
        if (flags.beginningOfText) nativeFlags = nativeFlags or HB_BUFFER_FLAG_BOT
        if (flags.endOfText) nativeFlags = nativeFlags or HB_BUFFER_FLAG_EOT
        if (flags.produceUnsafeToConcat) nativeFlags = nativeFlags or HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT
        hb_buffer_set_flags(buffer, nativeFlags.toUInt())
    }

    public actual fun addUtf32(codePoints: IntArray, itemOffset: Int, itemLength: Int) {
        requireOpen()
        addUtf32Native(buffer, codePoints, itemOffset, itemLength)
    }

    public actual fun shape(font: HarfBuzzFont, features: List<HarfBuzzFeature>): Boolean {
        requireOpen()
        return shapeNative(font.nativeFont, buffer, features) != 0
    }

    public actual fun glyphCount(): Int {
        requireOpen()
        return hb_buffer_get_length(buffer).toInt()
    }

    public actual fun glyphInfos(): List<HarfBuzzGlyphInfo> {
        requireOpen()
        return glyphInfosNative(buffer)
    }

    public actual fun glyphPositions(): List<HarfBuzzGlyphPosition> {
        requireOpen()
        return glyphPositionsNative(buffer)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz buffer has been closed." }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        hb_buffer_destroy(buffer)
    }
}

// ---------------------------------------------------------------------------
// Native marshalling helpers.
//
// Each helper calls a `harfbuzz.hb_*` function directly through cinterop, so the compiler knows the
// exact signature and no symbol lookup is involved. Short-lived buffers are allocated in a
// `memScoped` arena and freed when the call returns.
// ---------------------------------------------------------------------------

/** The version string reported by `hb_version_string`. */
private fun harfBuzzVersionString(): String {
    val pointer = hb_version_string() ?: throw HarfBuzzBindingException(
        HarfBuzzBindingFailure.NATIVE_OPERATION,
        "HarfBuzz returned a null version string.",
        cause = null,
    )
    return pointer.toKString()
}

/**
 * Copies [bytes] into a native blob HarfBuzz owns.
 *
 * `HB_MEMORY_MODE_DUPLICATE` makes HarfBuzz duplicate the pinned bytes during the call, so the
 * returned blob stays valid after this function returns and the source array can be collected.
 * `hb_blob_create_or_fail` returns `null` when that duplicate cannot be allocated, which
 * [requireNativeHandle] maps to [HarfBuzzBindingFailure.NATIVE_OPERATION]; the non-failing
 * `hb_blob_create` would instead hand back a non-null empty blob and silently drop the font. A
 * zero-length input yields a freshly allocated empty blob (never the shared singleton and never
 * `null`), so an empty array needs no pointer but still gets a blob.
 */
private fun createMemoryBlob(bytes: ByteArray): CPointer<hb_blob_t> {
    if (bytes.isEmpty()) {
        return requireNativeHandle(
            hb_blob_create_or_fail(null, 0u, hb_memory_mode_t.HB_MEMORY_MODE_DUPLICATE, null, null),
            "blob",
        )
    }
    return bytes.usePinned { pinned ->
        requireNativeHandle(
            hb_blob_create_or_fail(
                pinned.addressOf(0),
                bytes.size.toUInt(),
                hb_memory_mode_t.HB_MEMORY_MODE_DUPLICATE,
                null,
                null,
            ),
            "blob",
        )
    }
}

/** Adds UTF-32 [codePoints] to [buffer] through `hb_buffer_add_utf32`. */
private fun addUtf32Native(buffer: CPointer<hb_buffer_t>, codePoints: IntArray, itemOffset: Int, itemLength: Int) {
    if (codePoints.isEmpty()) {
        hb_buffer_add_utf32(buffer, null, 0, itemOffset.toUInt(), itemLength)
        return
    }
    codePoints.usePinned { pinned ->
        hb_buffer_add_utf32(
            buffer,
            pinned.addressOf(0).reinterpret<UIntVar>(),
            codePoints.size,
            itemOffset.toUInt(),
            itemLength,
        )
    }
}

/** Shapes [buffer] in place with [font] and [features] through `hb_shape_full`. */
private fun shapeNative(
    font: CPointer<hb_font_t>,
    buffer: CPointer<hb_buffer_t>,
    features: List<HarfBuzzFeature>,
): Int = memScoped {
    val featureArray = if (features.isEmpty()) {
        null
    } else {
        allocArray<hb_feature_t>(features.size).also { array ->
            features.forEachIndexed { index, feature ->
                array[index].tag = feature.tag.rawValue().toUInt()
                array[index].value = feature.value.toUInt()
                array[index].start = feature.start.toUInt()
                array[index].end = feature.end.toUInt()
            }
        }
    }
    val shapers = allocArray<CPointerVar<ByteVar>>(2)
    shapers[0] = "ot".cstr.getPointer(this)
    shapers[1] = null
    hb_shape_full(font, buffer, featureArray, features.size.toUInt(), shapers)
}

/** Reads every shaped glyph record from [buffer] through `hb_buffer_get_glyph_infos`. */
private fun glyphInfosNative(buffer: CPointer<hb_buffer_t>): List<HarfBuzzGlyphInfo> {
    val count = hb_buffer_get_length(buffer).toInt()
    if (count == 0) return emptyList()
    val infos = hb_buffer_get_glyph_infos(buffer, null) ?: throw HarfBuzzBindingException(
        HarfBuzzBindingFailure.NATIVE_OPERATION,
        "HarfBuzz returned no glyph info storage.",
        cause = null,
    )
    return List(count) { index ->
        val info = infos[index]
        val flags = hb_glyph_info_get_glyph_flags(infos[index].ptr).toInt()
        HarfBuzzGlyphInfo(
            glyphId = info.codepoint.toInt(),
            cluster = info.cluster.toInt(),
            flags = HarfBuzzGlyphFlags(
                unsafeToBreak = flags and HB_GLYPH_FLAG_UNSAFE_TO_BREAK != 0,
                unsafeToConcat = flags and HB_GLYPH_FLAG_UNSAFE_TO_CONCAT != 0,
            ),
        )
    }
}

/** Reads every shaped glyph position from [buffer] through `hb_buffer_get_glyph_positions`. */
private fun glyphPositionsNative(buffer: CPointer<hb_buffer_t>): List<HarfBuzzGlyphPosition> {
    val count = hb_buffer_get_length(buffer).toInt()
    if (count == 0) return emptyList()
    val positions = hb_buffer_get_glyph_positions(buffer, null) ?: throw HarfBuzzBindingException(
        HarfBuzzBindingFailure.NATIVE_OPERATION,
        "HarfBuzz returned no glyph position storage.",
        cause = null,
    )
    return List(count) { index ->
        val position = positions[index]
        HarfBuzzGlyphPosition(
            xAdvance = position.x_advance,
            yAdvance = position.y_advance,
            xOffset = position.x_offset,
            yOffset = position.y_offset,
        )
    }
}

/** Queries up to [maxCount] GDEF ligature caret positions through `hb_ot_layout_get_ligature_carets`. */
private fun getLigatureCarets(
    font: CPointer<hb_font_t>,
    direction: Int,
    glyphId: Int,
    offset: Int,
    maxCount: Int,
): HarfBuzzLigatureCarets = memScoped {
    require(maxCount >= 0) { "The HarfBuzz ligature caret count must not be negative: $maxCount" }
    val count = alloc<UIntVar>()
    count.value = maxCount.toUInt()
    val positions = allocArray<IntVar>(if (maxCount <= 0) 1 else maxCount)
    val totalCount = hb_ot_layout_get_ligature_carets(
        font,
        direction.toUInt(),
        glyphId.toUInt(),
        offset.toUInt(),
        count.ptr,
        positions,
    )
    val copiedCount = count.value.toInt().coerceIn(0, maxCount)
    HarfBuzzLigatureCarets(
        totalCount = totalCount.toInt(),
        copiedCount = copiedCount,
        positions = IntArray(copiedCount) { index -> positions[index] },
    )
}

/** Returns [pointer] unchanged, or throws a [HarfBuzzBindingException] when HarfBuzz returned null. */
private fun <T : CPointed> requireNativeHandle(pointer: CPointer<T>?, label: String): CPointer<T> =
    pointer ?: throw HarfBuzzBindingException(
        HarfBuzzBindingFailure.NATIVE_OPERATION,
        "HarfBuzz could not create a native $label.",
        cause = null,
    )

/** Maps a portable direction to the HarfBuzz `hb_direction_t` constant. */
private fun HarfBuzzDirection.toNativeDirection(): Int = when (this) {
    HarfBuzzDirection.LEFT_TO_RIGHT -> HB_DIRECTION_LTR
    HarfBuzzDirection.RIGHT_TO_LEFT -> HB_DIRECTION_RTL
    HarfBuzzDirection.TOP_TO_BOTTOM -> HB_DIRECTION_TTB
}

/**
 * Decodes the four ASCII characters HarfBuzz packs into an `hb_script_t` tag.
 *
 * HarfBuzz stores the ISO 15924 tag big-endian, the same order [HarfBuzzTag.rawValue] produces.
 */
private fun canonicalScriptTag(script: Int): String = buildString(4) {
    append(((script ushr 24) and 0xff).toChar())
    append(((script ushr 16) and 0xff).toChar())
    append(((script ushr 8) and 0xff).toChar())
    append((script and 0xff).toChar())
}

/** `HB_SCRIPT_INVALID`, returned by HarfBuzz when a script tag cannot be parsed. */
private const val HB_SCRIPT_INVALID: UInt = 0u
private const val HB_DIRECTION_LTR: Int = 4
private const val HB_DIRECTION_RTL: Int = 5
private const val HB_DIRECTION_TTB: Int = 6
private const val HB_BUFFER_FLAG_BOT: Int = 0x00000001
private const val HB_BUFFER_FLAG_EOT: Int = 0x00000002
private const val HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT: Int = 0x00000040
private const val HB_GLYPH_FLAG_UNSAFE_TO_BREAK: Int = 0x00000001
private const val HB_GLYPH_FLAG_UNSAFE_TO_CONCAT: Int = 0x00000002
