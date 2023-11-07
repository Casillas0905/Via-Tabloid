FROM openjdk:17-alpine
#Expose port
EXPOSE 8080
#set dockerfile volume if you want
VOLUME /backend_volume
#add the jar file
ADD /target/*.jar container-example-0.0.1-SNAPSHOT.jar
#start the app
ENTRYPOINT ["java","-jar","/container-example-0.0.1-SNAPSHOT.jar"]
