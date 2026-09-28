@file:JsModule("./kffi-harfbuzz-web.mjs")

package org.graphiks.kffi.harfbuzz

import kotlin.js.Promise

/** Kotlin/JS entry point of the glue's asynchronous module factory. */
internal external fun hbInit(): Promise<Boolean>
