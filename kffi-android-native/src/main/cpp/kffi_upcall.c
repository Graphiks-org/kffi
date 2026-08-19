/*
 * kffi_upcall.c — Android upcall engine over libffi closures.
 *
 * Each executable trampoline owns a parsed callback ABI, a persistent ffi_cif,
 * and the recursive ffi_type graph borrowed by libffi. The final pointer
 * argument is reserved for routing userdata and is moved to the first JNI
 * dispatcher parameter.
 */

#include <ffi.h>
#include <jni.h>
#include <limits.h>
#include <pthread.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>

#include "kffi_upcall.h"

#define KFFI_UPCALL_SLOTS 256
#define KFFI_UPCALL_MAX_TYPE_DEPTH 32

_Static_assert(sizeof(size_t) == 8,
               "kffi Android upcalls require a 64-bit size_t");
_Static_assert(sizeof(uintptr_t) == 8,
               "kffi Android upcalls require a 64-bit uintptr_t");
_Static_assert(sizeof(jlong) == 8,
               "kffi Android upcalls require a 64-bit jlong");
_Static_assert(sizeof(jbyte) == sizeof(uint8_t) &&
               sizeof(jshort) == sizeof(uint16_t) &&
               sizeof(jint) == sizeof(uint32_t),
               "kffi JNI integer carriers have unexpected widths");

typedef enum {
    UPCALL_I8,
    UPCALL_U8,
    UPCALL_I16,
    UPCALL_U16,
    UPCALL_I32,
    UPCALL_U32,
    UPCALL_I64,
    UPCALL_U64,
    UPCALL_FLOAT,
    UPCALL_DOUBLE,
    UPCALL_PTR,
    UPCALL_SIZE_T,
    UPCALL_UINTPTR,
    UPCALL_STRUCT,
    UPCALL_VOID,
} upcall_kind;

typedef struct upcall_allocation {
    void *pointer;
    struct upcall_allocation *next;
} upcall_allocation;

typedef struct {
    int in_use;
    void *closure;
    void *fnptr;
    ffi_cif cif;
    ffi_type **arg_types;
    upcall_kind *arg_kinds;
    size_t argc;
    ffi_type *return_type;
    upcall_kind return_kind;
    char *jni_arg_carriers;
    size_t jni_argc;
    char jni_return_carrier;
    int has_routing_userdata;
    upcall_allocation *allocations;
    jclass cls;
    jmethodID method;
} upcall_slot;

typedef enum {
    PARSE_OK,
    PARSE_INVALID,
    PARSE_OOM,
} parse_status;

typedef struct {
    ffi_type **types;
    upcall_kind *kinds;
    size_t count;
    size_t capacity;
} parsed_type_vector;

typedef struct {
    const char *cursor;
    upcall_slot *slot;
    parse_status status;
    unsigned int depth;
} abi_parser;

typedef union {
    jbyte b;
    jshort s;
    jint i;
    jlong j;
    jfloat f;
    jdouble d;
} upcall_jni_result;

static upcall_slot g_slots[KFFI_UPCALL_SLOTS];
static JavaVM *g_vm;

/* The callback fast path deliberately does not take this mutex. Callers must
 * establish quiescence before freeTrampoline; the lock only serializes slot
 * allocation and teardown. */
static pthread_mutex_t g_slots_mutex;

void kffi_upcall_init(JavaVM *vm) {
    g_vm = vm;
    pthread_mutex_init(&g_slots_mutex, NULL);
}

static void throw_new(JNIEnv *env, const char *class_name, const char *message) {
    if ((*env)->ExceptionCheck(env)) return;
    jclass exception_class = (*env)->FindClass(env, class_name);
    if (exception_class == NULL) return;
    (*env)->ThrowNew(env, exception_class, message);
    (*env)->DeleteLocalRef(env, exception_class);
}

static void *slot_calloc(upcall_slot *slot, size_t count, size_t size) {
    if (count == 0 || size == 0 || count > SIZE_MAX / size) return NULL;
    upcall_allocation *allocation = malloc(sizeof(*allocation));
    if (allocation == NULL) return NULL;
    allocation->pointer = calloc(count, size);
    if (allocation->pointer == NULL) {
        free(allocation);
        return NULL;
    }
    allocation->next = slot->allocations;
    slot->allocations = allocation;
    return allocation->pointer;
}

