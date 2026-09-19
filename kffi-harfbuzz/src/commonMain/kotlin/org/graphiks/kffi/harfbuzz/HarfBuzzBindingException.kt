package org.graphiks.kffi.harfbuzz

/**
 * Technical failure categories for the optional HarfBuzz bindings.
 *
 * These are binding-level categories only: typographic policy, user-facing
 * diagnostics and fallback belong to the consumer.
 */
public enum class HarfBuzzBindingFailure {
    /** The operating system, architecture or pointer width is unsupported. */
    UNSUPPORTED_PLATFORM,
    /** The embedded native library resource is absent from the artifact. */
    RESOURCE_MISSING,
    /** The embedded native library resource failed its SHA-256 verification. */
    RESOURCE_CORRUPT,
    /** The native library could not be loaded, including restricted native access. */
    LIBRARY_LOAD,
    /** A required native symbol could not be resolved. */
    SYMBOL_RESOLUTION,
    /** The loaded library does not report the version the binding was built against. */
    VERSION_MISMATCH,
}

/**
 * A technical HarfBuzz binding failure, preserving its native or JVM cause when available.
 *
 * The consumer maps [failure] to its own portable error codes; this type carries no
 * typographic meaning.
 */
public class HarfBuzzBindingException(
    /** The technical category. */
    public val failure: HarfBuzzBindingFailure,
    message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause)
