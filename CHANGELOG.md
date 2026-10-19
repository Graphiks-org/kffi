# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

---

## [Unreleased]

### Added
- Managed Win32 XInput polling frontier for the four user gamepad slots:
  `XInputGetState`/`XInputSetState`/`XInputGetCapabilities`/
  `XInputGetBatteryInformation` over the `Xinput9_1_0.dll` map, every struct
  copied into scalars before return (`ERROR_DEVICE_NOT_CONNECTED` surfaces
  as a typed null, never as an invented pad), typed failures for the other
  error codes, out-of-range slot indices refused up front, and thread-safe
  polling documented by the API. Generated bindings gain the four functions
  and the `_XINPUT_STATE`/`_XINPUT_GAMEPAD`/`_XINPUT_VIBRATION`/
  `_XINPUT_CAPABILITIES`/`_XINPUT_BATTERY_INFORMATION` layouts.
- Managed Win32 multi-monitor display inventory: one synchronous
  `EnumDisplayMonitors` walk with a process-lifetime callback stub and a
  thread-confined collector, per-monitor `GetMonitorInfoW` bounds/work area,
  `GetDpiForMonitor` (MDT_EFFECTIVE_DPI) scale, and `EnumDisplaySettingsExW`
  mode walks (current + indexed, bounded) copied into scalars — a monitor
  whose scale or modes cannot be read fails the whole snapshot with a typed
  code instead of being published with approximated values. Generated
  bindings gain `EnumDisplayMonitors`, `EnumDisplaySettingsExW`,
  `GetRawInputDeviceList`-era companions `GetRegisteredRawInputDevices`
  (already listed), `GetDpiForMonitor` via the new Shcore.dll map, and the
  `_devicemodeW` layout.
- Managed Win32 raw-input registration frontier: one process-lifetime
  generic-desktop mouse registration per process with a foreign-registration
  preflight (`GetRegisteredRawInputDevices` refuses with a typed code instead
  of stealing), foreground-only delivery (the OS refuses RIDEV_INPUTSINK for
  the mouse usage with ERROR_INVALID_PARAMETER), and bounded `GetRawInputData`
  copies of relative `RAWMOUSE` deltas during the message — absolute payloads,
  other devices and non-mouse types return no value instead of being
  approximated. Close performs no native mutation: every `RIDEV_REMOVE` form
  is refused by the OS with ERROR_INVALID_FLAGS on the observed hosts, so the
  registration is documented as process-lifetime. Generated bindings gain
  `RegisterRawInputDevices`, `GetRawInputData`, `GetRawInputDeviceList`,
  `GetRegisteredRawInputDevices` and the `RAWINPUTDEVICE`/`RAWINPUTHEADER`/
  `RAWMOUSE`/`RAWKEYBOARD`/`RAWHID`/`RAWINPUTDEVICELIST` layouts (141
  functions total).
- `kffi-posix` gains the AF_UNIX socket surface the D-Bus control plane
  rides: socket/socketpair/bind/listen/accept/accept4/connect/shutdown/
  send/recv/sendmsg/recvmsg plus getuid/geteuid/getpid, the
  sockaddr_un/iovec/cmsghdr/msghdr layouts, the AF_/PF_/SOCK_/MSG_/
  SCM_/SOL_/SHUT_ constants, and a committed alias reconciling glibc's
  transparent-union address typedefs (the x11 pattern). The pinned
  kextract revision moves to the recorded submodule SHA so regeneration
  works from a fresh clone, and the managed `LinuxPosix` facade exposes
  the socket calls with captured errno. LinuxPosixSocketTest proves the
  stream pair, the unix-path connect and the SCM_RIGHTS fd passing.
- New `kffi-evdev` module, generated through the kextract pipeline
  (`scripts/gen-kffi-evdev.sh`, `docker/kffi-evdev-codegen`) from the kernel
  uapi and libudev headers: ioctl numbers and ABI constants follow the
  headers instead of being transcribed, the `input_id`/`input_absinfo`/
  `input_event` layouts and the 48-byte `ff_effect` storage (union flattened
  per the x11 Storage pattern) are emitted with named accessors, and the
  variadic `ioctl`/`open`/`fcntl` bind one address-register slot serving
  both pointer and zero-extended integer arguments. The managed layer adds
  gamepad capability probing, event decode/encode, errno through
  `__errno_location`, non-blocking libudev node enumeration plus the
  hotplug monitor filter, and the uinput oracle: a managed virtual gamepad
  (UI_DEV_SETUP/UI_ABS_SETUP/UI_DEV_CREATE, event injection, the FF
  upload/erase BEGIN/END handshake, forwarded play/stop requests, sysfs
  name discovery).
