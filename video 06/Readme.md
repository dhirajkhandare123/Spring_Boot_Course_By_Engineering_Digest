
# Maven

#### Maven in Spring Boot is a build automation and dependency management tool used to manage your project easily.

## 🔹 Simple Definition

### Maven helps you:

#### 1. Download required libraries (dependencies)
#### 2. Build your project (compile, test, package)
#### 3. Manage project structure automatically

## 🔹 Important File in Maven

👉 pom.xml (Project Object Model)

This file contains:

- Project details
- Dependencies
- Plugins

Example:

<dependency>
    <groupId>com.opencsv</groupId>
    <artifactId>opencsv</artifactId>
    <version>5.12.0</version>
    <scope>compile</scope>
</dependency>

## 🔹 Real-life Example

### Maven:
❌ You manually download JAR files

### With Maven:
✅ Just add dependency → Maven does everything

## 🔹 Key Commands
mvn clean → Deletes old files
mvn compile → Compiles code
mvn package → Creates JAR file
mvn spring-boot:run → Runs app

<hr>

### 🔹 Short Interview Answer

#### Maven is a build and dependency management tool used in Spring Boot to manage libraries, build the project, and automate the development process using the pom.xml file.

<hr>

# Depency Managent in maven

### Steps in setup maven 

1. copy dependency from maven repository
<br>
<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/fe4f6407-f99b-41f3-8a0b-fedf08326fc9" />
<br>

2. Paste in pom.xml
<br>
<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/aa8afb2b-4eaa-40a0-adb7-6d0d8dc9a17e" />
<br>

3. Reload maven
