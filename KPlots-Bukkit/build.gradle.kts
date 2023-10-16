plugins {
    kotlin("jvm") version "1.9.10"
    id("xyz.jpenilla.run-paper") version "2.2.0"
}

group = "org.kplots"
version = "0.0.0"

repositories {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    mavenCentral()
}

dependencies {
    implementation(project(":KPlots-API"))
    testImplementation(kotlin("test"))

    compileOnly("org.spigotmc:spigot-api:1.20.2-R0.1-SNAPSHOT")
}

tasks {
    runServer {
        minecraftVersion("1.20.2")
        dependsOn("build")
    }
    test {
        useJUnitPlatform()
    }
}

kotlin {
    jvmToolchain(17)
}