- Managed Win32 OLE drop frontier: balanced `OleInitialize`/`OleUninitialize`
  STA services (S_OK and S_FALSE consumed exactly once, no silent apartment
  conversion), a per-HWND managed `IDropTarget` COM object (`DragEnter`,
  `DragOver`, `DragLeave`, `Drop`) whose application callbacks are revoked
  before COM cleanup and whose `pdwEffect` output is always defined, and
  bounded `IDataObject` reads: format enumeration, `QueryGetData` probes,
  size-checked `HGLOBAL` copies with systematic `ReleaseStgMedium`, and
  retained `IStream` references that stay readable after the native callback
  returns. Generated bindings gain `OleInitialize`, `OleUninitialize`,
  `RegisterDragDrop`, `RevokeDragDrop`, `ReleaseStgMedium`,
  `CreateStreamOnHGlobal`, `GlobalAlloc`/`GlobalLock`/`GlobalUnlock`/
  `GlobalSize`, `RegisterClipboardFormatW`, `GetPropW` and the
  `FORMATETC`/`STGMEDIUM` layouts (137 functions total).
- Managed Win32 STA text services with a revision-neutral UTF-16 document protocol,
  ITextStoreACP, composition sinks, input scopes, bounded character delivery and
  screen caret geometry. Application callbacks are revoked before COM cleanup.
- Bounded copies of native touch/pen frame history, mask-validated optional pen
  attributes, promoted-mouse provenance and full client/screen coordinate conversion.
- Owned Windows Interaction Context with verified screen-pixel configuration,
  incremental manipulation/double-tap callbacks and quiescent destruction.
- Separate `native-test-support` JVM classifier for independent TSF edit sessions
  and controlled native touch injection; no injection API in production artifacts.
- Managed Win32 window primitives: checked topmost levels, window-owned flashing,
  native system menu/move/resize, WDA_MONITOR display-affinity readback, owned
  RGBA8 icons/cursors, and foreground confinement with foreign-clip preservation.
- Checked Win32 window property snapshots, title/style/bounds operations,
  per-window DPI frame conversion, monitor bounds and native track limits.
  Native layouts remain confined to the managed Win32 module.

### Fixed
- Keep the Win32 raw-input Windows platform gate in the public
  `register`/`hasRegistration` entry points only: the port-injected path used
  by portable tests no longer throws on non-Windows hosts (publication
  blocker on macOS).
- Confirm native DOWN/UP delivery to the test HWND before measured touch sequences,
  even when foreground/focus readback already matches the target.
- Wait for bounded UI queue quiescence after native test injection, so posted
  window messages cannot leave the final pointer release undispatched.
- Bind TSF caret geometry to the accepted document and caret; provisional native
  selection or composition changes return `TS_E_NOLAYOUT` until fresh geometry.
- Preserve pointer-frame deduplication across interaction-context reset; native
  packet history can still contain frames submitted before the reset.
- Intersect pointer confinement with the visible virtual desktop and register
  clip ownership before readback, so off-screen normalization or readback failure
  cannot leave a successful native write outside the release path.
- `wl_shm.create_pool` is marshaled through the fixed-arity
  `wl_proxy_marshal_array_flags` with an explicit `wl_argument` array: the
  variadic `wl_proxy_marshal_flags` downcall can deliver a corrupted fd
  argument (libwayland reads the byte size instead of the descriptor), which
  fails its dup and poisons the connection.
- `wl_shm_pool.create_buffer` moves to the same fixed-arity array marshal
  (opcode 0, arguments at their signature indices): on several JVM
  environments the variadic downcall drops or shifts its variadic
  arguments, which made the server reject the buffer request.
- The wakeup syscalls and `nativePoll` read errno through
  `__errno_location()` instead of capture-state stubs.
- Managed `wl_output` bindings (`WaylandOutput`): bind an advertised output
  global and deliver its accumulated state at every `done` batching point
  (geometry, modes, scale, name, description payloads copied in the upcall);
  teardown via `wl_output.release` with the full five-parameter marshal.
  Details: bind an advertised output
  global, copy geometry/mode/scale/name payloads inside the upcalls and
  deliver the accumulated state at every `done` batching point; teardown
  through `wl_output.release` with its full five-parameter marshal.
