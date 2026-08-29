import org.jetbrains.kotlin.gradle.dsl.JvmTarget

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
        jvmTest.languageSettings {
            optIn("org.graphiks.kffi.objc.PlatformAvailability")
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

tasks.withType<Test>().configureEach {
    if (name == "jvmTest") {
        useJUnitPlatform()
    }
    jvmArgs("--enable-native-access=ALL-UNNAMED")
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
