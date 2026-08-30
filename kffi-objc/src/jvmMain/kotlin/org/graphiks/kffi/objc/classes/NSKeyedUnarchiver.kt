@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSKeyedUnarchiver
 * Superclass: NSCoder
 */
open class NSKeyedUnarchiver(override val ptr: MemorySegment) : NSCoder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSKeyedUnarchiver") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        fun unarchivedObjectOfClass_fromData_error(cls: MemorySegment, `data`: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchivedObjectOfClass:fromData:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, cls, `data`, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
        fun unarchivedArrayOfObjectsOfClass_fromData_error(cls: MemorySegment, `data`: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchivedArrayOfObjectsOfClass:fromData:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, cls, `data`, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
        fun unarchivedDictionaryWithKeysOfClass_objectsOfClass_fromData_error(keyCls: MemorySegment, valueCls: MemorySegment, `data`: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchivedDictionaryWithKeysOfClass:objectsOfClass:fromData:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, keyCls, valueCls, `data`, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        fun unarchivedObjectOfClasses_fromData_error(classes: MemorySegment, `data`: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchivedObjectOfClasses:fromData:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, classes, `data`, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
        fun unarchivedArrayOfObjectsOfClasses_fromData_error(classes: MemorySegment, `data`: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchivedArrayOfObjectsOfClasses:fromData:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, classes, `data`, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
        fun unarchivedDictionaryWithKeysOfClasses_objectsOfClasses_fromData_error(keyClasses: MemorySegment, valueClasses: MemorySegment, `data`: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchivedDictionaryWithKeysOfClasses:objectsOfClasses:fromData:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, keyClasses, valueClasses, `data`, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        fun unarchiveObjectWithData(`data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchiveObjectWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "swift", unavailable = true, message = "Use 'unarchiveTopLevelObjectWithData(_:) throws' instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        fun unarchiveTopLevelObjectWithData_error(`data`: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchiveTopLevelObjectWithData:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        fun unarchiveObjectWithFile(path: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("unarchiveObjectWithFile:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, path) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +unarchivedObjectOfClass:fromData:error: instead")
        fun unarchiveObjectWithFile(path: String): MemorySegment = unarchiveObjectWithFile(ObjCRuntime.newNSString(Arena.global(), path))

        fun setClass_forClassName(cls: MemorySegment, codedName: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setClass:forClassName:")
            ObjCRuntime.msgSend(null, _class, sel, cls, codedName)
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun setClass_forClassName(cls: MemorySegment, codedName: String): Unit = setClass_forClassName(cls, ObjCRuntime.newNSString(Arena.global(), codedName))

        fun classForClassName(codedName: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("classForClassName:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, codedName) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun classForClassName(codedName: String): MemorySegment = classForClassName(ObjCRuntime.newNSString(Arena.global(), codedName))

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun initForReadingFromData_error(`data`: MemorySegment, error: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initForReadingFromData:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`, error) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initForReadingFromData:error: instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -initForReadingFromData:error: instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initForReadingFromData:error: instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initForReadingFromData:error: instead")
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initForReadingFromData:error: instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -initForReadingFromData:error: instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initForReadingFromData:error: instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initForReadingFromData:error: instead")
    open fun initForReadingWithData(`data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initForReadingWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`) as MemorySegment
    }

    open fun finishDecoding(): Unit {
        val sel = ObjCRuntime.sel("finishDecoding")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun setClass_forClassName(cls: MemorySegment, codedName: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setClass:forClassName:")
        ObjCRuntime.msgSend(null, ptr, sel, cls, codedName)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun setClass_forClassName(cls: MemorySegment, codedName: String): Unit = setClass_forClassName(cls, ObjCRuntime.newNSString(Arena.global(), codedName))

    open fun classForClassName(codedName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("classForClassName:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, codedName) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun classForClassName(codedName: String): MemorySegment = classForClassName(ObjCRuntime.newNSString(Arena.global(), codedName))

    open fun containsValueForKey(key: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("containsValueForKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, key) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun containsValueForKey(key: String): Boolean = containsValueForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun decodeObjectForKey(key: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("decodeObjectForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun decodeObjectForKey(key: String): MemorySegment = decodeObjectForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun decodeBoolForKey(key: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("decodeBoolForKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, key) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun decodeBoolForKey(key: String): Boolean = decodeBoolForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun decodeIntForKey(key: MemorySegment): Int {
        val sel = ObjCRuntime.sel("decodeIntForKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel, key) as Int
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun decodeIntForKey(key: String): Int = decodeIntForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun decodeInt32ForKey(key: MemorySegment): Int {
        val sel = ObjCRuntime.sel("decodeInt32ForKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel, key) as Int
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun decodeInt32ForKey(key: String): Int = decodeInt32ForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun decodeInt64ForKey(key: MemorySegment): Long {
        val sel = ObjCRuntime.sel("decodeInt64ForKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, key) as Long
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun decodeInt64ForKey(key: String): Long = decodeInt64ForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun decodeFloatForKey(key: MemorySegment): Float {
        val sel = ObjCRuntime.sel("decodeFloatForKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel, key) as Float
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun decodeFloatForKey(key: String): Float = decodeFloatForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun decodeDoubleForKey(key: MemorySegment): Double {
        val sel = ObjCRuntime.sel("decodeDoubleForKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, key) as Double
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun decodeDoubleForKey(key: String): Double = decodeDoubleForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun decodeBytesForKey_returnedLength(key: MemorySegment, lengthp: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("decodeBytesForKey:returnedLength:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key, lengthp) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun decodeBytesForKey_returnedLength(key: String, lengthp: MemorySegment): MemorySegment = decodeBytesForKey_returnedLength(ObjCRuntime.newNSString(Arena.global(), key), lengthp)

    // @property delegate
    /** @return id<NSKeyedUnarchiverDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

    // @property decodingFailurePolicy
    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun decodingFailurePolicy(): NSDecodingFailurePolicy {
        val sel = ObjCRuntime.sel("decodingFailurePolicy")
        return NSDecodingFailurePolicy(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setDecodingFailurePolicy(value: NSDecodingFailurePolicy) {
        val sel = ObjCRuntime.sel("setDecodingFailurePolicy:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
