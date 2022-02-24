#Base image
FROM openjdk:11
#Adding work directory
WORKDIR /app
#Copping files in the mvn fo
COPY .mvn/ .mvn
#Copping pom file and mvn wrapper to container
COPY mvnw pom.xml ./
#Installing dependency into the image
RUN ./mvnw dependency:go-offline
#Copping source folder to container
COPY src ./src
COPY target/*.jar app.jar
CMD ["./mvnw","clean","package",";","java","-jar","app.jar"]
