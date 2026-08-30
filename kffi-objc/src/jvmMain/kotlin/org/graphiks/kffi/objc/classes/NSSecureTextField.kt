@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSecureTextField
 * Superclass: NSTextField
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSecureTextField(override val ptr: MemorySegment) : NSTextField(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSecureTextField") }

    }

}
