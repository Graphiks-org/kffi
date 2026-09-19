package org.graphiks.kffi.coretext

import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import org.graphiks.kffi.MemoryAllocator
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.apple.AppleNativeSymbols
import org.graphiks.kffi.engine.JvmDowncallEngine
import org.graphiks.kffi.engine.JvmDowncallEngine.AbiType
import org.graphiks.kffi.engine.JvmDowncallEngine.FunctionShape

/** One available font descriptor enumerated from the CoreText activated registry. */
public data class CoreTextAvailableFont(
    /** Localized family name (`kCTFontFamilyNameAttribute`). */
    public val familyName: String,
    /** Localized style name (`kCTFontStyleNameAttribute`). */
    public val styleName: String,
    /** PostScript name (`kCTFontNameAttribute`). */
    public val postScriptName: String,
    /** POSIX file path from `kCTFontURLAttribute`, or empty when the descriptor has no URL. */
    public val filePath: String,
)

/**
 * Read-only enumeration of the fonts CoreText reports as available.
 *
 * Construction explicitly loads native frameworks and may throw
 * `AppleBindingException`. `CTFontManagerCopyAvailableFontFamilyNames` and the
 * collection/descriptor copies return owned CoreFoundation references that this
 * class releases before returning; no native reference escapes. Every returned
 * value is a detached Kotlin string or value object.
 *
 * Enumeration reflects the activated registry (what CoreText would use), not a
 * conventional directory listing, so duplicate files and disabled faces are
 * absent. It does not match by family name or create any font instance.
 */
public class CoreTextFontCatalog {
    private val symbols = frameworks
    private val engine = JvmDowncallEngine

    private val managerCopyFamilyNames = symbols.address("CTFontManagerCopyAvailableFontFamilyNames")
    private val collectionCreateFromAvailable = symbols.address("CTFontCollectionCreateFromAvailableFonts")
    private val collectionCreateMatchingDescriptors = symbols.address("CTFontCollectionCreateMatchingFontDescriptors")
    private val descriptorCopyAttribute = symbols.address("CTFontDescriptorCopyAttribute")
    private val arrayGetCount = symbols.address("CFArrayGetCount")
    private val arrayGetValueAtIndex = symbols.address("CFArrayGetValueAtIndex")
    private val stringGetLength = symbols.address("CFStringGetLength")
    private val stringGetMaximumSizeForEncoding = symbols.address("CFStringGetMaximumSizeForEncoding")
    private val stringGetCString = symbols.address("CFStringGetCString")
    private val urlCopyFileSystemPath = symbols.address("CFURLCopyFileSystemPath")
    private val cfRelease = symbols.address("CFRelease")

    private val familyNameAttribute = constantPointer("kCTFontFamilyNameAttribute")
    private val styleNameAttribute = constantPointer("kCTFontStyleNameAttribute")
    private val postScriptNameAttribute = constantPointer("kCTFontNameAttribute")
    private val urlAttribute = constantPointer("kCTFontURLAttribute")

    /**
     * Returns the localized family names of every available font, in CoreText order.
     *
     * A missing symbol throws `AppleBindingException`; an empty native result
     * returns an empty list.
     */
    public fun availableFontFamilyNames(): List<String> {
        val array = engine.callGeneric(managerCopyFamilyNames, FunctionShape(AbiType.Pointer, emptyList()))
        val reference = pointerOrNull(array) ?: return emptyList()
        return try {
            strings(reference)
        } finally {
            engine.callV1P(cfRelease, reference)
        }
    }

    /**
     * Returns one [CoreTextAvailableFont] per available descriptor.
     *
     * Missing attributes are reported as empty strings rather than errors. The
     * collection, descriptor array and every copied attribute are released before
     * returning.
     */
    public fun availableFonts(): List<CoreTextAvailableFont> {
        val collection = engine.callGeneric(
            collectionCreateFromAvailable,
            FunctionShape(AbiType.Pointer, listOf(AbiType.Pointer)),
            0L,
        )
        val collectionReference = pointerOrNull(collection) ?: return emptyList()
        val descriptors = try {
            engine.callGeneric(
                collectionCreateMatchingDescriptors,
                FunctionShape(AbiType.Pointer, listOf(AbiType.Pointer)),
                collectionReference,
            )
        } finally {
            engine.callV1P(cfRelease, collectionReference)
        }
        val descriptorsReference = pointerOrNull(descriptors) ?: return emptyList()
        return try {
            val count = arrayCount(descriptorsReference)
            ArrayList<CoreTextAvailableFont>(count).also { fonts ->
                for (index in 0 until count) {
                    val descriptor = arrayValue(descriptorsReference, index)
                    fonts.add(
                        CoreTextAvailableFont(
                            familyName = copyAttributeString(descriptor, familyNameAttribute),
                            styleName = copyAttributeString(descriptor, styleNameAttribute),
                            postScriptName = copyAttributeString(descriptor, postScriptNameAttribute),
                            filePath = copyAttributeFileSystemPath(descriptor, urlAttribute),
                        ),
                    )
                }
            }
        } finally {
            engine.callV1P(cfRelease, descriptorsReference)
        }
    }

