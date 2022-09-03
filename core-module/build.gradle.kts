plugins {
    id ("java-library")
    id ("java-test-fixtures")
}
dependencies {
    // Main dependencies
    api("org.apache.commons:commons-lang3:3.9")
    api(project(":utils-module"))

    // Testfixture dependencies
    testFixturesApi("org.mockito:mockito-core:3.5.13")

    // Test dependencies
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}

java{

}

