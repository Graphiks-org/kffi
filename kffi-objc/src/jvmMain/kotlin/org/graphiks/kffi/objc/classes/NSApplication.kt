package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSApplication
 * Superclass: NSResponder
 * Protocols: NSUserInterfaceValidations, NSMenuItemValidation, NSAccessibilityElement, NSAccessibility
 */
open class NSApplication(override val ptr: MemorySegment) : NSResponder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSApplication") }

        fun detachDrawingThread_toTarget_withObject(selector: MemorySegment, target: MemorySegment, argument: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("detachDrawingThread:toTarget:withObject:")
            ObjCRuntime.msgSend(null, _class, sel, selector, target, argument)
        }

        fun sharedApplication(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedApplication")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun hide(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("hide:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun unhide(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("unhide:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun unhideWithoutActivation(): Unit {
        val sel = ObjCRuntime.sel("unhideWithoutActivation")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun windowWithWindowNumber(windowNum: Long): MemorySegment {
        val sel = ObjCRuntime.sel("windowWithWindowNumber:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, windowNum) as MemorySegment
    }

    open fun deactivate(): Unit {
        val sel = ObjCRuntime.sel("deactivate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun activateIgnoringOtherApps(ignoreOtherApps: Boolean): Unit {
        val sel = ObjCRuntime.sel("activateIgnoringOtherApps:")
        ObjCRuntime.msgSend(null, ptr, sel, ignoreOtherApps)
    }

    open fun activate(): Unit {
        val sel = ObjCRuntime.sel("activate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun yieldActivationToApplication(application: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("yieldActivationToApplication:")
        ObjCRuntime.msgSend(null, ptr, sel, application)
    }

    open fun yieldActivationToApplicationWithBundleIdentifier(bundleIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("yieldActivationToApplicationWithBundleIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, bundleIdentifier)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun yieldActivationToApplicationWithBundleIdentifier(bundleIdentifier: String): Unit = yieldActivationToApplicationWithBundleIdentifier(ObjCRuntime.newNSString(Arena.global(), bundleIdentifier))

    open fun hideOtherApplications(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("hideOtherApplications:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun unhideAllApplications(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("unhideAllApplications:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun finishLaunching(): Unit {
        val sel = ObjCRuntime.sel("finishLaunching")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun run(): Unit {
        val sel = ObjCRuntime.sel("run")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun runModalForWindow(window: MemorySegment): Long {
        val sel = ObjCRuntime.sel("runModalForWindow:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, window) as Long
    }

    open fun stop(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("stop:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun stopModal(): Unit {
        val sel = ObjCRuntime.sel("stopModal")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun stopModalWithCode(returnCode: Long): Unit {
        val sel = ObjCRuntime.sel("stopModalWithCode:")
        ObjCRuntime.msgSend(null, ptr, sel, returnCode)
    }

    open fun abortModal(): Unit {
        val sel = ObjCRuntime.sel("abortModal")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun beginModalSessionForWindow(window: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("beginModalSessionForWindow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, window) as MemorySegment
    }

    open fun runModalSession(session: MemorySegment): Long {
        val sel = ObjCRuntime.sel("runModalSession:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, session) as Long
    }

    open fun endModalSession(session: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("endModalSession:")
        ObjCRuntime.msgSend(null, ptr, sel, session)
    }

    open fun terminate(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("terminate:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun requestUserAttention(requestType: MemorySegment): Long {
        val sel = ObjCRuntime.sel("requestUserAttention:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, requestType) as Long
    }

    open fun cancelUserAttentionRequest(request: Long): Unit {
        val sel = ObjCRuntime.sel("cancelUserAttentionRequest:")
        ObjCRuntime.msgSend(null, ptr, sel, request)
    }

    open fun enumerateWindowsWithOptions_usingBlock(options: MemorySegment, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateWindowsWithOptions:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, options, block)
    }

    open fun preventWindowOrdering(): Unit {
        val sel = ObjCRuntime.sel("preventWindowOrdering")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun setWindowsNeedUpdate(needUpdate: Boolean): Unit {
        val sel = ObjCRuntime.sel("setWindowsNeedUpdate:")
        ObjCRuntime.msgSend(null, ptr, sel, needUpdate)
    }

    open fun updateWindows(): Unit {
        val sel = ObjCRuntime.sel("updateWindows")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun activationPolicy(): MemorySegment {
        val sel = ObjCRuntime.sel("activationPolicy")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun setActivationPolicy(activationPolicy: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setActivationPolicy:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, activationPolicy) as Boolean
    }

    open fun reportException(exception: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reportException:")
        ObjCRuntime.msgSend(null, ptr, sel, exception)
    }

    open fun replyToApplicationShouldTerminate(shouldTerminate: Boolean): Unit {
        val sel = ObjCRuntime.sel("replyToApplicationShouldTerminate:")
        ObjCRuntime.msgSend(null, ptr, sel, shouldTerminate)
    }

    open fun replyToOpenOrPrint(reply: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replyToOpenOrPrint:")
        ObjCRuntime.msgSend(null, ptr, sel, reply)
    }

    open fun orderFrontCharacterPalette(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontCharacterPalette:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property sharedApplication
    open fun sharedApplication(): MemorySegment {
        val sel = ObjCRuntime.sel("sharedApplication")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property delegate
    /** @return id<NSApplicationDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property mainWindow
    open fun mainWindow(): MemorySegment {
        val sel = ObjCRuntime.sel("mainWindow")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property keyWindow
    open fun keyWindow(): MemorySegment {
        val sel = ObjCRuntime.sel("keyWindow")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property active
    open fun isActive(): Boolean {
        val sel = ObjCRuntime.sel("isActive")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property hidden
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property running
    open fun isRunning(): Boolean {
        val sel = ObjCRuntime.sel("isRunning")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property applicationShouldSuppressHighDynamicRangeContent
    open fun applicationShouldSuppressHighDynamicRangeContent(): Boolean {
        val sel = ObjCRuntime.sel("applicationShouldSuppressHighDynamicRangeContent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property modalWindow
    open fun modalWindow(): MemorySegment {
        val sel = ObjCRuntime.sel("modalWindow")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property windows
    /** @return NSArray<NSWindow *> * */
    open fun windows(): MemorySegment {
        val sel = ObjCRuntime.sel("windows")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property mainMenu
    open fun mainMenu(): MemorySegment {
        val sel = ObjCRuntime.sel("mainMenu")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMainMenu(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMainMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property helpMenu
    open fun helpMenu(): MemorySegment {
        val sel = ObjCRuntime.sel("helpMenu")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setHelpMenu(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHelpMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property applicationIconImage
    open fun applicationIconImage(): MemorySegment {
        val sel = ObjCRuntime.sel("applicationIconImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setApplicationIconImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setApplicationIconImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property dockTile
    open fun dockTile(): MemorySegment {
        val sel = ObjCRuntime.sel("dockTile")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property presentationOptions
    open fun presentationOptions(): MemorySegment {
        val sel = ObjCRuntime.sel("presentationOptions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPresentationOptions(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPresentationOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property currentSystemPresentationOptions
    open fun currentSystemPresentationOptions(): MemorySegment {
        val sel = ObjCRuntime.sel("currentSystemPresentationOptions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property occlusionState
    open fun occlusionState(): MemorySegment {
        val sel = ObjCRuntime.sel("occlusionState")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property protectedDataAvailable
    open fun isProtectedDataAvailable(): Boolean {
        val sel = ObjCRuntime.sel("isProtectedDataAvailable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}
