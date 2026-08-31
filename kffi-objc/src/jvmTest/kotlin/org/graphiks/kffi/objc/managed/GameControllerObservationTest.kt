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
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
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

    @Test
    fun retainedLateCallbackAfterCloseIsIgnoredWithoutGameControllerHardware() {
        if (!System.getProperty("os.name").startsWith("Mac", ignoreCase = true)) return

        val profile = RecordingPhysicalInputProfile()
        var invocations = 0
        val observation = profile.observeValueChanges { _, _ -> invocations += 1 }
        val retainedHandler = GameControllerObservationBlockRuntime.copy(profile.currentHandler)

        try {
            observation.close()
            GameControllerObservationBlockRuntime.invokeObjectObject(
                retainedHandler,
                MemorySegment.NULL,
                MemorySegment.NULL,
            )

            assertEquals(MemorySegment.NULL, profile.currentHandler)
            assertEquals(0, invocations)
        } finally {
            GameControllerObservationBlockRuntime.release(retainedHandler)
            observation.close()
        }
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

/** Calls a retained Objective-C block directly to model a framework callback queued before close. */
private object GameControllerObservationBlockRuntime {
    private const val BLOCK_INVOKE_OFFSET = 16L
    private const val BLOCK_LITERAL_SIZE = 32L
    private val arena = Arena.global()
    private val linker = Linker.nativeLinker()
    private val symbols = SymbolLookup.libraryLookup("/usr/lib/libSystem.B.dylib", arena)
    private val copy = linker.downcallHandle(
        symbols.find("_Block_copy").orElseThrow(),
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val release = linker.downcallHandle(
        symbols.find("_Block_release").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
    )

    fun copy(block: MemorySegment): MemorySegment = copy.invokeExact(block) as MemorySegment

    fun release(block: MemorySegment) {
        release.invokeExact(block)
    }

    fun invokeObjectObject(block: MemorySegment, first: MemorySegment, second: MemorySegment) {
        val literal = block.reinterpret(BLOCK_LITERAL_SIZE)
        val function = literal.get(ValueLayout.ADDRESS, BLOCK_INVOKE_OFFSET)
        linker.downcallHandle(
            function,
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        ).invokeWithArguments(block, first, second)
    }
}
