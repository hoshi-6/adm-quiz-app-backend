# Java 17環境をベースにする
FROM eclipse-temurin:17-jdk-jammy

# ビルドされたjarファイルをコンテナにコピーする
COPY target/*.jar app.jar

# アプリケーションが使用するポートを指定する
EXPOSE 8080

# コンテナ起動時にjarファイルを実行する
ENTRYPOINT ["java","-jar","/app.jar"]