static void slot_free_allocations(upcall_slot *slot) {
    upcall_allocation *allocation = slot->allocations;
    while (allocation != NULL) {
        upcall_allocation *next = allocation->next;
        free(allocation->pointer);
        free(allocation);
        allocation = next;
    }
    slot->allocations = NULL;
}

static void slot_teardown_locked(JNIEnv *env, upcall_slot *slot) {
    if (slot->closure != NULL) ffi_closure_free(slot->closure);
    if (slot->cls != NULL) (*env)->DeleteGlobalRef(env, slot->cls);
    slot_free_allocations(slot);
    memset(slot, 0, sizeof(*slot));
}

static void slot_release(JNIEnv *env, upcall_slot *slot) {
    if (slot == NULL) return;
    pthread_mutex_lock(&g_slots_mutex);
    slot_teardown_locked(env, slot);
    pthread_mutex_unlock(&g_slots_mutex);
}

static upcall_slot *slot_reserve(void) {
    upcall_slot *slot = NULL;
    pthread_mutex_lock(&g_slots_mutex);
    for (size_t i = 0; i < KFFI_UPCALL_SLOTS; i++) {
        if (!g_slots[i].in_use) {
            slot = &g_slots[i];
            memset(slot, 0, sizeof(*slot));
            slot->in_use = 1;
            break;
        }
    }
    pthread_mutex_unlock(&g_slots_mutex);
    return slot;
}

static int vector_append(parsed_type_vector *vector, ffi_type *type,
                         upcall_kind kind, int keep_kinds) {
    if (vector->count == vector->capacity) {
        size_t new_capacity = vector->capacity == 0 ? 8 : vector->capacity * 2;
        if (new_capacity < vector->capacity ||
            new_capacity > SIZE_MAX / sizeof(*vector->types)) {
            return 0;
        }
        ffi_type **new_types = realloc(vector->types,
                                      new_capacity * sizeof(*new_types));
        if (new_types == NULL) return 0;
        vector->types = new_types;
        if (keep_kinds) {
            if (new_capacity > SIZE_MAX / sizeof(*vector->kinds)) return 0;
            upcall_kind *new_kinds = realloc(
                vector->kinds, new_capacity * sizeof(*new_kinds));
            if (new_kinds == NULL) return 0;
            vector->kinds = new_kinds;
        }
        vector->capacity = new_capacity;
    }
    vector->types[vector->count] = type;
    if (keep_kinds) vector->kinds[vector->count] = kind;
    vector->count++;
    return 1;
}

static int parser_consume(abi_parser *parser, const char *token) {
    size_t length = strlen(token);
    if (strncmp(parser->cursor, token, length) != 0) return 0;
    parser->cursor += length;
    return 1;
}

