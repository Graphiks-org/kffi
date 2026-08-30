@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSharingCollaborationModeRestriction
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
open class NSSharingCollaborationModeRestriction(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSharingCollaborationModeRestriction") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithDisabledMode(disabledMode: NSSharingCollaborationMode): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDisabledMode:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, disabledMode.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithDisabledMode_alertTitle_alertMessage(disabledMode: NSSharingCollaborationMode, alertTitle: MemorySegment, alertMessage: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDisabledMode:alertTitle:alertMessage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, disabledMode.rawValue, alertTitle, alertMessage) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithDisabledMode_alertTitle_alertMessage(disabledMode: NSSharingCollaborationMode, alertTitle: String, alertMessage: String): MemorySegment = initWithDisabledMode_alertTitle_alertMessage(disabledMode, ObjCRuntime.newNSString(Arena.global(), alertTitle), ObjCRuntime.newNSString(Arena.global(), alertMessage))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithDisabledMode_alertTitle_alertMessage_alertDismissButtonTitle(disabledMode: NSSharingCollaborationMode, alertTitle: MemorySegment, alertMessage: MemorySegment, alertDismissButtonTitle: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDisabledMode:alertTitle:alertMessage:alertDismissButtonTitle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, disabledMode.rawValue, alertTitle, alertMessage, alertDismissButtonTitle) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithDisabledMode_alertTitle_alertMessage_alertDismissButtonTitle(disabledMode: NSSharingCollaborationMode, alertTitle: String, alertMessage: String, alertDismissButtonTitle: String): MemorySegment = initWithDisabledMode_alertTitle_alertMessage_alertDismissButtonTitle(disabledMode, ObjCRuntime.newNSString(Arena.global(), alertTitle), ObjCRuntime.newNSString(Arena.global(), alertMessage), ObjCRuntime.newNSString(Arena.global(), alertDismissButtonTitle))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithDisabledMode_alertTitle_alertMessage_alertDismissButtonTitle_alertRecoverySuggestionButtonTitle_alertRecoverySuggestionButtonLaunchURL(disabledMode: NSSharingCollaborationMode, alertTitle: MemorySegment, alertMessage: MemorySegment, alertDismissButtonTitle: MemorySegment, alertRecoverySuggestionButtonTitle: MemorySegment, alertRecoverySuggestionButtonLaunchURL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDisabledMode:alertTitle:alertMessage:alertDismissButtonTitle:alertRecoverySuggestionButtonTitle:alertRecoverySuggestionButtonLaunchURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, disabledMode.rawValue, alertTitle, alertMessage, alertDismissButtonTitle, alertRecoverySuggestionButtonTitle, alertRecoverySuggestionButtonLaunchURL) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithDisabledMode_alertTitle_alertMessage_alertDismissButtonTitle_alertRecoverySuggestionButtonTitle_alertRecoverySuggestionButtonLaunchURL(disabledMode: NSSharingCollaborationMode, alertTitle: String, alertMessage: String, alertDismissButtonTitle: String, alertRecoverySuggestionButtonTitle: String, alertRecoverySuggestionButtonLaunchURL: MemorySegment): MemorySegment = initWithDisabledMode_alertTitle_alertMessage_alertDismissButtonTitle_alertRecoverySuggestionButtonTitle_alertRecoverySuggestionButtonLaunchURL(disabledMode, ObjCRuntime.newNSString(Arena.global(), alertTitle), ObjCRuntime.newNSString(Arena.global(), alertMessage), ObjCRuntime.newNSString(Arena.global(), alertDismissButtonTitle), ObjCRuntime.newNSString(Arena.global(), alertRecoverySuggestionButtonTitle), alertRecoverySuggestionButtonLaunchURL)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property disabledMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun disabledMode(): NSSharingCollaborationMode {
        val sel = ObjCRuntime.sel("disabledMode")
        return NSSharingCollaborationMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property alertTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("alertTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertTitleAsString(): String = ObjCRuntime.toJavaString(alertTitle())

    // @property alertMessage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertMessage(): MemorySegment {
        val sel = ObjCRuntime.sel("alertMessage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertMessageAsString(): String = ObjCRuntime.toJavaString(alertMessage())

    // @property alertDismissButtonTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertDismissButtonTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("alertDismissButtonTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertDismissButtonTitleAsString(): String = ObjCRuntime.toJavaString(alertDismissButtonTitle())

    // @property alertRecoverySuggestionButtonTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertRecoverySuggestionButtonTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("alertRecoverySuggestionButtonTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertRecoverySuggestionButtonTitleAsString(): String = ObjCRuntime.toJavaString(alertRecoverySuggestionButtonTitle())

    // @property alertRecoverySuggestionButtonLaunchURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertRecoverySuggestionButtonLaunchURL(): MemorySegment {
        val sel = ObjCRuntime.sel("alertRecoverySuggestionButtonLaunchURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSSharingCollaborationModeRestriction.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSSharingCollaborationModeRestriction.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSSharingCollaborationModeRestriction_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSSharingCollaborationModeRestriction")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun NSSharingCollaborationModeRestriction.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
