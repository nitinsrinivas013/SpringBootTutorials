# Spring Boot Learning Repository

This repository contains all the Spring Boot projects I built while learning Spring Boot from the ground up. Each project focuses on a specific concept and is organized in a structured learning path. The projects are intended to be explored in the order shown below, as each one builds upon concepts introduced in the previous projects.

---

# 📚 Learning Roadmap

## 1. Basics

Start here to understand the fundamentals of Spring Boot.

| Project      | Topics Covered                                                                                                 |
| ------------ | -------------------------------------------------------------------------------------------------------------- |
| `MyFirstApp` | Creating your first Spring Boot application, project structure, application lifecycle, running the application |
| `Actuator`   | Spring Boot Actuator, monitoring application health, metrics, and production-ready features                    |

---

## 2. Spring Core

Learn the core concepts of the Spring Framework, especially Dependency Injection and the IoC Container.

| Project                | Topics Covered                                                                   |
| ---------------------- | -------------------------------------------------------------------------------- |
| `ComponentScanning`    | Component scanning and automatic bean detection                                  |
| `ConstructorInjection` | Constructor-based dependency injection (recommended approach)                    |
| `SetterInjection`      | Setter-based dependency injection                                                |
| `Qualifier`            | Resolving ambiguity when multiple beans exist using `@Qualifier`                 |
| `Primary`              | Selecting a default bean using `@Primary`                                        |
| `LazyInitialization`   | Lazy bean initialization using `@Lazy`, eager vs. lazy bean creation             |
| `BeanScopes`           | Understanding Spring bean scopes (`singleton`, `prototype`) and when to use them |
| `BeanLifecycle`        | Managing the bean lifecycle using `@PostConstruct` and `@PreDestroy`             |
| `JavaConfigBean`       | Creating beans using `@Configuration` and `@Bean` instead of component scanning  |

---

## 3. Docker & Deployment

Learn how to containerize and deploy Spring Boot applications.

| Project            | Topics Covered                                                                                                                                            |
| ------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `Docker`           | Creating Docker images, writing Dockerfiles, running Spring Boot applications inside Docker containers                                                    |
| `RegistrationForm` | Spring MVC, Thymeleaf form handling, server-side validation basics, deployment using Docker on AWS EC2                                                    |
| `Calculator`       | Spring MVC application using Thymeleaf, request handling, Docker containerization, deployment on AWS EC2 with Application Load Balancer and Target Groups |

### Deployment Experience

The web applications in this section were deployed on **AWS EC2** using Docker containers. An **Application Load Balancer (ALB)** with **Target Groups** was configured to distribute incoming traffic to the application instances, providing practical experience with cloud deployment concepts.

---

## 4. Hibernate & Spring Data JPA

Learn how Spring Boot interacts with relational databases using Hibernate and Spring Data JPA.

| Project    | Topics Covered                                                                                                                                                               |
| ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `CrudDemo` | Building CRUD applications using Hibernate, EntityManager, DAO pattern, Spring Data JPA, MySQL, entity lifecycle, transactions, repository pattern, and database integration |

### Supporting Resources

The `MYSQL/STARTER-SQL-SCRIPTS` folder contains the SQL scripts required for the Hibernate projects.

Execute these SQL scripts before running `CrudDemo` to create the database, tables, sample data, and required users.

---

## 5. Spring REST APIs

Learn how to build RESTful web services using Spring Boot.

| Project            | Topics Covered                                                                                                                                                                                                                                                                                    |
| ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `DemoSpringServer` | Creating REST APIs using `@RestController`, `@GetMapping`, `@PostConstruct`, `@PathVariable`, request mapping, HTTP methods, JSON responses, Jackson serialization/deserialization, automatic data binding, request body handling, REST endpoint testing using Postman, browser, and Android client |

### Concepts Covered

* REST architecture and RESTful principles
* HTTP request/response lifecycle
* JSON serialization using Jackson
* Automatic object mapping
* Request parameter binding
* Path variables
* Request body handling
* Building API endpoints
* Testing APIs using Postman
* Consuming APIs from web and mobile applications

---

# 🛠️ Technologies Used

* Java 21
* Spring Boot
* Spring Core
* Spring MVC
* Spring REST
* Thymeleaf
* Hibernate
* Spring Data JPA
* MySQL
* Docker
* AWS EC2
* AWS Application Load Balancer
* AWS Target Groups
* Maven
* IntelliJ IDEA
* Postman

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

## Docker & Deployment

12. `Docker`
13. `RegistrationForm`
14. `Calculator`

## Hibernate & Spring Data JPA

15. `CrudDemo`

> **Note:** Before starting `CrudDemo`, execute the SQL scripts available in `MYSQL/STARTER-SQL-SCRIPTS` to create the required database and sample data.

## Spring REST APIs

16. `DemoSpringServer`

---

