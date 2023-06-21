# Use a base image with the desired database software installed
FROM mysql:latest

# Set environment variables
ENV MYSQL_ROOT_PASSWORD=mysecretpassword
ENV MYSQL_DATABASE=mydatabase
ENV MYSQL_USER=myuser
ENV MYSQL_PASSWORD=mypassword

# Copy any initialization scripts to the container
COPY init.sql /docker-entrypoint-initdb.d/

# Expose the default database port
EXPOSE 3306
