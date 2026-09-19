package org.graphiks.kffi.fontconfig

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle

/** Why a Fontconfig binding could not be constructed. */
public enum class FontConfigBindingFailure {
    /** The process is not a 64-bit platform supported by these bindings. */
    UNSUPPORTED_PLATFORM,

    /** The system Fontconfig library could not be loaded. */
    LIBRARY_LOAD,

    /** A required Fontconfig symbol could not be resolved. */
    SYMBOL_RESOLUTION,
}

/** Raised when the Fontconfig bindings cannot be constructed. */
public class FontConfigBindingException(
    /** Machine-readable failure category. */
    public val kind: FontConfigBindingFailure,
    message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause)

/** One font matched from the Fontconfig configuration. */
public data class FontConfigFont(
    /** Family name (`FC_FAMILY`), never blank for a returned entry. */
    public val family: String,
    /** Style name (`FC_STYLE`), or empty when absent. */
    public val style: String,
    /** Absolute file path (`FC_FILE`), or empty when absent. */
    public val filePath: String,
    /** PostScript name (`FC_POSTSCRIPT_NAME`), or empty when absent. */
    public val postScriptName: String,
)

/**
 * Read-only enumeration of the fonts Fontconfig reports for the active configuration.
 *
 * Construction loads the system Fontconfig library and resolves the small symbol
 * surface used here; it may throw [FontConfigBindingException]. Every returned
 * value is a detached Kotlin string or value object, and every native pattern set
 * and configuration is destroyed before returning. Nothing native escapes and no
 * pattern is retained.
 *
 * This enumerates the configured font set (`FcFontList` over the loaded
 * configuration), not a conventional directory listing, so fonts reachable only
 * through Fontconfig rules are included and duplicate files are matched as
 * Fontconfig reports them.
 */
public class FontConfig {
    private val native = FontConfigNativeSymbols.load()

    /**
     * Returns every font in the loaded Fontconfig configuration, in Fontconfig order.
     *
     * @throws FontConfigBindingException when the library or a required symbol is unavailable;
     * a failure inside `FcFontList` returns an empty list.
     */
    public fun listFonts(): List<FontConfigFont> {
        val config = (native.initConfigAndFonts.invoke() as MemorySegment).address()
        if (config == 0L) return emptyList()
        try {
            val fontSet = (
                native.fontList.invoke(MemorySegment.ofAddress(config), MemorySegment.NULL, MemorySegment.NULL)
                    as MemorySegment
                ).address()
            if (fontSet == 0L) return emptyList()
            try {
                return readFontSet(fontSet)
            } finally {
                native.fontSetDestroy.invoke(MemorySegment.ofAddress(fontSet))
            }
        } finally {
            native.configDestroy.invoke(MemorySegment.ofAddress(config))
        }
    }

    private fun readFontSet(fontSet: Long): List<FontConfigFont> {
        val set = MemorySegment.ofAddress(fontSet).reinterpret(FONT_SET_BYTES)
        val count = set.get(ValueLayout.JAVA_INT, 0L)
        val fontsAddress = set.get(ValueLayout.ADDRESS, FONT_SET_FONTS_OFFSET).address()
        if (count <= 0 || fontsAddress == 0L) return emptyList()
        val patterns = MemorySegment.ofAddress(fontsAddress).reinterpret(count.toLong() * Long.SIZE_BYTES)
        return Arena.ofConfined().use { arena ->
            val familyObject = arena.allocateFrom("family")
            val styleObject = arena.allocateFrom("style")
            val fileObject = arena.allocateFrom("file")
            val postScriptObject = arena.allocateFrom("postscriptname")
            val result = ArrayList<FontConfigFont>(count)
            for (index in 0 until count) {
                val pattern = patterns.get(ValueLayout.ADDRESS, index.toLong() * Long.SIZE_BYTES).address()
                if (pattern == 0L) continue
                val family = patternString(arena, pattern, familyObject) ?: continue
                if (family.isEmpty()) continue
                result += FontConfigFont(
                    family = family,
                    style = patternString(arena, pattern, styleObject).orEmpty(),
                    filePath = patternString(arena, pattern, fileObject).orEmpty(),
                    postScriptName = patternString(arena, pattern, postScriptObject).orEmpty(),
                )
            }
            result
        }
    }

