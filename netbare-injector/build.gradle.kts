plugins {
    id("com.android.library")
}

android {
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
}

dependencies {
    implementation (project(":netbare-core"))
    implementation ("com.android.support:appcompat-v7:28.0.0")
}