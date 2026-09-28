package org.graphiks.kffi.harfbuzz

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * The frozen-oracle probe of the binding's shaping output, on every web target.
 *
 * Every expected value is the same literal the JVM probe asserts, produced once outside
 * this module by the independent `hb-shape` tool and the consumer's audited Amiri GDEF
 * ligature-caret fixture: the web binding must reproduce the JVM binding exactly.
 *
 * Initialization is asynchronous on web, so each test awaits `initializeHarfBuzz` first.
 */
class HarfBuzzWebConsumerProbe {
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
        bytes: ByteArray,
        scale: Int,
        configure: (HarfBuzzFont) -> Unit = {},
    ): Prepared {
        val blob = createBlob(bytes)
        try {
            val face = blob.createFace(0)
            val font = face.createFont()
            font.useOpenTypeFunctions()
            font.setScale(scale, scale)
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
            val codePoints = text.map { it.code }.toIntArray()
            buffer.addUtf32(codePoints, 0, codePoints.size)
            assertTrue(buffer.shape(font, emptyList()))
            return buffer
        } catch (error: Throwable) {
            buffer.close()
            throw error
        }
    }

    @Test
    fun dejaVuFiLigatureMatchesTheFrozenOracle() = runTest {
        awaitHarfBuzzInitialization()
        val hb = HarfBuzz.open()
        hb.prepare(WebTestFonts.dejaVuSans, 2048).use { prepared ->
            hb.shape(prepared.font, "fi").use { buffer ->
                assertEquals(listOf(5042), buffer.glyphInfos().map { it.glyphId })
                assertEquals(listOf(0), buffer.glyphInfos().map { it.cluster })
                assertEquals(listOf(1290), buffer.glyphPositions().map { it.xAdvance })
            }
        }
    }

    @Test
    fun dejaVuAvatarMatchesTheFrozenOracle() = runTest {
        awaitHarfBuzzInitialization()
        val hb = HarfBuzz.open()
        hb.prepare(WebTestFonts.dejaVuSans, 2048).use { prepared ->
            hb.shape(prepared.font, "AVATAR").use { buffer ->
                assertEquals(listOf(36, 57, 36, 55, 36, 53), buffer.glyphInfos().map { it.glyphId })
                assertEquals(listOf(1270, 1270, 1242, 1092, 1401, 1423), buffer.glyphPositions().map { it.xAdvance })
            }
        }
    }

    @Test
    fun amiriLigatureAndCaretsMatchTheFrozenOracle() = runTest {
        awaitHarfBuzzInitialization()
        val hb = HarfBuzz.open()
        hb.prepare(WebTestFonts.amiriRegular, 1000).use { prepared ->
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
    fun disablingLigaturesThroughFeaturesChangesTheOutput() = runTest {
        awaitHarfBuzzInitialization()
        val hb = HarfBuzz.open()
        hb.prepare(WebTestFonts.dejaVuSans, 2048).use { prepared ->
            val buffer = hb.createBuffer()
            try {
                buffer.setDirection(HarfBuzzDirection.LEFT_TO_RIGHT)
                buffer.setScript(hb.parseScript("Latn"))
                buffer.setLanguage(hb.parseLanguage("en"))
                buffer.setClusterLevel(HarfBuzzClusterLevel.MONOTONE_CHARACTERS)
                val codePoints = "fi".map { it.code }.toIntArray()
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
    fun variableFontVariationsAndExtentsMatchTheFrozenOracle() = runTest {
        awaitHarfBuzzInitialization()
        val hb = HarfBuzz.open()
        hb.prepare(WebTestFonts.kffiVar, 1000) { font ->
            font.setVarCoordsNormalized(intArrayOf(-16384))
        }.use { prepared ->
            assertEquals(500, prepared.font.glyphHorizontalAdvance(2))
            assertEquals(HarfBuzzGlyphExtents(100, 700, 300, -700), prepared.font.glyphExtents(2))
        }
        hb.prepare(WebTestFonts.kffiVar, 1000) { font ->
            font.setVariations(listOf(HarfBuzzVariation(HarfBuzzTag.of("wght"), 900f)))
        }.use { prepared ->
            assertEquals(800, prepared.font.glyphHorizontalAdvance(2))
            assertEquals(HarfBuzzGlyphExtents(100, 700, 600, -700), prepared.font.glyphExtents(2))
        }
    }
}
