pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    includeBuild("build-logic")
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RiotProject"
include(":app")

include(":feature:home")
include(":feature:bookmark")

include(":core:navigation")
include(":core:ui")
include(":core:domain")
include(":core:datastore")
include(":core:model")
include(":core:designsystem")
include(":core:data")
include(":core:network")
