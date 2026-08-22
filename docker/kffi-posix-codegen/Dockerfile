# Reproducible Linux POSIX binding code-generation environment for kffi-posix.
FROM eclipse-temurin:25-jdk-noble@sha256:e94f1dc880339ab3884b69176b79c8dc4124b722e059c7ff7f0bf53b603a46f8

# On arm64 Docker Desktop, Ubuntu's `_apt` sandbox can report a misleading
# invalid-signature error while invoking gpgv. Signature verification remains
# enabled; only the APT download sandbox is disabled for this build layer.
RUN apt-get -o APT::Sandbox::User=root update \
    && apt-get -o APT::Sandbox::User=root install -y --no-install-recommends \
        clang-18 llvm-18-dev libclang-18-dev \
        gcc libc6-dev patch ca-certificates git \
    && rm -rf /var/lib/apt/lists/*

ENV JDK_HOME=/opt/java/openjdk \
    LLVM_HOME=/usr/lib/llvm-18

WORKDIR /work
