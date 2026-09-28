@file:Suppress("unused")

package org.graphiks.kffi.harfbuzz

import org.khronos.webgl.Int8Array
import org.khronos.webgl.toInt8Array


/** The native `hb_direction_t` constant for [direction]. */
private fun HarfBuzzDirection.toNativeDirection(): Int = when (this) {
    HarfBuzzDirection.LEFT_TO_RIGHT -> HB_DIRECTION_LTR
    HarfBuzzDirection.RIGHT_TO_LEFT -> HB_DIRECTION_RTL
    HarfBuzzDirection.TOP_TO_BOTTOM -> HB_DIRECTION_TTB
}

/** Allocates `count` 32-bit words and returns the pointer; the caller must `hbFree` it. */
private fun allocateWords(count: Int): Int = hbAlloc(count * 4)

/** Writes a NUL-terminated UTF-8 string into a fresh heap buffer; the caller frees the pointer. */
private fun writeCString(value: String): Int {
    val encoded = value.encodeToByteArray()
    val pointer = hbAlloc(encoded.size + 1)
    hbWriteBytes(pointer, encoded.toInt8Array())
    // A single zero byte: writing a 32-bit word here would be misaligned and would clobber
    // the string's own first bytes.
    hbWriteBytes(pointer + encoded.size, Int8Array(1))
    return pointer
}

/** Fails loudly when a native creation returned the null pointer (encoded as `0`). */
private fun requireHandle(handle: Int, label: String): Int {
    if (handle == 0) {
        throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.NATIVE_OPERATION,
            "HarfBuzz could not create a native $label.",
            cause = null,
        )
    }
    return handle
}

/**
 * The WebAssembly entry point of the bundled HarfBuzz module.
 *
 * Construction requires a completed [initializeHarfBuzz]; opening before the module is
 * loaded reports [HarfBuzzBindingFailure.LIBRARY_LOAD]. The loaded module is a
 * process-wide singleton, so an instance is safe to share across the single web thread.
 */
public actual class HarfBuzz private actual constructor() {
    init {
        if (!hbReady()) {
            throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.LIBRARY_LOAD,
                "The WebAssembly HarfBuzz module is not initialized: await initializeHarfBuzz() first.",
                cause = null,
            )
        }
    }

    public actual fun version(): String = hbVersion()

    public actual val bindingIdentity: HarfBuzzBindingIdentity = HarfBuzzBindingIdentity(
        operatingSystem = "web",
        architecture = "wasm32",
        artifactId = WEB_HARFBUZZ_ARTIFACT_ID,
        artifactSha256 = WEB_HARFBUZZ_GLUE_SHA256,
        upstreamSourceRevision = WEB_HARFBUZZ_REVISION,
        buildChainIdentity = WEB_HARFBUZZ_BUILD_CHAIN,
        engineVersion = hbVersion(),
    )

    public actual fun createBlob(bytes: ByteArray): HarfBuzzBlob = HarfBuzzBlob(bytes)

    public actual fun createBuffer(): HarfBuzzBuffer =
        HarfBuzzBuffer(requireHandle(hbBufferCreate(), "buffer"))

    public actual fun parseScript(value: String): HarfBuzzScript {
        val pointer = writeCString(value)
        return try {
            val script = hbScriptFromString(pointer)
            if (script == HB_SCRIPT_INVALID) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.NATIVE_OPERATION,
                    "HarfBuzz could not parse the script identifier: $value",
                    cause = null,
                )
            }
            HarfBuzzScript(canonicalScriptTag(script))
        } finally {
            hbFree(pointer)
        }
    }

    public actual fun parseLanguage(value: String): HarfBuzzLanguage {
        val pointer = writeCString(value)
        return try {
            val language = hbLanguageFromString(pointer)
            if (language == 0) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.NATIVE_OPERATION,
                    "HarfBuzz could not parse the language identifier: $value",
                    cause = null,
                )
            }
            HarfBuzzLanguage(hbLanguageToString(language))
        } finally {
            hbFree(pointer)
        }
    }

    public actual companion object {
        public actual fun open(): HarfBuzz = HarfBuzz()
    }
}

