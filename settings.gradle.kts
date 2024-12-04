rootProject.name = "CM-Example-Addon"

dependencyResolutionManagement {
    repositories {
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://oss.sonatype.org/content/groups/public/")
        maven("https://jitpack.io")
    }
    versionCatalogs {
        create("libs") {
            library("paper-api","io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
            library("cmenus","com.github.Lapzupi:ConfigurableMenus:0.4.1")
        }
    }
}