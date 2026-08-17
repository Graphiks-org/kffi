# Publication Process Alignment Design

## Context

The standalone KFFI extraction introduced a second publication system beside
the process already present on `master`. The PR currently contains a custom
publication convention, a custom `KFFI_VERSION` version chain, duplicated
publication overrides in module build files, a local metadata verification
task, and a separate snapshot workflow.

The `master` process already provides the desired Maven Central workflow and
Gradle convention. Its implementation is still hardcoded to the old `shared`
module, so it must be adapted rather than copied literally.

The root Gradle task has been verified with the current build:

```text
./gradlew publishToMavenCentral --dry-run
```

It selects both current publishable projects, `:kffi` and
`:kffi-benchmark-spi`, without requiring project-by-project task names.

## Goals

- Make the `master` publication convention the only publication convention.
- Keep the `master` version input: `-PreleaseVersion`, defaulting to
  `1.0.0-SNAPSHOT`.
- Keep conditional publication/signing behavior from `master`.
- Publish KFFI and benchmark SPI through one root command:
  `./gradlew publishToMavenCentral`.
- Adapt coordinates and POM metadata to the standalone `org.graphiks` KFFI
  repository.
- Keep `master`'s canonical `.github/workflows/publish.yml` as the publication
  workflow, adapted to the standalone modules.
- Remove the custom publication convention, custom version chain, duplicated
  publication overrides, local publication verification machinery, and custom
  snapshot workflow.
- Update documentation and PR metadata so they describe the unified process.

## Non-goals

- Do not change the KFFI runtime APIs or benchmark behavior.
- Do not publish the Android/JVM/Native benchmark harness modules as separate
  libraries unless they already expose a publication task through the canonical
  convention.
- Do not change unrelated legacy workflows such as the old `ci.yml`, `docs.yml`,
  or other non-publication automation.
- Do not rewrite the historical branch or remove its inherited merge commits.

## Chosen Approach

Adapt `buildSrc/src/main/kotlin/ygdrasil/conventions/kmp-publish.gradle.kts`
from `master`:

- Replace the old `io.ygdrasil.shared` group with `org.graphiks`.
- Read `releaseVersion` and default to `1.0.0-SNAPSHOT`.
- Use the applying project's name as the artifact ID, rather than hardcoding
  `shared`.
- Keep publication and signing enabled only when the signing properties are
  available, as in `master`.
- Use KFFI MIT license, repository URL, developer, and POM metadata.

Apply this convention to `kffi` and `kffi-benchmark-spi` using the existing
precompiled convention plugin ID. Remove the standalone `publish` plugin and
all per-module `kffi.version`, `KFFI_VERSION`, `version`, and `afterEvaluate`
publication reassertion blocks. The root build retains a single
`releaseVersion` provider for non-publishing project version consistency.

The root publication task is the sole workflow entry point. Because Gradle
aggregates unqualified task names across subprojects, the workflow runs:

```bash
./gradlew publishToMavenCentral \
  --no-configuration-cache --no-daemon --stacktrace \
  -PreleaseVersion="${VERSION}"
```

The snapshot and release workflow paths use the same task. Snapshot version
selection comes from the workflow dispatch input or the `1.0.0-SNAPSHOT`
default; tag releases derive `VERSION` from the `v*` tag.

## Files and Responsibilities

- `buildSrc/src/main/kotlin/ygdrasil/conventions/kmp-publish.gradle.kts`:
  canonical adapted convention.
- `build.gradle.kts`: one `releaseVersion` provider and no custom publication
  repository or JSON metadata verifier.
- `kffi/build.gradle.kts` and `kffi-benchmark-spi/build.gradle.kts`: apply the
  canonical convention and retain only module-specific build configuration.
- `kffi-benchmark-{android,jvm,native}/build.gradle.kts`: retain benchmark
  configuration and remove duplicated publication/version overrides.
- `.github/workflows/publish.yml`: canonical workflow, with root
  `publishToMavenCentral` invocation and KFFI version input.
- `.github/workflows/kffi-publish-snapshots.yml`: delete; its behavior is
  absorbed by the canonical workflow.
- `buildSrc/src/main/kotlin/publish.gradle.kts`: delete; the `master`
  convention is the only plugin.
- `scripts/test-publish-version.sh`: inspect `:kffi` with `-PreleaseVersion`,
  preserving the version contract check without hardcoding `shared`.
- `README.md`, `docs/quickstart.md`, `CONTRIBUTING.md`: describe
  `releaseVersion`, the root publication task, and the current snapshot
  repository.
- `docs/superpowers/specs/2026-08-17-pr-branch-readme-compliance-design.md`
  and `docs/superpowers/plans/2026-08-17-pr-branch-readme-compliance.md`:
  record that publication alignment supersedes the earlier “preserve all
  workflows” wording for the publication workflow only.

## Validation

- `./gradlew publishToMavenCentral --dry-run` lists publication tasks for
  `:kffi` and `:kffi-benchmark-spi`.
- `./gradlew -PreleaseVersion=1.2.3 publishToMavenCentral --dry-run` uses the
  supplied version without `KFFI_VERSION`.
- `./gradlew :kffi:properties -PreleaseVersion=1.2.3` reports version `1.2.3`.
- `scripts/test-publish-version.sh` passes for the default
  `1.0.0-SNAPSHOT` version.
- No `KFFI_VERSION`, custom `publish` plugin, `publish.gradle.kts`, custom
  publication verification task, or custom snapshot workflow remains in the
  publication path.
- The canonical workflow contains one unqualified `publishToMavenCentral`
  command for both snapshot and release jobs.
- Documentation and PR metadata no longer claim that the custom publication
  system or custom snapshot workflow is preserved.
