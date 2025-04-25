# 📘 README for `restMVCspring`

## RestMVCspring

A simple Spring Boot MVC REST API demo application built with Maven. This project demonstrates core Spring MVC concepts using controllers, services, and tests. It includes REST endpoints for basic resource management like `Beer` and `Customer`.

---

## 🚀 Features

- RESTful APIs built using Spring MVC
- Controllers for `Beer` and `Customer` entities
- Layered architecture (Controller → Service → Model)
- Unit and integration testing using JUnit and Spring Boot Test
- Maven for dependency management

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring MVC
- JUnit 5
- Maven

---

## 📂 Project Structure

```
restMVCspring/
├── src/
│   └── main/
│       └── java/
│           └── edu.bekthedev.restmvcspring/
│               ├── controller/
│               │   ├── BeerController.java
│               │   └── CustomerController.java
│               ├── model/
│               ├── service/
│               └── RestMvCspringApplication.java
│
├── pom.xml
├── application.properties
└── README.md
```

---

## 📦 Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+

### Running the App

```bash
./mvnw spring-boot:run
```

The app will start at: `http://localhost:8080`

---

## 🔁 Sample Endpoints

### `GET /api/v1/beer`
Returns a list of beers.

### `POST /api/v1/customer`
Creates a new customer.

(More endpoints can be listed based on actual controller mappings.)

---

## ✅ Running Tests

```bash
./mvnw test
```

---

## 📄 License

This project is for educational and demonstration purposes.