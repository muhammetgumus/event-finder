FROM openjdk:11
COPY . /usr/src/finderApp
WORKDIR /usr/src/finderApp
COPY target/finder-0.0.1-SNAPSHOT.jar finder-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","finder-0.0.1-SNAPSHOT.jar"]