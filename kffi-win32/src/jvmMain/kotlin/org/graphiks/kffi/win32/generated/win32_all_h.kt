package org.graphiks.kffi.win32.generated

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

private object kextract_runtime {
    val C_BOOL: ValueLayout = ValueLayout.JAVA_BOOLEAN
    val C_CHAR: ValueLayout = ValueLayout.JAVA_BYTE
    val C_SHORT: ValueLayout = ValueLayout.JAVA_SHORT
    val C_INT: ValueLayout = ValueLayout.JAVA_INT
    val C_LONG: ValueLayout = ValueLayout.JAVA_INT
    val C_LONG_LONG: ValueLayout = ValueLayout.JAVA_LONG
    val C_WCHAR: ValueLayout = ValueLayout.JAVA_CHAR
    val C_FLOAT: ValueLayout = ValueLayout.JAVA_FLOAT
    val C_DOUBLE: ValueLayout = ValueLayout.JAVA_DOUBLE
    val C_POINTER: ValueLayout = ValueLayout.ADDRESS
}

private var _DLL_DWMAPI_DLL: SymbolLookup? = null
private var _DLL_GDI32_DLL: SymbolLookup? = null
private var _DLL_KERNEL32_DLL: SymbolLookup? = null
private var _DLL_NINPUT_DLL: SymbolLookup? = null
private var _DLL_OLE32_DLL: SymbolLookup? = null
private var _DLL_USER32_DLL: SymbolLookup? = null

@Volatile private var _initialized: Boolean = false

private fun _lookup(symbol: String): SymbolLookup {
    return when (symbol) {
        "RegisterClassExW", "CreateWindowExW", "FindWindowExW", "GetDC", "ReleaseDC", "FillRect", "ShowWindow", "UpdateWindow", "DestroyWindow", "DefWindowProcW", "SetWindowTextW", "PostQuitMessage", "GetKeyState", "GetKeyboardState", "GetKeyboardLayout", "MapVirtualKeyExW", "ToUnicodeEx", "SystemParametersInfoW", "PeekMessageW", "GetMessageW", "TranslateMessage", "DispatchMessageW", "MsgWaitForMultipleObjectsEx", "LoadCursorW", "SetProcessDpiAwarenessContext", "GetDpiForWindow", "InvalidateRect", "ValidateRect", "TrackMouseEvent", "RegisterTouchWindow", "GetTouchInputInfo", "CloseTouchInputHandle", "GetGestureInfo", "CloseGestureInfoHandle", "ScreenToClient", "ClientToScreen", "GetCursorPos", "GetSystemMenu", "TrackPopupMenu", "EnableMenuItem", "SetMenuDefaultItem", "ReleaseCapture", "EnableWindow", "GetClientRect", "GetWindowRect", "AdjustWindowRectExForDpi", "MonitorFromWindow", "GetMonitorInfoW", "SetWindowLongPtrW", "GetWindowLongPtrW", "IsZoomed", "IsIconic", "IsWindow", "IsWindowVisible", "GetWindowTextW", "GetWindowTextLengthW", "SetWindowPos", "GetForegroundWindow", "SetForegroundWindow", "MapVirtualKeyW", "SendInput", "SetCursorPos", "SetCursor", "ShowCursor", "ClipCursor", "PostMessageW", "SendMessageW", "CreateIcon", "DestroyIcon", "FlashWindowEx", "CreateIconIndirect", "DestroyCursor", "GetCursor", "GetCapture", "GetClipCursor", "GetSystemMetrics", "GetWindowDisplayAffinity", "SetWindowDisplayAffinity", "GetWindowThreadProcessId", "GetFocus", "GetPointerType", "GetPointerInfo", "GetPointerTouchInfo", "GetPointerPenInfo", "GetPointerFrameInfoHistory", "GetPointerFrameTouchInfoHistory", "GetPointerFramePenInfoHistory", "GetMessageExtraInfo", "InitializeTouchInjection", "InjectTouchInput", "WindowFromPoint" -> _DLL_USER32_DLL ?: SymbolLookup.loaderLookup()
        "GetCurrentThreadId", "GetModuleHandleW", "SetLastError", "GetLastError" -> _DLL_KERNEL32_DLL ?: SymbolLookup.loaderLookup()
        "CreateRectRgn", "CreateCompatibleDC", "CreateCompatibleBitmap", "CreateSolidBrush", "SelectObject", "BitBlt", "GetDIBits", "DeleteDC", "DeleteObject", "CreateBitmap", "CreateDIBSection" -> _DLL_GDI32_DLL ?: SymbolLookup.loaderLookup()
        "DwmSetWindowAttribute", "DwmEnableBlurBehindWindow", "DwmExtendFrameIntoClientArea" -> _DLL_DWMAPI_DLL ?: SymbolLookup.loaderLookup()
        "CoInitializeEx", "CoUninitialize", "CoCreateInstance", "CoTaskMemAlloc", "CoTaskMemFree" -> _DLL_OLE32_DLL ?: SymbolLookup.loaderLookup()
        "CreateInteractionContext", "DestroyInteractionContext", "SetInteractionConfigurationInteractionContext", "GetInteractionConfigurationInteractionContext", "SetPropertyInteractionContext", "GetPropertyInteractionContext", "RegisterOutputCallbackInteractionContext", "ProcessPointerFramesInteractionContext", "AddPointerInteractionContext", "RemovePointerInteractionContext", "ResetInteractionContext" -> _DLL_NINPUT_DLL ?: SymbolLookup.loaderLookup()
        else -> SymbolLookup.loaderLookup()
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong uintptr_t;}
 */
typealias uintptr_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong size_t;}
 */
typealias size_t = Long

/**
 * {@snippet lang=c : typedef LongLong ptrdiff_t;}
 */
typealias ptrdiff_t = Long

/**
 * {@snippet lang=c : typedef LongLong intptr_t;}
 */
typealias intptr_t = Long

/**
 * {@snippet lang=c : typedef Bool __vcrt_bool;}
 */
typealias _vcrt_bool = Boolean

/**
 * {@snippet lang=c : typedef UNSIGNED = Short wchar_t;}
 */
typealias wchar_t = Short

/**
 * NS_ENUM: {@snippet lang=c : enum _EXCEPTION_DISPOSITION}
 */
enum class _EXCEPTION_DISPOSITION(val value: Long) {
    ExceptionContinueExecution(0L), ExceptionContinueSearch(1L), ExceptionNestedException(2L), ExceptionCollidedUnwind(3L);

    companion object {
        fun fromValue(v: Long): _EXCEPTION_DISPOSITION = entries.firstOrNull { it.value == v }
            ?: error("Unknown _EXCEPTION_DISPOSITION value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ULONG;}
 */
typealias ULONG = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short USHORT;}
 */
typealias USHORT = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Char UCHAR;}
 */
typealias UCHAR = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Long DWORD;}
 */
typealias DWORD = Int

/**
 * {@snippet lang=c : typedef Int BOOL;}
 */
typealias BOOL = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char BYTE;}
 */
typealias BYTE = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short WORD;}
 */
typealias WORD = Short

/**
 * {@snippet lang=c : typedef Float FLOAT;}
 */
typealias FLOAT = Float

/**
 * {@snippet lang=c : typedef Int INT;}
 */
typealias INT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UINT;}
 */
typealias UINT = Int

/**
 * {@snippet lang=c : typedef Bool __crt_bool;}
 */
typealias _crt_bool = Boolean

/**
 * {@snippet lang=c : typedef Int errno_t;}
 */
typealias errno_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short wint_t;}
 */
typealias wint_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short wctype_t;}
 */
typealias wctype_t = Short

/**
 * {@snippet lang=c : typedef Long __time32_t;}
 */
typealias _time32_t = Int

/**
 * {@snippet lang=c : typedef LongLong __time64_t;}
 */
typealias _time64_t = Long

/**
 * {@snippet lang=c : typedef LongLong time_t;}
 */
typealias time_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong rsize_t;}
 */
typealias rsize_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong POINTER_64_INT;}
 */
typealias POINTER_64_INT = Long

/**
 * {@snippet lang=c : typedef SIGNED = Char INT8;}
 */
typealias INT8 = Byte

/**
 * {@snippet lang=c : typedef Short INT16;}
 */
typealias INT16 = Short

/**
 * {@snippet lang=c : typedef Int INT32;}
 */
typealias INT32 = Int

/**
 * {@snippet lang=c : typedef LongLong INT64;}
 */
typealias INT64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Char UINT8;}
 */
typealias UINT8 = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short UINT16;}
 */
typealias UINT16 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UINT32;}
 */
typealias UINT32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong UINT64;}
 */
typealias UINT64 = Long

/**
 * {@snippet lang=c : typedef Int LONG32;}
 */
typealias LONG32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int ULONG32;}
 */
typealias ULONG32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int DWORD32;}
 */
typealias DWORD32 = Int

/**
 * {@snippet lang=c : typedef LongLong INT_PTR;}
 */
typealias INT_PTR = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong UINT_PTR;}
 */
typealias UINT_PTR = Long

/**
 * {@snippet lang=c : typedef LongLong LONG_PTR;}
 */
typealias LONG_PTR = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong ULONG_PTR;}
 */
typealias ULONG_PTR = Long

/**
 * {@snippet lang=c : typedef LongLong SHANDLE_PTR;}
 */
typealias SHANDLE_PTR = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong HANDLE_PTR;}
 */
typealias HANDLE_PTR = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int UHALF_PTR;}
 */
typealias UHALF_PTR = Int

/**
 * {@snippet lang=c : typedef Int HALF_PTR;}
 */
typealias HALF_PTR = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong SIZE_T;}
 */
typealias SIZE_T = Long

/**
 * {@snippet lang=c : typedef LongLong SSIZE_T;}
 */
typealias SSIZE_T = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong DWORD_PTR;}
 */
typealias DWORD_PTR = Long

/**
 * {@snippet lang=c : typedef LongLong LONG64;}
 */
typealias LONG64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong ULONG64;}
 */
typealias ULONG64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong DWORD64;}
 */
typealias DWORD64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong KAFFINITY;}
 */
typealias KAFFINITY = Long

/**
 * {@snippet lang=c : typedef Char CHAR;}
 */
typealias CHAR = Byte

/**
 * {@snippet lang=c : typedef Short SHORT;}
 */
typealias SHORT = Short

/**
 * {@snippet lang=c : typedef Long LONG;}
 */
typealias LONG = Int

/**
 * {@snippet lang=c : typedef WChar WCHAR;}
 */
typealias WCHAR = Char

/**
 * {@snippet lang=c : typedef UNSIGNED = Long UCSCHAR;}
 */
typealias UCSCHAR = Int

/**
 * {@snippet lang=c : typedef Char TCHAR;}
 */
typealias TCHAR = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char TBYTE;}
 */
typealias TBYTE = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char FCHAR;}
 */
typealias FCHAR = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Short FSHORT;}
 */
typealias FSHORT = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Long FLONG;}
 */
typealias FLONG = Int

/**
 * {@snippet lang=c : typedef Long HRESULT;}
 */
typealias HRESULT = Int

/**
 * {@snippet lang=c : typedef Char CCHAR;}
 */
typealias CCHAR = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Long LCID;}
 */
typealias LCID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short LANGID;}
 */
typealias LANGID = Short

/**
 * NS_ENUM: {@snippet lang=c : enum COMPARTMENT_ID}
 */
enum class COMPARTMENT_ID(val value: Long) {
    UNSPECIFIED_COMPARTMENT_ID(0L), DEFAULT_COMPARTMENT_ID(1L);

    companion object {
        fun fromValue(v: Long): COMPARTMENT_ID = entries.firstOrNull { it.value == v }
            ?: error("Unknown COMPARTMENT_ID value: $v")
    }
}

/**
 * {@snippet lang=c : typedef LongLong LONGLONG;}
 */
typealias LONGLONG = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong ULONGLONG;}
 */
typealias ULONGLONG = Long

/**
 * {@snippet lang=c : typedef LongLong USN;}
 */
typealias USN = Long

/**
 * {@snippet lang=c : typedef LongLong RTL_REFERENCE_COUNT;}
 */
typealias RTL_REFERENCE_COUNT = Long

/**
 * {@snippet lang=c : typedef Long RTL_REFERENCE_COUNT32;}
 */
typealias RTL_REFERENCE_COUNT32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong DWORDLONG;}
 */
typealias DWORDLONG = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Char BOOLEAN;}
 */
typealias BOOLEAN = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong KSPIN_LOCK;}
 */
typealias KSPIN_LOCK = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ACCESS_MASK;}
 */
typealias ACCESS_MASK = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _SID_NAME_USE}
 */
enum class _SID_NAME_USE(val value: Long) {
    SidTypeUser(1L), SidTypeGroup(2L), SidTypeDomain(3L), SidTypeAlias(4L), SidTypeWellKnownGroup(5L), SidTypeDeletedAccount(6L), SidTypeInvalid(7L), SidTypeUnknown(8L), SidTypeComputer(9L), SidTypeLabel(10L), SidTypeLogonSession(11L);

    companion object {
        fun fromValue(v: Long): _SID_NAME_USE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SID_NAME_USE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong SID_HASH_ENTRY;}
 */
typealias SID_HASH_ENTRY = Long

/**
 * NS_ENUM: {@snippet lang=c : enum WELL_KNOWN_SID_TYPE}
 */
enum class WELL_KNOWN_SID_TYPE(val value: Long) {
    WinNullSid(0L), WinWorldSid(1L), WinLocalSid(2L), WinCreatorOwnerSid(3L), WinCreatorGroupSid(4L), WinCreatorOwnerServerSid(5L), WinCreatorGroupServerSid(6L), WinNtAuthoritySid(7L), WinDialupSid(8L), WinNetworkSid(9L), WinBatchSid(10L), WinInteractiveSid(11L), WinServiceSid(12L), WinAnonymousSid(13L), WinProxySid(14L), WinEnterpriseControllersSid(15L), WinSelfSid(16L), WinAuthenticatedUserSid(17L), WinRestrictedCodeSid(18L), WinTerminalServerSid(19L), WinRemoteLogonIdSid(20L), WinLogonIdsSid(21L), WinLocalSystemSid(22L), WinLocalServiceSid(23L), WinNetworkServiceSid(24L), WinBuiltinDomainSid(25L), WinBuiltinAdministratorsSid(26L), WinBuiltinUsersSid(27L), WinBuiltinGuestsSid(28L), WinBuiltinPowerUsersSid(29L), WinBuiltinAccountOperatorsSid(30L), WinBuiltinSystemOperatorsSid(31L), WinBuiltinPrintOperatorsSid(32L), WinBuiltinBackupOperatorsSid(33L), WinBuiltinReplicatorSid(34L), WinBuiltinPreWindows2000CompatibleAccessSid(35L), WinBuiltinRemoteDesktopUsersSid(36L), WinBuiltinNetworkConfigurationOperatorsSid(37L), WinAccountAdministratorSid(38L), WinAccountGuestSid(39L), WinAccountKrbtgtSid(40L), WinAccountDomainAdminsSid(41L), WinAccountDomainUsersSid(42L), WinAccountDomainGuestsSid(43L), WinAccountComputersSid(44L), WinAccountControllersSid(45L), WinAccountCertAdminsSid(46L), WinAccountSchemaAdminsSid(47L), WinAccountEnterpriseAdminsSid(48L), WinAccountPolicyAdminsSid(49L), WinAccountRasAndIasServersSid(50L), WinNTLMAuthenticationSid(51L), WinDigestAuthenticationSid(52L), WinSChannelAuthenticationSid(53L), WinThisOrganizationSid(54L), WinOtherOrganizationSid(55L), WinBuiltinIncomingForestTrustBuildersSid(56L), WinBuiltinPerfMonitoringUsersSid(57L), WinBuiltinPerfLoggingUsersSid(58L), WinBuiltinAuthorizationAccessSid(59L), WinBuiltinTerminalServerLicenseServersSid(60L), WinBuiltinDCOMUsersSid(61L), WinBuiltinIUsersSid(62L), WinIUserSid(63L), WinBuiltinCryptoOperatorsSid(64L), WinUntrustedLabelSid(65L), WinLowLabelSid(66L), WinMediumLabelSid(67L), WinHighLabelSid(68L), WinSystemLabelSid(69L), WinWriteRestrictedCodeSid(70L), WinCreatorOwnerRightsSid(71L), WinCacheablePrincipalsGroupSid(72L), WinNonCacheablePrincipalsGroupSid(73L), WinEnterpriseReadonlyControllersSid(74L), WinAccountReadonlyControllersSid(75L), WinBuiltinEventLogReadersGroup(76L), WinNewEnterpriseReadonlyControllersSid(77L), WinBuiltinCertSvcDComAccessGroup(78L), WinMediumPlusLabelSid(79L), WinLocalLogonSid(80L), WinConsoleLogonSid(81L), WinThisOrganizationCertificateSid(82L), WinApplicationPackageAuthoritySid(83L), WinBuiltinAnyPackageSid(84L), WinCapabilityInternetClientSid(85L), WinCapabilityInternetClientServerSid(86L), WinCapabilityPrivateNetworkClientServerSid(87L), WinCapabilityPicturesLibrarySid(88L), WinCapabilityVideosLibrarySid(89L), WinCapabilityMusicLibrarySid(90L), WinCapabilityDocumentsLibrarySid(91L), WinCapabilitySharedUserCertificatesSid(92L), WinCapabilityEnterpriseAuthenticationSid(93L), WinCapabilityRemovableStorageSid(94L), WinBuiltinRDSRemoteAccessServersSid(95L), WinBuiltinRDSEndpointServersSid(96L), WinBuiltinRDSManagementServersSid(97L), WinUserModeDriversSid(98L), WinBuiltinHyperVAdminsSid(99L), WinAccountCloneableControllersSid(100L), WinBuiltinAccessControlAssistanceOperatorsSid(101L), WinBuiltinRemoteManagementUsersSid(102L), WinAuthenticationAuthorityAssertedSid(103L), WinAuthenticationServiceAssertedSid(104L), WinLocalAccountSid(105L), WinLocalAccountAndAdministratorSid(106L), WinAccountProtectedUsersSid(107L), WinCapabilityAppointmentsSid(108L), WinCapabilityContactsSid(109L), WinAccountDefaultSystemManagedSid(110L), WinBuiltinDefaultSystemManagedGroupSid(111L), WinBuiltinStorageReplicaAdminsSid(112L), WinAccountKeyAdminsSid(113L), WinAccountEnterpriseKeyAdminsSid(114L), WinAuthenticationKeyTrustSid(115L), WinAuthenticationKeyPropertyMFASid(116L), WinAuthenticationKeyPropertyAttestationSid(117L), WinAuthenticationFreshKeyAuthSid(118L), WinBuiltinDeviceOwnersSid(119L), WinBuiltinUserModeHardwareOperatorsSid(120L), WinBuiltinOpenSSHUsersSid(121L), WinBuiltinCUAUsersSid(122L);

    companion object {
        fun fromValue(v: Long): WELL_KNOWN_SID_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown WELL_KNOWN_SID_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _ACL_INFORMATION_CLASS}
 */
enum class _ACL_INFORMATION_CLASS(val value: Long) {
    AclRevisionInformation(1L), AclSizeInformation(2L);

    companion object {
        fun fromValue(v: Long): _ACL_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _ACL_INFORMATION_CLASS value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Short SECURITY_DESCRIPTOR_CONTROL;}
 */
typealias SECURITY_DESCRIPTOR_CONTROL = Short

/**
 * NS_ENUM: {@snippet lang=c : enum _AUDIT_EVENT_TYPE}
 */
enum class _AUDIT_EVENT_TYPE(val value: Long) {
    AuditEventObjectAccess(0L), AuditEventDirectoryServiceAccess(1L);

    companion object {
        fun fromValue(v: Long): _AUDIT_EVENT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _AUDIT_EVENT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _ACCESS_REASON_TYPE}
 */
enum class _ACCESS_REASON_TYPE(val value: Long) {
    AccessReasonNone(0L), AccessReasonAllowedAce(65536L), AccessReasonDeniedAce(131072L), AccessReasonAllowedParentAce(196608L), AccessReasonDeniedParentAce(262144L), AccessReasonNotGrantedByCape(327680L), AccessReasonNotGrantedByParentCape(393216L), AccessReasonNotGrantedToAppContainer(458752L), AccessReasonMissingPrivilege(1048576L), AccessReasonFromPrivilege(2097152L), AccessReasonIntegrityLevel(3145728L), AccessReasonOwnership(4194304L), AccessReasonNullDacl(5242880L), AccessReasonEmptyDacl(6291456L), AccessReasonNoSD(7340032L), AccessReasonNoGrant(8388608L), AccessReasonTrustLabel(9437184L), AccessReasonFilterAce(10485760L);

    companion object {
        fun fromValue(v: Long): _ACCESS_REASON_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _ACCESS_REASON_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long ACCESS_REASON;}
 */
typealias ACCESS_REASON = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _SECURITY_IMPERSONATION_LEVEL}
 */
enum class _SECURITY_IMPERSONATION_LEVEL(val value: Long) {
    SecurityAnonymous(0L), SecurityIdentification(1L), SecurityImpersonation(2L), SecurityDelegation(3L);

    companion object {
        fun fromValue(v: Long): _SECURITY_IMPERSONATION_LEVEL = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SECURITY_IMPERSONATION_LEVEL value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TOKEN_TYPE}
 */
enum class _TOKEN_TYPE(val value: Long) {
    TokenPrimary(1L), TokenImpersonation(2L);

    companion object {
        fun fromValue(v: Long): _TOKEN_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TOKEN_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TOKEN_ELEVATION_TYPE}
 */
enum class _TOKEN_ELEVATION_TYPE(val value: Long) {
    TokenElevationTypeDefault(1L), TokenElevationTypeFull(2L), TokenElevationTypeLimited(3L);

    companion object {
        fun fromValue(v: Long): _TOKEN_ELEVATION_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TOKEN_ELEVATION_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TOKEN_INFORMATION_CLASS}
 */
enum class _TOKEN_INFORMATION_CLASS(val value: Long) {
    TokenUser(1L), TokenGroups(2L), TokenPrivileges(3L), TokenOwner(4L), TokenPrimaryGroup(5L), TokenDefaultDacl(6L), TokenSource(7L), TokenType(8L), TokenImpersonationLevel(9L), TokenStatistics(10L), TokenRestrictedSids(11L), TokenSessionId(12L), TokenGroupsAndPrivileges(13L), TokenSessionReference(14L), TokenSandBoxInert(15L), TokenAuditPolicy(16L), TokenOrigin(17L), TokenElevationType(18L), TokenLinkedToken(19L), TokenElevation(20L), TokenHasRestrictions(21L), TokenAccessInformation(22L), TokenVirtualizationAllowed(23L), TokenVirtualizationEnabled(24L), TokenIntegrityLevel(25L), TokenUIAccess(26L), TokenMandatoryPolicy(27L), TokenLogonSid(28L), TokenIsAppContainer(29L), TokenCapabilities(30L), TokenAppContainerSid(31L), TokenAppContainerNumber(32L), TokenUserClaimAttributes(33L), TokenDeviceClaimAttributes(34L), TokenRestrictedUserClaimAttributes(35L), TokenRestrictedDeviceClaimAttributes(36L), TokenDeviceGroups(37L), TokenRestrictedDeviceGroups(38L), TokenSecurityAttributes(39L), TokenIsRestricted(40L), TokenProcessTrustLevel(41L), TokenPrivateNameSpace(42L), TokenSingletonAttributes(43L), TokenBnoIsolation(44L), TokenChildProcessFlags(45L), TokenIsLessPrivilegedAppContainer(46L), TokenIsSandboxed(47L), TokenIsAppSilo(48L), TokenLoggingInformation(49L), TokenLearningMode(50L), TokenIsSystemManagedAdmin(51L), TokenIsInstaller(52L), MaxTokenInfoClass(53L);

    companion object {
        fun fromValue(v: Long): _TOKEN_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TOKEN_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _MANDATORY_LEVEL}
 */
enum class _MANDATORY_LEVEL(val value: Long) {
    MandatoryLevelUntrusted(0L), MandatoryLevelLow(1L), MandatoryLevelMedium(2L), MandatoryLevelHigh(3L), MandatoryLevelSystem(4L), MandatoryLevelSecureProcess(5L), MandatoryLevelCount(6L);

    companion object {
        fun fromValue(v: Long): _MANDATORY_LEVEL = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MANDATORY_LEVEL value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Char SECURITY_CONTEXT_TRACKING_MODE;}
 */
typealias SECURITY_CONTEXT_TRACKING_MODE = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Long SECURITY_INFORMATION;}
 */
typealias SECURITY_INFORMATION = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char SE_SIGNING_LEVEL;}
 */
typealias SE_SIGNING_LEVEL = Byte

/**
 * NS_ENUM: {@snippet lang=c : enum _SE_IMAGE_SIGNATURE_TYPE}
 */
enum class _SE_IMAGE_SIGNATURE_TYPE(val value: Long) {
    SeImageSignatureNone(0L), SeImageSignatureEmbedded(1L), SeImageSignatureCache(2L), SeImageSignatureCatalogCached(3L), SeImageSignatureCatalogNotCached(4L), SeImageSignatureCatalogHint(5L), SeImageSignaturePackageCatalog(6L), SeImageSignaturePplMitigated(7L);

    companion object {
        fun fromValue(v: Long): _SE_IMAGE_SIGNATURE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SE_IMAGE_SIGNATURE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _HARDWARE_COUNTER_TYPE}
 */
enum class _HARDWARE_COUNTER_TYPE(val value: Long) {
    PMCCounter(0L), MaxHardwareCounterType(1L);

    companion object {
        fun fromValue(v: Long): _HARDWARE_COUNTER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _HARDWARE_COUNTER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _PROCESS_MITIGATION_POLICY}
 */
enum class _PROCESS_MITIGATION_POLICY(val value: Long) {
    ProcessDEPPolicy(0L), ProcessASLRPolicy(1L), ProcessDynamicCodePolicy(2L), ProcessStrictHandleCheckPolicy(3L), ProcessSystemCallDisablePolicy(4L), ProcessMitigationOptionsMask(5L), ProcessExtensionPointDisablePolicy(6L), ProcessControlFlowGuardPolicy(7L), ProcessSignaturePolicy(8L), ProcessFontDisablePolicy(9L), ProcessImageLoadPolicy(10L), ProcessSystemCallFilterPolicy(11L), ProcessPayloadRestrictionPolicy(12L), ProcessChildProcessPolicy(13L), ProcessSideChannelIsolationPolicy(14L), ProcessUserShadowStackPolicy(15L), ProcessRedirectionTrustPolicy(16L), ProcessUserPointerAuthPolicy(17L), ProcessSEHOPPolicy(18L), ProcessActivationContextTrustPolicy(19L), MaxProcessMitigationPolicy(20L);

