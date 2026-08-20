package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSResponder
 * Superclass: NSObject
 * Protocols: NSCoding
 */
open class NSResponder(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSResponder") }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun tryToPerform_with(action: MemorySegment, `object`: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("tryToPerform:with:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, action, `object`) as Boolean
    }

    open fun performKeyEquivalent(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("performKeyEquivalent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    open fun validRequestorForSendType_returnType(sendType: MemorySegment, returnType: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("validRequestorForSendType:returnType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, sendType, returnType) as MemorySegment
    }

    open fun mouseDown(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseDown:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun rightMouseDown(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rightMouseDown:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun otherMouseDown(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("otherMouseDown:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun mouseUp(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseUp:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun rightMouseUp(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rightMouseUp:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun otherMouseUp(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("otherMouseUp:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun mouseMoved(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseMoved:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun mouseDragged(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseDragged:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun mouseCancelled(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseCancelled:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun scrollWheel(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scrollWheel:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun rightMouseDragged(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rightMouseDragged:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun otherMouseDragged(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("otherMouseDragged:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun mouseEntered(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseEntered:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun mouseExited(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseExited:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun keyDown(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("keyDown:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun keyUp(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("keyUp:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun flagsChanged(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("flagsChanged:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun tabletPoint(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("tabletPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun tabletProximity(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("tabletProximity:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun cursorUpdate(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("cursorUpdate:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun magnifyWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("magnifyWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun rotateWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rotateWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun swipeWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("swipeWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun beginGestureWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginGestureWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun endGestureWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("endGestureWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun smartMagnifyWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("smartMagnifyWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun changeModeWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeModeWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun touchesBeganWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("touchesBeganWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun touchesMovedWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("touchesMovedWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun touchesEndedWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("touchesEndedWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun touchesCancelledWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("touchesCancelledWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun quickLookWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("quickLookWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun pressureChangeWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("pressureChangeWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun contextMenuKeyDown(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("contextMenuKeyDown:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun noResponderFor(eventSelector: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("noResponderFor:")
        ObjCRuntime.msgSend(null, ptr, sel, eventSelector)
    }

    open fun becomeFirstResponder(): Boolean {
        val sel = ObjCRuntime.sel("becomeFirstResponder")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun resignFirstResponder(): Boolean {
        val sel = ObjCRuntime.sel("resignFirstResponder")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun interpretKeyEvents(eventArray: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("interpretKeyEvents:")
        ObjCRuntime.msgSend(null, ptr, sel, eventArray)
    }

    open fun flushBufferedKeyEvents(): Unit {
        val sel = ObjCRuntime.sel("flushBufferedKeyEvents")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun showContextHelp(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("showContextHelp:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun helpRequested(eventPtr: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("helpRequested:")
        ObjCRuntime.msgSend(null, ptr, sel, eventPtr)
    }

    open fun shouldBeTreatedAsInkEvent(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("shouldBeTreatedAsInkEvent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    open fun wantsScrollEventsForSwipeTrackingOnAxis(axis: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("wantsScrollEventsForSwipeTrackingOnAxis:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, axis) as Boolean
    }

    open fun wantsForwardedScrollEventsForAxis(axis: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("wantsForwardedScrollEventsForAxis:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, axis) as Boolean
    }

    open fun supplementalTargetForAction_sender(action: MemorySegment, sender: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("supplementalTargetForAction:sender:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, action, sender) as MemorySegment
    }

    // @property nextResponder
    open fun nextResponder(): MemorySegment {
        val sel = ObjCRuntime.sel("nextResponder")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setNextResponder(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setNextResponder:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property acceptsFirstResponder
    open fun acceptsFirstResponder(): Boolean {
        val sel = ObjCRuntime.sel("acceptsFirstResponder")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property menu
    open fun menu(): MemorySegment {
        val sel = ObjCRuntime.sel("menu")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMenu(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
