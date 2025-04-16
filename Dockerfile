# Use a base image with JDK
FROM openjdk:17

# Metadata (optional but good practice)
LABEL maintainer="kshah1025"

# Set the working directory inside the container
WORKDIR /app

# Copy JAR file into the image
COPY target/survey-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
