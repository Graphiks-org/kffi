# CI and Gradle Stabilization Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Make every Gradle CI job provision the exact Android SDK/NDK and migrate the Android KMP modules to AGP 9 without losing the CMake-built JNI runtime or Android benchmark fixture.

**Architecture:** Keep Android KMP responsibilities in `kffi`, `kffi-benchmark-android`, and `kffi-benchmark-spi` using `com.android.kotlin.multiplatform.library`. Create `kffi-android-native` as a standalone `com.android.library` that owns the existing CMake/libffi build, runtime JNI packaging, and test-only fixture output. `kffi` consumes that module from `androidMain`, so normal KMP publication retains a resolvable transitive Android dependency.

**Tech Stack:** GitHub Actions, `android-actions/setup-android@v3`, Gradle 9.7.0, Kotlin Multiplatform 2.3.21, Android Gradle Plugin 9.0.0, Android SDK 36, NDK 30.0.15729638, CMake, Vanniktech Maven Publish.

---

## File Map

- Verify existing: `.github/actions/setup-android/action.yml`.
- Verify existing: `.github/workflows/ci.yml`.
- Verify existing: `.github/workflows/docs.yml`.
- Verify existing: `.github/workflows/kffi-benchmark-ci.yml`.
- Verify existing: `.github/workflows/kffi-test.yml`.
- Verify existing: `.github/workflows/publish.yml`.
- Create: `kffi-android-native/build.gradle.kts`, the standalone Android/CMake library.
- Move: `kffi/src/main/cpp/CMakeLists.txt` to `kffi-android-native/src/main/cpp/CMakeLists.txt`.
- Move: `kffi/src/main/cpp/libffi_glue.cmake` to `kffi-android-native/src/main/cpp/libffi_glue.cmake`.
- Move: `kffi/src/main/cpp/libffi_fficonfig.h.in` to `kffi-android-native/src/main/cpp/libffi_fficonfig.h.in`.
- Move: `kffi/src/main/cpp/kffi_engine.c` to `kffi-android-native/src/main/cpp/kffi_engine.c`.
- Move: `kffi/src/main/cpp/kffi_upcall.c` to `kffi-android-native/src/main/cpp/kffi_upcall.c`.
- Move: `kffi/src/main/cpp/kffi_upcall.h` to `kffi-android-native/src/main/cpp/kffi_upcall.h`.
- Move: `kffi/src/main/cpp/bench_engine_fixture.c` to `kffi-android-native/src/main/cpp/bench_engine_fixture.c`.
- Move: `kffi/src/androidUnitTest` to `kffi/src/androidHostTest`.
- Move: `kffi/src/androidInstrumentedTest` to `kffi/src/androidDeviceTest`.
- Move: `kffi-benchmark-android/src/androidInstrumentedTest` to `kffi-benchmark-android/src/androidDeviceTest`.
- Modify: `settings.gradle.kts`, include `kffi-android-native`.
- Modify: `kffi/build.gradle.kts`, migrate to the Android KMP plugin and depend on the native module.
- Modify: `kffi-benchmark-android/build.gradle.kts`, migrate the device-test harness and stage the fixture from the native module.
- Modify: `kffi-benchmark-spi/build.gradle.kts`, migrate its Android target to the Android KMP plugin.
- Modify: `kffi-android-native/src/main/cpp/CMakeLists.txt` only through the move and its module-local cache comment.
- Inspect: `kffi-android-native/build/outputs/aar`, `kffi/build/outputs/apk`, and `kffi-benchmark-android/build/outputs/apk`.
- Do not modify: `.github/contributing-policy.toml`, `.github/scripts/validate_pr_policy.py`, Windows struct-by-value test/runtime files, or public Kotlin APIs.

The shared Android action and workflow calls already exist in the working tree. This plan verifies them instead of recreating them. No automatic git commits are included because this repository requires explicit authorization before committing.

## Task 1: Capture the Current Baseline

**Files:** None.

- [x] **Step 1: Record the working tree without reverting user changes.**

Run:

```bash
git status --short
git diff --check
```

Expected: the existing workflow, `buildSrc`, version-catalog, `kffi`, action, spec, and plan changes remain present. Do not reset, checkout, or clean any file.

