FROM openjdk:11
RUN groupadd -r spring && useradd -r -gspring spring
WORKDIR /usr/app
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} vendas.jar
#ENTRYPOINT ["java","Xmx512m","-jar","/vendas.jar"]
ENTRYPOINT ["java","-jar","/vendas.jar"]