@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSRulerMarker
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSRulerMarker(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSRulerMarker") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithRulerView_markerLocation_image_imageOrigin(ruler: MemorySegment, location: Double, image: MemorySegment, imageOrigin: NSPoint): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRulerView:markerLocation:image:imageOrigin:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ruler, location, image, ObjCRuntime.ObjCStructArg(imageOrigin.segment, NSPoint.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trackMouse_adding(mouseDownEvent: MemorySegment, isAdding: Boolean): Boolean {
        val sel = ObjCRuntime.sel("trackMouse:adding:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, mouseDownEvent, isAdding) as Boolean
    }

    // @property ruler
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun ruler(): MemorySegment {
        val sel = ObjCRuntime.sel("ruler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property markerLocation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun markerLocation(): Double {
        val sel = ObjCRuntime.sel("markerLocation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMarkerLocation(value: Double) {
        val sel = ObjCRuntime.sel("setMarkerLocation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property image
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imageOrigin
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageOrigin(): NSPoint {
        val sel = ObjCRuntime.sel("imageOrigin")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageOrigin(value: NSPoint) {
        val sel = ObjCRuntime.sel("setImageOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSPoint.layout))
    }

    // @property movable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isMovable(): Boolean {
        val sel = ObjCRuntime.sel("isMovable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMovable(value: Boolean) {
        val sel = ObjCRuntime.sel("setMovable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property removable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isRemovable(): Boolean {
        val sel = ObjCRuntime.sel("isRemovable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRemovable(value: Boolean) {
        val sel = ObjCRuntime.sel("setRemovable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property dragging
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isDragging(): Boolean {
        val sel = ObjCRuntime.sel("isDragging")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property representedObject
    /** @return id<NSCopying> */
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

    // @property imageRectInRuler
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageRectInRuler(): NSRect {
        val sel = ObjCRuntime.sel("imageRectInRuler")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property thicknessRequiredInRuler
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun thicknessRequiredInRuler(): Double {
        val sel = ObjCRuntime.sel("thicknessRequiredInRuler")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSRulerMarker.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSRulerMarker.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}
