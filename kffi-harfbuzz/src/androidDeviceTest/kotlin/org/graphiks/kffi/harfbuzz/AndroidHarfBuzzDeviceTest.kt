package org.graphiks.kffi.harfbuzz

import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import org.graphiks.kffi.engine.NativeEngine
import org.junit.runner.RunWith

/**
 * The minimal Android ABI proof for the bundled HarfBuzz binding.
 *
 * It loads the extracted `libharfbuzz.so` through the kffi engine, asserts the reported version and
 * the published identity, resolves a symbol explicitly, and shapes Latin text — including the
 * non-empty feature-list and ligature-caret paths, which exercise the generic-call marshalling the
 * other tests do not.
 */
@RunWith(AndroidJUnit4::class)
class AndroidHarfBuzzDeviceTest {
    private fun fontBytes(): ByteArray =
        javaClass.getResourceAsStream("/fonts/dejavu/DejaVuSans.ttf")!!.use { it.readBytes() }

    /** Shapes [text] with [features] and runs [block] before the owners are closed. */
    private fun withShapedFont(
        text: String,
        features: List<HarfBuzzFeature> = emptyList(),
        block: (buffer: HarfBuzzBuffer, font: HarfBuzzFont, shaped: Boolean) -> Unit,
    ) {
        val harfbuzz = HarfBuzz.open()
        val blob = harfbuzz.createBlob(fontBytes())
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
            val codePoints = text.codePoints().toArray()
            buffer.addUtf32(codePoints, 0, codePoints.size)
            block(buffer, font, buffer.shape(font, features))
        } finally {
            buffer.close()
            font.close()
            face.close()
            blob.close()
        }
    }

    @Test
    fun loadsThePinnedLibraryAndResolvesASymbol() {
        val harfbuzz = HarfBuzz.open()
        assertEquals("14.3.0", harfbuzz.version())
        // libharfbuzz is dlopen-ed with RTLD_GLOBAL, so the engine can resolve its symbols by name.
        assertTrue(NativeEngine.resolveSymbol("hb_version_string") != 0L)
    }

    @Test
    fun identityDescribesTheAndroidArtifact() {
        val identity = HarfBuzz.open().bindingIdentity
        assertEquals("android", identity.operatingSystem)
        // CI runs the documented x86_64 emulator; Build.SUPPORTED_ABIS[0] normalizes to x64.
        assertEquals("x64", identity.architecture)
        assertEquals("14.3.0", identity.engineVersion)
        assertEquals("4c2aa804671d7276e8a0eb95da07202ead05c843", identity.upstreamSourceRevision)
        assertTrue(identity.buildChainIdentity.contains("ndk-30.0.15729638"))
        assertTrue(identity.artifactId.startsWith("org.graphiks:kffi-harfbuzz-android:"))
        assertTrue(identity.artifactId.contains("x86_64/libharfbuzz.so"))
        // The digest is observed best-effort: a 64-hex value, or empty when the packaging hides it.
        assertTrue(identity.artifactSha256.isEmpty() || identity.artifactSha256.matches(Regex("[0-9a-f]{64}")))
    }

    @Test
    fun shapesOneLatinGlyph() {
        withShapedFont("A") { buffer, _, shaped ->
            assertTrue(shaped)
            assertEquals(1, buffer.glyphCount())
            val infos = buffer.glyphInfos()
            assertEquals(1, infos.size)
            assertTrue(infos.all { it.glyphId != 0 })
            assertEquals(1, buffer.glyphPositions().size)
        }
    }

    @Test
    fun shapesWithAnExplicitFeatureList() {
        withShapedFont("fi", listOf(HarfBuzzFeature(HarfBuzzTag.of("liga"), 1, 0, -1))) { buffer, _, shaped ->
            assertTrue(shaped)
            assertTrue(buffer.glyphCount() >= 1)
            assertTrue(buffer.glyphInfos().all { it.glyphId != 0 })
            assertEquals(buffer.glyphCount(), buffer.glyphPositions().size)
        }
    }

    @Test
    fun queriesLigatureCarets() {
        withShapedFont("fi", listOf(HarfBuzzFeature(HarfBuzzTag.of("liga"), 1, 0, -1))) { buffer, font, shaped ->
            assertTrue(shaped)
            val glyphId = buffer.glyphInfos().first().glyphId
            assertTrue(glyphId != 0)
            val carets = font.ligatureCarets(HarfBuzzDirection.LEFT_TO_RIGHT, glyphId, 0, 8)
            assertTrue(carets.totalCount >= 0)
            assertTrue(carets.copiedCount in 0..8)
            assertEquals(carets.copiedCount, carets.positions.size)
            assertFailsWith<IllegalArgumentException> {
                font.ligatureCarets(HarfBuzzDirection.LEFT_TO_RIGHT, glyphId, 0, -1)
            }
        }
    }
}
