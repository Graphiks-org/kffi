@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.GCControllerElement
import org.graphiks.kffi.objc.GCPhysicalInputProfile

/**
 * Installs a managed handler for physical-input value changes.
 *
 * The [GCPhysicalInputProfile] and [GCControllerElement] passed to [handler] are borrowed and are
 * valid only for the dynamic extent of the handler call. Closing the returned owner first clears
 * the native `valueDidChangeHandler` property, then revokes callback admission.
 */
fun GCPhysicalInputProfile.observeValueChanges(
    handler: (GCPhysicalInputProfile, GCControllerElement) -> Unit,
): AutoCloseable = ObjCManagedBlock.voidObjectObject(
    setter = ObjCManagedBlockSetter(::setValueDidChangeHandler),
) { profile, element ->
    handler(
        GCPhysicalInputProfile(requireNotNull(profile).ptr),
        GCControllerElement(requireNotNull(element).ptr),
    )
}
