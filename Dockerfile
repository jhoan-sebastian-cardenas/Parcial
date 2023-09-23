FROM maven:3.8.5-openjdk:17 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests \
#======================================================
From openjdk:17-jdk-slim
COPY --from=build /target/parcial-0.0.1-SNAPSHOT.jar parcial.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","parcial.jar"]