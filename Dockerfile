FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/funcionarioscadastro-0.0.1-SNAPSHOT.jar /app/funcionarioscadastro.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/funcionarioscadastro.jar"]