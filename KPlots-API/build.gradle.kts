plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jetbrains.dokka") version "1.9.0"
}

group = "org.kplots"
version = "0.0.0"

repositories {
    mavenCentral()
}

dependencies {}

tasks {
    build {
        dependsOn("dokkaHtml")
    }
}
kotlin {
    jvmToolchain(17)
}