
# What is Annotation in Spring Boot?

##### Definition:
Annotations in Spring Boot are metadata (special markers) used in code to configure and control the behavior of the Spring framework without writing XML.

🔹 Why Annotations are Used?
✔️ Replace XML configuration
✔️ Reduce boilerplate code
✔️ Enable auto-configuration
✔️ Improve readability & maintainability
🔹 Common Spring Boot Annotations
    1. @SpringBootApplication
    Main annotation for Spring Boot app
    Combination of:
      @Configuration
      @EnableAutoConfiguration
      @ComponentScan

    👉 Used on main class

  2. @RestController
  Combines:
      @Controller
      @ResponseBody
  Used to create REST APIs
  3. @RequestMapping
  Maps HTTP requests to methods
  Variants:
      @GetMapping
      @PostMapping
      @PutMapping
      @DeleteMapping
  4. @Autowired
  Used for Dependency Injection
    Automatically injects required object (bean)
  5. @Component
  Marks a class as Spring Bean
  Variants:
      @Service
      @Repository
      @Controller
  6. @Configuration
    Marks class as configuration class
    Used to define beans manually
  7. @Bean
    Used inside @Configuration class
    Creates and manages object by Spring container

# What is IoC (Inversion of Control) in Spring Boot?

Definition:
IoC (Inversion of Control) is a principle where the control of object creation and dependency management is transferred from the programmer to the Spring framework (container).

👉 Instead of creating objects manually using new, Spring creates and manages objects (beans).

## 🔹 Simple Meaning

👉 You don’t control objects → Spring controls them

👉 “We use IoC to achieve loose coupling, better testability, and centralized object management instead of manually creating tightly coupled objects.”


# What is ApplicationContext in Spring?

Definition:
ApplicationContext is an interface of Spring IoC Container that is responsible for creating, configuring, and managing beans (objects).

# What is IoC Container in Spring?

Definition:
IoC Container is the core component of Spring that creates, manages, and injects objects (beans) automatically.

👉 It implements the concept of IoC (Inversion of Control)

🔹 Simple Meaning

👉 It is the engine that controls all objects in Spring

## Types of IoC Container

  1. BeanFactory
  2. ApplicationContext

# @SpringBootApplication (Most Important Annotation)

Definition:
@SpringBootApplication is the main annotation in Spring Boot used to enable auto-configuration, component scanning, and configuration support.

👉 It is placed on the main class to start the application.

@SpringBootApplication =
    @Configuration
    + @EnableAutoConfiguration
    + @ComponentScan

# What is Dependency Injection (DI) in Spring?

Definition:
Dependency Injection is a technique where an object’s dependencies are provided by the Spring container instead of the object creating them itself.

👉 It is the implementation of IoC (Inversion of Control)

🔹 Simple Meaning

👉 Don’t create objects → Get them injected by Spring

