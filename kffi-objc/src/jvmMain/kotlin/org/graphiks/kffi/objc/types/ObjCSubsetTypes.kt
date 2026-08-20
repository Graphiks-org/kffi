package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

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
 * {@snippet lang=c : typedef LongLong __int64_t;}
 */
typealias _int64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong __uint64_t;}
 */
typealias _uint64_t = Long

/**
 * {@snippet lang=c : typedef Long __darwin_intptr_t;}
 */
typealias _darwin_intptr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_natural_t;}
 */
typealias _darwin_natural_t = Int

/**
 * {@snippet lang=c : typedef Int __darwin_ct_rune_t;}
 */
typealias _darwin_ct_rune_t = Int

/**
 * {@snippet lang=c : typedef Long __darwin_ptrdiff_t;}
 */
typealias _darwin_ptrdiff_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __darwin_size_t;}
 */
typealias _darwin_size_t = Long

/**
 * {@snippet lang=c : typedef Int __darwin_wchar_t;}
 */
typealias _darwin_wchar_t = Int

/**
 * {@snippet lang=c : typedef Int __darwin_rune_t;}
 */
typealias _darwin_rune_t = Int

/**
 * {@snippet lang=c : typedef Int __darwin_wint_t;}
 */
typealias _darwin_wint_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __darwin_clock_t;}
 */
typealias _darwin_clock_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_socklen_t;}
 */
typealias _darwin_socklen_t = Int

/**
 * {@snippet lang=c : typedef Long __darwin_ssize_t;}
 */
typealias _darwin_ssize_t = Long

/**
 * {@snippet lang=c : typedef Long __darwin_time_t;}
 */
typealias _darwin_time_t = Long

/**
 * {@snippet lang=c : typedef LongLong __darwin_blkcnt_t;}
 */
typealias _darwin_blkcnt_t = Long

/**
 * {@snippet lang=c : typedef Int __darwin_blksize_t;}
 */
typealias _darwin_blksize_t = Int

/**
 * {@snippet lang=c : typedef Int __darwin_dev_t;}
 */
typealias _darwin_dev_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_fsblkcnt_t;}
 */
typealias _darwin_fsblkcnt_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_fsfilcnt_t;}
 */
typealias _darwin_fsfilcnt_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_gid_t;}
 */
typealias _darwin_gid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_id_t;}
 */
typealias _darwin_id_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong __darwin_ino64_t;}
 */
typealias _darwin_ino64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong __darwin_ino_t;}
 */
typealias _darwin_ino_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_mach_port_name_t;}
 */
typealias _darwin_mach_port_name_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_mach_port_t;}
 */
typealias _darwin_mach_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __darwin_mode_t;}
 */
typealias _darwin_mode_t = Short

/**
 * {@snippet lang=c : typedef LongLong __darwin_off_t;}
 */
typealias _darwin_off_t = Long

/**
 * {@snippet lang=c : typedef Int __darwin_pid_t;}
 */
typealias _darwin_pid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_sigset_t;}
 */
typealias _darwin_sigset_t = Int

/**
 * {@snippet lang=c : typedef Int __darwin_suseconds_t;}
 */
typealias _darwin_suseconds_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_uid_t;}
 */
typealias _darwin_uid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_useconds_t;}
 */
typealias _darwin_useconds_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __darwin_pthread_key_t;}
 */
typealias _darwin_pthread_key_t = Long

/**
 * {@snippet lang=c : typedef Int __darwin_nl_item;}
 */
typealias _darwin_nl_item = Int

/**
 * {@snippet lang=c : typedef Int __darwin_wctrans_t;}
 */
typealias _darwin_wctrans_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __darwin_wctype_t;}
 */
typealias _darwin_wctype_t = Int

/**
 * {@snippet lang=c : typedef Int pid_t;}
 */
typealias pid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int id_t;}
 */
typealias id_t = Int

/**
 * {@snippet lang=c : typedef Int sig_atomic_t;}
 */
typealias sig_atomic_t = Int

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
 * {@snippet lang=c : typedef LongLong int64_t;}
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
 * {@snippet lang=c : typedef UNSIGNED = LongLong u_int64_t;}
 */
typealias u_int64_t = Long

/**
 * {@snippet lang=c : typedef LongLong register_t;}
 */
typealias register_t = Long

/**
 * {@snippet lang=c : typedef Long intptr_t;}
 */
typealias intptr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uintptr_t;}
 */
typealias uintptr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong user_addr_t;}
 */
typealias user_addr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong user_size_t;}
 */
typealias user_size_t = Long

/**
 * {@snippet lang=c : typedef LongLong user_ssize_t;}
 */
typealias user_ssize_t = Long

/**
 * {@snippet lang=c : typedef LongLong user_long_t;}
 */
typealias user_long_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong user_ulong_t;}
 */
typealias user_ulong_t = Long

/**
 * {@snippet lang=c : typedef LongLong user_time_t;}
 */
typealias user_time_t = Long

/**
 * {@snippet lang=c : typedef LongLong user_off_t;}
 */
typealias user_off_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong syscall_arg_t;}
 */
typealias syscall_arg_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int sigset_t;}
 */
typealias sigset_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long size_t;}
 */
typealias size_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uid_t;}
 */
typealias uid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint8_t;}
 */
typealias uint8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint16_t;}
 */
typealias uint16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint32_t;}
 */
typealias uint32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong uint64_t;}
 */
typealias uint64_t = Long

/**
 * {@snippet lang=c : typedef SIGNED = Char int_least8_t;}
 */
typealias int_least8_t = Byte

/**
 * {@snippet lang=c : typedef Short int_least16_t;}
 */
typealias int_least16_t = Short

/**
 * {@snippet lang=c : typedef Int int_least32_t;}
 */
typealias int_least32_t = Int

/**
 * {@snippet lang=c : typedef LongLong int_least64_t;}
 */
typealias int_least64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint_least8_t;}
 */
typealias uint_least8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint_least16_t;}
 */
typealias uint_least16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint_least32_t;}
 */
typealias uint_least32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong uint_least64_t;}
 */
typealias uint_least64_t = Long

/**
 * {@snippet lang=c : typedef SIGNED = Char int_fast8_t;}
 */
typealias int_fast8_t = Byte

/**
 * {@snippet lang=c : typedef Short int_fast16_t;}
 */
typealias int_fast16_t = Short

/**
 * {@snippet lang=c : typedef Int int_fast32_t;}
 */
typealias int_fast32_t = Int

/**
 * {@snippet lang=c : typedef LongLong int_fast64_t;}
 */
typealias int_fast64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint_fast8_t;}
 */
typealias uint_fast8_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint_fast16_t;}
 */
typealias uint_fast16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint_fast32_t;}
 */
typealias uint_fast32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong uint_fast64_t;}
 */
typealias uint_fast64_t = Long

/**
 * {@snippet lang=c : typedef Long intmax_t;}
 */
typealias intmax_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long uintmax_t;}
 */
typealias uintmax_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong rlim_t;}
 */
typealias rlim_t = Long

/**
 * {@snippet lang=c : typedef Int ct_rune_t;}
 */
typealias ct_rune_t = Int

/**
 * {@snippet lang=c : typedef Int rune_t;}
 */
typealias rune_t = Int

/**
 * {@snippet lang=c : typedef Int wchar_t;}
 */
typealias wchar_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong malloc_type_id_t;}
 */
typealias malloc_type_id_t = Long

/**
 * {@snippet lang=c : typedef Int dev_t;}
 */
typealias dev_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short mode_t;}
 */
typealias mode_t = Short

/**
 * {@snippet lang=c : typedef Long ptrdiff_t;}
 */
typealias ptrdiff_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long rsize_t;}
 */
typealias rsize_t = Long

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
 * {@snippet lang=c : typedef UNSIGNED = Short ushort;}
 */
typealias ushort = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint;}
 */
typealias uint = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong u_quad_t;}
 */
typealias u_quad_t = Long

/**
 * {@snippet lang=c : typedef LongLong quad_t;}
 */
typealias quad_t = Long

/**
 * {@snippet lang=c : typedef Int daddr_t;}
 */
typealias daddr_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int fixpt_t;}
 */
typealias fixpt_t = Int

/**
 * {@snippet lang=c : typedef LongLong blkcnt_t;}
 */
typealias blkcnt_t = Long

/**
 * {@snippet lang=c : typedef Int blksize_t;}
 */
typealias blksize_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int gid_t;}
 */
typealias gid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int in_addr_t;}
 */
typealias in_addr_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short in_port_t;}
 */
typealias in_port_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong ino_t;}
 */
typealias ino_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong ino64_t;}
 */
typealias ino64_t = Long

/**
 * {@snippet lang=c : typedef Int key_t;}
 */
typealias key_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short nlink_t;}
 */
typealias nlink_t = Short

/**
 * {@snippet lang=c : typedef LongLong off_t;}
 */
typealias off_t = Long

/**
 * {@snippet lang=c : typedef Int segsz_t;}
 */
typealias segsz_t = Int

/**
 * {@snippet lang=c : typedef Int swblk_t;}
 */
typealias swblk_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long clock_t;}
 */
typealias clock_t = Long

/**
 * {@snippet lang=c : typedef Long ssize_t;}
 */
typealias ssize_t = Long

