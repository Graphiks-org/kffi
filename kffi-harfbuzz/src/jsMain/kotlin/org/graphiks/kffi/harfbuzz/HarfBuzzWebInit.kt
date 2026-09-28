package org.graphiks.kffi.harfbuzz

import kotlin.js.Promise

/**
 * Loads and instantiates the bundled WebAssembly HarfBuzz module.
 *
 * `WebAssembly.instantiate` is asynchronous, so this is the web counterpart of the
 * synchronous `open()`: a consumer awaits it once before opening the binding.
 */
public fun initializeHarfBuzz(): Promise<Boolean> = hbInit()
