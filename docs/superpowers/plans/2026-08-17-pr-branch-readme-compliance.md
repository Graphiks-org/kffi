# PR, Branch, and README Compliance Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Rename PR #1's head branch to a policy-compliant feature branch, rewrite its metadata in English using the repository template, and restore an English root README without losing the original template comments.

**Architecture:** This is a repository-process and documentation correction. GitHub branch and PR metadata will be changed through `gh`, while `README.md` will be updated in the repository. Existing workflows remain untouched; validation uses the commands already defined by `.github/workflows/kffi-test.yml` and `.github/workflows/kffi-benchmark-ci.yml`.

**Tech Stack:** Git, GitHub CLI/API, Markdown, GitHub Actions, Gradle Kotlin DSL, Kotlin Multiplatform.

---

## File Map

- Modify: `README.md` - translate the standalone KFFI documentation to English, add relevant template sections, and restore the original template HTML comments.
- Create: `docs/superpowers/specs/2026-08-17-pr-branch-readme-compliance-design.md` - already committed as `f701273`; keep it as the approved design record.
- Create: `docs/superpowers/plans/2026-08-17-pr-branch-readme-compliance.md` - this implementation plan.
- Do not modify: `.github/workflows/*` - existing workflow files are explicitly preserved.
- Do not modify: `.github/PULL_REQUEST_TEMPLATE.md` - the PR body must follow it without changing the repository template.
- Remote metadata: PR #1 title, body, head branch, and base branch are updated through GitHub; no repository file represents this metadata.

## Task 1: Capture the Baseline

**Files:**
- Read: `README.md`
- Read: `.github/PULL_REQUEST_TEMPLATE.md`
- Read: `.github/contributing-policy.toml`
- Read: `.github/workflows/kffi-test.yml`
- Read: `.github/workflows/kffi-benchmark-ci.yml`
- Read: `.github/workflows/pr-policy.yml`

- [ ] **Step 1: Confirm the local branch and working tree are safe to change**

Run:

```bash
git status --short --branch
git branch --show-current
git diff --exit-code
```

Expected: the current branch is `main`, the approved design commit `f701273` is the current local tip, and `git diff --exit-code` succeeds. If uncommitted changes exist, stop and preserve them before continuing.

- [ ] **Step 2: Save the PR state for comparison**

Run:

```bash
gh pr view 1 --repo Graphiks-org/kffi --json number,title,body,state,isDraft,baseRefName,headRefName,headRepositoryOwner,statusCheckRollup > /tmp/kffi-pr-1-before.json
gh api repos/Graphiks-org/kffi/branches/main --jq '{name:.name,sha:.commit.sha,protected:.protected}'
gh api repos/Graphiks-org/kffi/branches/master --jq '{name:.name,sha:.commit.sha,protected:.protected}'
```

Expected: PR `1` is open, its base is `master`, its head is `main`, and the branch endpoint returns the head commit that must survive the rename.

- [ ] **Step 3: Record the template comments before editing the README**

Run:

```bash
git show master:README.md
```

Expected: the output includes the original customizable project-status badge comment block. The block must be copied without changing its comment text, even though the surrounding user-facing README prose will be translated to English.

## Task 2: Rename the PR Head Branch

**Files:**
- Remote metadata only: `Graphiks-org/kffi` branch `main`.
- Local Git metadata only: local branch and upstream tracking.

- [ ] **Step 1: Rename the remote branch through GitHub**

Run:

```bash
gh api --method POST repos/Graphiks-org/kffi/branches/main/rename \
  --field new_name='feat/split-kffi-from-wgpu4k-native'
```

Expected: GitHub returns the renamed branch with name `feat/split-kffi-from-wgpu4k-native`. Do not delete or force-push any branch if this endpoint fails.

- [ ] **Step 2: Verify that PR #1 kept the renamed head and `master` base**

Run:

```bash
gh pr view 1 --repo Graphiks-org/kffi --json baseRefName,headRefName,headRefOid
```

Expected JSON values:

```json
{
  "baseRefName": "master",
  "headRefName": "feat/split-kffi-from-wgpu4k-native"
}
```

The `headRefOid` must match the pre-rename head SHA from `/tmp/kffi-pr-1-before.json`. If the PR still points to `main`, stop here and report the GitHub association problem instead of closing the PR or deleting `main`.

- [ ] **Step 3: Synchronize the local checkout with the renamed remote branch**

Run:

```bash
git fetch origin --prune
git branch -m main feat/split-kffi-from-wgpu4k-native
git branch --set-upstream-to=origin/feat/split-kffi-from-wgpu4k-native feat/split-kffi-from-wgpu4k-native
git status --short --branch
```

Expected: the current branch is `feat/split-kffi-from-wgpu4k-native`, its upstream is `origin/feat/split-kffi-from-wgpu4k-native`, and no uncommitted files are introduced.

