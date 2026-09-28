import java.security.MessageDigest
import javax.inject.Inject
import org.gradle.process.ExecOperations

plugins {
    // Intentionally plugin-less: this module only drives an Emscripten cross-build
    // of the pinned HarfBuzz revision into one WebAssembly module plus its JS glue.
    // It produces no JVM/Android/Kotlin artifact of its own.
}

// ---------------------------------------------------------------------------
// The pinned upstream revision, kept in lockstep with the iOS and Android native
// modules (kffi-harfbuzz-ios-native, kffi-harfbuzz-android-native).
// ---------------------------------------------------------------------------
val harfBuzzRevision = "4c2aa804671d7276e8a0eb95da07202ead05c843"
val harfBuzzVersion = "14.3.0"

val sourceRoot = layout.buildDirectory.dir("harfbuzz-src")
val outputRoot = layout.buildDirectory.dir("harfbuzz/wasm")

/**
 * Fetches the pinned HarfBuzz revision into the build directory.
 *
 * The git commands run through [ExecOperations] rather than a shell: on a Windows
 * runner `bash` is the WSL launcher, which has no distribution installed, so a
 * `bash -c` script would fail there.
 */
abstract class FetchHarfBuzzSourceTask @Inject constructor(
    private val execOperations: ExecOperations,
) : DefaultTask() {
    @get:Input
    abstract val revision: Property<String>

    @get:Internal
    abstract val sourceDirectory: DirectoryProperty

    @get:OutputFile
    abstract val marker: RegularFileProperty

    @TaskAction
    fun fetch() {
        val directory = sourceDirectory.get().asFile.apply { mkdirs() }
        val markerFile = marker.get().asFile
        if (markerFile.isFile && markerFile.readText().trim() == revision.get()) return
        if (!File(directory, ".git").isDirectory) {
            exec { commandLine("git", "init", "--quiet") }
            exec { commandLine("git", "remote", "add", "origin", "https://github.com/harfbuzz/harfbuzz.git") }
        }
        exec { commandLine("git", "fetch", "--quiet", "--depth", "1", "origin", revision.get()) }
        exec { commandLine("git", "checkout", "--quiet", "--detach", "FETCH_HEAD") }
        markerFile.writeText(revision.get())
    }

    private fun exec(configure: org.gradle.process.ExecSpec.() -> Unit) {
        execOperations.exec {
            workingDir = sourceDirectory.get().asFile
            configure()
        }
    }
}

val fetchHarfBuzzWasmSource by tasks.registering(FetchHarfBuzzSourceTask::class) {
    group = "harfbuzz"
    description = "Fetches the pinned HarfBuzz revision for the WebAssembly build."
    revision.set(harfBuzzRevision)
    sourceDirectory.set(sourceRoot)
    marker.set(sourceRoot.map { it.file(".revision") })
}

/**
 * Compiles the pinned HarfBuzz core into one WebAssembly module.
 *
 * `SINGLE_FILE=1` embeds the `.wasm` as base64 inside the emitted `hb.mjs`, so the
 * binding publishes a single self-contained glue file with no asset resolution for
 * either Kotlin/JS or Kotlin/Wasm. `MODULARIZE` + `EXPORT_ES6` give an ES module
 * whose default export is an async factory — the async instantiation the web
 * binding surfaces through an explicit initializer.
 *
 * The compiler is resolved from `KFFI_EMXX` when set: on CI the Emscripten
 * toolchain must stay off `PATH`, because its `cmake` directory would otherwise
 * shadow the Xcode `cmake` the iOS native module invokes.
 */
val emscriptenCompiler = System.getenv("KFFI_EMXX")?.takeIf { it.isNotBlank() } ?: "em++"

val buildHarfBuzzWasm by tasks.registering(Exec::class) {
    group = "harfbuzz"
    description = "Compiles HarfBuzz into one WebAssembly module with its JS glue."
    dependsOn(fetchHarfBuzzWasmSource)
    val src = sourceRoot.get().asFile
    val out = outputRoot.get().asFile
    val exportsFile = layout.projectDirectory.file("src/main/js/hb-exports.json").asFile
    inputs.file(exportsFile)
    inputs.files(
        fileTree(src.resolve("src")) { include("**/*.cc", "**/*.hh", "**/*.h") },
    ).withPropertyName("harfbuzzSources")
    outputs.file(out.resolve("hb.mjs"))
    doFirst { out.mkdirs() }
    commandLine(
        emscriptenCompiler,
        "-std=c++17", "-O3", "-fno-exceptions", "-fno-rtti", "-DHB_NO_MT",
        "-I", src.resolve("src").absolutePath,
        src.resolve("src/harfbuzz.cc").absolutePath,
        "-o", out.resolve("hb.mjs").absolutePath,
        "-sMODULARIZE=1", "-sEXPORT_ES6=1", "-sENVIRONMENT=node,web",
        "-sALLOW_MEMORY_GROWTH=1", "-sSINGLE_FILE=1", "-sNO_EXIT_RUNTIME=1",
        "-sEXPORTED_FUNCTIONS=@" + exportsFile.absolutePath,
        "-sEXPORTED_RUNTIME_METHODS=ccall,cwrap,HEAPU8,HEAPU32,HEAP32,HEAPF32",
    )
}

/**
 * Emits the binding manifest the Kotlin web actual reads for its `bindingIdentity`:
 * the pinned upstream revision, the reported version, and the SHA-256 of the glue
 * actually linked, so the identity can never drift from the embedded module.
 */
val harfBuzzWasmManifest by tasks.registering {
    group = "harfbuzz"
    description = "Writes the WebAssembly HarfBuzz binding manifest (revision, version, sha256)."
    dependsOn(buildHarfBuzzWasm)
    val glue = outputRoot.get().asFile.resolve("hb.mjs")
    val manifest = outputRoot.get().asFile.resolve("manifest.properties")
    inputs.file(glue)
    outputs.file(manifest)
    doLast {
        val digest = MessageDigest.getInstance("SHA-256")
            .digest(glue.readBytes())
            .joinToString(separator = "") { byte -> "%02x".format(byte) }
        manifest.writeText(
            buildString {
                appendLine("revision=$harfBuzzRevision")
                appendLine("version=$harfBuzzVersion")
                appendLine("glueSha256=$digest")
            },
        )
    }
}

tasks.register("buildHarfBuzzWasmAll") {
    group = "harfbuzz"
    description = "Builds the WebAssembly HarfBuzz module and its binding manifest."
    dependsOn(harfBuzzWasmManifest)
}

extra["kffi.harfbuzz.wasm.glue"] = outputRoot.map { it.file("hb.mjs") }
extra["kffi.harfbuzz.wasm.manifest"] = outputRoot.map { it.file("manifest.properties") }
extra["kffi.harfbuzz.wasm.buildTask"] = "buildHarfBuzzWasmAll"
