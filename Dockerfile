FROM openjdk:11-jre-slim
COPY .mvn/wrapper/maven-wrapper.jar /app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]
