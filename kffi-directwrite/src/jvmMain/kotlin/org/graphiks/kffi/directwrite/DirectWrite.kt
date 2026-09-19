package org.graphiks.kffi.directwrite

import org.graphiks.kffi.engine.JvmDowncallEngine
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout

/** Why a DirectWrite binding could not be constructed or a call could not complete. */
public enum class DirectWriteFailure {
    /** The process is not a 64-bit Windows platform supported by these bindings. */
    UNSUPPORTED_PLATFORM,

    /** The system DirectWrite library could not be loaded. */
    LIBRARY_LOAD,

    /** A required DirectWrite symbol could not be resolved. */
    SYMBOL_RESOLUTION,

    /** A DirectWrite COM method returned a failing HRESULT. */
    COM_FAILURE,
}

/** Raised when the DirectWrite bindings cannot be constructed or a COM call fails. */
public class DirectWriteException(
    /** Machine-readable failure category. */
    public val kind: DirectWriteFailure,
    message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause)

/**
 * One font face enumerated from the DirectWrite system font collection.
 *
 * Every field is a detached Kotlin value: no COM interface or native pointer
 * escapes [DirectWrite.systemFonts].
 */
public data class DirectWriteFont(
    /** Family name (`IDWriteFontFamily::GetFontFamilyNames`), never blank for a returned entry. */
    public val family: String,
    /** Face name (`IDWriteFont::GetFaceNames`), or empty when absent. */
    public val faceName: String,
    /** PostScript name (`DWRITE_INFORMATIONAL_STRING_POSTSCRIPT_NAME`), or empty when absent. */
    public val postScriptName: String,
    /** Absolute font file path from the font file reference key, or empty when absent. */
    public val filePath: String,
    /** Numeric weight (`DWRITE_FONT_WEIGHT`). */
    public val weight: Int,
    /** Numeric stretch (`DWRITE_FONT_STRETCH`). */
    public val stretch: Int,
    /** Numeric style/slant (`DWRITE_FONT_STYLE`). */
    public val style: Int,
)

/**
 * Read-only enumeration of the fonts in the DirectWrite system font collection.
 *
 * Construction loads `dwrite.dll` and resolves `DWriteCreateFactory`; it may
 * throw [DirectWriteException] on an unsupported platform. Each call to
 * [systemFonts] creates a factory, walks the system collection and releases
 * every COM interface it acquires. The system collection is the one DirectWrite
 * reports for the active configuration, so fonts reachable only through
 * DirectWrite (user fonts, per-user installs) are included.
 */
public class DirectWrite {

    private val factoryAddress: Long = DirectWriteSymbols.loadFactory()

    /**
     * Returns every font face in the DirectWrite system font collection.
     *
     * @throws DirectWriteException when a COM call fails.
     */
    public fun systemFonts(): List<DirectWriteFont> {
        Arena.ofConfined().use { arena ->
            val factory = createFactory(arena)
            try {
                return readCollection(arena, factory)
            } finally {
                factory.release()
            }
        }
    }

    private fun createFactory(arena: Arena): ComObject {
        val iid = arena.allocate(IID_BYTES)
        iid.asByteBuffer().put(IID_ID_WRITE_FACTORY)
        val factoryOut = arena.allocate(ValueLayout.ADDRESS)
        val hr = JvmDowncallEngine.callGeneric(
            factoryAddress,
            JvmDowncallEngine.FunctionShape(
                JvmDowncallEngine.AbiType.I32,
                listOf(
                    JvmDowncallEngine.AbiType.I32,
                    JvmDowncallEngine.AbiType.Pointer,
                    JvmDowncallEngine.AbiType.Pointer,
                ),
            ),
            FACTORY_TYPE_SHARED,
            iid,
            factoryOut,
        ) as Int
        checkHr(hr, "DWriteCreateFactory")
        return ComObject(factoryOut.get(ValueLayout.ADDRESS, 0L).address())
    }

