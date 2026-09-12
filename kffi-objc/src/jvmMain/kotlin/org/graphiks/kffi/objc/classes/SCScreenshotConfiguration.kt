@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCScreenshotConfiguration
 * Superclass: NSObject
 */
open class SCScreenshotConfiguration(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCScreenshotConfiguration") } }

        /** @return NSArray<UTType *> * */
        fun supportedContentTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("supportedContentTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property width
    open fun width(): Long {
        val sel = ObjCRuntime.sel("width")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setWidth(value: Long) {
        val sel = ObjCRuntime.sel("setWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property height
    open fun height(): Long {
        val sel = ObjCRuntime.sel("height")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setHeight(value: Long) {
        val sel = ObjCRuntime.sel("setHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsCursor
    open fun showsCursor(): Boolean {
        val sel = ObjCRuntime.sel("showsCursor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setShowsCursor(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsCursor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sourceRect
    open fun sourceRect(): CGRect {
        val sel = ObjCRuntime.sel("sourceRect")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }
    open fun setSourceRect(value: CGRect) {
        val sel = ObjCRuntime.sel("setSourceRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGRect.layout))
    }

    // @property destinationRect
    open fun destinationRect(): CGRect {
        val sel = ObjCRuntime.sel("destinationRect")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }
    open fun setDestinationRect(value: CGRect) {
        val sel = ObjCRuntime.sel("setDestinationRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGRect.layout))
    }

    // @property ignoreShadows
    open fun ignoreShadows(): Boolean {
        val sel = ObjCRuntime.sel("ignoreShadows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setIgnoreShadows(value: Boolean) {
        val sel = ObjCRuntime.sel("setIgnoreShadows:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property ignoreClipping
    open fun ignoreClipping(): Boolean {
        val sel = ObjCRuntime.sel("ignoreClipping")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setIgnoreClipping(value: Boolean) {
        val sel = ObjCRuntime.sel("setIgnoreClipping:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property includeChildWindows
    open fun includeChildWindows(): Boolean {
        val sel = ObjCRuntime.sel("includeChildWindows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setIncludeChildWindows(value: Boolean) {
        val sel = ObjCRuntime.sel("setIncludeChildWindows:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property displayIntent
    open fun displayIntent(): SCScreenshotDisplayIntent {
        val sel = ObjCRuntime.sel("displayIntent")
        return SCScreenshotDisplayIntent(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDisplayIntent(value: SCScreenshotDisplayIntent) {
        val sel = ObjCRuntime.sel("setDisplayIntent:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property dynamicRange
    open fun dynamicRange(): SCScreenshotDynamicRange {
        val sel = ObjCRuntime.sel("dynamicRange")
        return SCScreenshotDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDynamicRange(value: SCScreenshotDynamicRange) {
        val sel = ObjCRuntime.sel("setDynamicRange:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property contentType
    open fun contentType(): MemorySegment {
        val sel = ObjCRuntime.sel("contentType")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContentType(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentType:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property fileURL
    open fun fileURL(): MemorySegment {
        val sel = ObjCRuntime.sel("fileURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setFileURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFileURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
