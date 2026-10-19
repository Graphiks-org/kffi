#!/usr/bin/env bash
# Run the kffi-evdev generation pipeline inside the codegen container.
set -euo pipefail

JDK_HOME="${JDK_HOME:-/opt/java/openjdk}"
LLVM_HOME="${LLVM_HOME:-/usr/lib/llvm-18}"
REPO=/work
KEXTRACT_DIR="${KEXTRACT_DIR:-$REPO/third_party/kextract}"
REQUIRED_KEXTRACT_REVISION=e1d922eefb6b65887c6cc4bd98370ad2d7ba8b45
OUT_KT="$REPO/kffi-evdev/src/jvmMain/kotlin"
STAGING_KT="$REPO/kffi-evdev/build/evdev-generated"
GENERATED_KT="$OUT_KT/org/graphiks/kffi/evdev/generated"

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
HEADER_INPUT="$STAGING_KT/LinuxEvdev.h"
cp "$REPO/docker/kffi-evdev-codegen/linux_evdev_compat.h" "$HEADER_INPUT"

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
    open read write close ioctl fcntl __errno_location
    udev_new udev_ref udev_unref
    udev_enumerate_new udev_enumerate_ref udev_enumerate_unref
    udev_enumerate_add_match_subsystem udev_enumerate_add_match_sysattr
    udev_enumerate_scan_devices udev_enumerate_get_list_entry
    udev_list_entry_get_name udev_list_entry_get_value udev_list_entry_get_next
    udev_device_new_from_syspath udev_device_get_devnode udev_device_get_action
    udev_device_get_sysattr_value udev_device_ref udev_device_unref
    udev_monitor_new_from_netlink udev_monitor_ref udev_monitor_unref
    udev_monitor_filter_add_match_subsystem_devtype
    udev_monitor_enable_receiving udev_monitor_get_fd
    udev_monitor_receive_device
)

structs=(
    input_id input_event timeval input_absinfo
    ff_replay ff_trigger ff_rumble_effect
    KffiFfEffectStorage KffiFfUploadStorage
    uinput_setup uinput_abs_setup uinput_ff_erase
)

args=(
    -t org.graphiks.kffi.evdev.generated
    -o "$STAGING_KT"
    -l :libc.so.6
    -l :libudev.so.1
    -A -ffreestanding
    # ioctl(fd, request, ...), open(path, flags, ...) and fcntl(fd, cmd, ...)
    # are variadic; bind one leading variadic slot (an address register on
    # the ABI) — the managed layer passes pointers or zero-extended ints.
    --variadic-args ioctl:1
    --variadic-args open:1
    --variadic-args fcntl:1
)
for function in "${functions[@]}"; do args+=(--include-function "$function"); done
for struct in "${structs[@]}"; do args+=(--include-struct "$struct" --include-typedef "$struct"); done

# Ask the compiler for the macro names exported by this pinned Linux image so
# the generated surface follows the headers instead of duplicating ABI values.
# Function-like macros (EVIOCGNAME(len), EVIOCGBIT(ev, len), UI_GET_SYSNAME(len),
# …) are excluded by the filter: the managed layer computes them from the
# generated _IOC_* bit constants, exactly as the uapi macros do.
while read -r constant; do args+=(--include-constant "$constant"); done < <(
    cpp -dM -include "$HEADER_INPUT" - </dev/null |
        awk '$1 == "#define" && $2 !~ /\(/ &&
            ($2 ~ /^(_IOC|_NONE|_WRITE|_READ)/ ||
             $2 ~ /^(EV|BTN|ABS|FF|BUS|SYN|UI|KFFI|LIBUDEV)_/ ||
             $2 ~ /^EVIOC[A-Z]+$/ ||
             $2 ~ /^(O_RDONLY|O_WRONLY|O_RDWR|O_NONBLOCK|O_CLOEXEC)$/ ||
             $2 ~ /^F_(GETFD|SETFD|GETFL|SETFL)$/) { print $2 }' |
        sort -u
)

echo "[gen] generating Kotlin FFM bindings with kextract"
"$KEXTRACT" "${args[@]}" "$HEADER_INPUT"

rm -rf "$GENERATED_KT"
mkdir -p "$(dirname "$GENERATED_KT")"
mv "$STAGING_KT/org/graphiks/kffi/evdev/generated" "$GENERATED_KT"

# kextract emits indentation-only blank lines. Normalize generated whitespace
# so regenerated sources pass Git's whitespace checks without altering bindings.
perl -0pi -e 's/[ \t]+$//mg; s/\n{2,}\z/\n/' "$GENERATED_KT"/*.kt

if ! git -C "$REPO" ls-files --error-unmatch "$GENERATED_KT/LinuxEvdev_h.kt" >/dev/null; then
    echo "[gen] generated package must remain tracked: $GENERATED_KT" >&2
    exit 1
fi
if [[ -n "$(git -C "$REPO" ls-files --others --exclude-standard -- "$GENERATED_KT")" ]]; then
    echo "[gen] generated package contains untracked output: $GENERATED_KT" >&2
    exit 1
fi
if ! git -C "$REPO" diff --quiet -- "$GENERATED_KT"; then
    echo "[gen] generated Linux evdev sources differ from the tracked working tree" >&2
    git -C "$REPO" diff -- "$GENERATED_KT" >&2
    exit 1
fi

echo "[gen] generated sources:"
find "$GENERATED_KT" -name '*.kt' -print
