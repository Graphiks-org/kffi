@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDate
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSDate(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSDate") } }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithTimeIntervalSinceReferenceDate(ti: Double): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTimeIntervalSinceReferenceDate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ti) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property timeIntervalSinceReferenceDate
    open fun timeIntervalSinceReferenceDate(): Double {
        val sel = ObjCRuntime.sel("timeIntervalSinceReferenceDate")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSDate.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSDate.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSDate_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSExtendedDate on NSDate ─────────────────────────────────────────

fun NSDate.timeIntervalSinceDate(anotherDate: MemorySegment): Double {
    val sel = ObjCRuntime.sel("timeIntervalSinceDate:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, anotherDate) as Double
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dateByAddingTimeInterval instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use dateByAddingTimeInterval instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dateByAddingTimeInterval instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dateByAddingTimeInterval instead")
fun NSDate.addTimeInterval(seconds: Double): MemorySegment {
    val sel = ObjCRuntime.sel("addTimeInterval:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, seconds) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDate.dateByAddingTimeInterval(ti: Double): MemorySegment {
    val sel = ObjCRuntime.sel("dateByAddingTimeInterval:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ti) as MemorySegment
}

fun NSDate.earlierDate(anotherDate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("earlierDate:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, anotherDate) as MemorySegment
}

fun NSDate.laterDate(anotherDate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("laterDate:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, anotherDate) as MemorySegment
}

fun NSDate.compare(other: MemorySegment): NSComparisonResult {
    val sel = ObjCRuntime.sel("compare:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, other) as Long)
}

fun NSDate.isEqualToDate(otherDate: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToDate:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, otherDate) as Boolean
}

fun NSDate.descriptionWithLocale(locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithLocale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale) as MemorySegment
}

fun NSDate.timeIntervalSinceNow(): Double {
    val sel = ObjCRuntime.sel("timeIntervalSinceNow")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSDate.timeIntervalSince1970(): Double {
    val sel = ObjCRuntime.sel("timeIntervalSince1970")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSDate.description(): MemorySegment {
    val sel = ObjCRuntime.sel("description")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSDate timeIntervalSinceReferenceDate]
fun NSDate_timeIntervalSinceReferenceDate(): Double {
    val sel = ObjCRuntime.sel("timeIntervalSinceReferenceDate")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, cls, sel) as Double
}

// ── Category: NSDateCreation on NSDate ─────────────────────────────────────────

fun NSDate.initWithTimeIntervalSinceNow(secs: Double): MemorySegment {
    val sel = ObjCRuntime.sel("initWithTimeIntervalSinceNow:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, secs) as MemorySegment
}

fun NSDate.initWithTimeIntervalSince1970(secs: Double): MemorySegment {
    val sel = ObjCRuntime.sel("initWithTimeIntervalSince1970:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, secs) as MemorySegment
}

fun NSDate.initWithTimeInterval_sinceDate(secsToBeAdded: Double, date: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithTimeInterval:sinceDate:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, secsToBeAdded, date) as MemorySegment
}

// Class method: +[NSDate date]
fun NSDate_date(): MemorySegment {
    val sel = ObjCRuntime.sel("date")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSDate dateWithTimeIntervalSinceNow:]
fun NSDate_dateWithTimeIntervalSinceNow(secs: Double): MemorySegment {
    val sel = ObjCRuntime.sel("dateWithTimeIntervalSinceNow:")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, secs) as MemorySegment
}

// Class method: +[NSDate dateWithTimeIntervalSinceReferenceDate:]
fun NSDate_dateWithTimeIntervalSinceReferenceDate(ti: Double): MemorySegment {
    val sel = ObjCRuntime.sel("dateWithTimeIntervalSinceReferenceDate:")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ti) as MemorySegment
}

// Class method: +[NSDate dateWithTimeIntervalSince1970:]
fun NSDate_dateWithTimeIntervalSince1970(secs: Double): MemorySegment {
    val sel = ObjCRuntime.sel("dateWithTimeIntervalSince1970:")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, secs) as MemorySegment
}

// Class method: +[NSDate dateWithTimeInterval:sinceDate:]
fun NSDate_dateWithTimeInterval_sinceDate(secsToBeAdded: Double, date: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dateWithTimeInterval:sinceDate:")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, secsToBeAdded, date) as MemorySegment
}

// Class method: +[NSDate distantFuture]
fun NSDate_distantFuture(): MemorySegment {
    val sel = ObjCRuntime.sel("distantFuture")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSDate distantPast]
fun NSDate_distantPast(): MemorySegment {
    val sel = ObjCRuntime.sel("distantPast")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSDate now]
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSDate_now(): MemorySegment {
    val sel = ObjCRuntime.sel("now")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSCalendarDateExtras on NSDate ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSDate.dateWithCalendarFormat_timeZone(format: MemorySegment, aTimeZone: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dateWithCalendarFormat:timeZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, aTimeZone) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSDate.descriptionWithCalendarFormat_timeZone_locale(format: MemorySegment, aTimeZone: MemorySegment, locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithCalendarFormat:timeZone:locale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, aTimeZone, locale) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDateFormatter instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use NSDateFormatter instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDateFormatter instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDateFormatter instead")
fun NSDate.initWithString(description: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, description) as MemorySegment
}

// Class method: +[NSDate dateWithNaturalLanguageString:locale:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
fun NSDate_dateWithNaturalLanguageString_locale(string: MemorySegment, locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dateWithNaturalLanguageString:locale:")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, string, locale) as MemorySegment
}

// Class method: +[NSDate dateWithNaturalLanguageString:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
fun NSDate_dateWithNaturalLanguageString(string: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dateWithNaturalLanguageString:")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, string) as MemorySegment
}

// Class method: +[NSDate dateWithString:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDateFormatter instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use NSDateFormatter instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDateFormatter instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDateFormatter instead")
fun NSDate_dateWithString(aString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dateWithString:")
    val cls = ObjCRuntime.getClass("NSDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, aString) as MemorySegment
}
