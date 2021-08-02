pluginManagement {
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
  }

  includeBuild("build-logic")
}

plugins {
  id("plugin-repositories")
}

include(
  ":app",
  ":library",
)
