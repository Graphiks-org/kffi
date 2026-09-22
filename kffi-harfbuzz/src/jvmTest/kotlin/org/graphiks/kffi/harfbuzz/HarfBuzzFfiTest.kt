package org.graphiks.kffi.harfbuzz

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class HarfBuzzFfiTest {
    private fun fontBytes(): ByteArray =
        javaClass.getResourceAsStream("/fonts/dejavu/DejaVuSans.ttf")!!.use { it.readBytes() }

    @Test
    fun versionAndIdentityMatchThePinnedLibrary() {
        val hb = HarfBuzz.open()
        assertEquals("14.3.0", hb.version())
        assertEquals("14.3.0", hb.bindingIdentity.engineVersion)
        assertTrue(hb.bindingIdentity.artifactSha256.matches(Regex("[0-9a-f]{64}")))
        assertTrue(hb.bindingIdentity.artifactId.contains(hb.bindingIdentity.operatingSystem))
        assertTrue(hb.bindingIdentity.artifactId.contains(hb.bindingIdentity.architecture))
    }

    @Test
    fun doubleCloseIsSafe() {
        val hb = HarfBuzz.open()
        val blob = hb.createBlob(fontBytes())
        val face = blob.createFace(0)
        val font = face.createFont()
        font.close()
        font.close()
        face.close()
        face.close()
        blob.close()
        blob.close()
    }

    @Test
    fun shapingSimpleLatinProducesGlyphs() {
        val hb = HarfBuzz.open()
        val blob = hb.createBlob(fontBytes())
        val face = blob.createFace(0)
        val font = face.createFont().apply {
            useOpenTypeFunctions()
            val upem = face.unitsPerEm()
            setScale(upem, upem)
            makeImmutable()
        }
        val buffer = hb.createBuffer()
        buffer.setDirection(HarfBuzzDirection.LEFT_TO_RIGHT)
        buffer.setScript(hb.parseScript("Latn"))
        buffer.setLanguage(hb.parseLanguage("en"))
        buffer.setClusterLevel(HarfBuzzClusterLevel.MONOTONE_CHARACTERS)
        val text = "AV".codePoints().toArray()
        buffer.addUtf32(text, 0, text.size)
        assertTrue(buffer.shape(font, emptyList()))
        assertEquals(2, buffer.glyphCount())
        assertTrue(buffer.glyphInfos().all { it.glyphId != 0 })
        buffer.close()
        font.close()
        face.close()
        blob.close()
    }

    @Test
    fun multipleChildrenShareTheBlobSafely() {
        val hb = HarfBuzz.open()
        val blob = hb.createBlob(fontBytes())
        val faceA = blob.createFace(0)
        val faceB = blob.createFace(0)
        val fontA = faceA.createFont()
        val fontB = faceB.createFont()
        val upem = faceA.unitsPerEm()
        fontA.useOpenTypeFunctions()
        fontA.setScale(upem, upem)
        fontA.makeImmutable()
        fontB.useOpenTypeFunctions()
        fontB.setScale(faceB.unitsPerEm(), faceB.unitsPerEm())
        fontB.makeImmutable()
        // Closing the blob first must defer arena release until every descendant is gone.
        blob.close()
        // Reading blob-backed font tables after the parent close proves the arena is still alive.
        assertEquals(upem, faceA.unitsPerEm())
        val buffer = hb.createBuffer()
        buffer.setDirection(HarfBuzzDirection.LEFT_TO_RIGHT)
        buffer.setScript(hb.parseScript("Latn"))
        buffer.setLanguage(hb.parseLanguage("en"))
        buffer.setClusterLevel(HarfBuzzClusterLevel.MONOTONE_CHARACTERS)
        val text = "AV".codePoints().toArray()
        buffer.addUtf32(text, 0, text.size)
        assertTrue(buffer.shape(fontA, emptyList()))
        assertEquals(2, buffer.glyphCount())
        buffer.close()
        fontA.close()
        faceA.close()
        fontB.close()
        faceB.close()
        // A second close is safe.
        blob.close()
    }

    @Test
    fun closedOwnersRejectNewChildren() {
        val hb = HarfBuzz.open()
        val blob = hb.createBlob(fontBytes())
        val face = blob.createFace(0)
        face.close()
        assertFailsWith<IllegalStateException> { face.createFont() }
        blob.close()
        assertFailsWith<IllegalStateException> { blob.createFace(0) }
    }

    @Test
    fun invalidScriptIsRejectedAsANativeOperation() {
        val hb = HarfBuzz.open()
        val failure = assertFailsWith<HarfBuzzBindingException> { hb.parseScript("") }
        assertEquals(HarfBuzzBindingFailure.NATIVE_OPERATION, failure.failure)
    }

    @Test
    fun variationSettersAreNoOpsOnTheNonVariableFixture() {
        val hb = HarfBuzz.open()
        val baseline = advances(hb) {}
        val configured = advances(hb) { font ->
            font.setVarCoordsNormalized(intArrayOf(-16384, 0))
            font.setVariations(listOf(HarfBuzzVariation(HarfBuzzTag.of("wght"), 700f)))
        }
        // DejaVuSans has no fvar/gvar, so the setters leave every advance unchanged. This proves
        // the calls are accepted and safe, not that they vary anything.
        assertEquals(baseline, configured)
    }

    @Test
    fun emptyVariationInputIsSafeAndEquivalentToNoSetters() {
        val hb = HarfBuzz.open()
        val baseline = advances(hb) {}
        val empty = advances(hb) { font ->
            font.setVarCoordsNormalized(IntArray(0))
            font.setVariations(emptyList())
        }
        // Empty input passes a NULL pointer with length zero and must not crash or change metrics.
        assertEquals(baseline, empty)
    }

    private fun advances(hb: HarfBuzz, configure: (HarfBuzzFont) -> Unit): List<Int> {
        val blob = hb.createBlob(fontBytes())
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
                return (0..40).map { font.glyphHorizontalAdvance(it) } +
                    (0..40).map { font.glyphVerticalAdvance(it) }
            } finally {
                font.close()
                face.close()
            }
        } finally {
            blob.close()
        }
    }
}
