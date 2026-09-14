package org.graphiks.kffi.coretext

import org.graphiks.kffi.MemoryAllocator
import org.graphiks.kffi.NativeAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class CoreTextFontTest {
    // Catches non-copying CFData, wrong size forwarding, or broken native struct reads.
    @Test fun suppliedFontBytesKeepTheirAuditedAdvancesAfterTransferBufferClosure() {
        for ((size, expected) in listOf(2048.0 to 1366.0, 1024.0 to 683.0)) {
            withCreatedFont(originalBytes(), size) { font, api ->
                assertEquals(expected, CoreTextConsumerProbe.horizontalAdvance(font, 36), 0.000001)
                assertEquals(size, api.fontSize(font))
                assertEquals(2048u, api.unitsPerEm(font))
                MemoryAllocator().use { memory ->
                    assertEquals(CGAffineTransform(1.0, 0.0, 0.0, 1.0, 0.0, 0.0), api.fontMatrix(font, memory))
                }
            }
        }
    }

    // Catches name-based substitution instead of constructing from the supplied bytes.
    @Test fun sameNameFontWithDistinctSourceAdvanceIsNotSubstitutedByTheOriginal() {
        for ((size, expected) in listOf(2048.0 to 2000.0, 1024.0 to 1000.0)) {
            withCreatedFont(modifiedBytes(), size) { font, _ ->
                assertEquals(expected, CoreTextConsumerProbe.horizontalAdvance(font, 36), 0.000001)
            }
        }
    }
}

private fun originalBytes(): ByteArray = checkNotNull(
    CoreTextFontTest::class.java.getResourceAsStream("/fonts/liberation/LiberationSans-Regular.ttf"),
).use { it.readBytes() }

private fun modifiedBytes(): ByteArray = originalBytes().also { bytes ->
    bytes[0x2a8] = 0x07
    bytes[0x2a9] = 0xd0.toByte()
    fun writeUInt(offset: Int, value: UInt) {
        for (index in 0..3) bytes[offset + index] = (value shr (24 - 8 * index)).toByte()
    }
    writeUInt(0xd0, 0x7f4ed31du)
    writeUInt(0x144, 0xb82f9d90u)
}

private fun withCreatedFont(bytes: ByteArray, size: Double, observe: (NativeAddress, CoreText) -> Unit) {
    val api = CoreText()
    var data = NativeAddress(0)
    var provider = NativeAddress(0)
    var graphicsFont = NativeAddress(0)
    var font = NativeAddress(0)
    try {
        MemoryAllocator().use { transfer ->
            val buffer = transfer.allocateBuffer(bytes.size.toULong())
            buffer.writeBytes(bytes)
            data = api.createData(buffer.handler, bytes.size.toLong())
            assertNotEquals(0L, data.rawValue)
            provider = api.createProvider(data)
            assertNotEquals(0L, provider.rawValue)
            graphicsFont = api.createGraphicsFont(provider)
            assertNotEquals(0L, graphicsFont.rawValue)
            font = api.createFont(graphicsFont, size)
            assertNotEquals(0L, font.rawValue)
        }
        observe(font, api)
    } finally {
        try {
            if (font.rawValue != 0L) api.releaseCF(font)
        } finally {
            try {
                if (graphicsFont.rawValue != 0L) api.releaseGraphicsFont(graphicsFont)
            } finally {
                try {
                    if (provider.rawValue != 0L) api.releaseProvider(provider)
                } finally {
                    if (data.rawValue != 0L) api.releaseCF(data)
                }
            }
        }
    }
}
