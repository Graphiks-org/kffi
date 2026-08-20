# Reproducible X11 binding code-generation environment for kffi-x11.
FROM eclipse-temurin:25-jdk-noble

# On arm64 Docker Desktop, Ubuntu's `_apt` sandbox can report a misleading
# invalid-signature error while invoking gpgv. Signature verification remains
# enabled; only the APT download sandbox is disabled for this build layer.
RUN apt-get -o APT::Sandbox::User=root update \
    && apt-get -o APT::Sandbox::User=root install -y --no-install-recommends \
        clang-18 llvm-18-dev libclang-18-dev \
        libx11-dev libxext-dev libxcomposite-dev libxfixes-dev libxrender-dev \
        libxrandr-dev libxi-dev libxtst-dev libxcursor-dev libxdamage-dev \
        libxinerama-dev \
        gcc libc6-dev patch ca-certificates git \
    && rm -rf /var/lib/apt/lists/*

ENV JDK_HOME=/opt/java/openjdk \
    LLVM_HOME=/usr/lib/llvm-18

WORKDIR /work
