# Use a pinned Eclipse Temurin JDK 17 Alpine image
FROM eclipse-temurin:17.0.10_7-jdk-alpine

WORKDIR /app
COPY target/myapp.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]