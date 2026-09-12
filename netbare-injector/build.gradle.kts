plugins {
    id("com.android.library")
}

android {
    namespace = "com.github.megatronking.netbare"

    compileSdk {
        version = release(36)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    defaultConfig {
        minSdk = 24
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            // withJavadocJar()
        }
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.github.megatronking.netbare"
                artifactId = "netbare-injector"
                version = "0.1.0"
            }
        }
    }
}

dependencies {
    implementation (project(":netbare-core"))
    implementation ("com.android.support:appcompat-v7:28.0.0")
}