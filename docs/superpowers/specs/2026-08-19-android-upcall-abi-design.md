# Android Native Callback ABI Design

**Date:** 2026-08-19

**Status:** Approved for implementation

## Goal

Allow `kextract`-generated Android bindings to install WebGPU native callbacks
without JNA, including scalar C carriers, pointers, `size_t`, `uintptr_t`,
structs passed by value, multiple parameters, and routing userdata on
`arm64-v8a` and `x86_64`.

## Public API

Android exposes two independent signatures:

```kotlin
external fun allocateTrampoline(
    dispatcherClass: Class<*>,
    dispatchMethod: String,
    dispatchJvmSignature: String,
    dispatchAbiSignature: String,
): Long
```

`dispatchJvmSignature` is the JNI method descriptor used by
`GetStaticMethodID`, such as `(JJI)V`. `dispatchAbiSignature` describes the C
callback passed to `libffi`, such as `v(struct(ptr,size_t),u32,ptr)`.

The existing three-argument source call remains available as a compatibility
wrapper for the former fixed `void (uint32_t, void*)` callback shape. New
generated code must use the four-argument API and must name both signatures.

## ABI signature grammar

The callback ABI signature is a compact ASCII signature:

```text
signature := return-type '(' argument-list? ')'
argument-list := type (',' type)*
type := v | i8 | u8 | i16 | u16 | i32 | u32 | i64 | u64
      | float | double | ptr | size_t | uintptr_t
      | struct '(' type (',' type)* ')'
```

`v` is valid only as the return type. `struct(...)` describes fields in their
native declaration order. The implementation may accept the existing compact
aliases `p`, `f32`, and `f64` as input aliases, but generated signatures use
the names above for clarity.

The supported mapping is:

| ABI type | `ffi_type` | Dispatcher carrier |
| --- | --- | --- |
| `i8`, `u8` | `ffi_type_sint8`, `ffi_type_uint8` | JNI `B` |
| `i16`, `u16` | `ffi_type_sint16`, `ffi_type_uint16` | JNI `S` |
| `i32`, `u32` | `ffi_type_sint32`, `ffi_type_uint32` | JNI `I` |
| `i64`, `u64` | `ffi_type_sint64`, `ffi_type_uint64` | JNI `J` |
| `float` | `ffi_type_float` | JNI `F` |
| `double` | `ffi_type_double` | JNI `D` |
| `ptr` | `ffi_type_pointer` | JNI `J` |
| `size_t` | `ffi_type_uint64` on supported ABIs | JNI `J` |
| `uintptr_t` | `ffi_type_uint64` on supported ABIs | JNI `J` |
| `struct(...)` | persistent `ffi_type_struct` | JNI `J` address |

The implementation rejects struct return values. Struct arguments are passed
by value by `libffi`, and the closure forwards the temporary address supplied
in `args[i]` to Kotlin as a `jlong`.

## Routing and dispatcher order

For a routed callback, the final C ABI parameter is `ptr` and is named
`routing_userdata` by the generator. The closure does not forward that C
parameter in its original position. It calls the static dispatcher as:

```text
(routingToken, argument0, argument1, ... argumentN)
```

where `routingToken` is the final C pointer converted directly to `jlong`.
The remaining arguments retain C declaration order. The dispatcher signature
therefore has the same number of parameters as the C callback, starts with
`J`, and replaces the final userdata parameter with the routing token. For
example:

```text
C callback:       void (WGPUStringView message, uint32_t status, void* userdata)
dispatch JVM:     static void dispatch(long token, long messageAddress, int status)
dispatch JNI:     (JJI)V
dispatch ABI:     v(struct(ptr,size_t),u32,ptr)
```

If the ABI does not end in `ptr`, the callback is treated as non-routed and
the dispatcher receives the C arguments in order. A final ordinary pointer is
therefore reserved for routing userdata in this API contract.

The JNI descriptor is validated against the ABI-derived dispatcher shape:
narrow integers use `B`/`S`, 32-bit integers use `I`, 64-bit integers,
pointers, and struct addresses use `J`, and floating-point values use `F` or
`D`. A routed dispatcher must begin with `J`.

## Native lifetime and error handling

Each allocated trampoline slot owns all memory borrowed by its `ffi_cif`:

- the dynamic `ffi_type**` argument array;
- recursive `ffi_type_struct` objects;
- each struct's null-terminated `elements` array;
- ABI-kind and JNI-carrier metadata.

These allocations remain live until `freeTrampoline`. Allocation and parsing
failures release all partially initialized resources, delete the dispatcher
global reference, return the slot to the pool, and leave an informative Java
exception pending. The closure catches and reports Java exceptions through the
existing logcat path; no exception crosses the native callback boundary.

The pointer passed for a struct-by-value argument is valid only while the
dispatcher is executing. Kotlin must copy the fields immediately if it needs
to retain them; it must not store the address. Generated code constructs the
`WGPUStringView` wrapper from that address while inside the dispatcher.

## Verification

Instrumented Android tests use the existing native fixture and exercise:

- `void` callbacks and multiple parameters;
- signed/unsigned 8-, 16-, 32-, and 64-bit carriers;
- `float`, `double`, pointers, `void*`, `size_t`, and `uintptr_t`;
- enum carriers through `i32` and `u32`;
- `struct(ptr,size_t)` matching `WGPUStringView`;
- routed callback delivery and temporary struct address lifetime;
- a non-void scalar return to verify `resp` marshaling;
- invalid ABI/JNI signatures and cleanup paths.

The Android native library continues to build only `arm64-v8a` and `x86_64`.
The PR runs JVM and Android host checks required by `CONTRIBUTING.md`, plus
the connected Android device tests where an emulator is available.
