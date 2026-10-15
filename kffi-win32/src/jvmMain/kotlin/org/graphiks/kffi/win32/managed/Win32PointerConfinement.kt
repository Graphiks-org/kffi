package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/** Process broker. A foreign clip is never overwritten or cleared by release. */
public class Win32PointerConfinement(private val hwnd: Long) : AutoCloseable {
    private var owned: Win32WindowRect? = null
    public companion object {
        private val lock = Any()
        private var owner: Win32PointerConfinement? = null
        public fun currentClip(): Win32WindowRect { requireWin32Input(); return Arena.ofConfined().use { a ->
            val rect = a.allocate(16, 4); checked(GetClipCursor(rect), "GetClipCursor"); Win32WindowProperties.decodeRect(rect)
        } }
        private fun desktop(): Win32WindowRect = Win32WindowRect(GetSystemMetrics(76), GetSystemMetrics(77), GetSystemMetrics(78), GetSystemMetrics(79))
        private fun clip(value: Win32WindowRect?) { Arena.ofConfined().use { a ->
            val rect = value?.let { r -> a.allocate(16, 4).also {
                it.set(ValueLayout.JAVA_INT, 0, r.x); it.set(ValueLayout.JAVA_INT, 4, r.y)
                it.set(ValueLayout.JAVA_INT, 8, Math.addExact(r.x, r.width)); it.set(ValueLayout.JAVA_INT, 12, Math.addExact(r.y, r.height))
            } } ?: MemorySegment.NULL
            checked(ClipCursor(rect), "ClipCursor")
        } }
        private fun checked(ok: Int, operation: String) { if(ok == 0) { val error = GetLastError(); error("$operation failed: $error") } }
    }
    public fun acquire(): Boolean = synchronized(lock) {
        requireWin32Input()
        if(IsWindow(MemorySegment.ofAddress(hwnd)) == 0 || GetForegroundWindow().address() != hwnd) return false
        owner?.let { other ->
            if(other.owned != currentClip()) { other.owned = null; owner = null }
            else if(other !== this) return false
        }
        if(owner == null && currentClip() != desktop()) return false
        val next = clientScreenRect()
        clip(next)
        check(currentClip() == next) { "native confinement readback differs" }
        owned = next; owner = this
        true
    }
    public fun isActive(): Boolean = synchronized(lock) {
        if(owner !== this || owned == null) return false
        if(currentClip() != owned) { owner = null; owned = null; return false }
        true
    }
    public fun update(): Boolean = synchronized(lock) {
        if(!isActive()) return false
        if(GetForegroundWindow().address() != hwnd) { release(); return false }
        val next = clientScreenRect()
        clip(next); check(currentClip() == next) { "native confinement update differs" }; owned = next
        true
    }
    public fun release() { synchronized(lock) {
        if(owner === this) { if(owned != null && currentClip() == owned) clip(null); owner = null }
        owned = null
    } }
    override fun close() { release() }
    private fun clientScreenRect(): Win32WindowRect = Arena.ofConfined().use { a ->
        val h = MemorySegment.ofAddress(hwnd)
        val rect = a.allocate(16, 4); checked(GetClientRect(h, rect), "GetClientRect")
        val size = Win32WindowProperties.decodeRect(rect)
        require(size.width > 0 && size.height > 0)
        val point = a.allocate(8, 4); checked(ClientToScreen(h, point), "ClientToScreen")
        Win32WindowRect(point.get(ValueLayout.JAVA_INT, 0), point.get(ValueLayout.JAVA_INT, 4), size.width, size.height)
    }
}
