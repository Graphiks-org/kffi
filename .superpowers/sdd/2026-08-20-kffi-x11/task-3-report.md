# Task 3 report: X11 binding documentation

## Files changed

- `README.md`
- `kffi-x11/README.md`

## Commands and results

- `rtk ./gradlew --no-daemon test` — passed (`BUILD SUCCESSFUL`).
- `rtk scripts/gen-kffi-x11.sh` — passed; Docker rebuilt/used the codegen image
  and regenerated the X11 bindings deterministically.
- `rtk ./gradlew --no-daemon :kffi-x11:jvmTest` — passed (`BUILD SUCCESSFUL`).
- `rtk git diff --check` — passed with no output.
- `rtk git diff --stat` and `rtk git status --short --branch` — reviewed before
  staging; only the two documentation files were staged.

## Commit

`93b5da8f670770aa8d5488bdb4b5602035addd22` —
`docs: document generated kffi x11 bindings`

## Concerns

- Regeneration is Linux-only because its Docker pipeline uses Ubuntu X11
  development headers; it was run successfully in Docker for this task.
- The root Gradle test and `:kffi-x11:jvmTest` contract tests do not start or
  require an X server.
- Pre-existing untracked `docs/superpowers/` was intentionally left untouched.

---

## Final review fix wave

### Files changed

- `docker/kffi-x11-codegen/Dockerfile`
- `docker/kffi-x11-codegen/generate.sh`
- `docker/kffi-x11-codegen/x11_compat.h`
- `docker/kffi-x11-codegen/x11_constants.h`
- `scripts/gen-kffi-x11.sh`
- `kffi-x11/src/jvmMain/kotlin/org/graphiks/kffi/x11/generated/Xlib_h.kt`
- `kffi-x11/src/jvmTest/kotlin/org/graphiks/kffi/x11/X11BindingTest.kt`
- `README.md`, `kffi-x11/README.md`
- `docs/superpowers/specs/2026-08-20-kffi-x11-design.md`
- `docs/superpowers/plans/2026-08-20-kffi-x11.md`
- `.superpowers/sdd/2026-08-20-kffi-x11/progress.md`

### Delivered fixes

- `x11_compat.h` now includes Xlib/Xutil/XShm/stddef headers, undefines the
  Xutil function-like `XDestroyImage` macro, and redeclares
  `int XDestroyImage(XImage *)`. kextract now generates the pointer-based
  `MemorySegment -> Int` declaration.
- The compatibility header proves the generated shim boundary against native
  headers with LP64, size, alignment, and native field-offset `_Static_assert`
  checks for `KffiXEventStorage` and `XShmSegmentInfoCompat`.
- The focused binding test checks the reflected `XDestroyImage` signature,
  generated union/struct alignment and named field offsets, and the Linux-only
  native `XOpenDisplay(MemorySegment.NULL)` path (closing a non-null display).
- The Docker base is digest-pinned to
  `eclipse-temurin:25-jdk-noble@sha256:e94f1dc880339ab3884b69176b79c8dc4124b722e059c7ff7f0bf53b603a46f8`.
  The wrapper explicitly selects `linux/amd64` or `linux/arm64`, retains the
  exact kextract revision and clean-submodule checks, rejects untracked output,
  and fails when the generated package differs from the tracked working tree.
- The design, plan, READMEs, and SDD ledger describe generated compatibility
  layouts plus opaque pointer APIs rather than raw complex Xlib layouts.

### Commands and results

| Command | Result |
| --- | --- |
| `rtk ./gradlew --no-daemon :kffi-x11:jvmTest` before the fix | Expected RED: `X11BindingTest.exposesCoreFunctionsAndConstants` failed because `XDestroyImage` was absent. |
| `rtk scripts/gen-kffi-x11.sh` after changing generator inputs | Expected diff failure after generating the new `XDestroyImage` binding; output was retained for review and staging. |
| `rtk ./gradlew --no-daemon :kffi-x11:jvmTest` after regeneration | Passed: 3 tests, 0 failures. |
| `rtk scripts/gen-kffi-x11.sh` | Passed after staging the reviewed generated package; Docker used the digest-pinned image, kextract `9252fb417ea91dae882a6a9e9d06ab672c50adc3`, and emitted no generated-package diff. |
| `rtk ./gradlew --no-daemon :kffi-x11:jvmTest` | Passed (`BUILD SUCCESSFUL`). |
| `rtk ./gradlew --no-daemon test` | Passed (`BUILD SUCCESSFUL`). |
| `rtk git diff --check` | Passed with no output. |

### Remaining concerns

- The local host is non-Linux, so the Linux-only native smoke test correctly
  returned before loading X11; the test is enabled and will execute on Linux
  without requiring a display server.
- `KeyPress` remains the isolated numeric compatibility macro. Directly
  including Xlib in that constant-only generation input made the pinned
  generator emit hundreds of transitive declarations; `KeyRelease` remains
  selected from and tested against the real Xlib header.
