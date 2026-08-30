@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : NSAccessibilityShowDefaultUIAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityShowDefaultUIAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityShowDefaultUIAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityShowDefaultUIAction").orElseThrow().reinterpret(NSAccessibilityShowDefaultUIAction_LAYOUT.byteSize()) }
private val NSAccessibilityShowDefaultUIAction_VH: VarHandle by lazy { NSAccessibilityShowDefaultUIAction_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSAccessibilityShowDefaultUIAction: MemorySegment
    get() = NSAccessibilityShowDefaultUIAction_VH.get(NSAccessibilityShowDefaultUIAction_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityShowDefaultUIAction_VH.set(NSAccessibilityShowDefaultUIAction_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMainWindowChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityMainWindowChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMainWindowChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMainWindowChangedNotification").orElseThrow().reinterpret(NSAccessibilityMainWindowChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityMainWindowChangedNotification_VH: VarHandle by lazy { NSAccessibilityMainWindowChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityMainWindowChangedNotification: MemorySegment
    get() = NSAccessibilityMainWindowChangedNotification_VH.get(NSAccessibilityMainWindowChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMainWindowChangedNotification_VH.set(NSAccessibilityMainWindowChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityFocusedWindowChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityFocusedWindowChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFocusedWindowChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFocusedWindowChangedNotification").orElseThrow().reinterpret(NSAccessibilityFocusedWindowChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityFocusedWindowChangedNotification_VH: VarHandle by lazy { NSAccessibilityFocusedWindowChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityFocusedWindowChangedNotification: MemorySegment
    get() = NSAccessibilityFocusedWindowChangedNotification_VH.get(NSAccessibilityFocusedWindowChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityFocusedWindowChangedNotification_VH.set(NSAccessibilityFocusedWindowChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityFocusedUIElementChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityFocusedUIElementChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFocusedUIElementChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFocusedUIElementChangedNotification").orElseThrow().reinterpret(NSAccessibilityFocusedUIElementChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityFocusedUIElementChangedNotification_VH: VarHandle by lazy { NSAccessibilityFocusedUIElementChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityFocusedUIElementChangedNotification: MemorySegment
    get() = NSAccessibilityFocusedUIElementChangedNotification_VH.get(NSAccessibilityFocusedUIElementChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityFocusedUIElementChangedNotification_VH.set(NSAccessibilityFocusedUIElementChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityApplicationActivatedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityApplicationActivatedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityApplicationActivatedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityApplicationActivatedNotification").orElseThrow().reinterpret(NSAccessibilityApplicationActivatedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityApplicationActivatedNotification_VH: VarHandle by lazy { NSAccessibilityApplicationActivatedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityApplicationActivatedNotification: MemorySegment
    get() = NSAccessibilityApplicationActivatedNotification_VH.get(NSAccessibilityApplicationActivatedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityApplicationActivatedNotification_VH.set(NSAccessibilityApplicationActivatedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityApplicationDeactivatedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityApplicationDeactivatedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityApplicationDeactivatedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityApplicationDeactivatedNotification").orElseThrow().reinterpret(NSAccessibilityApplicationDeactivatedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityApplicationDeactivatedNotification_VH: VarHandle by lazy { NSAccessibilityApplicationDeactivatedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityApplicationDeactivatedNotification: MemorySegment
    get() = NSAccessibilityApplicationDeactivatedNotification_VH.get(NSAccessibilityApplicationDeactivatedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityApplicationDeactivatedNotification_VH.set(NSAccessibilityApplicationDeactivatedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityApplicationHiddenNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityApplicationHiddenNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityApplicationHiddenNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityApplicationHiddenNotification").orElseThrow().reinterpret(NSAccessibilityApplicationHiddenNotification_LAYOUT.byteSize()) }
private val NSAccessibilityApplicationHiddenNotification_VH: VarHandle by lazy { NSAccessibilityApplicationHiddenNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityApplicationHiddenNotification: MemorySegment
    get() = NSAccessibilityApplicationHiddenNotification_VH.get(NSAccessibilityApplicationHiddenNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityApplicationHiddenNotification_VH.set(NSAccessibilityApplicationHiddenNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityApplicationShownNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityApplicationShownNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityApplicationShownNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityApplicationShownNotification").orElseThrow().reinterpret(NSAccessibilityApplicationShownNotification_LAYOUT.byteSize()) }
private val NSAccessibilityApplicationShownNotification_VH: VarHandle by lazy { NSAccessibilityApplicationShownNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityApplicationShownNotification: MemorySegment
    get() = NSAccessibilityApplicationShownNotification_VH.get(NSAccessibilityApplicationShownNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityApplicationShownNotification_VH.set(NSAccessibilityApplicationShownNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityWindowCreatedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityWindowCreatedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWindowCreatedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWindowCreatedNotification").orElseThrow().reinterpret(NSAccessibilityWindowCreatedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityWindowCreatedNotification_VH: VarHandle by lazy { NSAccessibilityWindowCreatedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityWindowCreatedNotification: MemorySegment
    get() = NSAccessibilityWindowCreatedNotification_VH.get(NSAccessibilityWindowCreatedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityWindowCreatedNotification_VH.set(NSAccessibilityWindowCreatedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityWindowMovedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityWindowMovedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWindowMovedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWindowMovedNotification").orElseThrow().reinterpret(NSAccessibilityWindowMovedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityWindowMovedNotification_VH: VarHandle by lazy { NSAccessibilityWindowMovedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityWindowMovedNotification: MemorySegment
    get() = NSAccessibilityWindowMovedNotification_VH.get(NSAccessibilityWindowMovedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityWindowMovedNotification_VH.set(NSAccessibilityWindowMovedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityWindowResizedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityWindowResizedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWindowResizedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWindowResizedNotification").orElseThrow().reinterpret(NSAccessibilityWindowResizedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityWindowResizedNotification_VH: VarHandle by lazy { NSAccessibilityWindowResizedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityWindowResizedNotification: MemorySegment
    get() = NSAccessibilityWindowResizedNotification_VH.get(NSAccessibilityWindowResizedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityWindowResizedNotification_VH.set(NSAccessibilityWindowResizedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityWindowMiniaturizedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityWindowMiniaturizedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWindowMiniaturizedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWindowMiniaturizedNotification").orElseThrow().reinterpret(NSAccessibilityWindowMiniaturizedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityWindowMiniaturizedNotification_VH: VarHandle by lazy { NSAccessibilityWindowMiniaturizedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityWindowMiniaturizedNotification: MemorySegment
    get() = NSAccessibilityWindowMiniaturizedNotification_VH.get(NSAccessibilityWindowMiniaturizedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityWindowMiniaturizedNotification_VH.set(NSAccessibilityWindowMiniaturizedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityWindowDeminiaturizedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityWindowDeminiaturizedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWindowDeminiaturizedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWindowDeminiaturizedNotification").orElseThrow().reinterpret(NSAccessibilityWindowDeminiaturizedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityWindowDeminiaturizedNotification_VH: VarHandle by lazy { NSAccessibilityWindowDeminiaturizedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityWindowDeminiaturizedNotification: MemorySegment
    get() = NSAccessibilityWindowDeminiaturizedNotification_VH.get(NSAccessibilityWindowDeminiaturizedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityWindowDeminiaturizedNotification_VH.set(NSAccessibilityWindowDeminiaturizedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDrawerCreatedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityDrawerCreatedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDrawerCreatedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDrawerCreatedNotification").orElseThrow().reinterpret(NSAccessibilityDrawerCreatedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityDrawerCreatedNotification_VH: VarHandle by lazy { NSAccessibilityDrawerCreatedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityDrawerCreatedNotification: MemorySegment
    get() = NSAccessibilityDrawerCreatedNotification_VH.get(NSAccessibilityDrawerCreatedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDrawerCreatedNotification_VH.set(NSAccessibilityDrawerCreatedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySheetCreatedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilitySheetCreatedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySheetCreatedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySheetCreatedNotification").orElseThrow().reinterpret(NSAccessibilitySheetCreatedNotification_LAYOUT.byteSize()) }
private val NSAccessibilitySheetCreatedNotification_VH: VarHandle by lazy { NSAccessibilitySheetCreatedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySheetCreatedNotification: MemorySegment
    get() = NSAccessibilitySheetCreatedNotification_VH.get(NSAccessibilitySheetCreatedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySheetCreatedNotification_VH.set(NSAccessibilitySheetCreatedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityUIElementDestroyedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityUIElementDestroyedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUIElementDestroyedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUIElementDestroyedNotification").orElseThrow().reinterpret(NSAccessibilityUIElementDestroyedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityUIElementDestroyedNotification_VH: VarHandle by lazy { NSAccessibilityUIElementDestroyedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityUIElementDestroyedNotification: MemorySegment
    get() = NSAccessibilityUIElementDestroyedNotification_VH.get(NSAccessibilityUIElementDestroyedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityUIElementDestroyedNotification_VH.set(NSAccessibilityUIElementDestroyedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityValueChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityValueChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityValueChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityValueChangedNotification").orElseThrow().reinterpret(NSAccessibilityValueChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityValueChangedNotification_VH: VarHandle by lazy { NSAccessibilityValueChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityValueChangedNotification: MemorySegment
    get() = NSAccessibilityValueChangedNotification_VH.get(NSAccessibilityValueChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityValueChangedNotification_VH.set(NSAccessibilityValueChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTitleChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityTitleChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTitleChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTitleChangedNotification").orElseThrow().reinterpret(NSAccessibilityTitleChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityTitleChangedNotification_VH: VarHandle by lazy { NSAccessibilityTitleChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityTitleChangedNotification: MemorySegment
    get() = NSAccessibilityTitleChangedNotification_VH.get(NSAccessibilityTitleChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTitleChangedNotification_VH.set(NSAccessibilityTitleChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityResizedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityResizedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityResizedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityResizedNotification").orElseThrow().reinterpret(NSAccessibilityResizedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityResizedNotification_VH: VarHandle by lazy { NSAccessibilityResizedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityResizedNotification: MemorySegment
    get() = NSAccessibilityResizedNotification_VH.get(NSAccessibilityResizedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityResizedNotification_VH.set(NSAccessibilityResizedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMovedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityMovedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMovedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMovedNotification").orElseThrow().reinterpret(NSAccessibilityMovedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityMovedNotification_VH: VarHandle by lazy { NSAccessibilityMovedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityMovedNotification: MemorySegment
    get() = NSAccessibilityMovedNotification_VH.get(NSAccessibilityMovedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMovedNotification_VH.set(NSAccessibilityMovedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityCreatedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityCreatedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCreatedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCreatedNotification").orElseThrow().reinterpret(NSAccessibilityCreatedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityCreatedNotification_VH: VarHandle by lazy { NSAccessibilityCreatedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityCreatedNotification: MemorySegment
    get() = NSAccessibilityCreatedNotification_VH.get(NSAccessibilityCreatedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityCreatedNotification_VH.set(NSAccessibilityCreatedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityLayoutChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityLayoutChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLayoutChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLayoutChangedNotification").orElseThrow().reinterpret(NSAccessibilityLayoutChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityLayoutChangedNotification_VH: VarHandle by lazy { NSAccessibilityLayoutChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSAccessibilityLayoutChangedNotification: MemorySegment
    get() = NSAccessibilityLayoutChangedNotification_VH.get(NSAccessibilityLayoutChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityLayoutChangedNotification_VH.set(NSAccessibilityLayoutChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHelpTagCreatedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityHelpTagCreatedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHelpTagCreatedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHelpTagCreatedNotification").orElseThrow().reinterpret(NSAccessibilityHelpTagCreatedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityHelpTagCreatedNotification_VH: VarHandle by lazy { NSAccessibilityHelpTagCreatedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityHelpTagCreatedNotification: MemorySegment
    get() = NSAccessibilityHelpTagCreatedNotification_VH.get(NSAccessibilityHelpTagCreatedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHelpTagCreatedNotification_VH.set(NSAccessibilityHelpTagCreatedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedTextChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilitySelectedTextChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedTextChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedTextChangedNotification").orElseThrow().reinterpret(NSAccessibilitySelectedTextChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilitySelectedTextChangedNotification_VH: VarHandle by lazy { NSAccessibilitySelectedTextChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySelectedTextChangedNotification: MemorySegment
    get() = NSAccessibilitySelectedTextChangedNotification_VH.get(NSAccessibilitySelectedTextChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySelectedTextChangedNotification_VH.set(NSAccessibilitySelectedTextChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRowCountChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityRowCountChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRowCountChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRowCountChangedNotification").orElseThrow().reinterpret(NSAccessibilityRowCountChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityRowCountChangedNotification_VH: VarHandle by lazy { NSAccessibilityRowCountChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityRowCountChangedNotification: MemorySegment
    get() = NSAccessibilityRowCountChangedNotification_VH.get(NSAccessibilityRowCountChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRowCountChangedNotification_VH.set(NSAccessibilityRowCountChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedChildrenChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilitySelectedChildrenChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedChildrenChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedChildrenChangedNotification").orElseThrow().reinterpret(NSAccessibilitySelectedChildrenChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilitySelectedChildrenChangedNotification_VH: VarHandle by lazy { NSAccessibilitySelectedChildrenChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySelectedChildrenChangedNotification: MemorySegment
    get() = NSAccessibilitySelectedChildrenChangedNotification_VH.get(NSAccessibilitySelectedChildrenChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySelectedChildrenChangedNotification_VH.set(NSAccessibilitySelectedChildrenChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedRowsChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilitySelectedRowsChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedRowsChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedRowsChangedNotification").orElseThrow().reinterpret(NSAccessibilitySelectedRowsChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilitySelectedRowsChangedNotification_VH: VarHandle by lazy { NSAccessibilitySelectedRowsChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySelectedRowsChangedNotification: MemorySegment
    get() = NSAccessibilitySelectedRowsChangedNotification_VH.get(NSAccessibilitySelectedRowsChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySelectedRowsChangedNotification_VH.set(NSAccessibilitySelectedRowsChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedColumnsChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilitySelectedColumnsChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedColumnsChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedColumnsChangedNotification").orElseThrow().reinterpret(NSAccessibilitySelectedColumnsChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilitySelectedColumnsChangedNotification_VH: VarHandle by lazy { NSAccessibilitySelectedColumnsChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySelectedColumnsChangedNotification: MemorySegment
    get() = NSAccessibilitySelectedColumnsChangedNotification_VH.get(NSAccessibilitySelectedColumnsChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySelectedColumnsChangedNotification_VH.set(NSAccessibilitySelectedColumnsChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRowExpandedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityRowExpandedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRowExpandedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRowExpandedNotification").orElseThrow().reinterpret(NSAccessibilityRowExpandedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityRowExpandedNotification_VH: VarHandle by lazy { NSAccessibilityRowExpandedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityRowExpandedNotification: MemorySegment
    get() = NSAccessibilityRowExpandedNotification_VH.get(NSAccessibilityRowExpandedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRowExpandedNotification_VH.set(NSAccessibilityRowExpandedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRowCollapsedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityRowCollapsedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRowCollapsedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRowCollapsedNotification").orElseThrow().reinterpret(NSAccessibilityRowCollapsedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityRowCollapsedNotification_VH: VarHandle by lazy { NSAccessibilityRowCollapsedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityRowCollapsedNotification: MemorySegment
    get() = NSAccessibilityRowCollapsedNotification_VH.get(NSAccessibilityRowCollapsedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRowCollapsedNotification_VH.set(NSAccessibilityRowCollapsedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityAutocorrectionOccurredNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityAutocorrectionOccurredNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAutocorrectionOccurredNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAutocorrectionOccurredNotification").orElseThrow().reinterpret(NSAccessibilityAutocorrectionOccurredNotification_LAYOUT.byteSize()) }
private val NSAccessibilityAutocorrectionOccurredNotification_VH: VarHandle by lazy { NSAccessibilityAutocorrectionOccurredNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityAutocorrectionOccurredNotification: MemorySegment
    get() = NSAccessibilityAutocorrectionOccurredNotification_VH.get(NSAccessibilityAutocorrectionOccurredNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityAutocorrectionOccurredNotification_VH.set(NSAccessibilityAutocorrectionOccurredNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextInputMarkingSessionBeganNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityTextInputMarkingSessionBeganNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextInputMarkingSessionBeganNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextInputMarkingSessionBeganNotification").orElseThrow().reinterpret(NSAccessibilityTextInputMarkingSessionBeganNotification_LAYOUT.byteSize()) }
private val NSAccessibilityTextInputMarkingSessionBeganNotification_VH: VarHandle by lazy { NSAccessibilityTextInputMarkingSessionBeganNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityTextInputMarkingSessionBeganNotification: MemorySegment
    get() = NSAccessibilityTextInputMarkingSessionBeganNotification_VH.get(NSAccessibilityTextInputMarkingSessionBeganNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextInputMarkingSessionBeganNotification_VH.set(NSAccessibilityTextInputMarkingSessionBeganNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextInputMarkingSessionEndedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityTextInputMarkingSessionEndedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextInputMarkingSessionEndedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextInputMarkingSessionEndedNotification").orElseThrow().reinterpret(NSAccessibilityTextInputMarkingSessionEndedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityTextInputMarkingSessionEndedNotification_VH: VarHandle by lazy { NSAccessibilityTextInputMarkingSessionEndedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityTextInputMarkingSessionEndedNotification: MemorySegment
    get() = NSAccessibilityTextInputMarkingSessionEndedNotification_VH.get(NSAccessibilityTextInputMarkingSessionEndedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextInputMarkingSessionEndedNotification_VH.set(NSAccessibilityTextInputMarkingSessionEndedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDraggingSourceDragBeganNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityDraggingSourceDragBeganNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDraggingSourceDragBeganNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDraggingSourceDragBeganNotification").orElseThrow().reinterpret(NSAccessibilityDraggingSourceDragBeganNotification_LAYOUT.byteSize()) }
private val NSAccessibilityDraggingSourceDragBeganNotification_VH: VarHandle by lazy { NSAccessibilityDraggingSourceDragBeganNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityDraggingSourceDragBeganNotification: MemorySegment
    get() = NSAccessibilityDraggingSourceDragBeganNotification_VH.get(NSAccessibilityDraggingSourceDragBeganNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDraggingSourceDragBeganNotification_VH.set(NSAccessibilityDraggingSourceDragBeganNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDraggingSourceDragEndedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityDraggingSourceDragEndedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDraggingSourceDragEndedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDraggingSourceDragEndedNotification").orElseThrow().reinterpret(NSAccessibilityDraggingSourceDragEndedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityDraggingSourceDragEndedNotification_VH: VarHandle by lazy { NSAccessibilityDraggingSourceDragEndedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityDraggingSourceDragEndedNotification: MemorySegment
    get() = NSAccessibilityDraggingSourceDragEndedNotification_VH.get(NSAccessibilityDraggingSourceDragEndedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDraggingSourceDragEndedNotification_VH.set(NSAccessibilityDraggingSourceDragEndedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDraggingDestinationDropAllowedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityDraggingDestinationDropAllowedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDraggingDestinationDropAllowedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDraggingDestinationDropAllowedNotification").orElseThrow().reinterpret(NSAccessibilityDraggingDestinationDropAllowedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityDraggingDestinationDropAllowedNotification_VH: VarHandle by lazy { NSAccessibilityDraggingDestinationDropAllowedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityDraggingDestinationDropAllowedNotification: MemorySegment
    get() = NSAccessibilityDraggingDestinationDropAllowedNotification_VH.get(NSAccessibilityDraggingDestinationDropAllowedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDraggingDestinationDropAllowedNotification_VH.set(NSAccessibilityDraggingDestinationDropAllowedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDraggingDestinationDropNotAllowedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityDraggingDestinationDropNotAllowedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDraggingDestinationDropNotAllowedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDraggingDestinationDropNotAllowedNotification").orElseThrow().reinterpret(NSAccessibilityDraggingDestinationDropNotAllowedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityDraggingDestinationDropNotAllowedNotification_VH: VarHandle by lazy { NSAccessibilityDraggingDestinationDropNotAllowedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityDraggingDestinationDropNotAllowedNotification: MemorySegment
    get() = NSAccessibilityDraggingDestinationDropNotAllowedNotification_VH.get(NSAccessibilityDraggingDestinationDropNotAllowedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDraggingDestinationDropNotAllowedNotification_VH.set(NSAccessibilityDraggingDestinationDropNotAllowedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDraggingDestinationDragAcceptedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityDraggingDestinationDragAcceptedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDraggingDestinationDragAcceptedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDraggingDestinationDragAcceptedNotification").orElseThrow().reinterpret(NSAccessibilityDraggingDestinationDragAcceptedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityDraggingDestinationDragAcceptedNotification_VH: VarHandle by lazy { NSAccessibilityDraggingDestinationDragAcceptedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityDraggingDestinationDragAcceptedNotification: MemorySegment
    get() = NSAccessibilityDraggingDestinationDragAcceptedNotification_VH.get(NSAccessibilityDraggingDestinationDragAcceptedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDraggingDestinationDragAcceptedNotification_VH.set(NSAccessibilityDraggingDestinationDragAcceptedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDraggingDestinationDragNotAcceptedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityDraggingDestinationDragNotAcceptedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDraggingDestinationDragNotAcceptedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDraggingDestinationDragNotAcceptedNotification").orElseThrow().reinterpret(NSAccessibilityDraggingDestinationDragNotAcceptedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityDraggingDestinationDragNotAcceptedNotification_VH: VarHandle by lazy { NSAccessibilityDraggingDestinationDragNotAcceptedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityDraggingDestinationDragNotAcceptedNotification: MemorySegment
    get() = NSAccessibilityDraggingDestinationDragNotAcceptedNotification_VH.get(NSAccessibilityDraggingDestinationDragNotAcceptedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDraggingDestinationDragNotAcceptedNotification_VH.set(NSAccessibilityDraggingDestinationDragNotAcceptedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedCellsChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilitySelectedCellsChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedCellsChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedCellsChangedNotification").orElseThrow().reinterpret(NSAccessibilitySelectedCellsChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilitySelectedCellsChangedNotification_VH: VarHandle by lazy { NSAccessibilitySelectedCellsChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilitySelectedCellsChangedNotification: MemorySegment
    get() = NSAccessibilitySelectedCellsChangedNotification_VH.get(NSAccessibilitySelectedCellsChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySelectedCellsChangedNotification_VH.set(NSAccessibilitySelectedCellsChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityUnitsChangedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityUnitsChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnitsChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnitsChangedNotification").orElseThrow().reinterpret(NSAccessibilityUnitsChangedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityUnitsChangedNotification_VH: VarHandle by lazy { NSAccessibilityUnitsChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityUnitsChangedNotification: MemorySegment
    get() = NSAccessibilityUnitsChangedNotification_VH.get(NSAccessibilityUnitsChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityUnitsChangedNotification_VH.set(NSAccessibilityUnitsChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedChildrenMovedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilitySelectedChildrenMovedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedChildrenMovedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedChildrenMovedNotification").orElseThrow().reinterpret(NSAccessibilitySelectedChildrenMovedNotification_LAYOUT.byteSize()) }
private val NSAccessibilitySelectedChildrenMovedNotification_VH: VarHandle by lazy { NSAccessibilitySelectedChildrenMovedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilitySelectedChildrenMovedNotification: MemorySegment
    get() = NSAccessibilitySelectedChildrenMovedNotification_VH.get(NSAccessibilitySelectedChildrenMovedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySelectedChildrenMovedNotification_VH.set(NSAccessibilitySelectedChildrenMovedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityAnnouncementRequestedNotification typedef const NSAccessibilityNotificationName = (Void)*
 */
private val NSAccessibilityAnnouncementRequestedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAnnouncementRequestedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAnnouncementRequestedNotification").orElseThrow().reinterpret(NSAccessibilityAnnouncementRequestedNotification_LAYOUT.byteSize()) }
private val NSAccessibilityAnnouncementRequestedNotification_VH: VarHandle by lazy { NSAccessibilityAnnouncementRequestedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSAccessibilityAnnouncementRequestedNotification: MemorySegment
    get() = NSAccessibilityAnnouncementRequestedNotification_VH.get(NSAccessibilityAnnouncementRequestedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityAnnouncementRequestedNotification_VH.set(NSAccessibilityAnnouncementRequestedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityUnknownRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityUnknownRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnknownRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnknownRole").orElseThrow().reinterpret(NSAccessibilityUnknownRole_LAYOUT.byteSize()) }
private val NSAccessibilityUnknownRole_VH: VarHandle by lazy { NSAccessibilityUnknownRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityUnknownRole: MemorySegment
    get() = NSAccessibilityUnknownRole_VH.get(NSAccessibilityUnknownRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityUnknownRole_VH.set(NSAccessibilityUnknownRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityButtonRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityButtonRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityButtonRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityButtonRole").orElseThrow().reinterpret(NSAccessibilityButtonRole_LAYOUT.byteSize()) }
private val NSAccessibilityButtonRole_VH: VarHandle by lazy { NSAccessibilityButtonRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityButtonRole: MemorySegment
    get() = NSAccessibilityButtonRole_VH.get(NSAccessibilityButtonRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityButtonRole_VH.set(NSAccessibilityButtonRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRadioButtonRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityRadioButtonRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRadioButtonRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRadioButtonRole").orElseThrow().reinterpret(NSAccessibilityRadioButtonRole_LAYOUT.byteSize()) }
private val NSAccessibilityRadioButtonRole_VH: VarHandle by lazy { NSAccessibilityRadioButtonRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityRadioButtonRole: MemorySegment
    get() = NSAccessibilityRadioButtonRole_VH.get(NSAccessibilityRadioButtonRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRadioButtonRole_VH.set(NSAccessibilityRadioButtonRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityCheckBoxRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityCheckBoxRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCheckBoxRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCheckBoxRole").orElseThrow().reinterpret(NSAccessibilityCheckBoxRole_LAYOUT.byteSize()) }
private val NSAccessibilityCheckBoxRole_VH: VarHandle by lazy { NSAccessibilityCheckBoxRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityCheckBoxRole: MemorySegment
    get() = NSAccessibilityCheckBoxRole_VH.get(NSAccessibilityCheckBoxRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityCheckBoxRole_VH.set(NSAccessibilityCheckBoxRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySliderRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilitySliderRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySliderRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySliderRole").orElseThrow().reinterpret(NSAccessibilitySliderRole_LAYOUT.byteSize()) }
private val NSAccessibilitySliderRole_VH: VarHandle by lazy { NSAccessibilitySliderRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySliderRole: MemorySegment
    get() = NSAccessibilitySliderRole_VH.get(NSAccessibilitySliderRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySliderRole_VH.set(NSAccessibilitySliderRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTabGroupRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityTabGroupRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTabGroupRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTabGroupRole").orElseThrow().reinterpret(NSAccessibilityTabGroupRole_LAYOUT.byteSize()) }
private val NSAccessibilityTabGroupRole_VH: VarHandle by lazy { NSAccessibilityTabGroupRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityTabGroupRole: MemorySegment
    get() = NSAccessibilityTabGroupRole_VH.get(NSAccessibilityTabGroupRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTabGroupRole_VH.set(NSAccessibilityTabGroupRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextFieldRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityTextFieldRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextFieldRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextFieldRole").orElseThrow().reinterpret(NSAccessibilityTextFieldRole_LAYOUT.byteSize()) }
private val NSAccessibilityTextFieldRole_VH: VarHandle by lazy { NSAccessibilityTextFieldRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityTextFieldRole: MemorySegment
    get() = NSAccessibilityTextFieldRole_VH.get(NSAccessibilityTextFieldRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextFieldRole_VH.set(NSAccessibilityTextFieldRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityStaticTextRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityStaticTextRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityStaticTextRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityStaticTextRole").orElseThrow().reinterpret(NSAccessibilityStaticTextRole_LAYOUT.byteSize()) }
private val NSAccessibilityStaticTextRole_VH: VarHandle by lazy { NSAccessibilityStaticTextRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityStaticTextRole: MemorySegment
    get() = NSAccessibilityStaticTextRole_VH.get(NSAccessibilityStaticTextRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityStaticTextRole_VH.set(NSAccessibilityStaticTextRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextAreaRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityTextAreaRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextAreaRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextAreaRole").orElseThrow().reinterpret(NSAccessibilityTextAreaRole_LAYOUT.byteSize()) }
private val NSAccessibilityTextAreaRole_VH: VarHandle by lazy { NSAccessibilityTextAreaRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityTextAreaRole: MemorySegment
    get() = NSAccessibilityTextAreaRole_VH.get(NSAccessibilityTextAreaRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextAreaRole_VH.set(NSAccessibilityTextAreaRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityScrollAreaRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityScrollAreaRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityScrollAreaRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityScrollAreaRole").orElseThrow().reinterpret(NSAccessibilityScrollAreaRole_LAYOUT.byteSize()) }
private val NSAccessibilityScrollAreaRole_VH: VarHandle by lazy { NSAccessibilityScrollAreaRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityScrollAreaRole: MemorySegment
    get() = NSAccessibilityScrollAreaRole_VH.get(NSAccessibilityScrollAreaRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityScrollAreaRole_VH.set(NSAccessibilityScrollAreaRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityPopUpButtonRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityPopUpButtonRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPopUpButtonRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPopUpButtonRole").orElseThrow().reinterpret(NSAccessibilityPopUpButtonRole_LAYOUT.byteSize()) }
private val NSAccessibilityPopUpButtonRole_VH: VarHandle by lazy { NSAccessibilityPopUpButtonRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityPopUpButtonRole: MemorySegment
    get() = NSAccessibilityPopUpButtonRole_VH.get(NSAccessibilityPopUpButtonRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityPopUpButtonRole_VH.set(NSAccessibilityPopUpButtonRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMenuButtonRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityMenuButtonRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMenuButtonRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMenuButtonRole").orElseThrow().reinterpret(NSAccessibilityMenuButtonRole_LAYOUT.byteSize()) }
private val NSAccessibilityMenuButtonRole_VH: VarHandle by lazy { NSAccessibilityMenuButtonRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityMenuButtonRole: MemorySegment
    get() = NSAccessibilityMenuButtonRole_VH.get(NSAccessibilityMenuButtonRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMenuButtonRole_VH.set(NSAccessibilityMenuButtonRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTableRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityTableRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTableRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTableRole").orElseThrow().reinterpret(NSAccessibilityTableRole_LAYOUT.byteSize()) }
private val NSAccessibilityTableRole_VH: VarHandle by lazy { NSAccessibilityTableRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityTableRole: MemorySegment
    get() = NSAccessibilityTableRole_VH.get(NSAccessibilityTableRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTableRole_VH.set(NSAccessibilityTableRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityApplicationRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityApplicationRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityApplicationRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityApplicationRole").orElseThrow().reinterpret(NSAccessibilityApplicationRole_LAYOUT.byteSize()) }
private val NSAccessibilityApplicationRole_VH: VarHandle by lazy { NSAccessibilityApplicationRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityApplicationRole: MemorySegment
    get() = NSAccessibilityApplicationRole_VH.get(NSAccessibilityApplicationRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityApplicationRole_VH.set(NSAccessibilityApplicationRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityGroupRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityGroupRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityGroupRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityGroupRole").orElseThrow().reinterpret(NSAccessibilityGroupRole_LAYOUT.byteSize()) }
private val NSAccessibilityGroupRole_VH: VarHandle by lazy { NSAccessibilityGroupRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityGroupRole: MemorySegment
    get() = NSAccessibilityGroupRole_VH.get(NSAccessibilityGroupRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityGroupRole_VH.set(NSAccessibilityGroupRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRadioGroupRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityRadioGroupRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRadioGroupRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRadioGroupRole").orElseThrow().reinterpret(NSAccessibilityRadioGroupRole_LAYOUT.byteSize()) }
private val NSAccessibilityRadioGroupRole_VH: VarHandle by lazy { NSAccessibilityRadioGroupRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityRadioGroupRole: MemorySegment
    get() = NSAccessibilityRadioGroupRole_VH.get(NSAccessibilityRadioGroupRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRadioGroupRole_VH.set(NSAccessibilityRadioGroupRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityListRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityListRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityListRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityListRole").orElseThrow().reinterpret(NSAccessibilityListRole_LAYOUT.byteSize()) }
private val NSAccessibilityListRole_VH: VarHandle by lazy { NSAccessibilityListRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityListRole: MemorySegment
    get() = NSAccessibilityListRole_VH.get(NSAccessibilityListRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityListRole_VH.set(NSAccessibilityListRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityScrollBarRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityScrollBarRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityScrollBarRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityScrollBarRole").orElseThrow().reinterpret(NSAccessibilityScrollBarRole_LAYOUT.byteSize()) }
private val NSAccessibilityScrollBarRole_VH: VarHandle by lazy { NSAccessibilityScrollBarRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityScrollBarRole: MemorySegment
    get() = NSAccessibilityScrollBarRole_VH.get(NSAccessibilityScrollBarRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityScrollBarRole_VH.set(NSAccessibilityScrollBarRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityValueIndicatorRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityValueIndicatorRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityValueIndicatorRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityValueIndicatorRole").orElseThrow().reinterpret(NSAccessibilityValueIndicatorRole_LAYOUT.byteSize()) }
private val NSAccessibilityValueIndicatorRole_VH: VarHandle by lazy { NSAccessibilityValueIndicatorRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityValueIndicatorRole: MemorySegment
    get() = NSAccessibilityValueIndicatorRole_VH.get(NSAccessibilityValueIndicatorRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityValueIndicatorRole_VH.set(NSAccessibilityValueIndicatorRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityImageRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityImageRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityImageRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityImageRole").orElseThrow().reinterpret(NSAccessibilityImageRole_LAYOUT.byteSize()) }
private val NSAccessibilityImageRole_VH: VarHandle by lazy { NSAccessibilityImageRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityImageRole: MemorySegment
    get() = NSAccessibilityImageRole_VH.get(NSAccessibilityImageRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityImageRole_VH.set(NSAccessibilityImageRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMenuBarRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityMenuBarRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMenuBarRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMenuBarRole").orElseThrow().reinterpret(NSAccessibilityMenuBarRole_LAYOUT.byteSize()) }
private val NSAccessibilityMenuBarRole_VH: VarHandle by lazy { NSAccessibilityMenuBarRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityMenuBarRole: MemorySegment
    get() = NSAccessibilityMenuBarRole_VH.get(NSAccessibilityMenuBarRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMenuBarRole_VH.set(NSAccessibilityMenuBarRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMenuBarItemRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityMenuBarItemRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMenuBarItemRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMenuBarItemRole").orElseThrow().reinterpret(NSAccessibilityMenuBarItemRole_LAYOUT.byteSize()) }
private val NSAccessibilityMenuBarItemRole_VH: VarHandle by lazy { NSAccessibilityMenuBarItemRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilityMenuBarItemRole: MemorySegment
    get() = NSAccessibilityMenuBarItemRole_VH.get(NSAccessibilityMenuBarItemRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMenuBarItemRole_VH.set(NSAccessibilityMenuBarItemRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMenuRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityMenuRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMenuRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMenuRole").orElseThrow().reinterpret(NSAccessibilityMenuRole_LAYOUT.byteSize()) }
private val NSAccessibilityMenuRole_VH: VarHandle by lazy { NSAccessibilityMenuRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityMenuRole: MemorySegment
    get() = NSAccessibilityMenuRole_VH.get(NSAccessibilityMenuRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMenuRole_VH.set(NSAccessibilityMenuRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMenuItemRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityMenuItemRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMenuItemRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMenuItemRole").orElseThrow().reinterpret(NSAccessibilityMenuItemRole_LAYOUT.byteSize()) }
private val NSAccessibilityMenuItemRole_VH: VarHandle by lazy { NSAccessibilityMenuItemRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityMenuItemRole: MemorySegment
    get() = NSAccessibilityMenuItemRole_VH.get(NSAccessibilityMenuItemRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMenuItemRole_VH.set(NSAccessibilityMenuItemRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityColumnRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityColumnRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityColumnRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityColumnRole").orElseThrow().reinterpret(NSAccessibilityColumnRole_LAYOUT.byteSize()) }
private val NSAccessibilityColumnRole_VH: VarHandle by lazy { NSAccessibilityColumnRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityColumnRole: MemorySegment
    get() = NSAccessibilityColumnRole_VH.get(NSAccessibilityColumnRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityColumnRole_VH.set(NSAccessibilityColumnRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRowRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityRowRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRowRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRowRole").orElseThrow().reinterpret(NSAccessibilityRowRole_LAYOUT.byteSize()) }
private val NSAccessibilityRowRole_VH: VarHandle by lazy { NSAccessibilityRowRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityRowRole: MemorySegment
    get() = NSAccessibilityRowRole_VH.get(NSAccessibilityRowRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRowRole_VH.set(NSAccessibilityRowRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityToolbarRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityToolbarRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityToolbarRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityToolbarRole").orElseThrow().reinterpret(NSAccessibilityToolbarRole_LAYOUT.byteSize()) }
private val NSAccessibilityToolbarRole_VH: VarHandle by lazy { NSAccessibilityToolbarRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityToolbarRole: MemorySegment
    get() = NSAccessibilityToolbarRole_VH.get(NSAccessibilityToolbarRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityToolbarRole_VH.set(NSAccessibilityToolbarRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityBusyIndicatorRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityBusyIndicatorRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityBusyIndicatorRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityBusyIndicatorRole").orElseThrow().reinterpret(NSAccessibilityBusyIndicatorRole_LAYOUT.byteSize()) }
private val NSAccessibilityBusyIndicatorRole_VH: VarHandle by lazy { NSAccessibilityBusyIndicatorRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityBusyIndicatorRole: MemorySegment
    get() = NSAccessibilityBusyIndicatorRole_VH.get(NSAccessibilityBusyIndicatorRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityBusyIndicatorRole_VH.set(NSAccessibilityBusyIndicatorRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityProgressIndicatorRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityProgressIndicatorRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityProgressIndicatorRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityProgressIndicatorRole").orElseThrow().reinterpret(NSAccessibilityProgressIndicatorRole_LAYOUT.byteSize()) }
private val NSAccessibilityProgressIndicatorRole_VH: VarHandle by lazy { NSAccessibilityProgressIndicatorRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityProgressIndicatorRole: MemorySegment
    get() = NSAccessibilityProgressIndicatorRole_VH.get(NSAccessibilityProgressIndicatorRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityProgressIndicatorRole_VH.set(NSAccessibilityProgressIndicatorRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityWindowRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityWindowRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWindowRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWindowRole").orElseThrow().reinterpret(NSAccessibilityWindowRole_LAYOUT.byteSize()) }
private val NSAccessibilityWindowRole_VH: VarHandle by lazy { NSAccessibilityWindowRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityWindowRole: MemorySegment
    get() = NSAccessibilityWindowRole_VH.get(NSAccessibilityWindowRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityWindowRole_VH.set(NSAccessibilityWindowRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDrawerRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityDrawerRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDrawerRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDrawerRole").orElseThrow().reinterpret(NSAccessibilityDrawerRole_LAYOUT.byteSize()) }
private val NSAccessibilityDrawerRole_VH: VarHandle by lazy { NSAccessibilityDrawerRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityDrawerRole: MemorySegment
    get() = NSAccessibilityDrawerRole_VH.get(NSAccessibilityDrawerRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDrawerRole_VH.set(NSAccessibilityDrawerRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySystemWideRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilitySystemWideRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySystemWideRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySystemWideRole").orElseThrow().reinterpret(NSAccessibilitySystemWideRole_LAYOUT.byteSize()) }
private val NSAccessibilitySystemWideRole_VH: VarHandle by lazy { NSAccessibilitySystemWideRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySystemWideRole: MemorySegment
    get() = NSAccessibilitySystemWideRole_VH.get(NSAccessibilitySystemWideRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySystemWideRole_VH.set(NSAccessibilitySystemWideRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityOutlineRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityOutlineRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityOutlineRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityOutlineRole").orElseThrow().reinterpret(NSAccessibilityOutlineRole_LAYOUT.byteSize()) }
private val NSAccessibilityOutlineRole_VH: VarHandle by lazy { NSAccessibilityOutlineRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityOutlineRole: MemorySegment
    get() = NSAccessibilityOutlineRole_VH.get(NSAccessibilityOutlineRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityOutlineRole_VH.set(NSAccessibilityOutlineRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityIncrementorRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityIncrementorRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIncrementorRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIncrementorRole").orElseThrow().reinterpret(NSAccessibilityIncrementorRole_LAYOUT.byteSize()) }
private val NSAccessibilityIncrementorRole_VH: VarHandle by lazy { NSAccessibilityIncrementorRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityIncrementorRole: MemorySegment
    get() = NSAccessibilityIncrementorRole_VH.get(NSAccessibilityIncrementorRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityIncrementorRole_VH.set(NSAccessibilityIncrementorRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityBrowserRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityBrowserRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityBrowserRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityBrowserRole").orElseThrow().reinterpret(NSAccessibilityBrowserRole_LAYOUT.byteSize()) }
private val NSAccessibilityBrowserRole_VH: VarHandle by lazy { NSAccessibilityBrowserRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityBrowserRole: MemorySegment
    get() = NSAccessibilityBrowserRole_VH.get(NSAccessibilityBrowserRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityBrowserRole_VH.set(NSAccessibilityBrowserRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityComboBoxRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityComboBoxRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityComboBoxRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityComboBoxRole").orElseThrow().reinterpret(NSAccessibilityComboBoxRole_LAYOUT.byteSize()) }
private val NSAccessibilityComboBoxRole_VH: VarHandle by lazy { NSAccessibilityComboBoxRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityComboBoxRole: MemorySegment
    get() = NSAccessibilityComboBoxRole_VH.get(NSAccessibilityComboBoxRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityComboBoxRole_VH.set(NSAccessibilityComboBoxRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySplitGroupRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilitySplitGroupRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySplitGroupRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySplitGroupRole").orElseThrow().reinterpret(NSAccessibilitySplitGroupRole_LAYOUT.byteSize()) }
private val NSAccessibilitySplitGroupRole_VH: VarHandle by lazy { NSAccessibilitySplitGroupRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySplitGroupRole: MemorySegment
    get() = NSAccessibilitySplitGroupRole_VH.get(NSAccessibilitySplitGroupRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySplitGroupRole_VH.set(NSAccessibilitySplitGroupRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySplitterRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilitySplitterRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySplitterRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySplitterRole").orElseThrow().reinterpret(NSAccessibilitySplitterRole_LAYOUT.byteSize()) }
private val NSAccessibilitySplitterRole_VH: VarHandle by lazy { NSAccessibilitySplitterRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySplitterRole: MemorySegment
    get() = NSAccessibilitySplitterRole_VH.get(NSAccessibilitySplitterRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySplitterRole_VH.set(NSAccessibilitySplitterRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityColorWellRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityColorWellRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityColorWellRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityColorWellRole").orElseThrow().reinterpret(NSAccessibilityColorWellRole_LAYOUT.byteSize()) }
private val NSAccessibilityColorWellRole_VH: VarHandle by lazy { NSAccessibilityColorWellRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityColorWellRole: MemorySegment
    get() = NSAccessibilityColorWellRole_VH.get(NSAccessibilityColorWellRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityColorWellRole_VH.set(NSAccessibilityColorWellRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityGrowAreaRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityGrowAreaRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityGrowAreaRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityGrowAreaRole").orElseThrow().reinterpret(NSAccessibilityGrowAreaRole_LAYOUT.byteSize()) }
private val NSAccessibilityGrowAreaRole_VH: VarHandle by lazy { NSAccessibilityGrowAreaRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityGrowAreaRole: MemorySegment
    get() = NSAccessibilityGrowAreaRole_VH.get(NSAccessibilityGrowAreaRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityGrowAreaRole_VH.set(NSAccessibilityGrowAreaRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySheetRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilitySheetRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySheetRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySheetRole").orElseThrow().reinterpret(NSAccessibilitySheetRole_LAYOUT.byteSize()) }
private val NSAccessibilitySheetRole_VH: VarHandle by lazy { NSAccessibilitySheetRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySheetRole: MemorySegment
    get() = NSAccessibilitySheetRole_VH.get(NSAccessibilitySheetRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySheetRole_VH.set(NSAccessibilitySheetRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHelpTagRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityHelpTagRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHelpTagRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHelpTagRole").orElseThrow().reinterpret(NSAccessibilityHelpTagRole_LAYOUT.byteSize()) }
private val NSAccessibilityHelpTagRole_VH: VarHandle by lazy { NSAccessibilityHelpTagRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityHelpTagRole: MemorySegment
    get() = NSAccessibilityHelpTagRole_VH.get(NSAccessibilityHelpTagRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHelpTagRole_VH.set(NSAccessibilityHelpTagRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMatteRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityMatteRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMatteRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMatteRole").orElseThrow().reinterpret(NSAccessibilityMatteRole_LAYOUT.byteSize()) }
private val NSAccessibilityMatteRole_VH: VarHandle by lazy { NSAccessibilityMatteRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityMatteRole: MemorySegment
    get() = NSAccessibilityMatteRole_VH.get(NSAccessibilityMatteRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMatteRole_VH.set(NSAccessibilityMatteRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRulerRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityRulerRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRulerRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRulerRole").orElseThrow().reinterpret(NSAccessibilityRulerRole_LAYOUT.byteSize()) }
private val NSAccessibilityRulerRole_VH: VarHandle by lazy { NSAccessibilityRulerRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityRulerRole: MemorySegment
    get() = NSAccessibilityRulerRole_VH.get(NSAccessibilityRulerRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRulerRole_VH.set(NSAccessibilityRulerRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRulerMarkerRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityRulerMarkerRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRulerMarkerRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRulerMarkerRole").orElseThrow().reinterpret(NSAccessibilityRulerMarkerRole_LAYOUT.byteSize()) }
private val NSAccessibilityRulerMarkerRole_VH: VarHandle by lazy { NSAccessibilityRulerMarkerRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityRulerMarkerRole: MemorySegment
    get() = NSAccessibilityRulerMarkerRole_VH.get(NSAccessibilityRulerMarkerRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRulerMarkerRole_VH.set(NSAccessibilityRulerMarkerRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityLinkRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityLinkRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLinkRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLinkRole").orElseThrow().reinterpret(NSAccessibilityLinkRole_LAYOUT.byteSize()) }
private val NSAccessibilityLinkRole_VH: VarHandle by lazy { NSAccessibilityLinkRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityLinkRole: MemorySegment
    get() = NSAccessibilityLinkRole_VH.get(NSAccessibilityLinkRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityLinkRole_VH.set(NSAccessibilityLinkRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDisclosureTriangleRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityDisclosureTriangleRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDisclosureTriangleRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDisclosureTriangleRole").orElseThrow().reinterpret(NSAccessibilityDisclosureTriangleRole_LAYOUT.byteSize()) }
private val NSAccessibilityDisclosureTriangleRole_VH: VarHandle by lazy { NSAccessibilityDisclosureTriangleRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSAccessibilityDisclosureTriangleRole: MemorySegment
    get() = NSAccessibilityDisclosureTriangleRole_VH.get(NSAccessibilityDisclosureTriangleRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDisclosureTriangleRole_VH.set(NSAccessibilityDisclosureTriangleRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityGridRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityGridRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityGridRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityGridRole").orElseThrow().reinterpret(NSAccessibilityGridRole_LAYOUT.byteSize()) }
private val NSAccessibilityGridRole_VH: VarHandle by lazy { NSAccessibilityGridRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSAccessibilityGridRole: MemorySegment
    get() = NSAccessibilityGridRole_VH.get(NSAccessibilityGridRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityGridRole_VH.set(NSAccessibilityGridRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRelevanceIndicatorRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityRelevanceIndicatorRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRelevanceIndicatorRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRelevanceIndicatorRole").orElseThrow().reinterpret(NSAccessibilityRelevanceIndicatorRole_LAYOUT.byteSize()) }
private val NSAccessibilityRelevanceIndicatorRole_VH: VarHandle by lazy { NSAccessibilityRelevanceIndicatorRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityRelevanceIndicatorRole: MemorySegment
    get() = NSAccessibilityRelevanceIndicatorRole_VH.get(NSAccessibilityRelevanceIndicatorRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRelevanceIndicatorRole_VH.set(NSAccessibilityRelevanceIndicatorRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDateTimeAreaRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityDateTimeAreaRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDateTimeAreaRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDateTimeAreaRole").orElseThrow().reinterpret(NSAccessibilityDateTimeAreaRole_LAYOUT.byteSize()) }
private val NSAccessibilityDateTimeAreaRole_VH: VarHandle by lazy { NSAccessibilityDateTimeAreaRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityDateTimeAreaRole: MemorySegment
    get() = NSAccessibilityDateTimeAreaRole_VH.get(NSAccessibilityDateTimeAreaRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDateTimeAreaRole_VH.set(NSAccessibilityDateTimeAreaRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityLevelIndicatorRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityLevelIndicatorRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLevelIndicatorRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLevelIndicatorRole").orElseThrow().reinterpret(NSAccessibilityLevelIndicatorRole_LAYOUT.byteSize()) }
private val NSAccessibilityLevelIndicatorRole_VH: VarHandle by lazy { NSAccessibilityLevelIndicatorRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityLevelIndicatorRole: MemorySegment
    get() = NSAccessibilityLevelIndicatorRole_VH.get(NSAccessibilityLevelIndicatorRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityLevelIndicatorRole_VH.set(NSAccessibilityLevelIndicatorRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityCellRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityCellRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCellRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCellRole").orElseThrow().reinterpret(NSAccessibilityCellRole_LAYOUT.byteSize()) }
private val NSAccessibilityCellRole_VH: VarHandle by lazy { NSAccessibilityCellRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityCellRole: MemorySegment
    get() = NSAccessibilityCellRole_VH.get(NSAccessibilityCellRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityCellRole_VH.set(NSAccessibilityCellRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityPopoverRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityPopoverRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPopoverRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPopoverRole").orElseThrow().reinterpret(NSAccessibilityPopoverRole_LAYOUT.byteSize()) }
private val NSAccessibilityPopoverRole_VH: VarHandle by lazy { NSAccessibilityPopoverRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSAccessibilityPopoverRole: MemorySegment
    get() = NSAccessibilityPopoverRole_VH.get(NSAccessibilityPopoverRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityPopoverRole_VH.set(NSAccessibilityPopoverRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityPageRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityPageRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPageRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPageRole").orElseThrow().reinterpret(NSAccessibilityPageRole_LAYOUT.byteSize()) }
private val NSAccessibilityPageRole_VH: VarHandle by lazy { NSAccessibilityPageRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSAccessibilityPageRole: MemorySegment
    get() = NSAccessibilityPageRole_VH.get(NSAccessibilityPageRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityPageRole_VH.set(NSAccessibilityPageRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityHeadingRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingRole").orElseThrow().reinterpret(NSAccessibilityHeadingRole_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingRole_VH: VarHandle by lazy { NSAccessibilityHeadingRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingRole: MemorySegment
    get() = NSAccessibilityHeadingRole_VH.get(NSAccessibilityHeadingRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingRole_VH.set(NSAccessibilityHeadingRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityListMarkerRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityListMarkerRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityListMarkerRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityListMarkerRole").orElseThrow().reinterpret(NSAccessibilityListMarkerRole_LAYOUT.byteSize()) }
private val NSAccessibilityListMarkerRole_VH: VarHandle by lazy { NSAccessibilityListMarkerRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityListMarkerRole: MemorySegment
    get() = NSAccessibilityListMarkerRole_VH.get(NSAccessibilityListMarkerRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityListMarkerRole_VH.set(NSAccessibilityListMarkerRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityWebAreaRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityWebAreaRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWebAreaRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWebAreaRole").orElseThrow().reinterpret(NSAccessibilityWebAreaRole_LAYOUT.byteSize()) }
private val NSAccessibilityWebAreaRole_VH: VarHandle by lazy { NSAccessibilityWebAreaRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityWebAreaRole: MemorySegment
    get() = NSAccessibilityWebAreaRole_VH.get(NSAccessibilityWebAreaRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityWebAreaRole_VH.set(NSAccessibilityWebAreaRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityLayoutAreaRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityLayoutAreaRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLayoutAreaRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLayoutAreaRole").orElseThrow().reinterpret(NSAccessibilityLayoutAreaRole_LAYOUT.byteSize()) }
private val NSAccessibilityLayoutAreaRole_VH: VarHandle by lazy { NSAccessibilityLayoutAreaRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityLayoutAreaRole: MemorySegment
    get() = NSAccessibilityLayoutAreaRole_VH.get(NSAccessibilityLayoutAreaRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityLayoutAreaRole_VH.set(NSAccessibilityLayoutAreaRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityLayoutItemRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityLayoutItemRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLayoutItemRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLayoutItemRole").orElseThrow().reinterpret(NSAccessibilityLayoutItemRole_LAYOUT.byteSize()) }
private val NSAccessibilityLayoutItemRole_VH: VarHandle by lazy { NSAccessibilityLayoutItemRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityLayoutItemRole: MemorySegment
    get() = NSAccessibilityLayoutItemRole_VH.get(NSAccessibilityLayoutItemRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityLayoutItemRole_VH.set(NSAccessibilityLayoutItemRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHandleRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilityHandleRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHandleRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHandleRole").orElseThrow().reinterpret(NSAccessibilityHandleRole_LAYOUT.byteSize()) }
private val NSAccessibilityHandleRole_VH: VarHandle by lazy { NSAccessibilityHandleRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityHandleRole: MemorySegment
    get() = NSAccessibilityHandleRole_VH.get(NSAccessibilityHandleRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHandleRole_VH.set(NSAccessibilityHandleRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityUnknownSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityUnknownSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnknownSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnknownSubrole").orElseThrow().reinterpret(NSAccessibilityUnknownSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityUnknownSubrole_VH: VarHandle by lazy { NSAccessibilityUnknownSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityUnknownSubrole: MemorySegment
    get() = NSAccessibilityUnknownSubrole_VH.get(NSAccessibilityUnknownSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityUnknownSubrole_VH.set(NSAccessibilityUnknownSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityCloseButtonSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityCloseButtonSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCloseButtonSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCloseButtonSubrole").orElseThrow().reinterpret(NSAccessibilityCloseButtonSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityCloseButtonSubrole_VH: VarHandle by lazy { NSAccessibilityCloseButtonSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityCloseButtonSubrole: MemorySegment
    get() = NSAccessibilityCloseButtonSubrole_VH.get(NSAccessibilityCloseButtonSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityCloseButtonSubrole_VH.set(NSAccessibilityCloseButtonSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityZoomButtonSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityZoomButtonSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityZoomButtonSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityZoomButtonSubrole").orElseThrow().reinterpret(NSAccessibilityZoomButtonSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityZoomButtonSubrole_VH: VarHandle by lazy { NSAccessibilityZoomButtonSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityZoomButtonSubrole: MemorySegment
    get() = NSAccessibilityZoomButtonSubrole_VH.get(NSAccessibilityZoomButtonSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityZoomButtonSubrole_VH.set(NSAccessibilityZoomButtonSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMinimizeButtonSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityMinimizeButtonSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMinimizeButtonSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMinimizeButtonSubrole").orElseThrow().reinterpret(NSAccessibilityMinimizeButtonSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityMinimizeButtonSubrole_VH: VarHandle by lazy { NSAccessibilityMinimizeButtonSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityMinimizeButtonSubrole: MemorySegment
    get() = NSAccessibilityMinimizeButtonSubrole_VH.get(NSAccessibilityMinimizeButtonSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMinimizeButtonSubrole_VH.set(NSAccessibilityMinimizeButtonSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityToolbarButtonSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityToolbarButtonSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityToolbarButtonSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityToolbarButtonSubrole").orElseThrow().reinterpret(NSAccessibilityToolbarButtonSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityToolbarButtonSubrole_VH: VarHandle by lazy { NSAccessibilityToolbarButtonSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityToolbarButtonSubrole: MemorySegment
    get() = NSAccessibilityToolbarButtonSubrole_VH.get(NSAccessibilityToolbarButtonSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityToolbarButtonSubrole_VH.set(NSAccessibilityToolbarButtonSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTableRowSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityTableRowSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTableRowSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTableRowSubrole").orElseThrow().reinterpret(NSAccessibilityTableRowSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityTableRowSubrole_VH: VarHandle by lazy { NSAccessibilityTableRowSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityTableRowSubrole: MemorySegment
    get() = NSAccessibilityTableRowSubrole_VH.get(NSAccessibilityTableRowSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTableRowSubrole_VH.set(NSAccessibilityTableRowSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityOutlineRowSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityOutlineRowSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityOutlineRowSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityOutlineRowSubrole").orElseThrow().reinterpret(NSAccessibilityOutlineRowSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityOutlineRowSubrole_VH: VarHandle by lazy { NSAccessibilityOutlineRowSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityOutlineRowSubrole: MemorySegment
    get() = NSAccessibilityOutlineRowSubrole_VH.get(NSAccessibilityOutlineRowSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityOutlineRowSubrole_VH.set(NSAccessibilityOutlineRowSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySecureTextFieldSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilitySecureTextFieldSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySecureTextFieldSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySecureTextFieldSubrole").orElseThrow().reinterpret(NSAccessibilitySecureTextFieldSubrole_LAYOUT.byteSize()) }
private val NSAccessibilitySecureTextFieldSubrole_VH: VarHandle by lazy { NSAccessibilitySecureTextFieldSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySecureTextFieldSubrole: MemorySegment
    get() = NSAccessibilitySecureTextFieldSubrole_VH.get(NSAccessibilitySecureTextFieldSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySecureTextFieldSubrole_VH.set(NSAccessibilitySecureTextFieldSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityStandardWindowSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityStandardWindowSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityStandardWindowSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityStandardWindowSubrole").orElseThrow().reinterpret(NSAccessibilityStandardWindowSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityStandardWindowSubrole_VH: VarHandle by lazy { NSAccessibilityStandardWindowSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityStandardWindowSubrole: MemorySegment
    get() = NSAccessibilityStandardWindowSubrole_VH.get(NSAccessibilityStandardWindowSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityStandardWindowSubrole_VH.set(NSAccessibilityStandardWindowSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDialogSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityDialogSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDialogSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDialogSubrole").orElseThrow().reinterpret(NSAccessibilityDialogSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityDialogSubrole_VH: VarHandle by lazy { NSAccessibilityDialogSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityDialogSubrole: MemorySegment
    get() = NSAccessibilityDialogSubrole_VH.get(NSAccessibilityDialogSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDialogSubrole_VH.set(NSAccessibilityDialogSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySystemDialogSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilitySystemDialogSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySystemDialogSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySystemDialogSubrole").orElseThrow().reinterpret(NSAccessibilitySystemDialogSubrole_LAYOUT.byteSize()) }
private val NSAccessibilitySystemDialogSubrole_VH: VarHandle by lazy { NSAccessibilitySystemDialogSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySystemDialogSubrole: MemorySegment
    get() = NSAccessibilitySystemDialogSubrole_VH.get(NSAccessibilitySystemDialogSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySystemDialogSubrole_VH.set(NSAccessibilitySystemDialogSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityFloatingWindowSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityFloatingWindowSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFloatingWindowSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFloatingWindowSubrole").orElseThrow().reinterpret(NSAccessibilityFloatingWindowSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityFloatingWindowSubrole_VH: VarHandle by lazy { NSAccessibilityFloatingWindowSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityFloatingWindowSubrole: MemorySegment
    get() = NSAccessibilityFloatingWindowSubrole_VH.get(NSAccessibilityFloatingWindowSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityFloatingWindowSubrole_VH.set(NSAccessibilityFloatingWindowSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySystemFloatingWindowSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilitySystemFloatingWindowSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySystemFloatingWindowSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySystemFloatingWindowSubrole").orElseThrow().reinterpret(NSAccessibilitySystemFloatingWindowSubrole_LAYOUT.byteSize()) }
private val NSAccessibilitySystemFloatingWindowSubrole_VH: VarHandle by lazy { NSAccessibilitySystemFloatingWindowSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySystemFloatingWindowSubrole: MemorySegment
    get() = NSAccessibilitySystemFloatingWindowSubrole_VH.get(NSAccessibilitySystemFloatingWindowSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySystemFloatingWindowSubrole_VH.set(NSAccessibilitySystemFloatingWindowSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityIncrementArrowSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityIncrementArrowSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIncrementArrowSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIncrementArrowSubrole").orElseThrow().reinterpret(NSAccessibilityIncrementArrowSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityIncrementArrowSubrole_VH: VarHandle by lazy { NSAccessibilityIncrementArrowSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityIncrementArrowSubrole: MemorySegment
    get() = NSAccessibilityIncrementArrowSubrole_VH.get(NSAccessibilityIncrementArrowSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityIncrementArrowSubrole_VH.set(NSAccessibilityIncrementArrowSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDecrementArrowSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityDecrementArrowSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDecrementArrowSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDecrementArrowSubrole").orElseThrow().reinterpret(NSAccessibilityDecrementArrowSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityDecrementArrowSubrole_VH: VarHandle by lazy { NSAccessibilityDecrementArrowSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityDecrementArrowSubrole: MemorySegment
    get() = NSAccessibilityDecrementArrowSubrole_VH.get(NSAccessibilityDecrementArrowSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDecrementArrowSubrole_VH.set(NSAccessibilityDecrementArrowSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityIncrementPageSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityIncrementPageSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIncrementPageSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIncrementPageSubrole").orElseThrow().reinterpret(NSAccessibilityIncrementPageSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityIncrementPageSubrole_VH: VarHandle by lazy { NSAccessibilityIncrementPageSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityIncrementPageSubrole: MemorySegment
    get() = NSAccessibilityIncrementPageSubrole_VH.get(NSAccessibilityIncrementPageSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityIncrementPageSubrole_VH.set(NSAccessibilityIncrementPageSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDecrementPageSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityDecrementPageSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDecrementPageSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDecrementPageSubrole").orElseThrow().reinterpret(NSAccessibilityDecrementPageSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityDecrementPageSubrole_VH: VarHandle by lazy { NSAccessibilityDecrementPageSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityDecrementPageSubrole: MemorySegment
    get() = NSAccessibilityDecrementPageSubrole_VH.get(NSAccessibilityDecrementPageSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDecrementPageSubrole_VH.set(NSAccessibilityDecrementPageSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchFieldSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilitySearchFieldSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchFieldSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchFieldSubrole").orElseThrow().reinterpret(NSAccessibilitySearchFieldSubrole_LAYOUT.byteSize()) }
private val NSAccessibilitySearchFieldSubrole_VH: VarHandle by lazy { NSAccessibilitySearchFieldSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilitySearchFieldSubrole: MemorySegment
    get() = NSAccessibilitySearchFieldSubrole_VH.get(NSAccessibilitySearchFieldSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchFieldSubrole_VH.set(NSAccessibilitySearchFieldSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextAttachmentSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityTextAttachmentSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextAttachmentSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextAttachmentSubrole").orElseThrow().reinterpret(NSAccessibilityTextAttachmentSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityTextAttachmentSubrole_VH: VarHandle by lazy { NSAccessibilityTextAttachmentSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityTextAttachmentSubrole: MemorySegment
    get() = NSAccessibilityTextAttachmentSubrole_VH.get(NSAccessibilityTextAttachmentSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextAttachmentSubrole_VH.set(NSAccessibilityTextAttachmentSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextLinkSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityTextLinkSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextLinkSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextLinkSubrole").orElseThrow().reinterpret(NSAccessibilityTextLinkSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityTextLinkSubrole_VH: VarHandle by lazy { NSAccessibilityTextLinkSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSAccessibilityTextLinkSubrole: MemorySegment
    get() = NSAccessibilityTextLinkSubrole_VH.get(NSAccessibilityTextLinkSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextLinkSubrole_VH.set(NSAccessibilityTextLinkSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTimelineSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityTimelineSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTimelineSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTimelineSubrole").orElseThrow().reinterpret(NSAccessibilityTimelineSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityTimelineSubrole_VH: VarHandle by lazy { NSAccessibilityTimelineSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSAccessibilityTimelineSubrole: MemorySegment
    get() = NSAccessibilityTimelineSubrole_VH.get(NSAccessibilityTimelineSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTimelineSubrole_VH.set(NSAccessibilityTimelineSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySortButtonSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilitySortButtonSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySortButtonSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySortButtonSubrole").orElseThrow().reinterpret(NSAccessibilitySortButtonSubrole_LAYOUT.byteSize()) }
private val NSAccessibilitySortButtonSubrole_VH: VarHandle by lazy { NSAccessibilitySortButtonSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilitySortButtonSubrole: MemorySegment
    get() = NSAccessibilitySortButtonSubrole_VH.get(NSAccessibilitySortButtonSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySortButtonSubrole_VH.set(NSAccessibilitySortButtonSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRatingIndicatorSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityRatingIndicatorSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRatingIndicatorSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRatingIndicatorSubrole").orElseThrow().reinterpret(NSAccessibilityRatingIndicatorSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityRatingIndicatorSubrole_VH: VarHandle by lazy { NSAccessibilityRatingIndicatorSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityRatingIndicatorSubrole: MemorySegment
    get() = NSAccessibilityRatingIndicatorSubrole_VH.get(NSAccessibilityRatingIndicatorSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRatingIndicatorSubrole_VH.set(NSAccessibilityRatingIndicatorSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityContentListSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityContentListSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityContentListSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityContentListSubrole").orElseThrow().reinterpret(NSAccessibilityContentListSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityContentListSubrole_VH: VarHandle by lazy { NSAccessibilityContentListSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityContentListSubrole: MemorySegment
    get() = NSAccessibilityContentListSubrole_VH.get(NSAccessibilityContentListSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityContentListSubrole_VH.set(NSAccessibilityContentListSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDefinitionListSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityDefinitionListSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDefinitionListSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDefinitionListSubrole").orElseThrow().reinterpret(NSAccessibilityDefinitionListSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityDefinitionListSubrole_VH: VarHandle by lazy { NSAccessibilityDefinitionListSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSAccessibilityDefinitionListSubrole: MemorySegment
    get() = NSAccessibilityDefinitionListSubrole_VH.get(NSAccessibilityDefinitionListSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDefinitionListSubrole_VH.set(NSAccessibilityDefinitionListSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityFullScreenButtonSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityFullScreenButtonSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFullScreenButtonSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFullScreenButtonSubrole").orElseThrow().reinterpret(NSAccessibilityFullScreenButtonSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityFullScreenButtonSubrole_VH: VarHandle by lazy { NSAccessibilityFullScreenButtonSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSAccessibilityFullScreenButtonSubrole: MemorySegment
    get() = NSAccessibilityFullScreenButtonSubrole_VH.get(NSAccessibilityFullScreenButtonSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityFullScreenButtonSubrole_VH.set(NSAccessibilityFullScreenButtonSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityToggleSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityToggleSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityToggleSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityToggleSubrole").orElseThrow().reinterpret(NSAccessibilityToggleSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityToggleSubrole_VH: VarHandle by lazy { NSAccessibilityToggleSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSAccessibilityToggleSubrole: MemorySegment
    get() = NSAccessibilityToggleSubrole_VH.get(NSAccessibilityToggleSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityToggleSubrole_VH.set(NSAccessibilityToggleSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySwitchSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilitySwitchSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySwitchSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySwitchSubrole").orElseThrow().reinterpret(NSAccessibilitySwitchSubrole_LAYOUT.byteSize()) }
private val NSAccessibilitySwitchSubrole_VH: VarHandle by lazy { NSAccessibilitySwitchSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSAccessibilitySwitchSubrole: MemorySegment
    get() = NSAccessibilitySwitchSubrole_VH.get(NSAccessibilitySwitchSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySwitchSubrole_VH.set(NSAccessibilitySwitchSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDescriptionListSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityDescriptionListSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDescriptionListSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDescriptionListSubrole").orElseThrow().reinterpret(NSAccessibilityDescriptionListSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityDescriptionListSubrole_VH: VarHandle by lazy { NSAccessibilityDescriptionListSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSAccessibilityDescriptionListSubrole: MemorySegment
    get() = NSAccessibilityDescriptionListSubrole_VH.get(NSAccessibilityDescriptionListSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDescriptionListSubrole_VH.set(NSAccessibilityDescriptionListSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTabButtonSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityTabButtonSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTabButtonSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTabButtonSubrole").orElseThrow().reinterpret(NSAccessibilityTabButtonSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityTabButtonSubrole_VH: VarHandle by lazy { NSAccessibilityTabButtonSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSAccessibilityTabButtonSubrole: MemorySegment
    get() = NSAccessibilityTabButtonSubrole_VH.get(NSAccessibilityTabButtonSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTabButtonSubrole_VH.set(NSAccessibilityTabButtonSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityCollectionListSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilityCollectionListSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCollectionListSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCollectionListSubrole").orElseThrow().reinterpret(NSAccessibilityCollectionListSubrole_LAYOUT.byteSize()) }
private val NSAccessibilityCollectionListSubrole_VH: VarHandle by lazy { NSAccessibilityCollectionListSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSAccessibilityCollectionListSubrole: MemorySegment
    get() = NSAccessibilityCollectionListSubrole_VH.get(NSAccessibilityCollectionListSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityCollectionListSubrole_VH.set(NSAccessibilityCollectionListSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySectionListSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilitySectionListSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySectionListSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySectionListSubrole").orElseThrow().reinterpret(NSAccessibilitySectionListSubrole_LAYOUT.byteSize()) }
private val NSAccessibilitySectionListSubrole_VH: VarHandle by lazy { NSAccessibilitySectionListSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSAccessibilitySectionListSubrole: MemorySegment
    get() = NSAccessibilitySectionListSubrole_VH.get(NSAccessibilitySectionListSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySectionListSubrole_VH.set(NSAccessibilitySectionListSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySuggestionSubrole typedef const NSAccessibilitySubrole = (Void)*
 */
private val NSAccessibilitySuggestionSubrole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySuggestionSubrole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySuggestionSubrole").orElseThrow().reinterpret(NSAccessibilitySuggestionSubrole_LAYOUT.byteSize()) }
private val NSAccessibilitySuggestionSubrole_VH: VarHandle by lazy { NSAccessibilitySuggestionSubrole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilitySuggestionSubrole: MemorySegment
    get() = NSAccessibilitySuggestionSubrole_VH.get(NSAccessibilitySuggestionSubrole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySuggestionSubrole_VH.set(NSAccessibilitySuggestionSubrole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityUIElementsKey typedef const NSAccessibilityNotificationUserInfoKey = (Void)*
 */
private val NSAccessibilityUIElementsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUIElementsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUIElementsKey").orElseThrow().reinterpret(NSAccessibilityUIElementsKey_LAYOUT.byteSize()) }
private val NSAccessibilityUIElementsKey_VH: VarHandle by lazy { NSAccessibilityUIElementsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSAccessibilityUIElementsKey: MemorySegment
    get() = NSAccessibilityUIElementsKey_VH.get(NSAccessibilityUIElementsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityUIElementsKey_VH.set(NSAccessibilityUIElementsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityPriorityKey typedef const NSAccessibilityNotificationUserInfoKey = (Void)*
 */
private val NSAccessibilityPriorityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPriorityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPriorityKey").orElseThrow().reinterpret(NSAccessibilityPriorityKey_LAYOUT.byteSize()) }
private val NSAccessibilityPriorityKey_VH: VarHandle by lazy { NSAccessibilityPriorityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSAccessibilityPriorityKey: MemorySegment
    get() = NSAccessibilityPriorityKey_VH.get(NSAccessibilityPriorityKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityPriorityKey_VH.set(NSAccessibilityPriorityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityAnnouncementKey typedef const NSAccessibilityNotificationUserInfoKey = (Void)*
 */
private val NSAccessibilityAnnouncementKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAnnouncementKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAnnouncementKey").orElseThrow().reinterpret(NSAccessibilityAnnouncementKey_LAYOUT.byteSize()) }
private val NSAccessibilityAnnouncementKey_VH: VarHandle by lazy { NSAccessibilityAnnouncementKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSAccessibilityAnnouncementKey: MemorySegment
    get() = NSAccessibilityAnnouncementKey_VH.get(NSAccessibilityAnnouncementKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityAnnouncementKey_VH.set(NSAccessibilityAnnouncementKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityPostNotificationWithUserInfo Void(typedef id = (Void)*,typedef NSAccessibilityNotificationName = typedef NSString = (Void)*,(Void)*)
 */
private val NSAccessibilityPostNotificationWithUserInfo_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityPostNotificationWithUserInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityPostNotificationWithUserInfo").orElseThrow()
private val NSAccessibilityPostNotificationWithUserInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityPostNotificationWithUserInfo_ADDR, NSAccessibilityPostNotificationWithUserInfo_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSAccessibilityPostNotificationWithUserInfo(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        NSAccessibilityPostNotificationWithUserInfo_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute").orElseThrow().reinterpret(NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_LAYOUT.byteSize()) }
private val NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute: MemorySegment
    get() = NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_VH.get(NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_VH.set(NSAccessibilityUIElementsForSearchPredicateParameterizedAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityResultsForSearchPredicateParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityResultsForSearchPredicateParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityResultsForSearchPredicateParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityResultsForSearchPredicateParameterizedAttribute").orElseThrow().reinterpret(NSAccessibilityResultsForSearchPredicateParameterizedAttribute_LAYOUT.byteSize()) }
private val NSAccessibilityResultsForSearchPredicateParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityResultsForSearchPredicateParameterizedAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilityResultsForSearchPredicateParameterizedAttribute: MemorySegment
    get() = NSAccessibilityResultsForSearchPredicateParameterizedAttribute_VH.get(NSAccessibilityResultsForSearchPredicateParameterizedAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityResultsForSearchPredicateParameterizedAttribute_VH.set(NSAccessibilityResultsForSearchPredicateParameterizedAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchIdentifiersKey (Void)*
 */
private val NSAccessibilitySearchIdentifiersKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchIdentifiersKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchIdentifiersKey").orElseThrow().reinterpret(NSAccessibilitySearchIdentifiersKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchIdentifiersKey_VH: VarHandle by lazy { NSAccessibilitySearchIdentifiersKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchIdentifiersKey: MemorySegment
    get() = NSAccessibilitySearchIdentifiersKey_VH.get(NSAccessibilitySearchIdentifiersKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchIdentifiersKey_VH.set(NSAccessibilitySearchIdentifiersKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchCurrentElementKey (Void)*
 */
private val NSAccessibilitySearchCurrentElementKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchCurrentElementKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchCurrentElementKey").orElseThrow().reinterpret(NSAccessibilitySearchCurrentElementKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchCurrentElementKey_VH: VarHandle by lazy { NSAccessibilitySearchCurrentElementKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchCurrentElementKey: MemorySegment
    get() = NSAccessibilitySearchCurrentElementKey_VH.get(NSAccessibilitySearchCurrentElementKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchCurrentElementKey_VH.set(NSAccessibilitySearchCurrentElementKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchCurrentRangeKey (Void)*
 */
private val NSAccessibilitySearchCurrentRangeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchCurrentRangeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchCurrentRangeKey").orElseThrow().reinterpret(NSAccessibilitySearchCurrentRangeKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchCurrentRangeKey_VH: VarHandle by lazy { NSAccessibilitySearchCurrentRangeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchCurrentRangeKey: MemorySegment
    get() = NSAccessibilitySearchCurrentRangeKey_VH.get(NSAccessibilitySearchCurrentRangeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchCurrentRangeKey_VH.set(NSAccessibilitySearchCurrentRangeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchDirectionKey (Void)*
 */
private val NSAccessibilitySearchDirectionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchDirectionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchDirectionKey").orElseThrow().reinterpret(NSAccessibilitySearchDirectionKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchDirectionKey_VH: VarHandle by lazy { NSAccessibilitySearchDirectionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchDirectionKey: MemorySegment
    get() = NSAccessibilitySearchDirectionKey_VH.get(NSAccessibilitySearchDirectionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchDirectionKey_VH.set(NSAccessibilitySearchDirectionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchResultsLimitKey (Void)*
 */
private val NSAccessibilitySearchResultsLimitKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchResultsLimitKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchResultsLimitKey").orElseThrow().reinterpret(NSAccessibilitySearchResultsLimitKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchResultsLimitKey_VH: VarHandle by lazy { NSAccessibilitySearchResultsLimitKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchResultsLimitKey: MemorySegment
    get() = NSAccessibilitySearchResultsLimitKey_VH.get(NSAccessibilitySearchResultsLimitKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchResultsLimitKey_VH.set(NSAccessibilitySearchResultsLimitKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchTextKey (Void)*
 */
private val NSAccessibilitySearchTextKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchTextKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchTextKey").orElseThrow().reinterpret(NSAccessibilitySearchTextKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchTextKey_VH: VarHandle by lazy { NSAccessibilitySearchTextKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchTextKey: MemorySegment
    get() = NSAccessibilitySearchTextKey_VH.get(NSAccessibilitySearchTextKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchTextKey_VH.set(NSAccessibilitySearchTextKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchDirectionNext (Void)*
 */
private val NSAccessibilitySearchDirectionNext_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchDirectionNext_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchDirectionNext").orElseThrow().reinterpret(NSAccessibilitySearchDirectionNext_LAYOUT.byteSize()) }
private val NSAccessibilitySearchDirectionNext_VH: VarHandle by lazy { NSAccessibilitySearchDirectionNext_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchDirectionNext: MemorySegment
    get() = NSAccessibilitySearchDirectionNext_VH.get(NSAccessibilitySearchDirectionNext_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchDirectionNext_VH.set(NSAccessibilitySearchDirectionNext_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchDirectionPrevious (Void)*
 */
private val NSAccessibilitySearchDirectionPrevious_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchDirectionPrevious_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchDirectionPrevious").orElseThrow().reinterpret(NSAccessibilitySearchDirectionPrevious_LAYOUT.byteSize()) }
private val NSAccessibilitySearchDirectionPrevious_VH: VarHandle by lazy { NSAccessibilitySearchDirectionPrevious_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchDirectionPrevious: MemorySegment
    get() = NSAccessibilitySearchDirectionPrevious_VH.get(NSAccessibilitySearchDirectionPrevious_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchDirectionPrevious_VH.set(NSAccessibilitySearchDirectionPrevious_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchResultElementKey (Void)*
 */
private val NSAccessibilitySearchResultElementKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchResultElementKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchResultElementKey").orElseThrow().reinterpret(NSAccessibilitySearchResultElementKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchResultElementKey_VH: VarHandle by lazy { NSAccessibilitySearchResultElementKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchResultElementKey: MemorySegment
    get() = NSAccessibilitySearchResultElementKey_VH.get(NSAccessibilitySearchResultElementKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchResultElementKey_VH.set(NSAccessibilitySearchResultElementKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchResultRangeKey (Void)*
 */
private val NSAccessibilitySearchResultRangeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchResultRangeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchResultRangeKey").orElseThrow().reinterpret(NSAccessibilitySearchResultRangeKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchResultRangeKey_VH: VarHandle by lazy { NSAccessibilitySearchResultRangeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSAccessibilitySearchResultRangeKey: MemorySegment
    get() = NSAccessibilitySearchResultRangeKey_VH.get(NSAccessibilitySearchResultRangeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchResultRangeKey_VH.set(NSAccessibilitySearchResultRangeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchResultDescriptionOverrideKey (Void)*
 */
private val NSAccessibilitySearchResultDescriptionOverrideKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchResultDescriptionOverrideKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchResultDescriptionOverrideKey").orElseThrow().reinterpret(NSAccessibilitySearchResultDescriptionOverrideKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchResultDescriptionOverrideKey_VH: VarHandle by lazy { NSAccessibilitySearchResultDescriptionOverrideKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSAccessibilitySearchResultDescriptionOverrideKey: MemorySegment
    get() = NSAccessibilitySearchResultDescriptionOverrideKey_VH.get(NSAccessibilitySearchResultDescriptionOverrideKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchResultDescriptionOverrideKey_VH.set(NSAccessibilitySearchResultDescriptionOverrideKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchResultLoaderKey (Void)*
 */
private val NSAccessibilitySearchResultLoaderKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchResultLoaderKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchResultLoaderKey").orElseThrow().reinterpret(NSAccessibilitySearchResultLoaderKey_LAYOUT.byteSize()) }
private val NSAccessibilitySearchResultLoaderKey_VH: VarHandle by lazy { NSAccessibilitySearchResultLoaderKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSAccessibilitySearchResultLoaderKey: MemorySegment
    get() = NSAccessibilitySearchResultLoaderKey_VH.get(NSAccessibilitySearchResultLoaderKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySearchResultLoaderKey_VH.set(NSAccessibilitySearchResultLoaderKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityAnyTypeSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityAnyTypeSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAnyTypeSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAnyTypeSearchKey").orElseThrow().reinterpret(NSAccessibilityAnyTypeSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityAnyTypeSearchKey_VH: VarHandle by lazy { NSAccessibilityAnyTypeSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityAnyTypeSearchKey: MemorySegment
    get() = NSAccessibilityAnyTypeSearchKey_VH.get(NSAccessibilityAnyTypeSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityAnyTypeSearchKey_VH.set(NSAccessibilityAnyTypeSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityArticleSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityArticleSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityArticleSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityArticleSearchKey").orElseThrow().reinterpret(NSAccessibilityArticleSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityArticleSearchKey_VH: VarHandle by lazy { NSAccessibilityArticleSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityArticleSearchKey: MemorySegment
    get() = NSAccessibilityArticleSearchKey_VH.get(NSAccessibilityArticleSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityArticleSearchKey_VH.set(NSAccessibilityArticleSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityBlockquoteSameLevelSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityBlockquoteSameLevelSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityBlockquoteSameLevelSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityBlockquoteSameLevelSearchKey").orElseThrow().reinterpret(NSAccessibilityBlockquoteSameLevelSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityBlockquoteSameLevelSearchKey_VH: VarHandle by lazy { NSAccessibilityBlockquoteSameLevelSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityBlockquoteSameLevelSearchKey: MemorySegment
    get() = NSAccessibilityBlockquoteSameLevelSearchKey_VH.get(NSAccessibilityBlockquoteSameLevelSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityBlockquoteSameLevelSearchKey_VH.set(NSAccessibilityBlockquoteSameLevelSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityBlockquoteSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityBlockquoteSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityBlockquoteSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityBlockquoteSearchKey").orElseThrow().reinterpret(NSAccessibilityBlockquoteSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityBlockquoteSearchKey_VH: VarHandle by lazy { NSAccessibilityBlockquoteSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityBlockquoteSearchKey: MemorySegment
    get() = NSAccessibilityBlockquoteSearchKey_VH.get(NSAccessibilityBlockquoteSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityBlockquoteSearchKey_VH.set(NSAccessibilityBlockquoteSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityBoldFontSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityBoldFontSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityBoldFontSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityBoldFontSearchKey").orElseThrow().reinterpret(NSAccessibilityBoldFontSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityBoldFontSearchKey_VH: VarHandle by lazy { NSAccessibilityBoldFontSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityBoldFontSearchKey: MemorySegment
    get() = NSAccessibilityBoldFontSearchKey_VH.get(NSAccessibilityBoldFontSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityBoldFontSearchKey_VH.set(NSAccessibilityBoldFontSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityButtonSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityButtonSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityButtonSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityButtonSearchKey").orElseThrow().reinterpret(NSAccessibilityButtonSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityButtonSearchKey_VH: VarHandle by lazy { NSAccessibilityButtonSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityButtonSearchKey: MemorySegment
    get() = NSAccessibilityButtonSearchKey_VH.get(NSAccessibilityButtonSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityButtonSearchKey_VH.set(NSAccessibilityButtonSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityCheckBoxSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityCheckBoxSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCheckBoxSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCheckBoxSearchKey").orElseThrow().reinterpret(NSAccessibilityCheckBoxSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityCheckBoxSearchKey_VH: VarHandle by lazy { NSAccessibilityCheckBoxSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityCheckBoxSearchKey: MemorySegment
    get() = NSAccessibilityCheckBoxSearchKey_VH.get(NSAccessibilityCheckBoxSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityCheckBoxSearchKey_VH.set(NSAccessibilityCheckBoxSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityControlSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityControlSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityControlSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityControlSearchKey").orElseThrow().reinterpret(NSAccessibilityControlSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityControlSearchKey_VH: VarHandle by lazy { NSAccessibilityControlSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityControlSearchKey: MemorySegment
    get() = NSAccessibilityControlSearchKey_VH.get(NSAccessibilityControlSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityControlSearchKey_VH.set(NSAccessibilityControlSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityDifferentTypeSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityDifferentTypeSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDifferentTypeSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDifferentTypeSearchKey").orElseThrow().reinterpret(NSAccessibilityDifferentTypeSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityDifferentTypeSearchKey_VH: VarHandle by lazy { NSAccessibilityDifferentTypeSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityDifferentTypeSearchKey: MemorySegment
    get() = NSAccessibilityDifferentTypeSearchKey_VH.get(NSAccessibilityDifferentTypeSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityDifferentTypeSearchKey_VH.set(NSAccessibilityDifferentTypeSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityFontChangeSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityFontChangeSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFontChangeSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFontChangeSearchKey").orElseThrow().reinterpret(NSAccessibilityFontChangeSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityFontChangeSearchKey_VH: VarHandle by lazy { NSAccessibilityFontChangeSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityFontChangeSearchKey: MemorySegment
    get() = NSAccessibilityFontChangeSearchKey_VH.get(NSAccessibilityFontChangeSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityFontChangeSearchKey_VH.set(NSAccessibilityFontChangeSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityFontColorChangeSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityFontColorChangeSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFontColorChangeSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFontColorChangeSearchKey").orElseThrow().reinterpret(NSAccessibilityFontColorChangeSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityFontColorChangeSearchKey_VH: VarHandle by lazy { NSAccessibilityFontColorChangeSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityFontColorChangeSearchKey: MemorySegment
    get() = NSAccessibilityFontColorChangeSearchKey_VH.get(NSAccessibilityFontColorChangeSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityFontColorChangeSearchKey_VH.set(NSAccessibilityFontColorChangeSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityFrameSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityFrameSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFrameSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFrameSearchKey").orElseThrow().reinterpret(NSAccessibilityFrameSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityFrameSearchKey_VH: VarHandle by lazy { NSAccessibilityFrameSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityFrameSearchKey: MemorySegment
    get() = NSAccessibilityFrameSearchKey_VH.get(NSAccessibilityFrameSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityFrameSearchKey_VH.set(NSAccessibilityFrameSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityGraphicSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityGraphicSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityGraphicSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityGraphicSearchKey").orElseThrow().reinterpret(NSAccessibilityGraphicSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityGraphicSearchKey_VH: VarHandle by lazy { NSAccessibilityGraphicSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityGraphicSearchKey: MemorySegment
    get() = NSAccessibilityGraphicSearchKey_VH.get(NSAccessibilityGraphicSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityGraphicSearchKey_VH.set(NSAccessibilityGraphicSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingLevel1SearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityHeadingLevel1SearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingLevel1SearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingLevel1SearchKey").orElseThrow().reinterpret(NSAccessibilityHeadingLevel1SearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingLevel1SearchKey_VH: VarHandle by lazy { NSAccessibilityHeadingLevel1SearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingLevel1SearchKey: MemorySegment
    get() = NSAccessibilityHeadingLevel1SearchKey_VH.get(NSAccessibilityHeadingLevel1SearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingLevel1SearchKey_VH.set(NSAccessibilityHeadingLevel1SearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingLevel2SearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityHeadingLevel2SearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingLevel2SearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingLevel2SearchKey").orElseThrow().reinterpret(NSAccessibilityHeadingLevel2SearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingLevel2SearchKey_VH: VarHandle by lazy { NSAccessibilityHeadingLevel2SearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingLevel2SearchKey: MemorySegment
    get() = NSAccessibilityHeadingLevel2SearchKey_VH.get(NSAccessibilityHeadingLevel2SearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingLevel2SearchKey_VH.set(NSAccessibilityHeadingLevel2SearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingLevel3SearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityHeadingLevel3SearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingLevel3SearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingLevel3SearchKey").orElseThrow().reinterpret(NSAccessibilityHeadingLevel3SearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingLevel3SearchKey_VH: VarHandle by lazy { NSAccessibilityHeadingLevel3SearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingLevel3SearchKey: MemorySegment
    get() = NSAccessibilityHeadingLevel3SearchKey_VH.get(NSAccessibilityHeadingLevel3SearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingLevel3SearchKey_VH.set(NSAccessibilityHeadingLevel3SearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingLevel4SearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityHeadingLevel4SearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingLevel4SearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingLevel4SearchKey").orElseThrow().reinterpret(NSAccessibilityHeadingLevel4SearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingLevel4SearchKey_VH: VarHandle by lazy { NSAccessibilityHeadingLevel4SearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingLevel4SearchKey: MemorySegment
    get() = NSAccessibilityHeadingLevel4SearchKey_VH.get(NSAccessibilityHeadingLevel4SearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingLevel4SearchKey_VH.set(NSAccessibilityHeadingLevel4SearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingLevel5SearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityHeadingLevel5SearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingLevel5SearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingLevel5SearchKey").orElseThrow().reinterpret(NSAccessibilityHeadingLevel5SearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingLevel5SearchKey_VH: VarHandle by lazy { NSAccessibilityHeadingLevel5SearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingLevel5SearchKey: MemorySegment
    get() = NSAccessibilityHeadingLevel5SearchKey_VH.get(NSAccessibilityHeadingLevel5SearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingLevel5SearchKey_VH.set(NSAccessibilityHeadingLevel5SearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingLevel6SearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityHeadingLevel6SearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingLevel6SearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingLevel6SearchKey").orElseThrow().reinterpret(NSAccessibilityHeadingLevel6SearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingLevel6SearchKey_VH: VarHandle by lazy { NSAccessibilityHeadingLevel6SearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingLevel6SearchKey: MemorySegment
    get() = NSAccessibilityHeadingLevel6SearchKey_VH.get(NSAccessibilityHeadingLevel6SearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingLevel6SearchKey_VH.set(NSAccessibilityHeadingLevel6SearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingSameLevelSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityHeadingSameLevelSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingSameLevelSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingSameLevelSearchKey").orElseThrow().reinterpret(NSAccessibilityHeadingSameLevelSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingSameLevelSearchKey_VH: VarHandle by lazy { NSAccessibilityHeadingSameLevelSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingSameLevelSearchKey: MemorySegment
    get() = NSAccessibilityHeadingSameLevelSearchKey_VH.get(NSAccessibilityHeadingSameLevelSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingSameLevelSearchKey_VH.set(NSAccessibilityHeadingSameLevelSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityHeadingSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingSearchKey").orElseThrow().reinterpret(NSAccessibilityHeadingSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityHeadingSearchKey_VH: VarHandle by lazy { NSAccessibilityHeadingSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityHeadingSearchKey: MemorySegment
    get() = NSAccessibilityHeadingSearchKey_VH.get(NSAccessibilityHeadingSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityHeadingSearchKey_VH.set(NSAccessibilityHeadingSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityItalicFontSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityItalicFontSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityItalicFontSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityItalicFontSearchKey").orElseThrow().reinterpret(NSAccessibilityItalicFontSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityItalicFontSearchKey_VH: VarHandle by lazy { NSAccessibilityItalicFontSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityItalicFontSearchKey: MemorySegment
    get() = NSAccessibilityItalicFontSearchKey_VH.get(NSAccessibilityItalicFontSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityItalicFontSearchKey_VH.set(NSAccessibilityItalicFontSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityKeyboardFocusableSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityKeyboardFocusableSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityKeyboardFocusableSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityKeyboardFocusableSearchKey").orElseThrow().reinterpret(NSAccessibilityKeyboardFocusableSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityKeyboardFocusableSearchKey_VH: VarHandle by lazy { NSAccessibilityKeyboardFocusableSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityKeyboardFocusableSearchKey: MemorySegment
    get() = NSAccessibilityKeyboardFocusableSearchKey_VH.get(NSAccessibilityKeyboardFocusableSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityKeyboardFocusableSearchKey_VH.set(NSAccessibilityKeyboardFocusableSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityLandmarkSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityLandmarkSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLandmarkSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLandmarkSearchKey").orElseThrow().reinterpret(NSAccessibilityLandmarkSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityLandmarkSearchKey_VH: VarHandle by lazy { NSAccessibilityLandmarkSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityLandmarkSearchKey: MemorySegment
    get() = NSAccessibilityLandmarkSearchKey_VH.get(NSAccessibilityLandmarkSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityLandmarkSearchKey_VH.set(NSAccessibilityLandmarkSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityLinkSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityLinkSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLinkSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLinkSearchKey").orElseThrow().reinterpret(NSAccessibilityLinkSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityLinkSearchKey_VH: VarHandle by lazy { NSAccessibilityLinkSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityLinkSearchKey: MemorySegment
    get() = NSAccessibilityLinkSearchKey_VH.get(NSAccessibilityLinkSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityLinkSearchKey_VH.set(NSAccessibilityLinkSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityListSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityListSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityListSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityListSearchKey").orElseThrow().reinterpret(NSAccessibilityListSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityListSearchKey_VH: VarHandle by lazy { NSAccessibilityListSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityListSearchKey: MemorySegment
    get() = NSAccessibilityListSearchKey_VH.get(NSAccessibilityListSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityListSearchKey_VH.set(NSAccessibilityListSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityLiveRegionSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityLiveRegionSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLiveRegionSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLiveRegionSearchKey").orElseThrow().reinterpret(NSAccessibilityLiveRegionSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityLiveRegionSearchKey_VH: VarHandle by lazy { NSAccessibilityLiveRegionSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityLiveRegionSearchKey: MemorySegment
    get() = NSAccessibilityLiveRegionSearchKey_VH.get(NSAccessibilityLiveRegionSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityLiveRegionSearchKey_VH.set(NSAccessibilityLiveRegionSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityMisspelledWordSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityMisspelledWordSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMisspelledWordSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMisspelledWordSearchKey").orElseThrow().reinterpret(NSAccessibilityMisspelledWordSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityMisspelledWordSearchKey_VH: VarHandle by lazy { NSAccessibilityMisspelledWordSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityMisspelledWordSearchKey: MemorySegment
    get() = NSAccessibilityMisspelledWordSearchKey_VH.get(NSAccessibilityMisspelledWordSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityMisspelledWordSearchKey_VH.set(NSAccessibilityMisspelledWordSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityOutlineSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityOutlineSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityOutlineSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityOutlineSearchKey").orElseThrow().reinterpret(NSAccessibilityOutlineSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityOutlineSearchKey_VH: VarHandle by lazy { NSAccessibilityOutlineSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityOutlineSearchKey: MemorySegment
    get() = NSAccessibilityOutlineSearchKey_VH.get(NSAccessibilityOutlineSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityOutlineSearchKey_VH.set(NSAccessibilityOutlineSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityPlainTextSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityPlainTextSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPlainTextSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPlainTextSearchKey").orElseThrow().reinterpret(NSAccessibilityPlainTextSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityPlainTextSearchKey_VH: VarHandle by lazy { NSAccessibilityPlainTextSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityPlainTextSearchKey: MemorySegment
    get() = NSAccessibilityPlainTextSearchKey_VH.get(NSAccessibilityPlainTextSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityPlainTextSearchKey_VH.set(NSAccessibilityPlainTextSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityRadioGroupSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityRadioGroupSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRadioGroupSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRadioGroupSearchKey").orElseThrow().reinterpret(NSAccessibilityRadioGroupSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityRadioGroupSearchKey_VH: VarHandle by lazy { NSAccessibilityRadioGroupSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityRadioGroupSearchKey: MemorySegment
    get() = NSAccessibilityRadioGroupSearchKey_VH.get(NSAccessibilityRadioGroupSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityRadioGroupSearchKey_VH.set(NSAccessibilityRadioGroupSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySameTypeSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilitySameTypeSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySameTypeSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySameTypeSearchKey").orElseThrow().reinterpret(NSAccessibilitySameTypeSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilitySameTypeSearchKey_VH: VarHandle by lazy { NSAccessibilitySameTypeSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilitySameTypeSearchKey: MemorySegment
    get() = NSAccessibilitySameTypeSearchKey_VH.get(NSAccessibilitySameTypeSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySameTypeSearchKey_VH.set(NSAccessibilitySameTypeSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityStaticTextSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityStaticTextSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityStaticTextSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityStaticTextSearchKey").orElseThrow().reinterpret(NSAccessibilityStaticTextSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityStaticTextSearchKey_VH: VarHandle by lazy { NSAccessibilityStaticTextSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityStaticTextSearchKey: MemorySegment
    get() = NSAccessibilityStaticTextSearchKey_VH.get(NSAccessibilityStaticTextSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityStaticTextSearchKey_VH.set(NSAccessibilityStaticTextSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityStyleChangeSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityStyleChangeSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityStyleChangeSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityStyleChangeSearchKey").orElseThrow().reinterpret(NSAccessibilityStyleChangeSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityStyleChangeSearchKey_VH: VarHandle by lazy { NSAccessibilityStyleChangeSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityStyleChangeSearchKey: MemorySegment
    get() = NSAccessibilityStyleChangeSearchKey_VH.get(NSAccessibilityStyleChangeSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityStyleChangeSearchKey_VH.set(NSAccessibilityStyleChangeSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTableSameLevelSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityTableSameLevelSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTableSameLevelSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTableSameLevelSearchKey").orElseThrow().reinterpret(NSAccessibilityTableSameLevelSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityTableSameLevelSearchKey_VH: VarHandle by lazy { NSAccessibilityTableSameLevelSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityTableSameLevelSearchKey: MemorySegment
    get() = NSAccessibilityTableSameLevelSearchKey_VH.get(NSAccessibilityTableSameLevelSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTableSameLevelSearchKey_VH.set(NSAccessibilityTableSameLevelSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTableSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityTableSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTableSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTableSearchKey").orElseThrow().reinterpret(NSAccessibilityTableSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityTableSearchKey_VH: VarHandle by lazy { NSAccessibilityTableSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityTableSearchKey: MemorySegment
    get() = NSAccessibilityTableSearchKey_VH.get(NSAccessibilityTableSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTableSearchKey_VH.set(NSAccessibilityTableSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextFieldSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityTextFieldSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextFieldSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextFieldSearchKey").orElseThrow().reinterpret(NSAccessibilityTextFieldSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityTextFieldSearchKey_VH: VarHandle by lazy { NSAccessibilityTextFieldSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityTextFieldSearchKey: MemorySegment
    get() = NSAccessibilityTextFieldSearchKey_VH.get(NSAccessibilityTextFieldSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextFieldSearchKey_VH.set(NSAccessibilityTextFieldSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextStateChangeTypeKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityTextStateChangeTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextStateChangeTypeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextStateChangeTypeKey").orElseThrow().reinterpret(NSAccessibilityTextStateChangeTypeKey_LAYOUT.byteSize()) }
private val NSAccessibilityTextStateChangeTypeKey_VH: VarHandle by lazy { NSAccessibilityTextStateChangeTypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityTextStateChangeTypeKey: MemorySegment
    get() = NSAccessibilityTextStateChangeTypeKey_VH.get(NSAccessibilityTextStateChangeTypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextStateChangeTypeKey_VH.set(NSAccessibilityTextStateChangeTypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityTextStateSyncKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityTextStateSyncKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextStateSyncKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextStateSyncKey").orElseThrow().reinterpret(NSAccessibilityTextStateSyncKey_LAYOUT.byteSize()) }
private val NSAccessibilityTextStateSyncKey_VH: VarHandle by lazy { NSAccessibilityTextStateSyncKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityTextStateSyncKey: MemorySegment
    get() = NSAccessibilityTextStateSyncKey_VH.get(NSAccessibilityTextStateSyncKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityTextStateSyncKey_VH.set(NSAccessibilityTextStateSyncKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityUnderlineSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityUnderlineSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnderlineSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnderlineSearchKey").orElseThrow().reinterpret(NSAccessibilityUnderlineSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityUnderlineSearchKey_VH: VarHandle by lazy { NSAccessibilityUnderlineSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityUnderlineSearchKey: MemorySegment
    get() = NSAccessibilityUnderlineSearchKey_VH.get(NSAccessibilityUnderlineSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityUnderlineSearchKey_VH.set(NSAccessibilityUnderlineSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityUnvisitedLinkSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityUnvisitedLinkSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnvisitedLinkSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnvisitedLinkSearchKey").orElseThrow().reinterpret(NSAccessibilityUnvisitedLinkSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityUnvisitedLinkSearchKey_VH: VarHandle by lazy { NSAccessibilityUnvisitedLinkSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityUnvisitedLinkSearchKey: MemorySegment
    get() = NSAccessibilityUnvisitedLinkSearchKey_VH.get(NSAccessibilityUnvisitedLinkSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityUnvisitedLinkSearchKey_VH.set(NSAccessibilityUnvisitedLinkSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityVisitedLinkSearchKey typedef const NSAccessibilitySearchKey = (Void)*
 */
private val NSAccessibilityVisitedLinkSearchKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVisitedLinkSearchKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVisitedLinkSearchKey").orElseThrow().reinterpret(NSAccessibilityVisitedLinkSearchKey_LAYOUT.byteSize()) }
private val NSAccessibilityVisitedLinkSearchKey_VH: VarHandle by lazy { NSAccessibilityVisitedLinkSearchKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSAccessibilityVisitedLinkSearchKey: MemorySegment
    get() = NSAccessibilityVisitedLinkSearchKey_VH.get(NSAccessibilityVisitedLinkSearchKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilityVisitedLinkSearchKey_VH.set(NSAccessibilityVisitedLinkSearchKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilitySortButtonRole typedef const NSAccessibilityRole = (Void)*
 */
private val NSAccessibilitySortButtonRole_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySortButtonRole_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySortButtonRole").orElseThrow().reinterpret(NSAccessibilitySortButtonRole_LAYOUT.byteSize()) }
private val NSAccessibilitySortButtonRole_VH: VarHandle by lazy { NSAccessibilitySortButtonRole_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
var NSAccessibilitySortButtonRole: MemorySegment
    get() = NSAccessibilitySortButtonRole_VH.get(NSAccessibilitySortButtonRole_SEGMENT, 0L) as MemorySegment
    set(value) = NSAccessibilitySortButtonRole_VH.set(NSAccessibilitySortButtonRole_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDesktopImageScalingKey typedef const NSWorkspaceDesktopImageOptionKey = (Void)*
 */
private val NSWorkspaceDesktopImageScalingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDesktopImageScalingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDesktopImageScalingKey").orElseThrow().reinterpret(NSWorkspaceDesktopImageScalingKey_LAYOUT.byteSize()) }
private val NSWorkspaceDesktopImageScalingKey_VH: VarHandle by lazy { NSWorkspaceDesktopImageScalingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDesktopImageScalingKey: MemorySegment
    get() = NSWorkspaceDesktopImageScalingKey_VH.get(NSWorkspaceDesktopImageScalingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDesktopImageScalingKey_VH.set(NSWorkspaceDesktopImageScalingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDesktopImageAllowClippingKey typedef const NSWorkspaceDesktopImageOptionKey = (Void)*
 */
private val NSWorkspaceDesktopImageAllowClippingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDesktopImageAllowClippingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDesktopImageAllowClippingKey").orElseThrow().reinterpret(NSWorkspaceDesktopImageAllowClippingKey_LAYOUT.byteSize()) }
private val NSWorkspaceDesktopImageAllowClippingKey_VH: VarHandle by lazy { NSWorkspaceDesktopImageAllowClippingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDesktopImageAllowClippingKey: MemorySegment
    get() = NSWorkspaceDesktopImageAllowClippingKey_VH.get(NSWorkspaceDesktopImageAllowClippingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDesktopImageAllowClippingKey_VH.set(NSWorkspaceDesktopImageAllowClippingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDesktopImageFillColorKey typedef const NSWorkspaceDesktopImageOptionKey = (Void)*
 */
private val NSWorkspaceDesktopImageFillColorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDesktopImageFillColorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDesktopImageFillColorKey").orElseThrow().reinterpret(NSWorkspaceDesktopImageFillColorKey_LAYOUT.byteSize()) }
private val NSWorkspaceDesktopImageFillColorKey_VH: VarHandle by lazy { NSWorkspaceDesktopImageFillColorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDesktopImageFillColorKey: MemorySegment
    get() = NSWorkspaceDesktopImageFillColorKey_VH.get(NSWorkspaceDesktopImageFillColorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDesktopImageFillColorKey_VH.set(NSWorkspaceDesktopImageFillColorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceApplicationKey (Void)*
 */
private val NSWorkspaceApplicationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceApplicationKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceApplicationKey").orElseThrow().reinterpret(NSWorkspaceApplicationKey_LAYOUT.byteSize()) }
private val NSWorkspaceApplicationKey_VH: VarHandle by lazy { NSWorkspaceApplicationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceApplicationKey: MemorySegment
    get() = NSWorkspaceApplicationKey_VH.get(NSWorkspaceApplicationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceApplicationKey_VH.set(NSWorkspaceApplicationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceWillLaunchApplicationNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceWillLaunchApplicationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceWillLaunchApplicationNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceWillLaunchApplicationNotification").orElseThrow().reinterpret(NSWorkspaceWillLaunchApplicationNotification_LAYOUT.byteSize()) }
private val NSWorkspaceWillLaunchApplicationNotification_VH: VarHandle by lazy { NSWorkspaceWillLaunchApplicationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceWillLaunchApplicationNotification: MemorySegment
    get() = NSWorkspaceWillLaunchApplicationNotification_VH.get(NSWorkspaceWillLaunchApplicationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceWillLaunchApplicationNotification_VH.set(NSWorkspaceWillLaunchApplicationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidLaunchApplicationNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDidLaunchApplicationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidLaunchApplicationNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidLaunchApplicationNotification").orElseThrow().reinterpret(NSWorkspaceDidLaunchApplicationNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidLaunchApplicationNotification_VH: VarHandle by lazy { NSWorkspaceDidLaunchApplicationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceDidLaunchApplicationNotification: MemorySegment
    get() = NSWorkspaceDidLaunchApplicationNotification_VH.get(NSWorkspaceDidLaunchApplicationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidLaunchApplicationNotification_VH.set(NSWorkspaceDidLaunchApplicationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidTerminateApplicationNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDidTerminateApplicationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidTerminateApplicationNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidTerminateApplicationNotification").orElseThrow().reinterpret(NSWorkspaceDidTerminateApplicationNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidTerminateApplicationNotification_VH: VarHandle by lazy { NSWorkspaceDidTerminateApplicationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceDidTerminateApplicationNotification: MemorySegment
    get() = NSWorkspaceDidTerminateApplicationNotification_VH.get(NSWorkspaceDidTerminateApplicationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidTerminateApplicationNotification_VH.set(NSWorkspaceDidTerminateApplicationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidHideApplicationNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceDidHideApplicationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidHideApplicationNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidHideApplicationNotification").orElseThrow().reinterpret(NSWorkspaceDidHideApplicationNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidHideApplicationNotification_VH: VarHandle by lazy { NSWorkspaceDidHideApplicationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDidHideApplicationNotification: MemorySegment
    get() = NSWorkspaceDidHideApplicationNotification_VH.get(NSWorkspaceDidHideApplicationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidHideApplicationNotification_VH.set(NSWorkspaceDidHideApplicationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidUnhideApplicationNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceDidUnhideApplicationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidUnhideApplicationNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidUnhideApplicationNotification").orElseThrow().reinterpret(NSWorkspaceDidUnhideApplicationNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidUnhideApplicationNotification_VH: VarHandle by lazy { NSWorkspaceDidUnhideApplicationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDidUnhideApplicationNotification: MemorySegment
    get() = NSWorkspaceDidUnhideApplicationNotification_VH.get(NSWorkspaceDidUnhideApplicationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidUnhideApplicationNotification_VH.set(NSWorkspaceDidUnhideApplicationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidActivateApplicationNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceDidActivateApplicationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidActivateApplicationNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidActivateApplicationNotification").orElseThrow().reinterpret(NSWorkspaceDidActivateApplicationNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidActivateApplicationNotification_VH: VarHandle by lazy { NSWorkspaceDidActivateApplicationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDidActivateApplicationNotification: MemorySegment
    get() = NSWorkspaceDidActivateApplicationNotification_VH.get(NSWorkspaceDidActivateApplicationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidActivateApplicationNotification_VH.set(NSWorkspaceDidActivateApplicationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidDeactivateApplicationNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceDidDeactivateApplicationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidDeactivateApplicationNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidDeactivateApplicationNotification").orElseThrow().reinterpret(NSWorkspaceDidDeactivateApplicationNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidDeactivateApplicationNotification_VH: VarHandle by lazy { NSWorkspaceDidDeactivateApplicationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDidDeactivateApplicationNotification: MemorySegment
    get() = NSWorkspaceDidDeactivateApplicationNotification_VH.get(NSWorkspaceDidDeactivateApplicationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidDeactivateApplicationNotification_VH.set(NSWorkspaceDidDeactivateApplicationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceVolumeLocalizedNameKey (Void)*
 */
private val NSWorkspaceVolumeLocalizedNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceVolumeLocalizedNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceVolumeLocalizedNameKey").orElseThrow().reinterpret(NSWorkspaceVolumeLocalizedNameKey_LAYOUT.byteSize()) }
private val NSWorkspaceVolumeLocalizedNameKey_VH: VarHandle by lazy { NSWorkspaceVolumeLocalizedNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceVolumeLocalizedNameKey: MemorySegment
    get() = NSWorkspaceVolumeLocalizedNameKey_VH.get(NSWorkspaceVolumeLocalizedNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceVolumeLocalizedNameKey_VH.set(NSWorkspaceVolumeLocalizedNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceVolumeURLKey (Void)*
 */
private val NSWorkspaceVolumeURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceVolumeURLKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceVolumeURLKey").orElseThrow().reinterpret(NSWorkspaceVolumeURLKey_LAYOUT.byteSize()) }
private val NSWorkspaceVolumeURLKey_VH: VarHandle by lazy { NSWorkspaceVolumeURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceVolumeURLKey: MemorySegment
    get() = NSWorkspaceVolumeURLKey_VH.get(NSWorkspaceVolumeURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceVolumeURLKey_VH.set(NSWorkspaceVolumeURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceVolumeOldLocalizedNameKey (Void)*
 */
private val NSWorkspaceVolumeOldLocalizedNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceVolumeOldLocalizedNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceVolumeOldLocalizedNameKey").orElseThrow().reinterpret(NSWorkspaceVolumeOldLocalizedNameKey_LAYOUT.byteSize()) }
private val NSWorkspaceVolumeOldLocalizedNameKey_VH: VarHandle by lazy { NSWorkspaceVolumeOldLocalizedNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceVolumeOldLocalizedNameKey: MemorySegment
    get() = NSWorkspaceVolumeOldLocalizedNameKey_VH.get(NSWorkspaceVolumeOldLocalizedNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceVolumeOldLocalizedNameKey_VH.set(NSWorkspaceVolumeOldLocalizedNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceVolumeOldURLKey (Void)*
 */
private val NSWorkspaceVolumeOldURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceVolumeOldURLKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceVolumeOldURLKey").orElseThrow().reinterpret(NSWorkspaceVolumeOldURLKey_LAYOUT.byteSize()) }
private val NSWorkspaceVolumeOldURLKey_VH: VarHandle by lazy { NSWorkspaceVolumeOldURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceVolumeOldURLKey: MemorySegment
    get() = NSWorkspaceVolumeOldURLKey_VH.get(NSWorkspaceVolumeOldURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceVolumeOldURLKey_VH.set(NSWorkspaceVolumeOldURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidMountNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDidMountNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidMountNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidMountNotification").orElseThrow().reinterpret(NSWorkspaceDidMountNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidMountNotification_VH: VarHandle by lazy { NSWorkspaceDidMountNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceDidMountNotification: MemorySegment
    get() = NSWorkspaceDidMountNotification_VH.get(NSWorkspaceDidMountNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidMountNotification_VH.set(NSWorkspaceDidMountNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidUnmountNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDidUnmountNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidUnmountNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidUnmountNotification").orElseThrow().reinterpret(NSWorkspaceDidUnmountNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidUnmountNotification_VH: VarHandle by lazy { NSWorkspaceDidUnmountNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceDidUnmountNotification: MemorySegment
    get() = NSWorkspaceDidUnmountNotification_VH.get(NSWorkspaceDidUnmountNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidUnmountNotification_VH.set(NSWorkspaceDidUnmountNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceWillUnmountNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceWillUnmountNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceWillUnmountNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceWillUnmountNotification").orElseThrow().reinterpret(NSWorkspaceWillUnmountNotification_LAYOUT.byteSize()) }
private val NSWorkspaceWillUnmountNotification_VH: VarHandle by lazy { NSWorkspaceWillUnmountNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceWillUnmountNotification: MemorySegment
    get() = NSWorkspaceWillUnmountNotification_VH.get(NSWorkspaceWillUnmountNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceWillUnmountNotification_VH.set(NSWorkspaceWillUnmountNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidRenameVolumeNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceDidRenameVolumeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidRenameVolumeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidRenameVolumeNotification").orElseThrow().reinterpret(NSWorkspaceDidRenameVolumeNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidRenameVolumeNotification_VH: VarHandle by lazy { NSWorkspaceDidRenameVolumeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDidRenameVolumeNotification: MemorySegment
    get() = NSWorkspaceDidRenameVolumeNotification_VH.get(NSWorkspaceDidRenameVolumeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidRenameVolumeNotification_VH.set(NSWorkspaceDidRenameVolumeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceWillPowerOffNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceWillPowerOffNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceWillPowerOffNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceWillPowerOffNotification").orElseThrow().reinterpret(NSWorkspaceWillPowerOffNotification_LAYOUT.byteSize()) }
private val NSWorkspaceWillPowerOffNotification_VH: VarHandle by lazy { NSWorkspaceWillPowerOffNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceWillPowerOffNotification: MemorySegment
    get() = NSWorkspaceWillPowerOffNotification_VH.get(NSWorkspaceWillPowerOffNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceWillPowerOffNotification_VH.set(NSWorkspaceWillPowerOffNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceWillSleepNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceWillSleepNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceWillSleepNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceWillSleepNotification").orElseThrow().reinterpret(NSWorkspaceWillSleepNotification_LAYOUT.byteSize()) }
private val NSWorkspaceWillSleepNotification_VH: VarHandle by lazy { NSWorkspaceWillSleepNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceWillSleepNotification: MemorySegment
    get() = NSWorkspaceWillSleepNotification_VH.get(NSWorkspaceWillSleepNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceWillSleepNotification_VH.set(NSWorkspaceWillSleepNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidWakeNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDidWakeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidWakeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidWakeNotification").orElseThrow().reinterpret(NSWorkspaceDidWakeNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidWakeNotification_VH: VarHandle by lazy { NSWorkspaceDidWakeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceDidWakeNotification: MemorySegment
    get() = NSWorkspaceDidWakeNotification_VH.get(NSWorkspaceDidWakeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidWakeNotification_VH.set(NSWorkspaceDidWakeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceScreensDidSleepNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceScreensDidSleepNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceScreensDidSleepNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceScreensDidSleepNotification").orElseThrow().reinterpret(NSWorkspaceScreensDidSleepNotification_LAYOUT.byteSize()) }
private val NSWorkspaceScreensDidSleepNotification_VH: VarHandle by lazy { NSWorkspaceScreensDidSleepNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceScreensDidSleepNotification: MemorySegment
    get() = NSWorkspaceScreensDidSleepNotification_VH.get(NSWorkspaceScreensDidSleepNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceScreensDidSleepNotification_VH.set(NSWorkspaceScreensDidSleepNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceScreensDidWakeNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceScreensDidWakeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceScreensDidWakeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceScreensDidWakeNotification").orElseThrow().reinterpret(NSWorkspaceScreensDidWakeNotification_LAYOUT.byteSize()) }
private val NSWorkspaceScreensDidWakeNotification_VH: VarHandle by lazy { NSWorkspaceScreensDidWakeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceScreensDidWakeNotification: MemorySegment
    get() = NSWorkspaceScreensDidWakeNotification_VH.get(NSWorkspaceScreensDidWakeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceScreensDidWakeNotification_VH.set(NSWorkspaceScreensDidWakeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceSessionDidBecomeActiveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceSessionDidBecomeActiveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceSessionDidBecomeActiveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceSessionDidBecomeActiveNotification").orElseThrow().reinterpret(NSWorkspaceSessionDidBecomeActiveNotification_LAYOUT.byteSize()) }
private val NSWorkspaceSessionDidBecomeActiveNotification_VH: VarHandle by lazy { NSWorkspaceSessionDidBecomeActiveNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceSessionDidBecomeActiveNotification: MemorySegment
    get() = NSWorkspaceSessionDidBecomeActiveNotification_VH.get(NSWorkspaceSessionDidBecomeActiveNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceSessionDidBecomeActiveNotification_VH.set(NSWorkspaceSessionDidBecomeActiveNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceSessionDidResignActiveNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceSessionDidResignActiveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceSessionDidResignActiveNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceSessionDidResignActiveNotification").orElseThrow().reinterpret(NSWorkspaceSessionDidResignActiveNotification_LAYOUT.byteSize()) }
private val NSWorkspaceSessionDidResignActiveNotification_VH: VarHandle by lazy { NSWorkspaceSessionDidResignActiveNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSWorkspaceSessionDidResignActiveNotification: MemorySegment
    get() = NSWorkspaceSessionDidResignActiveNotification_VH.get(NSWorkspaceSessionDidResignActiveNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceSessionDidResignActiveNotification_VH.set(NSWorkspaceSessionDidResignActiveNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidChangeFileLabelsNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceDidChangeFileLabelsNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidChangeFileLabelsNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidChangeFileLabelsNotification").orElseThrow().reinterpret(NSWorkspaceDidChangeFileLabelsNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidChangeFileLabelsNotification_VH: VarHandle by lazy { NSWorkspaceDidChangeFileLabelsNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceDidChangeFileLabelsNotification: MemorySegment
    get() = NSWorkspaceDidChangeFileLabelsNotification_VH.get(NSWorkspaceDidChangeFileLabelsNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidChangeFileLabelsNotification_VH.set(NSWorkspaceDidChangeFileLabelsNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceActiveSpaceDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceActiveSpaceDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceActiveSpaceDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceActiveSpaceDidChangeNotification").orElseThrow().reinterpret(NSWorkspaceActiveSpaceDidChangeNotification_LAYOUT.byteSize()) }
private val NSWorkspaceActiveSpaceDidChangeNotification_VH: VarHandle by lazy { NSWorkspaceActiveSpaceDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSWorkspaceActiveSpaceDidChangeNotification: MemorySegment
    get() = NSWorkspaceActiveSpaceDidChangeNotification_VH.get(NSWorkspaceActiveSpaceDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceActiveSpaceDidChangeNotification_VH.set(NSWorkspaceActiveSpaceDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceLaunchConfigurationAppleEvent typedef const NSWorkspaceLaunchConfigurationKey = (Void)*
 */
private val NSWorkspaceLaunchConfigurationAppleEvent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceLaunchConfigurationAppleEvent_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceLaunchConfigurationAppleEvent").orElseThrow().reinterpret(NSWorkspaceLaunchConfigurationAppleEvent_LAYOUT.byteSize()) }
private val NSWorkspaceLaunchConfigurationAppleEvent_VH: VarHandle by lazy { NSWorkspaceLaunchConfigurationAppleEvent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspaceOpenConfiguration setAppleEvent:] instead.")
var NSWorkspaceLaunchConfigurationAppleEvent: MemorySegment
    get() = NSWorkspaceLaunchConfigurationAppleEvent_VH.get(NSWorkspaceLaunchConfigurationAppleEvent_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceLaunchConfigurationAppleEvent_VH.set(NSWorkspaceLaunchConfigurationAppleEvent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceLaunchConfigurationArguments typedef const NSWorkspaceLaunchConfigurationKey = (Void)*
 */
private val NSWorkspaceLaunchConfigurationArguments_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceLaunchConfigurationArguments_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceLaunchConfigurationArguments").orElseThrow().reinterpret(NSWorkspaceLaunchConfigurationArguments_LAYOUT.byteSize()) }
private val NSWorkspaceLaunchConfigurationArguments_VH: VarHandle by lazy { NSWorkspaceLaunchConfigurationArguments_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspaceOpenConfiguration setArguments:] instead.")
var NSWorkspaceLaunchConfigurationArguments: MemorySegment
    get() = NSWorkspaceLaunchConfigurationArguments_VH.get(NSWorkspaceLaunchConfigurationArguments_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceLaunchConfigurationArguments_VH.set(NSWorkspaceLaunchConfigurationArguments_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceLaunchConfigurationEnvironment typedef const NSWorkspaceLaunchConfigurationKey = (Void)*
 */
private val NSWorkspaceLaunchConfigurationEnvironment_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceLaunchConfigurationEnvironment_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceLaunchConfigurationEnvironment").orElseThrow().reinterpret(NSWorkspaceLaunchConfigurationEnvironment_LAYOUT.byteSize()) }
private val NSWorkspaceLaunchConfigurationEnvironment_VH: VarHandle by lazy { NSWorkspaceLaunchConfigurationEnvironment_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspaceOpenConfiguration setEnvironment:] instead.")
var NSWorkspaceLaunchConfigurationEnvironment: MemorySegment
    get() = NSWorkspaceLaunchConfigurationEnvironment_VH.get(NSWorkspaceLaunchConfigurationEnvironment_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceLaunchConfigurationEnvironment_VH.set(NSWorkspaceLaunchConfigurationEnvironment_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceLaunchConfigurationArchitecture typedef const NSWorkspaceLaunchConfigurationKey = (Void)*
 */
private val NSWorkspaceLaunchConfigurationArchitecture_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceLaunchConfigurationArchitecture_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceLaunchConfigurationArchitecture").orElseThrow().reinterpret(NSWorkspaceLaunchConfigurationArchitecture_LAYOUT.byteSize()) }
private val NSWorkspaceLaunchConfigurationArchitecture_VH: VarHandle by lazy { NSWorkspaceLaunchConfigurationArchitecture_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Do not specify an architecutre. When unspecified, the architecture for a new application instance will be determined based on the available architectures in its executable.")
var NSWorkspaceLaunchConfigurationArchitecture: MemorySegment
    get() = NSWorkspaceLaunchConfigurationArchitecture_VH.get(NSWorkspaceLaunchConfigurationArchitecture_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceLaunchConfigurationArchitecture_VH.set(NSWorkspaceLaunchConfigurationArchitecture_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceMoveOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceMoveOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceMoveOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceMoveOperation").orElseThrow().reinterpret(NSWorkspaceMoveOperation_LAYOUT.byteSize()) }
private val NSWorkspaceMoveOperation_VH: VarHandle by lazy { NSWorkspaceMoveOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSFileManager moveItemAtURL:toURL:error:] instead.")
var NSWorkspaceMoveOperation: MemorySegment
    get() = NSWorkspaceMoveOperation_VH.get(NSWorkspaceMoveOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceMoveOperation_VH.set(NSWorkspaceMoveOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceCopyOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceCopyOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceCopyOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceCopyOperation").orElseThrow().reinterpret(NSWorkspaceCopyOperation_LAYOUT.byteSize()) }
private val NSWorkspaceCopyOperation_VH: VarHandle by lazy { NSWorkspaceCopyOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSFileManager copyItemAtURL:toURL:error:] instead.")
var NSWorkspaceCopyOperation: MemorySegment
    get() = NSWorkspaceCopyOperation_VH.get(NSWorkspaceCopyOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceCopyOperation_VH.set(NSWorkspaceCopyOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceLinkOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceLinkOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceLinkOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceLinkOperation").orElseThrow().reinterpret(NSWorkspaceLinkOperation_LAYOUT.byteSize()) }
private val NSWorkspaceLinkOperation_VH: VarHandle by lazy { NSWorkspaceLinkOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSFileManager linkItemAtURL:toURL:error:] instead.")
var NSWorkspaceLinkOperation: MemorySegment
    get() = NSWorkspaceLinkOperation_VH.get(NSWorkspaceLinkOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceLinkOperation_VH.set(NSWorkspaceLinkOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceCompressOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceCompressOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceCompressOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceCompressOperation").orElseThrow().reinterpret(NSWorkspaceCompressOperation_LAYOUT.byteSize()) }
private val NSWorkspaceCompressOperation_VH: VarHandle by lazy { NSWorkspaceCompressOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "This operation is unimplemented.")
var NSWorkspaceCompressOperation: MemorySegment
    get() = NSWorkspaceCompressOperation_VH.get(NSWorkspaceCompressOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceCompressOperation_VH.set(NSWorkspaceCompressOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDecompressOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDecompressOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDecompressOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDecompressOperation").orElseThrow().reinterpret(NSWorkspaceDecompressOperation_LAYOUT.byteSize()) }
private val NSWorkspaceDecompressOperation_VH: VarHandle by lazy { NSWorkspaceDecompressOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "This operation is unimplemented.")
var NSWorkspaceDecompressOperation: MemorySegment
    get() = NSWorkspaceDecompressOperation_VH.get(NSWorkspaceDecompressOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDecompressOperation_VH.set(NSWorkspaceDecompressOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceEncryptOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceEncryptOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceEncryptOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceEncryptOperation").orElseThrow().reinterpret(NSWorkspaceEncryptOperation_LAYOUT.byteSize()) }
private val NSWorkspaceEncryptOperation_VH: VarHandle by lazy { NSWorkspaceEncryptOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "This operation is unimplemented.")
var NSWorkspaceEncryptOperation: MemorySegment
    get() = NSWorkspaceEncryptOperation_VH.get(NSWorkspaceEncryptOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceEncryptOperation_VH.set(NSWorkspaceEncryptOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDecryptOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDecryptOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDecryptOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDecryptOperation").orElseThrow().reinterpret(NSWorkspaceDecryptOperation_LAYOUT.byteSize()) }
private val NSWorkspaceDecryptOperation_VH: VarHandle by lazy { NSWorkspaceDecryptOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "This operation is unimplemented.")
var NSWorkspaceDecryptOperation: MemorySegment
    get() = NSWorkspaceDecryptOperation_VH.get(NSWorkspaceDecryptOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDecryptOperation_VH.set(NSWorkspaceDecryptOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDestroyOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDestroyOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDestroyOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDestroyOperation").orElseThrow().reinterpret(NSWorkspaceDestroyOperation_LAYOUT.byteSize()) }
private val NSWorkspaceDestroyOperation_VH: VarHandle by lazy { NSWorkspaceDestroyOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSFileManager removeItemAtURL:error:] instead.")
var NSWorkspaceDestroyOperation: MemorySegment
    get() = NSWorkspaceDestroyOperation_VH.get(NSWorkspaceDestroyOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDestroyOperation_VH.set(NSWorkspaceDestroyOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceRecycleOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceRecycleOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceRecycleOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceRecycleOperation").orElseThrow().reinterpret(NSWorkspaceRecycleOperation_LAYOUT.byteSize()) }
private val NSWorkspaceRecycleOperation_VH: VarHandle by lazy { NSWorkspaceRecycleOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSWorkspace recycleURLs:completionHandler:] instead.")
var NSWorkspaceRecycleOperation: MemorySegment
    get() = NSWorkspaceRecycleOperation_VH.get(NSWorkspaceRecycleOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceRecycleOperation_VH.set(NSWorkspaceRecycleOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDuplicateOperation typedef NSWorkspaceFileOperationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDuplicateOperation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDuplicateOperation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDuplicateOperation").orElseThrow().reinterpret(NSWorkspaceDuplicateOperation_LAYOUT.byteSize()) }
private val NSWorkspaceDuplicateOperation_VH: VarHandle by lazy { NSWorkspaceDuplicateOperation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSWorkspace duplicateURLs:completionHandler:] instead.")
var NSWorkspaceDuplicateOperation: MemorySegment
    get() = NSWorkspaceDuplicateOperation_VH.get(NSWorkspaceDuplicateOperation_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDuplicateOperation_VH.set(NSWorkspaceDuplicateOperation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceDidPerformFileOperationNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSWorkspaceDidPerformFileOperationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceDidPerformFileOperationNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceDidPerformFileOperationNotification").orElseThrow().reinterpret(NSWorkspaceDidPerformFileOperationNotification_LAYOUT.byteSize()) }
private val NSWorkspaceDidPerformFileOperationNotification_VH: VarHandle by lazy { NSWorkspaceDidPerformFileOperationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
var NSWorkspaceDidPerformFileOperationNotification: MemorySegment
    get() = NSWorkspaceDidPerformFileOperationNotification_VH.get(NSWorkspaceDidPerformFileOperationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceDidPerformFileOperationNotification_VH.set(NSWorkspaceDidPerformFileOperationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPlainFileType typedef NSString = (Void)*
 */
private val NSPlainFileType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPlainFileType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPlainFileType").orElseThrow().reinterpret(NSPlainFileType_LAYOUT.byteSize()) }
private val NSPlainFileType_VH: VarHandle by lazy { NSPlainFileType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
var NSPlainFileType: MemorySegment
    get() = NSPlainFileType_VH.get(NSPlainFileType_SEGMENT, 0L) as MemorySegment
    set(value) = NSPlainFileType_VH.set(NSPlainFileType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDirectoryFileType typedef NSString = (Void)*
 */
private val NSDirectoryFileType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDirectoryFileType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDirectoryFileType").orElseThrow().reinterpret(NSDirectoryFileType_LAYOUT.byteSize()) }
private val NSDirectoryFileType_VH: VarHandle by lazy { NSDirectoryFileType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
var NSDirectoryFileType: MemorySegment
    get() = NSDirectoryFileType_VH.get(NSDirectoryFileType_SEGMENT, 0L) as MemorySegment
    set(value) = NSDirectoryFileType_VH.set(NSDirectoryFileType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSApplicationFileType typedef NSString = (Void)*
 */
private val NSApplicationFileType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSApplicationFileType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSApplicationFileType").orElseThrow().reinterpret(NSApplicationFileType_LAYOUT.byteSize()) }
private val NSApplicationFileType_VH: VarHandle by lazy { NSApplicationFileType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
var NSApplicationFileType: MemorySegment
    get() = NSApplicationFileType_VH.get(NSApplicationFileType_SEGMENT, 0L) as MemorySegment
    set(value) = NSApplicationFileType_VH.set(NSApplicationFileType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFilesystemFileType typedef NSString = (Void)*
 */
private val NSFilesystemFileType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFilesystemFileType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFilesystemFileType").orElseThrow().reinterpret(NSFilesystemFileType_LAYOUT.byteSize()) }
private val NSFilesystemFileType_VH: VarHandle by lazy { NSFilesystemFileType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
var NSFilesystemFileType: MemorySegment
    get() = NSFilesystemFileType_VH.get(NSFilesystemFileType_SEGMENT, 0L) as MemorySegment
    set(value) = NSFilesystemFileType_VH.set(NSFilesystemFileType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSShellCommandFileType typedef NSString = (Void)*
 */
private val NSShellCommandFileType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSShellCommandFileType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSShellCommandFileType").orElseThrow().reinterpret(NSShellCommandFileType_LAYOUT.byteSize()) }
private val NSShellCommandFileType_VH: VarHandle by lazy { NSShellCommandFileType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
var NSShellCommandFileType: MemorySegment
    get() = NSShellCommandFileType_VH.get(NSShellCommandFileType_SEGMENT, 0L) as MemorySegment
    set(value) = NSShellCommandFileType_VH.set(NSShellCommandFileType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification").orElseThrow().reinterpret(NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_LAYOUT.byteSize()) }
private val NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_VH: VarHandle by lazy { NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
var NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification: MemorySegment
    get() = NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_VH.get(NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_VH.set(NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAccessibilityFrameInView typedef NSRect = Declared(CGRect)(typedef NSView = (Void)*,typedef NSRect = Declared(CGRect))
 */
private val NSAccessibilityFrameInView_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, CGRect.layout)
private val NSAccessibilityFrameInView_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityFrameInView").orElseThrow()
private val NSAccessibilityFrameInView_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityFrameInView_ADDR, NSAccessibilityFrameInView_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSAccessibilityFrameInView(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityFrameInView_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSAccessibilityFrameInView(allocator: SegmentAllocator, arg0: MemorySegment, arg1: NSRect): NSRect {
    return NSRect(NSAccessibilityFrameInView(allocator, arg0, arg1.segment))
}

/**
 * {@snippet lang=c : NSAccessibilityPointInView typedef NSPoint = Declared(CGPoint)(typedef NSView = (Void)*,typedef NSPoint = Declared(CGPoint))
 */
private val NSAccessibilityPointInView_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS, CGPoint.layout)
private val NSAccessibilityPointInView_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityPointInView").orElseThrow()
private val NSAccessibilityPointInView_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityPointInView_ADDR, NSAccessibilityPointInView_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSAccessibilityPointInView(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityPointInView_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSAccessibilityPointInView(allocator: SegmentAllocator, arg0: MemorySegment, arg1: NSPoint): NSPoint {
    return NSPoint(NSAccessibilityPointInView(allocator, arg0, arg1.segment))
}

/**
 * {@snippet lang=c : NSAccessibilitySetMayContainProtectedContent typedef BOOL = Bool(typedef BOOL = Bool)
 */
private val NSAccessibilitySetMayContainProtectedContent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN)
private val NSAccessibilitySetMayContainProtectedContent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilitySetMayContainProtectedContent").orElseThrow()
private val NSAccessibilitySetMayContainProtectedContent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilitySetMayContainProtectedContent_ADDR, NSAccessibilitySetMayContainProtectedContent_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilitySetMayContainProtectedContent(arg0: Boolean): Boolean {
    try {
        return NSAccessibilitySetMayContainProtectedContent_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityRoleDescription typedef NSString = (Void)*(typedef NSAccessibilityRole = typedef NSString = (Void)*,typedef NSAccessibilitySubrole = typedef NSString = (Void)*)
 */
private val NSAccessibilityRoleDescription_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityRoleDescription_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityRoleDescription").orElseThrow()
private val NSAccessibilityRoleDescription_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityRoleDescription_ADDR, NSAccessibilityRoleDescription_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilityRoleDescription(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityRoleDescription_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityRoleDescriptionForUIElement typedef NSString = (Void)*(typedef id = (Void)*)
 */
private val NSAccessibilityRoleDescriptionForUIElement_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityRoleDescriptionForUIElement_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityRoleDescriptionForUIElement").orElseThrow()
private val NSAccessibilityRoleDescriptionForUIElement_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityRoleDescriptionForUIElement_ADDR, NSAccessibilityRoleDescriptionForUIElement_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilityRoleDescriptionForUIElement(arg0: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityRoleDescriptionForUIElement_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityActionDescription typedef NSString = (Void)*(typedef NSAccessibilityActionName = typedef NSString = (Void)*)
 */
private val NSAccessibilityActionDescription_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityActionDescription_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityActionDescription").orElseThrow()
private val NSAccessibilityActionDescription_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityActionDescription_ADDR, NSAccessibilityActionDescription_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilityActionDescription(arg0: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityActionDescription_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityRaiseBadArgumentException Void(typedef id = (Void)*,typedef NSAccessibilityAttributeName = typedef NSString = (Void)*,typedef id = (Void)*)
 */
private val NSAccessibilityRaiseBadArgumentException_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityRaiseBadArgumentException_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityRaiseBadArgumentException").orElseThrow()
private val NSAccessibilityRaiseBadArgumentException_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityRaiseBadArgumentException_ADDR, NSAccessibilityRaiseBadArgumentException_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Exceptions are no longer appropriate for indicating errors in accessibility API. Unexpected values should be handled through appropriate type checking.")
fun NSAccessibilityRaiseBadArgumentException(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        NSAccessibilityRaiseBadArgumentException_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityUnignoredAncestor typedef id = (Void)*(typedef id = (Void)*)
 */
private val NSAccessibilityUnignoredAncestor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityUnignoredAncestor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityUnignoredAncestor").orElseThrow()
private val NSAccessibilityUnignoredAncestor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityUnignoredAncestor_ADDR, NSAccessibilityUnignoredAncestor_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilityUnignoredAncestor(arg0: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityUnignoredAncestor_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityUnignoredDescendant typedef id = (Void)*(typedef id = (Void)*)
 */
private val NSAccessibilityUnignoredDescendant_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityUnignoredDescendant_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityUnignoredDescendant").orElseThrow()
private val NSAccessibilityUnignoredDescendant_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityUnignoredDescendant_ADDR, NSAccessibilityUnignoredDescendant_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilityUnignoredDescendant(arg0: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityUnignoredDescendant_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityUnignoredChildren typedef NSArray = (Void)*(typedef NSArray = (Void)*)
 */
private val NSAccessibilityUnignoredChildren_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityUnignoredChildren_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityUnignoredChildren").orElseThrow()
private val NSAccessibilityUnignoredChildren_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityUnignoredChildren_ADDR, NSAccessibilityUnignoredChildren_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilityUnignoredChildren(arg0: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityUnignoredChildren_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityUnignoredChildrenForOnlyChild typedef NSArray = (Void)*(typedef id = (Void)*)
 */
private val NSAccessibilityUnignoredChildrenForOnlyChild_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityUnignoredChildrenForOnlyChild_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityUnignoredChildrenForOnlyChild").orElseThrow()
private val NSAccessibilityUnignoredChildrenForOnlyChild_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityUnignoredChildrenForOnlyChild_ADDR, NSAccessibilityUnignoredChildrenForOnlyChild_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilityUnignoredChildrenForOnlyChild(arg0: MemorySegment): MemorySegment {
    try {
        return NSAccessibilityUnignoredChildrenForOnlyChild_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAccessibilityPostNotification Void(typedef id = (Void)*,typedef NSAccessibilityNotificationName = typedef NSString = (Void)*)
 */
private val NSAccessibilityPostNotification_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSAccessibilityPostNotification_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("NSAccessibilityPostNotification").orElseThrow()
private val NSAccessibilityPostNotification_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(NSAccessibilityPostNotification_ADDR, NSAccessibilityPostNotification_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSAccessibilityPostNotification(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSAccessibilityPostNotification_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRenderingBufferProviderCreate typedef CGRenderingBufferProviderRef = (Declared(CGRenderingBufferProvider))*((Void)*,typedef size_t = UNSIGNED = Long,(Void)*,(Void)*,(Void)*)
 */
private val CGRenderingBufferProviderCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGRenderingBufferProviderCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRenderingBufferProviderCreate").orElseThrow()
private val CGRenderingBufferProviderCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRenderingBufferProviderCreate_ADDR, CGRenderingBufferProviderCreate_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGRenderingBufferProviderCreate(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CGRenderingBufferProviderCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRenderingBufferProviderCreateWithCFData typedef CGRenderingBufferProviderRef = (Declared(CGRenderingBufferProvider))*(typedef CFMutableDataRef = (Declared(__CFData))*)
 */
private val CGRenderingBufferProviderCreateWithCFData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGRenderingBufferProviderCreateWithCFData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRenderingBufferProviderCreateWithCFData").orElseThrow()
private val CGRenderingBufferProviderCreateWithCFData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRenderingBufferProviderCreateWithCFData_ADDR, CGRenderingBufferProviderCreateWithCFData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGRenderingBufferProviderCreateWithCFData(arg0: MemorySegment): MemorySegment {
    try {
        return CGRenderingBufferProviderCreateWithCFData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRenderingBufferProviderGetSize typedef size_t = UNSIGNED = Long(typedef CGRenderingBufferProviderRef = (Declared(CGRenderingBufferProvider))*)
 */
private val CGRenderingBufferProviderGetSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGRenderingBufferProviderGetSize_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRenderingBufferProviderGetSize").orElseThrow()
private val CGRenderingBufferProviderGetSize_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRenderingBufferProviderGetSize_ADDR, CGRenderingBufferProviderGetSize_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGRenderingBufferProviderGetSize(arg0: MemorySegment): Long {
    try {
        return CGRenderingBufferProviderGetSize_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRenderingBufferLockBytePtr (Void)*(typedef CGRenderingBufferProviderRef = (Declared(CGRenderingBufferProvider))*)
 */
private val CGRenderingBufferLockBytePtr_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGRenderingBufferLockBytePtr_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRenderingBufferLockBytePtr").orElseThrow()
private val CGRenderingBufferLockBytePtr_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRenderingBufferLockBytePtr_ADDR, CGRenderingBufferLockBytePtr_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGRenderingBufferLockBytePtr(arg0: MemorySegment): MemorySegment {
    try {
        return CGRenderingBufferLockBytePtr_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRenderingBufferUnlockBytePtr Void(typedef CGRenderingBufferProviderRef = (Declared(CGRenderingBufferProvider))*)
 */
private val CGRenderingBufferUnlockBytePtr_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGRenderingBufferUnlockBytePtr_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRenderingBufferUnlockBytePtr").orElseThrow()
private val CGRenderingBufferUnlockBytePtr_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRenderingBufferUnlockBytePtr_ADDR, CGRenderingBufferUnlockBytePtr_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGRenderingBufferUnlockBytePtr(arg0: MemorySegment): Unit {
    try {
        CGRenderingBufferUnlockBytePtr_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRenderingBufferProviderGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGRenderingBufferProviderGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGRenderingBufferProviderGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRenderingBufferProviderGetTypeID").orElseThrow()
private val CGRenderingBufferProviderGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRenderingBufferProviderGetTypeID_ADDR, CGRenderingBufferProviderGetTypeID_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGRenderingBufferProviderGetTypeID(): Long {
    try {
        return CGRenderingBufferProviderGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextCreateWithData typedef CGContextRef = (Declared(CGContext))*((Void)*,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGBitmapInfo = Declared(CGBitmapInfo),typedef CGBitmapContextReleaseDataCallback = (Void((Void)*,(Void)*))*,(Void)*)
 */
private val CGBitmapContextCreateWithData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGBitmapContextCreateWithData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextCreateWithData").orElseThrow()
private val CGBitmapContextCreateWithData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextCreateWithData_ADDR, CGBitmapContextCreateWithData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGBitmapContextCreateWithData(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: MemorySegment, arg6: CGBitmapInfo, arg7: MemorySegment, arg8: MemorySegment): MemorySegment {
    try {
        return CGBitmapContextCreateWithData_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6.rawValue.toInt(), arg7, arg8) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextCreate typedef CGContextRef = (Declared(CGContext))*((Void)*,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGBitmapInfo = Declared(CGBitmapInfo))
 */
private val CGBitmapContextCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGBitmapContextCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextCreate").orElseThrow()
private val CGBitmapContextCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextCreate_ADDR, CGBitmapContextCreate_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGBitmapContextCreate(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: MemorySegment, arg6: CGBitmapInfo): MemorySegment {
    try {
        return CGBitmapContextCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6.rawValue.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextCreateAdaptive typedef CGContextRef = (Declared(CGContext))*(typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef CFDictionaryRef = (Declared(__CFDictionary))*,(Void)*,(Void)*,(Void)*,(Void)*)
 */
private val CGBitmapContextCreateAdaptive_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGBitmapContextCreateAdaptive_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextCreateAdaptive").orElseThrow()
private val CGBitmapContextCreateAdaptive_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextCreateAdaptive_ADDR, CGBitmapContextCreateAdaptive_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGBitmapContextCreateAdaptive(arg0: Long, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment): MemorySegment {
    try {
        return CGBitmapContextCreateAdaptive_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGAdaptiveMaximumBitDepth typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGAdaptiveMaximumBitDepth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGAdaptiveMaximumBitDepth_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGAdaptiveMaximumBitDepth").orElseThrow().reinterpret(kCGAdaptiveMaximumBitDepth_LAYOUT.byteSize()) }
private val kCGAdaptiveMaximumBitDepth_VH: VarHandle by lazy { kCGAdaptiveMaximumBitDepth_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var kCGAdaptiveMaximumBitDepth: MemorySegment
    get() = kCGAdaptiveMaximumBitDepth_VH.get(kCGAdaptiveMaximumBitDepth_SEGMENT, 0L) as MemorySegment
    set(value) = kCGAdaptiveMaximumBitDepth_VH.set(kCGAdaptiveMaximumBitDepth_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGBitmapContextGetData (Void)*(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGBitmapContextGetData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetData").orElseThrow()
private val CGBitmapContextGetData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetData_ADDR, CGBitmapContextGetData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGBitmapContextGetData(arg0: MemorySegment): MemorySegment {
    try {
        return CGBitmapContextGetData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextGetWidth typedef size_t = UNSIGNED = Long(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetWidth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGBitmapContextGetWidth_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetWidth").orElseThrow()
private val CGBitmapContextGetWidth_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetWidth_ADDR, CGBitmapContextGetWidth_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGBitmapContextGetWidth(arg0: MemorySegment): Long {
    try {
        return CGBitmapContextGetWidth_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextGetHeight typedef size_t = UNSIGNED = Long(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetHeight_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGBitmapContextGetHeight_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetHeight").orElseThrow()
private val CGBitmapContextGetHeight_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetHeight_ADDR, CGBitmapContextGetHeight_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGBitmapContextGetHeight(arg0: MemorySegment): Long {
    try {
        return CGBitmapContextGetHeight_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextGetBitsPerComponent typedef size_t = UNSIGNED = Long(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetBitsPerComponent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGBitmapContextGetBitsPerComponent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetBitsPerComponent").orElseThrow()
private val CGBitmapContextGetBitsPerComponent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetBitsPerComponent_ADDR, CGBitmapContextGetBitsPerComponent_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGBitmapContextGetBitsPerComponent(arg0: MemorySegment): Long {
    try {
        return CGBitmapContextGetBitsPerComponent_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextGetBitsPerPixel typedef size_t = UNSIGNED = Long(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetBitsPerPixel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGBitmapContextGetBitsPerPixel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetBitsPerPixel").orElseThrow()
private val CGBitmapContextGetBitsPerPixel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetBitsPerPixel_ADDR, CGBitmapContextGetBitsPerPixel_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGBitmapContextGetBitsPerPixel(arg0: MemorySegment): Long {
    try {
        return CGBitmapContextGetBitsPerPixel_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextGetBytesPerRow typedef size_t = UNSIGNED = Long(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetBytesPerRow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGBitmapContextGetBytesPerRow_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetBytesPerRow").orElseThrow()
private val CGBitmapContextGetBytesPerRow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetBytesPerRow_ADDR, CGBitmapContextGetBytesPerRow_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGBitmapContextGetBytesPerRow(arg0: MemorySegment): Long {
    try {
        return CGBitmapContextGetBytesPerRow_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextGetColorSpace typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGBitmapContextGetColorSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetColorSpace").orElseThrow()
private val CGBitmapContextGetColorSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetColorSpace_ADDR, CGBitmapContextGetColorSpace_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGBitmapContextGetColorSpace(arg0: MemorySegment): MemorySegment {
    try {
        return CGBitmapContextGetColorSpace_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextGetAlphaInfo typedef CGImageAlphaInfo = Declared(CGImageAlphaInfo)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetAlphaInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGBitmapContextGetAlphaInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetAlphaInfo").orElseThrow()
private val CGBitmapContextGetAlphaInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetAlphaInfo_ADDR, CGBitmapContextGetAlphaInfo_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGBitmapContextGetAlphaInfo(arg0: MemorySegment): CGImageAlphaInfo {
    try {
        return CGImageAlphaInfo.fromValue(Integer.toUnsignedLong(CGBitmapContextGetAlphaInfo_HANDLE.invokeExact(arg0) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextGetBitmapInfo typedef CGBitmapInfo = Declared(CGBitmapInfo)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextGetBitmapInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGBitmapContextGetBitmapInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextGetBitmapInfo").orElseThrow()
private val CGBitmapContextGetBitmapInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextGetBitmapInfo_ADDR, CGBitmapContextGetBitmapInfo_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGBitmapContextGetBitmapInfo(arg0: MemorySegment): CGBitmapInfo {
    try {
        return CGBitmapInfo(Integer.toUnsignedLong(CGBitmapContextGetBitmapInfo_HANDLE.invokeExact(arg0) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBitmapContextCreateImage typedef CGImageRef = (Declared(CGImage))*(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGBitmapContextCreateImage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGBitmapContextCreateImage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBitmapContextCreateImage").orElseThrow()
private val CGBitmapContextCreateImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBitmapContextCreateImage_ADDR, CGBitmapContextCreateImage_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGBitmapContextCreateImage(arg0: MemorySegment): MemorySegment {
    try {
        return CGBitmapContextCreateImage_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorConversionInfoGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGColorConversionInfoGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGColorConversionInfoGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGColorConversionInfoGetTypeID").orElseThrow()
private val CGColorConversionInfoGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGColorConversionInfoGetTypeID_ADDR, CGColorConversionInfoGetTypeID_DESC)

fun CGColorConversionInfoGetTypeID(): Long {
    try {
        return CGColorConversionInfoGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorConversionInfoCreate typedef CGColorConversionInfoRef = (Declared(CGColorConversionInfo))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGColorConversionInfoCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorConversionInfoCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGColorConversionInfoCreate").orElseThrow()
private val CGColorConversionInfoCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGColorConversionInfoCreate_ADDR, CGColorConversionInfoCreate_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorConversionInfoCreate(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGColorConversionInfoCreate_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorConversionInfoCreateWithOptions typedef CGColorConversionInfoRef = (Declared(CGColorConversionInfo))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGColorConversionInfoCreateWithOptions_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorConversionInfoCreateWithOptions_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGColorConversionInfoCreateWithOptions").orElseThrow()
private val CGColorConversionInfoCreateWithOptions_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGColorConversionInfoCreateWithOptions_ADDR, CGColorConversionInfoCreateWithOptions_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = -1, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = 6)
fun CGColorConversionInfoCreateWithOptions(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGColorConversionInfoCreateWithOptions_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorConversionInfoCreateFromList typedef CGColorConversionInfoRef = (Declared(CGColorConversionInfo))*(typedef CFDictionaryRef = (Declared(__CFDictionary))*,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGColorConversionInfoTransformType = Declared(CGColorConversionInfoTransformType),typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent))
 */
private val CGColorConversionInfoCreateFromList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGColorConversionInfoCreateFromList_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGColorConversionInfoCreateFromList").orElseThrow()
private val CGColorConversionInfoCreateFromList_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGColorConversionInfoCreateFromList_ADDR, CGColorConversionInfoCreateFromList_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun CGColorConversionInfoCreateFromList(arg0: MemorySegment, arg1: MemorySegment, arg2: CGColorConversionInfoTransformType, arg3: CGColorRenderingIntent): MemorySegment {
    try {
        return CGColorConversionInfoCreateFromList_HANDLE.invokeExact(arg0, arg1, arg2.value.toInt(), arg3.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorConversionInfoCreateFromListWithArguments typedef CGColorConversionInfoRef = (Declared(CGColorConversionInfo))*(typedef CFDictionaryRef = (Declared(__CFDictionary))*,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGColorConversionInfoTransformType = Declared(CGColorConversionInfoTransformType),typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent),typedef va_list = (Char)*)
 */
private val CGColorConversionInfoCreateFromListWithArguments_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGColorConversionInfoCreateFromListWithArguments_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGColorConversionInfoCreateFromListWithArguments").orElseThrow()
private val CGColorConversionInfoCreateFromListWithArguments_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGColorConversionInfoCreateFromListWithArguments_ADDR, CGColorConversionInfoCreateFromListWithArguments_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CGColorConversionInfoCreateFromListWithArguments(arg0: MemorySegment, arg1: MemorySegment, arg2: CGColorConversionInfoTransformType, arg3: CGColorRenderingIntent, arg4: MemorySegment): MemorySegment {
    try {
        return CGColorConversionInfoCreateFromListWithArguments_HANDLE.invokeExact(arg0, arg1, arg2.value.toInt(), arg3.value.toInt(), arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorConversionInfoCreateForToneMapping typedef CGColorConversionInfoRef = (Declared(CGColorConversionInfo))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,Float,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,Float,typedef CGToneMapping = Declared(CGToneMapping),typedef CFDictionaryRef = (Declared(__CFDictionary))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CGColorConversionInfoCreateForToneMapping_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGColorConversionInfoCreateForToneMapping_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGColorConversionInfoCreateForToneMapping").orElseThrow()
private val CGColorConversionInfoCreateForToneMapping_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGColorConversionInfoCreateForToneMapping_ADDR, CGColorConversionInfoCreateForToneMapping_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGColorConversionInfoCreateForToneMapping(arg0: MemorySegment, arg1: Float, arg2: MemorySegment, arg3: Float, arg4: CGToneMapping, arg5: MemorySegment, arg6: MemorySegment): MemorySegment {
    try {
        return CGColorConversionInfoCreateForToneMapping_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4.value.toInt(), arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGColorConversionInfoConvertData Bool(typedef CGColorConversionInfoRef = (Declared(CGColorConversionInfo))*,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,(Void)*,typedef CGColorBufferFormat = Declared(CGColorBufferFormat),(Void)*,typedef CGColorBufferFormat = Declared(CGColorBufferFormat),typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGColorConversionInfoConvertData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, CGColorBufferFormat.layout, ValueLayout.ADDRESS, CGColorBufferFormat.layout, ValueLayout.ADDRESS)
private val CGColorConversionInfoConvertData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGColorConversionInfoConvertData").orElseThrow()
private val CGColorConversionInfoConvertData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGColorConversionInfoConvertData_ADDR, CGColorConversionInfoConvertData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGColorConversionInfoConvertData(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment): Boolean {
    try {
        return CGColorConversionInfoConvertData_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGColorConversionBlackPointCompensation typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorConversionBlackPointCompensation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorConversionBlackPointCompensation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGColorConversionBlackPointCompensation").orElseThrow().reinterpret(kCGColorConversionBlackPointCompensation_LAYOUT.byteSize()) }
private val kCGColorConversionBlackPointCompensation_VH: VarHandle by lazy { kCGColorConversionBlackPointCompensation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var kCGColorConversionBlackPointCompensation: MemorySegment
    get() = kCGColorConversionBlackPointCompensation_VH.get(kCGColorConversionBlackPointCompensation_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorConversionBlackPointCompensation_VH.set(kCGColorConversionBlackPointCompensation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorConversionTRCSize typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorConversionTRCSize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorConversionTRCSize_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGColorConversionTRCSize").orElseThrow().reinterpret(kCGColorConversionTRCSize_LAYOUT.byteSize()) }
private val kCGColorConversionTRCSize_VH: VarHandle by lazy { kCGColorConversionTRCSize_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var kCGColorConversionTRCSize: MemorySegment
    get() = kCGColorConversionTRCSize_VH.get(kCGColorConversionTRCSize_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorConversionTRCSize_VH.set(kCGColorConversionTRCSize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGConvertColorDataWithFormat Bool(typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,(Void)*,typedef CGColorDataFormat = Declared(CGColorDataFormat),(Void)*,typedef CGColorDataFormat = Declared(CGColorDataFormat),typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGConvertColorDataWithFormat_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, CGColorDataFormat.layout, ValueLayout.ADDRESS, CGColorDataFormat.layout, ValueLayout.ADDRESS)
private val CGConvertColorDataWithFormat_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGConvertColorDataWithFormat").orElseThrow()
private val CGConvertColorDataWithFormat_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGConvertColorDataWithFormat_ADDR, CGConvertColorDataWithFormat_DESC)

fun CGConvertColorDataWithFormat(arg0: Long, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment): Boolean {
    try {
        return CGConvertColorDataWithFormat_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataConsumerGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGDataConsumerGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGDataConsumerGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDataConsumerGetTypeID").orElseThrow()
private val CGDataConsumerGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDataConsumerGetTypeID_ADDR, CGDataConsumerGetTypeID_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDataConsumerGetTypeID(): Long {
    try {
        return CGDataConsumerGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataConsumerCreate typedef CGDataConsumerRef = (Declared(CGDataConsumer))*((Void)*,(typedef CGDataConsumerCallbacks = Declared(CGDataConsumerCallbacks))*)
 */
private val CGDataConsumerCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataConsumerCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDataConsumerCreate").orElseThrow()
private val CGDataConsumerCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDataConsumerCreate_ADDR, CGDataConsumerCreate_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataConsumerCreate(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGDataConsumerCreate_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataConsumerCreateWithURL typedef CGDataConsumerRef = (Declared(CGDataConsumer))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CGDataConsumerCreateWithURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataConsumerCreateWithURL_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDataConsumerCreateWithURL").orElseThrow()
private val CGDataConsumerCreateWithURL_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDataConsumerCreateWithURL_ADDR, CGDataConsumerCreateWithURL_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataConsumerCreateWithURL(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataConsumerCreateWithURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataConsumerCreateWithCFData typedef CGDataConsumerRef = (Declared(CGDataConsumer))*(typedef CFMutableDataRef = (Declared(__CFData))*)
 */
private val CGDataConsumerCreateWithCFData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataConsumerCreateWithCFData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDataConsumerCreateWithCFData").orElseThrow()
private val CGDataConsumerCreateWithCFData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDataConsumerCreateWithCFData_ADDR, CGDataConsumerCreateWithCFData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGDataConsumerCreateWithCFData(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataConsumerCreateWithCFData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataConsumerRetain typedef CGDataConsumerRef = (Declared(CGDataConsumer))*(typedef CGDataConsumerRef = (Declared(CGDataConsumer))*)
 */
private val CGDataConsumerRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDataConsumerRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDataConsumerRetain").orElseThrow()
private val CGDataConsumerRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDataConsumerRetain_ADDR, CGDataConsumerRetain_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataConsumerRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGDataConsumerRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDataConsumerRelease Void(typedef CGDataConsumerRef = (Declared(CGDataConsumer))*)
 */
private val CGDataConsumerRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGDataConsumerRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDataConsumerRelease").orElseThrow()
private val CGDataConsumerRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDataConsumerRelease_ADDR, CGDataConsumerRelease_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDataConsumerRelease(arg0: MemorySegment): Unit {
    try {
        CGDataConsumerRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGErrorSetCallback Void(typedef CGErrorCallback = (Void())*)
 */
private val CGErrorSetCallback_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGErrorSetCallback_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGErrorSetCallback").orElseThrow()
private val CGErrorSetCallback_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGErrorSetCallback_ADDR, CGErrorSetCallback_DESC)

fun CGErrorSetCallback(arg0: MemorySegment): Unit {
    try {
        CGErrorSetCallback_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGLayerCreateWithContext typedef CGLayerRef = (Declared(CGLayer))*(typedef CGContextRef = (Declared(CGContext))*,typedef CGSize = Declared(CGSize),typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGLayerCreateWithContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGSize.layout, ValueLayout.ADDRESS)
private val CGLayerCreateWithContext_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGLayerCreateWithContext").orElseThrow()
private val CGLayerCreateWithContext_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGLayerCreateWithContext_ADDR, CGLayerCreateWithContext_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGLayerCreateWithContext(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGLayerCreateWithContext_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
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
fun CGLayerCreateWithContext(arg0: MemorySegment, arg1: CGSize, arg2: MemorySegment): MemorySegment {
    return CGLayerCreateWithContext(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGLayerRetain typedef CGLayerRef = (Declared(CGLayer))*(typedef CGLayerRef = (Declared(CGLayer))*)
 */
private val CGLayerRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGLayerRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGLayerRetain").orElseThrow()
private val CGLayerRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGLayerRetain_ADDR, CGLayerRetain_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGLayerRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGLayerRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGLayerRelease Void(typedef CGLayerRef = (Declared(CGLayer))*)
 */
private val CGLayerRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGLayerRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGLayerRelease").orElseThrow()
private val CGLayerRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGLayerRelease_ADDR, CGLayerRelease_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGLayerRelease(arg0: MemorySegment): Unit {
    try {
        CGLayerRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGLayerGetSize typedef CGSize = Declared(CGSize)(typedef CGLayerRef = (Declared(CGLayer))*)
 */
private val CGLayerGetSize_DESC: FunctionDescriptor = FunctionDescriptor.of(CGSize.layout, ValueLayout.ADDRESS)
private val CGLayerGetSize_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGLayerGetSize").orElseThrow()
private val CGLayerGetSize_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGLayerGetSize_ADDR, CGLayerGetSize_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGLayerGetSize(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGLayerGetSize_HANDLE.invokeExact(allocator, arg0) as MemorySegment
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
fun CGLayerGetSizeTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGSize {
    return CGSize(CGLayerGetSize(allocator, arg0))
}

/**
 * {@snippet lang=c : CGLayerGetContext typedef CGContextRef = (Declared(CGContext))*(typedef CGLayerRef = (Declared(CGLayer))*)
 */
private val CGLayerGetContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGLayerGetContext_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGLayerGetContext").orElseThrow()
private val CGLayerGetContext_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGLayerGetContext_ADDR, CGLayerGetContext_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGLayerGetContext(arg0: MemorySegment): MemorySegment {
    try {
        return CGLayerGetContext_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}
