package org.graphiks.kffi.harfbuzz

import org.graphiks.kffi.MemoryAllocator
import org.graphiks.kffi.MemoryBuffer
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.engine.NativeEngine
import org.graphiks.kffi.memoryScope

/**
 * The Android entry point of the bundled HarfBuzz library.
 *
 * The constructor loads and verifies the extracted `libharfbuzz.so` through [HarfBuzzAndroidLoader]
 * and resolves its symbols through the kffi JNI engine. The dlopen handle and symbol addresses remain
 * valid for the process lifetime, so the instance is safe to share across threads once created.
 */
public actual class HarfBuzz private actual constructor() {
    private val loader: HarfBuzzAndroidLoader = HarfBuzzAndroidLoader.load()
    private val operations: HarfBuzzOperations = loader.operations

    public actual fun version(): String = loader.versionString()

    public actual val bindingIdentity: HarfBuzzBindingIdentity get() = loader.identity

    public actual fun createBlob(bytes: ByteArray): HarfBuzzBlob = HarfBuzzBlob(operations, bytes)

    public actual fun createBuffer(): HarfBuzzBuffer = HarfBuzzBuffer(
        operations,
        requireNativeHandle(operations.createBuffer(), "buffer"),
    )

    public actual fun parseScript(value: String): HarfBuzzScript = memoryScope { scope ->
        val text = scope.allocateFrom(value)
        val script = NativeEngine.callI2PI(operations.scriptFromString, text.handler.rawValue, -1).toInt()
        if (script == HB_SCRIPT_INVALID) {
            throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.NATIVE_OPERATION,
                "HarfBuzz could not parse the script identifier: $value",
                cause = null,
            )
        }
        HarfBuzzScript(canonicalScriptTag(script))
    }

    public actual fun parseLanguage(value: String): HarfBuzzLanguage = memoryScope { scope ->
        val text = scope.allocateFrom(value)
        val language = NativeEngine.callP2PI(operations.languageFromString, text.handler.rawValue, -1)
        if (language == 0L) {
            throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.NATIVE_OPERATION,
                "HarfBuzz could not parse the language identifier: $value",
                cause = null,
            )
        }
        HarfBuzzLanguage(
            readCString(NativeEngine.callP1P(operations.languageToString, language), MAX_LANGUAGE_BYTES),
        )
    }

    public actual companion object {
        public actual fun open(): HarfBuzz = HarfBuzz()
    }
}

/**
 * An owned native blob copying [bytes] into a dedicated arena.
 *
 * The arena and native blob live until [close] and back every face and font created from this blob.
 * A blob may create several faces and each face may create several fonts; [close] defers destruction
 * until the last live descendant has been released, so every child must be closed before its parent
 * to free the arena. Close is idempotent, but `close` is not synchronised across threads: closing a
 * blob concurrently with creating or closing its descendants is a data race.
 */
public actual class HarfBuzzBlob internal constructor(
    private val operations: HarfBuzzOperations,
    bytes: ByteArray,
) : AutoCloseable {
    private val allocator: MemoryAllocator = MemoryAllocator()
    private var closed: Boolean = false
    private var descendants: Int = 0
    private val blob: Long

    init {
        blob = try {
            val copied = allocator.allocateBuffer(bytes.size.toULong())
            copied.writeBytes(bytes)
            requireNativeHandle(
                operations.createBlob(
                    copied.handler.rawValue,
                    bytes.size,
                    HB_MEMORY_MODE_READONLY,
                    0L,
                    0L,
                ),
                "blob",
            )
        } catch (error: Throwable) {
            allocator.close()
            throw error
        }
    }

    public actual fun createFace(faceIndex: Int): HarfBuzzFace {
        requireOpen()
        addDescendant()
        val face = try {
            requireNativeHandle(NativeEngine.callP2PI(operations.faceCreate, blob, faceIndex), "face")
        } catch (error: Throwable) {
            releaseDescendant()
            throw error
        }
        return HarfBuzzFace(operations, this, face)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz blob has been closed." }
    }

    /** Registers a live face or font that retains this blob's arena. */
    internal fun addDescendant() {
        descendants += 1
    }

    /** Releases one descendant, destroying the blob and arena once the last live one is gone. */
    internal fun releaseDescendant() {
        check(descendants > 0) { "The HarfBuzz blob has no live descendant to release." }
        descendants -= 1
        if (closed && descendants == 0) destroy()
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        if (descendants == 0) destroy()
    }

    private fun destroy() {
        var failure: Throwable? = null
        try {
            NativeEngine.callV1P(operations.blobDestroy, blob)
        } catch (error: Throwable) {
            failure = error
        }
        try {
            allocator.close()
        } catch (error: Throwable) {
            if (failure == null) failure = error else failure.addSuppressed(error)
        }
        failure?.let { throw it }
    }
}

