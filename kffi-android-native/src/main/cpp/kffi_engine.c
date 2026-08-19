#include <jni.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>
#include <pthread.h>
#include <dlfcn.h>
#include <ffi.h>

#include "kffi_upcall.h"

/*
 * ABI guard: the engine's uniform jlong JNI signatures carry
 * pointers, C long values and size_t counts in 64-bit carriers, resolved by
 * sizeof-aware casts at the C boundary. C `long` is 32-bit on armeabi-v7a but
 * 64-bit on arm64-v8a/x86_64, so the width is pinned here at compile time:
 * KFFI_C_LONG_IS_32BIT is derived from the compiler's architecture macros and
 * the _Static_assert fails the build if it ever disagrees with sizeof(long),
 * so a silent 32-bit truncation/extension regression cannot slip back in.
 *
 * All wrappers below must stay consistent with this guard: pointers pass
 * through (uintptr_t) both directions, and C long/size_t args truncate from
 * jlong at the call site (32-bit) with returns widening through (jlong).
 */
#if defined(__arm__) && !defined(__aarch64__)
#define KFFI_C_LONG_IS_32BIT 1
#else
#define KFFI_C_LONG_IS_32BIT 0
#endif

_Static_assert(
    (KFFI_C_LONG_IS_32BIT ? sizeof(long) == 4 : sizeof(long) == 8),
    "C long width does not match the KFFI_C_LONG_IS_32BIT ABI guard");

typedef uint64_t (*fn_i0)(void);      /* int-like return, 0 args */
typedef void (*fn_void_v0)(void);     /* void return, 0 args */
typedef uint64_t (*fn_i4_i4i4i4i4)(int, int, int, int);
typedef void (*fn_void_v2_pp)(void *, void *);
typedef void (*fn_void_v1_i)(int);

/*
 * Typed downcall wrapper table. One entry per `call<R><N><ARGS>` form the
 * regenerated wgpu Android bindings reference: R ∈ V/I/L/P/D/F/S/B (V void,
 * I/L/P 64-bit carrier returned as jlong, D double, F float, S short, B byte),
 * args I=int, L=int64_t, P=void*, D=double, F=float, S=short, B=int8_t.
 * Struct-by-value signatures ride callGeneric instead.
 */
typedef float (*fn_f_1_p)(void *);
typedef uint64_t (*fn_i_1_i)(int);
typedef uint64_t (*fn_i_1_p)(void *);
typedef uint64_t (*fn_i_2_pi)(void *, int);
typedef uint64_t (*fn_i_2_pp)(void *, void *);
typedef uint64_t (*fn_i_3_pip)(void *, int, void *);
typedef uint64_t (*fn_i_3_ppp)(void *, void *, void *);
typedef uint64_t (*fn_i_4_plpl)(void *, int64_t, void *, int64_t);
typedef uint64_t (*fn_l_1_p)(void *);
typedef uint64_t (*fn_l_3_plp)(void *, int64_t, void *);
typedef uint64_t (*fn_l_3_ppp)(void *, void *, void *);
typedef void *(*fn_p_1_p)(void *);
typedef void *(*fn_p_2_pi)(void *, int);
typedef void *(*fn_p_2_pp)(void *, void *);
typedef void *(*fn_p_3_pll)(void *, int64_t, int64_t);
typedef void (*fn_v_1_p)(void *);
typedef void (*fn_v_2_pi)(void *, int);
typedef void (*fn_v_3_plp)(void *, int64_t, void *);
typedef void (*fn_v_3_ppi)(void *, void *, int);
typedef void (*fn_v_3_ppl)(void *, void *, int64_t);
typedef void (*fn_v_4_piii)(void *, int, int, int);
typedef void (*fn_v_4_piip)(void *, int, int, void *);
typedef void (*fn_v_4_ppli)(void *, void *, int64_t, int);
typedef void (*fn_v_4_ppll)(void *, void *, int64_t, int64_t);
typedef void (*fn_v_4_pppp)(void *, void *, void *, void *);
typedef void (*fn_v_5_piiii)(void *, int, int, int, int);
typedef void (*fn_v_5_pipll)(void *, int, void *, int64_t, int64_t);
typedef void (*fn_v_5_piplp)(void *, int, void *, int64_t, void *);
typedef void (*fn_v_5_ppill)(void *, void *, int, int64_t, int64_t);
typedef void (*fn_v_5_pplpl)(void *, void *, int64_t, void *, int64_t);
typedef void (*fn_v_6_piiiii)(void *, int, int, int, int, int);
typedef void (*fn_v_6_ppiipl)(void *, void *, int, int, void *, int64_t);
typedef void (*fn_v_6_pplpli)(void *, void *, int64_t, void *, int64_t, int);
typedef void (*fn_v_6_pplpll)(void *, void *, int64_t, void *, int64_t, int64_t);
typedef void (*fn_v_6_ppplpp)(void *, void *, void *, int64_t, void *, void *);
typedef void (*fn_v_7_pffffff)(void *, float, float, float, float, float, float);

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_loadNativeLibrary(
    JNIEnv *env, jclass cls, jstring path) {
    (void)cls;
    const char *cpath = (*env)->GetStringUTFChars(env, path, NULL);
    if ((*env)->ExceptionCheck(env)) return 0L;
    void *handle = dlopen(cpath, RTLD_NOW | RTLD_GLOBAL);
    if (handle == NULL) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         dlerror());
        (*env)->ReleaseStringUTFChars(env, path, cpath);
        return 0L;
    }
    (*env)->ReleaseStringUTFChars(env, path, cpath);
    return (jlong)(uintptr_t)handle;
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_resolveSymbolIn(
    JNIEnv *env, jclass cls, jlong handle, jstring name) {
    (void)cls;
    const char *cname = (*env)->GetStringUTFChars(env, name, NULL);
    if ((*env)->ExceptionCheck(env)) return 0L;
    void *sym = dlsym((void *)(uintptr_t)handle, cname);
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jlong)(uintptr_t)sym;
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_resolveSymbol(
    JNIEnv *env, jclass cls, jstring name) {
    (void)cls;
    const char *cname = (*env)->GetStringUTFChars(env, name, NULL);
    if ((*env)->ExceptionCheck(env)) return 0L;
    void *sym = dlsym(RTLD_DEFAULT, cname);
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jlong)(uintptr_t)sym;
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV0(JNIEnv *env, jclass cls, jlong fn) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_void_v0)(uintptr_t)fn)();
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI0(JNIEnv *env, jclass cls, jlong fn) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i0)(uintptr_t)fn)();
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI4IIII(JNIEnv *env, jclass cls, jlong fn, jint a, jint b, jint c, jint d) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i4_i4i4i4i4)(uintptr_t)fn)(a, b, c, d);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV2PP(JNIEnv *env, jclass cls, jlong fn, jlong p1, jlong p2) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_void_v2_pp)(uintptr_t)fn)((void *)(uintptr_t)p1, (void *)(uintptr_t)p2);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV1I(JNIEnv *env, jclass cls, jlong fn, jint i) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_void_v1_i)(uintptr_t)fn)(i);
}

