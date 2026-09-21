cmake_minimum_required(VERSION 3.22.1)
project(kffi_harfbuzz_android LANGUAGES C)

set(FETCHCONTENT_BASE_DIR ${CMAKE_CURRENT_SOURCE_DIR}/../../../.gradle/fetchcontent CACHE PATH "")

include(FetchContent)
FetchContent_Declare(
  harfbuzz
  GIT_REPOSITORY https://github.com/harfbuzz/harfbuzz.git
  GIT_TAG 4c2aa804671d7276e8a0eb95da07202ead05c843
)
set(HB_HAVE_FREETYPE OFF)
set(HB_HAVE_GLIB OFF)
set(HB_HAVE_ICU OFF)
set(HB_HAVE_CAIRO OFF)
set(HB_HAVE_CORETEXT OFF)
set(HB_HAVE_GRAPHITE2 OFF)
set(HB_HAVE_GOBJECT OFF)
set(HB_HAVE_INTROSPECTION OFF)
set(HB_BUILD_UTILS OFF)
set(HB_BUILD_SUBSET OFF)
set(HB_BUILD_RASTER OFF)
set(HB_BUILD_VECTOR OFF)
set(HB_BUILD_GPU OFF)
set(HB_BUILD_GPU_DEMO OFF)
set(BUILD_SHARED_LIBS ON)
FetchContent_MakeAvailable(harfbuzz)
