#!/usr/bin/env python3

from __future__ import annotations

import pathlib
import sys

COMPAT_ENUM_SUFFIX = (
    ", XDG_TOPLEVEL_STATE_CONSTRAINED_LEFT(10L)"
    ", XDG_TOPLEVEL_STATE_CONSTRAINED_RIGHT(11L)"
    ", XDG_TOPLEVEL_STATE_CONSTRAINED_TOP(12L)"
    ", XDG_TOPLEVEL_STATE_CONSTRAINED_BOTTOM(13L)"
)
ENUM_MARKER = "enum class xdg_toplevel_state(val value: Long) {\n"
COMPAT_MARKER = "XDG_TOPLEVEL_STATE_CONSTRAINED_LEFT"


def normalize_generated_kotlin(text: str, file_name: str) -> str:
    lines = text.splitlines()
    normalized = "\n".join(line.rstrip() for line in lines).rstrip("\n")
    if normalized or text.endswith("\n"):
        normalized += "\n"
    if file_name == "xdg_shell_client_protocol_h.kt":
        normalized = restore_xdg_toplevel_state_compat(normalized)
    return normalized


def restore_xdg_toplevel_state_compat(text: str) -> str:
    if COMPAT_MARKER in text:
        return text
    marker_index = text.find(ENUM_MARKER)
    if marker_index == -1:
        return text
    body_start = marker_index + len(ENUM_MARKER)
    body_end = text.find(";\n", body_start)
    if body_end == -1:
        return text
    body = text[body_start:body_end]
    return text[:body_end] if body.endswith(COMPAT_ENUM_SUFFIX) else (
        text[:body_end] + COMPAT_ENUM_SUFFIX + text[body_end:]
    )


def process_tree(root: pathlib.Path) -> None:
    for path in sorted(root.rglob("*.kt")):
        original = path.read_text()
        normalized = normalize_generated_kotlin(original, path.name)
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
