# Publication Process Alignment Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Replace the standalone KFFI publication system with the adapted publication process already used by `master`, using one root `publishToMavenCentral` task for every publishable KFFI module.

**Architecture:** The existing `ygdrasil.conventions.kmp-publish` precompiled convention becomes the single publication entry point, but its old `shared` coordinates and POM metadata are changed to KFFI values. `kffi` and `kffi-benchmark-spi` apply that convention; Gradle's unqualified root task aggregates their publication tasks. The canonical `publish.yml` workflow supplies `releaseVersion`, while custom version, verification, and snapshot workflow code is removed.

**Tech Stack:** Gradle Kotlin DSL, Kotlin Multiplatform, Vanniktech Maven Publish, GitHub Actions, Bash, Maven Central/Central Portal.

---

## File Map

- Modify: `buildSrc/src/main/kotlin/ygdrasil/conventions/kmp-publish.gradle.kts` - adapt the `master` convention to KFFI coordinates, metadata, and `releaseVersion`.
- Delete: `buildSrc/src/main/kotlin/publish.gradle.kts` - remove the duplicate standalone publication convention.
- Modify: `build.gradle.kts` - retain one `releaseVersion` provider and remove custom publication verification.
- Modify: `kffi/build.gradle.kts` - apply the canonical convention and remove custom publication/version overrides.
- Modify: `kffi-benchmark-spi/build.gradle.kts` - apply the canonical convention and remove custom publication/version overrides.
- Modify: `kffi-benchmark-android/build.gradle.kts`, `kffi-benchmark-jvm/build.gradle.kts`, `kffi-benchmark-native/build.gradle.kts` - remove duplicated publication/version blocks while retaining benchmark build behavior.
- Modify: `.github/workflows/publish.yml` - use one root `publishToMavenCentral` command for snapshot and release jobs.
- Delete: `.github/workflows/kffi-publish-snapshots.yml` - absorb its behavior into the canonical workflow.
- Modify: `scripts/test-publish-version.sh` - inspect `:kffi` using `releaseVersion` rather than `:shared`.
- Modify: `kffi/src/jvmTest/kotlin/org/graphiks/kffi/KffiVersionJvmTest.kt` and the matching test system-property setup in `kffi/build.gradle.kts` - use `releaseVersion` as the test input.
- Modify: `kffi/src/commonMain/kotlin/org/graphiks/kffi/Kffi.kt` - update the version-chain comment from `kffi.version` to `releaseVersion`; do not change the public version value/API.
- Modify: `README.md`, `docs/quickstart.md`, `CONTRIBUTING.md` - document the unified releaseVersion/root-task process.
- Modify: `docs/superpowers/specs/2026-08-17-pr-branch-readme-compliance-design.md` and `docs/superpowers/plans/2026-08-17-pr-branch-readme-compliance.md` - correct the earlier publication-preservation wording.
- Modify: PR #2 metadata through `gh` - describe the publication alignment and remove the claim that all workflows were preserved.

## Task 1: Adapt the Canonical Publication Convention

**Files:**
- Modify: `buildSrc/src/main/kotlin/ygdrasil/conventions/kmp-publish.gradle.kts`
- Delete: `buildSrc/src/main/kotlin/publish.gradle.kts`
- Modify: `build.gradle.kts`

- [ ] **Step 1: Replace the hardcoded master template coordinates and metadata**

In `ygdrasil.conventions.kmp-publish.gradle.kts`, retain the existing plugin and conditional publishing structure, but replace the old template-specific values with:

```kotlin
group = "org.graphiks"
version = (project.findProperty("releaseVersion") as? String)
    ?.takeIf { it.isNotBlank() }
    ?: "1.0.0-SNAPSHOT"

val isPublishing = project.findProperty("signingInMemoryKey")?.toString()?.isNotBlank() == true
    || project.findProperty("signing.keyId")?.toString()?.isNotBlank() == true

mavenPublishing {
    if (isPublishing) {
        publishToMavenCentral()
        signAllPublications()
    }

    coordinates(group.toString(), project.name, version.toString())

    pom {
        name.set(project.name)
        description.set("${project.name}: multiplatform FFI support for Kotlin")
        url.set("https://github.com/Graphiks-org/kffi")
        inceptionYear.set("2024")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/license/MIT")
            }
        }
        developers {
            developer {
                id.set("amommers")
                name.set("Alexandre Mommers")
            }
        }
        scm {
            connection.set("scm:git:https://github.com/Graphiks-org/kffi.git")
            developerConnection.set("scm:git:ssh://github.com/Graphiks-org/kffi.git")
            url.set("https://github.com/Graphiks-org/kffi")
        }
    }
}
```

