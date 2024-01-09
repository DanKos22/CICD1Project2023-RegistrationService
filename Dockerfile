FROM eclipse-temurin:17-alpine
LABEL authors="G00267173@atu.ie"

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from target directory into the econtainer at /app
COPY target/CICD1Project2023-RegistrationService-0.0.1-SNAPSHOT.jar /app

#Expose the port that the Spring Boot application will run on (poke a hole in container)
EXPOSE 8081

#Command to run the application
CMD ["java", "-jar", "CICD1Project2023-RegistrationService-0.0.1-SNAPSHOT.jar"]