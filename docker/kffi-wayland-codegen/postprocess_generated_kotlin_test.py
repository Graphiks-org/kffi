#!/usr/bin/env python3

from __future__ import annotations

import pathlib
import tempfile

from postprocess_generated_kotlin import process_tree


def main() -> int:
    with tempfile.TemporaryDirectory() as tmp:
        root = pathlib.Path(tmp)
        xdg_shell = root / "xdg_shell_client_protocol_h.kt"
        xdg_shell.write_text(
            "enum class xdg_toplevel_state(val value: Long) {\n"
            "    XDG_TOPLEVEL_STATE_MAXIMIZED(1L), XDG_TOPLEVEL_STATE_FULLSCREEN(2L), "
            "XDG_TOPLEVEL_STATE_RESIZING(3L), XDG_TOPLEVEL_STATE_ACTIVATED(4L), "
            "XDG_TOPLEVEL_STATE_TILED_LEFT(5L), XDG_TOPLEVEL_STATE_TILED_RIGHT(6L), "
            "XDG_TOPLEVEL_STATE_TILED_TOP(7L), XDG_TOPLEVEL_STATE_TILED_BOTTOM(8L), "
            "XDG_TOPLEVEL_STATE_SUSPENDED(9L);    \n"
            "    \n"
            "    companion object {\n"
            "        fun fromValue(v: Long): xdg_toplevel_state = entries.firstOrNull { it.value == v }\n"
            "            ?: error(\"Unknown xdg_toplevel_state value: $v\")    \n"
            "    }\n"
            "}\n"
        )
        other = root / "other.kt"
        other.write_text("val example = 1    \n\n")

        process_tree(root)
        first_pass = xdg_shell.read_text()
        assert "XDG_TOPLEVEL_STATE_CONSTRAINED_LEFT(10L)" in first_pass
        assert "XDG_TOPLEVEL_STATE_CONSTRAINED_RIGHT(11L)" in first_pass
        assert "XDG_TOPLEVEL_STATE_CONSTRAINED_TOP(12L)" in first_pass
        assert "XDG_TOPLEVEL_STATE_CONSTRAINED_BOTTOM(13L)" in first_pass
        assert ";\n    \n" not in first_pass
        assert "error(\"Unknown xdg_toplevel_state value: $v\")    \n" not in first_pass
        assert other.read_text() == "val example = 1\n\n"

        process_tree(root)
        second_pass = xdg_shell.read_text()
        assert first_pass == second_pass

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
