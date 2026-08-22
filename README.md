# kffi - Multiplatform FFI layer (JVM / Android / Native)

[![Kotlin](https://img.shields.io/badge/Kotlin-2.4.10-purple?logo=kotlin)](https://kotlinlang.org)
[![Gradle](https://img.shields.io/badge/Gradle-9.7.0-blue?logo=gradle)](https://gradle.org)
[![AGP](https://img.shields.io/badge/AGP-9.0.0-green?logo=android)](https://developer.android.com/build/releases/gradle-plugin)
[![JDK](https://img.shields.io/badge/JDK-25-red?logo=openjdk)](https://openjdk.org)
[![CI](https://github.com/Graphiks-org/kffi/actions/workflows/ci.yml/badge.svg)](https://github.com/Graphiks-org/kffi/actions/workflows/ci.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue?style=plastic)](LICENSE)
[![Contributing](https://img.shields.io/badge/Contributing-guide-purple)](CONTRIBUTING.md)
[![Projet: Incubating](https://img.shields.io/badge/Statut-Incubating-orange)](https://github.com/Graphiks-org/kffi)

<!-- ==========================================
     BADGES DE STATUT DE PROJET PERSONNALISABLES
     Décommentez/copiez simplement le badge correspondant au statut actuel de votre projet.
     ========================================== -->

<!-- STATUT : EN PLANIFICATION (PLANNING) -->
<!-- [![Projet: Planning](https://img.shields.io/badge/Statut-Planning-blue)](https://github.com/Graphiks-org/kffi) -->

<!-- STATUT : INCUBATION / EN DÉVELOPPEMENT (INCUBATING) -->
<!-- [![Projet: Incubating](https://img.shields.io/badge/Statut-Incubating-orange)](https://github.com/Graphiks-org/kffi) -->

<!-- STATUT : STABLE / PRÊT PRODUCTION (STABLE) -->
<!-- [![Projet: Stable](https://img.shields.io/badge/Statut-Stable-green)](https://github.com/Graphiks-org/kffi) -->

<!-- STATUT : DÉPRÉCIÉ (DEPRECATED) -->
<!-- [![Projet: Deprecated](https://img.shields.io/badge/Statut-Deprecated-red)](https://github.com/Graphiks-org/kffi) -->

<!-- STATUT : ARCHIVÉ (ARCHIVED) -->
<!-- [![Projet: Archived](https://img.shields.io/badge/Statut-Archived-lightgrey)](https://github.com/Graphiks-org/kffi) -->

`kffi` is a low-level foreign function interface (FFI) layer for native memory
access and native calls, written in Kotlin Multiplatform. It is a standalone
runtime library for projects that consume C libraries.

The repository was extracted from
[wgpu4k-native](https://github.com/wgpu4k/wgpu4k-native) and now contains the
standalone KFFI runtime and its benchmark modules.

This is a **runtime-only** module: binding generation is handled by the
separate [kextract](https://github.com/klang-toolkit/kextract) tool (see
[Binding generation](#binding-generation)).

The `expect/actual` contract lives in `commonMain` (`org.graphiks.kffi`):
`NativeAddress`, `MemoryBuffer`, `MemoryAllocator` (`memoryScope`,
`globalMemory`), `CString`, and `Callback`/`CallbackRuntime`. The memory safety
contract is unified across all three backends (spec P3).

- [Quickstart](docs/docs/quickstart.md)
- [Backends](#backends)
- [Memory safety contract](#memory-safety-contract)
- [`unsafe` mode](#unsafe-mode)
- [Callbacks](#callbacks)
- [Versioning](#versioning)
- [Contributing](#contributing)
- [Project architecture](#project-architecture)
- [CI/CD workflow](#cicd-workflow)
- [Useful development commands](#useful-development-commands)

## Backends

| Backend | Implementation | Notes |
|---------|----------------|-------|
| **JVM** | Panama FFM (`java.lang.foreign`) | Confined arenas; downcalls through `MethodHandle`; `jvmTarget` 25 |
| **Android** | Kotlin engine + JNI (`NativeEngine`/`UpcallEngine`) | `.so` bundled in the AAR; libffi fallback path |
| **Native** | `kotlinx.cinterop` | iOS, macOS, Linux, Windows (MinGW), Android Native |

## Consuming kffi

### Repositories

Release artifacts are consumed from Maven Central. Development snapshots
default to `1.0.0-SNAPSHOT` and can be consumed from the Central Portal snapshot
repository, so consumers of those snapshots need both repositories:

```kotlin
// settings.gradle.kts - resolution repositories
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven {
            name = "CentralPortalSnapshots"
            url = uri("https://central.sonatype.com/repository/maven-snapshots/")
            content {
                includeGroup("org.graphiks")
            }
        }
    }
}
```

Gradle publication version selection uses the `releaseVersion` property, set
with `-PreleaseVersion=...`; without an explicit value, it defaults to
`1.0.0-SNAPSHOT`. The canonical publication workflow selects the version from
workflow dispatch input or a release tag and publishes through the single
aggregated `./gradlew publishToMavenCentral` task. Development snapshots use the
Central Portal snapshot repository shown above; releases use Maven Central.

### Artifacts

The group is `org.graphiks`. Publications follow the standard Kotlin
Multiplatform naming scheme:

| Context | Artifact | Notes |
|---------|----------|-------|
| KMP consumer | `org.graphiks:kffi` | Root artifact (metadata); Gradle resolves the platform variant automatically |
| JVM-only project | `org.graphiks:kffi-jvm` | Requires a JDK with `java.lang.foreign` (25+) |
| Android project | `org.graphiks:kffi-android` | AAR with `release`/`debug` variants; minSdk 28 |
| Native project | `org.graphiks:kffi-<target>` | One artifact per Native target (see the list below) |

There is no aggregate `kffi-native` artifact: each Native target is published
separately. For a KMP consumer, declare the root `org.graphiks:kffi` artifact;
Gradle selects the variant for the target being compiled.

Published Native targets:
`kffi-iosx64`, `kffi-iosarm64`, `kffi-iossimulatorarm64`,
`kffi-macosx64`, `kffi-macosarm64`, `kffi-linuxx64`, `kffi-linuxarm64`,
`kffi-mingwx64`, `kffi-androidnativearm64`, `kffi-androidnativex64`.

### Dependency declaration

> **M2.4 note:** The standalone snapshot coordinate is `1.0.0-SNAPSHOT`,
> effective after the M2.4 migration (independent versioning for the kffi
> module). Before this migration, the module inherited the host repository
> version.
>
> The examples below use `1.0.0-SNAPSHOT`. Replace it with an explicitly
> selected published version when consuming a release.

```kotlin
// build.gradle.kts - KMP project
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("org.graphiks:kffi:1.0.0-SNAPSHOT") // or an explicitly selected published version
        }
    }
}
```

```kotlin
// build.gradle.kts - JVM-only project
dependencies {
    implementation("org.graphiks:kffi-jvm:1.0.0-SNAPSHOT")
}
```

```kotlin
// build.gradle.kts - Android project
dependencies {
    implementation("org.graphiks:kffi-android:1.0.0-SNAPSHOT")
}
```

See [docs/quickstart.md](docs/quickstart.md) for a complete end-to-end
example.

## Binding generation

kffi is **runtime-only**: it provides the runtime engine for memory access,
downcalls, and upcalls, but not a binding generator. Kotlin bindings for C/ObjC
headers are generated by
[kextract](https://github.com/klang-toolkit/kextract), a Kotlin generator that
uses libclang and targets the public `org.graphiks.kffi` API:

- Memory-backed structs (`MemoryBuffer`) with scalar and array access.
- Per-function downcall wrappers with symbol resolution at load time.
- Callback declarations (`CallbackType`) and upcall trampolines by signature shape.

The consumer workflow is: generate bindings with kextract, link the bindings to
kffi, and load the native library during startup (see below).

### X11 bindings

`:kffi-x11` provides JVM-only, low-level X11 bindings for JDK 25. Its generated
sources are in `org.graphiks.kffi.x11.generated` and load `libX11.so.6`,
`libXext.so.6`, and `libXcomposite.so.1`. The module depends on
`:kffi-posix`; it does not provide a higher-level X11 event-loop layer.

The generated core surface includes graphics-context creation, state setters,
color parsing/allocation/query operations, and X11 drawing primitives for
points, lines, segments, rectangles, arcs, and polygons. It also exposes
pixmap creation, copying, clearing, window background/border pixmap helpers,
and image transfer entry points. Native records such as `XColor`, `XPoint`,
`XSegment`, `XRectangle`, and `XArc` are emitted by kextract, while opaque Xlib
records remain `MemorySegment` pointers where their nested ABI is not safely
laid out by the pinned generator.

The bindings are generated with the pinned
[`kextract`](https://github.com/klang-toolkit/kextract) revision
`9252fb417ea91dae882a6a9e9d06ab672c50adc3`. The Docker base image is pinned
to `eclipse-temurin:25-jdk-noble@sha256:e94f1dc880339ab3884b69176b79c8dc4124b722e059c7ff7f0bf53b603a46f8`;
it supplies the declared Ubuntu X11 development packages at image-build time
rather than claiming an APT snapshot pin. Regenerate for Linux after
initializing the submodule:

```bash
git submodule update --init --recursive
scripts/gen-kffi-x11.sh
```

Generation is not part of the Gradle build. The module's contract tests do not
start or require an X server.

For the Linux-only screenshot integration, no physical X server or window
manager is required: `scripts/run-x11-integration.sh` starts `Xvfb` and runs
`:kffi-x11:x11IntegrationTest`. CI installs the Ubuntu packages actually used
there: `xvfb`, `x11-apps`, `libx11-6`, `libxext6`, `libxcomposite1`, `libxtst6`,
and `imagemagick`.

Use the runner for the full local flow:

```bash
scripts/run-x11-integration.sh
```

To run the same flow in the Wayland-style Docker wrapper, with X11 tools and
the JDK supplied by the image:

```bash
scripts/docker-x11-integration.sh
```

The Docker wrapper requires a working Docker daemon and persists Gradle
dependencies in the `kffi-x11-integration-gradle-cache` volume by default.
Override the image or cache volume with `KFFI_X11_INTEGRATION_IMAGE` or
`KFFI_X11_INTEGRATION_GRADLE_CACHE_VOLUME`.

The runner requires Linux, exports `KFFI_X11_INTEGRATION=1`, and writes
artifacts to `kffi-x11/build/x11-integration/` by default. Supported overrides
are `KFFI_X11_INTEGRATION_REPO_ROOT`, `KFFI_X11_INTEGRATION_GRADLE`,
`KFFI_X11_INTEGRATION_ARTIFACT_DIR`, and `KFFI_X11_ARTIFACT_DIR`.

To run the Gradle task directly, opt in explicitly:

```bash
KFFI_X11_INTEGRATION=1 ./gradlew :kffi-x11:x11IntegrationTest
```

The direct Gradle command does not start `Xvfb`; `DISPLAY` must reference an
existing X server. Prefer `scripts/run-x11-integration.sh` for the
self-contained headless flow.

The integration test draws four named-color rectangles in the window's
quadrants, captures the result as `window.png`, and validates the center pixel
of each quadrant. The generated binding contract test also checks that the
core GC, color, geometry, and pixmap declarations are present.

The pinned generator cannot safely emit layouts for Xlib records with nested
declarations or LP64 padding. `XEvent`, `XImage`, `XWindowAttributes`,
`XWMHints`, `XGC`, and `XShmSegmentInfo` therefore remain generated
`MemorySegment` pointer APIs without raw record accessors. The generator's
`KffiXEventStorage` (192-byte event storage) and `XShmSegmentInfoCompat`
(32-byte LP64-padded storage) declarations are compatibility shims only; they
do not replace the native records passed to Xlib. The generator validates those
shim sizes, alignments, and native offsets with C `_Static_assert` checks.

### Objective-C/AppKit integration

`:kffi-objc` includes a macOS-only AppKit screenshot integration. It renders
four colored quadrants through the generated Objective-C bindings, validates the
PNG pixels, and writes `screenshot.png` plus diagnostics to
`kffi-objc/build/objc-integration/`.

Run it locally on macOS with:

```bash
scripts/run-objc-integration.sh
```

The `objc-integration` CI job runs the same script and uploads the generated
image as a workflow artifact. The Gradle task can also be invoked directly with
`KFFI_OBJC_INTEGRATION=1`.

### Win32 bindings

`:kffi-win32` provides JVM-only Win32 bindings generated from the Windows SDK.
The initial surface covers selected functions from `user32.dll`,
`kernel32.dll`, `gdi32.dll` and `dwmapi.dll`, under the package
`org.graphiks.kffi.win32.generated`.
The generated Kotlin sources are versioned in this repository. Regeneration is
a maintainer operation on Windows; CI compiles and tests the checked-in sources
but does not run the generator.

Generation requires Windows, Git Bash, JDK 25, the pinned `kextract` submodule
and Windows SDK `10.0.28000.0` exactly. That SDK version is required for
reproducible committed output, and must be installed under
`C:/Program Files (x86)/Windows Kits/10/Include/10.0.28000.0`; other SDK
versions and installation roots are not used. The
generator is intentionally separate from the Gradle build:

```bash
git submodule update --init --recursive
scripts/gen-kffi-win32.sh
./gradlew :kffi-win32:compileKotlinJvm --no-daemon
```

See [kffi-win32/README.md](kffi-win32/README.md) for the generation inputs,
the `--check` mode, the Windows-specific setup, and the window screenshot
integration test.

## Loading a native library

### JVM

1. Load the library into the process with `System.loadLibrary("monlib")` (or
   place it on `java.library.path`). Symbols resolved by
   `SymbolLookup.loaderLookup()` exist only for libraries loaded by the
   classloader.
2. Resolve symbols to raw addresses:

```kotlin
import org.graphiks.kffi.findOrThrow

val symbol: Long = findOrThrow("mon_symbole") // UnsatisfiedLinkError if absent
```

The JVM kffi runtime uses restricted `java.lang.foreign` APIs (`Linker`,
`MethodHandles`) itself. Start the JVM with
`--enable-native-access=ALL-UNNAMED`. Without this flag, the JVM emits a
warning and will block the call in a future JDK version. The flag is also
required for upcalls emitted by kextract on the direct FFM fallback path.

### Android

The AAR bundles the `libkffi.so` engine (JNI), which is loaded automatically by
`System.loadLibrary("kffi")` during `NativeEngine` initialization. The consumed
library is loaded dynamically:

```kotlin
import org.graphiks.kffi.engine.NativeEngine

val handle = NativeEngine.loadNativeLibrary("/data/app/.../libmonlib.so") // dlopen
val symbol = NativeEngine.resolveSymbolIn(handle, "mon_symbole")
```

The AAR bundles consumer R8 rules and the `arm64-v8a` and `x86_64` ABIs.

### Native

Linking happens at compile time through cinterop (`.def` files): bindings
generated by kextract and the kffi module are linked to the native library at
final link time. No manual `dlopen` is needed.

## Memory model

- `NativeAddress` - a raw native address (a value class over `Long`). It is
  **unbounded by nature**: typed access goes through `MemoryBuffer` (bounded) or
  the `unsafe` option.
- `MemoryBuffer` - a bounded buffer over a native address: `handler` (address)
  and `size` (bytes). It provides scalar and array access for Byte, Short, Int,
  Long, Float, Double, signed and unsigned types, and pointers.
- `CString` - a C string (UTF-8, terminated by `\0`): allocate with
  `MemoryAllocator.allocateFrom` and read with `toKString()`.
- `MemoryAllocator` - a confined arena with allocation (`allocate`,
  `allocateBuffer`, `allocateFrom`, `bufferOf`, `bufferOfAddress`,
  `bufferOfAddresses`), closing (`close`), and `memoryScope { }`, which closes
  the arena at the end of the block. `globalMemory` is a process-lifetime arena.

```kotlin
import org.graphiks.kffi.*

memoryScope { allocator ->
    val buffer = allocator.allocateBuffer(size = 16uL)

    buffer.writeInt(value = 42, offset = 0uL)
    val value = buffer.readInt(offset = 0uL) // 42

    buffer.readLong(offset = 12uL)
    // IndexOutOfBoundsException: MemoryBuffer access out of bounds: offset=12 width=8 size=16
}
```

## Memory safety contract

### Bounds checks

Every typed scalar and array access is checked: `offset + elementSize <= size`.
Out-of-bounds access throws `IndexOutOfBoundsException` with the offset and
size in the message. Checks are enabled by default. On JVM and Android, the
runtime `unsafe = true` option skips these checks. On Native, the runtime
argument is ignored; checks follow the compile-time `KFFI_NATIVE_UNSAFE` value.

### Lifetime

Decision I2-(a): the arena/session scope lives in `MemoryBuffer`, not in
`NativeAddress`.

- A buffer created through `MemoryAllocator` (JVM) carries the arena's scoped
  segment. Access after the arena's `close()` throws `IllegalStateException`.
- On Android and Native, closing `MemoryAllocator` releases its arena without a
  per-buffer close guard; accessing allocator-backed memory afterward is
  undefined behavior.
- A buffer created from a raw address (`MemoryBuffer(addr, size)`) has no scope.
  Post-close access is **not detected** (documented UB on all three backends).

### Confinement

On the JVM, the arena is `Arena.ofConfined()`: scoped buffers and `close()` are
confined to the creating thread. Access from another thread throws
`WrongThreadException`. `memoryScope` follows the same rule.

On the JVM, `unsafe` access uses the raw address (`sun.misc.Unsafe`), so there is
no thread check; the allocator close guard still applies. A buffer built from a
raw address has no confinement (null guard, documented UB) and is the path for
deliberate cross-thread sharing at the consumer's own risk. Android also uses
the runtime flag, but does not provide the JVM close guard after its arena is
closed.

### Aliasing

Two buffers over the same memory area see each other: writes through one are
visible through the other. **No lock is provided**; synchronization is the
consumer's responsibility. Cross-thread sharing is also limited by JVM arena
[confinement](#confinement).

## `unsafe` mode

### JVM and Android behavior

On JVM and Android backends, `unsafe = true` is a runtime option that disables
bounds checks in either of two ways:

- Per allocator: `MemoryAllocator(unsafe = true)` propagates the option to all
  buffers created by that allocator.
- Per buffer: `MemoryBuffer(addr, size, unsafe = true)` enables it locally.

The default is `false` (bounds checks enabled). In `unsafe` mode, every
out-of-bounds access becomes **undefined behavior** (UB): no exception is
raised, and memory corruption is possible. This is deliberate and intended for
hot paths only.

Lifetime policy P2: `unsafe` mode does **not** remove lifetime discipline. Unsafe
buffers retain the JVM allocator close guard, while Android allocator-backed
buffers become invalid when their arena closes; raw-address buffers have no
guard on either backend. Only bounds checks are skipped by the runtime option.

### Native behavior

On Native backends, `unsafe` is **compile-time fixed**: the runtime argument is
ignored and the value comes from the build-time constant
`KFFI_NATIVE_UNSAFE` in `MemoryBuffer.native.kt`, currently `false`. Therefore
current Native builds keep bounds checks enabled even when `unsafe = true` is
passed. Native distributions cannot switch this at runtime; change the
constant and rebuild the module to produce a different policy.

## Callbacks

Callbacks (upcalls from Native to Kotlin) are managed by `CallbackRuntime` and
backend-specific upcall engines (`JvmUpcallEngine`, `UpcallEngine` on Android).
Code generated by kextract provides `CallbackType` descriptors, trampolines,
and dispatchers; the consumer registers a Kotlin lambda with
`CallbackRuntime.register`.

Lifecycle:

- `CallbackRegistration.close()` closes the registration and prevents further
  delivery. `isClosed` becomes true immediately; `isQuiescent` becomes true
  only after all in-flight Native deliveries have returned (tracked by
  `inFlight`).
- `CallbackPolicy.ONCE` delivers a callback once, then unpublishes the slot
  after the first delivery (claim). `REPEATING` delivers while the registration
  remains open.
- `CallbackRuntime.prepare` / `activateForNativeCall` provide a transactional
  pattern for generated one-shot Native calls: prepare, activate at the call,
  and close on failure.
- `CallbackRuntime.rearmAfterNativeQuiescence` rearms a slot without userdata
  (`@UnsafeCallbackRearmApi`). The consumer must establish Native quiescence
  before rearming.
- No exception crosses the Native boundary. `dispatchSafely` routes failures to
  the registration's `CallbackExceptionHandler` (`onError`), or to the fallback
  channel if routing fails.

Trampoline lifetime: on the JVM, stubs are allocated in a global arena with
process lifetime. On Android, JNI trampolines use explicit management through
the four-argument `allocateTrampoline(dispatcherClass, dispatchMethod,
dispatchJvmSignature, dispatchAbiSignature)` API, which prepares a dynamic
libffi closure for the callback shape. The final `ptr` in the ABI signature is
the routing userdata; pointer and struct addresses are carried to Kotlin as
`jlong` values, so native code does not create Java wrapper objects. In both
cases, `CallbackRegistration` controls routing; closing it removes the slot
from the token table, and a token is never reused. Before Android
`freeTrampoline`, generated or native code must unregister the callback from
the C library, stop and join every native callback producer, and only then
free the closure. `CallbackRegistration.isQuiescent` alone cannot account for
a native callback that has not entered the Kotlin dispatcher yet.

## Versioning

kffi follows strict SemVer. `1.0.0` is the **first stable contract**: the P1-P4
redesign (downcall/upcall engines, I2-a lifetime policy, I3 `unsafe` option, and
M1 optimization) is the final redesign before 1.0. Public APIs are stable from
this version; breaking changes require a major version bump.

- Releases use `x.y.z` and the current runtime version is being prepared as
  `1.0.0`.
- The Gradle publication version is selected with `releaseVersion`, using
  `-PreleaseVersion=...`; without an override, it defaults to
  `1.0.0-SNAPSHOT`.
- The canonical publication workflow uses the aggregated root task
  `./gradlew publishToMavenCentral`, with workflow dispatch input or a release
  tag selecting the publication version.
- The current runtime version is exposed as `Kffi.VERSION` (`1.0.0`, starting
  with the M2.4 module version).

## Contributing

Contributions are welcome. Please see:

- [Contributing Guide](CONTRIBUTING.md)
- [Code of Conduct](CODE_OF_CONDUCT.md)
- [Support](SUPPORT.md)
- [Changelog](CHANGELOG.md)

## Project architecture

This repository is a standalone Kotlin Multiplatform build. The root
`settings.gradle.kts` includes these modules:

| Module | Purpose |
|--------|---------|
| `:kffi` | The multiplatform runtime library and its JVM, Android, and Native tests |
| `:kffi-wayland` | JVM-only low-level Wayland bindings |
| `:kffi-x11` | JVM-only generated X11 bindings; see [X11 bindings](#x11-bindings) |
| `:kffi-objc` | JVM-only generated macOS Objective-C, Foundation, and AppKit bindings |
| `:kffi-benchmark-spi` | Shared multiplatform benchmark model and test contracts |
| `:kffi-benchmark-jvm` | JVM JMH benchmarks for kffi |
| `:kffi-benchmark-native` | Kotlin/Native benchmark harness |
| `:kffi-benchmark-android` | Android instrumented benchmark harness |

The `:kffi` module keeps the public `expect` declarations and common contracts
in `commonMain`, with platform implementations in the JVM, Android, and Native
source sets. The JVM implementation uses Panama FFM, Android uses the Kotlin
and JNI engines, and Native uses Kotlin/Native cinterop. Benchmark modules
depend on the runtime and benchmark SPI rather than introducing another
runtime module.

## CI/CD workflow

The dedicated KFFI test workflow (`.github/workflows/ci.yml`) runs on
macOS, Ubuntu, and Windows with JDK 25. It runs `./gradlew :kffi:jvmTest
:kffi-objc:jvmTest :kffi:testAndroidHostTest` on every matrix entry and runs
the Windows-only `./gradlew :kffi-win32:jvmTest` plus the
`./gradlew :kffi-win32:win32IntegrationTest` window screenshot test on
`windows-latest`. The screenshot output is uploaded as a workflow artifact.
It also performs these
platform-specific checks:

- macOS compiles the iOS and macOS callback token codecs, then runs either
  `./gradlew :kffi:macosArm64Test` or `./gradlew :kffi:macosX64Test` according to
  the host architecture.
- Ubuntu compiles the Linux callback token codecs and runs
  `./gradlew :kffi:linuxX64Test`.
- Windows activates MSVC, compiles the MinGW callback token codec, and runs
  `./gradlew :kffi:mingwX64Test`.

A dedicated Ubuntu job starts an Android API 35 `x86_64` emulator and runs
`./gradlew :kffi:connectedAndroidDeviceTest`.

The benchmark workflow (`.github/workflows/benchmark.yml`) runs the JVM
JMH benchmark, compiles the macOS arm64 Native benchmark harness, and assembles
the Android debug test APK. The canonical root publication workflow publishes
artifacts through the single aggregated `./gradlew publishToMavenCentral` task,
with dispatch/tag version selection.

## Useful development commands

### JVM tests

```bash
./gradlew :kffi:jvmTest
```

### macOS Native compile and test checks

```bash
./gradlew \
  :kffi:compileKotlinIosX64 \
  :kffi:compileKotlinIosArm64 \
  :kffi:compileKotlinIosSimulatorArm64 \
  :kffi:compileKotlinMacosArm64 \
  :kffi:compileKotlinMacosX64

if [[ "$(uname -m)" == "arm64" ]]; then
  ./gradlew :kffi:macosArm64Test
else
  ./gradlew :kffi:macosX64Test
fi
```

### Linux Native compile and test checks

```bash
./gradlew :kffi:compileKotlinLinuxX64 :kffi:compileKotlinLinuxArm64
./gradlew :kffi:linuxX64Test
```

### Windows Native compile and test checks

```bash
./gradlew :kffi:compileKotlinMingwX64
./gradlew :kffi:mingwX64Test
```

### Benchmarks

```bash
./gradlew :kffi-benchmark-jvm:jmh
./gradlew :kffi-benchmark-native:compileKotlinMacosArm64
./gradlew :kffi-benchmark-android:assembleAndroidDeviceTest
```

### Inspect available Gradle tasks

```bash
./gradlew tasks
```

## License

MIT - see [LICENSE](LICENSE).
