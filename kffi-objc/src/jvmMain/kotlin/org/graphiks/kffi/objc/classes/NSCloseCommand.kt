@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCloseCommand
 * Superclass: NSScriptCommand
 */
open class NSCloseCommand(override val ptr: MemorySegment) : NSScriptCommand(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCloseCommand") }

    }

    // @property saveOptions
    open fun saveOptions(): NSSaveOptions {
        val sel = ObjCRuntime.sel("saveOptions")
        return NSSaveOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}
