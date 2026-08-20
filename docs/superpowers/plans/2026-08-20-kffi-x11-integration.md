# kffi X11 Screenshot Integration Tests Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Add a Linux-only, headless X11 integration test that creates a window through the generated kffi bindings, receives X11 events, captures the window as PNG, and verifies the capture in CI.

**Architecture:** A Gradle `x11IntegrationTest` task will run only when `KFFI_X11_INTEGRATION=1`. A Linux shell runner starts `Xvfb`, exports `DISPLAY`, launches the Gradle task, preserves the Xvfb/client/capture artifacts, and always terminates the server. The Kotlin test will use generated X11 APIs for display/window/event/image lifecycle and invoke `xwd` plus ImageMagick only for screenshot serialization; it will not read handwritten `XImage` offsets.

**Tech Stack:** Kotlin/JVM tests, JUnit Platform, JDK 25 FFM, generated kextract X11 bindings, Xvfb, `xwd`, ImageMagick, GitHub Actions Ubuntu.

**Spec:** `docs/superpowers/specs/2026-08-20-kffi-x11-design.md`

## Global Constraints

- The integration test is Linux-only because the generated bindings load `libX11.so.6`, `libXext.so.6`, and `libXcomposite.so.1`.
- The test is opt-in through `KFFI_X11_INTEGRATION=1`; ordinary JVM tests remain display-independent.
- No handwritten Kotlin FFM layouts or native Xlib record offsets may be added.
- `KffiXEventStorage` is the only generated event storage used by the test; its `type` accessor validates the generated union path.
- XShm is out of scope for this iteration because the current kffi POSIX surface does not provide the SysV shared-memory lifecycle needed for a deterministic test.
- CI artifacts are written below `kffi-x11/build/x11-integration/` and uploaded on failure or success.

---

### Task 1: Add the failing integration test contract

**Files:**
- Create: `kffi-x11/src/jvmTest/kotlin/org/graphiks/kffi/x11/X11IntegrationTest.kt`
- Test: `kffi-x11/src/jvmTest/kotlin/org/graphiks/kffi/x11/X11IntegrationTest.kt`

**Interfaces:**
- Consumes: generated `XOpenDisplay`, `XDefaultScreen`, `XDefaultRootWindow`, `XCreateSimpleWindow`, `XSelectInput`, `XMapWindow`, `XFlush`, `XSync`, `XPending`, `XNextEvent`, `XGetImage`, `XDestroyImage`, `XDestroyWindow`, `XCloseDisplay`, `KffiXEventStorage`, `Expose`, `MapNotify`, `ExposureMask`, and `StructureNotifyMask`.
- Produces: one integration test named `createsMapsProcessesAndCapturesWindow` that requires `KFFI_X11_INTEGRATION=1`, waits for both `MapNotify` and `Expose`, and writes `window.png` plus diagnostic logs below the configured artifact directory.

- [ ] **Step 1: Write the failing test**

  Add the test class with these assertions and helpers:

  1. Require Linux and `KFFI_X11_INTEGRATION=1`; resolve `DISPLAY` and the artifact directory from `KFFI_X11_ARTIFACT_DIR` or `kffi.x11.defaultArtifactDir`.
  2. Open the display and assert a non-null display, a non-negative `XConnectionNumber`, a valid default screen, and a non-zero root window.
  3. Allocate `KffiXEventStorage` in an `Arena`, create a `96x64` child window with `XCreateSimpleWindow`, select `ExposureMask() or StructureNotifyMask()`, map it, flush it, and call `XSync`.
  4. Poll with a ten-second deadline using `XPending` and `XNextEvent`; read `KffiXEventStorage.type(event)` and assert that `Expose()` and `ConfigureNotify()` are observed after mapping and resizing the window.
  5. Call `XGetImage(display, window, 0, 0, 96, 64, -1L, 2)` and assert a non-null image, then call `XDestroyImage(image)`.
  6. Capture the window with `xwd -id <window> -silent` piped to `convert xwd:- png:<artifact>/window.png`; assert the command exit statuses and decode the PNG with `ImageIO`.
  7. Assert the PNG dimensions are `96x64` and retain `client.log` and `capture.log` under the artifact directory.
  8. Use a `finally` block to destroy the image if still owned, destroy the window, and close the display; attach cleanup failures to the primary failure.

- [ ] **Step 2: Run the test to verify it fails**

  Run:

  ```bash
  rtk ./gradlew --no-daemon :kffi-x11:jvmTest --tests org.graphiks.kffi.x11.X11IntegrationTest
  ```

  Expected: the test reaches the opt-in integration path and fails on the current host because no Xvfb display has been started yet; this is the expected red state before the runner exists. If the host lacks `libX11.so.6`, record that platform prerequisite as the reason for the red result.

- [ ] **Step 3: Commit**

  ```bash
  rtk git add -- kffi-x11/src/jvmTest/kotlin/org/graphiks/kffi/x11/X11IntegrationTest.kt
  rtk git commit -m "test(shared): define x11 screenshot integration contract"
  ```

### Task 2: Add the generated event contract and gated Gradle task

**Files:**
- Modify: `kffi-x11/build.gradle.kts`

**Interfaces:**
- Consumes: `KFFI_X11_INTEGRATION`, the existing `jvmTest` classpath, and the pinned kextract generator.
- Produces: `:kffi-x11:x11IntegrationTest`, filtered to `org.graphiks.kffi.x11.X11IntegrationTest`, with `kffi.x11.defaultArtifactDir` set to `kffi-x11/build/x11-integration`.

