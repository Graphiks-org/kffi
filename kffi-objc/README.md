# kffi-objc

JVM-only Objective-C runtime bindings for macOS, built on the Java Foreign
Function & Memory API (Panama FFM).

The generated sources cover the Apple SDK frameworks selected by the generator:
Foundation, CoreFoundation, AppKit, CoreGraphics, QuartzCore, CoreImage, Metal,
AVFoundation, GameController, ModelIO, SceneKit, UniformTypeIdentifiers, PDFKit,
and QuickLook. This includes the complete class and protocol surface visible
through the SDK umbrella header, together with the required enums, options,
types, categories, and runtime helpers.

Sources are produced from the macOS SDK by `kextract` and are checked in so the
module can compile on non-macOS hosts without running the generator.

## Regenerate the bindings

Generation requires macOS, Xcode, Homebrew LLVM, and the initialized `kextract`
submodule:

```bash
git submodule update --init --recursive
LLVM_HOME="$(brew --prefix llvm)" scripts/gen-kffi-objc.sh
```

The generator inputs are the pinned `kextract` submodule, the selected Xcode
SDK, and the LLVM installation used to build `kextract`. Set `DEVELOPER_DIR`
and/or `SDKROOT` when regeneration must use a specific Xcode installation or
SDK. `LLVM_HOME` must be set explicitly when the local `kextract` executable
needs to be built; this avoids silently switching LLVM installations.

To verify that the checked-in sources match a fresh generation without
overwriting them, run:

```bash
LLVM_HOME="$(brew --prefix llvm)" scripts/gen-kffi-objc.sh --check
```

The input header is `kffi-objc/generation/ObjCSubset.h`. The generator's
framework list is maintained in `scripts/gen-kffi-objc.sh`; add a framework
there when extending the supported SDK surface.

## Tests

```bash
./gradlew :kffi-objc:jvmTest
```

The runtime test executes on macOS and is skipped on other JVM hosts.

### AppKit screenshot integration

The AppKit integration renders four colored quadrants through the generated
Objective-C bindings, encodes the result as PNG, validates the decoded pixels,
and writes the screenshot plus diagnostics to
`kffi-objc/build/objc-integration/`.

Run the self-contained local flow on macOS with:

```bash
scripts/run-objc-integration.sh
```

The same test is executed by the `objc-integration` CI job and the generated
`screenshot.png` is uploaded as a workflow artifact. To run the Gradle task
directly, opt in explicitly:

```bash
KFFI_OBJC_INTEGRATION=1 ./gradlew :kffi-objc:objcIntegrationTest
```

The direct Gradle task assumes a macOS AppKit runtime; the script performs the
platform check and sets the artifact directory.

## Managed display and memory-pressure services

The `org.graphiks.kffi.objc.appkit` package keeps CoreGraphics and Dispatch
pointers behind closeable JVM owners. Active displays can be enumerated as
detached immutable snapshots:

```kotlin
val displays: List<CGDisplaySnapshot> = AppKitDisplayServices.enumerate()
```

`AppKitDisplayServices.currentMode(displayId)` returns an
`OwnedCGDisplayMode`; close it after reading or applying the mode. Display
capture uses `withCapturedDisplay` or `withCapturedDisplays`, which guarantees
the matching CoreGraphics release on normal and exceptional exits.

`DispatchMemoryPressureSource` creates and resumes a private Dispatch source
for `WARN` and `CRITICAL` events. Closing it is idempotent, immediately revokes
new handler admission, requests cancellation, and defers native release until
the source and any already-admitted handler are quiescent:

```kotlin
DispatchMemoryPressureSource { event ->
    when (event) {
        DispatchMemoryPressureEvent.WARN -> trimCaches()
        DispatchMemoryPressureEvent.CRITICAL -> releaseOptionalResources()
    }
}.use {
    runApplicationLoop()
}
```