/**
 * An owned native face retaining the [HarfBuzzBlob] whose memory backs it.
 *
 * A face may create several fonts. Releasing the face releases only its own reference to the blob;
 * the blob's arena is not freed until every font created here is also closed. Close is idempotent,
 * but `close` is not synchronised across threads.
 */
public actual class HarfBuzzFace internal constructor(
    private val operations: HarfBuzzOperations,
    private val blob: HarfBuzzBlob,
    private val face: Long,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun unitsPerEm(): Int {
        requireOpen()
        return NativeEngine.callI1P(operations.faceGetUpem, face).toInt()
    }

    public actual fun makeImmutable() {
        requireOpen()
        NativeEngine.callV1P(operations.faceMakeImmutable, face)
    }

    public actual fun createFont(): HarfBuzzFont {
        requireOpen()
        blob.addDescendant()
        val font = try {
            requireNativeHandle(NativeEngine.callP1P(operations.fontCreate, face), "font")
        } catch (error: Throwable) {
            blob.releaseDescendant()
            throw error
        }
        return HarfBuzzFont(operations, blob, font)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz face has been closed." }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        try {
            NativeEngine.callV1P(operations.faceDestroy, face)
        } finally {
            blob.releaseDescendant()
        }
    }
}

/**
 * An owned native font retaining the [HarfBuzzBlob] that backs its face.
 *
 * Releasing the font destroys the native font first, then releases its own reference to the blob.
 * Close is idempotent, but `close` is not synchronised across threads.
 */
public actual class HarfBuzzFont internal constructor(
    private val operations: HarfBuzzOperations,
    private val blob: HarfBuzzBlob,
    @get:JvmSynthetic internal val nativeFont: Long,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun useOpenTypeFunctions() {
        requireOpen()
        NativeEngine.callV1P(operations.otFontSetFuncs, nativeFont)
    }

    public actual fun setScale(x: Int, y: Int) {
        requireOpen()
        operations.setScale(nativeFont, x, y)
    }

    public actual fun makeImmutable() {
        requireOpen()
        NativeEngine.callV1P(operations.fontMakeImmutable, nativeFont)
    }

    public actual fun glyphHorizontalAdvance(glyphId: Int): Int {
        requireOpen()
        return NativeEngine.callI2PI(operations.fontGetGlyphHorizontalAdvance, nativeFont, glyphId).toInt()
    }

    public actual fun ligatureCarets(
        direction: HarfBuzzDirection,
        glyphId: Int,
        offset: Int,
        maxCount: Int,
    ): HarfBuzzLigatureCarets {
        requireOpen()
        return operations.getLigatureCarets(nativeFont, direction.toNativeDirection(), glyphId, offset, maxCount)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz font has been closed." }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        try {
            NativeEngine.callV1P(operations.fontDestroy, nativeFont)
        } finally {
            blob.releaseDescendant()
        }
    }
}

