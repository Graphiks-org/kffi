# Extended Wayland Protocol Generation Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Extend the explicit kffi-wayland generation pipeline from four to fourteen protocol XML inputs, generate descriptors/constants for the requested Wayland protocols and the tablet-v2 cursor-shape dependency, and remove the corresponding manual descriptors.

**Architecture:** Keep Docker as the reproducible code-generation environment and make docker/kffi-wayland-codegen/generate.sh own a single ordered protocol manifest. Feed that manifest to wayland-scanner, kextract, and ProtocolInterfaceGenerator; keep generated Kotlin checked in. Runtime marshalling, method handles, listeners, and collectors remain handwritten, while Wayland_h.kt delegates selected descriptors to the generated package.

**Tech Stack:** Bash arrays and wayland-scanner, Java DOM XML parsing, kextract, Kotlin/JVM 25, Java Foreign Function & Memory API, Gradle Kotlin Multiplatform, pinned Git submodules.

**Spec:** docs/superpowers/specs/2026-08-20-wayland-protocol-generation-design.md

## Global Constraints

- Use the pinned wayland-protocols submodule at commit d5aed4e4903a77aefaef03359d1ffdc0d5093456.
- Generate fourteen XML inputs: the existing four, the nine requested protocols, and stable/tablet/tablet-v2.xml as the cursor-shape dependency.
- Keep wlr-screencopy-unstable-v1.xml local because it is maintained by wlroots.
- Keep Docker as the source of truth for regeneration; do not add a Gradle code-generation task.
- Keep JDK and Kotlin bytecode targets at JVM 25.
- Do not add high-level Wayland APIs or rewrite runtime marshalling/listener code.
- Follow CONTRIBUTING.md, use conventional commit subjects, and update PR #17 rather than opening a second PR.

---

### Task 1: Add a failing integration assertion for expanded generated constants

**Files:**
- Modify: kffi-wayland/src/jvmTest/kotlin/org/graphiks/kffi/wayland/WaylandBindingTest.kt

**Interfaces:**
- Consumes: generated constants in the module package.
- Produces: a compile-time regression test proving that the expanded protocol manifest is represented in generated Kotlin.

- [ ] **Step 1: Write the failing test**

Add one focused test method:

~~~kotlin
@Test
fun exposesGeneratedExtendedProtocolConstants() {
    assertEquals(1, XDG_ACTIVATION_GET_ACTIVATION_TOKEN)
    assertEquals(1, POINTER_CONSTRAINTS_LIFETIME_ONESHOT)
    assertEquals(2, POINTER_CONSTRAINTS_LIFETIME_PERSISTENT)
    assertEquals(0, RELATIVE_POINTER_EVENT_RELATIVE_MOTION)
    assertEquals(1, WP_CURSOR_SHAPE_DEVICE_SHAPE_DEFAULT)
    assertEquals(3, LINUX_DMABUF_GET_SURFACE_FEEDBACK)
}
~~~

- [ ] **Step 2: Run the test to verify it fails**

Run:

~~~bash
./gradlew :kffi-wayland:jvmTest
~~~

Expected: compilation fails because the new generated constants do not yet
exist in WaylandProtocolConstants.kt. This confirms the test exercises the
missing feature rather than only existing behavior.

- [ ] **Step 3: Commit the red test**

~~~bash
git add kffi-wayland/src/jvmTest/kotlin/org/graphiks/kffi/wayland/WaylandBindingTest.kt
git commit -m "test(shared): cover extended Wayland protocol constants"
~~~

### Task 2: Replace the four-entry commands with a fourteen-entry manifest

**Files:**
- Modify: docker/kffi-wayland-codegen/generate.sh

**Interfaces:**
- Consumes: pinned submodule paths and the local wlroots XML.
- Produces: XML_INPUTS and HEADER_INPUTS arrays shared by validation, wayland-scanner, kextract, and ProtocolInterfaceGenerator.

- [ ] **Step 1: Define the ordered protocol manifest**

Replace the individual PROTO, PROTO_DECO, PROTO_TEXT, and PROTO_SCREENCOPY
variables with a PROTOCOL_SPECS array containing these source/header pairs:

