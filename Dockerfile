# Use a pinned Eclipse Temurin JDK 17 Alpine image
FROM eclipse-temurin:17.0.10_7-jdk-alpine

# Define the build argument (JAR_FILE) to receive the dynamically generated artifact name
# This value is passed via the --build-arg flag in the GitHub Actions workflow (Step 14)
ARG JAR_FILE

WORKDIR /app

# Copy the actual JAR file (e.g., Lean-DevSecOps-0.0.1-SNAPSHOT.jar) 
# using the JAR_FILE argument, and rename it to a consistent 'app.jar' inside the container.
COPY target/${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]