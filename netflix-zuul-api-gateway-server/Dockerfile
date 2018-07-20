FROM openjdk:8-jdk-alpine
VOLUME ./tmp
ADD netflix-zuul-api-gateway-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8086
ENTRYPOINT exec java -jar /app.jar zuulserver