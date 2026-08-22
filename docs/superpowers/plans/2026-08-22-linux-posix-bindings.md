# Linux POSIX Bindings Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (- [ ]) syntax for tracking.

**Goal:** Add generated Linux libc bindings and a public kffi-posix API for mappings, shared memory, memfd, descriptor I/O, and multi-FD polling.

**Architecture:** Generate raw Linux libc declarations and macro values with the repository-pinned kextract tool in a reproducible Docker image. Keep a small handwritten public facade for errno capture, sentinel translation, mapping-size reinterpretation, and reusable descriptor operations; retain PollFd as the storage and polling entry point.

**Tech Stack:** Kotlin 2.x, JDK 25 Foreign Function & Memory API, Linux libc, Docker, kextract, Gradle/Kotlin test.

**Spec:** docs/superpowers/specs/2026-08-22-linux-posix-design.md

## Global Constraints

- Support Linux LP64 only; document the restriction and use Linux libc (libc.so.6).
- Keep ownership explicit; never add finalizers or automatic unmapping.
- Capture errno in the same FFM downcall with Linker.Option.captureCallState("errno").
- Translate negative scalar results, MAP_FAILED, and the shmat failure address into PosixException immediately.
- Preserve PosixWakeup and its injectable PosixSyscalls seam.
- Track generated Kotlin sources and make regeneration fail on a diff.
- Use Conventional Commit subjects with allowed shared scope.
- Use the existing Gradle JDK-native-access configuration.

## File Structure

- docker/kffi-posix-codegen/Dockerfile: pinned generator environment.
- docker/kffi-posix-codegen/linux_posix_compat.h: curated Linux headers and macro aliases.
- docker/kffi-posix-codegen/generate.sh: staged, reproducible source generation.
- scripts/gen-kffi-posix.sh: host Docker entry point.
- kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/generated/LinuxPosix_h.kt: tracked raw generated binding.
- kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxErrno.kt: requested errno constants.
- kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxPosix.kt: public facade and native-call helper.
- kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/PollFd.kt: complete masks and multi-FD polling.
- kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/PosixWakeup.kt: public FD pair if required by pipe.
- kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixGeneratedBindingTest.kt: raw generation smoke test.
- kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixMemoryTest.kt: mmap, POSIX SHM, memfd, errno tests.
- kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixDescriptorTest.kt: FD and System V tests.
- kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/PollFdTest.kt: multi-FD poll tests.
- kffi-posix/README.md and CHANGELOG.md: Linux-only public contract and release note.

### Task 1: Generate and track the raw Linux libc surface

**Files:**
- Create: docker/kffi-posix-codegen/Dockerfile
- Create: docker/kffi-posix-codegen/linux_posix_compat.h
- Create: docker/kffi-posix-codegen/generate.sh
- Create: scripts/gen-kffi-posix.sh
- Create: kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/generated/LinuxPosix_h.kt
- Test: kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixGeneratedBindingTest.kt

**Interfaces:**
- Produces raw functions mmap, munmap, shm_open, shm_unlink, memfd_create, ftruncate, shmget, shmat, shmdt, shmctl, eventfd, pipe, pipe2, fcntl, read, write, close, and poll.
- Produces macros PROT_*, MAP_*, O_*, MFD_CLOEXEC, IPC_*, POLL*, and requested errno values.
- Uses --variadic-args fcntl:2 and targets org.graphiks.kffi.posix.generated.

- [ ] **Step 1: Write the failing generated-surface smoke test**

    @Test
    fun generatedLinuxConstantsMatchTheLinuxAbi() {
        if (!isLinux()) return
        assertEquals(1, PROT_READ())
        assertEquals(2, PROT_WRITE())
        assertEquals(0x20, MAP_ANONYMOUS())
        assertEquals(0x80000, O_CLOEXEC())
        assertEquals(1, MFD_CLOEXEC())
        assertEquals(4, EINTR())
    }

Import the generated package; kextract emits the included macro names as
zero-argument Kotlin functions, so this test imports PROT_READ,
PROT_WRITE, MAP_ANONYMOUS, O_CLOEXEC, MFD_CLOEXEC, and EINTR directly.

