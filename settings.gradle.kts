pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

//TODO CHANGE NAME
rootProject.name = "Template"
include(":app")
include(":data")
include(":entryPoint")
include(":presentation")
include(":domain")
include(":appDestinations")