/**
 * {@snippet lang=c : typedef Long time_t;}
 */
typealias time_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int useconds_t;}
 */
typealias useconds_t = Int

/**
 * {@snippet lang=c : typedef Int suseconds_t;}
 */
typealias suseconds_t = Int

/**
 * {@snippet lang=c : typedef Int errno_t;}
 */
typealias errno_t = Int

/**
 * {@snippet lang=c : typedef Int fd_mask;}
 */
typealias fd_mask = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long pthread_key_t;}
 */
typealias pthread_key_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int fsblkcnt_t;}
 */
typealias fsblkcnt_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int fsfilcnt_t;}
 */
typealias fsfilcnt_t = Int

/**
 * {@snippet lang=c : typedef Bool BOOL;}
 */
typealias BOOL = Boolean

/**
 * {@snippet lang=c : typedef Long NSInteger;}
 */
typealias NSInteger = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NSUInteger;}
 */
typealias NSUInteger = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ptrauth_extra_data_t;}
 */
typealias ptrauth_extra_data_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ptrauth_generic_signature_t;}
 */
typealias ptrauth_generic_signature_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Char UInt8;}
 */
typealias UInt8 = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char SInt8;}
 */
typealias SInt8 = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short UInt16;}
 */
typealias UInt16 = Short

/**
 * {@snippet lang=c : typedef Short SInt16;}
 */
typealias SInt16 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UInt32;}
 */
typealias UInt32 = Int

/**
 * {@snippet lang=c : typedef Int SInt32;}
 */
typealias SInt32 = Int

/**
 * {@snippet lang=c : typedef LongLong SInt64;}
 */
typealias SInt64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong UInt64;}
 */
typealias UInt64 = Long

/**
 * {@snippet lang=c : typedef Int Fixed;}
 */
typealias Fixed = Int

/**
 * {@snippet lang=c : typedef Int Fract;}
 */
typealias Fract = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UnsignedFixed;}
 */
typealias UnsignedFixed = Int

/**
 * {@snippet lang=c : typedef Short ShortFixed;}
 */
typealias ShortFixed = Short

/**
 * {@snippet lang=c : typedef Float Float32;}
 */
typealias Float32 = Float

/**
 * {@snippet lang=c : typedef Double Float64;}
 */
typealias Float64 = Double

/**
 * {@snippet lang=c : typedef Long Size;}
 */
typealias Size = Long

/**
 * {@snippet lang=c : typedef Short OSErr;}
 */
typealias OSErr = Short

/**
 * {@snippet lang=c : typedef Int OSStatus;}
 */
typealias OSStatus = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ByteCount;}
 */
typealias ByteCount = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ByteOffset;}
 */
typealias ByteOffset = Long

/**
 * {@snippet lang=c : typedef Int Duration;}
 */
typealias Duration = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int OptionBits;}
 */
typealias OptionBits = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ItemCount;}
 */
typealias ItemCount = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PBVersion;}
 */
typealias PBVersion = Int

/**
 * {@snippet lang=c : typedef Short ScriptCode;}
 */
typealias ScriptCode = Short

/**
 * {@snippet lang=c : typedef Short LangCode;}
 */
typealias LangCode = Short

/**
 * {@snippet lang=c : typedef Short RegionCode;}
 */
typealias RegionCode = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FourCharCode;}
 */
typealias FourCharCode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int OSType;}
 */
typealias OSType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ResType;}
 */
typealias ResType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char Boolean;}
 */
typealias Boolean_ = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UnicodeScalarValue;}
 */
typealias UnicodeScalarValue = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UTF32Char;}
 */
typealias UTF32Char = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short UniChar;}
 */
typealias UniChar = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short UTF16Char;}
 */
typealias UTF16Char = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char UTF8Char;}
 */
typealias UTF8Char = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Long UniCharCount;}
 */
typealias UniCharCount = Long

/**
 * {@snippet lang=c : typedef Short CharParameter;}
 */
typealias CharParameter = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char Style;}
 */
typealias Style = Byte

/**
 * {@snippet lang=c : typedef Short StyleParameter;}
 */
typealias StyleParameter = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char StyleField;}
 */
typealias StyleField = Byte

/**
 * {@snippet lang=c : typedef Int TimeValue;}
 */
typealias TimeValue = Int

/**
 * {@snippet lang=c : typedef Int TimeScale;}
 */
typealias TimeScale = Int

/**
 * {@snippet lang=c : typedef LongLong TimeValue64;}
 */
typealias TimeValue64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Char Byte;}
 */
typealias Byte_ = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char SignedByte;}
 */
typealias SignedByte = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char VHSelect;}
 */
typealias VHSelect = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong CFAllocatorTypeID;}
 */
typealias CFAllocatorTypeID = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CFTypeID;}
 */
typealias CFTypeID = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CFOptionFlags;}
 */
typealias CFOptionFlags = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CFHashCode;}
 */
typealias CFHashCode = Long

/**
 * {@snippet lang=c : typedef Long CFIndex;}
 */
typealias CFIndex = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Short unichar;}
 */
typealias unichar = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NSStringEncoding;}
 */
typealias NSStringEncoding = Long

/**
 * {@snippet lang=c : typedef Int wint_t;}
 */
typealias wint_t = Int

/**
 * {@snippet lang=c : typedef Float float_t;}
 */
typealias float_t = Float

/**
 * {@snippet lang=c : typedef Double double_t;}
 */
typealias double_t = Double

/**
 * {@snippet lang=c : typedef LongLong fpos_t;}
 */
typealias fpos_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CFBit;}
 */
typealias CFBit = Int

/**
 * {@snippet lang=c : typedef Long CFByteOrder;}
 */
typealias CFByteOrder = Long

/**
 * {@snippet lang=c : typedef Double CFTimeInterval;}
 */
typealias CFTimeInterval = Double

/**
 * {@snippet lang=c : typedef Double CFAbsoluteTime;}
 */
typealias CFAbsoluteTime = Double

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CFStringEncoding;}
 */
typealias CFStringEncoding = Int

/**
 * {@snippet lang=c : typedef Double CGFloat;}
 */
typealias CGFloat = Double

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CFURLBookmarkFileCreationOptions;}
 */
typealias CFURLBookmarkFileCreationOptions = Long

/**
 * {@snippet lang=c : typedef Int boolean_t;}
 */
typealias boolean_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int natural_t;}
 */
typealias natural_t = Int

/**
 * {@snippet lang=c : typedef Int integer_t;}
 */
typealias integer_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long vm_offset_t;}
 */
typealias vm_offset_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long vm_size_t;}
 */
typealias vm_size_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong mach_vm_address_t;}
 */
typealias mach_vm_address_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong mach_vm_offset_t;}
 */
typealias mach_vm_offset_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong mach_vm_size_t;}
 */
typealias mach_vm_size_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong vm_map_offset_t;}
 */
typealias vm_map_offset_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong vm_map_address_t;}
 */
typealias vm_map_address_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong vm_map_size_t;}
 */
typealias vm_map_size_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm32_offset_t;}
 */
typealias vm32_offset_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm32_address_t;}
 */
typealias vm32_address_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm32_size_t;}
 */
typealias vm32_size_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long mach_port_context_t;}
 */
typealias mach_port_context_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_name_t;}
 */
typealias mach_port_name_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_t;}
 */
typealias mach_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_right_t;}
 */
typealias mach_port_right_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_type_t;}
 */
typealias mach_port_type_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_urefs_t;}
 */
typealias mach_port_urefs_t = Int

/**
 * {@snippet lang=c : typedef Int mach_port_delta_t;}
 */
typealias mach_port_delta_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_seqno_t;}
 */
typealias mach_port_seqno_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_mscount_t;}
 */
typealias mach_port_mscount_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_msgcount_t;}
 */
typealias mach_port_msgcount_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_rights_t;}
 */
typealias mach_port_rights_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_port_srights_t;}
 */
typealias mach_port_srights_t = Int

/**
 * {@snippet lang=c : typedef Int mach_port_flavor_t;}
 */
typealias mach_port_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int CFSocketNativeHandle;}
 */
typealias CFSocketNativeHandle = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int os_workgroup_index;}
 */
typealias os_workgroup_index = Int

/**
 * {@snippet lang=c : typedef Int alarm_type_t;}
 */
typealias alarm_type_t = Int

/**
 * {@snippet lang=c : typedef Int sleep_type_t;}
 */
typealias sleep_type_t = Int

/**
 * {@snippet lang=c : typedef Int clock_id_t;}
 */
typealias clock_id_t = Int

/**
 * {@snippet lang=c : typedef Int clock_flavor_t;}
 */
typealias clock_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int clock_res_t;}
 */
typealias clock_res_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong dispatch_time_t;}
 */
typealias dispatch_time_t = Long

/**
 * {@snippet lang=c : typedef Long dispatch_queue_priority_t;}
 */
typealias dispatch_queue_priority_t = Long

/**
 * {@snippet lang=c : typedef Int kern_return_t;}
 */
typealias kern_return_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_timeout_t;}
 */
typealias mach_msg_timeout_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_bits_t;}
 */
typealias mach_msg_bits_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_size_t;}
 */
typealias mach_msg_size_t = Int

/**
 * {@snippet lang=c : typedef Int mach_msg_id_t;}
 */
