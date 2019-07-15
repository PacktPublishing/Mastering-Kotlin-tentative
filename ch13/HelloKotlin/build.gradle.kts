// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    extensions.add("kotlin_version", "1.3.31")
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0-beta04")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:${extensions.get("kotlin_version")}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

task(name = "clean", type = Delete::class) {
    delete(rootProject.buildDir)
}