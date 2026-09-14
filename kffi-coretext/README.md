# CoreText C bindings

`kffi-coretext` is an optional JVM 25 module for macOS arm64 and x86_64.
It depends on `kffi`, without Objective-C or AppKit dependencies. Loading the
portable runtime does not load Apple frameworks. Constructing `CoreText`
explicitly loads CoreFoundation, CoreGraphics and CoreText on a supported ABI.
Enable native access with `--enable-native-access=ALL-UNNAMED`.

```kotlin
dependencies {
    implementation("org.graphiks:kffi-coretext-jvm:1.0.0-SNAPSHOT")
}
```

KMP JVM consumers can use `org.graphiks:kffi-coretext:1.0.0-SNAPSHOT` in
`jvmMain`. These are the module's publication coordinates; consume a version
that has actually been published using the repositories described in the root
README. Module publication follows the existing `releaseVersion` convention.

## Source-byte font creation and ownership

Allocate a native transfer buffer using `MemoryAllocator.allocateBuffer`, fill
it with `MemoryBuffer.writeBytes`, then call `CoreText.createData` with its
address and signed byte length. `CFDataCreate` copies those bytes, so the
transfer allocator may close after that call returns. The buffer must remain
readable for the full length during the call; raw addresses do not enforce
that lifetime.

Create a provider from the CFData with `createProvider`, a CGFont from that
provider with `createGraphicsFont`, then a CTFont with `createFont(graphicsFont,
size)`. The native creation uses the supplied source bytes, a null matrix and
a null font descriptor, without a font-name search.

Each nonzero Create result is a caller-owned reference. Check every result
before continuing. Release each acquired reference exactly once, including
on partial creation failure: CTFont with `releaseCF`, CGFont with
`releaseGraphicsFont`, provider with `releaseProvider`, and CFData with
`releaseCF`, in reverse creation order. Use nested `finally` blocks so that
all acquired references receive cleanup even if an earlier release throws.
Zero creation results are native failures and must not be released. The
bindings do not track ownership, retain resources for callers or provide
automatic reference cleanup.

`fontSize`, `unitsPerEm` (unsigned 32-bit) and `glyphCount` read raw native
values. Their pointers must be nonnull, correctly typed, live borrowed
references. Prevent concurrent release during any native operation. Font
eligibility, certification, caching and rendering policy belong to consumers.

## Detached matrices and Darwin bytes

`fontMatrix(font, allocator)` uses an open caller-provided confined allocator
on its owning thread. The native struct return occupies 48 bytes aligned to
8; its six doubles are copied immediately into `CGAffineTransform`. The
returned value survives allocator closure. The binding does not decide
whether the matrix is identity.

`DarwinSystemInformation.readSysctlBytes(name, maxBytes)` loads its Darwin
symbol lazily, queries the required unsigned 64-bit size, validates the bound,
then queries into confined native storage. It returns exactly the final
reported bytes, retaining a terminating byte if present. The caller chooses
the nonempty, NUL-free name and a positive limit fitting a JVM byte array,
and interprets the result. Invalid arguments throw `IllegalArgumentException`.
Nonzero native status or a size exceeding the caller's bound or buffer
capacity causes `SYSTEM_INFORMATION`, without fallback.

`AppleBindingException.failure` distinguishes `UNSUPPORTED_PLATFORM`,
`LIBRARY_LOAD`, `SYMBOL_RESOLUTION` and `SYSTEM_INFORMATION`. Linking
failures preserve their JVM causes. Framework library scopes remain alive
for the process lifetime; each font reference remains separately caller-owned.

## Verification

`./gradlew :kffi-coretext:jvmTest` exercises audited original font bytes and
a same-name, modified-advance source after transfer-buffer closure. Its
independent native consumer observes literal advances at two sizes. The
existing CI test matrix runs these tests on both macOS architectures; the
test task is explicitly skipped on Linux and Windows.
