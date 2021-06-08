FROM tomcat:8.0.51-jre8-alpine
ADD target/decadevs-docker-adedotun.jar decadevs-docker-adedotun.jar
ENTRYPOINT ["java", "-jar", "decadevs-docker-adedotun.jar"]
