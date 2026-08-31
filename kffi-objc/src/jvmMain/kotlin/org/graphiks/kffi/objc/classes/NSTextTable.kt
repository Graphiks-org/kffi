@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextTable
 * Superclass: NSTextBlock
 */
open class NSTextTable(override val ptr: MemorySegment) : NSTextBlock(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTextTable") } }

    }

    open fun rectForBlock_layoutAtPoint_inRect_textContainer_characterRange(block: MemorySegment, startingPoint: NSPoint, rect: NSRect, textContainer: MemorySegment, charRange: NSRange): NSRect {
        val sel = ObjCRuntime.sel("rectForBlock:layoutAtPoint:inRect:textContainer:characterRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, block, ObjCRuntime.ObjCStructArg(startingPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), textContainer, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout)))
    }

    open fun boundsRectForBlock_contentRect_inRect_textContainer_characterRange(block: MemorySegment, contentRect: NSRect, rect: NSRect, textContainer: MemorySegment, charRange: NSRange): NSRect {
        val sel = ObjCRuntime.sel("boundsRectForBlock:contentRect:inRect:textContainer:characterRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, block, ObjCRuntime.ObjCStructArg(contentRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), textContainer, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout)))
    }

    open fun drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager(block: MemorySegment, frameRect: NSRect, controlView: MemorySegment, charRange: NSRange, layoutManager: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawBackgroundForBlock:withFrame:inView:characterRange:layoutManager:")
        ObjCRuntime.msgSend(null, ptr, sel, block, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), controlView, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), layoutManager)
    }

    // @property numberOfColumns
    open fun numberOfColumns(): Long {
        val sel = ObjCRuntime.sel("numberOfColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setNumberOfColumns(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfColumns:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layoutAlgorithm
    open fun layoutAlgorithm(): NSTextTableLayoutAlgorithm {
        val sel = ObjCRuntime.sel("layoutAlgorithm")
        return NSTextTableLayoutAlgorithm(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLayoutAlgorithm(value: NSTextTableLayoutAlgorithm) {
        val sel = ObjCRuntime.sel("setLayoutAlgorithm:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property collapsesBorders
    open fun collapsesBorders(): Boolean {
        val sel = ObjCRuntime.sel("collapsesBorders")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setCollapsesBorders(value: Boolean) {
        val sel = ObjCRuntime.sel("setCollapsesBorders:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hidesEmptyCells
    open fun hidesEmptyCells(): Boolean {
        val sel = ObjCRuntime.sel("hidesEmptyCells")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setHidesEmptyCells(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidesEmptyCells:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
