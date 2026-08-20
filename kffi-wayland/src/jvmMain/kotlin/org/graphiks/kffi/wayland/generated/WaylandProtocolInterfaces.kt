package org.graphiks.kffi.wayland.generated

import java.lang.foreign.*
import java.lang.foreign.ValueLayout.*
import java.lang.foreign.MemoryLayout.PathElement.*
import org.graphiks.kffi.wayland.libWaylandClient

// Arena.global() — wl_interface structs live for the process lifetime;
// libwayland holds pointers to them. A scoped/auto arena would risk
// use-after-free when the GC reclaims the arena.
private val ARENA = Arena.global()

val xdg_wm_base_interface: MemorySegment by lazy { build_xdg_wm_base() }
val xdg_positioner_interface: MemorySegment by lazy { build_xdg_positioner() }
val xdg_surface_interface: MemorySegment by lazy { build_xdg_surface() }
val xdg_toplevel_interface: MemorySegment by lazy { build_xdg_toplevel() }
val xdg_popup_interface: MemorySegment by lazy { build_xdg_popup() }
val zxdg_decoration_manager_v1_interface: MemorySegment by lazy { build_zxdg_decoration_manager_v1() }
val zxdg_toplevel_decoration_v1_interface: MemorySegment by lazy { build_zxdg_toplevel_decoration_v1() }
val zwp_text_input_v3_interface: MemorySegment by lazy { build_zwp_text_input_v3() }
val zwp_text_input_manager_v3_interface: MemorySegment by lazy { build_zwp_text_input_manager_v3() }
val zwlr_screencopy_manager_v1_interface: MemorySegment by lazy { build_zwlr_screencopy_manager_v1() }
val zwlr_screencopy_frame_v1_interface: MemorySegment by lazy { build_zwlr_screencopy_frame_v1() }
val xdg_activation_v1_interface: MemorySegment by lazy { build_xdg_activation_v1() }
val xdg_activation_token_v1_interface: MemorySegment by lazy { build_xdg_activation_token_v1() }
val zwp_pointer_constraints_v1_interface: MemorySegment by lazy { build_zwp_pointer_constraints_v1() }
val zwp_locked_pointer_v1_interface: MemorySegment by lazy { build_zwp_locked_pointer_v1() }
val zwp_confined_pointer_v1_interface: MemorySegment by lazy { build_zwp_confined_pointer_v1() }
val zwp_relative_pointer_manager_v1_interface: MemorySegment by lazy { build_zwp_relative_pointer_manager_v1() }
val zwp_relative_pointer_v1_interface: MemorySegment by lazy { build_zwp_relative_pointer_v1() }
val xdg_toplevel_icon_manager_v1_interface: MemorySegment by lazy { build_xdg_toplevel_icon_manager_v1() }
val xdg_toplevel_icon_v1_interface: MemorySegment by lazy { build_xdg_toplevel_icon_v1() }
val wp_fractional_scale_manager_v1_interface: MemorySegment by lazy { build_wp_fractional_scale_manager_v1() }
val wp_fractional_scale_v1_interface: MemorySegment by lazy { build_wp_fractional_scale_v1() }
val wp_viewporter_interface: MemorySegment by lazy { build_wp_viewporter() }
val wp_viewport_interface: MemorySegment by lazy { build_wp_viewport() }
val wp_presentation_interface: MemorySegment by lazy { build_wp_presentation() }
val wp_presentation_feedback_interface: MemorySegment by lazy { build_wp_presentation_feedback() }
val zwp_linux_dmabuf_v1_interface: MemorySegment by lazy { build_zwp_linux_dmabuf_v1() }
val zwp_linux_buffer_params_v1_interface: MemorySegment by lazy { build_zwp_linux_buffer_params_v1() }
val zwp_linux_dmabuf_feedback_v1_interface: MemorySegment by lazy { build_zwp_linux_dmabuf_feedback_v1() }
val wp_cursor_shape_manager_v1_interface: MemorySegment by lazy { build_wp_cursor_shape_manager_v1() }
val wp_cursor_shape_device_v1_interface: MemorySegment by lazy { build_wp_cursor_shape_device_v1() }
val zwp_tablet_manager_v2_interface: MemorySegment by lazy { build_zwp_tablet_manager_v2() }
val zwp_tablet_seat_v2_interface: MemorySegment by lazy { build_zwp_tablet_seat_v2() }
val zwp_tablet_tool_v2_interface: MemorySegment by lazy { build_zwp_tablet_tool_v2() }
val zwp_tablet_v2_interface: MemorySegment by lazy { build_zwp_tablet_v2() }
val zwp_tablet_pad_ring_v2_interface: MemorySegment by lazy { build_zwp_tablet_pad_ring_v2() }
val zwp_tablet_pad_strip_v2_interface: MemorySegment by lazy { build_zwp_tablet_pad_strip_v2() }
val zwp_tablet_pad_group_v2_interface: MemorySegment by lazy { build_zwp_tablet_pad_group_v2() }
val zwp_tablet_pad_v2_interface: MemorySegment by lazy { build_zwp_tablet_pad_v2() }
val wl_display_interface: MemorySegment by lazy { build_wl_display() }
val wl_registry_interface: MemorySegment by lazy { build_wl_registry() }
val wl_callback_interface: MemorySegment by lazy { build_wl_callback() }
val wl_compositor_interface: MemorySegment by lazy { build_wl_compositor() }
val wl_shm_pool_interface: MemorySegment by lazy { build_wl_shm_pool() }
val wl_shm_interface: MemorySegment by lazy { build_wl_shm() }
val wl_buffer_interface: MemorySegment by lazy { build_wl_buffer() }
val wl_data_offer_interface: MemorySegment by lazy { build_wl_data_offer() }
val wl_data_source_interface: MemorySegment by lazy { build_wl_data_source() }
val wl_data_device_interface: MemorySegment by lazy { build_wl_data_device() }
val wl_data_device_manager_interface: MemorySegment by lazy { build_wl_data_device_manager() }
val wl_shell_interface: MemorySegment by lazy { build_wl_shell() }
val wl_shell_surface_interface: MemorySegment by lazy { build_wl_shell_surface() }
val wl_surface_interface: MemorySegment by lazy { build_wl_surface() }
val wl_seat_interface: MemorySegment by lazy { build_wl_seat() }
val wl_pointer_interface: MemorySegment by lazy { build_wl_pointer() }
val wl_keyboard_interface: MemorySegment by lazy { build_wl_keyboard() }
val wl_touch_interface: MemorySegment by lazy { build_wl_touch() }
val wl_output_interface: MemorySegment by lazy { build_wl_output() }
val wl_region_interface: MemorySegment by lazy { build_wl_region() }
val wl_subcompositor_interface: MemorySegment by lazy { build_wl_subcompositor() }
val wl_subsurface_interface: MemorySegment by lazy { build_wl_subsurface() }

