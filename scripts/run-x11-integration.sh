#!/usr/bin/env bash
set -euo pipefail

if [[ "$(uname -s)" != "Linux" ]]; then
    echo "error: X11 integration tests require Linux" >&2
    exit 1
fi

for dependency in Xvfb xwd convert; do
    if ! command -v "$dependency" >/dev/null 2>&1; then
        echo "error: required command '$dependency' was not found in PATH" >&2
        exit 1
    fi
done

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
DEFAULT_REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
REPO_ROOT="${KFFI_X11_INTEGRATION_REPO_ROOT:-$DEFAULT_REPO_ROOT}"

if [[ ! -d "$REPO_ROOT" ]]; then
    echo "error: repository root '$REPO_ROOT' does not exist" >&2
    exit 1
fi

REPO_ROOT="$(cd "$REPO_ROOT" && pwd -P)"
GRADLE="${KFFI_X11_INTEGRATION_GRADLE:-$REPO_ROOT/gradlew}"
ARTIFACT_DIR="${KFFI_X11_INTEGRATION_ARTIFACT_DIR:-${KFFI_X11_ARTIFACT_DIR:-$REPO_ROOT/kffi-x11/build/x11-integration}}"

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
XVFB_LOG="$ARTIFACT_DIR/xvfb.log"

umask 077
RUNTIME_DIR="$(mktemp -d "${TMPDIR:-/tmp}/kffi-x11-runtime.XXXXXX")"
chmod 700 "$RUNTIME_DIR"
XVFB_PID=""
XVFB_DISPLAY=":99"
DISPLAY_SOCKET="/tmp/.X11-unix/X99"

cleanup() {
    local exit_status=$?
    trap - EXIT INT TERM

    if [[ -n "$XVFB_PID" ]] && kill -0 "$XVFB_PID" 2>/dev/null; then
        kill "$XVFB_PID" 2>/dev/null || true
        wait "$XVFB_PID" 2>/dev/null || true
    fi

    rm -rf -- "$RUNTIME_DIR"
    exit "$exit_status"
}

trap cleanup EXIT
trap 'exit 130' INT
trap 'exit 143' TERM

if [[ -S "$DISPLAY_SOCKET" ]]; then
    echo "error: X11 socket $DISPLAY_SOCKET already exists; refusing to reuse an existing X server" >&2
    exit 1
fi

: >"$XVFB_LOG"
Xvfb "$XVFB_DISPLAY" -screen 0 640x480x24 -nolisten tcp >"$XVFB_LOG" 2>&1 &
XVFB_PID=$!

for ((attempt = 0; attempt < 150; attempt++)); do
    if [[ -S "$DISPLAY_SOCKET" ]]; then
        break
    fi

    if ! kill -0 "$XVFB_PID" 2>/dev/null; then
        wait "$XVFB_PID" 2>/dev/null || true
        echo "error: Xvfb exited before creating $DISPLAY_SOCKET; see $XVFB_LOG" >&2
        exit 1
    fi

    sleep 0.1
done

if [[ ! -S "$DISPLAY_SOCKET" ]]; then
    echo "error: timed out waiting for X11 socket $DISPLAY_SOCKET; see $XVFB_LOG" >&2
    exit 1
fi

export DISPLAY="$XVFB_DISPLAY"
export KFFI_X11_INTEGRATION=1
export KFFI_X11_ARTIFACT_DIR="$ARTIFACT_DIR"

cd "$REPO_ROOT"
"$GRADLE" :kffi-x11:x11IntegrationTest --no-daemon --configure-on-demand
