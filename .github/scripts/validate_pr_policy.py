from __future__ import annotations

import argparse
import re
import sys
from pathlib import Path
from typing import Iterable

import tomllib


TITLE_RE = re.compile(
    r"^(?P<type>[a-z]+)(?:\((?P<scope>[A-Za-z0-9_-]+)\))?: (?P<description>\S.*)$"
)

TYPE_LABELS = {
    "feat": "New feature",
    "fix": "Bug fix",
    "build": "Build or dependencies",
    "chore": "Maintenance or tooling",
    "ci": "CI/CD configuration",
    "docs": "Documentation",
    "perf": "Performance improvement",
    "refactor": "Refactoring",
    "test": "Tests",
    "style": "Code style",
}

COMMENT_MARKER = "<!-- pr-policy-failure -->"


def format_failure_comment(errors: Iterable[str]) -> str:
    details = "\n".join(f"- {error}" for error in errors)
    return (
        f"{COMMENT_MARKER}\n"
        "## ❌ Échec de la politique de PR\n\n"
        "Cette PR ne respecte pas encore les règles de contribution du dépôt. "
        "Corrigez les points suivants, puis relancez le check.\n\n"
        "### Points à corriger\n\n"
        f"{details}\n\n"
        "Consultez `CONTRIBUTING.md` pour le détail des règles.\n"
    )


def read_lines(path: str | Path) -> list[str]:
    return [line.strip() for line in Path(path).read_text(encoding="utf-8").splitlines() if line.strip()]


def read_text(path: str | Path) -> str:
    return Path(path).read_text(encoding="utf-8")


def load_policy(policy_path: str | Path) -> dict[str, object]:
    return tomllib.loads(Path(policy_path).read_text(encoding="utf-8"))


def section_block(body: str, heading: str) -> str:
    marker = f"## {heading}"
    lines = body.splitlines()
    start = None
    for index, line in enumerate(lines):
        if line.strip() == marker:
            start = index + 1
            break
    if start is None:
        return ""
    end = len(lines)
    for index in range(start, len(lines)):
        if lines[index].startswith("## "):
            end = index
            break
    return "\n".join(lines[start:end]).strip()


def heading_present(body: str, heading: str) -> bool:
    return any(line.strip() == f"## {heading}" for line in body.splitlines())


def validate_title(title: str, policy: dict[str, object]) -> list[str]:
    errors: list[str] = []
    match = TITLE_RE.match(title.strip())
    if not match:
        return ["Le titre doit respecter le format Conventional Commits : `<type>(<scope>): <description>`."]

    allowed_types = set(policy["allowed_types"])
    allowed_scopes = set(policy["allowed_scopes"])
    commit_type = match.group("type")
    scope = match.group("scope")

    if commit_type not in allowed_types:
        errors.append(f"Le type de titre {commit_type!r} n’est pas autorisé")
    if scope is not None and scope not in allowed_scopes:
        errors.append(f"Le scope du titre {scope!r} n’est pas autorisé")
    return errors


def validate_branch(branch: str, policy: dict[str, object]) -> list[str]:
    prefixes = tuple(policy["branch_prefixes"])
    if not branch.startswith(prefixes):
        return [
            f"La branche {branch!r} doit commencer par l’un des préfixes suivants : {', '.join(prefixes)}"
        ]
    return []


def validate_required_sections(body: str, policy: dict[str, object]) -> list[str]:
    missing = [heading for heading in policy["required_sections"] if not heading_present(body, heading)]
    if missing:
        return [f"Le corps de la PR ne contient pas les sections obligatoires suivantes : {', '.join(missing)}"]
    return []


def validate_type_selection(body: str, policy: dict[str, object]) -> list[str]:
    block = section_block(body, "Type of Change")
    selected: list[str] = []
    for line in block.splitlines():
        line = line.strip()
        if not line.startswith("- [x]"):
            continue
        match = re.search(r"`([a-z]+)`", line)
        if match and match.group(1) in policy["allowed_types"]:
            selected.append(match.group(1))
    if len(selected) != 1:
        return [
            "Le corps de la PR doit sélectionner exactement un type de changement ; "
            f"{len(selected)} sélectionné(s)"
        ]
    return []


def validate_changelog_selection(body: str, changed_files: Iterable[str], policy: dict[str, object]) -> list[str]:
    checklist = section_block(body, "Checklist")
    lines = [line.strip() for line in checklist.splitlines()]
    changed = set(changed_files)
    changelog_files = list(policy["changelog_files"])
    update_markers = {
        name: f"- [x] {name} has been updated"
        for name in changelog_files
    }
    no_update_marker = "- [x] No changelog update needed:"

    checked_updates = [name for name, marker in update_markers.items() if marker in lines]
    no_update_checked = any(line.startswith(no_update_marker) for line in lines)

    if checked_updates:
        errors = []
        missing_files = [name for name in checked_updates if name not in changed]
        if missing_files:
            errors.append(
                f"Les fichiers modifiés ne contiennent pas le ou les changelog(s) requis : {', '.join(missing_files)}"
            )
        if len(checked_updates) != len(changelog_files):
            errors.append(
                "Le corps de la PR doit sélectionner tous les changelogs configurés lorsqu’une mise à jour est déclarée"
            )
        if no_update_checked:
            errors.append(
                "Le corps de la PR ne doit pas sélectionner l’absence de changelog en même temps qu’une mise à jour"
            )
        return errors

    if no_update_checked:
        reason_line = next((line for line in lines if line.startswith(no_update_marker)), "")
        reason_text = reason_line.removeprefix(no_update_marker).strip()
        if not reason_text:
            return ["Le corps de la PR doit justifier la décision de ne pas mettre à jour le changelog"]
        return []

    return ["Le corps de la PR doit sélectionner les changelogs configurés ou justifier l’absence de mise à jour"]


def validate_documentation_selection(body: str, changed_files: Iterable[str]) -> list[str]:
    changed_docs = any(path.startswith("docs/") for path in changed_files)
    if not changed_docs:
        return []

    checklist = section_block(body, "Checklist")
    lines = [line.strip() for line in checklist.splitlines()]
    docs_selected = "- [x] Documentation updated if needed" in lines
    if not docs_selected:
        return ["La PR modifie des chemins docs/ et doit indiquer la décision concernant la documentation"]
    return []


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
        errors.append("Le commit de base n’est pas un ancêtre du commit de tête ; la branche doit être rebasée")

    return errors


def parse_bool(value: str) -> bool:
    normalized = value.strip().lower()
    if normalized in {"1", "true", "yes", "y"}:
        return True
    if normalized in {"0", "false", "no", "n"}:
        return False
    raise argparse.ArgumentTypeError("expected a boolean value")


def main(argv: list[str] | None = None) -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--policy", required=True)
    parser.add_argument("--title", required=True)
    parser.add_argument("--body-file", required=True)
    parser.add_argument("--branch", required=True)
    parser.add_argument("--changed-files-file", required=True)
    parser.add_argument("--base-ancestor", required=True, type=parse_bool)
    parser.add_argument("--comment-file")
    args = parser.parse_args(argv)

    errors = validate_policy(
        policy_path=args.policy,
        title=args.title,
        body_file=args.body_file,
        branch=args.branch,
        changed_files_file=args.changed_files_file,
        base_ancestor=args.base_ancestor,
    )
    if errors:
        for error in errors:
            print(error, file=sys.stderr)
        if args.comment_file:
            Path(args.comment_file).write_text(format_failure_comment(errors), encoding="utf-8")
        return 1
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
