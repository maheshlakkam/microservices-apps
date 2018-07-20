FROM openjdk:8-jdk-alpine
VOLUME ./tmp
ADD customer-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT exec java -jar /app.jar customerservice