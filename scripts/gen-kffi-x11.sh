#!/usr/bin/env bash
# Regenerate the kffi-x11 generated bindings through Docker.
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
IMAGE=kffi-x11-codegen
GIT_COMMON_DIR="$(git -C "$REPO_ROOT" rev-parse --git-common-dir)"
if [[ "$GIT_COMMON_DIR" != /* ]]; then
    GIT_COMMON_DIR="$(cd "$REPO_ROOT/$GIT_COMMON_DIR" && pwd)"
fi

docker build -t "$IMAGE" "$REPO_ROOT/docker/kffi-x11-codegen"

TTY_ARGS=()
if [[ -t 1 ]]; then
    TTY_ARGS=(-t)
fi

# Mount the common Git directory at its host path too: linked-worktree
# submodules use absolute gitdir paths, and generate.sh verifies their commit.
docker run --rm "${TTY_ARGS[@]}" \
    -v "$REPO_ROOT:/work" \
    -v "$REPO_ROOT:$REPO_ROOT" \
    -v "$GIT_COMMON_DIR:$GIT_COMMON_DIR:ro" \
    -v kff-gradle-cache:/root/.gradle \
    "$IMAGE" bash /work/docker/kffi-x11-codegen/generate.sh
