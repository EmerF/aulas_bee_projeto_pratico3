FROM openjdk:17-jdk-slim-buster
LABEL authors="deborah"

ENTRYPOINT ["top", "-b"]

WORKDIR /app

COPY target/projeto-pratico3-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]