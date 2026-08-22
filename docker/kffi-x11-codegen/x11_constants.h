#ifndef KFFI_X11_CONSTANTS_H
#define KFFI_X11_CONSTANTS_H

/* Keep these pure macros isolated from Xlib's typedef graph so kextract can
 * generate callable numeric constants without expanding every transitive
 * Xlib declaration into this isolated output. */
#define KeyPress 2
#define ZPixmap 2
#define AllPlanes ((unsigned long)~0L)
#define XSHM_ZPIXMAP 2
#define IsViewable 2

#endif
