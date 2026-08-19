# Android Native Callback ABI Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Replace the Android callback engine's fixed `uint32_t, void*` closure with a dynamic `libffi` ABI bridge that can deliver all WebGPU callback carriers and routed struct arguments without JNA.

**Architecture:** `UpcallEngine` exposes separate JNI and C ABI signatures. The native bridge parses the C ABI into persistent `ffi_type` trees and per-slot metadata, prepares a dynamic `ffi_cif`, then converts each closure invocation into a `jvalue` array for the static dispatcher. The final C `ptr` is the routing userdata; struct-by-value arguments are passed as temporary addresses encoded as `jlong`.

**Tech Stack:** Kotlin Multiplatform Android source set, Android JNI in C11, bundled libffi 3.4.6, Gradle instrumentation tests, Android emulator ABI `x86_64`, Android native build ABI `arm64-v8a`.

**Spec:** `docs/superpowers/specs/2026-08-19-android-upcall-abi-design.md`

## Global Constraints

- Android native support must build for `arm64-v8a` and `x86_64`.
- `dispatchJvmSignature` is the JNI descriptor; `dispatchAbiSignature` is the callback C ABI descriptor.
- The final ABI `ptr` is reserved for `routing_userdata` and is replaced by the leading `jlong routingToken` in routed dispatchers.
- `ffi_type_struct` objects and their `elements` arrays must remain allocated until `freeTrampoline`.
- A struct argument address is valid only during dispatcher execution and must not be retained by Kotlin.
- Existing three-argument source calls keep the legacy `v(u32,ptr)` behavior through a Kotlin compatibility wrapper.
- Every implementation change follows a failing test first, then the smallest implementation that makes it pass.
- Pull request branch, commits, title, and body must satisfy `CONTRIBUTING.md`; no changelog update is needed only if the PR body justifies it.

---

### Task 1: Add failing Android coverage for the full callback ABI

**Files:**
- Modify: `kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallEngineTest.kt`
- Modify: `kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallDispatcher.kt`
- Modify: `kffi-android-native/src/main/cpp/bench_engine_fixture.c`

**Interfaces:**
- Consumes: current fixed `UpcallEngine.allocateTrampoline` and fixture callback registration.
- Produces: a test-only callback fixture named `bench_fire_all_types`, a routed dispatcher method with the JVM descriptor `(JBBSSIIJJFDJJJJ)V`, and assertions covering every required ABI carrier.

- [ ] **Step 1: Extend the native fixture with an exact WebGPU-shaped struct and callback.**

Add these declarations and functions after the existing benchmark callback fixture. `WGPUStringView` deliberately uses the native `size_t` field so the test exercises the 64-bit Android ABI rather than a Kotlin approximation:

```c
typedef struct WGPUStringView {
    const char *data;
    size_t length;
} WGPUStringView;

typedef void (*bench_all_types_callback)(
    int8_t i8, uint8_t u8, int16_t i16, uint16_t u16,
    int32_t i32, uint32_t u32, int64_t i64, uint64_t u64,
    float f32, double f64, void *pointer, WGPUStringView message,
    size_t size, uintptr_t address, void *routing_userdata);

static bench_all_types_callback g_all_types_callback = NULL;
static void *g_all_types_userdata = NULL;

void bench_set_all_types_callback(bench_all_types_callback callback, void *userdata) {
    g_all_types_callback = callback;
    g_all_types_userdata = userdata;
}

void bench_fire_all_types(void) {
    static const char message[] = "WebGPU";
    if (g_all_types_callback != NULL) {
        WGPUStringView view = {message, sizeof(message) - 1};
        g_all_types_callback(-8, 248, -16000, 60000, -1234567, 3456789,
                             INT64_C(-0x102030405060708), UINT64_C(0xfedcba9876543210),
                             1.25f, -2.5, (void *)(uintptr_t)0x1234,
                             view, sizeof(message) - 1, (uintptr_t)0x5678,
                             g_all_types_userdata);
    }
}
```