typealias mach_msg_id_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_priority_t;}
 */
typealias mach_msg_priority_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_type_name_t;}
 */
typealias mach_msg_type_name_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_copy_options_t;}
 */
typealias mach_msg_copy_options_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_guard_flags_t;}
 */
typealias mach_msg_guard_flags_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_descriptor_type_t;}
 */
typealias mach_msg_descriptor_type_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_trailer_type_t;}
 */
typealias mach_msg_trailer_type_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_trailer_size_t;}
 */
typealias mach_msg_trailer_size_t = Int

/**
 * {@snippet lang=c : typedef Int mach_msg_filter_id;}
 */
typealias mach_msg_filter_id = Int

/**
 * {@snippet lang=c : typedef Int mach_msg_options_t;}
 */
typealias mach_msg_options_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_type_size_t;}
 */
typealias mach_msg_type_size_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_msg_type_number_t;}
 */
typealias mach_msg_type_number_t = Int

/**
 * {@snippet lang=c : typedef Int mach_msg_option_t;}
 */
typealias mach_msg_option_t = Int

/**
 * {@snippet lang=c : typedef Int mach_msg_return_t;}
 */
typealias mach_msg_return_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_source_mach_send_flags_t;}
 */
typealias dispatch_source_mach_send_flags_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_source_mach_recv_flags_t;}
 */
typealias dispatch_source_mach_recv_flags_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_source_memorypressure_flags_t;}
 */
typealias dispatch_source_memorypressure_flags_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_source_proc_flags_t;}
 */
typealias dispatch_source_proc_flags_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_source_vnode_flags_t;}
 */
typealias dispatch_source_vnode_flags_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_source_timer_flags_t;}
 */
typealias dispatch_source_timer_flags_t = Long

/**
 * {@snippet lang=c : typedef Long dispatch_once_t;}
 */
typealias dispatch_once_t = Long

/**
 * {@snippet lang=c : typedef Int dispatch_fd_t;}
 */
typealias dispatch_fd_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_io_type_t;}
 */
typealias dispatch_io_type_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_io_close_flags_t;}
 */
typealias dispatch_io_close_flags_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long dispatch_io_interval_flags_t;}
 */
typealias dispatch_io_interval_flags_t = Long

/**
 * {@snippet lang=c : typedef Int cpu_type_t;}
 */
typealias cpu_type_t = Int

/**
 * {@snippet lang=c : typedef Int cpu_subtype_t;}
 */
typealias cpu_subtype_t = Int

/**
 * {@snippet lang=c : typedef Int cpu_threadtype_t;}
 */
typealias cpu_threadtype_t = Int

/**
 * {@snippet lang=c : typedef Int CFBundleRefNum;}
 */
typealias CFBundleRefNum = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int kauth_ace_rights_t;}
 */
typealias kauth_ace_rights_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong acl_permset_mask_t;}
 */
typealias acl_permset_mask_t = Long

/**
 * {@snippet lang=c : typedef Int CFFileDescriptorNativeDescriptor;}
 */
typealias CFFileDescriptorNativeDescriptor = Int

/**
 * {@snippet lang=c : typedef Double NSTimeInterval;}
 */
typealias NSTimeInterval = Double

/**
 * {@snippet lang=c : typedef SIGNED = Char DateOrders;}
 */
typealias DateOrders = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char TokenResults;}
 */
typealias TokenResults = Byte

/**
 * {@snippet lang=c : typedef Short ScriptTokenType;}
 */
typealias ScriptTokenType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TextEncodingBase;}
 */
typealias TextEncodingBase = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TextEncodingVariant;}
 */
typealias TextEncodingVariant = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TextEncodingFormat;}
 */
typealias TextEncodingFormat = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TextEncoding;}
 */
typealias TextEncoding = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TextEncodingNameSelector;}
 */
typealias TextEncodingNameSelector = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long UniCharArrayOffset;}
 */
typealias UniCharArrayOffset = Long

/**
 * {@snippet lang=c : typedef Int UCCharPropertyType;}
 */
typealias UCCharPropertyType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UCCharPropertyValue;}
 */
typealias UCCharPropertyValue = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CallingConventionType;}
 */
typealias CallingConventionType = Short

/**
 * {@snippet lang=c : typedef SIGNED = Char ISAType;}
 */
typealias ISAType = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char RTAType;}
 */
typealias RTAType = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short registerSelectorType;}
 */
typealias registerSelectorType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ProcInfoType;}
 */
typealias ProcInfoType = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Short RoutineFlagsType;}
 */
typealias RoutineFlagsType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char RDFlagsType;}
 */
typealias RDFlagsType = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CollectionTag;}
 */
typealias CollectionTag = Int

/**
 * {@snippet lang=c : typedef Int CSDiskSpaceRecoveryOptions;}
 */
typealias CSDiskSpaceRecoveryOptions = Int

/**
 * {@snippet lang=c : typedef Short ToggleResults;}
 */
typealias ToggleResults = Short

/**
 * {@snippet lang=c : typedef SIGNED = Char LongDateField;}
 */
typealias LongDateField = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char DateForm;}
 */
typealias DateForm = Byte

/**
 * {@snippet lang=c : typedef Short StringToDateStatus;}
 */
typealias StringToDateStatus = Short

/**
 * {@snippet lang=c : typedef Short String2DateStatus;}
 */
typealias String2DateStatus = Short

/**
 * {@snippet lang=c : typedef LongLong LongDateTime;}
 */
typealias LongDateTime = Long

/**
 * {@snippet lang=c : typedef SIGNED = Char DateDelta;}
 */
typealias DateDelta = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char QTypes;}
 */
typealias QTypes = Byte

/**
 * {@snippet lang=c : typedef Int vm_page_disposition_t;}
 */
typealias vm_page_disposition_t = Int

/**
 * {@snippet lang=c : typedef Int host_flavor_t;}
 */
typealias host_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int vm_prot_t;}
 */
typealias vm_prot_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm_sync_t;}
 */
typealias vm_sync_t = Int

/**
 * {@snippet lang=c : typedef Int mach_error_t;}
 */
typealias mach_error_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long pointer_t;}
 */
typealias pointer_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long vm_address_t;}
 */
typealias vm_address_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong addr64_t;}
 */
typealias addr64_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int reg64_t;}
 */
typealias reg64_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ppnum_t;}
 */
typealias ppnum_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm_map_t;}
 */
typealias vm_map_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm_map_read_t;}
 */
typealias vm_map_read_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm_map_inspect_t;}
 */
typealias vm_map_inspect_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int upl_t;}
 */
typealias upl_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm_named_entry_t;}
 */
typealias vm_named_entry_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong vm_object_offset_t;}
 */
typealias vm_object_offset_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong vm_object_size_t;}
 */
typealias vm_object_size_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong memory_object_offset_t;}
 */
typealias memory_object_offset_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong memory_object_size_t;}
 */
typealias memory_object_size_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int memory_object_cluster_size_t;}
 */
typealias memory_object_cluster_size_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong vm_object_id_t;}
 */
typealias vm_object_id_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int memory_object_t;}
 */
typealias memory_object_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int memory_object_control_t;}
 */
typealias memory_object_control_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int memory_object_name_t;}
 */
typealias memory_object_name_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int memory_object_default_t;}
 */
typealias memory_object_default_t = Int

/**
 * {@snippet lang=c : typedef Int memory_object_copy_strategy_t;}
 */
typealias memory_object_copy_strategy_t = Int

/**
 * {@snippet lang=c : typedef Int memory_object_return_t;}
 */
typealias memory_object_return_t = Int

/**
 * {@snippet lang=c : typedef Int memory_object_flavor_t;}
 */
typealias memory_object_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int thread_state_flavor_t;}
 */
typealias thread_state_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int exception_type_t;}
 */
typealias exception_type_t = Int

/**
 * {@snippet lang=c : typedef Int exception_data_type_t;}
 */
typealias exception_data_type_t = Int

/**
 * {@snippet lang=c : typedef LongLong mach_exception_data_type_t;}
 */
typealias mach_exception_data_type_t = Long

/**
 * {@snippet lang=c : typedef Int exception_behavior_t;}
 */
typealias exception_behavior_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int exception_mask_t;}
 */
typealias exception_mask_t = Int

/**
 * {@snippet lang=c : typedef LongLong mach_exception_code_t;}
 */
typealias mach_exception_code_t = Long

/**
 * {@snippet lang=c : typedef LongLong mach_exception_subcode_t;}
 */
typealias mach_exception_subcode_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_t;}
 */
typealias mach_voucher_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_name_t;}
 */
typealias mach_voucher_name_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ipc_voucher_t;}
 */
typealias ipc_voucher_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_selector_t;}
 */
typealias mach_voucher_selector_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_key_t;}
 */
typealias mach_voucher_attr_key_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_content_size_t;}
 */
typealias mach_voucher_attr_content_size_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_command_t;}
 */
typealias mach_voucher_attr_command_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_recipe_command_t;}
 */
typealias mach_voucher_attr_recipe_command_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_recipe_size_t;}
 */
typealias mach_voucher_attr_recipe_size_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_raw_recipe_size_t;}
 */
typealias mach_voucher_attr_raw_recipe_size_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_raw_recipe_array_size_t;}
 */
