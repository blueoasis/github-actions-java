FROM eclipse-temurin:21

EXPOSE 8080

COPY ./build/libs/github-actions-java-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "github-actions-java-1.0-SNAPSHOT.jar"]