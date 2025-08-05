plugins {
    id("java")
}

group = "com.jason"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine") // 🔹 Added
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "com.jason.Main"
        )
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // 🔹 Added
    }
}

tasks.test {
    useJUnitPlatform()
}