- `wl_surface.set_buffer_scale` exposed on the managed surface (opcode 8).
- Managed `wl_seat` bindings (`WaylandSeat`): capability-gated
  `get_pointer`/`get_keyboard` sub-objects, full v9 pointer event set with
  `wl_fixed` decoded from int32, raw keyboard events (keymap descriptor,
  enter with the pressed-keys array copied, leave, key, modifiers,
  repeat_info), and an injection harness over the authored
  `zwlr_virtual_pointer`/`zwp_virtual_keyboard` interfaces.
- The frame-listener revocation gate was inverted and silently dropped
  every live frame callback; the handshake mapping proof now genuinely
  requires the presentation frame.
- Managed `wl_data_device`/`wl_data_offer` bindings: one data device per
  seat through the array marshal with a single native listener fanned
  out to revocable consumers (data_offer, enter with wl_fixed decoded,
  leave, motion, drop, selection); the offer collects MIME announces
  and action changes, and marshals accept (nullable mime), receive (the
  static-inline helper delegates to wl_proxy_receive — the fd is owned
  by the caller), finish and destroy.
- Managed `zwp_text_input_v3` bindings (`WaylandTextInput`): per-seat
  creation through the array marshal, state requests (enable, disable,
  surrounding text with UTF-8 byte offsets, change cause, content type,
  cursor rectangle) sealed by commit, and IME events (enter/leave,
  preedit/commit strings, delete-surrounding byte counts) batched at
  every done(serial) with payloads copied in the upcall. The registry
  bind now carries the real interface name (a mismatched name string is
  a protocol error).
- Interactive toplevel operations: `xdg_toplevel` move and resize marshal
  with the seat object and the input serial, `set_min_size` and
  `set_max_size` take effect at the next commit, `set_fullscreen` targets
  the compositor-chosen output when none is given and
  `unset_fullscreen` returns to windowed. The sway proof documents the
  serial semantics: validation is compositor-dependent, so serial
  eligibility is a consumer-side discipline.
- `kffi-posix`: the wakeup downcall handles are cached per (symbol,
  descriptor, options) instead of being rebuilt for every call. The per-call
  stub churn destabilised the JVM's FFM runtime — after a burst of wakeup
  syscalls, an unrelated later downcall received a corrupted argument
  (observed as a wayland pool fd failing its dup).

### Added
- `kffi-win32.managed.Win32Keyboard` copies key packets and keyboard state and translates logical characters without changing the Windows dead-key buffer. `Win32Pointer` owns mouse-leave tracking, signed screen/client conversion and wheel-settings buffers. The generated User32 allowlist includes their five missing input functions.
- `:kffi-win32` allowlists `InvalidateRect` and `ValidateRect` and regenerates the bindings: the phase 3 surface contract of the Win32 backend needs invalidation requests and the bounded paint drain.
- `kffi-win32.managed` routes window messages to N windows: `Win32WndProcBridge` resolves a per-thread creation slot (messages arriving inside `CreateWindowExW`) and a permanent hwnd table, removed before destroy so a reused address never reaches a revoked owner; `Win32ManagedFunctions.wndProc` exposes the revocable delivery route and windows own the binding. New `Win32ManagedWindow`: a managed top-level window whose handler owns the `WM_CLOSE` decision.
- `WaylandClient.displayProxyAddress`: the native `wl_display` pointer address
  for external renderer integrations, valid until the client is closed.
- `:kffi-win32` exposes `IsWindow` and `FindWindowExW` for validating native window handles and finding child windows.
- `kffi-win32.managed`: a handwritten managed layer over the generated Win32 bindings — WNDCLASSEXW/MSG Win64 ABI layouts, a process-lifetime WNDPROC trampoline bridge with per-userdata routes, a revocable WNDPROC registration built on the callback runtime (quiescence after close, exceptions contained at the native boundary), and a never-shown control window with idempotent close. The module now depends on the `kffi` core.
- `kffi-x11` exposes generated `XInitThreads`, `XMapRaised`, `XMoveResizeWindow`, and `XSetErrorHandler` bindings, plus ABI-checked `XErrorEvent` storage and field accessors for native X11 error callbacks.
- `:kffi` gains `tvosArm64` and `tvosSimulatorArm64` targets, so native libraries can be bound to tvOS the same way as iOS and macOS.
- `:kffi-harfbuzz` gains `js` and `wasmJs` targets: the pinned HarfBuzz 14.3.0 revision is compiled to WebAssembly by the new `:kffi-harfbuzz-wasm-native` module, an authored JS surface wraps the Emscripten module, and the Kotlin bindings reproduce the JVM shaping output bit for bit under Node. The web runtime is embedded in the published klibs.
- Managed Wayland binding (`kffi-wayland.managed`): a typed `WaylandClient`
  facade (connect, registry, roundtrip, dispatch, prepared read/cancel, flush,
  typed two-fd `pollForEvents` with captured errno, idempotent close owning
  all native segments and upcall arenas) and a revocable `wl_registry`
  globals listener with quiescence after revoke, immediate payload copy, and
  consumer exceptions routed to a configured reporter instead of crossing the
  native upcall. The registry is created through the generic
  `wl_proxy_marshal_flags` marshal and listeners are installed through the
  real `wl_proxy_add_listener`: `wl_display_get_registry`,
  `wl_registry_add_listener` and `wl_registry_bind` are `static inline`
  helpers whose symbols exist in no distribution of libwayland-client (the
  dead downcalls in `Wayland_h.kt` are now flagged as such).
