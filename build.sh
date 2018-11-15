#!/usr/bin/env bash
mvn clean package -U -Dmaven.test.skip=true
docker build -t orionhank/bootu-apigateway:latest .
docker push orionhank/bootu-apigateway:latest