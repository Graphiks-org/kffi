#!/usr/bin/env python3

from __future__ import annotations

import pathlib
import sys

def normalize_generated_kotlin(text: str) -> str:
    lines = text.splitlines()
    normalized = "\n".join(line.rstrip() for line in lines).rstrip("\n")
    if normalized or text.endswith("\n"):
        normalized += "\n"
    return normalized


def process_tree(root: pathlib.Path) -> None:
    for path in sorted(root.rglob("*.kt")):
        original = path.read_text()
        normalized = normalize_generated_kotlin(original)
        if normalized != original:
            path.write_text(normalized)


def main(argv: list[str]) -> int:
    if len(argv) != 2:
        print("Usage: postprocess_generated_kotlin.py <generated-root>", file=sys.stderr)
        return 1
    root = pathlib.Path(argv[1])
    if not root.is_dir():
        print(f"generated root is missing: {root}", file=sys.stderr)
        return 1
    process_tree(root)
    return 0


if __name__ == "__main__":
    raise SystemExit(main(sys.argv))
