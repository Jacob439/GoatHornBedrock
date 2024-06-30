plugins {
    id("java")
}

group = "org.GoatHornBedrock"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://repo.opencollab.dev/main/")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.spigotmc:spigot-api:1.21-R0.1-SNAPSHOT")
    compileOnly("org.geysermc.geyser:api:2.4.0-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}