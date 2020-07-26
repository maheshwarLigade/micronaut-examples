FROM oracle/graalvm-ce:20.0.0-java8 as graalvm
# For JDK 11
#FROM oracle/graalvm-ce:20.0.0-java11 as graalvm
RUN gu install native-image

COPY . /home/app/helloworld-graal
WORKDIR /home/app/helloworld-graal

RUN native-image --no-server -cp build/libs/helloworld-graal-*-all.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY --from=graalvm /home/app/helloworld-graal/helloworld-graal /app/helloworld-graal
ENTRYPOINT ["/app/helloworld-graal"]
