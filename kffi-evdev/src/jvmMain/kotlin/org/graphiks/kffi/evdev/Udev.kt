package org.graphiks.kffi.evdev

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import org.graphiks.kffi.evdev.generated.udev_device_get_action
import org.graphiks.kffi.evdev.generated.udev_device_get_devnode
import org.graphiks.kffi.evdev.generated.udev_device_new_from_syspath
import org.graphiks.kffi.evdev.generated.udev_device_unref
import org.graphiks.kffi.evdev.generated.udev_enumerate_add_match_subsystem
import org.graphiks.kffi.evdev.generated.udev_enumerate_get_list_entry
import org.graphiks.kffi.evdev.generated.udev_enumerate_new
import org.graphiks.kffi.evdev.generated.udev_enumerate_scan_devices
import org.graphiks.kffi.evdev.generated.udev_enumerate_unref
import org.graphiks.kffi.evdev.generated.udev_list_entry_get_name
import org.graphiks.kffi.evdev.generated.udev_list_entry_get_next
import org.graphiks.kffi.evdev.generated.udev_monitor_enable_receiving
import org.graphiks.kffi.evdev.generated.udev_monitor_filter_add_match_subsystem_devtype
import org.graphiks.kffi.evdev.generated.udev_monitor_get_fd
import org.graphiks.kffi.evdev.generated.udev_monitor_new_from_netlink
import org.graphiks.kffi.evdev.generated.udev_monitor_receive_device
import org.graphiks.kffi.evdev.generated.udev_monitor_unref
import org.graphiks.kffi.evdev.generated.udev_new
import org.graphiks.kffi.evdev.generated.udev_unref

/**
 * libudev, notification only: enumeration of the input nodes and the
 * hotplug monitor. Gamepad detection NEVER uses udev properties
 * (ID_INPUT_* needs udev rules to have run — empty in a container); the
 * kernel capabilities via evdev are the truth. All downcalls are guarded:
 * outside Linux everything degrades to `null`.
 */
public fun udevNativeDisabled(): Boolean = evdevNativeDisabled()

/** One observed input node from an enumeration or a hotplug event. */
public data class UdevInputNode(
    public val action: String?, // "add"/"remove"/"change"; null = enumerated
    public val devNode: String, // /dev/input/eventN
    public val sysPath: String,
)

private inline fun <T> guardedNull(block: () -> T?): T? =
    if (evdevNativeDisabled()) null else runCatching(block).getOrNull()

private fun cString(segment: MemorySegment?): String? {
    if (segment == null || segment.address() == 0L) return null
    return runCatching { segment.reinterpret(512).getString(0) }.getOrNull()
}

/** An owned udev context; close releases it. */
public class UdevContext private constructor(
    private val raw: MemorySegment,
) : AutoCloseable {
    public companion object {
        public fun open(): UdevContext? = guardedNull {
            val raw = udev_new()
            if (raw.address() == 0L) return@guardedNull null
            UdevContext(raw)
        }
    }

    internal fun rawPointer(): MemorySegment = raw

    /** Lists the current input nodes (subsystem "input", /dev/input/eventN only). */
    public fun listInputNodes(): List<UdevInputNode> {
        val nodes = ArrayList<UdevInputNode>()
        val enumerate = guardedNull { udev_enumerate_new(raw) } ?: return nodes
        runCatching {
            Arena.ofConfined().use { arena ->
                udev_enumerate_add_match_subsystem(enumerate, arena.allocateFrom("input"))
                udev_enumerate_scan_devices(enumerate)
                var entry = udev_enumerate_get_list_entry(enumerate)
                while (entry.address() != 0L) {
                    val sysPathPointer = udev_list_entry_get_name(entry)
                    val sysPath = cString(sysPathPointer) ?: break
                    val device = udev_device_new_from_syspath(raw, arena.allocateFrom(sysPath))
                    if (device.address() != 0L) {
                        val devNode = cString(udev_device_get_devnode(device))
                        if (devNode != null && devNode.startsWith("/dev/input/event")) {
                            nodes.add(UdevInputNode(action = null, devNode = devNode, sysPath = sysPath))
                        }
                        udev_device_unref(device)
                    }
                    entry = udev_list_entry_get_next(entry)
                }
            }
        }
        runCatching { udev_enumerate_unref(enumerate) }
        return nodes
    }

    override fun close() {
        // udev_unref is optional in practice (context freed at exit); the
        // monitor owns the hotplug resources and is closed separately.
    }
}

/** An owned hotplug monitor for the input subsystem. */
public class UdevMonitor private constructor(
    private val raw: MemorySegment,
) : AutoCloseable {
    public companion object {
        public fun open(context: UdevContext): UdevMonitor? = guardedNull {
            Arena.ofConfined().use { arena ->
                val monitorRaw = udev_monitor_new_from_netlink(context.rawPointer(), arena.allocateFrom("udev"))
                if (monitorRaw.address() == 0L) return@guardedNull null
                udev_monitor_filter_add_match_subsystem_devtype(
                    monitorRaw,
                    arena.allocateFrom("input"),
                    MemorySegment.NULL,
                )
                udev_monitor_enable_receiving(monitorRaw)
                val monitor = UdevMonitor(monitorRaw)
                // The poll fd ships blocking; receive() must be drainable
                // from a poll loop without stalling the worker.
                evdevSetNonBlocking(monitor.fd())
                monitor
            }
        }
    }

    /** The poll fd (-1 when bindings are unavailable). */
    public fun fd(): Int = guarded(-1) { udev_monitor_get_fd(raw) }

    /**
     * Receives one pending device event; null when none. Only input
     * nodes with a /dev/input/eventN devnode are surfaced.
     */
    public fun receive(): UdevInputNode? = guardedNull {
        val device = udev_monitor_receive_device(raw)
        if (device.address() == 0L) return@guardedNull null
        try {
            val devNode = cString(udev_device_get_devnode(device)) ?: return@guardedNull null
            if (!devNode.startsWith("/dev/input/event")) return@guardedNull null
            val action = cString(udev_device_get_action(device))
            UdevInputNode(action = action, devNode = devNode, sysPath = "")
        } finally {
            udev_device_unref(device)
        }
    }

    override fun close() {
        runCatching { udev_monitor_unref(raw) }
    }
}

private inline fun <T> guarded(default: T, block: () -> T): T =
    if (evdevNativeDisabled()) default else runCatching(block).getOrDefault(default)
