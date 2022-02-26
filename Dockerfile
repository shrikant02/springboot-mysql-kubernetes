FROM adoptopenjdk/openjdk11:alpine-jre
ADD ./target/springboot-thymeleaf-crud-web-app-0.0.1-SNAPSHOT.jar app.jar 
ENTRYPOINT ["java","-jar","app.jar"]