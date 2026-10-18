package org.graphiks.kffi.win32.managed

import kotlin.test.*

class Win32TextDocumentTest {
    @Test fun readsRequireLockAndExposeTheProvisionalViewWithTheAcceptedEpoch() {
        Fixture("ab", epoch = 4).document.use { document ->
            assertEquals(0x80040201.toInt(), assertFailsWith<Win32TextException> { document.read() }.hresult)
            document.requestLock(6) {
                document.setText(1, 2, "😀")
                assertEquals(Win32TextSnapshot("a😀", Win32TextRange(3, 3), 4), document.read())
                0
            }
        }
    }

    @Test fun changingOnlyTheSecondSurrogateReplacesTheWholeScalar() {
        val fixture = Fixture("a😀b", epoch = 1)
        fixture.document.use { document ->
            document.requestLock(6) { document.setText(1, 3, "😁"); 0 }
            assertEquals(Win32TextChange.Replace(Win32TextRange(1, 3), "😁", 1), fixture.changes.single())
        }
    }

    @Test fun compositionUpdatesBeforeWritebackKeepTheirOriginalDocumentRange() {
        val fixture = Fixture("ab", selection = Win32TextRange(1, 1), epoch = 10)
        fixture.document.use { document ->
            document.requestLock(6) {
                document.setText(1, 1, "😀")
                document.setComposition(Win32TextRange(1, 3), Win32TextRange(2, 2)); 0
            }
            document.requestLock(6) {
                document.setText(1, 3, "界")
                document.setComposition(Win32TextRange(1, 2), Win32TextRange(1, 1)); 0
            }
            assertEquals(Win32TextChange.Composition(Win32TextRange(1, 1), "界", Win32TextRange(1, 1), 10), fixture.changes.last())
        }
    }

    @Test fun writesRequireAWriteLock() {
        val fixture = Fixture("ab")
        fixture.document.use { document ->
            assertEquals(0x80040201.toInt(), assertFailsWith<Win32TextException> {
                document.setText(0, 1, "x")
            }.hresult)
            document.requestLock(2) {
                assertEquals(0x80040201.toInt(), assertFailsWith<Win32TextException> {
                    document.setSelection(1, 1)
                }.hresult)
                0
            }
            assertTrue(fixture.changes.isEmpty())
        }
        assertEquals(0L, fixture.budget.retained)
    }

    @Test fun reentrantReadUpgradeRunsAfterReadReturns() {
        Fixture("ab").document.use { document ->
            val trace = mutableListOf<String>()
            val result = document.requestLock(2) {
                trace += "read"
                val upgrade = document.requestLock(6) { trace += "write"; 0 }
                assertEquals(0x40300, upgrade.sessionResult)
                trace += "read-return"
                0
            }
            assertEquals(0, result.result)
            assertEquals(listOf("read", "read-return", "write"), trace)
        }
    }

    @Test fun synchronousReentrantWriterCannotStealTheLock() {
        Fixture("ab").document.use { document ->
            document.requestLock(2) {
                val refused = document.requestLock(7) { fail("reentrant write ran synchronously") }
                assertEquals(0x80040208.toInt(), refused.sessionResult)
                0
            }
        }
    }

    @Test fun pendingCommitDefersTheNextWriterUntilApply() {
        val fixture = Fixture("abc", epoch = 8)
        fixture.document.use { document ->
            document.requestLock(6) { document.setText(1, 2, "x"); 0 }
            assertEquals(listOf<Win32TextChange>(Win32TextChange.Replace(Win32TextRange(1, 2), "x", 8)), fixture.changes)
            var secondWriteRan = false
            assertEquals(0x40300, document.requestLock(6) { secondWriteRan = true; 0 }.sessionResult)
            assertFalse(secondWriteRan)
            document.apply(Win32TextSnapshot("axc", Win32TextRange(2, 2), 9))
            assertTrue(secondWriteRan)
        }
        assertEquals(0L, fixture.budget.retained)
    }

