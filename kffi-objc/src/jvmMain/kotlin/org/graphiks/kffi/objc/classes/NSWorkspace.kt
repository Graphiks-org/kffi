@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSWorkspace
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSWorkspace(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSWorkspace") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedWorkspace(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedWorkspace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openURL(url: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("openURL:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, url) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun openURL_configuration_completionHandler(url: MemorySegment, configuration: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("openURL:configuration:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, url, configuration, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun openURLs_withApplicationAtURL_configuration_completionHandler(urls: MemorySegment, applicationURL: MemorySegment, configuration: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("openURLs:withApplicationAtURL:configuration:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, urls, applicationURL, configuration, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun openApplicationAtURL_configuration_completionHandler(applicationURL: MemorySegment, configuration: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("openApplicationAtURL:configuration:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, applicationURL, configuration, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectFile_inFileViewerRootedAtPath(fullPath: MemorySegment, rootFullPath: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("selectFile:inFileViewerRootedAtPath:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, fullPath, rootFullPath) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun selectFile_inFileViewerRootedAtPath(fullPath: String, rootFullPath: String): Boolean = selectFile_inFileViewerRootedAtPath(ObjCRuntime.newNSString(Arena.global(), fullPath), ObjCRuntime.newNSString(Arena.global(), rootFullPath))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun activateFileViewerSelectingURLs(fileURLs: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("activateFileViewerSelectingURLs:")
        ObjCRuntime.msgSend(null, ptr, sel, fileURLs)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun showSearchResultsForQueryString(queryString: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("showSearchResultsForQueryString:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, queryString) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    fun showSearchResultsForQueryString(queryString: String): Boolean = showSearchResultsForQueryString(ObjCRuntime.newNSString(Arena.global(), queryString))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun noteFileSystemChanged(path: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("noteFileSystemChanged:")
        ObjCRuntime.msgSend(null, ptr, sel, path)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun noteFileSystemChanged(path: String): Unit = noteFileSystemChanged(ObjCRuntime.newNSString(Arena.global(), path))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFilePackageAtPath(fullPath: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("isFilePackageAtPath:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, fullPath) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun isFilePackageAtPath(fullPath: String): Boolean = isFilePackageAtPath(ObjCRuntime.newNSString(Arena.global(), fullPath))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun iconForFile(fullPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("iconForFile:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fullPath) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun iconForFile(fullPath: String): MemorySegment = iconForFile(ObjCRuntime.newNSString(Arena.global(), fullPath))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun iconForFiles(fullPaths: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("iconForFiles:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fullPaths) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun iconForContentType(contentType: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("iconForContentType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, contentType) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIcon_forFile_options(image: MemorySegment, fullPath: MemorySegment, options: NSWorkspaceIconCreationOptions): Boolean {
        val sel = ObjCRuntime.sel("setIcon:forFile:options:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, image, fullPath, options.rawValue) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setIcon_forFile_options(image: MemorySegment, fullPath: String, options: NSWorkspaceIconCreationOptions): Boolean = setIcon_forFile_options(image, ObjCRuntime.newNSString(Arena.global(), fullPath), options)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun recycleURLs_completionHandler(URLs: MemorySegment, handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("recycleURLs:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, URLs, handler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun duplicateURLs_completionHandler(URLs: MemorySegment, handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("duplicateURLs:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, URLs, handler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type(fullPath: MemorySegment, removableFlag: MemorySegment, writableFlag: MemorySegment, unmountableFlag: MemorySegment, description: MemorySegment, fileSystemType: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("getFileSystemInfoForPath:isRemovable:isWritable:isUnmountable:description:type:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, fullPath, removableFlag, writableFlag, unmountableFlag, description, fileSystemType) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type(fullPath: String, removableFlag: MemorySegment, writableFlag: MemorySegment, unmountableFlag: MemorySegment, description: String, fileSystemType: String): Boolean = getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type(ObjCRuntime.newNSString(Arena.global(), fullPath), removableFlag, writableFlag, unmountableFlag, ObjCRuntime.newNSString(Arena.global(), description), ObjCRuntime.newNSString(Arena.global(), fileSystemType))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun unmountAndEjectDeviceAtPath(path: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("unmountAndEjectDeviceAtPath:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, path) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun unmountAndEjectDeviceAtPath(path: String): Boolean = unmountAndEjectDeviceAtPath(ObjCRuntime.newNSString(Arena.global(), path))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun unmountAndEjectDeviceAtURL_error(url: MemorySegment, error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("unmountAndEjectDeviceAtURL:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, url, error) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun extendPowerOffBy(requested: Long): Long {
        val sel = ObjCRuntime.sel("extendPowerOffBy:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, requested) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hideOtherApplications(): Unit {
        val sel = ObjCRuntime.sel("hideOtherApplications")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun URLForApplicationWithBundleIdentifier(bundleIdentifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("URLForApplicationWithBundleIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, bundleIdentifier) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    fun URLForApplicationWithBundleIdentifier(bundleIdentifier: String): MemorySegment = URLForApplicationWithBundleIdentifier(ObjCRuntime.newNSString(Arena.global(), bundleIdentifier))

    /** @return NSArray<NSURL *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun URLsForApplicationsWithBundleIdentifier(bundleIdentifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("URLsForApplicationsWithBundleIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, bundleIdentifier) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    fun URLsForApplicationsWithBundleIdentifier(bundleIdentifier: String): MemorySegment = URLsForApplicationsWithBundleIdentifier(ObjCRuntime.newNSString(Arena.global(), bundleIdentifier))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun URLForApplicationToOpenURL(url: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("URLForApplicationToOpenURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url) as MemorySegment
    }

    /** @return NSArray<NSURL *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun URLsForApplicationsToOpenURL(url: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("URLsForApplicationsToOpenURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun setDefaultApplicationAtURL_toOpenContentTypeOfFileAtURL_completionHandler(applicationURL: MemorySegment, url: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setDefaultApplicationAtURL:toOpenContentTypeOfFileAtURL:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, applicationURL, url, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun setDefaultApplicationAtURL_toOpenURLsWithScheme_completionHandler(applicationURL: MemorySegment, urlScheme: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setDefaultApplicationAtURL:toOpenURLsWithScheme:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, applicationURL, urlScheme, completionHandler)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    fun setDefaultApplicationAtURL_toOpenURLsWithScheme_completionHandler(applicationURL: MemorySegment, urlScheme: String, completionHandler: MemorySegment): Unit = setDefaultApplicationAtURL_toOpenURLsWithScheme_completionHandler(applicationURL, ObjCRuntime.newNSString(Arena.global(), urlScheme), completionHandler)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun setDefaultApplicationAtURL_toOpenFileAtURL_completionHandler(applicationURL: MemorySegment, url: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setDefaultApplicationAtURL:toOpenFileAtURL:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, applicationURL, url, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun URLForApplicationToOpenContentType(contentType: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("URLForApplicationToOpenContentType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, contentType) as MemorySegment
    }

    /** @return NSArray<NSURL *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun URLsForApplicationsToOpenContentType(contentType: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("URLsForApplicationsToOpenContentType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, contentType) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun setDefaultApplicationAtURL_toOpenContentType_completionHandler(applicationURL: MemorySegment, contentType: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setDefaultApplicationAtURL:toOpenContentType:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, applicationURL, contentType, completionHandler)
    }

    // @property notificationCenter
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun notificationCenter(): MemorySegment {
        val sel = ObjCRuntime.sel("notificationCenter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property fileLabels
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun fileLabels(): MemorySegment {
        val sel = ObjCRuntime.sel("fileLabels")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property fileLabelColors
    /** @return NSArray<NSColor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun fileLabelColors(): MemorySegment {
        val sel = ObjCRuntime.sel("fileLabelColors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property frontmostApplication
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun frontmostApplication(): MemorySegment {
        val sel = ObjCRuntime.sel("frontmostApplication")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property menuBarOwningApplication
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun menuBarOwningApplication(): MemorySegment {
        val sel = ObjCRuntime.sel("menuBarOwningApplication")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

// ── Category: NSDesktopImages on NSWorkspace ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSWorkspace.setDesktopImageURL_forScreen_options_error(url: MemorySegment, screen: MemorySegment, options: MemorySegment, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("setDesktopImageURL:forScreen:options:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, screen, options, error) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSWorkspace.desktopImageURLForScreen(screen: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("desktopImageURLForScreen:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, screen) as MemorySegment
}

/** @return NSDictionary<NSWorkspaceDesktopImageOptionKey,id> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSWorkspace.desktopImageOptionsForScreen(screen: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("desktopImageOptionsForScreen:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, screen) as MemorySegment
}

// ── Category: NSWorkspaceAuthorization on NSWorkspace ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun NSWorkspace.requestAuthorizationOfType_completionHandler(type: NSWorkspaceAuthorizationType, completionHandler: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("requestAuthorizationOfType:completionHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, type.rawValue, completionHandler)
}

// ── Category: NSDeprecated on NSWorkspace ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openURL:] instead.")
fun NSWorkspace.openFile(fullPath: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("openFile:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fullPath) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openURLs:withApplicationAtURL:configuration:completionHandler:] instead.")
fun NSWorkspace.openFile_withApplication(fullPath: MemorySegment, appName: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("openFile:withApplication:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fullPath, appName) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openURLs:withApplicationAtURL:configuration:completionHandler:] instead.")
fun NSWorkspace.openFile_withApplication_andDeactivate(fullPath: MemorySegment, appName: MemorySegment, flag: Boolean): Boolean {
    val sel = ObjCRuntime.sel("openFile:withApplication:andDeactivate:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fullPath, appName, flag) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openApplicationAtURL:configuration:completionHandler:] instead.")
fun NSWorkspace.launchApplication(appName: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("launchApplication:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, appName) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openApplicationAtURL:configuration:completionHandler:] instead.")
fun NSWorkspace.launchApplicationAtURL_options_configuration_error(url: MemorySegment, options: NSWorkspaceLaunchOptions, configuration: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("launchApplicationAtURL:options:configuration:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, options.rawValue, configuration, error) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openURL:configuration:completionHandler:] instead.")
fun NSWorkspace.openURL_options_configuration_error(url: MemorySegment, options: NSWorkspaceLaunchOptions, configuration: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("openURL:options:configuration:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, options.rawValue, configuration, error) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openURLs:withApplicationAtURL:configuration:completionHandler:] instead.")
fun NSWorkspace.openURLs_withApplicationAtURL_options_configuration_error(urls: MemorySegment, applicationURL: MemorySegment, options: NSWorkspaceLaunchOptions, configuration: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("openURLs:withApplicationAtURL:options:configuration:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, urls, applicationURL, options.rawValue, configuration, error) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openApplicationAtURL:configuration:completionHandler:] instead.")
fun NSWorkspace.launchApplication_showIcon_autolaunch(appName: MemorySegment, showIcon: Boolean, autolaunch: Boolean): Boolean {
    val sel = ObjCRuntime.sel("launchApplication:showIcon:autolaunch:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, appName, showIcon, autolaunch) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace URLForApplicationWithBundleIdentifier:] instead.")
fun NSWorkspace.fullPathForApplication(appName: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("fullPathForApplication:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, appName) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace URLForApplicationWithBundleIdentifier:] instead.")
fun NSWorkspace.absolutePathForAppBundleWithIdentifier(bundleIdentifier: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("absolutePathForAppBundleWithIdentifier:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bundleIdentifier) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openApplicationAtURL:configuration:completionHandler:] instead.")
fun NSWorkspace.launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier(bundleIdentifier: MemorySegment, options: NSWorkspaceLaunchOptions, descriptor: MemorySegment, identifier: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("launchAppWithBundleIdentifier:options:additionalEventParamDescriptor:launchIdentifier:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, bundleIdentifier, options.rawValue, descriptor, identifier) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace openURLs:withApplicationAtURL:configuration:completionHandler:] instead.")
fun NSWorkspace.openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers(urls: MemorySegment, bundleIdentifier: MemorySegment, options: NSWorkspaceLaunchOptions, descriptor: MemorySegment, identifiers: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("openURLs:withAppBundleIdentifier:options:additionalEventParamDescriptor:launchIdentifiers:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, urls, bundleIdentifier, options.rawValue, descriptor, identifiers) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.openTempFile(fullPath: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("openTempFile:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fullPath) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.findApplications(): Unit {
    val sel = ObjCRuntime.sel("findApplications")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.noteUserDefaultsChanged(): Unit {
    val sel = ObjCRuntime.sel("noteUserDefaultsChanged")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.slideImage_from_to(image: MemorySegment, fromPoint: NSPoint, toPoint: NSPoint): Unit {
    val sel = ObjCRuntime.sel("slideImage:from:to:")
    ObjCRuntime.msgSend(null, this.ptr, sel, image, ObjCRuntime.ObjCStructArg(fromPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(toPoint.segment, NSPoint.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.checkForRemovableMedia(): Unit {
    val sel = ObjCRuntime.sel("checkForRemovableMedia")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.noteFileSystemChanged(): Unit {
    val sel = ObjCRuntime.sel("noteFileSystemChanged")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.fileSystemChanged(): Boolean {
    val sel = ObjCRuntime.sel("fileSystemChanged")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.userDefaultsChanged(): Boolean {
    val sel = ObjCRuntime.sel("userDefaultsChanged")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSWorkspace.mountNewRemovableMedia(): MemorySegment {
    val sel = ObjCRuntime.sel("mountNewRemovableMedia")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSWorkspace frontmostApplication] instead.")
fun NSWorkspace.activeApplication(): MemorySegment {
    val sel = ObjCRuntime.sel("activeApplication")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSFileManager mountedVolumeURLsIncludingResourceValuesForKeys:options:] instead.")
fun NSWorkspace.mountedLocalVolumePaths(): MemorySegment {
    val sel = ObjCRuntime.sel("mountedLocalVolumePaths")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSFileManager mountedVolumeURLsIncludingResourceValuesForKeys:options:] instead.")
fun NSWorkspace.mountedRemovableMedia(): MemorySegment {
    val sel = ObjCRuntime.sel("mountedRemovableMedia")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -[NSWorkspace runningApplications] instead.")
fun NSWorkspace.launchedApplications(): MemorySegment {
    val sel = ObjCRuntime.sel("launchedApplications")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -[NSWorkspace openURL:] instead.")
fun NSWorkspace.openFile_fromImage_at_inView(fullPath: MemorySegment, image: MemorySegment, point: NSPoint, view: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("openFile:fromImage:at:inView:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fullPath, image, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), view) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
fun NSWorkspace.performFileOperation_source_destination_files_tag(operation: MemorySegment, source: MemorySegment, destination: MemorySegment, files: MemorySegment, tag: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("performFileOperation:source:destination:files:tag:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, operation, source, destination, files, tag) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace URLForApplicationToOpenURL:] to get the URL of an application that will open a given item, or -[NSURL getResourceValue:forKey:error:] with NSURLContentTypeKey to get the type of the given item.")
fun NSWorkspace.getInfoForFile_application_type(fullPath: MemorySegment, appName: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("getInfoForFile:application:type:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, fullPath, appName, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace iconForContentType:] instead.")
fun NSWorkspace.iconForFileType(fileType: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("iconForFileType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, fileType) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSURL getResourceValue:forKey:error:] with NSURLContentTypeKey instead.")
fun NSWorkspace.typeOfFile_error(absoluteFilePath: MemorySegment, outError: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("typeOfFile:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, absoluteFilePath, outError) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use UTType.localizedDescription instead.")
fun NSWorkspace.localizedDescriptionForType(typeName: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedDescriptionForType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, typeName) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use UTType.preferredFilenameExtension instead.")
fun NSWorkspace.preferredFilenameExtensionForType(typeName: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("preferredFilenameExtensionForType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, typeName) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +[UTType typesWithTag:tagClass:conformingToType:] to get a list of candidate types, then check if the input type conforms to any of them.")
fun NSWorkspace.filenameExtension_isValidForType(filenameExtension: MemorySegment, typeName: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("filenameExtension:isValidForType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, filenameExtension, typeName) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[UTType conformsToType:] instead.")
fun NSWorkspace.type_conformsToType(firstTypeName: MemorySegment, secondTypeName: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("type:conformsToType:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, firstTypeName, secondTypeName) as Boolean
}

// ── Category: NSWorkspaceAccessibilityDisplay on NSWorkspace ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSWorkspace.accessibilityDisplayShouldIncreaseContrast(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityDisplayShouldIncreaseContrast")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSWorkspace.accessibilityDisplayShouldDifferentiateWithoutColor(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityDisplayShouldDifferentiateWithoutColor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSWorkspace.accessibilityDisplayShouldReduceTransparency(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityDisplayShouldReduceTransparency")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSWorkspace.accessibilityDisplayShouldReduceMotion(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityDisplayShouldReduceMotion")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSWorkspace.accessibilityDisplayShouldInvertColors(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityDisplayShouldInvertColors")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSWorkspaceAccessibility on NSWorkspace ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun NSWorkspace.isVoiceOverEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isVoiceOverEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun NSWorkspace.isSwitchControlEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isSwitchControlEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSWorkspaceRunningApplications on NSWorkspace ─────────────────────────────────────────

/** @return NSArray<NSRunningApplication *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSWorkspace.runningApplications(): MemorySegment {
    val sel = ObjCRuntime.sel("runningApplications")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