static int parse_abi_type(abi_parser *parser, int allow_void,
                          ffi_type **type, upcall_kind *kind) {
    if (parser_consume(parser, "struct(")) {
        if (parser->depth >= KFFI_UPCALL_MAX_TYPE_DEPTH ||
            *parser->cursor == ')') {
            parser->status = PARSE_INVALID;
            return 0;
        }
        parser->depth++;
        parsed_type_vector fields = {0};
        for (;;) {
            ffi_type *field_type = NULL;
            upcall_kind field_kind;
            if (!parse_abi_type(parser, 0, &field_type, &field_kind) ||
                !vector_append(&fields, field_type, field_kind, 0)) {
                if (parser->status == PARSE_OK) parser->status = PARSE_OOM;
                free(fields.types);
                parser->depth--;
                return 0;
            }
            if (*parser->cursor == ')') {
                parser->cursor++;
                break;
            }
            if (*parser->cursor != ',') {
                parser->status = PARSE_INVALID;
                free(fields.types);
                parser->depth--;
                return 0;
            }
            parser->cursor++;
        }
        ffi_type *struct_type = slot_calloc(parser->slot, 1,
                                            sizeof(*struct_type));
        ffi_type **elements = slot_calloc(parser->slot, fields.count + 1,
                                          sizeof(*elements));
        if (struct_type == NULL || elements == NULL) {
            parser->status = PARSE_OOM;
            free(fields.types);
            parser->depth--;
            return 0;
        }
        memcpy(elements, fields.types, fields.count * sizeof(*elements));
        struct_type->type = FFI_TYPE_STRUCT;
        struct_type->elements = elements;
        free(fields.types);
        parser->depth--;
        *type = struct_type;
        *kind = UPCALL_STRUCT;
        return 1;
    }

    if (parser_consume(parser, "size_t")) {
        *type = &ffi_type_uint64;
        *kind = UPCALL_SIZE_T;
    } else if (parser_consume(parser, "uintptr_t")) {
        *type = &ffi_type_uint64;
        *kind = UPCALL_UINTPTR;
    } else if (parser_consume(parser, "float") ||
               parser_consume(parser, "f32")) {
        *type = &ffi_type_float;
        *kind = UPCALL_FLOAT;
    } else if (parser_consume(parser, "double") ||
               parser_consume(parser, "f64")) {
        *type = &ffi_type_double;
        *kind = UPCALL_DOUBLE;
    } else if (parser_consume(parser, "ptr") ||
               parser_consume(parser, "p")) {
        *type = &ffi_type_pointer;
        *kind = UPCALL_PTR;
    } else if (parser_consume(parser, "i8")) {
        *type = &ffi_type_sint8;
        *kind = UPCALL_I8;
    } else if (parser_consume(parser, "u8")) {
        *type = &ffi_type_uint8;
        *kind = UPCALL_U8;
    } else if (parser_consume(parser, "i16")) {
        *type = &ffi_type_sint16;
        *kind = UPCALL_I16;
    } else if (parser_consume(parser, "u16")) {
        *type = &ffi_type_uint16;
        *kind = UPCALL_U16;
    } else if (parser_consume(parser, "i32")) {
        *type = &ffi_type_sint32;
        *kind = UPCALL_I32;
    } else if (parser_consume(parser, "u32")) {
        *type = &ffi_type_uint32;
        *kind = UPCALL_U32;
    } else if (parser_consume(parser, "i64")) {
        *type = &ffi_type_sint64;
        *kind = UPCALL_I64;
    } else if (parser_consume(parser, "u64")) {
        *type = &ffi_type_uint64;
        *kind = UPCALL_U64;
    } else if (allow_void && parser_consume(parser, "v")) {
        *type = &ffi_type_void;
        *kind = UPCALL_VOID;
    } else {
        parser->status = PARSE_INVALID;
        return 0;
    }
    return 1;
}

static parse_status parse_abi_signature(upcall_slot *slot,
                                        const char *signature) {
    abi_parser parser = {
        .cursor = signature,
        .slot = slot,
        .status = PARSE_OK,
    };
    ffi_type *return_type = NULL;
    upcall_kind return_kind;
    if (!parse_abi_type(&parser, 1, &return_type, &return_kind)) {
        return parser.status;
    }
    if (return_kind == UPCALL_STRUCT || *parser.cursor != '(') {
        return PARSE_INVALID;
    }
    parser.cursor++;

    parsed_type_vector arguments = {0};
    if (*parser.cursor != ')') {
        for (;;) {
            ffi_type *argument_type = NULL;
            upcall_kind argument_kind;
            if (!parse_abi_type(&parser, 0, &argument_type, &argument_kind) ||
                !vector_append(&arguments, argument_type, argument_kind, 1)) {
                if (parser.status == PARSE_OK) parser.status = PARSE_OOM;
                free(arguments.types);
                free(arguments.kinds);
                return parser.status;
            }
            if (*parser.cursor == ')') break;
            if (*parser.cursor != ',') {
                free(arguments.types);
                free(arguments.kinds);
                return PARSE_INVALID;
            }
            parser.cursor++;
        }
    }
    parser.cursor++;
    if (*parser.cursor != '\0' || arguments.count > UINT_MAX) {
        free(arguments.types);
        free(arguments.kinds);
        return PARSE_INVALID;
    }

    if (arguments.count > 0) {
        slot->arg_types = slot_calloc(slot, arguments.count,
                                      sizeof(*slot->arg_types));
        slot->arg_kinds = slot_calloc(slot, arguments.count,
                                      sizeof(*slot->arg_kinds));
        if (slot->arg_types == NULL || slot->arg_kinds == NULL) {
            free(arguments.types);
            free(arguments.kinds);
            return PARSE_OOM;
        }
        memcpy(slot->arg_types, arguments.types,
               arguments.count * sizeof(*slot->arg_types));
        memcpy(slot->arg_kinds, arguments.kinds,
               arguments.count * sizeof(*slot->arg_kinds));
    }
    slot->argc = arguments.count;
    slot->return_type = return_type;
    slot->return_kind = return_kind;
    slot->has_routing_userdata =
        arguments.count > 0 &&
        arguments.kinds[arguments.count - 1] == UPCALL_PTR;
    free(arguments.types);
    free(arguments.kinds);
    return PARSE_OK;
}

