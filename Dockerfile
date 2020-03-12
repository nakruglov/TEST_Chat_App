FROM openjdk

ADD target/chat-0.0.1-SNAPSHOT.jar chat-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["sh", "-c", "java  -jar chat-0.0.1-SNAPSHOT.jar"]
