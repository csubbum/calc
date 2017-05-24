FROM openjdk:8

VOLUME /tmp

ADD build/libs/calculator-1.0.0.jar /app.jar

# Expose ports.
EXPOSE 5000

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom \
                     -Dserver.port=5000 \
                     -Denvironment=$env \
                     -jar /app.jar