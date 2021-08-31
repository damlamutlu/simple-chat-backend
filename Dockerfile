FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/project-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} doodle-task-0.1.0.jar
ENTRYPOINT ["java","-jar","/doodle-task-0.1.0.jar"]