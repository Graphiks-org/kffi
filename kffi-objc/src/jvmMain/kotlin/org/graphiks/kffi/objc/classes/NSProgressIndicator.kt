@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSProgressIndicator
 * Superclass: NSView
 * Protocols: NSAccessibilityProgressIndicator
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSProgressIndicator(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSProgressIndicator") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun incrementBy(delta: Double): Unit {
        val sel = ObjCRuntime.sel("incrementBy:")
        ObjCRuntime.msgSend(null, ptr, sel, delta)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun startAnimation(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("startAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stopAnimation(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("stopAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sizeToFit(): Unit {
        val sel = ObjCRuntime.sel("sizeToFit")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property indeterminate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isIndeterminate(): Boolean {
        val sel = ObjCRuntime.sel("isIndeterminate")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIndeterminate(value: Boolean) {
        val sel = ObjCRuntime.sel("setIndeterminate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property controlSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun controlSize(): NSControlSize {
        val sel = ObjCRuntime.sel("controlSize")
        return NSControlSize(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setControlSize(value: NSControlSize) {
        val sel = ObjCRuntime.sel("setControlSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property doubleValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun doubleValue(): Double {
        val sel = ObjCRuntime.sel("doubleValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDoubleValue(value: Double) {
        val sel = ObjCRuntime.sel("setDoubleValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minValue(): Double {
        val sel = ObjCRuntime.sel("minValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinValue(value: Double) {
        val sel = ObjCRuntime.sel("setMinValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maxValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maxValue(): Double {
        val sel = ObjCRuntime.sel("maxValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaxValue(value: Double) {
        val sel = ObjCRuntime.sel("setMaxValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property observedProgress
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun observedProgress(): MemorySegment {
        val sel = ObjCRuntime.sel("observedProgress")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setObservedProgress(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setObservedProgress:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property usesThreadedAnimation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun usesThreadedAnimation(): Boolean {
        val sel = ObjCRuntime.sel("usesThreadedAnimation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUsesThreadedAnimation(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesThreadedAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property style
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun style(): NSProgressIndicatorStyle {
        val sel = ObjCRuntime.sel("style")
        return NSProgressIndicatorStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setStyle(value: NSProgressIndicatorStyle) {
        val sel = ObjCRuntime.sel("setStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property displayedWhenStopped
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isDisplayedWhenStopped(): Boolean {
        val sel = ObjCRuntime.sel("isDisplayedWhenStopped")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDisplayedWhenStopped(value: Boolean) {
        val sel = ObjCRuntime.sel("setDisplayedWhenStopped:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSProgressIndicatorDeprecated on NSProgressIndicator ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "The animationDelay property does nothing.")
fun NSProgressIndicator.animationDelay(): Double {
    val sel = ObjCRuntime.sel("animationDelay")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "The animationDelay property does nothing.")
fun NSProgressIndicator.setAnimationDelay(delay: Double): Unit {
    val sel = ObjCRuntime.sel("setAnimationDelay:")
    ObjCRuntime.msgSend(null, this.ptr, sel, delay)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -startAnimation and -stopAnimation instead.")
fun NSProgressIndicator.animate(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("animate:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The bezeled property is not respected on 10.15 and later")
fun NSProgressIndicator.isBezeled(): Boolean {
    val sel = ObjCRuntime.sel("isBezeled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The bezeled property is not respected on 10.15 and later")
fun NSProgressIndicator.setBezeled(bezeled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setBezeled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, bezeled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The controlTint property is not respected on 10.15 and later")
fun NSProgressIndicator.controlTint(): NSControlTint {
    val sel = ObjCRuntime.sel("controlTint")
    return NSControlTint(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The controlTint property is not respected on 10.15 and later")
fun NSProgressIndicator.setControlTint(controlTint: NSControlTint): Unit {
    val sel = ObjCRuntime.sel("setControlTint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, controlTint.rawValue)
}
