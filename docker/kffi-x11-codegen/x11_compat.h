#ifndef KFFI_X11_COMPAT_H
#define KFFI_X11_COMPAT_H

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

#endif
