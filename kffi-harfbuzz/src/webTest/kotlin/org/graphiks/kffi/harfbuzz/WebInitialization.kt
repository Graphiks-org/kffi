package org.graphiks.kffi.harfbuzz

/**
 * Awaits the one-time WebAssembly module initialization.
 *
 * The promise type differs between Kotlin/JS (`Promise<Boolean>`) and Kotlin/Wasm
 * (`Promise<JsBoolean>`), so the await is per-target and the shared probe calls this.
 */
internal expect suspend fun awaitHarfBuzzInitialization()
