plugins {
    id("org.jetbrains.intellij.platform") version "2.3.0"
}

group = "io.github.natalie-o-perret"
version = "0.1.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.1")
        pluginVerifier()
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "231"
        }
    }
    publishing {
        token = providers.environmentVariable("JETBRAINS_TOKEN")
    }
}