- [ ] **Step 2: Run the smoke test and verify RED**

Run: ./gradlew :kffi-posix:jvmTest --tests org.graphiks.kffi.posix.LinuxPosixGeneratedBindingTest

Expected: Kotlin compilation fails because the generated package is absent.

- [ ] **Step 3: Add the compatibility header and generator**

Use this complete header:

    #define _GNU_SOURCE
    #include <errno.h>
    #include <fcntl.h>
    #include <poll.h>
    #include <stdint.h>
    #include <sys/eventfd.h>
    #include <sys/ipc.h>
    #include <sys/mman.h>
    #include <sys/shm.h>
    #include <unistd.h>
    #define KFFI_MAP_FAILED_ADDRESS ((intptr_t) MAP_FAILED)
    #define KFFI_SHMAT_FAILED_ADDRESS ((intptr_t) -1)

Follow the X11 generator exactly for pinned kextract revision verification, staged output, whitespace normalisation, tracked-output check, and rejection of untracked generated files. Pass -l :libc.so.6. The Dockerfile uses the pinned Temurin 25 image and installs clang-18, llvm-18-dev, libclang-18-dev, gcc, libc6-dev, patch, ca-certificates, and git. The host entry script chooses linux/amd64 for x86_64 or amd64 and linux/arm64 for aarch64 or arm64.

- [ ] **Step 4: Run generation and verify generated source**

Run: ./scripts/gen-kffi-posix.sh

Expected: exit 0; generated LinuxPosix_h.kt is tracked and generation has no unstaged diff after it is committed.

- [ ] **Step 5: Run the smoke test and verify GREEN**

Run: ./gradlew :kffi-posix:jvmTest --tests org.graphiks.kffi.posix.LinuxPosixGeneratedBindingTest

Expected: PASS on Linux and clean skip on other systems.

- [ ] **Step 6: Commit Task 1**

Run: git add docker/kffi-posix-codegen scripts/gen-kffi-posix.sh kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/generated kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixGeneratedBindingTest.kt

Run: git commit -m "feat(shared): generate linux posix bindings"

### Task 2: Add captured-errno mappings, POSIX SHM, and memfd

**Files:**
- Create: kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxErrno.kt
- Create: kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxPosix.kt
- Create: kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixMemoryTest.kt

**Interfaces:**

    object LinuxErrno {
        val EINTR: Int
        val EAGAIN: Int
        val ENOMEM: Int
        val EINVAL: Int
        val ENOSYS: Int
    }

    fun mmap(address: MemorySegment, length: Long, protection: Int, flags: Int, fd: Int, offset: Long): MemorySegment
    fun munmap(address: MemorySegment, length: Long)
    fun shmOpen(name: String, flags: Int, mode: Int): Int
    fun shmUnlink(name: String)
    fun memfdCreate(name: String, flags: Int): Int
    fun ftruncate(fd: Int, length: Long)

- [ ] **Step 1: Write failing memory tests**

    @Test
    fun anonymousMappingIsWritableAndCanBeUnmapped() {
        if (!isLinux()) return
        val mapping = LinuxPosix.mmap(
            MemorySegment.NULL, 4096,
            LinuxPosix.PROT_READ or LinuxPosix.PROT_WRITE,
            LinuxPosix.MAP_PRIVATE or LinuxPosix.MAP_ANONYMOUS, -1, 0,
        )
        try {
            mapping.set(ValueLayout.JAVA_INT, 0, 42)
            assertEquals(42, mapping.get(ValueLayout.JAVA_INT, 0))
        } finally {
            LinuxPosix.munmap(mapping, 4096)
        }
    }

    @Test
    fun zeroLengthMappingReportsCapturedEinval() {
        if (!isLinux()) return
        val failure = assertFailsWith<PosixException> {
            LinuxPosix.mmap(MemorySegment.NULL, 0, LinuxPosix.PROT_READ,
                LinuxPosix.MAP_PRIVATE or LinuxPosix.MAP_ANONYMOUS, -1, 0)
        }
        assertEquals("mmap", failure.operation)
        assertEquals(LinuxErrno.EINVAL, failure.errno)
    }

