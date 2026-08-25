package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.objc.ObjCSubclassing
import java.lang.foreign.MemorySegment
import java.nio.charset.StandardCharsets
import java.security.MessageDigest

/** A process-lifetime Objective-C class shared by one structural descriptor. */
class ObjCManagedClass private constructor(
    val nativeClass: MemorySegment,
    private val methods: Map<String, ObjCMethodSignature<*>>,
) {
    fun createInstance(
        onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
        configure: ObjCMethodRouter.() -> Unit,
    ): ObjCManagedInstance {
        val router = ObjCMethodRouter(methods)
        router.configure()
        router.freeze()
        return ObjCManagedInstance.create(nativeClass, router, onError)
    }

    companion object {
        private val registrationLock = Any()
        private val registeredClasses = mutableMapOf<StructuralKey, ObjCManagedClass>()

        fun registerOnce(
            superclassName: String = "NSObject",
            protocols: Set<String> = emptySet(),
            methods: Map<String, ObjCMethodSignature<*>>,
        ): ObjCManagedClass {
            require(superclassName.isNotBlank()) { "Objective-C superclass name must not be blank" }
            require(methods.isNotEmpty()) { "Managed Objective-C class must declare at least one method" }
            require(protocols.none(String::isBlank)) { "Objective-C protocol names must not be blank" }
            require(methods.keys.none(String::isBlank)) { "Objective-C selector names must not be blank" }

            val key = StructuralKey(
                superclassName = superclassName,
                protocols = protocols.sorted(),
                methods = methods.entries
                    .sortedBy(Map.Entry<String, ObjCMethodSignature<*>>::key)
                    .map { (selector, signature) ->
                        StructuralMethod(
                            selector = selector,
                            typeEncoding = signature.typeEncoding,
                            signatureIdentity = signature.identity,
                        )
                    },
            )
            val immutableMethods = methods.toMap()

            return synchronized(registrationLock) {
                registeredClasses[key] ?: buildClass(key, immutableMethods).also {
                    registeredClasses[key] = it
                }
            }
        }

        private fun buildClass(
            key: StructuralKey,
            methods: Map<String, ObjCMethodSignature<*>>,
        ): ObjCManagedClass {
            require(ObjCManagedRuntime.lookupClassOrNull(key.superclassName) != MemorySegment.NULL) {
                "Objective-C superclass '${key.superclassName}' was not found"
            }
            val className = key.nativeClassName()
            val existing = ObjCManagedRuntime.lookupClassOrNull(className)
            if (existing != MemorySegment.NULL) return ObjCManagedClass(existing, methods)

            val allocated = ObjCSubclassing.allocateClass(key.superclassName, className)
            check(allocated != MemorySegment.NULL) {
                "Objective-C runtime could not allocate managed class '$className'"
            }
            var registered = false
            try {
                methods.entries.sortedBy { it.key }.forEach { (selector, signature) ->
                    ObjCManagedRuntime.requireAddedMethod(
                        nativeClass = allocated,
                        selectorName = selector,
                        implementation = MemorySegment.ofAddress(signature.trampoline.rawValue),
                        typeEncoding = signature.typeEncoding,
                    )
                }
                key.protocols.forEach { protocol ->
                    ObjCManagedRuntime.requireAddedProtocol(allocated, protocol)
                }
                ObjCSubclassing.registerClass(allocated)
                registered = true
                return ObjCManagedClass(allocated, methods)
            } catch (failure: Throwable) {
                if (!registered) ObjCManagedRuntime.disposeUnregisteredClass(allocated)
                throw failure
            }
        }
    }
}

private data class StructuralKey(
    val superclassName: String,
    val protocols: List<String>,
    val methods: List<StructuralMethod>,
) {
    fun nativeClassName(): String {
        val descriptor = buildString {
            appendPart(superclassName)
            protocols.forEach { protocol -> appendPart(protocol) }
            methods.forEach { method ->
                appendPart(method.selector)
                appendPart(method.typeEncoding)
                appendPart(method.signatureIdentity)
            }
        }
        val digest = MessageDigest.getInstance("SHA-256")
            .digest(descriptor.toByteArray(StandardCharsets.UTF_8))
            .joinToString("") { byte -> "%02x".format(byte) }
        return "KFFIManaged_$digest"
    }

    private fun StringBuilder.appendPart(value: String) {
        append(value.length).append(':').append(value).append(';')
    }
}

private data class StructuralMethod(
    val selector: String,
    val typeEncoding: String,
    val signatureIdentity: String,
)
