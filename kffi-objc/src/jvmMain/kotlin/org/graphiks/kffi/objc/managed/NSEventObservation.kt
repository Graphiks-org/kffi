@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSEvent
import org.graphiks.kffi.objc.NSEventModifierFlags
import org.graphiks.kffi.objc.NSEventType

/**
 * Immutable input data copied from an AppKit [NSEvent] during a managed Objective-C callback.
 *
 * The native event remains borrowed by the Objective-C runtime and is never exposed to the
 * handler. [details] makes the fields that are meaningful for the event kind explicit.
 */
data class NSEventObservation(
    val type: NSEventType,
    val modifierFlags: NSEventModifierFlags,
    val position: Position,
    val details: Details,
) {
    /** A location expressed in the receiving window's coordinate system. */
    data class Position(
        val x: Double,
        val y: Double,
    )

    /** The data applicable to the observed event kind. */
    sealed interface Details {
        /** The event is neither a keyboard nor a pointer event covered by this observation. */
        data object None : Details

        /** Keyboard data captured for key-down, key-up, and modifier-change events. */
        data class Keyboard(
            val keyCode: Int,
            val characters: String,
            val charactersIgnoringModifiers: String,
            val isRepeat: Boolean,
        ) : Details

        /** Pointer data captured for mouse movement, button, and drag events. */
        data class Pointer(
            val buttonNumber: Long,
            val clickCount: Long,
            val pressure: Float,
            val deltaX: Double,
            val deltaY: Double,
        ) : Details

        /** Tracking-area data captured for mouse enter and exit events. */
        data class Tracking(
            val trackingNumber: Long,
        ) : Details
    }

    internal companion object {
        fun from(event: NSEvent): NSEventObservation {
            val type = event.type()
            val position = event.locationInWindow()
            return NSEventObservation(
                type = type,
                modifierFlags = event.modifierFlags(),
                position = Position(position.x, position.y),
                details = event.detailsFor(type),
            )
        }

        private fun NSEvent.detailsFor(type: NSEventType): Details = when (type) {
            NSEventType.NSEventTypeKeyDown,
            NSEventType.NSEventTypeKeyUp,
            NSEventType.NSEventTypeFlagsChanged,
            -> Details.Keyboard(
                keyCode = keyCode().toInt() and 0xffff,
                characters = charactersAsString(),
                charactersIgnoringModifiers = charactersIgnoringModifiersAsString(),
                isRepeat = isARepeat(),
            )

            NSEventType.NSEventTypeLeftMouseDown,
            NSEventType.NSEventTypeLeftMouseUp,
            NSEventType.NSEventTypeRightMouseDown,
            NSEventType.NSEventTypeRightMouseUp,
            NSEventType.NSEventTypeOtherMouseDown,
            NSEventType.NSEventTypeOtherMouseUp,
            NSEventType.NSEventTypeMouseMoved,
            NSEventType.NSEventTypeLeftMouseDragged,
            NSEventType.NSEventTypeRightMouseDragged,
            NSEventType.NSEventTypeOtherMouseDragged,
            NSEventType.NSEventTypeMouseCancelled,
            -> Details.Pointer(
                buttonNumber = buttonNumber(),
                clickCount = clickCount(),
                pressure = pressure(),
                deltaX = deltaX(),
                deltaY = deltaY(),
            )

            NSEventType.NSEventTypeMouseEntered,
            NSEventType.NSEventTypeMouseExited,
            -> Details.Tracking(
                trackingNumber = trackingNumber(),
            )

            else -> Details.None
        }
    }
}
