import org.gradle.api.JavaVersion.VERSION_17

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
    alias(libs.plugins.google.firebase.crashlytics)

}

android {
    namespace = "aprendeprogramar2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.playconsole.aprendeprogramar2"
        minSdk = 21
        versionCode = 1
        versionName = "1.0"

        signingConfig = signingConfigs.getByName("debug")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = VERSION_17
        targetCompatibility = VERSION_17
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }
    buildToolsVersion = "34.0.0"
    ndkVersion = "28.0.12674087 rc2"
}

dependencies {

    implementation(libs.material)
    implementation(libs.firebase.crashlytics)
    implementation(libs.play.services.ads)
    implementation(libs.firebase.analytics)
    implementation(libs.junit)
    implementation(libs.androidx.espresso.core)
    implementation(libs.play.services.maps)
    implementation(libs.play.services.location)
}