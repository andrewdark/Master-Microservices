FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/accounts-0.0.1-SNAPSHOT.jar /app/accounts-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]