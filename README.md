# Tuition Classes Management API

This Spring Boot application manages tuition classes, students, and subjects. It supports CRUD operations and searching for students by name, subjects by name, and classes by student or subject. Using a MySQL database and Spring Data JPA, this API provides a robust backend for organizing tuition classes effectively.

## Features

- **Subjects Management:**
  - Add, retrieve all, retrieve by ID, retrieve by name, delete subjects.

- **Students Management:**
  - Add, retrieve all, retrieve by ID, retrieve by name, delete students.

- **Classes Management:**
  - Add, retrieve all, retrieve by ID, retrieve by subject, retrieve by student, delete classes.

## Tools Used

- **Spring Boot:** Java framework for building the API.
- **Spring Data JPA:** Simplifies data access using ORM.
- **MySQL:** Database management system for data persistence.
- **Maven:** Dependency management and build tool.
- **Java:** Programming langauge

## Endpoints

### Subjects

- **Create Subject**
  - **URL:** `/tuition/subjects/add`
  - **Method:** `POST`
  - **Request Body:** `Subject`
  - **Response:** `Subject`

- **Get All Subjects**
  - **URL:** `/tuition/subjects/all`
  - **Method:** `GET`
  - **Response:** `List<Subject>`

- **Get Subject by ID**
  - **URL:** `/tuition/subjects/id/{id}`
  - **Method:** `GET`
  - **Response:** `Subject`

- **Get Subjects by Name**
  - **URL:** `/tuition/subjects/name/{name}`
  - **Method:** `GET`
  - **Response:** `List<Subject>`

- **Delete Subject**
  - **URL:** `/tuition/subjects/{id}`
  - **Method:** `DELETE`
  - **Response:** `Void`

### Students

- **Create Student**
  - **URL:** `/tuition/students/add`
  - **Method:** `POST`
  - **Request Body:** `Student`
  - **Response:** `Student`

- **Get All Students**
  - **URL:** `/tuition/students/all`
  - **Method:** `GET`
  - **Response:** `List<Student>`

- **Get Student by ID**
  - **URL:** `/tuition/students/id/{id}`
  - **Method:** `GET`
  - **Response:** `Student`

- **Get Students by Name**
  - **URL:** `/tuition/students/name/{name}`
  - **Method:** `GET`
  - **Response:** `List<Student>`

- **Delete Student**
  - **URL:** `/tuition/students/{id}`
  - **Method:** `DELETE`
  - **Response:** `Void`

### Classes

- **Create Class**
  - **URL:** `/tuition/classes/add`
  - **Method:** `POST`
  - **Request Body:** `Class`
  - **Response:** `Class`

- **Get All Classes**
  - **URL:** `/tuition/classes/all`
  - **Method:** `GET`
  - **Response:** `List<Class>`

- **Get Class by ID**
  - **URL:** `/tuition/classes/{id}`
  - **Method:** `GET`
  - **Response:** `Class`

- **Get Classes by Subject**
  - **URL:** `/tuition/classes/subject/{subjectId}`
  - **Method:** `GET`
  - **Response:** `List<Class>`

- **Get Classes by Student**
  - **URL:** `/tuition/classes/student/{studentId}`
  - **Method:** `GET`
  - **Response:** `List<Class>`

- **Delete Class**
  - **URL:** `/tuition/classes/{id}`
  - **Method:** `DELETE`
  - **Response:** `Void`