    @Test fun compositionRangesRebaseAcrossSupplementaryCharacters() {
        val fixture = Fixture("ab", selection = Win32TextRange(1, 1), epoch = 10)
        fixture.document.use { document ->
            document.requestLock(6) {
                document.setText(1, 1, "😀")
                document.setSelection(3, 3)
                document.setComposition(Win32TextRange(1, 3), Win32TextRange(2, 2))
                0
            }
            assertEquals(Win32TextChange.Composition(Win32TextRange(1, 1), "😀", Win32TextRange(2, 2), 10), fixture.changes.single())
            document.apply(Win32TextSnapshot("a😀b", Win32TextRange(3, 3), 11))
            fixture.changes.clear()
            document.requestLock(6) {
                document.setText(1, 3, "界")
                document.setSelection(2, 2)
                document.setComposition(Win32TextRange(1, 2), Win32TextRange(1, 1))
                0
            }
            assertEquals(Win32TextChange.Composition(Win32TextRange(1, 3), "界", Win32TextRange(1, 1), 11), fixture.changes.single())
        }
    }

    @Test fun rejectedObservationRevokesTheDocument() {
        val fixture = Fixture("ab", accept = false)
        fixture.document.use { document ->
            document.requestLock(6) { document.setText(0, 1, "x"); 0 }
            assertFailsWith<Win32TextException> { document.requestLock(2) { 0 } }
            assertEquals(0L, fixture.budget.retained)
        }
    }

    @Test fun retainedViewsShareTheCallerBudget() {
        val budget = Budget(16)
        budget.retain(12)!!.use {
            assertFailsWith<Win32TextException> { Fixture("ab", budget = budget) }
            assertEquals(12L, budget.retained)
        }
        assertEquals(0L, budget.retained)
        val fixture = Fixture("ab", budget = budget)
        fixture.document.use { document ->
            document.requestLock(6) {
                assertFailsWith<Win32TextException> { document.setText(1, 1, "12345") }
                0
            }
            assertTrue(fixture.changes.isEmpty())
        }
        assertEquals(0L, budget.retained)
    }

    @Test fun staleApplyLeavesThePendingWriterAndDocumentUntouched() {
        val fixture = Fixture("ab", epoch = 10)
        fixture.document.use { document ->
            document.requestLock(6) { document.setText(1, 2, "x"); 0 }
            var writerRan = false
            document.requestLock(6) { writerRan = true; 0 }
            assertFailsWith<Win32TextException> { document.apply(Win32TextSnapshot("ax", Win32TextRange(2, 2), 9)) }
            assertFalse(writerRan)
            document.apply(Win32TextSnapshot("ax", Win32TextRange(2, 2), 11))
            assertTrue(writerRan)
        }
    }

    @Test fun severalNativeWritesBecomeOneBaseDocumentEdit() {
        val fixture = Fixture("a😀b", epoch = 3)
        fixture.document.use { document ->
            document.requestLock(6) {
                document.setText(1, 3, "界")
                document.setText(2, 3, "!")
                0
            }
            assertEquals(listOf<Win32TextChange>(Win32TextChange.Replace(Win32TextRange(1, 4), "界!", 3)), fixture.changes)
        }
    }

    @Test fun closingInsideAnObservationDoesNotRunAQueuedWriter() {
        val budget = Budget(1024)
        lateinit var document: Win32TextDocument
        document = Win32TextDocument(Win32TextSnapshot("ab", Win32TextRange(0, 0), 0), limits(budget)) {
            document.close()
            true
        }
        document.requestLock(6) {
            document.setText(0, 1, "x")
            document.requestLock(6) { fail("writer survived close") }
            0
        }
        document.close()
        assertEquals(0L, budget.retained)
    }

    private class Fixture(text: String, selection: Win32TextRange = Win32TextRange(0, 0), epoch: Long = 0,
        accept: Boolean = true, val budget: Budget = Budget(1_048_576)) {
        val changes = mutableListOf<Win32TextChange>()
        val document = Win32TextDocument(Win32TextSnapshot(text, selection, epoch), limits(budget)) {
            changes += it
            accept
        }
    }

    private class Budget(private val limit: Long) : Win32PayloadBudget {
        var retained = 0L
        override fun retain(bytes: Long): AutoCloseable? {
            if (bytes < 0 || bytes > limit - retained) return null
            retained += bytes
            var closed = false
            return AutoCloseable { if (!closed) { closed = true; retained -= bytes } }
        }
    }

    companion object {
        private fun limits(budget: Win32PayloadBudget) = Win32TextLimits(1024, 16, 64, budget)
    }
}
