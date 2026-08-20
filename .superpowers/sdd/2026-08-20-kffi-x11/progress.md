# SDD ledger — plan: docs/superpowers/plans/2026-08-20-kffi-x11.md

## Setup

- Worktree: `/Users/chaos/.codex/worktrees/1df3/kffi` (linked worktree, branch `codex/add-x11-bindings`).
- Spec: `docs/superpowers/specs/2026-08-20-kffi-x11-design.md`.
- kextract submodule fetched from `origin/codex/fix-union-layout` and detached at `9252fb417ea91dae882a6a9e9d06ab672c50adc3`.

## Pre-flight plan scan

| Scope | Produces / consumes | Result | Ruling |
|---|---|---|---|
| Task 1 ↔ Task 2 | Task 1 tests and module consume `org.graphiks.kffi.x11.generated`; Task 2 generates it. | Intentional dependency; Task 1 must initially fail until Task 2. | Ruling: keep the contract-first sequence; the missing generated package is the expected red state. |
| Task 1 ↔ Task 3 | Task 1 registers `kffi-x11`; Task 3 documents it. | No behavioral conflict. | Ruling: none. |
| Task 2 ↔ Task 3 | Task 2 creates generator script and generated source; Task 3 documents and reruns it. | No behavioral conflict. | Ruling: none. |
| Task 1 self-check | Test imports generated declarations before they exist; module files are created in the same task. | Expected TDD red state, then module compile gap. | Ruling: preserve the two-stage failure as specified. |
| Task 2 self-check | Generator output is generated, not hand-authored; the script names the required declarations. | Matches spec and global constraints. | Ruling: no hand-written FFM descriptors or offsets. |
| Task 3 self-check | Documentation refers to the completed module and script. | Depends on Tasks 1–2 as intended. | Ruling: execute last. |

## Decisions

- Ruling: use `kffi-wayland` as the Gradle/module pattern, because this change adds a sibling JVM-only low-level binding module.
- Ruling: pin the submodule gitlink to `9252fb4` rather than only mentioning the remote branch, because reproducible generation needs a concrete revision and the PR branch is not merged yet.
- Ruling: keep X11 include lists in the generator script; these are generation configuration, not handwritten binding implementations.

## Task 1: complete

- Implementer commits: `0c6cad29e8c1ff947b11bdad3e2556d5685f02a6`, `96f1719d650245cbd2725bf24f20c7bbf1447c3c`.
- Task review: approved after the test was corrected to assert `UnionLayout` and `StructLayout` directly.
- Test evidence: focused module test correctly remains red because generated declarations are not present until Task 2; `git diff --check` passes.

## Task 2 fix-loop ruling

- Ruling: keep all available X11 functions generated, but represent native records that the pinned kextract revision cannot emit safely (nested anonymous records or C ABI padding) as opaque `MemorySegment` pointer parameters. Add only generator-input compatibility declarations when a stable storage layout is needed; do not add handwritten Kotlin layouts or offsets. This preserves the user's generator-first requirement at the cost of not exposing unsafe record accessors until kextract supports those declarations.

## Task 2: complete

- Implementer commits: `aed237a0c2c7e9197aad7a539426cae645b914b1`, `390b12f2b819c1cbf729042d6a0eb22340a55e42`, `37ae805f1daf949310fc84efd188170537e0b199`.
- Task review: approved after adding generated `KffiXEventStorage` and `XShmSegmentInfoCompat` compatibility declarations, ABI assertions, and a clean-submodule check.
- Test evidence: generation succeeds at kextract `9252fb4`; `:kffi-x11:jvmTest` passes 2/2.

## Task 3: complete

- Implementer commit: `93b5da8f670770aa8d5488bdb4b5602035addd22`.
- Task review: approved; documentation covers module scope, regeneration, pinned kextract revision, opaque records, and compatibility shims.
- Test evidence: root `test`, Docker generation, `:kffi-x11:jvmTest`, and `git diff --check` pass.
- Ruling: `XEvent` and `XImage` remain opaque because their stock Xlib definitions contain nested records that the pinned generator references without emitting. `XWindowAttributes`, `XWMHints`, and `XGC` remain omitted as raw layouts because the generator does not insert required LP64 padding. `XShmSegmentInfo` is also omitted after its raw generated layout placed `shmaddr` at offset 12. Handwritten Kotlin layouts would violate the generator-only requirement, so the checked-in C input defines only `KffiXEventStorage` (192-byte XEvent storage union) and `XShmSegmentInfoCompat` (32-byte padded storage struct); Xlib/XShm functions keep generated opaque `MemorySegment` parameters.

## Final review fix-wave decision

- Ruling: retain the generated pointer boundary for complex Xlib records and
  make the C generator input the ABI authority. `x11_compat.h` includes the
  native Xlib/Xutil/XShm headers, undefines and redeclares `XDestroyImage`, and
  uses LP64 size/alignment/offset `_Static_assert` checks to prove both shims
  correspond to their native records. Kotlin tests inspect only generated
  layouts and reflected generated signatures; no handwritten Kotlin layout or
  native offset implementation is introduced.
- Ruling: the Docker base digest, pinned kextract revision, clean-submodule
  check, architecture-selected Linux platform, and post-generation generated
  package diff check are the reproducibility boundary. Ubuntu APT package
  versions are intentionally described as supplied during image build, not as
  an unavailable snapshot pin.
- Ruling: defer replacing isolated numeric `KeyPress` with a direct Xlib
  constant-only extraction because the pinned generator emits hundreds of
  transitive declarations when that header is included. Keep `KeyRelease` in
  the primary Xlib extraction and test its presence as the real-header-derived
  constant coverage.
