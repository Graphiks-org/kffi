# HarfBuzz iOS native resources

This module builds `libharfbuzz` (HarfBuzz 14.3.0) from source as a **static**
archive, one per iOS slice (device + simulator), and stages it under this
module's build directory. It intentionally excludes `libharfbuzz-subset`,
`libharfbuzz-raster`, `libharfbuzz-vector`, and `libharfbuzz-gpu`; every
optional backend (FreeType, GLib, ICU, Graphite2, Cairo, CoreText, GObject,
Introspection, Uniscribe, DirectWrite) is disabled.

## Provenance

| Property | Value |
| --- | --- |
| Library | `libharfbuzz` (static) |
| Version | HarfBuzz 14.3.0 |
| Origin | `https://github.com/harfbuzz/harfbuzz.git` |
| Source revision | `4c2aa804671d7276e8a0eb95da07202ead05c843` |
| Build system | Xcode 26.6 (17F113), CMake 4.4.3, `Unix Makefiles` |
| C/C++ compiler | Apple clang 21.0.0 (`clang-2100.1.1.101`) |
| iOS SDK | 26.5 (`iphoneos` + `iphonesimulator`) |
| iOS deployment target | 15.0 |
| Gradle | 9.7.0 |
| Slices | `iosArm64` (device, arm64), `iosSimulatorArm64` (simulator, arm64) |

## Shipped binary digests

Each slice is a single-architecture archive — **not** a fat/universal binary.

| Slice | Path | SHA-256 |
| --- | --- | --- |
| device | `build/harfbuzz/iphoneos/lib/libharfbuzz.a` | `d3393c61a7276578f203e6b7115d2ea549311d5d0be0d302963652c70e0a18b7` |
| simulator | `build/harfbuzz/iphonesimulator/lib/libharfbuzz.a` | `f3c5e805c72362362e1b8f467dbd4f27ba07fb4f1f68619858c76de662764cb2` |

CMake archives with `ar qc` followed by `ranlib`; `ranlib` stamps the
`__.SYMDEF` index with the wall-clock time, which makes otherwise byte-identical
rebuilds hash differently. The `sealHarfBuzzIos*` tasks re-run `ranlib` with
`ZERO_AR_DATE=1`, zeroing that stamp, so these digests are reproducible for a
given toolchain and build path. A change of Xcode/SDK/clang version or of the
absolute build path may still yield a different digest.

## Source build configuration

HarfBuzz is fetched by `FetchContent` and configured with
`BUILD_SHARED_LIBS=OFF` and every optional backend/library disabled, so the only
produced target is the static `libharfbuzz.a`:

```text
BUILD_SHARED_LIBS=OFF
HB_HAVE_FREETYPE=OFF
HB_HAVE_GLIB=OFF
HB_HAVE_ICU=OFF
HB_HAVE_GRAPHITE2=OFF
HB_HAVE_CAIRO=OFF
HB_HAVE_CORETEXT=OFF
HB_HAVE_GOBJECT=OFF
HB_HAVE_INTROSPECTION=OFF
HB_HAVE_UNISCRIBE=OFF
HB_HAVE_DIRECTWRITE=OFF
HB_BUILD_UTILS=OFF
HB_BUILD_SUBSET=OFF
HB_BUILD_RASTER=OFF
HB_BUILD_VECTOR=OFF
HB_BUILD_GPU=OFF
HB_BUILD_GPU_DEMO=OFF
```

The complete configuration lives in `src/main/cpp/CMakeLists.txt`.

## Tasks and output convention

| Task | Purpose |
| --- | --- |
| `configureHarfBuzzIosDevice` / `...Simulator` | CMake configure against `iphoneos` / `iphonesimulator` |
| `buildHarfBuzzIosDevice` / `...Simulator` | `cmake --build --target harfbuzz` |
| `installHarfBuzzIosDevice` / `...Simulator` | `cmake --install` into `build/harfbuzz/<sdk>` |
| `sealHarfBuzzIosDevice` / `...Simulator` | zero the archive index timestamp (reproducible digest) |
| `buildHarfBuzzIos` | aggregate: device + simulator, sealed |

Consumers locate the artifacts via a stable path:

```text
kffi-harfbuzz-ios-native/build/harfbuzz/<sdk>/lib/libharfbuzz.a
kffi-harfbuzz-ios-native/build/harfbuzz/<sdk>/include/harfbuzz/*.h
```

where `<sdk>` is `iphoneos` or `iphonesimulator`. The same locations are exposed
as Gradle extra properties (`kffi.harfbuzz.ios.{device,simulator}.library`,
`...includeDir`, `kffi.harfbuzz.ios.buildTask`).

## Reproduction

```sh
./gradlew :kffi-harfbuzz-ios-native:buildHarfBuzzIos
```

## License

HarfBuzz is distributed under its "Old MIT" license. The full text is bundled at
`licenses/HARFBUZZ-OLD-MIT.txt`.
