package org.graphiks.kffi.objc.managed

import java.nio.file.Files
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertTrue

class ManagedRuntimeClasspathTest {
    @Test
    fun consumerWithOnlyKffiObjcDeclaredDependencyWasCompiled() {
        val classFile = Path.of(
            requireNotNull(System.getProperty("kffi.objc.managed.consumer.classFile")) {
                "consumer class file proof path was not configured"
            },
        )

        assertTrue(
            Files.isRegularFile(classFile),
            "Expected the isolated managed API consumer to compile to $classFile",
        )
    }
}