Include `<stddef.h>` and `<stdint.h>` if they are not already provided by the fixture.

- [ ] **Step 2: Add an Android dispatcher that records the callback values.**

Extend `UpcallDispatcher.kt` with a `data class AllTypes` and a volatile capture field. The dispatcher must receive the routing token first, then the C arguments in declaration order, with `WGPUStringView` represented by `messageAddress: Long`:

```kotlin
data class AllTypes(
    val token: Long,
    val i8: Byte,
    val u8: Byte,
    val i16: Short,
    val u16: Short,
    val i32: Int,
    val u32: Int,
    val i64: Long,
    val u64: Long,
    val f32: Float,
    val f64: Double,
    val pointer: Long,
    val messageAddress: Long,
    val size: Long,
    val address: Long,
)

@Volatile
var lastAllTypes: AllTypes? = null

@JvmStatic
fun dispatchAllTypes(
    token: Long, i8: Byte, u8: Byte, i16: Short, u16: Short,
    i32: Int, u32: Int, i64: Long, u64: Long,
    f32: Float, f64: Double, pointer: Long, messageAddress: Long,
    size: Long, address: Long,
) {
    lastAllTypes = AllTypes(token, i8, u8, i16, u16, i32, u32, i64, u64,
                            f32, f64, pointer, messageAddress, size, address)
}
```

- [ ] **Step 3: Change existing test calls to pass the ABI signature explicitly.**

Use `dispatchJvmSignature = "(JI)V"` and `dispatchAbiSignature = "v(u32,ptr)"` for the legacy fixture. Store the returned trampoline and call `UpcallEngine.freeTrampoline` after the registration is quiescent.

- [ ] **Step 4: Add a test for the full routed callback and temporary struct address.**

In the dispatcher, immediately copy `messageAddress` with `MemoryBuffer`/`NativeAddress` helpers or a native helper fixture; assert the copied bytes are `WebGPU`, assert the pointer and routing token values, and assert every scalar. The ABI passed to `allocateTrampoline` must be exactly:

```text
v(i8,u8,i16,u16,i32,u32,i64,u64,float,double,ptr,struct(ptr,size_t),size_t,uintptr_t,ptr)
```

The JVM descriptor must be:

```text
(JBBSSIIJJFDJJJJ)V
```

with one `J` for the routing token, `B`/`S` for the narrow integer pairs,
`I`/`J` for the 32-/64-bit integer pairs, `F`/`D` for floating point, and
four `J` carriers for pointer, struct address, `size_t`, and `uintptr_t`.

- [ ] **Step 5: Run the focused compile/test command and record the red failure.**

Run:

```bash
./gradlew :kffi:compileDebugAndroidTestKotlin
```

Expected failure: the new four-argument calls do not compile because the production `UpcallEngine` still exposes only the old three-argument method. If the compiler reports a fixture or test typo instead, correct the test before proceeding.

---

### Task 2: Implement the public API and JNI registration contract

**Files:**
- Modify: `kffi/src/androidMain/kotlin/org/graphiks/kffi/engine/UpcallEngine.kt`
- Modify: `kffi-android-native/src/main/cpp/kffi_upcall.h`
- Modify: `kffi-android-native/src/main/cpp/kffi_engine.c`
- Modify: `kffi-benchmark-android/src/androidDeviceTest/kotlin/org/graphiks/kffi/benchmark/android/AndroidHarness.kt`

**Interfaces:**
- Consumes: Task 1's four-argument calls and the approved ABI contract.
- Produces: a four-argument external JNI method registered as `(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J`, plus a three-argument Kotlin wrapper that supplies `v(u32,ptr)`.

- [ ] **Step 1: Add the Kotlin four-argument external and compatibility wrapper.**

Implement:

