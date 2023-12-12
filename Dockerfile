FROM openjdk
WORKDIR / DOCKER
COPY ex.java .
RUN javac ex.java
CMD [ "java","ex" ]