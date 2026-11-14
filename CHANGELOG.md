# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

---

## [Unreleased]

## [0.1.0] - 2026-11-14

First published release: the `kffi` runtime and its binding modules. Each item
links the pull requests that built it.

### Runtime

- Kotlin Multiplatform FFI runtime (`org.graphiks.kffi:kffi`) for JVM, Android,
  and Kotlin/Native, extracted from `wgpu4k-native`
  ([#2](https://github.com/Graphiks-org/kffi/pull/2)).
- JVM backend built on the Panama Foreign Function & Memory API: downcalls
  (scalars, structs by value, fixed arrays), upcalls, and cached canonical
  call shapes. JDK 25 bytecode
  ([#6](https://github.com/Graphiks-org/kffi/pull/6),
  [#7](https://github.com/Graphiks-org/kffi/pull/7)).
- Android backend with a Kotlin engine over JNI and an `arm64-v8a`/`x86_64`
  libffi closure path for callbacks. `minSdk` 28
  ([#8](https://github.com/Graphiks-org/kffi/pull/8)).
- Native backend on `kotlinx.cinterop` for iOS, tvOS, macOS, Linux, MinGW
  x64, and Android Native
  ([#2](https://github.com/Graphiks-org/kffi/pull/2),
  [#112](https://github.com/Graphiks-org/kffi/pull/112)).
- Memory primitives: `NativeAddress`, `MemoryBuffer`, `MemoryAllocator`
  (`memoryScope`, `globalMemory`), `CString`, and primitive-array marshaling
  ([#2](https://github.com/Graphiks-org/kffi/pull/2)).
- Unified memory safety contract: bounds-checked access, opt-in `unsafe`
  mode, and arena lifetime enforcement on the JVM
  ([#2](https://github.com/Graphiks-org/kffi/pull/2)).
- Callback runtime with token-based routing, lifecycle management, exception
  reporting, and quiescent revocation
  ([#2](https://github.com/Graphiks-org/kffi/pull/2),
  [#32](https://github.com/Graphiks-org/kffi/pull/32)).
- Published Native targets: `iosx64`, `iosarm64`, `iossimulatorarm64`,
  `tvosarm64`, `tvossimulatorarm64`, `macosx64`, `macosarm64`, `linuxx64`,
  `linuxarm64`, `mingwx64`, `androidnativearm64`, `androidnativex64`
  ([#2](https://github.com/Graphiks-org/kffi/pull/2),
  [#112](https://github.com/Graphiks-org/kffi/pull/112)).
- Benchmark modules for JVM (JMH), Kotlin/Native, and Android
  ([#2](https://github.com/Graphiks-org/kffi/pull/2)).

### Bindings

- `kffi-posix` (JVM, Linux): libc calls and constants for memory mappings,
  POSIX and System V shared memory, `memfd`, file descriptors, `poll`, errno,
  and the AF_UNIX socket surface including `SCM_RIGHTS` descriptor passing.
  `LinuxPosix` is the supported API, with typed `PosixException` carrying the
  captured `errno`
  ([#14](https://github.com/Graphiks-org/kffi/pull/14),
  [#16](https://github.com/Graphiks-org/kffi/pull/16),
  [#26](https://github.com/Graphiks-org/kffi/pull/26),
  [#121](https://github.com/Graphiks-org/kffi/pull/121),
  [#139](https://github.com/Graphiks-org/kffi/pull/139)).
- `kffi-evdev` (JVM, Linux): evdev and libudev bindings for gamepad capability
  probing, event decode/encode, hotplug monitoring, and a managed `uinput`
  virtual gamepad with force-feedback support
  ([#136](https://github.com/Graphiks-org/kffi/pull/136)).
- `kffi-pipewire` (JVM, Linux): consumer-side PipeWire stream bindings with a
  managed facade that owns teardown order and the event upcalls
  ([#142](https://github.com/Graphiks-org/kffi/pull/142)).
- `kffi-wayland` (JVM, Linux): generated core and extension protocol bindings,
  plus a managed layer covering `WaylandClient`, the registry, surfaces,
  xdg-shell toplevels, `wl_seat` (pointer, keyboard, text input), data devices,
  outputs, and shm-backed buffers
  ([#15](https://github.com/Graphiks-org/kffi/pull/15),
  [#17](https://github.com/Graphiks-org/kffi/pull/17),
  [#20](https://github.com/Graphiks-org/kffi/pull/20),
  [#115](https://github.com/Graphiks-org/kffi/pull/115),
  [#116](https://github.com/Graphiks-org/kffi/pull/116),
  [#117](https://github.com/Graphiks-org/kffi/pull/117),
  [#119](https://github.com/Graphiks-org/kffi/pull/119),
  [#124](https://github.com/Graphiks-org/kffi/pull/124),
  [#125](https://github.com/Graphiks-org/kffi/pull/125),
  [#129](https://github.com/Graphiks-org/kffi/pull/129),
  [#132](https://github.com/Graphiks-org/kffi/pull/132),
  [#133](https://github.com/Graphiks-org/kffi/pull/133),
  [#134](https://github.com/Graphiks-org/kffi/pull/134),
  [#146](https://github.com/Graphiks-org/kffi/pull/146)).
- `kffi-x11` (JVM, Linux): generated X11 bindings for graphics contexts,
  colors, drawing primitives, pixmaps, windows, XIM, and error handlers, with
  ABI-checked event storage
  ([#18](https://github.com/Graphiks-org/kffi/pull/18),
  [#21](https://github.com/Graphiks-org/kffi/pull/21),
  [#27](https://github.com/Graphiks-org/kffi/pull/27),
  [#113](https://github.com/Graphiks-org/kffi/pull/113)).
- `kffi-objc` (JVM, macOS): generated Objective-C runtime, Foundation, AppKit,
  and companion Apple framework bindings, plus a managed layer for windows,
  text input, event taps, display capture, ScreenCaptureKit, GameController,
  CoreHaptics, IOKit HID, and Objective-C callbacks and blocks
  ([#19](https://github.com/Graphiks-org/kffi/pull/19),
  [#22](https://github.com/Graphiks-org/kffi/pull/22),
  [#23](https://github.com/Graphiks-org/kffi/pull/23),
  [#24](https://github.com/Graphiks-org/kffi/pull/24),
  [#33](https://github.com/Graphiks-org/kffi/pull/33),
  [#34](https://github.com/Graphiks-org/kffi/pull/34),
  [#35](https://github.com/Graphiks-org/kffi/pull/35),
  [#36](https://github.com/Graphiks-org/kffi/pull/36),
  [#38](https://github.com/Graphiks-org/kffi/pull/38),
  [#39](https://github.com/Graphiks-org/kffi/pull/39),
  [#40](https://github.com/Graphiks-org/kffi/pull/40),
  [#41](https://github.com/Graphiks-org/kffi/pull/41),
  [#42](https://github.com/Graphiks-org/kffi/pull/42),
  [#43](https://github.com/Graphiks-org/kffi/pull/43),
  [#44](https://github.com/Graphiks-org/kffi/pull/44),
  [#45](https://github.com/Graphiks-org/kffi/pull/45),
  [#46](https://github.com/Graphiks-org/kffi/pull/46),
  [#47](https://github.com/Graphiks-org/kffi/pull/47),
  [#48](https://github.com/Graphiks-org/kffi/pull/48),
  [#49](https://github.com/Graphiks-org/kffi/pull/49),
  [#50](https://github.com/Graphiks-org/kffi/pull/50),
  [#51](https://github.com/Graphiks-org/kffi/pull/51),
  [#52](https://github.com/Graphiks-org/kffi/pull/52),
  [#54](https://github.com/Graphiks-org/kffi/pull/54),
  [#55](https://github.com/Graphiks-org/kffi/pull/55),
  [#56](https://github.com/Graphiks-org/kffi/pull/56),
  [#57](https://github.com/Graphiks-org/kffi/pull/57),
  [#58](https://github.com/Graphiks-org/kffi/pull/58),
  [#59](https://github.com/Graphiks-org/kffi/pull/59),
  [#60](https://github.com/Graphiks-org/kffi/pull/60),
  [#62](https://github.com/Graphiks-org/kffi/pull/62),
  [#63](https://github.com/Graphiks-org/kffi/pull/63),
  [#64](https://github.com/Graphiks-org/kffi/pull/64),
  [#65](https://github.com/Graphiks-org/kffi/pull/65),
  [#66](https://github.com/Graphiks-org/kffi/pull/66),
  [#67](https://github.com/Graphiks-org/kffi/pull/67),
  [#68](https://github.com/Graphiks-org/kffi/pull/68),
  [#69](https://github.com/Graphiks-org/kffi/pull/69),
  [#70](https://github.com/Graphiks-org/kffi/pull/70),
  [#72](https://github.com/Graphiks-org/kffi/pull/72),
  [#73](https://github.com/Graphiks-org/kffi/pull/73),
  [#74](https://github.com/Graphiks-org/kffi/pull/74),
  [#75](https://github.com/Graphiks-org/kffi/pull/75),
  [#76](https://github.com/Graphiks-org/kffi/pull/76),
  [#77](https://github.com/Graphiks-org/kffi/pull/77),
  [#78](https://github.com/Graphiks-org/kffi/pull/78),
  [#79](https://github.com/Graphiks-org/kffi/pull/79),
  [#80](https://github.com/Graphiks-org/kffi/pull/80),
  [#81](https://github.com/Graphiks-org/kffi/pull/81),
  [#82](https://github.com/Graphiks-org/kffi/pull/82),
  [#83](https://github.com/Graphiks-org/kffi/pull/83),
  [#84](https://github.com/Graphiks-org/kffi/pull/84),
  [#85](https://github.com/Graphiks-org/kffi/pull/85),
  [#86](https://github.com/Graphiks-org/kffi/pull/86),
  [#87](https://github.com/Graphiks-org/kffi/pull/87),
  [#88](https://github.com/Graphiks-org/kffi/pull/88),
  [#89](https://github.com/Graphiks-org/kffi/pull/89),
  [#90](https://github.com/Graphiks-org/kffi/pull/90),
  [#91](https://github.com/Graphiks-org/kffi/pull/91),
  [#92](https://github.com/Graphiks-org/kffi/pull/92),
  [#93](https://github.com/Graphiks-org/kffi/pull/93),
  [#94](https://github.com/Graphiks-org/kffi/pull/94),
  [#96](https://github.com/Graphiks-org/kffi/pull/96),
  [#97](https://github.com/Graphiks-org/kffi/pull/97),
  [#98](https://github.com/Graphiks-org/kffi/pull/98)).
- `kffi-coretext` (JVM, macOS): source-byte font creation, explicit native
  reference release, raw CoreText metrics, and a font catalog
  ([#99](https://github.com/Graphiks-org/kffi/pull/99),
  [#101](https://github.com/Graphiks-org/kffi/pull/101)).
- `kffi-harfbuzz`: typed HarfBuzz owners (blob, face, font, buffer), shaping,
  variable fonts, glyph extents, and ligature carets. Published for JVM
  (macOS/Linux, x64 and arm64), Android, iOS, and the web (`js`/`wasmJs`),
  with hash-verified binaries embedded in the artifacts
  ([#100](https://github.com/Graphiks-org/kffi/pull/100),
  [#104](https://github.com/Graphiks-org/kffi/pull/104),
  [#105](https://github.com/Graphiks-org/kffi/pull/105),
  [#106](https://github.com/Graphiks-org/kffi/pull/106),
  [#107](https://github.com/Graphiks-org/kffi/pull/107),
  [#108](https://github.com/Graphiks-org/kffi/pull/108),
  [#109](https://github.com/Graphiks-org/kffi/pull/109),
  [#111](https://github.com/Graphiks-org/kffi/pull/111)).
- `kffi-fontconfig` (JVM, Linux): enumeration of the fonts reported by the
  active Fontconfig configuration
  ([#102](https://github.com/Graphiks-org/kffi/pull/102)).
- `kffi-directwrite` (JVM, Windows): enumeration of the DirectWrite system
  font collection
  ([#103](https://github.com/Graphiks-org/kffi/pull/103)).
- `kffi-win32` (JVM, Windows): generated Win32 bindings for `user32`,
  `kernel32`, `gdi32`, `dwmapi`, `ole32`, and `ninput`, plus a managed layer
  for windows and message routing, keyboard and pointer input, raw input,
  XInput, OLE drag and drop, text services, touch and pen, display inventory,
  and window operations
  ([#25](https://github.com/Graphiks-org/kffi/pull/25),
  [#29](https://github.com/Graphiks-org/kffi/pull/29),
  [#114](https://github.com/Graphiks-org/kffi/pull/114),
  [#118](https://github.com/Graphiks-org/kffi/pull/118),
  [#120](https://github.com/Graphiks-org/kffi/pull/120),
  [#122](https://github.com/Graphiks-org/kffi/pull/122),
  [#123](https://github.com/Graphiks-org/kffi/pull/123),
  [#126](https://github.com/Graphiks-org/kffi/pull/126),
  [#127](https://github.com/Graphiks-org/kffi/pull/127),
  [#128](https://github.com/Graphiks-org/kffi/pull/128),
  [#131](https://github.com/Graphiks-org/kffi/pull/131),
  [#135](https://github.com/Graphiks-org/kffi/pull/135),
  [#137](https://github.com/Graphiks-org/kffi/pull/137),
  [#138](https://github.com/Graphiks-org/kffi/pull/138),
  [#140](https://github.com/Graphiks-org/kffi/pull/140),
  [#141](https://github.com/Graphiks-org/kffi/pull/141),
  [#143](https://github.com/Graphiks-org/kffi/pull/143),
  [#144](https://github.com/Graphiks-org/kffi/pull/144)).

### Build and CI

- Reproducible kextract generation pipelines in Docker for the generated
  binding modules, with the pinned generator revision tracked
  ([#17](https://github.com/Graphiks-org/kffi/pull/17),
  [#18](https://github.com/Graphiks-org/kffi/pull/18),
  [#25](https://github.com/Graphiks-org/kffi/pull/25),
  [#136](https://github.com/Graphiks-org/kffi/pull/136),
  [#142](https://github.com/Graphiks-org/kffi/pull/142)).
- Snapshot publication to Maven Central from `master`, and release publication
  from `v*` tags
  ([#3](https://github.com/Graphiks-org/kffi/pull/3),
  [#4](https://github.com/Graphiks-org/kffi/pull/4)).
- Published coordinates follow the Kalligraphie convention: the group is
  `org.graphiks.kffi` and artifact ids drop the `kffi-` prefix
  ([#147](https://github.com/Graphiks-org/kffi/pull/147)).
- Continuous integration on macOS, Ubuntu, and Windows, with Android host and
  device tests, Native target compilation, and the Wayland, X11, Objective-C,
  and Win32 screenshot integration jobs
  ([#5](https://github.com/Graphiks-org/kffi/pull/5),
  [#9](https://github.com/Graphiks-org/kffi/pull/9),
  [#12](https://github.com/Graphiks-org/kffi/pull/12),
  [#24](https://github.com/Graphiks-org/kffi/pull/24),
  [#29](https://github.com/Graphiks-org/kffi/pull/29),
  [#30](https://github.com/Graphiks-org/kffi/pull/30),
  [#31](https://github.com/Graphiks-org/kffi/pull/31),
  [#111](https://github.com/Graphiks-org/kffi/pull/111)).

[Unreleased]: https://github.com/Graphiks-org/kffi/compare/v0.1.0...HEAD
[0.1.0]: https://github.com/Graphiks-org/kffi/releases/tag/v0.1.0
