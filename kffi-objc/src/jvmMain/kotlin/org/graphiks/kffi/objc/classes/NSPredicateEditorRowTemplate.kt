@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPredicateEditorRowTemplate
 * Superclass: NSObject
 * Protocols: NSCoding, NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSPredicateEditorRowTemplate(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPredicateEditorRowTemplate") }

        /** @return NSArray<NSPredicateEditorRowTemplate *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun templatesWithAttributeKeyPaths_inEntityDescription(keyPaths: MemorySegment, entityDescription: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("templatesWithAttributeKeyPaths:inEntityDescription:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, keyPaths, entityDescription) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun matchForPredicate(predicate: MemorySegment): Double {
        val sel = ObjCRuntime.sel("matchForPredicate:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, predicate) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPredicate(predicate: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setPredicate:")
        ObjCRuntime.msgSend(null, ptr, sel, predicate)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun predicateWithSubpredicates(subpredicates: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("predicateWithSubpredicates:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, subpredicates) as MemorySegment
    }

    /** @return NSArray<NSPredicate *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayableSubpredicatesOfPredicate(predicate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("displayableSubpredicatesOfPredicate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, predicate) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithLeftExpressions_rightExpressions_modifier_operators_options(leftExpressions: MemorySegment, rightExpressions: MemorySegment, modifier: NSComparisonPredicateModifier, operators: MemorySegment, options: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLeftExpressions:rightExpressions:modifier:operators:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, leftExpressions, rightExpressions, modifier.rawValue, operators, options) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options(leftExpressions: MemorySegment, attributeType: NSAttributeType, modifier: NSComparisonPredicateModifier, operators: MemorySegment, options: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLeftExpressions:rightExpressionAttributeType:modifier:operators:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, leftExpressions, attributeType.rawValue, modifier.rawValue, operators, options) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCompoundTypes(compoundTypes: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCompoundTypes:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, compoundTypes) as MemorySegment
    }

    // @property templateViews
    /** @return NSArray<NSView *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun templateViews(): MemorySegment {
        val sel = ObjCRuntime.sel("templateViews")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property leftExpressions
    /** @return NSArray<NSExpression *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun leftExpressions(): MemorySegment {
        val sel = ObjCRuntime.sel("leftExpressions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property rightExpressions
    /** @return NSArray<NSExpression *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rightExpressions(): MemorySegment {
        val sel = ObjCRuntime.sel("rightExpressions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property rightExpressionAttributeType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rightExpressionAttributeType(): NSAttributeType {
        val sel = ObjCRuntime.sel("rightExpressionAttributeType")
        return NSAttributeType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property modifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun modifier(): NSComparisonPredicateModifier {
        val sel = ObjCRuntime.sel("modifier")
        return NSComparisonPredicateModifier(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property operators
    /** @return NSArray<NSNumber *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun operators(): MemorySegment {
        val sel = ObjCRuntime.sel("operators")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property options
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun options(): Long {
        val sel = ObjCRuntime.sel("options")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property compoundTypes
    /** @return NSArray<NSNumber *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun compoundTypes(): MemorySegment {
        val sel = ObjCRuntime.sel("compoundTypes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSPredicateEditorRowTemplate.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSPredicateEditorRowTemplate.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/** Required by Objective-C protocol NSCopying. */
fun NSPredicateEditorRowTemplate.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