/**
 * An owned WebAssembly blob retaining a copy of the source bytes.
 *
 * Every child must be closed before its parent; the same descendant accounting the JVM
 * binding enforces is kept here so close-order mistakes fail identically on every target.
 */
public actual class HarfBuzzBlob internal constructor(
    bytes: ByteArray,
) : AutoCloseable {
    private var closed: Boolean = false
    private var descendants: Int = 0
    internal val nativeBlob: Int

    init {
        val size = bytes.size
        val pointer = hbAlloc(size)
        nativeBlob = try {
            hbWriteBytes(pointer, bytes.toInt8Array())
            // HB_MEMORY_MODE_DUPLICATE = 0: HarfBuzz copies, so the scratch buffer is freed at once.
            requireHandle(hbBlobCreate(pointer, size), "blob")
        } finally {
            hbFree(pointer)
        }
    }

    public actual fun createFace(faceIndex: Int): HarfBuzzFace {
        requireOpen()
        addDescendant()
        val face = try {
            requireHandle(hbFaceCreate(nativeBlob, faceIndex), "face")
        } catch (error: Throwable) {
            releaseDescendant()
            throw error
        }
        return HarfBuzzFace(this, face)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz blob has been closed." }
    }

    internal fun addDescendant() {
        descendants += 1
    }

    internal fun releaseDescendant() {
        check(descendants > 0) { "The HarfBuzz blob has no live descendant to release." }
        descendants -= 1
        if (closed && descendants == 0) hbBlobDestroy(nativeBlob)
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        if (descendants == 0) hbBlobDestroy(nativeBlob)
    }
}

/** An owned WebAssembly face retaining the [HarfBuzzBlob] that backs it. */
public actual class HarfBuzzFace internal constructor(
    private val blob: HarfBuzzBlob,
    internal val nativeFace: Int,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun unitsPerEm(): Int {
        requireOpen()
        return hbFaceUpem(nativeFace)
    }

    public actual fun makeImmutable() {
        requireOpen()
        hbFaceMakeImmutable(nativeFace)
    }

    public actual fun createFont(): HarfBuzzFont {
        requireOpen()
        blob.addDescendant()
        val font = try {
            requireHandle(hbFontCreate(nativeFace), "font")
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
            hbFaceDestroy(nativeFace)
        } finally {
            blob.releaseDescendant()
        }
    }
}

