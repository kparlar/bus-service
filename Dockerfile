FROM amazoncorretto:21

USER root

# Create app directory
WORKDIR /app

ARG DB_URL

ENV DB_URL=$DB_URL

COPY target/bus-service.jar ./
COPY docker-entrypoint.sh docker-entrypoint.sh

EXPOSE 8180
RUN ["chmod", "+x", "docker-entrypoint.sh"]
ENTRYPOINT ["./docker-entrypoint.sh"]