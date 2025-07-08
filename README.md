# Student Management Project

## Maven Installation

If you do not have Maven installed on your system, you can install it using Chocolatey (choco) on Windows:

Open an elevated Command Prompt or PowerShell (Run as Administrator).
Run the following command to install Maven:

```
choco install maven
```

After installation, verify Maven is installed correctly by running:

```
mvn -version
```

This should display the Maven version and Java version being used.

## Building the Project

To build the project and create an executable jar file, navigate to the `SourceCode` directory and run:

```
mvn package
```

The jar file will be generated in the `SourceCode/target` directory, named `student-management-1.0-SNAPSHOT-shaded.jar`.

## Running the Jar File

To run the generated jar file, use the following command:

```
java -jar SourceCode/target/student-management-1.0-SNAPSHOT-shaded.jar
```

This will start the application with the main class `app.Main`.
