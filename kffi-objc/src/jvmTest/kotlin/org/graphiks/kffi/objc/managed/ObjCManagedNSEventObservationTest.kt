package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSEvent
import org.graphiks.kffi.objc.NSEventModifierFlags
import org.graphiks.kffi.objc.NSEventType
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.reflect.KClass

class ObjCManagedNSEventObservationTest {
    @Test
    fun keyDownDeliversAnImmutableKeyboardObservationAfterTheCallbackReturns() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            superclassName = "NSView",
            methods = mapOf("keyDown:" to ObjCMethodSignatures.VoidObject),
        )
        var observed: NSEventObservation? = null
        val instance = managedClass.createInstance {
            onNSEvent("keyDown:") { observed = it }
        }

        try {
            ObjCRuntime.autoreleasePool {
                val event = NSEvent.keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode(
                    type = NSEventType.NSEventTypeKeyDown,
                    location = NSPoint(x = 12.5, y = -4.0),
                    flags = NSEventModifierFlags.NSEventModifierFlagShift + NSEventModifierFlags.NSEventModifierFlagCommand,
                    time = 1.0,
                    wNum = 0L,
                    unusedPassNil = MemorySegment.NULL,
                    keys = "A",
                    ukeys = "a",
                    flag = true,
                    code = 0x00,
                )

                send(instance, "keyDown:", event)
            }

            val keyboard = assertIs<NSEventObservation.Details.Keyboard>(requireNotNull(observed).details)
            assertEquals(NSEventType.NSEventTypeKeyDown, observed.type)
            assertEquals(1_179_648L, observed.modifierFlags.rawValue)
            assertEquals(NSEventObservation.Position(x = 12.5, y = -4.0), observed.position)
            assertEquals(0, keyboard.keyCode)
            assertEquals("A", keyboard.characters)
            assertEquals("a", keyboard.charactersIgnoringModifiers)
            assertEquals(true, keyboard.isRepeat)
        } finally {
            instance.close()
        }
    }

    @Test
    fun mouseDownDeliversOnlyPointerDataAndKeepsItUsableAfterTheCallbackReturns() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            superclassName = "NSView",
            methods = mapOf("mouseDown:" to ObjCMethodSignatures.VoidObject),
        )
        var observed: NSEventObservation? = null
        val instance = managedClass.createInstance {
            onNSEvent("mouseDown:") { observed = it }
        }

        try {
            ObjCRuntime.autoreleasePool {
                val event = NSEvent.mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure(
                    type = NSEventType.NSEventTypeLeftMouseDown,
                    location = NSPoint(x = 7.0, y = 9.5),
                    flags = NSEventModifierFlags.NSEventModifierFlagOption,
                    time = 2.0,
                    wNum = 0L,
                    unusedPassNil = MemorySegment.NULL,
                    eNum = 1L,
                    cNum = 3L,
                    pressure = 0.75f,
                )

                send(instance, "mouseDown:", event)
            }

            val pointer = assertIs<NSEventObservation.Details.Pointer>(requireNotNull(observed).details)
            assertEquals(NSEventType.NSEventTypeLeftMouseDown, observed.type)
            assertEquals(NSEventModifierFlags.NSEventModifierFlagOption, observed.modifierFlags)
            assertEquals(NSEventObservation.Position(x = 7.0, y = 9.5), observed.position)
            assertEquals(0L, pointer.buttonNumber)
            assertEquals(3L, pointer.clickCount)
            assertEquals(0.75f, pointer.pressure)
            assertEquals(0.0, pointer.deltaX)
            assertEquals(0.0, pointer.deltaY)
        } finally {
            instance.close()
        }
    }

    @Test
    fun mouseMovedSnapshotsPointerDeltasThroughTheManagedNSViewOverride() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            superclassName = "NSView",
            methods = mapOf("mouseMoved:" to ObjCMethodSignatures.VoidObject),
        )
        var observed: NSEventObservation? = null
        val instance = managedClass.createInstance {
            onNSEvent("mouseMoved:") { observed = it }
        }

        try {
            ObjCRuntime.autoreleasePool {
                val event = NSEvent.mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure(
                    type = NSEventType.NSEventTypeMouseMoved,
                    location = NSPoint(x = 23.0, y = 5.0),
                    flags = NSEventModifierFlags(0),
                    time = 3.0,
                    wNum = 0L,
                    unusedPassNil = MemorySegment.NULL,
                    eNum = 2L,
                    cNum = 0L,
                    pressure = 0f,
                )

                send(instance, "mouseMoved:", event)
            }

            val pointer = assertIs<NSEventObservation.Details.Pointer>(requireNotNull(observed).details)
            assertEquals(0.0, pointer.deltaX)
            assertEquals(0.0, pointer.deltaY)
        } finally {
            instance.close()
        }
    }

    @Test
    fun mouseEnteredDeliversTrackingDetailsWithoutReadingButtonOnlyProperties() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            superclassName = "NSView",
            methods = mapOf("mouseEntered:" to ObjCMethodSignatures.VoidObject),
        )
        var observed: NSEventObservation? = null
        val instance = managedClass.createInstance {
            onNSEvent("mouseEntered:") { observed = it }
        }

        try {
            ObjCRuntime.autoreleasePool {
                val event = NSEvent.enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData(
                    type = NSEventType.NSEventTypeMouseEntered,
                    location = NSPoint(x = 3.0, y = 7.0),
                    flags = NSEventModifierFlags(0L),
                    time = 4.0,
                    wNum = 0L,
                    unusedPassNil = MemorySegment.NULL,
                    eNum = 2L,
                    tNum = 41L,
                    data = MemorySegment.NULL,
                )

                send(instance, "mouseEntered:", event)
            }

            val tracking = assertIs<NSEventObservation.Details.Tracking>(requireNotNull(observed).details)
            assertEquals(NSEventType.NSEventTypeMouseEntered, observed.type)
            assertEquals(NSEventObservation.Position(x = 3.0, y = 7.0), observed.position)
            assertEquals(41L, tracking.trackingNumber)
        } finally {
            instance.close()
        }
    }

    @Test
    fun pointerObservationCopiesNonZeroDeltasFromGeneratedEventGetters() {
        val observation = NSEventObservation.from(
            SyntheticNSEvent(
                type = NSEventType.NSEventTypeLeftMouseDragged,
                deltaX = -3.5,
                deltaY = 7.25,
            ),
        )

        val pointer = assertIs<NSEventObservation.Details.Pointer>(observation.details)
        assertEquals(-3.5, pointer.deltaX)
        assertEquals(7.25, pointer.deltaY)
    }

    @Test
    fun everyGeneratedEventTypeHasTheDeclaredObservationDetails() {
        allGeneratedEventTypeCases.forEach { (type, expectedDetails) ->
            assertEquals(expectedDetails, NSEventObservation.from(SyntheticNSEvent(eventType = type)).details::class)
        }
    }

    private fun send(instance: ObjCManagedInstance, selector: String, event: MemorySegment) {
        ObjCRuntime.msgSend(
            null,
            instance.receiver.ptr,
            ObjCRuntime.sel(selector),
            event,
        )
    }

    private fun requireMacOS() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )
    }
}

