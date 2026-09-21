# HarfBuzz Android native resources

This artifact embeds `libharfbuzz` (HarfBuzz 14.3.0) built from source and
packaged as `jni/<abi>/libharfbuzz.so` inside the AAR. It intentionally excludes
`libharfbuzz-gpu`, `libharfbuzz-raster`, `libharfbuzz-subset`, and
`libharfbuzz-vector`.

## Provenance

| Property | Value |
| --- | --- |
| Library | `libharfbuzz` |
| Version | HarfBuzz 14.3.0 |
| Origin | `https://github.com/harfbuzz/harfbuzz.git` |
| Source revision | `4c2aa804671d7276e8a0eb95da07202ead05c843` |
| Build system | Android NDK `30.0.15729638` (r30-beta2), CMake `3.22.1`, ninja |
| C/C++ compiler | clang 21.0.0 (`Android (15422139, +pgo, -bolt, +lto, -mlgo, based on r574158b)`) |
| Gradle / AGP | Gradle `9.7.0`, Android Gradle Plugin `9.0.0` |
| ABIs | `arm64-v8a`, `x86_64` |
| minSdk | 28 |

## Shipped binary digests

The stripped libraries packaged in the AAR at `jni/<abi>/libharfbuzz.so`:

| ABI | SHA-256 |
| --- | --- |
| arm64-v8a | `46ea26b7b22aa74988bb668d31ebbff740af5d20ab331db46ecd354466df7296` |
| x86_64 | `1b4438dd72c8ade65c8abb278025adcd21316b03e8c3f1f84e98d2152d1a2b09` |

These digests describe the artifact as built on the reference machine; the
linker `BuildID` (and therefore the digest) depends on the build directory and
toolchain paths, so a rebuild on a different host or path may differ.

## Source build configuration

HarfBuzz is fetched by `FetchContent` and configured with `BUILD_SHARED_LIBS=ON`
and every optional backend/library disabled, so the only produced target is
`libharfbuzz.so`:

```text
BUILD_SHARED_LIBS=ON
HB_HAVE_FREETYPE=OFF
HB_HAVE_GLIB=OFF
HB_HAVE_ICU=OFF
HB_HAVE_CAIRO=OFF
HB_HAVE_CORETEXT=OFF
HB_HAVE_GRAPHITE2=OFF
HB_HAVE_GOBJECT=OFF
HB_HAVE_INTROSPECTION=OFF
HB_BUILD_UTILS=OFF
HB_BUILD_SUBSET=OFF
HB_BUILD_RASTER=OFF
HB_BUILD_VECTOR=OFF
HB_BUILD_GPU=OFF
HB_BUILD_GPU_DEMO=OFF
```

The complete configuration lives in `src/main/cpp/CMakeLists.txt`.

## Reproduction

```sh
./gradlew :kffi-harfbuzz-android-native:assembleRelease
```

## License

HarfBuzz is distributed under its "Old MIT" license. The full text is bundled at
`licenses/HARFBUZZ-OLD-MIT.txt`.
