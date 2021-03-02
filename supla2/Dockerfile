FROM openjdk:11

COPY ./supla2/target/*.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch supla2-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","supla2-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080