# kffi-wayland

JVM-only low-level Wayland bindings for `kffi`, built on the Java Foreign
Function & Memory API (Panama FFM).

The module contains the Wayland client, XDG Shell, screencopy, and text-input
protocol bindings imported from
[`ygdrasil-io/poc-koreos`](https://github.com/ygdrasil-io/poc-koreos/tree/master/ffi/wayland)
at commit `411bd9f6795f8aae5330fddca96dd4e77629a4b4`.

The imported sources include kextract-generated low-level bindings and the
handwritten FFM runtime glue. Protocol XML is used to generate the
`wl_interface` descriptors, request/event opcodes, and enum constants for XDG
Shell, XDG decoration, text-input-v3, and wlr-screencopy. Generated sources
are kept under `generated/` (with protocol constants in the module package).
The generation pipeline is available explicitly through
`scripts/gen-kffi-wayland.sh`; it runs `wayland-scanner`, the pinned `kextract`
submodule, and the XML protocol-interface generator in Docker. The
text-input-v3, wlr-screencopy, XDG Shell, and XDG decoration XML snapshots are
pinned in `docker/kffi-wayland-codegen/protocols/` (wayland-protocols commit
`d5aed4e4903a77aefaef03359d1ffdc0d5093456`, wlroots commit
`0855cdacb2eeeff35849e2e9c4db0aa996d78d10`). It is not run as part of the
Gradle build. It depends on
`org.graphiks:kffi-posix` for POSIX symbol downcalls and does not include the
higher-level `kadre-wayland` event-loop layer.

To regenerate the bindings, initialize the submodule and run:

```bash
git submodule update --init --recursive
scripts/gen-kffi-wayland.sh
```

The package namespace is `org.graphiks.kffi.wayland`. The module uses JDK 25
bytecode and requires a JDK 25 runtime.

The source is distributed under the MIT License.
