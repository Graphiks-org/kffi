# Complete kffi-x11 poc-koreos Bindings Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Complete the generated JVM X11 API so `poc-koreos` can remove its local X11 binding facade, manual downcalls, and LP64 offsets.

**Architecture:** Keep native declarations in the existing kextract Docker pipeline. Add generator-only LP64 storage records with C-level assertions against the real X11 records, then expose those generated records under the canonical Kotlin names expected by the consumer. Exercise the result first through generated accessor round trips and then through real X11/XShm/XIM operations under the existing headless integration runner.

**Tech Stack:** Kotlin/JVM 25, Java Foreign Function & Memory API (Panama FFM), kextract, Clang 18, Xlib/Xext/Xcomposite, Xvfb, Gradle, Kotlin Test/JUnit Platform.

**Spec:** `docs/superpowers/specs/2026-08-22-kffi-x11-poc-koreos-design.md`

## Global Constraints

- Use kextract revision `9252fb417ea91dae882a6a9e9d06ab672c50adc3` and the existing Docker regeneration workflow.
- Target Linux LP64 layouts; every compatibility record must use C `_Static_assert` checks against the native X11 headers.
- Do not add POSIX or Wayland declarations; POSIX remains owned by `kffi-posix`.
- Do not add handwritten Kotlin FFM layouts, offsets, native symbol lookups, or downcall descriptors to production code.
- Generated `XCreateIC` and `XSetICValues` must retain `Linker.Option.firstVariadicArg(1)`.
- Integration tests must perform real native work; reflection and constant checks are only secondary contract guards.
- Modify only this `kffi` repository; use the separate `poc-koreos` worktree as a read-only consumer reference.

---

### Task 1: Add failing generated-binding contract tests

**Files:**
- Modify: `kffi-x11/src/jvmTest/kotlin/org/graphiks/kffi/x11/X11BindingTest.kt`

**Interfaces:**
- Consumes: The public generated package `org.graphiks.kffi.x11.generated`.
- Produces: Failing tests that define the canonical record names and field accessors required by later tasks.

- [ ] **Step 1: Write the failing declaration test**

Extend `X11BindingTest` with a test that requires `XQueryBestCursor`, `XCreateIC`, and `XSetICValues` in `Xlib_hKt`. Assert the real Java signatures, including the six parameters of `XQueryBestCursor`:

```kotlin
val cursor = declarations.single { it.name == "XQueryBestCursor" }
assertEquals(Int::class.javaPrimitiveType, cursor.returnType)
assertContentEquals(
    arrayOf(
        MemorySegment::class.java,
        Long::class.javaPrimitiveType,
        Int::class.javaPrimitiveType,
        Int::class.javaPrimitiveType,
        MemorySegment::class.java,
        MemorySegment::class.java,
    ),
    cursor.parameterTypes,
)

val setIcValues = declarations.single { it.name == "XSetICValues" }
assertEquals(MemorySegment::class.java, setIcValues.returnType)
assertEquals(4, setIcValues.parameterCount)
assertTrue(setIcValues.parameterTypes.all { it == MemorySegment::class.java })
```

Also require generated numeric functions `ZPixmap`, `AllPlanes`, `XSHM_ZPIXMAP`, and `IsViewable`, and the string values `XNInputStyle`, `XNClientWindow`, `XNFocusWindow`, `XNArea`, and `XNSpotLocation`.

- [ ] **Step 2: Run the focused test and verify the expected failure**

Run:

```bash
./gradlew :kffi-x11:jvmTest --tests org.graphiks.kffi.x11.X11BindingTest --no-daemon
```

Expected: compilation or test failure because `XQueryBestCursor`, the new record APIs, and the new constants are not present. If the failure is a test typo rather than a missing binding, correct the test and rerun until it fails for the intended production reason.

- [ ] **Step 3: Add the failing record round-trip test**

Import the five canonical record types and add one test that allocates each record with `Arena.ofConfined()`, writes fields with generated setters, and reads them back with generated getters. Cover these concrete operations:

