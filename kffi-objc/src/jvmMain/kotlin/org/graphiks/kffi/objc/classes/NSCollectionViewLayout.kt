@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewLayout
 * Superclass: NSObject
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSCollectionViewLayout(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionViewLayout") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateLayout(): Unit {
        val sel = ObjCRuntime.sel("invalidateLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateLayoutWithContext(context: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("invalidateLayoutWithContext:")
        ObjCRuntime.msgSend(null, ptr, sel, context)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun registerClass_forDecorationViewOfKind(viewClass: MemorySegment, elementKind: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerClass:forDecorationViewOfKind:")
        ObjCRuntime.msgSend(null, ptr, sel, viewClass, elementKind)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun registerNib_forDecorationViewOfKind(nib: MemorySegment, elementKind: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerNib:forDecorationViewOfKind:")
        ObjCRuntime.msgSend(null, ptr, sel, nib, elementKind)
    }

    // @property collectionView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun collectionView(): MemorySegment {
        val sel = ObjCRuntime.sel("collectionView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSCollectionViewLayout.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSCollectionViewLayout.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

// ── Category: NSSubclassingHooks on NSCollectionViewLayout ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.prepareLayout(): Unit {
    val sel = ObjCRuntime.sel("prepareLayout")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** @return NSArray<__kindof NSCollectionViewLayoutAttributes *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.layoutAttributesForElementsInRect(rect: NSRect): MemorySegment {
    val sel = ObjCRuntime.sel("layoutAttributesForElementsInRect:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.layoutAttributesForItemAtIndexPath(indexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("layoutAttributesForItemAtIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, indexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.layoutAttributesForSupplementaryViewOfKind_atIndexPath(elementKind: MemorySegment, indexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind, indexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.layoutAttributesForDecorationViewOfKind_atIndexPath(elementKind: MemorySegment, indexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("layoutAttributesForDecorationViewOfKind:atIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind, indexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.layoutAttributesForDropTargetAtPoint(pointInCollectionView: NSPoint): MemorySegment {
    val sel = ObjCRuntime.sel("layoutAttributesForDropTargetAtPoint:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(pointInCollectionView.segment, NSPoint.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.layoutAttributesForInterItemGapBeforeIndexPath(indexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("layoutAttributesForInterItemGapBeforeIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, indexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.shouldInvalidateLayoutForBoundsChange(newBounds: NSRect): Boolean {
    val sel = ObjCRuntime.sel("shouldInvalidateLayoutForBoundsChange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ObjCRuntime.ObjCStructArg(newBounds.segment, NSRect.layout)) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.invalidationContextForBoundsChange(newBounds: NSRect): MemorySegment {
    val sel = ObjCRuntime.sel("invalidationContextForBoundsChange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(newBounds.segment, NSRect.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.shouldInvalidateLayoutForPreferredLayoutAttributes_withOriginalAttributes(preferredAttributes: MemorySegment, originalAttributes: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("shouldInvalidateLayoutForPreferredLayoutAttributes:withOriginalAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, preferredAttributes, originalAttributes) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.invalidationContextForPreferredLayoutAttributes_withOriginalAttributes(preferredAttributes: MemorySegment, originalAttributes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("invalidationContextForPreferredLayoutAttributes:withOriginalAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, preferredAttributes, originalAttributes) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.targetContentOffsetForProposedContentOffset_withScrollingVelocity(proposedContentOffset: NSPoint, velocity: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("targetContentOffsetForProposedContentOffset:withScrollingVelocity:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(proposedContentOffset.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(velocity.segment, NSPoint.layout)))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.targetContentOffsetForProposedContentOffset(proposedContentOffset: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("targetContentOffsetForProposedContentOffset:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(proposedContentOffset.segment, NSPoint.layout)))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.collectionViewContentSize(): NSSize {
    val sel = ObjCRuntime.sel("collectionViewContentSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

// Class method: +[NSCollectionViewLayout layoutAttributesClass]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout_layoutAttributesClass(): MemorySegment {
    val sel = ObjCRuntime.sel("layoutAttributesClass")
    val cls = ObjCRuntime.getClass("NSCollectionViewLayout")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCollectionViewLayout invalidationContextClass]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout_invalidationContextClass(): MemorySegment {
    val sel = ObjCRuntime.sel("invalidationContextClass")
    val cls = ObjCRuntime.getClass("NSCollectionViewLayout")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSUpdateSupportHooks on NSCollectionViewLayout ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.prepareForCollectionViewUpdates(updateItems: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("prepareForCollectionViewUpdates:")
    ObjCRuntime.msgSend(null, this.ptr, sel, updateItems)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.finalizeCollectionViewUpdates(): Unit {
    val sel = ObjCRuntime.sel("finalizeCollectionViewUpdates")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.prepareForAnimatedBoundsChange(oldBounds: NSRect): Unit {
    val sel = ObjCRuntime.sel("prepareForAnimatedBoundsChange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(oldBounds.segment, NSRect.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.finalizeAnimatedBoundsChange(): Unit {
    val sel = ObjCRuntime.sel("finalizeAnimatedBoundsChange")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.prepareForTransitionToLayout(newLayout: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("prepareForTransitionToLayout:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newLayout)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.prepareForTransitionFromLayout(oldLayout: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("prepareForTransitionFromLayout:")
    ObjCRuntime.msgSend(null, this.ptr, sel, oldLayout)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.finalizeLayoutTransition(): Unit {
    val sel = ObjCRuntime.sel("finalizeLayoutTransition")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.initialLayoutAttributesForAppearingItemAtIndexPath(itemIndexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initialLayoutAttributesForAppearingItemAtIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, itemIndexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.finalLayoutAttributesForDisappearingItemAtIndexPath(itemIndexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("finalLayoutAttributesForDisappearingItemAtIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, itemIndexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.initialLayoutAttributesForAppearingSupplementaryElementOfKind_atIndexPath(elementKind: MemorySegment, elementIndexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind, elementIndexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.finalLayoutAttributesForDisappearingSupplementaryElementOfKind_atIndexPath(elementKind: MemorySegment, elementIndexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("finalLayoutAttributesForDisappearingSupplementaryElementOfKind:atIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind, elementIndexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.initialLayoutAttributesForAppearingDecorationElementOfKind_atIndexPath(elementKind: MemorySegment, decorationIndexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind, decorationIndexPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.finalLayoutAttributesForDisappearingDecorationElementOfKind_atIndexPath(elementKind: MemorySegment, decorationIndexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("finalLayoutAttributesForDisappearingDecorationElementOfKind:atIndexPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind, decorationIndexPath) as MemorySegment
}

/** @return NSSet<NSIndexPath *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.indexPathsToDeleteForSupplementaryViewOfKind(elementKind: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexPathsToDeleteForSupplementaryViewOfKind:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind) as MemorySegment
}

/** @return NSSet<NSIndexPath *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.indexPathsToDeleteForDecorationViewOfKind(elementKind: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexPathsToDeleteForDecorationViewOfKind:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind) as MemorySegment
}

/** @return NSSet<NSIndexPath *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.indexPathsToInsertForSupplementaryViewOfKind(elementKind: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexPathsToInsertForSupplementaryViewOfKind:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind) as MemorySegment
}

/** @return NSSet<NSIndexPath *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSCollectionViewLayout.indexPathsToInsertForDecorationViewOfKind(elementKind: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexPathsToInsertForDecorationViewOfKind:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, elementKind) as MemorySegment
}
