# BaseCleanArchitectureMVVM

Android starter template for a Clean Architecture + MVVM project structure in Kotlin.

The goal of this repository is to show a small, layered Android foundation that separates presentation, domain, and data responsibilities. It is intended as architecture scaffolding rather than a finished product app.

## Architecture

- `app`: Android application shell and dependency entry point.
- `presentation`: UI layer, Activities, ViewModels, and Android-facing presentation code.
- `domain`: business contracts, models, repositories, and use cases.
- `data`: data sources and repository implementations.

## What This Demonstrates

- Multi-module Android project organization.
- Clean Architecture boundaries between UI, domain, and data.
- MVVM-oriented presentation layer.
- Dependency direction from outer layers toward the domain layer.
- A simple template that can be expanded into feature-based modules.

## Current Stack

- Kotlin
- Android Gradle Plugin 9.2
- Gradle 9.4.1
- AndroidX
- AppCompat
- ConstraintLayout

## Notes

This project was originally created as a base architecture template and has been updated so the main branch reflects the intended structure directly. It is a public architecture sample, not a representation of private client code.
