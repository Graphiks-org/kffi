#!/usr/bin/env bash
# Regenerate the kffi-posix generated bindings through Docker.
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
IMAGE=kffi-posix-codegen
# Generate tracked source on one canonical Linux LP64 architecture so kextract
# comments and architecture macros remain byte-for-byte identical on every host.
# Docker emulates amd64 when regeneration runs from an arm64 machine.
readonly DOCKER_PLATFORM=linux/amd64
GIT_COMMON_DIR="$(git -C "$REPO_ROOT" rev-parse --git-common-dir)"
if [[ "$GIT_COMMON_DIR" != /* ]]; then
    GIT_COMMON_DIR="$(cd "$REPO_ROOT/$GIT_COMMON_DIR" && pwd)"
fi

docker build --platform "$DOCKER_PLATFORM" -t "$IMAGE" "$REPO_ROOT/docker/kffi-posix-codegen"

TTY_ARGS=()
if [[ -t 1 ]]; then
    TTY_ARGS=(-t)
fi

# Mount the common Git directory at its host path too: linked-worktree
# submodules use absolute gitdir paths, and generate.sh verifies their commit.
docker run --rm --platform "$DOCKER_PLATFORM" "${TTY_ARGS[@]}" \
    -v "$REPO_ROOT:/work" \
    -v "$REPO_ROOT:$REPO_ROOT" \
    -v "$GIT_COMMON_DIR:$GIT_COMMON_DIR:ro" \
    -v kff-gradle-cache:/root/.gradle \
    "$IMAGE" bash /work/docker/kffi-posix-codegen/generate.sh
