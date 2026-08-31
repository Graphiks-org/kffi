@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : NSImageNameTouchBarDeleteTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarDeleteTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarDeleteTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarDeleteTemplate").orElseThrow().reinterpret(NSImageNameTouchBarDeleteTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarDeleteTemplate_VH: VarHandle by lazy { NSImageNameTouchBarDeleteTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarDeleteTemplate: MemorySegment
    get() = NSImageNameTouchBarDeleteTemplate_VH.get(NSImageNameTouchBarDeleteTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarDeleteTemplate_VH.set(NSImageNameTouchBarDeleteTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarDownloadTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarDownloadTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarDownloadTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarDownloadTemplate").orElseThrow().reinterpret(NSImageNameTouchBarDownloadTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarDownloadTemplate_VH: VarHandle by lazy { NSImageNameTouchBarDownloadTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarDownloadTemplate: MemorySegment
    get() = NSImageNameTouchBarDownloadTemplate_VH.get(NSImageNameTouchBarDownloadTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarDownloadTemplate_VH.set(NSImageNameTouchBarDownloadTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarEnterFullScreenTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarEnterFullScreenTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarEnterFullScreenTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarEnterFullScreenTemplate").orElseThrow().reinterpret(NSImageNameTouchBarEnterFullScreenTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarEnterFullScreenTemplate_VH: VarHandle by lazy { NSImageNameTouchBarEnterFullScreenTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarEnterFullScreenTemplate: MemorySegment
    get() = NSImageNameTouchBarEnterFullScreenTemplate_VH.get(NSImageNameTouchBarEnterFullScreenTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarEnterFullScreenTemplate_VH.set(NSImageNameTouchBarEnterFullScreenTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarExitFullScreenTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarExitFullScreenTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarExitFullScreenTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarExitFullScreenTemplate").orElseThrow().reinterpret(NSImageNameTouchBarExitFullScreenTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarExitFullScreenTemplate_VH: VarHandle by lazy { NSImageNameTouchBarExitFullScreenTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarExitFullScreenTemplate: MemorySegment
    get() = NSImageNameTouchBarExitFullScreenTemplate_VH.get(NSImageNameTouchBarExitFullScreenTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarExitFullScreenTemplate_VH.set(NSImageNameTouchBarExitFullScreenTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarFastForwardTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarFastForwardTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarFastForwardTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarFastForwardTemplate").orElseThrow().reinterpret(NSImageNameTouchBarFastForwardTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarFastForwardTemplate_VH: VarHandle by lazy { NSImageNameTouchBarFastForwardTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarFastForwardTemplate: MemorySegment
    get() = NSImageNameTouchBarFastForwardTemplate_VH.get(NSImageNameTouchBarFastForwardTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarFastForwardTemplate_VH.set(NSImageNameTouchBarFastForwardTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarFolderCopyToTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarFolderCopyToTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarFolderCopyToTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarFolderCopyToTemplate").orElseThrow().reinterpret(NSImageNameTouchBarFolderCopyToTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarFolderCopyToTemplate_VH: VarHandle by lazy { NSImageNameTouchBarFolderCopyToTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarFolderCopyToTemplate: MemorySegment
    get() = NSImageNameTouchBarFolderCopyToTemplate_VH.get(NSImageNameTouchBarFolderCopyToTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarFolderCopyToTemplate_VH.set(NSImageNameTouchBarFolderCopyToTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarFolderMoveToTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarFolderMoveToTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarFolderMoveToTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarFolderMoveToTemplate").orElseThrow().reinterpret(NSImageNameTouchBarFolderMoveToTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarFolderMoveToTemplate_VH: VarHandle by lazy { NSImageNameTouchBarFolderMoveToTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarFolderMoveToTemplate: MemorySegment
    get() = NSImageNameTouchBarFolderMoveToTemplate_VH.get(NSImageNameTouchBarFolderMoveToTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarFolderMoveToTemplate_VH.set(NSImageNameTouchBarFolderMoveToTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarFolderTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarFolderTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarFolderTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarFolderTemplate").orElseThrow().reinterpret(NSImageNameTouchBarFolderTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarFolderTemplate_VH: VarHandle by lazy { NSImageNameTouchBarFolderTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarFolderTemplate: MemorySegment
    get() = NSImageNameTouchBarFolderTemplate_VH.get(NSImageNameTouchBarFolderTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarFolderTemplate_VH.set(NSImageNameTouchBarFolderTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarGetInfoTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarGetInfoTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarGetInfoTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarGetInfoTemplate").orElseThrow().reinterpret(NSImageNameTouchBarGetInfoTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarGetInfoTemplate_VH: VarHandle by lazy { NSImageNameTouchBarGetInfoTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarGetInfoTemplate: MemorySegment
    get() = NSImageNameTouchBarGetInfoTemplate_VH.get(NSImageNameTouchBarGetInfoTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarGetInfoTemplate_VH.set(NSImageNameTouchBarGetInfoTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarGoBackTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarGoBackTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarGoBackTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarGoBackTemplate").orElseThrow().reinterpret(NSImageNameTouchBarGoBackTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarGoBackTemplate_VH: VarHandle by lazy { NSImageNameTouchBarGoBackTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarGoBackTemplate: MemorySegment
    get() = NSImageNameTouchBarGoBackTemplate_VH.get(NSImageNameTouchBarGoBackTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarGoBackTemplate_VH.set(NSImageNameTouchBarGoBackTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarGoDownTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarGoDownTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarGoDownTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarGoDownTemplate").orElseThrow().reinterpret(NSImageNameTouchBarGoDownTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarGoDownTemplate_VH: VarHandle by lazy { NSImageNameTouchBarGoDownTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarGoDownTemplate: MemorySegment
    get() = NSImageNameTouchBarGoDownTemplate_VH.get(NSImageNameTouchBarGoDownTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarGoDownTemplate_VH.set(NSImageNameTouchBarGoDownTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarGoForwardTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarGoForwardTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarGoForwardTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarGoForwardTemplate").orElseThrow().reinterpret(NSImageNameTouchBarGoForwardTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarGoForwardTemplate_VH: VarHandle by lazy { NSImageNameTouchBarGoForwardTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarGoForwardTemplate: MemorySegment
    get() = NSImageNameTouchBarGoForwardTemplate_VH.get(NSImageNameTouchBarGoForwardTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarGoForwardTemplate_VH.set(NSImageNameTouchBarGoForwardTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarGoUpTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarGoUpTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarGoUpTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarGoUpTemplate").orElseThrow().reinterpret(NSImageNameTouchBarGoUpTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarGoUpTemplate_VH: VarHandle by lazy { NSImageNameTouchBarGoUpTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarGoUpTemplate: MemorySegment
    get() = NSImageNameTouchBarGoUpTemplate_VH.get(NSImageNameTouchBarGoUpTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarGoUpTemplate_VH.set(NSImageNameTouchBarGoUpTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarHistoryTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarHistoryTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarHistoryTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarHistoryTemplate").orElseThrow().reinterpret(NSImageNameTouchBarHistoryTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarHistoryTemplate_VH: VarHandle by lazy { NSImageNameTouchBarHistoryTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarHistoryTemplate: MemorySegment
    get() = NSImageNameTouchBarHistoryTemplate_VH.get(NSImageNameTouchBarHistoryTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarHistoryTemplate_VH.set(NSImageNameTouchBarHistoryTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarIconViewTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarIconViewTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarIconViewTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarIconViewTemplate").orElseThrow().reinterpret(NSImageNameTouchBarIconViewTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarIconViewTemplate_VH: VarHandle by lazy { NSImageNameTouchBarIconViewTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarIconViewTemplate: MemorySegment
    get() = NSImageNameTouchBarIconViewTemplate_VH.get(NSImageNameTouchBarIconViewTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarIconViewTemplate_VH.set(NSImageNameTouchBarIconViewTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarListViewTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarListViewTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarListViewTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarListViewTemplate").orElseThrow().reinterpret(NSImageNameTouchBarListViewTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarListViewTemplate_VH: VarHandle by lazy { NSImageNameTouchBarListViewTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarListViewTemplate: MemorySegment
    get() = NSImageNameTouchBarListViewTemplate_VH.get(NSImageNameTouchBarListViewTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarListViewTemplate_VH.set(NSImageNameTouchBarListViewTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarMailTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarMailTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarMailTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarMailTemplate").orElseThrow().reinterpret(NSImageNameTouchBarMailTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarMailTemplate_VH: VarHandle by lazy { NSImageNameTouchBarMailTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarMailTemplate: MemorySegment
    get() = NSImageNameTouchBarMailTemplate_VH.get(NSImageNameTouchBarMailTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarMailTemplate_VH.set(NSImageNameTouchBarMailTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarNewFolderTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarNewFolderTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarNewFolderTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarNewFolderTemplate").orElseThrow().reinterpret(NSImageNameTouchBarNewFolderTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarNewFolderTemplate_VH: VarHandle by lazy { NSImageNameTouchBarNewFolderTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarNewFolderTemplate: MemorySegment
    get() = NSImageNameTouchBarNewFolderTemplate_VH.get(NSImageNameTouchBarNewFolderTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarNewFolderTemplate_VH.set(NSImageNameTouchBarNewFolderTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarNewMessageTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarNewMessageTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarNewMessageTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarNewMessageTemplate").orElseThrow().reinterpret(NSImageNameTouchBarNewMessageTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarNewMessageTemplate_VH: VarHandle by lazy { NSImageNameTouchBarNewMessageTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarNewMessageTemplate: MemorySegment
    get() = NSImageNameTouchBarNewMessageTemplate_VH.get(NSImageNameTouchBarNewMessageTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarNewMessageTemplate_VH.set(NSImageNameTouchBarNewMessageTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarOpenInBrowserTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarOpenInBrowserTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarOpenInBrowserTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarOpenInBrowserTemplate").orElseThrow().reinterpret(NSImageNameTouchBarOpenInBrowserTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarOpenInBrowserTemplate_VH: VarHandle by lazy { NSImageNameTouchBarOpenInBrowserTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarOpenInBrowserTemplate: MemorySegment
    get() = NSImageNameTouchBarOpenInBrowserTemplate_VH.get(NSImageNameTouchBarOpenInBrowserTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarOpenInBrowserTemplate_VH.set(NSImageNameTouchBarOpenInBrowserTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarPauseTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarPauseTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarPauseTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarPauseTemplate").orElseThrow().reinterpret(NSImageNameTouchBarPauseTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarPauseTemplate_VH: VarHandle by lazy { NSImageNameTouchBarPauseTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarPauseTemplate: MemorySegment
    get() = NSImageNameTouchBarPauseTemplate_VH.get(NSImageNameTouchBarPauseTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarPauseTemplate_VH.set(NSImageNameTouchBarPauseTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarPlayPauseTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarPlayPauseTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarPlayPauseTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarPlayPauseTemplate").orElseThrow().reinterpret(NSImageNameTouchBarPlayPauseTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarPlayPauseTemplate_VH: VarHandle by lazy { NSImageNameTouchBarPlayPauseTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarPlayPauseTemplate: MemorySegment
    get() = NSImageNameTouchBarPlayPauseTemplate_VH.get(NSImageNameTouchBarPlayPauseTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarPlayPauseTemplate_VH.set(NSImageNameTouchBarPlayPauseTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarPlayTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarPlayTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarPlayTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarPlayTemplate").orElseThrow().reinterpret(NSImageNameTouchBarPlayTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarPlayTemplate_VH: VarHandle by lazy { NSImageNameTouchBarPlayTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarPlayTemplate: MemorySegment
    get() = NSImageNameTouchBarPlayTemplate_VH.get(NSImageNameTouchBarPlayTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarPlayTemplate_VH.set(NSImageNameTouchBarPlayTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarQuickLookTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarQuickLookTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarQuickLookTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarQuickLookTemplate").orElseThrow().reinterpret(NSImageNameTouchBarQuickLookTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarQuickLookTemplate_VH: VarHandle by lazy { NSImageNameTouchBarQuickLookTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarQuickLookTemplate: MemorySegment
    get() = NSImageNameTouchBarQuickLookTemplate_VH.get(NSImageNameTouchBarQuickLookTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarQuickLookTemplate_VH.set(NSImageNameTouchBarQuickLookTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarRecordStartTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarRecordStartTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarRecordStartTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarRecordStartTemplate").orElseThrow().reinterpret(NSImageNameTouchBarRecordStartTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarRecordStartTemplate_VH: VarHandle by lazy { NSImageNameTouchBarRecordStartTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarRecordStartTemplate: MemorySegment
    get() = NSImageNameTouchBarRecordStartTemplate_VH.get(NSImageNameTouchBarRecordStartTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarRecordStartTemplate_VH.set(NSImageNameTouchBarRecordStartTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarRecordStopTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarRecordStopTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarRecordStopTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarRecordStopTemplate").orElseThrow().reinterpret(NSImageNameTouchBarRecordStopTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarRecordStopTemplate_VH: VarHandle by lazy { NSImageNameTouchBarRecordStopTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarRecordStopTemplate: MemorySegment
    get() = NSImageNameTouchBarRecordStopTemplate_VH.get(NSImageNameTouchBarRecordStopTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarRecordStopTemplate_VH.set(NSImageNameTouchBarRecordStopTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarRefreshTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarRefreshTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarRefreshTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarRefreshTemplate").orElseThrow().reinterpret(NSImageNameTouchBarRefreshTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarRefreshTemplate_VH: VarHandle by lazy { NSImageNameTouchBarRefreshTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarRefreshTemplate: MemorySegment
    get() = NSImageNameTouchBarRefreshTemplate_VH.get(NSImageNameTouchBarRefreshTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarRefreshTemplate_VH.set(NSImageNameTouchBarRefreshTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarRemoveTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarRemoveTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarRemoveTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarRemoveTemplate").orElseThrow().reinterpret(NSImageNameTouchBarRemoveTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarRemoveTemplate_VH: VarHandle by lazy { NSImageNameTouchBarRemoveTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var NSImageNameTouchBarRemoveTemplate: MemorySegment
    get() = NSImageNameTouchBarRemoveTemplate_VH.get(NSImageNameTouchBarRemoveTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarRemoveTemplate_VH.set(NSImageNameTouchBarRemoveTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarRewindTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarRewindTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarRewindTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarRewindTemplate").orElseThrow().reinterpret(NSImageNameTouchBarRewindTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarRewindTemplate_VH: VarHandle by lazy { NSImageNameTouchBarRewindTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarRewindTemplate: MemorySegment
    get() = NSImageNameTouchBarRewindTemplate_VH.get(NSImageNameTouchBarRewindTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarRewindTemplate_VH.set(NSImageNameTouchBarRewindTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarRotateLeftTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarRotateLeftTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarRotateLeftTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarRotateLeftTemplate").orElseThrow().reinterpret(NSImageNameTouchBarRotateLeftTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarRotateLeftTemplate_VH: VarHandle by lazy { NSImageNameTouchBarRotateLeftTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarRotateLeftTemplate: MemorySegment
    get() = NSImageNameTouchBarRotateLeftTemplate_VH.get(NSImageNameTouchBarRotateLeftTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarRotateLeftTemplate_VH.set(NSImageNameTouchBarRotateLeftTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarRotateRightTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarRotateRightTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarRotateRightTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarRotateRightTemplate").orElseThrow().reinterpret(NSImageNameTouchBarRotateRightTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarRotateRightTemplate_VH: VarHandle by lazy { NSImageNameTouchBarRotateRightTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarRotateRightTemplate: MemorySegment
    get() = NSImageNameTouchBarRotateRightTemplate_VH.get(NSImageNameTouchBarRotateRightTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarRotateRightTemplate_VH.set(NSImageNameTouchBarRotateRightTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSearchTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSearchTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSearchTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSearchTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSearchTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSearchTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSearchTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSearchTemplate: MemorySegment
    get() = NSImageNameTouchBarSearchTemplate_VH.get(NSImageNameTouchBarSearchTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSearchTemplate_VH.set(NSImageNameTouchBarSearchTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarShareTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarShareTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarShareTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarShareTemplate").orElseThrow().reinterpret(NSImageNameTouchBarShareTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarShareTemplate_VH: VarHandle by lazy { NSImageNameTouchBarShareTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarShareTemplate: MemorySegment
    get() = NSImageNameTouchBarShareTemplate_VH.get(NSImageNameTouchBarShareTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarShareTemplate_VH.set(NSImageNameTouchBarShareTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSidebarTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSidebarTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSidebarTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSidebarTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSidebarTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSidebarTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSidebarTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSidebarTemplate: MemorySegment
    get() = NSImageNameTouchBarSidebarTemplate_VH.get(NSImageNameTouchBarSidebarTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSidebarTemplate_VH.set(NSImageNameTouchBarSidebarTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSkipAhead15SecondsTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSkipAhead15SecondsTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSkipAhead15SecondsTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSkipAhead15SecondsTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSkipAhead15SecondsTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSkipAhead15SecondsTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSkipAhead15SecondsTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSkipAhead15SecondsTemplate: MemorySegment
    get() = NSImageNameTouchBarSkipAhead15SecondsTemplate_VH.get(NSImageNameTouchBarSkipAhead15SecondsTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSkipAhead15SecondsTemplate_VH.set(NSImageNameTouchBarSkipAhead15SecondsTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSkipAhead30SecondsTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSkipAhead30SecondsTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSkipAhead30SecondsTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSkipAhead30SecondsTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSkipAhead30SecondsTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSkipAhead30SecondsTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSkipAhead30SecondsTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSkipAhead30SecondsTemplate: MemorySegment
    get() = NSImageNameTouchBarSkipAhead30SecondsTemplate_VH.get(NSImageNameTouchBarSkipAhead30SecondsTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSkipAhead30SecondsTemplate_VH.set(NSImageNameTouchBarSkipAhead30SecondsTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSkipAheadTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSkipAheadTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSkipAheadTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSkipAheadTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSkipAheadTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSkipAheadTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSkipAheadTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSkipAheadTemplate: MemorySegment
    get() = NSImageNameTouchBarSkipAheadTemplate_VH.get(NSImageNameTouchBarSkipAheadTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSkipAheadTemplate_VH.set(NSImageNameTouchBarSkipAheadTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSkipBack15SecondsTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSkipBack15SecondsTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSkipBack15SecondsTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSkipBack15SecondsTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSkipBack15SecondsTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSkipBack15SecondsTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSkipBack15SecondsTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSkipBack15SecondsTemplate: MemorySegment
    get() = NSImageNameTouchBarSkipBack15SecondsTemplate_VH.get(NSImageNameTouchBarSkipBack15SecondsTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSkipBack15SecondsTemplate_VH.set(NSImageNameTouchBarSkipBack15SecondsTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSkipBack30SecondsTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSkipBack30SecondsTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSkipBack30SecondsTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSkipBack30SecondsTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSkipBack30SecondsTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSkipBack30SecondsTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSkipBack30SecondsTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSkipBack30SecondsTemplate: MemorySegment
    get() = NSImageNameTouchBarSkipBack30SecondsTemplate_VH.get(NSImageNameTouchBarSkipBack30SecondsTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSkipBack30SecondsTemplate_VH.set(NSImageNameTouchBarSkipBack30SecondsTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSkipBackTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSkipBackTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSkipBackTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSkipBackTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSkipBackTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSkipBackTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSkipBackTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSkipBackTemplate: MemorySegment
    get() = NSImageNameTouchBarSkipBackTemplate_VH.get(NSImageNameTouchBarSkipBackTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSkipBackTemplate_VH.set(NSImageNameTouchBarSkipBackTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSkipToEndTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSkipToEndTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSkipToEndTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSkipToEndTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSkipToEndTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSkipToEndTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSkipToEndTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSkipToEndTemplate: MemorySegment
    get() = NSImageNameTouchBarSkipToEndTemplate_VH.get(NSImageNameTouchBarSkipToEndTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSkipToEndTemplate_VH.set(NSImageNameTouchBarSkipToEndTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSkipToStartTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSkipToStartTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSkipToStartTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSkipToStartTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSkipToStartTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSkipToStartTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSkipToStartTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSkipToStartTemplate: MemorySegment
    get() = NSImageNameTouchBarSkipToStartTemplate_VH.get(NSImageNameTouchBarSkipToStartTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSkipToStartTemplate_VH.set(NSImageNameTouchBarSkipToStartTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarSlideshowTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarSlideshowTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarSlideshowTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarSlideshowTemplate").orElseThrow().reinterpret(NSImageNameTouchBarSlideshowTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarSlideshowTemplate_VH: VarHandle by lazy { NSImageNameTouchBarSlideshowTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarSlideshowTemplate: MemorySegment
    get() = NSImageNameTouchBarSlideshowTemplate_VH.get(NSImageNameTouchBarSlideshowTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarSlideshowTemplate_VH.set(NSImageNameTouchBarSlideshowTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTagIconTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTagIconTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTagIconTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTagIconTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTagIconTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTagIconTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTagIconTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTagIconTemplate: MemorySegment
    get() = NSImageNameTouchBarTagIconTemplate_VH.get(NSImageNameTouchBarTagIconTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTagIconTemplate_VH.set(NSImageNameTouchBarTagIconTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextBoldTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextBoldTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextBoldTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextBoldTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextBoldTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextBoldTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextBoldTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextBoldTemplate: MemorySegment
    get() = NSImageNameTouchBarTextBoldTemplate_VH.get(NSImageNameTouchBarTextBoldTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextBoldTemplate_VH.set(NSImageNameTouchBarTextBoldTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextBoxTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextBoxTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextBoxTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextBoxTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextBoxTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextBoxTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextBoxTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextBoxTemplate: MemorySegment
    get() = NSImageNameTouchBarTextBoxTemplate_VH.get(NSImageNameTouchBarTextBoxTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextBoxTemplate_VH.set(NSImageNameTouchBarTextBoxTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextCenterAlignTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextCenterAlignTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextCenterAlignTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextCenterAlignTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextCenterAlignTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextCenterAlignTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextCenterAlignTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextCenterAlignTemplate: MemorySegment
    get() = NSImageNameTouchBarTextCenterAlignTemplate_VH.get(NSImageNameTouchBarTextCenterAlignTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextCenterAlignTemplate_VH.set(NSImageNameTouchBarTextCenterAlignTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextItalicTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextItalicTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextItalicTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextItalicTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextItalicTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextItalicTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextItalicTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextItalicTemplate: MemorySegment
    get() = NSImageNameTouchBarTextItalicTemplate_VH.get(NSImageNameTouchBarTextItalicTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextItalicTemplate_VH.set(NSImageNameTouchBarTextItalicTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextJustifiedAlignTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextJustifiedAlignTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextJustifiedAlignTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextJustifiedAlignTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextJustifiedAlignTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextJustifiedAlignTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextJustifiedAlignTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextJustifiedAlignTemplate: MemorySegment
    get() = NSImageNameTouchBarTextJustifiedAlignTemplate_VH.get(NSImageNameTouchBarTextJustifiedAlignTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextJustifiedAlignTemplate_VH.set(NSImageNameTouchBarTextJustifiedAlignTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextLeftAlignTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextLeftAlignTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextLeftAlignTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextLeftAlignTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextLeftAlignTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextLeftAlignTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextLeftAlignTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextLeftAlignTemplate: MemorySegment
    get() = NSImageNameTouchBarTextLeftAlignTemplate_VH.get(NSImageNameTouchBarTextLeftAlignTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextLeftAlignTemplate_VH.set(NSImageNameTouchBarTextLeftAlignTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextListTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextListTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextListTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextListTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextListTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextListTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextListTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextListTemplate: MemorySegment
    get() = NSImageNameTouchBarTextListTemplate_VH.get(NSImageNameTouchBarTextListTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextListTemplate_VH.set(NSImageNameTouchBarTextListTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextRightAlignTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextRightAlignTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextRightAlignTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextRightAlignTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextRightAlignTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextRightAlignTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextRightAlignTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextRightAlignTemplate: MemorySegment
    get() = NSImageNameTouchBarTextRightAlignTemplate_VH.get(NSImageNameTouchBarTextRightAlignTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextRightAlignTemplate_VH.set(NSImageNameTouchBarTextRightAlignTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextStrikethroughTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextStrikethroughTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextStrikethroughTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextStrikethroughTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextStrikethroughTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextStrikethroughTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextStrikethroughTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextStrikethroughTemplate: MemorySegment
    get() = NSImageNameTouchBarTextStrikethroughTemplate_VH.get(NSImageNameTouchBarTextStrikethroughTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextStrikethroughTemplate_VH.set(NSImageNameTouchBarTextStrikethroughTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarTextUnderlineTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarTextUnderlineTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarTextUnderlineTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarTextUnderlineTemplate").orElseThrow().reinterpret(NSImageNameTouchBarTextUnderlineTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarTextUnderlineTemplate_VH: VarHandle by lazy { NSImageNameTouchBarTextUnderlineTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarTextUnderlineTemplate: MemorySegment
    get() = NSImageNameTouchBarTextUnderlineTemplate_VH.get(NSImageNameTouchBarTextUnderlineTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarTextUnderlineTemplate_VH.set(NSImageNameTouchBarTextUnderlineTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarUserAddTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarUserAddTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarUserAddTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarUserAddTemplate").orElseThrow().reinterpret(NSImageNameTouchBarUserAddTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarUserAddTemplate_VH: VarHandle by lazy { NSImageNameTouchBarUserAddTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarUserAddTemplate: MemorySegment
    get() = NSImageNameTouchBarUserAddTemplate_VH.get(NSImageNameTouchBarUserAddTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarUserAddTemplate_VH.set(NSImageNameTouchBarUserAddTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarUserGroupTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarUserGroupTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarUserGroupTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarUserGroupTemplate").orElseThrow().reinterpret(NSImageNameTouchBarUserGroupTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarUserGroupTemplate_VH: VarHandle by lazy { NSImageNameTouchBarUserGroupTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarUserGroupTemplate: MemorySegment
    get() = NSImageNameTouchBarUserGroupTemplate_VH.get(NSImageNameTouchBarUserGroupTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarUserGroupTemplate_VH.set(NSImageNameTouchBarUserGroupTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarUserTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarUserTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarUserTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarUserTemplate").orElseThrow().reinterpret(NSImageNameTouchBarUserTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarUserTemplate_VH: VarHandle by lazy { NSImageNameTouchBarUserTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarUserTemplate: MemorySegment
    get() = NSImageNameTouchBarUserTemplate_VH.get(NSImageNameTouchBarUserTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarUserTemplate_VH.set(NSImageNameTouchBarUserTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarVolumeDownTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarVolumeDownTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarVolumeDownTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarVolumeDownTemplate").orElseThrow().reinterpret(NSImageNameTouchBarVolumeDownTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarVolumeDownTemplate_VH: VarHandle by lazy { NSImageNameTouchBarVolumeDownTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarVolumeDownTemplate: MemorySegment
    get() = NSImageNameTouchBarVolumeDownTemplate_VH.get(NSImageNameTouchBarVolumeDownTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarVolumeDownTemplate_VH.set(NSImageNameTouchBarVolumeDownTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarVolumeUpTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarVolumeUpTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarVolumeUpTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarVolumeUpTemplate").orElseThrow().reinterpret(NSImageNameTouchBarVolumeUpTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarVolumeUpTemplate_VH: VarHandle by lazy { NSImageNameTouchBarVolumeUpTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarVolumeUpTemplate: MemorySegment
    get() = NSImageNameTouchBarVolumeUpTemplate_VH.get(NSImageNameTouchBarVolumeUpTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarVolumeUpTemplate_VH.set(NSImageNameTouchBarVolumeUpTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageNameTouchBarPlayheadTemplate typedef const NSImageName = (Void)*
 */
private val NSImageNameTouchBarPlayheadTemplate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageNameTouchBarPlayheadTemplate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSImageNameTouchBarPlayheadTemplate").orElseThrow().reinterpret(NSImageNameTouchBarPlayheadTemplate_LAYOUT.byteSize()) }
private val NSImageNameTouchBarPlayheadTemplate_VH: VarHandle by lazy { NSImageNameTouchBarPlayheadTemplate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSImageNameTouchBarPlayheadTemplate: MemorySegment
    get() = NSImageNameTouchBarPlayheadTemplate_VH.get(NSImageNameTouchBarPlayheadTemplate_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageNameTouchBarPlayheadTemplate_VH.set(NSImageNameTouchBarPlayheadTemplate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameComposeEmail typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameComposeEmail_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameComposeEmail_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameComposeEmail").orElseThrow().reinterpret(NSSharingServiceNameComposeEmail_LAYOUT.byteSize()) }
private val NSSharingServiceNameComposeEmail_VH: VarHandle by lazy { NSSharingServiceNameComposeEmail_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSSharingServiceNameComposeEmail: MemorySegment
    get() = NSSharingServiceNameComposeEmail_VH.get(NSSharingServiceNameComposeEmail_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameComposeEmail_VH.set(NSSharingServiceNameComposeEmail_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameComposeMessage typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameComposeMessage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameComposeMessage_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameComposeMessage").orElseThrow().reinterpret(NSSharingServiceNameComposeMessage_LAYOUT.byteSize()) }
private val NSSharingServiceNameComposeMessage_VH: VarHandle by lazy { NSSharingServiceNameComposeMessage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSSharingServiceNameComposeMessage: MemorySegment
    get() = NSSharingServiceNameComposeMessage_VH.get(NSSharingServiceNameComposeMessage_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameComposeMessage_VH.set(NSSharingServiceNameComposeMessage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameSendViaAirDrop typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameSendViaAirDrop_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameSendViaAirDrop_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameSendViaAirDrop").orElseThrow().reinterpret(NSSharingServiceNameSendViaAirDrop_LAYOUT.byteSize()) }
private val NSSharingServiceNameSendViaAirDrop_VH: VarHandle by lazy { NSSharingServiceNameSendViaAirDrop_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSSharingServiceNameSendViaAirDrop: MemorySegment
    get() = NSSharingServiceNameSendViaAirDrop_VH.get(NSSharingServiceNameSendViaAirDrop_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameSendViaAirDrop_VH.set(NSSharingServiceNameSendViaAirDrop_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameAddToSafariReadingList typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameAddToSafariReadingList_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameAddToSafariReadingList_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameAddToSafariReadingList").orElseThrow().reinterpret(NSSharingServiceNameAddToSafariReadingList_LAYOUT.byteSize()) }
private val NSSharingServiceNameAddToSafariReadingList_VH: VarHandle by lazy { NSSharingServiceNameAddToSafariReadingList_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSSharingServiceNameAddToSafariReadingList: MemorySegment
    get() = NSSharingServiceNameAddToSafariReadingList_VH.get(NSSharingServiceNameAddToSafariReadingList_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameAddToSafariReadingList_VH.set(NSSharingServiceNameAddToSafariReadingList_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameAddToIPhoto typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameAddToIPhoto_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameAddToIPhoto_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameAddToIPhoto").orElseThrow().reinterpret(NSSharingServiceNameAddToIPhoto_LAYOUT.byteSize()) }
private val NSSharingServiceNameAddToIPhoto_VH: VarHandle by lazy { NSSharingServiceNameAddToIPhoto_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSSharingServiceNameAddToIPhoto: MemorySegment
    get() = NSSharingServiceNameAddToIPhoto_VH.get(NSSharingServiceNameAddToIPhoto_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameAddToIPhoto_VH.set(NSSharingServiceNameAddToIPhoto_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameAddToAperture typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameAddToAperture_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameAddToAperture_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameAddToAperture").orElseThrow().reinterpret(NSSharingServiceNameAddToAperture_LAYOUT.byteSize()) }
private val NSSharingServiceNameAddToAperture_VH: VarHandle by lazy { NSSharingServiceNameAddToAperture_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSSharingServiceNameAddToAperture: MemorySegment
    get() = NSSharingServiceNameAddToAperture_VH.get(NSSharingServiceNameAddToAperture_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameAddToAperture_VH.set(NSSharingServiceNameAddToAperture_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameUseAsDesktopPicture typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameUseAsDesktopPicture_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameUseAsDesktopPicture_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameUseAsDesktopPicture").orElseThrow().reinterpret(NSSharingServiceNameUseAsDesktopPicture_LAYOUT.byteSize()) }
private val NSSharingServiceNameUseAsDesktopPicture_VH: VarHandle by lazy { NSSharingServiceNameUseAsDesktopPicture_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSSharingServiceNameUseAsDesktopPicture: MemorySegment
    get() = NSSharingServiceNameUseAsDesktopPicture_VH.get(NSSharingServiceNameUseAsDesktopPicture_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameUseAsDesktopPicture_VH.set(NSSharingServiceNameUseAsDesktopPicture_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostOnFacebook typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostOnFacebook_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostOnFacebook_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostOnFacebook").orElseThrow().reinterpret(NSSharingServiceNamePostOnFacebook_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostOnFacebook_VH: VarHandle by lazy { NSSharingServiceNamePostOnFacebook_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostOnFacebook: MemorySegment
    get() = NSSharingServiceNamePostOnFacebook_VH.get(NSSharingServiceNamePostOnFacebook_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostOnFacebook_VH.set(NSSharingServiceNamePostOnFacebook_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostOnTwitter typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostOnTwitter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostOnTwitter_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostOnTwitter").orElseThrow().reinterpret(NSSharingServiceNamePostOnTwitter_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostOnTwitter_VH: VarHandle by lazy { NSSharingServiceNamePostOnTwitter_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostOnTwitter: MemorySegment
    get() = NSSharingServiceNamePostOnTwitter_VH.get(NSSharingServiceNamePostOnTwitter_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostOnTwitter_VH.set(NSSharingServiceNamePostOnTwitter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostOnSinaWeibo typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostOnSinaWeibo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostOnSinaWeibo_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostOnSinaWeibo").orElseThrow().reinterpret(NSSharingServiceNamePostOnSinaWeibo_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostOnSinaWeibo_VH: VarHandle by lazy { NSSharingServiceNamePostOnSinaWeibo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostOnSinaWeibo: MemorySegment
    get() = NSSharingServiceNamePostOnSinaWeibo_VH.get(NSSharingServiceNamePostOnSinaWeibo_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostOnSinaWeibo_VH.set(NSSharingServiceNamePostOnSinaWeibo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostOnTencentWeibo typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostOnTencentWeibo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostOnTencentWeibo_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostOnTencentWeibo").orElseThrow().reinterpret(NSSharingServiceNamePostOnTencentWeibo_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostOnTencentWeibo_VH: VarHandle by lazy { NSSharingServiceNamePostOnTencentWeibo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostOnTencentWeibo: MemorySegment
    get() = NSSharingServiceNamePostOnTencentWeibo_VH.get(NSSharingServiceNamePostOnTencentWeibo_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostOnTencentWeibo_VH.set(NSSharingServiceNamePostOnTencentWeibo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostOnLinkedIn typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostOnLinkedIn_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostOnLinkedIn_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostOnLinkedIn").orElseThrow().reinterpret(NSSharingServiceNamePostOnLinkedIn_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostOnLinkedIn_VH: VarHandle by lazy { NSSharingServiceNamePostOnLinkedIn_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostOnLinkedIn: MemorySegment
    get() = NSSharingServiceNamePostOnLinkedIn_VH.get(NSSharingServiceNamePostOnLinkedIn_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostOnLinkedIn_VH.set(NSSharingServiceNamePostOnLinkedIn_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameUseAsTwitterProfileImage typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameUseAsTwitterProfileImage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameUseAsTwitterProfileImage_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameUseAsTwitterProfileImage").orElseThrow().reinterpret(NSSharingServiceNameUseAsTwitterProfileImage_LAYOUT.byteSize()) }
private val NSSharingServiceNameUseAsTwitterProfileImage_VH: VarHandle by lazy { NSSharingServiceNameUseAsTwitterProfileImage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNameUseAsTwitterProfileImage: MemorySegment
    get() = NSSharingServiceNameUseAsTwitterProfileImage_VH.get(NSSharingServiceNameUseAsTwitterProfileImage_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameUseAsTwitterProfileImage_VH.set(NSSharingServiceNameUseAsTwitterProfileImage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameUseAsFacebookProfileImage typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameUseAsFacebookProfileImage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameUseAsFacebookProfileImage_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameUseAsFacebookProfileImage").orElseThrow().reinterpret(NSSharingServiceNameUseAsFacebookProfileImage_LAYOUT.byteSize()) }
private val NSSharingServiceNameUseAsFacebookProfileImage_VH: VarHandle by lazy { NSSharingServiceNameUseAsFacebookProfileImage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNameUseAsFacebookProfileImage: MemorySegment
    get() = NSSharingServiceNameUseAsFacebookProfileImage_VH.get(NSSharingServiceNameUseAsFacebookProfileImage_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameUseAsFacebookProfileImage_VH.set(NSSharingServiceNameUseAsFacebookProfileImage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameUseAsLinkedInProfileImage typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameUseAsLinkedInProfileImage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameUseAsLinkedInProfileImage_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameUseAsLinkedInProfileImage").orElseThrow().reinterpret(NSSharingServiceNameUseAsLinkedInProfileImage_LAYOUT.byteSize()) }
private val NSSharingServiceNameUseAsLinkedInProfileImage_VH: VarHandle by lazy { NSSharingServiceNameUseAsLinkedInProfileImage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNameUseAsLinkedInProfileImage: MemorySegment
    get() = NSSharingServiceNameUseAsLinkedInProfileImage_VH.get(NSSharingServiceNameUseAsLinkedInProfileImage_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameUseAsLinkedInProfileImage_VH.set(NSSharingServiceNameUseAsLinkedInProfileImage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostImageOnFlickr typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostImageOnFlickr_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostImageOnFlickr_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostImageOnFlickr").orElseThrow().reinterpret(NSSharingServiceNamePostImageOnFlickr_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostImageOnFlickr_VH: VarHandle by lazy { NSSharingServiceNamePostImageOnFlickr_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostImageOnFlickr: MemorySegment
    get() = NSSharingServiceNamePostImageOnFlickr_VH.get(NSSharingServiceNamePostImageOnFlickr_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostImageOnFlickr_VH.set(NSSharingServiceNamePostImageOnFlickr_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostVideoOnVimeo typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostVideoOnVimeo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostVideoOnVimeo_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostVideoOnVimeo").orElseThrow().reinterpret(NSSharingServiceNamePostVideoOnVimeo_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostVideoOnVimeo_VH: VarHandle by lazy { NSSharingServiceNamePostVideoOnVimeo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostVideoOnVimeo: MemorySegment
    get() = NSSharingServiceNamePostVideoOnVimeo_VH.get(NSSharingServiceNamePostVideoOnVimeo_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostVideoOnVimeo_VH.set(NSSharingServiceNamePostVideoOnVimeo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostVideoOnYouku typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostVideoOnYouku_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostVideoOnYouku_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostVideoOnYouku").orElseThrow().reinterpret(NSSharingServiceNamePostVideoOnYouku_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostVideoOnYouku_VH: VarHandle by lazy { NSSharingServiceNamePostVideoOnYouku_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostVideoOnYouku: MemorySegment
    get() = NSSharingServiceNamePostVideoOnYouku_VH.get(NSSharingServiceNamePostVideoOnYouku_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostVideoOnYouku_VH.set(NSSharingServiceNamePostVideoOnYouku_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNamePostVideoOnTudou typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNamePostVideoOnTudou_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNamePostVideoOnTudou_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNamePostVideoOnTudou").orElseThrow().reinterpret(NSSharingServiceNamePostVideoOnTudou_LAYOUT.byteSize()) }
private val NSSharingServiceNamePostVideoOnTudou_VH: VarHandle by lazy { NSSharingServiceNamePostVideoOnTudou_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This service is no longer included with the system.")
var NSSharingServiceNamePostVideoOnTudou: MemorySegment
    get() = NSSharingServiceNamePostVideoOnTudou_VH.get(NSSharingServiceNamePostVideoOnTudou_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNamePostVideoOnTudou_VH.set(NSSharingServiceNamePostVideoOnTudou_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSharingServiceNameCloudSharing typedef const NSSharingServiceName = (Void)*
 */
private val NSSharingServiceNameCloudSharing_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSharingServiceNameCloudSharing_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSharingServiceNameCloudSharing").orElseThrow().reinterpret(NSSharingServiceNameCloudSharing_LAYOUT.byteSize()) }
private val NSSharingServiceNameCloudSharing_VH: VarHandle by lazy { NSSharingServiceNameCloudSharing_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSSharingServiceNameCloudSharing: MemorySegment
    get() = NSSharingServiceNameCloudSharing_VH.get(NSSharingServiceNameCloudSharing_SEGMENT, 0L) as MemorySegment
    set(value) = NSSharingServiceNameCloudSharing_VH.set(NSSharingServiceNameCloudSharing_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSliderAccessoryWidthDefault typedef const NSSliderAccessoryWidth = Double
 */
private val NSSliderAccessoryWidthDefault_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSSliderAccessoryWidthDefault_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSliderAccessoryWidthDefault").orElseThrow().reinterpret(NSSliderAccessoryWidthDefault_LAYOUT.byteSize()) }
private val NSSliderAccessoryWidthDefault_VH: VarHandle by lazy { NSSliderAccessoryWidthDefault_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSSliderAccessoryWidthDefault: Double
    get() = NSSliderAccessoryWidthDefault_VH.get(NSSliderAccessoryWidthDefault_SEGMENT, 0L) as Double
    set(value) = NSSliderAccessoryWidthDefault_VH.set(NSSliderAccessoryWidthDefault_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSliderAccessoryWidthWide typedef const NSSliderAccessoryWidth = Double
 */
private val NSSliderAccessoryWidthWide_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSSliderAccessoryWidthWide_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSliderAccessoryWidthWide").orElseThrow().reinterpret(NSSliderAccessoryWidthWide_LAYOUT.byteSize()) }
private val NSSliderAccessoryWidthWide_VH: VarHandle by lazy { NSSliderAccessoryWidthWide_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSSliderAccessoryWidthWide: Double
    get() = NSSliderAccessoryWidthWide_VH.get(NSSliderAccessoryWidthWide_SEGMENT, 0L) as Double
    set(value) = NSSliderAccessoryWidthWide_VH.set(NSSliderAccessoryWidthWide_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceName typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceName").orElseThrow().reinterpret(NSVoiceName_LAYOUT.byteSize()) }
private val NSVoiceName_VH: VarHandle by lazy { NSVoiceName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
var NSVoiceName: MemorySegment
    get() = NSVoiceName_VH.get(NSVoiceName_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceName_VH.set(NSVoiceName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceIdentifier typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceIdentifier_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceIdentifier").orElseThrow().reinterpret(NSVoiceIdentifier_LAYOUT.byteSize()) }
private val NSVoiceIdentifier_VH: VarHandle by lazy { NSVoiceIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
var NSVoiceIdentifier: MemorySegment
    get() = NSVoiceIdentifier_VH.get(NSVoiceIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceIdentifier_VH.set(NSVoiceIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceAge typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceAge_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceAge_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceAge").orElseThrow().reinterpret(NSVoiceAge_LAYOUT.byteSize()) }
private val NSVoiceAge_VH: VarHandle by lazy { NSVoiceAge_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
var NSVoiceAge: MemorySegment
    get() = NSVoiceAge_VH.get(NSVoiceAge_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceAge_VH.set(NSVoiceAge_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceGender typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceGender_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceGender_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceGender").orElseThrow().reinterpret(NSVoiceGender_LAYOUT.byteSize()) }
private val NSVoiceGender_VH: VarHandle by lazy { NSVoiceGender_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
var NSVoiceGender: MemorySegment
    get() = NSVoiceGender_VH.get(NSVoiceGender_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceGender_VH.set(NSVoiceGender_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceDemoText typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceDemoText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceDemoText_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceDemoText").orElseThrow().reinterpret(NSVoiceDemoText_LAYOUT.byteSize()) }
private val NSVoiceDemoText_VH: VarHandle by lazy { NSVoiceDemoText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
var NSVoiceDemoText: MemorySegment
    get() = NSVoiceDemoText_VH.get(NSVoiceDemoText_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceDemoText_VH.set(NSVoiceDemoText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceLocaleIdentifier typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceLocaleIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceLocaleIdentifier_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceLocaleIdentifier").orElseThrow().reinterpret(NSVoiceLocaleIdentifier_LAYOUT.byteSize()) }
private val NSVoiceLocaleIdentifier_VH: VarHandle by lazy { NSVoiceLocaleIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSVoiceLocaleIdentifier: MemorySegment
    get() = NSVoiceLocaleIdentifier_VH.get(NSVoiceLocaleIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceLocaleIdentifier_VH.set(NSVoiceLocaleIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceSupportedCharacters typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceSupportedCharacters_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceSupportedCharacters_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceSupportedCharacters").orElseThrow().reinterpret(NSVoiceSupportedCharacters_LAYOUT.byteSize()) }
private val NSVoiceSupportedCharacters_VH: VarHandle by lazy { NSVoiceSupportedCharacters_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSVoiceSupportedCharacters: MemorySegment
    get() = NSVoiceSupportedCharacters_VH.get(NSVoiceSupportedCharacters_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceSupportedCharacters_VH.set(NSVoiceSupportedCharacters_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceIndividuallySpokenCharacters typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceIndividuallySpokenCharacters_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceIndividuallySpokenCharacters_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceIndividuallySpokenCharacters").orElseThrow().reinterpret(NSVoiceIndividuallySpokenCharacters_LAYOUT.byteSize()) }
private val NSVoiceIndividuallySpokenCharacters_VH: VarHandle by lazy { NSVoiceIndividuallySpokenCharacters_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSVoiceIndividuallySpokenCharacters: MemorySegment
    get() = NSVoiceIndividuallySpokenCharacters_VH.get(NSVoiceIndividuallySpokenCharacters_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceIndividuallySpokenCharacters_VH.set(NSVoiceIndividuallySpokenCharacters_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechDictionaryLocaleIdentifier typedef const NSSpeechDictionaryKey = (Void)*
 */
private val NSSpeechDictionaryLocaleIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechDictionaryLocaleIdentifier_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechDictionaryLocaleIdentifier").orElseThrow().reinterpret(NSSpeechDictionaryLocaleIdentifier_LAYOUT.byteSize()) }
private val NSSpeechDictionaryLocaleIdentifier_VH: VarHandle by lazy { NSSpeechDictionaryLocaleIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechDictionaryLocaleIdentifier: MemorySegment
    get() = NSSpeechDictionaryLocaleIdentifier_VH.get(NSSpeechDictionaryLocaleIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechDictionaryLocaleIdentifier_VH.set(NSSpeechDictionaryLocaleIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechDictionaryModificationDate typedef const NSSpeechDictionaryKey = (Void)*
 */
private val NSSpeechDictionaryModificationDate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechDictionaryModificationDate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechDictionaryModificationDate").orElseThrow().reinterpret(NSSpeechDictionaryModificationDate_LAYOUT.byteSize()) }
private val NSSpeechDictionaryModificationDate_VH: VarHandle by lazy { NSSpeechDictionaryModificationDate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechDictionaryModificationDate: MemorySegment
    get() = NSSpeechDictionaryModificationDate_VH.get(NSSpeechDictionaryModificationDate_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechDictionaryModificationDate_VH.set(NSSpeechDictionaryModificationDate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechDictionaryPronunciations typedef const NSSpeechDictionaryKey = (Void)*
 */
private val NSSpeechDictionaryPronunciations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechDictionaryPronunciations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechDictionaryPronunciations").orElseThrow().reinterpret(NSSpeechDictionaryPronunciations_LAYOUT.byteSize()) }
private val NSSpeechDictionaryPronunciations_VH: VarHandle by lazy { NSSpeechDictionaryPronunciations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechDictionaryPronunciations: MemorySegment
    get() = NSSpeechDictionaryPronunciations_VH.get(NSSpeechDictionaryPronunciations_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechDictionaryPronunciations_VH.set(NSSpeechDictionaryPronunciations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechDictionaryAbbreviations typedef const NSSpeechDictionaryKey = (Void)*
 */
private val NSSpeechDictionaryAbbreviations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechDictionaryAbbreviations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechDictionaryAbbreviations").orElseThrow().reinterpret(NSSpeechDictionaryAbbreviations_LAYOUT.byteSize()) }
private val NSSpeechDictionaryAbbreviations_VH: VarHandle by lazy { NSSpeechDictionaryAbbreviations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechDictionaryAbbreviations: MemorySegment
    get() = NSSpeechDictionaryAbbreviations_VH.get(NSSpeechDictionaryAbbreviations_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechDictionaryAbbreviations_VH.set(NSSpeechDictionaryAbbreviations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechDictionaryEntrySpelling typedef const NSSpeechDictionaryKey = (Void)*
 */
private val NSSpeechDictionaryEntrySpelling_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechDictionaryEntrySpelling_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechDictionaryEntrySpelling").orElseThrow().reinterpret(NSSpeechDictionaryEntrySpelling_LAYOUT.byteSize()) }
private val NSSpeechDictionaryEntrySpelling_VH: VarHandle by lazy { NSSpeechDictionaryEntrySpelling_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechDictionaryEntrySpelling: MemorySegment
    get() = NSSpeechDictionaryEntrySpelling_VH.get(NSSpeechDictionaryEntrySpelling_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechDictionaryEntrySpelling_VH.set(NSSpeechDictionaryEntrySpelling_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechDictionaryEntryPhonemes typedef const NSSpeechDictionaryKey = (Void)*
 */
private val NSSpeechDictionaryEntryPhonemes_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechDictionaryEntryPhonemes_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechDictionaryEntryPhonemes").orElseThrow().reinterpret(NSSpeechDictionaryEntryPhonemes_LAYOUT.byteSize()) }
private val NSSpeechDictionaryEntryPhonemes_VH: VarHandle by lazy { NSSpeechDictionaryEntryPhonemes_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechDictionaryEntryPhonemes: MemorySegment
    get() = NSSpeechDictionaryEntryPhonemes_VH.get(NSSpeechDictionaryEntryPhonemes_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechDictionaryEntryPhonemes_VH.set(NSSpeechDictionaryEntryPhonemes_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceGenderNeuter typedef const NSVoiceGenderName = (Void)*
 */
private val NSVoiceGenderNeuter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceGenderNeuter_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceGenderNeuter").orElseThrow().reinterpret(NSVoiceGenderNeuter_LAYOUT.byteSize()) }
private val NSVoiceGenderNeuter_VH: VarHandle by lazy { NSVoiceGenderNeuter_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
var NSVoiceGenderNeuter: MemorySegment
    get() = NSVoiceGenderNeuter_VH.get(NSVoiceGenderNeuter_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceGenderNeuter_VH.set(NSVoiceGenderNeuter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceGenderMale typedef const NSVoiceGenderName = (Void)*
 */
private val NSVoiceGenderMale_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceGenderMale_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceGenderMale").orElseThrow().reinterpret(NSVoiceGenderMale_LAYOUT.byteSize()) }
private val NSVoiceGenderMale_VH: VarHandle by lazy { NSVoiceGenderMale_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
var NSVoiceGenderMale: MemorySegment
    get() = NSVoiceGenderMale_VH.get(NSVoiceGenderMale_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceGenderMale_VH.set(NSVoiceGenderMale_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceGenderFemale typedef const NSVoiceGenderName = (Void)*
 */
private val NSVoiceGenderFemale_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceGenderFemale_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceGenderFemale").orElseThrow().reinterpret(NSVoiceGenderFemale_LAYOUT.byteSize()) }
private val NSVoiceGenderFemale_VH: VarHandle by lazy { NSVoiceGenderFemale_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
var NSVoiceGenderFemale: MemorySegment
    get() = NSVoiceGenderFemale_VH.get(NSVoiceGenderFemale_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceGenderFemale_VH.set(NSVoiceGenderFemale_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceGenderNeutral typedef const NSVoiceGenderName = (Void)*
 */
private val NSVoiceGenderNeutral_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceGenderNeutral_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceGenderNeutral").orElseThrow().reinterpret(NSVoiceGenderNeutral_LAYOUT.byteSize()) }
private val NSVoiceGenderNeutral_VH: VarHandle by lazy { NSVoiceGenderNeutral_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
var NSVoiceGenderNeutral: MemorySegment
    get() = NSVoiceGenderNeutral_VH.get(NSVoiceGenderNeutral_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceGenderNeutral_VH.set(NSVoiceGenderNeutral_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechStatusProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechStatusProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechStatusProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechStatusProperty").orElseThrow().reinterpret(NSSpeechStatusProperty_LAYOUT.byteSize()) }
private val NSSpeechStatusProperty_VH: VarHandle by lazy { NSSpeechStatusProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechStatusProperty: MemorySegment
    get() = NSSpeechStatusProperty_VH.get(NSSpeechStatusProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechStatusProperty_VH.set(NSSpeechStatusProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechErrorsProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechErrorsProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechErrorsProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechErrorsProperty").orElseThrow().reinterpret(NSSpeechErrorsProperty_LAYOUT.byteSize()) }
private val NSSpeechErrorsProperty_VH: VarHandle by lazy { NSSpeechErrorsProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechErrorsProperty: MemorySegment
    get() = NSSpeechErrorsProperty_VH.get(NSSpeechErrorsProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechErrorsProperty_VH.set(NSSpeechErrorsProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechInputModeProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechInputModeProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechInputModeProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechInputModeProperty").orElseThrow().reinterpret(NSSpeechInputModeProperty_LAYOUT.byteSize()) }
private val NSSpeechInputModeProperty_VH: VarHandle by lazy { NSSpeechInputModeProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechInputModeProperty: MemorySegment
    get() = NSSpeechInputModeProperty_VH.get(NSSpeechInputModeProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechInputModeProperty_VH.set(NSSpeechInputModeProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechCharacterModeProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechCharacterModeProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechCharacterModeProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechCharacterModeProperty").orElseThrow().reinterpret(NSSpeechCharacterModeProperty_LAYOUT.byteSize()) }
private val NSSpeechCharacterModeProperty_VH: VarHandle by lazy { NSSpeechCharacterModeProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechCharacterModeProperty: MemorySegment
    get() = NSSpeechCharacterModeProperty_VH.get(NSSpeechCharacterModeProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechCharacterModeProperty_VH.set(NSSpeechCharacterModeProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechNumberModeProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechNumberModeProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechNumberModeProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechNumberModeProperty").orElseThrow().reinterpret(NSSpeechNumberModeProperty_LAYOUT.byteSize()) }
private val NSSpeechNumberModeProperty_VH: VarHandle by lazy { NSSpeechNumberModeProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechNumberModeProperty: MemorySegment
    get() = NSSpeechNumberModeProperty_VH.get(NSSpeechNumberModeProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechNumberModeProperty_VH.set(NSSpeechNumberModeProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechRateProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechRateProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechRateProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechRateProperty").orElseThrow().reinterpret(NSSpeechRateProperty_LAYOUT.byteSize()) }
private val NSSpeechRateProperty_VH: VarHandle by lazy { NSSpeechRateProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechRateProperty: MemorySegment
    get() = NSSpeechRateProperty_VH.get(NSSpeechRateProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechRateProperty_VH.set(NSSpeechRateProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechPitchBaseProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechPitchBaseProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechPitchBaseProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechPitchBaseProperty").orElseThrow().reinterpret(NSSpeechPitchBaseProperty_LAYOUT.byteSize()) }
private val NSSpeechPitchBaseProperty_VH: VarHandle by lazy { NSSpeechPitchBaseProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechPitchBaseProperty: MemorySegment
    get() = NSSpeechPitchBaseProperty_VH.get(NSSpeechPitchBaseProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechPitchBaseProperty_VH.set(NSSpeechPitchBaseProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechPitchModProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechPitchModProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechPitchModProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechPitchModProperty").orElseThrow().reinterpret(NSSpeechPitchModProperty_LAYOUT.byteSize()) }
private val NSSpeechPitchModProperty_VH: VarHandle by lazy { NSSpeechPitchModProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechPitchModProperty: MemorySegment
    get() = NSSpeechPitchModProperty_VH.get(NSSpeechPitchModProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechPitchModProperty_VH.set(NSSpeechPitchModProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechVolumeProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechVolumeProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechVolumeProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechVolumeProperty").orElseThrow().reinterpret(NSSpeechVolumeProperty_LAYOUT.byteSize()) }
private val NSSpeechVolumeProperty_VH: VarHandle by lazy { NSSpeechVolumeProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechVolumeProperty: MemorySegment
    get() = NSSpeechVolumeProperty_VH.get(NSSpeechVolumeProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechVolumeProperty_VH.set(NSSpeechVolumeProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechSynthesizerInfoProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechSynthesizerInfoProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechSynthesizerInfoProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechSynthesizerInfoProperty").orElseThrow().reinterpret(NSSpeechSynthesizerInfoProperty_LAYOUT.byteSize()) }
private val NSSpeechSynthesizerInfoProperty_VH: VarHandle by lazy { NSSpeechSynthesizerInfoProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechSynthesizerInfoProperty: MemorySegment
    get() = NSSpeechSynthesizerInfoProperty_VH.get(NSSpeechSynthesizerInfoProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechSynthesizerInfoProperty_VH.set(NSSpeechSynthesizerInfoProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechRecentSyncProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechRecentSyncProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechRecentSyncProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechRecentSyncProperty").orElseThrow().reinterpret(NSSpeechRecentSyncProperty_LAYOUT.byteSize()) }
private val NSSpeechRecentSyncProperty_VH: VarHandle by lazy { NSSpeechRecentSyncProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechRecentSyncProperty: MemorySegment
    get() = NSSpeechRecentSyncProperty_VH.get(NSSpeechRecentSyncProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechRecentSyncProperty_VH.set(NSSpeechRecentSyncProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechPhonemeSymbolsProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechPhonemeSymbolsProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechPhonemeSymbolsProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechPhonemeSymbolsProperty").orElseThrow().reinterpret(NSSpeechPhonemeSymbolsProperty_LAYOUT.byteSize()) }
private val NSSpeechPhonemeSymbolsProperty_VH: VarHandle by lazy { NSSpeechPhonemeSymbolsProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechPhonemeSymbolsProperty: MemorySegment
    get() = NSSpeechPhonemeSymbolsProperty_VH.get(NSSpeechPhonemeSymbolsProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechPhonemeSymbolsProperty_VH.set(NSSpeechPhonemeSymbolsProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechCurrentVoiceProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechCurrentVoiceProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechCurrentVoiceProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechCurrentVoiceProperty").orElseThrow().reinterpret(NSSpeechCurrentVoiceProperty_LAYOUT.byteSize()) }
private val NSSpeechCurrentVoiceProperty_VH: VarHandle by lazy { NSSpeechCurrentVoiceProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechCurrentVoiceProperty: MemorySegment
    get() = NSSpeechCurrentVoiceProperty_VH.get(NSSpeechCurrentVoiceProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechCurrentVoiceProperty_VH.set(NSSpeechCurrentVoiceProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechCommandDelimiterProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechCommandDelimiterProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechCommandDelimiterProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechCommandDelimiterProperty").orElseThrow().reinterpret(NSSpeechCommandDelimiterProperty_LAYOUT.byteSize()) }
private val NSSpeechCommandDelimiterProperty_VH: VarHandle by lazy { NSSpeechCommandDelimiterProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechCommandDelimiterProperty: MemorySegment
    get() = NSSpeechCommandDelimiterProperty_VH.get(NSSpeechCommandDelimiterProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechCommandDelimiterProperty_VH.set(NSSpeechCommandDelimiterProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechResetProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechResetProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechResetProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechResetProperty").orElseThrow().reinterpret(NSSpeechResetProperty_LAYOUT.byteSize()) }
private val NSSpeechResetProperty_VH: VarHandle by lazy { NSSpeechResetProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechResetProperty: MemorySegment
    get() = NSSpeechResetProperty_VH.get(NSSpeechResetProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechResetProperty_VH.set(NSSpeechResetProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechOutputToFileURLProperty typedef const NSSpeechPropertyKey = (Void)*
 */
private val NSSpeechOutputToFileURLProperty_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechOutputToFileURLProperty_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechOutputToFileURLProperty").orElseThrow().reinterpret(NSSpeechOutputToFileURLProperty_LAYOUT.byteSize()) }
private val NSSpeechOutputToFileURLProperty_VH: VarHandle by lazy { NSSpeechOutputToFileURLProperty_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechOutputToFileURLProperty: MemorySegment
    get() = NSSpeechOutputToFileURLProperty_VH.get(NSSpeechOutputToFileURLProperty_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechOutputToFileURLProperty_VH.set(NSSpeechOutputToFileURLProperty_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSVoiceLanguage typedef const NSVoiceAttributeKey = (Void)*
 */
private val NSVoiceLanguage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSVoiceLanguage_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSVoiceLanguage").orElseThrow().reinterpret(NSVoiceLanguage_LAYOUT.byteSize()) }
private val NSVoiceLanguage_VH: VarHandle by lazy { NSVoiceLanguage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
var NSVoiceLanguage: MemorySegment
    get() = NSVoiceLanguage_VH.get(NSVoiceLanguage_SEGMENT, 0L) as MemorySegment
    set(value) = NSVoiceLanguage_VH.set(NSVoiceLanguage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechModeText typedef const NSSpeechMode = (Void)*
 */
private val NSSpeechModeText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechModeText_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechModeText").orElseThrow().reinterpret(NSSpeechModeText_LAYOUT.byteSize()) }
private val NSSpeechModeText_VH: VarHandle by lazy { NSSpeechModeText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechModeText: MemorySegment
    get() = NSSpeechModeText_VH.get(NSSpeechModeText_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechModeText_VH.set(NSSpeechModeText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechModePhoneme typedef const NSSpeechMode = (Void)*
 */
private val NSSpeechModePhoneme_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechModePhoneme_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechModePhoneme").orElseThrow().reinterpret(NSSpeechModePhoneme_LAYOUT.byteSize()) }
private val NSSpeechModePhoneme_VH: VarHandle by lazy { NSSpeechModePhoneme_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechModePhoneme: MemorySegment
    get() = NSSpeechModePhoneme_VH.get(NSSpeechModePhoneme_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechModePhoneme_VH.set(NSSpeechModePhoneme_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechModeNormal typedef const NSSpeechMode = (Void)*
 */
private val NSSpeechModeNormal_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechModeNormal_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechModeNormal").orElseThrow().reinterpret(NSSpeechModeNormal_LAYOUT.byteSize()) }
private val NSSpeechModeNormal_VH: VarHandle by lazy { NSSpeechModeNormal_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechModeNormal: MemorySegment
    get() = NSSpeechModeNormal_VH.get(NSSpeechModeNormal_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechModeNormal_VH.set(NSSpeechModeNormal_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechModeLiteral typedef const NSSpeechMode = (Void)*
 */
private val NSSpeechModeLiteral_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechModeLiteral_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechModeLiteral").orElseThrow().reinterpret(NSSpeechModeLiteral_LAYOUT.byteSize()) }
private val NSSpeechModeLiteral_VH: VarHandle by lazy { NSSpeechModeLiteral_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechModeLiteral: MemorySegment
    get() = NSSpeechModeLiteral_VH.get(NSSpeechModeLiteral_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechModeLiteral_VH.set(NSSpeechModeLiteral_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechStatusOutputBusy typedef const NSSpeechStatusKey = (Void)*
 */
private val NSSpeechStatusOutputBusy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechStatusOutputBusy_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechStatusOutputBusy").orElseThrow().reinterpret(NSSpeechStatusOutputBusy_LAYOUT.byteSize()) }
private val NSSpeechStatusOutputBusy_VH: VarHandle by lazy { NSSpeechStatusOutputBusy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechStatusOutputBusy: MemorySegment
    get() = NSSpeechStatusOutputBusy_VH.get(NSSpeechStatusOutputBusy_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechStatusOutputBusy_VH.set(NSSpeechStatusOutputBusy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechStatusOutputPaused typedef const NSSpeechStatusKey = (Void)*
 */
private val NSSpeechStatusOutputPaused_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechStatusOutputPaused_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechStatusOutputPaused").orElseThrow().reinterpret(NSSpeechStatusOutputPaused_LAYOUT.byteSize()) }
private val NSSpeechStatusOutputPaused_VH: VarHandle by lazy { NSSpeechStatusOutputPaused_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechStatusOutputPaused: MemorySegment
    get() = NSSpeechStatusOutputPaused_VH.get(NSSpeechStatusOutputPaused_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechStatusOutputPaused_VH.set(NSSpeechStatusOutputPaused_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechStatusNumberOfCharactersLeft typedef const NSSpeechStatusKey = (Void)*
 */
private val NSSpeechStatusNumberOfCharactersLeft_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechStatusNumberOfCharactersLeft_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechStatusNumberOfCharactersLeft").orElseThrow().reinterpret(NSSpeechStatusNumberOfCharactersLeft_LAYOUT.byteSize()) }
private val NSSpeechStatusNumberOfCharactersLeft_VH: VarHandle by lazy { NSSpeechStatusNumberOfCharactersLeft_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechStatusNumberOfCharactersLeft: MemorySegment
    get() = NSSpeechStatusNumberOfCharactersLeft_VH.get(NSSpeechStatusNumberOfCharactersLeft_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechStatusNumberOfCharactersLeft_VH.set(NSSpeechStatusNumberOfCharactersLeft_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechStatusPhonemeCode typedef const NSSpeechStatusKey = (Void)*
 */
private val NSSpeechStatusPhonemeCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechStatusPhonemeCode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechStatusPhonemeCode").orElseThrow().reinterpret(NSSpeechStatusPhonemeCode_LAYOUT.byteSize()) }
private val NSSpeechStatusPhonemeCode_VH: VarHandle by lazy { NSSpeechStatusPhonemeCode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechStatusPhonemeCode: MemorySegment
    get() = NSSpeechStatusPhonemeCode_VH.get(NSSpeechStatusPhonemeCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechStatusPhonemeCode_VH.set(NSSpeechStatusPhonemeCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechErrorCount typedef const NSSpeechErrorKey = (Void)*
 */
private val NSSpeechErrorCount_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechErrorCount_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechErrorCount").orElseThrow().reinterpret(NSSpeechErrorCount_LAYOUT.byteSize()) }
private val NSSpeechErrorCount_VH: VarHandle by lazy { NSSpeechErrorCount_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechErrorCount: MemorySegment
    get() = NSSpeechErrorCount_VH.get(NSSpeechErrorCount_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechErrorCount_VH.set(NSSpeechErrorCount_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechErrorOldestCode typedef const NSSpeechErrorKey = (Void)*
 */
private val NSSpeechErrorOldestCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechErrorOldestCode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechErrorOldestCode").orElseThrow().reinterpret(NSSpeechErrorOldestCode_LAYOUT.byteSize()) }
private val NSSpeechErrorOldestCode_VH: VarHandle by lazy { NSSpeechErrorOldestCode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechErrorOldestCode: MemorySegment
    get() = NSSpeechErrorOldestCode_VH.get(NSSpeechErrorOldestCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechErrorOldestCode_VH.set(NSSpeechErrorOldestCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechErrorOldestCharacterOffset typedef const NSSpeechErrorKey = (Void)*
 */
private val NSSpeechErrorOldestCharacterOffset_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechErrorOldestCharacterOffset_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechErrorOldestCharacterOffset").orElseThrow().reinterpret(NSSpeechErrorOldestCharacterOffset_LAYOUT.byteSize()) }
private val NSSpeechErrorOldestCharacterOffset_VH: VarHandle by lazy { NSSpeechErrorOldestCharacterOffset_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechErrorOldestCharacterOffset: MemorySegment
    get() = NSSpeechErrorOldestCharacterOffset_VH.get(NSSpeechErrorOldestCharacterOffset_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechErrorOldestCharacterOffset_VH.set(NSSpeechErrorOldestCharacterOffset_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechErrorNewestCode typedef const NSSpeechErrorKey = (Void)*
 */
private val NSSpeechErrorNewestCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechErrorNewestCode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechErrorNewestCode").orElseThrow().reinterpret(NSSpeechErrorNewestCode_LAYOUT.byteSize()) }
private val NSSpeechErrorNewestCode_VH: VarHandle by lazy { NSSpeechErrorNewestCode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechErrorNewestCode: MemorySegment
    get() = NSSpeechErrorNewestCode_VH.get(NSSpeechErrorNewestCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechErrorNewestCode_VH.set(NSSpeechErrorNewestCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechErrorNewestCharacterOffset typedef const NSSpeechErrorKey = (Void)*
 */
private val NSSpeechErrorNewestCharacterOffset_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechErrorNewestCharacterOffset_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechErrorNewestCharacterOffset").orElseThrow().reinterpret(NSSpeechErrorNewestCharacterOffset_LAYOUT.byteSize()) }
private val NSSpeechErrorNewestCharacterOffset_VH: VarHandle by lazy { NSSpeechErrorNewestCharacterOffset_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechErrorNewestCharacterOffset: MemorySegment
    get() = NSSpeechErrorNewestCharacterOffset_VH.get(NSSpeechErrorNewestCharacterOffset_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechErrorNewestCharacterOffset_VH.set(NSSpeechErrorNewestCharacterOffset_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechSynthesizerInfoIdentifier typedef const NSSpeechSynthesizerInfoKey = (Void)*
 */
private val NSSpeechSynthesizerInfoIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechSynthesizerInfoIdentifier_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechSynthesizerInfoIdentifier").orElseThrow().reinterpret(NSSpeechSynthesizerInfoIdentifier_LAYOUT.byteSize()) }
private val NSSpeechSynthesizerInfoIdentifier_VH: VarHandle by lazy { NSSpeechSynthesizerInfoIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechSynthesizerInfoIdentifier: MemorySegment
    get() = NSSpeechSynthesizerInfoIdentifier_VH.get(NSSpeechSynthesizerInfoIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechSynthesizerInfoIdentifier_VH.set(NSSpeechSynthesizerInfoIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechSynthesizerInfoVersion typedef const NSSpeechSynthesizerInfoKey = (Void)*
 */
private val NSSpeechSynthesizerInfoVersion_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechSynthesizerInfoVersion_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechSynthesizerInfoVersion").orElseThrow().reinterpret(NSSpeechSynthesizerInfoVersion_LAYOUT.byteSize()) }
private val NSSpeechSynthesizerInfoVersion_VH: VarHandle by lazy { NSSpeechSynthesizerInfoVersion_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechSynthesizerInfoVersion: MemorySegment
    get() = NSSpeechSynthesizerInfoVersion_VH.get(NSSpeechSynthesizerInfoVersion_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechSynthesizerInfoVersion_VH.set(NSSpeechSynthesizerInfoVersion_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechPhonemeInfoOpcode typedef const NSSpeechPhonemeInfoKey = (Void)*
 */
private val NSSpeechPhonemeInfoOpcode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechPhonemeInfoOpcode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechPhonemeInfoOpcode").orElseThrow().reinterpret(NSSpeechPhonemeInfoOpcode_LAYOUT.byteSize()) }
private val NSSpeechPhonemeInfoOpcode_VH: VarHandle by lazy { NSSpeechPhonemeInfoOpcode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechPhonemeInfoOpcode: MemorySegment
    get() = NSSpeechPhonemeInfoOpcode_VH.get(NSSpeechPhonemeInfoOpcode_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechPhonemeInfoOpcode_VH.set(NSSpeechPhonemeInfoOpcode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechPhonemeInfoSymbol typedef const NSSpeechPhonemeInfoKey = (Void)*
 */
private val NSSpeechPhonemeInfoSymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechPhonemeInfoSymbol_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechPhonemeInfoSymbol").orElseThrow().reinterpret(NSSpeechPhonemeInfoSymbol_LAYOUT.byteSize()) }
private val NSSpeechPhonemeInfoSymbol_VH: VarHandle by lazy { NSSpeechPhonemeInfoSymbol_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechPhonemeInfoSymbol: MemorySegment
    get() = NSSpeechPhonemeInfoSymbol_VH.get(NSSpeechPhonemeInfoSymbol_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechPhonemeInfoSymbol_VH.set(NSSpeechPhonemeInfoSymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechPhonemeInfoExample typedef const NSSpeechPhonemeInfoKey = (Void)*
 */
private val NSSpeechPhonemeInfoExample_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechPhonemeInfoExample_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechPhonemeInfoExample").orElseThrow().reinterpret(NSSpeechPhonemeInfoExample_LAYOUT.byteSize()) }
private val NSSpeechPhonemeInfoExample_VH: VarHandle by lazy { NSSpeechPhonemeInfoExample_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechPhonemeInfoExample: MemorySegment
    get() = NSSpeechPhonemeInfoExample_VH.get(NSSpeechPhonemeInfoExample_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechPhonemeInfoExample_VH.set(NSSpeechPhonemeInfoExample_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechPhonemeInfoHiliteStart typedef const NSSpeechPhonemeInfoKey = (Void)*
 */
private val NSSpeechPhonemeInfoHiliteStart_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechPhonemeInfoHiliteStart_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechPhonemeInfoHiliteStart").orElseThrow().reinterpret(NSSpeechPhonemeInfoHiliteStart_LAYOUT.byteSize()) }
private val NSSpeechPhonemeInfoHiliteStart_VH: VarHandle by lazy { NSSpeechPhonemeInfoHiliteStart_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechPhonemeInfoHiliteStart: MemorySegment
    get() = NSSpeechPhonemeInfoHiliteStart_VH.get(NSSpeechPhonemeInfoHiliteStart_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechPhonemeInfoHiliteStart_VH.set(NSSpeechPhonemeInfoHiliteStart_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechPhonemeInfoHiliteEnd typedef const NSSpeechPhonemeInfoKey = (Void)*
 */
private val NSSpeechPhonemeInfoHiliteEnd_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechPhonemeInfoHiliteEnd_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechPhonemeInfoHiliteEnd").orElseThrow().reinterpret(NSSpeechPhonemeInfoHiliteEnd_LAYOUT.byteSize()) }
private val NSSpeechPhonemeInfoHiliteEnd_VH: VarHandle by lazy { NSSpeechPhonemeInfoHiliteEnd_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechPhonemeInfoHiliteEnd: MemorySegment
    get() = NSSpeechPhonemeInfoHiliteEnd_VH.get(NSSpeechPhonemeInfoHiliteEnd_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechPhonemeInfoHiliteEnd_VH.set(NSSpeechPhonemeInfoHiliteEnd_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechCommandPrefix typedef const NSSpeechCommandDelimiterKey = (Void)*
 */
private val NSSpeechCommandPrefix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechCommandPrefix_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechCommandPrefix").orElseThrow().reinterpret(NSSpeechCommandPrefix_LAYOUT.byteSize()) }
private val NSSpeechCommandPrefix_VH: VarHandle by lazy { NSSpeechCommandPrefix_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechCommandPrefix: MemorySegment
    get() = NSSpeechCommandPrefix_VH.get(NSSpeechCommandPrefix_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechCommandPrefix_VH.set(NSSpeechCommandPrefix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpeechCommandSuffix typedef const NSSpeechCommandDelimiterKey = (Void)*
 */
private val NSSpeechCommandSuffix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpeechCommandSuffix_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpeechCommandSuffix").orElseThrow().reinterpret(NSSpeechCommandSuffix_LAYOUT.byteSize()) }
private val NSSpeechCommandSuffix_VH: VarHandle by lazy { NSSpeechCommandSuffix_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSSpeechCommandSuffix: MemorySegment
    get() = NSSpeechCommandSuffix_VH.get(NSSpeechCommandSuffix_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpeechCommandSuffix_VH.set(NSSpeechCommandSuffix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingOrthographyKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingOrthographyKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingOrthographyKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingOrthographyKey").orElseThrow().reinterpret(NSTextCheckingOrthographyKey_LAYOUT.byteSize()) }
private val NSTextCheckingOrthographyKey_VH: VarHandle by lazy { NSTextCheckingOrthographyKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextCheckingOrthographyKey: MemorySegment
    get() = NSTextCheckingOrthographyKey_VH.get(NSTextCheckingOrthographyKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingOrthographyKey_VH.set(NSTextCheckingOrthographyKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingQuotesKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingQuotesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingQuotesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingQuotesKey").orElseThrow().reinterpret(NSTextCheckingQuotesKey_LAYOUT.byteSize()) }
private val NSTextCheckingQuotesKey_VH: VarHandle by lazy { NSTextCheckingQuotesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextCheckingQuotesKey: MemorySegment
    get() = NSTextCheckingQuotesKey_VH.get(NSTextCheckingQuotesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingQuotesKey_VH.set(NSTextCheckingQuotesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingReplacementsKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingReplacementsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingReplacementsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingReplacementsKey").orElseThrow().reinterpret(NSTextCheckingReplacementsKey_LAYOUT.byteSize()) }
private val NSTextCheckingReplacementsKey_VH: VarHandle by lazy { NSTextCheckingReplacementsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextCheckingReplacementsKey: MemorySegment
    get() = NSTextCheckingReplacementsKey_VH.get(NSTextCheckingReplacementsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingReplacementsKey_VH.set(NSTextCheckingReplacementsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingReferenceDateKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingReferenceDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingReferenceDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingReferenceDateKey").orElseThrow().reinterpret(NSTextCheckingReferenceDateKey_LAYOUT.byteSize()) }
private val NSTextCheckingReferenceDateKey_VH: VarHandle by lazy { NSTextCheckingReferenceDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextCheckingReferenceDateKey: MemorySegment
    get() = NSTextCheckingReferenceDateKey_VH.get(NSTextCheckingReferenceDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingReferenceDateKey_VH.set(NSTextCheckingReferenceDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingReferenceTimeZoneKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingReferenceTimeZoneKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingReferenceTimeZoneKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingReferenceTimeZoneKey").orElseThrow().reinterpret(NSTextCheckingReferenceTimeZoneKey_LAYOUT.byteSize()) }
private val NSTextCheckingReferenceTimeZoneKey_VH: VarHandle by lazy { NSTextCheckingReferenceTimeZoneKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextCheckingReferenceTimeZoneKey: MemorySegment
    get() = NSTextCheckingReferenceTimeZoneKey_VH.get(NSTextCheckingReferenceTimeZoneKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingReferenceTimeZoneKey_VH.set(NSTextCheckingReferenceTimeZoneKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingDocumentURLKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingDocumentURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingDocumentURLKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingDocumentURLKey").orElseThrow().reinterpret(NSTextCheckingDocumentURLKey_LAYOUT.byteSize()) }
private val NSTextCheckingDocumentURLKey_VH: VarHandle by lazy { NSTextCheckingDocumentURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextCheckingDocumentURLKey: MemorySegment
    get() = NSTextCheckingDocumentURLKey_VH.get(NSTextCheckingDocumentURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingDocumentURLKey_VH.set(NSTextCheckingDocumentURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingDocumentTitleKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingDocumentTitleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingDocumentTitleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingDocumentTitleKey").orElseThrow().reinterpret(NSTextCheckingDocumentTitleKey_LAYOUT.byteSize()) }
private val NSTextCheckingDocumentTitleKey_VH: VarHandle by lazy { NSTextCheckingDocumentTitleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextCheckingDocumentTitleKey: MemorySegment
    get() = NSTextCheckingDocumentTitleKey_VH.get(NSTextCheckingDocumentTitleKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingDocumentTitleKey_VH.set(NSTextCheckingDocumentTitleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingDocumentAuthorKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingDocumentAuthorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingDocumentAuthorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingDocumentAuthorKey").orElseThrow().reinterpret(NSTextCheckingDocumentAuthorKey_LAYOUT.byteSize()) }
private val NSTextCheckingDocumentAuthorKey_VH: VarHandle by lazy { NSTextCheckingDocumentAuthorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSTextCheckingDocumentAuthorKey: MemorySegment
    get() = NSTextCheckingDocumentAuthorKey_VH.get(NSTextCheckingDocumentAuthorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingDocumentAuthorKey_VH.set(NSTextCheckingDocumentAuthorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingRegularExpressionsKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingRegularExpressionsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingRegularExpressionsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingRegularExpressionsKey").orElseThrow().reinterpret(NSTextCheckingRegularExpressionsKey_LAYOUT.byteSize()) }
private val NSTextCheckingRegularExpressionsKey_VH: VarHandle by lazy { NSTextCheckingRegularExpressionsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSTextCheckingRegularExpressionsKey: MemorySegment
    get() = NSTextCheckingRegularExpressionsKey_VH.get(NSTextCheckingRegularExpressionsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingRegularExpressionsKey_VH.set(NSTextCheckingRegularExpressionsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingSelectedRangeKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingSelectedRangeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingSelectedRangeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingSelectedRangeKey").orElseThrow().reinterpret(NSTextCheckingSelectedRangeKey_LAYOUT.byteSize()) }
private val NSTextCheckingSelectedRangeKey_VH: VarHandle by lazy { NSTextCheckingSelectedRangeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSTextCheckingSelectedRangeKey: MemorySegment
    get() = NSTextCheckingSelectedRangeKey_VH.get(NSTextCheckingSelectedRangeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingSelectedRangeKey_VH.set(NSTextCheckingSelectedRangeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingGenerateInlinePredictionsKey typedef NSTextCheckingOptionKey = typedef NSString = (Void)*
 */
private val NSTextCheckingGenerateInlinePredictionsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingGenerateInlinePredictionsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingGenerateInlinePredictionsKey").orElseThrow().reinterpret(NSTextCheckingGenerateInlinePredictionsKey_LAYOUT.byteSize()) }
private val NSTextCheckingGenerateInlinePredictionsKey_VH: VarHandle by lazy { NSTextCheckingGenerateInlinePredictionsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingGenerateInlinePredictionsKey: MemorySegment
    get() = NSTextCheckingGenerateInlinePredictionsKey_VH.get(NSTextCheckingGenerateInlinePredictionsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingGenerateInlinePredictionsKey_VH.set(NSTextCheckingGenerateInlinePredictionsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification typedef const NSNotificationName = (Void)*
 */
private val NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification").orElseThrow().reinterpret(NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_LAYOUT.byteSize()) }
private val NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_VH: VarHandle by lazy { NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification: MemorySegment
    get() = NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_VH.get(NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_VH.set(NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellCheckerDidChangeAutomaticTextReplacementNotification typedef const NSNotificationName = (Void)*
 */
private val NSSpellCheckerDidChangeAutomaticTextReplacementNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellCheckerDidChangeAutomaticTextReplacementNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellCheckerDidChangeAutomaticTextReplacementNotification").orElseThrow().reinterpret(NSSpellCheckerDidChangeAutomaticTextReplacementNotification_LAYOUT.byteSize()) }
private val NSSpellCheckerDidChangeAutomaticTextReplacementNotification_VH: VarHandle by lazy { NSSpellCheckerDidChangeAutomaticTextReplacementNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSSpellCheckerDidChangeAutomaticTextReplacementNotification: MemorySegment
    get() = NSSpellCheckerDidChangeAutomaticTextReplacementNotification_VH.get(NSSpellCheckerDidChangeAutomaticTextReplacementNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellCheckerDidChangeAutomaticTextReplacementNotification_VH.set(NSSpellCheckerDidChangeAutomaticTextReplacementNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification typedef const NSNotificationName = (Void)*
 */
private val NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification").orElseThrow().reinterpret(NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_LAYOUT.byteSize()) }
private val NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_VH: VarHandle by lazy { NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification: MemorySegment
    get() = NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_VH.get(NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_VH.set(NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification typedef const NSNotificationName = (Void)*
 */
private val NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification").orElseThrow().reinterpret(NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_LAYOUT.byteSize()) }
private val NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_VH: VarHandle by lazy { NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification: MemorySegment
    get() = NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_VH.get(NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_VH.set(NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellCheckerDidChangeAutomaticCapitalizationNotification typedef const NSNotificationName = (Void)*
 */
private val NSSpellCheckerDidChangeAutomaticCapitalizationNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellCheckerDidChangeAutomaticCapitalizationNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellCheckerDidChangeAutomaticCapitalizationNotification").orElseThrow().reinterpret(NSSpellCheckerDidChangeAutomaticCapitalizationNotification_LAYOUT.byteSize()) }
private val NSSpellCheckerDidChangeAutomaticCapitalizationNotification_VH: VarHandle by lazy { NSSpellCheckerDidChangeAutomaticCapitalizationNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSSpellCheckerDidChangeAutomaticCapitalizationNotification: MemorySegment
    get() = NSSpellCheckerDidChangeAutomaticCapitalizationNotification_VH.get(NSSpellCheckerDidChangeAutomaticCapitalizationNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellCheckerDidChangeAutomaticCapitalizationNotification_VH.set(NSSpellCheckerDidChangeAutomaticCapitalizationNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification typedef const NSNotificationName = (Void)*
 */
private val NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification").orElseThrow().reinterpret(NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_LAYOUT.byteSize()) }
private val NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_VH: VarHandle by lazy { NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification: MemorySegment
    get() = NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_VH.get(NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_VH.set(NSSpellCheckerDidChangeAutomaticPeriodSubstitutionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellCheckerDidChangeAutomaticTextCompletionNotification typedef const NSNotificationName = (Void)*
 */
private val NSSpellCheckerDidChangeAutomaticTextCompletionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellCheckerDidChangeAutomaticTextCompletionNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellCheckerDidChangeAutomaticTextCompletionNotification").orElseThrow().reinterpret(NSSpellCheckerDidChangeAutomaticTextCompletionNotification_LAYOUT.byteSize()) }
private val NSSpellCheckerDidChangeAutomaticTextCompletionNotification_VH: VarHandle by lazy { NSSpellCheckerDidChangeAutomaticTextCompletionNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
var NSSpellCheckerDidChangeAutomaticTextCompletionNotification: MemorySegment
    get() = NSSpellCheckerDidChangeAutomaticTextCompletionNotification_VH.get(NSSpellCheckerDidChangeAutomaticTextCompletionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellCheckerDidChangeAutomaticTextCompletionNotification_VH.set(NSSpellCheckerDidChangeAutomaticTextCompletionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellCheckerDidChangeAutomaticInlinePredictionNotification typedef const NSNotificationName = (Void)*
 */
private val NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellCheckerDidChangeAutomaticInlinePredictionNotification").orElseThrow().reinterpret(NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_LAYOUT.byteSize()) }
private val NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_VH: VarHandle by lazy { NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSSpellCheckerDidChangeAutomaticInlinePredictionNotification: MemorySegment
    get() = NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_VH.get(NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_VH.set(NSSpellCheckerDidChangeAutomaticInlinePredictionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSplitViewWillResizeSubviewsNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSSplitViewWillResizeSubviewsNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSplitViewWillResizeSubviewsNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSplitViewWillResizeSubviewsNotification").orElseThrow().reinterpret(NSSplitViewWillResizeSubviewsNotification_LAYOUT.byteSize()) }
private val NSSplitViewWillResizeSubviewsNotification_VH: VarHandle by lazy { NSSplitViewWillResizeSubviewsNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSSplitViewWillResizeSubviewsNotification: MemorySegment
    get() = NSSplitViewWillResizeSubviewsNotification_VH.get(NSSplitViewWillResizeSubviewsNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSplitViewWillResizeSubviewsNotification_VH.set(NSSplitViewWillResizeSubviewsNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSplitViewDidResizeSubviewsNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSSplitViewDidResizeSubviewsNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSplitViewDidResizeSubviewsNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSplitViewDidResizeSubviewsNotification").orElseThrow().reinterpret(NSSplitViewDidResizeSubviewsNotification_LAYOUT.byteSize()) }
private val NSSplitViewDidResizeSubviewsNotification_VH: VarHandle by lazy { NSSplitViewDidResizeSubviewsNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSSplitViewDidResizeSubviewsNotification: MemorySegment
    get() = NSSplitViewDidResizeSubviewsNotification_VH.get(NSSplitViewDidResizeSubviewsNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSplitViewDidResizeSubviewsNotification_VH.set(NSSplitViewDidResizeSubviewsNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSplitViewItemUnspecifiedDimension typedef const CGFloat = Double
 */
private val NSSplitViewItemUnspecifiedDimension_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSSplitViewItemUnspecifiedDimension_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSplitViewItemUnspecifiedDimension").orElseThrow().reinterpret(NSSplitViewItemUnspecifiedDimension_LAYOUT.byteSize()) }
private val NSSplitViewItemUnspecifiedDimension_VH: VarHandle by lazy { NSSplitViewItemUnspecifiedDimension_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var NSSplitViewItemUnspecifiedDimension: Double
    get() = NSSplitViewItemUnspecifiedDimension_VH.get(NSSplitViewItemUnspecifiedDimension_SEGMENT, 0L) as Double
    set(value) = NSSplitViewItemUnspecifiedDimension_VH.set(NSSplitViewItemUnspecifiedDimension_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSplitViewControllerAutomaticDimension typedef const CGFloat = Double
 */
private val NSSplitViewControllerAutomaticDimension_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSSplitViewControllerAutomaticDimension_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSplitViewControllerAutomaticDimension").orElseThrow().reinterpret(NSSplitViewControllerAutomaticDimension_LAYOUT.byteSize()) }
private val NSSplitViewControllerAutomaticDimension_VH: VarHandle by lazy { NSSplitViewControllerAutomaticDimension_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
var NSSplitViewControllerAutomaticDimension: Double
    get() = NSSplitViewControllerAutomaticDimension_VH.get(NSSplitViewControllerAutomaticDimension_SEGMENT, 0L) as Double
    set(value) = NSSplitViewControllerAutomaticDimension_VH.set(NSSplitViewControllerAutomaticDimension_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPopUpButtonCellWillPopUpNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSPopUpButtonCellWillPopUpNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopUpButtonCellWillPopUpNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPopUpButtonCellWillPopUpNotification").orElseThrow().reinterpret(NSPopUpButtonCellWillPopUpNotification_LAYOUT.byteSize()) }
private val NSPopUpButtonCellWillPopUpNotification_VH: VarHandle by lazy { NSPopUpButtonCellWillPopUpNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSPopUpButtonCellWillPopUpNotification: MemorySegment
    get() = NSPopUpButtonCellWillPopUpNotification_VH.get(NSPopUpButtonCellWillPopUpNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSPopUpButtonCellWillPopUpNotification_VH.set(NSPopUpButtonCellWillPopUpNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPopUpButtonWillPopUpNotification typedef NSNotificationName = typedef NSString = (Void)*
 */
private val NSPopUpButtonWillPopUpNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPopUpButtonWillPopUpNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPopUpButtonWillPopUpNotification").orElseThrow().reinterpret(NSPopUpButtonWillPopUpNotification_LAYOUT.byteSize()) }
private val NSPopUpButtonWillPopUpNotification_VH: VarHandle by lazy { NSPopUpButtonWillPopUpNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSPopUpButtonWillPopUpNotification: MemorySegment
    get() = NSPopUpButtonWillPopUpNotification_VH.get(NSPopUpButtonWillPopUpNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSPopUpButtonWillPopUpNotification_VH.set(NSPopUpButtonWillPopUpNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPrintOperationExistsException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSPrintOperationExistsException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintOperationExistsException_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPrintOperationExistsException").orElseThrow().reinterpret(NSPrintOperationExistsException_LAYOUT.byteSize()) }
private val NSPrintOperationExistsException_VH: VarHandle by lazy { NSPrintOperationExistsException_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSPrintOperationExistsException: MemorySegment
    get() = NSPrintOperationExistsException_VH.get(NSPrintOperationExistsException_SEGMENT, 0L) as MemorySegment
    set(value) = NSPrintOperationExistsException_VH.set(NSPrintOperationExistsException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPrintPhotoJobStyleHint typedef const NSPrintPanelJobStyleHint = (Void)*
 */
private val NSPrintPhotoJobStyleHint_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPhotoJobStyleHint_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPrintPhotoJobStyleHint").orElseThrow().reinterpret(NSPrintPhotoJobStyleHint_LAYOUT.byteSize()) }
private val NSPrintPhotoJobStyleHint_VH: VarHandle by lazy { NSPrintPhotoJobStyleHint_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
var NSPrintPhotoJobStyleHint: MemorySegment
    get() = NSPrintPhotoJobStyleHint_VH.get(NSPrintPhotoJobStyleHint_SEGMENT, 0L) as MemorySegment
    set(value) = NSPrintPhotoJobStyleHint_VH.set(NSPrintPhotoJobStyleHint_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPrintAllPresetsJobStyleHint typedef const NSPrintPanelJobStyleHint = (Void)*
 */
private val NSPrintAllPresetsJobStyleHint_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintAllPresetsJobStyleHint_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPrintAllPresetsJobStyleHint").orElseThrow().reinterpret(NSPrintAllPresetsJobStyleHint_LAYOUT.byteSize()) }
private val NSPrintAllPresetsJobStyleHint_VH: VarHandle by lazy { NSPrintAllPresetsJobStyleHint_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSPrintAllPresetsJobStyleHint: MemorySegment
    get() = NSPrintAllPresetsJobStyleHint_VH.get(NSPrintAllPresetsJobStyleHint_SEGMENT, 0L) as MemorySegment
    set(value) = NSPrintAllPresetsJobStyleHint_VH.set(NSPrintAllPresetsJobStyleHint_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPrintNoPresetsJobStyleHint typedef const NSPrintPanelJobStyleHint = (Void)*
 */
private val NSPrintNoPresetsJobStyleHint_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintNoPresetsJobStyleHint_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPrintNoPresetsJobStyleHint").orElseThrow().reinterpret(NSPrintNoPresetsJobStyleHint_LAYOUT.byteSize()) }
private val NSPrintNoPresetsJobStyleHint_VH: VarHandle by lazy { NSPrintNoPresetsJobStyleHint_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSPrintNoPresetsJobStyleHint: MemorySegment
    get() = NSPrintNoPresetsJobStyleHint_VH.get(NSPrintNoPresetsJobStyleHint_SEGMENT, 0L) as MemorySegment
    set(value) = NSPrintNoPresetsJobStyleHint_VH.set(NSPrintNoPresetsJobStyleHint_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPrintPanelAccessorySummaryItemNameKey typedef const NSPrintPanelAccessorySummaryKey = (Void)*
 */
private val NSPrintPanelAccessorySummaryItemNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPanelAccessorySummaryItemNameKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPrintPanelAccessorySummaryItemNameKey").orElseThrow().reinterpret(NSPrintPanelAccessorySummaryItemNameKey_LAYOUT.byteSize()) }
private val NSPrintPanelAccessorySummaryItemNameKey_VH: VarHandle by lazy { NSPrintPanelAccessorySummaryItemNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSPrintPanelAccessorySummaryItemNameKey: MemorySegment
    get() = NSPrintPanelAccessorySummaryItemNameKey_VH.get(NSPrintPanelAccessorySummaryItemNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSPrintPanelAccessorySummaryItemNameKey_VH.set(NSPrintPanelAccessorySummaryItemNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPrintPanelAccessorySummaryItemDescriptionKey typedef const NSPrintPanelAccessorySummaryKey = (Void)*
 */
private val NSPrintPanelAccessorySummaryItemDescriptionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPanelAccessorySummaryItemDescriptionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPrintPanelAccessorySummaryItemDescriptionKey").orElseThrow().reinterpret(NSPrintPanelAccessorySummaryItemDescriptionKey_LAYOUT.byteSize()) }
private val NSPrintPanelAccessorySummaryItemDescriptionKey_VH: VarHandle by lazy { NSPrintPanelAccessorySummaryItemDescriptionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSPrintPanelAccessorySummaryItemDescriptionKey: MemorySegment
    get() = NSPrintPanelAccessorySummaryItemDescriptionKey_VH.get(NSPrintPanelAccessorySummaryItemDescriptionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSPrintPanelAccessorySummaryItemDescriptionKey_VH.set(NSPrintPanelAccessorySummaryItemDescriptionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSScreenColorSpaceDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSScreenColorSpaceDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSScreenColorSpaceDidChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSScreenColorSpaceDidChangeNotification").orElseThrow().reinterpret(NSScreenColorSpaceDidChangeNotification_LAYOUT.byteSize()) }
private val NSScreenColorSpaceDidChangeNotification_VH: VarHandle by lazy { NSScreenColorSpaceDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSScreenColorSpaceDidChangeNotification: MemorySegment
    get() = NSScreenColorSpaceDidChangeNotification_VH.get(NSScreenColorSpaceDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSScreenColorSpaceDidChangeNotification_VH.set(NSScreenColorSpaceDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPreferredScrollerStyleDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSPreferredScrollerStyleDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPreferredScrollerStyleDidChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPreferredScrollerStyleDidChangeNotification").orElseThrow().reinterpret(NSPreferredScrollerStyleDidChangeNotification_LAYOUT.byteSize()) }
private val NSPreferredScrollerStyleDidChangeNotification_VH: VarHandle by lazy { NSPreferredScrollerStyleDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSPreferredScrollerStyleDidChangeNotification: MemorySegment
    get() = NSPreferredScrollerStyleDidChangeNotification_VH.get(NSPreferredScrollerStyleDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSPreferredScrollerStyleDidChangeNotification_VH.set(NSPreferredScrollerStyleDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextFinderCaseInsensitiveKey typedef const NSPasteboardTypeTextFinderOptionKey = (Void)*
 */
private val NSTextFinderCaseInsensitiveKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextFinderCaseInsensitiveKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextFinderCaseInsensitiveKey").orElseThrow().reinterpret(NSTextFinderCaseInsensitiveKey_LAYOUT.byteSize()) }
private val NSTextFinderCaseInsensitiveKey_VH: VarHandle by lazy { NSTextFinderCaseInsensitiveKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSTextFinderCaseInsensitiveKey: MemorySegment
    get() = NSTextFinderCaseInsensitiveKey_VH.get(NSTextFinderCaseInsensitiveKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextFinderCaseInsensitiveKey_VH.set(NSTextFinderCaseInsensitiveKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextFinderMatchingTypeKey typedef const NSPasteboardTypeTextFinderOptionKey = (Void)*
 */
private val NSTextFinderMatchingTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextFinderMatchingTypeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextFinderMatchingTypeKey").orElseThrow().reinterpret(NSTextFinderMatchingTypeKey_LAYOUT.byteSize()) }
private val NSTextFinderMatchingTypeKey_VH: VarHandle by lazy { NSTextFinderMatchingTypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
var NSTextFinderMatchingTypeKey: MemorySegment
    get() = NSTextFinderMatchingTypeKey_VH.get(NSTextFinderMatchingTypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextFinderMatchingTypeKey_VH.set(NSTextFinderMatchingTypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSScrollViewWillStartLiveMagnifyNotification typedef const NSNotificationName = (Void)*
 */
private val NSScrollViewWillStartLiveMagnifyNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSScrollViewWillStartLiveMagnifyNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSScrollViewWillStartLiveMagnifyNotification").orElseThrow().reinterpret(NSScrollViewWillStartLiveMagnifyNotification_LAYOUT.byteSize()) }
private val NSScrollViewWillStartLiveMagnifyNotification_VH: VarHandle by lazy { NSScrollViewWillStartLiveMagnifyNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSScrollViewWillStartLiveMagnifyNotification: MemorySegment
    get() = NSScrollViewWillStartLiveMagnifyNotification_VH.get(NSScrollViewWillStartLiveMagnifyNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSScrollViewWillStartLiveMagnifyNotification_VH.set(NSScrollViewWillStartLiveMagnifyNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSScrollViewDidEndLiveMagnifyNotification typedef const NSNotificationName = (Void)*
 */
private val NSScrollViewDidEndLiveMagnifyNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSScrollViewDidEndLiveMagnifyNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSScrollViewDidEndLiveMagnifyNotification").orElseThrow().reinterpret(NSScrollViewDidEndLiveMagnifyNotification_LAYOUT.byteSize()) }
private val NSScrollViewDidEndLiveMagnifyNotification_VH: VarHandle by lazy { NSScrollViewDidEndLiveMagnifyNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSScrollViewDidEndLiveMagnifyNotification: MemorySegment
    get() = NSScrollViewDidEndLiveMagnifyNotification_VH.get(NSScrollViewDidEndLiveMagnifyNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSScrollViewDidEndLiveMagnifyNotification_VH.set(NSScrollViewDidEndLiveMagnifyNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSScrollViewWillStartLiveScrollNotification typedef const NSNotificationName = (Void)*
 */
private val NSScrollViewWillStartLiveScrollNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSScrollViewWillStartLiveScrollNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSScrollViewWillStartLiveScrollNotification").orElseThrow().reinterpret(NSScrollViewWillStartLiveScrollNotification_LAYOUT.byteSize()) }
private val NSScrollViewWillStartLiveScrollNotification_VH: VarHandle by lazy { NSScrollViewWillStartLiveScrollNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSScrollViewWillStartLiveScrollNotification: MemorySegment
    get() = NSScrollViewWillStartLiveScrollNotification_VH.get(NSScrollViewWillStartLiveScrollNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSScrollViewWillStartLiveScrollNotification_VH.set(NSScrollViewWillStartLiveScrollNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSScrollViewDidLiveScrollNotification typedef const NSNotificationName = (Void)*
 */
private val NSScrollViewDidLiveScrollNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSScrollViewDidLiveScrollNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSScrollViewDidLiveScrollNotification").orElseThrow().reinterpret(NSScrollViewDidLiveScrollNotification_LAYOUT.byteSize()) }
private val NSScrollViewDidLiveScrollNotification_VH: VarHandle by lazy { NSScrollViewDidLiveScrollNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSScrollViewDidLiveScrollNotification: MemorySegment
    get() = NSScrollViewDidLiveScrollNotification_VH.get(NSScrollViewDidLiveScrollNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSScrollViewDidLiveScrollNotification_VH.set(NSScrollViewDidLiveScrollNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSScrollViewDidEndLiveScrollNotification typedef const NSNotificationName = (Void)*
 */
private val NSScrollViewDidEndLiveScrollNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSScrollViewDidEndLiveScrollNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSScrollViewDidEndLiveScrollNotification").orElseThrow().reinterpret(NSScrollViewDidEndLiveScrollNotification_LAYOUT.byteSize()) }
private val NSScrollViewDidEndLiveScrollNotification_VH: VarHandle by lazy { NSScrollViewDidEndLiveScrollNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
var NSScrollViewDidEndLiveScrollNotification: MemorySegment
    get() = NSScrollViewDidEndLiveScrollNotification_VH.get(NSScrollViewDidEndLiveScrollNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSScrollViewDidEndLiveScrollNotification_VH.set(NSScrollViewDidEndLiveScrollNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSGridViewSizeForContent typedef const CGFloat = Double
 */
private val NSGridViewSizeForContent_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSGridViewSizeForContent_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSGridViewSizeForContent").orElseThrow().reinterpret(NSGridViewSizeForContent_LAYOUT.byteSize()) }
private val NSGridViewSizeForContent_VH: VarHandle by lazy { NSGridViewSizeForContent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
var NSGridViewSizeForContent: Double
    get() = NSGridViewSizeForContent_VH.get(NSGridViewSizeForContent_SEGMENT, 0L) as Double
    set(value) = NSGridViewSizeForContent_VH.set(NSGridViewSizeForContent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeUsername typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeUsername_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeUsername_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeUsername").orElseThrow().reinterpret(NSTextContentTypeUsername_LAYOUT.byteSize()) }
private val NSTextContentTypeUsername_VH: VarHandle by lazy { NSTextContentTypeUsername_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeUsername: MemorySegment
    get() = NSTextContentTypeUsername_VH.get(NSTextContentTypeUsername_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeUsername_VH.set(NSTextContentTypeUsername_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypePassword typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypePassword_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypePassword_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypePassword").orElseThrow().reinterpret(NSTextContentTypePassword_LAYOUT.byteSize()) }
private val NSTextContentTypePassword_VH: VarHandle by lazy { NSTextContentTypePassword_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypePassword: MemorySegment
    get() = NSTextContentTypePassword_VH.get(NSTextContentTypePassword_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypePassword_VH.set(NSTextContentTypePassword_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeOneTimeCode typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeOneTimeCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeOneTimeCode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeOneTimeCode").orElseThrow().reinterpret(NSTextContentTypeOneTimeCode_LAYOUT.byteSize()) }
private val NSTextContentTypeOneTimeCode_VH: VarHandle by lazy { NSTextContentTypeOneTimeCode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeOneTimeCode: MemorySegment
    get() = NSTextContentTypeOneTimeCode_VH.get(NSTextContentTypeOneTimeCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeOneTimeCode_VH.set(NSTextContentTypeOneTimeCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeNewPassword typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeNewPassword_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeNewPassword_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeNewPassword").orElseThrow().reinterpret(NSTextContentTypeNewPassword_LAYOUT.byteSize()) }
private val NSTextContentTypeNewPassword_VH: VarHandle by lazy { NSTextContentTypeNewPassword_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeNewPassword: MemorySegment
    get() = NSTextContentTypeNewPassword_VH.get(NSTextContentTypeNewPassword_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeNewPassword_VH.set(NSTextContentTypeNewPassword_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeName").orElseThrow().reinterpret(NSTextContentTypeName_LAYOUT.byteSize()) }
private val NSTextContentTypeName_VH: VarHandle by lazy { NSTextContentTypeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeName: MemorySegment
    get() = NSTextContentTypeName_VH.get(NSTextContentTypeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeName_VH.set(NSTextContentTypeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeNamePrefix typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeNamePrefix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeNamePrefix_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeNamePrefix").orElseThrow().reinterpret(NSTextContentTypeNamePrefix_LAYOUT.byteSize()) }
private val NSTextContentTypeNamePrefix_VH: VarHandle by lazy { NSTextContentTypeNamePrefix_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeNamePrefix: MemorySegment
    get() = NSTextContentTypeNamePrefix_VH.get(NSTextContentTypeNamePrefix_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeNamePrefix_VH.set(NSTextContentTypeNamePrefix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeGivenName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeGivenName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeGivenName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeGivenName").orElseThrow().reinterpret(NSTextContentTypeGivenName_LAYOUT.byteSize()) }
private val NSTextContentTypeGivenName_VH: VarHandle by lazy { NSTextContentTypeGivenName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeGivenName: MemorySegment
    get() = NSTextContentTypeGivenName_VH.get(NSTextContentTypeGivenName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeGivenName_VH.set(NSTextContentTypeGivenName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeMiddleName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeMiddleName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeMiddleName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeMiddleName").orElseThrow().reinterpret(NSTextContentTypeMiddleName_LAYOUT.byteSize()) }
private val NSTextContentTypeMiddleName_VH: VarHandle by lazy { NSTextContentTypeMiddleName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeMiddleName: MemorySegment
    get() = NSTextContentTypeMiddleName_VH.get(NSTextContentTypeMiddleName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeMiddleName_VH.set(NSTextContentTypeMiddleName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeFamilyName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeFamilyName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeFamilyName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeFamilyName").orElseThrow().reinterpret(NSTextContentTypeFamilyName_LAYOUT.byteSize()) }
private val NSTextContentTypeFamilyName_VH: VarHandle by lazy { NSTextContentTypeFamilyName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeFamilyName: MemorySegment
    get() = NSTextContentTypeFamilyName_VH.get(NSTextContentTypeFamilyName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeFamilyName_VH.set(NSTextContentTypeFamilyName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeNameSuffix typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeNameSuffix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeNameSuffix_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeNameSuffix").orElseThrow().reinterpret(NSTextContentTypeNameSuffix_LAYOUT.byteSize()) }
private val NSTextContentTypeNameSuffix_VH: VarHandle by lazy { NSTextContentTypeNameSuffix_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeNameSuffix: MemorySegment
    get() = NSTextContentTypeNameSuffix_VH.get(NSTextContentTypeNameSuffix_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeNameSuffix_VH.set(NSTextContentTypeNameSuffix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeNickname typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeNickname_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeNickname_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeNickname").orElseThrow().reinterpret(NSTextContentTypeNickname_LAYOUT.byteSize()) }
private val NSTextContentTypeNickname_VH: VarHandle by lazy { NSTextContentTypeNickname_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeNickname: MemorySegment
    get() = NSTextContentTypeNickname_VH.get(NSTextContentTypeNickname_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeNickname_VH.set(NSTextContentTypeNickname_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeJobTitle typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeJobTitle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeJobTitle_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeJobTitle").orElseThrow().reinterpret(NSTextContentTypeJobTitle_LAYOUT.byteSize()) }
private val NSTextContentTypeJobTitle_VH: VarHandle by lazy { NSTextContentTypeJobTitle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeJobTitle: MemorySegment
    get() = NSTextContentTypeJobTitle_VH.get(NSTextContentTypeJobTitle_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeJobTitle_VH.set(NSTextContentTypeJobTitle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeOrganizationName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeOrganizationName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeOrganizationName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeOrganizationName").orElseThrow().reinterpret(NSTextContentTypeOrganizationName_LAYOUT.byteSize()) }
private val NSTextContentTypeOrganizationName_VH: VarHandle by lazy { NSTextContentTypeOrganizationName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeOrganizationName: MemorySegment
    get() = NSTextContentTypeOrganizationName_VH.get(NSTextContentTypeOrganizationName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeOrganizationName_VH.set(NSTextContentTypeOrganizationName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeLocation typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeLocation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeLocation_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeLocation").orElseThrow().reinterpret(NSTextContentTypeLocation_LAYOUT.byteSize()) }
private val NSTextContentTypeLocation_VH: VarHandle by lazy { NSTextContentTypeLocation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeLocation: MemorySegment
    get() = NSTextContentTypeLocation_VH.get(NSTextContentTypeLocation_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeLocation_VH.set(NSTextContentTypeLocation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeFullStreetAddress typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeFullStreetAddress_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeFullStreetAddress_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeFullStreetAddress").orElseThrow().reinterpret(NSTextContentTypeFullStreetAddress_LAYOUT.byteSize()) }
private val NSTextContentTypeFullStreetAddress_VH: VarHandle by lazy { NSTextContentTypeFullStreetAddress_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeFullStreetAddress: MemorySegment
    get() = NSTextContentTypeFullStreetAddress_VH.get(NSTextContentTypeFullStreetAddress_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeFullStreetAddress_VH.set(NSTextContentTypeFullStreetAddress_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeStreetAddressLine1 typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeStreetAddressLine1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeStreetAddressLine1_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeStreetAddressLine1").orElseThrow().reinterpret(NSTextContentTypeStreetAddressLine1_LAYOUT.byteSize()) }
private val NSTextContentTypeStreetAddressLine1_VH: VarHandle by lazy { NSTextContentTypeStreetAddressLine1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeStreetAddressLine1: MemorySegment
    get() = NSTextContentTypeStreetAddressLine1_VH.get(NSTextContentTypeStreetAddressLine1_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeStreetAddressLine1_VH.set(NSTextContentTypeStreetAddressLine1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeStreetAddressLine2 typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeStreetAddressLine2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeStreetAddressLine2_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeStreetAddressLine2").orElseThrow().reinterpret(NSTextContentTypeStreetAddressLine2_LAYOUT.byteSize()) }
private val NSTextContentTypeStreetAddressLine2_VH: VarHandle by lazy { NSTextContentTypeStreetAddressLine2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeStreetAddressLine2: MemorySegment
    get() = NSTextContentTypeStreetAddressLine2_VH.get(NSTextContentTypeStreetAddressLine2_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeStreetAddressLine2_VH.set(NSTextContentTypeStreetAddressLine2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeAddressCity typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeAddressCity_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeAddressCity_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeAddressCity").orElseThrow().reinterpret(NSTextContentTypeAddressCity_LAYOUT.byteSize()) }
private val NSTextContentTypeAddressCity_VH: VarHandle by lazy { NSTextContentTypeAddressCity_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeAddressCity: MemorySegment
    get() = NSTextContentTypeAddressCity_VH.get(NSTextContentTypeAddressCity_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeAddressCity_VH.set(NSTextContentTypeAddressCity_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeAddressState typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeAddressState_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeAddressState_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeAddressState").orElseThrow().reinterpret(NSTextContentTypeAddressState_LAYOUT.byteSize()) }
private val NSTextContentTypeAddressState_VH: VarHandle by lazy { NSTextContentTypeAddressState_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeAddressState: MemorySegment
    get() = NSTextContentTypeAddressState_VH.get(NSTextContentTypeAddressState_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeAddressState_VH.set(NSTextContentTypeAddressState_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeAddressCityAndState typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeAddressCityAndState_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeAddressCityAndState_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeAddressCityAndState").orElseThrow().reinterpret(NSTextContentTypeAddressCityAndState_LAYOUT.byteSize()) }
private val NSTextContentTypeAddressCityAndState_VH: VarHandle by lazy { NSTextContentTypeAddressCityAndState_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeAddressCityAndState: MemorySegment
    get() = NSTextContentTypeAddressCityAndState_VH.get(NSTextContentTypeAddressCityAndState_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeAddressCityAndState_VH.set(NSTextContentTypeAddressCityAndState_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeSublocality typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeSublocality_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeSublocality_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeSublocality").orElseThrow().reinterpret(NSTextContentTypeSublocality_LAYOUT.byteSize()) }
private val NSTextContentTypeSublocality_VH: VarHandle by lazy { NSTextContentTypeSublocality_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeSublocality: MemorySegment
    get() = NSTextContentTypeSublocality_VH.get(NSTextContentTypeSublocality_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeSublocality_VH.set(NSTextContentTypeSublocality_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCountryName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCountryName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCountryName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCountryName").orElseThrow().reinterpret(NSTextContentTypeCountryName_LAYOUT.byteSize()) }
private val NSTextContentTypeCountryName_VH: VarHandle by lazy { NSTextContentTypeCountryName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCountryName: MemorySegment
    get() = NSTextContentTypeCountryName_VH.get(NSTextContentTypeCountryName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCountryName_VH.set(NSTextContentTypeCountryName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypePostalCode typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypePostalCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypePostalCode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypePostalCode").orElseThrow().reinterpret(NSTextContentTypePostalCode_LAYOUT.byteSize()) }
private val NSTextContentTypePostalCode_VH: VarHandle by lazy { NSTextContentTypePostalCode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypePostalCode: MemorySegment
    get() = NSTextContentTypePostalCode_VH.get(NSTextContentTypePostalCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypePostalCode_VH.set(NSTextContentTypePostalCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeTelephoneNumber typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeTelephoneNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeTelephoneNumber_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeTelephoneNumber").orElseThrow().reinterpret(NSTextContentTypeTelephoneNumber_LAYOUT.byteSize()) }
private val NSTextContentTypeTelephoneNumber_VH: VarHandle by lazy { NSTextContentTypeTelephoneNumber_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeTelephoneNumber: MemorySegment
    get() = NSTextContentTypeTelephoneNumber_VH.get(NSTextContentTypeTelephoneNumber_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeTelephoneNumber_VH.set(NSTextContentTypeTelephoneNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeEmailAddress typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeEmailAddress_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeEmailAddress_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeEmailAddress").orElseThrow().reinterpret(NSTextContentTypeEmailAddress_LAYOUT.byteSize()) }
private val NSTextContentTypeEmailAddress_VH: VarHandle by lazy { NSTextContentTypeEmailAddress_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeEmailAddress: MemorySegment
    get() = NSTextContentTypeEmailAddress_VH.get(NSTextContentTypeEmailAddress_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeEmailAddress_VH.set(NSTextContentTypeEmailAddress_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeURL typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeURL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeURL_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeURL").orElseThrow().reinterpret(NSTextContentTypeURL_LAYOUT.byteSize()) }
private val NSTextContentTypeURL_VH: VarHandle by lazy { NSTextContentTypeURL_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeURL: MemorySegment
    get() = NSTextContentTypeURL_VH.get(NSTextContentTypeURL_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeURL_VH.set(NSTextContentTypeURL_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardNumber typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardNumber_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardNumber").orElseThrow().reinterpret(NSTextContentTypeCreditCardNumber_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardNumber_VH: VarHandle by lazy { NSTextContentTypeCreditCardNumber_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardNumber: MemorySegment
    get() = NSTextContentTypeCreditCardNumber_VH.get(NSTextContentTypeCreditCardNumber_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardNumber_VH.set(NSTextContentTypeCreditCardNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardName").orElseThrow().reinterpret(NSTextContentTypeCreditCardName_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardName_VH: VarHandle by lazy { NSTextContentTypeCreditCardName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardName: MemorySegment
    get() = NSTextContentTypeCreditCardName_VH.get(NSTextContentTypeCreditCardName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardName_VH.set(NSTextContentTypeCreditCardName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardGivenName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardGivenName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardGivenName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardGivenName").orElseThrow().reinterpret(NSTextContentTypeCreditCardGivenName_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardGivenName_VH: VarHandle by lazy { NSTextContentTypeCreditCardGivenName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardGivenName: MemorySegment
    get() = NSTextContentTypeCreditCardGivenName_VH.get(NSTextContentTypeCreditCardGivenName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardGivenName_VH.set(NSTextContentTypeCreditCardGivenName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardMiddleName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardMiddleName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardMiddleName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardMiddleName").orElseThrow().reinterpret(NSTextContentTypeCreditCardMiddleName_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardMiddleName_VH: VarHandle by lazy { NSTextContentTypeCreditCardMiddleName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardMiddleName: MemorySegment
    get() = NSTextContentTypeCreditCardMiddleName_VH.get(NSTextContentTypeCreditCardMiddleName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardMiddleName_VH.set(NSTextContentTypeCreditCardMiddleName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardFamilyName typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardFamilyName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardFamilyName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardFamilyName").orElseThrow().reinterpret(NSTextContentTypeCreditCardFamilyName_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardFamilyName_VH: VarHandle by lazy { NSTextContentTypeCreditCardFamilyName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardFamilyName: MemorySegment
    get() = NSTextContentTypeCreditCardFamilyName_VH.get(NSTextContentTypeCreditCardFamilyName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardFamilyName_VH.set(NSTextContentTypeCreditCardFamilyName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardSecurityCode typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardSecurityCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardSecurityCode_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardSecurityCode").orElseThrow().reinterpret(NSTextContentTypeCreditCardSecurityCode_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardSecurityCode_VH: VarHandle by lazy { NSTextContentTypeCreditCardSecurityCode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardSecurityCode: MemorySegment
    get() = NSTextContentTypeCreditCardSecurityCode_VH.get(NSTextContentTypeCreditCardSecurityCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardSecurityCode_VH.set(NSTextContentTypeCreditCardSecurityCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardExpiration typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardExpiration_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardExpiration_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardExpiration").orElseThrow().reinterpret(NSTextContentTypeCreditCardExpiration_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardExpiration_VH: VarHandle by lazy { NSTextContentTypeCreditCardExpiration_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardExpiration: MemorySegment
    get() = NSTextContentTypeCreditCardExpiration_VH.get(NSTextContentTypeCreditCardExpiration_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardExpiration_VH.set(NSTextContentTypeCreditCardExpiration_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardExpirationMonth typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardExpirationMonth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardExpirationMonth_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardExpirationMonth").orElseThrow().reinterpret(NSTextContentTypeCreditCardExpirationMonth_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardExpirationMonth_VH: VarHandle by lazy { NSTextContentTypeCreditCardExpirationMonth_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardExpirationMonth: MemorySegment
    get() = NSTextContentTypeCreditCardExpirationMonth_VH.get(NSTextContentTypeCreditCardExpirationMonth_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardExpirationMonth_VH.set(NSTextContentTypeCreditCardExpirationMonth_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardExpirationYear typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardExpirationYear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardExpirationYear_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardExpirationYear").orElseThrow().reinterpret(NSTextContentTypeCreditCardExpirationYear_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardExpirationYear_VH: VarHandle by lazy { NSTextContentTypeCreditCardExpirationYear_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardExpirationYear: MemorySegment
    get() = NSTextContentTypeCreditCardExpirationYear_VH.get(NSTextContentTypeCreditCardExpirationYear_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardExpirationYear_VH.set(NSTextContentTypeCreditCardExpirationYear_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeCreditCardType typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeCreditCardType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeCreditCardType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeCreditCardType").orElseThrow().reinterpret(NSTextContentTypeCreditCardType_LAYOUT.byteSize()) }
private val NSTextContentTypeCreditCardType_VH: VarHandle by lazy { NSTextContentTypeCreditCardType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeCreditCardType: MemorySegment
    get() = NSTextContentTypeCreditCardType_VH.get(NSTextContentTypeCreditCardType_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeCreditCardType_VH.set(NSTextContentTypeCreditCardType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeShipmentTrackingNumber typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeShipmentTrackingNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeShipmentTrackingNumber_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeShipmentTrackingNumber").orElseThrow().reinterpret(NSTextContentTypeShipmentTrackingNumber_LAYOUT.byteSize()) }
private val NSTextContentTypeShipmentTrackingNumber_VH: VarHandle by lazy { NSTextContentTypeShipmentTrackingNumber_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeShipmentTrackingNumber: MemorySegment
    get() = NSTextContentTypeShipmentTrackingNumber_VH.get(NSTextContentTypeShipmentTrackingNumber_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeShipmentTrackingNumber_VH.set(NSTextContentTypeShipmentTrackingNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeFlightNumber typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeFlightNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeFlightNumber_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeFlightNumber").orElseThrow().reinterpret(NSTextContentTypeFlightNumber_LAYOUT.byteSize()) }
private val NSTextContentTypeFlightNumber_VH: VarHandle by lazy { NSTextContentTypeFlightNumber_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeFlightNumber: MemorySegment
    get() = NSTextContentTypeFlightNumber_VH.get(NSTextContentTypeFlightNumber_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeFlightNumber_VH.set(NSTextContentTypeFlightNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeDateTime typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeDateTime_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeDateTime_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeDateTime").orElseThrow().reinterpret(NSTextContentTypeDateTime_LAYOUT.byteSize()) }
private val NSTextContentTypeDateTime_VH: VarHandle by lazy { NSTextContentTypeDateTime_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeDateTime: MemorySegment
    get() = NSTextContentTypeDateTime_VH.get(NSTextContentTypeDateTime_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeDateTime_VH.set(NSTextContentTypeDateTime_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeBirthdate typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeBirthdate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeBirthdate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeBirthdate").orElseThrow().reinterpret(NSTextContentTypeBirthdate_LAYOUT.byteSize()) }
private val NSTextContentTypeBirthdate_VH: VarHandle by lazy { NSTextContentTypeBirthdate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeBirthdate: MemorySegment
    get() = NSTextContentTypeBirthdate_VH.get(NSTextContentTypeBirthdate_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeBirthdate_VH.set(NSTextContentTypeBirthdate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeBirthdateDay typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeBirthdateDay_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeBirthdateDay_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeBirthdateDay").orElseThrow().reinterpret(NSTextContentTypeBirthdateDay_LAYOUT.byteSize()) }
private val NSTextContentTypeBirthdateDay_VH: VarHandle by lazy { NSTextContentTypeBirthdateDay_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeBirthdateDay: MemorySegment
    get() = NSTextContentTypeBirthdateDay_VH.get(NSTextContentTypeBirthdateDay_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeBirthdateDay_VH.set(NSTextContentTypeBirthdateDay_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeBirthdateMonth typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeBirthdateMonth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeBirthdateMonth_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeBirthdateMonth").orElseThrow().reinterpret(NSTextContentTypeBirthdateMonth_LAYOUT.byteSize()) }
private val NSTextContentTypeBirthdateMonth_VH: VarHandle by lazy { NSTextContentTypeBirthdateMonth_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeBirthdateMonth: MemorySegment
    get() = NSTextContentTypeBirthdateMonth_VH.get(NSTextContentTypeBirthdateMonth_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeBirthdateMonth_VH.set(NSTextContentTypeBirthdateMonth_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextContentTypeBirthdateYear typedef const NSTextContentType = (Void)*
 */
private val NSTextContentTypeBirthdateYear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextContentTypeBirthdateYear_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextContentTypeBirthdateYear").orElseThrow().reinterpret(NSTextContentTypeBirthdateYear_LAYOUT.byteSize()) }
private val NSTextContentTypeBirthdateYear_VH: VarHandle by lazy { NSTextContentTypeBirthdateYear_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var NSTextContentTypeBirthdateYear: MemorySegment
    get() = NSTextContentTypeBirthdateYear_VH.get(NSTextContentTypeBirthdateYear_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextContentTypeBirthdateYear_VH.set(NSTextContentTypeBirthdateYear_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFontAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSFontAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSFontAttributeName").orElseThrow().reinterpret(NSFontAttributeName_LAYOUT.byteSize()) }
private val NSFontAttributeName_VH: VarHandle by lazy { NSFontAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSFontAttributeName: MemorySegment
    get() = NSFontAttributeName_VH.get(NSFontAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSFontAttributeName_VH.set(NSFontAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSParagraphStyleAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSParagraphStyleAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSParagraphStyleAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSParagraphStyleAttributeName").orElseThrow().reinterpret(NSParagraphStyleAttributeName_LAYOUT.byteSize()) }
private val NSParagraphStyleAttributeName_VH: VarHandle by lazy { NSParagraphStyleAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSParagraphStyleAttributeName: MemorySegment
    get() = NSParagraphStyleAttributeName_VH.get(NSParagraphStyleAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSParagraphStyleAttributeName_VH.set(NSParagraphStyleAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSForegroundColorAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSForegroundColorAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSForegroundColorAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSForegroundColorAttributeName").orElseThrow().reinterpret(NSForegroundColorAttributeName_LAYOUT.byteSize()) }
private val NSForegroundColorAttributeName_VH: VarHandle by lazy { NSForegroundColorAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSForegroundColorAttributeName: MemorySegment
    get() = NSForegroundColorAttributeName_VH.get(NSForegroundColorAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSForegroundColorAttributeName_VH.set(NSForegroundColorAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBackgroundColorAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSBackgroundColorAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBackgroundColorAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSBackgroundColorAttributeName").orElseThrow().reinterpret(NSBackgroundColorAttributeName_LAYOUT.byteSize()) }
private val NSBackgroundColorAttributeName_VH: VarHandle by lazy { NSBackgroundColorAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSBackgroundColorAttributeName: MemorySegment
    get() = NSBackgroundColorAttributeName_VH.get(NSBackgroundColorAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSBackgroundColorAttributeName_VH.set(NSBackgroundColorAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLigatureAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSLigatureAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLigatureAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLigatureAttributeName").orElseThrow().reinterpret(NSLigatureAttributeName_LAYOUT.byteSize()) }
private val NSLigatureAttributeName_VH: VarHandle by lazy { NSLigatureAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSLigatureAttributeName: MemorySegment
    get() = NSLigatureAttributeName_VH.get(NSLigatureAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSLigatureAttributeName_VH.set(NSLigatureAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKernAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSKernAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKernAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSKernAttributeName").orElseThrow().reinterpret(NSKernAttributeName_LAYOUT.byteSize()) }
private val NSKernAttributeName_VH: VarHandle by lazy { NSKernAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSKernAttributeName: MemorySegment
    get() = NSKernAttributeName_VH.get(NSKernAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSKernAttributeName_VH.set(NSKernAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTrackingAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSTrackingAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTrackingAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTrackingAttributeName").orElseThrow().reinterpret(NSTrackingAttributeName_LAYOUT.byteSize()) }
private val NSTrackingAttributeName_VH: VarHandle by lazy { NSTrackingAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTrackingAttributeName: MemorySegment
    get() = NSTrackingAttributeName_VH.get(NSTrackingAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTrackingAttributeName_VH.set(NSTrackingAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStrikethroughStyleAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSStrikethroughStyleAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStrikethroughStyleAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStrikethroughStyleAttributeName").orElseThrow().reinterpret(NSStrikethroughStyleAttributeName_LAYOUT.byteSize()) }
private val NSStrikethroughStyleAttributeName_VH: VarHandle by lazy { NSStrikethroughStyleAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSStrikethroughStyleAttributeName: MemorySegment
    get() = NSStrikethroughStyleAttributeName_VH.get(NSStrikethroughStyleAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSStrikethroughStyleAttributeName_VH.set(NSStrikethroughStyleAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnderlineStyleAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSUnderlineStyleAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUnderlineStyleAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUnderlineStyleAttributeName").orElseThrow().reinterpret(NSUnderlineStyleAttributeName_LAYOUT.byteSize()) }
private val NSUnderlineStyleAttributeName_VH: VarHandle by lazy { NSUnderlineStyleAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSUnderlineStyleAttributeName: MemorySegment
    get() = NSUnderlineStyleAttributeName_VH.get(NSUnderlineStyleAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSUnderlineStyleAttributeName_VH.set(NSUnderlineStyleAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStrokeColorAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSStrokeColorAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStrokeColorAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStrokeColorAttributeName").orElseThrow().reinterpret(NSStrokeColorAttributeName_LAYOUT.byteSize()) }
private val NSStrokeColorAttributeName_VH: VarHandle by lazy { NSStrokeColorAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSStrokeColorAttributeName: MemorySegment
    get() = NSStrokeColorAttributeName_VH.get(NSStrokeColorAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSStrokeColorAttributeName_VH.set(NSStrokeColorAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStrokeWidthAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSStrokeWidthAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStrokeWidthAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStrokeWidthAttributeName").orElseThrow().reinterpret(NSStrokeWidthAttributeName_LAYOUT.byteSize()) }
private val NSStrokeWidthAttributeName_VH: VarHandle by lazy { NSStrokeWidthAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSStrokeWidthAttributeName: MemorySegment
    get() = NSStrokeWidthAttributeName_VH.get(NSStrokeWidthAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSStrokeWidthAttributeName_VH.set(NSStrokeWidthAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSShadowAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSShadowAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSShadowAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSShadowAttributeName").orElseThrow().reinterpret(NSShadowAttributeName_LAYOUT.byteSize()) }
private val NSShadowAttributeName_VH: VarHandle by lazy { NSShadowAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSShadowAttributeName: MemorySegment
    get() = NSShadowAttributeName_VH.get(NSShadowAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSShadowAttributeName_VH.set(NSShadowAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextEffectAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSTextEffectAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextEffectAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextEffectAttributeName").orElseThrow().reinterpret(NSTextEffectAttributeName_LAYOUT.byteSize()) }
private val NSTextEffectAttributeName_VH: VarHandle by lazy { NSTextEffectAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextEffectAttributeName: MemorySegment
    get() = NSTextEffectAttributeName_VH.get(NSTextEffectAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextEffectAttributeName_VH.set(NSTextEffectAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAttachmentAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSAttachmentAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAttachmentAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAttachmentAttributeName").orElseThrow().reinterpret(NSAttachmentAttributeName_LAYOUT.byteSize()) }
private val NSAttachmentAttributeName_VH: VarHandle by lazy { NSAttachmentAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSAttachmentAttributeName: MemorySegment
    get() = NSAttachmentAttributeName_VH.get(NSAttachmentAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSAttachmentAttributeName_VH.set(NSAttachmentAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinkAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSLinkAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinkAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinkAttributeName").orElseThrow().reinterpret(NSLinkAttributeName_LAYOUT.byteSize()) }
private val NSLinkAttributeName_VH: VarHandle by lazy { NSLinkAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSLinkAttributeName: MemorySegment
    get() = NSLinkAttributeName_VH.get(NSLinkAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinkAttributeName_VH.set(NSLinkAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBaselineOffsetAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSBaselineOffsetAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBaselineOffsetAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSBaselineOffsetAttributeName").orElseThrow().reinterpret(NSBaselineOffsetAttributeName_LAYOUT.byteSize()) }
private val NSBaselineOffsetAttributeName_VH: VarHandle by lazy { NSBaselineOffsetAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSBaselineOffsetAttributeName: MemorySegment
    get() = NSBaselineOffsetAttributeName_VH.get(NSBaselineOffsetAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSBaselineOffsetAttributeName_VH.set(NSBaselineOffsetAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnderlineColorAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSUnderlineColorAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUnderlineColorAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUnderlineColorAttributeName").orElseThrow().reinterpret(NSUnderlineColorAttributeName_LAYOUT.byteSize()) }
private val NSUnderlineColorAttributeName_VH: VarHandle by lazy { NSUnderlineColorAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSUnderlineColorAttributeName: MemorySegment
    get() = NSUnderlineColorAttributeName_VH.get(NSUnderlineColorAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSUnderlineColorAttributeName_VH.set(NSUnderlineColorAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStrikethroughColorAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSStrikethroughColorAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStrikethroughColorAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStrikethroughColorAttributeName").orElseThrow().reinterpret(NSStrikethroughColorAttributeName_LAYOUT.byteSize()) }
private val NSStrikethroughColorAttributeName_VH: VarHandle by lazy { NSStrikethroughColorAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSStrikethroughColorAttributeName: MemorySegment
    get() = NSStrikethroughColorAttributeName_VH.get(NSStrikethroughColorAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSStrikethroughColorAttributeName_VH.set(NSStrikethroughColorAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWritingDirectionAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSWritingDirectionAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWritingDirectionAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSWritingDirectionAttributeName").orElseThrow().reinterpret(NSWritingDirectionAttributeName_LAYOUT.byteSize()) }
private val NSWritingDirectionAttributeName_VH: VarHandle by lazy { NSWritingDirectionAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSWritingDirectionAttributeName: MemorySegment
    get() = NSWritingDirectionAttributeName_VH.get(NSWritingDirectionAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSWritingDirectionAttributeName_VH.set(NSWritingDirectionAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightStyleAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSTextHighlightStyleAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightStyleAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightStyleAttributeName").orElseThrow().reinterpret(NSTextHighlightStyleAttributeName_LAYOUT.byteSize()) }
private val NSTextHighlightStyleAttributeName_VH: VarHandle by lazy { NSTextHighlightStyleAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightStyleAttributeName: MemorySegment
    get() = NSTextHighlightStyleAttributeName_VH.get(NSTextHighlightStyleAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightStyleAttributeName_VH.set(NSTextHighlightStyleAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightColorSchemeAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSTextHighlightColorSchemeAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightColorSchemeAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightColorSchemeAttributeName").orElseThrow().reinterpret(NSTextHighlightColorSchemeAttributeName_LAYOUT.byteSize()) }
private val NSTextHighlightColorSchemeAttributeName_VH: VarHandle by lazy { NSTextHighlightColorSchemeAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightColorSchemeAttributeName: MemorySegment
    get() = NSTextHighlightColorSchemeAttributeName_VH.get(NSTextHighlightColorSchemeAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightColorSchemeAttributeName_VH.set(NSTextHighlightColorSchemeAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAdaptiveImageGlyphAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSAdaptiveImageGlyphAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAdaptiveImageGlyphAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAdaptiveImageGlyphAttributeName").orElseThrow().reinterpret(NSAdaptiveImageGlyphAttributeName_LAYOUT.byteSize()) }
private val NSAdaptiveImageGlyphAttributeName_VH: VarHandle by lazy { NSAdaptiveImageGlyphAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSAdaptiveImageGlyphAttributeName: MemorySegment
    get() = NSAdaptiveImageGlyphAttributeName_VH.get(NSAdaptiveImageGlyphAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSAdaptiveImageGlyphAttributeName_VH.set(NSAdaptiveImageGlyphAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWritingToolsExclusionAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSWritingToolsExclusionAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWritingToolsExclusionAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSWritingToolsExclusionAttributeName").orElseThrow().reinterpret(NSWritingToolsExclusionAttributeName_LAYOUT.byteSize()) }
private val NSWritingToolsExclusionAttributeName_VH: VarHandle by lazy { NSWritingToolsExclusionAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 4, introducedSubminor = -1)
var NSWritingToolsExclusionAttributeName: MemorySegment
    get() = NSWritingToolsExclusionAttributeName_VH.get(NSWritingToolsExclusionAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSWritingToolsExclusionAttributeName_VH.set(NSWritingToolsExclusionAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextEffectLetterpressStyle typedef const NSTextEffectStyle = (Void)*
 */
private val NSTextEffectLetterpressStyle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextEffectLetterpressStyle_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextEffectLetterpressStyle").orElseThrow().reinterpret(NSTextEffectLetterpressStyle_LAYOUT.byteSize()) }
private val NSTextEffectLetterpressStyle_VH: VarHandle by lazy { NSTextEffectLetterpressStyle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextEffectLetterpressStyle: MemorySegment
    get() = NSTextEffectLetterpressStyle_VH.get(NSTextEffectLetterpressStyle_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextEffectLetterpressStyle_VH.set(NSTextEffectLetterpressStyle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightStyleDefault typedef const NSTextHighlightStyle = (Void)*
 */
private val NSTextHighlightStyleDefault_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightStyleDefault_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightStyleDefault").orElseThrow().reinterpret(NSTextHighlightStyleDefault_LAYOUT.byteSize()) }
private val NSTextHighlightStyleDefault_VH: VarHandle by lazy { NSTextHighlightStyleDefault_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightStyleDefault: MemorySegment
    get() = NSTextHighlightStyleDefault_VH.get(NSTextHighlightStyleDefault_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightStyleDefault_VH.set(NSTextHighlightStyleDefault_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightColorSchemeDefault typedef const NSTextHighlightColorScheme = (Void)*
 */
private val NSTextHighlightColorSchemeDefault_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightColorSchemeDefault_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightColorSchemeDefault").orElseThrow().reinterpret(NSTextHighlightColorSchemeDefault_LAYOUT.byteSize()) }
private val NSTextHighlightColorSchemeDefault_VH: VarHandle by lazy { NSTextHighlightColorSchemeDefault_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightColorSchemeDefault: MemorySegment
    get() = NSTextHighlightColorSchemeDefault_VH.get(NSTextHighlightColorSchemeDefault_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightColorSchemeDefault_VH.set(NSTextHighlightColorSchemeDefault_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightColorSchemePurple typedef const NSTextHighlightColorScheme = (Void)*
 */
private val NSTextHighlightColorSchemePurple_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightColorSchemePurple_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightColorSchemePurple").orElseThrow().reinterpret(NSTextHighlightColorSchemePurple_LAYOUT.byteSize()) }
private val NSTextHighlightColorSchemePurple_VH: VarHandle by lazy { NSTextHighlightColorSchemePurple_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightColorSchemePurple: MemorySegment
    get() = NSTextHighlightColorSchemePurple_VH.get(NSTextHighlightColorSchemePurple_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightColorSchemePurple_VH.set(NSTextHighlightColorSchemePurple_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightColorSchemePink typedef const NSTextHighlightColorScheme = (Void)*
 */
private val NSTextHighlightColorSchemePink_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightColorSchemePink_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightColorSchemePink").orElseThrow().reinterpret(NSTextHighlightColorSchemePink_LAYOUT.byteSize()) }
private val NSTextHighlightColorSchemePink_VH: VarHandle by lazy { NSTextHighlightColorSchemePink_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightColorSchemePink: MemorySegment
    get() = NSTextHighlightColorSchemePink_VH.get(NSTextHighlightColorSchemePink_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightColorSchemePink_VH.set(NSTextHighlightColorSchemePink_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightColorSchemeOrange typedef const NSTextHighlightColorScheme = (Void)*
 */
private val NSTextHighlightColorSchemeOrange_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightColorSchemeOrange_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightColorSchemeOrange").orElseThrow().reinterpret(NSTextHighlightColorSchemeOrange_LAYOUT.byteSize()) }
private val NSTextHighlightColorSchemeOrange_VH: VarHandle by lazy { NSTextHighlightColorSchemeOrange_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightColorSchemeOrange: MemorySegment
    get() = NSTextHighlightColorSchemeOrange_VH.get(NSTextHighlightColorSchemeOrange_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightColorSchemeOrange_VH.set(NSTextHighlightColorSchemeOrange_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightColorSchemeMint typedef const NSTextHighlightColorScheme = (Void)*
 */
private val NSTextHighlightColorSchemeMint_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightColorSchemeMint_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightColorSchemeMint").orElseThrow().reinterpret(NSTextHighlightColorSchemeMint_LAYOUT.byteSize()) }
private val NSTextHighlightColorSchemeMint_VH: VarHandle by lazy { NSTextHighlightColorSchemeMint_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightColorSchemeMint: MemorySegment
    get() = NSTextHighlightColorSchemeMint_VH.get(NSTextHighlightColorSchemeMint_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightColorSchemeMint_VH.set(NSTextHighlightColorSchemeMint_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextHighlightColorSchemeBlue typedef const NSTextHighlightColorScheme = (Void)*
 */
private val NSTextHighlightColorSchemeBlue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextHighlightColorSchemeBlue_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextHighlightColorSchemeBlue").orElseThrow().reinterpret(NSTextHighlightColorSchemeBlue_LAYOUT.byteSize()) }
private val NSTextHighlightColorSchemeBlue_VH: VarHandle by lazy { NSTextHighlightColorSchemeBlue_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextHighlightColorSchemeBlue: MemorySegment
    get() = NSTextHighlightColorSchemeBlue_VH.get(NSTextHighlightColorSchemeBlue_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextHighlightColorSchemeBlue_VH.set(NSTextHighlightColorSchemeBlue_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPlainTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSPlainTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPlainTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPlainTextDocumentType").orElseThrow().reinterpret(NSPlainTextDocumentType_LAYOUT.byteSize()) }
private val NSPlainTextDocumentType_VH: VarHandle by lazy { NSPlainTextDocumentType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSPlainTextDocumentType: MemorySegment
    get() = NSPlainTextDocumentType_VH.get(NSPlainTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSPlainTextDocumentType_VH.set(NSPlainTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRTFTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSRTFTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRTFTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSRTFTextDocumentType").orElseThrow().reinterpret(NSRTFTextDocumentType_LAYOUT.byteSize()) }
private val NSRTFTextDocumentType_VH: VarHandle by lazy { NSRTFTextDocumentType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSRTFTextDocumentType: MemorySegment
    get() = NSRTFTextDocumentType_VH.get(NSRTFTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSRTFTextDocumentType_VH.set(NSRTFTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRTFDTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSRTFDTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRTFDTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSRTFDTextDocumentType").orElseThrow().reinterpret(NSRTFDTextDocumentType_LAYOUT.byteSize()) }
private val NSRTFDTextDocumentType_VH: VarHandle by lazy { NSRTFDTextDocumentType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSRTFDTextDocumentType: MemorySegment
    get() = NSRTFDTextDocumentType_VH.get(NSRTFDTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSRTFDTextDocumentType_VH.set(NSRTFDTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTMLTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSHTMLTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTMLTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSHTMLTextDocumentType").orElseThrow().reinterpret(NSHTMLTextDocumentType_LAYOUT.byteSize()) }
private val NSHTMLTextDocumentType_VH: VarHandle by lazy { NSHTMLTextDocumentType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSHTMLTextDocumentType: MemorySegment
    get() = NSHTMLTextDocumentType_VH.get(NSHTMLTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTMLTextDocumentType_VH.set(NSHTMLTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextLayoutSectionOrientation typedef NSTextLayoutSectionKey = typedef NSString = (Void)*
 */
private val NSTextLayoutSectionOrientation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextLayoutSectionOrientation_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextLayoutSectionOrientation").orElseThrow().reinterpret(NSTextLayoutSectionOrientation_LAYOUT.byteSize()) }
private val NSTextLayoutSectionOrientation_VH: VarHandle by lazy { NSTextLayoutSectionOrientation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextLayoutSectionOrientation: MemorySegment
    get() = NSTextLayoutSectionOrientation_VH.get(NSTextLayoutSectionOrientation_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextLayoutSectionOrientation_VH.set(NSTextLayoutSectionOrientation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextLayoutSectionRange typedef NSTextLayoutSectionKey = typedef NSString = (Void)*
 */
private val NSTextLayoutSectionRange_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextLayoutSectionRange_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextLayoutSectionRange").orElseThrow().reinterpret(NSTextLayoutSectionRange_LAYOUT.byteSize()) }
private val NSTextLayoutSectionRange_VH: VarHandle by lazy { NSTextLayoutSectionRange_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextLayoutSectionRange: MemorySegment
    get() = NSTextLayoutSectionRange_VH.get(NSTextLayoutSectionRange_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextLayoutSectionRange_VH.set(NSTextLayoutSectionRange_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDocumentTypeDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSDocumentTypeDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDocumentTypeDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDocumentTypeDocumentAttribute").orElseThrow().reinterpret(NSDocumentTypeDocumentAttribute_LAYOUT.byteSize()) }
private val NSDocumentTypeDocumentAttribute_VH: VarHandle by lazy { NSDocumentTypeDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSDocumentTypeDocumentAttribute: MemorySegment
    get() = NSDocumentTypeDocumentAttribute_VH.get(NSDocumentTypeDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSDocumentTypeDocumentAttribute_VH.set(NSDocumentTypeDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCharacterEncodingDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSCharacterEncodingDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCharacterEncodingDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCharacterEncodingDocumentAttribute").orElseThrow().reinterpret(NSCharacterEncodingDocumentAttribute_LAYOUT.byteSize()) }
private val NSCharacterEncodingDocumentAttribute_VH: VarHandle by lazy { NSCharacterEncodingDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSCharacterEncodingDocumentAttribute: MemorySegment
    get() = NSCharacterEncodingDocumentAttribute_VH.get(NSCharacterEncodingDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSCharacterEncodingDocumentAttribute_VH.set(NSCharacterEncodingDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDefaultAttributesDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSDefaultAttributesDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDefaultAttributesDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDefaultAttributesDocumentAttribute").orElseThrow().reinterpret(NSDefaultAttributesDocumentAttribute_LAYOUT.byteSize()) }
private val NSDefaultAttributesDocumentAttribute_VH: VarHandle by lazy { NSDefaultAttributesDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSDefaultAttributesDocumentAttribute: MemorySegment
    get() = NSDefaultAttributesDocumentAttribute_VH.get(NSDefaultAttributesDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSDefaultAttributesDocumentAttribute_VH.set(NSDefaultAttributesDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPaperSizeDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSPaperSizeDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPaperSizeDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPaperSizeDocumentAttribute").orElseThrow().reinterpret(NSPaperSizeDocumentAttribute_LAYOUT.byteSize()) }
private val NSPaperSizeDocumentAttribute_VH: VarHandle by lazy { NSPaperSizeDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSPaperSizeDocumentAttribute: MemorySegment
    get() = NSPaperSizeDocumentAttribute_VH.get(NSPaperSizeDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSPaperSizeDocumentAttribute_VH.set(NSPaperSizeDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSViewSizeDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSViewSizeDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewSizeDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSViewSizeDocumentAttribute").orElseThrow().reinterpret(NSViewSizeDocumentAttribute_LAYOUT.byteSize()) }
private val NSViewSizeDocumentAttribute_VH: VarHandle by lazy { NSViewSizeDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSViewSizeDocumentAttribute: MemorySegment
    get() = NSViewSizeDocumentAttribute_VH.get(NSViewSizeDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSViewSizeDocumentAttribute_VH.set(NSViewSizeDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSViewZoomDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSViewZoomDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewZoomDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSViewZoomDocumentAttribute").orElseThrow().reinterpret(NSViewZoomDocumentAttribute_LAYOUT.byteSize()) }
private val NSViewZoomDocumentAttribute_VH: VarHandle by lazy { NSViewZoomDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSViewZoomDocumentAttribute: MemorySegment
    get() = NSViewZoomDocumentAttribute_VH.get(NSViewZoomDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSViewZoomDocumentAttribute_VH.set(NSViewZoomDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSViewModeDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSViewModeDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSViewModeDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSViewModeDocumentAttribute").orElseThrow().reinterpret(NSViewModeDocumentAttribute_LAYOUT.byteSize()) }
private val NSViewModeDocumentAttribute_VH: VarHandle by lazy { NSViewModeDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSViewModeDocumentAttribute: MemorySegment
    get() = NSViewModeDocumentAttribute_VH.get(NSViewModeDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSViewModeDocumentAttribute_VH.set(NSViewModeDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDefaultFontExcludedDocumentAttribute typedef const NSAttributedStringDocumentAttributeKey = (Void)*
 */
private val NSDefaultFontExcludedDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDefaultFontExcludedDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDefaultFontExcludedDocumentAttribute").orElseThrow().reinterpret(NSDefaultFontExcludedDocumentAttribute_LAYOUT.byteSize()) }
private val NSDefaultFontExcludedDocumentAttribute_VH: VarHandle by lazy { NSDefaultFontExcludedDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSDefaultFontExcludedDocumentAttribute: MemorySegment
    get() = NSDefaultFontExcludedDocumentAttribute_VH.get(NSDefaultFontExcludedDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSDefaultFontExcludedDocumentAttribute_VH.set(NSDefaultFontExcludedDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSReadOnlyDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSReadOnlyDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSReadOnlyDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSReadOnlyDocumentAttribute").orElseThrow().reinterpret(NSReadOnlyDocumentAttribute_LAYOUT.byteSize()) }
private val NSReadOnlyDocumentAttribute_VH: VarHandle by lazy { NSReadOnlyDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSReadOnlyDocumentAttribute: MemorySegment
    get() = NSReadOnlyDocumentAttribute_VH.get(NSReadOnlyDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSReadOnlyDocumentAttribute_VH.set(NSReadOnlyDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBackgroundColorDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSBackgroundColorDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBackgroundColorDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSBackgroundColorDocumentAttribute").orElseThrow().reinterpret(NSBackgroundColorDocumentAttribute_LAYOUT.byteSize()) }
private val NSBackgroundColorDocumentAttribute_VH: VarHandle by lazy { NSBackgroundColorDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSBackgroundColorDocumentAttribute: MemorySegment
    get() = NSBackgroundColorDocumentAttribute_VH.get(NSBackgroundColorDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSBackgroundColorDocumentAttribute_VH.set(NSBackgroundColorDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHyphenationFactorDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSHyphenationFactorDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHyphenationFactorDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSHyphenationFactorDocumentAttribute").orElseThrow().reinterpret(NSHyphenationFactorDocumentAttribute_LAYOUT.byteSize()) }
private val NSHyphenationFactorDocumentAttribute_VH: VarHandle by lazy { NSHyphenationFactorDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSHyphenationFactorDocumentAttribute: MemorySegment
    get() = NSHyphenationFactorDocumentAttribute_VH.get(NSHyphenationFactorDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSHyphenationFactorDocumentAttribute_VH.set(NSHyphenationFactorDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDefaultTabIntervalDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSDefaultTabIntervalDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDefaultTabIntervalDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDefaultTabIntervalDocumentAttribute").orElseThrow().reinterpret(NSDefaultTabIntervalDocumentAttribute_LAYOUT.byteSize()) }
private val NSDefaultTabIntervalDocumentAttribute_VH: VarHandle by lazy { NSDefaultTabIntervalDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSDefaultTabIntervalDocumentAttribute: MemorySegment
    get() = NSDefaultTabIntervalDocumentAttribute_VH.get(NSDefaultTabIntervalDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSDefaultTabIntervalDocumentAttribute_VH.set(NSDefaultTabIntervalDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextLayoutSectionsAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSTextLayoutSectionsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextLayoutSectionsAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextLayoutSectionsAttribute").orElseThrow().reinterpret(NSTextLayoutSectionsAttribute_LAYOUT.byteSize()) }
private val NSTextLayoutSectionsAttribute_VH: VarHandle by lazy { NSTextLayoutSectionsAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextLayoutSectionsAttribute: MemorySegment
    get() = NSTextLayoutSectionsAttribute_VH.get(NSTextLayoutSectionsAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextLayoutSectionsAttribute_VH.set(NSTextLayoutSectionsAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextScalingDocumentAttribute typedef const NSAttributedStringDocumentAttributeKey = (Void)*
 */
private val NSTextScalingDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextScalingDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextScalingDocumentAttribute").orElseThrow().reinterpret(NSTextScalingDocumentAttribute_LAYOUT.byteSize()) }
private val NSTextScalingDocumentAttribute_VH: VarHandle by lazy { NSTextScalingDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTextScalingDocumentAttribute: MemorySegment
    get() = NSTextScalingDocumentAttribute_VH.get(NSTextScalingDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextScalingDocumentAttribute_VH.set(NSTextScalingDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSourceTextScalingDocumentAttribute typedef const NSAttributedStringDocumentAttributeKey = (Void)*
 */
private val NSSourceTextScalingDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSourceTextScalingDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSourceTextScalingDocumentAttribute").orElseThrow().reinterpret(NSSourceTextScalingDocumentAttribute_LAYOUT.byteSize()) }
private val NSSourceTextScalingDocumentAttribute_VH: VarHandle by lazy { NSSourceTextScalingDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSSourceTextScalingDocumentAttribute: MemorySegment
    get() = NSSourceTextScalingDocumentAttribute_VH.get(NSSourceTextScalingDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSSourceTextScalingDocumentAttribute_VH.set(NSSourceTextScalingDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCocoaVersionDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSCocoaVersionDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCocoaVersionDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCocoaVersionDocumentAttribute").orElseThrow().reinterpret(NSCocoaVersionDocumentAttribute_LAYOUT.byteSize()) }
private val NSCocoaVersionDocumentAttribute_VH: VarHandle by lazy { NSCocoaVersionDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSCocoaVersionDocumentAttribute: MemorySegment
    get() = NSCocoaVersionDocumentAttribute_VH.get(NSCocoaVersionDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSCocoaVersionDocumentAttribute_VH.set(NSCocoaVersionDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDocumentTypeDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSDocumentTypeDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDocumentTypeDocumentOption_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDocumentTypeDocumentOption").orElseThrow().reinterpret(NSDocumentTypeDocumentOption_LAYOUT.byteSize()) }
private val NSDocumentTypeDocumentOption_VH: VarHandle by lazy { NSDocumentTypeDocumentOption_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSDocumentTypeDocumentOption: MemorySegment
    get() = NSDocumentTypeDocumentOption_VH.get(NSDocumentTypeDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSDocumentTypeDocumentOption_VH.set(NSDocumentTypeDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDefaultAttributesDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSDefaultAttributesDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDefaultAttributesDocumentOption_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDefaultAttributesDocumentOption").orElseThrow().reinterpret(NSDefaultAttributesDocumentOption_LAYOUT.byteSize()) }
private val NSDefaultAttributesDocumentOption_VH: VarHandle by lazy { NSDefaultAttributesDocumentOption_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSDefaultAttributesDocumentOption: MemorySegment
    get() = NSDefaultAttributesDocumentOption_VH.get(NSDefaultAttributesDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSDefaultAttributesDocumentOption_VH.set(NSDefaultAttributesDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCharacterEncodingDocumentOption typedef NSAttributedStringDocumentReadingOptionKey = typedef NSString = (Void)*
 */
private val NSCharacterEncodingDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCharacterEncodingDocumentOption_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCharacterEncodingDocumentOption").orElseThrow().reinterpret(NSCharacterEncodingDocumentOption_LAYOUT.byteSize()) }
private val NSCharacterEncodingDocumentOption_VH: VarHandle by lazy { NSCharacterEncodingDocumentOption_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSCharacterEncodingDocumentOption: MemorySegment
    get() = NSCharacterEncodingDocumentOption_VH.get(NSCharacterEncodingDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSCharacterEncodingDocumentOption_VH.set(NSCharacterEncodingDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTargetTextScalingDocumentOption typedef const NSAttributedStringDocumentReadingOptionKey = (Void)*
 */
private val NSTargetTextScalingDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTargetTextScalingDocumentOption_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTargetTextScalingDocumentOption").orElseThrow().reinterpret(NSTargetTextScalingDocumentOption_LAYOUT.byteSize()) }
private val NSTargetTextScalingDocumentOption_VH: VarHandle by lazy { NSTargetTextScalingDocumentOption_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSTargetTextScalingDocumentOption: MemorySegment
    get() = NSTargetTextScalingDocumentOption_VH.get(NSTargetTextScalingDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSTargetTextScalingDocumentOption_VH.set(NSTargetTextScalingDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSourceTextScalingDocumentOption typedef const NSAttributedStringDocumentReadingOptionKey = (Void)*
 */
private val NSSourceTextScalingDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSourceTextScalingDocumentOption_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSourceTextScalingDocumentOption").orElseThrow().reinterpret(NSSourceTextScalingDocumentOption_LAYOUT.byteSize()) }
private val NSSourceTextScalingDocumentOption_VH: VarHandle by lazy { NSSourceTextScalingDocumentOption_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var NSSourceTextScalingDocumentOption: MemorySegment
    get() = NSSourceTextScalingDocumentOption_VH.get(NSSourceTextScalingDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSSourceTextScalingDocumentOption_VH.set(NSSourceTextScalingDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextKit1ListMarkerFormatDocumentOption typedef const NSAttributedStringDocumentReadingOptionKey = (Void)*
 */
private val NSTextKit1ListMarkerFormatDocumentOption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextKit1ListMarkerFormatDocumentOption_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextKit1ListMarkerFormatDocumentOption").orElseThrow().reinterpret(NSTextKit1ListMarkerFormatDocumentOption_LAYOUT.byteSize()) }
private val NSTextKit1ListMarkerFormatDocumentOption_VH: VarHandle by lazy { NSTextKit1ListMarkerFormatDocumentOption_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextKit1ListMarkerFormatDocumentOption: MemorySegment
    get() = NSTextKit1ListMarkerFormatDocumentOption_VH.get(NSTextKit1ListMarkerFormatDocumentOption_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextKit1ListMarkerFormatDocumentOption_VH.set(NSTextKit1ListMarkerFormatDocumentOption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCursorAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSCursorAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCursorAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCursorAttributeName").orElseThrow().reinterpret(NSCursorAttributeName_LAYOUT.byteSize()) }
private val NSCursorAttributeName_VH: VarHandle by lazy { NSCursorAttributeName_LAYOUT.varHandle() }

var NSCursorAttributeName: MemorySegment
    get() = NSCursorAttributeName_VH.get(NSCursorAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSCursorAttributeName_VH.set(NSCursorAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSToolTipAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSToolTipAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSToolTipAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSToolTipAttributeName").orElseThrow().reinterpret(NSToolTipAttributeName_LAYOUT.byteSize()) }
private val NSToolTipAttributeName_VH: VarHandle by lazy { NSToolTipAttributeName_LAYOUT.varHandle() }

var NSToolTipAttributeName: MemorySegment
    get() = NSToolTipAttributeName_VH.get(NSToolTipAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSToolTipAttributeName_VH.set(NSToolTipAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMarkedClauseSegmentAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSMarkedClauseSegmentAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMarkedClauseSegmentAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMarkedClauseSegmentAttributeName").orElseThrow().reinterpret(NSMarkedClauseSegmentAttributeName_LAYOUT.byteSize()) }
private val NSMarkedClauseSegmentAttributeName_VH: VarHandle by lazy { NSMarkedClauseSegmentAttributeName_LAYOUT.varHandle() }

var NSMarkedClauseSegmentAttributeName: MemorySegment
    get() = NSMarkedClauseSegmentAttributeName_VH.get(NSMarkedClauseSegmentAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSMarkedClauseSegmentAttributeName_VH.set(NSMarkedClauseSegmentAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextAlternativesAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSTextAlternativesAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextAlternativesAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextAlternativesAttributeName").orElseThrow().reinterpret(NSTextAlternativesAttributeName_LAYOUT.byteSize()) }
private val NSTextAlternativesAttributeName_VH: VarHandle by lazy { NSTextAlternativesAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var NSTextAlternativesAttributeName: MemorySegment
    get() = NSTextAlternativesAttributeName_VH.get(NSTextAlternativesAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextAlternativesAttributeName_VH.set(NSTextAlternativesAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSpellingStateAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSSpellingStateAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSpellingStateAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSpellingStateAttributeName").orElseThrow().reinterpret(NSSpellingStateAttributeName_LAYOUT.byteSize()) }
private val NSSpellingStateAttributeName_VH: VarHandle by lazy { NSSpellingStateAttributeName_LAYOUT.varHandle() }

var NSSpellingStateAttributeName: MemorySegment
    get() = NSSpellingStateAttributeName_VH.get(NSSpellingStateAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSSpellingStateAttributeName_VH.set(NSSpellingStateAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSuperscriptAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSSuperscriptAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSuperscriptAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSuperscriptAttributeName").orElseThrow().reinterpret(NSSuperscriptAttributeName_LAYOUT.byteSize()) }
private val NSSuperscriptAttributeName_VH: VarHandle by lazy { NSSuperscriptAttributeName_LAYOUT.varHandle() }

var NSSuperscriptAttributeName: MemorySegment
    get() = NSSuperscriptAttributeName_VH.get(NSSuperscriptAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSSuperscriptAttributeName_VH.set(NSSuperscriptAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSGlyphInfoAttributeName typedef NSAttributedStringKey = typedef NSString = (Void)*
 */
private val NSGlyphInfoAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGlyphInfoAttributeName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSGlyphInfoAttributeName").orElseThrow().reinterpret(NSGlyphInfoAttributeName_LAYOUT.byteSize()) }
private val NSGlyphInfoAttributeName_VH: VarHandle by lazy { NSGlyphInfoAttributeName_LAYOUT.varHandle() }

var NSGlyphInfoAttributeName: MemorySegment
    get() = NSGlyphInfoAttributeName_VH.get(NSGlyphInfoAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSGlyphInfoAttributeName_VH.set(NSGlyphInfoAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMacSimpleTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSMacSimpleTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMacSimpleTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMacSimpleTextDocumentType").orElseThrow().reinterpret(NSMacSimpleTextDocumentType_LAYOUT.byteSize()) }
private val NSMacSimpleTextDocumentType_VH: VarHandle by lazy { NSMacSimpleTextDocumentType_LAYOUT.varHandle() }

var NSMacSimpleTextDocumentType: MemorySegment
    get() = NSMacSimpleTextDocumentType_VH.get(NSMacSimpleTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSMacSimpleTextDocumentType_VH.set(NSMacSimpleTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDocFormatTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSDocFormatTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDocFormatTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDocFormatTextDocumentType").orElseThrow().reinterpret(NSDocFormatTextDocumentType_LAYOUT.byteSize()) }
private val NSDocFormatTextDocumentType_VH: VarHandle by lazy { NSDocFormatTextDocumentType_LAYOUT.varHandle() }

var NSDocFormatTextDocumentType: MemorySegment
    get() = NSDocFormatTextDocumentType_VH.get(NSDocFormatTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSDocFormatTextDocumentType_VH.set(NSDocFormatTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWordMLTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSWordMLTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWordMLTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSWordMLTextDocumentType").orElseThrow().reinterpret(NSWordMLTextDocumentType_LAYOUT.byteSize()) }
private val NSWordMLTextDocumentType_VH: VarHandle by lazy { NSWordMLTextDocumentType_LAYOUT.varHandle() }

var NSWordMLTextDocumentType: MemorySegment
    get() = NSWordMLTextDocumentType_VH.get(NSWordMLTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSWordMLTextDocumentType_VH.set(NSWordMLTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWebArchiveTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSWebArchiveTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWebArchiveTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSWebArchiveTextDocumentType").orElseThrow().reinterpret(NSWebArchiveTextDocumentType_LAYOUT.byteSize()) }
private val NSWebArchiveTextDocumentType_VH: VarHandle by lazy { NSWebArchiveTextDocumentType_LAYOUT.varHandle() }

var NSWebArchiveTextDocumentType: MemorySegment
    get() = NSWebArchiveTextDocumentType_VH.get(NSWebArchiveTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSWebArchiveTextDocumentType_VH.set(NSWebArchiveTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOfficeOpenXMLTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSOfficeOpenXMLTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOfficeOpenXMLTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSOfficeOpenXMLTextDocumentType").orElseThrow().reinterpret(NSOfficeOpenXMLTextDocumentType_LAYOUT.byteSize()) }
private val NSOfficeOpenXMLTextDocumentType_VH: VarHandle by lazy { NSOfficeOpenXMLTextDocumentType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSOfficeOpenXMLTextDocumentType: MemorySegment
    get() = NSOfficeOpenXMLTextDocumentType_VH.get(NSOfficeOpenXMLTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSOfficeOpenXMLTextDocumentType_VH.set(NSOfficeOpenXMLTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOpenDocumentTextDocumentType typedef NSAttributedStringDocumentType = typedef NSString = (Void)*
 */
private val NSOpenDocumentTextDocumentType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOpenDocumentTextDocumentType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSOpenDocumentTextDocumentType").orElseThrow().reinterpret(NSOpenDocumentTextDocumentType_LAYOUT.byteSize()) }
private val NSOpenDocumentTextDocumentType_VH: VarHandle by lazy { NSOpenDocumentTextDocumentType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var NSOpenDocumentTextDocumentType: MemorySegment
    get() = NSOpenDocumentTextDocumentType_VH.get(NSOpenDocumentTextDocumentType_SEGMENT, 0L) as MemorySegment
    set(value) = NSOpenDocumentTextDocumentType_VH.set(NSOpenDocumentTextDocumentType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSConvertedDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSConvertedDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSConvertedDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSConvertedDocumentAttribute").orElseThrow().reinterpret(NSConvertedDocumentAttribute_LAYOUT.byteSize()) }
private val NSConvertedDocumentAttribute_VH: VarHandle by lazy { NSConvertedDocumentAttribute_LAYOUT.varHandle() }

var NSConvertedDocumentAttribute: MemorySegment
    get() = NSConvertedDocumentAttribute_VH.get(NSConvertedDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSConvertedDocumentAttribute_VH.set(NSConvertedDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileTypeDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSFileTypeDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileTypeDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSFileTypeDocumentAttribute").orElseThrow().reinterpret(NSFileTypeDocumentAttribute_LAYOUT.byteSize()) }
private val NSFileTypeDocumentAttribute_VH: VarHandle by lazy { NSFileTypeDocumentAttribute_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSFileTypeDocumentAttribute: MemorySegment
    get() = NSFileTypeDocumentAttribute_VH.get(NSFileTypeDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileTypeDocumentAttribute_VH.set(NSFileTypeDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTitleDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSTitleDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTitleDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTitleDocumentAttribute").orElseThrow().reinterpret(NSTitleDocumentAttribute_LAYOUT.byteSize()) }
private val NSTitleDocumentAttribute_VH: VarHandle by lazy { NSTitleDocumentAttribute_LAYOUT.varHandle() }

var NSTitleDocumentAttribute: MemorySegment
    get() = NSTitleDocumentAttribute_VH.get(NSTitleDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSTitleDocumentAttribute_VH.set(NSTitleDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCompanyDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSCompanyDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCompanyDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCompanyDocumentAttribute").orElseThrow().reinterpret(NSCompanyDocumentAttribute_LAYOUT.byteSize()) }
private val NSCompanyDocumentAttribute_VH: VarHandle by lazy { NSCompanyDocumentAttribute_LAYOUT.varHandle() }

var NSCompanyDocumentAttribute: MemorySegment
    get() = NSCompanyDocumentAttribute_VH.get(NSCompanyDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSCompanyDocumentAttribute_VH.set(NSCompanyDocumentAttribute_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCopyrightDocumentAttribute typedef NSAttributedStringDocumentAttributeKey = typedef NSString = (Void)*
 */
private val NSCopyrightDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCopyrightDocumentAttribute_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCopyrightDocumentAttribute").orElseThrow().reinterpret(NSCopyrightDocumentAttribute_LAYOUT.byteSize()) }
private val NSCopyrightDocumentAttribute_VH: VarHandle by lazy { NSCopyrightDocumentAttribute_LAYOUT.varHandle() }

var NSCopyrightDocumentAttribute: MemorySegment
    get() = NSCopyrightDocumentAttribute_VH.get(NSCopyrightDocumentAttribute_SEGMENT, 0L) as MemorySegment
    set(value) = NSCopyrightDocumentAttribute_VH.set(NSCopyrightDocumentAttribute_SEGMENT, 0L, value)
