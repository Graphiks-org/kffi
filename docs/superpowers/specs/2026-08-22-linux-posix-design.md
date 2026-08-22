# Linux POSIX bindings design

## Goal

Extend the JVM-only `kffi-posix` module with a public, Linux-only API for
memory mapping, POSIX and System V shared memory, `memfd`, file-descriptor
primitives, and generic `poll(2)`.

The API must be safe to consume from Kotlin Foreign Function & Memory (FFM)
code without promising portability to non-Linux systems. It must expose every
operation requested by the consumer while retaining access to the native
`errno` that belongs to the call which failed.

## Scope

The generated binding includes the Linux declarations and macros needed for:

- `mmap`, `munmap`, `shm_open`, `shm_unlink`;
- `memfd_create`, `ftruncate`;
- `shmget`, `shmat`, `shmdt`, `shmctl`;
- `eventfd`, `pipe`, `pipe2`, `fcntl`, `read`, `write`, `close`, and `poll`;
- mapping, file-open, memory-file, IPC, poll, and errno constants required by
  those operations.

The public Kotlin facade provides synchronous raw bindings. Resource ownership
remains explicit: consumers call `munmap`, `close`, `shm_unlink`, `shmdt`, and
`shmctl(..., IPC_RMID, ...)` as applicable. This change does not introduce a
high-level event loop, automatic finalization, POSIX portability, `ppoll`, or
additional System V control-record layouts.

## Architecture

### Generated layer

A reproducible Linux Docker generator will invoke the pinned `kextract`
revision against a curated compatibility header. The header enables
`_GNU_SOURCE` and includes `errno.h`, `fcntl.h`, `poll.h`, `sys/eventfd.h`,
`sys/ipc.h`, `sys/mman.h`, `sys/shm.h`, and `unistd.h`.

Generated sources are tracked in
`kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/generated`. The
generator script follows the repository's X11 convention: build the pinned
generator in Docker, regenerate into staging, normalize generator whitespace,
and fail if tracked output differs. It links generated downcalls to
`libc.so.6`.

`fcntl` is declared as a variadic function with its first variadic argument
at index two. The compatibility header contains C aliases for pointer-valued
or otherwise difficult-to-use macros such as `MAP_FAILED`, so their Linux
values are generated alongside ordinary constants.

### Public layer

`LinuxPosix` is the supported public entry point. It resolves the generated
functions and presents direct Kotlin equivalents using `MemorySegment`,
`Long` for `size_t`/`off_t`/`nfds_t` on the supported LP64 Linux ABIs, and
`Int` for file descriptors, flags, IPC identifiers, and `errno`.

`LinuxErrno` exposes `EINTR`, `EAGAIN`, `ENOMEM`, `EINVAL`, and `ENOSYS`.
`LinuxPosix` exposes the requested mapping, open, memfd, System V, and
file-descriptor constants. `PollFd` remains the public storage-layout helper;
it gains the full relevant Linux event mask set and a generic multi-FD
`poll` operation. `revents` remains readable per entry through `PollFd`.

The existing `PosixWakeup` public behavior remains unchanged. Its injectable
internal syscall seam and tests remain usable, while its native implementation
may reuse the common Linux call support where that avoids duplication.

### Error model

The FFM downcall layer uses `Linker.Option.captureCallState("errno")` for
each native invocation. A negative integer/long return, `MAP_FAILED`, or the
`shmat` failure pointer is translated immediately into the existing public
`PosixException(operation, errno)`.

Successful calls never expose a stale `errno`. A generic `poll` returns its
native ready-count, including zero on timeout; callers inspect every
`PollFd.revents` field after a non-negative result. The generic API does not
silently retry `EINTR`; callers can observe it through `PosixException`. The
existing `PollFd.isReadable` keeps its current retrying convenience behavior.

### Memory mappings and pointers

`mmap` and `shmat` return address-based `MemorySegment` values. `mmap`
reinterprets a successful returned address to the requested mapping length,
so users can access the mapping through FFM. Callers retain the returned
segment and pass the original mapping address and length to `munmap`.

`shmat` returns an address segment because its lifetime and size are managed
by System V IPC, not by the attachment call. It rejects the native
`(void*) -1` sentinel before returning. `shmctl` exposes its third argument as
an optional raw `MemorySegment`; this supports `IPC_RMID` with `NULL` today
without committing to an incomplete Kotlin layout for `struct shmid_ds`.

## Data flow

1. A consumer configures a `PollFd` array or a native-backed buffer.
2. `LinuxPosix.poll` calls the generated `poll` downcall with captured call
   state.
3. On success, the kernel-written `revents` values remain in the caller's
   array. On failure, the facade raises `PosixException` using the captured
   `errno`.
4. Shared-memory and mapping calls use the same downcall/error path; their
   successful returned address is validated before it is returned to the
   caller.

## Testing

Unit tests cover the public constants, multi-entry `PollFd` layout, generic
poll behavior, and failure-to-`PosixException` conversion through injectable
native-call seams where possible. Linux integration tests exercise:

- anonymous `mmap` read/write and `munmap`;
- named POSIX shared-memory create, size, map, unlink, and cleanup;
- `memfd_create`, `ftruncate`, map, and close;
- System V create, attach, detach, and removal;
- multi-descriptor polling and `revents`, including hangup/error masks where
  the kernel deterministically reports them;
- exposed `eventfd`, pipe, `fcntl`, read/write, and close operations.

Linux-only integration tests are skipped on other operating systems. Every
test cleans up native resources in `finally` blocks even when an assertion
fails.

## Documentation and release

The `kffi-posix` README documents the Linux-only contract, the generated
source workflow, explicit resource cleanup, and restricted native-access
runtime requirement. The changelog records this new public API as an
unreleased addition.
