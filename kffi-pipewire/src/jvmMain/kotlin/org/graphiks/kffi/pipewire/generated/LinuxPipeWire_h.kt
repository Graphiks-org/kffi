package org.graphiks.kffi.pipewire.generated

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

private object kextract_runtime {
    val C_BOOL: ValueLayout = ValueLayout.JAVA_BOOLEAN
    val C_CHAR: ValueLayout = ValueLayout.JAVA_BYTE
    val C_SHORT: ValueLayout = ValueLayout.JAVA_SHORT
    val C_INT: ValueLayout = ValueLayout.JAVA_INT
    val C_LONG: ValueLayout = ValueLayout.JAVA_LONG
    val C_LONG_LONG: ValueLayout = ValueLayout.JAVA_LONG
    val C_FLOAT: ValueLayout = ValueLayout.JAVA_FLOAT
    val C_DOUBLE: ValueLayout = ValueLayout.JAVA_DOUBLE
    val C_POINTER: ValueLayout = ValueLayout.ADDRESS
}

private val LOOKUP: SymbolLookup = run {
    var lu: SymbolLookup = SymbolLookup.loaderLookup()
    lu = SymbolLookup.libraryLookup("libpipewire-0.3.so.0", Arena.global()).or(lu)
    lu
}

/**
 * {@snippet lang=c : typedef Long int64_t;}
 */
typealias int64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uint64_t;}
 */
typealias uint64_t = Long

/**
 * {@snippet lang=c : typedef Long int_least64_t;}
 */
typealias int_least64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uint_least64_t;}
 */
typealias uint_least64_t = Long

/**
 * {@snippet lang=c : typedef Long int_fast64_t;}
 */
typealias int_fast64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uint_fast64_t;}
 */
typealias uint_fast64_t = Long

/**
 * {@snippet lang=c : typedef Int int32_t;}
 */
typealias int32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint32_t;}
 */
typealias uint32_t = Int

/**
 * {@snippet lang=c : typedef Int int_least32_t;}
 */
typealias int_least32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint_least32_t;}
 */
typealias uint_least32_t = Int

/**
 * {@snippet lang=c : typedef Int int_fast32_t;}
 */
typealias int_fast32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint_fast32_t;}
 */
typealias uint_fast32_t = Int

/**
 * {@snippet lang=c : typedef Short int16_t;}
 */
typealias int16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint16_t;}
 */
typealias uint16_t = Short

/**
 * {@snippet lang=c : typedef Short int_least16_t;}
 */
typealias int_least16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint_least16_t;}
 */
typealias uint_least16_t = Short

/**
 * {@snippet lang=c : typedef Short int_fast16_t;}
 */
typealias int_fast16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint_fast16_t;}
 */
typealias uint_fast16_t = Short

/**
 * {@snippet lang=c : typedef SIGNED = Char int8_t;}
 */
typealias int8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint8_t;}
 */
typealias uint8_t = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char int_least8_t;}
 */
typealias int_least8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint_least8_t;}
 */
typealias uint_least8_t = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char int_fast8_t;}
 */
typealias int_fast8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint_fast8_t;}
 */
typealias uint_fast8_t = Byte

/**
 * {@snippet lang=c : typedef Long intptr_t;}
 */
typealias intptr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uintptr_t;}
 */
typealias uintptr_t = Long

/**
 * {@snippet lang=c : typedef Long intmax_t;}
 */
typealias intmax_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uintmax_t;}
 */
typealias uintmax_t = Long

/**
 * {@snippet lang=c : typedef Int __gwchar_t;}
 */
typealias _gwchar_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char __u_char;}
 */
typealias _u_char = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __u_short;}
 */
typealias _u_short = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __u_int;}
 */
typealias _u_int = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __u_long;}
 */
typealias _u_long = Long

/**
 * {@snippet lang=c : typedef SIGNED = Char __int8_t;}
 */
typealias _int8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char __uint8_t;}
 */
typealias _uint8_t = Byte

/**
 * {@snippet lang=c : typedef Short __int16_t;}
 */
typealias _int16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __uint16_t;}
 */
typealias _uint16_t = Short

/**
 * {@snippet lang=c : typedef Int __int32_t;}
 */
typealias _int32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __uint32_t;}
 */
typealias _uint32_t = Int

/**
 * {@snippet lang=c : typedef Long __int64_t;}
 */
typealias _int64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __uint64_t;}
 */
typealias _uint64_t = Long

/**
 * {@snippet lang=c : typedef Long __quad_t;}
 */
typealias _quad_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __u_quad_t;}
 */
typealias _u_quad_t = Long

/**
 * {@snippet lang=c : typedef Long __intmax_t;}
 */
typealias _intmax_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __uintmax_t;}
 */
typealias _uintmax_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __dev_t;}
 */
typealias _dev_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __uid_t;}
 */
typealias _uid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __gid_t;}
 */
typealias _gid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __ino_t;}
 */
typealias _ino_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __ino64_t;}
 */
typealias _ino64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __mode_t;}
 */
typealias _mode_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __nlink_t;}
 */
typealias _nlink_t = Long

/**
 * {@snippet lang=c : typedef Long __off_t;}
 */
typealias _off_t = Long

/**
 * {@snippet lang=c : typedef Long __off64_t;}
 */
typealias _off64_t = Long

/**
 * {@snippet lang=c : typedef Int __pid_t;}
 */
typealias _pid_t = Int

/**
 * {@snippet lang=c : typedef Long __clock_t;}
 */
typealias _clock_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __rlim_t;}
 */
typealias _rlim_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __rlim64_t;}
 */
typealias _rlim64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __id_t;}
 */
typealias _id_t = Int

/**
 * {@snippet lang=c : typedef Long __time_t;}
 */
typealias _time_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __useconds_t;}
 */
typealias _useconds_t = Int

/**
 * {@snippet lang=c : typedef Long __suseconds_t;}
 */
typealias _suseconds_t = Long

/**
 * {@snippet lang=c : typedef Long __suseconds64_t;}
 */
typealias _suseconds64_t = Long

/**
 * {@snippet lang=c : typedef Int __daddr_t;}
 */
typealias _daddr_t = Int

/**
 * {@snippet lang=c : typedef Int __key_t;}
 */
typealias _key_t = Int

/**
 * {@snippet lang=c : typedef Int __clockid_t;}
 */
typealias _clockid_t = Int

/**
 * {@snippet lang=c : typedef Long __blksize_t;}
 */
typealias _blksize_t = Long

/**
 * {@snippet lang=c : typedef Long __blkcnt_t;}
 */
typealias _blkcnt_t = Long

/**
 * {@snippet lang=c : typedef Long __blkcnt64_t;}
 */
typealias _blkcnt64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __fsblkcnt_t;}
 */
typealias _fsblkcnt_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __fsblkcnt64_t;}
 */
typealias _fsblkcnt64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __fsfilcnt_t;}
 */
typealias _fsfilcnt_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __fsfilcnt64_t;}
 */
typealias _fsfilcnt64_t = Long

/**
 * {@snippet lang=c : typedef Long __fsword_t;}
 */
typealias _fsword_t = Long

/**
 * {@snippet lang=c : typedef Long __ssize_t;}
 */
typealias _ssize_t = Long

/**
 * {@snippet lang=c : typedef Long __syscall_slong_t;}
 */
typealias _syscall_slong_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __syscall_ulong_t;}
 */
typealias _syscall_ulong_t = Long

/**
 * {@snippet lang=c : typedef Long __loff_t;}
 */
typealias _loff_t = Long

/**
 * {@snippet lang=c : typedef Long __intptr_t;}
 */
typealias _intptr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __socklen_t;}
 */
typealias _socklen_t = Int

/**
 * {@snippet lang=c : typedef Int __sig_atomic_t;}
 */
typealias _sig_atomic_t = Int

/**
 * {@snippet lang=c : typedef Int sig_atomic_t;}
 */
typealias sig_atomic_t = Int

/**
 * {@snippet lang=c : typedef Int pid_t;}
 */
typealias pid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uid_t;}
 */
typealias uid_t = Int

/**
 * {@snippet lang=c : typedef Long time_t;}
 */
