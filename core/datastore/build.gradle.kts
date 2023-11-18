plugins {
    alias(libs.plugins.riotproject.android.library)
    alias(libs.plugins.riotproject.android.hilt)
}

android {
    namespace = "com.seeho.datastore"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }
}

dependencies {
    implementation(":core:model")
    implementation(libs.androidx.dataStore.core)
    implementation(libs.kotlinx.coroutines.android)
}