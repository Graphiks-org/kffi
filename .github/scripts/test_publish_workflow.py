import re
import unittest
from pathlib import Path


WORKFLOW = Path(__file__).parents[1] / "workflows" / "publish.yml"


class PublishWorkflowTests(unittest.TestCase):
    def setUp(self) -> None:
        self.workflow = WORKFLOW.read_text(encoding="utf-8")

    def test_snapshot_apple_job_publishes_only_apple_targets_after_snapshot(self) -> None:
        match = re.search(
            r"^  snapshot-apple:\n(?P<body>.*?)(?=^  [\w-]+:|\Z)",
            self.workflow,
            flags=re.MULTILINE | re.DOTALL,
        )

        self.assertIsNotNone(match, "snapshot-apple job is missing")
        body = match.group("body")

        self.assertRegex(body, r"(?m)^    needs: snapshot$", "Apple publication must follow snapshot")
        self.assertRegex(body, r"(?m)^    runs-on: macos-latest$", "Apple publication requires macOS")
        self.assertNotIn(":kffi:publishToMavenCentral", body)

        for task in (
            ":kffi:publishIosArm64PublicationToMavenCentralRepository",
            ":kffi:publishIosSimulatorArm64PublicationToMavenCentralRepository",
            ":kffi:publishIosX64PublicationToMavenCentralRepository",
            ":kffi:publishMacosArm64PublicationToMavenCentralRepository",
            ":kffi:publishMacosX64PublicationToMavenCentralRepository",
        ):
            self.assertIn(task, body)


if __name__ == "__main__":
    unittest.main()
