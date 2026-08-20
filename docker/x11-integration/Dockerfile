FROM eclipse-temurin:25-jdk-noble

RUN apt-get -o APT::Sandbox::User=root update \
    && apt-get -o APT::Sandbox::User=root install -y --no-install-recommends \
        ca-certificates \
        git \
        imagemagick \
        libx11-6 \
        libxcomposite1 \
        libxext6 \
        libxtst6 \
        x11-apps \
        xvfb \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /workspace
ENTRYPOINT ["/workspace/scripts/run-x11-integration.sh"]
