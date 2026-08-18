plugins {
    com.android.library
    id("ygdrasil.conventions.kmp-publish")
}

android {
    namespace = "org.graphiks.kffi.androidnative"
    compileSdk = 36
    ndkVersion = "30.0.15729638"

    defaultConfig {
        minSdk = 28

        externalNativeBuild {
            cmake {
                cFlags += listOf("-std=c11")
            }
        }

        ndk {
            abiFilters += setOf("arm64-v8a", "x86_64", "armeabi-v7a")
        }
    }

    externalNativeBuild {
        cmake {
            path = file("src/main/cpp/CMakeLists.txt")
        }
    }

    packaging {
        jniLibs {
            testOnly += setOf("libkffi_bench_fixture.so", "**/libkffi_bench_fixture.so")
            useLegacyPackaging = true
        }
    }
}
