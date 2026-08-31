@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSToolbar
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
open class NSToolbar(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSToolbar") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithIdentifier(identifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun insertItemWithItemIdentifier_atIndex(itemIdentifier: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertItemWithItemIdentifier:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, itemIdentifier, index)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun removeItemAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeItemAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun removeItemWithItemIdentifier(itemIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeItemWithItemIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, itemIdentifier)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun runCustomizationPalette(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("runCustomizationPalette:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun validateVisibleItems(): Unit {
        val sel = ObjCRuntime.sel("validateVisibleItems")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property delegate
    /** @return id<NSToolbarDelegate> */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property visible
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun isVisible(): Boolean {
        val sel = ObjCRuntime.sel("isVisible")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setVisible(value: Boolean) {
        val sel = ObjCRuntime.sel("setVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property customizationPaletteIsRunning
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun customizationPaletteIsRunning(): Boolean {
        val sel = ObjCRuntime.sel("customizationPaletteIsRunning")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property displayMode
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun displayMode(): NSToolbarDisplayMode {
        val sel = ObjCRuntime.sel("displayMode")
        return NSToolbarDisplayMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setDisplayMode(value: NSToolbarDisplayMode) {
        val sel = ObjCRuntime.sel("setDisplayMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property selectedItemIdentifier
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun selectedItemIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedItemIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setSelectedItemIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectedItemIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsUserCustomization
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun allowsUserCustomization(): Boolean {
        val sel = ObjCRuntime.sel("allowsUserCustomization")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsUserCustomization(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsUserCustomization:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsDisplayModeCustomization
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun allowsDisplayModeCustomization(): Boolean {
        val sel = ObjCRuntime.sel("allowsDisplayModeCustomization")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsDisplayModeCustomization(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsDisplayModeCustomization:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property identifier
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun identifier(): MemorySegment {
        val sel = ObjCRuntime.sel("identifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property items
    /** @return NSArray<__kindof NSToolbarItem *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun items(): MemorySegment {
        val sel = ObjCRuntime.sel("items")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property visibleItems
    /** @return NSArray<__kindof NSToolbarItem *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun visibleItems(): MemorySegment {
        val sel = ObjCRuntime.sel("visibleItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property itemIdentifiers
    /** @return NSArray<NSToolbarItemIdentifier> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun itemIdentifiers(): MemorySegment {
        val sel = ObjCRuntime.sel("itemIdentifiers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun setItemIdentifiers(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setItemIdentifiers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property centeredItemIdentifiers
    /** @return NSSet<NSToolbarItemIdentifier> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun centeredItemIdentifiers(): MemorySegment {
        val sel = ObjCRuntime.sel("centeredItemIdentifiers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setCenteredItemIdentifiers(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCenteredItemIdentifiers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autosavesConfiguration
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun autosavesConfiguration(): Boolean {
        val sel = ObjCRuntime.sel("autosavesConfiguration")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setAutosavesConfiguration(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutosavesConfiguration:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsExtensionItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun allowsExtensionItems(): Boolean {
        val sel = ObjCRuntime.sel("allowsExtensionItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setAllowsExtensionItems(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsExtensionItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSDeprecated on NSToolbar ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -setItemIdentifiers: and -setDisplayMode: instead.")
fun NSToolbar.setConfigurationFromDictionary(configDict: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setConfigurationFromDictionary:")
    ObjCRuntime.msgSend(null, this.ptr, sel, configDict)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "NSToolbarSizeMode is no longer recommended and will be ignored in the future")
fun NSToolbar.sizeMode(): NSToolbarSizeMode {
    val sel = ObjCRuntime.sel("sizeMode")
    return NSToolbarSizeMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "NSToolbarSizeMode is no longer recommended and will be ignored in the future")
fun NSToolbar.setSizeMode(sizeMode: NSToolbarSizeMode): Unit {
    val sel = ObjCRuntime.sel("setSizeMode:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sizeMode.rawValue)
}

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use the centeredItemIdentifiers property instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use the centeredItemIdentifiers property instead")
fun NSToolbar.centeredItemIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("centeredItemIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use the centeredItemIdentifiers property instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use the centeredItemIdentifiers property instead")
fun NSToolbar.setCenteredItemIdentifier(centeredItemIdentifier: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setCenteredItemIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, centeredItemIdentifier)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSTitlebarAccessoryViewController with NSWindow instead")
fun NSToolbar.fullScreenAccessoryView(): MemorySegment {
    val sel = ObjCRuntime.sel("fullScreenAccessoryView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSTitlebarAccessoryViewController with NSWindow instead")
fun NSToolbar.setFullScreenAccessoryView(fullScreenAccessoryView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setFullScreenAccessoryView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fullScreenAccessoryView)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSTitlebarAccessoryViewController and its fullScreenMinHeight property with NSWindow instead.")
fun NSToolbar.fullScreenAccessoryViewMinHeight(): Double {
    val sel = ObjCRuntime.sel("fullScreenAccessoryViewMinHeight")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSTitlebarAccessoryViewController and its fullScreenMinHeight property with NSWindow instead.")
fun NSToolbar.setFullScreenAccessoryViewMinHeight(fullScreenAccessoryViewMinHeight: Double): Unit {
    val sel = ObjCRuntime.sel("setFullScreenAccessoryViewMinHeight:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fullScreenAccessoryViewMinHeight)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSTitlebarAccessoryViewController with NSWindow instead. The max height of a titlebar accessory is implied by its view's height.")
fun NSToolbar.fullScreenAccessoryViewMaxHeight(): Double {
    val sel = ObjCRuntime.sel("fullScreenAccessoryViewMaxHeight")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSTitlebarAccessoryViewController with NSWindow instead. The max height of a titlebar accessory is implied by its view's height.")
fun NSToolbar.setFullScreenAccessoryViewMaxHeight(fullScreenAccessoryViewMaxHeight: Double): Unit {
    val sel = ObjCRuntime.sel("setFullScreenAccessoryViewMaxHeight:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fullScreenAccessoryViewMaxHeight)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
fun NSToolbar.showsBaselineSeparator(): Boolean {
    val sel = ObjCRuntime.sel("showsBaselineSeparator")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "No longer supported")
fun NSToolbar.setShowsBaselineSeparator(showsBaselineSeparator: Boolean): Unit {
    val sel = ObjCRuntime.sel("setShowsBaselineSeparator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, showsBaselineSeparator)
}

/** @return NSDictionary<NSString *,id> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -itemIdentifiers and -displayMode instead.")
fun NSToolbar.configurationDictionary(): MemorySegment {
    val sel = ObjCRuntime.sel("configurationDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