/**
 * An owned native shaping buffer.
 *
 * All setters and queries must be used before [close]; the buffer is not thread-safe and is intended
 * to be confined to one shaping operation at a time.
 */
public actual class HarfBuzzBuffer internal constructor(
    private val operations: HarfBuzzOperations,
    private val buffer: Long,
) : AutoCloseable {
    private var closed: Boolean = false

    public actual fun setDirection(direction: HarfBuzzDirection) {
        requireOpen()
        NativeEngine.callV2PI(operations.bufferSetDirection, buffer, direction.toNativeDirection())
    }

    public actual fun setScript(script: HarfBuzzScript) {
        requireOpen()
        memoryScope { scope ->
            val text = scope.allocateFrom(script.value)
            NativeEngine.callV2PI(
                operations.bufferSetScript,
                buffer,
                NativeEngine.callI2PI(operations.scriptFromString, text.handler.rawValue, -1).toInt(),
            )
        }
    }

    public actual fun setLanguage(language: HarfBuzzLanguage) {
        requireOpen()
        memoryScope { scope ->
            val text = scope.allocateFrom(language.value)
            val nativeLanguage = NativeEngine.callP2PI(operations.languageFromString, text.handler.rawValue, -1)
            if (nativeLanguage == 0L) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.NATIVE_OPERATION,
                    "HarfBuzz could not parse the language identifier: ${language.value}",
                    cause = null,
                )
            }
            NativeEngine.callV2PP(operations.bufferSetLanguage, buffer, nativeLanguage)
        }
    }

    public actual fun setClusterLevel(level: HarfBuzzClusterLevel) {
        requireOpen()
        val nativeLevel = when (level) {
            HarfBuzzClusterLevel.MONOTONE_GRAPHEMES -> 0
            HarfBuzzClusterLevel.MONOTONE_CHARACTERS -> 1
            HarfBuzzClusterLevel.CHARACTERS -> 2
        }
        NativeEngine.callV2PI(operations.bufferSetClusterLevel, buffer, nativeLevel)
    }

    public actual fun setFlags(flags: HarfBuzzBufferFlags) {
        requireOpen()
        var nativeFlags = 0
        if (flags.beginningOfText) nativeFlags = nativeFlags or HB_BUFFER_FLAG_BOT
        if (flags.endOfText) nativeFlags = nativeFlags or HB_BUFFER_FLAG_EOT
        if (flags.produceUnsafeToConcat) nativeFlags = nativeFlags or HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT
        NativeEngine.callV2PI(operations.bufferSetFlags, buffer, nativeFlags)
    }

    public actual fun addUtf32(codePoints: IntArray, itemOffset: Int, itemLength: Int) {
        requireOpen()
        operations.addUtf32(buffer, codePoints, itemOffset, itemLength)
    }

    public actual fun shape(font: HarfBuzzFont, features: List<HarfBuzzFeature>): Boolean {
        requireOpen()
        return operations.shape(font.nativeFont, buffer, features) != 0
    }

    public actual fun glyphCount(): Int {
        requireOpen()
        return NativeEngine.callI1P(operations.bufferGetLength, buffer).toInt()
    }

    public actual fun glyphInfos(): List<HarfBuzzGlyphInfo> {
        requireOpen()
        return operations.glyphInfos(buffer)
    }

    public actual fun glyphPositions(): List<HarfBuzzGlyphPosition> {
        requireOpen()
        return operations.glyphPositions(buffer)
    }

    private fun requireOpen() {
        check(!closed) { "This HarfBuzz buffer has been closed." }
    }

    public actual override fun close() {
        if (closed) return
        closed = true
        NativeEngine.callV1P(operations.bufferDestroy, buffer)
    }
}

/**
 * The resolved HarfBuzz entry points used by the binding.
 *
 * Every address is resolved once through [NativeEngine.resolveSymbolIn] against the dlopen handle of
 * the loaded `libharfbuzz.so`; the loader keeps the library resident for the process lifetime, so the
 * addresses stay valid. Arguments are marshalled either through the engine's typed `call*` shims or,
 * for signatures the shims do not cover, through [NativeEngine.callGeneric] with a libffi type spec.
 */