~~~bash
"$WAYLAND_PROTOCOLS_DIR/stable/xdg-shell/xdg-shell.xml|xdg-shell-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/unstable/xdg-decoration/xdg-decoration-unstable-v1.xml|xdg-decoration-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/unstable/text-input/text-input-unstable-v3.xml|text-input-client-protocol.h"
"$PROTOCOLS/wlr-screencopy-unstable-v1.xml|wlr-screencopy-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/staging/xdg-activation/xdg-activation-v1.xml|xdg-activation-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/unstable/pointer-constraints/pointer-constraints-unstable-v1.xml|pointer-constraints-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/unstable/relative-pointer/relative-pointer-unstable-v1.xml|relative-pointer-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/staging/xdg-toplevel-icon/xdg-toplevel-icon-v1.xml|xdg-toplevel-icon-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/staging/fractional-scale/fractional-scale-v1.xml|fractional-scale-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/stable/viewporter/viewporter.xml|viewporter-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/stable/presentation-time/presentation-time.xml|presentation-time-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/stable/linux-dmabuf/linux-dmabuf-v1.xml|linux-dmabuf-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/staging/cursor-shape/cursor-shape-v1.xml|cursor-shape-client-protocol.h"
"$WAYLAND_PROTOCOLS_DIR/stable/tablet/tablet-v2.xml|tablet-client-protocol.h"
~~~

Build XML_INPUTS and HEADER_INPUTS from this array while validating every XML
path exists. Use IFS='|' read -r xml header so paths remain safely quoted.

- [ ] **Step 2: Route all three generators through the arrays**

Generate each client header with:

~~~bash
for spec in "${PROTOCOL_SPECS[@]}"; do
    IFS='|' read -r xml header <<< "$spec"
    wayland-scanner client-header "$xml" "$GEN/$header"
done
~~~

Pass "${HEADER_INPUTS[@]}" to kextract and pass
"${XML_INPUTS[@]}" "$INTERFACE_OUT" "$CONSTANTS_OUT" to
ProtocolInterfaceGenerator. This prevents future protocol additions from
requiring three independent command edits.

- [ ] **Step 3: Verify script syntax and manifest paths**

Run:

~~~bash
bash -n docker/kffi-wayland-codegen/generate.sh scripts/gen-kffi-wayland.sh
git submodule status
~~~

Expected: syntax succeeds and the wayland-protocols entry reports commit
d5aed4e4903a77aefaef03359d1ffdc0d5093456.

- [ ] **Step 4: Commit the manifest change**

~~~bash
git add docker/kffi-wayland-codegen/generate.sh
git commit -m "build(shared): expand Wayland protocol generation manifest"
~~~

### Task 3: Regenerate and verify descriptors, constants, and kextract bindings

**Files:**
- Modify: kffi-wayland/src/jvmMain/kotlin/org/graphiks/kffi/wayland/generated/WaylandProtocolInterfaces.kt
- Modify: kffi-wayland/src/jvmMain/kotlin/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt
- Modify or create: files under kffi-wayland/src/jvmMain/kotlin/org/graphiks/kffi/wayland/generated/ produced by kextract

**Interfaces:**
- Consumes: fourteen-entry manifest and pinned XML submodule.
- Produces: generated descriptors for activation, pointer constraints, relative pointer, icons, scaling, viewporter, presentation, DMA-BUF, cursor-shape, and zwp_tablet_tool_v2.

- [ ] **Step 1: Run the Docker generator**

Initialize submodules if needed and run:

~~~bash
git submodule update --init --recursive
scripts/gen-kffi-wayland.sh
~~~

The generated descriptor file must contain these new top-level values:

~~~text
xdg_activation_v1_interface
xdg_activation_token_v1_interface
zwp_pointer_constraints_v1_interface
zwp_locked_pointer_v1_interface
zwp_confined_pointer_v1_interface
zwp_relative_pointer_manager_v1_interface
zwp_relative_pointer_v1_interface
xdg_toplevel_icon_manager_v1_interface
xdg_toplevel_icon_v1_interface
wp_fractional_scale_manager_v1_interface
wp_fractional_scale_v1_interface
wp_viewporter_interface
wp_viewport_interface
wp_presentation_interface
wp_presentation_feedback_interface
zwp_linux_dmabuf_v1_interface
zwp_linux_buffer_params_v1_interface
zwp_linux_dmabuf_feedback_v1_interface
wp_cursor_shape_manager_v1_interface
wp_cursor_shape_device_v1_interface
zwp_tablet_tool_v2_interface
~~~

- [ ] **Step 2: Verify deterministic custom-generator output**

Run the Java generator twice with the same fourteen XML arguments and compare
the two WaylandProtocolInterfaces.kt and WaylandProtocolConstants.kt files with
cmp. Expected: both comparisons return zero and the generated constants include
XDG_ACTIVATION_GET_ACTIVATION_TOKEN, POINTER_CONSTRAINTS_LIFETIME_PERSISTENT,
WP_CURSOR_SHAPE_DEVICE_SHAPE_DEFAULT, and linux-dmabuf constants.

- [ ] **Step 3: Run the newly added test**

~~~bash
./gradlew :kffi-wayland:jvmTest
~~~

Expected: the test from Task 1 compiles and passes.

- [ ] **Step 4: Commit generated outputs**

~~~bash
git add kffi-wayland/src/jvmMain/kotlin/org/graphiks/kffi/wayland/generated kffi-wayland/src/jvmMain/kotlin/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt
git commit -m "build(shared): generate extended Wayland protocol bindings"
~~~