Do not retain the local `PublicationVerification` repository or the `PublishToMavenRepository` hook from the custom convention. The canonical convention must remain the only publication plugin.

- [ ] **Step 2: Remove the duplicate custom convention**

Delete `buildSrc/src/main/kotlin/publish.gradle.kts`. No `publish` precompiled plugin should remain referenced by a KFFI module after Task 2.

- [ ] **Step 3: Simplify the root version configuration**

In `build.gradle.kts`, remove the `JsonParser` import, `publicationVerificationRepository`, `cleanPublicationVerificationRepository`, and `verifyPublicationMetadata` task. Replace the `kffi.version`/`KFFI_VERSION` provider with one provider named `releaseVersion`:

```kotlin
val releaseVersion = providers.gradleProperty("releaseVersion")
    .orElse("1.0.0-SNAPSHOT")
    .map { it.trim().ifEmpty { "1.0.0-SNAPSHOT" } }

subprojects {
    version = releaseVersion.get()
}
```

Keep `allprojects { group = "org.graphiks" }` and all existing repositories. Do not change unrelated build verification tasks.

- [ ] **Step 4: Compile-check the convention and root task wiring**

Run:

```bash
./gradlew help
```

Expected: Gradle configures the build without unresolved `publish` plugin, `JsonParser`, or `PublicationVerification` references. The module-level custom version blocks are removed in Task 2, so `KFFI_VERSION` is checked after that task. Do not publish real artifacts in this step.

- [ ] **Step 5: Commit the canonical convention change**

Run:

```bash
git add build.gradle.kts \
  buildSrc/src/main/kotlin/ygdrasil/conventions/kmp-publish.gradle.kts \
  buildSrc/src/main/kotlin/publish.gradle.kts
git commit -m "refactor(buildSrc): align publication convention with master"
```

Expected: the commit contains only the root/custom convention changes and the custom convention deletion.

## Task 2: Apply the Convention to Publishable Modules

**Files:**
- Modify: `kffi/build.gradle.kts`
- Modify: `kffi-benchmark-spi/build.gradle.kts`
- Modify: `kffi-benchmark-android/build.gradle.kts`
- Modify: `kffi-benchmark-jvm/build.gradle.kts`
- Modify: `kffi-benchmark-native/build.gradle.kts`
- Modify: `kffi/src/jvmTest/kotlin/org/graphiks/kffi/KffiVersionJvmTest.kt`
- Modify: `kffi/src/commonMain/kotlin/org/graphiks/kffi/Kffi.kt`

- [ ] **Step 1: Switch kffi and benchmark SPI to the canonical convention**

In `kffi/build.gradle.kts` and `kffi-benchmark-spi/build.gradle.kts`, replace the standalone `publish` plugin entry with:

```kotlin
id("ygdrasil.conventions.kmp-publish")
```

In both files, remove `group = "org.graphiks"`, the `kffiVersion` provider, and the entire `afterEvaluate` publication reassertion block because the root and canonical convention now own group/version/publication configuration. Keep all Kotlin, Android, test, and benchmark configuration.

- [ ] **Step 2: Remove publication overrides from non-published benchmark harnesses**

In `kffi-benchmark-android/build.gradle.kts`, `kffi-benchmark-jvm/build.gradle.kts`, and `kffi-benchmark-native/build.gradle.kts`, remove only the duplicated `group`, `kffiVersion`, and `afterEvaluate` publication blocks. Keep their plugins, dependencies, native fixture tasks, JMH setup, Android packaging, and executable benchmark tasks unchanged.

These harnesses must not receive a publication task merely because their project name starts with `kffi`; only modules explicitly applying the canonical convention are publishable.

- [ ] **Step 3: Update the runtime version test input**

In `kffi/build.gradle.kts`, change every test system-property assignment currently using `"kffi.version"`/`kffiVersion.get()` to use `"releaseVersion"` and the root-provided `project.version.toString()` or an equivalent provider derived from `releaseVersion`. Keep the existing test setup and all other system properties unchanged.

Update `KffiVersionJvmTest.kt` to read `System.getProperty("releaseVersion")` and rename only the test description/error text from `kffi.version` to `releaseVersion`. Keep the assertion that removes `-SNAPSHOT` before comparing to `Kffi.VERSION`.

Update the comment in `Kffi.kt` from “kffi.version build chain” to “releaseVersion build chain”; do not alter `Kffi.VERSION`.

- [ ] **Step 4: Verify publish task aggregation**

