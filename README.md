# 📝 Journal App - Spring Boot REST API

A simple **Journal Management REST API** built using **Java and Spring Boot**.

This project is created to practice backend development concepts such as REST APIs, CRUD operations, Spring Boot annotations, request handling, and application structure.

## 🚀 Features

* Create a journal entry
* Get all journal entries
* Get a journal entry by ID
* Update an existing journal entry
* Delete a journal entry
* RESTful API architecture
* JSON request and response handling

## 🛠️ Tech Stack

* Java
* Spring Boot
* Maven
* REST API
* IntelliJ IDEA
* Git
* GitHub

## 📂 Project Structure

```text
JournalAppApplication
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.journalApp
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       └── JournalApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

## 📌 API Endpoints

Base URL:

```text
http://localhost:8080/journal
```

### 1. Create Journal Entry

**POST**

```text
/journal
```

Example Request:

```json
{
  "id": 1,
  "title": "Learning Spring Boot",
  "content": "Today I learned how REST APIs work."
}
```

---

### 2. Get All Journal Entries

**GET**

```text
/journal
```

Example Response:

```json
[
  {
    "id": 1,
    "title": "Learning Spring Boot",
    "content": "Today I learned how REST APIs work."
  }
]
```

---

### 3. Get Journal Entry by ID

**GET**

```text
/journal/id/{id}
```

Example:

```text
GET /journal/id/1
```

---

### 4. Update Journal Entry

**PUT**

```text
/journal/id/{id}
```

Example Request:

```json
{
  "id": 1,
  "title": "Spring Boot Practice",
  "content": "Updated my journal entry."
}
```

---

### 5. Delete Journal Entry

**DELETE**

```text
/journal/id/{id}
```

Example:

```text
DELETE /journal/id/1
```

## ▶️ How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/UmangSingh-2004/JournalAppApplication.git
```

### 2. Open the Project

Open the project using **IntelliJ IDEA** or another Java IDE.

### 3. Run the Application

Run:

```text
JournalApplication.java
```

Or use Maven:

```bash
mvn spring-boot:run
```

### 4. Test the API

You can test the endpoints using:

* Postman
* IntelliJ HTTP Client
* cURL
* Browser for GET requests

The application will run on:

```text
http://localhost:8080
```

## 🧠 Concepts Practiced

This project helped me practice:

* Spring Boot project structure
* REST API development
* CRUD operations
* `@RestController`
* `@RequestMapping`
* `@GetMapping`
* `@PostMapping`
* `@PutMapping`
* `@DeleteMapping`
* `@PathVariable`
* `@RequestBody`
* Java Collections
* HTTP methods
* JSON request/response handling
* Git and GitHub

## 🔮 Future Improvements

The project is currently being improved with additional backend features.

Planned features include:

* [ ] MongoDB / PostgreSQL database integration
* [ ] Spring Data JPA
* [ ] Repository layer
* [ ] Service layer
* [ ] DTO implementation
* [ ] Input validation
* [ ] Global exception handling
* [ ] User registration and login
* [ ] Spring Security
* [ ] JWT authentication
* [ ] User-specific journal entries
* [ ] Pagination and sorting
* [ ] Swagger / OpenAPI documentation
* [ ] Unit testing with JUnit and Mockito
* [ ] Docker support
* [ ] Cloud deployment

## 🎯 Project Goal

The goal of this project is to strengthen my **Java Backend Development** skills and understand how production-style applications are developed using **Spring Boot**.

The project will gradually evolve from a basic CRUD application into a complete backend application with authentication, database integration, validation, testing, and deployment.

## 👨‍💻 Author

**Umang Singh**

GitHub: [UmangSingh-2004](https://github.com/UmangSingh-2004)

## ⭐ Support

If you find this project useful, feel free to give it a ⭐ on GitHub.

yoyo