```kotlin
val imageMemory = XImage.allocate(arena)
val pixels = arena.allocate(16)
val imageBinding = XImage()
imageBinding.data(imageMemory, pixels)
imageBinding.bytes_per_line(imageMemory, 16)
imageBinding.bits_per_pixel(imageMemory, 32)
assertEquals(pixels, imageBinding.data(imageMemory))
assertEquals(16, imageBinding.bytes_per_line(imageMemory))
assertEquals(32, imageBinding.bits_per_pixel(imageMemory))

val attributesMemory = XWindowAttributes.allocate(arena)
val attributesBinding = XWindowAttributes()
attributesBinding.map_state(attributesMemory, IsViewable())
assertEquals(IsViewable(), attributesBinding.map_state(attributesMemory))

val clientMemory = XClientMessageEvent.allocate(arena)
val clientBinding = XClientMessageEvent()
clientBinding.type(clientMemory, ClientMessage())
clientBinding.window(clientMemory, 0x1234L)
clientBinding.message_type(clientMemory, 0x5678L)
clientBinding.format(clientMemory, 32)
clientBinding.data_l0(clientMemory, 0xCAFEBABEL)
assertEquals(0xCAFEBABEL, clientBinding.data_l0(clientMemory))

val selectionMemory = XSelectionEvent.allocate(arena)
val selectionBinding = XSelectionEvent()
selectionBinding.requestor(selectionMemory, 0x11L)
selectionBinding.selection(selectionMemory, 0x22L)
selectionBinding.target(selectionMemory, 0x33L)
selectionBinding.property(selectionMemory, 0x44L)
assertEquals(0x44L, selectionBinding.property(selectionMemory))

val attributesToSetMemory = XSetWindowAttributes.allocate(arena)
val attributesToSetBinding = XSetWindowAttributes()
attributesToSetBinding.override_redirect(attributesToSetMemory, 1)
assertEquals(1, attributesToSetBinding.override_redirect(attributesToSetMemory))
```

Assert Linux LP64 sizes and selected offsets through generated layouts: `XImage` 136 bytes with `data=16`, `bytes_per_line=44`, and `bits_per_pixel=48`; `XWindowAttributes` 136 bytes with `map_state=92`; `XClientMessageEvent` 96 bytes with `data_l0=56`; `XSelectionEvent` 72 bytes with `requestor=32`; and `XSetWindowAttributes` 112 bytes with `override_redirect=88`. Use `groupElement` paths, never numeric-offset access in the test body.

- [ ] **Step 4: Run the focused test and verify it fails for missing records**

Run the same focused Gradle command. Expected: failure because the five canonical generated record classes do not exist yet. Do not implement any production binding before observing this failure.

- [ ] **Step 5: Commit the red tests**

```bash
git add kffi-x11/src/jvmTest/kotlin/org/graphiks/kffi/x11/X11BindingTest.kt
git commit -m "test: define complete generated x11 binding contract"
```

---

### Task 2: Add ABI-checked compatibility records and generation inputs

**Files:**
- Modify: `docker/kffi-x11-codegen/x11_compat.h`
- Modify: `docker/kffi-x11-codegen/x11_constants.h`
- Modify: `docker/kffi-x11-codegen/generate.sh`

**Interfaces:**
- Consumes: The native Xlib/Xutil/XShm headers in the pinned Docker image.
- Produces: kextract declarations named `KffiXImageStorage`, `KffiXWindowAttributesStorage`, `KffiXClientMessageEventStorage`, `KffiXSelectionEventStorage`, and `KffiXSetWindowAttributesStorage`, plus the selected functions and constants.

- [ ] **Step 1: Define KffiXImageStorage with the complete LP64 shape**

In `x11_compat.h`, add this named struct:

```c
typedef struct KffiXImageStorage {
    int width; int height; int xoffset; int format;
    void *data;
    int byte_order; int bitmap_unit; int bitmap_bit_order; int bitmap_pad;
    int depth; int bytes_per_line; int bits_per_pixel;
    unsigned long red_mask; unsigned long green_mask; unsigned long blue_mask;
    void *obdata;
    void *create_image; void *destroy_image; void *get_pixel;
    void *put_pixel; void *sub_image; void *add_pixel;
} KffiXImageStorage;
```

The function-pointer members are storage pointers intentionally: the layout API needs their size and position, not callable function-pointer types.

- [ ] **Step 2: Define the four event/window compatibility records**

Add these exact fields, using `void *` for native pointers, `unsigned long` for XID/Atom/Time/long-sized values, and `int` for X11 `Bool`/enum/int fields:

