# kffi-objc

JVM-only Objective-C runtime bindings for macOS, built on the Java Foreign
Function & Memory API (Panama FFM).

The generated sources cover the Apple SDK frameworks selected by the generator:
Foundation, CoreFoundation, AppKit, CoreGraphics, QuartzCore, CoreImage, Metal,
AVFoundation, GameController, ModelIO, SceneKit, UniformTypeIdentifiers, PDFKit,
and QuickLook. This includes the complete class and protocol surface visible
through the SDK umbrella header, together with the required enums, options,
types, categories, and runtime helpers.

Sources are produced from the macOS SDK by `kextract` and are checked in so the
module can compile on non-macOS hosts without running the generator.

## Regenerate the bindings

Generation requires macOS, Xcode, Homebrew LLVM, and the initialized `kextract`
submodule:

```bash
git submodule update --init --recursive
LLVM_HOME="$(brew --prefix llvm)" scripts/gen-kffi-objc.sh
```

The generator inputs are the pinned `kextract` submodule, the selected Xcode
SDK, and the LLVM installation used to build `kextract`. Set `DEVELOPER_DIR`
and/or `SDKROOT` when regeneration must use a specific Xcode installation or
SDK. `LLVM_HOME` must be set explicitly when the local `kextract` executable
needs to be built; this avoids silently switching LLVM installations.

To verify that the checked-in sources match a fresh generation without
overwriting them, run:

```bash
LLVM_HOME="$(brew --prefix llvm)" scripts/gen-kffi-objc.sh --check
```

The input header is `kffi-objc/generation/ObjCSubset.h`. The generator's
framework list is maintained in `scripts/gen-kffi-objc.sh`; add a framework
there when extending the supported SDK surface.

## Tests

```bash
./gradlew :kffi-objc:jvmTest
```

The runtime test executes on macOS and is skipped on other JVM hosts.
