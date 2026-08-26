package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUnitElectricPotentialDifference
 * Superclass: NSDimension
 * Protocols: NSSecureCoding
 */
open class NSUnitElectricPotentialDifference(override val ptr: MemorySegment) : NSDimension(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSUnitElectricPotentialDifference") }

        fun megavolts(): MemorySegment {
            val sel = ObjCRuntime.sel("megavolts")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun kilovolts(): MemorySegment {
            val sel = ObjCRuntime.sel("kilovolts")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun volts(): MemorySegment {
            val sel = ObjCRuntime.sel("volts")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun millivolts(): MemorySegment {
            val sel = ObjCRuntime.sel("millivolts")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun microvolts(): MemorySegment {
            val sel = ObjCRuntime.sel("microvolts")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSUnitElectricPotentialDifference_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSUnitElectricPotentialDifference")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
