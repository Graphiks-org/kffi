import org.gradle.api.tasks.Exec

plugins {
    // Intentionally plugin-less: this module only drives an Xcode/CMake cross-build
    // of the pinned HarfBuzz revision into a static archive per iOS slice.
    // It produces no JVM/Android/Kotlin artifact of its own.
}

// ---------------------------------------------------------------------------
// Conventions exposed to consumers (the kffi-harfbuzz iOS cinterop in A3)
// ---------------------------------------------------------------------------
// Well-known paths under this module's build directory:
//   build/harfbuzz/<sdk>/lib/libharfbuzz.a      static archive for that slice
//   build/harfbuzz/<sdk>/include/harfbuzz       HarfBuzz public headers
// where <sdk> is one of: iphoneos, iphonesimulator.
//
// The same locations are mirrored as Gradle extra properties so a sibling
// project can consume them without hardcoding task internals:
//   kffi.harfbuzz.ios.device.library          Provider<RegularFile>
//   kffi.harfbuzz.ios.simulator.library       Provider<RegularFile>
//   kffi.harfbuzz.ios.device.includeDir       Provider<Directory>
//   kffi.harfbuzz.ios.simulator.includeDir    Provider<Directory>
//   kffi.harfbuzz.ios.buildTask               String (aggregate task name)
//   kffi.harfbuzz.ios.device.finalizeTask     String (per-slice last task)
//   kffi.harfbuzz.ios.simulator.finalizeTask  String

val cppSourceDir = layout.projectDirectory.dir("src/main/cpp")
val cmakeLists = cppSourceDir.file("CMakeLists.txt")

// Apple Silicon only: one archive per slice, never lipo'd into a fat binary.
val iosSlices = listOf(
    "Device" to "iphoneos",
    "Simulator" to "iphonesimulator",
)

val sealTaskNames = iosSlices.map { (suffix, sdk) ->
    val buildRoot = layout.buildDirectory.dir("cmake/$sdk").get().asFile
    val stageRoot = layout.buildDirectory.dir("harfbuzz/$sdk").get().asFile

    val configure = tasks.register<Exec>("configureHarfBuzzIos$suffix") {
        group = "harfbuzz"
        description = "Configures the static HarfBuzz build for iOS ($sdk)."
        inputs.file(cmakeLists)
        outputs.file(File(buildRoot, "CMakeCache.txt"))
        commandLine(
            "xcrun", "cmake",
            "-S", cppSourceDir.asFile.absolutePath,
            "-B", buildRoot.absolutePath,
            "-G", "Unix Makefiles",
            "-DCMAKE_SYSTEM_NAME=iOS",
            "-DCMAKE_OSX_ARCHITECTURES=arm64",
            "-DCMAKE_OSX_SYSROOT=$sdk",
            "-DCMAKE_OSX_DEPLOYMENT_TARGET=15.0",
            "-DCMAKE_BUILD_TYPE=Release",
            "-DCMAKE_INSTALL_PREFIX=${stageRoot.absolutePath}",
        )
    }

    val build = tasks.register<Exec>("buildHarfBuzzIos$suffix") {
        group = "harfbuzz"
        description = "Compiles and archives static HarfBuzz for iOS ($sdk)."
        dependsOn(configure)
        commandLine(
            "xcrun", "cmake", "--build", buildRoot.absolutePath,
            "--target", "harfbuzz", "--config", "Release",
        )
    }

    val install = tasks.register<Exec>("installHarfBuzzIos$suffix") {
        group = "harfbuzz"
        description = "Stages libharfbuzz.a + headers under build/harfbuzz/$sdk."
        dependsOn(build)
        // Always restage so the staged archive can never lag the build tree.
        outputs.upToDateWhen { false }
        commandLine("xcrun", "cmake", "--install", buildRoot.absolutePath)
    }

    // CMake archives with `ar qc` then `ranlib`; `ranlib` stamps the __.SYMDEF
    // index with the wall-clock time, so two byte-identical builds would hash
    // differently. Re-run ranlib with ZERO_AR_DATE set (via `env` argv, which is
    // independent of Gradle's inherited environment) to zero that stamp. This is
    // what makes the digests A7 pins reproducible.
    tasks.register<Exec>("sealHarfBuzzIos$suffix") {
        group = "harfbuzz"
        description = "Zeroes the staged archive index timestamp for a reproducible SHA-256."
        dependsOn(install)
        outputs.upToDateWhen { false }
        commandLine(
            "env", "ZERO_AR_DATE=1", "/usr/bin/ranlib",
            File(stageRoot, "lib/libharfbuzz.a").absolutePath,
        )
    }.name
}

tasks.register("buildHarfBuzzIos") {
    group = "harfbuzz"
    description = "Builds, stages and seals static HarfBuzz for iOS device + simulator."
    dependsOn(sealTaskNames)
}

extra["kffi.harfbuzz.ios.device.library"] =
    layout.buildDirectory.file("harfbuzz/iphoneos/lib/libharfbuzz.a")
extra["kffi.harfbuzz.ios.simulator.library"] =
    layout.buildDirectory.file("harfbuzz/iphonesimulator/lib/libharfbuzz.a")
extra["kffi.harfbuzz.ios.device.includeDir"] =
    layout.buildDirectory.dir("harfbuzz/iphoneos/include/harfbuzz")
extra["kffi.harfbuzz.ios.simulator.includeDir"] =
    layout.buildDirectory.dir("harfbuzz/iphonesimulator/include/harfbuzz")
extra["kffi.harfbuzz.ios.buildTask"] = "buildHarfBuzzIos"
extra["kffi.harfbuzz.ios.device.finalizeTask"] = "sealHarfBuzzIosDevice"
extra["kffi.harfbuzz.ios.simulator.finalizeTask"] = "sealHarfBuzzIosSimulator"
