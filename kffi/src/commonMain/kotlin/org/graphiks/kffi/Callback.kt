package org.graphiks.kffi

interface Callback

enum class CallbackPolicy {
    ONCE,
    REPEATING,
}

fun interface CallbackExceptionHandler {
    fun onException(error: Throwable)

    companion object {
        val Default: CallbackExceptionHandler = CallbackExceptionHandler(::reportUnhandledCallbackException)
    }
}

interface CallbackRegistration<C : Callback> : AutoCloseable {
    val callback: NativeAddress
    val userdata: NativeAddress?
    val policy: CallbackPolicy
    val isClosed: Boolean

    /** True only after closure, route revocation, and every acquired native delivery has returned. */
    val isQuiescent: Boolean

    /**
     * Runs [action] exactly once after this registration is closed and every
     * acquired native delivery has returned. If it is already quiescent,
     * [action] runs before this method returns. Failures are reported through
     * this registration's [CallbackExceptionHandler]. The action runs
     * synchronously on the thread that establishes or observes quiescence;
     * no thread affinity or concurrent ordering is guaranteed.
     */
    fun onQuiescent(action: () -> Unit)

    override fun close()
}

@RequiresOptIn(
    level = RequiresOptIn.Level.ERROR,
    message = "Re-arming a callback without userdata can route a delayed native call to the wrong Kotlin lambda unless native quiescence has already been established.",
)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class UnsafeCallbackRearmApi

@RequiresOptIn(
    level = RequiresOptIn.Level.ERROR,
    message = "This API is reserved for generated callback bindings.",
)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.BINARY)
annotation class CallbackRuntimeApi
