

FROM openjdk:17-alpine
# Expose port
EXPOSE 8080
# Set a working directory
WORKDIR /app
# Copy the JAR file from your local machine to the image
COPY target/*.jar app.jar
# Start the application
CMD ["java", "-jar", "app.jar"]
