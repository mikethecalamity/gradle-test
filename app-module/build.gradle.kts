dependencies {
    implementation(project(":core-module"))

    testImplementation(testFixtures(project(":core-module")))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.3.1")

}
