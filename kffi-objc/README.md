# kffi-objc

JVM-only Objective-C runtime bindings for macOS, built on the Java Foreign
Function & Memory API (Panama FFM).

The generated sources cover the Apple SDK frameworks selected by the generator:
Foundation, CoreFoundation, AppKit, CoreGraphics, QuartzCore, CoreImage, Metal,
AVFoundation, CoreHaptics, GameController, ScreenCaptureKit, ModelIO, SceneKit,
UniformTypeIdentifiers, PDFKit, and QuickLook. This includes the complete class
and protocol surface visible through the SDK umbrella header, together with the
required enums, options, types, categories, and runtime helpers. A targeted set
of IOKit HID manager functions supports the managed HID adapter without pulling
in unrelated legacy IOKit declarations.

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

## Passive ScreenCaptureKit control plane

`ScreenCaptureControlPlanes.capability()` is the macOS 13+ readiness check for a future capture
flow. It returns only detached Kotlin values: the current `MacOsVersion`, baseline availability,
the result of the non-prompting `CGPreflightScreenCaptureAccess()` query, and whether the macOS 14+
content-sharing picker API is available. It never calls `CGRequestScreenCaptureAccess`, enumerates
`SCShareableContent`, starts an `SCStream`, invokes `SCScreenshotManager`, or displays a picker:

```kotlin
val capability = ScreenCaptureControlPlanes.capability()
if (capability.supportsMacOs13Baseline && capability.preflightScreenCaptureAccess) {
    // A later capture layer can be enabled without this check having requested permission.
}
```

`ScreenCaptureSources.inspect()` exposes the same deliberately passive model. ScreenCaptureKit is
loaded lazily only after the macOS 13 runtime guard; picker availability is strictly a macOS 14+
capability flag and does not resolve or call picker classes on earlier releases.

## ScreenCaptureKit frame leases

The frame-delivery layer keeps `SCStream`, `CMSampleBuffer`, `CVPixelBuffer`, and `IOSurface`
private to KFFI. When a higher-level capture flow delivers a `ScreenCaptureFrameLease`, it is valid
only for the duration of that handler. Call `copyPlanes(maxBytes)` inside the handler to obtain
bounded, Kotlin-owned `ByteArray` plane copies and their row/height metadata; no pointer or native
surface can escape:

```kotlin
fun consume(frame: ScreenCaptureFrameLease) {
    val planes = frame.copyPlanes(maxBytes = 8 * 1024 * 1024)
    val pixels = planes.first().bytes
    process(pixels)
}
```

KFFI locks the underlying pixel buffer read-only, verifies the total padded plane size before it
reads a base address, copies the bytes, and unlocks in `finally`. The lease closes automatically
after the callback returns (and may also be closed explicitly); later calls to `copyPlanes` fail.
Callback exceptions are contained, and closing an output first removes it from `SCStream`, then
waits for deliveries already admitted before releasing its Objective-C receiver.

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

## GameController haptics

`GameControllerHaptics` owns a CoreHaptics engine created for the controller's guaranteed default
locality. Its public API exposes neither the engine pointer, native completion blocks, nor
`NSError`; creation and startup failures are returned as Kotlin `Result` values, with
`GameControllerHapticsException` carrying only a copied domain, code, and message:

```kotlin
val deviceHaptics = GCDeviceHaptics(controller.haptics())
GameControllerHaptics.create(deviceHaptics).getOrThrow().use { haptics ->
    haptics.start().getOrThrow()
    runApplicationLoop()
}
```

Closing the owner stops and releases the engine exactly once.

## HID gamepad lifecycle

`HidManager` observes gamepads through an IOKit dispatch queue and emits immutable registry-ID
snapshots through the existing `HidDeviceLifecycleHandler`. Devices already supported by
`GCController` are suppressed so one physical gamepad is not reported through both APIs:

```kotlin
val hid = HidManager.create { event ->
    consumeRegistryId(event.registryId, event.connected)
}
try {
    runApplicationLoop()
} finally {
    hid.close()
}
```

`close()` cancels IOKit delivery before revoking callback admission. `isQuiescent` becomes true
only after the native cancel handler has run, all admitted handlers have returned, and the HID
manager plus dispatch queue have been released.
