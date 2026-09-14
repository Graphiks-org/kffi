package org.graphiks.kffi.apple

import java.lang.foreign.Arena
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import java.util.NoSuchElementException

/** Library scopes intentionally remain alive for the process lifetime. */
internal class AppleNativeSymbols(paths: List<String>) {
    init {
        requireSupportedPlatform()
    }

    private val scope = Arena.ofShared()
    private val libraries: List<SymbolLookup>

    init {
        try {
            libraries = paths.map { SymbolLookup.libraryLookup(it, scope) }
        } catch (failure: UnsatisfiedLinkError) {
            scope.close()
            throw libraryFailure(failure)
        } catch (failure: IllegalArgumentException) {
            scope.close()
            throw libraryFailure(failure)
        } catch (failure: SecurityException) {
            scope.close()
            throw libraryFailure(failure)
        } catch (failure: IllegalCallerException) {
            scope.close()
            throw libraryFailure(failure)
        }
    }

    fun address(name: String): Long {
        try {
            return libraries.firstNotNullOfOrNull { it.find(name).orElse(null) }?.address()
                ?: throw NoSuchElementException("Native symbol is absent: $name")
        } catch (failure: NoSuchElementException) {
            throw symbolFailure(name, failure)
        } catch (failure: UnsatisfiedLinkError) {
            throw symbolFailure(name, failure)
        } catch (failure: SecurityException) {
            throw symbolFailure(name, failure)
        } catch (failure: IllegalArgumentException) {
            throw symbolFailure(name, failure)
        }
    }

    private fun libraryFailure(cause: Throwable) = AppleBindingException(
        AppleBindingFailure.LIBRARY_LOAD, "Unable to load Apple native libraries", cause,
    )

    private fun symbolFailure(name: String, cause: Throwable) = AppleBindingException(
        AppleBindingFailure.SYMBOL_RESOLUTION, "Unable to resolve Apple native symbol: $name", cause,
    )

    companion object {
        fun requireSupportedPlatform() {
            val architecture = System.getProperty("os.arch")
            if (!System.getProperty("os.name").startsWith("Mac") ||
                architecture !in setOf("aarch64", "arm64", "x86_64", "amd64") ||
                ValueLayout.ADDRESS.byteSize() != 8L
            ) {
                throw AppleBindingException(
                    AppleBindingFailure.UNSUPPORTED_PLATFORM,
                    "Apple C bindings require macOS arm64 or x86_64 with 64-bit pointers",
                )
            }
        }
    }
}
