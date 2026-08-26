package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDecimalNumberHandler
 * Superclass: NSObject
 * Protocols: NSDecimalNumberBehaviors, NSCoding
 */
open class NSDecimalNumberHandler(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSDecimalNumberHandler") }

        fun decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero(roundingMode: NSRoundingMode, scale: Short, exact: Boolean, overflow: Boolean, underflow: Boolean, divideByZero: Boolean): MemorySegment {
            val sel = ObjCRuntime.sel("decimalNumberHandlerWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, roundingMode.rawValue, scale, exact, overflow, underflow, divideByZero) as MemorySegment
        }

        fun defaultDecimalNumberHandler(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultDecimalNumberHandler")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero(roundingMode: NSRoundingMode, scale: Short, exact: Boolean, overflow: Boolean, underflow: Boolean, divideByZero: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, roundingMode.rawValue, scale, exact, overflow, underflow, divideByZero) as MemorySegment
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _scale: Int
    // ivar: _roundingMode: Int
    // ivar: _raiseOnExactness: Int
    // ivar: _raiseOnOverflow: Int
    // ivar: _raiseOnUnderflow: Int
    // ivar: _raiseOnDivideByZero: Int
    // ivar: _unused: Int
    // ivar: _reserved2: MemorySegment
    // ivar: _reserved: MemorySegment
}

/** Required by Objective-C protocol NSDecimalNumberBehaviors. */
fun NSDecimalNumberHandler.roundingMode(): NSRoundingMode {
    val sel = ObjCRuntime.sel("roundingMode")
    return NSRoundingMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

/** Required by Objective-C protocol NSDecimalNumberBehaviors. */
fun NSDecimalNumberHandler.scale(): Short {
    val sel = ObjCRuntime.sel("scale")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_SHORT, this.ptr, sel) as Short
}

/** Required by Objective-C protocol NSDecimalNumberBehaviors. */
fun NSDecimalNumberHandler.exceptionDuringOperation_error_leftOperand_rightOperand(operation: MemorySegment, error: NSCalculationError, leftOperand: MemorySegment, rightOperand: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("exceptionDuringOperation:error:leftOperand:rightOperand:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, operation, error.rawValue, leftOperand, rightOperand) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSDecimalNumberHandler.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSDecimalNumberHandler.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
