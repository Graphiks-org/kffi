# Reproducible Linux PipeWire binding code-generation environment for kffi-pipewire.
FROM eclipse-temurin:25-jdk-noble@sha256:e94f1dc880339ab3884b69176b79c8dc4124b722e059c7ff7f0bf53b603a46f8

# On arm64 Docker Desktop, Ubuntu's `_apt` sandbox can report a misleading
# invalid-signature error while invoking gpgv. Signature verification remains
# enabled; only the APT download sandbox is disabled for this build layer.
# libpipewire-0.3-dev ships the pw_* headers plus the SPA tree under
# /usr/include/spa-0.2 (include root kept separate from the pipewire one).
RUN apt-get -o APT::Sandbox::User=root update \
    && apt-get -o APT::Sandbox::User=root install -y --no-install-recommends \
        clang-18 llvm-18-dev libclang-18-dev \
        gcc libc6-dev libpipewire-0.3-dev patch ca-certificates git \
    && rm -rf /var/lib/apt/lists/*

ENV JDK_HOME=/opt/java/openjdk \
    LLVM_HOME=/usr/lib/llvm-18

WORKDIR /work
