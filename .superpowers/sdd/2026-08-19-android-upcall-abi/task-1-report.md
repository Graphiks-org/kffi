# Task 1 Report

## Changed files

- `kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallEngineTest.kt`
- `kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallDispatcher.kt`
- `kffi-android-native/src/main/cpp/bench_engine_fixture.c`

## What changed

- Added the test-only `bench_fire_all_types` native fixture with the exact scalar, pointer, struct-by-value, `size_t`, and `uintptr_t` payloads from the brief.
- Extended the Android test dispatcher with `AllTypes`, a volatile capture slot, and immediate copying of the temporary `WGPUStringView` payload bytes via `MemoryBuffer`/`NativeAddress`.
- Updated the Android tests to call the trampoline API with explicit JVM and ABI signatures, free trampolines after use, and cover the full routed ABI shape in a dedicated test.

## Tests and commands

1. `rtk ./gradlew :kffi:compileDebugAndroidTestKotlin`

   Result: failed before compilation because `:kffi:compileDebugAndroidTestKotlin` does not exist in this repository.

2. `rtk ./gradlew :kffi:tasks --all | rtk rg 'androidDeviceTest|compile.*Kotlin|compile.*Android'`

   Result: showed the actual Android device test compilation task as `compileAndroidDeviceTest`.

3. `rtk ./gradlew :kffi:compileAndroidDeviceTest`

   Result: failed with the expected missing four-argument API errors:

   - `No parameter with name 'dispatchJvmSignature' found.`
   - `No parameter with name 'dispatchAbiSignature' found.`
   - `No value passed for parameter 'dispatchSig'.`

## Concerns

- The task name in the brief, `:kffi:compileDebugAndroidTestKotlin`, is not present in this repo; the equivalent task is `:kffi:compileAndroidDeviceTest`.
- The new full-ABI path is intentionally red until the production Android trampoline API and native ABI parser are implemented in later tasks.
- The struct-address copy is asserted through the dispatcher capture; the temporary struct address itself is only checked as non-zero because its exact value is native-runtime dependent.

## Commit hashes

- `785b824` - `test(android): add failing full ABI callback coverage`
