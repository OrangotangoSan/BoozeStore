FROM openjdk:11

COPY /supla3/target/*.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch supla3-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","supla3-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080