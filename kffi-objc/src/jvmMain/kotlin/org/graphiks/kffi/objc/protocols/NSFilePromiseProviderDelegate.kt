@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSFilePromiseProviderDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSFilePromiseProviderDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun filePromiseProvider_fileNameForType(filePromiseProvider: MemorySegment, fileType: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun filePromiseProvider_writePromiseToURL_completionHandler(filePromiseProvider: MemorySegment, url: MemorySegment, completionHandler: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun operationQueueForFilePromiseProvider(filePromiseProvider: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'operationQueueForFilePromiseProvider:' not implemented")

}
