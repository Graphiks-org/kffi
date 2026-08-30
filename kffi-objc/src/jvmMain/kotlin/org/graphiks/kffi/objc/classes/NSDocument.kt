@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDocument
 * Superclass: NSObject
 * Protocols: NSEditorRegistration, NSFilePresenter, NSMenuItemValidation, NSUserInterfaceValidations
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSDocument(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSDocument") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun canConcurrentlyReadDocumentsOfType(typeName: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canConcurrentlyReadDocumentsOfType:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, typeName) as Boolean
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun canConcurrentlyReadDocumentsOfType(typeName: String): Boolean = canConcurrentlyReadDocumentsOfType(ObjCRuntime.newNSString(Arena.global(), typeName))

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun isNativeType(type: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("isNativeType:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, type) as Boolean
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun isNativeType(type: String): Boolean = isNativeType(ObjCRuntime.newNSString(Arena.global(), type))

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun autosavesInPlace(): Boolean {
            val sel = ObjCRuntime.sel("autosavesInPlace")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun preservesVersions(): Boolean {
            val sel = ObjCRuntime.sel("preservesVersions")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        fun autosavesDrafts(): Boolean {
            val sel = ObjCRuntime.sel("autosavesDrafts")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun readableTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("readableTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun writableTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("writableTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        fun usesUbiquitousStorage(): Boolean {
            val sel = ObjCRuntime.sel("usesUbiquitousStorage")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithType_error(typeName: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithType:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeName, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithType_error(typeName: String, outError: MemorySegment): MemorySegment = initWithType_error(ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithContentsOfURL_ofType_error(url: MemorySegment, typeName: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentsOfURL:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url, typeName, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithContentsOfURL_ofType_error(url: MemorySegment, typeName: String, outError: MemorySegment): MemorySegment = initWithContentsOfURL_ofType_error(url, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initForURL_withContentsOfURL_ofType_error(urlOrNil: MemorySegment, contentsURL: MemorySegment, typeName: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initForURL:withContentsOfURL:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, urlOrNil, contentsURL, typeName, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initForURL_withContentsOfURL_ofType_error(urlOrNil: MemorySegment, contentsURL: MemorySegment, typeName: String, outError: MemorySegment): MemorySegment = initForURL_withContentsOfURL_ofType_error(urlOrNil, contentsURL, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun performActivityWithSynchronousWaiting_usingBlock(waitSynchronously: Boolean, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performActivityWithSynchronousWaiting:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, waitSynchronously, block)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun continueActivityUsingBlock(block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("continueActivityUsingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, block)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun continueAsynchronousWorkOnMainThreadUsingBlock(block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("continueAsynchronousWorkOnMainThreadUsingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, block)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun performSynchronousFileAccessUsingBlock(block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performSynchronousFileAccessUsingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, block)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun performAsynchronousFileAccessUsingBlock(block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performAsynchronousFileAccessUsingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, block)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun revertDocumentToSaved(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("revertDocumentToSaved:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun revertToContentsOfURL_ofType_error(url: MemorySegment, typeName: MemorySegment, outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("revertToContentsOfURL:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, url, typeName, outError) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun revertToContentsOfURL_ofType_error(url: MemorySegment, typeName: String, outError: MemorySegment): Boolean = revertToContentsOfURL_ofType_error(url, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun readFromURL_ofType_error(url: MemorySegment, typeName: MemorySegment, outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("readFromURL:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, url, typeName, outError) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun readFromURL_ofType_error(url: MemorySegment, typeName: String, outError: MemorySegment): Boolean = readFromURL_ofType_error(url, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun readFromFileWrapper_ofType_error(fileWrapper: MemorySegment, typeName: MemorySegment, outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("readFromFileWrapper:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, fileWrapper, typeName, outError) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun readFromFileWrapper_ofType_error(fileWrapper: MemorySegment, typeName: String, outError: MemorySegment): Boolean = readFromFileWrapper_ofType_error(fileWrapper, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun readFromData_ofType_error(`data`: MemorySegment, typeName: MemorySegment, outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("readFromData:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, `data`, typeName, outError) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun readFromData_ofType_error(`data`: MemorySegment, typeName: String, outError: MemorySegment): Boolean = readFromData_ofType_error(`data`, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun writeToURL_ofType_error(url: MemorySegment, typeName: MemorySegment, outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("writeToURL:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, url, typeName, outError) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writeToURL_ofType_error(url: MemorySegment, typeName: String, outError: MemorySegment): Boolean = writeToURL_ofType_error(url, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileWrapperOfType_error(typeName: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fileWrapperOfType:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeName, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun fileWrapperOfType_error(typeName: String, outError: MemorySegment): MemorySegment = fileWrapperOfType_error(ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dataOfType_error(typeName: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("dataOfType:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeName, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun dataOfType_error(typeName: String, outError: MemorySegment): MemorySegment = dataOfType_error(ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun unblockUserInteraction(): Unit {
        val sel = ObjCRuntime.sel("unblockUserInteraction")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun writeSafelyToURL_ofType_forSaveOperation_error(url: MemorySegment, typeName: MemorySegment, saveOperation: NSSaveOperationType, outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("writeSafelyToURL:ofType:forSaveOperation:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, url, typeName, saveOperation.rawValue, outError) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writeSafelyToURL_ofType_forSaveOperation_error(url: MemorySegment, typeName: String, saveOperation: NSSaveOperationType, outError: MemorySegment): Boolean = writeSafelyToURL_ofType_forSaveOperation_error(url, ObjCRuntime.newNSString(Arena.global(), typeName), saveOperation, outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun writeToURL_ofType_forSaveOperation_originalContentsURL_error(url: MemorySegment, typeName: MemorySegment, saveOperation: NSSaveOperationType, absoluteOriginalContentsURL: MemorySegment, outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("writeToURL:ofType:forSaveOperation:originalContentsURL:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, url, typeName, saveOperation.rawValue, absoluteOriginalContentsURL, outError) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writeToURL_ofType_forSaveOperation_originalContentsURL_error(url: MemorySegment, typeName: String, saveOperation: NSSaveOperationType, absoluteOriginalContentsURL: MemorySegment, outError: MemorySegment): Boolean = writeToURL_ofType_forSaveOperation_originalContentsURL_error(url, ObjCRuntime.newNSString(Arena.global(), typeName), saveOperation, absoluteOriginalContentsURL, outError)

    /** @return NSDictionary<NSString *,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error(url: MemorySegment, typeName: MemorySegment, saveOperation: NSSaveOperationType, absoluteOriginalContentsURL: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fileAttributesToWriteToURL:ofType:forSaveOperation:originalContentsURL:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url, typeName, saveOperation.rawValue, absoluteOriginalContentsURL, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error(url: MemorySegment, typeName: String, saveOperation: NSSaveOperationType, absoluteOriginalContentsURL: MemorySegment, outError: MemorySegment): MemorySegment = fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error(url, ObjCRuntime.newNSString(Arena.global(), typeName), saveOperation, absoluteOriginalContentsURL, outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saveDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saveDocumentAs(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveDocumentAs:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saveDocumentTo(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveDocumentTo:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saveDocumentWithDelegate_didSaveSelector_contextInfo(delegate: MemorySegment, didSaveSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveDocumentWithDelegate:didSaveSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, delegate, didSaveSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo(saveOperation: NSSaveOperationType, delegate: MemorySegment, didSaveSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("runModalSavePanelForSaveOperation:delegate:didSaveSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, saveOperation.rawValue, delegate, didSaveSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun prepareSavePanel(savePanel: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("prepareSavePanel:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, savePanel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo(url: MemorySegment, typeName: MemorySegment, saveOperation: NSSaveOperationType, delegate: MemorySegment, didSaveSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveToURL:ofType:forSaveOperation:delegate:didSaveSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, url, typeName, saveOperation.rawValue, delegate, didSaveSelector, contextInfo)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo(url: MemorySegment, typeName: String, saveOperation: NSSaveOperationType, delegate: MemorySegment, didSaveSelector: MemorySegment, contextInfo: MemorySegment): Unit = saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo(url, ObjCRuntime.newNSString(Arena.global(), typeName), saveOperation, delegate, didSaveSelector, contextInfo)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun saveToURL_ofType_forSaveOperation_completionHandler(url: MemorySegment, typeName: MemorySegment, saveOperation: NSSaveOperationType, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveToURL:ofType:forSaveOperation:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, url, typeName, saveOperation.rawValue, completionHandler)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun saveToURL_ofType_forSaveOperation_completionHandler(url: MemorySegment, typeName: String, saveOperation: NSSaveOperationType, completionHandler: MemorySegment): Unit = saveToURL_ofType_forSaveOperation_completionHandler(url, ObjCRuntime.newNSString(Arena.global(), typeName), saveOperation, completionHandler)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun canAsynchronouslyWriteToURL_ofType_forSaveOperation(url: MemorySegment, typeName: MemorySegment, saveOperation: NSSaveOperationType): Boolean {
        val sel = ObjCRuntime.sel("canAsynchronouslyWriteToURL:ofType:forSaveOperation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, url, typeName, saveOperation.rawValue) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun canAsynchronouslyWriteToURL_ofType_forSaveOperation(url: MemorySegment, typeName: String, saveOperation: NSSaveOperationType): Boolean = canAsynchronouslyWriteToURL_ofType_forSaveOperation(url, ObjCRuntime.newNSString(Arena.global(), typeName), saveOperation)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun checkAutosavingSafetyAndReturnError(outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("checkAutosavingSafetyAndReturnError:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, outError) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun scheduleAutosaving(): Unit {
        val sel = ObjCRuntime.sel("scheduleAutosaving")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo(delegate: MemorySegment, didAutosaveSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("autosaveDocumentWithDelegate:didAutosaveSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, delegate, didAutosaveSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun autosaveWithImplicitCancellability_completionHandler(autosavingIsImplicitlyCancellable: Boolean, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("autosaveWithImplicitCancellability:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, autosavingIsImplicitlyCancellable, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun browseDocumentVersions(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("browseDocumentVersions:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun stopBrowsingVersionsWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("stopBrowsingVersionsWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo(delegate: MemorySegment, shouldCloseSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("canCloseDocumentWithDelegate:shouldCloseSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, delegate, shouldCloseSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun close(): Unit {
        val sel = ObjCRuntime.sel("close")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun duplicateDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("duplicateDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo(delegate: MemorySegment, didDuplicateSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("duplicateDocumentWithDelegate:didDuplicateSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, delegate, didDuplicateSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun duplicateAndReturnError(outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("duplicateAndReturnError:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, outError) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun renameDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("renameDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun moveDocumentToUbiquityContainer(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveDocumentToUbiquityContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun moveDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun moveDocumentWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveDocumentWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun moveToURL_completionHandler(url: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveToURL:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, url, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun lockDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("lockDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun unlockDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("unlockDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun lockDocumentWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("lockDocumentWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun lockWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("lockWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun unlockDocumentWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("unlockDocumentWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun unlockWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("unlockWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runPageLayout(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("runPageLayout:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo(printInfo: MemorySegment, delegate: MemorySegment, didRunSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("runModalPageLayoutWithPrintInfo:delegate:didRunSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, printInfo, delegate, didRunSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun preparePageLayout(pageLayout: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("preparePageLayout:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, pageLayout) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shouldChangePrintInfo(newPrintInfo: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("shouldChangePrintInfo:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, newPrintInfo) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun printDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("printDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo(printSettings: MemorySegment, showPrintPanel: Boolean, delegate: MemorySegment, didPrintSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("printDocumentWithSettings:showPrintPanel:delegate:didPrintSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, printSettings, showPrintPanel, delegate, didPrintSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun printOperationWithSettings_error(printSettings: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("printOperationWithSettings:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, printSettings, outError) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runModalPrintOperation_delegate_didRunSelector_contextInfo(printOperation: MemorySegment, delegate: MemorySegment, didRunSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("runModalPrintOperation:delegate:didRunSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, printOperation, delegate, didRunSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun saveDocumentToPDF(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveDocumentToPDF:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun shareDocumentWithSharingService_completionHandler(sharingService: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("shareDocumentWithSharingService:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, sharingService, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun prepareSharingServicePicker(sharingServicePicker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("prepareSharingServicePicker:")
        ObjCRuntime.msgSend(null, ptr, sel, sharingServicePicker)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateChangeCount(change: NSDocumentChangeType): Unit {
        val sel = ObjCRuntime.sel("updateChangeCount:")
        ObjCRuntime.msgSend(null, ptr, sel, change.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun changeCountTokenForSaveOperation(saveOperation: NSSaveOperationType): MemorySegment {
        val sel = ObjCRuntime.sel("changeCountTokenForSaveOperation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, saveOperation.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun updateChangeCountWithToken_forSaveOperation(changeCountToken: MemorySegment, saveOperation: NSSaveOperationType): Unit {
        val sel = ObjCRuntime.sel("updateChangeCountWithToken:forSaveOperation:")
        ObjCRuntime.msgSend(null, ptr, sel, changeCountToken, saveOperation.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun presentError_modalForWindow_delegate_didPresentSelector_contextInfo(error: MemorySegment, window: MemorySegment, delegate: MemorySegment, didPresentSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("presentError:modalForWindow:delegate:didPresentSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, error, window, delegate, didPresentSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun presentError(error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("presentError:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, error) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun willPresentError(error: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("willPresentError:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, error) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun willNotPresentError(error: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("willNotPresentError:")
        ObjCRuntime.msgSend(null, ptr, sel, error)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeWindowControllers(): Unit {
        val sel = ObjCRuntime.sel("makeWindowControllers")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun windowControllerWillLoadNib(windowController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("windowControllerWillLoadNib:")
        ObjCRuntime.msgSend(null, ptr, sel, windowController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun windowControllerDidLoadNib(windowController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("windowControllerDidLoadNib:")
        ObjCRuntime.msgSend(null, ptr, sel, windowController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setWindow(window: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, window)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addWindowController(windowController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addWindowController:")
        ObjCRuntime.msgSend(null, ptr, sel, windowController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeWindowController(windowController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeWindowController:")
        ObjCRuntime.msgSend(null, ptr, sel, windowController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showWindows(): Unit {
        val sel = ObjCRuntime.sel("showWindows")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo(windowController: MemorySegment, delegate: MemorySegment, shouldCloseSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("shouldCloseWindowController:delegate:shouldCloseSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, windowController, delegate, shouldCloseSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun defaultDraftName(): MemorySegment {
        val sel = ObjCRuntime.sel("defaultDraftName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    fun defaultDraftNameAsString(): String = ObjCRuntime.toJavaString(defaultDraftName())

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun writableTypesForSaveOperation(saveOperation: NSSaveOperationType): MemorySegment {
        val sel = ObjCRuntime.sel("writableTypesForSaveOperation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, saveOperation.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun fileNameExtensionForType_saveOperation(typeName: MemorySegment, saveOperation: NSSaveOperationType): MemorySegment {
        val sel = ObjCRuntime.sel("fileNameExtensionForType:saveOperation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeName, saveOperation.rawValue) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun fileNameExtensionForType_saveOperationAsString(typeName: MemorySegment, saveOperation: NSSaveOperationType): String = ObjCRuntime.toJavaString(fileNameExtensionForType_saveOperation(typeName, saveOperation))

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun fileNameExtensionForType_saveOperation(typeName: String, saveOperation: NSSaveOperationType): MemorySegment = fileNameExtensionForType_saveOperation(ObjCRuntime.newNSString(Arena.global(), typeName), saveOperation)

    /** Convenience overload — [String] parameters and [String] return type. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun fileNameExtensionForType_saveOperationAsString(typeName: String, saveOperation: NSSaveOperationType): String = ObjCRuntime.toJavaString(fileNameExtensionForType_saveOperation(ObjCRuntime.newNSString(Arena.global(), typeName), saveOperation))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun validateUserInterfaceItem(item: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, item) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun relinquishPresentedItemToReader(reader: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("relinquishPresentedItemToReader:")
        ObjCRuntime.msgSend(null, ptr, sel, reader)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun relinquishPresentedItemToWriter(writer: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("relinquishPresentedItemToWriter:")
        ObjCRuntime.msgSend(null, ptr, sel, writer)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun savePresentedItemChangesWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("savePresentedItemChangesWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun accommodatePresentedItemDeletionWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("accommodatePresentedItemDeletionWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun presentedItemDidMoveToURL(newURL: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("presentedItemDidMoveToURL:")
        ObjCRuntime.msgSend(null, ptr, sel, newURL)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun presentedItemDidChange(): Unit {
        val sel = ObjCRuntime.sel("presentedItemDidChange")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun presentedItemDidChangeUbiquityAttributes(attributes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("presentedItemDidChangeUbiquityAttributes:")
        ObjCRuntime.msgSend(null, ptr, sel, attributes)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun presentedItemDidGainVersion(version: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("presentedItemDidGainVersion:")
        ObjCRuntime.msgSend(null, ptr, sel, version)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun presentedItemDidLoseVersion(version: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("presentedItemDidLoseVersion:")
        ObjCRuntime.msgSend(null, ptr, sel, version)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun presentedItemDidResolveConflictVersion(version: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("presentedItemDidResolveConflictVersion:")
        ObjCRuntime.msgSend(null, ptr, sel, version)
    }

    // @property fileType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileType(): MemorySegment {
        val sel = ObjCRuntime.sel("fileType")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFileType(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFileType:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileTypeAsString(): String = ObjCRuntime.toJavaString(fileType())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFileType(value: String) = setFileType(ObjCRuntime.newNSString(Arena.global(), value))

    // @property fileURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileURL(): MemorySegment {
        val sel = ObjCRuntime.sel("fileURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFileURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFileURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property fileModificationDate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileModificationDate(): MemorySegment {
        val sel = ObjCRuntime.sel("fileModificationDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFileModificationDate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFileModificationDate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property draft
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun isDraft(): Boolean {
        val sel = ObjCRuntime.sel("isDraft")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setDraft(value: Boolean) {
        val sel = ObjCRuntime.sel("setDraft:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property entireFileLoaded
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun isEntireFileLoaded(): Boolean {
        val sel = ObjCRuntime.sel("isEntireFileLoaded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property autosavingIsImplicitlyCancellable
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun autosavingIsImplicitlyCancellable(): Boolean {
        val sel = ObjCRuntime.sel("autosavingIsImplicitlyCancellable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property keepBackupFile
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keepBackupFile(): Boolean {
        val sel = ObjCRuntime.sel("keepBackupFile")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property backupFileURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun backupFileURL(): MemorySegment {
        val sel = ObjCRuntime.sel("backupFileURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property savePanelShowsFileFormatsControl
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun savePanelShowsFileFormatsControl(): Boolean {
        val sel = ObjCRuntime.sel("savePanelShowsFileFormatsControl")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property fileNameExtensionWasHiddenInLastRunSavePanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileNameExtensionWasHiddenInLastRunSavePanel(): Boolean {
        val sel = ObjCRuntime.sel("fileNameExtensionWasHiddenInLastRunSavePanel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property fileTypeFromLastRunSavePanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileTypeFromLastRunSavePanel(): MemorySegment {
        val sel = ObjCRuntime.sel("fileTypeFromLastRunSavePanel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileTypeFromLastRunSavePanelAsString(): String = ObjCRuntime.toJavaString(fileTypeFromLastRunSavePanel())

    // @property hasUnautosavedChanges
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasUnautosavedChanges(): Boolean {
        val sel = ObjCRuntime.sel("hasUnautosavedChanges")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property browsingVersions
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun isBrowsingVersions(): Boolean {
        val sel = ObjCRuntime.sel("isBrowsingVersions")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property autosavingFileType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosavingFileType(): MemorySegment {
        val sel = ObjCRuntime.sel("autosavingFileType")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosavingFileTypeAsString(): String = ObjCRuntime.toJavaString(autosavingFileType())

    // @property autosavedContentsFileURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosavedContentsFileURL(): MemorySegment {
        val sel = ObjCRuntime.sel("autosavedContentsFileURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutosavedContentsFileURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAutosavedContentsFileURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property locked
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun isLocked(): Boolean {
        val sel = ObjCRuntime.sel("isLocked")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property printInfo
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun printInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("printInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPrintInfo(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPrintInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property PDFPrintOperation
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun PDFPrintOperation(): MemorySegment {
        val sel = ObjCRuntime.sel("PDFPrintOperation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property allowsDocumentSharing
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun allowsDocumentSharing(): Boolean {
        val sel = ObjCRuntime.sel("allowsDocumentSharing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property previewRepresentableActivityItems
    /** @return NSArray<id<NSPreviewRepresentableActivityItem>> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 2, introducedSubminor = -1)
    open fun previewRepresentableActivityItems(): MemorySegment {
        val sel = ObjCRuntime.sel("previewRepresentableActivityItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 2, introducedSubminor = -1)
    open fun setPreviewRepresentableActivityItems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPreviewRepresentableActivityItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property documentEdited
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isDocumentEdited(): Boolean {
        val sel = ObjCRuntime.sel("isDocumentEdited")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property inViewingMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun isInViewingMode(): Boolean {
        val sel = ObjCRuntime.sel("isInViewingMode")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property undoManager
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun undoManager(): MemorySegment {
        val sel = ObjCRuntime.sel("undoManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUndoManager(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setUndoManager:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasUndoManager
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasUndoManager(): Boolean {
        val sel = ObjCRuntime.sel("hasUndoManager")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHasUndoManager(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasUndoManager:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property windowNibName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun windowNibName(): MemorySegment {
        val sel = ObjCRuntime.sel("windowNibName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property windowControllers
    /** @return NSArray<__kindof NSWindowController *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun windowControllers(): MemorySegment {
        val sel = ObjCRuntime.sel("windowControllers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property displayName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayName(): MemorySegment {
        val sel = ObjCRuntime.sel("displayName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDisplayName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDisplayName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayNameAsString(): String = ObjCRuntime.toJavaString(displayName())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDisplayName(value: String) = setDisplayName(ObjCRuntime.newNSString(Arena.global(), value))

    // @property windowForSheet
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun windowForSheet(): MemorySegment {
        val sel = ObjCRuntime.sel("windowForSheet")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property presentedItemURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun presentedItemURL(): MemorySegment {
        val sel = ObjCRuntime.sel("presentedItemURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property observedPresentedItemUbiquityAttributes
    /** @return NSSet<NSURLResourceKey> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun observedPresentedItemUbiquityAttributes(): MemorySegment {
        val sel = ObjCRuntime.sel("observedPresentedItemUbiquityAttributes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol NSFilePresenter.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDocument.presentedItemOperationQueue(): MemorySegment {
    val sel = ObjCRuntime.sel("presentedItemOperationQueue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSDeprecated on NSDocument ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -saveToURL:ofType:forSaveOperation:completionHandler: instead")
fun NSDocument.saveToURL_ofType_forSaveOperation_error(url: MemorySegment, typeName: MemorySegment, saveOperation: NSSaveOperationType, outError: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("saveToURL:ofType:forSaveOperation:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, typeName, saveOperation.rawValue, outError) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.dataRepresentationOfType(type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dataRepresentationOfType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.fileAttributesToWriteToFile_ofType_saveOperation(fullDocumentPath: MemorySegment, documentTypeName: MemorySegment, saveOperationType: NSSaveOperationType): MemorySegment {
    val sel = ObjCRuntime.sel("fileAttributesToWriteToFile:ofType:saveOperation:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, fullDocumentPath, documentTypeName, saveOperationType.rawValue) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.fileName(): MemorySegment {
    val sel = ObjCRuntime.sel("fileName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.fileWrapperRepresentationOfType(type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("fileWrapperRepresentationOfType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.initWithContentsOfFile_ofType(absolutePath: MemorySegment, typeName: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfFile:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, absolutePath, typeName) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.initWithContentsOfURL_ofType(url: MemorySegment, typeName: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, typeName) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.loadDataRepresentation_ofType(`data`: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("loadDataRepresentation:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `data`, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.loadFileWrapperRepresentation_ofType(wrapper: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("loadFileWrapperRepresentation:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, wrapper, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.printShowingPrintPanel(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("printShowingPrintPanel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.readFromFile_ofType(fileName: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readFromFile:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fileName, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.readFromURL_ofType(url: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readFromURL:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.revertToSavedFromFile_ofType(fileName: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("revertToSavedFromFile:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fileName, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.revertToSavedFromURL_ofType(url: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("revertToSavedFromURL:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.runModalPageLayoutWithPrintInfo(printInfo: MemorySegment): Long {
    val sel = ObjCRuntime.sel("runModalPageLayoutWithPrintInfo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, printInfo) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.saveToFile_saveOperation_delegate_didSaveSelector_contextInfo(fileName: MemorySegment, saveOperation: NSSaveOperationType, delegate: MemorySegment, didSaveSelector: MemorySegment, contextInfo: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("saveToFile:saveOperation:delegate:didSaveSelector:contextInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fileName, saveOperation.rawValue, delegate, didSaveSelector, contextInfo)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.setFileName(fileName: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setFileName:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fileName)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.writeToFile_ofType(fileName: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeToFile:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fileName, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.writeToFile_ofType_originalFile_saveOperation(fullDocumentPath: MemorySegment, documentTypeName: MemorySegment, fullOriginalDocumentPath: MemorySegment, saveOperationType: NSSaveOperationType): Boolean {
    val sel = ObjCRuntime.sel("writeToFile:ofType:originalFile:saveOperation:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fullDocumentPath, documentTypeName, fullOriginalDocumentPath, saveOperationType.rawValue) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.writeToURL_ofType(url: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocument.writeWithBackupToFile_ofType_saveOperation(fullDocumentPath: MemorySegment, documentTypeName: MemorySegment, saveOperationType: NSSaveOperationType): Boolean {
    val sel = ObjCRuntime.sel("writeWithBackupToFile:ofType:saveOperation:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fullDocumentPath, documentTypeName, saveOperationType.rawValue) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSDocument.shouldRunSavePanelWithAccessoryView(): Boolean {
    val sel = ObjCRuntime.sel("shouldRunSavePanelWithAccessoryView")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSUserActivity on NSDocument ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSDocument.updateUserActivityState(activity: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("updateUserActivityState:")
    ObjCRuntime.msgSend(null, this.ptr, sel, activity)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSDocument.userActivity(): MemorySegment {
    val sel = ObjCRuntime.sel("userActivity")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSDocument.setUserActivity(userActivity: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setUserActivity:")
    ObjCRuntime.msgSend(null, this.ptr, sel, userActivity)
}

// ── Category: NSScripting on NSDocument ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDocument.handleSaveScriptCommand(command: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("handleSaveScriptCommand:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, command) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDocument.handleCloseScriptCommand(command: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("handleCloseScriptCommand:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, command) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDocument.handlePrintScriptCommand(command: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("handlePrintScriptCommand:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, command) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDocument.lastComponentOfFileName(): MemorySegment {
    val sel = ObjCRuntime.sel("lastComponentOfFileName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSDocument.setLastComponentOfFileName(lastComponentOfFileName: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setLastComponentOfFileName:")
    ObjCRuntime.msgSend(null, this.ptr, sel, lastComponentOfFileName)
}

// ── Category: NSRestorableState on NSDocument ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSDocument.restoreDocumentWindowWithIdentifier_state_completionHandler(identifier: MemorySegment, state: MemorySegment, completionHandler: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("restoreDocumentWindowWithIdentifier:state:completionHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, identifier, state, completionHandler)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSDocument.encodeRestorableStateWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeRestorableStateWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun NSDocument.encodeRestorableStateWithCoder_backgroundQueue(coder: MemorySegment, queue: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeRestorableStateWithCoder:backgroundQueue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder, queue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSDocument.restoreStateWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("restoreStateWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSDocument.invalidateRestorableState(): Unit {
    val sel = ObjCRuntime.sel("invalidateRestorableState")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// Class method: +[NSDocument allowedClassesForRestorableStateKeyPath:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
fun NSDocument_allowedClassesForRestorableStateKeyPath(keyPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("allowedClassesForRestorableStateKeyPath:")
    val cls = ObjCRuntime.getClass("NSDocument")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, keyPath) as MemorySegment
}

// Class method: +[NSDocument restorableStateKeyPaths]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSDocument_restorableStateKeyPaths(): MemorySegment {
    val sel = ObjCRuntime.sel("restorableStateKeyPaths")
    val cls = ObjCRuntime.getClass("NSDocument")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}