    companion object {
        fun fromValue(v: Long): _PROCESS_MITIGATION_POLICY = entries.firstOrNull { it.value == v }
            ?: error("Unknown _PROCESS_MITIGATION_POLICY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _JOBOBJECT_RATE_CONTROL_TOLERANCE}
 */
enum class _JOBOBJECT_RATE_CONTROL_TOLERANCE(val value: Long) {
    ToleranceLow(1L), ToleranceMedium(2L), ToleranceHigh(3L);

    companion object {
        fun fromValue(v: Long): _JOBOBJECT_RATE_CONTROL_TOLERANCE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _JOBOBJECT_RATE_CONTROL_TOLERANCE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL}
 */
enum class _JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL(val value: Long) {
    ToleranceIntervalShort(1L), ToleranceIntervalMedium(2L), ToleranceIntervalLong(3L);

    companion object {
        fun fromValue(v: Long): _JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL = entries.firstOrNull { it.value == v }
            ?: error("Unknown _JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum JOB_OBJECT_NET_RATE_CONTROL_FLAGS}
 */
enum class JOB_OBJECT_NET_RATE_CONTROL_FLAGS(val value: Long) {
    JOB_OBJECT_NET_RATE_CONTROL_ENABLE(1L), JOB_OBJECT_NET_RATE_CONTROL_MAX_BANDWIDTH(2L), JOB_OBJECT_NET_RATE_CONTROL_DSCP_TAG(4L), JOB_OBJECT_NET_RATE_CONTROL_VALID_FLAGS(7L);

    companion object {
        fun fromValue(v: Long): JOB_OBJECT_NET_RATE_CONTROL_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown JOB_OBJECT_NET_RATE_CONTROL_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum JOB_OBJECT_IO_RATE_CONTROL_FLAGS}
 */
enum class JOB_OBJECT_IO_RATE_CONTROL_FLAGS(val value: Long) {
    JOB_OBJECT_IO_RATE_CONTROL_ENABLE(1L), JOB_OBJECT_IO_RATE_CONTROL_STANDALONE_VOLUME(2L), JOB_OBJECT_IO_RATE_CONTROL_FORCE_UNIT_ACCESS_ALL(4L), JOB_OBJECT_IO_RATE_CONTROL_FORCE_UNIT_ACCESS_ON_SOFT_CAP(8L), JOB_OBJECT_IO_RATE_CONTROL_VALID_FLAGS(15L);

    companion object {
        fun fromValue(v: Long): JOB_OBJECT_IO_RATE_CONTROL_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown JOB_OBJECT_IO_RATE_CONTROL_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS}
 */
enum class JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS(val value: Long) {
    JOBOBJECT_IO_ATTRIBUTION_CONTROL_ENABLE(1L), JOBOBJECT_IO_ATTRIBUTION_CONTROL_DISABLE(2L), JOBOBJECT_IO_ATTRIBUTION_CONTROL_VALID_FLAGS(3L);

    companion object {
        fun fromValue(v: Long): JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _JOBOBJECTINFOCLASS}
 */
enum class _JOBOBJECTINFOCLASS(val value: Long) {
    JobObjectBasicAccountingInformation(1L), JobObjectBasicLimitInformation(2L), JobObjectBasicProcessIdList(3L), JobObjectBasicUIRestrictions(4L), JobObjectSecurityLimitInformation(5L), JobObjectEndOfJobTimeInformation(6L), JobObjectAssociateCompletionPortInformation(7L), JobObjectBasicAndIoAccountingInformation(8L), JobObjectExtendedLimitInformation(9L), JobObjectJobSetInformation(10L), JobObjectGroupInformation(11L), JobObjectNotificationLimitInformation(12L), JobObjectLimitViolationInformation(13L), JobObjectGroupInformationEx(14L), JobObjectCpuRateControlInformation(15L), JobObjectCompletionFilter(16L), JobObjectCompletionCounter(17L), JobObjectReserved1Information(18L), JobObjectReserved2Information(19L), JobObjectReserved3Information(20L), JobObjectReserved4Information(21L), JobObjectReserved5Information(22L), JobObjectReserved6Information(23L), JobObjectReserved7Information(24L), JobObjectReserved8Information(25L), JobObjectReserved9Information(26L), JobObjectReserved10Information(27L), JobObjectReserved11Information(28L), JobObjectReserved12Information(29L), JobObjectReserved13Information(30L), JobObjectReserved14Information(31L), JobObjectNetRateControlInformation(32L), JobObjectNotificationLimitInformation2(33L), JobObjectLimitViolationInformation2(34L), JobObjectCreateSilo(35L), JobObjectSiloBasicInformation(36L), JobObjectReserved15Information(37L), JobObjectReserved16Information(38L), JobObjectReserved17Information(39L), JobObjectReserved18Information(40L), JobObjectReserved19Information(41L), JobObjectReserved20Information(42L), JobObjectReserved21Information(43L), JobObjectReserved22Information(44L), JobObjectReserved23Information(45L), JobObjectReserved24Information(46L), JobObjectReserved25Information(47L), JobObjectReserved26Information(48L), JobObjectReserved27Information(49L), JobObjectReserved28Information(50L), JobObjectNetworkAccountingInformation(51L), JobObjectCpuPartition(52L), MaxJobObjectInfoClass(53L);

    companion object {
        fun fromValue(v: Long): _JOBOBJECTINFOCLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _JOBOBJECTINFOCLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _SERVERSILO_STATE}
 */
enum class _SERVERSILO_STATE(val value: Long) {
    SERVERSILO_INITING(0L), SERVERSILO_STARTED(1L), SERVERSILO_SHUTTING_DOWN(2L), SERVERSILO_TERMINATING(3L), SERVERSILO_TERMINATED(4L);

    companion object {
        fun fromValue(v: Long): _SERVERSILO_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SERVERSILO_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _FIRMWARE_TYPE}
 */
enum class _FIRMWARE_TYPE(val value: Long) {
    FirmwareTypeUnknown(0L), FirmwareTypeBios(1L), FirmwareTypeUefi(2L), FirmwareTypeMax(3L);

    companion object {
        fun fromValue(v: Long): _FIRMWARE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _FIRMWARE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _LOGICAL_PROCESSOR_RELATIONSHIP}
 */
enum class _LOGICAL_PROCESSOR_RELATIONSHIP(val value: Long) {
    RelationProcessorCore(0L), RelationNumaNode(1L), RelationCache(2L), RelationProcessorPackage(3L), RelationGroup(4L), RelationProcessorDie(5L), RelationNumaNodeEx(6L), RelationProcessorModule(7L), RelationProcessorSharedComputeUnit(8L), RelationAll(65535L);

    companion object {
        fun fromValue(v: Long): _LOGICAL_PROCESSOR_RELATIONSHIP = entries.firstOrNull { it.value == v }
            ?: error("Unknown _LOGICAL_PROCESSOR_RELATIONSHIP value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _PROCESSOR_CACHE_TYPE}
 */
enum class _PROCESSOR_CACHE_TYPE(val value: Long) {
    CacheUnified(0L), CacheInstruction(1L), CacheData(2L), CacheTrace(3L), CacheUnknown(4L);

    companion object {
        fun fromValue(v: Long): _PROCESSOR_CACHE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _PROCESSOR_CACHE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _PROCESSOR_SHARED_COMPUTE_UNIT_TYPE}
 */
enum class _PROCESSOR_SHARED_COMPUTE_UNIT_TYPE(val value: Long) {
    SharedComputeUnitArm64SMCU(0L);

    companion object {
        fun fromValue(v: Long): _PROCESSOR_SHARED_COMPUTE_UNIT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _PROCESSOR_SHARED_COMPUTE_UNIT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _CPU_SET_INFORMATION_TYPE}
 */
enum class _CPU_SET_INFORMATION_TYPE(val value: Long) {
    CpuSetInformation(0L);

    companion object {
        fun fromValue(v: Long): _CPU_SET_INFORMATION_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _CPU_SET_INFORMATION_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _RUNTIME_REPORT_TYPE}
 */
enum class _RUNTIME_REPORT_TYPE(val value: Long) {
    RuntimeReportTypeDriver(0L), RuntimeReportTypeCodeIntegrity(1L), RuntimeReportTypeMax(2L);

    companion object {
        fun fromValue(v: Long): _RUNTIME_REPORT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RUNTIME_REPORT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum MEM_EXTENDED_PARAMETER_TYPE}
 */
enum class MEM_EXTENDED_PARAMETER_TYPE(val value: Long) {
    MemExtendedParameterInvalidType(0L), MemExtendedParameterAddressRequirements(1L), MemExtendedParameterNumaNode(2L), MemExtendedParameterPartitionHandle(3L), MemExtendedParameterUserPhysicalHandle(4L), MemExtendedParameterAttributeFlags(5L), MemExtendedParameterImageMachine(6L), MemExtendedParameterMax(7L);

    companion object {
        fun fromValue(v: Long): MEM_EXTENDED_PARAMETER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown MEM_EXTENDED_PARAMETER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _MEM_DEDICATED_ATTRIBUTE_TYPE}
 */
enum class _MEM_DEDICATED_ATTRIBUTE_TYPE(val value: Long) {
    MemDedicatedAttributeReadBandwidth(0L), MemDedicatedAttributeReadLatency(1L), MemDedicatedAttributeWriteBandwidth(2L), MemDedicatedAttributeWriteLatency(3L), MemDedicatedAttributeMax(4L);

    companion object {
        fun fromValue(v: Long): _MEM_DEDICATED_ATTRIBUTE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MEM_DEDICATED_ATTRIBUTE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum MEM_SECTION_EXTENDED_PARAMETER_TYPE}
 */
enum class MEM_SECTION_EXTENDED_PARAMETER_TYPE(val value: Long) {
    MemSectionExtendedParameterInvalidType(0L), MemSectionExtendedParameterUserPhysicalFlags(1L), MemSectionExtendedParameterNumaNode(2L), MemSectionExtendedParameterSigningLevel(3L), MemSectionExtendedParameterAttributeFlags(4L), MemSectionExtendedParameterMax(5L);

    companion object {
        fun fromValue(v: Long): MEM_SECTION_EXTENDED_PARAMETER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown MEM_SECTION_EXTENDED_PARAMETER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _SharedVirtualDiskSupportType}
 */
enum class _SharedVirtualDiskSupportType(val value: Long) {
    SharedVirtualDisksUnsupported(0L), SharedVirtualDisksSupported(1L), SharedVirtualDiskSnapshotsSupported(3L), SharedVirtualDiskCDPSnapshotsSupported(7L);

    companion object {
        fun fromValue(v: Long): _SharedVirtualDiskSupportType = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SharedVirtualDiskSupportType value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _SharedVirtualDiskHandleState}
 */
enum class _SharedVirtualDiskHandleState(val value: Long) {
    SharedVirtualDiskHandleStateNone(0L), SharedVirtualDiskHandleStateFileShared(1L), SharedVirtualDiskHandleStateHandleShared(3L);

    companion object {
        fun fromValue(v: Long): _SharedVirtualDiskHandleState = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SharedVirtualDiskHandleState value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _SYSTEM_POWER_STATE}
 */
enum class _SYSTEM_POWER_STATE(val value: Long) {
    PowerSystemUnspecified(0L), PowerSystemWorking(1L), PowerSystemSleeping1(2L), PowerSystemSleeping2(3L), PowerSystemSleeping3(4L), PowerSystemHibernate(5L), PowerSystemShutdown(6L), PowerSystemMaximum(7L);

    companion object {
        fun fromValue(v: Long): _SYSTEM_POWER_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SYSTEM_POWER_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum POWER_ACTION}
 */
enum class POWER_ACTION(val value: Long) {
    PowerActionNone(0L), PowerActionReserved(1L), PowerActionSleep(2L), PowerActionHibernate(3L), PowerActionShutdown(4L), PowerActionShutdownReset(5L), PowerActionShutdownOff(6L), PowerActionWarmEject(7L), PowerActionDisplayOff(8L);

    companion object {
        fun fromValue(v: Long): POWER_ACTION = entries.firstOrNull { it.value == v }
            ?: error("Unknown POWER_ACTION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _DEVICE_POWER_STATE}
 */
enum class _DEVICE_POWER_STATE(val value: Long) {
    PowerDeviceUnspecified(0L), PowerDeviceD0(1L), PowerDeviceD1(2L), PowerDeviceD2(3L), PowerDeviceD3(4L), PowerDeviceMaximum(5L);

    companion object {
        fun fromValue(v: Long): _DEVICE_POWER_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _DEVICE_POWER_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _MONITOR_DISPLAY_STATE}
 */
enum class _MONITOR_DISPLAY_STATE(val value: Long) {
    PowerMonitorOff(0L), PowerMonitorOn(1L), PowerMonitorDim(2L);

    companion object {
        fun fromValue(v: Long): _MONITOR_DISPLAY_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MONITOR_DISPLAY_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _USER_ACTIVITY_PRESENCE}
 */
enum class _USER_ACTIVITY_PRESENCE(val value: Long) {
    PowerUserPresent(0L), PowerUserNotPresent(1L), PowerUserInactive(2L), PowerUserMaximum(3L), PowerUserInvalid(3L);

    companion object {
        fun fromValue(v: Long): _USER_ACTIVITY_PRESENCE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _USER_ACTIVITY_PRESENCE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _ENERGY_SAVER_STATUS}
 */
enum class _ENERGY_SAVER_STATUS(val value: Long) {
    ENERGY_SAVER_OFF(0L), ENERGY_SAVER_STANDARD(1L), ENERGY_SAVER_HIGH_SAVINGS(2L);

    companion object {
        fun fromValue(v: Long): _ENERGY_SAVER_STATUS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _ENERGY_SAVER_STATUS value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long EXECUTION_STATE;}
 */
typealias EXECUTION_STATE = Int

/**
 * NS_ENUM: {@snippet lang=c : enum LATENCY_TIME}
 */
enum class LATENCY_TIME(val value: Long) {
    LT_DONT_CARE(0L), LT_LOWEST_LATENCY(1L);

    companion object {
        fun fromValue(v: Long): LATENCY_TIME = entries.firstOrNull { it.value == v }
            ?: error("Unknown LATENCY_TIME value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _POWER_REQUEST_TYPE}
 */
enum class _POWER_REQUEST_TYPE(val value: Long) {
    PowerRequestDisplayRequired(0L), PowerRequestSystemRequired(1L), PowerRequestAwayModeRequired(2L), PowerRequestExecutionRequired(3L);

    companion object {
        fun fromValue(v: Long): _POWER_REQUEST_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _POWER_REQUEST_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum POWER_INFORMATION_LEVEL}
 */
enum class POWER_INFORMATION_LEVEL(val value: Long) {
    SystemPowerPolicyAc(0L), SystemPowerPolicyDc(1L), VerifySystemPolicyAc(2L), VerifySystemPolicyDc(3L), SystemPowerCapabilities(4L), SystemBatteryState(5L), SystemPowerStateHandler(6L), ProcessorStateHandler(7L), SystemPowerPolicyCurrent(8L), AdministratorPowerPolicy(9L), SystemReserveHiberFile(10L), ProcessorInformation(11L), SystemPowerInformation(12L), ProcessorStateHandler2(13L), LastWakeTime(14L), LastSleepTime(15L), SystemExecutionState(16L), SystemPowerStateNotifyHandler(17L), ProcessorPowerPolicyAc(18L), ProcessorPowerPolicyDc(19L), VerifyProcessorPowerPolicyAc(20L), VerifyProcessorPowerPolicyDc(21L), ProcessorPowerPolicyCurrent(22L), SystemPowerStateLogging(23L), SystemPowerLoggingEntry(24L), SetPowerSettingValue(25L), NotifyUserPowerSetting(26L), PowerInformationLevelUnused0(27L), SystemMonitorHiberBootPowerOff(28L), SystemVideoState(29L), TraceApplicationPowerMessage(30L), TraceApplicationPowerMessageEnd(31L), ProcessorPerfStates(32L), ProcessorIdleStates(33L), ProcessorCap(34L), SystemWakeSource(35L), SystemHiberFileInformation(36L), TraceServicePowerMessage(37L), ProcessorLoad(38L), PowerShutdownNotification(39L), MonitorCapabilities(40L), SessionPowerInit(41L), SessionDisplayState(42L), PowerRequestCreate(43L), PowerRequestAction(44L), GetPowerRequestList(45L), ProcessorInformationEx(46L), NotifyUserModeLegacyPowerEvent(47L), GroupPark(48L), ProcessorIdleDomains(49L), WakeTimerList(50L), SystemHiberFileSize(51L), ProcessorIdleStatesHv(52L), ProcessorPerfStatesHv(53L), ProcessorPerfCapHv(54L), ProcessorSetIdle(55L), LogicalProcessorIdling(56L), UserPresence(57L), PowerSettingNotificationName(58L), GetPowerSettingValue(59L), IdleResiliency(60L), SessionRITState(61L), SessionConnectNotification(62L), SessionPowerCleanup(63L), SessionLockState(64L), SystemHiberbootState(65L), PlatformInformation(66L), PdcInvocation(67L), MonitorInvocation(68L), FirmwareTableInformationRegistered(69L), SetShutdownSelectedTime(70L), SuspendResumeInvocation(71L), PlmPowerRequestCreate(72L), ScreenOff(73L), CsDeviceNotification(74L), PlatformRole(75L), LastResumePerformance(76L), DisplayBurst(77L), ExitLatencySamplingPercentage(78L), RegisterSpmPowerSettings(79L), PlatformIdleStates(80L), ProcessorIdleVeto(81L), PlatformIdleVeto(82L), SystemBatteryStatePrecise(83L), ThermalEvent(84L), PowerRequestActionInternal(85L), BatteryDeviceState(86L), PowerInformationInternal(87L), ThermalStandby(88L), SystemHiberFileType(89L), PhysicalPowerButtonPress(90L), QueryPotentialDripsConstraint(91L), EnergyTrackerCreate(92L), EnergyTrackerQuery(93L), UpdateBlackBoxRecorder(94L), SessionAllowExternalDmaDevices(95L), SendSuspendResumeNotification(96L), BlackBoxRecorderDirectAccessBuffer(97L), SystemPowerSourceState(98L), PowerInformationLevelMaximum(99L);

    companion object {
        fun fromValue(v: Long): POWER_INFORMATION_LEVEL = entries.firstOrNull { it.value == v }
            ?: error("Unknown POWER_INFORMATION_LEVEL value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum POWER_USER_PRESENCE_TYPE}
 */
enum class POWER_USER_PRESENCE_TYPE(val value: Long) {
    UserNotPresent(0L), UserPresent(1L), UserUnknown(255L);

    companion object {
        fun fromValue(v: Long): POWER_USER_PRESENCE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown POWER_USER_PRESENCE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum POWER_MONITOR_REQUEST_REASON}
 */
enum class POWER_MONITOR_REQUEST_REASON(val value: Long) {
    MonitorRequestReasonUnknown(0L), MonitorRequestReasonPowerButton(1L), MonitorRequestReasonRemoteConnection(2L), MonitorRequestReasonScMonitorpower(3L), MonitorRequestReasonUserInput(4L), MonitorRequestReasonAcDcDisplayBurst(5L), MonitorRequestReasonUserDisplayBurst(6L), MonitorRequestReasonPoSetSystemState(7L), MonitorRequestReasonSetThreadExecutionState(8L), MonitorRequestReasonFullWake(9L), MonitorRequestReasonSessionUnlock(10L), MonitorRequestReasonScreenOffRequest(11L), MonitorRequestReasonIdleTimeout(12L), MonitorRequestReasonPolicyChange(13L), MonitorRequestReasonSleepButton(14L), MonitorRequestReasonLid(15L), MonitorRequestReasonBatteryCountChange(16L), MonitorRequestReasonGracePeriod(17L), MonitorRequestReasonPnP(18L), MonitorRequestReasonDP(19L), MonitorRequestReasonSxTransition(20L), MonitorRequestReasonSystemIdle(21L), MonitorRequestReasonNearProximity(22L), MonitorRequestReasonThermalStandby(23L), MonitorRequestReasonResumePdc(24L), MonitorRequestReasonResumeS4(25L), MonitorRequestReasonTerminal(26L), MonitorRequestReasonPdcSignal(27L), MonitorRequestReasonAcDcDisplayBurstSuppressed(28L), MonitorRequestReasonSystemStateEntered(29L), MonitorRequestReasonWinrt(30L), MonitorRequestReasonUserInputKeyboard(31L), MonitorRequestReasonUserInputMouse(32L), MonitorRequestReasonUserInputTouchpad(33L), MonitorRequestReasonUserInputPen(34L), MonitorRequestReasonUserInputAccelerometer(35L), MonitorRequestReasonUserInputHid(36L), MonitorRequestReasonUserInputPoUserPresent(37L), MonitorRequestReasonUserInputSessionSwitch(38L), MonitorRequestReasonUserInputInitialization(39L), MonitorRequestReasonPdcSignalWindowsMobilePwrNotif(40L), MonitorRequestReasonPdcSignalWindowsMobileShell(41L), MonitorRequestReasonPdcSignalHeyCortana(42L), MonitorRequestReasonPdcSignalHolographicShell(43L), MonitorRequestReasonPdcSignalFingerprint(44L), MonitorRequestReasonDirectedDrips(45L), MonitorRequestReasonDim(46L), MonitorRequestReasonBuiltinPanel(47L), MonitorRequestReasonDisplayRequiredUnDim(48L), MonitorRequestReasonBatteryCountChangeSuppressed(49L), MonitorRequestReasonResumeModernStandby(50L), MonitorRequestReasonTerminalInit(51L), MonitorRequestReasonPdcSignalSensorsHumanPresence(52L), MonitorRequestReasonBatteryPreCritical(53L), MonitorRequestReasonUserInputTouch(54L), MonitorRequestReasonRestrictedStandbyBatteryDrain(55L), MonitorRequestReasonDozeRestrictedStandby(56L), MonitorRequestReasonSmartRestrictedStandby(57L), MonitorRequestReasonMax(58L);

    companion object {
        fun fromValue(v: Long): POWER_MONITOR_REQUEST_REASON = entries.firstOrNull { it.value == v }
            ?: error("Unknown POWER_MONITOR_REQUEST_REASON value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _POWER_MONITOR_REQUEST_TYPE}
 */
enum class _POWER_MONITOR_REQUEST_TYPE(val value: Long) {
    MonitorRequestTypeOff(0L), MonitorRequestTypeOnAndPresent(1L), MonitorRequestTypeToggleOn(2L);

    companion object {
        fun fromValue(v: Long): _POWER_MONITOR_REQUEST_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _POWER_MONITOR_REQUEST_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _POWER_LIMIT_TYPES}
 */
enum class _POWER_LIMIT_TYPES(val value: Long) {
    PowerLimitContinuous(0L), PowerLimitType1(0L), PowerLimitBurst(1L), PowerLimitType2(1L), PowerLimitRapid(2L), PowerLimitType3(2L), PowerLimitPreemptive(3L), PowerLimitType4(3L), PowerLimitPreemptiveOffset(4L), PowerLimitTypeMax(5L);

    companion object {
        fun fromValue(v: Long): _POWER_LIMIT_TYPES = entries.firstOrNull { it.value == v }
            ?: error("Unknown _POWER_LIMIT_TYPES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum SYSTEM_POWER_CONDITION}
 */
enum class SYSTEM_POWER_CONDITION(val value: Long) {
    PoAc(0L), PoDc(1L), PoHot(2L), PoConditionMaximum(3L);

    companion object {
        fun fromValue(v: Long): SYSTEM_POWER_CONDITION = entries.firstOrNull { it.value == v }
            ?: error("Unknown SYSTEM_POWER_CONDITION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _POWER_PLATFORM_ROLE}
 */
enum class _POWER_PLATFORM_ROLE(val value: Long) {
    PlatformRoleUnspecified(0L), PlatformRoleDesktop(1L), PlatformRoleMobile(2L), PlatformRoleWorkstation(3L), PlatformRoleEnterpriseServer(4L), PlatformRoleSOHOServer(5L), PlatformRoleAppliancePC(6L), PlatformRolePerformanceServer(7L), PlatformRoleSlate(8L), PlatformRoleMaximum(9L);

    companion object {
        fun fromValue(v: Long): _POWER_PLATFORM_ROLE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _POWER_PLATFORM_ROLE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum POWER_SETTING_ALTITUDE}
 */
enum class POWER_SETTING_ALTITUDE(val value: Long) {
    ALTITUDE_GROUP_POLICY(0L), ALTITUDE_USER(1L), ALTITUDE_RUNTIME_OVERRIDE(2L), ALTITUDE_PROVISIONING(3L), ALTITUDE_OEM_CUSTOMIZATION(4L), ALTITUDE_INTERNAL_OVERRIDE(5L), ALTITUDE_OS_DEFAULT(6L);

    companion object {
        fun fromValue(v: Long): POWER_SETTING_ALTITUDE = entries.firstOrNull { it.value == v }
            ?: error("Unknown POWER_SETTING_ALTITUDE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _HIBERFILE_BUCKET_SIZE}
 */
enum class _HIBERFILE_BUCKET_SIZE(val value: Long) {
    HiberFileBucket1GB(0L), HiberFileBucket2GB(1L), HiberFileBucket4GB(2L), HiberFileBucket8GB(3L), HiberFileBucket16GB(4L), HiberFileBucket32GB(5L), HiberFileBucketUnlimited(6L), HiberFileBucketMax(7L);

    companion object {
        fun fromValue(v: Long): _HIBERFILE_BUCKET_SIZE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _HIBERFILE_BUCKET_SIZE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum IMAGE_AUX_SYMBOL_TYPE}
 */
enum class IMAGE_AUX_SYMBOL_TYPE(val value: Long) {
    IMAGE_AUX_SYMBOL_TYPE_TOKEN_DEF(1L);

    companion object {
        fun fromValue(v: Long): IMAGE_AUX_SYMBOL_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown IMAGE_AUX_SYMBOL_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _IMAGE_HOTSWAP_ARM64_ENDPOINT_INFO_CC_RETURN}
 */
enum class _IMAGE_HOTSWAP_ARM64_ENDPOINT_INFO_CC_RETURN(val value: Long) {
    EndpointReturnTypeNone(0L), EndpointReturnTypeX0(1L), EndpointReturnTypeX0_X1(2L), EndpointReturnTypeX0_X2(3L), EndpointReturnTypeX0_X3(4L), EndpointReturnTypeQ0(5L), EndpointReturnTypeQ0_Q1(6L), EndpointReturnTypeQ0_Q2(7L), EndpointReturnTypeQ0_Q3(8L), EndpointReturnTypeX8(9L);

    companion object {
        fun fromValue(v: Long): _IMAGE_HOTSWAP_ARM64_ENDPOINT_INFO_CC_RETURN = entries.firstOrNull { it.value == v }
            ?: error("Unknown _IMAGE_HOTSWAP_ARM64_ENDPOINT_INFO_CC_RETURN value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _IMAGE_HOTSWAP_X64_ENDPOINT_INFO_CC_REG}
 */
enum class _IMAGE_HOTSWAP_X64_ENDPOINT_INFO_CC_REG(val value: Long) {
    EndpointParamRegNone(0L), EndpointParamRegRAX(1L), EndpointParamRegRCX(2L), EndpointParamRegRDX(3L), EndpointParamRegR8(9L), EndpointParamRegR9(10L), EndpointParamRegXMM0(200L), EndpointParamRegXMM1(201L), EndpointParamRegXMM2(202L), EndpointParamRegXMM3(203L);

    companion object {
        fun fromValue(v: Long): _IMAGE_HOTSWAP_X64_ENDPOINT_INFO_CC_REG = entries.firstOrNull { it.value == v }
            ?: error("Unknown _IMAGE_HOTSWAP_X64_ENDPOINT_INFO_CC_REG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum ARM64_FNPDATA_FLAGS}
 */
enum class ARM64_FNPDATA_FLAGS(val value: Long) {
    PdataRefToFullXdata(0L), PdataPackedUnwindFunction(1L), PdataPackedUnwindFragment(2L);

    companion object {
        fun fromValue(v: Long): ARM64_FNPDATA_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown ARM64_FNPDATA_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum ARM64_FNPDATA_CR}
 */
enum class ARM64_FNPDATA_CR(val value: Long) {
    PdataCrUnchained(0L), PdataCrUnchainedSavedLr(1L), PdataCrChainedWithPac(2L), PdataCrChained(3L);

    companion object {
        fun fromValue(v: Long): ARM64_FNPDATA_CR = entries.firstOrNull { it.value == v }
            ?: error("Unknown ARM64_FNPDATA_CR value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum IMPORT_OBJECT_TYPE}
 */
enum class IMPORT_OBJECT_TYPE(val value: Long) {
    IMPORT_OBJECT_CODE(0L), IMPORT_OBJECT_DATA(1L), IMPORT_OBJECT_CONST(2L);

    companion object {
        fun fromValue(v: Long): IMPORT_OBJECT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown IMPORT_OBJECT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum IMPORT_OBJECT_NAME_TYPE}
 */
enum class IMPORT_OBJECT_NAME_TYPE(val value: Long) {
    IMPORT_OBJECT_ORDINAL(0L), IMPORT_OBJECT_NAME(1L), IMPORT_OBJECT_NAME_NO_PREFIX(2L), IMPORT_OBJECT_NAME_UNDECORATE(3L), IMPORT_OBJECT_NAME_EXPORTAS(4L);

    companion object {
        fun fromValue(v: Long): IMPORT_OBJECT_NAME_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown IMPORT_OBJECT_NAME_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum ReplacesCorHdrNumericDefines}
 */
enum class ReplacesCorHdrNumericDefines(val value: Long) {
    COMIMAGE_FLAGS_ILONLY(1L), COMIMAGE_FLAGS_32BITREQUIRED(2L), COMIMAGE_FLAGS_IL_LIBRARY(4L), COMIMAGE_FLAGS_STRONGNAMESIGNED(8L), COMIMAGE_FLAGS_NATIVE_ENTRYPOINT(16L), COMIMAGE_FLAGS_TRACKDEBUGDATA(65536L), COMIMAGE_FLAGS_32BITPREFERRED(131072L), COR_VERSION_MAJOR_V2(2L), COR_VERSION_MAJOR(2L), COR_VERSION_MINOR(5L), COR_DELETED_NAME_LENGTH(8L), COR_VTABLEGAP_NAME_LENGTH(8L), NATIVE_TYPE_MAX_CB(1L), COR_ILMETHOD_SECT_SMALL_MAX_DATASIZE(255L), IMAGE_COR_MIH_METHODRVA(1L), IMAGE_COR_MIH_EHRVA(2L), IMAGE_COR_MIH_BASICBLOCK(8L), COR_VTABLE_32BIT(1L), COR_VTABLE_64BIT(2L), COR_VTABLE_FROM_UNMANAGED(4L), COR_VTABLE_FROM_UNMANAGED_RETAIN_APPDOMAIN(8L), COR_VTABLE_CALL_MOST_DERIVED(16L), IMAGE_COR_EATJ_THUNK_SIZE(32L), MAX_CLASS_NAME(1024L), MAX_PACKAGE_NAME(1024L);

    companion object {
        fun fromValue(v: Long): ReplacesCorHdrNumericDefines = entries.firstOrNull { it.value == v }
            ?: error("Unknown ReplacesCorHdrNumericDefines value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _RTL_UMS_THREAD_INFO_CLASS}
 */
enum class _RTL_UMS_THREAD_INFO_CLASS(val value: Long) {
    UmsThreadInvalidInfoClass(0L), UmsThreadUserContext(1L), UmsThreadPriority(2L), UmsThreadAffinity(3L), UmsThreadTeb(4L), UmsThreadIsSuspended(5L), UmsThreadIsTerminated(6L), UmsThreadMaxInfoClass(7L);

    companion object {
        fun fromValue(v: Long): _RTL_UMS_THREAD_INFO_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RTL_UMS_THREAD_INFO_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _RTL_UMS_SCHEDULER_REASON}
 */
enum class _RTL_UMS_SCHEDULER_REASON(val value: Long) {
    UmsSchedulerStartup(0L), UmsSchedulerThreadBlocked(1L), UmsSchedulerThreadYield(2L);

    companion object {
        fun fromValue(v: Long): _RTL_UMS_SCHEDULER_REASON = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RTL_UMS_SCHEDULER_REASON value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _OS_DEPLOYEMENT_STATE_VALUES}
 */
enum class _OS_DEPLOYEMENT_STATE_VALUES(val value: Long) {
    OS_DEPLOYMENT_STANDARD(1L), OS_DEPLOYMENT_COMPACT(2L);

    companion object {
        fun fromValue(v: Long): _OS_DEPLOYEMENT_STATE_VALUES = entries.firstOrNull { it.value == v }
            ?: error("Unknown _OS_DEPLOYEMENT_STATE_VALUES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _IMAGE_POLICY_ENTRY_TYPE}
 */
enum class _IMAGE_POLICY_ENTRY_TYPE(val value: Long) {
    ImagePolicyEntryTypeNone(0L), ImagePolicyEntryTypeBool(1L), ImagePolicyEntryTypeInt8(2L), ImagePolicyEntryTypeUInt8(3L), ImagePolicyEntryTypeInt16(4L), ImagePolicyEntryTypeUInt16(5L), ImagePolicyEntryTypeInt32(6L), ImagePolicyEntryTypeUInt32(7L), ImagePolicyEntryTypeInt64(8L), ImagePolicyEntryTypeUInt64(9L), ImagePolicyEntryTypeAnsiString(10L), ImagePolicyEntryTypeUnicodeString(11L), ImagePolicyEntryTypeOverride(12L), ImagePolicyEntryTypeMaximum(13L);

    companion object {
        fun fromValue(v: Long): _IMAGE_POLICY_ENTRY_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _IMAGE_POLICY_ENTRY_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _IMAGE_POLICY_ID}
 */
enum class _IMAGE_POLICY_ID(val value: Long) {
    ImagePolicyIdNone(0L), ImagePolicyIdEtw(1L), ImagePolicyIdDebug(2L), ImagePolicyIdCrashDump(3L), ImagePolicyIdCrashDumpKey(4L), ImagePolicyIdCrashDumpKeyGuid(5L), ImagePolicyIdParentSd(6L), ImagePolicyIdParentSdRev(7L), ImagePolicyIdSvn(8L), ImagePolicyIdDeviceId(9L), ImagePolicyIdCapability(10L), ImagePolicyIdScenarioId(11L), ImagePolicyIdCapabilityOverridable(12L), ImagePolicyIdTrustletIdOverridable(13L), ImagePolicyIdMaximum(14L);

    companion object {
        fun fromValue(v: Long): _IMAGE_POLICY_ID = entries.firstOrNull { it.value == v }
            ?: error("Unknown _IMAGE_POLICY_ID value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _RTL_SYSTEM_GLOBAL_DATA_ID}
 */
enum class _RTL_SYSTEM_GLOBAL_DATA_ID(val value: Long) {
    GlobalDataIdUnknown(0L), GlobalDataIdRngSeedVersion(1L), GlobalDataIdInterruptTime(2L), GlobalDataIdTimeZoneBias(3L), GlobalDataIdImageNumberLow(4L), GlobalDataIdImageNumberHigh(5L), GlobalDataIdTimeZoneId(6L), GlobalDataIdNtMajorVersion(7L), GlobalDataIdNtMinorVersion(8L), GlobalDataIdSystemExpirationDate(9L), GlobalDataIdKdDebuggerEnabled(10L), GlobalDataIdCyclesPerYield(11L), GlobalDataIdSafeBootMode(12L), GlobalDataIdLastSystemRITEventTickCount(13L), GlobalDataIdConsoleSharedDataFlags(14L), GlobalDataIdNtSystemRootDrive(15L), GlobalDataIdQpcBypassEnabled(16L), GlobalDataIdQpcData(17L), GlobalDataIdQpcBias(18L);

    companion object {
        fun fromValue(v: Long): _RTL_SYSTEM_GLOBAL_DATA_ID = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RTL_SYSTEM_GLOBAL_DATA_ID value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _HEAP_INFORMATION_CLASS}
 */
enum class _HEAP_INFORMATION_CLASS(val value: Long) {
    HeapCompatibilityInformation(0L), HeapEnableTerminationOnCorruption(1L), HeapOptimizeResources(3L), HeapTag(7L), HeapMemoryUsageInformation(8L);

    companion object {
        fun fromValue(v: Long): _HEAP_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _HEAP_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _ACTIVATION_CONTEXT_INFO_CLASS}
 */
enum class _ACTIVATION_CONTEXT_INFO_CLASS(val value: Long) {
    ActivationContextBasicInformation(1L), ActivationContextDetailedInformation(2L), AssemblyDetailedInformationInActivationContext(3L), FileInformationInAssemblyOfAssemblyInActivationContext(4L), RunlevelInformationInActivationContext(5L), CompatibilityInformationInActivationContext(6L), ActivationContextManifestResourceName(7L), MaxActivationContextInfoClass(8L), AssemblyDetailedInformationInActivationContxt(3L), FileInformationInAssemblyOfAssemblyInActivationContxt(4L);

    companion object {
        fun fromValue(v: Long): _ACTIVATION_CONTEXT_INFO_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _ACTIVATION_CONTEXT_INFO_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum ACTCTX_REQUESTED_RUN_LEVEL}
 */
enum class ACTCTX_REQUESTED_RUN_LEVEL(val value: Long) {
    ACTCTX_RUN_LEVEL_UNSPECIFIED(0L), ACTCTX_RUN_LEVEL_AS_INVOKER(1L), ACTCTX_RUN_LEVEL_HIGHEST_AVAILABLE(2L), ACTCTX_RUN_LEVEL_REQUIRE_ADMIN(3L), ACTCTX_RUN_LEVEL_NUMBERS(4L);

    companion object {
        fun fromValue(v: Long): ACTCTX_REQUESTED_RUN_LEVEL = entries.firstOrNull { it.value == v }
            ?: error("Unknown ACTCTX_REQUESTED_RUN_LEVEL value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum ACTCTX_COMPATIBILITY_ELEMENT_TYPE}
 */
enum class ACTCTX_COMPATIBILITY_ELEMENT_TYPE(val value: Long) {
    ACTCTX_COMPATIBILITY_ELEMENT_TYPE_UNKNOWN(0L), ACTCTX_COMPATIBILITY_ELEMENT_TYPE_OS(1L), ACTCTX_COMPATIBILITY_ELEMENT_TYPE_MITIGATION(2L), ACTCTX_COMPATIBILITY_ELEMENT_TYPE_MAXVERSIONTESTED(3L);

    companion object {
        fun fromValue(v: Long): ACTCTX_COMPATIBILITY_ELEMENT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown ACTCTX_COMPATIBILITY_ELEMENT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _CM_SERVICE_NODE_TYPE}
 */
enum class _CM_SERVICE_NODE_TYPE(val value: Long) {
    DriverType(1L), FileSystemType(2L), Win32ServiceOwnProcess(16L), Win32ServiceShareProcess(32L), AdapterType(4L), RecognizerType(8L);

    companion object {
        fun fromValue(v: Long): _CM_SERVICE_NODE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _CM_SERVICE_NODE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _CM_SERVICE_LOAD_TYPE}
 */
enum class _CM_SERVICE_LOAD_TYPE(val value: Long) {
    BootLoad(0L), SystemLoad(1L), AutoLoad(2L), DemandLoad(3L), DisableLoad(4L);

    companion object {
        fun fromValue(v: Long): _CM_SERVICE_LOAD_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _CM_SERVICE_LOAD_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _CM_ERROR_CONTROL_TYPE}
 */
enum class _CM_ERROR_CONTROL_TYPE(val value: Long) {
    IgnoreError(0L), NormalError(1L), SevereError(2L), CriticalError(3L);

    companion object {
        fun fromValue(v: Long): _CM_ERROR_CONTROL_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _CM_ERROR_CONTROL_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TAPE_DRIVE_PROBLEM_TYPE}
 */
enum class _TAPE_DRIVE_PROBLEM_TYPE(val value: Long) {
    TapeDriveProblemNone(0L), TapeDriveReadWriteWarning(1L), TapeDriveReadWriteError(2L), TapeDriveReadWarning(3L), TapeDriveWriteWarning(4L), TapeDriveReadError(5L), TapeDriveWriteError(6L), TapeDriveHardwareError(7L), TapeDriveUnsupportedMedia(8L), TapeDriveScsiConnectionError(9L), TapeDriveTimetoClean(10L), TapeDriveCleanDriveNow(11L), TapeDriveMediaLifeExpired(12L), TapeDriveSnappedTape(13L);

    companion object {
        fun fromValue(v: Long): _TAPE_DRIVE_PROBLEM_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TAPE_DRIVE_PROBLEM_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NOTIFICATION_MASK;}
 */
typealias NOTIFICATION_MASK = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long SAVEPOINT_ID;}
 */
typealias SAVEPOINT_ID = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _TRANSACTION_OUTCOME}
 */
enum class _TRANSACTION_OUTCOME(val value: Long) {
    TransactionOutcomeUndetermined(1L), TransactionOutcomeCommitted(2L), TransactionOutcomeAborted(3L);

    companion object {
        fun fromValue(v: Long): _TRANSACTION_OUTCOME = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TRANSACTION_OUTCOME value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TRANSACTION_STATE}
 */
enum class _TRANSACTION_STATE(val value: Long) {
    TransactionStateNormal(1L), TransactionStateIndoubt(2L), TransactionStateCommittedNotify(3L);

    companion object {
        fun fromValue(v: Long): _TRANSACTION_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TRANSACTION_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TRANSACTION_INFORMATION_CLASS}
 */
enum class _TRANSACTION_INFORMATION_CLASS(val value: Long) {
    TransactionBasicInformation(0L), TransactionPropertiesInformation(1L), TransactionEnlistmentInformation(2L), TransactionSuperiorEnlistmentInformation(3L), TransactionBindInformation(4L), TransactionDTCPrivateInformation(5L);

    companion object {
        fun fromValue(v: Long): _TRANSACTION_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TRANSACTION_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TRANSACTIONMANAGER_INFORMATION_CLASS}
 */
enum class _TRANSACTIONMANAGER_INFORMATION_CLASS(val value: Long) {
    TransactionManagerBasicInformation(0L), TransactionManagerLogInformation(1L), TransactionManagerLogPathInformation(2L), TransactionManagerRecoveryInformation(4L), TransactionManagerOnlineProbeInformation(3L), TransactionManagerOldestTransactionInformation(5L);

    companion object {
        fun fromValue(v: Long): _TRANSACTIONMANAGER_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TRANSACTIONMANAGER_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _RESOURCEMANAGER_INFORMATION_CLASS}
 */
enum class _RESOURCEMANAGER_INFORMATION_CLASS(val value: Long) {
    ResourceManagerBasicInformation(0L), ResourceManagerCompletionInformation(1L);

    companion object {
        fun fromValue(v: Long): _RESOURCEMANAGER_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RESOURCEMANAGER_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _ENLISTMENT_INFORMATION_CLASS}
 */
enum class _ENLISTMENT_INFORMATION_CLASS(val value: Long) {
    EnlistmentBasicInformation(0L), EnlistmentRecoveryInformation(1L), EnlistmentCrmInformation(2L);

    companion object {
        fun fromValue(v: Long): _ENLISTMENT_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _ENLISTMENT_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _KTMOBJECT_TYPE}
 */
enum class _KTMOBJECT_TYPE(val value: Long) {
    KTMOBJECT_TRANSACTION(0L), KTMOBJECT_TRANSACTION_MANAGER(1L), KTMOBJECT_RESOURCE_MANAGER(2L), KTMOBJECT_ENLISTMENT(3L), KTMOBJECT_INVALID(4L);

    companion object {
        fun fromValue(v: Long): _KTMOBJECT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _KTMOBJECT_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long TP_VERSION;}
 */
typealias TP_VERSION = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _TP_CALLBACK_PRIORITY}
 */
enum class _TP_CALLBACK_PRIORITY(val value: Long) {
    TP_CALLBACK_PRIORITY_HIGH(0L), TP_CALLBACK_PRIORITY_NORMAL(1L), TP_CALLBACK_PRIORITY_LOW(2L), TP_CALLBACK_PRIORITY_INVALID(3L), TP_CALLBACK_PRIORITY_COUNT(3L);

    companion object {
        fun fromValue(v: Long): _TP_CALLBACK_PRIORITY = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TP_CALLBACK_PRIORITY value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long TP_WAIT_RESULT;}
 */
typealias TP_WAIT_RESULT = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong WPARAM;}
 */
typealias WPARAM = Long

/**
 * {@snippet lang=c : typedef LongLong LPARAM;}
 */
typealias LPARAM = Long

/**
 * {@snippet lang=c : typedef LongLong LRESULT;}
 */
typealias LRESULT = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Short ATOM;}
 */
typealias ATOM = Short

/**
 * {@snippet lang=c : typedef Int HFILE;}
 */
typealias HFILE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long COLORREF;}
 */
typealias COLORREF = Int

/**
 * {@snippet lang=c : STRUCT tagPOINT
 */
class tagPOINT {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("x"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("y")
        ).withByteAlignment(4L).withName("tagPOINT")

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
} // End class

/**
 * NS_ENUM: {@snippet lang=c : enum DPI_AWARENESS}
 */
enum class DPI_AWARENESS(val value: Long) {
    DPI_AWARENESS_INVALID(-1L), DPI_AWARENESS_UNAWARE(0L), DPI_AWARENESS_SYSTEM_AWARE(1L), DPI_AWARENESS_PER_MONITOR_AWARE(2L);

    companion object {
        fun fromValue(v: Long): DPI_AWARENESS = entries.firstOrNull { it.value == v }
            ?: error("Unknown DPI_AWARENESS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DPI_HOSTING_BEHAVIOR}
 */
enum class DPI_HOSTING_BEHAVIOR(val value: Long) {
    DPI_HOSTING_BEHAVIOR_INVALID(-1L), DPI_HOSTING_BEHAVIOR_DEFAULT(0L), DPI_HOSTING_BEHAVIOR_MIXED(1L);

    companion object {
        fun fromValue(v: Long): DPI_HOSTING_BEHAVIOR = entries.firstOrNull { it.value == v }
            ?: error("Unknown DPI_HOSTING_BEHAVIOR value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _FINDEX_INFO_LEVELS}
 */
enum class _FINDEX_INFO_LEVELS(val value: Long) {
    FindExInfoStandard(0L), FindExInfoBasic(1L), FindExInfoMaxInfoLevel(2L);

    companion object {
        fun fromValue(v: Long): _FINDEX_INFO_LEVELS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _FINDEX_INFO_LEVELS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _FINDEX_SEARCH_OPS}
 */
enum class _FINDEX_SEARCH_OPS(val value: Long) {
    FindExSearchNameMatch(0L), FindExSearchLimitToDirectories(1L), FindExSearchLimitToDevices(2L), FindExSearchMaxSearchOp(3L);

    companion object {
        fun fromValue(v: Long): _FINDEX_SEARCH_OPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _FINDEX_SEARCH_OPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _READ_DIRECTORY_NOTIFY_INFORMATION_CLASS}
 */
enum class _READ_DIRECTORY_NOTIFY_INFORMATION_CLASS(val value: Long) {
    ReadDirectoryNotifyInformation(1L), ReadDirectoryNotifyExtendedInformation(2L), ReadDirectoryNotifyFullInformation(3L), ReadDirectoryNotifyMaximumInformation(4L);

    companion object {
        fun fromValue(v: Long): _READ_DIRECTORY_NOTIFY_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _READ_DIRECTORY_NOTIFY_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _GET_FILEEX_INFO_LEVELS}
 */
enum class _GET_FILEEX_INFO_LEVELS(val value: Long) {
    GetFileExInfoStandard(0L), GetFileExMaxInfoLevel(1L);

    companion object {
        fun fromValue(v: Long): _GET_FILEEX_INFO_LEVELS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _GET_FILEEX_INFO_LEVELS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _FILE_INFO_BY_HANDLE_CLASS}
 */
enum class _FILE_INFO_BY_HANDLE_CLASS(val value: Long) {
    FileBasicInfo(0L), FileStandardInfo(1L), FileNameInfo(2L), FileRenameInfo(3L), FileDispositionInfo(4L), FileAllocationInfo(5L), FileEndOfFileInfo(6L), FileStreamInfo(7L), FileCompressionInfo(8L), FileAttributeTagInfo(9L), FileIdBothDirectoryInfo(10L), FileIdBothDirectoryRestartInfo(11L), FileIoPriorityHintInfo(12L), FileRemoteProtocolInfo(13L), FileFullDirectoryInfo(14L), FileFullDirectoryRestartInfo(15L), FileStorageInfo(16L), FileAlignmentInfo(17L), FileIdInfo(18L), FileIdExtdDirectoryInfo(19L), FileIdExtdDirectoryRestartInfo(20L), FileDispositionInfoEx(21L), FileRenameInfoEx(22L), FileCaseSensitiveInfo(23L), FileNormalizedNameInfo(24L), MaximumFileInfoByHandleClass(25L);

    companion object {
        fun fromValue(v: Long): _FILE_INFO_BY_HANDLE_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _FILE_INFO_BY_HANDLE_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _FILE_INFO_BY_NAME_CLASS}
 */
enum class _FILE_INFO_BY_NAME_CLASS(val value: Long) {
    FileStatByNameInfo(0L), FileStatLxByNameInfo(1L), FileCaseSensitiveByNameInfo(2L), FileStatBasicByNameInfo(3L), MaximumFileInfoByNameClass(4L);

    companion object {
        fun fromValue(v: Long): _FILE_INFO_BY_NAME_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _FILE_INFO_BY_NAME_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _STREAM_INFO_LEVELS}
 */
enum class _STREAM_INFO_LEVELS(val value: Long) {
    FindStreamInfoStandard(0L), FindStreamInfoMaxInfoLevel(1L);

    companion object {
        fun fromValue(v: Long): _STREAM_INFO_LEVELS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _STREAM_INFO_LEVELS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DIRECTORY_FLAGS}
 */
enum class DIRECTORY_FLAGS(val value: Long) {
    DIRECTORY_FLAGS_NONE(0L), DIRECTORY_FLAGS_DISALLOW_PATH_REDIRECTS(1L);

    companion object {
        fun fromValue(v: Long): DIRECTORY_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown DIRECTORY_FLAGS value: $v")
    }
}

/**
 * {@snippet lang=c : GetLastError typedef DWORD = UNSIGNED = Long()
 */
private val GetLastError_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private var GetLastError_HANDLE: MethodHandle? = null

fun GetLastError(): Int {
    check(_initialized) { "Win32 GetLastError called before init()" }
    val _handle = GetLastError_HANDLE ?: return 0
    try {
        return _handle.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetLastError Void(typedef DWORD = UNSIGNED = Long)
 */
private val SetLastError_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
private var SetLastError_HANDLE: MethodHandle? = null

fun SetLastError(arg0: Int): Unit {
    check(_initialized) { "Win32 SetLastError called before init()" }
    val _handle = SetLastError_HANDLE ?: return
    try {
        _handle.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        // ignore — null handle on non-Windows
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _QUEUE_USER_APC_FLAGS}
 */
enum class _QUEUE_USER_APC_FLAGS(val value: Long) {
    QUEUE_USER_APC_FLAGS_NONE(0L), QUEUE_USER_APC_FLAGS_SPECIAL_USER_APC(1L), QUEUE_USER_APC_CALLBACK_DATA_CONTEXT(65536L);

    companion object {
        fun fromValue(v: Long): _QUEUE_USER_APC_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _QUEUE_USER_APC_FLAGS value: $v")
    }
}

/**
 * {@snippet lang=c : GetCurrentThreadId typedef DWORD = UNSIGNED = Long()
 */
private val GetCurrentThreadId_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private var GetCurrentThreadId_HANDLE: MethodHandle? = null

fun GetCurrentThreadId(): Int {
    check(_initialized) { "Win32 GetCurrentThreadId called before init()" }
    val _handle = GetCurrentThreadId_HANDLE ?: return 0
    try {
        return _handle.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _THREAD_INFORMATION_CLASS}
 */
enum class _THREAD_INFORMATION_CLASS(val value: Long) {
    ThreadMemoryPriority(0L), ThreadAbsoluteCpuPriority(1L), ThreadDynamicCodePolicy(2L), ThreadPowerThrottling(3L), ThreadInformationClassMax(4L);

    companion object {
        fun fromValue(v: Long): _THREAD_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _THREAD_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _PROCESS_INFORMATION_CLASS}
 */
enum class _PROCESS_INFORMATION_CLASS(val value: Long) {
    ProcessMemoryPriority(0L), ProcessMemoryExhaustionInfo(1L), ProcessAppMemoryInfo(2L), ProcessInPrivateInfo(3L), ProcessPowerThrottling(4L), ProcessReservedValue1(5L), ProcessTelemetryCoverageInfo(6L), ProcessProtectionLevelInfo(7L), ProcessLeapSecondInfo(8L), ProcessMachineTypeInfo(9L), ProcessOverrideSubsequentPrefetchParameter(10L), ProcessMaxOverridePrefetchParameter(11L), ProcessInformationClassMax(12L);

    companion object {
        fun fromValue(v: Long): _PROCESS_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _PROCESS_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _MACHINE_ATTRIBUTES}
 */
enum class _MACHINE_ATTRIBUTES(val value: Long) {
    UserEnabled(1L), KernelEnabled(2L), Wow64Container(4L);

    companion object {
        fun fromValue(v: Long): _MACHINE_ATTRIBUTES = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MACHINE_ATTRIBUTES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _PROCESS_MEMORY_EXHAUSTION_TYPE}
 */
enum class _PROCESS_MEMORY_EXHAUSTION_TYPE(val value: Long) {
    PMETypeFailFastOnCommitFailure(0L), PMETypeMax(1L);

    companion object {
        fun fromValue(v: Long): _PROCESS_MEMORY_EXHAUSTION_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _PROCESS_MEMORY_EXHAUSTION_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _COMPUTER_NAME_FORMAT}
 */
enum class _COMPUTER_NAME_FORMAT(val value: Long) {
    ComputerNameNetBIOS(0L), ComputerNameDnsHostname(1L), ComputerNameDnsDomain(2L), ComputerNameDnsFullyQualified(3L), ComputerNamePhysicalNetBIOS(4L), ComputerNamePhysicalDnsHostname(5L), ComputerNamePhysicalDnsDomain(6L), ComputerNamePhysicalDnsFullyQualified(7L), ComputerNameMax(8L);

    companion object {
        fun fromValue(v: Long): _COMPUTER_NAME_FORMAT = entries.firstOrNull { it.value == v }
            ?: error("Unknown _COMPUTER_NAME_FORMAT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DEVELOPER_DRIVE_ENABLEMENT_STATE}
 */
enum class DEVELOPER_DRIVE_ENABLEMENT_STATE(val value: Long) {
    DeveloperDriveEnablementStateError(0L), DeveloperDriveEnabled(1L), DeveloperDriveDisabledBySystemPolicy(2L), DeveloperDriveDisabledByGroupPolicy(3L);

    companion object {
        fun fromValue(v: Long): DEVELOPER_DRIVE_ENABLEMENT_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown DEVELOPER_DRIVE_ENABLEMENT_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _MEMORY_RESOURCE_NOTIFICATION_TYPE}
 */
enum class _MEMORY_RESOURCE_NOTIFICATION_TYPE(val value: Long) {
    LowMemoryResourceNotification(0L), HighMemoryResourceNotification(1L);

    companion object {
        fun fromValue(v: Long): _MEMORY_RESOURCE_NOTIFICATION_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MEMORY_RESOURCE_NOTIFICATION_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum OFFER_PRIORITY}
 */
enum class OFFER_PRIORITY(val value: Long) {
    VmOfferPriorityVeryLow(1L), VmOfferPriorityLow(2L), VmOfferPriorityBelowNormal(3L), VmOfferPriorityNormal(4L);

    companion object {
        fun fromValue(v: Long): OFFER_PRIORITY = entries.firstOrNull { it.value == v }
            ?: error("Unknown OFFER_PRIORITY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum WIN32_MEMORY_INFORMATION_CLASS}
 */
enum class WIN32_MEMORY_INFORMATION_CLASS(val value: Long) {
    MemoryRegionInfo(0L);

    companion object {
        fun fromValue(v: Long): WIN32_MEMORY_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown WIN32_MEMORY_INFORMATION_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum WIN32_MEMORY_PARTITION_INFORMATION_CLASS}
 */
enum class WIN32_MEMORY_PARTITION_INFORMATION_CLASS(val value: Long) {
    MemoryPartitionInfo(0L), MemoryPartitionDedicatedMemoryInfo(1L);

    companion object {
        fun fromValue(v: Long): WIN32_MEMORY_PARTITION_INFORMATION_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown WIN32_MEMORY_PARTITION_INFORMATION_CLASS value: $v")
    }
}

/**
 * {@snippet lang=c : GetModuleHandleW typedef HMODULE = (Declared(HINSTANCE__))*(typedef LPCWSTR = (UNSIGNED = Short)*)
 */
private val GetModuleHandleW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetModuleHandleW_HANDLE: MethodHandle? = null

fun GetModuleHandleW(arg0: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 GetModuleHandleW called before init()" }
    val _handle = GetModuleHandleW_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum FILE_WRITE_FLAGS}
 */
enum class FILE_WRITE_FLAGS(val value: Long) {
    FILE_WRITE_FLAGS_NONE(0L), FILE_WRITE_FLAGS_WRITE_THROUGH(1L);

    companion object {
        fun fromValue(v: Long): FILE_WRITE_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown FILE_WRITE_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum FILE_FLUSH_MODE}
 */
enum class FILE_FLUSH_MODE(val value: Long) {
    FILE_FLUSH_DEFAULT(0L), FILE_FLUSH_DATA(1L), FILE_FLUSH_MIN_METADATA(2L), FILE_FLUSH_NO_SYNC(3L);

    companion object {
        fun fromValue(v: Long): FILE_FLUSH_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown FILE_FLUSH_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _DEP_SYSTEM_POLICY_TYPE}
 */
enum class _DEP_SYSTEM_POLICY_TYPE(val value: Long) {
    DEPPolicyAlwaysOff(0L), DEPPolicyAlwaysOn(1L), DEPPolicyOptIn(2L), DEPPolicyOptOut(3L), DEPTotalPolicyCount(4L);

    companion object {
        fun fromValue(v: Long): _DEP_SYSTEM_POLICY_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _DEP_SYSTEM_POLICY_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _PROC_THREAD_ATTRIBUTE_NUM}
 */
enum class _PROC_THREAD_ATTRIBUTE_NUM(val value: Long) {
    ProcThreadAttributeParentProcess(0L), ProcThreadAttributeHandleList(2L), ProcThreadAttributeGroupAffinity(3L), ProcThreadAttributePreferredNode(4L), ProcThreadAttributeIdealProcessor(5L), ProcThreadAttributeUmsThread(6L), ProcThreadAttributeMitigationPolicy(7L), ProcThreadAttributeSecurityCapabilities(9L), ProcThreadAttributeProtectionLevel(11L), ProcThreadAttributeJobList(13L), ProcThreadAttributeChildProcessPolicy(14L), ProcThreadAttributeAllApplicationPackagesPolicy(15L), ProcThreadAttributeWin32kFilter(16L), ProcThreadAttributeSafeOpenPromptOriginClaim(17L), ProcThreadAttributeDesktopAppPolicy(18L), ProcThreadAttributePseudoConsole(22L), ProcThreadAttributeMitigationAuditPolicy(24L), ProcThreadAttributeMachineType(25L), ProcThreadAttributeComponentFilter(26L), ProcThreadAttributeEnableOptionalXStateFeatures(27L), ProcThreadAttributeTrustedApp(29L), ProcThreadAttributeSveVectorLength(30L), ProcThreadAttributeSmeVectorLength(31L);

    companion object {
        fun fromValue(v: Long): _PROC_THREAD_ATTRIBUTE_NUM = entries.firstOrNull { it.value == v }
            ?: error("Unknown _PROC_THREAD_ATTRIBUTE_NUM value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _COPYFILE2_MESSAGE_TYPE}
 */
enum class _COPYFILE2_MESSAGE_TYPE(val value: Long) {
    COPYFILE2_CALLBACK_NONE(0L), COPYFILE2_CALLBACK_CHUNK_STARTED(1L), COPYFILE2_CALLBACK_CHUNK_FINISHED(2L), COPYFILE2_CALLBACK_STREAM_STARTED(3L), COPYFILE2_CALLBACK_STREAM_FINISHED(4L), COPYFILE2_CALLBACK_POLL_CONTINUE(5L), COPYFILE2_CALLBACK_ERROR(6L), COPYFILE2_CALLBACK_SPARSE_CHUNK_STARTED(7L), COPYFILE2_CALLBACK_SPARSE_CHUNK_FINISHED(8L), COPYFILE2_CALLBACK_MAX(9L);

    companion object {
        fun fromValue(v: Long): _COPYFILE2_MESSAGE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _COPYFILE2_MESSAGE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _COPYFILE2_MESSAGE_ACTION}
 */
enum class _COPYFILE2_MESSAGE_ACTION(val value: Long) {
    COPYFILE2_PROGRESS_CONTINUE(0L), COPYFILE2_PROGRESS_CANCEL(1L), COPYFILE2_PROGRESS_STOP(2L), COPYFILE2_PROGRESS_QUIET(3L), COPYFILE2_PROGRESS_PAUSE(4L);

    companion object {
        fun fromValue(v: Long): _COPYFILE2_MESSAGE_ACTION = entries.firstOrNull { it.value == v }
            ?: error("Unknown _COPYFILE2_MESSAGE_ACTION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _COPYFILE2_COPY_PHASE}
 */
enum class _COPYFILE2_COPY_PHASE(val value: Long) {
    COPYFILE2_PHASE_NONE(0L), COPYFILE2_PHASE_PREPARE_SOURCE(1L), COPYFILE2_PHASE_PREPARE_DEST(2L), COPYFILE2_PHASE_READ_SOURCE(3L), COPYFILE2_PHASE_WRITE_DESTINATION(4L), COPYFILE2_PHASE_SERVER_COPY(5L), COPYFILE2_PHASE_NAMEGRAFT_COPY(6L), COPYFILE2_PHASE_MAX(7L);

    companion object {
        fun fromValue(v: Long): _COPYFILE2_COPY_PHASE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _COPYFILE2_COPY_PHASE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long OPERATION_ID;}
 */
typealias OPERATION_ID = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _PRIORITY_HINT}
 */
enum class _PRIORITY_HINT(val value: Long) {
    IoPriorityHintVeryLow(0L), IoPriorityHintLow(1L), IoPriorityHintNormal(2L), MaximumIoPriorityHintType(3L);

    companion object {
        fun fromValue(v: Long): _PRIORITY_HINT = entries.firstOrNull { it.value == v }
            ?: error("Unknown _PRIORITY_HINT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _FILE_ID_TYPE}
 */
enum class _FILE_ID_TYPE(val value: Long) {
    FileIdType(0L), ObjectIdType(1L), ExtendedFileIdType(2L), MaximumFileIdType(3L);

    companion object {
        fun fromValue(v: Long): _FILE_ID_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _FILE_ID_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Long LCSCSTYPE;}
 */
typealias LCSCSTYPE = Int

/**
 * {@snippet lang=c : typedef Long LCSGAMUTMATCH;}
 */
typealias LCSGAMUTMATCH = Int

/**
 * {@snippet lang=c : typedef Long FXPT16DOT16;}
 */
typealias FXPT16DOT16 = Int

/**
 * {@snippet lang=c : typedef Long FXPT2DOT30;}
 */
typealias FXPT2DOT30 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Char BCHAR;}
 */
typealias BCHAR = Byte

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY}
 */
enum class DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY(val value: Long) {
    DISPLAYCONFIG_OUTPUT_TECHNOLOGY_OTHER(-1L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_HD15(0L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SVIDEO(1L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_COMPOSITE_VIDEO(2L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_COMPONENT_VIDEO(3L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DVI(4L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_HDMI(5L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_LVDS(6L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_D_JPN(8L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SDI(9L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_EXTERNAL(10L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_EMBEDDED(11L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_UDI_EXTERNAL(12L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_UDI_EMBEDDED(13L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SDTVDONGLE(14L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_MIRACAST(15L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INDIRECT_WIRED(16L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INDIRECT_VIRTUAL(17L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_USB_TUNNEL(18L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INTERNAL(-2147483648L), DISPLAYCONFIG_OUTPUT_TECHNOLOGY_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAYCONFIG_SCANLINE_ORDERING}
 */
enum class DISPLAYCONFIG_SCANLINE_ORDERING(val value: Long) {
    DISPLAYCONFIG_SCANLINE_ORDERING_UNSPECIFIED(0L), DISPLAYCONFIG_SCANLINE_ORDERING_PROGRESSIVE(1L), DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED(2L), DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED_UPPERFIELDFIRST(2L), DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED_LOWERFIELDFIRST(3L), DISPLAYCONFIG_SCANLINE_ORDERING_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): DISPLAYCONFIG_SCANLINE_ORDERING = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAYCONFIG_SCANLINE_ORDERING value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAYCONFIG_SCALING}
 */
enum class DISPLAYCONFIG_SCALING(val value: Long) {
    DISPLAYCONFIG_SCALING_IDENTITY(1L), DISPLAYCONFIG_SCALING_CENTERED(2L), DISPLAYCONFIG_SCALING_STRETCHED(3L), DISPLAYCONFIG_SCALING_ASPECTRATIOCENTEREDMAX(4L), DISPLAYCONFIG_SCALING_CUSTOM(5L), DISPLAYCONFIG_SCALING_PREFERRED(128L), DISPLAYCONFIG_SCALING_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): DISPLAYCONFIG_SCALING = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAYCONFIG_SCALING value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAYCONFIG_ROTATION}
 */
enum class DISPLAYCONFIG_ROTATION(val value: Long) {
    DISPLAYCONFIG_ROTATION_IDENTITY(1L), DISPLAYCONFIG_ROTATION_ROTATE90(2L), DISPLAYCONFIG_ROTATION_ROTATE180(3L), DISPLAYCONFIG_ROTATION_ROTATE270(4L), DISPLAYCONFIG_ROTATION_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): DISPLAYCONFIG_ROTATION = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAYCONFIG_ROTATION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAYCONFIG_MODE_INFO_TYPE}
 */
enum class DISPLAYCONFIG_MODE_INFO_TYPE(val value: Long) {
    DISPLAYCONFIG_MODE_INFO_TYPE_SOURCE(1L), DISPLAYCONFIG_MODE_INFO_TYPE_TARGET(2L), DISPLAYCONFIG_MODE_INFO_TYPE_DESKTOP_IMAGE(3L), DISPLAYCONFIG_MODE_INFO_TYPE_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): DISPLAYCONFIG_MODE_INFO_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAYCONFIG_MODE_INFO_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAYCONFIG_PIXELFORMAT}
 */
enum class DISPLAYCONFIG_PIXELFORMAT(val value: Long) {
    DISPLAYCONFIG_PIXELFORMAT_8BPP(1L), DISPLAYCONFIG_PIXELFORMAT_16BPP(2L), DISPLAYCONFIG_PIXELFORMAT_24BPP(3L), DISPLAYCONFIG_PIXELFORMAT_32BPP(4L), DISPLAYCONFIG_PIXELFORMAT_NONGDI(5L), DISPLAYCONFIG_PIXELFORMAT_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): DISPLAYCONFIG_PIXELFORMAT = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAYCONFIG_PIXELFORMAT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAYCONFIG_TOPOLOGY_ID}
 */
enum class DISPLAYCONFIG_TOPOLOGY_ID(val value: Long) {
    DISPLAYCONFIG_TOPOLOGY_INTERNAL(1L), DISPLAYCONFIG_TOPOLOGY_CLONE(2L), DISPLAYCONFIG_TOPOLOGY_EXTEND(4L), DISPLAYCONFIG_TOPOLOGY_EXTERNAL(8L), DISPLAYCONFIG_TOPOLOGY_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): DISPLAYCONFIG_TOPOLOGY_ID = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAYCONFIG_TOPOLOGY_ID value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAYCONFIG_DEVICE_INFO_TYPE}
 */
enum class DISPLAYCONFIG_DEVICE_INFO_TYPE(val value: Long) {
    DISPLAYCONFIG_DEVICE_INFO_GET_SOURCE_NAME(1L), DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_NAME(2L), DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_PREFERRED_MODE(3L), DISPLAYCONFIG_DEVICE_INFO_GET_ADAPTER_NAME(4L), DISPLAYCONFIG_DEVICE_INFO_SET_TARGET_PERSISTENCE(5L), DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_BASE_TYPE(6L), DISPLAYCONFIG_DEVICE_INFO_GET_SUPPORT_VIRTUAL_RESOLUTION(7L), DISPLAYCONFIG_DEVICE_INFO_SET_SUPPORT_VIRTUAL_RESOLUTION(8L), DISPLAYCONFIG_DEVICE_INFO_GET_ADVANCED_COLOR_INFO(9L), DISPLAYCONFIG_DEVICE_INFO_SET_ADVANCED_COLOR_STATE(10L), DISPLAYCONFIG_DEVICE_INFO_GET_SDR_WHITE_LEVEL(11L), DISPLAYCONFIG_DEVICE_INFO_GET_MONITOR_SPECIALIZATION(12L), DISPLAYCONFIG_DEVICE_INFO_SET_MONITOR_SPECIALIZATION(13L), DISPLAYCONFIG_DEVICE_INFO_SET_RESERVED1(14L), DISPLAYCONFIG_DEVICE_INFO_GET_ADVANCED_COLOR_INFO_2(15L), DISPLAYCONFIG_DEVICE_INFO_SET_HDR_STATE(16L), DISPLAYCONFIG_DEVICE_INFO_SET_WCG_STATE(17L), DISPLAYCONFIG_DEVICE_INFO_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): DISPLAYCONFIG_DEVICE_INFO_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAYCONFIG_DEVICE_INFO_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _DISPLAYCONFIG_COLOR_ENCODING}
 */
enum class _DISPLAYCONFIG_COLOR_ENCODING(val value: Long) {
    DISPLAYCONFIG_COLOR_ENCODING_RGB(0L), DISPLAYCONFIG_COLOR_ENCODING_YCBCR444(1L), DISPLAYCONFIG_COLOR_ENCODING_YCBCR422(2L), DISPLAYCONFIG_COLOR_ENCODING_YCBCR420(3L), DISPLAYCONFIG_COLOR_ENCODING_INTENSITY(4L), DISPLAYCONFIG_COLOR_ENCODING_FORCE_UINT32(-1L);

    companion object {
        fun fromValue(v: Long): _DISPLAYCONFIG_COLOR_ENCODING = entries.firstOrNull { it.value == v }
            ?: error("Unknown _DISPLAYCONFIG_COLOR_ENCODING value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _DISPLAYCONFIG_ADVANCED_COLOR_MODE}
 */
enum class _DISPLAYCONFIG_ADVANCED_COLOR_MODE(val value: Long) {
    DISPLAYCONFIG_ADVANCED_COLOR_MODE_SDR(0L), DISPLAYCONFIG_ADVANCED_COLOR_MODE_WCG(1L), DISPLAYCONFIG_ADVANCED_COLOR_MODE_HDR(2L);

    companion object {
        fun fromValue(v: Long): _DISPLAYCONFIG_ADVANCED_COLOR_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _DISPLAYCONFIG_ADVANCED_COLOR_MODE value: $v")
    }
}

/**
 * {@snippet lang=c : BitBlt typedef BOOL = Int(typedef HDC = (Declared(HDC__))*,Int,Int,Int,Int,typedef HDC = (Declared(HDC__))*,Int,Int,typedef DWORD = UNSIGNED = Long)
 */
private val BitBlt_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var BitBlt_HANDLE: MethodHandle? = null

fun BitBlt(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: MemorySegment, arg6: Int, arg7: Int, arg8: Int): Int {
    check(_initialized) { "Win32 BitBlt called before init()" }
    val _handle = BitBlt_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : CreateBitmap typedef HBITMAP = (Declared(HBITMAP__))*(Int,Int,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int,(Void)*)
 */
private val CreateBitmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var CreateBitmap_HANDLE: MethodHandle? = null

fun CreateBitmap(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 CreateBitmap called before init()" }
    val _handle = CreateBitmap_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : CreateCompatibleBitmap typedef HBITMAP = (Declared(HBITMAP__))*(typedef HDC = (Declared(HDC__))*,Int,Int)
 */
private val CreateCompatibleBitmap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var CreateCompatibleBitmap_HANDLE: MethodHandle? = null

fun CreateCompatibleBitmap(arg0: MemorySegment, arg1: Int, arg2: Int): MemorySegment {
    check(_initialized) { "Win32 CreateCompatibleBitmap called before init()" }
    val _handle = CreateCompatibleBitmap_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : CreateCompatibleDC typedef HDC = (Declared(HDC__))*(typedef HDC = (Declared(HDC__))*)
 */
private val CreateCompatibleDC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var CreateCompatibleDC_HANDLE: MethodHandle? = null

fun CreateCompatibleDC(arg0: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 CreateCompatibleDC called before init()" }
    val _handle = CreateCompatibleDC_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : CreateRectRgn typedef HRGN = (Declared(HRGN__))*(Int,Int,Int,Int)
 */
private val CreateRectRgn_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var CreateRectRgn_HANDLE: MethodHandle? = null

fun CreateRectRgn(arg0: Int, arg1: Int, arg2: Int, arg3: Int): MemorySegment {
    check(_initialized) { "Win32 CreateRectRgn called before init()" }
    val _handle = CreateRectRgn_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : CreateSolidBrush typedef HBRUSH = (Declared(HBRUSH__))*(typedef COLORREF = UNSIGNED = Long)
 */
private val CreateSolidBrush_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var CreateSolidBrush_HANDLE: MethodHandle? = null

fun CreateSolidBrush(arg0: Int): MemorySegment {
    check(_initialized) { "Win32 CreateSolidBrush called before init()" }
    val _handle = CreateSolidBrush_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : DeleteDC typedef BOOL = Int(typedef HDC = (Declared(HDC__))*)
 */
private val DeleteDC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var DeleteDC_HANDLE: MethodHandle? = null

fun DeleteDC(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 DeleteDC called before init()" }
    val _handle = DeleteDC_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : DeleteObject typedef BOOL = Int(typedef HGDIOBJ = (Void)*)
 */
private val DeleteObject_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var DeleteObject_HANDLE: MethodHandle? = null

fun DeleteObject(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 DeleteObject called before init()" }
    val _handle = DeleteObject_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetDIBits Int(typedef HDC = (Declared(HDC__))*,typedef HBITMAP = (Declared(HBITMAP__))*,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int,typedef LPVOID = (Void)*,typedef LPBITMAPINFO = (Declared(tagBITMAPINFO))*,typedef UINT = UNSIGNED = Int)
 */
private val GetDIBits_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetDIBits_HANDLE: MethodHandle? = null

fun GetDIBits(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int, arg4: MemorySegment, arg5: MemorySegment, arg6: Int): Int {
    check(_initialized) { "Win32 GetDIBits called before init()" }
    val _handle = GetDIBits_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SelectObject typedef HGDIOBJ = (Void)*(typedef HDC = (Declared(HDC__))*,typedef HGDIOBJ = (Void)*)
 */
private val SelectObject_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var SelectObject_HANDLE: MethodHandle? = null

fun SelectObject(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 SelectObject called before init()" }
    val _handle = SelectObject_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Short COLOR16;}
 */
typealias COLOR16 = Short

/**
 * {@snippet lang=c : CreateDIBSection typedef HBITMAP = (Declared(HBITMAP__))*(typedef HDC = (Declared(HDC__))*,(typedef BITMAPINFO = Declared(tagBITMAPINFO))*,typedef UINT = UNSIGNED = Int,((Void)*)*,typedef HANDLE = (Void)*,typedef DWORD = UNSIGNED = Long)
 */
private val CreateDIBSection_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var CreateDIBSection_HANDLE: MethodHandle? = null

fun CreateDIBSection(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: MemorySegment, arg4: MemorySegment, arg5: Int): MemorySegment {
    check(_initialized) { "Win32 CreateDIBSection called before init()" }
    val _handle = CreateDIBSection_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : ToUnicodeEx Int(typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int,(typedef BYTE = UNSIGNED = Char)*,typedef LPWSTR = (UNSIGNED = Short)*,Int,typedef UINT = UNSIGNED = Int,typedef HKL = (Declared(HKL__))*)
 */
private val ToUnicodeEx_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var ToUnicodeEx_HANDLE: MethodHandle? = null

fun ToUnicodeEx(arg0: Int, arg1: Int, arg2: MemorySegment, arg3: MemorySegment, arg4: Int, arg5: Int, arg6: MemorySegment): Int {
    check(_initialized) { "Win32 ToUnicodeEx called before init()" }
    val _handle = ToUnicodeEx_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetKeyboardLayout typedef HKL = (Declared(HKL__))*(typedef DWORD = UNSIGNED = Long)
 */
private val GetKeyboardLayout_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetKeyboardLayout_HANDLE: MethodHandle? = null

fun GetKeyboardLayout(arg0: Int): MemorySegment {
    check(_initialized) { "Win32 GetKeyboardLayout called before init()" }
    val _handle = GetKeyboardLayout_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : TrackMouseEvent typedef BOOL = Int(typedef LPTRACKMOUSEEVENT = (Declared(tagTRACKMOUSEEVENT))*)
 */
private val TrackMouseEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var TrackMouseEvent_HANDLE: MethodHandle? = null

fun TrackMouseEvent(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 TrackMouseEvent called before init()" }
    val _handle = TrackMouseEvent_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetMessageW typedef BOOL = Int(typedef LPMSG = (Declared(tagMSG))*,typedef HWND = (Declared(HWND__))*,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int)
 */
private val GetMessageW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var GetMessageW_HANDLE: MethodHandle? = null

fun GetMessageW(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int): Int {
    check(_initialized) { "Win32 GetMessageW called before init()" }
    val _handle = GetMessageW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : TranslateMessage typedef BOOL = Int((typedef MSG = Declared(tagMSG))*)
 */
private val TranslateMessage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var TranslateMessage_HANDLE: MethodHandle? = null

fun TranslateMessage(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 TranslateMessage called before init()" }
    val _handle = TranslateMessage_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : DispatchMessageW typedef LRESULT = LongLong((typedef MSG = Declared(tagMSG))*)
 */
private val DispatchMessageW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private var DispatchMessageW_HANDLE: MethodHandle? = null

fun DispatchMessageW(arg0: MemorySegment): Long {
    check(_initialized) { "Win32 DispatchMessageW called before init()" }
    val _handle = DispatchMessageW_HANDLE ?: return 0L
    try {
        return _handle.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0L
    }
}

/**
 * {@snippet lang=c : PeekMessageW typedef BOOL = Int(typedef LPMSG = (Declared(tagMSG))*,typedef HWND = (Declared(HWND__))*,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int)
 */
private val PeekMessageW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var PeekMessageW_HANDLE: MethodHandle? = null

fun PeekMessageW(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int, arg4: Int): Int {
    check(_initialized) { "Win32 PeekMessageW called before init()" }
    val _handle = PeekMessageW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetMessageExtraInfo typedef LPARAM = LongLong()
 */
private val GetMessageExtraInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private var GetMessageExtraInfo_HANDLE: MethodHandle? = null

fun GetMessageExtraInfo(): Long {
    check(_initialized) { "Win32 GetMessageExtraInfo called before init()" }
    val _handle = GetMessageExtraInfo_HANDLE ?: return 0L
    try {
        return _handle.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0L
    }
}

/**
 * {@snippet lang=c : SendMessageW typedef LRESULT = LongLong(typedef HWND = (Declared(HWND__))*,typedef UINT = UNSIGNED = Int,typedef WPARAM = UNSIGNED = LongLong,typedef LPARAM = LongLong)
 */
private val SendMessageW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private var SendMessageW_HANDLE: MethodHandle? = null

fun SendMessageW(arg0: MemorySegment, arg1: Int, arg2: Long, arg3: Long): Long {
    check(_initialized) { "Win32 SendMessageW called before init()" }
    val _handle = SendMessageW_HANDLE ?: return 0L
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0L
    }
}

/**
 * {@snippet lang=c : PostMessageW typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef UINT = UNSIGNED = Int,typedef WPARAM = UNSIGNED = LongLong,typedef LPARAM = LongLong)
 */
private val PostMessageW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private var PostMessageW_HANDLE: MethodHandle? = null

fun PostMessageW(arg0: MemorySegment, arg1: Int, arg2: Long, arg3: Long): Int {
    check(_initialized) { "Win32 PostMessageW called before init()" }
    val _handle = PostMessageW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : DefWindowProcW typedef LRESULT = LongLong(typedef HWND = (Declared(HWND__))*,typedef UINT = UNSIGNED = Int,typedef WPARAM = UNSIGNED = LongLong,typedef LPARAM = LongLong)
 */
private val DefWindowProcW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private var DefWindowProcW_HANDLE: MethodHandle? = null

fun DefWindowProcW(arg0: MemorySegment, arg1: Int, arg2: Long, arg3: Long): Long {
    check(_initialized) { "Win32 DefWindowProcW called before init()" }
    val _handle = DefWindowProcW_HANDLE ?: return 0L
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0L
    }
}

/**
 * {@snippet lang=c : PostQuitMessage Void(Int)
 */
private val PostQuitMessage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
private var PostQuitMessage_HANDLE: MethodHandle? = null

fun PostQuitMessage(arg0: Int): Unit {
    check(_initialized) { "Win32 PostQuitMessage called before init()" }
    val _handle = PostQuitMessage_HANDLE ?: return
    try {
        _handle.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        // ignore — null handle on non-Windows
    }
}

/**
 * {@snippet lang=c : RegisterClassExW typedef ATOM = UNSIGNED = Short((typedef WNDCLASSEXW = Declared(tagWNDCLASSEXW))*)
 */
private val RegisterClassExW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
private var RegisterClassExW_HANDLE: MethodHandle? = null

fun RegisterClassExW(arg0: MemorySegment): Short {
    check(_initialized) { "Win32 RegisterClassExW called before init()" }
    val _handle = RegisterClassExW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Short
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : CreateWindowExW typedef HWND = (Declared(HWND__))*(typedef DWORD = UNSIGNED = Long,typedef LPCWSTR = (UNSIGNED = Short)*,typedef LPCWSTR = (UNSIGNED = Short)*,typedef DWORD = UNSIGNED = Long,Int,Int,Int,Int,typedef HWND = (Declared(HWND__))*,typedef HMENU = (Declared(HMENU__))*,typedef HINSTANCE = (Declared(HINSTANCE__))*,typedef LPVOID = (Void)*)
 */
private val CreateWindowExW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var CreateWindowExW_HANDLE: MethodHandle? = null

fun CreateWindowExW(arg0: Int, arg1: MemorySegment, arg2: MemorySegment, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: MemorySegment, arg9: MemorySegment, arg10: MemorySegment, arg11: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 CreateWindowExW called before init()" }
    val _handle = CreateWindowExW_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : IsWindow typedef BOOL = Int(typedef HWND = (Declared(HWND__))*)
 */
private val IsWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var IsWindow_HANDLE: MethodHandle? = null

fun IsWindow(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 IsWindow called before init()" }
    val _handle = IsWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : DestroyWindow typedef BOOL = Int(typedef HWND = (Declared(HWND__))*)
 */
private val DestroyWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var DestroyWindow_HANDLE: MethodHandle? = null

fun DestroyWindow(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 DestroyWindow called before init()" }
    val _handle = DestroyWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : ShowWindow typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,Int)
 */
private val ShowWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var ShowWindow_HANDLE: MethodHandle? = null

fun ShowWindow(arg0: MemorySegment, arg1: Int): Int {
    check(_initialized) { "Win32 ShowWindow called before init()" }
    val _handle = ShowWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : FlashWindowEx typedef BOOL = Int(typedef PFLASHWINFO = (Declared(FLASHWINFO))*)
 */
private val FlashWindowEx_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var FlashWindowEx_HANDLE: MethodHandle? = null

fun FlashWindowEx(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 FlashWindowEx called before init()" }
    val _handle = FlashWindowEx_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetWindowPos typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef HWND = (Declared(HWND__))*,Int,Int,Int,Int,typedef UINT = UNSIGNED = Int)
 */
private val SetWindowPos_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var SetWindowPos_HANDLE: MethodHandle? = null

fun SetWindowPos(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Int {
    check(_initialized) { "Win32 SetWindowPos called before init()" }
    val _handle = SetWindowPos_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetWindowDisplayAffinity typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,(typedef DWORD = UNSIGNED = Long)*)
 */
private val GetWindowDisplayAffinity_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetWindowDisplayAffinity_HANDLE: MethodHandle? = null

fun GetWindowDisplayAffinity(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetWindowDisplayAffinity called before init()" }
    val _handle = GetWindowDisplayAffinity_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetWindowDisplayAffinity typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef DWORD = UNSIGNED = Long)
 */
private val SetWindowDisplayAffinity_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var SetWindowDisplayAffinity_HANDLE: MethodHandle? = null

fun SetWindowDisplayAffinity(arg0: MemorySegment, arg1: Int): Int {
    check(_initialized) { "Win32 SetWindowDisplayAffinity called before init()" }
    val _handle = SetWindowDisplayAffinity_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : IsWindowVisible typedef BOOL = Int(typedef HWND = (Declared(HWND__))*)
 */
private val IsWindowVisible_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var IsWindowVisible_HANDLE: MethodHandle? = null

fun IsWindowVisible(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 IsWindowVisible called before init()" }
    val _handle = IsWindowVisible_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : IsIconic typedef BOOL = Int(typedef HWND = (Declared(HWND__))*)
 */
private val IsIconic_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var IsIconic_HANDLE: MethodHandle? = null

fun IsIconic(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 IsIconic called before init()" }
    val _handle = IsIconic_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : IsZoomed typedef BOOL = Int(typedef HWND = (Declared(HWND__))*)
 */
private val IsZoomed_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var IsZoomed_HANDLE: MethodHandle? = null

fun IsZoomed(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 IsZoomed called before init()" }
    val _handle = IsZoomed_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS}
 */
enum class DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS(val value: Long) {
    DCDC_DEFAULT(0L), DCDC_DISABLE_FONT_UPDATE(1L), DCDC_DISABLE_RELAYOUT(2L);

    companion object {
        fun fromValue(v: Long): DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS = entries.firstOrNull { it.value == v }
            ?: error("Unknown DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DIALOG_DPI_CHANGE_BEHAVIORS}
 */
enum class DIALOG_DPI_CHANGE_BEHAVIORS(val value: Long) {
    DDC_DEFAULT(0L), DDC_DISABLE_ALL(1L), DDC_DISABLE_RESIZE(2L), DDC_DISABLE_CONTROL_RELAYOUT(4L);

    companion object {
        fun fromValue(v: Long): DIALOG_DPI_CHANGE_BEHAVIORS = entries.firstOrNull { it.value == v }
            ?: error("Unknown DIALOG_DPI_CHANGE_BEHAVIORS value: $v")
    }
}

/**
 * {@snippet lang=c : GetFocus typedef HWND = (Declared(HWND__))*()
 */
private val GetFocus_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private var GetFocus_HANDLE: MethodHandle? = null

fun GetFocus(): MemorySegment {
    check(_initialized) { "Win32 GetFocus called before init()" }
    val _handle = GetFocus_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : GetKeyState typedef SHORT = Short(Int)
 */
private val GetKeyState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_INT)
private var GetKeyState_HANDLE: MethodHandle? = null

fun GetKeyState(arg0: Int): Short {
    check(_initialized) { "Win32 GetKeyState called before init()" }
    val _handle = GetKeyState_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Short
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetKeyboardState typedef BOOL = Int(typedef PBYTE = (UNSIGNED = Char)*)
 */
private val GetKeyboardState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetKeyboardState_HANDLE: MethodHandle? = null

fun GetKeyboardState(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 GetKeyboardState called before init()" }
    val _handle = GetKeyboardState_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SendInput typedef UINT = UNSIGNED = Int(typedef UINT = UNSIGNED = Int,typedef LPINPUT = (Declared(tagINPUT))*,Int)
 */
private val SendInput_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var SendInput_HANDLE: MethodHandle? = null

fun SendInput(arg0: Int, arg1: MemorySegment, arg2: Int): Int {
    check(_initialized) { "Win32 SendInput called before init()" }
    val _handle = SendInput_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetTouchInputInfo typedef BOOL = Int(typedef HTOUCHINPUT = (Declared(HTOUCHINPUT__))*,typedef UINT = UNSIGNED = Int,typedef PTOUCHINPUT = (Declared(tagTOUCHINPUT))*,Int)
 */
private val GetTouchInputInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetTouchInputInfo_HANDLE: MethodHandle? = null

fun GetTouchInputInfo(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: Int): Int {
    check(_initialized) { "Win32 GetTouchInputInfo called before init()" }
    val _handle = GetTouchInputInfo_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : CloseTouchInputHandle typedef BOOL = Int(typedef HTOUCHINPUT = (Declared(HTOUCHINPUT__))*)
 */
private val CloseTouchInputHandle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var CloseTouchInputHandle_HANDLE: MethodHandle? = null

fun CloseTouchInputHandle(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 CloseTouchInputHandle called before init()" }
    val _handle = CloseTouchInputHandle_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : RegisterTouchWindow typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef ULONG = UNSIGNED = Long)
 */
private val RegisterTouchWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var RegisterTouchWindow_HANDLE: MethodHandle? = null

fun RegisterTouchWindow(arg0: MemorySegment, arg1: Int): Int {
    check(_initialized) { "Win32 RegisterTouchWindow called before init()" }
    val _handle = RegisterTouchWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPOINTER_INPUT_TYPE}
 */
enum class tagPOINTER_INPUT_TYPE(val value: Long) {
    PT_POINTER(1L), PT_TOUCH(2L), PT_PEN(3L), PT_MOUSE(4L), PT_TOUCHPAD(5L);

    companion object {
        fun fromValue(v: Long): tagPOINTER_INPUT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPOINTER_INPUT_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long POINTER_INPUT_TYPE;}
 */
typealias POINTER_INPUT_TYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int POINTER_FLAGS;}
 */
typealias POINTER_FLAGS = Int

/**
 * NS_ENUM: {@snippet lang=c : enum tagPOINTER_BUTTON_CHANGE_TYPE}
 */
enum class tagPOINTER_BUTTON_CHANGE_TYPE(val value: Long) {
    POINTER_CHANGE_NONE(0L), POINTER_CHANGE_FIRSTBUTTON_DOWN(1L), POINTER_CHANGE_FIRSTBUTTON_UP(2L), POINTER_CHANGE_SECONDBUTTON_DOWN(3L), POINTER_CHANGE_SECONDBUTTON_UP(4L), POINTER_CHANGE_THIRDBUTTON_DOWN(5L), POINTER_CHANGE_THIRDBUTTON_UP(6L), POINTER_CHANGE_FOURTHBUTTON_DOWN(7L), POINTER_CHANGE_FOURTHBUTTON_UP(8L), POINTER_CHANGE_FIFTHBUTTON_DOWN(9L), POINTER_CHANGE_FIFTHBUTTON_UP(10L);

    companion object {
        fun fromValue(v: Long): tagPOINTER_BUTTON_CHANGE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPOINTER_BUTTON_CHANGE_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TOUCH_FLAGS;}
 */
typealias TOUCH_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int TOUCH_MASK;}
 */
typealias TOUCH_MASK = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PEN_FLAGS;}
 */
typealias PEN_FLAGS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int PEN_MASK;}
 */
typealias PEN_MASK = Int

/**
 * NS_ENUM: {@snippet lang=c : enum POINTER_FEEDBACK_MODE}
 */
enum class POINTER_FEEDBACK_MODE(val value: Long) {
    POINTER_FEEDBACK_DEFAULT(1L), POINTER_FEEDBACK_INDIRECT(2L), POINTER_FEEDBACK_NONE(3L);

    companion object {
        fun fromValue(v: Long): POINTER_FEEDBACK_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown POINTER_FEEDBACK_MODE value: $v")
    }
}

/**
 * {@snippet lang=c : InitializeTouchInjection typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,typedef DWORD = UNSIGNED = Long)
 */
private val InitializeTouchInjection_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var InitializeTouchInjection_HANDLE: MethodHandle? = null

fun InitializeTouchInjection(arg0: Int, arg1: Int): Int {
    check(_initialized) { "Win32 InitializeTouchInjection called before init()" }
    val _handle = InitializeTouchInjection_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : InjectTouchInput typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,(typedef POINTER_TOUCH_INFO = Declared(tagPOINTER_TOUCH_INFO))*)
 */
private val InjectTouchInput_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var InjectTouchInput_HANDLE: MethodHandle? = null

fun InjectTouchInput(arg0: Int, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 InjectTouchInput called before init()" }
    val _handle = InjectTouchInput_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetPointerType typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,(typedef POINTER_INPUT_TYPE = UNSIGNED = Long)*)
 */
private val GetPointerType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetPointerType_HANDLE: MethodHandle? = null

fun GetPointerType(arg0: Int, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetPointerType called before init()" }
    val _handle = GetPointerType_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetPointerInfo typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,(typedef POINTER_INFO = Declared(tagPOINTER_INFO))*)
 */
private val GetPointerInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetPointerInfo_HANDLE: MethodHandle? = null

fun GetPointerInfo(arg0: Int, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetPointerInfo called before init()" }
    val _handle = GetPointerInfo_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetPointerFrameInfoHistory typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,(typedef UINT32 = UNSIGNED = Int)*,(typedef UINT32 = UNSIGNED = Int)*,(typedef POINTER_INFO = Declared(tagPOINTER_INFO))*)
 */
private val GetPointerFrameInfoHistory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetPointerFrameInfoHistory_HANDLE: MethodHandle? = null

fun GetPointerFrameInfoHistory(arg0: Int, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Int {
    check(_initialized) { "Win32 GetPointerFrameInfoHistory called before init()" }
    val _handle = GetPointerFrameInfoHistory_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetPointerTouchInfo typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,(typedef POINTER_TOUCH_INFO = Declared(tagPOINTER_TOUCH_INFO))*)
 */
private val GetPointerTouchInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetPointerTouchInfo_HANDLE: MethodHandle? = null

fun GetPointerTouchInfo(arg0: Int, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetPointerTouchInfo called before init()" }
    val _handle = GetPointerTouchInfo_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetPointerFrameTouchInfoHistory typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,(typedef UINT32 = UNSIGNED = Int)*,(typedef UINT32 = UNSIGNED = Int)*,(typedef POINTER_TOUCH_INFO = Declared(tagPOINTER_TOUCH_INFO))*)
 */
private val GetPointerFrameTouchInfoHistory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetPointerFrameTouchInfoHistory_HANDLE: MethodHandle? = null

fun GetPointerFrameTouchInfoHistory(arg0: Int, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Int {
    check(_initialized) { "Win32 GetPointerFrameTouchInfoHistory called before init()" }
    val _handle = GetPointerFrameTouchInfoHistory_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetPointerPenInfo typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,(typedef POINTER_PEN_INFO = Declared(tagPOINTER_PEN_INFO))*)
 */
private val GetPointerPenInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetPointerPenInfo_HANDLE: MethodHandle? = null

fun GetPointerPenInfo(arg0: Int, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetPointerPenInfo called before init()" }
    val _handle = GetPointerPenInfo_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetPointerFramePenInfoHistory typedef BOOL = Int(typedef UINT32 = UNSIGNED = Int,(typedef UINT32 = UNSIGNED = Int)*,(typedef UINT32 = UNSIGNED = Int)*,(typedef POINTER_PEN_INFO = Declared(tagPOINTER_PEN_INFO))*)
 */
private val GetPointerFramePenInfoHistory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetPointerFramePenInfoHistory_HANDLE: MethodHandle? = null

fun GetPointerFramePenInfoHistory(arg0: Int, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Int {
    check(_initialized) { "Win32 GetPointerFramePenInfoHistory called before init()" }
    val _handle = GetPointerFramePenInfoHistory_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagFEEDBACK_TYPE}
 */
enum class tagFEEDBACK_TYPE(val value: Long) {
    FEEDBACK_TOUCH_CONTACTVISUALIZATION(1L), FEEDBACK_PEN_BARRELVISUALIZATION(2L), FEEDBACK_PEN_TAP(3L), FEEDBACK_PEN_DOUBLETAP(4L), FEEDBACK_PEN_PRESSANDHOLD(5L), FEEDBACK_PEN_RIGHTTAP(6L), FEEDBACK_TOUCH_TAP(7L), FEEDBACK_TOUCH_DOUBLETAP(8L), FEEDBACK_TOUCH_PRESSANDHOLD(9L), FEEDBACK_TOUCH_RIGHTTAP(10L), FEEDBACK_GESTURE_PRESSANDTAP(11L), FEEDBACK_MAX(-1L);

    companion object {
        fun fromValue(v: Long): tagFEEDBACK_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagFEEDBACK_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : MapVirtualKeyW typedef UINT = UNSIGNED = Int(typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int)
 */
private val MapVirtualKeyW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var MapVirtualKeyW_HANDLE: MethodHandle? = null

fun MapVirtualKeyW(arg0: Int, arg1: Int): Int {
    check(_initialized) { "Win32 MapVirtualKeyW called before init()" }
    val _handle = MapVirtualKeyW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : MapVirtualKeyExW typedef UINT = UNSIGNED = Int(typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int,typedef HKL = (Declared(HKL__))*)
 */
private val MapVirtualKeyExW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var MapVirtualKeyExW_HANDLE: MethodHandle? = null

fun MapVirtualKeyExW(arg0: Int, arg1: Int, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 MapVirtualKeyExW called before init()" }
    val _handle = MapVirtualKeyExW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetCapture typedef HWND = (Declared(HWND__))*()
 */
private val GetCapture_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private var GetCapture_HANDLE: MethodHandle? = null

fun GetCapture(): MemorySegment {
    check(_initialized) { "Win32 GetCapture called before init()" }
    val _handle = GetCapture_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : ReleaseCapture typedef BOOL = Int()
 */
private val ReleaseCapture_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private var ReleaseCapture_HANDLE: MethodHandle? = null

fun ReleaseCapture(): Int {
    check(_initialized) { "Win32 ReleaseCapture called before init()" }
    val _handle = ReleaseCapture_HANDLE ?: return 0
    try {
        return _handle.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : MsgWaitForMultipleObjectsEx typedef DWORD = UNSIGNED = Long(typedef DWORD = UNSIGNED = Long,(typedef HANDLE = (Void)*)*,typedef DWORD = UNSIGNED = Long,typedef DWORD = UNSIGNED = Long,typedef DWORD = UNSIGNED = Long)
 */
private val MsgWaitForMultipleObjectsEx_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var MsgWaitForMultipleObjectsEx_HANDLE: MethodHandle? = null

fun MsgWaitForMultipleObjectsEx(arg0: Int, arg1: MemorySegment, arg2: Int, arg3: Int, arg4: Int): Int {
    check(_initialized) { "Win32 MsgWaitForMultipleObjectsEx called before init()" }
    val _handle = MsgWaitForMultipleObjectsEx_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : EnableWindow typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef BOOL = Int)
 */
private val EnableWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var EnableWindow_HANDLE: MethodHandle? = null

fun EnableWindow(arg0: MemorySegment, arg1: Int): Int {
    check(_initialized) { "Win32 EnableWindow called before init()" }
    val _handle = EnableWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetSystemMetrics Int(Int)
 */
private val GetSystemMetrics_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var GetSystemMetrics_HANDLE: MethodHandle? = null

fun GetSystemMetrics(arg0: Int): Int {
    check(_initialized) { "Win32 GetSystemMetrics called before init()" }
    val _handle = GetSystemMetrics_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetSystemMenu typedef HMENU = (Declared(HMENU__))*(typedef HWND = (Declared(HWND__))*,typedef BOOL = Int)
 */
private val GetSystemMenu_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetSystemMenu_HANDLE: MethodHandle? = null

fun GetSystemMenu(arg0: MemorySegment, arg1: Int): MemorySegment {
    check(_initialized) { "Win32 GetSystemMenu called before init()" }
    val _handle = GetSystemMenu_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : EnableMenuItem typedef BOOL = Int(typedef HMENU = (Declared(HMENU__))*,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int)
 */
private val EnableMenuItem_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var EnableMenuItem_HANDLE: MethodHandle? = null

fun EnableMenuItem(arg0: MemorySegment, arg1: Int, arg2: Int): Int {
    check(_initialized) { "Win32 EnableMenuItem called before init()" }
    val _handle = EnableMenuItem_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : TrackPopupMenu typedef BOOL = Int(typedef HMENU = (Declared(HMENU__))*,typedef UINT = UNSIGNED = Int,Int,Int,Int,typedef HWND = (Declared(HWND__))*,(typedef RECT = Declared(tagRECT))*)
 */
private val TrackPopupMenu_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var TrackPopupMenu_HANDLE: MethodHandle? = null

fun TrackPopupMenu(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: MemorySegment, arg6: MemorySegment): Int {
    check(_initialized) { "Win32 TrackPopupMenu called before init()" }
    val _handle = TrackPopupMenu_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetMenuDefaultItem typedef BOOL = Int(typedef HMENU = (Declared(HMENU__))*,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int)
 */
private val SetMenuDefaultItem_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var SetMenuDefaultItem_HANDLE: MethodHandle? = null

fun SetMenuDefaultItem(arg0: MemorySegment, arg1: Int, arg2: Int): Int {
    check(_initialized) { "Win32 SetMenuDefaultItem called before init()" }
    val _handle = SetMenuDefaultItem_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : UpdateWindow typedef BOOL = Int(typedef HWND = (Declared(HWND__))*)
 */
private val UpdateWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var UpdateWindow_HANDLE: MethodHandle? = null

fun UpdateWindow(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 UpdateWindow called before init()" }
    val _handle = UpdateWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetForegroundWindow typedef HWND = (Declared(HWND__))*()
 */
private val GetForegroundWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private var GetForegroundWindow_HANDLE: MethodHandle? = null

fun GetForegroundWindow(): MemorySegment {
    check(_initialized) { "Win32 GetForegroundWindow called before init()" }
    val _handle = GetForegroundWindow_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : SetForegroundWindow typedef BOOL = Int(typedef HWND = (Declared(HWND__))*)
 */
private val SetForegroundWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var SetForegroundWindow_HANDLE: MethodHandle? = null

fun SetForegroundWindow(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 SetForegroundWindow called before init()" }
    val _handle = SetForegroundWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetDC typedef HDC = (Declared(HDC__))*(typedef HWND = (Declared(HWND__))*)
 */
private val GetDC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetDC_HANDLE: MethodHandle? = null

fun GetDC(arg0: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 GetDC called before init()" }
    val _handle = GetDC_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : ReleaseDC Int(typedef HWND = (Declared(HWND__))*,typedef HDC = (Declared(HDC__))*)
 */
private val ReleaseDC_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var ReleaseDC_HANDLE: MethodHandle? = null

fun ReleaseDC(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 ReleaseDC called before init()" }
    val _handle = ReleaseDC_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : InvalidateRect typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,(typedef RECT = Declared(tagRECT))*,typedef BOOL = Int)
 */
private val InvalidateRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var InvalidateRect_HANDLE: MethodHandle? = null

fun InvalidateRect(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    check(_initialized) { "Win32 InvalidateRect called before init()" }
    val _handle = InvalidateRect_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : ValidateRect typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,(typedef RECT = Declared(tagRECT))*)
 */
private val ValidateRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var ValidateRect_HANDLE: MethodHandle? = null

fun ValidateRect(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 ValidateRect called before init()" }
    val _handle = ValidateRect_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetWindowTextW typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef LPCWSTR = (UNSIGNED = Short)*)
 */
private val SetWindowTextW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var SetWindowTextW_HANDLE: MethodHandle? = null

fun SetWindowTextW(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 SetWindowTextW called before init()" }
    val _handle = SetWindowTextW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetWindowTextW Int(typedef HWND = (Declared(HWND__))*,typedef LPWSTR = (UNSIGNED = Short)*,Int)
 */
private val GetWindowTextW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetWindowTextW_HANDLE: MethodHandle? = null

fun GetWindowTextW(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    check(_initialized) { "Win32 GetWindowTextW called before init()" }
    val _handle = GetWindowTextW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetWindowTextLengthW Int(typedef HWND = (Declared(HWND__))*)
 */
private val GetWindowTextLengthW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetWindowTextLengthW_HANDLE: MethodHandle? = null

fun GetWindowTextLengthW(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 GetWindowTextLengthW called before init()" }
    val _handle = GetWindowTextLengthW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetClientRect typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef LPRECT = (Declared(tagRECT))*)
 */
private val GetClientRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetClientRect_HANDLE: MethodHandle? = null

fun GetClientRect(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetClientRect called before init()" }
    val _handle = GetClientRect_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetWindowRect typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef LPRECT = (Declared(tagRECT))*)
 */
private val GetWindowRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetWindowRect_HANDLE: MethodHandle? = null

fun GetWindowRect(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetWindowRect called before init()" }
    val _handle = GetWindowRect_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : AdjustWindowRectExForDpi typedef BOOL = Int(typedef LPRECT = (Declared(tagRECT))*,typedef DWORD = UNSIGNED = Long,typedef BOOL = Int,typedef DWORD = UNSIGNED = Long,typedef UINT = UNSIGNED = Int)
 */
private val AdjustWindowRectExForDpi_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var AdjustWindowRectExForDpi_HANDLE: MethodHandle? = null

fun AdjustWindowRectExForDpi(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Int {
    check(_initialized) { "Win32 AdjustWindowRectExForDpi called before init()" }
    val _handle = AdjustWindowRectExForDpi_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : ShowCursor Int(typedef BOOL = Int)
 */
private val ShowCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var ShowCursor_HANDLE: MethodHandle? = null

fun ShowCursor(arg0: Int): Int {
    check(_initialized) { "Win32 ShowCursor called before init()" }
    val _handle = ShowCursor_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetCursorPos typedef BOOL = Int(Int,Int)
 */
private val SetCursorPos_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var SetCursorPos_HANDLE: MethodHandle? = null

fun SetCursorPos(arg0: Int, arg1: Int): Int {
    check(_initialized) { "Win32 SetCursorPos called before init()" }
    val _handle = SetCursorPos_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetCursor typedef HCURSOR = (Declared(HICON__))*(typedef HCURSOR = (Declared(HICON__))*)
 */
private val SetCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var SetCursor_HANDLE: MethodHandle? = null

fun SetCursor(arg0: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 SetCursor called before init()" }
    val _handle = SetCursor_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : GetCursorPos typedef BOOL = Int(typedef LPPOINT = (Declared(tagPOINT))*)
 */
private val GetCursorPos_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetCursorPos_HANDLE: MethodHandle? = null

fun GetCursorPos(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 GetCursorPos called before init()" }
    val _handle = GetCursorPos_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetClipCursor typedef BOOL = Int(typedef LPRECT = (Declared(tagRECT))*)
 */
private val GetClipCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetClipCursor_HANDLE: MethodHandle? = null

fun GetClipCursor(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 GetClipCursor called before init()" }
    val _handle = GetClipCursor_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetCursor typedef HCURSOR = (Declared(HICON__))*()
 */
private val GetCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private var GetCursor_HANDLE: MethodHandle? = null

fun GetCursor(): MemorySegment {
    check(_initialized) { "Win32 GetCursor called before init()" }
    val _handle = GetCursor_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : ClientToScreen typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef LPPOINT = (Declared(tagPOINT))*)
 */
private val ClientToScreen_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var ClientToScreen_HANDLE: MethodHandle? = null

fun ClientToScreen(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 ClientToScreen called before init()" }
    val _handle = ClientToScreen_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : ScreenToClient typedef BOOL = Int(typedef HWND = (Declared(HWND__))*,typedef LPPOINT = (Declared(tagPOINT))*)
 */
private val ScreenToClient_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var ScreenToClient_HANDLE: MethodHandle? = null

fun ScreenToClient(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 ScreenToClient called before init()" }
    val _handle = ScreenToClient_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : WindowFromPoint typedef HWND = (Declared(HWND__))*(typedef POINT = Declared(tagPOINT))
 */
private val WindowFromPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, tagPOINT.layout)
private var WindowFromPoint_HANDLE: MethodHandle? = null

fun WindowFromPoint(arg0: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 WindowFromPoint called before init()" }
    val _handle = WindowFromPoint_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : ClipCursor typedef BOOL = Int((typedef RECT = Declared(tagRECT))*)
 */
private val ClipCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var ClipCursor_HANDLE: MethodHandle? = null

fun ClipCursor(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 ClipCursor called before init()" }
    val _handle = ClipCursor_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : FillRect Int(typedef HDC = (Declared(HDC__))*,(typedef RECT = Declared(tagRECT))*,typedef HBRUSH = (Declared(HBRUSH__))*)
 */
private val FillRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var FillRect_HANDLE: MethodHandle? = null

fun FillRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 FillRect called before init()" }
    val _handle = FillRect_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetWindowLongPtrW typedef LONG_PTR = LongLong(typedef HWND = (Declared(HWND__))*,Int)
 */
private val GetWindowLongPtrW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetWindowLongPtrW_HANDLE: MethodHandle? = null

fun GetWindowLongPtrW(arg0: MemorySegment, arg1: Int): Long {
    check(_initialized) { "Win32 GetWindowLongPtrW called before init()" }
    val _handle = GetWindowLongPtrW_HANDLE ?: return 0L
    try {
        return _handle.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0L
    }
}

/**
 * {@snippet lang=c : SetWindowLongPtrW typedef LONG_PTR = LongLong(typedef HWND = (Declared(HWND__))*,Int,typedef LONG_PTR = LongLong)
 */
private val SetWindowLongPtrW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private var SetWindowLongPtrW_HANDLE: MethodHandle? = null

fun SetWindowLongPtrW(arg0: MemorySegment, arg1: Int, arg2: Long): Long {
    check(_initialized) { "Win32 SetWindowLongPtrW called before init()" }
    val _handle = SetWindowLongPtrW_HANDLE ?: return 0L
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0L
    }
}

/**
 * {@snippet lang=c : FindWindowExW typedef HWND = (Declared(HWND__))*(typedef HWND = (Declared(HWND__))*,typedef HWND = (Declared(HWND__))*,typedef LPCWSTR = (UNSIGNED = Short)*,typedef LPCWSTR = (UNSIGNED = Short)*)
 */
private val FindWindowExW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var FindWindowExW_HANDLE: MethodHandle? = null

fun FindWindowExW(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 FindWindowExW called before init()" }
    val _handle = FindWindowExW_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : GetWindowThreadProcessId typedef DWORD = UNSIGNED = Long(typedef HWND = (Declared(HWND__))*,typedef LPDWORD = (UNSIGNED = Long)*)
 */
private val GetWindowThreadProcessId_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetWindowThreadProcessId_HANDLE: MethodHandle? = null

fun GetWindowThreadProcessId(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetWindowThreadProcessId called before init()" }
    val _handle = GetWindowThreadProcessId_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : LoadCursorW typedef HCURSOR = (Declared(HICON__))*(typedef HINSTANCE = (Declared(HINSTANCE__))*,typedef LPCWSTR = (UNSIGNED = Short)*)
 */
private val LoadCursorW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var LoadCursorW_HANDLE: MethodHandle? = null

fun LoadCursorW(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 LoadCursorW called before init()" }
    val _handle = LoadCursorW_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : DestroyCursor typedef BOOL = Int(typedef HCURSOR = (Declared(HICON__))*)
 */
private val DestroyCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var DestroyCursor_HANDLE: MethodHandle? = null

fun DestroyCursor(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 DestroyCursor called before init()" }
    val _handle = DestroyCursor_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : CreateIcon typedef HICON = (Declared(HICON__))*(typedef HINSTANCE = (Declared(HINSTANCE__))*,Int,Int,typedef BYTE = UNSIGNED = Char,typedef BYTE = UNSIGNED = Char,(typedef BYTE = UNSIGNED = Char)*,(typedef BYTE = UNSIGNED = Char)*)
 */
private val CreateIcon_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var CreateIcon_HANDLE: MethodHandle? = null

fun CreateIcon(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: Byte, arg4: Byte, arg5: MemorySegment, arg6: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 CreateIcon called before init()" }
    val _handle = CreateIcon_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : DestroyIcon typedef BOOL = Int(typedef HICON = (Declared(HICON__))*)
 */
private val DestroyIcon_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var DestroyIcon_HANDLE: MethodHandle? = null

fun DestroyIcon(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 DestroyIcon called before init()" }
    val _handle = DestroyIcon_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : CreateIconIndirect typedef HICON = (Declared(HICON__))*(typedef PICONINFO = (Declared(_ICONINFO))*)
 */
private val CreateIconIndirect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var CreateIconIndirect_HANDLE: MethodHandle? = null

fun CreateIconIndirect(arg0: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 CreateIconIndirect called before init()" }
    val _handle = CreateIconIndirect_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum EDIT_CONTROL_FEATURE}
 */
enum class EDIT_CONTROL_FEATURE(val value: Long) {
    EDIT_CONTROL_FEATURE_ENTERPRISE_DATA_PROTECTION_PASTE_SUPPORT(0L), EDIT_CONTROL_FEATURE_PASTE_NOTIFICATIONS(1L);

    companion object {
        fun fromValue(v: Long): EDIT_CONTROL_FEATURE = entries.firstOrNull { it.value == v }
            ?: error("Unknown EDIT_CONTROL_FEATURE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long HELPPOLY;}
 */
typealias HELPPOLY = Int

/**
 * NS_ENUM: {@snippet lang=c : enum tagHANDEDNESS}
 */
enum class tagHANDEDNESS(val value: Long) {
    HANDEDNESS_LEFT(0L), HANDEDNESS_RIGHT(1L);

    companion object {
        fun fromValue(v: Long): tagHANDEDNESS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagHANDEDNESS value: $v")
    }
}

/**
 * {@snippet lang=c : SystemParametersInfoW typedef BOOL = Int(typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int,typedef PVOID = (Void)*,typedef UINT = UNSIGNED = Int)
 */
private val SystemParametersInfoW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var SystemParametersInfoW_HANDLE: MethodHandle? = null

fun SystemParametersInfoW(arg0: Int, arg1: Int, arg2: MemorySegment, arg3: Int): Int {
    check(_initialized) { "Win32 SystemParametersInfoW called before init()" }
    val _handle = SystemParametersInfoW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : MonitorFromWindow typedef HMONITOR = (Declared(HMONITOR__))*(typedef HWND = (Declared(HWND__))*,typedef DWORD = UNSIGNED = Long)
 */
private val MonitorFromWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var MonitorFromWindow_HANDLE: MethodHandle? = null

fun MonitorFromWindow(arg0: MemorySegment, arg1: Int): MemorySegment {
    check(_initialized) { "Win32 MonitorFromWindow called before init()" }
    val _handle = MonitorFromWindow_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : GetMonitorInfoW typedef BOOL = Int(typedef HMONITOR = (Declared(HMONITOR__))*,typedef LPMONITORINFO = (Declared(tagMONITORINFO))*)
 */
private val GetMonitorInfoW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetMonitorInfoW_HANDLE: MethodHandle? = null

fun GetMonitorInfoW(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetMonitorInfoW called before init()" }
    val _handle = GetMonitorInfoW_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetDpiForWindow typedef UINT = UNSIGNED = Int(typedef HWND = (Declared(HWND__))*)
 */
private val GetDpiForWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetDpiForWindow_HANDLE: MethodHandle? = null

fun GetDpiForWindow(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 GetDpiForWindow called before init()" }
    val _handle = GetDpiForWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetProcessDpiAwarenessContext typedef BOOL = Int(typedef DPI_AWARENESS_CONTEXT = (Declared(DPI_AWARENESS_CONTEXT__))*)
 */
private val SetProcessDpiAwarenessContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var SetProcessDpiAwarenessContext_HANDLE: MethodHandle? = null

fun SetProcessDpiAwarenessContext(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 SetProcessDpiAwarenessContext called before init()" }
    val _handle = SetProcessDpiAwarenessContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPOINTER_DEVICE_TYPE}
 */
enum class tagPOINTER_DEVICE_TYPE(val value: Long) {
    POINTER_DEVICE_TYPE_INTEGRATED_PEN(1L), POINTER_DEVICE_TYPE_EXTERNAL_PEN(2L), POINTER_DEVICE_TYPE_TOUCH(3L), POINTER_DEVICE_TYPE_TOUCH_PAD(4L), POINTER_DEVICE_TYPE_MAX(-1L);

    companion object {
        fun fromValue(v: Long): tagPOINTER_DEVICE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPOINTER_DEVICE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPOINTER_DEVICE_CURSOR_TYPE}
 */
enum class tagPOINTER_DEVICE_CURSOR_TYPE(val value: Long) {
    POINTER_DEVICE_CURSOR_TYPE_UNKNOWN(0L), POINTER_DEVICE_CURSOR_TYPE_TIP(1L), POINTER_DEVICE_CURSOR_TYPE_ERASER(2L), POINTER_DEVICE_CURSOR_TYPE_MAX(-1L);

    companion object {
        fun fromValue(v: Long): tagPOINTER_DEVICE_CURSOR_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPOINTER_DEVICE_CURSOR_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum LEGACY_TOUCHPAD_FEATURES}
 */
enum class LEGACY_TOUCHPAD_FEATURES(val value: Long) {
    LEGACY_TOUCHPAD_FEATURE_NONE(0L), LEGACY_TOUCHPAD_FEATURE_ENABLE_DISABLE(1L), LEGACY_TOUCHPAD_FEATURE_REVERSE_SCROLL_DIRECTION(4L);

    companion object {
        fun fromValue(v: Long): LEGACY_TOUCHPAD_FEATURES = entries.firstOrNull { it.value == v }
            ?: error("Unknown LEGACY_TOUCHPAD_FEATURES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TOUCHPAD_SENSITIVITY_LEVEL}
 */
enum class TOUCHPAD_SENSITIVITY_LEVEL(val value: Long) {
    TOUCHPAD_SENSITIVITY_LEVEL_MOST_SENSITIVE(0L), TOUCHPAD_SENSITIVITY_LEVEL_HIGH_SENSITIVITY(1L), TOUCHPAD_SENSITIVITY_LEVEL_MEDIUM_SENSITIVITY(2L), TOUCHPAD_SENSITIVITY_LEVEL_LOW_SENSITIVITY(3L), TOUCHPAD_SENSITIVITY_LEVEL_LEAST_SENSITIVE(4L);

    companion object {
        fun fromValue(v: Long): TOUCHPAD_SENSITIVITY_LEVEL = entries.firstOrNull { it.value == v }
            ?: error("Unknown TOUCHPAD_SENSITIVITY_LEVEL value: $v")
    }
}

/**
 * {@snippet lang=c : GetGestureInfo typedef BOOL = Int(typedef HGESTUREINFO = (Declared(HGESTUREINFO__))*,typedef PGESTUREINFO = (Declared(tagGESTUREINFO))*)
 */
private val GetGestureInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetGestureInfo_HANDLE: MethodHandle? = null

fun GetGestureInfo(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 GetGestureInfo called before init()" }
    val _handle = GetGestureInfo_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : CloseGestureInfoHandle typedef BOOL = Int(typedef HGESTUREINFO = (Declared(HGESTUREINFO__))*)
 */
private val CloseGestureInfoHandle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var CloseGestureInfoHandle_HANDLE: MethodHandle? = null

fun CloseGestureInfoHandle(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 CloseGestureInfoHandle called before init()" }
    val _handle = CloseGestureInfoHandle_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagINPUT_MESSAGE_DEVICE_TYPE}
 */
enum class tagINPUT_MESSAGE_DEVICE_TYPE(val value: Long) {
    IMDT_UNAVAILABLE(0L), IMDT_KEYBOARD(1L), IMDT_MOUSE(2L), IMDT_TOUCH(4L), IMDT_PEN(8L), IMDT_TOUCHPAD(16L);

    companion object {
        fun fromValue(v: Long): tagINPUT_MESSAGE_DEVICE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagINPUT_MESSAGE_DEVICE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagINPUT_MESSAGE_ORIGIN_ID}
 */
enum class tagINPUT_MESSAGE_ORIGIN_ID(val value: Long) {
    IMO_UNAVAILABLE(0L), IMO_HARDWARE(1L), IMO_INJECTED(2L), IMO_SYSTEM(4L);

    companion object {
        fun fromValue(v: Long): tagINPUT_MESSAGE_ORIGIN_ID = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagINPUT_MESSAGE_ORIGIN_ID value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagAR_STATE}
 */
enum class tagAR_STATE(val value: Long) {
    AR_ENABLED(0L), AR_DISABLED(1L), AR_SUPPRESSED(2L), AR_REMOTESESSION(4L), AR_MULTIMON(8L), AR_NOSENSOR(16L), AR_NOT_SUPPORTED(32L), AR_DOCKED(64L), AR_LAPTOP(128L);

    companion object {
        fun fromValue(v: Long): tagAR_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagAR_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum ORIENTATION_PREFERENCE}
 */
enum class ORIENTATION_PREFERENCE(val value: Long) {
    ORIENTATION_PREFERENCE_NONE(0L), ORIENTATION_PREFERENCE_LANDSCAPE(1L), ORIENTATION_PREFERENCE_PORTRAIT(2L), ORIENTATION_PREFERENCE_LANDSCAPE_FLIPPED(4L), ORIENTATION_PREFERENCE_PORTRAIT_FLIPPED(8L);

    companion object {
        fun fromValue(v: Long): ORIENTATION_PREFERENCE = entries.firstOrNull { it.value == v }
            ?: error("Unknown ORIENTATION_PREFERENCE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _WINDOW_PLACEMENT_STATE}
 */
enum class _WINDOW_PLACEMENT_STATE(val value: Long) {
    WPS_NORMAL(0L), WPS_MAXIMIZED(1L), WPS_MINIMIZED(2L), WPS_ARRANGED(3L);

    companion object {
        fun fromValue(v: Long): _WINDOW_PLACEMENT_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _WINDOW_PLACEMENT_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _WINDOW_ACTION_KINDS}
 */
enum class _WINDOW_ACTION_KINDS(val value: Long) {
    WAK_NONE(0L), WAK_VISIBILITY(1L), WAK_POSITION(2L), WAK_SIZE(4L), WAK_INSERT_AFTER(8L), WAK_ACTIVATE(16L), WAK_PLACEMENT_STATE(32L), WAK_NORMAL_RECT(64L), WAK_MOVE_TO_MONITOR(128L), WAK_FIT_TO_MONITOR(256L), WAK_DISPLAY_CHANGE(512L), WAK_SYSTEM_OPERATION(1024L), WAK_COALESCEABLE(31L);

    companion object {
        fun fromValue(v: Long): _WINDOW_ACTION_KINDS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _WINDOW_ACTION_KINDS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _WINDOW_ACTION_MODIFIERS}
 */
enum class _WINDOW_ACTION_MODIFIERS(val value: Long) {
    WAM_NONE(0L), WAM_FRAME_BOUNDS(1L), WAM_ACTIVATE_FOREGROUND(2L), WAM_ACTIVATE_INPUT(4L), WAM_ACTIVATE_NO_ZORDER(8L), WAM_INSERT_AFTER_NO_OWNER(16L), WAM_RESTORE_TO_NORMAL(32L), WAM_RESTORE_TO_MAXIMIZED(64L), WAM_RESTORE_TO_ARRANGED(128L), WAM_WORK_AREA(256L), WAM_DPI(512L), WAM_SCALED_TO_MONITOR(1024L);

    companion object {
        fun fromValue(v: Long): _WINDOW_ACTION_MODIFIERS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _WINDOW_ACTION_MODIFIERS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TOOLTIP_DISMISS_FLAGS}
 */
enum class TOOLTIP_DISMISS_FLAGS(val value: Long) {
    TDF_REGISTER(1L), TDF_UNREGISTER(2L);

    companion object {
        fun fromValue(v: Long): TOOLTIP_DISMISS_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown TOOLTIP_DISMISS_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _MOVESIZE_OPERATION}
 */
enum class _MOVESIZE_OPERATION(val value: Long) {
    MSO_SIZE_LEFT(1L), MSO_SIZE_RIGHT(2L), MSO_SIZE_TOP(3L), MSO_SIZE_TOPLEFT(4L), MSO_SIZE_TOPRIGHT(5L), MSO_SIZE_BOTTOM(6L), MSO_SIZE_BOTTOMLEFT(7L), MSO_SIZE_BOTTOMRIGHT(8L), MSO_MOVE(9L);

    companion object {
        fun fromValue(v: Long): _MOVESIZE_OPERATION = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MOVESIZE_OPERATION value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long LGRPID;}
 */
typealias LGRPID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long LCTYPE;}
 */
typealias LCTYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CALTYPE;}
 */
typealias CALTYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long CALID;}
 */
typealias CALID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long GEOTYPE;}
 */
typealias GEOTYPE = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long GEOCLASS;}
 */
typealias GEOCLASS = Int

/**
 * {@snippet lang=c : typedef Long GEOID;}
 */
typealias GEOID = Int

/**
 * NS_ENUM: {@snippet lang=c : enum SYSNLS_FUNCTION}
 */
enum class SYSNLS_FUNCTION(val value: Long) {
    COMPARE_STRING(1L);

    companion object {
        fun fromValue(v: Long): SYSNLS_FUNCTION = entries.firstOrNull { it.value == v }
            ?: error("Unknown SYSNLS_FUNCTION value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long NLS_FUNCTION;}
 */
typealias NLS_FUNCTION = Int

/**
 * NS_ENUM: {@snippet lang=c : enum SYSGEOTYPE}
 */
enum class SYSGEOTYPE(val value: Long) {
    GEO_NATION(1L), GEO_LATITUDE(2L), GEO_LONGITUDE(3L), GEO_ISO2(4L), GEO_ISO3(5L), GEO_RFC1766(6L), GEO_LCID(7L), GEO_FRIENDLYNAME(8L), GEO_OFFICIALNAME(9L), GEO_TIMEZONES(10L), GEO_OFFICIALLANGUAGES(11L), GEO_ISO_UN_NUMBER(12L), GEO_PARENT(13L), GEO_DIALINGCODE(14L), GEO_CURRENCYCODE(15L), GEO_CURRENCYSYMBOL(16L), GEO_NAME(17L), GEO_ID(18L);

    companion object {
        fun fromValue(v: Long): SYSGEOTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown SYSGEOTYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum SYSGEOCLASS}
 */
enum class SYSGEOCLASS(val value: Long) {
    GEOCLASS_NATION(16L), GEOCLASS_REGION(14L), GEOCLASS_ALL(0L);

    companion object {
        fun fromValue(v: Long): SYSGEOCLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown SYSGEOCLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _NORM_FORM}
 */
enum class _NORM_FORM(val value: Long) {
    NormalizationOther(0L), NormalizationC(1L), NormalizationD(2L), NormalizationKC(5L), NormalizationKD(6L);

    companion object {
        fun fromValue(v: Long): _NORM_FORM = entries.firstOrNull { it.value == v }
            ?: error("Unknown _NORM_FORM value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum ALLOC_CONSOLE_MODE}
 */
enum class ALLOC_CONSOLE_MODE(val value: Long) {
    ALLOC_CONSOLE_MODE_DEFAULT(0L), ALLOC_CONSOLE_MODE_NEW_WINDOW(1L), ALLOC_CONSOLE_MODE_NO_WINDOW(2L);

    companion object {
        fun fromValue(v: Long): ALLOC_CONSOLE_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown ALLOC_CONSOLE_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum ALLOC_CONSOLE_RESULT}
 */
enum class ALLOC_CONSOLE_RESULT(val value: Long) {
    ALLOC_CONSOLE_RESULT_NO_CONSOLE(0L), ALLOC_CONSOLE_RESULT_NEW_CONSOLE(1L), ALLOC_CONSOLE_RESULT_EXISTING_CONSOLE(2L);

    companion object {
        fun fromValue(v: Long): ALLOC_CONSOLE_RESULT = entries.firstOrNull { it.value == v }
            ?: error("Unknown ALLOC_CONSOLE_RESULT value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Long LSTATUS;}
 */
typealias LSTATUS = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long REGSAM;}
 */
typealias REGSAM = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _SC_ACTION_TYPE}
 */
enum class _SC_ACTION_TYPE(val value: Long) {
    SC_ACTION_NONE(0L), SC_ACTION_RESTART(1L), SC_ACTION_REBOOT(2L), SC_ACTION_RUN_COMMAND(3L), SC_ACTION_OWN_RESTART(4L);

    companion object {
        fun fromValue(v: Long): _SC_ACTION_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SC_ACTION_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _SC_STATUS_TYPE}
 */
enum class _SC_STATUS_TYPE(val value: Long) {
    SC_STATUS_PROCESS_INFO(0L);

    companion object {
        fun fromValue(v: Long): _SC_STATUS_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SC_STATUS_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _SC_ENUM_TYPE}
 */
enum class _SC_ENUM_TYPE(val value: Long) {
    SC_ENUM_PROCESS_INFO(0L);

    companion object {
        fun fromValue(v: Long): _SC_ENUM_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SC_ENUM_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _SC_EVENT_TYPE}
 */
enum class _SC_EVENT_TYPE(val value: Long) {
    SC_EVENT_DATABASE_CHANGE(0L), SC_EVENT_PROPERTY_CHANGE(1L), SC_EVENT_STATUS_CHANGE(2L);

    companion object {
        fun fromValue(v: Long): _SC_EVENT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _SC_EVENT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum SERVICE_REGISTRY_STATE_TYPE}
 */
enum class SERVICE_REGISTRY_STATE_TYPE(val value: Long) {
    ServiceRegistryStateParameters(0L), ServiceRegistryStatePersistent(1L), MaxServiceRegistryStateType(2L);

    companion object {
        fun fromValue(v: Long): SERVICE_REGISTRY_STATE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown SERVICE_REGISTRY_STATE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum SERVICE_DIRECTORY_TYPE}
 */
enum class SERVICE_DIRECTORY_TYPE(val value: Long) {
    ServiceDirectoryPersistentState(0L), ServiceDirectoryTypeMax(1L);

    companion object {
        fun fromValue(v: Long): SERVICE_DIRECTORY_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown SERVICE_DIRECTORY_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum SERVICE_SHARED_REGISTRY_STATE_TYPE}
 */
enum class SERVICE_SHARED_REGISTRY_STATE_TYPE(val value: Long) {
    ServiceSharedRegistryPersistentState(0L);

    companion object {
        fun fromValue(v: Long): SERVICE_SHARED_REGISTRY_STATE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown SERVICE_SHARED_REGISTRY_STATE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum SERVICE_SHARED_DIRECTORY_TYPE}
 */
enum class SERVICE_SHARED_DIRECTORY_TYPE(val value: Long) {
    ServiceSharedDirectoryPersistentState(0L);

    companion object {
        fun fromValue(v: Long): SERVICE_SHARED_DIRECTORY_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown SERVICE_SHARED_DIRECTORY_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Long RPC_STATUS;}
 */
typealias RPC_STATUS = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _RPC_HTTP_REDIRECTOR_STAGE}
 */
enum class _RPC_HTTP_REDIRECTOR_STAGE(val value: Long) {
    RPCHTTP_RS_REDIRECT(1L), RPCHTTP_RS_ACCESS_1(2L), RPCHTTP_RS_SESSION(3L), RPCHTTP_RS_ACCESS_2(4L), RPCHTTP_RS_INTERFACE(5L);

    companion object {
        fun fromValue(v: Long): _RPC_HTTP_REDIRECTOR_STAGE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RPC_HTTP_REDIRECTOR_STAGE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum RPC_ADDRESS_CHANGE_TYPE}
 */
enum class RPC_ADDRESS_CHANGE_TYPE(val value: Long) {
    PROTOCOL_NOT_LOADED(1L), PROTOCOL_LOADED(2L), PROTOCOL_ADDRESS_CHANGE(3L);

    companion object {
        fun fromValue(v: Long): RPC_ADDRESS_CHANGE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown RPC_ADDRESS_CHANGE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION}
 */
enum class _LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION(val value: Long) {
    MarshalDirectionMarshal(0L), MarshalDirectionUnmarshal(1L);

    companion object {
        fun fromValue(v: Long): _LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION = entries.firstOrNull { it.value == v }
            ?: error("Unknown _LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum RpcProxyPerfCounters}
 */
enum class RpcProxyPerfCounters(val value: Long) {
    RpcCurrentUniqueUser(1L), RpcBackEndConnectionAttempts(2L), RpcBackEndConnectionFailed(3L), RpcRequestsPerSecond(4L), RpcIncomingConnections(5L), RpcIncomingBandwidth(6L), RpcOutgoingBandwidth(7L), RpcAttemptedLbsDecisions(8L), RpcFailedLbsDecisions(9L), RpcAttemptedLbsMessages(10L), RpcFailedLbsMessages(11L), RpcLastCounter(12L);

    companion object {
        fun fromValue(v: Long): RpcProxyPerfCounters = entries.firstOrNull { it.value == v }
            ?: error("Unknown RpcProxyPerfCounters value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _RPC_NOTIFICATION_TYPES}
 */
enum class _RPC_NOTIFICATION_TYPES(val value: Long) {
    RpcNotificationTypeNone(0L), RpcNotificationTypeEvent(1L), RpcNotificationTypeApc(2L), RpcNotificationTypeIoc(3L), RpcNotificationTypeHwnd(4L), RpcNotificationTypeCallback(5L);

    companion object {
        fun fromValue(v: Long): _RPC_NOTIFICATION_TYPES = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RPC_NOTIFICATION_TYPES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _RPC_ASYNC_EVENT}
 */
enum class _RPC_ASYNC_EVENT(val value: Long) {
    RpcCallComplete(0L), RpcSendComplete(1L), RpcReceiveComplete(2L), RpcClientDisconnect(3L), RpcClientCancel(4L);

    companion object {
        fun fromValue(v: Long): _RPC_ASYNC_EVENT = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RPC_ASYNC_EVENT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagExtendedErrorParamTypes}
 */
enum class tagExtendedErrorParamTypes(val value: Long) {
    eeptAnsiString(1L), eeptUnicodeString(2L), eeptLongVal(3L), eeptShortVal(4L), eeptPointerVal(5L), eeptNone(6L), eeptBinary(7L);

    companion object {
        fun fromValue(v: Long): tagExtendedErrorParamTypes = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagExtendedErrorParamTypes value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagRpcLocalAddressFormat}
 */
enum class tagRpcLocalAddressFormat(val value: Long) {
    rlafInvalid(0L), rlafIPv4(1L), rlafIPv6(2L);

    companion object {
        fun fromValue(v: Long): tagRpcLocalAddressFormat = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagRpcLocalAddressFormat value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagRpcCallType}
 */
enum class tagRpcCallType(val value: Long) {
    rctInvalid(0L), rctNormal(1L), rctTraining(2L), rctGuaranteed(3L);

    companion object {
        fun fromValue(v: Long): tagRpcCallType = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagRpcCallType value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagRpcCallClientLocality}
 */
enum class tagRpcCallClientLocality(val value: Long) {
    rcclInvalid(0L), rcclLocal(1L), rcclRemote(2L), rcclClientUnknownLocality(3L);

    companion object {
        fun fromValue(v: Long): tagRpcCallClientLocality = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagRpcCallClientLocality value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _RPC_NOTIFICATIONS}
 */
enum class _RPC_NOTIFICATIONS(val value: Long) {
    RpcNotificationCallNone(0L), RpcNotificationClientDisconnect(1L), RpcNotificationCallCancel(2L);

    companion object {
        fun fromValue(v: Long): _RPC_NOTIFICATIONS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _RPC_NOTIFICATIONS value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Char byte;}
 */
typealias byte = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char cs_byte;}
 */
typealias cs_byte = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char boolean;}
 */
typealias boolean = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Long error_status_t;}
 */
typealias error_status_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long RPC_LENGTH;}
 */
typealias RPC_LENGTH = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _USER_MARSHAL_CB_TYPE}
 */
enum class _USER_MARSHAL_CB_TYPE(val value: Long) {
    USER_MARSHAL_CB_BUFFER_SIZE(0L), USER_MARSHAL_CB_MARSHALL(1L), USER_MARSHAL_CB_UNMARSHALL(2L), USER_MARSHAL_CB_FREE(3L);

    companion object {
        fun fromValue(v: Long): _USER_MARSHAL_CB_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _USER_MARSHAL_CB_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _IDL_CS_CONVERT}
 */
enum class _IDL_CS_CONVERT(val value: Long) {
    IDL_CS_NO_CONVERT(0L), IDL_CS_IN_PLACE_CONVERT(1L), IDL_CS_NEW_BUFFER_CONVERT(2L);

    companion object {
        fun fromValue(v: Long): _IDL_CS_CONVERT = entries.firstOrNull { it.value == v }
            ?: error("Unknown _IDL_CS_CONVERT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum XLAT_SIDE}
 */
enum class XLAT_SIDE(val value: Long) {
    XLAT_SERVER(1L), XLAT_CLIENT(2L);

    companion object {
        fun fromValue(v: Long): XLAT_SIDE = entries.firstOrNull { it.value == v }
            ?: error("Unknown XLAT_SIDE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _system_handle_t}
 */
enum class _system_handle_t(val value: Long) {
    SYSTEM_HANDLE_FILE(0L), SYSTEM_HANDLE_SEMAPHORE(1L), SYSTEM_HANDLE_EVENT(2L), SYSTEM_HANDLE_MUTEX(3L), SYSTEM_HANDLE_PROCESS(4L), SYSTEM_HANDLE_TOKEN(5L), SYSTEM_HANDLE_SECTION(6L), SYSTEM_HANDLE_REG_KEY(7L), SYSTEM_HANDLE_THREAD(8L), SYSTEM_HANDLE_COMPOSITION_OBJECT(9L), SYSTEM_HANDLE_SOCKET(10L), SYSTEM_HANDLE_JOB(11L), SYSTEM_HANDLE_PIPE(12L), SYSTEM_HANDLE_MAX(12L), SYSTEM_HANDLE_INVALID(255L);

    companion object {
        fun fromValue(v: Long): _system_handle_t = entries.firstOrNull { it.value == v }
            ?: error("Unknown _system_handle_t value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at C:\Program Files (x86)\Windows Kits\10\Include\10.0.28000.0\shared\rpcndr.h:1247:1)}
 */
enum class enum_unnamed_at_C_Program_Files_x86_Windows_Kits_10_Include_10_0_28000_0_shared_rpcndr_h_1247_1_(val value: Long) {
    MidlInterceptionInfoVersionOne(1L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_C_Program_Files_x86_Windows_Kits_10_Include_10_0_28000_0_shared_rpcndr_h_1247_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_C_Program_Files_x86_Windows_Kits_10_Include_10_0_28000_0_shared_rpcndr_h_1247_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum enum (unnamed at C:\Program Files (x86)\Windows Kits\10\Include\10.0.28000.0\shared\rpcndr.h:1251:1)}
 */
enum class enum_unnamed_at_C_Program_Files_x86_Windows_Kits_10_Include_10_0_28000_0_shared_rpcndr_h_1251_1_(val value: Long) {
    MidlWinrtTypeSerializationInfoVersionOne(1L);

    companion object {
        fun fromValue(v: Long): enum_unnamed_at_C_Program_Files_x86_Windows_Kits_10_Include_10_0_28000_0_shared_rpcndr_h_1251_1_ = entries.firstOrNull { it.value == v }
            ?: error("Unknown enum_unnamed_at_C_Program_Files_x86_Windows_Kits_10_Include_10_0_28000_0_shared_rpcndr_h_1251_1_ value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum STUB_PHASE}
 */
enum class STUB_PHASE(val value: Long) {
    STUB_UNMARSHAL(0L), STUB_CALL_SERVER(1L), STUB_MARSHAL(2L), STUB_CALL_SERVER_NO_HRESULT(3L);

    companion object {
        fun fromValue(v: Long): STUB_PHASE = entries.firstOrNull { it.value == v }
            ?: error("Unknown STUB_PHASE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum PROXY_PHASE}
 */
enum class PROXY_PHASE(val value: Long) {
    PROXY_CALCSIZE(0L), PROXY_GETBUFFER(1L), PROXY_MARSHAL(2L), PROXY_SENDRECEIVE(3L), PROXY_UNMARSHAL(4L);

    companion object {
        fun fromValue(v: Long): PROXY_PHASE = entries.firstOrNull { it.value == v }
            ?: error("Unknown PROXY_PHASE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Short OLECHAR;}
 */
typealias OLECHAR = Short

/**
 * {@snippet lang=c : typedef Double DOUBLE;}
 */
typealias DOUBLE = Double

/**
 * {@snippet lang=c : typedef Long SCODE;}
 */
typealias SCODE = Int

/**
 * NS_ENUM: {@snippet lang=c : enum tagMEMCTX}
 */
enum class tagMEMCTX(val value: Long) {
    MEMCTX_TASK(1L), MEMCTX_SHARED(2L), MEMCTX_MACSYSTEM(3L), MEMCTX_UNKNOWN(-1L), MEMCTX_SAME(-2L);

    companion object {
        fun fromValue(v: Long): tagMEMCTX = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagMEMCTX value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCLSCTX}
 */
enum class tagCLSCTX(val value: Long) {
    CLSCTX_INPROC_SERVER(1L), CLSCTX_INPROC_HANDLER(2L), CLSCTX_LOCAL_SERVER(4L), CLSCTX_INPROC_SERVER16(8L), CLSCTX_REMOTE_SERVER(16L), CLSCTX_INPROC_HANDLER16(32L), CLSCTX_RESERVED1(64L), CLSCTX_RESERVED2(128L), CLSCTX_RESERVED3(256L), CLSCTX_RESERVED4(512L), CLSCTX_NO_CODE_DOWNLOAD(1024L), CLSCTX_RESERVED5(2048L), CLSCTX_NO_CUSTOM_MARSHAL(4096L), CLSCTX_ENABLE_CODE_DOWNLOAD(8192L), CLSCTX_NO_FAILURE_LOG(16384L), CLSCTX_DISABLE_AAA(32768L), CLSCTX_ENABLE_AAA(65536L), CLSCTX_FROM_DEFAULT_CONTEXT(131072L), CLSCTX_ACTIVATE_X86_SERVER(262144L), CLSCTX_ACTIVATE_32_BIT_SERVER(262144L), CLSCTX_ACTIVATE_64_BIT_SERVER(524288L), CLSCTX_ENABLE_CLOAKING(1048576L), CLSCTX_APPCONTAINER(4194304L), CLSCTX_ACTIVATE_AAA_AS_IU(8388608L), CLSCTX_RESERVED6(16777216L), CLSCTX_ACTIVATE_ARM32_SERVER(33554432L), CLSCTX_ALLOW_LOWER_TRUST_REGISTRATION(67108864L), CLSCTX_SERVER_MUST_BE_EQUAL_OR_GREATER_PRIVILEGE(134217728L), CLSCTX_DO_NOT_ELEVATE_SERVER(268435456L), CLSCTX_PS_DLL(-2147483648L);

    companion object {
        fun fromValue(v: Long): tagCLSCTX = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCLSCTX value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagMSHLFLAGS}
 */
enum class tagMSHLFLAGS(val value: Long) {
    MSHLFLAGS_NORMAL(0L), MSHLFLAGS_TABLESTRONG(1L), MSHLFLAGS_TABLEWEAK(2L), MSHLFLAGS_NOPING(4L), MSHLFLAGS_RESERVED1(8L), MSHLFLAGS_RESERVED2(16L), MSHLFLAGS_RESERVED3(32L), MSHLFLAGS_RESERVED4(64L);

    companion object {
        fun fromValue(v: Long): tagMSHLFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagMSHLFLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagMSHCTX}
 */
enum class tagMSHCTX(val value: Long) {
    MSHCTX_LOCAL(0L), MSHCTX_NOSHAREDMEM(1L), MSHCTX_DIFFERENTMACHINE(2L), MSHCTX_INPROC(3L), MSHCTX_CROSSCTX(4L), MSHCTX_CONTAINER(5L);

    companion object {
        fun fromValue(v: Long): tagMSHCTX = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagMSHCTX value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagDVASPECT}
 */
enum class tagDVASPECT(val value: Long) {
    DVASPECT_CONTENT(1L), DVASPECT_THUMBNAIL(2L), DVASPECT_ICON(4L), DVASPECT_DOCPRINT(8L);

    companion object {
        fun fromValue(v: Long): tagDVASPECT = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagDVASPECT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSTGC}
 */
enum class tagSTGC(val value: Long) {
    STGC_DEFAULT(0L), STGC_OVERWRITE(1L), STGC_ONLYIFCURRENT(2L), STGC_DANGEROUSLYCOMMITMERELYTODISKCACHE(4L), STGC_CONSOLIDATE(8L);

    companion object {
        fun fromValue(v: Long): tagSTGC = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSTGC value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSTGMOVE}
 */
enum class tagSTGMOVE(val value: Long) {
    STGMOVE_MOVE(0L), STGMOVE_COPY(1L), STGMOVE_SHALLOWCOPY(2L);

    companion object {
        fun fromValue(v: Long): tagSTGMOVE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSTGMOVE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSTATFLAG}
 */
enum class tagSTATFLAG(val value: Long) {
    STATFLAG_DEFAULT(0L), STATFLAG_NONAME(1L), STATFLAG_NOOPEN(2L);

    companion object {
        fun fromValue(v: Long): tagSTATFLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSTATFLAG value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Short CLIPFORMAT;}
 */
typealias CLIPFORMAT = Short

/**
 * {@snippet lang=c : typedef Double DATE;}
 */
typealias DATE = Double

/**
 * {@snippet lang=c : typedef Short VARIANT_BOOL;}
 */
typealias VARIANT_BOOL = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short VARTYPE;}
 */
typealias VARTYPE = Short

/**
 * NS_ENUM: {@snippet lang=c : enum VARENUM}
 */
enum class VARENUM(val value: Long) {
    VT_EMPTY(0L), VT_NULL(1L), VT_I2(2L), VT_I4(3L), VT_R4(4L), VT_R8(5L), VT_CY(6L), VT_DATE(7L), VT_BSTR(8L), VT_DISPATCH(9L), VT_ERROR(10L), VT_BOOL(11L), VT_VARIANT(12L), VT_UNKNOWN(13L), VT_DECIMAL(14L), VT_I1(16L), VT_UI1(17L), VT_UI2(18L), VT_UI4(19L), VT_I8(20L), VT_UI8(21L), VT_INT(22L), VT_UINT(23L), VT_VOID(24L), VT_HRESULT(25L), VT_PTR(26L), VT_SAFEARRAY(27L), VT_CARRAY(28L), VT_USERDEFINED(29L), VT_LPSTR(30L), VT_LPWSTR(31L), VT_RECORD(36L), VT_INT_PTR(37L), VT_UINT_PTR(38L), VT_FILETIME(64L), VT_BLOB(65L), VT_STREAM(66L), VT_STORAGE(67L), VT_STREAMED_OBJECT(68L), VT_STORED_OBJECT(69L), VT_BLOB_OBJECT(70L), VT_CF(71L), VT_CLSID(72L), VT_VERSIONED_STREAM(73L), VT_BSTR_BLOB(4095L), VT_VECTOR(4096L), VT_ARRAY(8192L), VT_BYREF(16384L), VT_RESERVED(32768L), VT_ILLEGAL(65535L), VT_ILLEGALMASKED(4095L), VT_TYPEMASK(4095L);

    companion object {
        fun fromValue(v: Long): VARENUM = entries.firstOrNull { it.value == v }
            ?: error("Unknown VARENUM value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long PROPID;}
 */
typealias PROPID = Int

/**
 * NS_ENUM: {@snippet lang=c : enum tagTYSPEC}
 */
enum class tagTYSPEC(val value: Long) {
    TYSPEC_CLSID(0L), TYSPEC_FILEEXT(1L), TYSPEC_MIMETYPE(2L), TYSPEC_FILENAME(3L), TYSPEC_PROGID(4L), TYSPEC_PACKAGENAME(5L), TYSPEC_OBJECTID(6L);

    companion object {
        fun fromValue(v: Long): tagTYSPEC = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagTYSPEC value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TVITEMPART}
 */
enum class _TVITEMPART(val value: Long) {
    TVGIPR_BUTTON(1L);

    companion object {
        fun fromValue(v: Long): _TVITEMPART = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TVITEMPART value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long MONTHDAYSTATE;}
 */
typealias MONTHDAYSTATE = Int

/**
 * NS_ENUM: {@snippet lang=c : enum EC_ENDOFLINE}
 */
enum class EC_ENDOFLINE(val value: Long) {
    EC_ENDOFLINE_DETECTFROMCONTENT(0L), EC_ENDOFLINE_CRLF(1L), EC_ENDOFLINE_CR(2L), EC_ENDOFLINE_LF(3L);

    companion object {
        fun fromValue(v: Long): EC_ENDOFLINE = entries.firstOrNull { it.value == v }
            ?: error("Unknown EC_ENDOFLINE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum EC_SEARCHWEB_ENTRYPOINT}
 */
enum class EC_SEARCHWEB_ENTRYPOINT(val value: Long) {
    EC_SEARCHWEB_ENTRYPOINT_EXTERNAL(0L), EC_SEARCHWEB_ENTRYPOINT_CONTEXTMENU(1L);

    companion object {
        fun fromValue(v: Long): EC_SEARCHWEB_ENTRYPOINT = entries.firstOrNull { it.value == v }
            ?: error("Unknown EC_SEARCHWEB_ENTRYPOINT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TASKDIALOG_FLAGS}
 */
enum class _TASKDIALOG_FLAGS(val value: Long) {
    TDF_ENABLE_HYPERLINKS(1L), TDF_USE_HICON_MAIN(2L), TDF_USE_HICON_FOOTER(4L), TDF_ALLOW_DIALOG_CANCELLATION(8L), TDF_USE_COMMAND_LINKS(16L), TDF_USE_COMMAND_LINKS_NO_ICON(32L), TDF_EXPAND_FOOTER_AREA(64L), TDF_EXPANDED_BY_DEFAULT(128L), TDF_VERIFICATION_FLAG_CHECKED(256L), TDF_SHOW_PROGRESS_BAR(512L), TDF_SHOW_MARQUEE_PROGRESS_BAR(1024L), TDF_CALLBACK_TIMER(2048L), TDF_POSITION_RELATIVE_TO_WINDOW(4096L), TDF_RTL_LAYOUT(8192L), TDF_NO_DEFAULT_RADIO_BUTTON(16384L), TDF_CAN_BE_MINIMIZED(32768L), TDF_NO_SET_FOREGROUND(65536L), TDF_SIZE_TO_CONTENT(16777216L);

    companion object {
        fun fromValue(v: Long): _TASKDIALOG_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TASKDIALOG_FLAGS value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Int TASKDIALOG_FLAGS;}
 */
typealias TASKDIALOG_FLAGS = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _TASKDIALOG_MESSAGES}
 */
enum class _TASKDIALOG_MESSAGES(val value: Long) {
    TDM_NAVIGATE_PAGE(1125L), TDM_CLICK_BUTTON(1126L), TDM_SET_MARQUEE_PROGRESS_BAR(1127L), TDM_SET_PROGRESS_BAR_STATE(1128L), TDM_SET_PROGRESS_BAR_RANGE(1129L), TDM_SET_PROGRESS_BAR_POS(1130L), TDM_SET_PROGRESS_BAR_MARQUEE(1131L), TDM_SET_ELEMENT_TEXT(1132L), TDM_CLICK_RADIO_BUTTON(1134L), TDM_ENABLE_BUTTON(1135L), TDM_ENABLE_RADIO_BUTTON(1136L), TDM_CLICK_VERIFICATION(1137L), TDM_UPDATE_ELEMENT_TEXT(1138L), TDM_SET_BUTTON_ELEVATION_REQUIRED_STATE(1139L), TDM_UPDATE_ICON(1140L);

    companion object {
        fun fromValue(v: Long): _TASKDIALOG_MESSAGES = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TASKDIALOG_MESSAGES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TASKDIALOG_NOTIFICATIONS}
 */
enum class _TASKDIALOG_NOTIFICATIONS(val value: Long) {
    TDN_CREATED(0L), TDN_NAVIGATED(1L), TDN_BUTTON_CLICKED(2L), TDN_HYPERLINK_CLICKED(3L), TDN_TIMER(4L), TDN_DESTROYED(5L), TDN_RADIO_BUTTON_CLICKED(6L), TDN_DIALOG_CONSTRUCTED(7L), TDN_VERIFICATION_CLICKED(8L), TDN_HELP(9L), TDN_EXPANDO_BUTTON_CLICKED(10L);

    companion object {
        fun fromValue(v: Long): _TASKDIALOG_NOTIFICATIONS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TASKDIALOG_NOTIFICATIONS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TASKDIALOG_ELEMENTS}
 */
enum class _TASKDIALOG_ELEMENTS(val value: Long) {
    TDE_CONTENT(0L), TDE_EXPANDED_INFORMATION(1L), TDE_FOOTER(2L), TDE_MAIN_INSTRUCTION(3L);

    companion object {
        fun fromValue(v: Long): _TASKDIALOG_ELEMENTS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TASKDIALOG_ELEMENTS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TASKDIALOG_ICON_ELEMENTS}
 */
enum class _TASKDIALOG_ICON_ELEMENTS(val value: Long) {
    TDIE_ICON_MAIN(0L), TDIE_ICON_FOOTER(1L);

    companion object {
        fun fromValue(v: Long): _TASKDIALOG_ICON_ELEMENTS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TASKDIALOG_ICON_ELEMENTS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _TASKDIALOG_COMMON_BUTTON_FLAGS}
 */
enum class _TASKDIALOG_COMMON_BUTTON_FLAGS(val value: Long) {
    TDCBF_OK_BUTTON(1L), TDCBF_YES_BUTTON(2L), TDCBF_NO_BUTTON(4L), TDCBF_CANCEL_BUTTON(8L), TDCBF_RETRY_BUTTON(16L), TDCBF_CLOSE_BUTTON(32L);

    companion object {
        fun fromValue(v: Long): _TASKDIALOG_COMMON_BUTTON_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _TASKDIALOG_COMMON_BUTTON_FLAGS value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Int TASKDIALOG_COMMON_BUTTON_FLAGS;}
 */
typealias TASKDIALOG_COMMON_BUTTON_FLAGS = Int

/**
 * NS_ENUM: {@snippet lang=c : enum _LI_METRIC}
 */
enum class _LI_METRIC(val value: Long) {
    LIM_SMALL(0L), LIM_LARGE(1L);

    companion object {
        fun fromValue(v: Long): _LI_METRIC = entries.firstOrNull { it.value == v }
            ?: error("Unknown _LI_METRIC value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TA_PROPERTY}
 */
enum class TA_PROPERTY(val value: Long) {
    TAP_FLAGS(0L), TAP_TRANSFORMCOUNT(1L), TAP_STAGGERDELAY(2L), TAP_STAGGERDELAYCAP(3L), TAP_STAGGERDELAYFACTOR(4L), TAP_ZORDER(5L);

    companion object {
        fun fromValue(v: Long): TA_PROPERTY = entries.firstOrNull { it.value == v }
            ?: error("Unknown TA_PROPERTY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TA_PROPERTY_FLAG}
 */
enum class TA_PROPERTY_FLAG(val value: Long) {
    TAPF_NONE(0L), TAPF_HASSTAGGER(1L), TAPF_ISRTLAWARE(2L), TAPF_ALLOWCOLLECTION(4L), TAPF_HASBACKGROUND(8L), TAPF_HASPERSPECTIVE(16L);

    companion object {
        fun fromValue(v: Long): TA_PROPERTY_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown TA_PROPERTY_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TA_TRANSFORM_TYPE}
 */
enum class TA_TRANSFORM_TYPE(val value: Long) {
    TATT_TRANSLATE_2D(0L), TATT_SCALE_2D(1L), TATT_OPACITY(2L), TATT_CLIP(3L);

    companion object {
        fun fromValue(v: Long): TA_TRANSFORM_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown TA_TRANSFORM_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TA_TRANSFORM_FLAG}
 */
enum class TA_TRANSFORM_FLAG(val value: Long) {
    TATF_NONE(0L), TATF_TARGETVALUES_USER(1L), TATF_HASINITIALVALUES(2L), TATF_HASORIGINVALUES(4L);

    companion object {
        fun fromValue(v: Long): TA_TRANSFORM_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown TA_TRANSFORM_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TA_TIMINGFUNCTION_TYPE}
 */
enum class TA_TIMINGFUNCTION_TYPE(val value: Long) {
    TTFT_UNDEFINED(0L), TTFT_CUBIC_BEZIER(1L);

    companion object {
        fun fromValue(v: Long): TA_TIMINGFUNCTION_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown TA_TIMINGFUNCTION_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum THEMESIZE}
 */
enum class THEMESIZE(val value: Long) {
    TS_MIN(0L), TS_TRUE(1L), TS_DRAW(2L);

    companion object {
        fun fromValue(v: Long): THEMESIZE = entries.firstOrNull { it.value == v }
            ?: error("Unknown THEMESIZE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum PROPERTYORIGIN}
 */
enum class PROPERTYORIGIN(val value: Long) {
    PO_STATE(0L), PO_PART(1L), PO_CLASS(2L), PO_GLOBAL(3L), PO_NOTFOUND(4L);

    companion object {
        fun fromValue(v: Long): PROPERTYORIGIN = entries.firstOrNull { it.value == v }
            ?: error("Unknown PROPERTYORIGIN value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum WINDOWTHEMEATTRIBUTETYPE}
 */
enum class WINDOWTHEMEATTRIBUTETYPE(val value: Long) {
    WTA_NONCLIENT(1L);

    companion object {
        fun fromValue(v: Long): WINDOWTHEMEATTRIBUTETYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown WINDOWTHEMEATTRIBUTETYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _BP_BUFFERFORMAT}
 */
enum class _BP_BUFFERFORMAT(val value: Long) {
    BPBF_COMPATIBLEBITMAP(0L), BPBF_DIB(1L), BPBF_TOPDOWNDIB(2L), BPBF_TOPDOWNMONODIB(3L);

    companion object {
        fun fromValue(v: Long): _BP_BUFFERFORMAT = entries.firstOrNull { it.value == v }
            ?: error("Unknown _BP_BUFFERFORMAT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _BP_ANIMATIONSTYLE}
 */
enum class _BP_ANIMATIONSTYLE(val value: Long) {
    BPAS_NONE(0L), BPAS_LINEAR(1L), BPAS_CUBIC(2L), BPAS_SINE(3L);

    companion object {
        fun fromValue(v: Long): _BP_ANIMATIONSTYLE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _BP_ANIMATIONSTYLE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DWMWINDOWATTRIBUTE}
 */
enum class DWMWINDOWATTRIBUTE(val value: Long) {
    DWMWA_NCRENDERING_ENABLED(1L), DWMWA_NCRENDERING_POLICY(2L), DWMWA_TRANSITIONS_FORCEDISABLED(3L), DWMWA_ALLOW_NCPAINT(4L), DWMWA_CAPTION_BUTTON_BOUNDS(5L), DWMWA_NONCLIENT_RTL_LAYOUT(6L), DWMWA_FORCE_ICONIC_REPRESENTATION(7L), DWMWA_FLIP3D_POLICY(8L), DWMWA_EXTENDED_FRAME_BOUNDS(9L), DWMWA_HAS_ICONIC_BITMAP(10L), DWMWA_DISALLOW_PEEK(11L), DWMWA_EXCLUDED_FROM_PEEK(12L), DWMWA_CLOAK(13L), DWMWA_CLOAKED(14L), DWMWA_FREEZE_REPRESENTATION(15L), DWMWA_PASSIVE_UPDATE_MODE(16L), DWMWA_USE_HOSTBACKDROPBRUSH(17L), DWMWA_USE_IMMERSIVE_DARK_MODE(20L), DWMWA_WINDOW_CORNER_PREFERENCE(33L), DWMWA_BORDER_COLOR(34L), DWMWA_CAPTION_COLOR(35L), DWMWA_TEXT_COLOR(36L), DWMWA_VISIBLE_FRAME_BORDER_THICKNESS(37L), DWMWA_SYSTEMBACKDROP_TYPE(38L), DWMWA_REDIRECTIONBITMAP_ALPHA(39L), DWMWA_BORDER_MARGINS(40L), DWMWA_LAST(41L);

    companion object {
        fun fromValue(v: Long): DWMWINDOWATTRIBUTE = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWMWINDOWATTRIBUTE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DWM_WINDOW_CORNER_PREFERENCE}
 */
enum class DWM_WINDOW_CORNER_PREFERENCE(val value: Long) {
    DWMWCP_DEFAULT(0L), DWMWCP_DONOTROUND(1L), DWMWCP_ROUND(2L), DWMWCP_ROUNDSMALL(3L);

    companion object {
        fun fromValue(v: Long): DWM_WINDOW_CORNER_PREFERENCE = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWM_WINDOW_CORNER_PREFERENCE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DWM_SYSTEMBACKDROP_TYPE}
 */
enum class DWM_SYSTEMBACKDROP_TYPE(val value: Long) {
    DWMSBT_AUTO(0L), DWMSBT_NONE(1L), DWMSBT_MAINWINDOW(2L), DWMSBT_TRANSIENTWINDOW(3L), DWMSBT_TABBEDWINDOW(4L);

    companion object {
        fun fromValue(v: Long): DWM_SYSTEMBACKDROP_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWM_SYSTEMBACKDROP_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DWMNCRENDERINGPOLICY}
 */
enum class DWMNCRENDERINGPOLICY(val value: Long) {
    DWMNCRP_USEWINDOWSTYLE(0L), DWMNCRP_DISABLED(1L), DWMNCRP_ENABLED(2L), DWMNCRP_LAST(3L);

    companion object {
        fun fromValue(v: Long): DWMNCRENDERINGPOLICY = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWMNCRENDERINGPOLICY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DWMFLIP3DWINDOWPOLICY}
 */
enum class DWMFLIP3DWINDOWPOLICY(val value: Long) {
    DWMFLIP3D_DEFAULT(0L), DWMFLIP3D_EXCLUDEBELOW(1L), DWMFLIP3D_EXCLUDEABOVE(2L), DWMFLIP3D_LAST(3L);

    companion object {
        fun fromValue(v: Long): DWMFLIP3DWINDOWPOLICY = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWMFLIP3DWINDOWPOLICY value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong DWM_FRAME_COUNT;}
 */
typealias DWM_FRAME_COUNT = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong QPC_TIME;}
 */
typealias QPC_TIME = Long

/**
 * NS_ENUM: {@snippet lang=c : enum DWM_SOURCE_FRAME_SAMPLING}
 */
enum class DWM_SOURCE_FRAME_SAMPLING(val value: Long) {
    DWM_SOURCE_FRAME_SAMPLING_POINT(0L), DWM_SOURCE_FRAME_SAMPLING_COVERAGE(1L), DWM_SOURCE_FRAME_SAMPLING_LAST(2L);

    companion object {
        fun fromValue(v: Long): DWM_SOURCE_FRAME_SAMPLING = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWM_SOURCE_FRAME_SAMPLING value: $v")
    }
}

/**
 * {@snippet lang=c : DwmEnableBlurBehindWindow typedef HRESULT = Long(typedef HWND = (Declared(HWND__))*,(typedef DWM_BLURBEHIND = Declared(_DWM_BLURBEHIND))*)
 */
private val DwmEnableBlurBehindWindow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var DwmEnableBlurBehindWindow_HANDLE: MethodHandle? = null

fun DwmEnableBlurBehindWindow(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 DwmEnableBlurBehindWindow called before init()" }
    val _handle = DwmEnableBlurBehindWindow_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : DwmExtendFrameIntoClientArea typedef HRESULT = Long(typedef HWND = (Declared(HWND__))*,(typedef MARGINS = Declared(_MARGINS))*)
 */
private val DwmExtendFrameIntoClientArea_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var DwmExtendFrameIntoClientArea_HANDLE: MethodHandle? = null

fun DwmExtendFrameIntoClientArea(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 DwmExtendFrameIntoClientArea called before init()" }
    val _handle = DwmExtendFrameIntoClientArea_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : DwmSetWindowAttribute typedef HRESULT = Long(typedef HWND = (Declared(HWND__))*,typedef DWORD = UNSIGNED = Long,typedef LPCVOID = (Void)*,typedef DWORD = UNSIGNED = Long)
 */
private val DwmSetWindowAttribute_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var DwmSetWindowAttribute_HANDLE: MethodHandle? = null

fun DwmSetWindowAttribute(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: Int): Int {
    check(_initialized) { "Win32 DwmSetWindowAttribute called before init()" }
    val _handle = DwmSetWindowAttribute_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DWMTRANSITION_OWNEDWINDOW_TARGET}
 */
enum class DWMTRANSITION_OWNEDWINDOW_TARGET(val value: Long) {
    DWMTRANSITION_OWNEDWINDOW_NULL(-1L), DWMTRANSITION_OWNEDWINDOW_REPOSITION(0L);

    companion object {
        fun fromValue(v: Long): DWMTRANSITION_OWNEDWINDOW_TARGET = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWMTRANSITION_OWNEDWINDOW_TARGET value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum GESTURE_TYPE}
 */
enum class GESTURE_TYPE(val value: Long) {
    GT_PEN_TAP(0L), GT_PEN_DOUBLETAP(1L), GT_PEN_RIGHTTAP(2L), GT_PEN_PRESSANDHOLD(3L), GT_PEN_PRESSANDHOLDABORT(4L), GT_TOUCH_TAP(5L), GT_TOUCH_DOUBLETAP(6L), GT_TOUCH_RIGHTTAP(7L), GT_TOUCH_PRESSANDHOLD(8L), GT_TOUCH_PRESSANDHOLDABORT(9L), GT_TOUCH_PRESSANDTAP(10L);

    companion object {
        fun fromValue(v: Long): GESTURE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown GESTURE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DWM_SHOWCONTACT}
 */
enum class DWM_SHOWCONTACT(val value: Long) {
    DWMSC_DOWN(1L), DWMSC_UP(2L), DWMSC_DRAG(4L), DWMSC_HOLD(8L), DWMSC_PENBARREL(16L), DWMSC_NONE(0L), DWMSC_ALL(-1L);

    companion object {
        fun fromValue(v: Long): DWM_SHOWCONTACT = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWM_SHOWCONTACT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DWM_TAB_WINDOW_REQUIREMENTS}
 */
enum class DWM_TAB_WINDOW_REQUIREMENTS(val value: Long) {
    DWMTWR_NONE(0L), DWMTWR_IMPLEMENTED_BY_SYSTEM(1L), DWMTWR_WINDOW_RELATIONSHIP(2L), DWMTWR_WINDOW_STYLES(4L), DWMTWR_WINDOW_REGION(8L), DWMTWR_WINDOW_DWM_ATTRIBUTES(16L), DWMTWR_WINDOW_MARGINS(32L), DWMTWR_TABBING_ENABLED(64L), DWMTWR_USER_POLICY(128L), DWMTWR_GROUP_POLICY(256L), DWMTWR_APP_COMPAT(512L);

    companion object {
        fun fromValue(v: Long): DWM_TAB_WINDOW_REQUIREMENTS = entries.firstOrNull { it.value == v }
            ?: error("Unknown DWM_TAB_WINDOW_REQUIREMENTS value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Double max_align_t;}
 */
typealias max_align_t = Double

/**
 * NS_ENUM: {@snippet lang=c : enum tagREGCLS}
 */
enum class tagREGCLS(val value: Long) {
    REGCLS_SINGLEUSE(0L), REGCLS_MULTIPLEUSE(1L), REGCLS_MULTI_SEPARATE(2L), REGCLS_SUSPENDED(4L), REGCLS_SURROGATE(8L), REGCLS_AGILE(16L);

    companion object {
        fun fromValue(v: Long): tagREGCLS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagREGCLS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCOINITBASE}
 */
enum class tagCOINITBASE(val value: Long) {
    COINITBASE_MULTITHREADED(0L);

    companion object {
        fun fromValue(v: Long): tagCOINITBASE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCOINITBASE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagACTIVATIONTYPE}
 */
enum class tagACTIVATIONTYPE(val value: Long) {
    ACTIVATIONTYPE_UNCATEGORIZED(0L), ACTIVATIONTYPE_FROM_MONIKER(1L), ACTIVATIONTYPE_FROM_DATA(2L), ACTIVATIONTYPE_FROM_STORAGE(4L), ACTIVATIONTYPE_FROM_STREAM(8L), ACTIVATIONTYPE_FROM_FILE(16L);

    companion object {
        fun fromValue(v: Long): tagACTIVATIONTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagACTIVATIONTYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagEXTCONN}
 */
enum class tagEXTCONN(val value: Long) {
    EXTCONN_STRONG(1L), EXTCONN_WEAK(2L), EXTCONN_CALLABLE(4L);

    companion object {
        fun fromValue(v: Long): tagEXTCONN = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagEXTCONN value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSTGTY}
 */
enum class tagSTGTY(val value: Long) {
    STGTY_STORAGE(1L), STGTY_STREAM(2L), STGTY_LOCKBYTES(3L), STGTY_PROPERTY(4L);

    companion object {
        fun fromValue(v: Long): tagSTGTY = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSTGTY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSTREAM_SEEK}
 */
enum class tagSTREAM_SEEK(val value: Long) {
    STREAM_SEEK_SET(0L), STREAM_SEEK_CUR(1L), STREAM_SEEK_END(2L);

    companion object {
        fun fromValue(v: Long): tagSTREAM_SEEK = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSTREAM_SEEK value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagLOCKTYPE}
 */
enum class tagLOCKTYPE(val value: Long) {
    LOCK_WRITE(1L), LOCK_EXCLUSIVE(2L), LOCK_ONLYONCE(4L);

    companion object {
        fun fromValue(v: Long): tagLOCKTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagLOCKTYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long RPCOLEDATAREP;}
 */
typealias RPCOLEDATAREP = Int

/**
 * NS_ENUM: {@snippet lang=c : enum tagEOLE_AUTHENTICATION_CAPABILITIES}
 */
enum class tagEOLE_AUTHENTICATION_CAPABILITIES(val value: Long) {
    EOAC_NONE(0L), EOAC_MUTUAL_AUTH(1L), EOAC_STATIC_CLOAKING(32L), EOAC_DYNAMIC_CLOAKING(64L), EOAC_ANY_AUTHORITY(128L), EOAC_MAKE_FULLSIC(256L), EOAC_DEFAULT(2048L), EOAC_SECURE_REFS(2L), EOAC_ACCESS_CONTROL(4L), EOAC_APPID(8L), EOAC_DYNAMIC(16L), EOAC_REQUIRE_FULLSIC(512L), EOAC_AUTO_IMPERSONATE(1024L), EOAC_DISABLE_AAA(4096L), EOAC_NO_CUSTOM_MARSHAL(8192L), EOAC_RESERVED1(16384L);

    companion object {
        fun fromValue(v: Long): tagEOLE_AUTHENTICATION_CAPABILITIES = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagEOLE_AUTHENTICATION_CAPABILITIES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagRPCOPT_PROPERTIES}
 */
enum class tagRPCOPT_PROPERTIES(val value: Long) {
    COMBND_RPCTIMEOUT(1L), COMBND_SERVER_LOCALITY(2L), COMBND_RESERVED1(4L), COMBND_RESERVED2(5L), COMBND_RESERVED3(8L), COMBND_RESERVED4(16L);

    companion object {
        fun fromValue(v: Long): tagRPCOPT_PROPERTIES = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagRPCOPT_PROPERTIES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagRPCOPT_SERVER_LOCALITY_VALUES}
 */
enum class tagRPCOPT_SERVER_LOCALITY_VALUES(val value: Long) {
    SERVER_LOCALITY_PROCESS_LOCAL(0L), SERVER_LOCALITY_MACHINE_LOCAL(1L), SERVER_LOCALITY_REMOTE(2L);

    companion object {
        fun fromValue(v: Long): tagRPCOPT_SERVER_LOCALITY_VALUES = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagRPCOPT_SERVER_LOCALITY_VALUES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagGLOBALOPT_PROPERTIES}
 */
enum class tagGLOBALOPT_PROPERTIES(val value: Long) {
    COMGLB_EXCEPTION_HANDLING(1L), COMGLB_APPID(2L), COMGLB_RPC_THREADPOOL_SETTING(3L), COMGLB_RO_SETTINGS(4L), COMGLB_UNMARSHALING_POLICY(5L), COMGLB_PROPERTIES_RESERVED1(6L), COMGLB_PROPERTIES_RESERVED2(7L), COMGLB_PROPERTIES_RESERVED3(8L);

    companion object {
        fun fromValue(v: Long): tagGLOBALOPT_PROPERTIES = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagGLOBALOPT_PROPERTIES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagGLOBALOPT_EH_VALUES}
 */
enum class tagGLOBALOPT_EH_VALUES(val value: Long) {
    COMGLB_EXCEPTION_HANDLE(0L), COMGLB_EXCEPTION_DONOT_HANDLE_FATAL(1L), COMGLB_EXCEPTION_DONOT_HANDLE(1L), COMGLB_EXCEPTION_DONOT_HANDLE_ANY(2L);

    companion object {
        fun fromValue(v: Long): tagGLOBALOPT_EH_VALUES = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagGLOBALOPT_EH_VALUES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagGLOBALOPT_RPCTP_VALUES}
 */
enum class tagGLOBALOPT_RPCTP_VALUES(val value: Long) {
    COMGLB_RPC_THREADPOOL_SETTING_DEFAULT_POOL(0L), COMGLB_RPC_THREADPOOL_SETTING_PRIVATE_POOL(1L);

    companion object {
        fun fromValue(v: Long): tagGLOBALOPT_RPCTP_VALUES = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagGLOBALOPT_RPCTP_VALUES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagGLOBALOPT_RO_FLAGS}
 */
enum class tagGLOBALOPT_RO_FLAGS(val value: Long) {
    COMGLB_STA_MODALLOOP_REMOVE_TOUCH_MESSAGES(1L), COMGLB_STA_MODALLOOP_SHARED_QUEUE_REMOVE_INPUT_MESSAGES(2L), COMGLB_STA_MODALLOOP_SHARED_QUEUE_DONOT_REMOVE_INPUT_MESSAGES(4L), COMGLB_FAST_RUNDOWN(8L), COMGLB_RESERVED1(16L), COMGLB_RESERVED2(32L), COMGLB_RESERVED3(64L), COMGLB_STA_MODALLOOP_SHARED_QUEUE_REORDER_POINTER_MESSAGES(128L), COMGLB_RESERVED4(256L), COMGLB_RESERVED5(512L), COMGLB_RESERVED6(1024L);

    companion object {
        fun fromValue(v: Long): tagGLOBALOPT_RO_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagGLOBALOPT_RO_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagGLOBALOPT_UNMARSHALING_POLICY_VALUES}
 */
enum class tagGLOBALOPT_UNMARSHALING_POLICY_VALUES(val value: Long) {
    COMGLB_UNMARSHALING_POLICY_NORMAL(0L), COMGLB_UNMARSHALING_POLICY_STRONG(1L), COMGLB_UNMARSHALING_POLICY_HYBRID(2L);

    companion object {
        fun fromValue(v: Long): tagGLOBALOPT_UNMARSHALING_POLICY_VALUES = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagGLOBALOPT_UNMARSHALING_POLICY_VALUES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagDCOM_CALL_STATE}
 */
enum class tagDCOM_CALL_STATE(val value: Long) {
    DCOM_NONE(0L), DCOM_CALL_COMPLETE(1L), DCOM_CALL_CANCELED(2L);

    companion object {
        fun fromValue(v: Long): tagDCOM_CALL_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagDCOM_CALL_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _APTTYPEQUALIFIER}
 */
enum class _APTTYPEQUALIFIER(val value: Long) {
    APTTYPEQUALIFIER_NONE(0L), APTTYPEQUALIFIER_IMPLICIT_MTA(1L), APTTYPEQUALIFIER_NA_ON_MTA(2L), APTTYPEQUALIFIER_NA_ON_STA(3L), APTTYPEQUALIFIER_NA_ON_IMPLICIT_MTA(4L), APTTYPEQUALIFIER_NA_ON_MAINSTA(5L), APTTYPEQUALIFIER_APPLICATION_STA(6L), APTTYPEQUALIFIER_RESERVED_1(7L);

    companion object {
        fun fromValue(v: Long): _APTTYPEQUALIFIER = entries.firstOrNull { it.value == v }
            ?: error("Unknown _APTTYPEQUALIFIER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _APTTYPE}
 */
enum class _APTTYPE(val value: Long) {
    APTTYPE_CURRENT(-1L), APTTYPE_STA(0L), APTTYPE_MTA(1L), APTTYPE_NA(2L), APTTYPE_MAINSTA(3L);

    companion object {
        fun fromValue(v: Long): _APTTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _APTTYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _THDTYPE}
 */
enum class _THDTYPE(val value: Long) {
    THDTYPE_BLOCKMESSAGES(0L), THDTYPE_PROCESSMESSAGES(1L);

    companion object {
        fun fromValue(v: Long): _THDTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _THDTYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long APARTMENTID;}
 */
typealias APARTMENTID = Int

/**
 * NS_ENUM: {@snippet lang=c : enum CO_MARSHALING_CONTEXT_ATTRIBUTES}
 */
enum class CO_MARSHALING_CONTEXT_ATTRIBUTES(val value: Long) {
    CO_MARSHALING_SOURCE_IS_APP_CONTAINER(0L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_1(-2147483648L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_2(-2147483647L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_3(-2147483646L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_4(-2147483645L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_5(-2147483644L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_6(-2147483643L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_7(-2147483642L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_8(-2147483641L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_9(-2147483640L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_10(-2147483639L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_11(-2147483638L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_12(-2147483637L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_13(-2147483636L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_14(-2147483635L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_15(-2147483634L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_16(-2147483633L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_17(-2147483632L), CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_18(-2147483631L);

    companion object {
        fun fromValue(v: Long): CO_MARSHALING_CONTEXT_ATTRIBUTES = entries.firstOrNull { it.value == v }
            ?: error("Unknown CO_MARSHALING_CONTEXT_ATTRIBUTES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagBIND_FLAGS}
 */
enum class tagBIND_FLAGS(val value: Long) {
    BIND_MAYBOTHERUSER(1L), BIND_JUSTTESTEXISTENCE(2L);

    companion object {
        fun fromValue(v: Long): tagBIND_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagBIND_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagMKSYS}
 */
enum class tagMKSYS(val value: Long) {
    MKSYS_NONE(0L), MKSYS_GENERICCOMPOSITE(1L), MKSYS_FILEMONIKER(2L), MKSYS_ANTIMONIKER(3L), MKSYS_ITEMMONIKER(4L), MKSYS_POINTERMONIKER(5L), MKSYS_CLASSMONIKER(7L), MKSYS_OBJREFMONIKER(8L), MKSYS_SESSIONMONIKER(9L), MKSYS_LUAMONIKER(10L);

    companion object {
        fun fromValue(v: Long): tagMKSYS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagMKSYS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagMKREDUCE}
 */
enum class tagMKREDUCE(val value: Long) {
    MKRREDUCE_ONE(196608L), MKRREDUCE_TOUSER(131072L), MKRREDUCE_THROUGHUSER(65536L), MKRREDUCE_ALL(0L);

    companion object {
        fun fromValue(v: Long): tagMKREDUCE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagMKREDUCE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagADVF}
 */
enum class tagADVF(val value: Long) {
    ADVF_NODATA(1L), ADVF_PRIMEFIRST(2L), ADVF_ONLYONCE(4L), ADVF_DATAONSTOP(64L), ADVFCACHE_NOHANDLER(8L), ADVFCACHE_FORCEBUILTIN(16L), ADVFCACHE_ONSAVE(32L);

    companion object {
        fun fromValue(v: Long): tagADVF = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagADVF value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagTYMED}
 */
enum class tagTYMED(val value: Long) {
    TYMED_HGLOBAL(1L), TYMED_FILE(2L), TYMED_ISTREAM(4L), TYMED_ISTORAGE(8L), TYMED_GDI(16L), TYMED_MFPICT(32L), TYMED_ENHMF(64L), TYMED_NULL(0L);

    companion object {
        fun fromValue(v: Long): tagTYMED = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagTYMED value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagDATADIR}
 */
enum class tagDATADIR(val value: Long) {
    DATADIR_GET(1L), DATADIR_SET(2L);

    companion object {
        fun fromValue(v: Long): tagDATADIR = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagDATADIR value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCALLTYPE}
 */
enum class tagCALLTYPE(val value: Long) {
    CALLTYPE_TOPLEVEL(1L), CALLTYPE_NESTED(2L), CALLTYPE_ASYNC(3L), CALLTYPE_TOPLEVEL_CALLPENDING(4L), CALLTYPE_ASYNC_CALLPENDING(5L);

    companion object {
        fun fromValue(v: Long): tagCALLTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCALLTYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSERVERCALL}
 */
enum class tagSERVERCALL(val value: Long) {
    SERVERCALL_ISHANDLED(0L), SERVERCALL_REJECTED(1L), SERVERCALL_RETRYLATER(2L);

    companion object {
        fun fromValue(v: Long): tagSERVERCALL = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSERVERCALL value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPENDINGTYPE}
 */
enum class tagPENDINGTYPE(val value: Long) {
    PENDINGTYPE_TOPLEVEL(1L), PENDINGTYPE_NESTED(2L);

    companion object {
        fun fromValue(v: Long): tagPENDINGTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPENDINGTYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPENDINGMSG}
 */
enum class tagPENDINGMSG(val value: Long) {
    PENDINGMSG_CANCELCALL(0L), PENDINGMSG_WAITNOPROCESS(1L), PENDINGMSG_WAITDEFPROCESS(2L);

    companion object {
        fun fromValue(v: Long): tagPENDINGMSG = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPENDINGMSG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagApplicationType}
 */
enum class tagApplicationType(val value: Long) {
    ServerApplication(0L), LibraryApplication(1L);

    companion object {
        fun fromValue(v: Long): tagApplicationType = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagApplicationType value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagShutdownType}
 */
enum class tagShutdownType(val value: Long) {
    IdleShutdown(0L), ForcedShutdown(1L);

    companion object {
        fun fromValue(v: Long): tagShutdownType = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagShutdownType value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSF_TYPE}
 */
enum class tagSF_TYPE(val value: Long) {
    SF_ERROR(10L), SF_I1(16L), SF_I2(2L), SF_I4(3L), SF_I8(20L), SF_BSTR(8L), SF_UNKNOWN(13L), SF_DISPATCH(9L), SF_VARIANT(12L), SF_RECORD(36L), SF_HAVEIID(32781L);

    companion object {
        fun fromValue(v: Long): tagSF_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSF_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Long DISPID;}
 */
typealias DISPID = Int

/**
 * {@snippet lang=c : typedef Long MEMBERID;}
 */
typealias MEMBERID = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long HREFTYPE;}
 */
typealias HREFTYPE = Int

/**
 * NS_ENUM: {@snippet lang=c : enum tagTYPEKIND}
 */
enum class tagTYPEKIND(val value: Long) {
    TKIND_ENUM(0L), TKIND_RECORD(1L), TKIND_MODULE(2L), TKIND_INTERFACE(3L), TKIND_DISPATCH(4L), TKIND_COCLASS(5L), TKIND_ALIAS(6L), TKIND_UNION(7L), TKIND_MAX(8L);

    companion object {
        fun fromValue(v: Long): tagTYPEKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagTYPEKIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCALLCONV}
 */
enum class tagCALLCONV(val value: Long) {
    CC_FASTCALL(0L), CC_CDECL(1L), CC_MSCPASCAL(2L), CC_PASCAL(2L), CC_MACPASCAL(3L), CC_STDCALL(4L), CC_FPFASTCALL(5L), CC_SYSCALL(6L), CC_MPWCDECL(7L), CC_MPWPASCAL(8L), CC_MAX(9L);

    companion object {
        fun fromValue(v: Long): tagCALLCONV = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCALLCONV value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagFUNCKIND}
 */
enum class tagFUNCKIND(val value: Long) {
    FUNC_VIRTUAL(0L), FUNC_PUREVIRTUAL(1L), FUNC_NONVIRTUAL(2L), FUNC_STATIC(3L), FUNC_DISPATCH(4L);

    companion object {
        fun fromValue(v: Long): tagFUNCKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagFUNCKIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagINVOKEKIND}
 */
enum class tagINVOKEKIND(val value: Long) {
    INVOKE_FUNC(1L), INVOKE_PROPERTYGET(2L), INVOKE_PROPERTYPUT(4L), INVOKE_PROPERTYPUTREF(8L);

    companion object {
        fun fromValue(v: Long): tagINVOKEKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagINVOKEKIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagVARKIND}
 */
enum class tagVARKIND(val value: Long) {
    VAR_PERINSTANCE(0L), VAR_STATIC(1L), VAR_CONST(2L), VAR_DISPATCH(3L);

    companion object {
        fun fromValue(v: Long): tagVARKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagVARKIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagTYPEFLAGS}
 */
enum class tagTYPEFLAGS(val value: Long) {
    TYPEFLAG_FAPPOBJECT(1L), TYPEFLAG_FCANCREATE(2L), TYPEFLAG_FLICENSED(4L), TYPEFLAG_FPREDECLID(8L), TYPEFLAG_FHIDDEN(16L), TYPEFLAG_FCONTROL(32L), TYPEFLAG_FDUAL(64L), TYPEFLAG_FNONEXTENSIBLE(128L), TYPEFLAG_FOLEAUTOMATION(256L), TYPEFLAG_FRESTRICTED(512L), TYPEFLAG_FAGGREGATABLE(1024L), TYPEFLAG_FREPLACEABLE(2048L), TYPEFLAG_FDISPATCHABLE(4096L), TYPEFLAG_FREVERSEBIND(8192L), TYPEFLAG_FPROXY(16384L);

    companion object {
        fun fromValue(v: Long): tagTYPEFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagTYPEFLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagFUNCFLAGS}
 */
enum class tagFUNCFLAGS(val value: Long) {
    FUNCFLAG_FRESTRICTED(1L), FUNCFLAG_FSOURCE(2L), FUNCFLAG_FBINDABLE(4L), FUNCFLAG_FREQUESTEDIT(8L), FUNCFLAG_FDISPLAYBIND(16L), FUNCFLAG_FDEFAULTBIND(32L), FUNCFLAG_FHIDDEN(64L), FUNCFLAG_FUSESGETLASTERROR(128L), FUNCFLAG_FDEFAULTCOLLELEM(256L), FUNCFLAG_FUIDEFAULT(512L), FUNCFLAG_FNONBROWSABLE(1024L), FUNCFLAG_FREPLACEABLE(2048L), FUNCFLAG_FIMMEDIATEBIND(4096L);

    companion object {
        fun fromValue(v: Long): tagFUNCFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagFUNCFLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagVARFLAGS}
 */
enum class tagVARFLAGS(val value: Long) {
    VARFLAG_FREADONLY(1L), VARFLAG_FSOURCE(2L), VARFLAG_FBINDABLE(4L), VARFLAG_FREQUESTEDIT(8L), VARFLAG_FDISPLAYBIND(16L), VARFLAG_FDEFAULTBIND(32L), VARFLAG_FHIDDEN(64L), VARFLAG_FRESTRICTED(128L), VARFLAG_FDEFAULTCOLLELEM(256L), VARFLAG_FUIDEFAULT(512L), VARFLAG_FNONBROWSABLE(1024L), VARFLAG_FREPLACEABLE(2048L), VARFLAG_FIMMEDIATEBIND(4096L);

    companion object {
        fun fromValue(v: Long): tagVARFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagVARFLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagDESCKIND}
 */
enum class tagDESCKIND(val value: Long) {
    DESCKIND_NONE(0L), DESCKIND_FUNCDESC(1L), DESCKIND_VARDESC(2L), DESCKIND_TYPECOMP(3L), DESCKIND_IMPLICITAPPOBJ(4L), DESCKIND_MAX(5L);

    companion object {
        fun fromValue(v: Long): tagDESCKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagDESCKIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSYSKIND}
 */
enum class tagSYSKIND(val value: Long) {
    SYS_WIN16(0L), SYS_WIN32(1L), SYS_MAC(2L), SYS_WIN64(3L);

    companion object {
        fun fromValue(v: Long): tagSYSKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSYSKIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagLIBFLAGS}
 */
enum class tagLIBFLAGS(val value: Long) {
    LIBFLAG_FRESTRICTED(1L), LIBFLAG_FCONTROL(2L), LIBFLAG_FHIDDEN(4L), LIBFLAG_FHASDISKIMAGE(8L);

    companion object {
        fun fromValue(v: Long): tagLIBFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagLIBFLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCHANGEKIND}
 */
enum class tagCHANGEKIND(val value: Long) {
    CHANGEKIND_ADDMEMBER(0L), CHANGEKIND_DELETEMEMBER(1L), CHANGEKIND_SETNAMES(2L), CHANGEKIND_SETDOCUMENTATION(3L), CHANGEKIND_GENERAL(4L), CHANGEKIND_INVALIDATE(5L), CHANGEKIND_CHANGEFAILED(6L), CHANGEKIND_MAX(7L);

    companion object {
        fun fromValue(v: Long): tagCHANGEKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCHANGEKIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagREGKIND}
 */
enum class tagREGKIND(val value: Long) {
    REGKIND_DEFAULT(0L), REGKIND_REGISTER(1L), REGKIND_NONE(2L);

    companion object {
        fun fromValue(v: Long): tagREGKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagREGKIND value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PROPVAR_PAD1;}
 */
typealias PROPVAR_PAD1 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PROPVAR_PAD2;}
 */
typealias PROPVAR_PAD2 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short PROPVAR_PAD3;}
 */
typealias PROPVAR_PAD3 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Long STGFMT;}
 */
typealias STGFMT = Int

/**
 * NS_ENUM: {@snippet lang=c : enum tagDISCARDCACHE}
 */
enum class tagDISCARDCACHE(val value: Long) {
    DISCARDCACHE_SAVEIFDIRTY(0L), DISCARDCACHE_NOSAVE(1L);

    companion object {
        fun fromValue(v: Long): tagDISCARDCACHE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagDISCARDCACHE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLEGETMONIKER}
 */
enum class tagOLEGETMONIKER(val value: Long) {
    OLEGETMONIKER_ONLYIFTHERE(1L), OLEGETMONIKER_FORCEASSIGN(2L), OLEGETMONIKER_UNASSIGN(3L), OLEGETMONIKER_TEMPFORUSER(4L);

    companion object {
        fun fromValue(v: Long): tagOLEGETMONIKER = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLEGETMONIKER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLEWHICHMK}
 */
enum class tagOLEWHICHMK(val value: Long) {
    OLEWHICHMK_CONTAINER(1L), OLEWHICHMK_OBJREL(2L), OLEWHICHMK_OBJFULL(3L);

    companion object {
        fun fromValue(v: Long): tagOLEWHICHMK = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLEWHICHMK value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagUSERCLASSTYPE}
 */
enum class tagUSERCLASSTYPE(val value: Long) {
    USERCLASSTYPE_FULL(1L), USERCLASSTYPE_SHORT(2L), USERCLASSTYPE_APPNAME(3L);

    companion object {
        fun fromValue(v: Long): tagUSERCLASSTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagUSERCLASSTYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLEMISC}
 */
enum class tagOLEMISC(val value: Long) {
    OLEMISC_RECOMPOSEONRESIZE(1L), OLEMISC_ONLYICONIC(2L), OLEMISC_INSERTNOTREPLACE(4L), OLEMISC_STATIC(8L), OLEMISC_CANTLINKINSIDE(16L), OLEMISC_CANLINKBYOLE1(32L), OLEMISC_ISLINKOBJECT(64L), OLEMISC_INSIDEOUT(128L), OLEMISC_ACTIVATEWHENVISIBLE(256L), OLEMISC_RENDERINGISDEVICEINDEPENDENT(512L), OLEMISC_INVISIBLEATRUNTIME(1024L), OLEMISC_ALWAYSRUN(2048L), OLEMISC_ACTSLIKEBUTTON(4096L), OLEMISC_ACTSLIKELABEL(8192L), OLEMISC_NOUIACTIVATE(16384L), OLEMISC_ALIGNABLE(32768L), OLEMISC_SIMPLEFRAME(65536L), OLEMISC_SETCLIENTSITEFIRST(131072L), OLEMISC_IMEMODE(262144L), OLEMISC_IGNOREACTIVATEWHENVISIBLE(524288L), OLEMISC_WANTSTOMENUMERGE(1048576L), OLEMISC_SUPPORTSMULTILEVELUNDO(2097152L);

    companion object {
        fun fromValue(v: Long): tagOLEMISC = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLEMISC value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLECLOSE}
 */
enum class tagOLECLOSE(val value: Long) {
    OLECLOSE_SAVEIFDIRTY(0L), OLECLOSE_NOSAVE(1L), OLECLOSE_PROMPTSAVE(2L);

    companion object {
        fun fromValue(v: Long): tagOLECLOSE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLECLOSE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLERENDER}
 */
enum class tagOLERENDER(val value: Long) {
    OLERENDER_NONE(0L), OLERENDER_DRAW(1L), OLERENDER_FORMAT(2L), OLERENDER_ASIS(3L);

    companion object {
        fun fromValue(v: Long): tagOLERENDER = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLERENDER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLEUPDATE}
 */
enum class tagOLEUPDATE(val value: Long) {
    OLEUPDATE_ALWAYS(1L), OLEUPDATE_ONCALL(3L);

    companion object {
        fun fromValue(v: Long): tagOLEUPDATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLEUPDATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLELINKBIND}
 */
enum class tagOLELINKBIND(val value: Long) {
    OLELINKBIND_EVENIFCLASSDIFF(1L);

    companion object {
        fun fromValue(v: Long): tagOLELINKBIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLELINKBIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagBINDSPEED}
 */
enum class tagBINDSPEED(val value: Long) {
    BINDSPEED_INDEFINITE(1L), BINDSPEED_MODERATE(2L), BINDSPEED_IMMEDIATE(3L);

    companion object {
        fun fromValue(v: Long): tagBINDSPEED = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagBINDSPEED value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLECONTF}
 */
enum class tagOLECONTF(val value: Long) {
    OLECONTF_EMBEDDINGS(1L), OLECONTF_LINKS(2L), OLECONTF_OTHERS(4L), OLECONTF_ONLYUSER(8L), OLECONTF_ONLYIFRUNNING(16L);

    companion object {
        fun fromValue(v: Long): tagOLECONTF = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLECONTF value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLEVERBATTRIB}
 */
enum class tagOLEVERBATTRIB(val value: Long) {
    OLEVERBATTRIB_NEVERDIRTIES(1L), OLEVERBATTRIB_ONCONTAINERMENU(2L);

    companion object {
        fun fromValue(v: Long): tagOLEVERBATTRIB = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLEVERBATTRIB value: $v")
    }
}

/**
 * {@snippet lang=c : CoUninitialize Void()
 */
private val CoUninitialize_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private var CoUninitialize_HANDLE: MethodHandle? = null

fun CoUninitialize(): Unit {
    check(_initialized) { "Win32 CoUninitialize called before init()" }
    val _handle = CoUninitialize_HANDLE ?: return
    try {
        _handle.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        // ignore — null handle on non-Windows
    }
}

/**
 * {@snippet lang=c : CoInitializeEx typedef HRESULT = Long(typedef LPVOID = (Void)*,typedef DWORD = UNSIGNED = Long)
 */
private val CoInitializeEx_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var CoInitializeEx_HANDLE: MethodHandle? = null

fun CoInitializeEx(arg0: MemorySegment, arg1: Int): Int {
    check(_initialized) { "Win32 CoInitializeEx called before init()" }
    val _handle = CoInitializeEx_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagSTDMSHLFLAGS}
 */
enum class tagSTDMSHLFLAGS(val value: Long) {
    SMEXF_SERVER(1L), SMEXF_HANDLER(2L);

    companion object {
        fun fromValue(v: Long): tagSTDMSHLFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSTDMSHLFLAGS value: $v")
    }
}

/**
 * {@snippet lang=c : CoCreateInstance typedef HRESULT = Long((typedef IID = Declared(_GUID))*,typedef LPUNKNOWN = (Void)*,typedef DWORD = UNSIGNED = Long,(typedef IID = Declared(_GUID))*,(typedef LPVOID = (Void)*)*)
 */
private val CoCreateInstance_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var CoCreateInstance_HANDLE: MethodHandle? = null

fun CoCreateInstance(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: MemorySegment, arg4: MemorySegment): Int {
    check(_initialized) { "Win32 CoCreateInstance called before init()" }
    val _handle = CoCreateInstance_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCOWAIT_FLAGS}
 */
enum class tagCOWAIT_FLAGS(val value: Long) {
    COWAIT_DEFAULT(0L), COWAIT_WAITALL(1L), COWAIT_ALERTABLE(2L), COWAIT_INPUTAVAILABLE(4L), COWAIT_DISPATCH_CALLS(8L), COWAIT_DISPATCH_WINDOW_MESSAGES(16L);

    companion object {
        fun fromValue(v: Long): tagCOWAIT_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCOWAIT_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum CWMO_FLAGS}
 */
enum class CWMO_FLAGS(val value: Long) {
    CWMO_DEFAULT(0L), CWMO_DISPATCH_CALLS(1L), CWMO_DISPATCH_WINDOW_MESSAGES(2L);

    companion object {
        fun fromValue(v: Long): CWMO_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown CWMO_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum AgileReferenceOptions}
 */
enum class AgileReferenceOptions(val value: Long) {
    AGILEREFERENCE_DEFAULT(0L), AGILEREFERENCE_DELAYEDMARSHAL(1L);

    companion object {
        fun fromValue(v: Long): AgileReferenceOptions = entries.firstOrNull { it.value == v }
            ?: error("Unknown AgileReferenceOptions value: $v")
    }
}

/**
 * {@snippet lang=c : CoTaskMemAlloc typedef LPVOID = (Void)*(typedef SIZE_T = UNSIGNED = LongLong)
 */
private val CoTaskMemAlloc_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private var CoTaskMemAlloc_HANDLE: MethodHandle? = null

fun CoTaskMemAlloc(arg0: Long): MemorySegment {
    check(_initialized) { "Win32 CoTaskMemAlloc called before init()" }
    val _handle = CoTaskMemAlloc_HANDLE ?: return MemorySegment.NULL
    try {
        return _handle.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return MemorySegment.NULL
    }
}

/**
 * {@snippet lang=c : CoTaskMemFree Void(typedef LPVOID = (Void)*)
 */
private val CoTaskMemFree_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private var CoTaskMemFree_HANDLE: MethodHandle? = null

fun CoTaskMemFree(arg0: MemorySegment): Unit {
    check(_initialized) { "Win32 CoTaskMemFree called before init()" }
    val _handle = CoTaskMemFree_HANDLE ?: return
    try {
        _handle.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        // ignore — null handle on non-Windows
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCOINIT}
 */
enum class tagCOINIT(val value: Long) {
    COINIT_APARTMENTTHREADED(2L), COINIT_MULTITHREADED(0L), COINIT_DISABLE_OLE1DDE(4L), COINIT_SPEED_OVER_MEMORY(8L);

    companion object {
        fun fromValue(v: Long): tagCOINIT = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCOINIT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCOMSD}
 */
enum class tagCOMSD(val value: Long) {
    SD_LAUNCHPERMISSIONS(0L), SD_ACCESSPERMISSIONS(1L), SD_LAUNCHRESTRICTIONS(2L), SD_ACCESSRESTRICTIONS(3L);

    companion object {
        fun fromValue(v: Long): tagCOMSD = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCOMSD value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagDOMNodeType}
 */
enum class tagDOMNodeType(val value: Long) {
    NODE_INVALID(0L), NODE_ELEMENT(1L), NODE_ATTRIBUTE(2L), NODE_TEXT(3L), NODE_CDATA_SECTION(4L), NODE_ENTITY_REFERENCE(5L), NODE_ENTITY(6L), NODE_PROCESSING_INSTRUCTION(7L), NODE_COMMENT(8L), NODE_DOCUMENT(9L), NODE_DOCUMENT_TYPE(10L), NODE_DOCUMENT_FRAGMENT(11L), NODE_NOTATION(12L);

    companion object {
        fun fromValue(v: Long): tagDOMNodeType = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagDOMNodeType value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagXMLEMEM_TYPE}
 */
enum class tagXMLEMEM_TYPE(val value: Long) {
    XMLELEMTYPE_ELEMENT(0L), XMLELEMTYPE_TEXT(1L), XMLELEMTYPE_COMMENT(2L), XMLELEMTYPE_DOCUMENT(3L), XMLELEMTYPE_DTD(4L), XMLELEMTYPE_PI(5L), XMLELEMTYPE_OTHER(6L);

    companion object {
        fun fromValue(v: Long): tagXMLEMEM_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagXMLEMEM_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum IEObjectType}
 */
enum class IEObjectType(val value: Long) {
    IE_EPM_OBJECT_EVENT(0L), IE_EPM_OBJECT_MUTEX(1L), IE_EPM_OBJECT_SEMAPHORE(2L), IE_EPM_OBJECT_SHARED_MEMORY(3L), IE_EPM_OBJECT_WAITABLE_TIMER(4L), IE_EPM_OBJECT_FILE(5L), IE_EPM_OBJECT_NAMED_PIPE(6L), IE_EPM_OBJECT_REGISTRY(7L);

    companion object {
        fun fromValue(v: Long): IEObjectType = entries.firstOrNull { it.value == v }
            ?: error("Unknown IEObjectType value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IMonikerProp_0001}
 */
enum class _MIDL_IMonikerProp_0001(val value: Long) {
    MIMETYPEPROP(0L), USE_SRC_URL(1L), CLASSIDPROP(2L), TRUSTEDDOWNLOADPROP(3L), POPUPLEVELPROP(4L);

    companion object {
        fun fromValue(v: Long): _MIDL_IMonikerProp_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IMonikerProp_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IBindStatusCallback_0001}
 */
enum class _MIDL_IBindStatusCallback_0001(val value: Long) {
    BINDVERB_GET(0L), BINDVERB_POST(1L), BINDVERB_PUT(2L), BINDVERB_CUSTOM(3L), BINDVERB_RESERVED1(4L);

    companion object {
        fun fromValue(v: Long): _MIDL_IBindStatusCallback_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IBindStatusCallback_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IBindStatusCallback_0002}
 */
enum class _MIDL_IBindStatusCallback_0002(val value: Long) {
    BINDINFOF_URLENCODESTGMEDDATA(1L), BINDINFOF_URLENCODEDEXTRAINFO(2L);

    companion object {
        fun fromValue(v: Long): _MIDL_IBindStatusCallback_0002 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IBindStatusCallback_0002 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IBindStatusCallback_0003}
 */
enum class _MIDL_IBindStatusCallback_0003(val value: Long) {
    BINDF_ASYNCHRONOUS(1L), BINDF_ASYNCSTORAGE(2L), BINDF_NOPROGRESSIVERENDERING(4L), BINDF_OFFLINEOPERATION(8L), BINDF_GETNEWESTVERSION(16L), BINDF_NOWRITECACHE(32L), BINDF_NEEDFILE(64L), BINDF_PULLDATA(128L), BINDF_IGNORESECURITYPROBLEM(256L), BINDF_RESYNCHRONIZE(512L), BINDF_HYPERLINK(1024L), BINDF_NO_UI(2048L), BINDF_SILENTOPERATION(4096L), BINDF_PRAGMA_NO_CACHE(8192L), BINDF_GETCLASSOBJECT(16384L), BINDF_RESERVED_1(32768L), BINDF_FREE_THREADED(65536L), BINDF_DIRECT_READ(131072L), BINDF_FORMS_SUBMIT(262144L), BINDF_GETFROMCACHE_IF_NET_FAIL(524288L), BINDF_FROMURLMON(1048576L), BINDF_FWD_BACK(2097152L), BINDF_PREFERDEFAULTHANDLER(4194304L), BINDF_ENFORCERESTRICTED(8388608L), BINDF_RESERVED_2(-2147483648L), BINDF_RESERVED_3(16777216L), BINDF_RESERVED_4(33554432L), BINDF_RESERVED_5(67108864L), BINDF_RESERVED_6(134217728L), BINDF_RESERVED_7(1073741824L), BINDF_RESERVED_8(536870912L);

    companion object {
        fun fromValue(v: Long): _MIDL_IBindStatusCallback_0003 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IBindStatusCallback_0003 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IBindStatusCallback_0004}
 */
enum class _MIDL_IBindStatusCallback_0004(val value: Long) {
    URL_ENCODING_NONE(0L), URL_ENCODING_ENABLE_UTF8(268435456L), URL_ENCODING_DISABLE_UTF8(536870912L);

    companion object {
        fun fromValue(v: Long): _MIDL_IBindStatusCallback_0004 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IBindStatusCallback_0004 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IBindStatusCallback_0005}
 */
enum class _MIDL_IBindStatusCallback_0005(val value: Long) {
    BINDINFO_OPTIONS_WININETFLAG(65536L), BINDINFO_OPTIONS_ENABLE_UTF8(131072L), BINDINFO_OPTIONS_DISABLE_UTF8(262144L), BINDINFO_OPTIONS_USE_IE_ENCODING(524288L), BINDINFO_OPTIONS_BINDTOOBJECT(1048576L), BINDINFO_OPTIONS_SECURITYOPTOUT(2097152L), BINDINFO_OPTIONS_IGNOREMIMETEXTPLAIN(4194304L), BINDINFO_OPTIONS_USEBINDSTRINGCREDS(8388608L), BINDINFO_OPTIONS_IGNOREHTTPHTTPSREDIRECTS(16777216L), BINDINFO_OPTIONS_IGNORE_SSLERRORS_ONCE(33554432L), BINDINFO_WPC_DOWNLOADBLOCKED(134217728L), BINDINFO_WPC_LOGGING_ENABLED(268435456L), BINDINFO_OPTIONS_ALLOWCONNECTDATA(536870912L), BINDINFO_OPTIONS_DISABLEAUTOREDIRECTS(1073741824L), BINDINFO_OPTIONS_SHDOCVW_NAVIGATE(-2147483648L);

    companion object {
        fun fromValue(v: Long): _MIDL_IBindStatusCallback_0005 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IBindStatusCallback_0005 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IBindStatusCallback_0006}
 */
enum class _MIDL_IBindStatusCallback_0006(val value: Long) {
    BSCF_FIRSTDATANOTIFICATION(1L), BSCF_INTERMEDIATEDATANOTIFICATION(2L), BSCF_LASTDATANOTIFICATION(4L), BSCF_DATAFULLYAVAILABLE(8L), BSCF_AVAILABLEDATASIZEUNKNOWN(16L), BSCF_SKIPDRAINDATAFORFILEURLS(32L), BSCF_64BITLENGTHDOWNLOAD(64L);

    companion object {
        fun fromValue(v: Long): _MIDL_IBindStatusCallback_0006 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IBindStatusCallback_0006 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagBINDSTATUS}
 */
enum class tagBINDSTATUS(val value: Long) {
    BINDSTATUS_FINDINGRESOURCE(1L), BINDSTATUS_CONNECTING(2L), BINDSTATUS_REDIRECTING(3L), BINDSTATUS_BEGINDOWNLOADDATA(4L), BINDSTATUS_DOWNLOADINGDATA(5L), BINDSTATUS_ENDDOWNLOADDATA(6L), BINDSTATUS_BEGINDOWNLOADCOMPONENTS(7L), BINDSTATUS_INSTALLINGCOMPONENTS(8L), BINDSTATUS_ENDDOWNLOADCOMPONENTS(9L), BINDSTATUS_USINGCACHEDCOPY(10L), BINDSTATUS_SENDINGREQUEST(11L), BINDSTATUS_CLASSIDAVAILABLE(12L), BINDSTATUS_MIMETYPEAVAILABLE(13L), BINDSTATUS_CACHEFILENAMEAVAILABLE(14L), BINDSTATUS_BEGINSYNCOPERATION(15L), BINDSTATUS_ENDSYNCOPERATION(16L), BINDSTATUS_BEGINUPLOADDATA(17L), BINDSTATUS_UPLOADINGDATA(18L), BINDSTATUS_ENDUPLOADDATA(19L), BINDSTATUS_PROTOCOLCLASSID(20L), BINDSTATUS_ENCODING(21L), BINDSTATUS_VERIFIEDMIMETYPEAVAILABLE(22L), BINDSTATUS_CLASSINSTALLLOCATION(23L), BINDSTATUS_DECODING(24L), BINDSTATUS_LOADINGMIMEHANDLER(25L), BINDSTATUS_CONTENTDISPOSITIONATTACH(26L), BINDSTATUS_FILTERREPORTMIMETYPE(27L), BINDSTATUS_CLSIDCANINSTANTIATE(28L), BINDSTATUS_IUNKNOWNAVAILABLE(29L), BINDSTATUS_DIRECTBIND(30L), BINDSTATUS_RAWMIMETYPE(31L), BINDSTATUS_PROXYDETECTING(32L), BINDSTATUS_ACCEPTRANGES(33L), BINDSTATUS_COOKIE_SENT(34L), BINDSTATUS_COMPACT_POLICY_RECEIVED(35L), BINDSTATUS_COOKIE_SUPPRESSED(36L), BINDSTATUS_COOKIE_STATE_UNKNOWN(37L), BINDSTATUS_COOKIE_STATE_ACCEPT(38L), BINDSTATUS_COOKIE_STATE_REJECT(39L), BINDSTATUS_COOKIE_STATE_PROMPT(40L), BINDSTATUS_COOKIE_STATE_LEASH(41L), BINDSTATUS_COOKIE_STATE_DOWNGRADE(42L), BINDSTATUS_POLICY_HREF(43L), BINDSTATUS_P3P_HEADER(44L), BINDSTATUS_SESSION_COOKIE_RECEIVED(45L), BINDSTATUS_PERSISTENT_COOKIE_RECEIVED(46L), BINDSTATUS_SESSION_COOKIES_ALLOWED(47L), BINDSTATUS_CACHECONTROL(48L), BINDSTATUS_CONTENTDISPOSITIONFILENAME(49L), BINDSTATUS_MIMETEXTPLAINMISMATCH(50L), BINDSTATUS_PUBLISHERAVAILABLE(51L), BINDSTATUS_DISPLAYNAMEAVAILABLE(52L), BINDSTATUS_SSLUX_NAVBLOCKED(53L), BINDSTATUS_SERVER_MIMETYPEAVAILABLE(54L), BINDSTATUS_SNIFFED_CLASSIDAVAILABLE(55L), BINDSTATUS_64BIT_PROGRESS(56L), BINDSTATUS_LAST(56L), BINDSTATUS_RESERVED_0(57L), BINDSTATUS_RESERVED_1(58L), BINDSTATUS_RESERVED_2(59L), BINDSTATUS_RESERVED_3(60L), BINDSTATUS_RESERVED_4(61L), BINDSTATUS_RESERVED_5(62L), BINDSTATUS_RESERVED_6(63L), BINDSTATUS_RESERVED_7(64L), BINDSTATUS_RESERVED_8(65L), BINDSTATUS_RESERVED_9(66L), BINDSTATUS_RESERVED_A(67L), BINDSTATUS_RESERVED_B(68L), BINDSTATUS_RESERVED_C(69L), BINDSTATUS_RESERVED_D(70L), BINDSTATUS_RESERVED_E(71L), BINDSTATUS_RESERVED_F(72L), BINDSTATUS_RESERVED_10(73L), BINDSTATUS_RESERVED_11(74L), BINDSTATUS_RESERVED_12(75L), BINDSTATUS_RESERVED_13(76L), BINDSTATUS_RESERVED_14(77L), BINDSTATUS_LAST_PRIVATE(77L);

    companion object {
        fun fromValue(v: Long): tagBINDSTATUS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagBINDSTATUS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IBindStatusCallbackEx_0001}
 */
enum class _MIDL_IBindStatusCallbackEx_0001(val value: Long) {
    BINDF2_DISABLEBASICOVERHTTP(1L), BINDF2_DISABLEAUTOCOOKIEHANDLING(2L), BINDF2_READ_DATA_GREATER_THAN_4GB(4L), BINDF2_DISABLE_HTTP_REDIRECT_XSECURITYID(8L), BINDF2_SETDOWNLOADMODE(32L), BINDF2_DISABLE_HTTP_REDIRECT_CACHING(64L), BINDF2_KEEP_CALLBACK_MODULE_LOADED(128L), BINDF2_ALLOW_PROXY_CRED_PROMPT(256L), BINDF2_RESERVED_17(512L), BINDF2_RESERVED_16(1024L), BINDF2_RESERVED_15(2048L), BINDF2_RESERVED_14(4096L), BINDF2_RESERVED_13(8192L), BINDF2_RESERVED_12(16384L), BINDF2_RESERVED_11(32768L), BINDF2_RESERVED_10(65536L), BINDF2_RESERVED_F(131072L), BINDF2_RESERVED_E(262144L), BINDF2_RESERVED_D(524288L), BINDF2_RESERVED_C(1048576L), BINDF2_RESERVED_B(2097152L), BINDF2_RESERVED_A(4194304L), BINDF2_RESERVED_9(8388608L), BINDF2_RESERVED_8(16777216L), BINDF2_RESERVED_7(33554432L), BINDF2_RESERVED_6(67108864L), BINDF2_RESERVED_5(134217728L), BINDF2_RESERVED_4(268435456L), BINDF2_RESERVED_3(536870912L), BINDF2_RESERVED_2(1073741824L), BINDF2_RESERVED_1(-2147483648L);

    companion object {
        fun fromValue(v: Long): _MIDL_IBindStatusCallbackEx_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IBindStatusCallbackEx_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IAuthenticateEx_0001}
 */
enum class _MIDL_IAuthenticateEx_0001(val value: Long) {
    AUTHENTICATEF_PROXY(1L), AUTHENTICATEF_BASIC(2L), AUTHENTICATEF_HTTP(4L);

    companion object {
        fun fromValue(v: Long): _MIDL_IAuthenticateEx_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IAuthenticateEx_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_ICodeInstall_0001}
 */
enum class _MIDL_ICodeInstall_0001(val value: Long) {
    CIP_DISK_FULL(0L), CIP_ACCESS_DENIED(1L), CIP_NEWER_VERSION_EXISTS(2L), CIP_OLDER_VERSION_EXISTS(3L), CIP_NAME_CONFLICT(4L), CIP_TRUST_VERIFICATION_COMPONENT_MISSING(5L), CIP_EXE_SELF_REGISTERATION_TIMEOUT(6L), CIP_UNSAFE_TO_ABORT(7L), CIP_NEED_REBOOT(8L), CIP_NEED_REBOOT_UI_PERMISSION(9L);

    companion object {
        fun fromValue(v: Long): _MIDL_ICodeInstall_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_ICodeInstall_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IUri_0001}
 */
enum class _MIDL_IUri_0001(val value: Long) {
    Uri_PROPERTY_ABSOLUTE_URI(0L), Uri_PROPERTY_STRING_START(0L), Uri_PROPERTY_AUTHORITY(1L), Uri_PROPERTY_DISPLAY_URI(2L), Uri_PROPERTY_DOMAIN(3L), Uri_PROPERTY_EXTENSION(4L), Uri_PROPERTY_FRAGMENT(5L), Uri_PROPERTY_HOST(6L), Uri_PROPERTY_PASSWORD(7L), Uri_PROPERTY_PATH(8L), Uri_PROPERTY_PATH_AND_QUERY(9L), Uri_PROPERTY_QUERY(10L), Uri_PROPERTY_RAW_URI(11L), Uri_PROPERTY_SCHEME_NAME(12L), Uri_PROPERTY_USER_INFO(13L), Uri_PROPERTY_USER_NAME(14L), Uri_PROPERTY_STRING_LAST(14L), Uri_PROPERTY_HOST_TYPE(15L), Uri_PROPERTY_DWORD_START(15L), Uri_PROPERTY_PORT(16L), Uri_PROPERTY_SCHEME(17L), Uri_PROPERTY_ZONE(18L), Uri_PROPERTY_DWORD_LAST(18L);

    companion object {
        fun fromValue(v: Long): _MIDL_IUri_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IUri_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IUri_0002}
 */
enum class _MIDL_IUri_0002(val value: Long) {
    Uri_HOST_UNKNOWN(0L), Uri_HOST_DNS(1L), Uri_HOST_IPV4(2L), Uri_HOST_IPV6(3L), Uri_HOST_IDN(4L);

    companion object {
        fun fromValue(v: Long): _MIDL_IUri_0002 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IUri_0002 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagBINDSTRING}
 */
enum class tagBINDSTRING(val value: Long) {
    BINDSTRING_HEADERS(1L), BINDSTRING_ACCEPT_MIMES(2L), BINDSTRING_EXTRA_URL(3L), BINDSTRING_LANGUAGE(4L), BINDSTRING_USERNAME(5L), BINDSTRING_PASSWORD(6L), BINDSTRING_UA_PIXELS(7L), BINDSTRING_UA_COLOR(8L), BINDSTRING_OS(9L), BINDSTRING_USER_AGENT(10L), BINDSTRING_ACCEPT_ENCODINGS(11L), BINDSTRING_POST_COOKIE(12L), BINDSTRING_POST_DATA_MIME(13L), BINDSTRING_URL(14L), BINDSTRING_IID(15L), BINDSTRING_FLAG_BIND_TO_OBJECT(16L), BINDSTRING_PTR_BIND_CONTEXT(17L), BINDSTRING_XDR_ORIGIN(18L), BINDSTRING_DOWNLOADPATH(19L), BINDSTRING_ROOTDOC_URL(20L), BINDSTRING_INITIAL_FILENAME(21L), BINDSTRING_PROXY_USERNAME(22L), BINDSTRING_PROXY_PASSWORD(23L), BINDSTRING_ENTERPRISE_ID(24L), BINDSTRING_DOC_URL(25L), BINDSTRING_SAMESITE_COOKIE_LEVEL(26L);

    companion object {
        fun fromValue(v: Long): tagBINDSTRING = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagBINDSTRING value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _tagPI_FLAGS}
 */
enum class _tagPI_FLAGS(val value: Long) {
    PI_PARSE_URL(1L), PI_FILTER_MODE(2L), PI_FORCE_ASYNC(4L), PI_USE_WORKERTHREAD(8L), PI_MIMEVERIFICATION(16L), PI_CLSIDLOOKUP(32L), PI_DATAPROGRESS(64L), PI_SYNCHRONOUS(128L), PI_APARTMENTTHREADED(256L), PI_CLASSINSTALL(512L), PI_PASSONBINDCTX(8192L), PI_NOMIMEHANDLER(32768L), PI_LOADAPPDIRECT(16384L), PD_FORCE_SWITCH(65536L), PI_PREFERDEFAULTHANDLER(131072L);

    companion object {
        fun fromValue(v: Long): _tagPI_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _tagPI_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _tagOIBDG_FLAGS}
 */
enum class _tagOIBDG_FLAGS(val value: Long) {
    OIBDG_APARTMENTTHREADED(256L), OIBDG_DATAONLY(4096L);

    companion object {
        fun fromValue(v: Long): _tagOIBDG_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _tagOIBDG_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _tagPARSEACTION}
 */
enum class _tagPARSEACTION(val value: Long) {
    PARSE_CANONICALIZE(1L), PARSE_FRIENDLY(2L), PARSE_SECURITY_URL(3L), PARSE_ROOTDOCUMENT(4L), PARSE_DOCUMENT(5L), PARSE_ANCHOR(6L), PARSE_ENCODE_IS_UNESCAPE(7L), PARSE_DECODE_IS_ESCAPE(8L), PARSE_PATH_FROM_URL(9L), PARSE_URL_FROM_PATH(10L), PARSE_MIME(11L), PARSE_SERVER(12L), PARSE_SCHEMA(13L), PARSE_SITE(14L), PARSE_DOMAIN(15L), PARSE_LOCATION(16L), PARSE_SECURITY_DOMAIN(17L), PARSE_ESCAPE(18L), PARSE_UNESCAPE(19L);

    companion object {
        fun fromValue(v: Long): _tagPARSEACTION = entries.firstOrNull { it.value == v }
            ?: error("Unknown _tagPARSEACTION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _tagPSUACTION}
 */
enum class _tagPSUACTION(val value: Long) {
    PSU_DEFAULT(1L), PSU_SECURITY_URL_ONLY(2L);

    companion object {
        fun fromValue(v: Long): _tagPSUACTION = entries.firstOrNull { it.value == v }
            ?: error("Unknown _tagPSUACTION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _tagQUERYOPTION}
 */
enum class _tagQUERYOPTION(val value: Long) {
    QUERY_EXPIRATION_DATE(1L), QUERY_TIME_OF_LAST_CHANGE(2L), QUERY_CONTENT_ENCODING(3L), QUERY_CONTENT_TYPE(4L), QUERY_REFRESH(5L), QUERY_RECOMBINE(6L), QUERY_CAN_NAVIGATE(7L), QUERY_USES_NETWORK(8L), QUERY_IS_CACHED(9L), QUERY_IS_INSTALLEDENTRY(10L), QUERY_IS_CACHED_OR_MAPPED(11L), QUERY_USES_CACHE(12L), QUERY_IS_SECURE(13L), QUERY_IS_SAFE(14L), QUERY_USES_HISTORYFOLDER(15L), QUERY_IS_CACHED_AND_USABLE_OFFLINE(16L);

    companion object {
        fun fromValue(v: Long): _tagQUERYOPTION = entries.firstOrNull { it.value == v }
            ?: error("Unknown _tagQUERYOPTION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _tagINTERNETFEATURELIST}
 */
enum class _tagINTERNETFEATURELIST(val value: Long) {
    FEATURE_OBJECT_CACHING(0L), FEATURE_ZONE_ELEVATION(1L), FEATURE_MIME_HANDLING(2L), FEATURE_MIME_SNIFFING(3L), FEATURE_WINDOW_RESTRICTIONS(4L), FEATURE_WEBOC_POPUPMANAGEMENT(5L), FEATURE_BEHAVIORS(6L), FEATURE_DISABLE_MK_PROTOCOL(7L), FEATURE_LOCALMACHINE_LOCKDOWN(8L), FEATURE_SECURITYBAND(9L), FEATURE_RESTRICT_ACTIVEXINSTALL(10L), FEATURE_VALIDATE_NAVIGATE_URL(11L), FEATURE_RESTRICT_FILEDOWNLOAD(12L), FEATURE_ADDON_MANAGEMENT(13L), FEATURE_PROTOCOL_LOCKDOWN(14L), FEATURE_HTTP_USERNAME_PASSWORD_DISABLE(15L), FEATURE_SAFE_BINDTOOBJECT(16L), FEATURE_UNC_SAVEDFILECHECK(17L), FEATURE_GET_URL_DOM_FILEPATH_UNENCODED(18L), FEATURE_TABBED_BROWSING(19L), FEATURE_SSLUX(20L), FEATURE_DISABLE_NAVIGATION_SOUNDS(21L), FEATURE_DISABLE_LEGACY_COMPRESSION(22L), FEATURE_FORCE_ADDR_AND_STATUS(23L), FEATURE_XMLHTTP(24L), FEATURE_DISABLE_TELNET_PROTOCOL(25L), FEATURE_FEEDS(26L), FEATURE_BLOCK_INPUT_PROMPTS(27L), FEATURE_ENTRY_COUNT(28L);

    companion object {
        fun fromValue(v: Long): _tagINTERNETFEATURELIST = entries.firstOrNull { it.value == v }
            ?: error("Unknown _tagINTERNETFEATURELIST value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IInternetSecurityManager_0001}
 */
enum class _MIDL_IInternetSecurityManager_0001(val value: Long) {
    PUAF_DEFAULT(0L), PUAF_NOUI(1L), PUAF_ISFILE(2L), PUAF_WARN_IF_DENIED(4L), PUAF_FORCEUI_FOREGROUND(8L), PUAF_CHECK_TIFS(16L), PUAF_DONTCHECKBOXINDIALOG(32L), PUAF_TRUSTED(64L), PUAF_ACCEPT_WILDCARD_SCHEME(128L), PUAF_ENFORCERESTRICTED(256L), PUAF_NOSAVEDFILECHECK(512L), PUAF_REQUIRESAVEDFILECHECK(1024L), PUAF_DONT_USE_CACHE(4096L), PUAF_RESERVED1(8192L), PUAF_RESERVED2(16384L), PUAF_LMZ_UNLOCKED(65536L), PUAF_LMZ_LOCKED(131072L), PUAF_DEFAULTZONEPOL(262144L), PUAF_NPL_USE_LOCKED_IF_RESTRICTED(524288L), PUAF_NOUIIFLOCKED(1048576L), PUAF_DRAGPROTOCOLCHECK(2097152L);

    companion object {
        fun fromValue(v: Long): _MIDL_IInternetSecurityManager_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IInternetSecurityManager_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IInternetSecurityManager_0002}
 */
enum class _MIDL_IInternetSecurityManager_0002(val value: Long) {
    PUAFOUT_DEFAULT(0L), PUAFOUT_ISLOCKZONEPOLICY(1L);

    companion object {
        fun fromValue(v: Long): _MIDL_IInternetSecurityManager_0002 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IInternetSecurityManager_0002 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IInternetSecurityManager_0003}
 */
enum class _MIDL_IInternetSecurityManager_0003(val value: Long) {
    SZM_CREATE(0L), SZM_DELETE(1L);

    companion object {
        fun fromValue(v: Long): _MIDL_IInternetSecurityManager_0003 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IInternetSecurityManager_0003 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagURLZONE}
 */
enum class tagURLZONE(val value: Long) {
    URLZONE_INVALID(-1L), URLZONE_PREDEFINED_MIN(0L), URLZONE_LOCAL_MACHINE(0L), URLZONE_INTRANET(1L), URLZONE_TRUSTED(2L), URLZONE_INTERNET(3L), URLZONE_UNTRUSTED(4L), URLZONE_PREDEFINED_MAX(999L), URLZONE_USER_MIN(1000L), URLZONE_USER_MAX(10000L);

    companion object {
        fun fromValue(v: Long): tagURLZONE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagURLZONE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagURLTEMPLATE}
 */
enum class tagURLTEMPLATE(val value: Long) {
    URLTEMPLATE_CUSTOM(0L), URLTEMPLATE_PREDEFINED_MIN(65536L), URLTEMPLATE_LOW(65536L), URLTEMPLATE_MEDLOW(66816L), URLTEMPLATE_MEDIUM(69632L), URLTEMPLATE_MEDHIGH(70912L), URLTEMPLATE_HIGH(73728L), URLTEMPLATE_PREDEFINED_MAX(131072L);

    companion object {
        fun fromValue(v: Long): tagURLTEMPLATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagURLTEMPLATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IInternetZoneManager_0001}
 */
enum class _MIDL_IInternetZoneManager_0001(val value: Long) {
    MAX_ZONE_PATH(260L), MAX_ZONE_DESCRIPTION(200L);

    companion object {
        fun fromValue(v: Long): _MIDL_IInternetZoneManager_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IInternetZoneManager_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IInternetZoneManager_0002}
 */
enum class _MIDL_IInternetZoneManager_0002(val value: Long) {
    ZAFLAGS_CUSTOM_EDIT(1L), ZAFLAGS_ADD_SITES(2L), ZAFLAGS_REQUIRE_VERIFICATION(4L), ZAFLAGS_INCLUDE_PROXY_OVERRIDE(8L), ZAFLAGS_INCLUDE_INTRANET_SITES(16L), ZAFLAGS_NO_UI(32L), ZAFLAGS_SUPPORTS_VERIFICATION(64L), ZAFLAGS_UNC_AS_INTRANET(128L), ZAFLAGS_DETECT_INTRANET(256L), ZAFLAGS_USE_LOCKED_ZONES(65536L), ZAFLAGS_VERIFY_TEMPLATE_SETTINGS(131072L), ZAFLAGS_NO_CACHE(262144L);

    companion object {
        fun fromValue(v: Long): _MIDL_IInternetZoneManager_0002 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IInternetZoneManager_0002 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _URLZONEREG}
 */
enum class _URLZONEREG(val value: Long) {
    URLZONEREG_DEFAULT(0L), URLZONEREG_HKLM(1L), URLZONEREG_HKCU(2L);

    companion object {
        fun fromValue(v: Long): _URLZONEREG = entries.firstOrNull { it.value == v }
            ?: error("Unknown _URLZONEREG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum __MIDL_IGetBindHandle_0001}
 */
enum class _MIDL_IGetBindHandle_0001(val value: Long) {
    BINDHANDLETYPES_APPCACHE(0L), BINDHANDLETYPES_DEPENDENCY(1L), BINDHANDLETYPES_COUNT(2L);

    companion object {
        fun fromValue(v: Long): _MIDL_IGetBindHandle_0001 = entries.firstOrNull { it.value == v }
            ?: error("Unknown _MIDL_IGetBindHandle_0001 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum PIDMSI_STATUS_VALUE}
 */
enum class PIDMSI_STATUS_VALUE(val value: Long) {
    PIDMSI_STATUS_NORMAL(0L), PIDMSI_STATUS_NEW(1L), PIDMSI_STATUS_PRELIM(2L), PIDMSI_STATUS_DRAFT(3L), PIDMSI_STATUS_INPROGRESS(4L), PIDMSI_STATUS_EDIT(5L), PIDMSI_STATUS_REVIEW(6L), PIDMSI_STATUS_PROOF(7L), PIDMSI_STATUS_FINAL(8L), PIDMSI_STATUS_OTHER(32767L);

    companion object {
        fun fromValue(v: Long): PIDMSI_STATUS_VALUE = entries.firstOrNull { it.value == v }
            ?: error("Unknown PIDMSI_STATUS_VALUE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum INTERACTION_ID}
 */
enum class INTERACTION_ID(val value: Long) {
    INTERACTION_ID_NONE(0L), INTERACTION_ID_MANIPULATION(1L), INTERACTION_ID_TAP(2L), INTERACTION_ID_SECONDARY_TAP(3L), INTERACTION_ID_HOLD(4L), INTERACTION_ID_DRAG(5L), INTERACTION_ID_CROSS_SLIDE(6L), INTERACTION_ID_MAX(-1L);

    companion object {
        fun fromValue(v: Long): INTERACTION_ID = entries.firstOrNull { it.value == v }
            ?: error("Unknown INTERACTION_ID value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum INTERACTION_FLAGS}
 */
enum class INTERACTION_FLAGS(val value: Long) {
    INTERACTION_FLAG_NONE(0L), INTERACTION_FLAG_BEGIN(1L), INTERACTION_FLAG_END(2L), INTERACTION_FLAG_CANCEL(4L), INTERACTION_FLAG_INERTIA(8L), INTERACTION_FLAG_MAX(-1L);

    companion object {
        fun fromValue(v: Long): INTERACTION_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown INTERACTION_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum INTERACTION_CONFIGURATION_FLAGS}
 */
enum class INTERACTION_CONFIGURATION_FLAGS(val value: Long) {
    INTERACTION_CONFIGURATION_FLAG_NONE(0L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION(1L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_TRANSLATION_X(2L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_TRANSLATION_Y(4L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_ROTATION(8L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_SCALING(16L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_TRANSLATION_INERTIA(32L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_ROTATION_INERTIA(64L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_SCALING_INERTIA(128L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_RAILS_X(256L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_RAILS_Y(512L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_EXACT(1024L), INTERACTION_CONFIGURATION_FLAG_MANIPULATION_MULTIPLE_FINGER_PANNING(2048L), INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE(1L), INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_HORIZONTAL(2L), INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_SELECT(4L), INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_SPEED_BUMP(8L), INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_REARRANGE(16L), INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_EXACT(32L), INTERACTION_CONFIGURATION_FLAG_TAP(1L), INTERACTION_CONFIGURATION_FLAG_TAP_DOUBLE(2L), INTERACTION_CONFIGURATION_FLAG_TAP_MULTIPLE_FINGER(4L), INTERACTION_CONFIGURATION_FLAG_SECONDARY_TAP(1L), INTERACTION_CONFIGURATION_FLAG_HOLD(1L), INTERACTION_CONFIGURATION_FLAG_HOLD_MOUSE(2L), INTERACTION_CONFIGURATION_FLAG_HOLD_MULTIPLE_FINGER(4L), INTERACTION_CONFIGURATION_FLAG_DRAG(1L), INTERACTION_CONFIGURATION_FLAG_MAX(-1L);

    companion object {
        fun fromValue(v: Long): INTERACTION_CONFIGURATION_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown INTERACTION_CONFIGURATION_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum INERTIA_PARAMETER}
 */
enum class INERTIA_PARAMETER(val value: Long) {
    INERTIA_PARAMETER_TRANSLATION_DECELERATION(1L), INERTIA_PARAMETER_TRANSLATION_DISPLACEMENT(2L), INERTIA_PARAMETER_ROTATION_DECELERATION(3L), INERTIA_PARAMETER_ROTATION_ANGLE(4L), INERTIA_PARAMETER_EXPANSION_DECELERATION(5L), INERTIA_PARAMETER_EXPANSION_EXPANSION(6L), INERTIA_PARAMETER_MAX(-1L);

    companion object {
        fun fromValue(v: Long): INERTIA_PARAMETER = entries.firstOrNull { it.value == v }
            ?: error("Unknown INERTIA_PARAMETER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum INTERACTION_STATE}
 */
enum class INTERACTION_STATE(val value: Long) {
    INTERACTION_STATE_IDLE(0L), INTERACTION_STATE_IN_INTERACTION(1L), INTERACTION_STATE_POSSIBLE_DOUBLE_TAP(2L), INTERACTION_STATE_MAX(-1L);

    companion object {
        fun fromValue(v: Long): INTERACTION_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown INTERACTION_STATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum INTERACTION_CONTEXT_PROPERTY}
 */
enum class INTERACTION_CONTEXT_PROPERTY(val value: Long) {
    INTERACTION_CONTEXT_PROPERTY_MEASUREMENT_UNITS(1L), INTERACTION_CONTEXT_PROPERTY_INTERACTION_UI_FEEDBACK(2L), INTERACTION_CONTEXT_PROPERTY_FILTER_POINTERS(3L), INTERACTION_CONTEXT_PROPERTY_MAX(-1L);

    companion object {
        fun fromValue(v: Long): INTERACTION_CONTEXT_PROPERTY = entries.firstOrNull { it.value == v }
            ?: error("Unknown INTERACTION_CONTEXT_PROPERTY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum CROSS_SLIDE_THRESHOLD}
 */
enum class CROSS_SLIDE_THRESHOLD(val value: Long) {
    CROSS_SLIDE_THRESHOLD_SELECT_START(0L), CROSS_SLIDE_THRESHOLD_SPEED_BUMP_START(1L), CROSS_SLIDE_THRESHOLD_SPEED_BUMP_END(2L), CROSS_SLIDE_THRESHOLD_REARRANGE_START(3L), CROSS_SLIDE_THRESHOLD_COUNT(4L), CROSS_SLIDE_THRESHOLD_MAX(-1L);

    companion object {
        fun fromValue(v: Long): CROSS_SLIDE_THRESHOLD = entries.firstOrNull { it.value == v }
            ?: error("Unknown CROSS_SLIDE_THRESHOLD value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum CROSS_SLIDE_FLAGS}
 */
enum class CROSS_SLIDE_FLAGS(val value: Long) {
    CROSS_SLIDE_FLAGS_NONE(0L), CROSS_SLIDE_FLAGS_SELECT(1L), CROSS_SLIDE_FLAGS_SPEED_BUMP(2L), CROSS_SLIDE_FLAGS_REARRANGE(4L), CROSS_SLIDE_FLAGS_MAX(-1L);

    companion object {
        fun fromValue(v: Long): CROSS_SLIDE_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown CROSS_SLIDE_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum MOUSE_WHEEL_PARAMETER}
 */
enum class MOUSE_WHEEL_PARAMETER(val value: Long) {
    MOUSE_WHEEL_PARAMETER_CHAR_TRANSLATION_X(1L), MOUSE_WHEEL_PARAMETER_CHAR_TRANSLATION_Y(2L), MOUSE_WHEEL_PARAMETER_DELTA_SCALE(3L), MOUSE_WHEEL_PARAMETER_DELTA_ROTATION(4L), MOUSE_WHEEL_PARAMETER_PAGE_TRANSLATION_X(5L), MOUSE_WHEEL_PARAMETER_PAGE_TRANSLATION_Y(6L), MOUSE_WHEEL_PARAMETER_MAX(-1L);

    companion object {
        fun fromValue(v: Long): MOUSE_WHEEL_PARAMETER = entries.firstOrNull { it.value == v }
            ?: error("Unknown MOUSE_WHEEL_PARAMETER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TAP_PARAMETER}
 */
enum class TAP_PARAMETER(val value: Long) {
    TAP_PARAMETER_MIN_CONTACT_COUNT(0L), TAP_PARAMETER_MAX_CONTACT_COUNT(1L), TAP_PARAMETER_MAX(-1L);

    companion object {
        fun fromValue(v: Long): TAP_PARAMETER = entries.firstOrNull { it.value == v }
            ?: error("Unknown TAP_PARAMETER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum HOLD_PARAMETER}
 */
enum class HOLD_PARAMETER(val value: Long) {
    HOLD_PARAMETER_MIN_CONTACT_COUNT(0L), HOLD_PARAMETER_MAX_CONTACT_COUNT(1L), HOLD_PARAMETER_THRESHOLD_RADIUS(2L), HOLD_PARAMETER_THRESHOLD_START_DELAY(3L), HOLD_PARAMETER_MAX(-1L);

    companion object {
        fun fromValue(v: Long): HOLD_PARAMETER = entries.firstOrNull { it.value == v }
            ?: error("Unknown HOLD_PARAMETER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum TRANSLATION_PARAMETER}
 */
enum class TRANSLATION_PARAMETER(val value: Long) {
    TRANSLATION_PARAMETER_MIN_CONTACT_COUNT(0L), TRANSLATION_PARAMETER_MAX_CONTACT_COUNT(1L), TRANSLATION_PARAMETER_MAX(-1L);

    companion object {
        fun fromValue(v: Long): TRANSLATION_PARAMETER = entries.firstOrNull { it.value == v }
            ?: error("Unknown TRANSLATION_PARAMETER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum MANIPULATION_RAILS_STATE}
 */
enum class MANIPULATION_RAILS_STATE(val value: Long) {
    MANIPULATION_RAILS_STATE_UNDECIDED(0L), MANIPULATION_RAILS_STATE_FREE(1L), MANIPULATION_RAILS_STATE_RAILED(2L), MANIPULATION_RAILS_STATE_MAX(-1L);

    companion object {
        fun fromValue(v: Long): MANIPULATION_RAILS_STATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown MANIPULATION_RAILS_STATE value: $v")
    }
}

/**
 * {@snippet lang=c : CreateInteractionContext typedef HRESULT = Long((typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*)*)
 */
private val CreateInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var CreateInteractionContext_HANDLE: MethodHandle? = null

fun CreateInteractionContext(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 CreateInteractionContext called before init()" }
    val _handle = CreateInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : DestroyInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*)
 */
private val DestroyInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var DestroyInteractionContext_HANDLE: MethodHandle? = null

fun DestroyInteractionContext(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 DestroyInteractionContext called before init()" }
    val _handle = DestroyInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : RegisterOutputCallbackInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*,typedef INTERACTION_CONTEXT_OUTPUT_CALLBACK = (Void((Void)*,(Declared(INTERACTION_CONTEXT_OUTPUT))*))*,(Void)*)
 */
private val RegisterOutputCallbackInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var RegisterOutputCallbackInteractionContext_HANDLE: MethodHandle? = null

fun RegisterOutputCallbackInteractionContext(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 RegisterOutputCallbackInteractionContext called before init()" }
    val _handle = RegisterOutputCallbackInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetInteractionConfigurationInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*,typedef UINT32 = UNSIGNED = Int,(typedef INTERACTION_CONTEXT_CONFIGURATION = Declared(INTERACTION_CONTEXT_CONFIGURATION))*)
 */
private val SetInteractionConfigurationInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var SetInteractionConfigurationInteractionContext_HANDLE: MethodHandle? = null

fun SetInteractionConfigurationInteractionContext(arg0: MemorySegment, arg1: Int, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 SetInteractionConfigurationInteractionContext called before init()" }
    val _handle = SetInteractionConfigurationInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetInteractionConfigurationInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*,typedef UINT32 = UNSIGNED = Int,(typedef INTERACTION_CONTEXT_CONFIGURATION = Declared(INTERACTION_CONTEXT_CONFIGURATION))*)
 */
private val GetInteractionConfigurationInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetInteractionConfigurationInteractionContext_HANDLE: MethodHandle? = null

fun GetInteractionConfigurationInteractionContext(arg0: MemorySegment, arg1: Int, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 GetInteractionConfigurationInteractionContext called before init()" }
    val _handle = GetInteractionConfigurationInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : SetPropertyInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*,typedef INTERACTION_CONTEXT_PROPERTY = Declared(INTERACTION_CONTEXT_PROPERTY),typedef UINT32 = UNSIGNED = Int)
 */
private val SetPropertyInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var SetPropertyInteractionContext_HANDLE: MethodHandle? = null

fun SetPropertyInteractionContext(arg0: MemorySegment, arg1: INTERACTION_CONTEXT_PROPERTY, arg2: Int): Int {
    check(_initialized) { "Win32 SetPropertyInteractionContext called before init()" }
    val _handle = SetPropertyInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1.value.toInt(), arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : GetPropertyInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*,typedef INTERACTION_CONTEXT_PROPERTY = Declared(INTERACTION_CONTEXT_PROPERTY),(typedef UINT32 = UNSIGNED = Int)*)
 */
private val GetPropertyInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GetPropertyInteractionContext_HANDLE: MethodHandle? = null

fun GetPropertyInteractionContext(arg0: MemorySegment, arg1: INTERACTION_CONTEXT_PROPERTY, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 GetPropertyInteractionContext called before init()" }
    val _handle = GetPropertyInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1.value.toInt(), arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : ResetInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*)
 */
private val ResetInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var ResetInteractionContext_HANDLE: MethodHandle? = null

fun ResetInteractionContext(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 ResetInteractionContext called before init()" }
    val _handle = ResetInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : AddPointerInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*,typedef UINT32 = UNSIGNED = Int)
 */
private val AddPointerInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var AddPointerInteractionContext_HANDLE: MethodHandle? = null

fun AddPointerInteractionContext(arg0: MemorySegment, arg1: Int): Int {
    check(_initialized) { "Win32 AddPointerInteractionContext called before init()" }
    val _handle = AddPointerInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : RemovePointerInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*,typedef UINT32 = UNSIGNED = Int)
 */
private val RemovePointerInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var RemovePointerInteractionContext_HANDLE: MethodHandle? = null

fun RemovePointerInteractionContext(arg0: MemorySegment, arg1: Int): Int {
    check(_initialized) { "Win32 RemovePointerInteractionContext called before init()" }
    val _handle = RemovePointerInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : ProcessPointerFramesInteractionContext typedef HRESULT = Long(typedef HINTERACTIONCONTEXT = (Declared(HINTERACTIONCONTEXT__))*,typedef UINT32 = UNSIGNED = Int,typedef UINT32 = UNSIGNED = Int,(typedef POINTER_INFO = Declared(tagPOINTER_INFO))*)
 */
private val ProcessPointerFramesInteractionContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var ProcessPointerFramesInteractionContext_HANDLE: MethodHandle? = null

fun ProcessPointerFramesInteractionContext(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: MemorySegment): Int {
    check(_initialized) { "Win32 ProcessPointerFramesInteractionContext called before init()" }
    val _handle = ProcessPointerFramesInteractionContext_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}


/**
 * Initializes all Win32 bindings.
 * Must be called before any binding function on Windows.
 * Safe to call on non-Windows (no-op, all symbols stay null).
 */
@Synchronized
fun init() {
    if (_initialized) return
    _DLL_DWMAPI_DLL = try {
        SymbolLookup.libraryLookup("Dwmapi.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_GDI32_DLL = try {
        SymbolLookup.libraryLookup("Gdi32.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_KERNEL32_DLL = try {
        SymbolLookup.libraryLookup("Kernel32.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_NINPUT_DLL = try {
        SymbolLookup.libraryLookup("Ninput.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_OLE32_DLL = try {
        SymbolLookup.libraryLookup("Ole32.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_USER32_DLL = try {
        SymbolLookup.libraryLookup("User32.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    GetLastError_HANDLE = _lookup("GetLastError").find("GetLastError").map { Linker.nativeLinker().downcallHandle(it, GetLastError_DESC) }.orElse(null)
    SetLastError_HANDLE = _lookup("SetLastError").find("SetLastError").map { Linker.nativeLinker().downcallHandle(it, SetLastError_DESC) }.orElse(null)
    GetCurrentThreadId_HANDLE = _lookup("GetCurrentThreadId").find("GetCurrentThreadId").map { Linker.nativeLinker().downcallHandle(it, GetCurrentThreadId_DESC) }.orElse(null)
    GetModuleHandleW_HANDLE = _lookup("GetModuleHandleW").find("GetModuleHandleW").map { Linker.nativeLinker().downcallHandle(it, GetModuleHandleW_DESC) }.orElse(null)
    BitBlt_HANDLE = _lookup("BitBlt").find("BitBlt").map { Linker.nativeLinker().downcallHandle(it, BitBlt_DESC) }.orElse(null)
    CreateBitmap_HANDLE = _lookup("CreateBitmap").find("CreateBitmap").map { Linker.nativeLinker().downcallHandle(it, CreateBitmap_DESC) }.orElse(null)
    CreateCompatibleBitmap_HANDLE = _lookup("CreateCompatibleBitmap").find("CreateCompatibleBitmap").map { Linker.nativeLinker().downcallHandle(it, CreateCompatibleBitmap_DESC) }.orElse(null)
    CreateCompatibleDC_HANDLE = _lookup("CreateCompatibleDC").find("CreateCompatibleDC").map { Linker.nativeLinker().downcallHandle(it, CreateCompatibleDC_DESC) }.orElse(null)
    CreateRectRgn_HANDLE = _lookup("CreateRectRgn").find("CreateRectRgn").map { Linker.nativeLinker().downcallHandle(it, CreateRectRgn_DESC) }.orElse(null)
    CreateSolidBrush_HANDLE = _lookup("CreateSolidBrush").find("CreateSolidBrush").map { Linker.nativeLinker().downcallHandle(it, CreateSolidBrush_DESC) }.orElse(null)
    DeleteDC_HANDLE = _lookup("DeleteDC").find("DeleteDC").map { Linker.nativeLinker().downcallHandle(it, DeleteDC_DESC) }.orElse(null)
    DeleteObject_HANDLE = _lookup("DeleteObject").find("DeleteObject").map { Linker.nativeLinker().downcallHandle(it, DeleteObject_DESC) }.orElse(null)
    GetDIBits_HANDLE = _lookup("GetDIBits").find("GetDIBits").map { Linker.nativeLinker().downcallHandle(it, GetDIBits_DESC) }.orElse(null)
    SelectObject_HANDLE = _lookup("SelectObject").find("SelectObject").map { Linker.nativeLinker().downcallHandle(it, SelectObject_DESC) }.orElse(null)
    CreateDIBSection_HANDLE = _lookup("CreateDIBSection").find("CreateDIBSection").map { Linker.nativeLinker().downcallHandle(it, CreateDIBSection_DESC) }.orElse(null)
    ToUnicodeEx_HANDLE = _lookup("ToUnicodeEx").find("ToUnicodeEx").map { Linker.nativeLinker().downcallHandle(it, ToUnicodeEx_DESC) }.orElse(null)
    GetKeyboardLayout_HANDLE = _lookup("GetKeyboardLayout").find("GetKeyboardLayout").map { Linker.nativeLinker().downcallHandle(it, GetKeyboardLayout_DESC) }.orElse(null)
    TrackMouseEvent_HANDLE = _lookup("TrackMouseEvent").find("TrackMouseEvent").map { Linker.nativeLinker().downcallHandle(it, TrackMouseEvent_DESC) }.orElse(null)
    GetMessageW_HANDLE = _lookup("GetMessageW").find("GetMessageW").map { Linker.nativeLinker().downcallHandle(it, GetMessageW_DESC) }.orElse(null)
    TranslateMessage_HANDLE = _lookup("TranslateMessage").find("TranslateMessage").map { Linker.nativeLinker().downcallHandle(it, TranslateMessage_DESC) }.orElse(null)
    DispatchMessageW_HANDLE = _lookup("DispatchMessageW").find("DispatchMessageW").map { Linker.nativeLinker().downcallHandle(it, DispatchMessageW_DESC) }.orElse(null)
    PeekMessageW_HANDLE = _lookup("PeekMessageW").find("PeekMessageW").map { Linker.nativeLinker().downcallHandle(it, PeekMessageW_DESC) }.orElse(null)
    GetMessageExtraInfo_HANDLE = _lookup("GetMessageExtraInfo").find("GetMessageExtraInfo").map { Linker.nativeLinker().downcallHandle(it, GetMessageExtraInfo_DESC) }.orElse(null)
    SendMessageW_HANDLE = _lookup("SendMessageW").find("SendMessageW").map { Linker.nativeLinker().downcallHandle(it, SendMessageW_DESC) }.orElse(null)
    PostMessageW_HANDLE = _lookup("PostMessageW").find("PostMessageW").map { Linker.nativeLinker().downcallHandle(it, PostMessageW_DESC) }.orElse(null)
    DefWindowProcW_HANDLE = _lookup("DefWindowProcW").find("DefWindowProcW").map { Linker.nativeLinker().downcallHandle(it, DefWindowProcW_DESC) }.orElse(null)
    PostQuitMessage_HANDLE = _lookup("PostQuitMessage").find("PostQuitMessage").map { Linker.nativeLinker().downcallHandle(it, PostQuitMessage_DESC) }.orElse(null)
    RegisterClassExW_HANDLE = _lookup("RegisterClassExW").find("RegisterClassExW").map { Linker.nativeLinker().downcallHandle(it, RegisterClassExW_DESC) }.orElse(null)
    CreateWindowExW_HANDLE = _lookup("CreateWindowExW").find("CreateWindowExW").map { Linker.nativeLinker().downcallHandle(it, CreateWindowExW_DESC) }.orElse(null)
    IsWindow_HANDLE = _lookup("IsWindow").find("IsWindow").map { Linker.nativeLinker().downcallHandle(it, IsWindow_DESC) }.orElse(null)
    DestroyWindow_HANDLE = _lookup("DestroyWindow").find("DestroyWindow").map { Linker.nativeLinker().downcallHandle(it, DestroyWindow_DESC) }.orElse(null)
    ShowWindow_HANDLE = _lookup("ShowWindow").find("ShowWindow").map { Linker.nativeLinker().downcallHandle(it, ShowWindow_DESC) }.orElse(null)
    FlashWindowEx_HANDLE = _lookup("FlashWindowEx").find("FlashWindowEx").map { Linker.nativeLinker().downcallHandle(it, FlashWindowEx_DESC) }.orElse(null)
    SetWindowPos_HANDLE = _lookup("SetWindowPos").find("SetWindowPos").map { Linker.nativeLinker().downcallHandle(it, SetWindowPos_DESC) }.orElse(null)
    GetWindowDisplayAffinity_HANDLE = _lookup("GetWindowDisplayAffinity").find("GetWindowDisplayAffinity").map { Linker.nativeLinker().downcallHandle(it, GetWindowDisplayAffinity_DESC) }.orElse(null)
    SetWindowDisplayAffinity_HANDLE = _lookup("SetWindowDisplayAffinity").find("SetWindowDisplayAffinity").map { Linker.nativeLinker().downcallHandle(it, SetWindowDisplayAffinity_DESC) }.orElse(null)
    IsWindowVisible_HANDLE = _lookup("IsWindowVisible").find("IsWindowVisible").map { Linker.nativeLinker().downcallHandle(it, IsWindowVisible_DESC) }.orElse(null)
    IsIconic_HANDLE = _lookup("IsIconic").find("IsIconic").map { Linker.nativeLinker().downcallHandle(it, IsIconic_DESC) }.orElse(null)
    IsZoomed_HANDLE = _lookup("IsZoomed").find("IsZoomed").map { Linker.nativeLinker().downcallHandle(it, IsZoomed_DESC) }.orElse(null)
    GetFocus_HANDLE = _lookup("GetFocus").find("GetFocus").map { Linker.nativeLinker().downcallHandle(it, GetFocus_DESC) }.orElse(null)
    GetKeyState_HANDLE = _lookup("GetKeyState").find("GetKeyState").map { Linker.nativeLinker().downcallHandle(it, GetKeyState_DESC) }.orElse(null)
    GetKeyboardState_HANDLE = _lookup("GetKeyboardState").find("GetKeyboardState").map { Linker.nativeLinker().downcallHandle(it, GetKeyboardState_DESC) }.orElse(null)
    SendInput_HANDLE = _lookup("SendInput").find("SendInput").map { Linker.nativeLinker().downcallHandle(it, SendInput_DESC) }.orElse(null)
    GetTouchInputInfo_HANDLE = _lookup("GetTouchInputInfo").find("GetTouchInputInfo").map { Linker.nativeLinker().downcallHandle(it, GetTouchInputInfo_DESC) }.orElse(null)
    CloseTouchInputHandle_HANDLE = _lookup("CloseTouchInputHandle").find("CloseTouchInputHandle").map { Linker.nativeLinker().downcallHandle(it, CloseTouchInputHandle_DESC) }.orElse(null)
    RegisterTouchWindow_HANDLE = _lookup("RegisterTouchWindow").find("RegisterTouchWindow").map { Linker.nativeLinker().downcallHandle(it, RegisterTouchWindow_DESC) }.orElse(null)
    InitializeTouchInjection_HANDLE = _lookup("InitializeTouchInjection").find("InitializeTouchInjection").map { Linker.nativeLinker().downcallHandle(it, InitializeTouchInjection_DESC) }.orElse(null)
    InjectTouchInput_HANDLE = _lookup("InjectTouchInput").find("InjectTouchInput").map { Linker.nativeLinker().downcallHandle(it, InjectTouchInput_DESC) }.orElse(null)
    GetPointerType_HANDLE = _lookup("GetPointerType").find("GetPointerType").map { Linker.nativeLinker().downcallHandle(it, GetPointerType_DESC) }.orElse(null)
    GetPointerInfo_HANDLE = _lookup("GetPointerInfo").find("GetPointerInfo").map { Linker.nativeLinker().downcallHandle(it, GetPointerInfo_DESC) }.orElse(null)
    GetPointerFrameInfoHistory_HANDLE = _lookup("GetPointerFrameInfoHistory").find("GetPointerFrameInfoHistory").map { Linker.nativeLinker().downcallHandle(it, GetPointerFrameInfoHistory_DESC) }.orElse(null)
    GetPointerTouchInfo_HANDLE = _lookup("GetPointerTouchInfo").find("GetPointerTouchInfo").map { Linker.nativeLinker().downcallHandle(it, GetPointerTouchInfo_DESC) }.orElse(null)
    GetPointerFrameTouchInfoHistory_HANDLE = _lookup("GetPointerFrameTouchInfoHistory").find("GetPointerFrameTouchInfoHistory").map { Linker.nativeLinker().downcallHandle(it, GetPointerFrameTouchInfoHistory_DESC) }.orElse(null)
    GetPointerPenInfo_HANDLE = _lookup("GetPointerPenInfo").find("GetPointerPenInfo").map { Linker.nativeLinker().downcallHandle(it, GetPointerPenInfo_DESC) }.orElse(null)
    GetPointerFramePenInfoHistory_HANDLE = _lookup("GetPointerFramePenInfoHistory").find("GetPointerFramePenInfoHistory").map { Linker.nativeLinker().downcallHandle(it, GetPointerFramePenInfoHistory_DESC) }.orElse(null)
    MapVirtualKeyW_HANDLE = _lookup("MapVirtualKeyW").find("MapVirtualKeyW").map { Linker.nativeLinker().downcallHandle(it, MapVirtualKeyW_DESC) }.orElse(null)
    MapVirtualKeyExW_HANDLE = _lookup("MapVirtualKeyExW").find("MapVirtualKeyExW").map { Linker.nativeLinker().downcallHandle(it, MapVirtualKeyExW_DESC) }.orElse(null)
    GetCapture_HANDLE = _lookup("GetCapture").find("GetCapture").map { Linker.nativeLinker().downcallHandle(it, GetCapture_DESC) }.orElse(null)
    ReleaseCapture_HANDLE = _lookup("ReleaseCapture").find("ReleaseCapture").map { Linker.nativeLinker().downcallHandle(it, ReleaseCapture_DESC) }.orElse(null)
    MsgWaitForMultipleObjectsEx_HANDLE = _lookup("MsgWaitForMultipleObjectsEx").find("MsgWaitForMultipleObjectsEx").map { Linker.nativeLinker().downcallHandle(it, MsgWaitForMultipleObjectsEx_DESC) }.orElse(null)
    EnableWindow_HANDLE = _lookup("EnableWindow").find("EnableWindow").map { Linker.nativeLinker().downcallHandle(it, EnableWindow_DESC) }.orElse(null)
    GetSystemMetrics_HANDLE = _lookup("GetSystemMetrics").find("GetSystemMetrics").map { Linker.nativeLinker().downcallHandle(it, GetSystemMetrics_DESC) }.orElse(null)
    GetSystemMenu_HANDLE = _lookup("GetSystemMenu").find("GetSystemMenu").map { Linker.nativeLinker().downcallHandle(it, GetSystemMenu_DESC) }.orElse(null)
    EnableMenuItem_HANDLE = _lookup("EnableMenuItem").find("EnableMenuItem").map { Linker.nativeLinker().downcallHandle(it, EnableMenuItem_DESC) }.orElse(null)
    TrackPopupMenu_HANDLE = _lookup("TrackPopupMenu").find("TrackPopupMenu").map { Linker.nativeLinker().downcallHandle(it, TrackPopupMenu_DESC) }.orElse(null)
    SetMenuDefaultItem_HANDLE = _lookup("SetMenuDefaultItem").find("SetMenuDefaultItem").map { Linker.nativeLinker().downcallHandle(it, SetMenuDefaultItem_DESC) }.orElse(null)
    UpdateWindow_HANDLE = _lookup("UpdateWindow").find("UpdateWindow").map { Linker.nativeLinker().downcallHandle(it, UpdateWindow_DESC) }.orElse(null)
    GetForegroundWindow_HANDLE = _lookup("GetForegroundWindow").find("GetForegroundWindow").map { Linker.nativeLinker().downcallHandle(it, GetForegroundWindow_DESC) }.orElse(null)
    SetForegroundWindow_HANDLE = _lookup("SetForegroundWindow").find("SetForegroundWindow").map { Linker.nativeLinker().downcallHandle(it, SetForegroundWindow_DESC) }.orElse(null)
    GetDC_HANDLE = _lookup("GetDC").find("GetDC").map { Linker.nativeLinker().downcallHandle(it, GetDC_DESC) }.orElse(null)
    ReleaseDC_HANDLE = _lookup("ReleaseDC").find("ReleaseDC").map { Linker.nativeLinker().downcallHandle(it, ReleaseDC_DESC) }.orElse(null)
    InvalidateRect_HANDLE = _lookup("InvalidateRect").find("InvalidateRect").map { Linker.nativeLinker().downcallHandle(it, InvalidateRect_DESC) }.orElse(null)
    ValidateRect_HANDLE = _lookup("ValidateRect").find("ValidateRect").map { Linker.nativeLinker().downcallHandle(it, ValidateRect_DESC) }.orElse(null)
    SetWindowTextW_HANDLE = _lookup("SetWindowTextW").find("SetWindowTextW").map { Linker.nativeLinker().downcallHandle(it, SetWindowTextW_DESC) }.orElse(null)
    GetWindowTextW_HANDLE = _lookup("GetWindowTextW").find("GetWindowTextW").map { Linker.nativeLinker().downcallHandle(it, GetWindowTextW_DESC) }.orElse(null)
    GetWindowTextLengthW_HANDLE = _lookup("GetWindowTextLengthW").find("GetWindowTextLengthW").map { Linker.nativeLinker().downcallHandle(it, GetWindowTextLengthW_DESC) }.orElse(null)
    GetClientRect_HANDLE = _lookup("GetClientRect").find("GetClientRect").map { Linker.nativeLinker().downcallHandle(it, GetClientRect_DESC) }.orElse(null)
    GetWindowRect_HANDLE = _lookup("GetWindowRect").find("GetWindowRect").map { Linker.nativeLinker().downcallHandle(it, GetWindowRect_DESC) }.orElse(null)
    AdjustWindowRectExForDpi_HANDLE = _lookup("AdjustWindowRectExForDpi").find("AdjustWindowRectExForDpi").map { Linker.nativeLinker().downcallHandle(it, AdjustWindowRectExForDpi_DESC) }.orElse(null)
    ShowCursor_HANDLE = _lookup("ShowCursor").find("ShowCursor").map { Linker.nativeLinker().downcallHandle(it, ShowCursor_DESC) }.orElse(null)
    SetCursorPos_HANDLE = _lookup("SetCursorPos").find("SetCursorPos").map { Linker.nativeLinker().downcallHandle(it, SetCursorPos_DESC) }.orElse(null)
    SetCursor_HANDLE = _lookup("SetCursor").find("SetCursor").map { Linker.nativeLinker().downcallHandle(it, SetCursor_DESC) }.orElse(null)
    GetCursorPos_HANDLE = _lookup("GetCursorPos").find("GetCursorPos").map { Linker.nativeLinker().downcallHandle(it, GetCursorPos_DESC) }.orElse(null)
    GetClipCursor_HANDLE = _lookup("GetClipCursor").find("GetClipCursor").map { Linker.nativeLinker().downcallHandle(it, GetClipCursor_DESC) }.orElse(null)
    GetCursor_HANDLE = _lookup("GetCursor").find("GetCursor").map { Linker.nativeLinker().downcallHandle(it, GetCursor_DESC) }.orElse(null)
    ClientToScreen_HANDLE = _lookup("ClientToScreen").find("ClientToScreen").map { Linker.nativeLinker().downcallHandle(it, ClientToScreen_DESC) }.orElse(null)
    ScreenToClient_HANDLE = _lookup("ScreenToClient").find("ScreenToClient").map { Linker.nativeLinker().downcallHandle(it, ScreenToClient_DESC) }.orElse(null)
    WindowFromPoint_HANDLE = _lookup("WindowFromPoint").find("WindowFromPoint").map { Linker.nativeLinker().downcallHandle(it, WindowFromPoint_DESC) }.orElse(null)
    ClipCursor_HANDLE = _lookup("ClipCursor").find("ClipCursor").map { Linker.nativeLinker().downcallHandle(it, ClipCursor_DESC) }.orElse(null)
    FillRect_HANDLE = _lookup("FillRect").find("FillRect").map { Linker.nativeLinker().downcallHandle(it, FillRect_DESC) }.orElse(null)
    GetWindowLongPtrW_HANDLE = _lookup("GetWindowLongPtrW").find("GetWindowLongPtrW").map { Linker.nativeLinker().downcallHandle(it, GetWindowLongPtrW_DESC) }.orElse(null)
    SetWindowLongPtrW_HANDLE = _lookup("SetWindowLongPtrW").find("SetWindowLongPtrW").map { Linker.nativeLinker().downcallHandle(it, SetWindowLongPtrW_DESC) }.orElse(null)
    FindWindowExW_HANDLE = _lookup("FindWindowExW").find("FindWindowExW").map { Linker.nativeLinker().downcallHandle(it, FindWindowExW_DESC) }.orElse(null)
    GetWindowThreadProcessId_HANDLE = _lookup("GetWindowThreadProcessId").find("GetWindowThreadProcessId").map { Linker.nativeLinker().downcallHandle(it, GetWindowThreadProcessId_DESC) }.orElse(null)
    LoadCursorW_HANDLE = _lookup("LoadCursorW").find("LoadCursorW").map { Linker.nativeLinker().downcallHandle(it, LoadCursorW_DESC) }.orElse(null)
    DestroyCursor_HANDLE = _lookup("DestroyCursor").find("DestroyCursor").map { Linker.nativeLinker().downcallHandle(it, DestroyCursor_DESC) }.orElse(null)
    CreateIcon_HANDLE = _lookup("CreateIcon").find("CreateIcon").map { Linker.nativeLinker().downcallHandle(it, CreateIcon_DESC) }.orElse(null)
    DestroyIcon_HANDLE = _lookup("DestroyIcon").find("DestroyIcon").map { Linker.nativeLinker().downcallHandle(it, DestroyIcon_DESC) }.orElse(null)
    CreateIconIndirect_HANDLE = _lookup("CreateIconIndirect").find("CreateIconIndirect").map { Linker.nativeLinker().downcallHandle(it, CreateIconIndirect_DESC) }.orElse(null)
    SystemParametersInfoW_HANDLE = _lookup("SystemParametersInfoW").find("SystemParametersInfoW").map { Linker.nativeLinker().downcallHandle(it, SystemParametersInfoW_DESC) }.orElse(null)
    MonitorFromWindow_HANDLE = _lookup("MonitorFromWindow").find("MonitorFromWindow").map { Linker.nativeLinker().downcallHandle(it, MonitorFromWindow_DESC) }.orElse(null)
    GetMonitorInfoW_HANDLE = _lookup("GetMonitorInfoW").find("GetMonitorInfoW").map { Linker.nativeLinker().downcallHandle(it, GetMonitorInfoW_DESC) }.orElse(null)
    GetDpiForWindow_HANDLE = _lookup("GetDpiForWindow").find("GetDpiForWindow").map { Linker.nativeLinker().downcallHandle(it, GetDpiForWindow_DESC) }.orElse(null)
    SetProcessDpiAwarenessContext_HANDLE = _lookup("SetProcessDpiAwarenessContext").find("SetProcessDpiAwarenessContext").map { Linker.nativeLinker().downcallHandle(it, SetProcessDpiAwarenessContext_DESC) }.orElse(null)
    GetGestureInfo_HANDLE = _lookup("GetGestureInfo").find("GetGestureInfo").map { Linker.nativeLinker().downcallHandle(it, GetGestureInfo_DESC) }.orElse(null)
    CloseGestureInfoHandle_HANDLE = _lookup("CloseGestureInfoHandle").find("CloseGestureInfoHandle").map { Linker.nativeLinker().downcallHandle(it, CloseGestureInfoHandle_DESC) }.orElse(null)
    DwmEnableBlurBehindWindow_HANDLE = _lookup("DwmEnableBlurBehindWindow").find("DwmEnableBlurBehindWindow").map { Linker.nativeLinker().downcallHandle(it, DwmEnableBlurBehindWindow_DESC) }.orElse(null)
    DwmExtendFrameIntoClientArea_HANDLE = _lookup("DwmExtendFrameIntoClientArea").find("DwmExtendFrameIntoClientArea").map { Linker.nativeLinker().downcallHandle(it, DwmExtendFrameIntoClientArea_DESC) }.orElse(null)
    DwmSetWindowAttribute_HANDLE = _lookup("DwmSetWindowAttribute").find("DwmSetWindowAttribute").map { Linker.nativeLinker().downcallHandle(it, DwmSetWindowAttribute_DESC) }.orElse(null)
    CoUninitialize_HANDLE = _lookup("CoUninitialize").find("CoUninitialize").map { Linker.nativeLinker().downcallHandle(it, CoUninitialize_DESC) }.orElse(null)
    CoInitializeEx_HANDLE = _lookup("CoInitializeEx").find("CoInitializeEx").map { Linker.nativeLinker().downcallHandle(it, CoInitializeEx_DESC) }.orElse(null)
    CoCreateInstance_HANDLE = _lookup("CoCreateInstance").find("CoCreateInstance").map { Linker.nativeLinker().downcallHandle(it, CoCreateInstance_DESC) }.orElse(null)
    CoTaskMemAlloc_HANDLE = _lookup("CoTaskMemAlloc").find("CoTaskMemAlloc").map { Linker.nativeLinker().downcallHandle(it, CoTaskMemAlloc_DESC) }.orElse(null)
    CoTaskMemFree_HANDLE = _lookup("CoTaskMemFree").find("CoTaskMemFree").map { Linker.nativeLinker().downcallHandle(it, CoTaskMemFree_DESC) }.orElse(null)
    CreateInteractionContext_HANDLE = _lookup("CreateInteractionContext").find("CreateInteractionContext").map { Linker.nativeLinker().downcallHandle(it, CreateInteractionContext_DESC) }.orElse(null)
    DestroyInteractionContext_HANDLE = _lookup("DestroyInteractionContext").find("DestroyInteractionContext").map { Linker.nativeLinker().downcallHandle(it, DestroyInteractionContext_DESC) }.orElse(null)
    RegisterOutputCallbackInteractionContext_HANDLE = _lookup("RegisterOutputCallbackInteractionContext").find("RegisterOutputCallbackInteractionContext").map { Linker.nativeLinker().downcallHandle(it, RegisterOutputCallbackInteractionContext_DESC) }.orElse(null)
    SetInteractionConfigurationInteractionContext_HANDLE = _lookup("SetInteractionConfigurationInteractionContext").find("SetInteractionConfigurationInteractionContext").map { Linker.nativeLinker().downcallHandle(it, SetInteractionConfigurationInteractionContext_DESC) }.orElse(null)
    GetInteractionConfigurationInteractionContext_HANDLE = _lookup("GetInteractionConfigurationInteractionContext").find("GetInteractionConfigurationInteractionContext").map { Linker.nativeLinker().downcallHandle(it, GetInteractionConfigurationInteractionContext_DESC) }.orElse(null)
    SetPropertyInteractionContext_HANDLE = _lookup("SetPropertyInteractionContext").find("SetPropertyInteractionContext").map { Linker.nativeLinker().downcallHandle(it, SetPropertyInteractionContext_DESC) }.orElse(null)
    GetPropertyInteractionContext_HANDLE = _lookup("GetPropertyInteractionContext").find("GetPropertyInteractionContext").map { Linker.nativeLinker().downcallHandle(it, GetPropertyInteractionContext_DESC) }.orElse(null)
    ResetInteractionContext_HANDLE = _lookup("ResetInteractionContext").find("ResetInteractionContext").map { Linker.nativeLinker().downcallHandle(it, ResetInteractionContext_DESC) }.orElse(null)
    AddPointerInteractionContext_HANDLE = _lookup("AddPointerInteractionContext").find("AddPointerInteractionContext").map { Linker.nativeLinker().downcallHandle(it, AddPointerInteractionContext_DESC) }.orElse(null)
    RemovePointerInteractionContext_HANDLE = _lookup("RemovePointerInteractionContext").find("RemovePointerInteractionContext").map { Linker.nativeLinker().downcallHandle(it, RemovePointerInteractionContext_DESC) }.orElse(null)
    ProcessPointerFramesInteractionContext_HANDLE = _lookup("ProcessPointerFramesInteractionContext").find("ProcessPointerFramesInteractionContext").map { Linker.nativeLinker().downcallHandle(it, ProcessPointerFramesInteractionContext_DESC) }.orElse(null)

    _initialized = true
}