typealias mach_voucher_attr_raw_recipe_array_size_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_manager_t;}
 */
typealias mach_voucher_attr_manager_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_control_t;}
 */
typealias mach_voucher_attr_control_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ipc_voucher_attr_manager_t;}
 */
typealias ipc_voucher_attr_manager_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ipc_voucher_attr_control_t;}
 */
typealias ipc_voucher_attr_control_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong mach_voucher_attr_value_handle_t;}
 */
typealias mach_voucher_attr_value_handle_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_value_handle_array_size_t;}
 */
typealias mach_voucher_attr_value_handle_array_size_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_value_reference_t;}
 */
typealias mach_voucher_attr_value_reference_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_value_flags_t;}
 */
typealias mach_voucher_attr_value_flags_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_control_flags_t;}
 */
typealias mach_voucher_attr_control_flags_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_voucher_attr_importance_refs;}
 */
typealias mach_voucher_attr_importance_refs = Int

/**
 * {@snippet lang=c : typedef Int processor_flavor_t;}
 */
typealias processor_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int processor_set_flavor_t;}
 */
typealias processor_set_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int policy_t;}
 */
typealias policy_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_flavor_t;}
 */
typealias task_flavor_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_exc_guard_behavior_t;}
 */
typealias task_exc_guard_behavior_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_corpse_forking_behavior_t;}
 */
typealias task_corpse_forking_behavior_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_inspect_flavor_t;}
 */
typealias task_inspect_flavor_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_policy_flavor_t;}
 */
typealias task_policy_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int task_latency_qos_t;}
 */
typealias task_latency_qos_t = Int

/**
 * {@snippet lang=c : typedef Int task_throughput_qos_t;}
 */
typealias task_throughput_qos_t = Int

/**
 * {@snippet lang=c : typedef Int task_special_port_t;}
 */
typealias task_special_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_flavor_t;}
 */
typealias thread_flavor_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_policy_flavor_t;}
 */
typealias thread_policy_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int thread_latency_qos_t;}
 */
typealias thread_latency_qos_t = Int

/**
 * {@snippet lang=c : typedef Int thread_throughput_qos_t;}
 */
typealias thread_throughput_qos_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm_machine_attribute_t;}
 */
typealias vm_machine_attribute_t = Int

/**
 * {@snippet lang=c : typedef Int vm_machine_attribute_val_t;}
 */
typealias vm_machine_attribute_val_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm_inherit_t;}
 */
typealias vm_inherit_t = Int

/**
 * {@snippet lang=c : typedef Int vm_purgable_t;}
 */
typealias vm_purgable_t = Int

/**
 * {@snippet lang=c : typedef Int vm_behavior_t;}
 */
typealias vm_behavior_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm32_object_id_t;}
 */
typealias vm32_object_id_t = Int

/**
 * {@snippet lang=c : typedef Int vm_region_flavor_t;}
 */
typealias vm_region_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int vm_page_info_flavor_t;}
 */
typealias vm_page_info_flavor_t = Int

/**
 * {@snippet lang=c : typedef Int kmod_t;}
 */
typealias kmod_t = Int

/**
 * {@snippet lang=c : typedef Int kmod_control_flavor_t;}
 */
typealias kmod_control_flavor_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_t;}
 */
typealias task_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_name_t;}
 */
typealias task_name_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_policy_set_t;}
 */
typealias task_policy_set_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_policy_get_t;}
 */
typealias task_policy_get_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_inspect_t;}
 */
typealias task_inspect_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_read_t;}
 */
typealias task_read_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_suspension_token_t;}
 */
typealias task_suspension_token_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_t;}
 */
typealias thread_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_act_t;}
 */
typealias thread_act_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_inspect_t;}
 */
typealias thread_inspect_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_read_t;}
 */
typealias thread_read_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_suspension_token_t;}
 */
typealias thread_suspension_token_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ipc_space_t;}
 */
typealias ipc_space_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ipc_space_read_t;}
 */
typealias ipc_space_read_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ipc_space_inspect_t;}
 */
typealias ipc_space_inspect_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int coalition_t;}
 */
typealias coalition_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int host_t;}
 */
typealias host_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int host_priv_t;}
 */
typealias host_priv_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int host_security_t;}
 */
typealias host_security_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int processor_t;}
 */
typealias processor_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int processor_set_t;}
 */
typealias processor_set_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int processor_set_control_t;}
 */
typealias processor_set_control_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int semaphore_t;}
 */
typealias semaphore_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int lock_set_t;}
 */
typealias lock_set_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ledger_t;}
 */
typealias ledger_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int alarm_t;}
 */
typealias alarm_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int clock_serv_t;}
 */
typealias clock_serv_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int clock_ctrl_t;}
 */
typealias clock_ctrl_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int arcade_register_t;}
 */
typealias arcade_register_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ipc_eventlink_t;}
 */
typealias ipc_eventlink_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_id_token_t;}
 */
typealias task_id_token_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int kcdata_object_t;}
 */
typealias kcdata_object_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int processor_set_name_t;}
 */
typealias processor_set_name_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int clock_reply_t;}
 */
typealias clock_reply_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int bootstrap_t;}
 */
typealias bootstrap_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mem_entry_name_port_t;}
 */
typealias mem_entry_name_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int exception_handler_t;}
 */
typealias exception_handler_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int vm_task_entry_t;}
 */
typealias vm_task_entry_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int io_main_t;}
 */
typealias io_main_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UNDServerRef;}
 */
typealias UNDServerRef = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_eventlink_t;}
 */
typealias mach_eventlink_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int task_port_t;}
 */
typealias task_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_port_t;}
 */
typealias thread_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ipc_space_port_t;}
 */
typealias ipc_space_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int host_name_t;}
 */
typealias host_name_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int host_name_port_t;}
 */
typealias host_name_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int processor_set_port_t;}
 */
typealias processor_set_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int processor_set_name_port_t;}
 */
typealias processor_set_name_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int processor_set_control_port_t;}
 */
typealias processor_set_control_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int processor_port_t;}
 */
typealias processor_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int thread_act_port_t;}
 */
typealias thread_act_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int semaphore_port_t;}
 */
typealias semaphore_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int lock_set_port_t;}
 */
typealias lock_set_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ledger_port_t;}
 */
typealias ledger_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int alarm_port_t;}
 */
typealias alarm_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int clock_serv_port_t;}
 */
typealias clock_serv_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int clock_ctrl_port_t;}
 */
typealias clock_ctrl_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int exception_port_t;}
 */
typealias exception_port_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_task_flavor_t;}
 */
typealias mach_task_flavor_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mach_thread_flavor_t;}
 */
typealias mach_thread_flavor_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ledger_item_t;}
 */
typealias ledger_item_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ledger_entry_id_t;}
 */
typealias ledger_entry_id_t = Int

/**
 * {@snippet lang=c : typedef LongLong ledger_amount_t;}
 */
typealias ledger_amount_t = Long

/**
 * {@snippet lang=c : typedef Int IOReturn;}
 */
typealias IOReturn = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UInt;}
 */
typealias UInt_ = Int

/**
 * {@snippet lang=c : typedef Int SInt;}
 */
typealias SInt = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOOptionBits;}
 */
typealias IOOptionBits = Int

/**
 * {@snippet lang=c : typedef Int IOFixed;}
 */
typealias IOFixed = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOVersion;}
 */
typealias IOVersion = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOItemCount;}
 */
typealias IOItemCount = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOCacheMode;}
 */
typealias IOCacheMode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOByteCount32;}
 */
typealias IOByteCount32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong IOByteCount64;}
 */
typealias IOByteCount64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOPhysicalAddress32;}
 */
typealias IOPhysicalAddress32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong IOPhysicalAddress64;}
 */
typealias IOPhysicalAddress64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOPhysicalLength32;}
 */
typealias IOPhysicalLength32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong IOPhysicalLength64;}
 */
typealias IOPhysicalLength64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong IOVirtualAddress;}
 */
typealias IOVirtualAddress = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong IOByteCount;}
 */
typealias IOByteCount = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong IOLogicalAddress;}
 */
typealias IOLogicalAddress = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong IOPhysicalAddress;}
 */
typealias IOPhysicalAddress = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong IOPhysicalLength;}
 */
typealias IOPhysicalLength = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOAlignment;}
 */
typealias IOAlignment = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int io_object_t;}
 */
typealias io_object_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong io_user_scalar_t;}
 */
typealias io_user_scalar_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong io_user_reference_t;}
 */
typealias io_user_reference_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int io_connect_t;}
 */
typealias io_connect_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int io_enumerator_t;}
 */
typealias io_enumerator_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int io_ident_t;}
 */
typealias io_ident_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int io_iterator_t;}
 */
typealias io_iterator_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int io_registry_entry_t;}
 */
typealias io_registry_entry_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int io_service_t;}
 */
typealias io_service_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uext_object_t;}
 */
typealias uext_object_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IODeviceNumber;}
 */
typealias IODeviceNumber = Int

/**
 * {@snippet lang=c : typedef Short FSVolumeRefNum;}
 */
typealias FSVolumeRefNum = Short

/**
 * {@snippet lang=c : typedef Int FSIORefNum;}
 */
typealias FSIORefNum = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSCatalogInfoBitmap;}
 */
typealias FSCatalogInfoBitmap = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSIteratorFlags;}
 */
