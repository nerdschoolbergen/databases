# Introduction to Databases

In this workshop, we'll learn SQL fundamentals and how to use the Java Persistence API (JPA) to interact with a PostgreSQL database from a Spring Boot application. We'll be working with PostgreSQL — an open source database server pre-loaded with movie data.

## [Open presentation slides](https://docs.google.com/presentation/d/1e1GuW5EXv9BrOSzolLabKaQC_UgDJC4Isi3bj4e7qdo/edit?usp=sharing)

## Focus of this lesson

The first part focuses on learning SQL through hands-on exercises. The second part introduces JPA and Spring Data to query the same database from a Java web application.

## What you need

- [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/)
- JDK Development Kit (JDK 17 or later): [Java SE Development Kit](https://www.oracle.com/java/technologies/downloads/)
- Alternative dev kit (Java 17 or later): [Eclipse Temurin Java Development Kit](https://adoptium.net/)
- [Maven](https://maven.apache.org) (for the JPA exercises)
- A terminal / command line
- A code editor or IDE (IntelliJ recommended)

## How to get started

- Start by cloning this repository to a directory on your computer.
- Although you have this README file open, we recommend reading the exercises on [GitHub](https://github.com/nerdschool/databases) for the best formatting experience.

## Exercises

### Part 1: SQL Fundamentals

- [Exercise 1 - Getting Started](exercise-1/README.md)
- [Exercise 2 - Basic SQL Queries](exercise-2/README.md)
- [Exercise 3 - Modifying Data](exercise-3/README.md)
- [Exercise 4 - Pattern Matching and Sorting](exercise-4/README.md)
- [Exercise 5 - Joining Tables](exercise-5/README.md)

### Part 2: Java Persistence API

- [Exercise 6 - Querying Movies with JPA](exercise-6/README.md)
- [Exercise 7 - Movie Details and Relationships](exercise-7/README.md)
- [Exercise 8 - Directors](exercise-8/README.md)

## Helpful resources

- [PostgreSQL Tutorial](https://www.postgresqltutorial.com)
- [Spring Data JPA Reference](https://docs.spring.io/spring-data/jpa/reference/)
- [JPA Annotations Reference](https://jakarta.ee/specifications/persistence/)

### Symbols and notation used in exercises

#### Icons with special meaning

:pencil2: - A task you should do

:book: - A section of text to read (no tasks, just information).

:bulb: - Additional information.

:exclamation: - Something important.

:question: - Open-ended question for the reader

:poop: - Bad practice (don't-do-this)

:star: - A bonus task (not required)

#### Keyboard keys

<kbd>F5</kbd> - Run query in pgAdmin
