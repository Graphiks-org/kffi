package org.graphiks.kffi.directwrite

import java.io.File
import kotlin.test.Test
import kotlin.test.assertTrue

class DirectWriteTest {

    @Test
    fun systemFontsAreDiscovered() {
        val fonts = DirectWrite().systemFonts()

        val existingPaths = fonts.map { it.filePath }.filter { it.isNotBlank() && File(it).isFile }
        println("DWDBG fonts=${fonts.size} nonBlankPaths=${fonts.count { it.filePath.isNotBlank() }} existing=$existingPaths.size")
        fonts.take(5).forEach {
            println("DWDBG family=[${it.family}] face=[${it.faceName}] ps=[${it.postScriptName}] pathLen=${it.filePath.length} path=[${it.filePath}] exists=${File(it.filePath).exists()}")
        }

        assertTrue(fonts.isNotEmpty(), "the DirectWrite system collection must report at least one face")
        assertTrue(fonts.all { it.family.isNotBlank() }, "every face must carry a family name")
        assertTrue(fonts.all { it.weight > 0 }, "every face must carry a numeric weight")

        // A reference key is not guaranteed to be a filesystem path, so assert that
        // the collection yields real font files rather than that every key resolves.
        val reportedPaths = fonts.map { it.filePath }.filter { it.isNotBlank() }.distinct()
        assertTrue(
            existingPaths.any { path ->
                path.endsWith(".ttf", true) || path.endsWith(".ttc", true) || path.endsWith(".otf", true)
            },
            "at least one reported file path must be an existing TrueType/OpenType file; " +
                "reported sample: ${reportedPaths.take(5)}",
        )
        assertTrue(
            existingPaths.size >= 10,
            "the system collection must report many existing font files (found ${existingPaths.size})",
        )
        assertTrue(fonts.any { it.postScriptName.isNotBlank() }, "at least one face must carry a PostScript name")
    }
}
