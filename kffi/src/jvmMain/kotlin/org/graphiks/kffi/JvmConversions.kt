package org.graphiks.kffi

import java.lang.foreign.MemorySegment

/** Ephemeral unscoped FFM segment for a raw address; zero maps to a null segment. */
internal fun NativeAddress.toJvmSegmentOrNull(): MemorySegment? =
    if (rawValue == 0L) null else MemorySegment.ofAddress(rawValue)

/** Reads or writes the scope: derives a [size]-bounded segment from the raw address. */
internal fun NativeAddress.toJvmSegment(size: Long): MemorySegment {
    require(rawValue != 0L) { "Cannot derive segment from null address" }
    return MemorySegment.ofAddress(rawValue).reinterpret(size)
}
