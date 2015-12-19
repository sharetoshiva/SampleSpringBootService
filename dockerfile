FROM java:8
VOLUME /tmp		
ADD https://storage.googleapis.com/ic-jenkins-apps/IncatalystSpringBootService-1.2.5.RELEASE.jar  springboot.jar
RUN bash -c 'touch springboot.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","springboot.jar"]
	