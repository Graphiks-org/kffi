package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import org.graphiks.kffi.win32.generated.GlobalLock
import org.graphiks.kffi.win32.generated.GlobalSize
import org.graphiks.kffi.win32.generated.GlobalUnlock
import org.graphiks.kffi.win32.generated.ReleaseStgMedium
import org.graphiks.kffi.win32.generated.tagFORMATETC
import org.graphiks.kffi.win32.generated.tagSTGMEDIUM

/**
 * HGLOBAL and STGMEDIUM primitives behind an injectable port so the copy and
 * release discipline stays provable without Windows.
 */
internal interface Win32DropNativePort {
    fun globalSize(handle: Long): Long
    fun globalLock(handle: Long): Long
    fun globalUnlock(handle: Long)
    fun releaseMedium(medium: MemorySegment)

    companion object {
        val native: Win32DropNativePort = object : Win32DropNativePort {
            override fun globalSize(handle: Long): Long = GlobalSize(MemorySegment.ofAddress(handle))
            override fun globalLock(handle: Long): Long = GlobalLock(MemorySegment.ofAddress(handle)).address()
            override fun globalUnlock(handle: Long) { GlobalUnlock(MemorySegment.ofAddress(handle)) }
            override fun releaseMedium(medium: MemorySegment) { ReleaseStgMedium(medium) }
        }
    }
}

/**
 * One retained IDataObject reference. The receiver owns the reference and must
 * close it exactly once; native storage never escapes. Reads are bounded by the
 * caller-provided limits, the medium is always released, and unknown payload
 * shapes fail with a typed HRESULT instead of being approximated.
 */
