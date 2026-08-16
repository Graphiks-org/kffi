import com.google.gson.JsonParser

allprojects {

	repositories {
		mavenLocal()
		google()
		mavenCentral()
	}

	group = "org.graphiks"
}

val kffiVersion = providers.gradleProperty("kffi.version")
	.orElse(providers.environmentVariable("KFFI_VERSION"))
	.orElse("1.0.0-SNAPSHOT")
	.map { it.trim().ifEmpty { "1.0.0-SNAPSHOT" } }

subprojects {
	version = kffiVersion.get()
}

val publicationVerificationRepository = layout.buildDirectory
	.dir("publication-verification/repository")

val cleanPublicationVerificationRepository by tasks.registering(Delete::class) {
	delete(publicationVerificationRepository)
}

val verifyPublicationMetadata by tasks.registering {
	group = "verification"
	description = "Publishes the kffi publications to a local repository and verifies their metadata."
	dependsOn(
		":kffi:publishAllPublicationsToPublicationVerificationRepository",
		":kffi-benchmark-spi:publishAllPublicationsToPublicationVerificationRepository",
	)
	doLast {
		val repository = publicationVerificationRepository.get().asFile
		val kffiGroup = "org.graphiks"
		val coordinatePath = kffiGroup.replace('.', '/')
		val publishedVersion = kffiVersion.get()
		fun uniqueModuleFile(artifact: String): File {
			val versionDirectory = repository.resolve("$coordinatePath/$artifact/$publishedVersion")
			val candidates = versionDirectory.listFiles { file ->
				file.isFile && file.name.startsWith("$artifact-") && file.name.endsWith(".module")
			}?.toList().orEmpty()
			require(candidates.size == 1) {
				"Expected exactly one $artifact .module file in $versionDirectory, " +
					"but found ${candidates.map { it.name }.sorted()}"
			}
			return candidates.single()
		}
		fun verifyCoordinates(artifact: String) {
			val metadataFile = uniqueModuleFile(artifact)
			val root = JsonParser.parseString(metadataFile.readText()).asJsonObject
			val group = root.get("group").asString
			val version = root.get("version").asString
			require(group == kffiGroup) {
				"Expected $artifact metadata group $kffiGroup, but found $group"
			}
			require(version == publishedVersion) {
				"Expected $artifact metadata version $publishedVersion, but found $version"
			}
		}
		verifyCoordinates("kffi-jvm")
		verifyCoordinates("kffi-benchmark-spi-jvm")
	}
}
