# Remove PR Commit-History Checks Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Make the PR policy ignore intermediate commit subjects and merge commits while retaining validation of PR metadata and base ancestry.

**Architecture:** Keep the validator responsible for PR-level metadata only. Remove commit-history inputs from the workflow and validator API instead of retaining unused parameters. Update the unit tests so their helper and passing-path contract no longer construct commit-history fixtures.

**Tech Stack:** GitHub Actions YAML, Python 3, `unittest`, TOML policy configuration.

---

## File Map

- Modify `.github/workflows/pr-policy.yml`: stop collecting commit subjects and merge counts, and stop passing them to the validator.
- Modify `.github/scripts/validate_pr_policy.py`: remove commit-subject validation and merge-commit rejection from the public validator flow and CLI.
- Modify `.github/scripts/test_validate_pr_policy.py`: remove obsolete history fixtures/tests and preserve coverage for the remaining PR checks.
- No change to `.github/contributing-policy.toml`: its type/scope lists remain relevant to PR titles and body selections.

### Task 1: Update the Test Contract

**Files:**
- Modify: `.github/scripts/test_validate_pr_policy.py:109-132`
- Modify: `.github/scripts/test_validate_pr_policy.py:141-300`

- [ ] **Step 1: Remove history arguments from the test helper first**

Change `ValidatePrPolicyTests.validate` to accept only the active policy inputs and call `validate_policy` without commit-history files or counts:

```python
    def validate(
        self,
        *,
        title: str,
        body: str,
        branch: str,
        changed_files: list[str],
        base_ancestor: bool,
    ) -> list[str]:
        body_file = write_text_file(self.root, "body.md", body)
        changed_files_file = write_lines_file(self.root, "changed-files.txt", changed_files)
        return validate_policy(
            policy_path=self.policy,
            title=title,
            body_file=body_file,
            branch=branch,
            changed_files_file=changed_files_file,
            base_ancestor=base_ancestor,
        )
```

Remove `commit_subjects` and `merge_commits` from every remaining test call. Keep `base_ancestor` in all calls because ancestry validation remains part of the policy.

- [ ] **Step 2: Run the tests and confirm the contract fails against the old implementation**

Run:

```bash
python3 .github/scripts/test_validate_pr_policy.py
```

Expected: FAIL with a `TypeError` because the current `validate_policy` still requires `commit_subjects_file` and `merge_commits`.

- [ ] **Step 3: Delete tests for removed behaviour**

Delete the complete `ValidatePrPolicyTests.test_non_conventional_commit_subject_is_rejected` method and the complete `ValidatePrPolicyTests.test_merge_commits_are_rejected` method. Both methods occupy the final history-specific test cases in the class.

Keep `test_non_ancestor_base_is_rejected`, since it tests the retained ancestry check. The existing `test_valid_pr_passes` becomes the regression test that a valid PR needs no commit-history input.

### Task 2: Remove History Validation from Python

**Files:**
- Modify: `.github/scripts/validate_pr_policy.py:64-68`
- Modify: `.github/scripts/validate_pr_policy.py:166-213`
- Modify: `.github/scripts/validate_pr_policy.py:225-251`

- [ ] **Step 1: Remove the unused commit parser and validator**

Delete `parse_conventional_commit` and `validate_commit_subjects`. No remaining function should inspect commit subjects or the configured commit type/scope allowlists.

- [ ] **Step 2: Reduce the `validate_policy` signature and body**

The function signature and validation flow should be:

```python
def validate_policy(
    *,
    policy_path: str | Path,
    title: str,
    body_file: str | Path,
    branch: str,
    changed_files_file: str | Path,
    base_ancestor: bool,
) -> list[str]:
    policy = load_policy(policy_path)
    body = read_text(body_file)
    changed_files = read_lines(changed_files_file)

    errors: list[str] = []
    errors.extend(validate_title(title, policy))
    errors.extend(validate_branch(branch, policy))
    errors.extend(validate_required_sections(body, policy))
    errors.extend(validate_type_selection(body, policy))
    errors.extend(validate_changelog_selection(body, changed_files, policy))
    errors.extend(validate_documentation_selection(body, changed_files))

    if not base_ancestor:
        errors.append("base commit is not an ancestor of the head commit")

    return errors
```

