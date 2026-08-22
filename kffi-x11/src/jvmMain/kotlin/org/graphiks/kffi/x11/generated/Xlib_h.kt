package org.graphiks.kffi.x11.generated

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
    lu = SymbolLookup.libraryLookup("libX11.so.6", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("libXext.so.6", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("libXcomposite.so.1", Arena.global()).or(lu)
    lu
}

/**
 * {@snippet lang=c : #define KeyRelease 3
 */
fun KeyRelease(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define ButtonPress 4
 */
fun ButtonPress(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define ButtonRelease 5
 */
fun ButtonRelease(): Int = (5).toInt()

/**
 * {@snippet lang=c : #define MotionNotify 6
 */
fun MotionNotify(): Int = (6).toInt()

/**
 * {@snippet lang=c : #define EnterNotify 7
 */
fun EnterNotify(): Int = (7).toInt()

/**
 * {@snippet lang=c : #define LeaveNotify 8
 */
fun LeaveNotify(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define FocusIn 9
 */
fun FocusIn(): Int = (9).toInt()

/**
 * {@snippet lang=c : #define FocusOut 10
 */
fun FocusOut(): Int = (10).toInt()

/**
 * {@snippet lang=c : #define Expose 12
 */
fun Expose(): Int = (12).toInt()

/**
 * {@snippet lang=c : #define VisibilityNotify 15
 */
fun VisibilityNotify(): Int = (15).toInt()

/**
 * {@snippet lang=c : #define DestroyNotify 17
 */
fun DestroyNotify(): Int = (17).toInt()

/**
 * {@snippet lang=c : #define ConfigureNotify 22
 */
fun ConfigureNotify(): Int = (22).toInt()

/**
 * {@snippet lang=c : #define SelectionNotify 31
 */
fun SelectionNotify(): Int = (31).toInt()

/**
 * {@snippet lang=c : #define ClientMessage 33
 */
fun ClientMessage(): Int = (33).toInt()

/**
 * {@snippet lang=c : #define XC_num_glyphs 154
 */
fun XC_num_glyphs(): Int = (154).toInt()

/**
 * {@snippet lang=c : #define XC_X_cursor 0
 */
fun XC_X_cursor(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define XC_arrow 2
 */
fun XC_arrow(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define XC_based_arrow_down 4
 */
fun XC_based_arrow_down(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define XC_based_arrow_up 6
 */
fun XC_based_arrow_up(): Int = (6).toInt()

/**
 * {@snippet lang=c : #define XC_boat 8
 */
fun XC_boat(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define XC_bogosity 10
 */
fun XC_bogosity(): Int = (10).toInt()

/**
 * {@snippet lang=c : #define XC_bottom_left_corner 12
 */
fun XC_bottom_left_corner(): Int = (12).toInt()

/**
 * {@snippet lang=c : #define XC_bottom_right_corner 14
 */
fun XC_bottom_right_corner(): Int = (14).toInt()

/**
 * {@snippet lang=c : #define XC_bottom_side 16
 */
fun XC_bottom_side(): Int = (16).toInt()

/**
 * {@snippet lang=c : #define XC_bottom_tee 18
 */
fun XC_bottom_tee(): Int = (18).toInt()

/**
 * {@snippet lang=c : #define XC_box_spiral 20
 */
fun XC_box_spiral(): Int = (20).toInt()

/**
 * {@snippet lang=c : #define XC_center_ptr 22
 */
fun XC_center_ptr(): Int = (22).toInt()

/**
 * {@snippet lang=c : #define XC_circle 24
 */
fun XC_circle(): Int = (24).toInt()

/**
 * {@snippet lang=c : #define XC_clock 26
 */
fun XC_clock(): Int = (26).toInt()

/**
 * {@snippet lang=c : #define XC_coffee_mug 28
 */
fun XC_coffee_mug(): Int = (28).toInt()

/**
 * {@snippet lang=c : #define XC_cross 30
 */
fun XC_cross(): Int = (30).toInt()

/**
 * {@snippet lang=c : #define XC_cross_reverse 32
 */
fun XC_cross_reverse(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define XC_crosshair 34
 */
fun XC_crosshair(): Int = (34).toInt()

/**
 * {@snippet lang=c : #define XC_diamond_cross 36
 */
fun XC_diamond_cross(): Int = (36).toInt()

/**
 * {@snippet lang=c : #define XC_dot 38
 */
fun XC_dot(): Int = (38).toInt()

/**
 * {@snippet lang=c : #define XC_dotbox 40
 */
fun XC_dotbox(): Int = (40).toInt()

/**
 * {@snippet lang=c : #define XC_double_arrow 42
 */
fun XC_double_arrow(): Int = (42).toInt()

/**
 * {@snippet lang=c : #define XC_draft_large 44
 */
fun XC_draft_large(): Int = (44).toInt()

/**
 * {@snippet lang=c : #define XC_draft_small 46
 */
fun XC_draft_small(): Int = (46).toInt()

/**
 * {@snippet lang=c : #define XC_draped_box 48
 */
fun XC_draped_box(): Int = (48).toInt()

/**
 * {@snippet lang=c : #define XC_exchange 50
 */
fun XC_exchange(): Int = (50).toInt()

/**
 * {@snippet lang=c : #define XC_fleur 52
 */
fun XC_fleur(): Int = (52).toInt()

/**
 * {@snippet lang=c : #define XC_gobbler 54
 */
fun XC_gobbler(): Int = (54).toInt()

/**
 * {@snippet lang=c : #define XC_gumby 56
 */
fun XC_gumby(): Int = (56).toInt()

/**
 * {@snippet lang=c : #define XC_hand1 58
 */
fun XC_hand1(): Int = (58).toInt()

/**
 * {@snippet lang=c : #define XC_hand2 60
 */
fun XC_hand2(): Int = (60).toInt()

/**
 * {@snippet lang=c : #define XC_heart 62
 */
fun XC_heart(): Int = (62).toInt()

/**
 * {@snippet lang=c : #define XC_icon 64
 */
fun XC_icon(): Int = (64).toInt()

/**
 * {@snippet lang=c : #define XC_iron_cross 66
 */
fun XC_iron_cross(): Int = (66).toInt()

/**
 * {@snippet lang=c : #define XC_left_ptr 68
 */
fun XC_left_ptr(): Int = (68).toInt()

/**
 * {@snippet lang=c : #define XC_left_side 70
 */
fun XC_left_side(): Int = (70).toInt()

/**
 * {@snippet lang=c : #define XC_left_tee 72
 */
fun XC_left_tee(): Int = (72).toInt()

/**
 * {@snippet lang=c : #define XC_leftbutton 74
 */
fun XC_leftbutton(): Int = (74).toInt()

/**
 * {@snippet lang=c : #define XC_ll_angle 76
 */
fun XC_ll_angle(): Int = (76).toInt()

/**
 * {@snippet lang=c : #define XC_lr_angle 78
 */
fun XC_lr_angle(): Int = (78).toInt()

/**
 * {@snippet lang=c : #define XC_man 80
 */
fun XC_man(): Int = (80).toInt()

/**
 * {@snippet lang=c : #define XC_middlebutton 82
 */
fun XC_middlebutton(): Int = (82).toInt()

/**
 * {@snippet lang=c : #define XC_mouse 84
 */
fun XC_mouse(): Int = (84).toInt()

/**
 * {@snippet lang=c : #define XC_pencil 86
 */
fun XC_pencil(): Int = (86).toInt()

/**
 * {@snippet lang=c : #define XC_pirate 88
 */
fun XC_pirate(): Int = (88).toInt()

/**
 * {@snippet lang=c : #define XC_plus 90
 */
fun XC_plus(): Int = (90).toInt()

/**
 * {@snippet lang=c : #define XC_question_arrow 92
 */
fun XC_question_arrow(): Int = (92).toInt()

/**
 * {@snippet lang=c : #define XC_right_ptr 94
 */
fun XC_right_ptr(): Int = (94).toInt()

/**
 * {@snippet lang=c : #define XC_right_side 96
 */
fun XC_right_side(): Int = (96).toInt()

/**
 * {@snippet lang=c : #define XC_right_tee 98
 */
fun XC_right_tee(): Int = (98).toInt()

/**
 * {@snippet lang=c : #define XC_rightbutton 100
 */
fun XC_rightbutton(): Int = (100).toInt()

/**
 * {@snippet lang=c : #define XC_rtl_logo 102
 */
fun XC_rtl_logo(): Int = (102).toInt()

/**
 * {@snippet lang=c : #define XC_sailboat 104
 */
fun XC_sailboat(): Int = (104).toInt()

/**
 * {@snippet lang=c : #define XC_sb_down_arrow 106
 */
fun XC_sb_down_arrow(): Int = (106).toInt()

/**
 * {@snippet lang=c : #define XC_sb_h_double_arrow 108
 */
fun XC_sb_h_double_arrow(): Int = (108).toInt()

/**
 * {@snippet lang=c : #define XC_sb_left_arrow 110
 */
fun XC_sb_left_arrow(): Int = (110).toInt()

/**
 * {@snippet lang=c : #define XC_sb_right_arrow 112
 */
fun XC_sb_right_arrow(): Int = (112).toInt()

/**
 * {@snippet lang=c : #define XC_sb_up_arrow 114
 */
fun XC_sb_up_arrow(): Int = (114).toInt()

/**
 * {@snippet lang=c : #define XC_sb_v_double_arrow 116
 */
fun XC_sb_v_double_arrow(): Int = (116).toInt()

/**
 * {@snippet lang=c : #define XC_shuttle 118
 */
fun XC_shuttle(): Int = (118).toInt()

/**
 * {@snippet lang=c : #define XC_sizing 120
 */
fun XC_sizing(): Int = (120).toInt()

/**
 * {@snippet lang=c : #define XC_spider 122
 */
fun XC_spider(): Int = (122).toInt()

/**
 * {@snippet lang=c : #define XC_spraycan 124
 */
fun XC_spraycan(): Int = (124).toInt()

/**
 * {@snippet lang=c : #define XC_star 126
 */
fun XC_star(): Int = (126).toInt()

/**
 * {@snippet lang=c : #define XC_target 128
 */
fun XC_target(): Int = (128).toInt()

/**
 * {@snippet lang=c : #define XC_tcross 130
 */
fun XC_tcross(): Int = (130).toInt()

/**
 * {@snippet lang=c : #define XC_top_left_arrow 132
 */
fun XC_top_left_arrow(): Int = (132).toInt()

/**
 * {@snippet lang=c : #define XC_top_left_corner 134
 */
fun XC_top_left_corner(): Int = (134).toInt()

/**
 * {@snippet lang=c : #define XC_top_right_corner 136
 */
fun XC_top_right_corner(): Int = (136).toInt()

/**
 * {@snippet lang=c : #define XC_top_side 138
 */
fun XC_top_side(): Int = (138).toInt()

/**
 * {@snippet lang=c : #define XC_top_tee 140
 */
fun XC_top_tee(): Int = (140).toInt()

/**
 * {@snippet lang=c : #define XC_trek 142
 */
fun XC_trek(): Int = (142).toInt()

/**
 * {@snippet lang=c : #define XC_ul_angle 144
 */
fun XC_ul_angle(): Int = (144).toInt()

/**
 * {@snippet lang=c : #define XC_umbrella 146
 */
fun XC_umbrella(): Int = (146).toInt()

/**
 * {@snippet lang=c : #define XC_ur_angle 148
 */
fun XC_ur_angle(): Int = (148).toInt()

/**
 * {@snippet lang=c : #define XC_watch 150
 */
fun XC_watch(): Int = (150).toInt()

/**
 * {@snippet lang=c : #define XC_xterm 152
 */
fun XC_xterm(): Int = (152).toInt()

/**
 * {@snippet lang=c : #define CompositeRedirectAutomatic 0
 */
fun CompositeRedirectAutomatic(): Int = (0).toInt()

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
 * {@snippet lang=c : typedef SIGNED = Char __int_least8_t;}
 */
typealias _int_least8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char __uint_least8_t;}
 */
typealias _uint_least8_t = Byte

/**
 * {@snippet lang=c : typedef Short __int_least16_t;}
 */
typealias _int_least16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __uint_least16_t;}
 */
typealias _uint_least16_t = Short

/**
 * {@snippet lang=c : typedef Int __int_least32_t;}
 */
typealias _int_least32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __uint_least32_t;}
 */
typealias _uint_least32_t = Int

/**
 * {@snippet lang=c : typedef Long __int_least64_t;}
 */
typealias _int_least64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __uint_least64_t;}
 */
typealias _uint_least64_t = Long

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
 * {@snippet lang=c : typedef UNSIGNED = Int __nlink_t;}
 */
typealias _nlink_t = Int

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
 * {@snippet lang=c : typedef Int __blksize_t;}
 */
typealias _blksize_t = Int

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
 * {@snippet lang=c : typedef UNSIGNED = Long dev_t;}
 */
typealias dev_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int gid_t;}
 */
typealias gid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mode_t;}
 */
typealias mode_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int nlink_t;}
 */
typealias nlink_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uid_t;}
 */
typealias uid_t = Int

/**
 * {@snippet lang=c : typedef Long off_t;}
 */
typealias off_t = Long

/**
 * {@snippet lang=c : typedef Int pid_t;}
 */
typealias pid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int id_t;}
 */
typealias id_t = Int

/**
 * {@snippet lang=c : typedef Long ssize_t;}
 */
typealias ssize_t = Long

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
 * {@snippet lang=c : typedef Long time_t;}
 */
typealias time_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long size_t;}
 */
typealias size_t = Long

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
 * {@snippet lang=c : typedef SIGNED = Char int8_t;}
 */
typealias int8_t = Byte

/**
 * {@snippet lang=c : typedef Short int16_t;}
 */
typealias int16_t = Short

/**
 * {@snippet lang=c : typedef Int int32_t;}
 */
typealias int32_t = Int

/**
 * {@snippet lang=c : typedef Long int64_t;}
 */
typealias int64_t = Long

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
 * {@snippet lang=c : typedef Long suseconds_t;}
 */
typealias suseconds_t = Long

/**
 * {@snippet lang=c : typedef Long __fd_mask;}
 */
typealias _fd_mask = Long

/**
 * {@snippet lang=c : typedef Long fd_mask;}
 */
typealias fd_mask = Long

/**
 * {@snippet lang=c : typedef Int blksize_t;}
 */
typealias blksize_t = Int

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
 * {@snippet lang=c : typedef UNSIGNED = Long XID;}
 */
typealias XID = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Mask;}
 */
typealias Mask = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Atom;}
 */
typealias Atom = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long VisualID;}
 */
typealias VisualID = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Time;}
 */
typealias Time = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Window;}
 */
typealias Window = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Drawable;}
 */
typealias Drawable = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Font;}
 */
typealias Font = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Pixmap;}
 */
typealias Pixmap = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Cursor;}
 */
typealias Cursor = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long Colormap;}
 */
typealias Colormap = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long GContext;}
 */
typealias GContext = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long KeySym;}
 */
typealias KeySym = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Char KeyCode;}
 */
typealias KeyCode = Byte

/**
 * {@snippet lang=c : typedef Long ptrdiff_t;}
 */
typealias ptrdiff_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int wchar_t;}
 */
typealias wchar_t = Int

/**
 * {@snippet lang=c : STRUCT XColor
 */
class XColor {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("pixel"),
            ValueLayout.JAVA_SHORT.withName("red"),
            ValueLayout.JAVA_SHORT.withName("green"),
            ValueLayout.JAVA_SHORT.withName("blue"),
            ValueLayout.JAVA_BYTE.withName("flags"),
            ValueLayout.JAVA_BYTE.withName("pad")
        ).withName("XColor")

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

    val pixel_VH: VarHandle = layout.varHandle(groupElement("pixel"))

    @Suppress("UNCHECKED_CAST")
    fun pixel(segment: MemorySegment): Long =
        pixel_VH.get(segment, 0L) as Long

    fun pixel(segment: MemorySegment, value: Long) =
        pixel_VH.set(segment, 0L, value)

    val red_VH: VarHandle = layout.varHandle(groupElement("red"))

    @Suppress("UNCHECKED_CAST")
    fun red(segment: MemorySegment): Short =
        red_VH.get(segment, 0L) as Short

    fun red(segment: MemorySegment, value: Short) =
        red_VH.set(segment, 0L, value)

    val green_VH: VarHandle = layout.varHandle(groupElement("green"))

    @Suppress("UNCHECKED_CAST")
    fun green(segment: MemorySegment): Short =
        green_VH.get(segment, 0L) as Short

    fun green(segment: MemorySegment, value: Short) =
        green_VH.set(segment, 0L, value)

    val blue_VH: VarHandle = layout.varHandle(groupElement("blue"))

    @Suppress("UNCHECKED_CAST")
    fun blue(segment: MemorySegment): Short =
        blue_VH.get(segment, 0L) as Short

    fun blue(segment: MemorySegment, value: Short) =
        blue_VH.set(segment, 0L, value)

    val flags_VH: VarHandle = layout.varHandle(groupElement("flags"))

    @Suppress("UNCHECKED_CAST")
    fun flags(segment: MemorySegment): Byte =
        flags_VH.get(segment, 0L) as Byte

    fun flags(segment: MemorySegment, value: Byte) =
        flags_VH.set(segment, 0L, value)

    val pad_VH: VarHandle = layout.varHandle(groupElement("pad"))

    @Suppress("UNCHECKED_CAST")
    fun pad(segment: MemorySegment): Byte =
        pad_VH.get(segment, 0L) as Byte

    fun pad(segment: MemorySegment, value: Byte) =
        pad_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT XSegment
 */
