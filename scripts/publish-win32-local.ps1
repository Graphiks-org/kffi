param(
    [string]$Version = '1.0.0-win32-phase4-local-SNAPSHOT',
    [string]$BuildVersion = '1.0.0-SNAPSHOT'
)
$ErrorActionPreference = 'Stop'
if ($Version -notmatch '^[A-Za-z0-9.-]+-local-SNAPSHOT$') {
    throw 'Use a distinct -local-SNAPSHOT version for JVM-only local artifacts.'
}
$repo = Split-Path $PSScriptRoot -Parent
$wrapper = Join-Path $repo 'gradlew.bat'
Push-Location $repo
try {
    # The local coordinate is a test alias. Keep the runtime VERSION contract
    # on the normal build version and publish exactly the jars tested below.
    & $wrapper :kffi:jvmTest :kffi-win32:jvmTest :kffi:jvmJar :kffi-win32:jvmJar :kffi-win32:nativeTestSupportJar "-PreleaseVersion=$BuildVersion" --configure-on-demand --console=plain
    if ($LASTEXITCODE -ne 0) { throw 'JVM build failed' }
    # Full KMP publication resolves Android/NDK and Dokka. This isolated Maven build
    # publishes the tested JVM jars and POM aliases only; it is not a release gate.
    $staging = Join-Path $repo 'build/win32-local-publication'
    New-Item -ItemType Directory -Force $staging | Out-Null
    Set-Content (Join-Path $staging 'settings.gradle') "rootProject.name = 'win32-local-publication'"
    $publishBuild = @'
plugins { id 'maven-publish' }
def localVersion = providers.gradleProperty('localVersion').get()
def buildVersion = providers.gradleProperty('buildVersion').get()
def sourceRepo = file(providers.gradleProperty('sourceRepo').get())
publishing {
    publications {
        ['kffi', 'kffi-win32'].each { module ->
            create(module.replace('-', '') + 'Jvm', MavenPublication) {
                groupId = 'org.graphiks'
                artifactId = module + '-jvm'
                version = localVersion
                artifact(new File(sourceRepo, "${module}/build/libs/${module}-jvm-${buildVersion}.jar"))
                if (module == 'kffi-win32') {
                    artifact(new File(sourceRepo, "${module}/build/libs/${module}-${buildVersion}-native-test-support.jar")) {
                        classifier = 'native-test-support'
                    }
                    pom.withXml {
                        def dependency = asNode().appendNode('dependencies').appendNode('dependency')
                        dependency.appendNode('groupId', 'org.graphiks')
                        dependency.appendNode('artifactId', 'kffi-jvm')
                        dependency.appendNode('version', localVersion)
                        dependency.appendNode('scope', 'compile')
                    }
                }
            }
            create(module.replace('-', '') + 'Alias', MavenPublication) {
                groupId = 'org.graphiks'
                artifactId = module
                version = localVersion
                pom.packaging = 'pom'
                pom.withXml {
                    def dependency = asNode().appendNode('dependencies').appendNode('dependency')
                    dependency.appendNode('groupId', 'org.graphiks')
                    dependency.appendNode('artifactId', module + '-jvm')
                    dependency.appendNode('version', localVersion)
                    dependency.appendNode('scope', 'compile')
                }
            }
        }
    }
}
'@
    Set-Content (Join-Path $staging 'build.gradle') $publishBuild
    & $wrapper -p $staging publishToMavenLocal "-PlocalVersion=$Version" "-PbuildVersion=$BuildVersion" "-PsourceRepo=$repo" --console=plain
    if ($LASTEXITCODE -ne 0) { throw 'Maven local publication failed' }
} finally { Pop-Location }
