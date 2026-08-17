# Quickstart - consuming kffi end to end

This guide covers Gradle dependency setup, `memoryScope`, allocation,
write/read, `CString`, lifetime, the `unsafe` option, a simple callback, and
loading a native library. All symbols used here belong to the public
`org.graphiks.kffi` API (see the [README](../README.md) for the complete
contract).

## 1. Dependency

The group is `org.graphiks`. Release and snapshot artifacts are published
through Maven Central:

```kotlin
// settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
```

When neither the `kffi.version` Gradle property nor the `KFFI_VERSION`
environment variable is set, the build defaults to `1.0.0-SNAPSHOT`. This is
the final standalone snapshot coordinate after the M2.4 migration. The
repository snapshot workflow overrides `KFFI_VERSION` with a timestamp in the
form `YYYYMMDDHHMMSS-SNAPSHOT`, so a snapshot produced by that workflow uses
that timestamped version rather than a fixed `1.0.0-SNAPSHOT` version.

```kotlin
// build.gradle.kts - KMP project; the root artifact resolves the platform variant
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("org.graphiks:kffi:1.0.0-SNAPSHOT") // release: "1.0.0"
        }
    }
}
```

JVM-only project: `implementation("org.graphiks:kffi-jvm:1.0.0-SNAPSHOT")`
(JDK 24+ for `java.lang.foreign`).

Android project: `implementation("org.graphiks:kffi-android:1.0.0-SNAPSHOT")`
(minSdk 28).

Native project: the root artifact `org.graphiks:kffi` is sufficient; Gradle
resolves the `kffi-<target>` variant (for example, `kffi-macosarm64`). There is
no aggregate `kffi-native` artifact.

## 2. `memoryScope`, allocation, write/read

`memoryScope { }` creates a confined arena and guarantees that it is closed at
the end of the block (equivalent to `use { }`):

```kotlin
import org.graphiks.kffi.*

memoryScope { allocator ->
    val buffer = allocator.allocateBuffer(size = 16uL)

    buffer.writeInt(value = 42, offset = 0uL)
    check(buffer.readInt(offset = 0uL) == 42)

    buffer.writeLong(value = 0xCAFEL, offset = 8uL)
    check(buffer.readLong(offset = 8uL) == 0xCAFEL)

    // Bounds checks are enabled by default: any access outside `size` throws
    // IndexOutOfBoundsException (the message includes offset/width/size).
    buffer.readLong(offset = 12uL)
    // IndexOutOfBoundsException: MemoryBuffer access out of bounds: offset=12 width=8 size=16
}
// allocator.close() is guaranteed here; every buffer from this scope is invalid.
```

## 3. Arrays and strings

```kotlin
memoryScope { allocator ->
    val buffer = allocator.allocateBuffer(size = 32uL)

    // Arrays: starting index in the array plus offset in the buffer
    val out = IntArray(4)
    buffer.writeInts(intArrayOf(1, 2, 3, 4), bufferOffset = 0uL)
    buffer.readInts(out, bufferOffset = 0uL)
    check(out.contentEquals(intArrayOf(1, 2, 3, 4)))

    // Strings: allocate a UTF-8 C string terminated by \0 from the scope
    val cstr = allocator.allocateFrom("hello")
    check(cstr.toKString() == "hello")
}
```

## 4. Lifetime

The arena scope lives in `MemoryBuffer` (decision I2-a):

- A buffer from `MemoryAllocator` throws `IllegalStateException` (JVM) after
  `close()`.
- A buffer created from a raw address has **no guard**. Access after the memory
  is released is **undefined behavior** (documented UB, aligned across all
  three backends).

```kotlin
val allocator = MemoryAllocator()
val scoped = allocator.allocateBuffer(16uL)
allocator.close()
scoped.writeLong(1L, 0uL) // JVM: IllegalStateException: "MemoryBuffer has been closed"

// A raw-address buffer has no scope or guard; using freed memory is documented UB.
val backing = MemoryAllocator()
val raw = MemoryBuffer(backing.allocate(16L), 16uL) // alive while backing is open
raw.writeLong(7L, 0uL)

// Process-lifetime arena
val forever = globalMemory.allocateBuffer(16uL)
```

Two buffers over the same memory area see each other's writes; no
synchronization is provided.

On the JVM, the arena is confined to the creating thread
(`Arena.ofConfined()`): access to scoped buffers and `close()` from another
thread throws `WrongThreadException`; `memoryScope` follows the same rule. In
`unsafe` mode, access uses the raw address, so there is no thread check and only
the close guard applies. Raw-address buffers have no confinement (null guard,
documented UB).

## 5. `unsafe` option

The option can be enabled **per allocator** (propagating to every buffer in the
arena) or **per buffer**:

