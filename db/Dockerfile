FROM alpine/git AS clone
WORKDIR /repo
RUN git clone --depth=1 https://github.com/credativ/omdb-postgresql omdb

FROM postgres:14
COPY --from=clone --chown=postgres:postgres /repo .
WORKDIR /omdb
RUN apt-get update -y && apt-get install -y wget bzip2 && rm -rf /var/lib/apt/lists/*
RUN ./download
COPY init-omdb.sh /docker-entrypoint-initdb.d/init-omdb.sh
