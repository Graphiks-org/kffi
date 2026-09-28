@file:JsModule("./kffi-harfbuzz-web.mjs")
@file:Suppress("unused", "FunctionName")

package org.graphiks.kffi.harfbuzz

import org.khronos.webgl.Int8Array

/*
 * The external surface of the authored glue (`kffi-harfbuzz-web.mjs`).
 *
 * A `@JsModule` file may hold external declarations and nothing else, so the binding's
 * classes and helpers live in `HarfBuzzWeb.kt` and call these `internal` declarations.
 *
 * Only numbers, strings, booleans and typed arrays cross this boundary: Kotlin/Wasm
 * restricts JS interop signatures to that set, so the glue returns scalars and the
 * binding reads the HarfBuzz structures through accessors and heap readers.
 */

internal external fun hbReady(): Boolean

internal external fun hbVersion(): String

internal external fun hbAlloc(size: Int): Int

internal external fun hbFree(pointer: Int)

internal external fun hbWriteBytes(pointer: Int, bytes: Int8Array)

internal external fun hbWriteInt32(pointer: Int, index: Int, value: Int)

internal external fun hbWriteFloat(pointer: Int, index: Int, value: Float)

internal external fun hbReadInt32(pointer: Int): Int

internal external fun hbBlobCreate(pointer: Int, length: Int): Int

internal external fun hbBlobDestroy(blob: Int)

internal external fun hbFaceCreate(blob: Int, index: Int): Int

internal external fun hbFaceDestroy(face: Int)

internal external fun hbFaceUpem(face: Int): Int

internal external fun hbFaceMakeImmutable(face: Int)

internal external fun hbFontCreate(face: Int): Int

internal external fun hbFontDestroy(font: Int)

internal external fun hbFontSetScale(font: Int, x: Int, y: Int)

internal external fun hbOtFontSetFuncs(font: Int)

internal external fun hbFontMakeImmutable(font: Int)

internal external fun hbFontSetVarCoordsNormalized(font: Int, pointer: Int, count: Int)

internal external fun hbFontSetVariations(font: Int, pointer: Int, count: Int)

internal external fun hbFontGlyphHAdvance(font: Int, glyphId: Int): Int

internal external fun hbFontGlyphVAdvance(font: Int, glyphId: Int): Int

internal external fun hbFontGlyphExtents(font: Int, glyphId: Int, outPointer: Int): Int

internal external fun hbBufferCreate(): Int

internal external fun hbBufferDestroy(buffer: Int)

internal external fun hbBufferSetDirection(buffer: Int, direction: Int)

internal external fun hbBufferSetScript(buffer: Int, script: Int)

internal external fun hbBufferSetLanguage(buffer: Int, language: Int)

internal external fun hbBufferSetClusterLevel(buffer: Int, level: Int)

internal external fun hbBufferSetFlags(buffer: Int, flags: Int)

internal external fun hbBufferAddUtf32(buffer: Int, pointer: Int, itemOffset: Int, itemLength: Int)

internal external fun hbBufferGuessSegmentProperties(buffer: Int)

internal external fun hbShapeFull(font: Int, buffer: Int, featuresPointer: Int, featureCount: Int): Int

internal external fun hbBufferLength(buffer: Int): Int

internal external fun hbBufferGlyphId(buffer: Int, index: Int): Int

internal external fun hbBufferGlyphCluster(buffer: Int, index: Int): Int

internal external fun hbBufferGlyphFlags(buffer: Int, index: Int): Int

internal external fun hbBufferGlyphXAdvance(buffer: Int, index: Int): Int

internal external fun hbBufferGlyphYAdvance(buffer: Int, index: Int): Int

internal external fun hbBufferGlyphXOffset(buffer: Int, index: Int): Int

internal external fun hbBufferGlyphYOffset(buffer: Int, index: Int): Int

internal external fun hbLigatureCarets(
    font: Int,
    direction: Int,
    glyphId: Int,
    offset: Int,
    countPointer: Int,
    positionsPointer: Int,
): Int

internal external fun hbScriptFromString(pointer: Int): Int

internal external fun hbLanguageFromString(pointer: Int): Int

internal external fun hbLanguageToString(language: Int): String
