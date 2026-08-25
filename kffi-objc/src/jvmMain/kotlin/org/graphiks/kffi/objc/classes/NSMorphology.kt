package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMorphology
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSMorphology(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMorphology") }

    }

    // @property grammaticalGender
    open fun grammaticalGender(): NSGrammaticalGender {
        val sel = ObjCRuntime.sel("grammaticalGender")
        return NSGrammaticalGender(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setGrammaticalGender(value: NSGrammaticalGender) {
        val sel = ObjCRuntime.sel("setGrammaticalGender:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property partOfSpeech
    open fun partOfSpeech(): NSGrammaticalPartOfSpeech {
        val sel = ObjCRuntime.sel("partOfSpeech")
        return NSGrammaticalPartOfSpeech(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setPartOfSpeech(value: NSGrammaticalPartOfSpeech) {
        val sel = ObjCRuntime.sel("setPartOfSpeech:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property number
    open fun number(): NSGrammaticalNumber {
        val sel = ObjCRuntime.sel("number")
        return NSGrammaticalNumber(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setNumber(value: NSGrammaticalNumber) {
        val sel = ObjCRuntime.sel("setNumber:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property grammaticalCase
    open fun grammaticalCase(): NSGrammaticalCase {
        val sel = ObjCRuntime.sel("grammaticalCase")
        return NSGrammaticalCase(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setGrammaticalCase(value: NSGrammaticalCase) {
        val sel = ObjCRuntime.sel("setGrammaticalCase:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property determination
    open fun determination(): NSGrammaticalDetermination {
        val sel = ObjCRuntime.sel("determination")
        return NSGrammaticalDetermination(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDetermination(value: NSGrammaticalDetermination) {
        val sel = ObjCRuntime.sel("setDetermination:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property grammaticalPerson
    open fun grammaticalPerson(): NSGrammaticalPerson {
        val sel = ObjCRuntime.sel("grammaticalPerson")
        return NSGrammaticalPerson(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setGrammaticalPerson(value: NSGrammaticalPerson) {
        val sel = ObjCRuntime.sel("setGrammaticalPerson:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property pronounType
    open fun pronounType(): NSGrammaticalPronounType {
        val sel = ObjCRuntime.sel("pronounType")
        return NSGrammaticalPronounType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setPronounType(value: NSGrammaticalPronounType) {
        val sel = ObjCRuntime.sel("setPronounType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property definiteness
    open fun definiteness(): NSGrammaticalDefiniteness {
        val sel = ObjCRuntime.sel("definiteness")
        return NSGrammaticalDefiniteness(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDefiniteness(value: NSGrammaticalDefiniteness) {
        val sel = ObjCRuntime.sel("setDefiniteness:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}

// ── Category: NSCustomPronouns on NSMorphology ─────────────────────────────────────────

fun NSMorphology.customPronounForLanguage(language: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("customPronounForLanguage:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, language) as MemorySegment
}

fun NSMorphology.setCustomPronoun_forLanguage_error(features: MemorySegment, language: MemorySegment, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("setCustomPronoun:forLanguage:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, features, language, error) as Boolean
}

// ── Category: NSMorphologyUserSettings on NSMorphology ─────────────────────────────────────────

fun NSMorphology.isUnspecified(): Boolean {
    val sel = ObjCRuntime.sel("isUnspecified")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// Class method: +[NSMorphology userMorphology]
fun NSMorphology_userMorphology(): MemorySegment {
    val sel = ObjCRuntime.sel("userMorphology")
    val cls = ObjCRuntime.getClass("NSMorphology")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// @property userMorphology
fun NSMorphology.userMorphology(): MemorySegment {
    val sel = ObjCRuntime.sel("userMorphology")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