typealias time_t = Long

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/siginfo-consts.h:35:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_35_1_(val value: Long) {
    SI_ASYNCNL(-60L), SI_DETHREAD(-7L), SI_TKILL(-6L), SI_SIGIO(-5L), SI_ASYNCIO(-4L), SI_MESGQ(-3L), SI_TIMER(-2L), SI_QUEUE(-1L), SI_USER(0L), SI_KERNEL(128L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_35_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_35_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/siginfo-consts.h:71:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_71_1_(val value: Long) {
    ILL_ILLOPC(1L), ILL_ILLOPN(2L), ILL_ILLADR(3L), ILL_ILLTRP(4L), ILL_PRVOPC(5L), ILL_PRVREG(6L), ILL_COPROC(7L), ILL_BADSTK(8L), ILL_BADIADDR(9L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_71_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_71_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/siginfo-consts.h:94:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_94_1_(val value: Long) {
    FPE_INTDIV(1L), FPE_INTOVF(2L), FPE_FLTDIV(3L), FPE_FLTOVF(4L), FPE_FLTUND(5L), FPE_FLTRES(6L), FPE_FLTINV(7L), FPE_FLTSUB(8L), FPE_FLTUNK(14L), FPE_CONDTRAP(15L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_94_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_94_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/siginfo-consts.h:119:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_119_1_(val value: Long) {
    SEGV_MAPERR(1L), SEGV_ACCERR(2L), SEGV_BNDERR(3L), SEGV_PKUERR(4L), SEGV_ACCADI(5L), SEGV_ADIDERR(6L), SEGV_ADIPERR(7L), SEGV_MTEAERR(8L), SEGV_MTESERR(9L), SEGV_CPERR(10L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_119_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_119_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/siginfo-consts.h:144:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_144_1_(val value: Long) {
    BUS_ADRALN(1L), BUS_ADRERR(2L), BUS_OBJERR(3L), BUS_MCEERR_AR(4L), BUS_MCEERR_AO(5L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_144_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_144_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/siginfo-consts.h:161:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_161_1_(val value: Long) {
    TRAP_BRKPT(1L), TRAP_TRACE(2L), TRAP_BRANCH(3L), TRAP_HWBKPT(4L), TRAP_UNK(5L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_161_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_161_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/siginfo-consts.h:178:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_178_1_(val value: Long) {
    CLD_EXITED(1L), CLD_KILLED(2L), CLD_DUMPED(3L), CLD_TRAPPED(4L), CLD_STOPPED(5L), CLD_CONTINUED(6L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_178_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_178_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/siginfo-consts.h:195:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_195_1_(val value: Long) {
    POLL_IN(1L), POLL_OUT(2L), POLL_MSG(3L), POLL_ERR(4L), POLL_PRI(5L), POLL_HUP(6L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_195_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_siginfo_consts_h_195_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/sigevent-consts.h:27:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_sigevent_consts_h_27_1_(val value: Long) {
    SIGEV_SIGNAL(0L), SIGEV_NONE(1L), SIGEV_THREAD(2L), SIGEV_THREAD_ID(4L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_sigevent_consts_h_27_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_sigevent_consts_h_27_1_ value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long size_t;}
 */
typealias size_t = Long

/**
 * {@snippet lang=c : typedef LongLong greg_t;}
 */
typealias greg_t = Long

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/sys/ucontext.h:50:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_sys_ucontext_h_50_1_(val value: Long) {
    REG_R8(0L), REG_R9(1L), REG_R10(2L), REG_R11(3L), REG_R12(4L), REG_R13(5L), REG_R14(6L), REG_R15(7L), REG_RDI(8L), REG_RSI(9L), REG_RBP(10L), REG_RBX(11L), REG_RDX(12L), REG_RAX(13L), REG_RCX(14L), REG_RSP(15L), REG_RIP(16L), REG_EFL(17L), REG_CSGSFS(18L), REG_ERR(19L), REG_TRAPNO(20L), REG_OLDMASK(21L), REG_CR2(22L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_sys_ucontext_h_50_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_sys_ucontext_h_50_1_ value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Long ssize_t;}
 */
typealias ssize_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int gid_t;}
 */
typealias gid_t = Int

/**
 * {@snippet lang=c : typedef Long off_t;}
 */
typealias off_t = Long

/**
 * {@snippet lang=c : typedef Long off64_t;}
 */
typealias off64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int useconds_t;}
 */
typealias useconds_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int socklen_t;}
 */
typealias socklen_t = Int

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/confname.h:24:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_24_1_(val value: Long) {
    _PC_LINK_MAX(0L), _PC_MAX_CANON(1L), _PC_MAX_INPUT(2L), _PC_NAME_MAX(3L), _PC_PATH_MAX(4L), _PC_PIPE_BUF(5L), _PC_CHOWN_RESTRICTED(6L), _PC_NO_TRUNC(7L), _PC_VDISABLE(8L), _PC_SYNC_IO(9L), _PC_ASYNC_IO(10L), _PC_PRIO_IO(11L), _PC_SOCK_MAXBUF(12L), _PC_FILESIZEBITS(13L), _PC_REC_INCR_XFER_SIZE(14L), _PC_REC_MAX_XFER_SIZE(15L), _PC_REC_MIN_XFER_SIZE(16L), _PC_REC_XFER_ALIGN(17L), _PC_ALLOC_SIZE_MIN(18L), _PC_SYMLINK_MAX(19L), _PC_2_SYMLINKS(20L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_24_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_24_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/confname.h:71:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_71_1_(val value: Long) {
    _SC_ARG_MAX(0L), _SC_CHILD_MAX(1L), _SC_CLK_TCK(2L), _SC_NGROUPS_MAX(3L), _SC_OPEN_MAX(4L), _SC_STREAM_MAX(5L), _SC_TZNAME_MAX(6L), _SC_JOB_CONTROL(7L), _SC_SAVED_IDS(8L), _SC_REALTIME_SIGNALS(9L), _SC_PRIORITY_SCHEDULING(10L), _SC_TIMERS(11L), _SC_ASYNCHRONOUS_IO(12L), _SC_PRIORITIZED_IO(13L), _SC_SYNCHRONIZED_IO(14L), _SC_FSYNC(15L), _SC_MAPPED_FILES(16L), _SC_MEMLOCK(17L), _SC_MEMLOCK_RANGE(18L), _SC_MEMORY_PROTECTION(19L), _SC_MESSAGE_PASSING(20L), _SC_SEMAPHORES(21L), _SC_SHARED_MEMORY_OBJECTS(22L), _SC_AIO_LISTIO_MAX(23L), _SC_AIO_MAX(24L), _SC_AIO_PRIO_DELTA_MAX(25L), _SC_DELAYTIMER_MAX(26L), _SC_MQ_OPEN_MAX(27L), _SC_MQ_PRIO_MAX(28L), _SC_VERSION(29L), _SC_PAGESIZE(30L), _SC_RTSIG_MAX(31L), _SC_SEM_NSEMS_MAX(32L), _SC_SEM_VALUE_MAX(33L), _SC_SIGQUEUE_MAX(34L), _SC_TIMER_MAX(35L), _SC_BC_BASE_MAX(36L), _SC_BC_DIM_MAX(37L), _SC_BC_SCALE_MAX(38L), _SC_BC_STRING_MAX(39L), _SC_COLL_WEIGHTS_MAX(40L), _SC_EQUIV_CLASS_MAX(41L), _SC_EXPR_NEST_MAX(42L), _SC_LINE_MAX(43L), _SC_RE_DUP_MAX(44L), _SC_CHARCLASS_NAME_MAX(45L), _SC_2_VERSION(46L), _SC_2_C_BIND(47L), _SC_2_C_DEV(48L), _SC_2_FORT_DEV(49L), _SC_2_FORT_RUN(50L), _SC_2_SW_DEV(51L), _SC_2_LOCALEDEF(52L), _SC_PII(53L), _SC_PII_XTI(54L), _SC_PII_SOCKET(55L), _SC_PII_INTERNET(56L), _SC_PII_OSI(57L), _SC_POLL(58L), _SC_SELECT(59L), _SC_UIO_MAXIOV(60L), _SC_IOV_MAX(60L), _SC_PII_INTERNET_STREAM(61L), _SC_PII_INTERNET_DGRAM(62L), _SC_PII_OSI_COTS(63L), _SC_PII_OSI_CLTS(64L), _SC_PII_OSI_M(65L), _SC_T_IOV_MAX(66L), _SC_THREADS(67L), _SC_THREAD_SAFE_FUNCTIONS(68L), _SC_GETGR_R_SIZE_MAX(69L), _SC_GETPW_R_SIZE_MAX(70L), _SC_LOGIN_NAME_MAX(71L), _SC_TTY_NAME_MAX(72L), _SC_THREAD_DESTRUCTOR_ITERATIONS(73L), _SC_THREAD_KEYS_MAX(74L), _SC_THREAD_STACK_MIN(75L), _SC_THREAD_THREADS_MAX(76L), _SC_THREAD_ATTR_STACKADDR(77L), _SC_THREAD_ATTR_STACKSIZE(78L), _SC_THREAD_PRIORITY_SCHEDULING(79L), _SC_THREAD_PRIO_INHERIT(80L), _SC_THREAD_PRIO_PROTECT(81L), _SC_THREAD_PROCESS_SHARED(82L), _SC_NPROCESSORS_CONF(83L), _SC_NPROCESSORS_ONLN(84L), _SC_PHYS_PAGES(85L), _SC_AVPHYS_PAGES(86L), _SC_ATEXIT_MAX(87L), _SC_PASS_MAX(88L), _SC_XOPEN_VERSION(89L), _SC_XOPEN_XCU_VERSION(90L), _SC_XOPEN_UNIX(91L), _SC_XOPEN_CRYPT(92L), _SC_XOPEN_ENH_I18N(93L), _SC_XOPEN_SHM(94L), _SC_2_CHAR_TERM(95L), _SC_2_C_VERSION(96L), _SC_2_UPE(97L), _SC_XOPEN_XPG2(98L), _SC_XOPEN_XPG3(99L), _SC_XOPEN_XPG4(100L), _SC_CHAR_BIT(101L), _SC_CHAR_MAX(102L), _SC_CHAR_MIN(103L), _SC_INT_MAX(104L), _SC_INT_MIN(105L), _SC_LONG_BIT(106L), _SC_WORD_BIT(107L), _SC_MB_LEN_MAX(108L), _SC_NZERO(109L), _SC_SSIZE_MAX(110L), _SC_SCHAR_MAX(111L), _SC_SCHAR_MIN(112L), _SC_SHRT_MAX(113L), _SC_SHRT_MIN(114L), _SC_UCHAR_MAX(115L), _SC_UINT_MAX(116L), _SC_ULONG_MAX(117L), _SC_USHRT_MAX(118L), _SC_NL_ARGMAX(119L), _SC_NL_LANGMAX(120L), _SC_NL_MSGMAX(121L), _SC_NL_NMAX(122L), _SC_NL_SETMAX(123L), _SC_NL_TEXTMAX(124L), _SC_XBS5_ILP32_OFF32(125L), _SC_XBS5_ILP32_OFFBIG(126L), _SC_XBS5_LP64_OFF64(127L), _SC_XBS5_LPBIG_OFFBIG(128L), _SC_XOPEN_LEGACY(129L), _SC_XOPEN_REALTIME(130L), _SC_XOPEN_REALTIME_THREADS(131L), _SC_ADVISORY_INFO(132L), _SC_BARRIERS(133L), _SC_BASE(134L), _SC_C_LANG_SUPPORT(135L), _SC_C_LANG_SUPPORT_R(136L), _SC_CLOCK_SELECTION(137L), _SC_CPUTIME(138L), _SC_THREAD_CPUTIME(139L), _SC_DEVICE_IO(140L), _SC_DEVICE_SPECIFIC(141L), _SC_DEVICE_SPECIFIC_R(142L), _SC_FD_MGMT(143L), _SC_FIFO(144L), _SC_PIPE(145L), _SC_FILE_ATTRIBUTES(146L), _SC_FILE_LOCKING(147L), _SC_FILE_SYSTEM(148L), _SC_MONOTONIC_CLOCK(149L), _SC_MULTI_PROCESS(150L), _SC_SINGLE_PROCESS(151L), _SC_NETWORKING(152L), _SC_READER_WRITER_LOCKS(153L), _SC_SPIN_LOCKS(154L), _SC_REGEXP(155L), _SC_REGEX_VERSION(156L), _SC_SHELL(157L), _SC_SIGNALS(158L), _SC_SPAWN(159L), _SC_SPORADIC_SERVER(160L), _SC_THREAD_SPORADIC_SERVER(161L), _SC_SYSTEM_DATABASE(162L), _SC_SYSTEM_DATABASE_R(163L), _SC_TIMEOUTS(164L), _SC_TYPED_MEMORY_OBJECTS(165L), _SC_USER_GROUPS(166L), _SC_USER_GROUPS_R(167L), _SC_2_PBS(168L), _SC_2_PBS_ACCOUNTING(169L), _SC_2_PBS_LOCATE(170L), _SC_2_PBS_MESSAGE(171L), _SC_2_PBS_TRACK(172L), _SC_SYMLOOP_MAX(173L), _SC_STREAMS(174L), _SC_2_PBS_CHECKPOINT(175L), _SC_V6_ILP32_OFF32(176L), _SC_V6_ILP32_OFFBIG(177L), _SC_V6_LP64_OFF64(178L), _SC_V6_LPBIG_OFFBIG(179L), _SC_HOST_NAME_MAX(180L), _SC_TRACE(181L), _SC_TRACE_EVENT_FILTER(182L), _SC_TRACE_INHERIT(183L), _SC_TRACE_LOG(184L), _SC_LEVEL1_ICACHE_SIZE(185L), _SC_LEVEL1_ICACHE_ASSOC(186L), _SC_LEVEL1_ICACHE_LINESIZE(187L), _SC_LEVEL1_DCACHE_SIZE(188L), _SC_LEVEL1_DCACHE_ASSOC(189L), _SC_LEVEL1_DCACHE_LINESIZE(190L), _SC_LEVEL2_CACHE_SIZE(191L), _SC_LEVEL2_CACHE_ASSOC(192L), _SC_LEVEL2_CACHE_LINESIZE(193L), _SC_LEVEL3_CACHE_SIZE(194L), _SC_LEVEL3_CACHE_ASSOC(195L), _SC_LEVEL3_CACHE_LINESIZE(196L), _SC_LEVEL4_CACHE_SIZE(197L), _SC_LEVEL4_CACHE_ASSOC(198L), _SC_LEVEL4_CACHE_LINESIZE(199L), _SC_IPV6(235L), _SC_RAW_SOCKETS(236L), _SC_V7_ILP32_OFF32(237L), _SC_V7_ILP32_OFFBIG(238L), _SC_V7_LP64_OFF64(239L), _SC_V7_LPBIG_OFFBIG(240L), _SC_SS_REPL_MAX(241L), _SC_TRACE_EVENT_NAME_MAX(242L), _SC_TRACE_NAME_MAX(243L), _SC_TRACE_SYS_MAX(244L), _SC_TRACE_USER_EVENT_MAX(245L), _SC_XOPEN_STREAMS(246L), _SC_THREAD_ROBUST_PRIO_INHERIT(247L), _SC_THREAD_ROBUST_PRIO_PROTECT(248L), _SC_MINSIGSTKSZ(249L), _SC_SIGSTKSZ(250L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_71_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_71_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/confname.h:539:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_539_1_(val value: Long) {
    _CS_PATH(0L), _CS_V6_WIDTH_RESTRICTED_ENVS(1L), _CS_GNU_LIBC_VERSION(2L), _CS_GNU_LIBPTHREAD_VERSION(3L), _CS_V5_WIDTH_RESTRICTED_ENVS(4L), _CS_V7_WIDTH_RESTRICTED_ENVS(5L), _CS_LFS_CFLAGS(1000L), _CS_LFS_LDFLAGS(1001L), _CS_LFS_LIBS(1002L), _CS_LFS_LINTFLAGS(1003L), _CS_LFS64_CFLAGS(1004L), _CS_LFS64_LDFLAGS(1005L), _CS_LFS64_LIBS(1006L), _CS_LFS64_LINTFLAGS(1007L), _CS_XBS5_ILP32_OFF32_CFLAGS(1100L), _CS_XBS5_ILP32_OFF32_LDFLAGS(1101L), _CS_XBS5_ILP32_OFF32_LIBS(1102L), _CS_XBS5_ILP32_OFF32_LINTFLAGS(1103L), _CS_XBS5_ILP32_OFFBIG_CFLAGS(1104L), _CS_XBS5_ILP32_OFFBIG_LDFLAGS(1105L), _CS_XBS5_ILP32_OFFBIG_LIBS(1106L), _CS_XBS5_ILP32_OFFBIG_LINTFLAGS(1107L), _CS_XBS5_LP64_OFF64_CFLAGS(1108L), _CS_XBS5_LP64_OFF64_LDFLAGS(1109L), _CS_XBS5_LP64_OFF64_LIBS(1110L), _CS_XBS5_LP64_OFF64_LINTFLAGS(1111L), _CS_XBS5_LPBIG_OFFBIG_CFLAGS(1112L), _CS_XBS5_LPBIG_OFFBIG_LDFLAGS(1113L), _CS_XBS5_LPBIG_OFFBIG_LIBS(1114L), _CS_XBS5_LPBIG_OFFBIG_LINTFLAGS(1115L), _CS_POSIX_V6_ILP32_OFF32_CFLAGS(1116L), _CS_POSIX_V6_ILP32_OFF32_LDFLAGS(1117L), _CS_POSIX_V6_ILP32_OFF32_LIBS(1118L), _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS(1119L), _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS(1120L), _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS(1121L), _CS_POSIX_V6_ILP32_OFFBIG_LIBS(1122L), _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS(1123L), _CS_POSIX_V6_LP64_OFF64_CFLAGS(1124L), _CS_POSIX_V6_LP64_OFF64_LDFLAGS(1125L), _CS_POSIX_V6_LP64_OFF64_LIBS(1126L), _CS_POSIX_V6_LP64_OFF64_LINTFLAGS(1127L), _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS(1128L), _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS(1129L), _CS_POSIX_V6_LPBIG_OFFBIG_LIBS(1130L), _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS(1131L), _CS_POSIX_V7_ILP32_OFF32_CFLAGS(1132L), _CS_POSIX_V7_ILP32_OFF32_LDFLAGS(1133L), _CS_POSIX_V7_ILP32_OFF32_LIBS(1134L), _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS(1135L), _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS(1136L), _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS(1137L), _CS_POSIX_V7_ILP32_OFFBIG_LIBS(1138L), _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS(1139L), _CS_POSIX_V7_LP64_OFF64_CFLAGS(1140L), _CS_POSIX_V7_LP64_OFF64_LDFLAGS(1141L), _CS_POSIX_V7_LP64_OFF64_LIBS(1142L), _CS_POSIX_V7_LP64_OFF64_LINTFLAGS(1143L), _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS(1144L), _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS(1145L), _CS_POSIX_V7_LPBIG_OFFBIG_LIBS(1146L), _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS(1147L), _CS_V6_ENV(1148L), _CS_V7_ENV(1149L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_539_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_confname_h_539_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/x86_64-linux-gnu/bits/ss_flags.h:27:1)}
 */
enum class enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_ss_flags_h_27_1_(val value: Long) {
    SS_ONSTACK(1L), SS_DISABLE(2L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_ss_flags_h_27_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_x86_64_linux_gnu_bits_ss_flags_h_27_1_ value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __tss_t;}
 */
typealias _tss_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __thrd_t;}
 */
typealias _thrd_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long pthread_t;}
 */
typealias pthread_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int pthread_key_t;}
 */
typealias pthread_key_t = Int

/**
 * {@snippet lang=c : typedef Int pthread_once_t;}
 */
typealias pthread_once_t = Int

/**
 * {@snippet lang=c : typedef Int pthread_spinlock_t;}
 */
typealias pthread_spinlock_t = Int

/**
 * {@snippet lang=c : typedef Int wchar_t;}
 */
typealias wchar_t = Int

/**
 * {@snippet lang=c : typedef Float _Float32;}
 */
typealias _Float32 = Float

/**
 * {@snippet lang=c : typedef Double _Float64;}
 */
typealias _Float64 = Double

/**
 * {@snippet lang=c : typedef Double _Float32x;}
 */
typealias _Float32x = Double

/**
 * {@snippet lang=c : typedef UNSIGNED = Char u_char;}
 */
typealias u_char = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short u_short;}
 */
typealias u_short = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int u_int;}
 */
typealias u_int = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long u_long;}
 */
typealias u_long = Long

/**
 * {@snippet lang=c : typedef Long quad_t;}
 */
typealias quad_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long u_quad_t;}
 */
typealias u_quad_t = Long

/**
 * {@snippet lang=c : typedef Long loff_t;}
 */
typealias loff_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ino_t;}
 */
typealias ino_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ino64_t;}
 */
typealias ino64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dev_t;}
 */
typealias dev_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mode_t;}
 */
typealias mode_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long nlink_t;}
 */
typealias nlink_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int id_t;}
 */
typealias id_t = Int

/**
 * {@snippet lang=c : typedef Int daddr_t;}
 */
typealias daddr_t = Int

/**
 * {@snippet lang=c : typedef Int key_t;}
 */
typealias key_t = Int

/**
 * {@snippet lang=c : typedef Long clock_t;}
 */
typealias clock_t = Long

/**
 * {@snippet lang=c : typedef Int clockid_t;}
 */
typealias clockid_t = Int

/**
 * {@snippet lang=c : typedef Long suseconds_t;}
 */
typealias suseconds_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ulong;}
 */
typealias ulong = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ushort;}
 */
typealias ushort = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint;}
 */
typealias uint = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char u_int8_t;}
 */
typealias u_int8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short u_int16_t;}
 */
typealias u_int16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int u_int32_t;}
 */
typealias u_int32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long u_int64_t;}
 */
typealias u_int64_t = Long

/**
 * {@snippet lang=c : typedef Long register_t;}
 */
typealias register_t = Long

/**
 * {@snippet lang=c : typedef Long __fd_mask;}
 */
typealias _fd_mask = Long

/**
 * {@snippet lang=c : typedef Long fd_mask;}
 */
typealias fd_mask = Long

/**
 * {@snippet lang=c : typedef Long blksize_t;}
 */
typealias blksize_t = Long

/**
 * {@snippet lang=c : typedef Long blkcnt_t;}
 */
typealias blkcnt_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long fsblkcnt_t;}
 */
typealias fsblkcnt_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long fsfilcnt_t;}
 */
typealias fsfilcnt_t = Long

