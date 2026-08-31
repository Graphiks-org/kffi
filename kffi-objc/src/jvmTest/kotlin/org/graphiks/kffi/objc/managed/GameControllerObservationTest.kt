package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.GCController
import org.graphiks.kffi.objc.GCControllerAxisInput
import org.graphiks.kffi.objc.GCControllerButtonInput
import org.graphiks.kffi.objc.GCControllerDidConnectNotification
import org.graphiks.kffi.objc.GCControllerDidDisconnectNotification
import org.graphiks.kffi.objc.GCControllerDirectionPad
import org.graphiks.kffi.objc.GCControllerElement
import org.graphiks.kffi.objc.GCPhysicalInputProfile
import org.graphiks.kffi.objc.NSArray
import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class GameControllerObservationTest {
    @Test
    fun closingObservationClearsProfileHandlerWithoutAController() {
        if (!System.getProperty("os.name").startsWith("Mac", ignoreCase = true)) return

        val profile = RecordingPhysicalInputProfile()
        val observation = profile.observeValueChanges { _, _ -> }

        assertNotEquals(MemorySegment.NULL, profile.currentHandler)
        observation.close()

        assertEquals(MemorySegment.NULL, profile.currentHandler)
        assertEquals(listOf("set", "clear"), profile.events)
    }

    @Test
    fun closingObservationClearsHandlerWhenAControllerIsAlreadyConnected() {
        if (!System.getProperty("os.name").startsWith("Mac", ignoreCase = true)) return

        System.load("/System/Library/Frameworks/GameController.framework/GameController")
        val controllers = NSArray(GCController.controllers())
        if (controllers.count() == 0L) return

        val controller = GCController(controllers.objectAtIndex(0L))
        val profile = GCPhysicalInputProfile(controller.physicalInputProfile())
        val observation = profile.observeValueChanges { _, _ -> }

        observation.close()

        assertEquals(MemorySegment.NULL, profile.valueDidChangeHandler())
    }

    @Suppress("UNUSED_VARIABLE")
    private val generatedTypeContract:
        (GCController, GCPhysicalInputProfile, GCControllerElement) -> Unit =
        { controller, profile, element ->
            val physicalInput: GCPhysicalInputProfile =
                GCPhysicalInputProfile(controller.physicalInputProfile())
            val elements: MemorySegment = profile.elements()
            val buttons: MemorySegment = profile.buttons()
            val axes: MemorySegment = profile.axes()
            val dpads: MemorySegment = profile.dpads()
            val controllerElement: GCControllerElement = element
            val button = GCControllerButtonInput(element.ptr)
            val axis = GCControllerAxisInput(element.ptr)
            val directionPad = GCControllerDirectionPad(element.ptr)
        }

    @Suppress("UNUSED_VARIABLE")
    private val notificationContract: () -> Unit = {
        val connected: MemorySegment = GCControllerDidConnectNotification
        val disconnected: MemorySegment = GCControllerDidDisconnectNotification
    }

    @Suppress("UNUSED_VARIABLE")
    private val managedObservationContract: (GCPhysicalInputProfile) -> AutoCloseable = { profile ->
        profile.observeValueChanges { changedProfile, changedElement ->
            val typedProfile: GCPhysicalInputProfile = changedProfile
            val typedElement: GCControllerElement = changedElement
        }
    }
}

private class RecordingPhysicalInputProfile : GCPhysicalInputProfile(MemorySegment.NULL) {
    val events = mutableListOf<String>()
    var currentHandler: MemorySegment = MemorySegment.NULL

    override fun valueDidChangeHandler(): MemorySegment = currentHandler

    override fun setValueDidChangeHandler(value: MemorySegment) {
        currentHandler = value
        events += if (value == MemorySegment.NULL) "clear" else "set"
    }
}
