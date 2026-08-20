rootProject.name = "kffi-root"

pluginManagement {
	repositories {
		gradlePluginPortal()
		google()
		mavenCentral()
	}
	plugins {
		id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
	}
}

dependencyResolutionManagement {
	repositories {
		google()
		mavenCentral()
	}
}

include("docs")
include("kffi")
include("kff-posix")
include("kffi-wayland")
include("kffi-android-native")
include("kffi-benchmark-spi")
include("kffi-benchmark-jvm")
include("kffi-benchmark-native")
include("kffi-benchmark-android")
