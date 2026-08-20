# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

---

## [Unreleased]

### Added
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
- JVM-only `kff-posix` module with POSIX symbol lookup, `pollfd` layout
  helpers, and a non-blocking wakeup primitive imported from `poc-koreos`.
- JVM-only `kffi-wayland` module with low-level Wayland, XDG Shell, screencopy,
  and text-input FFM bindings imported from `poc-koreos`.
- Reproducible Docker/kextract generation pipeline for the kffi-wayland XDG
  Shell bindings.

### Changed
- JVM bytecode targets and Java compilation release are now aligned to JDK 25
  across `kffi`, `kff-posix`, and the JVM benchmarks.
- Android callback ABI support now uses dynamically prepared libffi closures,
  routed userdata, and `jlong` carriers for pointers and structs-by-value on
  `arm64-v8a` and `x86_64`.
- Extracted KFFI from the former `shared` module; the repository now contains
  the standalone KFFI library and its benchmark modules.
- Updated the Android native artifact to support `arm64-v8a` and `x86_64`.
- Consolidated the test workflow and added Android SDK/NDK setup as a reusable
  GitHub Action.

### Fixed
- Generic Android downcalls now parse and validate declared signatures instead
  of treating every argument as a 64-bit carrier.
- Android test APKs now package the JNI fixture library required by
  instrumentation tests.
- Android host tests now run on JUnit Platform.
