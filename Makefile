#!make

SHELL = bash

clean:
	cd ./app/ && \
	mvn clean

run:
	cd ./app/ && \
	mvn clean package; \
    java \
        -Dlog4j.configurationFile=file:log4j2.xml \
        -cp target/app-1.0-SNAPSHOT-jar-with-dependencies.jar \
        com.app.App

compose-up:
	docker-compose up -d

compose-build:
	docker-compose build

compose-down:
	- docker-compose down

compose-logs:
	docker-compose logs

compose-logsf:
	- docker-compose logs	-f

build: compose-build
down: compose-down
up: down compose-up
logs: compose-logs
logsf: compose-logsf