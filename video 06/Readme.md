
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
