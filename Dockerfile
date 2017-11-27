FROM ubuntu:latest
VOLUME /tmp
ADD helloworld-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"] 