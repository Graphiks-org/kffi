# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

---

## [Unreleased]

## [0.1.0] - 2026-11-14

First published release: the `kffi` runtime and its binding modules.

### Runtime

- Kotlin Multiplatform FFI runtime (`org.graphiks.kffi:kffi`) for JVM, Android,
  and Kotlin/Native.
- JVM backend built on the Panama Foreign Function & Memory API: downcalls
  (scalars, structs by value, fixed arrays), upcalls, and cached canonical
  call shapes. JDK 25 bytecode.
- Android backend with a Kotlin engine over JNI and an `arm64-v8a`/`x86_64`
  libffi closure path for callbacks. `minSdk` 28.
- Native backend on `kotlinx.cinterop` for iOS, tvOS, macOS, Linux, MinGW
  x64, and Android Native.
- Memory primitives: `NativeAddress`, `MemoryBuffer`, `MemoryAllocator`
  (`memoryScope`, `globalMemory`), `CString`, and primitive-array marshaling.
- Unified memory safety contract: bounds-checked access, opt-in `unsafe`
  mode, and arena lifetime enforcement on the JVM.
- Callback runtime with token-based routing, lifecycle management, exception
  reporting, and quiescent revocation.
- Published Native targets: `iosx64`, `iosarm64`, `iossimulatorarm64`,
  `tvosarm64`, `tvossimulatorarm64`, `macosx64`, `macosarm64`, `linuxx64`,
  `linuxarm64`, `mingwx64`, `androidnativearm64`, `androidnativex64`.
- Benchmark modules for JVM (JMH), Kotlin/Native, and Android.

### Bindings

- `kffi-posix` (JVM, Linux): libc calls and constants for memory mappings,
  POSIX and System V shared memory, `memfd`, file descriptors, `poll`, errno,
  and the AF_UNIX socket surface including `SCM_RIGHTS` descriptor passing.
  `LinuxPosix` is the supported API, with typed `PosixException` carrying the
  captured `errno`.
- `kffi-evdev` (JVM, Linux): evdev and libudev bindings for gamepad capability
  probing, event decode/encode, hotplug monitoring, and a managed `uinput`
  virtual gamepad with force-feedback support.
- `kffi-pipewire` (JVM, Linux): consumer-side PipeWire stream bindings with a
  managed facade that owns teardown order and the event upcalls.
- `kffi-wayland` (JVM, Linux): generated core and extension protocol bindings,
  plus a managed layer covering `WaylandClient`, the registry, surfaces,
  xdg-shell toplevels, `wl_seat` (pointer, keyboard, text input), data devices,
  outputs, and shm-backed buffers.
- `kffi-x11` (JVM, Linux): generated X11 bindings for graphics contexts,
  colors, drawing primitives, pixmaps, windows, XIM, and error handlers, with
  ABI-checked event storage.
- `kffi-objc` (JVM, macOS): generated Objective-C runtime, Foundation, AppKit,
  and companion Apple framework bindings, plus a managed layer for windows,
  text input, event taps, display capture, ScreenCaptureKit, GameController,
  CoreHaptics, IOKit HID, and Objective-C callbacks and blocks.
- `kffi-coretext` (JVM, macOS): source-byte font creation, explicit native
  reference release, raw CoreText metrics, and a font catalog.
- `kffi-harfbuzz`: typed HarfBuzz owners (blob, face, font, buffer), shaping,
  variable fonts, glyph extents, and ligature carets. Published for JVM
  (macOS/Linux, x64 and arm64), Android, iOS, and the web (`js`/`wasmJs`),
  with hash-verified binaries embedded in the artifacts.
- `kffi-fontconfig` (JVM, Linux): enumeration of the fonts reported by the
  active Fontconfig configuration.
- `kffi-directwrite` (JVM, Windows): enumeration of the DirectWrite system
  font collection.
- `kffi-win32` (JVM, Windows): generated Win32 bindings for `user32`,
  `kernel32`, `gdi32`, `dwmapi`, `ole32`, and `ninput`, plus a managed layer
  for windows and message routing, keyboard and pointer input, raw input,
  XInput, OLE drag and drop, text services, touch and pen, display inventory,
  and window operations.

[Unreleased]: https://github.com/Graphiks-org/kffi/compare/v0.1.0...HEAD
[0.1.0]: https://github.com/Graphiks-org/kffi/releases/tag/v0.1.0
