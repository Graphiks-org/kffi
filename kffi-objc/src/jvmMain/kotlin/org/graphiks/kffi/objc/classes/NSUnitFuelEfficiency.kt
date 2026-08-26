package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUnitFuelEfficiency
 * Superclass: NSDimension
 * Protocols: NSSecureCoding
 */
open class NSUnitFuelEfficiency(override val ptr: MemorySegment) : NSDimension(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSUnitFuelEfficiency") }

        fun litersPer100Kilometers(): MemorySegment {
            val sel = ObjCRuntime.sel("litersPer100Kilometers")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun milesPerImperialGallon(): MemorySegment {
            val sel = ObjCRuntime.sel("milesPerImperialGallon")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun milesPerGallon(): MemorySegment {
            val sel = ObjCRuntime.sel("milesPerGallon")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSUnitFuelEfficiency_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSUnitFuelEfficiency")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
