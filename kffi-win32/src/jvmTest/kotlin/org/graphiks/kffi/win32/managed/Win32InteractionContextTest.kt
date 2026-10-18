package org.graphiks.kffi.win32.managed

import kotlin.test.*

class Win32InteractionContextTest {
    @Test fun unitsAndConfigurationAreReadBackBeforeAdmission() {
        val port = Port()
        Win32InteractionContext.open(port, 4, {}).use { context ->
            assertEquals(listOf("units:1", "filter:0", "config:31:3", "read-units", "read-filter", "read-config", "output"), port.trace)
            assertEquals(Win32InteractionConfiguration(true, true, true, true, true), context.configuration)
        }
        assertEquals(1, port.destroyed)
    }
    @Test fun partialConfigurationFailureDestroysTheContext() {
        val port = Port().also { it.failConfiguration = true }
        assertFailsWith<Win32InteractionException> { Win32InteractionContext.open(port, 4, {}) }
        assertEquals(1, port.destroyed)
        val mismatch = Port().also { it.units = 0 }
        assertFailsWith<Win32InteractionException> { Win32InteractionContext.open(mismatch, 4, {}) }
        assertEquals(1, mismatch.destroyed)
    }
    @Test fun callbacksStopAtRevocation() {
        val port = Port(); val outputs = mutableListOf<Win32InteractionOutput>()
        val context = Win32InteractionContext.open(port, 4, outputs::add)
        port.receiver(output); context.revoke(); port.receiver(output); context.close(); context.close()
        assertEquals(listOf(output), outputs); assertEquals(1, port.destroyed)
    }
    @Test fun framesAreSubmittedOnceWithAnIdenticalPointerSet() {
        val port = Port()
        Win32InteractionContext.open(port, 4, {}).use { context ->
            batch(frame(3, 1, 2), frame(2, 1, 2), frame(1, 1)).use(context::process)
            batch(frame(3, 1, 2), frame(2, 1, 2)).use(context::process)
            assertEquals(listOf(listOf(1), listOf(3, 2)), port.processed.map { it.map { f -> f.frameId } })
            assertTrue(port.processed.all { group -> group.map { it.pointers.map { p -> p.id }.toSet() }.distinct().size == 1 })
            assertEquals(setOf(1, 2), port.processed.last().first().pointers.map { it.id }.toSet())
            context.reset()
            assertEquals(2, port.trace.count { it == "read-config" })
        }
    }
    @Test fun closeDuringOutputDefersNativeDestruction() {
        val port = Port(); lateinit var context: Win32InteractionContext
        context = Win32InteractionContext.open(port, 4, { context.close(); assertEquals(0, port.destroyed) })
        port.emitInProcess = true
        batch(frame(1, 1)).use(context::process)
        assertEquals(1, port.destroyed)
    }
    @Test fun callbackFailuresAreContainedAndReportedAfterProcessing() {
        val port = Port(); var failures = 0
        val context = Win32InteractionContext.open(port, 4, { error("private failure") }, { failures++ })
        port.emitInProcess = true
        batch(frame(1, 1)).use { assertFailsWith<Win32InteractionException> { context.process(it) } }
        assertEquals(1, failures); assertEquals(1, port.destroyed)
        port.receiver(output); assertEquals(1, failures)
    }
    @Test fun frameCapacityAndNativeOrderAreValidatedBeforeSubmission() {
        val port = Port()
        Win32InteractionContext.open(port, 1, {}).use { context ->
            batch(frame(1, 1, 2)).use { assertFailsWith<IllegalArgumentException> { context.process(it) } }
            assertTrue(port.processed.isEmpty())
        }
        Win32InteractionContext.open(Port(), 2, {}).use { context ->
            batch(frame(1, 1), frame(2, 1)).use { assertFailsWith<IllegalArgumentException> { context.process(it) } }
        }
    }
    @Test fun resetReinstallsTheOutputReceiver() {
        val port = Port()
        Win32InteractionContext.open(port, 2, {}).use { context ->
            context.reset(); assertEquals(2, port.trace.count { it == "output" })
        }
    }
    @Test fun resetDoesNotReplayHistoricalFramesFromBeforeTheReset() {
        val port = Port()
        Win32InteractionContext.open(port, 2, {}).use { context ->
            batch(frame(2, 1), frame(1, 1)).use(context::process)
            context.reset()
            batch(frame(3, 1), frame(2, 1), frame(1, 1)).use(context::process)
            assertEquals(listOf(listOf(2, 1), listOf(3)), port.processed.map { group -> group.map { it.frameId } })
        }
    }
    @Test fun aFrameClosedDuringOutputKeepsItsLeaseUntilProcessingReturns() {
        val port = Port(); var retained = 1
        val batch = Win32PointerBatch(listOf(frame(1, 1)), AutoCloseable { retained-- })
        Win32InteractionContext.open(port, 2, { batch.close(); assertEquals(1, retained) }).use { context ->
            port.emitInProcess = true
            context.process(batch)
            assertEquals(0, retained)
        }
    }
    @Test fun aCallbackOutsideProcessingPostsDestructionUntilItReturns() {
        val port = Port(); lateinit var context: Win32InteractionContext
        context = Win32InteractionContext.open(port, 2, { context.close() })
        port.receiver(output)
        assertEquals(0, port.destroyed)
        port.commands.removeFirst().invoke()
        assertEquals(1, port.destroyed)
    }
    @Test fun theWindowOwnsOnlyItsAdmittedSubframes() {
        val port = Port()
        Win32InteractionContext.open(port, 1, {}, targetHwnd=9).use { context ->
            val own = Win32PointerSample(1, 2, 0x20006, Win32Point(10, 10), target=9)
            val foreign = own.copy(id=2, target=8)
            batch(Win32PointerFrame(1, listOf(own, foreign))).use(context::process)
            assertEquals(listOf(own), port.processed.single().single().pointers)
            batch(Win32PointerFrame(2, listOf(foreign))).use(context::process)
            assertEquals(1, port.processed.size)
        }
    }
    private class Port : Win32InteractionPort {
        val trace = mutableListOf<String>(); var destroyed = 0; var units = 1; var failConfiguration = false
        var emitInProcess = false
        val commands = ArrayDeque<() -> Unit>()
        val processed = mutableListOf<List<Win32PointerFrame>>()
        lateinit var receiver: (Win32InteractionOutput) -> Unit
        override fun setProperty(id: Int, value: Int) { trace += if (id == 1) "units:$value" else "filter:$value" }
        override fun getProperty(id: Int): Int { trace += if(id == 1) "read-units" else "read-filter"; return if(id == 1) units else 0 }
        override fun setConfiguration(manipulation: Int, tap: Int) { trace += "config:$manipulation:$tap"; if(failConfiguration) throw Win32InteractionException(-1) }
        override fun getConfiguration(): Pair<Int, Int> { trace += "read-config"; return 31 to 3 }
        override fun setOutput(callback: (Win32InteractionOutput) -> Unit, onFailure: (Throwable) -> Unit) { trace += "output"; receiver = callback }
        override fun process(frames: List<Win32PointerFrame>) { processed += frames; if(emitInProcess) receiver(Win32InteractionContextTest.output) }
        override fun reset() { }
        override fun postOwner(action: () -> Unit) { commands += action }
        override fun destroy() { destroyed++ }
    }
    companion object {
        private val output = Win32InteractionOutput(1, 1, 2, 10.0, 20.0, 1.0, 1.0, 1.0, 0.0, null)
        private fun frame(id: Int, vararg pointers: Int) = Win32PointerFrame(id, pointers.map { Win32PointerSample(it, 2, 0x20006, Win32Point(100, 100), time=id * 16) })
        private fun batch(vararg frames: Win32PointerFrame) = Win32PointerBatch(frames.toList(), AutoCloseable {})
    }
}
