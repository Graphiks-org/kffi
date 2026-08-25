@file:OptIn(
    CallbackRuntimeApi::class,
    UnsafeCallbackRearmApi::class,
    kotlin.concurrent.atomics.ExperimentalAtomicApi::class,
)

package org.graphiks.kffi

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.CountDownLatch
import java.util.concurrent.CyclicBarrier
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.concurrent.atomics.AtomicInt
import kotlin.concurrent.atomics.AtomicReference

private const val THREAD_COUNT = 32
private const val TIMEOUT_SECONDS = 10L

private fun interface JvmTestCallback : Callback {
    fun invoke()
}

private fun interface OtherJvmTestCallback : Callback {
    fun invoke()
}

class CallbackRuntimeJvmTest : FreeSpec({
    "10,000 callback tokens allocated by 32 threads are non-zero unique and never reused" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("concurrent-tokens", hasRoutingUserdata = true)
            val tokens = ConcurrentLinkedQueue<ULong>()
            val executor = Executors.newFixedThreadPool(THREAD_COUNT)
            val barrier = CyclicBarrier(THREAD_COUNT + 1)
            try {
                val futures = List(THREAD_COUNT) { threadIndex ->
                    executor.submit {
                        barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        val registrationCount = 10_000 / THREAD_COUNT +
                            if (threadIndex < 10_000 % THREAD_COUNT) 1 else 0
                        repeat(registrationCount) {
                            val registration = register(type, CallbackPolicy.REPEATING) {}
                            try {
                                tokens.add(
                                    requireNotNull(
                                        PlatformCallbackTokenAddressCodec.decode(registration.userdata)
                                    )
                                )
                            } finally {
                                registration.close()
                            }
                        }
                    }
                }
                barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                futures.forEach { it.get(TIMEOUT_SECONDS, TimeUnit.SECONDS) }
            } finally {
                shutdown(executor)
            }

            tokens shouldHaveSize 10_000
            tokens.all { it > 0uL } shouldBe true
            val seen = tokens.toHashSet()
            seen shouldHaveSize 10_000
        }
    }

    "32 simultaneous ONCE deliveries invoke once" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("once-concurrent", hasRoutingUserdata = true)
            val calls = AtomicInt(0)
            val registration = register(type, CallbackPolicy.ONCE) { calls.fetchAndAdd(1) }
            val executor = Executors.newFixedThreadPool(THREAD_COUNT)
            val barrier = CyclicBarrier(THREAD_COUNT + 1)
            try {
                val futures = List(THREAD_COUNT) {
                    executor.submit {
                        barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
                    }
                }
                barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                futures.forEach { it.get(TIMEOUT_SECONDS, TimeUnit.SECONDS) }
            } finally {
                registration.close()
                shutdown(executor)
            }
            calls.load() shouldBe 1
            registration.isClosed shouldBe true
        }
    }

    "close racing ONCE delivery invokes zero or one times" {
        withRegistryBaseline {
            repeat(100) { index ->
                val type = CallbackType<JvmTestCallback>("once-close-race-$index", hasRoutingUserdata = true)
                val calls = AtomicInt(0)
                val registration = register(type, CallbackPolicy.ONCE) { calls.fetchAndAdd(1) }
                val executor = Executors.newFixedThreadPool(2)
                val barrier = CyclicBarrier(3)
                try {
                    val close = executor.submit {
                        barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        registration.close()
                    }
                    val deliver = executor.submit {
                        barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
                    }
                    barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    close.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    deliver.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                } finally {
                    registration.close()
                    shutdown(executor)
                }
                (calls.load() in 0..1) shouldBe true
                registration.isClosed shouldBe true
            }
        }
    }

    "REPEATING rejects calls after close and lets in-flight work finish" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("repeating-close", hasRoutingUserdata = true)
            val calls = AtomicInt(0)
            val entered = CountDownLatch(1)
            val release = CountDownLatch(1)
            val registration = register(type, CallbackPolicy.REPEATING) {
                calls.fetchAndAdd(1)
                entered.countDown()
                check(release.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))
            }
            val executor = Executors.newSingleThreadExecutor()
            try {
                val inFlight = executor.submit {
                    CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
                }
                check(entered.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))
                registration.close()
                registration.isQuiescent shouldBe false
                CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
                calls.load() shouldBe 1
                release.countDown()
                inFlight.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                registration.isQuiescent shouldBe true
            } finally {
                release.countDown()
                registration.close()
                shutdown(executor)
            }
            calls.load() shouldBe 1
        }
    }

    "close before entry runs each quiescence action once and rejects delivery" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("quiescence-before-entry", hasRoutingUserdata = true)
            val calls = AtomicInt(0)
            val released = AtomicInt(0)
            val registration = register(type, CallbackPolicy.REPEATING) { calls.fetchAndAdd(1) }

            registration.onQuiescent { released.fetchAndAdd(1) }
            registration.close()
            registration.close()
            CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
            registration.onQuiescent { released.fetchAndAdd(1) }

            calls.load() shouldBe 0
            released.load() shouldBe 2
            registration.isQuiescent shouldBe true
        }
    }

    "quiescence actions observe token and no-userdata routes already removed" {
        withRegistryBaseline {
            val baseline = CallbackRuntime.activeRegistrationCountForTest()
            listOf(true, false).forEach { hasRoutingUserdata ->
                val type = CallbackType<JvmTestCallback>(
                    canonicalId = "quiescence-route-$hasRoutingUserdata",
                    hasRoutingUserdata = hasRoutingUserdata,
                )
                val observedRegistrationCount = AtomicInt(-1)
                val registration = register(type, CallbackPolicy.REPEATING) {}
                registration.onQuiescent {
                    observedRegistrationCount.store(
                        CallbackRuntime.activeRegistrationCountForTest(),
                    )
                }

                registration.close()

                observedRegistrationCount.load() shouldBe baseline
            }
        }
    }

    "concurrent quiescence registration and close loses no actions" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("quiescence-registration-race", true)
            val registration = register(type, CallbackPolicy.REPEATING) {}
            val releases = AtomicInt(0)
            val executor = Executors.newFixedThreadPool(THREAD_COUNT + 1)
            val barrier = CyclicBarrier(THREAD_COUNT + 2)
            try {
                val registrations = List(THREAD_COUNT) {
                    executor.submit {
                        barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        registration.onQuiescent { releases.fetchAndAdd(1) }
                    }
                }
                val close = executor.submit {
                    barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    registration.close()
                }
                barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                registrations.forEach { it.get(TIMEOUT_SECONDS, TimeUnit.SECONDS) }
                close.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)

                releases.load() shouldBe THREAD_COUNT
                registration.close()
                releases.load() shouldBe THREAD_COUNT
            } finally {
                registration.close()
                shutdown(executor)
            }
        }
    }

    "close after admission defers quiescence actions until the delivery returns" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("quiescence-after-admission", hasRoutingUserdata = true)
            val entered = CountDownLatch(1)
            val allowReturn = CountDownLatch(1)
            val released = AtomicInt(0)
            val registration = register(type, CallbackPolicy.REPEATING) {
                entered.countDown()
                check(allowReturn.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))
            }
            val executor = Executors.newSingleThreadExecutor()
            try {
                registration.onQuiescent { released.fetchAndAdd(1) }
                val inFlight = executor.submit {
                    CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
                }
                check(entered.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))

                registration.close()
                registration.onQuiescent { released.fetchAndAdd(1) }
                released.load() shouldBe 0

                allowReturn.countDown()
                inFlight.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                released.load() shouldBe 2

                registration.onQuiescent { released.fetchAndAdd(1) }
                released.load() shouldBe 3
            } finally {
                allowReturn.countDown()
                registration.close()
                shutdown(executor)
            }
        }
    }

    "close inside a callback runs its quiescence action only after callback return" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("quiescence-self-close", hasRoutingUserdata = true)
            val callbackReturned = AtomicInt(0)
            val observedAtRelease = AtomicInt(-1)
            lateinit var registration: CallbackRegistration<JvmTestCallback>
            registration = register(type, CallbackPolicy.REPEATING) {
                registration.onQuiescent {
                    observedAtRelease.store(callbackReturned.load())
                }
                registration.close()
                callbackReturned.store(1)
            }

            CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }

            callbackReturned.load() shouldBe 1
            observedAtRelease.load() shouldBe 1
            registration.isQuiescent shouldBe true
        }
    }

    "ONCE claim reaches quiescence without an explicit close" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("once-quiescence", hasRoutingUserdata = true)
            val callbackReturned = AtomicInt(0)
            val observedAtRelease = AtomicInt(-1)
            val registration = register(type, CallbackPolicy.ONCE) {
                callbackReturned.store(1)
            }
            registration.onQuiescent {
                observedAtRelease.store(callbackReturned.load())
            }

            CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }

            observedAtRelease.load() shouldBe 1
            registration.isQuiescent shouldBe true
        }
    }

    "quiescence action failures are reported and do not skip later actions" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("quiescence-failure", hasRoutingUserdata = true)
            val failure = IllegalStateException("quiescence action")
            val lateFailure = IllegalArgumentException("late quiescence action")
            val completed = AtomicInt(0)
            val observed = mutableListOf<Throwable>()
            val registration = register(
                type = type,
                policy = CallbackPolicy.REPEATING,
                onError = CallbackExceptionHandler { observed += it },
            ) {}

            registration.onQuiescent { throw failure }
            registration.onQuiescent { completed.fetchAndAdd(1) }
            registration.close()

            observed shouldBe listOf(failure)
            completed.load() shouldBe 1

            registration.onQuiescent { throw lateFailure }
            observed shouldBe listOf(failure, lateFailure)
        }
    }

    "a stale REPEATING acquisition cannot make closed quiescence regress" {
        val activeRead = CountDownLatch(1)
        val resumeStaleAttempt = CountDownLatch(1)
        val machine = DeliveryStateMachine(
            policy = CallbackPolicy.REPEATING,
            beforeTryEnterCompareAndSet = {
                activeRead.countDown()
                check(resumeStaleAttempt.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))
            },
        )
        val executor = Executors.newSingleThreadExecutor()
        try {
            val staleAttempt = executor.submit<Boolean> { machine.tryEnter() }
            check(activeRead.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))

            machine.close() shouldBe true
            machine.isQuiescent shouldBe true
            machine.inFlight shouldBe 0

            resumeStaleAttempt.countDown()
            staleAttempt.get(TIMEOUT_SECONDS, TimeUnit.SECONDS) shouldBe false
            machine.isQuiescent shouldBe true
            machine.inFlight shouldBe 0
        } finally {
            resumeStaleAttempt.countDown()
            shutdown(executor)
        }
    }

    "callback failures reach the registration error handler" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("callback-failure", hasRoutingUserdata = true)
            val failure = IllegalStateException("callback")
            var observed: Throwable? = null
            val registration = register(
                type = type,
                policy = CallbackPolicy.ONCE,
                onError = CallbackExceptionHandler { observed = it },
            ) { throw failure }

            CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }

            observed shouldBe failure
            registration.isClosed shouldBe true
        }
    }

    "result dispatch returns the callback value and defaults for absent routes" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("result-routing", hasRoutingUserdata = true)
            val calls = AtomicInt(0)
            val registration = register(type, CallbackPolicy.REPEATING) { calls.fetchAndAdd(1) }

            val delivered = CallbackRuntime.dispatchSafely(
                type = type,
                userdata = registration.userdata,
                defaultValue = -1,
            ) {
                it.invoke()
                42
            }
            val unknown = CallbackRuntime.dispatchSafely(
                type = type,
                userdata = PlatformCallbackTokenAddressCodec.encode(Long.MAX_VALUE.toULong()),
                defaultValue = -2,
            ) {
                it.invoke()
                43
            }
            registration.close()
            val closed = CallbackRuntime.dispatchSafely(
                type = type,
                userdata = registration.userdata,
                defaultValue = -3,
            ) {
                it.invoke()
                44
            }

            delivered shouldBe 42
            unknown shouldBe -2
            closed shouldBe -3
            calls.load() shouldBe 1
        }
    }

    "result dispatch reports callback failure returns fallback and still reaches quiescence" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("result-failure", hasRoutingUserdata = true)
            val failure = IllegalStateException("result callback")
            val released = AtomicInt(0)
            var observed: Throwable? = null
            lateinit var registration: CallbackRegistration<JvmTestCallback>
            registration = register(
                type = type,
                policy = CallbackPolicy.REPEATING,
                onError = CallbackExceptionHandler { observed = it },
            ) {
                registration.close()
                throw failure
            }
            registration.onQuiescent { released.fetchAndAdd(1) }

            val result = CallbackRuntime.dispatchSafely(
                type = type,
                userdata = registration.userdata,
                defaultValue = 17,
            ) {
                it.invoke()
                99
            }

            result shouldBe 17
            observed shouldBe failure
            released.load() shouldBe 1
            registration.isQuiescent shouldBe true
        }
    }

    "result dispatch contains routing failures and returns the fallback" {
        withRegistryBaseline {
            val canonicalId = "result-routing-failure"
            val firstType = CallbackType<JvmTestCallback>(canonicalId, hasRoutingUserdata = true)
            val secondType = CallbackType<OtherJvmTestCallback>(canonicalId, hasRoutingUserdata = true)
            val registration = register(firstType, CallbackPolicy.REPEATING) {}
            var reported: Throwable? = null
            try {
                CallbackFallbackReporter.installForTest { reported = it }.use {
                    CallbackRuntime.dispatchSafely(
                        type = secondType,
                        userdata = registration.userdata,
                        defaultValue = "fallback",
                    ) {
                        it.invoke()
                        "delivered"
                    }
                } shouldBe "fallback"
            } finally {
                registration.close()
            }

            reported.shouldBeInstanceOf<IllegalArgumentException>()
        }
    }

    "a throwing error handler sends the combined failure to fallback" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("handler-failure", hasRoutingUserdata = true)
            val callbackFailure = IllegalStateException("callback")
            val handlerFailure = IllegalArgumentException("handler")
            var reported: Throwable? = null
            CallbackFallbackReporter.installForTest { reported = it }.use {
                val registration = register(
                    type = type,
                    policy = CallbackPolicy.ONCE,
                    onError = CallbackExceptionHandler { throw handlerFailure },
                ) { throw callbackFailure }
                CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
            }

            val combined = reported.shouldBeInstanceOf<CallbackExceptionHandlerFailure>()
            combined.callbackFailure shouldBe callbackFailure
            combined.handlerFailure shouldBe handlerFailure
        }
    }

    "unknown null and malformed tokens are contained" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("routing-a", hasRoutingUserdata = true)
            val calls = AtomicInt(0)
            val reported = mutableListOf<Throwable>()
            CallbackFallbackReporter.installForTest { reported += it }.use {
                val registration = register(type, CallbackPolicy.REPEATING) { calls.fetchAndAdd(1) }
                try {
                    CallbackRuntime.dispatchSafely(
                        type,
                        PlatformCallbackTokenAddressCodec.encode(Long.MAX_VALUE.toULong()),
                    ) { it.invoke() }
                    CallbackRuntime.dispatchSafely(type, null) { it.invoke() }
                    CallbackRuntime.dispatchSafely(
                        type,
                        NativeAddress(0L),
                    ) { it.invoke() }
                    CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
                } finally {
                    registration.close()
                }
            }

            calls.load() shouldBe 1
            reported shouldHaveSize 2
            reported.all { it is IllegalArgumentException } shouldBe true
        }
    }

    "cross-type token with the same canonical ID is rejected after generic erasure" {
        withRegistryBaseline {
            val canonicalId = "same-canonical-id"
            val firstType = CallbackType<JvmTestCallback>(canonicalId, hasRoutingUserdata = true)
            val secondType = CallbackType<OtherJvmTestCallback>(canonicalId, hasRoutingUserdata = true)
            val firstCalls = AtomicInt(0)
            val secondCalls = AtomicInt(0)
            val reported = mutableListOf<Throwable>()
            val registration = register(firstType, CallbackPolicy.REPEATING) { firstCalls.fetchAndAdd(1) }
            try {
                CallbackFallbackReporter.installForTest { reported += it }.use {
                    CallbackRuntime.dispatchSafely(secondType, registration.userdata) {
                        secondCalls.fetchAndAdd(1)
                        it.invoke()
                    }
                }
            } finally {
                registration.close()
            }

            firstCalls.load() shouldBe 0
            secondCalls.load() shouldBe 0
            reported shouldHaveSize 1
            reported.single().shouldBeInstanceOf<IllegalArgumentException>()
        }
    }

    "closing inside a REPEATING callback does not deadlock" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("self-close", hasRoutingUserdata = true)
            lateinit var registration: CallbackRegistration<JvmTestCallback>
            registration = register(type, CallbackPolicy.REPEATING) { registration.close() }
            val executor = Executors.newSingleThreadExecutor()
            try {
                executor.submit {
                    CallbackRuntime.dispatchSafely(type, registration.userdata) { it.invoke() }
                }.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            } finally {
                registration.close()
                shutdown(executor)
            }
            registration.isClosed shouldBe true
        }
    }

    "no-userdata registrations retire and re-arm only through unsafe API" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("no-userdata", hasRoutingUserdata = false)
            val calls = AtomicInt(0)
            val first = register(type, CallbackPolicy.ONCE) { calls.fetchAndAdd(1) }
            first.userdata shouldBe null
            shouldThrow<IllegalStateException> {
                register(type, CallbackPolicy.ONCE) { calls.fetchAndAdd(1) }
            }
            CallbackRuntime.dispatchSafely(type, null) { it.invoke() }
            shouldThrow<IllegalStateException> {
                register(type, CallbackPolicy.ONCE) { calls.fetchAndAdd(1) }
            }

            val second = CallbackRuntime.rearmAfterNativeQuiescence(
                type = type,
                trampoline = trampoline,
                policy = CallbackPolicy.ONCE,
                callback = JvmTestCallback { calls.fetchAndAdd(1) },
            )
            CallbackRuntime.dispatchSafely(type, null) { it.invoke() }

            calls.load() shouldBe 2
            second.isClosed shouldBe true
        }
    }

    "prepared publication supports reentrant delivery and rollback" {
        withRegistryBaseline {
            val type = CallbackType<JvmTestCallback>("prepared", hasRoutingUserdata = true)
            val calls = AtomicInt(0)
            val prepared = CallbackRuntime.prepare(
                type = type,
                trampoline = trampoline,
                policy = CallbackPolicy.REPEATING,
                callback = JvmTestCallback { calls.fetchAndAdd(1) },
            )
            val registration = CallbackRuntime.activateForNativeCall(prepared) { active ->
                CallbackRuntime.dispatchSafely(type, active.userdata) { it.invoke() }
            }
            calls.load() shouldBe 1
            registration.close()

            val failed = CallbackRuntime.prepare(
                type = type,
                trampoline = trampoline,
                policy = CallbackPolicy.REPEATING,
                callback = JvmTestCallback { calls.fetchAndAdd(1) },
            )
            shouldThrow<IllegalStateException> {
                CallbackRuntime.activateForNativeCall(failed) { active ->
                    CallbackRuntime.dispatchSafely(type, active.userdata) { it.invoke() }
                    throw IllegalStateException("downcall")
                }
            }
            CallbackRuntime.dispatchSafely(type, failed.userdata) { it.invoke() }
            calls.load() shouldBe 2
        }
    }

    "prepared token is unroutable before activation and after abort" {
        withRegistryBaseline {
            val baseline = CallbackRuntime.activeRegistrationCountForTest()
            val calls = AtomicInt(0)
            val type = CallbackType<JvmTestCallback>("prepared-abort", hasRoutingUserdata = true)
            val prepared = CallbackRuntime.prepare(
                type = type,
                trampoline = trampoline,
                policy = CallbackPolicy.ONCE,
                callback = JvmTestCallback { calls.fetchAndAdd(1) },
            )

            CallbackRuntime.dispatchSafely(type, prepared.userdata) { it.invoke() }
            calls.load() shouldBe 0
            CallbackRuntime.activeRegistrationCountForTest() shouldBe baseline

            prepared.close()
            prepared.isAborted shouldBe true
            CallbackRuntime.dispatchSafely(type, prepared.userdata) { it.invoke() }
            calls.load() shouldBe 0
            CallbackRuntime.activeRegistrationCountForTest() shouldBe baseline
        }
    }

    "prepared close racing activation has exactly one winner" {
        withRegistryBaseline {
            val executor = Executors.newFixedThreadPool(2)
            try {
                repeat(100) { index ->
                    val type = CallbackType<JvmTestCallback>(
                        "prepared-race-$index",
                        hasRoutingUserdata = true,
                    )
                    val downcalls = AtomicInt(0)
                    val prepared = CallbackRuntime.prepare(
                        type = type,
                        trampoline = trampoline,
                        policy = CallbackPolicy.REPEATING,
                        callback = JvmTestCallback {},
                    )
                    val activated = AtomicReference<CallbackRegistration<JvmTestCallback>?>(null)
                    val activationFailure = AtomicReference<Throwable?>(null)
                    val barrier = CyclicBarrier(3)
                    val closeFuture = executor.submit {
                        barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        prepared.close()
                    }
                    val activateFuture = executor.submit {
                        barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        try {
                            activated.store(
                                CallbackRuntime.activateForNativeCall(prepared) {
                                    downcalls.fetchAndAdd(1)
                                },
                            )
                        } catch (failure: Throwable) {
                            activationFailure.store(failure)
                        }
                    }
                    try {
                        barrier.await(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        closeFuture.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                        activateFuture.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)

                        val registration = activated.load()
                        ((registration != null) xor prepared.isAborted) shouldBe true
                        if (registration == null) {
                            activationFailure.load().shouldBeInstanceOf<IllegalStateException>()
                            downcalls.load() shouldBe 0
                        } else {
                            activationFailure.load() shouldBe null
                            downcalls.load() shouldBe 1
                        }
                    } finally {
                        activated.load()?.close()
                        prepared.close()
                    }
                }
            } finally {
                shutdown(executor)
            }
        }
    }

    "no-userdata prepared conflict never calls downcall or leaks" {
        withRegistryBaseline {
            val baseline = CallbackRuntime.activeRegistrationCountForTest()
            val type = CallbackType<JvmTestCallback>("prepared-conflict", hasRoutingUserdata = false)
            val active = register(type, CallbackPolicy.REPEATING) {}
            val prepared = CallbackRuntime.prepare(
                type = type,
                trampoline = trampoline,
                policy = CallbackPolicy.REPEATING,
                callback = JvmTestCallback {},
            )
            val downcalls = AtomicInt(0)
            try {
                shouldThrow<IllegalStateException> {
                    CallbackRuntime.activateForNativeCall(prepared) {
                        downcalls.fetchAndAdd(1)
                    }
                }
                downcalls.load() shouldBe 0
                CallbackRuntime.activeRegistrationCountForTest() shouldBe baseline + 1
            } finally {
                prepared.close()
                active.close()
            }
            CallbackRuntime.activeRegistrationCountForTest() shouldBe baseline
        }
    }

    "throwing no-userdata reentrant downcall retires the published slot" {
        withRegistryBaseline {
            val baseline = CallbackRuntime.activeRegistrationCountForTest()
            val calls = AtomicInt(0)
            val type = CallbackType<JvmTestCallback>("prepared-no-userdata", hasRoutingUserdata = false)
            val prepared = CallbackRuntime.prepare(
                type = type,
                trampoline = trampoline,
                policy = CallbackPolicy.REPEATING,
                callback = JvmTestCallback { calls.fetchAndAdd(1) },
            )
            val downcallFailure = IllegalStateException("no-userdata downcall")

            val observed = shouldThrow<IllegalStateException> {
                CallbackRuntime.activateForNativeCall(prepared) { active ->
                    active.userdata shouldBe null
                    CallbackRuntime.dispatchSafely(type, null) { it.invoke() }
                    throw downcallFailure
                }
            }

            observed shouldBe downcallFailure
            calls.load() shouldBe 1
            CallbackRuntime.activeRegistrationCountForTest() shouldBe baseline
            shouldThrow<IllegalStateException> {
                register(type, CallbackPolicy.REPEATING) {}
            }
            val rearmed = CallbackRuntime.rearmAfterNativeQuiescence(
                type = type,
                trampoline = trampoline,
                policy = CallbackPolicy.REPEATING,
                callback = JvmTestCallback {},
            )
            rearmed.close()
        }
    }
})

private val trampoline = NativeAddress(0xCAFE)

private fun register(
    type: CallbackType<JvmTestCallback>,
    policy: CallbackPolicy,
    onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
    callback: JvmTestCallback,
): CallbackRegistration<JvmTestCallback> = CallbackRuntime.register(
    type = type,
    trampoline = trampoline,
    policy = policy,
    onError = onError,
    callback = callback,
)

private inline fun withRegistryBaseline(test: () -> Unit) {
    val baseline = CallbackRuntime.activeRegistrationCountForTest()
    try {
        test()
    } finally {
        CallbackRuntime.activeRegistrationCountForTest() shouldBe baseline
    }
}

private fun shutdown(executor: ExecutorService) {
    executor.shutdownNow()
    check(executor.awaitTermination(TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
        "Executor did not terminate within $TIMEOUT_SECONDS seconds"
    }
}