internal class HarfBuzzOperations(private val handle: Long) {
    private fun symbol(name: String): Long {
        val address = NativeEngine.resolveSymbolIn(handle, name)
        if (address == 0L) {
            throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.SYMBOL_RESOLUTION,
                "Unable to resolve HarfBuzz symbol: $name",
                cause = null,
            )
        }
        return address
    }

    val blobCreate: Long = symbol("hb_blob_create")
    val blobDestroy: Long = symbol("hb_blob_destroy")
    val faceCreate: Long = symbol("hb_face_create")
    val faceDestroy: Long = symbol("hb_face_destroy")
    val faceGetUpem: Long = symbol("hb_face_get_upem")
    val faceMakeImmutable: Long = symbol("hb_face_make_immutable")
    val fontCreate: Long = symbol("hb_font_create")
    val fontDestroy: Long = symbol("hb_font_destroy")
    val fontMakeImmutable: Long = symbol("hb_font_make_immutable")
    val otFontSetFuncs: Long = symbol("hb_ot_font_set_funcs")
    val fontSetScale: Long = symbol("hb_font_set_scale")
    val bufferCreate: Long = symbol("hb_buffer_create")
    val bufferDestroy: Long = symbol("hb_buffer_destroy")
    val bufferSetDirection: Long = symbol("hb_buffer_set_direction")
    val bufferSetScript: Long = symbol("hb_buffer_set_script")
    val bufferSetLanguage: Long = symbol("hb_buffer_set_language")
    val bufferSetClusterLevel: Long = symbol("hb_buffer_set_cluster_level")
    val bufferSetFlags: Long = symbol("hb_buffer_set_flags")
    val bufferAddUtf32: Long = symbol("hb_buffer_add_utf32")
    val languageFromString: Long = symbol("hb_language_from_string")
    val languageToString: Long = symbol("hb_language_to_string")
    val scriptFromString: Long = symbol("hb_script_from_string")
    val shapeFull: Long = symbol("hb_shape_full")
    val bufferGetLength: Long = symbol("hb_buffer_get_length")
    val bufferGetGlyphInfos: Long = symbol("hb_buffer_get_glyph_infos")
    val bufferGetGlyphPositions: Long = symbol("hb_buffer_get_glyph_positions")
    val glyphInfoGetGlyphFlags: Long = symbol("hb_glyph_info_get_glyph_flags")
    val fontGetGlyphHorizontalAdvance: Long = symbol("hb_font_get_glyph_h_advance")
    val ligatureCarets: Long = symbol("hb_ot_layout_get_ligature_carets")
    val versionStringFn: Long = symbol("hb_version_string")

    /** The version string reported by `hb_version_string`. */
    fun versionString(): String = memoryScope { scope ->
        val out = scope.allocateBuffer(OUT_BYTES)
        NativeEngine.callGeneric(versionStringFn, 0, "p:", 0L, out.handler.rawValue)
        readCString(out.readLong(), MAX_VERSION_BYTES)
    }

    fun createBlob(data: Long, length: Int, mode: Int, userData: Long, destroy: Long): Long =
        memoryScope { scope ->
            val arguments = HarfBuzzCall(scope)
                .pointer(data)
                .int(length)
                .int(mode)
                .pointer(userData)
                .pointer(destroy)
            val out = scope.allocateBuffer(OUT_BYTES)
            NativeEngine.callGeneric(blobCreate, 5, "p:p,u32,i32,p,p", arguments.address, out.handler.rawValue)
            out.readLong()
        }

    fun setScale(font: Long, x: Int, y: Int) {
        memoryScope { scope ->
            val arguments = HarfBuzzCall(scope).pointer(font).int(x).int(y)
            NativeEngine.callGeneric(fontSetScale, 3, "v:p,i32,i32", arguments.address, 0L)
        }
    }

    fun createBuffer(): Long = memoryScope { scope ->
        val out = scope.allocateBuffer(OUT_BYTES)
        NativeEngine.callGeneric(bufferCreate, 0, "p:", 0L, out.handler.rawValue)
        out.readLong()
    }

    fun addUtf32(buffer: Long, codePoints: IntArray, itemOffset: Int, itemLength: Int) {
        memoryScope { scope ->
            val text = scope.allocateBuffer(
                if (codePoints.isEmpty()) INT_BYTES.toULong() else (codePoints.size.toLong() * INT_BYTES).toULong(),
            )
            text.writeInts(codePoints)
            val arguments = HarfBuzzCall(scope)
                .pointer(buffer)
                .pointer(text.handler.rawValue)
                .int(codePoints.size)
                .int(itemOffset)
                .int(itemLength)
            NativeEngine.callGeneric(bufferAddUtf32, 5, "v:p,p,i32,u32,i32", arguments.address, 0L)
        }
    }

    fun shape(font: Long, buffer: Long, features: List<HarfBuzzFeature>): Int = memoryScope { scope ->
        val featuresAddress = if (features.isEmpty()) {
            0L
        } else {
            val segment = scope.allocateBuffer((FEATURE_BYTES * features.size).toULong())
            features.forEachIndexed { index, feature ->
                val offset = index.toLong() * FEATURE_BYTES
                segment.writeInt(feature.tag.rawValue(), offset.toULong())
                segment.writeInt(feature.value, (offset + 4).toULong())
                segment.writeInt(feature.start, (offset + 8).toULong())
                segment.writeInt(feature.end, (offset + 12).toULong())
            }
            segment.handler.rawValue
        }
        val shapers = scope.allocateBuffer((2L * POINTER_BYTES).toULong())
        val ot = scope.allocateFrom("ot")
        shapers.writeLong(ot.handler.rawValue, 0u)
        shapers.writeLong(0L, POINTER_BYTES.toULong())
        val arguments = HarfBuzzCall(scope)
            .pointer(font)
            .pointer(buffer)
            .pointer(featuresAddress)
            .int(features.size)
            .pointer(shapers.handler.rawValue)
        val out = scope.allocateBuffer(OUT_BYTES)
        NativeEngine.callGeneric(shapeFull, 5, "i32:p,p,p,u32,p", arguments.address, out.handler.rawValue)
        out.readInt()
    }

    fun glyphInfos(buffer: Long): List<HarfBuzzGlyphInfo> {
        val count = NativeEngine.callI1P(bufferGetLength, buffer).toInt()
        if (count == 0) return emptyList()
        val pointer = requireNativePointer(
            NativeEngine.callP2PP(bufferGetGlyphInfos, buffer, 0L),
            "glyph info storage",
        )
        val storage = MemoryBuffer(NativeAddress(pointer), (count.toLong() * GLYPH_INFO_BYTES).toULong())
        return List(count) { index ->
            val offset = index.toLong() * GLYPH_INFO_BYTES
            val flags = NativeEngine.callI1P(glyphInfoGetGlyphFlags, pointer + offset).toInt()
            HarfBuzzGlyphInfo(
                glyphId = storage.readInt(offset.toULong()),
                cluster = storage.readInt((offset + 8).toULong()),
                flags = HarfBuzzGlyphFlags(
                    unsafeToBreak = flags and HB_GLYPH_FLAG_UNSAFE_TO_BREAK != 0,
                    unsafeToConcat = flags and HB_GLYPH_FLAG_UNSAFE_TO_CONCAT != 0,
                ),
            )
        }
    }

    fun glyphPositions(buffer: Long): List<HarfBuzzGlyphPosition> {
        val count = NativeEngine.callI1P(bufferGetLength, buffer).toInt()
        if (count == 0) return emptyList()
        val pointer = requireNativePointer(
            NativeEngine.callP2PP(bufferGetGlyphPositions, buffer, 0L),
            "glyph position storage",
        )
        val storage = MemoryBuffer(NativeAddress(pointer), (count.toLong() * GLYPH_POSITION_BYTES).toULong())
        return List(count) { index ->
            val offset = index.toLong() * GLYPH_POSITION_BYTES
            HarfBuzzGlyphPosition(
                xAdvance = storage.readInt(offset.toULong()),
                yAdvance = storage.readInt((offset + 4).toULong()),
                xOffset = storage.readInt((offset + 8).toULong()),
                yOffset = storage.readInt((offset + 12).toULong()),
            )
        }
    }

    fun getLigatureCarets(
        font: Long,
        direction: Int,
        glyphId: Int,
        offset: Int,
        maxCount: Int,
    ): HarfBuzzLigatureCarets = memoryScope { scope ->
        require(maxCount >= 0) { "The HarfBuzz ligature caret count must not be negative: $maxCount" }
        val count = scope.allocateBuffer(INT_BYTES.toULong())
        count.writeInt(maxCount)
        val positionsBytes = if (maxCount <= 0) INT_BYTES else maxCount.toLong() * INT_BYTES
        val positions = scope.allocateBuffer(positionsBytes.toULong())
        val arguments = HarfBuzzCall(scope)
            .pointer(font)
            .int(direction)
            .int(glyphId)
            .int(offset)
            .pointer(count.handler.rawValue)
            .pointer(positions.handler.rawValue)
        val out = scope.allocateBuffer(OUT_BYTES)
        NativeEngine.callGeneric(
            ligatureCarets,
            6,
            "u32:p,i32,u32,u32,p,p",
            arguments.address,
            out.handler.rawValue,
        )
        val totalCount = out.readInt()
        val copiedCount = count.readInt().coerceIn(0, maxCount)
        HarfBuzzLigatureCarets(
            totalCount = totalCount,
            copiedCount = copiedCount,
            positions = IntArray(copiedCount) { index -> positions.readInt((index.toLong() * INT_BYTES).toULong()) },
        )
    }
}