/** An owned WebAssembly font retaining the [HarfBuzzBlob] that backs its face. */
public actual class HarfBuzzFont internal constructor(
    private val blob: HarfBuzzBlob,
    internal val nativeFont: Int,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun useOpenTypeFunctions() {
        requireOpen()
        hbOtFontSetFuncs(nativeFont)
    }

    public actual fun setScale(x: Int, y: Int) {
        requireOpen()
        hbFontSetScale(nativeFont, x, y)
    }

    public actual fun setVarCoordsNormalized(coords: IntArray) {
        requireOpen()
        if (coords.isEmpty()) {
            hbFontSetVarCoordsNormalized(nativeFont, 0, 0)
            return
        }
        val pointer = allocateWords(coords.size)
        try {
            coords.forEachIndexed { index, value -> hbWriteInt32(pointer, index, value) }
            hbFontSetVarCoordsNormalized(nativeFont, pointer, coords.size)
        } finally {
            hbFree(pointer)
        }
    }

    public actual fun setVariations(variations: List<HarfBuzzVariation>) {
        requireOpen()
        if (variations.isEmpty()) {
            hbFontSetVariations(nativeFont, 0, 0)
            return
        }
        val pointer = allocateWords(variations.size * 2)
        try {
            variations.forEachIndexed { index, variation ->
                hbWriteInt32(pointer, index * 2, variation.tag.rawValue())
                hbWriteFloat(pointer, index * 2 + 1, variation.value)
            }
            hbFontSetVariations(nativeFont, pointer, variations.size)
        } finally {
            hbFree(pointer)
        }
    }

    public actual fun makeImmutable() {
        requireOpen()
        hbFontMakeImmutable(nativeFont)
    }

    public actual fun glyphHorizontalAdvance(glyphId: Int): Int {
        requireOpen()
        return hbFontGlyphHAdvance(nativeFont, glyphId)
    }

    public actual fun glyphVerticalAdvance(glyphId: Int): Int {
        requireOpen()
        return hbFontGlyphVAdvance(nativeFont, glyphId)
    }

    public actual fun glyphExtents(glyphId: Int): HarfBuzzGlyphExtents {
        requireOpen()
        val pointer = allocateWords(EXTENTS_WORDS)
        try {
            if (hbFontGlyphExtents(nativeFont, glyphId, pointer) == 0) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.NATIVE_OPERATION,
                    "HarfBuzz reported no glyph extents for glyph $glyphId.",
                    cause = null,
                )
            }
            return HarfBuzzGlyphExtents(
                xBearing = hbReadInt32(pointer),
                yBearing = hbReadInt32(pointer + 4),
                width = hbReadInt32(pointer + 8),
                height = hbReadInt32(pointer + 12),
            )
        } finally {
            hbFree(pointer)
        }
    }

    public actual fun ligatureCarets(
        direction: HarfBuzzDirection,
        glyphId: Int,
        offset: Int,
        maxCount: Int,
    ): HarfBuzzLigatureCarets {
        requireOpen()
        val countPointer = allocateWords(1)
        val positionsPointer = allocateWords(maxCount)
        try {
            hbWriteInt32(countPointer, 0, maxCount)
            val totalCount = hbLigatureCarets(
                nativeFont,
                direction.toNativeDirection(),
                glyphId,
                offset,
                countPointer,
                positionsPointer,
            )
            val copiedCount = hbReadInt32(countPointer).coerceIn(0, maxCount)
            return HarfBuzzLigatureCarets(
                totalCount = totalCount,
                copiedCount = copiedCount,
                positions = IntArray(copiedCount) { index -> hbReadInt32(positionsPointer + index * 4) },
            )
        } finally {
            hbFree(positionsPointer)
            hbFree(countPointer)
        }
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz font has been closed." }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        try {
            hbFontDestroy(nativeFont)
        } finally {
            blob.releaseDescendant()
        }
    }
}