- [x] **Step 2: Confirm the temporary legacy fallback still exposes the native build.**

Run:

```bash
./gradlew :kffi:tasks --all --no-daemon --stacktrace
```

Expected: the output includes `buildCMakeDebug[arm64-v8a]`, `buildCMakeDebug[armeabi-v7a]`, `buildCMakeDebug[x86_64]`, Android host/unit-test tasks, and Android device-test tasks. The output may still contain the AGP 9/KMP compatibility warning because the migration is not yet applied.

- [x] **Step 3: Record the known JVM probe result before changing Android configuration.**

Run:

```bash
./gradlew :kffi:jvmTest --no-daemon --stacktrace
```

Expected on the current host: record the existing result, including the known exit code `133`/`SIGTRAP` if it reproduces. Do not change JVM callback code or tests to make this build probe pass.

- [x] **Step 4: Verify the shared Android action is strict and used by all intended workflows.**

Confirm `.github/actions/setup-android/action.yml` contains `sdkmanager --licenses < <(yes)` and installs exactly `platforms;android-36` and `ndk;30.0.15729638`. Confirm every Gradle job in the five workflows calls `./.github/actions/setup-android` after Java setup and before its first Gradle command.

## Task 2: Create and Verify the Standalone Native Module

**Files:**
- Create: `kffi-android-native/build.gradle.kts`.
- Move: the seven files listed in the File Map from `kffi/src/main/cpp`.
- Modify: `settings.gradle.kts`.
- Modify: `kffi-android-native/src/main/cpp/CMakeLists.txt` only for the cache comment.

- [x] **Step 1: Register the new project.**

Add this entry to `settings.gradle.kts` beside the other library modules:

```kotlin
include("kffi-android-native")
```

Keep `include("kffi")` and all benchmark includes unchanged.

- [x] **Step 2: Create the Android native library build script.**

Create `kffi-android-native/build.gradle.kts` with this configuration:

```kotlin
plugins {
    com.android.library
    id("ygdrasil.conventions.kmp-publish")
}

android {
    namespace = "org.graphiks.kffi.androidnative"
    compileSdk = 36
    ndkVersion = "30.0.15729638"

    defaultConfig {
        minSdk = 28

        externalNativeBuild {
            cmake {
                cFlags += listOf("-std=c11")
            }
        }

        ndk {
            abiFilters += setOf("arm64-v8a", "x86_64", "armeabi-v7a")
        }
    }

    externalNativeBuild {
        cmake {
            path = file("src/main/cpp/CMakeLists.txt")
        }
    }

    packaging {
        jniLibs {
            testOnly += setOf("libkffi_bench_fixture.so", "**/libkffi_bench_fixture.so")
            useLegacyPackaging = true
        }
    }
}
```

`ygdrasil.conventions.kmp-publish` must remain on this module so the Android AAR is published as `org.graphiks:kffi-android-native` with the root project's version and existing POM/signing behavior.

- [x] **Step 3: Move the CMake project without changing native symbols or targets.**

Run:

```bash
mkdir -p kffi-android-native/src/main/cpp
git mv kffi/src/main/cpp/CMakeLists.txt kffi-android-native/src/main/cpp/CMakeLists.txt
git mv kffi/src/main/cpp/libffi_glue.cmake kffi-android-native/src/main/cpp/libffi_glue.cmake
git mv kffi/src/main/cpp/libffi_fficonfig.h.in kffi-android-native/src/main/cpp/libffi_fficonfig.h.in
git mv kffi/src/main/cpp/kffi_engine.c kffi-android-native/src/main/cpp/kffi_engine.c
git mv kffi/src/main/cpp/kffi_upcall.c kffi-android-native/src/main/cpp/kffi_upcall.c
git mv kffi/src/main/cpp/kffi_upcall.h kffi-android-native/src/main/cpp/kffi_upcall.h
git mv kffi/src/main/cpp/bench_engine_fixture.c kffi-android-native/src/main/cpp/bench_engine_fixture.c
```

In the moved `CMakeLists.txt`, update only the comment that names `kffi/.gradle` to `kffi-android-native/.gradle`. Keep the relative `FETCHCONTENT_BASE_DIR` expression, `libffi` commit, `add_library(kffi_bench_fixture ...)`, `add_library(kffi ...)`, source lists, and link libraries unchanged.

