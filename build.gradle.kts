buildscript {
  repositories {
    mavenLocal()
    maven {
      url = uri("https://plugins.gradle.org/m2/")
    }
  }
  dependencies {
    classpath("org.cyclonedx:cyclonedx-gradle-plugin:1.7.3")
  }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.cyclonedx.bom")
    group = "org.dummy.utils"
    version = "0.0.1-SNAPSHOT"
    extensions.configure(JavaPluginExtension::class) {
        sourceCompatibility = org.gradle.api.JavaVersion.VERSION_17
    }
    tasks.withType(Test::class){
        useJUnitPlatform()
    }
    repositories {
        mavenCentral()
    }
}
