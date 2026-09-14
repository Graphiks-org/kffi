package org.graphiks.kffi.coretext

import java.lang.foreign.MemorySegment
import org.graphiks.kffi.MemoryAllocator
import org.graphiks.kffi.MemoryBuffer
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.apple.AppleNativeSymbols
import org.graphiks.kffi.engine.JvmDowncallEngine
import org.graphiks.kffi.engine.JvmDowncallEngine.AbiType
import org.graphiks.kffi.engine.JvmDowncallEngine.FunctionShape

/**
 * Raw CoreFoundation, CoreGraphics and CoreText font operations on macOS arm64/x86_64.
 * Construction explicitly loads native frameworks and may throw AppleBindingException.
 * Nonnull Create results are owned references, released exactly once by the caller.
 * Get inputs are borrowed live references; no call may race with their release.
 * Raw addresses cannot enforce native lifetime or reference-type validity.
 */
public class CoreText {
    private val symbols = frameworks
    private val engine = JvmDowncallEngine
    private val dataCreate = symbols.address("CFDataCreate")
    private val cfRelease = symbols.address("CFRelease")
    private val providerCreate = symbols.address("CGDataProviderCreateWithCFData")
    private val providerRelease = symbols.address("CGDataProviderRelease")
    private val graphicsCreate = symbols.address("CGFontCreateWithDataProvider")
    private val graphicsRelease = symbols.address("CGFontRelease")
    private val fontCreate = symbols.address("CTFontCreateWithGraphicsFont")
    private val getSize = symbols.address("CTFontGetSize")
    private val getUpem = symbols.address("CTFontGetUnitsPerEm")
    private val getGlyphCount = symbols.address("CTFontGetGlyphCount")
    private val getMatrix = symbols.address("CTFontGetMatrix")

    init {
        engine.registerStructLayout(
            matrixName, 48, 8,
            listOf("a", "b", "c", "d", "tx", "ty").mapIndexed { index, name ->
                JvmDowncallEngine.StructField(name, JvmDowncallEngine.FieldKind.FLOAT64, index * 8L)
            },
        )
    }

    /**
     * Copies [length] bytes from a borrowed readable buffer into an owned CFData.
     * The buffer must remain valid during this call; it may close after return.
     * Length must be nonnegative and the pointer valid for that length. Zero denotes failure.
     */
    public fun createData(bytes: NativeAddress, length: Long): NativeAddress = pointer(
        engine.callGeneric(dataCreate,
            FunctionShape(AbiType.Pointer, listOf(AbiType.Pointer, AbiType.Pointer, AbiType.I64)),
            0L, bytes.rawValue, length),
    )

    /** Creates an owned provider retaining the supplied live CFData; zero denotes failure. */
    public fun createProvider(data: NativeAddress): NativeAddress =
        NativeAddress(engine.callP1P(providerCreate, data.rawValue))

    /** Creates an owned CGFont from a borrowed live provider; zero denotes failure. */
    public fun createGraphicsFont(provider: NativeAddress): NativeAddress =
        NativeAddress(engine.callP1P(graphicsCreate, provider.rawValue))

    /**
     * Creates an owned CTFont from a borrowed live CGFont at the native numeric [size].
     * Uses null matrix and descriptor. Zero denotes failure; release success with [releaseCF].
     */
    public fun createFont(graphicsFont: NativeAddress, size: Double): NativeAddress = pointer(
        engine.callGeneric(fontCreate,
            FunctionShape(AbiType.Pointer, listOf(AbiType.Pointer, AbiType.F64, AbiType.Pointer, AbiType.Pointer)),
            graphicsFont.rawValue, size, 0L, 0L),
    )

    /** Releases one owned, nonnull CF reference (including CTFont); never release it twice. */
    public fun releaseCF(reference: NativeAddress): Unit = engine.callV1P(cfRelease, reference.rawValue)

    /** Releases one owned, nonnull provider reference; never release it twice. */
    public fun releaseProvider(provider: NativeAddress): Unit = engine.callV1P(providerRelease, provider.rawValue)

    /** Releases one owned, nonnull CGFont reference; never release it twice. */
    public fun releaseGraphicsFont(graphicsFont: NativeAddress): Unit = engine.callV1P(graphicsRelease, graphicsFont.rawValue)

    /** Returns the native numeric size of a borrowed, nonnull live CTFont. */
    public fun fontSize(font: NativeAddress): Double = engine.callD1P(getSize, font.rawValue)

    /** Returns the native unsigned 32-bit units/em of a borrowed, nonnull live CTFont. */
    public fun unitsPerEm(font: NativeAddress): UInt = (engine.callGeneric(
        getUpem, FunctionShape(AbiType.I32, listOf(AbiType.Pointer)), font.rawValue,
    ) as Int).toUInt()

    /** Returns the signed CFIndex glyph count of a borrowed, nonnull live CTFont. */
    public fun glyphCount(font: NativeAddress): Long = engine.callL1P(getGlyphCount, font.rawValue)

    /**
     * Reads a borrowed, nonnull live CTFont matrix into [allocator], then copies its six doubles.
     * The allocator must be open on its owning thread during the call. The detached result
     * survives allocator closure; the 48-byte native temporary remains allocator-owned.
     */
    public fun fontMatrix(font: NativeAddress, allocator: MemoryAllocator): CGAffineTransform {
        val address = engine.invokeStructReturnAfterPointer(getMatrix, allocator, matrixName, font.rawValue)
        val buffer = MemoryBuffer(address, 48uL)
        return CGAffineTransform(buffer.readDouble(), buffer.readDouble(8u), buffer.readDouble(16u),
            buffer.readDouble(24u), buffer.readDouble(32u), buffer.readDouble(40u))
    }

    private fun pointer(result: Any?): NativeAddress = NativeAddress((result as MemorySegment).address())

    private companion object {
        const val matrixName = "org.graphiks.kffi.coretext.CGAffineTransform"
        val frameworks by lazy {
            AppleNativeSymbols(listOf(
                "/System/Library/Frameworks/CoreFoundation.framework/CoreFoundation",
                "/System/Library/Frameworks/CoreGraphics.framework/CoreGraphics",
                "/System/Library/Frameworks/CoreText.framework/CoreText",
            ))
        }
    }
}