- [x] **Step 4: Configure the native module before migrating consumers.**

Run:

```bash
./gradlew :kffi-android-native:tasks --all --no-daemon --stacktrace
./gradlew :kffi-android-native:assembleDebug --no-daemon --stacktrace
```

Expected: the native module configures without a Kotlin Multiplatform/Android plugin warning, CMake tasks exist for the three ABI filters, and the AAR is created.

- [x] **Step 5: Verify native AAR contents.**

Run:

```bash
unzip -Z1 kffi-android-native/build/outputs/aar/kffi-android-native-debug.aar | rg 'jni/(arm64-v8a|armeabi-v7a|x86_64)/libkffi\.so$'
```

Expected: the runtime `libkffi.so` appears for all three supported ABIs. The fixture is validated later in the device-test APK, not as a runtime file in the published `kffi` AAR.

## Task 3: Migrate the Main `kffi` Android Target

**Files:**
- Modify: `kffi/build.gradle.kts`.
- Move: `kffi/src/androidUnitTest` to `kffi/src/androidHostTest`.
- Move: `kffi/src/androidInstrumentedTest` to `kffi/src/androidDeviceTest`.
- Reference: `buildSrc/src/main/kotlin/ygdrasil/conventions/kmp-library.gradle.kts`.
- Reference: `kffi/src/androidMain/kotlin/org/graphiks/kffi/engine/NativeEngine.kt`.

- [x] **Step 1: Switch the plugin and define the Android KMP target.**

In `kffi/build.gradle.kts`, replace `com.android.library` with:

```kotlin
id("com.android.kotlin.multiplatform.library")
```

Inside `kotlin {}`, replace the legacy `androidTarget { ... }` block with:

```kotlin
android {
    namespace = "org.graphiks.kffi"
    compileSdk = 36
    minSdk = 28

    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }

    withHostTest {
    }

    withDeviceTest {
        instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}
```

Do not add `externalNativeBuild`, `ndkVersion`, `abiFilters`, or `publishLibraryVariants` to this module. Those responsibilities belong to `kffi-android-native`.

- [x] **Step 2: Preserve consumer keep rules using the new Android KMP API.**

Inside the `kotlin { android { ... } }` block, add:

```kotlin
optimization {
    consumerKeepRules.apply {
        publish = true
        file("src/main/resources/consumer-rules.pro")
    }
}
```

Remove the old `consumerProguardFiles` configuration with the legacy `android {}` block. The rule file remains unchanged; only its publication mechanism changes.

- [x] **Step 3: Remove the legacy top-level Android block.**

Delete the top-level `android { ... }` block from `kffi/build.gradle.kts`, including the old CMake path, ABI filters, test-only fixture packaging, runner, and consumer rule configuration. Keep the existing Java toolchain, JVM fixture tasks, native targets, publishing plugins, KSP, and Dokka configuration. Upgrade the KSP plugin version in `gradle/libs.versions.toml` if required; the repository's old `2.2.20-2.0.3` release casts Android KMP compilations to the legacy Android compilation type.

- [x] **Step 4: Add the native dependency to the Android source set.**

Within `kotlin { sourceSets { ... } }`, add this dependency to `androidMain`:

```kotlin
val androidMain by getting {
    dependencies {
        implementation(project(":kffi-android-native"))
    }
}
```

Keep all existing `androidMain` dependencies, if any, in the same block. This dependency must be Android-only; do not add it to `commonMain`, JVM, or native source sets.

- [x] **Step 5: Rename the Android test source sets and preserve dependencies.**

Replace `androidUnitTest` with `val androidHostTest by getting` and keep its Kotest runner dependency. Replace `androidInstrumentedTest` with `val androidDeviceTest by getting` and keep `androidx.test.ext:junit` plus `androidx.test:runner`.

Run:

```bash
git mv kffi/src/androidUnitTest kffi/src/androidHostTest
git mv kffi/src/androidInstrumentedTest kffi/src/androidDeviceTest
```

Do not change test package names or test bodies. The new plugin does not create host/device tests unless the two `with*Test` builders are present.

- [x] **Step 6: Confirm the runtime load contract remains unchanged.**

