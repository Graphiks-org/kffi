# kffi documentation

`kffi` is a Kotlin Multiplatform foreign function interface (FFI) runtime for
native memory access and calls to C libraries. Binding generation is provided by
[kextract](https://github.com/klang-toolkit/kextract); this repository contains
the runtime and its benchmark modules.

## Start here

- Follow the [Quickstart](quickstart.md) to add kffi to a JVM, Android, or
  Kotlin/Native project.
- Read the [README](https://github.com/Graphiks-org/kffi#readme) for the full
  runtime contract, platform support, and callback lifecycle.
- Browse the API reference generated from the `:kffi` module.

## Local verification

### JVM tests

```bash
./gradlew :kffi:jvmTest
```

### Generate API documentation and build the site

```bash
./gradlew :docs:embedDokkaIntoMkDocs
mkdocs build -f docs/mkdocs.yml
```
