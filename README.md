## Key Technologies

Java • Spring Boot • Spring Security • PostgreSQL • Docker • AWS • REST APIs • Maven • JPA/Hibernate • CI/CD

# Java E-Commerce Platform (Udemy)

A modern e-commerce application built with Java and Spring Boot, designed using industry-standard backend development practices and cloud-ready deployment principles.

> **Status:** Backend MVP completed. React frontend currently under development.

## Features

* User registration and authentication
* Role-based access control with Spring Security
* Product catalog management
* Shopping cart functionality
* Order processing
* RESTful API architecture
* PostgreSQL persistence layer
* Secure password handling and authentication
* Cloud deployment support (AWS-ready)
* Product search and filtering
* Payment gateway integration

## Technology Stack

### Backend

* Java 21
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* Maven
* REST APIs

### Database

* PostgreSQL

### Frontend (Work in Progress)

* React
* TypeScript (planned)

### DevOps & Cloud

* Docker
* AWS deployment support
* GitHub Actions (optional)
* Maven build lifecycle

## Architecture

The application follows a layered architecture:

* Controller Layer – REST API endpoints
* Service Layer – Business logic
* Repository Layer – Data access
* Database Layer – PostgreSQL persistence

The project is designed with maintainability, scalability, and clean code principles in mind.

## Security

Security is implemented using Spring Security:

* User authentication
* JWT authentication
* Password encryption using BCrypt
* Role-based authorization
* Protected API endpoints
* Stateless authentication architecture

## Getting Started

### Prerequisites

* Java 17+
* Maven 3.8+
* PostgreSQL 14+
* Git

### Clone the repository

```bash
git clone https://github.com/yourusername/ecommerce-platform.git
cd ecommerce-platform
```

### Configure PostgreSQL

Update the database configuration in:

```properties
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
spring.datasource.username=postgres
spring.datasource.password=password
```

### Run the application

```bash
mvn clean install
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

## API Documentation

Example endpoints:

| Method | Endpoint           | Description       |
| ------ | ------------------ | ----------------- |
| POST   | /api/public/categories | Create Product Category     |
| POST   | /api/auth/signin    | Authenticate user |
| GET    | /api/public/products      | List products     |
| POST   | /api/order/users/payments/        | Place order      |

## Future Improvements

* React frontend implementation
* Kubernetes deployment
* AWS RDS integration
* AWS ECS/EKS deployment
* Monitoring and observability

## Project Goals

This project was created to demonstrate practical experience with:

* Java backend development
* Spring Boot ecosystem
* Secure REST API design
* Database modeling
* Cloud-ready application architecture
* CI/CD and deployment workflows
* Modern software engineering practices

## License

This project is intended for educational and portfolio purposes.