static int is_jni_argument_carrier(char carrier) {
    return carrier == 'B' || carrier == 'S' || carrier == 'I' ||
           carrier == 'J' || carrier == 'F' || carrier == 'D';
}

static char kind_carrier(upcall_kind kind) {
    switch (kind) {
        case UPCALL_I8:
        case UPCALL_U8:
            return 'B';
        case UPCALL_I16:
        case UPCALL_U16:
            return 'S';
        case UPCALL_I32:
        case UPCALL_U32:
            return 'I';
        case UPCALL_I64:
        case UPCALL_U64:
        case UPCALL_PTR:
        case UPCALL_SIZE_T:
        case UPCALL_UINTPTR:
        case UPCALL_STRUCT:
            return 'J';
        case UPCALL_FLOAT:
            return 'F';
        case UPCALL_DOUBLE:
            return 'D';
        case UPCALL_VOID:
            return 'V';
    }
    return '\0';
}

static parse_status parse_and_validate_jni_signature(upcall_slot *slot,
                                                      const char *signature) {
    const char *cursor = signature;
    if (*cursor != '(') return PARSE_INVALID;
    cursor++;
    size_t maximum_count = strlen(cursor);
    char *carriers = slot_calloc(slot, maximum_count + 1, sizeof(*carriers));
    if (carriers == NULL) return PARSE_OOM;

    size_t count = 0;
    while (*cursor != ')' && *cursor != '\0') {
        if (!is_jni_argument_carrier(*cursor)) return PARSE_INVALID;
        carriers[count++] = *cursor++;
    }
    if (*cursor != ')') return PARSE_INVALID;
    cursor++;
    if (*cursor == '\0') return PARSE_INVALID;
    char return_carrier = *cursor++;
    if (!(is_jni_argument_carrier(return_carrier) || return_carrier == 'V') ||
        *cursor != '\0' || count != slot->argc ||
        return_carrier != kind_carrier(slot->return_kind)) {
        return PARSE_INVALID;
    }

    if (slot->has_routing_userdata) {
        if (count == 0 || carriers[0] != 'J') return PARSE_INVALID;
        for (size_t i = 0; i + 1 < slot->argc; i++) {
            if (carriers[i + 1] != kind_carrier(slot->arg_kinds[i])) {
                return PARSE_INVALID;
            }
        }
    } else {
        for (size_t i = 0; i < slot->argc; i++) {
            if (carriers[i] != kind_carrier(slot->arg_kinds[i])) {
                return PARSE_INVALID;
            }
        }
    }

    slot->jni_arg_carriers = carriers;
    slot->jni_argc = count;
    slot->jni_return_carrier = return_carrier;
    return PARSE_OK;
}

static JNIEnv *acquire_env(int *attached) {
    JNIEnv *env = NULL;
    *attached = 0;
    if (g_vm == NULL) return NULL;
    if ((*g_vm)->GetEnv(g_vm, (void **)&env, JNI_VERSION_1_6) != JNI_OK) {
        if ((*g_vm)->AttachCurrentThread(g_vm, &env, NULL) != JNI_OK) return NULL;
        *attached = 1;
    }
    return env;
}

static void release_env(int attached) {
    if (attached) (*g_vm)->DetachCurrentThread(g_vm);
}

