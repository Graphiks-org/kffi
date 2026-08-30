@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSEvent
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSEvent(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSEvent") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun eventWithEventRef(eventRef: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("eventWithEventRef:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, eventRef) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun eventWithCGEvent(cgEvent: CGEventRef): MemorySegment {
            val sel = ObjCRuntime.sel("eventWithCGEvent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, cgEvent.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun startPeriodicEventsAfterDelay_withPeriod(delay: Double, period: Double): Unit {
            val sel = ObjCRuntime.sel("startPeriodicEventsAfterDelay:withPeriod:")
            ObjCRuntime.msgSend(null, _class, sel, delay, period)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun stopPeriodicEvents(): Unit {
            val sel = ObjCRuntime.sel("stopPeriodicEvents")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure(type: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: Double, wNum: Long, unusedPassNil: MemorySegment, eNum: Long, cNum: Long, pressure: Float): MemorySegment {
            val sel = ObjCRuntime.sel("mouseEventWithType:location:modifierFlags:timestamp:windowNumber:context:eventNumber:clickCount:pressure:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type.rawValue, ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout), flags.rawValue, time, wNum, unusedPassNil, eNum, cNum, pressure) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode(type: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: Double, wNum: Long, unusedPassNil: MemorySegment, keys: MemorySegment, ukeys: MemorySegment, flag: Boolean, code: Short): MemorySegment {
            val sel = ObjCRuntime.sel("keyEventWithType:location:modifierFlags:timestamp:windowNumber:context:characters:charactersIgnoringModifiers:isARepeat:keyCode:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type.rawValue, ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout), flags.rawValue, time, wNum, unusedPassNil, keys, ukeys, flag, code) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode(type: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: Double, wNum: Long, unusedPassNil: MemorySegment, keys: String, ukeys: String, flag: Boolean, code: Short): MemorySegment = keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode(type, location, flags, time, wNum, unusedPassNil, ObjCRuntime.newNSString(Arena.global(), keys), ObjCRuntime.newNSString(Arena.global(), ukeys), flag, code)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData(type: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: Double, wNum: Long, unusedPassNil: MemorySegment, eNum: Long, tNum: Long, `data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("enterExitEventWithType:location:modifierFlags:timestamp:windowNumber:context:eventNumber:trackingNumber:userData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type.rawValue, ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout), flags.rawValue, time, wNum, unusedPassNil, eNum, tNum, `data`) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2(type: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: Double, wNum: Long, unusedPassNil: MemorySegment, subtype: Short, d1: Long, d2: Long): MemorySegment {
            val sel = ObjCRuntime.sel("otherEventWithType:location:modifierFlags:timestamp:windowNumber:context:subtype:data1:data2:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type.rawValue, ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout), flags.rawValue, time, wNum, unusedPassNil, subtype, d1, d2) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun addGlobalMonitorForEventsMatchingMask_handler(mask: NSEventMask, block: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("addGlobalMonitorForEventsMatchingMask:handler:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, mask.rawValue, block) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun addLocalMonitorForEventsMatchingMask_handler(mask: NSEventMask, block: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("addLocalMonitorForEventsMatchingMask:handler:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, mask.rawValue, block) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun removeMonitor(eventMonitor: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("removeMonitor:")
            ObjCRuntime.msgSend(null, _class, sel, eventMonitor)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun isMouseCoalescingEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isMouseCoalescingEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun setMouseCoalescingEnabled(mouseCoalescingEnabled: Boolean): Unit {
            val sel = ObjCRuntime.sel("setMouseCoalescingEnabled:")
            ObjCRuntime.msgSend(null, _class, sel, mouseCoalescingEnabled)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun isSwipeTrackingFromScrollEventsEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isSwipeTrackingFromScrollEventsEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun mouseLocation(): NSPoint {
            val sel = ObjCRuntime.sel("mouseLocation")
            return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, _class, sel))
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun modifierFlags(): NSEventModifierFlags {
            val sel = ObjCRuntime.sel("modifierFlags")
            return NSEventModifierFlags(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun pressedMouseButtons(): Long {
            val sel = ObjCRuntime.sel("pressedMouseButtons")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun doubleClickInterval(): Double {
            val sel = ObjCRuntime.sel("doubleClickInterval")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun keyRepeatDelay(): Double {
            val sel = ObjCRuntime.sel("keyRepeatDelay")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun keyRepeatInterval(): Double {
            val sel = ObjCRuntime.sel("keyRepeatInterval")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun charactersByApplyingModifiers(modifiers: NSEventModifierFlags): MemorySegment {
        val sel = ObjCRuntime.sel("charactersByApplyingModifiers:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, modifiers.rawValue) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    fun charactersByApplyingModifiersAsString(modifiers: NSEventModifierFlags): String = ObjCRuntime.toJavaString(charactersByApplyingModifiers(modifiers))

    /** @return NSSet<NSTouch *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun touchesMatchingPhase_inView(phase: NSTouchPhase, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("touchesMatchingPhase:inView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, phase.rawValue, view) as MemorySegment
    }

    /** @return NSSet<NSTouch *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun allTouches(): MemorySegment {
        val sel = ObjCRuntime.sel("allTouches")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** @return NSSet<NSTouch *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun touchesForView(view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("touchesForView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, view) as MemorySegment
    }

    /** @return NSArray<NSTouch *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun coalescedTouchesForTouch(touch: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("coalescedTouchesForTouch:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, touch) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler(options: NSEventSwipeTrackingOptions, minDampenThreshold: Double, maxDampenThreshold: Double, trackingHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("trackSwipeEventWithOptions:dampenAmountThresholdMin:max:usingHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, options.rawValue, minDampenThreshold, maxDampenThreshold, trackingHandler)
    }

    // @property type
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun type(): NSEventType {
        val sel = ObjCRuntime.sel("type")
        return NSEventType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property modifierFlags
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun modifierFlags(): NSEventModifierFlags {
        val sel = ObjCRuntime.sel("modifierFlags")
        return NSEventModifierFlags(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property timestamp
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun timestamp(): Double {
        val sel = ObjCRuntime.sel("timestamp")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property window
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun window(): MemorySegment {
        val sel = ObjCRuntime.sel("window")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property windowNumber
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun windowNumber(): Long {
        val sel = ObjCRuntime.sel("windowNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property context
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1, message = "This method always returns nil. If you need access to the current drawing context, use [NSGraphicsContext currentContext] inside of a draw operation.")
    open fun context(): MemorySegment {
        val sel = ObjCRuntime.sel("context")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property clickCount
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clickCount(): Long {
        val sel = ObjCRuntime.sel("clickCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property buttonNumber
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun buttonNumber(): Long {
        val sel = ObjCRuntime.sel("buttonNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property eventNumber
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun eventNumber(): Long {
        val sel = ObjCRuntime.sel("eventNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property pressure
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pressure(): Float {
        val sel = ObjCRuntime.sel("pressure")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }

    // @property locationInWindow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun locationInWindow(): NSPoint {
        val sel = ObjCRuntime.sel("locationInWindow")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    // @property deltaX
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deltaX(): Double {
        val sel = ObjCRuntime.sel("deltaX")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property deltaY
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deltaY(): Double {
        val sel = ObjCRuntime.sel("deltaY")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property deltaZ
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deltaZ(): Double {
        val sel = ObjCRuntime.sel("deltaZ")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property hasPreciseScrollingDeltas
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun hasPreciseScrollingDeltas(): Boolean {
        val sel = ObjCRuntime.sel("hasPreciseScrollingDeltas")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property scrollingDeltaX
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun scrollingDeltaX(): Double {
        val sel = ObjCRuntime.sel("scrollingDeltaX")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property scrollingDeltaY
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun scrollingDeltaY(): Double {
        val sel = ObjCRuntime.sel("scrollingDeltaY")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property momentumPhase
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun momentumPhase(): NSEventPhase {
        val sel = ObjCRuntime.sel("momentumPhase")
        return NSEventPhase(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property directionInvertedFromDevice
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun isDirectionInvertedFromDevice(): Boolean {
        val sel = ObjCRuntime.sel("isDirectionInvertedFromDevice")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property characters
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun characters(): MemorySegment {
        val sel = ObjCRuntime.sel("characters")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun charactersAsString(): String = ObjCRuntime.toJavaString(characters())

    // @property charactersIgnoringModifiers
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun charactersIgnoringModifiers(): MemorySegment {
        val sel = ObjCRuntime.sel("charactersIgnoringModifiers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun charactersIgnoringModifiersAsString(): String = ObjCRuntime.toJavaString(charactersIgnoringModifiers())

    // @property ARepeat
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isARepeat(): Boolean {
        val sel = ObjCRuntime.sel("isARepeat")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property keyCode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keyCode(): Short {
        val sel = ObjCRuntime.sel("keyCode")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_SHORT, ptr, sel) as Short
    }

    // @property trackingNumber
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trackingNumber(): Long {
        val sel = ObjCRuntime.sel("trackingNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property userData
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun userData(): MemorySegment {
        val sel = ObjCRuntime.sel("userData")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property trackingArea
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun trackingArea(): MemorySegment {
        val sel = ObjCRuntime.sel("trackingArea")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property subtype
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun subtype(): NSEventSubtype {
        val sel = ObjCRuntime.sel("subtype")
        return NSEventSubtype((ObjCRuntime.msgSend(ValueLayout.JAVA_SHORT, ptr, sel) as Short).toLong())
    }

    // @property data1
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun data1(): Long {
        val sel = ObjCRuntime.sel("data1")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property data2
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun data2(): Long {
        val sel = ObjCRuntime.sel("data2")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property eventRef
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun eventRef(): MemorySegment {
        val sel = ObjCRuntime.sel("eventRef")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property CGEvent
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun CGEvent(): CGEventRef {
        val sel = ObjCRuntime.sel("CGEvent")
        return CGEventRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property magnification
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun magnification(): Double {
        val sel = ObjCRuntime.sel("magnification")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property deviceID
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deviceID(): Long {
        val sel = ObjCRuntime.sel("deviceID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property rotation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rotation(): Float {
        val sel = ObjCRuntime.sel("rotation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }

    // @property absoluteX
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun absoluteX(): Long {
        val sel = ObjCRuntime.sel("absoluteX")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property absoluteY
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun absoluteY(): Long {
        val sel = ObjCRuntime.sel("absoluteY")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property absoluteZ
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun absoluteZ(): Long {
        val sel = ObjCRuntime.sel("absoluteZ")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property buttonMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun buttonMask(): NSEventButtonMask {
        val sel = ObjCRuntime.sel("buttonMask")
        return NSEventButtonMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property tilt
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tilt(): NSPoint {
        val sel = ObjCRuntime.sel("tilt")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    // @property tangentialPressure
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tangentialPressure(): Float {
        val sel = ObjCRuntime.sel("tangentialPressure")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }

    // @property vendorDefined
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun vendorDefined(): MemorySegment {
        val sel = ObjCRuntime.sel("vendorDefined")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property vendorID
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun vendorID(): Long {
        val sel = ObjCRuntime.sel("vendorID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property tabletID
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tabletID(): Long {
        val sel = ObjCRuntime.sel("tabletID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property pointingDeviceID
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pointingDeviceID(): Long {
        val sel = ObjCRuntime.sel("pointingDeviceID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property systemTabletID
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun systemTabletID(): Long {
        val sel = ObjCRuntime.sel("systemTabletID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property vendorPointingDeviceType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun vendorPointingDeviceType(): Long {
        val sel = ObjCRuntime.sel("vendorPointingDeviceType")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property pointingDeviceSerialNumber
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pointingDeviceSerialNumber(): Long {
        val sel = ObjCRuntime.sel("pointingDeviceSerialNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property uniqueID
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun uniqueID(): Long {
        val sel = ObjCRuntime.sel("uniqueID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property capabilityMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun capabilityMask(): Long {
        val sel = ObjCRuntime.sel("capabilityMask")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property pointingDeviceType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pointingDeviceType(): NSPointingDeviceType {
        val sel = ObjCRuntime.sel("pointingDeviceType")
        return NSPointingDeviceType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property enteringProximity
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEnteringProximity(): Boolean {
        val sel = ObjCRuntime.sel("isEnteringProximity")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property phase
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun phase(): NSEventPhase {
        val sel = ObjCRuntime.sel("phase")
        return NSEventPhase(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property stage
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun stage(): Long {
        val sel = ObjCRuntime.sel("stage")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property stageTransition
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun stageTransition(): Double {
        val sel = ObjCRuntime.sel("stageTransition")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property associatedEventsMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun associatedEventsMask(): NSEventMask {
        val sel = ObjCRuntime.sel("associatedEventsMask")
        return NSEventMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property pressureBehavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun pressureBehavior(): NSPressureBehavior {
        val sel = ObjCRuntime.sel("pressureBehavior")
        return NSPressureBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSEvent.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSEvent.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSEvent.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
