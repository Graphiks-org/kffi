package org.graphiks.kffi.wayland

import org.graphiks.kffi.wayland.generated.xdg_wm_base_error
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class WaylandBindingTest {
    @Test
    fun exposesStableCoreInterfaceNames() {
        assertEquals("wl_compositor", WL_COMPOSITOR_INTERFACE_NAME)
        assertEquals("xdg_wm_base", XDG_WM_BASE_INTERFACE_NAME)
    }

    @Test
    fun generatedProtocolEnumsRejectUnknownValues() {
        assertEquals(0L, xdg_wm_base_error.XDG_WM_BASE_ERROR_ROLE.value)
        assertFailsWith<IllegalStateException> {
            xdg_wm_base_error.fromValue(-1L)
        }
    }

    @Test
    fun exposesGeneratedProtocolOpcodesAndFlags() {
        assertEquals(2, XDG_SURFACE_GET_POPUP)
        assertEquals(0, SCREENCOPY_MANAGER_CAPTURE_OUTPUT)
        assertEquals(7, TEXT_INPUT_COMMIT)
        assertEquals(1, SCREENCOPY_FRAME_FLAGS_Y_INVERT)
    }
}
