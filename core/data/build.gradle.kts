plugins {
    alias(libs.plugins.riotproject.android.library)
    alias(libs.plugins.riotproject.android.hilt)
    id("kotlinx-serialization")
}

android {
    namespace = "com.seeho.data"

}

dependencies {
    implementation(":core:datastore")
    implementation(":core:model")
    implementation(":core:network")

    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)


    implementation(libs.androidx.core.ktx)
}