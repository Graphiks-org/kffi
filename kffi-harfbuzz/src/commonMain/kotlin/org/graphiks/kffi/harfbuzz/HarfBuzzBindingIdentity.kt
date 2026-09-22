package org.graphiks.kffi.harfbuzz

/**
 * The published identity of the bundled HarfBuzz binding for the current platform.
 *
 * @property operatingSystem the normalized operating system (`macos`, `linux`, `android`, `ios`).
 * @property architecture the normalized architecture (`x64`, `arm64`).
 * @property artifactId the publication coordinate of the embedded artifact.
 * @property artifactSha256 the SHA-256 of the embedded native library. On the JVM this is the
 * verified digest of the bundled resource; on Android it is *observed at runtime* from whichever
 * form of the library the linker mapped (extracted file or APK entry), and is the empty string when
 * that packaging does not expose the bytes; on iOS it is a build-time generated constant describing
 * the embedded static archive. A consumer that needs a trustworthy digest must treat an
 * empty value as "not observable", not as a mismatch.
 * @property upstreamSourceRevision the upstream HarfBuzz source revision the binary was built from.
 * @property buildChainIdentity the toolchain identity of the binary build.
 * @property engineVersion the HarfBuzz version the library reports.
 */
public data class HarfBuzzBindingIdentity(
    val operatingSystem: String,
    val architecture: String,
    val artifactId: String,
    val artifactSha256: String,
    val upstreamSourceRevision: String,
    val buildChainIdentity: String,
    val engineVersion: String,
)
