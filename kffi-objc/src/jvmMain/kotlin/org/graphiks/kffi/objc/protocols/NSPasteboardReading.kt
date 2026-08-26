package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPasteboardReading
 * Inherits protocols: NSObject
 */
interface NSPasteboardReading {
    // @optional
    fun initWithPasteboardPropertyList_ofType(propertyList: MemorySegment, type: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'initWithPasteboardPropertyList:ofType:' not implemented")

}
