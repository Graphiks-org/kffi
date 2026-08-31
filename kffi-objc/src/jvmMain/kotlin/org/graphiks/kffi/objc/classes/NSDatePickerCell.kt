@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDatePickerCell
 * Superclass: NSActionCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSDatePickerCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSDatePickerCell") } }

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

    // @property datePickerStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun datePickerStyle(): NSDatePickerStyle {
        val sel = ObjCRuntime.sel("datePickerStyle")
        return NSDatePickerStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDatePickerStyle(value: NSDatePickerStyle) {
        val sel = ObjCRuntime.sel("setDatePickerStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property datePickerMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun datePickerMode(): NSDatePickerMode {
        val sel = ObjCRuntime.sel("datePickerMode")
        return NSDatePickerMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDatePickerMode(value: NSDatePickerMode) {
        val sel = ObjCRuntime.sel("setDatePickerMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property datePickerElements
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun datePickerElements(): NSDatePickerElementFlags {
        val sel = ObjCRuntime.sel("datePickerElements")
        return NSDatePickerElementFlags(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDatePickerElements(value: NSDatePickerElementFlags) {
        val sel = ObjCRuntime.sel("setDatePickerElements:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property calendar
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun calendar(): MemorySegment {
        val sel = ObjCRuntime.sel("calendar")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCalendar(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCalendar:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property locale
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun locale(): MemorySegment {
        val sel = ObjCRuntime.sel("locale")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLocale(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLocale:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property timeZone
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun timeZone(): MemorySegment {
        val sel = ObjCRuntime.sel("timeZone")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTimeZone(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTimeZone:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property dateValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dateValue(): MemorySegment {
        val sel = ObjCRuntime.sel("dateValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDateValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDateValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property timeInterval
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun timeInterval(): Double {
        val sel = ObjCRuntime.sel("timeInterval")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTimeInterval(value: Double) {
        val sel = ObjCRuntime.sel("setTimeInterval:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minDate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minDate(): MemorySegment {
        val sel = ObjCRuntime.sel("minDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinDate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMinDate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maxDate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maxDate(): MemorySegment {
        val sel = ObjCRuntime.sel("maxDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaxDate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMaxDate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSDatePickerCellDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
