plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.0.13"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:30.1.1-jre")

    val jme = "3.5.2-stable"
    implementation("org.jmonkeyengine:jme3-core:$jme")
    implementation("org.jmonkeyengine:jme3-desktop:$jme")
    implementation("org.jmonkeyengine:jme3-lwjgl:$jme")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

javafx {
    version = "18.0.1"
    modules("javafx.controls", "javafx.fxml")
}

application {
    //mainClass.set("jme48.App")
    mainClass.set("jme48.Appfx")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
