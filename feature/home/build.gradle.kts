plugins {
    alias(libs.plugins.riotproject.android.feature)
    alias(libs.plugins.riotproject.android.library.compose)
}

android {
    namespace = "com.seeho.home"

}

dependencies {
    implementation(libs.androidx.activity.compose)
}