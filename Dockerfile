# 1. Используем OpenJDK 17 как базовый образ
FROM openjdk:17

# 2. Создаем том (опционально, если нужны временные файлы)
VOLUME /tmp

# 3. Аргумент для указания JAR-файла
# Путь к JAR-файлу, созданному после сборки Maven (скорее всего, в папке target)
ARG JAR_FILE=target/english1-0.0.1-SNAPSHOT.jar

# 4. Копируем JAR в контейнер и называем его app.jar
#COPY ${JAR_FILE} /app.jar
COPY target/english1-0.0.1-SNAPSHOT.jar /app.jar

# 5. Указываем порт, который контейнер будет слушать
EXPOSE 8092

# 6. Запуск приложения
ENTRYPOINT ["java", "-jar", "/app.jar"]


FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/english1-0.0.1-SNAPSHOT.jar
COPY target/english1-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8092
ENTRYPOINT ["java", "-jar", "/app.jar"]








