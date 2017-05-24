# Calculator

<br>
This is simple calculator project

### Application Requirements:
- Java 1.8
- Spring Boot (Starter)

### Building and running the app standalone
```
gradlew clean build
gradlew bootRun -Denvironment=dev
(or)
java -Denvironment=dev -jar build/libs/calculator-1.0.0.jar
```

### Building docker image
```
docker build  . -t csubbum/calc:latest
```

### Running docker container
```
docker run -itp 5000:5000 -e "env=prod" csubbum/calc:latest
```
