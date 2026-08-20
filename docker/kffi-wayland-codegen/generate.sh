#!/usr/bin/env bash
# Run the kffi-wayland generation pipeline inside the codegen container.
set -euo pipefail

JDK_HOME="${JDK_HOME:-/opt/java/openjdk}"
LLVM_HOME="${LLVM_HOME:-/usr/lib/llvm-18}"
REPO=/work
KEXTRACT_DIR="${KEXTRACT_DIR:-$REPO/third_party/kextract}"
WAYLAND_PROTOCOLS_DIR="${WAYLAND_PROTOCOLS_DIR:-$REPO/third_party/wayland-protocols}"
PROTOCOLS="$REPO/docker/kffi-wayland-codegen/protocols"
GEN="$REPO/kffi-wayland/build/wayland-protocols"
OUT_KT="$REPO/kffi-wayland/src/jvmMain/kotlin"
STAGING_KT="$REPO/kffi-wayland/build/wayland-generated"
GENERATED_KT="$OUT_KT/org/graphiks/kffi/wayland/generated"
CONSTANTS_OUT="$STAGING_KT/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt"
INTERFACE_OUT="$STAGING_KT/org/graphiks/kffi/wayland/generated/WaylandProtocolInterfaces.kt"
PROTOCOL_SPECS=(
    "$WAYLAND_PROTOCOLS_DIR/stable/xdg-shell/xdg-shell.xml|xdg-shell-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/unstable/xdg-decoration/xdg-decoration-unstable-v1.xml|xdg-decoration-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/unstable/text-input/text-input-unstable-v3.xml|text-input-client-protocol.h"
    "$PROTOCOLS/wlr-screencopy-unstable-v1.xml|wlr-screencopy-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/staging/xdg-activation/xdg-activation-v1.xml|xdg-activation-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/unstable/pointer-constraints/pointer-constraints-unstable-v1.xml|pointer-constraints-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/unstable/relative-pointer/relative-pointer-unstable-v1.xml|relative-pointer-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/staging/xdg-toplevel-icon/xdg-toplevel-icon-v1.xml|xdg-toplevel-icon-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/staging/fractional-scale/fractional-scale-v1.xml|fractional-scale-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/stable/viewporter/viewporter.xml|viewporter-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/stable/presentation-time/presentation-time.xml|presentation-time-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/stable/linux-dmabuf/linux-dmabuf-v1.xml|linux-dmabuf-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/staging/cursor-shape/cursor-shape-v1.xml|cursor-shape-client-protocol.h"
    "$WAYLAND_PROTOCOLS_DIR/stable/tablet/tablet-v2.xml|tablet-client-protocol.h"
)
XML_INPUTS=()
HEADER_INPUTS=()

echo "[gen] llvm=$LLVM_HOME jdk=$JDK_HOME"

if [[ ! -x "$KEXTRACT_DIR/gradlew" ]]; then
    echo "[gen] kextract submodule is missing: $KEXTRACT_DIR" >&2
    echo "[gen] initialize it with: git submodule update --init --recursive" >&2
    exit 1
fi
for spec in "${PROTOCOL_SPECS[@]}"; do
    IFS='|' read -r xml header <<< "$spec"
    if [[ ! -f "$xml" ]]; then
        echo "[gen] protocol XML is missing: $xml" >&2
        exit 1
    fi
    XML_INPUTS+=("$xml")
    HEADER_INPUTS+=("$GEN/$header")
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
for spec in "${PROTOCOL_SPECS[@]}"; do
    IFS='|' read -r xml header <<< "$spec"
    wayland-scanner client-header "$xml" "$GEN/$header"
done

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
    "${HEADER_INPUTS[@]}"

echo "[gen] generating wl_interface descriptors from protocol XML"
java -cp /build ProtocolInterfaceGenerator \
    "${XML_INPUTS[@]}" \
    "$INTERFACE_OUT" "$CONSTANTS_OUT"

rm -rf "$GENERATED_KT"
rm -f "$OUT_KT/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt"
mkdir -p "$(dirname "$GENERATED_KT")"
mv "$STAGING_KT/org/graphiks/kffi/wayland/generated" "$GENERATED_KT"
mv "$CONSTANTS_OUT" "$OUT_KT/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt"

echo "[gen] generated sources:"
find "$GENERATED_KT" -name '*.kt' -print
echo "$OUT_KT/org/graphiks/kffi/wayland/WaylandProtocolConstants.kt"
