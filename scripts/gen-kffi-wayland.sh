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

if [[ -t 1 ]]; then
    # Persist kextract's Gradle dependencies between runs.
    docker run --rm -t \
        -v "$REPO_ROOT:/work" \
        -v kffi-gradle-cache:/root/.gradle \
        "$IMAGE" bash /work/docker/kffi-wayland-codegen/generate.sh
else
    # Persist kextract's Gradle dependencies between runs.
    docker run --rm \
        -v "$REPO_ROOT:/work" \
        -v kffi-gradle-cache:/root/.gradle \
        "$IMAGE" bash /work/docker/kffi-wayland-codegen/generate.sh
fi
