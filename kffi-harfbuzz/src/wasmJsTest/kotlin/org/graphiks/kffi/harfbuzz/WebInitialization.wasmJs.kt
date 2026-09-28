package org.graphiks.kffi.harfbuzz

import kotlinx.coroutines.await

internal actual suspend fun awaitHarfBuzzInitialization() {
    initializeHarfBuzz().await<kotlin.js.JsBoolean>()
}
