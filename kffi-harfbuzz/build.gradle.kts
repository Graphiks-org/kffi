plugins {
    `kotlin-multiplatform`
    id("com.android.kotlin.multiplatform.library")
    id("ygdrasil.conventions.kmp-publish")
}

kotlin {
    jvmToolchain(25)
    explicitApi()

    // Both the JVM and Android actual classes are declared as expect/actual classes.
    compilerOptions {
        freeCompilerArgs.add("-Xexpect-actual-classes")
    }

    jvm {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_25)
        }
    }

    android {
        namespace = "org.graphiks.kffi.harfbuzz"
        compileSdk = 36
        minSdk = 28
        packaging {
            jniLibs {
                useLegacyPackaging = true
            }
        }
        compilerOptions {
            jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
        }
        withDeviceTest {
            instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
    }

    sourceSets {
        jvmMain.dependencies {
            implementation(project(":kffi"))
        }
        jvmTest.dependencies {
            implementation(kotlin("test"))
        }

        val androidMain by getting {
            dependencies {
                implementation(project(":kffi"))
                implementation(project(":kffi-harfbuzz-android-native"))
            }
        }

        val androidDeviceTest by getting {
            dependencies {
                implementation(libs.androidx.test.ext.junit)
                implementation(libs.androidx.test.runner)
                implementation(kotlin("test"))
            }
        }
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
    jvmArgs("--enable-native-access=ALL-UNNAMED")
    onlyIf("HarfBuzz supports Linux, macOS and Windows") {
        val os = System.getProperty("os.name")
        os.startsWith("Mac") || os.startsWith("Linux") || os.startsWith("Windows")
    }
}
