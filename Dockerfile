# Build stage
FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /app
COPY target/myapp.jar app.jar

# Runtime stage (smaller, fewer CVEs)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/app.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]