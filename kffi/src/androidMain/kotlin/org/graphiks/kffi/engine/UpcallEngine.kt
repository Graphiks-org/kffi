package org.graphiks.kffi.engine

object UpcallEngine {
    external fun allocateTrampoline(
        dispatcherClass: Class<*>,
        dispatchMethod: String,
        dispatchJvmSignature: String,
        dispatchAbiSignature: String,
    ): Long

    @Deprecated("Pass the JVM and C ABI signatures separately")
    fun allocateTrampoline(
        dispatcherClass: Class<*>,
        dispatchMethod: String,
        dispatchJvmSignature: String,
    ): Long = allocateTrampoline(
        dispatcherClass,
        dispatchMethod,
        dispatchJvmSignature,
        "v(u32,ptr)",
    )

    external fun freeTrampoline(address: Long)
}
