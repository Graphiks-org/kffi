#define _GNU_SOURCE
#include <errno.h>
#include <fcntl.h>
#include <poll.h>
#include <stdint.h>
#include <sys/eventfd.h>
#include <sys/ipc.h>
#include <sys/mman.h>
#include <sys/shm.h>
#include <unistd.h>
#define KFFI_MAP_FAILED_ADDRESS ((intptr_t) MAP_FAILED)
#define KFFI_SHMAT_FAILED_ADDRESS ((intptr_t) -1)
