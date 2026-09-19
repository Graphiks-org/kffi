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
        assertTrue(
            fonts.all { it.filePath.isBlank() || File(it.filePath).isFile },
            "every reported file path must exist on disk",
        )
        assertTrue(
            fonts.any { it.filePath.isNotBlank() && it.filePath.endsWith(".ttf", true) || it.filePath.endsWith(".ttc", true) },
            "at least one TrueType face must be reported",
        )
        assertTrue(
            fonts.any { it.postScriptName.isNotBlank() },
            "at least one face must carry a PostScript name",
        )
    }
}
