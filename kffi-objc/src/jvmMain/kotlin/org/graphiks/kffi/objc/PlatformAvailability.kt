package org.graphiks.kffi.objc

@MustBeDocumented
@Repeatable
@RequiresOptIn(
    message = "Check platform availability at runtime before using this declaration.",
    level = RequiresOptIn.Level.ERROR,
)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.TYPEALIAS,
)
@Retention(AnnotationRetention.BINARY)
annotation class PlatformAvailability(
    val platform: String,
    val introducedMajor: Int = -1,
    val introducedMinor: Int = -1,
    val introducedSubminor: Int = -1,
    val deprecated: Boolean = false,
    val deprecatedMajor: Int = -1,
    val deprecatedMinor: Int = -1,
    val deprecatedSubminor: Int = -1,
    val obsoletedMajor: Int = -1,
    val obsoletedMinor: Int = -1,
    val obsoletedSubminor: Int = -1,
    val unavailable: Boolean = false,
    val message: String = "",
)
