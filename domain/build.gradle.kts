plugins {
    id(Dependencies.Jvm.JavaLibrary)
    id(Dependencies.Jvm.Jvm)
}

dependencies {
    implementation(Dependencies.Koin.KoinCore)
}

java {
    sourceCompatibility = Dependencies.Jvm.CompileJavaVersion
    targetCompatibility = Dependencies.Jvm.CompileJavaVersion
}
