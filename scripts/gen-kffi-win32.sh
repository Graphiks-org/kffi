#!/usr/bin/env bash
# Regenerate the kffi Win32 bindings through kextract.
#
# This script is intended for Git Bash on Windows. The generated bindings use
# the Windows SDK and kextract's --win32 ABI model, so generation is not
# supported on macOS or Linux.
#
# Usage:
#   scripts/gen-kffi-win32.sh
#   scripts/gen-kffi-win32.sh --check
set -euo pipefail

MODE="generate"
KEXTRACT_REVISION="dd2ad491af3db1b6dc084ef1bf3362379de1d336"
WINDOWS_SDK_VERSION="10.0.28000.0"

usage() {
    cat <<'EOF'
Usage: scripts/gen-kffi-win32.sh [--check]

Regenerates the checked-in Win32 FFM bindings with kextract.

Options:
  --check  Generate into a staging directory and compare with checked-in files
  --help   Show this help
EOF
}

while (($# > 0)); do
    case "$1" in
        --check)
            MODE="check"
            ;;
        --help|-h)
            usage
            exit 0
            ;;
        *)
            echo "error: unknown option '$1'" >&2
            usage >&2
            exit 2
            ;;
    esac
    shift
done

case "$(uname -s)" in
    MINGW*|MSYS*|CYGWIN*) ;;
    *)
        echo "error: Win32 binding generation requires Git Bash on Windows" >&2
        exit 1
        ;;
esac

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
KEXTRACT_DIR="$REPO_ROOT/third_party/kextract"

if [[ ! -e "$KEXTRACT_DIR/.git" ]]; then
    echo "error: kextract submodule is not initialized" >&2
    echo "hint: run 'git submodule update --init --recursive'" >&2
    exit 1
fi

ACTUAL_KEXTRACT_REVISION="$(git -C "$KEXTRACT_DIR" rev-parse HEAD)"
if [[ "$ACTUAL_KEXTRACT_REVISION" != "$KEXTRACT_REVISION" ]]; then
    echo "error: kextract revision mismatch" >&2
    echo "  expected: $KEXTRACT_REVISION" >&2
    echo "  actual:   $ACTUAL_KEXTRACT_REVISION" >&2
    exit 1
fi

if [[ -n "$(git -C "$KEXTRACT_DIR" status --porcelain)" ]]; then
    echo "error: kextract submodule has local changes" >&2
    echo "hint: restore the submodule to revision $KEXTRACT_REVISION" >&2
    exit 1
fi

if [[ ! -f "$KEXTRACT_DIR/gradlew" ]]; then
    echo "error: kextract Gradle wrapper is missing" >&2
    echo "hint: run 'git submodule update --init --recursive'" >&2
    exit 1
fi

echo "→ Preparing pinned kextract distribution"
(
    cd "$KEXTRACT_DIR"
    bash gradlew createKextractImage --no-daemon --console=plain
)

KEXTRACT_HOME="$KEXTRACT_DIR/build/kextract"
JAVA="$KEXTRACT_HOME/runtime/bin/java"
if [[ ! -x "$JAVA" && -x "$JAVA.exe" ]]; then
    JAVA="$JAVA.exe"
fi
LIBS_DIR="$KEXTRACT_HOME/lib"

if [[ ! -x "$JAVA" || ! -d "$LIBS_DIR" ]]; then
    echo "error: kextract build did not produce '$KEXTRACT_HOME'" >&2
    exit 1
fi

