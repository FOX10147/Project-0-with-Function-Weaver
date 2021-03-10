FROM postgres
ENV POSTGRES_USER Integrals
ENV POSTGRES_PASSWORD hello
ADD schema.sql /docker-entrypoint-initdb.d
EXPOSE 5432