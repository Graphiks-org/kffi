@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSEnumerator
import org.graphiks.kffi.objc.NSEvent
import org.graphiks.kffi.objc.NSEventModifierFlags
import org.graphiks.kffi.objc.NSEventPhase
import org.graphiks.kffi.objc.NSEventType
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSSet
import org.graphiks.kffi.objc.NSTouch
import org.graphiks.kffi.objc.NSTouchPhase
import org.graphiks.kffi.objc.isEqualTo
import java.lang.foreign.MemorySegment

/** Immutable input data copied from an AppKit [NSEvent] during a managed Objective-C callback. */
data class NSEventObservation(
    val type: NSEventType,
    val modifierFlags: NSEventModifierFlags,
    val position: Position,
    val details: Details,
) {
    /** A location expressed in the receiving window's coordinate system. */
    data class Position(val x: Double, val y: Double)

    /** An opaque touch identity that is stable only within one managed receiver. */
    @JvmInline
    value class TouchId internal constructor(internal val value: Long)

    /** An immutable indirect-trackpad contact in normalized device coordinates. */
    data class Touch(val id: TouchId, val phase: NSTouchPhase, val position: Position)

    /** Private native identity behavior, separated so synthetic JVM tests never initialize libobjc. */
    internal interface NativeTouchIdentity {
        fun isEqualTo(other: NativeTouchIdentity): Boolean
        fun retain(): AutoCloseable
    }

    /** Borrowed AppKit touch values awaiting immediate conversion into [Touch]. */
    internal data class BorrowedTouch(
        val identity: NativeTouchIdentity,
        val phase: NSTouchPhase,
        val normalizedPosition: NSPoint,
    )

    /** The only internal seam around generated NSSet/NSEnumerator traversal. */
    internal fun interface TouchSource {
        fun collect(event: NSEvent, phase: NSTouchPhase, receiver: MemorySegment): List<BorrowedTouch>
    }

    /** One receiver-lifetime touch identity table, shared by every event selector binding. */
    internal class Context(private val touchSource: TouchSource = GeneratedTouchSource) : AutoCloseable {
        private val identities = TouchIdentityContext()

        fun snapshot(event: NSEvent, selector: String, receiver: MemorySegment): NSEventObservation =
            snapshot(event, touchPhaseForSelector(selector), receiver, touchSource, identities)

        override fun close() = identities.close()
    }

    /** The data applicable to the observed event kind. */
    sealed interface Details {
        data object None : Details

        data class Keyboard(
            val keyCode: Int,
            val characters: String,
            val charactersIgnoringModifiers: String,
            val isRepeat: Boolean,
        ) : Details

        data class Pointer(
            val buttonNumber: Long,
            val clickCount: Long,
            val pressure: Float,
            val deltaX: Double,
            val deltaY: Double,
        ) : Details

        data class Tracking(val trackingNumber: Long) : Details

        /** Indirect-trackpad contacts with normalized device coordinates. */
        data class Touches(val touches: List<Touch>) : Details

        data class Magnification(val value: Double, val phase: NSEventPhase) : Details
        data class Rotation(val value: Float, val phase: NSEventPhase) : Details
        data class Swipe(val deltaX: Double, val deltaY: Double, val phase: NSEventPhase) : Details
        data class Pressure(
            val pressure: Float,
            val stage: Long,
            val stageTransition: Double,
            val phase: NSEventPhase,
        ) : Details

        /** Legacy notifications only; modern lifecycle is carried by scalar [phase] values. */
        sealed interface GestureBoundary : Details {
            data object Begin : GestureBoundary
            data object End : GestureBoundary
        }
    }

    internal companion object {
        fun from(event: NSEvent): NSEventObservation =
            snapshot(event, null, MemorySegment.NULL, GeneratedTouchSource, TouchIdentityContext())

        private fun snapshot(
            event: NSEvent,
            touchPhase: NSTouchPhase?,
            receiver: MemorySegment,
            touchSource: TouchSource,
            identities: TouchIdentityContext,
        ): NSEventObservation {
            val type = event.type()
            val position = event.locationInWindow()
            return NSEventObservation(
                type = type,
                modifierFlags = event.modifierFlags(),
                position = Position(position.x, position.y),
                details = if (touchPhase == null) event.detailsFor(type) else Details.Touches(
                    touchSource.collect(event, touchPhase, receiver).map(identities::snapshot),
                ),
            )
        }

        private fun touchPhaseForSelector(selector: String): NSTouchPhase? = when (selector) {
            "touchesBeganWithEvent:" -> NSTouchPhase.NSTouchPhaseBegan
            "touchesMovedWithEvent:" -> NSTouchPhase.NSTouchPhaseMoved
            "touchesEndedWithEvent:" -> NSTouchPhase.NSTouchPhaseEnded
            "touchesCancelledWithEvent:" -> NSTouchPhase.NSTouchPhaseCancelled
            else -> null
        }

        private fun NSEvent.detailsFor(type: NSEventType): Details = when (type) {
            NSEventType.NSEventTypeKeyDown, NSEventType.NSEventTypeKeyUp -> Details.Keyboard(
                keyCode().toInt() and 0xffff,
                charactersAsString(),
                charactersIgnoringModifiersAsString(),
                isARepeat(),
            )
            NSEventType.NSEventTypeFlagsChanged -> Details.Keyboard(keyCode().toInt() and 0xffff, "", "", false)
            NSEventType.NSEventTypeLeftMouseDown, NSEventType.NSEventTypeLeftMouseUp,
            NSEventType.NSEventTypeRightMouseDown, NSEventType.NSEventTypeRightMouseUp,
            NSEventType.NSEventTypeOtherMouseDown, NSEventType.NSEventTypeOtherMouseUp,
            NSEventType.NSEventTypeMouseMoved, NSEventType.NSEventTypeLeftMouseDragged,
            NSEventType.NSEventTypeRightMouseDragged, NSEventType.NSEventTypeOtherMouseDragged,
            NSEventType.NSEventTypeMouseCancelled -> Details.Pointer(buttonNumber(), clickCount(), pressure(), deltaX(), deltaY())
            NSEventType.NSEventTypeMouseEntered, NSEventType.NSEventTypeMouseExited -> Details.Tracking(trackingNumber())
            NSEventType.NSEventTypeMagnify -> Details.Magnification(magnification(), phase())
            NSEventType.NSEventTypeRotate -> Details.Rotation(rotation(), phase())
            NSEventType.NSEventTypeSwipe -> Details.Swipe(deltaX(), deltaY(), phase())
            NSEventType.NSEventTypePressure -> Details.Pressure(pressure(), stage(), stageTransition(), phase())
            NSEventType.NSEventTypeBeginGesture -> Details.GestureBoundary.Begin
            NSEventType.NSEventTypeEndGesture -> Details.GestureBoundary.End
            else -> Details.None
        }
    }

    private class TouchIdentityContext : AutoCloseable {
        private data class Entry(val identity: NativeTouchIdentity, val owner: AutoCloseable, val token: TouchId)
        private val entries = mutableListOf<Entry>()
        private var nextToken = 1L

        fun snapshot(touch: BorrowedTouch): Touch {
            val entry = entries.firstOrNull { touch.identity.isEqualTo(it.identity) }
                ?: Entry(touch.identity, touch.identity.retain(), TouchId(nextToken++)).also(entries::add)
            val copied = Touch(entry.token, touch.phase, Position(touch.normalizedPosition.x, touch.normalizedPosition.y))
            if (touch.phase == NSTouchPhase.NSTouchPhaseEnded || touch.phase == NSTouchPhase.NSTouchPhaseCancelled) {
                entries.remove(entry)
                entry.owner.close()
            }
            return copied
        }

        override fun close() {
            entries.toList().forEach { it.owner.close() }
            entries.clear()
        }
    }

    private object GeneratedTouchSource : TouchSource {
        override fun collect(event: NSEvent, phase: NSTouchPhase, receiver: MemorySegment): List<BorrowedTouch> {
            val set = event.touchesMatchingPhase_inView(phase, receiver)
            if (set.address() == 0L) return emptyList()
            val enumeratorAddress = NSSet(set).objectEnumerator()
            if (enumeratorAddress.address() == 0L) return emptyList()
            val enumerator = NSEnumerator(enumeratorAddress)
            return buildList {
                while (true) {
                    val address = enumerator.nextObject()
                    if (address.address() == 0L) break
                    val touch = NSTouch(address)
                    add(BorrowedTouch(ObjCTouchIdentity(touch.identity()), touch.phase(), touch.normalizedPosition()))
                }
            }
        }
    }

    private class ObjCTouchIdentity(private val pointer: MemorySegment) : NativeTouchIdentity {
        override fun isEqualTo(other: NativeTouchIdentity): Boolean {
            val nativeOther = other as? ObjCTouchIdentity ?: return false
            return NSObject(pointer).isEqualTo(nativeOther.pointer)
        }

        override fun retain(): AutoCloseable = NSObject(pointer).retainStrong()
    }
}