    private fun readCollection(arena: Arena, factory: ComObject): List<DirectWriteFont> {
        val collectionOut = arena.allocate(ValueLayout.ADDRESS)
        checkHr(
            factory.hresult(
                ID_WRITE_FACTORY_GET_SYSTEM_FONT_COLLECTION,
                listOf(JvmDowncallEngine.AbiType.Pointer, JvmDowncallEngine.AbiType.I32),
                collectionOut,
                0,
            ),
            "IDWriteFactory::GetSystemFontCollection",
        )
        val collection = ComObject(collectionOut.get(ValueLayout.ADDRESS, 0L).address())
        try {
            val fonts = ArrayList<DirectWriteFont>()
            val familyCount = collection.uint32(ID_WRITE_FONT_COLLECTION_GET_FONT_FAMILY_COUNT)
            for (familyIndex in 0 until familyCount) {
                readFamily(arena, collection, familyIndex, fonts)
            }
            return fonts
        } finally {
            collection.release()
        }
    }

    private fun readFamily(arena: Arena, collection: ComObject, familyIndex: Int, into: MutableList<DirectWriteFont>) {
        val familyOut = arena.allocate(ValueLayout.ADDRESS)
        checkHr(
            collection.hresult(
                ID_WRITE_FONT_COLLECTION_GET_FONT_FAMILY,
                listOf(JvmDowncallEngine.AbiType.I32, JvmDowncallEngine.AbiType.Pointer),
                familyIndex,
                familyOut,
            ),
            "IDWriteFontCollection::GetFontFamily",
        )
        val family = ComObject(familyOut.get(ValueLayout.ADDRESS, 0L).address())
        try {
            val familyName = readFirstString(arena, family, ID_WRITE_FONT_FAMILY_GET_FONT_FAMILY_NAMES)
            val fontCount = family.uint32(ID_WRITE_FONT_LIST_GET_FONT_COUNT)
            for (fontIndex in 0 until fontCount) {
                readFont(arena, family, fontIndex, familyName, into)
            }
        } finally {
            family.release()
        }
    }

    private fun readFont(arena: Arena, family: ComObject, fontIndex: Int, familyName: String, into: MutableList<DirectWriteFont>) {
        val fontOut = arena.allocate(ValueLayout.ADDRESS)
        checkHr(
            family.hresult(
                ID_WRITE_FONT_LIST_GET_FONT,
                listOf(JvmDowncallEngine.AbiType.I32, JvmDowncallEngine.AbiType.Pointer),
                fontIndex,
                fontOut,
            ),
            "IDWriteFontList::GetFont",
        )
        val font = ComObject(fontOut.get(ValueLayout.ADDRESS, 0L).address())
        try {
            into += DirectWriteFont(
                family = familyName,
                faceName = readFirstString(arena, font, ID_WRITE_FONT_GET_FACE_NAMES),
                postScriptName = readInformationalString(arena, font, INFORMATIONAL_STRING_POSTSCRIPT_NAME),
                filePath = readFilePath(arena, font),
                weight = font.uint32(ID_WRITE_FONT_GET_WEIGHT),
                stretch = font.uint32(ID_WRITE_FONT_GET_STRETCH),
                style = font.uint32(ID_WRITE_FONT_GET_STYLE),
            )
        } finally {
            font.release()
        }
    }

