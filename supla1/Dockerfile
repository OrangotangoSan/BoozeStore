FROM openjdk:11

COPY ./supla1/target/*.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch supla1-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","supla1-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080