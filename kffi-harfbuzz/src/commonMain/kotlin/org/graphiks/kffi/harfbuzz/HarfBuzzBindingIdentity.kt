package org.graphiks.kffi.harfbuzz

/**
 * The published identity of the bundled HarfBuzz binding for the current platform.
 *
 * @property operatingSystem the normalized operating system (`macos`, `linux`).
 * @property architecture the normalized architecture (`x64`, `arm64`).
 * @property artifactId the publication coordinate of the embedded artifact.
 * @property artifactSha256 the SHA-256 of the embedded native library.
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
