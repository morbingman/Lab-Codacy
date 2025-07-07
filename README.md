# This repo is for completing assignment for PRO192

There is nothing much to see here. Since this project uses AI for many coding test
The task is to create a  basic student management system (NO GUI) CLI only

---

# Java Student Management Application

## Overview

This project is a simple Java-based student information management application developed using Object-Oriented Programming (OOP) principles. It allows managing student records with functionalities to add, delete, search, and display students.

## Codebase Structure

- `SourceCode/src/main/java/model/Student.java`: Defines the `Student` class with attributes (student ID, full name, GPA) and validation.
- `SourceCode/src/main/java/service/StudentService.java`: Provides services to manage the collection of students.
- `SourceCode/src/main/java/util/InputUtil.java`: Utility class for input handling and validation.
- `SourceCode/src/main/java/app/Main.java`: Main application entry point with a command-line interface for user interaction.
- `SourceCode/src/main.java`: Alternative main entry point without package declaration (may require IDE configuration).

## Java Version

- The project uses Java 11.

## Build and Run Instructions

### Using Maven (recommended)

1. Open a terminal in the `SourceCode` directory.
2. Compile the project:

```bash
mvn compile
```

3. Run the application:

```bash
mvn exec:java -Dexec.mainClass="app.Main"
```

### Running from SourceCode/src/main.java

If you prefer to run the application from `SourceCode/src/main.java` (without package), ensure your IDE or build tool is configured to include `SourceCode/src` as a source folder.

Compile and run the `Main` class in `SourceCode/src` accordingly.

## Notes

- The project supports up to 100 students.
- Input validation and error handling are implemented.
- The command-line interface provides a simple menu for interaction.