public class Win32DropData internal constructor(
    private val dataObject: Long,
    private val port: Win32DropNativePort = Win32DropNativePort.native,
) : AutoCloseable {
    private var closed = false

    /** Enumerates up to [max] copied formats; more formats than the caller accepts fail instead of truncating. */
    public fun formats(max: Int): List<Win32DropFormat> {
        require(max in 1..MAX_FORMAT_LIMIT)
        checkOpen()
        val enum = Arena.ofConfined().use { arena ->
            val output = arena.allocate(ValueLayout.ADDRESS)
            Win32TextComAbi.check(Win32TextComAbi.call(dataObject, SLOT_ENUM, "ip", DATADIR_GET, output))
            output.get(ValueLayout.ADDRESS, 0).address()
        }
        if (enum == 0L) throw Win32DropException(E_POINTER)
        try {
            val result = ArrayList<Win32DropFormat>(minOf(max, 8))
            Arena.ofConfined().use { arena ->
                val fetched = arena.allocate(4, 4)
                val element = tagFORMATETC.allocate(arena)
                while (true) {
                    fetched.set(ValueLayout.JAVA_INT, 0, 0)
                    val result_ = Win32TextComAbi.call(enum, SLOT_NEXT, "ipp", DATADIR_GET, element, fetched)
                    Win32TextComAbi.check(result_)
                    if (fetched.get(ValueLayout.JAVA_INT, 0) == 0) break
                    if (result.size >= max) throw Win32DropException(Win32DropFormats.E_OUT_OF_MEMORY)
                    result += Win32DropFormat(
                        element.get(ValueLayout.JAVA_SHORT, FORMATETC_CF).toInt(),
                        element.get(ValueLayout.JAVA_INT, FORMATETC_TYMED),
                        element.get(ValueLayout.JAVA_INT, FORMATETC_ASPECT),
                        element.get(ValueLayout.JAVA_INT, FORMATETC_LINDEX),
                    )
                }
            }
            return result
        } finally {
            Win32TextComAbi.release(enum)
        }
    }

    /** Cheap QueryGetData probe with content aspect and the HGLOBAL|ISTREAM tymed mask; no medium is acquired. */
    public fun hasFormat(clipboardFormat: Int): Boolean {
        checkOpen()
        Arena.ofConfined().use { arena ->
            val formatetc = tagFORMATETC.allocate(arena)
            writeFormatEtc(formatetc, clipboardFormat, TYMED_HGLOBAL or TYMED_ISTREAM)
            return Win32TextComAbi.call(dataObject, SLOT_QUERY, "p", formatetc) == 0
        }
    }

    /** Copies an HGLOBAL medium, bounded by [maxBytes]; a larger payload fails instead of truncating. */
    public fun readHGlobal(clipboardFormat: Int, maxBytes: Long): ByteArray {
        require(maxBytes >= 0)
        checkOpen()
        Arena.ofConfined().use { arena ->
            val formatetc = tagFORMATETC.allocate(arena)
            writeFormatEtc(formatetc, clipboardFormat, TYMED_HGLOBAL)
            val medium = tagSTGMEDIUM.allocate(arena)
            Win32TextComAbi.check(Win32TextComAbi.call(dataObject, SLOT_GET_DATA, "pp", formatetc, medium))
            try {
                if (medium.get(ValueLayout.JAVA_INT, STGMEDIUM_TYMED) != TYMED_HGLOBAL) throw Win32DropException(DV_E_TYMED)
                val handle = medium.get(ValueLayout.ADDRESS, STGMEDIUM_U).address()
                if (handle == 0L) throw Win32DropException(E_POINTER)
                val size = port.globalSize(handle)
                if (size > maxBytes) throw Win32DropException(Win32DropFormats.E_OUT_OF_MEMORY)
                if (size == 0L) return ByteArray(0)
                val pointer = port.globalLock(handle)
                if (pointer == 0L) throw Win32DropException(E_FAIL)
                try {
                    return MemorySegment.ofAddress(pointer).reinterpret(size).toArray(ValueLayout.JAVA_BYTE)
                } finally {
                    port.globalUnlock(handle)
                }
            } finally {
                port.releaseMedium(medium)
            }
        }
    }

    /**
     * Retains a TYMED_ISTREAM medium as an owned reference before the medium is
     * released, so the stream stays readable after the native callback returned.
     */
    public fun retainStream(clipboardFormat: Int): Win32DropStream {
        checkOpen()
        Arena.ofConfined().use { arena ->
            val formatetc = tagFORMATETC.allocate(arena)
            writeFormatEtc(formatetc, clipboardFormat, TYMED_ISTREAM)
            val medium = tagSTGMEDIUM.allocate(arena)
            Win32TextComAbi.check(Win32TextComAbi.call(dataObject, SLOT_GET_DATA, "pp", formatetc, medium))
            try {
                if (medium.get(ValueLayout.JAVA_INT, STGMEDIUM_TYMED) != TYMED_ISTREAM) throw Win32DropException(DV_E_TYMED)
                val stream = medium.get(ValueLayout.ADDRESS, STGMEDIUM_U).address()
                if (stream == 0L) throw Win32DropException(E_POINTER)
                Win32TextComAbi.addRef(stream)
                return Win32DropStream(stream)
            } finally {
                port.releaseMedium(medium)
            }
        }
    }

    /**
     * Copies and parses a wide CF_HDROP block. Legacy ANSI lists are refused
     * instead of guessing a code page; exceeding the path or code-unit limits
     * fails instead of truncating.
     */
    public fun filePaths(maxPaths: Int, maxCodeUnits: Int): List<String> {
        require(maxPaths in 1..MAX_FORMAT_LIMIT)
        require(maxCodeUnits in 1..MAX_PATH_CODE_UNITS)
        checkOpen()
        val maxBytes = DROPFILES_HEADER + 2L * (maxCodeUnits + 1L) * maxPaths
        val raw = readHGlobal(CF_HDROP, maxBytes)
        if (raw.size < DROPFILES_HEADER) throw Win32DropException(DV_E_FORMATETC)
        val wide = raw[16].toInt() != 0
        if (!wide) throw Win32DropException(DV_E_FORMATETC)
        var offset = ((raw[0].toInt() and 0xFF) or ((raw[1].toInt() and 0xFF) shl 8) or
            ((raw[2].toInt() and 0xFF) shl 16) or ((raw[3].toInt() and 0xFF) shl 24))
        if (offset < DROPFILES_HEADER || offset > raw.size) throw Win32DropException(DV_E_FORMATETC)
        val paths = ArrayList<String>(minOf(maxPaths, 4))
        var codeUnits = 0
        while (offset + 1 < raw.size) {
            var builder = StringBuilder()
            var length = 0
            while (offset + 1 < raw.size) {
                val unit = ((raw[offset].toInt() and 0xFF) or ((raw[offset + 1].toInt() and 0xFF) shl 8)).toChar()
                offset += 2
                if (unit == '\u0000') break
                builder.append(unit)
                length++
                if (length > maxCodeUnits) throw Win32DropException(Win32DropFormats.E_OUT_OF_MEMORY)
            }
            if (builder.isEmpty()) break // the terminating double NUL
            codeUnits += length
            if (codeUnits > maxCodeUnits || paths.size >= maxPaths) throw Win32DropException(Win32DropFormats.E_OUT_OF_MEMORY)
            paths += builder.toString()
            builder = StringBuilder()
        }
        return paths
    }

    private fun checkOpen() {
        if (closed) throw Win32DropException(DISCONNECTED)
    }

    override fun close() {
        if (closed) return
        closed = true
        val target = dataObject
        if (target != 0L) Win32TextComAbi.release(target)
    }

    internal companion object {
        internal const val CF_HDROP: Int = Win32DropFormats.CF_HDROP
        internal const val TYMED_HGLOBAL: Int = Win32DropFormats.TYMED_HGLOBAL
        internal const val TYMED_ISTREAM: Int = Win32DropFormats.TYMED_ISTREAM
        internal const val DATADIR_GET: Int = 1
        internal const val MAX_FORMAT_LIMIT: Int = 4096
        internal const val MAX_PATH_CODE_UNITS: Int = 1 shl 16

        // tagFORMATETC offsets, Win64: SHORT cfFormat; pad(6); DVTARGETDEVICE* ptd; DWORD dwAspect; LONG lindex; DWORD tymed; pad(4).
        internal const val FORMATETC_CF: Long = 0
        internal const val FORMATETC_PTD: Long = 8
        internal const val FORMATETC_ASPECT: Long = 16
        internal const val FORMATETC_LINDEX: Long = 20
        internal const val FORMATETC_TYMED: Long = 24

        // tagSTGMEDIUM offsets, Win64: DWORD tymed; pad(4); union u (hGlobal/pstm); IUnknown* pUnkForRelease.
        internal const val STGMEDIUM_TYMED: Long = 0
        internal const val STGMEDIUM_U: Long = 8
        internal const val STGMEDIUM_PUNK: Long = 16

        internal const val DROPFILES_HEADER: Long = 20

        // IDataObject / IEnumFORMATETC vtable slots, objidl.h order including IUnknown.
        internal const val SLOT_GET_DATA: Int = 3
        internal const val SLOT_QUERY: Int = 5
        internal const val SLOT_ENUM: Int = 8
        internal const val SLOT_NEXT: Int = 3

        // ISequentialStream::Read
        internal const val SLOT_READ: Int = 3

        internal const val DV_E_FORMATETC: Int = -2147221404 // 0x80040064
        internal const val DV_E_TYMED: Int = -2147221399 // 0x80040069
        internal const val E_POINTER: Int = -2147467261 // 0x80004003
        internal const val E_FAIL: Int = -2147467259 // 0x80004005
        internal const val DISCONNECTED: Int = 0x80010108.toInt() // RPC_E_DISCONNECTED

        internal fun writeFormatEtc(segment: MemorySegment, clipboardFormat: Int, tymed: Int) {
            segment.set(ValueLayout.JAVA_SHORT, FORMATETC_CF, clipboardFormat.toShort())
            segment.set(ValueLayout.ADDRESS, FORMATETC_PTD, MemorySegment.NULL)
            segment.set(ValueLayout.JAVA_INT, FORMATETC_ASPECT, Win32DropFormats.DVASPECT_CONTENT)
            segment.set(ValueLayout.JAVA_INT, FORMATETC_LINDEX, -1)
            segment.set(ValueLayout.JAVA_INT, FORMATETC_TYMED, tymed)
        }
    }
}

