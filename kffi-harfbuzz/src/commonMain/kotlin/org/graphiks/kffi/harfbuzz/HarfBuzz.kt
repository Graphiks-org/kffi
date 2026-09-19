package org.graphiks.kffi.harfbuzz

/**
 * The entry point of the bundled HarfBuzz library for the current platform.
 *
 * Construction loads and verifies the embedded native library; it may throw
 * [HarfBuzzBindingException]. The instance owns the loaded library process-wide and is safe
 * to share across threads once created.
 */
public expect class HarfBuzz private constructor() {
    /** The HarfBuzz version the loaded library reports. */
    public fun version(): String

    /** The published identity of the loaded binding. */
    public val bindingIdentity: HarfBuzzBindingIdentity

    /**
     * Copies [bytes] into an owned blob. The blob retains the copied bytes until it is closed.
     * Throws [HarfBuzzBindingException] if the native blob cannot be created.
     */
    public fun createBlob(bytes: ByteArray): HarfBuzzBlob

    /** Creates an owned shaping buffer. Throws [HarfBuzzBindingException] if the native buffer cannot be created. */
    public fun createBuffer(): HarfBuzzBuffer

    /** Parses a script identifier through HarfBuzz. */
    public fun parseScript(value: String): HarfBuzzScript

    /** Parses a language identifier through HarfBuzz. */
    public fun parseLanguage(value: String): HarfBuzzLanguage

    public companion object {
        /** Opens the bundled library; throws [HarfBuzzBindingException] on any load failure. */
        public fun open(): HarfBuzz
    }
}

/**
 * An owned HarfBuzz blob retaining a copy of the source bytes.
 *
 * A blob may create several faces and each face may create several fonts; every child must be
 * closed before its parent so the retained bytes can be freed. [close] is idempotent, but it is
 * not synchronised across threads — do not close a blob concurrently with creating or closing
 * its descendants.
 */
public expect class HarfBuzzBlob : AutoCloseable {
    /** Creates an owned face over [faceIndex]; throws [HarfBuzzBindingException] on failure. */
    public fun createFace(faceIndex: Int): HarfBuzzFace

    /** Releases the blob; safe to call more than once. */
    override fun close()
}

/**
 * An owned HarfBuzz face, retaining the blob it was created from.
 *
 * A face may create several fonts, all of which must be closed before the face. [close] is
 * idempotent, but it is not synchronised across threads.
 */
public expect class HarfBuzzFace : AutoCloseable {
    /** The face units-per-em. */
    public fun unitsPerEm(): Int

    /** Makes the face immutable, as required before fonts are used. */
    public fun makeImmutable()

    /** Creates an owned font over this face; throws [HarfBuzzBindingException] on failure. */
    public fun createFont(): HarfBuzzFont

    /** Releases the face; safe to call more than once. */
    override fun close()
}

/**
 * An owned HarfBuzz font, retaining the face it was created from.
 *
 * [close] is idempotent, but it is not synchronised across threads.
 */
public expect class HarfBuzzFont : AutoCloseable {
    /** Selects the OpenType font functions. */
    public fun useOpenTypeFunctions()

    /** Sets the font scale in font units. */
    public fun setScale(x: Int, y: Int)

    /** Makes the font immutable, as required before shaping. */
    public fun makeImmutable()

    /** Returns the horizontal advance of [glyphId] in the current scale. */
    public fun glyphHorizontalAdvance(glyphId: Int): Int

    /**
     * Queries up to [maxCount] GDEF ligature caret positions for [glyphId].
     * Throws [HarfBuzzBindingException] if the native query fails.
     */
    public fun ligatureCarets(
        direction: HarfBuzzDirection,
        glyphId: Int,
        offset: Int,
        maxCount: Int,
    ): HarfBuzzLigatureCarets

    /** Releases the font; safe to call more than once. */
    override fun close()
}

/** An owned HarfBuzz shaping buffer. */
public expect class HarfBuzzBuffer : AutoCloseable {
    /** Sets the buffer direction. */
    public fun setDirection(direction: HarfBuzzDirection)

    /** Sets the buffer script. */
    public fun setScript(script: HarfBuzzScript)

    /** Sets the buffer language. */
    public fun setLanguage(language: HarfBuzzLanguage)

    /** Sets the cluster level. */
    public fun setClusterLevel(level: HarfBuzzClusterLevel)

    /** Sets the buffer flags. */
    public fun setFlags(flags: HarfBuzzBufferFlags)

    /**
     * Adds UTF-32 code points to the buffer.
     *
     * @param codePoints the scalar values to add.
     * @param itemOffset the index of the first item scalar within [codePoints].
     * @param itemLength the number of item scalars; leading scalars before [itemOffset] are pre-context.
     */
    public fun addUtf32(codePoints: IntArray, itemOffset: Int, itemLength: Int)

    /**
     * Shapes the buffer in place with [font] and [features].
     * Returns `true` when HarfBuzz accepted the explicit OpenType shaper configuration.
     */
    public fun shape(font: HarfBuzzFont, features: List<HarfBuzzFeature>): Boolean

    /** The number of shaped glyphs in the buffer. */
    public fun glyphCount(): Int

    /** The shaped glyph records, in output order. */
    public fun glyphInfos(): List<HarfBuzzGlyphInfo>

    /** The shaped glyph positions, in output order. */
    public fun glyphPositions(): List<HarfBuzzGlyphPosition>

    /** Releases the buffer; safe to call more than once. */
    override fun close()
}
