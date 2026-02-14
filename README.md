# Data Transfer Object (DTO) Demo

## Overview
This project demonstrates how to implement **Data Transfer Objects (DTOs)** in a Spring Boot application. DTOs are used to transfer data between layers while keeping domain models secure and clean.

## Features
- Spring Boot 3.5.x with JPA and Hibernate
- DTO mapping using [ModelMapper](http://modelmapper.org/)
- RESTful APIs exposing DTOs instead of entities
- Validation and global error handling
- MySQL integration (with option to use H2 for testing)

## Tech Stack
- Java 17
- Spring Boot (Web, Data JPA)
- Hibernate ORM
- MySQL / H2 Database
- ModelMapper

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/brianMugatsia/data_trans_obj.git






   spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=secret
spring.jpa.hibernate.ddl-auto=update



mvn spring-boot:run

