# PR, Branch, and README Compliance Design

## Context

PR #1 currently uses `main` as its head branch and `master` as its base branch.
The head branch name does not describe the work and does not satisfy the
repository branch policy. The PR body is not based on the repository pull
request template. The root README is written in French and the PR replaced the
HTML comments from the original README template.

The repository already contains several workflows. This correction must follow
the existing contribution workflow without replacing or deleting those files.

## Goals

- Keep `master` as the PR base branch.
- Rename the PR head branch to `feat/split-kffi-from-wgpu4k-native`.
- Keep PR #1 when GitHub can preserve the head reference during the rename.
- Rewrite the PR title and body in English using the existing PR template.
- Rewrite the root README in English while preserving the current KFFI
  technical content.
- Restore the README template HTML comments verbatim, including the status
  badge comment block.
- Preserve all existing workflow files.
- Verify branch, PR, documentation, and project checks after the changes.

## Non-goals

- Do not replace or remove the legacy workflows in this correction.
- Do not change the repository default branch.
- Do not change the PR base from `master`.
- Do not redesign the KFFI build, publishing, or module layout.
- Do not close and recreate PR #1 unless GitHub cannot associate it with the
  renamed head branch.

## Chosen Approach

Use the minimal compliance approach:

1. Capture the current Git and PR state.
2. Rename the remote `main` branch to
   `feat/split-kffi-from-wgpu4k-native` and synchronize the local checkout.
3. Keep PR #1 targeting `master` and update its title and body.
4. Translate and restructure the root README, restoring the original template
   comments and retaining only documentation that matches the standalone KFFI
   repository.
5. Run the existing project checks and inspect the final GitHub state.

## Branch and PR Design

The branch name uses the repository's allowed `feat/` prefix and describes the
extraction work. The PR title will be:

```text
feat: split KFFI from wgpu4k-native
```

The PR body will use `.github/PULL_REQUEST_TEMPLATE.md` with all sections
completed in English:

- Description of the standalone KFFI extraction.
- `feat` selected as the change type.
- Checklist entries completed or justified, including tests, changelog, docs,
  and cross-target compatibility.
- Screenshots marked not applicable when appropriate.
- Additional notes for any known legacy workflow limitations.

The PR base remains `master`. If the GitHub branch rename does not preserve the
PR head reference, stop before destructive cleanup and report the required
fallback. The fallback is to create the correctly named branch from the same
commit range, update or recreate the PR only after confirming that no commits
or review context would be lost.

## README Design

The root README will be an English standalone KFFI document. Its technical
sections will cover:

- Project purpose and supported JVM, Android, and Native backends.
- Repository modules and published artifacts.
- Dependency declaration and binding generation.
- Native library loading for each supported target.
- Memory safety guarantees, bounds checks, lifetimes, confinement, aliasing,
  and the `unsafe` option.
- Callbacks, versioning, and licensing.

The following template material will be restored without changing the comment
text:

- The customizable project-status badge comment block.
- Relevant contribution, architecture, CI/CD, and development-command
  guidance from the original template.

References to obsolete `shared` and `docs` modules will not be carried into
the root README. Existing KFFI documentation will not claim unsupported
backend implementations.

## Workflow Preservation

No existing file under `.github/workflows/` will be deleted, renamed, or
replaced. Compliance is handled through the branch prefix, the `master` base,
the PR template, and verification of the checks already configured by the
repository. Any unrelated stale workflow behavior remains outside this
correction's scope.

## Validation

The final validation will confirm:

- The local branch and upstream use `feat/split-kffi-from-wgpu4k-native`.
- The PR head uses the same branch and its base is `master`.
- The PR title and body are English and match the repository template.
- The README contains no French prose in its user-facing sections.
- The original template HTML comments are present verbatim.
- No workflow file was removed or unexpectedly modified.
- The working tree is clean after the intended commit.
- Relevant Gradle tests and checks pass, or failures are reported with their
  exact command and cause.
