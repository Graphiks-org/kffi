package org.graphiks.kffi.harfbuzz

import android.os.Build
import java.io.File
import java.security.MessageDigest
import java.util.zip.ZipFile
import org.graphiks.kffi.engine.NativeEngine

/** The HarfBuzz version this binding is built against. */
internal const val HARFBUZZ_VERSION: String = "14.3.0"

/**
 * The published kffi-harfbuzz version.
 *
 * This constant is hand-mirrored from the Gradle project version and may drift under
 * `-PreleaseVersion`; it only feeds the diagnostic `artifactId`, never library selection.
 */
internal const val KFFI_HARFBUZZ_VERSION: String = "1.0.0-SNAPSHOT"

/** The from-source HarfBuzz revision the bundled Android binaries were built from. */
internal const val ANDROID_HARFBUZZ_SOURCE_REVISION: String = "4c2aa804671d7276e8a0eb95da07202ead05c843"

/** The toolchain identity of the bundled Android binaries, mirroring the native module NOTICE. */
internal const val ANDROID_HARFBUZZ_BUILD_CHAIN: String =
    "ndk-30.0.15729638;cmake-3.22.1;clang-21.0.0;agp-9.0.0;gradle-9.7.0"

/** The bare HarfBuzz library name, resolved to a platform file name through [System.mapLibraryName]. */
internal const val HARFBUZZ_LIBRARY_NAME: String = "harfbuzz"

/** The Android ABI suffixes the bundled native module publishes. */
private const val ABI_ARM64_V8A: String = "arm64-v8a"
private const val ABI_X86_64: String = "x86_64"

/**
 * Loads the bundled Android HarfBuzz library and resolves its symbols through the kffi JNI engine.
 *
 * The library is `dlopen`ed with the engine, which keeps it resident for the process lifetime, so
 * the handle and symbol addresses stay valid. The identity digest is *observed at runtime* from
 * whichever form of the library the linker mapped — the extracted `libharfbuzz.so` under
 * `nativeLibraryDir` (legacy packaging) or the `lib/<abi>/libharfbuzz.so` entry inside the APK
 * (`extractNativeLibs=false`) — and is never a hardcoded build-machine constant, because the
 * packaged `BuildID` depends on the build directory and toolchain paths. When neither form is
 * observable the digest is empty rather than fatal, so `HarfBuzz.open()` and `bindingIdentity`
 * always succeed once the library is loaded.
 */
internal class HarfBuzzAndroidLoader private constructor(
    val operations: HarfBuzzOperations,
    private val libraryFileName: String,
) {
    /** The version string reported by `hb_version_string`. */
    fun versionString(): String = operations.versionString()

    /** The published identity of the loaded binding. */
    val identity: HarfBuzzBindingIdentity by lazy {
        val abi = primaryAbi()
        HarfBuzzBindingIdentity(
            operatingSystem = "android",
            architecture = normalizedArchitecture(abi),
            artifactId = "org.graphiks:kffi-harfbuzz-android:$KFFI_HARFBUZZ_VERSION:$abi/$libraryFileName",
            artifactSha256 = observedLibrarySha256(libraryFileName),
            upstreamSourceRevision = ANDROID_HARFBUZZ_SOURCE_REVISION,
            buildChainIdentity = ANDROID_HARFBUZZ_BUILD_CHAIN,
            engineVersion = versionString(),
        )
    }

    companion object {
        @Volatile
        private var cached: HarfBuzzAndroidLoader? = null
        private val lock: Any = Any()

        /**
         * Returns the shared loader, loading the bundled library once on first use.
         *
         * The same dlopen handle and symbol addresses are reused for the process lifetime. Failures
         * are not cached, so a later call retries.
         */
        fun load(): HarfBuzzAndroidLoader = synchronized(lock) {
            cached ?: loadUncached().also { cached = it }
        }

        private fun loadUncached(): HarfBuzzAndroidLoader {
            val fileName = System.mapLibraryName(HARFBUZZ_LIBRARY_NAME)
            var lastFailure: Throwable? = null
            // The engine keeps the library resident once loaded; bare-name dlopen resolves through
            // the app namespace (extracted or APK-internal). The absolute path is a fallback for
            // legacy packaging, where the extracted file is reachable.
            var handle = tryLoad(fileName) { lastFailure = it }
            if (handle == 0L) {
                val directory = nativeLibraryDirectory()
                if (directory != null) {
                    handle = tryLoad("$directory/$fileName") { lastFailure = it }
                }
            }
            if (handle == 0L) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.LIBRARY_LOAD,
                    "The bundled HarfBuzz library could not be loaded: ${lastFailure.describe()}",
                    lastFailure,
                )
            }
            val operations = HarfBuzzOperations(handle)
            val reported = try {
                operations.versionString()
            } catch (error: Throwable) {
                throw if (error is HarfBuzzBindingException) error else HarfBuzzBindingException(
                    HarfBuzzBindingFailure.LIBRARY_LOAD,
                    "The bundled HarfBuzz library could not be initialised: " +
                        (error.message ?: error::class.simpleName),
                    error,
                )
            }
            if (reported != HARFBUZZ_VERSION) {
                throw HarfBuzzBindingException(
                    HarfBuzzBindingFailure.VERSION_MISMATCH,
                    "The loaded HarfBuzz library reports $reported, expected $HARFBUZZ_VERSION.",
                )
            }
            return HarfBuzzAndroidLoader(operations, fileName)
        }

        private fun tryLoad(path: String, onError: (Throwable) -> Unit): Long = try {
            NativeEngine.loadNativeLibrary(path)
        } catch (error: Throwable) {
            onError(error)
            0L
        }
    }
}

