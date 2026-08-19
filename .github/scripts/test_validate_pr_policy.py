from __future__ import annotations

import subprocess
import sys
import tempfile
import unittest
from pathlib import Path

import validate_pr_policy


SCRIPT = Path(__file__).with_name("validate_pr_policy.py")
POLICY = SCRIPT.parents[1] / "contributing-policy.toml"
WORKFLOW = SCRIPT.parents[1] / "workflows" / "pr-policy.yml"


class FailureCommentTest(unittest.TestCase):
    def test_failure_comment_is_an_actionable_english_markdown_report(self) -> None:
        formatter = getattr(validate_pr_policy, "format_failure_comment", None)
        self.assertTrue(callable(formatter), "the validator must expose a failure comment formatter")
        if not callable(formatter):
            return

        errors = [
            "The title must follow Conventional Commits format.",
            "The branch must start with `feat/`, `fix/`, or `chore/`.",
        ]
        comment = formatter(errors)

        self.assertTrue(comment.startswith("<!-- pr-policy-failure -->"))
        self.assertIn("## ❌ PR policy check failed", comment)
        self.assertIn("This PR does not yet meet", comment)
        self.assertIn("See `CONTRIBUTING.md`", comment)
        for error in errors:
            self.assertIn(f"- {error}", comment)

    def test_validator_writes_comment_file_when_policy_fails(self) -> None:
        with tempfile.TemporaryDirectory() as directory:
            directory_path = Path(directory)
            body_file = directory_path / "body.md"
            changed_files_file = directory_path / "changed-files.txt"
            comment_file = directory_path / "comment.md"
            body_file.write_text("", encoding="utf-8")
            changed_files_file.write_text("", encoding="utf-8")

            result = subprocess.run(
                [
                    sys.executable,
                    str(SCRIPT),
                    "--policy",
                    str(POLICY),
                    "--title",
                    "invalid title",
                    "--body-file",
                    str(body_file),
                    "--branch",
                    "feature/example",
                    "--changed-files-file",
                    str(changed_files_file),
                    "--base-ancestor",
                    "false",
                    "--comment-file",
                    str(comment_file),
                ],
                capture_output=True,
                text=True,
                check=False,
            )

            self.assertEqual(result.returncode, 1)
            comment = comment_file.read_text(encoding="utf-8")
            self.assertIn("<!-- pr-policy-failure -->", comment)
            self.assertIn("## ❌ PR policy check failed", comment)
            for error in (
                "Title must follow",
                "Branch",
                "PR body",
                "Base commit",
            ):
                self.assertIn(error, comment)


class WorkflowSafetyTest(unittest.TestCase):
    def test_commenting_workflow_executes_validator_from_trusted_base(self) -> None:
        workflow = WORKFLOW.read_text(encoding="utf-8")

        self.assertIn("pull_request_target:", workflow)
        self.assertIn("types: [opened, synchronize, reopened, edited]", workflow)
        self.assertIn("ref: ${{ github.event.pull_request.base.sha }}", workflow)
        fetch_command = (
            "git fetch --no-tags origin \\\n"
            '            "refs/pull/$PR_NUMBER/head:refs/remotes/origin/pr/$PR_NUMBER/head"'
        )
        self.assertIn(fetch_command, workflow)
        self.assertNotIn("ref: ${{ github.event.pull_request.head.sha }}", workflow)

    def test_commenting_workflow_serializes_and_reports_comment_failures(self) -> None:
        workflow = WORKFLOW.read_text(encoding="utf-8")

        self.assertIn("concurrency:", workflow)
        self.assertIn("group: pr-policy-${{ github.event.pull_request.number }}", workflow)
        self.assertIn("steps.comment.outcome == 'failure'", workflow)


if __name__ == "__main__":
    unittest.main()
