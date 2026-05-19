# 🎬 Movie Ticket Booking System – Microservices Project

A full-stack Movie Ticket Booking application built using Java Spring Boot Microservices, Angular, MySQL, and JWT Authentication.

This project demonstrates enterprise-level microservices architecture with secure authentication, REST APIs, dynamic frontend-backend integration, and database-driven application development.

---

# 🚀 Features

✅ User Registration & Login using JWT Authentication
✅ Movie Management Service
✅ Theater Management Service
✅ Ticket Booking Service
✅ REST APIs with Spring Boot
✅ Angular Frontend Integration
✅ MySQL Database Integration
✅ JPA/Hibernate ORM
✅ API Gateway
✅ Eureka Service Discovery
✅ BCrypt Password Encryption
✅ Dynamic Booking History

---

# 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring Security
* Spring Cloud
* Spring Data JPA
* Hibernate
* JWT Authentication
* Maven

### Frontend

* Angular
* TypeScript
* HTML/CSS

### Database

* MySQL

---

# 📂 Microservices

| Service          | Port |
| ---------------- | ---- |
| Eureka Server    | 8761 |
| API Gateway      | 8080 |
| Movie Service    | 8081 |
| Theater Service  | 8082 |
| Booking Service  | 8083 |
| User Service     | 8084 |
| Angular Frontend | 4200 |

---

# ⚙️ Setup Instructions

## Clone Repository

```bash
git clone https://github.com/KrushngiTamhane/movie-ticket-booking-microservices.git
```

---

## Backend Setup

1. Open project in IntelliJ IDEA
2. Configure MySQL database
3. Update application.yml credentials
4. Run services one by one:

   * Eureka Server
   * API Gateway
   * Movie Service
   * Theater Service
   * Booking Service
   * User Service

---

## Frontend Setup

```bash
cd frontend/movie-ticket-ui
npm install
ng serve
```

Frontend runs on:

```bash
http://localhost:4200
```

---

# 🔐 Authentication APIs

## Register

POST:

```bash
http://localhost:8084/auth/register
```

## Login

POST:

```bash
http://localhost:8084/auth/login
```

---

# 📌 Future Enhancements

* Seat Selection System
* Role-Based Access (Admin/User)
* Payment Gateway Integration
* Docker & Kubernetes Deployment
* Responsive UI Design
* Email Notifications

---

# 👩‍💻 Author

Krushangi Tamhane

---
