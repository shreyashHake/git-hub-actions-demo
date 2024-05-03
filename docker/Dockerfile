FROM openjdk:17-jdk

WORKDIR /app

COPY demo-project-for-github-actions/target/demo-project-for-github-actions-1.0.0.jar /app/demo-project-for-github-actions.jar

EXPOSE 8080

CMD ["java", "-jar", "demo-project-for-github-actions.jar"]