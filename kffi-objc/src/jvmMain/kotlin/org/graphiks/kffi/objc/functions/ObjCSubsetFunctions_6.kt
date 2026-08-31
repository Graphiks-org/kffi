@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : NSNonOwnedPointerMapValueCallBacks typedef const NSMapTableValueCallBacks = Declared(NSMapTableValueCallBacks)
 */
val NSNonOwnedPointerMapValueCallBacks: MemorySegment = LOOKUP.find("NSNonOwnedPointerMapValueCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSObjectMapValueCallBacks typedef const NSMapTableValueCallBacks = Declared(NSMapTableValueCallBacks)
 */
val NSObjectMapValueCallBacks: MemorySegment = LOOKUP.find("NSObjectMapValueCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSNonRetainedObjectMapValueCallBacks typedef const NSMapTableValueCallBacks = Declared(NSMapTableValueCallBacks)
 */
val NSNonRetainedObjectMapValueCallBacks: MemorySegment = LOOKUP.find("NSNonRetainedObjectMapValueCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSOwnedPointerMapValueCallBacks typedef const NSMapTableValueCallBacks = Declared(NSMapTableValueCallBacks)
 */
val NSOwnedPointerMapValueCallBacks: MemorySegment = LOOKUP.find("NSOwnedPointerMapValueCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSIntMapValueCallBacks typedef const NSMapTableValueCallBacks = Declared(NSMapTableValueCallBacks)
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
val NSIntMapValueCallBacks: MemorySegment = LOOKUP.find("NSIntMapValueCallBacks").orElseThrow()

/**
 * {@snippet lang=c : NSInvocationOperationVoidResultException typedef const NSExceptionName = (Void)*
 */
private val NSInvocationOperationVoidResultException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInvocationOperationVoidResultException_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSInvocationOperationVoidResultException").orElseThrow().reinterpret(NSInvocationOperationVoidResultException_LAYOUT.byteSize()) }
private val NSInvocationOperationVoidResultException_VH: VarHandle by lazy { NSInvocationOperationVoidResultException_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSInvocationOperationVoidResultException: MemorySegment
    get() = NSInvocationOperationVoidResultException_VH.get(NSInvocationOperationVoidResultException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInvocationOperationVoidResultException_VH.set(NSInvocationOperationVoidResultException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInvocationOperationCancelledException typedef const NSExceptionName = (Void)*
 */
private val NSInvocationOperationCancelledException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInvocationOperationCancelledException_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSInvocationOperationCancelledException").orElseThrow().reinterpret(NSInvocationOperationCancelledException_LAYOUT.byteSize()) }
private val NSInvocationOperationCancelledException_VH: VarHandle by lazy { NSInvocationOperationCancelledException_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSInvocationOperationCancelledException: MemorySegment
    get() = NSInvocationOperationCancelledException_VH.get(NSInvocationOperationCancelledException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInvocationOperationCancelledException_VH.set(NSInvocationOperationCancelledException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPortDidBecomeInvalidNotification typedef const NSNotificationName = (Void)*
 */
private val NSPortDidBecomeInvalidNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPortDidBecomeInvalidNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPortDidBecomeInvalidNotification").orElseThrow().reinterpret(NSPortDidBecomeInvalidNotification_LAYOUT.byteSize()) }
private val NSPortDidBecomeInvalidNotification_VH: VarHandle by lazy { NSPortDidBecomeInvalidNotification_LAYOUT.varHandle() }

var NSPortDidBecomeInvalidNotification: MemorySegment
    get() = NSPortDidBecomeInvalidNotification_VH.get(NSPortDidBecomeInvalidNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSPortDidBecomeInvalidNotification_VH.set(NSPortDidBecomeInvalidNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProcessInfoThermalStateDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSProcessInfoThermalStateDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProcessInfoThermalStateDidChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSProcessInfoThermalStateDidChangeNotification").orElseThrow().reinterpret(NSProcessInfoThermalStateDidChangeNotification_LAYOUT.byteSize()) }
private val NSProcessInfoThermalStateDidChangeNotification_VH: VarHandle by lazy { NSProcessInfoThermalStateDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
var NSProcessInfoThermalStateDidChangeNotification: MemorySegment
    get() = NSProcessInfoThermalStateDidChangeNotification_VH.get(NSProcessInfoThermalStateDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSProcessInfoThermalStateDidChangeNotification_VH.set(NSProcessInfoThermalStateDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProcessInfoPowerStateDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSProcessInfoPowerStateDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProcessInfoPowerStateDidChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSProcessInfoPowerStateDidChangeNotification").orElseThrow().reinterpret(NSProcessInfoPowerStateDidChangeNotification_LAYOUT.byteSize()) }
private val NSProcessInfoPowerStateDidChangeNotification_VH: VarHandle by lazy { NSProcessInfoPowerStateDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProcessInfoPowerStateDidChangeNotification: MemorySegment
    get() = NSProcessInfoPowerStateDidChangeNotification_VH.get(NSProcessInfoPowerStateDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSProcessInfoPowerStateDidChangeNotification_VH.set(NSProcessInfoPowerStateDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingNameKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingNameKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingNameKey").orElseThrow().reinterpret(NSTextCheckingNameKey_LAYOUT.byteSize()) }
private val NSTextCheckingNameKey_VH: VarHandle by lazy { NSTextCheckingNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingNameKey: MemorySegment
    get() = NSTextCheckingNameKey_VH.get(NSTextCheckingNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingNameKey_VH.set(NSTextCheckingNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingJobTitleKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingJobTitleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingJobTitleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingJobTitleKey").orElseThrow().reinterpret(NSTextCheckingJobTitleKey_LAYOUT.byteSize()) }
private val NSTextCheckingJobTitleKey_VH: VarHandle by lazy { NSTextCheckingJobTitleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingJobTitleKey: MemorySegment
    get() = NSTextCheckingJobTitleKey_VH.get(NSTextCheckingJobTitleKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingJobTitleKey_VH.set(NSTextCheckingJobTitleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingOrganizationKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingOrganizationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingOrganizationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingOrganizationKey").orElseThrow().reinterpret(NSTextCheckingOrganizationKey_LAYOUT.byteSize()) }
private val NSTextCheckingOrganizationKey_VH: VarHandle by lazy { NSTextCheckingOrganizationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingOrganizationKey: MemorySegment
    get() = NSTextCheckingOrganizationKey_VH.get(NSTextCheckingOrganizationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingOrganizationKey_VH.set(NSTextCheckingOrganizationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingStreetKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingStreetKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingStreetKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingStreetKey").orElseThrow().reinterpret(NSTextCheckingStreetKey_LAYOUT.byteSize()) }
private val NSTextCheckingStreetKey_VH: VarHandle by lazy { NSTextCheckingStreetKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingStreetKey: MemorySegment
    get() = NSTextCheckingStreetKey_VH.get(NSTextCheckingStreetKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingStreetKey_VH.set(NSTextCheckingStreetKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingCityKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingCityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingCityKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingCityKey").orElseThrow().reinterpret(NSTextCheckingCityKey_LAYOUT.byteSize()) }
private val NSTextCheckingCityKey_VH: VarHandle by lazy { NSTextCheckingCityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingCityKey: MemorySegment
    get() = NSTextCheckingCityKey_VH.get(NSTextCheckingCityKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingCityKey_VH.set(NSTextCheckingCityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingStateKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingStateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingStateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingStateKey").orElseThrow().reinterpret(NSTextCheckingStateKey_LAYOUT.byteSize()) }
private val NSTextCheckingStateKey_VH: VarHandle by lazy { NSTextCheckingStateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingStateKey: MemorySegment
    get() = NSTextCheckingStateKey_VH.get(NSTextCheckingStateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingStateKey_VH.set(NSTextCheckingStateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingZIPKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingZIPKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingZIPKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingZIPKey").orElseThrow().reinterpret(NSTextCheckingZIPKey_LAYOUT.byteSize()) }
private val NSTextCheckingZIPKey_VH: VarHandle by lazy { NSTextCheckingZIPKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingZIPKey: MemorySegment
    get() = NSTextCheckingZIPKey_VH.get(NSTextCheckingZIPKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingZIPKey_VH.set(NSTextCheckingZIPKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingCountryKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingCountryKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingCountryKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingCountryKey").orElseThrow().reinterpret(NSTextCheckingCountryKey_LAYOUT.byteSize()) }
private val NSTextCheckingCountryKey_VH: VarHandle by lazy { NSTextCheckingCountryKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingCountryKey: MemorySegment
    get() = NSTextCheckingCountryKey_VH.get(NSTextCheckingCountryKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingCountryKey_VH.set(NSTextCheckingCountryKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingPhoneKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingPhoneKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingPhoneKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingPhoneKey").orElseThrow().reinterpret(NSTextCheckingPhoneKey_LAYOUT.byteSize()) }
private val NSTextCheckingPhoneKey_VH: VarHandle by lazy { NSTextCheckingPhoneKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingPhoneKey: MemorySegment
    get() = NSTextCheckingPhoneKey_VH.get(NSTextCheckingPhoneKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingPhoneKey_VH.set(NSTextCheckingPhoneKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingAirlineKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingAirlineKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingAirlineKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingAirlineKey").orElseThrow().reinterpret(NSTextCheckingAirlineKey_LAYOUT.byteSize()) }
private val NSTextCheckingAirlineKey_VH: VarHandle by lazy { NSTextCheckingAirlineKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingAirlineKey: MemorySegment
    get() = NSTextCheckingAirlineKey_VH.get(NSTextCheckingAirlineKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingAirlineKey_VH.set(NSTextCheckingAirlineKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTextCheckingFlightKey typedef const NSTextCheckingKey = (Void)*
 */
private val NSTextCheckingFlightKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextCheckingFlightKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTextCheckingFlightKey").orElseThrow().reinterpret(NSTextCheckingFlightKey_LAYOUT.byteSize()) }
private val NSTextCheckingFlightKey_VH: VarHandle by lazy { NSTextCheckingFlightKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSTextCheckingFlightKey: MemorySegment
    get() = NSTextCheckingFlightKey_VH.get(NSTextCheckingFlightKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSTextCheckingFlightKey_VH.set(NSTextCheckingFlightKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSocketSecurityLevelKey typedef const NSStreamPropertyKey = (Void)*
 */
private val NSStreamSocketSecurityLevelKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSocketSecurityLevelKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSocketSecurityLevelKey").orElseThrow().reinterpret(NSStreamSocketSecurityLevelKey_LAYOUT.byteSize()) }
private val NSStreamSocketSecurityLevelKey_VH: VarHandle by lazy { NSStreamSocketSecurityLevelKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSocketSecurityLevelKey: MemorySegment
    get() = NSStreamSocketSecurityLevelKey_VH.get(NSStreamSocketSecurityLevelKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSocketSecurityLevelKey_VH.set(NSStreamSocketSecurityLevelKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSocketSecurityLevelNone typedef const NSStreamSocketSecurityLevel = (Void)*
 */
private val NSStreamSocketSecurityLevelNone_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSocketSecurityLevelNone_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSocketSecurityLevelNone").orElseThrow().reinterpret(NSStreamSocketSecurityLevelNone_LAYOUT.byteSize()) }
private val NSStreamSocketSecurityLevelNone_VH: VarHandle by lazy { NSStreamSocketSecurityLevelNone_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSocketSecurityLevelNone: MemorySegment
    get() = NSStreamSocketSecurityLevelNone_VH.get(NSStreamSocketSecurityLevelNone_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSocketSecurityLevelNone_VH.set(NSStreamSocketSecurityLevelNone_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSocketSecurityLevelSSLv2 typedef const NSStreamSocketSecurityLevel = (Void)*
 */
private val NSStreamSocketSecurityLevelSSLv2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSocketSecurityLevelSSLv2_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSocketSecurityLevelSSLv2").orElseThrow().reinterpret(NSStreamSocketSecurityLevelSSLv2_LAYOUT.byteSize()) }
private val NSStreamSocketSecurityLevelSSLv2_VH: VarHandle by lazy { NSStreamSocketSecurityLevelSSLv2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSocketSecurityLevelSSLv2: MemorySegment
    get() = NSStreamSocketSecurityLevelSSLv2_VH.get(NSStreamSocketSecurityLevelSSLv2_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSocketSecurityLevelSSLv2_VH.set(NSStreamSocketSecurityLevelSSLv2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSocketSecurityLevelSSLv3 typedef const NSStreamSocketSecurityLevel = (Void)*
 */
private val NSStreamSocketSecurityLevelSSLv3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSocketSecurityLevelSSLv3_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSocketSecurityLevelSSLv3").orElseThrow().reinterpret(NSStreamSocketSecurityLevelSSLv3_LAYOUT.byteSize()) }
private val NSStreamSocketSecurityLevelSSLv3_VH: VarHandle by lazy { NSStreamSocketSecurityLevelSSLv3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSocketSecurityLevelSSLv3: MemorySegment
    get() = NSStreamSocketSecurityLevelSSLv3_VH.get(NSStreamSocketSecurityLevelSSLv3_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSocketSecurityLevelSSLv3_VH.set(NSStreamSocketSecurityLevelSSLv3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSocketSecurityLevelTLSv1 typedef const NSStreamSocketSecurityLevel = (Void)*
 */
private val NSStreamSocketSecurityLevelTLSv1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSocketSecurityLevelTLSv1_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSocketSecurityLevelTLSv1").orElseThrow().reinterpret(NSStreamSocketSecurityLevelTLSv1_LAYOUT.byteSize()) }
private val NSStreamSocketSecurityLevelTLSv1_VH: VarHandle by lazy { NSStreamSocketSecurityLevelTLSv1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSocketSecurityLevelTLSv1: MemorySegment
    get() = NSStreamSocketSecurityLevelTLSv1_VH.get(NSStreamSocketSecurityLevelTLSv1_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSocketSecurityLevelTLSv1_VH.set(NSStreamSocketSecurityLevelTLSv1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSocketSecurityLevelNegotiatedSSL typedef const NSStreamSocketSecurityLevel = (Void)*
 */
private val NSStreamSocketSecurityLevelNegotiatedSSL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSocketSecurityLevelNegotiatedSSL_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSocketSecurityLevelNegotiatedSSL").orElseThrow().reinterpret(NSStreamSocketSecurityLevelNegotiatedSSL_LAYOUT.byteSize()) }
private val NSStreamSocketSecurityLevelNegotiatedSSL_VH: VarHandle by lazy { NSStreamSocketSecurityLevelNegotiatedSSL_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSocketSecurityLevelNegotiatedSSL: MemorySegment
    get() = NSStreamSocketSecurityLevelNegotiatedSSL_VH.get(NSStreamSocketSecurityLevelNegotiatedSSL_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSocketSecurityLevelNegotiatedSSL_VH.set(NSStreamSocketSecurityLevelNegotiatedSSL_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSProxyConfigurationKey typedef const NSStreamPropertyKey = (Void)*
 */
private val NSStreamSOCKSProxyConfigurationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSProxyConfigurationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSProxyConfigurationKey").orElseThrow().reinterpret(NSStreamSOCKSProxyConfigurationKey_LAYOUT.byteSize()) }
private val NSStreamSOCKSProxyConfigurationKey_VH: VarHandle by lazy { NSStreamSOCKSProxyConfigurationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSProxyConfigurationKey: MemorySegment
    get() = NSStreamSOCKSProxyConfigurationKey_VH.get(NSStreamSOCKSProxyConfigurationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSProxyConfigurationKey_VH.set(NSStreamSOCKSProxyConfigurationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSProxyHostKey typedef const NSStreamSOCKSProxyConfiguration = (Void)*
 */
private val NSStreamSOCKSProxyHostKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSProxyHostKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSProxyHostKey").orElseThrow().reinterpret(NSStreamSOCKSProxyHostKey_LAYOUT.byteSize()) }
private val NSStreamSOCKSProxyHostKey_VH: VarHandle by lazy { NSStreamSOCKSProxyHostKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSProxyHostKey: MemorySegment
    get() = NSStreamSOCKSProxyHostKey_VH.get(NSStreamSOCKSProxyHostKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSProxyHostKey_VH.set(NSStreamSOCKSProxyHostKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSProxyPortKey typedef const NSStreamSOCKSProxyConfiguration = (Void)*
 */
private val NSStreamSOCKSProxyPortKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSProxyPortKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSProxyPortKey").orElseThrow().reinterpret(NSStreamSOCKSProxyPortKey_LAYOUT.byteSize()) }
private val NSStreamSOCKSProxyPortKey_VH: VarHandle by lazy { NSStreamSOCKSProxyPortKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSProxyPortKey: MemorySegment
    get() = NSStreamSOCKSProxyPortKey_VH.get(NSStreamSOCKSProxyPortKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSProxyPortKey_VH.set(NSStreamSOCKSProxyPortKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSProxyVersionKey typedef const NSStreamSOCKSProxyConfiguration = (Void)*
 */
private val NSStreamSOCKSProxyVersionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSProxyVersionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSProxyVersionKey").orElseThrow().reinterpret(NSStreamSOCKSProxyVersionKey_LAYOUT.byteSize()) }
private val NSStreamSOCKSProxyVersionKey_VH: VarHandle by lazy { NSStreamSOCKSProxyVersionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSProxyVersionKey: MemorySegment
    get() = NSStreamSOCKSProxyVersionKey_VH.get(NSStreamSOCKSProxyVersionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSProxyVersionKey_VH.set(NSStreamSOCKSProxyVersionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSProxyUserKey typedef const NSStreamSOCKSProxyConfiguration = (Void)*
 */
private val NSStreamSOCKSProxyUserKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSProxyUserKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSProxyUserKey").orElseThrow().reinterpret(NSStreamSOCKSProxyUserKey_LAYOUT.byteSize()) }
private val NSStreamSOCKSProxyUserKey_VH: VarHandle by lazy { NSStreamSOCKSProxyUserKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSProxyUserKey: MemorySegment
    get() = NSStreamSOCKSProxyUserKey_VH.get(NSStreamSOCKSProxyUserKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSProxyUserKey_VH.set(NSStreamSOCKSProxyUserKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSProxyPasswordKey typedef const NSStreamSOCKSProxyConfiguration = (Void)*
 */
private val NSStreamSOCKSProxyPasswordKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSProxyPasswordKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSProxyPasswordKey").orElseThrow().reinterpret(NSStreamSOCKSProxyPasswordKey_LAYOUT.byteSize()) }
private val NSStreamSOCKSProxyPasswordKey_VH: VarHandle by lazy { NSStreamSOCKSProxyPasswordKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSProxyPasswordKey: MemorySegment
    get() = NSStreamSOCKSProxyPasswordKey_VH.get(NSStreamSOCKSProxyPasswordKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSProxyPasswordKey_VH.set(NSStreamSOCKSProxyPasswordKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSProxyVersion4 typedef const NSStreamSOCKSProxyVersion = (Void)*
 */
private val NSStreamSOCKSProxyVersion4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSProxyVersion4_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSProxyVersion4").orElseThrow().reinterpret(NSStreamSOCKSProxyVersion4_LAYOUT.byteSize()) }
private val NSStreamSOCKSProxyVersion4_VH: VarHandle by lazy { NSStreamSOCKSProxyVersion4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSProxyVersion4: MemorySegment
    get() = NSStreamSOCKSProxyVersion4_VH.get(NSStreamSOCKSProxyVersion4_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSProxyVersion4_VH.set(NSStreamSOCKSProxyVersion4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSProxyVersion5 typedef const NSStreamSOCKSProxyVersion = (Void)*
 */
private val NSStreamSOCKSProxyVersion5_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSProxyVersion5_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSProxyVersion5").orElseThrow().reinterpret(NSStreamSOCKSProxyVersion5_LAYOUT.byteSize()) }
private val NSStreamSOCKSProxyVersion5_VH: VarHandle by lazy { NSStreamSOCKSProxyVersion5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSProxyVersion5: MemorySegment
    get() = NSStreamSOCKSProxyVersion5_VH.get(NSStreamSOCKSProxyVersion5_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSProxyVersion5_VH.set(NSStreamSOCKSProxyVersion5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamDataWrittenToMemoryStreamKey typedef const NSStreamPropertyKey = (Void)*
 */
private val NSStreamDataWrittenToMemoryStreamKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamDataWrittenToMemoryStreamKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamDataWrittenToMemoryStreamKey").orElseThrow().reinterpret(NSStreamDataWrittenToMemoryStreamKey_LAYOUT.byteSize()) }
private val NSStreamDataWrittenToMemoryStreamKey_VH: VarHandle by lazy { NSStreamDataWrittenToMemoryStreamKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamDataWrittenToMemoryStreamKey: MemorySegment
    get() = NSStreamDataWrittenToMemoryStreamKey_VH.get(NSStreamDataWrittenToMemoryStreamKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamDataWrittenToMemoryStreamKey_VH.set(NSStreamDataWrittenToMemoryStreamKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamFileCurrentOffsetKey typedef const NSStreamPropertyKey = (Void)*
 */
private val NSStreamFileCurrentOffsetKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamFileCurrentOffsetKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamFileCurrentOffsetKey").orElseThrow().reinterpret(NSStreamFileCurrentOffsetKey_LAYOUT.byteSize()) }
private val NSStreamFileCurrentOffsetKey_VH: VarHandle by lazy { NSStreamFileCurrentOffsetKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamFileCurrentOffsetKey: MemorySegment
    get() = NSStreamFileCurrentOffsetKey_VH.get(NSStreamFileCurrentOffsetKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamFileCurrentOffsetKey_VH.set(NSStreamFileCurrentOffsetKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSocketSSLErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSStreamSocketSSLErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSocketSSLErrorDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSocketSSLErrorDomain").orElseThrow().reinterpret(NSStreamSocketSSLErrorDomain_LAYOUT.byteSize()) }
private val NSStreamSocketSSLErrorDomain_VH: VarHandle by lazy { NSStreamSocketSSLErrorDomain_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSocketSSLErrorDomain: MemorySegment
    get() = NSStreamSocketSSLErrorDomain_VH.get(NSStreamSocketSSLErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSocketSSLErrorDomain_VH.set(NSStreamSocketSSLErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamSOCKSErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSStreamSOCKSErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamSOCKSErrorDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamSOCKSErrorDomain").orElseThrow().reinterpret(NSStreamSOCKSErrorDomain_LAYOUT.byteSize()) }
private val NSStreamSOCKSErrorDomain_VH: VarHandle by lazy { NSStreamSOCKSErrorDomain_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamSOCKSErrorDomain: MemorySegment
    get() = NSStreamSOCKSErrorDomain_VH.get(NSStreamSOCKSErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamSOCKSErrorDomain_VH.set(NSStreamSOCKSErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamNetworkServiceType typedef const NSStreamPropertyKey = (Void)*
 */
private val NSStreamNetworkServiceType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamNetworkServiceType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamNetworkServiceType").orElseThrow().reinterpret(NSStreamNetworkServiceType_LAYOUT.byteSize()) }
private val NSStreamNetworkServiceType_VH: VarHandle by lazy { NSStreamNetworkServiceType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamNetworkServiceType: MemorySegment
    get() = NSStreamNetworkServiceType_VH.get(NSStreamNetworkServiceType_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamNetworkServiceType_VH.set(NSStreamNetworkServiceType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamNetworkServiceTypeVoIP typedef const NSStreamNetworkServiceTypeValue = (Void)*
 */
private val NSStreamNetworkServiceTypeVoIP_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamNetworkServiceTypeVoIP_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamNetworkServiceTypeVoIP").orElseThrow().reinterpret(NSStreamNetworkServiceTypeVoIP_LAYOUT.byteSize()) }
private val NSStreamNetworkServiceTypeVoIP_VH: VarHandle by lazy { NSStreamNetworkServiceTypeVoIP_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamNetworkServiceTypeVoIP: MemorySegment
    get() = NSStreamNetworkServiceTypeVoIP_VH.get(NSStreamNetworkServiceTypeVoIP_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamNetworkServiceTypeVoIP_VH.set(NSStreamNetworkServiceTypeVoIP_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamNetworkServiceTypeVideo typedef const NSStreamNetworkServiceTypeValue = (Void)*
 */
private val NSStreamNetworkServiceTypeVideo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamNetworkServiceTypeVideo_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamNetworkServiceTypeVideo").orElseThrow().reinterpret(NSStreamNetworkServiceTypeVideo_LAYOUT.byteSize()) }
private val NSStreamNetworkServiceTypeVideo_VH: VarHandle by lazy { NSStreamNetworkServiceTypeVideo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamNetworkServiceTypeVideo: MemorySegment
    get() = NSStreamNetworkServiceTypeVideo_VH.get(NSStreamNetworkServiceTypeVideo_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamNetworkServiceTypeVideo_VH.set(NSStreamNetworkServiceTypeVideo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamNetworkServiceTypeBackground typedef const NSStreamNetworkServiceTypeValue = (Void)*
 */
private val NSStreamNetworkServiceTypeBackground_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamNetworkServiceTypeBackground_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamNetworkServiceTypeBackground").orElseThrow().reinterpret(NSStreamNetworkServiceTypeBackground_LAYOUT.byteSize()) }
private val NSStreamNetworkServiceTypeBackground_VH: VarHandle by lazy { NSStreamNetworkServiceTypeBackground_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamNetworkServiceTypeBackground: MemorySegment
    get() = NSStreamNetworkServiceTypeBackground_VH.get(NSStreamNetworkServiceTypeBackground_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamNetworkServiceTypeBackground_VH.set(NSStreamNetworkServiceTypeBackground_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamNetworkServiceTypeVoice typedef const NSStreamNetworkServiceTypeValue = (Void)*
 */
private val NSStreamNetworkServiceTypeVoice_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamNetworkServiceTypeVoice_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamNetworkServiceTypeVoice").orElseThrow().reinterpret(NSStreamNetworkServiceTypeVoice_LAYOUT.byteSize()) }
private val NSStreamNetworkServiceTypeVoice_VH: VarHandle by lazy { NSStreamNetworkServiceTypeVoice_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStreamNetworkServiceTypeVoice: MemorySegment
    get() = NSStreamNetworkServiceTypeVoice_VH.get(NSStreamNetworkServiceTypeVoice_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamNetworkServiceTypeVoice_VH.set(NSStreamNetworkServiceTypeVoice_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStreamNetworkServiceTypeCallSignaling typedef const NSStreamNetworkServiceTypeValue = (Void)*
 */
private val NSStreamNetworkServiceTypeCallSignaling_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStreamNetworkServiceTypeCallSignaling_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSStreamNetworkServiceTypeCallSignaling").orElseThrow().reinterpret(NSStreamNetworkServiceTypeCallSignaling_LAYOUT.byteSize()) }
private val NSStreamNetworkServiceTypeCallSignaling_VH: VarHandle by lazy { NSStreamNetworkServiceTypeCallSignaling_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var NSStreamNetworkServiceTypeCallSignaling: MemorySegment
    get() = NSStreamNetworkServiceTypeCallSignaling_VH.get(NSStreamNetworkServiceTypeCallSignaling_SEGMENT, 0L) as MemorySegment
    set(value) = NSStreamNetworkServiceTypeCallSignaling_VH.set(NSStreamNetworkServiceTypeCallSignaling_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWillBecomeMultiThreadedNotification typedef const NSNotificationName = (Void)*
 */
private val NSWillBecomeMultiThreadedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWillBecomeMultiThreadedNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSWillBecomeMultiThreadedNotification").orElseThrow().reinterpret(NSWillBecomeMultiThreadedNotification_LAYOUT.byteSize()) }
private val NSWillBecomeMultiThreadedNotification_VH: VarHandle by lazy { NSWillBecomeMultiThreadedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
var NSWillBecomeMultiThreadedNotification: MemorySegment
    get() = NSWillBecomeMultiThreadedNotification_VH.get(NSWillBecomeMultiThreadedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSWillBecomeMultiThreadedNotification_VH.set(NSWillBecomeMultiThreadedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDidBecomeSingleThreadedNotification typedef const NSNotificationName = (Void)*
 */
private val NSDidBecomeSingleThreadedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDidBecomeSingleThreadedNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDidBecomeSingleThreadedNotification").orElseThrow().reinterpret(NSDidBecomeSingleThreadedNotification_LAYOUT.byteSize()) }
private val NSDidBecomeSingleThreadedNotification_VH: VarHandle by lazy { NSDidBecomeSingleThreadedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Programs no longer transition to single-threaded mode from threaded environments")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Programs no longer transition to single-threaded mode from threaded environments")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Programs no longer transition to single-threaded mode from threaded environments")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Programs no longer transition to single-threaded mode from threaded environments")
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Programs no longer transition to single-threaded mode from threaded environments")
var NSDidBecomeSingleThreadedNotification: MemorySegment
    get() = NSDidBecomeSingleThreadedNotification_VH.get(NSDidBecomeSingleThreadedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSDidBecomeSingleThreadedNotification_VH.set(NSDidBecomeSingleThreadedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSThreadWillExitNotification typedef const NSNotificationName = (Void)*
 */
private val NSThreadWillExitNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSThreadWillExitNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSThreadWillExitNotification").orElseThrow().reinterpret(NSThreadWillExitNotification_LAYOUT.byteSize()) }
private val NSThreadWillExitNotification_VH: VarHandle by lazy { NSThreadWillExitNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 26, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This notification does not protect against data races")
var NSThreadWillExitNotification: MemorySegment
    get() = NSThreadWillExitNotification_VH.get(NSThreadWillExitNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSThreadWillExitNotification_VH.set(NSThreadWillExitNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSystemTimeZoneDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSSystemTimeZoneDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSystemTimeZoneDidChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSystemTimeZoneDidChangeNotification").orElseThrow().reinterpret(NSSystemTimeZoneDidChangeNotification_LAYOUT.byteSize()) }
private val NSSystemTimeZoneDidChangeNotification_VH: VarHandle by lazy { NSSystemTimeZoneDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSSystemTimeZoneDidChangeNotification: MemorySegment
    get() = NSSystemTimeZoneDidChangeNotification_VH.get(NSSystemTimeZoneDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSystemTimeZoneDidChangeNotification_VH.set(NSSystemTimeZoneDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLProtectionSpaceHTTP (Void)*
 */
private val NSURLProtectionSpaceHTTP_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLProtectionSpaceHTTP_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLProtectionSpaceHTTP").orElseThrow().reinterpret(NSURLProtectionSpaceHTTP_LAYOUT.byteSize()) }
private val NSURLProtectionSpaceHTTP_VH: VarHandle by lazy { NSURLProtectionSpaceHTTP_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLProtectionSpaceHTTP: MemorySegment
    get() = NSURLProtectionSpaceHTTP_VH.get(NSURLProtectionSpaceHTTP_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLProtectionSpaceHTTP_VH.set(NSURLProtectionSpaceHTTP_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLProtectionSpaceHTTPS (Void)*
 */
private val NSURLProtectionSpaceHTTPS_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLProtectionSpaceHTTPS_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLProtectionSpaceHTTPS").orElseThrow().reinterpret(NSURLProtectionSpaceHTTPS_LAYOUT.byteSize()) }
private val NSURLProtectionSpaceHTTPS_VH: VarHandle by lazy { NSURLProtectionSpaceHTTPS_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLProtectionSpaceHTTPS: MemorySegment
    get() = NSURLProtectionSpaceHTTPS_VH.get(NSURLProtectionSpaceHTTPS_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLProtectionSpaceHTTPS_VH.set(NSURLProtectionSpaceHTTPS_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLProtectionSpaceFTP (Void)*
 */
private val NSURLProtectionSpaceFTP_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLProtectionSpaceFTP_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLProtectionSpaceFTP").orElseThrow().reinterpret(NSURLProtectionSpaceFTP_LAYOUT.byteSize()) }
private val NSURLProtectionSpaceFTP_VH: VarHandle by lazy { NSURLProtectionSpaceFTP_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 18, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 18, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
var NSURLProtectionSpaceFTP: MemorySegment
    get() = NSURLProtectionSpaceFTP_VH.get(NSURLProtectionSpaceFTP_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLProtectionSpaceFTP_VH.set(NSURLProtectionSpaceFTP_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLProtectionSpaceHTTPProxy (Void)*
 */
private val NSURLProtectionSpaceHTTPProxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLProtectionSpaceHTTPProxy_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLProtectionSpaceHTTPProxy").orElseThrow().reinterpret(NSURLProtectionSpaceHTTPProxy_LAYOUT.byteSize()) }
private val NSURLProtectionSpaceHTTPProxy_VH: VarHandle by lazy { NSURLProtectionSpaceHTTPProxy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLProtectionSpaceHTTPProxy: MemorySegment
    get() = NSURLProtectionSpaceHTTPProxy_VH.get(NSURLProtectionSpaceHTTPProxy_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLProtectionSpaceHTTPProxy_VH.set(NSURLProtectionSpaceHTTPProxy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLProtectionSpaceHTTPSProxy (Void)*
 */
private val NSURLProtectionSpaceHTTPSProxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLProtectionSpaceHTTPSProxy_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLProtectionSpaceHTTPSProxy").orElseThrow().reinterpret(NSURLProtectionSpaceHTTPSProxy_LAYOUT.byteSize()) }
private val NSURLProtectionSpaceHTTPSProxy_VH: VarHandle by lazy { NSURLProtectionSpaceHTTPSProxy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLProtectionSpaceHTTPSProxy: MemorySegment
    get() = NSURLProtectionSpaceHTTPSProxy_VH.get(NSURLProtectionSpaceHTTPSProxy_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLProtectionSpaceHTTPSProxy_VH.set(NSURLProtectionSpaceHTTPSProxy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLProtectionSpaceFTPProxy (Void)*
 */
private val NSURLProtectionSpaceFTPProxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLProtectionSpaceFTPProxy_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLProtectionSpaceFTPProxy").orElseThrow().reinterpret(NSURLProtectionSpaceFTPProxy_LAYOUT.byteSize()) }
private val NSURLProtectionSpaceFTPProxy_VH: VarHandle by lazy { NSURLProtectionSpaceFTPProxy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 18, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 18, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 4, deprecatedSubminor = -1, message = "FTP is deprecated and only supported in the classic loading mode")
var NSURLProtectionSpaceFTPProxy: MemorySegment
    get() = NSURLProtectionSpaceFTPProxy_VH.get(NSURLProtectionSpaceFTPProxy_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLProtectionSpaceFTPProxy_VH.set(NSURLProtectionSpaceFTPProxy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLProtectionSpaceSOCKSProxy (Void)*
 */
private val NSURLProtectionSpaceSOCKSProxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLProtectionSpaceSOCKSProxy_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLProtectionSpaceSOCKSProxy").orElseThrow().reinterpret(NSURLProtectionSpaceSOCKSProxy_LAYOUT.byteSize()) }
private val NSURLProtectionSpaceSOCKSProxy_VH: VarHandle by lazy { NSURLProtectionSpaceSOCKSProxy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLProtectionSpaceSOCKSProxy: MemorySegment
    get() = NSURLProtectionSpaceSOCKSProxy_VH.get(NSURLProtectionSpaceSOCKSProxy_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLProtectionSpaceSOCKSProxy_VH.set(NSURLProtectionSpaceSOCKSProxy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAuthenticationMethodDefault (Void)*
 */
private val NSURLAuthenticationMethodDefault_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAuthenticationMethodDefault_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLAuthenticationMethodDefault").orElseThrow().reinterpret(NSURLAuthenticationMethodDefault_LAYOUT.byteSize()) }
private val NSURLAuthenticationMethodDefault_VH: VarHandle by lazy { NSURLAuthenticationMethodDefault_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAuthenticationMethodDefault: MemorySegment
    get() = NSURLAuthenticationMethodDefault_VH.get(NSURLAuthenticationMethodDefault_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAuthenticationMethodDefault_VH.set(NSURLAuthenticationMethodDefault_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAuthenticationMethodHTTPBasic (Void)*
 */
private val NSURLAuthenticationMethodHTTPBasic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAuthenticationMethodHTTPBasic_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLAuthenticationMethodHTTPBasic").orElseThrow().reinterpret(NSURLAuthenticationMethodHTTPBasic_LAYOUT.byteSize()) }
private val NSURLAuthenticationMethodHTTPBasic_VH: VarHandle by lazy { NSURLAuthenticationMethodHTTPBasic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAuthenticationMethodHTTPBasic: MemorySegment
    get() = NSURLAuthenticationMethodHTTPBasic_VH.get(NSURLAuthenticationMethodHTTPBasic_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAuthenticationMethodHTTPBasic_VH.set(NSURLAuthenticationMethodHTTPBasic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAuthenticationMethodHTTPDigest (Void)*
 */
private val NSURLAuthenticationMethodHTTPDigest_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAuthenticationMethodHTTPDigest_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLAuthenticationMethodHTTPDigest").orElseThrow().reinterpret(NSURLAuthenticationMethodHTTPDigest_LAYOUT.byteSize()) }
private val NSURLAuthenticationMethodHTTPDigest_VH: VarHandle by lazy { NSURLAuthenticationMethodHTTPDigest_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAuthenticationMethodHTTPDigest: MemorySegment
    get() = NSURLAuthenticationMethodHTTPDigest_VH.get(NSURLAuthenticationMethodHTTPDigest_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAuthenticationMethodHTTPDigest_VH.set(NSURLAuthenticationMethodHTTPDigest_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAuthenticationMethodHTMLForm (Void)*
 */
private val NSURLAuthenticationMethodHTMLForm_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAuthenticationMethodHTMLForm_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLAuthenticationMethodHTMLForm").orElseThrow().reinterpret(NSURLAuthenticationMethodHTMLForm_LAYOUT.byteSize()) }
private val NSURLAuthenticationMethodHTMLForm_VH: VarHandle by lazy { NSURLAuthenticationMethodHTMLForm_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAuthenticationMethodHTMLForm: MemorySegment
    get() = NSURLAuthenticationMethodHTMLForm_VH.get(NSURLAuthenticationMethodHTMLForm_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAuthenticationMethodHTMLForm_VH.set(NSURLAuthenticationMethodHTMLForm_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAuthenticationMethodNTLM (Void)*
 */
private val NSURLAuthenticationMethodNTLM_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAuthenticationMethodNTLM_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLAuthenticationMethodNTLM").orElseThrow().reinterpret(NSURLAuthenticationMethodNTLM_LAYOUT.byteSize()) }
private val NSURLAuthenticationMethodNTLM_VH: VarHandle by lazy { NSURLAuthenticationMethodNTLM_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAuthenticationMethodNTLM: MemorySegment
    get() = NSURLAuthenticationMethodNTLM_VH.get(NSURLAuthenticationMethodNTLM_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAuthenticationMethodNTLM_VH.set(NSURLAuthenticationMethodNTLM_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAuthenticationMethodNegotiate (Void)*
 */
private val NSURLAuthenticationMethodNegotiate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAuthenticationMethodNegotiate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLAuthenticationMethodNegotiate").orElseThrow().reinterpret(NSURLAuthenticationMethodNegotiate_LAYOUT.byteSize()) }
private val NSURLAuthenticationMethodNegotiate_VH: VarHandle by lazy { NSURLAuthenticationMethodNegotiate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAuthenticationMethodNegotiate: MemorySegment
    get() = NSURLAuthenticationMethodNegotiate_VH.get(NSURLAuthenticationMethodNegotiate_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAuthenticationMethodNegotiate_VH.set(NSURLAuthenticationMethodNegotiate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAuthenticationMethodClientCertificate (Void)*
 */
private val NSURLAuthenticationMethodClientCertificate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAuthenticationMethodClientCertificate_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLAuthenticationMethodClientCertificate").orElseThrow().reinterpret(NSURLAuthenticationMethodClientCertificate_LAYOUT.byteSize()) }
private val NSURLAuthenticationMethodClientCertificate_VH: VarHandle by lazy { NSURLAuthenticationMethodClientCertificate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAuthenticationMethodClientCertificate: MemorySegment
    get() = NSURLAuthenticationMethodClientCertificate_VH.get(NSURLAuthenticationMethodClientCertificate_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAuthenticationMethodClientCertificate_VH.set(NSURLAuthenticationMethodClientCertificate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAuthenticationMethodServerTrust (Void)*
 */
private val NSURLAuthenticationMethodServerTrust_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAuthenticationMethodServerTrust_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLAuthenticationMethodServerTrust").orElseThrow().reinterpret(NSURLAuthenticationMethodServerTrust_LAYOUT.byteSize()) }
private val NSURLAuthenticationMethodServerTrust_VH: VarHandle by lazy { NSURLAuthenticationMethodServerTrust_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAuthenticationMethodServerTrust: MemorySegment
    get() = NSURLAuthenticationMethodServerTrust_VH.get(NSURLAuthenticationMethodServerTrust_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAuthenticationMethodServerTrust_VH.set(NSURLAuthenticationMethodServerTrust_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLCredentialStorageChangedNotification typedef const NSNotificationName = (Void)*
 */
private val NSURLCredentialStorageChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLCredentialStorageChangedNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLCredentialStorageChangedNotification").orElseThrow().reinterpret(NSURLCredentialStorageChangedNotification_LAYOUT.byteSize()) }
private val NSURLCredentialStorageChangedNotification_VH: VarHandle by lazy { NSURLCredentialStorageChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
var NSURLCredentialStorageChangedNotification: MemorySegment
    get() = NSURLCredentialStorageChangedNotification_VH.get(NSURLCredentialStorageChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLCredentialStorageChangedNotification_VH.set(NSURLCredentialStorageChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLCredentialStorageRemoveSynchronizableCredentials (Void)*
 */
private val NSURLCredentialStorageRemoveSynchronizableCredentials_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLCredentialStorageRemoveSynchronizableCredentials_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLCredentialStorageRemoveSynchronizableCredentials").orElseThrow().reinterpret(NSURLCredentialStorageRemoveSynchronizableCredentials_LAYOUT.byteSize()) }
private val NSURLCredentialStorageRemoveSynchronizableCredentials_VH: VarHandle by lazy { NSURLCredentialStorageRemoveSynchronizableCredentials_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLCredentialStorageRemoveSynchronizableCredentials: MemorySegment
    get() = NSURLCredentialStorageRemoveSynchronizableCredentials_VH.get(NSURLCredentialStorageRemoveSynchronizableCredentials_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLCredentialStorageRemoveSynchronizableCredentials_VH.set(NSURLCredentialStorageRemoveSynchronizableCredentials_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSURLErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLErrorDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLErrorDomain").orElseThrow().reinterpret(NSURLErrorDomain_LAYOUT.byteSize()) }
private val NSURLErrorDomain_VH: VarHandle by lazy { NSURLErrorDomain_LAYOUT.varHandle() }

var NSURLErrorDomain: MemorySegment
    get() = NSURLErrorDomain_VH.get(NSURLErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLErrorDomain_VH.set(NSURLErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLErrorFailingURLErrorKey (Void)*
 */
private val NSURLErrorFailingURLErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLErrorFailingURLErrorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLErrorFailingURLErrorKey").orElseThrow().reinterpret(NSURLErrorFailingURLErrorKey_LAYOUT.byteSize()) }
private val NSURLErrorFailingURLErrorKey_VH: VarHandle by lazy { NSURLErrorFailingURLErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLErrorFailingURLErrorKey: MemorySegment
    get() = NSURLErrorFailingURLErrorKey_VH.get(NSURLErrorFailingURLErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLErrorFailingURLErrorKey_VH.set(NSURLErrorFailingURLErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLErrorFailingURLStringErrorKey (Void)*
 */
private val NSURLErrorFailingURLStringErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLErrorFailingURLStringErrorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLErrorFailingURLStringErrorKey").orElseThrow().reinterpret(NSURLErrorFailingURLStringErrorKey_LAYOUT.byteSize()) }
private val NSURLErrorFailingURLStringErrorKey_VH: VarHandle by lazy { NSURLErrorFailingURLStringErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 18, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 18, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
var NSURLErrorFailingURLStringErrorKey: MemorySegment
    get() = NSURLErrorFailingURLStringErrorKey_VH.get(NSURLErrorFailingURLStringErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLErrorFailingURLStringErrorKey_VH.set(NSURLErrorFailingURLStringErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSErrorFailingURLStringKey (Void)*
 */
private val NSErrorFailingURLStringKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSErrorFailingURLStringKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSErrorFailingURLStringKey").orElseThrow().reinterpret(NSErrorFailingURLStringKey_LAYOUT.byteSize()) }
private val NSErrorFailingURLStringKey_VH: VarHandle by lazy { NSErrorFailingURLStringKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLErrorFailingURLErrorKey instead")
var NSErrorFailingURLStringKey: MemorySegment
    get() = NSErrorFailingURLStringKey_VH.get(NSErrorFailingURLStringKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSErrorFailingURLStringKey_VH.set(NSErrorFailingURLStringKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLErrorFailingURLPeerTrustErrorKey (Void)*
 */
private val NSURLErrorFailingURLPeerTrustErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLErrorFailingURLPeerTrustErrorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLErrorFailingURLPeerTrustErrorKey").orElseThrow().reinterpret(NSURLErrorFailingURLPeerTrustErrorKey_LAYOUT.byteSize()) }
private val NSURLErrorFailingURLPeerTrustErrorKey_VH: VarHandle by lazy { NSURLErrorFailingURLPeerTrustErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLErrorFailingURLPeerTrustErrorKey: MemorySegment
    get() = NSURLErrorFailingURLPeerTrustErrorKey_VH.get(NSURLErrorFailingURLPeerTrustErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLErrorFailingURLPeerTrustErrorKey_VH.set(NSURLErrorFailingURLPeerTrustErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLErrorBackgroundTaskCancelledReasonKey (Void)*
 */
private val NSURLErrorBackgroundTaskCancelledReasonKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLErrorBackgroundTaskCancelledReasonKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLErrorBackgroundTaskCancelledReasonKey").orElseThrow().reinterpret(NSURLErrorBackgroundTaskCancelledReasonKey_LAYOUT.byteSize()) }
private val NSURLErrorBackgroundTaskCancelledReasonKey_VH: VarHandle by lazy { NSURLErrorBackgroundTaskCancelledReasonKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLErrorBackgroundTaskCancelledReasonKey: MemorySegment
    get() = NSURLErrorBackgroundTaskCancelledReasonKey_VH.get(NSURLErrorBackgroundTaskCancelledReasonKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLErrorBackgroundTaskCancelledReasonKey_VH.set(NSURLErrorBackgroundTaskCancelledReasonKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLErrorNetworkUnavailableReasonKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSURLErrorNetworkUnavailableReasonKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLErrorNetworkUnavailableReasonKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSURLErrorNetworkUnavailableReasonKey").orElseThrow().reinterpret(NSURLErrorNetworkUnavailableReasonKey_LAYOUT.byteSize()) }
private val NSURLErrorNetworkUnavailableReasonKey_VH: VarHandle by lazy { NSURLErrorNetworkUnavailableReasonKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
var NSURLErrorNetworkUnavailableReasonKey: MemorySegment
    get() = NSURLErrorNetworkUnavailableReasonKey_VH.get(NSURLErrorNetworkUnavailableReasonKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLErrorNetworkUnavailableReasonKey_VH.set(NSURLErrorNetworkUnavailableReasonKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSGlobalDomain (Void)*
 */
private val NSGlobalDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGlobalDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSGlobalDomain").orElseThrow().reinterpret(NSGlobalDomain_LAYOUT.byteSize()) }
private val NSGlobalDomain_VH: VarHandle by lazy { NSGlobalDomain_LAYOUT.varHandle() }

var NSGlobalDomain: MemorySegment
    get() = NSGlobalDomain_VH.get(NSGlobalDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSGlobalDomain_VH.set(NSGlobalDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSArgumentDomain (Void)*
 */
private val NSArgumentDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSArgumentDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSArgumentDomain").orElseThrow().reinterpret(NSArgumentDomain_LAYOUT.byteSize()) }
private val NSArgumentDomain_VH: VarHandle by lazy { NSArgumentDomain_LAYOUT.varHandle() }

var NSArgumentDomain: MemorySegment
    get() = NSArgumentDomain_VH.get(NSArgumentDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSArgumentDomain_VH.set(NSArgumentDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRegistrationDomain (Void)*
 */
private val NSRegistrationDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRegistrationDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSRegistrationDomain").orElseThrow().reinterpret(NSRegistrationDomain_LAYOUT.byteSize()) }
private val NSRegistrationDomain_VH: VarHandle by lazy { NSRegistrationDomain_LAYOUT.varHandle() }

var NSRegistrationDomain: MemorySegment
    get() = NSRegistrationDomain_VH.get(NSRegistrationDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSRegistrationDomain_VH.set(NSRegistrationDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUserDefaultsSizeLimitExceededNotification typedef const NSNotificationName = (Void)*
 */
private val NSUserDefaultsSizeLimitExceededNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUserDefaultsSizeLimitExceededNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUserDefaultsSizeLimitExceededNotification").orElseThrow().reinterpret(NSUserDefaultsSizeLimitExceededNotification_LAYOUT.byteSize()) }
private val NSUserDefaultsSizeLimitExceededNotification_VH: VarHandle by lazy { NSUserDefaultsSizeLimitExceededNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSUserDefaultsSizeLimitExceededNotification: MemorySegment
    get() = NSUserDefaultsSizeLimitExceededNotification_VH.get(NSUserDefaultsSizeLimitExceededNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUserDefaultsSizeLimitExceededNotification_VH.set(NSUserDefaultsSizeLimitExceededNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUbiquitousUserDefaultsNoCloudAccountNotification typedef const NSNotificationName = (Void)*
 */
private val NSUbiquitousUserDefaultsNoCloudAccountNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUbiquitousUserDefaultsNoCloudAccountNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUbiquitousUserDefaultsNoCloudAccountNotification").orElseThrow().reinterpret(NSUbiquitousUserDefaultsNoCloudAccountNotification_LAYOUT.byteSize()) }
private val NSUbiquitousUserDefaultsNoCloudAccountNotification_VH: VarHandle by lazy { NSUbiquitousUserDefaultsNoCloudAccountNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
var NSUbiquitousUserDefaultsNoCloudAccountNotification: MemorySegment
    get() = NSUbiquitousUserDefaultsNoCloudAccountNotification_VH.get(NSUbiquitousUserDefaultsNoCloudAccountNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUbiquitousUserDefaultsNoCloudAccountNotification_VH.set(NSUbiquitousUserDefaultsNoCloudAccountNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUbiquitousUserDefaultsDidChangeAccountsNotification typedef const NSNotificationName = (Void)*
 */
private val NSUbiquitousUserDefaultsDidChangeAccountsNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUbiquitousUserDefaultsDidChangeAccountsNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUbiquitousUserDefaultsDidChangeAccountsNotification").orElseThrow().reinterpret(NSUbiquitousUserDefaultsDidChangeAccountsNotification_LAYOUT.byteSize()) }
private val NSUbiquitousUserDefaultsDidChangeAccountsNotification_VH: VarHandle by lazy { NSUbiquitousUserDefaultsDidChangeAccountsNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
var NSUbiquitousUserDefaultsDidChangeAccountsNotification: MemorySegment
    get() = NSUbiquitousUserDefaultsDidChangeAccountsNotification_VH.get(NSUbiquitousUserDefaultsDidChangeAccountsNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUbiquitousUserDefaultsDidChangeAccountsNotification_VH.set(NSUbiquitousUserDefaultsDidChangeAccountsNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUbiquitousUserDefaultsCompletedInitialSyncNotification typedef const NSNotificationName = (Void)*
 */
private val NSUbiquitousUserDefaultsCompletedInitialSyncNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUbiquitousUserDefaultsCompletedInitialSyncNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUbiquitousUserDefaultsCompletedInitialSyncNotification").orElseThrow().reinterpret(NSUbiquitousUserDefaultsCompletedInitialSyncNotification_LAYOUT.byteSize()) }
private val NSUbiquitousUserDefaultsCompletedInitialSyncNotification_VH: VarHandle by lazy { NSUbiquitousUserDefaultsCompletedInitialSyncNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 3, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Notification is never posted")
var NSUbiquitousUserDefaultsCompletedInitialSyncNotification: MemorySegment
    get() = NSUbiquitousUserDefaultsCompletedInitialSyncNotification_VH.get(NSUbiquitousUserDefaultsCompletedInitialSyncNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUbiquitousUserDefaultsCompletedInitialSyncNotification_VH.set(NSUbiquitousUserDefaultsCompletedInitialSyncNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUserDefaultsDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSUserDefaultsDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUserDefaultsDidChangeNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUserDefaultsDidChangeNotification").orElseThrow().reinterpret(NSUserDefaultsDidChangeNotification_LAYOUT.byteSize()) }
private val NSUserDefaultsDidChangeNotification_VH: VarHandle by lazy { NSUserDefaultsDidChangeNotification_LAYOUT.varHandle() }

var NSUserDefaultsDidChangeNotification: MemorySegment
    get() = NSUserDefaultsDidChangeNotification_VH.get(NSUserDefaultsDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSUserDefaultsDidChangeNotification_VH.set(NSUserDefaultsDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSWeekDayNameArray (Void)*
 */
private val NSWeekDayNameArray_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWeekDayNameArray_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSWeekDayNameArray").orElseThrow().reinterpret(NSWeekDayNameArray_LAYOUT.byteSize()) }
private val NSWeekDayNameArray_VH: VarHandle by lazy { NSWeekDayNameArray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSWeekDayNameArray: MemorySegment
    get() = NSWeekDayNameArray_VH.get(NSWeekDayNameArray_SEGMENT, 0L) as MemorySegment
    set(value) = NSWeekDayNameArray_VH.set(NSWeekDayNameArray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSShortWeekDayNameArray (Void)*
 */
private val NSShortWeekDayNameArray_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSShortWeekDayNameArray_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSShortWeekDayNameArray").orElseThrow().reinterpret(NSShortWeekDayNameArray_LAYOUT.byteSize()) }
private val NSShortWeekDayNameArray_VH: VarHandle by lazy { NSShortWeekDayNameArray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSShortWeekDayNameArray: MemorySegment
    get() = NSShortWeekDayNameArray_VH.get(NSShortWeekDayNameArray_SEGMENT, 0L) as MemorySegment
    set(value) = NSShortWeekDayNameArray_VH.set(NSShortWeekDayNameArray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMonthNameArray (Void)*
 */
private val NSMonthNameArray_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMonthNameArray_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMonthNameArray").orElseThrow().reinterpret(NSMonthNameArray_LAYOUT.byteSize()) }
private val NSMonthNameArray_VH: VarHandle by lazy { NSMonthNameArray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMonthNameArray: MemorySegment
    get() = NSMonthNameArray_VH.get(NSMonthNameArray_SEGMENT, 0L) as MemorySegment
    set(value) = NSMonthNameArray_VH.set(NSMonthNameArray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSShortMonthNameArray (Void)*
 */
private val NSShortMonthNameArray_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSShortMonthNameArray_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSShortMonthNameArray").orElseThrow().reinterpret(NSShortMonthNameArray_LAYOUT.byteSize()) }
private val NSShortMonthNameArray_VH: VarHandle by lazy { NSShortMonthNameArray_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSShortMonthNameArray: MemorySegment
    get() = NSShortMonthNameArray_VH.get(NSShortMonthNameArray_SEGMENT, 0L) as MemorySegment
    set(value) = NSShortMonthNameArray_VH.set(NSShortMonthNameArray_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTimeFormatString (Void)*
 */
private val NSTimeFormatString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTimeFormatString_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTimeFormatString").orElseThrow().reinterpret(NSTimeFormatString_LAYOUT.byteSize()) }
private val NSTimeFormatString_VH: VarHandle by lazy { NSTimeFormatString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSTimeFormatString: MemorySegment
    get() = NSTimeFormatString_VH.get(NSTimeFormatString_SEGMENT, 0L) as MemorySegment
    set(value) = NSTimeFormatString_VH.set(NSTimeFormatString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDateFormatString (Void)*
 */
private val NSDateFormatString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDateFormatString_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDateFormatString").orElseThrow().reinterpret(NSDateFormatString_LAYOUT.byteSize()) }
private val NSDateFormatString_VH: VarHandle by lazy { NSDateFormatString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSDateFormatString: MemorySegment
    get() = NSDateFormatString_VH.get(NSDateFormatString_SEGMENT, 0L) as MemorySegment
    set(value) = NSDateFormatString_VH.set(NSDateFormatString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSTimeDateFormatString (Void)*
 */
private val NSTimeDateFormatString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTimeDateFormatString_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSTimeDateFormatString").orElseThrow().reinterpret(NSTimeDateFormatString_LAYOUT.byteSize()) }
private val NSTimeDateFormatString_VH: VarHandle by lazy { NSTimeDateFormatString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSTimeDateFormatString: MemorySegment
    get() = NSTimeDateFormatString_VH.get(NSTimeDateFormatString_SEGMENT, 0L) as MemorySegment
    set(value) = NSTimeDateFormatString_VH.set(NSTimeDateFormatString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSShortTimeDateFormatString (Void)*
 */
private val NSShortTimeDateFormatString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSShortTimeDateFormatString_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSShortTimeDateFormatString").orElseThrow().reinterpret(NSShortTimeDateFormatString_LAYOUT.byteSize()) }
private val NSShortTimeDateFormatString_VH: VarHandle by lazy { NSShortTimeDateFormatString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSShortTimeDateFormatString: MemorySegment
    get() = NSShortTimeDateFormatString_VH.get(NSShortTimeDateFormatString_SEGMENT, 0L) as MemorySegment
    set(value) = NSShortTimeDateFormatString_VH.set(NSShortTimeDateFormatString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCurrencySymbol (Void)*
 */
private val NSCurrencySymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCurrencySymbol_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSCurrencySymbol").orElseThrow().reinterpret(NSCurrencySymbol_LAYOUT.byteSize()) }
private val NSCurrencySymbol_VH: VarHandle by lazy { NSCurrencySymbol_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSCurrencySymbol: MemorySegment
    get() = NSCurrencySymbol_VH.get(NSCurrencySymbol_SEGMENT, 0L) as MemorySegment
    set(value) = NSCurrencySymbol_VH.set(NSCurrencySymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDecimalSeparator (Void)*
 */
private val NSDecimalSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDecimalSeparator_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDecimalSeparator").orElseThrow().reinterpret(NSDecimalSeparator_LAYOUT.byteSize()) }
private val NSDecimalSeparator_VH: VarHandle by lazy { NSDecimalSeparator_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSDecimalSeparator: MemorySegment
    get() = NSDecimalSeparator_VH.get(NSDecimalSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = NSDecimalSeparator_VH.set(NSDecimalSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSThousandsSeparator (Void)*
 */
private val NSThousandsSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSThousandsSeparator_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSThousandsSeparator").orElseThrow().reinterpret(NSThousandsSeparator_LAYOUT.byteSize()) }
private val NSThousandsSeparator_VH: VarHandle by lazy { NSThousandsSeparator_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSThousandsSeparator: MemorySegment
    get() = NSThousandsSeparator_VH.get(NSThousandsSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = NSThousandsSeparator_VH.set(NSThousandsSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDecimalDigits (Void)*
 */
private val NSDecimalDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDecimalDigits_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDecimalDigits").orElseThrow().reinterpret(NSDecimalDigits_LAYOUT.byteSize()) }
private val NSDecimalDigits_VH: VarHandle by lazy { NSDecimalDigits_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSDecimalDigits: MemorySegment
    get() = NSDecimalDigits_VH.get(NSDecimalDigits_SEGMENT, 0L) as MemorySegment
    set(value) = NSDecimalDigits_VH.set(NSDecimalDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAMPMDesignation (Void)*
 */
private val NSAMPMDesignation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAMPMDesignation_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSAMPMDesignation").orElseThrow().reinterpret(NSAMPMDesignation_LAYOUT.byteSize()) }
private val NSAMPMDesignation_VH: VarHandle by lazy { NSAMPMDesignation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSAMPMDesignation: MemorySegment
    get() = NSAMPMDesignation_VH.get(NSAMPMDesignation_SEGMENT, 0L) as MemorySegment
    set(value) = NSAMPMDesignation_VH.set(NSAMPMDesignation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHourNameDesignations (Void)*
 */
private val NSHourNameDesignations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHourNameDesignations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSHourNameDesignations").orElseThrow().reinterpret(NSHourNameDesignations_LAYOUT.byteSize()) }
private val NSHourNameDesignations_VH: VarHandle by lazy { NSHourNameDesignations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSHourNameDesignations: MemorySegment
    get() = NSHourNameDesignations_VH.get(NSHourNameDesignations_SEGMENT, 0L) as MemorySegment
    set(value) = NSHourNameDesignations_VH.set(NSHourNameDesignations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSYearMonthWeekDesignations (Void)*
 */
private val NSYearMonthWeekDesignations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSYearMonthWeekDesignations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSYearMonthWeekDesignations").orElseThrow().reinterpret(NSYearMonthWeekDesignations_LAYOUT.byteSize()) }
private val NSYearMonthWeekDesignations_VH: VarHandle by lazy { NSYearMonthWeekDesignations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSYearMonthWeekDesignations: MemorySegment
    get() = NSYearMonthWeekDesignations_VH.get(NSYearMonthWeekDesignations_SEGMENT, 0L) as MemorySegment
    set(value) = NSYearMonthWeekDesignations_VH.set(NSYearMonthWeekDesignations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSEarlierTimeDesignations (Void)*
 */
private val NSEarlierTimeDesignations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSEarlierTimeDesignations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSEarlierTimeDesignations").orElseThrow().reinterpret(NSEarlierTimeDesignations_LAYOUT.byteSize()) }
private val NSEarlierTimeDesignations_VH: VarHandle by lazy { NSEarlierTimeDesignations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSEarlierTimeDesignations: MemorySegment
    get() = NSEarlierTimeDesignations_VH.get(NSEarlierTimeDesignations_SEGMENT, 0L) as MemorySegment
    set(value) = NSEarlierTimeDesignations_VH.set(NSEarlierTimeDesignations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLaterTimeDesignations (Void)*
 */
private val NSLaterTimeDesignations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLaterTimeDesignations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLaterTimeDesignations").orElseThrow().reinterpret(NSLaterTimeDesignations_LAYOUT.byteSize()) }
private val NSLaterTimeDesignations_VH: VarHandle by lazy { NSLaterTimeDesignations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSLaterTimeDesignations: MemorySegment
    get() = NSLaterTimeDesignations_VH.get(NSLaterTimeDesignations_SEGMENT, 0L) as MemorySegment
    set(value) = NSLaterTimeDesignations_VH.set(NSLaterTimeDesignations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSThisDayDesignations (Void)*
 */
private val NSThisDayDesignations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSThisDayDesignations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSThisDayDesignations").orElseThrow().reinterpret(NSThisDayDesignations_LAYOUT.byteSize()) }
private val NSThisDayDesignations_VH: VarHandle by lazy { NSThisDayDesignations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSThisDayDesignations: MemorySegment
    get() = NSThisDayDesignations_VH.get(NSThisDayDesignations_SEGMENT, 0L) as MemorySegment
    set(value) = NSThisDayDesignations_VH.set(NSThisDayDesignations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSNextDayDesignations (Void)*
 */
private val NSNextDayDesignations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNextDayDesignations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSNextDayDesignations").orElseThrow().reinterpret(NSNextDayDesignations_LAYOUT.byteSize()) }
private val NSNextDayDesignations_VH: VarHandle by lazy { NSNextDayDesignations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSNextDayDesignations: MemorySegment
    get() = NSNextDayDesignations_VH.get(NSNextDayDesignations_SEGMENT, 0L) as MemorySegment
    set(value) = NSNextDayDesignations_VH.set(NSNextDayDesignations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSNextNextDayDesignations (Void)*
 */
private val NSNextNextDayDesignations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNextNextDayDesignations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSNextNextDayDesignations").orElseThrow().reinterpret(NSNextNextDayDesignations_LAYOUT.byteSize()) }
private val NSNextNextDayDesignations_VH: VarHandle by lazy { NSNextNextDayDesignations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSNextNextDayDesignations: MemorySegment
    get() = NSNextNextDayDesignations_VH.get(NSNextNextDayDesignations_SEGMENT, 0L) as MemorySegment
    set(value) = NSNextNextDayDesignations_VH.set(NSNextNextDayDesignations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPriorDayDesignations (Void)*
 */
private val NSPriorDayDesignations_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPriorDayDesignations_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPriorDayDesignations").orElseThrow().reinterpret(NSPriorDayDesignations_LAYOUT.byteSize()) }
private val NSPriorDayDesignations_VH: VarHandle by lazy { NSPriorDayDesignations_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSPriorDayDesignations: MemorySegment
    get() = NSPriorDayDesignations_VH.get(NSPriorDayDesignations_SEGMENT, 0L) as MemorySegment
    set(value) = NSPriorDayDesignations_VH.set(NSPriorDayDesignations_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDateTimeOrdering (Void)*
 */
private val NSDateTimeOrdering_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDateTimeOrdering_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSDateTimeOrdering").orElseThrow().reinterpret(NSDateTimeOrdering_LAYOUT.byteSize()) }
private val NSDateTimeOrdering_VH: VarHandle by lazy { NSDateTimeOrdering_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSDateTimeOrdering: MemorySegment
    get() = NSDateTimeOrdering_VH.get(NSDateTimeOrdering_SEGMENT, 0L) as MemorySegment
    set(value) = NSDateTimeOrdering_VH.set(NSDateTimeOrdering_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInternationalCurrencyString (Void)*
 */
private val NSInternationalCurrencyString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInternationalCurrencyString_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSInternationalCurrencyString").orElseThrow().reinterpret(NSInternationalCurrencyString_LAYOUT.byteSize()) }
private val NSInternationalCurrencyString_VH: VarHandle by lazy { NSInternationalCurrencyString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSInternationalCurrencyString: MemorySegment
    get() = NSInternationalCurrencyString_VH.get(NSInternationalCurrencyString_SEGMENT, 0L) as MemorySegment
    set(value) = NSInternationalCurrencyString_VH.set(NSInternationalCurrencyString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSShortDateFormatString (Void)*
 */
private val NSShortDateFormatString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSShortDateFormatString_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSShortDateFormatString").orElseThrow().reinterpret(NSShortDateFormatString_LAYOUT.byteSize()) }
private val NSShortDateFormatString_VH: VarHandle by lazy { NSShortDateFormatString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSShortDateFormatString: MemorySegment
    get() = NSShortDateFormatString_VH.get(NSShortDateFormatString_SEGMENT, 0L) as MemorySegment
    set(value) = NSShortDateFormatString_VH.set(NSShortDateFormatString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPositiveCurrencyFormatString (Void)*
 */
private val NSPositiveCurrencyFormatString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPositiveCurrencyFormatString_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSPositiveCurrencyFormatString").orElseThrow().reinterpret(NSPositiveCurrencyFormatString_LAYOUT.byteSize()) }
private val NSPositiveCurrencyFormatString_VH: VarHandle by lazy { NSPositiveCurrencyFormatString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSPositiveCurrencyFormatString: MemorySegment
    get() = NSPositiveCurrencyFormatString_VH.get(NSPositiveCurrencyFormatString_SEGMENT, 0L) as MemorySegment
    set(value) = NSPositiveCurrencyFormatString_VH.set(NSPositiveCurrencyFormatString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSNegativeCurrencyFormatString (Void)*
 */
private val NSNegativeCurrencyFormatString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNegativeCurrencyFormatString_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSNegativeCurrencyFormatString").orElseThrow().reinterpret(NSNegativeCurrencyFormatString_LAYOUT.byteSize()) }
private val NSNegativeCurrencyFormatString_VH: VarHandle by lazy { NSNegativeCurrencyFormatString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSNegativeCurrencyFormatString: MemorySegment
    get() = NSNegativeCurrencyFormatString_VH.get(NSNegativeCurrencyFormatString_SEGMENT, 0L) as MemorySegment
    set(value) = NSNegativeCurrencyFormatString_VH.set(NSNegativeCurrencyFormatString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSNegateBooleanTransformerName typedef const NSValueTransformerName = (Void)*
 */
private val NSNegateBooleanTransformerName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNegateBooleanTransformerName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSNegateBooleanTransformerName").orElseThrow().reinterpret(NSNegateBooleanTransformerName_LAYOUT.byteSize()) }
private val NSNegateBooleanTransformerName_VH: VarHandle by lazy { NSNegateBooleanTransformerName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSNegateBooleanTransformerName: MemorySegment
    get() = NSNegateBooleanTransformerName_VH.get(NSNegateBooleanTransformerName_SEGMENT, 0L) as MemorySegment
    set(value) = NSNegateBooleanTransformerName_VH.set(NSNegateBooleanTransformerName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSIsNilTransformerName typedef const NSValueTransformerName = (Void)*
 */
private val NSIsNilTransformerName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSIsNilTransformerName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSIsNilTransformerName").orElseThrow().reinterpret(NSIsNilTransformerName_LAYOUT.byteSize()) }
private val NSIsNilTransformerName_VH: VarHandle by lazy { NSIsNilTransformerName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSIsNilTransformerName: MemorySegment
    get() = NSIsNilTransformerName_VH.get(NSIsNilTransformerName_SEGMENT, 0L) as MemorySegment
    set(value) = NSIsNilTransformerName_VH.set(NSIsNilTransformerName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSIsNotNilTransformerName typedef const NSValueTransformerName = (Void)*
 */
private val NSIsNotNilTransformerName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSIsNotNilTransformerName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSIsNotNilTransformerName").orElseThrow().reinterpret(NSIsNotNilTransformerName_LAYOUT.byteSize()) }
private val NSIsNotNilTransformerName_VH: VarHandle by lazy { NSIsNotNilTransformerName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSIsNotNilTransformerName: MemorySegment
    get() = NSIsNotNilTransformerName_VH.get(NSIsNotNilTransformerName_SEGMENT, 0L) as MemorySegment
    set(value) = NSIsNotNilTransformerName_VH.set(NSIsNotNilTransformerName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnarchiveFromDataTransformerName typedef const NSValueTransformerName = (Void)*
 */
private val NSUnarchiveFromDataTransformerName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUnarchiveFromDataTransformerName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSUnarchiveFromDataTransformerName").orElseThrow().reinterpret(NSUnarchiveFromDataTransformerName_LAYOUT.byteSize()) }
private val NSUnarchiveFromDataTransformerName_VH: VarHandle by lazy { NSUnarchiveFromDataTransformerName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSUnarchiveFromDataTransformerName: MemorySegment
    get() = NSUnarchiveFromDataTransformerName_VH.get(NSUnarchiveFromDataTransformerName_SEGMENT, 0L) as MemorySegment
    set(value) = NSUnarchiveFromDataTransformerName_VH.set(NSUnarchiveFromDataTransformerName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSKeyedUnarchiveFromDataTransformerName typedef const NSValueTransformerName = (Void)*
 */
private val NSKeyedUnarchiveFromDataTransformerName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSKeyedUnarchiveFromDataTransformerName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSKeyedUnarchiveFromDataTransformerName").orElseThrow().reinterpret(NSKeyedUnarchiveFromDataTransformerName_LAYOUT.byteSize()) }
private val NSKeyedUnarchiveFromDataTransformerName_VH: VarHandle by lazy { NSKeyedUnarchiveFromDataTransformerName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSKeyedUnarchiveFromDataTransformerName: MemorySegment
    get() = NSKeyedUnarchiveFromDataTransformerName_VH.get(NSKeyedUnarchiveFromDataTransformerName_SEGMENT, 0L) as MemorySegment
    set(value) = NSKeyedUnarchiveFromDataTransformerName_VH.set(NSKeyedUnarchiveFromDataTransformerName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSecureUnarchiveFromDataTransformerName typedef const NSValueTransformerName = (Void)*
 */
private val NSSecureUnarchiveFromDataTransformerName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSecureUnarchiveFromDataTransformerName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSSecureUnarchiveFromDataTransformerName").orElseThrow().reinterpret(NSSecureUnarchiveFromDataTransformerName_LAYOUT.byteSize()) }
private val NSSecureUnarchiveFromDataTransformerName_VH: VarHandle by lazy { NSSecureUnarchiveFromDataTransformerName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
var NSSecureUnarchiveFromDataTransformerName: MemorySegment
    get() = NSSecureUnarchiveFromDataTransformerName_VH.get(NSSecureUnarchiveFromDataTransformerName_SEGMENT, 0L) as MemorySegment
    set(value) = NSSecureUnarchiveFromDataTransformerName_VH.set(NSSecureUnarchiveFromDataTransformerName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSXMLParserErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSXMLParserErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSXMLParserErrorDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSXMLParserErrorDomain").orElseThrow().reinterpret(NSXMLParserErrorDomain_LAYOUT.byteSize()) }
private val NSXMLParserErrorDomain_VH: VarHandle by lazy { NSXMLParserErrorDomain_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSXMLParserErrorDomain: MemorySegment
    get() = NSXMLParserErrorDomain_VH.get(NSXMLParserErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSXMLParserErrorDomain_VH.set(NSXMLParserErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionItemsAndErrorsKey (Void)*
 */
private val NSExtensionItemsAndErrorsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionItemsAndErrorsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSExtensionItemsAndErrorsKey").orElseThrow().reinterpret(NSExtensionItemsAndErrorsKey_LAYOUT.byteSize()) }
private val NSExtensionItemsAndErrorsKey_VH: VarHandle by lazy { NSExtensionItemsAndErrorsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionItemsAndErrorsKey: MemorySegment
    get() = NSExtensionItemsAndErrorsKey_VH.get(NSExtensionItemsAndErrorsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionItemsAndErrorsKey_VH.set(NSExtensionItemsAndErrorsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionHostWillEnterForegroundNotification (Void)*
 */
private val NSExtensionHostWillEnterForegroundNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionHostWillEnterForegroundNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSExtensionHostWillEnterForegroundNotification").orElseThrow().reinterpret(NSExtensionHostWillEnterForegroundNotification_LAYOUT.byteSize()) }
private val NSExtensionHostWillEnterForegroundNotification_VH: VarHandle by lazy { NSExtensionHostWillEnterForegroundNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionHostWillEnterForegroundNotification: MemorySegment
    get() = NSExtensionHostWillEnterForegroundNotification_VH.get(NSExtensionHostWillEnterForegroundNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionHostWillEnterForegroundNotification_VH.set(NSExtensionHostWillEnterForegroundNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionHostDidEnterBackgroundNotification (Void)*
 */
private val NSExtensionHostDidEnterBackgroundNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionHostDidEnterBackgroundNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSExtensionHostDidEnterBackgroundNotification").orElseThrow().reinterpret(NSExtensionHostDidEnterBackgroundNotification_LAYOUT.byteSize()) }
private val NSExtensionHostDidEnterBackgroundNotification_VH: VarHandle by lazy { NSExtensionHostDidEnterBackgroundNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionHostDidEnterBackgroundNotification: MemorySegment
    get() = NSExtensionHostDidEnterBackgroundNotification_VH.get(NSExtensionHostDidEnterBackgroundNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionHostDidEnterBackgroundNotification_VH.set(NSExtensionHostDidEnterBackgroundNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionHostWillResignActiveNotification (Void)*
 */
private val NSExtensionHostWillResignActiveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionHostWillResignActiveNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSExtensionHostWillResignActiveNotification").orElseThrow().reinterpret(NSExtensionHostWillResignActiveNotification_LAYOUT.byteSize()) }
private val NSExtensionHostWillResignActiveNotification_VH: VarHandle by lazy { NSExtensionHostWillResignActiveNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionHostWillResignActiveNotification: MemorySegment
    get() = NSExtensionHostWillResignActiveNotification_VH.get(NSExtensionHostWillResignActiveNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionHostWillResignActiveNotification_VH.set(NSExtensionHostWillResignActiveNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionHostDidBecomeActiveNotification (Void)*
 */
private val NSExtensionHostDidBecomeActiveNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionHostDidBecomeActiveNotification_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSExtensionHostDidBecomeActiveNotification").orElseThrow().reinterpret(NSExtensionHostDidBecomeActiveNotification_LAYOUT.byteSize()) }
private val NSExtensionHostDidBecomeActiveNotification_VH: VarHandle by lazy { NSExtensionHostDidBecomeActiveNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionHostDidBecomeActiveNotification: MemorySegment
    get() = NSExtensionHostDidBecomeActiveNotification_VH.get(NSExtensionHostDidBecomeActiveNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionHostDidBecomeActiveNotification_VH.set(NSExtensionHostDidBecomeActiveNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionItemAttributedTitleKey (Void)*
 */
private val NSExtensionItemAttributedTitleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionItemAttributedTitleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSExtensionItemAttributedTitleKey").orElseThrow().reinterpret(NSExtensionItemAttributedTitleKey_LAYOUT.byteSize()) }
private val NSExtensionItemAttributedTitleKey_VH: VarHandle by lazy { NSExtensionItemAttributedTitleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionItemAttributedTitleKey: MemorySegment
    get() = NSExtensionItemAttributedTitleKey_VH.get(NSExtensionItemAttributedTitleKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionItemAttributedTitleKey_VH.set(NSExtensionItemAttributedTitleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionItemAttributedContentTextKey (Void)*
 */
private val NSExtensionItemAttributedContentTextKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionItemAttributedContentTextKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSExtensionItemAttributedContentTextKey").orElseThrow().reinterpret(NSExtensionItemAttributedContentTextKey_LAYOUT.byteSize()) }
private val NSExtensionItemAttributedContentTextKey_VH: VarHandle by lazy { NSExtensionItemAttributedContentTextKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionItemAttributedContentTextKey: MemorySegment
    get() = NSExtensionItemAttributedContentTextKey_VH.get(NSExtensionItemAttributedContentTextKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionItemAttributedContentTextKey_VH.set(NSExtensionItemAttributedContentTextKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionItemAttachmentsKey (Void)*
 */
private val NSExtensionItemAttachmentsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionItemAttachmentsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSExtensionItemAttachmentsKey").orElseThrow().reinterpret(NSExtensionItemAttachmentsKey_LAYOUT.byteSize()) }
private val NSExtensionItemAttachmentsKey_VH: VarHandle by lazy { NSExtensionItemAttachmentsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionItemAttachmentsKey: MemorySegment
    get() = NSExtensionItemAttachmentsKey_VH.get(NSExtensionItemAttachmentsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionItemAttachmentsKey_VH.set(NSExtensionItemAttachmentsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagSchemeTokenType typedef const NSLinguisticTagScheme = (Void)*
 */
private val NSLinguisticTagSchemeTokenType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagSchemeTokenType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagSchemeTokenType").orElseThrow().reinterpret(NSLinguisticTagSchemeTokenType_LAYOUT.byteSize()) }
private val NSLinguisticTagSchemeTokenType_VH: VarHandle by lazy { NSLinguisticTagSchemeTokenType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagSchemeTokenType: MemorySegment
    get() = NSLinguisticTagSchemeTokenType_VH.get(NSLinguisticTagSchemeTokenType_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagSchemeTokenType_VH.set(NSLinguisticTagSchemeTokenType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagSchemeLexicalClass typedef const NSLinguisticTagScheme = (Void)*
 */
private val NSLinguisticTagSchemeLexicalClass_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagSchemeLexicalClass_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagSchemeLexicalClass").orElseThrow().reinterpret(NSLinguisticTagSchemeLexicalClass_LAYOUT.byteSize()) }
private val NSLinguisticTagSchemeLexicalClass_VH: VarHandle by lazy { NSLinguisticTagSchemeLexicalClass_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagSchemeLexicalClass: MemorySegment
    get() = NSLinguisticTagSchemeLexicalClass_VH.get(NSLinguisticTagSchemeLexicalClass_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagSchemeLexicalClass_VH.set(NSLinguisticTagSchemeLexicalClass_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagSchemeNameType typedef const NSLinguisticTagScheme = (Void)*
 */
private val NSLinguisticTagSchemeNameType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagSchemeNameType_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagSchemeNameType").orElseThrow().reinterpret(NSLinguisticTagSchemeNameType_LAYOUT.byteSize()) }
private val NSLinguisticTagSchemeNameType_VH: VarHandle by lazy { NSLinguisticTagSchemeNameType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagSchemeNameType: MemorySegment
    get() = NSLinguisticTagSchemeNameType_VH.get(NSLinguisticTagSchemeNameType_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagSchemeNameType_VH.set(NSLinguisticTagSchemeNameType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagSchemeNameTypeOrLexicalClass typedef const NSLinguisticTagScheme = (Void)*
 */
private val NSLinguisticTagSchemeNameTypeOrLexicalClass_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagSchemeNameTypeOrLexicalClass_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagSchemeNameTypeOrLexicalClass").orElseThrow().reinterpret(NSLinguisticTagSchemeNameTypeOrLexicalClass_LAYOUT.byteSize()) }
private val NSLinguisticTagSchemeNameTypeOrLexicalClass_VH: VarHandle by lazy { NSLinguisticTagSchemeNameTypeOrLexicalClass_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagSchemeNameTypeOrLexicalClass: MemorySegment
    get() = NSLinguisticTagSchemeNameTypeOrLexicalClass_VH.get(NSLinguisticTagSchemeNameTypeOrLexicalClass_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagSchemeNameTypeOrLexicalClass_VH.set(NSLinguisticTagSchemeNameTypeOrLexicalClass_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagSchemeLemma typedef const NSLinguisticTagScheme = (Void)*
 */
private val NSLinguisticTagSchemeLemma_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagSchemeLemma_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagSchemeLemma").orElseThrow().reinterpret(NSLinguisticTagSchemeLemma_LAYOUT.byteSize()) }
private val NSLinguisticTagSchemeLemma_VH: VarHandle by lazy { NSLinguisticTagSchemeLemma_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagSchemeLemma: MemorySegment
    get() = NSLinguisticTagSchemeLemma_VH.get(NSLinguisticTagSchemeLemma_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagSchemeLemma_VH.set(NSLinguisticTagSchemeLemma_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagSchemeLanguage typedef const NSLinguisticTagScheme = (Void)*
 */
private val NSLinguisticTagSchemeLanguage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagSchemeLanguage_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagSchemeLanguage").orElseThrow().reinterpret(NSLinguisticTagSchemeLanguage_LAYOUT.byteSize()) }
private val NSLinguisticTagSchemeLanguage_VH: VarHandle by lazy { NSLinguisticTagSchemeLanguage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagSchemeLanguage: MemorySegment
    get() = NSLinguisticTagSchemeLanguage_VH.get(NSLinguisticTagSchemeLanguage_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagSchemeLanguage_VH.set(NSLinguisticTagSchemeLanguage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagSchemeScript typedef const NSLinguisticTagScheme = (Void)*
 */
private val NSLinguisticTagSchemeScript_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagSchemeScript_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagSchemeScript").orElseThrow().reinterpret(NSLinguisticTagSchemeScript_LAYOUT.byteSize()) }
private val NSLinguisticTagSchemeScript_VH: VarHandle by lazy { NSLinguisticTagSchemeScript_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagSchemeScript: MemorySegment
    get() = NSLinguisticTagSchemeScript_VH.get(NSLinguisticTagSchemeScript_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagSchemeScript_VH.set(NSLinguisticTagSchemeScript_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagWord typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagWord_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagWord_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagWord").orElseThrow().reinterpret(NSLinguisticTagWord_LAYOUT.byteSize()) }
private val NSLinguisticTagWord_VH: VarHandle by lazy { NSLinguisticTagWord_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagWord: MemorySegment
    get() = NSLinguisticTagWord_VH.get(NSLinguisticTagWord_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagWord_VH.set(NSLinguisticTagWord_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagPunctuation typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagPunctuation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagPunctuation_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagPunctuation").orElseThrow().reinterpret(NSLinguisticTagPunctuation_LAYOUT.byteSize()) }
private val NSLinguisticTagPunctuation_VH: VarHandle by lazy { NSLinguisticTagPunctuation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagPunctuation: MemorySegment
    get() = NSLinguisticTagPunctuation_VH.get(NSLinguisticTagPunctuation_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagPunctuation_VH.set(NSLinguisticTagPunctuation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagWhitespace typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagWhitespace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagWhitespace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagWhitespace").orElseThrow().reinterpret(NSLinguisticTagWhitespace_LAYOUT.byteSize()) }
private val NSLinguisticTagWhitespace_VH: VarHandle by lazy { NSLinguisticTagWhitespace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagWhitespace: MemorySegment
    get() = NSLinguisticTagWhitespace_VH.get(NSLinguisticTagWhitespace_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagWhitespace_VH.set(NSLinguisticTagWhitespace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagOther typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagOther_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagOther_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagOther").orElseThrow().reinterpret(NSLinguisticTagOther_LAYOUT.byteSize()) }
private val NSLinguisticTagOther_VH: VarHandle by lazy { NSLinguisticTagOther_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagOther: MemorySegment
    get() = NSLinguisticTagOther_VH.get(NSLinguisticTagOther_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagOther_VH.set(NSLinguisticTagOther_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagNoun typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagNoun_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagNoun_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagNoun").orElseThrow().reinterpret(NSLinguisticTagNoun_LAYOUT.byteSize()) }
private val NSLinguisticTagNoun_VH: VarHandle by lazy { NSLinguisticTagNoun_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagNoun: MemorySegment
    get() = NSLinguisticTagNoun_VH.get(NSLinguisticTagNoun_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagNoun_VH.set(NSLinguisticTagNoun_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagVerb typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagVerb_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagVerb_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagVerb").orElseThrow().reinterpret(NSLinguisticTagVerb_LAYOUT.byteSize()) }
private val NSLinguisticTagVerb_VH: VarHandle by lazy { NSLinguisticTagVerb_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagVerb: MemorySegment
    get() = NSLinguisticTagVerb_VH.get(NSLinguisticTagVerb_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagVerb_VH.set(NSLinguisticTagVerb_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagAdjective typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagAdjective_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagAdjective_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagAdjective").orElseThrow().reinterpret(NSLinguisticTagAdjective_LAYOUT.byteSize()) }
private val NSLinguisticTagAdjective_VH: VarHandle by lazy { NSLinguisticTagAdjective_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagAdjective: MemorySegment
    get() = NSLinguisticTagAdjective_VH.get(NSLinguisticTagAdjective_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagAdjective_VH.set(NSLinguisticTagAdjective_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagAdverb typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagAdverb_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagAdverb_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagAdverb").orElseThrow().reinterpret(NSLinguisticTagAdverb_LAYOUT.byteSize()) }
private val NSLinguisticTagAdverb_VH: VarHandle by lazy { NSLinguisticTagAdverb_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagAdverb: MemorySegment
    get() = NSLinguisticTagAdverb_VH.get(NSLinguisticTagAdverb_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagAdverb_VH.set(NSLinguisticTagAdverb_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagPronoun typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagPronoun_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagPronoun_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagPronoun").orElseThrow().reinterpret(NSLinguisticTagPronoun_LAYOUT.byteSize()) }
private val NSLinguisticTagPronoun_VH: VarHandle by lazy { NSLinguisticTagPronoun_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagPronoun: MemorySegment
    get() = NSLinguisticTagPronoun_VH.get(NSLinguisticTagPronoun_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagPronoun_VH.set(NSLinguisticTagPronoun_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagDeterminer typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagDeterminer_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagDeterminer_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagDeterminer").orElseThrow().reinterpret(NSLinguisticTagDeterminer_LAYOUT.byteSize()) }
private val NSLinguisticTagDeterminer_VH: VarHandle by lazy { NSLinguisticTagDeterminer_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagDeterminer: MemorySegment
    get() = NSLinguisticTagDeterminer_VH.get(NSLinguisticTagDeterminer_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagDeterminer_VH.set(NSLinguisticTagDeterminer_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagParticle typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagParticle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagParticle_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagParticle").orElseThrow().reinterpret(NSLinguisticTagParticle_LAYOUT.byteSize()) }
private val NSLinguisticTagParticle_VH: VarHandle by lazy { NSLinguisticTagParticle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagParticle: MemorySegment
    get() = NSLinguisticTagParticle_VH.get(NSLinguisticTagParticle_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagParticle_VH.set(NSLinguisticTagParticle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagPreposition typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagPreposition_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagPreposition_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagPreposition").orElseThrow().reinterpret(NSLinguisticTagPreposition_LAYOUT.byteSize()) }
private val NSLinguisticTagPreposition_VH: VarHandle by lazy { NSLinguisticTagPreposition_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagPreposition: MemorySegment
    get() = NSLinguisticTagPreposition_VH.get(NSLinguisticTagPreposition_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagPreposition_VH.set(NSLinguisticTagPreposition_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagNumber typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagNumber_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagNumber").orElseThrow().reinterpret(NSLinguisticTagNumber_LAYOUT.byteSize()) }
private val NSLinguisticTagNumber_VH: VarHandle by lazy { NSLinguisticTagNumber_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagNumber: MemorySegment
    get() = NSLinguisticTagNumber_VH.get(NSLinguisticTagNumber_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagNumber_VH.set(NSLinguisticTagNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagConjunction typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagConjunction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagConjunction_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagConjunction").orElseThrow().reinterpret(NSLinguisticTagConjunction_LAYOUT.byteSize()) }
private val NSLinguisticTagConjunction_VH: VarHandle by lazy { NSLinguisticTagConjunction_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagConjunction: MemorySegment
    get() = NSLinguisticTagConjunction_VH.get(NSLinguisticTagConjunction_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagConjunction_VH.set(NSLinguisticTagConjunction_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagInterjection typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagInterjection_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagInterjection_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagInterjection").orElseThrow().reinterpret(NSLinguisticTagInterjection_LAYOUT.byteSize()) }
private val NSLinguisticTagInterjection_VH: VarHandle by lazy { NSLinguisticTagInterjection_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagInterjection: MemorySegment
    get() = NSLinguisticTagInterjection_VH.get(NSLinguisticTagInterjection_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagInterjection_VH.set(NSLinguisticTagInterjection_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagClassifier typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagClassifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagClassifier_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagClassifier").orElseThrow().reinterpret(NSLinguisticTagClassifier_LAYOUT.byteSize()) }
private val NSLinguisticTagClassifier_VH: VarHandle by lazy { NSLinguisticTagClassifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagClassifier: MemorySegment
    get() = NSLinguisticTagClassifier_VH.get(NSLinguisticTagClassifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagClassifier_VH.set(NSLinguisticTagClassifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagIdiom typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagIdiom_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagIdiom_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagIdiom").orElseThrow().reinterpret(NSLinguisticTagIdiom_LAYOUT.byteSize()) }
private val NSLinguisticTagIdiom_VH: VarHandle by lazy { NSLinguisticTagIdiom_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagIdiom: MemorySegment
    get() = NSLinguisticTagIdiom_VH.get(NSLinguisticTagIdiom_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagIdiom_VH.set(NSLinguisticTagIdiom_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagOtherWord typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagOtherWord_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagOtherWord_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagOtherWord").orElseThrow().reinterpret(NSLinguisticTagOtherWord_LAYOUT.byteSize()) }
private val NSLinguisticTagOtherWord_VH: VarHandle by lazy { NSLinguisticTagOtherWord_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagOtherWord: MemorySegment
    get() = NSLinguisticTagOtherWord_VH.get(NSLinguisticTagOtherWord_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagOtherWord_VH.set(NSLinguisticTagOtherWord_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagSentenceTerminator typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagSentenceTerminator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagSentenceTerminator_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagSentenceTerminator").orElseThrow().reinterpret(NSLinguisticTagSentenceTerminator_LAYOUT.byteSize()) }
private val NSLinguisticTagSentenceTerminator_VH: VarHandle by lazy { NSLinguisticTagSentenceTerminator_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagSentenceTerminator: MemorySegment
    get() = NSLinguisticTagSentenceTerminator_VH.get(NSLinguisticTagSentenceTerminator_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagSentenceTerminator_VH.set(NSLinguisticTagSentenceTerminator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagOpenQuote typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagOpenQuote_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagOpenQuote_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagOpenQuote").orElseThrow().reinterpret(NSLinguisticTagOpenQuote_LAYOUT.byteSize()) }
private val NSLinguisticTagOpenQuote_VH: VarHandle by lazy { NSLinguisticTagOpenQuote_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagOpenQuote: MemorySegment
    get() = NSLinguisticTagOpenQuote_VH.get(NSLinguisticTagOpenQuote_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagOpenQuote_VH.set(NSLinguisticTagOpenQuote_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagCloseQuote typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagCloseQuote_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagCloseQuote_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagCloseQuote").orElseThrow().reinterpret(NSLinguisticTagCloseQuote_LAYOUT.byteSize()) }
private val NSLinguisticTagCloseQuote_VH: VarHandle by lazy { NSLinguisticTagCloseQuote_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagCloseQuote: MemorySegment
    get() = NSLinguisticTagCloseQuote_VH.get(NSLinguisticTagCloseQuote_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagCloseQuote_VH.set(NSLinguisticTagCloseQuote_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagOpenParenthesis typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagOpenParenthesis_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagOpenParenthesis_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagOpenParenthesis").orElseThrow().reinterpret(NSLinguisticTagOpenParenthesis_LAYOUT.byteSize()) }
private val NSLinguisticTagOpenParenthesis_VH: VarHandle by lazy { NSLinguisticTagOpenParenthesis_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagOpenParenthesis: MemorySegment
    get() = NSLinguisticTagOpenParenthesis_VH.get(NSLinguisticTagOpenParenthesis_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagOpenParenthesis_VH.set(NSLinguisticTagOpenParenthesis_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagCloseParenthesis typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagCloseParenthesis_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagCloseParenthesis_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagCloseParenthesis").orElseThrow().reinterpret(NSLinguisticTagCloseParenthesis_LAYOUT.byteSize()) }
private val NSLinguisticTagCloseParenthesis_VH: VarHandle by lazy { NSLinguisticTagCloseParenthesis_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagCloseParenthesis: MemorySegment
    get() = NSLinguisticTagCloseParenthesis_VH.get(NSLinguisticTagCloseParenthesis_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagCloseParenthesis_VH.set(NSLinguisticTagCloseParenthesis_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagWordJoiner typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagWordJoiner_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagWordJoiner_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagWordJoiner").orElseThrow().reinterpret(NSLinguisticTagWordJoiner_LAYOUT.byteSize()) }
private val NSLinguisticTagWordJoiner_VH: VarHandle by lazy { NSLinguisticTagWordJoiner_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagWordJoiner: MemorySegment
    get() = NSLinguisticTagWordJoiner_VH.get(NSLinguisticTagWordJoiner_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagWordJoiner_VH.set(NSLinguisticTagWordJoiner_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagDash typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagDash_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagDash_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagDash").orElseThrow().reinterpret(NSLinguisticTagDash_LAYOUT.byteSize()) }
private val NSLinguisticTagDash_VH: VarHandle by lazy { NSLinguisticTagDash_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagDash: MemorySegment
    get() = NSLinguisticTagDash_VH.get(NSLinguisticTagDash_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagDash_VH.set(NSLinguisticTagDash_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagOtherPunctuation typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagOtherPunctuation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagOtherPunctuation_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagOtherPunctuation").orElseThrow().reinterpret(NSLinguisticTagOtherPunctuation_LAYOUT.byteSize()) }
private val NSLinguisticTagOtherPunctuation_VH: VarHandle by lazy { NSLinguisticTagOtherPunctuation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagOtherPunctuation: MemorySegment
    get() = NSLinguisticTagOtherPunctuation_VH.get(NSLinguisticTagOtherPunctuation_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagOtherPunctuation_VH.set(NSLinguisticTagOtherPunctuation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagParagraphBreak typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagParagraphBreak_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagParagraphBreak_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagParagraphBreak").orElseThrow().reinterpret(NSLinguisticTagParagraphBreak_LAYOUT.byteSize()) }
private val NSLinguisticTagParagraphBreak_VH: VarHandle by lazy { NSLinguisticTagParagraphBreak_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagParagraphBreak: MemorySegment
    get() = NSLinguisticTagParagraphBreak_VH.get(NSLinguisticTagParagraphBreak_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagParagraphBreak_VH.set(NSLinguisticTagParagraphBreak_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagOtherWhitespace typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagOtherWhitespace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagOtherWhitespace_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagOtherWhitespace").orElseThrow().reinterpret(NSLinguisticTagOtherWhitespace_LAYOUT.byteSize()) }
private val NSLinguisticTagOtherWhitespace_VH: VarHandle by lazy { NSLinguisticTagOtherWhitespace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagOtherWhitespace: MemorySegment
    get() = NSLinguisticTagOtherWhitespace_VH.get(NSLinguisticTagOtherWhitespace_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagOtherWhitespace_VH.set(NSLinguisticTagOtherWhitespace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagPersonalName typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagPersonalName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagPersonalName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagPersonalName").orElseThrow().reinterpret(NSLinguisticTagPersonalName_LAYOUT.byteSize()) }
private val NSLinguisticTagPersonalName_VH: VarHandle by lazy { NSLinguisticTagPersonalName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagPersonalName: MemorySegment
    get() = NSLinguisticTagPersonalName_VH.get(NSLinguisticTagPersonalName_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagPersonalName_VH.set(NSLinguisticTagPersonalName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagPlaceName typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagPlaceName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagPlaceName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagPlaceName").orElseThrow().reinterpret(NSLinguisticTagPlaceName_LAYOUT.byteSize()) }
private val NSLinguisticTagPlaceName_VH: VarHandle by lazy { NSLinguisticTagPlaceName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagPlaceName: MemorySegment
    get() = NSLinguisticTagPlaceName_VH.get(NSLinguisticTagPlaceName_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagPlaceName_VH.set(NSLinguisticTagPlaceName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLinguisticTagOrganizationName typedef const NSLinguisticTag = (Void)*
 */
private val NSLinguisticTagOrganizationName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLinguisticTagOrganizationName_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSLinguisticTagOrganizationName").orElseThrow().reinterpret(NSLinguisticTagOrganizationName_LAYOUT.byteSize()) }
private val NSLinguisticTagOrganizationName_VH: VarHandle by lazy { NSLinguisticTagOrganizationName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
var NSLinguisticTagOrganizationName: MemorySegment
    get() = NSLinguisticTagOrganizationName_VH.get(NSLinguisticTagOrganizationName_SEGMENT, 0L) as MemorySegment
    set(value) = NSLinguisticTagOrganizationName_VH.set(NSLinguisticTagOrganizationName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFSNameKey (Void)*
 */
private val NSMetadataItemFSNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFSNameKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFSNameKey").orElseThrow().reinterpret(NSMetadataItemFSNameKey_LAYOUT.byteSize()) }
private val NSMetadataItemFSNameKey_VH: VarHandle by lazy { NSMetadataItemFSNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemFSNameKey: MemorySegment
    get() = NSMetadataItemFSNameKey_VH.get(NSMetadataItemFSNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFSNameKey_VH.set(NSMetadataItemFSNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemDisplayNameKey (Void)*
 */
private val NSMetadataItemDisplayNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemDisplayNameKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemDisplayNameKey").orElseThrow().reinterpret(NSMetadataItemDisplayNameKey_LAYOUT.byteSize()) }
private val NSMetadataItemDisplayNameKey_VH: VarHandle by lazy { NSMetadataItemDisplayNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemDisplayNameKey: MemorySegment
    get() = NSMetadataItemDisplayNameKey_VH.get(NSMetadataItemDisplayNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemDisplayNameKey_VH.set(NSMetadataItemDisplayNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemURLKey (Void)*
 */
private val NSMetadataItemURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemURLKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemURLKey").orElseThrow().reinterpret(NSMetadataItemURLKey_LAYOUT.byteSize()) }
private val NSMetadataItemURLKey_VH: VarHandle by lazy { NSMetadataItemURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemURLKey: MemorySegment
    get() = NSMetadataItemURLKey_VH.get(NSMetadataItemURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemURLKey_VH.set(NSMetadataItemURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPathKey (Void)*
 */
private val NSMetadataItemPathKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPathKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPathKey").orElseThrow().reinterpret(NSMetadataItemPathKey_LAYOUT.byteSize()) }
private val NSMetadataItemPathKey_VH: VarHandle by lazy { NSMetadataItemPathKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemPathKey: MemorySegment
    get() = NSMetadataItemPathKey_VH.get(NSMetadataItemPathKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPathKey_VH.set(NSMetadataItemPathKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFSSizeKey (Void)*
 */
private val NSMetadataItemFSSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFSSizeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFSSizeKey").orElseThrow().reinterpret(NSMetadataItemFSSizeKey_LAYOUT.byteSize()) }
private val NSMetadataItemFSSizeKey_VH: VarHandle by lazy { NSMetadataItemFSSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemFSSizeKey: MemorySegment
    get() = NSMetadataItemFSSizeKey_VH.get(NSMetadataItemFSSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFSSizeKey_VH.set(NSMetadataItemFSSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFSCreationDateKey (Void)*
 */
private val NSMetadataItemFSCreationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFSCreationDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFSCreationDateKey").orElseThrow().reinterpret(NSMetadataItemFSCreationDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemFSCreationDateKey_VH: VarHandle by lazy { NSMetadataItemFSCreationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemFSCreationDateKey: MemorySegment
    get() = NSMetadataItemFSCreationDateKey_VH.get(NSMetadataItemFSCreationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFSCreationDateKey_VH.set(NSMetadataItemFSCreationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFSContentChangeDateKey (Void)*
 */
private val NSMetadataItemFSContentChangeDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFSContentChangeDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFSContentChangeDateKey").orElseThrow().reinterpret(NSMetadataItemFSContentChangeDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemFSContentChangeDateKey_VH: VarHandle by lazy { NSMetadataItemFSContentChangeDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemFSContentChangeDateKey: MemorySegment
    get() = NSMetadataItemFSContentChangeDateKey_VH.get(NSMetadataItemFSContentChangeDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFSContentChangeDateKey_VH.set(NSMetadataItemFSContentChangeDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemContentTypeKey (Void)*
 */
private val NSMetadataItemContentTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemContentTypeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemContentTypeKey").orElseThrow().reinterpret(NSMetadataItemContentTypeKey_LAYOUT.byteSize()) }
private val NSMetadataItemContentTypeKey_VH: VarHandle by lazy { NSMetadataItemContentTypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemContentTypeKey: MemorySegment
    get() = NSMetadataItemContentTypeKey_VH.get(NSMetadataItemContentTypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemContentTypeKey_VH.set(NSMetadataItemContentTypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemContentTypeTreeKey (Void)*
 */
private val NSMetadataItemContentTypeTreeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemContentTypeTreeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemContentTypeTreeKey").orElseThrow().reinterpret(NSMetadataItemContentTypeTreeKey_LAYOUT.byteSize()) }
private val NSMetadataItemContentTypeTreeKey_VH: VarHandle by lazy { NSMetadataItemContentTypeTreeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemContentTypeTreeKey: MemorySegment
    get() = NSMetadataItemContentTypeTreeKey_VH.get(NSMetadataItemContentTypeTreeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemContentTypeTreeKey_VH.set(NSMetadataItemContentTypeTreeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemIsUbiquitousKey (Void)*
 */
private val NSMetadataItemIsUbiquitousKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemIsUbiquitousKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemIsUbiquitousKey").orElseThrow().reinterpret(NSMetadataItemIsUbiquitousKey_LAYOUT.byteSize()) }
private val NSMetadataItemIsUbiquitousKey_VH: VarHandle by lazy { NSMetadataItemIsUbiquitousKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataItemIsUbiquitousKey: MemorySegment
    get() = NSMetadataItemIsUbiquitousKey_VH.get(NSMetadataItemIsUbiquitousKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemIsUbiquitousKey_VH.set(NSMetadataItemIsUbiquitousKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemHasUnresolvedConflictsKey (Void)*
 */
private val NSMetadataUbiquitousItemHasUnresolvedConflictsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemHasUnresolvedConflictsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemHasUnresolvedConflictsKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemHasUnresolvedConflictsKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemHasUnresolvedConflictsKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemHasUnresolvedConflictsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemHasUnresolvedConflictsKey: MemorySegment
    get() = NSMetadataUbiquitousItemHasUnresolvedConflictsKey_VH.get(NSMetadataUbiquitousItemHasUnresolvedConflictsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemHasUnresolvedConflictsKey_VH.set(NSMetadataUbiquitousItemHasUnresolvedConflictsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemIsDownloadedKey (Void)*
 */
private val NSMetadataUbiquitousItemIsDownloadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemIsDownloadedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemIsDownloadedKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemIsDownloadedKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemIsDownloadedKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemIsDownloadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataUbiquitousItemDownloadingStatusKey instead")
var NSMetadataUbiquitousItemIsDownloadedKey: MemorySegment
    get() = NSMetadataUbiquitousItemIsDownloadedKey_VH.get(NSMetadataUbiquitousItemIsDownloadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemIsDownloadedKey_VH.set(NSMetadataUbiquitousItemIsDownloadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemDownloadingStatusKey (Void)*
 */
private val NSMetadataUbiquitousItemDownloadingStatusKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemDownloadingStatusKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemDownloadingStatusKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemDownloadingStatusKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemDownloadingStatusKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemDownloadingStatusKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemDownloadingStatusKey: MemorySegment
    get() = NSMetadataUbiquitousItemDownloadingStatusKey_VH.get(NSMetadataUbiquitousItemDownloadingStatusKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemDownloadingStatusKey_VH.set(NSMetadataUbiquitousItemDownloadingStatusKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemDownloadingStatusNotDownloaded (Void)*
 */
private val NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemDownloadingStatusNotDownloaded").orElseThrow().reinterpret(NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_VH: VarHandle by lazy { NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemDownloadingStatusNotDownloaded: MemorySegment
    get() = NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_VH.get(NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_VH.set(NSMetadataUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemDownloadingStatusDownloaded (Void)*
 */
private val NSMetadataUbiquitousItemDownloadingStatusDownloaded_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemDownloadingStatusDownloaded_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemDownloadingStatusDownloaded").orElseThrow().reinterpret(NSMetadataUbiquitousItemDownloadingStatusDownloaded_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemDownloadingStatusDownloaded_VH: VarHandle by lazy { NSMetadataUbiquitousItemDownloadingStatusDownloaded_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemDownloadingStatusDownloaded: MemorySegment
    get() = NSMetadataUbiquitousItemDownloadingStatusDownloaded_VH.get(NSMetadataUbiquitousItemDownloadingStatusDownloaded_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemDownloadingStatusDownloaded_VH.set(NSMetadataUbiquitousItemDownloadingStatusDownloaded_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemDownloadingStatusCurrent (Void)*
 */
private val NSMetadataUbiquitousItemDownloadingStatusCurrent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemDownloadingStatusCurrent_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemDownloadingStatusCurrent").orElseThrow().reinterpret(NSMetadataUbiquitousItemDownloadingStatusCurrent_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemDownloadingStatusCurrent_VH: VarHandle by lazy { NSMetadataUbiquitousItemDownloadingStatusCurrent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemDownloadingStatusCurrent: MemorySegment
    get() = NSMetadataUbiquitousItemDownloadingStatusCurrent_VH.get(NSMetadataUbiquitousItemDownloadingStatusCurrent_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemDownloadingStatusCurrent_VH.set(NSMetadataUbiquitousItemDownloadingStatusCurrent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemIsDownloadingKey (Void)*
 */
private val NSMetadataUbiquitousItemIsDownloadingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemIsDownloadingKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemIsDownloadingKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemIsDownloadingKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemIsDownloadingKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemIsDownloadingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemIsDownloadingKey: MemorySegment
    get() = NSMetadataUbiquitousItemIsDownloadingKey_VH.get(NSMetadataUbiquitousItemIsDownloadingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemIsDownloadingKey_VH.set(NSMetadataUbiquitousItemIsDownloadingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemIsUploadedKey (Void)*
 */
private val NSMetadataUbiquitousItemIsUploadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemIsUploadedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemIsUploadedKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemIsUploadedKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemIsUploadedKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemIsUploadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemIsUploadedKey: MemorySegment
    get() = NSMetadataUbiquitousItemIsUploadedKey_VH.get(NSMetadataUbiquitousItemIsUploadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemIsUploadedKey_VH.set(NSMetadataUbiquitousItemIsUploadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemIsUploadingKey (Void)*
 */
private val NSMetadataUbiquitousItemIsUploadingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemIsUploadingKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemIsUploadingKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemIsUploadingKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemIsUploadingKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemIsUploadingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemIsUploadingKey: MemorySegment
    get() = NSMetadataUbiquitousItemIsUploadingKey_VH.get(NSMetadataUbiquitousItemIsUploadingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemIsUploadingKey_VH.set(NSMetadataUbiquitousItemIsUploadingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemPercentDownloadedKey (Void)*
 */
private val NSMetadataUbiquitousItemPercentDownloadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemPercentDownloadedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemPercentDownloadedKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemPercentDownloadedKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemPercentDownloadedKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemPercentDownloadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemPercentDownloadedKey: MemorySegment
    get() = NSMetadataUbiquitousItemPercentDownloadedKey_VH.get(NSMetadataUbiquitousItemPercentDownloadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemPercentDownloadedKey_VH.set(NSMetadataUbiquitousItemPercentDownloadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemPercentUploadedKey (Void)*
 */
private val NSMetadataUbiquitousItemPercentUploadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemPercentUploadedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemPercentUploadedKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemPercentUploadedKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemPercentUploadedKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemPercentUploadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemPercentUploadedKey: MemorySegment
    get() = NSMetadataUbiquitousItemPercentUploadedKey_VH.get(NSMetadataUbiquitousItemPercentUploadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemPercentUploadedKey_VH.set(NSMetadataUbiquitousItemPercentUploadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemDownloadingErrorKey (Void)*
 */
private val NSMetadataUbiquitousItemDownloadingErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemDownloadingErrorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemDownloadingErrorKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemDownloadingErrorKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemDownloadingErrorKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemDownloadingErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemDownloadingErrorKey: MemorySegment
    get() = NSMetadataUbiquitousItemDownloadingErrorKey_VH.get(NSMetadataUbiquitousItemDownloadingErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemDownloadingErrorKey_VH.set(NSMetadataUbiquitousItemDownloadingErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemUploadingErrorKey (Void)*
 */
private val NSMetadataUbiquitousItemUploadingErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemUploadingErrorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemUploadingErrorKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemUploadingErrorKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemUploadingErrorKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemUploadingErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemUploadingErrorKey: MemorySegment
    get() = NSMetadataUbiquitousItemUploadingErrorKey_VH.get(NSMetadataUbiquitousItemUploadingErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemUploadingErrorKey_VH.set(NSMetadataUbiquitousItemUploadingErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemDownloadRequestedKey (Void)*
 */
private val NSMetadataUbiquitousItemDownloadRequestedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemDownloadRequestedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemDownloadRequestedKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemDownloadRequestedKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemDownloadRequestedKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemDownloadRequestedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemDownloadRequestedKey: MemorySegment
    get() = NSMetadataUbiquitousItemDownloadRequestedKey_VH.get(NSMetadataUbiquitousItemDownloadRequestedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemDownloadRequestedKey_VH.set(NSMetadataUbiquitousItemDownloadRequestedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemIsExternalDocumentKey (Void)*
 */
private val NSMetadataUbiquitousItemIsExternalDocumentKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemIsExternalDocumentKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemIsExternalDocumentKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemIsExternalDocumentKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemIsExternalDocumentKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemIsExternalDocumentKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemIsExternalDocumentKey: MemorySegment
    get() = NSMetadataUbiquitousItemIsExternalDocumentKey_VH.get(NSMetadataUbiquitousItemIsExternalDocumentKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemIsExternalDocumentKey_VH.set(NSMetadataUbiquitousItemIsExternalDocumentKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemContainerDisplayNameKey (Void)*
 */
private val NSMetadataUbiquitousItemContainerDisplayNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemContainerDisplayNameKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemContainerDisplayNameKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemContainerDisplayNameKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemContainerDisplayNameKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemContainerDisplayNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemContainerDisplayNameKey: MemorySegment
    get() = NSMetadataUbiquitousItemContainerDisplayNameKey_VH.get(NSMetadataUbiquitousItemContainerDisplayNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemContainerDisplayNameKey_VH.set(NSMetadataUbiquitousItemContainerDisplayNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemURLInLocalContainerKey (Void)*
 */
private val NSMetadataUbiquitousItemURLInLocalContainerKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemURLInLocalContainerKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemURLInLocalContainerKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemURLInLocalContainerKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemURLInLocalContainerKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemURLInLocalContainerKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSMetadataUbiquitousItemURLInLocalContainerKey: MemorySegment
    get() = NSMetadataUbiquitousItemURLInLocalContainerKey_VH.get(NSMetadataUbiquitousItemURLInLocalContainerKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemURLInLocalContainerKey_VH.set(NSMetadataUbiquitousItemURLInLocalContainerKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousItemIsSharedKey (Void)*
 */
private val NSMetadataUbiquitousItemIsSharedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousItemIsSharedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousItemIsSharedKey").orElseThrow().reinterpret(NSMetadataUbiquitousItemIsSharedKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousItemIsSharedKey_VH: VarHandle by lazy { NSMetadataUbiquitousItemIsSharedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousItemIsSharedKey: MemorySegment
    get() = NSMetadataUbiquitousItemIsSharedKey_VH.get(NSMetadataUbiquitousItemIsSharedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousItemIsSharedKey_VH.set(NSMetadataUbiquitousItemIsSharedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousSharedItemCurrentUserRoleKey (Void)*
 */
private val NSMetadataUbiquitousSharedItemCurrentUserRoleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousSharedItemCurrentUserRoleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousSharedItemCurrentUserRoleKey").orElseThrow().reinterpret(NSMetadataUbiquitousSharedItemCurrentUserRoleKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousSharedItemCurrentUserRoleKey_VH: VarHandle by lazy { NSMetadataUbiquitousSharedItemCurrentUserRoleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousSharedItemCurrentUserRoleKey: MemorySegment
    get() = NSMetadataUbiquitousSharedItemCurrentUserRoleKey_VH.get(NSMetadataUbiquitousSharedItemCurrentUserRoleKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousSharedItemCurrentUserRoleKey_VH.set(NSMetadataUbiquitousSharedItemCurrentUserRoleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey (Void)*
 */
private val NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey").orElseThrow().reinterpret(NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_VH: VarHandle by lazy { NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey: MemorySegment
    get() = NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_VH.get(NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_VH.set(NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousSharedItemOwnerNameComponentsKey (Void)*
 */
private val NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousSharedItemOwnerNameComponentsKey").orElseThrow().reinterpret(NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_VH: VarHandle by lazy { NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousSharedItemOwnerNameComponentsKey: MemorySegment
    get() = NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_VH.get(NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_VH.set(NSMetadataUbiquitousSharedItemOwnerNameComponentsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey (Void)*
 */
private val NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey").orElseThrow().reinterpret(NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_VH: VarHandle by lazy { NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey: MemorySegment
    get() = NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_VH.get(NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_VH.set(NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousSharedItemRoleOwner (Void)*
 */
private val NSMetadataUbiquitousSharedItemRoleOwner_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousSharedItemRoleOwner_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousSharedItemRoleOwner").orElseThrow().reinterpret(NSMetadataUbiquitousSharedItemRoleOwner_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousSharedItemRoleOwner_VH: VarHandle by lazy { NSMetadataUbiquitousSharedItemRoleOwner_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousSharedItemRoleOwner: MemorySegment
    get() = NSMetadataUbiquitousSharedItemRoleOwner_VH.get(NSMetadataUbiquitousSharedItemRoleOwner_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousSharedItemRoleOwner_VH.set(NSMetadataUbiquitousSharedItemRoleOwner_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousSharedItemRoleParticipant (Void)*
 */
private val NSMetadataUbiquitousSharedItemRoleParticipant_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousSharedItemRoleParticipant_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousSharedItemRoleParticipant").orElseThrow().reinterpret(NSMetadataUbiquitousSharedItemRoleParticipant_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousSharedItemRoleParticipant_VH: VarHandle by lazy { NSMetadataUbiquitousSharedItemRoleParticipant_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousSharedItemRoleParticipant: MemorySegment
    get() = NSMetadataUbiquitousSharedItemRoleParticipant_VH.get(NSMetadataUbiquitousSharedItemRoleParticipant_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousSharedItemRoleParticipant_VH.set(NSMetadataUbiquitousSharedItemRoleParticipant_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousSharedItemPermissionsReadOnly (Void)*
 */
private val NSMetadataUbiquitousSharedItemPermissionsReadOnly_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousSharedItemPermissionsReadOnly_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousSharedItemPermissionsReadOnly").orElseThrow().reinterpret(NSMetadataUbiquitousSharedItemPermissionsReadOnly_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousSharedItemPermissionsReadOnly_VH: VarHandle by lazy { NSMetadataUbiquitousSharedItemPermissionsReadOnly_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousSharedItemPermissionsReadOnly: MemorySegment
    get() = NSMetadataUbiquitousSharedItemPermissionsReadOnly_VH.get(NSMetadataUbiquitousSharedItemPermissionsReadOnly_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousSharedItemPermissionsReadOnly_VH.set(NSMetadataUbiquitousSharedItemPermissionsReadOnly_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataUbiquitousSharedItemPermissionsReadWrite (Void)*
 */
private val NSMetadataUbiquitousSharedItemPermissionsReadWrite_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataUbiquitousSharedItemPermissionsReadWrite_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataUbiquitousSharedItemPermissionsReadWrite").orElseThrow().reinterpret(NSMetadataUbiquitousSharedItemPermissionsReadWrite_LAYOUT.byteSize()) }
private val NSMetadataUbiquitousSharedItemPermissionsReadWrite_VH: VarHandle by lazy { NSMetadataUbiquitousSharedItemPermissionsReadWrite_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataUbiquitousSharedItemPermissionsReadWrite: MemorySegment
    get() = NSMetadataUbiquitousSharedItemPermissionsReadWrite_VH.get(NSMetadataUbiquitousSharedItemPermissionsReadWrite_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataUbiquitousSharedItemPermissionsReadWrite_VH.set(NSMetadataUbiquitousSharedItemPermissionsReadWrite_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAttributeChangeDateKey (Void)*
 */
private val NSMetadataItemAttributeChangeDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAttributeChangeDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAttributeChangeDateKey").orElseThrow().reinterpret(NSMetadataItemAttributeChangeDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemAttributeChangeDateKey_VH: VarHandle by lazy { NSMetadataItemAttributeChangeDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAttributeChangeDateKey: MemorySegment
    get() = NSMetadataItemAttributeChangeDateKey_VH.get(NSMetadataItemAttributeChangeDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAttributeChangeDateKey_VH.set(NSMetadataItemAttributeChangeDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemKeywordsKey (Void)*
 */
private val NSMetadataItemKeywordsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemKeywordsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemKeywordsKey").orElseThrow().reinterpret(NSMetadataItemKeywordsKey_LAYOUT.byteSize()) }
private val NSMetadataItemKeywordsKey_VH: VarHandle by lazy { NSMetadataItemKeywordsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemKeywordsKey: MemorySegment
    get() = NSMetadataItemKeywordsKey_VH.get(NSMetadataItemKeywordsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemKeywordsKey_VH.set(NSMetadataItemKeywordsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemTitleKey (Void)*
 */
private val NSMetadataItemTitleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemTitleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemTitleKey").orElseThrow().reinterpret(NSMetadataItemTitleKey_LAYOUT.byteSize()) }
private val NSMetadataItemTitleKey_VH: VarHandle by lazy { NSMetadataItemTitleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemTitleKey: MemorySegment
    get() = NSMetadataItemTitleKey_VH.get(NSMetadataItemTitleKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemTitleKey_VH.set(NSMetadataItemTitleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAuthorsKey (Void)*
 */
private val NSMetadataItemAuthorsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAuthorsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAuthorsKey").orElseThrow().reinterpret(NSMetadataItemAuthorsKey_LAYOUT.byteSize()) }
private val NSMetadataItemAuthorsKey_VH: VarHandle by lazy { NSMetadataItemAuthorsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAuthorsKey: MemorySegment
    get() = NSMetadataItemAuthorsKey_VH.get(NSMetadataItemAuthorsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAuthorsKey_VH.set(NSMetadataItemAuthorsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemEditorsKey (Void)*
 */
private val NSMetadataItemEditorsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemEditorsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemEditorsKey").orElseThrow().reinterpret(NSMetadataItemEditorsKey_LAYOUT.byteSize()) }
private val NSMetadataItemEditorsKey_VH: VarHandle by lazy { NSMetadataItemEditorsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemEditorsKey: MemorySegment
    get() = NSMetadataItemEditorsKey_VH.get(NSMetadataItemEditorsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemEditorsKey_VH.set(NSMetadataItemEditorsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemParticipantsKey (Void)*
 */
private val NSMetadataItemParticipantsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemParticipantsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemParticipantsKey").orElseThrow().reinterpret(NSMetadataItemParticipantsKey_LAYOUT.byteSize()) }
private val NSMetadataItemParticipantsKey_VH: VarHandle by lazy { NSMetadataItemParticipantsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemParticipantsKey: MemorySegment
    get() = NSMetadataItemParticipantsKey_VH.get(NSMetadataItemParticipantsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemParticipantsKey_VH.set(NSMetadataItemParticipantsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemProjectsKey (Void)*
 */
private val NSMetadataItemProjectsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemProjectsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemProjectsKey").orElseThrow().reinterpret(NSMetadataItemProjectsKey_LAYOUT.byteSize()) }
private val NSMetadataItemProjectsKey_VH: VarHandle by lazy { NSMetadataItemProjectsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemProjectsKey: MemorySegment
    get() = NSMetadataItemProjectsKey_VH.get(NSMetadataItemProjectsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemProjectsKey_VH.set(NSMetadataItemProjectsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemDownloadedDateKey (Void)*
 */
private val NSMetadataItemDownloadedDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemDownloadedDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemDownloadedDateKey").orElseThrow().reinterpret(NSMetadataItemDownloadedDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemDownloadedDateKey_VH: VarHandle by lazy { NSMetadataItemDownloadedDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemDownloadedDateKey: MemorySegment
    get() = NSMetadataItemDownloadedDateKey_VH.get(NSMetadataItemDownloadedDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemDownloadedDateKey_VH.set(NSMetadataItemDownloadedDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemWhereFromsKey (Void)*
 */
private val NSMetadataItemWhereFromsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemWhereFromsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemWhereFromsKey").orElseThrow().reinterpret(NSMetadataItemWhereFromsKey_LAYOUT.byteSize()) }
private val NSMetadataItemWhereFromsKey_VH: VarHandle by lazy { NSMetadataItemWhereFromsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemWhereFromsKey: MemorySegment
    get() = NSMetadataItemWhereFromsKey_VH.get(NSMetadataItemWhereFromsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemWhereFromsKey_VH.set(NSMetadataItemWhereFromsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCommentKey (Void)*
 */
private val NSMetadataItemCommentKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCommentKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCommentKey").orElseThrow().reinterpret(NSMetadataItemCommentKey_LAYOUT.byteSize()) }
private val NSMetadataItemCommentKey_VH: VarHandle by lazy { NSMetadataItemCommentKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCommentKey: MemorySegment
    get() = NSMetadataItemCommentKey_VH.get(NSMetadataItemCommentKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCommentKey_VH.set(NSMetadataItemCommentKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCopyrightKey (Void)*
 */
private val NSMetadataItemCopyrightKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCopyrightKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCopyrightKey").orElseThrow().reinterpret(NSMetadataItemCopyrightKey_LAYOUT.byteSize()) }
private val NSMetadataItemCopyrightKey_VH: VarHandle by lazy { NSMetadataItemCopyrightKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCopyrightKey: MemorySegment
    get() = NSMetadataItemCopyrightKey_VH.get(NSMetadataItemCopyrightKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCopyrightKey_VH.set(NSMetadataItemCopyrightKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemLastUsedDateKey (Void)*
 */
private val NSMetadataItemLastUsedDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemLastUsedDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemLastUsedDateKey").orElseThrow().reinterpret(NSMetadataItemLastUsedDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemLastUsedDateKey_VH: VarHandle by lazy { NSMetadataItemLastUsedDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemLastUsedDateKey: MemorySegment
    get() = NSMetadataItemLastUsedDateKey_VH.get(NSMetadataItemLastUsedDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemLastUsedDateKey_VH.set(NSMetadataItemLastUsedDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemContentCreationDateKey (Void)*
 */
private val NSMetadataItemContentCreationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemContentCreationDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemContentCreationDateKey").orElseThrow().reinterpret(NSMetadataItemContentCreationDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemContentCreationDateKey_VH: VarHandle by lazy { NSMetadataItemContentCreationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemContentCreationDateKey: MemorySegment
    get() = NSMetadataItemContentCreationDateKey_VH.get(NSMetadataItemContentCreationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemContentCreationDateKey_VH.set(NSMetadataItemContentCreationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemContentModificationDateKey (Void)*
 */
private val NSMetadataItemContentModificationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemContentModificationDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemContentModificationDateKey").orElseThrow().reinterpret(NSMetadataItemContentModificationDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemContentModificationDateKey_VH: VarHandle by lazy { NSMetadataItemContentModificationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemContentModificationDateKey: MemorySegment
    get() = NSMetadataItemContentModificationDateKey_VH.get(NSMetadataItemContentModificationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemContentModificationDateKey_VH.set(NSMetadataItemContentModificationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemDateAddedKey (Void)*
 */
private val NSMetadataItemDateAddedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemDateAddedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemDateAddedKey").orElseThrow().reinterpret(NSMetadataItemDateAddedKey_LAYOUT.byteSize()) }
private val NSMetadataItemDateAddedKey_VH: VarHandle by lazy { NSMetadataItemDateAddedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemDateAddedKey: MemorySegment
    get() = NSMetadataItemDateAddedKey_VH.get(NSMetadataItemDateAddedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemDateAddedKey_VH.set(NSMetadataItemDateAddedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemDurationSecondsKey (Void)*
 */
private val NSMetadataItemDurationSecondsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemDurationSecondsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemDurationSecondsKey").orElseThrow().reinterpret(NSMetadataItemDurationSecondsKey_LAYOUT.byteSize()) }
private val NSMetadataItemDurationSecondsKey_VH: VarHandle by lazy { NSMetadataItemDurationSecondsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemDurationSecondsKey: MemorySegment
    get() = NSMetadataItemDurationSecondsKey_VH.get(NSMetadataItemDurationSecondsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemDurationSecondsKey_VH.set(NSMetadataItemDurationSecondsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemContactKeywordsKey (Void)*
 */
private val NSMetadataItemContactKeywordsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemContactKeywordsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemContactKeywordsKey").orElseThrow().reinterpret(NSMetadataItemContactKeywordsKey_LAYOUT.byteSize()) }
private val NSMetadataItemContactKeywordsKey_VH: VarHandle by lazy { NSMetadataItemContactKeywordsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemContactKeywordsKey: MemorySegment
    get() = NSMetadataItemContactKeywordsKey_VH.get(NSMetadataItemContactKeywordsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemContactKeywordsKey_VH.set(NSMetadataItemContactKeywordsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemVersionKey (Void)*
 */
private val NSMetadataItemVersionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemVersionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemVersionKey").orElseThrow().reinterpret(NSMetadataItemVersionKey_LAYOUT.byteSize()) }
private val NSMetadataItemVersionKey_VH: VarHandle by lazy { NSMetadataItemVersionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemVersionKey: MemorySegment
    get() = NSMetadataItemVersionKey_VH.get(NSMetadataItemVersionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemVersionKey_VH.set(NSMetadataItemVersionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPixelHeightKey (Void)*
 */
private val NSMetadataItemPixelHeightKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPixelHeightKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPixelHeightKey").orElseThrow().reinterpret(NSMetadataItemPixelHeightKey_LAYOUT.byteSize()) }
private val NSMetadataItemPixelHeightKey_VH: VarHandle by lazy { NSMetadataItemPixelHeightKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemPixelHeightKey: MemorySegment
    get() = NSMetadataItemPixelHeightKey_VH.get(NSMetadataItemPixelHeightKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPixelHeightKey_VH.set(NSMetadataItemPixelHeightKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPixelWidthKey (Void)*
 */
private val NSMetadataItemPixelWidthKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPixelWidthKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPixelWidthKey").orElseThrow().reinterpret(NSMetadataItemPixelWidthKey_LAYOUT.byteSize()) }
private val NSMetadataItemPixelWidthKey_VH: VarHandle by lazy { NSMetadataItemPixelWidthKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemPixelWidthKey: MemorySegment
    get() = NSMetadataItemPixelWidthKey_VH.get(NSMetadataItemPixelWidthKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPixelWidthKey_VH.set(NSMetadataItemPixelWidthKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPixelCountKey (Void)*
 */
private val NSMetadataItemPixelCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPixelCountKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPixelCountKey").orElseThrow().reinterpret(NSMetadataItemPixelCountKey_LAYOUT.byteSize()) }
private val NSMetadataItemPixelCountKey_VH: VarHandle by lazy { NSMetadataItemPixelCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemPixelCountKey: MemorySegment
    get() = NSMetadataItemPixelCountKey_VH.get(NSMetadataItemPixelCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPixelCountKey_VH.set(NSMetadataItemPixelCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemColorSpaceKey (Void)*
 */
private val NSMetadataItemColorSpaceKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemColorSpaceKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemColorSpaceKey").orElseThrow().reinterpret(NSMetadataItemColorSpaceKey_LAYOUT.byteSize()) }
private val NSMetadataItemColorSpaceKey_VH: VarHandle by lazy { NSMetadataItemColorSpaceKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemColorSpaceKey: MemorySegment
    get() = NSMetadataItemColorSpaceKey_VH.get(NSMetadataItemColorSpaceKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemColorSpaceKey_VH.set(NSMetadataItemColorSpaceKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemBitsPerSampleKey (Void)*
 */
private val NSMetadataItemBitsPerSampleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemBitsPerSampleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemBitsPerSampleKey").orElseThrow().reinterpret(NSMetadataItemBitsPerSampleKey_LAYOUT.byteSize()) }
private val NSMetadataItemBitsPerSampleKey_VH: VarHandle by lazy { NSMetadataItemBitsPerSampleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemBitsPerSampleKey: MemorySegment
    get() = NSMetadataItemBitsPerSampleKey_VH.get(NSMetadataItemBitsPerSampleKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemBitsPerSampleKey_VH.set(NSMetadataItemBitsPerSampleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFlashOnOffKey (Void)*
 */
private val NSMetadataItemFlashOnOffKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFlashOnOffKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFlashOnOffKey").orElseThrow().reinterpret(NSMetadataItemFlashOnOffKey_LAYOUT.byteSize()) }
private val NSMetadataItemFlashOnOffKey_VH: VarHandle by lazy { NSMetadataItemFlashOnOffKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemFlashOnOffKey: MemorySegment
    get() = NSMetadataItemFlashOnOffKey_VH.get(NSMetadataItemFlashOnOffKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFlashOnOffKey_VH.set(NSMetadataItemFlashOnOffKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFocalLengthKey (Void)*
 */
private val NSMetadataItemFocalLengthKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFocalLengthKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFocalLengthKey").orElseThrow().reinterpret(NSMetadataItemFocalLengthKey_LAYOUT.byteSize()) }
private val NSMetadataItemFocalLengthKey_VH: VarHandle by lazy { NSMetadataItemFocalLengthKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemFocalLengthKey: MemorySegment
    get() = NSMetadataItemFocalLengthKey_VH.get(NSMetadataItemFocalLengthKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFocalLengthKey_VH.set(NSMetadataItemFocalLengthKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAcquisitionMakeKey (Void)*
 */
private val NSMetadataItemAcquisitionMakeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAcquisitionMakeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAcquisitionMakeKey").orElseThrow().reinterpret(NSMetadataItemAcquisitionMakeKey_LAYOUT.byteSize()) }
private val NSMetadataItemAcquisitionMakeKey_VH: VarHandle by lazy { NSMetadataItemAcquisitionMakeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAcquisitionMakeKey: MemorySegment
    get() = NSMetadataItemAcquisitionMakeKey_VH.get(NSMetadataItemAcquisitionMakeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAcquisitionMakeKey_VH.set(NSMetadataItemAcquisitionMakeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAcquisitionModelKey (Void)*
 */
private val NSMetadataItemAcquisitionModelKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAcquisitionModelKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAcquisitionModelKey").orElseThrow().reinterpret(NSMetadataItemAcquisitionModelKey_LAYOUT.byteSize()) }
private val NSMetadataItemAcquisitionModelKey_VH: VarHandle by lazy { NSMetadataItemAcquisitionModelKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAcquisitionModelKey: MemorySegment
    get() = NSMetadataItemAcquisitionModelKey_VH.get(NSMetadataItemAcquisitionModelKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAcquisitionModelKey_VH.set(NSMetadataItemAcquisitionModelKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemISOSpeedKey (Void)*
 */
private val NSMetadataItemISOSpeedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemISOSpeedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemISOSpeedKey").orElseThrow().reinterpret(NSMetadataItemISOSpeedKey_LAYOUT.byteSize()) }
private val NSMetadataItemISOSpeedKey_VH: VarHandle by lazy { NSMetadataItemISOSpeedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemISOSpeedKey: MemorySegment
    get() = NSMetadataItemISOSpeedKey_VH.get(NSMetadataItemISOSpeedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemISOSpeedKey_VH.set(NSMetadataItemISOSpeedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemOrientationKey (Void)*
 */
private val NSMetadataItemOrientationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemOrientationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemOrientationKey").orElseThrow().reinterpret(NSMetadataItemOrientationKey_LAYOUT.byteSize()) }
private val NSMetadataItemOrientationKey_VH: VarHandle by lazy { NSMetadataItemOrientationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemOrientationKey: MemorySegment
    get() = NSMetadataItemOrientationKey_VH.get(NSMetadataItemOrientationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemOrientationKey_VH.set(NSMetadataItemOrientationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemLayerNamesKey (Void)*
 */
private val NSMetadataItemLayerNamesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemLayerNamesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemLayerNamesKey").orElseThrow().reinterpret(NSMetadataItemLayerNamesKey_LAYOUT.byteSize()) }
private val NSMetadataItemLayerNamesKey_VH: VarHandle by lazy { NSMetadataItemLayerNamesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemLayerNamesKey: MemorySegment
    get() = NSMetadataItemLayerNamesKey_VH.get(NSMetadataItemLayerNamesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemLayerNamesKey_VH.set(NSMetadataItemLayerNamesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemWhiteBalanceKey (Void)*
 */
private val NSMetadataItemWhiteBalanceKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemWhiteBalanceKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemWhiteBalanceKey").orElseThrow().reinterpret(NSMetadataItemWhiteBalanceKey_LAYOUT.byteSize()) }
private val NSMetadataItemWhiteBalanceKey_VH: VarHandle by lazy { NSMetadataItemWhiteBalanceKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemWhiteBalanceKey: MemorySegment
    get() = NSMetadataItemWhiteBalanceKey_VH.get(NSMetadataItemWhiteBalanceKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemWhiteBalanceKey_VH.set(NSMetadataItemWhiteBalanceKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemApertureKey (Void)*
 */
private val NSMetadataItemApertureKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemApertureKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemApertureKey").orElseThrow().reinterpret(NSMetadataItemApertureKey_LAYOUT.byteSize()) }
private val NSMetadataItemApertureKey_VH: VarHandle by lazy { NSMetadataItemApertureKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemApertureKey: MemorySegment
    get() = NSMetadataItemApertureKey_VH.get(NSMetadataItemApertureKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemApertureKey_VH.set(NSMetadataItemApertureKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemProfileNameKey (Void)*
 */
private val NSMetadataItemProfileNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemProfileNameKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemProfileNameKey").orElseThrow().reinterpret(NSMetadataItemProfileNameKey_LAYOUT.byteSize()) }
private val NSMetadataItemProfileNameKey_VH: VarHandle by lazy { NSMetadataItemProfileNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemProfileNameKey: MemorySegment
    get() = NSMetadataItemProfileNameKey_VH.get(NSMetadataItemProfileNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemProfileNameKey_VH.set(NSMetadataItemProfileNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemResolutionWidthDPIKey (Void)*
 */
private val NSMetadataItemResolutionWidthDPIKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemResolutionWidthDPIKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemResolutionWidthDPIKey").orElseThrow().reinterpret(NSMetadataItemResolutionWidthDPIKey_LAYOUT.byteSize()) }
private val NSMetadataItemResolutionWidthDPIKey_VH: VarHandle by lazy { NSMetadataItemResolutionWidthDPIKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemResolutionWidthDPIKey: MemorySegment
    get() = NSMetadataItemResolutionWidthDPIKey_VH.get(NSMetadataItemResolutionWidthDPIKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemResolutionWidthDPIKey_VH.set(NSMetadataItemResolutionWidthDPIKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemResolutionHeightDPIKey (Void)*
 */
private val NSMetadataItemResolutionHeightDPIKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemResolutionHeightDPIKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemResolutionHeightDPIKey").orElseThrow().reinterpret(NSMetadataItemResolutionHeightDPIKey_LAYOUT.byteSize()) }
private val NSMetadataItemResolutionHeightDPIKey_VH: VarHandle by lazy { NSMetadataItemResolutionHeightDPIKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemResolutionHeightDPIKey: MemorySegment
    get() = NSMetadataItemResolutionHeightDPIKey_VH.get(NSMetadataItemResolutionHeightDPIKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemResolutionHeightDPIKey_VH.set(NSMetadataItemResolutionHeightDPIKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemExposureModeKey (Void)*
 */
private val NSMetadataItemExposureModeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemExposureModeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemExposureModeKey").orElseThrow().reinterpret(NSMetadataItemExposureModeKey_LAYOUT.byteSize()) }
private val NSMetadataItemExposureModeKey_VH: VarHandle by lazy { NSMetadataItemExposureModeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemExposureModeKey: MemorySegment
    get() = NSMetadataItemExposureModeKey_VH.get(NSMetadataItemExposureModeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemExposureModeKey_VH.set(NSMetadataItemExposureModeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemExposureTimeSecondsKey (Void)*
 */
private val NSMetadataItemExposureTimeSecondsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemExposureTimeSecondsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemExposureTimeSecondsKey").orElseThrow().reinterpret(NSMetadataItemExposureTimeSecondsKey_LAYOUT.byteSize()) }
private val NSMetadataItemExposureTimeSecondsKey_VH: VarHandle by lazy { NSMetadataItemExposureTimeSecondsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemExposureTimeSecondsKey: MemorySegment
    get() = NSMetadataItemExposureTimeSecondsKey_VH.get(NSMetadataItemExposureTimeSecondsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemExposureTimeSecondsKey_VH.set(NSMetadataItemExposureTimeSecondsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemEXIFVersionKey (Void)*
 */
private val NSMetadataItemEXIFVersionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemEXIFVersionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemEXIFVersionKey").orElseThrow().reinterpret(NSMetadataItemEXIFVersionKey_LAYOUT.byteSize()) }
private val NSMetadataItemEXIFVersionKey_VH: VarHandle by lazy { NSMetadataItemEXIFVersionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemEXIFVersionKey: MemorySegment
    get() = NSMetadataItemEXIFVersionKey_VH.get(NSMetadataItemEXIFVersionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemEXIFVersionKey_VH.set(NSMetadataItemEXIFVersionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCameraOwnerKey (Void)*
 */
private val NSMetadataItemCameraOwnerKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCameraOwnerKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCameraOwnerKey").orElseThrow().reinterpret(NSMetadataItemCameraOwnerKey_LAYOUT.byteSize()) }
private val NSMetadataItemCameraOwnerKey_VH: VarHandle by lazy { NSMetadataItemCameraOwnerKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCameraOwnerKey: MemorySegment
    get() = NSMetadataItemCameraOwnerKey_VH.get(NSMetadataItemCameraOwnerKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCameraOwnerKey_VH.set(NSMetadataItemCameraOwnerKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFocalLength35mmKey (Void)*
 */
private val NSMetadataItemFocalLength35mmKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFocalLength35mmKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFocalLength35mmKey").orElseThrow().reinterpret(NSMetadataItemFocalLength35mmKey_LAYOUT.byteSize()) }
private val NSMetadataItemFocalLength35mmKey_VH: VarHandle by lazy { NSMetadataItemFocalLength35mmKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemFocalLength35mmKey: MemorySegment
    get() = NSMetadataItemFocalLength35mmKey_VH.get(NSMetadataItemFocalLength35mmKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFocalLength35mmKey_VH.set(NSMetadataItemFocalLength35mmKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemLensModelKey (Void)*
 */
private val NSMetadataItemLensModelKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemLensModelKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemLensModelKey").orElseThrow().reinterpret(NSMetadataItemLensModelKey_LAYOUT.byteSize()) }
private val NSMetadataItemLensModelKey_VH: VarHandle by lazy { NSMetadataItemLensModelKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemLensModelKey: MemorySegment
    get() = NSMetadataItemLensModelKey_VH.get(NSMetadataItemLensModelKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemLensModelKey_VH.set(NSMetadataItemLensModelKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemEXIFGPSVersionKey (Void)*
 */
private val NSMetadataItemEXIFGPSVersionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemEXIFGPSVersionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemEXIFGPSVersionKey").orElseThrow().reinterpret(NSMetadataItemEXIFGPSVersionKey_LAYOUT.byteSize()) }
private val NSMetadataItemEXIFGPSVersionKey_VH: VarHandle by lazy { NSMetadataItemEXIFGPSVersionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemEXIFGPSVersionKey: MemorySegment
    get() = NSMetadataItemEXIFGPSVersionKey_VH.get(NSMetadataItemEXIFGPSVersionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemEXIFGPSVersionKey_VH.set(NSMetadataItemEXIFGPSVersionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAltitudeKey (Void)*
 */
private val NSMetadataItemAltitudeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAltitudeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAltitudeKey").orElseThrow().reinterpret(NSMetadataItemAltitudeKey_LAYOUT.byteSize()) }
private val NSMetadataItemAltitudeKey_VH: VarHandle by lazy { NSMetadataItemAltitudeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAltitudeKey: MemorySegment
    get() = NSMetadataItemAltitudeKey_VH.get(NSMetadataItemAltitudeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAltitudeKey_VH.set(NSMetadataItemAltitudeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemLatitudeKey (Void)*
 */
private val NSMetadataItemLatitudeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemLatitudeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemLatitudeKey").orElseThrow().reinterpret(NSMetadataItemLatitudeKey_LAYOUT.byteSize()) }
private val NSMetadataItemLatitudeKey_VH: VarHandle by lazy { NSMetadataItemLatitudeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemLatitudeKey: MemorySegment
    get() = NSMetadataItemLatitudeKey_VH.get(NSMetadataItemLatitudeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemLatitudeKey_VH.set(NSMetadataItemLatitudeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemLongitudeKey (Void)*
 */
private val NSMetadataItemLongitudeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemLongitudeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemLongitudeKey").orElseThrow().reinterpret(NSMetadataItemLongitudeKey_LAYOUT.byteSize()) }
private val NSMetadataItemLongitudeKey_VH: VarHandle by lazy { NSMetadataItemLongitudeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemLongitudeKey: MemorySegment
    get() = NSMetadataItemLongitudeKey_VH.get(NSMetadataItemLongitudeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemLongitudeKey_VH.set(NSMetadataItemLongitudeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemSpeedKey (Void)*
 */
private val NSMetadataItemSpeedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemSpeedKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemSpeedKey").orElseThrow().reinterpret(NSMetadataItemSpeedKey_LAYOUT.byteSize()) }
private val NSMetadataItemSpeedKey_VH: VarHandle by lazy { NSMetadataItemSpeedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemSpeedKey: MemorySegment
    get() = NSMetadataItemSpeedKey_VH.get(NSMetadataItemSpeedKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemSpeedKey_VH.set(NSMetadataItemSpeedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemTimestampKey (Void)*
 */
private val NSMetadataItemTimestampKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemTimestampKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemTimestampKey").orElseThrow().reinterpret(NSMetadataItemTimestampKey_LAYOUT.byteSize()) }
private val NSMetadataItemTimestampKey_VH: VarHandle by lazy { NSMetadataItemTimestampKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemTimestampKey: MemorySegment
    get() = NSMetadataItemTimestampKey_VH.get(NSMetadataItemTimestampKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemTimestampKey_VH.set(NSMetadataItemTimestampKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSTrackKey (Void)*
 */
private val NSMetadataItemGPSTrackKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSTrackKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSTrackKey").orElseThrow().reinterpret(NSMetadataItemGPSTrackKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSTrackKey_VH: VarHandle by lazy { NSMetadataItemGPSTrackKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSTrackKey: MemorySegment
    get() = NSMetadataItemGPSTrackKey_VH.get(NSMetadataItemGPSTrackKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSTrackKey_VH.set(NSMetadataItemGPSTrackKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemImageDirectionKey (Void)*
 */
private val NSMetadataItemImageDirectionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemImageDirectionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemImageDirectionKey").orElseThrow().reinterpret(NSMetadataItemImageDirectionKey_LAYOUT.byteSize()) }
private val NSMetadataItemImageDirectionKey_VH: VarHandle by lazy { NSMetadataItemImageDirectionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemImageDirectionKey: MemorySegment
    get() = NSMetadataItemImageDirectionKey_VH.get(NSMetadataItemImageDirectionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemImageDirectionKey_VH.set(NSMetadataItemImageDirectionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemNamedLocationKey (Void)*
 */
private val NSMetadataItemNamedLocationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemNamedLocationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemNamedLocationKey").orElseThrow().reinterpret(NSMetadataItemNamedLocationKey_LAYOUT.byteSize()) }
private val NSMetadataItemNamedLocationKey_VH: VarHandle by lazy { NSMetadataItemNamedLocationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemNamedLocationKey: MemorySegment
    get() = NSMetadataItemNamedLocationKey_VH.get(NSMetadataItemNamedLocationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemNamedLocationKey_VH.set(NSMetadataItemNamedLocationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSStatusKey (Void)*
 */
private val NSMetadataItemGPSStatusKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSStatusKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSStatusKey").orElseThrow().reinterpret(NSMetadataItemGPSStatusKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSStatusKey_VH: VarHandle by lazy { NSMetadataItemGPSStatusKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSStatusKey: MemorySegment
    get() = NSMetadataItemGPSStatusKey_VH.get(NSMetadataItemGPSStatusKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSStatusKey_VH.set(NSMetadataItemGPSStatusKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSMeasureModeKey (Void)*
 */
private val NSMetadataItemGPSMeasureModeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSMeasureModeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSMeasureModeKey").orElseThrow().reinterpret(NSMetadataItemGPSMeasureModeKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSMeasureModeKey_VH: VarHandle by lazy { NSMetadataItemGPSMeasureModeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSMeasureModeKey: MemorySegment
    get() = NSMetadataItemGPSMeasureModeKey_VH.get(NSMetadataItemGPSMeasureModeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSMeasureModeKey_VH.set(NSMetadataItemGPSMeasureModeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSDOPKey (Void)*
 */
private val NSMetadataItemGPSDOPKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSDOPKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSDOPKey").orElseThrow().reinterpret(NSMetadataItemGPSDOPKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSDOPKey_VH: VarHandle by lazy { NSMetadataItemGPSDOPKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSDOPKey: MemorySegment
    get() = NSMetadataItemGPSDOPKey_VH.get(NSMetadataItemGPSDOPKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSDOPKey_VH.set(NSMetadataItemGPSDOPKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSMapDatumKey (Void)*
 */
private val NSMetadataItemGPSMapDatumKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSMapDatumKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSMapDatumKey").orElseThrow().reinterpret(NSMetadataItemGPSMapDatumKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSMapDatumKey_VH: VarHandle by lazy { NSMetadataItemGPSMapDatumKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSMapDatumKey: MemorySegment
    get() = NSMetadataItemGPSMapDatumKey_VH.get(NSMetadataItemGPSMapDatumKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSMapDatumKey_VH.set(NSMetadataItemGPSMapDatumKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSDestLatitudeKey (Void)*
 */
private val NSMetadataItemGPSDestLatitudeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSDestLatitudeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSDestLatitudeKey").orElseThrow().reinterpret(NSMetadataItemGPSDestLatitudeKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSDestLatitudeKey_VH: VarHandle by lazy { NSMetadataItemGPSDestLatitudeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSDestLatitudeKey: MemorySegment
    get() = NSMetadataItemGPSDestLatitudeKey_VH.get(NSMetadataItemGPSDestLatitudeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSDestLatitudeKey_VH.set(NSMetadataItemGPSDestLatitudeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSDestLongitudeKey (Void)*
 */
private val NSMetadataItemGPSDestLongitudeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSDestLongitudeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSDestLongitudeKey").orElseThrow().reinterpret(NSMetadataItemGPSDestLongitudeKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSDestLongitudeKey_VH: VarHandle by lazy { NSMetadataItemGPSDestLongitudeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSDestLongitudeKey: MemorySegment
    get() = NSMetadataItemGPSDestLongitudeKey_VH.get(NSMetadataItemGPSDestLongitudeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSDestLongitudeKey_VH.set(NSMetadataItemGPSDestLongitudeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSDestBearingKey (Void)*
 */
private val NSMetadataItemGPSDestBearingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSDestBearingKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSDestBearingKey").orElseThrow().reinterpret(NSMetadataItemGPSDestBearingKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSDestBearingKey_VH: VarHandle by lazy { NSMetadataItemGPSDestBearingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSDestBearingKey: MemorySegment
    get() = NSMetadataItemGPSDestBearingKey_VH.get(NSMetadataItemGPSDestBearingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSDestBearingKey_VH.set(NSMetadataItemGPSDestBearingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSDestDistanceKey (Void)*
 */
private val NSMetadataItemGPSDestDistanceKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSDestDistanceKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSDestDistanceKey").orElseThrow().reinterpret(NSMetadataItemGPSDestDistanceKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSDestDistanceKey_VH: VarHandle by lazy { NSMetadataItemGPSDestDistanceKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSDestDistanceKey: MemorySegment
    get() = NSMetadataItemGPSDestDistanceKey_VH.get(NSMetadataItemGPSDestDistanceKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSDestDistanceKey_VH.set(NSMetadataItemGPSDestDistanceKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSProcessingMethodKey (Void)*
 */
private val NSMetadataItemGPSProcessingMethodKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSProcessingMethodKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSProcessingMethodKey").orElseThrow().reinterpret(NSMetadataItemGPSProcessingMethodKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSProcessingMethodKey_VH: VarHandle by lazy { NSMetadataItemGPSProcessingMethodKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSProcessingMethodKey: MemorySegment
    get() = NSMetadataItemGPSProcessingMethodKey_VH.get(NSMetadataItemGPSProcessingMethodKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSProcessingMethodKey_VH.set(NSMetadataItemGPSProcessingMethodKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSAreaInformationKey (Void)*
 */
private val NSMetadataItemGPSAreaInformationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSAreaInformationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSAreaInformationKey").orElseThrow().reinterpret(NSMetadataItemGPSAreaInformationKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSAreaInformationKey_VH: VarHandle by lazy { NSMetadataItemGPSAreaInformationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSAreaInformationKey: MemorySegment
    get() = NSMetadataItemGPSAreaInformationKey_VH.get(NSMetadataItemGPSAreaInformationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSAreaInformationKey_VH.set(NSMetadataItemGPSAreaInformationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSDateStampKey (Void)*
 */
private val NSMetadataItemGPSDateStampKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSDateStampKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSDateStampKey").orElseThrow().reinterpret(NSMetadataItemGPSDateStampKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSDateStampKey_VH: VarHandle by lazy { NSMetadataItemGPSDateStampKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSDateStampKey: MemorySegment
    get() = NSMetadataItemGPSDateStampKey_VH.get(NSMetadataItemGPSDateStampKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSDateStampKey_VH.set(NSMetadataItemGPSDateStampKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemGPSDifferentalKey (Void)*
 */
private val NSMetadataItemGPSDifferentalKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemGPSDifferentalKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemGPSDifferentalKey").orElseThrow().reinterpret(NSMetadataItemGPSDifferentalKey_LAYOUT.byteSize()) }
private val NSMetadataItemGPSDifferentalKey_VH: VarHandle by lazy { NSMetadataItemGPSDifferentalKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemGPSDifferentalKey: MemorySegment
    get() = NSMetadataItemGPSDifferentalKey_VH.get(NSMetadataItemGPSDifferentalKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemGPSDifferentalKey_VH.set(NSMetadataItemGPSDifferentalKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCodecsKey (Void)*
 */
private val NSMetadataItemCodecsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCodecsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCodecsKey").orElseThrow().reinterpret(NSMetadataItemCodecsKey_LAYOUT.byteSize()) }
private val NSMetadataItemCodecsKey_VH: VarHandle by lazy { NSMetadataItemCodecsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCodecsKey: MemorySegment
    get() = NSMetadataItemCodecsKey_VH.get(NSMetadataItemCodecsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCodecsKey_VH.set(NSMetadataItemCodecsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemMediaTypesKey (Void)*
 */
private val NSMetadataItemMediaTypesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemMediaTypesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemMediaTypesKey").orElseThrow().reinterpret(NSMetadataItemMediaTypesKey_LAYOUT.byteSize()) }
private val NSMetadataItemMediaTypesKey_VH: VarHandle by lazy { NSMetadataItemMediaTypesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemMediaTypesKey: MemorySegment
    get() = NSMetadataItemMediaTypesKey_VH.get(NSMetadataItemMediaTypesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemMediaTypesKey_VH.set(NSMetadataItemMediaTypesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemStreamableKey (Void)*
 */
private val NSMetadataItemStreamableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemStreamableKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemStreamableKey").orElseThrow().reinterpret(NSMetadataItemStreamableKey_LAYOUT.byteSize()) }
private val NSMetadataItemStreamableKey_VH: VarHandle by lazy { NSMetadataItemStreamableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemStreamableKey: MemorySegment
    get() = NSMetadataItemStreamableKey_VH.get(NSMetadataItemStreamableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemStreamableKey_VH.set(NSMetadataItemStreamableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemTotalBitRateKey (Void)*
 */
private val NSMetadataItemTotalBitRateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemTotalBitRateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemTotalBitRateKey").orElseThrow().reinterpret(NSMetadataItemTotalBitRateKey_LAYOUT.byteSize()) }
private val NSMetadataItemTotalBitRateKey_VH: VarHandle by lazy { NSMetadataItemTotalBitRateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemTotalBitRateKey: MemorySegment
    get() = NSMetadataItemTotalBitRateKey_VH.get(NSMetadataItemTotalBitRateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemTotalBitRateKey_VH.set(NSMetadataItemTotalBitRateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemVideoBitRateKey (Void)*
 */
private val NSMetadataItemVideoBitRateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemVideoBitRateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemVideoBitRateKey").orElseThrow().reinterpret(NSMetadataItemVideoBitRateKey_LAYOUT.byteSize()) }
private val NSMetadataItemVideoBitRateKey_VH: VarHandle by lazy { NSMetadataItemVideoBitRateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemVideoBitRateKey: MemorySegment
    get() = NSMetadataItemVideoBitRateKey_VH.get(NSMetadataItemVideoBitRateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemVideoBitRateKey_VH.set(NSMetadataItemVideoBitRateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAudioBitRateKey (Void)*
 */
private val NSMetadataItemAudioBitRateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAudioBitRateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAudioBitRateKey").orElseThrow().reinterpret(NSMetadataItemAudioBitRateKey_LAYOUT.byteSize()) }
private val NSMetadataItemAudioBitRateKey_VH: VarHandle by lazy { NSMetadataItemAudioBitRateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAudioBitRateKey: MemorySegment
    get() = NSMetadataItemAudioBitRateKey_VH.get(NSMetadataItemAudioBitRateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAudioBitRateKey_VH.set(NSMetadataItemAudioBitRateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemDeliveryTypeKey (Void)*
 */
private val NSMetadataItemDeliveryTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemDeliveryTypeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemDeliveryTypeKey").orElseThrow().reinterpret(NSMetadataItemDeliveryTypeKey_LAYOUT.byteSize()) }
private val NSMetadataItemDeliveryTypeKey_VH: VarHandle by lazy { NSMetadataItemDeliveryTypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemDeliveryTypeKey: MemorySegment
    get() = NSMetadataItemDeliveryTypeKey_VH.get(NSMetadataItemDeliveryTypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemDeliveryTypeKey_VH.set(NSMetadataItemDeliveryTypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAlbumKey (Void)*
 */
private val NSMetadataItemAlbumKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAlbumKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAlbumKey").orElseThrow().reinterpret(NSMetadataItemAlbumKey_LAYOUT.byteSize()) }
private val NSMetadataItemAlbumKey_VH: VarHandle by lazy { NSMetadataItemAlbumKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAlbumKey: MemorySegment
    get() = NSMetadataItemAlbumKey_VH.get(NSMetadataItemAlbumKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAlbumKey_VH.set(NSMetadataItemAlbumKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemHasAlphaChannelKey (Void)*
 */
private val NSMetadataItemHasAlphaChannelKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemHasAlphaChannelKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemHasAlphaChannelKey").orElseThrow().reinterpret(NSMetadataItemHasAlphaChannelKey_LAYOUT.byteSize()) }
private val NSMetadataItemHasAlphaChannelKey_VH: VarHandle by lazy { NSMetadataItemHasAlphaChannelKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemHasAlphaChannelKey: MemorySegment
    get() = NSMetadataItemHasAlphaChannelKey_VH.get(NSMetadataItemHasAlphaChannelKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemHasAlphaChannelKey_VH.set(NSMetadataItemHasAlphaChannelKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemRedEyeOnOffKey (Void)*
 */
private val NSMetadataItemRedEyeOnOffKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemRedEyeOnOffKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemRedEyeOnOffKey").orElseThrow().reinterpret(NSMetadataItemRedEyeOnOffKey_LAYOUT.byteSize()) }
private val NSMetadataItemRedEyeOnOffKey_VH: VarHandle by lazy { NSMetadataItemRedEyeOnOffKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemRedEyeOnOffKey: MemorySegment
    get() = NSMetadataItemRedEyeOnOffKey_VH.get(NSMetadataItemRedEyeOnOffKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemRedEyeOnOffKey_VH.set(NSMetadataItemRedEyeOnOffKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemMeteringModeKey (Void)*
 */
private val NSMetadataItemMeteringModeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemMeteringModeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemMeteringModeKey").orElseThrow().reinterpret(NSMetadataItemMeteringModeKey_LAYOUT.byteSize()) }
private val NSMetadataItemMeteringModeKey_VH: VarHandle by lazy { NSMetadataItemMeteringModeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemMeteringModeKey: MemorySegment
    get() = NSMetadataItemMeteringModeKey_VH.get(NSMetadataItemMeteringModeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemMeteringModeKey_VH.set(NSMetadataItemMeteringModeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemMaxApertureKey (Void)*
 */
private val NSMetadataItemMaxApertureKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemMaxApertureKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemMaxApertureKey").orElseThrow().reinterpret(NSMetadataItemMaxApertureKey_LAYOUT.byteSize()) }
private val NSMetadataItemMaxApertureKey_VH: VarHandle by lazy { NSMetadataItemMaxApertureKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemMaxApertureKey: MemorySegment
    get() = NSMetadataItemMaxApertureKey_VH.get(NSMetadataItemMaxApertureKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemMaxApertureKey_VH.set(NSMetadataItemMaxApertureKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemFNumberKey (Void)*
 */
private val NSMetadataItemFNumberKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemFNumberKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemFNumberKey").orElseThrow().reinterpret(NSMetadataItemFNumberKey_LAYOUT.byteSize()) }
private val NSMetadataItemFNumberKey_VH: VarHandle by lazy { NSMetadataItemFNumberKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemFNumberKey: MemorySegment
    get() = NSMetadataItemFNumberKey_VH.get(NSMetadataItemFNumberKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemFNumberKey_VH.set(NSMetadataItemFNumberKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemExposureProgramKey (Void)*
 */
private val NSMetadataItemExposureProgramKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemExposureProgramKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemExposureProgramKey").orElseThrow().reinterpret(NSMetadataItemExposureProgramKey_LAYOUT.byteSize()) }
private val NSMetadataItemExposureProgramKey_VH: VarHandle by lazy { NSMetadataItemExposureProgramKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemExposureProgramKey: MemorySegment
    get() = NSMetadataItemExposureProgramKey_VH.get(NSMetadataItemExposureProgramKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemExposureProgramKey_VH.set(NSMetadataItemExposureProgramKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemExposureTimeStringKey (Void)*
 */
private val NSMetadataItemExposureTimeStringKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemExposureTimeStringKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemExposureTimeStringKey").orElseThrow().reinterpret(NSMetadataItemExposureTimeStringKey_LAYOUT.byteSize()) }
private val NSMetadataItemExposureTimeStringKey_VH: VarHandle by lazy { NSMetadataItemExposureTimeStringKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemExposureTimeStringKey: MemorySegment
    get() = NSMetadataItemExposureTimeStringKey_VH.get(NSMetadataItemExposureTimeStringKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemExposureTimeStringKey_VH.set(NSMetadataItemExposureTimeStringKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemHeadlineKey (Void)*
 */
private val NSMetadataItemHeadlineKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemHeadlineKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemHeadlineKey").orElseThrow().reinterpret(NSMetadataItemHeadlineKey_LAYOUT.byteSize()) }
private val NSMetadataItemHeadlineKey_VH: VarHandle by lazy { NSMetadataItemHeadlineKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemHeadlineKey: MemorySegment
    get() = NSMetadataItemHeadlineKey_VH.get(NSMetadataItemHeadlineKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemHeadlineKey_VH.set(NSMetadataItemHeadlineKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemInstructionsKey (Void)*
 */
private val NSMetadataItemInstructionsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemInstructionsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemInstructionsKey").orElseThrow().reinterpret(NSMetadataItemInstructionsKey_LAYOUT.byteSize()) }
private val NSMetadataItemInstructionsKey_VH: VarHandle by lazy { NSMetadataItemInstructionsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemInstructionsKey: MemorySegment
    get() = NSMetadataItemInstructionsKey_VH.get(NSMetadataItemInstructionsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemInstructionsKey_VH.set(NSMetadataItemInstructionsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCityKey (Void)*
 */
private val NSMetadataItemCityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCityKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCityKey").orElseThrow().reinterpret(NSMetadataItemCityKey_LAYOUT.byteSize()) }
private val NSMetadataItemCityKey_VH: VarHandle by lazy { NSMetadataItemCityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCityKey: MemorySegment
    get() = NSMetadataItemCityKey_VH.get(NSMetadataItemCityKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCityKey_VH.set(NSMetadataItemCityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemStateOrProvinceKey (Void)*
 */
private val NSMetadataItemStateOrProvinceKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemStateOrProvinceKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemStateOrProvinceKey").orElseThrow().reinterpret(NSMetadataItemStateOrProvinceKey_LAYOUT.byteSize()) }
private val NSMetadataItemStateOrProvinceKey_VH: VarHandle by lazy { NSMetadataItemStateOrProvinceKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemStateOrProvinceKey: MemorySegment
    get() = NSMetadataItemStateOrProvinceKey_VH.get(NSMetadataItemStateOrProvinceKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemStateOrProvinceKey_VH.set(NSMetadataItemStateOrProvinceKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCountryKey (Void)*
 */
private val NSMetadataItemCountryKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCountryKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCountryKey").orElseThrow().reinterpret(NSMetadataItemCountryKey_LAYOUT.byteSize()) }
private val NSMetadataItemCountryKey_VH: VarHandle by lazy { NSMetadataItemCountryKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCountryKey: MemorySegment
    get() = NSMetadataItemCountryKey_VH.get(NSMetadataItemCountryKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCountryKey_VH.set(NSMetadataItemCountryKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemTextContentKey (Void)*
 */
private val NSMetadataItemTextContentKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemTextContentKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemTextContentKey").orElseThrow().reinterpret(NSMetadataItemTextContentKey_LAYOUT.byteSize()) }
private val NSMetadataItemTextContentKey_VH: VarHandle by lazy { NSMetadataItemTextContentKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemTextContentKey: MemorySegment
    get() = NSMetadataItemTextContentKey_VH.get(NSMetadataItemTextContentKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemTextContentKey_VH.set(NSMetadataItemTextContentKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAudioSampleRateKey (Void)*
 */
private val NSMetadataItemAudioSampleRateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAudioSampleRateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAudioSampleRateKey").orElseThrow().reinterpret(NSMetadataItemAudioSampleRateKey_LAYOUT.byteSize()) }
private val NSMetadataItemAudioSampleRateKey_VH: VarHandle by lazy { NSMetadataItemAudioSampleRateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAudioSampleRateKey: MemorySegment
    get() = NSMetadataItemAudioSampleRateKey_VH.get(NSMetadataItemAudioSampleRateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAudioSampleRateKey_VH.set(NSMetadataItemAudioSampleRateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAudioChannelCountKey (Void)*
 */
private val NSMetadataItemAudioChannelCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAudioChannelCountKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAudioChannelCountKey").orElseThrow().reinterpret(NSMetadataItemAudioChannelCountKey_LAYOUT.byteSize()) }
private val NSMetadataItemAudioChannelCountKey_VH: VarHandle by lazy { NSMetadataItemAudioChannelCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAudioChannelCountKey: MemorySegment
    get() = NSMetadataItemAudioChannelCountKey_VH.get(NSMetadataItemAudioChannelCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAudioChannelCountKey_VH.set(NSMetadataItemAudioChannelCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemTempoKey (Void)*
 */
private val NSMetadataItemTempoKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemTempoKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemTempoKey").orElseThrow().reinterpret(NSMetadataItemTempoKey_LAYOUT.byteSize()) }
private val NSMetadataItemTempoKey_VH: VarHandle by lazy { NSMetadataItemTempoKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemTempoKey: MemorySegment
    get() = NSMetadataItemTempoKey_VH.get(NSMetadataItemTempoKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemTempoKey_VH.set(NSMetadataItemTempoKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemKeySignatureKey (Void)*
 */
private val NSMetadataItemKeySignatureKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemKeySignatureKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemKeySignatureKey").orElseThrow().reinterpret(NSMetadataItemKeySignatureKey_LAYOUT.byteSize()) }
private val NSMetadataItemKeySignatureKey_VH: VarHandle by lazy { NSMetadataItemKeySignatureKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemKeySignatureKey: MemorySegment
    get() = NSMetadataItemKeySignatureKey_VH.get(NSMetadataItemKeySignatureKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemKeySignatureKey_VH.set(NSMetadataItemKeySignatureKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemTimeSignatureKey (Void)*
 */
private val NSMetadataItemTimeSignatureKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemTimeSignatureKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemTimeSignatureKey").orElseThrow().reinterpret(NSMetadataItemTimeSignatureKey_LAYOUT.byteSize()) }
private val NSMetadataItemTimeSignatureKey_VH: VarHandle by lazy { NSMetadataItemTimeSignatureKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemTimeSignatureKey: MemorySegment
    get() = NSMetadataItemTimeSignatureKey_VH.get(NSMetadataItemTimeSignatureKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemTimeSignatureKey_VH.set(NSMetadataItemTimeSignatureKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAudioEncodingApplicationKey (Void)*
 */
private val NSMetadataItemAudioEncodingApplicationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAudioEncodingApplicationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAudioEncodingApplicationKey").orElseThrow().reinterpret(NSMetadataItemAudioEncodingApplicationKey_LAYOUT.byteSize()) }
private val NSMetadataItemAudioEncodingApplicationKey_VH: VarHandle by lazy { NSMetadataItemAudioEncodingApplicationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAudioEncodingApplicationKey: MemorySegment
    get() = NSMetadataItemAudioEncodingApplicationKey_VH.get(NSMetadataItemAudioEncodingApplicationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAudioEncodingApplicationKey_VH.set(NSMetadataItemAudioEncodingApplicationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemComposerKey (Void)*
 */
private val NSMetadataItemComposerKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemComposerKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemComposerKey").orElseThrow().reinterpret(NSMetadataItemComposerKey_LAYOUT.byteSize()) }
private val NSMetadataItemComposerKey_VH: VarHandle by lazy { NSMetadataItemComposerKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemComposerKey: MemorySegment
    get() = NSMetadataItemComposerKey_VH.get(NSMetadataItemComposerKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemComposerKey_VH.set(NSMetadataItemComposerKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemLyricistKey (Void)*
 */
private val NSMetadataItemLyricistKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemLyricistKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemLyricistKey").orElseThrow().reinterpret(NSMetadataItemLyricistKey_LAYOUT.byteSize()) }
private val NSMetadataItemLyricistKey_VH: VarHandle by lazy { NSMetadataItemLyricistKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemLyricistKey: MemorySegment
    get() = NSMetadataItemLyricistKey_VH.get(NSMetadataItemLyricistKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemLyricistKey_VH.set(NSMetadataItemLyricistKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemAudioTrackNumberKey (Void)*
 */
private val NSMetadataItemAudioTrackNumberKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemAudioTrackNumberKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemAudioTrackNumberKey").orElseThrow().reinterpret(NSMetadataItemAudioTrackNumberKey_LAYOUT.byteSize()) }
private val NSMetadataItemAudioTrackNumberKey_VH: VarHandle by lazy { NSMetadataItemAudioTrackNumberKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemAudioTrackNumberKey: MemorySegment
    get() = NSMetadataItemAudioTrackNumberKey_VH.get(NSMetadataItemAudioTrackNumberKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemAudioTrackNumberKey_VH.set(NSMetadataItemAudioTrackNumberKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemRecordingDateKey (Void)*
 */
private val NSMetadataItemRecordingDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemRecordingDateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemRecordingDateKey").orElseThrow().reinterpret(NSMetadataItemRecordingDateKey_LAYOUT.byteSize()) }
private val NSMetadataItemRecordingDateKey_VH: VarHandle by lazy { NSMetadataItemRecordingDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemRecordingDateKey: MemorySegment
    get() = NSMetadataItemRecordingDateKey_VH.get(NSMetadataItemRecordingDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemRecordingDateKey_VH.set(NSMetadataItemRecordingDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemMusicalGenreKey (Void)*
 */
private val NSMetadataItemMusicalGenreKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemMusicalGenreKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemMusicalGenreKey").orElseThrow().reinterpret(NSMetadataItemMusicalGenreKey_LAYOUT.byteSize()) }
private val NSMetadataItemMusicalGenreKey_VH: VarHandle by lazy { NSMetadataItemMusicalGenreKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemMusicalGenreKey: MemorySegment
    get() = NSMetadataItemMusicalGenreKey_VH.get(NSMetadataItemMusicalGenreKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemMusicalGenreKey_VH.set(NSMetadataItemMusicalGenreKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemIsGeneralMIDISequenceKey (Void)*
 */
private val NSMetadataItemIsGeneralMIDISequenceKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemIsGeneralMIDISequenceKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemIsGeneralMIDISequenceKey").orElseThrow().reinterpret(NSMetadataItemIsGeneralMIDISequenceKey_LAYOUT.byteSize()) }
private val NSMetadataItemIsGeneralMIDISequenceKey_VH: VarHandle by lazy { NSMetadataItemIsGeneralMIDISequenceKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemIsGeneralMIDISequenceKey: MemorySegment
    get() = NSMetadataItemIsGeneralMIDISequenceKey_VH.get(NSMetadataItemIsGeneralMIDISequenceKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemIsGeneralMIDISequenceKey_VH.set(NSMetadataItemIsGeneralMIDISequenceKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemRecordingYearKey (Void)*
 */
private val NSMetadataItemRecordingYearKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemRecordingYearKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemRecordingYearKey").orElseThrow().reinterpret(NSMetadataItemRecordingYearKey_LAYOUT.byteSize()) }
private val NSMetadataItemRecordingYearKey_VH: VarHandle by lazy { NSMetadataItemRecordingYearKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemRecordingYearKey: MemorySegment
    get() = NSMetadataItemRecordingYearKey_VH.get(NSMetadataItemRecordingYearKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemRecordingYearKey_VH.set(NSMetadataItemRecordingYearKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemOrganizationsKey (Void)*
 */
private val NSMetadataItemOrganizationsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemOrganizationsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemOrganizationsKey").orElseThrow().reinterpret(NSMetadataItemOrganizationsKey_LAYOUT.byteSize()) }
private val NSMetadataItemOrganizationsKey_VH: VarHandle by lazy { NSMetadataItemOrganizationsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemOrganizationsKey: MemorySegment
    get() = NSMetadataItemOrganizationsKey_VH.get(NSMetadataItemOrganizationsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemOrganizationsKey_VH.set(NSMetadataItemOrganizationsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemLanguagesKey (Void)*
 */
private val NSMetadataItemLanguagesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemLanguagesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemLanguagesKey").orElseThrow().reinterpret(NSMetadataItemLanguagesKey_LAYOUT.byteSize()) }
private val NSMetadataItemLanguagesKey_VH: VarHandle by lazy { NSMetadataItemLanguagesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemLanguagesKey: MemorySegment
    get() = NSMetadataItemLanguagesKey_VH.get(NSMetadataItemLanguagesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemLanguagesKey_VH.set(NSMetadataItemLanguagesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemRightsKey (Void)*
 */
private val NSMetadataItemRightsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemRightsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemRightsKey").orElseThrow().reinterpret(NSMetadataItemRightsKey_LAYOUT.byteSize()) }
private val NSMetadataItemRightsKey_VH: VarHandle by lazy { NSMetadataItemRightsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemRightsKey: MemorySegment
    get() = NSMetadataItemRightsKey_VH.get(NSMetadataItemRightsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemRightsKey_VH.set(NSMetadataItemRightsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemPublishersKey (Void)*
 */
private val NSMetadataItemPublishersKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemPublishersKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemPublishersKey").orElseThrow().reinterpret(NSMetadataItemPublishersKey_LAYOUT.byteSize()) }
private val NSMetadataItemPublishersKey_VH: VarHandle by lazy { NSMetadataItemPublishersKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemPublishersKey: MemorySegment
    get() = NSMetadataItemPublishersKey_VH.get(NSMetadataItemPublishersKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemPublishersKey_VH.set(NSMetadataItemPublishersKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemContributorsKey (Void)*
 */
private val NSMetadataItemContributorsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemContributorsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemContributorsKey").orElseThrow().reinterpret(NSMetadataItemContributorsKey_LAYOUT.byteSize()) }
private val NSMetadataItemContributorsKey_VH: VarHandle by lazy { NSMetadataItemContributorsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemContributorsKey: MemorySegment
    get() = NSMetadataItemContributorsKey_VH.get(NSMetadataItemContributorsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemContributorsKey_VH.set(NSMetadataItemContributorsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemCoverageKey (Void)*
 */
private val NSMetadataItemCoverageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemCoverageKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemCoverageKey").orElseThrow().reinterpret(NSMetadataItemCoverageKey_LAYOUT.byteSize()) }
private val NSMetadataItemCoverageKey_VH: VarHandle by lazy { NSMetadataItemCoverageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemCoverageKey: MemorySegment
    get() = NSMetadataItemCoverageKey_VH.get(NSMetadataItemCoverageKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemCoverageKey_VH.set(NSMetadataItemCoverageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemSubjectKey (Void)*
 */
private val NSMetadataItemSubjectKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemSubjectKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemSubjectKey").orElseThrow().reinterpret(NSMetadataItemSubjectKey_LAYOUT.byteSize()) }
private val NSMetadataItemSubjectKey_VH: VarHandle by lazy { NSMetadataItemSubjectKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemSubjectKey: MemorySegment
    get() = NSMetadataItemSubjectKey_VH.get(NSMetadataItemSubjectKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemSubjectKey_VH.set(NSMetadataItemSubjectKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMetadataItemThemeKey (Void)*
 */
private val NSMetadataItemThemeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMetadataItemThemeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("NSMetadataItemThemeKey").orElseThrow().reinterpret(NSMetadataItemThemeKey_LAYOUT.byteSize()) }
private val NSMetadataItemThemeKey_VH: VarHandle by lazy { NSMetadataItemThemeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSMetadataItemThemeKey: MemorySegment
    get() = NSMetadataItemThemeKey_VH.get(NSMetadataItemThemeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMetadataItemThemeKey_VH.set(NSMetadataItemThemeKey_SEGMENT, 0L, value)
