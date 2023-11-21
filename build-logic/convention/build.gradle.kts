import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    //id("java-library")
    `kotlin-dsl`
}

java {
    //17로 해야됨...!!
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {

    implementation("com.android.tools.build:gradle:8.1.2")
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.firebase.crashlytics.gradlePlugin)
    compileOnly(libs.firebase.performance.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)

    //implementation(gradleApi())

}

gradlePlugin {
    plugins {
        register("androidApplicationCompose") {
            id = "riotproject.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidApplication") {
            id = "riotproject.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
//        register("androidApplicationJacoco") {
//            id = "riotproject.android.application.jacoco"
//            implementationClass = "AndroidApplicationJacocoConventionPlugin"
//        }
        register("androidLibraryCompose") {
            id = "riotproject.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "riotproject.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidFeature") {
            id = "riotproject.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
//        register("androidLibraryJacoco") {
//            id = "riotproject.android.library.jacoco"
//            implementationClass = "AndroidLibraryJacocoConventionPlugin"
//        }
//        register("androidTest") {
//            id = "riotproject.android.test"
//            implementationClass = "AndroidTestConventionPlugin"
//        }
        register("androidHilt") {
            id = "riotproject.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
//        register("androidRoom") {
//            id = "riotproject.android.room"
//            implementationClass = "AndroidRoomConventionPlugin"
//        }
//        register("androidFirebase") {
//            id = "riotproject.android.application.firebase"
//            implementationClass = "AndroidApplicationFirebaseConventionPlugin"
//        }
//        register("androidFlavors") {
//            id = "riotproject.android.application.flavors"
//            implementationClass = "AndroidApplicationFlavorsConventionPlugin"
//        }
//        register("androidLint") {
//            id = "riotproject.android.lint"
//            implementationClass = "AndroidLintConventionPlugin"
//        }
//        register("jvmLibrary") {
//            id = "riotproject.jvm.library"
//            implementationClass = "JvmLibraryConventionPlugin"
//        }
    }
}

