@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

private object kextract_runtime {
    val C_BOOL: ValueLayout = ValueLayout.JAVA_BOOLEAN
    val C_CHAR: ValueLayout = ValueLayout.JAVA_BYTE
    val C_SHORT: ValueLayout = ValueLayout.JAVA_SHORT
    val C_INT: ValueLayout = ValueLayout.JAVA_INT
    val C_LONG: ValueLayout = ValueLayout.JAVA_LONG
    val C_LONG_LONG: ValueLayout = ValueLayout.JAVA_LONG
    val C_FLOAT: ValueLayout = ValueLayout.JAVA_FLOAT
    val C_DOUBLE: ValueLayout = ValueLayout.JAVA_DOUBLE
    val C_POINTER: ValueLayout = ValueLayout.ADDRESS
}

internal val LOOKUP: SymbolLookup = run {
    var lu: SymbolLookup = SymbolLookup.loaderLookup()
    lu = SymbolLookup.libraryLookup("/System/Library/Frameworks/CoreGraphics.framework/CoreGraphics", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("/System/Library/Frameworks/CoreHaptics.framework/CoreHaptics", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("/System/Library/Frameworks/CoreMedia.framework/CoreMedia", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("/System/Library/Frameworks/CoreVideo.framework/CoreVideo", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("/System/Library/Frameworks/GameController.framework/GameController", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("/System/Library/Frameworks/IOKit.framework/IOKit", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("/System/Library/Frameworks/IOSurface.framework/IOSurface", Arena.global()).or(lu)
    lu
}