private val keyboardEventTypes = listOf(
    NSEventType.NSEventTypeKeyDown,
    NSEventType.NSEventTypeKeyUp,
    NSEventType.NSEventTypeFlagsChanged,
)

private val pointerEventTypes = listOf(
    NSEventType.NSEventTypeLeftMouseDown,
    NSEventType.NSEventTypeLeftMouseUp,
    NSEventType.NSEventTypeRightMouseDown,
    NSEventType.NSEventTypeRightMouseUp,
    NSEventType.NSEventTypeMouseMoved,
    NSEventType.NSEventTypeLeftMouseDragged,
    NSEventType.NSEventTypeRightMouseDragged,
    NSEventType.NSEventTypeOtherMouseDown,
    NSEventType.NSEventTypeOtherMouseUp,
    NSEventType.NSEventTypeOtherMouseDragged,
    NSEventType.NSEventTypeMouseCancelled,
)

private val trackingEventTypes = listOf(
    NSEventType.NSEventTypeMouseEntered,
    NSEventType.NSEventTypeMouseExited,
)

private val noneEventTypes = listOf(
    NSEventType.NSEventTypeAppKitDefined,
    NSEventType.NSEventTypeSystemDefined,
    NSEventType.NSEventTypeApplicationDefined,
    NSEventType.NSEventTypePeriodic,
    NSEventType.NSEventTypeCursorUpdate,
    NSEventType.NSEventTypeScrollWheel,
    NSEventType.NSEventTypeTabletPoint,
    NSEventType.NSEventTypeTabletProximity,
    NSEventType.NSEventTypeGesture,
    NSEventType.NSEventTypeMagnify,
    NSEventType.NSEventTypeSwipe,
    NSEventType.NSEventTypeRotate,
    NSEventType.NSEventTypeBeginGesture,
    NSEventType.NSEventTypeEndGesture,
    NSEventType.NSEventTypeSmartMagnify,
    NSEventType.NSEventTypeQuickLook,
    NSEventType.NSEventTypePressure,
    NSEventType.NSEventTypeDirectTouch,
    NSEventType.NSEventTypeChangeMode,
)

