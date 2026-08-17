# Benchmark Module README Design

## Context

The repository contains three benchmark modules with different responsibilities:

- `kffi-benchmark-spi` defines the shared multiplatform benchmark model and
  report format.
- `kffi-benchmark-jvm` runs JMH benchmarks against the JVM FFI implementation
  and a compiled C fixture.
- `kffi-benchmark-native` builds and runs a Kotlin/Native benchmark harness on
  macOS using the same fixture through cinterop.

The root README lists these modules and their top-level commands, but a
contributor opening one of the module directories cannot yet understand its
purpose, execution flow, source layout, or limitations without reading the
implementation.

## Goals

- Add an English `README.md` to each of the three benchmark module directories.
- Explain the role of each module and how it fits into the benchmark pipeline.
- Give contributors concrete commands for building, testing, running, and
  exploring each module.
- Identify the important source files, generated outputs, prerequisites, and
  platform-specific constraints.
- Keep the three documents consistent while tailoring the content to each
  module's actual implementation.

## Non-goals

- Do not change benchmark behavior, Gradle configuration, or source code.
- Do not document `kffi-benchmark-android` in this change.
- Do not duplicate the root README's complete KFFI API documentation.
- Do not claim support for platforms or scenarios that the current benchmark
  implementation does not run.
- Do not modify unrelated working-tree changes.

## Chosen Approach

Use one self-contained contributor guide per module. Each README will use the
same high-level structure where applicable:

1. Purpose and position in the benchmark pipeline.
2. What the module contains and does not contain.
3. Prerequisites and platform constraints.
4. Commands to test, build, or run it.
5. How to explore the relevant source files and outputs.
6. Links to the root README and related benchmark modules.

This approach is preferred over minimal stubs because the requested audience is
contributors who need to understand and explore the modules. It is preferred
over a central handbook because each module remains understandable when opened
directly in an IDE or code browser.

## Module README Content

### `kffi-benchmark-spi/README.md`

Describe the module as the shared multiplatform contract and report layer, not
as an executable benchmark runner. Document:

- `BenchmarkAxis` and the measured dimensions: downcalls, upcalls, marshaling,
  and arena allocation.
- `BenchmarkScenario` and its canonical scenario IDs.
- `BenchmarkResult` and `BenchmarkReport.toMarkdown`.
- The common tests that protect report formatting, scenario uniqueness, and
  axis assignment.
- `Model.kt`, `ModelTest.kt`, and `ScenarioTest.kt` as the main exploration
  points.
- The Gradle test command for the JVM target.
- Its consumers: the JVM JMH module and the Native harness.

### `kffi-benchmark-jvm/README.md`

Describe the module as the JMH-based JVM benchmark runner. Document:

- The benchmark areas covered by `DowncallBenchmarks`, `UpcallBenchmarks`,
  `MarshalingBenchmarks`, `ArenaBenchmarks`, and
  `DowncallEngineBakeoff`.
- The C fixture functions and why the fixture is compiled as a shared library
  before the JMH run.
- JDK/toolchain expectations from the build, including the JVM 24 target and
  JDK 25 toolchain, plus a C compiler on macOS/Linux.
- The main `:kffi-benchmark-jvm:jmh` command and the
  `kffi.benchFixture.hostForTest` override.
- The configured JMH warmup, measurement, fork, and JSON result settings.
- `FixtureLoader.kt` and `JmhJsonToMarkdown.kt` as exploration points.
- The converter's required arguments and its generated Markdown/JSON result
  naming convention.
- The relationship with the shared SPI and Native fixture source.

### `kffi-benchmark-native/README.md`

Describe the module as the Kotlin/Native macOS harness, not a JMH suite.
Document:

- Current target support for `macosArm64` and `macosX64`.
- The flow from compiling the C fixture, archiving it, running cinterop, and
  linking the `benchmark` executable.
- Host architecture selection in `runBenchmarkNative`.
- The `:kffi-benchmark-native:runBenchmarkNative` command and target-specific
  compile commands.
- `NativeHarness.kt` and `src/nativeInterop/cinterop/benchFixture.def` as the
  primary exploration points.
- The current Native scenario coverage and Markdown output through
  `BenchmarkReport`.
- The documented but non-default unsafe comparison path, which requires
  rebuilding KFFI with the compile-time `KFFI_NATIVE_UNSAFE` setting.

## Navigation and Scope

Each README will link to:

- The repository root README for overall KFFI architecture and shared commands.
- The other two benchmark module READMEs where the pipeline crosses module
  boundaries.
- The relevant source files using repository-relative links.

Only these three README files will be added, plus this design document. The
existing root README and unrelated uncommitted files will be left untouched.

## Validation

Before considering the documentation complete:

- Verify each README's commands against the corresponding Gradle task names.
- Check that all repository-relative links resolve to existing files.
- Check that descriptions match the current build scripts and source behavior.
- Run the lightweight SPI test task and, on the available macOS host, the JVM
  and Native benchmark commands when practical.
- Inspect the final diff to confirm that only the three module READMEs and the
  approved design document are included in the change.
