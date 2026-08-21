#!/usr/bin/env bash
set -euo pipefail

if [[ "$(uname -s)" != "Darwin" ]]; then
    echo "error: Objective-C/AppKit integration tests require macOS" >&2
    exit 1
fi

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
DEFAULT_REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
REPO_ROOT="${KFFI_OBJC_INTEGRATION_REPO_ROOT:-$DEFAULT_REPO_ROOT}"

if [[ ! -d "$REPO_ROOT" ]]; then
    echo "error: repository root '$REPO_ROOT' does not exist" >&2
    exit 1
fi

REPO_ROOT="$(cd "$REPO_ROOT" && pwd -P)"
GRADLE="${KFFI_OBJC_INTEGRATION_GRADLE:-$REPO_ROOT/gradlew}"
ARTIFACT_DIR="${KFFI_OBJC_INTEGRATION_ARTIFACT_DIR:-${KFFI_OBJC_ARTIFACT_DIR:-$REPO_ROOT/kffi-objc/build/objc-integration}}"

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
ARTIFACT_DIR="$(cd "$ARTIFACT_DIR" && pwd -P)"

export KFFI_OBJC_INTEGRATION=1
export KFFI_OBJC_INTEGRATION_ARTIFACT_DIR="$ARTIFACT_DIR"

cd "$REPO_ROOT"
"$GRADLE" :kffi-objc:objcIntegrationTest --no-daemon --configure-on-demand
