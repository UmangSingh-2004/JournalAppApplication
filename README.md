📝 Journal App - Spring Boot REST API

A simple Journal Management REST API built using Java and Spring Boot.

This project is created to practice backend development concepts such as REST APIs, CRUD operations, Spring Boot annotations, request handling, and application structure.

🚀 Features
Create a journal entry
Get all journal entries
Get a journal entry by ID
Update an existing journal entry
Delete a journal entry
RESTful API architecture
JSON request and response handling
🛠️ Tech Stack
Java
Spring Boot
Maven
REST API
IntelliJ IDEA
Git
GitHub

📂 Project Structure
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
📌 API Endpoints

Base URL:

http://localhost:8080/journal
1. Create Journal Entry

POST

/journal

Example Request:

{
"id": 1,
"title": "Learning Spring Boot",
"content": "Today I learned how REST APIs work."
}
2. Get All Journal Entries

GET

/journal

Example Response:

[
{
"id": 1,
"title": "Learning Spring Boot",
"content": "Today I learned how REST APIs work."
}
]
3. Get Journal Entry by ID

GET

/journal/id/{id}

Example:

GET /journal/id/1
4. Update Journal Entry

PUT

/journal/id/{id}

Example Request:

{
"id": 1,
"title": "Spring Boot Practice",
"content": "Updated my journal entry."
}
5. Delete Journal Entry

DELETE

/journal/id/{id}

Example:

DELETE /journal/id/1
▶️ How to Run the Project
1. Clone the Repository
   git clone https://github.com/UmangSingh-2004/JournalAppApplication.git
2. Open the Project

Open the project using IntelliJ IDEA or another Java IDE.

3. Run the Application

Run:

JournalApplication.java

Or use Maven:

mvn spring-boot:run
4. Test the API

You can test the endpoints using:

Postman
IntelliJ HTTP Client
cURL
Browser for GET requests

The application will run on:

http://localhost:8080