private val allGeneratedEventTypeCases: List<Pair<NSEventType, KClass<out NSEventObservation.Details>>> =
    keyboardEventTypes.map { it to NSEventObservation.Details.Keyboard::class } +
        pointerEventTypes.map { it to NSEventObservation.Details.Pointer::class } +
        trackingEventTypes.map { it to NSEventObservation.Details.Tracking::class } +
        noneEventTypes.map { it to NSEventObservation.Details.None::class }

private class SyntheticNSEvent(
    private val eventType: NSEventType,
    private val eventModifierFlags: NSEventModifierFlags = NSEventModifierFlags(0),
    private val eventLocation: NSPoint = NSPoint(x = 0.0, y = 0.0),
    private val eventKeyCode: Short = 0,
    private val eventCharacters: String = "",
    private val eventCharactersIgnoringModifiers: String = "",
    private val eventIsRepeat: Boolean = false,
    private val eventButtonNumber: Long = 0L,
    private val eventClickCount: Long = 0L,
    private val eventPressure: Float = 0f,
    private val eventDeltaX: Double = 0.0,
    private val eventDeltaY: Double = 0.0,
    private val eventTrackingNumber: Long = 0L,
) : NSEvent(MemorySegment.NULL) {
    constructor(
        type: NSEventType,
        deltaX: Double,
        deltaY: Double,
    ) : this(
        eventType = type,
        eventDeltaX = deltaX,
        eventDeltaY = deltaY,
    )

    override fun type(): NSEventType = eventType

    override fun modifierFlags(): NSEventModifierFlags = eventModifierFlags

    override fun locationInWindow(): NSPoint = eventLocation

    override fun keyCode(): Short = eventKeyCode

    override fun charactersAsString(): String = eventCharacters

    override fun charactersIgnoringModifiersAsString(): String = eventCharactersIgnoringModifiers

    override fun isARepeat(): Boolean = eventIsRepeat

    override fun buttonNumber(): Long = eventButtonNumber

    override fun clickCount(): Long = eventClickCount

    override fun pressure(): Float = eventPressure

    override fun deltaX(): Double = eventDeltaX

    override fun deltaY(): Double = eventDeltaY

    override fun trackingNumber(): Long = eventTrackingNumber
}