static void zero_return_value(const upcall_slot *slot, void *resp) {
    if (resp == NULL) return;
    switch (slot->return_kind) {
        case UPCALL_I8:
        case UPCALL_U8:
            *(uint8_t *)resp = 0;
            break;
        case UPCALL_I16:
        case UPCALL_U16:
            *(uint16_t *)resp = 0;
            break;
        case UPCALL_I32:
        case UPCALL_U32:
            *(uint32_t *)resp = 0;
            break;
        case UPCALL_I64:
        case UPCALL_U64:
            *(uint64_t *)resp = 0;
            break;
        case UPCALL_FLOAT:
            *(float *)resp = 0.0f;
            break;
        case UPCALL_DOUBLE:
            *(double *)resp = 0.0;
            break;
        case UPCALL_PTR:
            *(void **)resp = NULL;
            break;
        case UPCALL_SIZE_T:
            *(size_t *)resp = 0;
            break;
        case UPCALL_UINTPTR:
            *(uintptr_t *)resp = 0;
            break;
        case UPCALL_STRUCT:
        case UPCALL_VOID:
            break;
    }
}

static void marshal_argument(jvalue *destination, upcall_kind kind,
                             void *argument) {
    switch (kind) {
        case UPCALL_I8:
            destination->b = (jbyte)*(int8_t *)argument;
            break;
        case UPCALL_U8:
            memcpy(&destination->b, argument, sizeof(destination->b));
            break;
        case UPCALL_I16:
            destination->s = (jshort)*(int16_t *)argument;
            break;
        case UPCALL_U16:
            memcpy(&destination->s, argument, sizeof(destination->s));
            break;
        case UPCALL_I32:
            destination->i = (jint)*(int32_t *)argument;
            break;
        case UPCALL_U32:
            memcpy(&destination->i, argument, sizeof(destination->i));
            break;
        case UPCALL_I64:
            destination->j = (jlong)*(int64_t *)argument;
            break;
        case UPCALL_U64:
            memcpy(&destination->j, argument, sizeof(destination->j));
            break;
        case UPCALL_FLOAT:
            destination->f = (jfloat)*(float *)argument;
            break;
        case UPCALL_DOUBLE:
            destination->d = (jdouble)*(double *)argument;
            break;
        case UPCALL_PTR:
            {
                uintptr_t pointer = (uintptr_t)*(void **)argument;
                memcpy(&destination->j, &pointer, sizeof(destination->j));
            }
            break;
        case UPCALL_SIZE_T:
            memcpy(&destination->j, argument, sizeof(destination->j));
            break;
        case UPCALL_UINTPTR:
            memcpy(&destination->j, argument, sizeof(destination->j));
            break;
        case UPCALL_STRUCT:
            destination->j = (jlong)(uintptr_t)argument;
            break;
        case UPCALL_VOID:
            break;
    }
}

static upcall_jni_result invoke_dispatcher(JNIEnv *env, const upcall_slot *slot,
                                           const jvalue *arguments) {
    upcall_jni_result result = {0};
    switch (slot->return_kind) {
        case UPCALL_VOID:
            (*env)->CallStaticVoidMethodA(env, slot->cls, slot->method, arguments);
            break;
        case UPCALL_I8:
        case UPCALL_U8:
            result.b = (*env)->CallStaticByteMethodA(
                env, slot->cls, slot->method, arguments);
            break;
        case UPCALL_I16:
        case UPCALL_U16:
            result.s = (*env)->CallStaticShortMethodA(
                env, slot->cls, slot->method, arguments);
            break;
        case UPCALL_I32:
        case UPCALL_U32:
            result.i = (*env)->CallStaticIntMethodA(
                env, slot->cls, slot->method, arguments);
            break;
        case UPCALL_I64:
        case UPCALL_U64:
        case UPCALL_PTR:
        case UPCALL_SIZE_T:
        case UPCALL_UINTPTR:
            result.j = (*env)->CallStaticLongMethodA(
                env, slot->cls, slot->method, arguments);
            break;
        case UPCALL_FLOAT:
            result.f = (*env)->CallStaticFloatMethodA(
                env, slot->cls, slot->method, arguments);
            break;
        case UPCALL_DOUBLE:
            result.d = (*env)->CallStaticDoubleMethodA(
                env, slot->cls, slot->method, arguments);
            break;
        case UPCALL_STRUCT:
            break;
    }
    return result;
}

