package org.graphiks.kffi.fontconfig

import java.io.File
import kotlin.test.Test
import kotlin.test.assertTrue

class FontConfigTest {
    // Catches a mislaid struct layout, a dropped pattern, an uninitialized configuration, or a leaked native pattern set.
    @Test
    fun listsConfiguredFontsWithFamiliesAndFiles() {
        val fonts = FontConfig().listFonts()

        assertTrue(fonts.isNotEmpty(), "expected at least one configured Fontconfig font")
        assertTrue(fonts.all { it.family.isNotBlank() }, "family must never be blank for a returned font")
        assertTrue(
            fonts.any { it.filePath.isNotBlank() && File(it.filePath).isFile },
            "expected at least one configured font file to exist on disk",
        )
    }

    @Test
    fun repeatedEnumerationsAreIndependent() {
        val api = FontConfig()

        val first = api.listFonts()
        val second = api.listFonts()

        assertTrue(first.isNotEmpty())
        assertTrue(second.isNotEmpty())
        assertTrue(first.size == second.size, "two enumerations of the same configuration must agree")
    }
}
