#ifndef KFFI_X11_CONSTANTS_H
#define KFFI_X11_CONSTANTS_H

/* Xlib.h defines KeyPress as 2. Keep this pure macro isolated from Xlib's
 * typedef graph so kextract can generate a callable test constant without
 * initializing the native-library lookup used by function bindings. */
#define KeyPress 2

#endif
