#基于jdk8镜像进行构建，创建的镜像已经配置好java环境
FROM openjdk:8

#上述的pom中配置的JAR_FILE将会传入到该参数
#也可以在这里直接配置　ARG JAR_FILE=/target/web-1.0.jar
#用于配置spingboot应用maven打包生成的jar文件
ARG JAR_FILE

#在镜像中创建一个工作目录
run mkdir /worker

#将jar文件复制到工作目录中
add ${JAR_FILE} /worker

#暴露镜像的端口8452，其他端口不开放
expose 8084

#镜像启动时执行的命令,配置多条仅执行最后一条
#这里配置启动jar文件: java -jar /worker/web-1.0.jar
entrypoint ["java","-jar","/worker/web-1.0.jar"]