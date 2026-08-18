import com.android.build.api.variant.KotlinMultiplatformAndroidComponentsExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-multiplatform`
    id("com.android.kotlin.multiplatform.library")
    alias(libs.plugins.kotest)
    alias(libs.plugins.ksp)
}

// JUnit5/kotest jars ship duplicate META-INF LICENSE/README files; exclude them from merge.
// The fixture is test-only and is staged from the standalone native module into this APK.
abstract class StageKffiBenchFixture : DefaultTask() {
    @get:InputFiles
    abstract val fixtureSources: ConfigurableFileCollection

    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    @TaskAction
    fun stage() {
        val out = outputDir.get().asFile
        out.deleteRecursively()
        out.mkdirs()
        fixtureSources.files.forEach { src ->
            val abi = src.parentFile.name
            val dest = File(out, "$abi/${src.name}")
            dest.parentFile.mkdirs()
            src.copyTo(dest, overwrite = true)
        }
    }
}

val stageKffiBenchFixture = tasks.register<StageKffiBenchFixture>("stageKffiBenchFixture") {
    fixtureSources.from(
        fileTree(
            project(":kffi-android-native").layout.buildDirectory.dir("intermediates/cxx/RelWithDebInfo"),
        ) {
            include("**/obj/**/libkffi_bench_fixture.so")
        },
    )
    outputDir.set(layout.buildDirectory.dir("kffi-fixture-androidDeviceTest"))
    dependsOn(project(":kffi-android-native").tasks.named("assembleRelease"))
}

kotlin {
    android {
        namespace = "org.graphiks.kffi.benchmark"
        compileSdk = 36
        minSdk = 28

        compilerOptions {
            jvmTarget = JvmTarget.JVM_17
        }

        withDeviceTest {
            instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        packaging {
            resources {
                excludes += "/META-INF/{AL2.0,LGPL2.1}"
                excludes += "/META-INF/LICENSE.md"
                excludes += "/META-INF/LICENSE-notice.md"
                excludes += "/META-INF/versions/9/previous-compilation-data.bin"
            }
            jniLibs {
                // Extract .so to nativeLibraryDir so the test can dlopen the fixture by path.
                useLegacyPackaging = true
            }
        }
    }

    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":kffi"))
                implementation(project(":kffi-benchmark-spi"))
            }
        }
        val androidDeviceTest by getting {
            dependencies {
                implementation("io.kotest:kotest-runner-junit5:${libs.versions.kotest.get()}")
                implementation(libs.androidx.test.ext.junit)
                implementation(libs.androidx.test.runner)
            }
        }
    }
}

extensions.configure<KotlinMultiplatformAndroidComponentsExtension> {
    onVariants { variant ->
        variant.nestedComponents
            .filter { it.name == "androidDeviceTest" }
            .forEach { component ->
                component.sources.jniLibs?.addGeneratedSourceDirectory(stageKffiBenchFixture) {
                    it.outputDir
                }
        }
    }
}