Verify `NativeEngine.kt` still calls `System.loadLibrary("kffi")` and contains no path or library-name change. The Android runtime library must now be supplied transitively by `kffi-android-native`.

Because `testOnly` JNI packaging is not propagated through a consumed AAR, add a `StageKffiBenchFixture` task in `kffi` that copies `libkffi_bench_fixture.so` from `kffi-android-native`'s `intermediates/cxx/RelWithDebInfo/**/obj/<abi>` output into `build/kffi-fixture-androidDeviceTest/<abi>`. Make the task depend on `:kffi-android-native:assembleRelease` and attach its output to the nested `androidDeviceTest` component through `KotlinMultiplatformAndroidComponentsExtension` and `addGeneratedSourceDirectory`. Keep the fixture out of the runtime AAR.

- [x] **Step 7: Verify `kffi` configuration and test task discovery.**

Run:

```bash
./gradlew :kffi:tasks --all --no-daemon --stacktrace
```

Expected: no `com.android.library` KMP compatibility warning, no `publishLibraryVariants` error, no CMake task under `kffi`, and both host-test/device-test tasks are present. The new plugin exposes `assembleAndroidHostTest` and `assembleAndroidDeviceTest`; the latter must depend on `stageKffiBenchFixture`.

## Task 4: Migrate the Benchmark Android Modules

**Files:**
- Modify: `kffi-benchmark-android/build.gradle.kts`.
- Modify: `kffi-benchmark-spi/build.gradle.kts`.
- Move: `kffi-benchmark-android/src/androidInstrumentedTest` to `kffi-benchmark-android/src/androidDeviceTest`.
- Reference: `kffi-benchmark-android/src/androidDeviceTest/kotlin/org/graphiks/kffi/benchmark/android/AndroidHarness.kt`.

- [x] **Step 1: Migrate `kffi-benchmark-spi`.**

Replace `com.android.library` with `id("com.android.kotlin.multiplatform.library")`. Replace `androidTarget { ... }` with:

```kotlin
android {
    namespace = "org.graphiks.kffi.benchmark"
    compileSdk = 36
    minSdk = 28
}
```

Keep its JVM/native targets, common source sets, Kotest dependencies, and JVM test task unchanged. This module has no device tests and must not gain CMake configuration.

- [x] **Step 2: Migrate the benchmark Android target and opt into device tests.**

Replace `com.android.library` with `id("com.android.kotlin.multiplatform.library")`. Replace the legacy Android target with:

```kotlin
android {
    namespace = "org.graphiks.kffi.benchmark"
    compileSdk = 36
    minSdk = 28

    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }

    withDeviceTest {
        instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}
```

Configure `namespace = "org.graphiks.kffi.benchmark"`, `compileSdk = 36`, and `minSdk = 28` in the Android KMP DSL used by this repository's convention plugin. Keep the existing `androidMain` dependencies on `:kffi` and `:kffi-benchmark-spi`.

- [x] **Step 3: Rename the benchmark device-test source set and preserve dependencies.**

Run:

```bash
git mv kffi-benchmark-android/src/androidInstrumentedTest kffi-benchmark-android/src/androidDeviceTest
```

Change only the Gradle source-set accessor from `androidInstrumentedTest` to `androidDeviceTest`. Keep Kotest, AndroidX runner, and AndroidX JUnit dependencies unchanged. Keep `AndroidHarness.kt` unchanged, including its `nativeLibraryDir` lookup and `libkffi_bench_fixture.so` name.

- [x] **Step 4: Keep benchmark packaging rules in the new Android KMP DSL.**

Keep the existing duplicate-resource exclusions and `useLegacyPackaging = true` directly inside the `kotlin { android { ... } }` block. The Android KMP DSL accepts the packaging configuration there; do not recreate a top-level legacy `android {}` block.

```kotlin
// inside kotlin { android { ... } }
packaging {
    resources {
        excludes += "/META-INF/{AL2.0,LGPL2.1}"
        excludes += "/META-INF/LICENSE.md"
        excludes += "/META-INF/LICENSE-notice.md"
        excludes += "/META-INF/versions/9/previous-compilation-data.bin"
    }
    jniLibs {
        useLegacyPackaging = true
    }
}
```

- [x] **Step 5: Stage the fixture from the standalone native module.**

