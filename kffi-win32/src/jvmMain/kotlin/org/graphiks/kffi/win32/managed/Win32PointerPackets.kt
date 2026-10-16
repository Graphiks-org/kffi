package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.math.PI

public object Win32PointerPackets {
    /** Called while the originating pointer message is being dispatched. History is newest first. */
    public fun read(pointerId: Int, maxPointers: Int, maxFrames: Int, budget: Win32PayloadBudget): Win32PointerBatch {
        require(pointerId > 0 && maxPointers > 0 && maxFrames > 0)
        requireWin32Input()
        return Arena.ofConfined().use { arena ->
            val typeOut = arena.allocate(4, 4)
            if (GetPointerType(pointerId, typeOut) == 0) throw Win32PointerException(GetLastError())
            val type = typeOut.get(ValueLayout.JAVA_INT, 0)
            fun history(frames: MemorySegment, pointers: MemorySegment, output: MemorySegment): Int = when (type) {
                2 -> GetPointerFrameTouchInfoHistory(pointerId, frames, pointers, output)
                3 -> GetPointerFramePenInfoHistory(pointerId, frames, pointers, output)
                else -> GetPointerFrameInfoHistory(pointerId, frames, pointers, output)
            }
            readFrames(type, maxPointers, maxFrames, budget, ::history, ::GetLastError)
        }
    }

    internal fun readFrames(type: Int, maxPointers: Int, maxFrames: Int, budget: Win32PayloadBudget,
        history: (MemorySegment, MemorySegment, MemorySegment) -> Int, lastError: () -> Int): Win32PointerBatch {
        val stride = when (type) { 2 -> 144; 3 -> 120; else -> 96 }
        return Arena.ofConfined().use { arena ->
            val framesOut = arena.allocate(4, 4)
            val pointersOut = arena.allocate(4, 4)
            repeat(3) {
                framesOut.set(ValueLayout.JAVA_INT, 0, 0); pointersOut.set(ValueLayout.JAVA_INT, 0, 0)
                val probed = history(framesOut, pointersOut, MemorySegment.NULL)
                val error = if (probed == 0) lastError() else 0
                if (probed == 0 && error != 122) throw Win32PointerException(error)
                val frames = framesOut.get(ValueLayout.JAVA_INT, 0)
                val pointers = pointersOut.get(ValueLayout.JAVA_INT, 0)
                val bytes = checkedBytes(pointers, frames, stride, maxPointers, maxFrames)
                val lease = budget.retain(bytes) ?: throw Win32PointerException(8)
                var transferred = false
                try {
                    Arena.ofConfined().use copy@ { copyArena ->
                        val buffer = copyArena.allocate(pointers.toLong() * frames * stride, 8)
                        val read = history(framesOut, pointersOut, buffer)
                        val readError = if (read == 0) lastError() else 0
                        if (read == 0) {
                            if (readError == 122) return@copy
                            throw Win32PointerException(readError)
                        }
                        val actualFrames = framesOut.get(ValueLayout.JAVA_INT, 0)
                        val actualPointers = pointersOut.get(ValueLayout.JAVA_INT, 0)
                        checkedBytes(actualPointers, actualFrames, stride, maxPointers, maxFrames)
                        // SDK success may still contain only the most recent rows, with total counts in outputs.
                        if (actualPointers > pointers || actualFrames > frames) return@copy
                        val result = List(actualFrames) { frame ->
                            val start = frame.toLong() * actualPointers * stride
                            val frameId = buffer.get(ValueLayout.JAVA_INT, start + 8)
                            val samples = List(actualPointers) { index ->
                                val packet = buffer.asSlice(start + index.toLong() * stride, stride.toLong())
                                require(packet.get(ValueLayout.JAVA_INT, 8) == frameId) { "Inconsistent pointer frame" }
                                decode(packet, type)
                            }
                            require(samples.map { it.id }.toSet().size == actualPointers) { "Duplicate pointer in frame" }
                            Win32PointerFrame(frameId, samples)
                        }
                        transferred = true
                        return Win32PointerBatch(result, lease)
                    }
                } finally { if (!transferred) lease.close() }
            }
            throw Win32PointerException(122)
        }
    }

    /** Windows' MI_WP_SIGNATURE identifies pen/touch promotion; ordinary mouse messages do not match. */
    public fun isPromotedMouseMessage(): Boolean {
        requireWin32Input()
        return isPromotedSignature(GetMessageExtraInfo())
    }
    internal fun isPromotedSignature(extra: Long): Boolean {
        return extra and 0xffffff00L == 0xff515700L
    }

    // Reserve both native scratch and copied scalar payload before allocation, including every history entry.
    internal fun checkedBytes(pointers: Int, frames: Int, stride: Int, maxPointers: Int, maxFrames: Int): Long {
        require(pointers in 1..maxPointers && frames in 1..maxFrames && stride in 96..144)
        val count = Math.multiplyExact(pointers.toLong(), frames.toLong())
        require(count <= Int.MAX_VALUE) { "Pointer history exceeds collection capacity" }
        return Math.multiplyExact(count, stride.toLong() + 96L)
    }

    internal fun decode(packet: MemorySegment, type: Int): Win32PointerSample {
        fun int(offset: Long) = packet.get(ValueLayout.JAVA_INT, offset)
        fun point(offset: Long) = Win32Point(int(offset), int(offset + 4))
        require(int(0) == type && int(4) > 0) { "Invalid pointer packet" }
        var pressure: Double? = null; var x: Double? = null; var y: Double? = null; var twist: Double? = null
        val penFlags = if (type == 3) int(96) else 0
        if (type == 3) {
            val mask = int(100)
            if (mask and 1 != 0) pressure = int(104).takeIf { it in 0..1024 }?.div(1024.0)
            if (mask and 2 != 0) twist = int(108).takeIf { it in 0..359 }?.times(PI / 180.0)
            if (mask and 4 != 0) x = int(112).takeIf { it in -90..90 }?.toDouble()
            if (mask and 8 != 0) y = int(116).takeIf { it in -90..90 }?.toDouble()
        } else if (type == 2 && int(100) and 4 != 0) {
            pressure = int(140).takeIf { it in 0..1024 }?.div(1024.0)
        }
        return Win32PointerSample(int(4), type, int(12), point(32), pressure, x, y, twist,
            penFlags and 4 != 0, packet.get(ValueLayout.JAVA_LONG, 16), packet.get(ValueLayout.JAVA_LONG, 24),
            int(64), int(68), int(72), int(76), packet.get(ValueLayout.JAVA_LONG, 80), int(88),
            point(40), point(48), point(56), penFlags)
    }

    /** Reconstitutes only POINTER_INFO, from copied scalar values, for the OS recognizer. */
    internal fun encode(packet: MemorySegment, frameId: Int, value: Win32PointerSample) {
        fun int(offset: Long, value: Int) = packet.set(ValueLayout.JAVA_INT, offset, value)
        fun point(offset: Long, value: Win32Point) { int(offset, value.x); int(offset + 4, value.y) }
        int(0, value.type); int(4, value.id); int(8, frameId); int(12, value.flags)
        packet.set(ValueLayout.JAVA_LONG, 16, value.sourceDevice); packet.set(ValueLayout.JAVA_LONG, 24, value.target)
        point(32, value.position); point(40, value.himetric); point(48, value.rawPosition); point(56, value.rawHimetric)
        int(64, value.time); int(68, value.historyCount); int(72, value.inputData); int(76, value.keyStates)
        packet.set(ValueLayout.JAVA_LONG, 80, value.performanceCount); int(88, value.buttonChange)
    }
}
