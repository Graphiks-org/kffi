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
val win32IntegrationEnabled = providers.environmentVariable("KFFI_WIN32_INTEGRATION")
    .map { it == "1" }
    .orElse(false)

tasks.register<Test>("win32IntegrationTest") {
    group = "verification"
    description = "Creates a Win32 window, captures it, and verifies the screenshot."

    dependsOn(tasks.named("jvmTestClasses"))
    testClassesDirs = jvmTestTask.get().testClassesDirs
    classpath = jvmTestTask.get().classpath
    useJUnitPlatform()
    filter {
        includeTestsMatching("org.graphiks.kffi.win32.Win32WindowIntegrationTest")
    }

    systemProperty(
        "kffi.win32.defaultArtifactDir",
        layout.buildDirectory.dir("win32-integration").get().asFile.absolutePath,
    )
    onlyIf("KFFI_WIN32_INTEGRATION must equal 1") {
        win32IntegrationEnabled.get()
    }
}
