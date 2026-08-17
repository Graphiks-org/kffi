allprojects {

	repositories {
		mavenLocal()
		google()
		mavenCentral()
	}

	group = "org.graphiks"
}

val releaseVersion = providers.gradleProperty("releaseVersion")
	.orElse("1.0.0-SNAPSHOT")
	.map { it.trim().ifEmpty { "1.0.0-SNAPSHOT" } }

subprojects {
	version = releaseVersion.get()
}
