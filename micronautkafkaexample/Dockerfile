FROM openjdk:14-alpine
COPY build/libs/micronautkafkaexample-*-all.jar micronautkafkaexample.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronautkafkaexample.jar"]