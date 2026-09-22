package org.graphiks.kffi.harfbuzz

/** The HarfBuzz version this binding is built against. */
internal const val HARFBUZZ_VERSION: String = "14.3.0"

/** The upstream HarfBuzz source revision the embedded archive was compiled from. */
internal const val HARFBUZZ_IOS_SOURCE_REVISION: String = "4c2aa804671d7276e8a0eb95da07202ead05c843"

/** The normalized operating system reported for every iOS slice. */
internal const val HARFBUZZ_IOS_OPERATING_SYSTEM: String = "ios"

/** The normalized architecture reported for every iOS slice. Apple Silicon only. */
internal const val HARFBUZZ_IOS_ARCHITECTURE: String = "arm64"

/**
 * The SDK label of the embedded archive for the current slice.
 *
 * Generated at build time from the staged slice path the digest task already resolves: `iphoneos`
 * for the device slice, `iphonesimulator` for the simulator slice. It is what makes
 * [HARFBUZZ_IOS_BUILD_CHAIN] name the SDK the slice actually links against.
 */
internal expect val iosHarfBuzzIosSdkName: String

/**
 * The toolchain identity of the embedded static archive.
 *
 * This is hand-maintained from the A2 `NOTICE.md`, matching the Android build-chain convention:
 * Xcode 26.6 (17F113), CMake 4.4.3, Apple clang 21.0.0, the per-slice iOS SDK 26.5
 * ([iosHarfBuzzIosSdkName]) and a deployment target of 15.0. Unlike the archive digest — which is
 * generated at build time from the staged `libharfbuzz.a` and therefore always describes the
 * embedded archive — this string is not derived from the build: it must be updated by hand when the
 * `:kffi-harfbuzz-ios-native` toolchain changes, and on a different toolchain it can diverge from
 * the digest of the archive actually linked.
 */
internal val HARFBUZZ_IOS_BUILD_CHAIN: String
    get() = "cmake-4.4.3;xcode-26.6;appleclang-21.0.0;$iosHarfBuzzIosSdkName-sdk-26.5;deployment-target-15.0"

/**
 * The Maven coordinate of the embedded archive for the current slice.
 *
 * Provided as a generated `actual` for each iOS target from the staged archive's slice name.
 */
internal expect val iosHarfBuzzArtifactId: String

/**
 * The SHA-256 of the embedded archive for the current slice, generated at build time from the
 * staged `libharfbuzz.a` so it can never drift from the archive the slice actually links.
 */
internal expect val iosHarfBuzzArtifactSha256: String

/** Builds the published identity of the iOS binding over the [engineVersion] the library reports. */
internal fun harfBuzzBindingIdentity(engineVersion: String): HarfBuzzBindingIdentity =
    HarfBuzzBindingIdentity(
        operatingSystem = HARFBUZZ_IOS_OPERATING_SYSTEM,
        architecture = HARFBUZZ_IOS_ARCHITECTURE,
        artifactId = iosHarfBuzzArtifactId,
        artifactSha256 = iosHarfBuzzArtifactSha256,
        upstreamSourceRevision = HARFBUZZ_IOS_SOURCE_REVISION,
        buildChainIdentity = HARFBUZZ_IOS_BUILD_CHAIN,
        engineVersion = engineVersion,
    )
