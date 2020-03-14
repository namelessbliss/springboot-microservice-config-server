FROM openJdk:13
VOLUME /tmp
EXPOSE 8888
ADD ./target/springboot-microservice-config-server-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["JAVA","-jar","/config-server.jar"]