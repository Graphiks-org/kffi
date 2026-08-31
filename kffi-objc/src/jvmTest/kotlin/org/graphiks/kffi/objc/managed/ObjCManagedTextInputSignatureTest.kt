package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSRange
import org.graphiks.kffi.objc.NSRect
import org.graphiks.kffi.objc.NSSize
import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class ObjCManagedTextInputSignatureTest {
    @Test
    fun markedTextAndFirstRectSignaturesPreserveRangesAndStructReturn() {
        requireMacOS()
        val textInputClientMethods = mapOf(
            "insertText:replacementRange:" to ObjCMethodSignatures.VoidObjectRange,
            "setMarkedText:selectedRange:replacementRange:" to ObjCMethodSignatures.VoidObjectRangeRange,
            "selectedRange" to ObjCMethodSignatures.Range,
            "markedRange" to ObjCMethodSignatures.Range,
            "attributedSubstringForProposedRange:actualRange:" to ObjCMethodSignatures.ObjectRangeOutRange,
            "firstRectForCharacterRange:actualRange:" to ObjCMethodSignatures.RectRangeOutRange,
            "characterIndexForPoint:" to ObjCMethodSignatures.ULongPoint,
            "magnifyWithEvent:" to ObjCMethodSignatures.VoidObject,
            "rotateWithEvent:" to ObjCMethodSignatures.VoidObject,
            "swipeWithEvent:" to ObjCMethodSignatures.VoidObject,
            "pressureChangeWithEvent:" to ObjCMethodSignatures.VoidObject,
        )
        val managed = ObjCManagedClass.registerOnce(
            superclassName = "NSView",
            protocols = setOf("NSTextInputClient"),
            methods = textInputClientMethods,
        )
        val insertedRanges = mutableListOf<Pair<Long, Long>>()
        val markedRanges = mutableListOf<List<Pair<Long, Long>>>()
        var characterPoint = Double.NaN to Double.NaN
        val expectedFailure = IllegalStateException("first rect failed")
        val failures = ConcurrentLinkedQueue<Throwable>()
        val fallbackRect = rect(x = -4.0, y = -3.0, width = 2.0, height = 1.0)
        val fallbackActualRange = range(location = 90, length = 4)
        val instance = managed.createInstance(
            onError = CallbackExceptionHandler(failures::add),
        ) {
            onVoidObjectRange("insertText:replacementRange:") { _, replacementRange ->
                insertedRanges += replacementRange.location to replacementRange.length
            }
            onVoidObjectRangeRange("setMarkedText:selectedRange:replacementRange:") { _, selectedRange, replacementRange ->
                markedRanges += listOf(
                    selectedRange.location to selectedRange.length,
                    replacementRange.location to replacementRange.length,
                )
            }
            onRange("selectedRange", fallback = range(0, 0)) { range(7, 3) }
            onRange("markedRange", fallback = range(0, 0)) { range(11, 5) }
            onObjectRangeOutRange(
                "attributedSubstringForProposedRange:actualRange:",
                fallback = ObjCObjectRangeResult(value = null, actualRange = range(0, 0)),
            ) { proposedRange ->
                ObjCObjectRangeResult(
                    value = null,
                    actualRange = range(proposedRange.location + 1, proposedRange.length - 1),
                )
            }
            onRectRangeOutRange(
                "firstRectForCharacterRange:actualRange:",
                fallback = ObjCRectRangeResult(fallbackRect, fallbackActualRange),
            ) { proposedRange ->
                if (proposedRange.location == 99L) throw expectedFailure
                ObjCRectRangeResult(
                    value = rect(x = 12.5, y = -8.0, width = 41.0, height = 17.25),
                    actualRange = range(proposedRange.location + 2, proposedRange.length - 2),
                )
            }
            onULongPoint("characterIndexForPoint:", fallback = 0L) { point ->
                characterPoint = point.x to point.y
                37L
            }
            onVoidObject("magnifyWithEvent:") {}
            onVoidObject("rotateWithEvent:") {}
            onVoidObject("swipeWithEvent:") {}
            onVoidObject("pressureChangeWithEvent:") {}
        }

        try {
            ObjCRuntime.msgSend(
                null,
                instance.receiver.ptr,
                ObjCRuntime.sel("insertText:replacementRange:"),
                MemorySegment.NULL,
                ObjCRuntime.ObjCStructArg(range(4, 6).segment, NSRange.layout),
            )
            ObjCRuntime.msgSend(
                null,
                instance.receiver.ptr,
                ObjCRuntime.sel("setMarkedText:selectedRange:replacementRange:"),
                MemorySegment.NULL,
                ObjCRuntime.ObjCStructArg(range(3, 2).segment, NSRange.layout),
                ObjCRuntime.ObjCStructArg(range(18, 7).segment, NSRange.layout),
            )
            assertEquals(listOf(4L to 6L), insertedRanges)
            assertEquals(listOf(listOf(3L to 2L, 18L to 7L)), markedRanges)

            assertRange(sendRange(instance, "selectedRange"), location = 7, length = 3)
            assertRange(sendRange(instance, "markedRange"), location = 11, length = 5)

            Arena.ofConfined().use { arena ->
                val actualSubstringRange = NSRange.allocate(arena)
                val substring = ObjCRuntime.msgSend(
                    ValueLayout.ADDRESS,
                    instance.receiver.ptr,
                    ObjCRuntime.sel("attributedSubstringForProposedRange:actualRange:"),
                    ObjCRuntime.ObjCStructArg(range(20, 8).segment, NSRange.layout),
                    actualSubstringRange.segment,
                ) as MemorySegment
                assertEquals(MemorySegment.NULL, substring)
                assertRange(actualSubstringRange, location = 21, length = 7)

                val actualRectRange = NSRange.allocate(arena)
                val returnedRect = NSRect(
                    ObjCRuntime.msgSendStruct(
                        NSRect.layout,
                        instance.receiver.ptr,
                        ObjCRuntime.sel("firstRectForCharacterRange:actualRange:"),
                        ObjCRuntime.ObjCStructArg(range(30, 9).segment, NSRange.layout),
                        actualRectRange.segment,
                    ),
                )
                assertRect(returnedRect, x = 12.5, y = -8.0, width = 41.0, height = 17.25)
                assertRange(actualRectRange, location = 32, length = 7)

                val fallbackOutRange = NSRange.allocate(arena)
                val returnedFallback = NSRect(
                    ObjCRuntime.msgSendStruct(
                        NSRect.layout,
                        instance.receiver.ptr,
                        ObjCRuntime.sel("firstRectForCharacterRange:actualRange:"),
                        ObjCRuntime.ObjCStructArg(range(99, 1).segment, NSRange.layout),
                        fallbackOutRange.segment,
                    ),
                )
                assertRect(returnedFallback, x = -4.0, y = -3.0, width = 2.0, height = 1.0)
                assertRange(fallbackOutRange, location = 90, length = 4)
            }

            val index = ObjCRuntime.msgSend(
                ValueLayout.JAVA_LONG,
                instance.receiver.ptr,
                ObjCRuntime.sel("characterIndexForPoint:"),
                ObjCRuntime.ObjCStructArg(NSPoint(6.25, -9.5).segment, NSPoint.layout),
            ) as Long
            assertEquals(37L, index)
            assertEquals(6.25 to -9.5, characterPoint)
            assertSame(expectedFailure, failures.single())
        } finally {
            instance.close()
        }
    }

    @Test
    fun rectMessageAfterCloseReturnsAbiZeroWithoutInvokingHandler() {
        requireMacOS()
        val managed = ObjCManagedClass.registerOnce(
            methods = mapOf("kffiClosedRect:actualRange:" to ObjCMethodSignatures.RectRangeOutRange),
        )
        val invocations = AtomicInteger()
        val instance = managed.createInstance {
            onRectRangeOutRange(
                "kffiClosedRect:actualRange:",
                fallback = ObjCRectRangeResult(
                    rect(1.0, 2.0, 3.0, 4.0),
                    range(5, 6),
                ),
            ) {
                invocations.incrementAndGet()
                ObjCRectRangeResult(rect(7.0, 8.0, 9.0, 10.0), range(11, 12))
            }
        }
        ObjCRuntime.msgSend(
            ValueLayout.ADDRESS,
            instance.receiver.ptr,
            ObjCRuntime.sel("retain"),
        )

        try {
            instance.close()
            Arena.ofConfined().use { arena ->
                val actualRange = NSRange.allocate(arena).apply {
                    location = 13
                    length = 14
                }
                val returned = NSRect(
                    ObjCRuntime.msgSendStruct(
                        NSRect.layout,
                        instance.receiver.ptr,
                        ObjCRuntime.sel("kffiClosedRect:actualRange:"),
                        ObjCRuntime.ObjCStructArg(range(15, 16).segment, NSRange.layout),
                        actualRange.segment,
                    ),
                )

                assertRect(returned, x = 0.0, y = 0.0, width = 0.0, height = 0.0)
                assertRange(actualRange, location = 0, length = 0)
                assertEquals(0, invocations.get())
            }
        } finally {
            ObjCRuntime.msgSend(null, instance.receiver.ptr, ObjCRuntime.sel("release"))
        }
    }

    private fun sendRange(instance: ObjCManagedInstance, selector: String): NSRange =
        NSRange(
            ObjCRuntime.msgSendStruct(
                NSRange.layout,
                instance.receiver.ptr,
                ObjCRuntime.sel(selector),
            ),
        )

    private fun assertRange(actual: NSRange, location: Long, length: Long) {
        assertEquals(location, actual.location)
        assertEquals(length, actual.length)
    }

    private fun assertRect(
        actual: NSRect,
        x: Double,
        y: Double,
        width: Double,
        height: Double,
    ) {
        assertEquals(x, actual.origin.x)
        assertEquals(y, actual.origin.y)
        assertEquals(width, actual.size.width)
        assertEquals(height, actual.size.height)
    }

    private fun range(location: Long, length: Long): NSRange = NSRange(location, length)

    private fun rect(x: Double, y: Double, width: Double, height: Double): NSRect =
        NSRect(NSPoint(x, y), NSSize(width, height))

    private fun requireMacOS() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )
    }
}
