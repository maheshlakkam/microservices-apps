FROM openjdk:8-jdk-alpine
VOLUME ./tmp
ADD spring-cloud-config-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT exec java -jar /app.jar springcloudconfigserver