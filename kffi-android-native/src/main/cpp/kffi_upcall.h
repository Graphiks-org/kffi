#ifndef KFFI_UPCALL_H
#define KFFI_UPCALL_H

#include <jni.h>

/*
 * kffi Android upcall engine: dynamically typed libffi closures that let a C
 * library invoke a Kotlin static dispatcher from an arbitrary thread. See
 * kffi_upcall.c.
 */

#define KFFI_UPCALL_ALLOCATE_JNI_SIGNATURE \
    "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J"

/* Called once from JNI_OnLoad. */
void kffi_upcall_init(JavaVM *vm);

/*
 * JNI entry points bound explicitly through RegisterNatives in JNI_OnLoad.
 * Declared here so kffi_engine.c can reference their addresses in the
 * JNINativeMethod table for org/graphiks/kffi/engine/UpcallEngine.
 */
JNIEXPORT jlong JNICALL Java_org_graphiks_kffi_engine_UpcallEngine_allocateTrampoline(
    JNIEnv *env, jclass cls, jclass dispatcherClass, jstring dispatchMethod,
    jstring dispatchJvmSignature, jstring dispatchAbiSignature);
JNIEXPORT void JNICALL Java_org_graphiks_kffi_engine_UpcallEngine_freeTrampoline(
    JNIEnv *env, jclass cls, jlong address);

#endif /* KFFI_UPCALL_H */
