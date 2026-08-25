package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSBezierPath
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSBezierPath(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSBezierPath") }

        fun bezierPath(): MemorySegment {
            val sel = ObjCRuntime.sel("bezierPath")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun bezierPathWithRect(rect: NSRect): MemorySegment {
            val sel = ObjCRuntime.sel("bezierPathWithRect:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
        }

        fun bezierPathWithOvalInRect(rect: NSRect): MemorySegment {
            val sel = ObjCRuntime.sel("bezierPathWithOvalInRect:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
        }

        fun bezierPathWithRoundedRect_xRadius_yRadius(rect: NSRect, xRadius: Double, yRadius: Double): MemorySegment {
            val sel = ObjCRuntime.sel("bezierPathWithRoundedRect:xRadius:yRadius:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), xRadius, yRadius) as MemorySegment
        }

        fun bezierPathWithCGPath(cgPath: CGPathRef): MemorySegment {
            val sel = ObjCRuntime.sel("bezierPathWithCGPath:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, cgPath.segment) as MemorySegment
        }

        fun fillRect(rect: NSRect): Unit {
            val sel = ObjCRuntime.sel("fillRect:")
            ObjCRuntime.msgSend(null, _class, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
        }

        fun strokeRect(rect: NSRect): Unit {
            val sel = ObjCRuntime.sel("strokeRect:")
            ObjCRuntime.msgSend(null, _class, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
        }

        fun clipRect(rect: NSRect): Unit {
            val sel = ObjCRuntime.sel("clipRect:")
            ObjCRuntime.msgSend(null, _class, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
        }

        fun strokeLineFromPoint_toPoint(point1: NSPoint, point2: NSPoint): Unit {
            val sel = ObjCRuntime.sel("strokeLineFromPoint:toPoint:")
            ObjCRuntime.msgSend(null, _class, sel, ObjCRuntime.ObjCStructArg(point1.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(point2.segment, NSPoint.layout))
        }

        fun drawPackedGlyphs_atPoint(packedGlyphs: MemorySegment, point: NSPoint): Unit {
            val sel = ObjCRuntime.sel("drawPackedGlyphs:atPoint:")
            ObjCRuntime.msgSend(null, _class, sel, packedGlyphs, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
        }

        fun defaultMiterLimit(): Double {
            val sel = ObjCRuntime.sel("defaultMiterLimit")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

        fun setDefaultMiterLimit(defaultMiterLimit: Double): Unit {
            val sel = ObjCRuntime.sel("setDefaultMiterLimit:")
            ObjCRuntime.msgSend(null, _class, sel, defaultMiterLimit)
        }

        fun defaultFlatness(): Double {
            val sel = ObjCRuntime.sel("defaultFlatness")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

        fun setDefaultFlatness(defaultFlatness: Double): Unit {
            val sel = ObjCRuntime.sel("setDefaultFlatness:")
            ObjCRuntime.msgSend(null, _class, sel, defaultFlatness)
        }

        fun defaultWindingRule(): NSWindingRule {
            val sel = ObjCRuntime.sel("defaultWindingRule")
            return NSWindingRule(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        fun setDefaultWindingRule(defaultWindingRule: NSWindingRule): Unit {
            val sel = ObjCRuntime.sel("setDefaultWindingRule:")
            ObjCRuntime.msgSend(null, _class, sel, defaultWindingRule.rawValue)
        }

        fun defaultLineCapStyle(): NSLineCapStyle {
            val sel = ObjCRuntime.sel("defaultLineCapStyle")
            return NSLineCapStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        fun setDefaultLineCapStyle(defaultLineCapStyle: NSLineCapStyle): Unit {
            val sel = ObjCRuntime.sel("setDefaultLineCapStyle:")
            ObjCRuntime.msgSend(null, _class, sel, defaultLineCapStyle.rawValue)
        }

        fun defaultLineJoinStyle(): NSLineJoinStyle {
            val sel = ObjCRuntime.sel("defaultLineJoinStyle")
            return NSLineJoinStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        fun setDefaultLineJoinStyle(defaultLineJoinStyle: NSLineJoinStyle): Unit {
            val sel = ObjCRuntime.sel("setDefaultLineJoinStyle:")
            ObjCRuntime.msgSend(null, _class, sel, defaultLineJoinStyle.rawValue)
        }

        fun defaultLineWidth(): Double {
            val sel = ObjCRuntime.sel("defaultLineWidth")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

        fun setDefaultLineWidth(defaultLineWidth: Double): Unit {
            val sel = ObjCRuntime.sel("setDefaultLineWidth:")
            ObjCRuntime.msgSend(null, _class, sel, defaultLineWidth)
        }

    }

    open fun moveToPoint(point: NSPoint): Unit {
        val sel = ObjCRuntime.sel("moveToPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
    }

    open fun lineToPoint(point: NSPoint): Unit {
        val sel = ObjCRuntime.sel("lineToPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
    }

    open fun curveToPoint_controlPoint1_controlPoint2(endPoint: NSPoint, controlPoint1: NSPoint, controlPoint2: NSPoint): Unit {
        val sel = ObjCRuntime.sel("curveToPoint:controlPoint1:controlPoint2:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(endPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(controlPoint1.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(controlPoint2.segment, NSPoint.layout))
    }

    open fun curveToPoint_controlPoint(endPoint: NSPoint, controlPoint: NSPoint): Unit {
        val sel = ObjCRuntime.sel("curveToPoint:controlPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(endPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(controlPoint.segment, NSPoint.layout))
    }

    open fun closePath(): Unit {
        val sel = ObjCRuntime.sel("closePath")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun removeAllPoints(): Unit {
        val sel = ObjCRuntime.sel("removeAllPoints")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun relativeMoveToPoint(point: NSPoint): Unit {
        val sel = ObjCRuntime.sel("relativeMoveToPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
    }

    open fun relativeLineToPoint(point: NSPoint): Unit {
        val sel = ObjCRuntime.sel("relativeLineToPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
    }

    open fun relativeCurveToPoint_controlPoint1_controlPoint2(endPoint: NSPoint, controlPoint1: NSPoint, controlPoint2: NSPoint): Unit {
        val sel = ObjCRuntime.sel("relativeCurveToPoint:controlPoint1:controlPoint2:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(endPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(controlPoint1.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(controlPoint2.segment, NSPoint.layout))
    }

    open fun relativeCurveToPoint_controlPoint(endPoint: NSPoint, controlPoint: NSPoint): Unit {
        val sel = ObjCRuntime.sel("relativeCurveToPoint:controlPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(endPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(controlPoint.segment, NSPoint.layout))
    }

    open fun getLineDash_count_phase(pattern: MemorySegment, count: MemorySegment, phase: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getLineDash:count:phase:")
        ObjCRuntime.msgSend(null, ptr, sel, pattern, count, phase)
    }

    open fun setLineDash_count_phase(pattern: MemorySegment, count: Long, phase: Double): Unit {
        val sel = ObjCRuntime.sel("setLineDash:count:phase:")
        ObjCRuntime.msgSend(null, ptr, sel, pattern, count, phase)
    }

    open fun stroke(): Unit {
        val sel = ObjCRuntime.sel("stroke")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun fill(): Unit {
        val sel = ObjCRuntime.sel("fill")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun addClip(): Unit {
        val sel = ObjCRuntime.sel("addClip")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun setClip(): Unit {
        val sel = ObjCRuntime.sel("setClip")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun transformUsingAffineTransform(transform: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("transformUsingAffineTransform:")
        ObjCRuntime.msgSend(null, ptr, sel, transform)
    }

    open fun elementAtIndex_associatedPoints(index: Long, points: NSPointArray): NSBezierPathElement {
        val sel = ObjCRuntime.sel("elementAtIndex:associatedPoints:")
        return NSBezierPathElement(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, index, points.segment) as Long)
    }

    open fun elementAtIndex(index: Long): NSBezierPathElement {
        val sel = ObjCRuntime.sel("elementAtIndex:")
        return NSBezierPathElement(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, index) as Long)
    }

    open fun setAssociatedPoints_atIndex(points: NSPointArray, index: Long): Unit {
        val sel = ObjCRuntime.sel("setAssociatedPoints:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, points.segment, index)
    }

    open fun appendBezierPath(path: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("appendBezierPath:")
        ObjCRuntime.msgSend(null, ptr, sel, path)
    }

    open fun appendBezierPathWithRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun appendBezierPathWithPoints_count(points: NSPointArray, count: Long): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithPoints:count:")
        ObjCRuntime.msgSend(null, ptr, sel, points.segment, count)
    }

    open fun appendBezierPathWithOvalInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithOvalInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise(center: NSPoint, radius: Double, startAngle: Double, endAngle: Double, clockwise: Boolean): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithArcWithCenter:radius:startAngle:endAngle:clockwise:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(center.segment, NSPoint.layout), radius, startAngle, endAngle, clockwise)
    }

    open fun appendBezierPathWithArcWithCenter_radius_startAngle_endAngle(center: NSPoint, radius: Double, startAngle: Double, endAngle: Double): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithArcWithCenter:radius:startAngle:endAngle:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(center.segment, NSPoint.layout), radius, startAngle, endAngle)
    }

    open fun appendBezierPathWithArcFromPoint_toPoint_radius(point1: NSPoint, point2: NSPoint, radius: Double): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithArcFromPoint:toPoint:radius:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point1.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(point2.segment, NSPoint.layout), radius)
    }

    open fun appendBezierPathWithCGGlyph_inFont(glyph: Short, font: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithCGGlyph:inFont:")
        ObjCRuntime.msgSend(null, ptr, sel, glyph, font)
    }

    open fun appendBezierPathWithCGGlyphs_count_inFont(glyphs: MemorySegment, count: Long, font: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithCGGlyphs:count:inFont:")
        ObjCRuntime.msgSend(null, ptr, sel, glyphs, count, font)
    }

    open fun appendBezierPathWithRoundedRect_xRadius_yRadius(rect: NSRect, xRadius: Double, yRadius: Double): Unit {
        val sel = ObjCRuntime.sel("appendBezierPathWithRoundedRect:xRadius:yRadius:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), xRadius, yRadius)
    }

    open fun containsPoint(point: NSPoint): Boolean {
        val sel = ObjCRuntime.sel("containsPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Boolean
    }

    // @property CGPath
    open fun CGPath(): CGPathRef {
        val sel = ObjCRuntime.sel("CGPath")
        return CGPathRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    open fun setCGPath(value: CGPathRef) {
        val sel = ObjCRuntime.sel("setCGPath:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property defaultMiterLimit
    open fun defaultMiterLimit(): Double {
        val sel = ObjCRuntime.sel("defaultMiterLimit")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setDefaultMiterLimit(value: Double) {
        val sel = ObjCRuntime.sel("setDefaultMiterLimit:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property defaultFlatness
    open fun defaultFlatness(): Double {
        val sel = ObjCRuntime.sel("defaultFlatness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setDefaultFlatness(value: Double) {
        val sel = ObjCRuntime.sel("setDefaultFlatness:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property defaultWindingRule
    open fun defaultWindingRule(): NSWindingRule {
        val sel = ObjCRuntime.sel("defaultWindingRule")
        return NSWindingRule(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDefaultWindingRule(value: NSWindingRule) {
        val sel = ObjCRuntime.sel("setDefaultWindingRule:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property defaultLineCapStyle
    open fun defaultLineCapStyle(): NSLineCapStyle {
        val sel = ObjCRuntime.sel("defaultLineCapStyle")
        return NSLineCapStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDefaultLineCapStyle(value: NSLineCapStyle) {
        val sel = ObjCRuntime.sel("setDefaultLineCapStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property defaultLineJoinStyle
    open fun defaultLineJoinStyle(): NSLineJoinStyle {
        val sel = ObjCRuntime.sel("defaultLineJoinStyle")
        return NSLineJoinStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDefaultLineJoinStyle(value: NSLineJoinStyle) {
        val sel = ObjCRuntime.sel("setDefaultLineJoinStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property defaultLineWidth
    open fun defaultLineWidth(): Double {
        val sel = ObjCRuntime.sel("defaultLineWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setDefaultLineWidth(value: Double) {
        val sel = ObjCRuntime.sel("setDefaultLineWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property lineWidth
    open fun lineWidth(): Double {
        val sel = ObjCRuntime.sel("lineWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setLineWidth(value: Double) {
        val sel = ObjCRuntime.sel("setLineWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property lineCapStyle
    open fun lineCapStyle(): NSLineCapStyle {
        val sel = ObjCRuntime.sel("lineCapStyle")
        return NSLineCapStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLineCapStyle(value: NSLineCapStyle) {
        val sel = ObjCRuntime.sel("setLineCapStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property lineJoinStyle
    open fun lineJoinStyle(): NSLineJoinStyle {
        val sel = ObjCRuntime.sel("lineJoinStyle")
        return NSLineJoinStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLineJoinStyle(value: NSLineJoinStyle) {
        val sel = ObjCRuntime.sel("setLineJoinStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property windingRule
    open fun windingRule(): NSWindingRule {
        val sel = ObjCRuntime.sel("windingRule")
        return NSWindingRule(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setWindingRule(value: NSWindingRule) {
        val sel = ObjCRuntime.sel("setWindingRule:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property miterLimit
    open fun miterLimit(): Double {
        val sel = ObjCRuntime.sel("miterLimit")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMiterLimit(value: Double) {
        val sel = ObjCRuntime.sel("setMiterLimit:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property flatness
    open fun flatness(): Double {
        val sel = ObjCRuntime.sel("flatness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setFlatness(value: Double) {
        val sel = ObjCRuntime.sel("setFlatness:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bezierPathByFlatteningPath
    open fun bezierPathByFlatteningPath(): MemorySegment {
        val sel = ObjCRuntime.sel("bezierPathByFlatteningPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property bezierPathByReversingPath
    open fun bezierPathByReversingPath(): MemorySegment {
        val sel = ObjCRuntime.sel("bezierPathByReversingPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property empty
    open fun isEmpty(): Boolean {
        val sel = ObjCRuntime.sel("isEmpty")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property currentPoint
    open fun currentPoint(): NSPoint {
        val sel = ObjCRuntime.sel("currentPoint")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    // @property controlPointBounds
    open fun controlPointBounds(): NSRect {
        val sel = ObjCRuntime.sel("controlPointBounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property bounds
    open fun bounds(): NSRect {
        val sel = ObjCRuntime.sel("bounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property elementCount
    open fun elementCount(): Long {
        val sel = ObjCRuntime.sel("elementCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

// ── Category: NSBezierPathDeprecated on NSBezierPath ─────────────────────────────────────────

fun NSBezierPath.cachesBezierPath(): Boolean {
    val sel = ObjCRuntime.sel("cachesBezierPath")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSBezierPath.setCachesBezierPath(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setCachesBezierPath:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

fun NSBezierPath.appendBezierPathWithGlyph_inFont(glyph: Int, font: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("appendBezierPathWithGlyph:inFont:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyph, font)
}

fun NSBezierPath.appendBezierPathWithGlyphs_count_inFont(glyphs: MemorySegment, count: Long, font: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("appendBezierPathWithGlyphs:count:inFont:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyphs, count, font)
}

fun NSBezierPath.appendBezierPathWithPackedGlyphs(packedGlyphs: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("appendBezierPathWithPackedGlyphs:")
    ObjCRuntime.msgSend(null, this.ptr, sel, packedGlyphs)
}
