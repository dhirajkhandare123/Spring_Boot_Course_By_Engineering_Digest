
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

<br>
<br>

# Introduction to the Build Lifecycle

### Build Lifecycle Basics
Maven is based around the central concept of a build lifecycle. What this means is that the process for building and distributing a particular artifact (project) is clearly defined.

For the person building a project, this means that it is only necessary to learn a small set of commands to build any Maven project, and the POM will ensure they get the results they desired.

There are three built-in build lifecycles: default, clean and site. The default lifecycle handles your project deployment, the clean lifecycle handles project cleaning, while the site lifecycle handles the creation of your project's web site.

A Build Lifecycle is Made Up of Phases
Each of these build lifecycles is defined by a different list of build phases, wherein a build phase represents a stage in the lifecycle.

For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, refer to the Lifecycle Reference):

validate - validate the project is correct and all necessary information is available
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.
These lifecycle phases (plus the other lifecycle phases not shown here) are executed sequentially to complete the default lifecycle. Given the lifecycle phases above, this means that when the default lifecycle is used, Maven will first validate the project, then will try to compile the sources, run those against the tests, package the binaries (e.g. jar), run integration tests against that package, verify the integration tests, install the verified package to the local repository, then deploy the installed package to a remote repository.

<hr>

### Validate maven

if maven is install in your system you can validate by following command

##### mvn validate

else maven is not install then used following

##### ./mvnw validate


for compile use following command

##### mvn compile

if maven is not installed then used following command

##### ./mvnw compile

for test used following 

##### mvn test

for package which create code jar by which we can easily share this program

##### mvn package

or

##### ./mvnw package

after package jar file generated in target folder

<img width="1918" height="830" alt="image" src="https://github.com/user-attachments/assets/7eaf4aac-c3e0-48db-9d61-a4cfc581588f" />

<br>
<br>

<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/a457f5fe-283c-4736-beb9-839ae1a22e18" />

<br>
<br>

<img width="1867" height="850" alt="image" src="https://github.com/user-attachments/assets/56b20448-69c3-463d-9150-2f4803619ebb" />

<br> <br>

<img width="1918" height="1078" alt="image" src="https://github.com/user-attachments/assets/c4d82bea-d1ec-47a4-be2f-6bae51d14232" />

<br>