- [ ] **Step 3: Remove obsolete CLI arguments**

Delete these parser declarations:

```python
    parser.add_argument("--commit-subjects-file", required=True)
    parser.add_argument("--merge-commits", required=True, type=int)
```

Delete the matching `args.commit_subjects_file` and `args.merge_commits` keyword arguments in the `validate_policy` call. Keep `--base-ancestor` and all PR metadata arguments.

- [ ] **Step 4: Run the focused unit tests**

Run:

```bash
python3 .github/scripts/test_validate_pr_policy.py
```

Expected: all remaining tests pass, including title, branch, required-section, change-type, changelog, documentation, valid-PR, and non-ancestor checks.

### Task 3: Remove History Collection from the Workflow

**Files:**
- Modify: `.github/workflows/pr-policy.yml:33-69`

- [ ] **Step 1: Remove temporary history files and Git commands**

The validation step should retain only the changed-file collection, base-ancestor calculation, PR body extraction, and validator call:

```yaml
          changed_files_file="$(mktemp)"
          body_file="$(mktemp)"

          git diff --name-only "$PR_BASE_SHA" "$PR_HEAD_SHA" > "$changed_files_file"

          if git merge-base --is-ancestor "$PR_BASE_SHA" "$PR_HEAD_SHA"; then
            base_ancestor=true
          else
            base_ancestor=false
          fi
```

Remove the `commit_subjects_file` variable, the `git log --format=%s` command, and the `merge_commits` calculation.

- [ ] **Step 2: Update the validator invocation**

The final command must pass only the retained inputs:

```yaml
          python3 .github/scripts/validate_pr_policy.py \
            --policy .github/contributing-policy.toml \
            --title "$PR_TITLE" \
            --body-file "$body_file" \
            --branch "$PR_BRANCH" \
            --changed-files-file "$changed_files_file" \
            --base-ancestor "$base_ancestor"
```

### Task 4: Verify the End-to-End Policy

**Files:**
- Verify: `.github/workflows/pr-policy.yml`
- Verify: `.github/scripts/validate_pr_policy.py`
- Verify: `.github/scripts/test_validate_pr_policy.py`

- [ ] **Step 1: Run the full policy unit test file**

Run:

```bash
python3 .github/scripts/test_validate_pr_policy.py
```

Expected: exit code 0 and no failed tests.

- [ ] **Step 2: Validate the current PR metadata against the local branch range**

Run from the repository root:

```bash
tmpdir=$(mktemp -d /tmp/kffi-policy.XXXXXX)
base_sha=$(git merge-base HEAD origin/master)
git diff --name-only "$base_sha" HEAD > "$tmpdir/changed-files.txt"
curl -fsSL https://api.github.com/repos/Graphiks-org/kffi/pulls/2 | jq -r '.body // ""' > "$tmpdir/body.md"
python3 .github/scripts/validate_pr_policy.py \
  --policy .github/contributing-policy.toml \
  --title 'feat: split KFFI from wgpu4k-native' \
  --body-file "$tmpdir/body.md" \
  --branch 'feat/split-kffi-from-wgpu4k-native' \
  --changed-files-file "$tmpdir/changed-files.txt" \
  --base-ancestor true
rc=$?
rm -rf "$tmpdir"
exit $rc
```

Expected: exit code 0. The five historical merges and legacy commit subjects must not be read or reported by the validator.

- [ ] **Step 3: Inspect the final diff**

Run:

```bash
git diff -- .github/workflows/pr-policy.yml .github/scripts/validate_pr_policy.py .github/scripts/test_validate_pr_policy.py
```

Expected: only commit-subject collection/validation, merge-count collection/rejection, and their obsolete tests are removed; all PR metadata and base-ancestor checks remain.
