@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSHTTPCookieStorage
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSHTTPCookieStorage(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSHTTPCookieStorage") }

        @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun sharedCookieStorageForGroupContainerIdentifier(identifier: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("sharedCookieStorageForGroupContainerIdentifier:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun sharedCookieStorageForGroupContainerIdentifier(identifier: String): MemorySegment = sharedCookieStorageForGroupContainerIdentifier(ObjCRuntime.newNSString(Arena.global(), identifier))

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun sharedHTTPCookieStorage(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedHTTPCookieStorage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setCookie(cookie: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setCookie:")
        ObjCRuntime.msgSend(null, ptr, sel, cookie)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun deleteCookie(cookie: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deleteCookie:")
        ObjCRuntime.msgSend(null, ptr, sel, cookie)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun removeCookiesSinceDate(date: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeCookiesSinceDate:")
        ObjCRuntime.msgSend(null, ptr, sel, date)
    }

    /** @return NSArray<NSHTTPCookie *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun cookiesForURL(URL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("cookiesForURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, URL) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setCookies_forURL_mainDocumentURL(cookies: MemorySegment, URL: MemorySegment, mainDocumentURL: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setCookies:forURL:mainDocumentURL:")
        ObjCRuntime.msgSend(null, ptr, sel, cookies, URL, mainDocumentURL)
    }

    /** @return NSArray<NSHTTPCookie *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun sortedCookiesUsingDescriptors(sortOrder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("sortedCookiesUsingDescriptors:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, sortOrder) as MemorySegment
    }

    // @property cookies
    /** @return NSArray<NSHTTPCookie *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun cookies(): MemorySegment {
        val sel = ObjCRuntime.sel("cookies")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property cookieAcceptPolicy
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun cookieAcceptPolicy(): NSHTTPCookieAcceptPolicy {
        val sel = ObjCRuntime.sel("cookieAcceptPolicy")
        return NSHTTPCookieAcceptPolicy(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setCookieAcceptPolicy(value: NSHTTPCookieAcceptPolicy) {
        val sel = ObjCRuntime.sel("setCookieAcceptPolicy:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _internal: MemorySegment
}

// ── Category: NSURLSessionTaskAdditions on NSHTTPCookieStorage ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSHTTPCookieStorage.storeCookies_forTask(cookies: MemorySegment, task: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("storeCookies:forTask:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cookies, task)
}

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSHTTPCookieStorage.getCookiesForTask_completionHandler(task: MemorySegment, completionHandler: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getCookiesForTask:completionHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, task, completionHandler)
}
