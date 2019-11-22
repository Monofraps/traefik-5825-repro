Setup to reproduce https://github.com/containous/traefik/issues/5825

Run `docker-compose up`. It will start a traefik container as well as a java application container. THe application simply executes as many gRPC as fast as possible through the traefik proxy back to itself. The bug reported above is a race condition which is usually triggered within a minute or two.
