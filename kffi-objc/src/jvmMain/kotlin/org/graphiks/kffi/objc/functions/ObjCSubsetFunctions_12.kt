package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : NSPasteboardTypeHTML typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeHTML_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeHTML_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeHTML").orElseThrow() }
private val NSPasteboardTypeHTML_VH: VarHandle by lazy { NSPasteboardTypeHTML_LAYOUT.varHandle() }

var NSPasteboardTypeHTML: MemorySegment
    get() = NSPasteboardTypeHTML_VH.get(NSPasteboardTypeHTML_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeHTML_VH.set(NSPasteboardTypeHTML_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeTabularText typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeTabularText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeTabularText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeTabularText").orElseThrow() }
private val NSPasteboardTypeTabularText_VH: VarHandle by lazy { NSPasteboardTypeTabularText_LAYOUT.varHandle() }

var NSPasteboardTypeTabularText: MemorySegment
    get() = NSPasteboardTypeTabularText_VH.get(NSPasteboardTypeTabularText_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeTabularText_VH.set(NSPasteboardTypeTabularText_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeFont typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeFont_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeFont_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeFont").orElseThrow() }
private val NSPasteboardTypeFont_VH: VarHandle by lazy { NSPasteboardTypeFont_LAYOUT.varHandle() }

var NSPasteboardTypeFont: MemorySegment
    get() = NSPasteboardTypeFont_VH.get(NSPasteboardTypeFont_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeFont_VH.set(NSPasteboardTypeFont_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeRuler typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeRuler_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeRuler_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeRuler").orElseThrow() }
private val NSPasteboardTypeRuler_VH: VarHandle by lazy { NSPasteboardTypeRuler_LAYOUT.varHandle() }

var NSPasteboardTypeRuler: MemorySegment
    get() = NSPasteboardTypeRuler_VH.get(NSPasteboardTypeRuler_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeRuler_VH.set(NSPasteboardTypeRuler_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeColor typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeColor_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeColor_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeColor").orElseThrow() }
private val NSPasteboardTypeColor_VH: VarHandle by lazy { NSPasteboardTypeColor_LAYOUT.varHandle() }

var NSPasteboardTypeColor: MemorySegment
    get() = NSPasteboardTypeColor_VH.get(NSPasteboardTypeColor_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeColor_VH.set(NSPasteboardTypeColor_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeSound typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeSound_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeSound_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeSound").orElseThrow() }
private val NSPasteboardTypeSound_VH: VarHandle by lazy { NSPasteboardTypeSound_LAYOUT.varHandle() }

var NSPasteboardTypeSound: MemorySegment
    get() = NSPasteboardTypeSound_VH.get(NSPasteboardTypeSound_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeSound_VH.set(NSPasteboardTypeSound_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeMultipleTextSelection typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeMultipleTextSelection_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeMultipleTextSelection_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeMultipleTextSelection").orElseThrow() }
private val NSPasteboardTypeMultipleTextSelection_VH: VarHandle by lazy { NSPasteboardTypeMultipleTextSelection_LAYOUT.varHandle() }

var NSPasteboardTypeMultipleTextSelection: MemorySegment
    get() = NSPasteboardTypeMultipleTextSelection_VH.get(NSPasteboardTypeMultipleTextSelection_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeMultipleTextSelection_VH.set(NSPasteboardTypeMultipleTextSelection_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeTextFinderOptions typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeTextFinderOptions_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeTextFinderOptions_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeTextFinderOptions").orElseThrow() }
private val NSPasteboardTypeTextFinderOptions_VH: VarHandle by lazy { NSPasteboardTypeTextFinderOptions_LAYOUT.varHandle() }

var NSPasteboardTypeTextFinderOptions: MemorySegment
    get() = NSPasteboardTypeTextFinderOptions_VH.get(NSPasteboardTypeTextFinderOptions_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeTextFinderOptions_VH.set(NSPasteboardTypeTextFinderOptions_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeURL typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeURL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeURL_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeURL").orElseThrow() }
private val NSPasteboardTypeURL_VH: VarHandle by lazy { NSPasteboardTypeURL_LAYOUT.varHandle() }

var NSPasteboardTypeURL: MemorySegment
    get() = NSPasteboardTypeURL_VH.get(NSPasteboardTypeURL_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeURL_VH.set(NSPasteboardTypeURL_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeFileURL typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeFileURL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeFileURL_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeFileURL").orElseThrow() }
private val NSPasteboardTypeFileURL_VH: VarHandle by lazy { NSPasteboardTypeFileURL_LAYOUT.varHandle() }

var NSPasteboardTypeFileURL: MemorySegment
    get() = NSPasteboardTypeFileURL_VH.get(NSPasteboardTypeFileURL_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeFileURL_VH.set(NSPasteboardTypeFileURL_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardNameGeneral typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSPasteboardNameGeneral_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardNameGeneral_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardNameGeneral").orElseThrow() }
private val NSPasteboardNameGeneral_VH: VarHandle by lazy { NSPasteboardNameGeneral_LAYOUT.varHandle() }

var NSPasteboardNameGeneral: MemorySegment
    get() = NSPasteboardNameGeneral_VH.get(NSPasteboardNameGeneral_SEGMENT) as MemorySegment
    set(value) = NSPasteboardNameGeneral_VH.set(NSPasteboardNameGeneral_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardNameFont typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSPasteboardNameFont_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardNameFont_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardNameFont").orElseThrow() }
private val NSPasteboardNameFont_VH: VarHandle by lazy { NSPasteboardNameFont_LAYOUT.varHandle() }

var NSPasteboardNameFont: MemorySegment
    get() = NSPasteboardNameFont_VH.get(NSPasteboardNameFont_SEGMENT) as MemorySegment
    set(value) = NSPasteboardNameFont_VH.set(NSPasteboardNameFont_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardNameRuler typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSPasteboardNameRuler_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardNameRuler_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardNameRuler").orElseThrow() }
private val NSPasteboardNameRuler_VH: VarHandle by lazy { NSPasteboardNameRuler_LAYOUT.varHandle() }

var NSPasteboardNameRuler: MemorySegment
    get() = NSPasteboardNameRuler_VH.get(NSPasteboardNameRuler_SEGMENT) as MemorySegment
    set(value) = NSPasteboardNameRuler_VH.set(NSPasteboardNameRuler_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardNameFind typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSPasteboardNameFind_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardNameFind_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardNameFind").orElseThrow() }
private val NSPasteboardNameFind_VH: VarHandle by lazy { NSPasteboardNameFind_LAYOUT.varHandle() }

var NSPasteboardNameFind: MemorySegment
    get() = NSPasteboardNameFind_VH.get(NSPasteboardNameFind_SEGMENT) as MemorySegment
    set(value) = NSPasteboardNameFind_VH.set(NSPasteboardNameFind_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardNameDrag typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSPasteboardNameDrag_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardNameDrag_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardNameDrag").orElseThrow() }
private val NSPasteboardNameDrag_VH: VarHandle by lazy { NSPasteboardNameDrag_LAYOUT.varHandle() }

var NSPasteboardNameDrag: MemorySegment
    get() = NSPasteboardNameDrag_VH.get(NSPasteboardNameDrag_SEGMENT) as MemorySegment
    set(value) = NSPasteboardNameDrag_VH.set(NSPasteboardNameDrag_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternProbableWebURL typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternProbableWebURL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternProbableWebURL_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternProbableWebURL").orElseThrow() }
private val NSPasteboardDetectionPatternProbableWebURL_VH: VarHandle by lazy { NSPasteboardDetectionPatternProbableWebURL_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternProbableWebURL: MemorySegment
    get() = NSPasteboardDetectionPatternProbableWebURL_VH.get(NSPasteboardDetectionPatternProbableWebURL_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternProbableWebURL_VH.set(NSPasteboardDetectionPatternProbableWebURL_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternProbableWebSearch typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternProbableWebSearch_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternProbableWebSearch_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternProbableWebSearch").orElseThrow() }
private val NSPasteboardDetectionPatternProbableWebSearch_VH: VarHandle by lazy { NSPasteboardDetectionPatternProbableWebSearch_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternProbableWebSearch: MemorySegment
    get() = NSPasteboardDetectionPatternProbableWebSearch_VH.get(NSPasteboardDetectionPatternProbableWebSearch_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternProbableWebSearch_VH.set(NSPasteboardDetectionPatternProbableWebSearch_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternNumber typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternNumber").orElseThrow() }
private val NSPasteboardDetectionPatternNumber_VH: VarHandle by lazy { NSPasteboardDetectionPatternNumber_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternNumber: MemorySegment
    get() = NSPasteboardDetectionPatternNumber_VH.get(NSPasteboardDetectionPatternNumber_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternNumber_VH.set(NSPasteboardDetectionPatternNumber_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternLink typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternLink_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternLink_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternLink").orElseThrow() }
private val NSPasteboardDetectionPatternLink_VH: VarHandle by lazy { NSPasteboardDetectionPatternLink_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternLink: MemorySegment
    get() = NSPasteboardDetectionPatternLink_VH.get(NSPasteboardDetectionPatternLink_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternLink_VH.set(NSPasteboardDetectionPatternLink_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternPhoneNumber typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternPhoneNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternPhoneNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternPhoneNumber").orElseThrow() }
private val NSPasteboardDetectionPatternPhoneNumber_VH: VarHandle by lazy { NSPasteboardDetectionPatternPhoneNumber_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternPhoneNumber: MemorySegment
    get() = NSPasteboardDetectionPatternPhoneNumber_VH.get(NSPasteboardDetectionPatternPhoneNumber_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternPhoneNumber_VH.set(NSPasteboardDetectionPatternPhoneNumber_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternEmailAddress typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternEmailAddress_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternEmailAddress_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternEmailAddress").orElseThrow() }
private val NSPasteboardDetectionPatternEmailAddress_VH: VarHandle by lazy { NSPasteboardDetectionPatternEmailAddress_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternEmailAddress: MemorySegment
    get() = NSPasteboardDetectionPatternEmailAddress_VH.get(NSPasteboardDetectionPatternEmailAddress_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternEmailAddress_VH.set(NSPasteboardDetectionPatternEmailAddress_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternPostalAddress typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternPostalAddress_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternPostalAddress_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternPostalAddress").orElseThrow() }
private val NSPasteboardDetectionPatternPostalAddress_VH: VarHandle by lazy { NSPasteboardDetectionPatternPostalAddress_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternPostalAddress: MemorySegment
    get() = NSPasteboardDetectionPatternPostalAddress_VH.get(NSPasteboardDetectionPatternPostalAddress_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternPostalAddress_VH.set(NSPasteboardDetectionPatternPostalAddress_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternCalendarEvent typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternCalendarEvent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternCalendarEvent_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternCalendarEvent").orElseThrow() }
private val NSPasteboardDetectionPatternCalendarEvent_VH: VarHandle by lazy { NSPasteboardDetectionPatternCalendarEvent_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternCalendarEvent: MemorySegment
    get() = NSPasteboardDetectionPatternCalendarEvent_VH.get(NSPasteboardDetectionPatternCalendarEvent_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternCalendarEvent_VH.set(NSPasteboardDetectionPatternCalendarEvent_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternShipmentTrackingNumber typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternShipmentTrackingNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternShipmentTrackingNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternShipmentTrackingNumber").orElseThrow() }
private val NSPasteboardDetectionPatternShipmentTrackingNumber_VH: VarHandle by lazy { NSPasteboardDetectionPatternShipmentTrackingNumber_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternShipmentTrackingNumber: MemorySegment
    get() = NSPasteboardDetectionPatternShipmentTrackingNumber_VH.get(NSPasteboardDetectionPatternShipmentTrackingNumber_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternShipmentTrackingNumber_VH.set(NSPasteboardDetectionPatternShipmentTrackingNumber_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternFlightNumber typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternFlightNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternFlightNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternFlightNumber").orElseThrow() }
private val NSPasteboardDetectionPatternFlightNumber_VH: VarHandle by lazy { NSPasteboardDetectionPatternFlightNumber_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternFlightNumber: MemorySegment
    get() = NSPasteboardDetectionPatternFlightNumber_VH.get(NSPasteboardDetectionPatternFlightNumber_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternFlightNumber_VH.set(NSPasteboardDetectionPatternFlightNumber_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardDetectionPatternMoneyAmount typedef const NSPasteboardDetectionPattern = (Void)*
 */
private val NSPasteboardDetectionPatternMoneyAmount_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardDetectionPatternMoneyAmount_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardDetectionPatternMoneyAmount").orElseThrow() }
private val NSPasteboardDetectionPatternMoneyAmount_VH: VarHandle by lazy { NSPasteboardDetectionPatternMoneyAmount_LAYOUT.varHandle() }

var NSPasteboardDetectionPatternMoneyAmount: MemorySegment
    get() = NSPasteboardDetectionPatternMoneyAmount_VH.get(NSPasteboardDetectionPatternMoneyAmount_SEGMENT) as MemorySegment
    set(value) = NSPasteboardDetectionPatternMoneyAmount_VH.set(NSPasteboardDetectionPatternMoneyAmount_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardMetadataTypeContentType typedef const NSPasteboardMetadataType = (Void)*
 */
private val NSPasteboardMetadataTypeContentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardMetadataTypeContentType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardMetadataTypeContentType").orElseThrow() }
private val NSPasteboardMetadataTypeContentType_VH: VarHandle by lazy { NSPasteboardMetadataTypeContentType_LAYOUT.varHandle() }

var NSPasteboardMetadataTypeContentType: MemorySegment
    get() = NSPasteboardMetadataTypeContentType_VH.get(NSPasteboardMetadataTypeContentType_SEGMENT) as MemorySegment
    set(value) = NSPasteboardMetadataTypeContentType_VH.set(NSPasteboardMetadataTypeContentType_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardURLReadingFileURLsOnlyKey typedef const NSPasteboardReadingOptionKey = (Void)*
 */
private val NSPasteboardURLReadingFileURLsOnlyKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardURLReadingFileURLsOnlyKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardURLReadingFileURLsOnlyKey").orElseThrow() }
private val NSPasteboardURLReadingFileURLsOnlyKey_VH: VarHandle by lazy { NSPasteboardURLReadingFileURLsOnlyKey_LAYOUT.varHandle() }

var NSPasteboardURLReadingFileURLsOnlyKey: MemorySegment
    get() = NSPasteboardURLReadingFileURLsOnlyKey_VH.get(NSPasteboardURLReadingFileURLsOnlyKey_SEGMENT) as MemorySegment
    set(value) = NSPasteboardURLReadingFileURLsOnlyKey_VH.set(NSPasteboardURLReadingFileURLsOnlyKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardURLReadingContentsConformToTypesKey typedef const NSPasteboardReadingOptionKey = (Void)*
 */
private val NSPasteboardURLReadingContentsConformToTypesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardURLReadingContentsConformToTypesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardURLReadingContentsConformToTypesKey").orElseThrow() }
private val NSPasteboardURLReadingContentsConformToTypesKey_VH: VarHandle by lazy { NSPasteboardURLReadingContentsConformToTypesKey_LAYOUT.varHandle() }

var NSPasteboardURLReadingContentsConformToTypesKey: MemorySegment
    get() = NSPasteboardURLReadingContentsConformToTypesKey_VH.get(NSPasteboardURLReadingContentsConformToTypesKey_SEGMENT) as MemorySegment
    set(value) = NSPasteboardURLReadingContentsConformToTypesKey_VH.set(NSPasteboardURLReadingContentsConformToTypesKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSFileContentsPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSFileContentsPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileContentsPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileContentsPboardType").orElseThrow() }
private val NSFileContentsPboardType_VH: VarHandle by lazy { NSFileContentsPboardType_LAYOUT.varHandle() }

var NSFileContentsPboardType: MemorySegment
    get() = NSFileContentsPboardType_VH.get(NSFileContentsPboardType_SEGMENT) as MemorySegment
    set(value) = NSFileContentsPboardType_VH.set(NSFileContentsPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSCreateFilenamePboardType typedef NSPasteboardType = typedef NSString = (Void)*(typedef NSString = (Void)*)
 */
private val NSCreateFilenamePboardType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSCreateFilenamePboardType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSCreateFilenamePboardType").orElseThrow()
private val NSCreateFilenamePboardType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSCreateFilenamePboardType_ADDR, NSCreateFilenamePboardType_DESC)

fun NSCreateFilenamePboardType(arg0: MemorySegment): MemorySegment {
    try {
        return NSCreateFilenamePboardType_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCreateFileContentsPboardType typedef NSPasteboardType = typedef NSString = (Void)*(typedef NSString = (Void)*)
 */
private val NSCreateFileContentsPboardType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSCreateFileContentsPboardType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSCreateFileContentsPboardType").orElseThrow()
private val NSCreateFileContentsPboardType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSCreateFileContentsPboardType_ADDR, NSCreateFileContentsPboardType_DESC)

fun NSCreateFileContentsPboardType(arg0: MemorySegment): MemorySegment {
    try {
        return NSCreateFileContentsPboardType_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSGetFileType typedef NSString = (Void)*(typedef NSPasteboardType = typedef NSString = (Void)*)
 */
private val NSGetFileType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSGetFileType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSGetFileType").orElseThrow()
private val NSGetFileType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSGetFileType_ADDR, NSGetFileType_DESC)

fun NSGetFileType(arg0: MemorySegment): MemorySegment {
    try {
        return NSGetFileType_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSGetFileTypes (Void)*((Void)*)
 */
private val NSGetFileTypes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSGetFileTypes_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSGetFileTypes").orElseThrow()
private val NSGetFileTypes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSGetFileTypes_ADDR, NSGetFileTypes_DESC)

fun NSGetFileTypes(arg0: MemorySegment): MemorySegment {
    try {
        return NSGetFileTypes_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSStringPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSStringPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringPboardType").orElseThrow() }
private val NSStringPboardType_VH: VarHandle by lazy { NSStringPboardType_LAYOUT.varHandle() }

var NSStringPboardType: MemorySegment
    get() = NSStringPboardType_VH.get(NSStringPboardType_SEGMENT) as MemorySegment
    set(value) = NSStringPboardType_VH.set(NSStringPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSFilenamesPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSFilenamesPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFilenamesPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFilenamesPboardType").orElseThrow() }
private val NSFilenamesPboardType_VH: VarHandle by lazy { NSFilenamesPboardType_LAYOUT.varHandle() }

var NSFilenamesPboardType: MemorySegment
    get() = NSFilenamesPboardType_VH.get(NSFilenamesPboardType_SEGMENT) as MemorySegment
    set(value) = NSFilenamesPboardType_VH.set(NSFilenamesPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSTIFFPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSTIFFPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTIFFPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTIFFPboardType").orElseThrow() }
private val NSTIFFPboardType_VH: VarHandle by lazy { NSTIFFPboardType_LAYOUT.varHandle() }

var NSTIFFPboardType: MemorySegment
    get() = NSTIFFPboardType_VH.get(NSTIFFPboardType_SEGMENT) as MemorySegment
    set(value) = NSTIFFPboardType_VH.set(NSTIFFPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSRTFPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSRTFPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRTFPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRTFPboardType").orElseThrow() }
private val NSRTFPboardType_VH: VarHandle by lazy { NSRTFPboardType_LAYOUT.varHandle() }

var NSRTFPboardType: MemorySegment
    get() = NSRTFPboardType_VH.get(NSRTFPboardType_SEGMENT) as MemorySegment
    set(value) = NSRTFPboardType_VH.set(NSRTFPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSTabularTextPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSTabularTextPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTabularTextPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTabularTextPboardType").orElseThrow() }
private val NSTabularTextPboardType_VH: VarHandle by lazy { NSTabularTextPboardType_LAYOUT.varHandle() }

var NSTabularTextPboardType: MemorySegment
    get() = NSTabularTextPboardType_VH.get(NSTabularTextPboardType_SEGMENT) as MemorySegment
    set(value) = NSTabularTextPboardType_VH.set(NSTabularTextPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSFontPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontPboardType").orElseThrow() }
private val NSFontPboardType_VH: VarHandle by lazy { NSFontPboardType_LAYOUT.varHandle() }

var NSFontPboardType: MemorySegment
    get() = NSFontPboardType_VH.get(NSFontPboardType_SEGMENT) as MemorySegment
    set(value) = NSFontPboardType_VH.set(NSFontPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSRulerPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSRulerPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRulerPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRulerPboardType").orElseThrow() }
private val NSRulerPboardType_VH: VarHandle by lazy { NSRulerPboardType_LAYOUT.varHandle() }

var NSRulerPboardType: MemorySegment
    get() = NSRulerPboardType_VH.get(NSRulerPboardType_SEGMENT) as MemorySegment
    set(value) = NSRulerPboardType_VH.set(NSRulerPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSColorPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSColorPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSColorPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSColorPboardType").orElseThrow() }
private val NSColorPboardType_VH: VarHandle by lazy { NSColorPboardType_LAYOUT.varHandle() }

var NSColorPboardType: MemorySegment
    get() = NSColorPboardType_VH.get(NSColorPboardType_SEGMENT) as MemorySegment
    set(value) = NSColorPboardType_VH.set(NSColorPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSRTFDPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSRTFDPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRTFDPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRTFDPboardType").orElseThrow() }
private val NSRTFDPboardType_VH: VarHandle by lazy { NSRTFDPboardType_LAYOUT.varHandle() }

var NSRTFDPboardType: MemorySegment
    get() = NSRTFDPboardType_VH.get(NSRTFDPboardType_SEGMENT) as MemorySegment
    set(value) = NSRTFDPboardType_VH.set(NSRTFDPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSHTMLPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSHTMLPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTMLPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTMLPboardType").orElseThrow() }
private val NSHTMLPboardType_VH: VarHandle by lazy { NSHTMLPboardType_LAYOUT.varHandle() }

var NSHTMLPboardType: MemorySegment
    get() = NSHTMLPboardType_VH.get(NSHTMLPboardType_SEGMENT) as MemorySegment
    set(value) = NSHTMLPboardType_VH.set(NSHTMLPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSURLPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSURLPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLPboardType").orElseThrow() }
private val NSURLPboardType_VH: VarHandle by lazy { NSURLPboardType_LAYOUT.varHandle() }

var NSURLPboardType: MemorySegment
    get() = NSURLPboardType_VH.get(NSURLPboardType_SEGMENT) as MemorySegment
    set(value) = NSURLPboardType_VH.set(NSURLPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSPDFPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSPDFPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPDFPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPDFPboardType").orElseThrow() }
private val NSPDFPboardType_VH: VarHandle by lazy { NSPDFPboardType_LAYOUT.varHandle() }

var NSPDFPboardType: MemorySegment
    get() = NSPDFPboardType_VH.get(NSPDFPboardType_SEGMENT) as MemorySegment
    set(value) = NSPDFPboardType_VH.set(NSPDFPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSMultipleTextSelectionPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSMultipleTextSelectionPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMultipleTextSelectionPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMultipleTextSelectionPboardType").orElseThrow() }
private val NSMultipleTextSelectionPboardType_VH: VarHandle by lazy { NSMultipleTextSelectionPboardType_LAYOUT.varHandle() }

var NSMultipleTextSelectionPboardType: MemorySegment
    get() = NSMultipleTextSelectionPboardType_VH.get(NSMultipleTextSelectionPboardType_SEGMENT) as MemorySegment
    set(value) = NSMultipleTextSelectionPboardType_VH.set(NSMultipleTextSelectionPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSPostScriptPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSPostScriptPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPostScriptPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPostScriptPboardType").orElseThrow() }
private val NSPostScriptPboardType_VH: VarHandle by lazy { NSPostScriptPboardType_LAYOUT.varHandle() }

var NSPostScriptPboardType: MemorySegment
    get() = NSPostScriptPboardType_VH.get(NSPostScriptPboardType_SEGMENT) as MemorySegment
    set(value) = NSPostScriptPboardType_VH.set(NSPostScriptPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSVCardPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSVCardPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVCardPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSVCardPboardType").orElseThrow() }
private val NSVCardPboardType_VH: VarHandle by lazy { NSVCardPboardType_LAYOUT.varHandle() }

var NSVCardPboardType: MemorySegment
    get() = NSVCardPboardType_VH.get(NSVCardPboardType_SEGMENT) as MemorySegment
    set(value) = NSVCardPboardType_VH.set(NSVCardPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSInkTextPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSInkTextPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInkTextPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInkTextPboardType").orElseThrow() }
private val NSInkTextPboardType_VH: VarHandle by lazy { NSInkTextPboardType_LAYOUT.varHandle() }

var NSInkTextPboardType: MemorySegment
    get() = NSInkTextPboardType_VH.get(NSInkTextPboardType_SEGMENT) as MemorySegment
    set(value) = NSInkTextPboardType_VH.set(NSInkTextPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSFilesPromisePboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSFilesPromisePboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFilesPromisePboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFilesPromisePboardType").orElseThrow() }
private val NSFilesPromisePboardType_VH: VarHandle by lazy { NSFilesPromisePboardType_LAYOUT.varHandle() }

var NSFilesPromisePboardType: MemorySegment
    get() = NSFilesPromisePboardType_VH.get(NSFilesPromisePboardType_SEGMENT) as MemorySegment
    set(value) = NSFilesPromisePboardType_VH.set(NSFilesPromisePboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardTypeFindPanelSearchOptions typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeFindPanelSearchOptions_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeFindPanelSearchOptions_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeFindPanelSearchOptions").orElseThrow() }
private val NSPasteboardTypeFindPanelSearchOptions_VH: VarHandle by lazy { NSPasteboardTypeFindPanelSearchOptions_LAYOUT.varHandle() }

var NSPasteboardTypeFindPanelSearchOptions: MemorySegment
    get() = NSPasteboardTypeFindPanelSearchOptions_VH.get(NSPasteboardTypeFindPanelSearchOptions_SEGMENT) as MemorySegment
    set(value) = NSPasteboardTypeFindPanelSearchOptions_VH.set(NSPasteboardTypeFindPanelSearchOptions_SEGMENT, value)

/**
 * {@snippet lang=c : NSGeneralPboard typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSGeneralPboard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGeneralPboard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGeneralPboard").orElseThrow() }
private val NSGeneralPboard_VH: VarHandle by lazy { NSGeneralPboard_LAYOUT.varHandle() }

var NSGeneralPboard: MemorySegment
    get() = NSGeneralPboard_VH.get(NSGeneralPboard_SEGMENT) as MemorySegment
    set(value) = NSGeneralPboard_VH.set(NSGeneralPboard_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontPboard typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSFontPboard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontPboard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontPboard").orElseThrow() }
private val NSFontPboard_VH: VarHandle by lazy { NSFontPboard_LAYOUT.varHandle() }

var NSFontPboard: MemorySegment
    get() = NSFontPboard_VH.get(NSFontPboard_SEGMENT) as MemorySegment
    set(value) = NSFontPboard_VH.set(NSFontPboard_SEGMENT, value)

/**
 * {@snippet lang=c : NSRulerPboard typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSRulerPboard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRulerPboard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRulerPboard").orElseThrow() }
private val NSRulerPboard_VH: VarHandle by lazy { NSRulerPboard_LAYOUT.varHandle() }

var NSRulerPboard: MemorySegment
    get() = NSRulerPboard_VH.get(NSRulerPboard_SEGMENT) as MemorySegment
    set(value) = NSRulerPboard_VH.set(NSRulerPboard_SEGMENT, value)

/**
 * {@snippet lang=c : NSFindPboard typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSFindPboard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFindPboard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFindPboard").orElseThrow() }
private val NSFindPboard_VH: VarHandle by lazy { NSFindPboard_LAYOUT.varHandle() }

var NSFindPboard: MemorySegment
    get() = NSFindPboard_VH.get(NSFindPboard_SEGMENT) as MemorySegment
    set(value) = NSFindPboard_VH.set(NSFindPboard_SEGMENT, value)

/**
 * {@snippet lang=c : NSDragPboard typedef NSPasteboardName = typedef NSString = (Void)*
 */
private val NSDragPboard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDragPboard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDragPboard").orElseThrow() }
private val NSDragPboard_VH: VarHandle by lazy { NSDragPboard_LAYOUT.varHandle() }

var NSDragPboard: MemorySegment
    get() = NSDragPboard_VH.get(NSDragPboard_SEGMENT) as MemorySegment
    set(value) = NSDragPboard_VH.set(NSDragPboard_SEGMENT, value)

/**
 * {@snippet lang=c : NSPICTPboardType typedef NSPasteboardType = typedef NSString = (Void)*
 */
private val NSPICTPboardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPICTPboardType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPICTPboardType").orElseThrow() }
private val NSPICTPboardType_VH: VarHandle by lazy { NSPICTPboardType_LAYOUT.varHandle() }

var NSPICTPboardType: MemorySegment
    get() = NSPICTPboardType_VH.get(NSPICTPboardType_SEGMENT) as MemorySegment
    set(value) = NSPICTPboardType_VH.set(NSPICTPboardType_SEGMENT, value)

/**
 * {@snippet lang=c : NSNibOwner typedef NSString = (Void)*
 */
private val NSNibOwner_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNibOwner_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNibOwner").orElseThrow() }
private val NSNibOwner_VH: VarHandle by lazy { NSNibOwner_LAYOUT.varHandle() }

var NSNibOwner: MemorySegment
    get() = NSNibOwner_VH.get(NSNibOwner_SEGMENT) as MemorySegment
    set(value) = NSNibOwner_VH.set(NSNibOwner_SEGMENT, value)

/**
 * {@snippet lang=c : NSNibTopLevelObjects typedef NSString = (Void)*
 */
private val NSNibTopLevelObjects_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNibTopLevelObjects_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNibTopLevelObjects").orElseThrow() }
private val NSNibTopLevelObjects_VH: VarHandle by lazy { NSNibTopLevelObjects_LAYOUT.varHandle() }

var NSNibTopLevelObjects: MemorySegment
    get() = NSNibTopLevelObjects_VH.get(NSNibTopLevelObjects_SEGMENT) as MemorySegment
    set(value) = NSNibTopLevelObjects_VH.set(NSNibTopLevelObjects_SEGMENT, value)

/**
 * {@snippet lang=c : NSAnimationProgressMarkNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSAnimationProgressMarkNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAnimationProgressMarkNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAnimationProgressMarkNotification").orElseThrow() }
private val NSAnimationProgressMarkNotification_VH: VarHandle by lazy { NSAnimationProgressMarkNotification_LAYOUT.varHandle() }

var NSAnimationProgressMarkNotification: MemorySegment
    get() = NSAnimationProgressMarkNotification_VH.get(NSAnimationProgressMarkNotification_SEGMENT) as MemorySegment
    set(value) = NSAnimationProgressMarkNotification_VH.set(NSAnimationProgressMarkNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSAnimationProgressMark typedef NSString = (Void)*
 */
private val NSAnimationProgressMark_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAnimationProgressMark_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAnimationProgressMark").orElseThrow() }
private val NSAnimationProgressMark_VH: VarHandle by lazy { NSAnimationProgressMark_LAYOUT.varHandle() }

var NSAnimationProgressMark: MemorySegment
    get() = NSAnimationProgressMark_VH.get(NSAnimationProgressMark_SEGMENT) as MemorySegment
    set(value) = NSAnimationProgressMark_VH.set(NSAnimationProgressMark_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewAnimationTargetKey typedef NSViewAnimationKey = typedef NSString = (Void)*
 */
private val NSViewAnimationTargetKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewAnimationTargetKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewAnimationTargetKey").orElseThrow() }
private val NSViewAnimationTargetKey_VH: VarHandle by lazy { NSViewAnimationTargetKey_LAYOUT.varHandle() }

var NSViewAnimationTargetKey: MemorySegment
    get() = NSViewAnimationTargetKey_VH.get(NSViewAnimationTargetKey_SEGMENT) as MemorySegment
    set(value) = NSViewAnimationTargetKey_VH.set(NSViewAnimationTargetKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewAnimationStartFrameKey typedef NSViewAnimationKey = typedef NSString = (Void)*
 */
private val NSViewAnimationStartFrameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewAnimationStartFrameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewAnimationStartFrameKey").orElseThrow() }
private val NSViewAnimationStartFrameKey_VH: VarHandle by lazy { NSViewAnimationStartFrameKey_LAYOUT.varHandle() }

var NSViewAnimationStartFrameKey: MemorySegment
    get() = NSViewAnimationStartFrameKey_VH.get(NSViewAnimationStartFrameKey_SEGMENT) as MemorySegment
    set(value) = NSViewAnimationStartFrameKey_VH.set(NSViewAnimationStartFrameKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewAnimationEndFrameKey typedef NSViewAnimationKey = typedef NSString = (Void)*
 */
private val NSViewAnimationEndFrameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewAnimationEndFrameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewAnimationEndFrameKey").orElseThrow() }
private val NSViewAnimationEndFrameKey_VH: VarHandle by lazy { NSViewAnimationEndFrameKey_LAYOUT.varHandle() }

var NSViewAnimationEndFrameKey: MemorySegment
    get() = NSViewAnimationEndFrameKey_VH.get(NSViewAnimationEndFrameKey_SEGMENT) as MemorySegment
    set(value) = NSViewAnimationEndFrameKey_VH.set(NSViewAnimationEndFrameKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewAnimationEffectKey typedef NSViewAnimationKey = typedef NSString = (Void)*
 */
private val NSViewAnimationEffectKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewAnimationEffectKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewAnimationEffectKey").orElseThrow() }
private val NSViewAnimationEffectKey_VH: VarHandle by lazy { NSViewAnimationEffectKey_LAYOUT.varHandle() }

var NSViewAnimationEffectKey: MemorySegment
    get() = NSViewAnimationEffectKey_VH.get(NSViewAnimationEffectKey_SEGMENT) as MemorySegment
    set(value) = NSViewAnimationEffectKey_VH.set(NSViewAnimationEffectKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewAnimationFadeInEffect typedef NSViewAnimationEffectName = typedef NSString = (Void)*
 */
private val NSViewAnimationFadeInEffect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewAnimationFadeInEffect_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewAnimationFadeInEffect").orElseThrow() }
private val NSViewAnimationFadeInEffect_VH: VarHandle by lazy { NSViewAnimationFadeInEffect_LAYOUT.varHandle() }

var NSViewAnimationFadeInEffect: MemorySegment
    get() = NSViewAnimationFadeInEffect_VH.get(NSViewAnimationFadeInEffect_SEGMENT) as MemorySegment
    set(value) = NSViewAnimationFadeInEffect_VH.set(NSViewAnimationFadeInEffect_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewAnimationFadeOutEffect typedef NSViewAnimationEffectName = typedef NSString = (Void)*
 */
private val NSViewAnimationFadeOutEffect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewAnimationFadeOutEffect_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewAnimationFadeOutEffect").orElseThrow() }
private val NSViewAnimationFadeOutEffect_VH: VarHandle by lazy { NSViewAnimationFadeOutEffect_LAYOUT.varHandle() }

var NSViewAnimationFadeOutEffect: MemorySegment
    get() = NSViewAnimationFadeOutEffect_VH.get(NSViewAnimationFadeOutEffect_SEGMENT) as MemorySegment
    set(value) = NSViewAnimationFadeOutEffect_VH.set(NSViewAnimationFadeOutEffect_SEGMENT, value)

/**
 * {@snippet lang=c : NSAnimationTriggerOrderIn typedef NSAnimatablePropertyKey = typedef NSString = (Void)*
 */
private val NSAnimationTriggerOrderIn_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAnimationTriggerOrderIn_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAnimationTriggerOrderIn").orElseThrow() }
private val NSAnimationTriggerOrderIn_VH: VarHandle by lazy { NSAnimationTriggerOrderIn_LAYOUT.varHandle() }

var NSAnimationTriggerOrderIn: MemorySegment
    get() = NSAnimationTriggerOrderIn_VH.get(NSAnimationTriggerOrderIn_SEGMENT) as MemorySegment
    set(value) = NSAnimationTriggerOrderIn_VH.set(NSAnimationTriggerOrderIn_SEGMENT, value)

/**
 * {@snippet lang=c : NSAnimationTriggerOrderOut typedef NSAnimatablePropertyKey = typedef NSString = (Void)*
 */
private val NSAnimationTriggerOrderOut_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAnimationTriggerOrderOut_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAnimationTriggerOrderOut").orElseThrow() }
private val NSAnimationTriggerOrderOut_VH: VarHandle by lazy { NSAnimationTriggerOrderOut_LAYOUT.varHandle() }

var NSAnimationTriggerOrderOut: MemorySegment
    get() = NSAnimationTriggerOrderOut_VH.get(NSAnimationTriggerOrderOut_SEGMENT) as MemorySegment
    set(value) = NSAnimationTriggerOrderOut_VH.set(NSAnimationTriggerOrderOut_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameAqua typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameAqua_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameAqua_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameAqua").orElseThrow() }
private val NSAppearanceNameAqua_VH: VarHandle by lazy { NSAppearanceNameAqua_LAYOUT.varHandle() }

var NSAppearanceNameAqua: MemorySegment
    get() = NSAppearanceNameAqua_VH.get(NSAppearanceNameAqua_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameAqua_VH.set(NSAppearanceNameAqua_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameDarkAqua typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameDarkAqua_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameDarkAqua_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameDarkAqua").orElseThrow() }
private val NSAppearanceNameDarkAqua_VH: VarHandle by lazy { NSAppearanceNameDarkAqua_LAYOUT.varHandle() }

var NSAppearanceNameDarkAqua: MemorySegment
    get() = NSAppearanceNameDarkAqua_VH.get(NSAppearanceNameDarkAqua_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameDarkAqua_VH.set(NSAppearanceNameDarkAqua_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameLightContent typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameLightContent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameLightContent_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameLightContent").orElseThrow() }
private val NSAppearanceNameLightContent_VH: VarHandle by lazy { NSAppearanceNameLightContent_LAYOUT.varHandle() }

var NSAppearanceNameLightContent: MemorySegment
    get() = NSAppearanceNameLightContent_VH.get(NSAppearanceNameLightContent_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameLightContent_VH.set(NSAppearanceNameLightContent_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameVibrantDark typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameVibrantDark_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameVibrantDark_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameVibrantDark").orElseThrow() }
private val NSAppearanceNameVibrantDark_VH: VarHandle by lazy { NSAppearanceNameVibrantDark_LAYOUT.varHandle() }

var NSAppearanceNameVibrantDark: MemorySegment
    get() = NSAppearanceNameVibrantDark_VH.get(NSAppearanceNameVibrantDark_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameVibrantDark_VH.set(NSAppearanceNameVibrantDark_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameVibrantLight typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameVibrantLight_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameVibrantLight_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameVibrantLight").orElseThrow() }
private val NSAppearanceNameVibrantLight_VH: VarHandle by lazy { NSAppearanceNameVibrantLight_LAYOUT.varHandle() }

var NSAppearanceNameVibrantLight: MemorySegment
    get() = NSAppearanceNameVibrantLight_VH.get(NSAppearanceNameVibrantLight_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameVibrantLight_VH.set(NSAppearanceNameVibrantLight_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameAccessibilityHighContrastAqua typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameAccessibilityHighContrastAqua_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameAccessibilityHighContrastAqua_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameAccessibilityHighContrastAqua").orElseThrow() }
private val NSAppearanceNameAccessibilityHighContrastAqua_VH: VarHandle by lazy { NSAppearanceNameAccessibilityHighContrastAqua_LAYOUT.varHandle() }

var NSAppearanceNameAccessibilityHighContrastAqua: MemorySegment
    get() = NSAppearanceNameAccessibilityHighContrastAqua_VH.get(NSAppearanceNameAccessibilityHighContrastAqua_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameAccessibilityHighContrastAqua_VH.set(NSAppearanceNameAccessibilityHighContrastAqua_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameAccessibilityHighContrastDarkAqua typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameAccessibilityHighContrastDarkAqua_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameAccessibilityHighContrastDarkAqua_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameAccessibilityHighContrastDarkAqua").orElseThrow() }
private val NSAppearanceNameAccessibilityHighContrastDarkAqua_VH: VarHandle by lazy { NSAppearanceNameAccessibilityHighContrastDarkAqua_LAYOUT.varHandle() }

var NSAppearanceNameAccessibilityHighContrastDarkAqua: MemorySegment
    get() = NSAppearanceNameAccessibilityHighContrastDarkAqua_VH.get(NSAppearanceNameAccessibilityHighContrastDarkAqua_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameAccessibilityHighContrastDarkAqua_VH.set(NSAppearanceNameAccessibilityHighContrastDarkAqua_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameAccessibilityHighContrastVibrantLight typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameAccessibilityHighContrastVibrantLight_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameAccessibilityHighContrastVibrantLight_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameAccessibilityHighContrastVibrantLight").orElseThrow() }
private val NSAppearanceNameAccessibilityHighContrastVibrantLight_VH: VarHandle by lazy { NSAppearanceNameAccessibilityHighContrastVibrantLight_LAYOUT.varHandle() }

var NSAppearanceNameAccessibilityHighContrastVibrantLight: MemorySegment
    get() = NSAppearanceNameAccessibilityHighContrastVibrantLight_VH.get(NSAppearanceNameAccessibilityHighContrastVibrantLight_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameAccessibilityHighContrastVibrantLight_VH.set(NSAppearanceNameAccessibilityHighContrastVibrantLight_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppearanceNameAccessibilityHighContrastVibrantDark typedef const NSAppearanceName = (Void)*
 */
private val NSAppearanceNameAccessibilityHighContrastVibrantDark_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppearanceNameAccessibilityHighContrastVibrantDark_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppearanceNameAccessibilityHighContrastVibrantDark").orElseThrow() }
private val NSAppearanceNameAccessibilityHighContrastVibrantDark_VH: VarHandle by lazy { NSAppearanceNameAccessibilityHighContrastVibrantDark_LAYOUT.varHandle() }

var NSAppearanceNameAccessibilityHighContrastVibrantDark: MemorySegment
    get() = NSAppearanceNameAccessibilityHighContrastVibrantDark_VH.get(NSAppearanceNameAccessibilityHighContrastVibrantDark_SEGMENT) as MemorySegment
    set(value) = NSAppearanceNameAccessibilityHighContrastVibrantDark_VH.set(NSAppearanceNameAccessibilityHighContrastVibrantDark_SEGMENT, value)

/**
 * {@snippet lang=c : NSFullScreenModeAllScreens typedef const NSViewFullScreenModeOptionKey = (Void)*
 */
private val NSFullScreenModeAllScreens_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFullScreenModeAllScreens_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFullScreenModeAllScreens").orElseThrow() }
private val NSFullScreenModeAllScreens_VH: VarHandle by lazy { NSFullScreenModeAllScreens_LAYOUT.varHandle() }

var NSFullScreenModeAllScreens: MemorySegment
    get() = NSFullScreenModeAllScreens_VH.get(NSFullScreenModeAllScreens_SEGMENT) as MemorySegment
    set(value) = NSFullScreenModeAllScreens_VH.set(NSFullScreenModeAllScreens_SEGMENT, value)

/**
 * {@snippet lang=c : NSFullScreenModeSetting typedef const NSViewFullScreenModeOptionKey = (Void)*
 */
private val NSFullScreenModeSetting_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFullScreenModeSetting_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFullScreenModeSetting").orElseThrow() }
private val NSFullScreenModeSetting_VH: VarHandle by lazy { NSFullScreenModeSetting_LAYOUT.varHandle() }

var NSFullScreenModeSetting: MemorySegment
    get() = NSFullScreenModeSetting_VH.get(NSFullScreenModeSetting_SEGMENT) as MemorySegment
    set(value) = NSFullScreenModeSetting_VH.set(NSFullScreenModeSetting_SEGMENT, value)

/**
 * {@snippet lang=c : NSFullScreenModeWindowLevel typedef const NSViewFullScreenModeOptionKey = (Void)*
 */
private val NSFullScreenModeWindowLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFullScreenModeWindowLevel_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFullScreenModeWindowLevel").orElseThrow() }
private val NSFullScreenModeWindowLevel_VH: VarHandle by lazy { NSFullScreenModeWindowLevel_LAYOUT.varHandle() }

var NSFullScreenModeWindowLevel: MemorySegment
    get() = NSFullScreenModeWindowLevel_VH.get(NSFullScreenModeWindowLevel_SEGMENT) as MemorySegment
    set(value) = NSFullScreenModeWindowLevel_VH.set(NSFullScreenModeWindowLevel_SEGMENT, value)

/**
 * {@snippet lang=c : NSFullScreenModeApplicationPresentationOptions typedef const NSViewFullScreenModeOptionKey = (Void)*
 */
private val NSFullScreenModeApplicationPresentationOptions_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFullScreenModeApplicationPresentationOptions_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFullScreenModeApplicationPresentationOptions").orElseThrow() }
private val NSFullScreenModeApplicationPresentationOptions_VH: VarHandle by lazy { NSFullScreenModeApplicationPresentationOptions_LAYOUT.varHandle() }

var NSFullScreenModeApplicationPresentationOptions: MemorySegment
    get() = NSFullScreenModeApplicationPresentationOptions_VH.get(NSFullScreenModeApplicationPresentationOptions_SEGMENT) as MemorySegment
    set(value) = NSFullScreenModeApplicationPresentationOptions_VH.set(NSFullScreenModeApplicationPresentationOptions_SEGMENT, value)

/**
 * {@snippet lang=c : NSDefinitionPresentationTypeKey typedef const NSDefinitionOptionKey = (Void)*
 */
private val NSDefinitionPresentationTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDefinitionPresentationTypeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDefinitionPresentationTypeKey").orElseThrow() }
private val NSDefinitionPresentationTypeKey_VH: VarHandle by lazy { NSDefinitionPresentationTypeKey_LAYOUT.varHandle() }

var NSDefinitionPresentationTypeKey: MemorySegment
    get() = NSDefinitionPresentationTypeKey_VH.get(NSDefinitionPresentationTypeKey_SEGMENT) as MemorySegment
    set(value) = NSDefinitionPresentationTypeKey_VH.set(NSDefinitionPresentationTypeKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSDefinitionPresentationTypeOverlay typedef const NSDefinitionPresentationType = (Void)*
 */
private val NSDefinitionPresentationTypeOverlay_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDefinitionPresentationTypeOverlay_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDefinitionPresentationTypeOverlay").orElseThrow() }
private val NSDefinitionPresentationTypeOverlay_VH: VarHandle by lazy { NSDefinitionPresentationTypeOverlay_LAYOUT.varHandle() }

var NSDefinitionPresentationTypeOverlay: MemorySegment
    get() = NSDefinitionPresentationTypeOverlay_VH.get(NSDefinitionPresentationTypeOverlay_SEGMENT) as MemorySegment
    set(value) = NSDefinitionPresentationTypeOverlay_VH.set(NSDefinitionPresentationTypeOverlay_SEGMENT, value)

/**
 * {@snippet lang=c : NSDefinitionPresentationTypeDictionaryApplication typedef const NSDefinitionPresentationType = (Void)*
 */
private val NSDefinitionPresentationTypeDictionaryApplication_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDefinitionPresentationTypeDictionaryApplication_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDefinitionPresentationTypeDictionaryApplication").orElseThrow() }
private val NSDefinitionPresentationTypeDictionaryApplication_VH: VarHandle by lazy { NSDefinitionPresentationTypeDictionaryApplication_LAYOUT.varHandle() }

var NSDefinitionPresentationTypeDictionaryApplication: MemorySegment
    get() = NSDefinitionPresentationTypeDictionaryApplication_VH.get(NSDefinitionPresentationTypeDictionaryApplication_SEGMENT) as MemorySegment
    set(value) = NSDefinitionPresentationTypeDictionaryApplication_VH.set(NSDefinitionPresentationTypeDictionaryApplication_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewFrameDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSViewFrameDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewFrameDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewFrameDidChangeNotification").orElseThrow() }
private val NSViewFrameDidChangeNotification_VH: VarHandle by lazy { NSViewFrameDidChangeNotification_LAYOUT.varHandle() }

var NSViewFrameDidChangeNotification: MemorySegment
    get() = NSViewFrameDidChangeNotification_VH.get(NSViewFrameDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSViewFrameDidChangeNotification_VH.set(NSViewFrameDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewFocusDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSViewFocusDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewFocusDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewFocusDidChangeNotification").orElseThrow() }
private val NSViewFocusDidChangeNotification_VH: VarHandle by lazy { NSViewFocusDidChangeNotification_LAYOUT.varHandle() }

var NSViewFocusDidChangeNotification: MemorySegment
    get() = NSViewFocusDidChangeNotification_VH.get(NSViewFocusDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSViewFocusDidChangeNotification_VH.set(NSViewFocusDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewBoundsDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSViewBoundsDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewBoundsDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewBoundsDidChangeNotification").orElseThrow() }
private val NSViewBoundsDidChangeNotification_VH: VarHandle by lazy { NSViewBoundsDidChangeNotification_LAYOUT.varHandle() }

var NSViewBoundsDidChangeNotification: MemorySegment
    get() = NSViewBoundsDidChangeNotification_VH.get(NSViewBoundsDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSViewBoundsDidChangeNotification_VH.set(NSViewBoundsDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewGlobalFrameDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSViewGlobalFrameDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewGlobalFrameDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewGlobalFrameDidChangeNotification").orElseThrow() }
private val NSViewGlobalFrameDidChangeNotification_VH: VarHandle by lazy { NSViewGlobalFrameDidChangeNotification_LAYOUT.varHandle() }

var NSViewGlobalFrameDidChangeNotification: MemorySegment
    get() = NSViewGlobalFrameDidChangeNotification_VH.get(NSViewGlobalFrameDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSViewGlobalFrameDidChangeNotification_VH.set(NSViewGlobalFrameDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSViewDidUpdateTrackingAreasNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSViewDidUpdateTrackingAreasNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewDidUpdateTrackingAreasNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSViewDidUpdateTrackingAreasNotification").orElseThrow() }
private val NSViewDidUpdateTrackingAreasNotification_VH: VarHandle by lazy { NSViewDidUpdateTrackingAreasNotification_LAYOUT.varHandle() }

var NSViewDidUpdateTrackingAreasNotification: MemorySegment
    get() = NSViewDidUpdateTrackingAreasNotification_VH.get(NSViewDidUpdateTrackingAreasNotification_SEGMENT) as MemorySegment
    set(value) = NSViewDidUpdateTrackingAreasNotification_VH.set(NSViewDidUpdateTrackingAreasNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextDidBeginEditingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextDidBeginEditingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextDidBeginEditingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextDidBeginEditingNotification").orElseThrow() }
private val NSTextDidBeginEditingNotification_VH: VarHandle by lazy { NSTextDidBeginEditingNotification_LAYOUT.varHandle() }

var NSTextDidBeginEditingNotification: MemorySegment
    get() = NSTextDidBeginEditingNotification_VH.get(NSTextDidBeginEditingNotification_SEGMENT) as MemorySegment
    set(value) = NSTextDidBeginEditingNotification_VH.set(NSTextDidBeginEditingNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextDidEndEditingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextDidEndEditingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextDidEndEditingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextDidEndEditingNotification").orElseThrow() }
private val NSTextDidEndEditingNotification_VH: VarHandle by lazy { NSTextDidEndEditingNotification_LAYOUT.varHandle() }

var NSTextDidEndEditingNotification: MemorySegment
    get() = NSTextDidEndEditingNotification_VH.get(NSTextDidEndEditingNotification_SEGMENT) as MemorySegment
    set(value) = NSTextDidEndEditingNotification_VH.set(NSTextDidEndEditingNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSTextDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextDidChangeNotification").orElseThrow() }
private val NSTextDidChangeNotification_VH: VarHandle by lazy { NSTextDidChangeNotification_LAYOUT.varHandle() }

var NSTextDidChangeNotification: MemorySegment
    get() = NSTextDidChangeNotification_VH.get(NSTextDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSTextDidChangeNotification_VH.set(NSTextDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextMovementUserInfoKey (Void)*
 */
private val NSTextMovementUserInfoKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextMovementUserInfoKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextMovementUserInfoKey").orElseThrow() }
private val NSTextMovementUserInfoKey_VH: VarHandle by lazy { NSTextMovementUserInfoKey_LAYOUT.varHandle() }

var NSTextMovementUserInfoKey: MemorySegment
    get() = NSTextMovementUserInfoKey_VH.get(NSTextMovementUserInfoKey_SEGMENT) as MemorySegment
    set(value) = NSTextMovementUserInfoKey_VH.set(NSTextMovementUserInfoKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSTabColumnTerminatorsAttributeName typedef NSTextTabOptionKey = typedef NSString = (Void)*
 */
private val NSTabColumnTerminatorsAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTabColumnTerminatorsAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTabColumnTerminatorsAttributeName").orElseThrow() }
private val NSTabColumnTerminatorsAttributeName_VH: VarHandle by lazy { NSTabColumnTerminatorsAttributeName_LAYOUT.varHandle() }

var NSTabColumnTerminatorsAttributeName: MemorySegment
    get() = NSTabColumnTerminatorsAttributeName_VH.get(NSTabColumnTerminatorsAttributeName_SEGMENT) as MemorySegment
    set(value) = NSTabColumnTerminatorsAttributeName_VH.set(NSTabColumnTerminatorsAttributeName_SEGMENT, value)

/**
 * {@snippet lang=c : NSDrawThreePartImage Void(typedef NSRect = Declared(CGRect),typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef BOOL = Bool,typedef NSCompositingOperation = Declared(NSCompositingOperation),typedef CGFloat = Double,typedef BOOL = Bool)
 */
private val NSDrawThreePartImage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_BOOLEAN)
private val NSDrawThreePartImage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSDrawThreePartImage").orElseThrow()
private val NSDrawThreePartImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSDrawThreePartImage_ADDR, NSDrawThreePartImage_DESC)

fun NSDrawThreePartImage(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: Boolean, arg5: NSCompositingOperation, arg6: Double, arg7: Boolean): Unit {
    try {
        NSDrawThreePartImage_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5.rawValue, arg6, arg7)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSDrawThreePartImage(arg0: NSRect, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: Boolean, arg5: NSCompositingOperation, arg6: Double, arg7: Boolean): Unit {
    NSDrawThreePartImage(arg0.segment, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
}

/**
 * {@snippet lang=c : NSDrawNinePartImage Void(typedef NSRect = Declared(CGRect),typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSImage = (Void)*,typedef NSCompositingOperation = Declared(NSCompositingOperation),typedef CGFloat = Double,typedef BOOL = Bool)
 */
private val NSDrawNinePartImage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_BOOLEAN)
private val NSDrawNinePartImage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSDrawNinePartImage").orElseThrow()
private val NSDrawNinePartImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSDrawNinePartImage_ADDR, NSDrawNinePartImage_DESC)

fun NSDrawNinePartImage(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment, arg10: NSCompositingOperation, arg11: Double, arg12: Boolean): Unit {
    try {
        NSDrawNinePartImage_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10.rawValue, arg11, arg12)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSDrawNinePartImage(arg0: NSRect, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment, arg10: NSCompositingOperation, arg11: Double, arg12: Boolean): Unit {
    NSDrawNinePartImage(arg0.segment, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)
}

/**
 * {@snippet lang=c : NSControlTintDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSControlTintDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSControlTintDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSControlTintDidChangeNotification").orElseThrow() }
private val NSControlTintDidChangeNotification_VH: VarHandle by lazy { NSControlTintDidChangeNotification_LAYOUT.varHandle() }

var NSControlTintDidChangeNotification: MemorySegment
    get() = NSControlTintDidChangeNotification_VH.get(NSControlTintDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSControlTintDidChangeNotification_VH.set(NSControlTintDidChangeNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSMenuItemImportFromDeviceIdentifier typedef const NSUserInterfaceItemIdentifier = (Void)*
 */
private val NSMenuItemImportFromDeviceIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMenuItemImportFromDeviceIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMenuItemImportFromDeviceIdentifier").orElseThrow() }
private val NSMenuItemImportFromDeviceIdentifier_VH: VarHandle by lazy { NSMenuItemImportFromDeviceIdentifier_LAYOUT.varHandle() }

var NSMenuItemImportFromDeviceIdentifier: MemorySegment
    get() = NSMenuItemImportFromDeviceIdentifier_VH.get(NSMenuItemImportFromDeviceIdentifier_SEGMENT) as MemorySegment
    set(value) = NSMenuItemImportFromDeviceIdentifier_VH.set(NSMenuItemImportFromDeviceIdentifier_SEGMENT, value)

/**
 * {@snippet lang=c : NSMenuWillSendActionNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSMenuWillSendActionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMenuWillSendActionNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMenuWillSendActionNotification").orElseThrow() }
private val NSMenuWillSendActionNotification_VH: VarHandle by lazy { NSMenuWillSendActionNotification_LAYOUT.varHandle() }

var NSMenuWillSendActionNotification: MemorySegment
    get() = NSMenuWillSendActionNotification_VH.get(NSMenuWillSendActionNotification_SEGMENT) as MemorySegment
    set(value) = NSMenuWillSendActionNotification_VH.set(NSMenuWillSendActionNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSMenuDidSendActionNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSMenuDidSendActionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMenuDidSendActionNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMenuDidSendActionNotification").orElseThrow() }
private val NSMenuDidSendActionNotification_VH: VarHandle by lazy { NSMenuDidSendActionNotification_LAYOUT.varHandle() }

var NSMenuDidSendActionNotification: MemorySegment
    get() = NSMenuDidSendActionNotification_VH.get(NSMenuDidSendActionNotification_SEGMENT) as MemorySegment
    set(value) = NSMenuDidSendActionNotification_VH.set(NSMenuDidSendActionNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSMenuDidAddItemNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSMenuDidAddItemNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMenuDidAddItemNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMenuDidAddItemNotification").orElseThrow() }
private val NSMenuDidAddItemNotification_VH: VarHandle by lazy { NSMenuDidAddItemNotification_LAYOUT.varHandle() }

var NSMenuDidAddItemNotification: MemorySegment
    get() = NSMenuDidAddItemNotification_VH.get(NSMenuDidAddItemNotification_SEGMENT) as MemorySegment
    set(value) = NSMenuDidAddItemNotification_VH.set(NSMenuDidAddItemNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSMenuDidRemoveItemNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSMenuDidRemoveItemNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMenuDidRemoveItemNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMenuDidRemoveItemNotification").orElseThrow() }
private val NSMenuDidRemoveItemNotification_VH: VarHandle by lazy { NSMenuDidRemoveItemNotification_LAYOUT.varHandle() }

var NSMenuDidRemoveItemNotification: MemorySegment
    get() = NSMenuDidRemoveItemNotification_VH.get(NSMenuDidRemoveItemNotification_SEGMENT) as MemorySegment
    set(value) = NSMenuDidRemoveItemNotification_VH.set(NSMenuDidRemoveItemNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSMenuDidChangeItemNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSMenuDidChangeItemNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMenuDidChangeItemNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMenuDidChangeItemNotification").orElseThrow() }
private val NSMenuDidChangeItemNotification_VH: VarHandle by lazy { NSMenuDidChangeItemNotification_LAYOUT.varHandle() }

var NSMenuDidChangeItemNotification: MemorySegment
    get() = NSMenuDidChangeItemNotification_VH.get(NSMenuDidChangeItemNotification_SEGMENT) as MemorySegment
    set(value) = NSMenuDidChangeItemNotification_VH.set(NSMenuDidChangeItemNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSMenuDidBeginTrackingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSMenuDidBeginTrackingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMenuDidBeginTrackingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMenuDidBeginTrackingNotification").orElseThrow() }
private val NSMenuDidBeginTrackingNotification_VH: VarHandle by lazy { NSMenuDidBeginTrackingNotification_LAYOUT.varHandle() }

var NSMenuDidBeginTrackingNotification: MemorySegment
    get() = NSMenuDidBeginTrackingNotification_VH.get(NSMenuDidBeginTrackingNotification_SEGMENT) as MemorySegment
    set(value) = NSMenuDidBeginTrackingNotification_VH.set(NSMenuDidBeginTrackingNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSMenuDidEndTrackingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSMenuDidEndTrackingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMenuDidEndTrackingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMenuDidEndTrackingNotification").orElseThrow() }
private val NSMenuDidEndTrackingNotification_VH: VarHandle by lazy { NSMenuDidEndTrackingNotification_LAYOUT.varHandle() }

var NSMenuDidEndTrackingNotification: MemorySegment
    get() = NSMenuDidEndTrackingNotification_VH.get(NSMenuDidEndTrackingNotification_SEGMENT) as MemorySegment
    set(value) = NSMenuDidEndTrackingNotification_VH.set(NSMenuDidEndTrackingNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPaperName typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintPaperName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPaperName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPaperName").orElseThrow() }
private val NSPrintPaperName_VH: VarHandle by lazy { NSPrintPaperName_LAYOUT.varHandle() }

var NSPrintPaperName: MemorySegment
    get() = NSPrintPaperName_VH.get(NSPrintPaperName_SEGMENT) as MemorySegment
    set(value) = NSPrintPaperName_VH.set(NSPrintPaperName_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPaperSize typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintPaperSize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPaperSize_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPaperSize").orElseThrow() }
private val NSPrintPaperSize_VH: VarHandle by lazy { NSPrintPaperSize_LAYOUT.varHandle() }

var NSPrintPaperSize: MemorySegment
    get() = NSPrintPaperSize_VH.get(NSPrintPaperSize_SEGMENT) as MemorySegment
    set(value) = NSPrintPaperSize_VH.set(NSPrintPaperSize_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintOrientation typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintOrientation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintOrientation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintOrientation").orElseThrow() }
private val NSPrintOrientation_VH: VarHandle by lazy { NSPrintOrientation_LAYOUT.varHandle() }

var NSPrintOrientation: MemorySegment
    get() = NSPrintOrientation_VH.get(NSPrintOrientation_SEGMENT) as MemorySegment
    set(value) = NSPrintOrientation_VH.set(NSPrintOrientation_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintScalingFactor typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintScalingFactor_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintScalingFactor_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintScalingFactor").orElseThrow() }
private val NSPrintScalingFactor_VH: VarHandle by lazy { NSPrintScalingFactor_LAYOUT.varHandle() }

var NSPrintScalingFactor: MemorySegment
    get() = NSPrintScalingFactor_VH.get(NSPrintScalingFactor_SEGMENT) as MemorySegment
    set(value) = NSPrintScalingFactor_VH.set(NSPrintScalingFactor_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintLeftMargin typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintLeftMargin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintLeftMargin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintLeftMargin").orElseThrow() }
private val NSPrintLeftMargin_VH: VarHandle by lazy { NSPrintLeftMargin_LAYOUT.varHandle() }

var NSPrintLeftMargin: MemorySegment
    get() = NSPrintLeftMargin_VH.get(NSPrintLeftMargin_SEGMENT) as MemorySegment
    set(value) = NSPrintLeftMargin_VH.set(NSPrintLeftMargin_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintRightMargin typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintRightMargin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintRightMargin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintRightMargin").orElseThrow() }
private val NSPrintRightMargin_VH: VarHandle by lazy { NSPrintRightMargin_LAYOUT.varHandle() }

var NSPrintRightMargin: MemorySegment
    get() = NSPrintRightMargin_VH.get(NSPrintRightMargin_SEGMENT) as MemorySegment
    set(value) = NSPrintRightMargin_VH.set(NSPrintRightMargin_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintTopMargin typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintTopMargin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintTopMargin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintTopMargin").orElseThrow() }
private val NSPrintTopMargin_VH: VarHandle by lazy { NSPrintTopMargin_LAYOUT.varHandle() }

var NSPrintTopMargin: MemorySegment
    get() = NSPrintTopMargin_VH.get(NSPrintTopMargin_SEGMENT) as MemorySegment
    set(value) = NSPrintTopMargin_VH.set(NSPrintTopMargin_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintBottomMargin typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintBottomMargin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintBottomMargin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintBottomMargin").orElseThrow() }
private val NSPrintBottomMargin_VH: VarHandle by lazy { NSPrintBottomMargin_LAYOUT.varHandle() }

var NSPrintBottomMargin: MemorySegment
    get() = NSPrintBottomMargin_VH.get(NSPrintBottomMargin_SEGMENT) as MemorySegment
    set(value) = NSPrintBottomMargin_VH.set(NSPrintBottomMargin_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintHorizontallyCentered typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintHorizontallyCentered_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintHorizontallyCentered_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintHorizontallyCentered").orElseThrow() }
private val NSPrintHorizontallyCentered_VH: VarHandle by lazy { NSPrintHorizontallyCentered_LAYOUT.varHandle() }

var NSPrintHorizontallyCentered: MemorySegment
    get() = NSPrintHorizontallyCentered_VH.get(NSPrintHorizontallyCentered_SEGMENT) as MemorySegment
    set(value) = NSPrintHorizontallyCentered_VH.set(NSPrintHorizontallyCentered_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintVerticallyCentered typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintVerticallyCentered_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintVerticallyCentered_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintVerticallyCentered").orElseThrow() }
private val NSPrintVerticallyCentered_VH: VarHandle by lazy { NSPrintVerticallyCentered_LAYOUT.varHandle() }

var NSPrintVerticallyCentered: MemorySegment
    get() = NSPrintVerticallyCentered_VH.get(NSPrintVerticallyCentered_SEGMENT) as MemorySegment
    set(value) = NSPrintVerticallyCentered_VH.set(NSPrintVerticallyCentered_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintHorizontalPagination typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintHorizontalPagination_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintHorizontalPagination_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintHorizontalPagination").orElseThrow() }
private val NSPrintHorizontalPagination_VH: VarHandle by lazy { NSPrintHorizontalPagination_LAYOUT.varHandle() }

var NSPrintHorizontalPagination: MemorySegment
    get() = NSPrintHorizontalPagination_VH.get(NSPrintHorizontalPagination_SEGMENT) as MemorySegment
    set(value) = NSPrintHorizontalPagination_VH.set(NSPrintHorizontalPagination_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintVerticalPagination typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintVerticalPagination_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintVerticalPagination_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintVerticalPagination").orElseThrow() }
private val NSPrintVerticalPagination_VH: VarHandle by lazy { NSPrintVerticalPagination_LAYOUT.varHandle() }

var NSPrintVerticalPagination: MemorySegment
    get() = NSPrintVerticalPagination_VH.get(NSPrintVerticalPagination_SEGMENT) as MemorySegment
    set(value) = NSPrintVerticalPagination_VH.set(NSPrintVerticalPagination_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPrinter typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintPrinter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPrinter_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPrinter").orElseThrow() }
private val NSPrintPrinter_VH: VarHandle by lazy { NSPrintPrinter_LAYOUT.varHandle() }

var NSPrintPrinter: MemorySegment
    get() = NSPrintPrinter_VH.get(NSPrintPrinter_SEGMENT) as MemorySegment
    set(value) = NSPrintPrinter_VH.set(NSPrintPrinter_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintCopies typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintCopies_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintCopies_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintCopies").orElseThrow() }
private val NSPrintCopies_VH: VarHandle by lazy { NSPrintCopies_LAYOUT.varHandle() }

var NSPrintCopies: MemorySegment
    get() = NSPrintCopies_VH.get(NSPrintCopies_SEGMENT) as MemorySegment
    set(value) = NSPrintCopies_VH.set(NSPrintCopies_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintAllPages typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintAllPages_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintAllPages_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintAllPages").orElseThrow() }
private val NSPrintAllPages_VH: VarHandle by lazy { NSPrintAllPages_LAYOUT.varHandle() }

var NSPrintAllPages: MemorySegment
    get() = NSPrintAllPages_VH.get(NSPrintAllPages_SEGMENT) as MemorySegment
    set(value) = NSPrintAllPages_VH.set(NSPrintAllPages_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintFirstPage typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintFirstPage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintFirstPage_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintFirstPage").orElseThrow() }
private val NSPrintFirstPage_VH: VarHandle by lazy { NSPrintFirstPage_LAYOUT.varHandle() }

var NSPrintFirstPage: MemorySegment
    get() = NSPrintFirstPage_VH.get(NSPrintFirstPage_SEGMENT) as MemorySegment
    set(value) = NSPrintFirstPage_VH.set(NSPrintFirstPage_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintLastPage typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintLastPage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintLastPage_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintLastPage").orElseThrow() }
private val NSPrintLastPage_VH: VarHandle by lazy { NSPrintLastPage_LAYOUT.varHandle() }

var NSPrintLastPage: MemorySegment
    get() = NSPrintLastPage_VH.get(NSPrintLastPage_SEGMENT) as MemorySegment
    set(value) = NSPrintLastPage_VH.set(NSPrintLastPage_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintMustCollate typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintMustCollate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintMustCollate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintMustCollate").orElseThrow() }
private val NSPrintMustCollate_VH: VarHandle by lazy { NSPrintMustCollate_LAYOUT.varHandle() }

var NSPrintMustCollate: MemorySegment
    get() = NSPrintMustCollate_VH.get(NSPrintMustCollate_SEGMENT) as MemorySegment
    set(value) = NSPrintMustCollate_VH.set(NSPrintMustCollate_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintReversePageOrder typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintReversePageOrder_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintReversePageOrder_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintReversePageOrder").orElseThrow() }
private val NSPrintReversePageOrder_VH: VarHandle by lazy { NSPrintReversePageOrder_LAYOUT.varHandle() }

var NSPrintReversePageOrder: MemorySegment
    get() = NSPrintReversePageOrder_VH.get(NSPrintReversePageOrder_SEGMENT) as MemorySegment
    set(value) = NSPrintReversePageOrder_VH.set(NSPrintReversePageOrder_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintJobDisposition typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintJobDisposition_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintJobDisposition_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintJobDisposition").orElseThrow() }
private val NSPrintJobDisposition_VH: VarHandle by lazy { NSPrintJobDisposition_LAYOUT.varHandle() }

var NSPrintJobDisposition: MemorySegment
    get() = NSPrintJobDisposition_VH.get(NSPrintJobDisposition_SEGMENT) as MemorySegment
    set(value) = NSPrintJobDisposition_VH.set(NSPrintJobDisposition_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPagesAcross typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintPagesAcross_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPagesAcross_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPagesAcross").orElseThrow() }
private val NSPrintPagesAcross_VH: VarHandle by lazy { NSPrintPagesAcross_LAYOUT.varHandle() }

var NSPrintPagesAcross: MemorySegment
    get() = NSPrintPagesAcross_VH.get(NSPrintPagesAcross_SEGMENT) as MemorySegment
    set(value) = NSPrintPagesAcross_VH.set(NSPrintPagesAcross_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPagesDown typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintPagesDown_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPagesDown_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPagesDown").orElseThrow() }
private val NSPrintPagesDown_VH: VarHandle by lazy { NSPrintPagesDown_LAYOUT.varHandle() }

var NSPrintPagesDown: MemorySegment
    get() = NSPrintPagesDown_VH.get(NSPrintPagesDown_SEGMENT) as MemorySegment
    set(value) = NSPrintPagesDown_VH.set(NSPrintPagesDown_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintTime typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintTime_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintTime_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintTime").orElseThrow() }
private val NSPrintTime_VH: VarHandle by lazy { NSPrintTime_LAYOUT.varHandle() }

var NSPrintTime: MemorySegment
    get() = NSPrintTime_VH.get(NSPrintTime_SEGMENT) as MemorySegment
    set(value) = NSPrintTime_VH.set(NSPrintTime_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintDetailedErrorReporting typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintDetailedErrorReporting_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintDetailedErrorReporting_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintDetailedErrorReporting").orElseThrow() }
private val NSPrintDetailedErrorReporting_VH: VarHandle by lazy { NSPrintDetailedErrorReporting_LAYOUT.varHandle() }

var NSPrintDetailedErrorReporting: MemorySegment
    get() = NSPrintDetailedErrorReporting_VH.get(NSPrintDetailedErrorReporting_SEGMENT) as MemorySegment
    set(value) = NSPrintDetailedErrorReporting_VH.set(NSPrintDetailedErrorReporting_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintFaxNumber typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintFaxNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintFaxNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintFaxNumber").orElseThrow() }
private val NSPrintFaxNumber_VH: VarHandle by lazy { NSPrintFaxNumber_LAYOUT.varHandle() }

var NSPrintFaxNumber: MemorySegment
    get() = NSPrintFaxNumber_VH.get(NSPrintFaxNumber_SEGMENT) as MemorySegment
    set(value) = NSPrintFaxNumber_VH.set(NSPrintFaxNumber_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPrinterName typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintPrinterName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPrinterName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPrinterName").orElseThrow() }
private val NSPrintPrinterName_VH: VarHandle by lazy { NSPrintPrinterName_LAYOUT.varHandle() }

var NSPrintPrinterName: MemorySegment
    get() = NSPrintPrinterName_VH.get(NSPrintPrinterName_SEGMENT) as MemorySegment
    set(value) = NSPrintPrinterName_VH.set(NSPrintPrinterName_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintSelectionOnly typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintSelectionOnly_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintSelectionOnly_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintSelectionOnly").orElseThrow() }
private val NSPrintSelectionOnly_VH: VarHandle by lazy { NSPrintSelectionOnly_LAYOUT.varHandle() }

var NSPrintSelectionOnly: MemorySegment
    get() = NSPrintSelectionOnly_VH.get(NSPrintSelectionOnly_SEGMENT) as MemorySegment
    set(value) = NSPrintSelectionOnly_VH.set(NSPrintSelectionOnly_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintJobSavingURL typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintJobSavingURL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintJobSavingURL_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintJobSavingURL").orElseThrow() }
private val NSPrintJobSavingURL_VH: VarHandle by lazy { NSPrintJobSavingURL_LAYOUT.varHandle() }

var NSPrintJobSavingURL: MemorySegment
    get() = NSPrintJobSavingURL_VH.get(NSPrintJobSavingURL_SEGMENT) as MemorySegment
    set(value) = NSPrintJobSavingURL_VH.set(NSPrintJobSavingURL_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintJobSavingFileNameExtensionHidden typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintJobSavingFileNameExtensionHidden_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintJobSavingFileNameExtensionHidden_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintJobSavingFileNameExtensionHidden").orElseThrow() }
private val NSPrintJobSavingFileNameExtensionHidden_VH: VarHandle by lazy { NSPrintJobSavingFileNameExtensionHidden_LAYOUT.varHandle() }

var NSPrintJobSavingFileNameExtensionHidden: MemorySegment
    get() = NSPrintJobSavingFileNameExtensionHidden_VH.get(NSPrintJobSavingFileNameExtensionHidden_SEGMENT) as MemorySegment
    set(value) = NSPrintJobSavingFileNameExtensionHidden_VH.set(NSPrintJobSavingFileNameExtensionHidden_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintHeaderAndFooter typedef const NSPrintInfoAttributeKey = (Void)*
 */
private val NSPrintHeaderAndFooter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintHeaderAndFooter_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintHeaderAndFooter").orElseThrow() }
private val NSPrintHeaderAndFooter_VH: VarHandle by lazy { NSPrintHeaderAndFooter_LAYOUT.varHandle() }

var NSPrintHeaderAndFooter: MemorySegment
    get() = NSPrintHeaderAndFooter_VH.get(NSPrintHeaderAndFooter_SEGMENT) as MemorySegment
    set(value) = NSPrintHeaderAndFooter_VH.set(NSPrintHeaderAndFooter_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintSpoolJob typedef const NSPrintJobDispositionValue = (Void)*
 */
private val NSPrintSpoolJob_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintSpoolJob_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintSpoolJob").orElseThrow() }
private val NSPrintSpoolJob_VH: VarHandle by lazy { NSPrintSpoolJob_LAYOUT.varHandle() }

var NSPrintSpoolJob: MemorySegment
    get() = NSPrintSpoolJob_VH.get(NSPrintSpoolJob_SEGMENT) as MemorySegment
    set(value) = NSPrintSpoolJob_VH.set(NSPrintSpoolJob_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPreviewJob typedef const NSPrintJobDispositionValue = (Void)*
 */
private val NSPrintPreviewJob_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPreviewJob_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPreviewJob").orElseThrow() }
private val NSPrintPreviewJob_VH: VarHandle by lazy { NSPrintPreviewJob_LAYOUT.varHandle() }

var NSPrintPreviewJob: MemorySegment
    get() = NSPrintPreviewJob_VH.get(NSPrintPreviewJob_SEGMENT) as MemorySegment
    set(value) = NSPrintPreviewJob_VH.set(NSPrintPreviewJob_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintSaveJob typedef const NSPrintJobDispositionValue = (Void)*
 */
private val NSPrintSaveJob_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintSaveJob_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintSaveJob").orElseThrow() }
private val NSPrintSaveJob_VH: VarHandle by lazy { NSPrintSaveJob_LAYOUT.varHandle() }

var NSPrintSaveJob: MemorySegment
    get() = NSPrintSaveJob_VH.get(NSPrintSaveJob_SEGMENT) as MemorySegment
    set(value) = NSPrintSaveJob_VH.set(NSPrintSaveJob_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintCancelJob typedef const NSPrintJobDispositionValue = (Void)*
 */
private val NSPrintCancelJob_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintCancelJob_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintCancelJob").orElseThrow() }
private val NSPrintCancelJob_VH: VarHandle by lazy { NSPrintCancelJob_LAYOUT.varHandle() }

var NSPrintCancelJob: MemorySegment
    get() = NSPrintCancelJob_VH.get(NSPrintCancelJob_SEGMENT) as MemorySegment
    set(value) = NSPrintCancelJob_VH.set(NSPrintCancelJob_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintFormName (Void)*
 */
private val NSPrintFormName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintFormName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintFormName").orElseThrow() }
private val NSPrintFormName_VH: VarHandle by lazy { NSPrintFormName_LAYOUT.varHandle() }

var NSPrintFormName: MemorySegment
    get() = NSPrintFormName_VH.get(NSPrintFormName_SEGMENT) as MemorySegment
    set(value) = NSPrintFormName_VH.set(NSPrintFormName_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintJobFeatures (Void)*
 */
private val NSPrintJobFeatures_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintJobFeatures_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintJobFeatures").orElseThrow() }
private val NSPrintJobFeatures_VH: VarHandle by lazy { NSPrintJobFeatures_LAYOUT.varHandle() }

var NSPrintJobFeatures: MemorySegment
    get() = NSPrintJobFeatures_VH.get(NSPrintJobFeatures_SEGMENT) as MemorySegment
    set(value) = NSPrintJobFeatures_VH.set(NSPrintJobFeatures_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintManualFeed (Void)*
 */
private val NSPrintManualFeed_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintManualFeed_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintManualFeed").orElseThrow() }
private val NSPrintManualFeed_VH: VarHandle by lazy { NSPrintManualFeed_LAYOUT.varHandle() }

var NSPrintManualFeed: MemorySegment
    get() = NSPrintManualFeed_VH.get(NSPrintManualFeed_SEGMENT) as MemorySegment
    set(value) = NSPrintManualFeed_VH.set(NSPrintManualFeed_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPagesPerSheet (Void)*
 */
private val NSPrintPagesPerSheet_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPagesPerSheet_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPagesPerSheet").orElseThrow() }
private val NSPrintPagesPerSheet_VH: VarHandle by lazy { NSPrintPagesPerSheet_LAYOUT.varHandle() }

var NSPrintPagesPerSheet: MemorySegment
    get() = NSPrintPagesPerSheet_VH.get(NSPrintPagesPerSheet_SEGMENT) as MemorySegment
    set(value) = NSPrintPagesPerSheet_VH.set(NSPrintPagesPerSheet_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPaperFeed (Void)*
 */
private val NSPrintPaperFeed_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPaperFeed_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPaperFeed").orElseThrow() }
private val NSPrintPaperFeed_VH: VarHandle by lazy { NSPrintPaperFeed_LAYOUT.varHandle() }

var NSPrintPaperFeed: MemorySegment
    get() = NSPrintPaperFeed_VH.get(NSPrintPaperFeed_SEGMENT) as MemorySegment
    set(value) = NSPrintPaperFeed_VH.set(NSPrintPaperFeed_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintSavePath (Void)*
 */
private val NSPrintSavePath_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintSavePath_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintSavePath").orElseThrow() }
private val NSPrintSavePath_VH: VarHandle by lazy { NSPrintSavePath_LAYOUT.varHandle() }

var NSPrintSavePath: MemorySegment
    get() = NSPrintSavePath_VH.get(NSPrintSavePath_SEGMENT) as MemorySegment
    set(value) = NSPrintSavePath_VH.set(NSPrintSavePath_SEGMENT, value)

/**
 * {@snippet lang=c : NSMultipleValuesMarker typedef id = (Void)*
 */
private val NSMultipleValuesMarker_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMultipleValuesMarker_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMultipleValuesMarker").orElseThrow() }
private val NSMultipleValuesMarker_VH: VarHandle by lazy { NSMultipleValuesMarker_LAYOUT.varHandle() }

var NSMultipleValuesMarker: MemorySegment
    get() = NSMultipleValuesMarker_VH.get(NSMultipleValuesMarker_SEGMENT) as MemorySegment
    set(value) = NSMultipleValuesMarker_VH.set(NSMultipleValuesMarker_SEGMENT, value)

/**
 * {@snippet lang=c : NSNoSelectionMarker typedef id = (Void)*
 */
private val NSNoSelectionMarker_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNoSelectionMarker_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNoSelectionMarker").orElseThrow() }
private val NSNoSelectionMarker_VH: VarHandle by lazy { NSNoSelectionMarker_LAYOUT.varHandle() }

var NSNoSelectionMarker: MemorySegment
    get() = NSNoSelectionMarker_VH.get(NSNoSelectionMarker_SEGMENT) as MemorySegment
    set(value) = NSNoSelectionMarker_VH.set(NSNoSelectionMarker_SEGMENT, value)

/**
 * {@snippet lang=c : NSNotApplicableMarker typedef id = (Void)*
 */
private val NSNotApplicableMarker_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNotApplicableMarker_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNotApplicableMarker").orElseThrow() }
private val NSNotApplicableMarker_VH: VarHandle by lazy { NSNotApplicableMarker_LAYOUT.varHandle() }

var NSNotApplicableMarker: MemorySegment
    get() = NSNotApplicableMarker_VH.get(NSNotApplicableMarker_SEGMENT) as MemorySegment
    set(value) = NSNotApplicableMarker_VH.set(NSNotApplicableMarker_SEGMENT, value)

/**
 * {@snippet lang=c : NSIsControllerMarker typedef BOOL = Bool(typedef id = (Void)*)
 */
private val NSIsControllerMarker_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val NSIsControllerMarker_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSIsControllerMarker").orElseThrow()
private val NSIsControllerMarker_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSIsControllerMarker_ADDR, NSIsControllerMarker_DESC)

fun NSIsControllerMarker(arg0: MemorySegment): Boolean {
    try {
        return NSIsControllerMarker_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSObservedObjectKey typedef NSBindingInfoKey = typedef NSString = (Void)*
 */
private val NSObservedObjectKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSObservedObjectKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSObservedObjectKey").orElseThrow() }
private val NSObservedObjectKey_VH: VarHandle by lazy { NSObservedObjectKey_LAYOUT.varHandle() }

var NSObservedObjectKey: MemorySegment
    get() = NSObservedObjectKey_VH.get(NSObservedObjectKey_SEGMENT) as MemorySegment
    set(value) = NSObservedObjectKey_VH.set(NSObservedObjectKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSObservedKeyPathKey typedef NSBindingInfoKey = typedef NSString = (Void)*
 */
private val NSObservedKeyPathKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSObservedKeyPathKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSObservedKeyPathKey").orElseThrow() }
private val NSObservedKeyPathKey_VH: VarHandle by lazy { NSObservedKeyPathKey_LAYOUT.varHandle() }

var NSObservedKeyPathKey: MemorySegment
    get() = NSObservedKeyPathKey_VH.get(NSObservedKeyPathKey_SEGMENT) as MemorySegment
    set(value) = NSObservedKeyPathKey_VH.set(NSObservedKeyPathKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSOptionsKey typedef NSBindingInfoKey = typedef NSString = (Void)*
 */
private val NSOptionsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOptionsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOptionsKey").orElseThrow() }
private val NSOptionsKey_VH: VarHandle by lazy { NSOptionsKey_LAYOUT.varHandle() }

var NSOptionsKey: MemorySegment
    get() = NSOptionsKey_VH.get(NSOptionsKey_SEGMENT) as MemorySegment
    set(value) = NSOptionsKey_VH.set(NSOptionsKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSAlignmentBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSAlignmentBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAlignmentBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAlignmentBinding").orElseThrow() }
private val NSAlignmentBinding_VH: VarHandle by lazy { NSAlignmentBinding_LAYOUT.varHandle() }

var NSAlignmentBinding: MemorySegment
    get() = NSAlignmentBinding_VH.get(NSAlignmentBinding_SEGMENT) as MemorySegment
    set(value) = NSAlignmentBinding_VH.set(NSAlignmentBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSAlternateImageBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSAlternateImageBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAlternateImageBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAlternateImageBinding").orElseThrow() }
private val NSAlternateImageBinding_VH: VarHandle by lazy { NSAlternateImageBinding_LAYOUT.varHandle() }

var NSAlternateImageBinding: MemorySegment
    get() = NSAlternateImageBinding_VH.get(NSAlternateImageBinding_SEGMENT) as MemorySegment
    set(value) = NSAlternateImageBinding_VH.set(NSAlternateImageBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSAlternateTitleBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSAlternateTitleBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAlternateTitleBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAlternateTitleBinding").orElseThrow() }
private val NSAlternateTitleBinding_VH: VarHandle by lazy { NSAlternateTitleBinding_LAYOUT.varHandle() }

var NSAlternateTitleBinding: MemorySegment
    get() = NSAlternateTitleBinding_VH.get(NSAlternateTitleBinding_SEGMENT) as MemorySegment
    set(value) = NSAlternateTitleBinding_VH.set(NSAlternateTitleBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSAnimateBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSAnimateBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAnimateBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAnimateBinding").orElseThrow() }
private val NSAnimateBinding_VH: VarHandle by lazy { NSAnimateBinding_LAYOUT.varHandle() }

var NSAnimateBinding: MemorySegment
    get() = NSAnimateBinding_VH.get(NSAnimateBinding_SEGMENT) as MemorySegment
    set(value) = NSAnimateBinding_VH.set(NSAnimateBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSAnimationDelayBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSAnimationDelayBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAnimationDelayBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAnimationDelayBinding").orElseThrow() }
private val NSAnimationDelayBinding_VH: VarHandle by lazy { NSAnimationDelayBinding_LAYOUT.varHandle() }

var NSAnimationDelayBinding: MemorySegment
    get() = NSAnimationDelayBinding_VH.get(NSAnimationDelayBinding_SEGMENT) as MemorySegment
    set(value) = NSAnimationDelayBinding_VH.set(NSAnimationDelayBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSArgumentBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSArgumentBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSArgumentBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSArgumentBinding").orElseThrow() }
private val NSArgumentBinding_VH: VarHandle by lazy { NSArgumentBinding_LAYOUT.varHandle() }

var NSArgumentBinding: MemorySegment
    get() = NSArgumentBinding_VH.get(NSArgumentBinding_SEGMENT) as MemorySegment
    set(value) = NSArgumentBinding_VH.set(NSArgumentBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSAttributedStringBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSAttributedStringBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAttributedStringBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAttributedStringBinding").orElseThrow() }
private val NSAttributedStringBinding_VH: VarHandle by lazy { NSAttributedStringBinding_LAYOUT.varHandle() }

var NSAttributedStringBinding: MemorySegment
    get() = NSAttributedStringBinding_VH.get(NSAttributedStringBinding_SEGMENT) as MemorySegment
    set(value) = NSAttributedStringBinding_VH.set(NSAttributedStringBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentArrayBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentArrayBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentArrayBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentArrayBinding").orElseThrow() }
private val NSContentArrayBinding_VH: VarHandle by lazy { NSContentArrayBinding_LAYOUT.varHandle() }

var NSContentArrayBinding: MemorySegment
    get() = NSContentArrayBinding_VH.get(NSContentArrayBinding_SEGMENT) as MemorySegment
    set(value) = NSContentArrayBinding_VH.set(NSContentArrayBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentArrayForMultipleSelectionBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentArrayForMultipleSelectionBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentArrayForMultipleSelectionBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentArrayForMultipleSelectionBinding").orElseThrow() }
private val NSContentArrayForMultipleSelectionBinding_VH: VarHandle by lazy { NSContentArrayForMultipleSelectionBinding_LAYOUT.varHandle() }

var NSContentArrayForMultipleSelectionBinding: MemorySegment
    get() = NSContentArrayForMultipleSelectionBinding_VH.get(NSContentArrayForMultipleSelectionBinding_SEGMENT) as MemorySegment
    set(value) = NSContentArrayForMultipleSelectionBinding_VH.set(NSContentArrayForMultipleSelectionBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentBinding").orElseThrow() }
private val NSContentBinding_VH: VarHandle by lazy { NSContentBinding_LAYOUT.varHandle() }

var NSContentBinding: MemorySegment
    get() = NSContentBinding_VH.get(NSContentBinding_SEGMENT) as MemorySegment
    set(value) = NSContentBinding_VH.set(NSContentBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentDictionaryBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentDictionaryBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentDictionaryBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentDictionaryBinding").orElseThrow() }
private val NSContentDictionaryBinding_VH: VarHandle by lazy { NSContentDictionaryBinding_LAYOUT.varHandle() }

var NSContentDictionaryBinding: MemorySegment
    get() = NSContentDictionaryBinding_VH.get(NSContentDictionaryBinding_SEGMENT) as MemorySegment
    set(value) = NSContentDictionaryBinding_VH.set(NSContentDictionaryBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentHeightBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentHeightBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentHeightBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentHeightBinding").orElseThrow() }
private val NSContentHeightBinding_VH: VarHandle by lazy { NSContentHeightBinding_LAYOUT.varHandle() }

var NSContentHeightBinding: MemorySegment
    get() = NSContentHeightBinding_VH.get(NSContentHeightBinding_SEGMENT) as MemorySegment
    set(value) = NSContentHeightBinding_VH.set(NSContentHeightBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentObjectBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentObjectBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentObjectBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentObjectBinding").orElseThrow() }
private val NSContentObjectBinding_VH: VarHandle by lazy { NSContentObjectBinding_LAYOUT.varHandle() }

var NSContentObjectBinding: MemorySegment
    get() = NSContentObjectBinding_VH.get(NSContentObjectBinding_SEGMENT) as MemorySegment
    set(value) = NSContentObjectBinding_VH.set(NSContentObjectBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentObjectsBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentObjectsBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentObjectsBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentObjectsBinding").orElseThrow() }
private val NSContentObjectsBinding_VH: VarHandle by lazy { NSContentObjectsBinding_LAYOUT.varHandle() }

var NSContentObjectsBinding: MemorySegment
    get() = NSContentObjectsBinding_VH.get(NSContentObjectsBinding_SEGMENT) as MemorySegment
    set(value) = NSContentObjectsBinding_VH.set(NSContentObjectsBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentSetBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentSetBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentSetBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentSetBinding").orElseThrow() }
private val NSContentSetBinding_VH: VarHandle by lazy { NSContentSetBinding_LAYOUT.varHandle() }

var NSContentSetBinding: MemorySegment
    get() = NSContentSetBinding_VH.get(NSContentSetBinding_SEGMENT) as MemorySegment
    set(value) = NSContentSetBinding_VH.set(NSContentSetBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentValuesBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentValuesBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentValuesBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentValuesBinding").orElseThrow() }
private val NSContentValuesBinding_VH: VarHandle by lazy { NSContentValuesBinding_LAYOUT.varHandle() }

var NSContentValuesBinding: MemorySegment
    get() = NSContentValuesBinding_VH.get(NSContentValuesBinding_SEGMENT) as MemorySegment
    set(value) = NSContentValuesBinding_VH.set(NSContentValuesBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentWidthBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSContentWidthBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentWidthBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentWidthBinding").orElseThrow() }
private val NSContentWidthBinding_VH: VarHandle by lazy { NSContentWidthBinding_LAYOUT.varHandle() }

var NSContentWidthBinding: MemorySegment
    get() = NSContentWidthBinding_VH.get(NSContentWidthBinding_SEGMENT) as MemorySegment
    set(value) = NSContentWidthBinding_VH.set(NSContentWidthBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSCriticalValueBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSCriticalValueBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCriticalValueBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCriticalValueBinding").orElseThrow() }
private val NSCriticalValueBinding_VH: VarHandle by lazy { NSCriticalValueBinding_LAYOUT.varHandle() }

var NSCriticalValueBinding: MemorySegment
    get() = NSCriticalValueBinding_VH.get(NSCriticalValueBinding_SEGMENT) as MemorySegment
    set(value) = NSCriticalValueBinding_VH.set(NSCriticalValueBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSDataBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSDataBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDataBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDataBinding").orElseThrow() }
private val NSDataBinding_VH: VarHandle by lazy { NSDataBinding_LAYOUT.varHandle() }

var NSDataBinding: MemorySegment
    get() = NSDataBinding_VH.get(NSDataBinding_SEGMENT) as MemorySegment
    set(value) = NSDataBinding_VH.set(NSDataBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSDisplayPatternTitleBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSDisplayPatternTitleBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDisplayPatternTitleBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDisplayPatternTitleBinding").orElseThrow() }
private val NSDisplayPatternTitleBinding_VH: VarHandle by lazy { NSDisplayPatternTitleBinding_LAYOUT.varHandle() }

var NSDisplayPatternTitleBinding: MemorySegment
    get() = NSDisplayPatternTitleBinding_VH.get(NSDisplayPatternTitleBinding_SEGMENT) as MemorySegment
    set(value) = NSDisplayPatternTitleBinding_VH.set(NSDisplayPatternTitleBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSDisplayPatternValueBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSDisplayPatternValueBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDisplayPatternValueBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDisplayPatternValueBinding").orElseThrow() }
private val NSDisplayPatternValueBinding_VH: VarHandle by lazy { NSDisplayPatternValueBinding_LAYOUT.varHandle() }

var NSDisplayPatternValueBinding: MemorySegment
    get() = NSDisplayPatternValueBinding_VH.get(NSDisplayPatternValueBinding_SEGMENT) as MemorySegment
    set(value) = NSDisplayPatternValueBinding_VH.set(NSDisplayPatternValueBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSDocumentEditedBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSDocumentEditedBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDocumentEditedBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDocumentEditedBinding").orElseThrow() }
private val NSDocumentEditedBinding_VH: VarHandle by lazy { NSDocumentEditedBinding_LAYOUT.varHandle() }

var NSDocumentEditedBinding: MemorySegment
    get() = NSDocumentEditedBinding_VH.get(NSDocumentEditedBinding_SEGMENT) as MemorySegment
    set(value) = NSDocumentEditedBinding_VH.set(NSDocumentEditedBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSDoubleClickArgumentBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSDoubleClickArgumentBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDoubleClickArgumentBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDoubleClickArgumentBinding").orElseThrow() }
private val NSDoubleClickArgumentBinding_VH: VarHandle by lazy { NSDoubleClickArgumentBinding_LAYOUT.varHandle() }

var NSDoubleClickArgumentBinding: MemorySegment
    get() = NSDoubleClickArgumentBinding_VH.get(NSDoubleClickArgumentBinding_SEGMENT) as MemorySegment
    set(value) = NSDoubleClickArgumentBinding_VH.set(NSDoubleClickArgumentBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSDoubleClickTargetBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSDoubleClickTargetBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDoubleClickTargetBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDoubleClickTargetBinding").orElseThrow() }
private val NSDoubleClickTargetBinding_VH: VarHandle by lazy { NSDoubleClickTargetBinding_LAYOUT.varHandle() }

var NSDoubleClickTargetBinding: MemorySegment
    get() = NSDoubleClickTargetBinding_VH.get(NSDoubleClickTargetBinding_SEGMENT) as MemorySegment
    set(value) = NSDoubleClickTargetBinding_VH.set(NSDoubleClickTargetBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSEditableBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSEditableBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSEditableBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEditableBinding").orElseThrow() }
private val NSEditableBinding_VH: VarHandle by lazy { NSEditableBinding_LAYOUT.varHandle() }

var NSEditableBinding: MemorySegment
    get() = NSEditableBinding_VH.get(NSEditableBinding_SEGMENT) as MemorySegment
    set(value) = NSEditableBinding_VH.set(NSEditableBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSEnabledBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSEnabledBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSEnabledBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEnabledBinding").orElseThrow() }
private val NSEnabledBinding_VH: VarHandle by lazy { NSEnabledBinding_LAYOUT.varHandle() }

var NSEnabledBinding: MemorySegment
    get() = NSEnabledBinding_VH.get(NSEnabledBinding_SEGMENT) as MemorySegment
    set(value) = NSEnabledBinding_VH.set(NSEnabledBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSExcludedKeysBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSExcludedKeysBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExcludedKeysBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSExcludedKeysBinding").orElseThrow() }
private val NSExcludedKeysBinding_VH: VarHandle by lazy { NSExcludedKeysBinding_LAYOUT.varHandle() }

var NSExcludedKeysBinding: MemorySegment
    get() = NSExcludedKeysBinding_VH.get(NSExcludedKeysBinding_SEGMENT) as MemorySegment
    set(value) = NSExcludedKeysBinding_VH.set(NSExcludedKeysBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSFilterPredicateBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSFilterPredicateBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFilterPredicateBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFilterPredicateBinding").orElseThrow() }
private val NSFilterPredicateBinding_VH: VarHandle by lazy { NSFilterPredicateBinding_LAYOUT.varHandle() }

var NSFilterPredicateBinding: MemorySegment
    get() = NSFilterPredicateBinding_VH.get(NSFilterPredicateBinding_SEGMENT) as MemorySegment
    set(value) = NSFilterPredicateBinding_VH.set(NSFilterPredicateBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSFontBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontBinding").orElseThrow() }
private val NSFontBinding_VH: VarHandle by lazy { NSFontBinding_LAYOUT.varHandle() }

var NSFontBinding: MemorySegment
    get() = NSFontBinding_VH.get(NSFontBinding_SEGMENT) as MemorySegment
    set(value) = NSFontBinding_VH.set(NSFontBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontBoldBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSFontBoldBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontBoldBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontBoldBinding").orElseThrow() }
private val NSFontBoldBinding_VH: VarHandle by lazy { NSFontBoldBinding_LAYOUT.varHandle() }

var NSFontBoldBinding: MemorySegment
    get() = NSFontBoldBinding_VH.get(NSFontBoldBinding_SEGMENT) as MemorySegment
    set(value) = NSFontBoldBinding_VH.set(NSFontBoldBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontFamilyNameBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSFontFamilyNameBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontFamilyNameBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontFamilyNameBinding").orElseThrow() }
private val NSFontFamilyNameBinding_VH: VarHandle by lazy { NSFontFamilyNameBinding_LAYOUT.varHandle() }

var NSFontFamilyNameBinding: MemorySegment
    get() = NSFontFamilyNameBinding_VH.get(NSFontFamilyNameBinding_SEGMENT) as MemorySegment
    set(value) = NSFontFamilyNameBinding_VH.set(NSFontFamilyNameBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontItalicBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSFontItalicBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontItalicBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontItalicBinding").orElseThrow() }
private val NSFontItalicBinding_VH: VarHandle by lazy { NSFontItalicBinding_LAYOUT.varHandle() }

var NSFontItalicBinding: MemorySegment
    get() = NSFontItalicBinding_VH.get(NSFontItalicBinding_SEGMENT) as MemorySegment
    set(value) = NSFontItalicBinding_VH.set(NSFontItalicBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontNameBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSFontNameBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontNameBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontNameBinding").orElseThrow() }
private val NSFontNameBinding_VH: VarHandle by lazy { NSFontNameBinding_LAYOUT.varHandle() }

var NSFontNameBinding: MemorySegment
    get() = NSFontNameBinding_VH.get(NSFontNameBinding_SEGMENT) as MemorySegment
    set(value) = NSFontNameBinding_VH.set(NSFontNameBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontSizeBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSFontSizeBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontSizeBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontSizeBinding").orElseThrow() }
private val NSFontSizeBinding_VH: VarHandle by lazy { NSFontSizeBinding_LAYOUT.varHandle() }

var NSFontSizeBinding: MemorySegment
    get() = NSFontSizeBinding_VH.get(NSFontSizeBinding_SEGMENT) as MemorySegment
    set(value) = NSFontSizeBinding_VH.set(NSFontSizeBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSHeaderTitleBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSHeaderTitleBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHeaderTitleBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHeaderTitleBinding").orElseThrow() }
private val NSHeaderTitleBinding_VH: VarHandle by lazy { NSHeaderTitleBinding_LAYOUT.varHandle() }

var NSHeaderTitleBinding: MemorySegment
    get() = NSHeaderTitleBinding_VH.get(NSHeaderTitleBinding_SEGMENT) as MemorySegment
    set(value) = NSHeaderTitleBinding_VH.set(NSHeaderTitleBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSHiddenBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSHiddenBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHiddenBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHiddenBinding").orElseThrow() }
private val NSHiddenBinding_VH: VarHandle by lazy { NSHiddenBinding_LAYOUT.varHandle() }

var NSHiddenBinding: MemorySegment
    get() = NSHiddenBinding_VH.get(NSHiddenBinding_SEGMENT) as MemorySegment
    set(value) = NSHiddenBinding_VH.set(NSHiddenBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSImageBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageBinding").orElseThrow() }
private val NSImageBinding_VH: VarHandle by lazy { NSImageBinding_LAYOUT.varHandle() }

var NSImageBinding: MemorySegment
    get() = NSImageBinding_VH.get(NSImageBinding_SEGMENT) as MemorySegment
    set(value) = NSImageBinding_VH.set(NSImageBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSIncludedKeysBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSIncludedKeysBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSIncludedKeysBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIncludedKeysBinding").orElseThrow() }
private val NSIncludedKeysBinding_VH: VarHandle by lazy { NSIncludedKeysBinding_LAYOUT.varHandle() }

var NSIncludedKeysBinding: MemorySegment
    get() = NSIncludedKeysBinding_VH.get(NSIncludedKeysBinding_SEGMENT) as MemorySegment
    set(value) = NSIncludedKeysBinding_VH.set(NSIncludedKeysBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSInitialKeyBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSInitialKeyBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInitialKeyBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInitialKeyBinding").orElseThrow() }
private val NSInitialKeyBinding_VH: VarHandle by lazy { NSInitialKeyBinding_LAYOUT.varHandle() }

var NSInitialKeyBinding: MemorySegment
    get() = NSInitialKeyBinding_VH.get(NSInitialKeyBinding_SEGMENT) as MemorySegment
    set(value) = NSInitialKeyBinding_VH.set(NSInitialKeyBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSInitialValueBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSInitialValueBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInitialValueBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInitialValueBinding").orElseThrow() }
private val NSInitialValueBinding_VH: VarHandle by lazy { NSInitialValueBinding_LAYOUT.varHandle() }

var NSInitialValueBinding: MemorySegment
    get() = NSInitialValueBinding_VH.get(NSInitialValueBinding_SEGMENT) as MemorySegment
    set(value) = NSInitialValueBinding_VH.set(NSInitialValueBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSIsIndeterminateBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSIsIndeterminateBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSIsIndeterminateBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIsIndeterminateBinding").orElseThrow() }
private val NSIsIndeterminateBinding_VH: VarHandle by lazy { NSIsIndeterminateBinding_LAYOUT.varHandle() }

var NSIsIndeterminateBinding: MemorySegment
    get() = NSIsIndeterminateBinding_VH.get(NSIsIndeterminateBinding_SEGMENT) as MemorySegment
    set(value) = NSIsIndeterminateBinding_VH.set(NSIsIndeterminateBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSLabelBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSLabelBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLabelBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLabelBinding").orElseThrow() }
private val NSLabelBinding_VH: VarHandle by lazy { NSLabelBinding_LAYOUT.varHandle() }

var NSLabelBinding: MemorySegment
    get() = NSLabelBinding_VH.get(NSLabelBinding_SEGMENT) as MemorySegment
    set(value) = NSLabelBinding_VH.set(NSLabelBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSLocalizedKeyDictionaryBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSLocalizedKeyDictionaryBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocalizedKeyDictionaryBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocalizedKeyDictionaryBinding").orElseThrow() }
private val NSLocalizedKeyDictionaryBinding_VH: VarHandle by lazy { NSLocalizedKeyDictionaryBinding_LAYOUT.varHandle() }

var NSLocalizedKeyDictionaryBinding: MemorySegment
    get() = NSLocalizedKeyDictionaryBinding_VH.get(NSLocalizedKeyDictionaryBinding_SEGMENT) as MemorySegment
    set(value) = NSLocalizedKeyDictionaryBinding_VH.set(NSLocalizedKeyDictionaryBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSManagedObjectContextBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSManagedObjectContextBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSManagedObjectContextBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSManagedObjectContextBinding").orElseThrow() }
private val NSManagedObjectContextBinding_VH: VarHandle by lazy { NSManagedObjectContextBinding_LAYOUT.varHandle() }

var NSManagedObjectContextBinding: MemorySegment
    get() = NSManagedObjectContextBinding_VH.get(NSManagedObjectContextBinding_SEGMENT) as MemorySegment
    set(value) = NSManagedObjectContextBinding_VH.set(NSManagedObjectContextBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSMaximumRecentsBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSMaximumRecentsBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMaximumRecentsBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMaximumRecentsBinding").orElseThrow() }
private val NSMaximumRecentsBinding_VH: VarHandle by lazy { NSMaximumRecentsBinding_LAYOUT.varHandle() }

var NSMaximumRecentsBinding: MemorySegment
    get() = NSMaximumRecentsBinding_VH.get(NSMaximumRecentsBinding_SEGMENT) as MemorySegment
    set(value) = NSMaximumRecentsBinding_VH.set(NSMaximumRecentsBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSMaxValueBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSMaxValueBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMaxValueBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMaxValueBinding").orElseThrow() }
private val NSMaxValueBinding_VH: VarHandle by lazy { NSMaxValueBinding_LAYOUT.varHandle() }

var NSMaxValueBinding: MemorySegment
    get() = NSMaxValueBinding_VH.get(NSMaxValueBinding_SEGMENT) as MemorySegment
    set(value) = NSMaxValueBinding_VH.set(NSMaxValueBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSMaxWidthBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSMaxWidthBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMaxWidthBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMaxWidthBinding").orElseThrow() }
private val NSMaxWidthBinding_VH: VarHandle by lazy { NSMaxWidthBinding_LAYOUT.varHandle() }

var NSMaxWidthBinding: MemorySegment
    get() = NSMaxWidthBinding_VH.get(NSMaxWidthBinding_SEGMENT) as MemorySegment
    set(value) = NSMaxWidthBinding_VH.set(NSMaxWidthBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSMinValueBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSMinValueBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMinValueBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMinValueBinding").orElseThrow() }
private val NSMinValueBinding_VH: VarHandle by lazy { NSMinValueBinding_LAYOUT.varHandle() }

var NSMinValueBinding: MemorySegment
    get() = NSMinValueBinding_VH.get(NSMinValueBinding_SEGMENT) as MemorySegment
    set(value) = NSMinValueBinding_VH.set(NSMinValueBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSMinWidthBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSMinWidthBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMinWidthBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMinWidthBinding").orElseThrow() }
private val NSMinWidthBinding_VH: VarHandle by lazy { NSMinWidthBinding_LAYOUT.varHandle() }

var NSMinWidthBinding: MemorySegment
    get() = NSMinWidthBinding_VH.get(NSMinWidthBinding_SEGMENT) as MemorySegment
    set(value) = NSMinWidthBinding_VH.set(NSMinWidthBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSMixedStateImageBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSMixedStateImageBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMixedStateImageBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMixedStateImageBinding").orElseThrow() }
private val NSMixedStateImageBinding_VH: VarHandle by lazy { NSMixedStateImageBinding_LAYOUT.varHandle() }

var NSMixedStateImageBinding: MemorySegment
    get() = NSMixedStateImageBinding_VH.get(NSMixedStateImageBinding_SEGMENT) as MemorySegment
    set(value) = NSMixedStateImageBinding_VH.set(NSMixedStateImageBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSOffStateImageBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSOffStateImageBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOffStateImageBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOffStateImageBinding").orElseThrow() }
private val NSOffStateImageBinding_VH: VarHandle by lazy { NSOffStateImageBinding_LAYOUT.varHandle() }

var NSOffStateImageBinding: MemorySegment
    get() = NSOffStateImageBinding_VH.get(NSOffStateImageBinding_SEGMENT) as MemorySegment
    set(value) = NSOffStateImageBinding_VH.set(NSOffStateImageBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSOnStateImageBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSOnStateImageBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOnStateImageBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOnStateImageBinding").orElseThrow() }
private val NSOnStateImageBinding_VH: VarHandle by lazy { NSOnStateImageBinding_LAYOUT.varHandle() }

var NSOnStateImageBinding: MemorySegment
    get() = NSOnStateImageBinding_VH.get(NSOnStateImageBinding_SEGMENT) as MemorySegment
    set(value) = NSOnStateImageBinding_VH.set(NSOnStateImageBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSPositioningRectBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSPositioningRectBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPositioningRectBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPositioningRectBinding").orElseThrow() }
private val NSPositioningRectBinding_VH: VarHandle by lazy { NSPositioningRectBinding_LAYOUT.varHandle() }

var NSPositioningRectBinding: MemorySegment
    get() = NSPositioningRectBinding_VH.get(NSPositioningRectBinding_SEGMENT) as MemorySegment
    set(value) = NSPositioningRectBinding_VH.set(NSPositioningRectBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSPredicateBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSPredicateBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPredicateBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPredicateBinding").orElseThrow() }
private val NSPredicateBinding_VH: VarHandle by lazy { NSPredicateBinding_LAYOUT.varHandle() }

var NSPredicateBinding: MemorySegment
    get() = NSPredicateBinding_VH.get(NSPredicateBinding_SEGMENT) as MemorySegment
    set(value) = NSPredicateBinding_VH.set(NSPredicateBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSRecentSearchesBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSRecentSearchesBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRecentSearchesBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRecentSearchesBinding").orElseThrow() }
private val NSRecentSearchesBinding_VH: VarHandle by lazy { NSRecentSearchesBinding_LAYOUT.varHandle() }

var NSRecentSearchesBinding: MemorySegment
    get() = NSRecentSearchesBinding_VH.get(NSRecentSearchesBinding_SEGMENT) as MemorySegment
    set(value) = NSRecentSearchesBinding_VH.set(NSRecentSearchesBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSRepresentedFilenameBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSRepresentedFilenameBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRepresentedFilenameBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRepresentedFilenameBinding").orElseThrow() }
private val NSRepresentedFilenameBinding_VH: VarHandle by lazy { NSRepresentedFilenameBinding_LAYOUT.varHandle() }

var NSRepresentedFilenameBinding: MemorySegment
    get() = NSRepresentedFilenameBinding_VH.get(NSRepresentedFilenameBinding_SEGMENT) as MemorySegment
    set(value) = NSRepresentedFilenameBinding_VH.set(NSRepresentedFilenameBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSRowHeightBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSRowHeightBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRowHeightBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRowHeightBinding").orElseThrow() }
private val NSRowHeightBinding_VH: VarHandle by lazy { NSRowHeightBinding_LAYOUT.varHandle() }

var NSRowHeightBinding: MemorySegment
    get() = NSRowHeightBinding_VH.get(NSRowHeightBinding_SEGMENT) as MemorySegment
    set(value) = NSRowHeightBinding_VH.set(NSRowHeightBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectedIdentifierBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectedIdentifierBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectedIdentifierBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectedIdentifierBinding").orElseThrow() }
private val NSSelectedIdentifierBinding_VH: VarHandle by lazy { NSSelectedIdentifierBinding_LAYOUT.varHandle() }

var NSSelectedIdentifierBinding: MemorySegment
    get() = NSSelectedIdentifierBinding_VH.get(NSSelectedIdentifierBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectedIdentifierBinding_VH.set(NSSelectedIdentifierBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectedIndexBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectedIndexBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectedIndexBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectedIndexBinding").orElseThrow() }
private val NSSelectedIndexBinding_VH: VarHandle by lazy { NSSelectedIndexBinding_LAYOUT.varHandle() }

var NSSelectedIndexBinding: MemorySegment
    get() = NSSelectedIndexBinding_VH.get(NSSelectedIndexBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectedIndexBinding_VH.set(NSSelectedIndexBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectedLabelBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectedLabelBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectedLabelBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectedLabelBinding").orElseThrow() }
private val NSSelectedLabelBinding_VH: VarHandle by lazy { NSSelectedLabelBinding_LAYOUT.varHandle() }

var NSSelectedLabelBinding: MemorySegment
    get() = NSSelectedLabelBinding_VH.get(NSSelectedLabelBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectedLabelBinding_VH.set(NSSelectedLabelBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectedObjectBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectedObjectBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectedObjectBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectedObjectBinding").orElseThrow() }
private val NSSelectedObjectBinding_VH: VarHandle by lazy { NSSelectedObjectBinding_LAYOUT.varHandle() }

var NSSelectedObjectBinding: MemorySegment
    get() = NSSelectedObjectBinding_VH.get(NSSelectedObjectBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectedObjectBinding_VH.set(NSSelectedObjectBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectedObjectsBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectedObjectsBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectedObjectsBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectedObjectsBinding").orElseThrow() }
private val NSSelectedObjectsBinding_VH: VarHandle by lazy { NSSelectedObjectsBinding_LAYOUT.varHandle() }

var NSSelectedObjectsBinding: MemorySegment
    get() = NSSelectedObjectsBinding_VH.get(NSSelectedObjectsBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectedObjectsBinding_VH.set(NSSelectedObjectsBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectedTagBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectedTagBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectedTagBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectedTagBinding").orElseThrow() }
private val NSSelectedTagBinding_VH: VarHandle by lazy { NSSelectedTagBinding_LAYOUT.varHandle() }

var NSSelectedTagBinding: MemorySegment
    get() = NSSelectedTagBinding_VH.get(NSSelectedTagBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectedTagBinding_VH.set(NSSelectedTagBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectedValueBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectedValueBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectedValueBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectedValueBinding").orElseThrow() }
private val NSSelectedValueBinding_VH: VarHandle by lazy { NSSelectedValueBinding_LAYOUT.varHandle() }

var NSSelectedValueBinding: MemorySegment
    get() = NSSelectedValueBinding_VH.get(NSSelectedValueBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectedValueBinding_VH.set(NSSelectedValueBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectedValuesBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectedValuesBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectedValuesBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectedValuesBinding").orElseThrow() }
private val NSSelectedValuesBinding_VH: VarHandle by lazy { NSSelectedValuesBinding_LAYOUT.varHandle() }

var NSSelectedValuesBinding: MemorySegment
    get() = NSSelectedValuesBinding_VH.get(NSSelectedValuesBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectedValuesBinding_VH.set(NSSelectedValuesBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectionIndexesBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectionIndexesBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectionIndexesBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectionIndexesBinding").orElseThrow() }
private val NSSelectionIndexesBinding_VH: VarHandle by lazy { NSSelectionIndexesBinding_LAYOUT.varHandle() }

var NSSelectionIndexesBinding: MemorySegment
    get() = NSSelectionIndexesBinding_VH.get(NSSelectionIndexesBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectionIndexesBinding_VH.set(NSSelectionIndexesBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectionIndexPathsBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSelectionIndexPathsBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectionIndexPathsBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectionIndexPathsBinding").orElseThrow() }
private val NSSelectionIndexPathsBinding_VH: VarHandle by lazy { NSSelectionIndexPathsBinding_LAYOUT.varHandle() }

var NSSelectionIndexPathsBinding: MemorySegment
    get() = NSSelectionIndexPathsBinding_VH.get(NSSelectionIndexPathsBinding_SEGMENT) as MemorySegment
    set(value) = NSSelectionIndexPathsBinding_VH.set(NSSelectionIndexPathsBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSSortDescriptorsBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSSortDescriptorsBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSortDescriptorsBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSortDescriptorsBinding").orElseThrow() }
private val NSSortDescriptorsBinding_VH: VarHandle by lazy { NSSortDescriptorsBinding_LAYOUT.varHandle() }

var NSSortDescriptorsBinding: MemorySegment
    get() = NSSortDescriptorsBinding_VH.get(NSSortDescriptorsBinding_SEGMENT) as MemorySegment
    set(value) = NSSortDescriptorsBinding_VH.set(NSSortDescriptorsBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSTargetBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSTargetBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTargetBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTargetBinding").orElseThrow() }
private val NSTargetBinding_VH: VarHandle by lazy { NSTargetBinding_LAYOUT.varHandle() }

var NSTargetBinding: MemorySegment
    get() = NSTargetBinding_VH.get(NSTargetBinding_SEGMENT) as MemorySegment
    set(value) = NSTargetBinding_VH.set(NSTargetBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextColorBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSTextColorBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextColorBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextColorBinding").orElseThrow() }
private val NSTextColorBinding_VH: VarHandle by lazy { NSTextColorBinding_LAYOUT.varHandle() }

var NSTextColorBinding: MemorySegment
    get() = NSTextColorBinding_VH.get(NSTextColorBinding_SEGMENT) as MemorySegment
    set(value) = NSTextColorBinding_VH.set(NSTextColorBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSTitleBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSTitleBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTitleBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTitleBinding").orElseThrow() }
private val NSTitleBinding_VH: VarHandle by lazy { NSTitleBinding_LAYOUT.varHandle() }

var NSTitleBinding: MemorySegment
    get() = NSTitleBinding_VH.get(NSTitleBinding_SEGMENT) as MemorySegment
    set(value) = NSTitleBinding_VH.set(NSTitleBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSToolTipBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSToolTipBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolTipBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSToolTipBinding").orElseThrow() }
private val NSToolTipBinding_VH: VarHandle by lazy { NSToolTipBinding_LAYOUT.varHandle() }

var NSToolTipBinding: MemorySegment
    get() = NSToolTipBinding_VH.get(NSToolTipBinding_SEGMENT) as MemorySegment
    set(value) = NSToolTipBinding_VH.set(NSToolTipBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSTransparentBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSTransparentBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTransparentBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTransparentBinding").orElseThrow() }
private val NSTransparentBinding_VH: VarHandle by lazy { NSTransparentBinding_LAYOUT.varHandle() }

var NSTransparentBinding: MemorySegment
    get() = NSTransparentBinding_VH.get(NSTransparentBinding_SEGMENT) as MemorySegment
    set(value) = NSTransparentBinding_VH.set(NSTransparentBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSValueBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSValueBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSValueBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSValueBinding").orElseThrow() }
private val NSValueBinding_VH: VarHandle by lazy { NSValueBinding_LAYOUT.varHandle() }

var NSValueBinding: MemorySegment
    get() = NSValueBinding_VH.get(NSValueBinding_SEGMENT) as MemorySegment
    set(value) = NSValueBinding_VH.set(NSValueBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSValuePathBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSValuePathBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSValuePathBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSValuePathBinding").orElseThrow() }
private val NSValuePathBinding_VH: VarHandle by lazy { NSValuePathBinding_LAYOUT.varHandle() }

var NSValuePathBinding: MemorySegment
    get() = NSValuePathBinding_VH.get(NSValuePathBinding_SEGMENT) as MemorySegment
    set(value) = NSValuePathBinding_VH.set(NSValuePathBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSValueURLBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSValueURLBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSValueURLBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSValueURLBinding").orElseThrow() }
private val NSValueURLBinding_VH: VarHandle by lazy { NSValueURLBinding_LAYOUT.varHandle() }

var NSValueURLBinding: MemorySegment
    get() = NSValueURLBinding_VH.get(NSValueURLBinding_SEGMENT) as MemorySegment
    set(value) = NSValueURLBinding_VH.set(NSValueURLBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSVisibleBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSVisibleBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVisibleBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSVisibleBinding").orElseThrow() }
private val NSVisibleBinding_VH: VarHandle by lazy { NSVisibleBinding_LAYOUT.varHandle() }

var NSVisibleBinding: MemorySegment
    get() = NSVisibleBinding_VH.get(NSVisibleBinding_SEGMENT) as MemorySegment
    set(value) = NSVisibleBinding_VH.set(NSVisibleBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSWarningValueBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSWarningValueBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWarningValueBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWarningValueBinding").orElseThrow() }
private val NSWarningValueBinding_VH: VarHandle by lazy { NSWarningValueBinding_LAYOUT.varHandle() }

var NSWarningValueBinding: MemorySegment
    get() = NSWarningValueBinding_VH.get(NSWarningValueBinding_SEGMENT) as MemorySegment
    set(value) = NSWarningValueBinding_VH.set(NSWarningValueBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSWidthBinding typedef NSBindingName = typedef NSString = (Void)*
 */
private val NSWidthBinding_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWidthBinding_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWidthBinding").orElseThrow() }
private val NSWidthBinding_VH: VarHandle by lazy { NSWidthBinding_LAYOUT.varHandle() }

var NSWidthBinding: MemorySegment
    get() = NSWidthBinding_VH.get(NSWidthBinding_SEGMENT) as MemorySegment
    set(value) = NSWidthBinding_VH.set(NSWidthBinding_SEGMENT, value)

/**
 * {@snippet lang=c : NSAllowsEditingMultipleValuesSelectionBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSAllowsEditingMultipleValuesSelectionBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAllowsEditingMultipleValuesSelectionBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllowsEditingMultipleValuesSelectionBindingOption").orElseThrow() }
private val NSAllowsEditingMultipleValuesSelectionBindingOption_VH: VarHandle by lazy { NSAllowsEditingMultipleValuesSelectionBindingOption_LAYOUT.varHandle() }

var NSAllowsEditingMultipleValuesSelectionBindingOption: MemorySegment
    get() = NSAllowsEditingMultipleValuesSelectionBindingOption_VH.get(NSAllowsEditingMultipleValuesSelectionBindingOption_SEGMENT) as MemorySegment
    set(value) = NSAllowsEditingMultipleValuesSelectionBindingOption_VH.set(NSAllowsEditingMultipleValuesSelectionBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSAllowsNullArgumentBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSAllowsNullArgumentBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAllowsNullArgumentBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllowsNullArgumentBindingOption").orElseThrow() }
private val NSAllowsNullArgumentBindingOption_VH: VarHandle by lazy { NSAllowsNullArgumentBindingOption_LAYOUT.varHandle() }

var NSAllowsNullArgumentBindingOption: MemorySegment
    get() = NSAllowsNullArgumentBindingOption_VH.get(NSAllowsNullArgumentBindingOption_SEGMENT) as MemorySegment
    set(value) = NSAllowsNullArgumentBindingOption_VH.set(NSAllowsNullArgumentBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSAlwaysPresentsApplicationModalAlertsBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSAlwaysPresentsApplicationModalAlertsBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAlwaysPresentsApplicationModalAlertsBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAlwaysPresentsApplicationModalAlertsBindingOption").orElseThrow() }
private val NSAlwaysPresentsApplicationModalAlertsBindingOption_VH: VarHandle by lazy { NSAlwaysPresentsApplicationModalAlertsBindingOption_LAYOUT.varHandle() }

var NSAlwaysPresentsApplicationModalAlertsBindingOption: MemorySegment
    get() = NSAlwaysPresentsApplicationModalAlertsBindingOption_VH.get(NSAlwaysPresentsApplicationModalAlertsBindingOption_SEGMENT) as MemorySegment
    set(value) = NSAlwaysPresentsApplicationModalAlertsBindingOption_VH.set(NSAlwaysPresentsApplicationModalAlertsBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSConditionallySetsEditableBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSConditionallySetsEditableBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSConditionallySetsEditableBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSConditionallySetsEditableBindingOption").orElseThrow() }
private val NSConditionallySetsEditableBindingOption_VH: VarHandle by lazy { NSConditionallySetsEditableBindingOption_LAYOUT.varHandle() }

var NSConditionallySetsEditableBindingOption: MemorySegment
    get() = NSConditionallySetsEditableBindingOption_VH.get(NSConditionallySetsEditableBindingOption_SEGMENT) as MemorySegment
    set(value) = NSConditionallySetsEditableBindingOption_VH.set(NSConditionallySetsEditableBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSConditionallySetsEnabledBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSConditionallySetsEnabledBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSConditionallySetsEnabledBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSConditionallySetsEnabledBindingOption").orElseThrow() }
private val NSConditionallySetsEnabledBindingOption_VH: VarHandle by lazy { NSConditionallySetsEnabledBindingOption_LAYOUT.varHandle() }

var NSConditionallySetsEnabledBindingOption: MemorySegment
    get() = NSConditionallySetsEnabledBindingOption_VH.get(NSConditionallySetsEnabledBindingOption_SEGMENT) as MemorySegment
    set(value) = NSConditionallySetsEnabledBindingOption_VH.set(NSConditionallySetsEnabledBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSConditionallySetsHiddenBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSConditionallySetsHiddenBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSConditionallySetsHiddenBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSConditionallySetsHiddenBindingOption").orElseThrow() }
private val NSConditionallySetsHiddenBindingOption_VH: VarHandle by lazy { NSConditionallySetsHiddenBindingOption_LAYOUT.varHandle() }

var NSConditionallySetsHiddenBindingOption: MemorySegment
    get() = NSConditionallySetsHiddenBindingOption_VH.get(NSConditionallySetsHiddenBindingOption_SEGMENT) as MemorySegment
    set(value) = NSConditionallySetsHiddenBindingOption_VH.set(NSConditionallySetsHiddenBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSContinuouslyUpdatesValueBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSContinuouslyUpdatesValueBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContinuouslyUpdatesValueBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContinuouslyUpdatesValueBindingOption").orElseThrow() }
private val NSContinuouslyUpdatesValueBindingOption_VH: VarHandle by lazy { NSContinuouslyUpdatesValueBindingOption_LAYOUT.varHandle() }

var NSContinuouslyUpdatesValueBindingOption: MemorySegment
    get() = NSContinuouslyUpdatesValueBindingOption_VH.get(NSContinuouslyUpdatesValueBindingOption_SEGMENT) as MemorySegment
    set(value) = NSContinuouslyUpdatesValueBindingOption_VH.set(NSContinuouslyUpdatesValueBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSCreatesSortDescriptorBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSCreatesSortDescriptorBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCreatesSortDescriptorBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCreatesSortDescriptorBindingOption").orElseThrow() }
private val NSCreatesSortDescriptorBindingOption_VH: VarHandle by lazy { NSCreatesSortDescriptorBindingOption_LAYOUT.varHandle() }

var NSCreatesSortDescriptorBindingOption: MemorySegment
    get() = NSCreatesSortDescriptorBindingOption_VH.get(NSCreatesSortDescriptorBindingOption_SEGMENT) as MemorySegment
    set(value) = NSCreatesSortDescriptorBindingOption_VH.set(NSCreatesSortDescriptorBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSDeletesObjectsOnRemoveBindingsOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSDeletesObjectsOnRemoveBindingsOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDeletesObjectsOnRemoveBindingsOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDeletesObjectsOnRemoveBindingsOption").orElseThrow() }
private val NSDeletesObjectsOnRemoveBindingsOption_VH: VarHandle by lazy { NSDeletesObjectsOnRemoveBindingsOption_LAYOUT.varHandle() }

var NSDeletesObjectsOnRemoveBindingsOption: MemorySegment
    get() = NSDeletesObjectsOnRemoveBindingsOption_VH.get(NSDeletesObjectsOnRemoveBindingsOption_SEGMENT) as MemorySegment
    set(value) = NSDeletesObjectsOnRemoveBindingsOption_VH.set(NSDeletesObjectsOnRemoveBindingsOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSDisplayNameBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSDisplayNameBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDisplayNameBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDisplayNameBindingOption").orElseThrow() }
private val NSDisplayNameBindingOption_VH: VarHandle by lazy { NSDisplayNameBindingOption_LAYOUT.varHandle() }

var NSDisplayNameBindingOption: MemorySegment
    get() = NSDisplayNameBindingOption_VH.get(NSDisplayNameBindingOption_SEGMENT) as MemorySegment
    set(value) = NSDisplayNameBindingOption_VH.set(NSDisplayNameBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSDisplayPatternBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSDisplayPatternBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDisplayPatternBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDisplayPatternBindingOption").orElseThrow() }
private val NSDisplayPatternBindingOption_VH: VarHandle by lazy { NSDisplayPatternBindingOption_LAYOUT.varHandle() }

var NSDisplayPatternBindingOption: MemorySegment
    get() = NSDisplayPatternBindingOption_VH.get(NSDisplayPatternBindingOption_SEGMENT) as MemorySegment
    set(value) = NSDisplayPatternBindingOption_VH.set(NSDisplayPatternBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSContentPlacementTagBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSContentPlacementTagBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSContentPlacementTagBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSContentPlacementTagBindingOption").orElseThrow() }
private val NSContentPlacementTagBindingOption_VH: VarHandle by lazy { NSContentPlacementTagBindingOption_LAYOUT.varHandle() }

var NSContentPlacementTagBindingOption: MemorySegment
    get() = NSContentPlacementTagBindingOption_VH.get(NSContentPlacementTagBindingOption_SEGMENT) as MemorySegment
    set(value) = NSContentPlacementTagBindingOption_VH.set(NSContentPlacementTagBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSHandlesContentAsCompoundValueBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSHandlesContentAsCompoundValueBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHandlesContentAsCompoundValueBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHandlesContentAsCompoundValueBindingOption").orElseThrow() }
private val NSHandlesContentAsCompoundValueBindingOption_VH: VarHandle by lazy { NSHandlesContentAsCompoundValueBindingOption_LAYOUT.varHandle() }

var NSHandlesContentAsCompoundValueBindingOption: MemorySegment
    get() = NSHandlesContentAsCompoundValueBindingOption_VH.get(NSHandlesContentAsCompoundValueBindingOption_SEGMENT) as MemorySegment
    set(value) = NSHandlesContentAsCompoundValueBindingOption_VH.set(NSHandlesContentAsCompoundValueBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSInsertsNullPlaceholderBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSInsertsNullPlaceholderBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInsertsNullPlaceholderBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInsertsNullPlaceholderBindingOption").orElseThrow() }
private val NSInsertsNullPlaceholderBindingOption_VH: VarHandle by lazy { NSInsertsNullPlaceholderBindingOption_LAYOUT.varHandle() }

var NSInsertsNullPlaceholderBindingOption: MemorySegment
    get() = NSInsertsNullPlaceholderBindingOption_VH.get(NSInsertsNullPlaceholderBindingOption_SEGMENT) as MemorySegment
    set(value) = NSInsertsNullPlaceholderBindingOption_VH.set(NSInsertsNullPlaceholderBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSInvokesSeparatelyWithArrayObjectsBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSInvokesSeparatelyWithArrayObjectsBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInvokesSeparatelyWithArrayObjectsBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInvokesSeparatelyWithArrayObjectsBindingOption").orElseThrow() }
private val NSInvokesSeparatelyWithArrayObjectsBindingOption_VH: VarHandle by lazy { NSInvokesSeparatelyWithArrayObjectsBindingOption_LAYOUT.varHandle() }

var NSInvokesSeparatelyWithArrayObjectsBindingOption: MemorySegment
    get() = NSInvokesSeparatelyWithArrayObjectsBindingOption_VH.get(NSInvokesSeparatelyWithArrayObjectsBindingOption_SEGMENT) as MemorySegment
    set(value) = NSInvokesSeparatelyWithArrayObjectsBindingOption_VH.set(NSInvokesSeparatelyWithArrayObjectsBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSMultipleValuesPlaceholderBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSMultipleValuesPlaceholderBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMultipleValuesPlaceholderBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMultipleValuesPlaceholderBindingOption").orElseThrow() }
private val NSMultipleValuesPlaceholderBindingOption_VH: VarHandle by lazy { NSMultipleValuesPlaceholderBindingOption_LAYOUT.varHandle() }

var NSMultipleValuesPlaceholderBindingOption: MemorySegment
    get() = NSMultipleValuesPlaceholderBindingOption_VH.get(NSMultipleValuesPlaceholderBindingOption_SEGMENT) as MemorySegment
    set(value) = NSMultipleValuesPlaceholderBindingOption_VH.set(NSMultipleValuesPlaceholderBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSNoSelectionPlaceholderBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSNoSelectionPlaceholderBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNoSelectionPlaceholderBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNoSelectionPlaceholderBindingOption").orElseThrow() }
private val NSNoSelectionPlaceholderBindingOption_VH: VarHandle by lazy { NSNoSelectionPlaceholderBindingOption_LAYOUT.varHandle() }

var NSNoSelectionPlaceholderBindingOption: MemorySegment
    get() = NSNoSelectionPlaceholderBindingOption_VH.get(NSNoSelectionPlaceholderBindingOption_SEGMENT) as MemorySegment
    set(value) = NSNoSelectionPlaceholderBindingOption_VH.set(NSNoSelectionPlaceholderBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSNotApplicablePlaceholderBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSNotApplicablePlaceholderBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNotApplicablePlaceholderBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNotApplicablePlaceholderBindingOption").orElseThrow() }
private val NSNotApplicablePlaceholderBindingOption_VH: VarHandle by lazy { NSNotApplicablePlaceholderBindingOption_LAYOUT.varHandle() }

var NSNotApplicablePlaceholderBindingOption: MemorySegment
    get() = NSNotApplicablePlaceholderBindingOption_VH.get(NSNotApplicablePlaceholderBindingOption_SEGMENT) as MemorySegment
    set(value) = NSNotApplicablePlaceholderBindingOption_VH.set(NSNotApplicablePlaceholderBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSNullPlaceholderBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSNullPlaceholderBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNullPlaceholderBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNullPlaceholderBindingOption").orElseThrow() }
private val NSNullPlaceholderBindingOption_VH: VarHandle by lazy { NSNullPlaceholderBindingOption_LAYOUT.varHandle() }

var NSNullPlaceholderBindingOption: MemorySegment
    get() = NSNullPlaceholderBindingOption_VH.get(NSNullPlaceholderBindingOption_SEGMENT) as MemorySegment
    set(value) = NSNullPlaceholderBindingOption_VH.set(NSNullPlaceholderBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSRaisesForNotApplicableKeysBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSRaisesForNotApplicableKeysBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRaisesForNotApplicableKeysBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRaisesForNotApplicableKeysBindingOption").orElseThrow() }
private val NSRaisesForNotApplicableKeysBindingOption_VH: VarHandle by lazy { NSRaisesForNotApplicableKeysBindingOption_LAYOUT.varHandle() }

var NSRaisesForNotApplicableKeysBindingOption: MemorySegment
    get() = NSRaisesForNotApplicableKeysBindingOption_VH.get(NSRaisesForNotApplicableKeysBindingOption_SEGMENT) as MemorySegment
    set(value) = NSRaisesForNotApplicableKeysBindingOption_VH.set(NSRaisesForNotApplicableKeysBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSPredicateFormatBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSPredicateFormatBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPredicateFormatBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPredicateFormatBindingOption").orElseThrow() }
private val NSPredicateFormatBindingOption_VH: VarHandle by lazy { NSPredicateFormatBindingOption_LAYOUT.varHandle() }

var NSPredicateFormatBindingOption: MemorySegment
    get() = NSPredicateFormatBindingOption_VH.get(NSPredicateFormatBindingOption_SEGMENT) as MemorySegment
    set(value) = NSPredicateFormatBindingOption_VH.set(NSPredicateFormatBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectorNameBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSSelectorNameBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectorNameBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectorNameBindingOption").orElseThrow() }
private val NSSelectorNameBindingOption_VH: VarHandle by lazy { NSSelectorNameBindingOption_LAYOUT.varHandle() }

var NSSelectorNameBindingOption: MemorySegment
    get() = NSSelectorNameBindingOption_VH.get(NSSelectorNameBindingOption_SEGMENT) as MemorySegment
    set(value) = NSSelectorNameBindingOption_VH.set(NSSelectorNameBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSSelectsAllWhenSettingContentBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSSelectsAllWhenSettingContentBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSelectsAllWhenSettingContentBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectsAllWhenSettingContentBindingOption").orElseThrow() }
private val NSSelectsAllWhenSettingContentBindingOption_VH: VarHandle by lazy { NSSelectsAllWhenSettingContentBindingOption_LAYOUT.varHandle() }

var NSSelectsAllWhenSettingContentBindingOption: MemorySegment
    get() = NSSelectsAllWhenSettingContentBindingOption_VH.get(NSSelectsAllWhenSettingContentBindingOption_SEGMENT) as MemorySegment
    set(value) = NSSelectsAllWhenSettingContentBindingOption_VH.set(NSSelectsAllWhenSettingContentBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSValidatesImmediatelyBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSValidatesImmediatelyBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSValidatesImmediatelyBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSValidatesImmediatelyBindingOption").orElseThrow() }
private val NSValidatesImmediatelyBindingOption_VH: VarHandle by lazy { NSValidatesImmediatelyBindingOption_LAYOUT.varHandle() }

var NSValidatesImmediatelyBindingOption: MemorySegment
    get() = NSValidatesImmediatelyBindingOption_VH.get(NSValidatesImmediatelyBindingOption_SEGMENT) as MemorySegment
    set(value) = NSValidatesImmediatelyBindingOption_VH.set(NSValidatesImmediatelyBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSValueTransformerNameBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSValueTransformerNameBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSValueTransformerNameBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSValueTransformerNameBindingOption").orElseThrow() }
private val NSValueTransformerNameBindingOption_VH: VarHandle by lazy { NSValueTransformerNameBindingOption_LAYOUT.varHandle() }

var NSValueTransformerNameBindingOption: MemorySegment
    get() = NSValueTransformerNameBindingOption_VH.get(NSValueTransformerNameBindingOption_SEGMENT) as MemorySegment
    set(value) = NSValueTransformerNameBindingOption_VH.set(NSValueTransformerNameBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSValueTransformerBindingOption typedef NSBindingOption = typedef NSString = (Void)*
 */
private val NSValueTransformerBindingOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSValueTransformerBindingOption_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSValueTransformerBindingOption").orElseThrow() }
private val NSValueTransformerBindingOption_VH: VarHandle by lazy { NSValueTransformerBindingOption_LAYOUT.varHandle() }

var NSValueTransformerBindingOption: MemorySegment
    get() = NSValueTransformerBindingOption_VH.get(NSValueTransformerBindingOption_SEGMENT) as MemorySegment
    set(value) = NSValueTransformerBindingOption_VH.set(NSValueTransformerBindingOption_SEGMENT, value)

/**
 * {@snippet lang=c : NSUserActivityDocumentURLKey (Void)*
 */
private val NSUserActivityDocumentURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUserActivityDocumentURLKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUserActivityDocumentURLKey").orElseThrow() }
private val NSUserActivityDocumentURLKey_VH: VarHandle by lazy { NSUserActivityDocumentURLKey_LAYOUT.varHandle() }

var NSUserActivityDocumentURLKey: MemorySegment
    get() = NSUserActivityDocumentURLKey_VH.get(NSUserActivityDocumentURLKey_SEGMENT) as MemorySegment
    set(value) = NSUserActivityDocumentURLKey_VH.set(NSUserActivityDocumentURLKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppKitVersionNumber typedef const NSAppKitVersion = Double
 */
private val NSAppKitVersionNumber_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSAppKitVersionNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppKitVersionNumber").orElseThrow() }
private val NSAppKitVersionNumber_VH: VarHandle by lazy { NSAppKitVersionNumber_LAYOUT.varHandle() }

var NSAppKitVersionNumber: Double
    get() = NSAppKitVersionNumber_VH.get(NSAppKitVersionNumber_SEGMENT) as Double
    set(value) = NSAppKitVersionNumber_VH.set(NSAppKitVersionNumber_SEGMENT, value)

/**
 * {@snippet lang=c : NSModalPanelRunLoopMode typedef NSRunLoopMode = typedef NSString = (Void)*
 */
private val NSModalPanelRunLoopMode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSModalPanelRunLoopMode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSModalPanelRunLoopMode").orElseThrow() }
private val NSModalPanelRunLoopMode_VH: VarHandle by lazy { NSModalPanelRunLoopMode_LAYOUT.varHandle() }

var NSModalPanelRunLoopMode: MemorySegment
    get() = NSModalPanelRunLoopMode_VH.get(NSModalPanelRunLoopMode_SEGMENT) as MemorySegment
    set(value) = NSModalPanelRunLoopMode_VH.set(NSModalPanelRunLoopMode_SEGMENT, value)

/**
 * {@snippet lang=c : NSEventTrackingRunLoopMode typedef NSRunLoopMode = typedef NSString = (Void)*
 */
private val NSEventTrackingRunLoopMode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSEventTrackingRunLoopMode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSEventTrackingRunLoopMode").orElseThrow() }
private val NSEventTrackingRunLoopMode_VH: VarHandle by lazy { NSEventTrackingRunLoopMode_LAYOUT.varHandle() }

var NSEventTrackingRunLoopMode: MemorySegment
    get() = NSEventTrackingRunLoopMode_VH.get(NSEventTrackingRunLoopMode_SEGMENT) as MemorySegment
    set(value) = NSEventTrackingRunLoopMode_VH.set(NSEventTrackingRunLoopMode_SEGMENT, value)

/**
 * {@snippet lang=c : NSApp (Void)*
 */
private val NSApp_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApp_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApp").orElseThrow() }
private val NSApp_VH: VarHandle by lazy { NSApp_LAYOUT.varHandle() }

var NSApp: MemorySegment
    get() = NSApp_VH.get(NSApp_SEGMENT) as MemorySegment
    set(value) = NSApp_VH.set(NSApp_SEGMENT, value)

/**
 * {@snippet lang=c : NSAboutPanelOptionCredits typedef const NSAboutPanelOptionKey = (Void)*
 */
private val NSAboutPanelOptionCredits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAboutPanelOptionCredits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAboutPanelOptionCredits").orElseThrow() }
private val NSAboutPanelOptionCredits_VH: VarHandle by lazy { NSAboutPanelOptionCredits_LAYOUT.varHandle() }

var NSAboutPanelOptionCredits: MemorySegment
    get() = NSAboutPanelOptionCredits_VH.get(NSAboutPanelOptionCredits_SEGMENT) as MemorySegment
    set(value) = NSAboutPanelOptionCredits_VH.set(NSAboutPanelOptionCredits_SEGMENT, value)

/**
 * {@snippet lang=c : NSAboutPanelOptionApplicationName typedef const NSAboutPanelOptionKey = (Void)*
 */
private val NSAboutPanelOptionApplicationName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAboutPanelOptionApplicationName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAboutPanelOptionApplicationName").orElseThrow() }
private val NSAboutPanelOptionApplicationName_VH: VarHandle by lazy { NSAboutPanelOptionApplicationName_LAYOUT.varHandle() }

var NSAboutPanelOptionApplicationName: MemorySegment
    get() = NSAboutPanelOptionApplicationName_VH.get(NSAboutPanelOptionApplicationName_SEGMENT) as MemorySegment
    set(value) = NSAboutPanelOptionApplicationName_VH.set(NSAboutPanelOptionApplicationName_SEGMENT, value)

/**
 * {@snippet lang=c : NSAboutPanelOptionApplicationIcon typedef const NSAboutPanelOptionKey = (Void)*
 */
private val NSAboutPanelOptionApplicationIcon_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAboutPanelOptionApplicationIcon_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAboutPanelOptionApplicationIcon").orElseThrow() }
private val NSAboutPanelOptionApplicationIcon_VH: VarHandle by lazy { NSAboutPanelOptionApplicationIcon_LAYOUT.varHandle() }

var NSAboutPanelOptionApplicationIcon: MemorySegment
    get() = NSAboutPanelOptionApplicationIcon_VH.get(NSAboutPanelOptionApplicationIcon_SEGMENT) as MemorySegment
    set(value) = NSAboutPanelOptionApplicationIcon_VH.set(NSAboutPanelOptionApplicationIcon_SEGMENT, value)

/**
 * {@snippet lang=c : NSAboutPanelOptionVersion typedef const NSAboutPanelOptionKey = (Void)*
 */
private val NSAboutPanelOptionVersion_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAboutPanelOptionVersion_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAboutPanelOptionVersion").orElseThrow() }
private val NSAboutPanelOptionVersion_VH: VarHandle by lazy { NSAboutPanelOptionVersion_LAYOUT.varHandle() }

var NSAboutPanelOptionVersion: MemorySegment
    get() = NSAboutPanelOptionVersion_VH.get(NSAboutPanelOptionVersion_SEGMENT) as MemorySegment
    set(value) = NSAboutPanelOptionVersion_VH.set(NSAboutPanelOptionVersion_SEGMENT, value)

/**
 * {@snippet lang=c : NSAboutPanelOptionApplicationVersion typedef const NSAboutPanelOptionKey = (Void)*
 */
private val NSAboutPanelOptionApplicationVersion_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAboutPanelOptionApplicationVersion_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAboutPanelOptionApplicationVersion").orElseThrow() }
private val NSAboutPanelOptionApplicationVersion_VH: VarHandle by lazy { NSAboutPanelOptionApplicationVersion_LAYOUT.varHandle() }

var NSAboutPanelOptionApplicationVersion: MemorySegment
    get() = NSAboutPanelOptionApplicationVersion_VH.get(NSAboutPanelOptionApplicationVersion_SEGMENT) as MemorySegment
    set(value) = NSAboutPanelOptionApplicationVersion_VH.set(NSAboutPanelOptionApplicationVersion_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationMain Int(Int,((Char)*)*)
 */
private val NSApplicationMain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val NSApplicationMain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSApplicationMain").orElseThrow()
private val NSApplicationMain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSApplicationMain_ADDR, NSApplicationMain_DESC)

fun NSApplicationMain(arg0: Int, arg1: MemorySegment): Int {
    try {
        return NSApplicationMain_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSApplicationLoad typedef BOOL = Bool()
 */
private val NSApplicationLoad_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN)
private val NSApplicationLoad_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSApplicationLoad").orElseThrow()
private val NSApplicationLoad_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSApplicationLoad_ADDR, NSApplicationLoad_DESC)

fun NSApplicationLoad(): Boolean {
    try {
        return NSApplicationLoad_HANDLE.invokeExact() as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSShowsServicesMenuItem typedef BOOL = Bool(typedef NSString = (Void)*)
 */
private val NSShowsServicesMenuItem_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val NSShowsServicesMenuItem_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSShowsServicesMenuItem").orElseThrow()
private val NSShowsServicesMenuItem_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSShowsServicesMenuItem_ADDR, NSShowsServicesMenuItem_DESC)

fun NSShowsServicesMenuItem(arg0: MemorySegment): Boolean {
    try {
        return NSShowsServicesMenuItem_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSSetShowsServicesMenuItem typedef NSInteger = Long(typedef NSString = (Void)*,typedef BOOL = Bool)
 */
private val NSSetShowsServicesMenuItem_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val NSSetShowsServicesMenuItem_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSSetShowsServicesMenuItem").orElseThrow()
private val NSSetShowsServicesMenuItem_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSSetShowsServicesMenuItem_ADDR, NSSetShowsServicesMenuItem_DESC)

fun NSSetShowsServicesMenuItem(arg0: MemorySegment, arg1: Boolean): Long {
    try {
        return NSSetShowsServicesMenuItem_HANDLE.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSUpdateDynamicServices Void()
 */
private val NSUpdateDynamicServices_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val NSUpdateDynamicServices_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSUpdateDynamicServices").orElseThrow()
private val NSUpdateDynamicServices_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSUpdateDynamicServices_ADDR, NSUpdateDynamicServices_DESC)

fun NSUpdateDynamicServices(): Unit {
    try {
        NSUpdateDynamicServices_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSPerformService typedef BOOL = Bool(typedef NSString = (Void)*,typedef NSPasteboard = (Void)*)
 */
private val NSPerformService_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSPerformService_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSPerformService").orElseThrow()
private val NSPerformService_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSPerformService_ADDR, NSPerformService_DESC)

fun NSPerformService(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSPerformService_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRegisterServicesProvider Void(typedef id = (Void)*,typedef NSServiceProviderName = typedef NSString = (Void)*)
 */
private val NSRegisterServicesProvider_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSRegisterServicesProvider_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSRegisterServicesProvider").orElseThrow()
private val NSRegisterServicesProvider_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSRegisterServicesProvider_ADDR, NSRegisterServicesProvider_DESC)

fun NSRegisterServicesProvider(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSRegisterServicesProvider_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSUnregisterServicesProvider Void(typedef NSServiceProviderName = typedef NSString = (Void)*)
 */
private val NSUnregisterServicesProvider_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSUnregisterServicesProvider_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSUnregisterServicesProvider").orElseThrow()
private val NSUnregisterServicesProvider_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSUnregisterServicesProvider_ADDR, NSUnregisterServicesProvider_DESC)

fun NSUnregisterServicesProvider(arg0: MemorySegment): Unit {
    try {
        NSUnregisterServicesProvider_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSApplicationDidBecomeActiveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationDidBecomeActiveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidBecomeActiveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidBecomeActiveNotification").orElseThrow() }
private val NSApplicationDidBecomeActiveNotification_VH: VarHandle by lazy { NSApplicationDidBecomeActiveNotification_LAYOUT.varHandle() }

var NSApplicationDidBecomeActiveNotification: MemorySegment
    get() = NSApplicationDidBecomeActiveNotification_VH.get(NSApplicationDidBecomeActiveNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationDidBecomeActiveNotification_VH.set(NSApplicationDidBecomeActiveNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationDidHideNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationDidHideNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidHideNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidHideNotification").orElseThrow() }
private val NSApplicationDidHideNotification_VH: VarHandle by lazy { NSApplicationDidHideNotification_LAYOUT.varHandle() }

var NSApplicationDidHideNotification: MemorySegment
    get() = NSApplicationDidHideNotification_VH.get(NSApplicationDidHideNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationDidHideNotification_VH.set(NSApplicationDidHideNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationDidFinishLaunchingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationDidFinishLaunchingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidFinishLaunchingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidFinishLaunchingNotification").orElseThrow() }
private val NSApplicationDidFinishLaunchingNotification_VH: VarHandle by lazy { NSApplicationDidFinishLaunchingNotification_LAYOUT.varHandle() }

var NSApplicationDidFinishLaunchingNotification: MemorySegment
    get() = NSApplicationDidFinishLaunchingNotification_VH.get(NSApplicationDidFinishLaunchingNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationDidFinishLaunchingNotification_VH.set(NSApplicationDidFinishLaunchingNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationDidResignActiveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationDidResignActiveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidResignActiveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidResignActiveNotification").orElseThrow() }
private val NSApplicationDidResignActiveNotification_VH: VarHandle by lazy { NSApplicationDidResignActiveNotification_LAYOUT.varHandle() }

var NSApplicationDidResignActiveNotification: MemorySegment
    get() = NSApplicationDidResignActiveNotification_VH.get(NSApplicationDidResignActiveNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationDidResignActiveNotification_VH.set(NSApplicationDidResignActiveNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationDidUnhideNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationDidUnhideNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidUnhideNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidUnhideNotification").orElseThrow() }
private val NSApplicationDidUnhideNotification_VH: VarHandle by lazy { NSApplicationDidUnhideNotification_LAYOUT.varHandle() }

var NSApplicationDidUnhideNotification: MemorySegment
    get() = NSApplicationDidUnhideNotification_VH.get(NSApplicationDidUnhideNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationDidUnhideNotification_VH.set(NSApplicationDidUnhideNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationDidUpdateNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationDidUpdateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidUpdateNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidUpdateNotification").orElseThrow() }
private val NSApplicationDidUpdateNotification_VH: VarHandle by lazy { NSApplicationDidUpdateNotification_LAYOUT.varHandle() }

var NSApplicationDidUpdateNotification: MemorySegment
    get() = NSApplicationDidUpdateNotification_VH.get(NSApplicationDidUpdateNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationDidUpdateNotification_VH.set(NSApplicationDidUpdateNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationWillBecomeActiveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationWillBecomeActiveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationWillBecomeActiveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationWillBecomeActiveNotification").orElseThrow() }
private val NSApplicationWillBecomeActiveNotification_VH: VarHandle by lazy { NSApplicationWillBecomeActiveNotification_LAYOUT.varHandle() }

var NSApplicationWillBecomeActiveNotification: MemorySegment
    get() = NSApplicationWillBecomeActiveNotification_VH.get(NSApplicationWillBecomeActiveNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationWillBecomeActiveNotification_VH.set(NSApplicationWillBecomeActiveNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationWillHideNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationWillHideNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationWillHideNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationWillHideNotification").orElseThrow() }
private val NSApplicationWillHideNotification_VH: VarHandle by lazy { NSApplicationWillHideNotification_LAYOUT.varHandle() }

var NSApplicationWillHideNotification: MemorySegment
    get() = NSApplicationWillHideNotification_VH.get(NSApplicationWillHideNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationWillHideNotification_VH.set(NSApplicationWillHideNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationWillFinishLaunchingNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationWillFinishLaunchingNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationWillFinishLaunchingNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationWillFinishLaunchingNotification").orElseThrow() }
private val NSApplicationWillFinishLaunchingNotification_VH: VarHandle by lazy { NSApplicationWillFinishLaunchingNotification_LAYOUT.varHandle() }

var NSApplicationWillFinishLaunchingNotification: MemorySegment
    get() = NSApplicationWillFinishLaunchingNotification_VH.get(NSApplicationWillFinishLaunchingNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationWillFinishLaunchingNotification_VH.set(NSApplicationWillFinishLaunchingNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationWillResignActiveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationWillResignActiveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationWillResignActiveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationWillResignActiveNotification").orElseThrow() }
private val NSApplicationWillResignActiveNotification_VH: VarHandle by lazy { NSApplicationWillResignActiveNotification_LAYOUT.varHandle() }

var NSApplicationWillResignActiveNotification: MemorySegment
    get() = NSApplicationWillResignActiveNotification_VH.get(NSApplicationWillResignActiveNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationWillResignActiveNotification_VH.set(NSApplicationWillResignActiveNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationWillUnhideNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationWillUnhideNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationWillUnhideNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationWillUnhideNotification").orElseThrow() }
private val NSApplicationWillUnhideNotification_VH: VarHandle by lazy { NSApplicationWillUnhideNotification_LAYOUT.varHandle() }

var NSApplicationWillUnhideNotification: MemorySegment
    get() = NSApplicationWillUnhideNotification_VH.get(NSApplicationWillUnhideNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationWillUnhideNotification_VH.set(NSApplicationWillUnhideNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationWillUpdateNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationWillUpdateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationWillUpdateNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationWillUpdateNotification").orElseThrow() }
private val NSApplicationWillUpdateNotification_VH: VarHandle by lazy { NSApplicationWillUpdateNotification_LAYOUT.varHandle() }

var NSApplicationWillUpdateNotification: MemorySegment
    get() = NSApplicationWillUpdateNotification_VH.get(NSApplicationWillUpdateNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationWillUpdateNotification_VH.set(NSApplicationWillUpdateNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationWillTerminateNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationWillTerminateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationWillTerminateNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationWillTerminateNotification").orElseThrow() }
private val NSApplicationWillTerminateNotification_VH: VarHandle by lazy { NSApplicationWillTerminateNotification_LAYOUT.varHandle() }

var NSApplicationWillTerminateNotification: MemorySegment
    get() = NSApplicationWillTerminateNotification_VH.get(NSApplicationWillTerminateNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationWillTerminateNotification_VH.set(NSApplicationWillTerminateNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationDidChangeScreenParametersNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationDidChangeScreenParametersNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidChangeScreenParametersNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidChangeScreenParametersNotification").orElseThrow() }
private val NSApplicationDidChangeScreenParametersNotification_VH: VarHandle by lazy { NSApplicationDidChangeScreenParametersNotification_LAYOUT.varHandle() }

var NSApplicationDidChangeScreenParametersNotification: MemorySegment
    get() = NSApplicationDidChangeScreenParametersNotification_VH.get(NSApplicationDidChangeScreenParametersNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationDidChangeScreenParametersNotification_VH.set(NSApplicationDidChangeScreenParametersNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationProtectedDataWillBecomeUnavailableNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationProtectedDataWillBecomeUnavailableNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationProtectedDataWillBecomeUnavailableNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationProtectedDataWillBecomeUnavailableNotification").orElseThrow() }
private val NSApplicationProtectedDataWillBecomeUnavailableNotification_VH: VarHandle by lazy { NSApplicationProtectedDataWillBecomeUnavailableNotification_LAYOUT.varHandle() }

var NSApplicationProtectedDataWillBecomeUnavailableNotification: MemorySegment
    get() = NSApplicationProtectedDataWillBecomeUnavailableNotification_VH.get(NSApplicationProtectedDataWillBecomeUnavailableNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationProtectedDataWillBecomeUnavailableNotification_VH.set(NSApplicationProtectedDataWillBecomeUnavailableNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationProtectedDataDidBecomeAvailableNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationProtectedDataDidBecomeAvailableNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationProtectedDataDidBecomeAvailableNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationProtectedDataDidBecomeAvailableNotification").orElseThrow() }
private val NSApplicationProtectedDataDidBecomeAvailableNotification_VH: VarHandle by lazy { NSApplicationProtectedDataDidBecomeAvailableNotification_LAYOUT.varHandle() }

var NSApplicationProtectedDataDidBecomeAvailableNotification: MemorySegment
    get() = NSApplicationProtectedDataDidBecomeAvailableNotification_VH.get(NSApplicationProtectedDataDidBecomeAvailableNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationProtectedDataDidBecomeAvailableNotification_VH.set(NSApplicationProtectedDataDidBecomeAvailableNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification").orElseThrow() }
private val NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification_VH: VarHandle by lazy { NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification_LAYOUT.varHandle() }

var NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification: MemorySegment
    get() = NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification_VH.get(NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification_VH.set(NSApplicationShouldBeginSuppressingHighDynamicRangeContentNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification").orElseThrow() }
private val NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification_VH: VarHandle by lazy { NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification_LAYOUT.varHandle() }

var NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification: MemorySegment
    get() = NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification_VH.get(NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification_VH.set(NSApplicationShouldEndSuppressingHighDynamicRangeContentNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationLaunchIsDefaultLaunchKey (Void)*
 */
private val NSApplicationLaunchIsDefaultLaunchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationLaunchIsDefaultLaunchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationLaunchIsDefaultLaunchKey").orElseThrow() }
private val NSApplicationLaunchIsDefaultLaunchKey_VH: VarHandle by lazy { NSApplicationLaunchIsDefaultLaunchKey_LAYOUT.varHandle() }

var NSApplicationLaunchIsDefaultLaunchKey: MemorySegment
    get() = NSApplicationLaunchIsDefaultLaunchKey_VH.get(NSApplicationLaunchIsDefaultLaunchKey_SEGMENT) as MemorySegment
    set(value) = NSApplicationLaunchIsDefaultLaunchKey_VH.set(NSApplicationLaunchIsDefaultLaunchKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationLaunchUserNotificationKey (Void)*
 */
private val NSApplicationLaunchUserNotificationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationLaunchUserNotificationKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationLaunchUserNotificationKey").orElseThrow() }
private val NSApplicationLaunchUserNotificationKey_VH: VarHandle by lazy { NSApplicationLaunchUserNotificationKey_LAYOUT.varHandle() }

var NSApplicationLaunchUserNotificationKey: MemorySegment
    get() = NSApplicationLaunchUserNotificationKey_VH.get(NSApplicationLaunchUserNotificationKey_SEGMENT) as MemorySegment
    set(value) = NSApplicationLaunchUserNotificationKey_VH.set(NSApplicationLaunchUserNotificationKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationLaunchRemoteNotificationKey (Void)*
 */
private val NSApplicationLaunchRemoteNotificationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationLaunchRemoteNotificationKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationLaunchRemoteNotificationKey").orElseThrow() }
private val NSApplicationLaunchRemoteNotificationKey_VH: VarHandle by lazy { NSApplicationLaunchRemoteNotificationKey_LAYOUT.varHandle() }

var NSApplicationLaunchRemoteNotificationKey: MemorySegment
    get() = NSApplicationLaunchRemoteNotificationKey_VH.get(NSApplicationLaunchRemoteNotificationKey_SEGMENT) as MemorySegment
    set(value) = NSApplicationLaunchRemoteNotificationKey_VH.set(NSApplicationLaunchRemoteNotificationKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSApplicationDidChangeOcclusionStateNotification typedef const NSNotificationName = (Void)*
 */
private val NSApplicationDidChangeOcclusionStateNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationDidChangeOcclusionStateNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationDidChangeOcclusionStateNotification").orElseThrow() }
private val NSApplicationDidChangeOcclusionStateNotification_VH: VarHandle by lazy { NSApplicationDidChangeOcclusionStateNotification_LAYOUT.varHandle() }

var NSApplicationDidChangeOcclusionStateNotification: MemorySegment
    get() = NSApplicationDidChangeOcclusionStateNotification_VH.get(NSApplicationDidChangeOcclusionStateNotification_SEGMENT) as MemorySegment
    set(value) = NSApplicationDidChangeOcclusionStateNotification_VH.set(NSApplicationDidChangeOcclusionStateNotification_SEGMENT, value)

/**
 * {@snippet lang=c : NSColorListDidChangeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSColorListDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSColorListDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSColorListDidChangeNotification").orElseThrow() }
private val NSColorListDidChangeNotification_VH: VarHandle by lazy { NSColorListDidChangeNotification_LAYOUT.varHandle() }

var NSColorListDidChangeNotification: MemorySegment
    get() = NSColorListDidChangeNotification_VH.get(NSColorListDidChangeNotification_SEGMENT) as MemorySegment
    set(value) = NSColorListDidChangeNotification_VH.set(NSColorListDidChangeNotification_SEGMENT, value)
