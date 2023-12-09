# User Data App

A Spring Boot application for storing user data, with support for different user types (Parent and Child). The child users must belong to a parent.

## Prerequisites

- Java 17 or later
- Maven
- Spring Boot
- MySQL
- Jpa
## Getting Started

Follow these instructions to get the project up and running on your local machine.

### Clone the Repository

```bash
git clone https://github.com/mohaiminur/user-services.git

## API Endpoints

- **GET /api/users:** Get all users
- **GET /api/users/{id}:** Get a specific user by ID
- **POST /api/users:** Create a new user
- **PUT /api/users/{id}:** Update an existing user
- **DELETE /api/users/{id}:** Delete a user
