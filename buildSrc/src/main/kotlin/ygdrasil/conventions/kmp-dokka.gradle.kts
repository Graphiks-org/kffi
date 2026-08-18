package ygdrasil.conventions

import java.net.URI

plugins {
    id("org.jetbrains.dokka")
}

dokka {
    moduleName.set("kffi")
    dokkaSourceSets.configureEach {
        sourceLink {
            localDirectory.set(project.file("src/commonMain/kotlin"))
            remoteUrl.set(URI("https://github.com/Graphiks-org/kffi/blob/master/kffi/src/commonMain/kotlin"))
            remoteLineSuffix.set("#L")
        }
    }
}
