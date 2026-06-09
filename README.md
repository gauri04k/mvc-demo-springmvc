# 🚀 MVC Demo - Spring Boot MVC Application

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.5.14-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql" />
  <img src="https://img.shields.io/badge/Thymeleaf-Frontend-success?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven" />
</p>

<p align="center">
  <b>A Spring Boot MVC web application demonstrating User Registration and Login functionality using Thymeleaf, MySQL, and Spring Data JPA.</b>
</p>

---

## 📖 Project Overview

MVC Demo is a beginner-friendly Spring Boot project that follows the **Model-View-Controller (MVC)** architecture.

The application demonstrates how to:

* Handle user registration and login
* Connect Spring Boot with MySQL
* Perform database operations using Spring Data JPA
* Build dynamic web pages using Thymeleaf
* Organize code using a clean MVC structure

---

## ✨ Features

✅ User Registration

✅ User Login Authentication

✅ Spring MVC Architecture

✅ Thymeleaf Template Engine

✅ MySQL Database Integration

✅ Spring Data JPA Repository

✅ Lombok Support

✅ Maven Project Management

✅ Clean & Structured Codebase

---

## 🛠️ Technology Stack

| Technology         | Description                |
| ------------------ | -------------------------- |
| Java 17            | Programming Language       |
| Spring Boot 3.5.14 | Application Framework      |
| Spring MVC         | MVC Architecture           |
| Thymeleaf          | Template Engine            |
| Spring Data JPA    | Data Persistence Layer     |
| MySQL              | Relational Database        |
| Lombok             | Boilerplate Code Reduction |
| Maven              | Dependency Management      |

---

## 📂 Project Structure

```text
mvc-demo
│
├── src/main/java
│   └── com.demo
│       ├── MvcDemoApplication.java
│       │
│       ├── controller
│       │   └── LoginController.java
│       │
│       ├── model
│       │   └── User.java
│       │
│       └── repository
│           └── UserRepository.java
│
├── src/main/resources
│   ├── static
│   │
│   ├── templates
│   │   ├── index.html
│   │   ├── register.html
│   │   ├── login.html
│   │   └── home.html
│   │
│   └── application.properties
│
└── pom.xml
```

---

## ⚙️ Prerequisites

Before running the application, make sure you have:

* Java 17 or higher
* Maven
* MySQL Server
* Eclipse IDE / IntelliJ IDEA (Optional)

---

## 🗄️ Database Configuration

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mvc_demo
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 🚀 Getting Started

### Clone the Repository

```bash
git clone https://github.com/gauri04k/mvc-demo-springmvc.git
```

### Navigate to Project Folder

```bash
cd mvc-demo-springmvc
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

---

## 🌐 Access the Application

After starting the server, open:

```text
http://localhost:8080
```

---

## 📸 Application Screenshots

Add screenshots here for a more professional repository:

### Home Page

```text
screenshots/home-page.png
```

### Registration Page

```text
screenshots/register-page.png
```

### Login Page

```text
screenshots/login-page.png
```

### Dashboard / Home Screen

```text
screenshots/dashboard.png
```

---

## 🎯 Learning Outcomes

This project demonstrates:

* MVC Design Pattern
* Spring Boot Fundamentals
* Request Mapping
* Form Handling
* Thymeleaf Integration
* Spring Data JPA
* MySQL Connectivity
* Maven Dependency Management

---

## 🔮 Future Enhancements

* Password Encryption using BCrypt
* Spring Security Integration
* User Profile Management
* Role-Based Authentication
* Session Management
* Responsive UI with Bootstrap

---

## 👩‍💻 Author

### Gauri Kapadnis

Java Developer | Spring Boot Enthusiast

GitHub: https://github.com/gauri04k

---

## ⭐ Support

If you found this project useful, please consider giving it a **Star ⭐** on GitHub.

---

<p align="center">
  Made with ❤️ by <b>Gauri Kapadnis</b>
</p>
