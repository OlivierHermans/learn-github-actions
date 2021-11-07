FROM openjdk:latest

COPY ./target/learn-github-actions-*-SNAPSHOT.jar learn-github-actions.jar

CMD ["java", "-jar", "learn-github-actions.jar"]
