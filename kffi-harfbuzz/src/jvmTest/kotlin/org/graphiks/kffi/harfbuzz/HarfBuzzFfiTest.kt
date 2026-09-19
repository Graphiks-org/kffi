package org.graphiks.kffi.harfbuzz

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class HarfBuzzFfiTest {
    private fun fontBytes(): ByteArray =
        javaClass.getResourceAsStream("/fonts/dejavu/DejaVuSans.ttf")!!.use { it.readBytes() }

    @Test
    fun versionAndIdentityMatchThePinnedLibrary() {
        val hb = HarfBuzz.open()
        assertEquals("14.3.0", hb.version())
        assertEquals("14.3.0", hb.bindingIdentity.engineVersion)
        assertTrue(hb.bindingIdentity.artifactId.startsWith("org.graphiks:kffi-harfbuzz-jvm:"))
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
        // Closing the blob first must defer arena release until every descendant is gone.
        blob.close()
        fontA.close()
        faceA.close()
        fontB.close()
        faceB.close()
        // A second close is safe.
        blob.close()
    }
}
