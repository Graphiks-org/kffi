package org.graphiks.kffi.win32.managed

/** One copied POINTER_INFO and its own historical optional attributes. All coordinates are screen physical. */
public data class Win32PointerSample(
    public val id: Int, public val type: Int, public val flags: Int, public val position: Win32Point,
    public val pressure: Double? = null, public val tiltX: Double? = null, public val tiltY: Double? = null,
    public val twistRadians: Double? = null, public val eraser: Boolean = false,
    public val sourceDevice: Long = 0, public val target: Long = 0, public val time: Int = 0,
    public val historyCount: Int = 1, public val inputData: Int = 0, public val keyStates: Int = 0,
    public val performanceCount: Long = 0, public val buttonChange: Int = 0,
    public val himetric: Win32Point = position, public val rawPosition: Win32Point = position,
    public val rawHimetric: Win32Point = himetric, public val penFlags: Int = 0,
)
public data class Win32PointerFrame(public val frameId: Int, public val pointers: List<Win32PointerSample>)

/** Owns the reservation for copied frames. No borrowed native address escapes a window callback. */
public class Win32PointerBatch internal constructor(
    public val frames: List<Win32PointerFrame>, private val lease: AutoCloseable,
) : AutoCloseable {
    private val monitor = Any()
    private var closed = false
    private var readers = 0
    internal fun <T> borrow(block: (List<Win32PointerFrame>) -> T): T {
        synchronized(monitor) { check(!closed) { "Pointer batch is closed" }; readers++ }
        try { return block(frames) }
        finally { if (synchronized(monitor) { readers--; closed && readers == 0 }) lease.close() }
    }
    override fun close() {
        val release = synchronized(monitor) { if (closed) false else { closed = true; readers == 0 } }
        if (release) lease.close()
    }
}
public class Win32PointerException(public val error: Int) : IllegalStateException("Win32 pointer failure: $error")