/**
 * Resolves the SHA-256 of the loaded HarfBuzz library, or an empty string when the packaging hides
 * it. This is best-effort by contract: `bindingIdentity` must never fail because the digest is not
 * observable (for example `android:extractNativeLibs=false`, where the mapping belongs to the APK).
 */
private fun observedLibrarySha256(libraryFileName: String): String = try {
    val extracted = extractedLibraryFile(libraryFileName)?.let(::fileSha256)
    if (extracted != null) {
        extracted
    } else {
        val entryName = apkLibraryEntryName(libraryFileName)
        var digest: String? = null
        for (apk in mappedApks()) {
            digest = apkEntrySha256(apk, entryName)
            if (digest != null) break
        }
        digest ?: ""
    }
} catch (_: Throwable) {
    ""
}

/** The extracted `nativeLibraryDir` file when legacy packaging materialised it, else `null`. */
private fun extractedLibraryFile(libraryFileName: String): File? {
    locateMappedFile(libraryFileName)?.let { return File(it) }
    val directory = nativeLibraryDirectory() ?: return null
    return File(directory, libraryFileName)
}

/** The `lib/<abi>/<name>` entry an APK archives the loaded library under. */
private fun apkLibraryEntryName(libraryFileName: String): String = "lib/${primaryAbi()}/$libraryFileName"

/** Lowercase hexadecimal SHA-256 of [file], or `null` when it cannot be read. */
private fun fileSha256(file: File): String? = try {
    if (file.isFile) sha256Hex(file.readBytes()) else null
} catch (_: Throwable) {
    null
}

/** Lowercase hexadecimal SHA-256 of [entryName] inside [apk], or `null` when absent/unreadable. */
private fun apkEntrySha256(apk: File, entryName: String): String? = try {
    ZipFile(apk).use { zip ->
        val entry = zip.getEntry(entryName) ?: return@use null
        sha256Hex(zip.getInputStream(entry).use { it.readBytes() })
    }
} catch (_: Throwable) {
    null
}

private fun sha256Hex(bytes: ByteArray): String = MessageDigest.getInstance("SHA-256")
    .digest(bytes)
    .joinToString(separator = "") { byte -> "%02x".format(byte) }

/**
 * Finds the on-disk path of the mapped [fileName] by scanning `/proc/self/maps`.
 *
 * With legacy packaging the entry is the extracted `libharfbuzz.so`; with `extractNativeLibs=false`
 * no per-library mapping exists (the mapping belongs to the APK), so this returns `null` and the
 * APK fallback takes over.
 */
private fun locateMappedFile(fileName: String): String? = try {
    File("/proc/self/maps").useLines { lines ->
        lines.mapNotNull { line ->
            val entry = mappedEntry(line) ?: return@mapNotNull null
            if (entry == fileName || entry.endsWith("/$fileName")) entry else null
        }.firstOrNull { File(it).isFile }
    }
} catch (_: Throwable) {
    null
}

/** The existing `*.apk` containers mapped into this process, in `/proc/self/maps` order. */
private fun mappedApks(): List<File> = try {
    File("/proc/self/maps").useLines { lines ->
        lines.mapNotNull { line ->
            val entry = mappedEntry(line) ?: return@mapNotNull null
            if (entry.endsWith(".apk")) File(entry) else null
        }.filter { it.isFile }.distinct().toList()
    }
} catch (_: Throwable) {
    emptyList()
}

/** The app's extracted native library directory, derived from the resident engine library. */
private fun nativeLibraryDirectory(): String? =
    locateMappedFile(System.mapLibraryName("kffi"))?.let { File(it).parent }

/** The file path of a `/proc/self/maps` line, or `null` for anonymous/special mappings. */
private fun mappedEntry(line: String): String? {
    val separator = line.lastIndexOf(' ')
    if (separator < 0) return null
    val entry = line.substring(separator + 1).removeSuffix(" (deleted)")
    if (entry.isEmpty() || entry.startsWith("[")) return null
    return entry
}

/** A human-readable description of a swallowed load failure, preserving the JNI `dlerror`. */
private fun Throwable?.describe(): String = when (this) {
    null -> "unknown error"
    else -> "${this::class.simpleName}: ${message ?: "no message"}"
}

private fun primaryAbi(): String {
    val abi = Build.SUPPORTED_ABIS.firstOrNull()
        ?: throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.UNSUPPORTED_PLATFORM,
            "The Android device reported no supported ABIs.",
        )
    if (abi != ABI_ARM64_V8A && abi != ABI_X86_64) {
        throw HarfBuzzBindingException(
            HarfBuzzBindingFailure.UNSUPPORTED_PLATFORM,
            "HarfBuzz Android bindings support only $ABI_ARM64_V8A and $ABI_X86_64; received $abi.",
        )
    }
    return abi
}

private fun normalizedArchitecture(abi: String): String = when (abi) {
    ABI_ARM64_V8A -> "arm64"
    ABI_X86_64 -> "x64"
    else -> abi
}
