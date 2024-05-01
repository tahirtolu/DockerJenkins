FROM openjdk:21
ADD target/demo2-0.0.1-SNAPSHOT.jar demo2-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/demo2-0.0.1-SNAPSHOT.jar"]