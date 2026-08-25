package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGradient
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSGradient(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSGradient") }

    }

    open fun initWithStartingColor_endingColor(startingColor: MemorySegment, endingColor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithStartingColor:endingColor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, startingColor, endingColor) as MemorySegment
    }

    open fun initWithColors(colorArray: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithColors:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, colorArray) as MemorySegment
    }

    open fun initWithColorsAndLocations(firstColor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithColorsAndLocations:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, firstColor) as MemorySegment
    }

    open fun initWithColors_atLocations_colorSpace(colorArray: MemorySegment, locations: MemorySegment, colorSpace: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithColors:atLocations:colorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, colorArray, locations, colorSpace) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun drawFromPoint_toPoint_options(startingPoint: NSPoint, endingPoint: NSPoint, options: NSGradientDrawingOptions): Unit {
        val sel = ObjCRuntime.sel("drawFromPoint:toPoint:options:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(startingPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(endingPoint.segment, NSPoint.layout), options.rawValue)
    }

    open fun drawInRect_angle(rect: NSRect, angle: Double): Unit {
        val sel = ObjCRuntime.sel("drawInRect:angle:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), angle)
    }

    open fun drawInBezierPath_angle(path: MemorySegment, angle: Double): Unit {
        val sel = ObjCRuntime.sel("drawInBezierPath:angle:")
        ObjCRuntime.msgSend(null, ptr, sel, path, angle)
    }

    open fun drawFromCenter_radius_toCenter_radius_options(startCenter: NSPoint, startRadius: Double, endCenter: NSPoint, endRadius: Double, options: NSGradientDrawingOptions): Unit {
        val sel = ObjCRuntime.sel("drawFromCenter:radius:toCenter:radius:options:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(startCenter.segment, NSPoint.layout), startRadius, ObjCRuntime.ObjCStructArg(endCenter.segment, NSPoint.layout), endRadius, options.rawValue)
    }

    open fun drawInRect_relativeCenterPosition(rect: NSRect, relativeCenterPosition: NSPoint): Unit {
        val sel = ObjCRuntime.sel("drawInRect:relativeCenterPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(relativeCenterPosition.segment, NSPoint.layout))
    }

    open fun drawInBezierPath_relativeCenterPosition(path: MemorySegment, relativeCenterPosition: NSPoint): Unit {
        val sel = ObjCRuntime.sel("drawInBezierPath:relativeCenterPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, path, ObjCRuntime.ObjCStructArg(relativeCenterPosition.segment, NSPoint.layout))
    }

    open fun getColor_location_atIndex(color: MemorySegment, location: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("getColor:location:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, color, location, index)
    }

    open fun interpolatedColorAtLocation(location: Double): MemorySegment {
        val sel = ObjCRuntime.sel("interpolatedColorAtLocation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, location) as MemorySegment
    }

    // @property colorSpace
    open fun colorSpace(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSpace")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property numberOfColorStops
    open fun numberOfColorStops(): Long {
        val sel = ObjCRuntime.sel("numberOfColorStops")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
