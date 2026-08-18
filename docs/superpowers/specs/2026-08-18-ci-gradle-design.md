# CI and Gradle Stabilization Design

## Context

PR #2 currently fails in several GitHub Actions jobs. The failures relevant to
this design are Gradle configuration failures, not the PR-history policy or
the Windows struct-by-value tests.

The confirmed Gradle failures are:

- The hosted runners have not accepted or installed `ndk;30.0.15729638`.
- `kffi/build.gradle.kts` asks Kotlin Multiplatform to publish Android
  `release` and `debug` variants that AGP 9 does not expose as valid library
  variants.
- `com.android.library` is deprecated/incompatible with Kotlin Multiplatform
  from AGP 9 onward. The repository already contains the replacement plugin in
  `buildSrc/src/main/kotlin/ygdrasil/conventions/kmp-library.gradle.kts`.

## Scope

This change covers the Gradle build and the GitHub Actions environment needed
to configure and build the project.

It does not change:

- `.github/contributing-policy.toml` or `.github/scripts/validate_pr_policy.py`;
- the PR commit history or branch history;
- Windows `JvmDowncallEngineStructByValueTest` behavior;
- application/library API behavior unrelated to build configuration.

## Design

### Shared Android CI setup

Add a local composite action at
`.github/actions/setup-android/action.yml`. The action will:

1. Install/configure the Android command-line tools with
   `android-actions/setup-android@v3`.
2. Accept available Android SDK licenses non-interactively.
3. Install the exact SDK platform and NDK versions used by the build:
   `platforms;android-36` and `ndk;30.0.15729638`.

Every workflow job that invokes Gradle against the multi-project build will
call this action after Java setup and before the Gradle command. This includes
the main CI, documentation, benchmark, test, and publication workflows. The
version is pinned in the action so all jobs use the same SDK contract.

The action must fail if license acceptance or package installation fails. It
must not hide `sdkmanager` errors, because a silently incomplete SDK would
recreate the current failure later in Gradle configuration.

### Android KMP and native build split

The Android KMP plugin is the supported plugin for the KMP modules, but the
official Android documentation explicitly excludes Android-specific native
builds and `externalNativeBuild`. The repository's `kffi/src/main/cpp` build
produces both the runtime JNI library (`libkffi.so`) and the Android benchmark
fixture (`libkffi_bench_fixture.so`), so those files cannot remain in the KMP
module's Android target.

Create a standalone `kffi-android-native` module using `com.android.library`.
It owns the existing CMake project, libffi FetchContent configuration, the
supported ABI filters, NDK version, JNI packaging, and native outputs. The
native sources move from `kffi/src/main/cpp` to the new module without changing
their C symbols or CMake targets.

Migrate these KMP modules to
`com.android.kotlin.multiplatform.library`:

- `kffi`;
- `kffi-benchmark-android`;
- `kffi-benchmark-spi`.

The `kffi` Android source set depends on `kffi-android-native`, preserving the
published `libkffi.so` runtime dependency and `System.loadLibrary("kffi")`.
The benchmark Android module stages the fixture from the new native module's
build output. The fixture remains test-only and is excluded from the runtime
AAR.

The existing `androidInstrumentedTest` directories are retained by explicitly
mapping them to the new plugin's `androidDeviceTest` source sets, unless the
plugin's source-set API requires a mechanical directory move. Test behavior and
dependencies remain unchanged.

The native module is published as `org.graphiks:kffi-android-native` so the
KMP Android publication exposes a resolvable transitive native dependency.
Remove `publishLibraryVariants("release", "debug")` from `kffi`; the new KMP
plugin exposes one Android publication through the normal KMP publishing
mechanism. Remove `android.builtInKotlin=false` and `android.newDsl=false` only
after no KMP module uses the legacy Android plugin. No unrelated API or runtime
behavior changes are included.

## Verification

The implementation will use these checks, in increasing cost order:

1. Gradle configuration/task discovery for the new native module, `kffi`, both
   benchmark modules, and publication tasks.
2. `:kffi-android-native:assembleDebug` and inspection of its AAR for
   `libkffi.so`.
3. `:kffi:assembleDebugAndroidTest` and inspection of the test APK for
   `libkffi_bench_fixture.so`.
4. `./gradlew :kffi:jvmTest --no-daemon --stacktrace`.
5. `./gradlew :kffi-benchmark-android:assembleDebugAndroidTest --no-daemon --stacktrace`.
6. `./gradlew :kffi-benchmark-jvm:jmh --no-daemon --stacktrace`.
7. `./gradlew :kffi-benchmark-native:compileKotlinMacosArm64 --no-daemon --stacktrace`
   when the host target is available.
8. A publication dry-run confirming that `kffi` resolves the native module
   dependency without requiring credentials.
9. Static validation of all modified workflow YAML and the composite action.

The known PR-policy and Windows failures will be reported separately and are
not expected to change as a result of this design.

## Failure behavior

- Missing SDK tools, rejected licenses, or unavailable NDK versions fail in the
  shared setup action with a direct error.
- Missing native artifacts fail the Android AAR/APK inspection before the test
  suite is considered successful.
- Unsupported host-native targets remain governed by the existing workflow
  conditions; this design does not broaden cross-compilation support.
- Android publishing configuration failures fail during Gradle configuration,
  rather than being deferred to a later publication task.

## Alternatives rejected

- Installing only the NDK while retaining the old Android plugin would remove
  the first failure but retain the AGP 9 compatibility problem and invalid
  variant publishing configuration.
- Directly migrating `kffi` to the new Android KMP plugin would remove its
  CMake build and therefore break `libkffi.so` and the Android fixture.
- Pinning AGP below 9 would avoid the migration but regress the repository's
  current plugin direction and conflict with the existing modern convention
  plugin.
