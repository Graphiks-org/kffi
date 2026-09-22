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

    val iosArm64Target = iosArm64()
    val iosSimulatorArm64Target = iosSimulatorArm64()

    // -----------------------------------------------------------------------
    // Static HarfBuzz cinterop for iOS.
    //
    // The archive (libharfbuzz.a) and public headers are produced by the sibling
    // :kffi-harfbuzz-ios-native module. That module is included *after*
    // :kffi-harfbuzz in settings.gradle.kts, so it is not guaranteed to be
    // evaluated when this script is configured: reading its `extra[...]`
    // properties here would resolve to null. Instead we derive the well-known
    // paths from its build directory (available pre-evaluation) and depend on
    // the producing aggregate task by task path (also evaluation-order safe).
    //
    // The cinterop static-library search path is passed via `-libraryPath`;
    // the archive name itself is declared in the .def as `staticLibraries`.
    // -----------------------------------------------------------------------
    val iosNativeBuildDirectory = project(":kffi-harfbuzz-ios-native").layout.buildDirectory
    listOf(
        iosArm64Target to "iphoneos",
        iosSimulatorArm64Target to "iphonesimulator",
    ).forEach { (target, sdk) ->
        val includeDirectory = iosNativeBuildDirectory.dir("harfbuzz/$sdk/include/harfbuzz").get().asFile
        val libraryDirectory = iosNativeBuildDirectory.dir("harfbuzz/$sdk/lib").get().asFile
        val interop = target.compilations.getByName("main").cinterops.create("harfbuzz") {
            defFile(project.file("src/nativeInterop/cinterop/harfbuzz.def"))
            // The umbrella header lives beside the .def; the pinned HarfBuzz
            // headers (hb.h, hb-ot.h) live in the staged include directory.
            includeDirs(project.file("src/nativeInterop/cinterop"), includeDirectory)
            extraOpts("-libraryPath", libraryDirectory.absolutePath)
        }
        tasks.named(interop.interopProcessingTaskName) {
            // String task path: no cross-project project()/tasks.named() at
            // configuration time, so this cannot race module evaluation.
            dependsOn(":kffi-harfbuzz-ios-native:buildHarfBuzzIos")
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

        iosMain.dependencies {
            implementation(project(":kffi"))
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
