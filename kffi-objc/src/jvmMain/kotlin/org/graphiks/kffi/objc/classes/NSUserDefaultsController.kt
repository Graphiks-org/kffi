@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUserDefaultsController
 * Superclass: NSController
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSUserDefaultsController(override val ptr: MemorySegment) : NSController(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSUserDefaultsController") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedUserDefaultsController(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedUserDefaultsController")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithDefaults_initialValues(defaults: MemorySegment, initialValues: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDefaults:initialValues:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, defaults, initialValues) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun revert(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("revert:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun save(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("save:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun revertToInitialValues(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("revertToInitialValues:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property defaults
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun defaults(): MemorySegment {
        val sel = ObjCRuntime.sel("defaults")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property initialValues
    /** @return NSDictionary<NSString *,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initialValues(): MemorySegment {
        val sel = ObjCRuntime.sel("initialValues")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInitialValues(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setInitialValues:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property appliesImmediately
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun appliesImmediately(): Boolean {
        val sel = ObjCRuntime.sel("appliesImmediately")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAppliesImmediately(value: Boolean) {
        val sel = ObjCRuntime.sel("setAppliesImmediately:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasUnappliedChanges
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasUnappliedChanges(): Boolean {
        val sel = ObjCRuntime.sel("hasUnappliedChanges")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property values
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun values(): MemorySegment {
        val sel = ObjCRuntime.sel("values")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