```c
typedef struct KffiXWindowAttributesStorage {
    void *ext_data; void *visual; unsigned long window;
    int x; int y; int width; int height; int border_width; int depth;
    unsigned long visualid; unsigned long root;
    int c_class; int bit_gravity; int win_gravity; int backing_store;
    unsigned long backing_planes; unsigned long backing_pixel;
    int save_under; unsigned long colormap; int map_installed; int map_state;
    long all_event_masks; long your_event_mask; long do_not_propagate_mask;
    int override_redirect; void *screen;
} KffiXWindowAttributesStorage;

typedef struct KffiXClientMessageEventStorage {
    int type; unsigned long serial; int send_event; void *display;
    unsigned long window; unsigned long message_type; int format;
    long data_l0; long data_l1; long data_l2; long data_l3; long data_l4;
} KffiXClientMessageEventStorage;

typedef struct KffiXSelectionEventStorage {
    int type; unsigned long serial; int send_event; void *display;
    unsigned long requestor; unsigned long selection; unsigned long target;
    unsigned long property; unsigned long time;
} KffiXSelectionEventStorage;

typedef struct KffiXSetWindowAttributesStorage {
    unsigned long background_pixmap; unsigned long background_pixel;
    unsigned long border_pixmap; unsigned long border_pixel;
    int bit_gravity; int win_gravity; int backing_store;
    unsigned long backing_planes; unsigned long backing_pixel;
    int save_under; long event_mask; long do_not_propagate_mask;
    int override_redirect; unsigned long colormap; unsigned long cursor;
} KffiXSetWindowAttributesStorage;
```

- [ ] **Step 3: Add C size/alignment/offset assertions**

For every compatibility record, assert equality with the native record using `sizeof`, `_Alignof`, and `offsetof`. Include all offsets consumed by the consumer, not only the first field:

```c
_Static_assert(sizeof(XImage) == sizeof(KffiXImageStorage), "XImage size mismatch");
_Static_assert(_Alignof(XImage) == _Alignof(KffiXImageStorage), "XImage alignment mismatch");
_Static_assert(offsetof(XImage, data) == offsetof(KffiXImageStorage, data), "XImage data offset mismatch");
_Static_assert(offsetof(XImage, bytes_per_line) == offsetof(KffiXImageStorage, bytes_per_line), "XImage stride offset mismatch");
_Static_assert(offsetof(XWindowAttributes, map_state) == offsetof(KffiXWindowAttributesStorage, map_state), "XWindowAttributes map_state offset mismatch");
_Static_assert(offsetof(XClientMessageEvent, data) == offsetof(KffiXClientMessageEventStorage, data_l0), "XClientMessageEvent data offset mismatch");
_Static_assert(offsetof(XSelectionEvent, requestor) == offsetof(KffiXSelectionEventStorage, requestor), "XSelectionEvent requestor offset mismatch");
_Static_assert(offsetof(XSetWindowAttributes, override_redirect) == offsetof(KffiXSetWindowAttributesStorage, override_redirect), "XSetWindowAttributes override_redirect offset mismatch");
```

For the ClientMessage union, also assert that the five `long` elements occupy the same 40-byte region as `data`. Keep the existing XEvent and XShm assertions.

- [ ] **Step 4: Select the new records, function, and numeric constants**

Add `XQueryBestCursor` to `functions`, the five storage names to `structs`, and the five storage names to the `--include-struct`/`--include-typedef` arguments. Add `ZPixmap`, `AllPlanes`, `XSHM_ZPIXMAP`, and `IsViewable` to the selected numeric constants. Retain:

```bash
--variadic-args XCreateIC:11
--variadic-args XSetICValues:3
```

The XIM names used by the consumer are retained in a dedicated template in Task 3 because kextract skips string-valued pointer macros.

- [ ] **Step 5: Add the pure numeric constants to x11_constants.h**

Keep this header independent from the Xlib typedef graph and define macros kextract can emit:

```c
#define ZPixmap 2
#define AllPlanes -1L
#define XSHM_ZPIXMAP 2
#define IsViewable 2
```

Use the existing pure-constant invocation for these names. Do not encode any of them in `kffi-x11` Kotlin production code.

- [ ] **Step 6: Verify the header syntax before regeneration**

Run the pinned code-generation container's C compiler against a translation unit including `x11_compat.h` and verify exit code zero. The output must show that every `_Static_assert` passes; a failed assertion is an ABI bug, not a test to weaken.

- [ ] **Step 7: Commit the generator-input changes**

```bash
git add docker/kffi-x11-codegen/generate.sh docker/kffi-x11-codegen/x11_compat.h docker/kffi-x11-codegen/x11_constants.h
git commit -m "feat: generate complete x11 storage records"
```

---

### Task 3: Generate canonical Kotlin records and XIM string API

**Files:**
- Create: `docker/kffi-x11-codegen/x11_xim_constants.kt`
- Modify: `docker/kffi-x11-codegen/generate.sh`
- Create/Regenerate: `kffi-x11/src/jvmMain/kotlin/org/graphiks/kffi/x11/generated/X11CompatAliases.kt`
- Regenerate: `kffi-x11/src/jvmMain/kotlin/org/graphiks/kffi/x11/generated/Xlib_h.kt`
- Regenerate: `kffi-x11/src/jvmMain/kotlin/org/graphiks/kffi/x11/generated/x11_constants_h.kt`

