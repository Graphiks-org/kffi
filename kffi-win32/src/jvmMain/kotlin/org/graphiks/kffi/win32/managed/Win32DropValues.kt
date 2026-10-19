package org.graphiks.kffi.win32.managed

/** Typed native failure for the OLE drop frontier; numeric HRESULT only, never payloads or paths. */
public class Win32DropException(public val hresult: Int) :
    RuntimeException("Win32 OLE drop failure 0x" + hresult.toUInt().toString(16))

/** One copied FORMATETC row: values only, no native memory behind it. */
public data class Win32DropFormat(
    public val clipboardFormat: Int,
    public val tymed: Int,
    public val aspect: Int,
    public val lindex: Int,
)

/** Stable clipboard-format scalars and the registered-format lookup for CFSTR_* names. */
public object Win32DropFormats {
    public const val CF_TEXT: Int = 1
    public const val CF_UNICODETEXT: Int = 13
    public const val CF_HDROP: Int = 15

    public const val TYMED_HGLOBAL: Int = 1
    public const val TYMED_ISTREAM: Int = 4

    public const val DVASPECT_CONTENT: Int = 1

    public const val DROPEFFECT_NONE: Int = 0
    public const val DROPEFFECT_COPY: Int = 1
    public const val DROPEFFECT_MOVE: Int = 2
    public const val DROPEFFECT_LINK: Int = 4

    /** CFSTR_INETURLW; resolve once through [registeredFormat]. */
    public const val INET_URL_W: String = "UniformResourceLocatorW"

    private val registered = java.util.concurrent.ConcurrentHashMap<String, Int>()

    /** Resolves a CFSTR_* name once per name; requires Windows and [org.graphiks.kffi.win32.generated.init] to have run. */
    public fun registeredFormat(name: String): Int {
        require(name.isNotEmpty())
        return registered.computeIfAbsent(name) { value ->
            check(Win32ControlWindow.isSupported()) { "Win32 registered formats require Windows" }
            org.graphiks.kffi.win32.generated.init()
            java.lang.foreign.Arena.ofConfined().use { arena ->
                val wide = arena.allocate((value.length + 1L) * 2L, 2)
                value.forEachIndexed { index, character -> wide.set(java.lang.foreign.ValueLayout.JAVA_CHAR, index.toLong() * 2L, character) }
                wide.set(java.lang.foreign.ValueLayout.JAVA_CHAR, value.length.toLong() * 2L, '\u0000')
                val atom = org.graphiks.kffi.win32.generated.RegisterClipboardFormatW(wide)
                if (atom == 0) throw Win32DropException(E_OUT_OF_MEMORY)
                atom
            }
        }
    }

    internal const val E_OUT_OF_MEMORY: Int = -2147024882 // 0x8007000E
}

internal const val IID_IDATA_OBJECT = "0000010e-0000-0000-c000-000000000046"
internal const val IID_IDROP_TARGET = "00000122-0000-0000-c000-000000000046"
internal const val IID_IENUM_FORMAT_ETC = "00000103-0000-0000-c000-000000000046"
