@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSURLDownloadDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
interface NSURLDownloadDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun downloadDidBegin(download: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'downloadDidBegin:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_willSendRequest_redirectResponse(download: MemorySegment, request: MemorySegment, redirectResponse: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'download:willSendRequest:redirectResponse:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_canAuthenticateAgainstProtectionSpace(connection: MemorySegment, protectionSpace: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'download:canAuthenticateAgainstProtectionSpace:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_didReceiveAuthenticationChallenge(download: MemorySegment, challenge: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'download:didReceiveAuthenticationChallenge:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_didCancelAuthenticationChallenge(download: MemorySegment, challenge: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'download:didCancelAuthenticationChallenge:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun downloadShouldUseCredentialStorage(download: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'downloadShouldUseCredentialStorage:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_didReceiveResponse(download: MemorySegment, response: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'download:didReceiveResponse:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_willResumeWithResponse_fromByte(download: MemorySegment, response: MemorySegment, startingByte: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'download:willResumeWithResponse:fromByte:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_didReceiveDataOfLength(download: MemorySegment, length: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'download:didReceiveDataOfLength:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_shouldDecodeSourceDataOfMIMEType(download: MemorySegment, encodingType: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'download:shouldDecodeSourceDataOfMIMEType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_decideDestinationWithSuggestedFilename(download: MemorySegment, filename: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'download:decideDestinationWithSuggestedFilename:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_didCreateDestination(download: MemorySegment, path: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'download:didCreateDestination:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun downloadDidFinish(download: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'downloadDidFinish:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun download_didFailWithError(download: MemorySegment, error: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'download:didFailWithError:' not implemented")

}
