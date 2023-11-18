plugins {
    alias(libs.plugins.riotproject.android.library)
    alias(libs.plugins.riotproject.android.hilt)
    id("kotlinx-serialization")
}

android {
    namespace = "com.seeho.network"

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(":core:model")

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.svg)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
}