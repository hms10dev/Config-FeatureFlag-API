# Config & Feature Flag Service

A lightweight Spring Boot service for managing configuration values and feature flags.

This service provides a simple foundation for defining feature flags and associating rules with them, with the goal of enabling controlled rollouts and environment-agnostic configuration.

> **Status:** Early development (Day 1 scaffold)

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker & Docker Compose
- Gradle

---

## Current Capabilities

- Application boots successfully
- PostgreSQL runs via Docker Compose
- JPA entities for feature flags and rules
- Basic REST endpoints for creating and listing flags

---

## Local Development

### Prerequisites
- Java 17
- Docker + Docker Compose
- Gradle (or use the wrapper)

### Start Postgres
```bash
docker compose up -d
```
### Run the application
```bash
./gradlew bootRun
```
### The service will start on:

```bash
http://localhost:8080
```

### Next Steps
- Rule evaluation semantics 
- Flag resolution API 
- Environment / user targeting 
- Migrations (Flyway)