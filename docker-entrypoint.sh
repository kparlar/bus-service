#!/bin/bash
# exit immediately if any command or pipeline returns a non-zero exit status, which usually indicates an error or failure.
set -e

java -jar  bus-service.jar

exec "$@"