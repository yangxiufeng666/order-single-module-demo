FROM java:openjdk:8
VOLUME /tmp
## 复制target目录下的jar到docker容器的/目录下，并改名为app.jar， ##
ADD demo.jar app.jar
RUN sh -c 'touch /app.jar'
## 需要设置时区为中国时间
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
## JVM 参数设置可忽略
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c" , "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]