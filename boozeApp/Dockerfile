FROM openjdk:11

COPY ./boozeApp/target/*.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch boozeApp-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","boozeApp-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080