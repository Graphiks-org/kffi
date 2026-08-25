package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextBlock
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
open class NSTextBlock(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextBlock") }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun setValue_type_forDimension(`val`: Double, type: NSTextBlockValueType, dimension: NSTextBlockDimension): Unit {
        val sel = ObjCRuntime.sel("setValue:type:forDimension:")
        ObjCRuntime.msgSend(null, ptr, sel, `val`, type.rawValue, dimension.rawValue)
    }

    open fun valueForDimension(dimension: NSTextBlockDimension): Double {
        val sel = ObjCRuntime.sel("valueForDimension:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, dimension.rawValue) as Double
    }

    open fun valueTypeForDimension(dimension: NSTextBlockDimension): NSTextBlockValueType {
        val sel = ObjCRuntime.sel("valueTypeForDimension:")
        return NSTextBlockValueType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, dimension.rawValue) as Long)
    }

    open fun setContentWidth_type(`val`: Double, type: NSTextBlockValueType): Unit {
        val sel = ObjCRuntime.sel("setContentWidth:type:")
        ObjCRuntime.msgSend(null, ptr, sel, `val`, type.rawValue)
    }

    open fun setWidth_type_forLayer_edge(`val`: Double, type: NSTextBlockValueType, layer: NSTextBlockLayer, edge: NSRectEdge): Unit {
        val sel = ObjCRuntime.sel("setWidth:type:forLayer:edge:")
        ObjCRuntime.msgSend(null, ptr, sel, `val`, type.rawValue, layer.rawValue, edge.rawValue)
    }

    open fun setWidth_type_forLayer(`val`: Double, type: NSTextBlockValueType, layer: NSTextBlockLayer): Unit {
        val sel = ObjCRuntime.sel("setWidth:type:forLayer:")
        ObjCRuntime.msgSend(null, ptr, sel, `val`, type.rawValue, layer.rawValue)
    }

    open fun widthForLayer_edge(layer: NSTextBlockLayer, edge: NSRectEdge): Double {
        val sel = ObjCRuntime.sel("widthForLayer:edge:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, layer.rawValue, edge.rawValue) as Double
    }

    open fun widthValueTypeForLayer_edge(layer: NSTextBlockLayer, edge: NSRectEdge): NSTextBlockValueType {
        val sel = ObjCRuntime.sel("widthValueTypeForLayer:edge:")
        return NSTextBlockValueType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, layer.rawValue, edge.rawValue) as Long)
    }

    open fun setBorderColor_forEdge(color: MemorySegment, edge: NSRectEdge): Unit {
        val sel = ObjCRuntime.sel("setBorderColor:forEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, color, edge.rawValue)
    }

    open fun setBorderColor(color: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setBorderColor:")
        ObjCRuntime.msgSend(null, ptr, sel, color)
    }

    open fun borderColorForEdge(edge: NSRectEdge): MemorySegment {
        val sel = ObjCRuntime.sel("borderColorForEdge:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, edge.rawValue) as MemorySegment
    }

    open fun rectForLayoutAtPoint_inRect_textContainer_characterRange(startingPoint: NSPoint, rect: NSRect, textContainer: MemorySegment, charRange: NSRange): NSRect {
        val sel = ObjCRuntime.sel("rectForLayoutAtPoint:inRect:textContainer:characterRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(startingPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), textContainer, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout)))
    }

    open fun boundsRectForContentRect_inRect_textContainer_characterRange(contentRect: NSRect, rect: NSRect, textContainer: MemorySegment, charRange: NSRange): NSRect {
        val sel = ObjCRuntime.sel("boundsRectForContentRect:inRect:textContainer:characterRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(contentRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), textContainer, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout)))
    }

    open fun drawBackgroundWithFrame_inView_characterRange_layoutManager(frameRect: NSRect, controlView: MemorySegment, charRange: NSRange, layoutManager: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawBackgroundWithFrame:inView:characterRange:layoutManager:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), controlView, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), layoutManager)
    }

    // @property contentWidth
    open fun contentWidth(): Double {
        val sel = ObjCRuntime.sel("contentWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property contentWidthValueType
    open fun contentWidthValueType(): NSTextBlockValueType {
        val sel = ObjCRuntime.sel("contentWidthValueType")
        return NSTextBlockValueType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property verticalAlignment
    open fun verticalAlignment(): NSTextBlockVerticalAlignment {
        val sel = ObjCRuntime.sel("verticalAlignment")
        return NSTextBlockVerticalAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setVerticalAlignment(value: NSTextBlockVerticalAlignment) {
        val sel = ObjCRuntime.sel("setVerticalAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property backgroundColor
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
