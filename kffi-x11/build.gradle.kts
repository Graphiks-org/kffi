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
val x11IntegrationEnabled = providers.environmentVariable("KFFI_X11_INTEGRATION")
    .map { it == "1" }
    .orElse(false)

tasks.register<Test>("x11IntegrationTest") {
    group = "verification"
    description = "Runs the X11 screenshot integration test."

    dependsOn(tasks.named("jvmTestClasses"))
    testClassesDirs = jvmTestTask.get().testClassesDirs
    classpath = jvmTestTask.get().classpath
    useJUnitPlatform()
    filter {
        includeTestsMatching("org.graphiks.kffi.x11.X11IntegrationTest")
    }

    systemProperty(
        "kffi.x11.defaultArtifactDir",
        layout.buildDirectory.dir("x11-integration").get().asFile.absolutePath,
    )
    onlyIf("KFFI_X11_INTEGRATION must equal 1") {
        x11IntegrationEnabled.get()
    }
}
