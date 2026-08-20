# Extended Wayland Protocol Generation Design

## Goal

Extend the `kffi-wayland` generation pipeline from the current four protocol
XML files to the nine additional protocols requested for activation, pointer
input, scaling, presentation, DMA-BUF, and cursor handling. Replace the
corresponding manually constructed `wl_interface` descriptors while preserving
the handwritten runtime marshalling and event-handling code.

## Scope

The existing four inputs remain generated:

- `stable/xdg-shell/xdg-shell.xml`
- `unstable/xdg-decoration/xdg-decoration-unstable-v1.xml`
- `unstable/text-input/text-input-unstable-v3.xml`
- local wlroots `wlr-screencopy-unstable-v1.xml`

The following nine inputs are added from the pinned
`third_party/wayland-protocols` submodule:

- `staging/xdg-activation/xdg-activation-v1.xml`
- `unstable/pointer-constraints/pointer-constraints-unstable-v1.xml`
- `unstable/relative-pointer/relative-pointer-unstable-v1.xml`
- `staging/xdg-toplevel-icon/xdg-toplevel-icon-v1.xml`
- `staging/fractional-scale/fractional-scale-v1.xml`
- `stable/viewporter/viewporter.xml`
- `stable/presentation-time/presentation-time.xml`
- `stable/linux-dmabuf/linux-dmabuf-v1.xml`
- `staging/cursor-shape/cursor-shape-v1.xml`

The pipeline therefore processes thirteen protocol XML inputs in total. The
submodule remains pinned to commit
`d5aed4e4903a77aefaef03359d1ffdc0d5093456`.

## Architecture

`docker/kffi-wayland-codegen/generate.sh` remains the single explicit entry
point. It passes every XML input to both `wayland-scanner` and the existing
`ProtocolInterfaceGenerator`, and passes the resulting client headers to
`kextract` in the Docker image. The generated Kotlin contains the protocol
`wl_interface` descriptors, request/event opcode constants, and enum
constants.

The XML generator keeps the current cross-file model: references to interfaces
defined in the input set point to generated descriptors, while references to
core `wl_*` interfaces resolve to symbols exported by `libwayland-client`. The
additional protocols are selected from the pinned repository rather than copied
into the project.

## Manual-code reduction

The following descriptors in `Wayland_h.kt` are replaced with generated values:

- `xdg_activation_v1_interface`
- `xdg_activation_token_v1_interface`
- `zwp_pointer_constraints_v1_interface`
- `zwp_locked_pointer_v1_interface`
- `zwp_confined_pointer_v1_interface`
- `xdg_toplevel_icon_manager_v1_interface`
- `xdg_toplevel_icon_v1_interface`

The newly generated descriptors for relative pointer, fractional scale,
viewporter, presentation-time, linux-dmabuf, and cursor-shape become available
to runtime code without adding handwritten `buildWaylandInterface` definitions.
Existing marshalling `MethodHandle`s, listeners, collectors, and other runtime
glue remain handwritten. The helper is retained for unrelated protocol
descriptors that are outside this scope.

## Testing and verification

The Java generator regression test is extended before implementation to cover
cross-interface references, nullable arguments, opcodes, and enum constants.
The generated sources are regenerated from all thirteen XML inputs and checked
for deterministic output. The following local checks must pass:

```bash
javac -d /tmp/kffi-wayland-codegen-test \
  docker/kffi-wayland-codegen/ProtocolInterfaceGenerator.java \
  docker/kffi-wayland-codegen/ProtocolInterfaceGeneratorTest.java
java -cp /tmp/kffi-wayland-codegen-test ProtocolInterfaceGeneratorTest
bash -n docker/kffi-wayland-codegen/generate.sh scripts/gen-kffi-wayland.sh
./gradlew --rerun-tasks \
  :kffi-wayland:jvmTest :kffi-wayland:assemble \
  :kffi:jvmTest :kffi-posix:jvmTest
```

The Docker code-generation image remains the source of truth for regeneration;
the full Docker rebuild is separately reported if local container storage
prevents it from running.

## Compatibility and non-goals

This change does not add high-level Wayland APIs, change the public runtime
marshalling contract, or generate every protocol present in
`wayland-protocols`. It only expands the explicitly selected protocol subset
and removes duplicate manual descriptors for the protocols listed above.
