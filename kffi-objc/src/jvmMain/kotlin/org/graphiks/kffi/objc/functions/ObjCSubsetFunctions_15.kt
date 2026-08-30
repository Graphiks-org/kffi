@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : NSSubjectDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSSubjectDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSubjectDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSubjectDocumentAttribute").orElseThrow().reinterpret(NSSubjectDocumentAttribute_LAYOUT.byteSize()) }
private val NSSubjectDocumentAttribute_VH: VarHandle by lazy { NSSubjectDocumentAttribute_LAYOUT.varHandle() }

var NSSubjectDocumentAttribute: MemorySegment
    get() = NSSubjectDocumentAttribute_VH.get(NSSubjectDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSSubjectDocumentAttribute_VH.set(NSSubjectDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAuthorDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSAuthorDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAuthorDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAuthorDocumentAttribute").orElseThrow().reinterpret(NSAuthorDocumentAttribute_LAYOUT.byteSize()) }
private val NSAuthorDocumentAttribute_VH: VarHandle by lazy { NSAuthorDocumentAttribute_LAYOUT.varHandle() }

var NSAuthorDocumentAttribute: MemorySegment
    get() = NSAuthorDocumentAttribute_VH.get(NSAuthorDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSAuthorDocumentAttribute_VH.set(NSAuthorDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKeywordsDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSKeywordsDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKeywordsDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSKeywordsDocumentAttribute").orElseThrow().reinterpret(NSKeywordsDocumentAttribute_LAYOUT.byteSize()) }
private val NSKeywordsDocumentAttribute_VH: VarHandle by lazy { NSKeywordsDocumentAttribute_LAYOUT.varHandle() }

var NSKeywordsDocumentAttribute: MemorySegment
    get() = NSKeywordsDocumentAttribute_VH.get(NSKeywordsDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSKeywordsDocumentAttribute_VH.set(NSKeywordsDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCommentDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSCommentDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCommentDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCommentDocumentAttribute").orElseThrow().reinterpret(NSCommentDocumentAttribute_LAYOUT.byteSize()) }
private val NSCommentDocumentAttribute_VH: VarHandle by lazy { NSCommentDocumentAttribute_LAYOUT.varHandle() }

var NSCommentDocumentAttribute: MemorySegment
    get() = NSCommentDocumentAttribute_VH.get(NSCommentDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSCommentDocumentAttribute_VH.set(NSCommentDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSEditorDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSEditorDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSEditorDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEditorDocumentAttribute").orElseThrow().reinterpret(NSEditorDocumentAttribute_LAYOUT.byteSize()) }
private val NSEditorDocumentAttribute_VH: VarHandle by lazy { NSEditorDocumentAttribute_LAYOUT.varHandle() }

var NSEditorDocumentAttribute: MemorySegment
    get() = NSEditorDocumentAttribute_VH.get(NSEditorDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSEditorDocumentAttribute_VH.set(NSEditorDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCreationTimeDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSCreationTimeDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCreationTimeDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCreationTimeDocumentAttribute").orElseThrow().reinterpret(NSCreationTimeDocumentAttribute_LAYOUT.byteSize()) }
private val NSCreationTimeDocumentAttribute_VH: VarHandle by lazy { NSCreationTimeDocumentAttribute_LAYOUT.varHandle() }

var NSCreationTimeDocumentAttribute: MemorySegment
    get() = NSCreationTimeDocumentAttribute_VH.get(NSCreationTimeDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSCreationTimeDocumentAttribute_VH.set(NSCreationTimeDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSModificationTimeDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSModificationTimeDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSModificationTimeDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSModificationTimeDocumentAttribute").orElseThrow().reinterpret(NSModificationTimeDocumentAttribute_LAYOUT.byteSize()) }
private val NSModificationTimeDocumentAttribute_VH: VarHandle by lazy { NSModificationTimeDocumentAttribute_LAYOUT.varHandle() }

var NSModificationTimeDocumentAttribute: MemorySegment
    get() = NSModificationTimeDocumentAttribute_VH.get(NSModificationTimeDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSModificationTimeDocumentAttribute_VH.set(NSModificationTimeDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSManagerDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSManagerDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSManagerDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSManagerDocumentAttribute").orElseThrow().reinterpret(NSManagerDocumentAttribute_LAYOUT.byteSize()) }
private val NSManagerDocumentAttribute_VH: VarHandle by lazy { NSManagerDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSManagerDocumentAttribute: MemorySegment
    get() = NSManagerDocumentAttribute_VH.get(NSManagerDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSManagerDocumentAttribute_VH.set(NSManagerDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCategoryDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSCategoryDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCategoryDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCategoryDocumentAttribute").orElseThrow().reinterpret(NSCategoryDocumentAttribute_LAYOUT.byteSize()) }
private val NSCategoryDocumentAttribute_VH: VarHandle by lazy { NSCategoryDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSCategoryDocumentAttribute: MemorySegment
    get() = NSCategoryDocumentAttribute_VH.get(NSCategoryDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSCategoryDocumentAttribute_VH.set(NSCategoryDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAppearanceDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSAppearanceDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceDocumentAttribute").orElseThrow().reinterpret(NSAppearanceDocumentAttribute_LAYOUT.byteSize()) }
private val NSAppearanceDocumentAttribute_VH: VarHandle by lazy { NSAppearanceDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
var NSAppearanceDocumentAttribute: MemorySegment
    get() = NSAppearanceDocumentAttribute_VH.get(NSAppearanceDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSAppearanceDocumentAttribute_VH.set(NSAppearanceDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExcludedElementsDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSExcludedElementsDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExcludedElementsDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSExcludedElementsDocumentAttribute").orElseThrow().reinterpret(NSExcludedElementsDocumentAttribute_LAYOUT.byteSize()) }
private val NSExcludedElementsDocumentAttribute_VH: VarHandle by lazy { NSExcludedElementsDocumentAttribute_LAYOUT.varHandle() }

var NSExcludedElementsDocumentAttribute: MemorySegment
    get() = NSExcludedElementsDocumentAttribute_VH.get(NSExcludedElementsDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSExcludedElementsDocumentAttribute_VH.set(NSExcludedElementsDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextEncodingNameDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSTextEncodingNameDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextEncodingNameDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextEncodingNameDocumentAttribute").orElseThrow().reinterpret(NSTextEncodingNameDocumentAttribute_LAYOUT.byteSize()) }
private val NSTextEncodingNameDocumentAttribute_VH: VarHandle by lazy { NSTextEncodingNameDocumentAttribute_LAYOUT.varHandle() }

var NSTextEncodingNameDocumentAttribute: MemorySegment
    get() = NSTextEncodingNameDocumentAttribute_VH.get(NSTextEncodingNameDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextEncodingNameDocumentAttribute_VH.set(NSTextEncodingNameDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPrefixSpacesDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSPrefixSpacesDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrefixSpacesDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrefixSpacesDocumentAttribute").orElseThrow().reinterpret(NSPrefixSpacesDocumentAttribute_LAYOUT.byteSize()) }
private val NSPrefixSpacesDocumentAttribute_VH: VarHandle by lazy { NSPrefixSpacesDocumentAttribute_LAYOUT.varHandle() }

var NSPrefixSpacesDocumentAttribute: MemorySegment
    get() = NSPrefixSpacesDocumentAttribute_VH.get(NSPrefixSpacesDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSPrefixSpacesDocumentAttribute_VH.set(NSPrefixSpacesDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLeftMarginDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSLeftMarginDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLeftMarginDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLeftMarginDocumentAttribute").orElseThrow().reinterpret(NSLeftMarginDocumentAttribute_LAYOUT.byteSize()) }
private val NSLeftMarginDocumentAttribute_VH: VarHandle by lazy { NSLeftMarginDocumentAttribute_LAYOUT.varHandle() }

var NSLeftMarginDocumentAttribute: MemorySegment
    get() = NSLeftMarginDocumentAttribute_VH.get(NSLeftMarginDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSLeftMarginDocumentAttribute_VH.set(NSLeftMarginDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRightMarginDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSRightMarginDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRightMarginDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRightMarginDocumentAttribute").orElseThrow().reinterpret(NSRightMarginDocumentAttribute_LAYOUT.byteSize()) }
private val NSRightMarginDocumentAttribute_VH: VarHandle by lazy { NSRightMarginDocumentAttribute_LAYOUT.varHandle() }

var NSRightMarginDocumentAttribute: MemorySegment
    get() = NSRightMarginDocumentAttribute_VH.get(NSRightMarginDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSRightMarginDocumentAttribute_VH.set(NSRightMarginDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTopMarginDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSTopMarginDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTopMarginDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTopMarginDocumentAttribute").orElseThrow().reinterpret(NSTopMarginDocumentAttribute_LAYOUT.byteSize()) }
private val NSTopMarginDocumentAttribute_VH: VarHandle by lazy { NSTopMarginDocumentAttribute_LAYOUT.varHandle() }

var NSTopMarginDocumentAttribute: MemorySegment
    get() = NSTopMarginDocumentAttribute_VH.get(NSTopMarginDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSTopMarginDocumentAttribute_VH.set(NSTopMarginDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBottomMarginDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSBottomMarginDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBottomMarginDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBottomMarginDocumentAttribute").orElseThrow().reinterpret(NSBottomMarginDocumentAttribute_LAYOUT.byteSize()) }
private val NSBottomMarginDocumentAttribute_VH: VarHandle by lazy { NSBottomMarginDocumentAttribute_LAYOUT.varHandle() }

var NSBottomMarginDocumentAttribute: MemorySegment
    get() = NSBottomMarginDocumentAttribute_VH.get(NSBottomMarginDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSBottomMarginDocumentAttribute_VH.set(NSBottomMarginDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextEncodingNameDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSTextEncodingNameDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextEncodingNameDocumentOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextEncodingNameDocumentOption").orElseThrow().reinterpret(NSTextEncodingNameDocumentOption_LAYOUT.byteSize()) }
private val NSTextEncodingNameDocumentOption_VH: VarHandle by lazy { NSTextEncodingNameDocumentOption_LAYOUT.varHandle() }

var NSTextEncodingNameDocumentOption: MemorySegment
    get() = NSTextEncodingNameDocumentOption_VH.get(NSTextEncodingNameDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextEncodingNameDocumentOption_VH.set(NSTextEncodingNameDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBaseURLDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSBaseURLDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBaseURLDocumentOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBaseURLDocumentOption").orElseThrow().reinterpret(NSBaseURLDocumentOption_LAYOUT.byteSize()) }
private val NSBaseURLDocumentOption_VH: VarHandle by lazy { NSBaseURLDocumentOption_LAYOUT.varHandle() }

var NSBaseURLDocumentOption: MemorySegment
    get() = NSBaseURLDocumentOption_VH.get(NSBaseURLDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSBaseURLDocumentOption_VH.set(NSBaseURLDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTimeoutDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSTimeoutDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTimeoutDocumentOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTimeoutDocumentOption").orElseThrow().reinterpret(NSTimeoutDocumentOption_LAYOUT.byteSize()) }
private val NSTimeoutDocumentOption_VH: VarHandle by lazy { NSTimeoutDocumentOption_LAYOUT.varHandle() }

var NSTimeoutDocumentOption: MemorySegment
    get() = NSTimeoutDocumentOption_VH.get(NSTimeoutDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSTimeoutDocumentOption_VH.set(NSTimeoutDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWebPreferencesDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSWebPreferencesDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWebPreferencesDocumentOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWebPreferencesDocumentOption").orElseThrow().reinterpret(NSWebPreferencesDocumentOption_LAYOUT.byteSize()) }
private val NSWebPreferencesDocumentOption_VH: VarHandle by lazy { NSWebPreferencesDocumentOption_LAYOUT.varHandle() }

var NSWebPreferencesDocumentOption: MemorySegment
    get() = NSWebPreferencesDocumentOption_VH.get(NSWebPreferencesDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSWebPreferencesDocumentOption_VH.set(NSWebPreferencesDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWebResourceLoadDelegateDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSWebResourceLoadDelegateDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWebResourceLoadDelegateDocumentOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWebResourceLoadDelegateDocumentOption").orElseThrow().reinterpret(NSWebResourceLoadDelegateDocumentOption_LAYOUT.byteSize()) }
private val NSWebResourceLoadDelegateDocumentOption_VH: VarHandle by lazy { NSWebResourceLoadDelegateDocumentOption_LAYOUT.varHandle() }

var NSWebResourceLoadDelegateDocumentOption: MemorySegment
    get() = NSWebResourceLoadDelegateDocumentOption_VH.get(NSWebResourceLoadDelegateDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSWebResourceLoadDelegateDocumentOption_VH.set(NSWebResourceLoadDelegateDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextSizeMultiplierDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSTextSizeMultiplierDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextSizeMultiplierDocumentOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextSizeMultiplierDocumentOption").orElseThrow().reinterpret(NSTextSizeMultiplierDocumentOption_LAYOUT.byteSize()) }
private val NSTextSizeMultiplierDocumentOption_VH: VarHandle by lazy { NSTextSizeMultiplierDocumentOption_LAYOUT.varHandle() }

var NSTextSizeMultiplierDocumentOption: MemorySegment
    get() = NSTextSizeMultiplierDocumentOption_VH.get(NSTextSizeMultiplierDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextSizeMultiplierDocumentOption_VH.set(NSTextSizeMultiplierDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSFileTypeDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeDocumentOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileTypeDocumentOption").orElseThrow().reinterpret(NSFileTypeDocumentOption_LAYOUT.byteSize()) }
private val NSFileTypeDocumentOption_VH: VarHandle by lazy { NSFileTypeDocumentOption_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSFileTypeDocumentOption: MemorySegment
    get() = NSFileTypeDocumentOption_VH.get(NSFileTypeDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeDocumentOption_VH.set(NSFileTypeDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCharacterShapeAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSCharacterShapeAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCharacterShapeAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCharacterShapeAttributeName").orElseThrow().reinterpret(NSCharacterShapeAttributeName_LAYOUT.byteSize()) }
private val NSCharacterShapeAttributeName_VH: VarHandle by lazy { NSCharacterShapeAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "This attribute is bound to a specific implementation of ATS feature and not generically supported by wide range of fonts. The majority of characters accessed through this API are now encoded in the Unicode standard. Use the CTFont feature API for fine control over character shape choices.")
var NSCharacterShapeAttributeName: MemorySegment
    get() = NSCharacterShapeAttributeName_VH.get(NSCharacterShapeAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSCharacterShapeAttributeName_VH.set(NSCharacterShapeAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUsesScreenFontsDocumentAttribute typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSUsesScreenFontsDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUsesScreenFontsDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUsesScreenFontsDocumentAttribute").orElseThrow().reinterpret(NSUsesScreenFontsDocumentAttribute_LAYOUT.byteSize()) }
private val NSUsesScreenFontsDocumentAttribute_VH: VarHandle by lazy { NSUsesScreenFontsDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
var NSUsesScreenFontsDocumentAttribute: MemorySegment
    get() = NSUsesScreenFontsDocumentAttribute_VH.get(NSUsesScreenFontsDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSUsesScreenFontsDocumentAttribute_VH.set(NSUsesScreenFontsDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSObliquenessAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSObliquenessAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSObliquenessAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSObliquenessAttributeName").orElseThrow().reinterpret(NSObliquenessAttributeName_LAYOUT.byteSize()) }
private val NSObliquenessAttributeName_VH: VarHandle by lazy { NSObliquenessAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
var NSObliquenessAttributeName: MemorySegment
    get() = NSObliquenessAttributeName_VH.get(NSObliquenessAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSObliquenessAttributeName_VH.set(NSObliquenessAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExpansionAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSExpansionAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExpansionAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSExpansionAttributeName").orElseThrow().reinterpret(NSExpansionAttributeName_LAYOUT.byteSize()) }
private val NSExpansionAttributeName_VH: VarHandle by lazy { NSExpansionAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
var NSExpansionAttributeName: MemorySegment
    get() = NSExpansionAttributeName_VH.get(NSExpansionAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSExpansionAttributeName_VH.set(NSExpansionAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVerticalGlyphFormAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSVerticalGlyphFormAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVerticalGlyphFormAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSVerticalGlyphFormAttributeName").orElseThrow().reinterpret(NSVerticalGlyphFormAttributeName_LAYOUT.byteSize()) }
private val NSVerticalGlyphFormAttributeName_VH: VarHandle by lazy { NSVerticalGlyphFormAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This attribute is not supported with TextKit 2")
var NSVerticalGlyphFormAttributeName: MemorySegment
    get() = NSVerticalGlyphFormAttributeName_VH.get(NSVerticalGlyphFormAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSVerticalGlyphFormAttributeName_VH.set(NSVerticalGlyphFormAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnderlineStrikethroughMask typedef NSUInteger = UNSIGNED = Long
 */
private val NSUnderlineStrikethroughMask_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val NSUnderlineStrikethroughMask_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUnderlineStrikethroughMask").orElseThrow().reinterpret(NSUnderlineStrikethroughMask_LAYOUT.byteSize()) }
private val NSUnderlineStrikethroughMask_VH: VarHandle by lazy { NSUnderlineStrikethroughMask_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use NSStrikethroughStyleAttributeName instead")
var NSUnderlineStrikethroughMask: Long
    get() = NSUnderlineStrikethroughMask_VH.get(NSUnderlineStrikethroughMask_SEGMENT, 0L) as Long
    set(value) = NSUnderlineStrikethroughMask_VH.set(NSUnderlineStrikethroughMask_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnderlineByWordMask typedef NSUInteger = UNSIGNED = Long
 */
private val NSUnderlineByWordMask_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_LONG }
private val NSUnderlineByWordMask_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUnderlineByWordMask").orElseThrow().reinterpret(NSUnderlineByWordMask_LAYOUT.byteSize()) }
private val NSUnderlineByWordMask_VH: VarHandle by lazy { NSUnderlineByWordMask_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSUnderlineByWord instead")
var NSUnderlineByWordMask: Long
    get() = NSUnderlineByWordMask_VH.get(NSUnderlineByWordMask_SEGMENT, 0L) as Long
    set(value) = NSUnderlineByWordMask_VH.set(NSUnderlineByWordMask_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextStorageWillProcessEditingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextStorageWillProcessEditingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextStorageWillProcessEditingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextStorageWillProcessEditingNotification").orElseThrow().reinterpret(NSTextStorageWillProcessEditingNotification_LAYOUT.byteSize()) }
private val NSTextStorageWillProcessEditingNotification_VH: VarHandle by lazy { NSTextStorageWillProcessEditingNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
var NSTextStorageWillProcessEditingNotification: MemorySegment
    get() = NSTextStorageWillProcessEditingNotification_VH.get(NSTextStorageWillProcessEditingNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextStorageWillProcessEditingNotification_VH.set(NSTextStorageWillProcessEditingNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextStorageDidProcessEditingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextStorageDidProcessEditingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextStorageDidProcessEditingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextStorageDidProcessEditingNotification").orElseThrow().reinterpret(NSTextStorageDidProcessEditingNotification_LAYOUT.byteSize()) }
private val NSTextStorageDidProcessEditingNotification_VH: VarHandle by lazy { NSTextStorageDidProcessEditingNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
var NSTextStorageDidProcessEditingNotification: MemorySegment
    get() = NSTextStorageDidProcessEditingNotification_VH.get(NSTextStorageDidProcessEditingNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextStorageDidProcessEditingNotification_VH.set(NSTextStorageDidProcessEditingNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarItemKey typedef const NSToolbarUserInfoKey = (Void)*
 */
private val NSToolbarItemKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarItemKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarItemKey").orElseThrow().reinterpret(NSToolbarItemKey_LAYOUT.byteSize()) }
private val NSToolbarItemKey_VH: VarHandle by lazy { NSToolbarItemKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarItemKey: MemorySegment
    get() = NSToolbarItemKey_VH.get(NSToolbarItemKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarItemKey_VH.set(NSToolbarItemKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarNewIndexKey typedef const NSToolbarUserInfoKey = (Void)*
 */
private val NSToolbarNewIndexKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarNewIndexKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarNewIndexKey").orElseThrow().reinterpret(NSToolbarNewIndexKey_LAYOUT.byteSize()) }
private val NSToolbarNewIndexKey_VH: VarHandle by lazy { NSToolbarNewIndexKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarNewIndexKey: MemorySegment
    get() = NSToolbarNewIndexKey_VH.get(NSToolbarNewIndexKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarNewIndexKey_VH.set(NSToolbarNewIndexKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarWillAddItemNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSToolbarWillAddItemNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarWillAddItemNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarWillAddItemNotification").orElseThrow().reinterpret(NSToolbarWillAddItemNotification_LAYOUT.byteSize()) }
private val NSToolbarWillAddItemNotification_VH: VarHandle by lazy { NSToolbarWillAddItemNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarWillAddItemNotification: MemorySegment
    get() = NSToolbarWillAddItemNotification_VH.get(NSToolbarWillAddItemNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarWillAddItemNotification_VH.set(NSToolbarWillAddItemNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarDidRemoveItemNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSToolbarDidRemoveItemNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarDidRemoveItemNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarDidRemoveItemNotification").orElseThrow().reinterpret(NSToolbarDidRemoveItemNotification_LAYOUT.byteSize()) }
private val NSToolbarDidRemoveItemNotification_VH: VarHandle by lazy { NSToolbarDidRemoveItemNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarDidRemoveItemNotification: MemorySegment
    get() = NSToolbarDidRemoveItemNotification_VH.get(NSToolbarDidRemoveItemNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarDidRemoveItemNotification_VH.set(NSToolbarDidRemoveItemNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarSpaceItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarSpaceItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarSpaceItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarSpaceItemIdentifier").orElseThrow().reinterpret(NSToolbarSpaceItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarSpaceItemIdentifier_VH: VarHandle by lazy { NSToolbarSpaceItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarSpaceItemIdentifier: MemorySegment
    get() = NSToolbarSpaceItemIdentifier_VH.get(NSToolbarSpaceItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarSpaceItemIdentifier_VH.set(NSToolbarSpaceItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarFlexibleSpaceItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarFlexibleSpaceItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarFlexibleSpaceItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarFlexibleSpaceItemIdentifier").orElseThrow().reinterpret(NSToolbarFlexibleSpaceItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarFlexibleSpaceItemIdentifier_VH: VarHandle by lazy { NSToolbarFlexibleSpaceItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarFlexibleSpaceItemIdentifier: MemorySegment
    get() = NSToolbarFlexibleSpaceItemIdentifier_VH.get(NSToolbarFlexibleSpaceItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarFlexibleSpaceItemIdentifier_VH.set(NSToolbarFlexibleSpaceItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarShowColorsItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarShowColorsItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarShowColorsItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarShowColorsItemIdentifier").orElseThrow().reinterpret(NSToolbarShowColorsItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarShowColorsItemIdentifier_VH: VarHandle by lazy { NSToolbarShowColorsItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarShowColorsItemIdentifier: MemorySegment
    get() = NSToolbarShowColorsItemIdentifier_VH.get(NSToolbarShowColorsItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarShowColorsItemIdentifier_VH.set(NSToolbarShowColorsItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarShowFontsItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarShowFontsItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarShowFontsItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarShowFontsItemIdentifier").orElseThrow().reinterpret(NSToolbarShowFontsItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarShowFontsItemIdentifier_VH: VarHandle by lazy { NSToolbarShowFontsItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarShowFontsItemIdentifier: MemorySegment
    get() = NSToolbarShowFontsItemIdentifier_VH.get(NSToolbarShowFontsItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarShowFontsItemIdentifier_VH.set(NSToolbarShowFontsItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarPrintItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarPrintItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarPrintItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarPrintItemIdentifier").orElseThrow().reinterpret(NSToolbarPrintItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarPrintItemIdentifier_VH: VarHandle by lazy { NSToolbarPrintItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarPrintItemIdentifier: MemorySegment
    get() = NSToolbarPrintItemIdentifier_VH.get(NSToolbarPrintItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarPrintItemIdentifier_VH.set(NSToolbarPrintItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarToggleSidebarItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarToggleSidebarItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarToggleSidebarItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarToggleSidebarItemIdentifier").orElseThrow().reinterpret(NSToolbarToggleSidebarItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarToggleSidebarItemIdentifier_VH: VarHandle by lazy { NSToolbarToggleSidebarItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var NSToolbarToggleSidebarItemIdentifier: MemorySegment
    get() = NSToolbarToggleSidebarItemIdentifier_VH.get(NSToolbarToggleSidebarItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarToggleSidebarItemIdentifier_VH.set(NSToolbarToggleSidebarItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarToggleInspectorItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarToggleInspectorItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarToggleInspectorItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarToggleInspectorItemIdentifier").orElseThrow().reinterpret(NSToolbarToggleInspectorItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarToggleInspectorItemIdentifier_VH: VarHandle by lazy { NSToolbarToggleInspectorItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarToggleInspectorItemIdentifier: MemorySegment
    get() = NSToolbarToggleInspectorItemIdentifier_VH.get(NSToolbarToggleInspectorItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarToggleInspectorItemIdentifier_VH.set(NSToolbarToggleInspectorItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarCloudSharingItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarCloudSharingItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarCloudSharingItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarCloudSharingItemIdentifier").orElseThrow().reinterpret(NSToolbarCloudSharingItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarCloudSharingItemIdentifier_VH: VarHandle by lazy { NSToolbarCloudSharingItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSToolbarCloudSharingItemIdentifier: MemorySegment
    get() = NSToolbarCloudSharingItemIdentifier_VH.get(NSToolbarCloudSharingItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarCloudSharingItemIdentifier_VH.set(NSToolbarCloudSharingItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarWritingToolsItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarWritingToolsItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarWritingToolsItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarWritingToolsItemIdentifier").orElseThrow().reinterpret(NSToolbarWritingToolsItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarWritingToolsItemIdentifier_VH: VarHandle by lazy { NSToolbarWritingToolsItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
var NSToolbarWritingToolsItemIdentifier: MemorySegment
    get() = NSToolbarWritingToolsItemIdentifier_VH.get(NSToolbarWritingToolsItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarWritingToolsItemIdentifier_VH.set(NSToolbarWritingToolsItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarSidebarTrackingSeparatorItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarSidebarTrackingSeparatorItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarSidebarTrackingSeparatorItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarSidebarTrackingSeparatorItemIdentifier").orElseThrow().reinterpret(NSToolbarSidebarTrackingSeparatorItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarSidebarTrackingSeparatorItemIdentifier_VH: VarHandle by lazy { NSToolbarSidebarTrackingSeparatorItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarSidebarTrackingSeparatorItemIdentifier: MemorySegment
    get() = NSToolbarSidebarTrackingSeparatorItemIdentifier_VH.get(NSToolbarSidebarTrackingSeparatorItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarSidebarTrackingSeparatorItemIdentifier_VH.set(NSToolbarSidebarTrackingSeparatorItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarInspectorTrackingSeparatorItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarInspectorTrackingSeparatorItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarInspectorTrackingSeparatorItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarInspectorTrackingSeparatorItemIdentifier").orElseThrow().reinterpret(NSToolbarInspectorTrackingSeparatorItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarInspectorTrackingSeparatorItemIdentifier_VH: VarHandle by lazy { NSToolbarInspectorTrackingSeparatorItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSToolbarInspectorTrackingSeparatorItemIdentifier: MemorySegment
    get() = NSToolbarInspectorTrackingSeparatorItemIdentifier_VH.get(NSToolbarInspectorTrackingSeparatorItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarInspectorTrackingSeparatorItemIdentifier_VH.set(NSToolbarInspectorTrackingSeparatorItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarSeparatorItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarSeparatorItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarSeparatorItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarSeparatorItemIdentifier").orElseThrow().reinterpret(NSToolbarSeparatorItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarSeparatorItemIdentifier_VH: VarHandle by lazy { NSToolbarSeparatorItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This item is no longer recommended and will be ignored on 10.7 and later.")
var NSToolbarSeparatorItemIdentifier: MemorySegment
    get() = NSToolbarSeparatorItemIdentifier_VH.get(NSToolbarSeparatorItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarSeparatorItemIdentifier_VH.set(NSToolbarSeparatorItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolbarCustomizeToolbarItemIdentifier typedef NSToolbarItemIdentifier = typedef NSString = (Void)*
 */
private val NSToolbarCustomizeToolbarItemIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolbarCustomizeToolbarItemIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolbarCustomizeToolbarItemIdentifier").orElseThrow().reinterpret(NSToolbarCustomizeToolbarItemIdentifier_LAYOUT.byteSize()) }
private val NSToolbarCustomizeToolbarItemIdentifier_VH: VarHandle by lazy { NSToolbarCustomizeToolbarItemIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This item is no longer recommended and will be ignored on 10.7 and later.")
var NSToolbarCustomizeToolbarItemIdentifier: MemorySegment
    get() = NSToolbarCustomizeToolbarItemIdentifier_VH.get(NSToolbarCustomizeToolbarItemIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolbarCustomizeToolbarItemIdentifier_VH.set(NSToolbarCustomizeToolbarItemIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSComboBoxWillPopUpNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSComboBoxWillPopUpNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSComboBoxWillPopUpNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSComboBoxWillPopUpNotification").orElseThrow().reinterpret(NSComboBoxWillPopUpNotification_LAYOUT.byteSize()) }
private val NSComboBoxWillPopUpNotification_VH: VarHandle by lazy { NSComboBoxWillPopUpNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSComboBoxWillPopUpNotification: MemorySegment
    get() = NSComboBoxWillPopUpNotification_VH.get(NSComboBoxWillPopUpNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSComboBoxWillPopUpNotification_VH.set(NSComboBoxWillPopUpNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSComboBoxWillDismissNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSComboBoxWillDismissNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSComboBoxWillDismissNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSComboBoxWillDismissNotification").orElseThrow().reinterpret(NSComboBoxWillDismissNotification_LAYOUT.byteSize()) }
private val NSComboBoxWillDismissNotification_VH: VarHandle by lazy { NSComboBoxWillDismissNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSComboBoxWillDismissNotification: MemorySegment
    get() = NSComboBoxWillDismissNotification_VH.get(NSComboBoxWillDismissNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSComboBoxWillDismissNotification_VH.set(NSComboBoxWillDismissNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSComboBoxSelectionDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSComboBoxSelectionDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSComboBoxSelectionDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSComboBoxSelectionDidChangeNotification").orElseThrow().reinterpret(NSComboBoxSelectionDidChangeNotification_LAYOUT.byteSize()) }
private val NSComboBoxSelectionDidChangeNotification_VH: VarHandle by lazy { NSComboBoxSelectionDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSComboBoxSelectionDidChangeNotification: MemorySegment
    get() = NSComboBoxSelectionDidChangeNotification_VH.get(NSComboBoxSelectionDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSComboBoxSelectionDidChangeNotification_VH.set(NSComboBoxSelectionDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSComboBoxSelectionIsChangingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSComboBoxSelectionIsChangingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSComboBoxSelectionIsChangingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSComboBoxSelectionIsChangingNotification").orElseThrow().reinterpret(NSComboBoxSelectionIsChangingNotification_LAYOUT.byteSize()) }
private val NSComboBoxSelectionIsChangingNotification_VH: VarHandle by lazy { NSComboBoxSelectionIsChangingNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSComboBoxSelectionIsChangingNotification: MemorySegment
    get() = NSComboBoxSelectionIsChangingNotification_VH.get(NSComboBoxSelectionIsChangingNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSComboBoxSelectionIsChangingNotification_VH.set(NSComboBoxSelectionIsChangingNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAllRomanInputSourcesLocaleIdentifier typedef NSString = (Void)*
 */
private val NSAllRomanInputSourcesLocaleIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAllRomanInputSourcesLocaleIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllRomanInputSourcesLocaleIdentifier").orElseThrow().reinterpret(NSAllRomanInputSourcesLocaleIdentifier_LAYOUT.byteSize()) }
private val NSAllRomanInputSourcesLocaleIdentifier_VH: VarHandle by lazy { NSAllRomanInputSourcesLocaleIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSAllRomanInputSourcesLocaleIdentifier: MemorySegment
    get() = NSAllRomanInputSourcesLocaleIdentifier_VH.get(NSAllRomanInputSourcesLocaleIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSAllRomanInputSourcesLocaleIdentifier_VH.set(NSAllRomanInputSourcesLocaleIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierCharacterPicker typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierCharacterPicker_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierCharacterPicker_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierCharacterPicker").orElseThrow().reinterpret(NSTouchBarItemIdentifierCharacterPicker_LAYOUT.byteSize()) }
private val NSTouchBarItemIdentifierCharacterPicker_VH: VarHandle by lazy { NSTouchBarItemIdentifierCharacterPicker_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSTouchBarItemIdentifierCharacterPicker: MemorySegment
    get() = NSTouchBarItemIdentifierCharacterPicker_VH.get(NSTouchBarItemIdentifierCharacterPicker_SEGMENT, 0L) as MemorySegment
    set(value) = NSTouchBarItemIdentifierCharacterPicker_VH.set(NSTouchBarItemIdentifierCharacterPicker_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierTextColorPicker typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierTextColorPicker_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierTextColorPicker_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierTextColorPicker").orElseThrow().reinterpret(NSTouchBarItemIdentifierTextColorPicker_LAYOUT.byteSize()) }
private val NSTouchBarItemIdentifierTextColorPicker_VH: VarHandle by lazy { NSTouchBarItemIdentifierTextColorPicker_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSTouchBarItemIdentifierTextColorPicker: MemorySegment
    get() = NSTouchBarItemIdentifierTextColorPicker_VH.get(NSTouchBarItemIdentifierTextColorPicker_SEGMENT, 0L) as MemorySegment
    set(value) = NSTouchBarItemIdentifierTextColorPicker_VH.set(NSTouchBarItemIdentifierTextColorPicker_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierTextStyle typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierTextStyle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierTextStyle_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierTextStyle").orElseThrow().reinterpret(NSTouchBarItemIdentifierTextStyle_LAYOUT.byteSize()) }
private val NSTouchBarItemIdentifierTextStyle_VH: VarHandle by lazy { NSTouchBarItemIdentifierTextStyle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSTouchBarItemIdentifierTextStyle: MemorySegment
    get() = NSTouchBarItemIdentifierTextStyle_VH.get(NSTouchBarItemIdentifierTextStyle_SEGMENT, 0L) as MemorySegment
    set(value) = NSTouchBarItemIdentifierTextStyle_VH.set(NSTouchBarItemIdentifierTextStyle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierTextAlignment typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierTextAlignment_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierTextAlignment_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierTextAlignment").orElseThrow().reinterpret(NSTouchBarItemIdentifierTextAlignment_LAYOUT.byteSize()) }
private val NSTouchBarItemIdentifierTextAlignment_VH: VarHandle by lazy { NSTouchBarItemIdentifierTextAlignment_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSTouchBarItemIdentifierTextAlignment: MemorySegment
    get() = NSTouchBarItemIdentifierTextAlignment_VH.get(NSTouchBarItemIdentifierTextAlignment_SEGMENT, 0L) as MemorySegment
    set(value) = NSTouchBarItemIdentifierTextAlignment_VH.set(NSTouchBarItemIdentifierTextAlignment_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierTextList typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierTextList_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierTextList_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierTextList").orElseThrow().reinterpret(NSTouchBarItemIdentifierTextList_LAYOUT.byteSize()) }
private val NSTouchBarItemIdentifierTextList_VH: VarHandle by lazy { NSTouchBarItemIdentifierTextList_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSTouchBarItemIdentifierTextList: MemorySegment
    get() = NSTouchBarItemIdentifierTextList_VH.get(NSTouchBarItemIdentifierTextList_SEGMENT, 0L) as MemorySegment
    set(value) = NSTouchBarItemIdentifierTextList_VH.set(NSTouchBarItemIdentifierTextList_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierTextFormat typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierTextFormat_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierTextFormat_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierTextFormat").orElseThrow().reinterpret(NSTouchBarItemIdentifierTextFormat_LAYOUT.byteSize()) }
private val NSTouchBarItemIdentifierTextFormat_VH: VarHandle by lazy { NSTouchBarItemIdentifierTextFormat_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSTouchBarItemIdentifierTextFormat: MemorySegment
    get() = NSTouchBarItemIdentifierTextFormat_VH.get(NSTouchBarItemIdentifierTextFormat_SEGMENT, 0L) as MemorySegment
    set(value) = NSTouchBarItemIdentifierTextFormat_VH.set(NSTouchBarItemIdentifierTextFormat_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextViewWillChangeNotifyingTextViewNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextViewWillChangeNotifyingTextViewNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextViewWillChangeNotifyingTextViewNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextViewWillChangeNotifyingTextViewNotification").orElseThrow().reinterpret(NSTextViewWillChangeNotifyingTextViewNotification_LAYOUT.byteSize()) }
private val NSTextViewWillChangeNotifyingTextViewNotification_VH: VarHandle by lazy { NSTextViewWillChangeNotifyingTextViewNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSTextViewWillChangeNotifyingTextViewNotification: MemorySegment
    get() = NSTextViewWillChangeNotifyingTextViewNotification_VH.get(NSTextViewWillChangeNotifyingTextViewNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextViewWillChangeNotifyingTextViewNotification_VH.set(NSTextViewWillChangeNotifyingTextViewNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextViewDidChangeSelectionNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextViewDidChangeSelectionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextViewDidChangeSelectionNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextViewDidChangeSelectionNotification").orElseThrow().reinterpret(NSTextViewDidChangeSelectionNotification_LAYOUT.byteSize()) }
private val NSTextViewDidChangeSelectionNotification_VH: VarHandle by lazy { NSTextViewDidChangeSelectionNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSTextViewDidChangeSelectionNotification: MemorySegment
    get() = NSTextViewDidChangeSelectionNotification_VH.get(NSTextViewDidChangeSelectionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextViewDidChangeSelectionNotification_VH.set(NSTextViewDidChangeSelectionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextViewDidChangeTypingAttributesNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextViewDidChangeTypingAttributesNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextViewDidChangeTypingAttributesNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextViewDidChangeTypingAttributesNotification").orElseThrow().reinterpret(NSTextViewDidChangeTypingAttributesNotification_LAYOUT.byteSize()) }
private val NSTextViewDidChangeTypingAttributesNotification_VH: VarHandle by lazy { NSTextViewDidChangeTypingAttributesNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSTextViewDidChangeTypingAttributesNotification: MemorySegment
    get() = NSTextViewDidChangeTypingAttributesNotification_VH.get(NSTextViewDidChangeTypingAttributesNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextViewDidChangeTypingAttributesNotification_VH.set(NSTextViewDidChangeTypingAttributesNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextViewWillSwitchToNSLayoutManagerNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextViewWillSwitchToNSLayoutManagerNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextViewWillSwitchToNSLayoutManagerNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextViewWillSwitchToNSLayoutManagerNotification").orElseThrow().reinterpret(NSTextViewWillSwitchToNSLayoutManagerNotification_LAYOUT.byteSize()) }
private val NSTextViewWillSwitchToNSLayoutManagerNotification_VH: VarHandle by lazy { NSTextViewWillSwitchToNSLayoutManagerNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
var NSTextViewWillSwitchToNSLayoutManagerNotification: MemorySegment
    get() = NSTextViewWillSwitchToNSLayoutManagerNotification_VH.get(NSTextViewWillSwitchToNSLayoutManagerNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextViewWillSwitchToNSLayoutManagerNotification_VH.set(NSTextViewWillSwitchToNSLayoutManagerNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextViewDidSwitchToNSLayoutManagerNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextViewDidSwitchToNSLayoutManagerNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextViewDidSwitchToNSLayoutManagerNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextViewDidSwitchToNSLayoutManagerNotification").orElseThrow().reinterpret(NSTextViewDidSwitchToNSLayoutManagerNotification_LAYOUT.byteSize()) }
private val NSTextViewDidSwitchToNSLayoutManagerNotification_VH: VarHandle by lazy { NSTextViewDidSwitchToNSLayoutManagerNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
var NSTextViewDidSwitchToNSLayoutManagerNotification: MemorySegment
    get() = NSTextViewDidSwitchToNSLayoutManagerNotification_VH.get(NSTextViewDidSwitchToNSLayoutManagerNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextViewDidSwitchToNSLayoutManagerNotification_VH.set(NSTextViewDidSwitchToNSLayoutManagerNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFindPanelSearchOptionsPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSFindPanelSearchOptionsPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFindPanelSearchOptionsPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFindPanelSearchOptionsPboardType").orElseThrow().reinterpret(NSFindPanelSearchOptionsPboardType_LAYOUT.byteSize()) }
private val NSFindPanelSearchOptionsPboardType_VH: VarHandle by lazy { NSFindPanelSearchOptionsPboardType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSFindPanelSearchOptionsPboardType: MemorySegment
    get() = NSFindPanelSearchOptionsPboardType_VH.get(NSFindPanelSearchOptionsPboardType_SEGMENT, 0L) as MemorySegment
    set(value) = NSFindPanelSearchOptionsPboardType_VH.set(NSFindPanelSearchOptionsPboardType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFindPanelCaseInsensitiveSearch typedef NSPasteboardTypeFindPanelSearchOptionKey = typedef NSString = (Void)*
 */
private val NSFindPanelCaseInsensitiveSearch_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFindPanelCaseInsensitiveSearch_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFindPanelCaseInsensitiveSearch").orElseThrow().reinterpret(NSFindPanelCaseInsensitiveSearch_LAYOUT.byteSize()) }
private val NSFindPanelCaseInsensitiveSearch_VH: VarHandle by lazy { NSFindPanelCaseInsensitiveSearch_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSFindPanelCaseInsensitiveSearch: MemorySegment
    get() = NSFindPanelCaseInsensitiveSearch_VH.get(NSFindPanelCaseInsensitiveSearch_SEGMENT, 0L) as MemorySegment
    set(value) = NSFindPanelCaseInsensitiveSearch_VH.set(NSFindPanelCaseInsensitiveSearch_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFindPanelSubstringMatch typedef NSPasteboardTypeFindPanelSearchOptionKey = typedef NSString = (Void)*
 */
private val NSFindPanelSubstringMatch_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFindPanelSubstringMatch_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFindPanelSubstringMatch").orElseThrow().reinterpret(NSFindPanelSubstringMatch_LAYOUT.byteSize()) }
private val NSFindPanelSubstringMatch_VH: VarHandle by lazy { NSFindPanelSubstringMatch_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSFindPanelSubstringMatch: MemorySegment
    get() = NSFindPanelSubstringMatch_VH.get(NSFindPanelSubstringMatch_SEGMENT, 0L) as MemorySegment
    set(value) = NSFindPanelSubstringMatch_VH.set(NSFindPanelSubstringMatch_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTableViewSelectionDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTableViewSelectionDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTableViewSelectionDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTableViewSelectionDidChangeNotification").orElseThrow().reinterpret(NSTableViewSelectionDidChangeNotification_LAYOUT.byteSize()) }
private val NSTableViewSelectionDidChangeNotification_VH: VarHandle by lazy { NSTableViewSelectionDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSTableViewSelectionDidChangeNotification: MemorySegment
    get() = NSTableViewSelectionDidChangeNotification_VH.get(NSTableViewSelectionDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTableViewSelectionDidChangeNotification_VH.set(NSTableViewSelectionDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTableViewColumnDidMoveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTableViewColumnDidMoveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTableViewColumnDidMoveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTableViewColumnDidMoveNotification").orElseThrow().reinterpret(NSTableViewColumnDidMoveNotification_LAYOUT.byteSize()) }
private val NSTableViewColumnDidMoveNotification_VH: VarHandle by lazy { NSTableViewColumnDidMoveNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSTableViewColumnDidMoveNotification: MemorySegment
    get() = NSTableViewColumnDidMoveNotification_VH.get(NSTableViewColumnDidMoveNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTableViewColumnDidMoveNotification_VH.set(NSTableViewColumnDidMoveNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTableViewColumnDidResizeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTableViewColumnDidResizeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTableViewColumnDidResizeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTableViewColumnDidResizeNotification").orElseThrow().reinterpret(NSTableViewColumnDidResizeNotification_LAYOUT.byteSize()) }
private val NSTableViewColumnDidResizeNotification_VH: VarHandle by lazy { NSTableViewColumnDidResizeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSTableViewColumnDidResizeNotification: MemorySegment
    get() = NSTableViewColumnDidResizeNotification_VH.get(NSTableViewColumnDidResizeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTableViewColumnDidResizeNotification_VH.set(NSTableViewColumnDidResizeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTableViewSelectionIsChangingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTableViewSelectionIsChangingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTableViewSelectionIsChangingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTableViewSelectionIsChangingNotification").orElseThrow().reinterpret(NSTableViewSelectionIsChangingNotification_LAYOUT.byteSize()) }
private val NSTableViewSelectionIsChangingNotification_VH: VarHandle by lazy { NSTableViewSelectionIsChangingNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSTableViewSelectionIsChangingNotification: MemorySegment
    get() = NSTableViewSelectionIsChangingNotification_VH.get(NSTableViewSelectionIsChangingNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTableViewSelectionIsChangingNotification_VH.set(NSTableViewSelectionIsChangingNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTableViewRowViewKey typedef const NSUserInterfaceItemIdentifier = (Void)*
 */
private val NSTableViewRowViewKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTableViewRowViewKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTableViewRowViewKey").orElseThrow().reinterpret(NSTableViewRowViewKey_LAYOUT.byteSize()) }
private val NSTableViewRowViewKey_VH: VarHandle by lazy { NSTableViewRowViewKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSTableViewRowViewKey: MemorySegment
    get() = NSTableViewRowViewKey_VH.get(NSTableViewRowViewKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTableViewRowViewKey_VH.set(NSTableViewRowViewKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewDisclosureButtonKey typedef const NSUserInterfaceItemIdentifier = (Void)*
 */
private val NSOutlineViewDisclosureButtonKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewDisclosureButtonKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewDisclosureButtonKey").orElseThrow().reinterpret(NSOutlineViewDisclosureButtonKey_LAYOUT.byteSize()) }
private val NSOutlineViewDisclosureButtonKey_VH: VarHandle by lazy { NSOutlineViewDisclosureButtonKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSOutlineViewDisclosureButtonKey: MemorySegment
    get() = NSOutlineViewDisclosureButtonKey_VH.get(NSOutlineViewDisclosureButtonKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewDisclosureButtonKey_VH.set(NSOutlineViewDisclosureButtonKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewShowHideButtonKey typedef const NSUserInterfaceItemIdentifier = (Void)*
 */
private val NSOutlineViewShowHideButtonKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewShowHideButtonKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewShowHideButtonKey").orElseThrow().reinterpret(NSOutlineViewShowHideButtonKey_LAYOUT.byteSize()) }
private val NSOutlineViewShowHideButtonKey_VH: VarHandle by lazy { NSOutlineViewShowHideButtonKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSOutlineViewShowHideButtonKey: MemorySegment
    get() = NSOutlineViewShowHideButtonKey_VH.get(NSOutlineViewShowHideButtonKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewShowHideButtonKey_VH.set(NSOutlineViewShowHideButtonKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewSelectionDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSOutlineViewSelectionDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewSelectionDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewSelectionDidChangeNotification").orElseThrow().reinterpret(NSOutlineViewSelectionDidChangeNotification_LAYOUT.byteSize()) }
private val NSOutlineViewSelectionDidChangeNotification_VH: VarHandle by lazy { NSOutlineViewSelectionDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSOutlineViewSelectionDidChangeNotification: MemorySegment
    get() = NSOutlineViewSelectionDidChangeNotification_VH.get(NSOutlineViewSelectionDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewSelectionDidChangeNotification_VH.set(NSOutlineViewSelectionDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewColumnDidMoveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSOutlineViewColumnDidMoveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewColumnDidMoveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewColumnDidMoveNotification").orElseThrow().reinterpret(NSOutlineViewColumnDidMoveNotification_LAYOUT.byteSize()) }
private val NSOutlineViewColumnDidMoveNotification_VH: VarHandle by lazy { NSOutlineViewColumnDidMoveNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSOutlineViewColumnDidMoveNotification: MemorySegment
    get() = NSOutlineViewColumnDidMoveNotification_VH.get(NSOutlineViewColumnDidMoveNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewColumnDidMoveNotification_VH.set(NSOutlineViewColumnDidMoveNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewColumnDidResizeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSOutlineViewColumnDidResizeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewColumnDidResizeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewColumnDidResizeNotification").orElseThrow().reinterpret(NSOutlineViewColumnDidResizeNotification_LAYOUT.byteSize()) }
private val NSOutlineViewColumnDidResizeNotification_VH: VarHandle by lazy { NSOutlineViewColumnDidResizeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSOutlineViewColumnDidResizeNotification: MemorySegment
    get() = NSOutlineViewColumnDidResizeNotification_VH.get(NSOutlineViewColumnDidResizeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewColumnDidResizeNotification_VH.set(NSOutlineViewColumnDidResizeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewSelectionIsChangingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSOutlineViewSelectionIsChangingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewSelectionIsChangingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewSelectionIsChangingNotification").orElseThrow().reinterpret(NSOutlineViewSelectionIsChangingNotification_LAYOUT.byteSize()) }
private val NSOutlineViewSelectionIsChangingNotification_VH: VarHandle by lazy { NSOutlineViewSelectionIsChangingNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSOutlineViewSelectionIsChangingNotification: MemorySegment
    get() = NSOutlineViewSelectionIsChangingNotification_VH.get(NSOutlineViewSelectionIsChangingNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewSelectionIsChangingNotification_VH.set(NSOutlineViewSelectionIsChangingNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewItemWillExpandNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSOutlineViewItemWillExpandNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewItemWillExpandNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewItemWillExpandNotification").orElseThrow().reinterpret(NSOutlineViewItemWillExpandNotification_LAYOUT.byteSize()) }
private val NSOutlineViewItemWillExpandNotification_VH: VarHandle by lazy { NSOutlineViewItemWillExpandNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSOutlineViewItemWillExpandNotification: MemorySegment
    get() = NSOutlineViewItemWillExpandNotification_VH.get(NSOutlineViewItemWillExpandNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewItemWillExpandNotification_VH.set(NSOutlineViewItemWillExpandNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewItemDidExpandNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSOutlineViewItemDidExpandNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewItemDidExpandNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewItemDidExpandNotification").orElseThrow().reinterpret(NSOutlineViewItemDidExpandNotification_LAYOUT.byteSize()) }
private val NSOutlineViewItemDidExpandNotification_VH: VarHandle by lazy { NSOutlineViewItemDidExpandNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSOutlineViewItemDidExpandNotification: MemorySegment
    get() = NSOutlineViewItemDidExpandNotification_VH.get(NSOutlineViewItemDidExpandNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewItemDidExpandNotification_VH.set(NSOutlineViewItemDidExpandNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewItemWillCollapseNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSOutlineViewItemWillCollapseNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewItemWillCollapseNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewItemWillCollapseNotification").orElseThrow().reinterpret(NSOutlineViewItemWillCollapseNotification_LAYOUT.byteSize()) }
private val NSOutlineViewItemWillCollapseNotification_VH: VarHandle by lazy { NSOutlineViewItemWillCollapseNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSOutlineViewItemWillCollapseNotification: MemorySegment
    get() = NSOutlineViewItemWillCollapseNotification_VH.get(NSOutlineViewItemWillCollapseNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewItemWillCollapseNotification_VH.set(NSOutlineViewItemWillCollapseNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOutlineViewItemDidCollapseNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSOutlineViewItemDidCollapseNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOutlineViewItemDidCollapseNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOutlineViewItemDidCollapseNotification").orElseThrow().reinterpret(NSOutlineViewItemDidCollapseNotification_LAYOUT.byteSize()) }
private val NSOutlineViewItemDidCollapseNotification_VH: VarHandle by lazy { NSOutlineViewItemDidCollapseNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSOutlineViewItemDidCollapseNotification: MemorySegment
    get() = NSOutlineViewItemDidCollapseNotification_VH.get(NSOutlineViewItemDidCollapseNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSOutlineViewItemDidCollapseNotification_VH.set(NSOutlineViewItemDidCollapseNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRulerViewUnitInches typedef const NSRulerViewUnitName = (Void)*
 */
private val NSRulerViewUnitInches_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRulerViewUnitInches_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRulerViewUnitInches").orElseThrow().reinterpret(NSRulerViewUnitInches_LAYOUT.byteSize()) }
private val NSRulerViewUnitInches_VH: VarHandle by lazy { NSRulerViewUnitInches_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSRulerViewUnitInches: MemorySegment
    get() = NSRulerViewUnitInches_VH.get(NSRulerViewUnitInches_SEGMENT, 0L) as MemorySegment
    set(value) = NSRulerViewUnitInches_VH.set(NSRulerViewUnitInches_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRulerViewUnitCentimeters typedef const NSRulerViewUnitName = (Void)*
 */
private val NSRulerViewUnitCentimeters_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRulerViewUnitCentimeters_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRulerViewUnitCentimeters").orElseThrow().reinterpret(NSRulerViewUnitCentimeters_LAYOUT.byteSize()) }
private val NSRulerViewUnitCentimeters_VH: VarHandle by lazy { NSRulerViewUnitCentimeters_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSRulerViewUnitCentimeters: MemorySegment
    get() = NSRulerViewUnitCentimeters_VH.get(NSRulerViewUnitCentimeters_SEGMENT, 0L) as MemorySegment
    set(value) = NSRulerViewUnitCentimeters_VH.set(NSRulerViewUnitCentimeters_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRulerViewUnitPoints typedef const NSRulerViewUnitName = (Void)*
 */
private val NSRulerViewUnitPoints_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRulerViewUnitPoints_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRulerViewUnitPoints").orElseThrow().reinterpret(NSRulerViewUnitPoints_LAYOUT.byteSize()) }
private val NSRulerViewUnitPoints_VH: VarHandle by lazy { NSRulerViewUnitPoints_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSRulerViewUnitPoints: MemorySegment
    get() = NSRulerViewUnitPoints_VH.get(NSRulerViewUnitPoints_SEGMENT, 0L) as MemorySegment
    set(value) = NSRulerViewUnitPoints_VH.set(NSRulerViewUnitPoints_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRulerViewUnitPicas typedef const NSRulerViewUnitName = (Void)*
 */
private val NSRulerViewUnitPicas_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRulerViewUnitPicas_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRulerViewUnitPicas").orElseThrow().reinterpret(NSRulerViewUnitPicas_LAYOUT.byteSize()) }
private val NSRulerViewUnitPicas_VH: VarHandle by lazy { NSRulerViewUnitPicas_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSRulerViewUnitPicas: MemorySegment
    get() = NSRulerViewUnitPicas_VH.get(NSRulerViewUnitPicas_SEGMENT, 0L) as MemorySegment
    set(value) = NSRulerViewUnitPicas_VH.set(NSRulerViewUnitPicas_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInterfaceStyleForKey typedef NSInterfaceStyle = UNSIGNED = Long((Void)*,(Void)*)
 */
private val NSInterfaceStyleForKey_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSInterfaceStyleForKey_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInterfaceStyleForKey").orElseThrow() }
private val NSInterfaceStyleForKey_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSInterfaceStyleForKey_ADDR, NSInterfaceStyleForKey_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1)
fun NSInterfaceStyleForKey(arg0: MemorySegment, arg1: MemorySegment): Long {
    try {
        return NSInterfaceStyleForKey_HANDLE.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSInterfaceStyleDefault (Void)*
 */
private val NSInterfaceStyleDefault_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInterfaceStyleDefault_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInterfaceStyleDefault").orElseThrow().reinterpret(NSInterfaceStyleDefault_LAYOUT.byteSize()) }
private val NSInterfaceStyleDefault_VH: VarHandle by lazy { NSInterfaceStyleDefault_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1)
var NSInterfaceStyleDefault: MemorySegment
    get() = NSInterfaceStyleDefault_VH.get(NSInterfaceStyleDefault_SEGMENT, 0L) as MemorySegment
    set(value) = NSInterfaceStyleDefault_VH.set(NSInterfaceStyleDefault_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSoundPboardType typedef const NSPasteboardType = (Void)*
 */
private val NSSoundPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSoundPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSoundPboardType").orElseThrow().reinterpret(NSSoundPboardType_LAYOUT.byteSize()) }
private val NSSoundPboardType_VH: VarHandle by lazy { NSSoundPboardType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSSoundPboardType: MemorySegment
    get() = NSSoundPboardType_VH.get(NSSoundPboardType_SEGMENT, 0L) as MemorySegment
    set(value) = NSSoundPboardType_VH.set(NSSoundPboardType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDrawerWillOpenNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSDrawerWillOpenNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDrawerWillOpenNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDrawerWillOpenNotification").orElseThrow().reinterpret(NSDrawerWillOpenNotification_LAYOUT.byteSize()) }
private val NSDrawerWillOpenNotification_VH: VarHandle by lazy { NSDrawerWillOpenNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
var NSDrawerWillOpenNotification: MemorySegment
    get() = NSDrawerWillOpenNotification_VH.get(NSDrawerWillOpenNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSDrawerWillOpenNotification_VH.set(NSDrawerWillOpenNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDrawerDidOpenNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSDrawerDidOpenNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDrawerDidOpenNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDrawerDidOpenNotification").orElseThrow().reinterpret(NSDrawerDidOpenNotification_LAYOUT.byteSize()) }
private val NSDrawerDidOpenNotification_VH: VarHandle by lazy { NSDrawerDidOpenNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
var NSDrawerDidOpenNotification: MemorySegment
    get() = NSDrawerDidOpenNotification_VH.get(NSDrawerDidOpenNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSDrawerDidOpenNotification_VH.set(NSDrawerDidOpenNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDrawerWillCloseNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSDrawerWillCloseNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDrawerWillCloseNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDrawerWillCloseNotification").orElseThrow().reinterpret(NSDrawerWillCloseNotification_LAYOUT.byteSize()) }
private val NSDrawerWillCloseNotification_VH: VarHandle by lazy { NSDrawerWillCloseNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
var NSDrawerWillCloseNotification: MemorySegment
    get() = NSDrawerWillCloseNotification_VH.get(NSDrawerWillCloseNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSDrawerWillCloseNotification_VH.set(NSDrawerWillCloseNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDrawerDidCloseNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSDrawerDidCloseNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDrawerDidCloseNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDrawerDidCloseNotification").orElseThrow().reinterpret(NSDrawerDidCloseNotification_LAYOUT.byteSize()) }
private val NSDrawerDidCloseNotification_VH: VarHandle by lazy { NSDrawerDidCloseNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
var NSDrawerDidCloseNotification: MemorySegment
    get() = NSDrawerDidCloseNotification_VH.get(NSDrawerDidCloseNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSDrawerDidCloseNotification_VH.set(NSDrawerDidCloseNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOpenGLSetOption Void(typedef NSOpenGLGlobalOption = Declared(NSOpenGLGlobalOption),typedef GLint = Int)
 */
private val NSOpenGLSetOption_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val NSOpenGLSetOption_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOpenGLSetOption").orElseThrow() }
private val NSOpenGLSetOption_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSOpenGLSetOption_ADDR, NSOpenGLSetOption_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL API deprecated; please use Metal and MetalKit.  (Define GL_SILENCE_DEPRECATION to silence these warnings.)")
fun NSOpenGLSetOption(arg0: NSOpenGLGlobalOption, arg1: Int): Unit {
    try {
        NSOpenGLSetOption_HANDLE.invokeExact(arg0.value.toInt(), arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSOpenGLGetOption Void(typedef NSOpenGLGlobalOption = Declared(NSOpenGLGlobalOption),(typedef GLint = Int)*)
 */
private val NSOpenGLGetOption_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val NSOpenGLGetOption_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOpenGLGetOption").orElseThrow() }
private val NSOpenGLGetOption_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSOpenGLGetOption_ADDR, NSOpenGLGetOption_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL API deprecated; please use Metal and MetalKit.  (Define GL_SILENCE_DEPRECATION to silence these warnings.)")
fun NSOpenGLGetOption(arg0: NSOpenGLGlobalOption, arg1: MemorySegment): Unit {
    try {
        NSOpenGLGetOption_HANDLE.invokeExact(arg0.value.toInt(), arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSOpenGLGetVersion Void((typedef GLint = Int)*,(typedef GLint = Int)*)
 */
private val NSOpenGLGetVersion_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSOpenGLGetVersion_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOpenGLGetVersion").orElseThrow() }
private val NSOpenGLGetVersion_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSOpenGLGetVersion_ADDR, NSOpenGLGetVersion_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL API deprecated; please use Metal and MetalKit.  (Define GL_SILENCE_DEPRECATION to silence these warnings.)")
fun NSOpenGLGetVersion(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSOpenGLGetVersion_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CACurrentMediaTime typedef CFTimeInterval = Double()
 */
private val CACurrentMediaTime_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE)
private val CACurrentMediaTime_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CACurrentMediaTime").orElseThrow() }
private val CACurrentMediaTime_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CACurrentMediaTime_ADDR, CACurrentMediaTime_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CACurrentMediaTime(): Double {
    try {
        return CACurrentMediaTime_HANDLE.invokeExact() as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCAFillModeForwards typedef const CAMediaTimingFillMode = (Void)*
 */
private val kCAFillModeForwards_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAFillModeForwards_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAFillModeForwards").orElseThrow().reinterpret(kCAFillModeForwards_LAYOUT.byteSize()) }
private val kCAFillModeForwards_VH: VarHandle by lazy { kCAFillModeForwards_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAFillModeForwards: MemorySegment
    get() = kCAFillModeForwards_VH.get(kCAFillModeForwards_SEGMENT, 0L) as MemorySegment
    set(value) = kCAFillModeForwards_VH.set(kCAFillModeForwards_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAFillModeBackwards typedef const CAMediaTimingFillMode = (Void)*
 */
private val kCAFillModeBackwards_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAFillModeBackwards_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAFillModeBackwards").orElseThrow().reinterpret(kCAFillModeBackwards_LAYOUT.byteSize()) }
private val kCAFillModeBackwards_VH: VarHandle by lazy { kCAFillModeBackwards_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAFillModeBackwards: MemorySegment
    get() = kCAFillModeBackwards_VH.get(kCAFillModeBackwards_SEGMENT, 0L) as MemorySegment
    set(value) = kCAFillModeBackwards_VH.set(kCAFillModeBackwards_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAFillModeBoth typedef const CAMediaTimingFillMode = (Void)*
 */
private val kCAFillModeBoth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAFillModeBoth_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAFillModeBoth").orElseThrow().reinterpret(kCAFillModeBoth_LAYOUT.byteSize()) }
private val kCAFillModeBoth_VH: VarHandle by lazy { kCAFillModeBoth_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAFillModeBoth: MemorySegment
    get() = kCAFillModeBoth_VH.get(kCAFillModeBoth_SEGMENT, 0L) as MemorySegment
    set(value) = kCAFillModeBoth_VH.set(kCAFillModeBoth_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAFillModeRemoved typedef const CAMediaTimingFillMode = (Void)*
 */
private val kCAFillModeRemoved_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAFillModeRemoved_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAFillModeRemoved").orElseThrow().reinterpret(kCAFillModeRemoved_LAYOUT.byteSize()) }
private val kCAFillModeRemoved_VH: VarHandle by lazy { kCAFillModeRemoved_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAFillModeRemoved: MemorySegment
    get() = kCAFillModeRemoved_VH.get(kCAFillModeRemoved_SEGMENT, 0L) as MemorySegment
    set(value) = kCAFillModeRemoved_VH.set(kCAFillModeRemoved_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CATransform3DIdentity typedef const CATransform3D = Declared(CATransform3D)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
val CATransform3DIdentity: MemorySegment = SymbolLookup.loaderLookup().find("CATransform3DIdentity").orElseThrow()

/**
 * {@snippet lang=c : CATransform3DIsIdentity Bool(typedef CATransform3D = Declared(CATransform3D))
 */
private val CATransform3DIsIdentity_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CATransform3D.layout)
private val CATransform3DIsIdentity_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DIsIdentity").orElseThrow() }
private val CATransform3DIsIdentity_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DIsIdentity_ADDR, CATransform3DIsIdentity_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DIsIdentity(arg0: MemorySegment): Boolean {
    try {
        return CATransform3DIsIdentity_HANDLE.invokeExact(arg0) as Boolean
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DIsIdentity(arg0: CATransform3D): Boolean {
    return CATransform3DIsIdentity(arg0.segment)
}

/**
 * {@snippet lang=c : CATransform3DEqualToTransform Bool(typedef CATransform3D = Declared(CATransform3D),typedef CATransform3D = Declared(CATransform3D))
 */
private val CATransform3DEqualToTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CATransform3D.layout, CATransform3D.layout)
private val CATransform3DEqualToTransform_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DEqualToTransform").orElseThrow() }
private val CATransform3DEqualToTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DEqualToTransform_ADDR, CATransform3DEqualToTransform_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DEqualToTransform(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CATransform3DEqualToTransform_HANDLE.invokeExact(arg0, arg1) as Boolean
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DEqualToTransform(arg0: CATransform3D, arg1: CATransform3D): Boolean {
    return CATransform3DEqualToTransform(arg0.segment, arg1.segment)
}

/**
 * {@snippet lang=c : CATransform3DMakeTranslation typedef CATransform3D = Declared(CATransform3D)(typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CATransform3DMakeTranslation_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CATransform3DMakeTranslation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DMakeTranslation").orElseThrow() }
private val CATransform3DMakeTranslation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DMakeTranslation_ADDR, CATransform3DMakeTranslation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DMakeTranslation(allocator: SegmentAllocator, arg0: Double, arg1: Double, arg2: Double): MemorySegment {
    try {
        return CATransform3DMakeTranslation_HANDLE.invokeExact(allocator, arg0, arg1, arg2) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DMakeTranslationTyped(allocator: SegmentAllocator, arg0: Double, arg1: Double, arg2: Double): CATransform3D {
    return CATransform3D(CATransform3DMakeTranslation(allocator, arg0, arg1, arg2))
}

/**
 * {@snippet lang=c : CATransform3DMakeScale typedef CATransform3D = Declared(CATransform3D)(typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CATransform3DMakeScale_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CATransform3DMakeScale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DMakeScale").orElseThrow() }
private val CATransform3DMakeScale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DMakeScale_ADDR, CATransform3DMakeScale_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DMakeScale(allocator: SegmentAllocator, arg0: Double, arg1: Double, arg2: Double): MemorySegment {
    try {
        return CATransform3DMakeScale_HANDLE.invokeExact(allocator, arg0, arg1, arg2) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DMakeScaleTyped(allocator: SegmentAllocator, arg0: Double, arg1: Double, arg2: Double): CATransform3D {
    return CATransform3D(CATransform3DMakeScale(allocator, arg0, arg1, arg2))
}

/**
 * {@snippet lang=c : CATransform3DMakeRotation typedef CATransform3D = Declared(CATransform3D)(typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CATransform3DMakeRotation_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CATransform3DMakeRotation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DMakeRotation").orElseThrow() }
private val CATransform3DMakeRotation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DMakeRotation_ADDR, CATransform3DMakeRotation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DMakeRotation(allocator: SegmentAllocator, arg0: Double, arg1: Double, arg2: Double, arg3: Double): MemorySegment {
    try {
        return CATransform3DMakeRotation_HANDLE.invokeExact(allocator, arg0, arg1, arg2, arg3) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DMakeRotationTyped(allocator: SegmentAllocator, arg0: Double, arg1: Double, arg2: Double, arg3: Double): CATransform3D {
    return CATransform3D(CATransform3DMakeRotation(allocator, arg0, arg1, arg2, arg3))
}

/**
 * {@snippet lang=c : CATransform3DTranslate typedef CATransform3D = Declared(CATransform3D)(typedef CATransform3D = Declared(CATransform3D),typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CATransform3DTranslate_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, CATransform3D.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CATransform3DTranslate_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DTranslate").orElseThrow() }
private val CATransform3DTranslate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DTranslate_ADDR, CATransform3DTranslate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DTranslate(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double): MemorySegment {
    try {
        return CATransform3DTranslate_HANDLE.invokeExact(allocator, arg0, arg1, arg2, arg3) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DTranslate(allocator: SegmentAllocator, arg0: CATransform3D, arg1: Double, arg2: Double, arg3: Double): CATransform3D {
    return CATransform3D(CATransform3DTranslate(allocator, arg0.segment, arg1, arg2, arg3))
}

/**
 * {@snippet lang=c : CATransform3DScale typedef CATransform3D = Declared(CATransform3D)(typedef CATransform3D = Declared(CATransform3D),typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CATransform3DScale_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, CATransform3D.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CATransform3DScale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DScale").orElseThrow() }
private val CATransform3DScale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DScale_ADDR, CATransform3DScale_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DScale(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double): MemorySegment {
    try {
        return CATransform3DScale_HANDLE.invokeExact(allocator, arg0, arg1, arg2, arg3) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DScale(allocator: SegmentAllocator, arg0: CATransform3D, arg1: Double, arg2: Double, arg3: Double): CATransform3D {
    return CATransform3D(CATransform3DScale(allocator, arg0.segment, arg1, arg2, arg3))
}

/**
 * {@snippet lang=c : CATransform3DRotate typedef CATransform3D = Declared(CATransform3D)(typedef CATransform3D = Declared(CATransform3D),typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CATransform3DRotate_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, CATransform3D.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CATransform3DRotate_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DRotate").orElseThrow() }
private val CATransform3DRotate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DRotate_ADDR, CATransform3DRotate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DRotate(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double): MemorySegment {
    try {
        return CATransform3DRotate_HANDLE.invokeExact(allocator, arg0, arg1, arg2, arg3, arg4) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DRotate(allocator: SegmentAllocator, arg0: CATransform3D, arg1: Double, arg2: Double, arg3: Double, arg4: Double): CATransform3D {
    return CATransform3D(CATransform3DRotate(allocator, arg0.segment, arg1, arg2, arg3, arg4))
}

/**
 * {@snippet lang=c : CATransform3DConcat typedef CATransform3D = Declared(CATransform3D)(typedef CATransform3D = Declared(CATransform3D),typedef CATransform3D = Declared(CATransform3D))
 */
private val CATransform3DConcat_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, CATransform3D.layout, CATransform3D.layout)
private val CATransform3DConcat_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DConcat").orElseThrow() }
private val CATransform3DConcat_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DConcat_ADDR, CATransform3DConcat_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DConcat(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CATransform3DConcat_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DConcat(allocator: SegmentAllocator, arg0: CATransform3D, arg1: CATransform3D): CATransform3D {
    return CATransform3D(CATransform3DConcat(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : CATransform3DInvert typedef CATransform3D = Declared(CATransform3D)(typedef CATransform3D = Declared(CATransform3D))
 */
private val CATransform3DInvert_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, CATransform3D.layout)
private val CATransform3DInvert_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DInvert").orElseThrow() }
private val CATransform3DInvert_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DInvert_ADDR, CATransform3DInvert_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DInvert(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CATransform3DInvert_HANDLE.invokeExact(allocator, arg0) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DInvert(allocator: SegmentAllocator, arg0: CATransform3D): CATransform3D {
    return CATransform3D(CATransform3DInvert(allocator, arg0.segment))
}

/**
 * {@snippet lang=c : CATransform3DMakeAffineTransform typedef CATransform3D = Declared(CATransform3D)(typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CATransform3DMakeAffineTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(CATransform3D.layout, CGAffineTransform.layout)
private val CATransform3DMakeAffineTransform_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DMakeAffineTransform").orElseThrow() }
private val CATransform3DMakeAffineTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DMakeAffineTransform_ADDR, CATransform3DMakeAffineTransform_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DMakeAffineTransform(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CATransform3DMakeAffineTransform_HANDLE.invokeExact(allocator, arg0) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DMakeAffineTransform(allocator: SegmentAllocator, arg0: CGAffineTransform): CATransform3D {
    return CATransform3D(CATransform3DMakeAffineTransform(allocator, arg0.segment))
}

/**
 * {@snippet lang=c : CATransform3DIsAffine Bool(typedef CATransform3D = Declared(CATransform3D))
 */
private val CATransform3DIsAffine_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, CATransform3D.layout)
private val CATransform3DIsAffine_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DIsAffine").orElseThrow() }
private val CATransform3DIsAffine_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DIsAffine_ADDR, CATransform3DIsAffine_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DIsAffine(arg0: MemorySegment): Boolean {
    try {
        return CATransform3DIsAffine_HANDLE.invokeExact(arg0) as Boolean
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DIsAffine(arg0: CATransform3D): Boolean {
    return CATransform3DIsAffine(arg0.segment)
}

/**
 * {@snippet lang=c : CATransform3DGetAffineTransform typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CATransform3D = Declared(CATransform3D))
 */
private val CATransform3DGetAffineTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, CATransform3D.layout)
private val CATransform3DGetAffineTransform_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CATransform3DGetAffineTransform").orElseThrow() }
private val CATransform3DGetAffineTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CATransform3DGetAffineTransform_ADDR, CATransform3DGetAffineTransform_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DGetAffineTransform(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CATransform3DGetAffineTransform_HANDLE.invokeExact(allocator, arg0) as MemorySegment
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
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CATransform3DGetAffineTransform(allocator: SegmentAllocator, arg0: CATransform3D): CGAffineTransform {
    return CGAffineTransform(CATransform3DGetAffineTransform(allocator, arg0.segment))
}

/**
 * {@snippet lang=c : CAToneMapModeAutomatic typedef const CAToneMapMode = (Void)*
 */
private val CAToneMapModeAutomatic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val CAToneMapModeAutomatic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CAToneMapModeAutomatic").orElseThrow().reinterpret(CAToneMapModeAutomatic_LAYOUT.byteSize()) }
private val CAToneMapModeAutomatic_VH: VarHandle by lazy { CAToneMapModeAutomatic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var CAToneMapModeAutomatic: MemorySegment
    get() = CAToneMapModeAutomatic_VH.get(CAToneMapModeAutomatic_SEGMENT, 0L) as MemorySegment
    set(value) = CAToneMapModeAutomatic_VH.set(CAToneMapModeAutomatic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CAToneMapModeNever typedef const CAToneMapMode = (Void)*
 */
private val CAToneMapModeNever_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val CAToneMapModeNever_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CAToneMapModeNever").orElseThrow().reinterpret(CAToneMapModeNever_LAYOUT.byteSize()) }
private val CAToneMapModeNever_VH: VarHandle by lazy { CAToneMapModeNever_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var CAToneMapModeNever: MemorySegment
    get() = CAToneMapModeNever_VH.get(CAToneMapModeNever_SEGMENT, 0L) as MemorySegment
    set(value) = CAToneMapModeNever_VH.set(CAToneMapModeNever_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CAToneMapModeIfSupported typedef const CAToneMapMode = (Void)*
 */
private val CAToneMapModeIfSupported_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val CAToneMapModeIfSupported_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CAToneMapModeIfSupported").orElseThrow().reinterpret(CAToneMapModeIfSupported_LAYOUT.byteSize()) }
private val CAToneMapModeIfSupported_VH: VarHandle by lazy { CAToneMapModeIfSupported_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var CAToneMapModeIfSupported: MemorySegment
    get() = CAToneMapModeIfSupported_VH.get(CAToneMapModeIfSupported_SEGMENT, 0L) as MemorySegment
    set(value) = CAToneMapModeIfSupported_VH.set(CAToneMapModeIfSupported_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CADynamicRangeAutomatic typedef const CADynamicRange = (Void)*
 */
private val CADynamicRangeAutomatic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val CADynamicRangeAutomatic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CADynamicRangeAutomatic").orElseThrow().reinterpret(CADynamicRangeAutomatic_LAYOUT.byteSize()) }
private val CADynamicRangeAutomatic_VH: VarHandle by lazy { CADynamicRangeAutomatic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var CADynamicRangeAutomatic: MemorySegment
    get() = CADynamicRangeAutomatic_VH.get(CADynamicRangeAutomatic_SEGMENT, 0L) as MemorySegment
    set(value) = CADynamicRangeAutomatic_VH.set(CADynamicRangeAutomatic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CADynamicRangeStandard typedef const CADynamicRange = (Void)*
 */
private val CADynamicRangeStandard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val CADynamicRangeStandard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CADynamicRangeStandard").orElseThrow().reinterpret(CADynamicRangeStandard_LAYOUT.byteSize()) }
private val CADynamicRangeStandard_VH: VarHandle by lazy { CADynamicRangeStandard_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var CADynamicRangeStandard: MemorySegment
    get() = CADynamicRangeStandard_VH.get(CADynamicRangeStandard_SEGMENT, 0L) as MemorySegment
    set(value) = CADynamicRangeStandard_VH.set(CADynamicRangeStandard_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CADynamicRangeConstrainedHigh typedef const CADynamicRange = (Void)*
 */
private val CADynamicRangeConstrainedHigh_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val CADynamicRangeConstrainedHigh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CADynamicRangeConstrainedHigh").orElseThrow().reinterpret(CADynamicRangeConstrainedHigh_LAYOUT.byteSize()) }
private val CADynamicRangeConstrainedHigh_VH: VarHandle by lazy { CADynamicRangeConstrainedHigh_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var CADynamicRangeConstrainedHigh: MemorySegment
    get() = CADynamicRangeConstrainedHigh_VH.get(CADynamicRangeConstrainedHigh_SEGMENT, 0L) as MemorySegment
    set(value) = CADynamicRangeConstrainedHigh_VH.set(CADynamicRangeConstrainedHigh_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CADynamicRangeHigh typedef const CADynamicRange = (Void)*
 */
private val CADynamicRangeHigh_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val CADynamicRangeHigh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CADynamicRangeHigh").orElseThrow().reinterpret(CADynamicRangeHigh_LAYOUT.byteSize()) }
private val CADynamicRangeHigh_VH: VarHandle by lazy { CADynamicRangeHigh_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var CADynamicRangeHigh: MemorySegment
    get() = CADynamicRangeHigh_VH.get(CADynamicRangeHigh_SEGMENT, 0L) as MemorySegment
    set(value) = CADynamicRangeHigh_VH.set(CADynamicRangeHigh_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityCenter typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityCenter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityCenter_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityCenter").orElseThrow().reinterpret(kCAGravityCenter_LAYOUT.byteSize()) }
private val kCAGravityCenter_VH: VarHandle by lazy { kCAGravityCenter_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityCenter: MemorySegment
    get() = kCAGravityCenter_VH.get(kCAGravityCenter_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityCenter_VH.set(kCAGravityCenter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityTop typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityTop_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityTop_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityTop").orElseThrow().reinterpret(kCAGravityTop_LAYOUT.byteSize()) }
private val kCAGravityTop_VH: VarHandle by lazy { kCAGravityTop_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityTop: MemorySegment
    get() = kCAGravityTop_VH.get(kCAGravityTop_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityTop_VH.set(kCAGravityTop_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityBottom typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityBottom_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityBottom_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityBottom").orElseThrow().reinterpret(kCAGravityBottom_LAYOUT.byteSize()) }
private val kCAGravityBottom_VH: VarHandle by lazy { kCAGravityBottom_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityBottom: MemorySegment
    get() = kCAGravityBottom_VH.get(kCAGravityBottom_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityBottom_VH.set(kCAGravityBottom_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityLeft typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityLeft_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityLeft_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityLeft").orElseThrow().reinterpret(kCAGravityLeft_LAYOUT.byteSize()) }
private val kCAGravityLeft_VH: VarHandle by lazy { kCAGravityLeft_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityLeft: MemorySegment
    get() = kCAGravityLeft_VH.get(kCAGravityLeft_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityLeft_VH.set(kCAGravityLeft_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityRight typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityRight_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityRight_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityRight").orElseThrow().reinterpret(kCAGravityRight_LAYOUT.byteSize()) }
private val kCAGravityRight_VH: VarHandle by lazy { kCAGravityRight_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityRight: MemorySegment
    get() = kCAGravityRight_VH.get(kCAGravityRight_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityRight_VH.set(kCAGravityRight_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityTopLeft typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityTopLeft_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityTopLeft_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityTopLeft").orElseThrow().reinterpret(kCAGravityTopLeft_LAYOUT.byteSize()) }
private val kCAGravityTopLeft_VH: VarHandle by lazy { kCAGravityTopLeft_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityTopLeft: MemorySegment
    get() = kCAGravityTopLeft_VH.get(kCAGravityTopLeft_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityTopLeft_VH.set(kCAGravityTopLeft_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityTopRight typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityTopRight_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityTopRight_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityTopRight").orElseThrow().reinterpret(kCAGravityTopRight_LAYOUT.byteSize()) }
private val kCAGravityTopRight_VH: VarHandle by lazy { kCAGravityTopRight_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityTopRight: MemorySegment
    get() = kCAGravityTopRight_VH.get(kCAGravityTopRight_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityTopRight_VH.set(kCAGravityTopRight_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityBottomLeft typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityBottomLeft_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityBottomLeft_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityBottomLeft").orElseThrow().reinterpret(kCAGravityBottomLeft_LAYOUT.byteSize()) }
private val kCAGravityBottomLeft_VH: VarHandle by lazy { kCAGravityBottomLeft_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityBottomLeft: MemorySegment
    get() = kCAGravityBottomLeft_VH.get(kCAGravityBottomLeft_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityBottomLeft_VH.set(kCAGravityBottomLeft_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityBottomRight typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityBottomRight_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityBottomRight_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityBottomRight").orElseThrow().reinterpret(kCAGravityBottomRight_LAYOUT.byteSize()) }
private val kCAGravityBottomRight_VH: VarHandle by lazy { kCAGravityBottomRight_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityBottomRight: MemorySegment
    get() = kCAGravityBottomRight_VH.get(kCAGravityBottomRight_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityBottomRight_VH.set(kCAGravityBottomRight_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityResize typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityResize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityResize_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityResize").orElseThrow().reinterpret(kCAGravityResize_LAYOUT.byteSize()) }
private val kCAGravityResize_VH: VarHandle by lazy { kCAGravityResize_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityResize: MemorySegment
    get() = kCAGravityResize_VH.get(kCAGravityResize_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityResize_VH.set(kCAGravityResize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityResizeAspect typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityResizeAspect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityResizeAspect_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityResizeAspect").orElseThrow().reinterpret(kCAGravityResizeAspect_LAYOUT.byteSize()) }
private val kCAGravityResizeAspect_VH: VarHandle by lazy { kCAGravityResizeAspect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityResizeAspect: MemorySegment
    get() = kCAGravityResizeAspect_VH.get(kCAGravityResizeAspect_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityResizeAspect_VH.set(kCAGravityResizeAspect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAGravityResizeAspectFill typedef const CALayerContentsGravity = (Void)*
 */
private val kCAGravityResizeAspectFill_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAGravityResizeAspectFill_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAGravityResizeAspectFill").orElseThrow().reinterpret(kCAGravityResizeAspectFill_LAYOUT.byteSize()) }
private val kCAGravityResizeAspectFill_VH: VarHandle by lazy { kCAGravityResizeAspectFill_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAGravityResizeAspectFill: MemorySegment
    get() = kCAGravityResizeAspectFill_VH.get(kCAGravityResizeAspectFill_SEGMENT, 0L) as MemorySegment
    set(value) = kCAGravityResizeAspectFill_VH.set(kCAGravityResizeAspectFill_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAContentsFormatRGBA8Uint typedef const CALayerContentsFormat = (Void)*
 */
private val kCAContentsFormatRGBA8Uint_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAContentsFormatRGBA8Uint_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAContentsFormatRGBA8Uint").orElseThrow().reinterpret(kCAContentsFormatRGBA8Uint_LAYOUT.byteSize()) }
private val kCAContentsFormatRGBA8Uint_VH: VarHandle by lazy { kCAContentsFormatRGBA8Uint_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAContentsFormatRGBA8Uint: MemorySegment
    get() = kCAContentsFormatRGBA8Uint_VH.get(kCAContentsFormatRGBA8Uint_SEGMENT, 0L) as MemorySegment
    set(value) = kCAContentsFormatRGBA8Uint_VH.set(kCAContentsFormatRGBA8Uint_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAContentsFormatRGBA16Float typedef const CALayerContentsFormat = (Void)*
 */
private val kCAContentsFormatRGBA16Float_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAContentsFormatRGBA16Float_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAContentsFormatRGBA16Float").orElseThrow().reinterpret(kCAContentsFormatRGBA16Float_LAYOUT.byteSize()) }
private val kCAContentsFormatRGBA16Float_VH: VarHandle by lazy { kCAContentsFormatRGBA16Float_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAContentsFormatRGBA16Float: MemorySegment
    get() = kCAContentsFormatRGBA16Float_VH.get(kCAContentsFormatRGBA16Float_SEGMENT, 0L) as MemorySegment
    set(value) = kCAContentsFormatRGBA16Float_VH.set(kCAContentsFormatRGBA16Float_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAContentsFormatGray8Uint typedef const CALayerContentsFormat = (Void)*
 */
private val kCAContentsFormatGray8Uint_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAContentsFormatGray8Uint_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAContentsFormatGray8Uint").orElseThrow().reinterpret(kCAContentsFormatGray8Uint_LAYOUT.byteSize()) }
private val kCAContentsFormatGray8Uint_VH: VarHandle by lazy { kCAContentsFormatGray8Uint_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAContentsFormatGray8Uint: MemorySegment
    get() = kCAContentsFormatGray8Uint_VH.get(kCAContentsFormatGray8Uint_SEGMENT, 0L) as MemorySegment
    set(value) = kCAContentsFormatGray8Uint_VH.set(kCAContentsFormatGray8Uint_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAContentsFormatAutomatic typedef const CALayerContentsFormat = (Void)*
 */
private val kCAContentsFormatAutomatic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAContentsFormatAutomatic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAContentsFormatAutomatic").orElseThrow().reinterpret(kCAContentsFormatAutomatic_LAYOUT.byteSize()) }
private val kCAContentsFormatAutomatic_VH: VarHandle by lazy { kCAContentsFormatAutomatic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAContentsFormatAutomatic: MemorySegment
    get() = kCAContentsFormatAutomatic_VH.get(kCAContentsFormatAutomatic_SEGMENT, 0L) as MemorySegment
    set(value) = kCAContentsFormatAutomatic_VH.set(kCAContentsFormatAutomatic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAFilterNearest typedef const CALayerContentsFilter = (Void)*
 */
private val kCAFilterNearest_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAFilterNearest_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAFilterNearest").orElseThrow().reinterpret(kCAFilterNearest_LAYOUT.byteSize()) }
private val kCAFilterNearest_VH: VarHandle by lazy { kCAFilterNearest_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAFilterNearest: MemorySegment
    get() = kCAFilterNearest_VH.get(kCAFilterNearest_SEGMENT, 0L) as MemorySegment
    set(value) = kCAFilterNearest_VH.set(kCAFilterNearest_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAFilterLinear typedef const CALayerContentsFilter = (Void)*
 */
private val kCAFilterLinear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAFilterLinear_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAFilterLinear").orElseThrow().reinterpret(kCAFilterLinear_LAYOUT.byteSize()) }
private val kCAFilterLinear_VH: VarHandle by lazy { kCAFilterLinear_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAFilterLinear: MemorySegment
    get() = kCAFilterLinear_VH.get(kCAFilterLinear_SEGMENT, 0L) as MemorySegment
    set(value) = kCAFilterLinear_VH.set(kCAFilterLinear_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAFilterTrilinear typedef const CALayerContentsFilter = (Void)*
 */
private val kCAFilterTrilinear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAFilterTrilinear_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAFilterTrilinear").orElseThrow().reinterpret(kCAFilterTrilinear_LAYOUT.byteSize()) }
private val kCAFilterTrilinear_VH: VarHandle by lazy { kCAFilterTrilinear_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAFilterTrilinear: MemorySegment
    get() = kCAFilterTrilinear_VH.get(kCAFilterTrilinear_SEGMENT, 0L) as MemorySegment
    set(value) = kCAFilterTrilinear_VH.set(kCAFilterTrilinear_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCACornerCurveCircular typedef const CALayerCornerCurve = (Void)*
 */
private val kCACornerCurveCircular_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCACornerCurveCircular_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCACornerCurveCircular").orElseThrow().reinterpret(kCACornerCurveCircular_LAYOUT.byteSize()) }
private val kCACornerCurveCircular_VH: VarHandle by lazy { kCACornerCurveCircular_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCACornerCurveCircular: MemorySegment
    get() = kCACornerCurveCircular_VH.get(kCACornerCurveCircular_SEGMENT, 0L) as MemorySegment
    set(value) = kCACornerCurveCircular_VH.set(kCACornerCurveCircular_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCACornerCurveContinuous typedef const CALayerCornerCurve = (Void)*
 */
private val kCACornerCurveContinuous_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCACornerCurveContinuous_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCACornerCurveContinuous").orElseThrow().reinterpret(kCACornerCurveContinuous_LAYOUT.byteSize()) }
private val kCACornerCurveContinuous_VH: VarHandle by lazy { kCACornerCurveContinuous_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCACornerCurveContinuous: MemorySegment
    get() = kCACornerCurveContinuous_VH.get(kCACornerCurveContinuous_SEGMENT, 0L) as MemorySegment
    set(value) = kCACornerCurveContinuous_VH.set(kCACornerCurveContinuous_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAOnOrderIn (Void)*
 */
private val kCAOnOrderIn_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAOnOrderIn_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAOnOrderIn").orElseThrow().reinterpret(kCAOnOrderIn_LAYOUT.byteSize()) }
private val kCAOnOrderIn_VH: VarHandle by lazy { kCAOnOrderIn_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAOnOrderIn: MemorySegment
    get() = kCAOnOrderIn_VH.get(kCAOnOrderIn_SEGMENT, 0L) as MemorySegment
    set(value) = kCAOnOrderIn_VH.set(kCAOnOrderIn_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCAOnOrderOut (Void)*
 */
private val kCAOnOrderOut_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCAOnOrderOut_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCAOnOrderOut").orElseThrow().reinterpret(kCAOnOrderOut_LAYOUT.byteSize()) }
private val kCAOnOrderOut_VH: VarHandle by lazy { kCAOnOrderOut_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCAOnOrderOut: MemorySegment
    get() = kCAOnOrderOut_VH.get(kCAOnOrderOut_SEGMENT, 0L) as MemorySegment
    set(value) = kCAOnOrderOut_VH.set(kCAOnOrderOut_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCATransition (Void)*
 */
private val kCATransition_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCATransition_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCATransition").orElseThrow().reinterpret(kCATransition_LAYOUT.byteSize()) }
private val kCATransition_VH: VarHandle by lazy { kCATransition_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCATransition: MemorySegment
    get() = kCATransition_VH.get(kCATransition_SEGMENT, 0L) as MemorySegment
    set(value) = kCATransition_VH.set(kCATransition_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerBox typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerBox_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerBox_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerBox").orElseThrow().reinterpret(NSTextListMarkerBox_LAYOUT.byteSize()) }
private val NSTextListMarkerBox_VH: VarHandle by lazy { NSTextListMarkerBox_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerBox: MemorySegment
    get() = NSTextListMarkerBox_VH.get(NSTextListMarkerBox_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerBox_VH.set(NSTextListMarkerBox_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerCheck typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerCheck_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerCheck_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerCheck").orElseThrow().reinterpret(NSTextListMarkerCheck_LAYOUT.byteSize()) }
private val NSTextListMarkerCheck_VH: VarHandle by lazy { NSTextListMarkerCheck_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerCheck: MemorySegment
    get() = NSTextListMarkerCheck_VH.get(NSTextListMarkerCheck_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerCheck_VH.set(NSTextListMarkerCheck_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerCircle typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerCircle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerCircle_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerCircle").orElseThrow().reinterpret(NSTextListMarkerCircle_LAYOUT.byteSize()) }
private val NSTextListMarkerCircle_VH: VarHandle by lazy { NSTextListMarkerCircle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerCircle: MemorySegment
    get() = NSTextListMarkerCircle_VH.get(NSTextListMarkerCircle_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerCircle_VH.set(NSTextListMarkerCircle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerDiamond typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerDiamond_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerDiamond_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerDiamond").orElseThrow().reinterpret(NSTextListMarkerDiamond_LAYOUT.byteSize()) }
private val NSTextListMarkerDiamond_VH: VarHandle by lazy { NSTextListMarkerDiamond_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerDiamond: MemorySegment
    get() = NSTextListMarkerDiamond_VH.get(NSTextListMarkerDiamond_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerDiamond_VH.set(NSTextListMarkerDiamond_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerDisc typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerDisc_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerDisc_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerDisc").orElseThrow().reinterpret(NSTextListMarkerDisc_LAYOUT.byteSize()) }
private val NSTextListMarkerDisc_VH: VarHandle by lazy { NSTextListMarkerDisc_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerDisc: MemorySegment
    get() = NSTextListMarkerDisc_VH.get(NSTextListMarkerDisc_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerDisc_VH.set(NSTextListMarkerDisc_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerHyphen typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerHyphen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerHyphen_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerHyphen").orElseThrow().reinterpret(NSTextListMarkerHyphen_LAYOUT.byteSize()) }
private val NSTextListMarkerHyphen_VH: VarHandle by lazy { NSTextListMarkerHyphen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerHyphen: MemorySegment
    get() = NSTextListMarkerHyphen_VH.get(NSTextListMarkerHyphen_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerHyphen_VH.set(NSTextListMarkerHyphen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerSquare typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerSquare_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerSquare_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerSquare").orElseThrow().reinterpret(NSTextListMarkerSquare_LAYOUT.byteSize()) }
private val NSTextListMarkerSquare_VH: VarHandle by lazy { NSTextListMarkerSquare_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerSquare: MemorySegment
    get() = NSTextListMarkerSquare_VH.get(NSTextListMarkerSquare_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerSquare_VH.set(NSTextListMarkerSquare_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerLowercaseHexadecimal typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerLowercaseHexadecimal_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerLowercaseHexadecimal_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerLowercaseHexadecimal").orElseThrow().reinterpret(NSTextListMarkerLowercaseHexadecimal_LAYOUT.byteSize()) }
private val NSTextListMarkerLowercaseHexadecimal_VH: VarHandle by lazy { NSTextListMarkerLowercaseHexadecimal_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerLowercaseHexadecimal: MemorySegment
    get() = NSTextListMarkerLowercaseHexadecimal_VH.get(NSTextListMarkerLowercaseHexadecimal_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerLowercaseHexadecimal_VH.set(NSTextListMarkerLowercaseHexadecimal_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerUppercaseHexadecimal typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerUppercaseHexadecimal_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerUppercaseHexadecimal_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerUppercaseHexadecimal").orElseThrow().reinterpret(NSTextListMarkerUppercaseHexadecimal_LAYOUT.byteSize()) }
private val NSTextListMarkerUppercaseHexadecimal_VH: VarHandle by lazy { NSTextListMarkerUppercaseHexadecimal_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerUppercaseHexadecimal: MemorySegment
    get() = NSTextListMarkerUppercaseHexadecimal_VH.get(NSTextListMarkerUppercaseHexadecimal_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerUppercaseHexadecimal_VH.set(NSTextListMarkerUppercaseHexadecimal_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerOctal typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerOctal_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerOctal_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerOctal").orElseThrow().reinterpret(NSTextListMarkerOctal_LAYOUT.byteSize()) }
private val NSTextListMarkerOctal_VH: VarHandle by lazy { NSTextListMarkerOctal_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerOctal: MemorySegment
    get() = NSTextListMarkerOctal_VH.get(NSTextListMarkerOctal_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerOctal_VH.set(NSTextListMarkerOctal_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerLowercaseAlpha typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerLowercaseAlpha_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerLowercaseAlpha_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerLowercaseAlpha").orElseThrow().reinterpret(NSTextListMarkerLowercaseAlpha_LAYOUT.byteSize()) }
private val NSTextListMarkerLowercaseAlpha_VH: VarHandle by lazy { NSTextListMarkerLowercaseAlpha_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerLowercaseAlpha: MemorySegment
    get() = NSTextListMarkerLowercaseAlpha_VH.get(NSTextListMarkerLowercaseAlpha_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerLowercaseAlpha_VH.set(NSTextListMarkerLowercaseAlpha_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerUppercaseAlpha typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerUppercaseAlpha_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerUppercaseAlpha_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerUppercaseAlpha").orElseThrow().reinterpret(NSTextListMarkerUppercaseAlpha_LAYOUT.byteSize()) }
private val NSTextListMarkerUppercaseAlpha_VH: VarHandle by lazy { NSTextListMarkerUppercaseAlpha_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerUppercaseAlpha: MemorySegment
    get() = NSTextListMarkerUppercaseAlpha_VH.get(NSTextListMarkerUppercaseAlpha_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerUppercaseAlpha_VH.set(NSTextListMarkerUppercaseAlpha_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerLowercaseLatin typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerLowercaseLatin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerLowercaseLatin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerLowercaseLatin").orElseThrow().reinterpret(NSTextListMarkerLowercaseLatin_LAYOUT.byteSize()) }
private val NSTextListMarkerLowercaseLatin_VH: VarHandle by lazy { NSTextListMarkerLowercaseLatin_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerLowercaseLatin: MemorySegment
    get() = NSTextListMarkerLowercaseLatin_VH.get(NSTextListMarkerLowercaseLatin_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerLowercaseLatin_VH.set(NSTextListMarkerLowercaseLatin_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerUppercaseLatin typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerUppercaseLatin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerUppercaseLatin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerUppercaseLatin").orElseThrow().reinterpret(NSTextListMarkerUppercaseLatin_LAYOUT.byteSize()) }
private val NSTextListMarkerUppercaseLatin_VH: VarHandle by lazy { NSTextListMarkerUppercaseLatin_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerUppercaseLatin: MemorySegment
    get() = NSTextListMarkerUppercaseLatin_VH.get(NSTextListMarkerUppercaseLatin_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerUppercaseLatin_VH.set(NSTextListMarkerUppercaseLatin_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerLowercaseRoman typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerLowercaseRoman_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerLowercaseRoman_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerLowercaseRoman").orElseThrow().reinterpret(NSTextListMarkerLowercaseRoman_LAYOUT.byteSize()) }
private val NSTextListMarkerLowercaseRoman_VH: VarHandle by lazy { NSTextListMarkerLowercaseRoman_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerLowercaseRoman: MemorySegment
    get() = NSTextListMarkerLowercaseRoman_VH.get(NSTextListMarkerLowercaseRoman_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerLowercaseRoman_VH.set(NSTextListMarkerLowercaseRoman_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerUppercaseRoman typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerUppercaseRoman_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerUppercaseRoman_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerUppercaseRoman").orElseThrow().reinterpret(NSTextListMarkerUppercaseRoman_LAYOUT.byteSize()) }
private val NSTextListMarkerUppercaseRoman_VH: VarHandle by lazy { NSTextListMarkerUppercaseRoman_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerUppercaseRoman: MemorySegment
    get() = NSTextListMarkerUppercaseRoman_VH.get(NSTextListMarkerUppercaseRoman_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerUppercaseRoman_VH.set(NSTextListMarkerUppercaseRoman_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextListMarkerDecimal typedef const NSTextListMarkerFormat = (Void)*
 */
private val NSTextListMarkerDecimal_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextListMarkerDecimal_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextListMarkerDecimal").orElseThrow().reinterpret(NSTextListMarkerDecimal_LAYOUT.byteSize()) }
private val NSTextListMarkerDecimal_VH: VarHandle by lazy { NSTextListMarkerDecimal_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextListMarkerDecimal: MemorySegment
    get() = NSTextListMarkerDecimal_VH.get(NSTextListMarkerDecimal_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextListMarkerDecimal_VH.set(NSTextListMarkerDecimal_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRuleEditorPredicateLeftExpression typedef const NSRuleEditorPredicatePartKey = (Void)*
 */
private val NSRuleEditorPredicateLeftExpression_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRuleEditorPredicateLeftExpression_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRuleEditorPredicateLeftExpression").orElseThrow().reinterpret(NSRuleEditorPredicateLeftExpression_LAYOUT.byteSize()) }
private val NSRuleEditorPredicateLeftExpression_VH: VarHandle by lazy { NSRuleEditorPredicateLeftExpression_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSRuleEditorPredicateLeftExpression: MemorySegment
    get() = NSRuleEditorPredicateLeftExpression_VH.get(NSRuleEditorPredicateLeftExpression_SEGMENT, 0L) as MemorySegment
    set(value) = NSRuleEditorPredicateLeftExpression_VH.set(NSRuleEditorPredicateLeftExpression_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRuleEditorPredicateRightExpression typedef const NSRuleEditorPredicatePartKey = (Void)*
 */
private val NSRuleEditorPredicateRightExpression_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRuleEditorPredicateRightExpression_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRuleEditorPredicateRightExpression").orElseThrow().reinterpret(NSRuleEditorPredicateRightExpression_LAYOUT.byteSize()) }
private val NSRuleEditorPredicateRightExpression_VH: VarHandle by lazy { NSRuleEditorPredicateRightExpression_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSRuleEditorPredicateRightExpression: MemorySegment
    get() = NSRuleEditorPredicateRightExpression_VH.get(NSRuleEditorPredicateRightExpression_SEGMENT, 0L) as MemorySegment
    set(value) = NSRuleEditorPredicateRightExpression_VH.set(NSRuleEditorPredicateRightExpression_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRuleEditorPredicateComparisonModifier typedef const NSRuleEditorPredicatePartKey = (Void)*
 */
private val NSRuleEditorPredicateComparisonModifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRuleEditorPredicateComparisonModifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRuleEditorPredicateComparisonModifier").orElseThrow().reinterpret(NSRuleEditorPredicateComparisonModifier_LAYOUT.byteSize()) }
private val NSRuleEditorPredicateComparisonModifier_VH: VarHandle by lazy { NSRuleEditorPredicateComparisonModifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSRuleEditorPredicateComparisonModifier: MemorySegment
    get() = NSRuleEditorPredicateComparisonModifier_VH.get(NSRuleEditorPredicateComparisonModifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSRuleEditorPredicateComparisonModifier_VH.set(NSRuleEditorPredicateComparisonModifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRuleEditorPredicateOptions typedef const NSRuleEditorPredicatePartKey = (Void)*
 */
private val NSRuleEditorPredicateOptions_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRuleEditorPredicateOptions_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRuleEditorPredicateOptions").orElseThrow().reinterpret(NSRuleEditorPredicateOptions_LAYOUT.byteSize()) }
private val NSRuleEditorPredicateOptions_VH: VarHandle by lazy { NSRuleEditorPredicateOptions_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSRuleEditorPredicateOptions: MemorySegment
    get() = NSRuleEditorPredicateOptions_VH.get(NSRuleEditorPredicateOptions_SEGMENT, 0L) as MemorySegment
    set(value) = NSRuleEditorPredicateOptions_VH.set(NSRuleEditorPredicateOptions_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRuleEditorPredicateOperatorType typedef const NSRuleEditorPredicatePartKey = (Void)*
 */
private val NSRuleEditorPredicateOperatorType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRuleEditorPredicateOperatorType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRuleEditorPredicateOperatorType").orElseThrow().reinterpret(NSRuleEditorPredicateOperatorType_LAYOUT.byteSize()) }
private val NSRuleEditorPredicateOperatorType_VH: VarHandle by lazy { NSRuleEditorPredicateOperatorType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSRuleEditorPredicateOperatorType: MemorySegment
    get() = NSRuleEditorPredicateOperatorType_VH.get(NSRuleEditorPredicateOperatorType_SEGMENT, 0L) as MemorySegment
    set(value) = NSRuleEditorPredicateOperatorType_VH.set(NSRuleEditorPredicateOperatorType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRuleEditorPredicateCustomSelector typedef const NSRuleEditorPredicatePartKey = (Void)*
 */
private val NSRuleEditorPredicateCustomSelector_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRuleEditorPredicateCustomSelector_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRuleEditorPredicateCustomSelector").orElseThrow().reinterpret(NSRuleEditorPredicateCustomSelector_LAYOUT.byteSize()) }
private val NSRuleEditorPredicateCustomSelector_VH: VarHandle by lazy { NSRuleEditorPredicateCustomSelector_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSRuleEditorPredicateCustomSelector: MemorySegment
    get() = NSRuleEditorPredicateCustomSelector_VH.get(NSRuleEditorPredicateCustomSelector_SEGMENT, 0L) as MemorySegment
    set(value) = NSRuleEditorPredicateCustomSelector_VH.set(NSRuleEditorPredicateCustomSelector_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRuleEditorPredicateCompoundType typedef const NSRuleEditorPredicatePartKey = (Void)*
 */
private val NSRuleEditorPredicateCompoundType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRuleEditorPredicateCompoundType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRuleEditorPredicateCompoundType").orElseThrow().reinterpret(NSRuleEditorPredicateCompoundType_LAYOUT.byteSize()) }
private val NSRuleEditorPredicateCompoundType_VH: VarHandle by lazy { NSRuleEditorPredicateCompoundType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSRuleEditorPredicateCompoundType: MemorySegment
    get() = NSRuleEditorPredicateCompoundType_VH.get(NSRuleEditorPredicateCompoundType_SEGMENT, 0L) as MemorySegment
    set(value) = NSRuleEditorPredicateCompoundType_VH.set(NSRuleEditorPredicateCompoundType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRuleEditorRowsDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSRuleEditorRowsDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRuleEditorRowsDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRuleEditorRowsDidChangeNotification").orElseThrow().reinterpret(NSRuleEditorRowsDidChangeNotification_LAYOUT.byteSize()) }
private val NSRuleEditorRowsDidChangeNotification_VH: VarHandle by lazy { NSRuleEditorRowsDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSRuleEditorRowsDidChangeNotification: MemorySegment
    get() = NSRuleEditorRowsDidChangeNotification_VH.get(NSRuleEditorRowsDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSRuleEditorRowsDidChangeNotification_VH.set(NSRuleEditorRowsDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextInputContextKeyboardSelectionDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextInputContextKeyboardSelectionDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextInputContextKeyboardSelectionDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextInputContextKeyboardSelectionDidChangeNotification").orElseThrow().reinterpret(NSTextInputContextKeyboardSelectionDidChangeNotification_LAYOUT.byteSize()) }
private val NSTextInputContextKeyboardSelectionDidChangeNotification_VH: VarHandle by lazy { NSTextInputContextKeyboardSelectionDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextInputContextKeyboardSelectionDidChangeNotification: MemorySegment
    get() = NSTextInputContextKeyboardSelectionDidChangeNotification_VH.get(NSTextInputContextKeyboardSelectionDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextInputContextKeyboardSelectionDidChangeNotification_VH.set(NSTextInputContextKeyboardSelectionDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSApplicationDidFinishRestoringWindowsNotification typedef const NSNotificationName = (Void)*
 */
private val NSApplicationDidFinishRestoringWindowsNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidFinishRestoringWindowsNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidFinishRestoringWindowsNotification").orElseThrow().reinterpret(NSApplicationDidFinishRestoringWindowsNotification_LAYOUT.byteSize()) }
private val NSApplicationDidFinishRestoringWindowsNotification_VH: VarHandle by lazy { NSApplicationDidFinishRestoringWindowsNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSApplicationDidFinishRestoringWindowsNotification: MemorySegment
    get() = NSApplicationDidFinishRestoringWindowsNotification_VH.get(NSApplicationDidFinishRestoringWindowsNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSApplicationDidFinishRestoringWindowsNotification_VH.set(NSApplicationDidFinishRestoringWindowsNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextAlternativesSelectedAlternativeStringNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextAlternativesSelectedAlternativeStringNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextAlternativesSelectedAlternativeStringNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextAlternativesSelectedAlternativeStringNotification").orElseThrow().reinterpret(NSTextAlternativesSelectedAlternativeStringNotification_LAYOUT.byteSize()) }
private val NSTextAlternativesSelectedAlternativeStringNotification_VH: VarHandle by lazy { NSTextAlternativesSelectedAlternativeStringNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSTextAlternativesSelectedAlternativeStringNotification: MemorySegment
    get() = NSTextAlternativesSelectedAlternativeStringNotification_VH.get(NSTextAlternativesSelectedAlternativeStringNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextAlternativesSelectedAlternativeStringNotification_VH.set(NSTextAlternativesSelectedAlternativeStringNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTypeIdentifierDateText (Void)*
 */
private val NSTypeIdentifierDateText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTypeIdentifierDateText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTypeIdentifierDateText").orElseThrow().reinterpret(NSTypeIdentifierDateText_LAYOUT.byteSize()) }
private val NSTypeIdentifierDateText_VH: VarHandle by lazy { NSTypeIdentifierDateText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
var NSTypeIdentifierDateText: MemorySegment
    get() = NSTypeIdentifierDateText_VH.get(NSTypeIdentifierDateText_SEGMENT, 0L) as MemorySegment
    set(value) = NSTypeIdentifierDateText_VH.set(NSTypeIdentifierDateText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTypeIdentifierAddressText (Void)*
 */
private val NSTypeIdentifierAddressText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTypeIdentifierAddressText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTypeIdentifierAddressText").orElseThrow().reinterpret(NSTypeIdentifierAddressText_LAYOUT.byteSize()) }
private val NSTypeIdentifierAddressText_VH: VarHandle by lazy { NSTypeIdentifierAddressText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
var NSTypeIdentifierAddressText: MemorySegment
    get() = NSTypeIdentifierAddressText_VH.get(NSTypeIdentifierAddressText_SEGMENT, 0L) as MemorySegment
    set(value) = NSTypeIdentifierAddressText_VH.set(NSTypeIdentifierAddressText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTypeIdentifierPhoneNumberText (Void)*
 */
private val NSTypeIdentifierPhoneNumberText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTypeIdentifierPhoneNumberText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTypeIdentifierPhoneNumberText").orElseThrow().reinterpret(NSTypeIdentifierPhoneNumberText_LAYOUT.byteSize()) }
private val NSTypeIdentifierPhoneNumberText_VH: VarHandle by lazy { NSTypeIdentifierPhoneNumberText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
var NSTypeIdentifierPhoneNumberText: MemorySegment
    get() = NSTypeIdentifierPhoneNumberText_VH.get(NSTypeIdentifierPhoneNumberText_SEGMENT, 0L) as MemorySegment
    set(value) = NSTypeIdentifierPhoneNumberText_VH.set(NSTypeIdentifierPhoneNumberText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTypeIdentifierTransitInformationText (Void)*
 */
private val NSTypeIdentifierTransitInformationText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTypeIdentifierTransitInformationText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTypeIdentifierTransitInformationText").orElseThrow().reinterpret(NSTypeIdentifierTransitInformationText_LAYOUT.byteSize()) }
private val NSTypeIdentifierTransitInformationText_VH: VarHandle by lazy { NSTypeIdentifierTransitInformationText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
var NSTypeIdentifierTransitInformationText: MemorySegment
    get() = NSTypeIdentifierTransitInformationText_VH.get(NSTypeIdentifierTransitInformationText_SEGMENT, 0L) as MemorySegment
    set(value) = NSTypeIdentifierTransitInformationText_VH.set(NSTypeIdentifierTransitInformationText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentStorageUnsupportedAttributeAddedNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextContentStorageUnsupportedAttributeAddedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentStorageUnsupportedAttributeAddedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextContentStorageUnsupportedAttributeAddedNotification").orElseThrow().reinterpret(NSTextContentStorageUnsupportedAttributeAddedNotification_LAYOUT.byteSize()) }
private val NSTextContentStorageUnsupportedAttributeAddedNotification_VH: VarHandle by lazy { NSTextContentStorageUnsupportedAttributeAddedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentStorageUnsupportedAttributeAddedNotification: MemorySegment
    get() = NSTextContentStorageUnsupportedAttributeAddedNotification_VH.get(NSTextContentStorageUnsupportedAttributeAddedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentStorageUnsupportedAttributeAddedNotification_VH.set(NSTextContentStorageUnsupportedAttributeAddedNotification_SEGMENT, 0L, value)
