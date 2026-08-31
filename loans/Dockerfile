FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/loans-0.0.1-SNAPSHOT.jar /app/loans.jar

EXPOSE 8090

CMD ["java", "-jar", "loans.jar"]
