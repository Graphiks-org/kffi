import org.gradle.api.attributes.Category
import org.gradle.api.attributes.LibraryElements
import org.gradle.api.attributes.Usage
import org.gradle.api.attributes.java.TargetJvmVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType

plugins {
    `kotlin-multiplatform`
    id("ygdrasil.conventions.kmp-publish")
}

kotlin {
    jvmToolchain(25)

    jvm {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_25)
        }
    }

    sourceSets {
        jvmMain.dependencies {
            api(project(":kffi"))
        }
        jvmTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

val managedRuntimeConsumerDependencies = configurations.create(
    "managedRuntimeConsumerDependencies",
) {
    isCanBeConsumed = false
    isCanBeResolved = true
    attributes {
        attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.LIBRARY))
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_API))
        attribute(LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE, objects.named(LibraryElements.JAR))
        attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 25)
        attribute(KotlinPlatformType.attribute, KotlinPlatformType.jvm)
    }
}
val managedRuntimeConsumerCompiler = configurations.create("managedRuntimeConsumerCompiler") {
    isCanBeConsumed = false
    isCanBeResolved = true
}

dependencies {
    managedRuntimeConsumerDependencies(project(":kffi-objc"))
    managedRuntimeConsumerCompiler(
        "org.jetbrains.kotlin:kotlin-compiler-embeddable:${libs.versions.kotlin.get()}",
    )
}

val managedRuntimeConsumerSource = layout.buildDirectory.file(
    "generated/managed-runtime-consumer/src/ManagedRuntimeConsumer.kt",
)
val generateManagedRuntimeConsumerSource = tasks.register("generateManagedRuntimeConsumerSource") {
    outputs.file(managedRuntimeConsumerSource)
    doLast {
        managedRuntimeConsumerSource.get().asFile.apply {
            parentFile.mkdirs()
            writeText(
                """
                package consumer

                import org.graphiks.kffi.objc.managed.ObjCManagedClass
                import org.graphiks.kffi.objc.managed.ObjCMethodSignatures

                object ManagedRuntimeConsumer {
                    fun createAndClose() {
                        ObjCManagedClass.registerOnce(
                            methods = mapOf(
                                "managedRuntimeConsumer:" to ObjCMethodSignatures.VoidObject,
                            ),
                        ).createInstance(
                            onError = { error -> requireNotNull(error.message) },
                        ) {
                            onVoidObject("managedRuntimeConsumer:") {}
                        }.close()
                    }
                }
                """.trimIndent(),
            )
        }
    }
}
val managedRuntimeConsumerClasses = layout.buildDirectory.dir(
    "classes/kotlin/managedRuntimeConsumer",
)
val compileManagedRuntimeConsumer = tasks.register<JavaExec>("compileManagedRuntimeConsumer") {
    dependsOn(generateManagedRuntimeConsumerSource, tasks.named("jvmJar"))
    classpath = managedRuntimeConsumerCompiler
    mainClass.set("org.jetbrains.kotlin.cli.jvm.K2JVMCompiler")
    jvmArgs("--enable-native-access=ALL-UNNAMED")
    inputs.file(managedRuntimeConsumerSource)
    inputs.files(managedRuntimeConsumerDependencies)
    outputs.dir(managedRuntimeConsumerClasses)
    doFirst {
        val declaredDependencies = managedRuntimeConsumerDependencies.dependencies.toList()
        val declaredProject = declaredDependencies.singleOrNull() as? ProjectDependency
        check(declaredProject?.path == ":kffi-objc") {
            "Managed runtime consumer must declare only :kffi-objc, got $declaredDependencies"
        }
        managedRuntimeConsumerClasses.get().asFile.mkdirs()
        setArgs(
            listOf(
                managedRuntimeConsumerSource.get().asFile.absolutePath,
                "-classpath",
                managedRuntimeConsumerDependencies.asPath,
                "-d",
                managedRuntimeConsumerClasses.get().asFile.absolutePath,
                "-jvm-target",
                "25",
                "-no-stdlib",
                "-no-reflect",
            ),
        )
    }
}

tasks.withType<Test>().configureEach {
    if (name == "jvmTest") {
        useJUnitPlatform()
    }
    jvmArgs("--enable-native-access=ALL-UNNAMED")
}

tasks.named<Test>("jvmTest") {
    dependsOn(compileManagedRuntimeConsumer)
    systemProperty(
        "kffi.objc.managed.consumer.classFile",
        managedRuntimeConsumerClasses.map {
            it.file("consumer/ManagedRuntimeConsumer.class").asFile.absolutePath
        }.get(),
    )
}

val jvmTestTask = tasks.named<Test>("jvmTest")
val objcIntegrationEnabled = providers.environmentVariable("KFFI_OBJC_INTEGRATION")
    .map { it == "1" }
    .orElse(false)
val objcIntegrationArtifactDirectory = providers.environmentVariable("KFFI_OBJC_INTEGRATION_ARTIFACT_DIR")
    .orElse(providers.environmentVariable("KFFI_OBJC_ARTIFACT_DIR"))
    .orElse(layout.buildDirectory.dir("objc-integration").map { it.asFile.absolutePath })

tasks.register<Test>("objcIntegrationTest") {
    group = "verification"
    description = "Runs the AppKit screenshot integration test."

    dependsOn(tasks.named("jvmTestClasses"))
    testClassesDirs = jvmTestTask.get().testClassesDirs
    classpath = jvmTestTask.get().classpath
    useJUnitPlatform()
    filter {
        includeTestsMatching("org.graphiks.kffi.objc.ObjCIntegrationTest")
    }

    systemProperty("kffi.objc.defaultArtifactDir", objcIntegrationArtifactDirectory.get())
    // The test writes a screenshot and diagnostics outside Gradle's test outputs.
    // Always execute it so a missing or stale artifact cannot produce a false green run.
    outputs.upToDateWhen { false }
    onlyIf("KFFI_OBJC_INTEGRATION must equal 1") {
        objcIntegrationEnabled.get()
    }
}