/*
 * Typed downcall wrappers emitted by the wgpu Android bindings.
 * Each follows the null-fn guard + sizeof-aware cast pattern above.
 */
JNIEXPORT jfloat JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callF1P(JNIEnv *env, jclass cls, jlong fn, jlong a1) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0.0f;
    }
    return (jfloat)((fn_f_1_p)(uintptr_t)fn)((void *)(uintptr_t)a1);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI1I(JNIEnv *env, jclass cls, jlong fn, jint a1) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i_1_i)(uintptr_t)fn)(a1);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI1P(JNIEnv *env, jclass cls, jlong fn, jlong a1) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i_1_p)(uintptr_t)fn)((void *)(uintptr_t)a1);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI2PI(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i_2_pi)(uintptr_t)fn)((void *)(uintptr_t)a1, a2);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI2PP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i_2_pp)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI3PIP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2, jlong a3) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i_3_pip)(uintptr_t)fn)((void *)(uintptr_t)a1, a2, (void *)(uintptr_t)a3);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI3PPP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i_3_ppp)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (void *)(uintptr_t)a3);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callI4PLPL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3, jlong a4) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_i_4_plpl)(uintptr_t)fn)((void *)(uintptr_t)a1, (int64_t)a2, (void *)(uintptr_t)a3, (int64_t)a4);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callL1P(JNIEnv *env, jclass cls, jlong fn, jlong a1) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_l_1_p)(uintptr_t)fn)((void *)(uintptr_t)a1);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callL3PLP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_l_3_plp)(uintptr_t)fn)((void *)(uintptr_t)a1, (int64_t)a2, (void *)(uintptr_t)a3);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callL3PPP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)((fn_l_3_ppp)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (void *)(uintptr_t)a3);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callP1P(JNIEnv *env, jclass cls, jlong fn, jlong a1) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)(uintptr_t)((fn_p_1_p)(uintptr_t)fn)((void *)(uintptr_t)a1);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callP2PI(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)(uintptr_t)((fn_p_2_pi)(uintptr_t)fn)((void *)(uintptr_t)a1, a2);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callP2PP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)(uintptr_t)((fn_p_2_pp)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callP3PLL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return 0L;
    }
    return (jlong)(uintptr_t)((fn_p_3_pll)(uintptr_t)fn)((void *)(uintptr_t)a1, (int64_t)a2, (int64_t)a3);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV1P(JNIEnv *env, jclass cls, jlong fn, jlong a1) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_1_p)(uintptr_t)fn)((void *)(uintptr_t)a1);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV2PI(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_2_pi)(uintptr_t)fn)((void *)(uintptr_t)a1, a2);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV3PLP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_3_plp)(uintptr_t)fn)((void *)(uintptr_t)a1, (int64_t)a2, (void *)(uintptr_t)a3);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV3PPI(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jint a3) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_3_ppi)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, a3);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV3PPL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_3_ppl)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (int64_t)a3);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV4PIII(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2, jint a3, jint a4) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_4_piii)(uintptr_t)fn)((void *)(uintptr_t)a1, a2, a3, a4);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV4PIIP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2, jint a3, jlong a4) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_4_piip)(uintptr_t)fn)((void *)(uintptr_t)a1, a2, a3, (void *)(uintptr_t)a4);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV4PPLI(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3, jint a4) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_4_ppli)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (int64_t)a3, a4);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV4PPLL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3, jlong a4) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_4_ppll)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (int64_t)a3, (int64_t)a4);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV4PPPP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3, jlong a4) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_4_pppp)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (void *)(uintptr_t)a3, (void *)(uintptr_t)a4);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV5PIIII(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2, jint a3, jint a4, jint a5) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_5_piiii)(uintptr_t)fn)((void *)(uintptr_t)a1, a2, a3, a4, a5);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV5PIPLL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2, jlong a3, jlong a4, jlong a5) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_5_pipll)(uintptr_t)fn)((void *)(uintptr_t)a1, a2, (void *)(uintptr_t)a3, (int64_t)a4, (int64_t)a5);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV5PIPLP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2, jlong a3, jlong a4, jlong a5) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_5_piplp)(uintptr_t)fn)((void *)(uintptr_t)a1, a2, (void *)(uintptr_t)a3, (int64_t)a4, (void *)(uintptr_t)a5);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV5PPILL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jint a3, jlong a4, jlong a5) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_5_ppill)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, a3, (int64_t)a4, (int64_t)a5);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV5PPLPL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3, jlong a4, jlong a5) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_5_pplpl)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (int64_t)a3, (void *)(uintptr_t)a4, (int64_t)a5);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV6PIIIII(JNIEnv *env, jclass cls, jlong fn, jlong a1, jint a2, jint a3, jint a4, jint a5, jint a6) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_6_piiiii)(uintptr_t)fn)((void *)(uintptr_t)a1, a2, a3, a4, a5, a6);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV6PPIIPL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jint a3, jint a4, jlong a5, jlong a6) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_6_ppiipl)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, a3, a4, (void *)(uintptr_t)a5, (int64_t)a6);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV6PPLPLI(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3, jlong a4, jlong a5, jint a6) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_6_pplpli)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (int64_t)a3, (void *)(uintptr_t)a4, (int64_t)a5, a6);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV6PPLPLL(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3, jlong a4, jlong a5, jlong a6) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_6_pplpll)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (int64_t)a3, (void *)(uintptr_t)a4, (int64_t)a5, (int64_t)a6);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV6PPPLPP(JNIEnv *env, jclass cls, jlong fn, jlong a1, jlong a2, jlong a3, jlong a4, jlong a5, jlong a6) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_6_ppplpp)(uintptr_t)fn)((void *)(uintptr_t)a1, (void *)(uintptr_t)a2, (void *)(uintptr_t)a3, (int64_t)a4, (void *)(uintptr_t)a5, (void *)(uintptr_t)a6);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callV7PFFFFFF(JNIEnv *env, jclass cls, jlong fn, jlong a1, jfloat a2, jfloat a3, jfloat a4, jfloat a5, jfloat a6, jfloat a7) {
    (void)cls;
    if (fn == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer");
        return;
    }
    ((fn_v_7_pffffff)(uintptr_t)fn)((void *)(uintptr_t)a1, a2, a3, a4, a5, a6, a7);
}

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_directBufferAddress(
    JNIEnv *env, jclass cls, jobject buffer) {
    (void)cls;
    if (buffer == NULL) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/IllegalArgumentException"),
                         "kffi: null buffer");
        return 0L;
    }
    jlong addr = (jlong)(uintptr_t)(*env)->GetDirectBufferAddress(env, buffer);
    if ((*env)->ExceptionCheck(env)) return 0L;
    if (addr == 0L) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/IllegalArgumentException"),
                         "kffi: buffer is not a direct byte buffer");
        return 0L;
    }
    return addr;
}

