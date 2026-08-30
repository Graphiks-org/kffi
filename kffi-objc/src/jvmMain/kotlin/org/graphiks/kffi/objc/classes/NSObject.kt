@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

// ── Category: NSCoderMethods on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.replacementObjectForCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("replacementObjectForCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.awakeAfterUsingCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("awakeAfterUsingCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.classForCoder(): MemorySegment {
    val sel = ObjCRuntime.sel("classForCoder")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSObject version]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_version(): Long {
    val sel = ObjCRuntime.sel("version")
    val cls = ObjCRuntime.getClass("NSObject")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, cls, sel) as Long
}

// Class method: +[NSObject setVersion:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_setVersion(aVersion: Long): Unit {
    val sel = ObjCRuntime.sel("setVersion:")
    val cls = ObjCRuntime.getClass("NSObject")
    ObjCRuntime.msgSend(null, cls, sel, aVersion)
}

// ── Category: NSDeprecatedMethods on NSObject ─────────────────────────────────────────

// Class method: +[NSObject poseAsClass:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Posing no longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Posing no longer supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Posing no longer supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Posing no longer supported")
@PlatformAvailability(platform = "all", unavailable = true)
fun NSObject_poseAsClass(aClass: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("poseAsClass:")
    val cls = ObjCRuntime.getClass("NSObject")
    ObjCRuntime.msgSend(null, cls, sel, aClass)
}

// ── Category: NSDiscardableContentProxy on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.autoContentAccessingProxy(): MemorySegment {
    val sel = ObjCRuntime.sel("autoContentAccessingProxy")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSErrorRecoveryAttempting on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo(error: MemorySegment, recoveryOptionIndex: Long, delegate: MemorySegment, didRecoverSelector: MemorySegment, contextInfo: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, error, recoveryOptionIndex, delegate, didRecoverSelector, contextInfo)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.attemptRecoveryFromError_optionIndex(error: MemorySegment, recoveryOptionIndex: Long): Boolean {
    val sel = ObjCRuntime.sel("attemptRecoveryFromError:optionIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, error, recoveryOptionIndex) as Boolean
}

// ── Category: NSDelayedPerforming on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.performSelector_withObject_afterDelay_inModes(aSelector: MemorySegment, anArgument: MemorySegment, delay: Double, modes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("performSelector:withObject:afterDelay:inModes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, anArgument, delay, modes)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.performSelector_withObject_afterDelay(aSelector: MemorySegment, anArgument: MemorySegment, delay: Double): Unit {
    val sel = ObjCRuntime.sel("performSelector:withObject:afterDelay:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, anArgument, delay)
}

// Class method: +[NSObject cancelPreviousPerformRequestsWithTarget:selector:object:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_cancelPreviousPerformRequestsWithTarget_selector_object(aTarget: MemorySegment, aSelector: MemorySegment, anArgument: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("cancelPreviousPerformRequestsWithTarget:selector:object:")
    val cls = ObjCRuntime.getClass("NSObject")
    ObjCRuntime.msgSend(null, cls, sel, aTarget, aSelector, anArgument)
}

// Class method: +[NSObject cancelPreviousPerformRequestsWithTarget:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_cancelPreviousPerformRequestsWithTarget(aTarget: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("cancelPreviousPerformRequestsWithTarget:")
    val cls = ObjCRuntime.getClass("NSObject")
    ObjCRuntime.msgSend(null, cls, sel, aTarget)
}

// ── Category: NSURLClient on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSObject.URL_resourceDataDidBecomeAvailable(sender: MemorySegment, newBytes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("URL:resourceDataDidBecomeAvailable:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender, newBytes)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSObject.URLResourceDidFinishLoading(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("URLResourceDidFinishLoading:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSObject.URLResourceDidCancelLoading(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("URLResourceDidCancelLoading:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSObject.URL_resourceDidFailLoadingWithReason(sender: MemorySegment, reason: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("URL:resourceDidFailLoadingWithReason:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender, reason)
}