Add POSIX SHM test: use a unique slash-prefixed UUID name, O_RDWR or O_CREAT or O_EXCL, mode 0b110_000_000, ftruncate, MAP_SHARED, and shmUnlink in an outer finally. Add memfd test: create, truncate, map, write, unmap, close in nested finally blocks.

- [ ] **Step 2: Run memory tests and verify RED**

Run: ./gradlew :kffi-posix:jvmTest --tests org.graphiks.kffi.posix.LinuxPosixMemoryTest

Expected: compilation fails because LinuxPosix and LinuxErrno do not exist.

- [ ] **Step 3: Implement facade and captured-error helper**

Create one internal helper owning Linker.nativeLinker(), captureCallState("errno"), capture-state layout/offset, and a downcall cache keyed by name and FunctionDescriptor. Allocate call state in Arena.ofConfined(), pass it as first argument, and read errno before closing the arena.

Use descriptors:

    mmap: FunctionDescriptor.of(ADDRESS, ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG)
    munmap: FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_LONG)
    shmOpen: FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT)
    shmUnlink: FunctionDescriptor.of(JAVA_INT, ADDRESS)
    memfdCreate: FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_INT)
    ftruncate: FunctionDescriptor.of(JAVA_INT, JAVA_INT, JAVA_LONG)

Resolve symbols with PosixSymbols. Allocate C strings with arena.allocateFrom(name). Expose LinuxErrno, LinuxPosix flags, and PollFd masks as read-only Kotlin properties delegated to generated macro functions; do not duplicate Linux ABI values by hand. mmap rejects MAP_FAILED then returns returnedAddress.reinterpret(length); every negative scalar call throws PosixException with its C operation name.

- [ ] **Step 4: Run memory tests and verify GREEN**

Run: ./gradlew :kffi-posix:jvmTest --tests org.graphiks.kffi.posix.LinuxPosixMemoryTest

Expected: PASS on Linux and clean skip elsewhere.

- [ ] **Step 5: Commit Task 2**

Run: git add kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxErrno.kt kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxPosix.kt kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixMemoryTest.kt

Run: git commit -m "feat(shared): expose linux mappings and shared memory"

### Task 3: Expose descriptor primitives and System V shared memory

**Files:**
- Modify: kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxPosix.kt
- Modify: kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/PosixWakeup.kt
- Create: kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixDescriptorTest.kt
- Modify: kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/PosixWakeupTest.kt

**Interfaces:**

    data class FdPair(val readFd: Int, val writeFd: Int)
    fun eventfd(initialValue: Int, flags: Int): Int
    fun pipe(): FdPair
    fun pipe2(flags: Int): FdPair
    fun fcntl(fd: Int, command: Int, argument: Int = 0): Int
    fun read(fd: Int, destination: MemorySegment, byteCount: Long = destination.byteSize()): Long
    fun write(fd: Int, source: MemorySegment, byteCount: Long = source.byteSize()): Long
    fun close(fd: Int)
    fun shmget(key: Int, size: Long, flags: Int): Int
    fun shmat(shmid: Int, address: MemorySegment = MemorySegment.NULL, flags: Int = 0): MemorySegment
    fun shmdt(address: MemorySegment)
    fun shmctl(shmid: Int, command: Int, buffer: MemorySegment = MemorySegment.NULL)

Expose IPC_PRIVATE, IPC_CREAT, IPC_RMID, O_NONBLOCK, F_GETFD, F_SETFD, F_GETFL, and F_SETFL on LinuxPosix.

