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
private var _DLL_SHCORE_DLL: SymbolLookup? = null
private var _DLL_USER32_DLL: SymbolLookup? = null
private var _DLL_XINPUT9_1_0_DLL: SymbolLookup? = null
private var _DLL_COMBASE_DLL: SymbolLookup? = null
private var _DLL_D3D11_DLL: SymbolLookup? = null
private var _DLL_DXGI_DLL: SymbolLookup? = null

@Volatile private var _initialized: Boolean = false

private fun _lookup(symbol: String): SymbolLookup {
    return when (symbol) {
        "RegisterClassExW", "CreateWindowExW", "FindWindowExW", "GetDC", "ReleaseDC", "FillRect", "ShowWindow", "UpdateWindow", "DestroyWindow", "DefWindowProcW", "SetWindowTextW", "PostQuitMessage", "GetKeyState", "GetKeyboardState", "GetKeyboardLayout", "MapVirtualKeyExW", "ToUnicodeEx", "SystemParametersInfoW", "PeekMessageW", "GetMessageW", "TranslateMessage", "DispatchMessageW", "MsgWaitForMultipleObjectsEx", "LoadCursorW", "SetProcessDpiAwarenessContext", "GetDpiForWindow", "InvalidateRect", "ValidateRect", "TrackMouseEvent", "RegisterTouchWindow", "GetTouchInputInfo", "CloseTouchInputHandle", "GetGestureInfo", "CloseGestureInfoHandle", "ScreenToClient", "ClientToScreen", "GetCursorPos", "GetSystemMenu", "TrackPopupMenu", "EnableMenuItem", "SetMenuDefaultItem", "ReleaseCapture", "EnableWindow", "GetClientRect", "GetWindowRect", "AdjustWindowRectExForDpi", "MonitorFromWindow", "GetMonitorInfoW", "SetWindowLongPtrW", "GetWindowLongPtrW", "IsZoomed", "IsIconic", "IsWindow", "IsWindowVisible", "GetWindowTextW", "GetWindowTextLengthW", "SetWindowPos", "GetForegroundWindow", "SetForegroundWindow", "MapVirtualKeyW", "SendInput", "SetCursorPos", "SetCursor", "ShowCursor", "ClipCursor", "PostMessageW", "SendMessageW", "CreateIcon", "DestroyIcon", "FlashWindowEx", "CreateIconIndirect", "DestroyCursor", "GetCursor", "GetCapture", "GetClipCursor", "GetSystemMetrics", "GetWindowDisplayAffinity", "SetWindowDisplayAffinity", "GetWindowThreadProcessId", "GetFocus", "GetPointerType", "GetPointerInfo", "GetPointerTouchInfo", "GetPointerPenInfo", "GetPointerFrameInfoHistory", "GetPointerFrameTouchInfoHistory", "GetPointerFramePenInfoHistory", "GetMessageExtraInfo", "InitializeTouchInjection", "InjectTouchInput", "WindowFromPoint", "RegisterClipboardFormatW", "GetPropW", "RegisterRawInputDevices", "GetRawInputData", "GetRawInputDeviceList", "GetRegisteredRawInputDevices", "EnumDisplayMonitors", "EnumDisplaySettingsExW" -> _DLL_USER32_DLL ?: SymbolLookup.loaderLookup()
        "GetCurrentThreadId", "GetModuleHandleW", "SetLastError", "GetLastError", "GlobalAlloc", "GlobalLock", "GlobalUnlock", "GlobalSize" -> _DLL_KERNEL32_DLL ?: SymbolLookup.loaderLookup()
        "CreateRectRgn", "CreateCompatibleDC", "CreateCompatibleBitmap", "CreateSolidBrush", "SelectObject", "BitBlt", "GetDIBits", "DeleteDC", "DeleteObject", "CreateBitmap", "CreateDIBSection" -> _DLL_GDI32_DLL ?: SymbolLookup.loaderLookup()
        "DwmSetWindowAttribute", "DwmEnableBlurBehindWindow", "DwmExtendFrameIntoClientArea" -> _DLL_DWMAPI_DLL ?: SymbolLookup.loaderLookup()
        "CoInitializeEx", "CoUninitialize", "CoCreateInstance", "CoTaskMemAlloc", "CoTaskMemFree", "OleInitialize", "OleUninitialize", "RegisterDragDrop", "RevokeDragDrop", "ReleaseStgMedium", "CreateStreamOnHGlobal" -> _DLL_OLE32_DLL ?: SymbolLookup.loaderLookup()
        "CreateInteractionContext", "DestroyInteractionContext", "SetInteractionConfigurationInteractionContext", "GetInteractionConfigurationInteractionContext", "SetPropertyInteractionContext", "GetPropertyInteractionContext", "RegisterOutputCallbackInteractionContext", "ProcessPointerFramesInteractionContext", "AddPointerInteractionContext", "RemovePointerInteractionContext", "ResetInteractionContext" -> _DLL_NINPUT_DLL ?: SymbolLookup.loaderLookup()
        "GetDpiForMonitor" -> _DLL_SHCORE_DLL ?: SymbolLookup.loaderLookup()
        "XInputGetState", "XInputSetState", "XInputGetCapabilities", "XInputGetBatteryInformation" -> _DLL_XINPUT9_1_0_DLL ?: SymbolLookup.loaderLookup()
        "RoInitialize", "RoUninitialize", "RoGetActivationFactory", "WindowsCreateString", "WindowsDeleteString", "WindowsGetStringRawBuffer" -> _DLL_COMBASE_DLL ?: SymbolLookup.loaderLookup()
        "D3D11CreateDevice", "CreateDirect3D11DeviceFromDXGIDevice" -> _DLL_D3D11_DLL ?: SymbolLookup.loaderLookup()
        "CreateDXGIFactory1" -> _DLL_DXGI_DLL ?: SymbolLookup.loaderLookup()
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
 * {@snippet lang=c : GlobalAlloc typedef HGLOBAL = (Void)*(typedef UINT = UNSIGNED = Int,typedef SIZE_T = UNSIGNED = LongLong)
 */
private val GlobalAlloc_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private var GlobalAlloc_HANDLE: MethodHandle? = null

fun GlobalAlloc(arg0: Int, arg1: Long): MemorySegment {
    check(_initialized) { "Win32 GlobalAlloc called before init()" }
    val _handle = GlobalAlloc_HANDLE ?: return MemorySegment.NULL
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
 * {@snippet lang=c : GlobalSize typedef SIZE_T = UNSIGNED = LongLong(typedef HGLOBAL = (Void)*)
 */
private val GlobalSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private var GlobalSize_HANDLE: MethodHandle? = null

fun GlobalSize(arg0: MemorySegment): Long {
    check(_initialized) { "Win32 GlobalSize called before init()" }
    val _handle = GlobalSize_HANDLE ?: return 0L
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
 * {@snippet lang=c : GlobalUnlock typedef BOOL = Int(typedef HGLOBAL = (Void)*)
 */
private val GlobalUnlock_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var GlobalUnlock_HANDLE: MethodHandle? = null

fun GlobalUnlock(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 GlobalUnlock called before init()" }
    val _handle = GlobalUnlock_HANDLE ?: return 0
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
 * {@snippet lang=c : GlobalLock typedef LPVOID = (Void)*(typedef HGLOBAL = (Void)*)
 */
private val GlobalLock_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GlobalLock_HANDLE: MethodHandle? = null

fun GlobalLock(arg0: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 GlobalLock called before init()" }
    val _handle = GlobalLock_HANDLE ?: return MemorySegment.NULL
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
 * {@snippet lang=c : STRUCT _devicemodeW
 */
class _devicemodeW {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_CHAR.withByteAlignment(2)).withByteAlignment(2).withName("dmDeviceName"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmSpecVersion"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmDriverVersion"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmSize"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmDriverExtra"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmFields"),
            MemoryLayout.paddingLayout(16L),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmColor"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmDuplex"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmYResolution"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmTTOption"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmCollate"),
            MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_CHAR.withByteAlignment(2)).withByteAlignment(2).withName("dmFormName"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("dmLogPixels"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmBitsPerPel"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmPelsWidth"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmPelsHeight"),
            MemoryLayout.paddingLayout(4L),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmDisplayFrequency"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmICMMethod"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmICMIntent"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmMediaType"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmDitherType"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmReserved1"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmReserved2"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmPanningWidth"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dmPanningHeight")
        ).withByteAlignment(4L).withName("_devicemodeW")

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

    fun dmDeviceName(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("dmDeviceName")), layout.select(groupElement("dmDeviceName")).byteSize())

    val dmSpecVersion_VH: VarHandle = layout.varHandle(groupElement("dmSpecVersion"))

    @Suppress("UNCHECKED_CAST")
    fun dmSpecVersion(segment: MemorySegment): Short =
        dmSpecVersion_VH.get(segment, 0L) as Short

    fun dmSpecVersion(segment: MemorySegment, value: Short) =
        dmSpecVersion_VH.set(segment, 0L, value)

    val dmDriverVersion_VH: VarHandle = layout.varHandle(groupElement("dmDriverVersion"))

    @Suppress("UNCHECKED_CAST")
    fun dmDriverVersion(segment: MemorySegment): Short =
        dmDriverVersion_VH.get(segment, 0L) as Short

    fun dmDriverVersion(segment: MemorySegment, value: Short) =
        dmDriverVersion_VH.set(segment, 0L, value)

    val dmSize_VH: VarHandle = layout.varHandle(groupElement("dmSize"))

    @Suppress("UNCHECKED_CAST")
    fun dmSize(segment: MemorySegment): Short =
        dmSize_VH.get(segment, 0L) as Short

    fun dmSize(segment: MemorySegment, value: Short) =
        dmSize_VH.set(segment, 0L, value)

    val dmDriverExtra_VH: VarHandle = layout.varHandle(groupElement("dmDriverExtra"))

    @Suppress("UNCHECKED_CAST")
    fun dmDriverExtra(segment: MemorySegment): Short =
        dmDriverExtra_VH.get(segment, 0L) as Short

    fun dmDriverExtra(segment: MemorySegment, value: Short) =
        dmDriverExtra_VH.set(segment, 0L, value)

    val dmFields_VH: VarHandle = layout.varHandle(groupElement("dmFields"))

    @Suppress("UNCHECKED_CAST")
    fun dmFields(segment: MemorySegment): Int =
        dmFields_VH.get(segment, 0L) as Int

    fun dmFields(segment: MemorySegment, value: Int) =
        dmFields_VH.set(segment, 0L, value)

    val dmColor_VH: VarHandle = layout.varHandle(groupElement("dmColor"))

    @Suppress("UNCHECKED_CAST")
    fun dmColor(segment: MemorySegment): Short =
        dmColor_VH.get(segment, 0L) as Short

    fun dmColor(segment: MemorySegment, value: Short) =
        dmColor_VH.set(segment, 0L, value)

    val dmDuplex_VH: VarHandle = layout.varHandle(groupElement("dmDuplex"))

    @Suppress("UNCHECKED_CAST")
    fun dmDuplex(segment: MemorySegment): Short =
        dmDuplex_VH.get(segment, 0L) as Short

    fun dmDuplex(segment: MemorySegment, value: Short) =
        dmDuplex_VH.set(segment, 0L, value)

    val dmYResolution_VH: VarHandle = layout.varHandle(groupElement("dmYResolution"))

    @Suppress("UNCHECKED_CAST")
    fun dmYResolution(segment: MemorySegment): Short =
        dmYResolution_VH.get(segment, 0L) as Short

    fun dmYResolution(segment: MemorySegment, value: Short) =
        dmYResolution_VH.set(segment, 0L, value)

    val dmTTOption_VH: VarHandle = layout.varHandle(groupElement("dmTTOption"))

    @Suppress("UNCHECKED_CAST")
    fun dmTTOption(segment: MemorySegment): Short =
        dmTTOption_VH.get(segment, 0L) as Short

    fun dmTTOption(segment: MemorySegment, value: Short) =
        dmTTOption_VH.set(segment, 0L, value)

    val dmCollate_VH: VarHandle = layout.varHandle(groupElement("dmCollate"))

    @Suppress("UNCHECKED_CAST")
    fun dmCollate(segment: MemorySegment): Short =
        dmCollate_VH.get(segment, 0L) as Short

    fun dmCollate(segment: MemorySegment, value: Short) =
        dmCollate_VH.set(segment, 0L, value)

    fun dmFormName(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("dmFormName")), layout.select(groupElement("dmFormName")).byteSize())

    val dmLogPixels_VH: VarHandle = layout.varHandle(groupElement("dmLogPixels"))

    @Suppress("UNCHECKED_CAST")
    fun dmLogPixels(segment: MemorySegment): Short =
        dmLogPixels_VH.get(segment, 0L) as Short

    fun dmLogPixels(segment: MemorySegment, value: Short) =
        dmLogPixels_VH.set(segment, 0L, value)

    val dmBitsPerPel_VH: VarHandle = layout.varHandle(groupElement("dmBitsPerPel"))

    @Suppress("UNCHECKED_CAST")
    fun dmBitsPerPel(segment: MemorySegment): Int =
        dmBitsPerPel_VH.get(segment, 0L) as Int

    fun dmBitsPerPel(segment: MemorySegment, value: Int) =
        dmBitsPerPel_VH.set(segment, 0L, value)

    val dmPelsWidth_VH: VarHandle = layout.varHandle(groupElement("dmPelsWidth"))

    @Suppress("UNCHECKED_CAST")
    fun dmPelsWidth(segment: MemorySegment): Int =
        dmPelsWidth_VH.get(segment, 0L) as Int

    fun dmPelsWidth(segment: MemorySegment, value: Int) =
        dmPelsWidth_VH.set(segment, 0L, value)

    val dmPelsHeight_VH: VarHandle = layout.varHandle(groupElement("dmPelsHeight"))

    @Suppress("UNCHECKED_CAST")
    fun dmPelsHeight(segment: MemorySegment): Int =
        dmPelsHeight_VH.get(segment, 0L) as Int

    fun dmPelsHeight(segment: MemorySegment, value: Int) =
        dmPelsHeight_VH.set(segment, 0L, value)

    val dmDisplayFrequency_VH: VarHandle = layout.varHandle(groupElement("dmDisplayFrequency"))

    @Suppress("UNCHECKED_CAST")
    fun dmDisplayFrequency(segment: MemorySegment): Int =
        dmDisplayFrequency_VH.get(segment, 0L) as Int

    fun dmDisplayFrequency(segment: MemorySegment, value: Int) =
        dmDisplayFrequency_VH.set(segment, 0L, value)

    val dmICMMethod_VH: VarHandle = layout.varHandle(groupElement("dmICMMethod"))

    @Suppress("UNCHECKED_CAST")
    fun dmICMMethod(segment: MemorySegment): Int =
        dmICMMethod_VH.get(segment, 0L) as Int

    fun dmICMMethod(segment: MemorySegment, value: Int) =
        dmICMMethod_VH.set(segment, 0L, value)

    val dmICMIntent_VH: VarHandle = layout.varHandle(groupElement("dmICMIntent"))

    @Suppress("UNCHECKED_CAST")
    fun dmICMIntent(segment: MemorySegment): Int =
        dmICMIntent_VH.get(segment, 0L) as Int

    fun dmICMIntent(segment: MemorySegment, value: Int) =
        dmICMIntent_VH.set(segment, 0L, value)

    val dmMediaType_VH: VarHandle = layout.varHandle(groupElement("dmMediaType"))

    @Suppress("UNCHECKED_CAST")
    fun dmMediaType(segment: MemorySegment): Int =
        dmMediaType_VH.get(segment, 0L) as Int

    fun dmMediaType(segment: MemorySegment, value: Int) =
        dmMediaType_VH.set(segment, 0L, value)

    val dmDitherType_VH: VarHandle = layout.varHandle(groupElement("dmDitherType"))

    @Suppress("UNCHECKED_CAST")
    fun dmDitherType(segment: MemorySegment): Int =
        dmDitherType_VH.get(segment, 0L) as Int

    fun dmDitherType(segment: MemorySegment, value: Int) =
        dmDitherType_VH.set(segment, 0L, value)

    val dmReserved1_VH: VarHandle = layout.varHandle(groupElement("dmReserved1"))

    @Suppress("UNCHECKED_CAST")
    fun dmReserved1(segment: MemorySegment): Int =
        dmReserved1_VH.get(segment, 0L) as Int

    fun dmReserved1(segment: MemorySegment, value: Int) =
        dmReserved1_VH.set(segment, 0L, value)

    val dmReserved2_VH: VarHandle = layout.varHandle(groupElement("dmReserved2"))

    @Suppress("UNCHECKED_CAST")
    fun dmReserved2(segment: MemorySegment): Int =
        dmReserved2_VH.get(segment, 0L) as Int

    fun dmReserved2(segment: MemorySegment, value: Int) =
        dmReserved2_VH.set(segment, 0L, value)

    val dmPanningWidth_VH: VarHandle = layout.varHandle(groupElement("dmPanningWidth"))

    @Suppress("UNCHECKED_CAST")
    fun dmPanningWidth(segment: MemorySegment): Int =
        dmPanningWidth_VH.get(segment, 0L) as Int

    fun dmPanningWidth(segment: MemorySegment, value: Int) =
        dmPanningWidth_VH.set(segment, 0L, value)

    val dmPanningHeight_VH: VarHandle = layout.varHandle(groupElement("dmPanningHeight"))

    @Suppress("UNCHECKED_CAST")
    fun dmPanningHeight(segment: MemorySegment): Int =
        dmPanningHeight_VH.get(segment, 0L) as Int

    fun dmPanningHeight(segment: MemorySegment, value: Int) =
        dmPanningHeight_VH.set(segment, 0L, value)
} // End class

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
 * {@snippet lang=c : RegisterClipboardFormatW typedef UINT = UNSIGNED = Int(typedef LPCWSTR = (UNSIGNED = Short)*)
 */
private val RegisterClipboardFormatW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var RegisterClipboardFormatW_HANDLE: MethodHandle? = null

fun RegisterClipboardFormatW(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 RegisterClipboardFormatW called before init()" }
    val _handle = RegisterClipboardFormatW_HANDLE ?: return 0
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
 * {@snippet lang=c : GetPropW typedef HANDLE = (Void)*(typedef HWND = (Declared(HWND__))*,typedef LPCWSTR = (UNSIGNED = Short)*)
 */
private val GetPropW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetPropW_HANDLE: MethodHandle? = null

fun GetPropW(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 GetPropW called before init()" }
    val _handle = GetPropW_HANDLE ?: return MemorySegment.NULL
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
 * {@snippet lang=c : EnumDisplaySettingsExW typedef BOOL = Int(typedef LPCWSTR = (UNSIGNED = Short)*,typedef DWORD = UNSIGNED = Long,(typedef DEVMODEW = Declared(_devicemodeW))*,typedef DWORD = UNSIGNED = Long)
 */
private val EnumDisplaySettingsExW_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var EnumDisplaySettingsExW_HANDLE: MethodHandle? = null

fun EnumDisplaySettingsExW(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: Int): Int {
    check(_initialized) { "Win32 EnumDisplaySettingsExW called before init()" }
    val _handle = EnumDisplaySettingsExW_HANDLE ?: return 0
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
 * {@snippet lang=c : EnumDisplayMonitors typedef BOOL = Int(typedef HDC = (Declared(HDC__))*,typedef LPCRECT = (Declared(tagRECT))*,typedef MONITORENUMPROC = (Int((Declared(HMONITOR__))*,(Declared(HDC__))*,(Declared(tagRECT))*,LongLong))*,typedef LPARAM = LongLong)
 */
private val EnumDisplayMonitors_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private var EnumDisplayMonitors_HANDLE: MethodHandle? = null

fun EnumDisplayMonitors(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long): Int {
    check(_initialized) { "Win32 EnumDisplayMonitors called before init()" }
    val _handle = EnumDisplayMonitors_HANDLE ?: return 0
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
 * {@snippet lang=c : STRUCT tagRAWINPUTHEADER
 */
class tagRAWINPUTHEADER {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dwType"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dwSize"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("hDevice"),
            ValueLayout.JAVA_LONG.withByteAlignment(8).withName("wParam")
        ).withByteAlignment(8L).withName("tagRAWINPUTHEADER")

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

    val dwType_VH: VarHandle = layout.varHandle(groupElement("dwType"))

    @Suppress("UNCHECKED_CAST")
    fun dwType(segment: MemorySegment): Int =
        dwType_VH.get(segment, 0L) as Int

    fun dwType(segment: MemorySegment, value: Int) =
        dwType_VH.set(segment, 0L, value)

    val dwSize_VH: VarHandle = layout.varHandle(groupElement("dwSize"))

    @Suppress("UNCHECKED_CAST")
    fun dwSize(segment: MemorySegment): Int =
        dwSize_VH.get(segment, 0L) as Int

    fun dwSize(segment: MemorySegment, value: Int) =
        dwSize_VH.set(segment, 0L, value)

    val hDevice_VH: VarHandle = layout.varHandle(groupElement("hDevice"))

    @Suppress("UNCHECKED_CAST")
    fun hDevice(segment: MemorySegment): MemorySegment =
        hDevice_VH.get(segment, 0L) as MemorySegment

    fun hDevice(segment: MemorySegment, value: MemorySegment) =
        hDevice_VH.set(segment, 0L, value)

    val wParam_VH: VarHandle = layout.varHandle(groupElement("wParam"))

    @Suppress("UNCHECKED_CAST")
    fun wParam(segment: MemorySegment): Long =
        wParam_VH.get(segment, 0L) as Long

    fun wParam(segment: MemorySegment, value: Long) =
        wParam_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT tagRAWMOUSE
 */
class tagRAWMOUSE {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("usFlags"),
            MemoryLayout.paddingLayout(6L),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("ulRawButtons"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("lLastX"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("lLastY"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("ulExtraInformation")
        ).withByteAlignment(4L).withName("tagRAWMOUSE")

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

    val usFlags_VH: VarHandle = layout.varHandle(groupElement("usFlags"))

    @Suppress("UNCHECKED_CAST")
    fun usFlags(segment: MemorySegment): Short =
        usFlags_VH.get(segment, 0L) as Short

    fun usFlags(segment: MemorySegment, value: Short) =
        usFlags_VH.set(segment, 0L, value)

    val ulRawButtons_VH: VarHandle = layout.varHandle(groupElement("ulRawButtons"))

    @Suppress("UNCHECKED_CAST")
    fun ulRawButtons(segment: MemorySegment): Int =
        ulRawButtons_VH.get(segment, 0L) as Int

    fun ulRawButtons(segment: MemorySegment, value: Int) =
        ulRawButtons_VH.set(segment, 0L, value)

    val lLastX_VH: VarHandle = layout.varHandle(groupElement("lLastX"))

    @Suppress("UNCHECKED_CAST")
    fun lLastX(segment: MemorySegment): Int =
        lLastX_VH.get(segment, 0L) as Int

    fun lLastX(segment: MemorySegment, value: Int) =
        lLastX_VH.set(segment, 0L, value)

    val lLastY_VH: VarHandle = layout.varHandle(groupElement("lLastY"))

    @Suppress("UNCHECKED_CAST")
    fun lLastY(segment: MemorySegment): Int =
        lLastY_VH.get(segment, 0L) as Int

    fun lLastY(segment: MemorySegment, value: Int) =
        lLastY_VH.set(segment, 0L, value)

    val ulExtraInformation_VH: VarHandle = layout.varHandle(groupElement("ulExtraInformation"))

    @Suppress("UNCHECKED_CAST")
    fun ulExtraInformation(segment: MemorySegment): Int =
        ulExtraInformation_VH.get(segment, 0L) as Int

    fun ulExtraInformation(segment: MemorySegment, value: Int) =
        ulExtraInformation_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT tagRAWKEYBOARD
 */
class tagRAWKEYBOARD {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("MakeCode"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("Flags"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("Reserved"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("VKey"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("Message"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("ExtraInformation")
        ).withByteAlignment(4L).withName("tagRAWKEYBOARD")

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

    val MakeCode_VH: VarHandle = layout.varHandle(groupElement("MakeCode"))

    @Suppress("UNCHECKED_CAST")
    fun MakeCode(segment: MemorySegment): Short =
        MakeCode_VH.get(segment, 0L) as Short

    fun MakeCode(segment: MemorySegment, value: Short) =
        MakeCode_VH.set(segment, 0L, value)

    val Flags_VH: VarHandle = layout.varHandle(groupElement("Flags"))

    @Suppress("UNCHECKED_CAST")
    fun Flags(segment: MemorySegment): Short =
        Flags_VH.get(segment, 0L) as Short

    fun Flags(segment: MemorySegment, value: Short) =
        Flags_VH.set(segment, 0L, value)

    val Reserved_VH: VarHandle = layout.varHandle(groupElement("Reserved"))

    @Suppress("UNCHECKED_CAST")
    fun Reserved(segment: MemorySegment): Short =
        Reserved_VH.get(segment, 0L) as Short

    fun Reserved(segment: MemorySegment, value: Short) =
        Reserved_VH.set(segment, 0L, value)

    val VKey_VH: VarHandle = layout.varHandle(groupElement("VKey"))

    @Suppress("UNCHECKED_CAST")
    fun VKey(segment: MemorySegment): Short =
        VKey_VH.get(segment, 0L) as Short

    fun VKey(segment: MemorySegment, value: Short) =
        VKey_VH.set(segment, 0L, value)

    val Message_VH: VarHandle = layout.varHandle(groupElement("Message"))

    @Suppress("UNCHECKED_CAST")
    fun Message(segment: MemorySegment): Int =
        Message_VH.get(segment, 0L) as Int

    fun Message(segment: MemorySegment, value: Int) =
        Message_VH.set(segment, 0L, value)

    val ExtraInformation_VH: VarHandle = layout.varHandle(groupElement("ExtraInformation"))

    @Suppress("UNCHECKED_CAST")
    fun ExtraInformation(segment: MemorySegment): Int =
        ExtraInformation_VH.get(segment, 0L) as Int

    fun ExtraInformation(segment: MemorySegment, value: Int) =
        ExtraInformation_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT tagRAWHID
 */
class tagRAWHID {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dwSizeHid"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dwCount"),
            MemoryLayout.sequenceLayout(1, ValueLayout.JAVA_BYTE.withByteAlignment(1)).withByteAlignment(1).withName("bRawData"),
            MemoryLayout.paddingLayout(3L)
        ).withByteAlignment(4L).withName("tagRAWHID")

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

    val dwSizeHid_VH: VarHandle = layout.varHandle(groupElement("dwSizeHid"))

    @Suppress("UNCHECKED_CAST")
    fun dwSizeHid(segment: MemorySegment): Int =
        dwSizeHid_VH.get(segment, 0L) as Int

    fun dwSizeHid(segment: MemorySegment, value: Int) =
        dwSizeHid_VH.set(segment, 0L, value)

    val dwCount_VH: VarHandle = layout.varHandle(groupElement("dwCount"))

    @Suppress("UNCHECKED_CAST")
    fun dwCount(segment: MemorySegment): Int =
        dwCount_VH.get(segment, 0L) as Int

    fun dwCount(segment: MemorySegment, value: Int) =
        dwCount_VH.set(segment, 0L, value)

    fun bRawData(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("bRawData")), layout.select(groupElement("bRawData")).byteSize())
} // End class

/**
 * {@snippet lang=c : GetRawInputData typedef UINT = UNSIGNED = Int(typedef HRAWINPUT = (Declared(HRAWINPUT__))*,typedef UINT = UNSIGNED = Int,typedef LPVOID = (Void)*,typedef PUINT = (UNSIGNED = Int)*,typedef UINT = UNSIGNED = Int)
 */
private val GetRawInputData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetRawInputData_HANDLE: MethodHandle? = null

fun GetRawInputData(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: MemorySegment, arg4: Int): Int {
    check(_initialized) { "Win32 GetRawInputData called before init()" }
    val _handle = GetRawInputData_HANDLE ?: return 0
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
 * {@snippet lang=c : STRUCT tagRAWINPUTDEVICE
 */
class tagRAWINPUTDEVICE {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("usUsagePage"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("usUsage"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dwFlags"),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("hwndTarget")
        ).withByteAlignment(8L).withName("tagRAWINPUTDEVICE")

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

    val usUsagePage_VH: VarHandle = layout.varHandle(groupElement("usUsagePage"))

    @Suppress("UNCHECKED_CAST")
    fun usUsagePage(segment: MemorySegment): Short =
        usUsagePage_VH.get(segment, 0L) as Short

    fun usUsagePage(segment: MemorySegment, value: Short) =
        usUsagePage_VH.set(segment, 0L, value)

    val usUsage_VH: VarHandle = layout.varHandle(groupElement("usUsage"))

    @Suppress("UNCHECKED_CAST")
    fun usUsage(segment: MemorySegment): Short =
        usUsage_VH.get(segment, 0L) as Short

    fun usUsage(segment: MemorySegment, value: Short) =
        usUsage_VH.set(segment, 0L, value)

    val dwFlags_VH: VarHandle = layout.varHandle(groupElement("dwFlags"))

    @Suppress("UNCHECKED_CAST")
    fun dwFlags(segment: MemorySegment): Int =
        dwFlags_VH.get(segment, 0L) as Int

    fun dwFlags(segment: MemorySegment, value: Int) =
        dwFlags_VH.set(segment, 0L, value)

    val hwndTarget_VH: VarHandle = layout.varHandle(groupElement("hwndTarget"))

    @Suppress("UNCHECKED_CAST")
    fun hwndTarget(segment: MemorySegment): MemorySegment =
        hwndTarget_VH.get(segment, 0L) as MemorySegment

    fun hwndTarget(segment: MemorySegment, value: MemorySegment) =
        hwndTarget_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : RegisterRawInputDevices typedef BOOL = Int(typedef PCRAWINPUTDEVICE = (Declared(tagRAWINPUTDEVICE))*,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int)
 */
private val RegisterRawInputDevices_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var RegisterRawInputDevices_HANDLE: MethodHandle? = null

fun RegisterRawInputDevices(arg0: MemorySegment, arg1: Int, arg2: Int): Int {
    check(_initialized) { "Win32 RegisterRawInputDevices called before init()" }
    val _handle = RegisterRawInputDevices_HANDLE ?: return 0
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
 * {@snippet lang=c : GetRegisteredRawInputDevices typedef UINT = UNSIGNED = Int(typedef PRAWINPUTDEVICE = (Declared(tagRAWINPUTDEVICE))*,typedef PUINT = (UNSIGNED = Int)*,typedef UINT = UNSIGNED = Int)
 */
private val GetRegisteredRawInputDevices_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetRegisteredRawInputDevices_HANDLE: MethodHandle? = null

fun GetRegisteredRawInputDevices(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    check(_initialized) { "Win32 GetRegisteredRawInputDevices called before init()" }
    val _handle = GetRegisteredRawInputDevices_HANDLE ?: return 0
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
 * {@snippet lang=c : STRUCT tagRAWINPUTDEVICELIST
 */
class tagRAWINPUTDEVICELIST {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withByteAlignment(8).withName("hDevice"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dwType"),
            MemoryLayout.paddingLayout(4L)
        ).withByteAlignment(8L).withName("tagRAWINPUTDEVICELIST")

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

    val hDevice_VH: VarHandle = layout.varHandle(groupElement("hDevice"))

    @Suppress("UNCHECKED_CAST")
    fun hDevice(segment: MemorySegment): MemorySegment =
        hDevice_VH.get(segment, 0L) as MemorySegment

    fun hDevice(segment: MemorySegment, value: MemorySegment) =
        hDevice_VH.set(segment, 0L, value)

    val dwType_VH: VarHandle = layout.varHandle(groupElement("dwType"))

    @Suppress("UNCHECKED_CAST")
    fun dwType(segment: MemorySegment): Int =
        dwType_VH.get(segment, 0L) as Int

    fun dwType(segment: MemorySegment, value: Int) =
        dwType_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : GetRawInputDeviceList typedef UINT = UNSIGNED = Int(typedef PRAWINPUTDEVICELIST = (Declared(tagRAWINPUTDEVICELIST))*,typedef PUINT = (UNSIGNED = Int)*,typedef UINT = UNSIGNED = Int)
 */
private val GetRawInputDeviceList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private var GetRawInputDeviceList_HANDLE: MethodHandle? = null

fun GetRawInputDeviceList(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Int {
    check(_initialized) { "Win32 GetRawInputDeviceList called before init()" }
    val _handle = GetRawInputDeviceList_HANDLE ?: return 0
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
 * {@snippet lang=c : STRUCT tagFORMATETC
 */
class tagFORMATETC {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("cfFormat"),
            MemoryLayout.paddingLayout(6L),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("ptd"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dwAspect"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("lindex"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("tymed"),
            MemoryLayout.paddingLayout(4L)
        ).withByteAlignment(8L).withName("tagFORMATETC")

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

    val cfFormat_VH: VarHandle = layout.varHandle(groupElement("cfFormat"))

    @Suppress("UNCHECKED_CAST")
    fun cfFormat(segment: MemorySegment): Short =
        cfFormat_VH.get(segment, 0L) as Short

    fun cfFormat(segment: MemorySegment, value: Short) =
        cfFormat_VH.set(segment, 0L, value)

    val ptd_VH: VarHandle = layout.varHandle(groupElement("ptd"))

    @Suppress("UNCHECKED_CAST")
    fun ptd(segment: MemorySegment): MemorySegment =
        ptd_VH.get(segment, 0L) as MemorySegment

    fun ptd(segment: MemorySegment, value: MemorySegment) =
        ptd_VH.set(segment, 0L, value)

    val dwAspect_VH: VarHandle = layout.varHandle(groupElement("dwAspect"))

    @Suppress("UNCHECKED_CAST")
    fun dwAspect(segment: MemorySegment): Int =
        dwAspect_VH.get(segment, 0L) as Int

    fun dwAspect(segment: MemorySegment, value: Int) =
        dwAspect_VH.set(segment, 0L, value)

    val lindex_VH: VarHandle = layout.varHandle(groupElement("lindex"))

    @Suppress("UNCHECKED_CAST")
    fun lindex(segment: MemorySegment): Int =
        lindex_VH.get(segment, 0L) as Int

    fun lindex(segment: MemorySegment, value: Int) =
        lindex_VH.set(segment, 0L, value)

    val tymed_VH: VarHandle = layout.varHandle(groupElement("tymed"))

    @Suppress("UNCHECKED_CAST")
    fun tymed(segment: MemorySegment): Int =
        tymed_VH.get(segment, 0L) as Int

    fun tymed(segment: MemorySegment, value: Int) =
        tymed_VH.set(segment, 0L, value)
} // End class

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
 * {@snippet lang=c : STRUCT tagSTGMEDIUM
 */
class tagSTGMEDIUM {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("tymed"),
            MemoryLayout.paddingLayout(12L),
            ValueLayout.ADDRESS.withByteAlignment(8).withName("pUnkForRelease")
        ).withByteAlignment(8L).withName("tagSTGMEDIUM")

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

    val tymed_VH: VarHandle = layout.varHandle(groupElement("tymed"))

    @Suppress("UNCHECKED_CAST")
    fun tymed(segment: MemorySegment): Int =
        tymed_VH.get(segment, 0L) as Int

    fun tymed(segment: MemorySegment, value: Int) =
        tymed_VH.set(segment, 0L, value)

    val pUnkForRelease_VH: VarHandle = layout.varHandle(groupElement("pUnkForRelease"))

    @Suppress("UNCHECKED_CAST")
    fun pUnkForRelease(segment: MemorySegment): MemorySegment =
        pUnkForRelease_VH.get(segment, 0L) as MemorySegment

    fun pUnkForRelease(segment: MemorySegment, value: MemorySegment) =
        pUnkForRelease_VH.set(segment, 0L, value)
} // End class

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
 * {@snippet lang=c : OleInitialize typedef HRESULT = Long(typedef LPVOID = (Void)*)
 */
private val OleInitialize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var OleInitialize_HANDLE: MethodHandle? = null

fun OleInitialize(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 OleInitialize called before init()" }
    val _handle = OleInitialize_HANDLE ?: return 0
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
 * {@snippet lang=c : OleUninitialize Void()
 */
private val OleUninitialize_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private var OleUninitialize_HANDLE: MethodHandle? = null

fun OleUninitialize(): Unit {
    check(_initialized) { "Win32 OleUninitialize called before init()" }
    val _handle = OleUninitialize_HANDLE ?: return
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
 * {@snippet lang=c : RegisterDragDrop typedef HRESULT = Long(typedef HWND = (Declared(HWND__))*,typedef LPDROPTARGET = (Void)*)
 */
private val RegisterDragDrop_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var RegisterDragDrop_HANDLE: MethodHandle? = null

fun RegisterDragDrop(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 RegisterDragDrop called before init()" }
    val _handle = RegisterDragDrop_HANDLE ?: return 0
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
 * {@snippet lang=c : RevokeDragDrop typedef HRESULT = Long(typedef HWND = (Declared(HWND__))*)
 */
private val RevokeDragDrop_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var RevokeDragDrop_HANDLE: MethodHandle? = null

fun RevokeDragDrop(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 RevokeDragDrop called before init()" }
    val _handle = RevokeDragDrop_HANDLE ?: return 0
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
 * {@snippet lang=c : ReleaseStgMedium Void(typedef LPSTGMEDIUM = (Declared(tagSTGMEDIUM))*)
 */
private val ReleaseStgMedium_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private var ReleaseStgMedium_HANDLE: MethodHandle? = null

fun ReleaseStgMedium(arg0: MemorySegment): Unit {
    check(_initialized) { "Win32 ReleaseStgMedium called before init()" }
    val _handle = ReleaseStgMedium_HANDLE ?: return
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
 * {@snippet lang=c : CreateStreamOnHGlobal typedef HRESULT = Long(typedef HGLOBAL = (Void)*,typedef BOOL = Int,(typedef LPSTREAM = (Void)*)*)
 */
private val CreateStreamOnHGlobal_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var CreateStreamOnHGlobal_HANDLE: MethodHandle? = null

fun CreateStreamOnHGlobal(arg0: MemorySegment, arg1: Int, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 CreateStreamOnHGlobal called before init()" }
    val _handle = CreateStreamOnHGlobal_HANDLE ?: return 0
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
 * NS_ENUM: {@snippet lang=c : enum tagSTRRET_TYPE}
 */
enum class tagSTRRET_TYPE(val value: Long) {
    STRRET_WSTR(0L), STRRET_OFFSET(1L), STRRET_CSTR(2L);

    companion object {
        fun fromValue(v: Long): tagSTRRET_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSTRRET_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPERCEIVED}
 */
enum class tagPERCEIVED(val value: Long) {
    PERCEIVED_TYPE_FIRST(-3L), PERCEIVED_TYPE_CUSTOM(-3L), PERCEIVED_TYPE_UNSPECIFIED(-2L), PERCEIVED_TYPE_FOLDER(-1L), PERCEIVED_TYPE_UNKNOWN(0L), PERCEIVED_TYPE_TEXT(1L), PERCEIVED_TYPE_IMAGE(2L), PERCEIVED_TYPE_AUDIO(3L), PERCEIVED_TYPE_VIDEO(4L), PERCEIVED_TYPE_COMPRESSED(5L), PERCEIVED_TYPE_DOCUMENT(6L), PERCEIVED_TYPE_SYSTEM(7L), PERCEIVED_TYPE_APPLICATION(8L), PERCEIVED_TYPE_GAMEMEDIA(9L), PERCEIVED_TYPE_CONTACTS(10L), PERCEIVED_TYPE_LAST(10L);

    companion object {
        fun fromValue(v: Long): tagPERCEIVED = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPERCEIVED value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long PERCEIVEDFLAG;}
 */
typealias PERCEIVEDFLAG = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long KF_REDIRECT_FLAGS;}
 */
typealias KF_REDIRECT_FLAGS = Int

/**
 * NS_ENUM: {@snippet lang=c : enum tagSHCOLSTATE}
 */
enum class tagSHCOLSTATE(val value: Long) {
    SHCOLSTATE_DEFAULT(0L), SHCOLSTATE_TYPE_STR(1L), SHCOLSTATE_TYPE_INT(2L), SHCOLSTATE_TYPE_DATE(3L), SHCOLSTATE_TYPEMASK(15L), SHCOLSTATE_ONBYDEFAULT(16L), SHCOLSTATE_SLOW(32L), SHCOLSTATE_EXTENDED(64L), SHCOLSTATE_SECONDARYUI(128L), SHCOLSTATE_HIDDEN(256L), SHCOLSTATE_PREFER_VARCMP(512L), SHCOLSTATE_PREFER_FMTCMP(1024L), SHCOLSTATE_NOSORTBYFOLDERNESS(2048L), SHCOLSTATE_VIEWONLY(65536L), SHCOLSTATE_BATCHREAD(131072L), SHCOLSTATE_NO_GROUPBY(262144L), SHCOLSTATE_FIXED_WIDTH(4096L), SHCOLSTATE_NODPISCALE(8192L), SHCOLSTATE_FIXED_RATIO(16384L), SHCOLSTATE_DISPLAYMASK(61440L);

    companion object {
        fun fromValue(v: Long): tagSHCOLSTATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagSHCOLSTATE value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long SHCOLSTATEF;}
 */
typealias SHCOLSTATEF = Int

/**
 * NS_ENUM: {@snippet lang=c : enum DEVICE_SCALE_FACTOR}
 */
enum class DEVICE_SCALE_FACTOR(val value: Long) {
    DEVICE_SCALE_FACTOR_INVALID(0L), SCALE_100_PERCENT(100L), SCALE_120_PERCENT(120L), SCALE_125_PERCENT(125L), SCALE_140_PERCENT(140L), SCALE_150_PERCENT(150L), SCALE_160_PERCENT(160L), SCALE_175_PERCENT(175L), SCALE_180_PERCENT(180L), SCALE_200_PERCENT(200L), SCALE_225_PERCENT(225L), SCALE_250_PERCENT(250L), SCALE_300_PERCENT(300L), SCALE_350_PERCENT(350L), SCALE_400_PERCENT(400L), SCALE_450_PERCENT(450L), SCALE_500_PERCENT(500L);

    companion object {
        fun fromValue(v: Long): DEVICE_SCALE_FACTOR = entries.firstOrNull { it.value == v }
            ?: error("Unknown DEVICE_SCALE_FACTOR value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DISPLAY_DEVICE_TYPE}
 */
enum class DISPLAY_DEVICE_TYPE(val value: Long) {
    DEVICE_PRIMARY(0L), DEVICE_IMMERSIVE(1L);

    companion object {
        fun fromValue(v: Long): DISPLAY_DEVICE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown DISPLAY_DEVICE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum SCALE_CHANGE_FLAGS}
 */
enum class SCALE_CHANGE_FLAGS(val value: Long) {
    SCF_VALUE_NONE(0L), SCF_SCALE(1L), SCF_PHYSICAL(2L);

    companion object {
        fun fromValue(v: Long): SCALE_CHANGE_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown SCALE_CHANGE_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum PROCESS_DPI_AWARENESS}
 */
enum class PROCESS_DPI_AWARENESS(val value: Long) {
    PROCESS_DPI_UNAWARE(0L), PROCESS_SYSTEM_DPI_AWARE(1L), PROCESS_PER_MONITOR_DPI_AWARE(2L);

    companion object {
        fun fromValue(v: Long): PROCESS_DPI_AWARENESS = entries.firstOrNull { it.value == v }
            ?: error("Unknown PROCESS_DPI_AWARENESS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum MONITOR_DPI_TYPE}
 */
enum class MONITOR_DPI_TYPE(val value: Long) {
    MDT_EFFECTIVE_DPI(0L), MDT_ANGULAR_DPI(1L), MDT_RAW_DPI(2L), MDT_DEFAULT(0L);

    companion object {
        fun fromValue(v: Long): MONITOR_DPI_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown MONITOR_DPI_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : GetDpiForMonitor typedef HRESULT = Long(typedef HMONITOR = (Declared(HMONITOR__))*,typedef MONITOR_DPI_TYPE = Declared(MONITOR_DPI_TYPE),(typedef UINT = UNSIGNED = Int)*,(typedef UINT = UNSIGNED = Int)*)
 */
private val GetDpiForMonitor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var GetDpiForMonitor_HANDLE: MethodHandle? = null

fun GetDpiForMonitor(arg0: MemorySegment, arg1: MONITOR_DPI_TYPE, arg2: MemorySegment, arg3: MemorySegment): Int {
    check(_initialized) { "Win32 GetDpiForMonitor called before init()" }
    val _handle = GetDpiForMonitor_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1.value.toInt(), arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum SHELL_UI_COMPONENT}
 */
enum class SHELL_UI_COMPONENT(val value: Long) {
    SHELL_UI_COMPONENT_TASKBARS(0L), SHELL_UI_COMPONENT_NOTIFICATIONAREA(1L), SHELL_UI_COMPONENT_DESKBAND(2L);

    companion object {
        fun fromValue(v: Long): SHELL_UI_COMPONENT = entries.firstOrNull { it.value == v }
            ?: error("Unknown SHELL_UI_COMPONENT value: $v")
    }
}

/**
 * {@snippet lang=c : STRUCT _XINPUT_GAMEPAD
 */
class _XINPUT_GAMEPAD {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("wButtons"),
            ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("bLeftTrigger"),
            ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("bRightTrigger"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("sThumbLX"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("sThumbLY"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("sThumbRX"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("sThumbRY")
        ).withByteAlignment(2L).withName("_XINPUT_GAMEPAD")

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

    val wButtons_VH: VarHandle = layout.varHandle(groupElement("wButtons"))

    @Suppress("UNCHECKED_CAST")
    fun wButtons(segment: MemorySegment): Short =
        wButtons_VH.get(segment, 0L) as Short

    fun wButtons(segment: MemorySegment, value: Short) =
        wButtons_VH.set(segment, 0L, value)

    val bLeftTrigger_VH: VarHandle = layout.varHandle(groupElement("bLeftTrigger"))

    @Suppress("UNCHECKED_CAST")
    fun bLeftTrigger(segment: MemorySegment): Byte =
        bLeftTrigger_VH.get(segment, 0L) as Byte

    fun bLeftTrigger(segment: MemorySegment, value: Byte) =
        bLeftTrigger_VH.set(segment, 0L, value)

    val bRightTrigger_VH: VarHandle = layout.varHandle(groupElement("bRightTrigger"))

    @Suppress("UNCHECKED_CAST")
    fun bRightTrigger(segment: MemorySegment): Byte =
        bRightTrigger_VH.get(segment, 0L) as Byte

    fun bRightTrigger(segment: MemorySegment, value: Byte) =
        bRightTrigger_VH.set(segment, 0L, value)

    val sThumbLX_VH: VarHandle = layout.varHandle(groupElement("sThumbLX"))

    @Suppress("UNCHECKED_CAST")
    fun sThumbLX(segment: MemorySegment): Short =
        sThumbLX_VH.get(segment, 0L) as Short

    fun sThumbLX(segment: MemorySegment, value: Short) =
        sThumbLX_VH.set(segment, 0L, value)

    val sThumbLY_VH: VarHandle = layout.varHandle(groupElement("sThumbLY"))

    @Suppress("UNCHECKED_CAST")
    fun sThumbLY(segment: MemorySegment): Short =
        sThumbLY_VH.get(segment, 0L) as Short

    fun sThumbLY(segment: MemorySegment, value: Short) =
        sThumbLY_VH.set(segment, 0L, value)

    val sThumbRX_VH: VarHandle = layout.varHandle(groupElement("sThumbRX"))

    @Suppress("UNCHECKED_CAST")
    fun sThumbRX(segment: MemorySegment): Short =
        sThumbRX_VH.get(segment, 0L) as Short

    fun sThumbRX(segment: MemorySegment, value: Short) =
        sThumbRX_VH.set(segment, 0L, value)

    val sThumbRY_VH: VarHandle = layout.varHandle(groupElement("sThumbRY"))

    @Suppress("UNCHECKED_CAST")
    fun sThumbRY(segment: MemorySegment): Short =
        sThumbRY_VH.get(segment, 0L) as Short

    fun sThumbRY(segment: MemorySegment, value: Short) =
        sThumbRY_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT _XINPUT_STATE
 */
class _XINPUT_STATE {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("dwPacketNumber"),
            _XINPUT_GAMEPAD.layout.withByteAlignment(2).withName("Gamepad")
        ).withByteAlignment(4L).withName("_XINPUT_STATE")

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

    val dwPacketNumber_VH: VarHandle = layout.varHandle(groupElement("dwPacketNumber"))

    @Suppress("UNCHECKED_CAST")
    fun dwPacketNumber(segment: MemorySegment): Int =
        dwPacketNumber_VH.get(segment, 0L) as Int

    fun dwPacketNumber(segment: MemorySegment, value: Int) =
        dwPacketNumber_VH.set(segment, 0L, value)

    fun Gamepad(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("Gamepad")), layout.select(groupElement("Gamepad")).byteSize())
} // End class

/**
 * {@snippet lang=c : STRUCT _XINPUT_VIBRATION
 */
class _XINPUT_VIBRATION {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("wLeftMotorSpeed"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("wRightMotorSpeed")
        ).withByteAlignment(2L).withName("_XINPUT_VIBRATION")

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

    val wLeftMotorSpeed_VH: VarHandle = layout.varHandle(groupElement("wLeftMotorSpeed"))

    @Suppress("UNCHECKED_CAST")
    fun wLeftMotorSpeed(segment: MemorySegment): Short =
        wLeftMotorSpeed_VH.get(segment, 0L) as Short

    fun wLeftMotorSpeed(segment: MemorySegment, value: Short) =
        wLeftMotorSpeed_VH.set(segment, 0L, value)

    val wRightMotorSpeed_VH: VarHandle = layout.varHandle(groupElement("wRightMotorSpeed"))

    @Suppress("UNCHECKED_CAST")
    fun wRightMotorSpeed(segment: MemorySegment): Short =
        wRightMotorSpeed_VH.get(segment, 0L) as Short

    fun wRightMotorSpeed(segment: MemorySegment, value: Short) =
        wRightMotorSpeed_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT _XINPUT_CAPABILITIES
 */
class _XINPUT_CAPABILITIES {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("Type"),
            ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("SubType"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("Flags"),
            _XINPUT_GAMEPAD.layout.withByteAlignment(2).withName("Gamepad"),
            _XINPUT_VIBRATION.layout.withByteAlignment(2).withName("Vibration")
        ).withByteAlignment(2L).withName("_XINPUT_CAPABILITIES")

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

    val Type_VH: VarHandle = layout.varHandle(groupElement("Type"))

    @Suppress("UNCHECKED_CAST")
    fun Type(segment: MemorySegment): Byte =
        Type_VH.get(segment, 0L) as Byte

    fun Type(segment: MemorySegment, value: Byte) =
        Type_VH.set(segment, 0L, value)

    val SubType_VH: VarHandle = layout.varHandle(groupElement("SubType"))

    @Suppress("UNCHECKED_CAST")
    fun SubType(segment: MemorySegment): Byte =
        SubType_VH.get(segment, 0L) as Byte

    fun SubType(segment: MemorySegment, value: Byte) =
        SubType_VH.set(segment, 0L, value)

    val Flags_VH: VarHandle = layout.varHandle(groupElement("Flags"))

    @Suppress("UNCHECKED_CAST")
    fun Flags(segment: MemorySegment): Short =
        Flags_VH.get(segment, 0L) as Short

    fun Flags(segment: MemorySegment, value: Short) =
        Flags_VH.set(segment, 0L, value)

    fun Gamepad(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("Gamepad")), layout.select(groupElement("Gamepad")).byteSize())

    fun Vibration(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("Vibration")), layout.select(groupElement("Vibration")).byteSize())
} // End class

/**
 * {@snippet lang=c : STRUCT _XINPUT_BATTERY_INFORMATION
 */
class _XINPUT_BATTERY_INFORMATION {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("BatteryType"),
            ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("BatteryLevel")
        ).withByteAlignment(1L).withName("_XINPUT_BATTERY_INFORMATION")

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

    val BatteryType_VH: VarHandle = layout.varHandle(groupElement("BatteryType"))

    @Suppress("UNCHECKED_CAST")
    fun BatteryType(segment: MemorySegment): Byte =
        BatteryType_VH.get(segment, 0L) as Byte

    fun BatteryType(segment: MemorySegment, value: Byte) =
        BatteryType_VH.set(segment, 0L, value)

    val BatteryLevel_VH: VarHandle = layout.varHandle(groupElement("BatteryLevel"))

    @Suppress("UNCHECKED_CAST")
    fun BatteryLevel(segment: MemorySegment): Byte =
        BatteryLevel_VH.get(segment, 0L) as Byte

    fun BatteryLevel(segment: MemorySegment, value: Byte) =
        BatteryLevel_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : XInputGetState typedef DWORD = UNSIGNED = Long(typedef DWORD = UNSIGNED = Long,(typedef XINPUT_STATE = Declared(_XINPUT_STATE))*)
 */
private val XInputGetState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var XInputGetState_HANDLE: MethodHandle? = null

fun XInputGetState(arg0: Int, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 XInputGetState called before init()" }
    val _handle = XInputGetState_HANDLE ?: return 0
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
 * {@snippet lang=c : XInputSetState typedef DWORD = UNSIGNED = Long(typedef DWORD = UNSIGNED = Long,(typedef XINPUT_VIBRATION = Declared(_XINPUT_VIBRATION))*)
 */
private val XInputSetState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var XInputSetState_HANDLE: MethodHandle? = null

fun XInputSetState(arg0: Int, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 XInputSetState called before init()" }
    val _handle = XInputSetState_HANDLE ?: return 0
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
 * {@snippet lang=c : XInputGetCapabilities typedef DWORD = UNSIGNED = Long(typedef DWORD = UNSIGNED = Long,typedef DWORD = UNSIGNED = Long,(typedef XINPUT_CAPABILITIES = Declared(_XINPUT_CAPABILITIES))*)
 */
private val XInputGetCapabilities_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var XInputGetCapabilities_HANDLE: MethodHandle? = null

fun XInputGetCapabilities(arg0: Int, arg1: Int, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 XInputGetCapabilities called before init()" }
    val _handle = XInputGetCapabilities_HANDLE ?: return 0
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
 * {@snippet lang=c : XInputGetBatteryInformation typedef DWORD = UNSIGNED = Long(typedef DWORD = UNSIGNED = Long,typedef BYTE = UNSIGNED = Char,(typedef XINPUT_BATTERY_INFORMATION = Declared(_XINPUT_BATTERY_INFORMATION))*)
 */
private val XInputGetBatteryInformation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private var XInputGetBatteryInformation_HANDLE: MethodHandle? = null

fun XInputGetBatteryInformation(arg0: Int, arg1: Byte, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 XInputGetBatteryInformation called before init()" }
    val _handle = XInputGetBatteryInformation_HANDLE ?: return 0
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
 * NS_ENUM: {@snippet lang=c : enum TrustLevel}
 */
enum class TrustLevel(val value: Long) {
    BaseTrust(0L), PartialTrust(1L), FullTrust(2L);

    companion object {
        fun fromValue(v: Long): TrustLevel = entries.firstOrNull { it.value == v }
            ?: error("Unknown TrustLevel value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum RO_INIT_TYPE}
 */
enum class RO_INIT_TYPE(val value: Long) {
    RO_INIT_SINGLETHREADED(0L), RO_INIT_MULTITHREADED(1L);

    companion object {
        fun fromValue(v: Long): RO_INIT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown RO_INIT_TYPE value: $v")
    }
}

/**
 * {@snippet lang=c : RoInitialize typedef HRESULT = Long(typedef RO_INIT_TYPE = Declared(RO_INIT_TYPE))
 */
private val RoInitialize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private var RoInitialize_HANDLE: MethodHandle? = null

fun RoInitialize(arg0: RO_INIT_TYPE): Int {
    check(_initialized) { "Win32 RoInitialize called before init()" }
    val _handle = RoInitialize_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0.value.toInt()) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : RoUninitialize Void()
 */
private val RoUninitialize_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private var RoUninitialize_HANDLE: MethodHandle? = null

fun RoUninitialize(): Unit {
    check(_initialized) { "Win32 RoUninitialize called before init()" }
    val _handle = RoUninitialize_HANDLE ?: return
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
 * {@snippet lang=c : RoGetActivationFactory typedef HRESULT = Long(typedef HSTRING = (Declared(HSTRING__))*,(typedef IID = Declared(_GUID))*,((Void)*)*)
 */
private val RoGetActivationFactory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var RoGetActivationFactory_HANDLE: MethodHandle? = null

fun RoGetActivationFactory(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 RoGetActivationFactory called before init()" }
    val _handle = RoGetActivationFactory_HANDLE ?: return 0
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
 * {@snippet lang=c : WindowsCreateString typedef HRESULT = Long(typedef PCNZWCH = (UNSIGNED = Short)*,typedef UINT32 = UNSIGNED = Int,(typedef HSTRING = (Declared(HSTRING__))*)*)
 */
private val WindowsCreateString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var WindowsCreateString_HANDLE: MethodHandle? = null

fun WindowsCreateString(arg0: MemorySegment, arg1: Int, arg2: MemorySegment): Int {
    check(_initialized) { "Win32 WindowsCreateString called before init()" }
    val _handle = WindowsCreateString_HANDLE ?: return 0
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
 * {@snippet lang=c : WindowsDeleteString typedef HRESULT = Long(typedef HSTRING = (Declared(HSTRING__))*)
 */
private val WindowsDeleteString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private var WindowsDeleteString_HANDLE: MethodHandle? = null

fun WindowsDeleteString(arg0: MemorySegment): Int {
    check(_initialized) { "Win32 WindowsDeleteString called before init()" }
    val _handle = WindowsDeleteString_HANDLE ?: return 0
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
 * {@snippet lang=c : WindowsGetStringRawBuffer typedef PCWSTR = (UNSIGNED = Short)*(typedef HSTRING = (Declared(HSTRING__))*,(typedef UINT32 = UNSIGNED = Int)*)
 */
private val WindowsGetStringRawBuffer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var WindowsGetStringRawBuffer_HANDLE: MethodHandle? = null

fun WindowsGetStringRawBuffer(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    check(_initialized) { "Win32 WindowsGetStringRawBuffer called before init()" }
    val _handle = WindowsGetStringRawBuffer_HANDLE ?: return MemorySegment.NULL
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
 * NS_ENUM: {@snippet lang=c : enum tagUASFLAGS}
 */
enum class tagUASFLAGS(val value: Long) {
    UAS_NORMAL(0L), UAS_BLOCKED(1L), UAS_NOPARENTENABLE(2L), UAS_MASK(3L);

    companion object {
        fun fromValue(v: Long): tagUASFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagUASFLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagREADYSTATE}
 */
enum class tagREADYSTATE(val value: Long) {
    READYSTATE_UNINITIALIZED(0L), READYSTATE_LOADING(1L), READYSTATE_LOADED(2L), READYSTATE_INTERACTIVE(3L), READYSTATE_COMPLETE(4L);

    companion object {
        fun fromValue(v: Long): tagREADYSTATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagREADYSTATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagGUIDKIND}
 */
enum class tagGUIDKIND(val value: Long) {
    GUIDKIND_DEFAULT_SOURCE_DISP_IID(1L);

    companion object {
        fun fromValue(v: Long): tagGUIDKIND = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagGUIDKIND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagCTRLINFO}
 */
enum class tagCTRLINFO(val value: Long) {
    CTRLINFO_EATS_RETURN(1L), CTRLINFO_EATS_ESCAPE(2L);

    companion object {
        fun fromValue(v: Long): tagCTRLINFO = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagCTRLINFO value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagXFORMCOORDS}
 */
enum class tagXFORMCOORDS(val value: Long) {
    XFORMCOORDS_POSITION(1L), XFORMCOORDS_SIZE(2L), XFORMCOORDS_HIMETRICTOCONTAINER(4L), XFORMCOORDS_CONTAINERTOHIMETRIC(8L), XFORMCOORDS_EVENTCOMPAT(16L);

    companion object {
        fun fromValue(v: Long): tagXFORMCOORDS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagXFORMCOORDS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPROPPAGESTATUS}
 */
enum class tagPROPPAGESTATUS(val value: Long) {
    PROPPAGESTATUS_DIRTY(1L), PROPPAGESTATUS_VALIDATE(2L), PROPPAGESTATUS_CLEAN(4L);

    companion object {
        fun fromValue(v: Long): tagPROPPAGESTATUS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPROPPAGESTATUS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPictureAttributes}
 */
enum class tagPictureAttributes(val value: Long) {
    PICTURE_SCALABLE(1L), PICTURE_TRANSPARENT(2L);

    companion object {
        fun fromValue(v: Long): tagPictureAttributes = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPictureAttributes value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Int OLE_HANDLE;}
 */
typealias OLE_HANDLE = Int

/**
 * {@snippet lang=c : typedef Long OLE_XPOS_HIMETRIC;}
 */
typealias OLE_XPOS_HIMETRIC = Int

/**
 * {@snippet lang=c : typedef Long OLE_YPOS_HIMETRIC;}
 */
typealias OLE_YPOS_HIMETRIC = Int

/**
 * {@snippet lang=c : typedef Long OLE_XSIZE_HIMETRIC;}
 */
typealias OLE_XSIZE_HIMETRIC = Int

/**
 * {@snippet lang=c : typedef Long OLE_YSIZE_HIMETRIC;}
 */
typealias OLE_YSIZE_HIMETRIC = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong HHANDLE;}
 */
typealias HHANDLE = Long

/**
 * NS_ENUM: {@snippet lang=c : enum tagACTIVATEFLAGS}
 */
enum class tagACTIVATEFLAGS(val value: Long) {
    ACTIVATE_WINDOWLESS(1L);

    companion object {
        fun fromValue(v: Long): tagACTIVATEFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagACTIVATEFLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagOLEDCFLAGS}
 */
enum class tagOLEDCFLAGS(val value: Long) {
    OLEDC_NODRAW(1L), OLEDC_PAINTBKGND(2L), OLEDC_OFFSCREEN(4L);

    companion object {
        fun fromValue(v: Long): tagOLEDCFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagOLEDCFLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagVIEWSTATUS}
 */
enum class tagVIEWSTATUS(val value: Long) {
    VIEWSTATUS_OPAQUE(1L), VIEWSTATUS_SOLIDBKGND(2L), VIEWSTATUS_DVASPECTOPAQUE(4L), VIEWSTATUS_DVASPECTTRANSPARENT(8L), VIEWSTATUS_SURFACE(16L), VIEWSTATUS_3DSURFACE(32L);

    companion object {
        fun fromValue(v: Long): tagVIEWSTATUS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagVIEWSTATUS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagHITRESULT}
 */
enum class tagHITRESULT(val value: Long) {
    HITRESULT_OUTSIDE(0L), HITRESULT_TRANSPARENT(1L), HITRESULT_CLOSE(2L), HITRESULT_HIT(3L);

    companion object {
        fun fromValue(v: Long): tagHITRESULT = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagHITRESULT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagDVASPECT2}
 */
enum class tagDVASPECT2(val value: Long) {
    DVASPECT_OPAQUE(16L), DVASPECT_TRANSPARENT(32L);

    companion object {
        fun fromValue(v: Long): tagDVASPECT2 = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagDVASPECT2 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagExtentMode}
 */
enum class tagExtentMode(val value: Long) {
    DVEXTENT_CONTENT(0L), DVEXTENT_INTEGRAL(1L);

    companion object {
        fun fromValue(v: Long): tagExtentMode = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagExtentMode value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagAspectInfoFlag}
 */
enum class tagAspectInfoFlag(val value: Long) {
    DVASPECTINFOFLAG_CANOPTIMIZE(1L);

    companion object {
        fun fromValue(v: Long): tagAspectInfoFlag = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagAspectInfoFlag value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPOINTERINACTIVE}
 */
enum class tagPOINTERINACTIVE(val value: Long) {
    POINTERINACTIVE_ACTIVATEONENTRY(1L), POINTERINACTIVE_DEACTIVATEONLEAVE(2L), POINTERINACTIVE_ACTIVATEONDRAG(4L);

    companion object {
        fun fromValue(v: Long): tagPOINTERINACTIVE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPOINTERINACTIVE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagPROPBAG2_TYPE}
 */
enum class tagPROPBAG2_TYPE(val value: Long) {
    PROPBAG2_TYPE_UNDEFINED(0L), PROPBAG2_TYPE_DATA(1L), PROPBAG2_TYPE_URL(2L), PROPBAG2_TYPE_OBJECT(3L), PROPBAG2_TYPE_STREAM(4L), PROPBAG2_TYPE_STORAGE(5L), PROPBAG2_TYPE_MONIKER(6L);

    companion object {
        fun fromValue(v: Long): tagPROPBAG2_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagPROPBAG2_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum tagQACONTAINERFLAGS}
 */
enum class tagQACONTAINERFLAGS(val value: Long) {
    QACONTAINER_SHOWHATCHING(1L), QACONTAINER_SHOWGRABHANDLES(2L), QACONTAINER_USERMODE(4L), QACONTAINER_DISPLAYASDEFAULT(8L), QACONTAINER_UIDEAD(16L), QACONTAINER_AUTOCLIP(32L), QACONTAINER_MESSAGEREFLECT(64L), QACONTAINER_SUPPORTSMNEMONICS(128L);

    companion object {
        fun fromValue(v: Long): tagQACONTAINERFLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown tagQACONTAINERFLAGS value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Long OLE_COLOR;}
 */
typealias OLE_COLOR = Int

/**
 * NS_ENUM: {@snippet lang=c : enum DXGI_COLOR_SPACE_TYPE}
 */
enum class DXGI_COLOR_SPACE_TYPE(val value: Long) {
    DXGI_COLOR_SPACE_RGB_FULL_G22_NONE_P709(0L), DXGI_COLOR_SPACE_RGB_FULL_G10_NONE_P709(1L), DXGI_COLOR_SPACE_RGB_STUDIO_G22_NONE_P709(2L), DXGI_COLOR_SPACE_RGB_STUDIO_G22_NONE_P2020(3L), DXGI_COLOR_SPACE_RESERVED(4L), DXGI_COLOR_SPACE_YCBCR_FULL_G22_NONE_P709_X601(5L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G22_LEFT_P601(6L), DXGI_COLOR_SPACE_YCBCR_FULL_G22_LEFT_P601(7L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G22_LEFT_P709(8L), DXGI_COLOR_SPACE_YCBCR_FULL_G22_LEFT_P709(9L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G22_LEFT_P2020(10L), DXGI_COLOR_SPACE_YCBCR_FULL_G22_LEFT_P2020(11L), DXGI_COLOR_SPACE_RGB_FULL_G2084_NONE_P2020(12L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G2084_LEFT_P2020(13L), DXGI_COLOR_SPACE_RGB_STUDIO_G2084_NONE_P2020(14L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G22_TOPLEFT_P2020(15L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G2084_TOPLEFT_P2020(16L), DXGI_COLOR_SPACE_RGB_FULL_G22_NONE_P2020(17L), DXGI_COLOR_SPACE_YCBCR_STUDIO_GHLG_TOPLEFT_P2020(18L), DXGI_COLOR_SPACE_YCBCR_FULL_GHLG_TOPLEFT_P2020(19L), DXGI_COLOR_SPACE_RGB_STUDIO_G24_NONE_P709(20L), DXGI_COLOR_SPACE_RGB_STUDIO_G24_NONE_P2020(21L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G24_LEFT_P709(22L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G24_LEFT_P2020(23L), DXGI_COLOR_SPACE_YCBCR_STUDIO_G24_TOPLEFT_P2020(24L), DXGI_COLOR_SPACE_RGB_FULL_G10_NONE_P2020(25L), DXGI_COLOR_SPACE_CUSTOM(-1L);

    companion object {
        fun fromValue(v: Long): DXGI_COLOR_SPACE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_COLOR_SPACE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DXGI_FORMAT}
 */
enum class DXGI_FORMAT(val value: Long) {
    DXGI_FORMAT_UNKNOWN(0L), DXGI_FORMAT_R32G32B32A32_TYPELESS(1L), DXGI_FORMAT_R32G32B32A32_FLOAT(2L), DXGI_FORMAT_R32G32B32A32_UINT(3L), DXGI_FORMAT_R32G32B32A32_SINT(4L), DXGI_FORMAT_R32G32B32_TYPELESS(5L), DXGI_FORMAT_R32G32B32_FLOAT(6L), DXGI_FORMAT_R32G32B32_UINT(7L), DXGI_FORMAT_R32G32B32_SINT(8L), DXGI_FORMAT_R16G16B16A16_TYPELESS(9L), DXGI_FORMAT_R16G16B16A16_FLOAT(10L), DXGI_FORMAT_R16G16B16A16_UNORM(11L), DXGI_FORMAT_R16G16B16A16_UINT(12L), DXGI_FORMAT_R16G16B16A16_SNORM(13L), DXGI_FORMAT_R16G16B16A16_SINT(14L), DXGI_FORMAT_R32G32_TYPELESS(15L), DXGI_FORMAT_R32G32_FLOAT(16L), DXGI_FORMAT_R32G32_UINT(17L), DXGI_FORMAT_R32G32_SINT(18L), DXGI_FORMAT_R32G8X24_TYPELESS(19L), DXGI_FORMAT_D32_FLOAT_S8X24_UINT(20L), DXGI_FORMAT_R32_FLOAT_X8X24_TYPELESS(21L), DXGI_FORMAT_X32_TYPELESS_G8X24_UINT(22L), DXGI_FORMAT_R10G10B10A2_TYPELESS(23L), DXGI_FORMAT_R10G10B10A2_UNORM(24L), DXGI_FORMAT_R10G10B10A2_UINT(25L), DXGI_FORMAT_R11G11B10_FLOAT(26L), DXGI_FORMAT_R8G8B8A8_TYPELESS(27L), DXGI_FORMAT_R8G8B8A8_UNORM(28L), DXGI_FORMAT_R8G8B8A8_UNORM_SRGB(29L), DXGI_FORMAT_R8G8B8A8_UINT(30L), DXGI_FORMAT_R8G8B8A8_SNORM(31L), DXGI_FORMAT_R8G8B8A8_SINT(32L), DXGI_FORMAT_R16G16_TYPELESS(33L), DXGI_FORMAT_R16G16_FLOAT(34L), DXGI_FORMAT_R16G16_UNORM(35L), DXGI_FORMAT_R16G16_UINT(36L), DXGI_FORMAT_R16G16_SNORM(37L), DXGI_FORMAT_R16G16_SINT(38L), DXGI_FORMAT_R32_TYPELESS(39L), DXGI_FORMAT_D32_FLOAT(40L), DXGI_FORMAT_R32_FLOAT(41L), DXGI_FORMAT_R32_UINT(42L), DXGI_FORMAT_R32_SINT(43L), DXGI_FORMAT_R24G8_TYPELESS(44L), DXGI_FORMAT_D24_UNORM_S8_UINT(45L), DXGI_FORMAT_R24_UNORM_X8_TYPELESS(46L), DXGI_FORMAT_X24_TYPELESS_G8_UINT(47L), DXGI_FORMAT_R8G8_TYPELESS(48L), DXGI_FORMAT_R8G8_UNORM(49L), DXGI_FORMAT_R8G8_UINT(50L), DXGI_FORMAT_R8G8_SNORM(51L), DXGI_FORMAT_R8G8_SINT(52L), DXGI_FORMAT_R16_TYPELESS(53L), DXGI_FORMAT_R16_FLOAT(54L), DXGI_FORMAT_D16_UNORM(55L), DXGI_FORMAT_R16_UNORM(56L), DXGI_FORMAT_R16_UINT(57L), DXGI_FORMAT_R16_SNORM(58L), DXGI_FORMAT_R16_SINT(59L), DXGI_FORMAT_R8_TYPELESS(60L), DXGI_FORMAT_R8_UNORM(61L), DXGI_FORMAT_R8_UINT(62L), DXGI_FORMAT_R8_SNORM(63L), DXGI_FORMAT_R8_SINT(64L), DXGI_FORMAT_A8_UNORM(65L), DXGI_FORMAT_R1_UNORM(66L), DXGI_FORMAT_R9G9B9E5_SHAREDEXP(67L), DXGI_FORMAT_R8G8_B8G8_UNORM(68L), DXGI_FORMAT_G8R8_G8B8_UNORM(69L), DXGI_FORMAT_BC1_TYPELESS(70L), DXGI_FORMAT_BC1_UNORM(71L), DXGI_FORMAT_BC1_UNORM_SRGB(72L), DXGI_FORMAT_BC2_TYPELESS(73L), DXGI_FORMAT_BC2_UNORM(74L), DXGI_FORMAT_BC2_UNORM_SRGB(75L), DXGI_FORMAT_BC3_TYPELESS(76L), DXGI_FORMAT_BC3_UNORM(77L), DXGI_FORMAT_BC3_UNORM_SRGB(78L), DXGI_FORMAT_BC4_TYPELESS(79L), DXGI_FORMAT_BC4_UNORM(80L), DXGI_FORMAT_BC4_SNORM(81L), DXGI_FORMAT_BC5_TYPELESS(82L), DXGI_FORMAT_BC5_UNORM(83L), DXGI_FORMAT_BC5_SNORM(84L), DXGI_FORMAT_B5G6R5_UNORM(85L), DXGI_FORMAT_B5G5R5A1_UNORM(86L), DXGI_FORMAT_B8G8R8A8_UNORM(87L), DXGI_FORMAT_B8G8R8X8_UNORM(88L), DXGI_FORMAT_R10G10B10_XR_BIAS_A2_UNORM(89L), DXGI_FORMAT_B8G8R8A8_TYPELESS(90L), DXGI_FORMAT_B8G8R8A8_UNORM_SRGB(91L), DXGI_FORMAT_B8G8R8X8_TYPELESS(92L), DXGI_FORMAT_B8G8R8X8_UNORM_SRGB(93L), DXGI_FORMAT_BC6H_TYPELESS(94L), DXGI_FORMAT_BC6H_UF16(95L), DXGI_FORMAT_BC6H_SF16(96L), DXGI_FORMAT_BC7_TYPELESS(97L), DXGI_FORMAT_BC7_UNORM(98L), DXGI_FORMAT_BC7_UNORM_SRGB(99L), DXGI_FORMAT_AYUV(100L), DXGI_FORMAT_Y410(101L), DXGI_FORMAT_Y416(102L), DXGI_FORMAT_NV12(103L), DXGI_FORMAT_P010(104L), DXGI_FORMAT_P016(105L), DXGI_FORMAT_420_OPAQUE(106L), DXGI_FORMAT_YUY2(107L), DXGI_FORMAT_Y210(108L), DXGI_FORMAT_Y216(109L), DXGI_FORMAT_NV11(110L), DXGI_FORMAT_AI44(111L), DXGI_FORMAT_IA44(112L), DXGI_FORMAT_P8(113L), DXGI_FORMAT_A8P8(114L), DXGI_FORMAT_B4G4R4A4_UNORM(115L), DXGI_FORMAT_P208(130L), DXGI_FORMAT_V208(131L), DXGI_FORMAT_V408(132L), DXGI_FORMAT_SAMPLER_FEEDBACK_MIN_MIP_OPAQUE(189L), DXGI_FORMAT_SAMPLER_FEEDBACK_MIP_REGION_USED_OPAQUE(190L), DXGI_FORMAT_A4B4G4R4_UNORM(191L), DXGI_FORMAT_FORCE_UINT(-1L);

    companion object {
        fun fromValue(v: Long): DXGI_FORMAT = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_FORMAT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DXGI_MODE_SCANLINE_ORDER}
 */
enum class DXGI_MODE_SCANLINE_ORDER(val value: Long) {
    DXGI_MODE_SCANLINE_ORDER_UNSPECIFIED(0L), DXGI_MODE_SCANLINE_ORDER_PROGRESSIVE(1L), DXGI_MODE_SCANLINE_ORDER_UPPER_FIELD_FIRST(2L), DXGI_MODE_SCANLINE_ORDER_LOWER_FIELD_FIRST(3L);

    companion object {
        fun fromValue(v: Long): DXGI_MODE_SCANLINE_ORDER = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_MODE_SCANLINE_ORDER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DXGI_MODE_SCALING}
 */
enum class DXGI_MODE_SCALING(val value: Long) {
    DXGI_MODE_SCALING_UNSPECIFIED(0L), DXGI_MODE_SCALING_CENTERED(1L), DXGI_MODE_SCALING_STRETCHED(2L);

    companion object {
        fun fromValue(v: Long): DXGI_MODE_SCALING = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_MODE_SCALING value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DXGI_MODE_ROTATION}
 */
enum class DXGI_MODE_ROTATION(val value: Long) {
    DXGI_MODE_ROTATION_UNSPECIFIED(0L), DXGI_MODE_ROTATION_IDENTITY(1L), DXGI_MODE_ROTATION_ROTATE90(2L), DXGI_MODE_ROTATION_ROTATE180(3L), DXGI_MODE_ROTATION_ROTATE270(4L);

    companion object {
        fun fromValue(v: Long): DXGI_MODE_ROTATION = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_MODE_ROTATION value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Int DXGI_USAGE;}
 */
typealias DXGI_USAGE = Int

/**
 * NS_ENUM: {@snippet lang=c : enum DXGI_RESIDENCY}
 */
enum class DXGI_RESIDENCY(val value: Long) {
    DXGI_RESIDENCY_FULLY_RESIDENT(1L), DXGI_RESIDENCY_RESIDENT_IN_SHARED_MEMORY(2L), DXGI_RESIDENCY_EVICTED_TO_DISK(3L);

    companion object {
        fun fromValue(v: Long): DXGI_RESIDENCY = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_RESIDENCY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DXGI_SWAP_EFFECT}
 */
enum class DXGI_SWAP_EFFECT(val value: Long) {
    DXGI_SWAP_EFFECT_DISCARD(0L), DXGI_SWAP_EFFECT_SEQUENTIAL(1L), DXGI_SWAP_EFFECT_FLIP_SEQUENTIAL(3L), DXGI_SWAP_EFFECT_FLIP_DISCARD(4L);

    companion object {
        fun fromValue(v: Long): DXGI_SWAP_EFFECT = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_SWAP_EFFECT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum DXGI_SWAP_CHAIN_FLAG}
 */
enum class DXGI_SWAP_CHAIN_FLAG(val value: Long) {
    DXGI_SWAP_CHAIN_FLAG_NONPREROTATED(1L), DXGI_SWAP_CHAIN_FLAG_ALLOW_MODE_SWITCH(2L), DXGI_SWAP_CHAIN_FLAG_GDI_COMPATIBLE(4L), DXGI_SWAP_CHAIN_FLAG_RESTRICTED_CONTENT(8L), DXGI_SWAP_CHAIN_FLAG_RESTRICT_SHARED_RESOURCE_DRIVER(16L), DXGI_SWAP_CHAIN_FLAG_DISPLAY_ONLY(32L), DXGI_SWAP_CHAIN_FLAG_FRAME_LATENCY_WAITABLE_OBJECT(64L), DXGI_SWAP_CHAIN_FLAG_FOREGROUND_LAYER(128L), DXGI_SWAP_CHAIN_FLAG_FULLSCREEN_VIDEO(256L), DXGI_SWAP_CHAIN_FLAG_YUV_VIDEO(512L), DXGI_SWAP_CHAIN_FLAG_HW_PROTECTED(1024L), DXGI_SWAP_CHAIN_FLAG_ALLOW_TEARING(2048L), DXGI_SWAP_CHAIN_FLAG_RESTRICTED_TO_ALL_HOLOGRAPHIC_DISPLAYS(4096L), DXGI_SWAP_CHAIN_FLAG_USE_DEFAULT_COLOR_SPACE(32768L);

    companion object {
        fun fromValue(v: Long): DXGI_SWAP_CHAIN_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_SWAP_CHAIN_FLAG value: $v")
    }
}

/**
 * {@snippet lang=c : CreateDXGIFactory1 typedef HRESULT = Long((typedef IID = Declared(_GUID))*,((Void)*)*)
 */
private val CreateDXGIFactory1_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var CreateDXGIFactory1_HANDLE: MethodHandle? = null

fun CreateDXGIFactory1(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 CreateDXGIFactory1 called before init()" }
    val _handle = CreateDXGIFactory1_HANDLE ?: return 0
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
 * NS_ENUM: {@snippet lang=c : enum DXGI_ADAPTER_FLAG}
 */
enum class DXGI_ADAPTER_FLAG(val value: Long) {
    DXGI_ADAPTER_FLAG_NONE(0L), DXGI_ADAPTER_FLAG_REMOTE(1L), DXGI_ADAPTER_FLAG_SOFTWARE(2L), DXGI_ADAPTER_FLAG_FORCE_DWORD(-1L);

    companion object {
        fun fromValue(v: Long): DXGI_ADAPTER_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown DXGI_ADAPTER_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_DRIVER_TYPE}
 */
enum class D3D_DRIVER_TYPE(val value: Long) {
    D3D_DRIVER_TYPE_UNKNOWN(0L), D3D_DRIVER_TYPE_HARDWARE(1L), D3D_DRIVER_TYPE_REFERENCE(2L), D3D_DRIVER_TYPE_NULL(3L), D3D_DRIVER_TYPE_SOFTWARE(4L), D3D_DRIVER_TYPE_WARP(5L);

    companion object {
        fun fromValue(v: Long): D3D_DRIVER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_DRIVER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_FEATURE_LEVEL}
 */
enum class D3D_FEATURE_LEVEL(val value: Long) {
    D3D_FEATURE_LEVEL_1_0_GENERIC(256L), D3D_FEATURE_LEVEL_1_0_CORE(4096L), D3D_FEATURE_LEVEL_9_1(37120L), D3D_FEATURE_LEVEL_9_2(37376L), D3D_FEATURE_LEVEL_9_3(37632L), D3D_FEATURE_LEVEL_10_0(40960L), D3D_FEATURE_LEVEL_10_1(41216L), D3D_FEATURE_LEVEL_11_0(45056L), D3D_FEATURE_LEVEL_11_1(45312L), D3D_FEATURE_LEVEL_12_0(49152L), D3D_FEATURE_LEVEL_12_1(49408L), D3D_FEATURE_LEVEL_12_2(49664L);

    companion object {
        fun fromValue(v: Long): D3D_FEATURE_LEVEL = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_FEATURE_LEVEL value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_PRIMITIVE_TOPOLOGY}
 */
enum class D3D_PRIMITIVE_TOPOLOGY(val value: Long) {
    D3D_PRIMITIVE_TOPOLOGY_UNDEFINED(0L), D3D_PRIMITIVE_TOPOLOGY_POINTLIST(1L), D3D_PRIMITIVE_TOPOLOGY_LINELIST(2L), D3D_PRIMITIVE_TOPOLOGY_LINESTRIP(3L), D3D_PRIMITIVE_TOPOLOGY_TRIANGLELIST(4L), D3D_PRIMITIVE_TOPOLOGY_TRIANGLESTRIP(5L), D3D_PRIMITIVE_TOPOLOGY_TRIANGLEFAN(6L), D3D_PRIMITIVE_TOPOLOGY_LINELIST_ADJ(10L), D3D_PRIMITIVE_TOPOLOGY_LINESTRIP_ADJ(11L), D3D_PRIMITIVE_TOPOLOGY_TRIANGLELIST_ADJ(12L), D3D_PRIMITIVE_TOPOLOGY_TRIANGLESTRIP_ADJ(13L), D3D_PRIMITIVE_TOPOLOGY_1_CONTROL_POINT_PATCHLIST(33L), D3D_PRIMITIVE_TOPOLOGY_2_CONTROL_POINT_PATCHLIST(34L), D3D_PRIMITIVE_TOPOLOGY_3_CONTROL_POINT_PATCHLIST(35L), D3D_PRIMITIVE_TOPOLOGY_4_CONTROL_POINT_PATCHLIST(36L), D3D_PRIMITIVE_TOPOLOGY_5_CONTROL_POINT_PATCHLIST(37L), D3D_PRIMITIVE_TOPOLOGY_6_CONTROL_POINT_PATCHLIST(38L), D3D_PRIMITIVE_TOPOLOGY_7_CONTROL_POINT_PATCHLIST(39L), D3D_PRIMITIVE_TOPOLOGY_8_CONTROL_POINT_PATCHLIST(40L), D3D_PRIMITIVE_TOPOLOGY_9_CONTROL_POINT_PATCHLIST(41L), D3D_PRIMITIVE_TOPOLOGY_10_CONTROL_POINT_PATCHLIST(42L), D3D_PRIMITIVE_TOPOLOGY_11_CONTROL_POINT_PATCHLIST(43L), D3D_PRIMITIVE_TOPOLOGY_12_CONTROL_POINT_PATCHLIST(44L), D3D_PRIMITIVE_TOPOLOGY_13_CONTROL_POINT_PATCHLIST(45L), D3D_PRIMITIVE_TOPOLOGY_14_CONTROL_POINT_PATCHLIST(46L), D3D_PRIMITIVE_TOPOLOGY_15_CONTROL_POINT_PATCHLIST(47L), D3D_PRIMITIVE_TOPOLOGY_16_CONTROL_POINT_PATCHLIST(48L), D3D_PRIMITIVE_TOPOLOGY_17_CONTROL_POINT_PATCHLIST(49L), D3D_PRIMITIVE_TOPOLOGY_18_CONTROL_POINT_PATCHLIST(50L), D3D_PRIMITIVE_TOPOLOGY_19_CONTROL_POINT_PATCHLIST(51L), D3D_PRIMITIVE_TOPOLOGY_20_CONTROL_POINT_PATCHLIST(52L), D3D_PRIMITIVE_TOPOLOGY_21_CONTROL_POINT_PATCHLIST(53L), D3D_PRIMITIVE_TOPOLOGY_22_CONTROL_POINT_PATCHLIST(54L), D3D_PRIMITIVE_TOPOLOGY_23_CONTROL_POINT_PATCHLIST(55L), D3D_PRIMITIVE_TOPOLOGY_24_CONTROL_POINT_PATCHLIST(56L), D3D_PRIMITIVE_TOPOLOGY_25_CONTROL_POINT_PATCHLIST(57L), D3D_PRIMITIVE_TOPOLOGY_26_CONTROL_POINT_PATCHLIST(58L), D3D_PRIMITIVE_TOPOLOGY_27_CONTROL_POINT_PATCHLIST(59L), D3D_PRIMITIVE_TOPOLOGY_28_CONTROL_POINT_PATCHLIST(60L), D3D_PRIMITIVE_TOPOLOGY_29_CONTROL_POINT_PATCHLIST(61L), D3D_PRIMITIVE_TOPOLOGY_30_CONTROL_POINT_PATCHLIST(62L), D3D_PRIMITIVE_TOPOLOGY_31_CONTROL_POINT_PATCHLIST(63L), D3D_PRIMITIVE_TOPOLOGY_32_CONTROL_POINT_PATCHLIST(64L), D3D10_PRIMITIVE_TOPOLOGY_UNDEFINED(0L), D3D10_PRIMITIVE_TOPOLOGY_POINTLIST(1L), D3D10_PRIMITIVE_TOPOLOGY_LINELIST(2L), D3D10_PRIMITIVE_TOPOLOGY_LINESTRIP(3L), D3D10_PRIMITIVE_TOPOLOGY_TRIANGLELIST(4L), D3D10_PRIMITIVE_TOPOLOGY_TRIANGLESTRIP(5L), D3D10_PRIMITIVE_TOPOLOGY_LINELIST_ADJ(10L), D3D10_PRIMITIVE_TOPOLOGY_LINESTRIP_ADJ(11L), D3D10_PRIMITIVE_TOPOLOGY_TRIANGLELIST_ADJ(12L), D3D10_PRIMITIVE_TOPOLOGY_TRIANGLESTRIP_ADJ(13L), D3D11_PRIMITIVE_TOPOLOGY_UNDEFINED(0L), D3D11_PRIMITIVE_TOPOLOGY_POINTLIST(1L), D3D11_PRIMITIVE_TOPOLOGY_LINELIST(2L), D3D11_PRIMITIVE_TOPOLOGY_LINESTRIP(3L), D3D11_PRIMITIVE_TOPOLOGY_TRIANGLELIST(4L), D3D11_PRIMITIVE_TOPOLOGY_TRIANGLESTRIP(5L), D3D11_PRIMITIVE_TOPOLOGY_LINELIST_ADJ(10L), D3D11_PRIMITIVE_TOPOLOGY_LINESTRIP_ADJ(11L), D3D11_PRIMITIVE_TOPOLOGY_TRIANGLELIST_ADJ(12L), D3D11_PRIMITIVE_TOPOLOGY_TRIANGLESTRIP_ADJ(13L), D3D11_PRIMITIVE_TOPOLOGY_1_CONTROL_POINT_PATCHLIST(33L), D3D11_PRIMITIVE_TOPOLOGY_2_CONTROL_POINT_PATCHLIST(34L), D3D11_PRIMITIVE_TOPOLOGY_3_CONTROL_POINT_PATCHLIST(35L), D3D11_PRIMITIVE_TOPOLOGY_4_CONTROL_POINT_PATCHLIST(36L), D3D11_PRIMITIVE_TOPOLOGY_5_CONTROL_POINT_PATCHLIST(37L), D3D11_PRIMITIVE_TOPOLOGY_6_CONTROL_POINT_PATCHLIST(38L), D3D11_PRIMITIVE_TOPOLOGY_7_CONTROL_POINT_PATCHLIST(39L), D3D11_PRIMITIVE_TOPOLOGY_8_CONTROL_POINT_PATCHLIST(40L), D3D11_PRIMITIVE_TOPOLOGY_9_CONTROL_POINT_PATCHLIST(41L), D3D11_PRIMITIVE_TOPOLOGY_10_CONTROL_POINT_PATCHLIST(42L), D3D11_PRIMITIVE_TOPOLOGY_11_CONTROL_POINT_PATCHLIST(43L), D3D11_PRIMITIVE_TOPOLOGY_12_CONTROL_POINT_PATCHLIST(44L), D3D11_PRIMITIVE_TOPOLOGY_13_CONTROL_POINT_PATCHLIST(45L), D3D11_PRIMITIVE_TOPOLOGY_14_CONTROL_POINT_PATCHLIST(46L), D3D11_PRIMITIVE_TOPOLOGY_15_CONTROL_POINT_PATCHLIST(47L), D3D11_PRIMITIVE_TOPOLOGY_16_CONTROL_POINT_PATCHLIST(48L), D3D11_PRIMITIVE_TOPOLOGY_17_CONTROL_POINT_PATCHLIST(49L), D3D11_PRIMITIVE_TOPOLOGY_18_CONTROL_POINT_PATCHLIST(50L), D3D11_PRIMITIVE_TOPOLOGY_19_CONTROL_POINT_PATCHLIST(51L), D3D11_PRIMITIVE_TOPOLOGY_20_CONTROL_POINT_PATCHLIST(52L), D3D11_PRIMITIVE_TOPOLOGY_21_CONTROL_POINT_PATCHLIST(53L), D3D11_PRIMITIVE_TOPOLOGY_22_CONTROL_POINT_PATCHLIST(54L), D3D11_PRIMITIVE_TOPOLOGY_23_CONTROL_POINT_PATCHLIST(55L), D3D11_PRIMITIVE_TOPOLOGY_24_CONTROL_POINT_PATCHLIST(56L), D3D11_PRIMITIVE_TOPOLOGY_25_CONTROL_POINT_PATCHLIST(57L), D3D11_PRIMITIVE_TOPOLOGY_26_CONTROL_POINT_PATCHLIST(58L), D3D11_PRIMITIVE_TOPOLOGY_27_CONTROL_POINT_PATCHLIST(59L), D3D11_PRIMITIVE_TOPOLOGY_28_CONTROL_POINT_PATCHLIST(60L), D3D11_PRIMITIVE_TOPOLOGY_29_CONTROL_POINT_PATCHLIST(61L), D3D11_PRIMITIVE_TOPOLOGY_30_CONTROL_POINT_PATCHLIST(62L), D3D11_PRIMITIVE_TOPOLOGY_31_CONTROL_POINT_PATCHLIST(63L), D3D11_PRIMITIVE_TOPOLOGY_32_CONTROL_POINT_PATCHLIST(64L);

    companion object {
        fun fromValue(v: Long): D3D_PRIMITIVE_TOPOLOGY = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_PRIMITIVE_TOPOLOGY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_PRIMITIVE}
 */
enum class D3D_PRIMITIVE(val value: Long) {
    D3D_PRIMITIVE_UNDEFINED(0L), D3D_PRIMITIVE_POINT(1L), D3D_PRIMITIVE_LINE(2L), D3D_PRIMITIVE_TRIANGLE(3L), D3D_PRIMITIVE_LINE_ADJ(6L), D3D_PRIMITIVE_TRIANGLE_ADJ(7L), D3D_PRIMITIVE_1_CONTROL_POINT_PATCH(8L), D3D_PRIMITIVE_2_CONTROL_POINT_PATCH(9L), D3D_PRIMITIVE_3_CONTROL_POINT_PATCH(10L), D3D_PRIMITIVE_4_CONTROL_POINT_PATCH(11L), D3D_PRIMITIVE_5_CONTROL_POINT_PATCH(12L), D3D_PRIMITIVE_6_CONTROL_POINT_PATCH(13L), D3D_PRIMITIVE_7_CONTROL_POINT_PATCH(14L), D3D_PRIMITIVE_8_CONTROL_POINT_PATCH(15L), D3D_PRIMITIVE_9_CONTROL_POINT_PATCH(16L), D3D_PRIMITIVE_10_CONTROL_POINT_PATCH(17L), D3D_PRIMITIVE_11_CONTROL_POINT_PATCH(18L), D3D_PRIMITIVE_12_CONTROL_POINT_PATCH(19L), D3D_PRIMITIVE_13_CONTROL_POINT_PATCH(20L), D3D_PRIMITIVE_14_CONTROL_POINT_PATCH(21L), D3D_PRIMITIVE_15_CONTROL_POINT_PATCH(22L), D3D_PRIMITIVE_16_CONTROL_POINT_PATCH(23L), D3D_PRIMITIVE_17_CONTROL_POINT_PATCH(24L), D3D_PRIMITIVE_18_CONTROL_POINT_PATCH(25L), D3D_PRIMITIVE_19_CONTROL_POINT_PATCH(26L), D3D_PRIMITIVE_20_CONTROL_POINT_PATCH(27L), D3D_PRIMITIVE_21_CONTROL_POINT_PATCH(28L), D3D_PRIMITIVE_22_CONTROL_POINT_PATCH(29L), D3D_PRIMITIVE_23_CONTROL_POINT_PATCH(30L), D3D_PRIMITIVE_24_CONTROL_POINT_PATCH(31L), D3D_PRIMITIVE_25_CONTROL_POINT_PATCH(32L), D3D_PRIMITIVE_26_CONTROL_POINT_PATCH(33L), D3D_PRIMITIVE_27_CONTROL_POINT_PATCH(34L), D3D_PRIMITIVE_28_CONTROL_POINT_PATCH(35L), D3D_PRIMITIVE_29_CONTROL_POINT_PATCH(36L), D3D_PRIMITIVE_30_CONTROL_POINT_PATCH(37L), D3D_PRIMITIVE_31_CONTROL_POINT_PATCH(38L), D3D_PRIMITIVE_32_CONTROL_POINT_PATCH(39L), D3D10_PRIMITIVE_UNDEFINED(0L), D3D10_PRIMITIVE_POINT(1L), D3D10_PRIMITIVE_LINE(2L), D3D10_PRIMITIVE_TRIANGLE(3L), D3D10_PRIMITIVE_LINE_ADJ(6L), D3D10_PRIMITIVE_TRIANGLE_ADJ(7L), D3D11_PRIMITIVE_UNDEFINED(0L), D3D11_PRIMITIVE_POINT(1L), D3D11_PRIMITIVE_LINE(2L), D3D11_PRIMITIVE_TRIANGLE(3L), D3D11_PRIMITIVE_LINE_ADJ(6L), D3D11_PRIMITIVE_TRIANGLE_ADJ(7L), D3D11_PRIMITIVE_1_CONTROL_POINT_PATCH(8L), D3D11_PRIMITIVE_2_CONTROL_POINT_PATCH(9L), D3D11_PRIMITIVE_3_CONTROL_POINT_PATCH(10L), D3D11_PRIMITIVE_4_CONTROL_POINT_PATCH(11L), D3D11_PRIMITIVE_5_CONTROL_POINT_PATCH(12L), D3D11_PRIMITIVE_6_CONTROL_POINT_PATCH(13L), D3D11_PRIMITIVE_7_CONTROL_POINT_PATCH(14L), D3D11_PRIMITIVE_8_CONTROL_POINT_PATCH(15L), D3D11_PRIMITIVE_9_CONTROL_POINT_PATCH(16L), D3D11_PRIMITIVE_10_CONTROL_POINT_PATCH(17L), D3D11_PRIMITIVE_11_CONTROL_POINT_PATCH(18L), D3D11_PRIMITIVE_12_CONTROL_POINT_PATCH(19L), D3D11_PRIMITIVE_13_CONTROL_POINT_PATCH(20L), D3D11_PRIMITIVE_14_CONTROL_POINT_PATCH(21L), D3D11_PRIMITIVE_15_CONTROL_POINT_PATCH(22L), D3D11_PRIMITIVE_16_CONTROL_POINT_PATCH(23L), D3D11_PRIMITIVE_17_CONTROL_POINT_PATCH(24L), D3D11_PRIMITIVE_18_CONTROL_POINT_PATCH(25L), D3D11_PRIMITIVE_19_CONTROL_POINT_PATCH(26L), D3D11_PRIMITIVE_20_CONTROL_POINT_PATCH(27L), D3D11_PRIMITIVE_21_CONTROL_POINT_PATCH(28L), D3D11_PRIMITIVE_22_CONTROL_POINT_PATCH(29L), D3D11_PRIMITIVE_23_CONTROL_POINT_PATCH(30L), D3D11_PRIMITIVE_24_CONTROL_POINT_PATCH(31L), D3D11_PRIMITIVE_25_CONTROL_POINT_PATCH(32L), D3D11_PRIMITIVE_26_CONTROL_POINT_PATCH(33L), D3D11_PRIMITIVE_27_CONTROL_POINT_PATCH(34L), D3D11_PRIMITIVE_28_CONTROL_POINT_PATCH(35L), D3D11_PRIMITIVE_29_CONTROL_POINT_PATCH(36L), D3D11_PRIMITIVE_30_CONTROL_POINT_PATCH(37L), D3D11_PRIMITIVE_31_CONTROL_POINT_PATCH(38L), D3D11_PRIMITIVE_32_CONTROL_POINT_PATCH(39L);

    companion object {
        fun fromValue(v: Long): D3D_PRIMITIVE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_PRIMITIVE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_SRV_DIMENSION}
 */
enum class D3D_SRV_DIMENSION(val value: Long) {
    D3D_SRV_DIMENSION_UNKNOWN(0L), D3D_SRV_DIMENSION_BUFFER(1L), D3D_SRV_DIMENSION_TEXTURE1D(2L), D3D_SRV_DIMENSION_TEXTURE1DARRAY(3L), D3D_SRV_DIMENSION_TEXTURE2D(4L), D3D_SRV_DIMENSION_TEXTURE2DARRAY(5L), D3D_SRV_DIMENSION_TEXTURE2DMS(6L), D3D_SRV_DIMENSION_TEXTURE2DMSARRAY(7L), D3D_SRV_DIMENSION_TEXTURE3D(8L), D3D_SRV_DIMENSION_TEXTURECUBE(9L), D3D_SRV_DIMENSION_TEXTURECUBEARRAY(10L), D3D_SRV_DIMENSION_BUFFEREX(11L), D3D10_SRV_DIMENSION_UNKNOWN(0L), D3D10_SRV_DIMENSION_BUFFER(1L), D3D10_SRV_DIMENSION_TEXTURE1D(2L), D3D10_SRV_DIMENSION_TEXTURE1DARRAY(3L), D3D10_SRV_DIMENSION_TEXTURE2D(4L), D3D10_SRV_DIMENSION_TEXTURE2DARRAY(5L), D3D10_SRV_DIMENSION_TEXTURE2DMS(6L), D3D10_SRV_DIMENSION_TEXTURE2DMSARRAY(7L), D3D10_SRV_DIMENSION_TEXTURE3D(8L), D3D10_SRV_DIMENSION_TEXTURECUBE(9L), D3D10_1_SRV_DIMENSION_UNKNOWN(0L), D3D10_1_SRV_DIMENSION_BUFFER(1L), D3D10_1_SRV_DIMENSION_TEXTURE1D(2L), D3D10_1_SRV_DIMENSION_TEXTURE1DARRAY(3L), D3D10_1_SRV_DIMENSION_TEXTURE2D(4L), D3D10_1_SRV_DIMENSION_TEXTURE2DARRAY(5L), D3D10_1_SRV_DIMENSION_TEXTURE2DMS(6L), D3D10_1_SRV_DIMENSION_TEXTURE2DMSARRAY(7L), D3D10_1_SRV_DIMENSION_TEXTURE3D(8L), D3D10_1_SRV_DIMENSION_TEXTURECUBE(9L), D3D10_1_SRV_DIMENSION_TEXTURECUBEARRAY(10L), D3D11_SRV_DIMENSION_UNKNOWN(0L), D3D11_SRV_DIMENSION_BUFFER(1L), D3D11_SRV_DIMENSION_TEXTURE1D(2L), D3D11_SRV_DIMENSION_TEXTURE1DARRAY(3L), D3D11_SRV_DIMENSION_TEXTURE2D(4L), D3D11_SRV_DIMENSION_TEXTURE2DARRAY(5L), D3D11_SRV_DIMENSION_TEXTURE2DMS(6L), D3D11_SRV_DIMENSION_TEXTURE2DMSARRAY(7L), D3D11_SRV_DIMENSION_TEXTURE3D(8L), D3D11_SRV_DIMENSION_TEXTURECUBE(9L), D3D11_SRV_DIMENSION_TEXTURECUBEARRAY(10L), D3D11_SRV_DIMENSION_BUFFEREX(11L);

    companion object {
        fun fromValue(v: Long): D3D_SRV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_SRV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_INCLUDE_TYPE}
 */
enum class _D3D_INCLUDE_TYPE(val value: Long) {
    D3D_INCLUDE_LOCAL(0L), D3D_INCLUDE_SYSTEM(1L), D3D10_INCLUDE_LOCAL(0L), D3D10_INCLUDE_SYSTEM(1L), D3D_INCLUDE_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D_INCLUDE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_INCLUDE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_SHADER_VARIABLE_CLASS}
 */
enum class _D3D_SHADER_VARIABLE_CLASS(val value: Long) {
    D3D_SVC_SCALAR(0L), D3D_SVC_VECTOR(1L), D3D_SVC_MATRIX_ROWS(2L), D3D_SVC_MATRIX_COLUMNS(3L), D3D_SVC_OBJECT(4L), D3D_SVC_STRUCT(5L), D3D_SVC_INTERFACE_CLASS(6L), D3D_SVC_INTERFACE_POINTER(7L), D3D10_SVC_SCALAR(0L), D3D10_SVC_VECTOR(1L), D3D10_SVC_MATRIX_ROWS(2L), D3D10_SVC_MATRIX_COLUMNS(3L), D3D10_SVC_OBJECT(4L), D3D10_SVC_STRUCT(5L), D3D11_SVC_INTERFACE_CLASS(6L), D3D11_SVC_INTERFACE_POINTER(7L), D3D_SVC_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D_SHADER_VARIABLE_CLASS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_SHADER_VARIABLE_CLASS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_SHADER_VARIABLE_FLAGS}
 */
enum class _D3D_SHADER_VARIABLE_FLAGS(val value: Long) {
    D3D_SVF_USERPACKED(1L), D3D_SVF_USED(2L), D3D_SVF_INTERFACE_POINTER(4L), D3D_SVF_INTERFACE_PARAMETER(8L), D3D10_SVF_USERPACKED(1L), D3D10_SVF_USED(2L), D3D11_SVF_INTERFACE_POINTER(4L), D3D11_SVF_INTERFACE_PARAMETER(8L), D3D_SVF_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D_SHADER_VARIABLE_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_SHADER_VARIABLE_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_SHADER_VARIABLE_TYPE}
 */
enum class _D3D_SHADER_VARIABLE_TYPE(val value: Long) {
    D3D_SVT_VOID(0L), D3D_SVT_BOOL(1L), D3D_SVT_INT(2L), D3D_SVT_FLOAT(3L), D3D_SVT_STRING(4L), D3D_SVT_TEXTURE(5L), D3D_SVT_TEXTURE1D(6L), D3D_SVT_TEXTURE2D(7L), D3D_SVT_TEXTURE3D(8L), D3D_SVT_TEXTURECUBE(9L), D3D_SVT_SAMPLER(10L), D3D_SVT_SAMPLER1D(11L), D3D_SVT_SAMPLER2D(12L), D3D_SVT_SAMPLER3D(13L), D3D_SVT_SAMPLERCUBE(14L), D3D_SVT_PIXELSHADER(15L), D3D_SVT_VERTEXSHADER(16L), D3D_SVT_PIXELFRAGMENT(17L), D3D_SVT_VERTEXFRAGMENT(18L), D3D_SVT_UINT(19L), D3D_SVT_UINT8(20L), D3D_SVT_GEOMETRYSHADER(21L), D3D_SVT_RASTERIZER(22L), D3D_SVT_DEPTHSTENCIL(23L), D3D_SVT_BLEND(24L), D3D_SVT_BUFFER(25L), D3D_SVT_CBUFFER(26L), D3D_SVT_TBUFFER(27L), D3D_SVT_TEXTURE1DARRAY(28L), D3D_SVT_TEXTURE2DARRAY(29L), D3D_SVT_RENDERTARGETVIEW(30L), D3D_SVT_DEPTHSTENCILVIEW(31L), D3D_SVT_TEXTURE2DMS(32L), D3D_SVT_TEXTURE2DMSARRAY(33L), D3D_SVT_TEXTURECUBEARRAY(34L), D3D_SVT_HULLSHADER(35L), D3D_SVT_DOMAINSHADER(36L), D3D_SVT_INTERFACE_POINTER(37L), D3D_SVT_COMPUTESHADER(38L), D3D_SVT_DOUBLE(39L), D3D_SVT_RWTEXTURE1D(40L), D3D_SVT_RWTEXTURE1DARRAY(41L), D3D_SVT_RWTEXTURE2D(42L), D3D_SVT_RWTEXTURE2DARRAY(43L), D3D_SVT_RWTEXTURE3D(44L), D3D_SVT_RWBUFFER(45L), D3D_SVT_BYTEADDRESS_BUFFER(46L), D3D_SVT_RWBYTEADDRESS_BUFFER(47L), D3D_SVT_STRUCTURED_BUFFER(48L), D3D_SVT_RWSTRUCTURED_BUFFER(49L), D3D_SVT_APPEND_STRUCTURED_BUFFER(50L), D3D_SVT_CONSUME_STRUCTURED_BUFFER(51L), D3D_SVT_MIN8FLOAT(52L), D3D_SVT_MIN10FLOAT(53L), D3D_SVT_MIN16FLOAT(54L), D3D_SVT_MIN12INT(55L), D3D_SVT_MIN16INT(56L), D3D_SVT_MIN16UINT(57L), D3D_SVT_INT16(58L), D3D_SVT_UINT16(59L), D3D_SVT_FLOAT16(60L), D3D_SVT_INT64(61L), D3D_SVT_UINT64(62L), D3D10_SVT_VOID(0L), D3D10_SVT_BOOL(1L), D3D10_SVT_INT(2L), D3D10_SVT_FLOAT(3L), D3D10_SVT_STRING(4L), D3D10_SVT_TEXTURE(5L), D3D10_SVT_TEXTURE1D(6L), D3D10_SVT_TEXTURE2D(7L), D3D10_SVT_TEXTURE3D(8L), D3D10_SVT_TEXTURECUBE(9L), D3D10_SVT_SAMPLER(10L), D3D10_SVT_SAMPLER1D(11L), D3D10_SVT_SAMPLER2D(12L), D3D10_SVT_SAMPLER3D(13L), D3D10_SVT_SAMPLERCUBE(14L), D3D10_SVT_PIXELSHADER(15L), D3D10_SVT_VERTEXSHADER(16L), D3D10_SVT_PIXELFRAGMENT(17L), D3D10_SVT_VERTEXFRAGMENT(18L), D3D10_SVT_UINT(19L), D3D10_SVT_UINT8(20L), D3D10_SVT_GEOMETRYSHADER(21L), D3D10_SVT_RASTERIZER(22L), D3D10_SVT_DEPTHSTENCIL(23L), D3D10_SVT_BLEND(24L), D3D10_SVT_BUFFER(25L), D3D10_SVT_CBUFFER(26L), D3D10_SVT_TBUFFER(27L), D3D10_SVT_TEXTURE1DARRAY(28L), D3D10_SVT_TEXTURE2DARRAY(29L), D3D10_SVT_RENDERTARGETVIEW(30L), D3D10_SVT_DEPTHSTENCILVIEW(31L), D3D10_SVT_TEXTURE2DMS(32L), D3D10_SVT_TEXTURE2DMSARRAY(33L), D3D10_SVT_TEXTURECUBEARRAY(34L), D3D11_SVT_HULLSHADER(35L), D3D11_SVT_DOMAINSHADER(36L), D3D11_SVT_INTERFACE_POINTER(37L), D3D11_SVT_COMPUTESHADER(38L), D3D11_SVT_DOUBLE(39L), D3D11_SVT_RWTEXTURE1D(40L), D3D11_SVT_RWTEXTURE1DARRAY(41L), D3D11_SVT_RWTEXTURE2D(42L), D3D11_SVT_RWTEXTURE2DARRAY(43L), D3D11_SVT_RWTEXTURE3D(44L), D3D11_SVT_RWBUFFER(45L), D3D11_SVT_BYTEADDRESS_BUFFER(46L), D3D11_SVT_RWBYTEADDRESS_BUFFER(47L), D3D11_SVT_STRUCTURED_BUFFER(48L), D3D11_SVT_RWSTRUCTURED_BUFFER(49L), D3D11_SVT_APPEND_STRUCTURED_BUFFER(50L), D3D11_SVT_CONSUME_STRUCTURED_BUFFER(51L), D3D_SVT_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D_SHADER_VARIABLE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_SHADER_VARIABLE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_SHADER_INPUT_FLAGS}
 */
enum class _D3D_SHADER_INPUT_FLAGS(val value: Long) {
    D3D_SIF_USERPACKED(1L), D3D_SIF_COMPARISON_SAMPLER(2L), D3D_SIF_TEXTURE_COMPONENT_0(4L), D3D_SIF_TEXTURE_COMPONENT_1(8L), D3D_SIF_TEXTURE_COMPONENTS(12L), D3D_SIF_UNUSED(16L), D3D10_SIF_USERPACKED(1L), D3D10_SIF_COMPARISON_SAMPLER(2L), D3D10_SIF_TEXTURE_COMPONENT_0(4L), D3D10_SIF_TEXTURE_COMPONENT_1(8L), D3D10_SIF_TEXTURE_COMPONENTS(12L), D3D_SIF_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D_SHADER_INPUT_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_SHADER_INPUT_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_SHADER_INPUT_TYPE}
 */
enum class _D3D_SHADER_INPUT_TYPE(val value: Long) {
    D3D_SIT_CBUFFER(0L), D3D_SIT_TBUFFER(1L), D3D_SIT_TEXTURE(2L), D3D_SIT_SAMPLER(3L), D3D_SIT_UAV_RWTYPED(4L), D3D_SIT_STRUCTURED(5L), D3D_SIT_UAV_RWSTRUCTURED(6L), D3D_SIT_BYTEADDRESS(7L), D3D_SIT_UAV_RWBYTEADDRESS(8L), D3D_SIT_UAV_APPEND_STRUCTURED(9L), D3D_SIT_UAV_CONSUME_STRUCTURED(10L), D3D_SIT_UAV_RWSTRUCTURED_WITH_COUNTER(11L), D3D_SIT_RTACCELERATIONSTRUCTURE(12L), D3D_SIT_UAV_FEEDBACKTEXTURE(13L), D3D10_SIT_CBUFFER(0L), D3D10_SIT_TBUFFER(1L), D3D10_SIT_TEXTURE(2L), D3D10_SIT_SAMPLER(3L), D3D11_SIT_UAV_RWTYPED(4L), D3D11_SIT_STRUCTURED(5L), D3D11_SIT_UAV_RWSTRUCTURED(6L), D3D11_SIT_BYTEADDRESS(7L), D3D11_SIT_UAV_RWBYTEADDRESS(8L), D3D11_SIT_UAV_APPEND_STRUCTURED(9L), D3D11_SIT_UAV_CONSUME_STRUCTURED(10L), D3D11_SIT_UAV_RWSTRUCTURED_WITH_COUNTER(11L);

    companion object {
        fun fromValue(v: Long): _D3D_SHADER_INPUT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_SHADER_INPUT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_SHADER_CBUFFER_FLAGS}
 */
enum class _D3D_SHADER_CBUFFER_FLAGS(val value: Long) {
    D3D_CBF_USERPACKED(1L), D3D10_CBF_USERPACKED(1L), D3D_CBF_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D_SHADER_CBUFFER_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_SHADER_CBUFFER_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_CBUFFER_TYPE}
 */
enum class _D3D_CBUFFER_TYPE(val value: Long) {
    D3D_CT_CBUFFER(0L), D3D_CT_TBUFFER(1L), D3D_CT_INTERFACE_POINTERS(2L), D3D_CT_RESOURCE_BIND_INFO(3L), D3D10_CT_CBUFFER(0L), D3D10_CT_TBUFFER(1L), D3D11_CT_CBUFFER(0L), D3D11_CT_TBUFFER(1L), D3D11_CT_INTERFACE_POINTERS(2L), D3D11_CT_RESOURCE_BIND_INFO(3L);

    companion object {
        fun fromValue(v: Long): _D3D_CBUFFER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_CBUFFER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_NAME}
 */
enum class D3D_NAME(val value: Long) {
    D3D_NAME_UNDEFINED(0L), D3D_NAME_POSITION(1L), D3D_NAME_CLIP_DISTANCE(2L), D3D_NAME_CULL_DISTANCE(3L), D3D_NAME_RENDER_TARGET_ARRAY_INDEX(4L), D3D_NAME_VIEWPORT_ARRAY_INDEX(5L), D3D_NAME_VERTEX_ID(6L), D3D_NAME_PRIMITIVE_ID(7L), D3D_NAME_INSTANCE_ID(8L), D3D_NAME_IS_FRONT_FACE(9L), D3D_NAME_SAMPLE_INDEX(10L), D3D_NAME_FINAL_QUAD_EDGE_TESSFACTOR(11L), D3D_NAME_FINAL_QUAD_INSIDE_TESSFACTOR(12L), D3D_NAME_FINAL_TRI_EDGE_TESSFACTOR(13L), D3D_NAME_FINAL_TRI_INSIDE_TESSFACTOR(14L), D3D_NAME_FINAL_LINE_DETAIL_TESSFACTOR(15L), D3D_NAME_FINAL_LINE_DENSITY_TESSFACTOR(16L), D3D_NAME_BARYCENTRICS(23L), D3D_NAME_SHADINGRATE(24L), D3D_NAME_CULLPRIMITIVE(25L), D3D_NAME_TARGET(64L), D3D_NAME_DEPTH(65L), D3D_NAME_COVERAGE(66L), D3D_NAME_DEPTH_GREATER_EQUAL(67L), D3D_NAME_DEPTH_LESS_EQUAL(68L), D3D_NAME_STENCIL_REF(69L), D3D_NAME_INNER_COVERAGE(70L), D3D10_NAME_UNDEFINED(0L), D3D10_NAME_POSITION(1L), D3D10_NAME_CLIP_DISTANCE(2L), D3D10_NAME_CULL_DISTANCE(3L), D3D10_NAME_RENDER_TARGET_ARRAY_INDEX(4L), D3D10_NAME_VIEWPORT_ARRAY_INDEX(5L), D3D10_NAME_VERTEX_ID(6L), D3D10_NAME_PRIMITIVE_ID(7L), D3D10_NAME_INSTANCE_ID(8L), D3D10_NAME_IS_FRONT_FACE(9L), D3D10_NAME_SAMPLE_INDEX(10L), D3D10_NAME_TARGET(64L), D3D10_NAME_DEPTH(65L), D3D10_NAME_COVERAGE(66L), D3D11_NAME_FINAL_QUAD_EDGE_TESSFACTOR(11L), D3D11_NAME_FINAL_QUAD_INSIDE_TESSFACTOR(12L), D3D11_NAME_FINAL_TRI_EDGE_TESSFACTOR(13L), D3D11_NAME_FINAL_TRI_INSIDE_TESSFACTOR(14L), D3D11_NAME_FINAL_LINE_DETAIL_TESSFACTOR(15L), D3D11_NAME_FINAL_LINE_DENSITY_TESSFACTOR(16L), D3D11_NAME_DEPTH_GREATER_EQUAL(67L), D3D11_NAME_DEPTH_LESS_EQUAL(68L), D3D11_NAME_STENCIL_REF(69L), D3D11_NAME_INNER_COVERAGE(70L), D3D12_NAME_BARYCENTRICS(23L), D3D12_NAME_SHADINGRATE(24L), D3D12_NAME_CULLPRIMITIVE(25L);

    companion object {
        fun fromValue(v: Long): D3D_NAME = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_NAME value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_RESOURCE_RETURN_TYPE}
 */
enum class D3D_RESOURCE_RETURN_TYPE(val value: Long) {
    D3D_RETURN_TYPE_UNORM(1L), D3D_RETURN_TYPE_SNORM(2L), D3D_RETURN_TYPE_SINT(3L), D3D_RETURN_TYPE_UINT(4L), D3D_RETURN_TYPE_FLOAT(5L), D3D_RETURN_TYPE_MIXED(6L), D3D_RETURN_TYPE_DOUBLE(7L), D3D_RETURN_TYPE_CONTINUED(8L), D3D10_RETURN_TYPE_UNORM(1L), D3D10_RETURN_TYPE_SNORM(2L), D3D10_RETURN_TYPE_SINT(3L), D3D10_RETURN_TYPE_UINT(4L), D3D10_RETURN_TYPE_FLOAT(5L), D3D10_RETURN_TYPE_MIXED(6L), D3D11_RETURN_TYPE_UNORM(1L), D3D11_RETURN_TYPE_SNORM(2L), D3D11_RETURN_TYPE_SINT(3L), D3D11_RETURN_TYPE_UINT(4L), D3D11_RETURN_TYPE_FLOAT(5L), D3D11_RETURN_TYPE_MIXED(6L), D3D11_RETURN_TYPE_DOUBLE(7L), D3D11_RETURN_TYPE_CONTINUED(8L);

    companion object {
        fun fromValue(v: Long): D3D_RESOURCE_RETURN_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_RESOURCE_RETURN_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_REGISTER_COMPONENT_TYPE}
 */
enum class D3D_REGISTER_COMPONENT_TYPE(val value: Long) {
    D3D_REGISTER_COMPONENT_UNKNOWN(0L), D3D_REGISTER_COMPONENT_UINT32(1L), D3D_REGISTER_COMPONENT_SINT32(2L), D3D_REGISTER_COMPONENT_FLOAT32(3L), D3D_REGISTER_COMPONENT_UINT16(4L), D3D_REGISTER_COMPONENT_SINT16(5L), D3D_REGISTER_COMPONENT_FLOAT16(6L), D3D_REGISTER_COMPONENT_UINT64(7L), D3D_REGISTER_COMPONENT_SINT64(8L), D3D_REGISTER_COMPONENT_FLOAT64(9L), D3D10_REGISTER_COMPONENT_UNKNOWN(0L), D3D10_REGISTER_COMPONENT_UINT32(1L), D3D10_REGISTER_COMPONENT_SINT32(2L), D3D10_REGISTER_COMPONENT_FLOAT32(3L), D3D10_REGISTER_COMPONENT_UINT16(4L), D3D10_REGISTER_COMPONENT_SINT16(5L), D3D10_REGISTER_COMPONENT_FLOAT16(6L), D3D10_REGISTER_COMPONENT_UINT64(7L), D3D10_REGISTER_COMPONENT_SINT64(8L), D3D10_REGISTER_COMPONENT_FLOAT64(9L);

    companion object {
        fun fromValue(v: Long): D3D_REGISTER_COMPONENT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_REGISTER_COMPONENT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_TESSELLATOR_DOMAIN}
 */
enum class D3D_TESSELLATOR_DOMAIN(val value: Long) {
    D3D_TESSELLATOR_DOMAIN_UNDEFINED(0L), D3D_TESSELLATOR_DOMAIN_ISOLINE(1L), D3D_TESSELLATOR_DOMAIN_TRI(2L), D3D_TESSELLATOR_DOMAIN_QUAD(3L), D3D11_TESSELLATOR_DOMAIN_UNDEFINED(0L), D3D11_TESSELLATOR_DOMAIN_ISOLINE(1L), D3D11_TESSELLATOR_DOMAIN_TRI(2L), D3D11_TESSELLATOR_DOMAIN_QUAD(3L);

    companion object {
        fun fromValue(v: Long): D3D_TESSELLATOR_DOMAIN = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_TESSELLATOR_DOMAIN value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_TESSELLATOR_PARTITIONING}
 */
enum class D3D_TESSELLATOR_PARTITIONING(val value: Long) {
    D3D_TESSELLATOR_PARTITIONING_UNDEFINED(0L), D3D_TESSELLATOR_PARTITIONING_INTEGER(1L), D3D_TESSELLATOR_PARTITIONING_POW2(2L), D3D_TESSELLATOR_PARTITIONING_FRACTIONAL_ODD(3L), D3D_TESSELLATOR_PARTITIONING_FRACTIONAL_EVEN(4L), D3D11_TESSELLATOR_PARTITIONING_UNDEFINED(0L), D3D11_TESSELLATOR_PARTITIONING_INTEGER(1L), D3D11_TESSELLATOR_PARTITIONING_POW2(2L), D3D11_TESSELLATOR_PARTITIONING_FRACTIONAL_ODD(3L), D3D11_TESSELLATOR_PARTITIONING_FRACTIONAL_EVEN(4L);

    companion object {
        fun fromValue(v: Long): D3D_TESSELLATOR_PARTITIONING = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_TESSELLATOR_PARTITIONING value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_TESSELLATOR_OUTPUT_PRIMITIVE}
 */
enum class D3D_TESSELLATOR_OUTPUT_PRIMITIVE(val value: Long) {
    D3D_TESSELLATOR_OUTPUT_UNDEFINED(0L), D3D_TESSELLATOR_OUTPUT_POINT(1L), D3D_TESSELLATOR_OUTPUT_LINE(2L), D3D_TESSELLATOR_OUTPUT_TRIANGLE_CW(3L), D3D_TESSELLATOR_OUTPUT_TRIANGLE_CCW(4L), D3D11_TESSELLATOR_OUTPUT_UNDEFINED(0L), D3D11_TESSELLATOR_OUTPUT_POINT(1L), D3D11_TESSELLATOR_OUTPUT_LINE(2L), D3D11_TESSELLATOR_OUTPUT_TRIANGLE_CW(3L), D3D11_TESSELLATOR_OUTPUT_TRIANGLE_CCW(4L);

    companion object {
        fun fromValue(v: Long): D3D_TESSELLATOR_OUTPUT_PRIMITIVE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_TESSELLATOR_OUTPUT_PRIMITIVE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_MIN_PRECISION}
 */
enum class D3D_MIN_PRECISION(val value: Long) {
    D3D_MIN_PRECISION_DEFAULT(0L), D3D_MIN_PRECISION_FLOAT_16(1L), D3D_MIN_PRECISION_FLOAT_2_8(2L), D3D_MIN_PRECISION_RESERVED(3L), D3D_MIN_PRECISION_SINT_16(4L), D3D_MIN_PRECISION_UINT_16(5L), D3D_MIN_PRECISION_ANY_16(240L), D3D_MIN_PRECISION_ANY_10(241L);

    companion object {
        fun fromValue(v: Long): D3D_MIN_PRECISION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_MIN_PRECISION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_INTERPOLATION_MODE}
 */
enum class D3D_INTERPOLATION_MODE(val value: Long) {
    D3D_INTERPOLATION_UNDEFINED(0L), D3D_INTERPOLATION_CONSTANT(1L), D3D_INTERPOLATION_LINEAR(2L), D3D_INTERPOLATION_LINEAR_CENTROID(3L), D3D_INTERPOLATION_LINEAR_NOPERSPECTIVE(4L), D3D_INTERPOLATION_LINEAR_NOPERSPECTIVE_CENTROID(5L), D3D_INTERPOLATION_LINEAR_SAMPLE(6L), D3D_INTERPOLATION_LINEAR_NOPERSPECTIVE_SAMPLE(7L);

    companion object {
        fun fromValue(v: Long): D3D_INTERPOLATION_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_INTERPOLATION_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D_PARAMETER_FLAGS}
 */
enum class _D3D_PARAMETER_FLAGS(val value: Long) {
    D3D_PF_NONE(0L), D3D_PF_IN(1L), D3D_PF_OUT(2L), D3D_PF_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D_PARAMETER_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D_PARAMETER_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_FORMAT_LAYOUT}
 */
enum class D3D_FORMAT_LAYOUT(val value: Long) {
    D3DFL_STANDARD(0L), D3DFL_CUSTOM(-1L);

    companion object {
        fun fromValue(v: Long): D3D_FORMAT_LAYOUT = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_FORMAT_LAYOUT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_FORMAT_TYPE_LEVEL}
 */
enum class D3D_FORMAT_TYPE_LEVEL(val value: Long) {
    D3DFTL_NO_TYPE(0L), D3DFTL_PARTIAL_TYPE(-2L), D3DFTL_FULL_TYPE(-1L);

    companion object {
        fun fromValue(v: Long): D3D_FORMAT_TYPE_LEVEL = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_FORMAT_TYPE_LEVEL value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_FORMAT_COMPONENT_NAME}
 */
enum class D3D_FORMAT_COMPONENT_NAME(val value: Long) {
    D3DFCN_R(-4L), D3DFCN_G(-3L), D3DFCN_B(-2L), D3DFCN_A(-1L), D3DFCN_D(0L), D3DFCN_S(1L), D3DFCN_X(2L);

    companion object {
        fun fromValue(v: Long): D3D_FORMAT_COMPONENT_NAME = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_FORMAT_COMPONENT_NAME value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D_FORMAT_COMPONENT_INTERPRETATION}
 */
enum class D3D_FORMAT_COMPONENT_INTERPRETATION(val value: Long) {
    D3DFCI_TYPELESS(0L), D3DFCI_FLOAT(-4L), D3DFCI_SNORM(-3L), D3DFCI_UNORM(-2L), D3DFCI_SINT(-1L), D3DFCI_UINT(1L), D3DFCI_UNORM_SRGB(2L), D3DFCI_BIASED_FIXED_2_8(3L);

    companion object {
        fun fromValue(v: Long): D3D_FORMAT_COMPONENT_INTERPRETATION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D_FORMAT_COMPONENT_INTERPRETATION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_INPUT_CLASSIFICATION}
 */
enum class D3D11_INPUT_CLASSIFICATION(val value: Long) {
    D3D11_INPUT_PER_VERTEX_DATA(0L), D3D11_INPUT_PER_INSTANCE_DATA(1L);

    companion object {
        fun fromValue(v: Long): D3D11_INPUT_CLASSIFICATION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_INPUT_CLASSIFICATION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_FILL_MODE}
 */
enum class D3D11_FILL_MODE(val value: Long) {
    D3D11_FILL_WIREFRAME(2L), D3D11_FILL_SOLID(3L);

    companion object {
        fun fromValue(v: Long): D3D11_FILL_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_FILL_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_CULL_MODE}
 */
enum class D3D11_CULL_MODE(val value: Long) {
    D3D11_CULL_NONE(1L), D3D11_CULL_FRONT(2L), D3D11_CULL_BACK(3L);

    companion object {
        fun fromValue(v: Long): D3D11_CULL_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_CULL_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_RESOURCE_DIMENSION}
 */
enum class D3D11_RESOURCE_DIMENSION(val value: Long) {
    D3D11_RESOURCE_DIMENSION_UNKNOWN(0L), D3D11_RESOURCE_DIMENSION_BUFFER(1L), D3D11_RESOURCE_DIMENSION_TEXTURE1D(2L), D3D11_RESOURCE_DIMENSION_TEXTURE2D(3L), D3D11_RESOURCE_DIMENSION_TEXTURE3D(4L);

    companion object {
        fun fromValue(v: Long): D3D11_RESOURCE_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_RESOURCE_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_DSV_DIMENSION}
 */
enum class D3D11_DSV_DIMENSION(val value: Long) {
    D3D11_DSV_DIMENSION_UNKNOWN(0L), D3D11_DSV_DIMENSION_TEXTURE1D(1L), D3D11_DSV_DIMENSION_TEXTURE1DARRAY(2L), D3D11_DSV_DIMENSION_TEXTURE2D(3L), D3D11_DSV_DIMENSION_TEXTURE2DARRAY(4L), D3D11_DSV_DIMENSION_TEXTURE2DMS(5L), D3D11_DSV_DIMENSION_TEXTURE2DMSARRAY(6L);

    companion object {
        fun fromValue(v: Long): D3D11_DSV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_DSV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_RTV_DIMENSION}
 */
enum class D3D11_RTV_DIMENSION(val value: Long) {
    D3D11_RTV_DIMENSION_UNKNOWN(0L), D3D11_RTV_DIMENSION_BUFFER(1L), D3D11_RTV_DIMENSION_TEXTURE1D(2L), D3D11_RTV_DIMENSION_TEXTURE1DARRAY(3L), D3D11_RTV_DIMENSION_TEXTURE2D(4L), D3D11_RTV_DIMENSION_TEXTURE2DARRAY(5L), D3D11_RTV_DIMENSION_TEXTURE2DMS(6L), D3D11_RTV_DIMENSION_TEXTURE2DMSARRAY(7L), D3D11_RTV_DIMENSION_TEXTURE3D(8L);

    companion object {
        fun fromValue(v: Long): D3D11_RTV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_RTV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_UAV_DIMENSION}
 */
enum class D3D11_UAV_DIMENSION(val value: Long) {
    D3D11_UAV_DIMENSION_UNKNOWN(0L), D3D11_UAV_DIMENSION_BUFFER(1L), D3D11_UAV_DIMENSION_TEXTURE1D(2L), D3D11_UAV_DIMENSION_TEXTURE1DARRAY(3L), D3D11_UAV_DIMENSION_TEXTURE2D(4L), D3D11_UAV_DIMENSION_TEXTURE2DARRAY(5L), D3D11_UAV_DIMENSION_TEXTURE3D(8L);

    companion object {
        fun fromValue(v: Long): D3D11_UAV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_UAV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_USAGE}
 */
enum class D3D11_USAGE(val value: Long) {
    D3D11_USAGE_DEFAULT(0L), D3D11_USAGE_IMMUTABLE(1L), D3D11_USAGE_DYNAMIC(2L), D3D11_USAGE_STAGING(3L);

    companion object {
        fun fromValue(v: Long): D3D11_USAGE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_USAGE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_BIND_FLAG}
 */
enum class D3D11_BIND_FLAG(val value: Long) {
    D3D11_BIND_VERTEX_BUFFER(1L), D3D11_BIND_INDEX_BUFFER(2L), D3D11_BIND_CONSTANT_BUFFER(4L), D3D11_BIND_SHADER_RESOURCE(8L), D3D11_BIND_STREAM_OUTPUT(16L), D3D11_BIND_RENDER_TARGET(32L), D3D11_BIND_DEPTH_STENCIL(64L), D3D11_BIND_UNORDERED_ACCESS(128L), D3D11_BIND_DECODER(512L), D3D11_BIND_VIDEO_ENCODER(1024L);

    companion object {
        fun fromValue(v: Long): D3D11_BIND_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_BIND_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_CPU_ACCESS_FLAG}
 */
enum class D3D11_CPU_ACCESS_FLAG(val value: Long) {
    D3D11_CPU_ACCESS_WRITE(65536L), D3D11_CPU_ACCESS_READ(131072L);

    companion object {
        fun fromValue(v: Long): D3D11_CPU_ACCESS_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_CPU_ACCESS_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_RESOURCE_MISC_FLAG}
 */
enum class D3D11_RESOURCE_MISC_FLAG(val value: Long) {
    D3D11_RESOURCE_MISC_GENERATE_MIPS(1L), D3D11_RESOURCE_MISC_SHARED(2L), D3D11_RESOURCE_MISC_TEXTURECUBE(4L), D3D11_RESOURCE_MISC_DRAWINDIRECT_ARGS(16L), D3D11_RESOURCE_MISC_BUFFER_ALLOW_RAW_VIEWS(32L), D3D11_RESOURCE_MISC_BUFFER_STRUCTURED(64L), D3D11_RESOURCE_MISC_RESOURCE_CLAMP(128L), D3D11_RESOURCE_MISC_SHARED_KEYEDMUTEX(256L), D3D11_RESOURCE_MISC_GDI_COMPATIBLE(512L), D3D11_RESOURCE_MISC_SHARED_NTHANDLE(2048L), D3D11_RESOURCE_MISC_RESTRICTED_CONTENT(4096L), D3D11_RESOURCE_MISC_RESTRICT_SHARED_RESOURCE(8192L), D3D11_RESOURCE_MISC_RESTRICT_SHARED_RESOURCE_DRIVER(16384L), D3D11_RESOURCE_MISC_GUARDED(32768L), D3D11_RESOURCE_MISC_TILE_POOL(131072L), D3D11_RESOURCE_MISC_TILED(262144L), D3D11_RESOURCE_MISC_HW_PROTECTED(524288L), D3D11_RESOURCE_MISC_SHARED_DISPLAYABLE(1048576L), D3D11_RESOURCE_MISC_SHARED_EXCLUSIVE_WRITER(2097152L), D3D11_RESOURCE_MISC_NO_SHADER_ACCESS(4194304L);

    companion object {
        fun fromValue(v: Long): D3D11_RESOURCE_MISC_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_RESOURCE_MISC_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_MAP}
 */
enum class D3D11_MAP(val value: Long) {
    D3D11_MAP_READ(1L), D3D11_MAP_WRITE(2L), D3D11_MAP_READ_WRITE(3L), D3D11_MAP_WRITE_DISCARD(4L), D3D11_MAP_WRITE_NO_OVERWRITE(5L);

    companion object {
        fun fromValue(v: Long): D3D11_MAP = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_MAP value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_MAP_FLAG}
 */
enum class D3D11_MAP_FLAG(val value: Long) {
    D3D11_MAP_FLAG_DO_NOT_WAIT(1048576L);

    companion object {
        fun fromValue(v: Long): D3D11_MAP_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_MAP_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_RAISE_FLAG}
 */
enum class D3D11_RAISE_FLAG(val value: Long) {
    D3D11_RAISE_FLAG_DRIVER_INTERNAL_ERROR(1L);

    companion object {
        fun fromValue(v: Long): D3D11_RAISE_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_RAISE_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_CLEAR_FLAG}
 */
enum class D3D11_CLEAR_FLAG(val value: Long) {
    D3D11_CLEAR_DEPTH(1L), D3D11_CLEAR_STENCIL(2L);

    companion object {
        fun fromValue(v: Long): D3D11_CLEAR_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_CLEAR_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_COMPARISON_FUNC}
 */
enum class D3D11_COMPARISON_FUNC(val value: Long) {
    D3D11_COMPARISON_NEVER(1L), D3D11_COMPARISON_LESS(2L), D3D11_COMPARISON_EQUAL(3L), D3D11_COMPARISON_LESS_EQUAL(4L), D3D11_COMPARISON_GREATER(5L), D3D11_COMPARISON_NOT_EQUAL(6L), D3D11_COMPARISON_GREATER_EQUAL(7L), D3D11_COMPARISON_ALWAYS(8L);

    companion object {
        fun fromValue(v: Long): D3D11_COMPARISON_FUNC = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_COMPARISON_FUNC value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_DEPTH_WRITE_MASK}
 */
enum class D3D11_DEPTH_WRITE_MASK(val value: Long) {
    D3D11_DEPTH_WRITE_MASK_ZERO(0L), D3D11_DEPTH_WRITE_MASK_ALL(1L);

    companion object {
        fun fromValue(v: Long): D3D11_DEPTH_WRITE_MASK = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_DEPTH_WRITE_MASK value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_STENCIL_OP}
 */
enum class D3D11_STENCIL_OP(val value: Long) {
    D3D11_STENCIL_OP_KEEP(1L), D3D11_STENCIL_OP_ZERO(2L), D3D11_STENCIL_OP_REPLACE(3L), D3D11_STENCIL_OP_INCR_SAT(4L), D3D11_STENCIL_OP_DECR_SAT(5L), D3D11_STENCIL_OP_INVERT(6L), D3D11_STENCIL_OP_INCR(7L), D3D11_STENCIL_OP_DECR(8L);

    companion object {
        fun fromValue(v: Long): D3D11_STENCIL_OP = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_STENCIL_OP value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_BLEND}
 */
enum class D3D11_BLEND(val value: Long) {
    D3D11_BLEND_ZERO(1L), D3D11_BLEND_ONE(2L), D3D11_BLEND_SRC_COLOR(3L), D3D11_BLEND_INV_SRC_COLOR(4L), D3D11_BLEND_SRC_ALPHA(5L), D3D11_BLEND_INV_SRC_ALPHA(6L), D3D11_BLEND_DEST_ALPHA(7L), D3D11_BLEND_INV_DEST_ALPHA(8L), D3D11_BLEND_DEST_COLOR(9L), D3D11_BLEND_INV_DEST_COLOR(10L), D3D11_BLEND_SRC_ALPHA_SAT(11L), D3D11_BLEND_BLEND_FACTOR(14L), D3D11_BLEND_INV_BLEND_FACTOR(15L), D3D11_BLEND_SRC1_COLOR(16L), D3D11_BLEND_INV_SRC1_COLOR(17L), D3D11_BLEND_SRC1_ALPHA(18L), D3D11_BLEND_INV_SRC1_ALPHA(19L);

    companion object {
        fun fromValue(v: Long): D3D11_BLEND = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_BLEND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_BLEND_OP}
 */
enum class D3D11_BLEND_OP(val value: Long) {
    D3D11_BLEND_OP_ADD(1L), D3D11_BLEND_OP_SUBTRACT(2L), D3D11_BLEND_OP_REV_SUBTRACT(3L), D3D11_BLEND_OP_MIN(4L), D3D11_BLEND_OP_MAX(5L);

    companion object {
        fun fromValue(v: Long): D3D11_BLEND_OP = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_BLEND_OP value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_COLOR_WRITE_ENABLE}
 */
enum class D3D11_COLOR_WRITE_ENABLE(val value: Long) {
    D3D11_COLOR_WRITE_ENABLE_RED(1L), D3D11_COLOR_WRITE_ENABLE_GREEN(2L), D3D11_COLOR_WRITE_ENABLE_BLUE(4L), D3D11_COLOR_WRITE_ENABLE_ALPHA(8L), D3D11_COLOR_WRITE_ENABLE_ALL(15L);

    companion object {
        fun fromValue(v: Long): D3D11_COLOR_WRITE_ENABLE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_COLOR_WRITE_ENABLE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_TEXTURECUBE_FACE}
 */
enum class D3D11_TEXTURECUBE_FACE(val value: Long) {
    D3D11_TEXTURECUBE_FACE_POSITIVE_X(0L), D3D11_TEXTURECUBE_FACE_NEGATIVE_X(1L), D3D11_TEXTURECUBE_FACE_POSITIVE_Y(2L), D3D11_TEXTURECUBE_FACE_NEGATIVE_Y(3L), D3D11_TEXTURECUBE_FACE_POSITIVE_Z(4L), D3D11_TEXTURECUBE_FACE_NEGATIVE_Z(5L);

    companion object {
        fun fromValue(v: Long): D3D11_TEXTURECUBE_FACE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_TEXTURECUBE_FACE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_BUFFEREX_SRV_FLAG}
 */
enum class D3D11_BUFFEREX_SRV_FLAG(val value: Long) {
    D3D11_BUFFEREX_SRV_FLAG_RAW(1L);

    companion object {
        fun fromValue(v: Long): D3D11_BUFFEREX_SRV_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_BUFFEREX_SRV_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_DSV_FLAG}
 */
enum class D3D11_DSV_FLAG(val value: Long) {
    D3D11_DSV_READ_ONLY_DEPTH(1L), D3D11_DSV_READ_ONLY_STENCIL(2L);

    companion object {
        fun fromValue(v: Long): D3D11_DSV_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_DSV_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_BUFFER_UAV_FLAG}
 */
enum class D3D11_BUFFER_UAV_FLAG(val value: Long) {
    D3D11_BUFFER_UAV_FLAG_RAW(1L), D3D11_BUFFER_UAV_FLAG_APPEND(2L), D3D11_BUFFER_UAV_FLAG_COUNTER(4L);

    companion object {
        fun fromValue(v: Long): D3D11_BUFFER_UAV_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_BUFFER_UAV_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_FILTER}
 */
enum class D3D11_FILTER(val value: Long) {
    D3D11_FILTER_MIN_MAG_MIP_POINT(0L), D3D11_FILTER_MIN_MAG_POINT_MIP_LINEAR(1L), D3D11_FILTER_MIN_POINT_MAG_LINEAR_MIP_POINT(4L), D3D11_FILTER_MIN_POINT_MAG_MIP_LINEAR(5L), D3D11_FILTER_MIN_LINEAR_MAG_MIP_POINT(16L), D3D11_FILTER_MIN_LINEAR_MAG_POINT_MIP_LINEAR(17L), D3D11_FILTER_MIN_MAG_LINEAR_MIP_POINT(20L), D3D11_FILTER_MIN_MAG_MIP_LINEAR(21L), D3D11_FILTER_ANISOTROPIC(85L), D3D11_FILTER_COMPARISON_MIN_MAG_MIP_POINT(128L), D3D11_FILTER_COMPARISON_MIN_MAG_POINT_MIP_LINEAR(129L), D3D11_FILTER_COMPARISON_MIN_POINT_MAG_LINEAR_MIP_POINT(132L), D3D11_FILTER_COMPARISON_MIN_POINT_MAG_MIP_LINEAR(133L), D3D11_FILTER_COMPARISON_MIN_LINEAR_MAG_MIP_POINT(144L), D3D11_FILTER_COMPARISON_MIN_LINEAR_MAG_POINT_MIP_LINEAR(145L), D3D11_FILTER_COMPARISON_MIN_MAG_LINEAR_MIP_POINT(148L), D3D11_FILTER_COMPARISON_MIN_MAG_MIP_LINEAR(149L), D3D11_FILTER_COMPARISON_ANISOTROPIC(213L), D3D11_FILTER_MINIMUM_MIN_MAG_MIP_POINT(256L), D3D11_FILTER_MINIMUM_MIN_MAG_POINT_MIP_LINEAR(257L), D3D11_FILTER_MINIMUM_MIN_POINT_MAG_LINEAR_MIP_POINT(260L), D3D11_FILTER_MINIMUM_MIN_POINT_MAG_MIP_LINEAR(261L), D3D11_FILTER_MINIMUM_MIN_LINEAR_MAG_MIP_POINT(272L), D3D11_FILTER_MINIMUM_MIN_LINEAR_MAG_POINT_MIP_LINEAR(273L), D3D11_FILTER_MINIMUM_MIN_MAG_LINEAR_MIP_POINT(276L), D3D11_FILTER_MINIMUM_MIN_MAG_MIP_LINEAR(277L), D3D11_FILTER_MINIMUM_ANISOTROPIC(341L), D3D11_FILTER_MAXIMUM_MIN_MAG_MIP_POINT(384L), D3D11_FILTER_MAXIMUM_MIN_MAG_POINT_MIP_LINEAR(385L), D3D11_FILTER_MAXIMUM_MIN_POINT_MAG_LINEAR_MIP_POINT(388L), D3D11_FILTER_MAXIMUM_MIN_POINT_MAG_MIP_LINEAR(389L), D3D11_FILTER_MAXIMUM_MIN_LINEAR_MAG_MIP_POINT(400L), D3D11_FILTER_MAXIMUM_MIN_LINEAR_MAG_POINT_MIP_LINEAR(401L), D3D11_FILTER_MAXIMUM_MIN_MAG_LINEAR_MIP_POINT(404L), D3D11_FILTER_MAXIMUM_MIN_MAG_MIP_LINEAR(405L), D3D11_FILTER_MAXIMUM_ANISOTROPIC(469L);

    companion object {
        fun fromValue(v: Long): D3D11_FILTER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_FILTER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_FILTER_TYPE}
 */
enum class D3D11_FILTER_TYPE(val value: Long) {
    D3D11_FILTER_TYPE_POINT(0L), D3D11_FILTER_TYPE_LINEAR(1L);

    companion object {
        fun fromValue(v: Long): D3D11_FILTER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_FILTER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_FILTER_REDUCTION_TYPE}
 */
enum class D3D11_FILTER_REDUCTION_TYPE(val value: Long) {
    D3D11_FILTER_REDUCTION_TYPE_STANDARD(0L), D3D11_FILTER_REDUCTION_TYPE_COMPARISON(1L), D3D11_FILTER_REDUCTION_TYPE_MINIMUM(2L), D3D11_FILTER_REDUCTION_TYPE_MAXIMUM(3L);

    companion object {
        fun fromValue(v: Long): D3D11_FILTER_REDUCTION_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_FILTER_REDUCTION_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_TEXTURE_ADDRESS_MODE}
 */
enum class D3D11_TEXTURE_ADDRESS_MODE(val value: Long) {
    D3D11_TEXTURE_ADDRESS_WRAP(1L), D3D11_TEXTURE_ADDRESS_MIRROR(2L), D3D11_TEXTURE_ADDRESS_CLAMP(3L), D3D11_TEXTURE_ADDRESS_BORDER(4L), D3D11_TEXTURE_ADDRESS_MIRROR_ONCE(5L);

    companion object {
        fun fromValue(v: Long): D3D11_TEXTURE_ADDRESS_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_TEXTURE_ADDRESS_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_FORMAT_SUPPORT}
 */
enum class D3D11_FORMAT_SUPPORT(val value: Long) {
    D3D11_FORMAT_SUPPORT_BUFFER(1L), D3D11_FORMAT_SUPPORT_IA_VERTEX_BUFFER(2L), D3D11_FORMAT_SUPPORT_IA_INDEX_BUFFER(4L), D3D11_FORMAT_SUPPORT_SO_BUFFER(8L), D3D11_FORMAT_SUPPORT_TEXTURE1D(16L), D3D11_FORMAT_SUPPORT_TEXTURE2D(32L), D3D11_FORMAT_SUPPORT_TEXTURE3D(64L), D3D11_FORMAT_SUPPORT_TEXTURECUBE(128L), D3D11_FORMAT_SUPPORT_SHADER_LOAD(256L), D3D11_FORMAT_SUPPORT_SHADER_SAMPLE(512L), D3D11_FORMAT_SUPPORT_SHADER_SAMPLE_COMPARISON(1024L), D3D11_FORMAT_SUPPORT_SHADER_SAMPLE_MONO_TEXT(2048L), D3D11_FORMAT_SUPPORT_MIP(4096L), D3D11_FORMAT_SUPPORT_MIP_AUTOGEN(8192L), D3D11_FORMAT_SUPPORT_RENDER_TARGET(16384L), D3D11_FORMAT_SUPPORT_BLENDABLE(32768L), D3D11_FORMAT_SUPPORT_DEPTH_STENCIL(65536L), D3D11_FORMAT_SUPPORT_CPU_LOCKABLE(131072L), D3D11_FORMAT_SUPPORT_MULTISAMPLE_RESOLVE(262144L), D3D11_FORMAT_SUPPORT_DISPLAY(524288L), D3D11_FORMAT_SUPPORT_CAST_WITHIN_BIT_LAYOUT(1048576L), D3D11_FORMAT_SUPPORT_MULTISAMPLE_RENDERTARGET(2097152L), D3D11_FORMAT_SUPPORT_MULTISAMPLE_LOAD(4194304L), D3D11_FORMAT_SUPPORT_SHADER_GATHER(8388608L), D3D11_FORMAT_SUPPORT_BACK_BUFFER_CAST(16777216L), D3D11_FORMAT_SUPPORT_TYPED_UNORDERED_ACCESS_VIEW(33554432L), D3D11_FORMAT_SUPPORT_SHADER_GATHER_COMPARISON(67108864L), D3D11_FORMAT_SUPPORT_DECODER_OUTPUT(134217728L), D3D11_FORMAT_SUPPORT_VIDEO_PROCESSOR_OUTPUT(268435456L), D3D11_FORMAT_SUPPORT_VIDEO_PROCESSOR_INPUT(536870912L), D3D11_FORMAT_SUPPORT_VIDEO_ENCODER(1073741824L);

    companion object {
        fun fromValue(v: Long): D3D11_FORMAT_SUPPORT = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_FORMAT_SUPPORT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_FORMAT_SUPPORT2}
 */
enum class D3D11_FORMAT_SUPPORT2(val value: Long) {
    D3D11_FORMAT_SUPPORT2_UAV_ATOMIC_ADD(1L), D3D11_FORMAT_SUPPORT2_UAV_ATOMIC_BITWISE_OPS(2L), D3D11_FORMAT_SUPPORT2_UAV_ATOMIC_COMPARE_STORE_OR_COMPARE_EXCHANGE(4L), D3D11_FORMAT_SUPPORT2_UAV_ATOMIC_EXCHANGE(8L), D3D11_FORMAT_SUPPORT2_UAV_ATOMIC_SIGNED_MIN_OR_MAX(16L), D3D11_FORMAT_SUPPORT2_UAV_ATOMIC_UNSIGNED_MIN_OR_MAX(32L), D3D11_FORMAT_SUPPORT2_UAV_TYPED_LOAD(64L), D3D11_FORMAT_SUPPORT2_UAV_TYPED_STORE(128L), D3D11_FORMAT_SUPPORT2_OUTPUT_MERGER_LOGIC_OP(256L), D3D11_FORMAT_SUPPORT2_TILED(512L), D3D11_FORMAT_SUPPORT2_SHAREABLE(1024L), D3D11_FORMAT_SUPPORT2_MULTIPLANE_OVERLAY(16384L), D3D11_FORMAT_SUPPORT2_DISPLAYABLE(65536L);

    companion object {
        fun fromValue(v: Long): D3D11_FORMAT_SUPPORT2 = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_FORMAT_SUPPORT2 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_ASYNC_GETDATA_FLAG}
 */
enum class D3D11_ASYNC_GETDATA_FLAG(val value: Long) {
    D3D11_ASYNC_GETDATA_DONOTFLUSH(1L);

    companion object {
        fun fromValue(v: Long): D3D11_ASYNC_GETDATA_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_ASYNC_GETDATA_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_QUERY}
 */
enum class D3D11_QUERY(val value: Long) {
    D3D11_QUERY_EVENT(0L), D3D11_QUERY_OCCLUSION(1L), D3D11_QUERY_TIMESTAMP(2L), D3D11_QUERY_TIMESTAMP_DISJOINT(3L), D3D11_QUERY_PIPELINE_STATISTICS(4L), D3D11_QUERY_OCCLUSION_PREDICATE(5L), D3D11_QUERY_SO_STATISTICS(6L), D3D11_QUERY_SO_OVERFLOW_PREDICATE(7L), D3D11_QUERY_SO_STATISTICS_STREAM0(8L), D3D11_QUERY_SO_OVERFLOW_PREDICATE_STREAM0(9L), D3D11_QUERY_SO_STATISTICS_STREAM1(10L), D3D11_QUERY_SO_OVERFLOW_PREDICATE_STREAM1(11L), D3D11_QUERY_SO_STATISTICS_STREAM2(12L), D3D11_QUERY_SO_OVERFLOW_PREDICATE_STREAM2(13L), D3D11_QUERY_SO_STATISTICS_STREAM3(14L), D3D11_QUERY_SO_OVERFLOW_PREDICATE_STREAM3(15L);

    companion object {
        fun fromValue(v: Long): D3D11_QUERY = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_QUERY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_QUERY_MISC_FLAG}
 */
enum class D3D11_QUERY_MISC_FLAG(val value: Long) {
    D3D11_QUERY_MISC_PREDICATEHINT(1L);

    companion object {
        fun fromValue(v: Long): D3D11_QUERY_MISC_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_QUERY_MISC_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_COUNTER}
 */
enum class D3D11_COUNTER(val value: Long) {
    D3D11_COUNTER_DEVICE_DEPENDENT_0(1073741824L);

    companion object {
        fun fromValue(v: Long): D3D11_COUNTER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_COUNTER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_COUNTER_TYPE}
 */
enum class D3D11_COUNTER_TYPE(val value: Long) {
    D3D11_COUNTER_TYPE_FLOAT32(0L), D3D11_COUNTER_TYPE_UINT16(1L), D3D11_COUNTER_TYPE_UINT32(2L), D3D11_COUNTER_TYPE_UINT64(3L);

    companion object {
        fun fromValue(v: Long): D3D11_COUNTER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_COUNTER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_STANDARD_MULTISAMPLE_QUALITY_LEVELS}
 */
enum class D3D11_STANDARD_MULTISAMPLE_QUALITY_LEVELS(val value: Long) {
    D3D11_STANDARD_MULTISAMPLE_PATTERN(-1L), D3D11_CENTER_MULTISAMPLE_PATTERN(-2L);

    companion object {
        fun fromValue(v: Long): D3D11_STANDARD_MULTISAMPLE_QUALITY_LEVELS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_STANDARD_MULTISAMPLE_QUALITY_LEVELS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_DEVICE_CONTEXT_TYPE}
 */
enum class D3D11_DEVICE_CONTEXT_TYPE(val value: Long) {
    D3D11_DEVICE_CONTEXT_IMMEDIATE(0L), D3D11_DEVICE_CONTEXT_DEFERRED(1L);

    companion object {
        fun fromValue(v: Long): D3D11_DEVICE_CONTEXT_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_DEVICE_CONTEXT_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_FEATURE}
 */
enum class D3D11_FEATURE(val value: Long) {
    D3D11_FEATURE_THREADING(0L), D3D11_FEATURE_DOUBLES(1L), D3D11_FEATURE_FORMAT_SUPPORT(2L), D3D11_FEATURE_FORMAT_SUPPORT2(3L), D3D11_FEATURE_D3D10_X_HARDWARE_OPTIONS(4L), D3D11_FEATURE_D3D11_OPTIONS(5L), D3D11_FEATURE_ARCHITECTURE_INFO(6L), D3D11_FEATURE_D3D9_OPTIONS(7L), D3D11_FEATURE_SHADER_MIN_PRECISION_SUPPORT(8L), D3D11_FEATURE_D3D9_SHADOW_SUPPORT(9L), D3D11_FEATURE_D3D11_OPTIONS1(10L), D3D11_FEATURE_D3D9_SIMPLE_INSTANCING_SUPPORT(11L), D3D11_FEATURE_MARKER_SUPPORT(12L), D3D11_FEATURE_D3D9_OPTIONS1(13L), D3D11_FEATURE_D3D11_OPTIONS2(14L), D3D11_FEATURE_D3D11_OPTIONS3(15L), D3D11_FEATURE_GPU_VIRTUAL_ADDRESS_SUPPORT(16L), D3D11_FEATURE_D3D11_OPTIONS4(17L), D3D11_FEATURE_SHADER_CACHE(18L), D3D11_FEATURE_D3D11_OPTIONS5(19L), D3D11_FEATURE_DISPLAYABLE(20L), D3D11_FEATURE_D3D11_OPTIONS6(21L);

    companion object {
        fun fromValue(v: Long): D3D11_FEATURE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_FEATURE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_SHADER_MIN_PRECISION_SUPPORT}
 */
enum class D3D11_SHADER_MIN_PRECISION_SUPPORT(val value: Long) {
    D3D11_SHADER_MIN_PRECISION_10_BIT(1L), D3D11_SHADER_MIN_PRECISION_16_BIT(2L);

    companion object {
        fun fromValue(v: Long): D3D11_SHADER_MIN_PRECISION_SUPPORT = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_SHADER_MIN_PRECISION_SUPPORT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_TILED_RESOURCES_TIER}
 */
enum class D3D11_TILED_RESOURCES_TIER(val value: Long) {
    D3D11_TILED_RESOURCES_NOT_SUPPORTED(0L), D3D11_TILED_RESOURCES_TIER_1(1L), D3D11_TILED_RESOURCES_TIER_2(2L), D3D11_TILED_RESOURCES_TIER_3(3L);

    companion object {
        fun fromValue(v: Long): D3D11_TILED_RESOURCES_TIER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_TILED_RESOURCES_TIER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_CONSERVATIVE_RASTERIZATION_TIER}
 */
enum class D3D11_CONSERVATIVE_RASTERIZATION_TIER(val value: Long) {
    D3D11_CONSERVATIVE_RASTERIZATION_NOT_SUPPORTED(0L), D3D11_CONSERVATIVE_RASTERIZATION_TIER_1(1L), D3D11_CONSERVATIVE_RASTERIZATION_TIER_2(2L), D3D11_CONSERVATIVE_RASTERIZATION_TIER_3(3L);

    companion object {
        fun fromValue(v: Long): D3D11_CONSERVATIVE_RASTERIZATION_TIER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_CONSERVATIVE_RASTERIZATION_TIER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_SHADER_CACHE_SUPPORT_FLAGS}
 */
enum class D3D11_SHADER_CACHE_SUPPORT_FLAGS(val value: Long) {
    D3D11_SHADER_CACHE_SUPPORT_NONE(0L), D3D11_SHADER_CACHE_SUPPORT_AUTOMATIC_INPROC_CACHE(1L), D3D11_SHADER_CACHE_SUPPORT_AUTOMATIC_DISK_CACHE(2L);

    companion object {
        fun fromValue(v: Long): D3D11_SHADER_CACHE_SUPPORT_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_SHADER_CACHE_SUPPORT_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_SHARED_RESOURCE_TIER}
 */
enum class D3D11_SHARED_RESOURCE_TIER(val value: Long) {
    D3D11_SHARED_RESOURCE_TIER_0(0L), D3D11_SHARED_RESOURCE_TIER_1(1L), D3D11_SHARED_RESOURCE_TIER_2(2L), D3D11_SHARED_RESOURCE_TIER_3(3L);

    companion object {
        fun fromValue(v: Long): D3D11_SHARED_RESOURCE_TIER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_SHARED_RESOURCE_TIER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_SHADER_ACCESS_RESTRICTED_RESOURCE_TIER}
 */
enum class D3D11_SHADER_ACCESS_RESTRICTED_RESOURCE_TIER(val value: Long) {
    D3D11_SHADER_ACCESS_RESTRICTED_RESOURCE_TIER_0(0L), D3D11_SHADER_ACCESS_RESTRICTED_RESOURCE_TIER_1(1L);

    companion object {
        fun fromValue(v: Long): D3D11_SHADER_ACCESS_RESTRICTED_RESOURCE_TIER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_SHADER_ACCESS_RESTRICTED_RESOURCE_TIER value: $v")
    }
}

/**
 * {@snippet lang=c : typedef Long APP_DEPRECATED_HRESULT;}
 */
typealias APP_DEPRECATED_HRESULT = Int

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_DECODER_BUFFER_TYPE}
 */
enum class D3D11_VIDEO_DECODER_BUFFER_TYPE(val value: Long) {
    D3D11_VIDEO_DECODER_BUFFER_PICTURE_PARAMETERS(0L), D3D11_VIDEO_DECODER_BUFFER_MACROBLOCK_CONTROL(1L), D3D11_VIDEO_DECODER_BUFFER_RESIDUAL_DIFFERENCE(2L), D3D11_VIDEO_DECODER_BUFFER_DEBLOCKING_CONTROL(3L), D3D11_VIDEO_DECODER_BUFFER_INVERSE_QUANTIZATION_MATRIX(4L), D3D11_VIDEO_DECODER_BUFFER_SLICE_CONTROL(5L), D3D11_VIDEO_DECODER_BUFFER_BITSTREAM(6L), D3D11_VIDEO_DECODER_BUFFER_MOTION_VECTOR(7L), D3D11_VIDEO_DECODER_BUFFER_FILM_GRAIN(8L), D3D11_VIDEO_DECODER_BUFFER_HUFFMAN_TABLE(9L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_DECODER_BUFFER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_DECODER_BUFFER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_FORMAT_SUPPORT}
 */
enum class D3D11_VIDEO_PROCESSOR_FORMAT_SUPPORT(val value: Long) {
    D3D11_VIDEO_PROCESSOR_FORMAT_SUPPORT_INPUT(1L), D3D11_VIDEO_PROCESSOR_FORMAT_SUPPORT_OUTPUT(2L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_FORMAT_SUPPORT = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_FORMAT_SUPPORT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_DEVICE_CAPS}
 */
enum class D3D11_VIDEO_PROCESSOR_DEVICE_CAPS(val value: Long) {
    D3D11_VIDEO_PROCESSOR_DEVICE_CAPS_LINEAR_SPACE(1L), D3D11_VIDEO_PROCESSOR_DEVICE_CAPS_xvYCC(2L), D3D11_VIDEO_PROCESSOR_DEVICE_CAPS_RGB_RANGE_CONVERSION(4L), D3D11_VIDEO_PROCESSOR_DEVICE_CAPS_YCbCr_MATRIX_CONVERSION(8L), D3D11_VIDEO_PROCESSOR_DEVICE_CAPS_NOMINAL_RANGE(16L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_DEVICE_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_DEVICE_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_FEATURE_CAPS}
 */
enum class D3D11_VIDEO_PROCESSOR_FEATURE_CAPS(val value: Long) {
    D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_ALPHA_FILL(1L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_CONSTRICTION(2L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_LUMA_KEY(4L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_ALPHA_PALETTE(8L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_LEGACY(16L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_STEREO(32L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_ROTATION(64L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_ALPHA_STREAM(128L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_PIXEL_ASPECT_RATIO(256L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_MIRROR(512L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_SHADER_USAGE(1024L), D3D11_VIDEO_PROCESSOR_FEATURE_CAPS_METADATA_HDR10(2048L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_FEATURE_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_FEATURE_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_FILTER_CAPS}
 */
enum class D3D11_VIDEO_PROCESSOR_FILTER_CAPS(val value: Long) {
    D3D11_VIDEO_PROCESSOR_FILTER_CAPS_BRIGHTNESS(1L), D3D11_VIDEO_PROCESSOR_FILTER_CAPS_CONTRAST(2L), D3D11_VIDEO_PROCESSOR_FILTER_CAPS_HUE(4L), D3D11_VIDEO_PROCESSOR_FILTER_CAPS_SATURATION(8L), D3D11_VIDEO_PROCESSOR_FILTER_CAPS_NOISE_REDUCTION(16L), D3D11_VIDEO_PROCESSOR_FILTER_CAPS_EDGE_ENHANCEMENT(32L), D3D11_VIDEO_PROCESSOR_FILTER_CAPS_ANAMORPHIC_SCALING(64L), D3D11_VIDEO_PROCESSOR_FILTER_CAPS_STEREO_ADJUSTMENT(128L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_FILTER_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_FILTER_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_FORMAT_CAPS}
 */
enum class D3D11_VIDEO_PROCESSOR_FORMAT_CAPS(val value: Long) {
    D3D11_VIDEO_PROCESSOR_FORMAT_CAPS_RGB_INTERLACED(1L), D3D11_VIDEO_PROCESSOR_FORMAT_CAPS_RGB_PROCAMP(2L), D3D11_VIDEO_PROCESSOR_FORMAT_CAPS_RGB_LUMA_KEY(4L), D3D11_VIDEO_PROCESSOR_FORMAT_CAPS_PALETTE_INTERLACED(8L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_FORMAT_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_FORMAT_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS}
 */
enum class D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS(val value: Long) {
    D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS_DENOISE(1L), D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS_DERINGING(2L), D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS_EDGE_ENHANCEMENT(4L), D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS_COLOR_CORRECTION(8L), D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS_FLESH_TONE_MAPPING(16L), D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS_IMAGE_STABILIZATION(32L), D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS_SUPER_RESOLUTION(64L), D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS_ANAMORPHIC_SCALING(128L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_AUTO_STREAM_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_STEREO_CAPS}
 */
enum class D3D11_VIDEO_PROCESSOR_STEREO_CAPS(val value: Long) {
    D3D11_VIDEO_PROCESSOR_STEREO_CAPS_MONO_OFFSET(1L), D3D11_VIDEO_PROCESSOR_STEREO_CAPS_ROW_INTERLEAVED(2L), D3D11_VIDEO_PROCESSOR_STEREO_CAPS_COLUMN_INTERLEAVED(4L), D3D11_VIDEO_PROCESSOR_STEREO_CAPS_CHECKERBOARD(8L), D3D11_VIDEO_PROCESSOR_STEREO_CAPS_FLIP_MODE(16L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_STEREO_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_STEREO_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS}
 */
enum class D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS(val value: Long) {
    D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS_DEINTERLACE_BLEND(1L), D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS_DEINTERLACE_BOB(2L), D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS_DEINTERLACE_ADAPTIVE(4L), D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS_DEINTERLACE_MOTION_COMPENSATION(8L), D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS_INVERSE_TELECINE(16L), D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS_FRAME_RATE_CONVERSION(32L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_PROCESSOR_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS}
 */
enum class D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS(val value: Long) {
    D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_32(1L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_22(2L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_2224(4L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_2332(8L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_32322(16L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_55(32L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_64(64L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_87(128L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_222222222223(256L), D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS_OTHER(-2147483648L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_ITELECINE_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_CONTENT_PROTECTION_CAPS}
 */
enum class D3D11_CONTENT_PROTECTION_CAPS(val value: Long) {
    D3D11_CONTENT_PROTECTION_CAPS_SOFTWARE(1L), D3D11_CONTENT_PROTECTION_CAPS_HARDWARE(2L), D3D11_CONTENT_PROTECTION_CAPS_PROTECTION_ALWAYS_ON(4L), D3D11_CONTENT_PROTECTION_CAPS_PARTIAL_DECRYPTION(8L), D3D11_CONTENT_PROTECTION_CAPS_CONTENT_KEY(16L), D3D11_CONTENT_PROTECTION_CAPS_FRESHEN_SESSION_KEY(32L), D3D11_CONTENT_PROTECTION_CAPS_ENCRYPTED_READ_BACK(64L), D3D11_CONTENT_PROTECTION_CAPS_ENCRYPTED_READ_BACK_KEY(128L), D3D11_CONTENT_PROTECTION_CAPS_SEQUENTIAL_CTR_IV(256L), D3D11_CONTENT_PROTECTION_CAPS_ENCRYPT_SLICEDATA_ONLY(512L), D3D11_CONTENT_PROTECTION_CAPS_DECRYPTION_BLT(1024L), D3D11_CONTENT_PROTECTION_CAPS_HARDWARE_PROTECT_UNCOMPRESSED(2048L), D3D11_CONTENT_PROTECTION_CAPS_HARDWARE_PROTECTED_MEMORY_PAGEABLE(4096L), D3D11_CONTENT_PROTECTION_CAPS_HARDWARE_TEARDOWN(8192L), D3D11_CONTENT_PROTECTION_CAPS_HARDWARE_DRM_COMMUNICATION(16384L), D3D11_CONTENT_PROTECTION_CAPS_HARDWARE_DRM_COMMUNICATION_MULTI_THREADED(32768L);

    companion object {
        fun fromValue(v: Long): D3D11_CONTENT_PROTECTION_CAPS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_CONTENT_PROTECTION_CAPS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_FILTER}
 */
enum class D3D11_VIDEO_PROCESSOR_FILTER(val value: Long) {
    D3D11_VIDEO_PROCESSOR_FILTER_BRIGHTNESS(0L), D3D11_VIDEO_PROCESSOR_FILTER_CONTRAST(1L), D3D11_VIDEO_PROCESSOR_FILTER_HUE(2L), D3D11_VIDEO_PROCESSOR_FILTER_SATURATION(3L), D3D11_VIDEO_PROCESSOR_FILTER_NOISE_REDUCTION(4L), D3D11_VIDEO_PROCESSOR_FILTER_EDGE_ENHANCEMENT(5L), D3D11_VIDEO_PROCESSOR_FILTER_ANAMORPHIC_SCALING(6L), D3D11_VIDEO_PROCESSOR_FILTER_STEREO_ADJUSTMENT(7L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_FILTER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_FILTER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_FRAME_FORMAT}
 */
enum class D3D11_VIDEO_FRAME_FORMAT(val value: Long) {
    D3D11_VIDEO_FRAME_FORMAT_PROGRESSIVE(0L), D3D11_VIDEO_FRAME_FORMAT_INTERLACED_TOP_FIELD_FIRST(1L), D3D11_VIDEO_FRAME_FORMAT_INTERLACED_BOTTOM_FIELD_FIRST(2L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_FRAME_FORMAT = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_FRAME_FORMAT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_USAGE}
 */
enum class D3D11_VIDEO_USAGE(val value: Long) {
    D3D11_VIDEO_USAGE_PLAYBACK_NORMAL(0L), D3D11_VIDEO_USAGE_OPTIMAL_SPEED(1L), D3D11_VIDEO_USAGE_OPTIMAL_QUALITY(2L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_USAGE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_USAGE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_NOMINAL_RANGE}
 */
enum class D3D11_VIDEO_PROCESSOR_NOMINAL_RANGE(val value: Long) {
    D3D11_VIDEO_PROCESSOR_NOMINAL_RANGE_UNDEFINED(0L), D3D11_VIDEO_PROCESSOR_NOMINAL_RANGE_16_235(1L), D3D11_VIDEO_PROCESSOR_NOMINAL_RANGE_0_255(2L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_NOMINAL_RANGE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_NOMINAL_RANGE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_ALPHA_FILL_MODE}
 */
enum class D3D11_VIDEO_PROCESSOR_ALPHA_FILL_MODE(val value: Long) {
    D3D11_VIDEO_PROCESSOR_ALPHA_FILL_MODE_OPAQUE(0L), D3D11_VIDEO_PROCESSOR_ALPHA_FILL_MODE_BACKGROUND(1L), D3D11_VIDEO_PROCESSOR_ALPHA_FILL_MODE_DESTINATION(2L), D3D11_VIDEO_PROCESSOR_ALPHA_FILL_MODE_SOURCE_STREAM(3L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_ALPHA_FILL_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_ALPHA_FILL_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_OUTPUT_RATE}
 */
enum class D3D11_VIDEO_PROCESSOR_OUTPUT_RATE(val value: Long) {
    D3D11_VIDEO_PROCESSOR_OUTPUT_RATE_NORMAL(0L), D3D11_VIDEO_PROCESSOR_OUTPUT_RATE_HALF(1L), D3D11_VIDEO_PROCESSOR_OUTPUT_RATE_CUSTOM(2L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_OUTPUT_RATE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_OUTPUT_RATE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_STEREO_FORMAT}
 */
enum class D3D11_VIDEO_PROCESSOR_STEREO_FORMAT(val value: Long) {
    D3D11_VIDEO_PROCESSOR_STEREO_FORMAT_MONO(0L), D3D11_VIDEO_PROCESSOR_STEREO_FORMAT_HORIZONTAL(1L), D3D11_VIDEO_PROCESSOR_STEREO_FORMAT_VERTICAL(2L), D3D11_VIDEO_PROCESSOR_STEREO_FORMAT_SEPARATE(3L), D3D11_VIDEO_PROCESSOR_STEREO_FORMAT_MONO_OFFSET(4L), D3D11_VIDEO_PROCESSOR_STEREO_FORMAT_ROW_INTERLEAVED(5L), D3D11_VIDEO_PROCESSOR_STEREO_FORMAT_COLUMN_INTERLEAVED(6L), D3D11_VIDEO_PROCESSOR_STEREO_FORMAT_CHECKERBOARD(7L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_STEREO_FORMAT = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_STEREO_FORMAT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_STEREO_FLIP_MODE}
 */
enum class D3D11_VIDEO_PROCESSOR_STEREO_FLIP_MODE(val value: Long) {
    D3D11_VIDEO_PROCESSOR_STEREO_FLIP_NONE(0L), D3D11_VIDEO_PROCESSOR_STEREO_FLIP_FRAME0(1L), D3D11_VIDEO_PROCESSOR_STEREO_FLIP_FRAME1(2L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_STEREO_FLIP_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_STEREO_FLIP_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VIDEO_PROCESSOR_ROTATION}
 */
enum class D3D11_VIDEO_PROCESSOR_ROTATION(val value: Long) {
    D3D11_VIDEO_PROCESSOR_ROTATION_IDENTITY(0L), D3D11_VIDEO_PROCESSOR_ROTATION_90(1L), D3D11_VIDEO_PROCESSOR_ROTATION_180(2L), D3D11_VIDEO_PROCESSOR_ROTATION_270(3L);

    companion object {
        fun fromValue(v: Long): D3D11_VIDEO_PROCESSOR_ROTATION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VIDEO_PROCESSOR_ROTATION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_AUTHENTICATED_CHANNEL_TYPE}
 */
enum class D3D11_AUTHENTICATED_CHANNEL_TYPE(val value: Long) {
    D3D11_AUTHENTICATED_CHANNEL_D3D11(1L), D3D11_AUTHENTICATED_CHANNEL_DRIVER_SOFTWARE(2L), D3D11_AUTHENTICATED_CHANNEL_DRIVER_HARDWARE(3L);

    companion object {
        fun fromValue(v: Long): D3D11_AUTHENTICATED_CHANNEL_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_AUTHENTICATED_CHANNEL_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_AUTHENTICATED_PROCESS_IDENTIFIER_TYPE}
 */
enum class D3D11_AUTHENTICATED_PROCESS_IDENTIFIER_TYPE(val value: Long) {
    D3D11_PROCESSIDTYPE_UNKNOWN(0L), D3D11_PROCESSIDTYPE_DWM(1L), D3D11_PROCESSIDTYPE_HANDLE(2L);

    companion object {
        fun fromValue(v: Long): D3D11_AUTHENTICATED_PROCESS_IDENTIFIER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_AUTHENTICATED_PROCESS_IDENTIFIER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_BUS_TYPE}
 */
enum class D3D11_BUS_TYPE(val value: Long) {
    D3D11_BUS_TYPE_OTHER(0L), D3D11_BUS_TYPE_PCI(1L), D3D11_BUS_TYPE_PCIX(2L), D3D11_BUS_TYPE_PCIEXPRESS(3L), D3D11_BUS_TYPE_AGP(4L), D3D11_BUS_IMPL_MODIFIER_INSIDE_OF_CHIPSET(65536L), D3D11_BUS_IMPL_MODIFIER_TRACKS_ON_MOTHER_BOARD_TO_CHIP(131072L), D3D11_BUS_IMPL_MODIFIER_TRACKS_ON_MOTHER_BOARD_TO_SOCKET(196608L), D3D11_BUS_IMPL_MODIFIER_DAUGHTER_BOARD_CONNECTOR(262144L), D3D11_BUS_IMPL_MODIFIER_DAUGHTER_BOARD_CONNECTOR_INSIDE_OF_NUAE(327680L), D3D11_BUS_IMPL_MODIFIER_NON_STANDARD(-2147483648L);

    companion object {
        fun fromValue(v: Long): D3D11_BUS_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_BUS_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VDOV_DIMENSION}
 */
enum class D3D11_VDOV_DIMENSION(val value: Long) {
    D3D11_VDOV_DIMENSION_UNKNOWN(0L), D3D11_VDOV_DIMENSION_TEXTURE2D(1L);

    companion object {
        fun fromValue(v: Long): D3D11_VDOV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VDOV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VPIV_DIMENSION}
 */
enum class D3D11_VPIV_DIMENSION(val value: Long) {
    D3D11_VPIV_DIMENSION_UNKNOWN(0L), D3D11_VPIV_DIMENSION_TEXTURE2D(1L);

    companion object {
        fun fromValue(v: Long): D3D11_VPIV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VPIV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_VPOV_DIMENSION}
 */
enum class D3D11_VPOV_DIMENSION(val value: Long) {
    D3D11_VPOV_DIMENSION_UNKNOWN(0L), D3D11_VPOV_DIMENSION_TEXTURE2D(1L), D3D11_VPOV_DIMENSION_TEXTURE2DARRAY(2L);

    companion object {
        fun fromValue(v: Long): D3D11_VPOV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_VPOV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_CREATE_DEVICE_FLAG}
 */
enum class D3D11_CREATE_DEVICE_FLAG(val value: Long) {
    D3D11_CREATE_DEVICE_SINGLETHREADED(1L), D3D11_CREATE_DEVICE_DEBUG(2L), D3D11_CREATE_DEVICE_SWITCH_TO_REF(4L), D3D11_CREATE_DEVICE_PREVENT_INTERNAL_THREADING_OPTIMIZATIONS(8L), D3D11_CREATE_DEVICE_BGRA_SUPPORT(32L), D3D11_CREATE_DEVICE_DEBUGGABLE(64L), D3D11_CREATE_DEVICE_PREVENT_ALTERING_LAYER_SETTINGS_FROM_REGISTRY(128L), D3D11_CREATE_DEVICE_DISABLE_GPU_TIMEOUT(256L), D3D11_CREATE_DEVICE_VIDEO_SUPPORT(2048L);

    companion object {
        fun fromValue(v: Long): D3D11_CREATE_DEVICE_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_CREATE_DEVICE_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_RLDO_FLAGS}
 */
enum class D3D11_RLDO_FLAGS(val value: Long) {
    D3D11_RLDO_SUMMARY(1L), D3D11_RLDO_DETAIL(2L), D3D11_RLDO_IGNORE_INTERNAL(4L);

    companion object {
        fun fromValue(v: Long): D3D11_RLDO_FLAGS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_RLDO_FLAGS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_SHADER_TRACKING_RESOURCE_TYPE}
 */
enum class D3D11_SHADER_TRACKING_RESOURCE_TYPE(val value: Long) {
    D3D11_SHADER_TRACKING_RESOURCE_TYPE_NONE(0L), D3D11_SHADER_TRACKING_RESOURCE_TYPE_UAV_DEVICEMEMORY(1L), D3D11_SHADER_TRACKING_RESOURCE_TYPE_NON_UAV_DEVICEMEMORY(2L), D3D11_SHADER_TRACKING_RESOURCE_TYPE_ALL_DEVICEMEMORY(3L), D3D11_SHADER_TRACKING_RESOURCE_TYPE_GROUPSHARED_MEMORY(4L), D3D11_SHADER_TRACKING_RESOURCE_TYPE_ALL_SHARED_MEMORY(5L), D3D11_SHADER_TRACKING_RESOURCE_TYPE_GROUPSHARED_NON_UAV(6L), D3D11_SHADER_TRACKING_RESOURCE_TYPE_ALL(7L);

    companion object {
        fun fromValue(v: Long): D3D11_SHADER_TRACKING_RESOURCE_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_SHADER_TRACKING_RESOURCE_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_SHADER_TRACKING_OPTION}
 */
enum class D3D11_SHADER_TRACKING_OPTION(val value: Long) {
    D3D11_SHADER_TRACKING_OPTION_IGNORE(0L), D3D11_SHADER_TRACKING_OPTION_TRACK_UNINITIALIZED(1L), D3D11_SHADER_TRACKING_OPTION_TRACK_RAW(2L), D3D11_SHADER_TRACKING_OPTION_TRACK_WAR(4L), D3D11_SHADER_TRACKING_OPTION_TRACK_WAW(8L), D3D11_SHADER_TRACKING_OPTION_ALLOW_SAME(16L), D3D11_SHADER_TRACKING_OPTION_TRACK_ATOMIC_CONSISTENCY(32L), D3D11_SHADER_TRACKING_OPTION_TRACK_RAW_ACROSS_THREADGROUPS(64L), D3D11_SHADER_TRACKING_OPTION_TRACK_WAR_ACROSS_THREADGROUPS(128L), D3D11_SHADER_TRACKING_OPTION_TRACK_WAW_ACROSS_THREADGROUPS(256L), D3D11_SHADER_TRACKING_OPTION_TRACK_ATOMIC_CONSISTENCY_ACROSS_THREADGROUPS(512L), D3D11_SHADER_TRACKING_OPTION_UAV_SPECIFIC_FLAGS(960L), D3D11_SHADER_TRACKING_OPTION_ALL_HAZARDS(1006L), D3D11_SHADER_TRACKING_OPTION_ALL_HAZARDS_ALLOWING_SAME(1022L), D3D11_SHADER_TRACKING_OPTION_ALL_OPTIONS(1023L);

    companion object {
        fun fromValue(v: Long): D3D11_SHADER_TRACKING_OPTION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_SHADER_TRACKING_OPTION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_MESSAGE_CATEGORY}
 */
enum class D3D11_MESSAGE_CATEGORY(val value: Long) {
    D3D11_MESSAGE_CATEGORY_APPLICATION_DEFINED(0L), D3D11_MESSAGE_CATEGORY_MISCELLANEOUS(1L), D3D11_MESSAGE_CATEGORY_INITIALIZATION(2L), D3D11_MESSAGE_CATEGORY_CLEANUP(3L), D3D11_MESSAGE_CATEGORY_COMPILATION(4L), D3D11_MESSAGE_CATEGORY_STATE_CREATION(5L), D3D11_MESSAGE_CATEGORY_STATE_SETTING(6L), D3D11_MESSAGE_CATEGORY_STATE_GETTING(7L), D3D11_MESSAGE_CATEGORY_RESOURCE_MANIPULATION(8L), D3D11_MESSAGE_CATEGORY_EXECUTION(9L), D3D11_MESSAGE_CATEGORY_SHADER(10L);

    companion object {
        fun fromValue(v: Long): D3D11_MESSAGE_CATEGORY = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_MESSAGE_CATEGORY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_MESSAGE_SEVERITY}
 */
enum class D3D11_MESSAGE_SEVERITY(val value: Long) {
    D3D11_MESSAGE_SEVERITY_CORRUPTION(0L), D3D11_MESSAGE_SEVERITY_ERROR(1L), D3D11_MESSAGE_SEVERITY_WARNING(2L), D3D11_MESSAGE_SEVERITY_INFO(3L), D3D11_MESSAGE_SEVERITY_MESSAGE(4L);

    companion object {
        fun fromValue(v: Long): D3D11_MESSAGE_SEVERITY = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_MESSAGE_SEVERITY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D11_MESSAGE_ID}
 */
enum class D3D11_MESSAGE_ID(val value: Long) {
    D3D11_MESSAGE_ID_UNKNOWN(0L), D3D11_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_HAZARD(1L), D3D11_MESSAGE_ID_DEVICE_IASETINDEXBUFFER_HAZARD(2L), D3D11_MESSAGE_ID_DEVICE_VSSETSHADERRESOURCES_HAZARD(3L), D3D11_MESSAGE_ID_DEVICE_VSSETCONSTANTBUFFERS_HAZARD(4L), D3D11_MESSAGE_ID_DEVICE_GSSETSHADERRESOURCES_HAZARD(5L), D3D11_MESSAGE_ID_DEVICE_GSSETCONSTANTBUFFERS_HAZARD(6L), D3D11_MESSAGE_ID_DEVICE_PSSETSHADERRESOURCES_HAZARD(7L), D3D11_MESSAGE_ID_DEVICE_PSSETCONSTANTBUFFERS_HAZARD(8L), D3D11_MESSAGE_ID_DEVICE_OMSETRENDERTARGETS_HAZARD(9L), D3D11_MESSAGE_ID_DEVICE_SOSETTARGETS_HAZARD(10L), D3D11_MESSAGE_ID_STRING_FROM_APPLICATION(11L), D3D11_MESSAGE_ID_CORRUPTED_THIS(12L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER1(13L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER2(14L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER3(15L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER4(16L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER5(17L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER6(18L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER7(19L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER8(20L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER9(21L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER10(22L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER11(23L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER12(24L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER13(25L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER14(26L), D3D11_MESSAGE_ID_CORRUPTED_PARAMETER15(27L), D3D11_MESSAGE_ID_CORRUPTED_MULTITHREADING(28L), D3D11_MESSAGE_ID_MESSAGE_REPORTING_OUTOFMEMORY(29L), D3D11_MESSAGE_ID_IASETINPUTLAYOUT_UNBINDDELETINGOBJECT(30L), D3D11_MESSAGE_ID_IASETVERTEXBUFFERS_UNBINDDELETINGOBJECT(31L), D3D11_MESSAGE_ID_IASETINDEXBUFFER_UNBINDDELETINGOBJECT(32L), D3D11_MESSAGE_ID_VSSETSHADER_UNBINDDELETINGOBJECT(33L), D3D11_MESSAGE_ID_VSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(34L), D3D11_MESSAGE_ID_VSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(35L), D3D11_MESSAGE_ID_VSSETSAMPLERS_UNBINDDELETINGOBJECT(36L), D3D11_MESSAGE_ID_GSSETSHADER_UNBINDDELETINGOBJECT(37L), D3D11_MESSAGE_ID_GSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(38L), D3D11_MESSAGE_ID_GSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(39L), D3D11_MESSAGE_ID_GSSETSAMPLERS_UNBINDDELETINGOBJECT(40L), D3D11_MESSAGE_ID_SOSETTARGETS_UNBINDDELETINGOBJECT(41L), D3D11_MESSAGE_ID_PSSETSHADER_UNBINDDELETINGOBJECT(42L), D3D11_MESSAGE_ID_PSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(43L), D3D11_MESSAGE_ID_PSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(44L), D3D11_MESSAGE_ID_PSSETSAMPLERS_UNBINDDELETINGOBJECT(45L), D3D11_MESSAGE_ID_RSSETSTATE_UNBINDDELETINGOBJECT(46L), D3D11_MESSAGE_ID_OMSETBLENDSTATE_UNBINDDELETINGOBJECT(47L), D3D11_MESSAGE_ID_OMSETDEPTHSTENCILSTATE_UNBINDDELETINGOBJECT(48L), D3D11_MESSAGE_ID_OMSETRENDERTARGETS_UNBINDDELETINGOBJECT(49L), D3D11_MESSAGE_ID_SETPREDICATION_UNBINDDELETINGOBJECT(50L), D3D11_MESSAGE_ID_GETPRIVATEDATA_MOREDATA(51L), D3D11_MESSAGE_ID_SETPRIVATEDATA_INVALIDFREEDATA(52L), D3D11_MESSAGE_ID_SETPRIVATEDATA_INVALIDIUNKNOWN(53L), D3D11_MESSAGE_ID_SETPRIVATEDATA_INVALIDFLAGS(54L), D3D11_MESSAGE_ID_SETPRIVATEDATA_CHANGINGPARAMS(55L), D3D11_MESSAGE_ID_SETPRIVATEDATA_OUTOFMEMORY(56L), D3D11_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDFORMAT(57L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDSAMPLES(58L), D3D11_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDUSAGE(59L), D3D11_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDBINDFLAGS(60L), D3D11_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDCPUACCESSFLAGS(61L), D3D11_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDMISCFLAGS(62L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDCPUACCESSFLAGS(63L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDBINDFLAGS(64L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDINITIALDATA(65L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDDIMENSIONS(66L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDMIPLEVELS(67L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDMISCFLAGS(68L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDARG_RETURN(69L), D3D11_MESSAGE_ID_CREATEBUFFER_OUTOFMEMORY_RETURN(70L), D3D11_MESSAGE_ID_CREATEBUFFER_NULLDESC(71L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDCONSTANTBUFFERBINDINGS(72L), D3D11_MESSAGE_ID_CREATEBUFFER_LARGEALLOCATION(73L), D3D11_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDFORMAT(74L), D3D11_MESSAGE_ID_CREATETEXTURE1D_UNSUPPORTEDFORMAT(75L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDSAMPLES(76L), D3D11_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDUSAGE(77L), D3D11_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDBINDFLAGS(78L), D3D11_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDCPUACCESSFLAGS(79L), D3D11_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDMISCFLAGS(80L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDCPUACCESSFLAGS(81L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDBINDFLAGS(82L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDINITIALDATA(83L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDDIMENSIONS(84L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDMIPLEVELS(85L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDMISCFLAGS(86L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDARG_RETURN(87L), D3D11_MESSAGE_ID_CREATETEXTURE1D_OUTOFMEMORY_RETURN(88L), D3D11_MESSAGE_ID_CREATETEXTURE1D_NULLDESC(89L), D3D11_MESSAGE_ID_CREATETEXTURE1D_LARGEALLOCATION(90L), D3D11_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDFORMAT(91L), D3D11_MESSAGE_ID_CREATETEXTURE2D_UNSUPPORTEDFORMAT(92L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDSAMPLES(93L), D3D11_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDUSAGE(94L), D3D11_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDBINDFLAGS(95L), D3D11_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDCPUACCESSFLAGS(96L), D3D11_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDMISCFLAGS(97L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDCPUACCESSFLAGS(98L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDBINDFLAGS(99L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDINITIALDATA(100L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDDIMENSIONS(101L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDMIPLEVELS(102L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDMISCFLAGS(103L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDARG_RETURN(104L), D3D11_MESSAGE_ID_CREATETEXTURE2D_OUTOFMEMORY_RETURN(105L), D3D11_MESSAGE_ID_CREATETEXTURE2D_NULLDESC(106L), D3D11_MESSAGE_ID_CREATETEXTURE2D_LARGEALLOCATION(107L), D3D11_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDFORMAT(108L), D3D11_MESSAGE_ID_CREATETEXTURE3D_UNSUPPORTEDFORMAT(109L), D3D11_MESSAGE_ID_CREATETEXTURE3D_INVALIDSAMPLES(110L), D3D11_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDUSAGE(111L), D3D11_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDBINDFLAGS(112L), D3D11_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDCPUACCESSFLAGS(113L), D3D11_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDMISCFLAGS(114L), D3D11_MESSAGE_ID_CREATETEXTURE3D_INVALIDCPUACCESSFLAGS(115L), D3D11_MESSAGE_ID_CREATETEXTURE3D_INVALIDBINDFLAGS(116L), D3D11_MESSAGE_ID_CREATETEXTURE3D_INVALIDINITIALDATA(117L), D3D11_MESSAGE_ID_CREATETEXTURE3D_INVALIDDIMENSIONS(118L), D3D11_MESSAGE_ID_CREATETEXTURE3D_INVALIDMIPLEVELS(119L), D3D11_MESSAGE_ID_CREATETEXTURE3D_INVALIDMISCFLAGS(120L), D3D11_MESSAGE_ID_CREATETEXTURE3D_INVALIDARG_RETURN(121L), D3D11_MESSAGE_ID_CREATETEXTURE3D_OUTOFMEMORY_RETURN(122L), D3D11_MESSAGE_ID_CREATETEXTURE3D_NULLDESC(123L), D3D11_MESSAGE_ID_CREATETEXTURE3D_LARGEALLOCATION(124L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_UNRECOGNIZEDFORMAT(125L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDDESC(126L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDFORMAT(127L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDDIMENSIONS(128L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDRESOURCE(129L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_TOOMANYOBJECTS(130L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDARG_RETURN(131L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_OUTOFMEMORY_RETURN(132L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_UNRECOGNIZEDFORMAT(133L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_UNSUPPORTEDFORMAT(134L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDDESC(135L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDFORMAT(136L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDDIMENSIONS(137L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDRESOURCE(138L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_TOOMANYOBJECTS(139L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDARG_RETURN(140L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_OUTOFMEMORY_RETURN(141L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_UNRECOGNIZEDFORMAT(142L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDDESC(143L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDFORMAT(144L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDDIMENSIONS(145L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDRESOURCE(146L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_TOOMANYOBJECTS(147L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDARG_RETURN(148L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_OUTOFMEMORY_RETURN(149L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_OUTOFMEMORY(150L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_TOOMANYELEMENTS(151L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDFORMAT(152L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_INCOMPATIBLEFORMAT(153L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDSLOT(154L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDINPUTSLOTCLASS(155L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_STEPRATESLOTCLASSMISMATCH(156L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDSLOTCLASSCHANGE(157L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDSTEPRATECHANGE(158L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDALIGNMENT(159L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_DUPLICATESEMANTIC(160L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_UNPARSEABLEINPUTSIGNATURE(161L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_NULLSEMANTIC(162L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_MISSINGELEMENT(163L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_NULLDESC(164L), D3D11_MESSAGE_ID_CREATEVERTEXSHADER_OUTOFMEMORY(165L), D3D11_MESSAGE_ID_CREATEVERTEXSHADER_INVALIDSHADERBYTECODE(166L), D3D11_MESSAGE_ID_CREATEVERTEXSHADER_INVALIDSHADERTYPE(167L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADER_OUTOFMEMORY(168L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADER_INVALIDSHADERBYTECODE(169L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADER_INVALIDSHADERTYPE(170L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_OUTOFMEMORY(171L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDSHADERBYTECODE(172L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDSHADERTYPE(173L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDNUMENTRIES(174L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_OUTPUTSTREAMSTRIDEUNUSED(175L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_UNEXPECTEDDECL(176L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_EXPECTEDDECL(177L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_OUTPUTSLOT0EXPECTED(178L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDOUTPUTSLOT(179L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_ONLYONEELEMENTPERSLOT(180L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDCOMPONENTCOUNT(181L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDSTARTCOMPONENTANDCOMPONENTCOUNT(182L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDGAPDEFINITION(183L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_REPEATEDOUTPUT(184L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDOUTPUTSTREAMSTRIDE(185L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_MISSINGSEMANTIC(186L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_MASKMISMATCH(187L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_CANTHAVEONLYGAPS(188L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_DECLTOOCOMPLEX(189L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_MISSINGOUTPUTSIGNATURE(190L), D3D11_MESSAGE_ID_CREATEPIXELSHADER_OUTOFMEMORY(191L), D3D11_MESSAGE_ID_CREATEPIXELSHADER_INVALIDSHADERBYTECODE(192L), D3D11_MESSAGE_ID_CREATEPIXELSHADER_INVALIDSHADERTYPE(193L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDFILLMODE(194L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDCULLMODE(195L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDDEPTHBIASCLAMP(196L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDSLOPESCALEDDEPTHBIAS(197L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_TOOMANYOBJECTS(198L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_NULLDESC(199L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDDEPTHWRITEMASK(200L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDDEPTHFUNC(201L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDFRONTFACESTENCILFAILOP(202L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDFRONTFACESTENCILZFAILOP(203L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDFRONTFACESTENCILPASSOP(204L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDFRONTFACESTENCILFUNC(205L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDBACKFACESTENCILFAILOP(206L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDBACKFACESTENCILZFAILOP(207L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDBACKFACESTENCILPASSOP(208L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDBACKFACESTENCILFUNC(209L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_TOOMANYOBJECTS(210L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_NULLDESC(211L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_INVALIDSRCBLEND(212L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_INVALIDDESTBLEND(213L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_INVALIDBLENDOP(214L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_INVALIDSRCBLENDALPHA(215L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_INVALIDDESTBLENDALPHA(216L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_INVALIDBLENDOPALPHA(217L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_INVALIDRENDERTARGETWRITEMASK(218L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_TOOMANYOBJECTS(219L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_NULLDESC(220L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDFILTER(221L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDADDRESSU(222L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDADDRESSV(223L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDADDRESSW(224L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDMIPLODBIAS(225L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDMAXANISOTROPY(226L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDCOMPARISONFUNC(227L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDMINLOD(228L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDMAXLOD(229L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_TOOMANYOBJECTS(230L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_NULLDESC(231L), D3D11_MESSAGE_ID_CREATEQUERYORPREDICATE_INVALIDQUERY(232L), D3D11_MESSAGE_ID_CREATEQUERYORPREDICATE_INVALIDMISCFLAGS(233L), D3D11_MESSAGE_ID_CREATEQUERYORPREDICATE_UNEXPECTEDMISCFLAG(234L), D3D11_MESSAGE_ID_CREATEQUERYORPREDICATE_NULLDESC(235L), D3D11_MESSAGE_ID_DEVICE_IASETPRIMITIVETOPOLOGY_TOPOLOGY_UNRECOGNIZED(236L), D3D11_MESSAGE_ID_DEVICE_IASETPRIMITIVETOPOLOGY_TOPOLOGY_UNDEFINED(237L), D3D11_MESSAGE_ID_IASETVERTEXBUFFERS_INVALIDBUFFER(238L), D3D11_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_OFFSET_TOO_LARGE(239L), D3D11_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_BUFFERS_EMPTY(240L), D3D11_MESSAGE_ID_IASETINDEXBUFFER_INVALIDBUFFER(241L), D3D11_MESSAGE_ID_DEVICE_IASETINDEXBUFFER_FORMAT_INVALID(242L), D3D11_MESSAGE_ID_DEVICE_IASETINDEXBUFFER_OFFSET_TOO_LARGE(243L), D3D11_MESSAGE_ID_DEVICE_IASETINDEXBUFFER_OFFSET_UNALIGNED(244L), D3D11_MESSAGE_ID_DEVICE_VSSETSHADERRESOURCES_VIEWS_EMPTY(245L), D3D11_MESSAGE_ID_VSSETCONSTANTBUFFERS_INVALIDBUFFER(246L), D3D11_MESSAGE_ID_DEVICE_VSSETCONSTANTBUFFERS_BUFFERS_EMPTY(247L), D3D11_MESSAGE_ID_DEVICE_VSSETSAMPLERS_SAMPLERS_EMPTY(248L), D3D11_MESSAGE_ID_DEVICE_GSSETSHADERRESOURCES_VIEWS_EMPTY(249L), D3D11_MESSAGE_ID_GSSETCONSTANTBUFFERS_INVALIDBUFFER(250L), D3D11_MESSAGE_ID_DEVICE_GSSETCONSTANTBUFFERS_BUFFERS_EMPTY(251L), D3D11_MESSAGE_ID_DEVICE_GSSETSAMPLERS_SAMPLERS_EMPTY(252L), D3D11_MESSAGE_ID_SOSETTARGETS_INVALIDBUFFER(253L), D3D11_MESSAGE_ID_DEVICE_SOSETTARGETS_OFFSET_UNALIGNED(254L), D3D11_MESSAGE_ID_DEVICE_PSSETSHADERRESOURCES_VIEWS_EMPTY(255L), D3D11_MESSAGE_ID_PSSETCONSTANTBUFFERS_INVALIDBUFFER(256L), D3D11_MESSAGE_ID_DEVICE_PSSETCONSTANTBUFFERS_BUFFERS_EMPTY(257L), D3D11_MESSAGE_ID_DEVICE_PSSETSAMPLERS_SAMPLERS_EMPTY(258L), D3D11_MESSAGE_ID_DEVICE_RSSETVIEWPORTS_INVALIDVIEWPORT(259L), D3D11_MESSAGE_ID_DEVICE_RSSETSCISSORRECTS_INVALIDSCISSOR(260L), D3D11_MESSAGE_ID_CLEARRENDERTARGETVIEW_DENORMFLUSH(261L), D3D11_MESSAGE_ID_CLEARDEPTHSTENCILVIEW_DENORMFLUSH(262L), D3D11_MESSAGE_ID_CLEARDEPTHSTENCILVIEW_INVALID(263L), D3D11_MESSAGE_ID_DEVICE_IAGETVERTEXBUFFERS_BUFFERS_EMPTY(264L), D3D11_MESSAGE_ID_DEVICE_VSGETSHADERRESOURCES_VIEWS_EMPTY(265L), D3D11_MESSAGE_ID_DEVICE_VSGETCONSTANTBUFFERS_BUFFERS_EMPTY(266L), D3D11_MESSAGE_ID_DEVICE_VSGETSAMPLERS_SAMPLERS_EMPTY(267L), D3D11_MESSAGE_ID_DEVICE_GSGETSHADERRESOURCES_VIEWS_EMPTY(268L), D3D11_MESSAGE_ID_DEVICE_GSGETCONSTANTBUFFERS_BUFFERS_EMPTY(269L), D3D11_MESSAGE_ID_DEVICE_GSGETSAMPLERS_SAMPLERS_EMPTY(270L), D3D11_MESSAGE_ID_DEVICE_SOGETTARGETS_BUFFERS_EMPTY(271L), D3D11_MESSAGE_ID_DEVICE_PSGETSHADERRESOURCES_VIEWS_EMPTY(272L), D3D11_MESSAGE_ID_DEVICE_PSGETCONSTANTBUFFERS_BUFFERS_EMPTY(273L), D3D11_MESSAGE_ID_DEVICE_PSGETSAMPLERS_SAMPLERS_EMPTY(274L), D3D11_MESSAGE_ID_DEVICE_RSGETVIEWPORTS_VIEWPORTS_EMPTY(275L), D3D11_MESSAGE_ID_DEVICE_RSGETSCISSORRECTS_RECTS_EMPTY(276L), D3D11_MESSAGE_ID_DEVICE_GENERATEMIPS_RESOURCE_INVALID(277L), D3D11_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDDESTINATIONSUBRESOURCE(278L), D3D11_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDSOURCESUBRESOURCE(279L), D3D11_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDSOURCEBOX(280L), D3D11_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDSOURCE(281L), D3D11_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDDESTINATIONSTATE(282L), D3D11_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDSOURCESTATE(283L), D3D11_MESSAGE_ID_COPYRESOURCE_INVALIDSOURCE(284L), D3D11_MESSAGE_ID_COPYRESOURCE_INVALIDDESTINATIONSTATE(285L), D3D11_MESSAGE_ID_COPYRESOURCE_INVALIDSOURCESTATE(286L), D3D11_MESSAGE_ID_UPDATESUBRESOURCE_INVALIDDESTINATIONSUBRESOURCE(287L), D3D11_MESSAGE_ID_UPDATESUBRESOURCE_INVALIDDESTINATIONBOX(288L), D3D11_MESSAGE_ID_UPDATESUBRESOURCE_INVALIDDESTINATIONSTATE(289L), D3D11_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_DESTINATION_INVALID(290L), D3D11_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_DESTINATION_SUBRESOURCE_INVALID(291L), D3D11_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_SOURCE_INVALID(292L), D3D11_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_SOURCE_SUBRESOURCE_INVALID(293L), D3D11_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_FORMAT_INVALID(294L), D3D11_MESSAGE_ID_BUFFER_MAP_INVALIDMAPTYPE(295L), D3D11_MESSAGE_ID_BUFFER_MAP_INVALIDFLAGS(296L), D3D11_MESSAGE_ID_BUFFER_MAP_ALREADYMAPPED(297L), D3D11_MESSAGE_ID_BUFFER_MAP_DEVICEREMOVED_RETURN(298L), D3D11_MESSAGE_ID_BUFFER_UNMAP_NOTMAPPED(299L), D3D11_MESSAGE_ID_TEXTURE1D_MAP_INVALIDMAPTYPE(300L), D3D11_MESSAGE_ID_TEXTURE1D_MAP_INVALIDSUBRESOURCE(301L), D3D11_MESSAGE_ID_TEXTURE1D_MAP_INVALIDFLAGS(302L), D3D11_MESSAGE_ID_TEXTURE1D_MAP_ALREADYMAPPED(303L), D3D11_MESSAGE_ID_TEXTURE1D_MAP_DEVICEREMOVED_RETURN(304L), D3D11_MESSAGE_ID_TEXTURE1D_UNMAP_INVALIDSUBRESOURCE(305L), D3D11_MESSAGE_ID_TEXTURE1D_UNMAP_NOTMAPPED(306L), D3D11_MESSAGE_ID_TEXTURE2D_MAP_INVALIDMAPTYPE(307L), D3D11_MESSAGE_ID_TEXTURE2D_MAP_INVALIDSUBRESOURCE(308L), D3D11_MESSAGE_ID_TEXTURE2D_MAP_INVALIDFLAGS(309L), D3D11_MESSAGE_ID_TEXTURE2D_MAP_ALREADYMAPPED(310L), D3D11_MESSAGE_ID_TEXTURE2D_MAP_DEVICEREMOVED_RETURN(311L), D3D11_MESSAGE_ID_TEXTURE2D_UNMAP_INVALIDSUBRESOURCE(312L), D3D11_MESSAGE_ID_TEXTURE2D_UNMAP_NOTMAPPED(313L), D3D11_MESSAGE_ID_TEXTURE3D_MAP_INVALIDMAPTYPE(314L), D3D11_MESSAGE_ID_TEXTURE3D_MAP_INVALIDSUBRESOURCE(315L), D3D11_MESSAGE_ID_TEXTURE3D_MAP_INVALIDFLAGS(316L), D3D11_MESSAGE_ID_TEXTURE3D_MAP_ALREADYMAPPED(317L), D3D11_MESSAGE_ID_TEXTURE3D_MAP_DEVICEREMOVED_RETURN(318L), D3D11_MESSAGE_ID_TEXTURE3D_UNMAP_INVALIDSUBRESOURCE(319L), D3D11_MESSAGE_ID_TEXTURE3D_UNMAP_NOTMAPPED(320L), D3D11_MESSAGE_ID_CHECKFORMATSUPPORT_FORMAT_DEPRECATED(321L), D3D11_MESSAGE_ID_CHECKMULTISAMPLEQUALITYLEVELS_FORMAT_DEPRECATED(322L), D3D11_MESSAGE_ID_SETEXCEPTIONMODE_UNRECOGNIZEDFLAGS(323L), D3D11_MESSAGE_ID_SETEXCEPTIONMODE_INVALIDARG_RETURN(324L), D3D11_MESSAGE_ID_SETEXCEPTIONMODE_DEVICEREMOVED_RETURN(325L), D3D11_MESSAGE_ID_REF_SIMULATING_INFINITELY_FAST_HARDWARE(326L), D3D11_MESSAGE_ID_REF_THREADING_MODE(327L), D3D11_MESSAGE_ID_REF_UMDRIVER_EXCEPTION(328L), D3D11_MESSAGE_ID_REF_KMDRIVER_EXCEPTION(329L), D3D11_MESSAGE_ID_REF_HARDWARE_EXCEPTION(330L), D3D11_MESSAGE_ID_REF_ACCESSING_INDEXABLE_TEMP_OUT_OF_RANGE(331L), D3D11_MESSAGE_ID_REF_PROBLEM_PARSING_SHADER(332L), D3D11_MESSAGE_ID_REF_OUT_OF_MEMORY(333L), D3D11_MESSAGE_ID_REF_INFO(334L), D3D11_MESSAGE_ID_DEVICE_DRAW_VERTEXPOS_OVERFLOW(335L), D3D11_MESSAGE_ID_DEVICE_DRAWINDEXED_INDEXPOS_OVERFLOW(336L), D3D11_MESSAGE_ID_DEVICE_DRAWINSTANCED_VERTEXPOS_OVERFLOW(337L), D3D11_MESSAGE_ID_DEVICE_DRAWINSTANCED_INSTANCEPOS_OVERFLOW(338L), D3D11_MESSAGE_ID_DEVICE_DRAWINDEXEDINSTANCED_INSTANCEPOS_OVERFLOW(339L), D3D11_MESSAGE_ID_DEVICE_DRAWINDEXEDINSTANCED_INDEXPOS_OVERFLOW(340L), D3D11_MESSAGE_ID_DEVICE_DRAW_VERTEX_SHADER_NOT_SET(341L), D3D11_MESSAGE_ID_DEVICE_SHADER_LINKAGE_SEMANTICNAME_NOT_FOUND(342L), D3D11_MESSAGE_ID_DEVICE_SHADER_LINKAGE_REGISTERINDEX(343L), D3D11_MESSAGE_ID_DEVICE_SHADER_LINKAGE_COMPONENTTYPE(344L), D3D11_MESSAGE_ID_DEVICE_SHADER_LINKAGE_REGISTERMASK(345L), D3D11_MESSAGE_ID_DEVICE_SHADER_LINKAGE_SYSTEMVALUE(346L), D3D11_MESSAGE_ID_DEVICE_SHADER_LINKAGE_NEVERWRITTEN_ALWAYSREADS(347L), D3D11_MESSAGE_ID_DEVICE_DRAW_VERTEX_BUFFER_NOT_SET(348L), D3D11_MESSAGE_ID_DEVICE_DRAW_INPUTLAYOUT_NOT_SET(349L), D3D11_MESSAGE_ID_DEVICE_DRAW_CONSTANT_BUFFER_NOT_SET(350L), D3D11_MESSAGE_ID_DEVICE_DRAW_CONSTANT_BUFFER_TOO_SMALL(351L), D3D11_MESSAGE_ID_DEVICE_DRAW_SAMPLER_NOT_SET(352L), D3D11_MESSAGE_ID_DEVICE_DRAW_SHADERRESOURCEVIEW_NOT_SET(353L), D3D11_MESSAGE_ID_DEVICE_DRAW_VIEW_DIMENSION_MISMATCH(354L), D3D11_MESSAGE_ID_DEVICE_DRAW_VERTEX_BUFFER_STRIDE_TOO_SMALL(355L), D3D11_MESSAGE_ID_DEVICE_DRAW_VERTEX_BUFFER_TOO_SMALL(356L), D3D11_MESSAGE_ID_DEVICE_DRAW_INDEX_BUFFER_NOT_SET(357L), D3D11_MESSAGE_ID_DEVICE_DRAW_INDEX_BUFFER_FORMAT_INVALID(358L), D3D11_MESSAGE_ID_DEVICE_DRAW_INDEX_BUFFER_TOO_SMALL(359L), D3D11_MESSAGE_ID_DEVICE_DRAW_GS_INPUT_PRIMITIVE_MISMATCH(360L), D3D11_MESSAGE_ID_DEVICE_DRAW_RESOURCE_RETURN_TYPE_MISMATCH(361L), D3D11_MESSAGE_ID_DEVICE_DRAW_POSITION_NOT_PRESENT(362L), D3D11_MESSAGE_ID_DEVICE_DRAW_OUTPUT_STREAM_NOT_SET(363L), D3D11_MESSAGE_ID_DEVICE_DRAW_BOUND_RESOURCE_MAPPED(364L), D3D11_MESSAGE_ID_DEVICE_DRAW_INVALID_PRIMITIVETOPOLOGY(365L), D3D11_MESSAGE_ID_DEVICE_DRAW_VERTEX_OFFSET_UNALIGNED(366L), D3D11_MESSAGE_ID_DEVICE_DRAW_VERTEX_STRIDE_UNALIGNED(367L), D3D11_MESSAGE_ID_DEVICE_DRAW_INDEX_OFFSET_UNALIGNED(368L), D3D11_MESSAGE_ID_DEVICE_DRAW_OUTPUT_STREAM_OFFSET_UNALIGNED(369L), D3D11_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_LD_UNSUPPORTED(370L), D3D11_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_SAMPLE_UNSUPPORTED(371L), D3D11_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_SAMPLE_C_UNSUPPORTED(372L), D3D11_MESSAGE_ID_DEVICE_DRAW_RESOURCE_MULTISAMPLE_UNSUPPORTED(373L), D3D11_MESSAGE_ID_DEVICE_DRAW_SO_TARGETS_BOUND_WITHOUT_SOURCE(374L), D3D11_MESSAGE_ID_DEVICE_DRAW_SO_STRIDE_LARGER_THAN_BUFFER(375L), D3D11_MESSAGE_ID_DEVICE_DRAW_OM_RENDER_TARGET_DOES_NOT_SUPPORT_BLENDING(376L), D3D11_MESSAGE_ID_DEVICE_DRAW_OM_DUAL_SOURCE_BLENDING_CAN_ONLY_HAVE_RENDER_TARGET_0(377L), D3D11_MESSAGE_ID_DEVICE_REMOVAL_PROCESS_AT_FAULT(378L), D3D11_MESSAGE_ID_DEVICE_REMOVAL_PROCESS_POSSIBLY_AT_FAULT(379L), D3D11_MESSAGE_ID_DEVICE_REMOVAL_PROCESS_NOT_AT_FAULT(380L), D3D11_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE_INVALIDARG_RETURN(381L), D3D11_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE_OUTOFMEMORY_RETURN(382L), D3D11_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE_BADINTERFACE_RETURN(383L), D3D11_MESSAGE_ID_DEVICE_DRAW_VIEWPORT_NOT_SET(384L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_TRAILING_DIGIT_IN_SEMANTIC(385L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_TRAILING_DIGIT_IN_SEMANTIC(386L), D3D11_MESSAGE_ID_DEVICE_RSSETVIEWPORTS_DENORMFLUSH(387L), D3D11_MESSAGE_ID_OMSETRENDERTARGETS_INVALIDVIEW(388L), D3D11_MESSAGE_ID_DEVICE_SETTEXTFILTERSIZE_INVALIDDIMENSIONS(389L), D3D11_MESSAGE_ID_DEVICE_DRAW_SAMPLER_MISMATCH(390L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_TYPE_MISMATCH(391L), D3D11_MESSAGE_ID_BLENDSTATE_GETDESC_LEGACY(392L), D3D11_MESSAGE_ID_SHADERRESOURCEVIEW_GETDESC_LEGACY(393L), D3D11_MESSAGE_ID_CREATEQUERY_OUTOFMEMORY_RETURN(394L), D3D11_MESSAGE_ID_CREATEPREDICATE_OUTOFMEMORY_RETURN(395L), D3D11_MESSAGE_ID_CREATECOUNTER_OUTOFRANGE_COUNTER(396L), D3D11_MESSAGE_ID_CREATECOUNTER_SIMULTANEOUS_ACTIVE_COUNTERS_EXHAUSTED(397L), D3D11_MESSAGE_ID_CREATECOUNTER_UNSUPPORTED_WELLKNOWN_COUNTER(398L), D3D11_MESSAGE_ID_CREATECOUNTER_OUTOFMEMORY_RETURN(399L), D3D11_MESSAGE_ID_CREATECOUNTER_NONEXCLUSIVE_RETURN(400L), D3D11_MESSAGE_ID_CREATECOUNTER_NULLDESC(401L), D3D11_MESSAGE_ID_CHECKCOUNTER_OUTOFRANGE_COUNTER(402L), D3D11_MESSAGE_ID_CHECKCOUNTER_UNSUPPORTED_WELLKNOWN_COUNTER(403L), D3D11_MESSAGE_ID_SETPREDICATION_INVALID_PREDICATE_STATE(404L), D3D11_MESSAGE_ID_QUERY_BEGIN_UNSUPPORTED(405L), D3D11_MESSAGE_ID_PREDICATE_BEGIN_DURING_PREDICATION(406L), D3D11_MESSAGE_ID_QUERY_BEGIN_DUPLICATE(407L), D3D11_MESSAGE_ID_QUERY_BEGIN_ABANDONING_PREVIOUS_RESULTS(408L), D3D11_MESSAGE_ID_PREDICATE_END_DURING_PREDICATION(409L), D3D11_MESSAGE_ID_QUERY_END_ABANDONING_PREVIOUS_RESULTS(410L), D3D11_MESSAGE_ID_QUERY_END_WITHOUT_BEGIN(411L), D3D11_MESSAGE_ID_QUERY_GETDATA_INVALID_DATASIZE(412L), D3D11_MESSAGE_ID_QUERY_GETDATA_INVALID_FLAGS(413L), D3D11_MESSAGE_ID_QUERY_GETDATA_INVALID_CALL(414L), D3D11_MESSAGE_ID_DEVICE_DRAW_PS_OUTPUT_TYPE_MISMATCH(415L), D3D11_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_GATHER_UNSUPPORTED(416L), D3D11_MESSAGE_ID_DEVICE_DRAW_INVALID_USE_OF_CENTER_MULTISAMPLE_PATTERN(417L), D3D11_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_STRIDE_TOO_LARGE(418L), D3D11_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_INVALIDRANGE(419L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_EMPTY_LAYOUT(420L), D3D11_MESSAGE_ID_DEVICE_DRAW_RESOURCE_SAMPLE_COUNT_MISMATCH(421L), D3D11_MESSAGE_ID_LIVE_OBJECT_SUMMARY(422L), D3D11_MESSAGE_ID_LIVE_BUFFER(423L), D3D11_MESSAGE_ID_LIVE_TEXTURE1D(424L), D3D11_MESSAGE_ID_LIVE_TEXTURE2D(425L), D3D11_MESSAGE_ID_LIVE_TEXTURE3D(426L), D3D11_MESSAGE_ID_LIVE_SHADERRESOURCEVIEW(427L), D3D11_MESSAGE_ID_LIVE_RENDERTARGETVIEW(428L), D3D11_MESSAGE_ID_LIVE_DEPTHSTENCILVIEW(429L), D3D11_MESSAGE_ID_LIVE_VERTEXSHADER(430L), D3D11_MESSAGE_ID_LIVE_GEOMETRYSHADER(431L), D3D11_MESSAGE_ID_LIVE_PIXELSHADER(432L), D3D11_MESSAGE_ID_LIVE_INPUTLAYOUT(433L), D3D11_MESSAGE_ID_LIVE_SAMPLER(434L), D3D11_MESSAGE_ID_LIVE_BLENDSTATE(435L), D3D11_MESSAGE_ID_LIVE_DEPTHSTENCILSTATE(436L), D3D11_MESSAGE_ID_LIVE_RASTERIZERSTATE(437L), D3D11_MESSAGE_ID_LIVE_QUERY(438L), D3D11_MESSAGE_ID_LIVE_PREDICATE(439L), D3D11_MESSAGE_ID_LIVE_COUNTER(440L), D3D11_MESSAGE_ID_LIVE_DEVICE(441L), D3D11_MESSAGE_ID_LIVE_SWAPCHAIN(442L), D3D11_MESSAGE_ID_D3D10_MESSAGES_END(443L), D3D11_MESSAGE_ID_D3D10L9_MESSAGES_START(1048576L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_STENCIL_NO_TWO_SIDED(1048577L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_DepthBiasClamp_NOT_SUPPORTED(1048578L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_NO_COMPARISON_SUPPORT(1048579L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_EXCESSIVE_ANISOTROPY(1048580L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_BORDER_OUT_OF_RANGE(1048581L), D3D11_MESSAGE_ID_VSSETSAMPLERS_NOT_SUPPORTED(1048582L), D3D11_MESSAGE_ID_VSSETSAMPLERS_TOO_MANY_SAMPLERS(1048583L), D3D11_MESSAGE_ID_PSSETSAMPLERS_TOO_MANY_SAMPLERS(1048584L), D3D11_MESSAGE_ID_CREATERESOURCE_NO_ARRAYS(1048585L), D3D11_MESSAGE_ID_CREATERESOURCE_NO_VB_AND_IB_BIND(1048586L), D3D11_MESSAGE_ID_CREATERESOURCE_NO_TEXTURE_1D(1048587L), D3D11_MESSAGE_ID_CREATERESOURCE_DIMENSION_OUT_OF_RANGE(1048588L), D3D11_MESSAGE_ID_CREATERESOURCE_NOT_BINDABLE_AS_SHADER_RESOURCE(1048589L), D3D11_MESSAGE_ID_OMSETRENDERTARGETS_TOO_MANY_RENDER_TARGETS(1048590L), D3D11_MESSAGE_ID_OMSETRENDERTARGETS_NO_DIFFERING_BIT_DEPTHS(1048591L), D3D11_MESSAGE_ID_IASETVERTEXBUFFERS_BAD_BUFFER_INDEX(1048592L), D3D11_MESSAGE_ID_DEVICE_RSSETVIEWPORTS_TOO_MANY_VIEWPORTS(1048593L), D3D11_MESSAGE_ID_DEVICE_IASETPRIMITIVETOPOLOGY_ADJACENCY_UNSUPPORTED(1048594L), D3D11_MESSAGE_ID_DEVICE_RSSETSCISSORRECTS_TOO_MANY_SCISSORS(1048595L), D3D11_MESSAGE_ID_COPYRESOURCE_ONLY_TEXTURE_2D_WITHIN_GPU_MEMORY(1048596L), D3D11_MESSAGE_ID_COPYRESOURCE_NO_TEXTURE_3D_READBACK(1048597L), D3D11_MESSAGE_ID_COPYRESOURCE_NO_TEXTURE_ONLY_READBACK(1048598L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_UNSUPPORTED_FORMAT(1048599L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_NO_ALPHA_TO_COVERAGE(1048600L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_DepthClipEnable_MUST_BE_TRUE(1048601L), D3D11_MESSAGE_ID_DRAWINDEXED_STARTINDEXLOCATION_MUST_BE_POSITIVE(1048602L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_MUST_USE_LOWEST_LOD(1048603L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_MINLOD_MUST_NOT_BE_FRACTIONAL(1048604L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_MAXLOD_MUST_BE_FLT_MAX(1048605L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_FIRSTARRAYSLICE_MUST_BE_ZERO(1048606L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_CUBES_MUST_HAVE_6_SIDES(1048607L), D3D11_MESSAGE_ID_CREATERESOURCE_NOT_BINDABLE_AS_RENDER_TARGET(1048608L), D3D11_MESSAGE_ID_CREATERESOURCE_NO_DWORD_INDEX_BUFFER(1048609L), D3D11_MESSAGE_ID_CREATERESOURCE_MSAA_PRECLUDES_SHADER_RESOURCE(1048610L), D3D11_MESSAGE_ID_CREATERESOURCE_PRESENTATION_PRECLUDES_SHADER_RESOURCE(1048611L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_NO_INDEPENDENT_BLEND_ENABLE(1048612L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_NO_INDEPENDENT_WRITE_MASKS(1048613L), D3D11_MESSAGE_ID_CREATERESOURCE_NO_STREAM_OUT(1048614L), D3D11_MESSAGE_ID_CREATERESOURCE_ONLY_VB_IB_FOR_BUFFERS(1048615L), D3D11_MESSAGE_ID_CREATERESOURCE_NO_AUTOGEN_FOR_VOLUMES(1048616L), D3D11_MESSAGE_ID_CREATERESOURCE_DXGI_FORMAT_R8G8B8A8_CANNOT_BE_SHARED(1048617L), D3D11_MESSAGE_ID_VSSHADERRESOURCES_NOT_SUPPORTED(1048618L), D3D11_MESSAGE_ID_GEOMETRY_SHADER_NOT_SUPPORTED(1048619L), D3D11_MESSAGE_ID_STREAM_OUT_NOT_SUPPORTED(1048620L), D3D11_MESSAGE_ID_TEXT_FILTER_NOT_SUPPORTED(1048621L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_NO_SEPARATE_ALPHA_BLEND(1048622L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_NO_MRT_BLEND(1048623L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_OPERATION_NOT_SUPPORTED(1048624L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_NO_MIRRORONCE(1048625L), D3D11_MESSAGE_ID_DRAWINSTANCED_NOT_SUPPORTED(1048626L), D3D11_MESSAGE_ID_DRAWINDEXEDINSTANCED_NOT_SUPPORTED_BELOW_9_3(1048627L), D3D11_MESSAGE_ID_DRAWINDEXED_POINTLIST_UNSUPPORTED(1048628L), D3D11_MESSAGE_ID_SETBLENDSTATE_SAMPLE_MASK_CANNOT_BE_ZERO(1048629L), D3D11_MESSAGE_ID_CREATERESOURCE_DIMENSION_EXCEEDS_FEATURE_LEVEL_DEFINITION(1048630L), D3D11_MESSAGE_ID_CREATERESOURCE_ONLY_SINGLE_MIP_LEVEL_DEPTH_STENCIL_SUPPORTED(1048631L), D3D11_MESSAGE_ID_DEVICE_RSSETSCISSORRECTS_NEGATIVESCISSOR(1048632L), D3D11_MESSAGE_ID_SLOT_ZERO_MUST_BE_D3D10_INPUT_PER_VERTEX_DATA(1048633L), D3D11_MESSAGE_ID_CREATERESOURCE_NON_POW_2_MIPMAP(1048634L), D3D11_MESSAGE_ID_CREATESAMPLERSTATE_BORDER_NOT_SUPPORTED(1048635L), D3D11_MESSAGE_ID_OMSETRENDERTARGETS_NO_SRGB_MRT(1048636L), D3D11_MESSAGE_ID_COPYRESOURCE_NO_3D_MISMATCHED_UPDATES(1048637L), D3D11_MESSAGE_ID_D3D10L9_MESSAGES_END(1048638L), D3D11_MESSAGE_ID_D3D11_MESSAGES_START(2097152L), D3D11_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDFLAGS(2097153L), D3D11_MESSAGE_ID_CREATEVERTEXSHADER_INVALIDCLASSLINKAGE(2097154L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADER_INVALIDCLASSLINKAGE(2097155L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDNUMSTREAMS(2097156L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDSTREAMTORASTERIZER(2097157L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_UNEXPECTEDSTREAMS(2097158L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDCLASSLINKAGE(2097159L), D3D11_MESSAGE_ID_CREATEPIXELSHADER_INVALIDCLASSLINKAGE(2097160L), D3D11_MESSAGE_ID_CREATEDEFERREDCONTEXT_INVALID_COMMANDLISTFLAGS(2097161L), D3D11_MESSAGE_ID_CREATEDEFERREDCONTEXT_SINGLETHREADED(2097162L), D3D11_MESSAGE_ID_CREATEDEFERREDCONTEXT_INVALIDARG_RETURN(2097163L), D3D11_MESSAGE_ID_CREATEDEFERREDCONTEXT_INVALID_CALL_RETURN(2097164L), D3D11_MESSAGE_ID_CREATEDEFERREDCONTEXT_OUTOFMEMORY_RETURN(2097165L), D3D11_MESSAGE_ID_FINISHDISPLAYLIST_ONIMMEDIATECONTEXT(2097166L), D3D11_MESSAGE_ID_FINISHDISPLAYLIST_OUTOFMEMORY_RETURN(2097167L), D3D11_MESSAGE_ID_FINISHDISPLAYLIST_INVALID_CALL_RETURN(2097168L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDSTREAM(2097169L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_UNEXPECTEDENTRIES(2097170L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_UNEXPECTEDSTRIDES(2097171L), D3D11_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDNUMSTRIDES(2097172L), D3D11_MESSAGE_ID_DEVICE_HSSETSHADERRESOURCES_HAZARD(2097173L), D3D11_MESSAGE_ID_DEVICE_HSSETCONSTANTBUFFERS_HAZARD(2097174L), D3D11_MESSAGE_ID_HSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(2097175L), D3D11_MESSAGE_ID_HSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(2097176L), D3D11_MESSAGE_ID_CREATEHULLSHADER_INVALIDCALL(2097177L), D3D11_MESSAGE_ID_CREATEHULLSHADER_OUTOFMEMORY(2097178L), D3D11_MESSAGE_ID_CREATEHULLSHADER_INVALIDSHADERBYTECODE(2097179L), D3D11_MESSAGE_ID_CREATEHULLSHADER_INVALIDSHADERTYPE(2097180L), D3D11_MESSAGE_ID_CREATEHULLSHADER_INVALIDCLASSLINKAGE(2097181L), D3D11_MESSAGE_ID_DEVICE_HSSETSHADERRESOURCES_VIEWS_EMPTY(2097182L), D3D11_MESSAGE_ID_HSSETCONSTANTBUFFERS_INVALIDBUFFER(2097183L), D3D11_MESSAGE_ID_DEVICE_HSSETCONSTANTBUFFERS_BUFFERS_EMPTY(2097184L), D3D11_MESSAGE_ID_DEVICE_HSSETSAMPLERS_SAMPLERS_EMPTY(2097185L), D3D11_MESSAGE_ID_DEVICE_HSGETSHADERRESOURCES_VIEWS_EMPTY(2097186L), D3D11_MESSAGE_ID_DEVICE_HSGETCONSTANTBUFFERS_BUFFERS_EMPTY(2097187L), D3D11_MESSAGE_ID_DEVICE_HSGETSAMPLERS_SAMPLERS_EMPTY(2097188L), D3D11_MESSAGE_ID_DEVICE_DSSETSHADERRESOURCES_HAZARD(2097189L), D3D11_MESSAGE_ID_DEVICE_DSSETCONSTANTBUFFERS_HAZARD(2097190L), D3D11_MESSAGE_ID_DSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(2097191L), D3D11_MESSAGE_ID_DSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(2097192L), D3D11_MESSAGE_ID_CREATEDOMAINSHADER_INVALIDCALL(2097193L), D3D11_MESSAGE_ID_CREATEDOMAINSHADER_OUTOFMEMORY(2097194L), D3D11_MESSAGE_ID_CREATEDOMAINSHADER_INVALIDSHADERBYTECODE(2097195L), D3D11_MESSAGE_ID_CREATEDOMAINSHADER_INVALIDSHADERTYPE(2097196L), D3D11_MESSAGE_ID_CREATEDOMAINSHADER_INVALIDCLASSLINKAGE(2097197L), D3D11_MESSAGE_ID_DEVICE_DSSETSHADERRESOURCES_VIEWS_EMPTY(2097198L), D3D11_MESSAGE_ID_DSSETCONSTANTBUFFERS_INVALIDBUFFER(2097199L), D3D11_MESSAGE_ID_DEVICE_DSSETCONSTANTBUFFERS_BUFFERS_EMPTY(2097200L), D3D11_MESSAGE_ID_DEVICE_DSSETSAMPLERS_SAMPLERS_EMPTY(2097201L), D3D11_MESSAGE_ID_DEVICE_DSGETSHADERRESOURCES_VIEWS_EMPTY(2097202L), D3D11_MESSAGE_ID_DEVICE_DSGETCONSTANTBUFFERS_BUFFERS_EMPTY(2097203L), D3D11_MESSAGE_ID_DEVICE_DSGETSAMPLERS_SAMPLERS_EMPTY(2097204L), D3D11_MESSAGE_ID_DEVICE_DRAW_HS_XOR_DS_MISMATCH(2097205L), D3D11_MESSAGE_ID_DEFERRED_CONTEXT_REMOVAL_PROCESS_AT_FAULT(2097206L), D3D11_MESSAGE_ID_DEVICE_DRAWINDIRECT_INVALID_ARG_BUFFER(2097207L), D3D11_MESSAGE_ID_DEVICE_DRAWINDIRECT_OFFSET_UNALIGNED(2097208L), D3D11_MESSAGE_ID_DEVICE_DRAWINDIRECT_OFFSET_OVERFLOW(2097209L), D3D11_MESSAGE_ID_RESOURCE_MAP_INVALIDMAPTYPE(2097210L), D3D11_MESSAGE_ID_RESOURCE_MAP_INVALIDSUBRESOURCE(2097211L), D3D11_MESSAGE_ID_RESOURCE_MAP_INVALIDFLAGS(2097212L), D3D11_MESSAGE_ID_RESOURCE_MAP_ALREADYMAPPED(2097213L), D3D11_MESSAGE_ID_RESOURCE_MAP_DEVICEREMOVED_RETURN(2097214L), D3D11_MESSAGE_ID_RESOURCE_MAP_OUTOFMEMORY_RETURN(2097215L), D3D11_MESSAGE_ID_RESOURCE_MAP_WITHOUT_INITIAL_DISCARD(2097216L), D3D11_MESSAGE_ID_RESOURCE_UNMAP_INVALIDSUBRESOURCE(2097217L), D3D11_MESSAGE_ID_RESOURCE_UNMAP_NOTMAPPED(2097218L), D3D11_MESSAGE_ID_DEVICE_DRAW_RASTERIZING_CONTROL_POINTS(2097219L), D3D11_MESSAGE_ID_DEVICE_IASETPRIMITIVETOPOLOGY_TOPOLOGY_UNSUPPORTED(2097220L), D3D11_MESSAGE_ID_DEVICE_DRAW_HS_DS_SIGNATURE_MISMATCH(2097221L), D3D11_MESSAGE_ID_DEVICE_DRAW_HULL_SHADER_INPUT_TOPOLOGY_MISMATCH(2097222L), D3D11_MESSAGE_ID_DEVICE_DRAW_HS_DS_CONTROL_POINT_COUNT_MISMATCH(2097223L), D3D11_MESSAGE_ID_DEVICE_DRAW_HS_DS_TESSELLATOR_DOMAIN_MISMATCH(2097224L), D3D11_MESSAGE_ID_CREATE_CONTEXT(2097225L), D3D11_MESSAGE_ID_LIVE_CONTEXT(2097226L), D3D11_MESSAGE_ID_DESTROY_CONTEXT(2097227L), D3D11_MESSAGE_ID_CREATE_BUFFER(2097228L), D3D11_MESSAGE_ID_LIVE_BUFFER_WIN7(2097229L), D3D11_MESSAGE_ID_DESTROY_BUFFER(2097230L), D3D11_MESSAGE_ID_CREATE_TEXTURE1D(2097231L), D3D11_MESSAGE_ID_LIVE_TEXTURE1D_WIN7(2097232L), D3D11_MESSAGE_ID_DESTROY_TEXTURE1D(2097233L), D3D11_MESSAGE_ID_CREATE_TEXTURE2D(2097234L), D3D11_MESSAGE_ID_LIVE_TEXTURE2D_WIN7(2097235L), D3D11_MESSAGE_ID_DESTROY_TEXTURE2D(2097236L), D3D11_MESSAGE_ID_CREATE_TEXTURE3D(2097237L), D3D11_MESSAGE_ID_LIVE_TEXTURE3D_WIN7(2097238L), D3D11_MESSAGE_ID_DESTROY_TEXTURE3D(2097239L), D3D11_MESSAGE_ID_CREATE_SHADERRESOURCEVIEW(2097240L), D3D11_MESSAGE_ID_LIVE_SHADERRESOURCEVIEW_WIN7(2097241L), D3D11_MESSAGE_ID_DESTROY_SHADERRESOURCEVIEW(2097242L), D3D11_MESSAGE_ID_CREATE_RENDERTARGETVIEW(2097243L), D3D11_MESSAGE_ID_LIVE_RENDERTARGETVIEW_WIN7(2097244L), D3D11_MESSAGE_ID_DESTROY_RENDERTARGETVIEW(2097245L), D3D11_MESSAGE_ID_CREATE_DEPTHSTENCILVIEW(2097246L), D3D11_MESSAGE_ID_LIVE_DEPTHSTENCILVIEW_WIN7(2097247L), D3D11_MESSAGE_ID_DESTROY_DEPTHSTENCILVIEW(2097248L), D3D11_MESSAGE_ID_CREATE_VERTEXSHADER(2097249L), D3D11_MESSAGE_ID_LIVE_VERTEXSHADER_WIN7(2097250L), D3D11_MESSAGE_ID_DESTROY_VERTEXSHADER(2097251L), D3D11_MESSAGE_ID_CREATE_HULLSHADER(2097252L), D3D11_MESSAGE_ID_LIVE_HULLSHADER(2097253L), D3D11_MESSAGE_ID_DESTROY_HULLSHADER(2097254L), D3D11_MESSAGE_ID_CREATE_DOMAINSHADER(2097255L), D3D11_MESSAGE_ID_LIVE_DOMAINSHADER(2097256L), D3D11_MESSAGE_ID_DESTROY_DOMAINSHADER(2097257L), D3D11_MESSAGE_ID_CREATE_GEOMETRYSHADER(2097258L), D3D11_MESSAGE_ID_LIVE_GEOMETRYSHADER_WIN7(2097259L), D3D11_MESSAGE_ID_DESTROY_GEOMETRYSHADER(2097260L), D3D11_MESSAGE_ID_CREATE_PIXELSHADER(2097261L), D3D11_MESSAGE_ID_LIVE_PIXELSHADER_WIN7(2097262L), D3D11_MESSAGE_ID_DESTROY_PIXELSHADER(2097263L), D3D11_MESSAGE_ID_CREATE_INPUTLAYOUT(2097264L), D3D11_MESSAGE_ID_LIVE_INPUTLAYOUT_WIN7(2097265L), D3D11_MESSAGE_ID_DESTROY_INPUTLAYOUT(2097266L), D3D11_MESSAGE_ID_CREATE_SAMPLER(2097267L), D3D11_MESSAGE_ID_LIVE_SAMPLER_WIN7(2097268L), D3D11_MESSAGE_ID_DESTROY_SAMPLER(2097269L), D3D11_MESSAGE_ID_CREATE_BLENDSTATE(2097270L), D3D11_MESSAGE_ID_LIVE_BLENDSTATE_WIN7(2097271L), D3D11_MESSAGE_ID_DESTROY_BLENDSTATE(2097272L), D3D11_MESSAGE_ID_CREATE_DEPTHSTENCILSTATE(2097273L), D3D11_MESSAGE_ID_LIVE_DEPTHSTENCILSTATE_WIN7(2097274L), D3D11_MESSAGE_ID_DESTROY_DEPTHSTENCILSTATE(2097275L), D3D11_MESSAGE_ID_CREATE_RASTERIZERSTATE(2097276L), D3D11_MESSAGE_ID_LIVE_RASTERIZERSTATE_WIN7(2097277L), D3D11_MESSAGE_ID_DESTROY_RASTERIZERSTATE(2097278L), D3D11_MESSAGE_ID_CREATE_QUERY(2097279L), D3D11_MESSAGE_ID_LIVE_QUERY_WIN7(2097280L), D3D11_MESSAGE_ID_DESTROY_QUERY(2097281L), D3D11_MESSAGE_ID_CREATE_PREDICATE(2097282L), D3D11_MESSAGE_ID_LIVE_PREDICATE_WIN7(2097283L), D3D11_MESSAGE_ID_DESTROY_PREDICATE(2097284L), D3D11_MESSAGE_ID_CREATE_COUNTER(2097285L), D3D11_MESSAGE_ID_DESTROY_COUNTER(2097286L), D3D11_MESSAGE_ID_CREATE_COMMANDLIST(2097287L), D3D11_MESSAGE_ID_LIVE_COMMANDLIST(2097288L), D3D11_MESSAGE_ID_DESTROY_COMMANDLIST(2097289L), D3D11_MESSAGE_ID_CREATE_CLASSINSTANCE(2097290L), D3D11_MESSAGE_ID_LIVE_CLASSINSTANCE(2097291L), D3D11_MESSAGE_ID_DESTROY_CLASSINSTANCE(2097292L), D3D11_MESSAGE_ID_CREATE_CLASSLINKAGE(2097293L), D3D11_MESSAGE_ID_LIVE_CLASSLINKAGE(2097294L), D3D11_MESSAGE_ID_DESTROY_CLASSLINKAGE(2097295L), D3D11_MESSAGE_ID_LIVE_DEVICE_WIN7(2097296L), D3D11_MESSAGE_ID_LIVE_OBJECT_SUMMARY_WIN7(2097297L), D3D11_MESSAGE_ID_CREATE_COMPUTESHADER(2097298L), D3D11_MESSAGE_ID_LIVE_COMPUTESHADER(2097299L), D3D11_MESSAGE_ID_DESTROY_COMPUTESHADER(2097300L), D3D11_MESSAGE_ID_CREATE_UNORDEREDACCESSVIEW(2097301L), D3D11_MESSAGE_ID_LIVE_UNORDEREDACCESSVIEW(2097302L), D3D11_MESSAGE_ID_DESTROY_UNORDEREDACCESSVIEW(2097303L), D3D11_MESSAGE_ID_DEVICE_SETSHADER_INTERFACES_FEATURELEVEL(2097304L), D3D11_MESSAGE_ID_DEVICE_SETSHADER_INTERFACE_COUNT_MISMATCH(2097305L), D3D11_MESSAGE_ID_DEVICE_SETSHADER_INVALID_INSTANCE(2097306L), D3D11_MESSAGE_ID_DEVICE_SETSHADER_INVALID_INSTANCE_INDEX(2097307L), D3D11_MESSAGE_ID_DEVICE_SETSHADER_INVALID_INSTANCE_TYPE(2097308L), D3D11_MESSAGE_ID_DEVICE_SETSHADER_INVALID_INSTANCE_DATA(2097309L), D3D11_MESSAGE_ID_DEVICE_SETSHADER_UNBOUND_INSTANCE_DATA(2097310L), D3D11_MESSAGE_ID_DEVICE_SETSHADER_INSTANCE_DATA_BINDINGS(2097311L), D3D11_MESSAGE_ID_DEVICE_CREATESHADER_CLASSLINKAGE_FULL(2097312L), D3D11_MESSAGE_ID_DEVICE_CHECKFEATURESUPPORT_UNRECOGNIZED_FEATURE(2097313L), D3D11_MESSAGE_ID_DEVICE_CHECKFEATURESUPPORT_MISMATCHED_DATA_SIZE(2097314L), D3D11_MESSAGE_ID_DEVICE_CHECKFEATURESUPPORT_INVALIDARG_RETURN(2097315L), D3D11_MESSAGE_ID_DEVICE_CSSETSHADERRESOURCES_HAZARD(2097316L), D3D11_MESSAGE_ID_DEVICE_CSSETCONSTANTBUFFERS_HAZARD(2097317L), D3D11_MESSAGE_ID_CSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(2097318L), D3D11_MESSAGE_ID_CSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(2097319L), D3D11_MESSAGE_ID_CREATECOMPUTESHADER_INVALIDCALL(2097320L), D3D11_MESSAGE_ID_CREATECOMPUTESHADER_OUTOFMEMORY(2097321L), D3D11_MESSAGE_ID_CREATECOMPUTESHADER_INVALIDSHADERBYTECODE(2097322L), D3D11_MESSAGE_ID_CREATECOMPUTESHADER_INVALIDSHADERTYPE(2097323L), D3D11_MESSAGE_ID_CREATECOMPUTESHADER_INVALIDCLASSLINKAGE(2097324L), D3D11_MESSAGE_ID_DEVICE_CSSETSHADERRESOURCES_VIEWS_EMPTY(2097325L), D3D11_MESSAGE_ID_CSSETCONSTANTBUFFERS_INVALIDBUFFER(2097326L), D3D11_MESSAGE_ID_DEVICE_CSSETCONSTANTBUFFERS_BUFFERS_EMPTY(2097327L), D3D11_MESSAGE_ID_DEVICE_CSSETSAMPLERS_SAMPLERS_EMPTY(2097328L), D3D11_MESSAGE_ID_DEVICE_CSGETSHADERRESOURCES_VIEWS_EMPTY(2097329L), D3D11_MESSAGE_ID_DEVICE_CSGETCONSTANTBUFFERS_BUFFERS_EMPTY(2097330L), D3D11_MESSAGE_ID_DEVICE_CSGETSAMPLERS_SAMPLERS_EMPTY(2097331L), D3D11_MESSAGE_ID_DEVICE_CREATEVERTEXSHADER_DOUBLEFLOATOPSNOTSUPPORTED(2097332L), D3D11_MESSAGE_ID_DEVICE_CREATEHULLSHADER_DOUBLEFLOATOPSNOTSUPPORTED(2097333L), D3D11_MESSAGE_ID_DEVICE_CREATEDOMAINSHADER_DOUBLEFLOATOPSNOTSUPPORTED(2097334L), D3D11_MESSAGE_ID_DEVICE_CREATEGEOMETRYSHADER_DOUBLEFLOATOPSNOTSUPPORTED(2097335L), D3D11_MESSAGE_ID_DEVICE_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_DOUBLEFLOATOPSNOTSUPPORTED(2097336L), D3D11_MESSAGE_ID_DEVICE_CREATEPIXELSHADER_DOUBLEFLOATOPSNOTSUPPORTED(2097337L), D3D11_MESSAGE_ID_DEVICE_CREATECOMPUTESHADER_DOUBLEFLOATOPSNOTSUPPORTED(2097338L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDSTRUCTURESTRIDE(2097339L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDFLAGS(2097340L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDRESOURCE(2097341L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDDESC(2097342L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDFORMAT(2097343L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDDIMENSIONS(2097344L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_UNRECOGNIZEDFORMAT(2097345L), D3D11_MESSAGE_ID_DEVICE_OMSETRENDERTARGETSANDUNORDEREDACCESSVIEWS_HAZARD(2097346L), D3D11_MESSAGE_ID_DEVICE_OMSETRENDERTARGETSANDUNORDEREDACCESSVIEWS_OVERLAPPING_OLD_SLOTS(2097347L), D3D11_MESSAGE_ID_DEVICE_OMSETRENDERTARGETSANDUNORDEREDACCESSVIEWS_NO_OP(2097348L), D3D11_MESSAGE_ID_CSSETUNORDEREDACCESSVIEWS_UNBINDDELETINGOBJECT(2097349L), D3D11_MESSAGE_ID_PSSETUNORDEREDACCESSVIEWS_UNBINDDELETINGOBJECT(2097350L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDARG_RETURN(2097351L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_OUTOFMEMORY_RETURN(2097352L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_TOOMANYOBJECTS(2097353L), D3D11_MESSAGE_ID_DEVICE_CSSETUNORDEREDACCESSVIEWS_HAZARD(2097354L), D3D11_MESSAGE_ID_CLEARUNORDEREDACCESSVIEW_DENORMFLUSH(2097355L), D3D11_MESSAGE_ID_DEVICE_CSSETUNORDEREDACCESSS_VIEWS_EMPTY(2097356L), D3D11_MESSAGE_ID_DEVICE_CSGETUNORDEREDACCESSS_VIEWS_EMPTY(2097357L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDFLAGS(2097358L), D3D11_MESSAGE_ID_CREATESHADERRESESOURCEVIEW_TOOMANYOBJECTS(2097359L), D3D11_MESSAGE_ID_DEVICE_DISPATCHINDIRECT_INVALID_ARG_BUFFER(2097360L), D3D11_MESSAGE_ID_DEVICE_DISPATCHINDIRECT_OFFSET_UNALIGNED(2097361L), D3D11_MESSAGE_ID_DEVICE_DISPATCHINDIRECT_OFFSET_OVERFLOW(2097362L), D3D11_MESSAGE_ID_DEVICE_SETRESOURCEMINLOD_INVALIDCONTEXT(2097363L), D3D11_MESSAGE_ID_DEVICE_SETRESOURCEMINLOD_INVALIDRESOURCE(2097364L), D3D11_MESSAGE_ID_DEVICE_SETRESOURCEMINLOD_INVALIDMINLOD(2097365L), D3D11_MESSAGE_ID_DEVICE_GETRESOURCEMINLOD_INVALIDCONTEXT(2097366L), D3D11_MESSAGE_ID_DEVICE_GETRESOURCEMINLOD_INVALIDRESOURCE(2097367L), D3D11_MESSAGE_ID_OMSETDEPTHSTENCIL_UNBINDDELETINGOBJECT(2097368L), D3D11_MESSAGE_ID_CLEARDEPTHSTENCILVIEW_DEPTH_READONLY(2097369L), D3D11_MESSAGE_ID_CLEARDEPTHSTENCILVIEW_STENCIL_READONLY(2097370L), D3D11_MESSAGE_ID_CHECKFEATURESUPPORT_FORMAT_DEPRECATED(2097371L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_RETURN_TYPE_MISMATCH(2097372L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_NOT_SET(2097373L), D3D11_MESSAGE_ID_DEVICE_DRAW_UNORDEREDACCESSVIEW_RENDERTARGETVIEW_OVERLAP(2097374L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_DIMENSION_MISMATCH(2097375L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_APPEND_UNSUPPORTED(2097376L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_ATOMICS_UNSUPPORTED(2097377L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_STRUCTURE_STRIDE_MISMATCH(2097378L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_BUFFER_TYPE_MISMATCH(2097379L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_RAW_UNSUPPORTED(2097380L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_FORMAT_LD_UNSUPPORTED(2097381L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_FORMAT_STORE_UNSUPPORTED(2097382L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_ATOMIC_ADD_UNSUPPORTED(2097383L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_ATOMIC_BITWISE_OPS_UNSUPPORTED(2097384L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_ATOMIC_CMPSTORE_CMPEXCHANGE_UNSUPPORTED(2097385L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_ATOMIC_EXCHANGE_UNSUPPORTED(2097386L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_ATOMIC_SIGNED_MINMAX_UNSUPPORTED(2097387L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_ATOMIC_UNSIGNED_MINMAX_UNSUPPORTED(2097388L), D3D11_MESSAGE_ID_DEVICE_DISPATCH_BOUND_RESOURCE_MAPPED(2097389L), D3D11_MESSAGE_ID_DEVICE_DISPATCH_THREADGROUPCOUNT_OVERFLOW(2097390L), D3D11_MESSAGE_ID_DEVICE_DISPATCH_THREADGROUPCOUNT_ZERO(2097391L), D3D11_MESSAGE_ID_DEVICE_SHADERRESOURCEVIEW_STRUCTURE_STRIDE_MISMATCH(2097392L), D3D11_MESSAGE_ID_DEVICE_SHADERRESOURCEVIEW_BUFFER_TYPE_MISMATCH(2097393L), D3D11_MESSAGE_ID_DEVICE_SHADERRESOURCEVIEW_RAW_UNSUPPORTED(2097394L), D3D11_MESSAGE_ID_DEVICE_DISPATCH_UNSUPPORTED(2097395L), D3D11_MESSAGE_ID_DEVICE_DISPATCHINDIRECT_UNSUPPORTED(2097396L), D3D11_MESSAGE_ID_COPYSTRUCTURECOUNT_INVALIDOFFSET(2097397L), D3D11_MESSAGE_ID_COPYSTRUCTURECOUNT_LARGEOFFSET(2097398L), D3D11_MESSAGE_ID_COPYSTRUCTURECOUNT_INVALIDDESTINATIONSTATE(2097399L), D3D11_MESSAGE_ID_COPYSTRUCTURECOUNT_INVALIDSOURCESTATE(2097400L), D3D11_MESSAGE_ID_CHECKFORMATSUPPORT_FORMAT_NOT_SUPPORTED(2097401L), D3D11_MESSAGE_ID_DEVICE_CSSETUNORDEREDACCESSVIEWS_INVALIDVIEW(2097402L), D3D11_MESSAGE_ID_DEVICE_CSSETUNORDEREDACCESSVIEWS_INVALIDOFFSET(2097403L), D3D11_MESSAGE_ID_DEVICE_CSSETUNORDEREDACCESSVIEWS_TOOMANYVIEWS(2097404L), D3D11_MESSAGE_ID_CLEARUNORDEREDACCESSVIEWFLOAT_INVALIDFORMAT(2097405L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_COUNTER_UNSUPPORTED(2097406L), D3D11_MESSAGE_ID_REF_WARNING(2097407L), D3D11_MESSAGE_ID_DEVICE_DRAW_PIXEL_SHADER_WITHOUT_RTV_OR_DSV(2097408L), D3D11_MESSAGE_ID_SHADER_ABORT(2097409L), D3D11_MESSAGE_ID_SHADER_MESSAGE(2097410L), D3D11_MESSAGE_ID_SHADER_ERROR(2097411L), D3D11_MESSAGE_ID_OFFERRESOURCES_INVALIDRESOURCE(2097412L), D3D11_MESSAGE_ID_HSSETSAMPLERS_UNBINDDELETINGOBJECT(2097413L), D3D11_MESSAGE_ID_DSSETSAMPLERS_UNBINDDELETINGOBJECT(2097414L), D3D11_MESSAGE_ID_CSSETSAMPLERS_UNBINDDELETINGOBJECT(2097415L), D3D11_MESSAGE_ID_HSSETSHADER_UNBINDDELETINGOBJECT(2097416L), D3D11_MESSAGE_ID_DSSETSHADER_UNBINDDELETINGOBJECT(2097417L), D3D11_MESSAGE_ID_CSSETSHADER_UNBINDDELETINGOBJECT(2097418L), D3D11_MESSAGE_ID_ENQUEUESETEVENT_INVALIDARG_RETURN(2097419L), D3D11_MESSAGE_ID_ENQUEUESETEVENT_OUTOFMEMORY_RETURN(2097420L), D3D11_MESSAGE_ID_ENQUEUESETEVENT_ACCESSDENIED_RETURN(2097421L), D3D11_MESSAGE_ID_DEVICE_OMSETRENDERTARGETSANDUNORDEREDACCESSVIEWS_NUMUAVS_INVALIDRANGE(2097422L), D3D11_MESSAGE_ID_USE_OF_ZERO_REFCOUNT_OBJECT(2097423L), D3D11_MESSAGE_ID_D3D11_MESSAGES_END(2097424L), D3D11_MESSAGE_ID_D3D11_1_MESSAGES_START(3145728L), D3D11_MESSAGE_ID_CREATE_VIDEODECODER(3145729L), D3D11_MESSAGE_ID_CREATE_VIDEOPROCESSORENUM(3145730L), D3D11_MESSAGE_ID_CREATE_VIDEOPROCESSOR(3145731L), D3D11_MESSAGE_ID_CREATE_DECODEROUTPUTVIEW(3145732L), D3D11_MESSAGE_ID_CREATE_PROCESSORINPUTVIEW(3145733L), D3D11_MESSAGE_ID_CREATE_PROCESSOROUTPUTVIEW(3145734L), D3D11_MESSAGE_ID_CREATE_DEVICECONTEXTSTATE(3145735L), D3D11_MESSAGE_ID_LIVE_VIDEODECODER(3145736L), D3D11_MESSAGE_ID_LIVE_VIDEOPROCESSORENUM(3145737L), D3D11_MESSAGE_ID_LIVE_VIDEOPROCESSOR(3145738L), D3D11_MESSAGE_ID_LIVE_DECODEROUTPUTVIEW(3145739L), D3D11_MESSAGE_ID_LIVE_PROCESSORINPUTVIEW(3145740L), D3D11_MESSAGE_ID_LIVE_PROCESSOROUTPUTVIEW(3145741L), D3D11_MESSAGE_ID_LIVE_DEVICECONTEXTSTATE(3145742L), D3D11_MESSAGE_ID_DESTROY_VIDEODECODER(3145743L), D3D11_MESSAGE_ID_DESTROY_VIDEOPROCESSORENUM(3145744L), D3D11_MESSAGE_ID_DESTROY_VIDEOPROCESSOR(3145745L), D3D11_MESSAGE_ID_DESTROY_DECODEROUTPUTVIEW(3145746L), D3D11_MESSAGE_ID_DESTROY_PROCESSORINPUTVIEW(3145747L), D3D11_MESSAGE_ID_DESTROY_PROCESSOROUTPUTVIEW(3145748L), D3D11_MESSAGE_ID_DESTROY_DEVICECONTEXTSTATE(3145749L), D3D11_MESSAGE_ID_CREATEDEVICECONTEXTSTATE_INVALIDFLAGS(3145750L), D3D11_MESSAGE_ID_CREATEDEVICECONTEXTSTATE_INVALIDFEATURELEVEL(3145751L), D3D11_MESSAGE_ID_CREATEDEVICECONTEXTSTATE_FEATURELEVELS_NOT_SUPPORTED(3145752L), D3D11_MESSAGE_ID_CREATEDEVICECONTEXTSTATE_INVALIDREFIID(3145753L), D3D11_MESSAGE_ID_DEVICE_DISCARDVIEW_INVALIDVIEW(3145754L), D3D11_MESSAGE_ID_COPYSUBRESOURCEREGION1_INVALIDCOPYFLAGS(3145755L), D3D11_MESSAGE_ID_UPDATESUBRESOURCE1_INVALIDCOPYFLAGS(3145756L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDFORCEDSAMPLECOUNT(3145757L), D3D11_MESSAGE_ID_CREATEVIDEODECODER_OUTOFMEMORY_RETURN(3145758L), D3D11_MESSAGE_ID_CREATEVIDEODECODER_NULLPARAM(3145759L), D3D11_MESSAGE_ID_CREATEVIDEODECODER_INVALIDFORMAT(3145760L), D3D11_MESSAGE_ID_CREATEVIDEODECODER_ZEROWIDTHHEIGHT(3145761L), D3D11_MESSAGE_ID_CREATEVIDEODECODER_DRIVER_INVALIDBUFFERSIZE(3145762L), D3D11_MESSAGE_ID_CREATEVIDEODECODER_DRIVER_INVALIDBUFFERUSAGE(3145763L), D3D11_MESSAGE_ID_GETVIDEODECODERPROFILECOUNT_OUTOFMEMORY(3145764L), D3D11_MESSAGE_ID_GETVIDEODECODERPROFILE_NULLPARAM(3145765L), D3D11_MESSAGE_ID_GETVIDEODECODERPROFILE_INVALIDINDEX(3145766L), D3D11_MESSAGE_ID_GETVIDEODECODERPROFILE_OUTOFMEMORY_RETURN(3145767L), D3D11_MESSAGE_ID_CHECKVIDEODECODERFORMAT_NULLPARAM(3145768L), D3D11_MESSAGE_ID_CHECKVIDEODECODERFORMAT_OUTOFMEMORY_RETURN(3145769L), D3D11_MESSAGE_ID_GETVIDEODECODERCONFIGCOUNT_NULLPARAM(3145770L), D3D11_MESSAGE_ID_GETVIDEODECODERCONFIGCOUNT_OUTOFMEMORY_RETURN(3145771L), D3D11_MESSAGE_ID_GETVIDEODECODERCONFIG_NULLPARAM(3145772L), D3D11_MESSAGE_ID_GETVIDEODECODERCONFIG_INVALIDINDEX(3145773L), D3D11_MESSAGE_ID_GETVIDEODECODERCONFIG_OUTOFMEMORY_RETURN(3145774L), D3D11_MESSAGE_ID_GETDECODERCREATIONPARAMS_NULLPARAM(3145775L), D3D11_MESSAGE_ID_GETDECODERDRIVERHANDLE_NULLPARAM(3145776L), D3D11_MESSAGE_ID_GETDECODERBUFFER_NULLPARAM(3145777L), D3D11_MESSAGE_ID_GETDECODERBUFFER_INVALIDBUFFER(3145778L), D3D11_MESSAGE_ID_GETDECODERBUFFER_INVALIDTYPE(3145779L), D3D11_MESSAGE_ID_GETDECODERBUFFER_LOCKED(3145780L), D3D11_MESSAGE_ID_RELEASEDECODERBUFFER_NULLPARAM(3145781L), D3D11_MESSAGE_ID_RELEASEDECODERBUFFER_INVALIDTYPE(3145782L), D3D11_MESSAGE_ID_RELEASEDECODERBUFFER_NOTLOCKED(3145783L), D3D11_MESSAGE_ID_DECODERBEGINFRAME_NULLPARAM(3145784L), D3D11_MESSAGE_ID_DECODERBEGINFRAME_HAZARD(3145785L), D3D11_MESSAGE_ID_DECODERENDFRAME_NULLPARAM(3145786L), D3D11_MESSAGE_ID_SUBMITDECODERBUFFERS_NULLPARAM(3145787L), D3D11_MESSAGE_ID_SUBMITDECODERBUFFERS_INVALIDTYPE(3145788L), D3D11_MESSAGE_ID_DECODEREXTENSION_NULLPARAM(3145789L), D3D11_MESSAGE_ID_DECODEREXTENSION_INVALIDRESOURCE(3145790L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORENUMERATOR_OUTOFMEMORY_RETURN(3145791L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORENUMERATOR_NULLPARAM(3145792L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORENUMERATOR_INVALIDFRAMEFORMAT(3145793L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORENUMERATOR_INVALIDUSAGE(3145794L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORENUMERATOR_INVALIDINPUTFRAMERATE(3145795L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORENUMERATOR_INVALIDOUTPUTFRAMERATE(3145796L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORENUMERATOR_INVALIDWIDTHHEIGHT(3145797L), D3D11_MESSAGE_ID_GETVIDEOPROCESSORCONTENTDESC_NULLPARAM(3145798L), D3D11_MESSAGE_ID_CHECKVIDEOPROCESSORFORMAT_NULLPARAM(3145799L), D3D11_MESSAGE_ID_GETVIDEOPROCESSORCAPS_NULLPARAM(3145800L), D3D11_MESSAGE_ID_GETVIDEOPROCESSORRATECONVERSIONCAPS_NULLPARAM(3145801L), D3D11_MESSAGE_ID_GETVIDEOPROCESSORRATECONVERSIONCAPS_INVALIDINDEX(3145802L), D3D11_MESSAGE_ID_GETVIDEOPROCESSORCUSTOMRATE_NULLPARAM(3145803L), D3D11_MESSAGE_ID_GETVIDEOPROCESSORCUSTOMRATE_INVALIDINDEX(3145804L), D3D11_MESSAGE_ID_GETVIDEOPROCESSORFILTERRANGE_NULLPARAM(3145805L), D3D11_MESSAGE_ID_GETVIDEOPROCESSORFILTERRANGE_UNSUPPORTED(3145806L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOR_OUTOFMEMORY_RETURN(3145807L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOR_NULLPARAM(3145808L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTTARGETRECT_NULLPARAM(3145809L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTBACKGROUNDCOLOR_NULLPARAM(3145810L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTBACKGROUNDCOLOR_INVALIDALPHA(3145811L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTCOLORSPACE_NULLPARAM(3145812L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTALPHAFILLMODE_NULLPARAM(3145813L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTALPHAFILLMODE_UNSUPPORTED(3145814L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTALPHAFILLMODE_INVALIDSTREAM(3145815L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTALPHAFILLMODE_INVALIDFILLMODE(3145816L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTCONSTRICTION_NULLPARAM(3145817L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTSTEREOMODE_NULLPARAM(3145818L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTSTEREOMODE_UNSUPPORTED(3145819L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTEXTENSION_NULLPARAM(3145820L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTTARGETRECT_NULLPARAM(3145821L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTBACKGROUNDCOLOR_NULLPARAM(3145822L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTCOLORSPACE_NULLPARAM(3145823L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTALPHAFILLMODE_NULLPARAM(3145824L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTCONSTRICTION_NULLPARAM(3145825L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTCONSTRICTION_UNSUPPORTED(3145826L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTCONSTRICTION_INVALIDSIZE(3145827L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTSTEREOMODE_NULLPARAM(3145828L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTEXTENSION_NULLPARAM(3145829L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMFRAMEFORMAT_NULLPARAM(3145830L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMFRAMEFORMAT_INVALIDFORMAT(3145831L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMFRAMEFORMAT_INVALIDSTREAM(3145832L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMCOLORSPACE_NULLPARAM(3145833L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMCOLORSPACE_INVALIDSTREAM(3145834L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMOUTPUTRATE_NULLPARAM(3145835L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMOUTPUTRATE_INVALIDRATE(3145836L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMOUTPUTRATE_INVALIDFLAG(3145837L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMOUTPUTRATE_INVALIDSTREAM(3145838L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSOURCERECT_NULLPARAM(3145839L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSOURCERECT_INVALIDSTREAM(3145840L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSOURCERECT_INVALIDRECT(3145841L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMDESTRECT_NULLPARAM(3145842L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMDESTRECT_INVALIDSTREAM(3145843L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMDESTRECT_INVALIDRECT(3145844L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMALPHA_NULLPARAM(3145845L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMALPHA_INVALIDSTREAM(3145846L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMALPHA_INVALIDALPHA(3145847L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMPALETTE_NULLPARAM(3145848L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMPALETTE_INVALIDSTREAM(3145849L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMPALETTE_INVALIDCOUNT(3145850L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMPALETTE_INVALIDALPHA(3145851L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMPIXELASPECTRATIO_NULLPARAM(3145852L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMPIXELASPECTRATIO_INVALIDSTREAM(3145853L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMPIXELASPECTRATIO_INVALIDRATIO(3145854L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMLUMAKEY_NULLPARAM(3145855L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMLUMAKEY_INVALIDSTREAM(3145856L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMLUMAKEY_INVALIDRANGE(3145857L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMLUMAKEY_UNSUPPORTED(3145858L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSTEREOFORMAT_NULLPARAM(3145859L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSTEREOFORMAT_INVALIDSTREAM(3145860L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSTEREOFORMAT_UNSUPPORTED(3145861L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSTEREOFORMAT_FLIPUNSUPPORTED(3145862L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSTEREOFORMAT_MONOOFFSETUNSUPPORTED(3145863L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSTEREOFORMAT_FORMATUNSUPPORTED(3145864L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMSTEREOFORMAT_INVALIDFORMAT(3145865L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMAUTOPROCESSINGMODE_NULLPARAM(3145866L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMAUTOPROCESSINGMODE_INVALIDSTREAM(3145867L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMFILTER_NULLPARAM(3145868L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMFILTER_INVALIDSTREAM(3145869L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMFILTER_INVALIDFILTER(3145870L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMFILTER_UNSUPPORTED(3145871L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMFILTER_INVALIDLEVEL(3145872L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMEXTENSION_NULLPARAM(3145873L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMEXTENSION_INVALIDSTREAM(3145874L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMFRAMEFORMAT_NULLPARAM(3145875L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMCOLORSPACE_NULLPARAM(3145876L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMOUTPUTRATE_NULLPARAM(3145877L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMSOURCERECT_NULLPARAM(3145878L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMDESTRECT_NULLPARAM(3145879L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMALPHA_NULLPARAM(3145880L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMPALETTE_NULLPARAM(3145881L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMPIXELASPECTRATIO_NULLPARAM(3145882L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMLUMAKEY_NULLPARAM(3145883L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMSTEREOFORMAT_NULLPARAM(3145884L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMAUTOPROCESSINGMODE_NULLPARAM(3145885L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMFILTER_NULLPARAM(3145886L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMEXTENSION_NULLPARAM(3145887L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMEXTENSION_INVALIDSTREAM(3145888L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_NULLPARAM(3145889L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDSTREAMCOUNT(3145890L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_TARGETRECT(3145891L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDOUTPUT(3145892L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDPASTFRAMES(3145893L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDFUTUREFRAMES(3145894L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDSOURCERECT(3145895L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDDESTRECT(3145896L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDINPUTRESOURCE(3145897L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDARRAYSIZE(3145898L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDARRAY(3145899L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_RIGHTEXPECTED(3145900L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_RIGHTNOTEXPECTED(3145901L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_STEREONOTENABLED(3145902L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INVALIDRIGHTRESOURCE(3145903L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_NOSTEREOSTREAMS(3145904L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_INPUTHAZARD(3145905L), D3D11_MESSAGE_ID_VIDEOPROCESSORBLT_OUTPUTHAZARD(3145906L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_OUTOFMEMORY_RETURN(3145907L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_NULLPARAM(3145908L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_INVALIDTYPE(3145909L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_INVALIDBIND(3145910L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_UNSUPPORTEDFORMAT(3145911L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_INVALIDMIP(3145912L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_UNSUPPORTEMIP(3145913L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_INVALIDARRAYSIZE(3145914L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_INVALIDARRAY(3145915L), D3D11_MESSAGE_ID_CREATEVIDEODECODEROUTPUTVIEW_INVALIDDIMENSION(3145916L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_OUTOFMEMORY_RETURN(3145917L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_NULLPARAM(3145918L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDTYPE(3145919L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDBIND(3145920L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDMISC(3145921L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDUSAGE(3145922L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDFORMAT(3145923L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDFOURCC(3145924L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDMIP(3145925L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_UNSUPPORTEDMIP(3145926L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDARRAYSIZE(3145927L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDARRAY(3145928L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDDIMENSION(3145929L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_OUTOFMEMORY_RETURN(3145930L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_NULLPARAM(3145931L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_INVALIDTYPE(3145932L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_INVALIDBIND(3145933L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_INVALIDFORMAT(3145934L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_INVALIDMIP(3145935L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_UNSUPPORTEDMIP(3145936L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_UNSUPPORTEDARRAY(3145937L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_INVALIDARRAY(3145938L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_INVALIDDIMENSION(3145939L), D3D11_MESSAGE_ID_DEVICE_DRAW_INVALID_USE_OF_FORCED_SAMPLE_COUNT(3145940L), D3D11_MESSAGE_ID_CREATEBLENDSTATE_INVALIDLOGICOPS(3145941L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDDARRAYWITHDECODER(3145942L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDDARRAYWITHDECODER(3145943L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDDARRAYWITHDECODER(3145944L), D3D11_MESSAGE_ID_DEVICE_LOCKEDOUT_INTERFACE(3145945L), D3D11_MESSAGE_ID_REF_WARNING_ATOMIC_INCONSISTENT(3145946L), D3D11_MESSAGE_ID_REF_WARNING_READING_UNINITIALIZED_RESOURCE(3145947L), D3D11_MESSAGE_ID_REF_WARNING_RAW_HAZARD(3145948L), D3D11_MESSAGE_ID_REF_WARNING_WAR_HAZARD(3145949L), D3D11_MESSAGE_ID_REF_WARNING_WAW_HAZARD(3145950L), D3D11_MESSAGE_ID_CREATECRYPTOSESSION_NULLPARAM(3145951L), D3D11_MESSAGE_ID_CREATECRYPTOSESSION_OUTOFMEMORY_RETURN(3145952L), D3D11_MESSAGE_ID_GETCRYPTOTYPE_NULLPARAM(3145953L), D3D11_MESSAGE_ID_GETDECODERPROFILE_NULLPARAM(3145954L), D3D11_MESSAGE_ID_GETCRYPTOSESSIONCERTIFICATESIZE_NULLPARAM(3145955L), D3D11_MESSAGE_ID_GETCRYPTOSESSIONCERTIFICATE_NULLPARAM(3145956L), D3D11_MESSAGE_ID_GETCRYPTOSESSIONCERTIFICATE_WRONGSIZE(3145957L), D3D11_MESSAGE_ID_GETCRYPTOSESSIONHANDLE_WRONGSIZE(3145958L), D3D11_MESSAGE_ID_NEGOTIATECRPYTOSESSIONKEYEXCHANGE_NULLPARAM(3145959L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_UNSUPPORTED(3145960L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_NULLPARAM(3145961L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_SRC_WRONGDEVICE(3145962L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_DST_WRONGDEVICE(3145963L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_FORMAT_MISMATCH(3145964L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_SIZE_MISMATCH(3145965L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_SRC_MULTISAMPLED(3145966L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_DST_NOT_STAGING(3145967L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_SRC_MAPPED(3145968L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_DST_MAPPED(3145969L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_SRC_OFFERED(3145970L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_DST_OFFERED(3145971L), D3D11_MESSAGE_ID_ENCRYPTIONBLT_SRC_CONTENT_UNDEFINED(3145972L), D3D11_MESSAGE_ID_DECRYPTIONBLT_UNSUPPORTED(3145973L), D3D11_MESSAGE_ID_DECRYPTIONBLT_NULLPARAM(3145974L), D3D11_MESSAGE_ID_DECRYPTIONBLT_SRC_WRONGDEVICE(3145975L), D3D11_MESSAGE_ID_DECRYPTIONBLT_DST_WRONGDEVICE(3145976L), D3D11_MESSAGE_ID_DECRYPTIONBLT_FORMAT_MISMATCH(3145977L), D3D11_MESSAGE_ID_DECRYPTIONBLT_SIZE_MISMATCH(3145978L), D3D11_MESSAGE_ID_DECRYPTIONBLT_DST_MULTISAMPLED(3145979L), D3D11_MESSAGE_ID_DECRYPTIONBLT_SRC_NOT_STAGING(3145980L), D3D11_MESSAGE_ID_DECRYPTIONBLT_DST_NOT_RENDER_TARGET(3145981L), D3D11_MESSAGE_ID_DECRYPTIONBLT_SRC_MAPPED(3145982L), D3D11_MESSAGE_ID_DECRYPTIONBLT_DST_MAPPED(3145983L), D3D11_MESSAGE_ID_DECRYPTIONBLT_SRC_OFFERED(3145984L), D3D11_MESSAGE_ID_DECRYPTIONBLT_DST_OFFERED(3145985L), D3D11_MESSAGE_ID_DECRYPTIONBLT_SRC_CONTENT_UNDEFINED(3145986L), D3D11_MESSAGE_ID_STARTSESSIONKEYREFRESH_NULLPARAM(3145987L), D3D11_MESSAGE_ID_STARTSESSIONKEYREFRESH_INVALIDSIZE(3145988L), D3D11_MESSAGE_ID_FINISHSESSIONKEYREFRESH_NULLPARAM(3145989L), D3D11_MESSAGE_ID_GETENCRYPTIONBLTKEY_NULLPARAM(3145990L), D3D11_MESSAGE_ID_GETENCRYPTIONBLTKEY_INVALIDSIZE(3145991L), D3D11_MESSAGE_ID_GETCONTENTPROTECTIONCAPS_NULLPARAM(3145992L), D3D11_MESSAGE_ID_CHECKCRYPTOKEYEXCHANGE_NULLPARAM(3145993L), D3D11_MESSAGE_ID_CHECKCRYPTOKEYEXCHANGE_INVALIDINDEX(3145994L), D3D11_MESSAGE_ID_CREATEAUTHENTICATEDCHANNEL_NULLPARAM(3145995L), D3D11_MESSAGE_ID_CREATEAUTHENTICATEDCHANNEL_UNSUPPORTED(3145996L), D3D11_MESSAGE_ID_CREATEAUTHENTICATEDCHANNEL_INVALIDTYPE(3145997L), D3D11_MESSAGE_ID_CREATEAUTHENTICATEDCHANNEL_OUTOFMEMORY_RETURN(3145998L), D3D11_MESSAGE_ID_GETAUTHENTICATEDCHANNELCERTIFICATESIZE_INVALIDCHANNEL(3145999L), D3D11_MESSAGE_ID_GETAUTHENTICATEDCHANNELCERTIFICATESIZE_NULLPARAM(3146000L), D3D11_MESSAGE_ID_GETAUTHENTICATEDCHANNELCERTIFICATE_INVALIDCHANNEL(3146001L), D3D11_MESSAGE_ID_GETAUTHENTICATEDCHANNELCERTIFICATE_NULLPARAM(3146002L), D3D11_MESSAGE_ID_GETAUTHENTICATEDCHANNELCERTIFICATE_WRONGSIZE(3146003L), D3D11_MESSAGE_ID_NEGOTIATEAUTHENTICATEDCHANNELKEYEXCHANGE_INVALIDCHANNEL(3146004L), D3D11_MESSAGE_ID_NEGOTIATEAUTHENTICATEDCHANNELKEYEXCHANGE_NULLPARAM(3146005L), D3D11_MESSAGE_ID_QUERYAUTHENTICATEDCHANNEL_NULLPARAM(3146006L), D3D11_MESSAGE_ID_QUERYAUTHENTICATEDCHANNEL_WRONGCHANNEL(3146007L), D3D11_MESSAGE_ID_QUERYAUTHENTICATEDCHANNEL_UNSUPPORTEDQUERY(3146008L), D3D11_MESSAGE_ID_QUERYAUTHENTICATEDCHANNEL_WRONGSIZE(3146009L), D3D11_MESSAGE_ID_QUERYAUTHENTICATEDCHANNEL_INVALIDPROCESSINDEX(3146010L), D3D11_MESSAGE_ID_CONFIGUREAUTHENTICATEDCHANNEL_NULLPARAM(3146011L), D3D11_MESSAGE_ID_CONFIGUREAUTHENTICATEDCHANNEL_WRONGCHANNEL(3146012L), D3D11_MESSAGE_ID_CONFIGUREAUTHENTICATEDCHANNEL_UNSUPPORTEDCONFIGURE(3146013L), D3D11_MESSAGE_ID_CONFIGUREAUTHENTICATEDCHANNEL_WRONGSIZE(3146014L), D3D11_MESSAGE_ID_CONFIGUREAUTHENTICATEDCHANNEL_INVALIDPROCESSIDTYPE(3146015L), D3D11_MESSAGE_ID_VSSETCONSTANTBUFFERS_INVALIDBUFFEROFFSETORCOUNT(3146016L), D3D11_MESSAGE_ID_DSSETCONSTANTBUFFERS_INVALIDBUFFEROFFSETORCOUNT(3146017L), D3D11_MESSAGE_ID_HSSETCONSTANTBUFFERS_INVALIDBUFFEROFFSETORCOUNT(3146018L), D3D11_MESSAGE_ID_GSSETCONSTANTBUFFERS_INVALIDBUFFEROFFSETORCOUNT(3146019L), D3D11_MESSAGE_ID_PSSETCONSTANTBUFFERS_INVALIDBUFFEROFFSETORCOUNT(3146020L), D3D11_MESSAGE_ID_CSSETCONSTANTBUFFERS_INVALIDBUFFEROFFSETORCOUNT(3146021L), D3D11_MESSAGE_ID_NEGOTIATECRPYTOSESSIONKEYEXCHANGE_INVALIDSIZE(3146022L), D3D11_MESSAGE_ID_NEGOTIATEAUTHENTICATEDCHANNELKEYEXCHANGE_INVALIDSIZE(3146023L), D3D11_MESSAGE_ID_OFFERRESOURCES_INVALIDPRIORITY(3146024L), D3D11_MESSAGE_ID_GETCRYPTOSESSIONHANDLE_OUTOFMEMORY(3146025L), D3D11_MESSAGE_ID_ACQUIREHANDLEFORCAPTURE_NULLPARAM(3146026L), D3D11_MESSAGE_ID_ACQUIREHANDLEFORCAPTURE_INVALIDTYPE(3146027L), D3D11_MESSAGE_ID_ACQUIREHANDLEFORCAPTURE_INVALIDBIND(3146028L), D3D11_MESSAGE_ID_ACQUIREHANDLEFORCAPTURE_INVALIDARRAY(3146029L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMROTATION_NULLPARAM(3146030L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMROTATION_INVALIDSTREAM(3146031L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMROTATION_INVALID(3146032L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMROTATION_UNSUPPORTED(3146033L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMROTATION_NULLPARAM(3146034L), D3D11_MESSAGE_ID_DEVICE_CLEARVIEW_INVALIDVIEW(3146035L), D3D11_MESSAGE_ID_DEVICE_CREATEVERTEXSHADER_DOUBLEEXTENSIONSNOTSUPPORTED(3146036L), D3D11_MESSAGE_ID_DEVICE_CREATEVERTEXSHADER_SHADEREXTENSIONSNOTSUPPORTED(3146037L), D3D11_MESSAGE_ID_DEVICE_CREATEHULLSHADER_DOUBLEEXTENSIONSNOTSUPPORTED(3146038L), D3D11_MESSAGE_ID_DEVICE_CREATEHULLSHADER_SHADEREXTENSIONSNOTSUPPORTED(3146039L), D3D11_MESSAGE_ID_DEVICE_CREATEDOMAINSHADER_DOUBLEEXTENSIONSNOTSUPPORTED(3146040L), D3D11_MESSAGE_ID_DEVICE_CREATEDOMAINSHADER_SHADEREXTENSIONSNOTSUPPORTED(3146041L), D3D11_MESSAGE_ID_DEVICE_CREATEGEOMETRYSHADER_DOUBLEEXTENSIONSNOTSUPPORTED(3146042L), D3D11_MESSAGE_ID_DEVICE_CREATEGEOMETRYSHADER_SHADEREXTENSIONSNOTSUPPORTED(3146043L), D3D11_MESSAGE_ID_DEVICE_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_DOUBLEEXTENSIONSNOTSUPPORTED(3146044L), D3D11_MESSAGE_ID_DEVICE_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_SHADEREXTENSIONSNOTSUPPORTED(3146045L), D3D11_MESSAGE_ID_DEVICE_CREATEPIXELSHADER_DOUBLEEXTENSIONSNOTSUPPORTED(3146046L), D3D11_MESSAGE_ID_DEVICE_CREATEPIXELSHADER_SHADEREXTENSIONSNOTSUPPORTED(3146047L), D3D11_MESSAGE_ID_DEVICE_CREATECOMPUTESHADER_DOUBLEEXTENSIONSNOTSUPPORTED(3146048L), D3D11_MESSAGE_ID_DEVICE_CREATECOMPUTESHADER_SHADEREXTENSIONSNOTSUPPORTED(3146049L), D3D11_MESSAGE_ID_DEVICE_SHADER_LINKAGE_MINPRECISION(3146050L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMALPHA_UNSUPPORTED(3146051L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMPIXELASPECTRATIO_UNSUPPORTED(3146052L), D3D11_MESSAGE_ID_DEVICE_CREATEVERTEXSHADER_UAVSNOTSUPPORTED(3146053L), D3D11_MESSAGE_ID_DEVICE_CREATEHULLSHADER_UAVSNOTSUPPORTED(3146054L), D3D11_MESSAGE_ID_DEVICE_CREATEDOMAINSHADER_UAVSNOTSUPPORTED(3146055L), D3D11_MESSAGE_ID_DEVICE_CREATEGEOMETRYSHADER_UAVSNOTSUPPORTED(3146056L), D3D11_MESSAGE_ID_DEVICE_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_UAVSNOTSUPPORTED(3146057L), D3D11_MESSAGE_ID_DEVICE_CREATEPIXELSHADER_UAVSNOTSUPPORTED(3146058L), D3D11_MESSAGE_ID_DEVICE_CREATECOMPUTESHADER_UAVSNOTSUPPORTED(3146059L), D3D11_MESSAGE_ID_DEVICE_OMSETRENDERTARGETSANDUNORDEREDACCESSVIEWS_INVALIDOFFSET(3146060L), D3D11_MESSAGE_ID_DEVICE_OMSETRENDERTARGETSANDUNORDEREDACCESSVIEWS_TOOMANYVIEWS(3146061L), D3D11_MESSAGE_ID_DEVICE_CLEARVIEW_NOTSUPPORTED(3146062L), D3D11_MESSAGE_ID_SWAPDEVICECONTEXTSTATE_NOTSUPPORTED(3146063L), D3D11_MESSAGE_ID_UPDATESUBRESOURCE_PREFERUPDATESUBRESOURCE1(3146064L), D3D11_MESSAGE_ID_GETDC_INACCESSIBLE(3146065L), D3D11_MESSAGE_ID_DEVICE_CLEARVIEW_INVALIDRECT(3146066L), D3D11_MESSAGE_ID_DEVICE_DRAW_SAMPLE_MASK_IGNORED_ON_FL9(3146067L), D3D11_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE1_NOT_SUPPORTED(3146068L), D3D11_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE_BY_NAME_NOT_SUPPORTED(3146069L), D3D11_MESSAGE_ID_ENQUEUESETEVENT_NOT_SUPPORTED(3146070L), D3D11_MESSAGE_ID_OFFERRELEASE_NOT_SUPPORTED(3146071L), D3D11_MESSAGE_ID_OFFERRESOURCES_INACCESSIBLE(3146072L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSORINPUTVIEW_INVALIDMSAA(3146073L), D3D11_MESSAGE_ID_CREATEVIDEOPROCESSOROUTPUTVIEW_INVALIDMSAA(3146074L), D3D11_MESSAGE_ID_DEVICE_CLEARVIEW_INVALIDSOURCERECT(3146075L), D3D11_MESSAGE_ID_DEVICE_CLEARVIEW_EMPTYRECT(3146076L), D3D11_MESSAGE_ID_UPDATESUBRESOURCE_EMPTYDESTBOX(3146077L), D3D11_MESSAGE_ID_COPYSUBRESOURCEREGION_EMPTYSOURCEBOX(3146078L), D3D11_MESSAGE_ID_DEVICE_DRAW_OM_RENDER_TARGET_DOES_NOT_SUPPORT_LOGIC_OPS(3146079L), D3D11_MESSAGE_ID_DEVICE_DRAW_DEPTHSTENCILVIEW_NOT_SET(3146080L), D3D11_MESSAGE_ID_DEVICE_DRAW_RENDERTARGETVIEW_NOT_SET(3146081L), D3D11_MESSAGE_ID_DEVICE_DRAW_RENDERTARGETVIEW_NOT_SET_DUE_TO_FLIP_PRESENT(3146082L), D3D11_MESSAGE_ID_DEVICE_UNORDEREDACCESSVIEW_NOT_SET_DUE_TO_FLIP_PRESENT(3146083L), D3D11_MESSAGE_ID_GETDATAFORNEWHARDWAREKEY_NULLPARAM(3146084L), D3D11_MESSAGE_ID_CHECKCRYPTOSESSIONSTATUS_NULLPARAM(3146085L), D3D11_MESSAGE_ID_GETCRYPTOSESSIONPRIVATEDATASIZE_NULLPARAM(3146086L), D3D11_MESSAGE_ID_GETVIDEODECODERCAPS_NULLPARAM(3146087L), D3D11_MESSAGE_ID_GETVIDEODECODERCAPS_ZEROWIDTHHEIGHT(3146088L), D3D11_MESSAGE_ID_CHECKVIDEODECODERDOWNSAMPLING_NULLPARAM(3146089L), D3D11_MESSAGE_ID_CHECKVIDEODECODERDOWNSAMPLING_INVALIDCOLORSPACE(3146090L), D3D11_MESSAGE_ID_CHECKVIDEODECODERDOWNSAMPLING_ZEROWIDTHHEIGHT(3146091L), D3D11_MESSAGE_ID_VIDEODECODERENABLEDOWNSAMPLING_NULLPARAM(3146092L), D3D11_MESSAGE_ID_VIDEODECODERENABLEDOWNSAMPLING_UNSUPPORTED(3146093L), D3D11_MESSAGE_ID_VIDEODECODERUPDATEDOWNSAMPLING_NULLPARAM(3146094L), D3D11_MESSAGE_ID_VIDEODECODERUPDATEDOWNSAMPLING_UNSUPPORTED(3146095L), D3D11_MESSAGE_ID_CHECKVIDEOPROCESSORFORMATCONVERSION_NULLPARAM(3146096L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTCOLORSPACE1_NULLPARAM(3146097L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTCOLORSPACE1_NULLPARAM(3146098L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMCOLORSPACE1_NULLPARAM(3146099L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMCOLORSPACE1_INVALIDSTREAM(3146100L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMMIRROR_NULLPARAM(3146101L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMMIRROR_INVALIDSTREAM(3146102L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMMIRROR_UNSUPPORTED(3146103L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMCOLORSPACE1_NULLPARAM(3146104L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMMIRROR_NULLPARAM(3146105L), D3D11_MESSAGE_ID_RECOMMENDVIDEODECODERDOWNSAMPLING_NULLPARAM(3146106L), D3D11_MESSAGE_ID_RECOMMENDVIDEODECODERDOWNSAMPLING_INVALIDCOLORSPACE(3146107L), D3D11_MESSAGE_ID_RECOMMENDVIDEODECODERDOWNSAMPLING_ZEROWIDTHHEIGHT(3146108L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTSHADERUSAGE_NULLPARAM(3146109L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTSHADERUSAGE_NULLPARAM(3146110L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETBEHAVIORHINTS_NULLPARAM(3146111L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETBEHAVIORHINTS_INVALIDSTREAMCOUNT(3146112L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETBEHAVIORHINTS_TARGETRECT(3146113L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETBEHAVIORHINTS_INVALIDSOURCERECT(3146114L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETBEHAVIORHINTS_INVALIDDESTRECT(3146115L), D3D11_MESSAGE_ID_GETCRYPTOSESSIONPRIVATEDATASIZE_INVALID_KEY_EXCHANGE_TYPE(3146116L), D3D11_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE1_ACCESS_DENIED(3146117L), D3D11_MESSAGE_ID_D3D11_1_MESSAGES_END(3146118L), D3D11_MESSAGE_ID_D3D11_2_MESSAGES_START(3146119L), D3D11_MESSAGE_ID_CREATEBUFFER_INVALIDUSAGE(3146120L), D3D11_MESSAGE_ID_CREATETEXTURE1D_INVALIDUSAGE(3146121L), D3D11_MESSAGE_ID_CREATETEXTURE2D_INVALIDUSAGE(3146122L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_LEVEL9_STEPRATE_NOT_1(3146123L), D3D11_MESSAGE_ID_CREATEINPUTLAYOUT_LEVEL9_INSTANCING_NOT_SUPPORTED(3146124L), D3D11_MESSAGE_ID_UPDATETILEMAPPINGS_INVALID_PARAMETER(3146125L), D3D11_MESSAGE_ID_COPYTILEMAPPINGS_INVALID_PARAMETER(3146126L), D3D11_MESSAGE_ID_COPYTILES_INVALID_PARAMETER(3146127L), D3D11_MESSAGE_ID_UPDATETILES_INVALID_PARAMETER(3146128L), D3D11_MESSAGE_ID_RESIZETILEPOOL_INVALID_PARAMETER(3146129L), D3D11_MESSAGE_ID_TILEDRESOURCEBARRIER_INVALID_PARAMETER(3146130L), D3D11_MESSAGE_ID_NULL_TILE_MAPPING_ACCESS_WARNING(3146131L), D3D11_MESSAGE_ID_NULL_TILE_MAPPING_ACCESS_ERROR(3146132L), D3D11_MESSAGE_ID_DIRTY_TILE_MAPPING_ACCESS(3146133L), D3D11_MESSAGE_ID_DUPLICATE_TILE_MAPPINGS_IN_COVERED_AREA(3146134L), D3D11_MESSAGE_ID_TILE_MAPPINGS_IN_COVERED_AREA_DUPLICATED_OUTSIDE(3146135L), D3D11_MESSAGE_ID_TILE_MAPPINGS_SHARED_BETWEEN_INCOMPATIBLE_RESOURCES(3146136L), D3D11_MESSAGE_ID_TILE_MAPPINGS_SHARED_BETWEEN_INPUT_AND_OUTPUT(3146137L), D3D11_MESSAGE_ID_CHECKMULTISAMPLEQUALITYLEVELS_INVALIDFLAGS(3146138L), D3D11_MESSAGE_ID_GETRESOURCETILING_NONTILED_RESOURCE(3146139L), D3D11_MESSAGE_ID_RESIZETILEPOOL_SHRINK_WITH_MAPPINGS_STILL_DEFINED_PAST_END(3146140L), D3D11_MESSAGE_ID_NEED_TO_CALL_TILEDRESOURCEBARRIER(3146141L), D3D11_MESSAGE_ID_CREATEDEVICE_INVALIDARGS(3146142L), D3D11_MESSAGE_ID_CREATEDEVICE_WARNING(3146143L), D3D11_MESSAGE_ID_CLEARUNORDEREDACCESSVIEWUINT_HAZARD(3146144L), D3D11_MESSAGE_ID_CLEARUNORDEREDACCESSVIEWFLOAT_HAZARD(3146145L), D3D11_MESSAGE_ID_TILED_RESOURCE_TIER_1_BUFFER_TEXTURE_MISMATCH(3146146L), D3D11_MESSAGE_ID_CREATE_CRYPTOSESSION(3146147L), D3D11_MESSAGE_ID_CREATE_AUTHENTICATEDCHANNEL(3146148L), D3D11_MESSAGE_ID_LIVE_CRYPTOSESSION(3146149L), D3D11_MESSAGE_ID_LIVE_AUTHENTICATEDCHANNEL(3146150L), D3D11_MESSAGE_ID_DESTROY_CRYPTOSESSION(3146151L), D3D11_MESSAGE_ID_DESTROY_AUTHENTICATEDCHANNEL(3146152L), D3D11_MESSAGE_ID_D3D11_2_MESSAGES_END(3146153L), D3D11_MESSAGE_ID_D3D11_3_MESSAGES_START(3146154L), D3D11_MESSAGE_ID_CREATERASTERIZERSTATE_INVALID_CONSERVATIVERASTERMODE(3146155L), D3D11_MESSAGE_ID_DEVICE_DRAW_INVALID_SYSTEMVALUE(3146156L), D3D11_MESSAGE_ID_CREATEQUERYORPREDICATE_INVALIDCONTEXTTYPE(3146157L), D3D11_MESSAGE_ID_CREATEQUERYORPREDICATE_DECODENOTSUPPORTED(3146158L), D3D11_MESSAGE_ID_CREATEQUERYORPREDICATE_ENCODENOTSUPPORTED(3146159L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDPLANEINDEX(3146160L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDVIDEOPLANEINDEX(3146161L), D3D11_MESSAGE_ID_CREATESHADERRESOURCEVIEW_AMBIGUOUSVIDEOPLANEINDEX(3146162L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDPLANEINDEX(3146163L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDVIDEOPLANEINDEX(3146164L), D3D11_MESSAGE_ID_CREATERENDERTARGETVIEW_AMBIGUOUSVIDEOPLANEINDEX(3146165L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDPLANEINDEX(3146166L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_INVALIDVIDEOPLANEINDEX(3146167L), D3D11_MESSAGE_ID_CREATEUNORDEREDACCESSVIEW_AMBIGUOUSVIDEOPLANEINDEX(3146168L), D3D11_MESSAGE_ID_JPEGDECODE_INVALIDSCANDATAOFFSET(3146169L), D3D11_MESSAGE_ID_JPEGDECODE_NOTSUPPORTED(3146170L), D3D11_MESSAGE_ID_JPEGDECODE_DIMENSIONSTOOLARGE(3146171L), D3D11_MESSAGE_ID_JPEGDECODE_INVALIDCOMPONENTS(3146172L), D3D11_MESSAGE_ID_JPEGDECODE_DESTINATIONNOT2D(3146173L), D3D11_MESSAGE_ID_JPEGDECODE_TILEDRESOURCESUNSUPPORTED(3146174L), D3D11_MESSAGE_ID_JPEGDECODE_GUARDRECTSUNSUPPORTED(3146175L), D3D11_MESSAGE_ID_JPEGDECODE_FORMATUNSUPPORTED(3146176L), D3D11_MESSAGE_ID_JPEGDECODE_INVALIDSUBRESOURCE(3146177L), D3D11_MESSAGE_ID_JPEGDECODE_INVALIDMIPLEVEL(3146178L), D3D11_MESSAGE_ID_JPEGDECODE_EMPTYDESTBOX(3146179L), D3D11_MESSAGE_ID_JPEGDECODE_DESTBOXNOT2D(3146180L), D3D11_MESSAGE_ID_JPEGDECODE_DESTBOXNOTSUB(3146181L), D3D11_MESSAGE_ID_JPEGDECODE_DESTBOXESINTERSECT(3146182L), D3D11_MESSAGE_ID_JPEGDECODE_XSUBSAMPLEMISMATCH(3146183L), D3D11_MESSAGE_ID_JPEGDECODE_YSUBSAMPLEMISMATCH(3146184L), D3D11_MESSAGE_ID_JPEGDECODE_XSUBSAMPLEODD(3146185L), D3D11_MESSAGE_ID_JPEGDECODE_YSUBSAMPLEODD(3146186L), D3D11_MESSAGE_ID_JPEGDECODE_OUTPUTDIMENSIONSTOOLARGE(3146187L), D3D11_MESSAGE_ID_JPEGDECODE_NONPOW2SCALEUNSUPPORTED(3146188L), D3D11_MESSAGE_ID_JPEGDECODE_FRACTIONALDOWNSCALETOLARGE(3146189L), D3D11_MESSAGE_ID_JPEGDECODE_CHROMASIZEMISMATCH(3146190L), D3D11_MESSAGE_ID_JPEGDECODE_LUMACHROMASIZEMISMATCH(3146191L), D3D11_MESSAGE_ID_JPEGDECODE_INVALIDNUMDESTINATIONS(3146192L), D3D11_MESSAGE_ID_JPEGDECODE_SUBBOXUNSUPPORTED(3146193L), D3D11_MESSAGE_ID_JPEGDECODE_1DESTUNSUPPORTEDFORMAT(3146194L), D3D11_MESSAGE_ID_JPEGDECODE_3DESTUNSUPPORTEDFORMAT(3146195L), D3D11_MESSAGE_ID_JPEGDECODE_SCALEUNSUPPORTED(3146196L), D3D11_MESSAGE_ID_JPEGDECODE_INVALIDSOURCESIZE(3146197L), D3D11_MESSAGE_ID_JPEGDECODE_INVALIDCOPYFLAGS(3146198L), D3D11_MESSAGE_ID_JPEGDECODE_HAZARD(3146199L), D3D11_MESSAGE_ID_JPEGDECODE_UNSUPPORTEDSRCBUFFERUSAGE(3146200L), D3D11_MESSAGE_ID_JPEGDECODE_UNSUPPORTEDSRCBUFFERMISCFLAGS(3146201L), D3D11_MESSAGE_ID_JPEGDECODE_UNSUPPORTEDDSTTEXTUREUSAGE(3146202L), D3D11_MESSAGE_ID_JPEGDECODE_BACKBUFFERNOTSUPPORTED(3146203L), D3D11_MESSAGE_ID_JPEGDECODE_UNSUPPRTEDCOPYFLAGS(3146204L), D3D11_MESSAGE_ID_JPEGENCODE_NOTSUPPORTED(3146205L), D3D11_MESSAGE_ID_JPEGENCODE_INVALIDSCANDATAOFFSET(3146206L), D3D11_MESSAGE_ID_JPEGENCODE_INVALIDCOMPONENTS(3146207L), D3D11_MESSAGE_ID_JPEGENCODE_SOURCENOT2D(3146208L), D3D11_MESSAGE_ID_JPEGENCODE_TILEDRESOURCESUNSUPPORTED(3146209L), D3D11_MESSAGE_ID_JPEGENCODE_GUARDRECTSUNSUPPORTED(3146210L), D3D11_MESSAGE_ID_JPEGENCODE_XSUBSAMPLEMISMATCH(3146211L), D3D11_MESSAGE_ID_JPEGENCODE_YSUBSAMPLEMISMATCH(3146212L), D3D11_MESSAGE_ID_JPEGENCODE_FORMATUNSUPPORTED(3146213L), D3D11_MESSAGE_ID_JPEGENCODE_INVALIDSUBRESOURCE(3146214L), D3D11_MESSAGE_ID_JPEGENCODE_INVALIDMIPLEVEL(3146215L), D3D11_MESSAGE_ID_JPEGENCODE_DIMENSIONSTOOLARGE(3146216L), D3D11_MESSAGE_ID_JPEGENCODE_HAZARD(3146217L), D3D11_MESSAGE_ID_JPEGENCODE_UNSUPPORTEDDSTBUFFERUSAGE(3146218L), D3D11_MESSAGE_ID_JPEGENCODE_UNSUPPORTEDDSTBUFFERMISCFLAGS(3146219L), D3D11_MESSAGE_ID_JPEGENCODE_UNSUPPORTEDSRCTEXTUREUSAGE(3146220L), D3D11_MESSAGE_ID_JPEGENCODE_BACKBUFFERNOTSUPPORTED(3146221L), D3D11_MESSAGE_ID_CREATEQUERYORPREDICATE_UNSUPPORTEDCONTEXTTTYPEFORQUERY(3146222L), D3D11_MESSAGE_ID_FLUSH1_INVALIDCONTEXTTYPE(3146223L), D3D11_MESSAGE_ID_DEVICE_SETHARDWAREPROTECTION_INVALIDCONTEXT(3146224L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTHDRMETADATA_NULLPARAM(3146225L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETOUTPUTHDRMETADATA_INVALIDSIZE(3146226L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTHDRMETADATA_NULLPARAM(3146227L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETOUTPUTHDRMETADATA_INVALIDSIZE(3146228L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMHDRMETADATA_NULLPARAM(3146229L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMHDRMETADATA_INVALIDSTREAM(3146230L), D3D11_MESSAGE_ID_VIDEOPROCESSORSETSTREAMHDRMETADATA_INVALIDSIZE(3146231L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMHDRMETADATA_NULLPARAM(3146232L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMHDRMETADATA_INVALIDSTREAM(3146233L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMHDRMETADATA_INVALIDSIZE(3146234L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMFRAMEFORMAT_INVALIDSTREAM(3146235L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMCOLORSPACE_INVALIDSTREAM(3146236L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMOUTPUTRATE_INVALIDSTREAM(3146237L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMSOURCERECT_INVALIDSTREAM(3146238L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMDESTRECT_INVALIDSTREAM(3146239L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMALPHA_INVALIDSTREAM(3146240L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMPALETTE_INVALIDSTREAM(3146241L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMPIXELASPECTRATIO_INVALIDSTREAM(3146242L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMLUMAKEY_INVALIDSTREAM(3146243L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMSTEREOFORMAT_INVALIDSTREAM(3146244L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMAUTOPROCESSINGMODE_INVALIDSTREAM(3146245L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMFILTER_INVALIDSTREAM(3146246L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMROTATION_INVALIDSTREAM(3146247L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMCOLORSPACE1_INVALIDSTREAM(3146248L), D3D11_MESSAGE_ID_VIDEOPROCESSORGETSTREAMMIRROR_INVALIDSTREAM(3146249L), D3D11_MESSAGE_ID_CREATE_FENCE(3146250L), D3D11_MESSAGE_ID_LIVE_FENCE(3146251L), D3D11_MESSAGE_ID_DESTROY_FENCE(3146252L), D3D11_MESSAGE_ID_CREATE_SYNCHRONIZEDCHANNEL(3146253L), D3D11_MESSAGE_ID_LIVE_SYNCHRONIZEDCHANNEL(3146254L), D3D11_MESSAGE_ID_DESTROY_SYNCHRONIZEDCHANNEL(3146255L), D3D11_MESSAGE_ID_CREATEFENCE_INVALIDFLAGS(3146256L), D3D11_MESSAGE_ID_D3D11_3_MESSAGES_END(3146257L), D3D11_MESSAGE_ID_D3D11_5_MESSAGES_START(3146258L), D3D11_MESSAGE_ID_NEGOTIATECRYPTOSESSIONKEYEXCHANGEMT_INVALIDKEYEXCHANGETYPE(3146259L), D3D11_MESSAGE_ID_NEGOTIATECRYPTOSESSIONKEYEXCHANGEMT_NOT_SUPPORTED(3146260L), D3D11_MESSAGE_ID_DECODERBEGINFRAME_INVALID_HISTOGRAM_COMPONENT_COUNT(3146261L), D3D11_MESSAGE_ID_DECODERBEGINFRAME_INVALID_HISTOGRAM_COMPONENT(3146262L), D3D11_MESSAGE_ID_DECODERBEGINFRAME_INVALID_HISTOGRAM_BUFFER_SIZE(3146263L), D3D11_MESSAGE_ID_DECODERBEGINFRAME_INVALID_HISTOGRAM_BUFFER_USAGE(3146264L), D3D11_MESSAGE_ID_DECODERBEGINFRAME_INVALID_HISTOGRAM_BUFFER_MISC_FLAGS(3146265L), D3D11_MESSAGE_ID_DECODERBEGINFRAME_INVALID_HISTOGRAM_BUFFER_OFFSET(3146266L), D3D11_MESSAGE_ID_CREATE_TRACKEDWORKLOAD(3146267L), D3D11_MESSAGE_ID_LIVE_TRACKEDWORKLOAD(3146268L), D3D11_MESSAGE_ID_DESTROY_TRACKEDWORKLOAD(3146269L), D3D11_MESSAGE_ID_CREATE_TRACKED_WORKLOAD_NULLPARAM(3146270L), D3D11_MESSAGE_ID_CREATE_TRACKED_WORKLOAD_INVALID_MAX_INSTANCES(3146271L), D3D11_MESSAGE_ID_CREATE_TRACKED_WORKLOAD_INVALID_DEADLINE_TYPE(3146272L), D3D11_MESSAGE_ID_CREATE_TRACKED_WORKLOAD_INVALID_ENGINE_TYPE(3146273L), D3D11_MESSAGE_ID_MULTIPLE_TRACKED_WORKLOADS(3146274L), D3D11_MESSAGE_ID_MULTIPLE_TRACKED_WORKLOAD_PAIRS(3146275L), D3D11_MESSAGE_ID_INCOMPLETE_TRACKED_WORKLOAD_PAIR(3146276L), D3D11_MESSAGE_ID_OUT_OF_ORDER_TRACKED_WORKLOAD_PAIR(3146277L), D3D11_MESSAGE_ID_CANNOT_ADD_TRACKED_WORKLOAD(3146278L), D3D11_MESSAGE_ID_TRACKED_WORKLOAD_NOT_SUPPORTED(3146279L), D3D11_MESSAGE_ID_TRACKED_WORKLOAD_ENGINE_TYPE_NOT_FOUND(3146280L), D3D11_MESSAGE_ID_NO_TRACKED_WORKLOAD_SLOT_AVAILABLE(3146281L), D3D11_MESSAGE_ID_END_TRACKED_WORKLOAD_INVALID_ARG(3146282L), D3D11_MESSAGE_ID_TRACKED_WORKLOAD_DISJOINT_FAILURE(3146283L), D3D11_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_AND_WRITE_MASK_MISMATCH(3146284L), D3D11_MESSAGE_ID_D3D11_5_MESSAGES_END(3146285L);

    companion object {
        fun fromValue(v: Long): D3D11_MESSAGE_ID = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D11_MESSAGE_ID value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_INPUT_CLASSIFICATION}
 */
enum class D3D10_INPUT_CLASSIFICATION(val value: Long) {
    D3D10_INPUT_PER_VERTEX_DATA(0L), D3D10_INPUT_PER_INSTANCE_DATA(1L);

    companion object {
        fun fromValue(v: Long): D3D10_INPUT_CLASSIFICATION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_INPUT_CLASSIFICATION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_FILL_MODE}
 */
enum class D3D10_FILL_MODE(val value: Long) {
    D3D10_FILL_WIREFRAME(2L), D3D10_FILL_SOLID(3L);

    companion object {
        fun fromValue(v: Long): D3D10_FILL_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_FILL_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_CULL_MODE}
 */
enum class D3D10_CULL_MODE(val value: Long) {
    D3D10_CULL_NONE(1L), D3D10_CULL_FRONT(2L), D3D10_CULL_BACK(3L);

    companion object {
        fun fromValue(v: Long): D3D10_CULL_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_CULL_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_RESOURCE_DIMENSION}
 */
enum class D3D10_RESOURCE_DIMENSION(val value: Long) {
    D3D10_RESOURCE_DIMENSION_UNKNOWN(0L), D3D10_RESOURCE_DIMENSION_BUFFER(1L), D3D10_RESOURCE_DIMENSION_TEXTURE1D(2L), D3D10_RESOURCE_DIMENSION_TEXTURE2D(3L), D3D10_RESOURCE_DIMENSION_TEXTURE3D(4L);

    companion object {
        fun fromValue(v: Long): D3D10_RESOURCE_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_RESOURCE_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_DSV_DIMENSION}
 */
enum class D3D10_DSV_DIMENSION(val value: Long) {
    D3D10_DSV_DIMENSION_UNKNOWN(0L), D3D10_DSV_DIMENSION_TEXTURE1D(1L), D3D10_DSV_DIMENSION_TEXTURE1DARRAY(2L), D3D10_DSV_DIMENSION_TEXTURE2D(3L), D3D10_DSV_DIMENSION_TEXTURE2DARRAY(4L), D3D10_DSV_DIMENSION_TEXTURE2DMS(5L), D3D10_DSV_DIMENSION_TEXTURE2DMSARRAY(6L);

    companion object {
        fun fromValue(v: Long): D3D10_DSV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_DSV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_RTV_DIMENSION}
 */
enum class D3D10_RTV_DIMENSION(val value: Long) {
    D3D10_RTV_DIMENSION_UNKNOWN(0L), D3D10_RTV_DIMENSION_BUFFER(1L), D3D10_RTV_DIMENSION_TEXTURE1D(2L), D3D10_RTV_DIMENSION_TEXTURE1DARRAY(3L), D3D10_RTV_DIMENSION_TEXTURE2D(4L), D3D10_RTV_DIMENSION_TEXTURE2DARRAY(5L), D3D10_RTV_DIMENSION_TEXTURE2DMS(6L), D3D10_RTV_DIMENSION_TEXTURE2DMSARRAY(7L), D3D10_RTV_DIMENSION_TEXTURE3D(8L);

    companion object {
        fun fromValue(v: Long): D3D10_RTV_DIMENSION = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_RTV_DIMENSION value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_USAGE}
 */
enum class D3D10_USAGE(val value: Long) {
    D3D10_USAGE_DEFAULT(0L), D3D10_USAGE_IMMUTABLE(1L), D3D10_USAGE_DYNAMIC(2L), D3D10_USAGE_STAGING(3L);

    companion object {
        fun fromValue(v: Long): D3D10_USAGE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_USAGE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_BIND_FLAG}
 */
enum class D3D10_BIND_FLAG(val value: Long) {
    D3D10_BIND_VERTEX_BUFFER(1L), D3D10_BIND_INDEX_BUFFER(2L), D3D10_BIND_CONSTANT_BUFFER(4L), D3D10_BIND_SHADER_RESOURCE(8L), D3D10_BIND_STREAM_OUTPUT(16L), D3D10_BIND_RENDER_TARGET(32L), D3D10_BIND_DEPTH_STENCIL(64L);

    companion object {
        fun fromValue(v: Long): D3D10_BIND_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_BIND_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_CPU_ACCESS_FLAG}
 */
enum class D3D10_CPU_ACCESS_FLAG(val value: Long) {
    D3D10_CPU_ACCESS_WRITE(65536L), D3D10_CPU_ACCESS_READ(131072L);

    companion object {
        fun fromValue(v: Long): D3D10_CPU_ACCESS_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_CPU_ACCESS_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_RESOURCE_MISC_FLAG}
 */
enum class D3D10_RESOURCE_MISC_FLAG(val value: Long) {
    D3D10_RESOURCE_MISC_GENERATE_MIPS(1L), D3D10_RESOURCE_MISC_SHARED(2L), D3D10_RESOURCE_MISC_TEXTURECUBE(4L), D3D10_RESOURCE_MISC_SHARED_KEYEDMUTEX(16L), D3D10_RESOURCE_MISC_GDI_COMPATIBLE(32L);

    companion object {
        fun fromValue(v: Long): D3D10_RESOURCE_MISC_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_RESOURCE_MISC_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_MAP}
 */
enum class D3D10_MAP(val value: Long) {
    D3D10_MAP_READ(1L), D3D10_MAP_WRITE(2L), D3D10_MAP_READ_WRITE(3L), D3D10_MAP_WRITE_DISCARD(4L), D3D10_MAP_WRITE_NO_OVERWRITE(5L);

    companion object {
        fun fromValue(v: Long): D3D10_MAP = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_MAP value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_MAP_FLAG}
 */
enum class D3D10_MAP_FLAG(val value: Long) {
    D3D10_MAP_FLAG_DO_NOT_WAIT(1048576L);

    companion object {
        fun fromValue(v: Long): D3D10_MAP_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_MAP_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_RAISE_FLAG}
 */
enum class D3D10_RAISE_FLAG(val value: Long) {
    D3D10_RAISE_FLAG_DRIVER_INTERNAL_ERROR(1L);

    companion object {
        fun fromValue(v: Long): D3D10_RAISE_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_RAISE_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_CLEAR_FLAG}
 */
enum class D3D10_CLEAR_FLAG(val value: Long) {
    D3D10_CLEAR_DEPTH(1L), D3D10_CLEAR_STENCIL(2L);

    companion object {
        fun fromValue(v: Long): D3D10_CLEAR_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_CLEAR_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_COMPARISON_FUNC}
 */
enum class D3D10_COMPARISON_FUNC(val value: Long) {
    D3D10_COMPARISON_NEVER(1L), D3D10_COMPARISON_LESS(2L), D3D10_COMPARISON_EQUAL(3L), D3D10_COMPARISON_LESS_EQUAL(4L), D3D10_COMPARISON_GREATER(5L), D3D10_COMPARISON_NOT_EQUAL(6L), D3D10_COMPARISON_GREATER_EQUAL(7L), D3D10_COMPARISON_ALWAYS(8L);

    companion object {
        fun fromValue(v: Long): D3D10_COMPARISON_FUNC = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_COMPARISON_FUNC value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_DEPTH_WRITE_MASK}
 */
enum class D3D10_DEPTH_WRITE_MASK(val value: Long) {
    D3D10_DEPTH_WRITE_MASK_ZERO(0L), D3D10_DEPTH_WRITE_MASK_ALL(1L);

    companion object {
        fun fromValue(v: Long): D3D10_DEPTH_WRITE_MASK = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_DEPTH_WRITE_MASK value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_STENCIL_OP}
 */
enum class D3D10_STENCIL_OP(val value: Long) {
    D3D10_STENCIL_OP_KEEP(1L), D3D10_STENCIL_OP_ZERO(2L), D3D10_STENCIL_OP_REPLACE(3L), D3D10_STENCIL_OP_INCR_SAT(4L), D3D10_STENCIL_OP_DECR_SAT(5L), D3D10_STENCIL_OP_INVERT(6L), D3D10_STENCIL_OP_INCR(7L), D3D10_STENCIL_OP_DECR(8L);

    companion object {
        fun fromValue(v: Long): D3D10_STENCIL_OP = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_STENCIL_OP value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_BLEND}
 */
enum class D3D10_BLEND(val value: Long) {
    D3D10_BLEND_ZERO(1L), D3D10_BLEND_ONE(2L), D3D10_BLEND_SRC_COLOR(3L), D3D10_BLEND_INV_SRC_COLOR(4L), D3D10_BLEND_SRC_ALPHA(5L), D3D10_BLEND_INV_SRC_ALPHA(6L), D3D10_BLEND_DEST_ALPHA(7L), D3D10_BLEND_INV_DEST_ALPHA(8L), D3D10_BLEND_DEST_COLOR(9L), D3D10_BLEND_INV_DEST_COLOR(10L), D3D10_BLEND_SRC_ALPHA_SAT(11L), D3D10_BLEND_BLEND_FACTOR(14L), D3D10_BLEND_INV_BLEND_FACTOR(15L), D3D10_BLEND_SRC1_COLOR(16L), D3D10_BLEND_INV_SRC1_COLOR(17L), D3D10_BLEND_SRC1_ALPHA(18L), D3D10_BLEND_INV_SRC1_ALPHA(19L);

    companion object {
        fun fromValue(v: Long): D3D10_BLEND = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_BLEND value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_BLEND_OP}
 */
enum class D3D10_BLEND_OP(val value: Long) {
    D3D10_BLEND_OP_ADD(1L), D3D10_BLEND_OP_SUBTRACT(2L), D3D10_BLEND_OP_REV_SUBTRACT(3L), D3D10_BLEND_OP_MIN(4L), D3D10_BLEND_OP_MAX(5L);

    companion object {
        fun fromValue(v: Long): D3D10_BLEND_OP = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_BLEND_OP value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_COLOR_WRITE_ENABLE}
 */
enum class D3D10_COLOR_WRITE_ENABLE(val value: Long) {
    D3D10_COLOR_WRITE_ENABLE_RED(1L), D3D10_COLOR_WRITE_ENABLE_GREEN(2L), D3D10_COLOR_WRITE_ENABLE_BLUE(4L), D3D10_COLOR_WRITE_ENABLE_ALPHA(8L), D3D10_COLOR_WRITE_ENABLE_ALL(15L);

    companion object {
        fun fromValue(v: Long): D3D10_COLOR_WRITE_ENABLE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_COLOR_WRITE_ENABLE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_TEXTURECUBE_FACE}
 */
enum class D3D10_TEXTURECUBE_FACE(val value: Long) {
    D3D10_TEXTURECUBE_FACE_POSITIVE_X(0L), D3D10_TEXTURECUBE_FACE_NEGATIVE_X(1L), D3D10_TEXTURECUBE_FACE_POSITIVE_Y(2L), D3D10_TEXTURECUBE_FACE_NEGATIVE_Y(3L), D3D10_TEXTURECUBE_FACE_POSITIVE_Z(4L), D3D10_TEXTURECUBE_FACE_NEGATIVE_Z(5L);

    companion object {
        fun fromValue(v: Long): D3D10_TEXTURECUBE_FACE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_TEXTURECUBE_FACE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_FILTER}
 */
enum class D3D10_FILTER(val value: Long) {
    D3D10_FILTER_MIN_MAG_MIP_POINT(0L), D3D10_FILTER_MIN_MAG_POINT_MIP_LINEAR(1L), D3D10_FILTER_MIN_POINT_MAG_LINEAR_MIP_POINT(4L), D3D10_FILTER_MIN_POINT_MAG_MIP_LINEAR(5L), D3D10_FILTER_MIN_LINEAR_MAG_MIP_POINT(16L), D3D10_FILTER_MIN_LINEAR_MAG_POINT_MIP_LINEAR(17L), D3D10_FILTER_MIN_MAG_LINEAR_MIP_POINT(20L), D3D10_FILTER_MIN_MAG_MIP_LINEAR(21L), D3D10_FILTER_ANISOTROPIC(85L), D3D10_FILTER_COMPARISON_MIN_MAG_MIP_POINT(128L), D3D10_FILTER_COMPARISON_MIN_MAG_POINT_MIP_LINEAR(129L), D3D10_FILTER_COMPARISON_MIN_POINT_MAG_LINEAR_MIP_POINT(132L), D3D10_FILTER_COMPARISON_MIN_POINT_MAG_MIP_LINEAR(133L), D3D10_FILTER_COMPARISON_MIN_LINEAR_MAG_MIP_POINT(144L), D3D10_FILTER_COMPARISON_MIN_LINEAR_MAG_POINT_MIP_LINEAR(145L), D3D10_FILTER_COMPARISON_MIN_MAG_LINEAR_MIP_POINT(148L), D3D10_FILTER_COMPARISON_MIN_MAG_MIP_LINEAR(149L), D3D10_FILTER_COMPARISON_ANISOTROPIC(213L), D3D10_FILTER_TEXT_1BIT(-2147483648L);

    companion object {
        fun fromValue(v: Long): D3D10_FILTER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_FILTER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_FILTER_TYPE}
 */
enum class D3D10_FILTER_TYPE(val value: Long) {
    D3D10_FILTER_TYPE_POINT(0L), D3D10_FILTER_TYPE_LINEAR(1L);

    companion object {
        fun fromValue(v: Long): D3D10_FILTER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_FILTER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_TEXTURE_ADDRESS_MODE}
 */
enum class D3D10_TEXTURE_ADDRESS_MODE(val value: Long) {
    D3D10_TEXTURE_ADDRESS_WRAP(1L), D3D10_TEXTURE_ADDRESS_MIRROR(2L), D3D10_TEXTURE_ADDRESS_CLAMP(3L), D3D10_TEXTURE_ADDRESS_BORDER(4L), D3D10_TEXTURE_ADDRESS_MIRROR_ONCE(5L);

    companion object {
        fun fromValue(v: Long): D3D10_TEXTURE_ADDRESS_MODE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_TEXTURE_ADDRESS_MODE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_FORMAT_SUPPORT}
 */
enum class D3D10_FORMAT_SUPPORT(val value: Long) {
    D3D10_FORMAT_SUPPORT_BUFFER(1L), D3D10_FORMAT_SUPPORT_IA_VERTEX_BUFFER(2L), D3D10_FORMAT_SUPPORT_IA_INDEX_BUFFER(4L), D3D10_FORMAT_SUPPORT_SO_BUFFER(8L), D3D10_FORMAT_SUPPORT_TEXTURE1D(16L), D3D10_FORMAT_SUPPORT_TEXTURE2D(32L), D3D10_FORMAT_SUPPORT_TEXTURE3D(64L), D3D10_FORMAT_SUPPORT_TEXTURECUBE(128L), D3D10_FORMAT_SUPPORT_SHADER_LOAD(256L), D3D10_FORMAT_SUPPORT_SHADER_SAMPLE(512L), D3D10_FORMAT_SUPPORT_SHADER_SAMPLE_COMPARISON(1024L), D3D10_FORMAT_SUPPORT_SHADER_SAMPLE_MONO_TEXT(2048L), D3D10_FORMAT_SUPPORT_MIP(4096L), D3D10_FORMAT_SUPPORT_MIP_AUTOGEN(8192L), D3D10_FORMAT_SUPPORT_RENDER_TARGET(16384L), D3D10_FORMAT_SUPPORT_BLENDABLE(32768L), D3D10_FORMAT_SUPPORT_DEPTH_STENCIL(65536L), D3D10_FORMAT_SUPPORT_CPU_LOCKABLE(131072L), D3D10_FORMAT_SUPPORT_MULTISAMPLE_RESOLVE(262144L), D3D10_FORMAT_SUPPORT_DISPLAY(524288L), D3D10_FORMAT_SUPPORT_CAST_WITHIN_BIT_LAYOUT(1048576L), D3D10_FORMAT_SUPPORT_MULTISAMPLE_RENDERTARGET(2097152L), D3D10_FORMAT_SUPPORT_MULTISAMPLE_LOAD(4194304L), D3D10_FORMAT_SUPPORT_SHADER_GATHER(8388608L), D3D10_FORMAT_SUPPORT_BACK_BUFFER_CAST(16777216L);

    companion object {
        fun fromValue(v: Long): D3D10_FORMAT_SUPPORT = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_FORMAT_SUPPORT value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_ASYNC_GETDATA_FLAG}
 */
enum class D3D10_ASYNC_GETDATA_FLAG(val value: Long) {
    D3D10_ASYNC_GETDATA_DONOTFLUSH(1L);

    companion object {
        fun fromValue(v: Long): D3D10_ASYNC_GETDATA_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_ASYNC_GETDATA_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_QUERY}
 */
enum class D3D10_QUERY(val value: Long) {
    D3D10_QUERY_EVENT(0L), D3D10_QUERY_OCCLUSION(1L), D3D10_QUERY_TIMESTAMP(2L), D3D10_QUERY_TIMESTAMP_DISJOINT(3L), D3D10_QUERY_PIPELINE_STATISTICS(4L), D3D10_QUERY_OCCLUSION_PREDICATE(5L), D3D10_QUERY_SO_STATISTICS(6L), D3D10_QUERY_SO_OVERFLOW_PREDICATE(7L);

    companion object {
        fun fromValue(v: Long): D3D10_QUERY = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_QUERY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_QUERY_MISC_FLAG}
 */
enum class D3D10_QUERY_MISC_FLAG(val value: Long) {
    D3D10_QUERY_MISC_PREDICATEHINT(1L);

    companion object {
        fun fromValue(v: Long): D3D10_QUERY_MISC_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_QUERY_MISC_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_COUNTER}
 */
enum class D3D10_COUNTER(val value: Long) {
    D3D10_COUNTER_GPU_IDLE(0L), D3D10_COUNTER_VERTEX_PROCESSING(1L), D3D10_COUNTER_GEOMETRY_PROCESSING(2L), D3D10_COUNTER_PIXEL_PROCESSING(3L), D3D10_COUNTER_OTHER_GPU_PROCESSING(4L), D3D10_COUNTER_HOST_ADAPTER_BANDWIDTH_UTILIZATION(5L), D3D10_COUNTER_LOCAL_VIDMEM_BANDWIDTH_UTILIZATION(6L), D3D10_COUNTER_VERTEX_THROUGHPUT_UTILIZATION(7L), D3D10_COUNTER_TRIANGLE_SETUP_THROUGHPUT_UTILIZATION(8L), D3D10_COUNTER_FILLRATE_THROUGHPUT_UTILIZATION(9L), D3D10_COUNTER_VS_MEMORY_LIMITED(10L), D3D10_COUNTER_VS_COMPUTATION_LIMITED(11L), D3D10_COUNTER_GS_MEMORY_LIMITED(12L), D3D10_COUNTER_GS_COMPUTATION_LIMITED(13L), D3D10_COUNTER_PS_MEMORY_LIMITED(14L), D3D10_COUNTER_PS_COMPUTATION_LIMITED(15L), D3D10_COUNTER_POST_TRANSFORM_CACHE_HIT_RATE(16L), D3D10_COUNTER_TEXTURE_CACHE_HIT_RATE(17L), D3D10_COUNTER_DEVICE_DEPENDENT_0(1073741824L);

    companion object {
        fun fromValue(v: Long): D3D10_COUNTER = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_COUNTER value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_COUNTER_TYPE}
 */
enum class D3D10_COUNTER_TYPE(val value: Long) {
    D3D10_COUNTER_TYPE_FLOAT32(0L), D3D10_COUNTER_TYPE_UINT16(1L), D3D10_COUNTER_TYPE_UINT32(2L), D3D10_COUNTER_TYPE_UINT64(3L);

    companion object {
        fun fromValue(v: Long): D3D10_COUNTER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_COUNTER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_CREATE_DEVICE_FLAG}
 */
enum class D3D10_CREATE_DEVICE_FLAG(val value: Long) {
    D3D10_CREATE_DEVICE_SINGLETHREADED(1L), D3D10_CREATE_DEVICE_DEBUG(2L), D3D10_CREATE_DEVICE_SWITCH_TO_REF(4L), D3D10_CREATE_DEVICE_PREVENT_INTERNAL_THREADING_OPTIMIZATIONS(8L), D3D10_CREATE_DEVICE_ALLOW_NULL_FROM_MAP(16L), D3D10_CREATE_DEVICE_BGRA_SUPPORT(32L), D3D10_CREATE_DEVICE_PREVENT_ALTERING_LAYER_SETTINGS_FROM_REGISTRY(128L), D3D10_CREATE_DEVICE_STRICT_VALIDATION(512L), D3D10_CREATE_DEVICE_DEBUGGABLE(1024L);

    companion object {
        fun fromValue(v: Long): D3D10_CREATE_DEVICE_FLAG = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_CREATE_DEVICE_FLAG value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_MESSAGE_CATEGORY}
 */
enum class D3D10_MESSAGE_CATEGORY(val value: Long) {
    D3D10_MESSAGE_CATEGORY_APPLICATION_DEFINED(0L), D3D10_MESSAGE_CATEGORY_MISCELLANEOUS(1L), D3D10_MESSAGE_CATEGORY_INITIALIZATION(2L), D3D10_MESSAGE_CATEGORY_CLEANUP(3L), D3D10_MESSAGE_CATEGORY_COMPILATION(4L), D3D10_MESSAGE_CATEGORY_STATE_CREATION(5L), D3D10_MESSAGE_CATEGORY_STATE_SETTING(6L), D3D10_MESSAGE_CATEGORY_STATE_GETTING(7L), D3D10_MESSAGE_CATEGORY_RESOURCE_MANIPULATION(8L), D3D10_MESSAGE_CATEGORY_EXECUTION(9L), D3D10_MESSAGE_CATEGORY_SHADER(10L);

    companion object {
        fun fromValue(v: Long): D3D10_MESSAGE_CATEGORY = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_MESSAGE_CATEGORY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_MESSAGE_SEVERITY}
 */
enum class D3D10_MESSAGE_SEVERITY(val value: Long) {
    D3D10_MESSAGE_SEVERITY_CORRUPTION(0L), D3D10_MESSAGE_SEVERITY_ERROR(1L), D3D10_MESSAGE_SEVERITY_WARNING(2L), D3D10_MESSAGE_SEVERITY_INFO(3L), D3D10_MESSAGE_SEVERITY_MESSAGE(4L);

    companion object {
        fun fromValue(v: Long): D3D10_MESSAGE_SEVERITY = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_MESSAGE_SEVERITY value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_MESSAGE_ID}
 */
enum class D3D10_MESSAGE_ID(val value: Long) {
    D3D10_MESSAGE_ID_UNKNOWN(0L), D3D10_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_HAZARD(1L), D3D10_MESSAGE_ID_DEVICE_IASETINDEXBUFFER_HAZARD(2L), D3D10_MESSAGE_ID_DEVICE_VSSETSHADERRESOURCES_HAZARD(3L), D3D10_MESSAGE_ID_DEVICE_VSSETCONSTANTBUFFERS_HAZARD(4L), D3D10_MESSAGE_ID_DEVICE_GSSETSHADERRESOURCES_HAZARD(5L), D3D10_MESSAGE_ID_DEVICE_GSSETCONSTANTBUFFERS_HAZARD(6L), D3D10_MESSAGE_ID_DEVICE_PSSETSHADERRESOURCES_HAZARD(7L), D3D10_MESSAGE_ID_DEVICE_PSSETCONSTANTBUFFERS_HAZARD(8L), D3D10_MESSAGE_ID_DEVICE_OMSETRENDERTARGETS_HAZARD(9L), D3D10_MESSAGE_ID_DEVICE_SOSETTARGETS_HAZARD(10L), D3D10_MESSAGE_ID_STRING_FROM_APPLICATION(11L), D3D10_MESSAGE_ID_CORRUPTED_THIS(12L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER1(13L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER2(14L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER3(15L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER4(16L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER5(17L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER6(18L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER7(19L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER8(20L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER9(21L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER10(22L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER11(23L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER12(24L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER13(25L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER14(26L), D3D10_MESSAGE_ID_CORRUPTED_PARAMETER15(27L), D3D10_MESSAGE_ID_CORRUPTED_MULTITHREADING(28L), D3D10_MESSAGE_ID_MESSAGE_REPORTING_OUTOFMEMORY(29L), D3D10_MESSAGE_ID_IASETINPUTLAYOUT_UNBINDDELETINGOBJECT(30L), D3D10_MESSAGE_ID_IASETVERTEXBUFFERS_UNBINDDELETINGOBJECT(31L), D3D10_MESSAGE_ID_IASETINDEXBUFFER_UNBINDDELETINGOBJECT(32L), D3D10_MESSAGE_ID_VSSETSHADER_UNBINDDELETINGOBJECT(33L), D3D10_MESSAGE_ID_VSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(34L), D3D10_MESSAGE_ID_VSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(35L), D3D10_MESSAGE_ID_VSSETSAMPLERS_UNBINDDELETINGOBJECT(36L), D3D10_MESSAGE_ID_GSSETSHADER_UNBINDDELETINGOBJECT(37L), D3D10_MESSAGE_ID_GSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(38L), D3D10_MESSAGE_ID_GSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(39L), D3D10_MESSAGE_ID_GSSETSAMPLERS_UNBINDDELETINGOBJECT(40L), D3D10_MESSAGE_ID_SOSETTARGETS_UNBINDDELETINGOBJECT(41L), D3D10_MESSAGE_ID_PSSETSHADER_UNBINDDELETINGOBJECT(42L), D3D10_MESSAGE_ID_PSSETSHADERRESOURCES_UNBINDDELETINGOBJECT(43L), D3D10_MESSAGE_ID_PSSETCONSTANTBUFFERS_UNBINDDELETINGOBJECT(44L), D3D10_MESSAGE_ID_PSSETSAMPLERS_UNBINDDELETINGOBJECT(45L), D3D10_MESSAGE_ID_RSSETSTATE_UNBINDDELETINGOBJECT(46L), D3D10_MESSAGE_ID_OMSETBLENDSTATE_UNBINDDELETINGOBJECT(47L), D3D10_MESSAGE_ID_OMSETDEPTHSTENCILSTATE_UNBINDDELETINGOBJECT(48L), D3D10_MESSAGE_ID_OMSETRENDERTARGETS_UNBINDDELETINGOBJECT(49L), D3D10_MESSAGE_ID_SETPREDICATION_UNBINDDELETINGOBJECT(50L), D3D10_MESSAGE_ID_GETPRIVATEDATA_MOREDATA(51L), D3D10_MESSAGE_ID_SETPRIVATEDATA_INVALIDFREEDATA(52L), D3D10_MESSAGE_ID_SETPRIVATEDATA_INVALIDIUNKNOWN(53L), D3D10_MESSAGE_ID_SETPRIVATEDATA_INVALIDFLAGS(54L), D3D10_MESSAGE_ID_SETPRIVATEDATA_CHANGINGPARAMS(55L), D3D10_MESSAGE_ID_SETPRIVATEDATA_OUTOFMEMORY(56L), D3D10_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDFORMAT(57L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDSAMPLES(58L), D3D10_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDUSAGE(59L), D3D10_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDBINDFLAGS(60L), D3D10_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDCPUACCESSFLAGS(61L), D3D10_MESSAGE_ID_CREATEBUFFER_UNRECOGNIZEDMISCFLAGS(62L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDCPUACCESSFLAGS(63L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDBINDFLAGS(64L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDINITIALDATA(65L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDDIMENSIONS(66L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDMIPLEVELS(67L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDMISCFLAGS(68L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDARG_RETURN(69L), D3D10_MESSAGE_ID_CREATEBUFFER_OUTOFMEMORY_RETURN(70L), D3D10_MESSAGE_ID_CREATEBUFFER_NULLDESC(71L), D3D10_MESSAGE_ID_CREATEBUFFER_INVALIDCONSTANTBUFFERBINDINGS(72L), D3D10_MESSAGE_ID_CREATEBUFFER_LARGEALLOCATION(73L), D3D10_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDFORMAT(74L), D3D10_MESSAGE_ID_CREATETEXTURE1D_UNSUPPORTEDFORMAT(75L), D3D10_MESSAGE_ID_CREATETEXTURE1D_INVALIDSAMPLES(76L), D3D10_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDUSAGE(77L), D3D10_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDBINDFLAGS(78L), D3D10_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDCPUACCESSFLAGS(79L), D3D10_MESSAGE_ID_CREATETEXTURE1D_UNRECOGNIZEDMISCFLAGS(80L), D3D10_MESSAGE_ID_CREATETEXTURE1D_INVALIDCPUACCESSFLAGS(81L), D3D10_MESSAGE_ID_CREATETEXTURE1D_INVALIDBINDFLAGS(82L), D3D10_MESSAGE_ID_CREATETEXTURE1D_INVALIDINITIALDATA(83L), D3D10_MESSAGE_ID_CREATETEXTURE1D_INVALIDDIMENSIONS(84L), D3D10_MESSAGE_ID_CREATETEXTURE1D_INVALIDMIPLEVELS(85L), D3D10_MESSAGE_ID_CREATETEXTURE1D_INVALIDMISCFLAGS(86L), D3D10_MESSAGE_ID_CREATETEXTURE1D_INVALIDARG_RETURN(87L), D3D10_MESSAGE_ID_CREATETEXTURE1D_OUTOFMEMORY_RETURN(88L), D3D10_MESSAGE_ID_CREATETEXTURE1D_NULLDESC(89L), D3D10_MESSAGE_ID_CREATETEXTURE1D_LARGEALLOCATION(90L), D3D10_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDFORMAT(91L), D3D10_MESSAGE_ID_CREATETEXTURE2D_UNSUPPORTEDFORMAT(92L), D3D10_MESSAGE_ID_CREATETEXTURE2D_INVALIDSAMPLES(93L), D3D10_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDUSAGE(94L), D3D10_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDBINDFLAGS(95L), D3D10_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDCPUACCESSFLAGS(96L), D3D10_MESSAGE_ID_CREATETEXTURE2D_UNRECOGNIZEDMISCFLAGS(97L), D3D10_MESSAGE_ID_CREATETEXTURE2D_INVALIDCPUACCESSFLAGS(98L), D3D10_MESSAGE_ID_CREATETEXTURE2D_INVALIDBINDFLAGS(99L), D3D10_MESSAGE_ID_CREATETEXTURE2D_INVALIDINITIALDATA(100L), D3D10_MESSAGE_ID_CREATETEXTURE2D_INVALIDDIMENSIONS(101L), D3D10_MESSAGE_ID_CREATETEXTURE2D_INVALIDMIPLEVELS(102L), D3D10_MESSAGE_ID_CREATETEXTURE2D_INVALIDMISCFLAGS(103L), D3D10_MESSAGE_ID_CREATETEXTURE2D_INVALIDARG_RETURN(104L), D3D10_MESSAGE_ID_CREATETEXTURE2D_OUTOFMEMORY_RETURN(105L), D3D10_MESSAGE_ID_CREATETEXTURE2D_NULLDESC(106L), D3D10_MESSAGE_ID_CREATETEXTURE2D_LARGEALLOCATION(107L), D3D10_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDFORMAT(108L), D3D10_MESSAGE_ID_CREATETEXTURE3D_UNSUPPORTEDFORMAT(109L), D3D10_MESSAGE_ID_CREATETEXTURE3D_INVALIDSAMPLES(110L), D3D10_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDUSAGE(111L), D3D10_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDBINDFLAGS(112L), D3D10_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDCPUACCESSFLAGS(113L), D3D10_MESSAGE_ID_CREATETEXTURE3D_UNRECOGNIZEDMISCFLAGS(114L), D3D10_MESSAGE_ID_CREATETEXTURE3D_INVALIDCPUACCESSFLAGS(115L), D3D10_MESSAGE_ID_CREATETEXTURE3D_INVALIDBINDFLAGS(116L), D3D10_MESSAGE_ID_CREATETEXTURE3D_INVALIDINITIALDATA(117L), D3D10_MESSAGE_ID_CREATETEXTURE3D_INVALIDDIMENSIONS(118L), D3D10_MESSAGE_ID_CREATETEXTURE3D_INVALIDMIPLEVELS(119L), D3D10_MESSAGE_ID_CREATETEXTURE3D_INVALIDMISCFLAGS(120L), D3D10_MESSAGE_ID_CREATETEXTURE3D_INVALIDARG_RETURN(121L), D3D10_MESSAGE_ID_CREATETEXTURE3D_OUTOFMEMORY_RETURN(122L), D3D10_MESSAGE_ID_CREATETEXTURE3D_NULLDESC(123L), D3D10_MESSAGE_ID_CREATETEXTURE3D_LARGEALLOCATION(124L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_UNRECOGNIZEDFORMAT(125L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDDESC(126L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDFORMAT(127L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDDIMENSIONS(128L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDRESOURCE(129L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_TOOMANYOBJECTS(130L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_INVALIDARG_RETURN(131L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_OUTOFMEMORY_RETURN(132L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_UNRECOGNIZEDFORMAT(133L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_UNSUPPORTEDFORMAT(134L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDDESC(135L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDFORMAT(136L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDDIMENSIONS(137L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDRESOURCE(138L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_TOOMANYOBJECTS(139L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_INVALIDARG_RETURN(140L), D3D10_MESSAGE_ID_CREATERENDERTARGETVIEW_OUTOFMEMORY_RETURN(141L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_UNRECOGNIZEDFORMAT(142L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDDESC(143L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDFORMAT(144L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDDIMENSIONS(145L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDRESOURCE(146L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_TOOMANYOBJECTS(147L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_INVALIDARG_RETURN(148L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILVIEW_OUTOFMEMORY_RETURN(149L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_OUTOFMEMORY(150L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_TOOMANYELEMENTS(151L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDFORMAT(152L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_INCOMPATIBLEFORMAT(153L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDSLOT(154L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDINPUTSLOTCLASS(155L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_STEPRATESLOTCLASSMISMATCH(156L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDSLOTCLASSCHANGE(157L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDSTEPRATECHANGE(158L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_INVALIDALIGNMENT(159L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_DUPLICATESEMANTIC(160L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_UNPARSEABLEINPUTSIGNATURE(161L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_NULLSEMANTIC(162L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_MISSINGELEMENT(163L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_NULLDESC(164L), D3D10_MESSAGE_ID_CREATEVERTEXSHADER_OUTOFMEMORY(165L), D3D10_MESSAGE_ID_CREATEVERTEXSHADER_INVALIDSHADERBYTECODE(166L), D3D10_MESSAGE_ID_CREATEVERTEXSHADER_INVALIDSHADERTYPE(167L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADER_OUTOFMEMORY(168L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADER_INVALIDSHADERBYTECODE(169L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADER_INVALIDSHADERTYPE(170L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_OUTOFMEMORY(171L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDSHADERBYTECODE(172L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDSHADERTYPE(173L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDNUMENTRIES(174L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_OUTPUTSTREAMSTRIDEUNUSED(175L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_UNEXPECTEDDECL(176L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_EXPECTEDDECL(177L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_OUTPUTSLOT0EXPECTED(178L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDOUTPUTSLOT(179L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_ONLYONEELEMENTPERSLOT(180L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDCOMPONENTCOUNT(181L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDSTARTCOMPONENTANDCOMPONENTCOUNT(182L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDGAPDEFINITION(183L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_REPEATEDOUTPUT(184L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_INVALIDOUTPUTSTREAMSTRIDE(185L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_MISSINGSEMANTIC(186L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_MASKMISMATCH(187L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_CANTHAVEONLYGAPS(188L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_DECLTOOCOMPLEX(189L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_MISSINGOUTPUTSIGNATURE(190L), D3D10_MESSAGE_ID_CREATEPIXELSHADER_OUTOFMEMORY(191L), D3D10_MESSAGE_ID_CREATEPIXELSHADER_INVALIDSHADERBYTECODE(192L), D3D10_MESSAGE_ID_CREATEPIXELSHADER_INVALIDSHADERTYPE(193L), D3D10_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDFILLMODE(194L), D3D10_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDCULLMODE(195L), D3D10_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDDEPTHBIASCLAMP(196L), D3D10_MESSAGE_ID_CREATERASTERIZERSTATE_INVALIDSLOPESCALEDDEPTHBIAS(197L), D3D10_MESSAGE_ID_CREATERASTERIZERSTATE_TOOMANYOBJECTS(198L), D3D10_MESSAGE_ID_CREATERASTERIZERSTATE_NULLDESC(199L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDDEPTHWRITEMASK(200L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDDEPTHFUNC(201L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDFRONTFACESTENCILFAILOP(202L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDFRONTFACESTENCILZFAILOP(203L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDFRONTFACESTENCILPASSOP(204L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDFRONTFACESTENCILFUNC(205L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDBACKFACESTENCILFAILOP(206L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDBACKFACESTENCILZFAILOP(207L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDBACKFACESTENCILPASSOP(208L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_INVALIDBACKFACESTENCILFUNC(209L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_TOOMANYOBJECTS(210L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_NULLDESC(211L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_INVALIDSRCBLEND(212L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_INVALIDDESTBLEND(213L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_INVALIDBLENDOP(214L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_INVALIDSRCBLENDALPHA(215L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_INVALIDDESTBLENDALPHA(216L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_INVALIDBLENDOPALPHA(217L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_INVALIDRENDERTARGETWRITEMASK(218L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_TOOMANYOBJECTS(219L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_NULLDESC(220L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDFILTER(221L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDADDRESSU(222L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDADDRESSV(223L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDADDRESSW(224L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDMIPLODBIAS(225L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDMAXANISOTROPY(226L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDCOMPARISONFUNC(227L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDMINLOD(228L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_INVALIDMAXLOD(229L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_TOOMANYOBJECTS(230L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_NULLDESC(231L), D3D10_MESSAGE_ID_CREATEQUERYORPREDICATE_INVALIDQUERY(232L), D3D10_MESSAGE_ID_CREATEQUERYORPREDICATE_INVALIDMISCFLAGS(233L), D3D10_MESSAGE_ID_CREATEQUERYORPREDICATE_UNEXPECTEDMISCFLAG(234L), D3D10_MESSAGE_ID_CREATEQUERYORPREDICATE_NULLDESC(235L), D3D10_MESSAGE_ID_DEVICE_IASETPRIMITIVETOPOLOGY_TOPOLOGY_UNRECOGNIZED(236L), D3D10_MESSAGE_ID_DEVICE_IASETPRIMITIVETOPOLOGY_TOPOLOGY_UNDEFINED(237L), D3D10_MESSAGE_ID_IASETVERTEXBUFFERS_INVALIDBUFFER(238L), D3D10_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_OFFSET_TOO_LARGE(239L), D3D10_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_BUFFERS_EMPTY(240L), D3D10_MESSAGE_ID_IASETINDEXBUFFER_INVALIDBUFFER(241L), D3D10_MESSAGE_ID_DEVICE_IASETINDEXBUFFER_FORMAT_INVALID(242L), D3D10_MESSAGE_ID_DEVICE_IASETINDEXBUFFER_OFFSET_TOO_LARGE(243L), D3D10_MESSAGE_ID_DEVICE_IASETINDEXBUFFER_OFFSET_UNALIGNED(244L), D3D10_MESSAGE_ID_DEVICE_VSSETSHADERRESOURCES_VIEWS_EMPTY(245L), D3D10_MESSAGE_ID_VSSETCONSTANTBUFFERS_INVALIDBUFFER(246L), D3D10_MESSAGE_ID_DEVICE_VSSETCONSTANTBUFFERS_BUFFERS_EMPTY(247L), D3D10_MESSAGE_ID_DEVICE_VSSETSAMPLERS_SAMPLERS_EMPTY(248L), D3D10_MESSAGE_ID_DEVICE_GSSETSHADERRESOURCES_VIEWS_EMPTY(249L), D3D10_MESSAGE_ID_GSSETCONSTANTBUFFERS_INVALIDBUFFER(250L), D3D10_MESSAGE_ID_DEVICE_GSSETCONSTANTBUFFERS_BUFFERS_EMPTY(251L), D3D10_MESSAGE_ID_DEVICE_GSSETSAMPLERS_SAMPLERS_EMPTY(252L), D3D10_MESSAGE_ID_SOSETTARGETS_INVALIDBUFFER(253L), D3D10_MESSAGE_ID_DEVICE_SOSETTARGETS_OFFSET_UNALIGNED(254L), D3D10_MESSAGE_ID_DEVICE_PSSETSHADERRESOURCES_VIEWS_EMPTY(255L), D3D10_MESSAGE_ID_PSSETCONSTANTBUFFERS_INVALIDBUFFER(256L), D3D10_MESSAGE_ID_DEVICE_PSSETCONSTANTBUFFERS_BUFFERS_EMPTY(257L), D3D10_MESSAGE_ID_DEVICE_PSSETSAMPLERS_SAMPLERS_EMPTY(258L), D3D10_MESSAGE_ID_DEVICE_RSSETVIEWPORTS_INVALIDVIEWPORT(259L), D3D10_MESSAGE_ID_DEVICE_RSSETSCISSORRECTS_INVALIDSCISSOR(260L), D3D10_MESSAGE_ID_CLEARRENDERTARGETVIEW_DENORMFLUSH(261L), D3D10_MESSAGE_ID_CLEARDEPTHSTENCILVIEW_DENORMFLUSH(262L), D3D10_MESSAGE_ID_CLEARDEPTHSTENCILVIEW_INVALID(263L), D3D10_MESSAGE_ID_DEVICE_IAGETVERTEXBUFFERS_BUFFERS_EMPTY(264L), D3D10_MESSAGE_ID_DEVICE_VSGETSHADERRESOURCES_VIEWS_EMPTY(265L), D3D10_MESSAGE_ID_DEVICE_VSGETCONSTANTBUFFERS_BUFFERS_EMPTY(266L), D3D10_MESSAGE_ID_DEVICE_VSGETSAMPLERS_SAMPLERS_EMPTY(267L), D3D10_MESSAGE_ID_DEVICE_GSGETSHADERRESOURCES_VIEWS_EMPTY(268L), D3D10_MESSAGE_ID_DEVICE_GSGETCONSTANTBUFFERS_BUFFERS_EMPTY(269L), D3D10_MESSAGE_ID_DEVICE_GSGETSAMPLERS_SAMPLERS_EMPTY(270L), D3D10_MESSAGE_ID_DEVICE_SOGETTARGETS_BUFFERS_EMPTY(271L), D3D10_MESSAGE_ID_DEVICE_PSGETSHADERRESOURCES_VIEWS_EMPTY(272L), D3D10_MESSAGE_ID_DEVICE_PSGETCONSTANTBUFFERS_BUFFERS_EMPTY(273L), D3D10_MESSAGE_ID_DEVICE_PSGETSAMPLERS_SAMPLERS_EMPTY(274L), D3D10_MESSAGE_ID_DEVICE_RSGETVIEWPORTS_VIEWPORTS_EMPTY(275L), D3D10_MESSAGE_ID_DEVICE_RSGETSCISSORRECTS_RECTS_EMPTY(276L), D3D10_MESSAGE_ID_DEVICE_GENERATEMIPS_RESOURCE_INVALID(277L), D3D10_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDDESTINATIONSUBRESOURCE(278L), D3D10_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDSOURCESUBRESOURCE(279L), D3D10_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDSOURCEBOX(280L), D3D10_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDSOURCE(281L), D3D10_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDDESTINATIONSTATE(282L), D3D10_MESSAGE_ID_COPYSUBRESOURCEREGION_INVALIDSOURCESTATE(283L), D3D10_MESSAGE_ID_COPYRESOURCE_INVALIDSOURCE(284L), D3D10_MESSAGE_ID_COPYRESOURCE_INVALIDDESTINATIONSTATE(285L), D3D10_MESSAGE_ID_COPYRESOURCE_INVALIDSOURCESTATE(286L), D3D10_MESSAGE_ID_UPDATESUBRESOURCE_INVALIDDESTINATIONSUBRESOURCE(287L), D3D10_MESSAGE_ID_UPDATESUBRESOURCE_INVALIDDESTINATIONBOX(288L), D3D10_MESSAGE_ID_UPDATESUBRESOURCE_INVALIDDESTINATIONSTATE(289L), D3D10_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_DESTINATION_INVALID(290L), D3D10_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_DESTINATION_SUBRESOURCE_INVALID(291L), D3D10_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_SOURCE_INVALID(292L), D3D10_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_SOURCE_SUBRESOURCE_INVALID(293L), D3D10_MESSAGE_ID_DEVICE_RESOLVESUBRESOURCE_FORMAT_INVALID(294L), D3D10_MESSAGE_ID_BUFFER_MAP_INVALIDMAPTYPE(295L), D3D10_MESSAGE_ID_BUFFER_MAP_INVALIDFLAGS(296L), D3D10_MESSAGE_ID_BUFFER_MAP_ALREADYMAPPED(297L), D3D10_MESSAGE_ID_BUFFER_MAP_DEVICEREMOVED_RETURN(298L), D3D10_MESSAGE_ID_BUFFER_UNMAP_NOTMAPPED(299L), D3D10_MESSAGE_ID_TEXTURE1D_MAP_INVALIDMAPTYPE(300L), D3D10_MESSAGE_ID_TEXTURE1D_MAP_INVALIDSUBRESOURCE(301L), D3D10_MESSAGE_ID_TEXTURE1D_MAP_INVALIDFLAGS(302L), D3D10_MESSAGE_ID_TEXTURE1D_MAP_ALREADYMAPPED(303L), D3D10_MESSAGE_ID_TEXTURE1D_MAP_DEVICEREMOVED_RETURN(304L), D3D10_MESSAGE_ID_TEXTURE1D_UNMAP_INVALIDSUBRESOURCE(305L), D3D10_MESSAGE_ID_TEXTURE1D_UNMAP_NOTMAPPED(306L), D3D10_MESSAGE_ID_TEXTURE2D_MAP_INVALIDMAPTYPE(307L), D3D10_MESSAGE_ID_TEXTURE2D_MAP_INVALIDSUBRESOURCE(308L), D3D10_MESSAGE_ID_TEXTURE2D_MAP_INVALIDFLAGS(309L), D3D10_MESSAGE_ID_TEXTURE2D_MAP_ALREADYMAPPED(310L), D3D10_MESSAGE_ID_TEXTURE2D_MAP_DEVICEREMOVED_RETURN(311L), D3D10_MESSAGE_ID_TEXTURE2D_UNMAP_INVALIDSUBRESOURCE(312L), D3D10_MESSAGE_ID_TEXTURE2D_UNMAP_NOTMAPPED(313L), D3D10_MESSAGE_ID_TEXTURE3D_MAP_INVALIDMAPTYPE(314L), D3D10_MESSAGE_ID_TEXTURE3D_MAP_INVALIDSUBRESOURCE(315L), D3D10_MESSAGE_ID_TEXTURE3D_MAP_INVALIDFLAGS(316L), D3D10_MESSAGE_ID_TEXTURE3D_MAP_ALREADYMAPPED(317L), D3D10_MESSAGE_ID_TEXTURE3D_MAP_DEVICEREMOVED_RETURN(318L), D3D10_MESSAGE_ID_TEXTURE3D_UNMAP_INVALIDSUBRESOURCE(319L), D3D10_MESSAGE_ID_TEXTURE3D_UNMAP_NOTMAPPED(320L), D3D10_MESSAGE_ID_CHECKFORMATSUPPORT_FORMAT_DEPRECATED(321L), D3D10_MESSAGE_ID_CHECKMULTISAMPLEQUALITYLEVELS_FORMAT_DEPRECATED(322L), D3D10_MESSAGE_ID_SETEXCEPTIONMODE_UNRECOGNIZEDFLAGS(323L), D3D10_MESSAGE_ID_SETEXCEPTIONMODE_INVALIDARG_RETURN(324L), D3D10_MESSAGE_ID_SETEXCEPTIONMODE_DEVICEREMOVED_RETURN(325L), D3D10_MESSAGE_ID_REF_SIMULATING_INFINITELY_FAST_HARDWARE(326L), D3D10_MESSAGE_ID_REF_THREADING_MODE(327L), D3D10_MESSAGE_ID_REF_UMDRIVER_EXCEPTION(328L), D3D10_MESSAGE_ID_REF_KMDRIVER_EXCEPTION(329L), D3D10_MESSAGE_ID_REF_HARDWARE_EXCEPTION(330L), D3D10_MESSAGE_ID_REF_ACCESSING_INDEXABLE_TEMP_OUT_OF_RANGE(331L), D3D10_MESSAGE_ID_REF_PROBLEM_PARSING_SHADER(332L), D3D10_MESSAGE_ID_REF_OUT_OF_MEMORY(333L), D3D10_MESSAGE_ID_REF_INFO(334L), D3D10_MESSAGE_ID_DEVICE_DRAW_VERTEXPOS_OVERFLOW(335L), D3D10_MESSAGE_ID_DEVICE_DRAWINDEXED_INDEXPOS_OVERFLOW(336L), D3D10_MESSAGE_ID_DEVICE_DRAWINSTANCED_VERTEXPOS_OVERFLOW(337L), D3D10_MESSAGE_ID_DEVICE_DRAWINSTANCED_INSTANCEPOS_OVERFLOW(338L), D3D10_MESSAGE_ID_DEVICE_DRAWINDEXEDINSTANCED_INSTANCEPOS_OVERFLOW(339L), D3D10_MESSAGE_ID_DEVICE_DRAWINDEXEDINSTANCED_INDEXPOS_OVERFLOW(340L), D3D10_MESSAGE_ID_DEVICE_DRAW_VERTEX_SHADER_NOT_SET(341L), D3D10_MESSAGE_ID_DEVICE_SHADER_LINKAGE_SEMANTICNAME_NOT_FOUND(342L), D3D10_MESSAGE_ID_DEVICE_SHADER_LINKAGE_REGISTERINDEX(343L), D3D10_MESSAGE_ID_DEVICE_SHADER_LINKAGE_COMPONENTTYPE(344L), D3D10_MESSAGE_ID_DEVICE_SHADER_LINKAGE_REGISTERMASK(345L), D3D10_MESSAGE_ID_DEVICE_SHADER_LINKAGE_SYSTEMVALUE(346L), D3D10_MESSAGE_ID_DEVICE_SHADER_LINKAGE_NEVERWRITTEN_ALWAYSREADS(347L), D3D10_MESSAGE_ID_DEVICE_DRAW_VERTEX_BUFFER_NOT_SET(348L), D3D10_MESSAGE_ID_DEVICE_DRAW_INPUTLAYOUT_NOT_SET(349L), D3D10_MESSAGE_ID_DEVICE_DRAW_CONSTANT_BUFFER_NOT_SET(350L), D3D10_MESSAGE_ID_DEVICE_DRAW_CONSTANT_BUFFER_TOO_SMALL(351L), D3D10_MESSAGE_ID_DEVICE_DRAW_SAMPLER_NOT_SET(352L), D3D10_MESSAGE_ID_DEVICE_DRAW_SHADERRESOURCEVIEW_NOT_SET(353L), D3D10_MESSAGE_ID_DEVICE_DRAW_VIEW_DIMENSION_MISMATCH(354L), D3D10_MESSAGE_ID_DEVICE_DRAW_VERTEX_BUFFER_STRIDE_TOO_SMALL(355L), D3D10_MESSAGE_ID_DEVICE_DRAW_VERTEX_BUFFER_TOO_SMALL(356L), D3D10_MESSAGE_ID_DEVICE_DRAW_INDEX_BUFFER_NOT_SET(357L), D3D10_MESSAGE_ID_DEVICE_DRAW_INDEX_BUFFER_FORMAT_INVALID(358L), D3D10_MESSAGE_ID_DEVICE_DRAW_INDEX_BUFFER_TOO_SMALL(359L), D3D10_MESSAGE_ID_DEVICE_DRAW_GS_INPUT_PRIMITIVE_MISMATCH(360L), D3D10_MESSAGE_ID_DEVICE_DRAW_RESOURCE_RETURN_TYPE_MISMATCH(361L), D3D10_MESSAGE_ID_DEVICE_DRAW_POSITION_NOT_PRESENT(362L), D3D10_MESSAGE_ID_DEVICE_DRAW_OUTPUT_STREAM_NOT_SET(363L), D3D10_MESSAGE_ID_DEVICE_DRAW_BOUND_RESOURCE_MAPPED(364L), D3D10_MESSAGE_ID_DEVICE_DRAW_INVALID_PRIMITIVETOPOLOGY(365L), D3D10_MESSAGE_ID_DEVICE_DRAW_VERTEX_OFFSET_UNALIGNED(366L), D3D10_MESSAGE_ID_DEVICE_DRAW_VERTEX_STRIDE_UNALIGNED(367L), D3D10_MESSAGE_ID_DEVICE_DRAW_INDEX_OFFSET_UNALIGNED(368L), D3D10_MESSAGE_ID_DEVICE_DRAW_OUTPUT_STREAM_OFFSET_UNALIGNED(369L), D3D10_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_LD_UNSUPPORTED(370L), D3D10_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_SAMPLE_UNSUPPORTED(371L), D3D10_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_SAMPLE_C_UNSUPPORTED(372L), D3D10_MESSAGE_ID_DEVICE_DRAW_RESOURCE_MULTISAMPLE_UNSUPPORTED(373L), D3D10_MESSAGE_ID_DEVICE_DRAW_SO_TARGETS_BOUND_WITHOUT_SOURCE(374L), D3D10_MESSAGE_ID_DEVICE_DRAW_SO_STRIDE_LARGER_THAN_BUFFER(375L), D3D10_MESSAGE_ID_DEVICE_DRAW_OM_RENDER_TARGET_DOES_NOT_SUPPORT_BLENDING(376L), D3D10_MESSAGE_ID_DEVICE_DRAW_OM_DUAL_SOURCE_BLENDING_CAN_ONLY_HAVE_RENDER_TARGET_0(377L), D3D10_MESSAGE_ID_DEVICE_REMOVAL_PROCESS_AT_FAULT(378L), D3D10_MESSAGE_ID_DEVICE_REMOVAL_PROCESS_POSSIBLY_AT_FAULT(379L), D3D10_MESSAGE_ID_DEVICE_REMOVAL_PROCESS_NOT_AT_FAULT(380L), D3D10_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE_INVALIDARG_RETURN(381L), D3D10_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE_OUTOFMEMORY_RETURN(382L), D3D10_MESSAGE_ID_DEVICE_OPEN_SHARED_RESOURCE_BADINTERFACE_RETURN(383L), D3D10_MESSAGE_ID_DEVICE_DRAW_VIEWPORT_NOT_SET(384L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_TRAILING_DIGIT_IN_SEMANTIC(385L), D3D10_MESSAGE_ID_CREATEGEOMETRYSHADERWITHSTREAMOUTPUT_TRAILING_DIGIT_IN_SEMANTIC(386L), D3D10_MESSAGE_ID_DEVICE_RSSETVIEWPORTS_DENORMFLUSH(387L), D3D10_MESSAGE_ID_OMSETRENDERTARGETS_INVALIDVIEW(388L), D3D10_MESSAGE_ID_DEVICE_SETTEXTFILTERSIZE_INVALIDDIMENSIONS(389L), D3D10_MESSAGE_ID_DEVICE_DRAW_SAMPLER_MISMATCH(390L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_TYPE_MISMATCH(391L), D3D10_MESSAGE_ID_BLENDSTATE_GETDESC_LEGACY(392L), D3D10_MESSAGE_ID_SHADERRESOURCEVIEW_GETDESC_LEGACY(393L), D3D10_MESSAGE_ID_CREATEQUERY_OUTOFMEMORY_RETURN(394L), D3D10_MESSAGE_ID_CREATEPREDICATE_OUTOFMEMORY_RETURN(395L), D3D10_MESSAGE_ID_CREATECOUNTER_OUTOFRANGE_COUNTER(396L), D3D10_MESSAGE_ID_CREATECOUNTER_SIMULTANEOUS_ACTIVE_COUNTERS_EXHAUSTED(397L), D3D10_MESSAGE_ID_CREATECOUNTER_UNSUPPORTED_WELLKNOWN_COUNTER(398L), D3D10_MESSAGE_ID_CREATECOUNTER_OUTOFMEMORY_RETURN(399L), D3D10_MESSAGE_ID_CREATECOUNTER_NONEXCLUSIVE_RETURN(400L), D3D10_MESSAGE_ID_CREATECOUNTER_NULLDESC(401L), D3D10_MESSAGE_ID_CHECKCOUNTER_OUTOFRANGE_COUNTER(402L), D3D10_MESSAGE_ID_CHECKCOUNTER_UNSUPPORTED_WELLKNOWN_COUNTER(403L), D3D10_MESSAGE_ID_SETPREDICATION_INVALID_PREDICATE_STATE(404L), D3D10_MESSAGE_ID_QUERY_BEGIN_UNSUPPORTED(405L), D3D10_MESSAGE_ID_PREDICATE_BEGIN_DURING_PREDICATION(406L), D3D10_MESSAGE_ID_QUERY_BEGIN_DUPLICATE(407L), D3D10_MESSAGE_ID_QUERY_BEGIN_ABANDONING_PREVIOUS_RESULTS(408L), D3D10_MESSAGE_ID_PREDICATE_END_DURING_PREDICATION(409L), D3D10_MESSAGE_ID_QUERY_END_ABANDONING_PREVIOUS_RESULTS(410L), D3D10_MESSAGE_ID_QUERY_END_WITHOUT_BEGIN(411L), D3D10_MESSAGE_ID_QUERY_GETDATA_INVALID_DATASIZE(412L), D3D10_MESSAGE_ID_QUERY_GETDATA_INVALID_FLAGS(413L), D3D10_MESSAGE_ID_QUERY_GETDATA_INVALID_CALL(414L), D3D10_MESSAGE_ID_DEVICE_DRAW_PS_OUTPUT_TYPE_MISMATCH(415L), D3D10_MESSAGE_ID_DEVICE_DRAW_RESOURCE_FORMAT_GATHER_UNSUPPORTED(416L), D3D10_MESSAGE_ID_DEVICE_DRAW_INVALID_USE_OF_CENTER_MULTISAMPLE_PATTERN(417L), D3D10_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_STRIDE_TOO_LARGE(418L), D3D10_MESSAGE_ID_DEVICE_IASETVERTEXBUFFERS_INVALIDRANGE(419L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_EMPTY_LAYOUT(420L), D3D10_MESSAGE_ID_DEVICE_DRAW_RESOURCE_SAMPLE_COUNT_MISMATCH(421L), D3D10_MESSAGE_ID_LIVE_OBJECT_SUMMARY(422L), D3D10_MESSAGE_ID_LIVE_BUFFER(423L), D3D10_MESSAGE_ID_LIVE_TEXTURE1D(424L), D3D10_MESSAGE_ID_LIVE_TEXTURE2D(425L), D3D10_MESSAGE_ID_LIVE_TEXTURE3D(426L), D3D10_MESSAGE_ID_LIVE_SHADERRESOURCEVIEW(427L), D3D10_MESSAGE_ID_LIVE_RENDERTARGETVIEW(428L), D3D10_MESSAGE_ID_LIVE_DEPTHSTENCILVIEW(429L), D3D10_MESSAGE_ID_LIVE_VERTEXSHADER(430L), D3D10_MESSAGE_ID_LIVE_GEOMETRYSHADER(431L), D3D10_MESSAGE_ID_LIVE_PIXELSHADER(432L), D3D10_MESSAGE_ID_LIVE_INPUTLAYOUT(433L), D3D10_MESSAGE_ID_LIVE_SAMPLER(434L), D3D10_MESSAGE_ID_LIVE_BLENDSTATE(435L), D3D10_MESSAGE_ID_LIVE_DEPTHSTENCILSTATE(436L), D3D10_MESSAGE_ID_LIVE_RASTERIZERSTATE(437L), D3D10_MESSAGE_ID_LIVE_QUERY(438L), D3D10_MESSAGE_ID_LIVE_PREDICATE(439L), D3D10_MESSAGE_ID_LIVE_COUNTER(440L), D3D10_MESSAGE_ID_LIVE_DEVICE(441L), D3D10_MESSAGE_ID_LIVE_SWAPCHAIN(442L), D3D10_MESSAGE_ID_D3D10_MESSAGES_END(443L), D3D10_MESSAGE_ID_D3D10L9_MESSAGES_START(1048576L), D3D10_MESSAGE_ID_CREATEDEPTHSTENCILSTATE_STENCIL_NO_TWO_SIDED(1048577L), D3D10_MESSAGE_ID_CREATERASTERIZERSTATE_DepthBiasClamp_NOT_SUPPORTED(1048578L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_NO_COMPARISON_SUPPORT(1048579L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_EXCESSIVE_ANISOTROPY(1048580L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_BORDER_OUT_OF_RANGE(1048581L), D3D10_MESSAGE_ID_VSSETSAMPLERS_NOT_SUPPORTED(1048582L), D3D10_MESSAGE_ID_VSSETSAMPLERS_TOO_MANY_SAMPLERS(1048583L), D3D10_MESSAGE_ID_PSSETSAMPLERS_TOO_MANY_SAMPLERS(1048584L), D3D10_MESSAGE_ID_CREATERESOURCE_NO_ARRAYS(1048585L), D3D10_MESSAGE_ID_CREATERESOURCE_NO_VB_AND_IB_BIND(1048586L), D3D10_MESSAGE_ID_CREATERESOURCE_NO_TEXTURE_1D(1048587L), D3D10_MESSAGE_ID_CREATERESOURCE_DIMENSION_OUT_OF_RANGE(1048588L), D3D10_MESSAGE_ID_CREATERESOURCE_NOT_BINDABLE_AS_SHADER_RESOURCE(1048589L), D3D10_MESSAGE_ID_OMSETRENDERTARGETS_TOO_MANY_RENDER_TARGETS(1048590L), D3D10_MESSAGE_ID_OMSETRENDERTARGETS_NO_DIFFERING_BIT_DEPTHS(1048591L), D3D10_MESSAGE_ID_IASETVERTEXBUFFERS_BAD_BUFFER_INDEX(1048592L), D3D10_MESSAGE_ID_DEVICE_RSSETVIEWPORTS_TOO_MANY_VIEWPORTS(1048593L), D3D10_MESSAGE_ID_DEVICE_IASETPRIMITIVETOPOLOGY_ADJACENCY_UNSUPPORTED(1048594L), D3D10_MESSAGE_ID_DEVICE_RSSETSCISSORRECTS_TOO_MANY_SCISSORS(1048595L), D3D10_MESSAGE_ID_COPYRESOURCE_ONLY_TEXTURE_2D_WITHIN_GPU_MEMORY(1048596L), D3D10_MESSAGE_ID_COPYRESOURCE_NO_TEXTURE_3D_READBACK(1048597L), D3D10_MESSAGE_ID_COPYRESOURCE_NO_TEXTURE_ONLY_READBACK(1048598L), D3D10_MESSAGE_ID_CREATEINPUTLAYOUT_UNSUPPORTED_FORMAT(1048599L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_NO_ALPHA_TO_COVERAGE(1048600L), D3D10_MESSAGE_ID_CREATERASTERIZERSTATE_DepthClipEnable_MUST_BE_TRUE(1048601L), D3D10_MESSAGE_ID_DRAWINDEXED_STARTINDEXLOCATION_MUST_BE_POSITIVE(1048602L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_MUST_USE_LOWEST_LOD(1048603L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_MINLOD_MUST_NOT_BE_FRACTIONAL(1048604L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_MAXLOD_MUST_BE_FLT_MAX(1048605L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_FIRSTARRAYSLICE_MUST_BE_ZERO(1048606L), D3D10_MESSAGE_ID_CREATESHADERRESOURCEVIEW_CUBES_MUST_HAVE_6_SIDES(1048607L), D3D10_MESSAGE_ID_CREATERESOURCE_NOT_BINDABLE_AS_RENDER_TARGET(1048608L), D3D10_MESSAGE_ID_CREATERESOURCE_NO_DWORD_INDEX_BUFFER(1048609L), D3D10_MESSAGE_ID_CREATERESOURCE_MSAA_PRECLUDES_SHADER_RESOURCE(1048610L), D3D10_MESSAGE_ID_CREATERESOURCE_PRESENTATION_PRECLUDES_SHADER_RESOURCE(1048611L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_NO_INDEPENDENT_BLEND_ENABLE(1048612L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_NO_INDEPENDENT_WRITE_MASKS(1048613L), D3D10_MESSAGE_ID_CREATERESOURCE_NO_STREAM_OUT(1048614L), D3D10_MESSAGE_ID_CREATERESOURCE_ONLY_VB_IB_FOR_BUFFERS(1048615L), D3D10_MESSAGE_ID_CREATERESOURCE_NO_AUTOGEN_FOR_VOLUMES(1048616L), D3D10_MESSAGE_ID_CREATERESOURCE_DXGI_FORMAT_R8G8B8A8_CANNOT_BE_SHARED(1048617L), D3D10_MESSAGE_ID_VSSHADERRESOURCES_NOT_SUPPORTED(1048618L), D3D10_MESSAGE_ID_GEOMETRY_SHADER_NOT_SUPPORTED(1048619L), D3D10_MESSAGE_ID_STREAM_OUT_NOT_SUPPORTED(1048620L), D3D10_MESSAGE_ID_TEXT_FILTER_NOT_SUPPORTED(1048621L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_NO_SEPARATE_ALPHA_BLEND(1048622L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_NO_MRT_BLEND(1048623L), D3D10_MESSAGE_ID_CREATEBLENDSTATE_OPERATION_NOT_SUPPORTED(1048624L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_NO_MIRRORONCE(1048625L), D3D10_MESSAGE_ID_DRAWINSTANCED_NOT_SUPPORTED(1048626L), D3D10_MESSAGE_ID_DRAWINDEXEDINSTANCED_NOT_SUPPORTED_BELOW_9_3(1048627L), D3D10_MESSAGE_ID_DRAWINDEXED_POINTLIST_UNSUPPORTED(1048628L), D3D10_MESSAGE_ID_SETBLENDSTATE_SAMPLE_MASK_CANNOT_BE_ZERO(1048629L), D3D10_MESSAGE_ID_CREATERESOURCE_DIMENSION_EXCEEDS_FEATURE_LEVEL_DEFINITION(1048630L), D3D10_MESSAGE_ID_CREATERESOURCE_ONLY_SINGLE_MIP_LEVEL_DEPTH_STENCIL_SUPPORTED(1048631L), D3D10_MESSAGE_ID_DEVICE_RSSETSCISSORRECTS_NEGATIVESCISSOR(1048632L), D3D10_MESSAGE_ID_SLOT_ZERO_MUST_BE_D3D10_INPUT_PER_VERTEX_DATA(1048633L), D3D10_MESSAGE_ID_CREATERESOURCE_NON_POW_2_MIPMAP(1048634L), D3D10_MESSAGE_ID_CREATESAMPLERSTATE_BORDER_NOT_SUPPORTED(1048635L), D3D10_MESSAGE_ID_OMSETRENDERTARGETS_NO_SRGB_MRT(1048636L), D3D10_MESSAGE_ID_COPYRESOURCE_NO_3D_MISMATCHED_UPDATES(1048637L), D3D10_MESSAGE_ID_D3D10L9_MESSAGES_END(1048638L);

    companion object {
        fun fromValue(v: Long): D3D10_MESSAGE_ID = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_MESSAGE_ID value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_DRIVER_TYPE}
 */
enum class D3D10_DRIVER_TYPE(val value: Long) {
    D3D10_DRIVER_TYPE_HARDWARE(0L), D3D10_DRIVER_TYPE_REFERENCE(1L), D3D10_DRIVER_TYPE_NULL(2L), D3D10_DRIVER_TYPE_SOFTWARE(3L), D3D10_DRIVER_TYPE_WARP(5L);

    companion object {
        fun fromValue(v: Long): D3D10_DRIVER_TYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_DRIVER_TYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D10_DEVICE_STATE_TYPES}
 */
enum class _D3D10_DEVICE_STATE_TYPES(val value: Long) {
    D3D10_DST_SO_BUFFERS(1L), D3D10_DST_OM_RENDER_TARGETS(2L), D3D10_DST_OM_DEPTH_STENCIL_STATE(3L), D3D10_DST_OM_BLEND_STATE(4L), D3D10_DST_VS(5L), D3D10_DST_VS_SAMPLERS(6L), D3D10_DST_VS_SHADER_RESOURCES(7L), D3D10_DST_VS_CONSTANT_BUFFERS(8L), D3D10_DST_GS(9L), D3D10_DST_GS_SAMPLERS(10L), D3D10_DST_GS_SHADER_RESOURCES(11L), D3D10_DST_GS_CONSTANT_BUFFERS(12L), D3D10_DST_PS(13L), D3D10_DST_PS_SAMPLERS(14L), D3D10_DST_PS_SHADER_RESOURCES(15L), D3D10_DST_PS_CONSTANT_BUFFERS(16L), D3D10_DST_IA_VERTEX_BUFFERS(17L), D3D10_DST_IA_INDEX_BUFFER(18L), D3D10_DST_IA_INPUT_LAYOUT(19L), D3D10_DST_IA_PRIMITIVE_TOPOLOGY(20L), D3D10_DST_RS_VIEWPORTS(21L), D3D10_DST_RS_SCISSOR_RECTS(22L), D3D10_DST_RS_RASTERIZER_STATE(23L), D3D10_DST_PREDICATION(24L);

    companion object {
        fun fromValue(v: Long): _D3D10_DEVICE_STATE_TYPES = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D10_DEVICE_STATE_TYPES value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_FEATURE_LEVEL1}
 */
enum class D3D10_FEATURE_LEVEL1(val value: Long) {
    D3D10_FEATURE_LEVEL_10_0(40960L), D3D10_FEATURE_LEVEL_10_1(41216L), D3D10_FEATURE_LEVEL_9_1(37120L), D3D10_FEATURE_LEVEL_9_2(37376L), D3D10_FEATURE_LEVEL_9_3(37632L);

    companion object {
        fun fromValue(v: Long): D3D10_FEATURE_LEVEL1 = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_FEATURE_LEVEL1 value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum D3D10_STANDARD_MULTISAMPLE_QUALITY_LEVELS}
 */
enum class D3D10_STANDARD_MULTISAMPLE_QUALITY_LEVELS(val value: Long) {
    D3D10_STANDARD_MULTISAMPLE_PATTERN(-1L), D3D10_CENTER_MULTISAMPLE_PATTERN(-2L);

    companion object {
        fun fromValue(v: Long): D3D10_STANDARD_MULTISAMPLE_QUALITY_LEVELS = entries.firstOrNull { it.value == v }
            ?: error("Unknown D3D10_STANDARD_MULTISAMPLE_QUALITY_LEVELS value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D10_SHADER_DEBUG_REGTYPE}
 */
enum class _D3D10_SHADER_DEBUG_REGTYPE(val value: Long) {
    D3D10_SHADER_DEBUG_REG_INPUT(0L), D3D10_SHADER_DEBUG_REG_OUTPUT(1L), D3D10_SHADER_DEBUG_REG_CBUFFER(2L), D3D10_SHADER_DEBUG_REG_TBUFFER(3L), D3D10_SHADER_DEBUG_REG_TEMP(4L), D3D10_SHADER_DEBUG_REG_TEMPARRAY(5L), D3D10_SHADER_DEBUG_REG_TEXTURE(6L), D3D10_SHADER_DEBUG_REG_SAMPLER(7L), D3D10_SHADER_DEBUG_REG_IMMEDIATECBUFFER(8L), D3D10_SHADER_DEBUG_REG_LITERAL(9L), D3D10_SHADER_DEBUG_REG_UNUSED(10L), D3D11_SHADER_DEBUG_REG_INTERFACE_POINTERS(11L), D3D11_SHADER_DEBUG_REG_UAV(12L), D3D10_SHADER_DEBUG_REG_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D10_SHADER_DEBUG_REGTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D10_SHADER_DEBUG_REGTYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D10_SHADER_DEBUG_SCOPETYPE}
 */
enum class _D3D10_SHADER_DEBUG_SCOPETYPE(val value: Long) {
    D3D10_SHADER_DEBUG_SCOPE_GLOBAL(0L), D3D10_SHADER_DEBUG_SCOPE_BLOCK(1L), D3D10_SHADER_DEBUG_SCOPE_FORLOOP(2L), D3D10_SHADER_DEBUG_SCOPE_STRUCT(3L), D3D10_SHADER_DEBUG_SCOPE_FUNC_PARAMS(4L), D3D10_SHADER_DEBUG_SCOPE_STATEBLOCK(5L), D3D10_SHADER_DEBUG_SCOPE_NAMESPACE(6L), D3D10_SHADER_DEBUG_SCOPE_ANNOTATION(7L), D3D10_SHADER_DEBUG_SCOPE_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D10_SHADER_DEBUG_SCOPETYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D10_SHADER_DEBUG_SCOPETYPE value: $v")
    }
}

/**
 * NS_ENUM: {@snippet lang=c : enum _D3D10_SHADER_DEBUG_VARTYPE}
 */
enum class _D3D10_SHADER_DEBUG_VARTYPE(val value: Long) {
    D3D10_SHADER_DEBUG_VAR_VARIABLE(0L), D3D10_SHADER_DEBUG_VAR_FUNCTION(1L), D3D10_SHADER_DEBUG_VAR_FORCE_DWORD(2147483647L);

    companion object {
        fun fromValue(v: Long): _D3D10_SHADER_DEBUG_VARTYPE = entries.firstOrNull { it.value == v }
            ?: error("Unknown _D3D10_SHADER_DEBUG_VARTYPE value: $v")
    }
}

/**
 * {@snippet lang=c : D3D11CreateDevice typedef HRESULT = Long((typedef IDXGIAdapter = Declared(IDXGIAdapter))*,typedef D3D_DRIVER_TYPE = Declared(D3D_DRIVER_TYPE),typedef HMODULE = (Declared(HINSTANCE__))*,typedef UINT = UNSIGNED = Int,(typedef D3D_FEATURE_LEVEL = Declared(D3D_FEATURE_LEVEL))*,typedef UINT = UNSIGNED = Int,typedef UINT = UNSIGNED = Int,((typedef ID3D11Device = Declared(ID3D11Device))*)*,(typedef D3D_FEATURE_LEVEL = Declared(D3D_FEATURE_LEVEL))*,((typedef ID3D11DeviceContext = Declared(ID3D11DeviceContext))*)*)
 */
private val D3D11CreateDevice_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var D3D11CreateDevice_HANDLE: MethodHandle? = null

fun D3D11CreateDevice(arg0: MemorySegment, arg1: D3D_DRIVER_TYPE, arg2: MemorySegment, arg3: Int, arg4: MemorySegment, arg5: Int, arg6: Int, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment): Int {
    check(_initialized) { "Win32 D3D11CreateDevice called before init()" }
    val _handle = D3D11CreateDevice_HANDLE ?: return 0
    try {
        return _handle.invokeExact(arg0, arg1.value.toInt(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        return 0
    }
}

/**
 * {@snippet lang=c : CreateDirect3D11DeviceFromDXGIDevice typedef HRESULT = Long((typedef IDXGIDevice = Declared(IDXGIDevice))*,((typedef IInspectable = Declared(IInspectable))*)*)
 */
private val CreateDirect3D11DeviceFromDXGIDevice_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private var CreateDirect3D11DeviceFromDXGIDevice_HANDLE: MethodHandle? = null

fun CreateDirect3D11DeviceFromDXGIDevice(arg0: MemorySegment, arg1: MemorySegment): Int {
    check(_initialized) { "Win32 CreateDirect3D11DeviceFromDXGIDevice called before init()" }
    val _handle = CreateDirect3D11DeviceFromDXGIDevice_HANDLE ?: return 0
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
    _DLL_SHCORE_DLL = try {
        SymbolLookup.libraryLookup("Shcore.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_USER32_DLL = try {
        SymbolLookup.libraryLookup("User32.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_XINPUT9_1_0_DLL = try {
        SymbolLookup.libraryLookup("Xinput9_1_0.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_COMBASE_DLL = try {
        SymbolLookup.libraryLookup("combase.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_D3D11_DLL = try {
        SymbolLookup.libraryLookup("d3d11.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    _DLL_DXGI_DLL = try {
        SymbolLookup.libraryLookup("dxgi.dll", Arena.global())
    } catch (ex: Throwable) {
        null
    }
    GetLastError_HANDLE = _lookup("GetLastError").find("GetLastError").map { Linker.nativeLinker().downcallHandle(it, GetLastError_DESC) }.orElse(null)
    SetLastError_HANDLE = _lookup("SetLastError").find("SetLastError").map { Linker.nativeLinker().downcallHandle(it, SetLastError_DESC) }.orElse(null)
    GetCurrentThreadId_HANDLE = _lookup("GetCurrentThreadId").find("GetCurrentThreadId").map { Linker.nativeLinker().downcallHandle(it, GetCurrentThreadId_DESC) }.orElse(null)
    GetModuleHandleW_HANDLE = _lookup("GetModuleHandleW").find("GetModuleHandleW").map { Linker.nativeLinker().downcallHandle(it, GetModuleHandleW_DESC) }.orElse(null)
    GlobalAlloc_HANDLE = _lookup("GlobalAlloc").find("GlobalAlloc").map { Linker.nativeLinker().downcallHandle(it, GlobalAlloc_DESC) }.orElse(null)
    GlobalSize_HANDLE = _lookup("GlobalSize").find("GlobalSize").map { Linker.nativeLinker().downcallHandle(it, GlobalSize_DESC) }.orElse(null)
    GlobalUnlock_HANDLE = _lookup("GlobalUnlock").find("GlobalUnlock").map { Linker.nativeLinker().downcallHandle(it, GlobalUnlock_DESC) }.orElse(null)
    GlobalLock_HANDLE = _lookup("GlobalLock").find("GlobalLock").map { Linker.nativeLinker().downcallHandle(it, GlobalLock_DESC) }.orElse(null)
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
    RegisterClipboardFormatW_HANDLE = _lookup("RegisterClipboardFormatW").find("RegisterClipboardFormatW").map { Linker.nativeLinker().downcallHandle(it, RegisterClipboardFormatW_DESC) }.orElse(null)
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
    GetPropW_HANDLE = _lookup("GetPropW").find("GetPropW").map { Linker.nativeLinker().downcallHandle(it, GetPropW_DESC) }.orElse(null)
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
    EnumDisplaySettingsExW_HANDLE = _lookup("EnumDisplaySettingsExW").find("EnumDisplaySettingsExW").map { Linker.nativeLinker().downcallHandle(it, EnumDisplaySettingsExW_DESC) }.orElse(null)
    SystemParametersInfoW_HANDLE = _lookup("SystemParametersInfoW").find("SystemParametersInfoW").map { Linker.nativeLinker().downcallHandle(it, SystemParametersInfoW_DESC) }.orElse(null)
    MonitorFromWindow_HANDLE = _lookup("MonitorFromWindow").find("MonitorFromWindow").map { Linker.nativeLinker().downcallHandle(it, MonitorFromWindow_DESC) }.orElse(null)
    GetMonitorInfoW_HANDLE = _lookup("GetMonitorInfoW").find("GetMonitorInfoW").map { Linker.nativeLinker().downcallHandle(it, GetMonitorInfoW_DESC) }.orElse(null)
    EnumDisplayMonitors_HANDLE = _lookup("EnumDisplayMonitors").find("EnumDisplayMonitors").map { Linker.nativeLinker().downcallHandle(it, EnumDisplayMonitors_DESC) }.orElse(null)
    GetDpiForWindow_HANDLE = _lookup("GetDpiForWindow").find("GetDpiForWindow").map { Linker.nativeLinker().downcallHandle(it, GetDpiForWindow_DESC) }.orElse(null)
    SetProcessDpiAwarenessContext_HANDLE = _lookup("SetProcessDpiAwarenessContext").find("SetProcessDpiAwarenessContext").map { Linker.nativeLinker().downcallHandle(it, SetProcessDpiAwarenessContext_DESC) }.orElse(null)
    GetRawInputData_HANDLE = _lookup("GetRawInputData").find("GetRawInputData").map { Linker.nativeLinker().downcallHandle(it, GetRawInputData_DESC) }.orElse(null)
    RegisterRawInputDevices_HANDLE = _lookup("RegisterRawInputDevices").find("RegisterRawInputDevices").map { Linker.nativeLinker().downcallHandle(it, RegisterRawInputDevices_DESC) }.orElse(null)
    GetRegisteredRawInputDevices_HANDLE = _lookup("GetRegisteredRawInputDevices").find("GetRegisteredRawInputDevices").map { Linker.nativeLinker().downcallHandle(it, GetRegisteredRawInputDevices_DESC) }.orElse(null)
    GetRawInputDeviceList_HANDLE = _lookup("GetRawInputDeviceList").find("GetRawInputDeviceList").map { Linker.nativeLinker().downcallHandle(it, GetRawInputDeviceList_DESC) }.orElse(null)
    GetGestureInfo_HANDLE = _lookup("GetGestureInfo").find("GetGestureInfo").map { Linker.nativeLinker().downcallHandle(it, GetGestureInfo_DESC) }.orElse(null)
    CloseGestureInfoHandle_HANDLE = _lookup("CloseGestureInfoHandle").find("CloseGestureInfoHandle").map { Linker.nativeLinker().downcallHandle(it, CloseGestureInfoHandle_DESC) }.orElse(null)
    DwmEnableBlurBehindWindow_HANDLE = _lookup("DwmEnableBlurBehindWindow").find("DwmEnableBlurBehindWindow").map { Linker.nativeLinker().downcallHandle(it, DwmEnableBlurBehindWindow_DESC) }.orElse(null)
    DwmExtendFrameIntoClientArea_HANDLE = _lookup("DwmExtendFrameIntoClientArea").find("DwmExtendFrameIntoClientArea").map { Linker.nativeLinker().downcallHandle(it, DwmExtendFrameIntoClientArea_DESC) }.orElse(null)
    DwmSetWindowAttribute_HANDLE = _lookup("DwmSetWindowAttribute").find("DwmSetWindowAttribute").map { Linker.nativeLinker().downcallHandle(it, DwmSetWindowAttribute_DESC) }.orElse(null)
    OleInitialize_HANDLE = _lookup("OleInitialize").find("OleInitialize").map { Linker.nativeLinker().downcallHandle(it, OleInitialize_DESC) }.orElse(null)
    OleUninitialize_HANDLE = _lookup("OleUninitialize").find("OleUninitialize").map { Linker.nativeLinker().downcallHandle(it, OleUninitialize_DESC) }.orElse(null)
    RegisterDragDrop_HANDLE = _lookup("RegisterDragDrop").find("RegisterDragDrop").map { Linker.nativeLinker().downcallHandle(it, RegisterDragDrop_DESC) }.orElse(null)
    RevokeDragDrop_HANDLE = _lookup("RevokeDragDrop").find("RevokeDragDrop").map { Linker.nativeLinker().downcallHandle(it, RevokeDragDrop_DESC) }.orElse(null)
    ReleaseStgMedium_HANDLE = _lookup("ReleaseStgMedium").find("ReleaseStgMedium").map { Linker.nativeLinker().downcallHandle(it, ReleaseStgMedium_DESC) }.orElse(null)
    CreateStreamOnHGlobal_HANDLE = _lookup("CreateStreamOnHGlobal").find("CreateStreamOnHGlobal").map { Linker.nativeLinker().downcallHandle(it, CreateStreamOnHGlobal_DESC) }.orElse(null)
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
    GetDpiForMonitor_HANDLE = _lookup("GetDpiForMonitor").find("GetDpiForMonitor").map { Linker.nativeLinker().downcallHandle(it, GetDpiForMonitor_DESC) }.orElse(null)
    XInputGetState_HANDLE = _lookup("XInputGetState").find("XInputGetState").map { Linker.nativeLinker().downcallHandle(it, XInputGetState_DESC) }.orElse(null)
    XInputSetState_HANDLE = _lookup("XInputSetState").find("XInputSetState").map { Linker.nativeLinker().downcallHandle(it, XInputSetState_DESC) }.orElse(null)
    XInputGetCapabilities_HANDLE = _lookup("XInputGetCapabilities").find("XInputGetCapabilities").map { Linker.nativeLinker().downcallHandle(it, XInputGetCapabilities_DESC) }.orElse(null)
    XInputGetBatteryInformation_HANDLE = _lookup("XInputGetBatteryInformation").find("XInputGetBatteryInformation").map { Linker.nativeLinker().downcallHandle(it, XInputGetBatteryInformation_DESC) }.orElse(null)
    RoInitialize_HANDLE = _lookup("RoInitialize").find("RoInitialize").map { Linker.nativeLinker().downcallHandle(it, RoInitialize_DESC) }.orElse(null)
    RoUninitialize_HANDLE = _lookup("RoUninitialize").find("RoUninitialize").map { Linker.nativeLinker().downcallHandle(it, RoUninitialize_DESC) }.orElse(null)
    RoGetActivationFactory_HANDLE = _lookup("RoGetActivationFactory").find("RoGetActivationFactory").map { Linker.nativeLinker().downcallHandle(it, RoGetActivationFactory_DESC) }.orElse(null)
    WindowsCreateString_HANDLE = _lookup("WindowsCreateString").find("WindowsCreateString").map { Linker.nativeLinker().downcallHandle(it, WindowsCreateString_DESC) }.orElse(null)
    WindowsDeleteString_HANDLE = _lookup("WindowsDeleteString").find("WindowsDeleteString").map { Linker.nativeLinker().downcallHandle(it, WindowsDeleteString_DESC) }.orElse(null)
    WindowsGetStringRawBuffer_HANDLE = _lookup("WindowsGetStringRawBuffer").find("WindowsGetStringRawBuffer").map { Linker.nativeLinker().downcallHandle(it, WindowsGetStringRawBuffer_DESC) }.orElse(null)
    CreateDXGIFactory1_HANDLE = _lookup("CreateDXGIFactory1").find("CreateDXGIFactory1").map { Linker.nativeLinker().downcallHandle(it, CreateDXGIFactory1_DESC) }.orElse(null)
    D3D11CreateDevice_HANDLE = _lookup("D3D11CreateDevice").find("D3D11CreateDevice").map { Linker.nativeLinker().downcallHandle(it, D3D11CreateDevice_DESC) }.orElse(null)
    CreateDirect3D11DeviceFromDXGIDevice_HANDLE = _lookup("CreateDirect3D11DeviceFromDXGIDevice").find("CreateDirect3D11DeviceFromDXGIDevice").map { Linker.nativeLinker().downcallHandle(it, CreateDirect3D11DeviceFromDXGIDevice_DESC) }.orElse(null)

    _initialized = true
}
