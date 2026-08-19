# kff-posix

JVM-only POSIX support for `kffi`, built on the Java Foreign Function & Memory
API (Panama FFM).

The module contains the POSIX symbol lookup, `pollfd` layout helpers, and the
non-blocking wakeup primitive imported from
[`ygdrasil-io/poc-koreos`](https://github.com/ygdrasil-io/poc-koreos/tree/master/ffi/posix)
at commit `411bd9f6795f8aae5330fddca96dd4e77629a4b4`.

This first integration keeps the upstream direct `java.lang.foreign` API and
does not depend on the multiplatform `kffi` runtime. The package namespace is
`org.graphiks.kffi.posix`.

The module uses JDK 25 bytecode and requires a JDK 25 runtime.

The source is distributed under the MIT License.
