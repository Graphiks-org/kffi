package org.graphiks.kffi.harfbuzz

/**
 * A four-byte OpenType tag, encoded big-endian as HarfBuzz expects.
 *
 * The value is stored as an unsigned 32-bit quantity in an [Int]; comparisons and
 * marshalling use the raw bits, never signed ordering.
 */
public class HarfBuzzTag private constructor(
    /** The four ASCII bytes of the tag, in order. */
    public val value: String,
) {
    init {
        require(value.length == 4) { "An OpenType tag is exactly four characters." }
        require(value.all { it.code in 0..0x7f }) { "An OpenType tag is ASCII." }
    }

    /** The raw big-endian 32-bit encoding HarfBuzz expects. */
    public fun rawValue(): Int =
        (value[0].code shl 24) or (value[1].code shl 16) or (value[2].code shl 8) or value[3].code

    override fun equals(other: Any?): Boolean = other is HarfBuzzTag && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = value

    public companion object {
        /** Creates a tag from its four ASCII characters. */
        public fun of(value: String): HarfBuzzTag = HarfBuzzTag(value)
    }
}

/** The layout direction supplied to a HarfBuzz buffer. */
public enum class HarfBuzzDirection {
    /** Left-to-right. */
    LEFT_TO_RIGHT,
    /** Right-to-left. */
    RIGHT_TO_LEFT,
    /** Top-to-bottom (vertical). */
    TOP_TO_BOTTOM,
}

/** Cluster-merging level supplied to a HarfBuzz buffer. */
public enum class HarfBuzzClusterLevel {
    /** Monotone graphemes: cluster values increase with grapheme boundaries. */
    MONOTONE_GRAPHEMES,
    /** Monotone characters: cluster values increase per character. */
    MONOTONE_CHARACTERS,
    /** Characters: no monotonicity guarantee. */
    CHARACTERS,
}

/**
 * A parsed HarfBuzz OpenType script, in its ISO 15924 string form.
 *
 * Use the binding to parse a script identifier; parsing delegates to HarfBuzz.
 */
public class HarfBuzzScript internal constructor(
    /** The ISO 15924 script identifier. */
    public val value: String,
) {
    override fun equals(other: Any?): Boolean = other is HarfBuzzScript && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = value
}

/**
 * A parsed HarfBuzz language, in its BCP 47 string form.
 *
 * Use the binding to parse a language identifier; parsing delegates to HarfBuzz.
 */
public class HarfBuzzLanguage internal constructor(
    /** The BCP 47 language identifier. */
    public val value: String,
) {
    override fun equals(other: Any?): Boolean = other is HarfBuzzLanguage && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = value
}

/**
 * A set of HarfBuzz buffer flags.
 *
 * @property beginningOfText whether the buffer text starts at the beginning of a text run.
 * @property endOfText whether the buffer text ends at the end of a text run.
 * @property produceUnsafeToConcat whether HarfBuzz computes unsafe-to-concatenate flags.
 */
public data class HarfBuzzBufferFlags(
    val beginningOfText: Boolean = false,
    val endOfText: Boolean = false,
    val produceUnsafeToConcat: Boolean = false,
)

/**
 * One explicit OpenType feature request.
 *
 * @property tag the four-byte feature tag.
 * @property value the feature value; zero disables, positive values select alternates.
 * @property start the first character index the feature applies to.
 * @property end the character index after the last the feature applies to; `-1` means end of text.
 */
public data class HarfBuzzFeature(
    val tag: HarfBuzzTag,
    val value: Int,
    val start: Int = 0,
    val end: Int = -1,
)

/**
 * A glyph flag pair computed by HarfBuzz for one glyph.
 *
 * @property unsafeToBreak the glyph must not be separated from its cluster by a line break.
 * @property unsafeToConcat the glyph must not be concatenated with a following run without re-shaping.
 */
public data class HarfBuzzGlyphFlags(
    val unsafeToBreak: Boolean,
    val unsafeToConcat: Boolean,
)

/**
 * One shaped glyph record.
 *
 * @property glyphId the output glyph identifier.
 * @property cluster the input cluster value the glyph belongs to.
 * @property flags the computed safety flags.
 */
public data class HarfBuzzGlyphInfo(
    val glyphId: Int,
    val cluster: Int,
    val flags: HarfBuzzGlyphFlags,
)

/**
 * One shaped glyph position, in the scale units supplied to the font.
 *
 * @property xAdvance the horizontal advance.
 * @property yAdvance the vertical advance.
 * @property xOffset the horizontal offset from the origin.
 * @property yOffset the vertical offset from the origin.
 */
public data class HarfBuzzGlyphPosition(
    val xAdvance: Int,
    val yAdvance: Int,
    val xOffset: Int,
    val yOffset: Int,
)

/**
 * The raw result of a GDEF ligature-caret query.
 *
 * [totalCount] is the native return value and [copiedCount] is the in/out count after the
 * call. They are deliberately retained separately so the consumer can reject a truncated or
 * otherwise inconsistent native response.
 *
 * @property totalCount the number of carets available.
 * @property copiedCount the number of caret positions the call reported writing.
 * @property positions the copied caret positions, in native order.
 */
public data class HarfBuzzLigatureCarets(
    val totalCount: Int,
    val copiedCount: Int,
    val positions: IntArray,
) {
    override fun equals(other: Any?): Boolean =
        other is HarfBuzzLigatureCarets &&
            other.totalCount == totalCount &&
            other.copiedCount == copiedCount &&
            other.positions.contentEquals(positions)

    override fun hashCode(): Int {
        var result = totalCount
        result = 31 * result + copiedCount
        result = 31 * result + positions.contentHashCode()
        return result
    }
}
