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