```kotlin
external fun allocateTrampoline(
    dispatcherClass: Class<*>,
    dispatchMethod: String,
    dispatchJvmSignature: String,
    dispatchAbiSignature: String,
): Long

@Deprecated("Pass the JVM and C ABI signatures separately")
fun allocateTrampoline(
    dispatcherClass: Class<*>,
    dispatchMethod: String,
    dispatchJvmSignature: String,
): Long = allocateTrampoline(
    dispatcherClass,
    dispatchMethod,
    dispatchJvmSignature,
    "v(u32,ptr)",
)
```

- [ ] **Step 2: Update the native declaration and `RegisterNatives` descriptor.**

Change the C declaration to accept `dispatchJvmSignature` and `dispatchAbiSignature`, and change the registration table to the four-string descriptor. Keep `freeTrampoline` unchanged.

- [ ] **Step 3: Migrate benchmark source to the explicit ABI.**

Change the Android benchmark call to pass `dispatchJvmSignature = "(JI)V"` and `dispatchAbiSignature = "v(u32,ptr)"`; this keeps the benchmark on the same API used by generated bindings.

- [ ] **Step 4: Re-run the focused compile command.**

Run:

```bash
./gradlew :kffi:compileDebugAndroidTestKotlin
```

Expected result: Kotlin compilation succeeds, but the native implementation tests still fail or the native build is unchanged because Task 3 has not implemented the new parser yet.

---

### Task 3: Implement persistent dynamic `ffi_cif` closures and JNI marshaling

**Files:**
- Modify: `kffi-android-native/src/main/cpp/kffi_upcall.c`
- Modify: `kffi-android-native/src/main/cpp/kffi_upcall.h`
- Modify: `kffi-android-native/src/main/cpp/kffi_engine.c`

**Interfaces:**
- Consumes: the four-argument JNI surface from Task 2.
- Produces: parsing and allocation helpers internal to `kffi_upcall.c`, dynamic `ffi_cif` preparation, a generic closure callback, and cleanup-safe slots.

- [ ] **Step 1: Add native parser and ownership metadata before changing allocation behavior.**

Add an internal enum for `UPCALL_I8`, `UPCALL_U8`, `UPCALL_I16`, `UPCALL_U16`, `UPCALL_I32`, `UPCALL_U32`, `UPCALL_I64`, `UPCALL_U64`, `UPCALL_FLOAT`, `UPCALL_DOUBLE`, `UPCALL_PTR`, `UPCALL_SIZE_T`, `UPCALL_UINTPTR`, `UPCALL_STRUCT`, and `UPCALL_VOID`. Add a per-slot allocation list so `ffi_type` nodes, `elements` arrays, `arg_types`, and kind arrays all outlive `ffi_prep_cif`.

The parser must accept the approved grammar, recursively build `ffi_type_struct` fields, reject `v` in arguments, reject empty structs, reject trailing input, and map `size_t`/`uintptr_t` to `ffi_type_uint64` under a compile-time `sizeof(size_t) == 8` guard. Accept `p`, `f32`, and `f64` as aliases only if the implementation can do so without changing the canonical grammar.

- [ ] **Step 2: Parse and validate the JNI descriptor independently.**

Parse primitive JNI descriptors between `(` and `)` and the return descriptor after `)`. Accept only `B`, `S`, `I`, `J`, `F`, `D`, and `V`. Verify the parameter count and expected carriers derived from the ABI; for routed callbacks verify the first parameter is `J` and corresponds to the final ABI `ptr`.

- [ ] **Step 3: Replace the fixed slot arrays with dynamic arrays.**

Store `ffi_type **arg_types`, `upcall_kind *arg_kinds`, `size_t argc`, `upcall_kind return_kind`, the parsed JNI carriers, and a `has_routing_userdata` flag in each slot. Allocate the slot under the mutex, initialize it to a failure-safe state, and return it to the pool on every parse, method lookup, `ffi_prep_cif`, closure allocation, or closure preparation failure.

- [ ] **Step 4: Prepare the dynamic CIF and closure.**

Call:

```c
ffi_prep_cif(
    &slot->cif,
    FFI_DEFAULT_ABI,
    (unsigned int)slot->argc,
    slot->return_type,
    slot->arg_types);
```

