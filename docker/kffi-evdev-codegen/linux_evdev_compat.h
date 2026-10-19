/* Curated entry header for the kffi-evdev generated bindings: the kernel
 * input uapi (identity, events, capabilities, force feedback, uinput) plus
 * libudev for node enumeration and hotplug notification. Only what the
 * managed layer consumes is exposed through the generator's include lists. */
#ifndef KFFI_EVDEV_COMPAT_H
#define KFFI_EVDEV_COMPAT_H

#define _GNU_SOURCE
#include <asm/ioctl.h>
#include <errno.h>
#include <fcntl.h>
#include <linux/input.h>
#include <linux/uinput.h>
#include <libudev.h>
#include <stdint.h>
#include <unistd.h>

/*
 * struct ff_effect carries an anonymous union of effect-specific arms that
 * kextract cannot traverse. This storage representation flattens the union
 * to ABI scalars after the x11 *Storage pattern: the rumble arm sits at the
 * union head (offset 16), and the remaining 28 bytes cover the largest arm
 * (ff_periodic_effect, 32 bytes, 8-aligned). The byte footprint matches
 * struct ff_effect exactly, so native EVIOCSFF/EVIOCRMFF calls accept it.
 */
typedef struct KffiFfEffectStorage {
    __u16 type;
    __s16 id;
    __u16 direction;
    struct ff_replay replay;
    struct ff_trigger trigger;
    __u8 pad_before_union[2];
    __u16 rumble_strong_magnitude;
    __u16 rumble_weak_magnitude;
    __u8 union_tail[28];
} KffiFfEffectStorage;

/*
 * struct uinput_ff_upload embeds two ff_effect values. Same storage pattern:
 * 8 + 48 + 48 = 104 bytes, the uapi footprint.
 */
typedef struct KffiFfUploadStorage {
    __u32 request_id;
    __s32 retval;
    struct KffiFfEffectStorage effect;
    struct KffiFfEffectStorage old;
} KffiFfUploadStorage;


/*
 * kextract surfaces #define macros, not enum constants. Surface the uinput
 * request codes (read back from the uinput fd as { type = EV_UINPUT,
 * code = UI_FF_UPLOAD/UI_FF_ERASE, value = request id }).
 */
#define KFFI_UI_FF_UPLOAD UI_FF_UPLOAD
#define KFFI_UI_FF_ERASE UI_FF_ERASE

#endif
