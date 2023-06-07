FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/student-consumer-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} student-consumer.jar
ENTRYPOINT ["java","-jar","student-consumer.jar"]