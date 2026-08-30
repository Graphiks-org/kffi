@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSound
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding, NSPasteboardReading, NSPasteboardWriting
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSound(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSound") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun soundNamed(name: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("soundNamed:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun canInitWithPasteboard(pasteboard: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canInitWithPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, pasteboard) as Boolean
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun soundUnfilteredTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("soundUnfilteredTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithContentsOfURL_byReference(url: MemorySegment, byRef: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentsOfURL:byReference:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url, byRef) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithContentsOfFile_byReference(path: MemorySegment, byRef: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentsOfFile:byReference:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, path, byRef) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithContentsOfFile_byReference(path: String, byRef: Boolean): MemorySegment = initWithContentsOfFile_byReference(ObjCRuntime.newNSString(Arena.global(), path), byRef)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithData(`data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setName(string: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setName:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, string) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithPasteboard(pasteboard: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithPasteboard:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pasteboard) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun writeToPasteboard(pasteboard: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("writeToPasteboard:")
        ObjCRuntime.msgSend(null, ptr, sel, pasteboard)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun play(): Boolean {
        val sel = ObjCRuntime.sel("play")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pause(): Boolean {
        val sel = ObjCRuntime.sel("pause")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resume(): Boolean {
        val sel = ObjCRuntime.sel("resume")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stop(): Boolean {
        val sel = ObjCRuntime.sel("stop")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
    open fun setChannelMapping(channelMapping: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setChannelMapping:")
        ObjCRuntime.msgSend(null, ptr, sel, channelMapping)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
    open fun channelMapping(): MemorySegment {
        val sel = ObjCRuntime.sel("channelMapping")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property name
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property playing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isPlaying(): Boolean {
        val sel = ObjCRuntime.sel("isPlaying")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property delegate
    /** @return id<NSSoundDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property duration
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun duration(): Double {
        val sel = ObjCRuntime.sel("duration")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property volume
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun volume(): Float {
        val sel = ObjCRuntime.sel("volume")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setVolume(value: Float) {
        val sel = ObjCRuntime.sel("setVolume:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property currentTime
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun currentTime(): Double {
        val sel = ObjCRuntime.sel("currentTime")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setCurrentTime(value: Double) {
        val sel = ObjCRuntime.sel("setCurrentTime:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property loops
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun loops(): Boolean {
        val sel = ObjCRuntime.sel("loops")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setLoops(value: Boolean) {
        val sel = ObjCRuntime.sel("setLoops:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property playbackDeviceIdentifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun playbackDeviceIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("playbackDeviceIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setPlaybackDeviceIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaybackDeviceIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSSound.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSSound.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSSound.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSSound_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSSound")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSPasteboardReading. */
fun NSSound_readableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("readableTypesForPasteboard:")
    val cls = ObjCRuntime.getClass("NSSound")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, pasteboard) as MemorySegment
}

/** Required by Objective-C protocol NSPasteboardWriting. */
fun NSSound.writableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("writableTypesForPasteboard:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pasteboard) as MemorySegment
}

/** Required by Objective-C protocol NSPasteboardWriting. */
fun NSSound.pasteboardPropertyListForType(type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("pasteboardPropertyListForType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type) as MemorySegment
}

// ── Category: NSDeprecated on NSSound ─────────────────────────────────────────

// Class method: +[NSSound soundUnfilteredFileTypes]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSSound_soundUnfilteredFileTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("soundUnfilteredFileTypes")
    val cls = ObjCRuntime.getClass("NSSound")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSSound soundUnfilteredPasteboardTypes]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSSound_soundUnfilteredPasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("soundUnfilteredPasteboardTypes")
    val cls = ObjCRuntime.getClass("NSSound")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}
