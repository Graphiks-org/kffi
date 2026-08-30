@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSplitViewItem
 * Superclass: NSObject
 * Protocols: NSAnimatablePropertyContainer, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSSplitViewItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSplitViewItem") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun splitViewItemWithViewController(viewController: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("splitViewItemWithViewController:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, viewController) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        fun sidebarWithViewController(viewController: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("sidebarWithViewController:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, viewController) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        fun contentListWithViewController(viewController: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("contentListWithViewController:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, viewController) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        fun inspectorWithViewController(viewController: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("inspectorWithViewController:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, viewController) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun addTopAlignedAccessoryViewController(childViewController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addTopAlignedAccessoryViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, childViewController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun insertTopAlignedAccessoryViewController_atIndex(childViewController: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertTopAlignedAccessoryViewController:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, childViewController, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun removeTopAlignedAccessoryViewControllerAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeTopAlignedAccessoryViewControllerAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun addBottomAlignedAccessoryViewController(childViewController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addBottomAlignedAccessoryViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, childViewController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun insertBottomAlignedAccessoryViewController_atIndex(childViewController: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertBottomAlignedAccessoryViewController:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, childViewController, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun removeBottomAlignedAccessoryViewControllerAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeBottomAlignedAccessoryViewControllerAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    // @property behavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun behavior(): NSSplitViewItemBehavior {
        val sel = ObjCRuntime.sel("behavior")
        return NSSplitViewItemBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property viewController
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun viewController(): MemorySegment {
        val sel = ObjCRuntime.sel("viewController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setViewController(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property collapsed
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isCollapsed(): Boolean {
        val sel = ObjCRuntime.sel("isCollapsed")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCollapsed(value: Boolean) {
        val sel = ObjCRuntime.sel("setCollapsed:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canCollapse
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canCollapse(): Boolean {
        val sel = ObjCRuntime.sel("canCollapse")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCanCollapse(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanCollapse:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property collapseBehavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun collapseBehavior(): NSSplitViewItemCollapseBehavior {
        val sel = ObjCRuntime.sel("collapseBehavior")
        return NSSplitViewItemCollapseBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setCollapseBehavior(value: NSSplitViewItemCollapseBehavior) {
        val sel = ObjCRuntime.sel("setCollapseBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property minimumThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun minimumThickness(): Double {
        val sel = ObjCRuntime.sel("minimumThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setMinimumThickness(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumThickness:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun maximumThickness(): Double {
        val sel = ObjCRuntime.sel("maximumThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setMaximumThickness(value: Double) {
        val sel = ObjCRuntime.sel("setMaximumThickness:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredThicknessFraction
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun preferredThicknessFraction(): Double {
        val sel = ObjCRuntime.sel("preferredThicknessFraction")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setPreferredThicknessFraction(value: Double) {
        val sel = ObjCRuntime.sel("setPreferredThicknessFraction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property holdingPriority
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun holdingPriority(): Float {
        val sel = ObjCRuntime.sel("holdingPriority")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHoldingPriority(value: Float) {
        val sel = ObjCRuntime.sel("setHoldingPriority:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property automaticMaximumThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun automaticMaximumThickness(): Double {
        val sel = ObjCRuntime.sel("automaticMaximumThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setAutomaticMaximumThickness(value: Double) {
        val sel = ObjCRuntime.sel("setAutomaticMaximumThickness:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property springLoaded
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun isSpringLoaded(): Boolean {
        val sel = ObjCRuntime.sel("isSpringLoaded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setSpringLoaded(value: Boolean) {
        val sel = ObjCRuntime.sel("setSpringLoaded:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canCollapseFromWindowResize
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun canCollapseFromWindowResize(): Boolean {
        val sel = ObjCRuntime.sel("canCollapseFromWindowResize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun setCanCollapseFromWindowResize(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanCollapseFromWindowResize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsFullHeightLayout
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun allowsFullHeightLayout(): Boolean {
        val sel = ObjCRuntime.sel("allowsFullHeightLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsFullHeightLayout(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsFullHeightLayout:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property titlebarSeparatorStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun titlebarSeparatorStyle(): NSTitlebarSeparatorStyle {
        val sel = ObjCRuntime.sel("titlebarSeparatorStyle")
        return NSTitlebarSeparatorStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setTitlebarSeparatorStyle(value: NSTitlebarSeparatorStyle) {
        val sel = ObjCRuntime.sel("setTitlebarSeparatorStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property automaticallyAdjustsSafeAreaInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun automaticallyAdjustsSafeAreaInsets(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyAdjustsSafeAreaInsets")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setAutomaticallyAdjustsSafeAreaInsets(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticallyAdjustsSafeAreaInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property topAlignedAccessoryViewControllers
    /** @return NSArray<NSSplitViewItemAccessoryViewController *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun topAlignedAccessoryViewControllers(): MemorySegment {
        val sel = ObjCRuntime.sel("topAlignedAccessoryViewControllers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setTopAlignedAccessoryViewControllers(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTopAlignedAccessoryViewControllers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bottomAlignedAccessoryViewControllers
    /** @return NSArray<NSSplitViewItemAccessoryViewController *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun bottomAlignedAccessoryViewControllers(): MemorySegment {
        val sel = ObjCRuntime.sel("bottomAlignedAccessoryViewControllers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setBottomAlignedAccessoryViewControllers(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBottomAlignedAccessoryViewControllers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/**
 * Required by Objective-C protocol NSAnimatablePropertyContainer.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSSplitViewItem.animations(): MemorySegment {
    val sel = ObjCRuntime.sel("animations")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSSplitViewItem.setAnimations(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAnimations:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSSplitViewItem.animator(): MemorySegment {
    val sel = ObjCRuntime.sel("animator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSSplitViewItem.animationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("animationForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSSplitViewItem_defaultAnimationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("defaultAnimationForKey:")
    val cls = ObjCRuntime.getClass("NSSplitViewItem")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, key) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSSplitViewItem.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSSplitViewItem.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