/*
 * FIXTURE-SPECIFIC struct-by-value wrappers.
 * These are hand-written for the benchmark fixture's `bench_pair`. Their
 * buffer-in/buffer-out contract (structPtr/structSize in, outPtr out) mirrors
 * the per-struct wrappers generated by kextract from header layouts.
 */
typedef struct bench_pair { uint64_t a; uint64_t b; } bench_pair;
typedef uint64_t (*fn_struct_pair_sum)(bench_pair);

JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callStructArgL(
    JNIEnv *env, jclass cls, jlong fn, jint structSize, jlong structPtr, jlong arg2) {
    (void)arg2; (void)cls;
    if (fn == 0 || structPtr == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer or struct pointer");
        return 0L;
    }
    if ((size_t)structSize != sizeof(bench_pair)) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/IllegalArgumentException"),
                         "kffi: struct size mismatch for bench_pair wrapper");
        return 0L;
    }
    bench_pair local;
    memcpy(&local, (void *)(uintptr_t)structPtr, (size_t)structSize);
    return (jlong)((fn_struct_pair_sum)(uintptr_t)fn)(local);
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callStructReturn(
    JNIEnv *env, jclass cls, jlong fn, jlong a, jlong b, jint structSize, jlong outPtr) {
    (void)cls;
    if (fn == 0 || outPtr == 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null native function pointer or out pointer");
        return;
    }
    if ((size_t)structSize != sizeof(bench_pair)) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/IllegalArgumentException"),
                         "kffi: struct size mismatch for bench_pair wrapper");
        return;
    }
    bench_pair r = ((bench_pair (*)(uint64_t, uint64_t))(uintptr_t)fn)((uint64_t)a, (uint64_t)b);
    memcpy((void *)(uintptr_t)outPtr, &r, (size_t)structSize);
}

