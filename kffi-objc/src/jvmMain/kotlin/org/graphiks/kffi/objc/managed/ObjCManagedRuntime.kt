package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.ObjCSubclassing
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout

/** Runtime primitives owned by the handwritten managed Objective-C layer. */
internal object ObjCManagedRuntime {
    private val arena = Arena.global()
    private val objcLibrary = run {
        val loaderLookup = SymbolLookup.loaderLookup()
        if (loaderLookup.find("objc_lookUpClass").isPresent) {
            loaderLookup
        } else {
            SymbolLookup.libraryLookup("/usr/lib/libobjc.dylib", arena)
        }
    }
    private val linker = Linker.nativeLinker()
    private val lookUpClass = linker.downcallHandle(
        objcLibrary.find("objc_lookUpClass").orElseThrow {
            UnsatisfiedLinkError("objc_lookUpClass not found")
        },
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val disposeClassPair = linker.downcallHandle(
        objcLibrary.find("objc_disposeClassPair").orElseThrow {
            UnsatisfiedLinkError("objc_disposeClassPair not found")
        },
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
    )

    fun lookupClassOrNull(className: String): MemorySegment =
        lookUpClass.invokeExact(arena.allocateFrom(className)) as MemorySegment

    fun disposeUnregisteredClass(nativeClass: MemorySegment) {
        disposeClassPair.invokeExact(nativeClass)
    }

    fun requireAddedMethod(
        nativeClass: MemorySegment,
        selectorName: String,
        implementation: MemorySegment,
        typeEncoding: String,
    ) {
        require(ObjCSubclassing.addMethod(nativeClass, selectorName, implementation, typeEncoding)) {
            "Objective-C runtime rejected selector '$selectorName' with encoding '$typeEncoding'"
        }
    }

    fun requireAddedProtocol(nativeClass: MemorySegment, protocolName: String) {
        require(ObjCSubclassing.addProtocol(nativeClass, protocolName)) {
            "Objective-C runtime rejected protocol '$protocolName'"
        }
    }

    fun retain(receiver: MemorySegment): MemorySegment = ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        receiver,
        ObjCRuntime.sel("retain"),
    ) as MemorySegment

    fun release(receiver: MemorySegment) {
        ObjCRuntime.msgSend(null, receiver, ObjCRuntime.sel("release"))
    }
}
