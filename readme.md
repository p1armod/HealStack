# HealStack 🏥

HealStack is a Spring Boot–based Hospital Management REST API designed to manage core healthcare entities such as patients, doctors, departments, appointments, and insurance details. The project follows a clean layered architecture using Spring Boot, JPA, PostgreSQL, and DTO mapping.

⸻

## 🚀 Features
•	Patient, Doctor, Department, Appointment & Insurance management\
•	RESTful APIs with validation\
•	DTO-based request/response handling\
•	ModelMapper for entity–DTO conversion\
•	PostgreSQL database integration\
•	Spring Data JPA repositories\
•	Clean layered architecture (Controller → Service → Repository)\

⸻

## 🛠️ Tech Stack
•	Java 17+\
•	Spring Boot 3.3.1\
•	Spring Web\
•	Spring Data JPA\
•	Hibernate\
•	PostgreSQL\
•	ModelMapper\
•	Lombok\
•	Gradle

⸻

## 📂 Project Structure

HealStack\
├── src/main/java/org/example
│   ├── Controller      # REST Controllers
│   ├── Service         # Business Logic
│   ├── Repository      # JPA Repositories
│   ├── Entity          # JPA Entities
│   ├── DTO             # Data Transfer Objects
│   ├── Config          # Configuration classes
│   └── Main.java       # Application Entry Point
│
├── src/main/resources
│   └── application.yml / application.properties
│
├── build.gradle
└── gradlew


⸻

## ⚙️ Configuration

### Database Configuration

Update your application.properties or application.yml:

``` 
spring.datasource.url=jdbc:postgresql://localhost:5432/healstack
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
``` 
⸻

▶️ Running the Application

Using Gradle

``` 
./gradlew bootRun
``` 

Build JAR
``` 
./gradlew build
java -jar build/libs/HealStack-1.0-SNAPSHOT.jar

``` 

The application will start at:

``` 
http://localhost:8080
``` 


⸻

### 📡 API Overview

``` 
Base URL: /api
``` 

#### Sample Endpoints

•	POST   /patients\
•	GET    /patients/{id}\
•	POST   /doctors\
•	GET    /departments\
•	POST   /appointments\
•	GET    /insurance/{id}

(Exact endpoints depend on controller mappings)

⸻

## 🧪 Testing

``` 
./gradlew test
``` 


⸻

## 📌 Future Improvements
•	Spring Security (JWT Authentication)\
•	Role-based access control\
•	Pagination & sorting\
•	Global exception handling\
•	Swagger / OpenAPI documentation

⸻

👤 Author

Parmod Kumar

⸻

📄 License

This project is for educational purposes and is open for learning and extension.