package org.graphiks.kffi.engine

/**
 * Android upcall engine: allocates JNI/libffi trampolines for generated
 * callback dispatchers.
 *
 * Trampolines are native resources. Before calling [freeTrampoline],
 * generated/native code must unregister the callback from the C library, stop
 * and join every native callback producer, and only then free the closure.
 * [org.graphiks.kffi.CallbackRegistration.isQuiescent] only reports callbacks
 * that already entered the Kotlin dispatcher; it cannot account for a native
 * callback that has not reached Kotlin yet.
 */
object UpcallEngine {
    /**
     * Creates a trampoline that calls [dispatcherClass]'s static
     * [dispatchMethod]. [dispatchJvmSignature] is the JNI dispatcher signature;
     * [dispatchAbiSignature] is the C callback ABI signature.
     */
    external fun allocateTrampoline(
        dispatcherClass: Class<*>,
        dispatchMethod: String,
        dispatchJvmSignature: String,
        dispatchAbiSignature: String,
    ): Long

    /**
     * Frees a trampoline previously returned by [allocateTrampoline].
     *
     * Call this only after native code has unregistered the callback from the
     * target C library, stopped and joined every thread or producer that can
     * still invoke it, and allowed any in-flight Kotlin dispatch to return.
     * [org.graphiks.kffi.CallbackRegistration.isQuiescent] alone is not enough
     * because a native callback may still be racing toward the trampoline
     * without having entered Kotlin yet.
     */
    external fun freeTrampoline(address: Long)
}
