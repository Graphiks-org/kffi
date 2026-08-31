@file:OptIn(PlatformAvailability::class)

package org.graphiks.kffi.objc

import kotlin.test.Test
import kotlin.test.assertNotNull

class ObjCTouchBindingTest {
    @Test
    fun touchCoordinatesAndAllowedTouchTypesAreGenerated() {
        val contract: (NSTouch, NSView) -> NSPoint = { touch, view ->
            view.setAllowedTouchTypes(NSTouchTypeMask.NSTouchTypeMaskDirect)
            touch.locationInView(view.ptr)
        }

        assertNotNull(contract)
    }
}
