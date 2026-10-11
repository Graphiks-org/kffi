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
typedef union XEventStorage {
    int type;
    long pad[24];
} XEventStorage;

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
typedef struct XErrorEventStorage {
    int type;
    int padding_after_type;
    void *display;
    unsigned long resourceid;
    unsigned long serial;
    unsigned char error_code;
    unsigned char request_code;
    unsigned char minor_code;
    unsigned char padding0;
    unsigned char padding1;
    unsigned char padding2;
    unsigned char padding3;
    unsigned char padding4;
} XErrorEventStorage;

typedef struct XImageStorage {
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
} XImageStorage;

typedef struct XWindowAttributesStorage {
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
} XWindowAttributesStorage;

typedef struct XClientMessageEventStorage {
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
} XClientMessageEventStorage;

typedef struct XSelectionEventStorage {
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
} XSelectionEventStorage;

typedef struct XSetWindowAttributesStorage {
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
} XSetWindowAttributesStorage;

typedef struct XIMCallbackStorage {
    void *client_data;
    void *callback;
} XIMCallbackStorage;

typedef struct XIMTextStorage {
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
} XIMTextStorage;

typedef struct XIMPreeditStateNotifyCallbackStructStorage {
    unsigned long state;
} XIMPreeditStateNotifyCallbackStructStorage;

typedef struct XIMPreeditDrawCallbackStructStorage {
    int caret;
    int chg_first;
    int chg_length;
    int padding_before_text;
    void *text;
} XIMPreeditDrawCallbackStructStorage;

/* Validate the storage-only declarations here, where the native headers are
 * authoritative. These assertions run in the pinned Linux codegen image. */
_Static_assert(sizeof(long) == 8, "Kffi X11 compatibility shims require LP64 long");
_Static_assert(sizeof(XEvent) == sizeof(XEventStorage), "XEvent size mismatch");
_Static_assert(_Alignof(XEvent) == _Alignof(XEventStorage), "XEvent alignment mismatch");
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

