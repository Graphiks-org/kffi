import re
import unittest
from pathlib import Path


WORKFLOW = Path(__file__).parents[1] / "workflows" / "publish.yml"


class PublishWorkflowTests(unittest.TestCase):
    def setUp(self) -> None:
        self.workflow = WORKFLOW.read_text(encoding="utf-8")

    def test_snapshot_job_publishes_all_targets_from_macos(self) -> None:
        match = re.search(
            r"^  snapshot:\n(?P<body>.*?)(?=^  [\w-]+:|\Z)",
            self.workflow,
            flags=re.MULTILINE | re.DOTALL,
        )

        self.assertIsNotNone(match, "snapshot job is missing")
        body = match.group("body")

        self.assertRegex(body, r"(?m)^    runs-on: macos-latest$", "Snapshot publication requires macOS")
        self.assertIn("./gradlew publishToMavenCentral", body)
        self.assertNotRegex(self.workflow, r"(?m)^  snapshot-apple:", "Snapshot publication must use one job")


if __name__ == "__main__":
    unittest.main()