/**
 * {@snippet lang=c : typedef Long blkcnt64_t;}
 */
typealias blkcnt64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long fsblkcnt64_t;}
 */
typealias fsblkcnt64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long fsfilcnt64_t;}
 */
typealias fsfilcnt64_t = Long

/**
 * {@snippet lang=c : typedef Long ptrdiff_t;}
 */
typealias ptrdiff_t = Long

/**
 * NS_ENUM: {@snippet lang=c : enum spa_direction}
 */
enum class spa_direction(val value: Long) {
    SPA_DIRECTION_INPUT(0L), SPA_DIRECTION_OUTPUT(1L);

    companion object {
        fun fromValue(v: Long): spa_direction = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_direction value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Int error_t;}
 */
typealias error_t = Int

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_type}
 */
enum class spa_param_type(val value: Long) {
    SPA_PARAM_Invalid(0L), SPA_PARAM_PropInfo(1L), SPA_PARAM_Props(2L), SPA_PARAM_EnumFormat(3L), SPA_PARAM_Format(4L), SPA_PARAM_Buffers(5L), SPA_PARAM_Meta(6L), SPA_PARAM_IO(7L), SPA_PARAM_EnumProfile(8L), SPA_PARAM_Profile(9L), SPA_PARAM_EnumPortConfig(10L), SPA_PARAM_PortConfig(11L), SPA_PARAM_EnumRoute(12L), SPA_PARAM_Route(13L), SPA_PARAM_Control(14L), SPA_PARAM_Latency(15L), SPA_PARAM_ProcessLatency(16L), SPA_PARAM_Tag(17L);

    companion object {
        fun fromValue(v: Long): spa_param_type = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_type value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_bitorder}
 */
enum class spa_param_bitorder(val value: Long) {
    SPA_PARAM_BITORDER_unknown(0L), SPA_PARAM_BITORDER_msb(1L), SPA_PARAM_BITORDER_lsb(2L);

    companion object {
        fun fromValue(v: Long): spa_param_bitorder = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_bitorder value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_availability}
 */
enum class spa_param_availability(val value: Long) {
    SPA_PARAM_AVAILABILITY_unknown(0L), SPA_PARAM_AVAILABILITY_no(1L), SPA_PARAM_AVAILABILITY_yes(2L);

    companion object {
        fun fromValue(v: Long): spa_param_availability = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_availability value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_buffers}
 */
enum class spa_param_buffers(val value: Long) {
    SPA_PARAM_BUFFERS_START(0L), SPA_PARAM_BUFFERS_buffers(1L), SPA_PARAM_BUFFERS_blocks(2L), SPA_PARAM_BUFFERS_size(3L), SPA_PARAM_BUFFERS_stride(4L), SPA_PARAM_BUFFERS_align(5L), SPA_PARAM_BUFFERS_dataType(6L);

    companion object {
        fun fromValue(v: Long): spa_param_buffers = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_buffers value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_meta}
 */
enum class spa_param_meta(val value: Long) {
    SPA_PARAM_META_START(0L), SPA_PARAM_META_type(1L), SPA_PARAM_META_size(2L);

    companion object {
        fun fromValue(v: Long): spa_param_meta = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_meta value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_io}
 */
enum class spa_param_io(val value: Long) {
    SPA_PARAM_IO_START(0L), SPA_PARAM_IO_id(1L), SPA_PARAM_IO_size(2L);

    companion object {
        fun fromValue(v: Long): spa_param_io = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_io value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_profile}
 */
enum class spa_param_profile(val value: Long) {
    SPA_PARAM_PROFILE_START(0L), SPA_PARAM_PROFILE_index(1L), SPA_PARAM_PROFILE_name(2L), SPA_PARAM_PROFILE_description(3L), SPA_PARAM_PROFILE_priority(4L), SPA_PARAM_PROFILE_available(5L), SPA_PARAM_PROFILE_info(6L), SPA_PARAM_PROFILE_classes(7L), SPA_PARAM_PROFILE_save(8L);

    companion object {
        fun fromValue(v: Long): spa_param_profile = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_profile value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_port_config_mode}
 */
enum class spa_param_port_config_mode(val value: Long) {
    SPA_PARAM_PORT_CONFIG_MODE_none(0L), SPA_PARAM_PORT_CONFIG_MODE_passthrough(1L), SPA_PARAM_PORT_CONFIG_MODE_convert(2L), SPA_PARAM_PORT_CONFIG_MODE_dsp(3L);

    companion object {
        fun fromValue(v: Long): spa_param_port_config_mode = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_port_config_mode value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_port_config}
 */
enum class spa_param_port_config(val value: Long) {
    SPA_PARAM_PORT_CONFIG_START(0L), SPA_PARAM_PORT_CONFIG_direction(1L), SPA_PARAM_PORT_CONFIG_mode(2L), SPA_PARAM_PORT_CONFIG_monitor(3L), SPA_PARAM_PORT_CONFIG_control(4L), SPA_PARAM_PORT_CONFIG_format(5L);

    companion object {
        fun fromValue(v: Long): spa_param_port_config = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_port_config value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_param_route}
 */
enum class spa_param_route(val value: Long) {
    SPA_PARAM_ROUTE_START(0L), SPA_PARAM_ROUTE_index(1L), SPA_PARAM_ROUTE_direction(2L), SPA_PARAM_ROUTE_device(3L), SPA_PARAM_ROUTE_name(4L), SPA_PARAM_ROUTE_description(5L), SPA_PARAM_ROUTE_priority(6L), SPA_PARAM_ROUTE_available(7L), SPA_PARAM_ROUTE_info(8L), SPA_PARAM_ROUTE_profiles(9L), SPA_PARAM_ROUTE_props(10L), SPA_PARAM_ROUTE_devices(11L), SPA_PARAM_ROUTE_profile(12L), SPA_PARAM_ROUTE_save(13L);

    companion object {
        fun fromValue(v: Long): spa_param_route = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_param_route value: $v")
    }
}

/**
 * {@snippet lang=c : STRUCT spa_list
 */
class spa_list {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withByteAlignment(8).withName("next"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("prev")
        ).withByteAlignment(8L).withName("spa_list")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    val next_VH: VarHandle = layout.varHandle(groupElement("next"))

    @Suppress("UNCHECKED_CAST")
    fun next(segment: MemorySegment): MemorySegment =
        next_VH.get(segment, 0L) as MemorySegment

    fun next(segment: MemorySegment, value: MemorySegment) =
        next_VH.set(segment, 0L, value)

    val prev_VH: VarHandle = layout.varHandle(groupElement("prev"))

    @Suppress("UNCHECKED_CAST")
    fun prev(segment: MemorySegment): MemorySegment =
        prev_VH.get(segment, 0L) as MemorySegment

    fun prev(segment: MemorySegment, value: MemorySegment) =
        prev_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT spa_callbacks
 */
class spa_callbacks {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withByteAlignment(8).withName("funcs"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("data")
        ).withByteAlignment(8L).withName("spa_callbacks")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    val funcs_VH: VarHandle = layout.varHandle(groupElement("funcs"))

    @Suppress("UNCHECKED_CAST")
    fun funcs(segment: MemorySegment): MemorySegment =
        funcs_VH.get(segment, 0L) as MemorySegment

    fun funcs(segment: MemorySegment, value: MemorySegment) =
        funcs_VH.set(segment, 0L, value)

    val data_VH: VarHandle = layout.varHandle(groupElement("data"))

    @Suppress("UNCHECKED_CAST")
    fun data(segment: MemorySegment): MemorySegment =
        data_VH.get(segment, 0L) as MemorySegment

    fun data(segment: MemorySegment, value: MemorySegment) =
        data_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT spa_hook
 */
class spa_hook {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            spa_list.layout.withByteAlignment(8).withName("link"),
            spa_callbacks.layout.withByteAlignment(8).withName("cb"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("removed"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("priv")
        ).withByteAlignment(8L).withName("spa_hook")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    fun link(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("link")), layout.select(groupElement("link")).byteSize())

    fun cb(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("cb")), layout.select(groupElement("cb")).byteSize())

    val removed_VH: VarHandle = layout.varHandle(groupElement("removed"))

    @Suppress("UNCHECKED_CAST")
    fun removed(segment: MemorySegment): MemorySegment =
        removed_VH.get(segment, 0L) as MemorySegment

    fun removed(segment: MemorySegment, value: MemorySegment) =
        removed_VH.set(segment, 0L, value)

    val priv_VH: VarHandle = layout.varHandle(groupElement("priv"))

    @Suppress("UNCHECKED_CAST")
    fun priv(segment: MemorySegment): MemorySegment =
        priv_VH.get(segment, 0L) as MemorySegment

    fun priv(segment: MemorySegment, value: MemorySegment) =
        priv_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : pw_properties_new_string (Declared(pw_properties))*((Char)*)
 */
private val pw_properties_new_string_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_properties_new_string_ADDR: MemorySegment by lazy { LOOKUP.find("pw_properties_new_string").orElseThrow() }
private val pw_properties_new_string_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_properties_new_string_ADDR, pw_properties_new_string_DESC) }

fun pw_properties_new_string(arg0: MemorySegment): MemorySegment {
    try {
        return pw_properties_new_string_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_properties_free Void((Declared(pw_properties))*)
 */
private val pw_properties_free_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val pw_properties_free_ADDR: MemorySegment by lazy { LOOKUP.find("pw_properties_free").orElseThrow() }
private val pw_properties_free_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_properties_free_ADDR, pw_properties_free_DESC) }

fun pw_properties_free(arg0: MemorySegment): Unit {
    try {
        pw_properties_free_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_context_connect_fd (Declared(pw_core))*((Declared(pw_context))*,Int,(Declared(pw_properties))*,UNSIGNED = Long)
 */
private val pw_context_connect_fd_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val pw_context_connect_fd_ADDR: MemorySegment by lazy { LOOKUP.find("pw_context_connect_fd").orElseThrow() }
private val pw_context_connect_fd_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_context_connect_fd_ADDR, pw_context_connect_fd_DESC) }

fun pw_context_connect_fd(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: Long): MemorySegment {
    try {
        return pw_context_connect_fd_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_core_disconnect Int((Declared(pw_core))*)
 */
private val pw_core_disconnect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val pw_core_disconnect_ADDR: MemorySegment by lazy { LOOKUP.find("pw_core_disconnect").orElseThrow() }
private val pw_core_disconnect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_core_disconnect_ADDR, pw_core_disconnect_DESC) }

fun pw_core_disconnect(arg0: MemorySegment): Int {
    try {
        return pw_core_disconnect_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_context_new (Declared(pw_context))*((Declared(pw_loop))*,(Declared(pw_properties))*,UNSIGNED = Long)
 */
private val pw_context_new_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val pw_context_new_ADDR: MemorySegment by lazy { LOOKUP.find("pw_context_new").orElseThrow() }
private val pw_context_new_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_context_new_ADDR, pw_context_new_DESC) }

fun pw_context_new(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return pw_context_new_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_context_destroy Void((Declared(pw_context))*)
 */
private val pw_context_destroy_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val pw_context_destroy_ADDR: MemorySegment by lazy { LOOKUP.find("pw_context_destroy").orElseThrow() }
private val pw_context_destroy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_context_destroy_ADDR, pw_context_destroy_DESC) }

fun pw_context_destroy(arg0: MemorySegment): Unit {
    try {
        pw_context_destroy_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Short sa_family_t;}
 */
typealias sa_family_t = Short

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/spa-0.2/spa/utils/type.h:23:1)}
 */
enum class enum_unnamed_at_usr_include_spa_0_2_spa_utils_type_h_23_1_(val value: Long) {
    SPA_TYPE_START(0L), SPA_TYPE_None(1L), SPA_TYPE_Bool(2L), SPA_TYPE_Id(3L), SPA_TYPE_Int(4L), SPA_TYPE_Long(5L), SPA_TYPE_Float(6L), SPA_TYPE_Double(7L), SPA_TYPE_String(8L), SPA_TYPE_Bytes(9L), SPA_TYPE_Rectangle(10L), SPA_TYPE_Fraction(11L), SPA_TYPE_Bitmap(12L), SPA_TYPE_Array(13L), SPA_TYPE_Struct(14L), SPA_TYPE_Object(15L), SPA_TYPE_Sequence(16L), SPA_TYPE_Pointer(17L), SPA_TYPE_Fd(18L), SPA_TYPE_Choice(19L), SPA_TYPE_Pod(20L), _SPA_TYPE_LAST(21L), SPA_TYPE_POINTER_START(65536L), SPA_TYPE_POINTER_Buffer(65537L), SPA_TYPE_POINTER_Meta(65538L), SPA_TYPE_POINTER_Dict(65539L), _SPA_TYPE_POINTER_LAST(65540L), SPA_TYPE_EVENT_START(131072L), SPA_TYPE_EVENT_Device(131073L), SPA_TYPE_EVENT_Node(131074L), _SPA_TYPE_EVENT_LAST(131075L), SPA_TYPE_COMMAND_START(196608L), SPA_TYPE_COMMAND_Device(196609L), SPA_TYPE_COMMAND_Node(196610L), _SPA_TYPE_COMMAND_LAST(196611L), SPA_TYPE_OBJECT_START(262144L), SPA_TYPE_OBJECT_PropInfo(262145L), SPA_TYPE_OBJECT_Props(262146L), SPA_TYPE_OBJECT_Format(262147L), SPA_TYPE_OBJECT_ParamBuffers(262148L), SPA_TYPE_OBJECT_ParamMeta(262149L), SPA_TYPE_OBJECT_ParamIO(262150L), SPA_TYPE_OBJECT_ParamProfile(262151L), SPA_TYPE_OBJECT_ParamPortConfig(262152L), SPA_TYPE_OBJECT_ParamRoute(262153L), SPA_TYPE_OBJECT_Profiler(262154L), SPA_TYPE_OBJECT_ParamLatency(262155L), SPA_TYPE_OBJECT_ParamProcessLatency(262156L), SPA_TYPE_OBJECT_ParamTag(262157L), _SPA_TYPE_OBJECT_LAST(262158L), SPA_TYPE_VENDOR_PipeWire(33554432L), SPA_TYPE_VENDOR_Other(2130706432L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_spa_0_2_spa_utils_type_h_23_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_spa_0_2_spa_utils_type_h_23_1_ value: $v")
    }
}

/**
 * {@snippet lang=c : STRUCT spa_pod
 */
class spa_pod {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("size"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("type")
        ).withByteAlignment(4L).withName("spa_pod")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    val size_VH: VarHandle = layout.varHandle(groupElement("size"))

    @Suppress("UNCHECKED_CAST")
    fun size(segment: MemorySegment): Int =
        size_VH.get(segment, 0L) as Int

    fun size(segment: MemorySegment, value: Int) =
        size_VH.set(segment, 0L, value)

    val type_VH: VarHandle = layout.varHandle(groupElement("type"))

    @Suppress("UNCHECKED_CAST")
    fun type(segment: MemorySegment): Int =
        type_VH.get(segment, 0L) as Int

    fun type(segment: MemorySegment, value: Int) =
        type_VH.set(segment, 0L, value)
} // End class

/**
 * NS_ENUM: {@snippet lang=c : enum spa_choice_type}
 */
enum class spa_choice_type(val value: Long) {
    SPA_CHOICE_None(0L), SPA_CHOICE_Range(1L), SPA_CHOICE_Step(2L), SPA_CHOICE_Enum(3L), SPA_CHOICE_Flags(4L);

