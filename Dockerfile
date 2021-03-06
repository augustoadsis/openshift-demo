FROM openjdk:15-jdk-slim

RUN chmod g=u /etc/passwd
ENTRYPOINT [ "uid_entrypoint" ]
USER 1001

COPY target/openshift-demo-0.0.1-SNAPSHOT.jar openshift.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "openshift.jar"]