Keep the existing `StageKffiBenchFixture` task and change only its input to:

```kotlin
fileTree(project(":kffi-android-native").layout.buildDirectory.dir("intermediates/cxx/RelWithDebInfo")) {
    include("**/obj/**/libkffi_bench_fixture.so")
}
```

Make `stageKffiBenchFixture` depend on `project(":kffi-android-native").tasks.named("assembleRelease")` so the RelWithDebInfo CMake outputs exist before staging. Keep the generated destination `build/kffi-fixture-androidDeviceTest` and the ABI directory layout unchanged. Attach that destination to the `androidDeviceTest` JNI source directory through the Android KMP variant/source API; do not write generated JNI files into `src/`.

Use the Android KMP variant API so the generated directory is attached only to the device-test APK, not the runtime AAR:

```kotlin
import com.android.build.api.variant.KotlinMultiplatformAndroidComponentsExtension

extensions.configure<KotlinMultiplatformAndroidComponentsExtension> {
    onVariants { variant ->
        variant.nestedComponents
            .filter { it.name == "androidDeviceTest" }
            .forEach { component ->
                component.sources.jniLibs?.addGeneratedSourceDirectory(stageKffiBenchFixture) {
                    it.outputDir
                }
        }
    }
}
```

- [x] **Step 6: Verify both benchmark module task graphs.**

Run:

```bash
./gradlew :kffi-benchmark-spi:tasks --all :kffi-benchmark-android:tasks --all --no-daemon --stacktrace
```

Expected: both modules configure without the legacy KMP/Android plugin warning. The Android module exposes the device-test assembly task and the staging task depends on `:kffi-android-native:assembleRelease`.

Kotlin 2.3.21 still reports its automatically created `commonTest` source set as unused in this Android-only benchmark module. No common-test sources are present; do not add a legacy hierarchy property or an explicit `dependsOn` edge solely to suppress this warning.

## Task 5: Finish Publication and Remove Compatibility Switches

**Files:**
- Modify only if required: `gradle/libs.versions.toml`, `buildSrc/build.gradle.kts`, `build.gradle.kts`.
- Verify: `kffi/build.gradle.kts`, `kffi-android-native/build.gradle.kts`.
- Do not create a tracked `gradle.properties` file.

- [x] **Step 1: Confirm the Android KMP plugin is already available.**

The repository's `buildSrc/src/main/kotlin/ygdrasil/conventions/kmp-library.gradle.kts` already applies `com.android.kotlin.multiplatform.library`, and `buildSrc` already supplies the AGP plugin dependency. Reuse that classpath. Only add a version-catalog/root plugin alias if Gradle reports that the direct module plugin ID cannot be resolved; do not add a second AGP version.

- [x] **Step 2: Remove obsolete variant publishing.**

Run:

```bash
git grep -n "publishLibraryVariants" -- '*.gradle.kts' '*.gradle'
```

Expected: no output. The new Android KMP plugin has one Android publication and must not be configured with `publishLibraryVariants("release", "debug")`.

- [x] **Step 3: Remove legacy compatibility properties only after all KMP modules migrate.**

Search tracked configuration:

```bash
git grep -n -E "android\.builtInKotlin|android\.newDsl" -- ':!docs'
```

If either property exists in a tracked configuration file, remove it only after `kffi`, `kffi-benchmark-android`, and `kffi-benchmark-spi` all use `com.android.kotlin.multiplatform.library`. No tracked `gradle.properties` currently exists, so do not create one to hold replacement values.

- [x] **Step 4: Verify publication metadata and transitive dependency.**

Run:

```bash
./gradlew :kffi-android-native:tasks --all :kffi:tasks --all --no-daemon --stacktrace
```

Identify the generated Android publication tasks, then run the release publication tasks to Maven Local without credentials or network publication. Inspect the generated POM/Gradle module metadata and confirm:

```text
org.graphiks:kffi-android-native:<version>
```

is a dependency of the Android `kffi` publication. The native module's AAR must contain `libkffi.so`; the `kffi` runtime AAR must not contain `libkffi_bench_fixture.so`.

## Task 6: Run Incremental Artifact and Regression Verification

**Files:** None beyond Tasks 2-5.

- [x] **Step 1: Run configuration checks in dependency order.**

