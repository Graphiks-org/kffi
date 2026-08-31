@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSRulerView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSRulerView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSRulerView") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle(unitName: MemorySegment, abbreviation: MemorySegment, conversionFactor: Double, stepUpCycle: MemorySegment, stepDownCycle: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("registerUnitWithName:abbreviation:unitToPointsConversionFactor:stepUpCycle:stepDownCycle:")
            ObjCRuntime.msgSend(null, _class, sel, unitName, abbreviation, conversionFactor, stepUpCycle, stepDownCycle)
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle(unitName: MemorySegment, abbreviation: String, conversionFactor: Double, stepUpCycle: MemorySegment, stepDownCycle: MemorySegment): Unit = registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle(unitName, ObjCRuntime.newNSString(Arena.global(), abbreviation), conversionFactor, stepUpCycle, stepDownCycle)

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithScrollView_orientation(scrollView: MemorySegment, orientation: NSRulerOrientation): MemorySegment {
        val sel = ObjCRuntime.sel("initWithScrollView:orientation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, scrollView, orientation.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addMarker(marker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, marker)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeMarker(marker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, marker)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trackMarker_withMouseEvent(marker: MemorySegment, event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("trackMarker:withMouseEvent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, marker, event) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveRulerlineFromLocation_toLocation(oldLocation: Double, newLocation: Double): Unit {
        val sel = ObjCRuntime.sel("moveRulerlineFromLocation:toLocation:")
        ObjCRuntime.msgSend(null, ptr, sel, oldLocation, newLocation)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateHashMarks(): Unit {
        val sel = ObjCRuntime.sel("invalidateHashMarks")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawHashMarksAndLabelsInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawHashMarksAndLabelsInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawMarkersInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawMarkersInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    // @property scrollView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollView(): MemorySegment {
        val sel = ObjCRuntime.sel("scrollView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setScrollView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setScrollView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property orientation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orientation(): NSRulerOrientation {
        val sel = ObjCRuntime.sel("orientation")
        return NSRulerOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOrientation(value: NSRulerOrientation) {
        val sel = ObjCRuntime.sel("setOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property baselineLocation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun baselineLocation(): Double {
        val sel = ObjCRuntime.sel("baselineLocation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property requiredThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun requiredThickness(): Double {
        val sel = ObjCRuntime.sel("requiredThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property ruleThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun ruleThickness(): Double {
        val sel = ObjCRuntime.sel("ruleThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRuleThickness(value: Double) {
        val sel = ObjCRuntime.sel("setRuleThickness:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property reservedThicknessForMarkers
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reservedThicknessForMarkers(): Double {
        val sel = ObjCRuntime.sel("reservedThicknessForMarkers")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setReservedThicknessForMarkers(value: Double) {
        val sel = ObjCRuntime.sel("setReservedThicknessForMarkers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property reservedThicknessForAccessoryView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reservedThicknessForAccessoryView(): Double {
        val sel = ObjCRuntime.sel("reservedThicknessForAccessoryView")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setReservedThicknessForAccessoryView(value: Double) {
        val sel = ObjCRuntime.sel("setReservedThicknessForAccessoryView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property measurementUnits
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun measurementUnits(): MemorySegment {
        val sel = ObjCRuntime.sel("measurementUnits")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMeasurementUnits(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMeasurementUnits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property originOffset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun originOffset(): Double {
        val sel = ObjCRuntime.sel("originOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOriginOffset(value: Double) {
        val sel = ObjCRuntime.sel("setOriginOffset:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property clientView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clientView(): MemorySegment {
        val sel = ObjCRuntime.sel("clientView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setClientView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setClientView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property markers
    /** @return NSArray<NSRulerMarker *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun markers(): MemorySegment {
        val sel = ObjCRuntime.sel("markers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMarkers(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMarkers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property accessoryView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun accessoryView(): MemorySegment {
        val sel = ObjCRuntime.sel("accessoryView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAccessoryView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAccessoryView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property flipped
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun isFlipped(): Boolean {
        val sel = ObjCRuntime.sel("isFlipped")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}
