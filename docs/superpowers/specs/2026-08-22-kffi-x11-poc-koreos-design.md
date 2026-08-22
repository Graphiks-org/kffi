# kffi-x11 bindings for poc-koreos

## Goal

Complete the JVM-only `kffi-x11` surface so `poc-koreos` can remove
`X11KffiBindings.kt`, its manual X11 downcalls, and its handwritten LP64
record offsets. POSIX remains provided by `kffi-posix`; this change does not
add POSIX or Wayland declarations.

## Scope and public API

The X11 code-generation pipeline will emit or expose:

- `XQueryBestCursor` with its native `Status`/`unsigned int` ABI;
- layouts and generated field accessors for `XImage`,
  `XWindowAttributes`, `XClientMessageEvent`, `XSelectionEvent`, and
  `XSetWindowAttributes`;
- the already-selected variadic declarations `XCreateIC` and `XSetICValues`,
  both using `Linker.Option.firstVariadicArg` at the first variadic parameter;
- `ZPixmap`, `AllPlanes`, `XSHM_ZPIXMAP`, `IsViewable`, and the XIM `XN_*`
  names used by the consumer.

The pinned kextract version cannot safely emit the native nested `XImage`
function table or the anonymous ClientMessage union. Generator-only storage
records will therefore model the complete LP64 storage with explicit scalar,
pointer, array-element, and padding fields. A checked-in generated-support
layer will expose canonical Kotlin names (`XImage`, etc.) over those generated
storage records when kextract requires distinct C names. Every storage record
will be checked against the native declaration with C `_Static_assert` checks
for size, alignment, and the fields consumed by poc-koreos.

`XN_*` are C string macros. Since kextract intentionally skips string-valued
pointer constants, the generation pipeline will produce their Kotlin `String`
API in `kffi-x11`; consumers will continue to pass `arena.allocateFrom(...)`
results to the generated variadic functions.

## ABI and field coverage

The compatibility header will validate the full native storage required by the
consumer, including:

- `XImage.data`, `bytes_per_line`, and `bits_per_pixel`, plus the remaining
  native prefix and function-pointer storage needed to preserve the record
  size;
- `XWindowAttributes.map_state` and the surrounding native record layout;
- `XClientMessageEvent.send_event`, `display`, `window`, `message_type`,
  `format`, and all five `data.l` entries;
- `XSelectionEvent.requestor`, `selection`, `target`, and `property`;
- `XSetWindowAttributes.override_redirect` and the complete record size.

The generated layouts, rather than Kotlin numeric offsets, will be the only
consumer-facing source of these locations. Tests will assert the native sizes
and offsets at the generated layout boundary and then use the generated
getters/setters to write and read representative records.

## Meaningful verification

The verification suite has two layers.

### Generated-layout contract tests

These tests allocate each generated record, write representative values with
the generated setters, read them back with the generated getters, and verify
the exact ABI size/alignment and selected field offsets. They also inspect the
generated Java method signatures for `XQueryBestCursor`, `XCreateIC`, and
`XSetICValues` as a guard against silently reverting to handwritten downcalls.
Reflection/signature assertions are secondary checks; a layout test must fail
if an accessor points at the wrong bytes.

### X11 integration tests under Xvfb

The existing opt-in integration runner will be extended to exercise actual
native behavior:

1. Open the Xvfb display, create/map a window, draw known pixel values, and
   capture it using the generated X11/XShm functions.
2. Read the returned `XImage` through the generated `XImage` accessors,
   reinterpret its `data` pointer using the generated `bytes_per_line` and
   `bits_per_pixel` fields, and assert the captured pixel bytes.
3. Allocate `XSetWindowAttributes`, set `override_redirect` through its
   generated accessor, call `XChangeWindowAttributes`, and verify the window
   remains usable through a real X request/event round trip.
4. Build and inspect `XClientMessageEvent` and `XSelectionEvent` through their
   generated accessors, send/receive the corresponding native events, and
   assert the decoded fields rather than only their offsets.
5. If an XIM implementation is available in the runner, open it, create an
   XIC with generated `XCreateIC`, update the spot/area attributes through
   generated `XPoint`/`XRectangle` records and `XSetICValues`, then verify the
   call returns the native success result. If no XIM is available, the test
   records a skipped integration condition with a diagnostic; it must never
   silently pass as a pure mock.

The integration test will clean up displays, windows, images, shared-memory
segments, XICs, and arenas on both success and failure. The test will not
claim XIM coverage when the native environment did not provide an IM.

## Files and regeneration

Expected implementation files are:

- `docker/kffi-x11-codegen/generate.sh` for declaration selection and
  generation of XIM string names;
- `docker/kffi-x11-codegen/x11_compat.h` for ABI-checked compatibility
  storage records;
- `docker/kffi-x11-codegen/x11_constants.h` or its generated-support output
  for constants that cannot be emitted from the transitive Xlib header;
- tracked generated Kotlin sources under
  `kffi-x11/src/jvmMain/kotlin/org/graphiks/kffi/x11/generated/`;
- `kffi-x11/src/jvmTest/.../X11BindingTest.kt` and
  `X11IntegrationTest.kt` for the two verification layers;
- `kffi-x11/README.md` to document the new generated record and XIM API
  boundary.

Regeneration must use the pinned kextract revision and the existing Docker
workflow. The final change must leave no generated-source diff after a fresh
regeneration.

## Non-goals

- No changes to `kffi-posix` or `kffi-wayland`.
- No manual Kotlin FFM layouts, offsets, `MethodHandle` construction, or
  native symbol lookup added to `kffi-x11` to compensate for generator gaps.
- No modification of the separate `poc-koreos` worktree in this task; its
  existing call sites are the compatibility target and validation reference.
