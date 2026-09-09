@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.NSArray
import org.graphiks.kffi.objc.NSScreen
import org.graphiks.kffi.objc.NSRect
import org.graphiks.kffi.objc.PlatformAvailability
import java.lang.foreign.MemorySegment

/** Detached AppKit screen data matched to its CoreGraphics display identifier. */
data class AppKitScreenSnapshot(
    val displayId: Int,
    val isPrimary: Boolean,
    /** AppKit global screen coordinates, in screen-space units. */
    val frame: CGDisplayBoundsSnapshot,
    /** AppKit global usable screen coordinates, in screen-space units. */
    val visibleFrame: CGDisplayBoundsSnapshot,
    val backingScaleFactor: Double,
    val localizedName: String,
) {
    init {
        require(backingScaleFactor.isFinite() && backingScaleFactor > 0.0) {
            "backingScaleFactor must be finite and positive"
        }
    }
}

/**
 * Pointer-free AppKit screen enumeration for macOS 26 and newer.
 *
 * macOS 26 exposes [NSScreen.CGDirectDisplayID], which is the first public AppKit association
 * between a screen and the CoreGraphics display ID used by display-mode operations. Callers on
 * earlier macOS releases must treat this service as unavailable rather than infer the association
 * from geometry or private device-description keys.
 */
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
object AppKitScreenServices {
    fun snapshots(): List<AppKitScreenSnapshot> = snapshots(CocoaScreenNative)

    internal fun snapshots(native: AppKitScreenNative): List<AppKitScreenSnapshot> {
        val primary = native.primaryDisplayId()
        val snapshots = native.screens().map { screen ->
            val id = native.displayId(screen)
            AppKitScreenSnapshot(
                displayId = id,
                isPrimary = id == primary,
                frame = native.frame(screen),
                visibleFrame = native.visibleFrame(screen),
                backingScaleFactor = native.backingScaleFactor(screen),
                localizedName = native.localizedName(screen),
            )
        }
        check(snapshots.map(AppKitScreenSnapshot::displayId).distinct().size == snapshots.size) {
            "NSScreen returned duplicate CoreGraphics display identifiers"
        }
        return snapshots
    }
}

/** Internal seam keeping borrowed AppKit object references out of the public adapter API. */
internal interface AppKitScreenNative {
    fun screens(): List<Long>
    fun primaryDisplayId(): Int
    fun displayId(screen: Long): Int
    fun frame(screen: Long): CGDisplayBoundsSnapshot
    fun visibleFrame(screen: Long): CGDisplayBoundsSnapshot
    fun backingScaleFactor(screen: Long): Double
    fun localizedName(screen: Long): String
}

private object CocoaScreenNative : AppKitScreenNative {
    override fun screens(): List<Long> {
        val array = NSArray(NSScreen.screens())
        val count = array.count()
        check(count in 0..Int.MAX_VALUE.toLong()) { "NSScreen returned invalid screen count $count" }
        return List(count.toInt()) { index -> array.objectAtIndex(index.toLong()).address() }
    }

    override fun primaryDisplayId(): Int {
        val primary = NSScreen.mainScreen()
        check(primary != MemorySegment.NULL) { "NSScreen.mainScreen returned null" }
        return NSScreen(primary).CGDirectDisplayID()
    }

    override fun displayId(screen: Long): Int = screen(screen).CGDirectDisplayID()

    override fun frame(screen: Long): CGDisplayBoundsSnapshot = screen(screen).frame().toSnapshot()

    override fun visibleFrame(screen: Long): CGDisplayBoundsSnapshot = screen(screen).visibleFrame().toSnapshot()

    override fun backingScaleFactor(screen: Long): Double = screen(screen).backingScaleFactor()

    override fun localizedName(screen: Long): String = screen(screen).localizedNameAsString()

    private fun screen(address: Long): NSScreen {
        check(address != 0L) { "NSScreen reference was null" }
        return NSScreen(MemorySegment.ofAddress(address))
    }
}

private fun NSRect.toSnapshot(): CGDisplayBoundsSnapshot = CGDisplayBoundsSnapshot(
    x = origin.x,
    y = origin.y,
    width = size.width,
    height = size.height,
)
