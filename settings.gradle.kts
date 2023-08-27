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
            //aliasはわかりやすく言うと、ニックネームみたいなもの。なので自由に変えることができる。
            version("media3", "1.0.0-beta03")
            //同じgroupであればbundleを使ってまとめて記述できる
            library("androidx-media3-exoplayer", "androidx.media3", "media3-exoplayer").versionRef("media3")
            library("androidx-media3-ui", "androidx.media3", "media3-ui").versionRef("media3")
            library("androidx-media3-exoplayer-rtsp", "androidx.media3", "media3-exoplayer-rtsp").versionRef("media3")
            bundle("androidx.media3", listOf(
                "androidx-media3-exoplayer",//libraryで定義したaliasをここに載せる
                "androidx-media3-ui",
                "androidx-media3-exoplayer-rtsp",
                ))
        }
    }
}

rootProject.name = "VersionControlPractice"
include(":app")
include(":app_core")
