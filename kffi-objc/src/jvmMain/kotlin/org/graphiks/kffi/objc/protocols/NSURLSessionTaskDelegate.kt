@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSURLSessionTaskDelegate
 * Inherits protocols: NSURLSessionDelegate
 */
@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
interface NSURLSessionTaskDelegate : NSURLSessionDelegate {
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_didCreateTask(session: MemorySegment, task: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:didCreateTask:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_willBeginDelayedRequest_completionHandler(session: MemorySegment, task: MemorySegment, request: MemorySegment, completionHandler: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:willBeginDelayedRequest:completionHandler:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_taskIsWaitingForConnectivity(session: MemorySegment, task: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:taskIsWaitingForConnectivity:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_willPerformHTTPRedirection_newRequest_completionHandler(session: MemorySegment, task: MemorySegment, response: MemorySegment, request: MemorySegment, completionHandler: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_didReceiveChallenge_completionHandler(session: MemorySegment, task: MemorySegment, challenge: MemorySegment, completionHandler: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:didReceiveChallenge:completionHandler:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_needNewBodyStream(session: MemorySegment, task: MemorySegment, completionHandler: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:needNewBodyStream:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_needNewBodyStreamFromOffset_completionHandler(session: MemorySegment, task: MemorySegment, offset: Long, completionHandler: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:needNewBodyStreamFromOffset:completionHandler:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_didSendBodyData_totalBytesSent_totalBytesExpectedToSend(session: MemorySegment, task: MemorySegment, bytesSent: Long, totalBytesSent: Long, totalBytesExpectedToSend: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_didReceiveInformationalResponse(session: MemorySegment, task: MemorySegment, response: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:didReceiveInformationalResponse:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_didFinishCollectingMetrics(session: MemorySegment, task: MemorySegment, metrics: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:didFinishCollectingMetrics:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun URLSession_task_didCompleteWithError(session: MemorySegment, task: MemorySegment, error: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'URLSession:task:didCompleteWithError:' not implemented")

}
