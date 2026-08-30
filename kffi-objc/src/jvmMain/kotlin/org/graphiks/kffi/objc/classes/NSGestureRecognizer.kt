@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGestureRecognizer
 * Superclass: NSObject
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSGestureRecognizer(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSGestureRecognizer") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithTarget_action(target: MemorySegment, action: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTarget:action:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, target, action) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun locationInView(view: MemorySegment): NSPoint {
        val sel = ObjCRuntime.sel("locationInView:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, view))
    }

    // @property target
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun target(): MemorySegment {
        val sel = ObjCRuntime.sel("target")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property action
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun action(): MemorySegment {
        val sel = ObjCRuntime.sel("action")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property state
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun state(): NSGestureRecognizerState {
        val sel = ObjCRuntime.sel("state")
        return NSGestureRecognizerState(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property delegate
    /** @return id<NSGestureRecognizerDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property enabled
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property view
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property pressureConfiguration
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun pressureConfiguration(): MemorySegment {
        val sel = ObjCRuntime.sel("pressureConfiguration")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setPressureConfiguration(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPressureConfiguration:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delaysPrimaryMouseButtonEvents
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delaysPrimaryMouseButtonEvents(): Boolean {
        val sel = ObjCRuntime.sel("delaysPrimaryMouseButtonEvents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelaysPrimaryMouseButtonEvents(value: Boolean) {
        val sel = ObjCRuntime.sel("setDelaysPrimaryMouseButtonEvents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delaysSecondaryMouseButtonEvents
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delaysSecondaryMouseButtonEvents(): Boolean {
        val sel = ObjCRuntime.sel("delaysSecondaryMouseButtonEvents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelaysSecondaryMouseButtonEvents(value: Boolean) {
        val sel = ObjCRuntime.sel("setDelaysSecondaryMouseButtonEvents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delaysOtherMouseButtonEvents
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delaysOtherMouseButtonEvents(): Boolean {
        val sel = ObjCRuntime.sel("delaysOtherMouseButtonEvents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelaysOtherMouseButtonEvents(value: Boolean) {
        val sel = ObjCRuntime.sel("setDelaysOtherMouseButtonEvents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delaysKeyEvents
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delaysKeyEvents(): Boolean {
        val sel = ObjCRuntime.sel("delaysKeyEvents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelaysKeyEvents(value: Boolean) {
        val sel = ObjCRuntime.sel("setDelaysKeyEvents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delaysMagnificationEvents
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delaysMagnificationEvents(): Boolean {
        val sel = ObjCRuntime.sel("delaysMagnificationEvents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelaysMagnificationEvents(value: Boolean) {
        val sel = ObjCRuntime.sel("setDelaysMagnificationEvents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delaysRotationEvents
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delaysRotationEvents(): Boolean {
        val sel = ObjCRuntime.sel("delaysRotationEvents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelaysRotationEvents(value: Boolean) {
        val sel = ObjCRuntime.sel("setDelaysRotationEvents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property name
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setName(value: String) = setName(ObjCRuntime.newNSString(Arena.global(), value))

    // @property modifierFlags
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun modifierFlags(): NSEventModifierFlags {
        val sel = ObjCRuntime.sel("modifierFlags")
        return NSEventModifierFlags(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSGestureRecognizer.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

// ── Category: NSTouchBar on NSGestureRecognizer ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSGestureRecognizer.allowedTouchTypes(): NSTouchTypeMask {
    val sel = ObjCRuntime.sel("allowedTouchTypes")
    return NSTouchTypeMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSGestureRecognizer.setAllowedTouchTypes(allowedTouchTypes: NSTouchTypeMask): Unit {
    val sel = ObjCRuntime.sel("setAllowedTouchTypes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowedTouchTypes.rawValue)
}

// ── Category: NSSubclassUse on NSGestureRecognizer ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.reset(): Unit {
    val sel = ObjCRuntime.sel("reset")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.canPreventGestureRecognizer(preventedGestureRecognizer: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("canPreventGestureRecognizer:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, preventedGestureRecognizer) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.canBePreventedByGestureRecognizer(preventingGestureRecognizer: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("canBePreventedByGestureRecognizer:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, preventingGestureRecognizer) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.shouldRequireFailureOfGestureRecognizer(otherGestureRecognizer: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("shouldRequireFailureOfGestureRecognizer:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, otherGestureRecognizer) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.shouldBeRequiredToFailByGestureRecognizer(otherGestureRecognizer: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("shouldBeRequiredToFailByGestureRecognizer:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, otherGestureRecognizer) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.mouseDown(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseDown:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.rightMouseDown(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rightMouseDown:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.otherMouseDown(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("otherMouseDown:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.mouseUp(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseUp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.rightMouseUp(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rightMouseUp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.otherMouseUp(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("otherMouseUp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.mouseDragged(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseDragged:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.rightMouseDragged(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rightMouseDragged:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.otherMouseDragged(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("otherMouseDragged:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun NSGestureRecognizer.mouseCancelled(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseCancelled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.keyDown(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("keyDown:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.keyUp(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("keyUp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.flagsChanged(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("flagsChanged:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.tabletPoint(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("tabletPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.magnifyWithEvent(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("magnifyWithEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.rotateWithEvent(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rotateWithEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
fun NSGestureRecognizer.pressureChangeWithEvent(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("pressureChangeWithEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSGestureRecognizer.touchesBeganWithEvent(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("touchesBeganWithEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSGestureRecognizer.touchesMovedWithEvent(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("touchesMovedWithEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSGestureRecognizer.touchesEndedWithEvent(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("touchesEndedWithEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSGestureRecognizer.touchesCancelledWithEvent(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("touchesCancelledWithEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGestureRecognizer.setState(state: NSGestureRecognizerState): Unit {
    val sel = ObjCRuntime.sel("setState:")
    ObjCRuntime.msgSend(null, this.ptr, sel, state.rawValue)
}
