# --- ステージ1：ビルド環境 ---
# Java 17環境からJava 21環境にアップグレード
FROM maven:3.9.6-eclipse-temurin-21 AS builder

# 作業ディレクトリを作成
WORKDIR /app

# まずpom.xmlをコピーして依存関係をダウンロード（キャッシュを効かせるため）
COPY pom.xml .
RUN mvn dependency:go-offline

# 残りのソースコードをコピー
COPY src ./src

# Mavenでビルドを実行（テストはスキップ）
RUN mvn package -DskipTests

# --- ステージ2：実行環境 ---
# こちらも念のためJava 21環境に合わせる
FROM eclipse-temurin:21-jre-jammy

# 作業ディレクトリを作成
WORKDIR /app

# ビルド環境（builder）から、完成したjarファイルだけをコピーしてくる
COPY --from=builder /app/target/*.jar app.jar

# ポートを指定
EXPOSE 8080

# アプリケーションを起動
ENTRYPOINT ["java", "-jar", "app.jar"]