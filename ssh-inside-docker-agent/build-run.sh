#!/usr/bin/env bash
docker build -t node-with-ssh-client . && docker run --entrypoint "sh" -it  node-with-ssh-client

