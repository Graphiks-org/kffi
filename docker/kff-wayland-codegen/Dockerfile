# Wayland binding code-generation environment for kff-wayland.
#
# The image keeps the Linux-only toolchain out of the Gradle build while making
# regeneration reproducible from macOS, Linux, or CI:
#
#   wayland-scanner  protocol XML → C client headers
#   kextract         C headers → Kotlin Panama FFM bindings
#   ProtocolInterfaceGenerator.java → wl_interface descriptors

FROM eclipse-temurin:25-jdk-noble

RUN apt-get update && apt-get install -y --no-install-recommends \
        clang-18 llvm-18-dev libclang-18-dev \
        libwayland-bin libwayland-dev wayland-protocols \
        gcc libc6-dev patch ca-certificates \
    && rm -rf /var/lib/apt/lists/*

# The XML-to-Kotlin generator has no external dependencies.
WORKDIR /build
COPY ProtocolInterfaceGenerator.java .
RUN javac ProtocolInterfaceGenerator.java

ENV JDK_HOME=/opt/java/openjdk \
    LLVM_HOME=/usr/lib/llvm-18

WORKDIR /work
