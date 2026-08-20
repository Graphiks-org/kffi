#!/usr/bin/env bash
# Regenerate the kffi-x11 generated bindings through Docker.
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
IMAGE=kffi-x11-codegen
case "$(uname -m)" in
    x86_64 | amd64) DEFAULT_DOCKER_PLATFORM=linux/amd64 ;;
    aarch64 | arm64) DEFAULT_DOCKER_PLATFORM=linux/arm64 ;;
    *)
        echo "Unsupported host architecture for X11 code generation: $(uname -m)" >&2
        exit 1
        ;;
esac
DOCKER_PLATFORM="${KFFI_X11_DOCKER_PLATFORM:-$DEFAULT_DOCKER_PLATFORM}"
GIT_COMMON_DIR="$(git -C "$REPO_ROOT" rev-parse --git-common-dir)"
if [[ "$GIT_COMMON_DIR" != /* ]]; then
    GIT_COMMON_DIR="$(cd "$REPO_ROOT/$GIT_COMMON_DIR" && pwd)"
fi

docker build --platform "$DOCKER_PLATFORM" -t "$IMAGE" "$REPO_ROOT/docker/kffi-x11-codegen"

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
    "$IMAGE" bash /work/docker/kffi-x11-codegen/generate.sh
