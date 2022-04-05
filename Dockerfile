FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
ARG PROPERTIES=target/*.properties
COPY ${JAR_FILE} app.jar
COPY ${PROPERTIES} properties.properties
ENTRYPOINT ["java","-jar", "app.jar"]