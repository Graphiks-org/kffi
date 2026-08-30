@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPathCellDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSPathCellDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pathCell_willDisplayOpenPanel(pathCell: MemorySegment, openPanel: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pathCell:willDisplayOpenPanel:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pathCell_willPopUpMenu(pathCell: MemorySegment, menu: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pathCell:willPopUpMenu:' not implemented")

}