class XSegment {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withName("x1"),
            ValueLayout.JAVA_SHORT.withName("y1"),
            ValueLayout.JAVA_SHORT.withName("x2"),
            ValueLayout.JAVA_SHORT.withName("y2")
        ).withName("XSegment")

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

    val x1_VH: VarHandle = layout.varHandle(groupElement("x1"))

    @Suppress("UNCHECKED_CAST")
    fun x1(segment: MemorySegment): Short =
        x1_VH.get(segment, 0L) as Short

    fun x1(segment: MemorySegment, value: Short) =
        x1_VH.set(segment, 0L, value)

    val y1_VH: VarHandle = layout.varHandle(groupElement("y1"))

    @Suppress("UNCHECKED_CAST")
    fun y1(segment: MemorySegment): Short =
        y1_VH.get(segment, 0L) as Short

    fun y1(segment: MemorySegment, value: Short) =
        y1_VH.set(segment, 0L, value)

    val x2_VH: VarHandle = layout.varHandle(groupElement("x2"))

    @Suppress("UNCHECKED_CAST")
    fun x2(segment: MemorySegment): Short =
        x2_VH.get(segment, 0L) as Short

    fun x2(segment: MemorySegment, value: Short) =
        x2_VH.set(segment, 0L, value)

    val y2_VH: VarHandle = layout.varHandle(groupElement("y2"))

    @Suppress("UNCHECKED_CAST")
    fun y2(segment: MemorySegment): Short =
        y2_VH.get(segment, 0L) as Short

    fun y2(segment: MemorySegment, value: Short) =
        y2_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT XPoint
 */
class XPoint {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withName("x"),
            ValueLayout.JAVA_SHORT.withName("y")
        ).withName("XPoint")

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

    val x_VH: VarHandle = layout.varHandle(groupElement("x"))

    @Suppress("UNCHECKED_CAST")
    fun x(segment: MemorySegment): Short =
        x_VH.get(segment, 0L) as Short

    fun x(segment: MemorySegment, value: Short) =
        x_VH.set(segment, 0L, value)

    val y_VH: VarHandle = layout.varHandle(groupElement("y"))

    @Suppress("UNCHECKED_CAST")
    fun y(segment: MemorySegment): Short =
        y_VH.get(segment, 0L) as Short

    fun y(segment: MemorySegment, value: Short) =
        y_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT XRectangle
 */
class XRectangle {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withName("x"),
            ValueLayout.JAVA_SHORT.withName("y"),
            ValueLayout.JAVA_SHORT.withName("width"),
            ValueLayout.JAVA_SHORT.withName("height")
        ).withName("XRectangle")

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

    val x_VH: VarHandle = layout.varHandle(groupElement("x"))

    @Suppress("UNCHECKED_CAST")
    fun x(segment: MemorySegment): Short =
        x_VH.get(segment, 0L) as Short

    fun x(segment: MemorySegment, value: Short) =
        x_VH.set(segment, 0L, value)

    val y_VH: VarHandle = layout.varHandle(groupElement("y"))

    @Suppress("UNCHECKED_CAST")
    fun y(segment: MemorySegment): Short =
        y_VH.get(segment, 0L) as Short

    fun y(segment: MemorySegment, value: Short) =
        y_VH.set(segment, 0L, value)

    val width_VH: VarHandle = layout.varHandle(groupElement("width"))

    @Suppress("UNCHECKED_CAST")
    fun width(segment: MemorySegment): Short =
        width_VH.get(segment, 0L) as Short

    fun width(segment: MemorySegment, value: Short) =
        width_VH.set(segment, 0L, value)

    val height_VH: VarHandle = layout.varHandle(groupElement("height"))

    @Suppress("UNCHECKED_CAST")
    fun height(segment: MemorySegment): Short =
        height_VH.get(segment, 0L) as Short

    fun height(segment: MemorySegment, value: Short) =
        height_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT XArc
 */
class XArc {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withName("x"),
            ValueLayout.JAVA_SHORT.withName("y"),
            ValueLayout.JAVA_SHORT.withName("width"),
            ValueLayout.JAVA_SHORT.withName("height"),
            ValueLayout.JAVA_SHORT.withName("angle1"),
            ValueLayout.JAVA_SHORT.withName("angle2")
        ).withName("XArc")

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

    val x_VH: VarHandle = layout.varHandle(groupElement("x"))

    @Suppress("UNCHECKED_CAST")
    fun x(segment: MemorySegment): Short =
        x_VH.get(segment, 0L) as Short

    fun x(segment: MemorySegment, value: Short) =
        x_VH.set(segment, 0L, value)

    val y_VH: VarHandle = layout.varHandle(groupElement("y"))

    @Suppress("UNCHECKED_CAST")
    fun y(segment: MemorySegment): Short =
        y_VH.get(segment, 0L) as Short

    fun y(segment: MemorySegment, value: Short) =
        y_VH.set(segment, 0L, value)

    val width_VH: VarHandle = layout.varHandle(groupElement("width"))

    @Suppress("UNCHECKED_CAST")
    fun width(segment: MemorySegment): Short =
        width_VH.get(segment, 0L) as Short

    fun width(segment: MemorySegment, value: Short) =
        width_VH.set(segment, 0L, value)

    val height_VH: VarHandle = layout.varHandle(groupElement("height"))

    @Suppress("UNCHECKED_CAST")
    fun height(segment: MemorySegment): Short =
        height_VH.get(segment, 0L) as Short

    fun height(segment: MemorySegment, value: Short) =
        height_VH.set(segment, 0L, value)

    val angle1_VH: VarHandle = layout.varHandle(groupElement("angle1"))

    @Suppress("UNCHECKED_CAST")
    fun angle1(segment: MemorySegment): Short =
        angle1_VH.get(segment, 0L) as Short

    fun angle1(segment: MemorySegment, value: Short) =
        angle1_VH.set(segment, 0L, value)

    val angle2_VH: VarHandle = layout.varHandle(groupElement("angle2"))

    @Suppress("UNCHECKED_CAST")
    fun angle2(segment: MemorySegment): Short =
        angle2_VH.get(segment, 0L) as Short

    fun angle2(segment: MemorySegment, value: Short) =
        angle2_VH.set(segment, 0L, value)
} // End class

/**
 * NS_ENUM: {@snippet lang=c : enum XOrientation}
 */
enum class XOrientation(val value: Long) {
    XOMOrientation_LTR_TTB(0L), XOMOrientation_RTL_TTB(1L), XOMOrientation_TTB_LTR(2L), XOMOrientation_TTB_RTL(3L), XOMOrientation_Context(4L);

    companion object {
        fun fromValue(v: Long): XOrientation = entries.firstOrNull { it.value == v }
            ?: error("Unknown XOrientation value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long XIMStyle;}
 */
typealias XIMStyle = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long XIMFeedback;}
 */
typealias XIMFeedback = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long XIMPreeditState;}
 */
typealias XIMPreeditState = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long XIMResetState;}
 */
typealias XIMResetState = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long XIMStringConversionFeedback;}
 */
typealias XIMStringConversionFeedback = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Short XIMStringConversionPosition;}
 */
typealias XIMStringConversionPosition = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short XIMStringConversionType;}
 */
typealias XIMStringConversionType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short XIMStringConversionOperation;}
 */
typealias XIMStringConversionOperation = Short

/**
 * NS_ENUM: {@snippet lang=c : enum XIMCaretDirection}
 */
enum class XIMCaretDirection(val value: Long) {
    XIMForwardChar(0L), XIMBackwardChar(1L), XIMForwardWord(2L), XIMBackwardWord(3L), XIMCaretUp(4L), XIMCaretDown(5L), XIMNextLine(6L), XIMPreviousLine(7L), XIMLineStart(8L), XIMLineEnd(9L), XIMAbsolutePosition(10L), XIMDontChange(11L);

