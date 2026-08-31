@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : GCKeyCodeComma typedef const GCKeyCode = Long
 */
private val GCKeyCodeComma_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeComma_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeComma").orElseThrow().reinterpret(GCKeyCodeComma_LAYOUT.byteSize()) }
private val GCKeyCodeComma_VH: VarHandle by lazy { GCKeyCodeComma_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeComma: Long
    get() = GCKeyCodeComma_VH.get(GCKeyCodeComma_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeComma_VH.set(GCKeyCodeComma_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodePeriod typedef const GCKeyCode = Long
 */
private val GCKeyCodePeriod_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodePeriod_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodePeriod").orElseThrow().reinterpret(GCKeyCodePeriod_LAYOUT.byteSize()) }
private val GCKeyCodePeriod_VH: VarHandle by lazy { GCKeyCodePeriod_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodePeriod: Long
    get() = GCKeyCodePeriod_VH.get(GCKeyCodePeriod_SEGMENT, 0L) as Long
    set(value) = GCKeyCodePeriod_VH.set(GCKeyCodePeriod_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeSlash typedef const GCKeyCode = Long
 */
private val GCKeyCodeSlash_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeSlash_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeSlash").orElseThrow().reinterpret(GCKeyCodeSlash_LAYOUT.byteSize()) }
private val GCKeyCodeSlash_VH: VarHandle by lazy { GCKeyCodeSlash_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeSlash: Long
    get() = GCKeyCodeSlash_VH.get(GCKeyCodeSlash_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeSlash_VH.set(GCKeyCodeSlash_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeCapsLock typedef const GCKeyCode = Long
 */
private val GCKeyCodeCapsLock_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeCapsLock_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeCapsLock").orElseThrow().reinterpret(GCKeyCodeCapsLock_LAYOUT.byteSize()) }
private val GCKeyCodeCapsLock_VH: VarHandle by lazy { GCKeyCodeCapsLock_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeCapsLock: Long
    get() = GCKeyCodeCapsLock_VH.get(GCKeyCodeCapsLock_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeCapsLock_VH.set(GCKeyCodeCapsLock_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF1 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF1_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF1_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF1").orElseThrow().reinterpret(GCKeyCodeF1_LAYOUT.byteSize()) }
private val GCKeyCodeF1_VH: VarHandle by lazy { GCKeyCodeF1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF1: Long
    get() = GCKeyCodeF1_VH.get(GCKeyCodeF1_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF1_VH.set(GCKeyCodeF1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF2 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF2_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF2_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF2").orElseThrow().reinterpret(GCKeyCodeF2_LAYOUT.byteSize()) }
private val GCKeyCodeF2_VH: VarHandle by lazy { GCKeyCodeF2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF2: Long
    get() = GCKeyCodeF2_VH.get(GCKeyCodeF2_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF2_VH.set(GCKeyCodeF2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF3 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF3_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF3_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF3").orElseThrow().reinterpret(GCKeyCodeF3_LAYOUT.byteSize()) }
private val GCKeyCodeF3_VH: VarHandle by lazy { GCKeyCodeF3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF3: Long
    get() = GCKeyCodeF3_VH.get(GCKeyCodeF3_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF3_VH.set(GCKeyCodeF3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF4 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF4_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF4_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF4").orElseThrow().reinterpret(GCKeyCodeF4_LAYOUT.byteSize()) }
private val GCKeyCodeF4_VH: VarHandle by lazy { GCKeyCodeF4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF4: Long
    get() = GCKeyCodeF4_VH.get(GCKeyCodeF4_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF4_VH.set(GCKeyCodeF4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF5 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF5_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF5_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF5").orElseThrow().reinterpret(GCKeyCodeF5_LAYOUT.byteSize()) }
private val GCKeyCodeF5_VH: VarHandle by lazy { GCKeyCodeF5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF5: Long
    get() = GCKeyCodeF5_VH.get(GCKeyCodeF5_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF5_VH.set(GCKeyCodeF5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF6 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF6_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF6_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF6").orElseThrow().reinterpret(GCKeyCodeF6_LAYOUT.byteSize()) }
private val GCKeyCodeF6_VH: VarHandle by lazy { GCKeyCodeF6_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF6: Long
    get() = GCKeyCodeF6_VH.get(GCKeyCodeF6_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF6_VH.set(GCKeyCodeF6_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF7 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF7_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF7_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF7").orElseThrow().reinterpret(GCKeyCodeF7_LAYOUT.byteSize()) }
private val GCKeyCodeF7_VH: VarHandle by lazy { GCKeyCodeF7_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF7: Long
    get() = GCKeyCodeF7_VH.get(GCKeyCodeF7_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF7_VH.set(GCKeyCodeF7_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF8 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF8_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF8").orElseThrow().reinterpret(GCKeyCodeF8_LAYOUT.byteSize()) }
private val GCKeyCodeF8_VH: VarHandle by lazy { GCKeyCodeF8_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF8: Long
    get() = GCKeyCodeF8_VH.get(GCKeyCodeF8_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF8_VH.set(GCKeyCodeF8_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF9 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF9_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF9_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF9").orElseThrow().reinterpret(GCKeyCodeF9_LAYOUT.byteSize()) }
private val GCKeyCodeF9_VH: VarHandle by lazy { GCKeyCodeF9_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF9: Long
    get() = GCKeyCodeF9_VH.get(GCKeyCodeF9_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF9_VH.set(GCKeyCodeF9_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF10 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF10_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF10_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF10").orElseThrow().reinterpret(GCKeyCodeF10_LAYOUT.byteSize()) }
private val GCKeyCodeF10_VH: VarHandle by lazy { GCKeyCodeF10_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF10: Long
    get() = GCKeyCodeF10_VH.get(GCKeyCodeF10_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF10_VH.set(GCKeyCodeF10_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF11 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF11_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF11_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF11").orElseThrow().reinterpret(GCKeyCodeF11_LAYOUT.byteSize()) }
private val GCKeyCodeF11_VH: VarHandle by lazy { GCKeyCodeF11_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF11: Long
    get() = GCKeyCodeF11_VH.get(GCKeyCodeF11_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF11_VH.set(GCKeyCodeF11_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF12 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF12_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF12_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF12").orElseThrow().reinterpret(GCKeyCodeF12_LAYOUT.byteSize()) }
private val GCKeyCodeF12_VH: VarHandle by lazy { GCKeyCodeF12_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF12: Long
    get() = GCKeyCodeF12_VH.get(GCKeyCodeF12_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF12_VH.set(GCKeyCodeF12_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF13 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF13_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF13_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF13").orElseThrow().reinterpret(GCKeyCodeF13_LAYOUT.byteSize()) }
private val GCKeyCodeF13_VH: VarHandle by lazy { GCKeyCodeF13_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF13: Long
    get() = GCKeyCodeF13_VH.get(GCKeyCodeF13_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF13_VH.set(GCKeyCodeF13_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF14 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF14_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF14_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF14").orElseThrow().reinterpret(GCKeyCodeF14_LAYOUT.byteSize()) }
private val GCKeyCodeF14_VH: VarHandle by lazy { GCKeyCodeF14_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF14: Long
    get() = GCKeyCodeF14_VH.get(GCKeyCodeF14_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF14_VH.set(GCKeyCodeF14_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF15 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF15_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF15_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF15").orElseThrow().reinterpret(GCKeyCodeF15_LAYOUT.byteSize()) }
private val GCKeyCodeF15_VH: VarHandle by lazy { GCKeyCodeF15_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF15: Long
    get() = GCKeyCodeF15_VH.get(GCKeyCodeF15_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF15_VH.set(GCKeyCodeF15_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF16 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF16_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF16_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF16").orElseThrow().reinterpret(GCKeyCodeF16_LAYOUT.byteSize()) }
private val GCKeyCodeF16_VH: VarHandle by lazy { GCKeyCodeF16_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF16: Long
    get() = GCKeyCodeF16_VH.get(GCKeyCodeF16_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF16_VH.set(GCKeyCodeF16_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF17 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF17_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF17_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF17").orElseThrow().reinterpret(GCKeyCodeF17_LAYOUT.byteSize()) }
private val GCKeyCodeF17_VH: VarHandle by lazy { GCKeyCodeF17_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF17: Long
    get() = GCKeyCodeF17_VH.get(GCKeyCodeF17_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF17_VH.set(GCKeyCodeF17_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF18 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF18_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF18_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF18").orElseThrow().reinterpret(GCKeyCodeF18_LAYOUT.byteSize()) }
private val GCKeyCodeF18_VH: VarHandle by lazy { GCKeyCodeF18_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF18: Long
    get() = GCKeyCodeF18_VH.get(GCKeyCodeF18_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF18_VH.set(GCKeyCodeF18_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF19 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF19_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF19_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF19").orElseThrow().reinterpret(GCKeyCodeF19_LAYOUT.byteSize()) }
private val GCKeyCodeF19_VH: VarHandle by lazy { GCKeyCodeF19_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF19: Long
    get() = GCKeyCodeF19_VH.get(GCKeyCodeF19_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF19_VH.set(GCKeyCodeF19_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeF20 typedef const GCKeyCode = Long
 */
private val GCKeyCodeF20_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeF20_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeF20").orElseThrow().reinterpret(GCKeyCodeF20_LAYOUT.byteSize()) }
private val GCKeyCodeF20_VH: VarHandle by lazy { GCKeyCodeF20_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeF20: Long
    get() = GCKeyCodeF20_VH.get(GCKeyCodeF20_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeF20_VH.set(GCKeyCodeF20_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodePrintScreen typedef const GCKeyCode = Long
 */
private val GCKeyCodePrintScreen_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodePrintScreen_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodePrintScreen").orElseThrow().reinterpret(GCKeyCodePrintScreen_LAYOUT.byteSize()) }
private val GCKeyCodePrintScreen_VH: VarHandle by lazy { GCKeyCodePrintScreen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodePrintScreen: Long
    get() = GCKeyCodePrintScreen_VH.get(GCKeyCodePrintScreen_SEGMENT, 0L) as Long
    set(value) = GCKeyCodePrintScreen_VH.set(GCKeyCodePrintScreen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeScrollLock typedef const GCKeyCode = Long
 */
private val GCKeyCodeScrollLock_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeScrollLock_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeScrollLock").orElseThrow().reinterpret(GCKeyCodeScrollLock_LAYOUT.byteSize()) }
private val GCKeyCodeScrollLock_VH: VarHandle by lazy { GCKeyCodeScrollLock_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeScrollLock: Long
    get() = GCKeyCodeScrollLock_VH.get(GCKeyCodeScrollLock_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeScrollLock_VH.set(GCKeyCodeScrollLock_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodePause typedef const GCKeyCode = Long
 */
private val GCKeyCodePause_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodePause_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodePause").orElseThrow().reinterpret(GCKeyCodePause_LAYOUT.byteSize()) }
private val GCKeyCodePause_VH: VarHandle by lazy { GCKeyCodePause_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodePause: Long
    get() = GCKeyCodePause_VH.get(GCKeyCodePause_SEGMENT, 0L) as Long
    set(value) = GCKeyCodePause_VH.set(GCKeyCodePause_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInsert typedef const GCKeyCode = Long
 */
private val GCKeyCodeInsert_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInsert_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInsert").orElseThrow().reinterpret(GCKeyCodeInsert_LAYOUT.byteSize()) }
private val GCKeyCodeInsert_VH: VarHandle by lazy { GCKeyCodeInsert_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInsert: Long
    get() = GCKeyCodeInsert_VH.get(GCKeyCodeInsert_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInsert_VH.set(GCKeyCodeInsert_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeHome typedef const GCKeyCode = Long
 */
private val GCKeyCodeHome_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeHome_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeHome").orElseThrow().reinterpret(GCKeyCodeHome_LAYOUT.byteSize()) }
private val GCKeyCodeHome_VH: VarHandle by lazy { GCKeyCodeHome_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeHome: Long
    get() = GCKeyCodeHome_VH.get(GCKeyCodeHome_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeHome_VH.set(GCKeyCodeHome_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodePageUp typedef const GCKeyCode = Long
 */
private val GCKeyCodePageUp_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodePageUp_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodePageUp").orElseThrow().reinterpret(GCKeyCodePageUp_LAYOUT.byteSize()) }
private val GCKeyCodePageUp_VH: VarHandle by lazy { GCKeyCodePageUp_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodePageUp: Long
    get() = GCKeyCodePageUp_VH.get(GCKeyCodePageUp_SEGMENT, 0L) as Long
    set(value) = GCKeyCodePageUp_VH.set(GCKeyCodePageUp_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeDeleteForward typedef const GCKeyCode = Long
 */
private val GCKeyCodeDeleteForward_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeDeleteForward_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeDeleteForward").orElseThrow().reinterpret(GCKeyCodeDeleteForward_LAYOUT.byteSize()) }
private val GCKeyCodeDeleteForward_VH: VarHandle by lazy { GCKeyCodeDeleteForward_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeDeleteForward: Long
    get() = GCKeyCodeDeleteForward_VH.get(GCKeyCodeDeleteForward_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeDeleteForward_VH.set(GCKeyCodeDeleteForward_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeEnd typedef const GCKeyCode = Long
 */
private val GCKeyCodeEnd_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeEnd_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeEnd").orElseThrow().reinterpret(GCKeyCodeEnd_LAYOUT.byteSize()) }
private val GCKeyCodeEnd_VH: VarHandle by lazy { GCKeyCodeEnd_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeEnd: Long
    get() = GCKeyCodeEnd_VH.get(GCKeyCodeEnd_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeEnd_VH.set(GCKeyCodeEnd_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodePageDown typedef const GCKeyCode = Long
 */
private val GCKeyCodePageDown_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodePageDown_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodePageDown").orElseThrow().reinterpret(GCKeyCodePageDown_LAYOUT.byteSize()) }
private val GCKeyCodePageDown_VH: VarHandle by lazy { GCKeyCodePageDown_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodePageDown: Long
    get() = GCKeyCodePageDown_VH.get(GCKeyCodePageDown_SEGMENT, 0L) as Long
    set(value) = GCKeyCodePageDown_VH.set(GCKeyCodePageDown_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeRightArrow typedef const GCKeyCode = Long
 */
private val GCKeyCodeRightArrow_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeRightArrow_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeRightArrow").orElseThrow().reinterpret(GCKeyCodeRightArrow_LAYOUT.byteSize()) }
private val GCKeyCodeRightArrow_VH: VarHandle by lazy { GCKeyCodeRightArrow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeRightArrow: Long
    get() = GCKeyCodeRightArrow_VH.get(GCKeyCodeRightArrow_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeRightArrow_VH.set(GCKeyCodeRightArrow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLeftArrow typedef const GCKeyCode = Long
 */
private val GCKeyCodeLeftArrow_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLeftArrow_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLeftArrow").orElseThrow().reinterpret(GCKeyCodeLeftArrow_LAYOUT.byteSize()) }
private val GCKeyCodeLeftArrow_VH: VarHandle by lazy { GCKeyCodeLeftArrow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLeftArrow: Long
    get() = GCKeyCodeLeftArrow_VH.get(GCKeyCodeLeftArrow_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLeftArrow_VH.set(GCKeyCodeLeftArrow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeDownArrow typedef const GCKeyCode = Long
 */
private val GCKeyCodeDownArrow_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeDownArrow_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeDownArrow").orElseThrow().reinterpret(GCKeyCodeDownArrow_LAYOUT.byteSize()) }
private val GCKeyCodeDownArrow_VH: VarHandle by lazy { GCKeyCodeDownArrow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeDownArrow: Long
    get() = GCKeyCodeDownArrow_VH.get(GCKeyCodeDownArrow_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeDownArrow_VH.set(GCKeyCodeDownArrow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeUpArrow typedef const GCKeyCode = Long
 */
private val GCKeyCodeUpArrow_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeUpArrow_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeUpArrow").orElseThrow().reinterpret(GCKeyCodeUpArrow_LAYOUT.byteSize()) }
private val GCKeyCodeUpArrow_VH: VarHandle by lazy { GCKeyCodeUpArrow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeUpArrow: Long
    get() = GCKeyCodeUpArrow_VH.get(GCKeyCodeUpArrow_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeUpArrow_VH.set(GCKeyCodeUpArrow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypadNumLock typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypadNumLock_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypadNumLock_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypadNumLock").orElseThrow().reinterpret(GCKeyCodeKeypadNumLock_LAYOUT.byteSize()) }
private val GCKeyCodeKeypadNumLock_VH: VarHandle by lazy { GCKeyCodeKeypadNumLock_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypadNumLock: Long
    get() = GCKeyCodeKeypadNumLock_VH.get(GCKeyCodeKeypadNumLock_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypadNumLock_VH.set(GCKeyCodeKeypadNumLock_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypadSlash typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypadSlash_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypadSlash_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypadSlash").orElseThrow().reinterpret(GCKeyCodeKeypadSlash_LAYOUT.byteSize()) }
private val GCKeyCodeKeypadSlash_VH: VarHandle by lazy { GCKeyCodeKeypadSlash_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypadSlash: Long
    get() = GCKeyCodeKeypadSlash_VH.get(GCKeyCodeKeypadSlash_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypadSlash_VH.set(GCKeyCodeKeypadSlash_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypadAsterisk typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypadAsterisk_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypadAsterisk_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypadAsterisk").orElseThrow().reinterpret(GCKeyCodeKeypadAsterisk_LAYOUT.byteSize()) }
private val GCKeyCodeKeypadAsterisk_VH: VarHandle by lazy { GCKeyCodeKeypadAsterisk_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypadAsterisk: Long
    get() = GCKeyCodeKeypadAsterisk_VH.get(GCKeyCodeKeypadAsterisk_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypadAsterisk_VH.set(GCKeyCodeKeypadAsterisk_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypadHyphen typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypadHyphen_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypadHyphen_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypadHyphen").orElseThrow().reinterpret(GCKeyCodeKeypadHyphen_LAYOUT.byteSize()) }
private val GCKeyCodeKeypadHyphen_VH: VarHandle by lazy { GCKeyCodeKeypadHyphen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypadHyphen: Long
    get() = GCKeyCodeKeypadHyphen_VH.get(GCKeyCodeKeypadHyphen_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypadHyphen_VH.set(GCKeyCodeKeypadHyphen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypadPlus typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypadPlus_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypadPlus_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypadPlus").orElseThrow().reinterpret(GCKeyCodeKeypadPlus_LAYOUT.byteSize()) }
private val GCKeyCodeKeypadPlus_VH: VarHandle by lazy { GCKeyCodeKeypadPlus_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypadPlus: Long
    get() = GCKeyCodeKeypadPlus_VH.get(GCKeyCodeKeypadPlus_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypadPlus_VH.set(GCKeyCodeKeypadPlus_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypadEnter typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypadEnter_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypadEnter_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypadEnter").orElseThrow().reinterpret(GCKeyCodeKeypadEnter_LAYOUT.byteSize()) }
private val GCKeyCodeKeypadEnter_VH: VarHandle by lazy { GCKeyCodeKeypadEnter_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypadEnter: Long
    get() = GCKeyCodeKeypadEnter_VH.get(GCKeyCodeKeypadEnter_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypadEnter_VH.set(GCKeyCodeKeypadEnter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad1 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad1_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad1_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad1").orElseThrow().reinterpret(GCKeyCodeKeypad1_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad1_VH: VarHandle by lazy { GCKeyCodeKeypad1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad1: Long
    get() = GCKeyCodeKeypad1_VH.get(GCKeyCodeKeypad1_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad1_VH.set(GCKeyCodeKeypad1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad2 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad2_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad2_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad2").orElseThrow().reinterpret(GCKeyCodeKeypad2_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad2_VH: VarHandle by lazy { GCKeyCodeKeypad2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad2: Long
    get() = GCKeyCodeKeypad2_VH.get(GCKeyCodeKeypad2_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad2_VH.set(GCKeyCodeKeypad2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad3 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad3_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad3_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad3").orElseThrow().reinterpret(GCKeyCodeKeypad3_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad3_VH: VarHandle by lazy { GCKeyCodeKeypad3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad3: Long
    get() = GCKeyCodeKeypad3_VH.get(GCKeyCodeKeypad3_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad3_VH.set(GCKeyCodeKeypad3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad4 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad4_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad4_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad4").orElseThrow().reinterpret(GCKeyCodeKeypad4_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad4_VH: VarHandle by lazy { GCKeyCodeKeypad4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad4: Long
    get() = GCKeyCodeKeypad4_VH.get(GCKeyCodeKeypad4_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad4_VH.set(GCKeyCodeKeypad4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad5 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad5_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad5_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad5").orElseThrow().reinterpret(GCKeyCodeKeypad5_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad5_VH: VarHandle by lazy { GCKeyCodeKeypad5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad5: Long
    get() = GCKeyCodeKeypad5_VH.get(GCKeyCodeKeypad5_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad5_VH.set(GCKeyCodeKeypad5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad6 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad6_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad6_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad6").orElseThrow().reinterpret(GCKeyCodeKeypad6_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad6_VH: VarHandle by lazy { GCKeyCodeKeypad6_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad6: Long
    get() = GCKeyCodeKeypad6_VH.get(GCKeyCodeKeypad6_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad6_VH.set(GCKeyCodeKeypad6_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad7 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad7_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad7_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad7").orElseThrow().reinterpret(GCKeyCodeKeypad7_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad7_VH: VarHandle by lazy { GCKeyCodeKeypad7_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad7: Long
    get() = GCKeyCodeKeypad7_VH.get(GCKeyCodeKeypad7_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad7_VH.set(GCKeyCodeKeypad7_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad8 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad8_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad8").orElseThrow().reinterpret(GCKeyCodeKeypad8_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad8_VH: VarHandle by lazy { GCKeyCodeKeypad8_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad8: Long
    get() = GCKeyCodeKeypad8_VH.get(GCKeyCodeKeypad8_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad8_VH.set(GCKeyCodeKeypad8_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad9 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad9_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad9_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad9").orElseThrow().reinterpret(GCKeyCodeKeypad9_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad9_VH: VarHandle by lazy { GCKeyCodeKeypad9_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad9: Long
    get() = GCKeyCodeKeypad9_VH.get(GCKeyCodeKeypad9_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad9_VH.set(GCKeyCodeKeypad9_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypad0 typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypad0_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypad0_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypad0").orElseThrow().reinterpret(GCKeyCodeKeypad0_LAYOUT.byteSize()) }
private val GCKeyCodeKeypad0_VH: VarHandle by lazy { GCKeyCodeKeypad0_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypad0: Long
    get() = GCKeyCodeKeypad0_VH.get(GCKeyCodeKeypad0_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypad0_VH.set(GCKeyCodeKeypad0_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypadPeriod typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypadPeriod_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypadPeriod_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypadPeriod").orElseThrow().reinterpret(GCKeyCodeKeypadPeriod_LAYOUT.byteSize()) }
private val GCKeyCodeKeypadPeriod_VH: VarHandle by lazy { GCKeyCodeKeypadPeriod_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypadPeriod: Long
    get() = GCKeyCodeKeypadPeriod_VH.get(GCKeyCodeKeypadPeriod_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypadPeriod_VH.set(GCKeyCodeKeypadPeriod_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeKeypadEqualSign typedef const GCKeyCode = Long
 */
private val GCKeyCodeKeypadEqualSign_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeKeypadEqualSign_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeKeypadEqualSign").orElseThrow().reinterpret(GCKeyCodeKeypadEqualSign_LAYOUT.byteSize()) }
private val GCKeyCodeKeypadEqualSign_VH: VarHandle by lazy { GCKeyCodeKeypadEqualSign_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeKeypadEqualSign: Long
    get() = GCKeyCodeKeypadEqualSign_VH.get(GCKeyCodeKeypadEqualSign_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeKeypadEqualSign_VH.set(GCKeyCodeKeypadEqualSign_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeNonUSBackslash typedef const GCKeyCode = Long
 */
private val GCKeyCodeNonUSBackslash_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeNonUSBackslash_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeNonUSBackslash").orElseThrow().reinterpret(GCKeyCodeNonUSBackslash_LAYOUT.byteSize()) }
private val GCKeyCodeNonUSBackslash_VH: VarHandle by lazy { GCKeyCodeNonUSBackslash_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeNonUSBackslash: Long
    get() = GCKeyCodeNonUSBackslash_VH.get(GCKeyCodeNonUSBackslash_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeNonUSBackslash_VH.set(GCKeyCodeNonUSBackslash_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeApplication typedef const GCKeyCode = Long
 */
private val GCKeyCodeApplication_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeApplication_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeApplication").orElseThrow().reinterpret(GCKeyCodeApplication_LAYOUT.byteSize()) }
private val GCKeyCodeApplication_VH: VarHandle by lazy { GCKeyCodeApplication_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeApplication: Long
    get() = GCKeyCodeApplication_VH.get(GCKeyCodeApplication_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeApplication_VH.set(GCKeyCodeApplication_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodePower typedef const GCKeyCode = Long
 */
private val GCKeyCodePower_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodePower_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodePower").orElseThrow().reinterpret(GCKeyCodePower_LAYOUT.byteSize()) }
private val GCKeyCodePower_VH: VarHandle by lazy { GCKeyCodePower_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodePower: Long
    get() = GCKeyCodePower_VH.get(GCKeyCodePower_SEGMENT, 0L) as Long
    set(value) = GCKeyCodePower_VH.set(GCKeyCodePower_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational1 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational1_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational1_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational1").orElseThrow().reinterpret(GCKeyCodeInternational1_LAYOUT.byteSize()) }
private val GCKeyCodeInternational1_VH: VarHandle by lazy { GCKeyCodeInternational1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational1: Long
    get() = GCKeyCodeInternational1_VH.get(GCKeyCodeInternational1_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational1_VH.set(GCKeyCodeInternational1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational2 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational2_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational2_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational2").orElseThrow().reinterpret(GCKeyCodeInternational2_LAYOUT.byteSize()) }
private val GCKeyCodeInternational2_VH: VarHandle by lazy { GCKeyCodeInternational2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational2: Long
    get() = GCKeyCodeInternational2_VH.get(GCKeyCodeInternational2_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational2_VH.set(GCKeyCodeInternational2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational3 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational3_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational3_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational3").orElseThrow().reinterpret(GCKeyCodeInternational3_LAYOUT.byteSize()) }
private val GCKeyCodeInternational3_VH: VarHandle by lazy { GCKeyCodeInternational3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational3: Long
    get() = GCKeyCodeInternational3_VH.get(GCKeyCodeInternational3_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational3_VH.set(GCKeyCodeInternational3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational4 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational4_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational4_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational4").orElseThrow().reinterpret(GCKeyCodeInternational4_LAYOUT.byteSize()) }
private val GCKeyCodeInternational4_VH: VarHandle by lazy { GCKeyCodeInternational4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational4: Long
    get() = GCKeyCodeInternational4_VH.get(GCKeyCodeInternational4_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational4_VH.set(GCKeyCodeInternational4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational5 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational5_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational5_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational5").orElseThrow().reinterpret(GCKeyCodeInternational5_LAYOUT.byteSize()) }
private val GCKeyCodeInternational5_VH: VarHandle by lazy { GCKeyCodeInternational5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational5: Long
    get() = GCKeyCodeInternational5_VH.get(GCKeyCodeInternational5_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational5_VH.set(GCKeyCodeInternational5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational6 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational6_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational6_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational6").orElseThrow().reinterpret(GCKeyCodeInternational6_LAYOUT.byteSize()) }
private val GCKeyCodeInternational6_VH: VarHandle by lazy { GCKeyCodeInternational6_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational6: Long
    get() = GCKeyCodeInternational6_VH.get(GCKeyCodeInternational6_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational6_VH.set(GCKeyCodeInternational6_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational7 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational7_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational7_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational7").orElseThrow().reinterpret(GCKeyCodeInternational7_LAYOUT.byteSize()) }
private val GCKeyCodeInternational7_VH: VarHandle by lazy { GCKeyCodeInternational7_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational7: Long
    get() = GCKeyCodeInternational7_VH.get(GCKeyCodeInternational7_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational7_VH.set(GCKeyCodeInternational7_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational8 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational8_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational8").orElseThrow().reinterpret(GCKeyCodeInternational8_LAYOUT.byteSize()) }
private val GCKeyCodeInternational8_VH: VarHandle by lazy { GCKeyCodeInternational8_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational8: Long
    get() = GCKeyCodeInternational8_VH.get(GCKeyCodeInternational8_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational8_VH.set(GCKeyCodeInternational8_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeInternational9 typedef const GCKeyCode = Long
 */
private val GCKeyCodeInternational9_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeInternational9_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeInternational9").orElseThrow().reinterpret(GCKeyCodeInternational9_LAYOUT.byteSize()) }
private val GCKeyCodeInternational9_VH: VarHandle by lazy { GCKeyCodeInternational9_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeInternational9: Long
    get() = GCKeyCodeInternational9_VH.get(GCKeyCodeInternational9_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeInternational9_VH.set(GCKeyCodeInternational9_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG1 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG1_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG1_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG1").orElseThrow().reinterpret(GCKeyCodeLANG1_LAYOUT.byteSize()) }
private val GCKeyCodeLANG1_VH: VarHandle by lazy { GCKeyCodeLANG1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG1: Long
    get() = GCKeyCodeLANG1_VH.get(GCKeyCodeLANG1_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG1_VH.set(GCKeyCodeLANG1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG2 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG2_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG2_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG2").orElseThrow().reinterpret(GCKeyCodeLANG2_LAYOUT.byteSize()) }
private val GCKeyCodeLANG2_VH: VarHandle by lazy { GCKeyCodeLANG2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG2: Long
    get() = GCKeyCodeLANG2_VH.get(GCKeyCodeLANG2_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG2_VH.set(GCKeyCodeLANG2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG3 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG3_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG3_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG3").orElseThrow().reinterpret(GCKeyCodeLANG3_LAYOUT.byteSize()) }
private val GCKeyCodeLANG3_VH: VarHandle by lazy { GCKeyCodeLANG3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG3: Long
    get() = GCKeyCodeLANG3_VH.get(GCKeyCodeLANG3_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG3_VH.set(GCKeyCodeLANG3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG4 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG4_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG4_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG4").orElseThrow().reinterpret(GCKeyCodeLANG4_LAYOUT.byteSize()) }
private val GCKeyCodeLANG4_VH: VarHandle by lazy { GCKeyCodeLANG4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG4: Long
    get() = GCKeyCodeLANG4_VH.get(GCKeyCodeLANG4_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG4_VH.set(GCKeyCodeLANG4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG5 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG5_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG5_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG5").orElseThrow().reinterpret(GCKeyCodeLANG5_LAYOUT.byteSize()) }
private val GCKeyCodeLANG5_VH: VarHandle by lazy { GCKeyCodeLANG5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG5: Long
    get() = GCKeyCodeLANG5_VH.get(GCKeyCodeLANG5_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG5_VH.set(GCKeyCodeLANG5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG6 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG6_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG6_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG6").orElseThrow().reinterpret(GCKeyCodeLANG6_LAYOUT.byteSize()) }
private val GCKeyCodeLANG6_VH: VarHandle by lazy { GCKeyCodeLANG6_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG6: Long
    get() = GCKeyCodeLANG6_VH.get(GCKeyCodeLANG6_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG6_VH.set(GCKeyCodeLANG6_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG7 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG7_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG7_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG7").orElseThrow().reinterpret(GCKeyCodeLANG7_LAYOUT.byteSize()) }
private val GCKeyCodeLANG7_VH: VarHandle by lazy { GCKeyCodeLANG7_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG7: Long
    get() = GCKeyCodeLANG7_VH.get(GCKeyCodeLANG7_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG7_VH.set(GCKeyCodeLANG7_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG8 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG8_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG8").orElseThrow().reinterpret(GCKeyCodeLANG8_LAYOUT.byteSize()) }
private val GCKeyCodeLANG8_VH: VarHandle by lazy { GCKeyCodeLANG8_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG8: Long
    get() = GCKeyCodeLANG8_VH.get(GCKeyCodeLANG8_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG8_VH.set(GCKeyCodeLANG8_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLANG9 typedef const GCKeyCode = Long
 */
private val GCKeyCodeLANG9_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLANG9_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLANG9").orElseThrow().reinterpret(GCKeyCodeLANG9_LAYOUT.byteSize()) }
private val GCKeyCodeLANG9_VH: VarHandle by lazy { GCKeyCodeLANG9_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLANG9: Long
    get() = GCKeyCodeLANG9_VH.get(GCKeyCodeLANG9_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLANG9_VH.set(GCKeyCodeLANG9_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLeftControl typedef const GCKeyCode = Long
 */
private val GCKeyCodeLeftControl_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLeftControl_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLeftControl").orElseThrow().reinterpret(GCKeyCodeLeftControl_LAYOUT.byteSize()) }
private val GCKeyCodeLeftControl_VH: VarHandle by lazy { GCKeyCodeLeftControl_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLeftControl: Long
    get() = GCKeyCodeLeftControl_VH.get(GCKeyCodeLeftControl_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLeftControl_VH.set(GCKeyCodeLeftControl_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLeftShift typedef const GCKeyCode = Long
 */
private val GCKeyCodeLeftShift_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLeftShift_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLeftShift").orElseThrow().reinterpret(GCKeyCodeLeftShift_LAYOUT.byteSize()) }
private val GCKeyCodeLeftShift_VH: VarHandle by lazy { GCKeyCodeLeftShift_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLeftShift: Long
    get() = GCKeyCodeLeftShift_VH.get(GCKeyCodeLeftShift_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLeftShift_VH.set(GCKeyCodeLeftShift_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLeftAlt typedef const GCKeyCode = Long
 */
private val GCKeyCodeLeftAlt_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLeftAlt_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLeftAlt").orElseThrow().reinterpret(GCKeyCodeLeftAlt_LAYOUT.byteSize()) }
private val GCKeyCodeLeftAlt_VH: VarHandle by lazy { GCKeyCodeLeftAlt_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLeftAlt: Long
    get() = GCKeyCodeLeftAlt_VH.get(GCKeyCodeLeftAlt_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLeftAlt_VH.set(GCKeyCodeLeftAlt_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeLeftGUI typedef const GCKeyCode = Long
 */
private val GCKeyCodeLeftGUI_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeLeftGUI_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeLeftGUI").orElseThrow().reinterpret(GCKeyCodeLeftGUI_LAYOUT.byteSize()) }
private val GCKeyCodeLeftGUI_VH: VarHandle by lazy { GCKeyCodeLeftGUI_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeLeftGUI: Long
    get() = GCKeyCodeLeftGUI_VH.get(GCKeyCodeLeftGUI_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeLeftGUI_VH.set(GCKeyCodeLeftGUI_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeRightControl typedef const GCKeyCode = Long
 */
private val GCKeyCodeRightControl_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeRightControl_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeRightControl").orElseThrow().reinterpret(GCKeyCodeRightControl_LAYOUT.byteSize()) }
private val GCKeyCodeRightControl_VH: VarHandle by lazy { GCKeyCodeRightControl_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeRightControl: Long
    get() = GCKeyCodeRightControl_VH.get(GCKeyCodeRightControl_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeRightControl_VH.set(GCKeyCodeRightControl_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeRightShift typedef const GCKeyCode = Long
 */
private val GCKeyCodeRightShift_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeRightShift_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeRightShift").orElseThrow().reinterpret(GCKeyCodeRightShift_LAYOUT.byteSize()) }
private val GCKeyCodeRightShift_VH: VarHandle by lazy { GCKeyCodeRightShift_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeRightShift: Long
    get() = GCKeyCodeRightShift_VH.get(GCKeyCodeRightShift_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeRightShift_VH.set(GCKeyCodeRightShift_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeRightAlt typedef const GCKeyCode = Long
 */
private val GCKeyCodeRightAlt_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeRightAlt_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeRightAlt").orElseThrow().reinterpret(GCKeyCodeRightAlt_LAYOUT.byteSize()) }
private val GCKeyCodeRightAlt_VH: VarHandle by lazy { GCKeyCodeRightAlt_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeRightAlt: Long
    get() = GCKeyCodeRightAlt_VH.get(GCKeyCodeRightAlt_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeRightAlt_VH.set(GCKeyCodeRightAlt_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCodeRightGUI typedef const GCKeyCode = Long
 */
private val GCKeyCodeRightGUI_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCKeyCodeRightGUI_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCodeRightGUI").orElseThrow().reinterpret(GCKeyCodeRightGUI_LAYOUT.byteSize()) }
private val GCKeyCodeRightGUI_VH: VarHandle by lazy { GCKeyCodeRightGUI_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCodeRightGUI: Long
    get() = GCKeyCodeRightGUI_VH.get(GCKeyCodeRightGUI_SEGMENT, 0L) as Long
    set(value) = GCKeyCodeRightGUI_VH.set(GCKeyCodeRightGUI_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyA (Void)*
 */
private val GCKeyA_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyA_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyA").orElseThrow().reinterpret(GCKeyA_LAYOUT.byteSize()) }
private val GCKeyA_VH: VarHandle by lazy { GCKeyA_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyA: MemorySegment
    get() = GCKeyA_VH.get(GCKeyA_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyA_VH.set(GCKeyA_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyB (Void)*
 */
private val GCKeyB_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyB_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyB").orElseThrow().reinterpret(GCKeyB_LAYOUT.byteSize()) }
private val GCKeyB_VH: VarHandle by lazy { GCKeyB_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyB: MemorySegment
    get() = GCKeyB_VH.get(GCKeyB_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyB_VH.set(GCKeyB_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyC (Void)*
 */
private val GCKeyC_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyC_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyC").orElseThrow().reinterpret(GCKeyC_LAYOUT.byteSize()) }
private val GCKeyC_VH: VarHandle by lazy { GCKeyC_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyC: MemorySegment
    get() = GCKeyC_VH.get(GCKeyC_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyC_VH.set(GCKeyC_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyD (Void)*
 */
private val GCKeyD_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyD_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyD").orElseThrow().reinterpret(GCKeyD_LAYOUT.byteSize()) }
private val GCKeyD_VH: VarHandle by lazy { GCKeyD_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyD: MemorySegment
    get() = GCKeyD_VH.get(GCKeyD_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyD_VH.set(GCKeyD_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyE (Void)*
 */
private val GCKeyE_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyE_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyE").orElseThrow().reinterpret(GCKeyE_LAYOUT.byteSize()) }
private val GCKeyE_VH: VarHandle by lazy { GCKeyE_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyE: MemorySegment
    get() = GCKeyE_VH.get(GCKeyE_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyE_VH.set(GCKeyE_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF (Void)*
 */
private val GCKeyF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF").orElseThrow().reinterpret(GCKeyF_LAYOUT.byteSize()) }
private val GCKeyF_VH: VarHandle by lazy { GCKeyF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF: MemorySegment
    get() = GCKeyF_VH.get(GCKeyF_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF_VH.set(GCKeyF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyG (Void)*
 */
private val GCKeyG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyG_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyG").orElseThrow().reinterpret(GCKeyG_LAYOUT.byteSize()) }
private val GCKeyG_VH: VarHandle by lazy { GCKeyG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyG: MemorySegment
    get() = GCKeyG_VH.get(GCKeyG_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyG_VH.set(GCKeyG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyH (Void)*
 */
private val GCKeyH_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyH_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyH").orElseThrow().reinterpret(GCKeyH_LAYOUT.byteSize()) }
private val GCKeyH_VH: VarHandle by lazy { GCKeyH_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyH: MemorySegment
    get() = GCKeyH_VH.get(GCKeyH_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyH_VH.set(GCKeyH_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyI (Void)*
 */
private val GCKeyI_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyI_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyI").orElseThrow().reinterpret(GCKeyI_LAYOUT.byteSize()) }
private val GCKeyI_VH: VarHandle by lazy { GCKeyI_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyI: MemorySegment
    get() = GCKeyI_VH.get(GCKeyI_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyI_VH.set(GCKeyI_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyJ (Void)*
 */
private val GCKeyJ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyJ_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyJ").orElseThrow().reinterpret(GCKeyJ_LAYOUT.byteSize()) }
private val GCKeyJ_VH: VarHandle by lazy { GCKeyJ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyJ: MemorySegment
    get() = GCKeyJ_VH.get(GCKeyJ_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyJ_VH.set(GCKeyJ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyK (Void)*
 */
private val GCKeyK_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyK_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyK").orElseThrow().reinterpret(GCKeyK_LAYOUT.byteSize()) }
private val GCKeyK_VH: VarHandle by lazy { GCKeyK_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyK: MemorySegment
    get() = GCKeyK_VH.get(GCKeyK_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyK_VH.set(GCKeyK_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyL (Void)*
 */
private val GCKeyL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyL_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyL").orElseThrow().reinterpret(GCKeyL_LAYOUT.byteSize()) }
private val GCKeyL_VH: VarHandle by lazy { GCKeyL_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyL: MemorySegment
    get() = GCKeyL_VH.get(GCKeyL_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyL_VH.set(GCKeyL_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyM (Void)*
 */
private val GCKeyM_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyM_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyM").orElseThrow().reinterpret(GCKeyM_LAYOUT.byteSize()) }
private val GCKeyM_VH: VarHandle by lazy { GCKeyM_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyM: MemorySegment
    get() = GCKeyM_VH.get(GCKeyM_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyM_VH.set(GCKeyM_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyN (Void)*
 */
private val GCKeyN_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyN_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyN").orElseThrow().reinterpret(GCKeyN_LAYOUT.byteSize()) }
private val GCKeyN_VH: VarHandle by lazy { GCKeyN_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyN: MemorySegment
    get() = GCKeyN_VH.get(GCKeyN_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyN_VH.set(GCKeyN_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyO (Void)*
 */
private val GCKeyO_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyO_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyO").orElseThrow().reinterpret(GCKeyO_LAYOUT.byteSize()) }
private val GCKeyO_VH: VarHandle by lazy { GCKeyO_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyO: MemorySegment
    get() = GCKeyO_VH.get(GCKeyO_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyO_VH.set(GCKeyO_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyP (Void)*
 */
private val GCKeyP_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyP_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyP").orElseThrow().reinterpret(GCKeyP_LAYOUT.byteSize()) }
private val GCKeyP_VH: VarHandle by lazy { GCKeyP_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyP: MemorySegment
    get() = GCKeyP_VH.get(GCKeyP_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyP_VH.set(GCKeyP_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyQ (Void)*
 */
private val GCKeyQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyQ").orElseThrow().reinterpret(GCKeyQ_LAYOUT.byteSize()) }
private val GCKeyQ_VH: VarHandle by lazy { GCKeyQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyQ: MemorySegment
    get() = GCKeyQ_VH.get(GCKeyQ_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyQ_VH.set(GCKeyQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyR (Void)*
 */
private val GCKeyR_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyR_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyR").orElseThrow().reinterpret(GCKeyR_LAYOUT.byteSize()) }
private val GCKeyR_VH: VarHandle by lazy { GCKeyR_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyR: MemorySegment
    get() = GCKeyR_VH.get(GCKeyR_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyR_VH.set(GCKeyR_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyS (Void)*
 */
private val GCKeyS_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyS_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyS").orElseThrow().reinterpret(GCKeyS_LAYOUT.byteSize()) }
private val GCKeyS_VH: VarHandle by lazy { GCKeyS_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyS: MemorySegment
    get() = GCKeyS_VH.get(GCKeyS_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyS_VH.set(GCKeyS_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyT (Void)*
 */
private val GCKeyT_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyT_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyT").orElseThrow().reinterpret(GCKeyT_LAYOUT.byteSize()) }
private val GCKeyT_VH: VarHandle by lazy { GCKeyT_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyT: MemorySegment
    get() = GCKeyT_VH.get(GCKeyT_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyT_VH.set(GCKeyT_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyU (Void)*
 */
private val GCKeyU_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyU_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyU").orElseThrow().reinterpret(GCKeyU_LAYOUT.byteSize()) }
private val GCKeyU_VH: VarHandle by lazy { GCKeyU_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyU: MemorySegment
    get() = GCKeyU_VH.get(GCKeyU_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyU_VH.set(GCKeyU_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyV (Void)*
 */
private val GCKeyV_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyV_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyV").orElseThrow().reinterpret(GCKeyV_LAYOUT.byteSize()) }
private val GCKeyV_VH: VarHandle by lazy { GCKeyV_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyV: MemorySegment
    get() = GCKeyV_VH.get(GCKeyV_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyV_VH.set(GCKeyV_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyW (Void)*
 */
private val GCKeyW_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyW_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyW").orElseThrow().reinterpret(GCKeyW_LAYOUT.byteSize()) }
private val GCKeyW_VH: VarHandle by lazy { GCKeyW_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyW: MemorySegment
    get() = GCKeyW_VH.get(GCKeyW_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyW_VH.set(GCKeyW_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyX (Void)*
 */
private val GCKeyX_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyX_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyX").orElseThrow().reinterpret(GCKeyX_LAYOUT.byteSize()) }
private val GCKeyX_VH: VarHandle by lazy { GCKeyX_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyX: MemorySegment
    get() = GCKeyX_VH.get(GCKeyX_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyX_VH.set(GCKeyX_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyY (Void)*
 */
private val GCKeyY_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyY_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyY").orElseThrow().reinterpret(GCKeyY_LAYOUT.byteSize()) }
private val GCKeyY_VH: VarHandle by lazy { GCKeyY_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyY: MemorySegment
    get() = GCKeyY_VH.get(GCKeyY_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyY_VH.set(GCKeyY_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyZ (Void)*
 */
private val GCKeyZ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyZ_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyZ").orElseThrow().reinterpret(GCKeyZ_LAYOUT.byteSize()) }
private val GCKeyZ_VH: VarHandle by lazy { GCKeyZ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyZ: MemorySegment
    get() = GCKeyZ_VH.get(GCKeyZ_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyZ_VH.set(GCKeyZ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyOne (Void)*
 */
private val GCKeyOne_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyOne_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyOne").orElseThrow().reinterpret(GCKeyOne_LAYOUT.byteSize()) }
private val GCKeyOne_VH: VarHandle by lazy { GCKeyOne_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyOne: MemorySegment
    get() = GCKeyOne_VH.get(GCKeyOne_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyOne_VH.set(GCKeyOne_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyTwo (Void)*
 */
private val GCKeyTwo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyTwo_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyTwo").orElseThrow().reinterpret(GCKeyTwo_LAYOUT.byteSize()) }
private val GCKeyTwo_VH: VarHandle by lazy { GCKeyTwo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyTwo: MemorySegment
    get() = GCKeyTwo_VH.get(GCKeyTwo_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyTwo_VH.set(GCKeyTwo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyThree (Void)*
 */
private val GCKeyThree_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyThree_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyThree").orElseThrow().reinterpret(GCKeyThree_LAYOUT.byteSize()) }
private val GCKeyThree_VH: VarHandle by lazy { GCKeyThree_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyThree: MemorySegment
    get() = GCKeyThree_VH.get(GCKeyThree_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyThree_VH.set(GCKeyThree_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyFour (Void)*
 */
private val GCKeyFour_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyFour_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyFour").orElseThrow().reinterpret(GCKeyFour_LAYOUT.byteSize()) }
private val GCKeyFour_VH: VarHandle by lazy { GCKeyFour_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyFour: MemorySegment
    get() = GCKeyFour_VH.get(GCKeyFour_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyFour_VH.set(GCKeyFour_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyFive (Void)*
 */
private val GCKeyFive_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyFive_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyFive").orElseThrow().reinterpret(GCKeyFive_LAYOUT.byteSize()) }
private val GCKeyFive_VH: VarHandle by lazy { GCKeyFive_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyFive: MemorySegment
    get() = GCKeyFive_VH.get(GCKeyFive_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyFive_VH.set(GCKeyFive_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeySix (Void)*
 */
private val GCKeySix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeySix_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeySix").orElseThrow().reinterpret(GCKeySix_LAYOUT.byteSize()) }
private val GCKeySix_VH: VarHandle by lazy { GCKeySix_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeySix: MemorySegment
    get() = GCKeySix_VH.get(GCKeySix_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeySix_VH.set(GCKeySix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeySeven (Void)*
 */
private val GCKeySeven_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeySeven_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeySeven").orElseThrow().reinterpret(GCKeySeven_LAYOUT.byteSize()) }
private val GCKeySeven_VH: VarHandle by lazy { GCKeySeven_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeySeven: MemorySegment
    get() = GCKeySeven_VH.get(GCKeySeven_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeySeven_VH.set(GCKeySeven_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyEight (Void)*
 */
private val GCKeyEight_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyEight_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyEight").orElseThrow().reinterpret(GCKeyEight_LAYOUT.byteSize()) }
private val GCKeyEight_VH: VarHandle by lazy { GCKeyEight_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyEight: MemorySegment
    get() = GCKeyEight_VH.get(GCKeyEight_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyEight_VH.set(GCKeyEight_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyNine (Void)*
 */
private val GCKeyNine_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyNine_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyNine").orElseThrow().reinterpret(GCKeyNine_LAYOUT.byteSize()) }
private val GCKeyNine_VH: VarHandle by lazy { GCKeyNine_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyNine: MemorySegment
    get() = GCKeyNine_VH.get(GCKeyNine_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyNine_VH.set(GCKeyNine_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyZero (Void)*
 */
private val GCKeyZero_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyZero_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyZero").orElseThrow().reinterpret(GCKeyZero_LAYOUT.byteSize()) }
private val GCKeyZero_VH: VarHandle by lazy { GCKeyZero_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyZero: MemorySegment
    get() = GCKeyZero_VH.get(GCKeyZero_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyZero_VH.set(GCKeyZero_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyReturnOrEnter (Void)*
 */
private val GCKeyReturnOrEnter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyReturnOrEnter_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyReturnOrEnter").orElseThrow().reinterpret(GCKeyReturnOrEnter_LAYOUT.byteSize()) }
private val GCKeyReturnOrEnter_VH: VarHandle by lazy { GCKeyReturnOrEnter_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyReturnOrEnter: MemorySegment
    get() = GCKeyReturnOrEnter_VH.get(GCKeyReturnOrEnter_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyReturnOrEnter_VH.set(GCKeyReturnOrEnter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyEscape (Void)*
 */
private val GCKeyEscape_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyEscape_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyEscape").orElseThrow().reinterpret(GCKeyEscape_LAYOUT.byteSize()) }
private val GCKeyEscape_VH: VarHandle by lazy { GCKeyEscape_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyEscape: MemorySegment
    get() = GCKeyEscape_VH.get(GCKeyEscape_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyEscape_VH.set(GCKeyEscape_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyDeleteOrBackspace (Void)*
 */
private val GCKeyDeleteOrBackspace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyDeleteOrBackspace_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyDeleteOrBackspace").orElseThrow().reinterpret(GCKeyDeleteOrBackspace_LAYOUT.byteSize()) }
private val GCKeyDeleteOrBackspace_VH: VarHandle by lazy { GCKeyDeleteOrBackspace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyDeleteOrBackspace: MemorySegment
    get() = GCKeyDeleteOrBackspace_VH.get(GCKeyDeleteOrBackspace_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyDeleteOrBackspace_VH.set(GCKeyDeleteOrBackspace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyTab (Void)*
 */
private val GCKeyTab_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyTab_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyTab").orElseThrow().reinterpret(GCKeyTab_LAYOUT.byteSize()) }
private val GCKeyTab_VH: VarHandle by lazy { GCKeyTab_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyTab: MemorySegment
    get() = GCKeyTab_VH.get(GCKeyTab_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyTab_VH.set(GCKeyTab_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeySpacebar (Void)*
 */
private val GCKeySpacebar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeySpacebar_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeySpacebar").orElseThrow().reinterpret(GCKeySpacebar_LAYOUT.byteSize()) }
private val GCKeySpacebar_VH: VarHandle by lazy { GCKeySpacebar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeySpacebar: MemorySegment
    get() = GCKeySpacebar_VH.get(GCKeySpacebar_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeySpacebar_VH.set(GCKeySpacebar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyHyphen (Void)*
 */
private val GCKeyHyphen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyHyphen_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyHyphen").orElseThrow().reinterpret(GCKeyHyphen_LAYOUT.byteSize()) }
private val GCKeyHyphen_VH: VarHandle by lazy { GCKeyHyphen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyHyphen: MemorySegment
    get() = GCKeyHyphen_VH.get(GCKeyHyphen_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyHyphen_VH.set(GCKeyHyphen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyEqualSign (Void)*
 */
private val GCKeyEqualSign_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyEqualSign_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyEqualSign").orElseThrow().reinterpret(GCKeyEqualSign_LAYOUT.byteSize()) }
private val GCKeyEqualSign_VH: VarHandle by lazy { GCKeyEqualSign_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyEqualSign: MemorySegment
    get() = GCKeyEqualSign_VH.get(GCKeyEqualSign_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyEqualSign_VH.set(GCKeyEqualSign_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyOpenBracket (Void)*
 */
private val GCKeyOpenBracket_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyOpenBracket_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyOpenBracket").orElseThrow().reinterpret(GCKeyOpenBracket_LAYOUT.byteSize()) }
private val GCKeyOpenBracket_VH: VarHandle by lazy { GCKeyOpenBracket_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyOpenBracket: MemorySegment
    get() = GCKeyOpenBracket_VH.get(GCKeyOpenBracket_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyOpenBracket_VH.set(GCKeyOpenBracket_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCloseBracket (Void)*
 */
private val GCKeyCloseBracket_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyCloseBracket_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCloseBracket").orElseThrow().reinterpret(GCKeyCloseBracket_LAYOUT.byteSize()) }
private val GCKeyCloseBracket_VH: VarHandle by lazy { GCKeyCloseBracket_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCloseBracket: MemorySegment
    get() = GCKeyCloseBracket_VH.get(GCKeyCloseBracket_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyCloseBracket_VH.set(GCKeyCloseBracket_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyBackslash (Void)*
 */
private val GCKeyBackslash_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyBackslash_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyBackslash").orElseThrow().reinterpret(GCKeyBackslash_LAYOUT.byteSize()) }
private val GCKeyBackslash_VH: VarHandle by lazy { GCKeyBackslash_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyBackslash: MemorySegment
    get() = GCKeyBackslash_VH.get(GCKeyBackslash_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyBackslash_VH.set(GCKeyBackslash_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyNonUSPound (Void)*
 */
private val GCKeyNonUSPound_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyNonUSPound_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyNonUSPound").orElseThrow().reinterpret(GCKeyNonUSPound_LAYOUT.byteSize()) }
private val GCKeyNonUSPound_VH: VarHandle by lazy { GCKeyNonUSPound_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyNonUSPound: MemorySegment
    get() = GCKeyNonUSPound_VH.get(GCKeyNonUSPound_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyNonUSPound_VH.set(GCKeyNonUSPound_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeySemicolon (Void)*
 */
private val GCKeySemicolon_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeySemicolon_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeySemicolon").orElseThrow().reinterpret(GCKeySemicolon_LAYOUT.byteSize()) }
private val GCKeySemicolon_VH: VarHandle by lazy { GCKeySemicolon_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeySemicolon: MemorySegment
    get() = GCKeySemicolon_VH.get(GCKeySemicolon_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeySemicolon_VH.set(GCKeySemicolon_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyQuote (Void)*
 */
private val GCKeyQuote_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyQuote_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyQuote").orElseThrow().reinterpret(GCKeyQuote_LAYOUT.byteSize()) }
private val GCKeyQuote_VH: VarHandle by lazy { GCKeyQuote_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyQuote: MemorySegment
    get() = GCKeyQuote_VH.get(GCKeyQuote_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyQuote_VH.set(GCKeyQuote_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyGraveAccentAndTilde (Void)*
 */
private val GCKeyGraveAccentAndTilde_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyGraveAccentAndTilde_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyGraveAccentAndTilde").orElseThrow().reinterpret(GCKeyGraveAccentAndTilde_LAYOUT.byteSize()) }
private val GCKeyGraveAccentAndTilde_VH: VarHandle by lazy { GCKeyGraveAccentAndTilde_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyGraveAccentAndTilde: MemorySegment
    get() = GCKeyGraveAccentAndTilde_VH.get(GCKeyGraveAccentAndTilde_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyGraveAccentAndTilde_VH.set(GCKeyGraveAccentAndTilde_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyComma (Void)*
 */
private val GCKeyComma_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyComma_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyComma").orElseThrow().reinterpret(GCKeyComma_LAYOUT.byteSize()) }
private val GCKeyComma_VH: VarHandle by lazy { GCKeyComma_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyComma: MemorySegment
    get() = GCKeyComma_VH.get(GCKeyComma_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyComma_VH.set(GCKeyComma_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyPeriod (Void)*
 */
private val GCKeyPeriod_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyPeriod_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyPeriod").orElseThrow().reinterpret(GCKeyPeriod_LAYOUT.byteSize()) }
private val GCKeyPeriod_VH: VarHandle by lazy { GCKeyPeriod_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyPeriod: MemorySegment
    get() = GCKeyPeriod_VH.get(GCKeyPeriod_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyPeriod_VH.set(GCKeyPeriod_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeySlash (Void)*
 */
private val GCKeySlash_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeySlash_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeySlash").orElseThrow().reinterpret(GCKeySlash_LAYOUT.byteSize()) }
private val GCKeySlash_VH: VarHandle by lazy { GCKeySlash_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeySlash: MemorySegment
    get() = GCKeySlash_VH.get(GCKeySlash_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeySlash_VH.set(GCKeySlash_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyCapsLock (Void)*
 */
private val GCKeyCapsLock_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyCapsLock_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyCapsLock").orElseThrow().reinterpret(GCKeyCapsLock_LAYOUT.byteSize()) }
private val GCKeyCapsLock_VH: VarHandle by lazy { GCKeyCapsLock_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyCapsLock: MemorySegment
    get() = GCKeyCapsLock_VH.get(GCKeyCapsLock_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyCapsLock_VH.set(GCKeyCapsLock_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF1 (Void)*
 */
private val GCKeyF1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF1_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF1").orElseThrow().reinterpret(GCKeyF1_LAYOUT.byteSize()) }
private val GCKeyF1_VH: VarHandle by lazy { GCKeyF1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF1: MemorySegment
    get() = GCKeyF1_VH.get(GCKeyF1_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF1_VH.set(GCKeyF1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF2 (Void)*
 */
private val GCKeyF2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF2_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF2").orElseThrow().reinterpret(GCKeyF2_LAYOUT.byteSize()) }
private val GCKeyF2_VH: VarHandle by lazy { GCKeyF2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF2: MemorySegment
    get() = GCKeyF2_VH.get(GCKeyF2_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF2_VH.set(GCKeyF2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF3 (Void)*
 */
private val GCKeyF3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF3_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF3").orElseThrow().reinterpret(GCKeyF3_LAYOUT.byteSize()) }
private val GCKeyF3_VH: VarHandle by lazy { GCKeyF3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF3: MemorySegment
    get() = GCKeyF3_VH.get(GCKeyF3_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF3_VH.set(GCKeyF3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF4 (Void)*
 */
private val GCKeyF4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF4_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF4").orElseThrow().reinterpret(GCKeyF4_LAYOUT.byteSize()) }
private val GCKeyF4_VH: VarHandle by lazy { GCKeyF4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF4: MemorySegment
    get() = GCKeyF4_VH.get(GCKeyF4_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF4_VH.set(GCKeyF4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF5 (Void)*
 */
private val GCKeyF5_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF5_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF5").orElseThrow().reinterpret(GCKeyF5_LAYOUT.byteSize()) }
private val GCKeyF5_VH: VarHandle by lazy { GCKeyF5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF5: MemorySegment
    get() = GCKeyF5_VH.get(GCKeyF5_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF5_VH.set(GCKeyF5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF6 (Void)*
 */
private val GCKeyF6_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF6_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF6").orElseThrow().reinterpret(GCKeyF6_LAYOUT.byteSize()) }
private val GCKeyF6_VH: VarHandle by lazy { GCKeyF6_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF6: MemorySegment
    get() = GCKeyF6_VH.get(GCKeyF6_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF6_VH.set(GCKeyF6_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF7 (Void)*
 */
private val GCKeyF7_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF7_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF7").orElseThrow().reinterpret(GCKeyF7_LAYOUT.byteSize()) }
private val GCKeyF7_VH: VarHandle by lazy { GCKeyF7_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF7: MemorySegment
    get() = GCKeyF7_VH.get(GCKeyF7_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF7_VH.set(GCKeyF7_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF8 (Void)*
 */
private val GCKeyF8_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF8_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF8").orElseThrow().reinterpret(GCKeyF8_LAYOUT.byteSize()) }
private val GCKeyF8_VH: VarHandle by lazy { GCKeyF8_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF8: MemorySegment
    get() = GCKeyF8_VH.get(GCKeyF8_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF8_VH.set(GCKeyF8_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF9 (Void)*
 */
private val GCKeyF9_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF9_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF9").orElseThrow().reinterpret(GCKeyF9_LAYOUT.byteSize()) }
private val GCKeyF9_VH: VarHandle by lazy { GCKeyF9_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF9: MemorySegment
    get() = GCKeyF9_VH.get(GCKeyF9_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF9_VH.set(GCKeyF9_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF10 (Void)*
 */
private val GCKeyF10_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF10_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF10").orElseThrow().reinterpret(GCKeyF10_LAYOUT.byteSize()) }
private val GCKeyF10_VH: VarHandle by lazy { GCKeyF10_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF10: MemorySegment
    get() = GCKeyF10_VH.get(GCKeyF10_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF10_VH.set(GCKeyF10_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF11 (Void)*
 */
private val GCKeyF11_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF11_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF11").orElseThrow().reinterpret(GCKeyF11_LAYOUT.byteSize()) }
private val GCKeyF11_VH: VarHandle by lazy { GCKeyF11_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF11: MemorySegment
    get() = GCKeyF11_VH.get(GCKeyF11_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF11_VH.set(GCKeyF11_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF12 (Void)*
 */
private val GCKeyF12_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF12_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF12").orElseThrow().reinterpret(GCKeyF12_LAYOUT.byteSize()) }
private val GCKeyF12_VH: VarHandle by lazy { GCKeyF12_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF12: MemorySegment
    get() = GCKeyF12_VH.get(GCKeyF12_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF12_VH.set(GCKeyF12_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF13 (Void)*
 */
private val GCKeyF13_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF13_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF13").orElseThrow().reinterpret(GCKeyF13_LAYOUT.byteSize()) }
private val GCKeyF13_VH: VarHandle by lazy { GCKeyF13_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF13: MemorySegment
    get() = GCKeyF13_VH.get(GCKeyF13_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF13_VH.set(GCKeyF13_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF14 (Void)*
 */
private val GCKeyF14_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF14_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF14").orElseThrow().reinterpret(GCKeyF14_LAYOUT.byteSize()) }
private val GCKeyF14_VH: VarHandle by lazy { GCKeyF14_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF14: MemorySegment
    get() = GCKeyF14_VH.get(GCKeyF14_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF14_VH.set(GCKeyF14_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF15 (Void)*
 */
private val GCKeyF15_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF15_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF15").orElseThrow().reinterpret(GCKeyF15_LAYOUT.byteSize()) }
private val GCKeyF15_VH: VarHandle by lazy { GCKeyF15_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF15: MemorySegment
    get() = GCKeyF15_VH.get(GCKeyF15_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF15_VH.set(GCKeyF15_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF16 (Void)*
 */
private val GCKeyF16_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF16_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF16").orElseThrow().reinterpret(GCKeyF16_LAYOUT.byteSize()) }
private val GCKeyF16_VH: VarHandle by lazy { GCKeyF16_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF16: MemorySegment
    get() = GCKeyF16_VH.get(GCKeyF16_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF16_VH.set(GCKeyF16_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF17 (Void)*
 */
private val GCKeyF17_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF17_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF17").orElseThrow().reinterpret(GCKeyF17_LAYOUT.byteSize()) }
private val GCKeyF17_VH: VarHandle by lazy { GCKeyF17_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF17: MemorySegment
    get() = GCKeyF17_VH.get(GCKeyF17_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF17_VH.set(GCKeyF17_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF18 (Void)*
 */
private val GCKeyF18_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF18_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF18").orElseThrow().reinterpret(GCKeyF18_LAYOUT.byteSize()) }
private val GCKeyF18_VH: VarHandle by lazy { GCKeyF18_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF18: MemorySegment
    get() = GCKeyF18_VH.get(GCKeyF18_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF18_VH.set(GCKeyF18_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF19 (Void)*
 */
private val GCKeyF19_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF19_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF19").orElseThrow().reinterpret(GCKeyF19_LAYOUT.byteSize()) }
private val GCKeyF19_VH: VarHandle by lazy { GCKeyF19_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF19: MemorySegment
    get() = GCKeyF19_VH.get(GCKeyF19_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF19_VH.set(GCKeyF19_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyF20 (Void)*
 */
private val GCKeyF20_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyF20_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyF20").orElseThrow().reinterpret(GCKeyF20_LAYOUT.byteSize()) }
private val GCKeyF20_VH: VarHandle by lazy { GCKeyF20_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCKeyF20: MemorySegment
    get() = GCKeyF20_VH.get(GCKeyF20_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyF20_VH.set(GCKeyF20_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyPrintScreen (Void)*
 */
private val GCKeyPrintScreen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyPrintScreen_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyPrintScreen").orElseThrow().reinterpret(GCKeyPrintScreen_LAYOUT.byteSize()) }
private val GCKeyPrintScreen_VH: VarHandle by lazy { GCKeyPrintScreen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyPrintScreen: MemorySegment
    get() = GCKeyPrintScreen_VH.get(GCKeyPrintScreen_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyPrintScreen_VH.set(GCKeyPrintScreen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyScrollLock (Void)*
 */
private val GCKeyScrollLock_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyScrollLock_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyScrollLock").orElseThrow().reinterpret(GCKeyScrollLock_LAYOUT.byteSize()) }
private val GCKeyScrollLock_VH: VarHandle by lazy { GCKeyScrollLock_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyScrollLock: MemorySegment
    get() = GCKeyScrollLock_VH.get(GCKeyScrollLock_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyScrollLock_VH.set(GCKeyScrollLock_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyPause (Void)*
 */
private val GCKeyPause_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyPause_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyPause").orElseThrow().reinterpret(GCKeyPause_LAYOUT.byteSize()) }
private val GCKeyPause_VH: VarHandle by lazy { GCKeyPause_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyPause: MemorySegment
    get() = GCKeyPause_VH.get(GCKeyPause_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyPause_VH.set(GCKeyPause_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInsert (Void)*
 */
private val GCKeyInsert_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInsert_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInsert").orElseThrow().reinterpret(GCKeyInsert_LAYOUT.byteSize()) }
private val GCKeyInsert_VH: VarHandle by lazy { GCKeyInsert_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInsert: MemorySegment
    get() = GCKeyInsert_VH.get(GCKeyInsert_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInsert_VH.set(GCKeyInsert_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyHome (Void)*
 */
private val GCKeyHome_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyHome_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyHome").orElseThrow().reinterpret(GCKeyHome_LAYOUT.byteSize()) }
private val GCKeyHome_VH: VarHandle by lazy { GCKeyHome_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyHome: MemorySegment
    get() = GCKeyHome_VH.get(GCKeyHome_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyHome_VH.set(GCKeyHome_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyPageUp (Void)*
 */
private val GCKeyPageUp_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyPageUp_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyPageUp").orElseThrow().reinterpret(GCKeyPageUp_LAYOUT.byteSize()) }
private val GCKeyPageUp_VH: VarHandle by lazy { GCKeyPageUp_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyPageUp: MemorySegment
    get() = GCKeyPageUp_VH.get(GCKeyPageUp_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyPageUp_VH.set(GCKeyPageUp_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyDeleteForward (Void)*
 */
private val GCKeyDeleteForward_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyDeleteForward_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyDeleteForward").orElseThrow().reinterpret(GCKeyDeleteForward_LAYOUT.byteSize()) }
private val GCKeyDeleteForward_VH: VarHandle by lazy { GCKeyDeleteForward_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyDeleteForward: MemorySegment
    get() = GCKeyDeleteForward_VH.get(GCKeyDeleteForward_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyDeleteForward_VH.set(GCKeyDeleteForward_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyEnd (Void)*
 */
private val GCKeyEnd_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyEnd_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyEnd").orElseThrow().reinterpret(GCKeyEnd_LAYOUT.byteSize()) }
private val GCKeyEnd_VH: VarHandle by lazy { GCKeyEnd_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyEnd: MemorySegment
    get() = GCKeyEnd_VH.get(GCKeyEnd_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyEnd_VH.set(GCKeyEnd_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyPageDown (Void)*
 */
private val GCKeyPageDown_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyPageDown_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyPageDown").orElseThrow().reinterpret(GCKeyPageDown_LAYOUT.byteSize()) }
private val GCKeyPageDown_VH: VarHandle by lazy { GCKeyPageDown_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyPageDown: MemorySegment
    get() = GCKeyPageDown_VH.get(GCKeyPageDown_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyPageDown_VH.set(GCKeyPageDown_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyRightArrow (Void)*
 */
private val GCKeyRightArrow_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyRightArrow_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyRightArrow").orElseThrow().reinterpret(GCKeyRightArrow_LAYOUT.byteSize()) }
private val GCKeyRightArrow_VH: VarHandle by lazy { GCKeyRightArrow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyRightArrow: MemorySegment
    get() = GCKeyRightArrow_VH.get(GCKeyRightArrow_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyRightArrow_VH.set(GCKeyRightArrow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLeftArrow (Void)*
 */
private val GCKeyLeftArrow_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLeftArrow_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLeftArrow").orElseThrow().reinterpret(GCKeyLeftArrow_LAYOUT.byteSize()) }
private val GCKeyLeftArrow_VH: VarHandle by lazy { GCKeyLeftArrow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLeftArrow: MemorySegment
    get() = GCKeyLeftArrow_VH.get(GCKeyLeftArrow_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLeftArrow_VH.set(GCKeyLeftArrow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyDownArrow (Void)*
 */
private val GCKeyDownArrow_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyDownArrow_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyDownArrow").orElseThrow().reinterpret(GCKeyDownArrow_LAYOUT.byteSize()) }
private val GCKeyDownArrow_VH: VarHandle by lazy { GCKeyDownArrow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyDownArrow: MemorySegment
    get() = GCKeyDownArrow_VH.get(GCKeyDownArrow_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyDownArrow_VH.set(GCKeyDownArrow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyUpArrow (Void)*
 */
private val GCKeyUpArrow_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyUpArrow_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyUpArrow").orElseThrow().reinterpret(GCKeyUpArrow_LAYOUT.byteSize()) }
private val GCKeyUpArrow_VH: VarHandle by lazy { GCKeyUpArrow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyUpArrow: MemorySegment
    get() = GCKeyUpArrow_VH.get(GCKeyUpArrow_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyUpArrow_VH.set(GCKeyUpArrow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypadNumLock (Void)*
 */
private val GCKeyKeypadNumLock_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypadNumLock_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypadNumLock").orElseThrow().reinterpret(GCKeyKeypadNumLock_LAYOUT.byteSize()) }
private val GCKeyKeypadNumLock_VH: VarHandle by lazy { GCKeyKeypadNumLock_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypadNumLock: MemorySegment
    get() = GCKeyKeypadNumLock_VH.get(GCKeyKeypadNumLock_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypadNumLock_VH.set(GCKeyKeypadNumLock_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypadSlash (Void)*
 */
private val GCKeyKeypadSlash_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypadSlash_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypadSlash").orElseThrow().reinterpret(GCKeyKeypadSlash_LAYOUT.byteSize()) }
private val GCKeyKeypadSlash_VH: VarHandle by lazy { GCKeyKeypadSlash_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypadSlash: MemorySegment
    get() = GCKeyKeypadSlash_VH.get(GCKeyKeypadSlash_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypadSlash_VH.set(GCKeyKeypadSlash_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypadAsterisk (Void)*
 */
private val GCKeyKeypadAsterisk_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypadAsterisk_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypadAsterisk").orElseThrow().reinterpret(GCKeyKeypadAsterisk_LAYOUT.byteSize()) }
private val GCKeyKeypadAsterisk_VH: VarHandle by lazy { GCKeyKeypadAsterisk_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypadAsterisk: MemorySegment
    get() = GCKeyKeypadAsterisk_VH.get(GCKeyKeypadAsterisk_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypadAsterisk_VH.set(GCKeyKeypadAsterisk_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypadHyphen (Void)*
 */
private val GCKeyKeypadHyphen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypadHyphen_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypadHyphen").orElseThrow().reinterpret(GCKeyKeypadHyphen_LAYOUT.byteSize()) }
private val GCKeyKeypadHyphen_VH: VarHandle by lazy { GCKeyKeypadHyphen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypadHyphen: MemorySegment
    get() = GCKeyKeypadHyphen_VH.get(GCKeyKeypadHyphen_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypadHyphen_VH.set(GCKeyKeypadHyphen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypadPlus (Void)*
 */
private val GCKeyKeypadPlus_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypadPlus_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypadPlus").orElseThrow().reinterpret(GCKeyKeypadPlus_LAYOUT.byteSize()) }
private val GCKeyKeypadPlus_VH: VarHandle by lazy { GCKeyKeypadPlus_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypadPlus: MemorySegment
    get() = GCKeyKeypadPlus_VH.get(GCKeyKeypadPlus_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypadPlus_VH.set(GCKeyKeypadPlus_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypadEnter (Void)*
 */
private val GCKeyKeypadEnter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypadEnter_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypadEnter").orElseThrow().reinterpret(GCKeyKeypadEnter_LAYOUT.byteSize()) }
private val GCKeyKeypadEnter_VH: VarHandle by lazy { GCKeyKeypadEnter_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypadEnter: MemorySegment
    get() = GCKeyKeypadEnter_VH.get(GCKeyKeypadEnter_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypadEnter_VH.set(GCKeyKeypadEnter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad1 (Void)*
 */
private val GCKeyKeypad1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad1_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad1").orElseThrow().reinterpret(GCKeyKeypad1_LAYOUT.byteSize()) }
private val GCKeyKeypad1_VH: VarHandle by lazy { GCKeyKeypad1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad1: MemorySegment
    get() = GCKeyKeypad1_VH.get(GCKeyKeypad1_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad1_VH.set(GCKeyKeypad1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad2 (Void)*
 */
private val GCKeyKeypad2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad2_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad2").orElseThrow().reinterpret(GCKeyKeypad2_LAYOUT.byteSize()) }
private val GCKeyKeypad2_VH: VarHandle by lazy { GCKeyKeypad2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad2: MemorySegment
    get() = GCKeyKeypad2_VH.get(GCKeyKeypad2_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad2_VH.set(GCKeyKeypad2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad3 (Void)*
 */
private val GCKeyKeypad3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad3_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad3").orElseThrow().reinterpret(GCKeyKeypad3_LAYOUT.byteSize()) }
private val GCKeyKeypad3_VH: VarHandle by lazy { GCKeyKeypad3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad3: MemorySegment
    get() = GCKeyKeypad3_VH.get(GCKeyKeypad3_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad3_VH.set(GCKeyKeypad3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad4 (Void)*
 */
private val GCKeyKeypad4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad4_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad4").orElseThrow().reinterpret(GCKeyKeypad4_LAYOUT.byteSize()) }
private val GCKeyKeypad4_VH: VarHandle by lazy { GCKeyKeypad4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad4: MemorySegment
    get() = GCKeyKeypad4_VH.get(GCKeyKeypad4_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad4_VH.set(GCKeyKeypad4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad5 (Void)*
 */
private val GCKeyKeypad5_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad5_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad5").orElseThrow().reinterpret(GCKeyKeypad5_LAYOUT.byteSize()) }
private val GCKeyKeypad5_VH: VarHandle by lazy { GCKeyKeypad5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad5: MemorySegment
    get() = GCKeyKeypad5_VH.get(GCKeyKeypad5_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad5_VH.set(GCKeyKeypad5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad6 (Void)*
 */
private val GCKeyKeypad6_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad6_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad6").orElseThrow().reinterpret(GCKeyKeypad6_LAYOUT.byteSize()) }
private val GCKeyKeypad6_VH: VarHandle by lazy { GCKeyKeypad6_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad6: MemorySegment
    get() = GCKeyKeypad6_VH.get(GCKeyKeypad6_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad6_VH.set(GCKeyKeypad6_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad7 (Void)*
 */
private val GCKeyKeypad7_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad7_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad7").orElseThrow().reinterpret(GCKeyKeypad7_LAYOUT.byteSize()) }
private val GCKeyKeypad7_VH: VarHandle by lazy { GCKeyKeypad7_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad7: MemorySegment
    get() = GCKeyKeypad7_VH.get(GCKeyKeypad7_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad7_VH.set(GCKeyKeypad7_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad8 (Void)*
 */
private val GCKeyKeypad8_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad8_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad8").orElseThrow().reinterpret(GCKeyKeypad8_LAYOUT.byteSize()) }
private val GCKeyKeypad8_VH: VarHandle by lazy { GCKeyKeypad8_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad8: MemorySegment
    get() = GCKeyKeypad8_VH.get(GCKeyKeypad8_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad8_VH.set(GCKeyKeypad8_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad9 (Void)*
 */
private val GCKeyKeypad9_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad9_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad9").orElseThrow().reinterpret(GCKeyKeypad9_LAYOUT.byteSize()) }
private val GCKeyKeypad9_VH: VarHandle by lazy { GCKeyKeypad9_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad9: MemorySegment
    get() = GCKeyKeypad9_VH.get(GCKeyKeypad9_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad9_VH.set(GCKeyKeypad9_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypad0 (Void)*
 */
private val GCKeyKeypad0_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypad0_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypad0").orElseThrow().reinterpret(GCKeyKeypad0_LAYOUT.byteSize()) }
private val GCKeyKeypad0_VH: VarHandle by lazy { GCKeyKeypad0_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypad0: MemorySegment
    get() = GCKeyKeypad0_VH.get(GCKeyKeypad0_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypad0_VH.set(GCKeyKeypad0_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypadPeriod (Void)*
 */
private val GCKeyKeypadPeriod_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypadPeriod_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypadPeriod").orElseThrow().reinterpret(GCKeyKeypadPeriod_LAYOUT.byteSize()) }
private val GCKeyKeypadPeriod_VH: VarHandle by lazy { GCKeyKeypadPeriod_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypadPeriod: MemorySegment
    get() = GCKeyKeypadPeriod_VH.get(GCKeyKeypadPeriod_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypadPeriod_VH.set(GCKeyKeypadPeriod_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyKeypadEqualSign (Void)*
 */
private val GCKeyKeypadEqualSign_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyKeypadEqualSign_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyKeypadEqualSign").orElseThrow().reinterpret(GCKeyKeypadEqualSign_LAYOUT.byteSize()) }
private val GCKeyKeypadEqualSign_VH: VarHandle by lazy { GCKeyKeypadEqualSign_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyKeypadEqualSign: MemorySegment
    get() = GCKeyKeypadEqualSign_VH.get(GCKeyKeypadEqualSign_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyKeypadEqualSign_VH.set(GCKeyKeypadEqualSign_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyNonUSBackslash (Void)*
 */
private val GCKeyNonUSBackslash_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyNonUSBackslash_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyNonUSBackslash").orElseThrow().reinterpret(GCKeyNonUSBackslash_LAYOUT.byteSize()) }
private val GCKeyNonUSBackslash_VH: VarHandle by lazy { GCKeyNonUSBackslash_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyNonUSBackslash: MemorySegment
    get() = GCKeyNonUSBackslash_VH.get(GCKeyNonUSBackslash_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyNonUSBackslash_VH.set(GCKeyNonUSBackslash_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyApplication (Void)*
 */
private val GCKeyApplication_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyApplication_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyApplication").orElseThrow().reinterpret(GCKeyApplication_LAYOUT.byteSize()) }
private val GCKeyApplication_VH: VarHandle by lazy { GCKeyApplication_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyApplication: MemorySegment
    get() = GCKeyApplication_VH.get(GCKeyApplication_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyApplication_VH.set(GCKeyApplication_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyPower (Void)*
 */
private val GCKeyPower_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyPower_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyPower").orElseThrow().reinterpret(GCKeyPower_LAYOUT.byteSize()) }
private val GCKeyPower_VH: VarHandle by lazy { GCKeyPower_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyPower: MemorySegment
    get() = GCKeyPower_VH.get(GCKeyPower_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyPower_VH.set(GCKeyPower_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational1 (Void)*
 */
private val GCKeyInternational1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational1_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational1").orElseThrow().reinterpret(GCKeyInternational1_LAYOUT.byteSize()) }
private val GCKeyInternational1_VH: VarHandle by lazy { GCKeyInternational1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational1: MemorySegment
    get() = GCKeyInternational1_VH.get(GCKeyInternational1_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational1_VH.set(GCKeyInternational1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational2 (Void)*
 */
private val GCKeyInternational2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational2_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational2").orElseThrow().reinterpret(GCKeyInternational2_LAYOUT.byteSize()) }
private val GCKeyInternational2_VH: VarHandle by lazy { GCKeyInternational2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational2: MemorySegment
    get() = GCKeyInternational2_VH.get(GCKeyInternational2_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational2_VH.set(GCKeyInternational2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational3 (Void)*
 */
private val GCKeyInternational3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational3_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational3").orElseThrow().reinterpret(GCKeyInternational3_LAYOUT.byteSize()) }
private val GCKeyInternational3_VH: VarHandle by lazy { GCKeyInternational3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational3: MemorySegment
    get() = GCKeyInternational3_VH.get(GCKeyInternational3_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational3_VH.set(GCKeyInternational3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational4 (Void)*
 */
private val GCKeyInternational4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational4_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational4").orElseThrow().reinterpret(GCKeyInternational4_LAYOUT.byteSize()) }
private val GCKeyInternational4_VH: VarHandle by lazy { GCKeyInternational4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational4: MemorySegment
    get() = GCKeyInternational4_VH.get(GCKeyInternational4_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational4_VH.set(GCKeyInternational4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational5 (Void)*
 */
private val GCKeyInternational5_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational5_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational5").orElseThrow().reinterpret(GCKeyInternational5_LAYOUT.byteSize()) }
private val GCKeyInternational5_VH: VarHandle by lazy { GCKeyInternational5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational5: MemorySegment
    get() = GCKeyInternational5_VH.get(GCKeyInternational5_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational5_VH.set(GCKeyInternational5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational6 (Void)*
 */
private val GCKeyInternational6_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational6_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational6").orElseThrow().reinterpret(GCKeyInternational6_LAYOUT.byteSize()) }
private val GCKeyInternational6_VH: VarHandle by lazy { GCKeyInternational6_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational6: MemorySegment
    get() = GCKeyInternational6_VH.get(GCKeyInternational6_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational6_VH.set(GCKeyInternational6_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational7 (Void)*
 */
private val GCKeyInternational7_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational7_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational7").orElseThrow().reinterpret(GCKeyInternational7_LAYOUT.byteSize()) }
private val GCKeyInternational7_VH: VarHandle by lazy { GCKeyInternational7_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational7: MemorySegment
    get() = GCKeyInternational7_VH.get(GCKeyInternational7_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational7_VH.set(GCKeyInternational7_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational8 (Void)*
 */
private val GCKeyInternational8_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational8_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational8").orElseThrow().reinterpret(GCKeyInternational8_LAYOUT.byteSize()) }
private val GCKeyInternational8_VH: VarHandle by lazy { GCKeyInternational8_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational8: MemorySegment
    get() = GCKeyInternational8_VH.get(GCKeyInternational8_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational8_VH.set(GCKeyInternational8_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyInternational9 (Void)*
 */
private val GCKeyInternational9_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyInternational9_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyInternational9").orElseThrow().reinterpret(GCKeyInternational9_LAYOUT.byteSize()) }
private val GCKeyInternational9_VH: VarHandle by lazy { GCKeyInternational9_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyInternational9: MemorySegment
    get() = GCKeyInternational9_VH.get(GCKeyInternational9_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyInternational9_VH.set(GCKeyInternational9_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG1 (Void)*
 */
private val GCKeyLANG1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG1_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG1").orElseThrow().reinterpret(GCKeyLANG1_LAYOUT.byteSize()) }
private val GCKeyLANG1_VH: VarHandle by lazy { GCKeyLANG1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG1: MemorySegment
    get() = GCKeyLANG1_VH.get(GCKeyLANG1_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG1_VH.set(GCKeyLANG1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG2 (Void)*
 */
private val GCKeyLANG2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG2_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG2").orElseThrow().reinterpret(GCKeyLANG2_LAYOUT.byteSize()) }
private val GCKeyLANG2_VH: VarHandle by lazy { GCKeyLANG2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG2: MemorySegment
    get() = GCKeyLANG2_VH.get(GCKeyLANG2_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG2_VH.set(GCKeyLANG2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG3 (Void)*
 */
private val GCKeyLANG3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG3_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG3").orElseThrow().reinterpret(GCKeyLANG3_LAYOUT.byteSize()) }
private val GCKeyLANG3_VH: VarHandle by lazy { GCKeyLANG3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG3: MemorySegment
    get() = GCKeyLANG3_VH.get(GCKeyLANG3_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG3_VH.set(GCKeyLANG3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG4 (Void)*
 */
private val GCKeyLANG4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG4_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG4").orElseThrow().reinterpret(GCKeyLANG4_LAYOUT.byteSize()) }
private val GCKeyLANG4_VH: VarHandle by lazy { GCKeyLANG4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG4: MemorySegment
    get() = GCKeyLANG4_VH.get(GCKeyLANG4_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG4_VH.set(GCKeyLANG4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG5 (Void)*
 */
private val GCKeyLANG5_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG5_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG5").orElseThrow().reinterpret(GCKeyLANG5_LAYOUT.byteSize()) }
private val GCKeyLANG5_VH: VarHandle by lazy { GCKeyLANG5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG5: MemorySegment
    get() = GCKeyLANG5_VH.get(GCKeyLANG5_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG5_VH.set(GCKeyLANG5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG6 (Void)*
 */
private val GCKeyLANG6_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG6_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG6").orElseThrow().reinterpret(GCKeyLANG6_LAYOUT.byteSize()) }
private val GCKeyLANG6_VH: VarHandle by lazy { GCKeyLANG6_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG6: MemorySegment
    get() = GCKeyLANG6_VH.get(GCKeyLANG6_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG6_VH.set(GCKeyLANG6_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG7 (Void)*
 */
private val GCKeyLANG7_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG7_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG7").orElseThrow().reinterpret(GCKeyLANG7_LAYOUT.byteSize()) }
private val GCKeyLANG7_VH: VarHandle by lazy { GCKeyLANG7_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG7: MemorySegment
    get() = GCKeyLANG7_VH.get(GCKeyLANG7_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG7_VH.set(GCKeyLANG7_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG8 (Void)*
 */
private val GCKeyLANG8_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG8_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG8").orElseThrow().reinterpret(GCKeyLANG8_LAYOUT.byteSize()) }
private val GCKeyLANG8_VH: VarHandle by lazy { GCKeyLANG8_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG8: MemorySegment
    get() = GCKeyLANG8_VH.get(GCKeyLANG8_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG8_VH.set(GCKeyLANG8_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLANG9 (Void)*
 */
private val GCKeyLANG9_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLANG9_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLANG9").orElseThrow().reinterpret(GCKeyLANG9_LAYOUT.byteSize()) }
private val GCKeyLANG9_VH: VarHandle by lazy { GCKeyLANG9_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLANG9: MemorySegment
    get() = GCKeyLANG9_VH.get(GCKeyLANG9_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLANG9_VH.set(GCKeyLANG9_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLeftControl (Void)*
 */
private val GCKeyLeftControl_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLeftControl_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLeftControl").orElseThrow().reinterpret(GCKeyLeftControl_LAYOUT.byteSize()) }
private val GCKeyLeftControl_VH: VarHandle by lazy { GCKeyLeftControl_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLeftControl: MemorySegment
    get() = GCKeyLeftControl_VH.get(GCKeyLeftControl_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLeftControl_VH.set(GCKeyLeftControl_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLeftShift (Void)*
 */
private val GCKeyLeftShift_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLeftShift_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLeftShift").orElseThrow().reinterpret(GCKeyLeftShift_LAYOUT.byteSize()) }
private val GCKeyLeftShift_VH: VarHandle by lazy { GCKeyLeftShift_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLeftShift: MemorySegment
    get() = GCKeyLeftShift_VH.get(GCKeyLeftShift_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLeftShift_VH.set(GCKeyLeftShift_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLeftAlt (Void)*
 */
private val GCKeyLeftAlt_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLeftAlt_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLeftAlt").orElseThrow().reinterpret(GCKeyLeftAlt_LAYOUT.byteSize()) }
private val GCKeyLeftAlt_VH: VarHandle by lazy { GCKeyLeftAlt_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLeftAlt: MemorySegment
    get() = GCKeyLeftAlt_VH.get(GCKeyLeftAlt_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLeftAlt_VH.set(GCKeyLeftAlt_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyLeftGUI (Void)*
 */
private val GCKeyLeftGUI_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyLeftGUI_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyLeftGUI").orElseThrow().reinterpret(GCKeyLeftGUI_LAYOUT.byteSize()) }
private val GCKeyLeftGUI_VH: VarHandle by lazy { GCKeyLeftGUI_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyLeftGUI: MemorySegment
    get() = GCKeyLeftGUI_VH.get(GCKeyLeftGUI_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyLeftGUI_VH.set(GCKeyLeftGUI_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyRightControl (Void)*
 */
private val GCKeyRightControl_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyRightControl_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyRightControl").orElseThrow().reinterpret(GCKeyRightControl_LAYOUT.byteSize()) }
private val GCKeyRightControl_VH: VarHandle by lazy { GCKeyRightControl_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyRightControl: MemorySegment
    get() = GCKeyRightControl_VH.get(GCKeyRightControl_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyRightControl_VH.set(GCKeyRightControl_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyRightShift (Void)*
 */
private val GCKeyRightShift_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyRightShift_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyRightShift").orElseThrow().reinterpret(GCKeyRightShift_LAYOUT.byteSize()) }
private val GCKeyRightShift_VH: VarHandle by lazy { GCKeyRightShift_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyRightShift: MemorySegment
    get() = GCKeyRightShift_VH.get(GCKeyRightShift_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyRightShift_VH.set(GCKeyRightShift_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyRightAlt (Void)*
 */
private val GCKeyRightAlt_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyRightAlt_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyRightAlt").orElseThrow().reinterpret(GCKeyRightAlt_LAYOUT.byteSize()) }
private val GCKeyRightAlt_VH: VarHandle by lazy { GCKeyRightAlt_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyRightAlt: MemorySegment
    get() = GCKeyRightAlt_VH.get(GCKeyRightAlt_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyRightAlt_VH.set(GCKeyRightAlt_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyRightGUI (Void)*
 */
private val GCKeyRightGUI_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyRightGUI_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyRightGUI").orElseThrow().reinterpret(GCKeyRightGUI_LAYOUT.byteSize()) }
private val GCKeyRightGUI_VH: VarHandle by lazy { GCKeyRightGUI_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyRightGUI: MemorySegment
    get() = GCKeyRightGUI_VH.get(GCKeyRightGUI_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyRightGUI_VH.set(GCKeyRightGUI_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCInputMicroGamepadDpad (Void)*
 */
private val GCInputMicroGamepadDpad_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCInputMicroGamepadDpad_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCInputMicroGamepadDpad").orElseThrow().reinterpret(GCInputMicroGamepadDpad_LAYOUT.byteSize()) }
private val GCInputMicroGamepadDpad_VH: VarHandle by lazy { GCInputMicroGamepadDpad_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCInputMicroGamepadDpad: MemorySegment
    get() = GCInputMicroGamepadDpad_VH.get(GCInputMicroGamepadDpad_SEGMENT, 0L) as MemorySegment
    set(value) = GCInputMicroGamepadDpad_VH.set(GCInputMicroGamepadDpad_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCInputMicroGamepadButtonA (Void)*
 */
private val GCInputMicroGamepadButtonA_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCInputMicroGamepadButtonA_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCInputMicroGamepadButtonA").orElseThrow().reinterpret(GCInputMicroGamepadButtonA_LAYOUT.byteSize()) }
private val GCInputMicroGamepadButtonA_VH: VarHandle by lazy { GCInputMicroGamepadButtonA_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCInputMicroGamepadButtonA: MemorySegment
    get() = GCInputMicroGamepadButtonA_VH.get(GCInputMicroGamepadButtonA_SEGMENT, 0L) as MemorySegment
    set(value) = GCInputMicroGamepadButtonA_VH.set(GCInputMicroGamepadButtonA_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCInputMicroGamepadButtonX (Void)*
 */
private val GCInputMicroGamepadButtonX_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCInputMicroGamepadButtonX_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCInputMicroGamepadButtonX").orElseThrow().reinterpret(GCInputMicroGamepadButtonX_LAYOUT.byteSize()) }
private val GCInputMicroGamepadButtonX_VH: VarHandle by lazy { GCInputMicroGamepadButtonX_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCInputMicroGamepadButtonX: MemorySegment
    get() = GCInputMicroGamepadButtonX_VH.get(GCInputMicroGamepadButtonX_SEGMENT, 0L) as MemorySegment
    set(value) = GCInputMicroGamepadButtonX_VH.set(GCInputMicroGamepadButtonX_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCInputMicroGamepadButtonMenu (Void)*
 */
private val GCInputMicroGamepadButtonMenu_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCInputMicroGamepadButtonMenu_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCInputMicroGamepadButtonMenu").orElseThrow().reinterpret(GCInputMicroGamepadButtonMenu_LAYOUT.byteSize()) }
private val GCInputMicroGamepadButtonMenu_VH: VarHandle by lazy { GCInputMicroGamepadButtonMenu_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCInputMicroGamepadButtonMenu: MemorySegment
    get() = GCInputMicroGamepadButtonMenu_VH.get(GCInputMicroGamepadButtonMenu_SEGMENT, 0L) as MemorySegment
    set(value) = GCInputMicroGamepadButtonMenu_VH.set(GCInputMicroGamepadButtonMenu_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCCurrentMicroGamepadSnapshotDataVersion typedef const GCMicroGamepadSnapshotDataVersion = Declared(GCMicroGamepadSnapshotDataVersion)
 */
private val GCCurrentMicroGamepadSnapshotDataVersion_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val GCCurrentMicroGamepadSnapshotDataVersion_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCCurrentMicroGamepadSnapshotDataVersion").orElseThrow().reinterpret(GCCurrentMicroGamepadSnapshotDataVersion_LAYOUT.byteSize()) }
private val GCCurrentMicroGamepadSnapshotDataVersion_VH: VarHandle by lazy { GCCurrentMicroGamepadSnapshotDataVersion_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
var GCCurrentMicroGamepadSnapshotDataVersion: GCMicroGamepadSnapshotDataVersion
    get() = GCMicroGamepadSnapshotDataVersion.fromValue(GCCurrentMicroGamepadSnapshotDataVersion_VH.get(GCCurrentMicroGamepadSnapshotDataVersion_SEGMENT, 0L) as Long)
    set(value) = GCCurrentMicroGamepadSnapshotDataVersion_VH.set(GCCurrentMicroGamepadSnapshotDataVersion_SEGMENT, 0L, value.value)

/**
 * {@snippet lang=c : GCMicroGamepadSnapshotDataFromNSData typedef BOOL = Bool((typedef GCMicroGamepadSnapshotData = Declared(GCMicroGamepadSnapshotData))*,typedef NSData = (Void)*)
 */
private val GCMicroGamepadSnapshotDataFromNSData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val GCMicroGamepadSnapshotDataFromNSData_ADDR: MemorySegment by lazy { LOOKUP.find("GCMicroGamepadSnapshotDataFromNSData").orElseThrow() }
private val GCMicroGamepadSnapshotDataFromNSData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(GCMicroGamepadSnapshotDataFromNSData_ADDR, GCMicroGamepadSnapshotDataFromNSData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
fun GCMicroGamepadSnapshotDataFromNSData(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return GCMicroGamepadSnapshotDataFromNSData_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDataFromGCMicroGamepadSnapshotData typedef NSData = (Void)*((typedef GCMicroGamepadSnapshotData = Declared(GCMicroGamepadSnapshotData))*)
 */
private val NSDataFromGCMicroGamepadSnapshotData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSDataFromGCMicroGamepadSnapshotData_ADDR: MemorySegment by lazy { LOOKUP.find("NSDataFromGCMicroGamepadSnapshotData").orElseThrow() }
private val NSDataFromGCMicroGamepadSnapshotData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDataFromGCMicroGamepadSnapshotData_ADDR, NSDataFromGCMicroGamepadSnapshotData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
fun NSDataFromGCMicroGamepadSnapshotData(arg0: MemorySegment): MemorySegment {
    try {
        return NSDataFromGCMicroGamepadSnapshotData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : GCMicroGamepadSnapShotDataV100FromNSData typedef BOOL = Bool((typedef GCMicroGamepadSnapShotDataV100 = Declared(GCMicroGamepadSnapShotDataV100))*,typedef NSData = (Void)*)
 */
private val GCMicroGamepadSnapShotDataV100FromNSData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val GCMicroGamepadSnapShotDataV100FromNSData_ADDR: MemorySegment by lazy { LOOKUP.find("GCMicroGamepadSnapShotDataV100FromNSData").orElseThrow() }
private val GCMicroGamepadSnapShotDataV100FromNSData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(GCMicroGamepadSnapShotDataV100FromNSData_ADDR, GCMicroGamepadSnapShotDataV100FromNSData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
fun GCMicroGamepadSnapShotDataV100FromNSData(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return GCMicroGamepadSnapShotDataV100FromNSData_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDataFromGCMicroGamepadSnapShotDataV100 typedef NSData = (Void)*((typedef GCMicroGamepadSnapShotDataV100 = Declared(GCMicroGamepadSnapShotDataV100))*)
 */
private val NSDataFromGCMicroGamepadSnapShotDataV100_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSDataFromGCMicroGamepadSnapShotDataV100_ADDR: MemorySegment by lazy { LOOKUP.find("NSDataFromGCMicroGamepadSnapShotDataV100").orElseThrow() }
private val NSDataFromGCMicroGamepadSnapShotDataV100_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDataFromGCMicroGamepadSnapShotDataV100_ADDR, NSDataFromGCMicroGamepadSnapShotDataV100_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the -[GCController controllerWithMicroGamepad] method instead")
fun NSDataFromGCMicroGamepadSnapShotDataV100(arg0: MemorySegment): MemorySegment {
    try {
        return NSDataFromGCMicroGamepadSnapShotDataV100_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : GCInputDirectionalDpad (Void)*
 */
private val GCInputDirectionalDpad_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCInputDirectionalDpad_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCInputDirectionalDpad").orElseThrow().reinterpret(GCInputDirectionalDpad_LAYOUT.byteSize()) }
private val GCInputDirectionalDpad_VH: VarHandle by lazy { GCInputDirectionalDpad_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
var GCInputDirectionalDpad: MemorySegment
    get() = GCInputDirectionalDpad_VH.get(GCInputDirectionalDpad_SEGMENT, 0L) as MemorySegment
    set(value) = GCInputDirectionalDpad_VH.set(GCInputDirectionalDpad_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCInputDirectionalTouchSurfaceButton (Void)*
 */
private val GCInputDirectionalTouchSurfaceButton_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCInputDirectionalTouchSurfaceButton_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCInputDirectionalTouchSurfaceButton").orElseThrow().reinterpret(GCInputDirectionalTouchSurfaceButton_LAYOUT.byteSize()) }
private val GCInputDirectionalTouchSurfaceButton_VH: VarHandle by lazy { GCInputDirectionalTouchSurfaceButton_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCInputDirectionalTouchSurfaceButton: MemorySegment
    get() = GCInputDirectionalTouchSurfaceButton_VH.get(GCInputDirectionalTouchSurfaceButton_SEGMENT, 0L) as MemorySegment
    set(value) = GCInputDirectionalTouchSurfaceButton_VH.set(GCInputDirectionalTouchSurfaceButton_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCInputDirectionalCardinalDpad (Void)*
 */
private val GCInputDirectionalCardinalDpad_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCInputDirectionalCardinalDpad_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCInputDirectionalCardinalDpad").orElseThrow().reinterpret(GCInputDirectionalCardinalDpad_LAYOUT.byteSize()) }
private val GCInputDirectionalCardinalDpad_VH: VarHandle by lazy { GCInputDirectionalCardinalDpad_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
var GCInputDirectionalCardinalDpad: MemorySegment
    get() = GCInputDirectionalCardinalDpad_VH.get(GCInputDirectionalCardinalDpad_SEGMENT, 0L) as MemorySegment
    set(value) = GCInputDirectionalCardinalDpad_VH.set(GCInputDirectionalCardinalDpad_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCInputDirectionalCenterButton (Void)*
 */
private val GCInputDirectionalCenterButton_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCInputDirectionalCenterButton_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCInputDirectionalCenterButton").orElseThrow().reinterpret(GCInputDirectionalCenterButton_LAYOUT.byteSize()) }
private val GCInputDirectionalCenterButton_VH: VarHandle by lazy { GCInputDirectionalCenterButton_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var GCInputDirectionalCenterButton: MemorySegment
    get() = GCInputDirectionalCenterButton_VH.get(GCInputDirectionalCenterButton_SEGMENT, 0L) as MemorySegment
    set(value) = GCInputDirectionalCenterButton_VH.set(GCInputDirectionalCenterButton_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCControllerDidConnectNotification (Void)*
 */
private val GCControllerDidConnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCControllerDidConnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCControllerDidConnectNotification").orElseThrow().reinterpret(GCControllerDidConnectNotification_LAYOUT.byteSize()) }
private val GCControllerDidConnectNotification_VH: VarHandle by lazy { GCControllerDidConnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
var GCControllerDidConnectNotification: MemorySegment
    get() = GCControllerDidConnectNotification_VH.get(GCControllerDidConnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCControllerDidConnectNotification_VH.set(GCControllerDidConnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCControllerDidDisconnectNotification (Void)*
 */
private val GCControllerDidDisconnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCControllerDidDisconnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCControllerDidDisconnectNotification").orElseThrow().reinterpret(GCControllerDidDisconnectNotification_LAYOUT.byteSize()) }
private val GCControllerDidDisconnectNotification_VH: VarHandle by lazy { GCControllerDidDisconnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
var GCControllerDidDisconnectNotification: MemorySegment
    get() = GCControllerDidDisconnectNotification_VH.get(GCControllerDidDisconnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCControllerDidDisconnectNotification_VH.set(GCControllerDidDisconnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCControllerDidBecomeCurrentNotification (Void)*
 */
private val GCControllerDidBecomeCurrentNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCControllerDidBecomeCurrentNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCControllerDidBecomeCurrentNotification").orElseThrow().reinterpret(GCControllerDidBecomeCurrentNotification_LAYOUT.byteSize()) }
private val GCControllerDidBecomeCurrentNotification_VH: VarHandle by lazy { GCControllerDidBecomeCurrentNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCControllerDidBecomeCurrentNotification: MemorySegment
    get() = GCControllerDidBecomeCurrentNotification_VH.get(GCControllerDidBecomeCurrentNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCControllerDidBecomeCurrentNotification_VH.set(GCControllerDidBecomeCurrentNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCControllerDidStopBeingCurrentNotification (Void)*
 */
private val GCControllerDidStopBeingCurrentNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCControllerDidStopBeingCurrentNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCControllerDidStopBeingCurrentNotification").orElseThrow().reinterpret(GCControllerDidStopBeingCurrentNotification_LAYOUT.byteSize()) }
private val GCControllerDidStopBeingCurrentNotification_VH: VarHandle by lazy { GCControllerDidStopBeingCurrentNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCControllerDidStopBeingCurrentNotification: MemorySegment
    get() = GCControllerDidStopBeingCurrentNotification_VH.get(GCControllerDidStopBeingCurrentNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCControllerDidStopBeingCurrentNotification_VH.set(GCControllerDidStopBeingCurrentNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCControllerUserCustomizationsDidChangeNotification (Void)*
 */
private val GCControllerUserCustomizationsDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCControllerUserCustomizationsDidChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCControllerUserCustomizationsDidChangeNotification").orElseThrow().reinterpret(GCControllerUserCustomizationsDidChangeNotification_LAYOUT.byteSize()) }
private val GCControllerUserCustomizationsDidChangeNotification_VH: VarHandle by lazy { GCControllerUserCustomizationsDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
var GCControllerUserCustomizationsDidChangeNotification: MemorySegment
    get() = GCControllerUserCustomizationsDidChangeNotification_VH.get(GCControllerUserCustomizationsDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCControllerUserCustomizationsDidChangeNotification_VH.set(GCControllerUserCustomizationsDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCStylusDidConnectNotification (Void)*
 */
private val GCStylusDidConnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCStylusDidConnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCStylusDidConnectNotification").orElseThrow().reinterpret(GCStylusDidConnectNotification_LAYOUT.byteSize()) }
private val GCStylusDidConnectNotification_VH: VarHandle by lazy { GCStylusDidConnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var GCStylusDidConnectNotification: MemorySegment
    get() = GCStylusDidConnectNotification_VH.get(GCStylusDidConnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCStylusDidConnectNotification_VH.set(GCStylusDidConnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCStylusDidDisconnectNotification (Void)*
 */
private val GCStylusDidDisconnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCStylusDidDisconnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCStylusDidDisconnectNotification").orElseThrow().reinterpret(GCStylusDidDisconnectNotification_LAYOUT.byteSize()) }
private val GCStylusDidDisconnectNotification_VH: VarHandle by lazy { GCStylusDidDisconnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var GCStylusDidDisconnectNotification: MemorySegment
    get() = GCStylusDidDisconnectNotification_VH.get(GCStylusDidDisconnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCStylusDidDisconnectNotification_VH.set(GCStylusDidDisconnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyboardDidConnectNotification (Void)*
 */
private val GCKeyboardDidConnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyboardDidConnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyboardDidConnectNotification").orElseThrow().reinterpret(GCKeyboardDidConnectNotification_LAYOUT.byteSize()) }
private val GCKeyboardDidConnectNotification_VH: VarHandle by lazy { GCKeyboardDidConnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyboardDidConnectNotification: MemorySegment
    get() = GCKeyboardDidConnectNotification_VH.get(GCKeyboardDidConnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyboardDidConnectNotification_VH.set(GCKeyboardDidConnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCKeyboardDidDisconnectNotification (Void)*
 */
private val GCKeyboardDidDisconnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCKeyboardDidDisconnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCKeyboardDidDisconnectNotification").orElseThrow().reinterpret(GCKeyboardDidDisconnectNotification_LAYOUT.byteSize()) }
private val GCKeyboardDidDisconnectNotification_VH: VarHandle by lazy { GCKeyboardDidDisconnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCKeyboardDidDisconnectNotification: MemorySegment
    get() = GCKeyboardDidDisconnectNotification_VH.get(GCKeyboardDidDisconnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCKeyboardDidDisconnectNotification_VH.set(GCKeyboardDidDisconnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCMouseDidConnectNotification (Void)*
 */
private val GCMouseDidConnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCMouseDidConnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCMouseDidConnectNotification").orElseThrow().reinterpret(GCMouseDidConnectNotification_LAYOUT.byteSize()) }
private val GCMouseDidConnectNotification_VH: VarHandle by lazy { GCMouseDidConnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var GCMouseDidConnectNotification: MemorySegment
    get() = GCMouseDidConnectNotification_VH.get(GCMouseDidConnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCMouseDidConnectNotification_VH.set(GCMouseDidConnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCMouseDidDisconnectNotification (Void)*
 */
private val GCMouseDidDisconnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCMouseDidDisconnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCMouseDidDisconnectNotification").orElseThrow().reinterpret(GCMouseDidDisconnectNotification_LAYOUT.byteSize()) }
private val GCMouseDidDisconnectNotification_VH: VarHandle by lazy { GCMouseDidDisconnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var GCMouseDidDisconnectNotification: MemorySegment
    get() = GCMouseDidDisconnectNotification_VH.get(GCMouseDidDisconnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCMouseDidDisconnectNotification_VH.set(GCMouseDidDisconnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCMouseDidBecomeCurrentNotification (Void)*
 */
private val GCMouseDidBecomeCurrentNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCMouseDidBecomeCurrentNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCMouseDidBecomeCurrentNotification").orElseThrow().reinterpret(GCMouseDidBecomeCurrentNotification_LAYOUT.byteSize()) }
private val GCMouseDidBecomeCurrentNotification_VH: VarHandle by lazy { GCMouseDidBecomeCurrentNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var GCMouseDidBecomeCurrentNotification: MemorySegment
    get() = GCMouseDidBecomeCurrentNotification_VH.get(GCMouseDidBecomeCurrentNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCMouseDidBecomeCurrentNotification_VH.set(GCMouseDidBecomeCurrentNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCMouseDidStopBeingCurrentNotification (Void)*
 */
private val GCMouseDidStopBeingCurrentNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCMouseDidStopBeingCurrentNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCMouseDidStopBeingCurrentNotification").orElseThrow().reinterpret(GCMouseDidStopBeingCurrentNotification_LAYOUT.byteSize()) }
private val GCMouseDidStopBeingCurrentNotification_VH: VarHandle by lazy { GCMouseDidStopBeingCurrentNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var GCMouseDidStopBeingCurrentNotification: MemorySegment
    get() = GCMouseDidStopBeingCurrentNotification_VH.get(GCMouseDidStopBeingCurrentNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCMouseDidStopBeingCurrentNotification_VH.set(GCMouseDidStopBeingCurrentNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCRacingWheelDidConnectNotification (Void)*
 */
private val GCRacingWheelDidConnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCRacingWheelDidConnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCRacingWheelDidConnectNotification").orElseThrow().reinterpret(GCRacingWheelDidConnectNotification_LAYOUT.byteSize()) }
private val GCRacingWheelDidConnectNotification_VH: VarHandle by lazy { GCRacingWheelDidConnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
var GCRacingWheelDidConnectNotification: MemorySegment
    get() = GCRacingWheelDidConnectNotification_VH.get(GCRacingWheelDidConnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCRacingWheelDidConnectNotification_VH.set(GCRacingWheelDidConnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCRacingWheelDidDisconnectNotification (Void)*
 */
private val GCRacingWheelDidDisconnectNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCRacingWheelDidDisconnectNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCRacingWheelDidDisconnectNotification").orElseThrow().reinterpret(GCRacingWheelDidDisconnectNotification_LAYOUT.byteSize()) }
private val GCRacingWheelDidDisconnectNotification_VH: VarHandle by lazy { GCRacingWheelDidDisconnectNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
var GCRacingWheelDidDisconnectNotification: MemorySegment
    get() = GCRacingWheelDidDisconnectNotification_VH.get(GCRacingWheelDidDisconnectNotification_SEGMENT, 0L) as MemorySegment
    set(value) = GCRacingWheelDidDisconnectNotification_VH.set(GCRacingWheelDidDisconnectNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityDefault typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityDefault_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityDefault_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityDefault").orElseThrow().reinterpret(GCHapticsLocalityDefault_LAYOUT.byteSize()) }
private val GCHapticsLocalityDefault_VH: VarHandle by lazy { GCHapticsLocalityDefault_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityDefault: MemorySegment
    get() = GCHapticsLocalityDefault_VH.get(GCHapticsLocalityDefault_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityDefault_VH.set(GCHapticsLocalityDefault_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityAll typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityAll_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityAll_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityAll").orElseThrow().reinterpret(GCHapticsLocalityAll_LAYOUT.byteSize()) }
private val GCHapticsLocalityAll_VH: VarHandle by lazy { GCHapticsLocalityAll_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityAll: MemorySegment
    get() = GCHapticsLocalityAll_VH.get(GCHapticsLocalityAll_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityAll_VH.set(GCHapticsLocalityAll_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityHandles typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityHandles_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityHandles_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityHandles").orElseThrow().reinterpret(GCHapticsLocalityHandles_LAYOUT.byteSize()) }
private val GCHapticsLocalityHandles_VH: VarHandle by lazy { GCHapticsLocalityHandles_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityHandles: MemorySegment
    get() = GCHapticsLocalityHandles_VH.get(GCHapticsLocalityHandles_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityHandles_VH.set(GCHapticsLocalityHandles_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityLeftHandle typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityLeftHandle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityLeftHandle_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityLeftHandle").orElseThrow().reinterpret(GCHapticsLocalityLeftHandle_LAYOUT.byteSize()) }
private val GCHapticsLocalityLeftHandle_VH: VarHandle by lazy { GCHapticsLocalityLeftHandle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityLeftHandle: MemorySegment
    get() = GCHapticsLocalityLeftHandle_VH.get(GCHapticsLocalityLeftHandle_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityLeftHandle_VH.set(GCHapticsLocalityLeftHandle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityRightHandle typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityRightHandle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityRightHandle_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityRightHandle").orElseThrow().reinterpret(GCHapticsLocalityRightHandle_LAYOUT.byteSize()) }
private val GCHapticsLocalityRightHandle_VH: VarHandle by lazy { GCHapticsLocalityRightHandle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityRightHandle: MemorySegment
    get() = GCHapticsLocalityRightHandle_VH.get(GCHapticsLocalityRightHandle_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityRightHandle_VH.set(GCHapticsLocalityRightHandle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityTriggers typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityTriggers_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityTriggers_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityTriggers").orElseThrow().reinterpret(GCHapticsLocalityTriggers_LAYOUT.byteSize()) }
private val GCHapticsLocalityTriggers_VH: VarHandle by lazy { GCHapticsLocalityTriggers_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityTriggers: MemorySegment
    get() = GCHapticsLocalityTriggers_VH.get(GCHapticsLocalityTriggers_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityTriggers_VH.set(GCHapticsLocalityTriggers_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityLeftTrigger typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityLeftTrigger_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityLeftTrigger_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityLeftTrigger").orElseThrow().reinterpret(GCHapticsLocalityLeftTrigger_LAYOUT.byteSize()) }
private val GCHapticsLocalityLeftTrigger_VH: VarHandle by lazy { GCHapticsLocalityLeftTrigger_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityLeftTrigger: MemorySegment
    get() = GCHapticsLocalityLeftTrigger_VH.get(GCHapticsLocalityLeftTrigger_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityLeftTrigger_VH.set(GCHapticsLocalityLeftTrigger_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityRightTrigger typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityRightTrigger_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityRightTrigger_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityRightTrigger").orElseThrow().reinterpret(GCHapticsLocalityRightTrigger_LAYOUT.byteSize()) }
private val GCHapticsLocalityRightTrigger_VH: VarHandle by lazy { GCHapticsLocalityRightTrigger_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityRightTrigger: MemorySegment
    get() = GCHapticsLocalityRightTrigger_VH.get(GCHapticsLocalityRightTrigger_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityRightTrigger_VH.set(GCHapticsLocalityRightTrigger_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticDurationInfinite Float
 */
private val GCHapticDurationInfinite_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_FLOAT }
private val GCHapticDurationInfinite_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticDurationInfinite").orElseThrow().reinterpret(GCHapticDurationInfinite_LAYOUT.byteSize()) }
private val GCHapticDurationInfinite_VH: VarHandle by lazy { GCHapticDurationInfinite_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticDurationInfinite: Float
    get() = GCHapticDurationInfinite_VH.get(GCHapticDurationInfinite_SEGMENT, 0L) as Float
    set(value) = GCHapticDurationInfinite_VH.set(GCHapticDurationInfinite_SEGMENT, 0L, value)
