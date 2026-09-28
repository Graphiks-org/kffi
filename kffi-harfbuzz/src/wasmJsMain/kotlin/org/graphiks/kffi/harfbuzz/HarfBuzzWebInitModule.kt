@file:JsModule("./kffi-harfbuzz-web.mjs")

package org.graphiks.kffi.harfbuzz

import kotlin.js.JsBoolean
import kotlin.js.Promise

/** Kotlin/Wasm entry point of the glue's asynchronous module factory. */
internal external fun hbInit(): Promise<JsBoolean>
