@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSStandardKeyBindingResponding
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSStandardKeyBindingResponding {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertText(insertString: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertText:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun doCommandBySelector(selector: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'doCommandBySelector:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveForward(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveForward:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveRight(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveRight:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveBackward(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveBackward:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveLeft(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveLeft:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveUp(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveUp:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveDown(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveDown:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveWordForward(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveWordForward:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveWordBackward(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveWordBackward:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToBeginningOfLine(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToBeginningOfLine:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToEndOfLine(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToEndOfLine:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToBeginningOfParagraph(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToBeginningOfParagraph:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToEndOfParagraph(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToEndOfParagraph:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToEndOfDocument(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToEndOfDocument:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToBeginningOfDocument(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToBeginningOfDocument:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageDown(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pageDown:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageUp(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pageUp:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun centerSelectionInVisibleArea(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'centerSelectionInVisibleArea:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveBackwardAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveBackwardAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveForwardAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveForwardAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveWordForwardAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveWordForwardAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveWordBackwardAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveWordBackwardAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveUpAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveUpAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveDownAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveDownAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToBeginningOfLineAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToBeginningOfLineAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToEndOfLineAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToEndOfLineAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToBeginningOfParagraphAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToBeginningOfParagraphAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToEndOfParagraphAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToEndOfParagraphAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToEndOfDocumentAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToEndOfDocumentAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveToBeginningOfDocumentAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToBeginningOfDocumentAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageDownAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pageDownAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageUpAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pageUpAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveParagraphForwardAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveParagraphForwardAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveParagraphBackwardAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveParagraphBackwardAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveWordRight(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveWordRight:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveWordLeft(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveWordLeft:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveRightAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveRightAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveLeftAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveLeftAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveWordRightAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveWordRightAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun moveWordLeftAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveWordLeftAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun moveToLeftEndOfLine(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToLeftEndOfLine:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun moveToRightEndOfLine(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToRightEndOfLine:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun moveToLeftEndOfLineAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToLeftEndOfLineAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun moveToRightEndOfLineAndModifySelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'moveToRightEndOfLineAndModifySelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun scrollPageUp(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrollPageUp:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun scrollPageDown(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrollPageDown:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun scrollLineUp(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrollLineUp:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun scrollLineDown(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrollLineDown:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun scrollToBeginningOfDocument(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrollToBeginningOfDocument:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun scrollToEndOfDocument(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrollToEndOfDocument:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun transpose(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'transpose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun transposeWords(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'transposeWords:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun selectAll(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'selectAll:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun selectParagraph(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'selectParagraph:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun selectLine(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'selectLine:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun selectWord(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'selectWord:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun indent(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'indent:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertTab(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertTab:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertBacktab(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertBacktab:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertNewline(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertNewline:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertParagraphSeparator(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertParagraphSeparator:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertNewlineIgnoringFieldEditor(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertNewlineIgnoringFieldEditor:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertTabIgnoringFieldEditor(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertTabIgnoringFieldEditor:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertLineBreak(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertLineBreak:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun insertContainerBreak(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertContainerBreak:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun insertSingleQuoteIgnoringSubstitution(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertSingleQuoteIgnoringSubstitution:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun insertDoubleQuoteIgnoringSubstitution(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertDoubleQuoteIgnoringSubstitution:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun changeCaseOfLetter(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'changeCaseOfLetter:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun uppercaseWord(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'uppercaseWord:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun lowercaseWord(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'lowercaseWord:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun capitalizeWord(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'capitalizeWord:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteForward(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteForward:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteBackward(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteBackward:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteBackwardByDecomposingPreviousCharacter(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteBackwardByDecomposingPreviousCharacter:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteWordForward(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteWordForward:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteWordBackward(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteWordBackward:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteToBeginningOfLine(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteToBeginningOfLine:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteToEndOfLine(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteToEndOfLine:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteToBeginningOfParagraph(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteToBeginningOfParagraph:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteToEndOfParagraph(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteToEndOfParagraph:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun yank(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'yank:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun complete(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'complete:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setMark(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setMark:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun deleteToMark(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'deleteToMark:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun selectToMark(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'selectToMark:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun swapWithMark(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'swapWithMark:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun cancelOperation(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'cancelOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun makeBaseWritingDirectionNatural(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'makeBaseWritingDirectionNatural:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun makeBaseWritingDirectionLeftToRight(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'makeBaseWritingDirectionLeftToRight:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun makeBaseWritingDirectionRightToLeft(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'makeBaseWritingDirectionRightToLeft:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun makeTextWritingDirectionNatural(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'makeTextWritingDirectionNatural:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun makeTextWritingDirectionLeftToRight(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'makeTextWritingDirectionLeftToRight:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun makeTextWritingDirectionRightToLeft(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'makeTextWritingDirectionRightToLeft:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    // @optional
    fun quickLookPreviewItems(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'quickLookPreviewItems:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun showContextMenuForSelection(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'showContextMenuForSelection:' not implemented")

}