- [ ] **Step 1: Write failing descriptor/System V tests**

    @Test
    fun pipeTransfersBytesThroughPublicDescriptorOperations() {
        if (!isLinux()) return
        val (readFd, writeFd) = LinuxPosix.pipe2(LinuxPosix.O_CLOEXEC)
        try {
            Arena.ofConfined().use { arena ->
                val source = arena.allocateFrom(ValueLayout.JAVA_BYTE, 7)
                val target = arena.allocate(ValueLayout.JAVA_BYTE)
                assertEquals(1, LinuxPosix.write(writeFd, source))
                assertEquals(1, LinuxPosix.read(readFd, target))
                assertEquals(7, target.get(ValueLayout.JAVA_BYTE, 0).toInt())
            }
        } finally {
            LinuxPosix.close(readFd)
            LinuxPosix.close(writeFd)
        }
    }

Add a System V test that creates IPC_PRIVATE 4096-byte memory with IPC_CREAT or 0b110_000_000, attaches, writes, detaches, and calls shmctl(shmid, IPC_RMID) in an outer finally. Add eventfd read/write test using one native-order 64-bit counter.

- [ ] **Step 2: Run descriptor tests and verify RED**

Run: ./gradlew :kffi-posix:jvmTest --tests org.graphiks.kffi.posix.LinuxPosixDescriptorTest

Expected: compilation fails because the public FD and System V methods are absent.

- [ ] **Step 3: Implement descriptor/System V methods**

Use captured calls:

    eventfd: FunctionDescriptor.of(JAVA_INT, JAVA_INT, JAVA_INT)
    pipe: FunctionDescriptor.of(JAVA_INT, ADDRESS)
    pipe2: FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_INT)
    fcntl: FunctionDescriptor.of(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT)
    readWrite: FunctionDescriptor.of(JAVA_LONG, JAVA_INT, ADDRESS, JAVA_LONG)
    close: FunctionDescriptor.of(JAVA_INT, JAVA_INT)
    shmget: FunctionDescriptor.of(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_INT)
    shmat: FunctionDescriptor.of(ADDRESS, JAVA_INT, ADDRESS, JAVA_INT)
    shmdt: FunctionDescriptor.of(JAVA_INT, ADDRESS)
    shmctl: FunctionDescriptor.of(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS)

Allocate pipe storage as two JAVA_INT values in a confined arena. Apply Linker.Option.firstVariadicArg(2) to fcntl. Reject the shmat minus-one address. Change existing internal FdPair to public instead of adding another pair type. Do not alter PosixWakeup semantics.

- [ ] **Step 4: Run descriptor and wakeup tests and verify GREEN**

Run: ./gradlew :kffi-posix:jvmTest --tests org.graphiks.kffi.posix.LinuxPosixDescriptorTest --tests org.graphiks.kffi.posix.PosixWakeupTest

Expected: PASS; fake-seam wakeup tests remain green on all systems.

- [ ] **Step 5: Commit Task 3**

Run: git add kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxPosix.kt kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/PosixWakeup.kt kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/LinuxPosixDescriptorTest.kt kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/PosixWakeupTest.kt

Run: git commit -m "feat(shared): expose linux descriptors and sysv shared memory"

### Task 4: Complete public multi-FD polling

**Files:**
- Modify: kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/PollFd.kt
- Modify: kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxPosix.kt
- Create: kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/PollFdTest.kt

**Interfaces:**
- PollFd exposes POLLIN, POLLPRI, POLLOUT, POLLERR, POLLHUP, POLLNVAL, POLLRDNORM, POLLRDBAND, POLLWRNORM, and POLLWRBAND as read-only Short properties.
- PollFd.poll(segment: MemorySegment, count: Long, timeoutMillis: Int): Int returns native ready count or throws PosixException.

- [ ] **Step 1: Write failing multi-FD poll tests**

    @Test
    fun pollReportsReventsForEachReadyDescriptor() {
        if (!isLinux()) return
        val first = LinuxPosix.pipe()
        val second = LinuxPosix.pipe()
        try {
            Arena.ofConfined().use { arena ->
                val fds = PollFd.allocate(arena, 2)
                PollFd.set(fds, 0, first.readFd, PollFd.POLLIN)
                PollFd.set(fds, 1, second.readFd, PollFd.POLLIN)
                val byte = arena.allocateFrom(ValueLayout.JAVA_BYTE, 1)
                LinuxPosix.write(second.writeFd, byte)
                assertEquals(1, PollFd.poll(fds, 2, 1_000))
                assertEquals(0, PollFd.revents(fds, 0).toInt() and PollFd.POLLIN.toInt())
                assertNotEquals(0, PollFd.revents(fds, 1).toInt() and PollFd.POLLIN.toInt())
            }
        } finally {
            listOf(first.readFd, first.writeFd, second.readFd, second.writeFd).forEach(LinuxPosix::close)
        }
    }

