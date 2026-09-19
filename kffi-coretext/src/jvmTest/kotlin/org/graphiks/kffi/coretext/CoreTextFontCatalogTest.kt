package org.graphiks.kffi.coretext

import java.io.File
import kotlin.test.Test
import kotlin.test.assertTrue

class CoreTextFontCatalogTest {
    // Catches directory scanning, dropped descriptors, name-based matching, or unreadable constant attributes.
    @Test
    fun enumeratesFamiliesAndTheirRegisteredFiles() {
        val catalog = CoreTextFontCatalog()

        val families = catalog.availableFontFamilyNames()
        assertTrue(families.isNotEmpty(), "expected at least one available family")
        assertTrue(families.all { it.isNotBlank() }, "family names must not be blank")

        val fonts = catalog.availableFonts()
        assertTrue(fonts.isNotEmpty(), "expected at least one available font descriptor")
        val familySet = families.toSet()
        assertTrue(
            fonts.all { it.familyName in familySet },
            "every descriptor family must also appear in the family enumeration",
        )
        assertTrue(
            fonts.any { it.filePath.isNotBlank() && File(it.filePath).isFile },
            "expected at least one descriptor pointing at an existing registered font file",
        )
        assertTrue(
            fonts.any { it.postScriptName.isNotBlank() },
            "expected at least one descriptor with a PostScript name",
        )
    }
}
