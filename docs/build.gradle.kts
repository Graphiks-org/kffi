import org.gradle.api.tasks.Sync

plugins {
    id("dev.opensavvy.dokka-mkdocs") version "0.6.3"
}

val copySharedDokkaIntoMkDocs by tasks.registering(Sync::class) {
    dependsOn(project(":kffi").tasks.named("dokkaGenerateModuleMkdocs"))
    dependsOn(tasks.named("dokkaCopyIntoMkDocs"))

    from(project(":kffi").layout.buildDirectory.dir("dokka-module/mkdocs/module"))
    into(layout.projectDirectory.dir("docs/api/kffi"))
}

tasks.named("generateMkDocsNavigation") {
    dependsOn(copySharedDokkaIntoMkDocs)
}
