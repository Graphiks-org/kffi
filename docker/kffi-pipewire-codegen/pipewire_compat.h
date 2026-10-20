/* Curated entry header for the kffi-pipewire generated bindings: the
 * consumer-side stream surface (thread loop, context, fd connect, stream,
 * properties) plus the SPA buffer structs read from dequeued pw_buffers.
 * Only what the managed layer consumes is exposed through the generator's
 * include lists. */
#ifndef KFFI_PIPEWIRE_COMPAT_H
#define KFFI_PIPEWIRE_COMPAT_H

#define _GNU_SOURCE
#include <pipewire/pipewire.h>
#include <pipewire/core.h>
#include <pipewire/properties.h>
#include <pipewire/stream.h>
#include <pipewire/thread-loop.h>
#include <spa/buffer/buffer.h>
#include <spa/param/buffers-types.h>
#include <spa/param/format-types.h>
#include <spa/param/param.h>
#include <spa/param/video/raw.h>
#include <spa/pod/pod.h>
#include <spa/utils/type.h>

/*
 * kextract surfaces #define macros, not enum constants (evdev pattern):
 * re-export every enum value the managed layer consumes so the generated
 * surface follows the pinned headers instead of duplicating ABI values.
 * The pipewire context functions are variadic-free by design here —
 * pw_properties_new_string replaces the varargs pw_properties_new, and the
 * pw_core method macros (pw_core_sync/add_listener) are vtable dispatch,
 * not symbols: this binding drives negotiation purely through stream
 * state transitions, so no core listener is installed.
 */

/* enum pw_stream_state */
#define KFFI_PW_STREAM_STATE_ERROR PW_STREAM_STATE_ERROR
#define KFFI_PW_STREAM_STATE_UNCONNECTED PW_STREAM_STATE_UNCONNECTED
#define KFFI_PW_STREAM_STATE_CONNECTING PW_STREAM_STATE_CONNECTING
#define KFFI_PW_STREAM_STATE_PAUSED PW_STREAM_STATE_PAUSED
#define KFFI_PW_STREAM_STATE_STREAMING PW_STREAM_STATE_STREAMING

/* enum pw_direction */
#define KFFI_PW_DIRECTION_INPUT PW_DIRECTION_INPUT
#define KFFI_PW_DIRECTION_OUTPUT PW_DIRECTION_OUTPUT

/* enum pw_stream_flags */
#define KFFI_PW_STREAM_FLAG_NONE PW_STREAM_FLAG_NONE
#define KFFI_PW_STREAM_FLAG_AUTOCONNECT PW_STREAM_FLAG_AUTOCONNECT
#define KFFI_PW_STREAM_FLAG_INACTIVE PW_STREAM_FLAG_INACTIVE
#define KFFI_PW_STREAM_FLAG_MAP_BUFFERS PW_STREAM_FLAG_MAP_BUFFERS
#define KFFI_PW_STREAM_FLAG_NO_CONVERT PW_STREAM_FLAG_NO_CONVERT
#define KFFI_PW_STREAM_FLAG_DONT_RECONNECT PW_STREAM_FLAG_DONT_RECONNECT

#define KFFI_PW_ID_ANY PW_ID_ANY
#define KFFI_PW_VERSION_STREAM_EVENTS PW_VERSION_STREAM_EVENTS

/* enum spa_param_type */
#define KFFI_SPA_PARAM_INVALID SPA_PARAM_Invalid
#define KFFI_SPA_PARAM_ENUM_FORMAT SPA_PARAM_EnumFormat
#define KFFI_SPA_PARAM_FORMAT SPA_PARAM_Format
#define KFFI_SPA_PARAM_BUFFERS SPA_PARAM_Buffers

/* enum spa_param_buffers (buffer param property keys) */
#define KFFI_SPA_PARAM_BUFFERS_BUFFERS SPA_PARAM_BUFFERS_buffers
#define KFFI_SPA_PARAM_BUFFERS_BLOCKS SPA_PARAM_BUFFERS_blocks
#define KFFI_SPA_PARAM_BUFFERS_SIZE SPA_PARAM_BUFFERS_size
#define KFFI_SPA_PARAM_BUFFERS_STRIDE SPA_PARAM_BUFFERS_stride
#define KFFI_SPA_PARAM_BUFFERS_ALIGN SPA_PARAM_BUFFERS_align

