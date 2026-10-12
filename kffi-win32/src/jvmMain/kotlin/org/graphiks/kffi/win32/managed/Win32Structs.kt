package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/** Hand-written Win64 ABI layouts for the phase 0 window frontier. KFFI owns all FFI. */
public object Win32Structs {
    private val jlong: ValueLayout.OfLong = ValueLayout.JAVA_LONG
    private val jint: ValueLayout.OfInt = ValueLayout.JAVA_INT

    public class WndClassExW internal constructor() {
        // Win64: UINT cbSize; UINT style; WNDPROC lpfnWndProc; int cbClsExtra;
        // int cbWndExtra; HINSTANCE hInstance; HICON hIcon; HCURSOR hCursor;
        // HBRUSH hbrBackground; LPCWSTR lpszMenuName; LPCWSTR lpszClassName; HICON hIconSm;
        public val layout: MemoryLayout =
            MemoryLayout.structLayout(
                jint.withName("cbSize"),
                jint.withName("style"),
                jlong.withName("lpfnWndProc"),
                jint.withName("cbClsExtra"),
                jint.withName("cbWndExtra"),
                jlong.withName("hInstance"),
                jlong.withName("hIcon"),
                jlong.withName("hCursor"),
                jlong.withName("hbrBackground"),
                jlong.withName("lpszMenuName"),
                jlong.withName("lpszClassName"),
                jlong.withName("hIconSm"),
            )
        public val byteSize: Long = layout.byteSize()
        public val cbSizeOffset: Long = 0L
        public val styleOffset: Long = 4L
        public val lpfnWndProcOffset: Long = 8L
        public val hInstanceOffset: Long = 24L
        public val lpszClassNameOffset: Long = 64L
        public val hIconSmOffset: Long = 72L

        public fun allocate(arena: Arena): MemorySegment = arena.allocate(layout)

        public fun getCbSize(segment: MemorySegment): Int = segment.get(jint, cbSizeOffset)
        public fun setCbSize(segment: MemorySegment, value: Int) {
            segment.set(jint, cbSizeOffset, value)
        }

        public fun getStyle(segment: MemorySegment): Int = segment.get(jint, styleOffset)
        public fun setStyle(segment: MemorySegment, value: Int) {
            segment.set(jint, styleOffset, value)
        }

        public fun getLpfnWndProc(segment: MemorySegment): Long = segment.get(jlong, lpfnWndProcOffset)
        public fun setLpfnWndProc(segment: MemorySegment, value: Long) {
            segment.set(jlong, lpfnWndProcOffset, value)
        }

        public fun getHInstance(segment: MemorySegment): Long = segment.get(jlong, hInstanceOffset)
        public fun setHInstance(segment: MemorySegment, value: Long) {
            segment.set(jlong, hInstanceOffset, value)
        }

        public fun getLpszClassName(segment: MemorySegment): Long = segment.get(jlong, lpszClassNameOffset)
        public fun setLpszClassName(segment: MemorySegment, value: Long) {
            segment.set(jlong, lpszClassNameOffset, value)
        }
    }

    public class Msg internal constructor() {
        // Win64: HWND hwnd; UINT message; WPARAM wParam; LPARAM lParam;
        // DWORD time; POINT pt; DWORD lPrivate;
        public val layout: MemoryLayout =
            MemoryLayout.structLayout(
                jlong.withName("hwnd"),
                jint.withName("message"),
                MemoryLayout.paddingLayout(4),
                jlong.withName("wParam"),
                jlong.withName("lParam"),
                jint.withName("time"),
                MemoryLayout.sequenceLayout(2, jint).withName("pt"),
                jint.withName("lPrivate"),
            )
        public val byteSize: Long = layout.byteSize()
        public val hwndOffset: Long = 0L
        public val messageOffset: Long = 8L
        public val wParamOffset: Long = 16L
        public val lParamOffset: Long = 24L
        public val timeOffset: Long = 32L
        public val ptXOffset: Long = 36L
        public val ptYOffset: Long = 40L

        public fun allocate(arena: Arena): MemorySegment = arena.allocate(layout)

        public fun getHwnd(segment: MemorySegment): Long = segment.get(jlong, hwndOffset)
        public fun setHwnd(segment: MemorySegment, value: Long) {
            segment.set(jlong, hwndOffset, value)
        }

        public fun getMessage(segment: MemorySegment): Int = segment.get(jint, messageOffset)
        public fun setMessage(segment: MemorySegment, value: Int) {
            segment.set(jint, messageOffset, value)
        }

        public fun getWParam(segment: MemorySegment): Long = segment.get(jlong, wParamOffset)
        public fun setWParam(segment: MemorySegment, value: Long) {
            segment.set(jlong, wParamOffset, value)
        }
        public fun getLParam(segment: MemorySegment): Long = segment.get(jlong, lParamOffset)
        public fun getTime(segment: MemorySegment): Int = segment.get(jint, timeOffset)
        public fun getPtX(segment: MemorySegment): Int = segment.get(jint, ptXOffset)
        public fun getPtY(segment: MemorySegment): Int = segment.get(jint, ptYOffset)
    }

    public val wndClassExW: WndClassExW = WndClassExW()
    public val msg: Msg = Msg()
}