/**
 * Builds the packed argument buffer for a [NativeEngine.callGeneric] invocation.
 *
 * The layout mirrors the engine's reader: pointers occupy eight-byte aligned slots (the JNI carrier
 * is always 64-bit wide) and 32-bit scalars occupy four-byte aligned slots, in declaration order.
 */
private class HarfBuzzCall(private val allocator: MemoryAllocator) {
    private val arguments: MemoryBuffer = allocator.allocateBuffer(MAX_ARGUMENT_BYTES.toULong())
    private var cursor: Long = 0L

    fun pointer(value: Long): HarfBuzzCall = apply {
        cursor = aligned(cursor, POINTER_ALIGNMENT)
        arguments.writeLong(value, cursor.toULong())
        cursor += POINTER_BYTES
        ensureWithinCapacity()
    }

    fun int(value: Int): HarfBuzzCall = apply {
        cursor = aligned(cursor, INT_ALIGNMENT)
        arguments.writeInt(value, cursor.toULong())
        cursor += INT_BYTES
        ensureWithinCapacity()
    }

    private fun ensureWithinCapacity() {
        check(cursor <= MAX_ARGUMENT_BYTES) {
            "HarfBuzz generic-call argument buffer overflow: $cursor exceeds $MAX_ARGUMENT_BYTES bytes."
        }
    }

