@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSKeyedArchiver
 * Superclass: NSCoder
 */
open class NSKeyedArchiver(override val ptr: MemorySegment) : NSCoder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSKeyedArchiver") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        fun archivedDataWithRootObject_requiringSecureCoding_error(`object`: MemorySegment, requiresSecureCoding: Boolean, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("archivedDataWithRootObject:requiringSecureCoding:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `object`, requiresSecureCoding, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: instead")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: instead")
        fun archivedDataWithRootObject(rootObject: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("archivedDataWithRootObject:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, rootObject) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: and -writeToURL:options:error: instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: and -writeToURL:options:error: instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: and -writeToURL:options:error: instead")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: and -writeToURL:options:error: instead")
        fun archiveRootObject_toFile(rootObject: MemorySegment, path: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("archiveRootObject:toFile:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, rootObject, path) as Boolean
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: and -writeToURL:options:error: instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: and -writeToURL:options:error: instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: and -writeToURL:options:error: instead")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +archivedDataWithRootObject:requiringSecureCoding:error: and -writeToURL:options:error: instead")
        fun archiveRootObject_toFile(rootObject: MemorySegment, path: String): Boolean = archiveRootObject_toFile(rootObject, ObjCRuntime.newNSString(Arena.global(), path))

        fun setClassName_forClass(codedName: MemorySegment, cls: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setClassName:forClass:")
            ObjCRuntime.msgSend(null, _class, sel, codedName, cls)
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun setClassName_forClass(codedName: String, cls: MemorySegment): Unit = setClassName_forClass(ObjCRuntime.newNSString(Arena.global(), codedName), cls)

        fun classNameForClass(cls: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("classNameForClass:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, cls) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        fun classNameForClassAsString(cls: MemorySegment): String = ObjCRuntime.toJavaString(classNameForClass(cls))

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun initRequiringSecureCoding(requiresSecureCoding: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initRequiringSecureCoding:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, requiresSecureCoding) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initRequiringSecureCoding: instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -initRequiringSecureCoding: instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initRequiringSecureCoding: instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initRequiringSecureCoding: instead")
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initRequiringSecureCoding: instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -initRequiringSecureCoding: instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initRequiringSecureCoding: instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initRequiringSecureCoding: instead")
    open fun initForWritingWithMutableData(`data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initForWritingWithMutableData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`) as MemorySegment
    }

    open fun finishEncoding(): Unit {
        val sel = ObjCRuntime.sel("finishEncoding")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun setClassName_forClass(codedName: MemorySegment, cls: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setClassName:forClass:")
        ObjCRuntime.msgSend(null, ptr, sel, codedName, cls)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun setClassName_forClass(codedName: String, cls: MemorySegment): Unit = setClassName_forClass(ObjCRuntime.newNSString(Arena.global(), codedName), cls)

    open fun classNameForClass(cls: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("classNameForClass:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, cls) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    fun classNameForClassAsString(cls: MemorySegment): String = ObjCRuntime.toJavaString(classNameForClass(cls))

    open fun encodeObject_forKey(`object`: MemorySegment, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeObject:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeObject_forKey(`object`: MemorySegment, key: String): Unit = encodeObject_forKey(`object`, ObjCRuntime.newNSString(Arena.global(), key))

    open fun encodeConditionalObject_forKey(`object`: MemorySegment, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeConditionalObject:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeConditionalObject_forKey(`object`: MemorySegment, key: String): Unit = encodeConditionalObject_forKey(`object`, ObjCRuntime.newNSString(Arena.global(), key))

    open fun encodeBool_forKey(value: Boolean, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeBool:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeBool_forKey(value: Boolean, key: String): Unit = encodeBool_forKey(value, ObjCRuntime.newNSString(Arena.global(), key))

    open fun encodeInt_forKey(value: Int, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeInt:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeInt_forKey(value: Int, key: String): Unit = encodeInt_forKey(value, ObjCRuntime.newNSString(Arena.global(), key))

    open fun encodeInt32_forKey(value: Int, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeInt32:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeInt32_forKey(value: Int, key: String): Unit = encodeInt32_forKey(value, ObjCRuntime.newNSString(Arena.global(), key))

    open fun encodeInt64_forKey(value: Long, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeInt64:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeInt64_forKey(value: Long, key: String): Unit = encodeInt64_forKey(value, ObjCRuntime.newNSString(Arena.global(), key))

    open fun encodeFloat_forKey(value: Float, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeFloat:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeFloat_forKey(value: Float, key: String): Unit = encodeFloat_forKey(value, ObjCRuntime.newNSString(Arena.global(), key))

    open fun encodeDouble_forKey(value: Double, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeDouble:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeDouble_forKey(value: Double, key: String): Unit = encodeDouble_forKey(value, ObjCRuntime.newNSString(Arena.global(), key))

    open fun encodeBytes_length_forKey(bytes: MemorySegment, length: Long, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodeBytes:length:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, bytes, length, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun encodeBytes_length_forKey(bytes: MemorySegment, length: Long, key: String): Unit = encodeBytes_length_forKey(bytes, length, ObjCRuntime.newNSString(Arena.global(), key))

    // @property delegate
    /** @return id<NSKeyedArchiverDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property outputFormat
    open fun outputFormat(): NSPropertyListFormat {
        val sel = ObjCRuntime.sel("outputFormat")
        return NSPropertyListFormat(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setOutputFormat(value: NSPropertyListFormat) {
        val sel = ObjCRuntime.sel("setOutputFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property encodedData
    @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    open fun encodedData(): MemorySegment {
        val sel = ObjCRuntime.sel("encodedData")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property requiresSecureCoding
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun requiresSecureCoding(): Boolean {
        val sel = ObjCRuntime.sel("requiresSecureCoding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setRequiresSecureCoding(value: Boolean) {
        val sel = ObjCRuntime.sel("setRequiresSecureCoding:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