    private fun strings(array: Long): List<String> {
        val count = arrayCount(array)
        return ArrayList<String>(count).also { values ->
            for (index in 0 until count) values.add(cfString(arrayValue(array, index)))
        }
    }

    private fun arrayCount(array: Long): Int = engine.callL1P(arrayGetCount, array).toInt()

    private fun arrayValue(array: Long, index: Int): Long = pointerOrNull(
        engine.callGeneric(
            arrayGetValueAtIndex,
            FunctionShape(AbiType.Pointer, listOf(AbiType.Pointer, AbiType.I64)),
            array,
            index.toLong(),
        ),
    ) ?: 0L

    private fun copyAttributeString(descriptor: Long, attribute: Long): String {
        val value = engine.callGeneric(
            descriptorCopyAttribute,
            FunctionShape(AbiType.Pointer, listOf(AbiType.Pointer, AbiType.Pointer)),
            descriptor,
            attribute,
        )
        val reference = pointerOrNull(value) ?: return ""
        return try {
            cfString(reference)
        } finally {
            engine.callV1P(cfRelease, reference)
        }
    }

    private fun copyAttributeFileSystemPath(descriptor: Long, attribute: Long): String {
        val value = engine.callGeneric(
            descriptorCopyAttribute,
            FunctionShape(AbiType.Pointer, listOf(AbiType.Pointer, AbiType.Pointer)),
            descriptor,
            attribute,
        )
        val url = pointerOrNull(value) ?: return ""
        try {
            val path = engine.callGeneric(
                urlCopyFileSystemPath,
                FunctionShape(AbiType.Pointer, listOf(AbiType.Pointer, AbiType.I64)),
                url,
                POSIX_PATH_STYLE,
            )
            val pathReference = pointerOrNull(path) ?: return ""
            return try {
                cfString(pathReference)
            } finally {
                engine.callV1P(cfRelease, pathReference)
            }
        } finally {
            engine.callV1P(cfRelease, url)
        }
    }

    /** Converts an owned or borrowed live CFString into a detached Kotlin string. */
    private fun cfString(reference: Long): String {
        val length = engine.callGeneric(
            stringGetLength,
            FunctionShape(AbiType.I64, listOf(AbiType.Pointer)),
            reference,
        ) as Long
        if (length <= 0L) return ""
        val capacity = engine.callGeneric(
            stringGetMaximumSizeForEncoding,
            FunctionShape(AbiType.I64, listOf(AbiType.I64, AbiType.I32)),
            length,
            UTF8_ENCODING,
        ) as Long
        if (capacity <= 0L) return ""
        return MemoryAllocator().use { allocator ->
            val buffer = allocator.allocateBuffer((capacity + 1L).toULong())
            val converted = engine.callGeneric(
                stringGetCString,
                FunctionShape(AbiType.Bool, listOf(AbiType.Pointer, AbiType.Pointer, AbiType.I64, AbiType.I32)),
                reference,
                buffer.handler,
                capacity + 1L,
                UTF8_ENCODING,
            ) as Boolean
            if (!converted) return@use ""
            val bytes = ByteArray(capacity.toInt())
            buffer.readBytes(bytes, 0uL, 0uL, capacity.toULong())
            val terminator = bytes.indexOf(0)
            String(bytes, 0, if (terminator >= 0) terminator else bytes.size, Charsets.UTF_8)
        }
    }

    /** Reads one global `CFStringRef`/`CFURLRef` constant by dereferencing its symbol once. */
    private fun constantPointer(name: String): Long =
        MemorySegment.ofAddress(symbols.address(name)).reinterpret(8L).get(ValueLayout.ADDRESS, 0).address()

    private fun pointerOrNull(result: Any?): Long? {
        val address = (result as? MemorySegment)?.address() ?: 0L
        return if (address == 0L) null else address
    }

    private companion object {
        const val UTF8_ENCODING = 0x08000100
        const val POSIX_PATH_STYLE = 0L

        /** Shared, process-lifetime CoreFoundation/CoreGraphics/CoreText scopes. */
        val frameworks: AppleNativeSymbols by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            AppleNativeSymbols(
                listOf(
                    "/System/Library/Frameworks/CoreFoundation.framework/CoreFoundation",
                    "/System/Library/Frameworks/CoreGraphics.framework/CoreGraphics",
                    "/System/Library/Frameworks/CoreText.framework/CoreText",
                ),
            )
        }
    }
}