typealias FSIteratorFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short FSAllocationFlags;}
 */
typealias FSAllocationFlags = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char FSForkInfoFlags;}
 */
typealias FSForkInfoFlags = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSVolumeInfoBitmap;}
 */
typealias FSVolumeInfoBitmap = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int VolumeType;}
 */
typealias VolumeType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FNMessage;}
 */
typealias FNMessage = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSMountStatus;}
 */
typealias FSMountStatus = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSEjectStatus;}
 */
typealias FSEjectStatus = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSUnmountStatus;}
 */
typealias FSUnmountStatus = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSFileOperationStage;}
 */
typealias FSFileOperationStage = Int

/**
 * {@snippet lang=c : typedef Short ResID;}
 */
typealias ResID = Short

/**
 * {@snippet lang=c : typedef Short ResAttributes;}
 */
typealias ResAttributes = Short

/**
 * {@snippet lang=c : typedef Short ResFileAttributes;}
 */
typealias ResFileAttributes = Short

/**
 * {@snippet lang=c : typedef Short ResourceCount;}
 */
typealias ResourceCount = Short

/**
 * {@snippet lang=c : typedef Short ResourceIndex;}
 */
typealias ResourceIndex = Short

/**
 * {@snippet lang=c : typedef Int ResFileRefNum;}
 */
typealias ResFileRefNum = Int

/**
 * {@snippet lang=c : typedef Short RsrcChainLocation;}
 */
typealias RsrcChainLocation = Short

/**
 * {@snippet lang=c : typedef Int ComponentResult;}
 */
typealias ComponentResult = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSComponentsThreadMode;}
 */
typealias CSComponentsThreadMode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MPOpaqueIDClass;}
 */
typealias MPOpaqueIDClass = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MPTaskOptions;}
 */
typealias MPTaskOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long TaskStorageIndex;}
 */
typealias TaskStorageIndex = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long MPSemaphoreCount;}
 */
typealias MPSemaphoreCount = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MPTaskWeight;}
 */
typealias MPTaskWeight = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MPEventFlags;}
 */
typealias MPEventFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MPExceptionKind;}
 */
typealias MPExceptionKind = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MPTaskStateKind;}
 */
typealias MPTaskStateKind = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MPPageSizeClass;}
 */
typealias MPPageSizeClass = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MPDebuggerLevel;}
 */
typealias MPDebuggerLevel = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char MPRemoteContext;}
 */
typealias MPRemoteContext = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSAliasInfoBitmap;}
 */
typealias FSAliasInfoBitmap = Int

/**
 * {@snippet lang=c : typedef Short AliasInfoType;}
 */
typealias AliasInfoType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int LocalePartMask;}
 */
typealias LocalePartMask = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int LocaleOperationClass;}
 */
typealias LocaleOperationClass = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int LocaleOperationVariant;}
 */
typealias LocaleOperationVariant = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int LocaleNameMask;}
 */
typealias LocaleNameMask = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long MemoryReferenceKind;}
 */
typealias MemoryReferenceKind = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ExceptionKind;}
 */
typealias ExceptionKind = Long

/**
 * {@snippet lang=c : typedef Short FormatStatus;}
 */
typealias FormatStatus = Short

/**
 * {@snippet lang=c : typedef SIGNED = Char FormatClass;}
 */
typealias FormatClass = Byte

/**
 * {@snippet lang=c : typedef SIGNED = Char FormatResultType;}
 */
typealias FormatResultType = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short UCKeyOutput;}
 */
typealias UCKeyOutput = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short UCKeyCharSeq;}
 */
typealias UCKeyCharSeq = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UCCollateOptions;}
 */
typealias UCCollateOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UCCollationValue;}
 */
typealias UCCollationValue = Int

/**
 * {@snippet lang=c : typedef Int UCTypeSelectCompareResult;}
 */
typealias UCTypeSelectCompareResult = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short UCTSWalkDirection;}
 */
typealias UCTSWalkDirection = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short UCTypeSelectOptions;}
 */
typealias UCTypeSelectOptions = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UCTextBreakType;}
 */
typealias UCTextBreakType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UCTextBreakOptions;}
 */
typealias UCTextBreakOptions = Int

/**
 * {@snippet lang=c : typedef Short relop;}
 */
typealias relop = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short fexcept_t;}
 */
typealias fexcept_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TECPluginSignature;}
 */
typealias TECPluginSignature = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TECPluginVersion;}
 */
typealias TECPluginVersion = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TECPluginSig;}
 */
typealias TECPluginSig = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TECInternetNameUsageMask;}
 */
typealias TECInternetNameUsageMask = Int

/**
 * {@snippet lang=c : typedef Int UnicodeMapVersion;}
 */
typealias UnicodeMapVersion = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ThreadState;}
 */
typealias ThreadState = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ThreadStyle;}
 */
typealias ThreadStyle = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ThreadID;}
 */
typealias ThreadID = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ThreadOptions;}
 */
typealias ThreadOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FolderDescFlags;}
 */
typealias FolderDescFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FolderClass;}
 */
typealias FolderClass = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FolderType;}
 */
typealias FolderType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FolderLocation;}
 */
typealias FolderLocation = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int RoutingFlags;}
 */
typealias RoutingFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PEFRelocChunk;}
 */
typealias PEFRelocChunk = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int HFSCatalogNodeID;}
 */
typealias HFSCatalogNodeID = Int

/**
 * {@snippet lang=c : typedef Short MarkerIdType;}
 */
typealias MarkerIdType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int DescType;}
 */
typealias DescType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int AEKeyword;}
 */
typealias AEKeyword = Int

/**
 * {@snippet lang=c : typedef Short AEReturnID;}
 */
typealias AEReturnID = Short

/**
 * {@snippet lang=c : typedef Int AETransactionID;}
 */
typealias AETransactionID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int AEEventClass;}
 */
typealias AEEventClass = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int AEEventID;}
 */
typealias AEEventID = Int

/**
 * {@snippet lang=c : typedef SIGNED = Char AEArrayType;}
 */
typealias AEArrayType = Byte

/**
 * {@snippet lang=c : typedef Short AESendPriority;}
 */
typealias AESendPriority = Short

/**
 * {@snippet lang=c : typedef Int AESendMode;}
 */
typealias AESendMode = Int

/**
 * {@snippet lang=c : typedef SIGNED = Char AEEventSource;}
 */
typealias AEEventSource = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int AEBuildErrorCode;}
 */
typealias AEBuildErrorCode = Int

/**
 * {@snippet lang=c : typedef Long CFNetDiagnosticStatus;}
 */
typealias CFNetDiagnosticStatus = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int SecKeychainAttrType;}
 */
typealias SecKeychainAttrType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int SecKeychainStatus;}
 */
typealias SecKeychainStatus = Int

/**
 * {@snippet lang=c : typedef LongLong sint64;}
 */
typealias sint64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong uint64;}
 */
typealias uint64 = Long

/**
 * {@snippet lang=c : typedef Int sint32;}
 */
typealias sint32 = Int

/**
 * {@snippet lang=c : typedef Short sint16;}
 */
typealias sint16 = Short

/**
 * {@snippet lang=c : typedef SIGNED = Char sint8;}
 */
typealias sint8 = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uint32;}
 */
typealias uint32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short uint16;}
 */
typealias uint16 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char uint8;}
 */
typealias uint8 = Byte

/**
 * {@snippet lang=c : typedef Long CSSM_INTPTR;}
 */
typealias CSSM_INTPTR = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CSSM_SIZE;}
 */
typealias CSSM_SIZE = Long

/**
 * {@snippet lang=c : typedef Long CSSM_HANDLE;}
 */
typealias CSSM_HANDLE = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong CSSM_LONG_HANDLE;}
 */
typealias CSSM_LONG_HANDLE = Long

/**
 * {@snippet lang=c : typedef Long CSSM_MODULE_HANDLE;}
 */
typealias CSSM_MODULE_HANDLE = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong CSSM_CC_HANDLE;}
 */
typealias CSSM_CC_HANDLE = Long

/**
 * {@snippet lang=c : typedef Long CSSM_CSP_HANDLE;}
 */
typealias CSSM_CSP_HANDLE = Long

/**
 * {@snippet lang=c : typedef Long CSSM_TP_HANDLE;}
 */
typealias CSSM_TP_HANDLE = Long

/**
 * {@snippet lang=c : typedef Long CSSM_AC_HANDLE;}
 */
typealias CSSM_AC_HANDLE = Long

/**
 * {@snippet lang=c : typedef Long CSSM_CL_HANDLE;}
 */
typealias CSSM_CL_HANDLE = Long

/**
 * {@snippet lang=c : typedef Long CSSM_DL_HANDLE;}
 */
typealias CSSM_DL_HANDLE = Long

/**
 * {@snippet lang=c : typedef Long CSSM_DB_HANDLE;}
 */
typealias CSSM_DB_HANDLE = Long

/**
 * {@snippet lang=c : typedef Int CSSM_BOOL;}
 */
typealias CSSM_BOOL = Int

/**
 * {@snippet lang=c : typedef Int CSSM_RETURN;}
 */
typealias CSSM_RETURN = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_BITMASK;}
 */
typealias CSSM_BITMASK = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KEY_HIERARCHY;}
 */
