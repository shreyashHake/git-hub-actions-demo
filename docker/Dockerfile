# Build stage
FROM maven:3.8.7-openjdk-18 AS build

WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

#Runtime stage
FROM amazoncorretto:17
ARG PROFILE=dev
ARG APP_VERSOIN=1.0.0

WORKDIR /app
COPY --from=build /build/target/demo-project-for-github-actions-*.jar /app/

EXPOSE 8080
ENV JAR_VERSION=${APP_VERSOIN}
CMD java -jar demo-project-for-github-actions-${JAR_VERSION}.jar