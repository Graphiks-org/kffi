package org.graphiks.kffi.apple

/** Technical failure categories for the optional Apple C bindings. */
public enum class AppleBindingFailure {
    /** The operating system, architecture or pointer width is unsupported. */
    UNSUPPORTED_PLATFORM,
    /** A native library could not be loaded, including restricted native access. */
    LIBRARY_LOAD,
    /** A required native symbol could not be resolved. */
    SYMBOL_RESOLUTION,
    /** A bounded Darwin query could not be completed. */
    SYSTEM_INFORMATION,
}

/** A technical binding failure, preserving its native or JVM cause when available. */
public class AppleBindingException(
    /** The technical category; application policy and diagnostics belong to the consumer. */
    public val failure: AppleBindingFailure,
    message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause)
