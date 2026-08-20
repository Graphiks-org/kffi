FROM eclipse-temurin:25-jdk-noble

RUN apt-get -o APT::Sandbox::User=root update \
    && apt-get -o APT::Sandbox::User=root install -y --no-install-recommends \
        ca-certificates \
        git \
        grim \
        libwayland-bin \
        libwayland-client0 \
        libwayland-cursor0 \
        libwayland-egl1 \
        libwayland-server0 \
        sway \
        unzip \
        wayland-protocols \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /workspace
ENTRYPOINT ["/workspace/scripts/run-wayland-integration.sh"]
