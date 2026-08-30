@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSharingService
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
open class NSSharingService(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSharingService") } }

        /** @return NSArray<NSSharingService *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSSharingServicePicker standardShareMenuItem] instead.")
        fun sharingServicesForItems(items: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("sharingServicesForItems:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, items) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharingServiceNamed(serviceName: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("sharingServiceNamed:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, serviceName) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithTitle_image_alternateImage_handler(title: MemorySegment, image: MemorySegment, alternateImage: MemorySegment, block: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTitle:image:alternateImage:handler:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, title, image, alternateImage, block) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithTitle_image_alternateImage_handler(title: String, image: MemorySegment, alternateImage: MemorySegment, block: MemorySegment): MemorySegment = initWithTitle_image_alternateImage_handler(ObjCRuntime.newNSString(Arena.global(), title), image, alternateImage, block)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canPerformWithItems(items: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("canPerformWithItems:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, items) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performWithItems(items: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performWithItems:")
        ObjCRuntime.msgSend(null, ptr, sel, items)
    }

    // @property delegate
    /** @return id<NSSharingServiceDelegate> */
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

    // @property title
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    // @property image
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property alternateImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alternateImage(): MemorySegment {
        val sel = ObjCRuntime.sel("alternateImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property menuItemTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun menuItemTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("menuItemTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun setMenuItemTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMenuItemTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun menuItemTitleAsString(): String = ObjCRuntime.toJavaString(menuItemTitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun setMenuItemTitle(value: String) = setMenuItemTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property recipients
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun recipients(): MemorySegment {
        val sel = ObjCRuntime.sel("recipients")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun setRecipients(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRecipients:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property subject
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun subject(): MemorySegment {
        val sel = ObjCRuntime.sel("subject")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun setSubject(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSubject:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun subjectAsString(): String = ObjCRuntime.toJavaString(subject())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun setSubject(value: String) = setSubject(ObjCRuntime.newNSString(Arena.global(), value))

    // @property messageBody
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun messageBody(): MemorySegment {
        val sel = ObjCRuntime.sel("messageBody")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun messageBodyAsString(): String = ObjCRuntime.toJavaString(messageBody())

    // @property permanentLink
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun permanentLink(): MemorySegment {
        val sel = ObjCRuntime.sel("permanentLink")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property accountName
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun accountName(): MemorySegment {
        val sel = ObjCRuntime.sel("accountName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun accountNameAsString(): String = ObjCRuntime.toJavaString(accountName())

    // @property attachmentFileURLs
    /** @return NSArray<NSURL *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun attachmentFileURLs(): MemorySegment {
        val sel = ObjCRuntime.sel("attachmentFileURLs")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