typealias CSSM_KEY_HIERARCHY = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_PVC_MODE;}
 */
typealias CSSM_PVC_MODE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_PRIVILEGE_SCOPE;}
 */
typealias CSSM_PRIVILEGE_SCOPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_SERVICE_MASK;}
 */
typealias CSSM_SERVICE_MASK = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_SERVICE_TYPE;}
 */
typealias CSSM_SERVICE_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_MODULE_EVENT;}
 */
typealias CSSM_MODULE_EVENT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_ATTACH_FLAGS;}
 */
typealias CSSM_ATTACH_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong CSSM_PRIVILEGE;}
 */
typealias CSSM_PRIVILEGE = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong CSSM_USEE_TAG;}
 */
typealias CSSM_USEE_TAG = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_NET_ADDRESS_TYPE;}
 */
typealias CSSM_NET_ADDRESS_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_NET_PROTOCOL;}
 */
typealias CSSM_NET_PROTOCOL = Int

/**
 * {@snippet lang=c : typedef Int CSSM_WORDID_TYPE;}
 */
typealias CSSM_WORDID_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_LIST_ELEMENT_TYPE;}
 */
typealias CSSM_LIST_ELEMENT_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_LIST_TYPE;}
 */
typealias CSSM_LIST_TYPE = Int

/**
 * {@snippet lang=c : typedef Int CSSM_SAMPLE_TYPE;}
 */
typealias CSSM_SAMPLE_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CERT_TYPE;}
 */
typealias CSSM_CERT_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CERT_ENCODING;}
 */
typealias CSSM_CERT_ENCODING = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CERT_PARSE_FORMAT;}
 */
typealias CSSM_CERT_PARSE_FORMAT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CERTGROUP_TYPE;}
 */
typealias CSSM_CERTGROUP_TYPE = Int

/**
 * {@snippet lang=c : typedef Int CSSM_ACL_SUBJECT_TYPE;}
 */
typealias CSSM_ACL_SUBJECT_TYPE = Int

/**
 * {@snippet lang=c : typedef Int CSSM_ACL_AUTHORIZATION_TAG;}
 */
typealias CSSM_ACL_AUTHORIZATION_TAG = Int

/**
 * {@snippet lang=c : typedef Long CSSM_ACL_HANDLE;}
 */
typealias CSSM_ACL_HANDLE = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_ACL_EDIT_MODE;}
 */
typealias CSSM_ACL_EDIT_MODE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_HEADERVERSION;}
 */
typealias CSSM_HEADERVERSION = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KEYBLOB_TYPE;}
 */
typealias CSSM_KEYBLOB_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KEYBLOB_FORMAT;}
 */
typealias CSSM_KEYBLOB_FORMAT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KEYCLASS;}
 */
typealias CSSM_KEYCLASS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KEYATTR_FLAGS;}
 */
typealias CSSM_KEYATTR_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KEYUSE;}
 */
typealias CSSM_KEYUSE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_ALGORITHMS;}
 */
typealias CSSM_ALGORITHMS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_ENCRYPT_MODE;}
 */
typealias CSSM_ENCRYPT_MODE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CSPTYPE;}
 */
typealias CSSM_CSPTYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CONTEXT_TYPE;}
 */
typealias CSSM_CONTEXT_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_ATTRIBUTE_TYPE;}
 */
typealias CSSM_ATTRIBUTE_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_PADDING;}
 */
typealias CSSM_PADDING = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KEY_TYPE;}
 */
typealias CSSM_KEY_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_SC_FLAGS;}
 */
typealias CSSM_SC_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CSP_READER_FLAGS;}
 */
typealias CSSM_CSP_READER_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CSP_FLAGS;}
 */
typealias CSSM_CSP_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_PKCS_OAEP_MGF;}
 */
typealias CSSM_PKCS_OAEP_MGF = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_PKCS_OAEP_PSOURCE;}
 */
typealias CSSM_PKCS_OAEP_PSOURCE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_PKCS5_PBKDF2_PRF;}
 */
typealias CSSM_PKCS5_PBKDF2_PRF = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_AUTHORITY_REQUEST_TYPE;}
 */
typealias CSSM_TP_AUTHORITY_REQUEST_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_SERVICES;}
 */
typealias CSSM_TP_SERVICES = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_ACTION;}
 */
typealias CSSM_TP_ACTION = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_STOP_ON;}
 */
typealias CSSM_TP_STOP_ON = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CRL_PARSE_FORMAT;}
 */
typealias CSSM_CRL_PARSE_FORMAT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CRL_TYPE;}
 */
typealias CSSM_CRL_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CRL_ENCODING;}
 */
typealias CSSM_CRL_ENCODING = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CRLGROUP_TYPE;}
 */
typealias CSSM_CRLGROUP_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_EVIDENCE_FORM;}
 */
typealias CSSM_EVIDENCE_FORM = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CONFIRM_STATUS;}
 */
typealias CSSM_TP_CONFIRM_STATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CERTISSUE_STATUS;}
 */
typealias CSSM_TP_CERTISSUE_STATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CERTCHANGE_ACTION;}
 */
typealias CSSM_TP_CERTCHANGE_ACTION = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CERTCHANGE_REASON;}
 */
typealias CSSM_TP_CERTCHANGE_REASON = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CERTCHANGE_STATUS;}
 */
typealias CSSM_TP_CERTCHANGE_STATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CERTVERIFY_STATUS;}
 */
typealias CSSM_TP_CERTVERIFY_STATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CERTNOTARIZE_STATUS;}
 */
typealias CSSM_TP_CERTNOTARIZE_STATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CERTRECLAIM_STATUS;}
 */
typealias CSSM_TP_CERTRECLAIM_STATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_CRLISSUE_STATUS;}
 */
typealias CSSM_TP_CRLISSUE_STATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_FORM_TYPE;}
 */
typealias CSSM_TP_FORM_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CL_TEMPLATE_TYPE;}
 */
typealias CSSM_CL_TEMPLATE_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CERT_BUNDLE_TYPE;}
 */
typealias CSSM_CERT_BUNDLE_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CERT_BUNDLE_ENCODING;}
 */
typealias CSSM_CERT_BUNDLE_ENCODING = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_ATTRIBUTE_NAME_FORMAT;}
 */
typealias CSSM_DB_ATTRIBUTE_NAME_FORMAT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_ATTRIBUTE_FORMAT;}
 */
typealias CSSM_DB_ATTRIBUTE_FORMAT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_RECORDTYPE;}
 */
typealias CSSM_DB_RECORDTYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_INDEX_TYPE;}
 */
typealias CSSM_DB_INDEX_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_INDEXED_DATA_LOCATION;}
 */
typealias CSSM_DB_INDEXED_DATA_LOCATION = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_ACCESS_TYPE;}
 */
typealias CSSM_DB_ACCESS_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_MODIFY_MODE;}
 */
typealias CSSM_DB_MODIFY_MODE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_OPERATOR;}
 */
typealias CSSM_DB_OPERATOR = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_CONJUNCTIVE;}
 */
typealias CSSM_DB_CONJUNCTIVE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_QUERY_FLAGS;}
 */
typealias CSSM_QUERY_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DLTYPE;}
 */
typealias CSSM_DLTYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_DB_RETRIEVAL_MODES;}
 */
typealias CSSM_DB_RETRIEVAL_MODES = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char CSSM_BER_TAG;}
 */
typealias CSSM_BER_TAG = Byte

/**
 * {@snippet lang=c : typedef Int CSSM_X509_OPTION;}
 */
typealias CSSM_X509_OPTION = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int SecAccessOwnerType;}
 */
typealias SecAccessOwnerType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CE_KeyUsage;}
 */
typealias CE_KeyUsage = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CE_CrlReason;}
 */
typealias CE_CrlReason = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CE_NetscapeCertType;}
 */
typealias CE_NetscapeCertType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char CE_CrlDistReasonFlags;}
 */
typealias CE_CrlDistReasonFlags = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CE_CrlNumber;}
 */
typealias CE_CrlNumber = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CE_DeltaCrl;}
 */
typealias CE_DeltaCrl = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CE_InhibitAnyPolicy;}
 */
typealias CE_InhibitAnyPolicy = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_ACL_PREAUTH_TRACKING_STATE;}
 */
typealias CSSM_ACL_PREAUTH_TRACKING_STATE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_APPLE_TP_CRL_OPT_FLAGS;}
 */
typealias CSSM_APPLE_TP_CRL_OPT_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_APPLE_TP_ACTION_FLAGS;}
 */
typealias CSSM_APPLE_TP_ACTION_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_TP_APPLE_CERT_STATUS;}
 */
typealias CSSM_TP_APPLE_CERT_STATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short SSLCipherSuite;}
 */
typealias SSLCipherSuite = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int SecuritySessionId;}
 */
typealias SecuritySessionId = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_MANAGER_EVENT_TYPES;}
 */
typealias CSSM_MANAGER_EVENT_TYPES = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_CONTEXT_EVENT;}
 */
typealias CSSM_CONTEXT_EVENT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KRSP_HANDLE;}
 */
typealias CSSM_KRSP_HANDLE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KR_POLICY_TYPE;}
 */
typealias CSSM_KR_POLICY_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CSSM_KR_POLICY_FLAGS;}
 */
