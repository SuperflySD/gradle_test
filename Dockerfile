FROM gradle:jdk8 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test
EXPOSE 8081
CMD java -jar /home/gradle/src/build/libs/gradle_test-1.jar
