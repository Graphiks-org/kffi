#ifndef KFFI_X11_COMPAT_H
#define KFFI_X11_COMPAT_H

#include <stddef.h>
#include <X11/Xlib.h>
#include <X11/Xutil.h>
#include <X11/extensions/XShm.h>

/* Xutil exposes this as a function-like macro. kextract needs the real
 * function declaration in order to emit the pointer-based binding. */
#undef XDestroyImage
int XDestroyImage(XImage *);

/*
 * Xlib defines XEvent as a union with an `int type` discriminator and
 * `long pad[24]` storage. This named LP64-compatible storage union provides
 * that ABI buffer to kextract without traversing XEvent's non-generatable
 * nested Xlib records.
 */
typedef union KffiXEventStorage {
    int type;
    long pad[24];
} KffiXEventStorage;

/*
 * XShmSegmentInfo is LP64-aligned by the C compiler. Give kextract named
 * padding fields so it can emit a valid layout without handwritten Kotlin
 * offsets. Native XShm calls continue to accept the original opaque pointer.
 */
typedef struct XShmSegmentInfoCompat {
    long shmseg;
    int shmid;
    int padding_after_shmid;
    void *shmaddr;
    int readOnly;
    int padding_after_read_only;
} XShmSegmentInfoCompat;

/* kextract does not model the nested native Xlib records safely. Validate the
 * storage-only declarations here, where the native headers are authoritative. */
_Static_assert(sizeof(long) == 8, "Kffi X11 compatibility shims require LP64 long");
_Static_assert(sizeof(XEvent) == sizeof(KffiXEventStorage), "XEvent size mismatch");
_Static_assert(_Alignof(XEvent) == _Alignof(KffiXEventStorage), "XEvent alignment mismatch");
_Static_assert(
    sizeof(XShmSegmentInfo) == sizeof(XShmSegmentInfoCompat),
    "XShmSegmentInfo size mismatch"
);
_Static_assert(
    _Alignof(XShmSegmentInfo) == _Alignof(XShmSegmentInfoCompat),
    "XShmSegmentInfo alignment mismatch"
);
_Static_assert(
    offsetof(XShmSegmentInfo, shmseg) == offsetof(XShmSegmentInfoCompat, shmseg),
    "XShmSegmentInfo shmseg offset mismatch"
);
_Static_assert(
    offsetof(XShmSegmentInfo, shmid) == offsetof(XShmSegmentInfoCompat, shmid),
    "XShmSegmentInfo shmid offset mismatch"
);
_Static_assert(
    offsetof(XShmSegmentInfo, shmaddr) == offsetof(XShmSegmentInfoCompat, shmaddr),
    "XShmSegmentInfo shmaddr offset mismatch"
);
_Static_assert(
    offsetof(XShmSegmentInfo, readOnly) == offsetof(XShmSegmentInfoCompat, readOnly),
    "XShmSegmentInfo readOnly offset mismatch"
);

#endif
