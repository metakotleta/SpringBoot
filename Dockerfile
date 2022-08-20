FROM khipu/openjdk17-alpine

EXPOSE 8080:8080

COPY target/SpringBoot-0.0.1-SNAPSHOT.jar spring-boot.jar

CMD ["java", "-jar", "spring-boot.jar"]