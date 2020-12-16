FROM openjdk:15-jdk-slim
ENV TZ=$TZ
COPY target/openshift-demo-0.0.1-SNAPSHOT.jar openshift.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "openshift.jar"]