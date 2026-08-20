#!/usr/bin/env bash
# Build the local X11 integration image and run its headless screenshot test.
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
DOCKER_BIN="${DOCKER_BIN:-docker}"
IMAGE="${KFFI_X11_INTEGRATION_IMAGE:-kffi-x11-integration}"
GRADLE_CACHE_VOLUME="${KFFI_X11_INTEGRATION_GRADLE_CACHE_VOLUME:-kffi-x11-integration-gradle-cache}"

if ! command -v "$DOCKER_BIN" >/dev/null 2>&1; then
    echo "error: Docker command '$DOCKER_BIN' was not found in PATH" >&2
    exit 1
fi

"$DOCKER_BIN" build \
    -f "$REPO_ROOT/docker/x11-integration/Dockerfile" \
    -t "$IMAGE" \
    "$REPO_ROOT"

exec "$DOCKER_BIN" run --rm --init \
    -v "$REPO_ROOT:/workspace" \
    -v "$GRADLE_CACHE_VOLUME:/root/.gradle" \
    -w /workspace \
    "$IMAGE"
