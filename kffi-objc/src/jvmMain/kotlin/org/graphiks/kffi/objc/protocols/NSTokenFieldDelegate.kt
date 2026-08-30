@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTokenFieldDelegate
 * Inherits protocols: NSTextFieldDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTokenFieldDelegate : NSTextFieldDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem(tokenField: MemorySegment, substring: MemorySegment, tokenIndex: Long, selectedIndex: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:completionsForSubstring:indexOfToken:indexOfSelectedItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_shouldAddObjects_atIndex(tokenField: MemorySegment, tokens: MemorySegment, index: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:shouldAddObjects:atIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_displayStringForRepresentedObject(tokenField: MemorySegment, representedObject: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:displayStringForRepresentedObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_editingStringForRepresentedObject(tokenField: MemorySegment, representedObject: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:editingStringForRepresentedObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_representedObjectForEditingString(tokenField: MemorySegment, editingString: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:representedObjectForEditingString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_writeRepresentedObjects_toPasteboard(tokenField: MemorySegment, objects: MemorySegment, pboard: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:writeRepresentedObjects:toPasteboard:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_readFromPasteboard(tokenField: MemorySegment, pboard: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:readFromPasteboard:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_menuForRepresentedObject(tokenField: MemorySegment, representedObject: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:menuForRepresentedObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_hasMenuForRepresentedObject(tokenField: MemorySegment, representedObject: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:hasMenuForRepresentedObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tokenField_styleForRepresentedObject(tokenField: MemorySegment, representedObject: MemorySegment): NSTokenStyle =
        throw UnsupportedOperationException("Optional ObjC method 'tokenField:styleForRepresentedObject:' not implemented")

}
