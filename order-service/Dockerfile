FROM openjdk:8-jdk-alpine
VOLUME ./tmp
ADD order-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8083
ENTRYPOINT exec java -jar /app.jar orderservice