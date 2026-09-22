package org.graphiks.kffi.harfbuzz

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Independent frozen-oracle probe for the binding's shaping output.
 *
 * Every expected value below was produced once, outside this module, by the independent
 * `hb-shape` tool (HarfBuzz 14.4.0) and by the consumer's audited Amiri GDEF ligature-caret
 * fixture, against the checked-in audited fonts. They are literals, never a second live
 * binding, so this probe is an independent oracle rather than a self-comparison.
 */
class HarfBuzzConsumerProbe {
    private fun fontBytes(resource: String): ByteArray =
        javaClass.getResourceAsStream(resource)!!.use { it.readBytes() }

    private class Prepared(
        val blob: HarfBuzzBlob,
        val face: HarfBuzzFace,
        val font: HarfBuzzFont,
    ) : AutoCloseable {
        override fun close() {
            font.close()
            face.close()
            blob.close()
        }
    }

    private fun HarfBuzz.prepare(
        resource: String,
        scale: Int,
        configure: (HarfBuzzFont) -> Unit = {},
    ): Prepared {
        val blob = createBlob(fontBytes(resource))
        try {
            val face = blob.createFace(0)
            val font = face.createFont()
            font.useOpenTypeFunctions()
            font.setScale(scale, scale)
            // Variation setters are no-ops on an immutable font, so they run before makeImmutable.
            configure(font)
            face.makeImmutable()
            font.makeImmutable()
            return Prepared(blob, face, font)
        } catch (error: Throwable) {
            blob.close()
            throw error
        }
    }

    private fun HarfBuzz.shape(font: HarfBuzzFont, text: String): HarfBuzzBuffer {
        val buffer = createBuffer()
        try {
            buffer.setDirection(HarfBuzzDirection.LEFT_TO_RIGHT)
            buffer.setScript(parseScript("Latn"))
            buffer.setLanguage(parseLanguage("en"))
            buffer.setClusterLevel(HarfBuzzClusterLevel.MONOTONE_CHARACTERS)
            val codePoints = text.codePoints().toArray()
            buffer.addUtf32(codePoints, 0, codePoints.size)
            assertTrue(buffer.shape(font, emptyList()))
            return buffer
        } catch (error: Throwable) {
            buffer.close()
            throw error
        }
    }

    @Test
    fun dejaVuFiLigatureMatchesTheFrozenOracle() {
        val hb = HarfBuzz.open()
        hb.prepare("/fonts/dejavu/DejaVuSans.ttf", 2048).use { prepared ->
            hb.shape(prepared.font, "fi").use { buffer ->
                assertEquals(listOf(5042), buffer.glyphInfos().map { it.glyphId })
                assertEquals(listOf(0), buffer.glyphInfos().map { it.cluster })
                assertEquals(listOf(1290), buffer.glyphPositions().map { it.xAdvance })
            }
        }
    }

    @Test
    fun dejaVuAvatarMatchesTheFrozenOracle() {
        val hb = HarfBuzz.open()
        hb.prepare("/fonts/dejavu/DejaVuSans.ttf", 2048).use { prepared ->
            hb.shape(prepared.font, "AVATAR").use { buffer ->
                assertEquals(listOf(36, 57, 36, 55, 36, 53), buffer.glyphInfos().map { it.glyphId })
                assertEquals(listOf(1270, 1270, 1242, 1092, 1401, 1423), buffer.glyphPositions().map { it.xAdvance })
            }
        }
    }

    @Test
    fun amiriLigatureAndCaretsMatchTheFrozenOracle() {
        val hb = HarfBuzz.open()
        hb.prepare("/fonts/amiri/Amiri-Regular.ttf", 1000).use { prepared ->
            hb.shape(prepared.font, "ffi").use { buffer ->
                assertEquals(listOf(6631), buffer.glyphInfos().map { it.glyphId })
                assertEquals(listOf(795), buffer.glyphPositions().map { it.xAdvance })
            }
            assertEquals(795, prepared.font.glyphHorizontalAdvance(6631))
            val carets = prepared.font.ligatureCarets(HarfBuzzDirection.LEFT_TO_RIGHT, 6631, 0, 2)
            assertEquals(2, carets.totalCount)
            assertEquals(2, carets.copiedCount)
            assertEquals(listOf(269, 537), carets.positions.toList())
        }
    }

    @Test
    fun disablingLigaturesThroughFeaturesChangesTheOutput() {
        val hb = HarfBuzz.open()
        hb.prepare("/fonts/dejavu/DejaVuSans.ttf", 2048).use { prepared ->
            val buffer = hb.createBuffer()
            try {
                buffer.setDirection(HarfBuzzDirection.LEFT_TO_RIGHT)
                buffer.setScript(hb.parseScript("Latn"))
                buffer.setLanguage(hb.parseLanguage("en"))
                buffer.setClusterLevel(HarfBuzzClusterLevel.MONOTONE_CHARACTERS)
                val codePoints = "fi".codePoints().toArray()
                buffer.addUtf32(codePoints, 0, codePoints.size)
                assertTrue(buffer.shape(prepared.font, listOf(HarfBuzzFeature(HarfBuzzTag.of("liga"), 0))))
                assertEquals(listOf(73, 76), buffer.glyphInfos().map { it.glyphId })
                assertEquals(listOf(0, 1), buffer.glyphInfos().map { it.cluster })
                assertEquals(listOf(721, 569), buffer.glyphPositions().map { it.xAdvance })
            } finally {
                buffer.close()
            }
        }
    }

    @Test
    fun variableFontVariationsMatchTheFrozenOracle() {
        val hb = HarfBuzz.open()
        val resource = "/fonts/kffi-var/KffiVar.ttf"
        hb.prepare(resource, 1000).use { prepared ->
            assertEquals(600, prepared.font.glyphHorizontalAdvance(2))
            assertEquals(-1300, prepared.font.glyphVerticalAdvance(2))
        }
        hb.prepare(resource, 1000) { font ->
            font.setVariations(listOf(HarfBuzzVariation(HarfBuzzTag.of("wght"), 100f)))
        }.use { prepared ->
            assertEquals(500, prepared.font.glyphHorizontalAdvance(2))
            // The vertical axis does not vary, so the VVAR deltas are zero.
            assertEquals(-1300, prepared.font.glyphVerticalAdvance(2))
        }
        hb.prepare(resource, 1000) { font ->
            font.setVariations(listOf(HarfBuzzVariation(HarfBuzzTag.of("wght"), 900f)))
        }.use { prepared ->
            assertEquals(800, prepared.font.glyphHorizontalAdvance(2))
        }
    }

    @Test
    fun variableFontNormalizedCoordsMatchTheFrozenOracle() {
        val hb = HarfBuzz.open()
        val resource = "/fonts/kffi-var/KffiVar.ttf"
        // wght 100 normalizes to -1.0 (-16384 in HarfBuzz's 2.14 fixed point); 900 normalizes to +16384.
        hb.prepare(resource, 1000) { font ->
            font.setVarCoordsNormalized(intArrayOf(-16384))
        }.use { prepared ->
            assertEquals(500, prepared.font.glyphHorizontalAdvance(2))
        }
        hb.prepare(resource, 1000) { font ->
            font.setVarCoordsNormalized(intArrayOf(16384))
        }.use { prepared ->
            assertEquals(800, prepared.font.glyphHorizontalAdvance(2))
        }
    }
}
