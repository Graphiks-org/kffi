package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.GCDeviceHaptics
import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertTrue
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

class GameControllerHapticsTest {
    @Test
    fun facadeStartsStopsAndReleasesItsEngineWithoutExposingIt() {
        val session = RecordingHapticsSession()
        val result = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { _, _ -> session },
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
            GameControllerHapticsFactory { _, _ -> session },
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
    fun continuousPlaybackMapsNativeErrorsToSafeKotlinFailures() {
        val failure = GameControllerHapticsFailure(
            domain = "com.apple.CoreHaptics",
            code = -4805,
            description = "The haptic pattern player could not start",
        )
        val session = RecordingHapticsSession(continuousPlaybackFailure = failure)
        val haptics = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { _, _ -> session },
        ).getOrThrow()

        val result = haptics.playContinuous(intensity = 0.75f, duration = 250.milliseconds)

        assertTrue(result.isFailure)
        val error = assertIs<GameControllerHapticsException>(result.exceptionOrNull())
        assertEquals("com.apple.CoreHaptics", error.domain)
        assertEquals(-4805, error.code)
        assertEquals("The haptic pattern player could not start", error.message)
        assertEquals(listOf(0.75f to 250.milliseconds), session.continuousPulses)
        haptics.close()
    }

    @Test
    fun continuousPlaybackRejectsInvalidInputsBeforeCallingTheNativeSession() {
        val session = RecordingHapticsSession()
        val haptics = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { _, _ -> session },
        ).getOrThrow()

        assertFailsWith<IllegalArgumentException> {
            haptics.playContinuous(intensity = Float.NaN, duration = 250.milliseconds)
        }
        assertFailsWith<IllegalArgumentException> {
            haptics.playContinuous(intensity = 0.75f, duration = (-1).milliseconds)
        }
        assertFailsWith<IllegalArgumentException> {
            haptics.playContinuous(intensity = 0.75f, duration = Duration.INFINITE)
        }

        assertEquals(emptyList(), session.continuousPulses)
        haptics.close()
    }

    @Test
    fun facadeReturnsFailureWhenTheDeviceCannotCreateAnEngine() {
        val result = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { _, _ -> null },
        )

        assertTrue(result.isFailure)
        assertIs<GameControllerHapticsException>(result.exceptionOrNull())
    }

    @Test
    fun startAfterCloseFailsWithoutCallingTheReleasedEngine() {
        val session = RecordingHapticsSession()
        val haptics = GameControllerHaptics.create(
            GCDeviceHaptics(MemorySegment.NULL),
            GameControllerHapticsFactory { _, _ -> session },
        ).getOrThrow()
        haptics.close()

        val result = haptics.start()

        assertFalse(result.isSuccess)
        assertFailsWith<IllegalStateException> { result.getOrThrow() }
        assertEquals(listOf("stop", "release"), session.calls)
    }

    @Test
    fun facadeCreatesOnlyAnAdvertisedHapticLocality() {
        val session = RecordingHapticsSession()
        val factory = RecordingLocalizedHapticsFactory(
            supportedLocalities = setOf(GameControllerHapticLocality.LeftHandle),
            session = session,
        )

        val haptics = GameControllerHaptics.create(
            deviceHaptics = GCDeviceHaptics(MemorySegment.NULL),
            locality = GameControllerHapticLocality.LeftHandle,
            factory = factory,
        ).getOrThrow()

        assertEquals(GameControllerHapticLocality.LeftHandle, haptics.locality)
        assertEquals(setOf(GameControllerHapticLocality.LeftHandle), haptics.supportedLocalities)
        assertEquals(listOf(GameControllerHapticLocality.LeftHandle), factory.createdLocalities)
        haptics.close()
    }

    @Test
    fun facadeRejectsAnUnadvertisedHapticLocalityBeforeCreatingAnEngine() {
        val factory = RecordingLocalizedHapticsFactory(
            supportedLocalities = setOf(GameControllerHapticLocality.RightHandle),
            session = RecordingHapticsSession(),
        )

        val result = GameControllerHaptics.create(
            deviceHaptics = GCDeviceHaptics(MemorySegment.NULL),
            locality = GameControllerHapticLocality.LeftHandle,
            factory = factory,
        )

        assertTrue(result.isFailure)
        assertIs<GameControllerHapticsException>(result.exceptionOrNull())
        assertEquals(emptyList(), factory.createdLocalities)
    }
}

private class RecordingHapticsSession(
    private val startFailure: GameControllerHapticsFailure? = null,
    private val continuousPlaybackFailure: GameControllerHapticsFailure? = null,
) : GameControllerHapticsSession {
    val calls = mutableListOf<String>()
    val continuousPulses = mutableListOf<Pair<Float, Duration>>()

    override fun start(): GameControllerHapticsFailure? {
        calls += "start"
        return startFailure
    }

    override fun playContinuous(
        intensity: Float,
        duration: Duration,
    ): GameControllerHapticsFailure? {
        continuousPulses += intensity to duration
        return continuousPlaybackFailure
    }

    override fun stop() {
        calls += "stop"
    }

    override fun release() {
        calls += "release"
    }
}

private class RecordingLocalizedHapticsFactory(
    private val supportedLocalities: Set<GameControllerHapticLocality>,
    private val session: GameControllerHapticsSession,
) : GameControllerHapticsFactory {
    val createdLocalities = mutableListOf<GameControllerHapticLocality>()

    override fun supportedLocalities(
        deviceHaptics: GCDeviceHaptics,
    ): Set<GameControllerHapticLocality> = supportedLocalities

    override fun create(
        deviceHaptics: GCDeviceHaptics,
        locality: GameControllerHapticLocality,
    ): GameControllerHapticsSession? {
        createdLocalities += locality
        return session
    }
}