```kotlin
// Per allocator: every created buffer is unsafe
val hotAllocator = MemoryAllocator(unsafe = true)
val hot = hotAllocator.allocateBuffer(128uL)
hot.writeLong(1L, 64uL) // within the backing area; unsafe mode skips bounds checks

// Per buffer: local opt-in (actual allocation is 128 bytes, nominal size is 64)
memoryScope { allocator ->
    val localUnsafe = MemoryBuffer(allocator.allocate(128L), 64uL, unsafe = true)
    localUnsafe.writeLong(1L, 96uL) // outside nominal size: NO exception - UB
}

hotAllocator.close()
hot.writeLong(2L, 0uL) // JVM: IllegalStateException - lifetime guard remains in unsafe mode
```

Unsafe policy P2: `unsafe` skips **only** bounds checks. Lifetime discipline is
unchanged from safe buffers; using a buffer after its arena closes remains
forbidden (use-after-free).

**Native distinction:** on Native backends, the runtime flag is ignored. The
value is fixed at compile time (`KFFI_NATIVE_UNSAFE` in
`MemoryBuffer.native.kt`, `false` by default). To change it, edit the constant
and rebuild the module.

## 6. Simple callback (Native upcall to Kotlin)

Code generated by kextract provides the descriptors, trampolines, and
dispatchers; the following shows the same mechanism by hand. A callback first
implements the `Callback` marker interface:

```kotlin
import org.graphiks.kffi.engine.JvmUpcallEngine

@OptIn(CallbackRuntimeApi::class)
private fun interface StatusCallback : Callback {
    fun onStatus(value: Int)
}
```

The trampoline is a Native stub that calls a static dispatcher. The dispatcher
routes to the lambda registered through `CallbackRuntime.dispatchSafely`
(`userdata` is the routing token and the last C parameter):

```kotlin
@OptIn(CallbackRuntimeApi::class)
private object StatusTrampolines {
    val type = CallbackType<StatusCallback>("quickstart-status", hasRoutingUserdata = true)

    val stub: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = StatusTrampolines::class.java,
            dispatchMethod = "dispatch",
            dispatchSig = "(IJ)V", // (int value, long routingUserdata) -> void
        )
    }

    @JvmStatic
    fun dispatch(value: Int, userdata: Long) {
        CallbackRuntime.dispatchSafely(
            type,
            userdata.takeIf { it != 0L }?.let(::NativeAddress),
        ) { it.onStatus(value) }
    }
}
```

Registration exposes the trampoline address (`callback`) and routing token
(`userdata`) for the Native library:

```kotlin
@OptIn(CallbackRuntimeApi::class)
fun installStatusCallback() {
    val registration = CallbackRuntime.register(
        type = StatusTrampolines.type,
        trampoline = StatusTrampolines.stub,
        policy = CallbackPolicy.REPEATING,
        onError = CallbackExceptionHandler { error -> println("callback failed: $error") },
        callback = StatusCallback { value -> println("native called us with $value") },
    )

    // The Native library receives the trampoline address and userdata.
    // nativeCallExpectsCallback(registration.callback, registration.userdata)

    // Closing prevents further delivery; isQuiescent becomes true after
    // in-flight Native calls return.
    registration.close()
    check(registration.isClosed)
}
```

Contract points:

- `close()` removes the slot (the token is never reused); `isQuiescent` becomes
  true only after in-flight deliveries return.
- `ONCE` is unpublished after the first delivery; `REPEATING` remains active
  until `close()`.
- No exception crosses the Native boundary; failures are routed to `onError`
  or the fallback channel.
- On the JVM, stubs are allocated in a global process-lifetime arena. On
  Android, `UpcallEngine.allocateTrampoline` / `freeTrampoline` provide explicit
  JNI management (generated by kextract).

## 7. Loading a native library

**JVM** - load the library into the process, then resolve its symbols:

```kotlin
import org.graphiks.kffi.findOrThrow

System.loadLibrary("monlib") // must be on java.library.path / classpath

val fn = findOrThrow("mon_symbole") // UnsatisfiedLinkError if not found
```

Start the JVM with `--enable-native-access=ALL-UNNAMED`: the JVM kffi runtime
uses restricted `java.lang.foreign` APIs itself, and kextract bindings can emit
upcalls on the direct FFM path. Without the flag, the JVM emits a warning and
will block the call in a future JDK version.

**Android** - the `libkffi.so` engine loads automatically; the consumed library
is loaded with `dlopen`:

```kotlin
import org.graphiks.kffi.engine.NativeEngine

val handle = NativeEngine.loadNativeLibrary(pathToLib) // dlopen RTLD_NOW|RTLD_GLOBAL
val fn = NativeEngine.resolveSymbolIn(handle, "mon_symbole")
```

**Native** - linking happens at compile time through cinterop (`.def`); no
dynamic loading is required.

## 8. Generating bindings

kffi is runtime-only: generate bindings with
[kextract](https://github.com/klang-toolkit/kextract), targeting
`org.graphiks.kffi`, then link them to kffi as described above. Generated
bindings use the same primitives as this guide (`MemoryBuffer`,
`MemoryAllocator`, `CallbackRuntime`, and the backend engines).