Then call `ffi_closure_alloc(sizeof(ffi_closure), &fnptr)` and
`ffi_prep_closure_loc(slot->closure, &slot->cif, kffi_upcall_closure, slot, fnptr)`.
Do not pass a stack array to `ffi_prep_cif` and do not release a struct's
`elements` array until `freeTrampoline`.

- [ ] **Step 5: Implement generic closure argument conversion.**

For every invocation, attach the current thread as before, allocate a `jvalue`
array sized for the dispatcher, and convert arguments as follows:

```c
UPCALL_I8/U8   -> jbyte
UPCALL_I16/U16 -> jshort
UPCALL_I32/U32 -> jint
UPCALL_I64/U64/SIZE_T/UINTPTR/PTR -> jlong
UPCALL_FLOAT   -> jfloat
UPCALL_DOUBLE  -> jdouble
UPCALL_STRUCT  -> (jlong)(uintptr_t)args[i]
```

For routed callbacks, read `*(void **)args[argc - 1]` into `jargs[0].j`, then
convert `args[0..argc-2]` into `jargs[1..argc-1]`. Invoke the JNI method with
`CallStatic<Type>MethodA`; for a non-void C return convert the JNI result back
to the exact `ffi_type` width in `resp`. On a pending Java exception, describe
and clear it, leave a zero return value for non-void callbacks, and detach the
thread if the closure attached it.

- [ ] **Step 6: Make cleanup complete for success and failure.**

Centralize slot teardown: free the closure if allocated, delete the global
class reference, free every arena allocation, clear metadata, and mark the
slot unused under the existing mutex. Ensure `freeTrampoline` is idempotent
for unknown addresses and never frees a slot while the callback contract says
it may still be running.

- [ ] **Step 7: Build the native Android artifact for both requested ABIs.**

Run:

```bash
./gradlew :kffi-android-native:assembleDebug
```

Expected result: the C11/JNI/libffi build succeeds for the configured
`arm64-v8a` and `x86_64` variants.

---

### Task 4: Verify routed structs, scalar carriers, returns, and error paths

**Files:**
- Modify: `kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallDispatcher.kt`
- Modify: `kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallEngineTest.kt`
- Modify: `kffi-android-native/src/main/cpp/bench_engine_fixture.c`

**Interfaces:**
- Consumes: Task 3's dynamic closure.
- Produces: regression coverage for all required WebGPU callback shapes and resource lifetime behavior.

- [ ] **Step 1: Add a native scalar-return callback fixture.**

Add this exact fixture shape and expose `bench_set_return_callback` and
`bench_fire_return`:

```c
typedef uint32_t (*bench_return_callback)(uint32_t value, void *userdata);
static bench_return_callback g_return_callback = NULL;
static void *g_return_userdata = NULL;

void bench_set_return_callback(bench_return_callback callback, void *userdata) {
    g_return_callback = callback;
    g_return_userdata = userdata;
}

uint32_t bench_fire_return(uint32_t value) {
    return g_return_callback == NULL ? 0u :
        g_return_callback(value, g_return_userdata);
}
```

The dispatcher method uses `(JI)I` with ABI `u32(u32,ptr)`, returns
`value + 1`, and the test asserts `bench_fire_return(41)` returns `42`.

- [ ] **Step 2: Add invalid-signature tests.**

Assert that allocation rejects a malformed ABI string, an ABI/JVM parameter
count mismatch, a routed dispatcher without a leading `J`, and a struct return
signature. Each test must use a `try/finally` block and assert that a later
valid allocation still succeeds, proving failed slots are reusable.

- [ ] **Step 3: Assert the temporary `WGPUStringView` contract.**

In `dispatchAllTypes`, copy `data` and `length` immediately from
`messageAddress` into Kotlin-owned values. Do not store the address as test
state. Assert the copied string is `WebGPU`, length is `6`, and the address is
nonzero. This tests the contract without depending on the temporary pointer
after the dispatcher returns.

- [ ] **Step 4: Run the connected Android test suite.**

