FROM openjdk:13
VOLUME c:/tmp
ADD ./target/servicios-0.0.1-SNAPSHOT.jar servicios.jar
ENTRYPOINT ["java", "-jar", "/servicios.jar"]