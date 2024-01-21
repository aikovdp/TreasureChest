plugins {
    `java-library`
}

group = "com.mtihc.minecraft.treasurechest.v8.plugin"
version = "8.4.6"

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
    maven {
        url = uri("https://maven.enginehub.org/repo/")
    }
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.13-R0.1-SNAPSHOT")
    compileOnly("com.github.MilkBowl:VaultAPI:1.7")
    compileOnly("com.sk89q:worldedit:6.0.0-SNAPSHOT")
}
