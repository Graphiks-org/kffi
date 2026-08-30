@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextListElement
 * Superclass: NSTextParagraph
 */
@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
open class NSTextListElement(override val ptr: MemorySegment) : NSTextParagraph(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextListElement") }

        @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
        fun textListElementWithContents_markerAttributes_textList_childElements(contents: MemorySegment, markerAttributes: MemorySegment, textList: MemorySegment, children: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("textListElementWithContents:markerAttributes:textList:childElements:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, contents, markerAttributes, textList, children) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
        fun textListElementWithChildElements_textList_nestingLevel(children: MemorySegment, textList: MemorySegment, nestingLevel: Long): MemorySegment {
            val sel = ObjCRuntime.sel("textListElementWithChildElements:textList:nestingLevel:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, children, textList, nestingLevel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithParentElement_textList_contents_markerAttributes_childElements(parent: MemorySegment, textList: MemorySegment, contents: MemorySegment, markerAttributes: MemorySegment, children: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithParentElement:textList:contents:markerAttributes:childElements:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, parent, textList, contents, markerAttributes, children) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun initWithAttributedString(attributedString: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithAttributedString:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attributedString) as MemorySegment
    }

    // @property textList
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun textList(): MemorySegment {
        val sel = ObjCRuntime.sel("textList")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property contents
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun contents(): MemorySegment {
        val sel = ObjCRuntime.sel("contents")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property markerAttributes
    /** @return NSDictionary<NSAttributedStringKey,id> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun markerAttributes(): MemorySegment {
        val sel = ObjCRuntime.sel("markerAttributes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property attributedString
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    override fun attributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property childElements
    /** @return NSArray<NSTextListElement *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    override fun childElements(): MemorySegment {
        val sel = ObjCRuntime.sel("childElements")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property parentElement
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    override fun parentElement(): MemorySegment {
        val sel = ObjCRuntime.sel("parentElement")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
