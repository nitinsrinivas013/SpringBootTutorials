# Spring Boot Learning Repository

This repository contains all the Spring Boot projects I built while learning Spring Boot from the ground up. The projects are organized by topic and are intended to be studied in the order shown below.

---

## 📚 Learning Roadmap

### 1. Basics

Start here to understand the fundamentals of Spring Boot.

| Project | Topics Covered |
|---------|----------------|
| `MyFirstApp` | Creating your first Spring Boot application, project structure, running the application |
| `Actuator` | Spring Boot Actuator, monitoring application health and metrics |

---

### 2. Spring Core

Learn the core concepts of the Spring Framework, especially Dependency Injection and the IoC Container.

| Project | Topics Covered |
|---------|----------------|
| `ComponentScanning` | Component scanning and automatic bean detection |
| `ConstructorInjection` | Constructor-based dependency injection (recommended approach) |
| `SetterInjection` | Setter-based dependency injection |
| `Qualifier` | Resolving ambiguity when multiple beans of the same type exist using `@Qualifier` |
| `Primary` | Selecting a default bean using `@Primary` |
| `LazyInitialization` | Lazy bean initialization using `@Lazy`, understanding eager vs. lazy bean creation |
| `BeanScopes` | Understanding Spring bean scopes (`singleton` and `prototype`), bean lifecycle within the IoC container, and choosing the appropriate scope based on application requirements |
| `BeanLifecycle` | Managing the bean lifecycle using `@PostConstruct` and `@PreDestroy`, understanding bean initialization and destruction callbacks, and when Spring invokes lifecycle methods |

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Core
- Maven
- IntelliJ IDEA

---

## 📖 Recommended Study Order

### Basics
1. `MyFirstApp`
2. `Actuator`

### Spring Core
3. `ComponentScanning`
4. `ConstructorInjection`
5. `SetterInjection`
6. `Qualifier`
7. `Primary`
8. `LazyInitialization`
9. `BeanScopes`
10. `BeanLifecycle`

➡️ **Next Project:** `JavaConfiguration`

Each project builds on the concepts introduced in the previous one, so following this order will provide the best learning experience.