/*
 * Generic downcall signatures are emitted by kextract as compact ASCII:
 *
 *   signature := type ':' (type (',' type)*)?
 *   type      := v | p | b8 | i8 | u8 | i16 | u16 | i32 | u32 | i64 | u64
 *              | f32 | f64 | s<size>@<alignment>(type[,type]*)
 *              | a<count>(type)
 *
 * A struct carries the C size/alignment measured by Clang, plus its recursive
 * field layout. `a` is an in-struct fixed-size C array. libffi derives a
 * struct's effective size/alignment from its elements; the engine verifies
 * the result against the emitted metadata before calling native code. This
 * rejects packed/unsupported layouts rather than silently making an ABI-wrong
 * call. Function arguments are packed in declaration order at their ABI
 * alignment; top-level pointers keep the generator's eight-byte Long carrier
 * even where the native pointer itself is narrower.
 */
typedef struct generic_alloc_node {
    void *ptr;
    struct generic_alloc_node *next;
} generic_alloc_node;

typedef struct generic_struct_expectation {
    ffi_type *type;
    size_t size;
    unsigned short alignment;
    struct generic_struct_expectation *next;
} generic_struct_expectation;

typedef struct {
    generic_alloc_node *allocations;
    generic_struct_expectation *expectations;
    int out_of_memory;
} generic_type_arena;

typedef struct {
    const char *cursor;
    int invalid;
} generic_type_parser;

typedef struct {
    ffi_type **items;
    size_t count;
    size_t capacity;
} generic_type_list;

typedef struct generic_signature {
    char *spec;
    jint argc;
    ffi_cif cif;
    ffi_type *return_type;
    ffi_type **arg_types;
    generic_type_arena arena;
    struct generic_signature *next;
} generic_signature;

typedef enum {
    GENERIC_SIGNATURE_OK,
    GENERIC_SIGNATURE_INVALID,
    GENERIC_SIGNATURE_OOM,
} generic_signature_status;

static pthread_mutex_t generic_signature_cache_mutex = PTHREAD_MUTEX_INITIALIZER;
static generic_signature *generic_signature_cache;

static void *generic_type_arena_calloc(generic_type_arena *arena, size_t count, size_t size) {
    if (count == 0 || size == 0 || count > SIZE_MAX / size) {
        arena->out_of_memory = 1;
        return NULL;
    }
    void *ptr = calloc(count, size);
    generic_alloc_node *node = ptr == NULL ? NULL : malloc(sizeof(*node));
    if (ptr == NULL || node == NULL) {
        free(ptr);
        arena->out_of_memory = 1;
        return NULL;
    }
    node->ptr = ptr;
    node->next = arena->allocations;
    arena->allocations = node;
    return ptr;
}

static void generic_type_arena_destroy(generic_type_arena *arena) {
    generic_alloc_node *allocation = arena->allocations;
    while (allocation != NULL) {
        generic_alloc_node *next = allocation->next;
        free(allocation->ptr);
        free(allocation);
        allocation = next;
    }
    generic_struct_expectation *expectation = arena->expectations;
    while (expectation != NULL) {
        generic_struct_expectation *next = expectation->next;
        free(expectation);
        expectation = next;
    }
}

static int generic_type_list_append(generic_type_list *list, ffi_type *type) {
    if (list->count == list->capacity) {
        size_t next_capacity = list->capacity == 0 ? 4 : list->capacity * 2;
        if (next_capacity < list->capacity || next_capacity > SIZE_MAX / sizeof(*list->items)) return 0;
        ffi_type **items = realloc(list->items, next_capacity * sizeof(*items));
        if (items == NULL) return 0;
        list->items = items;
        list->capacity = next_capacity;
    }
    list->items[list->count++] = type;
    return 1;
}

