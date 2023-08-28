FROM openjdk:11
EXPOSE 9090
ADD target/Reports-Mini-Project.jar Reports-Mini-Project.jar
ENTRYPOINT ["java","-jar","/Reports-Mini-Project.jar"]