# pleasee do use intelliJ for this one

## Make project, Gradle as Build System

### temurin-24

## add this to the dependencies block on your build.gradle.kts
```
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
```

## add this to the kotlin block on your build.gradle.kts
```
compilerOptions {
    languageVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_9)
}
```

## Traverse folder path
### org.example.CSIT_284_PBD3.Kotlin_Syntax
