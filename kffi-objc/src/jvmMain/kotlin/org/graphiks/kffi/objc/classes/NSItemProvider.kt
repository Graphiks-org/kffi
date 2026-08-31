@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSItemProvider
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSItemProvider(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSItemProvider") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun registerDataRepresentationForTypeIdentifier_visibility_loadHandler(typeIdentifier: MemorySegment, visibility: NSItemProviderRepresentationVisibility, loadHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerDataRepresentationForTypeIdentifier:visibility:loadHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, typeIdentifier, visibility.rawValue, loadHandler)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    fun registerDataRepresentationForTypeIdentifier_visibility_loadHandler(typeIdentifier: String, visibility: NSItemProviderRepresentationVisibility, loadHandler: MemorySegment): Unit = registerDataRepresentationForTypeIdentifier_visibility_loadHandler(ObjCRuntime.newNSString(Arena.global(), typeIdentifier), visibility, loadHandler)

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun registerFileRepresentationForTypeIdentifier_fileOptions_visibility_loadHandler(typeIdentifier: MemorySegment, fileOptions: NSItemProviderFileOptions, visibility: NSItemProviderRepresentationVisibility, loadHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerFileRepresentationForTypeIdentifier:fileOptions:visibility:loadHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, typeIdentifier, fileOptions.rawValue, visibility.rawValue, loadHandler)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    fun registerFileRepresentationForTypeIdentifier_fileOptions_visibility_loadHandler(typeIdentifier: String, fileOptions: NSItemProviderFileOptions, visibility: NSItemProviderRepresentationVisibility, loadHandler: MemorySegment): Unit = registerFileRepresentationForTypeIdentifier_fileOptions_visibility_loadHandler(ObjCRuntime.newNSString(Arena.global(), typeIdentifier), fileOptions, visibility, loadHandler)

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun registeredTypeIdentifiersWithFileOptions(fileOptions: NSItemProviderFileOptions): MemorySegment {
        val sel = ObjCRuntime.sel("registeredTypeIdentifiersWithFileOptions:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fileOptions.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun hasItemConformingToTypeIdentifier(typeIdentifier: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("hasItemConformingToTypeIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, typeIdentifier) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun hasItemConformingToTypeIdentifier(typeIdentifier: String): Boolean = hasItemConformingToTypeIdentifier(ObjCRuntime.newNSString(Arena.global(), typeIdentifier))

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun hasRepresentationConformingToTypeIdentifier_fileOptions(typeIdentifier: MemorySegment, fileOptions: NSItemProviderFileOptions): Boolean {
        val sel = ObjCRuntime.sel("hasRepresentationConformingToTypeIdentifier:fileOptions:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, typeIdentifier, fileOptions.rawValue) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    fun hasRepresentationConformingToTypeIdentifier_fileOptions(typeIdentifier: String, fileOptions: NSItemProviderFileOptions): Boolean = hasRepresentationConformingToTypeIdentifier_fileOptions(ObjCRuntime.newNSString(Arena.global(), typeIdentifier), fileOptions)

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun loadDataRepresentationForTypeIdentifier_completionHandler(typeIdentifier: MemorySegment, completionHandler: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("loadDataRepresentationForTypeIdentifier:completionHandler:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeIdentifier, completionHandler) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    fun loadDataRepresentationForTypeIdentifier_completionHandler(typeIdentifier: String, completionHandler: MemorySegment): MemorySegment = loadDataRepresentationForTypeIdentifier_completionHandler(ObjCRuntime.newNSString(Arena.global(), typeIdentifier), completionHandler)

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun loadFileRepresentationForTypeIdentifier_completionHandler(typeIdentifier: MemorySegment, completionHandler: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("loadFileRepresentationForTypeIdentifier:completionHandler:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeIdentifier, completionHandler) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    fun loadFileRepresentationForTypeIdentifier_completionHandler(typeIdentifier: String, completionHandler: MemorySegment): MemorySegment = loadFileRepresentationForTypeIdentifier_completionHandler(ObjCRuntime.newNSString(Arena.global(), typeIdentifier), completionHandler)

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun loadInPlaceFileRepresentationForTypeIdentifier_completionHandler(typeIdentifier: MemorySegment, completionHandler: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("loadInPlaceFileRepresentationForTypeIdentifier:completionHandler:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, typeIdentifier, completionHandler) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    fun loadInPlaceFileRepresentationForTypeIdentifier_completionHandler(typeIdentifier: String, completionHandler: MemorySegment): MemorySegment = loadInPlaceFileRepresentationForTypeIdentifier_completionHandler(ObjCRuntime.newNSString(Arena.global(), typeIdentifier), completionHandler)

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithObject(`object`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithObject:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `object`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun registerObject_visibility(`object`: MemorySegment, visibility: NSItemProviderRepresentationVisibility): Unit {
        val sel = ObjCRuntime.sel("registerObject:visibility:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`, visibility.rawValue)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun registerObjectOfClass_visibility_loadHandler(aClass: MemorySegment, visibility: NSItemProviderRepresentationVisibility, loadHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerObjectOfClass:visibility:loadHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, aClass, visibility.rawValue, loadHandler)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun canLoadObjectOfClass(aClass: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("canLoadObjectOfClass:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, aClass) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    open fun loadObjectOfClass_completionHandler(aClass: MemorySegment, completionHandler: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("loadObjectOfClass:completionHandler:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, aClass, completionHandler) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithItem_typeIdentifier(item: MemorySegment, typeIdentifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithItem:typeIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, item, typeIdentifier) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun initWithItem_typeIdentifier(item: MemorySegment, typeIdentifier: String): MemorySegment = initWithItem_typeIdentifier(item, ObjCRuntime.newNSString(Arena.global(), typeIdentifier))

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithContentsOfURL(fileURL: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentsOfURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fileURL) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun registerItemForTypeIdentifier_loadHandler(typeIdentifier: MemorySegment, loadHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerItemForTypeIdentifier:loadHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, typeIdentifier, loadHandler)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun registerItemForTypeIdentifier_loadHandler(typeIdentifier: String, loadHandler: MemorySegment): Unit = registerItemForTypeIdentifier_loadHandler(ObjCRuntime.newNSString(Arena.global(), typeIdentifier), loadHandler)

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun loadItemForTypeIdentifier_options_completionHandler(typeIdentifier: MemorySegment, options: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("loadItemForTypeIdentifier:options:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, typeIdentifier, options, completionHandler)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun loadItemForTypeIdentifier_options_completionHandler(typeIdentifier: String, options: MemorySegment, completionHandler: MemorySegment): Unit = loadItemForTypeIdentifier_options_completionHandler(ObjCRuntime.newNSString(Arena.global(), typeIdentifier), options, completionHandler)

    // @property registeredTypeIdentifiers
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun registeredTypeIdentifiers(): MemorySegment {
        val sel = ObjCRuntime.sel("registeredTypeIdentifiers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property suggestedName
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun suggestedName(): MemorySegment {
        val sel = ObjCRuntime.sel("suggestedName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setSuggestedName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSuggestedName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun suggestedNameAsString(): String = ObjCRuntime.toJavaString(suggestedName())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setSuggestedName(value: String) = setSuggestedName(ObjCRuntime.newNSString(Arena.global(), value))

}

/** Required by Objective-C protocol NSCopying. */
fun NSItemProvider.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

// ── Category: NSPreviewSupport on NSItemProvider ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSItemProvider.loadPreviewImageWithOptions_completionHandler(options: MemorySegment, completionHandler: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("loadPreviewImageWithOptions:completionHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, options, completionHandler)
}

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSItemProvider.previewImageHandler(): MemorySegment {
    val sel = ObjCRuntime.sel("previewImageHandler")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSItemProvider.setPreviewImageHandler(previewImageHandler: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setPreviewImageHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, previewImageHandler)
}

// ── Category: NSCloudKitSharing on NSItemProvider ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSItemProvider.registerCloudKitShareWithPreparationHandler(preparationHandler: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("registerCloudKitShareWithPreparationHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, preparationHandler)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSItemProvider.registerCloudKitShare_container(share: MemorySegment, container: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("registerCloudKitShare:container:")
    ObjCRuntime.msgSend(null, this.ptr, sel, share, container)
}

// ── Category: NSItemSourceInfo on NSItemProvider ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSItemProvider.sourceFrame(): NSRect {
    val sel = ObjCRuntime.sel("sourceFrame")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSItemProvider.containerFrame(): NSRect {
    val sel = ObjCRuntime.sel("containerFrame")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSItemProvider.preferredPresentationSize(): NSSize {
    val sel = ObjCRuntime.sel("preferredPresentationSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}
