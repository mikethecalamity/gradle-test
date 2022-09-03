subprojects {
    apply(plugin = "java")
    group = "org.dummy.utils"
    version = "0.0.1-SNAPSHOT"
    extensions.configure(JavaPluginExtension::class) {
        sourceCompatibility = org.gradle.api.JavaVersion.VERSION_1_8
    }
    tasks.withType(Test::class){
        useJUnitPlatform()
    }
    repositories {
        mavenCentral()
    }
}
