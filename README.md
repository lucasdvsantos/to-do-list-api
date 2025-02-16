# To-Do List API

A simple RESTful API for managing tasks, built with Spring Boot, Spring Data JPA, and H2 Database.

## Features

- Create, read, update and delete tasks
- Update tasks as Pending, In Progress, or Completed

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database

## Getting Started
### Prerequisites

- Java 17+
- Maven

### Installation
1. Clone the repository:
```  
  git clone https://github.com/lucasdvsantos/to-do-list-api.git
  cd to-do-list-api
```
2. Build and run the application:
```
  mvn spring-boot:run
```
3. The API will be available at:
```
  http://localhost:8080
```

## API Endpoints
| Method       | Endpoint         | Description              |
| ------------ | ---------------- | ------------------------ |
| ```POST```   | ```/tasks```     | Create a new task        |
| ```GET```    | ```/tasks```     | Retrieve all tasks       |
| ```GET```    | ```/tasks{id}``` | Retrieve a specific task |
| ```PUT```    | ```/tasks{id}``` | Update a task            |
| ```DELETE``` | ```/tasks{id}``` | Delete a task            |

## Example JSON Request (Create Task)
```
  {
    "title": "Ir para o curso de inglês",
    "status": "PENDENTE"
  }
```

## Future Improvements

- Implement filter by status
- Improve logging and monitoring
- Implement code testing
- Add database persistence (PostgreSQl/MySQL)
- Develop Font-end
