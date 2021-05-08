FROM openjdk:13
VOLUME c:/tmp
ADD ./target/servicio-oauth-0.0.1-SNAPSHOT.jar servicio-oauth.jar
ENTRYPOINT ["java", "-jar", "/servicio-oauth.jar"]