Add a closed-writer test asserting POLLHUP and a timeout test asserting zero result and zero revents.

- [ ] **Step 2: Run poll tests and verify RED**

Run: ./gradlew :kffi-posix:jvmTest --tests org.graphiks.kffi.posix.PollFdTest

Expected: compilation fails because PollFd.poll and the new masks are absent.

- [ ] **Step 3: Implement generic poll**

Add masks from generated Linux macro values and retain SIZE_BYTES = 8. Validate count >= 0 and timeoutMillis >= -1. LinuxPosix uses FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_LONG, JAVA_INT), returns native result, and maps failure to PosixException("poll", errno). PollFd.isReadable calls the generic poll with one entry and preserves its EINTR retry loop.

- [ ] **Step 4: Run poll and wakeup tests and verify GREEN**

Run: ./gradlew :kffi-posix:jvmTest --tests org.graphiks.kffi.posix.PollFdTest --tests org.graphiks.kffi.posix.PosixWakeupTest

Expected: PASS; wakeup keeps its three signal/poll/drain integration cycles on Linux.

- [ ] **Step 5: Commit Task 4**

Run: git add kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/PollFd.kt kffi-posix/src/jvmMain/kotlin/org/graphiks/kffi/posix/LinuxPosix.kt kffi-posix/src/jvmTest/kotlin/org/graphiks/kffi/posix/PollFdTest.kt

Run: git commit -m "feat(shared): add complete linux polling api"

### Task 5: Document, validate, review, and prepare PR

**Files:**
- Modify: kffi-posix/README.md
- Modify: CHANGELOG.md

**Interfaces:** Documents LinuxPosix, LinuxErrno, PollFd.poll, generation, Linux-only support, and explicit cleanup.

- [ ] **Step 1: Add executable documentation coverage**

Use Task 2 anonymous-mapping test and Task 4 two-FD polling test as executable copies of the README snippets. Ensure the README examples use the same names, cleanup structure, and JDK native-access requirement.

- [ ] **Step 2: Update README and changelog**

Document JVM-only plus Linux-only contract, generator command ./scripts/gen-kffi-posix.sh, resource cleanup with try/finally, and the required --enable-native-access=ALL-UNNAMED runtime flag. Add one Unreleased changelog bullet listing generated Linux bindings, mappings, POSIX/System V shared memory, memfd, FD operations, complete poll, and errno constants.

- [ ] **Step 3: Run final verification**

Run: ./scripts/gen-kffi-posix.sh

Run: ./gradlew :kffi-posix:jvmTest

Run: ./gradlew :kffi:jvmTest

Run: git diff --check

Expected: all commands exit 0 with no regenerated diff, test failures, or whitespace errors.

- [ ] **Step 4: Request independent code review and resolve findings**

Provide the reviewer with this plan, the design doc, base SHA, and head SHA. Fix every Critical or Important finding, add a regression test before each fix, rerun the affected test, then rerun Step 3.

- [ ] **Step 5: Commit docs and prepare PR**

Run: git add kffi-posix/README.md CHANGELOG.md

Run: git commit -m "docs(shared): document linux posix bindings"

Run: git fetch origin master

Run: git rebase origin/master

Run: git log --oneline origin/master..HEAD

Create a PR titled feat(shared): expose generated linux posix bindings. Copy exact headings from .github/PULL_REQUEST_TEMPLATE.md, select exactly the feature checkbox, mark the changelog updated, mark documentation updated, and place the commands/results from Step 3 in Additional Notes.
