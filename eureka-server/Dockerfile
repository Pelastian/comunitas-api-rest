FROM openjdk:13
VOLUME c:/tmp
EXPOSE 8761
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]