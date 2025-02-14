# To-Do List API

A simple RESTful API for managing tasks, built with Spring Boot, Spring Data JPA, and H2 Database.

## Features

- Create, read, update and delete tasks
- Update tasks as Pending, In Progress, or Completed
- Filter tasks by status

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
| Method       | Endpoint            | Description              |
| ------------ | ------------------- | ------------------------ |
| ```POST```   | ```/tasks```        | Create a new task        |
| ```GET```    | ```/tasks```        | Retrieve all tasks       |
| ```GET```    | ```/tasks{id}```    | Retrieve a specific task |
| ```GET```    | ```/tasks/filter``` | Filter tasks by status   |
| ```PUT```    | ```/tasks{id}```    | Update a task            |
| ```DELETE``` | ```/tasks{id}```    | Delete a task            |

## Filtering Tasks by Status

To retrieve tasks with a specific status, use the ```/tasks/filter``` endpoint with a query paramenter

## Example Request

```
 GET http://localhost:8080/tasks/filter?status=PENDENTE
```

## Example JSON Request (Create Task)
```
[
    {
        "id": 1,
        "title": "Pagar as contas",
        "status": "PENDENTE"
    }
]
```

## Future Improvements

- ~~Implement filter by status~~
- Improve logging and monitoring
- Implement code testing
- Add database persistence (PostgreSQl/MySQL)
- Develop Font-end
