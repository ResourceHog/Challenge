buildscript {
    ext.kotlin_version = '1.3.41' // Required for Kotlin integration
    ext.spring_boot_version = '2.1.0.RELEASE'
    repositories {
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin") version kotlin_version // Required for Kotlin integration
        classpath("org.jetbrains.kotlin:kotlin-allopen") version kotlin_version // See https://kotlinlang.org/docs/reference/compiler-plugins.html#spring-support
        classpath("org.springframework.boot:spring-boot-gradle-plugin") version spring_boot_version
    }
}

plugins {
    kotlin
    kotlin-spring
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

tasks.jar {
    baseName = 'gs-rest-service'
    version = '0.1.0'
}

repositories {
    jcenter()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib") version kotlin_version // Required for Kotlin integration
    compile("org.springframework.boot:spring-boot-starter-web")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}

