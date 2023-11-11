FROM openjdk:17-alpine

# Expose port
EXPOSE 8080

# Set working directory in the container
WORKDIR /app

# Add the JAR file into the container at /app
COPY target/spring-boot-docker.jar /app/spring-boot-docker-0.0.1-SNAPSHOT.jar


# Start the application
ENTRYPOINT ["java", "-jar", "spring-boot-docker-0.0.1-SNAPSHOT.jar"]