## 🚀 Repository Goal

This repository documents my complete journey of learning Spring Boot, beginning with the fundamentals and progressing towards building production-ready backend applications.

As I continue learning, new modules covering topics such as Spring Security, Validation, Spring Data REST, JWT Authentication, Microservices, Testing, Spring Cloud, and more will be added to this repository.

Each project is designed to focus on a specific concept while building upon previous knowledge, making the repository a structured reference for both learning and revision.







## 📈 Learning Progress

### Core Spring Boot

* ✅ Spring Boot Basics
* ✅ Spring Boot Actuator
* ✅ Spring Core
* ✅ Dependency Injection
* ✅ Bean Scopes
* ✅ Bean Lifecycle
* ✅ Java Configuration

### Web Development

* ✅ Spring MVC
* ✅ Thymeleaf
* ✅ Form Handling

### Backend Development

* ✅ Hibernate ORM
* ✅ Spring Data JPA
* ✅ CRUD Applications
* ✅ MySQL Integration

### REST APIs

* ✅ REST Architecture
* ✅ REST Controllers
* ✅ HTTP Methods
* ✅ JSON Processing (Jackson)
* ✅ Request & Response Mapping
* ✅ Data Binding
* ✅ Path Variables
* ✅ Request Parameters
* ✅ Postman API Testing

### DevOps & Cloud

* ✅ Docker
* ✅ AWS EC2 Deployment
* ✅ AWS Application Load Balancer
* ✅ AWS Target Groups

### Currently Learning

* 🚧 Advanced Spring REST
* 🚧 Exception Handling
* 🚧 Validation

### Upcoming Modules

* ⏳ Spring Security
* ⏳ JWT Authentication
* ⏳ Spring Data REST
* ⏳ Spring AOP
* ⏳ Spring Boot Testing (JUnit & Mockito)
* ⏳ Spring Boot Monitoring
* ⏳ Spring Boot Caching
* ⏳ Spring Boot Microservices
* ⏳ Spring Cloud
* ⏳ Spring AI

---

# 📂 Repository Structure

```text
SPRING-BOOT-TUTORIALS
│
├── BASICS
│   ├── MyFirstApp
│   └── Actuator
│
├── SPRING CORE
│   ├── ComponentScanning
│   ├── ConstructorInjection
│   ├── SetterInjection
│   ├── Qualifier
│   ├── Primary
│   ├── LazyInitialization
│   ├── BeanScopes
│   ├── BeanLifecycle
│   └── JavaConfigBean
│
├── DOCKER
│   ├── Docker
│   ├── RegistrationForm
│   └── Calculator
│
├── HIBERNATE
│   ├── CrudDemo
│   └── ...
│
├── REST
│   └── DemoSpringServer
│
└── MYSQL
    └── STARTER-SQL-SCRIPTS
```

---

# 🎯 Learning Objectives

Throughout this repository I aim to:

* Understand the internals of the Spring Framework.
* Build production-ready backend applications using Spring Boot.
* Develop RESTful APIs following industry best practices.
* Work with relational databases using Hibernate and Spring Data JPA.
* Deploy Spring Boot applications using Docker and AWS.
* Learn enterprise backend development concepts used in real-world software systems.
* Progress towards Spring Security, Microservices, Cloud-native applications, and scalable backend architectures.

---

# 🚀 Skills Demonstrated

* Java 21
* Object-Oriented Programming
* Spring Boot
* Spring Core
* Dependency Injection
* Inversion of Control (IoC)
* Spring MVC
* REST API Development
* Jackson JSON Processing
* Hibernate ORM
* Spring Data JPA
* DAO Pattern
* EntityManager
* Thymeleaf
* MySQL
* Maven
* Docker
* AWS EC2
* AWS Application Load Balancer
* AWS Target Groups
* IntelliJ IDEA
* Postman
* Git & GitHub

---

# ⭐ Highlights

✔ Structured learning roadmap from beginner to advanced Spring Boot.

✔ Every project focuses on one core Spring concept.

✔ Includes cloud deployment using AWS.

✔ Covers both web applications and RESTful backend services.

✔ Database integration using Hibernate and Spring Data JPA.

✔ Dockerized applications for deployment.

✔ Repository continuously updated as new Spring Boot topics are completed.

---

# 🔮 Future Projects

As I continue learning, this repository will expand to include:

* Spring Validation
* Global Exception Handling
* Spring Security
* JWT Authentication
* File Upload & Download APIs
* Email Integration
* Pagination & Sorting
* Spring Data REST
* Redis Caching
* Unit & Integration Testing
* Spring Boot Actuator (Advanced)
* Spring Cloud
* Spring Boot Microservices
* API Gateway
* Service Discovery
* Config Server
* Resilience4j
* Kafka
* RabbitMQ
* Docker Compose
* Kubernetes Deployment
* CI/CD using GitHub Actions
