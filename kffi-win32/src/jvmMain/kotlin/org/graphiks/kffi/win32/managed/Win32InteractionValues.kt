package org.graphiks.kffi.win32.managed

public data class Win32InteractionConfiguration(public val screenPixels: Boolean, public val pan: Boolean,
    public val pinch: Boolean, public val rotation: Boolean, public val doubleTap: Boolean)
public data class Win32InteractionOutput(public val interactionId: Int, public val flags: Int, public val inputType: Int,
    public val x: Double?, public val y: Double?, public val translationX: Double?, public val translationY: Double?,
    public val scale: Double?, public val rotationRadians: Double?, public val tapCount: Int?)
public class Win32InteractionException(public val hresult: Int) : IllegalStateException("Win32 interaction failure: $hresult")

internal interface Win32InteractionPort {
    fun setProperty(id: Int, value: Int)
    fun getProperty(id: Int): Int
    fun setConfiguration(manipulation: Int, tap: Int)
    fun getConfiguration(): Pair<Int, Int>
    fun setOutput(callback: (Win32InteractionOutput) -> Unit, onFailure: (Throwable) -> Unit)
    fun process(frames: List<Win32PointerFrame>)
    fun reset()
    fun postOwner(action: () -> Unit)
    fun destroy()
}
