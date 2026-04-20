# Usa uma imagem do Java 17
FROM eclipse-temurin:17-jdk-alpine
# Define a pasta de trabalho dentro do servidor
WORKDIR /app

# Copia os arquivos do projeto para o servidor
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN chmod +x mvnw

# Baixa as dependências do Maven
RUN ./mvnw dependency:go-offline

# Copia o código fonte
COPY src ./src

# Compila o projeto
RUN ./mvnw clean package -DskipTests

# Roda a aplicação
CMD ["java", "-jar", "target/api-cobrancas-0.0.1-SNAPSHOT.jar"]