@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSNetService
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
@PlatformAvailability(platform = "watchos", unavailable = true)
open class NSNetService(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSNetService") } }

        /** @return NSDictionary<NSString *,NSData *> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun dictionaryFromTXTRecordData(txtData: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("dictionaryFromTXTRecordData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, txtData) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun dataFromTXTRecordDictionary(txtDictionary: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("dataFromTXTRecordDictionary:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, txtDictionary) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun initWithDomain_type_name_port(domain: MemorySegment, type: MemorySegment, name: MemorySegment, port: Int): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDomain:type:name:port:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, domain, type, name, port) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    fun initWithDomain_type_name_port(domain: String, type: String, name: String, port: Int): MemorySegment = initWithDomain_type_name_port(ObjCRuntime.newNSString(Arena.global(), domain), ObjCRuntime.newNSString(Arena.global(), type), ObjCRuntime.newNSString(Arena.global(), name), port)

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun initWithDomain_type_name(domain: MemorySegment, type: MemorySegment, name: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDomain:type:name:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, domain, type, name) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    fun initWithDomain_type_name(domain: String, type: String, name: String): MemorySegment = initWithDomain_type_name(ObjCRuntime.newNSString(Arena.global(), domain), ObjCRuntime.newNSString(Arena.global(), type), ObjCRuntime.newNSString(Arena.global(), name))

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun scheduleInRunLoop_forMode(aRunLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scheduleInRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, aRunLoop, mode)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun removeFromRunLoop_forMode(aRunLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeFromRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, aRunLoop, mode)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun publish(): Unit {
        val sel = ObjCRuntime.sel("publish")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun publishWithOptions(options: NSNetServiceOptions): Unit {
        val sel = ObjCRuntime.sel("publishWithOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, options.rawValue)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Not supported")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
    open fun resolve(): Unit {
        val sel = ObjCRuntime.sel("resolve")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun stop(): Unit {
        val sel = ObjCRuntime.sel("stop")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun resolveWithTimeout(timeout: Double): Unit {
        val sel = ObjCRuntime.sel("resolveWithTimeout:")
        ObjCRuntime.msgSend(null, ptr, sel, timeout)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun getInputStream_outputStream(inputStream: MemorySegment, outputStream: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("getInputStream:outputStream:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, inputStream, outputStream) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setTXTRecordData(recordData: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setTXTRecordData:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, recordData) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun TXTRecordData(): MemorySegment {
        val sel = ObjCRuntime.sel("TXTRecordData")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun startMonitoring(): Unit {
        val sel = ObjCRuntime.sel("startMonitoring")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun stopMonitoring(): Unit {
        val sel = ObjCRuntime.sel("stopMonitoring")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property delegate
    /** @return id<NSNetServiceDelegate> */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property includesPeerToPeer
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun includesPeerToPeer(): Boolean {
        val sel = ObjCRuntime.sel("includesPeerToPeer")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setIncludesPeerToPeer(value: Boolean) {
        val sel = ObjCRuntime.sel("setIncludesPeerToPeer:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property name
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    // @property type
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun type(): MemorySegment {
        val sel = ObjCRuntime.sel("type")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun typeAsString(): String = ObjCRuntime.toJavaString(type())

    // @property domain
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun domain(): MemorySegment {
        val sel = ObjCRuntime.sel("domain")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun domainAsString(): String = ObjCRuntime.toJavaString(domain())

    // @property hostName
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun hostName(): MemorySegment {
        val sel = ObjCRuntime.sel("hostName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun hostNameAsString(): String = ObjCRuntime.toJavaString(hostName())

    // @property addresses
    /** @return NSArray<NSData *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t or nw_listener_t in Network framework instead")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun addresses(): MemorySegment {
        val sel = ObjCRuntime.sel("addresses")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property port
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun port(): Long {
        val sel = ObjCRuntime.sel("port")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _netService: MemorySegment
    // ivar: _delegate: MemorySegment
    // ivar: _reserved: MemorySegment
}