    private fun readFilePath(arena: Arena, font: ComObject): String {
        val faceOut = arena.allocate(ValueLayout.ADDRESS)
        checkHr(
            font.hresult(ID_WRITE_FONT_CREATE_FONT_FACE, listOf(JvmDowncallEngine.AbiType.Pointer), faceOut),
            "IDWriteFont::CreateFontFace",
        )
        val face = ComObject(faceOut.get(ValueLayout.ADDRESS, 0L).address())
        try {
            val countOut = arena.allocate(ValueLayout.JAVA_INT)
            countOut.set(ValueLayout.JAVA_INT, 0L, 1)
            val files = arena.allocate(ValueLayout.ADDRESS)
            checkHr(
                face.hresult(
                    ID_WRITE_FONT_FACE_GET_FILES,
                    listOf(JvmDowncallEngine.AbiType.Pointer, JvmDowncallEngine.AbiType.Pointer),
                    countOut,
                    files,
                ),
                "IDWriteFontFace::GetFiles",
            )
            if (countOut.get(ValueLayout.JAVA_INT, 0L) <= 0) return ""
            val file = ComObject(files.get(ValueLayout.ADDRESS, 0L).address())
            try {
                val keyOut = arena.allocate(ValueLayout.ADDRESS)
                val sizeOut = arena.allocate(ValueLayout.JAVA_INT)
                checkHr(
                    file.hresult(
                        ID_WRITE_FONT_FILE_GET_REFERENCE_KEY,
                        listOf(JvmDowncallEngine.AbiType.Pointer, JvmDowncallEngine.AbiType.Pointer),
                        keyOut,
                        sizeOut,
                    ),
                    "IDWriteFontFile::GetReferenceKey",
                )
                val keyAddress = keyOut.get(ValueLayout.ADDRESS, 0L).address()
                val size = sizeOut.get(ValueLayout.JAVA_INT, 0L)
                if (keyAddress == 0L || size <= 0) return ""
                val bytes = ByteArray(size)
                MemorySegment.ofAddress(keyAddress)
                    .reinterpret(size.toLong())
                    .asByteBuffer()
                    .get(bytes)
                return String(bytes, Charsets.UTF_16LE).trimEnd('\u0000')
            } finally {
                file.release()
            }
        } finally {
            face.release()
        }
    }

    /** Reads index 0 of the `IDWriteLocalizedStrings` returned by [slot]. */
    private fun readFirstString(arena: Arena, target: ComObject, slot: Int): String {
        val stringsOut = arena.allocate(ValueLayout.ADDRESS)
        checkHr(
            target.hresult(slot, listOf(JvmDowncallEngine.AbiType.Pointer), stringsOut),
            "IDWriteLocalizedStrings::$slot",
        )
        val strings = ComObject(stringsOut.get(ValueLayout.ADDRESS, 0L).address())
        try {
            if (strings.uint32(ID_WRITE_LOCALIZED_STRINGS_GET_COUNT) <= 0) return ""
            return readString(arena, strings, 0)
        } finally {
            strings.release()
        }
    }

    private fun readInformationalString(arena: Arena, font: ComObject, infoStringId: Int): String {
        val stringsOut = arena.allocate(ValueLayout.ADDRESS)
        val existsOut = arena.allocate(ValueLayout.JAVA_INT)
        checkHr(
            font.hresult(
                ID_WRITE_FONT_GET_INFORMATIONAL_STRINGS,
                listOf(JvmDowncallEngine.AbiType.I32, JvmDowncallEngine.AbiType.Pointer, JvmDowncallEngine.AbiType.Pointer),
                infoStringId,
                stringsOut,
                existsOut,
            ),
            "IDWriteFont::GetInformationalStrings",
        )
        if (existsOut.get(ValueLayout.JAVA_INT, 0L) == 0) return ""
        val strings = ComObject(stringsOut.get(ValueLayout.ADDRESS, 0L).address())
        try {
            if (strings.uint32(ID_WRITE_LOCALIZED_STRINGS_GET_COUNT) <= 0) return ""
            return readString(arena, strings, 0)
        } finally {
            strings.release()
        }
    }

    private fun readString(arena: Arena, strings: ComObject, index: Int): String {
        val lengthOut = arena.allocate(ValueLayout.JAVA_INT)
        checkHr(
            strings.hresult(
                ID_WRITE_LOCALIZED_STRINGS_GET_STRING_LENGTH,
                listOf(JvmDowncallEngine.AbiType.I32, JvmDowncallEngine.AbiType.Pointer),
                index,
                lengthOut,
            ),
            "IDWriteLocalizedStrings::GetStringLength",
        )
        val length = lengthOut.get(ValueLayout.JAVA_INT, 0L)
        if (length < 0) return ""
        val capacity = length + 1
        val buffer = arena.allocate(capacity.toLong() * CHAR_BYTES)
        checkHr(
            strings.hresult(
                ID_WRITE_LOCALIZED_STRINGS_GET_STRING,
                listOf(
                    JvmDowncallEngine.AbiType.I32,
                    JvmDowncallEngine.AbiType.Pointer,
                    JvmDowncallEngine.AbiType.I32,
                ),
                index,
                buffer,
                capacity,
            ),
            "IDWriteLocalizedStrings::GetString",
        )
        return buffer.getString(0L, Charsets.UTF_16LE)
    }

