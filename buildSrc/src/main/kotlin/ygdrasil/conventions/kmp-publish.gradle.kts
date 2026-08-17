package ygdrasil.conventions

plugins {
    id("com.vanniktech.maven.publish")
}

group = "org.graphiks"
version = (project.findProperty("releaseVersion") as? String)
    ?.trim()
    ?.takeIf { it.isNotBlank() }
    ?: "1.0.0-SNAPSHOT"

val isPublishing = project.findProperty("signingInMemoryKey")?.toString()?.trim()?.isNotBlank() == true
    || project.findProperty("signing.keyId")?.toString()?.trim()?.isNotBlank() == true

mavenPublishing {
    if (isPublishing) {
        publishToMavenCentral()
        signAllPublications()
    }
    coordinates(group.toString(), project.name, version.toString())

    pom {
        name.set(project.name)
        description.set("${project.name}: multiplatform FFI support for Kotlin")
        url.set("https://github.com/Graphiks-org/kffi")
        inceptionYear.set("2024")

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/license/MIT")
            }
        }

        developers {
            developer {
                id.set("amommers")
                name.set("Alexandre Mommers")
            }
        }

        scm {
            connection.set("scm:git:https://github.com/Graphiks-org/kffi.git")
            developerConnection.set("scm:git:ssh://git@github.com/Graphiks-org/kffi.git")
            url.set("https://github.com/Graphiks-org/kffi")
        }
    }
}