static int generic_parse_decimal(generic_type_parser *parser, size_t *value) {
    size_t result = 0;
    if (*parser->cursor < '0' || *parser->cursor > '9') {
        parser->invalid = 1;
        return 0;
    }
    do {
        unsigned digit = (unsigned)(*parser->cursor - '0');
        if (result > (SIZE_MAX - digit) / 10) {
            parser->invalid = 1;
            return 0;
        }
        result = result * 10 + digit;
        parser->cursor++;
    } while (*parser->cursor >= '0' && *parser->cursor <= '9');
    *value = result;
    return 1;
}

static int generic_consume(generic_type_parser *parser, const char *text) {
    size_t length = strlen(text);
    if (strncmp(parser->cursor, text, length) != 0) {
        parser->invalid = 1;
        return 0;
    }
    parser->cursor += length;
    return 1;
}

static ffi_type *generic_parse_type(
    generic_type_parser *parser,
    generic_type_arena *arena,
    int allow_void);

static ffi_type *generic_make_aggregate(
    generic_type_arena *arena,
    const generic_type_list *fields) {
    if (fields->count == 0 || fields->count > SIZE_MAX / sizeof(ffi_type *) - 1) {
        return NULL;
    }
    ffi_type *type = generic_type_arena_calloc(arena, 1, sizeof(*type));
    ffi_type **elements = generic_type_arena_calloc(arena, fields->count + 1, sizeof(*elements));
    if (type == NULL || elements == NULL) return NULL;
    memcpy(elements, fields->items, fields->count * sizeof(*elements));
    type->type = FFI_TYPE_STRUCT;
    type->elements = elements;
    return type;
}

static ffi_type *generic_parse_struct(
    generic_type_parser *parser,
    generic_type_arena *arena) {
    size_t expected_size;
    size_t expected_alignment;
    generic_type_list fields = {0};
    ffi_type *result = NULL;

    if (!generic_parse_decimal(parser, &expected_size) ||
        !generic_consume(parser, "@") ||
        !generic_parse_decimal(parser, &expected_alignment) ||
        !generic_consume(parser, "(")) {
        goto done;
    }
    if (expected_size == 0 || expected_alignment == 0 || expected_alignment > USHRT_MAX ||
        *parser->cursor == ')') {
        parser->invalid = 1;
        goto done;
    }
    while (1) {
        ffi_type *field = generic_parse_type(parser, arena, 0);
        if (field == NULL || !generic_type_list_append(&fields, field)) {
            if (!parser->invalid) arena->out_of_memory = 1;
            goto done;
        }
        if (*parser->cursor == ')') {
            parser->cursor++;
            break;
        }
        if (*parser->cursor != ',') {
            parser->invalid = 1;
            goto done;
        }
        parser->cursor++;
    }
    result = generic_make_aggregate(arena, &fields);
    if (result == NULL) goto done;
    generic_struct_expectation *expectation = malloc(sizeof(*expectation));
    if (expectation == NULL) {
        arena->out_of_memory = 1;
        result = NULL;
        goto done;
    }
    expectation->type = result;
    expectation->size = expected_size;
    expectation->alignment = (unsigned short)expected_alignment;
    expectation->next = arena->expectations;
    arena->expectations = expectation;

done:
    free(fields.items);
    return result;
}

static ffi_type *generic_parse_array(
    generic_type_parser *parser,
    generic_type_arena *arena) {
    size_t count;
    generic_type_list elements = {0};
    ffi_type *element;
    ffi_type *result = NULL;

    if (!generic_parse_decimal(parser, &count) || !generic_consume(parser, "(") || count == 0) {
        parser->invalid = 1;
        goto done;
    }
    element = generic_parse_type(parser, arena, 0);
    if (element == NULL || !generic_consume(parser, ")")) goto done;
    for (size_t i = 0; i < count; i++) {
        if (!generic_type_list_append(&elements, element)) {
            arena->out_of_memory = 1;
            goto done;
        }
    }
    result = generic_make_aggregate(arena, &elements);

done:
    free(elements.items);
    return result;
}

static ffi_type *generic_parse_type(
    generic_type_parser *parser,
    generic_type_arena *arena,
    int allow_void) {
    char tag = *parser->cursor++;
    switch (tag) {
        case 'v':
            if (allow_void) return &ffi_type_void;
            break;
        case 'p':
            return &ffi_type_pointer;
        case 'b':
            if (generic_consume(parser, "8")) return &ffi_type_uint8;
            return NULL;
        case 'i':
            if (strncmp(parser->cursor, "8", 1) == 0) {
                parser->cursor++;
                return &ffi_type_sint8;
            }
            if (strncmp(parser->cursor, "16", 2) == 0) {
                parser->cursor += 2;
                return &ffi_type_sint16;
            }
            if (strncmp(parser->cursor, "32", 2) == 0) {
                parser->cursor += 2;
                return &ffi_type_sint32;
            }
            if (strncmp(parser->cursor, "64", 2) == 0) {
                parser->cursor += 2;
                return &ffi_type_sint64;
            }
            break;
        case 'u':
            if (strncmp(parser->cursor, "8", 1) == 0) {
                parser->cursor++;
                return &ffi_type_uint8;
            }
            if (strncmp(parser->cursor, "16", 2) == 0) {
                parser->cursor += 2;
                return &ffi_type_uint16;
            }
            if (strncmp(parser->cursor, "32", 2) == 0) {
                parser->cursor += 2;
                return &ffi_type_uint32;
            }
            if (strncmp(parser->cursor, "64", 2) == 0) {
                parser->cursor += 2;
                return &ffi_type_uint64;
            }
            break;
        case 'f':
            if (strncmp(parser->cursor, "32", 2) == 0) {
                parser->cursor += 2;
                return &ffi_type_float;
            }
            if (strncmp(parser->cursor, "64", 2) == 0) {
                parser->cursor += 2;
                return &ffi_type_double;
            }
            break;
        case 's':
            return generic_parse_struct(parser, arena);
        case 'a':
            return generic_parse_array(parser, arena);
        default:
            break;
    }

    /* i/u widths with a shared prefix are handled after the first digit. */
    parser->invalid = 1;
    return NULL;
}

