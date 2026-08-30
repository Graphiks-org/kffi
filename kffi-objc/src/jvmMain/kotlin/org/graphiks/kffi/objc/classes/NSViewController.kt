@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSViewController
 * Superclass: NSResponder
 * Protocols: NSEditor, NSSeguePerforming, NSUserInterfaceItemIdentification
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSViewController(override val ptr: MemorySegment) : NSResponder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSViewController") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithNibName_bundle(nibNameOrNil: MemorySegment, nibBundleOrNil: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithNibName:bundle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, nibNameOrNil, nibBundleOrNil) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun loadView(): Unit {
        val sel = ObjCRuntime.sel("loadView")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun loadViewIfNeeded(): Unit {
        val sel = ObjCRuntime.sel("loadViewIfNeeded")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: MemorySegment, didCommitSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("commitEditingWithDelegate:didCommitSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, delegate, didCommitSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun commitEditing(): Boolean {
        val sel = ObjCRuntime.sel("commitEditing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun discardEditing(): Unit {
        val sel = ObjCRuntime.sel("discardEditing")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun viewDidLoad(): Unit {
        val sel = ObjCRuntime.sel("viewDidLoad")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun viewWillAppear(): Unit {
        val sel = ObjCRuntime.sel("viewWillAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun viewDidAppear(): Unit {
        val sel = ObjCRuntime.sel("viewDidAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun viewWillDisappear(): Unit {
        val sel = ObjCRuntime.sel("viewWillDisappear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun viewDidDisappear(): Unit {
        val sel = ObjCRuntime.sel("viewDidDisappear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun updateViewConstraints(): Unit {
        val sel = ObjCRuntime.sel("updateViewConstraints")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun viewWillLayout(): Unit {
        val sel = ObjCRuntime.sel("viewWillLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun viewDidLayout(): Unit {
        val sel = ObjCRuntime.sel("viewDidLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property nibName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun nibName(): MemorySegment {
        val sel = ObjCRuntime.sel("nibName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property nibBundle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun nibBundle(): MemorySegment {
        val sel = ObjCRuntime.sel("nibBundle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property representedObject
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun representedObject(): MemorySegment {
        val sel = ObjCRuntime.sel("representedObject")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRepresentedObject(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRepresentedObject:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property title
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle(value: String) = setTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property view
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property viewIfLoaded
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun viewIfLoaded(): MemorySegment {
        val sel = ObjCRuntime.sel("viewIfLoaded")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property viewLoaded
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun isViewLoaded(): Boolean {
        val sel = ObjCRuntime.sel("isViewLoaded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property preferredContentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun preferredContentSize(): NSSize {
        val sel = ObjCRuntime.sel("preferredContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setPreferredContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setPreferredContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

}

/**
 * Required by Objective-C protocol NSUserInterfaceItemIdentification.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSViewController.identifier(): MemorySegment {
    val sel = ObjCRuntime.sel("identifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSViewController.setIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

// ── Category: NSViewControllerPresentation on NSViewController ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.presentViewController_animator(viewController: MemorySegment, animator: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("presentViewController:animator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController, animator)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.dismissViewController(viewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("dismissViewController:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.dismissController(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("dismissController:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSArray<__kindof NSViewController *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.presentedViewControllers(): MemorySegment {
    val sel = ObjCRuntime.sel("presentedViewControllers")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.presentingViewController(): MemorySegment {
    val sel = ObjCRuntime.sel("presentingViewController")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSViewControllerPresentationAndTransitionStyles on NSViewController ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.presentViewControllerAsSheet(viewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("presentViewControllerAsSheet:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.presentViewControllerAsModalWindow(viewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("presentViewControllerAsModalWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.presentViewController_asPopoverRelativeToRect_ofView_preferredEdge_behavior(viewController: MemorySegment, positioningRect: NSRect, positioningView: MemorySegment, preferredEdge: NSRectEdge, behavior: NSPopoverBehavior): Unit {
    val sel = ObjCRuntime.sel("presentViewController:asPopoverRelativeToRect:ofView:preferredEdge:behavior:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController, ObjCRuntime.ObjCStructArg(positioningRect.segment, NSRect.layout), positioningView, preferredEdge.rawValue, behavior.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSViewController.presentViewController_asPopoverRelativeToRect_ofView_preferredEdge_behavior_hasFullSizeContent(viewController: MemorySegment, positioningRect: NSRect, positioningView: MemorySegment, preferredEdge: NSRectEdge, behavior: NSPopoverBehavior, hasFullSizeContent: Boolean): Unit {
    val sel = ObjCRuntime.sel("presentViewController:asPopoverRelativeToRect:ofView:preferredEdge:behavior:hasFullSizeContent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController, ObjCRuntime.ObjCStructArg(positioningRect.segment, NSRect.layout), positioningView, preferredEdge.rawValue, behavior.rawValue, hasFullSizeContent)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.transitionFromViewController_toViewController_options_completionHandler(fromViewController: MemorySegment, toViewController: MemorySegment, options: NSViewControllerTransitionOptions, completion: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("transitionFromViewController:toViewController:options:completionHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fromViewController, toViewController, options.rawValue, completion)
}

// ── Category: NSViewControllerContainer on NSViewController ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.addChildViewController(childViewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addChildViewController:")
    ObjCRuntime.msgSend(null, this.ptr, sel, childViewController)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.removeFromParentViewController(): Unit {
    val sel = ObjCRuntime.sel("removeFromParentViewController")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.insertChildViewController_atIndex(childViewController: MemorySegment, index: Long): Unit {
    val sel = ObjCRuntime.sel("insertChildViewController:atIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, childViewController, index)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.removeChildViewControllerAtIndex(index: Long): Unit {
    val sel = ObjCRuntime.sel("removeChildViewControllerAtIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, index)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.preferredContentSizeDidChangeForViewController(viewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("preferredContentSizeDidChangeForViewController:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.viewWillTransitionToSize(newSize: NSSize): Unit {
    val sel = ObjCRuntime.sel("viewWillTransitionToSize:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(newSize.segment, NSSize.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.parentViewController(): MemorySegment {
    val sel = ObjCRuntime.sel("parentViewController")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<__kindof NSViewController *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.childViewControllers(): MemorySegment {
    val sel = ObjCRuntime.sel("childViewControllers")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.setChildViewControllers(childViewControllers: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setChildViewControllers:")
    ObjCRuntime.msgSend(null, this.ptr, sel, childViewControllers)
}

// ── Category: NSViewControllerStoryboardingMethods on NSViewController ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.storyboard(): MemorySegment {
    val sel = ObjCRuntime.sel("storyboard")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSExtensionAdditions on NSViewController ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.extensionContext(): MemorySegment {
    val sel = ObjCRuntime.sel("extensionContext")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.sourceItemView(): MemorySegment {
    val sel = ObjCRuntime.sel("sourceItemView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.setSourceItemView(sourceItemView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSourceItemView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sourceItemView)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.preferredScreenOrigin(): NSPoint {
    val sel = ObjCRuntime.sel("preferredScreenOrigin")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.setPreferredScreenOrigin(preferredScreenOrigin: NSPoint): Unit {
    val sel = ObjCRuntime.sel("setPreferredScreenOrigin:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(preferredScreenOrigin.segment, NSPoint.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.preferredMinimumSize(): NSSize {
    val sel = ObjCRuntime.sel("preferredMinimumSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSViewController.preferredMaximumSize(): NSSize {
    val sel = ObjCRuntime.sel("preferredMaximumSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}