    val address: Long get() = arguments.handler.rawValue
}

/** Maps a portable direction to the HarfBuzz `hb_direction_t` constant. */
private fun HarfBuzzDirection.toNativeDirection(): Int = when (this) {
    HarfBuzzDirection.LEFT_TO_RIGHT -> HB_DIRECTION_LTR
    HarfBuzzDirection.RIGHT_TO_LEFT -> HB_DIRECTION_RTL
    HarfBuzzDirection.TOP_TO_BOTTOM -> HB_DIRECTION_TTB
}

/** Returns a non-null native [pointer] unchanged, or throws a [HarfBuzzBindingException]. */
private fun requireNativePointer(pointer: Long, label: String): Long =
    if (pointer == 0L) {
        throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.NATIVE_OPERATION,
            "HarfBuzz returned no native $label.",
            cause = null,
        )
    } else {
        pointer
    }

/**
 * Returns a non-null native [address] unchanged, or throws a [HarfBuzzBindingException].
 */
private fun requireNativeHandle(address: Long, label: String): Long =
    if (address == 0L) {
        throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.NATIVE_OPERATION,
            "HarfBuzz could not create a native $label.",
            cause = null,
        )
    } else {
        address
    }

/** Reads a NUL-terminated UTF-8 string from [address], bounded to [maxBytes]. */
private fun readCString(address: Long, maxBytes: Int): String {
    if (address == 0L) {
        throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.NATIVE_OPERATION,
            "HarfBuzz returned a null string pointer.",
            cause = null,
        )
    }
    val buffer = MemoryBuffer(NativeAddress(address), maxBytes.toULong())
    val bytes = ByteArray(maxBytes)
    var length = 0
    while (length < maxBytes) {
        val value = buffer.readByte(length.toULong())
        if (value == 0.toByte()) break
        bytes[length] = value
        length += 1
    }
    return bytes.decodeToString(0, length)
}

