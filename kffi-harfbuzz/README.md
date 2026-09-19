# HarfBuzz C bindings

`kffi-harfbuzz` is an optional JVM 25 module for macOS and Linux on arm64 and
x86_64. It depends on `kffi`. Constructing `HarfBuzz` loads and verifies the
bundled HarfBuzz library for the current platform; it never searches for a
system HarfBuzz installation. Enable native access with
`--enable-native-access=ALL-UNNAMED`.

```kotlin
dependencies {
    implementation("org.graphiks:kffi-harfbuzz-jvm:1.0.0-SNAPSHOT")
}
```

KMP JVM consumers can use `org.graphiks:kffi-harfbuzz:1.0.0-SNAPSHOT` in
`jvmMain`. These are the module's publication coordinates; consume a version
that has actually been published using the repositories described in the root
README. Module publication follows the existing `releaseVersion` convention.

## Shaping and ownership

Open the library with `HarfBuzz.open()`. It loads the embedded,
SHA-256-verified binary and reports its `bindingIdentity` (operating system,
architecture, artifact coordinate, digest, upstream source revision, build
chain, engine version). A failed load throws `HarfBuzzBindingException`, whose
`failure` distinguishes `UNSUPPORTED_PLATFORM`, `RESOURCE_MISSING`,
`RESOURCE_CORRUPT`, `LIBRARY_LOAD`, `SYMBOL_RESOLUTION`, `VERSION_MISMATCH` and
`NATIVE_OPERATION`. Typographic policy, diagnostics and fallback belong to the
consumer.

Create a blob with `createBlob(bytes)`, a face with `blob.createFace(index)`, a
font with `face.createFont()`, and a buffer with `createBuffer()`. A blob may
create several faces and a face several fonts; each owner releases its native
resources when closed. The blob's byte arena is released only after the blob
and every descendant have been closed, so close children before their parent.
Closing an owner more than once is safe. Owners are not synchronised: do not
close one concurrently from several threads. Owners are reusable across shaping
calls. Configure a buffer with `setDirection`, `setScript` (parsed through
`HarfBuzz.parseScript`), `setLanguage` (through `HarfBuzz.parseLanguage`),
`setClusterLevel`, `setFlags` and `addUtf32`, then call `shape(font, features)`.
Read the result with `glyphCount`, `glyphInfos` and `glyphPositions`, and query
`glyphHorizontalAdvance` and `ligatureCarets` on the font.

## Verification

`./gradlew :kffi-harfbuzz:jvmTest` runs the ownership and shaping tests plus an
independent frozen-oracle probe whose expected values were produced outside the
module with `hb-shape`. The test task runs on macOS and Linux only.