- [ ] **Step 4: Push the approved design commit to the renamed head**

Run:

```bash
git push origin feat/split-kffi-from-wgpu4k-native
```

Expected: the remote head advances by the already reviewed commit `f701273` without a force-push. The PR continues to target `master`.

## Task 3: Translate and Repair the Root README

**Files:**
- Modify: `README.md`

- [ ] **Step 1: Preserve the template comments exactly**

Keep the entire project-status comment block from `master:README.md`, including the original French comment labels and all five badge examples. Do not translate, shorten, or remove these comments. They are template metadata rather than user-facing prose.

- [ ] **Step 2: Replace the French title and introduction with English standalone-project text**

Use this opening structure:

```markdown
# kffi - Multiplatform FFI layer (JVM / Android / Native)

[![Static Badge](https://img.shields.io/badge/License-MIT-blue?style=plastic)](https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FMIT_License)

`kffi` is a low-level foreign function interface (FFI) layer for native memory
access and native calls, written in Kotlin Multiplatform. It is a standalone
runtime library for projects that consume C libraries.
```

Keep the existing link to `kextract`, but translate its surrounding explanation and all navigation labels to English.

- [ ] **Step 3: Translate the technical sections without changing their facts**

Retain the existing sections and examples, translating headings and prose for:

- `Backends`.
- `Consuming kffi`, including repositories, artifacts, and dependency declarations.
- `Binding generation`.
- `Loading a native library`, including JVM, Android, and Native subsections.
- `Memory model`.
- `Memory safety contract`, including bounds checks, lifetime, confinement, and aliasing.
- `unsafe` mode and its Native distinction.
- `Callbacks`.
- `Versioning`.
- `License`.

Keep API names, Kotlin code, artifact coordinates, target names, version values, links, and exception names unchanged unless an English sentence requires only surrounding prose changes.

- [ ] **Step 4: Restore relevant template sections without stale project references**

Add English sections for `Contributing`, `Project Architecture`, `CI/CD Workflow`, and `Useful Development Commands` using the current repository layout:

- Refer to `kffi`, `kffi-benchmark-spi`, `kffi-benchmark-jvm`, `kffi-benchmark-native`, and `kffi-benchmark-android` from `settings.gradle.kts`.
- Document JVM tests with `./gradlew :kffi:jvmTest`.
- Document the platform-native compile/test commands used in `kffi-test.yml`.
- Do not copy the template's obsolete `shared` module or `:shared:jvmTest` command into the README.
- Do not claim that the current root repository is still `wgpu4k-native`.

- [ ] **Step 5: Remove contradictory or stale user-facing statements**

Translate the snapshot documentation so it describes the existing snapshot workflow without claiming that every push to a deleted or renamed branch publishes snapshots. Use wording such as “Snapshots are published by the repository snapshot workflow” and retain the documented `1.0.0-SNAPSHOT` coordinate and migration note.

- [ ] **Step 6: Review the documentation diff**

Run:

```bash
git diff --check -- README.md
git diff -- README.md
```

Expected: no whitespace errors; the diff shows an English user-facing README, the restored template comment block, and no deletion of the required comments.

- [ ] **Step 7: Commit the README correction**

Run:

```bash
git add -- README.md
git commit -m "docs: translate README and restore template comments"
```

Expected: one documentation commit containing only `README.md`.

- [ ] **Step 8: Push the README commit to the renamed head**

Run:

```bash
git push origin feat/split-kffi-from-wgpu4k-native
```

Expected: the README commit is visible on the PR head without a force-push.

## Task 4: Rewrite PR #1 Metadata in English

**Files:**
- Remote metadata only: PR #1 title and body.
- Temporary local file: `/tmp/kffi-pr-1-body.md` (remove after the PR update).

Prerequisite: complete Task 5 Steps 1-3 before running the PR update command so the checked local-test item is truthful. If a required task fails, leave that checklist item unchecked and add the exact command failure under `Additional Notes`.

- [ ] **Step 1: Prepare the completed template body**

Create `/tmp/kffi-pr-1-body.md` with this exact content:

```markdown
## Description

This PR completes the standalone extraction of KFFI from `wgpu4k-native`.
It documents the supported JVM, Android, and Native backends, preserves the
KFFI memory-safety contract, restores the README template comments, and aligns
the contribution metadata with the repository policy.

Relates to: no linked issue.

## Type of Change

- [x] `feat` - New feature
- [ ] `fix` - Bug fix
- [ ] `build` - Build or dependencies
- [ ] `chore` - Maintenance or tooling
- [ ] `ci` - CI/CD configuration
- [ ] `docs` - Documentation
- [ ] `perf` - Performance improvement
- [ ] `refactor` - Refactoring
- [ ] `test` - Tests
- [ ] `style` - Code style

## Checklist

Before submitting this PR:

- [x] Title follows Conventional Commits format
- [x] Tests pass locally (`./gradlew :kffi:jvmTest`)
- [ ] CHANGELOG.md has been updated
- [x] No changelog update needed: this correction changes repository documentation and contribution metadata, not runtime behavior.
- [x] Documentation updated: the root README is now in English and retains the template comments.
- [x] Changes are compatible with all targets (Android, iOS, JVM); no runtime source behavior was changed.

## Screenshots (if applicable)

Not applicable.

## Additional Notes

The PR continues to target `master` and uses the policy-compliant branch
`feat/split-kffi-from-wgpu4k-native`. Existing workflow files, including legacy
workflow definitions, were intentionally preserved.
```