    private fun patternString(arena: Arena, pattern: Long, objectName: MemorySegment): String? {
        val out = arena.allocate(ValueLayout.ADDRESS)
        val code = native.patternGetString.invoke(
            MemorySegment.ofAddress(pattern),
            objectName,
            0,
            out,
        ) as Int
        if (code != FONT_CONFIG_RESULT_MATCH) return null
        val value = out.get(ValueLayout.ADDRESS, 0L).address()
        if (value == 0L) return null
        return MemorySegment.ofAddress(value).reinterpret(MAX_STRING_BYTES).getString(0)
    }

    private companion object {
        const val FONT_CONFIG_RESULT_MATCH = 0
        const val MAX_STRING_BYTES = 4096L
        const val FONT_SET_BYTES = 16L
        const val FONT_SET_FONTS_OFFSET = 8L
    }
}

/**
 * Resolved Fontconfig native symbols and downcall handles.
 *
 * The library [scope] intentionally stays alive for the process lifetime so its
 * downcall handles remain valid.
 */
internal class FontConfigNativeSymbols private constructor(
    val initConfigAndFonts: MethodHandle,
    val fontList: MethodHandle,
    val patternGetString: MethodHandle,
    val fontSetDestroy: MethodHandle,
    val configDestroy: MethodHandle,
) {
    companion object {
        private val libraryNames = listOf("libfontconfig.so.1", "libfontconfig.so")

        fun load(): FontConfigNativeSymbols {
            if (ValueLayout.ADDRESS.byteSize() != 8L) {
                throw FontConfigBindingException(
                    FontConfigBindingFailure.UNSUPPORTED_PLATFORM,
                    "Fontconfig bindings require 64-bit pointers.",
                )
            }
            val scope = Arena.ofShared()
            val lookup = libraryNames.asSequence().mapNotNull { name ->
                runCatching { SymbolLookup.libraryLookup(name, scope) }.getOrNull()
            }.firstOrNull()
            if (lookup == null) {
                scope.close()
                throw FontConfigBindingException(
                    FontConfigBindingFailure.LIBRARY_LOAD,
                    "The system Fontconfig library (${libraryNames.joinToString()}) could not be loaded.",
                )
            }
            val linker = Linker.nativeLinker()
            fun handle(name: String, descriptor: FunctionDescriptor): MethodHandle {
                val symbol = lookup.find(name).orElse(null) ?: throw FontConfigBindingException(
                    FontConfigBindingFailure.SYMBOL_RESOLUTION,
                    "Unable to resolve Fontconfig symbol: $name",
                )
                return linker.downcallHandle(symbol, descriptor)
            }
            return try {
                FontConfigNativeSymbols(
                    initConfigAndFonts = handle(
                        "FcInitLoadConfigAndFonts",
                        FunctionDescriptor.of(ValueLayout.ADDRESS),
                    ),
                    fontList = handle(
                        "FcFontList",
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    ),
                    patternGetString = handle(
                        "FcPatternGetString",
                        FunctionDescriptor.of(
                            ValueLayout.JAVA_INT,
                            ValueLayout.ADDRESS,
                            ValueLayout.ADDRESS,
                            ValueLayout.JAVA_INT,
                            ValueLayout.ADDRESS,
                        ),
                    ),
                    fontSetDestroy = handle("FcFontSetDestroy", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)),
                    configDestroy = handle("FcConfigDestroy", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)),
                )
            } catch (failure: Throwable) {
                scope.close()
                throw failure
            }
        }
    }
}
