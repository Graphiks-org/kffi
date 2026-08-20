#!/usr/bin/env bash
# Run the kffi-x11 generation pipeline inside the codegen container.
set -euo pipefail

JDK_HOME="${JDK_HOME:-/opt/java/openjdk}"
LLVM_HOME="${LLVM_HOME:-/usr/lib/llvm-18}"
REPO=/work
KEXTRACT_DIR="${KEXTRACT_DIR:-$REPO/third_party/kextract}"
REQUIRED_KEXTRACT_REVISION=9252fb417ea91dae882a6a9e9d06ab672c50adc3
OUT_KT="$REPO/kffi-x11/src/jvmMain/kotlin"
STAGING_KT="$REPO/kffi-x11/build/x11-generated"
GENERATED_KT="$OUT_KT/org/graphiks/kffi/x11/generated"

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

rm -rf "$STAGING_KT"
mkdir -p "$STAGING_KT"

echo "[gen] building kextract at $actual_kextract_revision"
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

functions=(
    XOpenDisplay XConnectionNumber XCloseDisplay XCreateSimpleWindow XSelectInput
    XDestroyWindow XFlush XPending XNextEvent XStoreName XInternAtom XSetWMProtocols
    XMapWindow XRaiseWindow XSendEvent XResizeWindow XMoveWindow XIconifyWindow
    XChangeProperty XDeleteProperty XGetWindowProperty XFree XGetGeometry
    XTranslateCoordinates XUnmapWindow XResourceManagerString XCreateFontCursor
    XDefineCursor XUndefineCursor XFreeCursor XCreateBitmapFromData XCreatePixmapCursor
    XFreePixmap XGrabPointer XUngrabPointer XQueryPointer XWarpPointer XGetWMHints
    XAllocWMHints XSetWMHints XChangeWindowAttributes XDestroyIC XFilterEvent
    XConvertSelection XDefaultScreen XDefaultRootWindow XDefaultVisual XDefaultDepth
    XGetImage XQueryTree XGetWindowAttributes XSync XRootWindow
    XShapeCombineRectangles XShmQueryExtension XShmCreateImage XShmAttach XShmDetach
    XShmGetImage XCompositeNameWindowPixmap XkbSetDetectableAutoRepeat XKeysymToKeycode
    XLookupKeysym XLookupString XGetKeyboardMapping XFreeStringList XQueryKeymap
    XSetICValues XCreateIC XSetICFocus XUnsetICFocus XOpenIM XCloseIM
)
constants=(
    KeyPress KeyRelease ButtonPress ButtonRelease MotionNotify EnterNotify LeaveNotify
    FocusIn FocusOut Expose VisibilityNotify ConfigureNotify ClientMessage DestroyNotify
    SelectionNotify KeyPressMask KeyReleaseMask ButtonPressMask ButtonReleaseMask
    PointerMotionMask VisibilityChangeMask FocusChangeMask EnterWindowMask LeaveWindowMask
    ExposureMask StructureNotifyMask SubstructureNotifyMask SubstructureRedirectMask
    CWOverrideRedirect CompositeRedirectAutomatic AnyPropertyType
)
typedefs=(
    Display XID Atom Window Cursor Pixmap Drawable Time Bool Status XRectangle XPoint
    XShmSegmentInfo
)
structs=(
    XRectangle XPoint XColor
)

args=(
    -t org.graphiks.kffi.x11.generated
    -o "$STAGING_KT"
    -l :libX11.so.6
    -l :libXext.so.6
    -l :libXcomposite.so.1
    --variadic-args XCreateIC:11
    --variadic-args XSetICValues:3
)
for function in "${functions[@]}"; do args+=(--include-function "$function"); done
for constant in "${constants[@]}"; do args+=(--include-constant "$constant"); done
for typedef in "${typedefs[@]}"; do args+=(--include-typedef "$typedef"); done
for struct in "${structs[@]}"; do args+=(--include-struct "$struct"); done

# These macro families are part of the X11 public API. Extract their concrete
# names from the installed headers so the inclusion list follows the headers.
while read -r constant; do args+=(--include-constant "$constant"); done < <(
    awk '/^#define[[:space:]]+XC_[[:alnum:]_]+/ { print $2 }' /usr/include/X11/cursorfont.h
)
while read -r constant; do args+=(--include-constant "$constant"); done < <(
    awk '/^#define[[:space:]]+XIM[[:alnum:]_]+/ { print $2 }' /usr/include/X11/Xlib.h
)

# The pinned kextract revision does not emit nested C records. Consequently
# `_XImage` (its `funcs` member) and `_XEvent` (XClientMessageEvent's anonymous
# union) cannot compile when generated from the stock Xlib header. X11 APIs
# that use them are still emitted with MemorySegment pointer parameters.
# It also does not insert C ABI padding between struct members, so the larger
# Xlib records with eight-byte members cannot instantiate valid layouts.
# XDestroyImage is masked by its Xutil.h macro, while Xlib_ZPixmap,
# Xlib_AllPlanes, XGetPropertyDelete, and XGetPropertyKeep are absent from the
# selected Ubuntu Noble headers; none can be emitted by this invocation.

echo "[gen] generating Kotlin FFM bindings with kextract"
"$KEXTRACT" "${args[@]}" \
    /usr/include/X11/Xlib.h \
    /usr/include/X11/Xutil.h \
    /usr/include/X11/Xresource.h \
    /usr/include/X11/XKBlib.h \
    /usr/include/X11/cursorfont.h \
    /usr/include/X11/extensions/XShm.h \
    /usr/include/X11/extensions/shape.h \
    /usr/include/X11/extensions/Xcomposite.h \
    /usr/include/X11/Xatom.h

rm -rf "$GENERATED_KT"
mkdir -p "$(dirname "$GENERATED_KT")"
mv "$STAGING_KT/org/graphiks/kffi/x11/generated" "$GENERATED_KT"

# kextract emits indentation-only blank lines. Normalize generated whitespace
# so regenerated sources pass Git's whitespace checks without altering bindings.
perl -0pi -e 's/[ \t]+$//mg; s/\n{2,}\z/\n/' "$GENERATED_KT"/*.kt

echo "[gen] generated sources:"
find "$GENERATED_KT" -name '*.kt' -print
