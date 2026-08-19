from __future__ import annotations

import subprocess
import sys
import tempfile
import unittest
from pathlib import Path

import validate_pr_policy


SCRIPT = Path(__file__).with_name("validate_pr_policy.py")
POLICY = SCRIPT.parents[1] / "contributing-policy.toml"


class FailureCommentTest(unittest.TestCase):
    def test_failure_comment_is_a_french_actionable_markdown_report(self) -> None:
        formatter = getattr(validate_pr_policy, "format_failure_comment", None)
        self.assertTrue(callable(formatter), "the validator must expose a failure comment formatter")
        if not callable(formatter):
            return

        errors = [
            "Le titre doit respecter le format Conventional Commits.",
            "La branche doit commencer par `feat/`, `fix/` ou `chore/`.",
        ]
        comment = formatter(errors)

        self.assertTrue(comment.startswith("<!-- pr-policy-failure -->"))
        self.assertIn("## ❌ Échec de la politique de PR", comment)
        self.assertIn("Cette PR ne respecte pas encore", comment)
        self.assertIn("Consultez `CONTRIBUTING.md`", comment)
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
            self.assertIn("## ❌ Échec de la politique de PR", comment)
            self.assertIn("Le titre doit respecter", comment)


if __name__ == "__main__":
    unittest.main()
