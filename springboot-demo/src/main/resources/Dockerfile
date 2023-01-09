FROM openjdk:8-jdk-alpine
VOLUME /tmp
#将springboot-k8s-template.jar复制到容器内部 并且别名叫springboot-k8s-template-v1.jar
ADD demo1-0.0.1-SNAPSHOT.jar demo1-0.0.1-SNAPSHOT.jar
#相当于在容器中用cmd命令执行jar包  指定外部配置文件
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo1-0.0.1-SNAPSHOT.jar"]