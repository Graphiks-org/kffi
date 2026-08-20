package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for root class NSObject.
 * Synthesised because it is referenced as a superclass by generated classes
 * but was not included in the framework filter set.
 */
open class NSObject(open val ptr: MemorySegment) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSObject") }
    }

}
