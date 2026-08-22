package org.graphiks.kffi.win32.generated

import java.lang.foreign.FunctionDescriptor
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class Win32AbiContractTest {
    @Test
    fun generatedScalarCarriersMatchWin64Abi() {
        val getLastError: () -> Int = ::GetLastError
        val setLastError: (Int) -> Unit = ::SetLastError
        val wide: WCHAR = '\u0000'

        assertNotNull(getLastError)
        assertNotNull(setLastError)
        assertEquals('\u0000', wide)
    }

    @Test
    fun generatedFunctionDescriptorsUseFourByteReturns() {
        assertEquals(4L, returnLayoutByteSize("GetLastError_DESC"))
        assertEquals(4L, returnLayoutByteSize("DwmSetWindowAttribute_DESC"))
    }

    private fun returnLayoutByteSize(fieldName: String): Long {
        val facade = Class.forName("org.graphiks.kffi.win32.generated.Win32_all_hKt")
        val field = facade.getDeclaredField(fieldName).apply { isAccessible = true }
        val descriptor = field.get(null) as FunctionDescriptor

        return descriptor.returnLayout().orElseThrow().byteSize()
    }
}
