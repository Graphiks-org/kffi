@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : NSURLPathKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLPathKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLPathKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLPathKey").orElseThrow().reinterpret(NSURLPathKey_LAYOUT.byteSize()) }
private val NSURLPathKey_VH: VarHandle by lazy { NSURLPathKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLPathKey: MemorySegment
    get() = NSURLPathKey_VH.get(NSURLPathKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLPathKey_VH.set(NSURLPathKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLCanonicalPathKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLCanonicalPathKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLCanonicalPathKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLCanonicalPathKey").orElseThrow().reinterpret(NSURLCanonicalPathKey_LAYOUT.byteSize()) }
private val NSURLCanonicalPathKey_VH: VarHandle by lazy { NSURLCanonicalPathKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var NSURLCanonicalPathKey: MemorySegment
    get() = NSURLCanonicalPathKey_VH.get(NSURLCanonicalPathKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLCanonicalPathKey_VH.set(NSURLCanonicalPathKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsMountTriggerKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsMountTriggerKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsMountTriggerKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsMountTriggerKey").orElseThrow().reinterpret(NSURLIsMountTriggerKey_LAYOUT.byteSize()) }
private val NSURLIsMountTriggerKey_VH: VarHandle by lazy { NSURLIsMountTriggerKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsMountTriggerKey: MemorySegment
    get() = NSURLIsMountTriggerKey_VH.get(NSURLIsMountTriggerKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsMountTriggerKey_VH.set(NSURLIsMountTriggerKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLGenerationIdentifierKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLGenerationIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLGenerationIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLGenerationIdentifierKey").orElseThrow().reinterpret(NSURLGenerationIdentifierKey_LAYOUT.byteSize()) }
private val NSURLGenerationIdentifierKey_VH: VarHandle by lazy { NSURLGenerationIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLGenerationIdentifierKey: MemorySegment
    get() = NSURLGenerationIdentifierKey_VH.get(NSURLGenerationIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLGenerationIdentifierKey_VH.set(NSURLGenerationIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLDocumentIdentifierKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLDocumentIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLDocumentIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLDocumentIdentifierKey").orElseThrow().reinterpret(NSURLDocumentIdentifierKey_LAYOUT.byteSize()) }
private val NSURLDocumentIdentifierKey_VH: VarHandle by lazy { NSURLDocumentIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLDocumentIdentifierKey: MemorySegment
    get() = NSURLDocumentIdentifierKey_VH.get(NSURLDocumentIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLDocumentIdentifierKey_VH.set(NSURLDocumentIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAddedToDirectoryDateKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLAddedToDirectoryDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAddedToDirectoryDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLAddedToDirectoryDateKey").orElseThrow().reinterpret(NSURLAddedToDirectoryDateKey_LAYOUT.byteSize()) }
private val NSURLAddedToDirectoryDateKey_VH: VarHandle by lazy { NSURLAddedToDirectoryDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAddedToDirectoryDateKey: MemorySegment
    get() = NSURLAddedToDirectoryDateKey_VH.get(NSURLAddedToDirectoryDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAddedToDirectoryDateKey_VH.set(NSURLAddedToDirectoryDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLQuarantinePropertiesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLQuarantinePropertiesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLQuarantinePropertiesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLQuarantinePropertiesKey").orElseThrow().reinterpret(NSURLQuarantinePropertiesKey_LAYOUT.byteSize()) }
private val NSURLQuarantinePropertiesKey_VH: VarHandle by lazy { NSURLQuarantinePropertiesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLQuarantinePropertiesKey: MemorySegment
    get() = NSURLQuarantinePropertiesKey_VH.get(NSURLQuarantinePropertiesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLQuarantinePropertiesKey_VH.set(NSURLQuarantinePropertiesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLFileResourceTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeKey").orElseThrow().reinterpret(NSURLFileResourceTypeKey_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeKey_VH: VarHandle by lazy { NSURLFileResourceTypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeKey: MemorySegment
    get() = NSURLFileResourceTypeKey_VH.get(NSURLFileResourceTypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeKey_VH.set(NSURLFileResourceTypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileIdentifierKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLFileIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileIdentifierKey").orElseThrow().reinterpret(NSURLFileIdentifierKey_LAYOUT.byteSize()) }
private val NSURLFileIdentifierKey_VH: VarHandle by lazy { NSURLFileIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 4, introducedSubminor = -1)
var NSURLFileIdentifierKey: MemorySegment
    get() = NSURLFileIdentifierKey_VH.get(NSURLFileIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileIdentifierKey_VH.set(NSURLFileIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileContentIdentifierKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLFileContentIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileContentIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileContentIdentifierKey").orElseThrow().reinterpret(NSURLFileContentIdentifierKey_LAYOUT.byteSize()) }
private val NSURLFileContentIdentifierKey_VH: VarHandle by lazy { NSURLFileContentIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileContentIdentifierKey: MemorySegment
    get() = NSURLFileContentIdentifierKey_VH.get(NSURLFileContentIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileContentIdentifierKey_VH.set(NSURLFileContentIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLMayShareFileContentKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLMayShareFileContentKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLMayShareFileContentKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLMayShareFileContentKey").orElseThrow().reinterpret(NSURLMayShareFileContentKey_LAYOUT.byteSize()) }
private val NSURLMayShareFileContentKey_VH: VarHandle by lazy { NSURLMayShareFileContentKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var NSURLMayShareFileContentKey: MemorySegment
    get() = NSURLMayShareFileContentKey_VH.get(NSURLMayShareFileContentKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLMayShareFileContentKey_VH.set(NSURLMayShareFileContentKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLMayHaveExtendedAttributesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLMayHaveExtendedAttributesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLMayHaveExtendedAttributesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLMayHaveExtendedAttributesKey").orElseThrow().reinterpret(NSURLMayHaveExtendedAttributesKey_LAYOUT.byteSize()) }
private val NSURLMayHaveExtendedAttributesKey_VH: VarHandle by lazy { NSURLMayHaveExtendedAttributesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var NSURLMayHaveExtendedAttributesKey: MemorySegment
    get() = NSURLMayHaveExtendedAttributesKey_VH.get(NSURLMayHaveExtendedAttributesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLMayHaveExtendedAttributesKey_VH.set(NSURLMayHaveExtendedAttributesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsPurgeableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsPurgeableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsPurgeableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsPurgeableKey").orElseThrow().reinterpret(NSURLIsPurgeableKey_LAYOUT.byteSize()) }
private val NSURLIsPurgeableKey_VH: VarHandle by lazy { NSURLIsPurgeableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsPurgeableKey: MemorySegment
    get() = NSURLIsPurgeableKey_VH.get(NSURLIsPurgeableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsPurgeableKey_VH.set(NSURLIsPurgeableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsSparseKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsSparseKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsSparseKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsSparseKey").orElseThrow().reinterpret(NSURLIsSparseKey_LAYOUT.byteSize()) }
private val NSURLIsSparseKey_VH: VarHandle by lazy { NSURLIsSparseKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsSparseKey: MemorySegment
    get() = NSURLIsSparseKey_VH.get(NSURLIsSparseKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsSparseKey_VH.set(NSURLIsSparseKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeNamedPipe typedef const NSURLFileResourceType = (Void)*
 */
private val NSURLFileResourceTypeNamedPipe_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeNamedPipe_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeNamedPipe").orElseThrow().reinterpret(NSURLFileResourceTypeNamedPipe_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeNamedPipe_VH: VarHandle by lazy { NSURLFileResourceTypeNamedPipe_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeNamedPipe: MemorySegment
    get() = NSURLFileResourceTypeNamedPipe_VH.get(NSURLFileResourceTypeNamedPipe_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeNamedPipe_VH.set(NSURLFileResourceTypeNamedPipe_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeCharacterSpecial typedef const NSURLFileResourceType = (Void)*
 */
private val NSURLFileResourceTypeCharacterSpecial_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeCharacterSpecial_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeCharacterSpecial").orElseThrow().reinterpret(NSURLFileResourceTypeCharacterSpecial_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeCharacterSpecial_VH: VarHandle by lazy { NSURLFileResourceTypeCharacterSpecial_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeCharacterSpecial: MemorySegment
    get() = NSURLFileResourceTypeCharacterSpecial_VH.get(NSURLFileResourceTypeCharacterSpecial_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeCharacterSpecial_VH.set(NSURLFileResourceTypeCharacterSpecial_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeDirectory typedef const NSURLFileResourceType = (Void)*
 */
private val NSURLFileResourceTypeDirectory_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeDirectory_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeDirectory").orElseThrow().reinterpret(NSURLFileResourceTypeDirectory_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeDirectory_VH: VarHandle by lazy { NSURLFileResourceTypeDirectory_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeDirectory: MemorySegment
    get() = NSURLFileResourceTypeDirectory_VH.get(NSURLFileResourceTypeDirectory_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeDirectory_VH.set(NSURLFileResourceTypeDirectory_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeBlockSpecial typedef const NSURLFileResourceType = (Void)*
 */
private val NSURLFileResourceTypeBlockSpecial_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeBlockSpecial_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeBlockSpecial").orElseThrow().reinterpret(NSURLFileResourceTypeBlockSpecial_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeBlockSpecial_VH: VarHandle by lazy { NSURLFileResourceTypeBlockSpecial_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeBlockSpecial: MemorySegment
    get() = NSURLFileResourceTypeBlockSpecial_VH.get(NSURLFileResourceTypeBlockSpecial_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeBlockSpecial_VH.set(NSURLFileResourceTypeBlockSpecial_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeRegular typedef const NSURLFileResourceType = (Void)*
 */
private val NSURLFileResourceTypeRegular_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeRegular_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeRegular").orElseThrow().reinterpret(NSURLFileResourceTypeRegular_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeRegular_VH: VarHandle by lazy { NSURLFileResourceTypeRegular_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeRegular: MemorySegment
    get() = NSURLFileResourceTypeRegular_VH.get(NSURLFileResourceTypeRegular_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeRegular_VH.set(NSURLFileResourceTypeRegular_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeSymbolicLink typedef const NSURLFileResourceType = (Void)*
 */
private val NSURLFileResourceTypeSymbolicLink_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeSymbolicLink_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeSymbolicLink").orElseThrow().reinterpret(NSURLFileResourceTypeSymbolicLink_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeSymbolicLink_VH: VarHandle by lazy { NSURLFileResourceTypeSymbolicLink_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeSymbolicLink: MemorySegment
    get() = NSURLFileResourceTypeSymbolicLink_VH.get(NSURLFileResourceTypeSymbolicLink_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeSymbolicLink_VH.set(NSURLFileResourceTypeSymbolicLink_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeSocket typedef const NSURLFileResourceType = (Void)*
 */
private val NSURLFileResourceTypeSocket_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeSocket_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeSocket").orElseThrow().reinterpret(NSURLFileResourceTypeSocket_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeSocket_VH: VarHandle by lazy { NSURLFileResourceTypeSocket_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeSocket: MemorySegment
    get() = NSURLFileResourceTypeSocket_VH.get(NSURLFileResourceTypeSocket_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeSocket_VH.set(NSURLFileResourceTypeSocket_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceTypeUnknown typedef const NSURLFileResourceType = (Void)*
 */
private val NSURLFileResourceTypeUnknown_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceTypeUnknown_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceTypeUnknown").orElseThrow().reinterpret(NSURLFileResourceTypeUnknown_LAYOUT.byteSize()) }
private val NSURLFileResourceTypeUnknown_VH: VarHandle by lazy { NSURLFileResourceTypeUnknown_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceTypeUnknown: MemorySegment
    get() = NSURLFileResourceTypeUnknown_VH.get(NSURLFileResourceTypeUnknown_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceTypeUnknown_VH.set(NSURLFileResourceTypeUnknown_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLThumbnailDictionaryKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLThumbnailDictionaryKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLThumbnailDictionaryKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLThumbnailDictionaryKey").orElseThrow().reinterpret(NSURLThumbnailDictionaryKey_LAYOUT.byteSize()) }
private val NSURLThumbnailDictionaryKey_VH: VarHandle by lazy { NSURLThumbnailDictionaryKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
var NSURLThumbnailDictionaryKey: MemorySegment
    get() = NSURLThumbnailDictionaryKey_VH.get(NSURLThumbnailDictionaryKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLThumbnailDictionaryKey_VH.set(NSURLThumbnailDictionaryKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLThumbnailKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLThumbnailKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLThumbnailKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLThumbnailKey").orElseThrow().reinterpret(NSURLThumbnailKey_LAYOUT.byteSize()) }
private val NSURLThumbnailKey_VH: VarHandle by lazy { NSURLThumbnailKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLThumbnailKey: MemorySegment
    get() = NSURLThumbnailKey_VH.get(NSURLThumbnailKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLThumbnailKey_VH.set(NSURLThumbnailKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSThumbnail1024x1024SizeKey typedef const NSURLThumbnailDictionaryItem = (Void)*
 */
private val NSThumbnail1024x1024SizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSThumbnail1024x1024SizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSThumbnail1024x1024SizeKey").orElseThrow().reinterpret(NSThumbnail1024x1024SizeKey_LAYOUT.byteSize()) }
private val NSThumbnail1024x1024SizeKey_VH: VarHandle by lazy { NSThumbnail1024x1024SizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the QuickLookThumbnailing framework and extension point instead")
var NSThumbnail1024x1024SizeKey: MemorySegment
    get() = NSThumbnail1024x1024SizeKey_VH.get(NSThumbnail1024x1024SizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSThumbnail1024x1024SizeKey_VH.set(NSThumbnail1024x1024SizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileSizeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLFileSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileSizeKey").orElseThrow().reinterpret(NSURLFileSizeKey_LAYOUT.byteSize()) }
private val NSURLFileSizeKey_VH: VarHandle by lazy { NSURLFileSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileSizeKey: MemorySegment
    get() = NSURLFileSizeKey_VH.get(NSURLFileSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileSizeKey_VH.set(NSURLFileSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileAllocatedSizeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLFileAllocatedSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileAllocatedSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileAllocatedSizeKey").orElseThrow().reinterpret(NSURLFileAllocatedSizeKey_LAYOUT.byteSize()) }
private val NSURLFileAllocatedSizeKey_VH: VarHandle by lazy { NSURLFileAllocatedSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileAllocatedSizeKey: MemorySegment
    get() = NSURLFileAllocatedSizeKey_VH.get(NSURLFileAllocatedSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileAllocatedSizeKey_VH.set(NSURLFileAllocatedSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLTotalFileSizeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLTotalFileSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLTotalFileSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLTotalFileSizeKey").orElseThrow().reinterpret(NSURLTotalFileSizeKey_LAYOUT.byteSize()) }
private val NSURLTotalFileSizeKey_VH: VarHandle by lazy { NSURLTotalFileSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLTotalFileSizeKey: MemorySegment
    get() = NSURLTotalFileSizeKey_VH.get(NSURLTotalFileSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLTotalFileSizeKey_VH.set(NSURLTotalFileSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLTotalFileAllocatedSizeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLTotalFileAllocatedSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLTotalFileAllocatedSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLTotalFileAllocatedSizeKey").orElseThrow().reinterpret(NSURLTotalFileAllocatedSizeKey_LAYOUT.byteSize()) }
private val NSURLTotalFileAllocatedSizeKey_VH: VarHandle by lazy { NSURLTotalFileAllocatedSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLTotalFileAllocatedSizeKey: MemorySegment
    get() = NSURLTotalFileAllocatedSizeKey_VH.get(NSURLTotalFileAllocatedSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLTotalFileAllocatedSizeKey_VH.set(NSURLTotalFileAllocatedSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsAliasFileKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsAliasFileKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsAliasFileKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsAliasFileKey").orElseThrow().reinterpret(NSURLIsAliasFileKey_LAYOUT.byteSize()) }
private val NSURLIsAliasFileKey_VH: VarHandle by lazy { NSURLIsAliasFileKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsAliasFileKey: MemorySegment
    get() = NSURLIsAliasFileKey_VH.get(NSURLIsAliasFileKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsAliasFileKey_VH.set(NSURLIsAliasFileKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileProtectionKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLFileProtectionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileProtectionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileProtectionKey").orElseThrow().reinterpret(NSURLFileProtectionKey_LAYOUT.byteSize()) }
private val NSURLFileProtectionKey_VH: VarHandle by lazy { NSURLFileProtectionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileProtectionKey: MemorySegment
    get() = NSURLFileProtectionKey_VH.get(NSURLFileProtectionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileProtectionKey_VH.set(NSURLFileProtectionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileProtectionNone typedef const NSURLFileProtectionType = (Void)*
 */
private val NSURLFileProtectionNone_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileProtectionNone_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileProtectionNone").orElseThrow().reinterpret(NSURLFileProtectionNone_LAYOUT.byteSize()) }
private val NSURLFileProtectionNone_VH: VarHandle by lazy { NSURLFileProtectionNone_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileProtectionNone: MemorySegment
    get() = NSURLFileProtectionNone_VH.get(NSURLFileProtectionNone_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileProtectionNone_VH.set(NSURLFileProtectionNone_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileProtectionComplete typedef const NSURLFileProtectionType = (Void)*
 */
private val NSURLFileProtectionComplete_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileProtectionComplete_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileProtectionComplete").orElseThrow().reinterpret(NSURLFileProtectionComplete_LAYOUT.byteSize()) }
private val NSURLFileProtectionComplete_VH: VarHandle by lazy { NSURLFileProtectionComplete_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileProtectionComplete: MemorySegment
    get() = NSURLFileProtectionComplete_VH.get(NSURLFileProtectionComplete_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileProtectionComplete_VH.set(NSURLFileProtectionComplete_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileProtectionCompleteUnlessOpen typedef const NSURLFileProtectionType = (Void)*
 */
private val NSURLFileProtectionCompleteUnlessOpen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileProtectionCompleteUnlessOpen_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileProtectionCompleteUnlessOpen").orElseThrow().reinterpret(NSURLFileProtectionCompleteUnlessOpen_LAYOUT.byteSize()) }
private val NSURLFileProtectionCompleteUnlessOpen_VH: VarHandle by lazy { NSURLFileProtectionCompleteUnlessOpen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileProtectionCompleteUnlessOpen: MemorySegment
    get() = NSURLFileProtectionCompleteUnlessOpen_VH.get(NSURLFileProtectionCompleteUnlessOpen_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileProtectionCompleteUnlessOpen_VH.set(NSURLFileProtectionCompleteUnlessOpen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileProtectionCompleteUntilFirstUserAuthentication typedef const NSURLFileProtectionType = (Void)*
 */
private val NSURLFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileProtectionCompleteUntilFirstUserAuthentication").orElseThrow().reinterpret(NSURLFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT.byteSize()) }
private val NSURLFileProtectionCompleteUntilFirstUserAuthentication_VH: VarHandle by lazy { NSURLFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileProtectionCompleteUntilFirstUserAuthentication: MemorySegment
    get() = NSURLFileProtectionCompleteUntilFirstUserAuthentication_VH.get(NSURLFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileProtectionCompleteUntilFirstUserAuthentication_VH.set(NSURLFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileProtectionCompleteWhenUserInactive typedef const NSURLFileProtectionType = (Void)*
 */
private val NSURLFileProtectionCompleteWhenUserInactive_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileProtectionCompleteWhenUserInactive_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileProtectionCompleteWhenUserInactive").orElseThrow().reinterpret(NSURLFileProtectionCompleteWhenUserInactive_LAYOUT.byteSize()) }
private val NSURLFileProtectionCompleteWhenUserInactive_VH: VarHandle by lazy { NSURLFileProtectionCompleteWhenUserInactive_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileProtectionCompleteWhenUserInactive: MemorySegment
    get() = NSURLFileProtectionCompleteWhenUserInactive_VH.get(NSURLFileProtectionCompleteWhenUserInactive_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileProtectionCompleteWhenUserInactive_VH.set(NSURLFileProtectionCompleteWhenUserInactive_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLDirectoryEntryCountKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLDirectoryEntryCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLDirectoryEntryCountKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLDirectoryEntryCountKey").orElseThrow().reinterpret(NSURLDirectoryEntryCountKey_LAYOUT.byteSize()) }
private val NSURLDirectoryEntryCountKey_VH: VarHandle by lazy { NSURLDirectoryEntryCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var NSURLDirectoryEntryCountKey: MemorySegment
    get() = NSURLDirectoryEntryCountKey_VH.get(NSURLDirectoryEntryCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLDirectoryEntryCountKey_VH.set(NSURLDirectoryEntryCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeLocalizedFormatDescriptionKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeLocalizedFormatDescriptionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeLocalizedFormatDescriptionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeLocalizedFormatDescriptionKey").orElseThrow().reinterpret(NSURLVolumeLocalizedFormatDescriptionKey_LAYOUT.byteSize()) }
private val NSURLVolumeLocalizedFormatDescriptionKey_VH: VarHandle by lazy { NSURLVolumeLocalizedFormatDescriptionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeLocalizedFormatDescriptionKey: MemorySegment
    get() = NSURLVolumeLocalizedFormatDescriptionKey_VH.get(NSURLVolumeLocalizedFormatDescriptionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeLocalizedFormatDescriptionKey_VH.set(NSURLVolumeLocalizedFormatDescriptionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeTotalCapacityKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeTotalCapacityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeTotalCapacityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeTotalCapacityKey").orElseThrow().reinterpret(NSURLVolumeTotalCapacityKey_LAYOUT.byteSize()) }
private val NSURLVolumeTotalCapacityKey_VH: VarHandle by lazy { NSURLVolumeTotalCapacityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeTotalCapacityKey: MemorySegment
    get() = NSURLVolumeTotalCapacityKey_VH.get(NSURLVolumeTotalCapacityKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeTotalCapacityKey_VH.set(NSURLVolumeTotalCapacityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeAvailableCapacityKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeAvailableCapacityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeAvailableCapacityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeAvailableCapacityKey").orElseThrow().reinterpret(NSURLVolumeAvailableCapacityKey_LAYOUT.byteSize()) }
private val NSURLVolumeAvailableCapacityKey_VH: VarHandle by lazy { NSURLVolumeAvailableCapacityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeAvailableCapacityKey: MemorySegment
    get() = NSURLVolumeAvailableCapacityKey_VH.get(NSURLVolumeAvailableCapacityKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeAvailableCapacityKey_VH.set(NSURLVolumeAvailableCapacityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeResourceCountKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeResourceCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeResourceCountKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeResourceCountKey").orElseThrow().reinterpret(NSURLVolumeResourceCountKey_LAYOUT.byteSize()) }
private val NSURLVolumeResourceCountKey_VH: VarHandle by lazy { NSURLVolumeResourceCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeResourceCountKey: MemorySegment
    get() = NSURLVolumeResourceCountKey_VH.get(NSURLVolumeResourceCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeResourceCountKey_VH.set(NSURLVolumeResourceCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsPersistentIDsKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsPersistentIDsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsPersistentIDsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsPersistentIDsKey").orElseThrow().reinterpret(NSURLVolumeSupportsPersistentIDsKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsPersistentIDsKey_VH: VarHandle by lazy { NSURLVolumeSupportsPersistentIDsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsPersistentIDsKey: MemorySegment
    get() = NSURLVolumeSupportsPersistentIDsKey_VH.get(NSURLVolumeSupportsPersistentIDsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsPersistentIDsKey_VH.set(NSURLVolumeSupportsPersistentIDsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsSymbolicLinksKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsSymbolicLinksKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsSymbolicLinksKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsSymbolicLinksKey").orElseThrow().reinterpret(NSURLVolumeSupportsSymbolicLinksKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsSymbolicLinksKey_VH: VarHandle by lazy { NSURLVolumeSupportsSymbolicLinksKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsSymbolicLinksKey: MemorySegment
    get() = NSURLVolumeSupportsSymbolicLinksKey_VH.get(NSURLVolumeSupportsSymbolicLinksKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsSymbolicLinksKey_VH.set(NSURLVolumeSupportsSymbolicLinksKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsHardLinksKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsHardLinksKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsHardLinksKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsHardLinksKey").orElseThrow().reinterpret(NSURLVolumeSupportsHardLinksKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsHardLinksKey_VH: VarHandle by lazy { NSURLVolumeSupportsHardLinksKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsHardLinksKey: MemorySegment
    get() = NSURLVolumeSupportsHardLinksKey_VH.get(NSURLVolumeSupportsHardLinksKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsHardLinksKey_VH.set(NSURLVolumeSupportsHardLinksKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsJournalingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsJournalingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsJournalingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsJournalingKey").orElseThrow().reinterpret(NSURLVolumeSupportsJournalingKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsJournalingKey_VH: VarHandle by lazy { NSURLVolumeSupportsJournalingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsJournalingKey: MemorySegment
    get() = NSURLVolumeSupportsJournalingKey_VH.get(NSURLVolumeSupportsJournalingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsJournalingKey_VH.set(NSURLVolumeSupportsJournalingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsJournalingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsJournalingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsJournalingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsJournalingKey").orElseThrow().reinterpret(NSURLVolumeIsJournalingKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsJournalingKey_VH: VarHandle by lazy { NSURLVolumeIsJournalingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsJournalingKey: MemorySegment
    get() = NSURLVolumeIsJournalingKey_VH.get(NSURLVolumeIsJournalingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsJournalingKey_VH.set(NSURLVolumeIsJournalingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsSparseFilesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsSparseFilesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsSparseFilesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsSparseFilesKey").orElseThrow().reinterpret(NSURLVolumeSupportsSparseFilesKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsSparseFilesKey_VH: VarHandle by lazy { NSURLVolumeSupportsSparseFilesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsSparseFilesKey: MemorySegment
    get() = NSURLVolumeSupportsSparseFilesKey_VH.get(NSURLVolumeSupportsSparseFilesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsSparseFilesKey_VH.set(NSURLVolumeSupportsSparseFilesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsZeroRunsKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsZeroRunsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsZeroRunsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsZeroRunsKey").orElseThrow().reinterpret(NSURLVolumeSupportsZeroRunsKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsZeroRunsKey_VH: VarHandle by lazy { NSURLVolumeSupportsZeroRunsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsZeroRunsKey: MemorySegment
    get() = NSURLVolumeSupportsZeroRunsKey_VH.get(NSURLVolumeSupportsZeroRunsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsZeroRunsKey_VH.set(NSURLVolumeSupportsZeroRunsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsCaseSensitiveNamesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsCaseSensitiveNamesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsCaseSensitiveNamesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsCaseSensitiveNamesKey").orElseThrow().reinterpret(NSURLVolumeSupportsCaseSensitiveNamesKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsCaseSensitiveNamesKey_VH: VarHandle by lazy { NSURLVolumeSupportsCaseSensitiveNamesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsCaseSensitiveNamesKey: MemorySegment
    get() = NSURLVolumeSupportsCaseSensitiveNamesKey_VH.get(NSURLVolumeSupportsCaseSensitiveNamesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsCaseSensitiveNamesKey_VH.set(NSURLVolumeSupportsCaseSensitiveNamesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsCasePreservedNamesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsCasePreservedNamesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsCasePreservedNamesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsCasePreservedNamesKey").orElseThrow().reinterpret(NSURLVolumeSupportsCasePreservedNamesKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsCasePreservedNamesKey_VH: VarHandle by lazy { NSURLVolumeSupportsCasePreservedNamesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsCasePreservedNamesKey: MemorySegment
    get() = NSURLVolumeSupportsCasePreservedNamesKey_VH.get(NSURLVolumeSupportsCasePreservedNamesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsCasePreservedNamesKey_VH.set(NSURLVolumeSupportsCasePreservedNamesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsRootDirectoryDatesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsRootDirectoryDatesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsRootDirectoryDatesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsRootDirectoryDatesKey").orElseThrow().reinterpret(NSURLVolumeSupportsRootDirectoryDatesKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsRootDirectoryDatesKey_VH: VarHandle by lazy { NSURLVolumeSupportsRootDirectoryDatesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsRootDirectoryDatesKey: MemorySegment
    get() = NSURLVolumeSupportsRootDirectoryDatesKey_VH.get(NSURLVolumeSupportsRootDirectoryDatesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsRootDirectoryDatesKey_VH.set(NSURLVolumeSupportsRootDirectoryDatesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsVolumeSizesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsVolumeSizesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsVolumeSizesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsVolumeSizesKey").orElseThrow().reinterpret(NSURLVolumeSupportsVolumeSizesKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsVolumeSizesKey_VH: VarHandle by lazy { NSURLVolumeSupportsVolumeSizesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsVolumeSizesKey: MemorySegment
    get() = NSURLVolumeSupportsVolumeSizesKey_VH.get(NSURLVolumeSupportsVolumeSizesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsVolumeSizesKey_VH.set(NSURLVolumeSupportsVolumeSizesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsRenamingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsRenamingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsRenamingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsRenamingKey").orElseThrow().reinterpret(NSURLVolumeSupportsRenamingKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsRenamingKey_VH: VarHandle by lazy { NSURLVolumeSupportsRenamingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsRenamingKey: MemorySegment
    get() = NSURLVolumeSupportsRenamingKey_VH.get(NSURLVolumeSupportsRenamingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsRenamingKey_VH.set(NSURLVolumeSupportsRenamingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsAdvisoryFileLockingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsAdvisoryFileLockingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsAdvisoryFileLockingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsAdvisoryFileLockingKey").orElseThrow().reinterpret(NSURLVolumeSupportsAdvisoryFileLockingKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsAdvisoryFileLockingKey_VH: VarHandle by lazy { NSURLVolumeSupportsAdvisoryFileLockingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsAdvisoryFileLockingKey: MemorySegment
    get() = NSURLVolumeSupportsAdvisoryFileLockingKey_VH.get(NSURLVolumeSupportsAdvisoryFileLockingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsAdvisoryFileLockingKey_VH.set(NSURLVolumeSupportsAdvisoryFileLockingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsExtendedSecurityKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsExtendedSecurityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsExtendedSecurityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsExtendedSecurityKey").orElseThrow().reinterpret(NSURLVolumeSupportsExtendedSecurityKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsExtendedSecurityKey_VH: VarHandle by lazy { NSURLVolumeSupportsExtendedSecurityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsExtendedSecurityKey: MemorySegment
    get() = NSURLVolumeSupportsExtendedSecurityKey_VH.get(NSURLVolumeSupportsExtendedSecurityKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsExtendedSecurityKey_VH.set(NSURLVolumeSupportsExtendedSecurityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsBrowsableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsBrowsableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsBrowsableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsBrowsableKey").orElseThrow().reinterpret(NSURLVolumeIsBrowsableKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsBrowsableKey_VH: VarHandle by lazy { NSURLVolumeIsBrowsableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsBrowsableKey: MemorySegment
    get() = NSURLVolumeIsBrowsableKey_VH.get(NSURLVolumeIsBrowsableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsBrowsableKey_VH.set(NSURLVolumeIsBrowsableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeMaximumFileSizeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeMaximumFileSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeMaximumFileSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeMaximumFileSizeKey").orElseThrow().reinterpret(NSURLVolumeMaximumFileSizeKey_LAYOUT.byteSize()) }
private val NSURLVolumeMaximumFileSizeKey_VH: VarHandle by lazy { NSURLVolumeMaximumFileSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeMaximumFileSizeKey: MemorySegment
    get() = NSURLVolumeMaximumFileSizeKey_VH.get(NSURLVolumeMaximumFileSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeMaximumFileSizeKey_VH.set(NSURLVolumeMaximumFileSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsEjectableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsEjectableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsEjectableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsEjectableKey").orElseThrow().reinterpret(NSURLVolumeIsEjectableKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsEjectableKey_VH: VarHandle by lazy { NSURLVolumeIsEjectableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsEjectableKey: MemorySegment
    get() = NSURLVolumeIsEjectableKey_VH.get(NSURLVolumeIsEjectableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsEjectableKey_VH.set(NSURLVolumeIsEjectableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsRemovableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsRemovableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsRemovableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsRemovableKey").orElseThrow().reinterpret(NSURLVolumeIsRemovableKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsRemovableKey_VH: VarHandle by lazy { NSURLVolumeIsRemovableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsRemovableKey: MemorySegment
    get() = NSURLVolumeIsRemovableKey_VH.get(NSURLVolumeIsRemovableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsRemovableKey_VH.set(NSURLVolumeIsRemovableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsInternalKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsInternalKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsInternalKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsInternalKey").orElseThrow().reinterpret(NSURLVolumeIsInternalKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsInternalKey_VH: VarHandle by lazy { NSURLVolumeIsInternalKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsInternalKey: MemorySegment
    get() = NSURLVolumeIsInternalKey_VH.get(NSURLVolumeIsInternalKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsInternalKey_VH.set(NSURLVolumeIsInternalKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsAutomountedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsAutomountedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsAutomountedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsAutomountedKey").orElseThrow().reinterpret(NSURLVolumeIsAutomountedKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsAutomountedKey_VH: VarHandle by lazy { NSURLVolumeIsAutomountedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsAutomountedKey: MemorySegment
    get() = NSURLVolumeIsAutomountedKey_VH.get(NSURLVolumeIsAutomountedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsAutomountedKey_VH.set(NSURLVolumeIsAutomountedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsLocalKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsLocalKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsLocalKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsLocalKey").orElseThrow().reinterpret(NSURLVolumeIsLocalKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsLocalKey_VH: VarHandle by lazy { NSURLVolumeIsLocalKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsLocalKey: MemorySegment
    get() = NSURLVolumeIsLocalKey_VH.get(NSURLVolumeIsLocalKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsLocalKey_VH.set(NSURLVolumeIsLocalKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsReadOnlyKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsReadOnlyKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsReadOnlyKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsReadOnlyKey").orElseThrow().reinterpret(NSURLVolumeIsReadOnlyKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsReadOnlyKey_VH: VarHandle by lazy { NSURLVolumeIsReadOnlyKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsReadOnlyKey: MemorySegment
    get() = NSURLVolumeIsReadOnlyKey_VH.get(NSURLVolumeIsReadOnlyKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsReadOnlyKey_VH.set(NSURLVolumeIsReadOnlyKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeCreationDateKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeCreationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeCreationDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeCreationDateKey").orElseThrow().reinterpret(NSURLVolumeCreationDateKey_LAYOUT.byteSize()) }
private val NSURLVolumeCreationDateKey_VH: VarHandle by lazy { NSURLVolumeCreationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeCreationDateKey: MemorySegment
    get() = NSURLVolumeCreationDateKey_VH.get(NSURLVolumeCreationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeCreationDateKey_VH.set(NSURLVolumeCreationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeURLForRemountingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeURLForRemountingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeURLForRemountingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeURLForRemountingKey").orElseThrow().reinterpret(NSURLVolumeURLForRemountingKey_LAYOUT.byteSize()) }
private val NSURLVolumeURLForRemountingKey_VH: VarHandle by lazy { NSURLVolumeURLForRemountingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeURLForRemountingKey: MemorySegment
    get() = NSURLVolumeURLForRemountingKey_VH.get(NSURLVolumeURLForRemountingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeURLForRemountingKey_VH.set(NSURLVolumeURLForRemountingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeUUIDStringKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeUUIDStringKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeUUIDStringKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeUUIDStringKey").orElseThrow().reinterpret(NSURLVolumeUUIDStringKey_LAYOUT.byteSize()) }
private val NSURLVolumeUUIDStringKey_VH: VarHandle by lazy { NSURLVolumeUUIDStringKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeUUIDStringKey: MemorySegment
    get() = NSURLVolumeUUIDStringKey_VH.get(NSURLVolumeUUIDStringKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeUUIDStringKey_VH.set(NSURLVolumeUUIDStringKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeNameKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeNameKey").orElseThrow().reinterpret(NSURLVolumeNameKey_LAYOUT.byteSize()) }
private val NSURLVolumeNameKey_VH: VarHandle by lazy { NSURLVolumeNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeNameKey: MemorySegment
    get() = NSURLVolumeNameKey_VH.get(NSURLVolumeNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeNameKey_VH.set(NSURLVolumeNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeLocalizedNameKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeLocalizedNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeLocalizedNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeLocalizedNameKey").orElseThrow().reinterpret(NSURLVolumeLocalizedNameKey_LAYOUT.byteSize()) }
private val NSURLVolumeLocalizedNameKey_VH: VarHandle by lazy { NSURLVolumeLocalizedNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeLocalizedNameKey: MemorySegment
    get() = NSURLVolumeLocalizedNameKey_VH.get(NSURLVolumeLocalizedNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeLocalizedNameKey_VH.set(NSURLVolumeLocalizedNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsEncryptedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsEncryptedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsEncryptedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsEncryptedKey").orElseThrow().reinterpret(NSURLVolumeIsEncryptedKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsEncryptedKey_VH: VarHandle by lazy { NSURLVolumeIsEncryptedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsEncryptedKey: MemorySegment
    get() = NSURLVolumeIsEncryptedKey_VH.get(NSURLVolumeIsEncryptedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsEncryptedKey_VH.set(NSURLVolumeIsEncryptedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIsRootFileSystemKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIsRootFileSystemKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIsRootFileSystemKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIsRootFileSystemKey").orElseThrow().reinterpret(NSURLVolumeIsRootFileSystemKey_LAYOUT.byteSize()) }
private val NSURLVolumeIsRootFileSystemKey_VH: VarHandle by lazy { NSURLVolumeIsRootFileSystemKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIsRootFileSystemKey: MemorySegment
    get() = NSURLVolumeIsRootFileSystemKey_VH.get(NSURLVolumeIsRootFileSystemKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIsRootFileSystemKey_VH.set(NSURLVolumeIsRootFileSystemKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsCompressionKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsCompressionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsCompressionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsCompressionKey").orElseThrow().reinterpret(NSURLVolumeSupportsCompressionKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsCompressionKey_VH: VarHandle by lazy { NSURLVolumeSupportsCompressionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsCompressionKey: MemorySegment
    get() = NSURLVolumeSupportsCompressionKey_VH.get(NSURLVolumeSupportsCompressionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsCompressionKey_VH.set(NSURLVolumeSupportsCompressionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsFileCloningKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsFileCloningKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsFileCloningKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsFileCloningKey").orElseThrow().reinterpret(NSURLVolumeSupportsFileCloningKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsFileCloningKey_VH: VarHandle by lazy { NSURLVolumeSupportsFileCloningKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsFileCloningKey: MemorySegment
    get() = NSURLVolumeSupportsFileCloningKey_VH.get(NSURLVolumeSupportsFileCloningKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsFileCloningKey_VH.set(NSURLVolumeSupportsFileCloningKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsSwapRenamingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsSwapRenamingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsSwapRenamingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsSwapRenamingKey").orElseThrow().reinterpret(NSURLVolumeSupportsSwapRenamingKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsSwapRenamingKey_VH: VarHandle by lazy { NSURLVolumeSupportsSwapRenamingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsSwapRenamingKey: MemorySegment
    get() = NSURLVolumeSupportsSwapRenamingKey_VH.get(NSURLVolumeSupportsSwapRenamingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsSwapRenamingKey_VH.set(NSURLVolumeSupportsSwapRenamingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsExclusiveRenamingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsExclusiveRenamingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsExclusiveRenamingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsExclusiveRenamingKey").orElseThrow().reinterpret(NSURLVolumeSupportsExclusiveRenamingKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsExclusiveRenamingKey_VH: VarHandle by lazy { NSURLVolumeSupportsExclusiveRenamingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsExclusiveRenamingKey: MemorySegment
    get() = NSURLVolumeSupportsExclusiveRenamingKey_VH.get(NSURLVolumeSupportsExclusiveRenamingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsExclusiveRenamingKey_VH.set(NSURLVolumeSupportsExclusiveRenamingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsImmutableFilesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsImmutableFilesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsImmutableFilesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsImmutableFilesKey").orElseThrow().reinterpret(NSURLVolumeSupportsImmutableFilesKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsImmutableFilesKey_VH: VarHandle by lazy { NSURLVolumeSupportsImmutableFilesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsImmutableFilesKey: MemorySegment
    get() = NSURLVolumeSupportsImmutableFilesKey_VH.get(NSURLVolumeSupportsImmutableFilesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsImmutableFilesKey_VH.set(NSURLVolumeSupportsImmutableFilesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsAccessPermissionsKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsAccessPermissionsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsAccessPermissionsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsAccessPermissionsKey").orElseThrow().reinterpret(NSURLVolumeSupportsAccessPermissionsKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsAccessPermissionsKey_VH: VarHandle by lazy { NSURLVolumeSupportsAccessPermissionsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsAccessPermissionsKey: MemorySegment
    get() = NSURLVolumeSupportsAccessPermissionsKey_VH.get(NSURLVolumeSupportsAccessPermissionsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsAccessPermissionsKey_VH.set(NSURLVolumeSupportsAccessPermissionsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSupportsFileProtectionKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSupportsFileProtectionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSupportsFileProtectionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSupportsFileProtectionKey").orElseThrow().reinterpret(NSURLVolumeSupportsFileProtectionKey_LAYOUT.byteSize()) }
private val NSURLVolumeSupportsFileProtectionKey_VH: VarHandle by lazy { NSURLVolumeSupportsFileProtectionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeSupportsFileProtectionKey: MemorySegment
    get() = NSURLVolumeSupportsFileProtectionKey_VH.get(NSURLVolumeSupportsFileProtectionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSupportsFileProtectionKey_VH.set(NSURLVolumeSupportsFileProtectionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeAvailableCapacityForImportantUsageKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeAvailableCapacityForImportantUsageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeAvailableCapacityForImportantUsageKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeAvailableCapacityForImportantUsageKey").orElseThrow().reinterpret(NSURLVolumeAvailableCapacityForImportantUsageKey_LAYOUT.byteSize()) }
private val NSURLVolumeAvailableCapacityForImportantUsageKey_VH: VarHandle by lazy { NSURLVolumeAvailableCapacityForImportantUsageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLVolumeAvailableCapacityForImportantUsageKey: MemorySegment
    get() = NSURLVolumeAvailableCapacityForImportantUsageKey_VH.get(NSURLVolumeAvailableCapacityForImportantUsageKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeAvailableCapacityForImportantUsageKey_VH.set(NSURLVolumeAvailableCapacityForImportantUsageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeAvailableCapacityForOpportunisticUsageKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeAvailableCapacityForOpportunisticUsageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeAvailableCapacityForOpportunisticUsageKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeAvailableCapacityForOpportunisticUsageKey").orElseThrow().reinterpret(NSURLVolumeAvailableCapacityForOpportunisticUsageKey_LAYOUT.byteSize()) }
private val NSURLVolumeAvailableCapacityForOpportunisticUsageKey_VH: VarHandle by lazy { NSURLVolumeAvailableCapacityForOpportunisticUsageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLVolumeAvailableCapacityForOpportunisticUsageKey: MemorySegment
    get() = NSURLVolumeAvailableCapacityForOpportunisticUsageKey_VH.get(NSURLVolumeAvailableCapacityForOpportunisticUsageKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeAvailableCapacityForOpportunisticUsageKey_VH.set(NSURLVolumeAvailableCapacityForOpportunisticUsageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeTypeNameKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeTypeNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeTypeNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeTypeNameKey").orElseThrow().reinterpret(NSURLVolumeTypeNameKey_LAYOUT.byteSize()) }
private val NSURLVolumeTypeNameKey_VH: VarHandle by lazy { NSURLVolumeTypeNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 4, introducedSubminor = -1)
var NSURLVolumeTypeNameKey: MemorySegment
    get() = NSURLVolumeTypeNameKey_VH.get(NSURLVolumeTypeNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeTypeNameKey_VH.set(NSURLVolumeTypeNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeSubtypeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeSubtypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeSubtypeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeSubtypeKey").orElseThrow().reinterpret(NSURLVolumeSubtypeKey_LAYOUT.byteSize()) }
private val NSURLVolumeSubtypeKey_VH: VarHandle by lazy { NSURLVolumeSubtypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 4, introducedSubminor = -1)
var NSURLVolumeSubtypeKey: MemorySegment
    get() = NSURLVolumeSubtypeKey_VH.get(NSURLVolumeSubtypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeSubtypeKey_VH.set(NSURLVolumeSubtypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeMountFromLocationKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeMountFromLocationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeMountFromLocationKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeMountFromLocationKey").orElseThrow().reinterpret(NSURLVolumeMountFromLocationKey_LAYOUT.byteSize()) }
private val NSURLVolumeMountFromLocationKey_VH: VarHandle by lazy { NSURLVolumeMountFromLocationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 4, introducedSubminor = -1)
var NSURLVolumeMountFromLocationKey: MemorySegment
    get() = NSURLVolumeMountFromLocationKey_VH.get(NSURLVolumeMountFromLocationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeMountFromLocationKey_VH.set(NSURLVolumeMountFromLocationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsUbiquitousItemKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsUbiquitousItemKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsUbiquitousItemKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsUbiquitousItemKey").orElseThrow().reinterpret(NSURLIsUbiquitousItemKey_LAYOUT.byteSize()) }
private val NSURLIsUbiquitousItemKey_VH: VarHandle by lazy { NSURLIsUbiquitousItemKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsUbiquitousItemKey: MemorySegment
    get() = NSURLIsUbiquitousItemKey_VH.get(NSURLIsUbiquitousItemKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsUbiquitousItemKey_VH.set(NSURLIsUbiquitousItemKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemHasUnresolvedConflictsKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemHasUnresolvedConflictsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemHasUnresolvedConflictsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemHasUnresolvedConflictsKey").orElseThrow().reinterpret(NSURLUbiquitousItemHasUnresolvedConflictsKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemHasUnresolvedConflictsKey_VH: VarHandle by lazy { NSURLUbiquitousItemHasUnresolvedConflictsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemHasUnresolvedConflictsKey: MemorySegment
    get() = NSURLUbiquitousItemHasUnresolvedConflictsKey_VH.get(NSURLUbiquitousItemHasUnresolvedConflictsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemHasUnresolvedConflictsKey_VH.set(NSURLUbiquitousItemHasUnresolvedConflictsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemIsDownloadedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemIsDownloadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemIsDownloadedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemIsDownloadedKey").orElseThrow().reinterpret(NSURLUbiquitousItemIsDownloadedKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemIsDownloadedKey_VH: VarHandle by lazy { NSURLUbiquitousItemIsDownloadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use NSURLUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLUbiquitousItemDownloadingStatusKey instead")
var NSURLUbiquitousItemIsDownloadedKey: MemorySegment
    get() = NSURLUbiquitousItemIsDownloadedKey_VH.get(NSURLUbiquitousItemIsDownloadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemIsDownloadedKey_VH.set(NSURLUbiquitousItemIsDownloadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemIsDownloadingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemIsDownloadingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemIsDownloadingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemIsDownloadingKey").orElseThrow().reinterpret(NSURLUbiquitousItemIsDownloadingKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemIsDownloadingKey_VH: VarHandle by lazy { NSURLUbiquitousItemIsDownloadingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemIsDownloadingKey: MemorySegment
    get() = NSURLUbiquitousItemIsDownloadingKey_VH.get(NSURLUbiquitousItemIsDownloadingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemIsDownloadingKey_VH.set(NSURLUbiquitousItemIsDownloadingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemIsUploadedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemIsUploadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemIsUploadedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemIsUploadedKey").orElseThrow().reinterpret(NSURLUbiquitousItemIsUploadedKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemIsUploadedKey_VH: VarHandle by lazy { NSURLUbiquitousItemIsUploadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemIsUploadedKey: MemorySegment
    get() = NSURLUbiquitousItemIsUploadedKey_VH.get(NSURLUbiquitousItemIsUploadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemIsUploadedKey_VH.set(NSURLUbiquitousItemIsUploadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemIsUploadingKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemIsUploadingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemIsUploadingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemIsUploadingKey").orElseThrow().reinterpret(NSURLUbiquitousItemIsUploadingKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemIsUploadingKey_VH: VarHandle by lazy { NSURLUbiquitousItemIsUploadingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemIsUploadingKey: MemorySegment
    get() = NSURLUbiquitousItemIsUploadingKey_VH.get(NSURLUbiquitousItemIsUploadingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemIsUploadingKey_VH.set(NSURLUbiquitousItemIsUploadingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemPercentDownloadedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemPercentDownloadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemPercentDownloadedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemPercentDownloadedKey").orElseThrow().reinterpret(NSURLUbiquitousItemPercentDownloadedKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemPercentDownloadedKey_VH: VarHandle by lazy { NSURLUbiquitousItemPercentDownloadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemPercentDownloadedKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemPercentDownloadedKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemPercentDownloadedKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemPercentDownloadedKey instead")
var NSURLUbiquitousItemPercentDownloadedKey: MemorySegment
    get() = NSURLUbiquitousItemPercentDownloadedKey_VH.get(NSURLUbiquitousItemPercentDownloadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemPercentDownloadedKey_VH.set(NSURLUbiquitousItemPercentDownloadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemPercentUploadedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemPercentUploadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemPercentUploadedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemPercentUploadedKey").orElseThrow().reinterpret(NSURLUbiquitousItemPercentUploadedKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemPercentUploadedKey_VH: VarHandle by lazy { NSURLUbiquitousItemPercentUploadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemPercentUploadedKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemPercentUploadedKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemPercentUploadedKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemPercentUploadedKey instead")
var NSURLUbiquitousItemPercentUploadedKey: MemorySegment
    get() = NSURLUbiquitousItemPercentUploadedKey_VH.get(NSURLUbiquitousItemPercentUploadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemPercentUploadedKey_VH.set(NSURLUbiquitousItemPercentUploadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemDownloadingStatusKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemDownloadingStatusKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemDownloadingStatusKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemDownloadingStatusKey").orElseThrow().reinterpret(NSURLUbiquitousItemDownloadingStatusKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemDownloadingStatusKey_VH: VarHandle by lazy { NSURLUbiquitousItemDownloadingStatusKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemDownloadingStatusKey: MemorySegment
    get() = NSURLUbiquitousItemDownloadingStatusKey_VH.get(NSURLUbiquitousItemDownloadingStatusKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemDownloadingStatusKey_VH.set(NSURLUbiquitousItemDownloadingStatusKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemDownloadingErrorKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemDownloadingErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemDownloadingErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemDownloadingErrorKey").orElseThrow().reinterpret(NSURLUbiquitousItemDownloadingErrorKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemDownloadingErrorKey_VH: VarHandle by lazy { NSURLUbiquitousItemDownloadingErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemDownloadingErrorKey: MemorySegment
    get() = NSURLUbiquitousItemDownloadingErrorKey_VH.get(NSURLUbiquitousItemDownloadingErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemDownloadingErrorKey_VH.set(NSURLUbiquitousItemDownloadingErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemUploadingErrorKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemUploadingErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemUploadingErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemUploadingErrorKey").orElseThrow().reinterpret(NSURLUbiquitousItemUploadingErrorKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemUploadingErrorKey_VH: VarHandle by lazy { NSURLUbiquitousItemUploadingErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemUploadingErrorKey: MemorySegment
    get() = NSURLUbiquitousItemUploadingErrorKey_VH.get(NSURLUbiquitousItemUploadingErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemUploadingErrorKey_VH.set(NSURLUbiquitousItemUploadingErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemDownloadRequestedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemDownloadRequestedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemDownloadRequestedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemDownloadRequestedKey").orElseThrow().reinterpret(NSURLUbiquitousItemDownloadRequestedKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemDownloadRequestedKey_VH: VarHandle by lazy { NSURLUbiquitousItemDownloadRequestedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemDownloadRequestedKey: MemorySegment
    get() = NSURLUbiquitousItemDownloadRequestedKey_VH.get(NSURLUbiquitousItemDownloadRequestedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemDownloadRequestedKey_VH.set(NSURLUbiquitousItemDownloadRequestedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemContainerDisplayNameKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemContainerDisplayNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemContainerDisplayNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemContainerDisplayNameKey").orElseThrow().reinterpret(NSURLUbiquitousItemContainerDisplayNameKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemContainerDisplayNameKey_VH: VarHandle by lazy { NSURLUbiquitousItemContainerDisplayNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemContainerDisplayNameKey: MemorySegment
    get() = NSURLUbiquitousItemContainerDisplayNameKey_VH.get(NSURLUbiquitousItemContainerDisplayNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemContainerDisplayNameKey_VH.set(NSURLUbiquitousItemContainerDisplayNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemIsExcludedFromSyncKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemIsExcludedFromSyncKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemIsExcludedFromSyncKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemIsExcludedFromSyncKey").orElseThrow().reinterpret(NSURLUbiquitousItemIsExcludedFromSyncKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemIsExcludedFromSyncKey_VH: VarHandle by lazy { NSURLUbiquitousItemIsExcludedFromSyncKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 4, introducedSubminor = -1)
var NSURLUbiquitousItemIsExcludedFromSyncKey: MemorySegment
    get() = NSURLUbiquitousItemIsExcludedFromSyncKey_VH.get(NSURLUbiquitousItemIsExcludedFromSyncKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemIsExcludedFromSyncKey_VH.set(NSURLUbiquitousItemIsExcludedFromSyncKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemIsSharedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemIsSharedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemIsSharedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemIsSharedKey").orElseThrow().reinterpret(NSURLUbiquitousItemIsSharedKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemIsSharedKey_VH: VarHandle by lazy { NSURLUbiquitousItemIsSharedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousItemIsSharedKey: MemorySegment
    get() = NSURLUbiquitousItemIsSharedKey_VH.get(NSURLUbiquitousItemIsSharedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemIsSharedKey_VH.set(NSURLUbiquitousItemIsSharedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousSharedItemCurrentUserRoleKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousSharedItemCurrentUserRoleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousSharedItemCurrentUserRoleKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousSharedItemCurrentUserRoleKey").orElseThrow().reinterpret(NSURLUbiquitousSharedItemCurrentUserRoleKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousSharedItemCurrentUserRoleKey_VH: VarHandle by lazy { NSURLUbiquitousSharedItemCurrentUserRoleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousSharedItemCurrentUserRoleKey: MemorySegment
    get() = NSURLUbiquitousSharedItemCurrentUserRoleKey_VH.get(NSURLUbiquitousSharedItemCurrentUserRoleKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousSharedItemCurrentUserRoleKey_VH.set(NSURLUbiquitousSharedItemCurrentUserRoleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousSharedItemCurrentUserPermissionsKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousSharedItemCurrentUserPermissionsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousSharedItemCurrentUserPermissionsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousSharedItemCurrentUserPermissionsKey").orElseThrow().reinterpret(NSURLUbiquitousSharedItemCurrentUserPermissionsKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousSharedItemCurrentUserPermissionsKey_VH: VarHandle by lazy { NSURLUbiquitousSharedItemCurrentUserPermissionsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousSharedItemCurrentUserPermissionsKey: MemorySegment
    get() = NSURLUbiquitousSharedItemCurrentUserPermissionsKey_VH.get(NSURLUbiquitousSharedItemCurrentUserPermissionsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousSharedItemCurrentUserPermissionsKey_VH.set(NSURLUbiquitousSharedItemCurrentUserPermissionsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousSharedItemOwnerNameComponentsKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousSharedItemOwnerNameComponentsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousSharedItemOwnerNameComponentsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousSharedItemOwnerNameComponentsKey").orElseThrow().reinterpret(NSURLUbiquitousSharedItemOwnerNameComponentsKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousSharedItemOwnerNameComponentsKey_VH: VarHandle by lazy { NSURLUbiquitousSharedItemOwnerNameComponentsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousSharedItemOwnerNameComponentsKey: MemorySegment
    get() = NSURLUbiquitousSharedItemOwnerNameComponentsKey_VH.get(NSURLUbiquitousSharedItemOwnerNameComponentsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousSharedItemOwnerNameComponentsKey_VH.set(NSURLUbiquitousSharedItemOwnerNameComponentsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey").orElseThrow().reinterpret(NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_VH: VarHandle by lazy { NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey: MemorySegment
    get() = NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_VH.get(NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_VH.set(NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemDownloadingStatusNotDownloaded typedef const NSURLUbiquitousItemDownloadingStatus = (Void)*
 */
private val NSURLUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemDownloadingStatusNotDownloaded").orElseThrow().reinterpret(NSURLUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemDownloadingStatusNotDownloaded_VH: VarHandle by lazy { NSURLUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemDownloadingStatusNotDownloaded: MemorySegment
    get() = NSURLUbiquitousItemDownloadingStatusNotDownloaded_VH.get(NSURLUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemDownloadingStatusNotDownloaded_VH.set(NSURLUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemDownloadingStatusDownloaded typedef const NSURLUbiquitousItemDownloadingStatus = (Void)*
 */
private val NSURLUbiquitousItemDownloadingStatusDownloaded_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemDownloadingStatusDownloaded_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemDownloadingStatusDownloaded").orElseThrow().reinterpret(NSURLUbiquitousItemDownloadingStatusDownloaded_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemDownloadingStatusDownloaded_VH: VarHandle by lazy { NSURLUbiquitousItemDownloadingStatusDownloaded_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemDownloadingStatusDownloaded: MemorySegment
    get() = NSURLUbiquitousItemDownloadingStatusDownloaded_VH.get(NSURLUbiquitousItemDownloadingStatusDownloaded_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemDownloadingStatusDownloaded_VH.set(NSURLUbiquitousItemDownloadingStatusDownloaded_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemDownloadingStatusCurrent typedef const NSURLUbiquitousItemDownloadingStatus = (Void)*
 */
private val NSURLUbiquitousItemDownloadingStatusCurrent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemDownloadingStatusCurrent_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemDownloadingStatusCurrent").orElseThrow().reinterpret(NSURLUbiquitousItemDownloadingStatusCurrent_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemDownloadingStatusCurrent_VH: VarHandle by lazy { NSURLUbiquitousItemDownloadingStatusCurrent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemDownloadingStatusCurrent: MemorySegment
    get() = NSURLUbiquitousItemDownloadingStatusCurrent_VH.get(NSURLUbiquitousItemDownloadingStatusCurrent_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemDownloadingStatusCurrent_VH.set(NSURLUbiquitousItemDownloadingStatusCurrent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousSharedItemRoleOwner typedef const NSURLUbiquitousSharedItemRole = (Void)*
 */
private val NSURLUbiquitousSharedItemRoleOwner_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousSharedItemRoleOwner_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousSharedItemRoleOwner").orElseThrow().reinterpret(NSURLUbiquitousSharedItemRoleOwner_LAYOUT.byteSize()) }
private val NSURLUbiquitousSharedItemRoleOwner_VH: VarHandle by lazy { NSURLUbiquitousSharedItemRoleOwner_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousSharedItemRoleOwner: MemorySegment
    get() = NSURLUbiquitousSharedItemRoleOwner_VH.get(NSURLUbiquitousSharedItemRoleOwner_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousSharedItemRoleOwner_VH.set(NSURLUbiquitousSharedItemRoleOwner_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousSharedItemRoleParticipant typedef const NSURLUbiquitousSharedItemRole = (Void)*
 */
private val NSURLUbiquitousSharedItemRoleParticipant_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousSharedItemRoleParticipant_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousSharedItemRoleParticipant").orElseThrow().reinterpret(NSURLUbiquitousSharedItemRoleParticipant_LAYOUT.byteSize()) }
private val NSURLUbiquitousSharedItemRoleParticipant_VH: VarHandle by lazy { NSURLUbiquitousSharedItemRoleParticipant_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousSharedItemRoleParticipant: MemorySegment
    get() = NSURLUbiquitousSharedItemRoleParticipant_VH.get(NSURLUbiquitousSharedItemRoleParticipant_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousSharedItemRoleParticipant_VH.set(NSURLUbiquitousSharedItemRoleParticipant_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousSharedItemPermissionsReadOnly typedef const NSURLUbiquitousSharedItemPermissions = (Void)*
 */
private val NSURLUbiquitousSharedItemPermissionsReadOnly_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousSharedItemPermissionsReadOnly_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousSharedItemPermissionsReadOnly").orElseThrow().reinterpret(NSURLUbiquitousSharedItemPermissionsReadOnly_LAYOUT.byteSize()) }
private val NSURLUbiquitousSharedItemPermissionsReadOnly_VH: VarHandle by lazy { NSURLUbiquitousSharedItemPermissionsReadOnly_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousSharedItemPermissionsReadOnly: MemorySegment
    get() = NSURLUbiquitousSharedItemPermissionsReadOnly_VH.get(NSURLUbiquitousSharedItemPermissionsReadOnly_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousSharedItemPermissionsReadOnly_VH.set(NSURLUbiquitousSharedItemPermissionsReadOnly_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousSharedItemPermissionsReadWrite typedef const NSURLUbiquitousSharedItemPermissions = (Void)*
 */
private val NSURLUbiquitousSharedItemPermissionsReadWrite_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousSharedItemPermissionsReadWrite_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousSharedItemPermissionsReadWrite").orElseThrow().reinterpret(NSURLUbiquitousSharedItemPermissionsReadWrite_LAYOUT.byteSize()) }
private val NSURLUbiquitousSharedItemPermissionsReadWrite_VH: VarHandle by lazy { NSURLUbiquitousSharedItemPermissionsReadWrite_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLUbiquitousSharedItemPermissionsReadWrite: MemorySegment
    get() = NSURLUbiquitousSharedItemPermissionsReadWrite_VH.get(NSURLUbiquitousSharedItemPermissionsReadWrite_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousSharedItemPermissionsReadWrite_VH.set(NSURLUbiquitousSharedItemPermissionsReadWrite_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemSupportedSyncControlsKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemSupportedSyncControlsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemSupportedSyncControlsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemSupportedSyncControlsKey").orElseThrow().reinterpret(NSURLUbiquitousItemSupportedSyncControlsKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemSupportedSyncControlsKey_VH: VarHandle by lazy { NSURLUbiquitousItemSupportedSyncControlsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemSupportedSyncControlsKey: MemorySegment
    get() = NSURLUbiquitousItemSupportedSyncControlsKey_VH.get(NSURLUbiquitousItemSupportedSyncControlsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemSupportedSyncControlsKey_VH.set(NSURLUbiquitousItemSupportedSyncControlsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLUbiquitousItemIsSyncPausedKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLUbiquitousItemIsSyncPausedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLUbiquitousItemIsSyncPausedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLUbiquitousItemIsSyncPausedKey").orElseThrow().reinterpret(NSURLUbiquitousItemIsSyncPausedKey_LAYOUT.byteSize()) }
private val NSURLUbiquitousItemIsSyncPausedKey_VH: VarHandle by lazy { NSURLUbiquitousItemIsSyncPausedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSURLUbiquitousItemIsSyncPausedKey: MemorySegment
    get() = NSURLUbiquitousItemIsSyncPausedKey_VH.get(NSURLUbiquitousItemIsSyncPausedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLUbiquitousItemIsSyncPausedKey_VH.set(NSURLUbiquitousItemIsSyncPausedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileManagerUnmountDissentingProcessIdentifierErrorKey (Void)*
 */
private val NSFileManagerUnmountDissentingProcessIdentifierErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileManagerUnmountDissentingProcessIdentifierErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileManagerUnmountDissentingProcessIdentifierErrorKey").orElseThrow().reinterpret(NSFileManagerUnmountDissentingProcessIdentifierErrorKey_LAYOUT.byteSize()) }
private val NSFileManagerUnmountDissentingProcessIdentifierErrorKey_VH: VarHandle by lazy { NSFileManagerUnmountDissentingProcessIdentifierErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSFileManagerUnmountDissentingProcessIdentifierErrorKey: MemorySegment
    get() = NSFileManagerUnmountDissentingProcessIdentifierErrorKey_VH.get(NSFileManagerUnmountDissentingProcessIdentifierErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileManagerUnmountDissentingProcessIdentifierErrorKey_VH.set(NSFileManagerUnmountDissentingProcessIdentifierErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUbiquityIdentityDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSUbiquityIdentityDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUbiquityIdentityDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUbiquityIdentityDidChangeNotification").orElseThrow().reinterpret(NSUbiquityIdentityDidChangeNotification_LAYOUT.byteSize()) }
private val NSUbiquityIdentityDidChangeNotification_VH: VarHandle by lazy { NSUbiquityIdentityDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUbiquityIdentityDidChangeNotification: MemorySegment
    get() = NSUbiquityIdentityDidChangeNotification_VH.get(NSUbiquityIdentityDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUbiquityIdentityDidChangeNotification_VH.set(NSUbiquityIdentityDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileType typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileType").orElseThrow().reinterpret(NSFileType_LAYOUT.byteSize()) }
private val NSFileType_VH: VarHandle by lazy { NSFileType_LAYOUT.varHandle() }

var NSFileType: MemorySegment
    get() = NSFileType_VH.get(NSFileType_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileType_VH.set(NSFileType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeDirectory typedef const NSFileAttributeType = (Void)*
 */
private val NSFileTypeDirectory_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeDirectory_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileTypeDirectory").orElseThrow().reinterpret(NSFileTypeDirectory_LAYOUT.byteSize()) }
private val NSFileTypeDirectory_VH: VarHandle by lazy { NSFileTypeDirectory_LAYOUT.varHandle() }

var NSFileTypeDirectory: MemorySegment
    get() = NSFileTypeDirectory_VH.get(NSFileTypeDirectory_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeDirectory_VH.set(NSFileTypeDirectory_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeRegular typedef const NSFileAttributeType = (Void)*
 */
private val NSFileTypeRegular_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeRegular_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileTypeRegular").orElseThrow().reinterpret(NSFileTypeRegular_LAYOUT.byteSize()) }
private val NSFileTypeRegular_VH: VarHandle by lazy { NSFileTypeRegular_LAYOUT.varHandle() }

var NSFileTypeRegular: MemorySegment
    get() = NSFileTypeRegular_VH.get(NSFileTypeRegular_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeRegular_VH.set(NSFileTypeRegular_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeSymbolicLink typedef const NSFileAttributeType = (Void)*
 */
private val NSFileTypeSymbolicLink_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeSymbolicLink_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileTypeSymbolicLink").orElseThrow().reinterpret(NSFileTypeSymbolicLink_LAYOUT.byteSize()) }
private val NSFileTypeSymbolicLink_VH: VarHandle by lazy { NSFileTypeSymbolicLink_LAYOUT.varHandle() }

var NSFileTypeSymbolicLink: MemorySegment
    get() = NSFileTypeSymbolicLink_VH.get(NSFileTypeSymbolicLink_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeSymbolicLink_VH.set(NSFileTypeSymbolicLink_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeSocket typedef const NSFileAttributeType = (Void)*
 */
private val NSFileTypeSocket_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeSocket_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileTypeSocket").orElseThrow().reinterpret(NSFileTypeSocket_LAYOUT.byteSize()) }
private val NSFileTypeSocket_VH: VarHandle by lazy { NSFileTypeSocket_LAYOUT.varHandle() }

var NSFileTypeSocket: MemorySegment
    get() = NSFileTypeSocket_VH.get(NSFileTypeSocket_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeSocket_VH.set(NSFileTypeSocket_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeCharacterSpecial typedef const NSFileAttributeType = (Void)*
 */
private val NSFileTypeCharacterSpecial_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeCharacterSpecial_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileTypeCharacterSpecial").orElseThrow().reinterpret(NSFileTypeCharacterSpecial_LAYOUT.byteSize()) }
private val NSFileTypeCharacterSpecial_VH: VarHandle by lazy { NSFileTypeCharacterSpecial_LAYOUT.varHandle() }

var NSFileTypeCharacterSpecial: MemorySegment
    get() = NSFileTypeCharacterSpecial_VH.get(NSFileTypeCharacterSpecial_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeCharacterSpecial_VH.set(NSFileTypeCharacterSpecial_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeBlockSpecial typedef const NSFileAttributeType = (Void)*
 */
private val NSFileTypeBlockSpecial_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeBlockSpecial_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileTypeBlockSpecial").orElseThrow().reinterpret(NSFileTypeBlockSpecial_LAYOUT.byteSize()) }
private val NSFileTypeBlockSpecial_VH: VarHandle by lazy { NSFileTypeBlockSpecial_LAYOUT.varHandle() }

var NSFileTypeBlockSpecial: MemorySegment
    get() = NSFileTypeBlockSpecial_VH.get(NSFileTypeBlockSpecial_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeBlockSpecial_VH.set(NSFileTypeBlockSpecial_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeUnknown typedef const NSFileAttributeType = (Void)*
 */
private val NSFileTypeUnknown_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeUnknown_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileTypeUnknown").orElseThrow().reinterpret(NSFileTypeUnknown_LAYOUT.byteSize()) }
private val NSFileTypeUnknown_VH: VarHandle by lazy { NSFileTypeUnknown_LAYOUT.varHandle() }

var NSFileTypeUnknown: MemorySegment
    get() = NSFileTypeUnknown_VH.get(NSFileTypeUnknown_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeUnknown_VH.set(NSFileTypeUnknown_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileSize typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileSize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileSize_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileSize").orElseThrow().reinterpret(NSFileSize_LAYOUT.byteSize()) }
private val NSFileSize_VH: VarHandle by lazy { NSFileSize_LAYOUT.varHandle() }

var NSFileSize: MemorySegment
    get() = NSFileSize_VH.get(NSFileSize_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileSize_VH.set(NSFileSize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileModificationDate typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileModificationDate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileModificationDate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileModificationDate").orElseThrow().reinterpret(NSFileModificationDate_LAYOUT.byteSize()) }
private val NSFileModificationDate_VH: VarHandle by lazy { NSFileModificationDate_LAYOUT.varHandle() }

var NSFileModificationDate: MemorySegment
    get() = NSFileModificationDate_VH.get(NSFileModificationDate_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileModificationDate_VH.set(NSFileModificationDate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileReferenceCount typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileReferenceCount_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileReferenceCount_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileReferenceCount").orElseThrow().reinterpret(NSFileReferenceCount_LAYOUT.byteSize()) }
private val NSFileReferenceCount_VH: VarHandle by lazy { NSFileReferenceCount_LAYOUT.varHandle() }

var NSFileReferenceCount: MemorySegment
    get() = NSFileReferenceCount_VH.get(NSFileReferenceCount_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileReferenceCount_VH.set(NSFileReferenceCount_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileDeviceIdentifier typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileDeviceIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileDeviceIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileDeviceIdentifier").orElseThrow().reinterpret(NSFileDeviceIdentifier_LAYOUT.byteSize()) }
private val NSFileDeviceIdentifier_VH: VarHandle by lazy { NSFileDeviceIdentifier_LAYOUT.varHandle() }

var NSFileDeviceIdentifier: MemorySegment
    get() = NSFileDeviceIdentifier_VH.get(NSFileDeviceIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileDeviceIdentifier_VH.set(NSFileDeviceIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileOwnerAccountName typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileOwnerAccountName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileOwnerAccountName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileOwnerAccountName").orElseThrow().reinterpret(NSFileOwnerAccountName_LAYOUT.byteSize()) }
private val NSFileOwnerAccountName_VH: VarHandle by lazy { NSFileOwnerAccountName_LAYOUT.varHandle() }

var NSFileOwnerAccountName: MemorySegment
    get() = NSFileOwnerAccountName_VH.get(NSFileOwnerAccountName_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileOwnerAccountName_VH.set(NSFileOwnerAccountName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileGroupOwnerAccountName typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileGroupOwnerAccountName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileGroupOwnerAccountName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileGroupOwnerAccountName").orElseThrow().reinterpret(NSFileGroupOwnerAccountName_LAYOUT.byteSize()) }
private val NSFileGroupOwnerAccountName_VH: VarHandle by lazy { NSFileGroupOwnerAccountName_LAYOUT.varHandle() }

var NSFileGroupOwnerAccountName: MemorySegment
    get() = NSFileGroupOwnerAccountName_VH.get(NSFileGroupOwnerAccountName_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileGroupOwnerAccountName_VH.set(NSFileGroupOwnerAccountName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFilePosixPermissions typedef const NSFileAttributeKey = (Void)*
 */
private val NSFilePosixPermissions_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFilePosixPermissions_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFilePosixPermissions").orElseThrow().reinterpret(NSFilePosixPermissions_LAYOUT.byteSize()) }
private val NSFilePosixPermissions_VH: VarHandle by lazy { NSFilePosixPermissions_LAYOUT.varHandle() }

var NSFilePosixPermissions: MemorySegment
    get() = NSFilePosixPermissions_VH.get(NSFilePosixPermissions_SEGMENT, 0L) as MemorySegment
    set(value) = NSFilePosixPermissions_VH.set(NSFilePosixPermissions_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileSystemNumber typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileSystemNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileSystemNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileSystemNumber").orElseThrow().reinterpret(NSFileSystemNumber_LAYOUT.byteSize()) }
private val NSFileSystemNumber_VH: VarHandle by lazy { NSFileSystemNumber_LAYOUT.varHandle() }

var NSFileSystemNumber: MemorySegment
    get() = NSFileSystemNumber_VH.get(NSFileSystemNumber_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileSystemNumber_VH.set(NSFileSystemNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileSystemFileNumber typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileSystemFileNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileSystemFileNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileSystemFileNumber").orElseThrow().reinterpret(NSFileSystemFileNumber_LAYOUT.byteSize()) }
private val NSFileSystemFileNumber_VH: VarHandle by lazy { NSFileSystemFileNumber_LAYOUT.varHandle() }

var NSFileSystemFileNumber: MemorySegment
    get() = NSFileSystemFileNumber_VH.get(NSFileSystemFileNumber_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileSystemFileNumber_VH.set(NSFileSystemFileNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileExtensionHidden typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileExtensionHidden_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileExtensionHidden_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileExtensionHidden").orElseThrow().reinterpret(NSFileExtensionHidden_LAYOUT.byteSize()) }
private val NSFileExtensionHidden_VH: VarHandle by lazy { NSFileExtensionHidden_LAYOUT.varHandle() }

var NSFileExtensionHidden: MemorySegment
    get() = NSFileExtensionHidden_VH.get(NSFileExtensionHidden_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileExtensionHidden_VH.set(NSFileExtensionHidden_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHFSCreatorCode typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileHFSCreatorCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHFSCreatorCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHFSCreatorCode").orElseThrow().reinterpret(NSFileHFSCreatorCode_LAYOUT.byteSize()) }
private val NSFileHFSCreatorCode_VH: VarHandle by lazy { NSFileHFSCreatorCode_LAYOUT.varHandle() }

var NSFileHFSCreatorCode: MemorySegment
    get() = NSFileHFSCreatorCode_VH.get(NSFileHFSCreatorCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHFSCreatorCode_VH.set(NSFileHFSCreatorCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHFSTypeCode typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileHFSTypeCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHFSTypeCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHFSTypeCode").orElseThrow().reinterpret(NSFileHFSTypeCode_LAYOUT.byteSize()) }
private val NSFileHFSTypeCode_VH: VarHandle by lazy { NSFileHFSTypeCode_LAYOUT.varHandle() }

var NSFileHFSTypeCode: MemorySegment
    get() = NSFileHFSTypeCode_VH.get(NSFileHFSTypeCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHFSTypeCode_VH.set(NSFileHFSTypeCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileImmutable typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileImmutable_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileImmutable_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileImmutable").orElseThrow().reinterpret(NSFileImmutable_LAYOUT.byteSize()) }
private val NSFileImmutable_VH: VarHandle by lazy { NSFileImmutable_LAYOUT.varHandle() }

var NSFileImmutable: MemorySegment
    get() = NSFileImmutable_VH.get(NSFileImmutable_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileImmutable_VH.set(NSFileImmutable_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileAppendOnly typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileAppendOnly_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileAppendOnly_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileAppendOnly").orElseThrow().reinterpret(NSFileAppendOnly_LAYOUT.byteSize()) }
private val NSFileAppendOnly_VH: VarHandle by lazy { NSFileAppendOnly_LAYOUT.varHandle() }

var NSFileAppendOnly: MemorySegment
    get() = NSFileAppendOnly_VH.get(NSFileAppendOnly_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileAppendOnly_VH.set(NSFileAppendOnly_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileCreationDate typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileCreationDate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileCreationDate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileCreationDate").orElseThrow().reinterpret(NSFileCreationDate_LAYOUT.byteSize()) }
private val NSFileCreationDate_VH: VarHandle by lazy { NSFileCreationDate_LAYOUT.varHandle() }

var NSFileCreationDate: MemorySegment
    get() = NSFileCreationDate_VH.get(NSFileCreationDate_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileCreationDate_VH.set(NSFileCreationDate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileOwnerAccountID typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileOwnerAccountID_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileOwnerAccountID_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileOwnerAccountID").orElseThrow().reinterpret(NSFileOwnerAccountID_LAYOUT.byteSize()) }
private val NSFileOwnerAccountID_VH: VarHandle by lazy { NSFileOwnerAccountID_LAYOUT.varHandle() }

var NSFileOwnerAccountID: MemorySegment
    get() = NSFileOwnerAccountID_VH.get(NSFileOwnerAccountID_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileOwnerAccountID_VH.set(NSFileOwnerAccountID_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileGroupOwnerAccountID typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileGroupOwnerAccountID_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileGroupOwnerAccountID_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileGroupOwnerAccountID").orElseThrow().reinterpret(NSFileGroupOwnerAccountID_LAYOUT.byteSize()) }
private val NSFileGroupOwnerAccountID_VH: VarHandle by lazy { NSFileGroupOwnerAccountID_LAYOUT.varHandle() }

var NSFileGroupOwnerAccountID: MemorySegment
    get() = NSFileGroupOwnerAccountID_VH.get(NSFileGroupOwnerAccountID_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileGroupOwnerAccountID_VH.set(NSFileGroupOwnerAccountID_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileBusy typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileBusy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileBusy_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileBusy").orElseThrow().reinterpret(NSFileBusy_LAYOUT.byteSize()) }
private val NSFileBusy_VH: VarHandle by lazy { NSFileBusy_LAYOUT.varHandle() }

var NSFileBusy: MemorySegment
    get() = NSFileBusy_VH.get(NSFileBusy_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileBusy_VH.set(NSFileBusy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileProtectionKey typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileProtectionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileProtectionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileProtectionKey").orElseThrow().reinterpret(NSFileProtectionKey_LAYOUT.byteSize()) }
private val NSFileProtectionKey_VH: VarHandle by lazy { NSFileProtectionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSFileProtectionKey: MemorySegment
    get() = NSFileProtectionKey_VH.get(NSFileProtectionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileProtectionKey_VH.set(NSFileProtectionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileProtectionNone typedef const NSFileProtectionType = (Void)*
 */
private val NSFileProtectionNone_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileProtectionNone_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileProtectionNone").orElseThrow().reinterpret(NSFileProtectionNone_LAYOUT.byteSize()) }
private val NSFileProtectionNone_VH: VarHandle by lazy { NSFileProtectionNone_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSFileProtectionNone: MemorySegment
    get() = NSFileProtectionNone_VH.get(NSFileProtectionNone_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileProtectionNone_VH.set(NSFileProtectionNone_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileProtectionComplete typedef const NSFileProtectionType = (Void)*
 */
private val NSFileProtectionComplete_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileProtectionComplete_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileProtectionComplete").orElseThrow().reinterpret(NSFileProtectionComplete_LAYOUT.byteSize()) }
private val NSFileProtectionComplete_VH: VarHandle by lazy { NSFileProtectionComplete_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSFileProtectionComplete: MemorySegment
    get() = NSFileProtectionComplete_VH.get(NSFileProtectionComplete_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileProtectionComplete_VH.set(NSFileProtectionComplete_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileProtectionCompleteUnlessOpen typedef const NSFileProtectionType = (Void)*
 */
private val NSFileProtectionCompleteUnlessOpen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileProtectionCompleteUnlessOpen_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileProtectionCompleteUnlessOpen").orElseThrow().reinterpret(NSFileProtectionCompleteUnlessOpen_LAYOUT.byteSize()) }
private val NSFileProtectionCompleteUnlessOpen_VH: VarHandle by lazy { NSFileProtectionCompleteUnlessOpen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSFileProtectionCompleteUnlessOpen: MemorySegment
    get() = NSFileProtectionCompleteUnlessOpen_VH.get(NSFileProtectionCompleteUnlessOpen_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileProtectionCompleteUnlessOpen_VH.set(NSFileProtectionCompleteUnlessOpen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileProtectionCompleteUntilFirstUserAuthentication typedef const NSFileProtectionType = (Void)*
 */
private val NSFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileProtectionCompleteUntilFirstUserAuthentication").orElseThrow().reinterpret(NSFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT.byteSize()) }
private val NSFileProtectionCompleteUntilFirstUserAuthentication_VH: VarHandle by lazy { NSFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSFileProtectionCompleteUntilFirstUserAuthentication: MemorySegment
    get() = NSFileProtectionCompleteUntilFirstUserAuthentication_VH.get(NSFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileProtectionCompleteUntilFirstUserAuthentication_VH.set(NSFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileProtectionCompleteWhenUserInactive typedef const NSFileProtectionType = (Void)*
 */
private val NSFileProtectionCompleteWhenUserInactive_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileProtectionCompleteWhenUserInactive_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileProtectionCompleteWhenUserInactive").orElseThrow().reinterpret(NSFileProtectionCompleteWhenUserInactive_LAYOUT.byteSize()) }
private val NSFileProtectionCompleteWhenUserInactive_VH: VarHandle by lazy { NSFileProtectionCompleteWhenUserInactive_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var NSFileProtectionCompleteWhenUserInactive: MemorySegment
    get() = NSFileProtectionCompleteWhenUserInactive_VH.get(NSFileProtectionCompleteWhenUserInactive_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileProtectionCompleteWhenUserInactive_VH.set(NSFileProtectionCompleteWhenUserInactive_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileSystemSize typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileSystemSize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileSystemSize_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileSystemSize").orElseThrow().reinterpret(NSFileSystemSize_LAYOUT.byteSize()) }
private val NSFileSystemSize_VH: VarHandle by lazy { NSFileSystemSize_LAYOUT.varHandle() }

var NSFileSystemSize: MemorySegment
    get() = NSFileSystemSize_VH.get(NSFileSystemSize_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileSystemSize_VH.set(NSFileSystemSize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileSystemFreeSize typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileSystemFreeSize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileSystemFreeSize_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileSystemFreeSize").orElseThrow().reinterpret(NSFileSystemFreeSize_LAYOUT.byteSize()) }
private val NSFileSystemFreeSize_VH: VarHandle by lazy { NSFileSystemFreeSize_LAYOUT.varHandle() }

var NSFileSystemFreeSize: MemorySegment
    get() = NSFileSystemFreeSize_VH.get(NSFileSystemFreeSize_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileSystemFreeSize_VH.set(NSFileSystemFreeSize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileSystemNodes typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileSystemNodes_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileSystemNodes_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileSystemNodes").orElseThrow().reinterpret(NSFileSystemNodes_LAYOUT.byteSize()) }
private val NSFileSystemNodes_VH: VarHandle by lazy { NSFileSystemNodes_LAYOUT.varHandle() }

var NSFileSystemNodes: MemorySegment
    get() = NSFileSystemNodes_VH.get(NSFileSystemNodes_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileSystemNodes_VH.set(NSFileSystemNodes_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileSystemFreeNodes typedef const NSFileAttributeKey = (Void)*
 */
private val NSFileSystemFreeNodes_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileSystemFreeNodes_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileSystemFreeNodes").orElseThrow().reinterpret(NSFileSystemFreeNodes_LAYOUT.byteSize()) }
private val NSFileSystemFreeNodes_VH: VarHandle by lazy { NSFileSystemFreeNodes_LAYOUT.varHandle() }

var NSFileSystemFreeNodes: MemorySegment
    get() = NSFileSystemFreeNodes_VH.get(NSFileSystemFreeNodes_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileSystemFreeNodes_VH.set(NSFileSystemFreeNodes_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFreeHashTable Void(typedef NSHashTable = (Void)*)
 */
private val NSFreeHashTable_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSFreeHashTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFreeHashTable").orElseThrow() }
private val NSFreeHashTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSFreeHashTable_ADDR, NSFreeHashTable_DESC) }

fun NSFreeHashTable(arg0: MemorySegment): Unit {
    try {
        NSFreeHashTable_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSResetHashTable Void(typedef NSHashTable = (Void)*)
 */
private val NSResetHashTable_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSResetHashTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSResetHashTable").orElseThrow() }
private val NSResetHashTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSResetHashTable_ADDR, NSResetHashTable_DESC) }

fun NSResetHashTable(arg0: MemorySegment): Unit {
    try {
        NSResetHashTable_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCompareHashTables typedef BOOL = Bool(typedef NSHashTable = (Void)*,typedef NSHashTable = (Void)*)
 */
private val NSCompareHashTables_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSCompareHashTables_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCompareHashTables").orElseThrow() }
private val NSCompareHashTables_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCompareHashTables_ADDR, NSCompareHashTables_DESC) }

fun NSCompareHashTables(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSCompareHashTables_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCopyHashTableWithZone typedef NSHashTable = (Void)*(typedef NSHashTable = (Void)*,(typedef NSZone = Declared(_NSZone))*)
 */
private val NSCopyHashTableWithZone_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSCopyHashTableWithZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCopyHashTableWithZone").orElseThrow() }
private val NSCopyHashTableWithZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCopyHashTableWithZone_ADDR, NSCopyHashTableWithZone_DESC) }

fun NSCopyHashTableWithZone(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSCopyHashTableWithZone_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHashGet (Void)*(typedef NSHashTable = (Void)*,(Void)*)
 */
private val NSHashGet_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSHashGet_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHashGet").orElseThrow() }
private val NSHashGet_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHashGet_ADDR, NSHashGet_DESC) }

fun NSHashGet(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSHashGet_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHashInsert Void(typedef NSHashTable = (Void)*,(Void)*)
 */
private val NSHashInsert_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSHashInsert_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHashInsert").orElseThrow() }
private val NSHashInsert_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHashInsert_ADDR, NSHashInsert_DESC) }

fun NSHashInsert(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSHashInsert_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHashInsertKnownAbsent Void(typedef NSHashTable = (Void)*,(Void)*)
 */
private val NSHashInsertKnownAbsent_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSHashInsertKnownAbsent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHashInsertKnownAbsent").orElseThrow() }
private val NSHashInsertKnownAbsent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHashInsertKnownAbsent_ADDR, NSHashInsertKnownAbsent_DESC) }

fun NSHashInsertKnownAbsent(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSHashInsertKnownAbsent_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHashInsertIfAbsent (Void)*(typedef NSHashTable = (Void)*,(Void)*)
 */
private val NSHashInsertIfAbsent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSHashInsertIfAbsent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHashInsertIfAbsent").orElseThrow() }
private val NSHashInsertIfAbsent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHashInsertIfAbsent_ADDR, NSHashInsertIfAbsent_DESC) }

fun NSHashInsertIfAbsent(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSHashInsertIfAbsent_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHashRemove Void(typedef NSHashTable = (Void)*,(Void)*)
 */
private val NSHashRemove_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSHashRemove_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHashRemove").orElseThrow() }
private val NSHashRemove_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHashRemove_ADDR, NSHashRemove_DESC) }

fun NSHashRemove(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSHashRemove_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSEnumerateHashTable typedef NSHashEnumerator = Declared(NSHashEnumerator)(typedef NSHashTable = (Void)*)
 */
private val NSEnumerateHashTable_DESC: FunctionDescriptor = FunctionDescriptor.of(NSHashEnumerator.layout, ValueLayout.ADDRESS)
private val NSEnumerateHashTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEnumerateHashTable").orElseThrow() }
private val NSEnumerateHashTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEnumerateHashTable_ADDR, NSEnumerateHashTable_DESC) }

fun NSEnumerateHashTable(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return NSEnumerateHashTable_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSNextHashEnumeratorItem (Void)*((typedef NSHashEnumerator = Declared(NSHashEnumerator))*)
 */
private val NSNextHashEnumeratorItem_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSNextHashEnumeratorItem_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNextHashEnumeratorItem").orElseThrow() }
private val NSNextHashEnumeratorItem_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSNextHashEnumeratorItem_ADDR, NSNextHashEnumeratorItem_DESC) }

fun NSNextHashEnumeratorItem(arg0: MemorySegment): MemorySegment {
    try {
        return NSNextHashEnumeratorItem_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSEndHashTableEnumeration Void((typedef NSHashEnumerator = Declared(NSHashEnumerator))*)
 */
private val NSEndHashTableEnumeration_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSEndHashTableEnumeration_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEndHashTableEnumeration").orElseThrow() }
private val NSEndHashTableEnumeration_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEndHashTableEnumeration_ADDR, NSEndHashTableEnumeration_DESC) }

fun NSEndHashTableEnumeration(arg0: MemorySegment): Unit {
    try {
        NSEndHashTableEnumeration_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCountHashTable typedef NSUInteger = UNSIGNED = Long(typedef NSHashTable = (Void)*)
 */
private val NSCountHashTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSCountHashTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCountHashTable").orElseThrow() }
private val NSCountHashTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCountHashTable_ADDR, NSCountHashTable_DESC) }

fun NSCountHashTable(arg0: MemorySegment): Long {
    try {
        return NSCountHashTable_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSStringFromHashTable typedef NSString = (Void)*(typedef NSHashTable = (Void)*)
 */
private val NSStringFromHashTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSStringFromHashTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromHashTable").orElseThrow() }
private val NSStringFromHashTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromHashTable_ADDR, NSStringFromHashTable_DESC) }

fun NSStringFromHashTable(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromHashTable_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAllHashTableObjects typedef NSArray = (Void)*(typedef NSHashTable = (Void)*)
 */
private val NSAllHashTableObjects_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAllHashTableObjects_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllHashTableObjects").orElseThrow() }
private val NSAllHashTableObjects_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSAllHashTableObjects_ADDR, NSAllHashTableObjects_DESC) }

fun NSAllHashTableObjects(arg0: MemorySegment): MemorySegment {
    try {
        return NSAllHashTableObjects_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCreateHashTableWithZone typedef NSHashTable = (Void)*(typedef NSHashTableCallBacks = Declared(NSHashTableCallBacks),typedef NSUInteger = UNSIGNED = Long,(typedef NSZone = Declared(_NSZone))*)
 */
private val NSCreateHashTableWithZone_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, NSHashTableCallBacks.layout, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSCreateHashTableWithZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCreateHashTableWithZone").orElseThrow() }
private val NSCreateHashTableWithZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCreateHashTableWithZone_ADDR, NSCreateHashTableWithZone_DESC) }

fun NSCreateHashTableWithZone(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return NSCreateHashTableWithZone_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCreateHashTable typedef NSHashTable = (Void)*(typedef NSHashTableCallBacks = Declared(NSHashTableCallBacks),typedef NSUInteger = UNSIGNED = Long)
 */
private val NSCreateHashTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, NSHashTableCallBacks.layout, ValueLayout.JAVA_LONG)
private val NSCreateHashTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCreateHashTable").orElseThrow() }
private val NSCreateHashTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCreateHashTable_ADDR, NSCreateHashTable_DESC) }

fun NSCreateHashTable(arg0: MemorySegment, arg1: Long): MemorySegment {
    try {
        return NSCreateHashTable_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSIntegerHashCallBacks typedef const NSHashTableCallBacks = Declared(NSHashTableCallBacks)
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
val NSIntegerHashCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSIntegerHashCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSNonOwnedPointerHashCallBacks typedef const NSHashTableCallBacks = Declared(NSHashTableCallBacks)
 */
val NSNonOwnedPointerHashCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSNonOwnedPointerHashCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSNonRetainedObjectHashCallBacks typedef const NSHashTableCallBacks = Declared(NSHashTableCallBacks)
 */
val NSNonRetainedObjectHashCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSNonRetainedObjectHashCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSObjectHashCallBacks typedef const NSHashTableCallBacks = Declared(NSHashTableCallBacks)
 */
val NSObjectHashCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSObjectHashCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSOwnedObjectIdentityHashCallBacks typedef const NSHashTableCallBacks = Declared(NSHashTableCallBacks)
 */
val NSOwnedObjectIdentityHashCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSOwnedObjectIdentityHashCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSOwnedPointerHashCallBacks typedef const NSHashTableCallBacks = Declared(NSHashTableCallBacks)
 */
val NSOwnedPointerHashCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSOwnedPointerHashCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSPointerToStructHashCallBacks typedef const NSHashTableCallBacks = Declared(NSHashTableCallBacks)
 */
val NSPointerToStructHashCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSPointerToStructHashCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSIntHashCallBacks typedef const NSHashTableCallBacks = Declared(NSHashTableCallBacks)
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
val NSIntHashCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSIntHashCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSHTTPCookieName typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieName").orElseThrow().reinterpret(NSHTTPCookieName_LAYOUT.byteSize()) }
private val NSHTTPCookieName_VH: VarHandle by lazy { NSHTTPCookieName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieName: MemorySegment
    get() = NSHTTPCookieName_VH.get(NSHTTPCookieName_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieName_VH.set(NSHTTPCookieName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieValue typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieValue").orElseThrow().reinterpret(NSHTTPCookieValue_LAYOUT.byteSize()) }
private val NSHTTPCookieValue_VH: VarHandle by lazy { NSHTTPCookieValue_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieValue: MemorySegment
    get() = NSHTTPCookieValue_VH.get(NSHTTPCookieValue_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieValue_VH.set(NSHTTPCookieValue_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieOriginURL typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieOriginURL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieOriginURL_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieOriginURL").orElseThrow().reinterpret(NSHTTPCookieOriginURL_LAYOUT.byteSize()) }
private val NSHTTPCookieOriginURL_VH: VarHandle by lazy { NSHTTPCookieOriginURL_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieOriginURL: MemorySegment
    get() = NSHTTPCookieOriginURL_VH.get(NSHTTPCookieOriginURL_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieOriginURL_VH.set(NSHTTPCookieOriginURL_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieVersion typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieVersion_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieVersion_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieVersion").orElseThrow().reinterpret(NSHTTPCookieVersion_LAYOUT.byteSize()) }
private val NSHTTPCookieVersion_VH: VarHandle by lazy { NSHTTPCookieVersion_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieVersion: MemorySegment
    get() = NSHTTPCookieVersion_VH.get(NSHTTPCookieVersion_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieVersion_VH.set(NSHTTPCookieVersion_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieDomain typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieDomain_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieDomain").orElseThrow().reinterpret(NSHTTPCookieDomain_LAYOUT.byteSize()) }
private val NSHTTPCookieDomain_VH: VarHandle by lazy { NSHTTPCookieDomain_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieDomain: MemorySegment
    get() = NSHTTPCookieDomain_VH.get(NSHTTPCookieDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieDomain_VH.set(NSHTTPCookieDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookiePath typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookiePath_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookiePath_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookiePath").orElseThrow().reinterpret(NSHTTPCookiePath_LAYOUT.byteSize()) }
private val NSHTTPCookiePath_VH: VarHandle by lazy { NSHTTPCookiePath_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookiePath: MemorySegment
    get() = NSHTTPCookiePath_VH.get(NSHTTPCookiePath_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookiePath_VH.set(NSHTTPCookiePath_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieSecure typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieSecure_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieSecure_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieSecure").orElseThrow().reinterpret(NSHTTPCookieSecure_LAYOUT.byteSize()) }
private val NSHTTPCookieSecure_VH: VarHandle by lazy { NSHTTPCookieSecure_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieSecure: MemorySegment
    get() = NSHTTPCookieSecure_VH.get(NSHTTPCookieSecure_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieSecure_VH.set(NSHTTPCookieSecure_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieExpires typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieExpires_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieExpires_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieExpires").orElseThrow().reinterpret(NSHTTPCookieExpires_LAYOUT.byteSize()) }
private val NSHTTPCookieExpires_VH: VarHandle by lazy { NSHTTPCookieExpires_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieExpires: MemorySegment
    get() = NSHTTPCookieExpires_VH.get(NSHTTPCookieExpires_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieExpires_VH.set(NSHTTPCookieExpires_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieComment typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieComment_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieComment_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieComment").orElseThrow().reinterpret(NSHTTPCookieComment_LAYOUT.byteSize()) }
private val NSHTTPCookieComment_VH: VarHandle by lazy { NSHTTPCookieComment_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieComment: MemorySegment
    get() = NSHTTPCookieComment_VH.get(NSHTTPCookieComment_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieComment_VH.set(NSHTTPCookieComment_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieCommentURL typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieCommentURL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieCommentURL_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieCommentURL").orElseThrow().reinterpret(NSHTTPCookieCommentURL_LAYOUT.byteSize()) }
private val NSHTTPCookieCommentURL_VH: VarHandle by lazy { NSHTTPCookieCommentURL_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieCommentURL: MemorySegment
    get() = NSHTTPCookieCommentURL_VH.get(NSHTTPCookieCommentURL_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieCommentURL_VH.set(NSHTTPCookieCommentURL_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieDiscard typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieDiscard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieDiscard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieDiscard").orElseThrow().reinterpret(NSHTTPCookieDiscard_LAYOUT.byteSize()) }
private val NSHTTPCookieDiscard_VH: VarHandle by lazy { NSHTTPCookieDiscard_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieDiscard: MemorySegment
    get() = NSHTTPCookieDiscard_VH.get(NSHTTPCookieDiscard_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieDiscard_VH.set(NSHTTPCookieDiscard_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieMaximumAge typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieMaximumAge_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieMaximumAge_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieMaximumAge").orElseThrow().reinterpret(NSHTTPCookieMaximumAge_LAYOUT.byteSize()) }
private val NSHTTPCookieMaximumAge_VH: VarHandle by lazy { NSHTTPCookieMaximumAge_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieMaximumAge: MemorySegment
    get() = NSHTTPCookieMaximumAge_VH.get(NSHTTPCookieMaximumAge_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieMaximumAge_VH.set(NSHTTPCookieMaximumAge_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookiePort typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookiePort_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookiePort_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookiePort").orElseThrow().reinterpret(NSHTTPCookiePort_LAYOUT.byteSize()) }
private val NSHTTPCookiePort_VH: VarHandle by lazy { NSHTTPCookiePort_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookiePort: MemorySegment
    get() = NSHTTPCookiePort_VH.get(NSHTTPCookiePort_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookiePort_VH.set(NSHTTPCookiePort_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieSetByJavaScript typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieSetByJavaScript_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieSetByJavaScript_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieSetByJavaScript").orElseThrow().reinterpret(NSHTTPCookieSetByJavaScript_LAYOUT.byteSize()) }
private val NSHTTPCookieSetByJavaScript_VH: VarHandle by lazy { NSHTTPCookieSetByJavaScript_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 2, introducedSubminor = -1)
var NSHTTPCookieSetByJavaScript: MemorySegment
    get() = NSHTTPCookieSetByJavaScript_VH.get(NSHTTPCookieSetByJavaScript_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieSetByJavaScript_VH.set(NSHTTPCookieSetByJavaScript_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieSameSitePolicy typedef const NSHTTPCookiePropertyKey = (Void)*
 */
private val NSHTTPCookieSameSitePolicy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieSameSitePolicy_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieSameSitePolicy").orElseThrow().reinterpret(NSHTTPCookieSameSitePolicy_LAYOUT.byteSize()) }
private val NSHTTPCookieSameSitePolicy_VH: VarHandle by lazy { NSHTTPCookieSameSitePolicy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieSameSitePolicy: MemorySegment
    get() = NSHTTPCookieSameSitePolicy_VH.get(NSHTTPCookieSameSitePolicy_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieSameSitePolicy_VH.set(NSHTTPCookieSameSitePolicy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieSameSiteLax typedef const NSHTTPCookieStringPolicy = (Void)*
 */
private val NSHTTPCookieSameSiteLax_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieSameSiteLax_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieSameSiteLax").orElseThrow().reinterpret(NSHTTPCookieSameSiteLax_LAYOUT.byteSize()) }
private val NSHTTPCookieSameSiteLax_VH: VarHandle by lazy { NSHTTPCookieSameSiteLax_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieSameSiteLax: MemorySegment
    get() = NSHTTPCookieSameSiteLax_VH.get(NSHTTPCookieSameSiteLax_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieSameSiteLax_VH.set(NSHTTPCookieSameSiteLax_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieSameSiteStrict typedef const NSHTTPCookieStringPolicy = (Void)*
 */
private val NSHTTPCookieSameSiteStrict_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieSameSiteStrict_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieSameSiteStrict").orElseThrow().reinterpret(NSHTTPCookieSameSiteStrict_LAYOUT.byteSize()) }
private val NSHTTPCookieSameSiteStrict_VH: VarHandle by lazy { NSHTTPCookieSameSiteStrict_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieSameSiteStrict: MemorySegment
    get() = NSHTTPCookieSameSiteStrict_VH.get(NSHTTPCookieSameSiteStrict_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieSameSiteStrict_VH.set(NSHTTPCookieSameSiteStrict_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieManagerAcceptPolicyChangedNotification typedef const NSNotificationName = (Void)*
 */
private val NSHTTPCookieManagerAcceptPolicyChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieManagerAcceptPolicyChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieManagerAcceptPolicyChangedNotification").orElseThrow().reinterpret(NSHTTPCookieManagerAcceptPolicyChangedNotification_LAYOUT.byteSize()) }
private val NSHTTPCookieManagerAcceptPolicyChangedNotification_VH: VarHandle by lazy { NSHTTPCookieManagerAcceptPolicyChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 1, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
var NSHTTPCookieManagerAcceptPolicyChangedNotification: MemorySegment
    get() = NSHTTPCookieManagerAcceptPolicyChangedNotification_VH.get(NSHTTPCookieManagerAcceptPolicyChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieManagerAcceptPolicyChangedNotification_VH.set(NSHTTPCookieManagerAcceptPolicyChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPCookieManagerCookiesChangedNotification typedef const NSNotificationName = (Void)*
 */
private val NSHTTPCookieManagerCookiesChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPCookieManagerCookiesChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPCookieManagerCookiesChangedNotification").orElseThrow().reinterpret(NSHTTPCookieManagerCookiesChangedNotification_LAYOUT.byteSize()) }
private val NSHTTPCookieManagerCookiesChangedNotification_VH: VarHandle by lazy { NSHTTPCookieManagerCookiesChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSHTTPCookieManagerCookiesChangedNotification: MemorySegment
    get() = NSHTTPCookieManagerCookiesChangedNotification_VH.get(NSHTTPCookieManagerCookiesChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPCookieManagerCookiesChangedNotification_VH.set(NSHTTPCookieManagerCookiesChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndefinedKeyException typedef const NSExceptionName = (Void)*
 */
private val NSUndefinedKeyException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndefinedKeyException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUndefinedKeyException").orElseThrow().reinterpret(NSUndefinedKeyException_LAYOUT.byteSize()) }
private val NSUndefinedKeyException_VH: VarHandle by lazy { NSUndefinedKeyException_LAYOUT.varHandle() }

var NSUndefinedKeyException: MemorySegment
    get() = NSUndefinedKeyException_VH.get(NSUndefinedKeyException_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndefinedKeyException_VH.set(NSUndefinedKeyException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAverageKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSAverageKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAverageKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAverageKeyValueOperator").orElseThrow().reinterpret(NSAverageKeyValueOperator_LAYOUT.byteSize()) }
private val NSAverageKeyValueOperator_VH: VarHandle by lazy { NSAverageKeyValueOperator_LAYOUT.varHandle() }

var NSAverageKeyValueOperator: MemorySegment
    get() = NSAverageKeyValueOperator_VH.get(NSAverageKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSAverageKeyValueOperator_VH.set(NSAverageKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCountKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSCountKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCountKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCountKeyValueOperator").orElseThrow().reinterpret(NSCountKeyValueOperator_LAYOUT.byteSize()) }
private val NSCountKeyValueOperator_VH: VarHandle by lazy { NSCountKeyValueOperator_LAYOUT.varHandle() }

var NSCountKeyValueOperator: MemorySegment
    get() = NSCountKeyValueOperator_VH.get(NSCountKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSCountKeyValueOperator_VH.set(NSCountKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDistinctUnionOfArraysKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSDistinctUnionOfArraysKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDistinctUnionOfArraysKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDistinctUnionOfArraysKeyValueOperator").orElseThrow().reinterpret(NSDistinctUnionOfArraysKeyValueOperator_LAYOUT.byteSize()) }
private val NSDistinctUnionOfArraysKeyValueOperator_VH: VarHandle by lazy { NSDistinctUnionOfArraysKeyValueOperator_LAYOUT.varHandle() }

var NSDistinctUnionOfArraysKeyValueOperator: MemorySegment
    get() = NSDistinctUnionOfArraysKeyValueOperator_VH.get(NSDistinctUnionOfArraysKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSDistinctUnionOfArraysKeyValueOperator_VH.set(NSDistinctUnionOfArraysKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDistinctUnionOfObjectsKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSDistinctUnionOfObjectsKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDistinctUnionOfObjectsKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDistinctUnionOfObjectsKeyValueOperator").orElseThrow().reinterpret(NSDistinctUnionOfObjectsKeyValueOperator_LAYOUT.byteSize()) }
private val NSDistinctUnionOfObjectsKeyValueOperator_VH: VarHandle by lazy { NSDistinctUnionOfObjectsKeyValueOperator_LAYOUT.varHandle() }

var NSDistinctUnionOfObjectsKeyValueOperator: MemorySegment
    get() = NSDistinctUnionOfObjectsKeyValueOperator_VH.get(NSDistinctUnionOfObjectsKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSDistinctUnionOfObjectsKeyValueOperator_VH.set(NSDistinctUnionOfObjectsKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDistinctUnionOfSetsKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSDistinctUnionOfSetsKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDistinctUnionOfSetsKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDistinctUnionOfSetsKeyValueOperator").orElseThrow().reinterpret(NSDistinctUnionOfSetsKeyValueOperator_LAYOUT.byteSize()) }
private val NSDistinctUnionOfSetsKeyValueOperator_VH: VarHandle by lazy { NSDistinctUnionOfSetsKeyValueOperator_LAYOUT.varHandle() }

var NSDistinctUnionOfSetsKeyValueOperator: MemorySegment
    get() = NSDistinctUnionOfSetsKeyValueOperator_VH.get(NSDistinctUnionOfSetsKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSDistinctUnionOfSetsKeyValueOperator_VH.set(NSDistinctUnionOfSetsKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMaximumKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSMaximumKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMaximumKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMaximumKeyValueOperator").orElseThrow().reinterpret(NSMaximumKeyValueOperator_LAYOUT.byteSize()) }
private val NSMaximumKeyValueOperator_VH: VarHandle by lazy { NSMaximumKeyValueOperator_LAYOUT.varHandle() }

var NSMaximumKeyValueOperator: MemorySegment
    get() = NSMaximumKeyValueOperator_VH.get(NSMaximumKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSMaximumKeyValueOperator_VH.set(NSMaximumKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMinimumKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSMinimumKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMinimumKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMinimumKeyValueOperator").orElseThrow().reinterpret(NSMinimumKeyValueOperator_LAYOUT.byteSize()) }
private val NSMinimumKeyValueOperator_VH: VarHandle by lazy { NSMinimumKeyValueOperator_LAYOUT.varHandle() }

var NSMinimumKeyValueOperator: MemorySegment
    get() = NSMinimumKeyValueOperator_VH.get(NSMinimumKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSMinimumKeyValueOperator_VH.set(NSMinimumKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSumKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSSumKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSumKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSumKeyValueOperator").orElseThrow().reinterpret(NSSumKeyValueOperator_LAYOUT.byteSize()) }
private val NSSumKeyValueOperator_VH: VarHandle by lazy { NSSumKeyValueOperator_LAYOUT.varHandle() }

var NSSumKeyValueOperator: MemorySegment
    get() = NSSumKeyValueOperator_VH.get(NSSumKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSSumKeyValueOperator_VH.set(NSSumKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnionOfArraysKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSUnionOfArraysKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUnionOfArraysKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUnionOfArraysKeyValueOperator").orElseThrow().reinterpret(NSUnionOfArraysKeyValueOperator_LAYOUT.byteSize()) }
private val NSUnionOfArraysKeyValueOperator_VH: VarHandle by lazy { NSUnionOfArraysKeyValueOperator_LAYOUT.varHandle() }

var NSUnionOfArraysKeyValueOperator: MemorySegment
    get() = NSUnionOfArraysKeyValueOperator_VH.get(NSUnionOfArraysKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSUnionOfArraysKeyValueOperator_VH.set(NSUnionOfArraysKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnionOfObjectsKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSUnionOfObjectsKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUnionOfObjectsKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUnionOfObjectsKeyValueOperator").orElseThrow().reinterpret(NSUnionOfObjectsKeyValueOperator_LAYOUT.byteSize()) }
private val NSUnionOfObjectsKeyValueOperator_VH: VarHandle by lazy { NSUnionOfObjectsKeyValueOperator_LAYOUT.varHandle() }

var NSUnionOfObjectsKeyValueOperator: MemorySegment
    get() = NSUnionOfObjectsKeyValueOperator_VH.get(NSUnionOfObjectsKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSUnionOfObjectsKeyValueOperator_VH.set(NSUnionOfObjectsKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnionOfSetsKeyValueOperator typedef const NSKeyValueOperator = (Void)*
 */
private val NSUnionOfSetsKeyValueOperator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUnionOfSetsKeyValueOperator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUnionOfSetsKeyValueOperator").orElseThrow().reinterpret(NSUnionOfSetsKeyValueOperator_LAYOUT.byteSize()) }
private val NSUnionOfSetsKeyValueOperator_VH: VarHandle by lazy { NSUnionOfSetsKeyValueOperator_LAYOUT.varHandle() }

var NSUnionOfSetsKeyValueOperator: MemorySegment
    get() = NSUnionOfSetsKeyValueOperator_VH.get(NSUnionOfSetsKeyValueOperator_SEGMENT, 0L) as MemorySegment
    set(value) = NSUnionOfSetsKeyValueOperator_VH.set(NSUnionOfSetsKeyValueOperator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKeyValueChangeKindKey typedef const NSKeyValueChangeKey = (Void)*
 */
private val NSKeyValueChangeKindKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKeyValueChangeKindKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSKeyValueChangeKindKey").orElseThrow().reinterpret(NSKeyValueChangeKindKey_LAYOUT.byteSize()) }
private val NSKeyValueChangeKindKey_VH: VarHandle by lazy { NSKeyValueChangeKindKey_LAYOUT.varHandle() }

var NSKeyValueChangeKindKey: MemorySegment
    get() = NSKeyValueChangeKindKey_VH.get(NSKeyValueChangeKindKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSKeyValueChangeKindKey_VH.set(NSKeyValueChangeKindKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKeyValueChangeNewKey typedef const NSKeyValueChangeKey = (Void)*
 */
private val NSKeyValueChangeNewKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKeyValueChangeNewKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSKeyValueChangeNewKey").orElseThrow().reinterpret(NSKeyValueChangeNewKey_LAYOUT.byteSize()) }
private val NSKeyValueChangeNewKey_VH: VarHandle by lazy { NSKeyValueChangeNewKey_LAYOUT.varHandle() }

var NSKeyValueChangeNewKey: MemorySegment
    get() = NSKeyValueChangeNewKey_VH.get(NSKeyValueChangeNewKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSKeyValueChangeNewKey_VH.set(NSKeyValueChangeNewKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKeyValueChangeOldKey typedef const NSKeyValueChangeKey = (Void)*
 */
private val NSKeyValueChangeOldKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKeyValueChangeOldKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSKeyValueChangeOldKey").orElseThrow().reinterpret(NSKeyValueChangeOldKey_LAYOUT.byteSize()) }
private val NSKeyValueChangeOldKey_VH: VarHandle by lazy { NSKeyValueChangeOldKey_LAYOUT.varHandle() }

var NSKeyValueChangeOldKey: MemorySegment
    get() = NSKeyValueChangeOldKey_VH.get(NSKeyValueChangeOldKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSKeyValueChangeOldKey_VH.set(NSKeyValueChangeOldKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKeyValueChangeIndexesKey typedef const NSKeyValueChangeKey = (Void)*
 */
private val NSKeyValueChangeIndexesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKeyValueChangeIndexesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSKeyValueChangeIndexesKey").orElseThrow().reinterpret(NSKeyValueChangeIndexesKey_LAYOUT.byteSize()) }
private val NSKeyValueChangeIndexesKey_VH: VarHandle by lazy { NSKeyValueChangeIndexesKey_LAYOUT.varHandle() }

var NSKeyValueChangeIndexesKey: MemorySegment
    get() = NSKeyValueChangeIndexesKey_VH.get(NSKeyValueChangeIndexesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSKeyValueChangeIndexesKey_VH.set(NSKeyValueChangeIndexesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKeyValueChangeNotificationIsPriorKey typedef const NSKeyValueChangeKey = (Void)*
 */
private val NSKeyValueChangeNotificationIsPriorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKeyValueChangeNotificationIsPriorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSKeyValueChangeNotificationIsPriorKey").orElseThrow().reinterpret(NSKeyValueChangeNotificationIsPriorKey_LAYOUT.byteSize()) }
private val NSKeyValueChangeNotificationIsPriorKey_VH: VarHandle by lazy { NSKeyValueChangeNotificationIsPriorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSKeyValueChangeNotificationIsPriorKey: MemorySegment
    get() = NSKeyValueChangeNotificationIsPriorKey_VH.get(NSKeyValueChangeNotificationIsPriorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSKeyValueChangeNotificationIsPriorKey_VH.set(NSKeyValueChangeNotificationIsPriorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGPointZero typedef const CGPoint = Declared(CGPoint)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
val CGPointZero: MemorySegment = SymbolLookup.loaderLookup().find("CGPointZero").orElseThrow()

/**
 * {@snippet lang=c : CGSizeZero typedef const CGSize = Declared(CGSize)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
val CGSizeZero: MemorySegment = SymbolLookup.loaderLookup().find("CGSizeZero").orElseThrow()

/**
 * {@snippet lang=c : CGRectZero typedef const CGRect = Declared(CGRect)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
val CGRectZero: MemorySegment = SymbolLookup.loaderLookup().find("CGRectZero").orElseThrow()

/**
 * {@snippet lang=c : CGRectNull typedef const CGRect = Declared(CGRect)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
val CGRectNull: MemorySegment = SymbolLookup.loaderLookup().find("CGRectNull").orElseThrow()

/**
 * {@snippet lang=c : CGRectInfinite typedef const CGRect = Declared(CGRect)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
val CGRectInfinite: MemorySegment = SymbolLookup.loaderLookup().find("CGRectInfinite").orElseThrow()

/**
 * {@snippet lang=c : CGRectGetMinX typedef CGFloat = Double(typedef CGRect = Declared(CGRect))
 */
private val CGRectGetMinX_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, CGRect.layout)
private val CGRectGetMinX_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectGetMinX").orElseThrow() }
private val CGRectGetMinX_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectGetMinX_ADDR, CGRectGetMinX_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMinX(arg0: MemorySegment): Double {
    try {
        return CGRectGetMinX_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMinX(arg0: CGRect): Double {
    return CGRectGetMinX(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectGetMidX typedef CGFloat = Double(typedef CGRect = Declared(CGRect))
 */
private val CGRectGetMidX_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, CGRect.layout)
private val CGRectGetMidX_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectGetMidX").orElseThrow() }
private val CGRectGetMidX_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectGetMidX_ADDR, CGRectGetMidX_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMidX(arg0: MemorySegment): Double {
    try {
        return CGRectGetMidX_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMidX(arg0: CGRect): Double {
    return CGRectGetMidX(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectGetMaxX typedef CGFloat = Double(typedef CGRect = Declared(CGRect))
 */
private val CGRectGetMaxX_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, CGRect.layout)
private val CGRectGetMaxX_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectGetMaxX").orElseThrow() }
private val CGRectGetMaxX_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectGetMaxX_ADDR, CGRectGetMaxX_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMaxX(arg0: MemorySegment): Double {
    try {
        return CGRectGetMaxX_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMaxX(arg0: CGRect): Double {
    return CGRectGetMaxX(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectGetMinY typedef CGFloat = Double(typedef CGRect = Declared(CGRect))
 */
private val CGRectGetMinY_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, CGRect.layout)
private val CGRectGetMinY_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectGetMinY").orElseThrow() }
private val CGRectGetMinY_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectGetMinY_ADDR, CGRectGetMinY_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMinY(arg0: MemorySegment): Double {
    try {
        return CGRectGetMinY_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMinY(arg0: CGRect): Double {
    return CGRectGetMinY(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectGetMidY typedef CGFloat = Double(typedef CGRect = Declared(CGRect))
 */
private val CGRectGetMidY_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, CGRect.layout)
private val CGRectGetMidY_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectGetMidY").orElseThrow() }
private val CGRectGetMidY_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectGetMidY_ADDR, CGRectGetMidY_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMidY(arg0: MemorySegment): Double {
    try {
        return CGRectGetMidY_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMidY(arg0: CGRect): Double {
    return CGRectGetMidY(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectGetMaxY typedef CGFloat = Double(typedef CGRect = Declared(CGRect))
 */
private val CGRectGetMaxY_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, CGRect.layout)
private val CGRectGetMaxY_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectGetMaxY").orElseThrow() }
private val CGRectGetMaxY_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectGetMaxY_ADDR, CGRectGetMaxY_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMaxY(arg0: MemorySegment): Double {
    try {
        return CGRectGetMaxY_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetMaxY(arg0: CGRect): Double {
    return CGRectGetMaxY(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectGetWidth typedef CGFloat = Double(typedef CGRect = Declared(CGRect))
 */
private val CGRectGetWidth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, CGRect.layout)
private val CGRectGetWidth_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectGetWidth").orElseThrow() }
private val CGRectGetWidth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectGetWidth_ADDR, CGRectGetWidth_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetWidth(arg0: MemorySegment): Double {
    try {
        return CGRectGetWidth_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetWidth(arg0: CGRect): Double {
    return CGRectGetWidth(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectGetHeight typedef CGFloat = Double(typedef CGRect = Declared(CGRect))
 */
private val CGRectGetHeight_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, CGRect.layout)
private val CGRectGetHeight_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectGetHeight").orElseThrow() }
private val CGRectGetHeight_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectGetHeight_ADDR, CGRectGetHeight_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetHeight(arg0: MemorySegment): Double {
    try {
        return CGRectGetHeight_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectGetHeight(arg0: CGRect): Double {
    return CGRectGetHeight(arg0.segment)
}

/**
 * {@snippet lang=c : CGPointEqualToPoint Bool(typedef CGPoint = Declared(CGPoint),typedef CGPoint = Declared(CGPoint))
 */
private val CGPointEqualToPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGPoint.layout, CGPoint.layout)
private val CGPointEqualToPoint_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGPointEqualToPoint").orElseThrow() }
private val CGPointEqualToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPointEqualToPoint_ADDR, CGPointEqualToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPointEqualToPoint(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPointEqualToPoint_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPointEqualToPoint(arg0: CGPoint, arg1: CGPoint): Boolean {
    return CGPointEqualToPoint(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : CGSizeEqualToSize Bool(typedef CGSize = Declared(CGSize),typedef CGSize = Declared(CGSize))
 */
private val CGSizeEqualToSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGSize.layout, CGSize.layout)
private val CGSizeEqualToSize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGSizeEqualToSize").orElseThrow() }
private val CGSizeEqualToSize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGSizeEqualToSize_ADDR, CGSizeEqualToSize_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGSizeEqualToSize(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGSizeEqualToSize_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGSizeEqualToSize(arg0: CGSize, arg1: CGSize): Boolean {
    return CGSizeEqualToSize(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : CGRectEqualToRect Bool(typedef CGRect = Declared(CGRect),typedef CGRect = Declared(CGRect))
 */
private val CGRectEqualToRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout, CGRect.layout)
private val CGRectEqualToRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectEqualToRect").orElseThrow() }
private val CGRectEqualToRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectEqualToRect_ADDR, CGRectEqualToRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectEqualToRect(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGRectEqualToRect_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectEqualToRect(arg0: CGRect, arg1: CGRect): Boolean {
    return CGRectEqualToRect(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : CGRectStandardize typedef CGRect = Declared(CGRect)(typedef CGRect = Declared(CGRect))
 */
private val CGRectStandardize_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout)
private val CGRectStandardize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectStandardize").orElseThrow() }
private val CGRectStandardize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectStandardize_ADDR, CGRectStandardize_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectStandardize(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGRectStandardize_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectStandardize(allocator: SegmentAllocator, arg0: CGRect): CGRect {
    return CGRect(CGRectStandardize(allocator, arg0.segment))
}

/**
 * {@snippet lang=c : CGRectIsEmpty Bool(typedef CGRect = Declared(CGRect))
 */
private val CGRectIsEmpty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout)
private val CGRectIsEmpty_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectIsEmpty").orElseThrow() }
private val CGRectIsEmpty_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectIsEmpty_ADDR, CGRectIsEmpty_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIsEmpty(arg0: MemorySegment): Boolean {
    try {
        return CGRectIsEmpty_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIsEmpty(arg0: CGRect): Boolean {
    return CGRectIsEmpty(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectIsNull Bool(typedef CGRect = Declared(CGRect))
 */
private val CGRectIsNull_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout)
private val CGRectIsNull_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectIsNull").orElseThrow() }
private val CGRectIsNull_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectIsNull_ADDR, CGRectIsNull_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIsNull(arg0: MemorySegment): Boolean {
    try {
        return CGRectIsNull_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIsNull(arg0: CGRect): Boolean {
    return CGRectIsNull(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectIsInfinite Bool(typedef CGRect = Declared(CGRect))
 */
private val CGRectIsInfinite_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout)
private val CGRectIsInfinite_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectIsInfinite").orElseThrow() }
private val CGRectIsInfinite_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectIsInfinite_ADDR, CGRectIsInfinite_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGRectIsInfinite(arg0: MemorySegment): Boolean {
    try {
        return CGRectIsInfinite_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGRectIsInfinite(arg0: CGRect): Boolean {
    return CGRectIsInfinite(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectInset typedef CGRect = Declared(CGRect)(typedef CGRect = Declared(CGRect),typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGRectInset_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGRectInset_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectInset").orElseThrow() }
private val CGRectInset_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectInset_ADDR, CGRectInset_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectInset(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double): MemorySegment {
    try {
        return CGRectInset_HANDLE.invokeExact(allocator, arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectInset(allocator: SegmentAllocator, arg0: CGRect, arg1: Double, arg2: Double): CGRect {
    return CGRect(CGRectInset(allocator, arg0.segment, arg1, arg2))
}

/**
 * {@snippet lang=c : CGRectIntegral typedef CGRect = Declared(CGRect)(typedef CGRect = Declared(CGRect))
 */
private val CGRectIntegral_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout)
private val CGRectIntegral_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectIntegral").orElseThrow() }
private val CGRectIntegral_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectIntegral_ADDR, CGRectIntegral_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIntegral(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGRectIntegral_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIntegral(allocator: SegmentAllocator, arg0: CGRect): CGRect {
    return CGRect(CGRectIntegral(allocator, arg0.segment))
}

/**
 * {@snippet lang=c : CGRectUnion typedef CGRect = Declared(CGRect)(typedef CGRect = Declared(CGRect),typedef CGRect = Declared(CGRect))
 */
private val CGRectUnion_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, CGRect.layout)
private val CGRectUnion_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectUnion").orElseThrow() }
private val CGRectUnion_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectUnion_ADDR, CGRectUnion_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectUnion(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGRectUnion_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectUnion(allocator: SegmentAllocator, arg0: CGRect, arg1: CGRect): CGRect {
    return CGRect(CGRectUnion(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : CGRectIntersection typedef CGRect = Declared(CGRect)(typedef CGRect = Declared(CGRect),typedef CGRect = Declared(CGRect))
 */
private val CGRectIntersection_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, CGRect.layout)
private val CGRectIntersection_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectIntersection").orElseThrow() }
private val CGRectIntersection_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectIntersection_ADDR, CGRectIntersection_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIntersection(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGRectIntersection_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIntersection(allocator: SegmentAllocator, arg0: CGRect, arg1: CGRect): CGRect {
    return CGRect(CGRectIntersection(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : CGRectOffset typedef CGRect = Declared(CGRect)(typedef CGRect = Declared(CGRect),typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGRectOffset_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGRectOffset_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectOffset").orElseThrow() }
private val CGRectOffset_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectOffset_ADDR, CGRectOffset_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectOffset(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double): MemorySegment {
    try {
        return CGRectOffset_HANDLE.invokeExact(allocator, arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectOffset(allocator: SegmentAllocator, arg0: CGRect, arg1: Double, arg2: Double): CGRect {
    return CGRect(CGRectOffset(allocator, arg0.segment, arg1, arg2))
}

/**
 * {@snippet lang=c : CGRectDivide Void(typedef CGRect = Declared(CGRect),(typedef CGRect = Declared(CGRect))*,(typedef CGRect = Declared(CGRect))*,typedef CGFloat = Double,typedef CGRectEdge = Declared(CGRectEdge))
 */
private val CGRectDivide_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
private val CGRectDivide_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectDivide").orElseThrow() }
private val CGRectDivide_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectDivide_ADDR, CGRectDivide_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectDivide(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Double, arg4: CGRectEdge): Unit {
    try {
        CGRectDivide_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectDivide(arg0: CGRect, arg1: MemorySegment, arg2: MemorySegment, arg3: Double, arg4: CGRectEdge): Unit {
    CGRectDivide(arg0.segment, arg1, arg2, arg3, arg4)
}

/**
 * {@snippet lang=c : CGRectContainsPoint Bool(typedef CGRect = Declared(CGRect),typedef CGPoint = Declared(CGPoint))
 */
private val CGRectContainsPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout, CGPoint.layout)
private val CGRectContainsPoint_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectContainsPoint").orElseThrow() }
private val CGRectContainsPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectContainsPoint_ADDR, CGRectContainsPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectContainsPoint(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGRectContainsPoint_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectContainsPoint(arg0: CGRect, arg1: CGPoint): Boolean {
    return CGRectContainsPoint(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : CGRectContainsRect Bool(typedef CGRect = Declared(CGRect),typedef CGRect = Declared(CGRect))
 */
private val CGRectContainsRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout, CGRect.layout)
private val CGRectContainsRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectContainsRect").orElseThrow() }
private val CGRectContainsRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectContainsRect_ADDR, CGRectContainsRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectContainsRect(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGRectContainsRect_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectContainsRect(arg0: CGRect, arg1: CGRect): Boolean {
    return CGRectContainsRect(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : CGRectIntersectsRect Bool(typedef CGRect = Declared(CGRect),typedef CGRect = Declared(CGRect))
 */
private val CGRectIntersectsRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout, CGRect.layout)
private val CGRectIntersectsRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectIntersectsRect").orElseThrow() }
private val CGRectIntersectsRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectIntersectsRect_ADDR, CGRectIntersectsRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIntersectsRect(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGRectIntersectsRect_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGRectIntersectsRect(arg0: CGRect, arg1: CGRect): Boolean {
    return CGRectIntersectsRect(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : CGPointCreateDictionaryRepresentation typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CGPoint = Declared(CGPoint))
 */
private val CGPointCreateDictionaryRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGPoint.layout)
private val CGPointCreateDictionaryRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGPointCreateDictionaryRepresentation").orElseThrow() }
private val CGPointCreateDictionaryRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPointCreateDictionaryRepresentation_ADDR, CGPointCreateDictionaryRepresentation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGPointCreateDictionaryRepresentation(arg0: MemorySegment): MemorySegment {
    try {
        return CGPointCreateDictionaryRepresentation_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGPointCreateDictionaryRepresentation(arg0: CGPoint): MemorySegment {
    return CGPointCreateDictionaryRepresentation(arg0.segment)
}

/**
 * {@snippet lang=c : CGPointMakeWithDictionaryRepresentation Bool(typedef CFDictionaryRef = (Declared(__CFDictionary))*,(typedef CGPoint = Declared(CGPoint))*)
 */
private val CGPointMakeWithDictionaryRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPointMakeWithDictionaryRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGPointMakeWithDictionaryRepresentation").orElseThrow() }
private val CGPointMakeWithDictionaryRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPointMakeWithDictionaryRepresentation_ADDR, CGPointMakeWithDictionaryRepresentation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGPointMakeWithDictionaryRepresentation(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPointMakeWithDictionaryRepresentation_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGSizeCreateDictionaryRepresentation typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CGSize = Declared(CGSize))
 */
private val CGSizeCreateDictionaryRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGSize.layout)
private val CGSizeCreateDictionaryRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGSizeCreateDictionaryRepresentation").orElseThrow() }
private val CGSizeCreateDictionaryRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGSizeCreateDictionaryRepresentation_ADDR, CGSizeCreateDictionaryRepresentation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGSizeCreateDictionaryRepresentation(arg0: MemorySegment): MemorySegment {
    try {
        return CGSizeCreateDictionaryRepresentation_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGSizeCreateDictionaryRepresentation(arg0: CGSize): MemorySegment {
    return CGSizeCreateDictionaryRepresentation(arg0.segment)
}

/**
 * {@snippet lang=c : CGSizeMakeWithDictionaryRepresentation Bool(typedef CFDictionaryRef = (Declared(__CFDictionary))*,(typedef CGSize = Declared(CGSize))*)
 */
private val CGSizeMakeWithDictionaryRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGSizeMakeWithDictionaryRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGSizeMakeWithDictionaryRepresentation").orElseThrow() }
private val CGSizeMakeWithDictionaryRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGSizeMakeWithDictionaryRepresentation_ADDR, CGSizeMakeWithDictionaryRepresentation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGSizeMakeWithDictionaryRepresentation(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGSizeMakeWithDictionaryRepresentation_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRectCreateDictionaryRepresentation typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CGRect = Declared(CGRect))
 */
private val CGRectCreateDictionaryRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout)
private val CGRectCreateDictionaryRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectCreateDictionaryRepresentation").orElseThrow() }
private val CGRectCreateDictionaryRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectCreateDictionaryRepresentation_ADDR, CGRectCreateDictionaryRepresentation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGRectCreateDictionaryRepresentation(arg0: MemorySegment): MemorySegment {
    try {
        return CGRectCreateDictionaryRepresentation_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGRectCreateDictionaryRepresentation(arg0: CGRect): MemorySegment {
    return CGRectCreateDictionaryRepresentation(arg0.segment)
}

/**
 * {@snippet lang=c : CGRectMakeWithDictionaryRepresentation Bool(typedef CFDictionaryRef = (Declared(__CFDictionary))*,(typedef CGRect = Declared(CGRect))*)
 */
private val CGRectMakeWithDictionaryRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGRectMakeWithDictionaryRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CGRectMakeWithDictionaryRepresentation").orElseThrow() }
private val CGRectMakeWithDictionaryRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectMakeWithDictionaryRepresentation_ADDR, CGRectMakeWithDictionaryRepresentation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGRectMakeWithDictionaryRepresentation(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGRectMakeWithDictionaryRepresentation_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSZeroPoint typedef const NSPoint = Declared(CGPoint)
 */
val NSZeroPoint: MemorySegment = SymbolLookup.loaderLookup().find("NSZeroPoint").orElseThrow()

/**
 * {@snippet lang=c : NSZeroSize typedef const NSSize = Declared(CGSize)
 */
val NSZeroSize: MemorySegment = SymbolLookup.loaderLookup().find("NSZeroSize").orElseThrow()

/**
 * {@snippet lang=c : NSZeroRect typedef const NSRect = Declared(CGRect)
 */
val NSZeroRect: MemorySegment = SymbolLookup.loaderLookup().find("NSZeroRect").orElseThrow()

/**
 * {@snippet lang=c : NSEdgeInsetsZero typedef const NSEdgeInsets = Declared(NSEdgeInsets)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
val NSEdgeInsetsZero: MemorySegment = SymbolLookup.loaderLookup().find("NSEdgeInsetsZero").orElseThrow()

/**
 * {@snippet lang=c : NSEqualPoints typedef BOOL = Bool(typedef NSPoint = Declared(CGPoint),typedef NSPoint = Declared(CGPoint))
 */
private val NSEqualPoints_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGPoint.layout, CGPoint.layout)
private val NSEqualPoints_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEqualPoints").orElseThrow() }
private val NSEqualPoints_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEqualPoints_ADDR, NSEqualPoints_DESC) }

fun NSEqualPoints(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSEqualPoints_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSEqualPoints(arg0: NSPoint, arg1: NSPoint): Boolean {
    return NSEqualPoints(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSEqualSizes typedef BOOL = Bool(typedef NSSize = Declared(CGSize),typedef NSSize = Declared(CGSize))
 */
private val NSEqualSizes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGSize.layout, CGSize.layout)
private val NSEqualSizes_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEqualSizes").orElseThrow() }
private val NSEqualSizes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEqualSizes_ADDR, NSEqualSizes_DESC) }

fun NSEqualSizes(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSEqualSizes_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSEqualSizes(arg0: NSSize, arg1: NSSize): Boolean {
    return NSEqualSizes(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSEqualRects typedef BOOL = Bool(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSEqualRects_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout, CGRect.layout)
private val NSEqualRects_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEqualRects").orElseThrow() }
private val NSEqualRects_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEqualRects_ADDR, NSEqualRects_DESC) }

fun NSEqualRects(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSEqualRects_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSEqualRects(arg0: NSRect, arg1: NSRect): Boolean {
    return NSEqualRects(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSIsEmptyRect typedef BOOL = Bool(typedef NSRect = Declared(CGRect))
 */
private val NSIsEmptyRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout)
private val NSIsEmptyRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIsEmptyRect").orElseThrow() }
private val NSIsEmptyRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSIsEmptyRect_ADDR, NSIsEmptyRect_DESC) }

fun NSIsEmptyRect(arg0: MemorySegment): Boolean {
    try {
        return NSIsEmptyRect_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSIsEmptyRect(arg0: NSRect): Boolean {
    return NSIsEmptyRect(arg0.segment)
}

/**
 * {@snippet lang=c : NSEdgeInsetsEqual typedef BOOL = Bool(typedef NSEdgeInsets = Declared(NSEdgeInsets),typedef NSEdgeInsets = Declared(NSEdgeInsets))
 */
private val NSEdgeInsetsEqual_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, NSEdgeInsets.layout, NSEdgeInsets.layout)
private val NSEdgeInsetsEqual_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEdgeInsetsEqual").orElseThrow() }
private val NSEdgeInsetsEqual_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEdgeInsetsEqual_ADDR, NSEdgeInsetsEqual_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSEdgeInsetsEqual(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSEdgeInsetsEqual_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSEdgeInsetsEqual(arg0: NSEdgeInsets, arg1: NSEdgeInsets): Boolean {
    return NSEdgeInsetsEqual(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSInsetRect typedef NSRect = Declared(CGRect)(typedef NSRect = Declared(CGRect),typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val NSInsetRect_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val NSInsetRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInsetRect").orElseThrow() }
private val NSInsetRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSInsetRect_ADDR, NSInsetRect_DESC) }

fun NSInsetRect(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double): MemorySegment {
    try {
        return NSInsetRect_HANDLE.invokeExact(allocator, arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSInsetRect(allocator: SegmentAllocator, arg0: NSRect, arg1: Double, arg2: Double): NSRect {
    return NSRect(NSInsetRect(allocator, arg0.segment, arg1, arg2))
}

/**
 * {@snippet lang=c : NSIntegralRect typedef NSRect = Declared(CGRect)(typedef NSRect = Declared(CGRect))
 */
private val NSIntegralRect_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout)
private val NSIntegralRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIntegralRect").orElseThrow() }
private val NSIntegralRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSIntegralRect_ADDR, NSIntegralRect_DESC) }

fun NSIntegralRect(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return NSIntegralRect_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSIntegralRect(allocator: SegmentAllocator, arg0: NSRect): NSRect {
    return NSRect(NSIntegralRect(allocator, arg0.segment))
}

/**
 * {@snippet lang=c : NSIntegralRectWithOptions typedef NSRect = Declared(CGRect)(typedef NSRect = Declared(CGRect),typedef NSAlignmentOptions = Declared(NSAlignmentOptions))
 */
private val NSIntegralRectWithOptions_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, ValueLayout.JAVA_LONG)
private val NSIntegralRectWithOptions_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIntegralRectWithOptions").orElseThrow() }
private val NSIntegralRectWithOptions_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSIntegralRectWithOptions_ADDR, NSIntegralRectWithOptions_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSIntegralRectWithOptions(allocator: SegmentAllocator, arg0: MemorySegment, arg1: NSAlignmentOptions): MemorySegment {
    try {
        return NSIntegralRectWithOptions_HANDLE.invokeExact(allocator, arg0, arg1.rawValue) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSIntegralRectWithOptions(allocator: SegmentAllocator, arg0: NSRect, arg1: NSAlignmentOptions): NSRect {
    return NSRect(NSIntegralRectWithOptions(allocator, arg0.segment, arg1))
}

/**
 * {@snippet lang=c : NSUnionRect typedef NSRect = Declared(CGRect)(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSUnionRect_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, CGRect.layout)
private val NSUnionRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUnionRect").orElseThrow() }
private val NSUnionRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSUnionRect_ADDR, NSUnionRect_DESC) }

fun NSUnionRect(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSUnionRect_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSUnionRect(allocator: SegmentAllocator, arg0: NSRect, arg1: NSRect): NSRect {
    return NSRect(NSUnionRect(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : NSIntersectionRect typedef NSRect = Declared(CGRect)(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSIntersectionRect_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, CGRect.layout)
private val NSIntersectionRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIntersectionRect").orElseThrow() }
private val NSIntersectionRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSIntersectionRect_ADDR, NSIntersectionRect_DESC) }

fun NSIntersectionRect(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSIntersectionRect_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSIntersectionRect(allocator: SegmentAllocator, arg0: NSRect, arg1: NSRect): NSRect {
    return NSRect(NSIntersectionRect(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : NSOffsetRect typedef NSRect = Declared(CGRect)(typedef NSRect = Declared(CGRect),typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val NSOffsetRect_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val NSOffsetRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOffsetRect").orElseThrow() }
private val NSOffsetRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSOffsetRect_ADDR, NSOffsetRect_DESC) }

fun NSOffsetRect(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double): MemorySegment {
    try {
        return NSOffsetRect_HANDLE.invokeExact(allocator, arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSOffsetRect(allocator: SegmentAllocator, arg0: NSRect, arg1: Double, arg2: Double): NSRect {
    return NSRect(NSOffsetRect(allocator, arg0.segment, arg1, arg2))
}

/**
 * {@snippet lang=c : NSDivideRect Void(typedef NSRect = Declared(CGRect),(typedef NSRect = Declared(CGRect))*,(typedef NSRect = Declared(CGRect))*,typedef CGFloat = Double,typedef NSRectEdge = Declared(NSRectEdge))
 */
private val NSDivideRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG)
private val NSDivideRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDivideRect").orElseThrow() }
private val NSDivideRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDivideRect_ADDR, NSDivideRect_DESC) }

fun NSDivideRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Double, arg4: NSRectEdge): Unit {
    try {
        NSDivideRect_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4.rawValue)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSDivideRect(arg0: NSRect, arg1: MemorySegment, arg2: MemorySegment, arg3: Double, arg4: NSRectEdge): Unit {
    NSDivideRect(arg0.segment, arg1, arg2, arg3, arg4)
}

/**
 * {@snippet lang=c : NSPointInRect typedef BOOL = Bool(typedef NSPoint = Declared(CGPoint),typedef NSRect = Declared(CGRect))
 */
private val NSPointInRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGPoint.layout, CGRect.layout)
private val NSPointInRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPointInRect").orElseThrow() }
private val NSPointInRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSPointInRect_ADDR, NSPointInRect_DESC) }

fun NSPointInRect(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSPointInRect_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSPointInRect(arg0: NSPoint, arg1: NSRect): Boolean {
    return NSPointInRect(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSMouseInRect typedef BOOL = Bool(typedef NSPoint = Declared(CGPoint),typedef NSRect = Declared(CGRect),typedef BOOL = Bool)
 */
private val NSMouseInRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGPoint.layout, CGRect.layout, ValueLayout.JAVA_BOOLEAN)
private val NSMouseInRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMouseInRect").orElseThrow() }
private val NSMouseInRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSMouseInRect_ADDR, NSMouseInRect_DESC) }

fun NSMouseInRect(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean): Boolean {
    try {
        return NSMouseInRect_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSMouseInRect(arg0: NSPoint, arg1: NSRect, arg2: Boolean): Boolean {
    return NSMouseInRect(arg0.segment, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : NSContainsRect typedef BOOL = Bool(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSContainsRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout, CGRect.layout)
private val NSContainsRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContainsRect").orElseThrow() }
private val NSContainsRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSContainsRect_ADDR, NSContainsRect_DESC) }

fun NSContainsRect(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSContainsRect_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSContainsRect(arg0: NSRect, arg1: NSRect): Boolean {
    return NSContainsRect(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSIntersectsRect typedef BOOL = Bool(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSIntersectsRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGRect.layout, CGRect.layout)
private val NSIntersectsRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIntersectsRect").orElseThrow() }
private val NSIntersectsRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSIntersectsRect_ADDR, NSIntersectsRect_DESC) }

fun NSIntersectsRect(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSIntersectsRect_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSIntersectsRect(arg0: NSRect, arg1: NSRect): Boolean {
    return NSIntersectsRect(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSStringFromPoint typedef NSString = (Void)*(typedef NSPoint = Declared(CGPoint))
 */
private val NSStringFromPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGPoint.layout)
private val NSStringFromPoint_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromPoint").orElseThrow() }
private val NSStringFromPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromPoint_ADDR, NSStringFromPoint_DESC) }

fun NSStringFromPoint(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromPoint_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSStringFromPoint(arg0: NSPoint): MemorySegment {
    return NSStringFromPoint(arg0.segment)
}

/**
 * {@snippet lang=c : NSStringFromSize typedef NSString = (Void)*(typedef NSSize = Declared(CGSize))
 */
private val NSStringFromSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGSize.layout)
private val NSStringFromSize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromSize").orElseThrow() }
private val NSStringFromSize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromSize_ADDR, NSStringFromSize_DESC) }

fun NSStringFromSize(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromSize_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSStringFromSize(arg0: NSSize): MemorySegment {
    return NSStringFromSize(arg0.segment)
}

/**
 * {@snippet lang=c : NSStringFromRect typedef NSString = (Void)*(typedef NSRect = Declared(CGRect))
 */
private val NSStringFromRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout)
private val NSStringFromRect_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromRect").orElseThrow() }
private val NSStringFromRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromRect_ADDR, NSStringFromRect_DESC) }

fun NSStringFromRect(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromRect_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSStringFromRect(arg0: NSRect): MemorySegment {
    return NSStringFromRect(arg0.segment)
}

/**
 * {@snippet lang=c : NSPointFromString typedef NSPoint = Declared(CGPoint)(typedef NSString = (Void)*)
 */
private val NSPointFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS)
private val NSPointFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPointFromString").orElseThrow() }
private val NSPointFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSPointFromString_ADDR, NSPointFromString_DESC) }

fun NSPointFromString(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return NSPointFromString_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSPointFromStringTyped(allocator: SegmentAllocator, arg0: MemorySegment): NSPoint {
    return NSPoint(NSPointFromString(allocator, arg0))
}

/**
 * {@snippet lang=c : NSSizeFromString typedef NSSize = Declared(CGSize)(typedef NSString = (Void)*)
 */
private val NSSizeFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(CGSize.layout, ValueLayout.ADDRESS)
private val NSSizeFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSizeFromString").orElseThrow() }
private val NSSizeFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSSizeFromString_ADDR, NSSizeFromString_DESC) }

fun NSSizeFromString(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return NSSizeFromString_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSSizeFromStringTyped(allocator: SegmentAllocator, arg0: MemorySegment): NSSize {
    return NSSize(NSSizeFromString(allocator, arg0))
}

/**
 * {@snippet lang=c : NSRectFromString typedef NSRect = Declared(CGRect)(typedef NSString = (Void)*)
 */
private val NSRectFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val NSRectFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRectFromString").orElseThrow() }
private val NSRectFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectFromString_ADDR, NSRectFromString_DESC) }

fun NSRectFromString(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return NSRectFromString_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSRectFromStringTyped(allocator: SegmentAllocator, arg0: MemorySegment): NSRect {
    return NSRect(NSRectFromString(allocator, arg0))
}

/**
 * {@snippet lang=c : NSInvalidArchiveOperationException typedef const NSExceptionName = (Void)*
 */
private val NSInvalidArchiveOperationException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInvalidArchiveOperationException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInvalidArchiveOperationException").orElseThrow().reinterpret(NSInvalidArchiveOperationException_LAYOUT.byteSize()) }
private val NSInvalidArchiveOperationException_VH: VarHandle by lazy { NSInvalidArchiveOperationException_LAYOUT.varHandle() }

var NSInvalidArchiveOperationException: MemorySegment
    get() = NSInvalidArchiveOperationException_VH.get(NSInvalidArchiveOperationException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInvalidArchiveOperationException_VH.set(NSInvalidArchiveOperationException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInvalidUnarchiveOperationException typedef const NSExceptionName = (Void)*
 */
private val NSInvalidUnarchiveOperationException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInvalidUnarchiveOperationException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInvalidUnarchiveOperationException").orElseThrow().reinterpret(NSInvalidUnarchiveOperationException_LAYOUT.byteSize()) }
private val NSInvalidUnarchiveOperationException_VH: VarHandle by lazy { NSInvalidUnarchiveOperationException_LAYOUT.varHandle() }

var NSInvalidUnarchiveOperationException: MemorySegment
    get() = NSInvalidUnarchiveOperationException_VH.get(NSInvalidUnarchiveOperationException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInvalidUnarchiveOperationException_VH.set(NSInvalidUnarchiveOperationException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKeyedArchiveRootObjectKey (Void)*
 */
private val NSKeyedArchiveRootObjectKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKeyedArchiveRootObjectKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSKeyedArchiveRootObjectKey").orElseThrow().reinterpret(NSKeyedArchiveRootObjectKey_LAYOUT.byteSize()) }
private val NSKeyedArchiveRootObjectKey_VH: VarHandle by lazy { NSKeyedArchiveRootObjectKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSKeyedArchiveRootObjectKey: MemorySegment
    get() = NSKeyedArchiveRootObjectKey_VH.get(NSKeyedArchiveRootObjectKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSKeyedArchiveRootObjectKey_VH.set(NSKeyedArchiveRootObjectKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFreeMapTable Void(typedef NSMapTable = (Void)*)
 */
private val NSFreeMapTable_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSFreeMapTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFreeMapTable").orElseThrow() }
private val NSFreeMapTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSFreeMapTable_ADDR, NSFreeMapTable_DESC) }

fun NSFreeMapTable(arg0: MemorySegment): Unit {
    try {
        NSFreeMapTable_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSResetMapTable Void(typedef NSMapTable = (Void)*)
 */
private val NSResetMapTable_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSResetMapTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSResetMapTable").orElseThrow() }
private val NSResetMapTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSResetMapTable_ADDR, NSResetMapTable_DESC) }

fun NSResetMapTable(arg0: MemorySegment): Unit {
    try {
        NSResetMapTable_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCompareMapTables typedef BOOL = Bool(typedef NSMapTable = (Void)*,typedef NSMapTable = (Void)*)
 */
private val NSCompareMapTables_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSCompareMapTables_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCompareMapTables").orElseThrow() }
private val NSCompareMapTables_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCompareMapTables_ADDR, NSCompareMapTables_DESC) }

fun NSCompareMapTables(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSCompareMapTables_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCopyMapTableWithZone typedef NSMapTable = (Void)*(typedef NSMapTable = (Void)*,(typedef NSZone = Declared(_NSZone))*)
 */
private val NSCopyMapTableWithZone_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSCopyMapTableWithZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCopyMapTableWithZone").orElseThrow() }
private val NSCopyMapTableWithZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCopyMapTableWithZone_ADDR, NSCopyMapTableWithZone_DESC) }

fun NSCopyMapTableWithZone(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSCopyMapTableWithZone_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSMapMember typedef BOOL = Bool(typedef NSMapTable = (Void)*,(Void)*,((Void)*)*,((Void)*)*)
 */
private val NSMapMember_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSMapMember_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMapMember").orElseThrow() }
private val NSMapMember_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSMapMember_ADDR, NSMapMember_DESC) }

fun NSMapMember(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Boolean {
    try {
        return NSMapMember_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSMapGet (Void)*(typedef NSMapTable = (Void)*,(Void)*)
 */
private val NSMapGet_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSMapGet_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMapGet").orElseThrow() }
private val NSMapGet_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSMapGet_ADDR, NSMapGet_DESC) }

fun NSMapGet(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSMapGet_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSMapInsert Void(typedef NSMapTable = (Void)*,(Void)*,(Void)*)
 */
private val NSMapInsert_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSMapInsert_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMapInsert").orElseThrow() }
private val NSMapInsert_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSMapInsert_ADDR, NSMapInsert_DESC) }

fun NSMapInsert(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        NSMapInsert_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSMapInsertKnownAbsent Void(typedef NSMapTable = (Void)*,(Void)*,(Void)*)
 */
private val NSMapInsertKnownAbsent_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSMapInsertKnownAbsent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMapInsertKnownAbsent").orElseThrow() }
private val NSMapInsertKnownAbsent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSMapInsertKnownAbsent_ADDR, NSMapInsertKnownAbsent_DESC) }

fun NSMapInsertKnownAbsent(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        NSMapInsertKnownAbsent_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSMapInsertIfAbsent (Void)*(typedef NSMapTable = (Void)*,(Void)*,(Void)*)
 */
private val NSMapInsertIfAbsent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSMapInsertIfAbsent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMapInsertIfAbsent").orElseThrow() }
private val NSMapInsertIfAbsent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSMapInsertIfAbsent_ADDR, NSMapInsertIfAbsent_DESC) }

fun NSMapInsertIfAbsent(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return NSMapInsertIfAbsent_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSMapRemove Void(typedef NSMapTable = (Void)*,(Void)*)
 */
private val NSMapRemove_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSMapRemove_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMapRemove").orElseThrow() }
private val NSMapRemove_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSMapRemove_ADDR, NSMapRemove_DESC) }

fun NSMapRemove(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSMapRemove_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSEnumerateMapTable typedef NSMapEnumerator = Declared(NSMapEnumerator)(typedef NSMapTable = (Void)*)
 */
private val NSEnumerateMapTable_DESC: FunctionDescriptor = FunctionDescriptor.of(NSMapEnumerator.layout, ValueLayout.ADDRESS)
private val NSEnumerateMapTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEnumerateMapTable").orElseThrow() }
private val NSEnumerateMapTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEnumerateMapTable_ADDR, NSEnumerateMapTable_DESC) }

fun NSEnumerateMapTable(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return NSEnumerateMapTable_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSNextMapEnumeratorPair typedef BOOL = Bool((typedef NSMapEnumerator = Declared(NSMapEnumerator))*,((Void)*)*,((Void)*)*)
 */
private val NSNextMapEnumeratorPair_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSNextMapEnumeratorPair_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNextMapEnumeratorPair").orElseThrow() }
private val NSNextMapEnumeratorPair_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSNextMapEnumeratorPair_ADDR, NSNextMapEnumeratorPair_DESC) }

fun NSNextMapEnumeratorPair(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return NSNextMapEnumeratorPair_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSEndMapTableEnumeration Void((typedef NSMapEnumerator = Declared(NSMapEnumerator))*)
 */
private val NSEndMapTableEnumeration_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSEndMapTableEnumeration_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEndMapTableEnumeration").orElseThrow() }
private val NSEndMapTableEnumeration_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEndMapTableEnumeration_ADDR, NSEndMapTableEnumeration_DESC) }

fun NSEndMapTableEnumeration(arg0: MemorySegment): Unit {
    try {
        NSEndMapTableEnumeration_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCountMapTable typedef NSUInteger = UNSIGNED = Long(typedef NSMapTable = (Void)*)
 */
private val NSCountMapTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSCountMapTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCountMapTable").orElseThrow() }
private val NSCountMapTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCountMapTable_ADDR, NSCountMapTable_DESC) }

fun NSCountMapTable(arg0: MemorySegment): Long {
    try {
        return NSCountMapTable_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSStringFromMapTable typedef NSString = (Void)*(typedef NSMapTable = (Void)*)
 */
private val NSStringFromMapTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSStringFromMapTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromMapTable").orElseThrow() }
private val NSStringFromMapTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromMapTable_ADDR, NSStringFromMapTable_DESC) }

fun NSStringFromMapTable(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromMapTable_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAllMapTableKeys typedef NSArray = (Void)*(typedef NSMapTable = (Void)*)
 */
private val NSAllMapTableKeys_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAllMapTableKeys_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllMapTableKeys").orElseThrow() }
private val NSAllMapTableKeys_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSAllMapTableKeys_ADDR, NSAllMapTableKeys_DESC) }

fun NSAllMapTableKeys(arg0: MemorySegment): MemorySegment {
    try {
        return NSAllMapTableKeys_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAllMapTableValues typedef NSArray = (Void)*(typedef NSMapTable = (Void)*)
 */
private val NSAllMapTableValues_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAllMapTableValues_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllMapTableValues").orElseThrow() }
private val NSAllMapTableValues_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSAllMapTableValues_ADDR, NSAllMapTableValues_DESC) }

fun NSAllMapTableValues(arg0: MemorySegment): MemorySegment {
    try {
        return NSAllMapTableValues_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCreateMapTableWithZone typedef NSMapTable = (Void)*(typedef NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks),typedef NSMapTableValueCallBacks = Declared(NSMapTableValueCallBacks),typedef NSUInteger = UNSIGNED = Long,(typedef NSZone = Declared(_NSZone))*)
 */
private val NSCreateMapTableWithZone_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, NSMapTableKeyCallBacks.layout, NSMapTableValueCallBacks.layout, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSCreateMapTableWithZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCreateMapTableWithZone").orElseThrow() }
private val NSCreateMapTableWithZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCreateMapTableWithZone_ADDR, NSCreateMapTableWithZone_DESC) }

fun NSCreateMapTableWithZone(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): MemorySegment {
    try {
        return NSCreateMapTableWithZone_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCreateMapTable typedef NSMapTable = (Void)*(typedef NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks),typedef NSMapTableValueCallBacks = Declared(NSMapTableValueCallBacks),typedef NSUInteger = UNSIGNED = Long)
 */
private val NSCreateMapTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, NSMapTableKeyCallBacks.layout, NSMapTableValueCallBacks.layout, ValueLayout.JAVA_LONG)
private val NSCreateMapTable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCreateMapTable").orElseThrow() }
private val NSCreateMapTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCreateMapTable_ADDR, NSCreateMapTable_DESC) }

fun NSCreateMapTable(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return NSCreateMapTable_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSIntegerMapKeyCallBacks typedef const NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks)
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
val NSIntegerMapKeyCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSIntegerMapKeyCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSNonOwnedPointerMapKeyCallBacks typedef const NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks)
 */
val NSNonOwnedPointerMapKeyCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSNonOwnedPointerMapKeyCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSNonOwnedPointerOrNullMapKeyCallBacks typedef const NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks)
 */
val NSNonOwnedPointerOrNullMapKeyCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSNonOwnedPointerOrNullMapKeyCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSNonRetainedObjectMapKeyCallBacks typedef const NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks)
 */
val NSNonRetainedObjectMapKeyCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSNonRetainedObjectMapKeyCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSObjectMapKeyCallBacks typedef const NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks)
 */
val NSObjectMapKeyCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSObjectMapKeyCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSOwnedPointerMapKeyCallBacks typedef const NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks)
 */
val NSOwnedPointerMapKeyCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSOwnedPointerMapKeyCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSIntMapKeyCallBacks typedef const NSMapTableKeyCallBacks = Declared(NSMapTableKeyCallBacks)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
val NSIntMapKeyCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSIntMapKeyCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSIntegerMapValueCallBacks typedef const NSMapTableValueCallBacks = Declared(NSMapTableValueCallBacks)
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
val NSIntegerMapValueCallBacks: MemorySegment = SymbolLookup.loaderLookup().find("NSIntegerMapValueCallBacks").orElseThrow()
