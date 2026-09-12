plugins {
    id ("com.android.library")
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
}

dependencies {
    implementation("androidx.annotation:annotation:1.9.1")
    implementation("androidx.core:core:1.13.1")

    implementation("org.bouncycastle:bcpkix-jdk15on:1.56")
    implementation("org.bouncycastle:bcprov-jdk15on:1.56")
    implementation("com.google.guava:guava:19.0")
}