    companion object {
        fun fromValue(v: Long): spa_choice_type = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_choice_type value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_meta_type}
 */
enum class spa_meta_type(val value: Long) {
    SPA_META_Invalid(0L), SPA_META_Header(1L), SPA_META_VideoCrop(2L), SPA_META_VideoDamage(3L), SPA_META_Bitmap(4L), SPA_META_Cursor(5L), SPA_META_Control(6L), SPA_META_Busy(7L), SPA_META_VideoTransform(8L), _SPA_META_LAST(9L);

    companion object {
        fun fromValue(v: Long): spa_meta_type = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_meta_type value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_meta_videotransform_value}
 */
enum class spa_meta_videotransform_value(val value: Long) {
    SPA_META_TRANSFORMATION_None(0L), SPA_META_TRANSFORMATION_90(1L), SPA_META_TRANSFORMATION_180(2L), SPA_META_TRANSFORMATION_270(3L), SPA_META_TRANSFORMATION_Flipped(4L), SPA_META_TRANSFORMATION_Flipped90(5L), SPA_META_TRANSFORMATION_Flipped180(6L), SPA_META_TRANSFORMATION_Flipped270(7L);

    companion object {
        fun fromValue(v: Long): spa_meta_videotransform_value = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_meta_videotransform_value value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_data_type}
 */
enum class spa_data_type(val value: Long) {
    SPA_DATA_Invalid(0L), SPA_DATA_MemPtr(1L), SPA_DATA_MemFd(2L), SPA_DATA_DmaBuf(3L), SPA_DATA_MemId(4L), _SPA_DATA_LAST(5L);

