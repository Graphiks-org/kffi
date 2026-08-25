package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSViewController
 * Superclass: NSResponder
 * Protocols: NSEditor, NSSeguePerforming, NSUserInterfaceItemIdentification
 */
open class NSViewController(override val ptr: MemorySegment) : NSResponder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSViewController") }

    }

    open fun initWithNibName_bundle(nibNameOrNil: MemorySegment, nibBundleOrNil: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithNibName:bundle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, nibNameOrNil, nibBundleOrNil) as MemorySegment
    }

    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun loadView(): Unit {
        val sel = ObjCRuntime.sel("loadView")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun loadViewIfNeeded(): Unit {
        val sel = ObjCRuntime.sel("loadViewIfNeeded")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: MemorySegment, didCommitSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("commitEditingWithDelegate:didCommitSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, delegate, didCommitSelector, contextInfo)
    }

    open fun commitEditing(): Boolean {
        val sel = ObjCRuntime.sel("commitEditing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun discardEditing(): Unit {
        val sel = ObjCRuntime.sel("discardEditing")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewDidLoad(): Unit {
        val sel = ObjCRuntime.sel("viewDidLoad")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewWillAppear(): Unit {
        val sel = ObjCRuntime.sel("viewWillAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewDidAppear(): Unit {
        val sel = ObjCRuntime.sel("viewDidAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewWillDisappear(): Unit {
        val sel = ObjCRuntime.sel("viewWillDisappear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewDidDisappear(): Unit {
        val sel = ObjCRuntime.sel("viewDidDisappear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun updateViewConstraints(): Unit {
        val sel = ObjCRuntime.sel("updateViewConstraints")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewWillLayout(): Unit {
        val sel = ObjCRuntime.sel("viewWillLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewDidLayout(): Unit {
        val sel = ObjCRuntime.sel("viewDidLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property nibName
    open fun nibName(): MemorySegment {
        val sel = ObjCRuntime.sel("nibName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property nibBundle
    open fun nibBundle(): MemorySegment {
        val sel = ObjCRuntime.sel("nibBundle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property representedObject
    open fun representedObject(): MemorySegment {
        val sel = ObjCRuntime.sel("representedObject")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setRepresentedObject(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRepresentedObject:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property title
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setTitle(value: String) = setTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property view
    open fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property viewIfLoaded
    open fun viewIfLoaded(): MemorySegment {
        val sel = ObjCRuntime.sel("viewIfLoaded")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property viewLoaded
    open fun isViewLoaded(): Boolean {
        val sel = ObjCRuntime.sel("isViewLoaded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property preferredContentSize
    open fun preferredContentSize(): NSSize {
        val sel = ObjCRuntime.sel("preferredContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setPreferredContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setPreferredContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

}

// ── Category: NSViewControllerPresentation on NSViewController ─────────────────────────────────────────

fun NSViewController.presentViewController_animator(viewController: MemorySegment, animator: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("presentViewController:animator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController, animator)
}

fun NSViewController.dismissViewController(viewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("dismissViewController:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController)
}

fun NSViewController.dismissController(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("dismissController:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSArray<__kindof NSViewController *> * */
fun NSViewController.presentedViewControllers(): MemorySegment {
    val sel = ObjCRuntime.sel("presentedViewControllers")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSViewController.presentingViewController(): MemorySegment {
    val sel = ObjCRuntime.sel("presentingViewController")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSViewControllerPresentationAndTransitionStyles on NSViewController ─────────────────────────────────────────

fun NSViewController.presentViewControllerAsSheet(viewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("presentViewControllerAsSheet:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController)
}

fun NSViewController.presentViewControllerAsModalWindow(viewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("presentViewControllerAsModalWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController)
}

fun NSViewController.presentViewController_asPopoverRelativeToRect_ofView_preferredEdge_behavior(viewController: MemorySegment, positioningRect: NSRect, positioningView: MemorySegment, preferredEdge: NSRectEdge, behavior: NSPopoverBehavior): Unit {
    val sel = ObjCRuntime.sel("presentViewController:asPopoverRelativeToRect:ofView:preferredEdge:behavior:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController, ObjCRuntime.ObjCStructArg(positioningRect.segment, NSRect.layout), positioningView, preferredEdge.rawValue, behavior.rawValue)
}

fun NSViewController.presentViewController_asPopoverRelativeToRect_ofView_preferredEdge_behavior_hasFullSizeContent(viewController: MemorySegment, positioningRect: NSRect, positioningView: MemorySegment, preferredEdge: NSRectEdge, behavior: NSPopoverBehavior, hasFullSizeContent: Boolean): Unit {
    val sel = ObjCRuntime.sel("presentViewController:asPopoverRelativeToRect:ofView:preferredEdge:behavior:hasFullSizeContent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController, ObjCRuntime.ObjCStructArg(positioningRect.segment, NSRect.layout), positioningView, preferredEdge.rawValue, behavior.rawValue, hasFullSizeContent)
}

fun NSViewController.transitionFromViewController_toViewController_options_completionHandler(fromViewController: MemorySegment, toViewController: MemorySegment, options: NSViewControllerTransitionOptions, completion: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("transitionFromViewController:toViewController:options:completionHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fromViewController, toViewController, options.rawValue, completion)
}

// ── Category: NSViewControllerContainer on NSViewController ─────────────────────────────────────────

fun NSViewController.addChildViewController(childViewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addChildViewController:")
    ObjCRuntime.msgSend(null, this.ptr, sel, childViewController)
}

fun NSViewController.removeFromParentViewController(): Unit {
    val sel = ObjCRuntime.sel("removeFromParentViewController")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSViewController.insertChildViewController_atIndex(childViewController: MemorySegment, index: Long): Unit {
    val sel = ObjCRuntime.sel("insertChildViewController:atIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, childViewController, index)
}

fun NSViewController.removeChildViewControllerAtIndex(index: Long): Unit {
    val sel = ObjCRuntime.sel("removeChildViewControllerAtIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, index)
}

fun NSViewController.preferredContentSizeDidChangeForViewController(viewController: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("preferredContentSizeDidChangeForViewController:")
    ObjCRuntime.msgSend(null, this.ptr, sel, viewController)
}

fun NSViewController.viewWillTransitionToSize(newSize: NSSize): Unit {
    val sel = ObjCRuntime.sel("viewWillTransitionToSize:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(newSize.segment, NSSize.layout))
}

fun NSViewController.parentViewController(): MemorySegment {
    val sel = ObjCRuntime.sel("parentViewController")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<__kindof NSViewController *> * */
fun NSViewController.childViewControllers(): MemorySegment {
    val sel = ObjCRuntime.sel("childViewControllers")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSViewController.setChildViewControllers(childViewControllers: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setChildViewControllers:")
    ObjCRuntime.msgSend(null, this.ptr, sel, childViewControllers)
}

// ── Category: NSViewControllerStoryboardingMethods on NSViewController ─────────────────────────────────────────

fun NSViewController.storyboard(): MemorySegment {
    val sel = ObjCRuntime.sel("storyboard")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSExtensionAdditions on NSViewController ─────────────────────────────────────────

fun NSViewController.extensionContext(): MemorySegment {
    val sel = ObjCRuntime.sel("extensionContext")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSViewController.sourceItemView(): MemorySegment {
    val sel = ObjCRuntime.sel("sourceItemView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSViewController.setSourceItemView(sourceItemView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSourceItemView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sourceItemView)
}

fun NSViewController.preferredScreenOrigin(): NSPoint {
    val sel = ObjCRuntime.sel("preferredScreenOrigin")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}

fun NSViewController.setPreferredScreenOrigin(preferredScreenOrigin: NSPoint): Unit {
    val sel = ObjCRuntime.sel("setPreferredScreenOrigin:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(preferredScreenOrigin.segment, NSPoint.layout))
}

fun NSViewController.preferredMinimumSize(): NSSize {
    val sel = ObjCRuntime.sel("preferredMinimumSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

fun NSViewController.preferredMaximumSize(): NSSize {
    val sel = ObjCRuntime.sel("preferredMaximumSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}
