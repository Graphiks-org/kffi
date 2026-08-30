@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSSharingServicePickerDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSSharingServicePickerDelegate {
    /** @return NSArray<NSSharingService *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingServicePicker_sharingServicesForItems_proposedSharingServices(sharingServicePicker: MemorySegment, items: MemorySegment, proposedServices: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'sharingServicePicker:sharingServicesForItems:proposedSharingServices:' not implemented")

    /** @return id<NSSharingServiceDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingServicePicker_delegateForSharingService(sharingServicePicker: MemorySegment, sharingService: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'sharingServicePicker:delegateForSharingService:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingServicePicker_didChooseSharingService(sharingServicePicker: MemorySegment, service: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'sharingServicePicker:didChooseSharingService:' not implemented")

    /** @return NSArray<NSSharingCollaborationModeRestriction *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun sharingServicePickerCollaborationModeRestrictions(sharingServicePicker: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'sharingServicePickerCollaborationModeRestrictions:' not implemented")

}
