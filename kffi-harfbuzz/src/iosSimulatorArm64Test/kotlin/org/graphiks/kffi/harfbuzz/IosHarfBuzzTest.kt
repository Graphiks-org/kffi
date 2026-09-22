package org.graphiks.kffi.harfbuzz

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * The minimal iOS ABI proof for the statically linked HarfBuzz binding.
 *
 * Unlike the JVM and Android bindings there is no dynamic library to load: the
 * pinned `libharfbuzz.a` is linked at compile time through the `harfbuzz`
 * cinterop. This test therefore proves the archive that was actually linked —
 * its reported version and the build-time generated identity of the archive —
 * and then shapes Latin text through the real `hb_shape_full` path, including
 * two full prepare/release cycles so the descendant/close gate and the
 * `hb_blob_create_or_fail` marshalling are exercised together.
 *
 * The font arrives as a build-time generated Base64 literal
 * (`IosHarfBuzzFontFixture.kt`) because Kotlin/Native has no classpath-resource
 * mechanism; the generation task reads the same audited DejaVu Sans TTF the JVM
 * and Android tests use.
 */
class IosHarfBuzzTest {
    /** Shapes [text] through the real API and runs [block] before the owners are closed. */
    private fun withShapedFont(text: String, block: (buffer: HarfBuzzBuffer, font: HarfBuzzFont, shaped: Boolean) -> Unit) {
        val harfbuzz = HarfBuzz.open()
        val blob = harfbuzz.createBlob(dejaVuSansTtf)
        val face = blob.createFace(0)
        val font = face.createFont().apply {
            useOpenTypeFunctions()
            val upem = face.unitsPerEm()
            setScale(upem, upem)
            makeImmutable()
        }
        val buffer = harfbuzz.createBuffer()
        try {
            buffer.setDirection(HarfBuzzDirection.LEFT_TO_RIGHT)
            buffer.setScript(harfbuzz.parseScript("Latn"))
            buffer.setLanguage(harfbuzz.parseLanguage("en"))
            buffer.setClusterLevel(HarfBuzzClusterLevel.MONOTONE_CHARACTERS)
            val codePoints = text.toCodePoints()
            buffer.addUtf32(codePoints, 0, codePoints.size)
            block(buffer, font, buffer.shape(font, emptyList()))
        } finally {
            buffer.close()
            font.close()
            face.close()
            blob.close()
        }
    }

    @Test
    fun loadsThePinnedLibrary() {
        assertEquals("14.3.0", HarfBuzz.open().version())
    }

    @Test
    fun identityDescribesTheIosArtifact() {
        val identity = HarfBuzz.open().bindingIdentity
        assertEquals("ios", identity.operatingSystem)
        assertEquals("arm64", identity.architecture)
        assertEquals("14.3.0", identity.engineVersion)
        assertEquals("4c2aa804671d7276e8a0eb95da07202ead05c843", identity.upstreamSourceRevision)
        // What this guards: (1) the identity wiring — the build-time generated `actual`
        // constants actually reach the published `HarfBuzzBindingIdentity`; (2) the 64-hex
        // shape, so a malformed or empty generated digest cannot pass; (3) the slice selector
        // — the generated SDK name (`iphonesimulator`) is carried through the artifact id and
        // the build-chain string.
        //
        // It does NOT prove the built archive matches the NOTICE'd reference:
        // `iosHarfBuzzArtifactSha256` is the very constant this equality compares against, so
        // on its own the assertion is tautological. Drift between the archive actually linked
        // and the reference digest in `kffi-harfbuzz-ios-native/NOTICE.md` is a publish-time
        // check (the seal + digest tasks), not one this test can make — the digest is
        // toolchain- and build-path-dependent, so a pinned literal here would only pass on the
        // machine that produced it.
        assertTrue(identity.artifactSha256.matches(Regex("[0-9a-f]{64}")))
        assertEquals(iosHarfBuzzArtifactSha256, identity.artifactSha256)
        assertTrue(identity.artifactId.startsWith("org.graphiks:kffi-harfbuzz-iossimulatorarm64:"))
        assertTrue(identity.artifactId.endsWith("/libharfbuzz.a"))
        assertTrue(identity.buildChainIdentity.contains("iphonesimulator-sdk-"))
        assertTrue(identity.buildChainIdentity.contains("deployment-target-15.0"))
    }

    @Test
    fun shapesOneLatinGlyph() {
        withShapedFont("A") { buffer, _, shaped ->
            assertTrue(shaped)
            assertEquals(1, buffer.glyphCount())
            val infos = buffer.glyphInfos()
            assertEquals(1, infos.size)
            assertEquals(36, infos.first().glyphId)
            val positions = buffer.glyphPositions()
            assertEquals(1, positions.size)
            // DejaVu Sans: glyph 36 ('A'), 1401 font units at UPEM 2048. The literal is the
            // frozen "AVATAR" oracle from the JVM `HarfBuzzConsumerProbe`, which was produced
            // by the external `hb-shape` tool at HarfBuzz 14.4.0; this iOS slice links the
            // pinned 14.3.0 archive instead. The values agree across the two revisions here,
            // but they are not the same revision, so this is a value-conformance check rather
            // than a same-revision equivalence proof.
            assertEquals(1401, positions.first().xAdvance)
        }
    }

    @Test
    fun survivesRepeatedPrepareAndReleaseCycles() {
        repeat(2) {
            withShapedFont("A") { buffer, _, shaped ->
                assertTrue(shaped)
                assertTrue(buffer.glyphCount() >= 1)
                assertTrue(buffer.glyphPositions().any { it.xAdvance > 0 })
            }
        }
    }

