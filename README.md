
# SpringBoot API - Student Management System

BlackCoffer Internship Assignment Task: Student Management System using Rest-API, SpringBoot, Thymeleaf, SQL




## API Reference

#### Get all Students Details

```http
    GET http://localhost:8083/students
```
#### Add Student Data

```http
    POST http://localhost:8083/students/new
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `firstName` | `string` | **Required**.  |
| `lastName` | `string` | **Required**.  |
| `email` | `string` | **Required**.  |

#### Insert following JSON format in Body of API

```http
{  
    "first_name":"Himanshi",
    "last_name":"Bobde",
    "email":"himanshi@gmail.com"
}
```
#### Update Student Data as per User Input
```http
  POST http://localhost:8083/students/edit/{id}
```

```http
{  
    "first_name":"updated-info",
    "last_name":"updated-info",
    "email":"updated-info"
}
```
#### Delete Student Data as per User Input
```http
  DELETE http://localhost:8083/students/{id}
```


