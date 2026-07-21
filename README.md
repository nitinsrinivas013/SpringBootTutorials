# Spring Boot Learning Repository

This repository contains all the Spring Boot projects I built while learning Spring Boot from the ground up. The projects are organized by topic and are intended to be studied in the order shown below.

---

# 📚 Learning Roadmap

## 1. Basics

Start here to understand the fundamentals of Spring Boot.

| Project | Topics Covered |
|---------|----------------|
| `MyFirstApp` | Creating your first Spring Boot application, project structure, running the application |
| `Actuator` | Spring Boot Actuator, monitoring application health and metrics |

---

## 2. Spring Core

Learn the core concepts of the Spring Framework, especially Dependency Injection and the IoC Container.

| Project | Topics Covered |
|---------|----------------|
| `ComponentScanning` | Component scanning and automatic bean detection |
| `ConstructorInjection` | Constructor-based dependency injection (recommended approach) |
| `SetterInjection` | Setter-based dependency injection |
| `Qualifier` | Resolving ambiguity when multiple beans of the same type exist using `@Qualifier` |
| `Primary` | Selecting a default bean using `@Primary` |
| `LazyInitialization` | Lazy bean initialization using `@Lazy`, understanding eager vs. lazy bean creation |
| `BeanScopes` | Understanding Spring bean scopes (`singleton` and `prototype`) and when to use each scope |
| `BeanLifecycle` | Managing the bean lifecycle using `@PostConstruct` and `@PreDestroy` |
| `JavaConfigBean` | Creating and configuring beans using `@Configuration` and `@Bean` instead of component scanning |

---

## 3. Docker

Containerizing Spring Boot applications using Docker.

| Project | Topics Covered |
|---------|----------------|
| `Docker` | Creating Docker images, writing Dockerfiles, running Spring Boot applications inside Docker containers |

---

## 4. Hibernate & Spring Data JPA

Learn how Spring Boot interacts with relational databases using Hibernate and Spring Data JPA.

| Project | Topics Covered |
|---------|----------------|
| `CrudDemo` | Building CRUD applications using Spring Data JPA, Hibernate, EntityManager, DAO pattern, and MySQL |

### Supporting Resources

The `MYSQL/STARTER-SQL-SCRIPTS` folder contains the SQL scripts required for the Hibernate projects.

Open these SQL scripts alongside the `CrudDemo` project to create the database, tables, sample data, and users before running the application.

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Core
- Hibernate
- Spring Data JPA
- MySQL
- Docker
- Maven
- IntelliJ IDEA

---

# 📖 Recommended Study Order

## Basics
1. `MyFirstApp`
2. `Actuator`

## Spring Core
3. `ComponentScanning`
4. `ConstructorInjection`
5. `SetterInjection`
6. `Qualifier`
7. `Primary`
8. `LazyInitialization`
9. `BeanScopes`
10. `BeanLifecycle`
11. `JavaConfigBean`

## Docker
12. `Docker`

## Hibernate & Spring Data JPA
13. `CrudDemo`

> **Note:** Before starting `CrudDemo`, open the `MYSQL/STARTER-SQL-SCRIPTS` folder and execute the required SQL scripts to create the database and sample data.

---

➡️ **Next Project:** Continue adding projects here as you progress through the course.

Each project builds upon concepts introduced in the previous one, so following this order will provide the best learning experience.
