FROM mcr.microsoft.com/devcontainers/java

# Install the xz-utils package
RUN apt-get update && apt-get install -y xz-utils

RUN curl -fL "https://github.com/coursier/launchers/raw/master/cs-x86_64-pc-linux.gz" | gzip -d > cs && \
    chmod +x cs && \
    ./cs setup --yes

 