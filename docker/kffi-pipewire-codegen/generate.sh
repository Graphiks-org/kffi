#!/usr/bin/env bash
# Run the kffi-pipewire generation pipeline inside the codegen container.
set -euo pipefail

JDK_HOME="${JDK_HOME:-/opt/java/openjdk}"
LLVM_HOME="${LLVM_HOME:-/usr/lib/llvm-18}"
REPO=/work
KEXTRACT_DIR="${KEXTRACT_DIR:-$REPO/third_party/kextract}"
REQUIRED_KEXTRACT_REVISION=e1d922eefb6b65887c6cc4bd98370ad2d7ba8b45
OUT_KT="$REPO/kffi-pipewire/src/jvmMain/kotlin"
STAGING_KT="$REPO/kffi-pipewire/build/pipewire-generated"
GENERATED_KT="$OUT_KT/org/graphiks/kffi/pipewire/generated"

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
HEADER_INPUT="$STAGING_KT/LinuxPipeWire.h"
cp "$REPO/docker/kffi-pipewire-codegen/pipewire_compat.h" "$HEADER_INPUT"

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

# Only exported pw_* symbols: the pw_core method macros (pw_core_sync,
# pw_core_add_listener) are vtable dispatch, not symbols — negotiation is
# driven purely through stream state transitions, so no core listener exists.
functions=(
    pw_init pw_deinit
    pw_properties_new_string pw_properties_free
    pw_thread_loop_new pw_thread_loop_start pw_thread_loop_stop pw_thread_loop_destroy
    pw_thread_loop_lock pw_thread_loop_unlock
    pw_thread_loop_wait pw_thread_loop_signal pw_thread_loop_get_loop
    pw_context_new pw_context_destroy
    pw_context_connect_fd pw_core_disconnect
    pw_stream_new pw_stream_add_listener pw_stream_connect
    pw_stream_update_params
    pw_stream_dequeue_buffer pw_stream_queue_buffer
    pw_stream_destroy pw_stream_get_state
)

# spa_hook storage is zero-initialised by pw_stream_add_listener's
# spa_hook_list_append; the struct layout only provides sizeof/alignment.
structs=(
    pw_buffer pw_stream_events
    spa_buffer spa_data spa_chunk spa_pod
    spa_hook spa_list spa_callbacks
)

args=(
    -t org.graphiks.kffi.pipewire.generated
    -o "$STAGING_KT"
    -l :libpipewire-0.3.so.0
    --include-path /usr/include/pipewire-0.3
    --include-path /usr/include/spa-0.2
    -A -ffreestanding
)
for function in "${functions[@]}"; do args+=(--include-function "$function"); done
for struct in "${structs[@]}"; do args+=("--include-struct" "$struct" "--include-typedef" "$struct"); done

# Ask the compiler for the macro names exported by this pinned PipeWire image
# so the generated surface follows the headers instead of duplicating ABI
# values. Enum values ride the KFFI_* re-exports in the compat header.
while read -r constant; do args+=(--include-constant "$constant"); done < <(
    cpp -I/usr/include/pipewire-0.3 -I/usr/include/spa-0.2 \
        -dM -include "$HEADER_INPUT" - </dev/null |
        awk '$1 == "#define" && $2 !~ /\(/ && $2 ~ /^KFFI_/ { print $2 }' |
        sort -u
)

echo "[gen] generating Kotlin FFM bindings with kextract"
"$KEXTRACT" "${args[@]}" "$HEADER_INPUT"

rm -rf "$GENERATED_KT"
mkdir -p "$(dirname "$GENERATED_KT")"
mv "$STAGING_KT/org/graphiks/kffi/pipewire/generated" "$GENERATED_KT"

# kextract emits indentation-only blank lines. Normalize generated whitespace
# so regenerated sources pass Git's whitespace checks without altering bindings.
perl -0pi -e 's/[ \t]+$//mg; s/\n{2,}\z/\n/' "$GENERATED_KT"/*.kt

if ! git -C "$REPO" ls-files --error-unmatch "$GENERATED_KT/LinuxPipeWire_h.kt" >/dev/null; then
    echo "[gen] generated package must remain tracked: $GENERATED_KT" >&2
    exit 1
fi
if [[ -n "$(git -C "$REPO" ls-files --others --exclude-standard -- "$GENERATED_KT")" ]]; then
    echo "[gen] generated package contains untracked output: $GENERATED_KT" >&2
    exit 1
fi
if ! git -C "$REPO" diff --quiet -- "$GENERATED_KT"; then
    echo "[gen] generated Linux PipeWire sources differ from the tracked working tree" >&2
    git -C "$REPO" diff -- "$GENERATED_KT" >&2
    exit 1
fi

echo "[gen] generated sources:"
find "$GENERATED_KT" -name '*.kt' -print
