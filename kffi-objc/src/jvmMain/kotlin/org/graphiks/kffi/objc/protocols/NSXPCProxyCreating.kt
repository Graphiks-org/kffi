@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSXPCProxyCreating
 */
interface NSXPCProxyCreating {
    fun remoteObjectProxy(): MemorySegment

    fun remoteObjectProxyWithErrorHandler(handler: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun synchronousRemoteObjectProxyWithErrorHandler(handler: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'synchronousRemoteObjectProxyWithErrorHandler:' not implemented")

}
