#!/usr/bin/env bash
# Regenerate the kffi-wayland generated bindings through Docker.
#
# The generated Kotlin files are written into the mounted repository and can
# then be reviewed and committed. The pipeline is intentionally explicit; it
# is not run as part of a Gradle build.
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
IMAGE=kffi-wayland-codegen

docker build -t "$IMAGE" "$REPO_ROOT/docker/kffi-wayland-codegen"

TTY_ARGS=()
if [[ -t 1 ]]; then
    TTY_ARGS=(-t)
fi

# Persist kextract's Gradle dependencies between runs.
docker run --rm "${TTY_ARGS[@]}" \
    -v "$REPO_ROOT:/work" \
    -v kff-gradle-cache:/root/.gradle \
    "$IMAGE" bash /work/docker/kffi-wayland-codegen/generate.sh