    private fun checkHr(hr: Int, operation: String) {
        if (hr < 0) {
            throw DirectWriteException(
                DirectWriteFailure.COM_FAILURE,
                "$operation failed with HRESULT 0x${hr.toString(16)}",
            )
        }
    }

    private companion object {
        // Vtable slots: IUnknown occupies 0..2 (QueryInterface, AddRef, Release).
        const val ID_WRITE_FACTORY_GET_SYSTEM_FONT_COLLECTION = 3
        const val ID_WRITE_FONT_COLLECTION_GET_FONT_FAMILY_COUNT = 3
        const val ID_WRITE_FONT_COLLECTION_GET_FONT_FAMILY = 4
        const val ID_WRITE_FONT_LIST_GET_FONT_COUNT = 4
        const val ID_WRITE_FONT_LIST_GET_FONT = 5
        const val ID_WRITE_FONT_FAMILY_GET_FONT_FAMILY_NAMES = 6
        const val ID_WRITE_FONT_GET_WEIGHT = 4
        const val ID_WRITE_FONT_GET_STRETCH = 5
        const val ID_WRITE_FONT_GET_STYLE = 6
        const val ID_WRITE_FONT_GET_FACE_NAMES = 8
        const val ID_WRITE_FONT_GET_INFORMATIONAL_STRINGS = 9
        const val ID_WRITE_FONT_CREATE_FONT_FACE = 13
        const val ID_WRITE_FONT_FACE_GET_FILES = 4
        const val ID_WRITE_FONT_FILE_GET_REFERENCE_KEY = 3
        const val ID_WRITE_LOCALIZED_STRINGS_GET_COUNT = 3
        const val ID_WRITE_LOCALIZED_STRINGS_GET_STRING_LENGTH = 7
        const val ID_WRITE_LOCALIZED_STRINGS_GET_STRING = 8

        const val FACTORY_TYPE_SHARED = 0
        const val INFORMATIONAL_STRING_POSTSCRIPT_NAME = 17
        const val CHAR_BYTES = 2L
        const val IID_BYTES = 16L

        /** `IID_IDWriteFactory` = {b859ee5a-d838-4b5b-a2e8-1adc7d93db48}, little-endian. */
        val IID_ID_WRITE_FACTORY = byteArrayOf(
            0x5A, 0xEE.toByte(), 0x59, 0xB8.toByte(),
            0x38, 0xD8.toByte(),
            0x5B, 0x4B,
            0xA2.toByte(), 0xE8.toByte(), 0x1A, 0xDC.toByte(), 0x7D, 0x93.toByte(), 0xDB.toByte(), 0x48,
        )
    }
}

/** Resolves the `DWriteCreateFactory` symbol from the system DirectWrite library. */
internal object DirectWriteSymbols {

    private val libraryNames = listOf("dwrite.dll", "DWrite.dll")

    fun loadFactory(): Long {
        if (ValueLayout.ADDRESS.byteSize() != 8L || !isWindows()) {
            throw DirectWriteException(
                DirectWriteFailure.UNSUPPORTED_PLATFORM,
                "DirectWrite bindings require a 64-bit Windows platform.",
            )
        }
        val scope = Arena.ofShared()
        val lookup = libraryNames.asSequence().mapNotNull { name ->
            runCatching { SymbolLookup.libraryLookup(name, scope) }.getOrNull()
        }.firstOrNull()
        if (lookup == null) {
            scope.close()
            throw DirectWriteException(
                DirectWriteFailure.LIBRARY_LOAD,
                "The system DirectWrite library (${libraryNames.joinToString()}) could not be loaded.",
            )
        }
        return lookup.find("DWriteCreateFactory").orElse(null)?.address()
            ?: throw DirectWriteException(
                DirectWriteFailure.SYMBOL_RESOLUTION,
                "Unable to resolve DirectWrite symbol: DWriteCreateFactory",
            )
    }

    private fun isWindows(): Boolean = System.getProperty("os.name").orEmpty().startsWith("Windows")
}
