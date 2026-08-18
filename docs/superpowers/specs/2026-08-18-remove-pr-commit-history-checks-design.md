# Remove PR Commit-History Checks

## Goal

Make the PR policy compatible with the repository's squash-merge workflow by
validating the pull request metadata without validating intermediate commits
that will not be present on `master` after the squash.

## Scope

Remove both history checks:

- validation of every commit subject against Conventional Commits and the
  configured type/scope allowlists;
- rejection of merge commits already present in the pull-request branch.

Keep the title, branch, required body sections, change-type selection,
changelog decision, documentation decision, and base-ancestor checks.

## Changes

`.github/workflows/pr-policy.yml` will stop collecting commit subjects and
counting merge commits. It will invoke the validator without those temporary
files or command-line arguments.

`.github/scripts/validate_pr_policy.py` will remove the commit-subject
validator and the related `validate_policy` parameters and branches. The
remaining validator API will represent only active PR policy checks.

`.github/scripts/test_validate_pr_policy.py` will remove the obsolete commit
subject and merge-commit rejection tests, simplify the test helper, and retain
coverage for the checks that remain.

## Behaviour

The five historical subtree-import merge commits and legacy commit subjects in
PR #2 will no longer cause `PR policy` to fail. Invalid PR metadata will still
fail the job.

The base-ancestor check remains because it validates that the PR target commit
is actually reachable from the submitted head; it is not a merge-strategy or
commit-message policy.

## Verification

- Run `.github/scripts/test_validate_pr_policy.py`.
- Run the validator against the PR #2 base/head range and confirm that commit
  history no longer contributes errors.
- Inspect the diff to confirm that only history-related controls and their
  tests were removed.