- [ ] **Step 1: Add the minimal task configuration**

  Register a `Test` task that depends on `jvmTestClasses`, reuses `jvmTest` test classes and classpath, uses JUnit Platform, passes `--enable-native-access=ALL-UNNAMED`, and is skipped unless `KFFI_X11_INTEGRATION` equals `1`.

- [ ] **Step 2: Run the task without the environment gate**

  Run:

  ```bash
  rtk ./gradlew --no-daemon :kffi-x11:x11IntegrationTest
  ```

  Expected: `BUILD SUCCESSFUL` with the task skipped because `KFFI_X11_INTEGRATION` is not set.

- [ ] **Step 3: Commit**

  ```bash
  rtk git add -- kffi-x11/build.gradle.kts
  rtk git commit -m "build(shared): add gated x11 integration task"
  ```

### Task 3: Add the Xvfb screenshot runner

**Files:**
- Create: `scripts/run-x11-integration.sh`

**Interfaces:**
- Consumes: `Xvfb`, `xwd`, `convert`, the repository Gradle launcher, and optional `KFFI_X11_INTEGRATION_*` overrides.
- Produces: `DISPLAY=:99`, `KFFI_X11_INTEGRATION=1`, `KFFI_X11_ARTIFACT_DIR`, and the invocation of `:kffi-x11:x11IntegrationTest`.

- [ ] **Step 1: Add dependency and repository validation**

  Require Linux, `Xvfb`, `xwd`, and `convert`; resolve `KFFI_X11_INTEGRATION_REPO_ROOT`, `KFFI_X11_INTEGRATION_GRADLE`, and `KFFI_X11_INTEGRATION_ARTIFACT_DIR` using the same override pattern as `scripts/run-wayland-integration.sh`.

- [ ] **Step 2: Add deterministic Xvfb lifecycle**

  Create a mode-700 temporary directory, start `Xvfb :99 -screen 0 640x480x24 -nolisten tcp`, write its stdout/stderr to `xvfb.log`, wait for `/tmp/.X11-unix/X99`, export `DISPLAY=:99`, and use an EXIT trap to terminate Xvfb and remove only the temporary directory.

- [ ] **Step 3: Invoke the Gradle task**

  Export `KFFI_X11_INTEGRATION=1` and `KFFI_X11_ARTIFACT_DIR`, then run:

  ```bash
  "$GRADLE" :kffi-x11:x11IntegrationTest --no-daemon --configure-on-demand
  ```

- [ ] **Step 4: Verify the runner on a Linux host with dependencies installed**

  Run:

  ```bash
  rtk scripts/run-x11-integration.sh
  ```

  Expected: `window.png`, `client.log`, `capture.log`, and `xvfb.log` are present under `kffi-x11/build/x11-integration/` and the script exits zero.

- [ ] **Step 5: Commit**

  ```bash
  rtk git add -- scripts/run-x11-integration.sh
  rtk git commit -m "test(shared): add headless x11 screenshot runner"
  ```

### Task 4: Enable Linux CI and upload artifacts

**Files:**
- Modify: `.github/workflows/ci.yml`

**Interfaces:**
- Consumes: Ubuntu runner and the new shell runner.
- Produces: a required `x11-integration` CI job with X11 runtime/tools installed and artifact upload on every outcome.

- [ ] **Step 1: Add the Ubuntu dependency installation**

  Install `xvfb`, `x11-apps`, `libx11-6`, `libxext6`, `libxcomposite1`, and `imagemagick` with `apt-get --no-install-recommends`.

- [ ] **Step 2: Run and collect the integration test**

  Run `scripts/run-x11-integration.sh`, then upload `kffi-x11/build/x11-integration/**` with `if: always()` and `if-no-files-found: warn`.

- [ ] **Step 3: Commit**

  ```bash
  rtk git add -- .github/workflows/ci.yml
  rtk git commit -m "ci(shared): run x11 screenshot integration"
  ```

### Task 5: Document local execution and verification

**Files:**
- Modify: `kffi-x11/README.md`
- Modify: `README.md`

**Interfaces:**
- Consumes: the runner, environment variables, task name, and artifact paths defined by Tasks 2–4.
- Produces: reproducible local instructions and a clear Linux-only limitation.

- [ ] **Step 1: Document dependencies and commands**

  Add the Ubuntu package list, the direct command `scripts/run-x11-integration.sh`, the Gradle task, the opt-in environment variable, and the artifact directory. State that the test uses Xvfb and does not require a physical X server or window manager.

- [ ] **Step 2: Run documentation and repository checks**

  Run:

  ```bash
  rtk git diff --check
  rtk ./gradlew --no-daemon :kffi:jvmTest :kffi-x11:jvmTest
  rtk git status --short --branch
  ```

- [ ] **Step 3: Commit**

  ```bash
  rtk git add -- kffi-x11/README.md README.md
  rtk git commit -m "docs(docs): document x11 screenshot integration"
  ```

### Task 6: Final verification and PR update

**Files:**
- Verify: all files changed by Tasks 1–5

- [ ] **Step 1: Run the complete local verification available on the current host**

  Run the normal JVM tests, generated-source drift check, and `git diff --check`. On a Linux host with X11 dependencies, also run `scripts/run-x11-integration.sh`; on macOS, record that the Linux-only integration runner was not executable locally.

- [ ] **Step 2: Inspect the final diff and PR status**

  Confirm the branch remains based on `origin/master`, has no merge commits, and the PR body still describes the generated X11 bindings plus the new screenshot integration.

- [ ] **Step 3: Push the commits**

  ```bash
  rtk git push origin feat/x11-bindings
  ```

- [ ] **Step 4: Confirm GitHub CI**

  Read PR #18 and confirm the X11 integration job is present and running; report any unavailable Linux-only local verification explicitly.
