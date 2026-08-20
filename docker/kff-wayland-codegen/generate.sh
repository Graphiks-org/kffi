#!/usr/bin/env bash
# Run the kff-wayland generation pipeline inside the codegen container.
set -euo pipefail

JDK_HOME="${JDK_HOME:-/opt/java/openjdk}"
LLVM_HOME="${LLVM_HOME:-/usr/lib/llvm-18}"
REPO=/work
KEXTRACT_DIR="${KEXTRACT_DIR:-$REPO/third_party/kextract}"
PROTO=/usr/share/wayland-protocols/stable/xdg-shell/xdg-shell.xml
PROTO_DECO=/usr/share/wayland-protocols/unstable/xdg-decoration/xdg-decoration-unstable-v1.xml
GEN="$REPO/kff-wayland/build/wayland-xdg"
OUT_KT="$REPO/kff-wayland/src/jvmMain/kotlin"
STAGING_KT="$REPO/kff-wayland/build/wayland-generated"
GENERATED_KT="$OUT_KT/org/graphiks/kffi/wayland/generated"
INTERFACE_OUT="$STAGING_KT/org/graphiks/kffi/wayland/generated/XdgShellProtocolInterfaces.kt"

echo "[gen] llvm=$LLVM_HOME jdk=$JDK_HOME"

if [[ ! -x "$KEXTRACT_DIR/gradlew" ]]; then
    echo "[gen] kextract submodule is missing: $KEXTRACT_DIR" >&2
    echo "[gen] initialize it with: git submodule update --init --recursive" >&2
    exit 1
fi

rm -rf "$STAGING_KT"
mkdir -p "$GEN" "$STAGING_KT"

echo "[gen] building kextract"
(
    cd "$KEXTRACT_DIR"
    ./gradlew --no-daemon \
        -Pjdk_home="$JDK_HOME" \
        -Pllvm_home="$LLVM_HOME" \
        createKextractImage
)
KEXTRACT="$KEXTRACT_DIR/build/kextract/bin/kextract"
[[ -x "$KEXTRACT" ]]
"$KEXTRACT" --help >/dev/null 2>&1

echo "[gen] generating Wayland client headers"
wayland-scanner client-header "$PROTO" "$GEN/xdg-shell-client-protocol.h"
wayland-scanner client-header "$PROTO_DECO" "$GEN/xdg-decoration-client-protocol.h"

echo "[gen] generating Kotlin FFM bindings with kextract"
# -ffreestanding prevents bundled libclang from following glibc's
# `#include_next <stdint.h>` chain. The Wayland headers only require the
# compiler-provided sized integer, size_t, and va_list definitions here.
"$KEXTRACT" \
    -t org.graphiks.kffi.wayland.generated \
    -o "$STAGING_KT" \
    --include-struct wl_interface \
    --include-struct wl_message \
    -A -ffreestanding \
    -I "$GEN" \
    "$GEN/xdg-shell-client-protocol.h" \
    "$GEN/xdg-decoration-client-protocol.h"

echo "[gen] generating wl_interface descriptors from protocol XML"
java -cp /build ProtocolInterfaceGenerator \
    "$PROTO" "$PROTO_DECO" \
    "$INTERFACE_OUT"

rm -rf "$GENERATED_KT"
mkdir -p "$(dirname "$GENERATED_KT")"
mv "$STAGING_KT/org/graphiks/kffi/wayland/generated" "$GENERATED_KT"

echo "[gen] generated sources:"
find "$GENERATED_KT" -name '*.kt' -print
