@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : NSMetadataItemThemeKey (Void)*
 */
private val NSMetadataItemThemeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemThemeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemThemeKey").orElseThrow().reinterpret(NSMetadataItemThemeKey_LAYOUT.byteSize()) }
private val NSMetadataItemThemeKey_VH: VarHandle by lazy { NSMetadataItemThemeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemThemeKey: MemorySegment
    get() = NSMetadataItemThemeKey_VH.get(NSMetadataItemThemeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemThemeKey_VH.set(NSMetadataItemThemeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemDescriptionKey (Void)*
 */
private val NSMetadataItemDescriptionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemDescriptionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemDescriptionKey").orElseThrow().reinterpret(NSMetadataItemDescriptionKey_LAYOUT.byteSize()) }
private val NSMetadataItemDescriptionKey_VH: VarHandle by lazy { NSMetadataItemDescriptionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemDescriptionKey: MemorySegment
    get() = NSMetadataItemDescriptionKey_VH.get(NSMetadataItemDescriptionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemDescriptionKey_VH.set(NSMetadataItemDescriptionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemIdentifierKey (Void)*
 */
private val NSMetadataItemIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemIdentifierKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemIdentifierKey").orElseThrow().reinterpret(NSMetadataItemIdentifierKey_LAYOUT.byteSize()) }
private val NSMetadataItemIdentifierKey_VH: VarHandle by lazy { NSMetadataItemIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemIdentifierKey: MemorySegment
    get() = NSMetadataItemIdentifierKey_VH.get(NSMetadataItemIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemIdentifierKey_VH.set(NSMetadataItemIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAudiencesKey (Void)*
 */
private val NSMetadataItemAudiencesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAudiencesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAudiencesKey").orElseThrow().reinterpret(NSMetadataItemAudiencesKey_LAYOUT.byteSize()) }
private val NSMetadataItemAudiencesKey_VH: VarHandle by lazy { NSMetadataItemAudiencesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAudiencesKey: MemorySegment
    get() = NSMetadataItemAudiencesKey_VH.get(NSMetadataItemAudiencesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAudiencesKey_VH.set(NSMetadataItemAudiencesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemNumberOfPagesKey (Void)*
 */
private val NSMetadataItemNumberOfPagesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemNumberOfPagesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemNumberOfPagesKey").orElseThrow().reinterpret(NSMetadataItemNumberOfPagesKey_LAYOUT.byteSize()) }
private val NSMetadataItemNumberOfPagesKey_VH: VarHandle by lazy { NSMetadataItemNumberOfPagesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemNumberOfPagesKey: MemorySegment
    get() = NSMetadataItemNumberOfPagesKey_VH.get(NSMetadataItemNumberOfPagesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemNumberOfPagesKey_VH.set(NSMetadataItemNumberOfPagesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPageWidthKey (Void)*
 */
private val NSMetadataItemPageWidthKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPageWidthKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPageWidthKey").orElseThrow().reinterpret(NSMetadataItemPageWidthKey_LAYOUT.byteSize()) }
private val NSMetadataItemPageWidthKey_VH: VarHandle by lazy { NSMetadataItemPageWidthKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemPageWidthKey: MemorySegment
    get() = NSMetadataItemPageWidthKey_VH.get(NSMetadataItemPageWidthKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPageWidthKey_VH.set(NSMetadataItemPageWidthKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPageHeightKey (Void)*
 */
private val NSMetadataItemPageHeightKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPageHeightKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPageHeightKey").orElseThrow().reinterpret(NSMetadataItemPageHeightKey_LAYOUT.byteSize()) }
private val NSMetadataItemPageHeightKey_VH: VarHandle by lazy { NSMetadataItemPageHeightKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemPageHeightKey: MemorySegment
    get() = NSMetadataItemPageHeightKey_VH.get(NSMetadataItemPageHeightKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPageHeightKey_VH.set(NSMetadataItemPageHeightKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemSecurityMethodKey (Void)*
 */
private val NSMetadataItemSecurityMethodKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemSecurityMethodKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemSecurityMethodKey").orElseThrow().reinterpret(NSMetadataItemSecurityMethodKey_LAYOUT.byteSize()) }
private val NSMetadataItemSecurityMethodKey_VH: VarHandle by lazy { NSMetadataItemSecurityMethodKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemSecurityMethodKey: MemorySegment
    get() = NSMetadataItemSecurityMethodKey_VH.get(NSMetadataItemSecurityMethodKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemSecurityMethodKey_VH.set(NSMetadataItemSecurityMethodKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCreatorKey (Void)*
 */
private val NSMetadataItemCreatorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCreatorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCreatorKey").orElseThrow().reinterpret(NSMetadataItemCreatorKey_LAYOUT.byteSize()) }
private val NSMetadataItemCreatorKey_VH: VarHandle by lazy { NSMetadataItemCreatorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCreatorKey: MemorySegment
    get() = NSMetadataItemCreatorKey_VH.get(NSMetadataItemCreatorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCreatorKey_VH.set(NSMetadataItemCreatorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemEncodingApplicationsKey (Void)*
 */
private val NSMetadataItemEncodingApplicationsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemEncodingApplicationsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemEncodingApplicationsKey").orElseThrow().reinterpret(NSMetadataItemEncodingApplicationsKey_LAYOUT.byteSize()) }
private val NSMetadataItemEncodingApplicationsKey_VH: VarHandle by lazy { NSMetadataItemEncodingApplicationsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemEncodingApplicationsKey: MemorySegment
    get() = NSMetadataItemEncodingApplicationsKey_VH.get(NSMetadataItemEncodingApplicationsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemEncodingApplicationsKey_VH.set(NSMetadataItemEncodingApplicationsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemDueDateKey (Void)*
 */
private val NSMetadataItemDueDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemDueDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemDueDateKey").orElseThrow().reinterpret(NSMetadataItemDueDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemDueDateKey_VH: VarHandle by lazy { NSMetadataItemDueDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemDueDateKey: MemorySegment
    get() = NSMetadataItemDueDateKey_VH.get(NSMetadataItemDueDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemDueDateKey_VH.set(NSMetadataItemDueDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemStarRatingKey (Void)*
 */
private val NSMetadataItemStarRatingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemStarRatingKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemStarRatingKey").orElseThrow().reinterpret(NSMetadataItemStarRatingKey_LAYOUT.byteSize()) }
private val NSMetadataItemStarRatingKey_VH: VarHandle by lazy { NSMetadataItemStarRatingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemStarRatingKey: MemorySegment
    get() = NSMetadataItemStarRatingKey_VH.get(NSMetadataItemStarRatingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemStarRatingKey_VH.set(NSMetadataItemStarRatingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPhoneNumbersKey (Void)*
 */
private val NSMetadataItemPhoneNumbersKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPhoneNumbersKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPhoneNumbersKey").orElseThrow().reinterpret(NSMetadataItemPhoneNumbersKey_LAYOUT.byteSize()) }
private val NSMetadataItemPhoneNumbersKey_VH: VarHandle by lazy { NSMetadataItemPhoneNumbersKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemPhoneNumbersKey: MemorySegment
    get() = NSMetadataItemPhoneNumbersKey_VH.get(NSMetadataItemPhoneNumbersKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPhoneNumbersKey_VH.set(NSMetadataItemPhoneNumbersKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemEmailAddressesKey (Void)*
 */
private val NSMetadataItemEmailAddressesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemEmailAddressesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemEmailAddressesKey").orElseThrow().reinterpret(NSMetadataItemEmailAddressesKey_LAYOUT.byteSize()) }
private val NSMetadataItemEmailAddressesKey_VH: VarHandle by lazy { NSMetadataItemEmailAddressesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemEmailAddressesKey: MemorySegment
    get() = NSMetadataItemEmailAddressesKey_VH.get(NSMetadataItemEmailAddressesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemEmailAddressesKey_VH.set(NSMetadataItemEmailAddressesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemInstantMessageAddressesKey (Void)*
 */
private val NSMetadataItemInstantMessageAddressesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemInstantMessageAddressesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemInstantMessageAddressesKey").orElseThrow().reinterpret(NSMetadataItemInstantMessageAddressesKey_LAYOUT.byteSize()) }
private val NSMetadataItemInstantMessageAddressesKey_VH: VarHandle by lazy { NSMetadataItemInstantMessageAddressesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemInstantMessageAddressesKey: MemorySegment
    get() = NSMetadataItemInstantMessageAddressesKey_VH.get(NSMetadataItemInstantMessageAddressesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemInstantMessageAddressesKey_VH.set(NSMetadataItemInstantMessageAddressesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemKindKey (Void)*
 */
private val NSMetadataItemKindKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemKindKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemKindKey").orElseThrow().reinterpret(NSMetadataItemKindKey_LAYOUT.byteSize()) }
private val NSMetadataItemKindKey_VH: VarHandle by lazy { NSMetadataItemKindKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemKindKey: MemorySegment
    get() = NSMetadataItemKindKey_VH.get(NSMetadataItemKindKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemKindKey_VH.set(NSMetadataItemKindKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemRecipientsKey (Void)*
 */
private val NSMetadataItemRecipientsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemRecipientsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemRecipientsKey").orElseThrow().reinterpret(NSMetadataItemRecipientsKey_LAYOUT.byteSize()) }
private val NSMetadataItemRecipientsKey_VH: VarHandle by lazy { NSMetadataItemRecipientsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemRecipientsKey: MemorySegment
    get() = NSMetadataItemRecipientsKey_VH.get(NSMetadataItemRecipientsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemRecipientsKey_VH.set(NSMetadataItemRecipientsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFinderCommentKey (Void)*
 */
private val NSMetadataItemFinderCommentKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFinderCommentKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFinderCommentKey").orElseThrow().reinterpret(NSMetadataItemFinderCommentKey_LAYOUT.byteSize()) }
private val NSMetadataItemFinderCommentKey_VH: VarHandle by lazy { NSMetadataItemFinderCommentKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemFinderCommentKey: MemorySegment
    get() = NSMetadataItemFinderCommentKey_VH.get(NSMetadataItemFinderCommentKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFinderCommentKey_VH.set(NSMetadataItemFinderCommentKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFontsKey (Void)*
 */
private val NSMetadataItemFontsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFontsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFontsKey").orElseThrow().reinterpret(NSMetadataItemFontsKey_LAYOUT.byteSize()) }
private val NSMetadataItemFontsKey_VH: VarHandle by lazy { NSMetadataItemFontsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemFontsKey: MemorySegment
    get() = NSMetadataItemFontsKey_VH.get(NSMetadataItemFontsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFontsKey_VH.set(NSMetadataItemFontsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAppleLoopsRootKeyKey (Void)*
 */
private val NSMetadataItemAppleLoopsRootKeyKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAppleLoopsRootKeyKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAppleLoopsRootKeyKey").orElseThrow().reinterpret(NSMetadataItemAppleLoopsRootKeyKey_LAYOUT.byteSize()) }
private val NSMetadataItemAppleLoopsRootKeyKey_VH: VarHandle by lazy { NSMetadataItemAppleLoopsRootKeyKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAppleLoopsRootKeyKey: MemorySegment
    get() = NSMetadataItemAppleLoopsRootKeyKey_VH.get(NSMetadataItemAppleLoopsRootKeyKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAppleLoopsRootKeyKey_VH.set(NSMetadataItemAppleLoopsRootKeyKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAppleLoopsKeyFilterTypeKey (Void)*
 */
private val NSMetadataItemAppleLoopsKeyFilterTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAppleLoopsKeyFilterTypeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAppleLoopsKeyFilterTypeKey").orElseThrow().reinterpret(NSMetadataItemAppleLoopsKeyFilterTypeKey_LAYOUT.byteSize()) }
private val NSMetadataItemAppleLoopsKeyFilterTypeKey_VH: VarHandle by lazy { NSMetadataItemAppleLoopsKeyFilterTypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAppleLoopsKeyFilterTypeKey: MemorySegment
    get() = NSMetadataItemAppleLoopsKeyFilterTypeKey_VH.get(NSMetadataItemAppleLoopsKeyFilterTypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAppleLoopsKeyFilterTypeKey_VH.set(NSMetadataItemAppleLoopsKeyFilterTypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAppleLoopsLoopModeKey (Void)*
 */
private val NSMetadataItemAppleLoopsLoopModeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAppleLoopsLoopModeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAppleLoopsLoopModeKey").orElseThrow().reinterpret(NSMetadataItemAppleLoopsLoopModeKey_LAYOUT.byteSize()) }
private val NSMetadataItemAppleLoopsLoopModeKey_VH: VarHandle by lazy { NSMetadataItemAppleLoopsLoopModeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAppleLoopsLoopModeKey: MemorySegment
    get() = NSMetadataItemAppleLoopsLoopModeKey_VH.get(NSMetadataItemAppleLoopsLoopModeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAppleLoopsLoopModeKey_VH.set(NSMetadataItemAppleLoopsLoopModeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAppleLoopDescriptorsKey (Void)*
 */
private val NSMetadataItemAppleLoopDescriptorsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAppleLoopDescriptorsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAppleLoopDescriptorsKey").orElseThrow().reinterpret(NSMetadataItemAppleLoopDescriptorsKey_LAYOUT.byteSize()) }
private val NSMetadataItemAppleLoopDescriptorsKey_VH: VarHandle by lazy { NSMetadataItemAppleLoopDescriptorsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAppleLoopDescriptorsKey: MemorySegment
    get() = NSMetadataItemAppleLoopDescriptorsKey_VH.get(NSMetadataItemAppleLoopDescriptorsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAppleLoopDescriptorsKey_VH.set(NSMetadataItemAppleLoopDescriptorsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemMusicalInstrumentCategoryKey (Void)*
 */
private val NSMetadataItemMusicalInstrumentCategoryKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemMusicalInstrumentCategoryKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemMusicalInstrumentCategoryKey").orElseThrow().reinterpret(NSMetadataItemMusicalInstrumentCategoryKey_LAYOUT.byteSize()) }
private val NSMetadataItemMusicalInstrumentCategoryKey_VH: VarHandle by lazy { NSMetadataItemMusicalInstrumentCategoryKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemMusicalInstrumentCategoryKey: MemorySegment
    get() = NSMetadataItemMusicalInstrumentCategoryKey_VH.get(NSMetadataItemMusicalInstrumentCategoryKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemMusicalInstrumentCategoryKey_VH.set(NSMetadataItemMusicalInstrumentCategoryKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemMusicalInstrumentNameKey (Void)*
 */
private val NSMetadataItemMusicalInstrumentNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemMusicalInstrumentNameKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemMusicalInstrumentNameKey").orElseThrow().reinterpret(NSMetadataItemMusicalInstrumentNameKey_LAYOUT.byteSize()) }
private val NSMetadataItemMusicalInstrumentNameKey_VH: VarHandle by lazy { NSMetadataItemMusicalInstrumentNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemMusicalInstrumentNameKey: MemorySegment
    get() = NSMetadataItemMusicalInstrumentNameKey_VH.get(NSMetadataItemMusicalInstrumentNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemMusicalInstrumentNameKey_VH.set(NSMetadataItemMusicalInstrumentNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCFBundleIdentifierKey (Void)*
 */
private val NSMetadataItemCFBundleIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCFBundleIdentifierKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCFBundleIdentifierKey").orElseThrow().reinterpret(NSMetadataItemCFBundleIdentifierKey_LAYOUT.byteSize()) }
private val NSMetadataItemCFBundleIdentifierKey_VH: VarHandle by lazy { NSMetadataItemCFBundleIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCFBundleIdentifierKey: MemorySegment
    get() = NSMetadataItemCFBundleIdentifierKey_VH.get(NSMetadataItemCFBundleIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCFBundleIdentifierKey_VH.set(NSMetadataItemCFBundleIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemInformationKey (Void)*
 */
private val NSMetadataItemInformationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemInformationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemInformationKey").orElseThrow().reinterpret(NSMetadataItemInformationKey_LAYOUT.byteSize()) }
private val NSMetadataItemInformationKey_VH: VarHandle by lazy { NSMetadataItemInformationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemInformationKey: MemorySegment
    get() = NSMetadataItemInformationKey_VH.get(NSMetadataItemInformationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemInformationKey_VH.set(NSMetadataItemInformationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemDirectorKey (Void)*
 */
private val NSMetadataItemDirectorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemDirectorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemDirectorKey").orElseThrow().reinterpret(NSMetadataItemDirectorKey_LAYOUT.byteSize()) }
private val NSMetadataItemDirectorKey_VH: VarHandle by lazy { NSMetadataItemDirectorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemDirectorKey: MemorySegment
    get() = NSMetadataItemDirectorKey_VH.get(NSMetadataItemDirectorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemDirectorKey_VH.set(NSMetadataItemDirectorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemProducerKey (Void)*
 */
private val NSMetadataItemProducerKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemProducerKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemProducerKey").orElseThrow().reinterpret(NSMetadataItemProducerKey_LAYOUT.byteSize()) }
private val NSMetadataItemProducerKey_VH: VarHandle by lazy { NSMetadataItemProducerKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemProducerKey: MemorySegment
    get() = NSMetadataItemProducerKey_VH.get(NSMetadataItemProducerKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemProducerKey_VH.set(NSMetadataItemProducerKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGenreKey (Void)*
 */
private val NSMetadataItemGenreKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGenreKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGenreKey").orElseThrow().reinterpret(NSMetadataItemGenreKey_LAYOUT.byteSize()) }
private val NSMetadataItemGenreKey_VH: VarHandle by lazy { NSMetadataItemGenreKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGenreKey: MemorySegment
    get() = NSMetadataItemGenreKey_VH.get(NSMetadataItemGenreKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGenreKey_VH.set(NSMetadataItemGenreKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPerformersKey (Void)*
 */
private val NSMetadataItemPerformersKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPerformersKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPerformersKey").orElseThrow().reinterpret(NSMetadataItemPerformersKey_LAYOUT.byteSize()) }
private val NSMetadataItemPerformersKey_VH: VarHandle by lazy { NSMetadataItemPerformersKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemPerformersKey: MemorySegment
    get() = NSMetadataItemPerformersKey_VH.get(NSMetadataItemPerformersKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPerformersKey_VH.set(NSMetadataItemPerformersKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemOriginalFormatKey (Void)*
 */
private val NSMetadataItemOriginalFormatKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemOriginalFormatKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemOriginalFormatKey").orElseThrow().reinterpret(NSMetadataItemOriginalFormatKey_LAYOUT.byteSize()) }
private val NSMetadataItemOriginalFormatKey_VH: VarHandle by lazy { NSMetadataItemOriginalFormatKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemOriginalFormatKey: MemorySegment
    get() = NSMetadataItemOriginalFormatKey_VH.get(NSMetadataItemOriginalFormatKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemOriginalFormatKey_VH.set(NSMetadataItemOriginalFormatKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemOriginalSourceKey (Void)*
 */
private val NSMetadataItemOriginalSourceKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemOriginalSourceKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemOriginalSourceKey").orElseThrow().reinterpret(NSMetadataItemOriginalSourceKey_LAYOUT.byteSize()) }
private val NSMetadataItemOriginalSourceKey_VH: VarHandle by lazy { NSMetadataItemOriginalSourceKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemOriginalSourceKey: MemorySegment
    get() = NSMetadataItemOriginalSourceKey_VH.get(NSMetadataItemOriginalSourceKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemOriginalSourceKey_VH.set(NSMetadataItemOriginalSourceKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAuthorEmailAddressesKey (Void)*
 */
private val NSMetadataItemAuthorEmailAddressesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAuthorEmailAddressesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAuthorEmailAddressesKey").orElseThrow().reinterpret(NSMetadataItemAuthorEmailAddressesKey_LAYOUT.byteSize()) }
private val NSMetadataItemAuthorEmailAddressesKey_VH: VarHandle by lazy { NSMetadataItemAuthorEmailAddressesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAuthorEmailAddressesKey: MemorySegment
    get() = NSMetadataItemAuthorEmailAddressesKey_VH.get(NSMetadataItemAuthorEmailAddressesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAuthorEmailAddressesKey_VH.set(NSMetadataItemAuthorEmailAddressesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemRecipientEmailAddressesKey (Void)*
 */
private val NSMetadataItemRecipientEmailAddressesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemRecipientEmailAddressesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemRecipientEmailAddressesKey").orElseThrow().reinterpret(NSMetadataItemRecipientEmailAddressesKey_LAYOUT.byteSize()) }
private val NSMetadataItemRecipientEmailAddressesKey_VH: VarHandle by lazy { NSMetadataItemRecipientEmailAddressesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemRecipientEmailAddressesKey: MemorySegment
    get() = NSMetadataItemRecipientEmailAddressesKey_VH.get(NSMetadataItemRecipientEmailAddressesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemRecipientEmailAddressesKey_VH.set(NSMetadataItemRecipientEmailAddressesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAuthorAddressesKey (Void)*
 */
private val NSMetadataItemAuthorAddressesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAuthorAddressesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAuthorAddressesKey").orElseThrow().reinterpret(NSMetadataItemAuthorAddressesKey_LAYOUT.byteSize()) }
private val NSMetadataItemAuthorAddressesKey_VH: VarHandle by lazy { NSMetadataItemAuthorAddressesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAuthorAddressesKey: MemorySegment
    get() = NSMetadataItemAuthorAddressesKey_VH.get(NSMetadataItemAuthorAddressesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAuthorAddressesKey_VH.set(NSMetadataItemAuthorAddressesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemRecipientAddressesKey (Void)*
 */
private val NSMetadataItemRecipientAddressesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemRecipientAddressesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemRecipientAddressesKey").orElseThrow().reinterpret(NSMetadataItemRecipientAddressesKey_LAYOUT.byteSize()) }
private val NSMetadataItemRecipientAddressesKey_VH: VarHandle by lazy { NSMetadataItemRecipientAddressesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemRecipientAddressesKey: MemorySegment
    get() = NSMetadataItemRecipientAddressesKey_VH.get(NSMetadataItemRecipientAddressesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemRecipientAddressesKey_VH.set(NSMetadataItemRecipientAddressesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemIsLikelyJunkKey (Void)*
 */
private val NSMetadataItemIsLikelyJunkKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemIsLikelyJunkKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemIsLikelyJunkKey").orElseThrow().reinterpret(NSMetadataItemIsLikelyJunkKey_LAYOUT.byteSize()) }
private val NSMetadataItemIsLikelyJunkKey_VH: VarHandle by lazy { NSMetadataItemIsLikelyJunkKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemIsLikelyJunkKey: MemorySegment
    get() = NSMetadataItemIsLikelyJunkKey_VH.get(NSMetadataItemIsLikelyJunkKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemIsLikelyJunkKey_VH.set(NSMetadataItemIsLikelyJunkKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemExecutableArchitecturesKey (Void)*
 */
private val NSMetadataItemExecutableArchitecturesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemExecutableArchitecturesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemExecutableArchitecturesKey").orElseThrow().reinterpret(NSMetadataItemExecutableArchitecturesKey_LAYOUT.byteSize()) }
private val NSMetadataItemExecutableArchitecturesKey_VH: VarHandle by lazy { NSMetadataItemExecutableArchitecturesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemExecutableArchitecturesKey: MemorySegment
    get() = NSMetadataItemExecutableArchitecturesKey_VH.get(NSMetadataItemExecutableArchitecturesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemExecutableArchitecturesKey_VH.set(NSMetadataItemExecutableArchitecturesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemExecutablePlatformKey (Void)*
 */
private val NSMetadataItemExecutablePlatformKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemExecutablePlatformKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemExecutablePlatformKey").orElseThrow().reinterpret(NSMetadataItemExecutablePlatformKey_LAYOUT.byteSize()) }
private val NSMetadataItemExecutablePlatformKey_VH: VarHandle by lazy { NSMetadataItemExecutablePlatformKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemExecutablePlatformKey: MemorySegment
    get() = NSMetadataItemExecutablePlatformKey_VH.get(NSMetadataItemExecutablePlatformKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemExecutablePlatformKey_VH.set(NSMetadataItemExecutablePlatformKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemApplicationCategoriesKey (Void)*
 */
private val NSMetadataItemApplicationCategoriesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemApplicationCategoriesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemApplicationCategoriesKey").orElseThrow().reinterpret(NSMetadataItemApplicationCategoriesKey_LAYOUT.byteSize()) }
private val NSMetadataItemApplicationCategoriesKey_VH: VarHandle by lazy { NSMetadataItemApplicationCategoriesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemApplicationCategoriesKey: MemorySegment
    get() = NSMetadataItemApplicationCategoriesKey_VH.get(NSMetadataItemApplicationCategoriesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemApplicationCategoriesKey_VH.set(NSMetadataItemApplicationCategoriesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemIsApplicationManagedKey (Void)*
 */
private val NSMetadataItemIsApplicationManagedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemIsApplicationManagedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemIsApplicationManagedKey").orElseThrow().reinterpret(NSMetadataItemIsApplicationManagedKey_LAYOUT.byteSize()) }
private val NSMetadataItemIsApplicationManagedKey_VH: VarHandle by lazy { NSMetadataItemIsApplicationManagedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemIsApplicationManagedKey: MemorySegment
    get() = NSMetadataItemIsApplicationManagedKey_VH.get(NSMetadataItemIsApplicationManagedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemIsApplicationManagedKey_VH.set(NSMetadataItemIsApplicationManagedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryDidStartGatheringNotification typedef const NSNotificationName = (Void)*
 */
private val NSMetadataQueryDidStartGatheringNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryDidStartGatheringNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryDidStartGatheringNotification").orElseThrow().reinterpret(NSMetadataQueryDidStartGatheringNotification_LAYOUT.byteSize()) }
private val NSMetadataQueryDidStartGatheringNotification_VH: VarHandle by lazy { NSMetadataQueryDidStartGatheringNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryDidStartGatheringNotification: MemorySegment
    get() = NSMetadataQueryDidStartGatheringNotification_VH.get(NSMetadataQueryDidStartGatheringNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryDidStartGatheringNotification_VH.set(NSMetadataQueryDidStartGatheringNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryGatheringProgressNotification typedef const NSNotificationName = (Void)*
 */
private val NSMetadataQueryGatheringProgressNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryGatheringProgressNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryGatheringProgressNotification").orElseThrow().reinterpret(NSMetadataQueryGatheringProgressNotification_LAYOUT.byteSize()) }
private val NSMetadataQueryGatheringProgressNotification_VH: VarHandle by lazy { NSMetadataQueryGatheringProgressNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryGatheringProgressNotification: MemorySegment
    get() = NSMetadataQueryGatheringProgressNotification_VH.get(NSMetadataQueryGatheringProgressNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryGatheringProgressNotification_VH.set(NSMetadataQueryGatheringProgressNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryDidFinishGatheringNotification typedef const NSNotificationName = (Void)*
 */
private val NSMetadataQueryDidFinishGatheringNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryDidFinishGatheringNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryDidFinishGatheringNotification").orElseThrow().reinterpret(NSMetadataQueryDidFinishGatheringNotification_LAYOUT.byteSize()) }
private val NSMetadataQueryDidFinishGatheringNotification_VH: VarHandle by lazy { NSMetadataQueryDidFinishGatheringNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryDidFinishGatheringNotification: MemorySegment
    get() = NSMetadataQueryDidFinishGatheringNotification_VH.get(NSMetadataQueryDidFinishGatheringNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryDidFinishGatheringNotification_VH.set(NSMetadataQueryDidFinishGatheringNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryDidUpdateNotification typedef const NSNotificationName = (Void)*
 */
private val NSMetadataQueryDidUpdateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryDidUpdateNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryDidUpdateNotification").orElseThrow().reinterpret(NSMetadataQueryDidUpdateNotification_LAYOUT.byteSize()) }
private val NSMetadataQueryDidUpdateNotification_VH: VarHandle by lazy { NSMetadataQueryDidUpdateNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryDidUpdateNotification: MemorySegment
    get() = NSMetadataQueryDidUpdateNotification_VH.get(NSMetadataQueryDidUpdateNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryDidUpdateNotification_VH.set(NSMetadataQueryDidUpdateNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryUpdateAddedItemsKey (Void)*
 */
private val NSMetadataQueryUpdateAddedItemsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryUpdateAddedItemsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryUpdateAddedItemsKey").orElseThrow().reinterpret(NSMetadataQueryUpdateAddedItemsKey_LAYOUT.byteSize()) }
private val NSMetadataQueryUpdateAddedItemsKey_VH: VarHandle by lazy { NSMetadataQueryUpdateAddedItemsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryUpdateAddedItemsKey: MemorySegment
    get() = NSMetadataQueryUpdateAddedItemsKey_VH.get(NSMetadataQueryUpdateAddedItemsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryUpdateAddedItemsKey_VH.set(NSMetadataQueryUpdateAddedItemsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryUpdateChangedItemsKey (Void)*
 */
private val NSMetadataQueryUpdateChangedItemsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryUpdateChangedItemsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryUpdateChangedItemsKey").orElseThrow().reinterpret(NSMetadataQueryUpdateChangedItemsKey_LAYOUT.byteSize()) }
private val NSMetadataQueryUpdateChangedItemsKey_VH: VarHandle by lazy { NSMetadataQueryUpdateChangedItemsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryUpdateChangedItemsKey: MemorySegment
    get() = NSMetadataQueryUpdateChangedItemsKey_VH.get(NSMetadataQueryUpdateChangedItemsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryUpdateChangedItemsKey_VH.set(NSMetadataQueryUpdateChangedItemsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryUpdateRemovedItemsKey (Void)*
 */
private val NSMetadataQueryUpdateRemovedItemsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryUpdateRemovedItemsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryUpdateRemovedItemsKey").orElseThrow().reinterpret(NSMetadataQueryUpdateRemovedItemsKey_LAYOUT.byteSize()) }
private val NSMetadataQueryUpdateRemovedItemsKey_VH: VarHandle by lazy { NSMetadataQueryUpdateRemovedItemsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryUpdateRemovedItemsKey: MemorySegment
    get() = NSMetadataQueryUpdateRemovedItemsKey_VH.get(NSMetadataQueryUpdateRemovedItemsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryUpdateRemovedItemsKey_VH.set(NSMetadataQueryUpdateRemovedItemsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryResultContentRelevanceAttribute (Void)*
 */
private val NSMetadataQueryResultContentRelevanceAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryResultContentRelevanceAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryResultContentRelevanceAttribute").orElseThrow().reinterpret(NSMetadataQueryResultContentRelevanceAttribute_LAYOUT.byteSize()) }
private val NSMetadataQueryResultContentRelevanceAttribute_VH: VarHandle by lazy { NSMetadataQueryResultContentRelevanceAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryResultContentRelevanceAttribute: MemorySegment
    get() = NSMetadataQueryResultContentRelevanceAttribute_VH.get(NSMetadataQueryResultContentRelevanceAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryResultContentRelevanceAttribute_VH.set(NSMetadataQueryResultContentRelevanceAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryUserHomeScope (Void)*
 */
private val NSMetadataQueryUserHomeScope_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryUserHomeScope_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryUserHomeScope").orElseThrow().reinterpret(NSMetadataQueryUserHomeScope_LAYOUT.byteSize()) }
private val NSMetadataQueryUserHomeScope_VH: VarHandle by lazy { NSMetadataQueryUserHomeScope_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataQueryUserHomeScope: MemorySegment
    get() = NSMetadataQueryUserHomeScope_VH.get(NSMetadataQueryUserHomeScope_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryUserHomeScope_VH.set(NSMetadataQueryUserHomeScope_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryLocalComputerScope (Void)*
 */
private val NSMetadataQueryLocalComputerScope_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryLocalComputerScope_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryLocalComputerScope").orElseThrow().reinterpret(NSMetadataQueryLocalComputerScope_LAYOUT.byteSize()) }
private val NSMetadataQueryLocalComputerScope_VH: VarHandle by lazy { NSMetadataQueryLocalComputerScope_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataQueryLocalComputerScope: MemorySegment
    get() = NSMetadataQueryLocalComputerScope_VH.get(NSMetadataQueryLocalComputerScope_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryLocalComputerScope_VH.set(NSMetadataQueryLocalComputerScope_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryNetworkScope (Void)*
 */
private val NSMetadataQueryNetworkScope_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryNetworkScope_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryNetworkScope").orElseThrow().reinterpret(NSMetadataQueryNetworkScope_LAYOUT.byteSize()) }
private val NSMetadataQueryNetworkScope_VH: VarHandle by lazy { NSMetadataQueryNetworkScope_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataQueryNetworkScope: MemorySegment
    get() = NSMetadataQueryNetworkScope_VH.get(NSMetadataQueryNetworkScope_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryNetworkScope_VH.set(NSMetadataQueryNetworkScope_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryIndexedLocalComputerScope (Void)*
 */
private val NSMetadataQueryIndexedLocalComputerScope_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryIndexedLocalComputerScope_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryIndexedLocalComputerScope").orElseThrow().reinterpret(NSMetadataQueryIndexedLocalComputerScope_LAYOUT.byteSize()) }
private val NSMetadataQueryIndexedLocalComputerScope_VH: VarHandle by lazy { NSMetadataQueryIndexedLocalComputerScope_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataQueryIndexedLocalComputerScope: MemorySegment
    get() = NSMetadataQueryIndexedLocalComputerScope_VH.get(NSMetadataQueryIndexedLocalComputerScope_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryIndexedLocalComputerScope_VH.set(NSMetadataQueryIndexedLocalComputerScope_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryIndexedNetworkScope (Void)*
 */
private val NSMetadataQueryIndexedNetworkScope_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryIndexedNetworkScope_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryIndexedNetworkScope").orElseThrow().reinterpret(NSMetadataQueryIndexedNetworkScope_LAYOUT.byteSize()) }
private val NSMetadataQueryIndexedNetworkScope_VH: VarHandle by lazy { NSMetadataQueryIndexedNetworkScope_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataQueryIndexedNetworkScope: MemorySegment
    get() = NSMetadataQueryIndexedNetworkScope_VH.get(NSMetadataQueryIndexedNetworkScope_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryIndexedNetworkScope_VH.set(NSMetadataQueryIndexedNetworkScope_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryUbiquitousDocumentsScope (Void)*
 */
private val NSMetadataQueryUbiquitousDocumentsScope_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryUbiquitousDocumentsScope_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryUbiquitousDocumentsScope").orElseThrow().reinterpret(NSMetadataQueryUbiquitousDocumentsScope_LAYOUT.byteSize()) }
private val NSMetadataQueryUbiquitousDocumentsScope_VH: VarHandle by lazy { NSMetadataQueryUbiquitousDocumentsScope_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryUbiquitousDocumentsScope: MemorySegment
    get() = NSMetadataQueryUbiquitousDocumentsScope_VH.get(NSMetadataQueryUbiquitousDocumentsScope_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryUbiquitousDocumentsScope_VH.set(NSMetadataQueryUbiquitousDocumentsScope_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryUbiquitousDataScope (Void)*
 */
private val NSMetadataQueryUbiquitousDataScope_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryUbiquitousDataScope_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryUbiquitousDataScope").orElseThrow().reinterpret(NSMetadataQueryUbiquitousDataScope_LAYOUT.byteSize()) }
private val NSMetadataQueryUbiquitousDataScope_VH: VarHandle by lazy { NSMetadataQueryUbiquitousDataScope_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryUbiquitousDataScope: MemorySegment
    get() = NSMetadataQueryUbiquitousDataScope_VH.get(NSMetadataQueryUbiquitousDataScope_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryUbiquitousDataScope_VH.set(NSMetadataQueryUbiquitousDataScope_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope (Void)*
 */
private val NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope").orElseThrow().reinterpret(NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_LAYOUT.byteSize()) }
private val NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_VH: VarHandle by lazy { NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope: MemorySegment
    get() = NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_VH.get(NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_VH.set(NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSNetServicesErrorCode (Void)*
 */
private val NSNetServicesErrorCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNetServicesErrorCode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSNetServicesErrorCode").orElseThrow().reinterpret(NSNetServicesErrorCode_LAYOUT.byteSize()) }
private val NSNetServicesErrorCode_VH: VarHandle by lazy { NSNetServicesErrorCode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSNetServicesErrorCode: MemorySegment
    get() = NSNetServicesErrorCode_VH.get(NSNetServicesErrorCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSNetServicesErrorCode_VH.set(NSNetServicesErrorCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSNetServicesErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSNetServicesErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNetServicesErrorDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSNetServicesErrorDomain").orElseThrow().reinterpret(NSNetServicesErrorDomain_LAYOUT.byteSize()) }
private val NSNetServicesErrorDomain_VH: VarHandle by lazy { NSNetServicesErrorDomain_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSNetServicesErrorDomain: MemorySegment
    get() = NSNetServicesErrorDomain_VH.get(NSNetServicesErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSNetServicesErrorDomain_VH.set(NSNetServicesErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUbiquitousKeyValueStoreDidChangeExternallyNotification typedef const NSNotificationName = (Void)*
 */
private val NSUbiquitousKeyValueStoreDidChangeExternallyNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUbiquitousKeyValueStoreDidChangeExternallyNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUbiquitousKeyValueStoreDidChangeExternallyNotification").orElseThrow().reinterpret(NSUbiquitousKeyValueStoreDidChangeExternallyNotification_LAYOUT.byteSize()) }
private val NSUbiquitousKeyValueStoreDidChangeExternallyNotification_VH: VarHandle by lazy { NSUbiquitousKeyValueStoreDidChangeExternallyNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUbiquitousKeyValueStoreDidChangeExternallyNotification: MemorySegment
    get() = NSUbiquitousKeyValueStoreDidChangeExternallyNotification_VH.get(NSUbiquitousKeyValueStoreDidChangeExternallyNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUbiquitousKeyValueStoreDidChangeExternallyNotification_VH.set(NSUbiquitousKeyValueStoreDidChangeExternallyNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUbiquitousKeyValueStoreChangeReasonKey (Void)*
 */
private val NSUbiquitousKeyValueStoreChangeReasonKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUbiquitousKeyValueStoreChangeReasonKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUbiquitousKeyValueStoreChangeReasonKey").orElseThrow().reinterpret(NSUbiquitousKeyValueStoreChangeReasonKey_LAYOUT.byteSize()) }
private val NSUbiquitousKeyValueStoreChangeReasonKey_VH: VarHandle by lazy { NSUbiquitousKeyValueStoreChangeReasonKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUbiquitousKeyValueStoreChangeReasonKey: MemorySegment
    get() = NSUbiquitousKeyValueStoreChangeReasonKey_VH.get(NSUbiquitousKeyValueStoreChangeReasonKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSUbiquitousKeyValueStoreChangeReasonKey_VH.set(NSUbiquitousKeyValueStoreChangeReasonKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUbiquitousKeyValueStoreChangedKeysKey (Void)*
 */
private val NSUbiquitousKeyValueStoreChangedKeysKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUbiquitousKeyValueStoreChangedKeysKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUbiquitousKeyValueStoreChangedKeysKey").orElseThrow().reinterpret(NSUbiquitousKeyValueStoreChangedKeysKey_LAYOUT.byteSize()) }
private val NSUbiquitousKeyValueStoreChangedKeysKey_VH: VarHandle by lazy { NSUbiquitousKeyValueStoreChangedKeysKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUbiquitousKeyValueStoreChangedKeysKey: MemorySegment
    get() = NSUbiquitousKeyValueStoreChangedKeysKey_VH.get(NSUbiquitousKeyValueStoreChangedKeysKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSUbiquitousKeyValueStoreChangedKeysKey_VH.set(NSUbiquitousKeyValueStoreChangedKeysKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerGroupIsDiscardableKey (Void)*
 */
private val NSUndoManagerGroupIsDiscardableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerGroupIsDiscardableKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerGroupIsDiscardableKey").orElseThrow().reinterpret(NSUndoManagerGroupIsDiscardableKey_LAYOUT.byteSize()) }
private val NSUndoManagerGroupIsDiscardableKey_VH: VarHandle by lazy { NSUndoManagerGroupIsDiscardableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerGroupIsDiscardableKey: MemorySegment
    get() = NSUndoManagerGroupIsDiscardableKey_VH.get(NSUndoManagerGroupIsDiscardableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerGroupIsDiscardableKey_VH.set(NSUndoManagerGroupIsDiscardableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerCheckpointNotification typedef const NSNotificationName = (Void)*
 */
private val NSUndoManagerCheckpointNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerCheckpointNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerCheckpointNotification").orElseThrow().reinterpret(NSUndoManagerCheckpointNotification_LAYOUT.byteSize()) }
private val NSUndoManagerCheckpointNotification_VH: VarHandle by lazy { NSUndoManagerCheckpointNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerCheckpointNotification: MemorySegment
    get() = NSUndoManagerCheckpointNotification_VH.get(NSUndoManagerCheckpointNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerCheckpointNotification_VH.set(NSUndoManagerCheckpointNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerWillUndoChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSUndoManagerWillUndoChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerWillUndoChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerWillUndoChangeNotification").orElseThrow().reinterpret(NSUndoManagerWillUndoChangeNotification_LAYOUT.byteSize()) }
private val NSUndoManagerWillUndoChangeNotification_VH: VarHandle by lazy { NSUndoManagerWillUndoChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerWillUndoChangeNotification: MemorySegment
    get() = NSUndoManagerWillUndoChangeNotification_VH.get(NSUndoManagerWillUndoChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerWillUndoChangeNotification_VH.set(NSUndoManagerWillUndoChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerWillRedoChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSUndoManagerWillRedoChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerWillRedoChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerWillRedoChangeNotification").orElseThrow().reinterpret(NSUndoManagerWillRedoChangeNotification_LAYOUT.byteSize()) }
private val NSUndoManagerWillRedoChangeNotification_VH: VarHandle by lazy { NSUndoManagerWillRedoChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerWillRedoChangeNotification: MemorySegment
    get() = NSUndoManagerWillRedoChangeNotification_VH.get(NSUndoManagerWillRedoChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerWillRedoChangeNotification_VH.set(NSUndoManagerWillRedoChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerDidUndoChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSUndoManagerDidUndoChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerDidUndoChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerDidUndoChangeNotification").orElseThrow().reinterpret(NSUndoManagerDidUndoChangeNotification_LAYOUT.byteSize()) }
private val NSUndoManagerDidUndoChangeNotification_VH: VarHandle by lazy { NSUndoManagerDidUndoChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerDidUndoChangeNotification: MemorySegment
    get() = NSUndoManagerDidUndoChangeNotification_VH.get(NSUndoManagerDidUndoChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerDidUndoChangeNotification_VH.set(NSUndoManagerDidUndoChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerDidRedoChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSUndoManagerDidRedoChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerDidRedoChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerDidRedoChangeNotification").orElseThrow().reinterpret(NSUndoManagerDidRedoChangeNotification_LAYOUT.byteSize()) }
private val NSUndoManagerDidRedoChangeNotification_VH: VarHandle by lazy { NSUndoManagerDidRedoChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerDidRedoChangeNotification: MemorySegment
    get() = NSUndoManagerDidRedoChangeNotification_VH.get(NSUndoManagerDidRedoChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerDidRedoChangeNotification_VH.set(NSUndoManagerDidRedoChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerDidOpenUndoGroupNotification typedef const NSNotificationName = (Void)*
 */
private val NSUndoManagerDidOpenUndoGroupNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerDidOpenUndoGroupNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerDidOpenUndoGroupNotification").orElseThrow().reinterpret(NSUndoManagerDidOpenUndoGroupNotification_LAYOUT.byteSize()) }
private val NSUndoManagerDidOpenUndoGroupNotification_VH: VarHandle by lazy { NSUndoManagerDidOpenUndoGroupNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerDidOpenUndoGroupNotification: MemorySegment
    get() = NSUndoManagerDidOpenUndoGroupNotification_VH.get(NSUndoManagerDidOpenUndoGroupNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerDidOpenUndoGroupNotification_VH.set(NSUndoManagerDidOpenUndoGroupNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerWillCloseUndoGroupNotification typedef const NSNotificationName = (Void)*
 */
private val NSUndoManagerWillCloseUndoGroupNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerWillCloseUndoGroupNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerWillCloseUndoGroupNotification").orElseThrow().reinterpret(NSUndoManagerWillCloseUndoGroupNotification_LAYOUT.byteSize()) }
private val NSUndoManagerWillCloseUndoGroupNotification_VH: VarHandle by lazy { NSUndoManagerWillCloseUndoGroupNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerWillCloseUndoGroupNotification: MemorySegment
    get() = NSUndoManagerWillCloseUndoGroupNotification_VH.get(NSUndoManagerWillCloseUndoGroupNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerWillCloseUndoGroupNotification_VH.set(NSUndoManagerWillCloseUndoGroupNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUndoManagerDidCloseUndoGroupNotification typedef const NSNotificationName = (Void)*
 */
private val NSUndoManagerDidCloseUndoGroupNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUndoManagerDidCloseUndoGroupNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUndoManagerDidCloseUndoGroupNotification").orElseThrow().reinterpret(NSUndoManagerDidCloseUndoGroupNotification_LAYOUT.byteSize()) }
private val NSUndoManagerDidCloseUndoGroupNotification_VH: VarHandle by lazy { NSUndoManagerDidCloseUndoGroupNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUndoManagerDidCloseUndoGroupNotification: MemorySegment
    get() = NSUndoManagerDidCloseUndoGroupNotification_VH.get(NSUndoManagerDidCloseUndoGroupNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUndoManagerDidCloseUndoGroupNotification_VH.set(NSUndoManagerDidCloseUndoGroupNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLSessionTransferSizeUnknown typedef const int64_t = LongLong
 */
private val NSURLSessionTransferSizeUnknown_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val NSURLSessionTransferSizeUnknown_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLSessionTransferSizeUnknown").orElseThrow().reinterpret(NSURLSessionTransferSizeUnknown_LAYOUT.byteSize()) }
private val NSURLSessionTransferSizeUnknown_VH: VarHandle by lazy { NSURLSessionTransferSizeUnknown_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLSessionTransferSizeUnknown: Long
    get() = NSURLSessionTransferSizeUnknown_VH.get(NSURLSessionTransferSizeUnknown_SEGMENT, 0L) as Long
    set(value) = NSURLSessionTransferSizeUnknown_VH.set(NSURLSessionTransferSizeUnknown_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLSessionTaskPriorityDefault Float
 */
private val NSURLSessionTaskPriorityDefault_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_FLOAT }
private val NSURLSessionTaskPriorityDefault_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLSessionTaskPriorityDefault").orElseThrow().reinterpret(NSURLSessionTaskPriorityDefault_LAYOUT.byteSize()) }
private val NSURLSessionTaskPriorityDefault_VH: VarHandle by lazy { NSURLSessionTaskPriorityDefault_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLSessionTaskPriorityDefault: Float
    get() = NSURLSessionTaskPriorityDefault_VH.get(NSURLSessionTaskPriorityDefault_SEGMENT, 0L) as Float
    set(value) = NSURLSessionTaskPriorityDefault_VH.set(NSURLSessionTaskPriorityDefault_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLSessionTaskPriorityLow Float
 */
private val NSURLSessionTaskPriorityLow_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_FLOAT }
private val NSURLSessionTaskPriorityLow_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLSessionTaskPriorityLow").orElseThrow().reinterpret(NSURLSessionTaskPriorityLow_LAYOUT.byteSize()) }
private val NSURLSessionTaskPriorityLow_VH: VarHandle by lazy { NSURLSessionTaskPriorityLow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLSessionTaskPriorityLow: Float
    get() = NSURLSessionTaskPriorityLow_VH.get(NSURLSessionTaskPriorityLow_SEGMENT, 0L) as Float
    set(value) = NSURLSessionTaskPriorityLow_VH.set(NSURLSessionTaskPriorityLow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLSessionTaskPriorityHigh Float
 */
private val NSURLSessionTaskPriorityHigh_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_FLOAT }
private val NSURLSessionTaskPriorityHigh_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLSessionTaskPriorityHigh").orElseThrow().reinterpret(NSURLSessionTaskPriorityHigh_LAYOUT.byteSize()) }
private val NSURLSessionTaskPriorityHigh_VH: VarHandle by lazy { NSURLSessionTaskPriorityHigh_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLSessionTaskPriorityHigh: Float
    get() = NSURLSessionTaskPriorityHigh_VH.get(NSURLSessionTaskPriorityHigh_SEGMENT, 0L) as Float
    set(value) = NSURLSessionTaskPriorityHigh_VH.set(NSURLSessionTaskPriorityHigh_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLSessionDownloadTaskResumeData (Void)*
 */
private val NSURLSessionDownloadTaskResumeData_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLSessionDownloadTaskResumeData_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLSessionDownloadTaskResumeData").orElseThrow().reinterpret(NSURLSessionDownloadTaskResumeData_LAYOUT.byteSize()) }
private val NSURLSessionDownloadTaskResumeData_VH: VarHandle by lazy { NSURLSessionDownloadTaskResumeData_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLSessionDownloadTaskResumeData: MemorySegment
    get() = NSURLSessionDownloadTaskResumeData_VH.get(NSURLSessionDownloadTaskResumeData_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLSessionDownloadTaskResumeData_VH.set(NSURLSessionDownloadTaskResumeData_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLSessionUploadTaskResumeData (Void)*
 */
private val NSURLSessionUploadTaskResumeData_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLSessionUploadTaskResumeData_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLSessionUploadTaskResumeData").orElseThrow().reinterpret(NSURLSessionUploadTaskResumeData_LAYOUT.byteSize()) }
private val NSURLSessionUploadTaskResumeData_VH: VarHandle by lazy { NSURLSessionUploadTaskResumeData_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var NSURLSessionUploadTaskResumeData: MemorySegment
    get() = NSURLSessionUploadTaskResumeData_VH.get(NSURLSessionUploadTaskResumeData_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLSessionUploadTaskResumeData_VH.set(NSURLSessionUploadTaskResumeData_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUserActivityTypeBrowsingWeb (Void)*
 */
private val NSUserActivityTypeBrowsingWeb_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUserActivityTypeBrowsingWeb_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUserActivityTypeBrowsingWeb").orElseThrow().reinterpret(NSUserActivityTypeBrowsingWeb_LAYOUT.byteSize()) }
private val NSUserActivityTypeBrowsingWeb_VH: VarHandle by lazy { NSUserActivityTypeBrowsingWeb_LAYOUT.varHandle() }

var NSUserActivityTypeBrowsingWeb: MemorySegment
    get() = NSUserActivityTypeBrowsingWeb_VH.get(NSUserActivityTypeBrowsingWeb_SEGMENT, 0L) as MemorySegment
    set(value) = NSUserActivityTypeBrowsingWeb_VH.set(NSUserActivityTypeBrowsingWeb_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGAffineTransformIdentity typedef const CGAffineTransform = Declared(CGAffineTransform)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
val CGAffineTransformIdentity: MemorySegment = LOOKUP.find("CGAffineTransformIdentity").orElseThrow()

/**
 * {@snippet lang=c : CGAffineTransformMake typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGAffineTransformMake_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGAffineTransformMake_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformMake").orElseThrow() }
private val CGAffineTransformMake_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformMake_ADDR, CGAffineTransformMake_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformMake(allocator: SegmentAllocator, arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double): MemorySegment {
    try {
        return CGAffineTransformMake_HANDLE.invokeExact(allocator, arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
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
fun CGAffineTransformMakeTyped(allocator: SegmentAllocator, arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformMake(allocator, arg0, arg1, arg2, arg3, arg4, arg5))
}

/**
 * {@snippet lang=c : CGAffineTransformMakeTranslation typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGAffineTransformMakeTranslation_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGAffineTransformMakeTranslation_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformMakeTranslation").orElseThrow() }
private val CGAffineTransformMakeTranslation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformMakeTranslation_ADDR, CGAffineTransformMakeTranslation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformMakeTranslation(allocator: SegmentAllocator, arg0: Double, arg1: Double): MemorySegment {
    try {
        return CGAffineTransformMakeTranslation_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
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
fun CGAffineTransformMakeTranslationTyped(allocator: SegmentAllocator, arg0: Double, arg1: Double): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformMakeTranslation(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGAffineTransformMakeScale typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGAffineTransformMakeScale_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGAffineTransformMakeScale_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformMakeScale").orElseThrow() }
private val CGAffineTransformMakeScale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformMakeScale_ADDR, CGAffineTransformMakeScale_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformMakeScale(allocator: SegmentAllocator, arg0: Double, arg1: Double): MemorySegment {
    try {
        return CGAffineTransformMakeScale_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
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
fun CGAffineTransformMakeScaleTyped(allocator: SegmentAllocator, arg0: Double, arg1: Double): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformMakeScale(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGAffineTransformMakeRotation typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGFloat = Double)
 */
private val CGAffineTransformMakeRotation_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.JAVA_DOUBLE)
private val CGAffineTransformMakeRotation_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformMakeRotation").orElseThrow() }
private val CGAffineTransformMakeRotation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformMakeRotation_ADDR, CGAffineTransformMakeRotation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformMakeRotation(allocator: SegmentAllocator, arg0: Double): MemorySegment {
    try {
        return CGAffineTransformMakeRotation_HANDLE.invokeExact(allocator, arg0) as MemorySegment
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
fun CGAffineTransformMakeRotationTyped(allocator: SegmentAllocator, arg0: Double): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformMakeRotation(allocator, arg0))
}

/**
 * {@snippet lang=c : CGAffineTransformIsIdentity Bool(typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGAffineTransformIsIdentity_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGAffineTransform.layout)
private val CGAffineTransformIsIdentity_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformIsIdentity").orElseThrow() }
private val CGAffineTransformIsIdentity_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformIsIdentity_ADDR, CGAffineTransformIsIdentity_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGAffineTransformIsIdentity(arg0: MemorySegment): Boolean {
    try {
        return CGAffineTransformIsIdentity_HANDLE.invokeExact(arg0) as Boolean
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
fun CGAffineTransformIsIdentity(arg0: CGAffineTransform): Boolean {
    return CGAffineTransformIsIdentity(arg0.segment)
}

/**
 * {@snippet lang=c : CGAffineTransformTranslate typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGAffineTransform = Declared(CGAffineTransform),typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGAffineTransformTranslate_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, CGAffineTransform.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGAffineTransformTranslate_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformTranslate").orElseThrow() }
private val CGAffineTransformTranslate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformTranslate_ADDR, CGAffineTransformTranslate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformTranslate(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double): MemorySegment {
    try {
        return CGAffineTransformTranslate_HANDLE.invokeExact(allocator, arg0, arg1, arg2) as MemorySegment
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
fun CGAffineTransformTranslate(allocator: SegmentAllocator, arg0: CGAffineTransform, arg1: Double, arg2: Double): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformTranslate(allocator, arg0.segment, arg1, arg2))
}

/**
 * {@snippet lang=c : CGAffineTransformScale typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGAffineTransform = Declared(CGAffineTransform),typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGAffineTransformScale_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, CGAffineTransform.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGAffineTransformScale_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformScale").orElseThrow() }
private val CGAffineTransformScale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformScale_ADDR, CGAffineTransformScale_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformScale(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double): MemorySegment {
    try {
        return CGAffineTransformScale_HANDLE.invokeExact(allocator, arg0, arg1, arg2) as MemorySegment
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
fun CGAffineTransformScale(allocator: SegmentAllocator, arg0: CGAffineTransform, arg1: Double, arg2: Double): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformScale(allocator, arg0.segment, arg1, arg2))
}

/**
 * {@snippet lang=c : CGAffineTransformRotate typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGAffineTransform = Declared(CGAffineTransform),typedef CGFloat = Double)
 */
private val CGAffineTransformRotate_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, CGAffineTransform.layout, ValueLayout.JAVA_DOUBLE)
private val CGAffineTransformRotate_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformRotate").orElseThrow() }
private val CGAffineTransformRotate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformRotate_ADDR, CGAffineTransformRotate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformRotate(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double): MemorySegment {
    try {
        return CGAffineTransformRotate_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
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
fun CGAffineTransformRotate(allocator: SegmentAllocator, arg0: CGAffineTransform, arg1: Double): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformRotate(allocator, arg0.segment, arg1))
}

/**
 * {@snippet lang=c : CGAffineTransformInvert typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGAffineTransformInvert_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, CGAffineTransform.layout)
private val CGAffineTransformInvert_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformInvert").orElseThrow() }
private val CGAffineTransformInvert_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformInvert_ADDR, CGAffineTransformInvert_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformInvert(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGAffineTransformInvert_HANDLE.invokeExact(allocator, arg0) as MemorySegment
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
fun CGAffineTransformInvert(allocator: SegmentAllocator, arg0: CGAffineTransform): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformInvert(allocator, arg0.segment))
}

/**
 * {@snippet lang=c : CGAffineTransformConcat typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGAffineTransform = Declared(CGAffineTransform),typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGAffineTransformConcat_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, CGAffineTransform.layout, CGAffineTransform.layout)
private val CGAffineTransformConcat_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformConcat").orElseThrow() }
private val CGAffineTransformConcat_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformConcat_ADDR, CGAffineTransformConcat_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformConcat(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGAffineTransformConcat_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
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
fun CGAffineTransformConcat(allocator: SegmentAllocator, arg0: CGAffineTransform, arg1: CGAffineTransform): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformConcat(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : CGAffineTransformEqualToTransform Bool(typedef CGAffineTransform = Declared(CGAffineTransform),typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGAffineTransformEqualToTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CGAffineTransform.layout, CGAffineTransform.layout)
private val CGAffineTransformEqualToTransform_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformEqualToTransform").orElseThrow() }
private val CGAffineTransformEqualToTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformEqualToTransform_ADDR, CGAffineTransformEqualToTransform_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGAffineTransformEqualToTransform(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGAffineTransformEqualToTransform_HANDLE.invokeExact(arg0, arg1) as Boolean
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
fun CGAffineTransformEqualToTransform(arg0: CGAffineTransform, arg1: CGAffineTransform): Boolean {
    return CGAffineTransformEqualToTransform(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : CGPointApplyAffineTransform typedef CGPoint = Declared(CGPoint)(typedef CGPoint = Declared(CGPoint),typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGPointApplyAffineTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, CGPoint.layout, CGAffineTransform.layout)
private val CGPointApplyAffineTransform_ADDR: MemorySegment by lazy { LOOKUP.find("CGPointApplyAffineTransform").orElseThrow() }
private val CGPointApplyAffineTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPointApplyAffineTransform_ADDR, CGPointApplyAffineTransform_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPointApplyAffineTransform(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGPointApplyAffineTransform_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
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
fun CGPointApplyAffineTransform(allocator: SegmentAllocator, arg0: CGPoint, arg1: CGAffineTransform): CGPoint {
    return CGPoint(CGPointApplyAffineTransform(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : CGSizeApplyAffineTransform typedef CGSize = Declared(CGSize)(typedef CGSize = Declared(CGSize),typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGSizeApplyAffineTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(CGSize.layout, CGSize.layout, CGAffineTransform.layout)
private val CGSizeApplyAffineTransform_ADDR: MemorySegment by lazy { LOOKUP.find("CGSizeApplyAffineTransform").orElseThrow() }
private val CGSizeApplyAffineTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGSizeApplyAffineTransform_ADDR, CGSizeApplyAffineTransform_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGSizeApplyAffineTransform(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGSizeApplyAffineTransform_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
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
fun CGSizeApplyAffineTransform(allocator: SegmentAllocator, arg0: CGSize, arg1: CGAffineTransform): CGSize {
    return CGSize(CGSizeApplyAffineTransform(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : CGRectApplyAffineTransform typedef CGRect = Declared(CGRect)(typedef CGRect = Declared(CGRect),typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGRectApplyAffineTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, CGAffineTransform.layout)
private val CGRectApplyAffineTransform_ADDR: MemorySegment by lazy { LOOKUP.find("CGRectApplyAffineTransform").orElseThrow() }
private val CGRectApplyAffineTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGRectApplyAffineTransform_ADDR, CGRectApplyAffineTransform_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGRectApplyAffineTransform(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGRectApplyAffineTransform_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
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
fun CGRectApplyAffineTransform(allocator: SegmentAllocator, arg0: CGRect, arg1: CGAffineTransform): CGRect {
    return CGRect(CGRectApplyAffineTransform(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : CGAffineTransformDecompose typedef CGAffineTransformComponents = Declared(CGAffineTransformComponents)(typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGAffineTransformDecompose_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransformComponents.layout, CGAffineTransform.layout)
private val CGAffineTransformDecompose_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformDecompose").orElseThrow() }
private val CGAffineTransformDecompose_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformDecompose_ADDR, CGAffineTransformDecompose_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformDecompose(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGAffineTransformDecompose_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformDecompose(allocator: SegmentAllocator, arg0: CGAffineTransform): MemorySegment {
    return CGAffineTransformDecompose(allocator, arg0.segment)
}

/**
 * {@snippet lang=c : CGAffineTransformMakeWithComponents typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGAffineTransformComponents = Declared(CGAffineTransformComponents))
 */
private val CGAffineTransformMakeWithComponents_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, CGAffineTransformComponents.layout)
private val CGAffineTransformMakeWithComponents_ADDR: MemorySegment by lazy { LOOKUP.find("CGAffineTransformMakeWithComponents").orElseThrow() }
private val CGAffineTransformMakeWithComponents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGAffineTransformMakeWithComponents_ADDR, CGAffineTransformMakeWithComponents_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformMakeWithComponents(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGAffineTransformMakeWithComponents_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGAffineTransformMakeWithComponentsTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGAffineTransform {
    return CGAffineTransform(CGAffineTransformMakeWithComponents(allocator, arg0))
}

/**
 * {@snippet lang=c : NSAppleScriptErrorMessage (Void)*
 */
private val NSAppleScriptErrorMessage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppleScriptErrorMessage_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAppleScriptErrorMessage").orElseThrow().reinterpret(NSAppleScriptErrorMessage_LAYOUT.byteSize()) }
private val NSAppleScriptErrorMessage_VH: VarHandle by lazy { NSAppleScriptErrorMessage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSAppleScriptErrorMessage: MemorySegment
    get() = NSAppleScriptErrorMessage_VH.get(NSAppleScriptErrorMessage_SEGMENT, 0L) as MemorySegment
    set(value) = NSAppleScriptErrorMessage_VH.set(NSAppleScriptErrorMessage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAppleScriptErrorNumber (Void)*
 */
private val NSAppleScriptErrorNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppleScriptErrorNumber_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAppleScriptErrorNumber").orElseThrow().reinterpret(NSAppleScriptErrorNumber_LAYOUT.byteSize()) }
private val NSAppleScriptErrorNumber_VH: VarHandle by lazy { NSAppleScriptErrorNumber_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSAppleScriptErrorNumber: MemorySegment
    get() = NSAppleScriptErrorNumber_VH.get(NSAppleScriptErrorNumber_SEGMENT, 0L) as MemorySegment
    set(value) = NSAppleScriptErrorNumber_VH.set(NSAppleScriptErrorNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAppleScriptErrorAppName (Void)*
 */
private val NSAppleScriptErrorAppName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppleScriptErrorAppName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAppleScriptErrorAppName").orElseThrow().reinterpret(NSAppleScriptErrorAppName_LAYOUT.byteSize()) }
private val NSAppleScriptErrorAppName_VH: VarHandle by lazy { NSAppleScriptErrorAppName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSAppleScriptErrorAppName: MemorySegment
    get() = NSAppleScriptErrorAppName_VH.get(NSAppleScriptErrorAppName_SEGMENT, 0L) as MemorySegment
    set(value) = NSAppleScriptErrorAppName_VH.set(NSAppleScriptErrorAppName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAppleScriptErrorBriefMessage (Void)*
 */
private val NSAppleScriptErrorBriefMessage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppleScriptErrorBriefMessage_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAppleScriptErrorBriefMessage").orElseThrow().reinterpret(NSAppleScriptErrorBriefMessage_LAYOUT.byteSize()) }
private val NSAppleScriptErrorBriefMessage_VH: VarHandle by lazy { NSAppleScriptErrorBriefMessage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSAppleScriptErrorBriefMessage: MemorySegment
    get() = NSAppleScriptErrorBriefMessage_VH.get(NSAppleScriptErrorBriefMessage_SEGMENT, 0L) as MemorySegment
    set(value) = NSAppleScriptErrorBriefMessage_VH.set(NSAppleScriptErrorBriefMessage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAppleScriptErrorRange (Void)*
 */
private val NSAppleScriptErrorRange_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppleScriptErrorRange_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAppleScriptErrorRange").orElseThrow().reinterpret(NSAppleScriptErrorRange_LAYOUT.byteSize()) }
private val NSAppleScriptErrorRange_VH: VarHandle by lazy { NSAppleScriptErrorRange_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSAppleScriptErrorRange: MemorySegment
    get() = NSAppleScriptErrorRange_VH.get(NSAppleScriptErrorRange_SEGMENT, 0L) as MemorySegment
    set(value) = NSAppleScriptErrorRange_VH.set(NSAppleScriptErrorRange_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSConnectionReplyMode (Void)*
 */
private val NSConnectionReplyMode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSConnectionReplyMode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSConnectionReplyMode").orElseThrow().reinterpret(NSConnectionReplyMode_LAYOUT.byteSize()) }
private val NSConnectionReplyMode_VH: VarHandle by lazy { NSConnectionReplyMode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
var NSConnectionReplyMode: MemorySegment
    get() = NSConnectionReplyMode_VH.get(NSConnectionReplyMode_SEGMENT, 0L) as MemorySegment
    set(value) = NSConnectionReplyMode_VH.set(NSConnectionReplyMode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSConnectionDidDieNotification (Void)*
 */
private val NSConnectionDidDieNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSConnectionDidDieNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSConnectionDidDieNotification").orElseThrow().reinterpret(NSConnectionDidDieNotification_LAYOUT.byteSize()) }
private val NSConnectionDidDieNotification_VH: VarHandle by lazy { NSConnectionDidDieNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
var NSConnectionDidDieNotification: MemorySegment
    get() = NSConnectionDidDieNotification_VH.get(NSConnectionDidDieNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSConnectionDidDieNotification_VH.set(NSConnectionDidDieNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFailedAuthenticationException (Void)*
 */
private val NSFailedAuthenticationException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFailedAuthenticationException_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSFailedAuthenticationException").orElseThrow().reinterpret(NSFailedAuthenticationException_LAYOUT.byteSize()) }
private val NSFailedAuthenticationException_VH: VarHandle by lazy { NSFailedAuthenticationException_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
var NSFailedAuthenticationException: MemorySegment
    get() = NSFailedAuthenticationException_VH.get(NSFailedAuthenticationException_SEGMENT, 0L) as MemorySegment
    set(value) = NSFailedAuthenticationException_VH.set(NSFailedAuthenticationException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSConnectionDidInitializeNotification (Void)*
 */
private val NSConnectionDidInitializeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSConnectionDidInitializeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSConnectionDidInitializeNotification").orElseThrow().reinterpret(NSConnectionDidInitializeNotification_LAYOUT.byteSize()) }
private val NSConnectionDidInitializeNotification_VH: VarHandle by lazy { NSConnectionDidInitializeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
var NSConnectionDidInitializeNotification: MemorySegment
    get() = NSConnectionDidInitializeNotification_VH.get(NSConnectionDidInitializeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSConnectionDidInitializeNotification_VH.set(NSConnectionDidInitializeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocalNotificationCenterType typedef const NSDistributedNotificationCenterType = (Void)*
 */
private val NSLocalNotificationCenterType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocalNotificationCenterType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLocalNotificationCenterType").orElseThrow().reinterpret(NSLocalNotificationCenterType_LAYOUT.byteSize()) }
private val NSLocalNotificationCenterType_VH: VarHandle by lazy { NSLocalNotificationCenterType_LAYOUT.varHandle() }

var NSLocalNotificationCenterType: MemorySegment
    get() = NSLocalNotificationCenterType_VH.get(NSLocalNotificationCenterType_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocalNotificationCenterType_VH.set(NSLocalNotificationCenterType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTaskDidTerminateNotification typedef const NSNotificationName = (Void)*
 */
private val NSTaskDidTerminateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTaskDidTerminateNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTaskDidTerminateNotification").orElseThrow().reinterpret(NSTaskDidTerminateNotification_LAYOUT.byteSize()) }
private val NSTaskDidTerminateNotification_VH: VarHandle by lazy { NSTaskDidTerminateNotification_LAYOUT.varHandle() }

var NSTaskDidTerminateNotification: MemorySegment
    get() = NSTaskDidTerminateNotification_VH.get(NSTaskDidTerminateNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTaskDidTerminateNotification_VH.set(NSTaskDidTerminateNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAppleEventTimeOutDefault Double
 */
private val NSAppleEventTimeOutDefault_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSAppleEventTimeOutDefault_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAppleEventTimeOutDefault").orElseThrow().reinterpret(NSAppleEventTimeOutDefault_LAYOUT.byteSize()) }
private val NSAppleEventTimeOutDefault_VH: VarHandle by lazy { NSAppleEventTimeOutDefault_LAYOUT.varHandle() }

var NSAppleEventTimeOutDefault: Double
    get() = NSAppleEventTimeOutDefault_VH.get(NSAppleEventTimeOutDefault_SEGMENT, 0L) as Double
    set(value) = NSAppleEventTimeOutDefault_VH.set(NSAppleEventTimeOutDefault_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAppleEventTimeOutNone Double
 */
private val NSAppleEventTimeOutNone_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSAppleEventTimeOutNone_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAppleEventTimeOutNone").orElseThrow().reinterpret(NSAppleEventTimeOutNone_LAYOUT.byteSize()) }
private val NSAppleEventTimeOutNone_VH: VarHandle by lazy { NSAppleEventTimeOutNone_LAYOUT.varHandle() }

var NSAppleEventTimeOutNone: Double
    get() = NSAppleEventTimeOutNone_VH.get(NSAppleEventTimeOutNone_SEGMENT, 0L) as Double
    set(value) = NSAppleEventTimeOutNone_VH.set(NSAppleEventTimeOutNone_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAppleEventManagerWillProcessFirstEventNotification typedef const NSNotificationName = (Void)*
 */
private val NSAppleEventManagerWillProcessFirstEventNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppleEventManagerWillProcessFirstEventNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAppleEventManagerWillProcessFirstEventNotification").orElseThrow().reinterpret(NSAppleEventManagerWillProcessFirstEventNotification_LAYOUT.byteSize()) }
private val NSAppleEventManagerWillProcessFirstEventNotification_VH: VarHandle by lazy { NSAppleEventManagerWillProcessFirstEventNotification_LAYOUT.varHandle() }

var NSAppleEventManagerWillProcessFirstEventNotification: MemorySegment
    get() = NSAppleEventManagerWillProcessFirstEventNotification_VH.get(NSAppleEventManagerWillProcessFirstEventNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAppleEventManagerWillProcessFirstEventNotification_VH.set(NSAppleEventManagerWillProcessFirstEventNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSClassDescriptionNeededForClassNotification typedef const NSNotificationName = (Void)*
 */
private val NSClassDescriptionNeededForClassNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSClassDescriptionNeededForClassNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSClassDescriptionNeededForClassNotification").orElseThrow().reinterpret(NSClassDescriptionNeededForClassNotification_LAYOUT.byteSize()) }
private val NSClassDescriptionNeededForClassNotification_VH: VarHandle by lazy { NSClassDescriptionNeededForClassNotification_LAYOUT.varHandle() }

var NSClassDescriptionNeededForClassNotification: MemorySegment
    get() = NSClassDescriptionNeededForClassNotification_VH.get(NSClassDescriptionNeededForClassNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSClassDescriptionNeededForClassNotification_VH.set(NSClassDescriptionNeededForClassNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeForHFSTypeCode typedef NSString = (Void)*(typedef OSType = UNSIGNED = Int)
 */
private val NSFileTypeForHFSTypeCode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val NSFileTypeForHFSTypeCode_ADDR: MemorySegment by lazy { LOOKUP.find("NSFileTypeForHFSTypeCode").orElseThrow() }
private val NSFileTypeForHFSTypeCode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSFileTypeForHFSTypeCode_ADDR, NSFileTypeForHFSTypeCode_DESC) }

fun NSFileTypeForHFSTypeCode(arg0: Int): MemorySegment {
    try {
        return NSFileTypeForHFSTypeCode_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHFSTypeCodeFromFileType typedef OSType = UNSIGNED = Int((Void)*)
 */
private val NSHFSTypeCodeFromFileType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val NSHFSTypeCodeFromFileType_ADDR: MemorySegment by lazy { LOOKUP.find("NSHFSTypeCodeFromFileType").orElseThrow() }
private val NSHFSTypeCodeFromFileType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHFSTypeCodeFromFileType_ADDR, NSHFSTypeCodeFromFileType_DESC) }

fun NSHFSTypeCodeFromFileType(arg0: MemorySegment): Int {
    try {
        return NSHFSTypeCodeFromFileType_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHFSTypeOfFile typedef NSString = (Void)*((Void)*)
 */
private val NSHFSTypeOfFile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSHFSTypeOfFile_ADDR: MemorySegment by lazy { LOOKUP.find("NSHFSTypeOfFile").orElseThrow() }
private val NSHFSTypeOfFile_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHFSTypeOfFile_ADDR, NSHFSTypeOfFile_DESC) }

fun NSHFSTypeOfFile(arg0: MemorySegment): MemorySegment {
    try {
        return NSHFSTypeOfFile_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSOperationNotSupportedForKeyException (Void)*
 */
private val NSOperationNotSupportedForKeyException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOperationNotSupportedForKeyException_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSOperationNotSupportedForKeyException").orElseThrow().reinterpret(NSOperationNotSupportedForKeyException_LAYOUT.byteSize()) }
private val NSOperationNotSupportedForKeyException_VH: VarHandle by lazy { NSOperationNotSupportedForKeyException_LAYOUT.varHandle() }

var NSOperationNotSupportedForKeyException: MemorySegment
    get() = NSOperationNotSupportedForKeyException_VH.get(NSOperationNotSupportedForKeyException_SEGMENT, 0L) as MemorySegment
    set(value) = NSOperationNotSupportedForKeyException_VH.set(NSOperationNotSupportedForKeyException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSGrammarRange (Void)*
 */
private val NSGrammarRange_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGrammarRange_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSGrammarRange").orElseThrow().reinterpret(NSGrammarRange_LAYOUT.byteSize()) }
private val NSGrammarRange_VH: VarHandle by lazy { NSGrammarRange_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSGrammarRange: MemorySegment
    get() = NSGrammarRange_VH.get(NSGrammarRange_SEGMENT, 0L) as MemorySegment
    set(value) = NSGrammarRange_VH.set(NSGrammarRange_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSGrammarUserDescription (Void)*
 */
private val NSGrammarUserDescription_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGrammarUserDescription_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSGrammarUserDescription").orElseThrow().reinterpret(NSGrammarUserDescription_LAYOUT.byteSize()) }
private val NSGrammarUserDescription_VH: VarHandle by lazy { NSGrammarUserDescription_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSGrammarUserDescription: MemorySegment
    get() = NSGrammarUserDescription_VH.get(NSGrammarUserDescription_SEGMENT, 0L) as MemorySegment
    set(value) = NSGrammarUserDescription_VH.set(NSGrammarUserDescription_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSGrammarCorrections (Void)*
 */
private val NSGrammarCorrections_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGrammarCorrections_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSGrammarCorrections").orElseThrow().reinterpret(NSGrammarCorrections_LAYOUT.byteSize()) }
private val NSGrammarCorrections_VH: VarHandle by lazy { NSGrammarCorrections_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSGrammarCorrections: MemorySegment
    get() = NSGrammarCorrections_VH.get(NSGrammarCorrections_SEGMENT, 0L) as MemorySegment
    set(value) = NSGrammarCorrections_VH.set(NSGrammarCorrections_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUserNotificationDefaultSoundName (Void)*
 */
private val NSUserNotificationDefaultSoundName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUserNotificationDefaultSoundName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUserNotificationDefaultSoundName").orElseThrow().reinterpret(NSUserNotificationDefaultSoundName_LAYOUT.byteSize()) }
private val NSUserNotificationDefaultSoundName_VH: VarHandle by lazy { NSUserNotificationDefaultSoundName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSUserNotificationDefaultSoundName: MemorySegment
    get() = NSUserNotificationDefaultSoundName_VH.get(NSUserNotificationDefaultSoundName_SEGMENT, 0L) as MemorySegment
    set(value) = NSUserNotificationDefaultSoundName_VH.set(NSUserNotificationDefaultSoundName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalibratedWhiteColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSCalibratedWhiteColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalibratedWhiteColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCalibratedWhiteColorSpace").orElseThrow().reinterpret(NSCalibratedWhiteColorSpace_LAYOUT.byteSize()) }
private val NSCalibratedWhiteColorSpace_VH: VarHandle by lazy { NSCalibratedWhiteColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSCalibratedWhiteColorSpace: MemorySegment
    get() = NSCalibratedWhiteColorSpace_VH.get(NSCalibratedWhiteColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalibratedWhiteColorSpace_VH.set(NSCalibratedWhiteColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalibratedRGBColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSCalibratedRGBColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalibratedRGBColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCalibratedRGBColorSpace").orElseThrow().reinterpret(NSCalibratedRGBColorSpace_LAYOUT.byteSize()) }
private val NSCalibratedRGBColorSpace_VH: VarHandle by lazy { NSCalibratedRGBColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSCalibratedRGBColorSpace: MemorySegment
    get() = NSCalibratedRGBColorSpace_VH.get(NSCalibratedRGBColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalibratedRGBColorSpace_VH.set(NSCalibratedRGBColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceWhiteColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSDeviceWhiteColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceWhiteColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceWhiteColorSpace").orElseThrow().reinterpret(NSDeviceWhiteColorSpace_LAYOUT.byteSize()) }
private val NSDeviceWhiteColorSpace_VH: VarHandle by lazy { NSDeviceWhiteColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceWhiteColorSpace: MemorySegment
    get() = NSDeviceWhiteColorSpace_VH.get(NSDeviceWhiteColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceWhiteColorSpace_VH.set(NSDeviceWhiteColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceRGBColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSDeviceRGBColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceRGBColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceRGBColorSpace").orElseThrow().reinterpret(NSDeviceRGBColorSpace_LAYOUT.byteSize()) }
private val NSDeviceRGBColorSpace_VH: VarHandle by lazy { NSDeviceRGBColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceRGBColorSpace: MemorySegment
    get() = NSDeviceRGBColorSpace_VH.get(NSDeviceRGBColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceRGBColorSpace_VH.set(NSDeviceRGBColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceCMYKColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSDeviceCMYKColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceCMYKColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceCMYKColorSpace").orElseThrow().reinterpret(NSDeviceCMYKColorSpace_LAYOUT.byteSize()) }
private val NSDeviceCMYKColorSpace_VH: VarHandle by lazy { NSDeviceCMYKColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceCMYKColorSpace: MemorySegment
    get() = NSDeviceCMYKColorSpace_VH.get(NSDeviceCMYKColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceCMYKColorSpace_VH.set(NSDeviceCMYKColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSNamedColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSNamedColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNamedColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSNamedColorSpace").orElseThrow().reinterpret(NSNamedColorSpace_LAYOUT.byteSize()) }
private val NSNamedColorSpace_VH: VarHandle by lazy { NSNamedColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSNamedColorSpace: MemorySegment
    get() = NSNamedColorSpace_VH.get(NSNamedColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSNamedColorSpace_VH.set(NSNamedColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPatternColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSPatternColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPatternColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPatternColorSpace").orElseThrow().reinterpret(NSPatternColorSpace_LAYOUT.byteSize()) }
private val NSPatternColorSpace_VH: VarHandle by lazy { NSPatternColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSPatternColorSpace: MemorySegment
    get() = NSPatternColorSpace_VH.get(NSPatternColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSPatternColorSpace_VH.set(NSPatternColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCustomColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSCustomColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCustomColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCustomColorSpace").orElseThrow().reinterpret(NSCustomColorSpace_LAYOUT.byteSize()) }
private val NSCustomColorSpace_VH: VarHandle by lazy { NSCustomColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSCustomColorSpace: MemorySegment
    get() = NSCustomColorSpace_VH.get(NSCustomColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSCustomColorSpace_VH.set(NSCustomColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalibratedBlackColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSCalibratedBlackColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalibratedBlackColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCalibratedBlackColorSpace").orElseThrow().reinterpret(NSCalibratedBlackColorSpace_LAYOUT.byteSize()) }
private val NSCalibratedBlackColorSpace_VH: VarHandle by lazy { NSCalibratedBlackColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
var NSCalibratedBlackColorSpace: MemorySegment
    get() = NSCalibratedBlackColorSpace_VH.get(NSCalibratedBlackColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalibratedBlackColorSpace_VH.set(NSCalibratedBlackColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceBlackColorSpace typedef NSColorSpaceName = typedef NSString = (Void)*
 */
private val NSDeviceBlackColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceBlackColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceBlackColorSpace").orElseThrow().reinterpret(NSDeviceBlackColorSpace_LAYOUT.byteSize()) }
private val NSDeviceBlackColorSpace_VH: VarHandle by lazy { NSDeviceBlackColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
var NSDeviceBlackColorSpace: MemorySegment
    get() = NSDeviceBlackColorSpace_VH.get(NSDeviceBlackColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceBlackColorSpace_VH.set(NSDeviceBlackColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBestDepth typedef NSWindowDepth = Declared(NSWindowDepth)(typedef NSColorSpaceName = typedef NSString = (Void)*,typedef NSInteger = Long,typedef NSInteger = Long,typedef BOOL = Bool,(typedef BOOL = Bool)*)
 */
private val NSBestDepth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val NSBestDepth_ADDR: MemorySegment by lazy { LOOKUP.find("NSBestDepth").orElseThrow() }
private val NSBestDepth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSBestDepth_ADDR, NSBestDepth_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSBestDepth(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Boolean, arg4: MemorySegment): NSWindowDepth {
    try {
        return NSWindowDepth((NSBestDepth_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSPlanarFromDepth typedef BOOL = Bool(typedef NSWindowDepth = Declared(NSWindowDepth))
 */
private val NSPlanarFromDepth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT)
private val NSPlanarFromDepth_ADDR: MemorySegment by lazy { LOOKUP.find("NSPlanarFromDepth").orElseThrow() }
private val NSPlanarFromDepth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSPlanarFromDepth_ADDR, NSPlanarFromDepth_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSPlanarFromDepth(arg0: NSWindowDepth): Boolean {
    try {
        return NSPlanarFromDepth_HANDLE.invokeExact(arg0.rawValue.toInt()) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSColorSpaceFromDepth typedef NSColorSpaceName = typedef NSString = (Void)*(typedef NSWindowDepth = Declared(NSWindowDepth))
 */
private val NSColorSpaceFromDepth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val NSColorSpaceFromDepth_ADDR: MemorySegment by lazy { LOOKUP.find("NSColorSpaceFromDepth").orElseThrow() }
private val NSColorSpaceFromDepth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSColorSpaceFromDepth_ADDR, NSColorSpaceFromDepth_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSColorSpaceFromDepth(arg0: NSWindowDepth): MemorySegment {
    try {
        return NSColorSpaceFromDepth_HANDLE.invokeExact(arg0.rawValue.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSBitsPerSampleFromDepth typedef NSInteger = Long(typedef NSWindowDepth = Declared(NSWindowDepth))
 */
private val NSBitsPerSampleFromDepth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val NSBitsPerSampleFromDepth_ADDR: MemorySegment by lazy { LOOKUP.find("NSBitsPerSampleFromDepth").orElseThrow() }
private val NSBitsPerSampleFromDepth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSBitsPerSampleFromDepth_ADDR, NSBitsPerSampleFromDepth_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSBitsPerSampleFromDepth(arg0: NSWindowDepth): Long {
    try {
        return NSBitsPerSampleFromDepth_HANDLE.invokeExact(arg0.rawValue.toInt()) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSBitsPerPixelFromDepth typedef NSInteger = Long(typedef NSWindowDepth = Declared(NSWindowDepth))
 */
private val NSBitsPerPixelFromDepth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val NSBitsPerPixelFromDepth_ADDR: MemorySegment by lazy { LOOKUP.find("NSBitsPerPixelFromDepth").orElseThrow() }
private val NSBitsPerPixelFromDepth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSBitsPerPixelFromDepth_ADDR, NSBitsPerPixelFromDepth_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSBitsPerPixelFromDepth(arg0: NSWindowDepth): Long {
    try {
        return NSBitsPerPixelFromDepth_HANDLE.invokeExact(arg0.rawValue.toInt()) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSNumberOfColorComponents typedef NSInteger = Long(typedef NSColorSpaceName = typedef NSString = (Void)*)
 */
private val NSNumberOfColorComponents_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSNumberOfColorComponents_ADDR: MemorySegment by lazy { LOOKUP.find("NSNumberOfColorComponents").orElseThrow() }
private val NSNumberOfColorComponents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSNumberOfColorComponents_ADDR, NSNumberOfColorComponents_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSNumberOfColorComponents(arg0: MemorySegment): Long {
    try {
        return NSNumberOfColorComponents_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAvailableWindowDepths (typedef NSWindowDepth = Declared(NSWindowDepth))*()
 */
private val NSAvailableWindowDepths_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val NSAvailableWindowDepths_ADDR: MemorySegment by lazy { LOOKUP.find("NSAvailableWindowDepths").orElseThrow() }
private val NSAvailableWindowDepths_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSAvailableWindowDepths_ADDR, NSAvailableWindowDepths_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAvailableWindowDepths(): MemorySegment {
    try {
        return NSAvailableWindowDepths_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSWhite typedef const CGFloat = Double
 */
private val NSWhite_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSWhite_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSWhite").orElseThrow().reinterpret(NSWhite_LAYOUT.byteSize()) }
private val NSWhite_VH: VarHandle by lazy { NSWhite_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWhite: Double
    get() = NSWhite_VH.get(NSWhite_SEGMENT, 0L) as Double
    set(value) = NSWhite_VH.set(NSWhite_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLightGray typedef const CGFloat = Double
 */
private val NSLightGray_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSLightGray_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLightGray").orElseThrow().reinterpret(NSLightGray_LAYOUT.byteSize()) }
private val NSLightGray_VH: VarHandle by lazy { NSLightGray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSLightGray: Double
    get() = NSLightGray_VH.get(NSLightGray_SEGMENT, 0L) as Double
    set(value) = NSLightGray_VH.set(NSLightGray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDarkGray typedef const CGFloat = Double
 */
private val NSDarkGray_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSDarkGray_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDarkGray").orElseThrow().reinterpret(NSDarkGray_LAYOUT.byteSize()) }
private val NSDarkGray_VH: VarHandle by lazy { NSDarkGray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDarkGray: Double
    get() = NSDarkGray_VH.get(NSDarkGray_SEGMENT, 0L) as Double
    set(value) = NSDarkGray_VH.set(NSDarkGray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBlack typedef const CGFloat = Double
 */
private val NSBlack_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSBlack_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSBlack").orElseThrow().reinterpret(NSBlack_LAYOUT.byteSize()) }
private val NSBlack_VH: VarHandle by lazy { NSBlack_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSBlack: Double
    get() = NSBlack_VH.get(NSBlack_SEGMENT, 0L) as Double
    set(value) = NSBlack_VH.set(NSBlack_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceResolution typedef NSDeviceDescriptionKey = typedef NSString = (Void)*
 */
private val NSDeviceResolution_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceResolution_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceResolution").orElseThrow().reinterpret(NSDeviceResolution_LAYOUT.byteSize()) }
private val NSDeviceResolution_VH: VarHandle by lazy { NSDeviceResolution_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceResolution: MemorySegment
    get() = NSDeviceResolution_VH.get(NSDeviceResolution_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceResolution_VH.set(NSDeviceResolution_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceColorSpaceName typedef NSDeviceDescriptionKey = typedef NSString = (Void)*
 */
private val NSDeviceColorSpaceName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceColorSpaceName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceColorSpaceName").orElseThrow().reinterpret(NSDeviceColorSpaceName_LAYOUT.byteSize()) }
private val NSDeviceColorSpaceName_VH: VarHandle by lazy { NSDeviceColorSpaceName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceColorSpaceName: MemorySegment
    get() = NSDeviceColorSpaceName_VH.get(NSDeviceColorSpaceName_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceColorSpaceName_VH.set(NSDeviceColorSpaceName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceBitsPerSample typedef NSDeviceDescriptionKey = typedef NSString = (Void)*
 */
private val NSDeviceBitsPerSample_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceBitsPerSample_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceBitsPerSample").orElseThrow().reinterpret(NSDeviceBitsPerSample_LAYOUT.byteSize()) }
private val NSDeviceBitsPerSample_VH: VarHandle by lazy { NSDeviceBitsPerSample_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceBitsPerSample: MemorySegment
    get() = NSDeviceBitsPerSample_VH.get(NSDeviceBitsPerSample_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceBitsPerSample_VH.set(NSDeviceBitsPerSample_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceIsScreen typedef NSDeviceDescriptionKey = typedef NSString = (Void)*
 */
private val NSDeviceIsScreen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceIsScreen_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceIsScreen").orElseThrow().reinterpret(NSDeviceIsScreen_LAYOUT.byteSize()) }
private val NSDeviceIsScreen_VH: VarHandle by lazy { NSDeviceIsScreen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceIsScreen: MemorySegment
    get() = NSDeviceIsScreen_VH.get(NSDeviceIsScreen_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceIsScreen_VH.set(NSDeviceIsScreen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceIsPrinter typedef NSDeviceDescriptionKey = typedef NSString = (Void)*
 */
private val NSDeviceIsPrinter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceIsPrinter_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceIsPrinter").orElseThrow().reinterpret(NSDeviceIsPrinter_LAYOUT.byteSize()) }
private val NSDeviceIsPrinter_VH: VarHandle by lazy { NSDeviceIsPrinter_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceIsPrinter: MemorySegment
    get() = NSDeviceIsPrinter_VH.get(NSDeviceIsPrinter_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceIsPrinter_VH.set(NSDeviceIsPrinter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDeviceSize typedef NSDeviceDescriptionKey = typedef NSString = (Void)*
 */
private val NSDeviceSize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeviceSize_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDeviceSize").orElseThrow().reinterpret(NSDeviceSize_LAYOUT.byteSize()) }
private val NSDeviceSize_VH: VarHandle by lazy { NSDeviceSize_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSDeviceSize: MemorySegment
    get() = NSDeviceSize_VH.get(NSDeviceSize_SEGMENT, 0L) as MemorySegment
    set(value) = NSDeviceSize_VH.set(NSDeviceSize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRectFill Void(typedef NSRect = Declared(CGRect))
 */
private val NSRectFill_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout)
private val NSRectFill_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectFill").orElseThrow() }
private val NSRectFill_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectFill_ADDR, NSRectFill_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFill(arg0: MemorySegment): Unit {
    try {
        NSRectFill_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFill(arg0: NSRect): Unit {
    NSRectFill(arg0.segment)
}

/**
 * {@snippet lang=c : NSRectFillList Void((typedef NSRect = Declared(CGRect))*,typedef NSInteger = Long)
 */
private val NSRectFillList_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSRectFillList_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectFillList").orElseThrow() }
private val NSRectFillList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectFillList_ADDR, NSRectFillList_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFillList(arg0: MemorySegment, arg1: Long): Unit {
    try {
        NSRectFillList_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRectFillListWithGrays Void((typedef NSRect = Declared(CGRect))*,(typedef CGFloat = Double)*,typedef NSInteger = Long)
 */
private val NSRectFillListWithGrays_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSRectFillListWithGrays_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectFillListWithGrays").orElseThrow() }
private val NSRectFillListWithGrays_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectFillListWithGrays_ADDR, NSRectFillListWithGrays_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFillListWithGrays(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        NSRectFillListWithGrays_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRectFillListWithColors Void((typedef NSRect = Declared(CGRect))*,((Void)*)*,typedef NSInteger = Long)
 */
private val NSRectFillListWithColors_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSRectFillListWithColors_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectFillListWithColors").orElseThrow() }
private val NSRectFillListWithColors_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectFillListWithColors_ADDR, NSRectFillListWithColors_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFillListWithColors(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        NSRectFillListWithColors_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRectFillUsingOperation Void(typedef NSRect = Declared(CGRect),typedef NSCompositingOperation = Declared(NSCompositingOperation))
 */
private val NSRectFillUsingOperation_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, ValueLayout.JAVA_LONG)
private val NSRectFillUsingOperation_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectFillUsingOperation").orElseThrow() }
private val NSRectFillUsingOperation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectFillUsingOperation_ADDR, NSRectFillUsingOperation_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFillUsingOperation(arg0: MemorySegment, arg1: NSCompositingOperation): Unit {
    try {
        NSRectFillUsingOperation_HANDLE.invokeExact(arg0, arg1.rawValue)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFillUsingOperation(arg0: NSRect, arg1: NSCompositingOperation): Unit {
    NSRectFillUsingOperation(arg0.segment, arg1)
}

/**
 * {@snippet lang=c : NSRectFillListUsingOperation Void((typedef NSRect = Declared(CGRect))*,typedef NSInteger = Long,typedef NSCompositingOperation = Declared(NSCompositingOperation))
 */
private val NSRectFillListUsingOperation_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSRectFillListUsingOperation_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectFillListUsingOperation").orElseThrow() }
private val NSRectFillListUsingOperation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectFillListUsingOperation_ADDR, NSRectFillListUsingOperation_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFillListUsingOperation(arg0: MemorySegment, arg1: Long, arg2: NSCompositingOperation): Unit {
    try {
        NSRectFillListUsingOperation_HANDLE.invokeExact(arg0, arg1, arg2.rawValue)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRectFillListWithColorsUsingOperation Void((typedef NSRect = Declared(CGRect))*,((Void)*)*,typedef NSInteger = Long,typedef NSCompositingOperation = Declared(NSCompositingOperation))
 */
private val NSRectFillListWithColorsUsingOperation_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSRectFillListWithColorsUsingOperation_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectFillListWithColorsUsingOperation").orElseThrow() }
private val NSRectFillListWithColorsUsingOperation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectFillListWithColorsUsingOperation_ADDR, NSRectFillListWithColorsUsingOperation_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectFillListWithColorsUsingOperation(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: NSCompositingOperation): Unit {
    try {
        NSRectFillListWithColorsUsingOperation_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSFrameRect Void(typedef NSRect = Declared(CGRect))
 */
private val NSFrameRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout)
private val NSFrameRect_ADDR: MemorySegment by lazy { LOOKUP.find("NSFrameRect").orElseThrow() }
private val NSFrameRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSFrameRect_ADDR, NSFrameRect_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFrameRect(arg0: MemorySegment): Unit {
    try {
        NSFrameRect_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFrameRect(arg0: NSRect): Unit {
    NSFrameRect(arg0.segment)
}

/**
 * {@snippet lang=c : NSFrameRectWithWidth Void(typedef NSRect = Declared(CGRect),typedef CGFloat = Double)
 */
private val NSFrameRectWithWidth_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, ValueLayout.JAVA_DOUBLE)
private val NSFrameRectWithWidth_ADDR: MemorySegment by lazy { LOOKUP.find("NSFrameRectWithWidth").orElseThrow() }
private val NSFrameRectWithWidth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSFrameRectWithWidth_ADDR, NSFrameRectWithWidth_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFrameRectWithWidth(arg0: MemorySegment, arg1: Double): Unit {
    try {
        NSFrameRectWithWidth_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFrameRectWithWidth(arg0: NSRect, arg1: Double): Unit {
    NSFrameRectWithWidth(arg0.segment, arg1)
}

/**
 * {@snippet lang=c : NSFrameRectWithWidthUsingOperation Void(typedef NSRect = Declared(CGRect),typedef CGFloat = Double,typedef NSCompositingOperation = Declared(NSCompositingOperation))
 */
private val NSFrameRectWithWidthUsingOperation_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG)
private val NSFrameRectWithWidthUsingOperation_ADDR: MemorySegment by lazy { LOOKUP.find("NSFrameRectWithWidthUsingOperation").orElseThrow() }
private val NSFrameRectWithWidthUsingOperation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSFrameRectWithWidthUsingOperation_ADDR, NSFrameRectWithWidthUsingOperation_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFrameRectWithWidthUsingOperation(arg0: MemorySegment, arg1: Double, arg2: NSCompositingOperation): Unit {
    try {
        NSFrameRectWithWidthUsingOperation_HANDLE.invokeExact(arg0, arg1, arg2.rawValue)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFrameRectWithWidthUsingOperation(arg0: NSRect, arg1: Double, arg2: NSCompositingOperation): Unit {
    NSFrameRectWithWidthUsingOperation(arg0.segment, arg1, arg2)
}

/**
 * {@snippet lang=c : NSRectClip Void(typedef NSRect = Declared(CGRect))
 */
private val NSRectClip_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout)
private val NSRectClip_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectClip").orElseThrow() }
private val NSRectClip_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectClip_ADDR, NSRectClip_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectClip(arg0: MemorySegment): Unit {
    try {
        NSRectClip_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectClip(arg0: NSRect): Unit {
    NSRectClip(arg0.segment)
}

/**
 * {@snippet lang=c : NSRectClipList Void((typedef NSRect = Declared(CGRect))*,typedef NSInteger = Long)
 */
private val NSRectClipList_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSRectClipList_ADDR: MemorySegment by lazy { LOOKUP.find("NSRectClipList").orElseThrow() }
private val NSRectClipList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRectClipList_ADDR, NSRectClipList_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSRectClipList(arg0: MemorySegment, arg1: Long): Unit {
    try {
        NSRectClipList_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDrawTiledRects typedef NSRect = Declared(CGRect)(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect),(typedef NSRectEdge = Declared(NSRectEdge))*,(typedef CGFloat = Double)*,typedef NSInteger = Long)
 */
private val NSDrawTiledRects_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, CGRect.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSDrawTiledRects_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawTiledRects").orElseThrow() }
private val NSDrawTiledRects_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawTiledRects_ADDR, NSDrawTiledRects_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawTiledRects(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: Long): MemorySegment {
    try {
        return NSDrawTiledRects_HANDLE.invokeExact(allocator, arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawTiledRects(allocator: SegmentAllocator, arg0: NSRect, arg1: NSRect, arg2: MemorySegment, arg3: MemorySegment, arg4: Long): NSRect {
    return NSRect(NSDrawTiledRects(allocator, arg0.segment, arg1.segment, arg2, arg3, arg4))
}

/**
 * {@snippet lang=c : NSDrawGrayBezel Void(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSDrawGrayBezel_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, CGRect.layout)
private val NSDrawGrayBezel_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawGrayBezel").orElseThrow() }
private val NSDrawGrayBezel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawGrayBezel_ADDR, NSDrawGrayBezel_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawGrayBezel(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSDrawGrayBezel_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawGrayBezel(arg0: NSRect, arg1: NSRect): Unit {
    NSDrawGrayBezel(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSDrawGroove Void(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSDrawGroove_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, CGRect.layout)
private val NSDrawGroove_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawGroove").orElseThrow() }
private val NSDrawGroove_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawGroove_ADDR, NSDrawGroove_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawGroove(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSDrawGroove_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawGroove(arg0: NSRect, arg1: NSRect): Unit {
    NSDrawGroove(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSDrawWhiteBezel Void(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSDrawWhiteBezel_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, CGRect.layout)
private val NSDrawWhiteBezel_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawWhiteBezel").orElseThrow() }
private val NSDrawWhiteBezel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawWhiteBezel_ADDR, NSDrawWhiteBezel_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawWhiteBezel(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSDrawWhiteBezel_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawWhiteBezel(arg0: NSRect, arg1: NSRect): Unit {
    NSDrawWhiteBezel(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSDrawButton Void(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSDrawButton_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, CGRect.layout)
private val NSDrawButton_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawButton").orElseThrow() }
private val NSDrawButton_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawButton_ADDR, NSDrawButton_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawButton(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSDrawButton_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawButton(arg0: NSRect, arg1: NSRect): Unit {
    NSDrawButton(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSEraseRect Void(typedef NSRect = Declared(CGRect))
 */
private val NSEraseRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout)
private val NSEraseRect_ADDR: MemorySegment by lazy { LOOKUP.find("NSEraseRect").orElseThrow() }
private val NSEraseRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEraseRect_ADDR, NSEraseRect_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSEraseRect(arg0: MemorySegment): Unit {
    try {
        NSEraseRect_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSEraseRect(arg0: NSRect): Unit {
    NSEraseRect(arg0.segment)
}

/**
 * {@snippet lang=c : NSReadPixel typedef NSColor = (Void)*(typedef NSPoint = Declared(CGPoint))
 */
private val NSReadPixel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGPoint.layout)
private val NSReadPixel_ADDR: MemorySegment by lazy { LOOKUP.find("NSReadPixel").orElseThrow() }
private val NSReadPixel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSReadPixel_ADDR, NSReadPixel_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -[NSBitmapImageRep colorAtX:y:] to interrogate pixel values.  If necessary, use -[NSView cacheDisplayInRect:toBitmapImageRep:] to snapshot a view hierarchy into an NSBitmapImageRep.")
fun NSReadPixel(arg0: MemorySegment): MemorySegment {
    try {
        return NSReadPixel_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -[NSBitmapImageRep colorAtX:y:] to interrogate pixel values.  If necessary, use -[NSView cacheDisplayInRect:toBitmapImageRep:] to snapshot a view hierarchy into an NSBitmapImageRep.")
fun NSReadPixel(arg0: NSPoint): MemorySegment {
    return NSReadPixel(arg0.segment)
}

/**
 * {@snippet lang=c : NSDrawBitmap Void(typedef NSRect = Declared(CGRect),typedef NSInteger = Long,typedef NSInteger = Long,typedef NSInteger = Long,typedef NSInteger = Long,typedef NSInteger = Long,typedef NSInteger = Long,typedef BOOL = Bool,typedef BOOL = Bool,typedef NSColorSpaceName = typedef NSString = (Void)*,((UNSIGNED = Char)*)*)
 */
private val NSDrawBitmap_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSDrawBitmap_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawBitmap").orElseThrow() }
private val NSDrawBitmap_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawBitmap_ADDR, NSDrawBitmap_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawBitmap(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Long, arg6: Long, arg7: Boolean, arg8: Boolean, arg9: MemorySegment, arg10: MemorySegment): Unit {
    try {
        NSDrawBitmap_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawBitmap(arg0: NSRect, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Long, arg6: Long, arg7: Boolean, arg8: Boolean, arg9: MemorySegment, arg10: MemorySegment): Unit {
    NSDrawBitmap(arg0.segment, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
}

/**
 * {@snippet lang=c : NSHighlightRect Void(typedef NSRect = Declared(CGRect))
 */
private val NSHighlightRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout)
private val NSHighlightRect_ADDR: MemorySegment by lazy { LOOKUP.find("NSHighlightRect").orElseThrow() }
private val NSHighlightRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHighlightRect_ADDR, NSHighlightRect_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSHighlightRect(arg0: MemorySegment): Unit {
    try {
        NSHighlightRect_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSHighlightRect(arg0: NSRect): Unit {
    NSHighlightRect(arg0.segment)
}

/**
 * {@snippet lang=c : NSBeep Void()
 */
private val NSBeep_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val NSBeep_ADDR: MemorySegment by lazy { LOOKUP.find("NSBeep").orElseThrow() }
private val NSBeep_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSBeep_ADDR, NSBeep_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSBeep(): Unit {
    try {
        NSBeep_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSGetWindowServerMemory typedef NSInteger = Long(typedef NSInteger = Long,(typedef NSInteger = Long)*,(typedef NSInteger = Long)*,(typedef NSString = (Void)*)*)
 */
private val NSGetWindowServerMemory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSGetWindowServerMemory_ADDR: MemorySegment by lazy { LOOKUP.find("NSGetWindowServerMemory").orElseThrow() }
private val NSGetWindowServerMemory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSGetWindowServerMemory_ADDR, NSGetWindowServerMemory_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Doesn't return anything useful since 10.0")
fun NSGetWindowServerMemory(arg0: Long, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Long {
    try {
        return NSGetWindowServerMemory_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDrawColorTiledRects typedef NSRect = Declared(CGRect)(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect),(typedef NSRectEdge = Declared(NSRectEdge))*,(typedef NSColor = (Void)*)*,typedef NSInteger = Long)
 */
private val NSDrawColorTiledRects_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, CGRect.layout, CGRect.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSDrawColorTiledRects_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawColorTiledRects").orElseThrow() }
private val NSDrawColorTiledRects_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawColorTiledRects_ADDR, NSDrawColorTiledRects_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawColorTiledRects(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: Long): MemorySegment {
    try {
        return NSDrawColorTiledRects_HANDLE.invokeExact(allocator, arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawColorTiledRects(allocator: SegmentAllocator, arg0: NSRect, arg1: NSRect, arg2: MemorySegment, arg3: MemorySegment, arg4: Long): NSRect {
    return NSRect(NSDrawColorTiledRects(allocator, arg0.segment, arg1.segment, arg2, arg3, arg4))
}

/**
 * {@snippet lang=c : NSDrawDarkBezel Void(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSDrawDarkBezel_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, CGRect.layout)
private val NSDrawDarkBezel_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawDarkBezel").orElseThrow() }
private val NSDrawDarkBezel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawDarkBezel_ADDR, NSDrawDarkBezel_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawDarkBezel(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSDrawDarkBezel_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawDarkBezel(arg0: NSRect, arg1: NSRect): Unit {
    NSDrawDarkBezel(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSDrawLightBezel Void(typedef NSRect = Declared(CGRect),typedef NSRect = Declared(CGRect))
 */
private val NSDrawLightBezel_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, CGRect.layout)
private val NSDrawLightBezel_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawLightBezel").orElseThrow() }
private val NSDrawLightBezel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawLightBezel_ADDR, NSDrawLightBezel_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawLightBezel(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSDrawLightBezel_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawLightBezel(arg0: NSRect, arg1: NSRect): Unit {
    NSDrawLightBezel(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : NSDottedFrameRect Void(typedef NSRect = Declared(CGRect))
 */
private val NSDottedFrameRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout)
private val NSDottedFrameRect_ADDR: MemorySegment by lazy { LOOKUP.find("NSDottedFrameRect").orElseThrow() }
private val NSDottedFrameRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDottedFrameRect_ADDR, NSDottedFrameRect_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDottedFrameRect(arg0: MemorySegment): Unit {
    try {
        NSDottedFrameRect_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDottedFrameRect(arg0: NSRect): Unit {
    NSDottedFrameRect(arg0.segment)
}

/**
 * {@snippet lang=c : NSDrawWindowBackground Void(typedef NSRect = Declared(CGRect))
 */
private val NSDrawWindowBackground_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout)
private val NSDrawWindowBackground_ADDR: MemorySegment by lazy { LOOKUP.find("NSDrawWindowBackground").orElseThrow() }
private val NSDrawWindowBackground_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDrawWindowBackground_ADDR, NSDrawWindowBackground_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawWindowBackground(arg0: MemorySegment): Unit {
    try {
        NSDrawWindowBackground_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDrawWindowBackground(arg0: NSRect): Unit {
    NSDrawWindowBackground(arg0.segment)
}

/**
 * {@snippet lang=c : NSSetFocusRingStyle Void(typedef NSFocusRingPlacement = Declared(NSFocusRingPlacement))
 */
private val NSSetFocusRingStyle_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG)
private val NSSetFocusRingStyle_ADDR: MemorySegment by lazy { LOOKUP.find("NSSetFocusRingStyle").orElseThrow() }
private val NSSetFocusRingStyle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSSetFocusRingStyle_ADDR, NSSetFocusRingStyle_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSetFocusRingStyle(arg0: NSFocusRingPlacement): Unit {
    try {
        NSSetFocusRingStyle_HANDLE.invokeExact(arg0.value)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDisableScreenUpdates Void()
 */
private val NSDisableScreenUpdates_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val NSDisableScreenUpdates_ADDR: MemorySegment by lazy { LOOKUP.find("NSDisableScreenUpdates").orElseThrow() }
private val NSDisableScreenUpdates_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDisableScreenUpdates_ADDR, NSDisableScreenUpdates_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "As of 10.11 it is not generally necessary to take explicit action to achieve visual atomicity. +[NSAnimationContext runAnimationGroup:] and other similar methods can be used when a stronger than normal need for visual atomicity is required. The NSAnimationContext methods do not suffer from the same performance problems as NSDisableScreenUpdates.")
fun NSDisableScreenUpdates(): Unit {
    try {
        NSDisableScreenUpdates_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSEnableScreenUpdates Void()
 */
private val NSEnableScreenUpdates_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val NSEnableScreenUpdates_ADDR: MemorySegment by lazy { LOOKUP.find("NSEnableScreenUpdates").orElseThrow() }
private val NSEnableScreenUpdates_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSEnableScreenUpdates_ADDR, NSEnableScreenUpdates_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "As of 10.11 it is not generally necessary to take explicit action to achieve visual atomicity. +[NSAnimationContext runAnimationGroup:] and other similar methods can be used when a stronger than normal need for visual atomicity is required. The NSAnimationContext methods do not suffer from the same performance problems as NSEnableScreenUpdates.")
fun NSEnableScreenUpdates(): Unit {
    try {
        NSEnableScreenUpdates_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSShowAnimationEffect Void(typedef NSAnimationEffect = Declared(NSAnimationEffect),typedef NSPoint = Declared(CGPoint),typedef NSSize = Declared(CGSize),typedef id = (Void)*,typedef SEL = ((Void)*)*,(Void)*)
 */
private val NSShowAnimationEffect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, CGPoint.layout, CGSize.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSShowAnimationEffect_ADDR: MemorySegment by lazy { LOOKUP.find("NSShowAnimationEffect").orElseThrow() }
private val NSShowAnimationEffect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSShowAnimationEffect_ADDR, NSShowAnimationEffect_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +[NSCursor disappearingItemCursor] instead")
fun NSShowAnimationEffect(arg0: NSAnimationEffect, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): Unit {
    try {
        NSShowAnimationEffect_HANDLE.invokeExact(arg0.value, arg1, arg2, arg3, arg4, arg5)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +[NSCursor disappearingItemCursor] instead")
fun NSShowAnimationEffect(arg0: NSAnimationEffect, arg1: NSPoint, arg2: NSSize, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): Unit {
    NSShowAnimationEffect(arg0, arg1.segment, arg2.segment, arg3, arg4, arg5)
}

/**
 * {@snippet lang=c : NSCountWindows Void((typedef NSInteger = Long)*)
 */
private val NSCountWindows_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSCountWindows_ADDR: MemorySegment by lazy { LOOKUP.find("NSCountWindows").orElseThrow() }
private val NSCountWindows_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCountWindows_ADDR, NSCountWindows_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use +[NSWindow windowNumbersWithOptions:] instead")
fun NSCountWindows(arg0: MemorySegment): Unit {
    try {
        NSCountWindows_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSWindowList Void(typedef NSInteger = Long,(typedef NSInteger = Long)*)
 */
private val NSWindowList_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSWindowList_ADDR: MemorySegment by lazy { LOOKUP.find("NSWindowList").orElseThrow() }
private val NSWindowList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSWindowList_ADDR, NSWindowList_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use +[NSWindow windowNumbersWithOptions:] instead")
fun NSWindowList(arg0: Long, arg1: MemorySegment): Unit {
    try {
        NSWindowList_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCountWindowsForContext Void(typedef NSInteger = Long,(typedef NSInteger = Long)*)
 */
private val NSCountWindowsForContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSCountWindowsForContext_ADDR: MemorySegment by lazy { LOOKUP.find("NSCountWindowsForContext").orElseThrow() }
private val NSCountWindowsForContext_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCountWindowsForContext_ADDR, NSCountWindowsForContext_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use +[NSWindow windowNumbersWithOptions:] instead")
fun NSCountWindowsForContext(arg0: Long, arg1: MemorySegment): Unit {
    try {
        NSCountWindowsForContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSWindowListForContext Void(typedef NSInteger = Long,typedef NSInteger = Long,(typedef NSInteger = Long)*)
 */
private val NSWindowListForContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSWindowListForContext_ADDR: MemorySegment by lazy { LOOKUP.find("NSWindowListForContext").orElseThrow() }
private val NSWindowListForContext_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSWindowListForContext_ADDR, NSWindowListForContext_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use +[NSWindow windowNumbersWithOptions:] instead")
fun NSWindowListForContext(arg0: Long, arg1: Long, arg2: MemorySegment): Unit {
    try {
        NSWindowListForContext_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCopyBits Void(typedef NSInteger = Long,typedef NSRect = Declared(CGRect),typedef NSPoint = Declared(CGPoint))
 */
private val NSCopyBits_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, CGRect.layout, CGPoint.layout)
private val NSCopyBits_ADDR: MemorySegment by lazy { LOOKUP.find("NSCopyBits").orElseThrow() }
private val NSCopyBits_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCopyBits_ADDR, NSCopyBits_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
fun NSCopyBits(arg0: Long, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        NSCopyBits_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
fun NSCopyBits(arg0: Long, arg1: NSRect, arg2: NSPoint): Unit {
    NSCopyBits(arg0, arg1.segment, arg2.segment)
}

/**
 * {@snippet lang=c : CGDataProviderGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGDataProviderGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGDataProviderGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderGetTypeID").orElseThrow() }
private val CGDataProviderGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderGetTypeID_ADDR, CGDataProviderGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDataProviderGetTypeID(): Long {
    try {
        return CGDataProviderGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderCreateSequential typedef CGDataProviderRef = (Declared(CGDataProvider))*((Void)*,(typedef CGDataProviderSequentialCallbacks = Declared(CGDataProviderSequentialCallbacks))*)
 */
private val CGDataProviderCreateSequential_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataProviderCreateSequential_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderCreateSequential").orElseThrow() }
private val CGDataProviderCreateSequential_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderCreateSequential_ADDR, CGDataProviderCreateSequential_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGDataProviderCreateSequential(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGDataProviderCreateSequential_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderCreateDirect typedef CGDataProviderRef = (Declared(CGDataProvider))*((Void)*,typedef off_t = LongLong,(typedef CGDataProviderDirectCallbacks = Declared(CGDataProviderDirectCallbacks))*)
 */
private val CGDataProviderCreateDirect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGDataProviderCreateDirect_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderCreateDirect").orElseThrow() }
private val CGDataProviderCreateDirect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderCreateDirect_ADDR, CGDataProviderCreateDirect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGDataProviderCreateDirect(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return CGDataProviderCreateDirect_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderCreateWithData typedef CGDataProviderRef = (Declared(CGDataProvider))*((Void)*,(Void)*,typedef size_t = UNSIGNED = Long,typedef CGDataProviderReleaseDataCallback = (Void((Void)*,(Void)*,UNSIGNED = Long))*)
 */
private val CGDataProviderCreateWithData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGDataProviderCreateWithData_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderCreateWithData").orElseThrow() }
private val CGDataProviderCreateWithData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderCreateWithData_ADDR, CGDataProviderCreateWithData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataProviderCreateWithData(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): MemorySegment {
    try {
        return CGDataProviderCreateWithData_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderCreateWithCFData typedef CGDataProviderRef = (Declared(CGDataProvider))*(typedef CFDataRef = (Declared(__CFData))*)
 */
private val CGDataProviderCreateWithCFData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataProviderCreateWithCFData_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderCreateWithCFData").orElseThrow() }
private val CGDataProviderCreateWithCFData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderCreateWithCFData_ADDR, CGDataProviderCreateWithCFData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGDataProviderCreateWithCFData(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataProviderCreateWithCFData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderCreateWithURL typedef CGDataProviderRef = (Declared(CGDataProvider))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CGDataProviderCreateWithURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataProviderCreateWithURL_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderCreateWithURL").orElseThrow() }
private val CGDataProviderCreateWithURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderCreateWithURL_ADDR, CGDataProviderCreateWithURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataProviderCreateWithURL(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataProviderCreateWithURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderCreateWithFilename typedef CGDataProviderRef = (Declared(CGDataProvider))*((Char)*)
 */
private val CGDataProviderCreateWithFilename_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataProviderCreateWithFilename_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderCreateWithFilename").orElseThrow() }
private val CGDataProviderCreateWithFilename_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderCreateWithFilename_ADDR, CGDataProviderCreateWithFilename_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataProviderCreateWithFilename(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataProviderCreateWithFilename_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderRetain typedef CGDataProviderRef = (Declared(CGDataProvider))*(typedef CGDataProviderRef = (Declared(CGDataProvider))*)
 */
private val CGDataProviderRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataProviderRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderRetain").orElseThrow() }
private val CGDataProviderRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderRetain_ADDR, CGDataProviderRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataProviderRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataProviderRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderRelease Void(typedef CGDataProviderRef = (Declared(CGDataProvider))*)
 */
private val CGDataProviderRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGDataProviderRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderRelease").orElseThrow() }
private val CGDataProviderRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderRelease_ADDR, CGDataProviderRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataProviderRelease(arg0: MemorySegment): Unit {
    try {
        CGDataProviderRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderCopyData typedef CFDataRef = (Declared(__CFData))*(typedef CGDataProviderRef = (Declared(CGDataProvider))*)
 */
private val CGDataProviderCopyData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataProviderCopyData_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderCopyData").orElseThrow() }
private val CGDataProviderCopyData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderCopyData_ADDR, CGDataProviderCopyData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGDataProviderCopyData(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataProviderCopyData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataProviderGetInfo (Void)*(typedef CGDataProviderRef = (Declared(CGDataProvider))*)
 */
private val CGDataProviderGetInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataProviderGetInfo_ADDR: MemorySegment by lazy { LOOKUP.find("CGDataProviderGetInfo").orElseThrow() }
private val CGDataProviderGetInfo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGDataProviderGetInfo_ADDR, CGDataProviderGetInfo_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CGDataProviderGetInfo(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataProviderGetInfo_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGColorSpaceGenericGray typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceGenericGray_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceGenericGray_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceGenericGray").orElseThrow().reinterpret(kCGColorSpaceGenericGray_LAYOUT.byteSize()) }
private val kCGColorSpaceGenericGray_VH: VarHandle by lazy { kCGColorSpaceGenericGray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGColorSpaceGenericGray: MemorySegment
    get() = kCGColorSpaceGenericGray_VH.get(kCGColorSpaceGenericGray_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceGenericGray_VH.set(kCGColorSpaceGenericGray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceGenericRGB typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceGenericRGB_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceGenericRGB_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceGenericRGB").orElseThrow().reinterpret(kCGColorSpaceGenericRGB_LAYOUT.byteSize()) }
private val kCGColorSpaceGenericRGB_VH: VarHandle by lazy { kCGColorSpaceGenericRGB_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGColorSpaceGenericRGB: MemorySegment
    get() = kCGColorSpaceGenericRGB_VH.get(kCGColorSpaceGenericRGB_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceGenericRGB_VH.set(kCGColorSpaceGenericRGB_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceGenericCMYK typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceGenericCMYK_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceGenericCMYK_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceGenericCMYK").orElseThrow().reinterpret(kCGColorSpaceGenericCMYK_LAYOUT.byteSize()) }
private val kCGColorSpaceGenericCMYK_VH: VarHandle by lazy { kCGColorSpaceGenericCMYK_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGColorSpaceGenericCMYK: MemorySegment
    get() = kCGColorSpaceGenericCMYK_VH.get(kCGColorSpaceGenericCMYK_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceGenericCMYK_VH.set(kCGColorSpaceGenericCMYK_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceDisplayP3 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceDisplayP3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceDisplayP3_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceDisplayP3").orElseThrow().reinterpret(kCGColorSpaceDisplayP3_LAYOUT.byteSize()) }
private val kCGColorSpaceDisplayP3_VH: VarHandle by lazy { kCGColorSpaceDisplayP3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = 2)
var kCGColorSpaceDisplayP3: MemorySegment
    get() = kCGColorSpaceDisplayP3_VH.get(kCGColorSpaceDisplayP3_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceDisplayP3_VH.set(kCGColorSpaceDisplayP3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceGenericRGBLinear typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceGenericRGBLinear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceGenericRGBLinear_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceGenericRGBLinear").orElseThrow().reinterpret(kCGColorSpaceGenericRGBLinear_LAYOUT.byteSize()) }
private val kCGColorSpaceGenericRGBLinear_VH: VarHandle by lazy { kCGColorSpaceGenericRGBLinear_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGColorSpaceGenericRGBLinear: MemorySegment
    get() = kCGColorSpaceGenericRGBLinear_VH.get(kCGColorSpaceGenericRGBLinear_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceGenericRGBLinear_VH.set(kCGColorSpaceGenericRGBLinear_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceAdobeRGB1998 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceAdobeRGB1998_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceAdobeRGB1998_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceAdobeRGB1998").orElseThrow().reinterpret(kCGColorSpaceAdobeRGB1998_LAYOUT.byteSize()) }
private val kCGColorSpaceAdobeRGB1998_VH: VarHandle by lazy { kCGColorSpaceAdobeRGB1998_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGColorSpaceAdobeRGB1998: MemorySegment
    get() = kCGColorSpaceAdobeRGB1998_VH.get(kCGColorSpaceAdobeRGB1998_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceAdobeRGB1998_VH.set(kCGColorSpaceAdobeRGB1998_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceSRGB typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceSRGB_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceSRGB_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceSRGB").orElseThrow().reinterpret(kCGColorSpaceSRGB_LAYOUT.byteSize()) }
private val kCGColorSpaceSRGB_VH: VarHandle by lazy { kCGColorSpaceSRGB_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGColorSpaceSRGB: MemorySegment
    get() = kCGColorSpaceSRGB_VH.get(kCGColorSpaceSRGB_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceSRGB_VH.set(kCGColorSpaceSRGB_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceGenericGrayGamma2_2 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceGenericGrayGamma2_2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceGenericGrayGamma2_2_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceGenericGrayGamma2_2").orElseThrow().reinterpret(kCGColorSpaceGenericGrayGamma2_2_LAYOUT.byteSize()) }
private val kCGColorSpaceGenericGrayGamma2_2_VH: VarHandle by lazy { kCGColorSpaceGenericGrayGamma2_2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var kCGColorSpaceGenericGrayGamma2_2: MemorySegment
    get() = kCGColorSpaceGenericGrayGamma2_2_VH.get(kCGColorSpaceGenericGrayGamma2_2_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceGenericGrayGamma2_2_VH.set(kCGColorSpaceGenericGrayGamma2_2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceGenericXYZ typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceGenericXYZ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceGenericXYZ_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceGenericXYZ").orElseThrow().reinterpret(kCGColorSpaceGenericXYZ_LAYOUT.byteSize()) }
private val kCGColorSpaceGenericXYZ_VH: VarHandle by lazy { kCGColorSpaceGenericXYZ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var kCGColorSpaceGenericXYZ: MemorySegment
    get() = kCGColorSpaceGenericXYZ_VH.get(kCGColorSpaceGenericXYZ_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceGenericXYZ_VH.set(kCGColorSpaceGenericXYZ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceGenericLab typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceGenericLab_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceGenericLab_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceGenericLab").orElseThrow().reinterpret(kCGColorSpaceGenericLab_LAYOUT.byteSize()) }
private val kCGColorSpaceGenericLab_VH: VarHandle by lazy { kCGColorSpaceGenericLab_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var kCGColorSpaceGenericLab: MemorySegment
    get() = kCGColorSpaceGenericLab_VH.get(kCGColorSpaceGenericLab_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceGenericLab_VH.set(kCGColorSpaceGenericLab_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceACESCGLinear typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceACESCGLinear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceACESCGLinear_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceACESCGLinear").orElseThrow().reinterpret(kCGColorSpaceACESCGLinear_LAYOUT.byteSize()) }
private val kCGColorSpaceACESCGLinear_VH: VarHandle by lazy { kCGColorSpaceACESCGLinear_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var kCGColorSpaceACESCGLinear: MemorySegment
    get() = kCGColorSpaceACESCGLinear_VH.get(kCGColorSpaceACESCGLinear_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceACESCGLinear_VH.set(kCGColorSpaceACESCGLinear_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_709 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_709_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_709_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_709").orElseThrow().reinterpret(kCGColorSpaceITUR_709_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_709_VH: VarHandle by lazy { kCGColorSpaceITUR_709_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var kCGColorSpaceITUR_709: MemorySegment
    get() = kCGColorSpaceITUR_709_VH.get(kCGColorSpaceITUR_709_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_709_VH.set(kCGColorSpaceITUR_709_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_709_PQ typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_709_PQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_709_PQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_709_PQ").orElseThrow().reinterpret(kCGColorSpaceITUR_709_PQ_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_709_PQ_VH: VarHandle by lazy { kCGColorSpaceITUR_709_PQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceITUR_709_PQ: MemorySegment
    get() = kCGColorSpaceITUR_709_PQ_VH.get(kCGColorSpaceITUR_709_PQ_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_709_PQ_VH.set(kCGColorSpaceITUR_709_PQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_709_HLG typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_709_HLG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_709_HLG_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_709_HLG").orElseThrow().reinterpret(kCGColorSpaceITUR_709_HLG_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_709_HLG_VH: VarHandle by lazy { kCGColorSpaceITUR_709_HLG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceITUR_709_HLG: MemorySegment
    get() = kCGColorSpaceITUR_709_HLG_VH.get(kCGColorSpaceITUR_709_HLG_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_709_HLG_VH.set(kCGColorSpaceITUR_709_HLG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_2020 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_2020_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_2020_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_2020").orElseThrow().reinterpret(kCGColorSpaceITUR_2020_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_2020_VH: VarHandle by lazy { kCGColorSpaceITUR_2020_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var kCGColorSpaceITUR_2020: MemorySegment
    get() = kCGColorSpaceITUR_2020_VH.get(kCGColorSpaceITUR_2020_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_2020_VH.set(kCGColorSpaceITUR_2020_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_2020_sRGBGamma typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_2020_sRGBGamma_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_2020_sRGBGamma_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_2020_sRGBGamma").orElseThrow().reinterpret(kCGColorSpaceITUR_2020_sRGBGamma_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_2020_sRGBGamma_VH: VarHandle by lazy { kCGColorSpaceITUR_2020_sRGBGamma_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceITUR_2020_sRGBGamma: MemorySegment
    get() = kCGColorSpaceITUR_2020_sRGBGamma_VH.get(kCGColorSpaceITUR_2020_sRGBGamma_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_2020_sRGBGamma_VH.set(kCGColorSpaceITUR_2020_sRGBGamma_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceROMMRGB typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceROMMRGB_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceROMMRGB_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceROMMRGB").orElseThrow().reinterpret(kCGColorSpaceROMMRGB_LAYOUT.byteSize()) }
private val kCGColorSpaceROMMRGB_VH: VarHandle by lazy { kCGColorSpaceROMMRGB_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var kCGColorSpaceROMMRGB: MemorySegment
    get() = kCGColorSpaceROMMRGB_VH.get(kCGColorSpaceROMMRGB_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceROMMRGB_VH.set(kCGColorSpaceROMMRGB_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceDCIP3 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceDCIP3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceDCIP3_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceDCIP3").orElseThrow().reinterpret(kCGColorSpaceDCIP3_LAYOUT.byteSize()) }
private val kCGColorSpaceDCIP3_VH: VarHandle by lazy { kCGColorSpaceDCIP3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var kCGColorSpaceDCIP3: MemorySegment
    get() = kCGColorSpaceDCIP3_VH.get(kCGColorSpaceDCIP3_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceDCIP3_VH.set(kCGColorSpaceDCIP3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceLinearITUR_2020 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceLinearITUR_2020_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceLinearITUR_2020_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceLinearITUR_2020").orElseThrow().reinterpret(kCGColorSpaceLinearITUR_2020_LAYOUT.byteSize()) }
private val kCGColorSpaceLinearITUR_2020_VH: VarHandle by lazy { kCGColorSpaceLinearITUR_2020_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceLinearITUR_2020: MemorySegment
    get() = kCGColorSpaceLinearITUR_2020_VH.get(kCGColorSpaceLinearITUR_2020_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceLinearITUR_2020_VH.set(kCGColorSpaceLinearITUR_2020_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceExtendedITUR_2020 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedITUR_2020_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedITUR_2020_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedITUR_2020").orElseThrow().reinterpret(kCGColorSpaceExtendedITUR_2020_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedITUR_2020_VH: VarHandle by lazy { kCGColorSpaceExtendedITUR_2020_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceExtendedITUR_2020: MemorySegment
    get() = kCGColorSpaceExtendedITUR_2020_VH.get(kCGColorSpaceExtendedITUR_2020_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedITUR_2020_VH.set(kCGColorSpaceExtendedITUR_2020_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceExtendedLinearITUR_2020 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedLinearITUR_2020_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedLinearITUR_2020_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedLinearITUR_2020").orElseThrow().reinterpret(kCGColorSpaceExtendedLinearITUR_2020_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedLinearITUR_2020_VH: VarHandle by lazy { kCGColorSpaceExtendedLinearITUR_2020_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = 3)
var kCGColorSpaceExtendedLinearITUR_2020: MemorySegment
    get() = kCGColorSpaceExtendedLinearITUR_2020_VH.get(kCGColorSpaceExtendedLinearITUR_2020_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedLinearITUR_2020_VH.set(kCGColorSpaceExtendedLinearITUR_2020_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceLinearDisplayP3 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceLinearDisplayP3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceLinearDisplayP3_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceLinearDisplayP3").orElseThrow().reinterpret(kCGColorSpaceLinearDisplayP3_LAYOUT.byteSize()) }
private val kCGColorSpaceLinearDisplayP3_VH: VarHandle by lazy { kCGColorSpaceLinearDisplayP3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceLinearDisplayP3: MemorySegment
    get() = kCGColorSpaceLinearDisplayP3_VH.get(kCGColorSpaceLinearDisplayP3_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceLinearDisplayP3_VH.set(kCGColorSpaceLinearDisplayP3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceExtendedDisplayP3 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedDisplayP3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedDisplayP3_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedDisplayP3").orElseThrow().reinterpret(kCGColorSpaceExtendedDisplayP3_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedDisplayP3_VH: VarHandle by lazy { kCGColorSpaceExtendedDisplayP3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceExtendedDisplayP3: MemorySegment
    get() = kCGColorSpaceExtendedDisplayP3_VH.get(kCGColorSpaceExtendedDisplayP3_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedDisplayP3_VH.set(kCGColorSpaceExtendedDisplayP3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceExtendedLinearDisplayP3 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedLinearDisplayP3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedLinearDisplayP3_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedLinearDisplayP3").orElseThrow().reinterpret(kCGColorSpaceExtendedLinearDisplayP3_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedLinearDisplayP3_VH: VarHandle by lazy { kCGColorSpaceExtendedLinearDisplayP3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = 3)
var kCGColorSpaceExtendedLinearDisplayP3: MemorySegment
    get() = kCGColorSpaceExtendedLinearDisplayP3_VH.get(kCGColorSpaceExtendedLinearDisplayP3_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedLinearDisplayP3_VH.set(kCGColorSpaceExtendedLinearDisplayP3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_2100_PQ typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_2100_PQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_2100_PQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_2100_PQ").orElseThrow().reinterpret(kCGColorSpaceITUR_2100_PQ_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_2100_PQ_VH: VarHandle by lazy { kCGColorSpaceITUR_2100_PQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceITUR_2100_PQ: MemorySegment
    get() = kCGColorSpaceITUR_2100_PQ_VH.get(kCGColorSpaceITUR_2100_PQ_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_2100_PQ_VH.set(kCGColorSpaceITUR_2100_PQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_2100_HLG typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_2100_HLG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_2100_HLG_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_2100_HLG").orElseThrow().reinterpret(kCGColorSpaceITUR_2100_HLG_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_2100_HLG_VH: VarHandle by lazy { kCGColorSpaceITUR_2100_HLG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceITUR_2100_HLG: MemorySegment
    get() = kCGColorSpaceITUR_2100_HLG_VH.get(kCGColorSpaceITUR_2100_HLG_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_2100_HLG_VH.set(kCGColorSpaceITUR_2100_HLG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceDisplayP3_PQ typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceDisplayP3_PQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceDisplayP3_PQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceDisplayP3_PQ").orElseThrow().reinterpret(kCGColorSpaceDisplayP3_PQ_LAYOUT.byteSize()) }
private val kCGColorSpaceDisplayP3_PQ_VH: VarHandle by lazy { kCGColorSpaceDisplayP3_PQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = 4)
var kCGColorSpaceDisplayP3_PQ: MemorySegment
    get() = kCGColorSpaceDisplayP3_PQ_VH.get(kCGColorSpaceDisplayP3_PQ_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceDisplayP3_PQ_VH.set(kCGColorSpaceDisplayP3_PQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceDisplayP3_HLG typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceDisplayP3_HLG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceDisplayP3_HLG_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceDisplayP3_HLG").orElseThrow().reinterpret(kCGColorSpaceDisplayP3_HLG_LAYOUT.byteSize()) }
private val kCGColorSpaceDisplayP3_HLG_VH: VarHandle by lazy { kCGColorSpaceDisplayP3_HLG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = 6)
var kCGColorSpaceDisplayP3_HLG: MemorySegment
    get() = kCGColorSpaceDisplayP3_HLG_VH.get(kCGColorSpaceDisplayP3_HLG_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceDisplayP3_HLG_VH.set(kCGColorSpaceDisplayP3_HLG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_2020_PQ typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_2020_PQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_2020_PQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_2020_PQ").orElseThrow().reinterpret(kCGColorSpaceITUR_2020_PQ_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_2020_PQ_VH: VarHandle by lazy { kCGColorSpaceITUR_2020_PQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = 4, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
var kCGColorSpaceITUR_2020_PQ: MemorySegment
    get() = kCGColorSpaceITUR_2020_PQ_VH.get(kCGColorSpaceITUR_2020_PQ_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_2020_PQ_VH.set(kCGColorSpaceITUR_2020_PQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_2020_HLG typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_2020_HLG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_2020_HLG_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_2020_HLG").orElseThrow().reinterpret(kCGColorSpaceITUR_2020_HLG_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_2020_HLG_VH: VarHandle by lazy { kCGColorSpaceITUR_2020_HLG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = 6, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
var kCGColorSpaceITUR_2020_HLG: MemorySegment
    get() = kCGColorSpaceITUR_2020_HLG_VH.get(kCGColorSpaceITUR_2020_HLG_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_2020_HLG_VH.set(kCGColorSpaceITUR_2020_HLG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceDisplayP3_PQ_EOTF typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceDisplayP3_PQ_EOTF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceDisplayP3_PQ_EOTF_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceDisplayP3_PQ_EOTF").orElseThrow().reinterpret(kCGColorSpaceDisplayP3_PQ_EOTF_LAYOUT.byteSize()) }
private val kCGColorSpaceDisplayP3_PQ_EOTF_VH: VarHandle by lazy { kCGColorSpaceDisplayP3_PQ_EOTF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 4, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = 6, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = 4, message = "No longer supported")
var kCGColorSpaceDisplayP3_PQ_EOTF: MemorySegment
    get() = kCGColorSpaceDisplayP3_PQ_EOTF_VH.get(kCGColorSpaceDisplayP3_PQ_EOTF_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceDisplayP3_PQ_EOTF_VH.set(kCGColorSpaceDisplayP3_PQ_EOTF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceITUR_2020_PQ_EOTF typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceITUR_2020_PQ_EOTF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceITUR_2020_PQ_EOTF_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceITUR_2020_PQ_EOTF").orElseThrow().reinterpret(kCGColorSpaceITUR_2020_PQ_EOTF_LAYOUT.byteSize()) }
private val kCGColorSpaceITUR_2020_PQ_EOTF_VH: VarHandle by lazy { kCGColorSpaceITUR_2020_PQ_EOTF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 4, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = 6, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = 4, message = "No longer supported")
var kCGColorSpaceITUR_2020_PQ_EOTF: MemorySegment
    get() = kCGColorSpaceITUR_2020_PQ_EOTF_VH.get(kCGColorSpaceITUR_2020_PQ_EOTF_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceITUR_2020_PQ_EOTF_VH.set(kCGColorSpaceITUR_2020_PQ_EOTF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceExtendedSRGB typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedSRGB_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedSRGB_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedSRGB").orElseThrow().reinterpret(kCGColorSpaceExtendedSRGB_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedSRGB_VH: VarHandle by lazy { kCGColorSpaceExtendedSRGB_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var kCGColorSpaceExtendedSRGB: MemorySegment
    get() = kCGColorSpaceExtendedSRGB_VH.get(kCGColorSpaceExtendedSRGB_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedSRGB_VH.set(kCGColorSpaceExtendedSRGB_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceLinearSRGB typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceLinearSRGB_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceLinearSRGB_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceLinearSRGB").orElseThrow().reinterpret(kCGColorSpaceLinearSRGB_LAYOUT.byteSize()) }
private val kCGColorSpaceLinearSRGB_VH: VarHandle by lazy { kCGColorSpaceLinearSRGB_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var kCGColorSpaceLinearSRGB: MemorySegment
    get() = kCGColorSpaceLinearSRGB_VH.get(kCGColorSpaceLinearSRGB_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceLinearSRGB_VH.set(kCGColorSpaceLinearSRGB_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceExtendedLinearSRGB typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedLinearSRGB_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedLinearSRGB_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedLinearSRGB").orElseThrow().reinterpret(kCGColorSpaceExtendedLinearSRGB_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedLinearSRGB_VH: VarHandle by lazy { kCGColorSpaceExtendedLinearSRGB_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var kCGColorSpaceExtendedLinearSRGB: MemorySegment
    get() = kCGColorSpaceExtendedLinearSRGB_VH.get(kCGColorSpaceExtendedLinearSRGB_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedLinearSRGB_VH.set(kCGColorSpaceExtendedLinearSRGB_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceExtendedGray typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedGray_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedGray_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedGray").orElseThrow().reinterpret(kCGColorSpaceExtendedGray_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedGray_VH: VarHandle by lazy { kCGColorSpaceExtendedGray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var kCGColorSpaceExtendedGray: MemorySegment
    get() = kCGColorSpaceExtendedGray_VH.get(kCGColorSpaceExtendedGray_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedGray_VH.set(kCGColorSpaceExtendedGray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceLinearGray typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceLinearGray_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceLinearGray_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceLinearGray").orElseThrow().reinterpret(kCGColorSpaceLinearGray_LAYOUT.byteSize()) }
private val kCGColorSpaceLinearGray_VH: VarHandle by lazy { kCGColorSpaceLinearGray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var kCGColorSpaceLinearGray: MemorySegment
    get() = kCGColorSpaceLinearGray_VH.get(kCGColorSpaceLinearGray_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceLinearGray_VH.set(kCGColorSpaceLinearGray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceExtendedLinearGray typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedLinearGray_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedLinearGray_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedLinearGray").orElseThrow().reinterpret(kCGColorSpaceExtendedLinearGray_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedLinearGray_VH: VarHandle by lazy { kCGColorSpaceExtendedLinearGray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var kCGColorSpaceExtendedLinearGray: MemorySegment
    get() = kCGColorSpaceExtendedLinearGray_VH.get(kCGColorSpaceExtendedLinearGray_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedLinearGray_VH.set(kCGColorSpaceExtendedLinearGray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorSpaceCoreMedia709 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceCoreMedia709_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceCoreMedia709_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceCoreMedia709").orElseThrow().reinterpret(kCGColorSpaceCoreMedia709_LAYOUT.byteSize()) }
private val kCGColorSpaceCoreMedia709_VH: VarHandle by lazy { kCGColorSpaceCoreMedia709_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var kCGColorSpaceCoreMedia709: MemorySegment
    get() = kCGColorSpaceCoreMedia709_VH.get(kCGColorSpaceCoreMedia709_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceCoreMedia709_VH.set(kCGColorSpaceCoreMedia709_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGColorSpaceCreateDeviceGray typedef CGColorSpaceRef = (Declared(CGColorSpace))*()
 */
private val CGColorSpaceCreateDeviceGray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGColorSpaceCreateDeviceGray_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateDeviceGray").orElseThrow() }
private val CGColorSpaceCreateDeviceGray_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateDeviceGray_ADDR, CGColorSpaceCreateDeviceGray_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateDeviceGray(): MemorySegment {
    try {
        return CGColorSpaceCreateDeviceGray_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateDeviceRGB typedef CGColorSpaceRef = (Declared(CGColorSpace))*()
 */
private val CGColorSpaceCreateDeviceRGB_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGColorSpaceCreateDeviceRGB_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateDeviceRGB").orElseThrow() }
private val CGColorSpaceCreateDeviceRGB_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateDeviceRGB_ADDR, CGColorSpaceCreateDeviceRGB_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateDeviceRGB(): MemorySegment {
    try {
        return CGColorSpaceCreateDeviceRGB_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateDeviceCMYK typedef CGColorSpaceRef = (Declared(CGColorSpace))*()
 */
private val CGColorSpaceCreateDeviceCMYK_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGColorSpaceCreateDeviceCMYK_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateDeviceCMYK").orElseThrow() }
private val CGColorSpaceCreateDeviceCMYK_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateDeviceCMYK_ADDR, CGColorSpaceCreateDeviceCMYK_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateDeviceCMYK(): MemorySegment {
    try {
        return CGColorSpaceCreateDeviceCMYK_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateCalibratedGray typedef CGColorSpaceRef = (Declared(CGColorSpace))*((typedef CGFloat = Double)*,(typedef CGFloat = Double)*,typedef CGFloat = Double)
 */
private val CGColorSpaceCreateCalibratedGray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGColorSpaceCreateCalibratedGray_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateCalibratedGray").orElseThrow() }
private val CGColorSpaceCreateCalibratedGray_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateCalibratedGray_ADDR, CGColorSpaceCreateCalibratedGray_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateCalibratedGray(arg0: MemorySegment, arg1: MemorySegment, arg2: Double): MemorySegment {
    try {
        return CGColorSpaceCreateCalibratedGray_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateCalibratedRGB typedef CGColorSpaceRef = (Declared(CGColorSpace))*((typedef CGFloat = Double)*,(typedef CGFloat = Double)*,(typedef CGFloat = Double)*,(typedef CGFloat = Double)*)
 */
private val CGColorSpaceCreateCalibratedRGB_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateCalibratedRGB_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateCalibratedRGB").orElseThrow() }
private val CGColorSpaceCreateCalibratedRGB_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateCalibratedRGB_ADDR, CGColorSpaceCreateCalibratedRGB_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateCalibratedRGB(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateCalibratedRGB_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateLab typedef CGColorSpaceRef = (Declared(CGColorSpace))*((typedef CGFloat = Double)*,(typedef CGFloat = Double)*,(typedef CGFloat = Double)*)
 */
private val CGColorSpaceCreateLab_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateLab_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateLab").orElseThrow() }
private val CGColorSpaceCreateLab_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateLab_ADDR, CGColorSpaceCreateLab_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateLab(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateLab_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateWithICCData typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CFTypeRef = (Void)*)
 */
private val CGColorSpaceCreateWithICCData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateWithICCData_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateWithICCData").orElseThrow() }
private val CGColorSpaceCreateWithICCData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateWithICCData_ADDR, CGColorSpaceCreateWithICCData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorSpaceCreateWithICCData(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateWithICCData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateICCBased typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef size_t = UNSIGNED = Long,(typedef CGFloat = Double)*,typedef CGDataProviderRef = (Declared(CGDataProvider))*,typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCreateICCBased_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateICCBased_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateICCBased").orElseThrow() }
private val CGColorSpaceCreateICCBased_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateICCBased_ADDR, CGColorSpaceCreateICCBased_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateICCBased(arg0: Long, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateICCBased_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateIndexed typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef size_t = UNSIGNED = Long,(UNSIGNED = Char)*)
 */
private val CGColorSpaceCreateIndexed_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGColorSpaceCreateIndexed_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateIndexed").orElseThrow() }
private val CGColorSpaceCreateIndexed_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateIndexed_ADDR, CGColorSpaceCreateIndexed_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateIndexed(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateIndexed_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreatePattern typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCreatePattern_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreatePattern_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreatePattern").orElseThrow() }
private val CGColorSpaceCreatePattern_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreatePattern_ADDR, CGColorSpaceCreatePattern_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreatePattern(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreatePattern_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGColorSpaceExtendedRange typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorSpaceExtendedRange_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorSpaceExtendedRange_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorSpaceExtendedRange").orElseThrow().reinterpret(kCGColorSpaceExtendedRange_LAYOUT.byteSize()) }
private val kCGColorSpaceExtendedRange_VH: VarHandle by lazy { kCGColorSpaceExtendedRange_LAYOUT.varHandle() }

var kCGColorSpaceExtendedRange: MemorySegment
    get() = kCGColorSpaceExtendedRange_VH.get(kCGColorSpaceExtendedRange_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorSpaceExtendedRange_VH.set(kCGColorSpaceExtendedRange_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGColorSpaceCreateWithColorSyncProfile typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef ColorSyncProfileRef = (Declared(ColorSyncProfile))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGColorSpaceCreateWithColorSyncProfile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateWithColorSyncProfile_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateWithColorSyncProfile").orElseThrow() }
private val CGColorSpaceCreateWithColorSyncProfile_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateWithColorSyncProfile_ADDR, CGColorSpaceCreateWithColorSyncProfile_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateWithColorSyncProfile(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateWithColorSyncProfile_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateWithName typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CGColorSpaceCreateWithName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateWithName_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateWithName").orElseThrow() }
private val CGColorSpaceCreateWithName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateWithName_ADDR, CGColorSpaceCreateWithName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGColorSpaceCreateWithName(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateWithName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceRetain typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceRetain").orElseThrow() }
private val CGColorSpaceRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceRetain_ADDR, CGColorSpaceRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceRelease Void(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGColorSpaceRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceRelease").orElseThrow() }
private val CGColorSpaceRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceRelease_ADDR, CGColorSpaceRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceRelease(arg0: MemorySegment): Unit {
    try {
        CGColorSpaceRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceGetName typedef CFStringRef = (Declared(__CFString))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceGetName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceGetName_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceGetName").orElseThrow() }
private val CGColorSpaceGetName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceGetName_ADDR, CGColorSpaceGetName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CGColorSpaceGetName(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceGetName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCopyName typedef CFStringRef = (Declared(__CFString))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCopyName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCopyName_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCopyName").orElseThrow() }
private val CGColorSpaceCopyName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCopyName_ADDR, CGColorSpaceCopyName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGColorSpaceCopyName(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCopyName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGColorSpaceGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGColorSpaceGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceGetTypeID").orElseThrow() }
private val CGColorSpaceGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceGetTypeID_ADDR, CGColorSpaceGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGColorSpaceGetTypeID(): Long {
    try {
        return CGColorSpaceGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceGetNumberOfComponents typedef size_t = UNSIGNED = Long(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceGetNumberOfComponents_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGColorSpaceGetNumberOfComponents_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceGetNumberOfComponents").orElseThrow() }
private val CGColorSpaceGetNumberOfComponents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceGetNumberOfComponents_ADDR, CGColorSpaceGetNumberOfComponents_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceGetNumberOfComponents(arg0: MemorySegment): Long {
    try {
        return CGColorSpaceGetNumberOfComponents_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceGetModel typedef CGColorSpaceModel = Declared(CGColorSpaceModel)(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceGetModel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGColorSpaceGetModel_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceGetModel").orElseThrow() }
private val CGColorSpaceGetModel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceGetModel_ADDR, CGColorSpaceGetModel_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGColorSpaceGetModel(arg0: MemorySegment): CGColorSpaceModel {
    try {
        return CGColorSpaceModel.fromValue((CGColorSpaceGetModel_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceGetBaseColorSpace typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceGetBaseColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceGetBaseColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceGetBaseColorSpace").orElseThrow() }
private val CGColorSpaceGetBaseColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceGetBaseColorSpace_ADDR, CGColorSpaceGetBaseColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGColorSpaceGetBaseColorSpace(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceGetBaseColorSpace_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCopyBaseColorSpace typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCopyBaseColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCopyBaseColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCopyBaseColorSpace").orElseThrow() }
private val CGColorSpaceCopyBaseColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCopyBaseColorSpace_ADDR, CGColorSpaceCopyBaseColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCopyBaseColorSpace(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCopyBaseColorSpace_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceGetColorTableCount typedef size_t = UNSIGNED = Long(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceGetColorTableCount_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGColorSpaceGetColorTableCount_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceGetColorTableCount").orElseThrow() }
private val CGColorSpaceGetColorTableCount_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceGetColorTableCount_ADDR, CGColorSpaceGetColorTableCount_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGColorSpaceGetColorTableCount(arg0: MemorySegment): Long {
    try {
        return CGColorSpaceGetColorTableCount_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceGetColorTable Void(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,(typedef uint8_t = UNSIGNED = Char)*)
 */
private val CGColorSpaceGetColorTable_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceGetColorTable_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceGetColorTable").orElseThrow() }
private val CGColorSpaceGetColorTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceGetColorTable_ADDR, CGColorSpaceGetColorTable_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGColorSpaceGetColorTable(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGColorSpaceGetColorTable_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCopyICCData typedef CFDataRef = (Declared(__CFData))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCopyICCData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCopyICCData_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCopyICCData").orElseThrow() }
private val CGColorSpaceCopyICCData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCopyICCData_ADDR, CGColorSpaceCopyICCData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorSpaceCopyICCData(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCopyICCData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceIsWideGamutRGB Bool(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceIsWideGamutRGB_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGColorSpaceIsWideGamutRGB_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceIsWideGamutRGB").orElseThrow() }
private val CGColorSpaceIsWideGamutRGB_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceIsWideGamutRGB_ADDR, CGColorSpaceIsWideGamutRGB_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorSpaceIsWideGamutRGB(arg0: MemorySegment): Boolean {
    try {
        return CGColorSpaceIsWideGamutRGB_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceIsHDR Bool(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceIsHDR_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGColorSpaceIsHDR_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceIsHDR").orElseThrow() }
private val CGColorSpaceIsHDR_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceIsHDR_ADDR, CGColorSpaceIsHDR_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGColorSpaceIsHDR(arg0: MemorySegment): Boolean {
    try {
        return CGColorSpaceIsHDR_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceUsesITUR_2100TF Bool(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceUsesITUR_2100TF_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGColorSpaceUsesITUR_2100TF_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceUsesITUR_2100TF").orElseThrow() }
private val CGColorSpaceUsesITUR_2100TF_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceUsesITUR_2100TF_ADDR, CGColorSpaceUsesITUR_2100TF_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceUsesITUR_2100TF(arg0: MemorySegment): Boolean {
    try {
        return CGColorSpaceUsesITUR_2100TF_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceIsPQBased Bool(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceIsPQBased_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGColorSpaceIsPQBased_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceIsPQBased").orElseThrow() }
private val CGColorSpaceIsPQBased_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceIsPQBased_ADDR, CGColorSpaceIsPQBased_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceIsPQBased(arg0: MemorySegment): Boolean {
    try {
        return CGColorSpaceIsPQBased_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceIsHLGBased Bool(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceIsHLGBased_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGColorSpaceIsHLGBased_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceIsHLGBased").orElseThrow() }
private val CGColorSpaceIsHLGBased_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceIsHLGBased_ADDR, CGColorSpaceIsHLGBased_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceIsHLGBased(arg0: MemorySegment): Boolean {
    try {
        return CGColorSpaceIsHLGBased_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceSupportsOutput Bool(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceSupportsOutput_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGColorSpaceSupportsOutput_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceSupportsOutput").orElseThrow() }
private val CGColorSpaceSupportsOutput_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceSupportsOutput_ADDR, CGColorSpaceSupportsOutput_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorSpaceSupportsOutput(arg0: MemorySegment): Boolean {
    try {
        return CGColorSpaceSupportsOutput_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCopyPropertyList typedef CFPropertyListRef = (Void)*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCopyPropertyList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCopyPropertyList_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCopyPropertyList").orElseThrow() }
private val CGColorSpaceCopyPropertyList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCopyPropertyList_ADDR, CGColorSpaceCopyPropertyList_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorSpaceCopyPropertyList(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCopyPropertyList_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateWithPropertyList typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CFPropertyListRef = (Void)*)
 */
private val CGColorSpaceCreateWithPropertyList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateWithPropertyList_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateWithPropertyList").orElseThrow() }
private val CGColorSpaceCreateWithPropertyList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateWithPropertyList_ADDR, CGColorSpaceCreateWithPropertyList_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorSpaceCreateWithPropertyList(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateWithPropertyList_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceUsesExtendedRange Bool(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceUsesExtendedRange_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGColorSpaceUsesExtendedRange_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceUsesExtendedRange").orElseThrow() }
private val CGColorSpaceUsesExtendedRange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceUsesExtendedRange_ADDR, CGColorSpaceUsesExtendedRange_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorSpaceUsesExtendedRange(arg0: MemorySegment): Boolean {
    try {
        return CGColorSpaceUsesExtendedRange_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateLinearized typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCreateLinearized_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateLinearized_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateLinearized").orElseThrow() }
private val CGColorSpaceCreateLinearized_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateLinearized_ADDR, CGColorSpaceCreateLinearized_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateLinearized(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateLinearized_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateExtended typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCreateExtended_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateExtended_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateExtended").orElseThrow() }
private val CGColorSpaceCreateExtended_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateExtended_ADDR, CGColorSpaceCreateExtended_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateExtended(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateExtended_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateExtendedLinearized typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCreateExtendedLinearized_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateExtendedLinearized_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateExtendedLinearized").orElseThrow() }
private val CGColorSpaceCreateExtendedLinearized_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateExtendedLinearized_ADDR, CGColorSpaceCreateExtendedLinearized_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateExtendedLinearized(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateExtendedLinearized_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateCopyWithStandardRange typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCreateCopyWithStandardRange_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateCopyWithStandardRange_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateCopyWithStandardRange").orElseThrow() }
private val CGColorSpaceCreateCopyWithStandardRange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateCopyWithStandardRange_ADDR, CGColorSpaceCreateCopyWithStandardRange_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGColorSpaceCreateCopyWithStandardRange(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateCopyWithStandardRange_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateWithICCProfile typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CFDataRef = (Declared(__CFData))*)
 */
private val CGColorSpaceCreateWithICCProfile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateWithICCProfile_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateWithICCProfile").orElseThrow() }
private val CGColorSpaceCreateWithICCProfile_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateWithICCProfile_ADDR, CGColorSpaceCreateWithICCProfile_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "No longer supported")
fun CGColorSpaceCreateWithICCProfile(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateWithICCProfile_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCopyICCProfile typedef CFDataRef = (Declared(__CFData))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorSpaceCopyICCProfile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCopyICCProfile_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCopyICCProfile").orElseThrow() }
private val CGColorSpaceCopyICCProfile_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCopyICCProfile_ADDR, CGColorSpaceCopyICCProfile_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "No longer supported")
fun CGColorSpaceCopyICCProfile(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCopyICCProfile_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorSpaceCreateWithPlatformColorSpace typedef CGColorSpaceRef = (Declared(CGColorSpace))*((Void)*)
 */
private val CGColorSpaceCreateWithPlatformColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorSpaceCreateWithPlatformColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorSpaceCreateWithPlatformColorSpace").orElseThrow() }
private val CGColorSpaceCreateWithPlatformColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorSpaceCreateWithPlatformColorSpace_ADDR, CGColorSpaceCreateWithPlatformColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
fun CGColorSpaceCreateWithPlatformColorSpace(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorSpaceCreateWithPlatformColorSpace_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPatternGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGPatternGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGPatternGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGPatternGetTypeID").orElseThrow() }
private val CGPatternGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPatternGetTypeID_ADDR, CGPatternGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPatternGetTypeID(): Long {
    try {
        return CGPatternGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPatternCreate typedef CGPatternRef = (Declared(CGPattern))*((Void)*,typedef CGRect = Declared(CGRect),typedef CGAffineTransform = Declared(CGAffineTransform),typedef CGFloat = Double,typedef CGFloat = Double,typedef CGPatternTiling = Declared(CGPatternTiling),Bool,(typedef CGPatternCallbacks = Declared(CGPatternCallbacks))*)
 */
private val CGPatternCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGRect.layout, CGAffineTransform.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPatternCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CGPatternCreate").orElseThrow() }
private val CGPatternCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPatternCreate_ADDR, CGPatternCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPatternCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Double, arg4: Double, arg5: CGPatternTiling, arg6: Boolean, arg7: MemorySegment): MemorySegment {
    try {
        return CGPatternCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5.value.toInt(), arg6, arg7) as MemorySegment
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
fun CGPatternCreate(arg0: MemorySegment, arg1: CGRect, arg2: CGAffineTransform, arg3: Double, arg4: Double, arg5: CGPatternTiling, arg6: Boolean, arg7: MemorySegment): MemorySegment {
    return CGPatternCreate(arg0, arg1.segment, arg2.segment, arg3, arg4, arg5, arg6, arg7)
}

/**
 * {@snippet lang=c : CGPatternRetain typedef CGPatternRef = (Declared(CGPattern))*(typedef CGPatternRef = (Declared(CGPattern))*)
 */
private val CGPatternRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPatternRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGPatternRetain").orElseThrow() }
private val CGPatternRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPatternRetain_ADDR, CGPatternRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPatternRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGPatternRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPatternRelease Void(typedef CGPatternRef = (Declared(CGPattern))*)
 */
private val CGPatternRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPatternRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGPatternRelease").orElseThrow() }
private val CGPatternRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPatternRelease_ADDR, CGPatternRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPatternRelease(arg0: MemorySegment): Unit {
    try {
        CGPatternRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreate typedef CGColorRef = (Declared(CGColor))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,(typedef CGFloat = Double)*)
 */
private val CGColorCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreate").orElseThrow() }
private val CGColorCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreate_ADDR, CGColorCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorCreate(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGColorCreate_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateGenericGray typedef CGColorRef = (Declared(CGColor))*(typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGColorCreateGenericGray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGColorCreateGenericGray_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateGenericGray").orElseThrow() }
private val CGColorCreateGenericGray_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateGenericGray_ADDR, CGColorCreateGenericGray_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGColorCreateGenericGray(arg0: Double, arg1: Double): MemorySegment {
    try {
        return CGColorCreateGenericGray_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateGenericRGB typedef CGColorRef = (Declared(CGColor))*(typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGColorCreateGenericRGB_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGColorCreateGenericRGB_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateGenericRGB").orElseThrow() }
private val CGColorCreateGenericRGB_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateGenericRGB_ADDR, CGColorCreateGenericRGB_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGColorCreateGenericRGB(arg0: Double, arg1: Double, arg2: Double, arg3: Double): MemorySegment {
    try {
        return CGColorCreateGenericRGB_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateGenericCMYK typedef CGColorRef = (Declared(CGColor))*(typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGColorCreateGenericCMYK_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGColorCreateGenericCMYK_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateGenericCMYK").orElseThrow() }
private val CGColorCreateGenericCMYK_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateGenericCMYK_ADDR, CGColorCreateGenericCMYK_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGColorCreateGenericCMYK(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double): MemorySegment {
    try {
        return CGColorCreateGenericCMYK_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateGenericGrayGamma2_2 typedef CGColorRef = (Declared(CGColor))*(typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGColorCreateGenericGrayGamma2_2_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGColorCreateGenericGrayGamma2_2_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateGenericGrayGamma2_2").orElseThrow() }
private val CGColorCreateGenericGrayGamma2_2_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateGenericGrayGamma2_2_ADDR, CGColorCreateGenericGrayGamma2_2_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGColorCreateGenericGrayGamma2_2(arg0: Double, arg1: Double): MemorySegment {
    try {
        return CGColorCreateGenericGrayGamma2_2_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateSRGB typedef CGColorRef = (Declared(CGColor))*(typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGColorCreateSRGB_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGColorCreateSRGB_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateSRGB").orElseThrow() }
private val CGColorCreateSRGB_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateSRGB_ADDR, CGColorCreateSRGB_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGColorCreateSRGB(arg0: Double, arg1: Double, arg2: Double, arg3: Double): MemorySegment {
    try {
        return CGColorCreateSRGB_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateWithContentHeadroom typedef CGColorRef = (Declared(CGColor))*(Float,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGColorCreateWithContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGColorCreateWithContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateWithContentHeadroom").orElseThrow() }
private val CGColorCreateWithContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateWithContentHeadroom_ADDR, CGColorCreateWithContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGColorCreateWithContentHeadroom(arg0: Float, arg1: MemorySegment, arg2: Double, arg3: Double, arg4: Double, arg5: Double): MemorySegment {
    try {
        return CGColorCreateWithContentHeadroom_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorGetContentHeadroom Float(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorGetContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGColorGetContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorGetContentHeadroom").orElseThrow() }
private val CGColorGetContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorGetContentHeadroom_ADDR, CGColorGetContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGColorGetContentHeadroom(arg0: MemorySegment): Float {
    try {
        return CGColorGetContentHeadroom_HANDLE.invokeExact(arg0) as Float
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorGetConstantColor typedef CGColorRef = (Declared(CGColor))*(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CGColorGetConstantColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorGetConstantColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorGetConstantColor").orElseThrow() }
private val CGColorGetConstantColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorGetConstantColor_ADDR, CGColorGetConstantColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGColorGetConstantColor(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorGetConstantColor_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateWithPattern typedef CGColorRef = (Declared(CGColor))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGPatternRef = (Declared(CGPattern))*,(typedef CGFloat = Double)*)
 */
private val CGColorCreateWithPattern_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorCreateWithPattern_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateWithPattern").orElseThrow() }
private val CGColorCreateWithPattern_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateWithPattern_ADDR, CGColorCreateWithPattern_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorCreateWithPattern(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGColorCreateWithPattern_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateCopy typedef CGColorRef = (Declared(CGColor))*(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorCreateCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorCreateCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateCopy").orElseThrow() }
private val CGColorCreateCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateCopy_ADDR, CGColorCreateCopy_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorCreateCopy(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorCreateCopy_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateCopyWithAlpha typedef CGColorRef = (Declared(CGColor))*(typedef CGColorRef = (Declared(CGColor))*,typedef CGFloat = Double)
 */
private val CGColorCreateCopyWithAlpha_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGColorCreateCopyWithAlpha_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateCopyWithAlpha").orElseThrow() }
private val CGColorCreateCopyWithAlpha_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateCopyWithAlpha_ADDR, CGColorCreateCopyWithAlpha_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorCreateCopyWithAlpha(arg0: MemorySegment, arg1: Double): MemorySegment {
    try {
        return CGColorCreateCopyWithAlpha_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorCreateCopyByMatchingToColorSpace typedef CGColorRef = (Declared(CGColor))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent),typedef CGColorRef = (Declared(CGColor))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGColorCreateCopyByMatchingToColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorCreateCopyByMatchingToColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorCreateCopyByMatchingToColorSpace").orElseThrow() }
private val CGColorCreateCopyByMatchingToColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorCreateCopyByMatchingToColorSpace_ADDR, CGColorCreateCopyByMatchingToColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun CGColorCreateCopyByMatchingToColorSpace(arg0: MemorySegment, arg1: CGColorRenderingIntent, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CGColorCreateCopyByMatchingToColorSpace_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorRetain typedef CGColorRef = (Declared(CGColor))*(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorRetain").orElseThrow() }
private val CGColorRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorRetain_ADDR, CGColorRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorRelease Void(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGColorRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorRelease").orElseThrow() }
private val CGColorRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorRelease_ADDR, CGColorRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorRelease(arg0: MemorySegment): Unit {
    try {
        CGColorRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorEqualToColor Bool(typedef CGColorRef = (Declared(CGColor))*,typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorEqualToColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorEqualToColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorEqualToColor").orElseThrow() }
private val CGColorEqualToColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorEqualToColor_ADDR, CGColorEqualToColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorEqualToColor(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGColorEqualToColor_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorGetNumberOfComponents typedef size_t = UNSIGNED = Long(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorGetNumberOfComponents_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGColorGetNumberOfComponents_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorGetNumberOfComponents").orElseThrow() }
private val CGColorGetNumberOfComponents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorGetNumberOfComponents_ADDR, CGColorGetNumberOfComponents_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorGetNumberOfComponents(arg0: MemorySegment): Long {
    try {
        return CGColorGetNumberOfComponents_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorGetComponents (typedef CGFloat = Double)*(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorGetComponents_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorGetComponents_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorGetComponents").orElseThrow() }
private val CGColorGetComponents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorGetComponents_ADDR, CGColorGetComponents_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorGetComponents(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorGetComponents_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorGetAlpha typedef CGFloat = Double(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorGetAlpha_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGColorGetAlpha_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorGetAlpha").orElseThrow() }
private val CGColorGetAlpha_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorGetAlpha_ADDR, CGColorGetAlpha_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorGetAlpha(arg0: MemorySegment): Double {
    try {
        return CGColorGetAlpha_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorGetColorSpace typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorGetColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorGetColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorGetColorSpace").orElseThrow() }
private val CGColorGetColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorGetColorSpace_ADDR, CGColorGetColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorGetColorSpace(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorGetColorSpace_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorGetPattern typedef CGPatternRef = (Declared(CGPattern))*(typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGColorGetPattern_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorGetPattern_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorGetPattern").orElseThrow() }
private val CGColorGetPattern_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorGetPattern_ADDR, CGColorGetPattern_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorGetPattern(arg0: MemorySegment): MemorySegment {
    try {
        return CGColorGetPattern_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGColorGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGColorGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGColorGetTypeID").orElseThrow() }
private val CGColorGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGColorGetTypeID_ADDR, CGColorGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGColorGetTypeID(): Long {
    try {
        return CGColorGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}
