@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMorphology
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
open class NSMorphology(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMorphology") }

    }

    // @property grammaticalGender
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun grammaticalGender(): NSGrammaticalGender {
        val sel = ObjCRuntime.sel("grammaticalGender")
        return NSGrammaticalGender(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun setGrammaticalGender(value: NSGrammaticalGender) {
        val sel = ObjCRuntime.sel("setGrammaticalGender:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property partOfSpeech
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun partOfSpeech(): NSGrammaticalPartOfSpeech {
        val sel = ObjCRuntime.sel("partOfSpeech")
        return NSGrammaticalPartOfSpeech(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun setPartOfSpeech(value: NSGrammaticalPartOfSpeech) {
        val sel = ObjCRuntime.sel("setPartOfSpeech:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property number
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun number(): NSGrammaticalNumber {
        val sel = ObjCRuntime.sel("number")
        return NSGrammaticalNumber(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun setNumber(value: NSGrammaticalNumber) {
        val sel = ObjCRuntime.sel("setNumber:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property grammaticalCase
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun grammaticalCase(): NSGrammaticalCase {
        val sel = ObjCRuntime.sel("grammaticalCase")
        return NSGrammaticalCase(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun setGrammaticalCase(value: NSGrammaticalCase) {
        val sel = ObjCRuntime.sel("setGrammaticalCase:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property determination
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun determination(): NSGrammaticalDetermination {
        val sel = ObjCRuntime.sel("determination")
        return NSGrammaticalDetermination(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun setDetermination(value: NSGrammaticalDetermination) {
        val sel = ObjCRuntime.sel("setDetermination:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property grammaticalPerson
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun grammaticalPerson(): NSGrammaticalPerson {
        val sel = ObjCRuntime.sel("grammaticalPerson")
        return NSGrammaticalPerson(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun setGrammaticalPerson(value: NSGrammaticalPerson) {
        val sel = ObjCRuntime.sel("setGrammaticalPerson:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property pronounType
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun pronounType(): NSGrammaticalPronounType {
        val sel = ObjCRuntime.sel("pronounType")
        return NSGrammaticalPronounType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun setPronounType(value: NSGrammaticalPronounType) {
        val sel = ObjCRuntime.sel("setPronounType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property definiteness
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun definiteness(): NSGrammaticalDefiniteness {
        val sel = ObjCRuntime.sel("definiteness")
        return NSGrammaticalDefiniteness(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun setDefiniteness(value: NSGrammaticalDefiniteness) {
        val sel = ObjCRuntime.sel("setDefiniteness:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSMorphology.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSMorphology.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSMorphology.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSMorphology_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSMorphology")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSCustomPronouns on NSMorphology ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 17, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSTermOfAddress instead")
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSTermOfAddress instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 17, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSTermOfAddress instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSTermOfAddress instead")
fun NSMorphology.customPronounForLanguage(language: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("customPronounForLanguage:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, language) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 17, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSTermOfAddress instead")
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSTermOfAddress instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 17, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSTermOfAddress instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSTermOfAddress instead")
fun NSMorphology.setCustomPronoun_forLanguage_error(features: MemorySegment, language: MemorySegment, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("setCustomPronoun:forLanguage:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, features, language, error) as Boolean
}

// ── Category: NSMorphologyUserSettings on NSMorphology ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
fun NSMorphology.isUnspecified(): Boolean {
    val sel = ObjCRuntime.sel("isUnspecified")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// Class method: +[NSMorphology userMorphology]
@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
fun NSMorphology_userMorphology(): MemorySegment {
    val sel = ObjCRuntime.sel("userMorphology")
    val cls = ObjCRuntime.getClass("NSMorphology")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}
