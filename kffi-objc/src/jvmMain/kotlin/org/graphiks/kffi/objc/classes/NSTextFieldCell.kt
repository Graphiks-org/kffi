@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextFieldCell
 * Superclass: NSActionCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSTextFieldCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextFieldCell") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initTextCell(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initTextCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun initImageCell(image: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initImageCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setUpFieldEditorAttributes(textObj: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("setUpFieldEditorAttributes:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textObj) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setWantsNotificationForMarkedText(flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setWantsNotificationForMarkedText:")
        ObjCRuntime.msgSend(null, ptr, sel, flag)
    }

    // @property backgroundColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property drawsBackground
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawsBackground(): Boolean {
        val sel = ObjCRuntime.sel("drawsBackground")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDrawsBackground(value: Boolean) {
        val sel = ObjCRuntime.sel("setDrawsBackground:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property textColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textColor(): MemorySegment {
        val sel = ObjCRuntime.sel("textColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bezelStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bezelStyle(): NSTextFieldBezelStyle {
        val sel = ObjCRuntime.sel("bezelStyle")
        return NSTextFieldBezelStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBezelStyle(value: NSTextFieldBezelStyle) {
        val sel = ObjCRuntime.sel("setBezelStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property placeholderString
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderStringAsString(): String = ObjCRuntime.toJavaString(placeholderString())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderString(value: String) = setPlaceholderString(ObjCRuntime.newNSString(Arena.global(), value))

    // @property placeholderAttributedString
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderAttributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderAttributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderAttributedString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderAttributedString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowedInputSourceLocales
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun allowedInputSourceLocales(): MemorySegment {
        val sel = ObjCRuntime.sel("allowedInputSourceLocales")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setAllowedInputSourceLocales(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAllowedInputSourceLocales:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
