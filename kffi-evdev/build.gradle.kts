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
        jvmTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

tasks.withType<Test>().configureEach {
    if (name == "jvmTest") {
        useJUnitPlatform()
    }
    jvmArgs("--enable-native-access=ALL-UNNAMED")
}

// Integration proofs load the real evdev/udev stack and need /dev/input:
// Linux-only dedicated task, mirroring kffi-wayland's waylandIntegrationTest.
val onLinux = System.getProperty("os.name", "").contains("Linux", ignoreCase = true)
val evdevIntegrationEnabled = providers.environmentVariable("KFFI_EVDEV_INTEGRATION")
    .map { it == "1" }
    .orElse(false)
tasks.register<Test>("evdevIntegrationTest") {
    group = "verification"
    description = "Runs the evdev/udev integration proofs (Linux, real nodes or uinput)."
    enabled = onLinux
    testClassesDirs = tasks.named<Test>("jvmTest").get().testClassesDirs
    classpath = tasks.named<Test>("jvmTest").get().classpath
    useJUnitPlatform()
    systemProperty("kffi.evdev.defaultArtifactDir", layout.buildDirectory.dir("evdev-integration").get().asFile.absolutePath)
    onlyIf("KFFI_EVDEV_INTEGRATION must equal 1") {
        evdevIntegrationEnabled.get()
    }
}
