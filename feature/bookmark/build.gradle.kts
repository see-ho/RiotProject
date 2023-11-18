plugins {
    alias(libs.plugins.riotproject.android.feature)
    alias(libs.plugins.riotproject.android.library.compose)
}

android {
    namespace = "com.seeho.bookmark"
}

dependencies {
    implementation(libs.androidx.compose.material3.windowSizeClass)

}