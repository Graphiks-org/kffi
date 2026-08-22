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

/*
 * Storage-only representations for Xlib records whose native definitions
 * contain nested records, anonymous unions, or function pointers. Their
 * fields deliberately use ABI-sized scalar/pointer types so kextract can emit
 * safe Kotlin layouts and accessors without trying to generate nested Xlib
 * implementation details.
 */
typedef struct KffiXImageStorage {
    int width;
    int height;
    int xoffset;
    int format;
    void *data;
    int byte_order;
    int bitmap_unit;
    int bitmap_bit_order;
    int bitmap_pad;
    int depth;
    int bytes_per_line;
    int bits_per_pixel;
    int padding_before_masks;
    unsigned long red_mask;
    unsigned long green_mask;
    unsigned long blue_mask;
    void *obdata;
    void *create_image;
    void *destroy_image;
    void *get_pixel;
    void *put_pixel;
    void *sub_image;
    void *add_pixel;
} KffiXImageStorage;

typedef struct KffiXWindowAttributesStorage {
    int x;
    int y;
    int width;
    int height;
    int border_width;
    int depth;
    void *visual;
    unsigned long root;
    int c_class;
    int bit_gravity;
    int win_gravity;
    int backing_store;
    unsigned long backing_planes;
    unsigned long backing_pixel;
    int save_under;
    int padding_after_save_under;
    unsigned long colormap;
    int map_installed;
    int map_state;
    long all_event_masks;
    long your_event_mask;
    long do_not_propagate_mask;
    int override_redirect;
    int padding_after_override_redirect;
    void *screen;
} KffiXWindowAttributesStorage;

typedef struct KffiXClientMessageEventStorage {
    int type;
    int padding_after_type;
    unsigned long serial;
    int send_event;
    int padding_after_send_event;
    void *display;
    unsigned long window;
    unsigned long message_type;
    int format;
    int padding_before_data;
    long data_l0;
    long data_l1;
    long data_l2;
    long data_l3;
    long data_l4;
} KffiXClientMessageEventStorage;

typedef struct KffiXSelectionEventStorage {
    int type;
    int padding_after_type;
    unsigned long serial;
    int send_event;
    int padding_after_send_event;
    void *display;
    unsigned long requestor;
    unsigned long selection;
    unsigned long target;
    unsigned long property;
    unsigned long time;
} KffiXSelectionEventStorage;

typedef struct KffiXSetWindowAttributesStorage {
    unsigned long background_pixmap;
    unsigned long background_pixel;
    unsigned long border_pixmap;
    unsigned long border_pixel;
    int bit_gravity;
    int win_gravity;
    int backing_store;
    int padding_after_backing_store;
    unsigned long backing_planes;
    unsigned long backing_pixel;
    int save_under;
    int padding_after_save_under;
    long event_mask;
    long do_not_propagate_mask;
    int override_redirect;
    int padding_after_override_redirect;
    unsigned long colormap;
    unsigned long cursor;
} KffiXSetWindowAttributesStorage;

typedef struct KffiXIMCallbackStorage {
    void *client_data;
    void *callback;
} KffiXIMCallbackStorage;

typedef struct KffiXIMTextStorage {
    unsigned short length;
    char padding_after_length_0;
    char padding_after_length_1;
    char padding_after_length_2;
    char padding_after_length_3;
    char padding_after_length_4;
    char padding_after_length_5;
    void *feedback;
    int encoding_is_wchar;
    int padding_before_string;
    void *string_ptr;
} KffiXIMTextStorage;

typedef struct KffiXIMPreeditStateNotifyCallbackStructStorage {
    unsigned long state;
} KffiXIMPreeditStateNotifyCallbackStructStorage;

typedef struct KffiXIMPreeditDrawCallbackStructStorage {
    int caret;
    int chg_first;
    int chg_length;
    int padding_before_text;
    void *text;
} KffiXIMPreeditDrawCallbackStructStorage;

/* Validate the storage-only declarations here, where the native headers are
 * authoritative. These assertions run in the pinned Linux codegen image. */
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

_Static_assert(sizeof(XImage) == sizeof(KffiXImageStorage), "XImage size mismatch");
_Static_assert(_Alignof(XImage) == _Alignof(KffiXImageStorage), "XImage alignment mismatch");
_Static_assert(offsetof(XImage, data) == offsetof(KffiXImageStorage, data), "XImage data offset mismatch");
_Static_assert(
    offsetof(XImage, bytes_per_line) == offsetof(KffiXImageStorage, bytes_per_line),
    "XImage bytes_per_line offset mismatch"
);
_Static_assert(
    offsetof(XImage, bits_per_pixel) == offsetof(KffiXImageStorage, bits_per_pixel),
    "XImage bits_per_pixel offset mismatch"
);
_Static_assert(offsetof(XImage, f) == offsetof(KffiXImageStorage, create_image), "XImage function table offset mismatch");

