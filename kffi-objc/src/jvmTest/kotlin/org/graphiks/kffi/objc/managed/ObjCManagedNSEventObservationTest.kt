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
        } finally {
            instance.close()
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
