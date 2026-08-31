@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSURL
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
open class NSURL(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSURL") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun fileURLWithPath_isDirectory_relativeToURL(path: MemorySegment, isDir: Boolean, baseURL: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fileURLWithPath:isDirectory:relativeToURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, path, isDir, baseURL) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun fileURLWithPath_isDirectory_relativeToURL(path: String, isDir: Boolean, baseURL: MemorySegment): MemorySegment = fileURLWithPath_isDirectory_relativeToURL(ObjCRuntime.newNSString(Arena.global(), path), isDir, baseURL)

        @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun fileURLWithPath_relativeToURL(path: MemorySegment, baseURL: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fileURLWithPath:relativeToURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, path, baseURL) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun fileURLWithPath_relativeToURL(path: String, baseURL: MemorySegment): MemorySegment = fileURLWithPath_relativeToURL(ObjCRuntime.newNSString(Arena.global(), path), baseURL)

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun fileURLWithPath_isDirectory(path: MemorySegment, isDir: Boolean): MemorySegment {
            val sel = ObjCRuntime.sel("fileURLWithPath:isDirectory:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, path, isDir) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun fileURLWithPath_isDirectory(path: String, isDir: Boolean): MemorySegment = fileURLWithPath_isDirectory(ObjCRuntime.newNSString(Arena.global(), path), isDir)

        fun fileURLWithPath(path: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fileURLWithPath:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, path) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun fileURLWithPath(path: String): MemorySegment = fileURLWithPath(ObjCRuntime.newNSString(Arena.global(), path))

        @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun fileURLWithFileSystemRepresentation_isDirectory_relativeToURL(path: MemorySegment, isDir: Boolean, baseURL: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, path, isDir, baseURL) as MemorySegment
        }

        fun URLWithString(URLString: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("URLWithString:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, URLString) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun URLWithString(URLString: String): MemorySegment = URLWithString(ObjCRuntime.newNSString(Arena.global(), URLString))

        fun URLWithString_relativeToURL(URLString: MemorySegment, baseURL: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("URLWithString:relativeToURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, URLString, baseURL) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun URLWithString_relativeToURL(URLString: String, baseURL: MemorySegment): MemorySegment = URLWithString_relativeToURL(ObjCRuntime.newNSString(Arena.global(), URLString), baseURL)

        @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun URLWithString_encodingInvalidCharacters(URLString: MemorySegment, encodingInvalidCharacters: Boolean): MemorySegment {
            val sel = ObjCRuntime.sel("URLWithString:encodingInvalidCharacters:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, URLString, encodingInvalidCharacters) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun URLWithString_encodingInvalidCharacters(URLString: String, encodingInvalidCharacters: Boolean): MemorySegment = URLWithString_encodingInvalidCharacters(ObjCRuntime.newNSString(Arena.global(), URLString), encodingInvalidCharacters)

        @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun URLWithDataRepresentation_relativeToURL(`data`: MemorySegment, baseURL: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("URLWithDataRepresentation:relativeToURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, baseURL) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun absoluteURLWithDataRepresentation_relativeToURL(`data`: MemorySegment, baseURL: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("absoluteURLWithDataRepresentation:relativeToURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, baseURL) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error(bookmarkData: MemorySegment, options: NSURLBookmarkResolutionOptions, relativeURL: MemorySegment, isStale: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, bookmarkData, options.rawValue, relativeURL, isStale, error) as MemorySegment
        }

        /** @return NSDictionary<NSURLResourceKey,id> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun resourceValuesForKeys_fromBookmarkData(keys: MemorySegment, bookmarkData: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("resourceValuesForKeys:fromBookmarkData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, keys, bookmarkData) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun writeBookmarkData_toURL_options_error(bookmarkData: MemorySegment, bookmarkFileURL: MemorySegment, options: Long, error: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("writeBookmarkData:toURL:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, bookmarkData, bookmarkFileURL, options, error) as Boolean
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun bookmarkDataWithContentsOfURL_error(bookmarkFileURL: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("bookmarkDataWithContentsOfURL:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, bookmarkFileURL, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun URLByResolvingAliasFileAtURL_options_error(url: MemorySegment, options: NSURLBookmarkResolutionOptions, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("URLByResolvingAliasFileAtURL:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url, options.rawValue, error) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.")
    open fun initWithScheme_host_path(scheme: MemorySegment, host: MemorySegment, path: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithScheme:host:path:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, scheme, host, path) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.")
    fun initWithScheme_host_path(scheme: String, host: String, path: String): MemorySegment = initWithScheme_host_path(ObjCRuntime.newNSString(Arena.global(), scheme), ObjCRuntime.newNSString(Arena.global(), host), ObjCRuntime.newNSString(Arena.global(), path))

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initFileURLWithPath_isDirectory_relativeToURL(path: MemorySegment, isDir: Boolean, baseURL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initFileURLWithPath:isDirectory:relativeToURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, path, isDir, baseURL) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun initFileURLWithPath_isDirectory_relativeToURL(path: String, isDir: Boolean, baseURL: MemorySegment): MemorySegment = initFileURLWithPath_isDirectory_relativeToURL(ObjCRuntime.newNSString(Arena.global(), path), isDir, baseURL)

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initFileURLWithPath_relativeToURL(path: MemorySegment, baseURL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initFileURLWithPath:relativeToURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, path, baseURL) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun initFileURLWithPath_relativeToURL(path: String, baseURL: MemorySegment): MemorySegment = initFileURLWithPath_relativeToURL(ObjCRuntime.newNSString(Arena.global(), path), baseURL)

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initFileURLWithPath_isDirectory(path: MemorySegment, isDir: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initFileURLWithPath:isDirectory:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, path, isDir) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun initFileURLWithPath_isDirectory(path: String, isDir: Boolean): MemorySegment = initFileURLWithPath_isDirectory(ObjCRuntime.newNSString(Arena.global(), path), isDir)

    open fun initFileURLWithPath(path: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initFileURLWithPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, path) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initFileURLWithPath(path: String): MemorySegment = initFileURLWithPath(ObjCRuntime.newNSString(Arena.global(), path))

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initFileURLWithFileSystemRepresentation_isDirectory_relativeToURL(path: MemorySegment, isDir: Boolean, baseURL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, path, isDir, baseURL) as MemorySegment
    }

    open fun initWithString(URLString: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithString:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, URLString) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithString(URLString: String): MemorySegment = initWithString(ObjCRuntime.newNSString(Arena.global(), URLString))

    open fun initWithString_relativeToURL(URLString: MemorySegment, baseURL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithString:relativeToURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, URLString, baseURL) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithString_relativeToURL(URLString: String, baseURL: MemorySegment): MemorySegment = initWithString_relativeToURL(ObjCRuntime.newNSString(Arena.global(), URLString), baseURL)

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithString_encodingInvalidCharacters(URLString: MemorySegment, encodingInvalidCharacters: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initWithString:encodingInvalidCharacters:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, URLString, encodingInvalidCharacters) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    fun initWithString_encodingInvalidCharacters(URLString: String, encodingInvalidCharacters: Boolean): MemorySegment = initWithString_encodingInvalidCharacters(ObjCRuntime.newNSString(Arena.global(), URLString), encodingInvalidCharacters)

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithDataRepresentation_relativeToURL(`data`: MemorySegment, baseURL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDataRepresentation:relativeToURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`, baseURL) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initAbsoluteURLWithDataRepresentation_relativeToURL(`data`: MemorySegment, baseURL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initAbsoluteURLWithDataRepresentation:relativeToURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`, baseURL) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun getFileSystemRepresentation_maxLength(buffer: MemorySegment, maxBufferLength: Long): Boolean {
        val sel = ObjCRuntime.sel("getFileSystemRepresentation:maxLength:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, buffer, maxBufferLength) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun isFileReferenceURL(): Boolean {
        val sel = ObjCRuntime.sel("isFileReferenceURL")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun fileReferenceURL(): MemorySegment {
        val sel = ObjCRuntime.sel("fileReferenceURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun getResourceValue_forKey_error(value: MemorySegment, key: MemorySegment, error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("getResourceValue:forKey:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, value, key, error) as Boolean
    }

    /** @return NSDictionary<NSURLResourceKey,id> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun resourceValuesForKeys_error(keys: MemorySegment, error: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("resourceValuesForKeys:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, keys, error) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setResourceValue_forKey_error(value: MemorySegment, key: MemorySegment, error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setResourceValue:forKey:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, value, key, error) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setResourceValues_error(keyedValues: MemorySegment, error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setResourceValues:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, keyedValues, error) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun removeCachedResourceValueForKey(key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeCachedResourceValueForKey:")
        ObjCRuntime.msgSend(null, ptr, sel, key)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun removeAllCachedResourceValues(): Unit {
        val sel = ObjCRuntime.sel("removeAllCachedResourceValues")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setTemporaryResourceValue_forKey(value: MemorySegment, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setTemporaryResourceValue:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value, key)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error(options: NSURLBookmarkCreationOptions, keys: MemorySegment, relativeURL: MemorySegment, error: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, options.rawValue, keys, relativeURL, error) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error(bookmarkData: MemorySegment, options: NSURLBookmarkResolutionOptions, relativeURL: MemorySegment, isStale: MemorySegment, error: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, bookmarkData, options.rawValue, relativeURL, isStale, error) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun startAccessingSecurityScopedResource(): Boolean {
        val sel = ObjCRuntime.sel("startAccessingSecurityScopedResource")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun stopAccessingSecurityScopedResource(): Unit {
        val sel = ObjCRuntime.sel("stopAccessingSecurityScopedResource")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property dataRepresentation
    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun dataRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("dataRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property absoluteString
    open fun absoluteString(): MemorySegment {
        val sel = ObjCRuntime.sel("absoluteString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun absoluteStringAsString(): String = ObjCRuntime.toJavaString(absoluteString())

    // @property relativeString
    open fun relativeString(): MemorySegment {
        val sel = ObjCRuntime.sel("relativeString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun relativeStringAsString(): String = ObjCRuntime.toJavaString(relativeString())

    // @property baseURL
    open fun baseURL(): MemorySegment {
        val sel = ObjCRuntime.sel("baseURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property absoluteURL
    open fun absoluteURL(): MemorySegment {
        val sel = ObjCRuntime.sel("absoluteURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property scheme
    open fun scheme(): MemorySegment {
        val sel = ObjCRuntime.sel("scheme")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun schemeAsString(): String = ObjCRuntime.toJavaString(scheme())

    // @property resourceSpecifier
    open fun resourceSpecifier(): MemorySegment {
        val sel = ObjCRuntime.sel("resourceSpecifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun resourceSpecifierAsString(): String = ObjCRuntime.toJavaString(resourceSpecifier())

    // @property host
    open fun host(): MemorySegment {
        val sel = ObjCRuntime.sel("host")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun hostAsString(): String = ObjCRuntime.toJavaString(host())

    // @property port
    open fun port(): MemorySegment {
        val sel = ObjCRuntime.sel("port")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property user
    open fun user(): MemorySegment {
        val sel = ObjCRuntime.sel("user")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun userAsString(): String = ObjCRuntime.toJavaString(user())

    // @property password
    open fun password(): MemorySegment {
        val sel = ObjCRuntime.sel("password")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun passwordAsString(): String = ObjCRuntime.toJavaString(password())

    // @property path
    open fun path(): MemorySegment {
        val sel = ObjCRuntime.sel("path")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun pathAsString(): String = ObjCRuntime.toJavaString(path())

    // @property fragment
    open fun fragment(): MemorySegment {
        val sel = ObjCRuntime.sel("fragment")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun fragmentAsString(): String = ObjCRuntime.toJavaString(fragment())

    // @property parameterString
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.")
    open fun parameterString(): MemorySegment {
        val sel = ObjCRuntime.sel("parameterString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.")
    open fun parameterStringAsString(): String = ObjCRuntime.toJavaString(parameterString())

    // @property query
    open fun query(): MemorySegment {
        val sel = ObjCRuntime.sel("query")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun queryAsString(): String = ObjCRuntime.toJavaString(query())

    // @property relativePath
    open fun relativePath(): MemorySegment {
        val sel = ObjCRuntime.sel("relativePath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun relativePathAsString(): String = ObjCRuntime.toJavaString(relativePath())

    // @property hasDirectoryPath
    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun hasDirectoryPath(): Boolean {
        val sel = ObjCRuntime.sel("hasDirectoryPath")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property fileSystemRepresentation
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun fileSystemRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("fileSystemRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property fileURL
    open fun isFileURL(): Boolean {
        val sel = ObjCRuntime.sel("isFileURL")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property standardizedURL
    open fun standardizedURL(): MemorySegment {
        val sel = ObjCRuntime.sel("standardizedURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property filePathURL
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun filePathURL(): MemorySegment {
        val sel = ObjCRuntime.sel("filePathURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _urlString: MemorySegment
    // ivar: _baseURL: MemorySegment
    // ivar: _clients: MemorySegment
    // ivar: _reserved: MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSURL.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSURL.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSURL_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSURL")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun NSURL.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

// ── Category: NSPromisedItems on NSURL ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.getPromisedItemResourceValue_forKey_error(value: MemorySegment, key: MemorySegment, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("getPromisedItemResourceValue:forKey:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, value, key, error) as Boolean
}

/** @return NSDictionary<NSURLResourceKey,id> * */
@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.promisedItemResourceValuesForKeys_error(keys: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("promisedItemResourceValuesForKeys:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, keys, error) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.checkPromisedItemIsReachableAndReturnError(error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("checkPromisedItemIsReachableAndReturnError:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, error) as Boolean
}

// ── Category: NSItemProvider on NSURL ─────────────────────────────────────────

// ── Category: NSURLPathUtilities on NSURL ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.URLByAppendingPathComponent(pathComponent: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("URLByAppendingPathComponent:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pathComponent) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.URLByAppendingPathComponent_isDirectory(pathComponent: MemorySegment, isDirectory: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("URLByAppendingPathComponent:isDirectory:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pathComponent, isDirectory) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.URLByAppendingPathExtension(pathExtension: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("URLByAppendingPathExtension:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pathExtension) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.checkResourceIsReachableAndReturnError(error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("checkResourceIsReachableAndReturnError:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, error) as Boolean
}

/** @return NSArray<NSString *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.pathComponents(): MemorySegment {
    val sel = ObjCRuntime.sel("pathComponents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.lastPathComponent(): MemorySegment {
    val sel = ObjCRuntime.sel("lastPathComponent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.pathExtension(): MemorySegment {
    val sel = ObjCRuntime.sel("pathExtension")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.URLByDeletingLastPathComponent(): MemorySegment {
    val sel = ObjCRuntime.sel("URLByDeletingLastPathComponent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.URLByDeletingPathExtension(): MemorySegment {
    val sel = ObjCRuntime.sel("URLByDeletingPathExtension")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.URLByStandardizingPath(): MemorySegment {
    val sel = ObjCRuntime.sel("URLByStandardizingPath")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL.URLByResolvingSymlinksInPath(): MemorySegment {
    val sel = ObjCRuntime.sel("URLByResolvingSymlinksInPath")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSURL fileURLWithPathComponents:]
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSURL_fileURLWithPathComponents(components: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("fileURLWithPathComponents:")
    val cls = ObjCRuntime.getClass("NSURL")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, components) as MemorySegment
}

// ── Category: NSURLLoading on NSURL ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSURL.resourceDataUsingCache(shouldUseCache: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("resourceDataUsingCache:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, shouldUseCache) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSURL.loadResourceDataNotifyingClient_usingCache(client: MemorySegment, shouldUseCache: Boolean): Unit {
    val sel = ObjCRuntime.sel("loadResourceDataNotifyingClient:usingCache:")
    ObjCRuntime.msgSend(null, this.ptr, sel, client, shouldUseCache)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSURL.propertyForKey(propertyKey: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("propertyForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, propertyKey) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSURL.setResourceData(`data`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("setResourceData:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `data`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSURL.setProperty_forKey(property: MemorySegment, propertyKey: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("setProperty:forKey:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, property, propertyKey) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLConnection instead")
fun NSURL.URLHandleUsingCache(shouldUseCache: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("URLHandleUsingCache:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, shouldUseCache) as MemorySegment
}

// ── Category: NSPasteboardSupport on NSURL ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSURL.writeToPasteboard(pasteBoard: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("writeToPasteboard:")
    ObjCRuntime.msgSend(null, this.ptr, sel, pasteBoard)
}

// Class method: +[NSURL URLFromPasteboard:]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSURL_URLFromPasteboard(pasteBoard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("URLFromPasteboard:")
    val cls = ObjCRuntime.getClass("NSURL")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, pasteBoard) as MemorySegment
}
