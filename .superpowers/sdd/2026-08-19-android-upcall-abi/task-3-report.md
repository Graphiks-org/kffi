# Task 3 Report

## Changed files

- `kffi-android-native/src/main/cpp/kffi_upcall.c`
- `kffi-android-native/src/main/cpp/kffi_upcall.h`
- `kffi-android-native/src/main/cpp/kffi_engine.c`
- `.superpowers/sdd/2026-08-19-android-upcall-abi/task-3-report.md` (this report)

No tests or design documents were modified.

## Implementation notes

- Replaced the fixed `void (uint32_t, void *)` closure with a per-slot dynamic
  `ffi_cif`, dynamically allocated argument type/kind arrays, parsed JNI
  carriers, return metadata, and routing metadata.
- Added the full approved ABI type grammar, including recursive persistent
  `ffi_type_struct` nodes and null-terminated `elements` arrays. The parser
  rejects void arguments, empty structs, struct returns, excessive nesting,
  malformed separators, unsupported types, and trailing input. The optional
  aliases `p`, `f32`, and `f64` are accepted.
- Added compile-time guards requiring 64-bit `size_t`, `uintptr_t`, and `jlong`,
  plus JNI integer carrier width checks. Unsigned values are copied bit-exactly
  into signed JNI carriers.
- Added an independent primitive JNI descriptor parser. It validates argument
  count, each ABI-derived carrier, the return carrier, and routed dispatcher
  ordering (`J` routing token first, final ABI `ptr` omitted from its original
  position).
- Added a per-slot allocation list owning every dynamic array and recursive
  struct type for the full lifetime of the borrowed `ffi_cif`.
- Added generic argument marshaling for all approved integer, floating-point,
  pointer, `size_t`, `uintptr_t`, and struct-address carriers. Routed callbacks
  read the final `void *` value and deliver it as dispatcher argument zero.
- Added `CallStatic<Type>MethodA` dispatch and exact-width scalar return
  conversion. Non-void responses are zero-initialized; pending Java exceptions
  are described and cleared without crossing the native callback boundary.
- Centralized slot teardown for success and every allocation/parser/method/CIF/
  closure failure. Teardown releases closure memory, global references, arena
  allocations, and all slot metadata before making the slot reusable.
- Preserved the quiescence contract: known trampolines may only be freed after
  callbacks have stopped. Unknown, zero, and already-freed addresses remain
  idempotent no-ops.
- Moved the four-argument JNI registration descriptor to a shared native header
  macro so the declaration and `RegisterNatives` entry cannot drift.

## Commands and exact results

### RED baseline

```bash
rtk ./gradlew :kffi:connectedAndroidDeviceTest -Pandroid.testInstrumentationRunnerArguments.class=org.graphiks.kffi.engine.UpcallEngineTest
```

Result before implementation: exit 1. The AVD started 3 tests; the two legacy
callbacks completed and `callbackFiresFullAbiAndCopiesStructMessage` failed.
The instrumentation process then crashed because the production closure still
used the fixed two-argument CIF.

```text
Starting 3 tests on Medium_Phone(AVD) - 16
UpcallEngineTest > callbackFiresFullAbiAndCopiesStructMessage [...] FAILED
Tests 3/3 completed. (0 skipped) (1 failed)
Instrumentation run failed due to Process crashed.
BUILD FAILED in 34s
```

### Final native build

```bash
rtk ./gradlew :kffi-android-native:assembleDebug
```

Result: exit 0. CMake built both configured native targets.

```text
> Task :kffi-android-native:buildCMakeDebug[arm64-v8a]
> Task :kffi-android-native:buildCMakeDebug[x86_64]
> Task :kffi-android-native:assembleDebug
BUILD SUCCESSFUL in 861ms
36 actionable tasks: 8 executed, 28 up-to-date
```

### Final focused Android device test

```bash
rtk ./gradlew :kffi:connectedAndroidDeviceTest -Pandroid.testInstrumentationRunnerArguments.class=org.graphiks.kffi.engine.UpcallEngineTest
```

Result: exit 0; all 3 focused tests passed on the x86_64 API 36 AVD.

```text
Starting 3 tests on Medium_Phone(AVD) - 16
Finished 3 tests on Medium_Phone(AVD) - 16
> Task :kffi:connectedAndroidDeviceTest
BUILD SUCCESSFUL in 6s
88 actionable tasks: 14 executed, 74 up-to-date
```

### Diff hygiene

```bash
rtk git diff --check
```

Result: exit 0 with no output.

## Concerns

- Task 1 exercises void returns and the full argument/routing path, but the
  non-void return and invalid-signature/cleanup behavior remain without direct
  instrumentation coverage until the explicitly planned Task 4 tests.
- Runtime coverage was on the available x86_64 API 36 AVD. `arm64-v8a` was
  compiled successfully but was not runtime-tested on an arm64 device.
- `freeTrampoline` still relies on the documented caller-side quiescence
  guarantee; freeing a callback that is still executing remains a contract
  violation.
- Gradle reports the repository's existing unused `commonTest` source-set and
  Gradle 10 deprecation warnings. No warning originated from the changed native
  source in the final build.

## Commit hashes

- `785b824` — Task 1: `test(android): add failing full ABI callback coverage`
- `4853fa4` — Task 2: `feat(shared): expose explicit upcall ABI signature`
- `9ef1c1a` — Task 3 implementation: `feat(shared): implement dynamic Android upcall ABI`
