plugins {
    `kotlin-multiplatform`
    publish
    com.android.library
}

group = "org.graphiks"

val kffiVersion = providers.gradleProperty("kffi.version")
    .orElse(providers.environmentVariable("KFFI_VERSION"))
    .orElse("1.0.0-SNAPSHOT")
    .map { it.trim().ifEmpty { "1.0.0-SNAPSHOT" } }

afterEvaluate {
    // F1: vanniktech freezes groupId/version at plugin-apply time; re-assert
    // them post-evaluation so the kffi version chain wins (mirror kffi/build.gradle.kts).
    (extensions.findByName("publishing") as? PublishingExtension)?.publications
        ?.withType<MavenPublication>()
        ?.all {
            groupId = "org.graphiks"
            version = kffiVersion.get()
        }
}
kotlin {
    jvm()
    androidTarget {
        android {
            namespace = "org.graphiks.kffi.benchmark"
            compileSdk = 36
        }
    }
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    macosX64()
    linuxX64()
    androidNativeArm64()
    androidNativeX64()

    sourceSets {
        commonMain.dependencies {
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
            implementation(libs.bundles.kotest)
        }

        jvmTest.dependencies {
            implementation(libs.kotest.runner.junit5)
        }
    }
}

tasks.withType<Test>().configureEach {
    if (name == "jvmTest") {
        useJUnitPlatform()
    }
}
