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
    ```http
    POST /tuition/subjects/add
    ```

- **Get All Subjects**
    ```http
    GET /tuition/subjects/all
    ```

- **Get Subject by ID**
    ```http
    GET /tuition/subjects/id/{id}
    ```

- **Get Subjects by Name**
    ```http
    GET /tuition/subjects/name/{name}
    ```

- **Delete Subject**
    ```http
    DELETE /tuition/subjects/{id}
    ```

### Students

- **Create Student**
    ```http
    POST /tuition/students/add
    ```

- **Get All Students**
    ```http
    GET /tuition/students/all
    ```

- **Get Student by ID**
    ```http
    GET /tuition/students/id/{id}
    ```

- **Get Students by Name**
    ```http
    GET /tuition/students/name/{name}
    ```

- **Delete Student**
    ```http
    DELETE /tuition/students/{id}
    ```

### Classes

- **Create Class**
    ```http
    POST /tuition/classes/add
    ```

- **Get All Classes**
    ```http
    GET /tuition/classes/all
    ```

- **Get Class by ID**
    ```http
    GET /tuition/classes/{id}
    ```

- **Get Classes by Subject**
    ```http
    GET /tuition/classes/subject/{subjectId}
    ```

- **Get Classes by Student**
    ```http
    GET /tuition/classes/student/{studentId}
    ```

- **Delete Class**
    ```http
    DELETE /tuition/classes/{id}
    ```
