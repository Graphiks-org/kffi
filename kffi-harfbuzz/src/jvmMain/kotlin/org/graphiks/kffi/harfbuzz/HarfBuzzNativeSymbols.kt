package org.graphiks.kffi.harfbuzz

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.security.MessageDigest

/** The HarfBuzz version this binding is built against. */
internal const val HARFBUZZ_VERSION: String = "14.3.0"

/** The published kffi-harfbuzz version, mirrored from the module version. */
internal const val KFFI_HARFBUZZ_VERSION: String = "1.0.0-SNAPSHOT"

/**
 * The runtime platform as reported by the JVM, used to select the bundled HarfBuzz binary.
 *
 * [osName] and [architecture] are raw system property values; matching is case-insensitive
 * and delegated to [harfBuzzNativeTargetFor].
 */
internal data class HarfBuzzPlatform(val osName: String, val architecture: String) {
    companion object {
        /** Reads the platform from `os.name`/`os.arch`, defaulting to empty strings when absent. */
        fun detect(): HarfBuzzPlatform = HarfBuzzPlatform(
            System.getProperty("os.name").orEmpty(),
            System.getProperty("os.arch").orEmpty(),
        )
    }
}

/**
 * A bundled HarfBuzz binary and the provenance needed to verify and describe it.
 *
 * @property operatingSystem normalized OS (`linux`, `macos`).
 * @property architecture normalized architecture (`x64`, `arm64`).
 * @property resourcePath classpath resource location of the binary inside the artifact.
 * @property fileName file name used when materializing the binary on disk.
 * @property nativeSourceRevision upstream HarfBuzz source revision the binary was built from.
 * @property librarySha256 expected SHA-256 of the binary, verified before load.
 * @property buildChainIdentity toolchain identity of the binary build.
 */
internal data class HarfBuzzNativeTarget(
    val operatingSystem: String,
    val architecture: String,
    val resourcePath: String,
    val fileName: String,
    val nativeSourceRevision: String,
    val librarySha256: String,
    val buildChainIdentity: String,
) {
    /** The Maven coordinate and classifier under which this embedded artifact is published. */
    val artifactId: String
        get() = "org.graphiks:kffi-harfbuzz-jvm:$KFFI_HARFBUZZ_VERSION:$operatingSystem-$architecture/$fileName"
}

/**
 * Resolves the bundled binary for [platform], accepting the common aliases for OS and
 * architecture (`amd64`/`x86_64`, `aarch64`/`arm64`, `mac os x`).
 *
 * Returns `null` for any unsupported or unrecognized combination.
 */
internal fun harfBuzzNativeTargetFor(platform: HarfBuzzPlatform): HarfBuzzNativeTarget? = when (
    platform.osName.lowercase() to platform.architecture.lowercase()
) {
    "linux" to "amd64", "linux" to "x86_64" -> HarfBuzzNativeTarget(
        "linux", "x64",
        "/kffi/harfbuzz/linux/x64/libharfbuzz.so", "libharfbuzz.so",
        "9f2f03173b7fee860cc00d999857d09fa4a362e2",
        "9a5e3576912c2f8c8b2533d4a264fec1eac9667adfd64f7e71e80179ba118614",
        "lwjgl-harfbuzz-3.4.3",
    )
    "linux" to "aarch64", "linux" to "arm64" -> HarfBuzzNativeTarget(
        "linux", "arm64",
        "/kffi/harfbuzz/linux/arm64/libharfbuzz.so", "libharfbuzz.so",
        "9f2f03173b7fee860cc00d999857d09fa4a362e2",
        "b1c7c67034297763e0ce46f3749c4da33a4bb4064929868446cb5a3d81dc26bc",
        "lwjgl-harfbuzz-3.4.3",
    )
    "mac os x" to "x86_64", "mac os x" to "amd64" -> HarfBuzzNativeTarget(
        "macos", "x64",
        "/kffi/harfbuzz/macos/x64/libharfbuzz.dylib", "libharfbuzz.dylib",
        "4c2aa804671d7276e8a0eb95da07202ead05c843",
        "9d1ee85a217d781f91c00627248c8f9611058796f49aaf146dc88c1a1439776c",
        "cmake-4.4.3;appleclang-21.0.0;macos-sdk-26.5;deployment-target-11.0",
    )
    "mac os x" to "aarch64", "mac os x" to "arm64" -> HarfBuzzNativeTarget(
        "macos", "arm64",
        "/kffi/harfbuzz/macos/arm64/libharfbuzz.dylib", "libharfbuzz.dylib",
        "4c2aa804671d7276e8a0eb95da07202ead05c843",
        "504948a7301dc70b1bf9c2f8dc02171c7b7bf35b14d4d5590a8af2a813d73e22",
        "cmake-4.4.3;appleclang-21.0.0;macos-sdk-26.5;deployment-target-11.0",
    )
    else -> null
}

/**
 * Loads, verifies and materializes the bundled HarfBuzz library, then resolves its symbols.
 *
 * The library [scope] intentionally remains alive for the process lifetime (it is never closed on
 * success), mirroring `AppleNativeSymbols`: downcall handles resolved from it stay valid.
 */
