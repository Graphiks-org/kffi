package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSInputManager
 * Superclass: NSObject
 * Protocols: NSTextInput
 */
open class NSInputManager(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSInputManager") }

        fun currentInputManager(): MemorySegment {
            val sel = ObjCRuntime.sel("currentInputManager")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun cycleToNextInputLanguage(sender: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("cycleToNextInputLanguage:")
            ObjCRuntime.msgSend(null, _class, sel, sender)
        }

        fun cycleToNextInputServerInLanguage(sender: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("cycleToNextInputServerInLanguage:")
            ObjCRuntime.msgSend(null, _class, sel, sender)
        }

    }

    open fun initWithName_host(inputServerName: MemorySegment, hostName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithName:host:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, inputServerName, hostName) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithName_host(inputServerName: String, hostName: String): MemorySegment = initWithName_host(ObjCRuntime.newNSString(Arena.global(), inputServerName), ObjCRuntime.newNSString(Arena.global(), hostName))

    open fun localizedInputManagerName(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedInputManagerName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    fun localizedInputManagerNameAsString(): String = ObjCRuntime.toJavaString(localizedInputManagerName())

    open fun markedTextAbandoned(cli: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("markedTextAbandoned:")
        ObjCRuntime.msgSend(null, ptr, sel, cli)
    }

    open fun markedTextSelectionChanged_client(newSel: NSRange, cli: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("markedTextSelectionChanged:client:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newSel.segment, NSRange.layout), cli)
    }

    open fun wantsToInterpretAllKeystrokes(): Boolean {
        val sel = ObjCRuntime.sel("wantsToInterpretAllKeystrokes")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun language(): MemorySegment {
        val sel = ObjCRuntime.sel("language")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    fun languageAsString(): String = ObjCRuntime.toJavaString(language())

    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun server(): MemorySegment {
        val sel = ObjCRuntime.sel("server")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun wantsToHandleMouseEvents(): Boolean {
        val sel = ObjCRuntime.sel("wantsToHandleMouseEvents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun handleMouseEvent(mouseEvent: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("handleMouseEvent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, mouseEvent) as Boolean
    }

    open fun wantsToDelayTextChangeNotifications(): Boolean {
        val sel = ObjCRuntime.sel("wantsToDelayTextChangeNotifications")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.insertText(string: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("insertText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, string)
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.doCommandBySelector(selector: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("doCommandBySelector:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selector)
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.setMarkedText_selectedRange(string: MemorySegment, selRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setMarkedText:selectedRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, string, ObjCRuntime.ObjCStructArg(selRange.segment, NSRange.layout))
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.unmarkText(): Unit {
    val sel = ObjCRuntime.sel("unmarkText")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.hasMarkedText(): Boolean {
    val sel = ObjCRuntime.sel("hasMarkedText")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.conversationIdentifier(): Long {
    val sel = ObjCRuntime.sel("conversationIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.attributedSubstringFromRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("attributedSubstringFromRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.markedRange(): NSRange {
    val sel = ObjCRuntime.sel("markedRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.selectedRange(): NSRange {
    val sel = ObjCRuntime.sel("selectedRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.firstRectForCharacterRange(range: NSRange): NSRect {
    val sel = ObjCRuntime.sel("firstRectForCharacterRange:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.characterIndexForPoint(point: NSPoint): Long {
    val sel = ObjCRuntime.sel("characterIndexForPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
}

/** Required by Objective-C protocol NSTextInput. */
fun NSInputManager.validAttributesForMarkedText(): MemorySegment {
    val sel = ObjCRuntime.sel("validAttributesForMarkedText")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