Run with a non-secret placeholder so the canonical convention enables its publishing tasks without performing a real upload:

```bash
./gradlew -PsigningInMemoryKey=dry-run publishToMavenCentral --dry-run
```

Expected task output includes `:kffi:publishToMavenCentral` and `:kffi-benchmark-spi:publishToMavenCentral`, and contains no publish task for `kffi-benchmark-android`, `kffi-benchmark-jvm`, or `kffi-benchmark-native`.

- [ ] **Step 5: Verify releaseVersion propagation**

Run:

```bash
./gradlew -PsigningInMemoryKey=dry-run -PreleaseVersion=1.2.3 \
  publishToMavenCentral --dry-run
./gradlew :kffi:properties -PreleaseVersion=1.2.3 --no-daemon --console=plain
```

Expected: the dry-run configures the publication tasks with `1.2.3`, and the `:kffi` properties output contains `version: 1.2.3`. No `KFFI_VERSION` value is needed.

- [ ] **Step 6: Commit module migration**

Run:

```bash
git add kffi/build.gradle.kts kffi-benchmark-spi/build.gradle.kts \
  kffi-benchmark-android/build.gradle.kts kffi-benchmark-jvm/build.gradle.kts \
  kffi-benchmark-native/build.gradle.kts \
  kffi/src/jvmTest/kotlin/org/graphiks/kffi/KffiVersionJvmTest.kt \
  kffi/src/commonMain/kotlin/org/graphiks/kffi/Kffi.kt
git commit -m "refactor(build): use master publication convention for KFFI"
```

Expected: only module publication/version wiring and the version-test contract change.

## Task 3: Use the Canonical Root Publication Workflow

**Files:**
- Modify: `.github/workflows/publish.yml`
- Delete: `.github/workflows/kffi-publish-snapshots.yml`
- Modify: `scripts/test-publish-version.sh`

- [ ] **Step 1: Replace project-specific workflow invocations with the root task**

In both snapshot and release jobs of `.github/workflows/publish.yml`, replace the `:shared:publishToMavenCentral` command with:

```yaml
run: ./gradlew publishToMavenCentral --no-configuration-cache --no-daemon --stacktrace -PreleaseVersion="${VERSION}"
```

Keep the existing trigger branches, tag logic, workflow-dispatch input, Java setup, permissions, and Maven/signing environment variables. The root task must be the only publication command in the workflow.

- [ ] **Step 2: Remove the custom snapshot workflow**

Delete `.github/workflows/kffi-publish-snapshots.yml`. Its timestamp generation and separate project list must not remain because the canonical workflow accepts the dispatch version or its `1.0.0-SNAPSHOT` default.

- [ ] **Step 3: Retarget the publication version script**

Change `scripts/test-publish-version.sh` to inspect `:kffi:properties` rather than `:shared:properties`:

```bash
actual_version="$(./gradlew :kffi:properties --no-daemon --console=plain -PreleaseVersion= \
  | sed -n 's/^version: //p' \
  | tail -n 1)"
```

Keep `expected_version="1.0.0-SNAPSHOT"`, strict mode, and the existing failure message.

- [ ] **Step 4: Validate workflow and script references**

Run:

```bash
./gradlew -PsigningInMemoryKey=dry-run publishToMavenCentral --dry-run
bash scripts/test-publish-version.sh
```

Expected: the root dry-run sees both publishable modules and the script exits successfully with `1.0.0-SNAPSHOT`.

- [ ] **Step 5: Commit workflow migration**

Run:

```bash
git add .github/workflows/publish.yml scripts/test-publish-version.sh
git add -u -- .github/workflows/kffi-publish-snapshots.yml
git commit -m "ci(publish): use aggregated master workflow"
```

Expected: the canonical workflow is modified, the custom snapshot workflow is deleted, and no unrelated workflow changes are included.

## Task 4: Align Documentation and PR Metadata

**Files:**
- Modify: `README.md`
- Modify: `docs/quickstart.md`
- Modify: `CONTRIBUTING.md`
- Modify: `docs/superpowers/specs/2026-08-17-pr-branch-readme-compliance-design.md`
- Modify: `docs/superpowers/plans/2026-08-17-pr-branch-readme-compliance.md`
- Remote metadata: PR #2 body only.

- [ ] **Step 1: Update publication documentation**

Replace documentation of `kffi.version`, `KFFI_VERSION`, and timestamped workflow versions with:

- `releaseVersion` as the Gradle property.
- Default `1.0.0-SNAPSHOT`.
- `./gradlew publishToMavenCentral` as the single aggregated command.
- `-PreleaseVersion=...` for workflow dispatch or tag-derived versions.
- `mavenCentral()` for releases and the Central Portal snapshot repository for `-SNAPSHOT` consumption, without implying a custom snapshot workflow.

Keep the English README prose, exact template HTML comments, KFFI coordinates, safe quickstart examples, and current module list intact.

- [ ] **Step 2: Update contribution commands and versioning**

Replace publication-specific references in `CONTRIBUTING.md` with the root task and `releaseVersion`. Do not change the allowed branch/type/scope policy or unrelated legacy workflow references.

- [ ] **Step 3: Correct the earlier design/plan records**

Replace statements saying that all workflows were preserved with a precise statement: the publication workflow was intentionally aligned to `master`, the custom snapshot workflow was removed, and unrelated legacy workflows remain untouched. Record that `publishToMavenCentral` is aggregated at the root.

- [ ] **Step 4: Update PR #2 body**

Use `gh pr edit 2 --body-file ...` to change the Additional Notes section from “existing workflow files ... were intentionally preserved” to:

```text
The canonical publication workflow was aligned with the process from master:
it uses releaseVersion and the aggregated publishToMavenCentral task. The
standalone custom publication convention and snapshot workflow were removed.
Unrelated legacy workflows, the PR template, and the contribution policy file
were preserved.
```

Keep the existing title, required headings, checklist decisions, CI disclosures, PR #1 history, and maintainer operational follow-up.

- [ ] **Step 5: Commit documentation alignment and push**

Run:

```bash
git add README.md docs/quickstart.md CONTRIBUTING.md \
  docs/superpowers/specs/2026-08-17-pr-branch-readme-compliance-design.md \
  docs/superpowers/plans/2026-08-17-pr-branch-readme-compliance.md
git commit -m "docs: document canonical publication process"
git push origin feat/split-kffi-from-wgpu4k-native
```

Expected: the branch contains no documentation statement that the removed custom publication system remains active.

## Task 5: Final Publication Verification

**Files:**
- Read-only verification of all publication convention, module, workflow, script, and documentation files.

- [ ] **Step 1: Verify the aggregated task with the default version**

Run:

```bash
./gradlew -PsigningInMemoryKey=dry-run publishToMavenCentral --dry-run
```

Expected: exit code 0; task graph includes KFFI and benchmark SPI publication tasks and no custom verification repository tasks.

- [ ] **Step 2: Verify an explicit releaseVersion**

Run:

```bash
./gradlew -PsigningInMemoryKey=dry-run -PreleaseVersion=1.2.3 \
  publishToMavenCentral --dry-run
./gradlew :kffi:properties -PreleaseVersion=1.2.3 --no-daemon --console=plain
```

Expected: all published project coordinates use `org.graphiks` and version `1.2.3`.

- [ ] **Step 3: Run the version contract and JVM tests**

Run:

```bash
bash scripts/test-publish-version.sh
./gradlew :kffi:jvmTest
```

Expected: the version script succeeds; the JVM test task either succeeds or reports only the already documented environment-specific failure.

- [ ] **Step 4: Search for removed publication-system identifiers**

Run:

```bash
git grep -n -E 'KFFI_VERSION|kffi\.version|:shared:publishToMavenCentral|kffi-publish-snapshots' -- \
  build.gradle.kts buildSrc kffi kffi-benchmark-* .github/workflows/publish.yml \
  scripts README.md docs/quickstart.md CONTRIBUTING.md || true
test ! -e buildSrc/src/main/kotlin/publish.gradle.kts
test ! -e .github/workflows/kffi-publish-snapshots.yml
```

Expected: no active publication or documentation reference remains, except historical context explicitly marked as such; both custom files are absent.

- [ ] **Step 5: Validate the final diff and PR**

Run:

```bash
git diff --check master...HEAD
git status --short --branch
gh pr view 2 --repo Graphiks-org/kffi \
  --json title,state,baseRefName,headRefName,headRefOid,body
gh pr checks 2 --repo Graphiks-org/kffi
```

Expected: clean worktree, branch synchronized with origin, PR #2 points to the current head and `master`, and the body accurately describes the canonical publication process and removed custom system.

## Commit Sequence

Keep the pre-existing design/README/branch commits and add publication changes as focused commits:

```text
docs: design publication process alignment
refactor(buildSrc): align publication convention with master
refactor(build): use master publication convention for KFFI
ci(publish): use aggregated master workflow
docs: document canonical publication process
```

Do not publish real artifacts during verification, do not force-push, do not rewrite the historical branch, and do not modify unrelated legacy workflows.