static int generic_validate_struct_layouts(const generic_type_arena *arena) {
    for (const generic_struct_expectation *expectation = arena->expectations;
         expectation != NULL;
         expectation = expectation->next) {
        if (expectation->type->size != expectation->size ||
            expectation->type->alignment != expectation->alignment) {
            return 0;
        }
    }
    return 1;
}

static void generic_signature_destroy(generic_signature *signature) {
    if (signature == NULL) return;
    free(signature->spec);
    free(signature->arg_types);
    generic_type_arena_destroy(&signature->arena);
    free(signature);
}

static generic_signature_status generic_signature_build(
    const char *spec,
    jint argc,
    generic_signature **out_signature) {
    generic_signature *signature = calloc(1, sizeof(*signature));
    generic_type_parser parser = { .cursor = spec };
    if (signature == NULL) return GENERIC_SIGNATURE_OOM;

    if (argc > 0) {
        signature->arg_types = calloc((size_t)argc, sizeof(*signature->arg_types));
        if (signature->arg_types == NULL) {
            generic_signature_destroy(signature);
            return GENERIC_SIGNATURE_OOM;
        }
    }

    signature->return_type = generic_parse_type(&parser, &signature->arena, 1);
    if (signature->return_type == NULL || !generic_consume(&parser, ":")) goto invalid;
    for (jint i = 0; i < argc; i++) {
        signature->arg_types[i] = generic_parse_type(&parser, &signature->arena, 0);
        if (signature->arg_types[i] == NULL) goto invalid;
        if (i + 1 < argc) {
            if (!generic_consume(&parser, ",")) goto invalid;
        }
    }
    if (*parser.cursor != '\0') {
        parser.invalid = 1;
        goto invalid;
    }
    if (signature->arena.out_of_memory) goto oom;
    if (ffi_prep_cif(
            &signature->cif,
            FFI_DEFAULT_ABI,
            (unsigned)argc,
            signature->return_type,
            signature->arg_types) != FFI_OK ||
        !generic_validate_struct_layouts(&signature->arena)) {
        goto invalid;
    }

    size_t spec_size = strlen(spec) + 1;
    signature->spec = malloc(spec_size);
    if (signature->spec == NULL) goto oom;
    memcpy(signature->spec, spec, spec_size);
    signature->argc = argc;
    *out_signature = signature;
    return GENERIC_SIGNATURE_OK;

invalid:
    if (signature->arena.out_of_memory) goto oom;
    generic_signature_destroy(signature);
    return GENERIC_SIGNATURE_INVALID;

oom:
    generic_signature_destroy(signature);
    return GENERIC_SIGNATURE_OOM;
}

static generic_signature_status generic_signature_get(
    const char *spec,
    jint argc,
    generic_signature **out_signature) {
    pthread_mutex_lock(&generic_signature_cache_mutex);
    for (generic_signature *signature = generic_signature_cache;
         signature != NULL;
         signature = signature->next) {
        if (signature->argc == argc && strcmp(signature->spec, spec) == 0) {
            *out_signature = signature;
            pthread_mutex_unlock(&generic_signature_cache_mutex);
            return GENERIC_SIGNATURE_OK;
        }
    }

    generic_signature *signature = NULL;
    generic_signature_status status = generic_signature_build(spec, argc, &signature);
    if (status == GENERIC_SIGNATURE_OK) {
        signature->next = generic_signature_cache;
        generic_signature_cache = signature;
        *out_signature = signature;
    }
    pthread_mutex_unlock(&generic_signature_cache_mutex);
    return status;
}

static int generic_align_offset(size_t offset, size_t alignment, size_t *aligned) {
    if (alignment == 0 || offset > SIZE_MAX - (alignment - 1)) return 0;
    *aligned = ((offset + alignment - 1) / alignment) * alignment;
    return 1;
}

