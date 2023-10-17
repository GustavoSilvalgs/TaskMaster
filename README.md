# TaskMaster
Task Management System with a Spring Boot RESTful API. This project enables users to efficiently create, organize, and track their tasks and task lists. It implements user authentication, task priorities, notifications, and more. A comprehensive solution for staying on top of your daily responsibilities

## Class Diagram

```mermaid
classDiagram
  class User {
    - Long id
    - String name
    - String email
    - String password
  }

  class Task {
    - Long id
    - String title
    - String description
    - Date dueDate
    - String status
    - String priority
  }

  class TaskList {
    - Long id
    - String name
  }

  User "1" -- "N" Task : has
  TaskList "1" -- "N" Task : contains
```