Run:

```bash
./gradlew :kffi-android-native:tasks :kffi:tasks :kffi-benchmark-spi:tasks :kffi-benchmark-android:tasks --all --no-daemon --stacktrace
```

Expected: all four projects configure, the native project owns CMake tasks, the three KMP projects have no legacy Android plugin compatibility error, and device/host tests exist only where explicitly enabled.

- [x] **Step 2: Build the native runtime artifact.**

Run:

```bash
./gradlew :kffi-android-native:assembleDebug --no-daemon --stacktrace
```

Expected: CMake builds `libkffi.so` and `libkffi_bench_fixture.so` for `arm64-v8a`, `armeabi-v7a`, and `x86_64`.

- [x] **Step 3: Build the `kffi` Android device-test APK.**

Run the discovered device-test assembly task, preferring:

```bash
./gradlew :kffi:assembleAndroidDeviceTest --no-daemon --stacktrace
```

Expected: the test APK contains `libkffi_bench_fixture.so` for the supported ABIs, the runtime resolves `libkffi.so` through the native module dependency, and the fixture is not present in the runtime AAR.

- [x] **Step 4: Build the benchmark Android device-test APK.**

Run:

```bash
./gradlew :kffi-benchmark-android:assembleAndroidDeviceTest --no-daemon --stacktrace
```

Expected: `stageKffiBenchFixture` runs first, the APK contains `libkffi_bench_fixture.so`, and `AndroidHarness.kt` can load it from `nativeLibraryDir`.

Inspect the result:

```bash
unzip -Z1 kffi-benchmark-android/build/outputs/apk/androidTest/kffi-benchmark-android-androidTest.apk | rg 'libkffi_bench_fixture\.so$'
```

- [x] **Step 5: Run JVM and benchmark regressions.**

Run:

```bash
./gradlew :kffi:jvmTest --no-daemon --stacktrace
./gradlew :kffi-benchmark-jvm:jmh --no-daemon --stacktrace
```

Expected: report any existing `:kffi:jvmTest` `SIGTRAP` separately; do not modify callback/JVM behavior as part of this Android build migration. JMH should produce `kffi-benchmark-jvm/build/results/jmh/results.json`.

- [x] **Step 6: Compile the supported native benchmark target.**

Run on Apple Silicon:

```bash
./gradlew :kffi-benchmark-native:compileKotlinMacosArm64 --no-daemon --stacktrace
```

Expected: the existing macOS native harness compiles. If the host does not support this target, record that limitation without changing the target matrix.

## Task 7: Validate CI, Non-Goals, and Final Diff

**Files:** All files modified by this plan.

- [x] **Step 1: Validate all workflow YAML and whitespace.**

Run:

```bash
actionlint .github/workflows/*.yml
git diff --check
```

Expected: `actionlint` exits 0 and no whitespace errors are reported. `git diff --check` passed; `actionlint` is unavailable in this environment and was reported rather than replaced with a custom parser.

- [x] **Step 2: Run publication dry-run without credentials.**

Run:

```bash
./gradlew :kffi:publish :kffi-android-native:publish :kffi-benchmark-spi:publish \
    --dry-run --no-configuration-cache --no-daemon --stacktrace
```

The repository has no `publishToMavenCentral` task. The qualified publication dry-run above configured all relevant publications, including `org.graphiks:kffi-android-native`, without network publication or credential access.

- [x] **Step 3: Run the aggregate test path when host targets are available.**

Run:

```bash
./gradlew allTests --no-daemon --stacktrace
```

Expected: supported JVM/Android/native tasks complete. Unsupported host-native targets are reported without broadening the target matrix.

- [x] **Step 4: Confirm non-goals were untouched.**

Run:

```bash
git diff -- .github/contributing-policy.toml .github/scripts/validate_pr_policy.py kffi/src/jvmMain kffi/src/jvmTest
```

Expected: no output for policy, JVM runtime, and JVM test sources. The final diff may include Gradle files, the native module/source moves, Android test directory moves, existing CI setup files, and the approved spec/plan documents only.

- [x] **Step 5: Record the final state without committing.**

Run:

```bash
git diff --stat
git status --short
```

Expected: no unexpected files, no generated build artifacts tracked, and no commit created without explicit user authorization.
