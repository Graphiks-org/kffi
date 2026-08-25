package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutSection
 * Superclass: NSObject
 * Protocols: NSCopying
 */
open class NSCollectionLayoutSection(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionLayoutSection") }

        fun sectionWithGroup(group: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("sectionWithGroup:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, group) as MemorySegment
        }

        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property contentInsets
    open fun contentInsets(): NSDirectionalEdgeInsets {
        val sel = ObjCRuntime.sel("contentInsets")
        return NSDirectionalEdgeInsets(ObjCRuntime.msgSendStruct(NSDirectionalEdgeInsets.layout, ptr, sel))
    }
    open fun setContentInsets(value: NSDirectionalEdgeInsets) {
        val sel = ObjCRuntime.sel("setContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSDirectionalEdgeInsets.layout))
    }

    // @property interGroupSpacing
    open fun interGroupSpacing(): Double {
        val sel = ObjCRuntime.sel("interGroupSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setInterGroupSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setInterGroupSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property orthogonalScrollingBehavior
    open fun orthogonalScrollingBehavior(): NSCollectionLayoutSectionOrthogonalScrollingBehavior {
        val sel = ObjCRuntime.sel("orthogonalScrollingBehavior")
        return NSCollectionLayoutSectionOrthogonalScrollingBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setOrthogonalScrollingBehavior(value: NSCollectionLayoutSectionOrthogonalScrollingBehavior) {
        val sel = ObjCRuntime.sel("setOrthogonalScrollingBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property boundarySupplementaryItems
    /** @return NSArray<NSCollectionLayoutBoundarySupplementaryItem *> * */
    open fun boundarySupplementaryItems(): MemorySegment {
        val sel = ObjCRuntime.sel("boundarySupplementaryItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBoundarySupplementaryItems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBoundarySupplementaryItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property supplementariesFollowContentInsets
    open fun supplementariesFollowContentInsets(): Boolean {
        val sel = ObjCRuntime.sel("supplementariesFollowContentInsets")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSupplementariesFollowContentInsets(value: Boolean) {
        val sel = ObjCRuntime.sel("setSupplementariesFollowContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property visibleItemsInvalidationHandler
    open fun visibleItemsInvalidationHandler(): MemorySegment {
        val sel = ObjCRuntime.sel("visibleItemsInvalidationHandler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setVisibleItemsInvalidationHandler(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setVisibleItemsInvalidationHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property decorationItems
    /** @return NSArray<NSCollectionLayoutDecorationItem *> * */
    open fun decorationItems(): MemorySegment {
        val sel = ObjCRuntime.sel("decorationItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDecorationItems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDecorationItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
