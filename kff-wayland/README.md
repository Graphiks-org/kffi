# kff-wayland

JVM-only low-level Wayland bindings for `kffi`, built on the Java Foreign
Function & Memory API (Panama FFM).

The module contains the Wayland client, XDG Shell, screencopy, and text-input
protocol bindings imported from
[`ygdrasil-io/poc-koreos`](https://github.com/ygdrasil-io/poc-koreos/tree/master/ffi/wayland)
at commit `411bd9f6795f8aae5330fddca96dd4e77629a4b4`.

The imported sources include kextract-generated low-level bindings and the
handwritten FFM glue required by the Wayland protocol descriptors. This module
does not run kextract as part of the Gradle build. It depends on
`org.graphiks:kff-posix` for POSIX symbol downcalls and does not include the
higher-level `kadre-wayland` event-loop layer.

The package namespace is `org.graphiks.kffi.wayland`. The module uses JDK 25
bytecode and requires a JDK 25 runtime.

The source is distributed under the MIT License.
