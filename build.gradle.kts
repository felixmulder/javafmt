plugins {
    `java-library`

    // Plugin to clear the screen:
    id("de.dplatz.clear") version "0.3"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")

    implementation("com.github.javaparser:javaparser-core:3.23.0")
}
