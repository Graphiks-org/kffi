@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.engine

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class JvmScreenCapturePickerBridgeTest : FreeSpec({
    "picker route forwards each observer shape only while installed" {
        val calls = mutableListOf<String>()
        val registration = JvmScreenCapturePickerBridge.install(
            receiver = 101L,
            route = object : JvmScreenCapturePickerRoute {
                override fun didCancel(picker: Long, stream: Long) {
                    calls += "cancel:$picker:$stream"
                }

                override fun didUpdate(picker: Long, filter: Long, stream: Long) {
                    calls += "update:$picker:$filter:$stream"
                }

                override fun didFail(error: Long) {
                    calls += "failure:$error"
                }
            },
        )

        JvmScreenCapturePickerBridge.dispatchDidCancel(101L, 2L, 3L, 5L)
        JvmScreenCapturePickerBridge.dispatchDidUpdate(101L, 7L, 11L, 13L, 17L)
        JvmScreenCapturePickerBridge.dispatchStartDidFail(101L, 19L, 23L)
        registration.close()
        JvmScreenCapturePickerBridge.dispatchDidCancel(101L, 2L, 29L, 31L)

        calls shouldBe
            listOf(
                "cancel:3:5",
                "update:11:13:17",
                "failure:23",
            )
    }
})
