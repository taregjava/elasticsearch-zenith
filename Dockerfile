FROM openjdk:17
EXPOSE 8080
ADD target/elasticsearch-k8s-demo.jar elasticsearch-k8s-demo.jar
ENTRYPOINT ["java","-jar","/elasticsearch-k8s-demo.jar"]