**Interfaces:**
- Consumes: The compatibility records and declarations from Task 2.
- Produces: `XImage`, `XWindowAttributes`, `XClientMessageEvent`, `XSelectionEvent`, `XSetWindowAttributes`, generated function wrappers, numeric constants, and XIM `String` constants.

- [ ] **Step 1: Add the canonical typealias layer**

Create `X11CompatAliases.kt` in the generated package with no layouts or offsets of its own:

```kotlin
package org.graphiks.kffi.x11.generated

typealias XImage = KffiXImageStorage
typealias XWindowAttributes = KffiXWindowAttributesStorage
typealias XClientMessageEvent = KffiXClientMessageEventStorage
typealias XSelectionEvent = KffiXSelectionEventStorage
typealias XSetWindowAttributes = KffiXSetWindowAttributesStorage
```

If kextract emits the records under canonical names directly, omit aliases that collide and preserve the canonical generated classes. The record API must expose `layout`, `byteSize`, `allocate`, `reinterpret`, and getter/setter pairs for all fields listed in Task 1.

- [ ] **Step 2: Add the XIM string constants template**

Create `x11_xim_constants.kt` with these exact header values:

```kotlin
package org.graphiks.kffi.x11.generated

const val XNInputStyle = "inputStyle"
const val XNClientWindow = "clientWindow"
const val XNFocusWindow = "focusWindow"
const val XNPreeditAttributes = "preeditAttributes"
const val XNArea = "area"
const val XNAreaNeeded = "areaNeeded"
const val XNSpotLocation = "spotLocation"
const val XNPreeditStartCallback = "preeditStartCallback"
const val XNPreeditDrawCallback = "preeditDrawCallback"
const val XNPreeditDoneCallback = "preeditDoneCallback"
const val XNCommitStringCallback = "commitStringCallback"
```

Make `generate.sh` copy this template into the tracked generated package on every regeneration. This is the generator-supported representation of string macros that kextract intentionally skips; it is not consumer-local binding code.

- [ ] **Step 3: Regenerate from the pinned Docker image**

Initialize the submodule if needed and run:

```bash
git submodule update --init --recursive
scripts/gen-kffi-x11.sh
```

Expected generated output includes the new function, constants, storage classes, and accessors. If kextract rejects an anonymous/nested native record, fix the C declaration or alias layer; do not add a handwritten Kotlin layout.

- [ ] **Step 4: Run the contract tests and verify green**

Run:

```bash
./gradlew :kffi-x11:jvmTest --tests org.graphiks.kffi.x11.X11BindingTest --no-daemon
```

Expected: all declaration, layout-size/offset, and accessor round-trip tests pass. A pass that only comes from reflection is insufficient; the test must execute every setter/getter pair in Task 1.

- [ ] **Step 5: Commit the generated API**

```bash
git add docker/kffi-x11-codegen/x11_xim_constants.kt docker/kffi-x11-codegen/generate.sh kffi-x11/src/jvmMain/kotlin/org/graphiks/kffi/x11/generated
git commit -m "feat: expose generated x11 records and xim names"
```

---

### Task 4: Add meaningful Xvfb integration coverage

**Files:**
- Modify: `kffi-x11/src/jvmTest/kotlin/org/graphiks/kffi/x11/X11IntegrationTest.kt`
- Modify: `kffi-x11/README.md`

**Interfaces:**
- Consumes: The generated functions, constants, and records from Task 3.
- Produces: Native integration evidence for XImage, XWindowAttributes, XSetWindowAttributes, ClientMessage, SelectionNotify, and conditional XIM.

- [ ] **Step 1: Add a real generated-record X11 test**

Add a second opt-in test that reuses the existing display setup but does not use `xwd`, ImageMagick, or handwritten offsets to prove the generated API. It must:

1. Create an unmapped window, allocate `XSetWindowAttributes`, set `override_redirect` through its generated accessor, call generated `XChangeWindowAttributes`, map the window, call generated `XGetWindowAttributes` into `XWindowAttributes`, and assert generated `override_redirect` and `map_state` values from the returned native record.
2. Draw a known color, call generated `XGetImage` with generated `AllPlanes()` and `ZPixmap()`, read `data`, `bytes_per_line`, and `bits_per_pixel` through `XImage` accessors, copy the returned native bytes, and assert the sampled native pixel word matches the `XColor.pixel` used for the draw. Destroy the image with generated `XDestroyImage` in `finally`.
3. If `XShmQueryExtension` returns non-zero, allocate/populate generated `XShmSegmentInfoCompat`, call generated XShm entry points, and assert the native result. If the server has no MIT-SHM, record an explicit assumption with a diagnostic; do not replace it with a mock or constant assertion.