// ── Category: NSCopyLinkMoveHandler on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = " Handler API no longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = " Handler API no longer supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = " Handler API no longer supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = " Handler API no longer supported")
fun NSObject.fileManager_shouldProceedAfterError(fm: MemorySegment, errorInfo: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("fileManager:shouldProceedAfterError:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fm, errorInfo) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Handler API no longer supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Handler API no longer supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Handler API no longer supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Handler API no longer supported")
fun NSObject.fileManager_willProcessPath(fm: MemorySegment, path: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("fileManager:willProcessPath:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fm, path)
}

// ── Category: NSKeyValueCoding on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.valueForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.setValue_forKey(value: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setValue:forKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.validateValue_forKey_error(ioValue: MemorySegment, inKey: MemorySegment, outError: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateValue:forKey:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ioValue, inKey, outError) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.mutableArrayValueForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("mutableArrayValueForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.mutableOrderedSetValueForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("mutableOrderedSetValueForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.mutableSetValueForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("mutableSetValueForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.valueForKeyPath(keyPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueForKeyPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, keyPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.setValue_forKeyPath(value: MemorySegment, keyPath: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setValue:forKeyPath:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, keyPath)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.validateValue_forKeyPath_error(ioValue: MemorySegment, inKeyPath: MemorySegment, outError: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateValue:forKeyPath:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ioValue, inKeyPath, outError) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.mutableArrayValueForKeyPath(keyPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("mutableArrayValueForKeyPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, keyPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.mutableOrderedSetValueForKeyPath(keyPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("mutableOrderedSetValueForKeyPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, keyPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.mutableSetValueForKeyPath(keyPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("mutableSetValueForKeyPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, keyPath) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.valueForUndefinedKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueForUndefinedKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.setValue_forUndefinedKey(value: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setValue:forUndefinedKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.setNilValueForKey(key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setNilValueForKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, key)
}

/** @return NSDictionary<NSString *,id> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.dictionaryWithValuesForKeys(keys: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithValuesForKeys:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, keys) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.setValuesForKeysWithDictionary(keyedValues: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setValuesForKeysWithDictionary:")
    ObjCRuntime.msgSend(null, this.ptr, sel, keyedValues)
}

// Class method: +[NSObject accessInstanceVariablesDirectly]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_accessInstanceVariablesDirectly(): Boolean {
    val sel = ObjCRuntime.sel("accessInstanceVariablesDirectly")
    val cls = ObjCRuntime.getClass("NSObject")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSDeprecatedKeyValueCoding on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.storedValueForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("storedValueForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.takeStoredValue_forKey(value: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("takeStoredValue:forKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.takeValue_forKey(value: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("takeValue:forKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.takeValue_forKeyPath(value: MemorySegment, keyPath: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("takeValue:forKeyPath:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, keyPath)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.handleQueryWithUnboundKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("handleQueryWithUnboundKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.handleTakeValue_forUnboundKey(value: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("handleTakeValue:forUnboundKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.unableToSetNilForKey(key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("unableToSetNilForKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.valuesForKeys(keys: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valuesForKeys:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, keys) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject.takeValuesFromDictionary(properties: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("takeValuesFromDictionary:")
    ObjCRuntime.msgSend(null, this.ptr, sel, properties)
}

// Class method: +[NSObject useStoredAccessor]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Legacy KVC API")
fun NSObject_useStoredAccessor(): Boolean {
    val sel = ObjCRuntime.sel("useStoredAccessor")
    val cls = ObjCRuntime.getClass("NSObject")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSKeyValueObserving on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.observeValueForKeyPath_ofObject_change_context(keyPath: MemorySegment, `object`: MemorySegment, change: MemorySegment, context: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("observeValueForKeyPath:ofObject:change:context:")
    ObjCRuntime.msgSend(null, this.ptr, sel, keyPath, `object`, change, context)
}

// ── Category: NSKeyValueObserverRegistration on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.addObserver_forKeyPath_options_context(observer: MemorySegment, keyPath: MemorySegment, options: NSKeyValueObservingOptions, context: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addObserver:forKeyPath:options:context:")
    ObjCRuntime.msgSend(null, this.ptr, sel, observer, keyPath, options.rawValue, context)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.removeObserver_forKeyPath_context(observer: MemorySegment, keyPath: MemorySegment, context: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObserver:forKeyPath:context:")
    ObjCRuntime.msgSend(null, this.ptr, sel, observer, keyPath, context)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.removeObserver_forKeyPath(observer: MemorySegment, keyPath: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObserver:forKeyPath:")
    ObjCRuntime.msgSend(null, this.ptr, sel, observer, keyPath)
}

// ── Category: NSKeyValueObserverNotification on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.willChangeValueForKey(key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("willChangeValueForKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.didChangeValueForKey(key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("didChangeValueForKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.willChange_valuesAtIndexes_forKey(changeKind: NSKeyValueChange, indexes: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("willChange:valuesAtIndexes:forKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, changeKind.rawValue, indexes, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.didChange_valuesAtIndexes_forKey(changeKind: NSKeyValueChange, indexes: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("didChange:valuesAtIndexes:forKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, changeKind.rawValue, indexes, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.willChangeValueForKey_withSetMutation_usingObjects(key: MemorySegment, mutationKind: NSKeyValueSetMutationKind, objects: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("willChangeValueForKey:withSetMutation:usingObjects:")
    ObjCRuntime.msgSend(null, this.ptr, sel, key, mutationKind.rawValue, objects)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.didChangeValueForKey_withSetMutation_usingObjects(key: MemorySegment, mutationKind: NSKeyValueSetMutationKind, objects: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("didChangeValueForKey:withSetMutation:usingObjects:")
    ObjCRuntime.msgSend(null, this.ptr, sel, key, mutationKind.rawValue, objects)
}

// ── Category: NSKeyValueObservingCustomization on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.observationInfo(): MemorySegment {
    val sel = ObjCRuntime.sel("observationInfo")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.setObservationInfo(observationInfo: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setObservationInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, observationInfo)
}

// Class method: +[NSObject keyPathsForValuesAffectingValueForKey:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_keyPathsForValuesAffectingValueForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("keyPathsForValuesAffectingValueForKey:")
    val cls = ObjCRuntime.getClass("NSObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, key) as MemorySegment
}

// Class method: +[NSObject automaticallyNotifiesObserversForKey:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_automaticallyNotifiesObserversForKey(key: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("automaticallyNotifiesObserversForKey:")
    val cls = ObjCRuntime.getClass("NSObject")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel, key) as Boolean
}

// ── Category: NSDeprecatedKeyValueObservingCustomization on NSObject ─────────────────────────────────────────

// Class method: +[NSObject setKeys:triggerChangeNotificationsForDependentKey:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +keyPathsForValuesAffectingValueForKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Use +keyPathsForValuesAffectingValueForKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +keyPathsForValuesAffectingValueForKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +keyPathsForValuesAffectingValueForKey instead")
fun NSObject_setKeys_triggerChangeNotificationsForDependentKey(keys: MemorySegment, dependentKey: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setKeys:triggerChangeNotificationsForDependentKey:")
    val cls = ObjCRuntime.getClass("NSObject")
    ObjCRuntime.msgSend(null, cls, sel, keys, dependentKey)
}

// ── Category: NSKeyValueSharedObserverRegistration on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.setSharedObservers(sharedObservers: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSharedObservers:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sharedObservers)
}

// ── Category: NSKeyedArchiverObjectSubstitution on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.replacementObjectForKeyedArchiver(archiver: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("replacementObjectForKeyedArchiver:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, archiver) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.classForKeyedArchiver(): MemorySegment {
    val sel = ObjCRuntime.sel("classForKeyedArchiver")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSObject classFallbacksForKeyedArchiver]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_classFallbacksForKeyedArchiver(): MemorySegment {
    val sel = ObjCRuntime.sel("classFallbacksForKeyedArchiver")
    val cls = ObjCRuntime.getClass("NSObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSKeyedUnarchiverObjectSubstitution on NSObject ─────────────────────────────────────────

// Class method: +[NSObject classForKeyedUnarchiver]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject_classForKeyedUnarchiver(): MemorySegment {
    val sel = ObjCRuntime.sel("classForKeyedUnarchiver")
    val cls = ObjCRuntime.getClass("NSObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSThreadPerformAdditions on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.performSelectorOnMainThread_withObject_waitUntilDone_modes(aSelector: MemorySegment, arg: MemorySegment, wait: Boolean, array: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("performSelectorOnMainThread:withObject:waitUntilDone:modes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, arg, wait, array)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.performSelectorOnMainThread_withObject_waitUntilDone(aSelector: MemorySegment, arg: MemorySegment, wait: Boolean): Unit {
    val sel = ObjCRuntime.sel("performSelectorOnMainThread:withObject:waitUntilDone:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, arg, wait)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.performSelector_onThread_withObject_waitUntilDone_modes(aSelector: MemorySegment, thr: MemorySegment, arg: MemorySegment, wait: Boolean, array: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("performSelector:onThread:withObject:waitUntilDone:modes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, thr, arg, wait, array)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.performSelector_onThread_withObject_waitUntilDone(aSelector: MemorySegment, thr: MemorySegment, arg: MemorySegment, wait: Boolean): Unit {
    val sel = ObjCRuntime.sel("performSelector:onThread:withObject:waitUntilDone:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, thr, arg, wait)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.performSelectorInBackground_withObject(aSelector: MemorySegment, arg: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("performSelectorInBackground:withObject:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, arg)
}

// ── Category: NSArchiverCallback on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSObject.replacementObjectForArchiver(archiver: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("replacementObjectForArchiver:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, archiver) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.classForArchiver(): MemorySegment {
    val sel = ObjCRuntime.sel("classForArchiver")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSDistributedObjects on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
fun NSObject.replacementObjectForPortCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("replacementObjectForPortCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
fun NSObject.classForPortCoder(): MemorySegment {
    val sel = ObjCRuntime.sel("classForPortCoder")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSClassDescriptionPrimitives on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.inverseForRelationshipKey(relationshipKey: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("inverseForRelationshipKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, relationshipKey) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.classDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("classDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSString *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.attributeKeys(): MemorySegment {
    val sel = ObjCRuntime.sel("attributeKeys")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSString *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.toOneRelationshipKeys(): MemorySegment {
    val sel = ObjCRuntime.sel("toOneRelationshipKeys")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSString *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.toManyRelationshipKeys(): MemorySegment {
    val sel = ObjCRuntime.sel("toManyRelationshipKeys")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSScripting on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSObject.scriptingValueForSpecifier(objectSpecifier: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("scriptingValueForSpecifier:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, objectSpecifier) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSObject.copyScriptingValue_forKey_withProperties(value: MemorySegment, key: MemorySegment, properties: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("copyScriptingValue:forKey:withProperties:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, value, key, properties) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSObject.newScriptingObjectOfClass_forValueForKey_withContentsValue_properties(objectClass: MemorySegment, key: MemorySegment, contentsValue: MemorySegment, properties: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("newScriptingObjectOfClass:forValueForKey:withContentsValue:properties:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, objectClass, key, contentsValue, properties) as MemorySegment
}

/** @return NSDictionary<NSString *,id> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingProperties(): MemorySegment {
    val sel = ObjCRuntime.sel("scriptingProperties")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.setScriptingProperties(scriptingProperties: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setScriptingProperties:")
    ObjCRuntime.msgSend(null, this.ptr, sel, scriptingProperties)
}

// ── Category: NSScriptClassDescription on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.classCode(): Int {
    val sel = ObjCRuntime.sel("classCode")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel) as Int
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.className(): MemorySegment {
    val sel = ObjCRuntime.sel("className")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSScriptKeyValueCoding on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.valueAtIndex_inPropertyWithKey(index: Long, key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueAtIndex:inPropertyWithKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, index, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.valueWithName_inPropertyWithKey(name: MemorySegment, key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithName:inPropertyWithKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, name, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.valueWithUniqueID_inPropertyWithKey(uniqueID: MemorySegment, key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithUniqueID:inPropertyWithKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, uniqueID, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.insertValue_atIndex_inPropertyWithKey(value: MemorySegment, index: Long, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("insertValue:atIndex:inPropertyWithKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, index, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.removeValueAtIndex_fromPropertyWithKey(index: Long, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeValueAtIndex:fromPropertyWithKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, index, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.replaceValueAtIndex_inPropertyWithKey_withValue(index: Long, key: MemorySegment, value: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("replaceValueAtIndex:inPropertyWithKey:withValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, index, key, value)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.insertValue_inPropertyWithKey(value: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("insertValue:inPropertyWithKey:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, key)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.coerceValue_forKey(value: MemorySegment, key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("coerceValue:forKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, value, key) as MemorySegment
}

// ── Category: NSScriptObjectSpecifiers on NSObject ─────────────────────────────────────────

/** @return NSArray<NSNumber *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.indicesOfObjectsByEvaluatingObjectSpecifier(specifier: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indicesOfObjectsByEvaluatingObjectSpecifier:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, specifier) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.objectSpecifier(): MemorySegment {
    val sel = ObjCRuntime.sel("objectSpecifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSComparisonMethods on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.isEqualTo(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualTo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.isLessThanOrEqualTo(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isLessThanOrEqualTo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.isLessThan(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isLessThan:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.isGreaterThanOrEqualTo(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isGreaterThanOrEqualTo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.isGreaterThan(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isGreaterThan:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.isNotEqualTo(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isNotEqualTo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.doesContain(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("doesContain:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.isLike(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isLike:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.isCaseInsensitiveLike(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isCaseInsensitiveLike:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

// ── Category: NSScriptingComparisonMethods on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingIsEqualTo(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("scriptingIsEqualTo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingIsLessThanOrEqualTo(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("scriptingIsLessThanOrEqualTo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingIsLessThan(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("scriptingIsLessThan:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingIsGreaterThanOrEqualTo(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("scriptingIsGreaterThanOrEqualTo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingIsGreaterThan(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("scriptingIsGreaterThan:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingBeginsWith(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("scriptingBeginsWith:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingEndsWith(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("scriptingEndsWith:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSObject.scriptingContains(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("scriptingContains:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

// ── Category: NSAccessibility on NSObject ─────────────────────────────────────────

/** @return NSArray<NSAccessibilityAttributeName> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilityAttributeNames(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributeNames")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilityAttributeValue(attribute: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributeValue:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, attribute) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilityIsAttributeSettable(attribute: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("accessibilityIsAttributeSettable:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, attribute) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilitySetValue_forAttribute(value: MemorySegment, attribute: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("accessibilitySetValue:forAttribute:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, attribute)
}

/** @return NSArray<NSAccessibilityParameterizedAttributeName> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilityParameterizedAttributeNames(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityParameterizedAttributeNames")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilityAttributeValue_forParameter(attribute: MemorySegment, parameter: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributeValue:forParameter:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, attribute, parameter) as MemorySegment
}

/** @return NSArray<NSAccessibilityActionName> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilityActionNames(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityActionNames")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilityActionDescription(action: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityActionDescription:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, action) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilityPerformAction(action: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("accessibilityPerformAction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, action)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use isAccessibilityElement instead")
fun NSObject.accessibilityIsIgnored(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityIsIgnored")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.accessibilityHitTest(point: NSPoint): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHitTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.accessibilityIndexOfChild(child: MemorySegment): Long {
    val sel = ObjCRuntime.sel("accessibilityIndexOfChild:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, child) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.accessibilityArrayAttributeCount(attribute: MemorySegment): Long {
    val sel = ObjCRuntime.sel("accessibilityArrayAttributeCount:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, attribute) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.accessibilityArrayAttributeValues_index_maxCount(attribute: MemorySegment, index: Long, maxCount: Long): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityArrayAttributeValues:index:maxCount:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, attribute, index, maxCount) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.accessibilityFocusedUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFocusedUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
fun NSObject.accessibilityNotifiesWhenDestroyed(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityNotifiesWhenDestroyed")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSAccessibilityAdditions on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the NSAccessibility protocol methods instead (see NSAccessibilityProtocols.h)")
fun NSObject.accessibilitySetOverrideValue_forAttribute(value: MemorySegment, attribute: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("accessibilitySetOverrideValue:forAttribute:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, value, attribute) as Boolean
}

// ── Category: NSPasteboardOwner on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSPasteboardTypeOwner protocol.")
fun NSObject.pasteboard_provideDataForType(sender: MemorySegment, type: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("pasteboard:provideDataForType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender, type)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now an optional method of the NSPasteboardTypeOwner protocol.")
fun NSObject.pasteboardChangedOwner(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("pasteboardChangedOwner:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

// ── Category: NSDraggingSourceDeprecated on NSObject ─────────────────────────────────────────

/** @return NSArray<NSString *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSFilePromiseProvider objects instead")
fun NSObject.namesOfPromisedFilesDroppedAtDestination(dropDestination: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("namesOfPromisedFilesDroppedAtDestination:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, dropDestination) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -draggingSession:sourceOperationMaskForDraggingContext: instead")
fun NSObject.draggingSourceOperationMaskForLocal(flag: Boolean): NSDragOperation {
    val sel = ObjCRuntime.sel("draggingSourceOperationMaskForLocal:")
    return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, flag) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -draggingSession:willBeginAtPoint: instead")
fun NSObject.draggedImage_beganAt(image: MemorySegment, screenPoint: NSPoint): Unit {
    val sel = ObjCRuntime.sel("draggedImage:beganAt:")
    ObjCRuntime.msgSend(null, this.ptr, sel, image, ObjCRuntime.ObjCStructArg(screenPoint.segment, NSPoint.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -draggingSession:endedAtPoint:operation: instead")
fun NSObject.draggedImage_endedAt_operation(image: MemorySegment, screenPoint: NSPoint, operation: NSDragOperation): Unit {
    val sel = ObjCRuntime.sel("draggedImage:endedAt:operation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, image, ObjCRuntime.ObjCStructArg(screenPoint.segment, NSPoint.layout), operation.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -draggingSession:movedToPoint: instead")
fun NSObject.draggedImage_movedTo(image: MemorySegment, screenPoint: NSPoint): Unit {
    val sel = ObjCRuntime.sel("draggedImage:movedTo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, image, ObjCRuntime.ObjCStructArg(screenPoint.segment, NSPoint.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -ignoreModifierKeysForDraggingSession: instead")
fun NSObject.ignoreModifierKeysWhileDragging(): Boolean {
    val sel = ObjCRuntime.sel("ignoreModifierKeysWhileDragging")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 1, deprecatedSubminor = -1)
fun NSObject.draggedImage_endedAt_deposited(image: MemorySegment, screenPoint: NSPoint, flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("draggedImage:endedAt:deposited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, image, ObjCRuntime.ObjCStructArg(screenPoint.segment, NSPoint.layout), flag)
}

// ── Category: NSLayerDelegateContentsScaleUpdating on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSViewLayerContentScaleDelegate protocol.")
fun NSObject.layer_shouldInheritContentsScale_fromWindow(layer: MemorySegment, newScale: Double, window: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("layer:shouldInheritContentsScale:fromWindow:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, layer, newScale, window) as Boolean
}

// ── Category: NSToolTipOwner on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSViewToolTipOwner protocol.")
fun NSObject.view_stringForToolTip_point_userData(view: MemorySegment, tag: Long, point: NSPoint, `data`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("view:stringForToolTip:point:userData:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, view, tag, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), `data`) as MemorySegment
}

// ── Category: NSMenuValidation on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSMenuItemValidation protocol.")
fun NSObject.validateMenuItem(menuItem: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateMenuItem:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, menuItem) as Boolean
}

// ── Category: NSKeyValueBindingCreation on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.valueClassForBinding(binding: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueClassForBinding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, binding) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.bind_toObject_withKeyPath_options(binding: MemorySegment, observable: MemorySegment, keyPath: MemorySegment, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("bind:toObject:withKeyPath:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, binding, observable, keyPath, options)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.unbind(binding: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("unbind:")
    ObjCRuntime.msgSend(null, this.ptr, sel, binding)
}

/** @return NSDictionary<NSBindingInfoKey,id> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.infoForBinding(binding: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("infoForBinding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, binding) as MemorySegment
}

/** @return NSArray<NSAttributeDescription *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSObject.optionDescriptionsForBinding(binding: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("optionDescriptionsForBinding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, binding) as MemorySegment
}

/** @return NSArray<NSBindingName> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.exposedBindings(): MemorySegment {
    val sel = ObjCRuntime.sel("exposedBindings")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSObject exposeBinding:]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject_exposeBinding(binding: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("exposeBinding:")
    val cls = ObjCRuntime.getClass("NSObject")
    ObjCRuntime.msgSend(null, cls, sel, binding)
}

// ── Category: NSPlaceholders on NSObject ─────────────────────────────────────────

// Class method: +[NSObject setDefaultPlaceholder:forMarker:withBinding:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSObject_setDefaultPlaceholder_forMarker_withBinding(placeholder: MemorySegment, marker: MemorySegment, binding: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setDefaultPlaceholder:forMarker:withBinding:")
    val cls = ObjCRuntime.getClass("NSObject")
    ObjCRuntime.msgSend(null, cls, sel, placeholder, marker, binding)
}

// Class method: +[NSObject defaultPlaceholderForMarker:withBinding:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSObject_defaultPlaceholderForMarker_withBinding(marker: MemorySegment, binding: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("defaultPlaceholderForMarker:withBinding:")
    val cls = ObjCRuntime.getClass("NSObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, marker, binding) as MemorySegment
}

// ── Category: NSEditor on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSEditor protocol.")
fun NSObject.discardEditing(): Unit {
    val sel = ObjCRuntime.sel("discardEditing")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSEditor protocol.")
fun NSObject.commitEditing(): Boolean {
    val sel = ObjCRuntime.sel("commitEditing")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSEditor protocol.")
fun NSObject.commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: MemorySegment, didCommitSelector: MemorySegment, contextInfo: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("commitEditingWithDelegate:didCommitSelector:contextInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, delegate, didCommitSelector, contextInfo)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSEditor protocol.")
fun NSObject.commitEditingAndReturnError(error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("commitEditingAndReturnError:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, error) as Boolean
}

// ── Category: NSEditorRegistration on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSEditorRegistration protocol.")
fun NSObject.objectDidBeginEditing(editor: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("objectDidBeginEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, editor)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSEditorRegistration protocol.")
fun NSObject.objectDidEndEditing(editor: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("objectDidEndEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, editor)
}

// ── Category: NSControlSubclassNotifications on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now an optional method of the NSControlTextEditingDelegate protocol.")
fun NSObject.controlTextDidBeginEditing(obj: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("controlTextDidBeginEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, obj)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now an optional method of the NSControlTextEditingDelegate protocol.")
fun NSObject.controlTextDidEndEditing(obj: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("controlTextDidEndEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, obj)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now an optional method of the NSControlTextEditingDelegate protocol.")
fun NSObject.controlTextDidChange(obj: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("controlTextDidChange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, obj)
}

// ── Category: NSFontManagerDelegate on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSFontCollection for providing filtered font lists")
fun NSObject.fontManager_willIncludeFont(sender: MemorySegment, fontName: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("fontManager:willIncludeFont:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, sender, fontName) as Boolean
}

// ── Category: NSFontManagerResponderMethod on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now an optional method of the NSFontChanging protocol.")
fun NSObject.changeFont(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("changeFont:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

// ── Category: NSFontPanelValidationAdditions on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now an optional method of the NSFontChanging protocol.")
fun NSObject.validModesForFontPanel(fontPanel: MemorySegment): NSFontPanelModeMask {
    val sel = ObjCRuntime.sel("validModesForFontPanel:")
    return NSFontPanelModeMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, fontPanel) as Long)
}

// ── Category: NSColorPanelResponderMethod on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSColorChanging protocol.")
fun NSObject.changeColor(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("changeColor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

// ── Category: NSNibAwaking on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSObject.awakeFromNib(): Unit {
    val sel = ObjCRuntime.sel("awakeFromNib")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSObject.prepareForInterfaceBuilder(): Unit {
    val sel = ObjCRuntime.sel("prepareForInterfaceBuilder")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// ── Category: NSSavePanelDelegateDeprecated on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -panel:validateURL:error: instead")
fun NSObject.panel_isValidFilename(sender: MemorySegment, filename: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("panel:isValidFilename:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, sender, filename) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -panel:didChangeToDirectoryURL: instead")
fun NSObject.panel_directoryDidChange(sender: MemorySegment, path: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("panel:directoryDidChange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender, path)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Filenames in the save panel should not have a custom sort. This method is never called on 10.14, and rarely called after 10.6")
fun NSObject.panel_compareFilename_with_caseSensitive(sender: MemorySegment, name1: MemorySegment, name2: MemorySegment, caseSensitive: Boolean): NSComparisonResult {
    val sel = ObjCRuntime.sel("panel:compareFilename:with:caseSensitive:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, sender, name1, name2, caseSensitive) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -panel:shouldEnableURL: instead")
fun NSObject.panel_shouldShowFilename(sender: MemorySegment, filename: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("panel:shouldShowFilename:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, sender, filename) as Boolean
}

// ── Category: NSDeprecatedTextStorageDelegateInterface on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -textStorage:willProcessEditing:range:changeInLength: instead.")
fun NSObject.textStorageWillProcessEditing(notification: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("textStorageWillProcessEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, notification)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -textStorage:didProcessEditing:range:changeInLength: instead.")
fun NSObject.textStorageDidProcessEditing(notification: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("textStorageDidProcessEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, notification)
}

// ── Category: NSToolbarItemValidation on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now a method of the NSToolbarItemValidation protocol.")
fun NSObject.validateToolbarItem(item: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateToolbarItem:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, item) as Boolean
}

// ── Category: NSTableViewDataSourceDeprecated on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSObject.tableView_writeRows_toPasteboard(tableView: MemorySegment, rows: MemorySegment, pboard: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("tableView:writeRows:toPasteboard:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, tableView, rows, pboard) as Boolean
}

// ── Category: NSApplicationScriptingDelegation on NSObject ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This is now an optional method of the NSApplicationDelegate protocol.")
fun NSObject.application_delegateHandlesKey(sender: MemorySegment, key: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("application:delegateHandlesKey:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, sender, key) as Boolean
}

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
