@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDocumentController
 * Superclass: NSObject
 * Protocols: NSCoding, NSMenuItemValidation, NSUserInterfaceValidations
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSDocumentController(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSDocumentController") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedDocumentController(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedDocumentController")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentForURL(url: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("documentForURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentForWindow(window: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("documentForWindow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, window) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addDocument(document: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, document)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeDocument(document: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, document)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun newDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("newDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openUntitledDocumentAndDisplay_error(displayDocument: Boolean, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("openUntitledDocumentAndDisplay:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, displayDocument, outError) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeUntitledDocumentOfType_error(typeName: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("makeUntitledDocumentOfType:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeName, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun makeUntitledDocumentOfType_error(typeName: String, outError: MemorySegment): MemorySegment = makeUntitledDocumentOfType_error(ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("openDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    /** @return NSArray<NSURL *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun URLsFromRunningOpenPanel(): MemorySegment {
        val sel = ObjCRuntime.sel("URLsFromRunningOpenPanel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runModalOpenPanel_forTypes(openPanel: MemorySegment, types: MemorySegment): Long {
        val sel = ObjCRuntime.sel("runModalOpenPanel:forTypes:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, openPanel, types) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun beginOpenPanelWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginOpenPanelWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun beginOpenPanel_forTypes_completionHandler(openPanel: MemorySegment, inTypes: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginOpenPanel:forTypes:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, openPanel, inTypes, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun openDocumentWithContentsOfURL_display_completionHandler(url: MemorySegment, displayDocument: Boolean, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("openDocumentWithContentsOfURL:display:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, url, displayDocument, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeDocumentWithContentsOfURL_ofType_error(url: MemorySegment, typeName: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("makeDocumentWithContentsOfURL:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url, typeName, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun makeDocumentWithContentsOfURL_ofType_error(url: MemorySegment, typeName: String, outError: MemorySegment): MemorySegment = makeDocumentWithContentsOfURL_ofType_error(url, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun reopenDocumentForURL_withContentsOfURL_display_completionHandler(urlOrNil: MemorySegment, contentsURL: MemorySegment, displayDocument: Boolean, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reopenDocumentForURL:withContentsOfURL:display:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, urlOrNil, contentsURL, displayDocument, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeDocumentForURL_withContentsOfURL_ofType_error(urlOrNil: MemorySegment, contentsURL: MemorySegment, typeName: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("makeDocumentForURL:withContentsOfURL:ofType:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, urlOrNil, contentsURL, typeName, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun makeDocumentForURL_withContentsOfURL_ofType_error(urlOrNil: MemorySegment, contentsURL: MemorySegment, typeName: String, outError: MemorySegment): MemorySegment = makeDocumentForURL_withContentsOfURL_ofType_error(urlOrNil, contentsURL, ObjCRuntime.newNSString(Arena.global(), typeName), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saveAllDocuments(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveAllDocuments:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo(title: MemorySegment, cancellable: Boolean, delegate: MemorySegment, didReviewAllSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reviewUnsavedDocumentsWithAlertTitle:cancellable:delegate:didReviewAllSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, title, cancellable, delegate, didReviewAllSelector, contextInfo)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo(title: String, cancellable: Boolean, delegate: MemorySegment, didReviewAllSelector: MemorySegment, contextInfo: MemorySegment): Unit = reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo(ObjCRuntime.newNSString(Arena.global(), title), cancellable, delegate, didReviewAllSelector, contextInfo)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo(delegate: MemorySegment, didCloseAllSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("closeAllDocumentsWithDelegate:didCloseAllSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, delegate, didCloseAllSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun duplicateDocumentWithContentsOfURL_copying_displayName_error(url: MemorySegment, duplicateByCopying: Boolean, displayNameOrNil: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("duplicateDocumentWithContentsOfURL:copying:displayName:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url, duplicateByCopying, displayNameOrNil, outError) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun duplicateDocumentWithContentsOfURL_copying_displayName_error(url: MemorySegment, duplicateByCopying: Boolean, displayNameOrNil: String, outError: MemorySegment): MemorySegment = duplicateDocumentWithContentsOfURL_copying_displayName_error(url, duplicateByCopying, ObjCRuntime.newNSString(Arena.global(), displayNameOrNil), outError)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun standardShareMenuItem(): MemorySegment {
        val sel = ObjCRuntime.sel("standardShareMenuItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
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
    open fun clearRecentDocuments(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("clearRecentDocuments:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun noteNewRecentDocument(document: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("noteNewRecentDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, document)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun noteNewRecentDocumentURL(url: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("noteNewRecentDocumentURL:")
        ObjCRuntime.msgSend(null, ptr, sel, url)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun typeForContentsOfURL_error(url: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("typeForContentsOfURL:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url, outError) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun typeForContentsOfURL_errorAsString(url: MemorySegment, outError: MemorySegment): String = ObjCRuntime.toJavaString(typeForContentsOfURL_error(url, outError))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentClassForType(typeName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("documentClassForType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeName) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun documentClassForType(typeName: String): MemorySegment = documentClassForType(ObjCRuntime.newNSString(Arena.global(), typeName))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayNameForType(typeName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("displayNameForType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeName) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun displayNameForTypeAsString(typeName: MemorySegment): String = ObjCRuntime.toJavaString(displayNameForType(typeName))

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun displayNameForType(typeName: String): MemorySegment = displayNameForType(ObjCRuntime.newNSString(Arena.global(), typeName))

    /** Convenience overload — [String] parameters and [String] return type. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun displayNameForTypeAsString(typeName: String): String = ObjCRuntime.toJavaString(displayNameForType(ObjCRuntime.newNSString(Arena.global(), typeName)))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun validateUserInterfaceItem(item: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, item) as Boolean
    }

    // @property documents
    /** @return NSArray<__kindof NSDocument *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documents(): MemorySegment {
        val sel = ObjCRuntime.sel("documents")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property currentDocument
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun currentDocument(): MemorySegment {
        val sel = ObjCRuntime.sel("currentDocument")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property currentDirectory
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun currentDirectory(): MemorySegment {
        val sel = ObjCRuntime.sel("currentDirectory")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun currentDirectoryAsString(): String = ObjCRuntime.toJavaString(currentDirectory())

    // @property autosavingDelay
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosavingDelay(): Double {
        val sel = ObjCRuntime.sel("autosavingDelay")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutosavingDelay(value: Double) {
        val sel = ObjCRuntime.sel("setAutosavingDelay:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasEditedDocuments
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasEditedDocuments(): Boolean {
        val sel = ObjCRuntime.sel("hasEditedDocuments")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property allowsAutomaticShareMenu
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun allowsAutomaticShareMenu(): Boolean {
        val sel = ObjCRuntime.sel("allowsAutomaticShareMenu")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property maximumRecentDocumentCount
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maximumRecentDocumentCount(): Long {
        val sel = ObjCRuntime.sel("maximumRecentDocumentCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property recentDocumentURLs
    /** @return NSArray<NSURL *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun recentDocumentURLs(): MemorySegment {
        val sel = ObjCRuntime.sel("recentDocumentURLs")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property defaultType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun defaultType(): MemorySegment {
        val sel = ObjCRuntime.sel("defaultType")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun defaultTypeAsString(): String = ObjCRuntime.toJavaString(defaultType())

    // @property documentClassNames
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentClassNames(): MemorySegment {
        val sel = ObjCRuntime.sel("documentClassNames")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSDocumentController.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

// ── Category: NSDeprecated on NSDocumentController ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -openDocumentWithContentsOfURL:display:completionHandler: instead")
fun NSDocumentController.openDocumentWithContentsOfURL_display_error(url: MemorySegment, displayDocument: Boolean, outError: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("openDocumentWithContentsOfURL:display:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, displayDocument, outError) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -reopenDocumentForURL:withContentsOfURL:display:completionHandler: instead")
fun NSDocumentController.reopenDocumentForURL_withContentsOfURL_error(url: MemorySegment, contentsURL: MemorySegment, outError: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("reopenDocumentForURL:withContentsOfURL:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, contentsURL, outError) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSDocumentController.fileExtensionsFromType(typeName: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("fileExtensionsFromType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, typeName) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSDocumentController.typeFromFileExtension(fileNameExtensionOrHFSFileType: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("typeFromFileExtension:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, fileNameExtensionOrHFSFileType) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.documentForFileName(fileName: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("documentForFileName:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, fileName) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.fileNamesFromRunningOpenPanel(): MemorySegment {
    val sel = ObjCRuntime.sel("fileNamesFromRunningOpenPanel")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.makeDocumentWithContentsOfFile_ofType(fileName: MemorySegment, type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("makeDocumentWithContentsOfFile:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, fileName, type) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.makeDocumentWithContentsOfURL_ofType(url: MemorySegment, type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("makeDocumentWithContentsOfURL:ofType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, type) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.makeUntitledDocumentOfType(type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("makeUntitledDocumentOfType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.openDocumentWithContentsOfFile_display(fileName: MemorySegment, display: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("openDocumentWithContentsOfFile:display:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, fileName, display) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.openDocumentWithContentsOfURL_display(url: MemorySegment, display: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("openDocumentWithContentsOfURL:display:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, display) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.openUntitledDocumentOfType_display(type: MemorySegment, display: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("openUntitledDocumentOfType:display:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type, display) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.setShouldCreateUI(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setShouldCreateUI:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSDocumentController.shouldCreateUI(): Boolean {
    val sel = ObjCRuntime.sel("shouldCreateUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSWindowRestoration on NSDocumentController ─────────────────────────────────────────