static void store_return_value(const upcall_slot *slot, void *resp,
                               upcall_jni_result result) {
    if (resp == NULL) return;
    switch (slot->return_kind) {
        case UPCALL_I8:
            *(int8_t *)resp = (int8_t)result.b;
            break;
        case UPCALL_U8:
            memcpy(resp, &result.b, sizeof(result.b));
            break;
        case UPCALL_I16:
            *(int16_t *)resp = (int16_t)result.s;
            break;
        case UPCALL_U16:
            memcpy(resp, &result.s, sizeof(result.s));
            break;
        case UPCALL_I32:
            *(int32_t *)resp = (int32_t)result.i;
            break;
        case UPCALL_U32:
            memcpy(resp, &result.i, sizeof(result.i));
            break;
        case UPCALL_I64:
            *(int64_t *)resp = (int64_t)result.j;
            break;
        case UPCALL_U64:
            memcpy(resp, &result.j, sizeof(result.j));
            break;
        case UPCALL_FLOAT:
            *(float *)resp = (float)result.f;
            break;
        case UPCALL_DOUBLE:
            *(double *)resp = (double)result.d;
            break;
        case UPCALL_PTR:
            {
                uintptr_t pointer;
                memcpy(&pointer, &result.j, sizeof(pointer));
                *(void **)resp = (void *)pointer;
            }
            break;
        case UPCALL_SIZE_T:
            memcpy(resp, &result.j, sizeof(result.j));
            break;
        case UPCALL_UINTPTR:
            memcpy(resp, &result.j, sizeof(result.j));
            break;
        case UPCALL_STRUCT:
        case UPCALL_VOID:
            break;
    }
}

static void describe_and_clear_exception(JNIEnv *env) {
    if (!(*env)->ExceptionCheck(env)) return;
    (*env)->ExceptionDescribe(env);
    (*env)->ExceptionClear(env);
}