/* enum spa_media_type / spa_media_subtype */
#define KFFI_SPA_MEDIA_TYPE_VIDEO SPA_MEDIA_TYPE_video
#define KFFI_SPA_MEDIA_SUBTYPE_RAW SPA_MEDIA_SUBTYPE_raw

/* enum spa_format / spa_format_video property keys */
#define KFFI_SPA_FORMAT_MEDIA_TYPE SPA_FORMAT_mediaType
#define KFFI_SPA_FORMAT_MEDIA_SUBTYPE SPA_FORMAT_mediaSubtype
#define KFFI_SPA_FORMAT_VIDEO_FORMAT SPA_FORMAT_VIDEO_format
#define KFFI_SPA_FORMAT_VIDEO_SIZE SPA_FORMAT_VIDEO_size
#define KFFI_SPA_FORMAT_VIDEO_FRAMERATE SPA_FORMAT_VIDEO_framerate
#define KFFI_SPA_FORMAT_VIDEO_MAX_FRAMERATE SPA_FORMAT_VIDEO_maxFramerate

/* enum spa_video_format — the portable subset this binding delivers */
#define KFFI_SPA_VIDEO_FORMAT_UNKNOWN SPA_VIDEO_FORMAT_UNKNOWN
#define KFFI_SPA_VIDEO_FORMAT_I420 SPA_VIDEO_FORMAT_I420
#define KFFI_SPA_VIDEO_FORMAT_NV12 SPA_VIDEO_FORMAT_NV12
#define KFFI_SPA_VIDEO_FORMAT_BGRX SPA_VIDEO_FORMAT_BGRx
#define KFFI_SPA_VIDEO_FORMAT_RGBA SPA_VIDEO_FORMAT_RGBA
#define KFFI_SPA_VIDEO_FORMAT_BGRA SPA_VIDEO_FORMAT_BGRA

/* enum spa_data_type */
#define KFFI_SPA_DATA_INVALID SPA_DATA_Invalid
#define KFFI_SPA_DATA_MEMFD SPA_DATA_MemFd
#define KFFI_SPA_DATA_MEMPTR SPA_DATA_MemPtr
#define KFFI_SPA_DATA_DMABUF SPA_DATA_DmaBuf

/* enum spa_type — POD primitive type ids read/written by the managed codec */
#define KFFI_SPA_TYPE_NONE SPA_TYPE_None
#define KFFI_SPA_TYPE_BOOL SPA_TYPE_Bool
#define KFFI_SPA_TYPE_ID SPA_TYPE_Id
#define KFFI_SPA_TYPE_INT SPA_TYPE_Int
#define KFFI_SPA_TYPE_LONG SPA_TYPE_Long
#define KFFI_SPA_TYPE_FLOAT SPA_TYPE_Float
#define KFFI_SPA_TYPE_DOUBLE SPA_TYPE_Double
#define KFFI_SPA_TYPE_STRING SPA_TYPE_String
#define KFFI_SPA_TYPE_BYTES SPA_TYPE_Bytes
#define KFFI_SPA_TYPE_RECTANGLE SPA_TYPE_Rectangle
#define KFFI_SPA_TYPE_FRACTION SPA_TYPE_Fraction
#define KFFI_SPA_TYPE_BITMAP SPA_TYPE_Bitmap
#define KFFI_SPA_TYPE_ARRAY SPA_TYPE_Array
#define KFFI_SPA_TYPE_STRUCT SPA_TYPE_Struct
#define KFFI_SPA_TYPE_OBJECT SPA_TYPE_Object
#define KFFI_SPA_TYPE_POINTER SPA_TYPE_Pointer
#define KFFI_SPA_TYPE_FD SPA_TYPE_Fd
#define KFFI_SPA_TYPE_CHOICE SPA_TYPE_Choice

/* SPA_TYPE_OBJECT_* container ids used by EnumFormat/Format/Buffers pods */
#define KFFI_SPA_TYPE_OBJECT_FORMAT SPA_TYPE_OBJECT_Format
#define KFFI_SPA_TYPE_OBJECT_PARAM_BUFFERS SPA_TYPE_OBJECT_ParamBuffers

/* enum spa_choice_type */
#define KFFI_SPA_CHOICE_NONE SPA_CHOICE_None
#define KFFI_SPA_CHOICE_RANGE SPA_CHOICE_Range
#define KFFI_SPA_CHOICE_STEP SPA_CHOICE_Step
#define KFFI_SPA_CHOICE_ENUM SPA_CHOICE_Enum
#define KFFI_SPA_CHOICE_FLAGS SPA_CHOICE_Flags

#endif