    companion object {
        fun fromValue(v: Long): spa_data_type = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_data_type value: $v")
    }
}

/**
 * {@snippet lang=c : STRUCT spa_chunk
 */
class spa_chunk {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("offset"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("size"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("stride"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("flags")
        ).withByteAlignment(4L).withName("spa_chunk")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    val offset_VH: VarHandle = layout.varHandle(groupElement("offset"))

    @Suppress("UNCHECKED_CAST")
    fun offset(segment: MemorySegment): Int =
        offset_VH.get(segment, 0L) as Int

    fun offset(segment: MemorySegment, value: Int) =
        offset_VH.set(segment, 0L, value)

    val size_VH: VarHandle = layout.varHandle(groupElement("size"))

    @Suppress("UNCHECKED_CAST")
    fun size(segment: MemorySegment): Int =
        size_VH.get(segment, 0L) as Int

    fun size(segment: MemorySegment, value: Int) =
        size_VH.set(segment, 0L, value)

    val stride_VH: VarHandle = layout.varHandle(groupElement("stride"))

    @Suppress("UNCHECKED_CAST")
    fun stride(segment: MemorySegment): Int =
        stride_VH.get(segment, 0L) as Int

    fun stride(segment: MemorySegment, value: Int) =
        stride_VH.set(segment, 0L, value)

    val flags_VH: VarHandle = layout.varHandle(groupElement("flags"))

    @Suppress("UNCHECKED_CAST")
    fun flags(segment: MemorySegment): Int =
        flags_VH.get(segment, 0L) as Int

    fun flags(segment: MemorySegment, value: Int) =
        flags_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT spa_data
 */
class spa_data {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("type"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("flags"),
            ValueLayout.JAVA_LONG.withByteAlignment(8).withName("fd"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("mapoffset"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("maxsize"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("data"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("chunk")
        ).withByteAlignment(8L).withName("spa_data")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    val type_VH: VarHandle = layout.varHandle(groupElement("type"))

    @Suppress("UNCHECKED_CAST")
    fun type(segment: MemorySegment): Int =
        type_VH.get(segment, 0L) as Int

    fun type(segment: MemorySegment, value: Int) =
        type_VH.set(segment, 0L, value)

    val flags_VH: VarHandle = layout.varHandle(groupElement("flags"))

    @Suppress("UNCHECKED_CAST")
    fun flags(segment: MemorySegment): Int =
        flags_VH.get(segment, 0L) as Int

    fun flags(segment: MemorySegment, value: Int) =
        flags_VH.set(segment, 0L, value)

    val fd_VH: VarHandle = layout.varHandle(groupElement("fd"))

    @Suppress("UNCHECKED_CAST")
    fun fd(segment: MemorySegment): Long =
        fd_VH.get(segment, 0L) as Long

    fun fd(segment: MemorySegment, value: Long) =
        fd_VH.set(segment, 0L, value)

    val mapoffset_VH: VarHandle = layout.varHandle(groupElement("mapoffset"))

    @Suppress("UNCHECKED_CAST")
    fun mapoffset(segment: MemorySegment): Int =
        mapoffset_VH.get(segment, 0L) as Int

    fun mapoffset(segment: MemorySegment, value: Int) =
        mapoffset_VH.set(segment, 0L, value)

    val maxsize_VH: VarHandle = layout.varHandle(groupElement("maxsize"))

    @Suppress("UNCHECKED_CAST")
    fun maxsize(segment: MemorySegment): Int =
        maxsize_VH.get(segment, 0L) as Int

    fun maxsize(segment: MemorySegment, value: Int) =
        maxsize_VH.set(segment, 0L, value)

    val data_VH: VarHandle = layout.varHandle(groupElement("data"))

    @Suppress("UNCHECKED_CAST")
    fun data(segment: MemorySegment): MemorySegment =
        data_VH.get(segment, 0L) as MemorySegment

    fun data(segment: MemorySegment, value: MemorySegment) =
        data_VH.set(segment, 0L, value)

    val chunk_VH: VarHandle = layout.varHandle(groupElement("chunk"))

    @Suppress("UNCHECKED_CAST")
    fun chunk(segment: MemorySegment): MemorySegment =
        chunk_VH.get(segment, 0L) as MemorySegment

    fun chunk(segment: MemorySegment, value: MemorySegment) =
        chunk_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT spa_buffer
 */
class spa_buffer {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("n_metas"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("n_datas"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("metas"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("datas")
        ).withByteAlignment(8L).withName("spa_buffer")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    val n_metas_VH: VarHandle = layout.varHandle(groupElement("n_metas"))

    @Suppress("UNCHECKED_CAST")
    fun n_metas(segment: MemorySegment): Int =
        n_metas_VH.get(segment, 0L) as Int

    fun n_metas(segment: MemorySegment, value: Int) =
        n_metas_VH.set(segment, 0L, value)

    val n_datas_VH: VarHandle = layout.varHandle(groupElement("n_datas"))

    @Suppress("UNCHECKED_CAST")
    fun n_datas(segment: MemorySegment): Int =
        n_datas_VH.get(segment, 0L) as Int

    fun n_datas(segment: MemorySegment, value: Int) =
        n_datas_VH.set(segment, 0L, value)

    val metas_VH: VarHandle = layout.varHandle(groupElement("metas"))

    @Suppress("UNCHECKED_CAST")
    fun metas(segment: MemorySegment): MemorySegment =
        metas_VH.get(segment, 0L) as MemorySegment

    fun metas(segment: MemorySegment, value: MemorySegment) =
        metas_VH.set(segment, 0L, value)

    val datas_VH: VarHandle = layout.varHandle(groupElement("datas"))

    @Suppress("UNCHECKED_CAST")
    fun datas(segment: MemorySegment): MemorySegment =
        datas_VH.get(segment, 0L) as MemorySegment

    fun datas(segment: MemorySegment, value: MemorySegment) =
        datas_VH.set(segment, 0L, value)
} // End class

/**
 * NS_ENUM: {@snippet lang=c : enum spa_node_event}
 */
enum class spa_node_event(val value: Long) {
    SPA_NODE_EVENT_Error(0L), SPA_NODE_EVENT_Buffering(1L), SPA_NODE_EVENT_RequestRefresh(2L), SPA_NODE_EVENT_RequestProcess(3L);

    companion object {
        fun fromValue(v: Long): spa_node_event = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_node_event value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_event_node}
 */
enum class spa_event_node(val value: Long) {
    SPA_EVENT_NODE_START(0L);

    companion object {
        fun fromValue(v: Long): spa_event_node = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_event_node value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_node_command}
 */
enum class spa_node_command(val value: Long) {
    SPA_NODE_COMMAND_Suspend(0L), SPA_NODE_COMMAND_Pause(1L), SPA_NODE_COMMAND_Start(2L), SPA_NODE_COMMAND_Enable(3L), SPA_NODE_COMMAND_Disable(4L), SPA_NODE_COMMAND_Flush(5L), SPA_NODE_COMMAND_Drain(6L), SPA_NODE_COMMAND_Marker(7L), SPA_NODE_COMMAND_ParamBegin(8L), SPA_NODE_COMMAND_ParamEnd(9L), SPA_NODE_COMMAND_RequestProcess(10L);

    companion object {
        fun fromValue(v: Long): spa_node_command = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_node_command value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum pw_memblock_flags}
 */
enum class pw_memblock_flags(val value: Long) {
    PW_MEMBLOCK_FLAG_NONE(0L), PW_MEMBLOCK_FLAG_READABLE(1L), PW_MEMBLOCK_FLAG_WRITABLE(2L), PW_MEMBLOCK_FLAG_SEAL(4L), PW_MEMBLOCK_FLAG_MAP(8L), PW_MEMBLOCK_FLAG_DONT_CLOSE(16L), PW_MEMBLOCK_FLAG_DONT_NOTIFY(32L), PW_MEMBLOCK_FLAG_READWRITE(3L);

    companion object {
        fun fromValue(v: Long): pw_memblock_flags = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_memblock_flags value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum pw_memmap_flags}
 */
enum class pw_memmap_flags(val value: Long) {
    PW_MEMMAP_FLAG_NONE(0L), PW_MEMMAP_FLAG_READ(1L), PW_MEMMAP_FLAG_WRITE(2L), PW_MEMMAP_FLAG_TWICE(4L), PW_MEMMAP_FLAG_PRIVATE(8L), PW_MEMMAP_FLAG_LOCKED(16L), PW_MEMMAP_FLAG_READWRITE(3L);

    companion object {
        fun fromValue(v: Long): pw_memmap_flags = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_memmap_flags value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_log_level}
 */
enum class spa_log_level(val value: Long) {
    SPA_LOG_LEVEL_NONE(0L), SPA_LOG_LEVEL_ERROR(1L), SPA_LOG_LEVEL_WARN(2L), SPA_LOG_LEVEL_INFO(3L), SPA_LOG_LEVEL_DEBUG(4L), SPA_LOG_LEVEL_TRACE(5L);

    companion object {
        fun fromValue(v: Long): spa_log_level = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_log_level value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum pw_link_state}
 */
enum class pw_link_state(val value: Long) {
    PW_LINK_STATE_ERROR(-2L), PW_LINK_STATE_UNLINKED(-1L), PW_LINK_STATE_INIT(0L), PW_LINK_STATE_NEGOTIATING(1L), PW_LINK_STATE_ALLOCATING(2L), PW_LINK_STATE_PAUSED(3L), PW_LINK_STATE_ACTIVE(4L);

    companion object {
        fun fromValue(v: Long): pw_link_state = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_link_state value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum pw_node_state}
 */
enum class pw_node_state(val value: Long) {
    PW_NODE_STATE_ERROR(-1L), PW_NODE_STATE_CREATING(0L), PW_NODE_STATE_SUSPENDED(1L), PW_NODE_STATE_IDLE(2L), PW_NODE_STATE_RUNNING(3L);

    companion object {
        fun fromValue(v: Long): pw_node_state = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_node_state value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum pw_stream_state}
 */
enum class pw_stream_state(val value: Long) {
    PW_STREAM_STATE_ERROR(-1L), PW_STREAM_STATE_UNCONNECTED(0L), PW_STREAM_STATE_CONNECTING(1L), PW_STREAM_STATE_PAUSED(2L), PW_STREAM_STATE_STREAMING(3L);

    companion object {
        fun fromValue(v: Long): pw_stream_state = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_stream_state value: $v")
    }
}

/**
 * {@snippet lang=c : STRUCT pw_buffer
 */
class pw_buffer {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withByteAlignment(8).withName("buffer"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("user_data"),
            ValueLayout.JAVA_LONG.withByteAlignment(8).withName("size"),
            ValueLayout.JAVA_LONG.withByteAlignment(8).withName("requested"),
            ValueLayout.JAVA_LONG.withByteAlignment(8).withName("time")
        ).withByteAlignment(8L).withName("pw_buffer")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    val buffer_VH: VarHandle = layout.varHandle(groupElement("buffer"))

    @Suppress("UNCHECKED_CAST")
    fun buffer(segment: MemorySegment): MemorySegment =
        buffer_VH.get(segment, 0L) as MemorySegment

    fun buffer(segment: MemorySegment, value: MemorySegment) =
        buffer_VH.set(segment, 0L, value)

    val user_data_VH: VarHandle = layout.varHandle(groupElement("user_data"))

    @Suppress("UNCHECKED_CAST")
    fun user_data(segment: MemorySegment): MemorySegment =
        user_data_VH.get(segment, 0L) as MemorySegment

    fun user_data(segment: MemorySegment, value: MemorySegment) =
        user_data_VH.set(segment, 0L, value)

    val size_VH: VarHandle = layout.varHandle(groupElement("size"))

    @Suppress("UNCHECKED_CAST")
    fun size(segment: MemorySegment): Long =
        size_VH.get(segment, 0L) as Long

    fun size(segment: MemorySegment, value: Long) =
        size_VH.set(segment, 0L, value)

    val requested_VH: VarHandle = layout.varHandle(groupElement("requested"))

    @Suppress("UNCHECKED_CAST")
    fun requested(segment: MemorySegment): Long =
        requested_VH.get(segment, 0L) as Long

    fun requested(segment: MemorySegment, value: Long) =
        requested_VH.set(segment, 0L, value)

    val time_VH: VarHandle = layout.varHandle(groupElement("time"))

    @Suppress("UNCHECKED_CAST")
    fun time(segment: MemorySegment): Long =
        time_VH.get(segment, 0L) as Long

    fun time(segment: MemorySegment, value: Long) =
        time_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT pw_stream_events
 */
class pw_stream_events {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("version"),
            MemoryLayout.paddingLayout(4L),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("destroy"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("state_changed"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("control_info"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("io_changed"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("param_changed"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("add_buffer"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("remove_buffer"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("process"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("drained"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("command"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("trigger_done")
        ).withByteAlignment(8L).withName("pw_stream_events")

        val byteSize: Long
            get() = layout.byteSize()

        fun allocate(allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(layout)

        fun allocateArray(elementCount: Long, allocator: SegmentAllocator): MemorySegment =
            allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout))

        fun asSlice(array: MemorySegment, index: Long): MemorySegment =
            array.asSlice(byteSize * index)

        fun reinterpret(addr: MemorySegment): MemorySegment =
            addr.reinterpret(byteSize)

        fun reinterpret(addr: MemorySegment, elementCount: Long): MemorySegment =
            addr.reinterpret(byteSize * elementCount)

    } // End companion object

    val version_VH: VarHandle = layout.varHandle(groupElement("version"))

    @Suppress("UNCHECKED_CAST")
    fun version(segment: MemorySegment): Int =
        version_VH.get(segment, 0L) as Int

    fun version(segment: MemorySegment, value: Int) =
        version_VH.set(segment, 0L, value)

    val destroy_VH: VarHandle = layout.varHandle(groupElement("destroy"))

    @Suppress("UNCHECKED_CAST")
    fun destroy(segment: MemorySegment): MemorySegment =
        destroy_VH.get(segment, 0L) as MemorySegment

    fun destroy(segment: MemorySegment, value: MemorySegment) =
        destroy_VH.set(segment, 0L, value)

    val state_changed_VH: VarHandle = layout.varHandle(groupElement("state_changed"))

    @Suppress("UNCHECKED_CAST")
    fun state_changed(segment: MemorySegment): MemorySegment =
        state_changed_VH.get(segment, 0L) as MemorySegment

    fun state_changed(segment: MemorySegment, value: MemorySegment) =
        state_changed_VH.set(segment, 0L, value)

    val control_info_VH: VarHandle = layout.varHandle(groupElement("control_info"))

    @Suppress("UNCHECKED_CAST")
    fun control_info(segment: MemorySegment): MemorySegment =
        control_info_VH.get(segment, 0L) as MemorySegment

    fun control_info(segment: MemorySegment, value: MemorySegment) =
        control_info_VH.set(segment, 0L, value)

    val io_changed_VH: VarHandle = layout.varHandle(groupElement("io_changed"))

    @Suppress("UNCHECKED_CAST")
    fun io_changed(segment: MemorySegment): MemorySegment =
        io_changed_VH.get(segment, 0L) as MemorySegment

    fun io_changed(segment: MemorySegment, value: MemorySegment) =
        io_changed_VH.set(segment, 0L, value)

    val param_changed_VH: VarHandle = layout.varHandle(groupElement("param_changed"))

    @Suppress("UNCHECKED_CAST")
    fun param_changed(segment: MemorySegment): MemorySegment =
        param_changed_VH.get(segment, 0L) as MemorySegment

    fun param_changed(segment: MemorySegment, value: MemorySegment) =
        param_changed_VH.set(segment, 0L, value)

    val add_buffer_VH: VarHandle = layout.varHandle(groupElement("add_buffer"))

    @Suppress("UNCHECKED_CAST")
    fun add_buffer(segment: MemorySegment): MemorySegment =
        add_buffer_VH.get(segment, 0L) as MemorySegment

    fun add_buffer(segment: MemorySegment, value: MemorySegment) =
        add_buffer_VH.set(segment, 0L, value)

    val remove_buffer_VH: VarHandle = layout.varHandle(groupElement("remove_buffer"))

    @Suppress("UNCHECKED_CAST")
    fun remove_buffer(segment: MemorySegment): MemorySegment =
        remove_buffer_VH.get(segment, 0L) as MemorySegment

    fun remove_buffer(segment: MemorySegment, value: MemorySegment) =
        remove_buffer_VH.set(segment, 0L, value)

    val process_VH: VarHandle = layout.varHandle(groupElement("process"))

    @Suppress("UNCHECKED_CAST")
    fun process(segment: MemorySegment): MemorySegment =
        process_VH.get(segment, 0L) as MemorySegment

    fun process(segment: MemorySegment, value: MemorySegment) =
        process_VH.set(segment, 0L, value)

    val drained_VH: VarHandle = layout.varHandle(groupElement("drained"))

    @Suppress("UNCHECKED_CAST")
    fun drained(segment: MemorySegment): MemorySegment =
        drained_VH.get(segment, 0L) as MemorySegment

    fun drained(segment: MemorySegment, value: MemorySegment) =
        drained_VH.set(segment, 0L, value)

    val command_VH: VarHandle = layout.varHandle(groupElement("command"))

    @Suppress("UNCHECKED_CAST")
    fun command(segment: MemorySegment): MemorySegment =
        command_VH.get(segment, 0L) as MemorySegment

    fun command(segment: MemorySegment, value: MemorySegment) =
        command_VH.set(segment, 0L, value)

    val trigger_done_VH: VarHandle = layout.varHandle(groupElement("trigger_done"))

    @Suppress("UNCHECKED_CAST")
    fun trigger_done(segment: MemorySegment): MemorySegment =
        trigger_done_VH.get(segment, 0L) as MemorySegment

    fun trigger_done(segment: MemorySegment, value: MemorySegment) =
        trigger_done_VH.set(segment, 0L, value)
} // End class

/**
 * NS_ENUM: {@snippet lang=c : enum pw_stream_flags}
 */
enum class pw_stream_flags(val value: Long) {
    PW_STREAM_FLAG_NONE(0L), PW_STREAM_FLAG_AUTOCONNECT(1L), PW_STREAM_FLAG_INACTIVE(2L), PW_STREAM_FLAG_MAP_BUFFERS(4L), PW_STREAM_FLAG_DRIVER(8L), PW_STREAM_FLAG_RT_PROCESS(16L), PW_STREAM_FLAG_NO_CONVERT(32L), PW_STREAM_FLAG_EXCLUSIVE(64L), PW_STREAM_FLAG_DONT_RECONNECT(128L), PW_STREAM_FLAG_ALLOC_BUFFERS(256L), PW_STREAM_FLAG_TRIGGER(512L), PW_STREAM_FLAG_ASYNC(1024L), PW_STREAM_FLAG_EARLY_PROCESS(2048L);

    companion object {
        fun fromValue(v: Long): pw_stream_flags = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_stream_flags value: $v")
    }
}

/**
 * {@snippet lang=c : pw_stream_new (Declared(pw_stream))*((Declared(pw_core))*,(Char)*,(Declared(pw_properties))*)
 */
private val pw_stream_new_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_stream_new_ADDR: MemorySegment by lazy { LOOKUP.find("pw_stream_new").orElseThrow() }
private val pw_stream_new_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_stream_new_ADDR, pw_stream_new_DESC) }

fun pw_stream_new(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return pw_stream_new_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_stream_destroy Void((Declared(pw_stream))*)
 */
private val pw_stream_destroy_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val pw_stream_destroy_ADDR: MemorySegment by lazy { LOOKUP.find("pw_stream_destroy").orElseThrow() }
private val pw_stream_destroy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_stream_destroy_ADDR, pw_stream_destroy_DESC) }

fun pw_stream_destroy(arg0: MemorySegment): Unit {
    try {
        pw_stream_destroy_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_stream_add_listener Void((Declared(pw_stream))*,(Declared(spa_hook))*,(Declared(pw_stream_events))*,(Void)*)
 */
private val pw_stream_add_listener_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_stream_add_listener_ADDR: MemorySegment by lazy { LOOKUP.find("pw_stream_add_listener").orElseThrow() }
private val pw_stream_add_listener_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_stream_add_listener_ADDR, pw_stream_add_listener_DESC) }

fun pw_stream_add_listener(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Unit {
    try {
        pw_stream_add_listener_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_stream_get_state Declared(pw_stream_state)((Declared(pw_stream))*,((Char)*)*)
 */
private val pw_stream_get_state_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_stream_get_state_ADDR: MemorySegment by lazy { LOOKUP.find("pw_stream_get_state").orElseThrow() }
private val pw_stream_get_state_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_stream_get_state_ADDR, pw_stream_get_state_DESC) }

fun pw_stream_get_state(arg0: MemorySegment, arg1: MemorySegment): pw_stream_state {
    try {
        return pw_stream_state.fromValue((pw_stream_get_state_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_stream_connect Int((Declared(pw_stream))*,Declared(spa_direction),UNSIGNED = Int,Declared(pw_stream_flags),((Declared(spa_pod))*)*,UNSIGNED = Int)
 */
private val pw_stream_connect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val pw_stream_connect_ADDR: MemorySegment by lazy { LOOKUP.find("pw_stream_connect").orElseThrow() }
private val pw_stream_connect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_stream_connect_ADDR, pw_stream_connect_DESC) }

fun pw_stream_connect(arg0: MemorySegment, arg1: spa_direction, arg2: Int, arg3: pw_stream_flags, arg4: MemorySegment, arg5: Int): Int {
    try {
        return pw_stream_connect_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2, arg3.value.toInt(), arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_stream_update_params Int((Declared(pw_stream))*,((Declared(spa_pod))*)*,UNSIGNED = Int)
 */
private val pw_stream_update_params_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val pw_stream_update_params_ADDR: MemorySegment by lazy { LOOKUP.find("pw_stream_update_params").orElseThrow() }
private val pw_stream_update_params_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_stream_update_params_ADDR, pw_stream_update_params_DESC) }

fun pw_stream_update_params(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    try {
        return pw_stream_update_params_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_stream_dequeue_buffer (Declared(pw_buffer))*((Declared(pw_stream))*)
 */
private val pw_stream_dequeue_buffer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_stream_dequeue_buffer_ADDR: MemorySegment by lazy { LOOKUP.find("pw_stream_dequeue_buffer").orElseThrow() }
private val pw_stream_dequeue_buffer_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_stream_dequeue_buffer_ADDR, pw_stream_dequeue_buffer_DESC) }

fun pw_stream_dequeue_buffer(arg0: MemorySegment): MemorySegment {
    try {
        return pw_stream_dequeue_buffer_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_stream_queue_buffer Int((Declared(pw_stream))*,(Declared(pw_buffer))*)
 */
private val pw_stream_queue_buffer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_stream_queue_buffer_ADDR: MemorySegment by lazy { LOOKUP.find("pw_stream_queue_buffer").orElseThrow() }
private val pw_stream_queue_buffer_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_stream_queue_buffer_ADDR, pw_stream_queue_buffer_DESC) }

fun pw_stream_queue_buffer(arg0: MemorySegment, arg1: MemorySegment): Int {
    try {
        return pw_stream_queue_buffer_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_io_type}
 */
enum class spa_io_type(val value: Long) {
    SPA_IO_Invalid(0L), SPA_IO_Buffers(1L), SPA_IO_Range(2L), SPA_IO_Clock(3L), SPA_IO_Latency(4L), SPA_IO_Control(5L), SPA_IO_Notify(6L), SPA_IO_Position(7L), SPA_IO_RateMatch(8L), SPA_IO_Memory(9L);

    companion object {
        fun fromValue(v: Long): spa_io_type = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_io_type value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_io_position_state}
 */
enum class spa_io_position_state(val value: Long) {
    SPA_IO_POSITION_STATE_STOPPED(0L), SPA_IO_POSITION_STATE_STARTING(1L), SPA_IO_POSITION_STATE_RUNNING(2L);

    companion object {
        fun fromValue(v: Long): spa_io_position_state = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_io_position_state value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum pw_filter_state}
 */
enum class pw_filter_state(val value: Long) {
    PW_FILTER_STATE_ERROR(-1L), PW_FILTER_STATE_UNCONNECTED(0L), PW_FILTER_STATE_CONNECTING(1L), PW_FILTER_STATE_PAUSED(2L), PW_FILTER_STATE_STREAMING(3L);

    companion object {
        fun fromValue(v: Long): pw_filter_state = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_filter_state value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum pw_filter_flags}
 */
enum class pw_filter_flags(val value: Long) {
    PW_FILTER_FLAG_NONE(0L), PW_FILTER_FLAG_INACTIVE(1L), PW_FILTER_FLAG_DRIVER(2L), PW_FILTER_FLAG_RT_PROCESS(4L), PW_FILTER_FLAG_CUSTOM_LATENCY(8L), PW_FILTER_FLAG_TRIGGER(16L), PW_FILTER_FLAG_ASYNC(32L);

    companion object {
        fun fromValue(v: Long): pw_filter_flags = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_filter_flags value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum pw_filter_port_flags}
 */
enum class pw_filter_port_flags(val value: Long) {
    PW_FILTER_PORT_FLAG_NONE(0L), PW_FILTER_PORT_FLAG_MAP_BUFFERS(1L), PW_FILTER_PORT_FLAG_ALLOC_BUFFERS(2L);

    companion object {
        fun fromValue(v: Long): pw_filter_port_flags = entries.firstOrNull { it.value == v }
            ?: error("Unknown pw_filter_port_flags value: $v")
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_new (Declared(pw_thread_loop))*((Char)*,(Declared(spa_dict))*)
 */
private val pw_thread_loop_new_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_thread_loop_new_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_new").orElseThrow() }
private val pw_thread_loop_new_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_new_ADDR, pw_thread_loop_new_DESC) }

fun pw_thread_loop_new(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return pw_thread_loop_new_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_destroy Void((Declared(pw_thread_loop))*)
 */
private val pw_thread_loop_destroy_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val pw_thread_loop_destroy_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_destroy").orElseThrow() }
private val pw_thread_loop_destroy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_destroy_ADDR, pw_thread_loop_destroy_DESC) }

fun pw_thread_loop_destroy(arg0: MemorySegment): Unit {
    try {
        pw_thread_loop_destroy_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_get_loop (Declared(pw_loop))*((Declared(pw_thread_loop))*)
 */
private val pw_thread_loop_get_loop_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_thread_loop_get_loop_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_get_loop").orElseThrow() }
private val pw_thread_loop_get_loop_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_get_loop_ADDR, pw_thread_loop_get_loop_DESC) }

fun pw_thread_loop_get_loop(arg0: MemorySegment): MemorySegment {
    try {
        return pw_thread_loop_get_loop_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_start Int((Declared(pw_thread_loop))*)
 */
private val pw_thread_loop_start_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val pw_thread_loop_start_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_start").orElseThrow() }
private val pw_thread_loop_start_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_start_ADDR, pw_thread_loop_start_DESC) }

fun pw_thread_loop_start(arg0: MemorySegment): Int {
    try {
        return pw_thread_loop_start_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_stop Void((Declared(pw_thread_loop))*)
 */
private val pw_thread_loop_stop_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val pw_thread_loop_stop_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_stop").orElseThrow() }
private val pw_thread_loop_stop_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_stop_ADDR, pw_thread_loop_stop_DESC) }

fun pw_thread_loop_stop(arg0: MemorySegment): Unit {
    try {
        pw_thread_loop_stop_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_lock Void((Declared(pw_thread_loop))*)
 */
private val pw_thread_loop_lock_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val pw_thread_loop_lock_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_lock").orElseThrow() }
private val pw_thread_loop_lock_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_lock_ADDR, pw_thread_loop_lock_DESC) }

fun pw_thread_loop_lock(arg0: MemorySegment): Unit {
    try {
        pw_thread_loop_lock_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_unlock Void((Declared(pw_thread_loop))*)
 */
private val pw_thread_loop_unlock_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val pw_thread_loop_unlock_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_unlock").orElseThrow() }
private val pw_thread_loop_unlock_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_unlock_ADDR, pw_thread_loop_unlock_DESC) }

fun pw_thread_loop_unlock(arg0: MemorySegment): Unit {
    try {
        pw_thread_loop_unlock_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_wait Void((Declared(pw_thread_loop))*)
 */
private val pw_thread_loop_wait_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val pw_thread_loop_wait_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_wait").orElseThrow() }
private val pw_thread_loop_wait_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_wait_ADDR, pw_thread_loop_wait_DESC) }

fun pw_thread_loop_wait(arg0: MemorySegment): Unit {
    try {
        pw_thread_loop_wait_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_thread_loop_signal Void((Declared(pw_thread_loop))*,Bool)
 */
private val pw_thread_loop_signal_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val pw_thread_loop_signal_ADDR: MemorySegment by lazy { LOOKUP.find("pw_thread_loop_signal").orElseThrow() }
private val pw_thread_loop_signal_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_thread_loop_signal_ADDR, pw_thread_loop_signal_DESC) }

fun pw_thread_loop_signal(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        pw_thread_loop_signal_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at /usr/include/pipewire-0.3/pipewire/type.h:23:1)}
 */
enum class enum_unnamed_at_usr_include_pipewire_0_3_pipewire_type_h_23_1_(val value: Long) {
    PW_TYPE_FIRST(33554432L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_usr_include_pipewire_0_3_pipewire_type_h_23_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_usr_include_pipewire_0_3_pipewire_type_h_23_1_ value: $v")
    }
}

/**
 * {@snippet lang=c : pw_init Void((Int)*,(((Char)*)*)*)
 */
private val pw_init_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val pw_init_ADDR: MemorySegment by lazy { LOOKUP.find("pw_init").orElseThrow() }
private val pw_init_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_init_ADDR, pw_init_DESC) }

fun pw_init(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        pw_init_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : pw_deinit Void()
 */
private val pw_deinit_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val pw_deinit_ADDR: MemorySegment by lazy { LOOKUP.find("pw_deinit").orElseThrow() }
private val pw_deinit_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(pw_deinit_ADDR, pw_deinit_DESC) }

fun pw_deinit(): Unit {
    try {
        pw_deinit_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_prop_info}
 */
enum class spa_prop_info(val value: Long) {
    SPA_PROP_INFO_START(0L), SPA_PROP_INFO_id(1L), SPA_PROP_INFO_name(2L), SPA_PROP_INFO_type(3L), SPA_PROP_INFO_labels(4L), SPA_PROP_INFO_container(5L), SPA_PROP_INFO_params(6L), SPA_PROP_INFO_description(7L);

    companion object {
        fun fromValue(v: Long): spa_prop_info = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_prop_info value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_prop}
 */
enum class spa_prop(val value: Long) {
    SPA_PROP_START(0L), SPA_PROP_unknown(1L), SPA_PROP_START_Device(256L), SPA_PROP_device(257L), SPA_PROP_deviceName(258L), SPA_PROP_deviceFd(259L), SPA_PROP_card(260L), SPA_PROP_cardName(261L), SPA_PROP_minLatency(262L), SPA_PROP_maxLatency(263L), SPA_PROP_periods(264L), SPA_PROP_periodSize(265L), SPA_PROP_periodEvent(266L), SPA_PROP_live(267L), SPA_PROP_rate(268L), SPA_PROP_quality(269L), SPA_PROP_bluetoothAudioCodec(270L), SPA_PROP_bluetoothOffloadActive(271L), SPA_PROP_START_Audio(65536L), SPA_PROP_waveType(65537L), SPA_PROP_frequency(65538L), SPA_PROP_volume(65539L), SPA_PROP_mute(65540L), SPA_PROP_patternType(65541L), SPA_PROP_ditherType(65542L), SPA_PROP_truncate(65543L), SPA_PROP_channelVolumes(65544L), SPA_PROP_volumeBase(65545L), SPA_PROP_volumeStep(65546L), SPA_PROP_channelMap(65547L), SPA_PROP_monitorMute(65548L), SPA_PROP_monitorVolumes(65549L), SPA_PROP_latencyOffsetNsec(65550L), SPA_PROP_softMute(65551L), SPA_PROP_softVolumes(65552L), SPA_PROP_iec958Codecs(65553L), SPA_PROP_volumeRampSamples(65554L), SPA_PROP_volumeRampStepSamples(65555L), SPA_PROP_volumeRampTime(65556L), SPA_PROP_volumeRampStepTime(65557L), SPA_PROP_volumeRampScale(65558L), SPA_PROP_START_Video(131072L), SPA_PROP_brightness(131073L), SPA_PROP_contrast(131074L), SPA_PROP_saturation(131075L), SPA_PROP_hue(131076L), SPA_PROP_gamma(131077L), SPA_PROP_exposure(131078L), SPA_PROP_gain(131079L), SPA_PROP_sharpness(131080L), SPA_PROP_START_Other(524288L), SPA_PROP_params(524289L), SPA_PROP_START_CUSTOM(16777216L);

    companion object {
        fun fromValue(v: Long): spa_prop = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_prop value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_media_type}
 */
enum class spa_media_type(val value: Long) {
    SPA_MEDIA_TYPE_unknown(0L), SPA_MEDIA_TYPE_audio(1L), SPA_MEDIA_TYPE_video(2L), SPA_MEDIA_TYPE_image(3L), SPA_MEDIA_TYPE_binary(4L), SPA_MEDIA_TYPE_stream(5L), SPA_MEDIA_TYPE_application(6L);

    companion object {
        fun fromValue(v: Long): spa_media_type = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_media_type value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_media_subtype}
 */
enum class spa_media_subtype(val value: Long) {
    SPA_MEDIA_SUBTYPE_unknown(0L), SPA_MEDIA_SUBTYPE_raw(1L), SPA_MEDIA_SUBTYPE_dsp(2L), SPA_MEDIA_SUBTYPE_iec958(3L), SPA_MEDIA_SUBTYPE_dsd(4L), SPA_MEDIA_SUBTYPE_START_Audio(65536L), SPA_MEDIA_SUBTYPE_mp3(65537L), SPA_MEDIA_SUBTYPE_aac(65538L), SPA_MEDIA_SUBTYPE_vorbis(65539L), SPA_MEDIA_SUBTYPE_wma(65540L), SPA_MEDIA_SUBTYPE_ra(65541L), SPA_MEDIA_SUBTYPE_sbc(65542L), SPA_MEDIA_SUBTYPE_adpcm(65543L), SPA_MEDIA_SUBTYPE_g723(65544L), SPA_MEDIA_SUBTYPE_g726(65545L), SPA_MEDIA_SUBTYPE_g729(65546L), SPA_MEDIA_SUBTYPE_amr(65547L), SPA_MEDIA_SUBTYPE_gsm(65548L), SPA_MEDIA_SUBTYPE_alac(65549L), SPA_MEDIA_SUBTYPE_flac(65550L), SPA_MEDIA_SUBTYPE_ape(65551L), SPA_MEDIA_SUBTYPE_opus(65552L), SPA_MEDIA_SUBTYPE_START_Video(131072L), SPA_MEDIA_SUBTYPE_h264(131073L), SPA_MEDIA_SUBTYPE_mjpg(131074L), SPA_MEDIA_SUBTYPE_dv(131075L), SPA_MEDIA_SUBTYPE_mpegts(131076L), SPA_MEDIA_SUBTYPE_h263(131077L), SPA_MEDIA_SUBTYPE_mpeg1(131078L), SPA_MEDIA_SUBTYPE_mpeg2(131079L), SPA_MEDIA_SUBTYPE_mpeg4(131080L), SPA_MEDIA_SUBTYPE_xvid(131081L), SPA_MEDIA_SUBTYPE_vc1(131082L), SPA_MEDIA_SUBTYPE_vp8(131083L), SPA_MEDIA_SUBTYPE_vp9(131084L), SPA_MEDIA_SUBTYPE_bayer(131085L), SPA_MEDIA_SUBTYPE_START_Image(196608L), SPA_MEDIA_SUBTYPE_jpeg(196609L), SPA_MEDIA_SUBTYPE_START_Binary(262144L), SPA_MEDIA_SUBTYPE_START_Stream(327680L), SPA_MEDIA_SUBTYPE_midi(327681L), SPA_MEDIA_SUBTYPE_START_Application(393216L), SPA_MEDIA_SUBTYPE_control(393217L);

    companion object {
        fun fromValue(v: Long): spa_media_subtype = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_media_subtype value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_format}
 */
enum class spa_format(val value: Long) {
    SPA_FORMAT_START(0L), SPA_FORMAT_mediaType(1L), SPA_FORMAT_mediaSubtype(2L), SPA_FORMAT_START_Audio(65536L), SPA_FORMAT_AUDIO_format(65537L), SPA_FORMAT_AUDIO_flags(65538L), SPA_FORMAT_AUDIO_rate(65539L), SPA_FORMAT_AUDIO_channels(65540L), SPA_FORMAT_AUDIO_position(65541L), SPA_FORMAT_AUDIO_iec958Codec(65542L), SPA_FORMAT_AUDIO_bitorder(65543L), SPA_FORMAT_AUDIO_interleave(65544L), SPA_FORMAT_AUDIO_bitrate(65545L), SPA_FORMAT_AUDIO_blockAlign(65546L), SPA_FORMAT_AUDIO_AAC_streamFormat(65547L), SPA_FORMAT_AUDIO_WMA_profile(65548L), SPA_FORMAT_AUDIO_AMR_bandMode(65549L), SPA_FORMAT_START_Video(131072L), SPA_FORMAT_VIDEO_format(131073L), SPA_FORMAT_VIDEO_modifier(131074L), SPA_FORMAT_VIDEO_size(131075L), SPA_FORMAT_VIDEO_framerate(131076L), SPA_FORMAT_VIDEO_maxFramerate(131077L), SPA_FORMAT_VIDEO_views(131078L), SPA_FORMAT_VIDEO_interlaceMode(131079L), SPA_FORMAT_VIDEO_pixelAspectRatio(131080L), SPA_FORMAT_VIDEO_multiviewMode(131081L), SPA_FORMAT_VIDEO_multiviewFlags(131082L), SPA_FORMAT_VIDEO_chromaSite(131083L), SPA_FORMAT_VIDEO_colorRange(131084L), SPA_FORMAT_VIDEO_colorMatrix(131085L), SPA_FORMAT_VIDEO_transferFunction(131086L), SPA_FORMAT_VIDEO_colorPrimaries(131087L), SPA_FORMAT_VIDEO_profile(131088L), SPA_FORMAT_VIDEO_level(131089L), SPA_FORMAT_VIDEO_H264_streamFormat(131090L), SPA_FORMAT_VIDEO_H264_alignment(131091L), SPA_FORMAT_START_Image(196608L), SPA_FORMAT_START_Binary(262144L), SPA_FORMAT_START_Stream(327680L), SPA_FORMAT_START_Application(393216L);

    companion object {
        fun fromValue(v: Long): spa_format = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_format value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_audio_format}
 */
enum class spa_audio_format(val value: Long) {
    SPA_AUDIO_FORMAT_UNKNOWN(0L), SPA_AUDIO_FORMAT_ENCODED(1L), SPA_AUDIO_FORMAT_START_Interleaved(256L), SPA_AUDIO_FORMAT_S8(257L), SPA_AUDIO_FORMAT_U8(258L), SPA_AUDIO_FORMAT_S16_LE(259L), SPA_AUDIO_FORMAT_S16_BE(260L), SPA_AUDIO_FORMAT_U16_LE(261L), SPA_AUDIO_FORMAT_U16_BE(262L), SPA_AUDIO_FORMAT_S24_32_LE(263L), SPA_AUDIO_FORMAT_S24_32_BE(264L), SPA_AUDIO_FORMAT_U24_32_LE(265L), SPA_AUDIO_FORMAT_U24_32_BE(266L), SPA_AUDIO_FORMAT_S32_LE(267L), SPA_AUDIO_FORMAT_S32_BE(268L), SPA_AUDIO_FORMAT_U32_LE(269L), SPA_AUDIO_FORMAT_U32_BE(270L), SPA_AUDIO_FORMAT_S24_LE(271L), SPA_AUDIO_FORMAT_S24_BE(272L), SPA_AUDIO_FORMAT_U24_LE(273L), SPA_AUDIO_FORMAT_U24_BE(274L), SPA_AUDIO_FORMAT_S20_LE(275L), SPA_AUDIO_FORMAT_S20_BE(276L), SPA_AUDIO_FORMAT_U20_LE(277L), SPA_AUDIO_FORMAT_U20_BE(278L), SPA_AUDIO_FORMAT_S18_LE(279L), SPA_AUDIO_FORMAT_S18_BE(280L), SPA_AUDIO_FORMAT_U18_LE(281L), SPA_AUDIO_FORMAT_U18_BE(282L), SPA_AUDIO_FORMAT_F32_LE(283L), SPA_AUDIO_FORMAT_F32_BE(284L), SPA_AUDIO_FORMAT_F64_LE(285L), SPA_AUDIO_FORMAT_F64_BE(286L), SPA_AUDIO_FORMAT_ULAW(287L), SPA_AUDIO_FORMAT_ALAW(288L), SPA_AUDIO_FORMAT_START_Planar(512L), SPA_AUDIO_FORMAT_U8P(513L), SPA_AUDIO_FORMAT_S16P(514L), SPA_AUDIO_FORMAT_S24_32P(515L), SPA_AUDIO_FORMAT_S32P(516L), SPA_AUDIO_FORMAT_S24P(517L), SPA_AUDIO_FORMAT_F32P(518L), SPA_AUDIO_FORMAT_F64P(519L), SPA_AUDIO_FORMAT_S8P(520L), SPA_AUDIO_FORMAT_START_Other(1024L), SPA_AUDIO_FORMAT_DSP_S32(515L), SPA_AUDIO_FORMAT_DSP_F32(518L), SPA_AUDIO_FORMAT_DSP_F64(519L), SPA_AUDIO_FORMAT_S16(259L), SPA_AUDIO_FORMAT_U16(261L), SPA_AUDIO_FORMAT_S24_32(263L), SPA_AUDIO_FORMAT_U24_32(265L), SPA_AUDIO_FORMAT_S32(267L), SPA_AUDIO_FORMAT_U32(269L), SPA_AUDIO_FORMAT_S24(271L), SPA_AUDIO_FORMAT_U24(273L), SPA_AUDIO_FORMAT_S20(275L), SPA_AUDIO_FORMAT_U20(277L), SPA_AUDIO_FORMAT_S18(279L), SPA_AUDIO_FORMAT_U18(281L), SPA_AUDIO_FORMAT_F32(283L), SPA_AUDIO_FORMAT_F64(285L), SPA_AUDIO_FORMAT_S16_OE(260L), SPA_AUDIO_FORMAT_U16_OE(262L), SPA_AUDIO_FORMAT_S24_32_OE(264L), SPA_AUDIO_FORMAT_U24_32_OE(266L), SPA_AUDIO_FORMAT_S32_OE(268L), SPA_AUDIO_FORMAT_U32_OE(270L), SPA_AUDIO_FORMAT_S24_OE(272L), SPA_AUDIO_FORMAT_U24_OE(274L), SPA_AUDIO_FORMAT_S20_OE(276L), SPA_AUDIO_FORMAT_U20_OE(278L), SPA_AUDIO_FORMAT_S18_OE(280L), SPA_AUDIO_FORMAT_U18_OE(282L), SPA_AUDIO_FORMAT_F32_OE(284L), SPA_AUDIO_FORMAT_F64_OE(286L);

    companion object {
        fun fromValue(v: Long): spa_audio_format = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_audio_format value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_audio_channel}
 */
enum class spa_audio_channel(val value: Long) {
    SPA_AUDIO_CHANNEL_UNKNOWN(0L), SPA_AUDIO_CHANNEL_NA(1L), SPA_AUDIO_CHANNEL_MONO(2L), SPA_AUDIO_CHANNEL_FL(3L), SPA_AUDIO_CHANNEL_FR(4L), SPA_AUDIO_CHANNEL_FC(5L), SPA_AUDIO_CHANNEL_LFE(6L), SPA_AUDIO_CHANNEL_SL(7L), SPA_AUDIO_CHANNEL_SR(8L), SPA_AUDIO_CHANNEL_FLC(9L), SPA_AUDIO_CHANNEL_FRC(10L), SPA_AUDIO_CHANNEL_RC(11L), SPA_AUDIO_CHANNEL_RL(12L), SPA_AUDIO_CHANNEL_RR(13L), SPA_AUDIO_CHANNEL_TC(14L), SPA_AUDIO_CHANNEL_TFL(15L), SPA_AUDIO_CHANNEL_TFC(16L), SPA_AUDIO_CHANNEL_TFR(17L), SPA_AUDIO_CHANNEL_TRL(18L), SPA_AUDIO_CHANNEL_TRC(19L), SPA_AUDIO_CHANNEL_TRR(20L), SPA_AUDIO_CHANNEL_RLC(21L), SPA_AUDIO_CHANNEL_RRC(22L), SPA_AUDIO_CHANNEL_FLW(23L), SPA_AUDIO_CHANNEL_FRW(24L), SPA_AUDIO_CHANNEL_LFE2(25L), SPA_AUDIO_CHANNEL_FLH(26L), SPA_AUDIO_CHANNEL_FCH(27L), SPA_AUDIO_CHANNEL_FRH(28L), SPA_AUDIO_CHANNEL_TFLC(29L), SPA_AUDIO_CHANNEL_TFRC(30L), SPA_AUDIO_CHANNEL_TSL(31L), SPA_AUDIO_CHANNEL_TSR(32L), SPA_AUDIO_CHANNEL_LLFE(33L), SPA_AUDIO_CHANNEL_RLFE(34L), SPA_AUDIO_CHANNEL_BC(35L), SPA_AUDIO_CHANNEL_BLC(36L), SPA_AUDIO_CHANNEL_BRC(37L), SPA_AUDIO_CHANNEL_START_Aux(4096L), SPA_AUDIO_CHANNEL_AUX0(4096L), SPA_AUDIO_CHANNEL_AUX1(4097L), SPA_AUDIO_CHANNEL_AUX2(4098L), SPA_AUDIO_CHANNEL_AUX3(4099L), SPA_AUDIO_CHANNEL_AUX4(4100L), SPA_AUDIO_CHANNEL_AUX5(4101L), SPA_AUDIO_CHANNEL_AUX6(4102L), SPA_AUDIO_CHANNEL_AUX7(4103L), SPA_AUDIO_CHANNEL_AUX8(4104L), SPA_AUDIO_CHANNEL_AUX9(4105L), SPA_AUDIO_CHANNEL_AUX10(4106L), SPA_AUDIO_CHANNEL_AUX11(4107L), SPA_AUDIO_CHANNEL_AUX12(4108L), SPA_AUDIO_CHANNEL_AUX13(4109L), SPA_AUDIO_CHANNEL_AUX14(4110L), SPA_AUDIO_CHANNEL_AUX15(4111L), SPA_AUDIO_CHANNEL_AUX16(4112L), SPA_AUDIO_CHANNEL_AUX17(4113L), SPA_AUDIO_CHANNEL_AUX18(4114L), SPA_AUDIO_CHANNEL_AUX19(4115L), SPA_AUDIO_CHANNEL_AUX20(4116L), SPA_AUDIO_CHANNEL_AUX21(4117L), SPA_AUDIO_CHANNEL_AUX22(4118L), SPA_AUDIO_CHANNEL_AUX23(4119L), SPA_AUDIO_CHANNEL_AUX24(4120L), SPA_AUDIO_CHANNEL_AUX25(4121L), SPA_AUDIO_CHANNEL_AUX26(4122L), SPA_AUDIO_CHANNEL_AUX27(4123L), SPA_AUDIO_CHANNEL_AUX28(4124L), SPA_AUDIO_CHANNEL_AUX29(4125L), SPA_AUDIO_CHANNEL_AUX30(4126L), SPA_AUDIO_CHANNEL_AUX31(4127L), SPA_AUDIO_CHANNEL_AUX32(4128L), SPA_AUDIO_CHANNEL_AUX33(4129L), SPA_AUDIO_CHANNEL_AUX34(4130L), SPA_AUDIO_CHANNEL_AUX35(4131L), SPA_AUDIO_CHANNEL_AUX36(4132L), SPA_AUDIO_CHANNEL_AUX37(4133L), SPA_AUDIO_CHANNEL_AUX38(4134L), SPA_AUDIO_CHANNEL_AUX39(4135L), SPA_AUDIO_CHANNEL_AUX40(4136L), SPA_AUDIO_CHANNEL_AUX41(4137L), SPA_AUDIO_CHANNEL_AUX42(4138L), SPA_AUDIO_CHANNEL_AUX43(4139L), SPA_AUDIO_CHANNEL_AUX44(4140L), SPA_AUDIO_CHANNEL_AUX45(4141L), SPA_AUDIO_CHANNEL_AUX46(4142L), SPA_AUDIO_CHANNEL_AUX47(4143L), SPA_AUDIO_CHANNEL_AUX48(4144L), SPA_AUDIO_CHANNEL_AUX49(4145L), SPA_AUDIO_CHANNEL_AUX50(4146L), SPA_AUDIO_CHANNEL_AUX51(4147L), SPA_AUDIO_CHANNEL_AUX52(4148L), SPA_AUDIO_CHANNEL_AUX53(4149L), SPA_AUDIO_CHANNEL_AUX54(4150L), SPA_AUDIO_CHANNEL_AUX55(4151L), SPA_AUDIO_CHANNEL_AUX56(4152L), SPA_AUDIO_CHANNEL_AUX57(4153L), SPA_AUDIO_CHANNEL_AUX58(4154L), SPA_AUDIO_CHANNEL_AUX59(4155L), SPA_AUDIO_CHANNEL_AUX60(4156L), SPA_AUDIO_CHANNEL_AUX61(4157L), SPA_AUDIO_CHANNEL_AUX62(4158L), SPA_AUDIO_CHANNEL_AUX63(4159L), SPA_AUDIO_CHANNEL_LAST_Aux(8191L), SPA_AUDIO_CHANNEL_START_Custom(65536L);

    companion object {
        fun fromValue(v: Long): spa_audio_channel = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_audio_channel value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_audio_volume_ramp_scale}
 */
enum class spa_audio_volume_ramp_scale(val value: Long) {
    SPA_AUDIO_VOLUME_RAMP_INVALID(0L), SPA_AUDIO_VOLUME_RAMP_LINEAR(1L), SPA_AUDIO_VOLUME_RAMP_CUBIC(2L);

    companion object {
        fun fromValue(v: Long): spa_audio_volume_ramp_scale = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_audio_volume_ramp_scale value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_audio_iec958_codec}
 */
enum class spa_audio_iec958_codec(val value: Long) {
    SPA_AUDIO_IEC958_CODEC_UNKNOWN(0L), SPA_AUDIO_IEC958_CODEC_PCM(1L), SPA_AUDIO_IEC958_CODEC_DTS(2L), SPA_AUDIO_IEC958_CODEC_AC3(3L), SPA_AUDIO_IEC958_CODEC_MPEG(4L), SPA_AUDIO_IEC958_CODEC_MPEG2_AAC(5L), SPA_AUDIO_IEC958_CODEC_EAC3(6L), SPA_AUDIO_IEC958_CODEC_TRUEHD(7L), SPA_AUDIO_IEC958_CODEC_DTSHD(8L);

    companion object {
        fun fromValue(v: Long): spa_audio_iec958_codec = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_audio_iec958_codec value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_audio_mp3_channel_mode}
 */
enum class spa_audio_mp3_channel_mode(val value: Long) {
    SPA_AUDIO_MP3_CHANNEL_MODE_UNKNOWN(0L), SPA_AUDIO_MP3_CHANNEL_MODE_MONO(1L), SPA_AUDIO_MP3_CHANNEL_MODE_STEREO(2L), SPA_AUDIO_MP3_CHANNEL_MODE_JOINTSTEREO(3L), SPA_AUDIO_MP3_CHANNEL_MODE_DUAL(4L);

    companion object {
        fun fromValue(v: Long): spa_audio_mp3_channel_mode = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_audio_mp3_channel_mode value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_audio_aac_stream_format}
 */
enum class spa_audio_aac_stream_format(val value: Long) {
    SPA_AUDIO_AAC_STREAM_FORMAT_UNKNOWN(0L), SPA_AUDIO_AAC_STREAM_FORMAT_RAW(1L), SPA_AUDIO_AAC_STREAM_FORMAT_MP2ADTS(2L), SPA_AUDIO_AAC_STREAM_FORMAT_MP4ADTS(3L), SPA_AUDIO_AAC_STREAM_FORMAT_MP4LOAS(4L), SPA_AUDIO_AAC_STREAM_FORMAT_MP4LATM(5L), SPA_AUDIO_AAC_STREAM_FORMAT_ADIF(6L), SPA_AUDIO_AAC_STREAM_FORMAT_MP4FF(7L), SPA_AUDIO_AAC_STREAM_FORMAT_CUSTOM(65536L);

    companion object {
        fun fromValue(v: Long): spa_audio_aac_stream_format = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_audio_aac_stream_format value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_audio_wma_profile}
 */
enum class spa_audio_wma_profile(val value: Long) {
    SPA_AUDIO_WMA_PROFILE_UNKNOWN(0L), SPA_AUDIO_WMA_PROFILE_WMA7(1L), SPA_AUDIO_WMA_PROFILE_WMA8(2L), SPA_AUDIO_WMA_PROFILE_WMA9(3L), SPA_AUDIO_WMA_PROFILE_WMA10(4L), SPA_AUDIO_WMA_PROFILE_WMA9_PRO(5L), SPA_AUDIO_WMA_PROFILE_WMA9_LOSSLESS(6L), SPA_AUDIO_WMA_PROFILE_WMA10_LOSSLESS(7L), SPA_AUDIO_WMA_PROFILE_CUSTOM(65536L);

    companion object {
        fun fromValue(v: Long): spa_audio_wma_profile = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_audio_wma_profile value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_audio_amr_band_mode}
 */
enum class spa_audio_amr_band_mode(val value: Long) {
    SPA_AUDIO_AMR_BAND_MODE_UNKNOWN(0L), SPA_AUDIO_AMR_BAND_MODE_NB(1L), SPA_AUDIO_AMR_BAND_MODE_WB(2L);

    companion object {
        fun fromValue(v: Long): spa_audio_amr_band_mode = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_audio_amr_band_mode value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_chroma_site}
 */
enum class spa_video_chroma_site(val value: Long) {
    SPA_VIDEO_CHROMA_SITE_UNKNOWN(0L), SPA_VIDEO_CHROMA_SITE_NONE(1L), SPA_VIDEO_CHROMA_SITE_H_COSITED(2L), SPA_VIDEO_CHROMA_SITE_V_COSITED(4L), SPA_VIDEO_CHROMA_SITE_ALT_LINE(8L), SPA_VIDEO_CHROMA_SITE_COSITED(6L), SPA_VIDEO_CHROMA_SITE_JPEG(1L), SPA_VIDEO_CHROMA_SITE_MPEG2(2L), SPA_VIDEO_CHROMA_SITE_DV(14L);

    companion object {
        fun fromValue(v: Long): spa_video_chroma_site = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_chroma_site value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_color_range}
 */
enum class spa_video_color_range(val value: Long) {
    SPA_VIDEO_COLOR_RANGE_UNKNOWN(0L), SPA_VIDEO_COLOR_RANGE_0_255(1L), SPA_VIDEO_COLOR_RANGE_16_235(2L);

    companion object {
        fun fromValue(v: Long): spa_video_color_range = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_color_range value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_color_matrix}
 */
enum class spa_video_color_matrix(val value: Long) {
    SPA_VIDEO_COLOR_MATRIX_UNKNOWN(0L), SPA_VIDEO_COLOR_MATRIX_RGB(1L), SPA_VIDEO_COLOR_MATRIX_FCC(2L), SPA_VIDEO_COLOR_MATRIX_BT709(3L), SPA_VIDEO_COLOR_MATRIX_BT601(4L), SPA_VIDEO_COLOR_MATRIX_SMPTE240M(5L), SPA_VIDEO_COLOR_MATRIX_BT2020(6L);

    companion object {
        fun fromValue(v: Long): spa_video_color_matrix = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_color_matrix value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_transfer_function}
 */
enum class spa_video_transfer_function(val value: Long) {
    SPA_VIDEO_TRANSFER_UNKNOWN(0L), SPA_VIDEO_TRANSFER_GAMMA10(1L), SPA_VIDEO_TRANSFER_GAMMA18(2L), SPA_VIDEO_TRANSFER_GAMMA20(3L), SPA_VIDEO_TRANSFER_GAMMA22(4L), SPA_VIDEO_TRANSFER_BT709(5L), SPA_VIDEO_TRANSFER_SMPTE240M(6L), SPA_VIDEO_TRANSFER_SRGB(7L), SPA_VIDEO_TRANSFER_GAMMA28(8L), SPA_VIDEO_TRANSFER_LOG100(9L), SPA_VIDEO_TRANSFER_LOG316(10L), SPA_VIDEO_TRANSFER_BT2020_12(11L), SPA_VIDEO_TRANSFER_ADOBERGB(12L);

    companion object {
        fun fromValue(v: Long): spa_video_transfer_function = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_transfer_function value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_color_primaries}
 */
enum class spa_video_color_primaries(val value: Long) {
    SPA_VIDEO_COLOR_PRIMARIES_UNKNOWN(0L), SPA_VIDEO_COLOR_PRIMARIES_BT709(1L), SPA_VIDEO_COLOR_PRIMARIES_BT470M(2L), SPA_VIDEO_COLOR_PRIMARIES_BT470BG(3L), SPA_VIDEO_COLOR_PRIMARIES_SMPTE170M(4L), SPA_VIDEO_COLOR_PRIMARIES_SMPTE240M(5L), SPA_VIDEO_COLOR_PRIMARIES_FILM(6L), SPA_VIDEO_COLOR_PRIMARIES_BT2020(7L), SPA_VIDEO_COLOR_PRIMARIES_ADOBERGB(8L);

    companion object {
        fun fromValue(v: Long): spa_video_color_primaries = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_color_primaries value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_multiview_mode}
 */
enum class spa_video_multiview_mode(val value: Long) {
    SPA_VIDEO_MULTIVIEW_MODE_NONE(-1L), SPA_VIDEO_MULTIVIEW_MODE_MONO(0L), SPA_VIDEO_MULTIVIEW_MODE_LEFT(1L), SPA_VIDEO_MULTIVIEW_MODE_RIGHT(2L), SPA_VIDEO_MULTIVIEW_MODE_SIDE_BY_SIDE(3L), SPA_VIDEO_MULTIVIEW_MODE_SIDE_BY_SIDE_QUINCUNX(4L), SPA_VIDEO_MULTIVIEW_MODE_COLUMN_INTERLEAVED(5L), SPA_VIDEO_MULTIVIEW_MODE_ROW_INTERLEAVED(6L), SPA_VIDEO_MULTIVIEW_MODE_TOP_BOTTOM(7L), SPA_VIDEO_MULTIVIEW_MODE_CHECKERBOARD(8L), SPA_VIDEO_MULTIVIEW_MODE_FRAME_BY_FRAME(32L), SPA_VIDEO_MULTIVIEW_MODE_MULTIVIEW_FRAME_BY_FRAME(33L), SPA_VIDEO_MULTIVIEW_MODE_SEPARATED(34L);

    companion object {
        fun fromValue(v: Long): spa_video_multiview_mode = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_multiview_mode value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_multiview_flags}
 */
enum class spa_video_multiview_flags(val value: Long) {
    SPA_VIDEO_MULTIVIEW_FLAGS_NONE(0L), SPA_VIDEO_MULTIVIEW_FLAGS_RIGHT_VIEW_FIRST(1L), SPA_VIDEO_MULTIVIEW_FLAGS_LEFT_FLIPPED(2L), SPA_VIDEO_MULTIVIEW_FLAGS_LEFT_FLOPPED(4L), SPA_VIDEO_MULTIVIEW_FLAGS_RIGHT_FLIPPED(8L), SPA_VIDEO_MULTIVIEW_FLAGS_RIGHT_FLOPPED(16L), SPA_VIDEO_MULTIVIEW_FLAGS_HALF_ASPECT(16384L), SPA_VIDEO_MULTIVIEW_FLAGS_MIXED_MONO(32768L);

    companion object {
        fun fromValue(v: Long): spa_video_multiview_flags = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_multiview_flags value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_format}
 */
enum class spa_video_format(val value: Long) {
    SPA_VIDEO_FORMAT_UNKNOWN(0L), SPA_VIDEO_FORMAT_ENCODED(1L), SPA_VIDEO_FORMAT_I420(2L), SPA_VIDEO_FORMAT_YV12(3L), SPA_VIDEO_FORMAT_YUY2(4L), SPA_VIDEO_FORMAT_UYVY(5L), SPA_VIDEO_FORMAT_AYUV(6L), SPA_VIDEO_FORMAT_RGBx(7L), SPA_VIDEO_FORMAT_BGRx(8L), SPA_VIDEO_FORMAT_xRGB(9L), SPA_VIDEO_FORMAT_xBGR(10L), SPA_VIDEO_FORMAT_RGBA(11L), SPA_VIDEO_FORMAT_BGRA(12L), SPA_VIDEO_FORMAT_ARGB(13L), SPA_VIDEO_FORMAT_ABGR(14L), SPA_VIDEO_FORMAT_RGB(15L), SPA_VIDEO_FORMAT_BGR(16L), SPA_VIDEO_FORMAT_Y41B(17L), SPA_VIDEO_FORMAT_Y42B(18L), SPA_VIDEO_FORMAT_YVYU(19L), SPA_VIDEO_FORMAT_Y444(20L), SPA_VIDEO_FORMAT_v210(21L), SPA_VIDEO_FORMAT_v216(22L), SPA_VIDEO_FORMAT_NV12(23L), SPA_VIDEO_FORMAT_NV21(24L), SPA_VIDEO_FORMAT_GRAY8(25L), SPA_VIDEO_FORMAT_GRAY16_BE(26L), SPA_VIDEO_FORMAT_GRAY16_LE(27L), SPA_VIDEO_FORMAT_v308(28L), SPA_VIDEO_FORMAT_RGB16(29L), SPA_VIDEO_FORMAT_BGR16(30L), SPA_VIDEO_FORMAT_RGB15(31L), SPA_VIDEO_FORMAT_BGR15(32L), SPA_VIDEO_FORMAT_UYVP(33L), SPA_VIDEO_FORMAT_A420(34L), SPA_VIDEO_FORMAT_RGB8P(35L), SPA_VIDEO_FORMAT_YUV9(36L), SPA_VIDEO_FORMAT_YVU9(37L), SPA_VIDEO_FORMAT_IYU1(38L), SPA_VIDEO_FORMAT_ARGB64(39L), SPA_VIDEO_FORMAT_AYUV64(40L), SPA_VIDEO_FORMAT_r210(41L), SPA_VIDEO_FORMAT_I420_10BE(42L), SPA_VIDEO_FORMAT_I420_10LE(43L), SPA_VIDEO_FORMAT_I422_10BE(44L), SPA_VIDEO_FORMAT_I422_10LE(45L), SPA_VIDEO_FORMAT_Y444_10BE(46L), SPA_VIDEO_FORMAT_Y444_10LE(47L), SPA_VIDEO_FORMAT_GBR(48L), SPA_VIDEO_FORMAT_GBR_10BE(49L), SPA_VIDEO_FORMAT_GBR_10LE(50L), SPA_VIDEO_FORMAT_NV16(51L), SPA_VIDEO_FORMAT_NV24(52L), SPA_VIDEO_FORMAT_NV12_64Z32(53L), SPA_VIDEO_FORMAT_A420_10BE(54L), SPA_VIDEO_FORMAT_A420_10LE(55L), SPA_VIDEO_FORMAT_A422_10BE(56L), SPA_VIDEO_FORMAT_A422_10LE(57L), SPA_VIDEO_FORMAT_A444_10BE(58L), SPA_VIDEO_FORMAT_A444_10LE(59L), SPA_VIDEO_FORMAT_NV61(60L), SPA_VIDEO_FORMAT_P010_10BE(61L), SPA_VIDEO_FORMAT_P010_10LE(62L), SPA_VIDEO_FORMAT_IYU2(63L), SPA_VIDEO_FORMAT_VYUY(64L), SPA_VIDEO_FORMAT_GBRA(65L), SPA_VIDEO_FORMAT_GBRA_10BE(66L), SPA_VIDEO_FORMAT_GBRA_10LE(67L), SPA_VIDEO_FORMAT_GBR_12BE(68L), SPA_VIDEO_FORMAT_GBR_12LE(69L), SPA_VIDEO_FORMAT_GBRA_12BE(70L), SPA_VIDEO_FORMAT_GBRA_12LE(71L), SPA_VIDEO_FORMAT_I420_12BE(72L), SPA_VIDEO_FORMAT_I420_12LE(73L), SPA_VIDEO_FORMAT_I422_12BE(74L), SPA_VIDEO_FORMAT_I422_12LE(75L), SPA_VIDEO_FORMAT_Y444_12BE(76L), SPA_VIDEO_FORMAT_Y444_12LE(77L), SPA_VIDEO_FORMAT_RGBA_F16(78L), SPA_VIDEO_FORMAT_RGBA_F32(79L), SPA_VIDEO_FORMAT_xRGB_210LE(80L), SPA_VIDEO_FORMAT_xBGR_210LE(81L), SPA_VIDEO_FORMAT_RGBx_102LE(82L), SPA_VIDEO_FORMAT_BGRx_102LE(83L), SPA_VIDEO_FORMAT_ARGB_210LE(84L), SPA_VIDEO_FORMAT_ABGR_210LE(85L), SPA_VIDEO_FORMAT_RGBA_102LE(86L), SPA_VIDEO_FORMAT_BGRA_102LE(87L), SPA_VIDEO_FORMAT_DSP_F32(79L);

    companion object {
        fun fromValue(v: Long): spa_video_format = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_format value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_flags}
 */
enum class spa_video_flags(val value: Long) {
    SPA_VIDEO_FLAG_NONE(0L), SPA_VIDEO_FLAG_VARIABLE_FPS(1L), SPA_VIDEO_FLAG_PREMULTIPLIED_ALPHA(2L), SPA_VIDEO_FLAG_MODIFIER(4L), SPA_VIDEO_FLAG_MODIFIER_FIXATION_REQUIRED(8L);

    companion object {
        fun fromValue(v: Long): spa_video_flags = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_flags value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum spa_video_interlace_mode}
 */
enum class spa_video_interlace_mode(val value: Long) {
    SPA_VIDEO_INTERLACE_MODE_PROGRESSIVE(0L), SPA_VIDEO_INTERLACE_MODE_INTERLEAVED(1L), SPA_VIDEO_INTERLACE_MODE_MIXED(2L), SPA_VIDEO_INTERLACE_MODE_FIELDS(3L);

    companion object {
        fun fromValue(v: Long): spa_video_interlace_mode = entries.firstOrNull { it.value == v }
            ?: error("Unknown spa_video_interlace_mode value: $v")
    }
}

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_STATE_ERROR -1
 */
fun KFFI_PW_STREAM_STATE_ERROR(): Int = (-1).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_STATE_UNCONNECTED 0
 */
fun KFFI_PW_STREAM_STATE_UNCONNECTED(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_STATE_CONNECTING 1
 */
fun KFFI_PW_STREAM_STATE_CONNECTING(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_STATE_PAUSED 2
 */
fun KFFI_PW_STREAM_STATE_PAUSED(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_STATE_STREAMING 3
 */
fun KFFI_PW_STREAM_STATE_STREAMING(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_DIRECTION_INPUT 0
 */
fun KFFI_PW_DIRECTION_INPUT(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_DIRECTION_OUTPUT 1
 */
fun KFFI_PW_DIRECTION_OUTPUT(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_FLAG_NONE 0
 */
fun KFFI_PW_STREAM_FLAG_NONE(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_FLAG_AUTOCONNECT 1
 */
fun KFFI_PW_STREAM_FLAG_AUTOCONNECT(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_FLAG_INACTIVE 2
 */
fun KFFI_PW_STREAM_FLAG_INACTIVE(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_FLAG_MAP_BUFFERS 4
 */
fun KFFI_PW_STREAM_FLAG_MAP_BUFFERS(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_FLAG_NO_CONVERT 32
 */
fun KFFI_PW_STREAM_FLAG_NO_CONVERT(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_STREAM_FLAG_DONT_RECONNECT 128
 */
fun KFFI_PW_STREAM_FLAG_DONT_RECONNECT(): Int = (128).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_ID_ANY 4294967295
 */
fun KFFI_PW_ID_ANY(): Int = (4294967295).toInt()

/**
 * {@snippet lang=c : #define KFFI_PW_VERSION_STREAM_EVENTS 2
 */
fun KFFI_PW_VERSION_STREAM_EVENTS(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_INVALID 0
 */
fun KFFI_SPA_PARAM_INVALID(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_ENUM_FORMAT 3
 */
fun KFFI_SPA_PARAM_ENUM_FORMAT(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_FORMAT 4
 */
fun KFFI_SPA_PARAM_FORMAT(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_BUFFERS 5
 */
fun KFFI_SPA_PARAM_BUFFERS(): Int = (5).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_BUFFERS_BUFFERS 1
 */
fun KFFI_SPA_PARAM_BUFFERS_BUFFERS(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_BUFFERS_BLOCKS 2
 */
fun KFFI_SPA_PARAM_BUFFERS_BLOCKS(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_BUFFERS_SIZE 3
 */
fun KFFI_SPA_PARAM_BUFFERS_SIZE(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_BUFFERS_STRIDE 4
 */
fun KFFI_SPA_PARAM_BUFFERS_STRIDE(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_PARAM_BUFFERS_ALIGN 5
 */
fun KFFI_SPA_PARAM_BUFFERS_ALIGN(): Int = (5).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_MEDIA_TYPE_VIDEO 2
 */
fun KFFI_SPA_MEDIA_TYPE_VIDEO(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_MEDIA_SUBTYPE_RAW 1
 */
fun KFFI_SPA_MEDIA_SUBTYPE_RAW(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_FORMAT_MEDIA_TYPE 1
 */
fun KFFI_SPA_FORMAT_MEDIA_TYPE(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_FORMAT_MEDIA_SUBTYPE 2
 */
fun KFFI_SPA_FORMAT_MEDIA_SUBTYPE(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_FORMAT_VIDEO_FORMAT 131073
 */
fun KFFI_SPA_FORMAT_VIDEO_FORMAT(): Int = (131073).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_FORMAT_VIDEO_SIZE 131075
 */
fun KFFI_SPA_FORMAT_VIDEO_SIZE(): Int = (131075).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_FORMAT_VIDEO_FRAMERATE 131076
 */
fun KFFI_SPA_FORMAT_VIDEO_FRAMERATE(): Int = (131076).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_FORMAT_VIDEO_MAX_FRAMERATE 131077
 */
fun KFFI_SPA_FORMAT_VIDEO_MAX_FRAMERATE(): Int = (131077).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_VIDEO_FORMAT_UNKNOWN 0
 */
fun KFFI_SPA_VIDEO_FORMAT_UNKNOWN(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_VIDEO_FORMAT_I420 2
 */
fun KFFI_SPA_VIDEO_FORMAT_I420(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_VIDEO_FORMAT_NV12 23
 */
fun KFFI_SPA_VIDEO_FORMAT_NV12(): Int = (23).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_VIDEO_FORMAT_BGRX 8
 */
fun KFFI_SPA_VIDEO_FORMAT_BGRX(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_VIDEO_FORMAT_RGBA 11
 */
fun KFFI_SPA_VIDEO_FORMAT_RGBA(): Int = (11).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_VIDEO_FORMAT_BGRA 12
 */
fun KFFI_SPA_VIDEO_FORMAT_BGRA(): Int = (12).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_DATA_INVALID 0
 */
fun KFFI_SPA_DATA_INVALID(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_DATA_MEMFD 2
 */
fun KFFI_SPA_DATA_MEMFD(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_DATA_MEMPTR 1
 */
fun KFFI_SPA_DATA_MEMPTR(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_DATA_DMABUF 3
 */
fun KFFI_SPA_DATA_DMABUF(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_NONE 1
 */
fun KFFI_SPA_TYPE_NONE(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_BOOL 2
 */
fun KFFI_SPA_TYPE_BOOL(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_ID 3
 */
fun KFFI_SPA_TYPE_ID(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_INT 4
 */
fun KFFI_SPA_TYPE_INT(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_LONG 5
 */
fun KFFI_SPA_TYPE_LONG(): Int = (5).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_FLOAT 6
 */
fun KFFI_SPA_TYPE_FLOAT(): Int = (6).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_DOUBLE 7
 */
fun KFFI_SPA_TYPE_DOUBLE(): Int = (7).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_STRING 8
 */
fun KFFI_SPA_TYPE_STRING(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_BYTES 9
 */
fun KFFI_SPA_TYPE_BYTES(): Int = (9).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_RECTANGLE 10
 */
fun KFFI_SPA_TYPE_RECTANGLE(): Int = (10).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_FRACTION 11
 */
fun KFFI_SPA_TYPE_FRACTION(): Int = (11).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_BITMAP 12
 */
fun KFFI_SPA_TYPE_BITMAP(): Int = (12).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_ARRAY 13
 */
fun KFFI_SPA_TYPE_ARRAY(): Int = (13).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_STRUCT 14
 */
fun KFFI_SPA_TYPE_STRUCT(): Int = (14).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_OBJECT 15
 */
fun KFFI_SPA_TYPE_OBJECT(): Int = (15).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_POINTER 17
 */
fun KFFI_SPA_TYPE_POINTER(): Int = (17).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_FD 18
 */
fun KFFI_SPA_TYPE_FD(): Int = (18).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_CHOICE 19
 */
fun KFFI_SPA_TYPE_CHOICE(): Int = (19).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_OBJECT_FORMAT 262147
 */
fun KFFI_SPA_TYPE_OBJECT_FORMAT(): Int = (262147).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_TYPE_OBJECT_PARAM_BUFFERS 262148
 */
fun KFFI_SPA_TYPE_OBJECT_PARAM_BUFFERS(): Int = (262148).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_CHOICE_NONE 0
 */
fun KFFI_SPA_CHOICE_NONE(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_CHOICE_RANGE 1
 */
fun KFFI_SPA_CHOICE_RANGE(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_CHOICE_STEP 2
 */
fun KFFI_SPA_CHOICE_STEP(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_CHOICE_ENUM 3
 */
fun KFFI_SPA_CHOICE_ENUM(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define KFFI_SPA_CHOICE_FLAGS 4
 */
fun KFFI_SPA_CHOICE_FLAGS(): Int = (4).toInt()
