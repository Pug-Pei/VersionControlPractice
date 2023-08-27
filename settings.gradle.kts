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

    versionCatalogs {
        create("libs") {
            library(
                "androidx-media3-exoplayer",
                "androidx.media3",
                "media3-exoplayer"
            ).versionRef("media3")
            version("media3", "1.0.0-beta03")
        }
    }
}

rootProject.name = "VersionControlPractice"
include(":app")
include(":app_core")