typealias CSSM_KR_POLICY_FLAGS = Int

/**
 * {@snippet lang=c : typedef Long MDS_HANDLE;}
 */
typealias MDS_HANDLE = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int SecGuestRef;}
 */
typealias SecGuestRef = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int au_id_t;}
 */
typealias au_id_t = Int

/**
 * {@snippet lang=c : typedef Int au_asid_t;}
 */
typealias au_asid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short au_event_t;}
 */
typealias au_event_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short au_emod_t;}
 */
typealias au_emod_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int au_class_t;}
 */
typealias au_class_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong au_asflgs_t;}
 */
typealias au_asflgs_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Char au_ctlmode_t;}
 */
typealias au_ctlmode_t = Byte

/**
 * {@snippet lang=c : typedef Long xpc_activity_state_t;}
 */
typealias xpc_activity_state_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int notify_port_t;}
 */
typealias notify_port_t = Int

/**
 * {@snippet lang=c : typedef Int sync_policy_t;}
 */
typealias sync_policy_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int routine_arg_type;}
 */
typealias routine_arg_type = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int routine_arg_offset;}
 */
typealias routine_arg_offset = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int routine_arg_size;}
 */
typealias routine_arg_size = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char DERByte;}
 */
typealias DERByte = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short DERShort;}
 */
typealias DERShort = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int DERInt;}
 */
typealias DERInt = Int

/**
 * {@snippet lang=c : typedef Int DERSignedInt;}
 */
typealias DERSignedInt = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong DERLong;}
 */
typealias DERLong = Long

/**
 * {@snippet lang=c : typedef LongLong DERSignedLong;}
 */
typealias DERSignedLong = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long DERSize;}
 */
typealias DERSize = Long

/**
 * {@snippet lang=c : typedef Bool DERBool;}
 */
typealias DERBool = Boolean

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong DERTag;}
 */
typealias DERTag = Long

/**
 * {@snippet lang=c : typedef Long CSIdentityClass;}
 */
typealias CSIdentityClass = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CSIdentityFlags;}
 */
typealias CSIdentityFlags = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CSIdentityQueryFlags;}
 */
typealias CSIdentityQueryFlags = Long

/**
 * {@snippet lang=c : typedef Long CSIdentityQueryStringComparisonMethod;}
 */
typealias CSIdentityQueryStringComparisonMethod = Long

/**
 * {@snippet lang=c : typedef Long CSIdentityQueryEvent;}
 */
typealias CSIdentityQueryEvent = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KCAttrType;}
 */
typealias KCAttrType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KCStatus;}
 */
typealias KCStatus = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short KCEvent;}
 */
typealias KCEvent = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short KCEventMask;}
 */
typealias KCEventMask = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KCItemClass;}
 */
typealias KCItemClass = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KCItemAttr;}
 */
typealias KCItemAttr = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KCAuthType;}
 */
typealias KCAuthType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KCProtocolType;}
 */
typealias KCProtocolType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KCCertAddOptions;}
 */
typealias KCCertAddOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short KCVerifyStopOn;}
 */
typealias KCVerifyStopOn = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KCCertSearchOptions;}
 */
typealias KCCertSearchOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IconServicesUsageFlags;}
 */
typealias IconServicesUsageFlags = Int

/**
 * {@snippet lang=c : typedef Long SKDocumentID;}
 */
typealias SKDocumentID = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int SKSearchOptions;}
 */
typealias SKSearchOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSEventStreamCreateFlags;}
 */
typealias FSEventStreamCreateFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FSEventStreamEventFlags;}
 */
typealias FSEventStreamEventFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong FSEventStreamEventId;}
 */
typealias FSEventStreamEventId = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int LSSharedFileListResolutionFlags;}
 */
typealias LSSharedFileListResolutionFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short SFNTLookupTableFormat;}
 */
typealias SFNTLookupTableFormat = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short SFNTLookupValue;}
 */
typealias SFNTLookupValue = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short SFNTLookupOffset;}
 */
typealias SFNTLookupOffset = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int SFNTLookupKind;}
 */
typealias SFNTLookupKind = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char STClass;}
 */
typealias STClass = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char STEntryIndex;}
 */
typealias STEntryIndex = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short STXClass;}
 */
typealias STXClass = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short STXStateIndex;}
 */
typealias STXStateIndex = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short STXEntryIndex;}
 */
typealias STXEntryIndex = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short JustPCActionType;}
 */
typealias JustPCActionType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short JustificationFlags;}
 */
typealias JustificationFlags = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short JustPCUnconditionalAddAction;}
 */
typealias JustPCUnconditionalAddAction = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short OpbdTableFormat;}
 */
typealias OpbdTableFormat = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MortSubtableMaskFlags;}
 */
typealias MortSubtableMaskFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int MortLigatureActionEntry;}
 */
typealias MortLigatureActionEntry = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PropCharProperties;}
 */
typealias PropCharProperties = Short

/**
 * {@snippet lang=c : typedef Short TrakValue;}
 */
typealias TrakValue = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char KernTableFormat;}
 */
typealias KernTableFormat = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short KernSubtableInfo;}
 */
typealias KernSubtableInfo = Short

/**
 * {@snippet lang=c : typedef Short KernKerningValue;}
 */
typealias KernKerningValue = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short KernArrayOffset;}
 */
typealias KernArrayOffset = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KerxSubtableCoverage;}
 */
typealias KerxSubtableCoverage = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int KerxArrayOffset;}
 */
typealias KerxArrayOffset = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int BslnBaselineClass;}
 */
typealias BslnBaselineClass = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short BslnTableFormat;}
 */
typealias BslnTableFormat = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FMGeneration;}
 */
typealias FMGeneration = Int

/**
 * {@snippet lang=c : typedef Short FMFontFamily;}
 */
typealias FMFontFamily = Short

/**
 * {@snippet lang=c : typedef Short FMFontStyle;}
 */
typealias FMFontStyle = Short

/**
 * {@snippet lang=c : typedef Short FMFontSize;}
 */
typealias FMFontSize = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FMFont;}
 */
typealias FMFont = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FMFilterSelector;}
 */
typealias FMFilterSelector = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSOptionFlags;}
 */
typealias ATSOptionFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSGeneration;}
 */
typealias ATSGeneration = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSFontContainerRef;}
 */
typealias ATSFontContainerRef = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSFontFamilyRef;}
 */
typealias ATSFontFamilyRef = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSFontRef;}
 */
typealias ATSFontRef = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSGlyphRef;}
 */
typealias ATSGlyphRef = Short

/**
 * {@snippet lang=c : typedef Double ATSFontSize;}
 */
typealias ATSFontSize = Double

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSFontFormat;}
 */
typealias ATSFontFormat = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSCurveType;}
 */
typealias ATSCurveType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short GlyphID;}
 */
typealias GlyphID = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSULayoutOperationSelector;}
 */
typealias ATSULayoutOperationSelector = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSULayoutOperationCallbackStatus;}
 */
typealias ATSULayoutOperationCallbackStatus = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSLineLayoutOptions;}
 */
typealias ATSLineLayoutOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSStyleRenderingOptions;}
 */
typealias ATSStyleRenderingOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSGlyphInfoFlags;}
 */
typealias ATSGlyphInfoFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FontNameCode;}
 */
typealias FontNameCode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FontPlatformCode;}
 */
typealias FontPlatformCode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FontScriptCode;}
 */
typealias FontScriptCode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int FontLanguageCode;}
 */
typealias FontLanguageCode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSFontContext;}
 */
typealias ATSFontContext = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSFontAutoActivationSetting;}
 */
typealias ATSFontAutoActivationSetting = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ColorSyncDataLayout;}
 */
typealias ColorSyncDataLayout = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CGFontIndex;}
 */
typealias CGFontIndex = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CGGlyph;}
 */
typealias CGGlyph = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char CGPDFBoolean;}
 */
typealias CGPDFBoolean = Byte

/**
 * {@snippet lang=c : typedef Long CGPDFInteger;}
 */
typealias CGPDFInteger = Long

/**
 * {@snippet lang=c : typedef Double CGPDFReal;}
 */
typealias CGPDFReal = Double

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGWindowID;}
 */
typealias CGWindowID = Int

/**
 * {@snippet lang=c : typedef Int CGWindowLevel;}
 */
typealias CGWindowLevel = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGDirectDisplayID;}
 */
typealias CGDirectDisplayID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGOpenGLDisplayMask;}
 */
typealias CGOpenGLDisplayMask = Int

/**
 * {@snippet lang=c : typedef Double CGRefreshRate;}
 */
typealias CGRefreshRate = Double

/**
 * {@snippet lang=c : typedef Float CGGammaValue;}
 */
typealias CGGammaValue = Float

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGDisplayCount;}
 */
typealias CGDisplayCount = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGDisplayFadeReservationToken;}
 */
typealias CGDisplayFadeReservationToken = Int

/**
 * {@snippet lang=c : typedef Float CGDisplayBlendFraction;}
 */
typealias CGDisplayBlendFraction = Float

/**
 * {@snippet lang=c : typedef Float CGDisplayFadeInterval;}
 */
typealias CGDisplayFadeInterval = Float

/**
 * {@snippet lang=c : typedef Float CGDisplayReservationInterval;}
 */
typealias CGDisplayReservationInterval = Float

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGButtonCount;}
 */
