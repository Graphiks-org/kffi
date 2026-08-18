# kffi — cross-platform FFI layer for wgpu4k-native

Kotlin Multiplatform module `org.graphiks:kffi`: a low-level access layer for
native memory and FFI calls, shared by the wgpu4k-native bindings.
The `expect/actual` contract lives in `commonMain` (`org.graphiks.kffi`):
`NativeAddress`, `MemoryBuffer`, `MemoryAllocator` (+ `memoryScope`, `globalMemory`),
`CString`, `Callback`/`CallbackRuntime`.

## Backends

| Backend | Implementation | Notes |
|---------|----------------|-------|
| **JVM** | Panama FFM (`java.lang.foreign`) | Confined arenas; downcalls through `MethodHandle` |
| **Android** | Custom Kotlin layer | Reimplementation of the `MemorySegment`/`ValueLayout` model on top of JNA |
| **Native** | `kotlinx.cinterop` | Native iOS, macOS, Linux, Windows, and Android |

The memory contract below is unified across all three backends.

## Memory Model

- `NativeAddress` — raw native address (value class over `Long`). **Unbounded by
  design**: all typed access goes through `MemoryBuffer` (bounded) or the
  `unsafe` option.
- `MemoryBuffer` — bounded buffer over a native address: `handler` (address) +
  `size` (size in bytes). Scalar and array access for all families
  (Byte/Short/Int/Long/Float/Double, signed and unsigned, pointers).
- `MemoryAllocator` — confined arena: allocation (`allocate`, `allocateBuffer`,
  `allocateFrom`, `bufferOf`, `bufferOfAddress`, `bufferOfAddresses`), closing
  (`close`), and `memoryScope { }`, which guarantees that the arena is closed at
  the end of the block.

```kotlin
import org.graphiks.kffi.*

memoryScope { allocator ->
    val buffer = allocator.allocateBuffer(size = 16uL)

    buffer.writeInt(value = 42, offset = 0uL)
    val value = buffer.readInt(offset = 0uL) // 42

    buffer.readLong(offset = 12uL)
    // IndexOutOfBoundsException: offset=12 width=8 size=16
}
```

## Memory Safety Contract

### Bounds Checking

Every typed access (scalar or array) is checked: `offset + elementSize ≤ size`.
Out-of-bounds access → `IndexOutOfBoundsException` with the offset and size in
the message.

### `unsafe` Mode (opt-in)

`unsafe = true` disables bounds checks, optionally:

- per allocator — `MemoryAllocator(unsafe = true)` propagates the option to
  **all** buffers created by that allocator;
- per buffer — `MemoryBuffer(addr, size, unsafe = true)` enables it locally.

Default: `false` (bounds checks enabled). In `unsafe` mode, any out-of-bounds
access becomes **undefined behavior** (UB): no exception, with possible memory
corruption. This is a deliberate choice reserved for hot paths.

### Lifetime

Decision I2-(a): the arena/session scope lives in `MemoryBuffer` (not in
`NativeAddress`).

- Buffer created through `MemoryAllocator` (JVM): carries the arena's scoped
  segment → access after the arena's `close()` → `IllegalStateException`.
- Buffer created from a raw address (`MemoryBuffer(addr, size)`): no scope →
  post-close access is **not detected** (documented UB, aligned with
  Android/native).
- JVM `unsafe` mode: the I2-(a) close guard is **retained** (a lightweight
  `isAlive` check before access); only bounds checks are skipped.

### Native Difference

On native backends, `unsafe` mode is **fixed at compile time**: the value is a
build-time constant (`KFFI_NATIVE_UNSAFE` in `MemoryBuffer.native.kt`, currently
`false`). Native distributions cannot switch it at runtime; the API flag is
accepted for compatibility but has no effect. To switch it at compile time, edit
the constant and rebuild the module.

### Aliasing

Two buffers over the same memory area see each other's changes: writes through
one are visible through the other. **No locking**: synchronization is the
consumer's responsibility.

## Version

`Kffi.VERSION` (`1.0.0`) — group `org.graphiks`. This README is the module's
consumer contract; the semantic reference is the common KDoc
(`MemoryBuffer.kt`, `MemoryAllocator.kt` in `commonMain`).
