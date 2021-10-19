FROM adoptopenjdk/openjdk11
MAINTAINER threadminions

ENV APP_HOME = /opt/spring-boot-apps/docker-app/

RUN mkdir -p $APP_HOME/resources

COPY target/docker-app-1.0-SNAPSHOT.jar $APP_HOME/docker-app-1.0.jar
COPY src/main/resources $APP_HOME/resources

WORKDIR $APP_HOME

CMD ["java", "-jar", "docker-app-1.0.jar", "--spring.config.location=", "classpath:/resources/application.yml"]