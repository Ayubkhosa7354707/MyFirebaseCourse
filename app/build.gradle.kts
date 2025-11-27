plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.gms.google-services") version "4.4.4" apply false
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android") version "2.51.1" apply true

}
android {
    namespace = "com.ayub.khosa.firebasecourse"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.ayub.khosa.firebasecourse"
        minSdk = 31
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    // dagger hilt
    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("androidx.room:room-compiler:2.6.1")
    kapt("com.google.dagger:hilt-android-compiler:2.51.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")


    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.10.0")
// LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.10.0")

// Firebase auth
    implementation("com.google.firebase:firebase-auth:22.3.0")
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}