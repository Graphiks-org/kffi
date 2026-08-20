#!/usr/bin/env bash
# Run the kffi-wayland generation pipeline inside the codegen container.
set -euo pipefail

JDK_HOME="${JDK_HOME:-/opt/java/openjdk}"
LLVM_HOME="${LLVM_HOME:-/usr/lib/llvm-18}"
REPO=/work
KEXTRACT_DIR="${KEXTRACT_DIR:-$REPO/third_party/kextract}"
WAYLAND_PROTOCOLS_DIR="${WAYLAND_PROTOCOLS_DIR:-$REPO/third_party/wayland-protocols}"
PROTOCOLS="$REPO/docker/kffi-wayland-codegen/protocols"
PROTO="$WAYLAND_PROTOCOLS_DIR/stable/xdg-shell/xdg-shell.xml"
PROTO_DECO="$WAYLAND_PROTOCOLS_DIR/unstable/xdg-decoration/xdg-decoration-unstable-v1.xml"
PROTO_TEXT="$WAYLAND_PROTOCOLS_DIR/unstable/text-input/text-input-unstable-v3.xml"
PROTO_SCREENCOPY="$PROTOCOLS/wlr-screencopy-unstable-v1.xml"
GEN="$REPO/kffi-wayland/build/wayland-protocols"
OUT_KT="$REPO/kffi-wayland/src/jvmMain/kotlin"
STAGING_KT="$REPO/kffi-wayland/build/wayland-generated"
GENERATED_KT="$OUT_KT/org/graphiks/kffi/wayland/generated"
CONSTANTS_OUT="$STAGING_KT/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt"
INTERFACE_OUT="$STAGING_KT/org/graphiks/kffi/wayland/generated/WaylandProtocolInterfaces.kt"

echo "[gen] llvm=$LLVM_HOME jdk=$JDK_HOME"

if [[ ! -x "$KEXTRACT_DIR/gradlew" ]]; then
    echo "[gen] kextract submodule is missing: $KEXTRACT_DIR" >&2
    echo "[gen] initialize it with: git submodule update --init --recursive" >&2
    exit 1
fi
for protocol in "$PROTO" "$PROTO_DECO" "$PROTO_TEXT" "$PROTO_SCREENCOPY"; do
    if [[ ! -f "$protocol" ]]; then
        echo "[gen] protocol XML is missing: $protocol" >&2
        exit 1
    fi
done

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
wayland-scanner client-header "$PROTO_TEXT" "$GEN/text-input-client-protocol.h"
wayland-scanner client-header "$PROTO_SCREENCOPY" "$GEN/wlr-screencopy-client-protocol.h"

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
    "$GEN/xdg-decoration-client-protocol.h" \
    "$GEN/text-input-client-protocol.h" \
    "$GEN/wlr-screencopy-client-protocol.h"

echo "[gen] generating wl_interface descriptors from protocol XML"
java -cp /build ProtocolInterfaceGenerator \
    "$PROTO" "$PROTO_DECO" "$PROTO_TEXT" "$PROTO_SCREENCOPY" \
    "$INTERFACE_OUT" "$CONSTANTS_OUT"

rm -rf "$GENERATED_KT"
rm -f "$OUT_KT/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt"
mkdir -p "$(dirname "$GENERATED_KT")"
mv "$STAGING_KT/org/graphiks/kffi/wayland/generated" "$GENERATED_KT"
mv "$CONSTANTS_OUT" "$OUT_KT/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt"

echo "[gen] generated sources:"
find "$GENERATED_KT" -name '*.kt' -print
echo "$OUT_KT/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt"