- Managed Wayland windowing (`kffi-wayland.managed`): typed `WaylandSurface`
  (commit, attach with full buffer damage, one-shot frame callbacks,
  enter/leave observers), `WaylandXdgSurface` (per-serial configure
  observation and acknowledgement), `WaylandToplevel` (title/app id,
  configure size and copied states array, close event) and managed
  shm-backed ARGB8888 buffers with release observers, with multi-consumer
  listener dispatch and deterministic teardown. All protocol requests go
  through the generic `wl_proxy_marshal_flags` marshal, and
  `wl_registry.bind` passes the interface name as a real string pointer.

### Changed
- X11 storage types drop the redundant `Kffi` prefix (for example, `XEventStorage` and `XErrorEventStorage`); the native-name aliases such as `XImage` and `XErrorEvent` remain available.
- `CGDisplaySnapshot.pixelWidth` and `pixelHeight` are renamed to `pointWidth` and `pointHeight`.
  The underlying `CGDisplayPixelsWide`/`CGDisplayPixelsHigh` accessors predate Retina displays and
  report the display size in the global display coordinate space in points, never framebuffer
  pixels; the framebuffer size remains available as the current display mode's pixel size.

### Fixed
- The X11 integration runner keeps Xvfb alive without resetting between clients, avoiding intermittent `XOpenDisplay` failures between tests.
- Objective-C methods returning aggregates larger than two eightbytes now work on
  x86_64 macOS, where Panama rejected the heap-backed struct-return buffer with
  "Heap segment not allowed"; the struct storage is now allocated natively.
- Managed ScreenCaptureKit source resolution now closes a resolved native token
  when cancellation wins its completion race.
- Generated Objective-C global lookups now load `AppKit.framework`, allowing
  `NSWorkspaceAccessibilityDisplayOptionsDidChangeNotification` to resolve on macOS.

### Added
- Optional JVM-only `kffi-fontconfig` module that enumerates the fonts Fontconfig
  reports for the active configuration: `listFonts()` loads the configuration with
  `FcInitLoadConfigAndFonts`, reads the system set with `FcConfigGetFonts`, and
  reads `FC_FAMILY`, `FC_STYLE`, `FC_FILE` and `FC_POSTSCRIPT_NAME` per pattern.
  The loaded configuration is destroyed before returning; no native reference
  escapes.
- Optional JVM-only `kffi-directwrite` module that enumerates the DirectWrite
  system font collection on Windows: `systemFonts()` creates the shared factory
  with `DWriteCreateFactory`, walks `IDWriteFontCollection` and returns family,
  face, PostScript name, file path and numeric weight/stretch/style per face.
  COM interfaces are dispatched through a small vtable helper over the downcall
  engine and every acquired reference is released before returning; no native
  reference escapes.
- JVM macOS `CoreTextFontCatalog` enumerates the CoreText activated registry:
  available family names (`CTFontManagerCopyAvailableFontFamilyNames`) and one
  descriptor per font via `CTFontCollectionCreateFromAvailableFonts` /
  `CTFontCollectionCreateMatchingFontDescriptors`, exposing family, style,
  PostScript name and registered file path. Every owned CoreFoundation reference
  is released before returning; no native reference escapes.
- Optional JVM-only `kffi-coretext` module with source-byte font creation, explicit native
  reference release, raw CoreText metrics, detached affine matrices and bounded Darwin reads.
- Optional `kffi-harfbuzz` module with typed HarfBuzz owners (blob, face, font, buffer),
  explicit safe release, shaping, glyph flags, advances and GDEF ligature carets, with the audited
  macOS/Linux x64+arm64 binaries embedded and hash-verified.
