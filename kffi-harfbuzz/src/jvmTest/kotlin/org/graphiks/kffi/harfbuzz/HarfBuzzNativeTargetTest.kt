package org.graphiks.kffi.harfbuzz

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class HarfBuzzNativeTargetTest {
    @Test
    fun windowsX64ResolvesToTheBundledBinary() {
        val target = assertNotNull(
            harfBuzzNativeTargetFor(HarfBuzzPlatform("Windows Server 2022", "amd64")),
        )
        assertEquals("windows", target.operatingSystem)
        assertEquals("x64", target.architecture)
        assertEquals("/kffi/harfbuzz/windows/x64/libharfbuzz.dll", target.resourcePath)
        assertEquals("libharfbuzz.dll", target.fileName)
        assertEquals("9f2f03173b7fee860cc00d999857d09fa4a362e2", target.nativeSourceRevision)
        assertEquals("40214afd46cb9e657ebccf88fde2a0e1fa298751c43121c9bdc06f94fdeab9ca", target.librarySha256)
        assertEquals("lwjgl-harfbuzz-3.4.3", target.buildChainIdentity)
        assertEquals(
            "org.graphiks:kffi-harfbuzz-jvm:1.0.0-SNAPSHOT:windows-x64/libharfbuzz.dll",
            target.artifactId,
        )
    }

    @Test
    fun windowsAliasesAndCaseAreAccepted() {
        for (os in listOf("Windows 10", "windows 11", "Windows Server 2025")) {
            assertNotNull(harfBuzzNativeTargetFor(HarfBuzzPlatform(os, "x86_64")))
        }
    }

    @Test
    fun existingTargetsStillResolve() {
        assertEquals(
            "linux",
            assertNotNull(harfBuzzNativeTargetFor(HarfBuzzPlatform("Linux", "amd64"))).operatingSystem,
        )
        assertEquals(
            "macos",
            assertNotNull(harfBuzzNativeTargetFor(HarfBuzzPlatform("Mac OS X", "aarch64"))).operatingSystem,
        )
        assertNull(harfBuzzNativeTargetFor(HarfBuzzPlatform("FreeBSD", "amd64")))
    }

    @Test
    fun windowsResourceIsBundled() {
        assertNotNull(
            HarfBuzzNativeTargetTest::class.java
                .getResourceAsStream("/kffi/harfbuzz/windows/x64/libharfbuzz.dll"),
            "The Windows HarfBuzz binary must be packaged as a JVM resource.",
        )
    }
}