static void kffi_upcall_closure(ffi_cif *cif, void *resp, void **args,
                                void *user_data) {
    (void)cif;
    upcall_slot *slot = (upcall_slot *)user_data;
    if (slot == NULL || !slot->in_use) return;
    zero_return_value(slot, resp);

    int attached = 0;
    JNIEnv *env = acquire_env(&attached);
    if (env == NULL) return;

    jvalue *jni_arguments = NULL;
    if (slot->jni_argc > 0) {
        jni_arguments = calloc(slot->jni_argc, sizeof(*jni_arguments));
        if (jni_arguments == NULL) {
            throw_new(env, "java/lang/OutOfMemoryError",
                      "kffi: allocating upcall JNI arguments failed");
            describe_and_clear_exception(env);
            release_env(attached);
            return;
        }
    }

    if (slot->has_routing_userdata) {
        void *routing_userdata = *(void **)args[slot->argc - 1];
        jni_arguments[0].j = (jlong)(uintptr_t)routing_userdata;
        for (size_t i = 0; i + 1 < slot->argc; i++) {
            marshal_argument(&jni_arguments[i + 1], slot->arg_kinds[i], args[i]);
        }
    } else {
        for (size_t i = 0; i < slot->argc; i++) {
            marshal_argument(&jni_arguments[i], slot->arg_kinds[i], args[i]);
        }
    }

    upcall_jni_result result = invoke_dispatcher(env, slot, jni_arguments);
    if ((*env)->ExceptionCheck(env)) {
        describe_and_clear_exception(env);
    } else {
        store_return_value(slot, resp, result);
    }
    free(jni_arguments);
    release_env(attached);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_UpcallEngine_allocateTrampoline(
    JNIEnv *env, jclass cls, jclass dispatcherClass, jstring dispatchMethod,
    jstring dispatchJvmSignature, jstring dispatchAbiSignature) {
    (void)cls;
    if (dispatcherClass == NULL || dispatchMethod == NULL ||
        dispatchJvmSignature == NULL || dispatchAbiSignature == NULL) {
        throw_new(env, "java/lang/IllegalArgumentException",
                  "kffi: upcall dispatcher arguments must not be null");
        return 0L;
    }

    const char *method_name = NULL;
    const char *jni_signature = NULL;
    const char *abi_signature = NULL;
    upcall_slot *slot = NULL;
    jlong result = 0L;

    method_name = (*env)->GetStringUTFChars(env, dispatchMethod, NULL);
    if (method_name == NULL) goto cleanup;
    jni_signature = (*env)->GetStringUTFChars(env, dispatchJvmSignature, NULL);
    if (jni_signature == NULL) goto cleanup;
    abi_signature = (*env)->GetStringUTFChars(env, dispatchAbiSignature, NULL);
    if (abi_signature == NULL) goto cleanup;

    slot = slot_reserve();
    if (slot == NULL) {
        throw_new(env, "java/lang/IllegalStateException",
                  "kffi: upcall slot exhausted");
        goto cleanup;
    }

    parse_status status = parse_abi_signature(slot, abi_signature);
    if (status != PARSE_OK) {
        throw_new(env,
                  status == PARSE_OOM ? "java/lang/OutOfMemoryError"
                                      : "java/lang/IllegalArgumentException",
                  status == PARSE_OOM
                      ? "kffi: allocating parsed upcall ABI failed"
                      : "kffi: malformed or unsupported upcall ABI signature");
        goto fail_slot;
    }
    status = parse_and_validate_jni_signature(slot, jni_signature);
    if (status != PARSE_OK) {
        throw_new(env,
                  status == PARSE_OOM ? "java/lang/OutOfMemoryError"
                                      : "java/lang/IllegalArgumentException",
                  status == PARSE_OOM
                      ? "kffi: allocating parsed upcall JNI signature failed"
                      : "kffi: JNI dispatcher signature does not match upcall ABI");
        goto fail_slot;
    }

    slot->method = (*env)->GetStaticMethodID(env, dispatcherClass,
                                             method_name, jni_signature);
    if (slot->method == NULL) {
        if ((*env)->ExceptionCheck(env)) (*env)->ExceptionClear(env);
        throw_new(env, "java/lang/IllegalArgumentException",
                  "kffi: upcall dispatch method not found");
        goto fail_slot;
    }
    slot->cls = (jclass)(*env)->NewGlobalRef(env, dispatcherClass);
    if (slot->cls == NULL) goto fail_slot;

    if (ffi_prep_cif(&slot->cif, FFI_DEFAULT_ABI, (unsigned int)slot->argc,
                     slot->return_type, slot->arg_types) != FFI_OK) {
        throw_new(env, "java/lang/IllegalArgumentException",
                  "kffi: ffi_prep_cif failed for upcall closure");
        goto fail_slot;
    }

    slot->closure = ffi_closure_alloc(sizeof(ffi_closure), &slot->fnptr);
    if (slot->closure == NULL) {
        throw_new(env, "java/lang/OutOfMemoryError",
                  "kffi: ffi_closure_alloc failed");
        goto fail_slot;
    }
    if (ffi_prep_closure_loc(slot->closure, &slot->cif,
                             kffi_upcall_closure, slot,
                             slot->fnptr) != FFI_OK) {
        throw_new(env, "java/lang/IllegalArgumentException",
                  "kffi: ffi_prep_closure_loc failed");
        goto fail_slot;
    }

    result = (jlong)(uintptr_t)slot->fnptr;
    goto cleanup;

fail_slot:
    slot_release(env, slot);

cleanup:
    if (abi_signature != NULL) {
        (*env)->ReleaseStringUTFChars(env, dispatchAbiSignature, abi_signature);
    }
    if (jni_signature != NULL) {
        (*env)->ReleaseStringUTFChars(env, dispatchJvmSignature, jni_signature);
    }
    if (method_name != NULL) {
        (*env)->ReleaseStringUTFChars(env, dispatchMethod, method_name);
    }
    return result;
}

/* The caller must establish quiescence before freeing a known trampoline.
 * Unknown and already-freed addresses are intentionally ignored. */
JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_UpcallEngine_freeTrampoline(
    JNIEnv *env, jclass cls, jlong address) {
    (void)cls;
    if (address == 0L) return;
    pthread_mutex_lock(&g_slots_mutex);
    for (size_t i = 0; i < KFFI_UPCALL_SLOTS; i++) {
        if (g_slots[i].in_use && g_slots[i].fnptr != NULL &&
            (uintptr_t)address == (uintptr_t)g_slots[i].fnptr) {
            slot_teardown_locked(env, &g_slots[i]);
            break;
        }
    }
    pthread_mutex_unlock(&g_slots_mutex);
}