    companion object {
        fun fromValue(v: Long): XIMCaretDirection = entries.firstOrNull { it.value == v }
            ?: error("Unknown XIMCaretDirection value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum XIMCaretStyle}
 */
enum class XIMCaretStyle(val value: Long) {
    XIMIsInvisible(0L), XIMIsPrimary(1L), XIMIsSecondary(2L);

    companion object {
        fun fromValue(v: Long): XIMCaretStyle = entries.firstOrNull { it.value == v }
            ?: error("Unknown XIMCaretStyle value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum XIMStatusDataType}
 */
enum class XIMStatusDataType(val value: Long) {
    XIMTextType(0L), XIMBitmapType(1L);

    companion object {
        fun fromValue(v: Long): XIMStatusDataType = entries.firstOrNull { it.value == v }
            ?: error("Unknown XIMStatusDataType value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long XIMHotKeyState;}
 */
typealias XIMHotKeyState = Long

/**
 * {@snippet lang=c : XGetImage (typedef XImage = Declared(_XImage))*((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,Int,UNSIGNED = Int,UNSIGNED = Int,UNSIGNED = Long,Int)
 */
private val XGetImage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val XGetImage_ADDR: MemorySegment = LOOKUP.find("XGetImage").orElseThrow()
private val XGetImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGetImage_ADDR, XGetImage_DESC)

fun XGetImage(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Long, arg7: Int): MemorySegment {
    try {
        return XGetImage_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XOpenDisplay (typedef Display = Declared(_XDisplay))*((Char)*)
 */
private val XOpenDisplay_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XOpenDisplay_ADDR: MemorySegment = LOOKUP.find("XOpenDisplay").orElseThrow()
private val XOpenDisplay_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XOpenDisplay_ADDR, XOpenDisplay_DESC)

fun XOpenDisplay(arg0: MemorySegment): MemorySegment {
    try {
        return XOpenDisplay_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XInternAtom UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,(Char)*,Int)
 */
private val XInternAtom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XInternAtom_ADDR: MemorySegment = LOOKUP.find("XInternAtom").orElseThrow()
private val XInternAtom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XInternAtom_ADDR, XInternAtom_DESC)

fun XInternAtom(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Long {
    try {
        return XInternAtom_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreateColormap UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef Visual = Declared(Visual))*,Int)
 */
private val XCreateColormap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XCreateColormap_ADDR: MemorySegment = LOOKUP.find("XCreateColormap").orElseThrow()
private val XCreateColormap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCreateColormap_ADDR, XCreateColormap_DESC)

fun XCreateColormap(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int): Long {
    try {
        return XCreateColormap_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreatePixmapCursor UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,(typedef XColor = Declared(XColor))*,(typedef XColor = Declared(XColor))*,UNSIGNED = Int,UNSIGNED = Int)
 */
private val XCreatePixmapCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XCreatePixmapCursor_ADDR: MemorySegment = LOOKUP.find("XCreatePixmapCursor").orElseThrow()
private val XCreatePixmapCursor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCreatePixmapCursor_ADDR, XCreatePixmapCursor_DESC)

fun XCreatePixmapCursor(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: MemorySegment, arg4: MemorySegment, arg5: Int, arg6: Int): Long {
    try {
        return XCreatePixmapCursor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreateFontCursor UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,UNSIGNED = Int)
 */
private val XCreateFontCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XCreateFontCursor_ADDR: MemorySegment = LOOKUP.find("XCreateFontCursor").orElseThrow()
private val XCreateFontCursor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCreateFontCursor_ADDR, XCreateFontCursor_DESC)

fun XCreateFontCursor(arg0: MemorySegment, arg1: Int): Long {
    try {
        return XCreateFontCursor_HANDLE.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreateGC (Declared(_XGC))*((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,(typedef XGCValues = Declared(XGCValues))*)
 */
private val XCreateGC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XCreateGC_ADDR: MemorySegment = LOOKUP.find("XCreateGC").orElseThrow()
private val XCreateGC_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCreateGC_ADDR, XCreateGC_DESC)

fun XCreateGC(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: MemorySegment): MemorySegment {
    try {
        return XCreateGC_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XGContextFromGC UNSIGNED = Long((Declared(_XGC))*)
 */
private val XGContextFromGC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XGContextFromGC_ADDR: MemorySegment = LOOKUP.find("XGContextFromGC").orElseThrow()
private val XGContextFromGC_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGContextFromGC_ADDR, XGContextFromGC_DESC)

fun XGContextFromGC(arg0: MemorySegment): Long {
    try {
        return XGContextFromGC_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFlushGC Void((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*)
 */
private val XFlushGC_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XFlushGC_ADDR: MemorySegment = LOOKUP.find("XFlushGC").orElseThrow()
private val XFlushGC_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFlushGC_ADDR, XFlushGC_DESC)

fun XFlushGC(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        XFlushGC_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreatePixmap UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Int,UNSIGNED = Int,UNSIGNED = Int)
 */
private val XCreatePixmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XCreatePixmap_ADDR: MemorySegment = LOOKUP.find("XCreatePixmap").orElseThrow()
private val XCreatePixmap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCreatePixmap_ADDR, XCreatePixmap_DESC)

fun XCreatePixmap(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int, arg4: Int): Long {
    try {
        return XCreatePixmap_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreateBitmapFromData UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Char)*,UNSIGNED = Int,UNSIGNED = Int)
 */
private val XCreateBitmapFromData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XCreateBitmapFromData_ADDR: MemorySegment = LOOKUP.find("XCreateBitmapFromData").orElseThrow()
private val XCreateBitmapFromData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCreateBitmapFromData_ADDR, XCreateBitmapFromData_DESC)

fun XCreateBitmapFromData(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int): Long {
    try {
        return XCreateBitmapFromData_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreatePixmapFromBitmapData UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Char)*,UNSIGNED = Int,UNSIGNED = Int,UNSIGNED = Long,UNSIGNED = Long,UNSIGNED = Int)
 */
private val XCreatePixmapFromBitmapData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val XCreatePixmapFromBitmapData_ADDR: MemorySegment = LOOKUP.find("XCreatePixmapFromBitmapData").orElseThrow()
private val XCreatePixmapFromBitmapData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCreatePixmapFromBitmapData_ADDR, XCreatePixmapFromBitmapData_DESC)

fun XCreatePixmapFromBitmapData(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int, arg5: Long, arg6: Long, arg7: Int): Long {
    try {
        return XCreatePixmapFromBitmapData_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreateSimpleWindow UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,Int,UNSIGNED = Int,UNSIGNED = Int,UNSIGNED = Int,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XCreateSimpleWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XCreateSimpleWindow_ADDR: MemorySegment = LOOKUP.find("XCreateSimpleWindow").orElseThrow()
private val XCreateSimpleWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCreateSimpleWindow_ADDR, XCreateSimpleWindow_DESC)

fun XCreateSimpleWindow(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Long, arg8: Long): Long {
    try {
        return XCreateSimpleWindow_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XLookupKeysym UNSIGNED = Long((typedef XKeyEvent = Declared(XKeyEvent))*,Int)
 */
private val XLookupKeysym_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XLookupKeysym_ADDR: MemorySegment = LOOKUP.find("XLookupKeysym").orElseThrow()
private val XLookupKeysym_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XLookupKeysym_ADDR, XLookupKeysym_DESC)

fun XLookupKeysym(arg0: MemorySegment, arg1: Int): Long {
    try {
        return XLookupKeysym_HANDLE.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XGetKeyboardMapping (typedef KeySym = UNSIGNED = Long)*((typedef Display = Declared(_XDisplay))*,UNSIGNED = Char,Int,(Int)*)
 */
private val XGetKeyboardMapping_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XGetKeyboardMapping_ADDR: MemorySegment = LOOKUP.find("XGetKeyboardMapping").orElseThrow()
private val XGetKeyboardMapping_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGetKeyboardMapping_ADDR, XGetKeyboardMapping_DESC)

fun XGetKeyboardMapping(arg0: MemorySegment, arg1: Byte, arg2: Int, arg3: MemorySegment): MemorySegment {
    try {
        return XGetKeyboardMapping_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XResourceManagerString (Char)*((typedef Display = Declared(_XDisplay))*)
 */
private val XResourceManagerString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XResourceManagerString_ADDR: MemorySegment = LOOKUP.find("XResourceManagerString").orElseThrow()
private val XResourceManagerString_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XResourceManagerString_ADDR, XResourceManagerString_DESC)

fun XResourceManagerString(arg0: MemorySegment): MemorySegment {
    try {
        return XResourceManagerString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XRootWindow UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,Int)
 */
private val XRootWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XRootWindow_ADDR: MemorySegment = LOOKUP.find("XRootWindow").orElseThrow()
private val XRootWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XRootWindow_ADDR, XRootWindow_DESC)

fun XRootWindow(arg0: MemorySegment, arg1: Int): Long {
    try {
        return XRootWindow_HANDLE.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDefaultRootWindow UNSIGNED = Long((typedef Display = Declared(_XDisplay))*)
 */
private val XDefaultRootWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XDefaultRootWindow_ADDR: MemorySegment = LOOKUP.find("XDefaultRootWindow").orElseThrow()
private val XDefaultRootWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDefaultRootWindow_ADDR, XDefaultRootWindow_DESC)

fun XDefaultRootWindow(arg0: MemorySegment): Long {
    try {
        return XDefaultRootWindow_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDefaultVisual (typedef Visual = Declared(Visual))*((typedef Display = Declared(_XDisplay))*,Int)
 */
private val XDefaultVisual_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XDefaultVisual_ADDR: MemorySegment = LOOKUP.find("XDefaultVisual").orElseThrow()
private val XDefaultVisual_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDefaultVisual_ADDR, XDefaultVisual_DESC)

fun XDefaultVisual(arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return XDefaultVisual_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetWMProtocols Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef Atom = UNSIGNED = Long)*,Int)
 */
private val XSetWMProtocols_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSetWMProtocols_ADDR: MemorySegment = LOOKUP.find("XSetWMProtocols").orElseThrow()
private val XSetWMProtocols_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetWMProtocols_ADDR, XSetWMProtocols_DESC)

fun XSetWMProtocols(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int): Int {
    try {
        return XSetWMProtocols_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XIconifyWindow Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int)
 */
private val XIconifyWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val XIconifyWindow_ADDR: MemorySegment = LOOKUP.find("XIconifyWindow").orElseThrow()
private val XIconifyWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XIconifyWindow_ADDR, XIconifyWindow_DESC)

fun XIconifyWindow(arg0: MemorySegment, arg1: Long, arg2: Int): Int {
    try {
        return XIconifyWindow_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFreeStringList Void(((Char)*)*)
 */
private val XFreeStringList_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val XFreeStringList_ADDR: MemorySegment = LOOKUP.find("XFreeStringList").orElseThrow()
private val XFreeStringList_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFreeStringList_ADDR, XFreeStringList_DESC)

fun XFreeStringList(arg0: MemorySegment): Unit {
    try {
        XFreeStringList_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XAllocColor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef XColor = Declared(XColor))*)
 */
private val XAllocColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XAllocColor_ADDR: MemorySegment = LOOKUP.find("XAllocColor").orElseThrow()
private val XAllocColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XAllocColor_ADDR, XAllocColor_DESC)

fun XAllocColor(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Int {
    try {
        return XAllocColor_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XAllocColorCells Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,(UNSIGNED = Long)*,UNSIGNED = Int,(UNSIGNED = Long)*,UNSIGNED = Int)
 */
private val XAllocColorCells_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XAllocColorCells_ADDR: MemorySegment = LOOKUP.find("XAllocColorCells").orElseThrow()
private val XAllocColorCells_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XAllocColorCells_ADDR, XAllocColorCells_DESC)

fun XAllocColorCells(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: MemorySegment, arg4: Int, arg5: MemorySegment, arg6: Int): Int {
    try {
        return XAllocColorCells_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XAllocColorPlanes Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,(UNSIGNED = Long)*,Int,Int,Int,Int,(UNSIGNED = Long)*,(UNSIGNED = Long)*,(UNSIGNED = Long)*)
 */
private val XAllocColorPlanes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XAllocColorPlanes_ADDR: MemorySegment = LOOKUP.find("XAllocColorPlanes").orElseThrow()
private val XAllocColorPlanes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XAllocColorPlanes_ADDR, XAllocColorPlanes_DESC)

fun XAllocColorPlanes(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: MemorySegment, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: MemorySegment, arg9: MemorySegment, arg10: MemorySegment): Int {
    try {
        return XAllocColorPlanes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XAllocNamedColor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Char)*,(typedef XColor = Declared(XColor))*,(typedef XColor = Declared(XColor))*)
 */
private val XAllocNamedColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XAllocNamedColor_ADDR: MemorySegment = LOOKUP.find("XAllocNamedColor").orElseThrow()
private val XAllocNamedColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XAllocNamedColor_ADDR, XAllocNamedColor_DESC)

fun XAllocNamedColor(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Int {
    try {
        return XAllocNamedColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XChangeGC Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long,(typedef XGCValues = Declared(XGCValues))*)
 */
private val XChangeGC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XChangeGC_ADDR: MemorySegment = LOOKUP.find("XChangeGC").orElseThrow()
private val XChangeGC_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XChangeGC_ADDR, XChangeGC_DESC)

fun XChangeGC(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): Int {
    try {
        return XChangeGC_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XChangeProperty Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,UNSIGNED = Long,Int,Int,(UNSIGNED = Char)*,Int)
 */
private val XChangeProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XChangeProperty_ADDR: MemorySegment = LOOKUP.find("XChangeProperty").orElseThrow()
private val XChangeProperty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XChangeProperty_ADDR, XChangeProperty_DESC)

fun XChangeProperty(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Long, arg4: Int, arg5: Int, arg6: MemorySegment, arg7: Int): Int {
    try {
        return XChangeProperty_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XChangeWindowAttributes Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,(typedef XSetWindowAttributes = Declared(XSetWindowAttributes))*)
 */
private val XChangeWindowAttributes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XChangeWindowAttributes_ADDR: MemorySegment = LOOKUP.find("XChangeWindowAttributes").orElseThrow()
private val XChangeWindowAttributes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XChangeWindowAttributes_ADDR, XChangeWindowAttributes_DESC)

fun XChangeWindowAttributes(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: MemorySegment): Int {
    try {
        return XChangeWindowAttributes_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XClearArea Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,Int,UNSIGNED = Int,UNSIGNED = Int,Int)
 */
private val XClearArea_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XClearArea_ADDR: MemorySegment = LOOKUP.find("XClearArea").orElseThrow()
private val XClearArea_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XClearArea_ADDR, XClearArea_DESC)

fun XClearArea(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Int {
    try {
        return XClearArea_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XClearWindow Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XClearWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XClearWindow_ADDR: MemorySegment = LOOKUP.find("XClearWindow").orElseThrow()
private val XClearWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XClearWindow_ADDR, XClearWindow_DESC)

fun XClearWindow(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XClearWindow_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCloseDisplay Int((typedef Display = Declared(_XDisplay))*)
 */
private val XCloseDisplay_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XCloseDisplay_ADDR: MemorySegment = LOOKUP.find("XCloseDisplay").orElseThrow()
private val XCloseDisplay_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCloseDisplay_ADDR, XCloseDisplay_DESC)

fun XCloseDisplay(arg0: MemorySegment): Int {
    try {
        return XCloseDisplay_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XConnectionNumber Int((typedef Display = Declared(_XDisplay))*)
 */
private val XConnectionNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XConnectionNumber_ADDR: MemorySegment = LOOKUP.find("XConnectionNumber").orElseThrow()
private val XConnectionNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XConnectionNumber_ADDR, XConnectionNumber_DESC)

fun XConnectionNumber(arg0: MemorySegment): Int {
    try {
        return XConnectionNumber_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XConvertSelection Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,UNSIGNED = Long,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XConvertSelection_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XConvertSelection_ADDR: MemorySegment = LOOKUP.find("XConvertSelection").orElseThrow()
private val XConvertSelection_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XConvertSelection_ADDR, XConvertSelection_DESC)

fun XConvertSelection(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Long): Int {
    try {
        return XConvertSelection_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCopyArea Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,(Declared(_XGC))*,Int,Int,UNSIGNED = Int,UNSIGNED = Int,Int,Int)
 */
private val XCopyArea_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XCopyArea_ADDR: MemorySegment = LOOKUP.find("XCopyArea").orElseThrow()
private val XCopyArea_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCopyArea_ADDR, XCopyArea_DESC)

fun XCopyArea(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: MemorySegment, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int): Int {
    try {
        return XCopyArea_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCopyGC Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long,(Declared(_XGC))*)
 */
private val XCopyGC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XCopyGC_ADDR: MemorySegment = LOOKUP.find("XCopyGC").orElseThrow()
private val XCopyGC_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCopyGC_ADDR, XCopyGC_DESC)

fun XCopyGC(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): Int {
    try {
        return XCopyGC_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCopyPlane Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,(Declared(_XGC))*,Int,Int,UNSIGNED = Int,UNSIGNED = Int,Int,Int,UNSIGNED = Long)
 */
private val XCopyPlane_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private val XCopyPlane_ADDR: MemorySegment = LOOKUP.find("XCopyPlane").orElseThrow()
private val XCopyPlane_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCopyPlane_ADDR, XCopyPlane_DESC)

fun XCopyPlane(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: MemorySegment, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int, arg10: Long): Int {
    try {
        return XCopyPlane_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDefaultDepth Int((typedef Display = Declared(_XDisplay))*,Int)
 */
private val XDefaultDepth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XDefaultDepth_ADDR: MemorySegment = LOOKUP.find("XDefaultDepth").orElseThrow()
private val XDefaultDepth_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDefaultDepth_ADDR, XDefaultDepth_DESC)

fun XDefaultDepth(arg0: MemorySegment, arg1: Int): Int {
    try {
        return XDefaultDepth_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDefaultScreen Int((typedef Display = Declared(_XDisplay))*)
 */
private val XDefaultScreen_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XDefaultScreen_ADDR: MemorySegment = LOOKUP.find("XDefaultScreen").orElseThrow()
private val XDefaultScreen_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDefaultScreen_ADDR, XDefaultScreen_DESC)

fun XDefaultScreen(arg0: MemorySegment): Int {
    try {
        return XDefaultScreen_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDefineCursor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XDefineCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XDefineCursor_ADDR: MemorySegment = LOOKUP.find("XDefineCursor").orElseThrow()
private val XDefineCursor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDefineCursor_ADDR, XDefineCursor_DESC)

fun XDefineCursor(arg0: MemorySegment, arg1: Long, arg2: Long): Int {
    try {
        return XDefineCursor_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDeleteProperty Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XDeleteProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XDeleteProperty_ADDR: MemorySegment = LOOKUP.find("XDeleteProperty").orElseThrow()
private val XDeleteProperty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDeleteProperty_ADDR, XDeleteProperty_DESC)

fun XDeleteProperty(arg0: MemorySegment, arg1: Long, arg2: Long): Int {
    try {
        return XDeleteProperty_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDestroyWindow Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XDestroyWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XDestroyWindow_ADDR: MemorySegment = LOOKUP.find("XDestroyWindow").orElseThrow()
private val XDestroyWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDestroyWindow_ADDR, XDestroyWindow_DESC)

fun XDestroyWindow(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XDestroyWindow_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawArc Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,Int,Int,UNSIGNED = Int,UNSIGNED = Int,Int,Int)
 */
private val XDrawArc_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XDrawArc_ADDR: MemorySegment = LOOKUP.find("XDrawArc").orElseThrow()
private val XDrawArc_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawArc_ADDR, XDrawArc_DESC)

fun XDrawArc(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int): Int {
    try {
        return XDrawArc_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawArcs Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,(typedef XArc = Declared(XArc))*,Int)
 */
private val XDrawArcs_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XDrawArcs_ADDR: MemorySegment = LOOKUP.find("XDrawArcs").orElseThrow()
private val XDrawArcs_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawArcs_ADDR, XDrawArcs_DESC)

fun XDrawArcs(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: Int): Int {
    try {
        return XDrawArcs_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawLine Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,Int,Int,Int,Int)
 */
private val XDrawLine_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XDrawLine_ADDR: MemorySegment = LOOKUP.find("XDrawLine").orElseThrow()
private val XDrawLine_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawLine_ADDR, XDrawLine_DESC)

fun XDrawLine(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Int {
    try {
        return XDrawLine_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawLines Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,(typedef XPoint = Declared(XPoint))*,Int,Int)
 */
private val XDrawLines_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XDrawLines_ADDR: MemorySegment = LOOKUP.find("XDrawLines").orElseThrow()
private val XDrawLines_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawLines_ADDR, XDrawLines_DESC)

fun XDrawLines(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: Int, arg5: Int): Int {
    try {
        return XDrawLines_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawPoint Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,Int,Int)
 */
private val XDrawPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XDrawPoint_ADDR: MemorySegment = LOOKUP.find("XDrawPoint").orElseThrow()
private val XDrawPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawPoint_ADDR, XDrawPoint_DESC)

fun XDrawPoint(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int): Int {
    try {
        return XDrawPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawPoints Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,(typedef XPoint = Declared(XPoint))*,Int,Int)
 */
private val XDrawPoints_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XDrawPoints_ADDR: MemorySegment = LOOKUP.find("XDrawPoints").orElseThrow()
private val XDrawPoints_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawPoints_ADDR, XDrawPoints_DESC)

fun XDrawPoints(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: Int, arg5: Int): Int {
    try {
        return XDrawPoints_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawRectangle Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,Int,Int,UNSIGNED = Int,UNSIGNED = Int)
 */
private val XDrawRectangle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XDrawRectangle_ADDR: MemorySegment = LOOKUP.find("XDrawRectangle").orElseThrow()
private val XDrawRectangle_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawRectangle_ADDR, XDrawRectangle_DESC)

fun XDrawRectangle(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Int {
    try {
        return XDrawRectangle_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawRectangles Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,(typedef XRectangle = Declared(XRectangle))*,Int)
 */
private val XDrawRectangles_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XDrawRectangles_ADDR: MemorySegment = LOOKUP.find("XDrawRectangles").orElseThrow()
private val XDrawRectangles_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawRectangles_ADDR, XDrawRectangles_DESC)

fun XDrawRectangles(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: Int): Int {
    try {
        return XDrawRectangles_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDrawSegments Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,(typedef XSegment = Declared(XSegment))*,Int)
 */
private val XDrawSegments_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XDrawSegments_ADDR: MemorySegment = LOOKUP.find("XDrawSegments").orElseThrow()
private val XDrawSegments_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDrawSegments_ADDR, XDrawSegments_DESC)

fun XDrawSegments(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: Int): Int {
    try {
        return XDrawSegments_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFillArc Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,Int,Int,UNSIGNED = Int,UNSIGNED = Int,Int,Int)
 */
private val XFillArc_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XFillArc_ADDR: MemorySegment = LOOKUP.find("XFillArc").orElseThrow()
private val XFillArc_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFillArc_ADDR, XFillArc_DESC)

fun XFillArc(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int): Int {
    try {
        return XFillArc_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFillArcs Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,(typedef XArc = Declared(XArc))*,Int)
 */
private val XFillArcs_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XFillArcs_ADDR: MemorySegment = LOOKUP.find("XFillArcs").orElseThrow()
private val XFillArcs_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFillArcs_ADDR, XFillArcs_DESC)

fun XFillArcs(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: Int): Int {
    try {
        return XFillArcs_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFillPolygon Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,(typedef XPoint = Declared(XPoint))*,Int,Int,Int)
 */
private val XFillPolygon_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XFillPolygon_ADDR: MemorySegment = LOOKUP.find("XFillPolygon").orElseThrow()
private val XFillPolygon_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFillPolygon_ADDR, XFillPolygon_DESC)

fun XFillPolygon(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: Int, arg5: Int, arg6: Int): Int {
    try {
        return XFillPolygon_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFillRectangle Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,Int,Int,UNSIGNED = Int,UNSIGNED = Int)
 */
private val XFillRectangle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XFillRectangle_ADDR: MemorySegment = LOOKUP.find("XFillRectangle").orElseThrow()
private val XFillRectangle_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFillRectangle_ADDR, XFillRectangle_DESC)

fun XFillRectangle(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Int {
    try {
        return XFillRectangle_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFillRectangles Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Declared(_XGC))*,(typedef XRectangle = Declared(XRectangle))*,Int)
 */
private val XFillRectangles_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XFillRectangles_ADDR: MemorySegment = LOOKUP.find("XFillRectangles").orElseThrow()
private val XFillRectangles_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFillRectangles_ADDR, XFillRectangles_DESC)

fun XFillRectangles(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: Int): Int {
    try {
        return XFillRectangles_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFlush Int((typedef Display = Declared(_XDisplay))*)
 */
private val XFlush_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XFlush_ADDR: MemorySegment = LOOKUP.find("XFlush").orElseThrow()
private val XFlush_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFlush_ADDR, XFlush_DESC)

fun XFlush(arg0: MemorySegment): Int {
    try {
        return XFlush_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFree Int((Void)*)
 */
private val XFree_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XFree_ADDR: MemorySegment = LOOKUP.find("XFree").orElseThrow()
private val XFree_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFree_ADDR, XFree_DESC)

fun XFree(arg0: MemorySegment): Int {
    try {
        return XFree_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFreeColormap Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XFreeColormap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XFreeColormap_ADDR: MemorySegment = LOOKUP.find("XFreeColormap").orElseThrow()
private val XFreeColormap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFreeColormap_ADDR, XFreeColormap_DESC)

fun XFreeColormap(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XFreeColormap_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFreeColors Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(UNSIGNED = Long)*,Int,UNSIGNED = Long)
 */
private val XFreeColors_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private val XFreeColors_ADDR: MemorySegment = LOOKUP.find("XFreeColors").orElseThrow()
private val XFreeColors_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFreeColors_ADDR, XFreeColors_DESC)

fun XFreeColors(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Long): Int {
    try {
        return XFreeColors_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFreeCursor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XFreeCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XFreeCursor_ADDR: MemorySegment = LOOKUP.find("XFreeCursor").orElseThrow()
private val XFreeCursor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFreeCursor_ADDR, XFreeCursor_DESC)

fun XFreeCursor(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XFreeCursor_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFreeGC Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*)
 */
private val XFreeGC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XFreeGC_ADDR: MemorySegment = LOOKUP.find("XFreeGC").orElseThrow()
private val XFreeGC_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFreeGC_ADDR, XFreeGC_DESC)

fun XFreeGC(arg0: MemorySegment, arg1: MemorySegment): Int {
    try {
        return XFreeGC_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFreePixmap Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XFreePixmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XFreePixmap_ADDR: MemorySegment = LOOKUP.find("XFreePixmap").orElseThrow()
private val XFreePixmap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFreePixmap_ADDR, XFreePixmap_DESC)

fun XFreePixmap(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XFreePixmap_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XGetGCValues Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long,(typedef XGCValues = Declared(XGCValues))*)
 */
private val XGetGCValues_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XGetGCValues_ADDR: MemorySegment = LOOKUP.find("XGetGCValues").orElseThrow()
private val XGetGCValues_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGetGCValues_ADDR, XGetGCValues_DESC)

fun XGetGCValues(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): Int {
    try {
        return XGetGCValues_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XGetGeometry Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef Window = UNSIGNED = Long)*,(Int)*,(Int)*,(UNSIGNED = Int)*,(UNSIGNED = Int)*,(UNSIGNED = Int)*,(UNSIGNED = Int)*)
 */
private val XGetGeometry_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XGetGeometry_ADDR: MemorySegment = LOOKUP.find("XGetGeometry").orElseThrow()
private val XGetGeometry_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGetGeometry_ADDR, XGetGeometry_DESC)

fun XGetGeometry(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment): Int {
    try {
        return XGetGeometry_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XGetWindowProperty Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,Long,Long,Int,UNSIGNED = Long,(typedef Atom = UNSIGNED = Long)*,(Int)*,(UNSIGNED = Long)*,(UNSIGNED = Long)*,((UNSIGNED = Char)*)*)
 */
private val XGetWindowProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XGetWindowProperty_ADDR: MemorySegment = LOOKUP.find("XGetWindowProperty").orElseThrow()
private val XGetWindowProperty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGetWindowProperty_ADDR, XGetWindowProperty_DESC)

fun XGetWindowProperty(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Int, arg6: Long, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment, arg10: MemorySegment, arg11: MemorySegment): Int {
    try {
        return XGetWindowProperty_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XGetWindowAttributes Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef XWindowAttributes = Declared(XWindowAttributes))*)
 */
private val XGetWindowAttributes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XGetWindowAttributes_ADDR: MemorySegment = LOOKUP.find("XGetWindowAttributes").orElseThrow()
private val XGetWindowAttributes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGetWindowAttributes_ADDR, XGetWindowAttributes_DESC)

fun XGetWindowAttributes(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Int {
    try {
        return XGetWindowAttributes_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XGrabPointer Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,UNSIGNED = Int,Int,Int,UNSIGNED = Long,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XGrabPointer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XGrabPointer_ADDR: MemorySegment = LOOKUP.find("XGrabPointer").orElseThrow()
private val XGrabPointer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGrabPointer_ADDR, XGrabPointer_DESC)

fun XGrabPointer(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Long, arg7: Long, arg8: Long): Int {
    try {
        return XGrabPointer_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XKeysymToKeycode UNSIGNED = Char((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XKeysymToKeycode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XKeysymToKeycode_ADDR: MemorySegment = LOOKUP.find("XKeysymToKeycode").orElseThrow()
private val XKeysymToKeycode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XKeysymToKeycode_ADDR, XKeysymToKeycode_DESC)

fun XKeysymToKeycode(arg0: MemorySegment, arg1: Long): Byte {
    try {
        return XKeysymToKeycode_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XLookupColor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Char)*,(typedef XColor = Declared(XColor))*,(typedef XColor = Declared(XColor))*)
 */
private val XLookupColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XLookupColor_ADDR: MemorySegment = LOOKUP.find("XLookupColor").orElseThrow()
private val XLookupColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XLookupColor_ADDR, XLookupColor_DESC)

fun XLookupColor(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Int {
    try {
        return XLookupColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XMapWindow Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XMapWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XMapWindow_ADDR: MemorySegment = LOOKUP.find("XMapWindow").orElseThrow()
private val XMapWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XMapWindow_ADDR, XMapWindow_DESC)

fun XMapWindow(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XMapWindow_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XMoveWindow Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,Int)
 */
private val XMoveWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XMoveWindow_ADDR: MemorySegment = LOOKUP.find("XMoveWindow").orElseThrow()
private val XMoveWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XMoveWindow_ADDR, XMoveWindow_DESC)

fun XMoveWindow(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int): Int {
    try {
        return XMoveWindow_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XNextEvent Int((typedef Display = Declared(_XDisplay))*,(typedef XEvent = Declared(_XEvent))*)
 */
private val XNextEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XNextEvent_ADDR: MemorySegment = LOOKUP.find("XNextEvent").orElseThrow()
private val XNextEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XNextEvent_ADDR, XNextEvent_DESC)

fun XNextEvent(arg0: MemorySegment, arg1: MemorySegment): Int {
    try {
        return XNextEvent_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XParseColor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Char)*,(typedef XColor = Declared(XColor))*)
 */
private val XParseColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XParseColor_ADDR: MemorySegment = LOOKUP.find("XParseColor").orElseThrow()
private val XParseColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XParseColor_ADDR, XParseColor_DESC)

fun XParseColor(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment): Int {
    try {
        return XParseColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XPending Int((typedef Display = Declared(_XDisplay))*)
 */
private val XPending_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XPending_ADDR: MemorySegment = LOOKUP.find("XPending").orElseThrow()
private val XPending_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XPending_ADDR, XPending_DESC)

fun XPending(arg0: MemorySegment): Int {
    try {
        return XPending_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XQueryBestCursor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Int,UNSIGNED = Int,(UNSIGNED = Int)*,(UNSIGNED = Int)*)
 */
private val XQueryBestCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XQueryBestCursor_ADDR: MemorySegment = LOOKUP.find("XQueryBestCursor").orElseThrow()
private val XQueryBestCursor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XQueryBestCursor_ADDR, XQueryBestCursor_DESC)

fun XQueryBestCursor(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int, arg4: MemorySegment, arg5: MemorySegment): Int {
    try {
        return XQueryBestCursor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XQueryColor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef XColor = Declared(XColor))*)
 */
private val XQueryColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XQueryColor_ADDR: MemorySegment = LOOKUP.find("XQueryColor").orElseThrow()
private val XQueryColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XQueryColor_ADDR, XQueryColor_DESC)

fun XQueryColor(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Int {
    try {
        return XQueryColor_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XQueryColors Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef XColor = Declared(XColor))*,Int)
 */
private val XQueryColors_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XQueryColors_ADDR: MemorySegment = LOOKUP.find("XQueryColors").orElseThrow()
private val XQueryColors_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XQueryColors_ADDR, XQueryColors_DESC)

fun XQueryColors(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int): Int {
    try {
        return XQueryColors_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XQueryKeymap Int((typedef Display = Declared(_XDisplay))*,(Char)*)
 */
private val XQueryKeymap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XQueryKeymap_ADDR: MemorySegment = LOOKUP.find("XQueryKeymap").orElseThrow()
private val XQueryKeymap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XQueryKeymap_ADDR, XQueryKeymap_DESC)

fun XQueryKeymap(arg0: MemorySegment, arg1: MemorySegment): Int {
    try {
        return XQueryKeymap_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XQueryPointer Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef Window = UNSIGNED = Long)*,(typedef Window = UNSIGNED = Long)*,(Int)*,(Int)*,(Int)*,(Int)*,(UNSIGNED = Int)*)
 */
private val XQueryPointer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XQueryPointer_ADDR: MemorySegment = LOOKUP.find("XQueryPointer").orElseThrow()
private val XQueryPointer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XQueryPointer_ADDR, XQueryPointer_DESC)

fun XQueryPointer(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment): Int {
    try {
        return XQueryPointer_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XQueryTree Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef Window = UNSIGNED = Long)*,(typedef Window = UNSIGNED = Long)*,((typedef Window = UNSIGNED = Long)*)*,(UNSIGNED = Int)*)
 */
private val XQueryTree_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XQueryTree_ADDR: MemorySegment = LOOKUP.find("XQueryTree").orElseThrow()
private val XQueryTree_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XQueryTree_ADDR, XQueryTree_DESC)

fun XQueryTree(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): Int {
    try {
        return XQueryTree_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XRaiseWindow Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XRaiseWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XRaiseWindow_ADDR: MemorySegment = LOOKUP.find("XRaiseWindow").orElseThrow()
private val XRaiseWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XRaiseWindow_ADDR, XRaiseWindow_DESC)

fun XRaiseWindow(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XRaiseWindow_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XResizeWindow Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Int,UNSIGNED = Int)
 */
private val XResizeWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XResizeWindow_ADDR: MemorySegment = LOOKUP.find("XResizeWindow").orElseThrow()
private val XResizeWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XResizeWindow_ADDR, XResizeWindow_DESC)

fun XResizeWindow(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int): Int {
    try {
        return XResizeWindow_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSelectInput Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Long)
 */
private val XSelectInput_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XSelectInput_ADDR: MemorySegment = LOOKUP.find("XSelectInput").orElseThrow()
private val XSelectInput_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSelectInput_ADDR, XSelectInput_DESC)

fun XSelectInput(arg0: MemorySegment, arg1: Long, arg2: Long): Int {
    try {
        return XSelectInput_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSendEvent Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,Long,(typedef XEvent = Declared(_XEvent))*)
 */
private val XSendEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XSendEvent_ADDR: MemorySegment = LOOKUP.find("XSendEvent").orElseThrow()
private val XSendEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSendEvent_ADDR, XSendEvent_DESC)

fun XSendEvent(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Long, arg4: MemorySegment): Int {
    try {
        return XSendEvent_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetArcMode Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int)
 */
private val XSetArcMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSetArcMode_ADDR: MemorySegment = LOOKUP.find("XSetArcMode").orElseThrow()
private val XSetArcMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetArcMode_ADDR, XSetArcMode_DESC)

fun XSetArcMode(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    try {
        return XSetArcMode_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetBackground Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long)
 */
private val XSetBackground_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XSetBackground_ADDR: MemorySegment = LOOKUP.find("XSetBackground").orElseThrow()
private val XSetBackground_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetBackground_ADDR, XSetBackground_DESC)

fun XSetBackground(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Int {
    try {
        return XSetBackground_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetClipMask Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long)
 */
private val XSetClipMask_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XSetClipMask_ADDR: MemorySegment = LOOKUP.find("XSetClipMask").orElseThrow()
private val XSetClipMask_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetClipMask_ADDR, XSetClipMask_DESC)

fun XSetClipMask(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Int {
    try {
        return XSetClipMask_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetClipOrigin Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int,Int)
 */
private val XSetClipOrigin_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XSetClipOrigin_ADDR: MemorySegment = LOOKUP.find("XSetClipOrigin").orElseThrow()
private val XSetClipOrigin_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetClipOrigin_ADDR, XSetClipOrigin_DESC)

fun XSetClipOrigin(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int): Int {
    try {
        return XSetClipOrigin_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetClipRectangles Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int,Int,(typedef XRectangle = Declared(XRectangle))*,Int,Int)
 */
private val XSetClipRectangles_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XSetClipRectangles_ADDR: MemorySegment = LOOKUP.find("XSetClipRectangles").orElseThrow()
private val XSetClipRectangles_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetClipRectangles_ADDR, XSetClipRectangles_DESC)

fun XSetClipRectangles(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int, arg4: MemorySegment, arg5: Int, arg6: Int): Int {
    try {
        return XSetClipRectangles_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetDashes Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int,(Char)*,Int)
 */
private val XSetDashes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSetDashes_ADDR: MemorySegment = LOOKUP.find("XSetDashes").orElseThrow()
private val XSetDashes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetDashes_ADDR, XSetDashes_DESC)

fun XSetDashes(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: MemorySegment, arg4: Int): Int {
    try {
        return XSetDashes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetFillRule Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int)
 */
private val XSetFillRule_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSetFillRule_ADDR: MemorySegment = LOOKUP.find("XSetFillRule").orElseThrow()
private val XSetFillRule_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetFillRule_ADDR, XSetFillRule_DESC)

fun XSetFillRule(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    try {
        return XSetFillRule_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetFillStyle Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int)
 */
private val XSetFillStyle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSetFillStyle_ADDR: MemorySegment = LOOKUP.find("XSetFillStyle").orElseThrow()
private val XSetFillStyle_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetFillStyle_ADDR, XSetFillStyle_DESC)

fun XSetFillStyle(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    try {
        return XSetFillStyle_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetFont Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long)
 */
private val XSetFont_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XSetFont_ADDR: MemorySegment = LOOKUP.find("XSetFont").orElseThrow()
private val XSetFont_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetFont_ADDR, XSetFont_DESC)

fun XSetFont(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Int {
    try {
        return XSetFont_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetForeground Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long)
 */
private val XSetForeground_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XSetForeground_ADDR: MemorySegment = LOOKUP.find("XSetForeground").orElseThrow()
private val XSetForeground_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetForeground_ADDR, XSetForeground_DESC)

fun XSetForeground(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Int {
    try {
        return XSetForeground_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetFunction Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int)
 */
private val XSetFunction_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSetFunction_ADDR: MemorySegment = LOOKUP.find("XSetFunction").orElseThrow()
private val XSetFunction_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetFunction_ADDR, XSetFunction_DESC)

fun XSetFunction(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    try {
        return XSetFunction_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetGraphicsExposures Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int)
 */
private val XSetGraphicsExposures_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSetGraphicsExposures_ADDR: MemorySegment = LOOKUP.find("XSetGraphicsExposures").orElseThrow()
private val XSetGraphicsExposures_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetGraphicsExposures_ADDR, XSetGraphicsExposures_DESC)

fun XSetGraphicsExposures(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    try {
        return XSetGraphicsExposures_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetLineAttributes Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Int,Int,Int,Int)
 */
private val XSetLineAttributes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XSetLineAttributes_ADDR: MemorySegment = LOOKUP.find("XSetLineAttributes").orElseThrow()
private val XSetLineAttributes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetLineAttributes_ADDR, XSetLineAttributes_DESC)

fun XSetLineAttributes(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int, arg4: Int, arg5: Int): Int {
    try {
        return XSetLineAttributes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetPlaneMask Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long)
 */
private val XSetPlaneMask_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XSetPlaneMask_ADDR: MemorySegment = LOOKUP.find("XSetPlaneMask").orElseThrow()
private val XSetPlaneMask_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetPlaneMask_ADDR, XSetPlaneMask_DESC)

fun XSetPlaneMask(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Int {
    try {
        return XSetPlaneMask_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetState Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long,UNSIGNED = Long,Int,UNSIGNED = Long)
 */
private val XSetState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private val XSetState_ADDR: MemorySegment = LOOKUP.find("XSetState").orElseThrow()
private val XSetState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetState_ADDR, XSetState_DESC)

fun XSetState(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Long, arg4: Int, arg5: Long): Int {
    try {
        return XSetState_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetStipple Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long)
 */
private val XSetStipple_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XSetStipple_ADDR: MemorySegment = LOOKUP.find("XSetStipple").orElseThrow()
private val XSetStipple_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetStipple_ADDR, XSetStipple_DESC)

fun XSetStipple(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Int {
    try {
        return XSetStipple_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetSubwindowMode Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int)
 */
private val XSetSubwindowMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSetSubwindowMode_ADDR: MemorySegment = LOOKUP.find("XSetSubwindowMode").orElseThrow()
private val XSetSubwindowMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetSubwindowMode_ADDR, XSetSubwindowMode_DESC)

fun XSetSubwindowMode(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    try {
        return XSetSubwindowMode_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetTSOrigin Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,Int,Int)
 */
private val XSetTSOrigin_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XSetTSOrigin_ADDR: MemorySegment = LOOKUP.find("XSetTSOrigin").orElseThrow()
private val XSetTSOrigin_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetTSOrigin_ADDR, XSetTSOrigin_DESC)

fun XSetTSOrigin(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int): Int {
    try {
        return XSetTSOrigin_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetTile Int((typedef Display = Declared(_XDisplay))*,(Declared(_XGC))*,UNSIGNED = Long)
 */
private val XSetTile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XSetTile_ADDR: MemorySegment = LOOKUP.find("XSetTile").orElseThrow()
private val XSetTile_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetTile_ADDR, XSetTile_DESC)

fun XSetTile(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Int {
    try {
        return XSetTile_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetWindowBackground Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XSetWindowBackground_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XSetWindowBackground_ADDR: MemorySegment = LOOKUP.find("XSetWindowBackground").orElseThrow()
private val XSetWindowBackground_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetWindowBackground_ADDR, XSetWindowBackground_DESC)

fun XSetWindowBackground(arg0: MemorySegment, arg1: Long, arg2: Long): Int {
    try {
        return XSetWindowBackground_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetWindowBackgroundPixmap Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XSetWindowBackgroundPixmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XSetWindowBackgroundPixmap_ADDR: MemorySegment = LOOKUP.find("XSetWindowBackgroundPixmap").orElseThrow()
private val XSetWindowBackgroundPixmap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetWindowBackgroundPixmap_ADDR, XSetWindowBackgroundPixmap_DESC)

fun XSetWindowBackgroundPixmap(arg0: MemorySegment, arg1: Long, arg2: Long): Int {
    try {
        return XSetWindowBackgroundPixmap_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetWindowBorder Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XSetWindowBorder_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XSetWindowBorder_ADDR: MemorySegment = LOOKUP.find("XSetWindowBorder").orElseThrow()
private val XSetWindowBorder_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetWindowBorder_ADDR, XSetWindowBorder_DESC)

fun XSetWindowBorder(arg0: MemorySegment, arg1: Long, arg2: Long): Int {
    try {
        return XSetWindowBorder_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetWindowBorderPixmap Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long)
 */
private val XSetWindowBorderPixmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val XSetWindowBorderPixmap_ADDR: MemorySegment = LOOKUP.find("XSetWindowBorderPixmap").orElseThrow()
private val XSetWindowBorderPixmap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetWindowBorderPixmap_ADDR, XSetWindowBorderPixmap_DESC)

fun XSetWindowBorderPixmap(arg0: MemorySegment, arg1: Long, arg2: Long): Int {
    try {
        return XSetWindowBorderPixmap_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XStoreColor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef XColor = Declared(XColor))*)
 */
private val XStoreColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XStoreColor_ADDR: MemorySegment = LOOKUP.find("XStoreColor").orElseThrow()
private val XStoreColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XStoreColor_ADDR, XStoreColor_DESC)

fun XStoreColor(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Int {
    try {
        return XStoreColor_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XStoreColors Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef XColor = Declared(XColor))*,Int)
 */
private val XStoreColors_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XStoreColors_ADDR: MemorySegment = LOOKUP.find("XStoreColors").orElseThrow()
private val XStoreColors_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XStoreColors_ADDR, XStoreColors_DESC)

fun XStoreColors(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int): Int {
    try {
        return XStoreColors_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XStoreName Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Char)*)
 */
private val XStoreName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XStoreName_ADDR: MemorySegment = LOOKUP.find("XStoreName").orElseThrow()
private val XStoreName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XStoreName_ADDR, XStoreName_DESC)

fun XStoreName(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Int {
    try {
        return XStoreName_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XStoreNamedColor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(Char)*,UNSIGNED = Long,Int)
 */
private val XStoreNamedColor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val XStoreNamedColor_ADDR: MemorySegment = LOOKUP.find("XStoreNamedColor").orElseThrow()
private val XStoreNamedColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XStoreNamedColor_ADDR, XStoreNamedColor_DESC)

fun XStoreNamedColor(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Long, arg4: Int): Int {
    try {
        return XStoreNamedColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSync Int((typedef Display = Declared(_XDisplay))*,Int)
 */
private val XSync_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val XSync_ADDR: MemorySegment = LOOKUP.find("XSync").orElseThrow()
private val XSync_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSync_ADDR, XSync_DESC)

fun XSync(arg0: MemorySegment, arg1: Int): Int {
    try {
        return XSync_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XTranslateCoordinates Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,Int,Int,(Int)*,(Int)*,(typedef Window = UNSIGNED = Long)*)
 */
private val XTranslateCoordinates_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XTranslateCoordinates_ADDR: MemorySegment = LOOKUP.find("XTranslateCoordinates").orElseThrow()
private val XTranslateCoordinates_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XTranslateCoordinates_ADDR, XTranslateCoordinates_DESC)

fun XTranslateCoordinates(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Int, arg4: Int, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment): Int {
    try {
        return XTranslateCoordinates_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XUndefineCursor Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XUndefineCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XUndefineCursor_ADDR: MemorySegment = LOOKUP.find("XUndefineCursor").orElseThrow()
private val XUndefineCursor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XUndefineCursor_ADDR, XUndefineCursor_DESC)

fun XUndefineCursor(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XUndefineCursor_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XUngrabPointer Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XUngrabPointer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XUngrabPointer_ADDR: MemorySegment = LOOKUP.find("XUngrabPointer").orElseThrow()
private val XUngrabPointer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XUngrabPointer_ADDR, XUngrabPointer_DESC)

fun XUngrabPointer(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XUngrabPointer_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XUnmapWindow Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XUnmapWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XUnmapWindow_ADDR: MemorySegment = LOOKUP.find("XUnmapWindow").orElseThrow()
private val XUnmapWindow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XUnmapWindow_ADDR, XUnmapWindow_DESC)

fun XUnmapWindow(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XUnmapWindow_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XWarpPointer Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,UNSIGNED = Long,Int,Int,UNSIGNED = Int,UNSIGNED = Int,Int,Int)
 */
private val XWarpPointer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XWarpPointer_ADDR: MemorySegment = LOOKUP.find("XWarpPointer").orElseThrow()
private val XWarpPointer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XWarpPointer_ADDR, XWarpPointer_DESC)

fun XWarpPointer(arg0: MemorySegment, arg1: Long, arg2: Long, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int): Int {
    try {
        return XWarpPointer_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XOpenIM (Declared(_XIM))*((typedef Display = Declared(_XDisplay))*,(Declared(_XrmHashBucketRec))*,(Char)*,(Char)*)
 */
private val XOpenIM_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XOpenIM_ADDR: MemorySegment = LOOKUP.find("XOpenIM").orElseThrow()
private val XOpenIM_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XOpenIM_ADDR, XOpenIM_DESC)

fun XOpenIM(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return XOpenIM_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCloseIM Int((Declared(_XIM))*)
 */
private val XCloseIM_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XCloseIM_ADDR: MemorySegment = LOOKUP.find("XCloseIM").orElseThrow()
private val XCloseIM_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCloseIM_ADDR, XCloseIM_DESC)

fun XCloseIM(arg0: MemorySegment): Int {
    try {
        return XCloseIM_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XCreateIC (Declared(_XIC))*((Declared(_XIM))*)
 */
private val XCreateIC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XCreateIC_ADDR: MemorySegment = LOOKUP.find("XCreateIC").orElseThrow()
private val XCreateIC_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(
    XCreateIC_ADDR, XCreateIC_DESC,
    Linker.Option.firstVariadicArg(1),
)

fun XCreateIC(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment, arg10: MemorySegment, arg11: MemorySegment, arg12: MemorySegment, arg13: MemorySegment, arg14: MemorySegment, arg15: MemorySegment): MemorySegment {
    try {
        return XCreateIC_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDestroyIC Void((Declared(_XIC))*)
 */
private val XDestroyIC_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val XDestroyIC_ADDR: MemorySegment = LOOKUP.find("XDestroyIC").orElseThrow()
private val XDestroyIC_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDestroyIC_ADDR, XDestroyIC_DESC)

fun XDestroyIC(arg0: MemorySegment): Unit {
    try {
        XDestroyIC_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetICFocus Void((Declared(_XIC))*)
 */
private val XSetICFocus_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val XSetICFocus_ADDR: MemorySegment = LOOKUP.find("XSetICFocus").orElseThrow()
private val XSetICFocus_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetICFocus_ADDR, XSetICFocus_DESC)

fun XSetICFocus(arg0: MemorySegment): Unit {
    try {
        XSetICFocus_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XUnsetICFocus Void((Declared(_XIC))*)
 */
private val XUnsetICFocus_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val XUnsetICFocus_ADDR: MemorySegment = LOOKUP.find("XUnsetICFocus").orElseThrow()
private val XUnsetICFocus_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XUnsetICFocus_ADDR, XUnsetICFocus_DESC)

fun XUnsetICFocus(arg0: MemorySegment): Unit {
    try {
        XUnsetICFocus_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetICValues (Char)*((Declared(_XIC))*)
 */
private val XSetICValues_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XSetICValues_ADDR: MemorySegment = LOOKUP.find("XSetICValues").orElseThrow()
private val XSetICValues_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(
    XSetICValues_ADDR, XSetICValues_DESC,
    Linker.Option.firstVariadicArg(1),
)

fun XSetICValues(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return XSetICValues_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XFilterEvent Int((typedef XEvent = Declared(_XEvent))*,UNSIGNED = Long)
 */
private val XFilterEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XFilterEvent_ADDR: MemorySegment = LOOKUP.find("XFilterEvent").orElseThrow()
private val XFilterEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XFilterEvent_ADDR, XFilterEvent_DESC)

fun XFilterEvent(arg0: MemorySegment, arg1: Long): Int {
    try {
        return XFilterEvent_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum XICCEncodingStyle}
 */
enum class XICCEncodingStyle(val value: Long) {
    XStringStyle(0L), XCompoundTextStyle(1L), XTextStyle(2L), XStdICCTextStyle(3L), XUTF8StringStyle(4L);

    companion object {
        fun fromValue(v: Long): XICCEncodingStyle = entries.firstOrNull { it.value == v }
            ?: error("Unknown XICCEncodingStyle value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Int XContext;}
 */
typealias XContext = Int

/**
 * {@snippet lang=c : XAllocWMHints (typedef XWMHints = Declared(XWMHints))*()
 */
private val XAllocWMHints_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val XAllocWMHints_ADDR: MemorySegment = LOOKUP.find("XAllocWMHints").orElseThrow()
private val XAllocWMHints_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XAllocWMHints_ADDR, XAllocWMHints_DESC)

fun XAllocWMHints(): MemorySegment {
    try {
        return XAllocWMHints_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XGetWMHints (typedef XWMHints = Declared(XWMHints))*((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XGetWMHints_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XGetWMHints_ADDR: MemorySegment = LOOKUP.find("XGetWMHints").orElseThrow()
private val XGetWMHints_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XGetWMHints_ADDR, XGetWMHints_DESC)

fun XGetWMHints(arg0: MemorySegment, arg1: Long): MemorySegment {
    try {
        return XGetWMHints_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XLookupString Int((typedef XKeyEvent = Declared(XKeyEvent))*,(Char)*,Int,(typedef KeySym = UNSIGNED = Long)*,(typedef XComposeStatus = Declared(_XComposeStatus))*)
 */
private val XLookupString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XLookupString_ADDR: MemorySegment = LOOKUP.find("XLookupString").orElseThrow()
private val XLookupString_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XLookupString_ADDR, XLookupString_DESC)

fun XLookupString(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: MemorySegment, arg4: MemorySegment): Int {
    try {
        return XLookupString_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XSetWMHints Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef XWMHints = Declared(XWMHints))*)
 */
private val XSetWMHints_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val XSetWMHints_ADDR: MemorySegment = LOOKUP.find("XSetWMHints").orElseThrow()
private val XSetWMHints_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XSetWMHints_ADDR, XSetWMHints_DESC)

fun XSetWMHints(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Int {
    try {
        return XSetWMHints_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef Int XrmQuark;}
 */
typealias XrmQuark = Int

/**
 * NS_ENUM: {@snippet lang=c : enum XrmBinding}
 */
enum class XrmBinding(val value: Long) {
    XrmBindTightly(0L), XrmBindLoosely(1L);

    companion object {
        fun fromValue(v: Long): XrmBinding = entries.firstOrNull { it.value == v }
            ?: error("Unknown XrmBinding value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Int XrmName;}
 */
typealias XrmName = Int

/**
 * {@snippet lang=c : typedef Int XrmClass;}
 */
typealias XrmClass = Int

/**
 * {@snippet lang=c : typedef Int XrmRepresentation;}
 */
typealias XrmRepresentation = Int

/**
 * NS_ENUM: {@snippet lang=c : enum XrmOptionKind}
 */
enum class XrmOptionKind(val value: Long) {
    XrmoptionNoArg(0L), XrmoptionIsArg(1L), XrmoptionStickyArg(2L), XrmoptionSepArg(3L), XrmoptionResArg(4L), XrmoptionSkipArg(5L), XrmoptionSkipLine(6L), XrmoptionSkipNArgs(7L);

    companion object {
        fun fromValue(v: Long): XrmOptionKind = entries.firstOrNull { it.value == v }
            ?: error("Unknown XrmOptionKind value: $v")
    }
}

/**
 * {@snippet lang=c : XkbSetDetectableAutoRepeat Int((typedef Display = Declared(_XDisplay))*,Int,(Int)*)
 */
private val XkbSetDetectableAutoRepeat_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XkbSetDetectableAutoRepeat_ADDR: MemorySegment = LOOKUP.find("XkbSetDetectableAutoRepeat").orElseThrow()
private val XkbSetDetectableAutoRepeat_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XkbSetDetectableAutoRepeat_ADDR, XkbSetDetectableAutoRepeat_DESC)

fun XkbSetDetectableAutoRepeat(arg0: MemorySegment, arg1: Int, arg2: MemorySegment): Int {
    try {
        return XkbSetDetectableAutoRepeat_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ShmSeg;}
 */
typealias ShmSeg = Long

/**
 * {@snippet lang=c : XShmQueryExtension Int((typedef Display = Declared(_XDisplay))*)
 */
private val XShmQueryExtension_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XShmQueryExtension_ADDR: MemorySegment = LOOKUP.find("XShmQueryExtension").orElseThrow()
private val XShmQueryExtension_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XShmQueryExtension_ADDR, XShmQueryExtension_DESC)

fun XShmQueryExtension(arg0: MemorySegment): Int {
    try {
        return XShmQueryExtension_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XShmAttach Int((typedef Display = Declared(_XDisplay))*,(typedef XShmSegmentInfo = Declared(XShmSegmentInfo))*)
 */
private val XShmAttach_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XShmAttach_ADDR: MemorySegment = LOOKUP.find("XShmAttach").orElseThrow()
private val XShmAttach_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XShmAttach_ADDR, XShmAttach_DESC)

fun XShmAttach(arg0: MemorySegment, arg1: MemorySegment): Int {
    try {
        return XShmAttach_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XShmDetach Int((typedef Display = Declared(_XDisplay))*,(typedef XShmSegmentInfo = Declared(XShmSegmentInfo))*)
 */
private val XShmDetach_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val XShmDetach_ADDR: MemorySegment = LOOKUP.find("XShmDetach").orElseThrow()
private val XShmDetach_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XShmDetach_ADDR, XShmDetach_DESC)

fun XShmDetach(arg0: MemorySegment, arg1: MemorySegment): Int {
    try {
        return XShmDetach_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XShmGetImage Int((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,(typedef XImage = Declared(_XImage))*,Int,Int,UNSIGNED = Long)
 */
private val XShmGetImage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private val XShmGetImage_ADDR: MemorySegment = LOOKUP.find("XShmGetImage").orElseThrow()
private val XShmGetImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XShmGetImage_ADDR, XShmGetImage_DESC)

fun XShmGetImage(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Int, arg4: Int, arg5: Long): Int {
    try {
        return XShmGetImage_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XShmCreateImage (typedef XImage = Declared(_XImage))*((typedef Display = Declared(_XDisplay))*,(typedef Visual = Declared(Visual))*,UNSIGNED = Int,Int,(Char)*,(typedef XShmSegmentInfo = Declared(XShmSegmentInfo))*,UNSIGNED = Int,UNSIGNED = Int)
 */
private val XShmCreateImage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XShmCreateImage_ADDR: MemorySegment = LOOKUP.find("XShmCreateImage").orElseThrow()
private val XShmCreateImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XShmCreateImage_ADDR, XShmCreateImage_DESC)

fun XShmCreateImage(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int, arg4: MemorySegment, arg5: MemorySegment, arg6: Int, arg7: Int): MemorySegment {
    try {
        return XShmCreateImage_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XShapeCombineRectangles Void((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long,Int,Int,Int,(typedef XRectangle = Declared(XRectangle))*,Int,Int,Int)
 */
private val XShapeCombineRectangles_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val XShapeCombineRectangles_ADDR: MemorySegment = LOOKUP.find("XShapeCombineRectangles").orElseThrow()
private val XShapeCombineRectangles_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XShapeCombineRectangles_ADDR, XShapeCombineRectangles_DESC)

fun XShapeCombineRectangles(arg0: MemorySegment, arg1: Long, arg2: Int, arg3: Int, arg4: Int, arg5: MemorySegment, arg6: Int, arg7: Int, arg8: Int): Unit {
    try {
        XShapeCombineRectangles_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long XserverRegion;}
 */
typealias XserverRegion = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long PointerBarrier;}
 */
typealias PointerBarrier = Long

/**
 * {@snippet lang=c : XCompositeNameWindowPixmap UNSIGNED = Long((typedef Display = Declared(_XDisplay))*,UNSIGNED = Long)
 */
private val XCompositeNameWindowPixmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val XCompositeNameWindowPixmap_ADDR: MemorySegment = LOOKUP.find("XCompositeNameWindowPixmap").orElseThrow()
private val XCompositeNameWindowPixmap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XCompositeNameWindowPixmap_ADDR, XCompositeNameWindowPixmap_DESC)

fun XCompositeNameWindowPixmap(arg0: MemorySegment, arg1: Long): Long {
    try {
        return XCompositeNameWindowPixmap_HANDLE.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : XDestroyImage Int((typedef XImage = Declared(_XImage))*)
 */
private val XDestroyImage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val XDestroyImage_ADDR: MemorySegment = LOOKUP.find("XDestroyImage").orElseThrow()
private val XDestroyImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(XDestroyImage_ADDR, XDestroyImage_DESC)

fun XDestroyImage(arg0: MemorySegment): Int {
    try {
        return XDestroyImage_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * WARNING: This was originally a C union. Fields overlap in memory!
 * {@snippet lang=c : UNION KffiXEventStorage
 */
/**
 * {@snippet lang=c : UNION KffiXEventStorage
 */
class KffiXEventStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.unionLayout(
            ValueLayout.JAVA_INT.withName("type"),
            MemoryLayout.sequenceLayout(24, ValueLayout.JAVA_LONG).withName("pad")
        ).withName("KffiXEventStorage")

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

    fun pad(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("pad")), layout.select(groupElement("pad")).byteSize())
} // End class

/**
 * {@snippet lang=c : STRUCT XShmSegmentInfoCompat
 */
class XShmSegmentInfoCompat {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("shmseg"),
            ValueLayout.JAVA_INT.withName("shmid"),
            ValueLayout.JAVA_INT.withName("padding_after_shmid"),
            ValueLayout.ADDRESS.withName("shmaddr"),
            ValueLayout.JAVA_INT.withName("readOnly"),
            ValueLayout.JAVA_INT.withName("padding_after_read_only")
        ).withName("XShmSegmentInfoCompat")

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

    val shmseg_VH: VarHandle = layout.varHandle(groupElement("shmseg"))

    @Suppress("UNCHECKED_CAST")
    fun shmseg(segment: MemorySegment): Long =
        shmseg_VH.get(segment, 0L) as Long

    fun shmseg(segment: MemorySegment, value: Long) =
        shmseg_VH.set(segment, 0L, value)

    val shmid_VH: VarHandle = layout.varHandle(groupElement("shmid"))

    @Suppress("UNCHECKED_CAST")
    fun shmid(segment: MemorySegment): Int =
        shmid_VH.get(segment, 0L) as Int

    fun shmid(segment: MemorySegment, value: Int) =
        shmid_VH.set(segment, 0L, value)

    val padding_after_shmid_VH: VarHandle = layout.varHandle(groupElement("padding_after_shmid"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_shmid(segment: MemorySegment): Int =
        padding_after_shmid_VH.get(segment, 0L) as Int

    fun padding_after_shmid(segment: MemorySegment, value: Int) =
        padding_after_shmid_VH.set(segment, 0L, value)

    val shmaddr_VH: VarHandle = layout.varHandle(groupElement("shmaddr"))

    @Suppress("UNCHECKED_CAST")
    fun shmaddr(segment: MemorySegment): MemorySegment =
        shmaddr_VH.get(segment, 0L) as MemorySegment

    fun shmaddr(segment: MemorySegment, value: MemorySegment) =
        shmaddr_VH.set(segment, 0L, value)

    val readOnly_VH: VarHandle = layout.varHandle(groupElement("readOnly"))

    @Suppress("UNCHECKED_CAST")
    fun readOnly(segment: MemorySegment): Int =
        readOnly_VH.get(segment, 0L) as Int

    fun readOnly(segment: MemorySegment, value: Int) =
        readOnly_VH.set(segment, 0L, value)

    val padding_after_read_only_VH: VarHandle = layout.varHandle(groupElement("padding_after_read_only"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_read_only(segment: MemorySegment): Int =
        padding_after_read_only_VH.get(segment, 0L) as Int

    fun padding_after_read_only(segment: MemorySegment, value: Int) =
        padding_after_read_only_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXImageStorage
 */
class KffiXImageStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("width"),
            ValueLayout.JAVA_INT.withName("height"),
            ValueLayout.JAVA_INT.withName("xoffset"),
            ValueLayout.JAVA_INT.withName("format"),
            ValueLayout.ADDRESS.withName("data"),
            ValueLayout.JAVA_INT.withName("byte_order"),
            ValueLayout.JAVA_INT.withName("bitmap_unit"),
            ValueLayout.JAVA_INT.withName("bitmap_bit_order"),
            ValueLayout.JAVA_INT.withName("bitmap_pad"),
            ValueLayout.JAVA_INT.withName("depth"),
            ValueLayout.JAVA_INT.withName("bytes_per_line"),
            ValueLayout.JAVA_INT.withName("bits_per_pixel"),
            ValueLayout.JAVA_INT.withName("padding_before_masks"),
            ValueLayout.JAVA_LONG.withName("red_mask"),
            ValueLayout.JAVA_LONG.withName("green_mask"),
            ValueLayout.JAVA_LONG.withName("blue_mask"),
            ValueLayout.ADDRESS.withName("obdata"),
            ValueLayout.ADDRESS.withName("create_image"),
            ValueLayout.ADDRESS.withName("destroy_image"),
            ValueLayout.ADDRESS.withName("get_pixel"),
            ValueLayout.ADDRESS.withName("put_pixel"),
            ValueLayout.ADDRESS.withName("sub_image"),
            ValueLayout.ADDRESS.withName("add_pixel")
        ).withName("KffiXImageStorage")

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

    val width_VH: VarHandle = layout.varHandle(groupElement("width"))

    @Suppress("UNCHECKED_CAST")
    fun width(segment: MemorySegment): Int =
        width_VH.get(segment, 0L) as Int

    fun width(segment: MemorySegment, value: Int) =
        width_VH.set(segment, 0L, value)

    val height_VH: VarHandle = layout.varHandle(groupElement("height"))

    @Suppress("UNCHECKED_CAST")
    fun height(segment: MemorySegment): Int =
        height_VH.get(segment, 0L) as Int

    fun height(segment: MemorySegment, value: Int) =
        height_VH.set(segment, 0L, value)

    val xoffset_VH: VarHandle = layout.varHandle(groupElement("xoffset"))

    @Suppress("UNCHECKED_CAST")
    fun xoffset(segment: MemorySegment): Int =
        xoffset_VH.get(segment, 0L) as Int

    fun xoffset(segment: MemorySegment, value: Int) =
        xoffset_VH.set(segment, 0L, value)

    val format_VH: VarHandle = layout.varHandle(groupElement("format"))

    @Suppress("UNCHECKED_CAST")
    fun format(segment: MemorySegment): Int =
        format_VH.get(segment, 0L) as Int

    fun format(segment: MemorySegment, value: Int) =
        format_VH.set(segment, 0L, value)

    val data_VH: VarHandle = layout.varHandle(groupElement("data"))

    @Suppress("UNCHECKED_CAST")
    fun data(segment: MemorySegment): MemorySegment =
        data_VH.get(segment, 0L) as MemorySegment

    fun data(segment: MemorySegment, value: MemorySegment) =
        data_VH.set(segment, 0L, value)

    val byte_order_VH: VarHandle = layout.varHandle(groupElement("byte_order"))

    @Suppress("UNCHECKED_CAST")
    fun byte_order(segment: MemorySegment): Int =
        byte_order_VH.get(segment, 0L) as Int

    fun byte_order(segment: MemorySegment, value: Int) =
        byte_order_VH.set(segment, 0L, value)

    val bitmap_unit_VH: VarHandle = layout.varHandle(groupElement("bitmap_unit"))

    @Suppress("UNCHECKED_CAST")
    fun bitmap_unit(segment: MemorySegment): Int =
        bitmap_unit_VH.get(segment, 0L) as Int

    fun bitmap_unit(segment: MemorySegment, value: Int) =
        bitmap_unit_VH.set(segment, 0L, value)

    val bitmap_bit_order_VH: VarHandle = layout.varHandle(groupElement("bitmap_bit_order"))

    @Suppress("UNCHECKED_CAST")
    fun bitmap_bit_order(segment: MemorySegment): Int =
        bitmap_bit_order_VH.get(segment, 0L) as Int

    fun bitmap_bit_order(segment: MemorySegment, value: Int) =
        bitmap_bit_order_VH.set(segment, 0L, value)

    val bitmap_pad_VH: VarHandle = layout.varHandle(groupElement("bitmap_pad"))

    @Suppress("UNCHECKED_CAST")
    fun bitmap_pad(segment: MemorySegment): Int =
        bitmap_pad_VH.get(segment, 0L) as Int

    fun bitmap_pad(segment: MemorySegment, value: Int) =
        bitmap_pad_VH.set(segment, 0L, value)

    val depth_VH: VarHandle = layout.varHandle(groupElement("depth"))

    @Suppress("UNCHECKED_CAST")
    fun depth(segment: MemorySegment): Int =
        depth_VH.get(segment, 0L) as Int

    fun depth(segment: MemorySegment, value: Int) =
        depth_VH.set(segment, 0L, value)

    val bytes_per_line_VH: VarHandle = layout.varHandle(groupElement("bytes_per_line"))

    @Suppress("UNCHECKED_CAST")
    fun bytes_per_line(segment: MemorySegment): Int =
        bytes_per_line_VH.get(segment, 0L) as Int

    fun bytes_per_line(segment: MemorySegment, value: Int) =
        bytes_per_line_VH.set(segment, 0L, value)

    val bits_per_pixel_VH: VarHandle = layout.varHandle(groupElement("bits_per_pixel"))

    @Suppress("UNCHECKED_CAST")
    fun bits_per_pixel(segment: MemorySegment): Int =
        bits_per_pixel_VH.get(segment, 0L) as Int

    fun bits_per_pixel(segment: MemorySegment, value: Int) =
        bits_per_pixel_VH.set(segment, 0L, value)

    val padding_before_masks_VH: VarHandle = layout.varHandle(groupElement("padding_before_masks"))

    @Suppress("UNCHECKED_CAST")
    fun padding_before_masks(segment: MemorySegment): Int =
        padding_before_masks_VH.get(segment, 0L) as Int

    fun padding_before_masks(segment: MemorySegment, value: Int) =
        padding_before_masks_VH.set(segment, 0L, value)

    val red_mask_VH: VarHandle = layout.varHandle(groupElement("red_mask"))

    @Suppress("UNCHECKED_CAST")
    fun red_mask(segment: MemorySegment): Long =
        red_mask_VH.get(segment, 0L) as Long

    fun red_mask(segment: MemorySegment, value: Long) =
        red_mask_VH.set(segment, 0L, value)

    val green_mask_VH: VarHandle = layout.varHandle(groupElement("green_mask"))

    @Suppress("UNCHECKED_CAST")
    fun green_mask(segment: MemorySegment): Long =
        green_mask_VH.get(segment, 0L) as Long

    fun green_mask(segment: MemorySegment, value: Long) =
        green_mask_VH.set(segment, 0L, value)

    val blue_mask_VH: VarHandle = layout.varHandle(groupElement("blue_mask"))

    @Suppress("UNCHECKED_CAST")
    fun blue_mask(segment: MemorySegment): Long =
        blue_mask_VH.get(segment, 0L) as Long

    fun blue_mask(segment: MemorySegment, value: Long) =
        blue_mask_VH.set(segment, 0L, value)

    val obdata_VH: VarHandle = layout.varHandle(groupElement("obdata"))

    @Suppress("UNCHECKED_CAST")
    fun obdata(segment: MemorySegment): MemorySegment =
        obdata_VH.get(segment, 0L) as MemorySegment

    fun obdata(segment: MemorySegment, value: MemorySegment) =
        obdata_VH.set(segment, 0L, value)

    val create_image_VH: VarHandle = layout.varHandle(groupElement("create_image"))

    @Suppress("UNCHECKED_CAST")
    fun create_image(segment: MemorySegment): MemorySegment =
        create_image_VH.get(segment, 0L) as MemorySegment

    fun create_image(segment: MemorySegment, value: MemorySegment) =
        create_image_VH.set(segment, 0L, value)

    val destroy_image_VH: VarHandle = layout.varHandle(groupElement("destroy_image"))

    @Suppress("UNCHECKED_CAST")
    fun destroy_image(segment: MemorySegment): MemorySegment =
        destroy_image_VH.get(segment, 0L) as MemorySegment

    fun destroy_image(segment: MemorySegment, value: MemorySegment) =
        destroy_image_VH.set(segment, 0L, value)

    val get_pixel_VH: VarHandle = layout.varHandle(groupElement("get_pixel"))

    @Suppress("UNCHECKED_CAST")
    fun get_pixel(segment: MemorySegment): MemorySegment =
        get_pixel_VH.get(segment, 0L) as MemorySegment

    fun get_pixel(segment: MemorySegment, value: MemorySegment) =
        get_pixel_VH.set(segment, 0L, value)

    val put_pixel_VH: VarHandle = layout.varHandle(groupElement("put_pixel"))

    @Suppress("UNCHECKED_CAST")
    fun put_pixel(segment: MemorySegment): MemorySegment =
        put_pixel_VH.get(segment, 0L) as MemorySegment

    fun put_pixel(segment: MemorySegment, value: MemorySegment) =
        put_pixel_VH.set(segment, 0L, value)

    val sub_image_VH: VarHandle = layout.varHandle(groupElement("sub_image"))

    @Suppress("UNCHECKED_CAST")
    fun sub_image(segment: MemorySegment): MemorySegment =
        sub_image_VH.get(segment, 0L) as MemorySegment

    fun sub_image(segment: MemorySegment, value: MemorySegment) =
        sub_image_VH.set(segment, 0L, value)

    val add_pixel_VH: VarHandle = layout.varHandle(groupElement("add_pixel"))

    @Suppress("UNCHECKED_CAST")
    fun add_pixel(segment: MemorySegment): MemorySegment =
        add_pixel_VH.get(segment, 0L) as MemorySegment

    fun add_pixel(segment: MemorySegment, value: MemorySegment) =
        add_pixel_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXWindowAttributesStorage
 */
class KffiXWindowAttributesStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("x"),
            ValueLayout.JAVA_INT.withName("y"),
            ValueLayout.JAVA_INT.withName("width"),
            ValueLayout.JAVA_INT.withName("height"),
            ValueLayout.JAVA_INT.withName("border_width"),
            ValueLayout.JAVA_INT.withName("depth"),
            ValueLayout.ADDRESS.withName("visual"),
            ValueLayout.JAVA_LONG.withName("root"),
            ValueLayout.JAVA_INT.withName("c_class"),
            ValueLayout.JAVA_INT.withName("bit_gravity"),
            ValueLayout.JAVA_INT.withName("win_gravity"),
            ValueLayout.JAVA_INT.withName("backing_store"),
            ValueLayout.JAVA_LONG.withName("backing_planes"),
            ValueLayout.JAVA_LONG.withName("backing_pixel"),
            ValueLayout.JAVA_INT.withName("save_under"),
            ValueLayout.JAVA_INT.withName("padding_after_save_under"),
            ValueLayout.JAVA_LONG.withName("colormap"),
            ValueLayout.JAVA_INT.withName("map_installed"),
            ValueLayout.JAVA_INT.withName("map_state"),
            ValueLayout.JAVA_LONG.withName("all_event_masks"),
            ValueLayout.JAVA_LONG.withName("your_event_mask"),
            ValueLayout.JAVA_LONG.withName("do_not_propagate_mask"),
            ValueLayout.JAVA_INT.withName("override_redirect"),
            ValueLayout.JAVA_INT.withName("padding_after_override_redirect"),
            ValueLayout.ADDRESS.withName("screen")
        ).withName("KffiXWindowAttributesStorage")

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

    val x_VH: VarHandle = layout.varHandle(groupElement("x"))

    @Suppress("UNCHECKED_CAST")
    fun x(segment: MemorySegment): Int =
        x_VH.get(segment, 0L) as Int

    fun x(segment: MemorySegment, value: Int) =
        x_VH.set(segment, 0L, value)

    val y_VH: VarHandle = layout.varHandle(groupElement("y"))

    @Suppress("UNCHECKED_CAST")
    fun y(segment: MemorySegment): Int =
        y_VH.get(segment, 0L) as Int

    fun y(segment: MemorySegment, value: Int) =
        y_VH.set(segment, 0L, value)

    val width_VH: VarHandle = layout.varHandle(groupElement("width"))

    @Suppress("UNCHECKED_CAST")
    fun width(segment: MemorySegment): Int =
        width_VH.get(segment, 0L) as Int

    fun width(segment: MemorySegment, value: Int) =
        width_VH.set(segment, 0L, value)

    val height_VH: VarHandle = layout.varHandle(groupElement("height"))

    @Suppress("UNCHECKED_CAST")
    fun height(segment: MemorySegment): Int =
        height_VH.get(segment, 0L) as Int

    fun height(segment: MemorySegment, value: Int) =
        height_VH.set(segment, 0L, value)

    val border_width_VH: VarHandle = layout.varHandle(groupElement("border_width"))

    @Suppress("UNCHECKED_CAST")
    fun border_width(segment: MemorySegment): Int =
        border_width_VH.get(segment, 0L) as Int

    fun border_width(segment: MemorySegment, value: Int) =
        border_width_VH.set(segment, 0L, value)

    val depth_VH: VarHandle = layout.varHandle(groupElement("depth"))

    @Suppress("UNCHECKED_CAST")
    fun depth(segment: MemorySegment): Int =
        depth_VH.get(segment, 0L) as Int

    fun depth(segment: MemorySegment, value: Int) =
        depth_VH.set(segment, 0L, value)

    val visual_VH: VarHandle = layout.varHandle(groupElement("visual"))

    @Suppress("UNCHECKED_CAST")
    fun visual(segment: MemorySegment): MemorySegment =
        visual_VH.get(segment, 0L) as MemorySegment

    fun visual(segment: MemorySegment, value: MemorySegment) =
        visual_VH.set(segment, 0L, value)

    val root_VH: VarHandle = layout.varHandle(groupElement("root"))

    @Suppress("UNCHECKED_CAST")
    fun root(segment: MemorySegment): Long =
        root_VH.get(segment, 0L) as Long

    fun root(segment: MemorySegment, value: Long) =
        root_VH.set(segment, 0L, value)

    val c_class_VH: VarHandle = layout.varHandle(groupElement("c_class"))

    @Suppress("UNCHECKED_CAST")
    fun c_class(segment: MemorySegment): Int =
        c_class_VH.get(segment, 0L) as Int

    fun c_class(segment: MemorySegment, value: Int) =
        c_class_VH.set(segment, 0L, value)

    val bit_gravity_VH: VarHandle = layout.varHandle(groupElement("bit_gravity"))

    @Suppress("UNCHECKED_CAST")
    fun bit_gravity(segment: MemorySegment): Int =
        bit_gravity_VH.get(segment, 0L) as Int

    fun bit_gravity(segment: MemorySegment, value: Int) =
        bit_gravity_VH.set(segment, 0L, value)

    val win_gravity_VH: VarHandle = layout.varHandle(groupElement("win_gravity"))

    @Suppress("UNCHECKED_CAST")
    fun win_gravity(segment: MemorySegment): Int =
        win_gravity_VH.get(segment, 0L) as Int

    fun win_gravity(segment: MemorySegment, value: Int) =
        win_gravity_VH.set(segment, 0L, value)

    val backing_store_VH: VarHandle = layout.varHandle(groupElement("backing_store"))

    @Suppress("UNCHECKED_CAST")
    fun backing_store(segment: MemorySegment): Int =
        backing_store_VH.get(segment, 0L) as Int

    fun backing_store(segment: MemorySegment, value: Int) =
        backing_store_VH.set(segment, 0L, value)

    val backing_planes_VH: VarHandle = layout.varHandle(groupElement("backing_planes"))

    @Suppress("UNCHECKED_CAST")
    fun backing_planes(segment: MemorySegment): Long =
        backing_planes_VH.get(segment, 0L) as Long

    fun backing_planes(segment: MemorySegment, value: Long) =
        backing_planes_VH.set(segment, 0L, value)

    val backing_pixel_VH: VarHandle = layout.varHandle(groupElement("backing_pixel"))

    @Suppress("UNCHECKED_CAST")
    fun backing_pixel(segment: MemorySegment): Long =
        backing_pixel_VH.get(segment, 0L) as Long

    fun backing_pixel(segment: MemorySegment, value: Long) =
        backing_pixel_VH.set(segment, 0L, value)

    val save_under_VH: VarHandle = layout.varHandle(groupElement("save_under"))

    @Suppress("UNCHECKED_CAST")
    fun save_under(segment: MemorySegment): Int =
        save_under_VH.get(segment, 0L) as Int

    fun save_under(segment: MemorySegment, value: Int) =
        save_under_VH.set(segment, 0L, value)

    val padding_after_save_under_VH: VarHandle = layout.varHandle(groupElement("padding_after_save_under"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_save_under(segment: MemorySegment): Int =
        padding_after_save_under_VH.get(segment, 0L) as Int

    fun padding_after_save_under(segment: MemorySegment, value: Int) =
        padding_after_save_under_VH.set(segment, 0L, value)

    val colormap_VH: VarHandle = layout.varHandle(groupElement("colormap"))

    @Suppress("UNCHECKED_CAST")
    fun colormap(segment: MemorySegment): Long =
        colormap_VH.get(segment, 0L) as Long

    fun colormap(segment: MemorySegment, value: Long) =
        colormap_VH.set(segment, 0L, value)

    val map_installed_VH: VarHandle = layout.varHandle(groupElement("map_installed"))

    @Suppress("UNCHECKED_CAST")
    fun map_installed(segment: MemorySegment): Int =
        map_installed_VH.get(segment, 0L) as Int

    fun map_installed(segment: MemorySegment, value: Int) =
        map_installed_VH.set(segment, 0L, value)

    val map_state_VH: VarHandle = layout.varHandle(groupElement("map_state"))

    @Suppress("UNCHECKED_CAST")
    fun map_state(segment: MemorySegment): Int =
        map_state_VH.get(segment, 0L) as Int

    fun map_state(segment: MemorySegment, value: Int) =
        map_state_VH.set(segment, 0L, value)

    val all_event_masks_VH: VarHandle = layout.varHandle(groupElement("all_event_masks"))

    @Suppress("UNCHECKED_CAST")
    fun all_event_masks(segment: MemorySegment): Long =
        all_event_masks_VH.get(segment, 0L) as Long

    fun all_event_masks(segment: MemorySegment, value: Long) =
        all_event_masks_VH.set(segment, 0L, value)

    val your_event_mask_VH: VarHandle = layout.varHandle(groupElement("your_event_mask"))

    @Suppress("UNCHECKED_CAST")
    fun your_event_mask(segment: MemorySegment): Long =
        your_event_mask_VH.get(segment, 0L) as Long

    fun your_event_mask(segment: MemorySegment, value: Long) =
        your_event_mask_VH.set(segment, 0L, value)

    val do_not_propagate_mask_VH: VarHandle = layout.varHandle(groupElement("do_not_propagate_mask"))

    @Suppress("UNCHECKED_CAST")
    fun do_not_propagate_mask(segment: MemorySegment): Long =
        do_not_propagate_mask_VH.get(segment, 0L) as Long

    fun do_not_propagate_mask(segment: MemorySegment, value: Long) =
        do_not_propagate_mask_VH.set(segment, 0L, value)

    val override_redirect_VH: VarHandle = layout.varHandle(groupElement("override_redirect"))

    @Suppress("UNCHECKED_CAST")
    fun override_redirect(segment: MemorySegment): Int =
        override_redirect_VH.get(segment, 0L) as Int

    fun override_redirect(segment: MemorySegment, value: Int) =
        override_redirect_VH.set(segment, 0L, value)

    val padding_after_override_redirect_VH: VarHandle = layout.varHandle(groupElement("padding_after_override_redirect"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_override_redirect(segment: MemorySegment): Int =
        padding_after_override_redirect_VH.get(segment, 0L) as Int

    fun padding_after_override_redirect(segment: MemorySegment, value: Int) =
        padding_after_override_redirect_VH.set(segment, 0L, value)

    val screen_VH: VarHandle = layout.varHandle(groupElement("screen"))

    @Suppress("UNCHECKED_CAST")
    fun screen(segment: MemorySegment): MemorySegment =
        screen_VH.get(segment, 0L) as MemorySegment

    fun screen(segment: MemorySegment, value: MemorySegment) =
        screen_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXClientMessageEventStorage
 */
class KffiXClientMessageEventStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("type"),
            ValueLayout.JAVA_INT.withName("padding_after_type"),
            ValueLayout.JAVA_LONG.withName("serial"),
            ValueLayout.JAVA_INT.withName("send_event"),
            ValueLayout.JAVA_INT.withName("padding_after_send_event"),
            ValueLayout.ADDRESS.withName("display"),
            ValueLayout.JAVA_LONG.withName("window"),
            ValueLayout.JAVA_LONG.withName("message_type"),
            ValueLayout.JAVA_INT.withName("format"),
            ValueLayout.JAVA_INT.withName("padding_before_data"),
            ValueLayout.JAVA_LONG.withName("data_l0"),
            ValueLayout.JAVA_LONG.withName("data_l1"),
            ValueLayout.JAVA_LONG.withName("data_l2"),
            ValueLayout.JAVA_LONG.withName("data_l3"),
            ValueLayout.JAVA_LONG.withName("data_l4")
        ).withName("KffiXClientMessageEventStorage")

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

    val padding_after_type_VH: VarHandle = layout.varHandle(groupElement("padding_after_type"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_type(segment: MemorySegment): Int =
        padding_after_type_VH.get(segment, 0L) as Int

    fun padding_after_type(segment: MemorySegment, value: Int) =
        padding_after_type_VH.set(segment, 0L, value)

    val serial_VH: VarHandle = layout.varHandle(groupElement("serial"))

    @Suppress("UNCHECKED_CAST")
    fun serial(segment: MemorySegment): Long =
        serial_VH.get(segment, 0L) as Long

    fun serial(segment: MemorySegment, value: Long) =
        serial_VH.set(segment, 0L, value)

    val send_event_VH: VarHandle = layout.varHandle(groupElement("send_event"))

    @Suppress("UNCHECKED_CAST")
    fun send_event(segment: MemorySegment): Int =
        send_event_VH.get(segment, 0L) as Int

    fun send_event(segment: MemorySegment, value: Int) =
        send_event_VH.set(segment, 0L, value)

    val padding_after_send_event_VH: VarHandle = layout.varHandle(groupElement("padding_after_send_event"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_send_event(segment: MemorySegment): Int =
        padding_after_send_event_VH.get(segment, 0L) as Int

    fun padding_after_send_event(segment: MemorySegment, value: Int) =
        padding_after_send_event_VH.set(segment, 0L, value)

    val display_VH: VarHandle = layout.varHandle(groupElement("display"))

    @Suppress("UNCHECKED_CAST")
    fun display(segment: MemorySegment): MemorySegment =
        display_VH.get(segment, 0L) as MemorySegment

    fun display(segment: MemorySegment, value: MemorySegment) =
        display_VH.set(segment, 0L, value)

    val window_VH: VarHandle = layout.varHandle(groupElement("window"))

    @Suppress("UNCHECKED_CAST")
    fun window(segment: MemorySegment): Long =
        window_VH.get(segment, 0L) as Long

    fun window(segment: MemorySegment, value: Long) =
        window_VH.set(segment, 0L, value)

    val message_type_VH: VarHandle = layout.varHandle(groupElement("message_type"))

    @Suppress("UNCHECKED_CAST")
    fun message_type(segment: MemorySegment): Long =
        message_type_VH.get(segment, 0L) as Long

    fun message_type(segment: MemorySegment, value: Long) =
        message_type_VH.set(segment, 0L, value)

    val format_VH: VarHandle = layout.varHandle(groupElement("format"))

    @Suppress("UNCHECKED_CAST")
    fun format(segment: MemorySegment): Int =
        format_VH.get(segment, 0L) as Int

    fun format(segment: MemorySegment, value: Int) =
        format_VH.set(segment, 0L, value)

    val padding_before_data_VH: VarHandle = layout.varHandle(groupElement("padding_before_data"))

    @Suppress("UNCHECKED_CAST")
    fun padding_before_data(segment: MemorySegment): Int =
        padding_before_data_VH.get(segment, 0L) as Int

    fun padding_before_data(segment: MemorySegment, value: Int) =
        padding_before_data_VH.set(segment, 0L, value)

    val data_l0_VH: VarHandle = layout.varHandle(groupElement("data_l0"))

    @Suppress("UNCHECKED_CAST")
    fun data_l0(segment: MemorySegment): Long =
        data_l0_VH.get(segment, 0L) as Long

    fun data_l0(segment: MemorySegment, value: Long) =
        data_l0_VH.set(segment, 0L, value)

    val data_l1_VH: VarHandle = layout.varHandle(groupElement("data_l1"))

    @Suppress("UNCHECKED_CAST")
    fun data_l1(segment: MemorySegment): Long =
        data_l1_VH.get(segment, 0L) as Long

    fun data_l1(segment: MemorySegment, value: Long) =
        data_l1_VH.set(segment, 0L, value)

    val data_l2_VH: VarHandle = layout.varHandle(groupElement("data_l2"))

    @Suppress("UNCHECKED_CAST")
    fun data_l2(segment: MemorySegment): Long =
        data_l2_VH.get(segment, 0L) as Long

    fun data_l2(segment: MemorySegment, value: Long) =
        data_l2_VH.set(segment, 0L, value)

    val data_l3_VH: VarHandle = layout.varHandle(groupElement("data_l3"))

    @Suppress("UNCHECKED_CAST")
    fun data_l3(segment: MemorySegment): Long =
        data_l3_VH.get(segment, 0L) as Long

    fun data_l3(segment: MemorySegment, value: Long) =
        data_l3_VH.set(segment, 0L, value)

    val data_l4_VH: VarHandle = layout.varHandle(groupElement("data_l4"))

    @Suppress("UNCHECKED_CAST")
    fun data_l4(segment: MemorySegment): Long =
        data_l4_VH.get(segment, 0L) as Long

    fun data_l4(segment: MemorySegment, value: Long) =
        data_l4_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXSelectionEventStorage
 */
class KffiXSelectionEventStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("type"),
            ValueLayout.JAVA_INT.withName("padding_after_type"),
            ValueLayout.JAVA_LONG.withName("serial"),
            ValueLayout.JAVA_INT.withName("send_event"),
            ValueLayout.JAVA_INT.withName("padding_after_send_event"),
            ValueLayout.ADDRESS.withName("display"),
            ValueLayout.JAVA_LONG.withName("requestor"),
            ValueLayout.JAVA_LONG.withName("selection"),
            ValueLayout.JAVA_LONG.withName("target"),
            ValueLayout.JAVA_LONG.withName("property"),
            ValueLayout.JAVA_LONG.withName("time")
        ).withName("KffiXSelectionEventStorage")

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

    val padding_after_type_VH: VarHandle = layout.varHandle(groupElement("padding_after_type"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_type(segment: MemorySegment): Int =
        padding_after_type_VH.get(segment, 0L) as Int

    fun padding_after_type(segment: MemorySegment, value: Int) =
        padding_after_type_VH.set(segment, 0L, value)

    val serial_VH: VarHandle = layout.varHandle(groupElement("serial"))

    @Suppress("UNCHECKED_CAST")
    fun serial(segment: MemorySegment): Long =
        serial_VH.get(segment, 0L) as Long

    fun serial(segment: MemorySegment, value: Long) =
        serial_VH.set(segment, 0L, value)

    val send_event_VH: VarHandle = layout.varHandle(groupElement("send_event"))

    @Suppress("UNCHECKED_CAST")
    fun send_event(segment: MemorySegment): Int =
        send_event_VH.get(segment, 0L) as Int

    fun send_event(segment: MemorySegment, value: Int) =
        send_event_VH.set(segment, 0L, value)

    val padding_after_send_event_VH: VarHandle = layout.varHandle(groupElement("padding_after_send_event"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_send_event(segment: MemorySegment): Int =
        padding_after_send_event_VH.get(segment, 0L) as Int

    fun padding_after_send_event(segment: MemorySegment, value: Int) =
        padding_after_send_event_VH.set(segment, 0L, value)

    val display_VH: VarHandle = layout.varHandle(groupElement("display"))

    @Suppress("UNCHECKED_CAST")
    fun display(segment: MemorySegment): MemorySegment =
        display_VH.get(segment, 0L) as MemorySegment

    fun display(segment: MemorySegment, value: MemorySegment) =
        display_VH.set(segment, 0L, value)

    val requestor_VH: VarHandle = layout.varHandle(groupElement("requestor"))

    @Suppress("UNCHECKED_CAST")
    fun requestor(segment: MemorySegment): Long =
        requestor_VH.get(segment, 0L) as Long

    fun requestor(segment: MemorySegment, value: Long) =
        requestor_VH.set(segment, 0L, value)

    val selection_VH: VarHandle = layout.varHandle(groupElement("selection"))

    @Suppress("UNCHECKED_CAST")
    fun selection(segment: MemorySegment): Long =
        selection_VH.get(segment, 0L) as Long

    fun selection(segment: MemorySegment, value: Long) =
        selection_VH.set(segment, 0L, value)

    val target_VH: VarHandle = layout.varHandle(groupElement("target"))

    @Suppress("UNCHECKED_CAST")
    fun target(segment: MemorySegment): Long =
        target_VH.get(segment, 0L) as Long

    fun target(segment: MemorySegment, value: Long) =
        target_VH.set(segment, 0L, value)

    val property__VH: VarHandle = layout.varHandle(groupElement("property"))

    @Suppress("UNCHECKED_CAST")
    fun property_(segment: MemorySegment): Long =
        property__VH.get(segment, 0L) as Long

    fun property_(segment: MemorySegment, value: Long) =
        property__VH.set(segment, 0L, value)

    val time_VH: VarHandle = layout.varHandle(groupElement("time"))

    @Suppress("UNCHECKED_CAST")
    fun time(segment: MemorySegment): Long =
        time_VH.get(segment, 0L) as Long

    fun time(segment: MemorySegment, value: Long) =
        time_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXSetWindowAttributesStorage
 */
class KffiXSetWindowAttributesStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("background_pixmap"),
            ValueLayout.JAVA_LONG.withName("background_pixel"),
            ValueLayout.JAVA_LONG.withName("border_pixmap"),
            ValueLayout.JAVA_LONG.withName("border_pixel"),
            ValueLayout.JAVA_INT.withName("bit_gravity"),
            ValueLayout.JAVA_INT.withName("win_gravity"),
            ValueLayout.JAVA_INT.withName("backing_store"),
            ValueLayout.JAVA_INT.withName("padding_after_backing_store"),
            ValueLayout.JAVA_LONG.withName("backing_planes"),
            ValueLayout.JAVA_LONG.withName("backing_pixel"),
            ValueLayout.JAVA_INT.withName("save_under"),
            ValueLayout.JAVA_INT.withName("padding_after_save_under"),
            ValueLayout.JAVA_LONG.withName("event_mask"),
            ValueLayout.JAVA_LONG.withName("do_not_propagate_mask"),
            ValueLayout.JAVA_INT.withName("override_redirect"),
            ValueLayout.JAVA_INT.withName("padding_after_override_redirect"),
            ValueLayout.JAVA_LONG.withName("colormap"),
            ValueLayout.JAVA_LONG.withName("cursor")
        ).withName("KffiXSetWindowAttributesStorage")

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

    val background_pixmap_VH: VarHandle = layout.varHandle(groupElement("background_pixmap"))

    @Suppress("UNCHECKED_CAST")
    fun background_pixmap(segment: MemorySegment): Long =
        background_pixmap_VH.get(segment, 0L) as Long

    fun background_pixmap(segment: MemorySegment, value: Long) =
        background_pixmap_VH.set(segment, 0L, value)

    val background_pixel_VH: VarHandle = layout.varHandle(groupElement("background_pixel"))

    @Suppress("UNCHECKED_CAST")
    fun background_pixel(segment: MemorySegment): Long =
        background_pixel_VH.get(segment, 0L) as Long

    fun background_pixel(segment: MemorySegment, value: Long) =
        background_pixel_VH.set(segment, 0L, value)

    val border_pixmap_VH: VarHandle = layout.varHandle(groupElement("border_pixmap"))

    @Suppress("UNCHECKED_CAST")
    fun border_pixmap(segment: MemorySegment): Long =
        border_pixmap_VH.get(segment, 0L) as Long

    fun border_pixmap(segment: MemorySegment, value: Long) =
        border_pixmap_VH.set(segment, 0L, value)

    val border_pixel_VH: VarHandle = layout.varHandle(groupElement("border_pixel"))

    @Suppress("UNCHECKED_CAST")
    fun border_pixel(segment: MemorySegment): Long =
        border_pixel_VH.get(segment, 0L) as Long

    fun border_pixel(segment: MemorySegment, value: Long) =
        border_pixel_VH.set(segment, 0L, value)

    val bit_gravity_VH: VarHandle = layout.varHandle(groupElement("bit_gravity"))

    @Suppress("UNCHECKED_CAST")
    fun bit_gravity(segment: MemorySegment): Int =
        bit_gravity_VH.get(segment, 0L) as Int

    fun bit_gravity(segment: MemorySegment, value: Int) =
        bit_gravity_VH.set(segment, 0L, value)

    val win_gravity_VH: VarHandle = layout.varHandle(groupElement("win_gravity"))

    @Suppress("UNCHECKED_CAST")
    fun win_gravity(segment: MemorySegment): Int =
        win_gravity_VH.get(segment, 0L) as Int

    fun win_gravity(segment: MemorySegment, value: Int) =
        win_gravity_VH.set(segment, 0L, value)

    val backing_store_VH: VarHandle = layout.varHandle(groupElement("backing_store"))

    @Suppress("UNCHECKED_CAST")
    fun backing_store(segment: MemorySegment): Int =
        backing_store_VH.get(segment, 0L) as Int

    fun backing_store(segment: MemorySegment, value: Int) =
        backing_store_VH.set(segment, 0L, value)

    val padding_after_backing_store_VH: VarHandle = layout.varHandle(groupElement("padding_after_backing_store"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_backing_store(segment: MemorySegment): Int =
        padding_after_backing_store_VH.get(segment, 0L) as Int

    fun padding_after_backing_store(segment: MemorySegment, value: Int) =
        padding_after_backing_store_VH.set(segment, 0L, value)

    val backing_planes_VH: VarHandle = layout.varHandle(groupElement("backing_planes"))

    @Suppress("UNCHECKED_CAST")
    fun backing_planes(segment: MemorySegment): Long =
        backing_planes_VH.get(segment, 0L) as Long

    fun backing_planes(segment: MemorySegment, value: Long) =
        backing_planes_VH.set(segment, 0L, value)

    val backing_pixel_VH: VarHandle = layout.varHandle(groupElement("backing_pixel"))

    @Suppress("UNCHECKED_CAST")
    fun backing_pixel(segment: MemorySegment): Long =
        backing_pixel_VH.get(segment, 0L) as Long

    fun backing_pixel(segment: MemorySegment, value: Long) =
        backing_pixel_VH.set(segment, 0L, value)

    val save_under_VH: VarHandle = layout.varHandle(groupElement("save_under"))

    @Suppress("UNCHECKED_CAST")
    fun save_under(segment: MemorySegment): Int =
        save_under_VH.get(segment, 0L) as Int

    fun save_under(segment: MemorySegment, value: Int) =
        save_under_VH.set(segment, 0L, value)

    val padding_after_save_under_VH: VarHandle = layout.varHandle(groupElement("padding_after_save_under"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_save_under(segment: MemorySegment): Int =
        padding_after_save_under_VH.get(segment, 0L) as Int

    fun padding_after_save_under(segment: MemorySegment, value: Int) =
        padding_after_save_under_VH.set(segment, 0L, value)

    val event_mask_VH: VarHandle = layout.varHandle(groupElement("event_mask"))

    @Suppress("UNCHECKED_CAST")
    fun event_mask(segment: MemorySegment): Long =
        event_mask_VH.get(segment, 0L) as Long

    fun event_mask(segment: MemorySegment, value: Long) =
        event_mask_VH.set(segment, 0L, value)

    val do_not_propagate_mask_VH: VarHandle = layout.varHandle(groupElement("do_not_propagate_mask"))

    @Suppress("UNCHECKED_CAST")
    fun do_not_propagate_mask(segment: MemorySegment): Long =
        do_not_propagate_mask_VH.get(segment, 0L) as Long

    fun do_not_propagate_mask(segment: MemorySegment, value: Long) =
        do_not_propagate_mask_VH.set(segment, 0L, value)

    val override_redirect_VH: VarHandle = layout.varHandle(groupElement("override_redirect"))

    @Suppress("UNCHECKED_CAST")
    fun override_redirect(segment: MemorySegment): Int =
        override_redirect_VH.get(segment, 0L) as Int

    fun override_redirect(segment: MemorySegment, value: Int) =
        override_redirect_VH.set(segment, 0L, value)

    val padding_after_override_redirect_VH: VarHandle = layout.varHandle(groupElement("padding_after_override_redirect"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_override_redirect(segment: MemorySegment): Int =
        padding_after_override_redirect_VH.get(segment, 0L) as Int

    fun padding_after_override_redirect(segment: MemorySegment, value: Int) =
        padding_after_override_redirect_VH.set(segment, 0L, value)

    val colormap_VH: VarHandle = layout.varHandle(groupElement("colormap"))

    @Suppress("UNCHECKED_CAST")
    fun colormap(segment: MemorySegment): Long =
        colormap_VH.get(segment, 0L) as Long

    fun colormap(segment: MemorySegment, value: Long) =
        colormap_VH.set(segment, 0L, value)

    val cursor_VH: VarHandle = layout.varHandle(groupElement("cursor"))

    @Suppress("UNCHECKED_CAST")
    fun cursor(segment: MemorySegment): Long =
        cursor_VH.get(segment, 0L) as Long

    fun cursor(segment: MemorySegment, value: Long) =
        cursor_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXIMCallbackStorage
 */
class KffiXIMCallbackStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withName("client_data"),
            ValueLayout.ADDRESS.withName("callback")
        ).withName("KffiXIMCallbackStorage")

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

    val client_data_VH: VarHandle = layout.varHandle(groupElement("client_data"))

    @Suppress("UNCHECKED_CAST")
    fun client_data(segment: MemorySegment): MemorySegment =
        client_data_VH.get(segment, 0L) as MemorySegment

    fun client_data(segment: MemorySegment, value: MemorySegment) =
        client_data_VH.set(segment, 0L, value)

    val callback_VH: VarHandle = layout.varHandle(groupElement("callback"))

    @Suppress("UNCHECKED_CAST")
    fun callback(segment: MemorySegment): MemorySegment =
        callback_VH.get(segment, 0L) as MemorySegment

    fun callback(segment: MemorySegment, value: MemorySegment) =
        callback_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXIMTextStorage
 */
class KffiXIMTextStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withName("length"),
            ValueLayout.JAVA_BYTE.withName("padding_after_length_0"),
            ValueLayout.JAVA_BYTE.withName("padding_after_length_1"),
            ValueLayout.JAVA_BYTE.withName("padding_after_length_2"),
            ValueLayout.JAVA_BYTE.withName("padding_after_length_3"),
            ValueLayout.JAVA_BYTE.withName("padding_after_length_4"),
            ValueLayout.JAVA_BYTE.withName("padding_after_length_5"),
            ValueLayout.ADDRESS.withName("feedback"),
            ValueLayout.JAVA_INT.withName("encoding_is_wchar"),
            ValueLayout.JAVA_INT.withName("padding_before_string"),
            ValueLayout.ADDRESS.withName("string_ptr")
        ).withName("KffiXIMTextStorage")

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

    val length_VH: VarHandle = layout.varHandle(groupElement("length"))

    @Suppress("UNCHECKED_CAST")
    fun length(segment: MemorySegment): Short =
        length_VH.get(segment, 0L) as Short

    fun length(segment: MemorySegment, value: Short) =
        length_VH.set(segment, 0L, value)

    val padding_after_length_0_VH: VarHandle = layout.varHandle(groupElement("padding_after_length_0"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_length_0(segment: MemorySegment): Byte =
        padding_after_length_0_VH.get(segment, 0L) as Byte

    fun padding_after_length_0(segment: MemorySegment, value: Byte) =
        padding_after_length_0_VH.set(segment, 0L, value)

    val padding_after_length_1_VH: VarHandle = layout.varHandle(groupElement("padding_after_length_1"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_length_1(segment: MemorySegment): Byte =
        padding_after_length_1_VH.get(segment, 0L) as Byte

    fun padding_after_length_1(segment: MemorySegment, value: Byte) =
        padding_after_length_1_VH.set(segment, 0L, value)

    val padding_after_length_2_VH: VarHandle = layout.varHandle(groupElement("padding_after_length_2"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_length_2(segment: MemorySegment): Byte =
        padding_after_length_2_VH.get(segment, 0L) as Byte

    fun padding_after_length_2(segment: MemorySegment, value: Byte) =
        padding_after_length_2_VH.set(segment, 0L, value)

    val padding_after_length_3_VH: VarHandle = layout.varHandle(groupElement("padding_after_length_3"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_length_3(segment: MemorySegment): Byte =
        padding_after_length_3_VH.get(segment, 0L) as Byte

    fun padding_after_length_3(segment: MemorySegment, value: Byte) =
        padding_after_length_3_VH.set(segment, 0L, value)

    val padding_after_length_4_VH: VarHandle = layout.varHandle(groupElement("padding_after_length_4"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_length_4(segment: MemorySegment): Byte =
        padding_after_length_4_VH.get(segment, 0L) as Byte

    fun padding_after_length_4(segment: MemorySegment, value: Byte) =
        padding_after_length_4_VH.set(segment, 0L, value)

    val padding_after_length_5_VH: VarHandle = layout.varHandle(groupElement("padding_after_length_5"))

    @Suppress("UNCHECKED_CAST")
    fun padding_after_length_5(segment: MemorySegment): Byte =
        padding_after_length_5_VH.get(segment, 0L) as Byte

    fun padding_after_length_5(segment: MemorySegment, value: Byte) =
        padding_after_length_5_VH.set(segment, 0L, value)

    val feedback_VH: VarHandle = layout.varHandle(groupElement("feedback"))

    @Suppress("UNCHECKED_CAST")
    fun feedback(segment: MemorySegment): MemorySegment =
        feedback_VH.get(segment, 0L) as MemorySegment

    fun feedback(segment: MemorySegment, value: MemorySegment) =
        feedback_VH.set(segment, 0L, value)

    val encoding_is_wchar_VH: VarHandle = layout.varHandle(groupElement("encoding_is_wchar"))

    @Suppress("UNCHECKED_CAST")
    fun encoding_is_wchar(segment: MemorySegment): Int =
        encoding_is_wchar_VH.get(segment, 0L) as Int

    fun encoding_is_wchar(segment: MemorySegment, value: Int) =
        encoding_is_wchar_VH.set(segment, 0L, value)

    val padding_before_string_VH: VarHandle = layout.varHandle(groupElement("padding_before_string"))

    @Suppress("UNCHECKED_CAST")
    fun padding_before_string(segment: MemorySegment): Int =
        padding_before_string_VH.get(segment, 0L) as Int

    fun padding_before_string(segment: MemorySegment, value: Int) =
        padding_before_string_VH.set(segment, 0L, value)

    val string_ptr_VH: VarHandle = layout.varHandle(groupElement("string_ptr"))

    @Suppress("UNCHECKED_CAST")
    fun string_ptr(segment: MemorySegment): MemorySegment =
        string_ptr_VH.get(segment, 0L) as MemorySegment

    fun string_ptr(segment: MemorySegment, value: MemorySegment) =
        string_ptr_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXIMPreeditStateNotifyCallbackStructStorage
 */
class KffiXIMPreeditStateNotifyCallbackStructStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("state")
        ).withName("KffiXIMPreeditStateNotifyCallbackStructStorage")

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

    val state_VH: VarHandle = layout.varHandle(groupElement("state"))

    @Suppress("UNCHECKED_CAST")
    fun state(segment: MemorySegment): Long =
        state_VH.get(segment, 0L) as Long

    fun state(segment: MemorySegment, value: Long) =
        state_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT KffiXIMPreeditDrawCallbackStructStorage
 */
class KffiXIMPreeditDrawCallbackStructStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("caret"),
            ValueLayout.JAVA_INT.withName("chg_first"),
            ValueLayout.JAVA_INT.withName("chg_length"),
            ValueLayout.JAVA_INT.withName("padding_before_text"),
            ValueLayout.ADDRESS.withName("text")
        ).withName("KffiXIMPreeditDrawCallbackStructStorage")

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

    val caret_VH: VarHandle = layout.varHandle(groupElement("caret"))

    @Suppress("UNCHECKED_CAST")
    fun caret(segment: MemorySegment): Int =
        caret_VH.get(segment, 0L) as Int

    fun caret(segment: MemorySegment, value: Int) =
        caret_VH.set(segment, 0L, value)

    val chg_first_VH: VarHandle = layout.varHandle(groupElement("chg_first"))

    @Suppress("UNCHECKED_CAST")
    fun chg_first(segment: MemorySegment): Int =
        chg_first_VH.get(segment, 0L) as Int

    fun chg_first(segment: MemorySegment, value: Int) =
        chg_first_VH.set(segment, 0L, value)

    val chg_length_VH: VarHandle = layout.varHandle(groupElement("chg_length"))

    @Suppress("UNCHECKED_CAST")
    fun chg_length(segment: MemorySegment): Int =
        chg_length_VH.get(segment, 0L) as Int

    fun chg_length(segment: MemorySegment, value: Int) =
        chg_length_VH.set(segment, 0L, value)

    val padding_before_text_VH: VarHandle = layout.varHandle(groupElement("padding_before_text"))

    @Suppress("UNCHECKED_CAST")
    fun padding_before_text(segment: MemorySegment): Int =
        padding_before_text_VH.get(segment, 0L) as Int

    fun padding_before_text(segment: MemorySegment, value: Int) =
        padding_before_text_VH.set(segment, 0L, value)

    val text_VH: VarHandle = layout.varHandle(groupElement("text"))

    @Suppress("UNCHECKED_CAST")
    fun text(segment: MemorySegment): MemorySegment =
        text_VH.get(segment, 0L) as MemorySegment

    fun text(segment: MemorySegment, value: MemorySegment) =
        text_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : #define AnyPropertyType 0
 */
fun AnyPropertyType(): Long = 0

/**
 * {@snippet lang=c : #define KeyPressMask 1
 */
fun KeyPressMask(): Long = 1

/**
 * {@snippet lang=c : #define KeyReleaseMask 2
 */
fun KeyReleaseMask(): Long = 2

/**
 * {@snippet lang=c : #define ButtonPressMask 4
 */
fun ButtonPressMask(): Long = 4

/**
 * {@snippet lang=c : #define ButtonReleaseMask 8
 */
fun ButtonReleaseMask(): Long = 8

/**
 * {@snippet lang=c : #define EnterWindowMask 16
 */
fun EnterWindowMask(): Long = 16

/**
 * {@snippet lang=c : #define LeaveWindowMask 32
 */
fun LeaveWindowMask(): Long = 32

/**
 * {@snippet lang=c : #define PointerMotionMask 64
 */
fun PointerMotionMask(): Long = 64

/**
 * {@snippet lang=c : #define ExposureMask 32768
 */
fun ExposureMask(): Long = 32768

/**
 * {@snippet lang=c : #define VisibilityChangeMask 65536
 */
fun VisibilityChangeMask(): Long = 65536

/**
 * {@snippet lang=c : #define StructureNotifyMask 131072
 */
fun StructureNotifyMask(): Long = 131072

/**
 * {@snippet lang=c : #define SubstructureNotifyMask 524288
 */
fun SubstructureNotifyMask(): Long = 524288

/**
 * {@snippet lang=c : #define SubstructureRedirectMask 1048576
 */
fun SubstructureRedirectMask(): Long = 1048576

/**
 * {@snippet lang=c : #define FocusChangeMask 2097152
 */
fun FocusChangeMask(): Long = 2097152

/**
 * {@snippet lang=c : #define CWOverrideRedirect 512
 */
fun CWOverrideRedirect(): Long = 512

/**
 * {@snippet lang=c : #define XIMPreeditArea 1
 */
fun XIMPreeditArea(): Long = 1

/**
 * {@snippet lang=c : #define XIMPreeditCallbacks 2
 */
fun XIMPreeditCallbacks(): Long = 2

/**
 * {@snippet lang=c : #define XIMPreeditPosition 4
 */
fun XIMPreeditPosition(): Long = 4

/**
 * {@snippet lang=c : #define XIMPreeditNothing 8
 */
fun XIMPreeditNothing(): Long = 8

/**
 * {@snippet lang=c : #define XIMPreeditNone 16
 */
fun XIMPreeditNone(): Long = 16

/**
 * {@snippet lang=c : #define XIMStatusArea 256
 */
fun XIMStatusArea(): Long = 256

/**
 * {@snippet lang=c : #define XIMStatusCallbacks 512
 */
fun XIMStatusCallbacks(): Long = 512

/**
 * {@snippet lang=c : #define XIMStatusNothing 1024
 */
fun XIMStatusNothing(): Long = 1024

/**
 * {@snippet lang=c : #define XIMStatusNone 2048
 */
fun XIMStatusNone(): Long = 2048

/**
 * {@snippet lang=c : #define XIMReverse 1
 */
fun XIMReverse(): Long = 1

/**
 * {@snippet lang=c : #define XIMUnderline 2
 */
fun XIMUnderline(): Long = 2

/**
 * {@snippet lang=c : #define XIMHighlight 4
 */
fun XIMHighlight(): Long = 4

/**
 * {@snippet lang=c : #define XIMPrimary 32
 */
fun XIMPrimary(): Long = 32

/**
 * {@snippet lang=c : #define XIMSecondary 64
 */
fun XIMSecondary(): Long = 64

/**
 * {@snippet lang=c : #define XIMTertiary 128
 */
fun XIMTertiary(): Long = 128

/**
 * {@snippet lang=c : #define XIMVisibleToForward 256
 */
fun XIMVisibleToForward(): Long = 256

/**
 * {@snippet lang=c : #define XIMVisibleToBackword 512
 */
fun XIMVisibleToBackword(): Long = 512

/**
 * {@snippet lang=c : #define XIMVisibleToCenter 1024
 */
fun XIMVisibleToCenter(): Long = 1024

/**
 * {@snippet lang=c : #define XIMPreeditUnKnown 0
 */
fun XIMPreeditUnKnown(): Long = 0

/**
 * {@snippet lang=c : #define XIMPreeditEnable 1
 */
fun XIMPreeditEnable(): Long = 1

/**
 * {@snippet lang=c : #define XIMPreeditDisable 2
 */
fun XIMPreeditDisable(): Long = 2

/**
 * {@snippet lang=c : #define XIMInitialState 1
 */
fun XIMInitialState(): Long = 1

/**
 * {@snippet lang=c : #define XIMPreserveState 2
 */
fun XIMPreserveState(): Long = 2

/**
 * {@snippet lang=c : #define XIMStringConversionLeftEdge 1
 */
fun XIMStringConversionLeftEdge(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionRightEdge 2
 */
fun XIMStringConversionRightEdge(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionTopEdge 4
 */
fun XIMStringConversionTopEdge(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionBottomEdge 8
 */
fun XIMStringConversionBottomEdge(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionConcealed 16
 */
fun XIMStringConversionConcealed(): Int = (16).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionWrapped 32
 */
fun XIMStringConversionWrapped(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionBuffer 1
 */
fun XIMStringConversionBuffer(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionLine 2
 */
fun XIMStringConversionLine(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionWord 3
 */
fun XIMStringConversionWord(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionChar 4
 */
fun XIMStringConversionChar(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionSubstitution 1
 */
fun XIMStringConversionSubstitution(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define XIMStringConversionRetrieval 2
 */
fun XIMStringConversionRetrieval(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define XIMHotKeyStateON 1
 */
fun XIMHotKeyStateON(): Long = 1

/**
 * {@snippet lang=c : #define XIMHotKeyStateOFF 2
 */
fun XIMHotKeyStateOFF(): Long = 2
