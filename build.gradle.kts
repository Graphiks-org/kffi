allprojects {

	repositories {
		mavenLocal()
		google()
		mavenCentral()
	}

	group = "org.graphiks.kffi"
}

val releaseVersion = providers.gradleProperty("releaseVersion")
	.orElse("0.1.0-SNAPSHOT")
	.map { it.trim().ifEmpty { "0.1.0-SNAPSHOT" } }

subprojects {
	version = releaseVersion.get()
}
