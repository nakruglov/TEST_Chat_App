Запуск команд производится из корневой папки проекта.
1. Выполнить команду: mvn package
2. Запустить контейнер командой: docker-compose build затем docker-compose up
3. Для запуса приложения выполнить команду: java  -jar target/chat-0.0.1-SNAPSHOT.jar

Окно чата открывается по адресу: localhost:8080