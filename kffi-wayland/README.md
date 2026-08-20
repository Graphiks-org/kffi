# kffi-wayland

JVM-only low-level Wayland bindings for `kffi`, built on the Java Foreign
Function & Memory API (Panama FFM).

The module contains the Wayland client and generated protocol bindings imported from
[`ygdrasil-io/poc-koreos`](https://github.com/ygdrasil-io/poc-koreos/tree/master/ffi/wayland)
at commit `411bd9f6795f8aae5330fddca96dd4e77629a4b4`.

The imported sources include kextract-generated low-level bindings and the
handwritten FFM runtime glue. Protocol XML is used to generate the
`wl_interface` descriptors, request/event opcodes, and enum constants for
fourteen protocol XML inputs. Generated sources are kept under `generated/`
(with protocol constants in the module package). The generation pipeline is
available explicitly through `scripts/gen-kffi-wayland.sh`; it runs
`wayland-scanner`, the pinned `kextract` submodules, and the XML
protocol-interface generator in Docker.

The fourteen XML inputs are:

- `stable/xdg-shell/xdg-shell.xml`
- `unstable/xdg-decoration/xdg-decoration-unstable-v1.xml`
- `unstable/text-input/text-input-unstable-v3.xml`
- `staging/xdg-activation/xdg-activation-v1.xml`
- `unstable/pointer-constraints/pointer-constraints-unstable-v1.xml`
- `unstable/relative-pointer/relative-pointer-unstable-v1.xml`
- `staging/xdg-toplevel-icon/xdg-toplevel-icon-v1.xml`
- `staging/fractional-scale/fractional-scale-v1.xml`
- `stable/viewporter/viewporter.xml`
- `stable/presentation-time/presentation-time.xml`
- `stable/linux-dmabuf/linux-dmabuf-v1.xml`
- `staging/cursor-shape/cursor-shape-v1.xml`
- `stable/tablet/tablet-v2.xml`
- local wlroots `wlr-screencopy-unstable-v1.xml`

Thirteen of those inputs come from the pinned
`third_party/wayland-protocols` submodule at commit
`d5aed4e4903a77aefaef03359d1ffdc0d5093456`. The only local exception is the
wlroots-maintained `wlr-screencopy-unstable-v1.xml` snapshot, which remains
vendored under `docker/kffi-wayland-codegen/protocols`. The `stable/tablet/tablet-v2.xml`
input is a technical dependency of `staging/cursor-shape/cursor-shape-v1.xml`:
it is included so `zwp_tablet_tool_v2` references resolve during generation,
not to add a tablet-specific runtime API in this change. The local wlroots
snapshot comes from commit
`0855cdacb2eeeff35849e2e9c4db0aa996d78d10`. It is not run as part of the Gradle
build. It depends on
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
