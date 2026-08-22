#!/usr/bin/env bash
# Run the kffi-posix generation pipeline inside the codegen container.
set -euo pipefail

JDK_HOME="${JDK_HOME:-/opt/java/openjdk}"
LLVM_HOME="${LLVM_HOME:-/usr/lib/llvm-18}"
REPO=/work
KEXTRACT_DIR="${KEXTRACT_DIR:-$REPO/third_party/kextract}"
REQUIRED_KEXTRACT_REVISION=9252fb417ea91dae882a6a9e9d06ab672c50adc3
OUT_KT="$REPO/kffi-posix/src/jvmMain/kotlin"
STAGING_KT="$REPO/kffi-posix/build/linux-posix-generated"
GENERATED_KT="$OUT_KT/org/graphiks/kffi/posix/generated"

echo "[gen] llvm=$LLVM_HOME jdk=$JDK_HOME"

if [[ ! -x "$KEXTRACT_DIR/gradlew" ]]; then
    echo "[gen] kextract submodule is missing: $KEXTRACT_DIR" >&2
    echo "[gen] initialize it with: git submodule update --init --recursive" >&2
    exit 1
fi

actual_kextract_revision="$(git -C "$KEXTRACT_DIR" rev-parse HEAD)"
if [[ "$actual_kextract_revision" != "$REQUIRED_KEXTRACT_REVISION" ]]; then
    echo "[gen] expected kextract $REQUIRED_KEXTRACT_REVISION, found $actual_kextract_revision" >&2
    exit 1
fi
if [[ -n "$(git -C "$KEXTRACT_DIR" status --porcelain --untracked-files=all)" ]]; then
    echo "[gen] kextract worktree must be clean at $REQUIRED_KEXTRACT_REVISION" >&2
    exit 1
fi

rm -rf "$STAGING_KT"
mkdir -p "$STAGING_KT"

# kextract derives the Kotlin file name from its input header. Stage a copy
# with the tracked output name while keeping the compatibility header itself
# explicit and reviewable.
HEADER_INPUT="$STAGING_KT/LinuxPosix.h"
cp "$REPO/docker/kffi-posix-codegen/linux_posix_compat.h" "$HEADER_INPUT"

echo "[gen] building kextract at $actual_kextract_revision"
(
    cd "$KEXTRACT_DIR"
    # The packaged runtime and LLVM libraries are architecture-specific, while
    # Gradle's up-to-date state does not include the Docker platform. Rebuild
    # them so an earlier arm64 run cannot leak into canonical amd64 generation.
    ./gradlew --no-daemon \
        -Pjdk_home="$JDK_HOME" \
        -Pllvm_home="$LLVM_HOME" \
        clean \
        createKextractImage
)
KEXTRACT="$KEXTRACT_DIR/build/kextract/bin/kextract"
[[ -x "$KEXTRACT" ]]
"$KEXTRACT" --help >/dev/null 2>&1

functions=(
    mmap munmap shm_open shm_unlink memfd_create ftruncate
    shmget shmat shmdt shmctl
    eventfd pipe pipe2 read write close poll
)

args=(
    -t org.graphiks.kffi.posix.generated
    -o "$STAGING_KT"
    -l :libc.so.6
    -A -ffreestanding
)
for function in "${functions[@]}"; do args+=(--include-function "$function"); done

# Ask the compiler for the macro names exported by this pinned Linux image so
# the generated surface follows the headers instead of duplicating ABI values.
while read -r constant; do args+=(--include-constant "$constant"); done < <(
    cpp -dM -include "$HEADER_INPUT" - </dev/null |
        awk '$1 == "#define" && $2 !~ /\(/ &&
            ($2 ~ /^(PROT_|MAP_|O_|IPC_|POLL)/ ||
             $2 ~ /^F_(GETFD|SETFD|GETFL|SETFL)$/ ||
             $2 == "MFD_CLOEXEC" ||
             $2 == "EINTR" || $2 == "EAGAIN" || $2 == "ENOMEM" ||
             $2 == "EINVAL" || $2 == "ENOSYS" ||
             $2 == "KFFI_MAP_FAILED_ADDRESS" ||
             $2 == "KFFI_SHMAT_FAILED_ADDRESS") { print $2 }' |
        sort -u
)

echo "[gen] generating Kotlin FFM bindings with kextract"
"$KEXTRACT" "${args[@]}" "$HEADER_INPUT"

rm -rf "$GENERATED_KT"
mkdir -p "$(dirname "$GENERATED_KT")"
mv "$STAGING_KT/org/graphiks/kffi/posix/generated" "$GENERATED_KT"

# kextract emits indentation-only blank lines. Normalize generated whitespace
# so regenerated sources pass Git's whitespace checks without altering bindings.
perl -0pi -e 's/[ \t]+$//mg; s/\n{2,}\z/\n/' "$GENERATED_KT"/*.kt

if ! git -C "$REPO" ls-files --error-unmatch "$GENERATED_KT/LinuxPosix_h.kt" >/dev/null; then
    echo "[gen] generated package must remain tracked: $GENERATED_KT" >&2
    exit 1
fi
if [[ -n "$(git -C "$REPO" ls-files --others --exclude-standard -- "$GENERATED_KT")" ]]; then
    echo "[gen] generated package contains untracked output: $GENERATED_KT" >&2
    exit 1
fi
if ! git -C "$REPO" diff --quiet -- "$GENERATED_KT"; then
    echo "[gen] generated Linux POSIX sources differ from the tracked working tree" >&2
    git -C "$REPO" diff -- "$GENERATED_KT" >&2
    exit 1
fi

echo "[gen] generated sources:"
find "$GENERATED_KT" -name '*.kt' -print
