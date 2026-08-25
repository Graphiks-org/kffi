package org.graphiks.kffi.objc

import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals

class AppKitTypedBindingContractTest {
    @Test
    fun generatedAppKitSurfaceUsesNominalTypes() {
        val policy: NSApplicationActivationPolicy =
            NSApplicationActivationPolicy.NSApplicationActivationPolicyAccessory
        val eventType: NSEventType = NSEventType.NSEventTypeApplicationDefined
        val flags: NSEventModifierFlags =
            NSEventModifierFlags.NSEventModifierFlagShift +
                NSEventModifierFlags.NSEventModifierFlagCommand
        val point: NSPoint = NSPoint(x = 13.0, y = -7.0)
        val styleMask: NSWindowStyleMask =
            NSWindowStyleMask.NSWindowStyleMaskTitled +
                NSWindowStyleMask.NSWindowStyleMaskClosable
        val eventMask: NSEventMask =
            NSEventMask.NSEventMaskApplicationDefined + NSEventMask.NSEventMaskKeyDown
        val terminationReply: NSApplicationTerminateReply =
            NSApplicationTerminateReply.NSTerminateNow

        assertEquals(1L, policy.rawValue)
        assertEquals(15L, eventType.rawValue)
        assertEquals(1_179_648L, flags.rawValue)
        assertEquals(13.0, point.x)
        assertEquals(-7.0, point.y)
        assertEquals(3L, styleMask.rawValue)
        assertEquals(33_792L, eventMask.rawValue)
        assertEquals(1L, terminationReply.rawValue)
    }

    @Suppress("UNUSED_VARIABLE")
    private val typedCallContract: (NSApplication, NSEvent, NSWindow) -> Unit = { app, event, window ->
        val policy: NSApplicationActivationPolicy = app.activationPolicy()
        val type: NSEventType = event.type()
        val flags: NSEventModifierFlags = event.modifierFlags()
        val point: NSPoint = NSPoint(x = 13.0, y = -7.0)

        app.setActivationPolicy(policy)

        val applicationDefinedEvent: MemorySegment =
            NSEvent.otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2(
                NSEventType.NSEventTypeApplicationDefined,
                point,
                flags,
                123.5,
                0L,
                MemorySegment.NULL,
                7,
                11L,
                13L,
            )

        val contentRect: NSRect = NSRect(
            origin = point,
            size = NSSize(width = 640.0, height = 480.0),
        )
        val styleMask: NSWindowStyleMask =
            NSWindowStyleMask.NSWindowStyleMaskTitled +
                NSWindowStyleMask.NSWindowStyleMaskClosable
        val initializedWindow: MemorySegment = window.initWithContentRect_styleMask_backing_defer(
            contentRect,
            styleMask,
            NSBackingStoreType.NSBackingStoreBuffered,
            false,
        )
        val currentStyleMask: NSWindowStyleMask = window.styleMask()
        window.setStyleMask(styleMask)

        val eventMask: NSEventMask =
            NSEventMask.NSEventMaskApplicationDefined + NSEventMask.NSEventMaskKeyDown
        val monitor: MemorySegment = NSEvent.addLocalMonitorForEventsMatchingMask_handler(
            eventMask,
            MemorySegment.NULL,
        )
        val nextEvent: MemorySegment = app.nextEventMatchingMask_untilDate_inMode_dequeue(
            eventMask,
            MemorySegment.NULL,
            MemorySegment.NULL,
            false,
        )

        val delegate = object : NSApplicationDelegate {
            override fun applicationShouldTerminate(sender: MemorySegment): NSApplicationTerminateReply =
                NSApplicationTerminateReply.NSTerminateNow
        }
        val terminationReply: NSApplicationTerminateReply = delegate.applicationShouldTerminate(app.ptr)
    }
}
