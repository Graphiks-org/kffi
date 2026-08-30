@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUserNotification
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
open class NSUserNotification(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSUserNotification") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property title
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setTitle(value: String) = setTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property subtitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun subtitle(): MemorySegment {
        val sel = ObjCRuntime.sel("subtitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setSubtitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSubtitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun subtitleAsString(): String = ObjCRuntime.toJavaString(subtitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setSubtitle(value: String) = setSubtitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property informativeText
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun informativeText(): MemorySegment {
        val sel = ObjCRuntime.sel("informativeText")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setInformativeText(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setInformativeText:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun informativeTextAsString(): String = ObjCRuntime.toJavaString(informativeText())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setInformativeText(value: String) = setInformativeText(ObjCRuntime.newNSString(Arena.global(), value))

    // @property actionButtonTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun actionButtonTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("actionButtonTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setActionButtonTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setActionButtonTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun actionButtonTitleAsString(): String = ObjCRuntime.toJavaString(actionButtonTitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setActionButtonTitle(value: String) = setActionButtonTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property userInfo
    /** @return NSDictionary<NSString *,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun userInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("userInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setUserInfo(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setUserInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property deliveryDate
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun deliveryDate(): MemorySegment {
        val sel = ObjCRuntime.sel("deliveryDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setDeliveryDate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDeliveryDate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property deliveryTimeZone
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun deliveryTimeZone(): MemorySegment {
        val sel = ObjCRuntime.sel("deliveryTimeZone")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setDeliveryTimeZone(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDeliveryTimeZone:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property deliveryRepeatInterval
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun deliveryRepeatInterval(): MemorySegment {
        val sel = ObjCRuntime.sel("deliveryRepeatInterval")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setDeliveryRepeatInterval(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDeliveryRepeatInterval:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property actualDeliveryDate
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun actualDeliveryDate(): MemorySegment {
        val sel = ObjCRuntime.sel("actualDeliveryDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property presented
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun isPresented(): Boolean {
        val sel = ObjCRuntime.sel("isPresented")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property remote
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun isRemote(): Boolean {
        val sel = ObjCRuntime.sel("isRemote")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property soundName
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun soundName(): MemorySegment {
        val sel = ObjCRuntime.sel("soundName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setSoundName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSoundName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun soundNameAsString(): String = ObjCRuntime.toJavaString(soundName())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setSoundName(value: String) = setSoundName(ObjCRuntime.newNSString(Arena.global(), value))

    // @property hasActionButton
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun hasActionButton(): Boolean {
        val sel = ObjCRuntime.sel("hasActionButton")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setHasActionButton(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasActionButton:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property activationType
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun activationType(): NSUserNotificationActivationType {
        val sel = ObjCRuntime.sel("activationType")
        return NSUserNotificationActivationType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property otherButtonTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun otherButtonTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("otherButtonTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setOtherButtonTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setOtherButtonTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun otherButtonTitleAsString(): String = ObjCRuntime.toJavaString(otherButtonTitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setOtherButtonTitle(value: String) = setOtherButtonTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property identifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun identifier(): MemorySegment {
        val sel = ObjCRuntime.sel("identifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun identifierAsString(): String = ObjCRuntime.toJavaString(identifier())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setIdentifier(value: String) = setIdentifier(ObjCRuntime.newNSString(Arena.global(), value))

    // @property contentImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun contentImage(): MemorySegment {
        val sel = ObjCRuntime.sel("contentImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setContentImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasReplyButton
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun hasReplyButton(): Boolean {
        val sel = ObjCRuntime.sel("hasReplyButton")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setHasReplyButton(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasReplyButton:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property responsePlaceholder
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun responsePlaceholder(): MemorySegment {
        val sel = ObjCRuntime.sel("responsePlaceholder")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setResponsePlaceholder(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setResponsePlaceholder:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun responsePlaceholderAsString(): String = ObjCRuntime.toJavaString(responsePlaceholder())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setResponsePlaceholder(value: String) = setResponsePlaceholder(ObjCRuntime.newNSString(Arena.global(), value))

    // @property response
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun response(): MemorySegment {
        val sel = ObjCRuntime.sel("response")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property additionalActions
    /** @return NSArray<NSUserNotificationAction *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun additionalActions(): MemorySegment {
        val sel = ObjCRuntime.sel("additionalActions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setAdditionalActions(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAdditionalActions:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property additionalActivationAction
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun additionalActivationAction(): MemorySegment {
        val sel = ObjCRuntime.sel("additionalActivationAction")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _internal: MemorySegment
}

/** Required by Objective-C protocol NSCopying. */
fun NSUserNotification.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
