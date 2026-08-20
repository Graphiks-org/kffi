#!/usr/bin/env bash
set -euo pipefail

if [[ "$(uname -s)" != "Linux" ]]; then
    echo "error: Wayland integration tests require Linux" >&2
    exit 1
fi

for dependency in sway grim; do
    if ! command -v "$dependency" >/dev/null 2>&1; then
        echo "error: required command '$dependency' was not found in PATH" >&2
        exit 1
    fi
done

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
DEFAULT_REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
REPO_ROOT="${KFF_WAYLAND_INTEGRATION_REPO_ROOT:-$DEFAULT_REPO_ROOT}"
GRADLE="${KFF_WAYLAND_INTEGRATION_GRADLE:-$REPO_ROOT/gradlew}"
ARTIFACT_DIR="${KFF_WAYLAND_INTEGRATION_ARTIFACT_DIR:-${KFF_WAYLAND_ARTIFACT_DIR:-$REPO_ROOT/kffi-wayland/build/wayland-integration}}"

if [[ ! -d "$REPO_ROOT" ]]; then
    echo "error: repository root '$REPO_ROOT' does not exist" >&2
    exit 1
fi

if [[ "$GRADLE" == */* ]]; then
    if [[ ! -x "$GRADLE" ]]; then
        echo "error: Gradle launcher '$GRADLE' is missing or not executable" >&2
        exit 1
    fi
elif ! command -v "$GRADLE" >/dev/null 2>&1; then
    echo "error: Gradle launcher '$GRADLE' was not found in PATH" >&2
    exit 1
fi

mkdir -p "$ARTIFACT_DIR"
ARTIFACT_DIR="$(cd "$ARTIFACT_DIR" && pwd)"
COMPOSITOR_LOG="$ARTIFACT_DIR/compositor.log"

umask 077
RUNTIME_DIR="$(mktemp -d "${TMPDIR:-/tmp}/kffi-wayland-runtime.XXXXXX")"
chmod 700 "$RUNTIME_DIR"
SWAY_CONFIG="$RUNTIME_DIR/sway.config"
SWAY_PID=""

cleanup() {
    local exit_status=$?
    trap - EXIT INT TERM

    if [[ -n "$SWAY_PID" ]] && kill -0 "$SWAY_PID" 2>/dev/null; then
        kill "$SWAY_PID" 2>/dev/null || true
        wait "$SWAY_PID" 2>/dev/null || true
    fi

    rm -rf -- "$RUNTIME_DIR"
    exit "$exit_status"
}

trap cleanup EXIT
trap 'exit 130' INT
trap 'exit 143' TERM

cat >"$SWAY_CONFIG" <<'EOF'
output HEADLESS-1 mode 640x480
output HEADLESS-1 position 0 0
output HEADLESS-1 scale 1
output HEADLESS-1 transform normal
output HEADLESS-1 bg #000000 solid_color
workspace 1 output HEADLESS-1
seat seat0 fallback true
EOF

export KFF_WAYLAND_INTEGRATION=1
export WAYLAND_DISPLAY=wayland-1
export XDG_RUNTIME_DIR="$RUNTIME_DIR"
export KFF_WAYLAND_ARTIFACT_DIR="$ARTIFACT_DIR"
export WLR_BACKENDS=headless
export WLR_RENDERER=pixman
export WLR_HEADLESS_OUTPUTS=1
export WLR_LIBINPUT_NO_DEVICES=1

: >"$COMPOSITOR_LOG"
sway --config "$SWAY_CONFIG" --debug >"$COMPOSITOR_LOG" 2>&1 &
SWAY_PID=$!

WAYLAND_SOCKET="$XDG_RUNTIME_DIR/$WAYLAND_DISPLAY"
for ((attempt = 0; attempt < 150; attempt++)); do
    if [[ -S "$WAYLAND_SOCKET" ]]; then
        break
    fi

    if ! kill -0 "$SWAY_PID" 2>/dev/null; then
        wait "$SWAY_PID" 2>/dev/null || true
        echo "error: Sway exited before creating $WAYLAND_SOCKET; see $COMPOSITOR_LOG" >&2
        exit 1
    fi

    sleep 0.1
done

if [[ ! -S "$WAYLAND_SOCKET" ]]; then
    echo "error: timed out waiting for Wayland socket $WAYLAND_SOCKET; see $COMPOSITOR_LOG" >&2
    exit 1
fi

cd "$REPO_ROOT"
"$GRADLE" :kffi-wayland:waylandIntegrationTest --no-daemon --configure-on-demand
