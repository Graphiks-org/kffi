@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextAttachmentCell
 * Superclass: NSCell
 * Protocols: NSTextAttachmentCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSTextAttachmentCell(override val ptr: MemorySegment) : NSCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTextAttachmentCell") } }

    }

}

/**
 * Required by Objective-C protocol NSTextAttachmentCell.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSTextAttachmentCell.attachment(): MemorySegment {
    val sel = ObjCRuntime.sel("attachment")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSTextAttachmentCell.setAttachment(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAttachment:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSTextAttachmentCell. */
fun NSTextAttachmentCell.wantsToTrackMouse(): Boolean {
    val sel = ObjCRuntime.sel("wantsToTrackMouse")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSTextAttachmentCell. */
fun NSTextAttachmentCell.cellBaselineOffset(): NSPoint {
    val sel = ObjCRuntime.sel("cellBaselineOffset")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}

/** Required by Objective-C protocol NSTextAttachmentCell. */
fun NSTextAttachmentCell.drawWithFrame_inView_characterIndex(cellFrame: NSRect, controlView: MemorySegment, charIndex: Long): Unit {
    val sel = ObjCRuntime.sel("drawWithFrame:inView:characterIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView, charIndex)
}

/** Required by Objective-C protocol NSTextAttachmentCell. */
fun NSTextAttachmentCell.drawWithFrame_inView_characterIndex_layoutManager(cellFrame: NSRect, controlView: MemorySegment, charIndex: Long, layoutManager: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawWithFrame:inView:characterIndex:layoutManager:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView, charIndex, layoutManager)
}

/** Required by Objective-C protocol NSTextAttachmentCell. */
fun NSTextAttachmentCell.wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex(theEvent: MemorySegment, cellFrame: NSRect, controlView: MemorySegment, charIndex: Long): Boolean {
    val sel = ObjCRuntime.sel("wantsToTrackMouseForEvent:inRect:ofView:atCharacterIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, theEvent, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView, charIndex) as Boolean
}

/** Required by Objective-C protocol NSTextAttachmentCell. */
fun NSTextAttachmentCell.trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp(theEvent: MemorySegment, cellFrame: NSRect, controlView: MemorySegment, charIndex: Long, flag: Boolean): Boolean {
    val sel = ObjCRuntime.sel("trackMouse:inRect:ofView:atCharacterIndex:untilMouseUp:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, theEvent, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView, charIndex, flag) as Boolean
}

/** Required by Objective-C protocol NSTextAttachmentCell. */
fun NSTextAttachmentCell.cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex(textContainer: MemorySegment, lineFrag: NSRect, position: NSPoint, charIndex: Long): NSRect {
    val sel = ObjCRuntime.sel("cellFrameForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, textContainer, ObjCRuntime.ObjCStructArg(lineFrag.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(position.segment, NSPoint.layout), charIndex))
}
