@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSATSTypesetter
 * Superclass: NSTypesetter
 */
open class NSATSTypesetter(override val ptr: MemorySegment) : NSTypesetter(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSATSTypesetter") } }

        fun sharedTypesetter(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedTypesetter")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

}

// ── Category: NSPantherCompatibility on NSATSTypesetter ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSATSTypesetter.lineFragmentRectForProposedRect_remainingRect(proposedRect: NSRect, remainingRect: NSRectPointer): NSRect {
    val sel = ObjCRuntime.sel("lineFragmentRectForProposedRect:remainingRect:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(proposedRect.segment, NSRect.layout), remainingRect.segment))
}

// ── Category: NSPrimitiveInterface on NSATSTypesetter ─────────────────────────────────────────

// ── Category: NSLayoutPhaseInterface on NSATSTypesetter ─────────────────────────────────────────

// ── Category: NSGlyphStorageInterface on NSATSTypesetter ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1)
fun NSATSTypesetter.getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits(glyphsRange: NSRange, glyphBuffer: MemorySegment, charIndexBuffer: MemorySegment, inscribeBuffer: MemorySegment, elasticBuffer: MemorySegment): Long {
    val sel = ObjCRuntime.sel("getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphsRange.segment, NSRange.layout), glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer) as Long
}
