@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.riotproject.android.library)
    kotlin("kapt")
}

android {
    namespace = "com.seeho.domain"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:model"))


    implementation(libs.hilt.android)
    implementation(libs.kotlinx.coroutines.android)

    kapt(libs.hilt.compiler)

}