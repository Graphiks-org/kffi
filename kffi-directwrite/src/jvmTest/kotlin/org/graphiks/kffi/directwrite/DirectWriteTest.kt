package org.graphiks.kffi.directwrite

import java.io.File
import kotlin.test.Test
import kotlin.test.assertTrue

class DirectWriteTest {

    @Test
    fun systemFontsAreDiscovered() {
        val fonts = DirectWrite().systemFonts()

        assertTrue(fonts.isNotEmpty(), "the DirectWrite system collection must report at least one face")
        assertTrue(fonts.all { it.family.isNotBlank() }, "every face must carry a family name")
        assertTrue(fonts.all { it.weight > 0 }, "every face must carry a numeric weight")

        val existingPaths = fonts.map { it.filePath }.filter { it.isNotBlank() && File(it).isFile }
        assertTrue(
            existingPaths.any { path ->
                path.endsWith(".ttf", true) || path.endsWith(".ttc", true) || path.endsWith(".otf", true)
            },
            "at least one reported file path must be an existing TrueType/OpenType file; " +
                "reported sample: ${fonts.map { it.filePath }.filter { it.isNotBlank() }.distinct().take(5)}",
        )
        assertTrue(
            existingPaths.size >= 10,
            "the system collection must report many existing font files (found ${existingPaths.size})",
        )
        assertTrue(fonts.any { it.postScriptName.isNotBlank() }, "at least one face must carry a PostScript name")
    }
}
