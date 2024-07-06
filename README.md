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
  - **URL:** `POST /tuition/subjects/add`
  - **Response:** `Subject`

- **Get All Subjects**
  - **URL:** `GET /tuition/subjects/all`
  - **Response:** `List<Subject>`

- **Get Subject by ID**
  - **URL:** `GET /tuition/subjects/id/{id}`
  - **Response:** `Subject`

- **Get Subjects by Name**
  - **URL:** `GET /tuition/subjects/name/{name}`
  - **Response:** `List<Subject>`

- **Delete Subject**
  - **URL:** `DELETE /tuition/subjects/{id}`
  - **Response:** `Void`

### Students

- **Create Student**
  - **URL:** `POST /tuition/students/add`
  - **Response:** `Student`

- **Get All Students**
  - **URL:** `GET /tuition/students/all`
  - **Response:** `List<Student>`

- **Get Student by ID**
  - **URL:** `GET /tuition/students/id/{id}`
  - **Response:** `Student`

- **Get Students by Name**
  - **URL:** `GET /tuition/students/name/{name}`
  - **Response:** `List<Student>`

- **Delete Student**
  - **URL:** `DELETE /tuition/students/{id}`
  - **Response:** `Void`

### Classes

- **Create Class**
  - **URL:** `POST /tuition/classes/add`
  - **Response:** `Class`

- **Get All Classes**
  - **URL:** `GET /tuition/classes/all`
  - **Response:** `List<Class>`

- **Get Class by ID**
  - **URL:** `GET /tuition/classes/{id}`
  - **Response:** `Class`

- **Get Classes by Subject**
  - **URL:** `GET /tuition/classes/subject/{subjectId}`
  - **Response:** `List<Class>`

- **Get Classes by Student**
  - **URL:** `GET /tuition/classes/student/{studentId}`
  - **Response:** `List<Class>`

- **Delete Class**
  - **URL:** `DELETE /tuition/classes/{id}`
  - **Response:** `Void`