shopt -s nullglob
JARS=("$LIBS_DIR"/*.jar)
if ((${#JARS[@]} == 0)); then
    echo "error: no kextract runtime jars found under '$LIBS_DIR'" >&2
    exit 1
fi

windows_path() {
    if command -v cygpath >/dev/null 2>&1; then
        cygpath -m "$1"
    else
        printf '%s\n' "$1"
    fi
}

CLASSPATH=""
for jar in "${JARS[@]}"; do
    jar="$(windows_path "$jar")"
    if [[ -n "$CLASSPATH" ]]; then
        CLASSPATH="$CLASSPATH;$jar"
    else
        CLASSPATH="$jar"
    fi
done

NATIVE_PATH="$(windows_path "$LIBS_DIR")"
if [[ -n "${SYSTEMROOT:-}" ]]; then
    SYSTEM32="$SYSTEMROOT/System32"
    SYSTEM32="$(windows_path "$SYSTEM32")"
    NATIVE_PATH="$NATIVE_PATH;$SYSTEM32"
fi

# Reproducible committed output uses one exact Windows SDK version. Search only
# the two standard Windows Kits roots and require the complete include triplet.
WINDOWS_SDK_INCLUDE=""
for base in \
    "C:/Program Files (x86)/Windows Kits/10/Include" \
    "C:/Program Files/Windows Kits/10/Include"; do
    candidate="$base/$WINDOWS_SDK_VERSION"
    if [[ -d "$candidate/um" && -d "$candidate/shared" && -d "$candidate/ucrt" ]]; then
        WINDOWS_SDK_INCLUDE="$candidate"
        break
    fi
done

if [[ -z "$WINDOWS_SDK_INCLUDE" ]]; then
    echo "error: Windows SDK $WINDOWS_SDK_VERSION with um, shared and ucrt headers was not found" >&2
    echo "hint: install Windows SDK $WINDOWS_SDK_VERSION under a standard Windows Kits root" >&2
    exit 1
fi

SDK_ARGS=(
    -A "-isystem" -A "$WINDOWS_SDK_INCLUDE/um"
    -A "-isystem" -A "$WINDOWS_SDK_INCLUDE/shared"
    -A "-isystem" -A "$WINDOWS_SDK_INCLUDE/ucrt"
)

DLLS=(user32 kernel32 gdi32 dwmapi)
GENERATION_DIR="$REPO_ROOT/kffi-win32/generation"
STAGING="$REPO_ROOT/kffi-win32/build/generated"
OUTPUT_PACKAGE="$REPO_ROOT/kffi-win32/src/jvmMain/kotlin/org/graphiks/kffi/win32/generated"
GENERATED_PACKAGE="$STAGING/org/graphiks/kffi/win32/generated"
PACKAGE="org.graphiks.kffi.win32.generated"
TMP_ROOT="${TMPDIR:-/tmp}/kffi-win32-generation-$$"
COMBINED_YAML="$TMP_ROOT/combined_win32.yaml"
TMP_HEADER="$TMP_ROOT/win32_all.h"

mkdir -p "$TMP_ROOT"
trap 'rm -rf -- "$TMP_ROOT"' EXIT
rm -rf -- "$STAGING"
mkdir -p "$STAGING"

ALL_FUNCTIONS=()
for dll in "${DLLS[@]}"; do
    yaml="$GENERATION_DIR/${dll}.yaml"
    if [[ ! -f "$yaml" ]]; then
        echo "error: missing generation input '$yaml'" >&2
        exit 1
    fi
    while IFS= read -r function; do
        ALL_FUNCTIONS+=("$function")
    done < <(sed -n '/^    functions:/,/^    structs:/{
        /^    functions:/d
        /^    structs:/d
        /^      - /{s/^      - //; p}
    }' "$yaml")
done

printf 'dllMap:\n' > "$COMBINED_YAML"
for dll in "${DLLS[@]}"; do
    awk '/^  "/{found=1} found' "$GENERATION_DIR/${dll}.yaml" >> "$COMBINED_YAML"
done

cat > "$TMP_HEADER" <<'EOF'
#define WIN32_LEAN_AND_MEAN
#define NOMINMAX
#include <windows.h>
#include <dwmapi.h>
EOF

echo "→ Regenerating ${#ALL_FUNCTIONS[@]} Win32 functions"
echo "  SDK arguments: ${#SDK_ARGS[@]}"
echo "  Output: $STAGING"

KEXTRACT_ARGS=(
    --win32 --init-method --dll-map "$COMBINED_YAML" --verbose
    -o "$STAGING" -t "$PACKAGE"
)
for function in "${ALL_FUNCTIONS[@]}"; do
    KEXTRACT_ARGS+=(--include-function "$function")
done
KEXTRACT_ARGS+=(
    "${SDK_ARGS[@]}"
    -A "-target"
    -A "x86_64-pc-windows-msvc"
    -A "-fshort-wchar"
    "$TMP_HEADER"
)

"$JAVA" --enable-native-access=ALL-UNNAMED \
    "-Djava.library.path=$NATIVE_PATH" \
    -cp "$CLASSPATH" \
    org.graphiks.kextract.pipeline.KextractTool \
    "${KEXTRACT_ARGS[@]}"

if [[ ! -d "$GENERATED_PACKAGE" ]]; then
    echo "error: kextract produced no package at '$GENERATED_PACKAGE'" >&2
    exit 1
fi

normalize_kotlin_blank_lines() {
    find "$1" -type f -name '*.kt' -exec \
        sed -i -e '/^[[:blank:]]*$/s/[[:blank:]]//g' -e '${/^$/d;}' {} +
}

normalize_kotlin_blank_lines "$GENERATED_PACKAGE"

for function in "${ALL_FUNCTIONS[@]}"; do
    if ! grep -R -E -q --include='*.kt' \
        "^[[:space:]]*fun[[:space:]]+${function}[[:space:]]*\\(" \
        "$GENERATED_PACKAGE"; then
        echo "error: generated bindings are missing function '$function'" >&2
        exit 1
    fi
done

if [[ "$MODE" == "check" ]]; then
    if [[ ! -d "$OUTPUT_PACKAGE" ]]; then
        echo "error: checked-in Win32 bindings are missing at '$OUTPUT_PACKAGE'" >&2
        exit 1
    fi
    if ! diff -ru -- "$OUTPUT_PACKAGE" "$GENERATED_PACKAGE"; then
        echo "error: checked-in Win32 bindings are out of date" >&2
        echo "hint: run scripts/gen-kffi-win32.sh to update them" >&2
        exit 1
    fi
    echo "Checked-in Win32 bindings are up to date"
    exit 0
fi

rm -rf -- "$OUTPUT_PACKAGE"
mkdir -p "$(dirname "$OUTPUT_PACKAGE")"
mv "$GENERATED_PACKAGE" "$OUTPUT_PACKAGE"
echo "Generated Win32 bindings under $OUTPUT_PACKAGE"