Use `XImage.reinterpret(imagePointer)` and generated accessors rather than `get(ValueLayout..., numericOffset)`. Use `XWindowAttributes.reinterpret` for the native output record and assert returned field values.

- [ ] **Step 2: Add real ClientMessage and SelectionNotify round trips**

Allocate `XClientMessageEvent` and `XSelectionEvent` records with generated allocators, populate their type/window/message/data or selection fields with generated setters, send them with generated `XSendEvent`, consume them with generated `XNextEvent` into `KffiXEventStorage`, and read the received event through the corresponding generated record accessors. Assert the received window, message type, `data_l0`, requestor, selection, target, and property.

The event test must use a real X connection and queue. It must fail if a generated field has an incorrect offset and must not construct a byte buffer with literal offsets.

- [ ] **Step 3: Add conditional real XIM setup**

Call generated `XOpenIM` against the active display. If it returns null, use a JUnit assumption with a diagnostic naming the missing XIM implementation. If it returns a valid IM, call generated `XCreateIC` with generated `XNInputStyle`, `XNClientWindow`, and `XNFocusWindow` names and generated XIM style constants. Then call generated `XSetICValues` with `XNSpotLocation` and a generated `XPoint` record, and assert its native return pointer is null on success. Destroy the IC and close the IM in `finally`.

The test must invoke generated variadic functions directly and must not resolve `libX11` or build a `FunctionDescriptor` inside the test.

- [ ] **Step 4: Run the integration runner and inspect evidence**

On Linux, run:

```bash
scripts/run-x11-integration.sh
```

On the current macOS host, run:

```bash
scripts/docker-x11-integration.sh
```

Expected: Xvfb creates real native resources, the test reads image bytes, receives both event types, and either executes XIM or reports an explicit skipped XIM assumption. Inspect artifact logs and test output; green without native evidence is not acceptable.

- [ ] **Step 5: Document the new public boundary**

Update `kffi-x11/README.md` to list the five generated records, generated XIM string constants, variadic `XCreateIC`/`XSetICValues`, and the fact that the Xvfb integration reads `XImage` fields and exchanges native event records.

- [ ] **Step 6: Commit integration coverage and documentation**

```bash
git add kffi-x11/src/jvmTest/kotlin/org/graphiks/kffi/x11/X11IntegrationTest.kt kffi-x11/README.md
git commit -m "test: exercise generated x11 records natively"
```

---

### Task 5: Full verification and regeneration reproducibility

**Files:**
- Verify: all files changed by Tasks 1–4

**Interfaces:**
- Consumes: The complete generated binding and integration suite.
- Produces: Fresh evidence that the requested surface is complete and regeneration is stable.

- [ ] **Step 1: Run the complete JVM test suite**

```bash
./gradlew :kffi-x11:jvmTest --no-daemon --rerun-tasks
```

Expected: exit code 0, zero test failures, and no generated-source compile errors.

- [ ] **Step 2: Regenerate a second time and verify no tracked drift**

```bash
scripts/gen-kffi-x11.sh
git diff --check
git diff --exit-code -- kffi-x11/src/jvmMain/kotlin/org/graphiks/kffi/x11/generated
```

Expected: the second generation leaves the tracked generated package unchanged. Any diff indicates a non-reproducible generator step and must be fixed before completion.

- [ ] **Step 3: Audit the consumer migration surface**

Run this read-only search against the checked-out `poc-koreos` worktree:

```bash
rg -n "X11KffiBindings|XCLIENT_|XSELECTION_|XSETWINDOWATTR|XIMAGE_|XSHM_|Xlib_ZPixmap|Xlib_AllPlanes|XN[A-Za-z]+ =" /Users/chaos/.codex/worktrees/bccd/poc-koreos/kadre-x11
```

Expected: every previously local symbol has a corresponding generated `kffi-x11` API, and no new production workaround is required in this repo.

- [ ] **Step 4: Verify final scope and worktree state**

```bash
git diff --check
git status --short
git diff --stat HEAD~4..HEAD
```

Confirm that the final change touches only the documented kffi-x11 generator, generated API, tests, documentation, and approved spec/plan commits. Do not claim completion until the JVM suite, containerized Xvfb integration, and second-generation diff all have fresh successful output.
