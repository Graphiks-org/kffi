import java.security.MessageDigest

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
val sourceDir = sourceRoot.get().asFile.also { it.mkdirs() }

/**
 * Fetches the pinned HarfBuzz revision into the build directory. The whole fetch is
 * one shell invocation so the working directory exists before git is called.
 */
val fetchHarfBuzzWasmSource by tasks.registering(Exec::class) {
    group = "harfbuzz"
    description = "Fetches the pinned HarfBuzz revision for the WebAssembly build."
    workingDir = sourceDir
    val marker = sourceDir.resolve(".revision")
    outputs.file(marker)
    outputs.upToDateWhen { marker.isFile && marker.readText() == harfBuzzRevision }
    commandLine(
        "bash", "-c",
        """
        set -euo pipefail
        if [ ! -d .git ]; then
          git init --quiet
          git remote add origin https://github.com/harfbuzz/harfbuzz.git
        fi
        git fetch --quiet --depth 1 origin $harfBuzzRevision
        git checkout --quiet --detach FETCH_HEAD
        printf '%s' '$harfBuzzRevision' > .revision
        """.trimIndent(),
    )
}

/**
 * Compiles the pinned HarfBuzz core into one WebAssembly module.
 *
 * `SINGLE_FILE=1` embeds the `.wasm` as base64 inside the emitted `hb.mjs`, so the
 * binding publishes a single self-contained glue file with no asset resolution for
 * either Kotlin/JS or Kotlin/Wasm. `MODULARIZE` + `EXPORT_ES6` give an ES module
 * whose default export is an async factory — the async instantiation the web
 * binding surfaces through an explicit initializer.
 */
val buildHarfBuzzWasm by tasks.registering(Exec::class) {
    group = "harfbuzz"
    description = "Compiles HarfBuzz into one WebAssembly module with its JS glue."
    dependsOn(fetchHarfBuzzWasmSource)
    val src = sourceDir
    val out = outputRoot.get().asFile
    val exportsFile = layout.projectDirectory.file("src/main/js/hb-exports.json").asFile
    inputs.file(exportsFile)
    inputs.files(
        fileTree(src.resolve("src")) { include("**/*.cc", "**/*.hh", "**/*.h") },
    ).withPropertyName("harfbuzzSources")
    outputs.file(out.resolve("hb.mjs"))
    doFirst { out.mkdirs() }
    commandLine(
        "em++",
        "-std=c++17", "-O3", "-fno-exceptions", "-fno-rtti", "-DHB_NO_MT",
        "-I", src.resolve("src").absolutePath,
        src.resolve("src/harfbuzz.cc").absolutePath,
        "-o", out.resolve("hb.mjs").absolutePath,
        "-sMODULARIZE=1", "-sEXPORT_ES6=1", "-sENVIRONMENT=node,web",
        "-sALLOW_MEMORY_GROWTH=1", "-sSINGLE_FILE=1", "-sNO_EXIT_RUNTIME=1",
        "-sEXPORTED_FUNCTIONS=@" + exportsFile.absolutePath,
        "-sEXPORTED_RUNTIME_METHODS=ccall,cwrap,HEAPU8,HEAPU32,HEAP32",
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