- `kffi-harfbuzz` variable-font support: `HarfBuzzFont.setVariations` applies user-space axis
  values and `setVarCoordsNormalized` applies 2.14 fixed-point coordinates before the font is made
  immutable, and `glyphVerticalAdvance` reads the negated `vmtx` advance. Proven against a
  project-generated variable test font whose expected metrics were frozen with external `hb-shape`.
- `kffi-harfbuzz` glyph ink extents: `HarfBuzzFont.glyphExtents` reads `hb_glyph_extents_t`
  (`x`/`y` bearing, width, height) in the current scale and raises `HarfBuzzBindingException` when
  HarfBuzz reports none for the glyph. Proven on the project-generated variable font, whose `A`
  ink-box width varies 400/300/600 across the `wght` axis, with expected values frozen by external
  `hb-shape` and cross-checked against the bundled library.
- Optional ScreenCaptureKit minimum frame intervals encoded as valid nanosecond CoreMedia times,
  preserving caller-requested pacing in the managed stream configuration.
- A distinct ScreenCaptureKit reservation cancellation result for a host picker dismissed before
  selection, preserving user cancellation separately from native failures.
- Generated CoreVideo pixel-width access for ScreenCaptureKit frame leases, so consumers can
  report the exact image width without inferring it from padded row strides.
- A pointer-free ScreenCaptureKit reservation that resolves a display, window, or host-picker
  choice before an explicit stream start, allowing callers to release the selected native target
  without ever producing a frame.
- A managed macOS 14+ ScreenCaptureKit host picker that resolves its selected
  filter into a pointer-free stream session, with callback-safe observer teardown.
- Generated borrowed `NSDraggingDestination` receivers and managed `NSPoint(id, SEL)`
  callbacks via `ObjCMethodSignatures.Point` and `ObjCMethodRouter.onPoint`, with
  exception fallbacks and ABI-zero returns after route revocation.
- Pointer-free AppKit window-geometry operations that resolve CoreGraphics physical positions
  through their matching AppKit screens and certify effective outer bounds with Window Server
  readback, including mixed-scale and display-straddling windows.
- Stable, non-negative I/O display-mode identities for detached CoreGraphics
  mode inventories, which reject missing or duplicate identities rather than
  publishing a partial list.
- Detached CoreGraphics display-mode inventories with deterministic mode ordering and copied I/O
  flags, a closeable pointer-free display-reconfiguration observer, and macOS 26+ AppKit screen
  snapshots safely associated with CoreGraphics display identifiers.
- A callback-scoped, pointer-free ScreenCaptureKit frame lease that copies bounded CoreVideo
  planes into detached Kotlin byte arrays, with read-only lock/unlock safety and quiescent output
  teardown.
- A passive macOS 13+ ScreenCaptureKit control plane with detached runtime capability data,
  non-prompting Screen Recording preflight, and macOS 14+ picker availability detection.
- Generated CoreHaptics and targeted IOKit HID manager bindings, with pointer-free managed game
  controller haptics and quiescent, GameController-aware HID lifecycle ownership.
- Generated GameController classes, input profiles, elements, and notification constants, plus
  managed physical-input value observation with clear-before-close block ownership.
- A managed session-level CoreGraphics listen-only event tap with non-prompting permission
  preflight, typed borrowed event delivery, safe integer field reads, and quiescent CoreFoundation
  teardown.
- Pointer-free CoreGraphics display snapshots, closeable display-mode owners, scoped display
  capture, and a quiescent closeable Dispatch memory-pressure source for AppKit JVM consumers.
- Scoped AppKit drop-transfer helpers for borrowed dragging info, bounded `NSData` copies, and
  idempotent security-scoped URL access ownership.
- Revocable managed C callbacks for CoreGraphics event taps and display reconfiguration, plus
  immutable HID device lifecycle snapshots, with exception containment and quiescent teardown.
- Revocable managed Objective-C blocks for the six completion and handler ABI shapes needed by
  framework adapters, with clear-before-release teardown and quiescent callback ownership.
- Managed Objective-C callback signatures for `NSTextInputClient` ranges, points,
  rectangles, and out-ranges without exposing raw memory to Kotlin handlers.
- Managed Objective-C `void(id, SEL, SEL)` and `id(id, SEL)` callback signatures,
  including typed selector spelling and object-return routing needed by
  `NSTextInputClient` command and marked-text attribute callbacks.
- A closeable managed `NSTextInputClient` value owner that retains returned
  attributed strings and marked-text attributes until native receiver teardown.
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
