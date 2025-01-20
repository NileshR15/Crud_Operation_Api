
# CrudOperationApi - CRUD Operations of Category and Product.

This project is a simple CrudOperationApi platform built using Spring Boot and REST APIs, demonstrating CRUD (Create, Read, Update, Delete) operations with Hibernate mappings (One-to-Many and Many-to-One) for managing entities like Products and Categories.

## Features

•	Category Management:
          o	Add, retrieve, update, and delete categories.
          o	Each category can contain multiple product(One-to-Many mapping).
•	Product Management:
           o Create, view, update, and delete products.
           o Each product belongs to a single category(Many-to-One mapping).
•	RESTful APIs: 
            Provides clean and modular endpoints for seamless integration with third-party applications.
•	Postman Testing: 
            Includes Postman collection for testing all APIs.
•	Hibernate ORM: 
            Implements relational mappings to ensure smooth interaction with the database.
• Database Integration: 
            Persistent storage with a relational database like MySQL.

## Tech Stack

•	Springboot: Backend framework for building scalable applications.
•	Hibernate:  ORM tool for database interaction and relational mappings.
•	Spring Data JPA: For simplified data access.
•	Spring Web : for RESTful APIs
•	Springboot DevTools : for hot reloading (optional)
•	Postman: For testing and validating API endpoints.
•	MySql : For storing data in relational database.

## Hibernate Mapping

 One-to-Many (Category → Products)
            •	A single category can have multiple associated products.
Many-to-One (Products → Category) 
            •	Each product is linked to a single category.
            
## API Reference

#### Get all items

```http
  https://github.com/NileshR15/Crud_Operation_Api
```

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |


#### CRUD API for Categories and Products

This project implements a simple CRUD API for managing categories and products with pagination. The application allows you to create, read, update, and delete categories and products, with the products being associated with categories.

## Api Endpoints

Category Endpoints

    Get All Categories: GET /api/categories
    Get Category by ID: GET /api/categories/{id}
    Create Category: POST /api/categories
    Update Category: PUT /api/categories/{id}
    Delete Category: DELETE /api/categories/{id}


Product Endpoints

    Get All Products: GET /api/products
    Get Product by ID: GET /api/products/{id}
    Create Product: POST /api/products
    Update Product: PUT /api/products/{id}
    Delete Product: DELETE /api/products/{id}


### Category CRUD

1. **GET /api/categories?page={page_number}**
   - Fetch all categories with pagination.
   - **Example:**
     ```http
     GET http://localhost:8080/api/categories?page=3
     ```

2. **POST /api/categories**
   - Create a new category.
   - **Request Body:**
     ```json
     {
       "name": "Category Name",
       "description": "Category Description"
     }
     ```

3. **GET /api/categories/{id}**
   - Fetch a category by ID.
   - **Example:**
     ```http
     GET http://localhost:8080/api/categories/1
     ```

4. **PUT /api/categories/{id}**
   - Update a category by ID.
   - **Request Body:**
     ```json
     {
       "name": "Updated Category Name",
       "description": "Updated Description"
     }
     ```

5. **DELETE /api/categories/{id}**
   - Delete a category by ID.
   - **Example:**
     ```http
     DELETE http://localhost:8080/api/categories/1
     ```

### Product CRUD

1. **GET /api/products?page={page_number}**
   - Fetch all products with pagination.
   - **Example:**
     ```http
     GET http://localhost:8080/api/products?page=2
     ```

2. **POST /api/products**
   - Create a new product.
   - **Request Body:**
     ```json
     {
       "name": "Product Name",
       "price": 100.0,
       "categoryId": 1
     }
     ```

3. **GET /api/products/{id}**
   - Fetch product by ID, with category details.
   - **Example Response:**
     ```json
     {
       "id": 1,
       "name": "Product Name",
       "price": 100.0,
       "category": {
         "id": 1,
         "name": "Category Name",
         "description": "Category Description"
       }
     }
     ```

4. **PUT /api/products/{id}**
   - Update a product by ID.
   - **Request Body:**
     ```json
     {
       "name": "Updated Product Name",
       "price": 150.0,
       "categoryId": 2
     }
     ```

5. **DELETE /api/products/{id}**
   - Delete a product by ID.
   - **Example:**
     ```http
     DELETE http://localhost:8080/api/products/1
     ```

## Project Setup

### Prerequisites

- **JDK 17 or higher**
- **Maven** (for building the project)
- **IDE** (e.g., IntelliJ IDEA, VS Code, or STS)

### Steps to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/NileshR15/Crud_Operation_Api.git
2. ***Navigate into the project directory:**
    ```bash
    cd Crud_Operation_Api
3. **Build the project using Maven:**
    ```bash
    mvn clean install
4. **Run the application:**
    ```bash
    mvn spring-boot:run
The application will start on port 8080 by default.


## Project Structure

Model: Defines Category and Product entities with Hibernate mappings.
Repository: Interfaces for database operations using Spring Data JPA.
Service: Contains business logic for CRUD operations.
Controller: Exposes REST endpoints for external interaction.

## Postman Testing

Import the provided postman-collection.json file into Postman.
Test all API endpoints with pre-configured examples.

## Conclusion

This API provides endpoints for creating, retrieving, updating, and deleting categories and products. Use the examples provided to make requests to the API and manage your data.

