package org.graphiks.kffi.coretext

/** Six detached CGFloat values from a 64-bit macOS affine transform. */
public data class CGAffineTransform(
    /** Horizontal scale coefficient. */
    public val a: Double,
    /** First off-diagonal coefficient. */
    public val b: Double,
    /** Second off-diagonal coefficient. */
    public val c: Double,
    /** Vertical scale coefficient. */
    public val d: Double,
    /** Horizontal translation. */
    public val tx: Double,
    /** Vertical translation. */
    public val ty: Double,
)