/*
 * The generated Kotlin buffer uses Long as its universal pointer carrier. Keep
 * that wire layout at eight-byte slots even on 32-bit Android; libffi still
 * reads only the native pointer width from the slot when invoking the target.
 * Record fields are deliberately excluded: their byte layout is native and is
 * validated against libffi before the call.
 */
static size_t generic_argument_buffer_size(const ffi_type *type) {
    return type == &ffi_type_pointer ? sizeof(uint64_t) : type->size;
}

static size_t generic_argument_buffer_alignment(const ffi_type *type) {
    return type == &ffi_type_pointer ? sizeof(uint64_t) : type->alignment;
}

JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_NativeEngine_callGeneric(
    JNIEnv *env, jclass cls, jlong fn, jint argc, jstring typeSpec, jlong argsPtr, jlong outPtr) {
    (void)cls;
    if (fn == 0 || typeSpec == NULL) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null generic-call function or typeSpec");
        return;
    }
    if (argc < 0) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/IllegalArgumentException"),
                         "kffi: negative generic-call argc");
        return;
    }

    const char *spec = (*env)->GetStringUTFChars(env, typeSpec, NULL);
    if ((*env)->ExceptionCheck(env) || spec == NULL) return;
    generic_signature *signature = NULL;
    generic_signature_status status = generic_signature_get(spec, argc, &signature);
    (*env)->ReleaseStringUTFChars(env, typeSpec, spec);
    if (status != GENERIC_SIGNATURE_OK) {
        const char *class_name = status == GENERIC_SIGNATURE_OOM
            ? "java/lang/OutOfMemoryError"
            : "java/lang/IllegalArgumentException";
        const char *message = status == GENERIC_SIGNATURE_OOM
            ? "kffi: allocating generic call signature failed"
            : "kffi: malformed or ABI-incompatible generic typeSpec";
        (*env)->ThrowNew(env, (*env)->FindClass(env, class_name), message);
        return;
    }
    if ((argc > 0 && argsPtr == 0) ||
        (signature->return_type != &ffi_type_void && outPtr == 0)) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"),
                         "kffi: null generic-call argument buffer");
        return;
    }

    void **avalue = argc == 0 ? NULL : calloc((size_t)argc, sizeof(*avalue));
    if (argc > 0 && avalue == NULL) {
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/OutOfMemoryError"),
                         "kffi: allocating generic argument pointers failed");
        return;
    }

    uintptr_t base = (uintptr_t)argsPtr;
    size_t offset = 0;
    for (jint i = 0; i < argc; i++) {
        ffi_type *type = signature->arg_types[i];
        size_t buffer_size = generic_argument_buffer_size(type);
        if (!generic_align_offset(offset, generic_argument_buffer_alignment(type), &offset) ||
            offset > UINTPTR_MAX - base ||
            buffer_size > SIZE_MAX - offset) {
            free(avalue);
            (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/IllegalArgumentException"),
                             "kffi: generic argument layout overflow");
            return;
        }
        avalue[i] = (void *)(base + offset);
        offset += buffer_size;
    }

    ffi_call(
        &signature->cif,
        FFI_FN((void *)(uintptr_t)fn),
        signature->return_type == &ffi_type_void ? NULL : (void *)(uintptr_t)outPtr,
        avalue);
    free(avalue);
}

/*
 * JNI registration. All NativeEngine and UpcallEngine externals are bound
 * explicitly via RegisterNatives from JNI_OnLoad instead of
 * relying on Java_<class>_<name> symbol-name matching. The JNIEXPORT
 * naming-convention functions above are kept unchanged: RegisterNatives
 * references their addresses directly, so the JNIEXPORT symbols remain the
 * single source of truth for the engine surface. Signatures below mirror the
 * Kotlin externals in NativeEngine.kt / UpcallEngine.kt exactly.
 *
 * TODO: add an androidUnitTest guarding the RegisterNatives table against
 * NativeEngine.kt drift (a wrong entry fails loudly at load; a missing entry
 * silently falls back to Java_... symbol lookup).
 */
