@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSComboBoxDelegate
 * Inherits protocols: NSTextFieldDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSComboBoxDelegate : NSTextFieldDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun comboBoxWillPopUp(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'comboBoxWillPopUp:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun comboBoxWillDismiss(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'comboBoxWillDismiss:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun comboBoxSelectionDidChange(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'comboBoxSelectionDidChange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun comboBoxSelectionIsChanging(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'comboBoxSelectionIsChanging:' not implemented")

}
