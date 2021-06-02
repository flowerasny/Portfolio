plugins {
    id("com.android.application")
    id("kotlin-android-extensions")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    implementation("org.koin:koin-android:2.2.2")
    implementation("org.koin:koin-core:2.2.2")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.jakub.kwiatek.multipl.android"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}