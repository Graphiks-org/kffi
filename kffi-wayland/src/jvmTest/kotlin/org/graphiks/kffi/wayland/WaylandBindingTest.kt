package org.graphiks.kffi.wayland

import org.graphiks.kffi.wayland.protocol.zwp_text_input_manager_v3_interface as legacyTextInputManagerV3Interface
import org.graphiks.kffi.wayland.protocol.zwp_text_input_v3_interface as legacyTextInputV3Interface
import org.graphiks.kffi.wayland.generated.zwp_text_input_manager_v3_interface
import org.graphiks.kffi.wayland.generated.zwp_text_input_v3_interface
import org.graphiks.kffi.wayland.generated.xdg_wm_base_error
import org.graphiks.kffi.wayland.generated.xdg_toplevel_state
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

    @Test
    fun exposesGeneratedExtendedProtocolConstants() {
        assertEquals(1, XDG_ACTIVATION_GET_ACTIVATION_TOKEN)
        assertEquals(1, POINTER_CONSTRAINTS_LIFETIME_ONESHOT)
        assertEquals(2, POINTER_CONSTRAINTS_LIFETIME_PERSISTENT)
        assertEquals(0, RELATIVE_POINTER_EVENT_RELATIVE_MOTION)
        assertEquals(1, WP_CURSOR_SHAPE_DEVICE_SHAPE_DEFAULT)
        assertEquals(3, LINUX_DMABUF_GET_SURFACE_FEEDBACK)
    }

    @Test
    fun preservesHistoricalProtocolConstantNames() {
        assertEquals(1, ZWLR_SCREENCOPY_FRAME_FLAGS_Y_INVERT)
        assertEquals(1, ZWP_POINTER_CONSTRAINTS_V1_LIFETIME_ONESHOT)
        assertEquals(2, ZWP_POINTER_CONSTRAINTS_V1_LIFETIME_PERSISTENT)
    }

    @Test
    fun preservesLegacyTextInputDescriptorEntryPoints() {
        assertEquals("zwp_text_input_manager_v3_interface", ::legacyTextInputManagerV3Interface.name)
        assertEquals("zwp_text_input_v3_interface", ::legacyTextInputV3Interface.name)
        assertEquals("zwp_text_input_manager_v3_interface", ::zwp_text_input_manager_v3_interface.name)
        assertEquals("zwp_text_input_v3_interface", ::zwp_text_input_v3_interface.name)
    }

    @Test
    fun preservesMarshalDestroyCompatibilityConstant() {
        assertEquals(1, WL_MARSHAL_FLAG_DESTROY)
    }

    @Test
    fun preservesBackwardCompatibleXdgToplevelStateAliases() {
        assertEquals(10L, xdg_toplevel_state.XDG_TOPLEVEL_STATE_CONSTRAINED_LEFT.value)
        assertEquals(11L, xdg_toplevel_state.XDG_TOPLEVEL_STATE_CONSTRAINED_RIGHT.value)
        assertEquals(12L, xdg_toplevel_state.XDG_TOPLEVEL_STATE_CONSTRAINED_TOP.value)
        assertEquals(13L, xdg_toplevel_state.XDG_TOPLEVEL_STATE_CONSTRAINED_BOTTOM.value)
        assertEquals(
            xdg_toplevel_state.XDG_TOPLEVEL_STATE_CONSTRAINED_LEFT,
            xdg_toplevel_state.fromValue(10L)
        )
        assertEquals(
            xdg_toplevel_state.XDG_TOPLEVEL_STATE_CONSTRAINED_RIGHT,
            xdg_toplevel_state.fromValue(11L)
        )
        assertEquals(
            xdg_toplevel_state.XDG_TOPLEVEL_STATE_CONSTRAINED_TOP,
            xdg_toplevel_state.fromValue(12L)
        )
        assertEquals(
            xdg_toplevel_state.XDG_TOPLEVEL_STATE_CONSTRAINED_BOTTOM,
            xdg_toplevel_state.fromValue(13L)
        )
    }
}