_Static_assert(
    sizeof(XWindowAttributes) == sizeof(KffiXWindowAttributesStorage),
    "XWindowAttributes size mismatch"
);
_Static_assert(
    _Alignof(XWindowAttributes) == _Alignof(KffiXWindowAttributesStorage),
    "XWindowAttributes alignment mismatch"
);
_Static_assert(
    offsetof(XWindowAttributes, map_state) == offsetof(KffiXWindowAttributesStorage, map_state),
    "XWindowAttributes map_state offset mismatch"
);
_Static_assert(
    offsetof(XWindowAttributes, override_redirect) == offsetof(KffiXWindowAttributesStorage, override_redirect),
    "XWindowAttributes override_redirect offset mismatch"
);

_Static_assert(
    sizeof(XClientMessageEvent) == sizeof(KffiXClientMessageEventStorage),
    "XClientMessageEvent size mismatch"
);
_Static_assert(
    _Alignof(XClientMessageEvent) == _Alignof(KffiXClientMessageEventStorage),
    "XClientMessageEvent alignment mismatch"
);
_Static_assert(
    offsetof(XClientMessageEvent, window) == offsetof(KffiXClientMessageEventStorage, window),
    "XClientMessageEvent window offset mismatch"
);
_Static_assert(
    offsetof(XClientMessageEvent, data) == offsetof(KffiXClientMessageEventStorage, data_l0),
    "XClientMessageEvent data offset mismatch"
);
_Static_assert(
    sizeof(((XClientMessageEvent *)0)->data) ==
        sizeof(KffiXClientMessageEventStorage) - offsetof(KffiXClientMessageEventStorage, data_l0),
    "XClientMessageEvent data size mismatch"
);

_Static_assert(
    sizeof(XSelectionEvent) == sizeof(KffiXSelectionEventStorage),
    "XSelectionEvent size mismatch"
);
_Static_assert(
    _Alignof(XSelectionEvent) == _Alignof(KffiXSelectionEventStorage),
    "XSelectionEvent alignment mismatch"
);
_Static_assert(
    offsetof(XSelectionEvent, requestor) == offsetof(KffiXSelectionEventStorage, requestor),
    "XSelectionEvent requestor offset mismatch"
);

_Static_assert(
    sizeof(XSetWindowAttributes) == sizeof(KffiXSetWindowAttributesStorage),
    "XSetWindowAttributes size mismatch"
);
_Static_assert(
    _Alignof(XSetWindowAttributes) == _Alignof(KffiXSetWindowAttributesStorage),
    "XSetWindowAttributes alignment mismatch"
);
_Static_assert(
    offsetof(XSetWindowAttributes, override_redirect) ==
        offsetof(KffiXSetWindowAttributesStorage, override_redirect),
    "XSetWindowAttributes override_redirect offset mismatch"
);

_Static_assert(sizeof(XIMCallback) == sizeof(KffiXIMCallbackStorage), "XIMCallback size mismatch");
_Static_assert(_Alignof(XIMCallback) == _Alignof(KffiXIMCallbackStorage), "XIMCallback alignment mismatch");
_Static_assert(
    offsetof(XIMCallback, client_data) == offsetof(KffiXIMCallbackStorage, client_data),
    "XIMCallback client_data offset mismatch"
);
_Static_assert(
    offsetof(XIMCallback, callback) == offsetof(KffiXIMCallbackStorage, callback),
    "XIMCallback callback offset mismatch"
);

_Static_assert(sizeof(XIMText) == sizeof(KffiXIMTextStorage), "XIMText size mismatch");
_Static_assert(_Alignof(XIMText) == _Alignof(KffiXIMTextStorage), "XIMText alignment mismatch");
_Static_assert(
    offsetof(XIMText, feedback) == offsetof(KffiXIMTextStorage, feedback),
    "XIMText feedback offset mismatch"
);
_Static_assert(
    offsetof(XIMText, encoding_is_wchar) == offsetof(KffiXIMTextStorage, encoding_is_wchar),
    "XIMText encoding_is_wchar offset mismatch"
);
_Static_assert(
    offsetof(XIMText, string) == offsetof(KffiXIMTextStorage, string_ptr),
    "XIMText string offset mismatch"
);

_Static_assert(
    sizeof(XIMPreeditStateNotifyCallbackStruct) ==
        sizeof(KffiXIMPreeditStateNotifyCallbackStructStorage),
    "XIMPreeditStateNotifyCallbackStruct size mismatch"
);
_Static_assert(
    offsetof(XIMPreeditStateNotifyCallbackStruct, state) ==
        offsetof(KffiXIMPreeditStateNotifyCallbackStructStorage, state),
    "XIMPreeditStateNotifyCallbackStruct state offset mismatch"
);

_Static_assert(
    sizeof(XIMPreeditDrawCallbackStruct) == sizeof(KffiXIMPreeditDrawCallbackStructStorage),
    "XIMPreeditDrawCallbackStruct size mismatch"
);
_Static_assert(
    _Alignof(XIMPreeditDrawCallbackStruct) == _Alignof(KffiXIMPreeditDrawCallbackStructStorage),
    "XIMPreeditDrawCallbackStruct alignment mismatch"
);
_Static_assert(
    offsetof(XIMPreeditDrawCallbackStruct, text) ==
        offsetof(KffiXIMPreeditDrawCallbackStructStorage, text),
    "XIMPreeditDrawCallbackStruct text offset mismatch"
);

#endif