Run on the configured emulator/device:

```bash
./gradlew :kffi:connectedAndroidDeviceTest
```

Expected result: all existing tests and the new callback tests pass on
`x86_64`. The native artifact build output must contain both configured ABI
variants; if an arm64 device is available, repeat the same task there.

---

### Task 5: Document the generator contract and changelog

**Files:**
- Modify: `docs/docs/quickstart.md`
- Modify: `README.md`
- Modify: `CHANGELOG.md`

**Interfaces:**
- Consumes: the public API and lifetime contract from Tasks 2–4.
- Produces: consumer-facing documentation sufficient for `kextract` to emit the correct Android dispatcher and ABI signature.

- [ ] **Step 1: Add an Android callback example.**

Document the `WGPUStringView` example with the four-argument API, explicitly
showing `(JJI)V` versus `v(struct(ptr,size_t),u32,ptr)`, and explain that
`messageAddress` is valid only during dispatch and must be copied immediately.

- [ ] **Step 2: Update the README callback lifecycle section.**

State that Android uses a dynamically prepared libffi closure, that the final
`ptr` is routing userdata, and that pointer/struct addresses are passed as
`jlong` carriers without creating Java wrapper objects in native code.

- [ ] **Step 3: Add an Unreleased changelog entry.**

Add a `Changed` item describing dynamic Android callback ABI support for
WebGPU carriers, routed userdata, and structs-by-value on `arm64-v8a` and
`x86_64`.

- [ ] **Step 4: Check documentation and diff formatting.**

Run:

```bash
./gradlew :kffi:jvmTest
rtk git diff --check
```

The JVM suite must pass, and the documentation must contain no trailing
whitespace.

---

### Task 6: Review, verify, commit, push, and open the draft PR

**Files:**
- Review all changed files against the spec and `CONTRIBUTING.md`.
- Use `.github/PULL_REQUEST_TEMPLATE.md` as the PR body template.

- [ ] **Step 1: Run the required verification matrix.**

Run fresh commands and record exit codes:

```bash
./gradlew :kffi:jvmTest
./gradlew :kffi:testAndroidHostTest
./gradlew :kffi-android-native:assembleDebug
./gradlew :kffi:connectedAndroidDeviceTest
rtk git diff --check
```

Do not claim completion until the output has been read and failures counted.

- [ ] **Step 2: Request a focused code review.**

Review the parser, JNI carrier mapping, struct lifetime, routing order, and
the test fixture. Fix all critical/important findings and rerun the affected
verification commands.

- [ ] **Step 3: Stage only intended files and commit atomically.**

Use a Conventional Commit subject with an allowed scope, for example:

```bash
git add CHANGELOG.md README.md docs/docs/quickstart.md \
  docs/superpowers/specs/2026-08-19-android-upcall-abi-design.md \
  docs/superpowers/plans/2026-08-19-android-upcall-abi.md \
  kffi/src/androidMain/kotlin/org/graphiks/kffi/engine/UpcallEngine.kt \
  kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallDispatcher.kt \
  kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallEngineTest.kt \
  kffi-android-native/src/main/cpp/kffi_engine.c \
  kffi-android-native/src/main/cpp/kffi_upcall.c \
  kffi-android-native/src/main/cpp/kffi_upcall.h \
  kffi-android-native/src/main/cpp/bench_engine_fixture.c \
  kffi-benchmark-android/src/androidDeviceTest/kotlin/org/graphiks/kffi/benchmark/android/AndroidHarness.kt
git commit -m "feat(shared): support dynamic Android callback ABIs"
```

- [ ] **Step 4: Push the feature branch and create a draft PR.**

Verify `gh --version`, `gh auth status`, the remote, and the default base
branch. Push with tracking, then create a draft PR using the exact headings in
`.github/PULL_REQUEST_TEMPLATE.md`. Select exactly one change type (`feat`),
check the changelog update, check documentation updated, leave Screenshots
empty, and include the verification commands in Additional Notes.
