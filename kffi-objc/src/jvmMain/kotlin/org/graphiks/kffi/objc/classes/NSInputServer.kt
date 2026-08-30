@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSInputServer
 * Superclass: NSObject
 * Protocols: NSInputServiceProvider, NSInputServerMouseTracker
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
open class NSInputServer(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSInputServer") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
    open fun initWithDelegate_name(delegate: MemorySegment, name: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDelegate:name:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, delegate, name) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
    fun initWithDelegate_name(delegate: MemorySegment, name: String): MemorySegment = initWithDelegate_name(delegate, ObjCRuntime.newNSString(Arena.global(), name))

}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.insertText_client(string: MemorySegment, sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("insertText:client:")
    ObjCRuntime.msgSend(null, this.ptr, sel, string, sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.doCommandBySelector_client(selector: MemorySegment, sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("doCommandBySelector:client:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selector, sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.markedTextAbandoned(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("markedTextAbandoned:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.markedTextSelectionChanged_client(newSel: NSRange, sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("markedTextSelectionChanged:client:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(newSel.segment, NSRange.layout), sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.terminate(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("terminate:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.canBeDisabled(): Boolean {
    val sel = ObjCRuntime.sel("canBeDisabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.wantsToInterpretAllKeystrokes(): Boolean {
    val sel = ObjCRuntime.sel("wantsToInterpretAllKeystrokes")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.wantsToHandleMouseEvents(): Boolean {
    val sel = ObjCRuntime.sel("wantsToHandleMouseEvents")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.wantsToDelayTextChangeNotifications(): Boolean {
    val sel = ObjCRuntime.sel("wantsToDelayTextChangeNotifications")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.inputClientBecomeActive(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("inputClientBecomeActive:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.inputClientResignActive(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("inputClientResignActive:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.inputClientEnabled(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("inputClientEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.inputClientDisabled(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("inputClientDisabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.activeConversationWillChange_fromOldConversation(sender: MemorySegment, oldConversation: Long): Unit {
    val sel = ObjCRuntime.sel("activeConversationWillChange:fromOldConversation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender, oldConversation)
}

/** Required by Objective-C protocol NSInputServiceProvider. */
fun NSInputServer.activeConversationChanged_toNewConversation(sender: MemorySegment, newConversation: Long): Unit {
    val sel = ObjCRuntime.sel("activeConversationChanged:toNewConversation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender, newConversation)
}

/** Required by Objective-C protocol NSInputServerMouseTracker. */
fun NSInputServer.mouseDownOnCharacterIndex_atCoordinate_withModifier_client(index: Long, point: NSPoint, flags: Long, sender: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("mouseDownOnCharacterIndex:atCoordinate:withModifier:client:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, index, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), flags, sender) as Boolean
}

/** Required by Objective-C protocol NSInputServerMouseTracker. */
fun NSInputServer.mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client(index: Long, point: NSPoint, flags: Long, sender: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("mouseDraggedOnCharacterIndex:atCoordinate:withModifier:client:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, index, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), flags, sender) as Boolean
}

/** Required by Objective-C protocol NSInputServerMouseTracker. */
fun NSInputServer.mouseUpOnCharacterIndex_atCoordinate_withModifier_client(index: Long, point: NSPoint, flags: Long, sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseUpOnCharacterIndex:atCoordinate:withModifier:client:")
    ObjCRuntime.msgSend(null, this.ptr, sel, index, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), flags, sender)
}
