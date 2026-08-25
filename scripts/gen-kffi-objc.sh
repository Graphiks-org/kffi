#!/usr/bin/env bash
# Regenerate the Objective-C bindings for the supported Apple SDK frameworks
# through kextract on macOS.
set -euo pipefail

MODE="generate"
case "${1:-}" in
    "") ;;
    --check) MODE="check" ;;
    *)
        echo "usage: $0 [--check]" >&2
        exit 2
        ;;
esac

if [[ "$(uname -s)" != "Darwin" ]]; then
    echo "error: Objective-C binding generation requires macOS and Xcode" >&2
    exit 1
fi

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
KEXTRACT="${KEXTRACT:-$REPO_ROOT/third_party/kextract/build/kextract/bin/kextract}"
LLVM_HOME="${LLVM_HOME:-}"

if [[ ! -x "$KEXTRACT" ]]; then
    if [[ -z "$LLVM_HOME" || ! -d "$LLVM_HOME" ]]; then
        echo "error: kextract is missing and LLVM_HOME is not configured" >&2
        echo "hint: set LLVM_HOME to the LLVM installation used to build kextract" >&2
        exit 1
    fi
    (
        cd "$REPO_ROOT/third_party/kextract"
        ./gradlew createKextractImage -Pllvm_home="$LLVM_HOME" --no-daemon --console=plain
    )
fi

if [[ ! -x "$KEXTRACT" ]]; then
    echo "error: kextract build did not produce executable '$KEXTRACT'" >&2
    exit 1
fi

SDK="${SDKROOT:-$(xcrun --sdk macosx --show-sdk-path)}"
if [[ ! -d "$SDK" ]]; then
    echo "error: macOS SDK does not exist: $SDK" >&2
    echo "hint: set SDKROOT or DEVELOPER_DIR to select the intended Xcode SDK" >&2
    exit 1
fi

STAGING="$REPO_ROOT/kffi-objc/build/objc-generated"
OUTPUT="$REPO_ROOT/kffi-objc/src/jvmMain/kotlin"
HEADER="$REPO_ROOT/kffi-objc/generation/ObjCSubset.h"
GENERATED_PACKAGE="$STAGING/org/graphiks/kffi/objc"
OUTPUT_PACKAGE="$OUTPUT/org/graphiks/kffi/objc"
PRESERVED_PACKAGE_PATHS=(managed)

FRAMEWORKS=(
    Foundation CoreFoundation AppKit CoreGraphics
    QuartzCore CoreImage Metal AVFoundation
    GameController ModelIO SceneKit
    UniformTypeIdentifiers PDFKit QuickLook
)
INCLUDE_FRAMEWORK_ARGS=()
for framework in "${FRAMEWORKS[@]}"; do
    INCLUDE_FRAMEWORK_ARGS+=(--include-framework "$framework")
done

rm -rf -- "$STAGING"
mkdir -p "$STAGING"

"$KEXTRACT" \
    --objc \
    --split-output \
    "${INCLUDE_FRAMEWORK_ARGS[@]}" \
    --output "$STAGING" \
    --target-package org.graphiks.kffi.objc \
    --clang-arg "-F$SDK/System/Library/Frameworks" \
    --clang-arg -isysroot \
    --clang-arg "$SDK" \
    "$HEADER"

if [[ ! -d "$GENERATED_PACKAGE" ]]; then
    echo "error: kextract produced no Objective-C package at $GENERATED_PACKAGE" >&2
    exit 1
fi

# kextract currently indents empty lines and emits an extra blank line at EOF;
# keep generated sources clean for repository whitespace checks without
# changing their semantic contents.
if ! command -v perl >/dev/null 2>&1; then
    echo "error: Perl is required to normalize kextract output" >&2
    exit 1
fi
while IFS= read -r -d '' generated_file; do
    perl -0pi -e 's/[ \t]+$//mg; s/\n+\z/\n/' "$generated_file"
done < <(rg --files -0 "$GENERATED_PACKAGE")

# The public Objective-C package also contains handwritten runtime helpers.
# Merge those paths into the staging tree before checking or replacing the
# generated package so regeneration never deletes them.
for preserved_path in "${PRESERVED_PACKAGE_PATHS[@]}"; do
    source_path="$OUTPUT_PACKAGE/$preserved_path"
    target_path="$GENERATED_PACKAGE/$preserved_path"
    if [[ ! -e "$source_path" ]]; then
        echo "error: preserved Objective-C source path is missing: $source_path" >&2
        exit 1
    fi
    if [[ -e "$target_path" ]]; then
        echo "error: generated Objective-C bindings conflict with preserved path: $target_path" >&2
        exit 1
    fi
    cp -R -- "$source_path" "$target_path"
done

if [[ "$MODE" == "check" ]]; then
    if [[ ! -d "$OUTPUT_PACKAGE" ]]; then
        echo "error: checked-in Objective-C bindings are missing at $OUTPUT_PACKAGE" >&2
        exit 1
    fi
    if ! diff -ru -- "$OUTPUT_PACKAGE" "$GENERATED_PACKAGE"; then
        echo "error: checked-in Objective-C bindings are out of date" >&2
        echo "hint: run scripts/gen-kffi-objc.sh with the same Xcode SDK and LLVM toolchain to update them" >&2
        exit 1
    fi
    echo "Checked-in Objective-C bindings are up to date"
    exit 0
fi

rm -rf -- "$OUTPUT_PACKAGE"
mkdir -p "$(dirname "$OUTPUT_PACKAGE")"
mv "$GENERATED_PACKAGE" "$OUTPUT_PACKAGE"

echo "Generated Objective-C bindings under $OUTPUT_PACKAGE"
