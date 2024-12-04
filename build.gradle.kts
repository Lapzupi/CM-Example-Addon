plugins {
    java
}

group = "com.lapzupi.dev.addon.example"
version = "1.0.0"
description = "Configurable Menus Example Addon"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    withSourcesJar()
}

dependencies {
    compileOnly(libs.paper.api)
    compileOnly(libs.cmenus)
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }
}
