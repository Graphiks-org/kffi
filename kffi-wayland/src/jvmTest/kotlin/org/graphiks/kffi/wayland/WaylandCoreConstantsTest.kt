package org.graphiks.kffi.wayland

import kotlin.test.Test
import kotlin.test.assertEquals

class WaylandCoreConstantsTest {
    @Test
    fun exposesCoreWaylandRequestOpcodesAndMarshalFlag() {
        assertEquals(0, WL_COMPOSITOR_CREATE_SURFACE)
        assertEquals(0, WL_SURFACE_DESTROY)
        assertEquals(3, WL_SURFACE_FRAME)
        assertEquals(6, WL_SURFACE_COMMIT)
        assertEquals(1, WL_SHM_POOL_DESTROY)
        assertEquals(0, WL_BUFFER_DESTROY)
        assertEquals(1, WL_MARSHAL_FLAG_DESTROY)
    }
}
