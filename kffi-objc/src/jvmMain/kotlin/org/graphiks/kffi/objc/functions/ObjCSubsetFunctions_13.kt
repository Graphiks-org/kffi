package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : NSSystemColorsDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSSystemColorsDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSystemColorsDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSystemColorsDidChangeNotification").orElseThrow() }
private val NSSystemColorsDidChangeNotification_VH: VarHandle by lazy { NSSystemColorsDidChangeNotification_LAYOUT.varHandle() }

var NSSystemColorsDidChangeNotification: MemorySegment
    get() = NSSystemColorsDidChangeNotification_VH.get(NSSystemColorsDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSSystemColorsDidChangeNotification_VH.set(NSSystemColorsDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSContextHelpModeDidActivateNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSContextHelpModeDidActivateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContextHelpModeDidActivateNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContextHelpModeDidActivateNotification").orElseThrow() }
private val NSContextHelpModeDidActivateNotification_VH: VarHandle by lazy { NSContextHelpModeDidActivateNotification_LAYOUT.varHandle() }

var NSContextHelpModeDidActivateNotification: MemorySegment
    get() = NSContextHelpModeDidActivateNotification_VH.get(NSContextHelpModeDidActivateNotification_SEGMENT) as MemorySegment
    set(value) = NSContextHelpModeDidActivateNotification_VH.set(NSContextHelpModeDidActivateNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSContextHelpModeDidDeactivateNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSContextHelpModeDidDeactivateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContextHelpModeDidDeactivateNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContextHelpModeDidDeactivateNotification").orElseThrow() }
private val NSContextHelpModeDidDeactivateNotification_VH: VarHandle by lazy { NSContextHelpModeDidDeactivateNotification_LAYOUT.varHandle() }

var NSContextHelpModeDidDeactivateNotification: MemorySegment
    get() = NSContextHelpModeDidDeactivateNotification_VH.get(NSContextHelpModeDidDeactivateNotification_SEGMENT) as MemorySegment
    set(value) = NSContextHelpModeDidDeactivateNotification_VH.set(NSContextHelpModeDidDeactivateNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSControlTextDidBeginEditingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSControlTextDidBeginEditingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSControlTextDidBeginEditingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSControlTextDidBeginEditingNotification").orElseThrow() }
private val NSControlTextDidBeginEditingNotification_VH: VarHandle by lazy { NSControlTextDidBeginEditingNotification_LAYOUT.varHandle() }

var NSControlTextDidBeginEditingNotification: MemorySegment
    get() = NSControlTextDidBeginEditingNotification_VH.get(NSControlTextDidBeginEditingNotification_SEGMENT) as MemorySegment
    set(value) = NSControlTextDidBeginEditingNotification_VH.set(NSControlTextDidBeginEditingNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSControlTextDidEndEditingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSControlTextDidEndEditingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSControlTextDidEndEditingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSControlTextDidEndEditingNotification").orElseThrow() }
private val NSControlTextDidEndEditingNotification_VH: VarHandle by lazy { NSControlTextDidEndEditingNotification_LAYOUT.varHandle() }

var NSControlTextDidEndEditingNotification: MemorySegment
    get() = NSControlTextDidEndEditingNotification_VH.get(NSControlTextDidEndEditingNotification_SEGMENT) as MemorySegment
    set(value) = NSControlTextDidEndEditingNotification_VH.set(NSControlTextDidEndEditingNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSControlTextDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSControlTextDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSControlTextDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSControlTextDidChangeNotification").orElseThrow() }
private val NSControlTextDidChangeNotification_VH: VarHandle by lazy { NSControlTextDidChangeNotification_LAYOUT.varHandle() }

var NSControlTextDidChangeNotification: MemorySegment
    get() = NSControlTextDidChangeNotification_VH.get(NSControlTextDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSControlTextDidChangeNotification_VH.set(NSControlTextDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierFixedSpaceSmall typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierFixedSpaceSmall_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierFixedSpaceSmall_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierFixedSpaceSmall").orElseThrow() }
private val NSTouchBarItemIdentifierFixedSpaceSmall_VH: VarHandle by lazy { NSTouchBarItemIdentifierFixedSpaceSmall_LAYOUT.varHandle() }

var NSTouchBarItemIdentifierFixedSpaceSmall: MemorySegment
    get() = NSTouchBarItemIdentifierFixedSpaceSmall_VH.get(NSTouchBarItemIdentifierFixedSpaceSmall_SEGMENT) as MemorySegment
    set(value) = NSTouchBarItemIdentifierFixedSpaceSmall_VH.set(NSTouchBarItemIdentifierFixedSpaceSmall_SEGMENT, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierFixedSpaceLarge typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierFixedSpaceLarge_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierFixedSpaceLarge_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierFixedSpaceLarge").orElseThrow() }
private val NSTouchBarItemIdentifierFixedSpaceLarge_VH: VarHandle by lazy { NSTouchBarItemIdentifierFixedSpaceLarge_LAYOUT.varHandle() }

var NSTouchBarItemIdentifierFixedSpaceLarge: MemorySegment
    get() = NSTouchBarItemIdentifierFixedSpaceLarge_VH.get(NSTouchBarItemIdentifierFixedSpaceLarge_SEGMENT) as MemorySegment
    set(value) = NSTouchBarItemIdentifierFixedSpaceLarge_VH.set(NSTouchBarItemIdentifierFixedSpaceLarge_SEGMENT, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierFlexibleSpace typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierFlexibleSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierFlexibleSpace_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierFlexibleSpace").orElseThrow() }
private val NSTouchBarItemIdentifierFlexibleSpace_VH: VarHandle by lazy { NSTouchBarItemIdentifierFlexibleSpace_LAYOUT.varHandle() }

var NSTouchBarItemIdentifierFlexibleSpace: MemorySegment
    get() = NSTouchBarItemIdentifierFlexibleSpace_VH.get(NSTouchBarItemIdentifierFlexibleSpace_SEGMENT) as MemorySegment
    set(value) = NSTouchBarItemIdentifierFlexibleSpace_VH.set(NSTouchBarItemIdentifierFlexibleSpace_SEGMENT, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierOtherItemsProxy typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierOtherItemsProxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierOtherItemsProxy_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierOtherItemsProxy").orElseThrow() }
private val NSTouchBarItemIdentifierOtherItemsProxy_VH: VarHandle by lazy { NSTouchBarItemIdentifierOtherItemsProxy_LAYOUT.varHandle() }

var NSTouchBarItemIdentifierOtherItemsProxy: MemorySegment
    get() = NSTouchBarItemIdentifierOtherItemsProxy_VH.get(NSTouchBarItemIdentifierOtherItemsProxy_SEGMENT) as MemorySegment
    set(value) = NSTouchBarItemIdentifierOtherItemsProxy_VH.set(NSTouchBarItemIdentifierOtherItemsProxy_SEGMENT, value)

/**
 * {@snippet lang=c : NSTouchBarItemIdentifierCandidateList typedef const NSTouchBarItemIdentifier = (Void)*
 */
private val NSTouchBarItemIdentifierCandidateList_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTouchBarItemIdentifierCandidateList_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTouchBarItemIdentifierCandidateList").orElseThrow() }
private val NSTouchBarItemIdentifierCandidateList_VH: VarHandle by lazy { NSTouchBarItemIdentifierCandidateList_LAYOUT.varHandle() }

var NSTouchBarItemIdentifierCandidateList: MemorySegment
    get() = NSTouchBarItemIdentifierCandidateList_VH.get(NSTouchBarItemIdentifierCandidateList_SEGMENT) as MemorySegment
    set(value) = NSTouchBarItemIdentifierCandidateList_VH.set(NSTouchBarItemIdentifierCandidateList_SEGMENT, value)

/**
 * {@snippet lang=c : NSPopoverCloseReasonKey (Void)*
 */
private val NSPopoverCloseReasonKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopoverCloseReasonKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPopoverCloseReasonKey").orElseThrow() }
private val NSPopoverCloseReasonKey_VH: VarHandle by lazy { NSPopoverCloseReasonKey_LAYOUT.varHandle() }

var NSPopoverCloseReasonKey: MemorySegment
    get() = NSPopoverCloseReasonKey_VH.get(NSPopoverCloseReasonKey_SEGMENT) as MemorySegment
    set(value) = NSPopoverCloseReasonKey_VH.set(NSPopoverCloseReasonKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSPopoverCloseReasonStandard typedef const NSPopoverCloseReasonValue = (Void)*
 */
private val NSPopoverCloseReasonStandard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopoverCloseReasonStandard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPopoverCloseReasonStandard").orElseThrow() }
private val NSPopoverCloseReasonStandard_VH: VarHandle by lazy { NSPopoverCloseReasonStandard_LAYOUT.varHandle() }

var NSPopoverCloseReasonStandard: MemorySegment
    get() = NSPopoverCloseReasonStandard_VH.get(NSPopoverCloseReasonStandard_SEGMENT) as MemorySegment
    set(value) = NSPopoverCloseReasonStandard_VH.set(NSPopoverCloseReasonStandard_SEGMENT, value)

/**
 * {@snippet lang=c : NSPopoverCloseReasonDetachToWindow typedef const NSPopoverCloseReasonValue = (Void)*
 */
private val NSPopoverCloseReasonDetachToWindow_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopoverCloseReasonDetachToWindow_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPopoverCloseReasonDetachToWindow").orElseThrow() }
private val NSPopoverCloseReasonDetachToWindow_VH: VarHandle by lazy { NSPopoverCloseReasonDetachToWindow_LAYOUT.varHandle() }

var NSPopoverCloseReasonDetachToWindow: MemorySegment
    get() = NSPopoverCloseReasonDetachToWindow_VH.get(NSPopoverCloseReasonDetachToWindow_SEGMENT) as MemorySegment
    set(value) = NSPopoverCloseReasonDetachToWindow_VH.set(NSPopoverCloseReasonDetachToWindow_SEGMENT, value)

/**
 * {@snippet lang=c : NSPopoverWillShowNotification typedef const NSNotificationName = (Void)*
 */
private val NSPopoverWillShowNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopoverWillShowNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPopoverWillShowNotification").orElseThrow() }
private val NSPopoverWillShowNotification_VH: VarHandle by lazy { NSPopoverWillShowNotification_LAYOUT.varHandle() }

var NSPopoverWillShowNotification: MemorySegment
    get() = NSPopoverWillShowNotification_VH.get(NSPopoverWillShowNotification_SEGMENT) as MemorySegment
    set(value) = NSPopoverWillShowNotification_VH.set(NSPopoverWillShowNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSPopoverDidShowNotification typedef const NSNotificationName = (Void)*
 */
private val NSPopoverDidShowNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopoverDidShowNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPopoverDidShowNotification").orElseThrow() }
private val NSPopoverDidShowNotification_VH: VarHandle by lazy { NSPopoverDidShowNotification_LAYOUT.varHandle() }

var NSPopoverDidShowNotification: MemorySegment
    get() = NSPopoverDidShowNotification_VH.get(NSPopoverDidShowNotification_SEGMENT) as MemorySegment
    set(value) = NSPopoverDidShowNotification_VH.set(NSPopoverDidShowNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSPopoverWillCloseNotification typedef const NSNotificationName = (Void)*
 */
private val NSPopoverWillCloseNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopoverWillCloseNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPopoverWillCloseNotification").orElseThrow() }
private val NSPopoverWillCloseNotification_VH: VarHandle by lazy { NSPopoverWillCloseNotification_LAYOUT.varHandle() }

var NSPopoverWillCloseNotification: MemorySegment
    get() = NSPopoverWillCloseNotification_VH.get(NSPopoverWillCloseNotification_SEGMENT) as MemorySegment
    set(value) = NSPopoverWillCloseNotification_VH.set(NSPopoverWillCloseNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSPopoverDidCloseNotification typedef const NSNotificationName = (Void)*
 */
private val NSPopoverDidCloseNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopoverDidCloseNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPopoverDidCloseNotification").orElseThrow() }
private val NSPopoverDidCloseNotification_VH: VarHandle by lazy { NSPopoverDidCloseNotification_LAYOUT.varHandle() }

var NSPopoverDidCloseNotification: MemorySegment
    get() = NSPopoverDidCloseNotification_VH.get(NSPopoverDidCloseNotification_SEGMENT) as MemorySegment
    set(value) = NSPopoverDidCloseNotification_VH.set(NSPopoverDidCloseNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSCollectionElementKindInterItemGapIndicator typedef const NSCollectionViewSupplementaryElementKind = (Void)*
 */
private val NSCollectionElementKindInterItemGapIndicator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCollectionElementKindInterItemGapIndicator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCollectionElementKindInterItemGapIndicator").orElseThrow() }
private val NSCollectionElementKindInterItemGapIndicator_VH: VarHandle by lazy { NSCollectionElementKindInterItemGapIndicator_LAYOUT.varHandle() }

var NSCollectionElementKindInterItemGapIndicator: MemorySegment
    get() = NSCollectionElementKindInterItemGapIndicator_VH.get(NSCollectionElementKindInterItemGapIndicator_SEGMENT) as MemorySegment
    set(value) = NSCollectionElementKindInterItemGapIndicator_VH.set(NSCollectionElementKindInterItemGapIndicator_SEGMENT, value)

/**
 * {@snippet lang=c : NSCollectionElementKindSectionHeader typedef const NSCollectionViewSupplementaryElementKind = (Void)*
 */
private val NSCollectionElementKindSectionHeader_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCollectionElementKindSectionHeader_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCollectionElementKindSectionHeader").orElseThrow() }
private val NSCollectionElementKindSectionHeader_VH: VarHandle by lazy { NSCollectionElementKindSectionHeader_LAYOUT.varHandle() }

var NSCollectionElementKindSectionHeader: MemorySegment
    get() = NSCollectionElementKindSectionHeader_VH.get(NSCollectionElementKindSectionHeader_SEGMENT) as MemorySegment
    set(value) = NSCollectionElementKindSectionHeader_VH.set(NSCollectionElementKindSectionHeader_SEGMENT, value)

/**
 * {@snippet lang=c : NSCollectionElementKindSectionFooter typedef const NSCollectionViewSupplementaryElementKind = (Void)*
 */
private val NSCollectionElementKindSectionFooter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCollectionElementKindSectionFooter_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCollectionElementKindSectionFooter").orElseThrow() }
private val NSCollectionElementKindSectionFooter_VH: VarHandle by lazy { NSCollectionElementKindSectionFooter_LAYOUT.varHandle() }

var NSCollectionElementKindSectionFooter: MemorySegment
    get() = NSCollectionElementKindSectionFooter_VH.get(NSCollectionElementKindSectionFooter_SEGMENT) as MemorySegment
    set(value) = NSCollectionElementKindSectionFooter_VH.set(NSCollectionElementKindSectionFooter_SEGMENT, value)

/**
 * {@snippet lang=c : NSDirectionalEdgeInsetsZero typedef const NSDirectionalEdgeInsets = Declared(NSDirectionalEdgeInsets)
 */
val NSDirectionalEdgeInsetsZero: MemorySegment = SymbolLookup.loaderLookup().find("NSDirectionalEdgeInsetsZero").orElseThrow()

/**
 * {@snippet lang=c : NSFontFamilyAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontFamilyAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontFamilyAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontFamilyAttribute").orElseThrow() }
private val NSFontFamilyAttribute_VH: VarHandle by lazy { NSFontFamilyAttribute_LAYOUT.varHandle() }

var NSFontFamilyAttribute: MemorySegment
    get() = NSFontFamilyAttribute_VH.get(NSFontFamilyAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontFamilyAttribute_VH.set(NSFontFamilyAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontNameAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontNameAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontNameAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontNameAttribute").orElseThrow() }
private val NSFontNameAttribute_VH: VarHandle by lazy { NSFontNameAttribute_LAYOUT.varHandle() }

var NSFontNameAttribute: MemorySegment
    get() = NSFontNameAttribute_VH.get(NSFontNameAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontNameAttribute_VH.set(NSFontNameAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontFaceAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontFaceAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontFaceAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontFaceAttribute").orElseThrow() }
private val NSFontFaceAttribute_VH: VarHandle by lazy { NSFontFaceAttribute_LAYOUT.varHandle() }

var NSFontFaceAttribute: MemorySegment
    get() = NSFontFaceAttribute_VH.get(NSFontFaceAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontFaceAttribute_VH.set(NSFontFaceAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontSizeAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontSizeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontSizeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontSizeAttribute").orElseThrow() }
private val NSFontSizeAttribute_VH: VarHandle by lazy { NSFontSizeAttribute_LAYOUT.varHandle() }

var NSFontSizeAttribute: MemorySegment
    get() = NSFontSizeAttribute_VH.get(NSFontSizeAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontSizeAttribute_VH.set(NSFontSizeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontVisibleNameAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontVisibleNameAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontVisibleNameAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontVisibleNameAttribute").orElseThrow() }
private val NSFontVisibleNameAttribute_VH: VarHandle by lazy { NSFontVisibleNameAttribute_LAYOUT.varHandle() }

var NSFontVisibleNameAttribute: MemorySegment
    get() = NSFontVisibleNameAttribute_VH.get(NSFontVisibleNameAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontVisibleNameAttribute_VH.set(NSFontVisibleNameAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontMatrixAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontMatrixAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontMatrixAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontMatrixAttribute").orElseThrow() }
private val NSFontMatrixAttribute_VH: VarHandle by lazy { NSFontMatrixAttribute_LAYOUT.varHandle() }

var NSFontMatrixAttribute: MemorySegment
    get() = NSFontMatrixAttribute_VH.get(NSFontMatrixAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontMatrixAttribute_VH.set(NSFontMatrixAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontVariationAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontVariationAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontVariationAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontVariationAttribute").orElseThrow() }
private val NSFontVariationAttribute_VH: VarHandle by lazy { NSFontVariationAttribute_LAYOUT.varHandle() }

var NSFontVariationAttribute: MemorySegment
    get() = NSFontVariationAttribute_VH.get(NSFontVariationAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontVariationAttribute_VH.set(NSFontVariationAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCharacterSetAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontCharacterSetAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCharacterSetAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCharacterSetAttribute").orElseThrow() }
private val NSFontCharacterSetAttribute_VH: VarHandle by lazy { NSFontCharacterSetAttribute_LAYOUT.varHandle() }

var NSFontCharacterSetAttribute: MemorySegment
    get() = NSFontCharacterSetAttribute_VH.get(NSFontCharacterSetAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontCharacterSetAttribute_VH.set(NSFontCharacterSetAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCascadeListAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontCascadeListAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCascadeListAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCascadeListAttribute").orElseThrow() }
private val NSFontCascadeListAttribute_VH: VarHandle by lazy { NSFontCascadeListAttribute_LAYOUT.varHandle() }

var NSFontCascadeListAttribute: MemorySegment
    get() = NSFontCascadeListAttribute_VH.get(NSFontCascadeListAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontCascadeListAttribute_VH.set(NSFontCascadeListAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTraitsAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontTraitsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTraitsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTraitsAttribute").orElseThrow() }
private val NSFontTraitsAttribute_VH: VarHandle by lazy { NSFontTraitsAttribute_LAYOUT.varHandle() }

var NSFontTraitsAttribute: MemorySegment
    get() = NSFontTraitsAttribute_VH.get(NSFontTraitsAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontTraitsAttribute_VH.set(NSFontTraitsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontFixedAdvanceAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontFixedAdvanceAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontFixedAdvanceAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontFixedAdvanceAttribute").orElseThrow() }
private val NSFontFixedAdvanceAttribute_VH: VarHandle by lazy { NSFontFixedAdvanceAttribute_LAYOUT.varHandle() }

var NSFontFixedAdvanceAttribute: MemorySegment
    get() = NSFontFixedAdvanceAttribute_VH.get(NSFontFixedAdvanceAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontFixedAdvanceAttribute_VH.set(NSFontFixedAdvanceAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontFeatureSettingsAttribute typedef NSFontDescriptorAttributeName = typedef NSString = (Void)*
 */
private val NSFontFeatureSettingsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontFeatureSettingsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontFeatureSettingsAttribute").orElseThrow() }
private val NSFontFeatureSettingsAttribute_VH: VarHandle by lazy { NSFontFeatureSettingsAttribute_LAYOUT.varHandle() }

var NSFontFeatureSettingsAttribute: MemorySegment
    get() = NSFontFeatureSettingsAttribute_VH.get(NSFontFeatureSettingsAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontFeatureSettingsAttribute_VH.set(NSFontFeatureSettingsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontSymbolicTrait typedef NSFontDescriptorTraitKey = typedef NSString = (Void)*
 */
private val NSFontSymbolicTrait_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontSymbolicTrait_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontSymbolicTrait").orElseThrow() }
private val NSFontSymbolicTrait_VH: VarHandle by lazy { NSFontSymbolicTrait_LAYOUT.varHandle() }

var NSFontSymbolicTrait: MemorySegment
    get() = NSFontSymbolicTrait_VH.get(NSFontSymbolicTrait_SEGMENT) as MemorySegment
    set(value) = NSFontSymbolicTrait_VH.set(NSFontSymbolicTrait_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightTrait typedef NSFontDescriptorTraitKey = typedef NSString = (Void)*
 */
private val NSFontWeightTrait_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontWeightTrait_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightTrait").orElseThrow() }
private val NSFontWeightTrait_VH: VarHandle by lazy { NSFontWeightTrait_LAYOUT.varHandle() }

var NSFontWeightTrait: MemorySegment
    get() = NSFontWeightTrait_VH.get(NSFontWeightTrait_SEGMENT) as MemorySegment
    set(value) = NSFontWeightTrait_VH.set(NSFontWeightTrait_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWidthTrait typedef NSFontDescriptorTraitKey = typedef NSString = (Void)*
 */
private val NSFontWidthTrait_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontWidthTrait_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWidthTrait").orElseThrow() }
private val NSFontWidthTrait_VH: VarHandle by lazy { NSFontWidthTrait_LAYOUT.varHandle() }

var NSFontWidthTrait: MemorySegment
    get() = NSFontWidthTrait_VH.get(NSFontWidthTrait_SEGMENT) as MemorySegment
    set(value) = NSFontWidthTrait_VH.set(NSFontWidthTrait_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontSlantTrait typedef NSFontDescriptorTraitKey = typedef NSString = (Void)*
 */
private val NSFontSlantTrait_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontSlantTrait_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontSlantTrait").orElseThrow() }
private val NSFontSlantTrait_VH: VarHandle by lazy { NSFontSlantTrait_LAYOUT.varHandle() }

var NSFontSlantTrait: MemorySegment
    get() = NSFontSlantTrait_VH.get(NSFontSlantTrait_SEGMENT) as MemorySegment
    set(value) = NSFontSlantTrait_VH.set(NSFontSlantTrait_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontVariationAxisIdentifierKey typedef NSFontDescriptorVariationKey = typedef NSString = (Void)*
 */
private val NSFontVariationAxisIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontVariationAxisIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontVariationAxisIdentifierKey").orElseThrow() }
private val NSFontVariationAxisIdentifierKey_VH: VarHandle by lazy { NSFontVariationAxisIdentifierKey_LAYOUT.varHandle() }

var NSFontVariationAxisIdentifierKey: MemorySegment
    get() = NSFontVariationAxisIdentifierKey_VH.get(NSFontVariationAxisIdentifierKey_SEGMENT) as MemorySegment
    set(value) = NSFontVariationAxisIdentifierKey_VH.set(NSFontVariationAxisIdentifierKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontVariationAxisMinimumValueKey typedef NSFontDescriptorVariationKey = typedef NSString = (Void)*
 */
private val NSFontVariationAxisMinimumValueKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontVariationAxisMinimumValueKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontVariationAxisMinimumValueKey").orElseThrow() }
private val NSFontVariationAxisMinimumValueKey_VH: VarHandle by lazy { NSFontVariationAxisMinimumValueKey_LAYOUT.varHandle() }

var NSFontVariationAxisMinimumValueKey: MemorySegment
    get() = NSFontVariationAxisMinimumValueKey_VH.get(NSFontVariationAxisMinimumValueKey_SEGMENT) as MemorySegment
    set(value) = NSFontVariationAxisMinimumValueKey_VH.set(NSFontVariationAxisMinimumValueKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontVariationAxisMaximumValueKey typedef NSFontDescriptorVariationKey = typedef NSString = (Void)*
 */
private val NSFontVariationAxisMaximumValueKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontVariationAxisMaximumValueKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontVariationAxisMaximumValueKey").orElseThrow() }
private val NSFontVariationAxisMaximumValueKey_VH: VarHandle by lazy { NSFontVariationAxisMaximumValueKey_LAYOUT.varHandle() }

var NSFontVariationAxisMaximumValueKey: MemorySegment
    get() = NSFontVariationAxisMaximumValueKey_VH.get(NSFontVariationAxisMaximumValueKey_SEGMENT) as MemorySegment
    set(value) = NSFontVariationAxisMaximumValueKey_VH.set(NSFontVariationAxisMaximumValueKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontVariationAxisDefaultValueKey typedef NSFontDescriptorVariationKey = typedef NSString = (Void)*
 */
private val NSFontVariationAxisDefaultValueKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontVariationAxisDefaultValueKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontVariationAxisDefaultValueKey").orElseThrow() }
private val NSFontVariationAxisDefaultValueKey_VH: VarHandle by lazy { NSFontVariationAxisDefaultValueKey_LAYOUT.varHandle() }

var NSFontVariationAxisDefaultValueKey: MemorySegment
    get() = NSFontVariationAxisDefaultValueKey_VH.get(NSFontVariationAxisDefaultValueKey_SEGMENT) as MemorySegment
    set(value) = NSFontVariationAxisDefaultValueKey_VH.set(NSFontVariationAxisDefaultValueKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontVariationAxisNameKey typedef NSFontDescriptorVariationKey = typedef NSString = (Void)*
 */
private val NSFontVariationAxisNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontVariationAxisNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontVariationAxisNameKey").orElseThrow() }
private val NSFontVariationAxisNameKey_VH: VarHandle by lazy { NSFontVariationAxisNameKey_LAYOUT.varHandle() }

var NSFontVariationAxisNameKey: MemorySegment
    get() = NSFontVariationAxisNameKey_VH.get(NSFontVariationAxisNameKey_SEGMENT) as MemorySegment
    set(value) = NSFontVariationAxisNameKey_VH.set(NSFontVariationAxisNameKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontFeatureTypeIdentifierKey typedef NSFontDescriptorFeatureKey = typedef NSString = (Void)*
 */
private val NSFontFeatureTypeIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontFeatureTypeIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontFeatureTypeIdentifierKey").orElseThrow() }
private val NSFontFeatureTypeIdentifierKey_VH: VarHandle by lazy { NSFontFeatureTypeIdentifierKey_LAYOUT.varHandle() }

var NSFontFeatureTypeIdentifierKey: MemorySegment
    get() = NSFontFeatureTypeIdentifierKey_VH.get(NSFontFeatureTypeIdentifierKey_SEGMENT) as MemorySegment
    set(value) = NSFontFeatureTypeIdentifierKey_VH.set(NSFontFeatureTypeIdentifierKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontFeatureSelectorIdentifierKey typedef NSFontDescriptorFeatureKey = typedef NSString = (Void)*
 */
private val NSFontFeatureSelectorIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontFeatureSelectorIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontFeatureSelectorIdentifierKey").orElseThrow() }
private val NSFontFeatureSelectorIdentifierKey_VH: VarHandle by lazy { NSFontFeatureSelectorIdentifierKey_LAYOUT.varHandle() }

var NSFontFeatureSelectorIdentifierKey: MemorySegment
    get() = NSFontFeatureSelectorIdentifierKey_VH.get(NSFontFeatureSelectorIdentifierKey_SEGMENT) as MemorySegment
    set(value) = NSFontFeatureSelectorIdentifierKey_VH.set(NSFontFeatureSelectorIdentifierKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightUltraLight typedef const NSFontWeight = Double
 */
private val NSFontWeightUltraLight_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightUltraLight_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightUltraLight").orElseThrow() }
private val NSFontWeightUltraLight_VH: VarHandle by lazy { NSFontWeightUltraLight_LAYOUT.varHandle() }

var NSFontWeightUltraLight: Double
    get() = NSFontWeightUltraLight_VH.get(NSFontWeightUltraLight_SEGMENT) as Double
    set(value) = NSFontWeightUltraLight_VH.set(NSFontWeightUltraLight_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightThin typedef const NSFontWeight = Double
 */
private val NSFontWeightThin_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightThin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightThin").orElseThrow() }
private val NSFontWeightThin_VH: VarHandle by lazy { NSFontWeightThin_LAYOUT.varHandle() }

var NSFontWeightThin: Double
    get() = NSFontWeightThin_VH.get(NSFontWeightThin_SEGMENT) as Double
    set(value) = NSFontWeightThin_VH.set(NSFontWeightThin_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightLight typedef const NSFontWeight = Double
 */
private val NSFontWeightLight_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightLight_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightLight").orElseThrow() }
private val NSFontWeightLight_VH: VarHandle by lazy { NSFontWeightLight_LAYOUT.varHandle() }

var NSFontWeightLight: Double
    get() = NSFontWeightLight_VH.get(NSFontWeightLight_SEGMENT) as Double
    set(value) = NSFontWeightLight_VH.set(NSFontWeightLight_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightRegular typedef const NSFontWeight = Double
 */
private val NSFontWeightRegular_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightRegular_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightRegular").orElseThrow() }
private val NSFontWeightRegular_VH: VarHandle by lazy { NSFontWeightRegular_LAYOUT.varHandle() }

var NSFontWeightRegular: Double
    get() = NSFontWeightRegular_VH.get(NSFontWeightRegular_SEGMENT) as Double
    set(value) = NSFontWeightRegular_VH.set(NSFontWeightRegular_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightMedium typedef const NSFontWeight = Double
 */
private val NSFontWeightMedium_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightMedium_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightMedium").orElseThrow() }
private val NSFontWeightMedium_VH: VarHandle by lazy { NSFontWeightMedium_LAYOUT.varHandle() }

var NSFontWeightMedium: Double
    get() = NSFontWeightMedium_VH.get(NSFontWeightMedium_SEGMENT) as Double
    set(value) = NSFontWeightMedium_VH.set(NSFontWeightMedium_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightSemibold typedef const NSFontWeight = Double
 */
private val NSFontWeightSemibold_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightSemibold_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightSemibold").orElseThrow() }
private val NSFontWeightSemibold_VH: VarHandle by lazy { NSFontWeightSemibold_LAYOUT.varHandle() }

var NSFontWeightSemibold: Double
    get() = NSFontWeightSemibold_VH.get(NSFontWeightSemibold_SEGMENT) as Double
    set(value) = NSFontWeightSemibold_VH.set(NSFontWeightSemibold_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightBold typedef const NSFontWeight = Double
 */
private val NSFontWeightBold_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightBold_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightBold").orElseThrow() }
private val NSFontWeightBold_VH: VarHandle by lazy { NSFontWeightBold_LAYOUT.varHandle() }

var NSFontWeightBold: Double
    get() = NSFontWeightBold_VH.get(NSFontWeightBold_SEGMENT) as Double
    set(value) = NSFontWeightBold_VH.set(NSFontWeightBold_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightHeavy typedef const NSFontWeight = Double
 */
private val NSFontWeightHeavy_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightHeavy_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightHeavy").orElseThrow() }
private val NSFontWeightHeavy_VH: VarHandle by lazy { NSFontWeightHeavy_LAYOUT.varHandle() }

var NSFontWeightHeavy: Double
    get() = NSFontWeightHeavy_VH.get(NSFontWeightHeavy_SEGMENT) as Double
    set(value) = NSFontWeightHeavy_VH.set(NSFontWeightHeavy_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWeightBlack typedef const NSFontWeight = Double
 */
private val NSFontWeightBlack_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWeightBlack_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWeightBlack").orElseThrow() }
private val NSFontWeightBlack_VH: VarHandle by lazy { NSFontWeightBlack_LAYOUT.varHandle() }

var NSFontWeightBlack: Double
    get() = NSFontWeightBlack_VH.get(NSFontWeightBlack_SEGMENT) as Double
    set(value) = NSFontWeightBlack_VH.set(NSFontWeightBlack_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWidthCompressed typedef const NSFontWidth = Double
 */
private val NSFontWidthCompressed_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWidthCompressed_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWidthCompressed").orElseThrow() }
private val NSFontWidthCompressed_VH: VarHandle by lazy { NSFontWidthCompressed_LAYOUT.varHandle() }

var NSFontWidthCompressed: Double
    get() = NSFontWidthCompressed_VH.get(NSFontWidthCompressed_SEGMENT) as Double
    set(value) = NSFontWidthCompressed_VH.set(NSFontWidthCompressed_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWidthCondensed typedef const NSFontWidth = Double
 */
private val NSFontWidthCondensed_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWidthCondensed_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWidthCondensed").orElseThrow() }
private val NSFontWidthCondensed_VH: VarHandle by lazy { NSFontWidthCondensed_LAYOUT.varHandle() }

var NSFontWidthCondensed: Double
    get() = NSFontWidthCondensed_VH.get(NSFontWidthCondensed_SEGMENT) as Double
    set(value) = NSFontWidthCondensed_VH.set(NSFontWidthCondensed_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWidthStandard typedef const NSFontWidth = Double
 */
private val NSFontWidthStandard_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWidthStandard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWidthStandard").orElseThrow() }
private val NSFontWidthStandard_VH: VarHandle by lazy { NSFontWidthStandard_LAYOUT.varHandle() }

var NSFontWidthStandard: Double
    get() = NSFontWidthStandard_VH.get(NSFontWidthStandard_SEGMENT) as Double
    set(value) = NSFontWidthStandard_VH.set(NSFontWidthStandard_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontWidthExpanded typedef const NSFontWidth = Double
 */
private val NSFontWidthExpanded_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFontWidthExpanded_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontWidthExpanded").orElseThrow() }
private val NSFontWidthExpanded_VH: VarHandle by lazy { NSFontWidthExpanded_LAYOUT.varHandle() }

var NSFontWidthExpanded: Double
    get() = NSFontWidthExpanded_VH.get(NSFontWidthExpanded_SEGMENT) as Double
    set(value) = NSFontWidthExpanded_VH.set(NSFontWidthExpanded_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontDescriptorSystemDesignDefault typedef const NSFontDescriptorSystemDesign = (Void)*
 */
private val NSFontDescriptorSystemDesignDefault_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontDescriptorSystemDesignDefault_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontDescriptorSystemDesignDefault").orElseThrow() }
private val NSFontDescriptorSystemDesignDefault_VH: VarHandle by lazy { NSFontDescriptorSystemDesignDefault_LAYOUT.varHandle() }

var NSFontDescriptorSystemDesignDefault: MemorySegment
    get() = NSFontDescriptorSystemDesignDefault_VH.get(NSFontDescriptorSystemDesignDefault_SEGMENT) as MemorySegment
    set(value) = NSFontDescriptorSystemDesignDefault_VH.set(NSFontDescriptorSystemDesignDefault_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontDescriptorSystemDesignSerif typedef const NSFontDescriptorSystemDesign = (Void)*
 */
private val NSFontDescriptorSystemDesignSerif_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontDescriptorSystemDesignSerif_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontDescriptorSystemDesignSerif").orElseThrow() }
private val NSFontDescriptorSystemDesignSerif_VH: VarHandle by lazy { NSFontDescriptorSystemDesignSerif_LAYOUT.varHandle() }

var NSFontDescriptorSystemDesignSerif: MemorySegment
    get() = NSFontDescriptorSystemDesignSerif_VH.get(NSFontDescriptorSystemDesignSerif_SEGMENT) as MemorySegment
    set(value) = NSFontDescriptorSystemDesignSerif_VH.set(NSFontDescriptorSystemDesignSerif_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontDescriptorSystemDesignMonospaced typedef const NSFontDescriptorSystemDesign = (Void)*
 */
private val NSFontDescriptorSystemDesignMonospaced_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontDescriptorSystemDesignMonospaced_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontDescriptorSystemDesignMonospaced").orElseThrow() }
private val NSFontDescriptorSystemDesignMonospaced_VH: VarHandle by lazy { NSFontDescriptorSystemDesignMonospaced_LAYOUT.varHandle() }

var NSFontDescriptorSystemDesignMonospaced: MemorySegment
    get() = NSFontDescriptorSystemDesignMonospaced_VH.get(NSFontDescriptorSystemDesignMonospaced_SEGMENT) as MemorySegment
    set(value) = NSFontDescriptorSystemDesignMonospaced_VH.set(NSFontDescriptorSystemDesignMonospaced_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontDescriptorSystemDesignRounded typedef const NSFontDescriptorSystemDesign = (Void)*
 */
private val NSFontDescriptorSystemDesignRounded_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontDescriptorSystemDesignRounded_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontDescriptorSystemDesignRounded").orElseThrow() }
private val NSFontDescriptorSystemDesignRounded_VH: VarHandle by lazy { NSFontDescriptorSystemDesignRounded_LAYOUT.varHandle() }

var NSFontDescriptorSystemDesignRounded: MemorySegment
    get() = NSFontDescriptorSystemDesignRounded_VH.get(NSFontDescriptorSystemDesignRounded_SEGMENT) as MemorySegment
    set(value) = NSFontDescriptorSystemDesignRounded_VH.set(NSFontDescriptorSystemDesignRounded_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleLargeTitle typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleLargeTitle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleLargeTitle_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleLargeTitle").orElseThrow() }
private val NSFontTextStyleLargeTitle_VH: VarHandle by lazy { NSFontTextStyleLargeTitle_LAYOUT.varHandle() }

var NSFontTextStyleLargeTitle: MemorySegment
    get() = NSFontTextStyleLargeTitle_VH.get(NSFontTextStyleLargeTitle_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleLargeTitle_VH.set(NSFontTextStyleLargeTitle_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleTitle1 typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleTitle1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleTitle1_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleTitle1").orElseThrow() }
private val NSFontTextStyleTitle1_VH: VarHandle by lazy { NSFontTextStyleTitle1_LAYOUT.varHandle() }

var NSFontTextStyleTitle1: MemorySegment
    get() = NSFontTextStyleTitle1_VH.get(NSFontTextStyleTitle1_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleTitle1_VH.set(NSFontTextStyleTitle1_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleTitle2 typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleTitle2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleTitle2_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleTitle2").orElseThrow() }
private val NSFontTextStyleTitle2_VH: VarHandle by lazy { NSFontTextStyleTitle2_LAYOUT.varHandle() }

var NSFontTextStyleTitle2: MemorySegment
    get() = NSFontTextStyleTitle2_VH.get(NSFontTextStyleTitle2_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleTitle2_VH.set(NSFontTextStyleTitle2_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleTitle3 typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleTitle3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleTitle3_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleTitle3").orElseThrow() }
private val NSFontTextStyleTitle3_VH: VarHandle by lazy { NSFontTextStyleTitle3_LAYOUT.varHandle() }

var NSFontTextStyleTitle3: MemorySegment
    get() = NSFontTextStyleTitle3_VH.get(NSFontTextStyleTitle3_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleTitle3_VH.set(NSFontTextStyleTitle3_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleHeadline typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleHeadline_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleHeadline_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleHeadline").orElseThrow() }
private val NSFontTextStyleHeadline_VH: VarHandle by lazy { NSFontTextStyleHeadline_LAYOUT.varHandle() }

var NSFontTextStyleHeadline: MemorySegment
    get() = NSFontTextStyleHeadline_VH.get(NSFontTextStyleHeadline_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleHeadline_VH.set(NSFontTextStyleHeadline_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleSubheadline typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleSubheadline_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleSubheadline_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleSubheadline").orElseThrow() }
private val NSFontTextStyleSubheadline_VH: VarHandle by lazy { NSFontTextStyleSubheadline_LAYOUT.varHandle() }

var NSFontTextStyleSubheadline: MemorySegment
    get() = NSFontTextStyleSubheadline_VH.get(NSFontTextStyleSubheadline_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleSubheadline_VH.set(NSFontTextStyleSubheadline_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleBody typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleBody_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleBody_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleBody").orElseThrow() }
private val NSFontTextStyleBody_VH: VarHandle by lazy { NSFontTextStyleBody_LAYOUT.varHandle() }

var NSFontTextStyleBody: MemorySegment
    get() = NSFontTextStyleBody_VH.get(NSFontTextStyleBody_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleBody_VH.set(NSFontTextStyleBody_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleCallout typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleCallout_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleCallout_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleCallout").orElseThrow() }
private val NSFontTextStyleCallout_VH: VarHandle by lazy { NSFontTextStyleCallout_LAYOUT.varHandle() }

var NSFontTextStyleCallout: MemorySegment
    get() = NSFontTextStyleCallout_VH.get(NSFontTextStyleCallout_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleCallout_VH.set(NSFontTextStyleCallout_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleFootnote typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleFootnote_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleFootnote_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleFootnote").orElseThrow() }
private val NSFontTextStyleFootnote_VH: VarHandle by lazy { NSFontTextStyleFootnote_LAYOUT.varHandle() }

var NSFontTextStyleFootnote: MemorySegment
    get() = NSFontTextStyleFootnote_VH.get(NSFontTextStyleFootnote_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleFootnote_VH.set(NSFontTextStyleFootnote_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleCaption1 typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleCaption1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleCaption1_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleCaption1").orElseThrow() }
private val NSFontTextStyleCaption1_VH: VarHandle by lazy { NSFontTextStyleCaption1_LAYOUT.varHandle() }

var NSFontTextStyleCaption1: MemorySegment
    get() = NSFontTextStyleCaption1_VH.get(NSFontTextStyleCaption1_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleCaption1_VH.set(NSFontTextStyleCaption1_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontTextStyleCaption2 typedef const NSFontTextStyle = (Void)*
 */
private val NSFontTextStyleCaption2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontTextStyleCaption2_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontTextStyleCaption2").orElseThrow() }
private val NSFontTextStyleCaption2_VH: VarHandle by lazy { NSFontTextStyleCaption2_LAYOUT.varHandle() }

var NSFontTextStyleCaption2: MemorySegment
    get() = NSFontTextStyleCaption2_VH.get(NSFontTextStyleCaption2_SEGMENT) as MemorySegment
    set(value) = NSFontTextStyleCaption2_VH.set(NSFontTextStyleCaption2_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontColorAttribute typedef NSString = (Void)*
 */
private val NSFontColorAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontColorAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontColorAttribute").orElseThrow() }
private val NSFontColorAttribute_VH: VarHandle by lazy { NSFontColorAttribute_LAYOUT.varHandle() }

var NSFontColorAttribute: MemorySegment
    get() = NSFontColorAttribute_VH.get(NSFontColorAttribute_SEGMENT) as MemorySegment
    set(value) = NSFontColorAttribute_VH.set(NSFontColorAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontIdentityMatrix (typedef CGFloat = Double)*
 */
private val NSFontIdentityMatrix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontIdentityMatrix_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontIdentityMatrix").orElseThrow() }
private val NSFontIdentityMatrix_VH: VarHandle by lazy { NSFontIdentityMatrix_LAYOUT.varHandle() }

var NSFontIdentityMatrix: MemorySegment
    get() = NSFontIdentityMatrix_VH.get(NSFontIdentityMatrix_SEGMENT) as MemorySegment
    set(value) = NSFontIdentityMatrix_VH.set(NSFontIdentityMatrix_SEGMENT, value)

/**
 * {@snippet lang=c : NSAntialiasThresholdChangedNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSAntialiasThresholdChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAntialiasThresholdChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAntialiasThresholdChangedNotification").orElseThrow() }
private val NSAntialiasThresholdChangedNotification_VH: VarHandle by lazy { NSAntialiasThresholdChangedNotification_LAYOUT.varHandle() }

var NSAntialiasThresholdChangedNotification: MemorySegment
    get() = NSAntialiasThresholdChangedNotification_VH.get(NSAntialiasThresholdChangedNotification_SEGMENT) as MemorySegment
    set(value) = NSAntialiasThresholdChangedNotification_VH.set(NSAntialiasThresholdChangedNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontSetChangedNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSFontSetChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontSetChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontSetChangedNotification").orElseThrow() }
private val NSFontSetChangedNotification_VH: VarHandle by lazy { NSFontSetChangedNotification_LAYOUT.varHandle() }

var NSFontSetChangedNotification: MemorySegment
    get() = NSFontSetChangedNotification_VH.get(NSFontSetChangedNotification_SEGMENT) as MemorySegment
    set(value) = NSFontSetChangedNotification_VH.set(NSFontSetChangedNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSConvertGlyphsToPackedGlyphs typedef NSInteger = Long((typedef NSGlyph = UNSIGNED = Int)*,typedef NSInteger = Long,typedef NSMultibyteGlyphPacking = Declared(NSMultibyteGlyphPacking),(Char)*)
 */
private val NSConvertGlyphsToPackedGlyphs_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSConvertGlyphsToPackedGlyphs_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSConvertGlyphsToPackedGlyphs").orElseThrow()
private val NSConvertGlyphsToPackedGlyphs_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSConvertGlyphsToPackedGlyphs_ADDR, NSConvertGlyphsToPackedGlyphs_DESC)

fun NSConvertGlyphsToPackedGlyphs(arg0: MemorySegment, arg1: Long, arg2: NSMultibyteGlyphPacking, arg3: MemorySegment): Long {
    try {
        return NSConvertGlyphsToPackedGlyphs_HANDLE.invokeExact(arg0, arg1, arg2.value, arg3) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSFontCollectionIncludeDisabledFontsOption typedef const NSFontCollectionMatchingOptionKey = (Void)*
 */
private val NSFontCollectionIncludeDisabledFontsOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionIncludeDisabledFontsOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionIncludeDisabledFontsOption").orElseThrow() }
private val NSFontCollectionIncludeDisabledFontsOption_VH: VarHandle by lazy { NSFontCollectionIncludeDisabledFontsOption_LAYOUT.varHandle() }

var NSFontCollectionIncludeDisabledFontsOption: MemorySegment
    get() = NSFontCollectionIncludeDisabledFontsOption_VH.get(NSFontCollectionIncludeDisabledFontsOption_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionIncludeDisabledFontsOption_VH.set(NSFontCollectionIncludeDisabledFontsOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionRemoveDuplicatesOption typedef const NSFontCollectionMatchingOptionKey = (Void)*
 */
private val NSFontCollectionRemoveDuplicatesOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionRemoveDuplicatesOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionRemoveDuplicatesOption").orElseThrow() }
private val NSFontCollectionRemoveDuplicatesOption_VH: VarHandle by lazy { NSFontCollectionRemoveDuplicatesOption_LAYOUT.varHandle() }

var NSFontCollectionRemoveDuplicatesOption: MemorySegment
    get() = NSFontCollectionRemoveDuplicatesOption_VH.get(NSFontCollectionRemoveDuplicatesOption_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionRemoveDuplicatesOption_VH.set(NSFontCollectionRemoveDuplicatesOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionDisallowAutoActivationOption typedef const NSFontCollectionMatchingOptionKey = (Void)*
 */
private val NSFontCollectionDisallowAutoActivationOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionDisallowAutoActivationOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionDisallowAutoActivationOption").orElseThrow() }
private val NSFontCollectionDisallowAutoActivationOption_VH: VarHandle by lazy { NSFontCollectionDisallowAutoActivationOption_LAYOUT.varHandle() }

var NSFontCollectionDisallowAutoActivationOption: MemorySegment
    get() = NSFontCollectionDisallowAutoActivationOption_VH.get(NSFontCollectionDisallowAutoActivationOption_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionDisallowAutoActivationOption_VH.set(NSFontCollectionDisallowAutoActivationOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSFontCollectionDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionDidChangeNotification").orElseThrow() }
private val NSFontCollectionDidChangeNotification_VH: VarHandle by lazy { NSFontCollectionDidChangeNotification_LAYOUT.varHandle() }

var NSFontCollectionDidChangeNotification: MemorySegment
    get() = NSFontCollectionDidChangeNotification_VH.get(NSFontCollectionDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionDidChangeNotification_VH.set(NSFontCollectionDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionActionKey typedef const NSFontCollectionUserInfoKey = (Void)*
 */
private val NSFontCollectionActionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionActionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionActionKey").orElseThrow() }
private val NSFontCollectionActionKey_VH: VarHandle by lazy { NSFontCollectionActionKey_LAYOUT.varHandle() }

var NSFontCollectionActionKey: MemorySegment
    get() = NSFontCollectionActionKey_VH.get(NSFontCollectionActionKey_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionActionKey_VH.set(NSFontCollectionActionKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionNameKey typedef const NSFontCollectionUserInfoKey = (Void)*
 */
private val NSFontCollectionNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionNameKey").orElseThrow() }
private val NSFontCollectionNameKey_VH: VarHandle by lazy { NSFontCollectionNameKey_LAYOUT.varHandle() }

var NSFontCollectionNameKey: MemorySegment
    get() = NSFontCollectionNameKey_VH.get(NSFontCollectionNameKey_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionNameKey_VH.set(NSFontCollectionNameKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionOldNameKey typedef const NSFontCollectionUserInfoKey = (Void)*
 */
private val NSFontCollectionOldNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionOldNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionOldNameKey").orElseThrow() }
private val NSFontCollectionOldNameKey_VH: VarHandle by lazy { NSFontCollectionOldNameKey_LAYOUT.varHandle() }

var NSFontCollectionOldNameKey: MemorySegment
    get() = NSFontCollectionOldNameKey_VH.get(NSFontCollectionOldNameKey_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionOldNameKey_VH.set(NSFontCollectionOldNameKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionVisibilityKey typedef const NSFontCollectionUserInfoKey = (Void)*
 */
private val NSFontCollectionVisibilityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionVisibilityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionVisibilityKey").orElseThrow() }
private val NSFontCollectionVisibilityKey_VH: VarHandle by lazy { NSFontCollectionVisibilityKey_LAYOUT.varHandle() }

var NSFontCollectionVisibilityKey: MemorySegment
    get() = NSFontCollectionVisibilityKey_VH.get(NSFontCollectionVisibilityKey_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionVisibilityKey_VH.set(NSFontCollectionVisibilityKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionWasShown typedef const NSFontCollectionActionTypeKey = (Void)*
 */
private val NSFontCollectionWasShown_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionWasShown_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionWasShown").orElseThrow() }
private val NSFontCollectionWasShown_VH: VarHandle by lazy { NSFontCollectionWasShown_LAYOUT.varHandle() }

var NSFontCollectionWasShown: MemorySegment
    get() = NSFontCollectionWasShown_VH.get(NSFontCollectionWasShown_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionWasShown_VH.set(NSFontCollectionWasShown_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionWasHidden typedef const NSFontCollectionActionTypeKey = (Void)*
 */
private val NSFontCollectionWasHidden_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionWasHidden_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionWasHidden").orElseThrow() }
private val NSFontCollectionWasHidden_VH: VarHandle by lazy { NSFontCollectionWasHidden_LAYOUT.varHandle() }

var NSFontCollectionWasHidden: MemorySegment
    get() = NSFontCollectionWasHidden_VH.get(NSFontCollectionWasHidden_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionWasHidden_VH.set(NSFontCollectionWasHidden_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionWasRenamed typedef const NSFontCollectionActionTypeKey = (Void)*
 */
private val NSFontCollectionWasRenamed_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionWasRenamed_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionWasRenamed").orElseThrow() }
private val NSFontCollectionWasRenamed_VH: VarHandle by lazy { NSFontCollectionWasRenamed_LAYOUT.varHandle() }

var NSFontCollectionWasRenamed: MemorySegment
    get() = NSFontCollectionWasRenamed_VH.get(NSFontCollectionWasRenamed_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionWasRenamed_VH.set(NSFontCollectionWasRenamed_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionAllFonts typedef const NSFontCollectionName = (Void)*
 */
private val NSFontCollectionAllFonts_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionAllFonts_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionAllFonts").orElseThrow() }
private val NSFontCollectionAllFonts_VH: VarHandle by lazy { NSFontCollectionAllFonts_LAYOUT.varHandle() }

var NSFontCollectionAllFonts: MemorySegment
    get() = NSFontCollectionAllFonts_VH.get(NSFontCollectionAllFonts_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionAllFonts_VH.set(NSFontCollectionAllFonts_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionUser typedef const NSFontCollectionName = (Void)*
 */
private val NSFontCollectionUser_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionUser_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionUser").orElseThrow() }
private val NSFontCollectionUser_VH: VarHandle by lazy { NSFontCollectionUser_LAYOUT.varHandle() }

var NSFontCollectionUser: MemorySegment
    get() = NSFontCollectionUser_VH.get(NSFontCollectionUser_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionUser_VH.set(NSFontCollectionUser_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionFavorites typedef const NSFontCollectionName = (Void)*
 */
private val NSFontCollectionFavorites_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionFavorites_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionFavorites").orElseThrow() }
private val NSFontCollectionFavorites_VH: VarHandle by lazy { NSFontCollectionFavorites_LAYOUT.varHandle() }

var NSFontCollectionFavorites: MemorySegment
    get() = NSFontCollectionFavorites_VH.get(NSFontCollectionFavorites_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionFavorites_VH.set(NSFontCollectionFavorites_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontCollectionRecentlyUsed typedef const NSFontCollectionName = (Void)*
 */
private val NSFontCollectionRecentlyUsed_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontCollectionRecentlyUsed_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontCollectionRecentlyUsed").orElseThrow() }
private val NSFontCollectionRecentlyUsed_VH: VarHandle by lazy { NSFontCollectionRecentlyUsed_LAYOUT.varHandle() }

var NSFontCollectionRecentlyUsed: MemorySegment
    get() = NSFontCollectionRecentlyUsed_VH.get(NSFontCollectionRecentlyUsed_SEGMENT) as MemorySegment
    set(value) = NSFontCollectionRecentlyUsed_VH.set(NSFontCollectionRecentlyUsed_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidBecomeKeyNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidBecomeKeyNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidBecomeKeyNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidBecomeKeyNotification").orElseThrow() }
private val NSWindowDidBecomeKeyNotification_VH: VarHandle by lazy { NSWindowDidBecomeKeyNotification_LAYOUT.varHandle() }

var NSWindowDidBecomeKeyNotification: MemorySegment
    get() = NSWindowDidBecomeKeyNotification_VH.get(NSWindowDidBecomeKeyNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidBecomeKeyNotification_VH.set(NSWindowDidBecomeKeyNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidBecomeMainNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidBecomeMainNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidBecomeMainNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidBecomeMainNotification").orElseThrow() }
private val NSWindowDidBecomeMainNotification_VH: VarHandle by lazy { NSWindowDidBecomeMainNotification_LAYOUT.varHandle() }

var NSWindowDidBecomeMainNotification: MemorySegment
    get() = NSWindowDidBecomeMainNotification_VH.get(NSWindowDidBecomeMainNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidBecomeMainNotification_VH.set(NSWindowDidBecomeMainNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidChangeScreenNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidChangeScreenNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidChangeScreenNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidChangeScreenNotification").orElseThrow() }
private val NSWindowDidChangeScreenNotification_VH: VarHandle by lazy { NSWindowDidChangeScreenNotification_LAYOUT.varHandle() }

var NSWindowDidChangeScreenNotification: MemorySegment
    get() = NSWindowDidChangeScreenNotification_VH.get(NSWindowDidChangeScreenNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidChangeScreenNotification_VH.set(NSWindowDidChangeScreenNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidDeminiaturizeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidDeminiaturizeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidDeminiaturizeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidDeminiaturizeNotification").orElseThrow() }
private val NSWindowDidDeminiaturizeNotification_VH: VarHandle by lazy { NSWindowDidDeminiaturizeNotification_LAYOUT.varHandle() }

var NSWindowDidDeminiaturizeNotification: MemorySegment
    get() = NSWindowDidDeminiaturizeNotification_VH.get(NSWindowDidDeminiaturizeNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidDeminiaturizeNotification_VH.set(NSWindowDidDeminiaturizeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidExposeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidExposeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidExposeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidExposeNotification").orElseThrow() }
private val NSWindowDidExposeNotification_VH: VarHandle by lazy { NSWindowDidExposeNotification_LAYOUT.varHandle() }

var NSWindowDidExposeNotification: MemorySegment
    get() = NSWindowDidExposeNotification_VH.get(NSWindowDidExposeNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidExposeNotification_VH.set(NSWindowDidExposeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidMiniaturizeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidMiniaturizeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidMiniaturizeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidMiniaturizeNotification").orElseThrow() }
private val NSWindowDidMiniaturizeNotification_VH: VarHandle by lazy { NSWindowDidMiniaturizeNotification_LAYOUT.varHandle() }

var NSWindowDidMiniaturizeNotification: MemorySegment
    get() = NSWindowDidMiniaturizeNotification_VH.get(NSWindowDidMiniaturizeNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidMiniaturizeNotification_VH.set(NSWindowDidMiniaturizeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidMoveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidMoveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidMoveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidMoveNotification").orElseThrow() }
private val NSWindowDidMoveNotification_VH: VarHandle by lazy { NSWindowDidMoveNotification_LAYOUT.varHandle() }

var NSWindowDidMoveNotification: MemorySegment
    get() = NSWindowDidMoveNotification_VH.get(NSWindowDidMoveNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidMoveNotification_VH.set(NSWindowDidMoveNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidResignKeyNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidResignKeyNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidResignKeyNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidResignKeyNotification").orElseThrow() }
private val NSWindowDidResignKeyNotification_VH: VarHandle by lazy { NSWindowDidResignKeyNotification_LAYOUT.varHandle() }

var NSWindowDidResignKeyNotification: MemorySegment
    get() = NSWindowDidResignKeyNotification_VH.get(NSWindowDidResignKeyNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidResignKeyNotification_VH.set(NSWindowDidResignKeyNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidResignMainNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidResignMainNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidResignMainNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidResignMainNotification").orElseThrow() }
private val NSWindowDidResignMainNotification_VH: VarHandle by lazy { NSWindowDidResignMainNotification_LAYOUT.varHandle() }

var NSWindowDidResignMainNotification: MemorySegment
    get() = NSWindowDidResignMainNotification_VH.get(NSWindowDidResignMainNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidResignMainNotification_VH.set(NSWindowDidResignMainNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidResizeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidResizeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidResizeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidResizeNotification").orElseThrow() }
private val NSWindowDidResizeNotification_VH: VarHandle by lazy { NSWindowDidResizeNotification_LAYOUT.varHandle() }

var NSWindowDidResizeNotification: MemorySegment
    get() = NSWindowDidResizeNotification_VH.get(NSWindowDidResizeNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidResizeNotification_VH.set(NSWindowDidResizeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidUpdateNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidUpdateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidUpdateNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidUpdateNotification").orElseThrow() }
private val NSWindowDidUpdateNotification_VH: VarHandle by lazy { NSWindowDidUpdateNotification_LAYOUT.varHandle() }

var NSWindowDidUpdateNotification: MemorySegment
    get() = NSWindowDidUpdateNotification_VH.get(NSWindowDidUpdateNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidUpdateNotification_VH.set(NSWindowDidUpdateNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillCloseNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowWillCloseNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillCloseNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillCloseNotification").orElseThrow() }
private val NSWindowWillCloseNotification_VH: VarHandle by lazy { NSWindowWillCloseNotification_LAYOUT.varHandle() }

var NSWindowWillCloseNotification: MemorySegment
    get() = NSWindowWillCloseNotification_VH.get(NSWindowWillCloseNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillCloseNotification_VH.set(NSWindowWillCloseNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillMiniaturizeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowWillMiniaturizeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillMiniaturizeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillMiniaturizeNotification").orElseThrow() }
private val NSWindowWillMiniaturizeNotification_VH: VarHandle by lazy { NSWindowWillMiniaturizeNotification_LAYOUT.varHandle() }

var NSWindowWillMiniaturizeNotification: MemorySegment
    get() = NSWindowWillMiniaturizeNotification_VH.get(NSWindowWillMiniaturizeNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillMiniaturizeNotification_VH.set(NSWindowWillMiniaturizeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillMoveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowWillMoveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillMoveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillMoveNotification").orElseThrow() }
private val NSWindowWillMoveNotification_VH: VarHandle by lazy { NSWindowWillMoveNotification_LAYOUT.varHandle() }

var NSWindowWillMoveNotification: MemorySegment
    get() = NSWindowWillMoveNotification_VH.get(NSWindowWillMoveNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillMoveNotification_VH.set(NSWindowWillMoveNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillBeginSheetNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowWillBeginSheetNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillBeginSheetNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillBeginSheetNotification").orElseThrow() }
private val NSWindowWillBeginSheetNotification_VH: VarHandle by lazy { NSWindowWillBeginSheetNotification_LAYOUT.varHandle() }

var NSWindowWillBeginSheetNotification: MemorySegment
    get() = NSWindowWillBeginSheetNotification_VH.get(NSWindowWillBeginSheetNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillBeginSheetNotification_VH.set(NSWindowWillBeginSheetNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidEndSheetNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidEndSheetNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidEndSheetNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidEndSheetNotification").orElseThrow() }
private val NSWindowDidEndSheetNotification_VH: VarHandle by lazy { NSWindowDidEndSheetNotification_LAYOUT.varHandle() }

var NSWindowDidEndSheetNotification: MemorySegment
    get() = NSWindowDidEndSheetNotification_VH.get(NSWindowDidEndSheetNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidEndSheetNotification_VH.set(NSWindowDidEndSheetNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidChangeBackingPropertiesNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowDidChangeBackingPropertiesNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidChangeBackingPropertiesNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidChangeBackingPropertiesNotification").orElseThrow() }
private val NSWindowDidChangeBackingPropertiesNotification_VH: VarHandle by lazy { NSWindowDidChangeBackingPropertiesNotification_LAYOUT.varHandle() }

var NSWindowDidChangeBackingPropertiesNotification: MemorySegment
    get() = NSWindowDidChangeBackingPropertiesNotification_VH.get(NSWindowDidChangeBackingPropertiesNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidChangeBackingPropertiesNotification_VH.set(NSWindowDidChangeBackingPropertiesNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSBackingPropertyOldScaleFactorKey (Void)*
 */
private val NSBackingPropertyOldScaleFactorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBackingPropertyOldScaleFactorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBackingPropertyOldScaleFactorKey").orElseThrow() }
private val NSBackingPropertyOldScaleFactorKey_VH: VarHandle by lazy { NSBackingPropertyOldScaleFactorKey_LAYOUT.varHandle() }

var NSBackingPropertyOldScaleFactorKey: MemorySegment
    get() = NSBackingPropertyOldScaleFactorKey_VH.get(NSBackingPropertyOldScaleFactorKey_SEGMENT) as MemorySegment
    set(value) = NSBackingPropertyOldScaleFactorKey_VH.set(NSBackingPropertyOldScaleFactorKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSBackingPropertyOldColorSpaceKey (Void)*
 */
private val NSBackingPropertyOldColorSpaceKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBackingPropertyOldColorSpaceKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBackingPropertyOldColorSpaceKey").orElseThrow() }
private val NSBackingPropertyOldColorSpaceKey_VH: VarHandle by lazy { NSBackingPropertyOldColorSpaceKey_LAYOUT.varHandle() }

var NSBackingPropertyOldColorSpaceKey: MemorySegment
    get() = NSBackingPropertyOldColorSpaceKey_VH.get(NSBackingPropertyOldColorSpaceKey_SEGMENT) as MemorySegment
    set(value) = NSBackingPropertyOldColorSpaceKey_VH.set(NSBackingPropertyOldColorSpaceKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidChangeScreenProfileNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWindowDidChangeScreenProfileNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidChangeScreenProfileNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidChangeScreenProfileNotification").orElseThrow() }
private val NSWindowDidChangeScreenProfileNotification_VH: VarHandle by lazy { NSWindowDidChangeScreenProfileNotification_LAYOUT.varHandle() }

var NSWindowDidChangeScreenProfileNotification: MemorySegment
    get() = NSWindowDidChangeScreenProfileNotification_VH.get(NSWindowDidChangeScreenProfileNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidChangeScreenProfileNotification_VH.set(NSWindowDidChangeScreenProfileNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillStartLiveResizeNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowWillStartLiveResizeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillStartLiveResizeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillStartLiveResizeNotification").orElseThrow() }
private val NSWindowWillStartLiveResizeNotification_VH: VarHandle by lazy { NSWindowWillStartLiveResizeNotification_LAYOUT.varHandle() }

var NSWindowWillStartLiveResizeNotification: MemorySegment
    get() = NSWindowWillStartLiveResizeNotification_VH.get(NSWindowWillStartLiveResizeNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillStartLiveResizeNotification_VH.set(NSWindowWillStartLiveResizeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidEndLiveResizeNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowDidEndLiveResizeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidEndLiveResizeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidEndLiveResizeNotification").orElseThrow() }
private val NSWindowDidEndLiveResizeNotification_VH: VarHandle by lazy { NSWindowDidEndLiveResizeNotification_LAYOUT.varHandle() }

var NSWindowDidEndLiveResizeNotification: MemorySegment
    get() = NSWindowDidEndLiveResizeNotification_VH.get(NSWindowDidEndLiveResizeNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidEndLiveResizeNotification_VH.set(NSWindowDidEndLiveResizeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillEnterFullScreenNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowWillEnterFullScreenNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillEnterFullScreenNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillEnterFullScreenNotification").orElseThrow() }
private val NSWindowWillEnterFullScreenNotification_VH: VarHandle by lazy { NSWindowWillEnterFullScreenNotification_LAYOUT.varHandle() }

var NSWindowWillEnterFullScreenNotification: MemorySegment
    get() = NSWindowWillEnterFullScreenNotification_VH.get(NSWindowWillEnterFullScreenNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillEnterFullScreenNotification_VH.set(NSWindowWillEnterFullScreenNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidEnterFullScreenNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowDidEnterFullScreenNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidEnterFullScreenNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidEnterFullScreenNotification").orElseThrow() }
private val NSWindowDidEnterFullScreenNotification_VH: VarHandle by lazy { NSWindowDidEnterFullScreenNotification_LAYOUT.varHandle() }

var NSWindowDidEnterFullScreenNotification: MemorySegment
    get() = NSWindowDidEnterFullScreenNotification_VH.get(NSWindowDidEnterFullScreenNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidEnterFullScreenNotification_VH.set(NSWindowDidEnterFullScreenNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillExitFullScreenNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowWillExitFullScreenNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillExitFullScreenNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillExitFullScreenNotification").orElseThrow() }
private val NSWindowWillExitFullScreenNotification_VH: VarHandle by lazy { NSWindowWillExitFullScreenNotification_LAYOUT.varHandle() }

var NSWindowWillExitFullScreenNotification: MemorySegment
    get() = NSWindowWillExitFullScreenNotification_VH.get(NSWindowWillExitFullScreenNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillExitFullScreenNotification_VH.set(NSWindowWillExitFullScreenNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidExitFullScreenNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowDidExitFullScreenNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidExitFullScreenNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidExitFullScreenNotification").orElseThrow() }
private val NSWindowDidExitFullScreenNotification_VH: VarHandle by lazy { NSWindowDidExitFullScreenNotification_LAYOUT.varHandle() }

var NSWindowDidExitFullScreenNotification: MemorySegment
    get() = NSWindowDidExitFullScreenNotification_VH.get(NSWindowDidExitFullScreenNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidExitFullScreenNotification_VH.set(NSWindowDidExitFullScreenNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillEnterVersionBrowserNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowWillEnterVersionBrowserNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillEnterVersionBrowserNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillEnterVersionBrowserNotification").orElseThrow() }
private val NSWindowWillEnterVersionBrowserNotification_VH: VarHandle by lazy { NSWindowWillEnterVersionBrowserNotification_LAYOUT.varHandle() }

var NSWindowWillEnterVersionBrowserNotification: MemorySegment
    get() = NSWindowWillEnterVersionBrowserNotification_VH.get(NSWindowWillEnterVersionBrowserNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillEnterVersionBrowserNotification_VH.set(NSWindowWillEnterVersionBrowserNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidEnterVersionBrowserNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowDidEnterVersionBrowserNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidEnterVersionBrowserNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidEnterVersionBrowserNotification").orElseThrow() }
private val NSWindowDidEnterVersionBrowserNotification_VH: VarHandle by lazy { NSWindowDidEnterVersionBrowserNotification_LAYOUT.varHandle() }

var NSWindowDidEnterVersionBrowserNotification: MemorySegment
    get() = NSWindowDidEnterVersionBrowserNotification_VH.get(NSWindowDidEnterVersionBrowserNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidEnterVersionBrowserNotification_VH.set(NSWindowDidEnterVersionBrowserNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowWillExitVersionBrowserNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowWillExitVersionBrowserNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowWillExitVersionBrowserNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowWillExitVersionBrowserNotification").orElseThrow() }
private val NSWindowWillExitVersionBrowserNotification_VH: VarHandle by lazy { NSWindowWillExitVersionBrowserNotification_LAYOUT.varHandle() }

var NSWindowWillExitVersionBrowserNotification: MemorySegment
    get() = NSWindowWillExitVersionBrowserNotification_VH.get(NSWindowWillExitVersionBrowserNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowWillExitVersionBrowserNotification_VH.set(NSWindowWillExitVersionBrowserNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidExitVersionBrowserNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowDidExitVersionBrowserNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidExitVersionBrowserNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidExitVersionBrowserNotification").orElseThrow() }
private val NSWindowDidExitVersionBrowserNotification_VH: VarHandle by lazy { NSWindowDidExitVersionBrowserNotification_LAYOUT.varHandle() }

var NSWindowDidExitVersionBrowserNotification: MemorySegment
    get() = NSWindowDidExitVersionBrowserNotification_VH.get(NSWindowDidExitVersionBrowserNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidExitVersionBrowserNotification_VH.set(NSWindowDidExitVersionBrowserNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowDidChangeOcclusionStateNotification typedef const NSNotificationName = (Void)*
 */
private val NSWindowDidChangeOcclusionStateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowDidChangeOcclusionStateNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowDidChangeOcclusionStateNotification").orElseThrow() }
private val NSWindowDidChangeOcclusionStateNotification_VH: VarHandle by lazy { NSWindowDidChangeOcclusionStateNotification_LAYOUT.varHandle() }

var NSWindowDidChangeOcclusionStateNotification: MemorySegment
    get() = NSWindowDidChangeOcclusionStateNotification_VH.get(NSWindowDidChangeOcclusionStateNotification_SEGMENT) as MemorySegment
    set(value) = NSWindowDidChangeOcclusionStateNotification_VH.set(NSWindowDidChangeOcclusionStateNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSRunAlertPanelRelativeToWindow typedef NSInteger = Long((Void)*,(Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSRunAlertPanelRelativeToWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSRunAlertPanelRelativeToWindow_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSRunAlertPanelRelativeToWindow").orElseThrow()
private val NSRunAlertPanelRelativeToWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSRunAlertPanelRelativeToWindow_ADDR, NSRunAlertPanelRelativeToWindow_DESC)

fun NSRunAlertPanelRelativeToWindow(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): Long {
    try {
        return NSRunAlertPanelRelativeToWindow_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRunInformationalAlertPanelRelativeToWindow typedef NSInteger = Long((Void)*,(Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSRunInformationalAlertPanelRelativeToWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSRunInformationalAlertPanelRelativeToWindow_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSRunInformationalAlertPanelRelativeToWindow").orElseThrow()
private val NSRunInformationalAlertPanelRelativeToWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSRunInformationalAlertPanelRelativeToWindow_ADDR, NSRunInformationalAlertPanelRelativeToWindow_DESC)

fun NSRunInformationalAlertPanelRelativeToWindow(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): Long {
    try {
        return NSRunInformationalAlertPanelRelativeToWindow_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRunCriticalAlertPanelRelativeToWindow typedef NSInteger = Long((Void)*,(Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSRunCriticalAlertPanelRelativeToWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSRunCriticalAlertPanelRelativeToWindow_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSRunCriticalAlertPanelRelativeToWindow").orElseThrow()
private val NSRunCriticalAlertPanelRelativeToWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSRunCriticalAlertPanelRelativeToWindow_ADDR, NSRunCriticalAlertPanelRelativeToWindow_DESC)

fun NSRunCriticalAlertPanelRelativeToWindow(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): Long {
    try {
        return NSRunCriticalAlertPanelRelativeToWindow_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRunAlertPanel typedef NSInteger = Long((Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSRunAlertPanel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSRunAlertPanel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSRunAlertPanel").orElseThrow()
private val NSRunAlertPanel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSRunAlertPanel_ADDR, NSRunAlertPanel_DESC)

fun NSRunAlertPanel(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Long {
    try {
        return NSRunAlertPanel_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRunInformationalAlertPanel typedef NSInteger = Long((Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSRunInformationalAlertPanel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSRunInformationalAlertPanel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSRunInformationalAlertPanel").orElseThrow()
private val NSRunInformationalAlertPanel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSRunInformationalAlertPanel_ADDR, NSRunInformationalAlertPanel_DESC)

fun NSRunInformationalAlertPanel(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Long {
    try {
        return NSRunInformationalAlertPanel_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRunCriticalAlertPanel typedef NSInteger = Long((Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSRunCriticalAlertPanel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSRunCriticalAlertPanel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSRunCriticalAlertPanel").orElseThrow()
private val NSRunCriticalAlertPanel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSRunCriticalAlertPanel_ADDR, NSRunCriticalAlertPanel_DESC)

fun NSRunCriticalAlertPanel(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Long {
    try {
        return NSRunCriticalAlertPanel_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSBeginAlertSheet Void((Void)*,(Void)*,(Void)*,(Void)*,(Void)*,typedef __strong id = (Void)*,typedef SEL = ((Void)*)*,typedef SEL = ((Void)*)*,(Void)*,(Void)*)
 */
private val NSBeginAlertSheet_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSBeginAlertSheet_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSBeginAlertSheet").orElseThrow()
private val NSBeginAlertSheet_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSBeginAlertSheet_ADDR, NSBeginAlertSheet_DESC)

fun NSBeginAlertSheet(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment): Unit {
    try {
        NSBeginAlertSheet_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSBeginInformationalAlertSheet Void((Void)*,(Void)*,(Void)*,(Void)*,(Void)*,typedef __strong id = (Void)*,typedef SEL = ((Void)*)*,typedef SEL = ((Void)*)*,(Void)*,(Void)*)
 */
private val NSBeginInformationalAlertSheet_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSBeginInformationalAlertSheet_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSBeginInformationalAlertSheet").orElseThrow()
private val NSBeginInformationalAlertSheet_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSBeginInformationalAlertSheet_ADDR, NSBeginInformationalAlertSheet_DESC)

fun NSBeginInformationalAlertSheet(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment): Unit {
    try {
        NSBeginInformationalAlertSheet_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSBeginCriticalAlertSheet Void((Void)*,(Void)*,(Void)*,(Void)*,(Void)*,typedef __strong id = (Void)*,typedef SEL = ((Void)*)*,typedef SEL = ((Void)*)*,(Void)*,(Void)*)
 */
private val NSBeginCriticalAlertSheet_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSBeginCriticalAlertSheet_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSBeginCriticalAlertSheet").orElseThrow()
private val NSBeginCriticalAlertSheet_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSBeginCriticalAlertSheet_ADDR, NSBeginCriticalAlertSheet_DESC)

fun NSBeginCriticalAlertSheet(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment): Unit {
    try {
        NSBeginCriticalAlertSheet_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSGetAlertPanel typedef id = (Void)*((Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSGetAlertPanel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSGetAlertPanel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSGetAlertPanel").orElseThrow()
private val NSGetAlertPanel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSGetAlertPanel_ADDR, NSGetAlertPanel_DESC)

fun NSGetAlertPanel(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return NSGetAlertPanel_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSGetInformationalAlertPanel typedef id = (Void)*((Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSGetInformationalAlertPanel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSGetInformationalAlertPanel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSGetInformationalAlertPanel").orElseThrow()
private val NSGetInformationalAlertPanel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSGetInformationalAlertPanel_ADDR, NSGetInformationalAlertPanel_DESC)

fun NSGetInformationalAlertPanel(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return NSGetInformationalAlertPanel_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSGetCriticalAlertPanel typedef id = (Void)*((Void)*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val NSGetCriticalAlertPanel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSGetCriticalAlertPanel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSGetCriticalAlertPanel").orElseThrow()
private val NSGetCriticalAlertPanel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSGetCriticalAlertPanel_ADDR, NSGetCriticalAlertPanel_DESC)

fun NSGetCriticalAlertPanel(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return NSGetCriticalAlertPanel_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSReleaseAlertPanel Void(typedef __strong id = (Void)*)
 */
private val NSReleaseAlertPanel_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSReleaseAlertPanel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSReleaseAlertPanel").orElseThrow()
private val NSReleaseAlertPanel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSReleaseAlertPanel_ADDR, NSReleaseAlertPanel_DESC)

fun NSReleaseAlertPanel(arg0: MemorySegment): Unit {
    try {
        NSReleaseAlertPanel_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSImageRepRegistryDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSImageRepRegistryDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageRepRegistryDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageRepRegistryDidChangeNotification").orElseThrow() }
private val NSImageRepRegistryDidChangeNotification_VH: VarHandle by lazy { NSImageRepRegistryDidChangeNotification_LAYOUT.varHandle() }

var NSImageRepRegistryDidChangeNotification: MemorySegment
    get() = NSImageRepRegistryDidChangeNotification_VH.get(NSImageRepRegistryDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSImageRepRegistryDidChangeNotification_VH.set(NSImageRepRegistryDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageCompressionMethod typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageCompressionMethod_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageCompressionMethod_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageCompressionMethod").orElseThrow() }
private val NSImageCompressionMethod_VH: VarHandle by lazy { NSImageCompressionMethod_LAYOUT.varHandle() }

var NSImageCompressionMethod: MemorySegment
    get() = NSImageCompressionMethod_VH.get(NSImageCompressionMethod_SEGMENT) as MemorySegment
    set(value) = NSImageCompressionMethod_VH.set(NSImageCompressionMethod_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageCompressionFactor typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageCompressionFactor_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageCompressionFactor_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageCompressionFactor").orElseThrow() }
private val NSImageCompressionFactor_VH: VarHandle by lazy { NSImageCompressionFactor_LAYOUT.varHandle() }

var NSImageCompressionFactor: MemorySegment
    get() = NSImageCompressionFactor_VH.get(NSImageCompressionFactor_SEGMENT) as MemorySegment
    set(value) = NSImageCompressionFactor_VH.set(NSImageCompressionFactor_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageDitherTransparency typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageDitherTransparency_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageDitherTransparency_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageDitherTransparency").orElseThrow() }
private val NSImageDitherTransparency_VH: VarHandle by lazy { NSImageDitherTransparency_LAYOUT.varHandle() }

var NSImageDitherTransparency: MemorySegment
    get() = NSImageDitherTransparency_VH.get(NSImageDitherTransparency_SEGMENT) as MemorySegment
    set(value) = NSImageDitherTransparency_VH.set(NSImageDitherTransparency_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageRGBColorTable typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageRGBColorTable_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageRGBColorTable_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageRGBColorTable").orElseThrow() }
private val NSImageRGBColorTable_VH: VarHandle by lazy { NSImageRGBColorTable_LAYOUT.varHandle() }

var NSImageRGBColorTable: MemorySegment
    get() = NSImageRGBColorTable_VH.get(NSImageRGBColorTable_SEGMENT) as MemorySegment
    set(value) = NSImageRGBColorTable_VH.set(NSImageRGBColorTable_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageInterlaced typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageInterlaced_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageInterlaced_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageInterlaced").orElseThrow() }
private val NSImageInterlaced_VH: VarHandle by lazy { NSImageInterlaced_LAYOUT.varHandle() }

var NSImageInterlaced: MemorySegment
    get() = NSImageInterlaced_VH.get(NSImageInterlaced_SEGMENT) as MemorySegment
    set(value) = NSImageInterlaced_VH.set(NSImageInterlaced_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageColorSyncProfileData typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageColorSyncProfileData_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageColorSyncProfileData_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageColorSyncProfileData").orElseThrow() }
private val NSImageColorSyncProfileData_VH: VarHandle by lazy { NSImageColorSyncProfileData_LAYOUT.varHandle() }

var NSImageColorSyncProfileData: MemorySegment
    get() = NSImageColorSyncProfileData_VH.get(NSImageColorSyncProfileData_SEGMENT) as MemorySegment
    set(value) = NSImageColorSyncProfileData_VH.set(NSImageColorSyncProfileData_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageFrameCount typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageFrameCount_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageFrameCount_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageFrameCount").orElseThrow() }
private val NSImageFrameCount_VH: VarHandle by lazy { NSImageFrameCount_LAYOUT.varHandle() }

var NSImageFrameCount: MemorySegment
    get() = NSImageFrameCount_VH.get(NSImageFrameCount_SEGMENT) as MemorySegment
    set(value) = NSImageFrameCount_VH.set(NSImageFrameCount_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageCurrentFrame typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageCurrentFrame_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageCurrentFrame_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageCurrentFrame").orElseThrow() }
private val NSImageCurrentFrame_VH: VarHandle by lazy { NSImageCurrentFrame_LAYOUT.varHandle() }

var NSImageCurrentFrame: MemorySegment
    get() = NSImageCurrentFrame_VH.get(NSImageCurrentFrame_SEGMENT) as MemorySegment
    set(value) = NSImageCurrentFrame_VH.set(NSImageCurrentFrame_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageCurrentFrameDuration typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageCurrentFrameDuration_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageCurrentFrameDuration_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageCurrentFrameDuration").orElseThrow() }
private val NSImageCurrentFrameDuration_VH: VarHandle by lazy { NSImageCurrentFrameDuration_LAYOUT.varHandle() }

var NSImageCurrentFrameDuration: MemorySegment
    get() = NSImageCurrentFrameDuration_VH.get(NSImageCurrentFrameDuration_SEGMENT) as MemorySegment
    set(value) = NSImageCurrentFrameDuration_VH.set(NSImageCurrentFrameDuration_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageLoopCount typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageLoopCount_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageLoopCount_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageLoopCount").orElseThrow() }
private val NSImageLoopCount_VH: VarHandle by lazy { NSImageLoopCount_LAYOUT.varHandle() }

var NSImageLoopCount: MemorySegment
    get() = NSImageLoopCount_VH.get(NSImageLoopCount_SEGMENT) as MemorySegment
    set(value) = NSImageLoopCount_VH.set(NSImageLoopCount_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageGamma typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageGamma_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageGamma_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageGamma").orElseThrow() }
private val NSImageGamma_VH: VarHandle by lazy { NSImageGamma_LAYOUT.varHandle() }

var NSImageGamma: MemorySegment
    get() = NSImageGamma_VH.get(NSImageGamma_SEGMENT) as MemorySegment
    set(value) = NSImageGamma_VH.set(NSImageGamma_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageProgressive typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageProgressive_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageProgressive_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageProgressive").orElseThrow() }
private val NSImageProgressive_VH: VarHandle by lazy { NSImageProgressive_LAYOUT.varHandle() }

var NSImageProgressive: MemorySegment
    get() = NSImageProgressive_VH.get(NSImageProgressive_SEGMENT) as MemorySegment
    set(value) = NSImageProgressive_VH.set(NSImageProgressive_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageEXIFData typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageEXIFData_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageEXIFData_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageEXIFData").orElseThrow() }
private val NSImageEXIFData_VH: VarHandle by lazy { NSImageEXIFData_LAYOUT.varHandle() }

var NSImageEXIFData: MemorySegment
    get() = NSImageEXIFData_VH.get(NSImageEXIFData_SEGMENT) as MemorySegment
    set(value) = NSImageEXIFData_VH.set(NSImageEXIFData_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageIPTCData typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageIPTCData_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageIPTCData_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageIPTCData").orElseThrow() }
private val NSImageIPTCData_VH: VarHandle by lazy { NSImageIPTCData_LAYOUT.varHandle() }

var NSImageIPTCData: MemorySegment
    get() = NSImageIPTCData_VH.get(NSImageIPTCData_SEGMENT) as MemorySegment
    set(value) = NSImageIPTCData_VH.set(NSImageIPTCData_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageFallbackBackgroundColor typedef NSBitmapImageRepPropertyKey = typedef NSString = (Void)*
 */
private val NSImageFallbackBackgroundColor_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageFallbackBackgroundColor_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageFallbackBackgroundColor").orElseThrow() }
private val NSImageFallbackBackgroundColor_VH: VarHandle by lazy { NSImageFallbackBackgroundColor_LAYOUT.varHandle() }

var NSImageFallbackBackgroundColor: MemorySegment
    get() = NSImageFallbackBackgroundColor_VH.get(NSImageFallbackBackgroundColor_SEGMENT) as MemorySegment
    set(value) = NSImageFallbackBackgroundColor_VH.set(NSImageFallbackBackgroundColor_SEGMENT, value)

/**
 * {@snippet lang=c : NSBrowserColumnConfigurationDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSBrowserColumnConfigurationDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBrowserColumnConfigurationDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBrowserColumnConfigurationDidChangeNotification").orElseThrow() }
private val NSBrowserColumnConfigurationDidChangeNotification_VH: VarHandle by lazy { NSBrowserColumnConfigurationDidChangeNotification_LAYOUT.varHandle() }

var NSBrowserColumnConfigurationDidChangeNotification: MemorySegment
    get() = NSBrowserColumnConfigurationDidChangeNotification_VH.get(NSBrowserColumnConfigurationDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSBrowserColumnConfigurationDidChangeNotification_VH.set(NSBrowserColumnConfigurationDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatARGB8 typedef const CIFormat = Int
 */
private val kCIFormatARGB8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatARGB8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatARGB8").orElseThrow() }
private val kCIFormatARGB8_VH: VarHandle by lazy { kCIFormatARGB8_LAYOUT.varHandle() }

var kCIFormatARGB8: Int
    get() = kCIFormatARGB8_VH.get(kCIFormatARGB8_SEGMENT) as Int
    set(value) = kCIFormatARGB8_VH.set(kCIFormatARGB8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatBGRA8 typedef const CIFormat = Int
 */
private val kCIFormatBGRA8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatBGRA8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatBGRA8").orElseThrow() }
private val kCIFormatBGRA8_VH: VarHandle by lazy { kCIFormatBGRA8_LAYOUT.varHandle() }

var kCIFormatBGRA8: Int
    get() = kCIFormatBGRA8_VH.get(kCIFormatBGRA8_SEGMENT) as Int
    set(value) = kCIFormatBGRA8_VH.set(kCIFormatBGRA8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGBA8 typedef const CIFormat = Int
 */
private val kCIFormatRGBA8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGBA8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGBA8").orElseThrow() }
private val kCIFormatRGBA8_VH: VarHandle by lazy { kCIFormatRGBA8_LAYOUT.varHandle() }

var kCIFormatRGBA8: Int
    get() = kCIFormatRGBA8_VH.get(kCIFormatRGBA8_SEGMENT) as Int
    set(value) = kCIFormatRGBA8_VH.set(kCIFormatRGBA8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGBX8 typedef const CIFormat = Int
 */
private val kCIFormatRGBX8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGBX8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGBX8").orElseThrow() }
private val kCIFormatRGBX8_VH: VarHandle by lazy { kCIFormatRGBX8_LAYOUT.varHandle() }

var kCIFormatRGBX8: Int
    get() = kCIFormatRGBX8_VH.get(kCIFormatRGBX8_SEGMENT) as Int
    set(value) = kCIFormatRGBX8_VH.set(kCIFormatRGBX8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatABGR8 typedef const CIFormat = Int
 */
private val kCIFormatABGR8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatABGR8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatABGR8").orElseThrow() }
private val kCIFormatABGR8_VH: VarHandle by lazy { kCIFormatABGR8_LAYOUT.varHandle() }

var kCIFormatABGR8: Int
    get() = kCIFormatABGR8_VH.get(kCIFormatABGR8_SEGMENT) as Int
    set(value) = kCIFormatABGR8_VH.set(kCIFormatABGR8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGBAh typedef const CIFormat = Int
 */
private val kCIFormatRGBAh_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGBAh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGBAh").orElseThrow() }
private val kCIFormatRGBAh_VH: VarHandle by lazy { kCIFormatRGBAh_LAYOUT.varHandle() }

var kCIFormatRGBAh: Int
    get() = kCIFormatRGBAh_VH.get(kCIFormatRGBAh_SEGMENT) as Int
    set(value) = kCIFormatRGBAh_VH.set(kCIFormatRGBAh_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGBA16 typedef const CIFormat = Int
 */
private val kCIFormatRGBA16_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGBA16_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGBA16").orElseThrow() }
private val kCIFormatRGBA16_VH: VarHandle by lazy { kCIFormatRGBA16_LAYOUT.varHandle() }

var kCIFormatRGBA16: Int
    get() = kCIFormatRGBA16_VH.get(kCIFormatRGBA16_SEGMENT) as Int
    set(value) = kCIFormatRGBA16_VH.set(kCIFormatRGBA16_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGBAf typedef const CIFormat = Int
 */
private val kCIFormatRGBAf_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGBAf_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGBAf").orElseThrow() }
private val kCIFormatRGBAf_VH: VarHandle by lazy { kCIFormatRGBAf_LAYOUT.varHandle() }

var kCIFormatRGBAf: Int
    get() = kCIFormatRGBAf_VH.get(kCIFormatRGBAf_SEGMENT) as Int
    set(value) = kCIFormatRGBAf_VH.set(kCIFormatRGBAf_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGBX16 typedef const CIFormat = Int
 */
private val kCIFormatRGBX16_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGBX16_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGBX16").orElseThrow() }
private val kCIFormatRGBX16_VH: VarHandle by lazy { kCIFormatRGBX16_LAYOUT.varHandle() }

var kCIFormatRGBX16: Int
    get() = kCIFormatRGBX16_VH.get(kCIFormatRGBX16_SEGMENT) as Int
    set(value) = kCIFormatRGBX16_VH.set(kCIFormatRGBX16_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGBXh typedef const CIFormat = Int
 */
private val kCIFormatRGBXh_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGBXh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGBXh").orElseThrow() }
private val kCIFormatRGBXh_VH: VarHandle by lazy { kCIFormatRGBXh_LAYOUT.varHandle() }

var kCIFormatRGBXh: Int
    get() = kCIFormatRGBXh_VH.get(kCIFormatRGBXh_SEGMENT) as Int
    set(value) = kCIFormatRGBXh_VH.set(kCIFormatRGBXh_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGBXf typedef const CIFormat = Int
 */
private val kCIFormatRGBXf_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGBXf_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGBXf").orElseThrow() }
private val kCIFormatRGBXf_VH: VarHandle by lazy { kCIFormatRGBXf_LAYOUT.varHandle() }

var kCIFormatRGBXf: Int
    get() = kCIFormatRGBXf_VH.get(kCIFormatRGBXf_SEGMENT) as Int
    set(value) = kCIFormatRGBXf_VH.set(kCIFormatRGBXf_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGB10 typedef const CIFormat = Int
 */
private val kCIFormatRGB10_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGB10_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGB10").orElseThrow() }
private val kCIFormatRGB10_VH: VarHandle by lazy { kCIFormatRGB10_LAYOUT.varHandle() }

var kCIFormatRGB10: Int
    get() = kCIFormatRGB10_VH.get(kCIFormatRGB10_SEGMENT) as Int
    set(value) = kCIFormatRGB10_VH.set(kCIFormatRGB10_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatA8 typedef const CIFormat = Int
 */
private val kCIFormatA8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatA8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatA8").orElseThrow() }
private val kCIFormatA8_VH: VarHandle by lazy { kCIFormatA8_LAYOUT.varHandle() }

var kCIFormatA8: Int
    get() = kCIFormatA8_VH.get(kCIFormatA8_SEGMENT) as Int
    set(value) = kCIFormatA8_VH.set(kCIFormatA8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatA16 typedef const CIFormat = Int
 */
private val kCIFormatA16_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatA16_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatA16").orElseThrow() }
private val kCIFormatA16_VH: VarHandle by lazy { kCIFormatA16_LAYOUT.varHandle() }

var kCIFormatA16: Int
    get() = kCIFormatA16_VH.get(kCIFormatA16_SEGMENT) as Int
    set(value) = kCIFormatA16_VH.set(kCIFormatA16_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatAh typedef const CIFormat = Int
 */
private val kCIFormatAh_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatAh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatAh").orElseThrow() }
private val kCIFormatAh_VH: VarHandle by lazy { kCIFormatAh_LAYOUT.varHandle() }

var kCIFormatAh: Int
    get() = kCIFormatAh_VH.get(kCIFormatAh_SEGMENT) as Int
    set(value) = kCIFormatAh_VH.set(kCIFormatAh_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatAf typedef const CIFormat = Int
 */
private val kCIFormatAf_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatAf_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatAf").orElseThrow() }
private val kCIFormatAf_VH: VarHandle by lazy { kCIFormatAf_LAYOUT.varHandle() }

var kCIFormatAf: Int
    get() = kCIFormatAf_VH.get(kCIFormatAf_SEGMENT) as Int
    set(value) = kCIFormatAf_VH.set(kCIFormatAf_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatR8 typedef const CIFormat = Int
 */
private val kCIFormatR8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatR8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatR8").orElseThrow() }
private val kCIFormatR8_VH: VarHandle by lazy { kCIFormatR8_LAYOUT.varHandle() }

var kCIFormatR8: Int
    get() = kCIFormatR8_VH.get(kCIFormatR8_SEGMENT) as Int
    set(value) = kCIFormatR8_VH.set(kCIFormatR8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatR16 typedef const CIFormat = Int
 */
private val kCIFormatR16_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatR16_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatR16").orElseThrow() }
private val kCIFormatR16_VH: VarHandle by lazy { kCIFormatR16_LAYOUT.varHandle() }

var kCIFormatR16: Int
    get() = kCIFormatR16_VH.get(kCIFormatR16_SEGMENT) as Int
    set(value) = kCIFormatR16_VH.set(kCIFormatR16_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRh typedef const CIFormat = Int
 */
private val kCIFormatRh_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRh").orElseThrow() }
private val kCIFormatRh_VH: VarHandle by lazy { kCIFormatRh_LAYOUT.varHandle() }

var kCIFormatRh: Int
    get() = kCIFormatRh_VH.get(kCIFormatRh_SEGMENT) as Int
    set(value) = kCIFormatRh_VH.set(kCIFormatRh_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRf typedef const CIFormat = Int
 */
private val kCIFormatRf_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRf_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRf").orElseThrow() }
private val kCIFormatRf_VH: VarHandle by lazy { kCIFormatRf_LAYOUT.varHandle() }

var kCIFormatRf: Int
    get() = kCIFormatRf_VH.get(kCIFormatRf_SEGMENT) as Int
    set(value) = kCIFormatRf_VH.set(kCIFormatRf_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRG8 typedef const CIFormat = Int
 */
private val kCIFormatRG8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRG8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRG8").orElseThrow() }
private val kCIFormatRG8_VH: VarHandle by lazy { kCIFormatRG8_LAYOUT.varHandle() }

var kCIFormatRG8: Int
    get() = kCIFormatRG8_VH.get(kCIFormatRG8_SEGMENT) as Int
    set(value) = kCIFormatRG8_VH.set(kCIFormatRG8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRG16 typedef const CIFormat = Int
 */
private val kCIFormatRG16_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRG16_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRG16").orElseThrow() }
private val kCIFormatRG16_VH: VarHandle by lazy { kCIFormatRG16_LAYOUT.varHandle() }

var kCIFormatRG16: Int
    get() = kCIFormatRG16_VH.get(kCIFormatRG16_SEGMENT) as Int
    set(value) = kCIFormatRG16_VH.set(kCIFormatRG16_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGh typedef const CIFormat = Int
 */
private val kCIFormatRGh_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGh").orElseThrow() }
private val kCIFormatRGh_VH: VarHandle by lazy { kCIFormatRGh_LAYOUT.varHandle() }

var kCIFormatRGh: Int
    get() = kCIFormatRGh_VH.get(kCIFormatRGh_SEGMENT) as Int
    set(value) = kCIFormatRGh_VH.set(kCIFormatRGh_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatRGf typedef const CIFormat = Int
 */
private val kCIFormatRGf_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatRGf_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatRGf").orElseThrow() }
private val kCIFormatRGf_VH: VarHandle by lazy { kCIFormatRGf_LAYOUT.varHandle() }

var kCIFormatRGf: Int
    get() = kCIFormatRGf_VH.get(kCIFormatRGf_SEGMENT) as Int
    set(value) = kCIFormatRGf_VH.set(kCIFormatRGf_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatL8 typedef const CIFormat = Int
 */
private val kCIFormatL8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatL8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatL8").orElseThrow() }
private val kCIFormatL8_VH: VarHandle by lazy { kCIFormatL8_LAYOUT.varHandle() }

var kCIFormatL8: Int
    get() = kCIFormatL8_VH.get(kCIFormatL8_SEGMENT) as Int
    set(value) = kCIFormatL8_VH.set(kCIFormatL8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatL16 typedef const CIFormat = Int
 */
private val kCIFormatL16_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatL16_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatL16").orElseThrow() }
private val kCIFormatL16_VH: VarHandle by lazy { kCIFormatL16_LAYOUT.varHandle() }

var kCIFormatL16: Int
    get() = kCIFormatL16_VH.get(kCIFormatL16_SEGMENT) as Int
    set(value) = kCIFormatL16_VH.set(kCIFormatL16_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatLh typedef const CIFormat = Int
 */
private val kCIFormatLh_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatLh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatLh").orElseThrow() }
private val kCIFormatLh_VH: VarHandle by lazy { kCIFormatLh_LAYOUT.varHandle() }

var kCIFormatLh: Int
    get() = kCIFormatLh_VH.get(kCIFormatLh_SEGMENT) as Int
    set(value) = kCIFormatLh_VH.set(kCIFormatLh_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatLf typedef const CIFormat = Int
 */
private val kCIFormatLf_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatLf_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatLf").orElseThrow() }
private val kCIFormatLf_VH: VarHandle by lazy { kCIFormatLf_LAYOUT.varHandle() }

var kCIFormatLf: Int
    get() = kCIFormatLf_VH.get(kCIFormatLf_SEGMENT) as Int
    set(value) = kCIFormatLf_VH.set(kCIFormatLf_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatLA8 typedef const CIFormat = Int
 */
private val kCIFormatLA8_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatLA8_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatLA8").orElseThrow() }
private val kCIFormatLA8_VH: VarHandle by lazy { kCIFormatLA8_LAYOUT.varHandle() }

var kCIFormatLA8: Int
    get() = kCIFormatLA8_VH.get(kCIFormatLA8_SEGMENT) as Int
    set(value) = kCIFormatLA8_VH.set(kCIFormatLA8_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatLA16 typedef const CIFormat = Int
 */
private val kCIFormatLA16_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatLA16_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatLA16").orElseThrow() }
private val kCIFormatLA16_VH: VarHandle by lazy { kCIFormatLA16_LAYOUT.varHandle() }

var kCIFormatLA16: Int
    get() = kCIFormatLA16_VH.get(kCIFormatLA16_SEGMENT) as Int
    set(value) = kCIFormatLA16_VH.set(kCIFormatLA16_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatLAh typedef const CIFormat = Int
 */
private val kCIFormatLAh_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatLAh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatLAh").orElseThrow() }
private val kCIFormatLAh_VH: VarHandle by lazy { kCIFormatLAh_LAYOUT.varHandle() }

var kCIFormatLAh: Int
    get() = kCIFormatLAh_VH.get(kCIFormatLAh_SEGMENT) as Int
    set(value) = kCIFormatLAh_VH.set(kCIFormatLAh_SEGMENT, value)

/**
 * {@snippet lang=c : kCIFormatLAf typedef const CIFormat = Int
 */
private val kCIFormatLAf_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCIFormatLAf_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIFormatLAf").orElseThrow() }
private val kCIFormatLAf_VH: VarHandle by lazy { kCIFormatLAf_LAYOUT.varHandle() }

var kCIFormatLAf: Int
    get() = kCIFormatLAf_VH.get(kCIFormatLAf_SEGMENT) as Int
    set(value) = kCIFormatLAf_VH.set(kCIFormatLAf_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageColorSpace typedef const CIImageOption = (Void)*
 */
private val kCIImageColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageColorSpace_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageColorSpace").orElseThrow() }
private val kCIImageColorSpace_VH: VarHandle by lazy { kCIImageColorSpace_LAYOUT.varHandle() }

var kCIImageColorSpace: MemorySegment
    get() = kCIImageColorSpace_VH.get(kCIImageColorSpace_SEGMENT) as MemorySegment
    set(value) = kCIImageColorSpace_VH.set(kCIImageColorSpace_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageApplyCleanAperture typedef const CIImageOption = (Void)*
 */
private val kCIImageApplyCleanAperture_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageApplyCleanAperture_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageApplyCleanAperture").orElseThrow() }
private val kCIImageApplyCleanAperture_VH: VarHandle by lazy { kCIImageApplyCleanAperture_LAYOUT.varHandle() }

var kCIImageApplyCleanAperture: MemorySegment
    get() = kCIImageApplyCleanAperture_VH.get(kCIImageApplyCleanAperture_SEGMENT) as MemorySegment
    set(value) = kCIImageApplyCleanAperture_VH.set(kCIImageApplyCleanAperture_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageToneMapHDRtoSDR typedef const CIImageOption = (Void)*
 */
private val kCIImageToneMapHDRtoSDR_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageToneMapHDRtoSDR_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageToneMapHDRtoSDR").orElseThrow() }
private val kCIImageToneMapHDRtoSDR_VH: VarHandle by lazy { kCIImageToneMapHDRtoSDR_LAYOUT.varHandle() }

var kCIImageToneMapHDRtoSDR: MemorySegment
    get() = kCIImageToneMapHDRtoSDR_VH.get(kCIImageToneMapHDRtoSDR_SEGMENT) as MemorySegment
    set(value) = kCIImageToneMapHDRtoSDR_VH.set(kCIImageToneMapHDRtoSDR_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageExpandToHDR typedef const CIImageOption = (Void)*
 */
private val kCIImageExpandToHDR_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageExpandToHDR_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageExpandToHDR").orElseThrow() }
private val kCIImageExpandToHDR_VH: VarHandle by lazy { kCIImageExpandToHDR_LAYOUT.varHandle() }

var kCIImageExpandToHDR: MemorySegment
    get() = kCIImageExpandToHDR_VH.get(kCIImageExpandToHDR_SEGMENT) as MemorySegment
    set(value) = kCIImageExpandToHDR_VH.set(kCIImageExpandToHDR_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageContentHeadroom typedef const CIImageOption = (Void)*
 */
private val kCIImageContentHeadroom_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageContentHeadroom_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageContentHeadroom").orElseThrow() }
private val kCIImageContentHeadroom_VH: VarHandle by lazy { kCIImageContentHeadroom_LAYOUT.varHandle() }

var kCIImageContentHeadroom: MemorySegment
    get() = kCIImageContentHeadroom_VH.get(kCIImageContentHeadroom_SEGMENT) as MemorySegment
    set(value) = kCIImageContentHeadroom_VH.set(kCIImageContentHeadroom_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageContentAverageLightLevel typedef const CIImageOption = (Void)*
 */
private val kCIImageContentAverageLightLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageContentAverageLightLevel_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageContentAverageLightLevel").orElseThrow() }
private val kCIImageContentAverageLightLevel_VH: VarHandle by lazy { kCIImageContentAverageLightLevel_LAYOUT.varHandle() }

var kCIImageContentAverageLightLevel: MemorySegment
    get() = kCIImageContentAverageLightLevel_VH.get(kCIImageContentAverageLightLevel_SEGMENT) as MemorySegment
    set(value) = kCIImageContentAverageLightLevel_VH.set(kCIImageContentAverageLightLevel_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageNearestSampling typedef const CIImageOption = (Void)*
 */
private val kCIImageNearestSampling_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageNearestSampling_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageNearestSampling").orElseThrow() }
private val kCIImageNearestSampling_VH: VarHandle by lazy { kCIImageNearestSampling_LAYOUT.varHandle() }

var kCIImageNearestSampling: MemorySegment
    get() = kCIImageNearestSampling_VH.get(kCIImageNearestSampling_SEGMENT) as MemorySegment
    set(value) = kCIImageNearestSampling_VH.set(kCIImageNearestSampling_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageCacheImmediately typedef const CIImageOption = (Void)*
 */
private val kCIImageCacheImmediately_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageCacheImmediately_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageCacheImmediately").orElseThrow() }
private val kCIImageCacheImmediately_VH: VarHandle by lazy { kCIImageCacheImmediately_LAYOUT.varHandle() }

var kCIImageCacheImmediately: MemorySegment
    get() = kCIImageCacheImmediately_VH.get(kCIImageCacheImmediately_SEGMENT) as MemorySegment
    set(value) = kCIImageCacheImmediately_VH.set(kCIImageCacheImmediately_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageProperties typedef const CIImageOption = (Void)*
 */
private val kCIImageProperties_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageProperties_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageProperties").orElseThrow() }
private val kCIImageProperties_VH: VarHandle by lazy { kCIImageProperties_LAYOUT.varHandle() }

var kCIImageProperties: MemorySegment
    get() = kCIImageProperties_VH.get(kCIImageProperties_SEGMENT) as MemorySegment
    set(value) = kCIImageProperties_VH.set(kCIImageProperties_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageApplyOrientationProperty typedef const CIImageOption = (Void)*
 */
private val kCIImageApplyOrientationProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageApplyOrientationProperty_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageApplyOrientationProperty").orElseThrow() }
private val kCIImageApplyOrientationProperty_VH: VarHandle by lazy { kCIImageApplyOrientationProperty_LAYOUT.varHandle() }

var kCIImageApplyOrientationProperty: MemorySegment
    get() = kCIImageApplyOrientationProperty_VH.get(kCIImageApplyOrientationProperty_SEGMENT) as MemorySegment
    set(value) = kCIImageApplyOrientationProperty_VH.set(kCIImageApplyOrientationProperty_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageTextureTarget typedef const CIImageOption = (Void)*
 */
private val kCIImageTextureTarget_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageTextureTarget_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageTextureTarget").orElseThrow() }
private val kCIImageTextureTarget_VH: VarHandle by lazy { kCIImageTextureTarget_LAYOUT.varHandle() }

var kCIImageTextureTarget: MemorySegment
    get() = kCIImageTextureTarget_VH.get(kCIImageTextureTarget_SEGMENT) as MemorySegment
    set(value) = kCIImageTextureTarget_VH.set(kCIImageTextureTarget_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageTextureFormat typedef const CIImageOption = (Void)*
 */
private val kCIImageTextureFormat_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageTextureFormat_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageTextureFormat").orElseThrow() }
private val kCIImageTextureFormat_VH: VarHandle by lazy { kCIImageTextureFormat_LAYOUT.varHandle() }

var kCIImageTextureFormat: MemorySegment
    get() = kCIImageTextureFormat_VH.get(kCIImageTextureFormat_SEGMENT) as MemorySegment
    set(value) = kCIImageTextureFormat_VH.set(kCIImageTextureFormat_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliaryDepth typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliaryDepth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliaryDepth_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliaryDepth").orElseThrow() }
private val kCIImageAuxiliaryDepth_VH: VarHandle by lazy { kCIImageAuxiliaryDepth_LAYOUT.varHandle() }

var kCIImageAuxiliaryDepth: MemorySegment
    get() = kCIImageAuxiliaryDepth_VH.get(kCIImageAuxiliaryDepth_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliaryDepth_VH.set(kCIImageAuxiliaryDepth_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliaryDisparity typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliaryDisparity_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliaryDisparity_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliaryDisparity").orElseThrow() }
private val kCIImageAuxiliaryDisparity_VH: VarHandle by lazy { kCIImageAuxiliaryDisparity_LAYOUT.varHandle() }

var kCIImageAuxiliaryDisparity: MemorySegment
    get() = kCIImageAuxiliaryDisparity_VH.get(kCIImageAuxiliaryDisparity_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliaryDisparity_VH.set(kCIImageAuxiliaryDisparity_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliaryPortraitEffectsMatte typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliaryPortraitEffectsMatte_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliaryPortraitEffectsMatte_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliaryPortraitEffectsMatte").orElseThrow() }
private val kCIImageAuxiliaryPortraitEffectsMatte_VH: VarHandle by lazy { kCIImageAuxiliaryPortraitEffectsMatte_LAYOUT.varHandle() }

var kCIImageAuxiliaryPortraitEffectsMatte: MemorySegment
    get() = kCIImageAuxiliaryPortraitEffectsMatte_VH.get(kCIImageAuxiliaryPortraitEffectsMatte_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliaryPortraitEffectsMatte_VH.set(kCIImageAuxiliaryPortraitEffectsMatte_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliarySemanticSegmentationSkinMatte typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliarySemanticSegmentationSkinMatte_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliarySemanticSegmentationSkinMatte_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliarySemanticSegmentationSkinMatte").orElseThrow() }
private val kCIImageAuxiliarySemanticSegmentationSkinMatte_VH: VarHandle by lazy { kCIImageAuxiliarySemanticSegmentationSkinMatte_LAYOUT.varHandle() }

var kCIImageAuxiliarySemanticSegmentationSkinMatte: MemorySegment
    get() = kCIImageAuxiliarySemanticSegmentationSkinMatte_VH.get(kCIImageAuxiliarySemanticSegmentationSkinMatte_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliarySemanticSegmentationSkinMatte_VH.set(kCIImageAuxiliarySemanticSegmentationSkinMatte_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliarySemanticSegmentationHairMatte typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliarySemanticSegmentationHairMatte_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliarySemanticSegmentationHairMatte_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliarySemanticSegmentationHairMatte").orElseThrow() }
private val kCIImageAuxiliarySemanticSegmentationHairMatte_VH: VarHandle by lazy { kCIImageAuxiliarySemanticSegmentationHairMatte_LAYOUT.varHandle() }

var kCIImageAuxiliarySemanticSegmentationHairMatte: MemorySegment
    get() = kCIImageAuxiliarySemanticSegmentationHairMatte_VH.get(kCIImageAuxiliarySemanticSegmentationHairMatte_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliarySemanticSegmentationHairMatte_VH.set(kCIImageAuxiliarySemanticSegmentationHairMatte_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliarySemanticSegmentationTeethMatte typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliarySemanticSegmentationTeethMatte_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliarySemanticSegmentationTeethMatte_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliarySemanticSegmentationTeethMatte").orElseThrow() }
private val kCIImageAuxiliarySemanticSegmentationTeethMatte_VH: VarHandle by lazy { kCIImageAuxiliarySemanticSegmentationTeethMatte_LAYOUT.varHandle() }

var kCIImageAuxiliarySemanticSegmentationTeethMatte: MemorySegment
    get() = kCIImageAuxiliarySemanticSegmentationTeethMatte_VH.get(kCIImageAuxiliarySemanticSegmentationTeethMatte_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliarySemanticSegmentationTeethMatte_VH.set(kCIImageAuxiliarySemanticSegmentationTeethMatte_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliarySemanticSegmentationGlassesMatte typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliarySemanticSegmentationGlassesMatte_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliarySemanticSegmentationGlassesMatte_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliarySemanticSegmentationGlassesMatte").orElseThrow() }
private val kCIImageAuxiliarySemanticSegmentationGlassesMatte_VH: VarHandle by lazy { kCIImageAuxiliarySemanticSegmentationGlassesMatte_LAYOUT.varHandle() }

var kCIImageAuxiliarySemanticSegmentationGlassesMatte: MemorySegment
    get() = kCIImageAuxiliarySemanticSegmentationGlassesMatte_VH.get(kCIImageAuxiliarySemanticSegmentationGlassesMatte_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliarySemanticSegmentationGlassesMatte_VH.set(kCIImageAuxiliarySemanticSegmentationGlassesMatte_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliarySemanticSegmentationSkyMatte typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliarySemanticSegmentationSkyMatte_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliarySemanticSegmentationSkyMatte_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliarySemanticSegmentationSkyMatte").orElseThrow() }
private val kCIImageAuxiliarySemanticSegmentationSkyMatte_VH: VarHandle by lazy { kCIImageAuxiliarySemanticSegmentationSkyMatte_LAYOUT.varHandle() }

var kCIImageAuxiliarySemanticSegmentationSkyMatte: MemorySegment
    get() = kCIImageAuxiliarySemanticSegmentationSkyMatte_VH.get(kCIImageAuxiliarySemanticSegmentationSkyMatte_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliarySemanticSegmentationSkyMatte_VH.set(kCIImageAuxiliarySemanticSegmentationSkyMatte_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAuxiliaryHDRGainMap typedef const CIImageOption = (Void)*
 */
private val kCIImageAuxiliaryHDRGainMap_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAuxiliaryHDRGainMap_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAuxiliaryHDRGainMap").orElseThrow() }
private val kCIImageAuxiliaryHDRGainMap_VH: VarHandle by lazy { kCIImageAuxiliaryHDRGainMap_LAYOUT.varHandle() }

var kCIImageAuxiliaryHDRGainMap: MemorySegment
    get() = kCIImageAuxiliaryHDRGainMap_VH.get(kCIImageAuxiliaryHDRGainMap_SEGMENT) as MemorySegment
    set(value) = kCIImageAuxiliaryHDRGainMap_VH.set(kCIImageAuxiliaryHDRGainMap_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAutoAdjustEnhance typedef const CIImageAutoAdjustmentOption = (Void)*
 */
private val kCIImageAutoAdjustEnhance_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAutoAdjustEnhance_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAutoAdjustEnhance").orElseThrow() }
private val kCIImageAutoAdjustEnhance_VH: VarHandle by lazy { kCIImageAutoAdjustEnhance_LAYOUT.varHandle() }

var kCIImageAutoAdjustEnhance: MemorySegment
    get() = kCIImageAutoAdjustEnhance_VH.get(kCIImageAutoAdjustEnhance_SEGMENT) as MemorySegment
    set(value) = kCIImageAutoAdjustEnhance_VH.set(kCIImageAutoAdjustEnhance_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAutoAdjustRedEye typedef const CIImageAutoAdjustmentOption = (Void)*
 */
private val kCIImageAutoAdjustRedEye_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAutoAdjustRedEye_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAutoAdjustRedEye").orElseThrow() }
private val kCIImageAutoAdjustRedEye_VH: VarHandle by lazy { kCIImageAutoAdjustRedEye_LAYOUT.varHandle() }

var kCIImageAutoAdjustRedEye: MemorySegment
    get() = kCIImageAutoAdjustRedEye_VH.get(kCIImageAutoAdjustRedEye_SEGMENT) as MemorySegment
    set(value) = kCIImageAutoAdjustRedEye_VH.set(kCIImageAutoAdjustRedEye_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAutoAdjustFeatures typedef const CIImageAutoAdjustmentOption = (Void)*
 */
private val kCIImageAutoAdjustFeatures_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAutoAdjustFeatures_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAutoAdjustFeatures").orElseThrow() }
private val kCIImageAutoAdjustFeatures_VH: VarHandle by lazy { kCIImageAutoAdjustFeatures_LAYOUT.varHandle() }

var kCIImageAutoAdjustFeatures: MemorySegment
    get() = kCIImageAutoAdjustFeatures_VH.get(kCIImageAutoAdjustFeatures_SEGMENT) as MemorySegment
    set(value) = kCIImageAutoAdjustFeatures_VH.set(kCIImageAutoAdjustFeatures_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAutoAdjustCrop typedef const CIImageAutoAdjustmentOption = (Void)*
 */
private val kCIImageAutoAdjustCrop_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAutoAdjustCrop_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAutoAdjustCrop").orElseThrow() }
private val kCIImageAutoAdjustCrop_VH: VarHandle by lazy { kCIImageAutoAdjustCrop_LAYOUT.varHandle() }

var kCIImageAutoAdjustCrop: MemorySegment
    get() = kCIImageAutoAdjustCrop_VH.get(kCIImageAutoAdjustCrop_SEGMENT) as MemorySegment
    set(value) = kCIImageAutoAdjustCrop_VH.set(kCIImageAutoAdjustCrop_SEGMENT, value)

/**
 * {@snippet lang=c : kCIImageAutoAdjustLevel typedef const CIImageAutoAdjustmentOption = (Void)*
 */
private val kCIImageAutoAdjustLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCIImageAutoAdjustLevel_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCIImageAutoAdjustLevel").orElseThrow() }
private val kCIImageAutoAdjustLevel_VH: VarHandle by lazy { kCIImageAutoAdjustLevel_LAYOUT.varHandle() }

var kCIImageAutoAdjustLevel: MemorySegment
    get() = kCIImageAutoAdjustLevel_VH.get(kCIImageAutoAdjustLevel_SEGMENT) as MemorySegment
    set(value) = kCIImageAutoAdjustLevel_VH.set(kCIImageAutoAdjustLevel_SEGMENT, value)

/**
 * {@snippet lang=c : NSColorPanelColorDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSColorPanelColorDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSColorPanelColorDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSColorPanelColorDidChangeNotification").orElseThrow() }
private val NSColorPanelColorDidChangeNotification_VH: VarHandle by lazy { NSColorPanelColorDidChangeNotification_LAYOUT.varHandle() }

var NSColorPanelColorDidChangeNotification: MemorySegment
    get() = NSColorPanelColorDidChangeNotification_VH.get(NSColorPanelColorDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSColorPanelColorDidChangeNotification_VH.set(NSColorPanelColorDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSDraggingImageComponentIconKey typedef const NSDraggingImageComponentKey = (Void)*
 */
private val NSDraggingImageComponentIconKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDraggingImageComponentIconKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDraggingImageComponentIconKey").orElseThrow() }
private val NSDraggingImageComponentIconKey_VH: VarHandle by lazy { NSDraggingImageComponentIconKey_LAYOUT.varHandle() }

var NSDraggingImageComponentIconKey: MemorySegment
    get() = NSDraggingImageComponentIconKey_VH.get(NSDraggingImageComponentIconKey_SEGMENT) as MemorySegment
    set(value) = NSDraggingImageComponentIconKey_VH.set(NSDraggingImageComponentIconKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSDraggingImageComponentLabelKey typedef const NSDraggingImageComponentKey = (Void)*
 */
private val NSDraggingImageComponentLabelKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDraggingImageComponentLabelKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDraggingImageComponentLabelKey").orElseThrow() }
private val NSDraggingImageComponentLabelKey_VH: VarHandle by lazy { NSDraggingImageComponentLabelKey_LAYOUT.varHandle() }

var NSDraggingImageComponentLabelKey: MemorySegment
    get() = NSDraggingImageComponentLabelKey_VH.get(NSDraggingImageComponentLabelKey_SEGMENT) as MemorySegment
    set(value) = NSDraggingImageComponentLabelKey_VH.set(NSDraggingImageComponentLabelKey_SEGMENT, value)

/**
 * {@snippet lang=c : _NSDictionaryOfVariableBindings (Void)*(typedef NSString = (Void)*,typedef id = (Void)*)
 */
private val _NSDictionaryOfVariableBindings_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val _NSDictionaryOfVariableBindings_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("_NSDictionaryOfVariableBindings").orElseThrow()
private val _NSDictionaryOfVariableBindings_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(_NSDictionaryOfVariableBindings_ADDR, _NSDictionaryOfVariableBindings_DESC)

fun _NSDictionaryOfVariableBindings(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return _NSDictionaryOfVariableBindings_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSViewNoInstrinsicMetric typedef const CGFloat = Double
 */
private val NSViewNoInstrinsicMetric_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSViewNoInstrinsicMetric_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewNoInstrinsicMetric").orElseThrow() }
private val NSViewNoInstrinsicMetric_VH: VarHandle by lazy { NSViewNoInstrinsicMetric_LAYOUT.varHandle() }

var NSViewNoInstrinsicMetric: Double
    get() = NSViewNoInstrinsicMetric_VH.get(NSViewNoInstrinsicMetric_SEGMENT) as Double
    set(value) = NSViewNoInstrinsicMetric_VH.set(NSViewNoInstrinsicMetric_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewNoIntrinsicMetric typedef const CGFloat = Double
 */
private val NSViewNoIntrinsicMetric_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSViewNoIntrinsicMetric_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewNoIntrinsicMetric").orElseThrow() }
private val NSViewNoIntrinsicMetric_VH: VarHandle by lazy { NSViewNoIntrinsicMetric_LAYOUT.varHandle() }

var NSViewNoIntrinsicMetric: Double
    get() = NSViewNoIntrinsicMetric_VH.get(NSViewNoIntrinsicMetric_SEGMENT) as Double
    set(value) = NSViewNoIntrinsicMetric_VH.set(NSViewNoIntrinsicMetric_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageHintCTM typedef const NSImageHintKey = (Void)*
 */
private val NSImageHintCTM_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageHintCTM_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageHintCTM").orElseThrow() }
private val NSImageHintCTM_VH: VarHandle by lazy { NSImageHintCTM_LAYOUT.varHandle() }

var NSImageHintCTM: MemorySegment
    get() = NSImageHintCTM_VH.get(NSImageHintCTM_SEGMENT) as MemorySegment
    set(value) = NSImageHintCTM_VH.set(NSImageHintCTM_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageHintInterpolation typedef const NSImageHintKey = (Void)*
 */
private val NSImageHintInterpolation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageHintInterpolation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageHintInterpolation").orElseThrow() }
private val NSImageHintInterpolation_VH: VarHandle by lazy { NSImageHintInterpolation_LAYOUT.varHandle() }

var NSImageHintInterpolation: MemorySegment
    get() = NSImageHintInterpolation_VH.get(NSImageHintInterpolation_SEGMENT) as MemorySegment
    set(value) = NSImageHintInterpolation_VH.set(NSImageHintInterpolation_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageHintUserInterfaceLayoutDirection typedef const NSImageHintKey = (Void)*
 */
private val NSImageHintUserInterfaceLayoutDirection_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageHintUserInterfaceLayoutDirection_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageHintUserInterfaceLayoutDirection").orElseThrow() }
private val NSImageHintUserInterfaceLayoutDirection_VH: VarHandle by lazy { NSImageHintUserInterfaceLayoutDirection_LAYOUT.varHandle() }

var NSImageHintUserInterfaceLayoutDirection: MemorySegment
    get() = NSImageHintUserInterfaceLayoutDirection_VH.get(NSImageHintUserInterfaceLayoutDirection_SEGMENT) as MemorySegment
    set(value) = NSImageHintUserInterfaceLayoutDirection_VH.set(NSImageHintUserInterfaceLayoutDirection_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameAddTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameAddTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameAddTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameAddTemplate").orElseThrow() }
private val NSImageNameAddTemplate_VH: VarHandle by lazy { NSImageNameAddTemplate_LAYOUT.varHandle() }

var NSImageNameAddTemplate: MemorySegment
    get() = NSImageNameAddTemplate_VH.get(NSImageNameAddTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameAddTemplate_VH.set(NSImageNameAddTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameBluetoothTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameBluetoothTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameBluetoothTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameBluetoothTemplate").orElseThrow() }
private val NSImageNameBluetoothTemplate_VH: VarHandle by lazy { NSImageNameBluetoothTemplate_LAYOUT.varHandle() }

var NSImageNameBluetoothTemplate: MemorySegment
    get() = NSImageNameBluetoothTemplate_VH.get(NSImageNameBluetoothTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameBluetoothTemplate_VH.set(NSImageNameBluetoothTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameBonjour typedef const NSImageName = (Void)*
 */
private val NSImageNameBonjour_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameBonjour_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameBonjour").orElseThrow() }
private val NSImageNameBonjour_VH: VarHandle by lazy { NSImageNameBonjour_LAYOUT.varHandle() }

var NSImageNameBonjour: MemorySegment
    get() = NSImageNameBonjour_VH.get(NSImageNameBonjour_SEGMENT) as MemorySegment
    set(value) = NSImageNameBonjour_VH.set(NSImageNameBonjour_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameBookmarksTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameBookmarksTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameBookmarksTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameBookmarksTemplate").orElseThrow() }
private val NSImageNameBookmarksTemplate_VH: VarHandle by lazy { NSImageNameBookmarksTemplate_LAYOUT.varHandle() }

var NSImageNameBookmarksTemplate: MemorySegment
    get() = NSImageNameBookmarksTemplate_VH.get(NSImageNameBookmarksTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameBookmarksTemplate_VH.set(NSImageNameBookmarksTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameCaution typedef const NSImageName = (Void)*
 */
private val NSImageNameCaution_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameCaution_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameCaution").orElseThrow() }
private val NSImageNameCaution_VH: VarHandle by lazy { NSImageNameCaution_LAYOUT.varHandle() }

var NSImageNameCaution: MemorySegment
    get() = NSImageNameCaution_VH.get(NSImageNameCaution_SEGMENT) as MemorySegment
    set(value) = NSImageNameCaution_VH.set(NSImageNameCaution_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameComputer typedef const NSImageName = (Void)*
 */
private val NSImageNameComputer_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameComputer_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameComputer").orElseThrow() }
private val NSImageNameComputer_VH: VarHandle by lazy { NSImageNameComputer_LAYOUT.varHandle() }

var NSImageNameComputer: MemorySegment
    get() = NSImageNameComputer_VH.get(NSImageNameComputer_SEGMENT) as MemorySegment
    set(value) = NSImageNameComputer_VH.set(NSImageNameComputer_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameEnterFullScreenTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameEnterFullScreenTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameEnterFullScreenTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameEnterFullScreenTemplate").orElseThrow() }
private val NSImageNameEnterFullScreenTemplate_VH: VarHandle by lazy { NSImageNameEnterFullScreenTemplate_LAYOUT.varHandle() }

var NSImageNameEnterFullScreenTemplate: MemorySegment
    get() = NSImageNameEnterFullScreenTemplate_VH.get(NSImageNameEnterFullScreenTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameEnterFullScreenTemplate_VH.set(NSImageNameEnterFullScreenTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameExitFullScreenTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameExitFullScreenTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameExitFullScreenTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameExitFullScreenTemplate").orElseThrow() }
private val NSImageNameExitFullScreenTemplate_VH: VarHandle by lazy { NSImageNameExitFullScreenTemplate_LAYOUT.varHandle() }

var NSImageNameExitFullScreenTemplate: MemorySegment
    get() = NSImageNameExitFullScreenTemplate_VH.get(NSImageNameExitFullScreenTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameExitFullScreenTemplate_VH.set(NSImageNameExitFullScreenTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameFolder typedef const NSImageName = (Void)*
 */
private val NSImageNameFolder_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameFolder_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameFolder").orElseThrow() }
private val NSImageNameFolder_VH: VarHandle by lazy { NSImageNameFolder_LAYOUT.varHandle() }

var NSImageNameFolder: MemorySegment
    get() = NSImageNameFolder_VH.get(NSImageNameFolder_SEGMENT) as MemorySegment
    set(value) = NSImageNameFolder_VH.set(NSImageNameFolder_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameFolderBurnable typedef const NSImageName = (Void)*
 */
private val NSImageNameFolderBurnable_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameFolderBurnable_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameFolderBurnable").orElseThrow() }
private val NSImageNameFolderBurnable_VH: VarHandle by lazy { NSImageNameFolderBurnable_LAYOUT.varHandle() }

var NSImageNameFolderBurnable: MemorySegment
    get() = NSImageNameFolderBurnable_VH.get(NSImageNameFolderBurnable_SEGMENT) as MemorySegment
    set(value) = NSImageNameFolderBurnable_VH.set(NSImageNameFolderBurnable_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameFolderSmart typedef const NSImageName = (Void)*
 */
private val NSImageNameFolderSmart_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameFolderSmart_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameFolderSmart").orElseThrow() }
private val NSImageNameFolderSmart_VH: VarHandle by lazy { NSImageNameFolderSmart_LAYOUT.varHandle() }

var NSImageNameFolderSmart: MemorySegment
    get() = NSImageNameFolderSmart_VH.get(NSImageNameFolderSmart_SEGMENT) as MemorySegment
    set(value) = NSImageNameFolderSmart_VH.set(NSImageNameFolderSmart_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameFollowLinkFreestandingTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameFollowLinkFreestandingTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameFollowLinkFreestandingTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameFollowLinkFreestandingTemplate").orElseThrow() }
private val NSImageNameFollowLinkFreestandingTemplate_VH: VarHandle by lazy { NSImageNameFollowLinkFreestandingTemplate_LAYOUT.varHandle() }

var NSImageNameFollowLinkFreestandingTemplate: MemorySegment
    get() = NSImageNameFollowLinkFreestandingTemplate_VH.get(NSImageNameFollowLinkFreestandingTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameFollowLinkFreestandingTemplate_VH.set(NSImageNameFollowLinkFreestandingTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameHomeTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameHomeTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameHomeTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameHomeTemplate").orElseThrow() }
private val NSImageNameHomeTemplate_VH: VarHandle by lazy { NSImageNameHomeTemplate_LAYOUT.varHandle() }

var NSImageNameHomeTemplate: MemorySegment
    get() = NSImageNameHomeTemplate_VH.get(NSImageNameHomeTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameHomeTemplate_VH.set(NSImageNameHomeTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameIChatTheaterTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameIChatTheaterTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameIChatTheaterTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameIChatTheaterTemplate").orElseThrow() }
private val NSImageNameIChatTheaterTemplate_VH: VarHandle by lazy { NSImageNameIChatTheaterTemplate_LAYOUT.varHandle() }

var NSImageNameIChatTheaterTemplate: MemorySegment
    get() = NSImageNameIChatTheaterTemplate_VH.get(NSImageNameIChatTheaterTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameIChatTheaterTemplate_VH.set(NSImageNameIChatTheaterTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameLockLockedTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameLockLockedTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameLockLockedTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameLockLockedTemplate").orElseThrow() }
private val NSImageNameLockLockedTemplate_VH: VarHandle by lazy { NSImageNameLockLockedTemplate_LAYOUT.varHandle() }

var NSImageNameLockLockedTemplate: MemorySegment
    get() = NSImageNameLockLockedTemplate_VH.get(NSImageNameLockLockedTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameLockLockedTemplate_VH.set(NSImageNameLockLockedTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameLockUnlockedTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameLockUnlockedTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameLockUnlockedTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameLockUnlockedTemplate").orElseThrow() }
private val NSImageNameLockUnlockedTemplate_VH: VarHandle by lazy { NSImageNameLockUnlockedTemplate_LAYOUT.varHandle() }

var NSImageNameLockUnlockedTemplate: MemorySegment
    get() = NSImageNameLockUnlockedTemplate_VH.get(NSImageNameLockUnlockedTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameLockUnlockedTemplate_VH.set(NSImageNameLockUnlockedTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameNetwork typedef const NSImageName = (Void)*
 */
private val NSImageNameNetwork_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameNetwork_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameNetwork").orElseThrow() }
private val NSImageNameNetwork_VH: VarHandle by lazy { NSImageNameNetwork_LAYOUT.varHandle() }

var NSImageNameNetwork: MemorySegment
    get() = NSImageNameNetwork_VH.get(NSImageNameNetwork_SEGMENT) as MemorySegment
    set(value) = NSImageNameNetwork_VH.set(NSImageNameNetwork_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNamePathTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNamePathTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNamePathTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNamePathTemplate").orElseThrow() }
private val NSImageNamePathTemplate_VH: VarHandle by lazy { NSImageNamePathTemplate_LAYOUT.varHandle() }

var NSImageNamePathTemplate: MemorySegment
    get() = NSImageNamePathTemplate_VH.get(NSImageNamePathTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNamePathTemplate_VH.set(NSImageNamePathTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameQuickLookTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameQuickLookTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameQuickLookTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameQuickLookTemplate").orElseThrow() }
private val NSImageNameQuickLookTemplate_VH: VarHandle by lazy { NSImageNameQuickLookTemplate_LAYOUT.varHandle() }

var NSImageNameQuickLookTemplate: MemorySegment
    get() = NSImageNameQuickLookTemplate_VH.get(NSImageNameQuickLookTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameQuickLookTemplate_VH.set(NSImageNameQuickLookTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameRefreshFreestandingTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameRefreshFreestandingTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameRefreshFreestandingTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameRefreshFreestandingTemplate").orElseThrow() }
private val NSImageNameRefreshFreestandingTemplate_VH: VarHandle by lazy { NSImageNameRefreshFreestandingTemplate_LAYOUT.varHandle() }

var NSImageNameRefreshFreestandingTemplate: MemorySegment
    get() = NSImageNameRefreshFreestandingTemplate_VH.get(NSImageNameRefreshFreestandingTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameRefreshFreestandingTemplate_VH.set(NSImageNameRefreshFreestandingTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameRefreshTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameRefreshTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameRefreshTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameRefreshTemplate").orElseThrow() }
private val NSImageNameRefreshTemplate_VH: VarHandle by lazy { NSImageNameRefreshTemplate_LAYOUT.varHandle() }

var NSImageNameRefreshTemplate: MemorySegment
    get() = NSImageNameRefreshTemplate_VH.get(NSImageNameRefreshTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameRefreshTemplate_VH.set(NSImageNameRefreshTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameRemoveTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameRemoveTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameRemoveTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameRemoveTemplate").orElseThrow() }
private val NSImageNameRemoveTemplate_VH: VarHandle by lazy { NSImageNameRemoveTemplate_LAYOUT.varHandle() }

var NSImageNameRemoveTemplate: MemorySegment
    get() = NSImageNameRemoveTemplate_VH.get(NSImageNameRemoveTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameRemoveTemplate_VH.set(NSImageNameRemoveTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameRevealFreestandingTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameRevealFreestandingTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameRevealFreestandingTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameRevealFreestandingTemplate").orElseThrow() }
private val NSImageNameRevealFreestandingTemplate_VH: VarHandle by lazy { NSImageNameRevealFreestandingTemplate_LAYOUT.varHandle() }

var NSImageNameRevealFreestandingTemplate: MemorySegment
    get() = NSImageNameRevealFreestandingTemplate_VH.get(NSImageNameRevealFreestandingTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameRevealFreestandingTemplate_VH.set(NSImageNameRevealFreestandingTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameShareTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameShareTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameShareTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameShareTemplate").orElseThrow() }
private val NSImageNameShareTemplate_VH: VarHandle by lazy { NSImageNameShareTemplate_LAYOUT.varHandle() }

var NSImageNameShareTemplate: MemorySegment
    get() = NSImageNameShareTemplate_VH.get(NSImageNameShareTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameShareTemplate_VH.set(NSImageNameShareTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameSlideshowTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameSlideshowTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameSlideshowTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameSlideshowTemplate").orElseThrow() }
private val NSImageNameSlideshowTemplate_VH: VarHandle by lazy { NSImageNameSlideshowTemplate_LAYOUT.varHandle() }

var NSImageNameSlideshowTemplate: MemorySegment
    get() = NSImageNameSlideshowTemplate_VH.get(NSImageNameSlideshowTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameSlideshowTemplate_VH.set(NSImageNameSlideshowTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameStatusAvailable typedef const NSImageName = (Void)*
 */
private val NSImageNameStatusAvailable_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameStatusAvailable_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameStatusAvailable").orElseThrow() }
private val NSImageNameStatusAvailable_VH: VarHandle by lazy { NSImageNameStatusAvailable_LAYOUT.varHandle() }

var NSImageNameStatusAvailable: MemorySegment
    get() = NSImageNameStatusAvailable_VH.get(NSImageNameStatusAvailable_SEGMENT) as MemorySegment
    set(value) = NSImageNameStatusAvailable_VH.set(NSImageNameStatusAvailable_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameStatusNone typedef const NSImageName = (Void)*
 */
private val NSImageNameStatusNone_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameStatusNone_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameStatusNone").orElseThrow() }
private val NSImageNameStatusNone_VH: VarHandle by lazy { NSImageNameStatusNone_LAYOUT.varHandle() }

var NSImageNameStatusNone: MemorySegment
    get() = NSImageNameStatusNone_VH.get(NSImageNameStatusNone_SEGMENT) as MemorySegment
    set(value) = NSImageNameStatusNone_VH.set(NSImageNameStatusNone_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameStatusPartiallyAvailable typedef const NSImageName = (Void)*
 */
private val NSImageNameStatusPartiallyAvailable_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameStatusPartiallyAvailable_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameStatusPartiallyAvailable").orElseThrow() }
private val NSImageNameStatusPartiallyAvailable_VH: VarHandle by lazy { NSImageNameStatusPartiallyAvailable_LAYOUT.varHandle() }

var NSImageNameStatusPartiallyAvailable: MemorySegment
    get() = NSImageNameStatusPartiallyAvailable_VH.get(NSImageNameStatusPartiallyAvailable_SEGMENT) as MemorySegment
    set(value) = NSImageNameStatusPartiallyAvailable_VH.set(NSImageNameStatusPartiallyAvailable_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameStatusUnavailable typedef const NSImageName = (Void)*
 */
private val NSImageNameStatusUnavailable_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameStatusUnavailable_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameStatusUnavailable").orElseThrow() }
private val NSImageNameStatusUnavailable_VH: VarHandle by lazy { NSImageNameStatusUnavailable_LAYOUT.varHandle() }

var NSImageNameStatusUnavailable: MemorySegment
    get() = NSImageNameStatusUnavailable_VH.get(NSImageNameStatusUnavailable_SEGMENT) as MemorySegment
    set(value) = NSImageNameStatusUnavailable_VH.set(NSImageNameStatusUnavailable_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameStopProgressFreestandingTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameStopProgressFreestandingTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameStopProgressFreestandingTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameStopProgressFreestandingTemplate").orElseThrow() }
private val NSImageNameStopProgressFreestandingTemplate_VH: VarHandle by lazy { NSImageNameStopProgressFreestandingTemplate_LAYOUT.varHandle() }

var NSImageNameStopProgressFreestandingTemplate: MemorySegment
    get() = NSImageNameStopProgressFreestandingTemplate_VH.get(NSImageNameStopProgressFreestandingTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameStopProgressFreestandingTemplate_VH.set(NSImageNameStopProgressFreestandingTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameStopProgressTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameStopProgressTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameStopProgressTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameStopProgressTemplate").orElseThrow() }
private val NSImageNameStopProgressTemplate_VH: VarHandle by lazy { NSImageNameStopProgressTemplate_LAYOUT.varHandle() }

var NSImageNameStopProgressTemplate: MemorySegment
    get() = NSImageNameStopProgressTemplate_VH.get(NSImageNameStopProgressTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameStopProgressTemplate_VH.set(NSImageNameStopProgressTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTrashEmpty typedef const NSImageName = (Void)*
 */
private val NSImageNameTrashEmpty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTrashEmpty_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTrashEmpty").orElseThrow() }
private val NSImageNameTrashEmpty_VH: VarHandle by lazy { NSImageNameTrashEmpty_LAYOUT.varHandle() }

var NSImageNameTrashEmpty: MemorySegment
    get() = NSImageNameTrashEmpty_VH.get(NSImageNameTrashEmpty_SEGMENT) as MemorySegment
    set(value) = NSImageNameTrashEmpty_VH.set(NSImageNameTrashEmpty_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTrashFull typedef const NSImageName = (Void)*
 */
private val NSImageNameTrashFull_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTrashFull_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTrashFull").orElseThrow() }
private val NSImageNameTrashFull_VH: VarHandle by lazy { NSImageNameTrashFull_LAYOUT.varHandle() }

var NSImageNameTrashFull: MemorySegment
    get() = NSImageNameTrashFull_VH.get(NSImageNameTrashFull_SEGMENT) as MemorySegment
    set(value) = NSImageNameTrashFull_VH.set(NSImageNameTrashFull_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameActionTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameActionTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameActionTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameActionTemplate").orElseThrow() }
private val NSImageNameActionTemplate_VH: VarHandle by lazy { NSImageNameActionTemplate_LAYOUT.varHandle() }

var NSImageNameActionTemplate: MemorySegment
    get() = NSImageNameActionTemplate_VH.get(NSImageNameActionTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameActionTemplate_VH.set(NSImageNameActionTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameSmartBadgeTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameSmartBadgeTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameSmartBadgeTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameSmartBadgeTemplate").orElseThrow() }
private val NSImageNameSmartBadgeTemplate_VH: VarHandle by lazy { NSImageNameSmartBadgeTemplate_LAYOUT.varHandle() }

var NSImageNameSmartBadgeTemplate: MemorySegment
    get() = NSImageNameSmartBadgeTemplate_VH.get(NSImageNameSmartBadgeTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameSmartBadgeTemplate_VH.set(NSImageNameSmartBadgeTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameIconViewTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameIconViewTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameIconViewTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameIconViewTemplate").orElseThrow() }
private val NSImageNameIconViewTemplate_VH: VarHandle by lazy { NSImageNameIconViewTemplate_LAYOUT.varHandle() }

var NSImageNameIconViewTemplate: MemorySegment
    get() = NSImageNameIconViewTemplate_VH.get(NSImageNameIconViewTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameIconViewTemplate_VH.set(NSImageNameIconViewTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameListViewTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameListViewTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameListViewTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameListViewTemplate").orElseThrow() }
private val NSImageNameListViewTemplate_VH: VarHandle by lazy { NSImageNameListViewTemplate_LAYOUT.varHandle() }

var NSImageNameListViewTemplate: MemorySegment
    get() = NSImageNameListViewTemplate_VH.get(NSImageNameListViewTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameListViewTemplate_VH.set(NSImageNameListViewTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameColumnViewTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameColumnViewTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameColumnViewTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameColumnViewTemplate").orElseThrow() }
private val NSImageNameColumnViewTemplate_VH: VarHandle by lazy { NSImageNameColumnViewTemplate_LAYOUT.varHandle() }

var NSImageNameColumnViewTemplate: MemorySegment
    get() = NSImageNameColumnViewTemplate_VH.get(NSImageNameColumnViewTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameColumnViewTemplate_VH.set(NSImageNameColumnViewTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameFlowViewTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameFlowViewTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameFlowViewTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameFlowViewTemplate").orElseThrow() }
private val NSImageNameFlowViewTemplate_VH: VarHandle by lazy { NSImageNameFlowViewTemplate_LAYOUT.varHandle() }

var NSImageNameFlowViewTemplate: MemorySegment
    get() = NSImageNameFlowViewTemplate_VH.get(NSImageNameFlowViewTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameFlowViewTemplate_VH.set(NSImageNameFlowViewTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameInvalidDataFreestandingTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameInvalidDataFreestandingTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameInvalidDataFreestandingTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameInvalidDataFreestandingTemplate").orElseThrow() }
private val NSImageNameInvalidDataFreestandingTemplate_VH: VarHandle by lazy { NSImageNameInvalidDataFreestandingTemplate_LAYOUT.varHandle() }

var NSImageNameInvalidDataFreestandingTemplate: MemorySegment
    get() = NSImageNameInvalidDataFreestandingTemplate_VH.get(NSImageNameInvalidDataFreestandingTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameInvalidDataFreestandingTemplate_VH.set(NSImageNameInvalidDataFreestandingTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameGoForwardTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameGoForwardTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameGoForwardTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameGoForwardTemplate").orElseThrow() }
private val NSImageNameGoForwardTemplate_VH: VarHandle by lazy { NSImageNameGoForwardTemplate_LAYOUT.varHandle() }

var NSImageNameGoForwardTemplate: MemorySegment
    get() = NSImageNameGoForwardTemplate_VH.get(NSImageNameGoForwardTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameGoForwardTemplate_VH.set(NSImageNameGoForwardTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameGoBackTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameGoBackTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameGoBackTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameGoBackTemplate").orElseThrow() }
private val NSImageNameGoBackTemplate_VH: VarHandle by lazy { NSImageNameGoBackTemplate_LAYOUT.varHandle() }

var NSImageNameGoBackTemplate: MemorySegment
    get() = NSImageNameGoBackTemplate_VH.get(NSImageNameGoBackTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameGoBackTemplate_VH.set(NSImageNameGoBackTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameGoRightTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameGoRightTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameGoRightTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameGoRightTemplate").orElseThrow() }
private val NSImageNameGoRightTemplate_VH: VarHandle by lazy { NSImageNameGoRightTemplate_LAYOUT.varHandle() }

var NSImageNameGoRightTemplate: MemorySegment
    get() = NSImageNameGoRightTemplate_VH.get(NSImageNameGoRightTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameGoRightTemplate_VH.set(NSImageNameGoRightTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameGoLeftTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameGoLeftTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameGoLeftTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameGoLeftTemplate").orElseThrow() }
private val NSImageNameGoLeftTemplate_VH: VarHandle by lazy { NSImageNameGoLeftTemplate_LAYOUT.varHandle() }

var NSImageNameGoLeftTemplate: MemorySegment
    get() = NSImageNameGoLeftTemplate_VH.get(NSImageNameGoLeftTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameGoLeftTemplate_VH.set(NSImageNameGoLeftTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameRightFacingTriangleTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameRightFacingTriangleTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameRightFacingTriangleTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameRightFacingTriangleTemplate").orElseThrow() }
private val NSImageNameRightFacingTriangleTemplate_VH: VarHandle by lazy { NSImageNameRightFacingTriangleTemplate_LAYOUT.varHandle() }

var NSImageNameRightFacingTriangleTemplate: MemorySegment
    get() = NSImageNameRightFacingTriangleTemplate_VH.get(NSImageNameRightFacingTriangleTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameRightFacingTriangleTemplate_VH.set(NSImageNameRightFacingTriangleTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameLeftFacingTriangleTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameLeftFacingTriangleTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameLeftFacingTriangleTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameLeftFacingTriangleTemplate").orElseThrow() }
private val NSImageNameLeftFacingTriangleTemplate_VH: VarHandle by lazy { NSImageNameLeftFacingTriangleTemplate_LAYOUT.varHandle() }

var NSImageNameLeftFacingTriangleTemplate: MemorySegment
    get() = NSImageNameLeftFacingTriangleTemplate_VH.get(NSImageNameLeftFacingTriangleTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameLeftFacingTriangleTemplate_VH.set(NSImageNameLeftFacingTriangleTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameDotMac typedef const NSImageName = (Void)*
 */
private val NSImageNameDotMac_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameDotMac_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameDotMac").orElseThrow() }
private val NSImageNameDotMac_VH: VarHandle by lazy { NSImageNameDotMac_LAYOUT.varHandle() }

var NSImageNameDotMac: MemorySegment
    get() = NSImageNameDotMac_VH.get(NSImageNameDotMac_SEGMENT) as MemorySegment
    set(value) = NSImageNameDotMac_VH.set(NSImageNameDotMac_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameMobileMe typedef const NSImageName = (Void)*
 */
private val NSImageNameMobileMe_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameMobileMe_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameMobileMe").orElseThrow() }
private val NSImageNameMobileMe_VH: VarHandle by lazy { NSImageNameMobileMe_LAYOUT.varHandle() }

var NSImageNameMobileMe: MemorySegment
    get() = NSImageNameMobileMe_VH.get(NSImageNameMobileMe_SEGMENT) as MemorySegment
    set(value) = NSImageNameMobileMe_VH.set(NSImageNameMobileMe_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameMultipleDocuments typedef const NSImageName = (Void)*
 */
private val NSImageNameMultipleDocuments_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameMultipleDocuments_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameMultipleDocuments").orElseThrow() }
private val NSImageNameMultipleDocuments_VH: VarHandle by lazy { NSImageNameMultipleDocuments_LAYOUT.varHandle() }

var NSImageNameMultipleDocuments: MemorySegment
    get() = NSImageNameMultipleDocuments_VH.get(NSImageNameMultipleDocuments_SEGMENT) as MemorySegment
    set(value) = NSImageNameMultipleDocuments_VH.set(NSImageNameMultipleDocuments_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameUserAccounts typedef const NSImageName = (Void)*
 */
private val NSImageNameUserAccounts_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameUserAccounts_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameUserAccounts").orElseThrow() }
private val NSImageNameUserAccounts_VH: VarHandle by lazy { NSImageNameUserAccounts_LAYOUT.varHandle() }

var NSImageNameUserAccounts: MemorySegment
    get() = NSImageNameUserAccounts_VH.get(NSImageNameUserAccounts_SEGMENT) as MemorySegment
    set(value) = NSImageNameUserAccounts_VH.set(NSImageNameUserAccounts_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNamePreferencesGeneral typedef const NSImageName = (Void)*
 */
private val NSImageNamePreferencesGeneral_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNamePreferencesGeneral_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNamePreferencesGeneral").orElseThrow() }
private val NSImageNamePreferencesGeneral_VH: VarHandle by lazy { NSImageNamePreferencesGeneral_LAYOUT.varHandle() }

var NSImageNamePreferencesGeneral: MemorySegment
    get() = NSImageNamePreferencesGeneral_VH.get(NSImageNamePreferencesGeneral_SEGMENT) as MemorySegment
    set(value) = NSImageNamePreferencesGeneral_VH.set(NSImageNamePreferencesGeneral_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameAdvanced typedef const NSImageName = (Void)*
 */
private val NSImageNameAdvanced_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameAdvanced_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameAdvanced").orElseThrow() }
private val NSImageNameAdvanced_VH: VarHandle by lazy { NSImageNameAdvanced_LAYOUT.varHandle() }

var NSImageNameAdvanced: MemorySegment
    get() = NSImageNameAdvanced_VH.get(NSImageNameAdvanced_SEGMENT) as MemorySegment
    set(value) = NSImageNameAdvanced_VH.set(NSImageNameAdvanced_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameInfo typedef const NSImageName = (Void)*
 */
private val NSImageNameInfo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameInfo_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameInfo").orElseThrow() }
private val NSImageNameInfo_VH: VarHandle by lazy { NSImageNameInfo_LAYOUT.varHandle() }

var NSImageNameInfo: MemorySegment
    get() = NSImageNameInfo_VH.get(NSImageNameInfo_SEGMENT) as MemorySegment
    set(value) = NSImageNameInfo_VH.set(NSImageNameInfo_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameFontPanel typedef const NSImageName = (Void)*
 */
private val NSImageNameFontPanel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameFontPanel_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameFontPanel").orElseThrow() }
private val NSImageNameFontPanel_VH: VarHandle by lazy { NSImageNameFontPanel_LAYOUT.varHandle() }

var NSImageNameFontPanel: MemorySegment
    get() = NSImageNameFontPanel_VH.get(NSImageNameFontPanel_SEGMENT) as MemorySegment
    set(value) = NSImageNameFontPanel_VH.set(NSImageNameFontPanel_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameColorPanel typedef const NSImageName = (Void)*
 */
private val NSImageNameColorPanel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameColorPanel_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameColorPanel").orElseThrow() }
private val NSImageNameColorPanel_VH: VarHandle by lazy { NSImageNameColorPanel_LAYOUT.varHandle() }

var NSImageNameColorPanel: MemorySegment
    get() = NSImageNameColorPanel_VH.get(NSImageNameColorPanel_SEGMENT) as MemorySegment
    set(value) = NSImageNameColorPanel_VH.set(NSImageNameColorPanel_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameUser typedef const NSImageName = (Void)*
 */
private val NSImageNameUser_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameUser_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameUser").orElseThrow() }
private val NSImageNameUser_VH: VarHandle by lazy { NSImageNameUser_LAYOUT.varHandle() }

var NSImageNameUser: MemorySegment
    get() = NSImageNameUser_VH.get(NSImageNameUser_SEGMENT) as MemorySegment
    set(value) = NSImageNameUser_VH.set(NSImageNameUser_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameUserGroup typedef const NSImageName = (Void)*
 */
private val NSImageNameUserGroup_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameUserGroup_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameUserGroup").orElseThrow() }
private val NSImageNameUserGroup_VH: VarHandle by lazy { NSImageNameUserGroup_LAYOUT.varHandle() }

var NSImageNameUserGroup: MemorySegment
    get() = NSImageNameUserGroup_VH.get(NSImageNameUserGroup_SEGMENT) as MemorySegment
    set(value) = NSImageNameUserGroup_VH.set(NSImageNameUserGroup_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameEveryone typedef const NSImageName = (Void)*
 */
private val NSImageNameEveryone_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameEveryone_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameEveryone").orElseThrow() }
private val NSImageNameEveryone_VH: VarHandle by lazy { NSImageNameEveryone_LAYOUT.varHandle() }

var NSImageNameEveryone: MemorySegment
    get() = NSImageNameEveryone_VH.get(NSImageNameEveryone_SEGMENT) as MemorySegment
    set(value) = NSImageNameEveryone_VH.set(NSImageNameEveryone_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameUserGuest typedef const NSImageName = (Void)*
 */
private val NSImageNameUserGuest_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameUserGuest_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameUserGuest").orElseThrow() }
private val NSImageNameUserGuest_VH: VarHandle by lazy { NSImageNameUserGuest_LAYOUT.varHandle() }

var NSImageNameUserGuest: MemorySegment
    get() = NSImageNameUserGuest_VH.get(NSImageNameUserGuest_SEGMENT) as MemorySegment
    set(value) = NSImageNameUserGuest_VH.set(NSImageNameUserGuest_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameMenuOnStateTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameMenuOnStateTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameMenuOnStateTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameMenuOnStateTemplate").orElseThrow() }
private val NSImageNameMenuOnStateTemplate_VH: VarHandle by lazy { NSImageNameMenuOnStateTemplate_LAYOUT.varHandle() }

var NSImageNameMenuOnStateTemplate: MemorySegment
    get() = NSImageNameMenuOnStateTemplate_VH.get(NSImageNameMenuOnStateTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameMenuOnStateTemplate_VH.set(NSImageNameMenuOnStateTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameMenuMixedStateTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameMenuMixedStateTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameMenuMixedStateTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameMenuMixedStateTemplate").orElseThrow() }
private val NSImageNameMenuMixedStateTemplate_VH: VarHandle by lazy { NSImageNameMenuMixedStateTemplate_LAYOUT.varHandle() }

var NSImageNameMenuMixedStateTemplate: MemorySegment
    get() = NSImageNameMenuMixedStateTemplate_VH.get(NSImageNameMenuMixedStateTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameMenuMixedStateTemplate_VH.set(NSImageNameMenuMixedStateTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameApplicationIcon typedef const NSImageName = (Void)*
 */
private val NSImageNameApplicationIcon_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameApplicationIcon_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameApplicationIcon").orElseThrow() }
private val NSImageNameApplicationIcon_VH: VarHandle by lazy { NSImageNameApplicationIcon_LAYOUT.varHandle() }

var NSImageNameApplicationIcon: MemorySegment
    get() = NSImageNameApplicationIcon_VH.get(NSImageNameApplicationIcon_SEGMENT) as MemorySegment
    set(value) = NSImageNameApplicationIcon_VH.set(NSImageNameApplicationIcon_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAddDetailTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAddDetailTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAddDetailTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAddDetailTemplate").orElseThrow() }
private val NSImageNameTouchBarAddDetailTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAddDetailTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAddDetailTemplate: MemorySegment
    get() = NSImageNameTouchBarAddDetailTemplate_VH.get(NSImageNameTouchBarAddDetailTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAddDetailTemplate_VH.set(NSImageNameTouchBarAddDetailTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAddTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAddTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAddTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAddTemplate").orElseThrow() }
private val NSImageNameTouchBarAddTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAddTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAddTemplate: MemorySegment
    get() = NSImageNameTouchBarAddTemplate_VH.get(NSImageNameTouchBarAddTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAddTemplate_VH.set(NSImageNameTouchBarAddTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAlarmTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAlarmTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAlarmTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAlarmTemplate").orElseThrow() }
private val NSImageNameTouchBarAlarmTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAlarmTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAlarmTemplate: MemorySegment
    get() = NSImageNameTouchBarAlarmTemplate_VH.get(NSImageNameTouchBarAlarmTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAlarmTemplate_VH.set(NSImageNameTouchBarAlarmTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAudioInputMuteTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAudioInputMuteTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAudioInputMuteTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAudioInputMuteTemplate").orElseThrow() }
private val NSImageNameTouchBarAudioInputMuteTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAudioInputMuteTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAudioInputMuteTemplate: MemorySegment
    get() = NSImageNameTouchBarAudioInputMuteTemplate_VH.get(NSImageNameTouchBarAudioInputMuteTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAudioInputMuteTemplate_VH.set(NSImageNameTouchBarAudioInputMuteTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAudioInputTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAudioInputTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAudioInputTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAudioInputTemplate").orElseThrow() }
private val NSImageNameTouchBarAudioInputTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAudioInputTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAudioInputTemplate: MemorySegment
    get() = NSImageNameTouchBarAudioInputTemplate_VH.get(NSImageNameTouchBarAudioInputTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAudioInputTemplate_VH.set(NSImageNameTouchBarAudioInputTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAudioOutputMuteTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAudioOutputMuteTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAudioOutputMuteTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAudioOutputMuteTemplate").orElseThrow() }
private val NSImageNameTouchBarAudioOutputMuteTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAudioOutputMuteTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAudioOutputMuteTemplate: MemorySegment
    get() = NSImageNameTouchBarAudioOutputMuteTemplate_VH.get(NSImageNameTouchBarAudioOutputMuteTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAudioOutputMuteTemplate_VH.set(NSImageNameTouchBarAudioOutputMuteTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAudioOutputVolumeHighTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAudioOutputVolumeHighTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAudioOutputVolumeHighTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAudioOutputVolumeHighTemplate").orElseThrow() }
private val NSImageNameTouchBarAudioOutputVolumeHighTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAudioOutputVolumeHighTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAudioOutputVolumeHighTemplate: MemorySegment
    get() = NSImageNameTouchBarAudioOutputVolumeHighTemplate_VH.get(NSImageNameTouchBarAudioOutputVolumeHighTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAudioOutputVolumeHighTemplate_VH.set(NSImageNameTouchBarAudioOutputVolumeHighTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAudioOutputVolumeLowTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAudioOutputVolumeLowTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAudioOutputVolumeLowTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAudioOutputVolumeLowTemplate").orElseThrow() }
private val NSImageNameTouchBarAudioOutputVolumeLowTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAudioOutputVolumeLowTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAudioOutputVolumeLowTemplate: MemorySegment
    get() = NSImageNameTouchBarAudioOutputVolumeLowTemplate_VH.get(NSImageNameTouchBarAudioOutputVolumeLowTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAudioOutputVolumeLowTemplate_VH.set(NSImageNameTouchBarAudioOutputVolumeLowTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAudioOutputVolumeMediumTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAudioOutputVolumeMediumTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAudioOutputVolumeMediumTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAudioOutputVolumeMediumTemplate").orElseThrow() }
private val NSImageNameTouchBarAudioOutputVolumeMediumTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAudioOutputVolumeMediumTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAudioOutputVolumeMediumTemplate: MemorySegment
    get() = NSImageNameTouchBarAudioOutputVolumeMediumTemplate_VH.get(NSImageNameTouchBarAudioOutputVolumeMediumTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAudioOutputVolumeMediumTemplate_VH.set(NSImageNameTouchBarAudioOutputVolumeMediumTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarAudioOutputVolumeOffTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarAudioOutputVolumeOffTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarAudioOutputVolumeOffTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarAudioOutputVolumeOffTemplate").orElseThrow() }
private val NSImageNameTouchBarAudioOutputVolumeOffTemplate_VH: VarHandle by lazy { NSImageNameTouchBarAudioOutputVolumeOffTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarAudioOutputVolumeOffTemplate: MemorySegment
    get() = NSImageNameTouchBarAudioOutputVolumeOffTemplate_VH.get(NSImageNameTouchBarAudioOutputVolumeOffTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarAudioOutputVolumeOffTemplate_VH.set(NSImageNameTouchBarAudioOutputVolumeOffTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarBookmarksTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarBookmarksTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarBookmarksTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarBookmarksTemplate").orElseThrow() }
private val NSImageNameTouchBarBookmarksTemplate_VH: VarHandle by lazy { NSImageNameTouchBarBookmarksTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarBookmarksTemplate: MemorySegment
    get() = NSImageNameTouchBarBookmarksTemplate_VH.get(NSImageNameTouchBarBookmarksTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarBookmarksTemplate_VH.set(NSImageNameTouchBarBookmarksTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarColorPickerFill typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarColorPickerFill_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarColorPickerFill_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarColorPickerFill").orElseThrow() }
private val NSImageNameTouchBarColorPickerFill_VH: VarHandle by lazy { NSImageNameTouchBarColorPickerFill_LAYOUT.varHandle() }

var NSImageNameTouchBarColorPickerFill: MemorySegment
    get() = NSImageNameTouchBarColorPickerFill_VH.get(NSImageNameTouchBarColorPickerFill_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarColorPickerFill_VH.set(NSImageNameTouchBarColorPickerFill_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarColorPickerFont typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarColorPickerFont_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarColorPickerFont_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarColorPickerFont").orElseThrow() }
private val NSImageNameTouchBarColorPickerFont_VH: VarHandle by lazy { NSImageNameTouchBarColorPickerFont_LAYOUT.varHandle() }

var NSImageNameTouchBarColorPickerFont: MemorySegment
    get() = NSImageNameTouchBarColorPickerFont_VH.get(NSImageNameTouchBarColorPickerFont_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarColorPickerFont_VH.set(NSImageNameTouchBarColorPickerFont_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarColorPickerStroke typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarColorPickerStroke_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarColorPickerStroke_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarColorPickerStroke").orElseThrow() }
private val NSImageNameTouchBarColorPickerStroke_VH: VarHandle by lazy { NSImageNameTouchBarColorPickerStroke_LAYOUT.varHandle() }

var NSImageNameTouchBarColorPickerStroke: MemorySegment
    get() = NSImageNameTouchBarColorPickerStroke_VH.get(NSImageNameTouchBarColorPickerStroke_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarColorPickerStroke_VH.set(NSImageNameTouchBarColorPickerStroke_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarCommunicationAudioTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarCommunicationAudioTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarCommunicationAudioTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarCommunicationAudioTemplate").orElseThrow() }
private val NSImageNameTouchBarCommunicationAudioTemplate_VH: VarHandle by lazy { NSImageNameTouchBarCommunicationAudioTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarCommunicationAudioTemplate: MemorySegment
    get() = NSImageNameTouchBarCommunicationAudioTemplate_VH.get(NSImageNameTouchBarCommunicationAudioTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarCommunicationAudioTemplate_VH.set(NSImageNameTouchBarCommunicationAudioTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarCommunicationVideoTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarCommunicationVideoTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarCommunicationVideoTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarCommunicationVideoTemplate").orElseThrow() }
private val NSImageNameTouchBarCommunicationVideoTemplate_VH: VarHandle by lazy { NSImageNameTouchBarCommunicationVideoTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarCommunicationVideoTemplate: MemorySegment
    get() = NSImageNameTouchBarCommunicationVideoTemplate_VH.get(NSImageNameTouchBarCommunicationVideoTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarCommunicationVideoTemplate_VH.set(NSImageNameTouchBarCommunicationVideoTemplate_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarComposeTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarComposeTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarComposeTemplate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageNameTouchBarComposeTemplate").orElseThrow() }
private val NSImageNameTouchBarComposeTemplate_VH: VarHandle by lazy { NSImageNameTouchBarComposeTemplate_LAYOUT.varHandle() }

var NSImageNameTouchBarComposeTemplate: MemorySegment
    get() = NSImageNameTouchBarComposeTemplate_VH.get(NSImageNameTouchBarComposeTemplate_SEGMENT) as MemorySegment
    set(value) = NSImageNameTouchBarComposeTemplate_VH.set(NSImageNameTouchBarComposeTemplate_SEGMENT, value)
