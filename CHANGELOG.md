# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

---

## [Unreleased]

### Added
- Scoped AppKit drop-transfer helpers for borrowed dragging info, bounded `NSData` copies, and
  idempotent security-scoped URL access ownership.
- Revocable managed C callbacks for CoreGraphics event taps and display reconfiguration, plus
  immutable HID device lifecycle snapshots, with exception containment and quiescent teardown.
- Revocable managed Objective-C blocks for the six completion and handler ABI shapes needed by
  framework adapters, with clear-before-release teardown and quiescent callback ownership.
- Managed Objective-C callback signatures for `NSTextInputClient` ranges, points,
  rectangles, and out-ranges without exposing raw memory to Kotlin handlers.
- Managed peer-local AppKit pointer tracking with opaque, idempotent owners that install and
  revoke `NSTrackingArea` instances and lease `NSWindow.acceptsMouseMovedEvents` safely.
- Immutable managed AppKit `NSEvent` observations for Objective-C event callbacks,
  exposed through `ObjCMethodRouter.onNSEvent` without leaking borrowed native handles.
- Managed Objective-C `BOOL(id, SEL)` callbacks without explicit arguments via
  `ObjCMethodSignatures.Boolean` and `ObjCMethodRouter.onBoolean`, backed by
  the generated Objective-C callback helpers.
- Generated Objective-C helpers for managed `BOOL(id, SEL)` callbacks without explicit arguments,
  including typed callback allocation and installation on dynamic subclasses.
- Owner-safe typed AppKit queue posting for discrete and precise CoreGraphics
  scroll-wheel events.
- Generated required Objective-C protocol members for adopting classes, including
  borrowed `NSView.effectiveAppearance()` and `NSWindow.effectiveAppearance()` accessors.
- JVM-only `kffi-win32` module with generated low-level Win32 FFM bindings for
  selected `user32`, `kernel32`, `gdi32`, and `dwmapi` APIs.
- Windows integration coverage that creates a real window, verifies a native
  GDI screenshot, and uploads the captured PNG as a CI artifact.
- First standalone KFFI iteration, published as Maven Central snapshot artifacts
  under `org.graphiks`.
- Multiplatform memory primitives: `MemoryAllocator`, `MemoryBuffer`,
  `NativeAddress`, C-string helpers, and primitive-array marshaling.
- JVM Foreign Function & Memory downcall engine, including scalar calls and
  structs passed by value.
- Canonical JVM downcall shapes with cached generic fallback invocation and
  fixed-array struct layout support, while retaining specialized hot-path
  wrappers.
- Android native downcall engine backed by libffi, with typed call wrappers and
  generic signatures for scalars, pointers, floating-point values, nested
  structs, and fixed-size arrays.
- Callback runtime with token-based routing, lifecycle management, exception
  reporting, JVM upcalls, and Android libffi closures.
- Kotlin/Native implementations and tests for Apple, Linux, Windows, and
  Android Native targets.
- JVM, Native, and Android benchmark modules.
- Android host and connected-device test coverage in continuous integration.
- Snapshot publication and generated API documentation.
- JVM-only `kffi-posix` module with POSIX symbol lookup, `pollfd` layout
  helpers, and a non-blocking wakeup primitive imported from `poc-koreos`.
- Generated Linux bindings for mappings, POSIX and System V shared memory,
  `memfd`, file-descriptor operations, complete `poll`, and errno constants.
- JVM-only `kffi-wayland` module with low-level Wayland, XDG Shell, screencopy,
  and text-input FFM bindings imported from `poc-koreos`.
- JVM-only `kffi-x11` module with generated low-level X11 FFM bindings and a
  reproducible Docker/kextract generation pipeline.
- Core X11 drawing bindings for graphics contexts, colors, geometry primitives,
  and pixmaps, with a headless four-color screenshot integration test.
- JVM-only `kffi-objc` module with generated macOS Objective-C runtime,
  Foundation, and AppKit FFM bindings.
- Expanded the `kffi-objc` AppKit subset with window controllers, screen and
  input bindings, rendering resources, and controls.
- Expanded `kffi-objc` generation to the complete class and protocol surface of
  the selected Apple SDK frameworks.
- Added a macOS AppKit screenshot integration test, runnable locally and in CI,
  with the rendered PNG uploaded as a workflow artifact.
- Reproducible Docker/kextract generation pipeline for the kffi-wayland XDG
  Shell bindings.

### Changed
- JVM bytecode targets and Java compilation release are now aligned to JDK 25
  across `kffi`, `kffi-posix`, and the JVM benchmarks.
- Android callback ABI support now uses dynamically prepared libffi closures,
  routed userdata, and `jlong` carriers for pointers and structs-by-value on
  `arm64-v8a` and `x86_64`.
- Extracted KFFI from the former `shared` module; the repository now contains
  the standalone KFFI library and its benchmark modules.
- Updated the Android native artifact to support `arm64-v8a` and `x86_64`.
- Consolidated the test workflow and added Android SDK/NDK setup as a reusable
  GitHub Action.

### Fixed
- Managed Objective-C classes now isolate their native method implementations and callback routes
  across independent JVM classloaders.
- Managed AppKit `NSEvent` observations now snapshot modifier-change events
  without querying text-only properties.
- Managed AppKit `NSEvent` observations now snapshot mouse enter and exit events as
  tracking-area data without querying button-only properties.
- Managed AppKit `NSEvent` observations now preserve native pointer `deltaX` and `deltaY`
  values for pointer movement and drag routing.
- Generic Android downcalls now parse and validate declared signatures instead
  of treating every argument as a 64-bit carrier.
- Android test APKs now package the JNI fixture library required by
  instrumentation tests.
- Android host tests now run on JUnit Platform.
