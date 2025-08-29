# --- ステージ1：ビルド環境 ---
# Maven（ビルドツール）とJava 17（JDK）を含むイメージを土台にする
FROM maven:3.8.5-openjdk-17 AS builder

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
# Javaを実行するだけの軽量なイメージを土台にする
FROM eclipse-temurin:17-jre-jammy

# 作業ディレクトリを作成
WORKDIR /app

# ビルド環境（builder）から、完成したjarファイルだけをコピーしてくる
COPY --from=builder /app/target/*.jar app.jar

# ポートを指定
EXPOSE 8080

# アプリケーションを起動
ENTRYPOINT ["java", "-jar", "app.jar"]