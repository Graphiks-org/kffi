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

// Integration proofs load the real PipeWire stack and need a running daemon
// for stream negotiation: Linux-only dedicated task, mirroring kffi-evdev's
// evdevIntegrationTest.
val onLinux = System.getProperty("os.name", "").contains("Linux", ignoreCase = true)
val pipewireIntegrationEnabled = providers.environmentVariable("KFFI_PIPEWIRE_INTEGRATION")
    .map { it == "1" }
    .orElse(false)
tasks.register<Test>("pipewireIntegrationTest") {
    group = "verification"
    description = "Runs the PipeWire integration proofs (Linux, real daemon)."
    enabled = onLinux
    testClassesDirs = tasks.named<Test>("jvmTest").get().testClassesDirs
    classpath = tasks.named<Test>("jvmTest").get().classpath
    useJUnitPlatform()
    systemProperty("kffi.pipewire.defaultArtifactDir", layout.buildDirectory.dir("pipewire-integration").get().asFile.absolutePath)
    onlyIf("KFFI_PIPEWIRE_INTEGRATION must equal 1") {
        pipewireIntegrationEnabled.get()
    }
}
