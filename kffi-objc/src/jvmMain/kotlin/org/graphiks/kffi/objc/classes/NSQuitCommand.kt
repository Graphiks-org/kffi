@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSQuitCommand
 * Superclass: NSScriptCommand
 */
open class NSQuitCommand(override val ptr: MemorySegment) : NSScriptCommand(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSQuitCommand") } }

    }

    // @property saveOptions
    open fun saveOptions(): NSSaveOptions {
        val sel = ObjCRuntime.sel("saveOptions")
        return NSSaveOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}