/**
 * One retained IStream reference, readable only on its creating (STA) thread.
 * Read returns the delivered byte count; fewer bytes than requested mean EOF.
 */
public class Win32DropStream internal constructor(private val stream: Long) : AutoCloseable {
    private val thread = Thread.currentThread()
    private var closed = false

    public fun read(sink: ByteArray): Int {
        require(sink.isNotEmpty())
        checkThread()
        checkOpen()
        Arena.ofConfined().use { arena ->
            val scratch = arena.allocate(sink.size.toLong(), 1)
            val read = arena.allocate(4, 4)
            read.set(ValueLayout.JAVA_INT, 0, 0)
            Win32TextComAbi.check(Win32TextComAbi.call(stream, Win32DropData.SLOT_READ, "pip", scratch, sink.size, read))
            val count = read.get(ValueLayout.JAVA_INT, 0)
            if (count < 0 || count > sink.size) throw Win32DropException(Win32DropData.E_FAIL)
            if (count > 0) MemorySegment.copy(scratch, 0, MemorySegment.ofArray(sink), 0, count.toLong())
            return count
        }
    }

    private fun checkThread() {
        if (Thread.currentThread() !== thread) throw Win32DropException(WRONG_THREAD)
    }

    private fun checkOpen() {
        if (closed) throw Win32DropException(DISCONNECTED)
    }

    override fun close() {
        if (closed) return
        closed = true
        val target = stream
        if (target != 0L) Win32TextComAbi.release(target)
    }

    private companion object {
        val WRONG_THREAD: Int = 0x8001010e.toInt() // RPC_E_WRONG_THREAD
        val DISCONNECTED: Int = 0x80010108.toInt() // RPC_E_DISCONNECTED
    }
}
