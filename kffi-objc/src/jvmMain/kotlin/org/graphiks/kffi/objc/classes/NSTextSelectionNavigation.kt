package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextSelectionNavigation
 * Superclass: NSObject
 */
open class NSTextSelectionNavigation(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextSelectionNavigation") }

        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun initWithDataSource(dataSource: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDataSource:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, dataSource) as MemorySegment
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun flushLayoutCache(): Unit {
        val sel = ObjCRuntime.sel("flushLayoutCache")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun destinationSelectionForTextSelection_direction_destination_extending_confined(textSelection: MemorySegment, direction: NSTextSelectionNavigationDirection, destination: NSTextSelectionNavigationDestination, extending: Boolean, confined: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("destinationSelectionForTextSelection:direction:destination:extending:confined:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textSelection, direction.rawValue, destination.rawValue, extending, confined) as MemorySegment
    }

    /** @return NSArray<NSTextSelection *> * */
    open fun textSelectionsInteractingAtPoint_inContainerAtLocation_anchors_modifiers_selecting_bounds(point: CGPoint, containerLocation: MemorySegment, anchors: MemorySegment, modifiers: NSTextSelectionNavigationModifier, selecting: Boolean, bounds: CGRect): MemorySegment {
        val sel = ObjCRuntime.sel("textSelectionsInteractingAtPoint:inContainerAtLocation:anchors:modifiers:selecting:bounds:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, CGPoint.layout), containerLocation, anchors, modifiers.rawValue, selecting, ObjCRuntime.ObjCStructArg(bounds.segment, CGRect.layout)) as MemorySegment
    }

    open fun textSelectionForSelectionGranularity_enclosingTextSelection(selectionGranularity: NSTextSelectionGranularity, textSelection: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("textSelectionForSelectionGranularity:enclosingTextSelection:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, selectionGranularity.rawValue, textSelection) as MemorySegment
    }

    open fun textSelectionForSelectionGranularity_enclosingPoint_inContainerAtLocation(selectionGranularity: NSTextSelectionGranularity, point: CGPoint, location: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("textSelectionForSelectionGranularity:enclosingPoint:inContainerAtLocation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, selectionGranularity.rawValue, ObjCRuntime.ObjCStructArg(point.segment, CGPoint.layout), location) as MemorySegment
    }

    /** @return id<NSTextLocation> */
    open fun resolvedInsertionLocationForTextSelection_writingDirection(textSelection: MemorySegment, writingDirection: NSTextSelectionNavigationWritingDirection): MemorySegment {
        val sel = ObjCRuntime.sel("resolvedInsertionLocationForTextSelection:writingDirection:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textSelection, writingDirection.rawValue) as MemorySegment
    }

    /** @return NSArray<NSTextRange *> * */
    open fun deletionRangesForTextSelection_direction_destination_allowsDecomposition(textSelection: MemorySegment, direction: NSTextSelectionNavigationDirection, destination: NSTextSelectionNavigationDestination, allowsDecomposition: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("deletionRangesForTextSelection:direction:destination:allowsDecomposition:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textSelection, direction.rawValue, destination.rawValue, allowsDecomposition) as MemorySegment
    }

    // @property textSelectionDataSource
    /** @return id<NSTextSelectionDataSource> */
    open fun textSelectionDataSource(): MemorySegment {
        val sel = ObjCRuntime.sel("textSelectionDataSource")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property allowsNonContiguousRanges
    open fun allowsNonContiguousRanges(): Boolean {
        val sel = ObjCRuntime.sel("allowsNonContiguousRanges")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsNonContiguousRanges(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsNonContiguousRanges:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property rotatesCoordinateSystemForLayoutOrientation
    open fun rotatesCoordinateSystemForLayoutOrientation(): Boolean {
        val sel = ObjCRuntime.sel("rotatesCoordinateSystemForLayoutOrientation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setRotatesCoordinateSystemForLayoutOrientation(value: Boolean) {
        val sel = ObjCRuntime.sel("setRotatesCoordinateSystemForLayoutOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
