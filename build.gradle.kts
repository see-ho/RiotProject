// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply  false
    //id("com.android.application") version "8.1.2" apply false
    alias(libs.plugins.kotlin.serialization) apply  false
    //id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    alias(libs.plugins.kotlin.jvm) apply false
    //id("org.jetbrains.kotlin.jvm") version "1.8.10" apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.org.jetbrains.kotlin.android) apply false
}