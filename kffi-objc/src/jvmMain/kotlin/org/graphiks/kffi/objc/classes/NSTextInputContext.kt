@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextInputContext
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
open class NSTextInputContext(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextInputContext") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun localizedNameForInputSource(inputSourceIdentifier: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("localizedNameForInputSource:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, inputSourceIdentifier) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun localizedNameForInputSourceAsString(inputSourceIdentifier: MemorySegment): String = ObjCRuntime.toJavaString(localizedNameForInputSource(inputSourceIdentifier))

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun currentInputContext(): MemorySegment {
            val sel = ObjCRuntime.sel("currentInputContext")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithClient(client: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithClient:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, client) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun activate(): Unit {
        val sel = ObjCRuntime.sel("activate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deactivate(): Unit {
        val sel = ObjCRuntime.sel("deactivate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun handleEvent(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("handleEvent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun discardMarkedText(): Unit {
        val sel = ObjCRuntime.sel("discardMarkedText")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateCharacterCoordinates(): Unit {
        val sel = ObjCRuntime.sel("invalidateCharacterCoordinates")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun textInputClientWillStartScrollingOrZooming(): Unit {
        val sel = ObjCRuntime.sel("textInputClientWillStartScrollingOrZooming")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun textInputClientDidEndScrollingOrZooming(): Unit {
        val sel = ObjCRuntime.sel("textInputClientDidEndScrollingOrZooming")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun textInputClientDidUpdateSelection(): Unit {
        val sel = ObjCRuntime.sel("textInputClientDidUpdateSelection")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun textInputClientDidScroll(): Unit {
        val sel = ObjCRuntime.sel("textInputClientDidScroll")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property client
    /** @return id<NSTextInputClient> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun client(): MemorySegment {
        val sel = ObjCRuntime.sel("client")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property acceptsGlyphInfo
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun acceptsGlyphInfo(): Boolean {
        val sel = ObjCRuntime.sel("acceptsGlyphInfo")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAcceptsGlyphInfo(value: Boolean) {
        val sel = ObjCRuntime.sel("setAcceptsGlyphInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowedInputSourceLocales
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowedInputSourceLocales(): MemorySegment {
        val sel = ObjCRuntime.sel("allowedInputSourceLocales")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowedInputSourceLocales(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAllowedInputSourceLocales:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property keyboardInputSources
    /** @return NSArray<NSTextInputSourceIdentifier> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keyboardInputSources(): MemorySegment {
        val sel = ObjCRuntime.sel("keyboardInputSources")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectedKeyboardInputSource
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedKeyboardInputSource(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedKeyboardInputSource")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectedKeyboardInputSource(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectedKeyboardInputSource:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