/**
 * Decodes the four ASCII characters HarfBuzz packs into an `hb_script_t` tag.
 *
 * HarfBuzz stores the ISO 15924 tag big-endian, the same order [HarfBuzzTag.rawValue] produces.
 */
private fun canonicalScriptTag(script: Int): String = buildString(4) {
    append(((script ushr 24) and 0xff).toChar())
    append(((script ushr 16) and 0xff).toChar())
    append(((script ushr 8) and 0xff).toChar())
    append((script and 0xff).toChar())
}

private fun aligned(offset: Long, alignment: Long): Long = (offset + alignment - 1) and (alignment - 1).inv()

private const val HB_MEMORY_MODE_READONLY: Int = 1
/** `HB_SCRIPT_INVALID`, returned by HarfBuzz when a script tag cannot be parsed. */
private const val HB_SCRIPT_INVALID: Int = 0
private const val HB_DIRECTION_LTR: Int = 4
private const val HB_DIRECTION_RTL: Int = 5
private const val HB_DIRECTION_TTB: Int = 6
private const val HB_BUFFER_FLAG_BOT: Int = 0x00000001
private const val HB_BUFFER_FLAG_EOT: Int = 0x00000002
private const val HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT: Int = 0x00000040
private const val HB_GLYPH_FLAG_UNSAFE_TO_BREAK: Int = 0x00000001
private const val HB_GLYPH_FLAG_UNSAFE_TO_CONCAT: Int = 0x00000002
private const val INT_BYTES: Long = 4L
private const val POINTER_BYTES: Long = 8L
private const val INT_ALIGNMENT: Long = 4L
private const val POINTER_ALIGNMENT: Long = 8L
private const val FEATURE_BYTES: Long = 16L
private const val GLYPH_INFO_BYTES: Long = 20L
private const val GLYPH_POSITION_BYTES: Long = 20L
private const val OUT_BYTES: ULong = 8uL

/** Upper bound, in bytes, for the NUL-terminated `hb_version_string` result buffer. */
private const val MAX_VERSION_BYTES: Int = 32
/** Upper bound, in bytes, for the NUL-terminated `hb_language_to_string` result buffer. */
private const val MAX_LANGUAGE_BYTES: Int = 256
/** Upper bound, in bytes, for a packed generic-call argument buffer. */
private const val MAX_ARGUMENT_BYTES: Int = 64
