@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFileCoordinator
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSFileCoordinator(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSFileCoordinator") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun addFilePresenter(filePresenter: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("addFilePresenter:")
            ObjCRuntime.msgSend(null, _class, sel, filePresenter)
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun removeFilePresenter(filePresenter: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("removeFilePresenter:")
            ObjCRuntime.msgSend(null, _class, sel, filePresenter)
        }

        /** @return NSArray<id<NSFilePresenter>> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun filePresenters(): MemorySegment {
            val sel = ObjCRuntime.sel("filePresenters")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithFilePresenter(filePresenterOrNil: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFilePresenter:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, filePresenterOrNil) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun coordinateAccessWithIntents_queue_byAccessor(intents: MemorySegment, queue: MemorySegment, accessor: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("coordinateAccessWithIntents:queue:byAccessor:")
        ObjCRuntime.msgSend(null, ptr, sel, intents, queue, accessor)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun coordinateReadingItemAtURL_options_error_byAccessor(url: MemorySegment, options: NSFileCoordinatorReadingOptions, outError: MemorySegment, reader: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("coordinateReadingItemAtURL:options:error:byAccessor:")
        ObjCRuntime.msgSend(null, ptr, sel, url, options.rawValue, outError, reader)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun coordinateWritingItemAtURL_options_error_byAccessor(url: MemorySegment, options: NSFileCoordinatorWritingOptions, outError: MemorySegment, writer: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("coordinateWritingItemAtURL:options:error:byAccessor:")
        ObjCRuntime.msgSend(null, ptr, sel, url, options.rawValue, outError, writer)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor(readingURL: MemorySegment, readingOptions: NSFileCoordinatorReadingOptions, writingURL: MemorySegment, writingOptions: NSFileCoordinatorWritingOptions, outError: MemorySegment, readerWriter: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
        ObjCRuntime.msgSend(null, ptr, sel, readingURL, readingOptions.rawValue, writingURL, writingOptions.rawValue, outError, readerWriter)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor(url1: MemorySegment, options1: NSFileCoordinatorWritingOptions, url2: MemorySegment, options2: NSFileCoordinatorWritingOptions, outError: MemorySegment, writer: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
        ObjCRuntime.msgSend(null, ptr, sel, url1, options1.rawValue, url2, options2.rawValue, outError, writer)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor(readingURLs: MemorySegment, readingOptions: NSFileCoordinatorReadingOptions, writingURLs: MemorySegment, writingOptions: NSFileCoordinatorWritingOptions, outError: MemorySegment, batchAccessor: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:")
        ObjCRuntime.msgSend(null, ptr, sel, readingURLs, readingOptions.rawValue, writingURLs, writingOptions.rawValue, outError, batchAccessor)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun itemAtURL_willMoveToURL(oldURL: MemorySegment, newURL: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("itemAtURL:willMoveToURL:")
        ObjCRuntime.msgSend(null, ptr, sel, oldURL, newURL)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun itemAtURL_didMoveToURL(oldURL: MemorySegment, newURL: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("itemAtURL:didMoveToURL:")
        ObjCRuntime.msgSend(null, ptr, sel, oldURL, newURL)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun itemAtURL_didChangeUbiquityAttributes(url: MemorySegment, attributes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("itemAtURL:didChangeUbiquityAttributes:")
        ObjCRuntime.msgSend(null, ptr, sel, url, attributes)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun cancel(): Unit {
        val sel = ObjCRuntime.sel("cancel")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property purposeIdentifier
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun purposeIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("purposeIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setPurposeIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPurposeIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun purposeIdentifierAsString(): String = ObjCRuntime.toJavaString(purposeIdentifier())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setPurposeIdentifier(value: String) = setPurposeIdentifier(ObjCRuntime.newNSString(Arena.global(), value))


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _accessArbiter: MemorySegment
    // ivar: _fileReactor: MemorySegment
    // ivar: _purposeID: MemorySegment
    // ivar: _recentFilePresenterURL: MemorySegment
    // ivar: _accessClaimIDOrIDs: MemorySegment
    // ivar: _movedItems: MemorySegment
    // ivar: _isCancelled: Boolean
}
