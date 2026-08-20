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
            api(project(":kffi-posix"))
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

tasks.withType<Test>().configureEach {
    if (name == "jvmTest") {
        useJUnitPlatform()
    }
    jvmArgs("--enable-native-access=ALL-UNNAMED")
}

val jvmTestTask = tasks.named<Test>("jvmTest")
val waylandIntegrationEnabled = providers.environmentVariable("KFF_WAYLAND_INTEGRATION")
    .map { it == "1" }
    .orElse(false)

tasks.register<Test>("waylandIntegrationTest") {
    group = "verification"
    description = "Runs the compositor-backed Wayland integration test."

    dependsOn(tasks.named("jvmTestClasses"))
    testClassesDirs = jvmTestTask.get().testClassesDirs
    classpath = jvmTestTask.get().classpath
    useJUnitPlatform()
    filter {
        includeTestsMatching("org.graphiks.kffi.wayland.WaylandIntegrationTest")
    }

    systemProperty(
        "kff.wayland.defaultArtifactDir",
        layout.buildDirectory.dir("wayland-integration").get().asFile.absolutePath,
    )
    onlyIf("KFF_WAYLAND_INTEGRATION must equal 1") {
        waylandIntegrationEnabled.get()
    }
}
