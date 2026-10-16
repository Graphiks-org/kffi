package org.graphiks.kffi.win32.managed

/** Half-open UTF-16 character positions. */
public data class Win32TextRange(public val start: Int, public val endExclusive: Int) {
    init { require(start >= 0 && endExclusive >= start) }
}

/** The caller supplies an opaque epoch; native services never advance it. */
public data class Win32TextSnapshot(public val text: String, public val selection: Win32TextRange, public val epoch: Long) {
    init { require(selection.endExclusive <= text.length) }
}

public fun interface Win32PayloadBudget {
    /** Null refuses admission. A successful reservation must be closed exactly once. */
    public fun retain(bytes: Long): AutoCloseable?
}

public data class Win32TextLimits(
    public val maxCodeUnits: Int,
    public val maxPendingCharacters: Int,
    public val maxCollectionElements: Int,
    public val payloadBudget: Win32PayloadBudget,
) {
    init { require(maxCodeUnits >= 0 && maxPendingCharacters > 0 && maxCollectionElements > 0) }
}

public sealed interface Win32TextChange {
    public val epoch: Long
    public data class Replace(public val range: Win32TextRange, public val text: String, override val epoch: Long) : Win32TextChange
    public data class Selection(public val range: Win32TextRange, override val epoch: Long) : Win32TextChange
    public data class Composition(public val range: Win32TextRange?, public val text: String,
        public val selection: Win32TextRange?, override val epoch: Long) : Win32TextChange
    public data class Submit(override val epoch: Long) : Win32TextChange
}

internal data class Win32TextLockResult(val result: Int, val sessionResult: Int)

/** Numeric native failure only; document contents are never included in diagnostics. */
public class Win32TextException(public val hresult: Int) : IllegalStateException("Win32 text failure: $hresult")
