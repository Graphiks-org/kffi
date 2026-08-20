package org.graphiks.kffi.wayland.protocol

import java.lang.foreign.MemorySegment
import org.graphiks.kffi.wayland.generated.zwp_text_input_manager_v3_interface as generatedTextInputManagerV3Interface
import org.graphiks.kffi.wayland.generated.zwp_text_input_v3_interface as generatedTextInputV3Interface

val zwp_text_input_manager_v3_interface: MemorySegment
    get() = generatedTextInputManagerV3Interface

val zwp_text_input_v3_interface: MemorySegment
    get() = generatedTextInputV3Interface