internal class HarfBuzzNativeLoader private constructor(
    val target: HarfBuzzNativeTarget,
    private val scope: Arena,
    private val lookup: SymbolLookup,
) {
    private val linker: Linker = Linker.nativeLinker()

    /** Resolves the named HarfBuzz symbol to a downcall handle using [descriptor]. */
    fun handle(name: String, descriptor: FunctionDescriptor): MethodHandle =
        linker.downcallHandle(
            lookup.find(name).orElseThrow { symbolFailure(name) },
            descriptor,
        )

    /** The version string reported by `hb_version_string`, resolved once and cached. */
    fun versionString(): String = reportedVersion

    private val reportedVersion: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        address(handle("hb_version_string", FunctionDescriptor.of(ValueLayout.ADDRESS)))
            .reinterpret(MAX_VERSION_BYTES).getString(0)
    }

    val identity: HarfBuzzBindingIdentity by lazy {
        HarfBuzzBindingIdentity(
            operatingSystem = target.operatingSystem,
            architecture = target.architecture,
            artifactId = target.artifactId,
            artifactSha256 = target.librarySha256,
            upstreamSourceRevision = target.nativeSourceRevision,
            buildChainIdentity = target.buildChainIdentity,
            engineVersion = versionString(),
        )
    }

    private fun symbolFailure(name: String) = HarfBuzzBindingException(
        HarfBuzzBindingFailure.SYMBOL_RESOLUTION, "Unable to resolve HarfBuzz symbol: $name",
    )

    companion object {
        private val cache: MutableMap<HarfBuzzPlatform, HarfBuzzNativeLoader> = mutableMapOf()

        /**
         * Returns the shared loader for [platform], loading it once on first use.
         *
         * The same loader — and therefore the same loaded library scope and symbol handles — is
         * reused for the process lifetime. Failures are not cached, so a later call retries.
         */
        fun load(platform: HarfBuzzPlatform = HarfBuzzPlatform.detect()): HarfBuzzNativeLoader =
            synchronized(cache) { cache.getOrPut(platform) { loadUncached(platform) } }

        private fun loadUncached(platform: HarfBuzzPlatform): HarfBuzzNativeLoader {
            if (ValueLayout.ADDRESS.byteSize() != 8L) throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.UNSUPPORTED_PLATFORM,
                "HarfBuzz bindings require 64-bit pointers.",
            )
            val target = harfBuzzNativeTargetFor(platform) ?: throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.UNSUPPORTED_PLATFORM,
                "HarfBuzz bindings support only Linux or macOS on x64 or arm64; received " +
                    "${platform.osName}/${platform.architecture}.",
            )
            val bytes = HarfBuzzNativeLoader::class.java.getResourceAsStream(target.resourcePath)
                ?.use { it.readBytes() }
                ?: throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.RESOURCE_MISSING,
                    "The bundled HarfBuzz resource ${target.resourcePath} is missing.",
                )
            if (bytes.sha256Hex() != target.librarySha256) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.RESOURCE_CORRUPT,
                    "The bundled HarfBuzz resource failed its SHA-256 verification.",
                )
            }
            val path = try {
                materialize(target, bytes)
            } catch (error: HarfBuzzBindingException) {
                throw error
            } catch (error: Throwable) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.LIBRARY_LOAD,
                    "The bundled HarfBuzz library could not be materialized: " +
                        (error.message ?: error::class.simpleName),
                    error,
                )
            }
            val scope = Arena.ofShared()
            val lookup = try {
                SymbolLookup.libraryLookup(path, scope)
            } catch (error: Throwable) {
                scope.close()
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.LIBRARY_LOAD,
                    "The bundled HarfBuzz library could not be loaded: " +
                        (error.message ?: error::class.simpleName),
                    error,
                )
            }
            val loader = HarfBuzzNativeLoader(target, scope, lookup)
            val reported = try {
                loader.versionString()
            } catch (error: Throwable) {
                scope.close()
                throw if (error is HarfBuzzBindingException) error else HarfBuzzBindingException(
                    HarfBuzzBindingFailure.LIBRARY_LOAD,
                    "The bundled HarfBuzz library could not be initialised: " +
                        (error.message ?: error::class.simpleName),
                    error,
                )
            }
            if (reported != HARFBUZZ_VERSION) {
                scope.close()
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.VERSION_MISMATCH,
                    "The loaded HarfBuzz library reports $reported, expected $HARFBUZZ_VERSION.",
                )
            }
            return loader
        }

        private fun materialize(target: HarfBuzzNativeTarget, bytes: ByteArray): Path {
            val directory = Path.of(System.getProperty("java.io.tmpdir"), "kffi-harfbuzz", target.librarySha256)
            Files.createDirectories(directory)
            val destination = directory.resolve(target.fileName)
            if (Files.isRegularFile(destination) && Files.readAllBytes(destination).sha256Hex() == target.librarySha256) {
                return destination
            }
            val temporary = Files.createTempFile(directory, "libharfbuzz-", ".part")
            try {
                Files.write(temporary, bytes)
                try {
                    Files.move(temporary, destination, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING)
                } catch (_: AtomicMoveNotSupportedException) {
                    Files.move(temporary, destination, StandardCopyOption.REPLACE_EXISTING)
                }
            } finally {
                Files.deleteIfExists(temporary)
            }
            val extracted = Files.readAllBytes(destination)
            if (extracted.sha256Hex() != target.librarySha256) throw HarfBuzzBindingException(
                HarfBuzzBindingFailure.RESOURCE_CORRUPT,
                "The extracted HarfBuzz library did not preserve its verified digest.",
            )
            return destination
        }
    }
}

/** Invokes a downcall [handle] and narrows its result to a native address. */
internal fun address(handle: MethodHandle, vararg arguments: Any?): MemorySegment =
    handle.invokeWithArguments(*arguments) as MemorySegment

/** Lowercase hexadecimal SHA-256 digest of this byte array. */
internal fun ByteArray.sha256Hex(): String = MessageDigest.getInstance("SHA-256")
    .digest(this)
    .joinToString(separator = "") { byte -> "%02x".format(byte) }

/** Upper bound, in bytes, for the NUL-terminated `hb_version_string` result buffer. */
internal const val MAX_VERSION_BYTES: Long = 32L
