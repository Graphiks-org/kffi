@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUndoManager
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSUndoManager(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSUndoManager") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun beginUndoGrouping(): Unit {
        val sel = ObjCRuntime.sel("beginUndoGrouping")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun endUndoGrouping(): Unit {
        val sel = ObjCRuntime.sel("endUndoGrouping")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun disableUndoRegistration(): Unit {
        val sel = ObjCRuntime.sel("disableUndoRegistration")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun enableUndoRegistration(): Unit {
        val sel = ObjCRuntime.sel("enableUndoRegistration")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun undo(): Unit {
        val sel = ObjCRuntime.sel("undo")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun redo(): Unit {
        val sel = ObjCRuntime.sel("redo")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun undoNestedGroup(): Unit {
        val sel = ObjCRuntime.sel("undoNestedGroup")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun removeAllActions(): Unit {
        val sel = ObjCRuntime.sel("removeAllActions")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun removeAllActionsWithTarget(target: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeAllActionsWithTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, target)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun registerUndoWithTarget_selector_object(target: MemorySegment, selector: MemorySegment, `object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerUndoWithTarget:selector:object:")
        ObjCRuntime.msgSend(null, ptr, sel, target, selector, `object`)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun prepareWithInvocationTarget(target: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("prepareWithInvocationTarget:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, target) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun registerUndoWithTarget_handler(target: MemorySegment, undoHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerUndoWithTarget:handler:")
        ObjCRuntime.msgSend(null, ptr, sel, target, undoHandler)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setActionIsDiscardable(discardable: Boolean): Unit {
        val sel = ObjCRuntime.sel("setActionIsDiscardable:")
        ObjCRuntime.msgSend(null, ptr, sel, discardable)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setActionName(actionName: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setActionName:")
        ObjCRuntime.msgSend(null, ptr, sel, actionName)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun setActionName(actionName: String): Unit = setActionName(ObjCRuntime.newNSString(Arena.global(), actionName))

    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun undoActionUserInfoValueForKey(key: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("undoActionUserInfoValueForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun redoActionUserInfoValueForKey(key: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("redoActionUserInfoValueForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setActionUserInfoValue_forKey(info: MemorySegment, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setActionUserInfoValue:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, info, key)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun undoMenuTitleForUndoActionName(actionName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("undoMenuTitleForUndoActionName:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, actionName) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun undoMenuTitleForUndoActionNameAsString(actionName: MemorySegment): String = ObjCRuntime.toJavaString(undoMenuTitleForUndoActionName(actionName))

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun undoMenuTitleForUndoActionName(actionName: String): MemorySegment = undoMenuTitleForUndoActionName(ObjCRuntime.newNSString(Arena.global(), actionName))

    /** Convenience overload — [String] parameters and [String] return type. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun undoMenuTitleForUndoActionNameAsString(actionName: String): String = ObjCRuntime.toJavaString(undoMenuTitleForUndoActionName(ObjCRuntime.newNSString(Arena.global(), actionName)))

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun redoMenuTitleForUndoActionName(actionName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("redoMenuTitleForUndoActionName:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, actionName) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun redoMenuTitleForUndoActionNameAsString(actionName: MemorySegment): String = ObjCRuntime.toJavaString(redoMenuTitleForUndoActionName(actionName))

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun redoMenuTitleForUndoActionName(actionName: String): MemorySegment = redoMenuTitleForUndoActionName(ObjCRuntime.newNSString(Arena.global(), actionName))

    /** Convenience overload — [String] parameters and [String] return type. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun redoMenuTitleForUndoActionNameAsString(actionName: String): String = ObjCRuntime.toJavaString(redoMenuTitleForUndoActionName(ObjCRuntime.newNSString(Arena.global(), actionName)))

    // @property groupingLevel
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun groupingLevel(): Long {
        val sel = ObjCRuntime.sel("groupingLevel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property undoRegistrationEnabled
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun isUndoRegistrationEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isUndoRegistrationEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property groupsByEvent
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun groupsByEvent(): Boolean {
        val sel = ObjCRuntime.sel("groupsByEvent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setGroupsByEvent(value: Boolean) {
        val sel = ObjCRuntime.sel("setGroupsByEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property levelsOfUndo
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun levelsOfUndo(): Long {
        val sel = ObjCRuntime.sel("levelsOfUndo")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setLevelsOfUndo(value: Long) {
        val sel = ObjCRuntime.sel("setLevelsOfUndo:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property runLoopModes
    /** @return NSArray<NSRunLoopMode> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun runLoopModes(): MemorySegment {
        val sel = ObjCRuntime.sel("runLoopModes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setRunLoopModes(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRunLoopModes:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canUndo
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun canUndo(): Boolean {
        val sel = ObjCRuntime.sel("canUndo")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property canRedo
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun canRedo(): Boolean {
        val sel = ObjCRuntime.sel("canRedo")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property undoCount
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun undoCount(): Long {
        val sel = ObjCRuntime.sel("undoCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property redoCount
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun redoCount(): Long {
        val sel = ObjCRuntime.sel("redoCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property undoing
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun isUndoing(): Boolean {
        val sel = ObjCRuntime.sel("isUndoing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property redoing
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun isRedoing(): Boolean {
        val sel = ObjCRuntime.sel("isRedoing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property undoActionIsDiscardable
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun undoActionIsDiscardable(): Boolean {
        val sel = ObjCRuntime.sel("undoActionIsDiscardable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property redoActionIsDiscardable
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun redoActionIsDiscardable(): Boolean {
        val sel = ObjCRuntime.sel("redoActionIsDiscardable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property undoActionName
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun undoActionName(): MemorySegment {
        val sel = ObjCRuntime.sel("undoActionName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun undoActionNameAsString(): String = ObjCRuntime.toJavaString(undoActionName())

    // @property redoActionName
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun redoActionName(): MemorySegment {
        val sel = ObjCRuntime.sel("redoActionName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun redoActionNameAsString(): String = ObjCRuntime.toJavaString(redoActionName())

    // @property undoMenuItemTitle
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun undoMenuItemTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("undoMenuItemTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun undoMenuItemTitleAsString(): String = ObjCRuntime.toJavaString(undoMenuItemTitle())

    // @property redoMenuItemTitle
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun redoMenuItemTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("redoMenuItemTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun redoMenuItemTitleAsString(): String = ObjCRuntime.toJavaString(redoMenuItemTitle())

}