private val MSG_LAYOUT = MemoryLayout.structLayout(
    ADDRESS.withName("name"), ADDRESS.withName("signature"), ADDRESS.withName("types"))
    .withByteAlignment(8)
private val IFACE_LAYOUT = MemoryLayout.structLayout(
    ADDRESS.withName("name"),
    JAVA_INT.withName("version"),
    JAVA_INT.withName("method_count"),
    ADDRESS.withName("methods").withByteAlignment(8),
    JAVA_INT.withName("event_count"),
    MemoryLayout.paddingLayout(4),
    ADDRESS.withName("events").withByteAlignment(8))
    .withByteAlignment(8)

private fun build_xdg_wm_base(): MemorySegment = iface("xdg_wm_base", 6, arrayOf(
    msg("destroy", ""),
    msg("create_positioner", "n", xdg_positioner_interface),
    msg("get_xdg_surface", "no", xdg_surface_interface, wl_surface_interface),
    msg("pong", "u", MemorySegment.NULL)
), arrayOf(
    msg("ping", "u", MemorySegment.NULL)
))

private fun build_xdg_positioner(): MemorySegment = iface("xdg_positioner", 6, arrayOf(
    msg("destroy", ""),
    msg("set_size", "ii", MemorySegment.NULL, MemorySegment.NULL),
    msg("set_anchor_rect", "iiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("set_anchor", "u", MemorySegment.NULL),
    msg("set_gravity", "u", MemorySegment.NULL),
    msg("set_constraint_adjustment", "u", MemorySegment.NULL),
    msg("set_offset", "ii", MemorySegment.NULL, MemorySegment.NULL),
    msg("set_reactive", "3"),
    msg("set_parent_size", "3ii", MemorySegment.NULL, MemorySegment.NULL),
    msg("set_parent_configure", "3u", MemorySegment.NULL)
), arrayOf(
))

private fun build_xdg_surface(): MemorySegment = iface("xdg_surface", 6, arrayOf(
    msg("destroy", ""),
    msg("get_toplevel", "n", xdg_toplevel_interface),
    msg("get_popup", "n?oo", xdg_popup_interface, MemorySegment.NULL, xdg_positioner_interface),
    msg("set_window_geometry", "iiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("ack_configure", "u", MemorySegment.NULL)
), arrayOf(
    msg("configure", "u", MemorySegment.NULL)
))

private fun build_xdg_toplevel(): MemorySegment = iface("xdg_toplevel", 6, arrayOf(
    msg("destroy", ""),
    msg("set_parent", "?o", MemorySegment.NULL),
    msg("set_title", "s", MemorySegment.NULL),
    msg("set_app_id", "s", MemorySegment.NULL),
    msg("show_window_menu", "ouii", wl_seat_interface, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("move", "ou", wl_seat_interface, MemorySegment.NULL),
    msg("resize", "ouu", wl_seat_interface, MemorySegment.NULL, MemorySegment.NULL),
    msg("set_max_size", "ii", MemorySegment.NULL, MemorySegment.NULL),
    msg("set_min_size", "ii", MemorySegment.NULL, MemorySegment.NULL),
    msg("set_maximized", ""),
    msg("unset_maximized", ""),
    msg("set_fullscreen", "?o", wl_output_interface),
    msg("unset_fullscreen", ""),
    msg("set_minimized", "")
), arrayOf(
    msg("configure", "iia", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("close", ""),
    msg("configure_bounds", "4ii", MemorySegment.NULL, MemorySegment.NULL),
    msg("wm_capabilities", "5a", MemorySegment.NULL)
))

private fun build_xdg_popup(): MemorySegment = iface("xdg_popup", 6, arrayOf(
    msg("destroy", ""),
    msg("grab", "ou", wl_seat_interface, MemorySegment.NULL),
    msg("reposition", "3ou", xdg_positioner_interface, MemorySegment.NULL)
), arrayOf(
    msg("configure", "iiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("popup_done", ""),
    msg("repositioned", "3u", MemorySegment.NULL)
))

private fun build_zxdg_decoration_manager_v1(): MemorySegment = iface("zxdg_decoration_manager_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("get_toplevel_decoration", "no", zxdg_toplevel_decoration_v1_interface, xdg_toplevel_interface)
), arrayOf(
))

private fun build_zxdg_toplevel_decoration_v1(): MemorySegment = iface("zxdg_toplevel_decoration_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("set_mode", "u", MemorySegment.NULL),
    msg("unset_mode", "")
), arrayOf(
    msg("configure", "u", MemorySegment.NULL)
))

private fun build_zwp_text_input_v3(): MemorySegment = iface("zwp_text_input_v3", 1, arrayOf(
    msg("destroy", ""),
    msg("enable", ""),
    msg("disable", ""),
    msg("set_surrounding_text", "sii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("set_text_change_cause", "u", MemorySegment.NULL),
    msg("set_content_type", "uu", MemorySegment.NULL, MemorySegment.NULL),
    msg("set_cursor_rectangle", "iiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("commit", "")
), arrayOf(
    msg("enter", "o", wl_surface_interface),
    msg("leave", "o", wl_surface_interface),
    msg("preedit_string", "?sii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("commit_string", "?s", MemorySegment.NULL),
    msg("delete_surrounding_text", "uu", MemorySegment.NULL, MemorySegment.NULL),
    msg("done", "u", MemorySegment.NULL)
))

private fun build_zwp_text_input_manager_v3(): MemorySegment = iface("zwp_text_input_manager_v3", 1, arrayOf(
    msg("destroy", ""),
    msg("get_text_input", "no", zwp_text_input_v3_interface, wl_seat_interface)
), arrayOf(
))

private fun build_zwlr_screencopy_manager_v1(): MemorySegment = iface("zwlr_screencopy_manager_v1", 3, arrayOf(
    msg("capture_output", "nio", zwlr_screencopy_frame_v1_interface, MemorySegment.NULL, wl_output_interface),
    msg("capture_output_region", "nioiiii", zwlr_screencopy_frame_v1_interface, MemorySegment.NULL, wl_output_interface, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("destroy", "")
), arrayOf(
))

private fun build_zwlr_screencopy_frame_v1(): MemorySegment = iface("zwlr_screencopy_frame_v1", 3, arrayOf(
    msg("copy", "o", wl_buffer_interface),
    msg("destroy", ""),
    msg("copy_with_damage", "2o", wl_buffer_interface)
), arrayOf(
    msg("buffer", "uuuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("flags", "u", MemorySegment.NULL),
    msg("ready", "uuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("failed", ""),
    msg("damage", "2uuuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("linux_dmabuf", "3uuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("buffer_done", "3")
))

private fun build_xdg_activation_v1(): MemorySegment = iface("xdg_activation_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("get_activation_token", "n", xdg_activation_token_v1_interface),
    msg("activate", "so", MemorySegment.NULL, wl_surface_interface)
), arrayOf(
))

private fun build_xdg_activation_token_v1(): MemorySegment = iface("xdg_activation_token_v1", 1, arrayOf(
    msg("set_serial", "uo", MemorySegment.NULL, wl_seat_interface),
    msg("set_app_id", "s", MemorySegment.NULL),
    msg("set_surface", "o", wl_surface_interface),
    msg("commit", ""),
    msg("destroy", "")
), arrayOf(
    msg("done", "s", MemorySegment.NULL)
))

private fun build_zwp_pointer_constraints_v1(): MemorySegment = iface("zwp_pointer_constraints_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("lock_pointer", "noo?ou", zwp_locked_pointer_v1_interface, wl_surface_interface, wl_pointer_interface, wl_region_interface, MemorySegment.NULL),
    msg("confine_pointer", "noo?ou", zwp_confined_pointer_v1_interface, wl_surface_interface, wl_pointer_interface, wl_region_interface, MemorySegment.NULL)
), arrayOf(
))

private fun build_zwp_locked_pointer_v1(): MemorySegment = iface("zwp_locked_pointer_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("set_cursor_position_hint", "ff", MemorySegment.NULL, MemorySegment.NULL),
    msg("set_region", "?o", wl_region_interface)
), arrayOf(
    msg("locked", ""),
    msg("unlocked", "")
))

private fun build_zwp_confined_pointer_v1(): MemorySegment = iface("zwp_confined_pointer_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("set_region", "?o", wl_region_interface)
), arrayOf(
    msg("confined", ""),
    msg("unconfined", "")
))

private fun build_zwp_relative_pointer_manager_v1(): MemorySegment = iface("zwp_relative_pointer_manager_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("get_relative_pointer", "no", zwp_relative_pointer_v1_interface, wl_pointer_interface)
), arrayOf(
))

private fun build_zwp_relative_pointer_v1(): MemorySegment = iface("zwp_relative_pointer_v1", 1, arrayOf(
    msg("destroy", "")
), arrayOf(
    msg("relative_motion", "uuffff", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL)
))

private fun build_xdg_toplevel_icon_manager_v1(): MemorySegment = iface("xdg_toplevel_icon_manager_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("create_icon", "n", xdg_toplevel_icon_v1_interface),
    msg("set_icon", "o?o", xdg_toplevel_interface, xdg_toplevel_icon_v1_interface)
), arrayOf(
    msg("icon_size", "i", MemorySegment.NULL),
    msg("done", "")
))

private fun build_xdg_toplevel_icon_v1(): MemorySegment = iface("xdg_toplevel_icon_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("set_name", "s", MemorySegment.NULL),
    msg("add_buffer", "oi", wl_buffer_interface, MemorySegment.NULL)
), arrayOf(
))

private fun build_wp_fractional_scale_manager_v1(): MemorySegment = iface("wp_fractional_scale_manager_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("get_fractional_scale", "no", wp_fractional_scale_v1_interface, wl_surface_interface)
), arrayOf(
))

private fun build_wp_fractional_scale_v1(): MemorySegment = iface("wp_fractional_scale_v1", 1, arrayOf(
    msg("destroy", "")
), arrayOf(
    msg("preferred_scale", "u", MemorySegment.NULL)
))

private fun build_wp_viewporter(): MemorySegment = iface("wp_viewporter", 1, arrayOf(
    msg("destroy", ""),
    msg("get_viewport", "no", wp_viewport_interface, wl_surface_interface)
), arrayOf(
))

private fun build_wp_viewport(): MemorySegment = iface("wp_viewport", 1, arrayOf(
    msg("destroy", ""),
    msg("set_source", "ffff", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("set_destination", "ii", MemorySegment.NULL, MemorySegment.NULL)
), arrayOf(
))

private fun build_wp_presentation(): MemorySegment = iface("wp_presentation", 2, arrayOf(
    msg("destroy", ""),
    msg("feedback", "on", wl_surface_interface, wp_presentation_feedback_interface)
), arrayOf(
    msg("clock_id", "u", MemorySegment.NULL)
))

private fun build_wp_presentation_feedback(): MemorySegment = iface("wp_presentation_feedback", 2, arrayOf(
), arrayOf(
    msg("sync_output", "o", wl_output_interface),
    msg("presented", "uuuuuuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("discarded", "")
))

private fun build_zwp_linux_dmabuf_v1(): MemorySegment = iface("zwp_linux_dmabuf_v1", 5, arrayOf(
    msg("destroy", ""),
    msg("create_params", "n", zwp_linux_buffer_params_v1_interface),
    msg("get_default_feedback", "4n", zwp_linux_dmabuf_feedback_v1_interface),
    msg("get_surface_feedback", "4no", zwp_linux_dmabuf_feedback_v1_interface, wl_surface_interface)
), arrayOf(
    msg("format", "u", MemorySegment.NULL),
    msg("modifier", "3uuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL)
))

private fun build_zwp_linux_buffer_params_v1(): MemorySegment = iface("zwp_linux_buffer_params_v1", 5, arrayOf(
    msg("destroy", ""),
    msg("add", "huuuuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("create", "iiuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("create_immed", "2niiuu", wl_buffer_interface, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL)
), arrayOf(
    msg("created", "n", wl_buffer_interface),
    msg("failed", "")
))

private fun build_zwp_linux_dmabuf_feedback_v1(): MemorySegment = iface("zwp_linux_dmabuf_feedback_v1", 5, arrayOf(
    msg("destroy", "")
), arrayOf(
    msg("done", ""),
    msg("format_table", "hu", MemorySegment.NULL, MemorySegment.NULL),
    msg("main_device", "a", MemorySegment.NULL),
    msg("tranche_done", ""),
    msg("tranche_target_device", "a", MemorySegment.NULL),
    msg("tranche_formats", "a", MemorySegment.NULL),
    msg("tranche_flags", "u", MemorySegment.NULL)
))

private fun build_wp_cursor_shape_manager_v1(): MemorySegment = iface("wp_cursor_shape_manager_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("get_pointer", "no", wp_cursor_shape_device_v1_interface, wl_pointer_interface),
    msg("get_tablet_tool_v2", "no", wp_cursor_shape_device_v1_interface, zwp_tablet_tool_v2_interface)
), arrayOf(
))

private fun build_wp_cursor_shape_device_v1(): MemorySegment = iface("wp_cursor_shape_device_v1", 1, arrayOf(
    msg("destroy", ""),
    msg("set_shape", "uu", MemorySegment.NULL, MemorySegment.NULL)
), arrayOf(
))

private fun build_zwp_tablet_manager_v2(): MemorySegment = iface("zwp_tablet_manager_v2", 1, arrayOf(
    msg("get_tablet_seat", "no", zwp_tablet_seat_v2_interface, wl_seat_interface),
    msg("destroy", "")
), arrayOf(
))

private fun build_zwp_tablet_seat_v2(): MemorySegment = iface("zwp_tablet_seat_v2", 1, arrayOf(
    msg("destroy", "")
), arrayOf(
    msg("tablet_added", "n", zwp_tablet_v2_interface),
    msg("tool_added", "n", zwp_tablet_tool_v2_interface),
    msg("pad_added", "n", zwp_tablet_pad_v2_interface)
))

private fun build_zwp_tablet_tool_v2(): MemorySegment = iface("zwp_tablet_tool_v2", 1, arrayOf(
    msg("set_cursor", "u?oii", MemorySegment.NULL, wl_surface_interface, MemorySegment.NULL, MemorySegment.NULL),
    msg("destroy", "")
), arrayOf(
    msg("type", "u", MemorySegment.NULL),
    msg("hardware_serial", "uu", MemorySegment.NULL, MemorySegment.NULL),
    msg("hardware_id_wacom", "uu", MemorySegment.NULL, MemorySegment.NULL),
    msg("capability", "u", MemorySegment.NULL),
    msg("done", ""),
    msg("removed", ""),
    msg("proximity_in", "uoo", MemorySegment.NULL, zwp_tablet_v2_interface, wl_surface_interface),
    msg("proximity_out", ""),
    msg("down", "u", MemorySegment.NULL),
    msg("up", ""),
    msg("motion", "ff", MemorySegment.NULL, MemorySegment.NULL),
    msg("pressure", "u", MemorySegment.NULL),
    msg("distance", "u", MemorySegment.NULL),
    msg("tilt", "ff", MemorySegment.NULL, MemorySegment.NULL),
    msg("rotation", "f", MemorySegment.NULL),
    msg("slider", "i", MemorySegment.NULL),
    msg("wheel", "fi", MemorySegment.NULL, MemorySegment.NULL),
    msg("button", "uuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("frame", "u", MemorySegment.NULL)
))

private fun build_zwp_tablet_v2(): MemorySegment = iface("zwp_tablet_v2", 1, arrayOf(
    msg("destroy", "")
), arrayOf(
    msg("name", "s", MemorySegment.NULL),
    msg("id", "uu", MemorySegment.NULL, MemorySegment.NULL),
    msg("path", "s", MemorySegment.NULL),
    msg("done", ""),
    msg("removed", "")
))

private fun build_zwp_tablet_pad_ring_v2(): MemorySegment = iface("zwp_tablet_pad_ring_v2", 1, arrayOf(
    msg("set_feedback", "su", MemorySegment.NULL, MemorySegment.NULL),
    msg("destroy", "")
), arrayOf(
    msg("source", "u", MemorySegment.NULL),
    msg("angle", "f", MemorySegment.NULL),
    msg("stop", ""),
    msg("frame", "u", MemorySegment.NULL)
))

private fun build_zwp_tablet_pad_strip_v2(): MemorySegment = iface("zwp_tablet_pad_strip_v2", 1, arrayOf(
    msg("set_feedback", "su", MemorySegment.NULL, MemorySegment.NULL),
    msg("destroy", "")
), arrayOf(
    msg("source", "u", MemorySegment.NULL),
    msg("position", "u", MemorySegment.NULL),
    msg("stop", ""),
    msg("frame", "u", MemorySegment.NULL)
))

private fun build_zwp_tablet_pad_group_v2(): MemorySegment = iface("zwp_tablet_pad_group_v2", 1, arrayOf(
    msg("destroy", "")
), arrayOf(
    msg("buttons", "a", MemorySegment.NULL),
    msg("ring", "n", zwp_tablet_pad_ring_v2_interface),
    msg("strip", "n", zwp_tablet_pad_strip_v2_interface),
    msg("modes", "u", MemorySegment.NULL),
    msg("done", ""),
    msg("mode_switch", "uuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL)
))

private fun build_zwp_tablet_pad_v2(): MemorySegment = iface("zwp_tablet_pad_v2", 1, arrayOf(
    msg("set_feedback", "usu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("destroy", "")
), arrayOf(
    msg("group", "n", zwp_tablet_pad_group_v2_interface),
    msg("path", "s", MemorySegment.NULL),
    msg("buttons", "u", MemorySegment.NULL),
    msg("done", ""),
    msg("button", "uuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("enter", "uoo", MemorySegment.NULL, zwp_tablet_v2_interface, wl_surface_interface),
    msg("leave", "uo", MemorySegment.NULL, wl_surface_interface),
    msg("removed", "")
))

private fun build_wl_display(): MemorySegment = iface("wl_display", 1, arrayOf(
    msg("sync", "n", wl_callback_interface),
    msg("get_registry", "n", wl_registry_interface)
), arrayOf(
    msg("error", "ous", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("delete_id", "u", MemorySegment.NULL)
))

private fun build_wl_registry(): MemorySegment = iface("wl_registry", 1, arrayOf(
    msg("bind", "un", MemorySegment.NULL, MemorySegment.NULL)
), arrayOf(
    msg("global", "usu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("global_remove", "u", MemorySegment.NULL)
))

private fun build_wl_callback(): MemorySegment = iface("wl_callback", 1, arrayOf(
), arrayOf(
    msg("done", "u", MemorySegment.NULL)
))

private fun build_wl_compositor(): MemorySegment = iface("wl_compositor", 6, arrayOf(
    msg("create_surface", "n", wl_surface_interface),
    msg("create_region", "n", wl_region_interface)
), arrayOf(
))

private fun build_wl_shm_pool(): MemorySegment = iface("wl_shm_pool", 1, arrayOf(
    msg("create_buffer", "niiiiu", wl_buffer_interface, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("destroy", ""),
    msg("resize", "i", MemorySegment.NULL)
), arrayOf(
))

private fun build_wl_shm(): MemorySegment = iface("wl_shm", 1, arrayOf(
    msg("create_pool", "nhi", wl_shm_pool_interface, MemorySegment.NULL, MemorySegment.NULL)
), arrayOf(
    msg("format", "u", MemorySegment.NULL)
))

private fun build_wl_buffer(): MemorySegment = iface("wl_buffer", 1, arrayOf(
    msg("destroy", "")
), arrayOf(
    msg("release", "")
))

private fun build_wl_data_offer(): MemorySegment = iface("wl_data_offer", 3, arrayOf(
    msg("accept", "u?s", MemorySegment.NULL, MemorySegment.NULL),
    msg("receive", "sh", MemorySegment.NULL, MemorySegment.NULL),
    msg("destroy", ""),
    msg("finish", "3"),
    msg("set_actions", "3uu", MemorySegment.NULL, MemorySegment.NULL)
), arrayOf(
    msg("offer", "s", MemorySegment.NULL),
    msg("source_actions", "3u", MemorySegment.NULL),
    msg("action", "3u", MemorySegment.NULL)
))

private fun build_wl_data_source(): MemorySegment = iface("wl_data_source", 3, arrayOf(
    msg("offer", "s", MemorySegment.NULL),
    msg("destroy", ""),
    msg("set_actions", "3u", MemorySegment.NULL)
), arrayOf(
    msg("target", "?s", MemorySegment.NULL),
    msg("send", "sh", MemorySegment.NULL, MemorySegment.NULL),
    msg("cancelled", ""),
    msg("dnd_drop_performed", "3"),
    msg("dnd_finished", "3"),
    msg("action", "3u", MemorySegment.NULL)
))

private fun build_wl_data_device(): MemorySegment = iface("wl_data_device", 3, arrayOf(
    msg("start_drag", "?oo?ou", wl_data_source_interface, wl_surface_interface, wl_surface_interface, MemorySegment.NULL),
    msg("set_selection", "?ou", wl_data_source_interface, MemorySegment.NULL),
    msg("release", "2")
), arrayOf(
    msg("data_offer", "n", wl_data_offer_interface),
    msg("enter", "uoff?o", MemorySegment.NULL, wl_surface_interface, MemorySegment.NULL, MemorySegment.NULL, wl_data_offer_interface),
    msg("leave", ""),
    msg("motion", "uff", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("drop", ""),
    msg("selection", "?o", wl_data_offer_interface)
))

private fun build_wl_data_device_manager(): MemorySegment = iface("wl_data_device_manager", 3, arrayOf(
    msg("create_data_source", "n", wl_data_source_interface),
    msg("get_data_device", "no", wl_data_device_interface, wl_seat_interface)
), arrayOf(
))

private fun build_wl_shell(): MemorySegment = iface("wl_shell", 1, arrayOf(
    msg("get_shell_surface", "no", wl_shell_surface_interface, wl_surface_interface)
), arrayOf(
))

private fun build_wl_shell_surface(): MemorySegment = iface("wl_shell_surface", 1, arrayOf(
    msg("pong", "u", MemorySegment.NULL),
    msg("move", "ou", wl_seat_interface, MemorySegment.NULL),
    msg("resize", "ouu", wl_seat_interface, MemorySegment.NULL, MemorySegment.NULL),
    msg("set_toplevel", ""),
    msg("set_transient", "oiiu", wl_surface_interface, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("set_fullscreen", "uu?o", MemorySegment.NULL, MemorySegment.NULL, wl_output_interface),
    msg("set_popup", "ouoiiu", wl_seat_interface, MemorySegment.NULL, wl_surface_interface, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("set_maximized", "?o", wl_output_interface),
    msg("set_title", "s", MemorySegment.NULL),
    msg("set_class", "s", MemorySegment.NULL)
), arrayOf(
    msg("ping", "u", MemorySegment.NULL),
    msg("configure", "uii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("popup_done", "")
))

private fun build_wl_surface(): MemorySegment = iface("wl_surface", 6, arrayOf(
    msg("destroy", ""),
    msg("attach", "?oii", wl_buffer_interface, MemorySegment.NULL, MemorySegment.NULL),
    msg("damage", "iiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("frame", "n", wl_callback_interface),
    msg("set_opaque_region", "?o", wl_region_interface),
    msg("set_input_region", "?o", wl_region_interface),
    msg("commit", ""),
    msg("set_buffer_transform", "2i", MemorySegment.NULL),
    msg("set_buffer_scale", "3i", MemorySegment.NULL),
    msg("damage_buffer", "4iiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("offset", "5ii", MemorySegment.NULL, MemorySegment.NULL)
), arrayOf(
    msg("enter", "o", wl_output_interface),
    msg("leave", "o", wl_output_interface),
    msg("preferred_buffer_scale", "6i", MemorySegment.NULL),
    msg("preferred_buffer_transform", "6u", MemorySegment.NULL)
))

private fun build_wl_seat(): MemorySegment = iface("wl_seat", 9, arrayOf(
    msg("get_pointer", "n", wl_pointer_interface),
    msg("get_keyboard", "n", wl_keyboard_interface),
    msg("get_touch", "n", wl_touch_interface),
    msg("release", "5")
), arrayOf(
    msg("capabilities", "u", MemorySegment.NULL),
    msg("name", "2s", MemorySegment.NULL)
))

private fun build_wl_pointer(): MemorySegment = iface("wl_pointer", 9, arrayOf(
    msg("set_cursor", "u?oii", MemorySegment.NULL, wl_surface_interface, MemorySegment.NULL, MemorySegment.NULL),
    msg("release", "3")
), arrayOf(
    msg("enter", "uoff", MemorySegment.NULL, wl_surface_interface, MemorySegment.NULL, MemorySegment.NULL),
    msg("leave", "uo", MemorySegment.NULL, wl_surface_interface),
    msg("motion", "uff", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("button", "uuuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("axis", "uuf", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("frame", "5"),
    msg("axis_source", "5u", MemorySegment.NULL),
    msg("axis_stop", "5uu", MemorySegment.NULL, MemorySegment.NULL),
    msg("axis_discrete", "5ui", MemorySegment.NULL, MemorySegment.NULL),
    msg("axis_value120", "8ui", MemorySegment.NULL, MemorySegment.NULL),
    msg("axis_relative_direction", "9uu", MemorySegment.NULL, MemorySegment.NULL)
))

private fun build_wl_keyboard(): MemorySegment = iface("wl_keyboard", 9, arrayOf(
    msg("release", "3")
), arrayOf(
    msg("keymap", "uhu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("enter", "uoa", MemorySegment.NULL, wl_surface_interface, MemorySegment.NULL),
    msg("leave", "uo", MemorySegment.NULL, wl_surface_interface),
    msg("key", "uuuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("modifiers", "uuuuu", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("repeat_info", "4ii", MemorySegment.NULL, MemorySegment.NULL)
))

private fun build_wl_touch(): MemorySegment = iface("wl_touch", 9, arrayOf(
    msg("release", "3")
), arrayOf(
    msg("down", "uuoiff", MemorySegment.NULL, MemorySegment.NULL, wl_surface_interface, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("up", "uui", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("motion", "uiff", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("frame", ""),
    msg("cancel", ""),
    msg("shape", "6iff", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("orientation", "6if", MemorySegment.NULL, MemorySegment.NULL)
))

private fun build_wl_output(): MemorySegment = iface("wl_output", 4, arrayOf(
    msg("release", "3")
), arrayOf(
    msg("geometry", "iiiiissi", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("mode", "uiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("done", "2"),
    msg("scale", "2i", MemorySegment.NULL),
    msg("name", "4s", MemorySegment.NULL),
    msg("description", "4s", MemorySegment.NULL)
))

private fun build_wl_region(): MemorySegment = iface("wl_region", 1, arrayOf(
    msg("destroy", ""),
    msg("add", "iiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL),
    msg("subtract", "iiii", MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL)
), arrayOf(
))

private fun build_wl_subcompositor(): MemorySegment = iface("wl_subcompositor", 1, arrayOf(
    msg("destroy", ""),
    msg("get_subsurface", "noo", wl_subsurface_interface, wl_surface_interface, wl_surface_interface)
), arrayOf(
))

private fun build_wl_subsurface(): MemorySegment = iface("wl_subsurface", 1, arrayOf(
    msg("destroy", ""),
    msg("set_position", "ii", MemorySegment.NULL, MemorySegment.NULL),
    msg("place_above", "o", wl_surface_interface),
    msg("place_below", "o", wl_surface_interface),
    msg("set_sync", ""),
    msg("set_desync", "")
), arrayOf(
))

private fun msg(name: String, signature: String, vararg types: MemorySegment): MemorySegment {
    val seg = ARENA.allocate(MSG_LAYOUT)
    seg.set(ADDRESS, 0L, ARENA.allocateFrom(name))
    seg.set(ADDRESS, 8L, ARENA.allocateFrom(signature))
    if (types.isEmpty()) {
        seg.set(ADDRESS, 16L, MemorySegment.NULL)
    } else {
        val arr = ARENA.allocate(ADDRESS, (types.size + 1).toLong())
        for (i in types.indices) arr.set(ADDRESS, (i * 8).toLong(), types[i])
        arr.set(ADDRESS, (types.size * 8).toLong(), MemorySegment.NULL)
        seg.set(ADDRESS, 16L, arr)
    }
    return seg
}

private fun iface(
    name: String, version: Int,
    methods: Array<MemorySegment>,
    events: Array<MemorySegment>
): MemorySegment {
    val seg = ARENA.allocate(IFACE_LAYOUT)
    seg.set(ADDRESS, 0L, ARENA.allocateFrom(name))
    seg.set(JAVA_INT, 8L, version)
    seg.set(JAVA_INT, 12L, methods.size)
    if (methods.isNotEmpty()) {
        val arr = ARENA.allocate(MSG_LAYOUT, methods.size.toLong())
        for (i in methods.indices) arr.asSlice(i * 24L).copyFrom(methods[i])
        seg.set(ADDRESS, 16L, arr)
    } else {
        seg.set(ADDRESS, 16L, MemorySegment.NULL)
    }
    seg.set(JAVA_INT, 24L, events.size)
    if (events.isNotEmpty()) {
        val arr = ARENA.allocate(MSG_LAYOUT, events.size.toLong())
        for (i in events.indices) arr.asSlice(i * 24L).copyFrom(events[i])
        seg.set(ADDRESS, 32L, arr)
    } else {
        seg.set(ADDRESS, 32L, MemorySegment.NULL)
    }
    return seg
}
