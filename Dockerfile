# Define a imagem base a partir da qual o contêiner será construído.
FROM openjdk:17-jdk-slim-buster

# Define o diretório de trabalho dentro do contêiner como /app.
WORKDIR /app

# Copia o arquivo JAR do sistema de arquivos local para o contêiner.
COPY target/projeto-pratico3-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta 8080 para permitir conexões externas.
EXPOSE 8080

# Define o comando padrão a ser executado quando o contêiner for iniciado.
CMD ["java", "-jar", "app.jar"]