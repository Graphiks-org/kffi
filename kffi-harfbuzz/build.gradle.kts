plugins {
    `kotlin-multiplatform`
    id("ygdrasil.conventions.kmp-publish")
}

kotlin {
    jvmToolchain(25)
    explicitApi()
    jvm {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_25)
            freeCompilerArgs.add("-Xexpect-actual-classes")
        }
    }
    sourceSets {
        jvmMain.dependencies {
            implementation(project(":kffi"))
        }
        jvmTest.dependencies {
            implementation(kotlin("test"))
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