typealias CGButtonCount = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGWheelCount;}
 */
typealias CGWheelCount = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CGCharCode;}
 */
typealias CGCharCode = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CGKeyCode;}
 */
typealias CGKeyCode = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGRectCount;}
 */
typealias CGRectCount = Int

/**
 * {@snippet lang=c : typedef LongLong OSAtomic_int64_aligned64_t;}
 */
typealias OSAtomic_int64_aligned64_t = Long

/**
 * {@snippet lang=c : typedef Int OSSpinLock;}
 */
typealias OSSpinLock = Int

/**
 * {@snippet lang=c : typedef Int IOIndex;}
 */
typealias IOIndex = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOSelect;}
 */
typealias IOSelect = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOFixed1616;}
 */
typealias IOFixed1616 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IODisplayVendorID;}
 */
typealias IODisplayVendorID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IODisplayProductID;}
 */
typealias IODisplayProductID = Int

/**
 * {@snippet lang=c : typedef Int IODisplayModeID;}
 */
typealias IODisplayModeID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IOAppleTimingID;}
 */
typealias IOAppleTimingID = Int

/**
 * {@snippet lang=c : typedef Int IOPixelAperture;}
 */
typealias IOPixelAperture = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short IOColorComponent;}
 */
typealias IOColorComponent = Short

/**
 * {@snippet lang=c : typedef Float NXCoord;}
 */
typealias NXCoord = Float

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong CGEventTimestamp;}
 */
typealias CGEventTimestamp = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong CGEventMask;}
 */
typealias CGEventMask = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CGEventSourceKeyboardType;}
 */
typealias CGEventSourceKeyboardType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CTFontPriority;}
 */
typealias CTFontPriority = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CTFontTableTag;}
 */
typealias CTFontTableTag = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CMXYZComponent;}
 */
typealias CMXYZComponent = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CMDisplayIDType;}
 */
typealias CMDisplayIDType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CMChromaticAdaptation;}
 */
typealias CMChromaticAdaptation = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CMBitmapColorSpace;}
 */
typealias CMBitmapColorSpace = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CMDeviceState;}
 */
typealias CMDeviceState = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CMDeviceID;}
 */
typealias CMDeviceID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CMDeviceProfileID;}
 */
typealias CMDeviceProfileID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int CMDeviceClass;}
 */
typealias CMDeviceClass = Int

/**
 * {@snippet lang=c : typedef Short QDErr;}
 */
typealias QDErr = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Long GWorldFlags;}
 */
typealias GWorldFlags = Long

/**
 * {@snippet lang=c : typedef Int QDRegionParseDirection;}
 */
typealias QDRegionParseDirection = Int

/**
 * {@snippet lang=c : typedef Short TruncCode;}
 */
typealias TruncCode = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short DragConstraint;}
 */
typealias DragConstraint = Short

/**
 * {@snippet lang=c : typedef SIGNED = Char GrafVerb;}
 */
typealias GrafVerb = Byte

/**
 * {@snippet lang=c : typedef Int PrinterStatusOpcode;}
 */
typealias PrinterStatusOpcode = Int

/**
 * {@snippet lang=c : typedef Short IconAlignmentType;}
 */
typealias IconAlignmentType = Short

/**
 * {@snippet lang=c : typedef Short IconTransformType;}
 */
typealias IconTransformType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int IconSelectorValue;}
 */
typealias IconSelectorValue = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PlotIconRefFlags;}
 */
typealias PlotIconRefFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ICAttr;}
 */
typealias ICAttr = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char ICPerm;}
 */
typealias ICPerm = Byte

/**
 * {@snippet lang=c : typedef Int ICProfileID;}
 */
typealias ICProfileID = Int

/**
 * {@snippet lang=c : typedef Int ICMapEntryFlags;}
 */
typealias ICMapEntryFlags = Int

/**
 * {@snippet lang=c : typedef Short ICFixedLength;}
 */
typealias ICFixedLength = Short

/**
 * {@snippet lang=c : typedef Short ICServiceEntryFlags;}
 */
typealias ICServiceEntryFlags = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short LaunchFlags;}
 */
typealias LaunchFlags = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ProcessApplicationTransformState;}
 */
typealias ProcessApplicationTransformState = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TranslationFlags;}
 */
typealias TranslationFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UAZoomChangeFocusType;}
 */
typealias UAZoomChangeFocusType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NSURLBookmarkFileCreationOptions;}
 */
typealias NSURLBookmarkFileCreationOptions = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NSHashTableOptions;}
 */
typealias NSHashTableOptions = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NSPropertyListWriteOptions;}
 */
typealias NSPropertyListWriteOptions = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NSMapTableOptions;}
 */
typealias NSMapTableOptions = Long

/**
 * {@snippet lang=c : typedef Int NSSocketNativeHandle;}
 */
typealias NSSocketNativeHandle = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong NSTextCheckingTypes;}
 */
typealias NSTextCheckingTypes = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PMDestinationType;}
 */
typealias PMDestinationType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PMOrientation;}
 */
typealias PMOrientation = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PMPrinterState;}
 */
typealias PMPrinterState = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PMColorSpaceModel;}
 */
typealias PMColorSpaceModel = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PMQualityMode;}
 */
typealias PMQualityMode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PMPaperType;}
 */
typealias PMPaperType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PMScalingAlignment;}
 */
typealias PMScalingAlignment = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PMDuplexMode;}
 */
typealias PMDuplexMode = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PMLayoutDirection;}
 */
typealias PMLayoutDirection = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PMBorderType;}
 */
typealias PMBorderType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PMPrintDialogOptionFlags;}
 */
typealias PMPrintDialogOptionFlags = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PMPPDDomain;}
 */
typealias PMPPDDomain = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char sa_family_t;}
 */
typealias sa_family_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int socklen_t;}
 */
typealias socklen_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int sae_associd_t;}
 */
typealias sae_associd_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int sae_connid_t;}
 */
typealias sae_connid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short n_short;}
 */
typealias n_short = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int n_long;}
 */
typealias n_long = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int n_time;}
 */
typealias n_time = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int tcp_seq;}
 */
typealias tcp_seq = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int tcp_cc;}
 */
typealias tcp_cc = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char ipp_uchar_t;}
 */
typealias ipp_uchar_t = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Int cups_ptype_t;}
 */
typealias cups_ptype_t = Int

/**
 * {@snippet lang=c : typedef Int ATSUTextMeasurement;}
 */
typealias ATSUTextMeasurement = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUFontID;}
 */
typealias ATSUFontID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSUFontFeatureType;}
 */
typealias ATSUFontFeatureType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSUFontFeatureSelector;}
 */
typealias ATSUFontFeatureSelector = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUFontVariationAxis;}
 */
typealias ATSUFontVariationAxis = Int

/**
 * {@snippet lang=c : typedef Int ATSUFontVariationValue;}
 */
typealias ATSUFontVariationValue = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUAttributeTag;}
 */
typealias ATSUAttributeTag = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSUCursorMovementType;}
 */
typealias ATSUCursorMovementType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSULineTruncation;}
 */
typealias ATSULineTruncation = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSUStyleLineCountType;}
 */
typealias ATSUStyleLineCountType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSUVerticalCharacterType;}
 */
typealias ATSUVerticalCharacterType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSUStyleComparison;}
 */
typealias ATSUStyleComparison = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSUFontFallbackMethod;}
 */
typealias ATSUFontFallbackMethod = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATSUTabType;}
 */
typealias ATSUTabType = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short GlyphCollection;}
 */
typealias GlyphCollection = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUHighlightMethod;}
 */
typealias ATSUHighlightMethod = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUBackgroundDataType;}
 */
typealias ATSUBackgroundDataType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUFlattenedDataStreamFormat;}
 */
typealias ATSUFlattenedDataStreamFormat = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUFlattenStyleRunOptions;}
 */
typealias ATSUFlattenStyleRunOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUUnFlattenStyleRunOptions;}
 */
typealias ATSUUnFlattenStyleRunOptions = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSFlatDataFontSpeciferType;}
 */
typealias ATSFlatDataFontSpeciferType = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ATSUDirectDataSelector;}
 */
typealias ATSUDirectDataSelector = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NSAccessibilityDateTimeComponentsFlags;}
 */
typealias NSAccessibilityDateTimeComponentsFlags = Long

/**
 * {@snippet lang=c : typedef Float NSAnimationProgress;}
 */
typealias NSAnimationProgress = Float

/**
 * {@snippet lang=c : typedef Long NSTrackingRectTag;}
 */
typealias NSTrackingRectTag = Long

/**
 * {@snippet lang=c : typedef Long NSToolTipTag;}
 */
typealias NSToolTipTag = Long

/**
 * {@snippet lang=c : typedef Long NSControlStateValue;}
 */
typealias NSControlStateValue = Long

/**
 * {@snippet lang=c : typedef Long NSCellStateValue;}
 */
typealias NSCellStateValue = Long

/**
 * {@snippet lang=c : typedef Double NSAppKitVersion;}
 */
typealias NSAppKitVersion = Double

/**
 * {@snippet lang=c : typedef Long NSModalResponse;}
 */
typealias NSModalResponse = Long

/**
 * {@snippet lang=c : typedef Long NSWindowLevel;}
 */
typealias NSWindowLevel = Long