    @Test
    fun variationSettersAreSafeOnTheNonVariableFixture() {
        val harfbuzz = HarfBuzz.open()
        val blob = harfbuzz.createBlob(dejaVuSansTtf)
        val face = blob.createFace(0)
        val font = face.createFont()
        try {
            font.useOpenTypeFunctions()
            val upem = face.unitsPerEm()
            font.setScale(upem, upem)
            // DejaVuSans has no fvar/gvar, so these are accepted no-ops; empty input must be safe.
            font.setVarCoordsNormalized(intArrayOf(-16384, 0))
            font.setVariations(listOf(HarfBuzzVariation(HarfBuzzTag.of("wght"), 700f)))
            font.setVarCoordsNormalized(IntArray(0))
            font.setVariations(emptyList())
            face.makeImmutable()
            font.makeImmutable()
            assertTrue(font.glyphHorizontalAdvance(36) > 0)
            font.glyphVerticalAdvance(36)
        } finally {
            font.close()
            face.close()
            blob.close()
        }
    }

    @Test
    fun variationsMatchTheFrozenOracleOnTheVariableFixture() {
        val harfbuzz = HarfBuzz.open()
        // wght=100 and 900 normalize to -16384 and +16384 in HarfBuzz's 2.14 fixed point.
        assertEquals(500, variedHorizontalAdvance(harfbuzz) { font ->
            font.setVarCoordsNormalized(intArrayOf(-16384))
        })
        assertEquals(800, variedHorizontalAdvance(harfbuzz) { font ->
            font.setVarCoordsNormalized(intArrayOf(16384))
        })
        // The user-space axis setters reach the same frozen metrics.
        assertEquals(500, variedHorizontalAdvance(harfbuzz) { font ->
            font.setVariations(listOf(HarfBuzzVariation(HarfBuzzTag.of("wght"), 100f)))
        })
        assertEquals(800, variedHorizontalAdvance(harfbuzz) { font ->
            font.setVariations(listOf(HarfBuzzVariation(HarfBuzzTag.of("wght"), 900f)))
        })
    }

    @Test
    fun extentsMatchTheFrozenOracleOnTheVariableFixture() {
        val harfbuzz = HarfBuzz.open()
        // KffiVar's `A` (glyph 2) is a triangle whose base tracks the advance, so the ink box moves
        // with `wght` even though only the advance is in HVAR: width 400 / 300 / 600.
        assertEquals(HarfBuzzGlyphExtents(100, 700, 400, -700), variedExtents(harfbuzz) {})
        assertEquals(HarfBuzzGlyphExtents(100, 700, 300, -700), variedExtents(harfbuzz) { font ->
            font.setVarCoordsNormalized(intArrayOf(-16384))
        })
        assertEquals(HarfBuzzGlyphExtents(100, 700, 600, -700), variedExtents(harfbuzz) { font ->
            font.setVarCoordsNormalized(intArrayOf(16384))
        })
        // The user-space axis setter reaches the same varied ink box.
        assertEquals(HarfBuzzGlyphExtents(100, 700, 600, -700), variedExtents(harfbuzz) { font ->
            font.setVariations(listOf(HarfBuzzVariation(HarfBuzzTag.of("wght"), 900f)))
        })
    }

    /**
     * Applies [configure] to a fresh KffiVar font and returns the frozen ink extents of `A` (glyph
     * `2`). Mirrors the Android and JVM frozen oracles.
     */
    private fun variedExtents(harfbuzz: HarfBuzz, configure: (HarfBuzzFont) -> Unit): HarfBuzzGlyphExtents {
        val blob = harfbuzz.createBlob(kffiVarTtf)
        try {
            val face = blob.createFace(0)
            val font = face.createFont()
            try {
                font.useOpenTypeFunctions()
                val upem = face.unitsPerEm()
                font.setScale(upem, upem)
                configure(font)
                face.makeImmutable()
                font.makeImmutable()
                return font.glyphExtents(2)
            } finally {
                font.close()
                face.close()
            }
        } finally {
            blob.close()
        }
    }

    /**
     * Applies [configure] to a fresh KffiVar font, checks the frozen vertical advance, and returns
     * the horizontal advance of `A` (glyph `2`). Mirrors the Android and JVM frozen oracles.
     */
    private fun variedHorizontalAdvance(harfbuzz: HarfBuzz, configure: (HarfBuzzFont) -> Unit): Int {
        val blob = harfbuzz.createBlob(kffiVarTtf)
        try {
            val face = blob.createFace(0)
            val font = face.createFont()
            try {
                font.useOpenTypeFunctions()
                val upem = face.unitsPerEm()
                font.setScale(upem, upem)
                configure(font)
                face.makeImmutable()
                font.makeImmutable()
                // The vertical axis does not vary, so every coordinate reports the same -1300.
                assertEquals(-1300, font.glyphVerticalAdvance(2))
                return font.glyphHorizontalAdvance(2)
            } finally {
                font.close()
                face.close()
            }
        } finally {
            blob.close()
        }
    }
}

/** Decodes [this] into Unicode code points, pairing UTF-16 surrogates where present. */
private fun String.toCodePoints(): IntArray = buildList(length) {
    var index = 0
    while (index < this@toCodePoints.length) {
        val char = this@toCodePoints[index]
        if (char.isHighSurrogate() && index + 1 < this@toCodePoints.length) {
            val low = this@toCodePoints[index + 1]
            if (low.isLowSurrogate()) {
                add(0x10000 + ((char.code - 0xD800) shl 10) + (low.code - 0xDC00))
                index += 2
                continue
            }
        }
        add(char.code)
        index += 1
    }
}.toIntArray()
