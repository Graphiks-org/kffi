# Contributor guide

## Repository layout

The `:kffi` module contains the public multiplatform runtime:

- `commonMain` defines the `expect` API and shared callback/memory contracts;
- `jvmMain`, `androidMain`, and `nativeMain` provide backend implementations;
- the `kffi-benchmark-*` modules contain platform-specific benchmark harnesses.

## Before opening a pull request

1. Run the JVM suite:

   ```bash
   ./gradlew :kffi:jvmTest
   ```

2. Run the platform-specific checks relevant to the change. The commands used
   by CI are documented in the [README](https://github.com/Graphiks-org/kffi#cicd-workflow).
3. Follow [CONTRIBUTING.md](https://github.com/Graphiks-org/kffi/blob/master/CONTRIBUTING.md)
   for the pull-request contract and commit conventions.
4. Regenerate and inspect the documentation when public APIs or examples change:

   ```bash
   ./gradlew :docs:embedDokkaIntoMkDocs
   mkdocs build -f docs/mkdocs.yml
   ```
