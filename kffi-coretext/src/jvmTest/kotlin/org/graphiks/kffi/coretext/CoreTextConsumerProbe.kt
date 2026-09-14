package org.graphiks.kffi.coretext

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import org.graphiks.kffi.NativeAddress

/** Independent native consumer; descriptors and arenas belong only to the test. */
internal object CoreTextConsumerProbe {
    fun horizontalAdvance(font: NativeAddress, glyph: Int): Double = Arena.ofConfined().use { arena ->
        val symbols = SymbolLookup.libraryLookup("/System/Library/Frameworks/CoreText.framework/CoreText", arena)
        val input = arena.allocate(ValueLayout.JAVA_SHORT)
        input.set(ValueLayout.JAVA_SHORT, 0, glyph.toShort())
        val output = arena.allocate(16, 8)
        val call = Linker.nativeLinker().downcallHandle(
            symbols.find("CTFontGetAdvancesForGlyphs").orElseThrow(),
            FunctionDescriptor.of(
                ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG,
            ),
        )
        call.invokeWithArguments(MemorySegment.ofAddress(font.rawValue), 1, input, output, 1L)
        output.get(ValueLayout.JAVA_DOUBLE, 0)
    }
}
