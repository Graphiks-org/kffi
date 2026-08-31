package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.GCDeviceHaptics
import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertTrue

class GameControllerHapticsTest {
    @Test
    fun facadeStartsStopsAndReleasesItsEngineWithoutExposingIt() {
        val session = RecordingHapticsSession()
        val result = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { session },
        )

        val haptics = result.getOrThrow()
        assertTrue(haptics.start().isSuccess)
        haptics.close()
        haptics.close()

        assertEquals(listOf("start", "stop", "release"), session.calls)
    }

    @Test
    fun facadeMapsNativeErrorsToSafeKotlinFailures() {
        val failure = GameControllerHapticsFailure(
            domain = "com.apple.CoreHaptics",
            code = -4815,
            description = "The haptic engine could not start",
        )
        val session = RecordingHapticsSession(failure)
        val haptics = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { session },
        ).getOrThrow()

        val result = haptics.start()

        assertTrue(result.isFailure)
        val error = assertIs<GameControllerHapticsException>(result.exceptionOrNull())
        assertEquals("com.apple.CoreHaptics", error.domain)
        assertEquals(-4815, error.code)
        assertEquals("The haptic engine could not start", error.message)
        haptics.close()
    }

    @Test
    fun facadeReturnsFailureWhenTheDeviceCannotCreateAnEngine() {
        val result = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { null },
        )

        assertTrue(result.isFailure)
        assertIs<GameControllerHapticsException>(result.exceptionOrNull())
    }

    @Test
    fun startAfterCloseFailsWithoutCallingTheReleasedEngine() {
        val session = RecordingHapticsSession()
        val haptics = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { session },
        ).getOrThrow()
        haptics.close()

        val result = haptics.start()

        assertFalse(result.isSuccess)
        assertFailsWith<IllegalStateException> { result.getOrThrow() }
        assertEquals(listOf("stop", "release"), session.calls)
    }
}

private class RecordingHapticsSession(
    private val startFailure: GameControllerHapticsFailure? = null,
) : GameControllerHapticsSession {
    val calls = mutableListOf<String>()

    override fun start(): GameControllerHapticsFailure? {
        calls += "start"
        return startFailure
    }

    override fun stop() {
        calls += "stop"
    }

    override fun release() {
        calls += "release"
    }
}