/** An owned WebAssembly shaping buffer. */
public actual class HarfBuzzBuffer internal constructor(
    private val buffer: Int,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun setDirection(direction: HarfBuzzDirection) {
        requireOpen()
        hbBufferSetDirection(buffer, direction.toNativeDirection())
    }

    public actual fun setScript(script: HarfBuzzScript) {
        requireOpen()
        val pointer = writeCString(script.value)
        try {
            hbBufferSetScript(buffer, hbScriptFromString(pointer))
        } finally {
            hbFree(pointer)
        }
    }

    public actual fun setLanguage(language: HarfBuzzLanguage) {
        requireOpen()
        val pointer = writeCString(language.value)
        try {
            val nativeLanguage = hbLanguageFromString(pointer)
            if (nativeLanguage == 0) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.NATIVE_OPERATION,
                    "HarfBuzz could not parse the language identifier: ${language.value}",
                    cause = null,
                )
            }
            hbBufferSetLanguage(buffer, nativeLanguage)
        } finally {
            hbFree(pointer)
        }
    }

    public actual fun setClusterLevel(level: HarfBuzzClusterLevel) {
        requireOpen()
        val nativeLevel = when (level) {
            HarfBuzzClusterLevel.MONOTONE_GRAPHEMES -> 0
            HarfBuzzClusterLevel.MONOTONE_CHARACTERS -> 1
            HarfBuzzClusterLevel.CHARACTERS -> 2
        }
        hbBufferSetClusterLevel(buffer, nativeLevel)
    }

    public actual fun setFlags(flags: HarfBuzzBufferFlags) {
        requireOpen()
        var nativeFlags = 0
        if (flags.beginningOfText) nativeFlags = nativeFlags or HB_BUFFER_FLAG_BOT
        if (flags.endOfText) nativeFlags = nativeFlags or HB_BUFFER_FLAG_EOT
        if (flags.produceUnsafeToConcat) nativeFlags = nativeFlags or HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT
        hbBufferSetFlags(buffer, nativeFlags)
    }

    public actual fun addUtf32(codePoints: IntArray, itemOffset: Int, itemLength: Int) {
        requireOpen()
        val pointer = allocateWords(codePoints.size)
        try {
            codePoints.forEachIndexed { index, value -> hbWriteInt32(pointer, index, value) }
            hbBufferAddUtf32(buffer, pointer, itemOffset, itemLength)
        } finally {
            hbFree(pointer)
        }
    }

    public actual fun shape(font: HarfBuzzFont, features: List<HarfBuzzFeature>): Boolean {
        requireOpen()
        val pointer = if (features.isEmpty()) 0 else allocateWords(features.size * FEATURE_WORDS)
        try {
            if (features.isNotEmpty()) {
                features.forEachIndexed { index, feature ->
                    val base = index * FEATURE_WORDS
                    hbWriteInt32(pointer, base, feature.tag.rawValue())
                    hbWriteInt32(pointer, base + 1, feature.value)
                    hbWriteInt32(pointer, base + 2, feature.start)
                    hbWriteInt32(pointer, base + 3, feature.end)
                }
            }
            return hbShapeFull(font.nativeFont, buffer, pointer, features.size) != 0
        } finally {
            if (pointer != 0) hbFree(pointer)
        }
    }

    public actual fun glyphCount(): Int {
        requireOpen()
        return hbBufferLength(buffer)
    }

    public actual fun glyphInfos(): List<HarfBuzzGlyphInfo> {
        requireOpen()
        val count = glyphCount()
        if (count == 0) return emptyList()
        return List(count) { index ->
            val flags = hbBufferGlyphFlags(buffer, index)
            HarfBuzzGlyphInfo(
                glyphId = hbBufferGlyphId(buffer, index),
                cluster = hbBufferGlyphCluster(buffer, index),
                flags = HarfBuzzGlyphFlags(
                    unsafeToBreak = flags and HB_GLYPH_FLAG_UNSAFE_TO_BREAK != 0,
                    unsafeToConcat = flags and HB_GLYPH_FLAG_UNSAFE_TO_CONCAT != 0,
                ),
            )
        }
    }

    public actual fun glyphPositions(): List<HarfBuzzGlyphPosition> {
        requireOpen()
        val count = glyphCount()
        if (count == 0) return emptyList()
        return List(count) { index ->
            HarfBuzzGlyphPosition(
                xAdvance = hbBufferGlyphXAdvance(buffer, index),
                yAdvance = hbBufferGlyphYAdvance(buffer, index),
                xOffset = hbBufferGlyphXOffset(buffer, index),
                yOffset = hbBufferGlyphYOffset(buffer, index),
            )
        }
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz buffer has been closed." }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        hbBufferDestroy(buffer)
    }
}

/**
 * Decodes the four ASCII characters HarfBuzz packs into an `hb_script_t` tag, exactly as the
 * JVM binding does: HarfBuzz stores the ISO 15924 tag big-endian.
 */
private fun canonicalScriptTag(script: Int): String = buildString(4) {
    append(((script ushr 24) and 0xff).toChar())
    append(((script ushr 16) and 0xff).toChar())
    append(((script ushr 8) and 0xff).toChar())
    append((script and 0xff).toChar())
}

/** `HB_SCRIPT_INVALID`, returned by HarfBuzz when a script tag cannot be parsed. */
private const val HB_SCRIPT_INVALID: Int = 0
private const val HB_DIRECTION_LTR: Int = 4
private const val HB_DIRECTION_RTL: Int = 5
private const val HB_DIRECTION_TTB: Int = 6
private const val HB_BUFFER_FLAG_BOT: Int = 0x00000001
private const val HB_BUFFER_FLAG_EOT: Int = 0x00000002
private const val HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT: Int = 0x00000040
private const val HB_GLYPH_FLAG_UNSAFE_TO_BREAK: Int = 0x00000001
private const val HB_GLYPH_FLAG_UNSAFE_TO_CONCAT: Int = 0x00000002
private const val FEATURE_WORDS: Int = 4
private const val EXTENTS_WORDS: Int = 4