The two changelog lines are intentionally mutually exclusive: leave the update line unchecked and check the explicit no-update justification.

- [ ] **Step 2: Update the PR title, base, and body**

Run:

```bash
gh pr edit 1 --repo Graphiks-org/kffi \
  --base master \
  --title 'feat: split KFFI from wgpu4k-native' \
  --body-file /tmp/kffi-pr-1-body.md
```

Expected: GitHub accepts the title and body, keeps PR #1 open, and reports `master` as the base and `feat/split-kffi-from-wgpu4k-native` as the head.

- [ ] **Step 3: Verify the policy-facing PR fields**

Run:

```bash
gh pr view 1 --repo Graphiks-org/kffi --json title,body,baseRefName,headRefName,state
```

Expected: the title is the exact Conventional Commit title above, all required headings from `.github/PULL_REQUEST_TEMPLATE.md` are present, only `feat` is selected, and the branch/base values are correct.

- [ ] **Step 4: Remove the temporary body file**

Run:

```bash
rm -- /tmp/kffi-pr-1-body.md
```

Expected: the temporary file is gone and no repository file was changed by the PR metadata update.

## Task 5: Run Existing Project Checks

**Files:**
- Read-only verification of `.github/workflows/kffi-test.yml` and `.github/workflows/kffi-benchmark-ci.yml`.

- [ ] **Step 1: Run the JVM test task used by the workflow**

Run:

```bash
./gradlew :kffi:jvmTest
```

Expected: Gradle completes successfully. If the local JDK or platform prevents the task from running, record the exact failure instead of changing build files for this documentation correction.

- [ ] **Step 2: Run the local macOS Native test task selected by the workflow**

Run:

```bash
if [[ "$(uname -m)" == "arm64" ]]; then
  ./gradlew :kffi:macosArm64Test
else
  ./gradlew :kffi:macosX64Test
fi
```

Expected: the architecture-appropriate Native test task completes successfully, or its environment-specific failure is recorded.

- [ ] **Step 3: Check the benchmark workflow tasks without changing workflows**

Run:

```bash
./gradlew :kffi-benchmark-jvm:jmh
./gradlew :kffi-benchmark-native:compileKotlinMacosArm64
./gradlew :kffi-benchmark-android:assembleDebugAndroidTest
```

Expected: each task either succeeds or reports a concrete environment/toolchain limitation. Do not modify `.github/workflows/kffi-benchmark-ci.yml` as part of this correction.

## Task 6: Final Repository and GitHub Validation

**Files:**
- Read-only validation of `README.md`, `.github/workflows/*`, and Git/PR metadata.

- [ ] **Step 1: Confirm the README comments are still present**

Run:

```bash
git show master:README.md
git diff master...HEAD -- README.md
```

Expected: the original project-status comment block appears in the current README with its text unchanged, while user-facing sections are English.

- [ ] **Step 2: Confirm no workflow was deleted or changed**

Run:

```bash
git diff --name-status f701273..HEAD -- .github/workflows
```

Expected: no workflow path appears in the diff from the approved design commit to the current head. The original PR's historical workflow additions remain outside this correction's diff and are not removed.

- [ ] **Step 3: Confirm the PR policy inputs**

Run:

```bash
gh pr view 1 --repo Graphiks-org/kffi --json title,baseRefName,headRefName,body,state,statusCheckRollup
```

Expected: PR #1 is open, targets `master`, uses `feat/split-kffi-from-wgpu4k-native`, has the English template-compliant body, and its checks are visible for the renamed head.

- [ ] **Step 4: Inspect the final local state**

Run:

```bash
git status --short --branch
git log --oneline -5
git diff --check master...HEAD
```

Expected: the branch tracks `origin/feat/split-kffi-from-wgpu4k-native`, the intended documentation commits are visible, and `git diff --check` reports no whitespace errors. Any unrelated pre-existing worktree change must remain untouched and be reported separately.

## Commit Sequence

Keep the approved design commit and add the README correction as a separate commit:

```text
f701273 docs: add PR compliance design
docs: translate README and restore template comments
```

The branch rename and PR metadata update are remote operations and do not create local commits. Do not force-push, amend the design commit, or delete the old branch unless the verified GitHub rename operation has already completed and the PR head has been confirmed.
