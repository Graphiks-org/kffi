package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSEvent
import org.graphiks.kffi.objc.NSEventModifierFlags
import org.graphiks.kffi.objc.NSEventPhase
import org.graphiks.kffi.objc.NSEventType
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSTouchPhase
import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNotEquals
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
    fun flagsChangedDeliversKeyboardDetailsWithoutReadingTextOnlyProperties() {
        requireMacOS()
        val managedClass = ObjCManagedClass.registerOnce(
            superclassName = "NSView",
            methods = mapOf("flagsChanged:" to ObjCMethodSignatures.VoidObject),
        )
        var observed: NSEventObservation? = null
        val instance = managedClass.createInstance {
            onNSEvent("flagsChanged:") { observed = it }
        }

        try {
            ObjCRuntime.autoreleasePool {
                val event = NSEvent.keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode(
                    type = NSEventType.NSEventTypeFlagsChanged,
                    location = NSPoint(x = 2.0, y = 6.0),
                    flags = NSEventModifierFlags.NSEventModifierFlagShift,
                    time = 1.0,
                    wNum = 0L,
                    unusedPassNil = MemorySegment.NULL,
                    keys = "",
                    ukeys = "",
                    flag = false,
                    code = 0x38,
                )

                send(instance, "flagsChanged:", event)
            }

            val keyboard = assertIs<NSEventObservation.Details.Keyboard>(requireNotNull(observed).details)
            assertEquals(NSEventType.NSEventTypeFlagsChanged, observed.type)
            assertEquals(56, keyboard.keyCode)
            assertEquals("", keyboard.characters)
            assertEquals("", keyboard.charactersIgnoringModifiers)
            assertEquals(false, keyboard.isRepeat)
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
    fun touchSelectorsSnapshotIndirectContactsWithNormalizedPositions() {
        val identity = SyntheticTouchIdentity(1)
        val expectedReceiver = MemorySegment.ofAddress(0x40)
        val source = RecordingTouchSource(identity, expectedReceiver)
        val context = NSEventObservation.Context(source)

        val observed = listOf(
            "touchesBeganWithEvent:" to NSTouchPhase.NSTouchPhaseBegan,
            "touchesMovedWithEvent:" to NSTouchPhase.NSTouchPhaseMoved,
            "touchesEndedWithEvent:" to NSTouchPhase.NSTouchPhaseEnded,
            "touchesCancelledWithEvent:" to NSTouchPhase.NSTouchPhaseCancelled,
        ).map { (selector, expectedPhase) ->
            context.snapshot(
                event = SyntheticNSEvent(eventType = NSEventType.NSEventTypeGesture),
                selector = selector,
                receiver = expectedReceiver,
            ).let { observation ->
                val touches = assertIs<NSEventObservation.Details.Touches>(observation.details)
                assertEquals(expectedPhase, source.requestedPhases.removeFirst())
                assertEquals(expectedReceiver, source.receivers.removeFirst())
                assertEquals(expectedPhase, touches.touches.single().phase)
                assertEquals(NSEventObservation.Position(x = 0.25, y = 0.75), touches.touches.single().position)
                observation
            }
        }

        assertEquals(4, observed.size)
    }

    @Test
    fun touchIdentityUsesSemanticEqualityAcrossCallbacksAndRetiresAfterTerminalSnapshot() {
        val firstWrapper = SyntheticTouchIdentity(7)
        val equalWrapper = SyntheticTouchIdentity(7)
        val source = SequencedTouchSource(
            listOf(
                borrowedTouch(firstWrapper, NSTouchPhase.NSTouchPhaseBegan),
                borrowedTouch(equalWrapper, NSTouchPhase.NSTouchPhaseMoved),
                borrowedTouch(equalWrapper, NSTouchPhase.NSTouchPhaseEnded),
                borrowedTouch(equalWrapper, NSTouchPhase.NSTouchPhaseBegan),
            ),
        )
        val context = NSEventObservation.Context(source)
        val event = SyntheticNSEvent(eventType = NSEventType.NSEventTypeGesture)

        val began = context.snapshot(event, "touchesBeganWithEvent:", MemorySegment.NULL).touch()
        val moved = context.snapshot(event, "touchesMovedWithEvent:", MemorySegment.NULL).touch()
        val ended = context.snapshot(event, "touchesEndedWithEvent:", MemorySegment.NULL).touch()
        val reused = context.snapshot(event, "touchesBeganWithEvent:", MemorySegment.NULL).touch()

        assertEquals(began.id, moved.id)
        assertEquals(began.id, ended.id)
        assertNotEquals(ended.id, reused.id)
        assertEquals(1, firstWrapper.retainCount)
        assertEquals(1, firstWrapper.releaseCount)
        assertEquals(1, equalWrapper.retainCount)
    }

    @Test
    fun touchSnapshotsRemainDetachedAfterTheSourceIsReused() {
        val identity = SyntheticTouchIdentity(1)
        val source = SequencedTouchSource(listOf(borrowedTouch(identity, NSTouchPhase.NSTouchPhaseMoved)))
        val context = NSEventObservation.Context(source)

        val retained = context.snapshot(
            event = SyntheticNSEvent(eventType = NSEventType.NSEventTypeGesture),
            selector = "touchesMovedWithEvent:",
            receiver = MemorySegment.NULL,
        ).touch()

        assertEquals(NSEventObservation.Position(x = 0.25, y = 0.75), retained.position)
        assertEquals(NSTouchPhase.NSTouchPhaseMoved, retained.phase)
    }

    @Test
    fun routerSharesTouchIdentityAcrossSelectorsAndReleasesActiveOwnersOnClose() {
        val selectors = mapOf(
            "touchesBeganWithEvent:" to 101L,
            "touchesMovedWithEvent:" to 102L,
            "touchesEndedWithEvent:" to 103L,
            "touchesCancelledWithEvent:" to 104L,
        )
        val firstIdentity = SyntheticTouchIdentity(1)
        val equalIdentity = SyntheticTouchIdentity(1)
        val activeIdentity = SyntheticTouchIdentity(2)
        val source = SequencedTouchSource(
            listOf(
                borrowedTouch(firstIdentity, NSTouchPhase.NSTouchPhaseBegan),
                borrowedTouch(equalIdentity, NSTouchPhase.NSTouchPhaseMoved),
                borrowedTouch(equalIdentity, NSTouchPhase.NSTouchPhaseEnded),
                borrowedTouch(equalIdentity, NSTouchPhase.NSTouchPhaseBegan),
                borrowedTouch(activeIdentity, NSTouchPhase.NSTouchPhaseMoved),
                borrowedTouch(activeIdentity, NSTouchPhase.NSTouchPhaseCancelled),
                borrowedTouch(activeIdentity, NSTouchPhase.NSTouchPhaseBegan),
            ),
        )
        val event = SyntheticNSEvent(eventType = NSEventType.NSEventTypeGesture)
        val observations = mutableListOf<NSEventObservation>()
        val router = ObjCMethodRouter(
            declaredMethods = selectors.mapValues { ObjCMethodSignatures.VoidObject },
            touchSource = source,
            selectorAddress = { selector -> selectors.getValue(selector) },
            eventFromArgument = { event },
        ).apply {
            selectors.keys.forEach { selector -> onNSEvent(selector, observations::add) }
            freeze()
        }
        val receiver = MemorySegment.ofAddress(0x40)

        router.invokeVoidObject(receiver, selectors.getValue("touchesBeganWithEvent:"), 1L)
        router.invokeVoidObject(receiver, selectors.getValue("touchesMovedWithEvent:"), 1L)
        router.invokeVoidObject(receiver, selectors.getValue("touchesEndedWithEvent:"), 1L)
        router.invokeVoidObject(receiver, selectors.getValue("touchesBeganWithEvent:"), 1L)
        router.invokeVoidObject(receiver, selectors.getValue("touchesMovedWithEvent:"), 1L)
        router.invokeVoidObject(receiver, selectors.getValue("touchesCancelledWithEvent:"), 1L)
        router.invokeVoidObject(receiver, selectors.getValue("touchesBeganWithEvent:"), 1L)

        val contacts = observations.map(NSEventObservation::touch)
        assertEquals(contacts[0].id, contacts[1].id)
        assertEquals(contacts[0].id, contacts[2].id)
        assertNotEquals(contacts[2].id, contacts[3].id)
        assertEquals(NSEventObservation.Position(x = 0.25, y = 0.75), contacts[0].position)
        assertEquals(NSTouchPhase.NSTouchPhaseCancelled, contacts[5].phase)
        assertEquals(1, firstIdentity.releaseCount)
        assertEquals(1, activeIdentity.releaseCount)
        assertEquals(List(7) { receiver }, source.receivers)
        assertEquals(
            listOf(
                NSTouchPhase.NSTouchPhaseBegan,
                NSTouchPhase.NSTouchPhaseMoved,
                NSTouchPhase.NSTouchPhaseEnded,
                NSTouchPhase.NSTouchPhaseBegan,
                NSTouchPhase.NSTouchPhaseMoved,
                NSTouchPhase.NSTouchPhaseCancelled,
                NSTouchPhase.NSTouchPhaseBegan,
            ),
            source.phases,
        )

        router.close()

        assertEquals(2, activeIdentity.releaseCount)
    }

    @Test
    fun gestureEventsSnapshotTheirScalarDetailsAndBoundaries() {
        assertEquals(
            NSEventObservation.Details.Magnification(0.25, NSEventPhase.NSEventPhaseBegan),
            NSEventObservation.from(SyntheticNSEvent(
                eventType = NSEventType.NSEventTypeMagnify,
                eventMagnification = 0.25,
                eventPhase = NSEventPhase.NSEventPhaseBegan,
            )).details,
        )
        assertEquals(
            NSEventObservation.Details.Rotation(-17.5f, NSEventPhase.NSEventPhaseChanged),
            NSEventObservation.from(SyntheticNSEvent(
                eventType = NSEventType.NSEventTypeRotate,
                eventRotation = -17.5f,
                eventPhase = NSEventPhase.NSEventPhaseChanged,
            )).details,
        )
        assertEquals(
            NSEventObservation.Details.Swipe(-1.0, 2.0, NSEventPhase.NSEventPhaseEnded),
            NSEventObservation.from(SyntheticNSEvent(
                eventType = NSEventType.NSEventTypeSwipe,
                eventDeltaX = -1.0,
                eventDeltaY = 2.0,
                eventPhase = NSEventPhase.NSEventPhaseEnded,
            )).details,
        )
        assertEquals(
            NSEventObservation.Details.Pressure(0.8f, 2L, 0.4, NSEventPhase.NSEventPhaseCancelled),
            NSEventObservation.from(SyntheticNSEvent(
                eventType = NSEventType.NSEventTypePressure,
                eventPressure = 0.8f,
                eventStage = 2L,
                eventStageTransition = 0.4,
                eventPhase = NSEventPhase.NSEventPhaseCancelled,
            )).details,
        )
        assertEquals(
            NSEventObservation.Details.GestureBoundary.Begin,
            NSEventObservation.from(SyntheticNSEvent(eventType = NSEventType.NSEventTypeBeginGesture)).details,
        )
        assertEquals(
            NSEventObservation.Details.GestureBoundary.End,
            NSEventObservation.from(SyntheticNSEvent(eventType = NSEventType.NSEventTypeEndGesture)).details,
        )
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
    NSEventType.NSEventTypeSmartMagnify,
    NSEventType.NSEventTypeQuickLook,
    NSEventType.NSEventTypeDirectTouch,
    NSEventType.NSEventTypeChangeMode,
)

private val allGeneratedEventTypeCases: List<Pair<NSEventType, KClass<out NSEventObservation.Details>>> =
    keyboardEventTypes.map { it to NSEventObservation.Details.Keyboard::class } +
        pointerEventTypes.map { it to NSEventObservation.Details.Pointer::class } +
        trackingEventTypes.map { it to NSEventObservation.Details.Tracking::class } +
        listOf(
            NSEventType.NSEventTypeMagnify to NSEventObservation.Details.Magnification::class,
            NSEventType.NSEventTypeRotate to NSEventObservation.Details.Rotation::class,
            NSEventType.NSEventTypeSwipe to NSEventObservation.Details.Swipe::class,
            NSEventType.NSEventTypePressure to NSEventObservation.Details.Pressure::class,
            NSEventType.NSEventTypeBeginGesture to NSEventObservation.Details.GestureBoundary.Begin::class,
            NSEventType.NSEventTypeEndGesture to NSEventObservation.Details.GestureBoundary.End::class,
        ) +
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
    private val eventMagnification: Double = 0.0,
    private val eventRotation: Float = 0f,
    private val eventStage: Long = 0L,
    private val eventStageTransition: Double = 0.0,
    private val eventPhase: NSEventPhase = NSEventPhase.NSEventPhaseNone,
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

    override fun magnification(): Double = eventMagnification

    override fun rotation(): Float = eventRotation

    override fun stage(): Long = eventStage

    override fun stageTransition(): Double = eventStageTransition

    override fun phase(): NSEventPhase = eventPhase
}

private fun NSEventObservation.touch(): NSEventObservation.Touch =
    assertIs<NSEventObservation.Details.Touches>(details).touches.single()

private fun borrowedTouch(
    identity: NSEventObservation.NativeTouchIdentity,
    phase: NSTouchPhase,
): NSEventObservation.BorrowedTouch = NSEventObservation.BorrowedTouch(
    identity = identity,
    phase = phase,
    normalizedPosition = NSPoint(x = 0.25, y = 0.75),
)

private class SyntheticTouchIdentity(
    private val equalityKey: Int,
) : NSEventObservation.NativeTouchIdentity {
    var retainCount = 0
    var releaseCount = 0

    override fun isEqualTo(other: NSEventObservation.NativeTouchIdentity): Boolean =
        equalityKey == (other as SyntheticTouchIdentity).equalityKey

    override fun retain(): AutoCloseable {
        retainCount += 1
        return AutoCloseable { releaseCount += 1 }
    }
}

private class SequencedTouchSource(
    private val touches: List<NSEventObservation.BorrowedTouch>,
) : NSEventObservation.TouchSource {
    private var next = 0
    val receivers = mutableListOf<MemorySegment>()
    val phases = mutableListOf<NSTouchPhase>()

    override fun collect(
        event: NSEvent,
        phase: NSTouchPhase,
        receiver: MemorySegment,
    ): List<NSEventObservation.BorrowedTouch> {
        receivers += receiver
        phases += phase
        return listOf(touches[next++])
    }
}

private class RecordingTouchSource(
    private val identity: NSEventObservation.NativeTouchIdentity,
    private val expectedReceiver: MemorySegment,
) : NSEventObservation.TouchSource {
    val requestedPhases = ArrayDeque<NSTouchPhase>()
    val receivers = ArrayDeque<MemorySegment>()

    override fun collect(
        event: NSEvent,
        phase: NSTouchPhase,
        receiver: MemorySegment,
    ): List<NSEventObservation.BorrowedTouch> {
        requestedPhases += phase
        receivers += receiver
        assertEquals(expectedReceiver, receiver)
        return listOf(borrowedTouch(identity, phase))
    }
}
