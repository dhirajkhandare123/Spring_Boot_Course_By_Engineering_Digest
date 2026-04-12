
# ⚙️Create Spring Boot Project

Go to 👉 Spring Initializr

Configure Project:
Project: Maven
Language: Java
Spring Boot Version: 3.x
Group: com.example
Artifact: demo
Packaging: Jar
Java Version: 17 (recommended)
Add Dependencies:
Spring Web

Click Generate and download the project.

<hr>

# 🌐 Create First REST API

package com.dhiraj.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("abc")
    public String sayHello(){
        return "Hello";
    }
}

# Test api

Open browser or Postman:

GET http://localhost:8080/abc

# Output

<img width="1913" height="1078" alt="image" src="https://github.com/user-attachments/assets/afd088e7-5bf8-476f-9807-72cae346e48c" />


# 📌 Key Annotations Explained

@SpringBootApplication → Main configuration
@RestController → Marks class as REST API
@GetMapping → Handles GET request
