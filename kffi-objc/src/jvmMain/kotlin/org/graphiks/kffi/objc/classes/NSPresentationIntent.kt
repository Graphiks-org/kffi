@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPresentationIntent
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
open class NSPresentationIntent(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPresentationIntent") }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun paragraphIntentWithIdentity_nestedInsideIntent(identity: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("paragraphIntentWithIdentity:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun headerIntentWithIdentity_level_nestedInsideIntent(identity: Long, level: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("headerIntentWithIdentity:level:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, level, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun codeBlockIntentWithIdentity_languageHint_nestedInsideIntent(identity: Long, languageHint: MemorySegment, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("codeBlockIntentWithIdentity:languageHint:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, languageHint, parent) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun codeBlockIntentWithIdentity_languageHint_nestedInsideIntent(identity: Long, languageHint: String, parent: MemorySegment): MemorySegment = codeBlockIntentWithIdentity_languageHint_nestedInsideIntent(identity, ObjCRuntime.newNSString(Arena.global(), languageHint), parent)

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun thematicBreakIntentWithIdentity_nestedInsideIntent(identity: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("thematicBreakIntentWithIdentity:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun orderedListIntentWithIdentity_nestedInsideIntent(identity: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("orderedListIntentWithIdentity:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun unorderedListIntentWithIdentity_nestedInsideIntent(identity: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unorderedListIntentWithIdentity:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun listItemIntentWithIdentity_ordinal_nestedInsideIntent(identity: Long, ordinal: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("listItemIntentWithIdentity:ordinal:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, ordinal, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun blockQuoteIntentWithIdentity_nestedInsideIntent(identity: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("blockQuoteIntentWithIdentity:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun tableIntentWithIdentity_columnCount_alignments_nestedInsideIntent(identity: Long, columnCount: Long, alignments: MemorySegment, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("tableIntentWithIdentity:columnCount:alignments:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, columnCount, alignments, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun tableHeaderRowIntentWithIdentity_nestedInsideIntent(identity: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("tableHeaderRowIntentWithIdentity:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun tableRowIntentWithIdentity_row_nestedInsideIntent(identity: Long, row: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("tableRowIntentWithIdentity:row:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, row, parent) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        fun tableCellIntentWithIdentity_column_nestedInsideIntent(identity: Long, column: Long, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("tableCellIntentWithIdentity:column:nestedInsideIntent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identity, column, parent) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun isEquivalentToPresentationIntent(other: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("isEquivalentToPresentationIntent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, other) as Boolean
    }

    // @property intentKind
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun intentKind(): NSPresentationIntentKind {
        val sel = ObjCRuntime.sel("intentKind")
        return NSPresentationIntentKind(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property parentIntent
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun parentIntent(): MemorySegment {
        val sel = ObjCRuntime.sel("parentIntent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property identity
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun identity(): Long {
        val sel = ObjCRuntime.sel("identity")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property ordinal
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun ordinal(): Long {
        val sel = ObjCRuntime.sel("ordinal")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property columnAlignments
    /** @return NSArray<NSNumber *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun columnAlignments(): MemorySegment {
        val sel = ObjCRuntime.sel("columnAlignments")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property columnCount
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun columnCount(): Long {
        val sel = ObjCRuntime.sel("columnCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property headerLevel
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun headerLevel(): Long {
        val sel = ObjCRuntime.sel("headerLevel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property languageHint
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun languageHint(): MemorySegment {
        val sel = ObjCRuntime.sel("languageHint")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun languageHintAsString(): String = ObjCRuntime.toJavaString(languageHint())

    // @property column
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun column(): Long {
        val sel = ObjCRuntime.sel("column")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property row
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun row(): Long {
        val sel = ObjCRuntime.sel("row")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property indentationLevel
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun indentationLevel(): Long {
        val sel = ObjCRuntime.sel("indentationLevel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSPresentationIntent.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSPresentationIntent.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSPresentationIntent.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSPresentationIntent_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSPresentationIntent")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