_Static_assert(sizeof(XErrorEvent) == sizeof(XErrorEventStorage), "XErrorEvent size mismatch");
_Static_assert(_Alignof(XErrorEvent) == _Alignof(XErrorEventStorage), "XErrorEvent alignment mismatch");
#define KFFI_CHECK_ERROR_EVENT_FIELD(field) \
    _Static_assert(offsetof(XErrorEvent, field) == offsetof(XErrorEventStorage, field), \
                   "XErrorEvent " #field " offset mismatch")
KFFI_CHECK_ERROR_EVENT_FIELD(type);
KFFI_CHECK_ERROR_EVENT_FIELD(display);
KFFI_CHECK_ERROR_EVENT_FIELD(resourceid);
KFFI_CHECK_ERROR_EVENT_FIELD(serial);
KFFI_CHECK_ERROR_EVENT_FIELD(error_code);
KFFI_CHECK_ERROR_EVENT_FIELD(request_code);
KFFI_CHECK_ERROR_EVENT_FIELD(minor_code);
#undef KFFI_CHECK_ERROR_EVENT_FIELD

_Static_assert(sizeof(XImage) == sizeof(XImageStorage), "XImage size mismatch");
_Static_assert(_Alignof(XImage) == _Alignof(XImageStorage), "XImage alignment mismatch");
_Static_assert(offsetof(XImage, data) == offsetof(XImageStorage, data), "XImage data offset mismatch");
_Static_assert(
    offsetof(XImage, bytes_per_line) == offsetof(XImageStorage, bytes_per_line),
    "XImage bytes_per_line offset mismatch"
);
_Static_assert(
    offsetof(XImage, bits_per_pixel) == offsetof(XImageStorage, bits_per_pixel),
    "XImage bits_per_pixel offset mismatch"
);
_Static_assert(offsetof(XImage, f) == offsetof(XImageStorage, create_image), "XImage function table offset mismatch");

_Static_assert(
    sizeof(XWindowAttributes) == sizeof(XWindowAttributesStorage),
    "XWindowAttributes size mismatch"
);
_Static_assert(
    _Alignof(XWindowAttributes) == _Alignof(XWindowAttributesStorage),
    "XWindowAttributes alignment mismatch"
);
_Static_assert(
    offsetof(XWindowAttributes, map_state) == offsetof(XWindowAttributesStorage, map_state),
    "XWindowAttributes map_state offset mismatch"
);
_Static_assert(
    offsetof(XWindowAttributes, override_redirect) == offsetof(XWindowAttributesStorage, override_redirect),
    "XWindowAttributes override_redirect offset mismatch"
);

_Static_assert(
    sizeof(XClientMessageEvent) == sizeof(XClientMessageEventStorage),
    "XClientMessageEvent size mismatch"
);
_Static_assert(
    _Alignof(XClientMessageEvent) == _Alignof(XClientMessageEventStorage),
    "XClientMessageEvent alignment mismatch"
);
_Static_assert(
    offsetof(XClientMessageEvent, window) == offsetof(XClientMessageEventStorage, window),
    "XClientMessageEvent window offset mismatch"
);
_Static_assert(
    offsetof(XClientMessageEvent, data) == offsetof(XClientMessageEventStorage, data_l0),
    "XClientMessageEvent data offset mismatch"
);
_Static_assert(
    sizeof(((XClientMessageEvent *)0)->data) ==
        sizeof(XClientMessageEventStorage) - offsetof(XClientMessageEventStorage, data_l0),
    "XClientMessageEvent data size mismatch"
);

_Static_assert(
    sizeof(XSelectionEvent) == sizeof(XSelectionEventStorage),
    "XSelectionEvent size mismatch"
);
_Static_assert(
    _Alignof(XSelectionEvent) == _Alignof(XSelectionEventStorage),
    "XSelectionEvent alignment mismatch"
);
_Static_assert(
    offsetof(XSelectionEvent, requestor) == offsetof(XSelectionEventStorage, requestor),
    "XSelectionEvent requestor offset mismatch"
);

_Static_assert(
    sizeof(XSetWindowAttributes) == sizeof(XSetWindowAttributesStorage),
    "XSetWindowAttributes size mismatch"
);
_Static_assert(
    _Alignof(XSetWindowAttributes) == _Alignof(XSetWindowAttributesStorage),
    "XSetWindowAttributes alignment mismatch"
);
_Static_assert(
    offsetof(XSetWindowAttributes, override_redirect) ==
        offsetof(XSetWindowAttributesStorage, override_redirect),
    "XSetWindowAttributes override_redirect offset mismatch"
);

_Static_assert(sizeof(XIMCallback) == sizeof(XIMCallbackStorage), "XIMCallback size mismatch");
_Static_assert(_Alignof(XIMCallback) == _Alignof(XIMCallbackStorage), "XIMCallback alignment mismatch");
_Static_assert(
    offsetof(XIMCallback, client_data) == offsetof(XIMCallbackStorage, client_data),
    "XIMCallback client_data offset mismatch"
);
_Static_assert(
    offsetof(XIMCallback, callback) == offsetof(XIMCallbackStorage, callback),
    "XIMCallback callback offset mismatch"
);

_Static_assert(sizeof(XIMText) == sizeof(XIMTextStorage), "XIMText size mismatch");
_Static_assert(_Alignof(XIMText) == _Alignof(XIMTextStorage), "XIMText alignment mismatch");
_Static_assert(
    offsetof(XIMText, feedback) == offsetof(XIMTextStorage, feedback),
    "XIMText feedback offset mismatch"
);
_Static_assert(
    offsetof(XIMText, encoding_is_wchar) == offsetof(XIMTextStorage, encoding_is_wchar),
    "XIMText encoding_is_wchar offset mismatch"
);
_Static_assert(
    offsetof(XIMText, string) == offsetof(XIMTextStorage, string_ptr),
    "XIMText string offset mismatch"
);

_Static_assert(
    sizeof(XIMPreeditStateNotifyCallbackStruct) ==
        sizeof(XIMPreeditStateNotifyCallbackStructStorage),
    "XIMPreeditStateNotifyCallbackStruct size mismatch"
);
_Static_assert(
    offsetof(XIMPreeditStateNotifyCallbackStruct, state) ==
        offsetof(XIMPreeditStateNotifyCallbackStructStorage, state),
    "XIMPreeditStateNotifyCallbackStruct state offset mismatch"
);

_Static_assert(
    sizeof(XIMPreeditDrawCallbackStruct) == sizeof(XIMPreeditDrawCallbackStructStorage),
    "XIMPreeditDrawCallbackStruct size mismatch"
);
_Static_assert(
    _Alignof(XIMPreeditDrawCallbackStruct) == _Alignof(XIMPreeditDrawCallbackStructStorage),
    "XIMPreeditDrawCallbackStruct alignment mismatch"
);
_Static_assert(
    offsetof(XIMPreeditDrawCallbackStruct, text) ==
        offsetof(XIMPreeditDrawCallbackStructStorage, text),
    "XIMPreeditDrawCallbackStruct text offset mismatch"
);

#endif