static JNINativeMethod kffi_native_engine_methods[] = {
    { "loadNativeLibrary", "(Ljava/lang/String;)J",
      (void *)Java_org_graphiks_kffi_engine_NativeEngine_loadNativeLibrary },
    { "resolveSymbolIn", "(JLjava/lang/String;)J",
      (void *)Java_org_graphiks_kffi_engine_NativeEngine_resolveSymbolIn },
    { "resolveSymbol", "(Ljava/lang/String;)J",
      (void *)Java_org_graphiks_kffi_engine_NativeEngine_resolveSymbol },
    { "callV0", "(J)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV0 },
    { "callI0", "(J)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI0 },
    { "callI4IIII", "(JIIII)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI4IIII },
    { "callV2PP", "(JJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV2PP },
    { "callV1I", "(JI)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV1I },
    { "callF1P", "(JJ)F", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callF1P },
    { "callI1I", "(JI)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI1I },
    { "callI1P", "(JJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI1P },
    { "callI2PI", "(JJI)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI2PI },
    { "callI2PP", "(JJJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI2PP },
    { "callI3PIP", "(JJIJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI3PIP },
    { "callI3PPP", "(JJJJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI3PPP },
    { "callI4PLPL", "(JJJJJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callI4PLPL },
    { "callL1P", "(JJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callL1P },
    { "callL3PLP", "(JJJJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callL3PLP },
    { "callL3PPP", "(JJJJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callL3PPP },
    { "callP1P", "(JJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callP1P },
    { "callP2PI", "(JJI)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callP2PI },
    { "callP2PP", "(JJJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callP2PP },
    { "callP3PLL", "(JJJJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callP3PLL },
    { "callV1P", "(JJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV1P },
    { "callV2PI", "(JJI)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV2PI },
    { "callV3PLP", "(JJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV3PLP },
    { "callV3PPI", "(JJJI)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV3PPI },
    { "callV3PPL", "(JJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV3PPL },
    { "callV4PIII", "(JJIII)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV4PIII },
    { "callV4PIIP", "(JJIIJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV4PIIP },
    { "callV4PPLI", "(JJJJI)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV4PPLI },
    { "callV4PPLL", "(JJJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV4PPLL },
    { "callV4PPPP", "(JJJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV4PPPP },
    { "callV5PIIII", "(JJIIII)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV5PIIII },
    { "callV5PIPLL", "(JJIJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV5PIPLL },
    { "callV5PIPLP", "(JJIJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV5PIPLP },
    { "callV5PPILL", "(JJJIJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV5PPILL },
    { "callV5PPLPL", "(JJJJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV5PPLPL },
    { "callV6PIIIII", "(JJIIIII)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV6PIIIII },
    { "callV6PPIIPL", "(JJJIIJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV6PPIIPL },
    { "callV6PPLPLI", "(JJJJJJI)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV6PPLPLI },
    { "callV6PPLPLL", "(JJJJJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV6PPLPLL },
    { "callV6PPPLPP", "(JJJJJJJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV6PPPLPP },
    { "callV7PFFFFFF", "(JJFFFFFF)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callV7PFFFFFF },
    { "directBufferAddress", "(Ljava/nio/ByteBuffer;)J",
      (void *)Java_org_graphiks_kffi_engine_NativeEngine_directBufferAddress },
    { "callStructArgL", "(JIJJ)J", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callStructArgL },
    { "callStructReturn", "(JJJIJ)V", (void *)Java_org_graphiks_kffi_engine_NativeEngine_callStructReturn },
    { "callGeneric", "(JILjava/lang/String;JJ)V",
      (void *)Java_org_graphiks_kffi_engine_NativeEngine_callGeneric },
};

static JNINativeMethod kffi_upcall_engine_methods[] = {
    { "allocateTrampoline", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J",
      (void *)Java_org_graphiks_kffi_engine_UpcallEngine_allocateTrampoline },
    { "freeTrampoline", "(J)V", (void *)Java_org_graphiks_kffi_engine_UpcallEngine_freeTrampoline },
};

static jint kffi_register_natives(JNIEnv *env, const char *class_name,
                                  const JNINativeMethod *methods, jint method_count) {
    jclass cls = (*env)->FindClass(env, class_name);
    if (cls == NULL) {
        (*env)->ExceptionClear(env);
        char msg[256];
        (void)snprintf(msg, sizeof(msg),
                       "kffi: JNI_OnLoad: engine class not found: %s", class_name);
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"), msg);
        return JNI_ERR;
    }
    if ((*env)->RegisterNatives(env, cls, methods, method_count) != JNI_OK) {
        (*env)->ExceptionClear(env);
        char msg[256];
        (void)snprintf(msg, sizeof(msg),
                       "kffi: JNI_OnLoad: RegisterNatives failed for %s (%d methods)",
                       class_name, (int)method_count);
        (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/UnsatisfiedLinkError"), msg);
        return JNI_ERR;
    }
    return JNI_OK;
}

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    (void)reserved;
    JNIEnv *env = NULL;
    if ((*vm)->GetEnv(vm, (void **)&env, JNI_VERSION_1_6) != JNI_OK) {
        return JNI_ERR;
    }
    if (kffi_register_natives(env, "org/graphiks/kffi/engine/NativeEngine",
                              kffi_native_engine_methods,
                              (jint)(sizeof(kffi_native_engine_methods) /
                                     sizeof(kffi_native_engine_methods[0]))) != JNI_OK) {
        return JNI_ERR;
    }
    if (kffi_register_natives(env, "org/graphiks/kffi/engine/UpcallEngine",
                              kffi_upcall_engine_methods,
                              (jint)(sizeof(kffi_upcall_engine_methods) /
                                     sizeof(kffi_upcall_engine_methods[0]))) != JNI_OK) {
        return JNI_ERR;
    }
    kffi_upcall_init(vm);
    return JNI_VERSION_1_6;
}
