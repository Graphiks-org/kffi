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

### Listen-only CoreGraphics event taps

`CGListenOnlyEventTap.preflight()` checks the current Input Monitoring permission without
requesting access or displaying a system prompt. Install a tap only when it returns
`EventTapPermissionState.Granted`:

```kotlin
val mask = 1L shl CGEventType.kCGEventMouseMoved.value.toInt()
if (CGListenOnlyEventTap.preflight() == EventTapPermissionState.Granted) {
    CGListenOnlyEventTap.install(mask) { event ->
        // The event is borrowed only for this handler invocation.
        observe(event)
    }.use {
        runApplicationLoop()
    }
}
```

The owner always creates a session-level `kCGEventTapOptionListenOnly` tap, so handlers cannot
modify or suppress events. Closing removes the run-loop source, disables the tap, revokes future
handler admission, and releases CoreFoundation resources after any already-admitted callback has
returned. The API never requests Input Monitoring permission; applications remain responsible for
explaining and initiating any permission flow separately.

## GameController input observation

The generated GameController surface includes controllers, physical-input profiles, typed
elements, and connection/disconnection notification constants. Load the system framework before
using its generated classes or exported constants:

```kotlin
System.load("/System/Library/Frameworks/GameController.framework/GameController")
```

On macOS 13 or later, `GCPhysicalInputProfile.observeValueChanges` installs a managed Objective-C
block and returns an `AutoCloseable` owner:

```kotlin
profile.observeValueChanges { changedProfile, changedElement ->
    // Both wrappers are borrowed for this handler invocation only.
    consume(changedProfile, changedElement)
}.use {
    runApplicationLoop()
}
```

Closing the owner first clears the profile's native `valueDidChangeHandler`, then revokes callback
admission and releases the block after any already-admitted delivery returns. The generated
`GCControllerDidConnectNotification` and `GCControllerDidDisconnectNotification` constants can be
used with the existing managed `NSNotificationCenter.observe` adapter.