### Task 4: Replace selected handwritten descriptors with generated descriptors

**Files:**
- Modify: kffi-wayland/src/jvmMain/kotlin/org/graphiks/kffi/wayland/Wayland_h.kt

**Interfaces:**
- Consumes: generated descriptor values from org.graphiks.kffi.wayland.generated.
- Produces: source-compatible aliases for activation, pointer constraints, and toplevel icons without rebuilding their wl_interface layouts by hand.

- [ ] **Step 1: Add generated descriptor imports**

Import these seven generated descriptor values:

~~~kotlin
import org.graphiks.kffi.wayland.generated.xdg_activation_v1_interface
import org.graphiks.kffi.wayland.generated.xdg_activation_token_v1_interface
import org.graphiks.kffi.wayland.generated.zwp_pointer_constraints_v1_interface
import org.graphiks.kffi.wayland.generated.zwp_locked_pointer_v1_interface
import org.graphiks.kffi.wayland.generated.zwp_confined_pointer_v1_interface
import org.graphiks.kffi.wayland.generated.xdg_toplevel_icon_manager_v1_interface
import org.graphiks.kffi.wayland.generated.xdg_toplevel_icon_v1_interface
~~~

- [ ] **Step 2: Replace manual descriptor bodies and duplicate constants**

Change each selected buildWaylandInterface(...) body to return its generated
descriptor, and remove the handwritten pointer-constraint lifetime constants.
Keep the existing wl_proxy_marshal_flags method handles and all unrelated manual
descriptors (ext_background_effect_* and org_kde_kwin_blur_*).

- [ ] **Step 3: Run the focused Kotlin test**

~~~bash
./gradlew :kffi-wayland:jvmTest
~~~

Expected: all existing tests and the expanded constants test pass.

- [ ] **Step 4: Commit the runtime cleanup**

~~~bash
git add kffi-wayland/src/jvmMain/kotlin/org/graphiks/kffi/wayland/Wayland_h.kt
git commit -m "refactor(shared): use generated Wayland protocol descriptors"
~~~

### Task 5: Update documentation and the existing PR description

**Files:**
- Modify: kffi-wayland/README.md
- Modify remotely: PR #17 description

**Interfaces:**
- Consumes: final fourteen-input manifest.
- Produces: regeneration instructions naming the pinned source dependency, the wlroots exception, and the tablet-v2 technical dependency.

- [ ] **Step 1: Update the module README**

Document the nine requested protocols plus stable/tablet/tablet-v2.xml as a
generation dependency, state that only wlr-screencopy remains vendored locally,
and keep the explicit Docker regeneration command.

- [ ] **Step 2: Update PR #17**

Revise the existing PR body to say fourteen XML inputs, retain the exact
CONTRIBUTING.md headings and one selected change type, and update the local
validation command to use :kffi-posix:jvmTest.

- [ ] **Step 3: Commit documentation**

~~~bash
git add kffi-wayland/README.md
git commit -m "docs(shared): document extended Wayland protocol set"
~~~

### Task 6: Run the full verification suite and update PR #17

**Files:**
- Verify: all changed files and generated outputs.

- [ ] **Step 1: Run Java generator and shell checks**

~~~bash
javac -d /tmp/kffi-wayland-codegen-test \
  docker/kffi-wayland-codegen/ProtocolInterfaceGenerator.java \
  docker/kffi-wayland-codegen/ProtocolInterfaceGeneratorTest.java
java -cp /tmp/kffi-wayland-codegen-test ProtocolInterfaceGeneratorTest
bash -n docker/kffi-wayland-codegen/generate.sh scripts/gen-kffi-wayland.sh
git diff --check
~~~

- [ ] **Step 2: Run the full local Gradle verification**

~~~bash
./gradlew --rerun-tasks \
  :kffi-wayland:jvmTest :kffi-wayland:assemble \
  :kffi:jvmTest :kffi-posix:jvmTest
~~~

Expected: BUILD SUCCESSFUL; existing deprecation warnings may remain but no
test or compilation failure is accepted.

- [ ] **Step 3: Check the generated diff and repository state**

~~~bash
git status --short --branch
git diff master...HEAD --stat
git submodule status
~~~

Expected: no uncommitted changes, both submodules are pinned, and the diff
contains only the manifest, generated sources, targeted runtime cleanup, docs,
and the approved spec/plan files.

- [ ] **Step 4: Push and refresh PR #17**

~~~bash
git push origin feat/kff-wayland-generation
gh pr view 17 --repo Graphiks-org/kffi --json url,isDraft,statusCheckRollup
~~~

Keep the PR as draft unless the user explicitly asks to mark it ready. Report
any Docker storage limitation separately from local Gradle and generator
results.
