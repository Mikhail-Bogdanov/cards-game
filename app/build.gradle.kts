plugins {
    id(Dependencies.Android.Application)
    id(Dependencies.Kotlin.Kotlin)
    id(Dependencies.Ksp.Ksp)
}

android {
    namespace = "${Settings.PackageName}.template"
    compileSdk = Settings.CompileSDK

    defaultConfig {
        applicationId = "${Settings.PackageName}.template"
        minSdk = Settings.MinSDK
        targetSdk = Settings.TargetSDK
        versionCode = Settings.VersionCode
        versionName = Settings.VersionName

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = Dependencies.Jvm.CompileJavaVersion
        targetCompatibility = Dependencies.Jvm.CompileJavaVersion
    }
    kotlinOptions {
        jvmTarget = Dependencies.Jvm.JvmTarget
    }
    bundle {
        storeArchive {
            enable = false
        }
    }
}

dependencies {
    implementation(project(Dependencies.Modules.EntryPoint))
    implementation(project(Dependencies.Modules.Data))
    implementation(project(Dependencies.Modules.Domain))
    implementation(project(Dependencies.Modules.Presentation))

    implementation(Dependencies.Koin.KoinAndroid)
    implementation(Dependencies.Koin.KoinWorkManager)
}