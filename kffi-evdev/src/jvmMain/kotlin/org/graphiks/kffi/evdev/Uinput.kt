package org.graphiks.kffi.evdev

import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicBoolean
import org.graphiks.kffi.evdev.generated.EV_FF
import org.graphiks.kffi.evdev.generated.EV_KEY
import org.graphiks.kffi.evdev.generated.EV_SYN
import org.graphiks.kffi.evdev.generated.FF_RUMBLE
import org.graphiks.kffi.evdev.generated.KffiFfEffectStorage
import org.graphiks.kffi.evdev.generated.KffiFfUploadStorage
import org.graphiks.kffi.evdev.generated.UI_ABS_SETUP
import org.graphiks.kffi.evdev.generated.UI_DEV_CREATE
import org.graphiks.kffi.evdev.generated.UI_DEV_DESTROY
import org.graphiks.kffi.evdev.generated.UI_DEV_SETUP
import org.graphiks.kffi.evdev.generated.UI_END_FF_ERASE
import org.graphiks.kffi.evdev.generated.UI_END_FF_UPLOAD
import org.graphiks.kffi.evdev.generated.UI_BEGIN_FF_ERASE
import org.graphiks.kffi.evdev.generated.UI_BEGIN_FF_UPLOAD
import org.graphiks.kffi.evdev.generated.UI_SET_ABSBIT
import org.graphiks.kffi.evdev.generated.UI_SET_EVBIT
import org.graphiks.kffi.evdev.generated.UI_SET_FFBIT
import org.graphiks.kffi.evdev.generated.UI_SET_KEYBIT
import org.graphiks.kffi.evdev.generated.KFFI_UI_FF_ERASE
import org.graphiks.kffi.evdev.generated.KFFI_UI_FF_UPLOAD
import org.graphiks.kffi.evdev.generated._IOC_DIRSHIFT
import org.graphiks.kffi.evdev.generated._IOC_NRSHIFT
import org.graphiks.kffi.evdev.generated._IOC_READ
import org.graphiks.kffi.evdev.generated._IOC_SIZESHIFT
import org.graphiks.kffi.evdev.generated._IOC_TYPESHIFT
import org.graphiks.kffi.evdev.generated.input_absinfo
import org.graphiks.kffi.evdev.generated.input_id
import org.graphiks.kffi.evdev.generated.uinput_abs_setup
import org.graphiks.kffi.evdev.generated.uinput_ff_erase
import org.graphiks.kffi.evdev.generated.uinput_setup

/**
 * /dev/uinput — the injection oracle: a virtual gamepad the integration
 * proofs create, drive (buttons, axes, rumble) and destroy, standing in
 * for physical hardware in containers.
 */
/** One request the kernel forwarded to the uinput owner. */
public data class UinputRequest(
    public val code: Int,
    public val value: Int,
)

/** The virtual gamepad the proofs drive. */
public class UinputVirtualGamepad private constructor(
    private val fd: Int,
    public val name: String,
) : AutoCloseable {
    private val closed = AtomicBoolean(false)
    private val writeLock = Any()

    /** One axis the virtual device exposes (bounds included). */
    public data class Axis(
        public val code: Int,
        public val minimum: Int,
        public val maximum: Int,
    )

    public companion object {
        /**
         * Creates the device: event/key/abs bits, abs setups, device setup,
         * UI_DEV_CREATE. [buttons]/[axes] use kernel codes; [ffEffectsMax]
         * > 0 enables the FF path (the input core also requires the
         * FF_RUMBLE effect-type bit, which the kernel rejects uploads
         * without).
         */
        public fun open(
            name: String,
            bustype: Int,
            vendor: Int,
            product: Int,
            buttons: List<Int>,
            axes: List<Axis>,
            ffEffectsMax: Int,
        ): UinputVirtualGamepad? {
            if (evdevNativeDisabled()) return null
            val fd = runCatching { evdevOpenReadWrite("/dev/uinput") }.getOrDefault(-1)
            if (fd < 0) return null
            val debug = System.getenv("KFFI_EVDEV_DEBUG") == "1"
            fun step(label: String, ok: Boolean): Boolean {
                if (debug) println("EVDEV-UINPUT-STEP $label ok=$ok")
                return ok
            }
            val created = runCatching {
                // UI_SET_* ioctls carry the bit number by value
                step("set-evbit-key", evdevIoctlInt(fd, UI_SET_EVBIT().toInt(), EV_KEY()) >= 0) &&
                    step("set-evbit-abs", evdevIoctlInt(fd, UI_SET_EVBIT().toInt(), EV_ABS_CODE) >= 0) &&
                    step("set-evbit-ff", ffEffectsMax <= 0 || evdevIoctlInt(fd, UI_SET_EVBIT().toInt(), EV_FF()) >= 0) &&
                    step("set-ffbit-rumble", ffEffectsMax <= 0 || evdevIoctlInt(fd, UI_SET_FFBIT().toInt(), FF_RUMBLE()) >= 0) &&
                    step("set-keybits", buttons.all { evdevIoctlInt(fd, UI_SET_KEYBIT().toInt(), it) >= 0 }) &&
                    step("set-absbits", axes.all { evdevIoctlInt(fd, UI_SET_ABSBIT().toInt(), it.code) >= 0 }) &&
                    step("abs-setups", axes.all { axis -> setupAbs(fd, axis) }) &&
                    step("dev-setup", setupDevice(fd, name, bustype, vendor, product, ffEffectsMax)) &&
                    step("dev-create", evdevIoctlInt(fd, UI_DEV_CREATE().toInt(), 0) >= 0)
            }.onFailure { failure ->
                if (debug) {
                    println("EVDEV-UINPUT-STEP failed-with ${failure::class.simpleName}: ${failure.message}")
                }
            }.getOrDefault(false)
            if (!created) {
                evdevClose(fd)
                return null
            }
            return UinputVirtualGamepad(fd, name)
        }

        private const val EV_ABS_CODE = 0x03

        private fun setupAbs(fd: Int, axis: Axis): Boolean =
            Arena.ofConfined().use { arena ->
                val buffer = uinput_abs_setup.allocate(arena)
                buffer.set(
                    ValueLayout.JAVA_SHORT,
                    uinput_abs_setup.layout.byteOffset(groupElement("code")),
                    axis.code.toShort(),
                )
                val absOffset = uinput_abs_setup.layout.byteOffset(groupElement("absinfo"))
                fun absField(name: String) = absOffset + input_absinfo.layout.byteOffset(groupElement(name))
                buffer.set(ValueLayout.JAVA_INT, absField("value"), 0)
                buffer.set(ValueLayout.JAVA_INT, absField("minimum"), axis.minimum)
                buffer.set(ValueLayout.JAVA_INT, absField("maximum"), axis.maximum)
                buffer.set(ValueLayout.JAVA_INT, absField("fuzz"), 0)
                buffer.set(ValueLayout.JAVA_INT, absField("flat"), 0)
                buffer.set(ValueLayout.JAVA_INT, absField("resolution"), 0)
                evdevIoctlPtr(fd, UI_ABS_SETUP().toInt(), buffer) >= 0
            }

        private fun setupDevice(
            fd: Int,
            name: String,
            bustype: Int,
            vendor: Int,
            product: Int,
            ffEffectsMax: Int,
        ): Boolean = Arena.ofConfined().use { arena ->
            val buffer = uinput_setup.allocate(arena)
            val idOffset = uinput_setup.layout.byteOffset(groupElement("id"))
            fun idField(name: String) = idOffset + input_id.layout.byteOffset(groupElement(name))
            buffer.set(ValueLayout.JAVA_SHORT, idField("bustype"), bustype.toShort())
            buffer.set(ValueLayout.JAVA_SHORT, idField("vendor"), vendor.toShort())
            buffer.set(ValueLayout.JAVA_SHORT, idField("product"), product.toShort())
            buffer.set(ValueLayout.JAVA_SHORT, idField("version"), 0)
            require(name.length <= 79) { "uinput name must fit the 80-byte field" }
            val nameOffset = uinput_setup.layout.byteOffset(groupElement("name"))
            for (index in name.indices) {
                buffer.set(ValueLayout.JAVA_BYTE, nameOffset + index, name[index].code.toByte())
            }
            buffer.set(ValueLayout.JAVA_BYTE, nameOffset + name.length, 0)
            buffer.set(
                ValueLayout.JAVA_INT,
                uinput_setup.layout.byteOffset(groupElement("ff_effects_max")),
                ffEffectsMax,
            )
            evdevIoctlPtr(fd, UI_DEV_SETUP().toInt(), buffer) >= 0
        }
    }

    /** Injects one input_event (SYN_REPORT included when [sync] is true). */
    public fun inject(type: Int, code: Int, value: Int, sync: Boolean = true) {
        check(!closed.get()) { "uinput device is closed" }
        Arena.ofConfined().use { arena ->
            synchronized(writeLock) {
                evdevWrite(fd, evdevEncodeEvent(arena, type, code, value))
                if (sync) {
                    evdevWrite(fd, evdevEncodeEvent(arena, EV_SYN(), 0, 0))
                }
            }
        }
    }

    /**
     * Sysfs name of the created device (UI_GET_SYSNAME) — the container
     * path to the event node: `/sys/class/input/<name>/event*`.
     */
    public fun sysName(): String? {
        check(!closed.get()) { "uinput device is closed" }
        val request = iocUiGetSysname(64)
        return Arena.ofConfined().use { arena ->
            val buffer = arena.allocate(64)
            if (evdevIoctlPtr(fd, request, buffer) < 0) return null
            val end = (0 until 64).firstOrNull { buffer.get(ValueLayout.JAVA_BYTE, it.toLong()) == 0.toByte() } ?: 64
            if (end == 0) return null
            buildString { repeat(end) { append(buffer.get(ValueLayout.JAVA_BYTE, it.toLong()).toInt().toChar()) } }
        }
    }

    // UI_GET_SYSNAME(len) is a function-like macro: recomputed from the
    // generated _IOC bits exactly as the uapi macro does.
    private fun iocUiGetSysname(len: Int): Int =
        (_IOC_READ() shl _IOC_DIRSHIFT()) or
            (len shl _IOC_SIZESHIFT()) or
            ('U'.code shl _IOC_TYPESHIFT()) or
            (44 shl _IOC_NRSHIFT())

    /** Drains one pending forwarded play/stop request; null when none. */
    public fun receiveRequest(): UinputRequest? {
        check(!closed.get()) { "uinput device is closed" }
        return readEvent()?.takeIf { it.type != EvdevEvent.UINPUT }?.let { event -> UinputRequest(event.code, event.value) }
    }

    private fun readEvent(): EvdevInputEvent? {
        Arena.ofConfined().use { arena ->
            val buffer = arena.allocate(INPUT_EVENT_LAYOUT)
            val bytes = evdevRead(fd, buffer)
            if (bytes < INPUT_EVENT_LAYOUT.byteSize()) return null
            return evdevDecodeEvents(buffer, bytes).firstOrNull()
        }
    }

    private val forwardedRequests = ConcurrentLinkedQueue<UinputRequest>()

    /**
     * Services one pending kernel request when present: FF uploads and
     * erases are acknowledged through the BEGIN/END handshake (the caller
     * of EVIOCSFF/EVIOCRMFF blocks until then); play/stop forwardings are
     * queued for [pollForwardedRequest]. False when nothing was pending.
     */
    public fun pumpFfRequest(): Boolean {
        check(!closed.get()) { "uinput device is closed" }
        val event = readEvent() ?: return false
        val debug = System.getenv("KFFI_EVDEV_DEBUG") == "1"
        if (debug) println("EVDEV-UINPUT-REQUEST type=${event.type} code=${event.code} value=${event.value}")
        when {
            event.type == EvdevEvent.UINPUT && event.code == KFFI_UI_FF_UPLOAD() -> completeUpload(event.value)
            event.type == EvdevEvent.UINPUT && event.code == KFFI_UI_FF_ERASE() -> completeErase(event.value)
            else -> forwardedRequests.add(UinputRequest(code = event.code, value = event.value))
        }
        return true
    }

    /** One forwarded play/stop request observed by the owner, if any. */
    public fun pollForwardedRequest(): UinputRequest? = forwardedRequests.poll()

    private fun completeUpload(requestId: Int) {
        val debug = System.getenv("KFFI_EVDEV_DEBUG") == "1"
        Arena.ofConfined().use { arena ->
            val upload = KffiFfUploadStorage.allocate(arena)
            upload.set(
                ValueLayout.JAVA_INT,
                KffiFfUploadStorage.layout.byteOffset(groupElement("request_id")),
                requestId,
            )
            val begun = evdevIoctlPtr(fd, UI_BEGIN_FF_UPLOAD().toInt(), upload)
            if (debug) println("EVDEV-UINPUT-FF begin-upload rc=$begun errno=${evdevErrno()}")
            upload.set(
                ValueLayout.JAVA_INT,
                KffiFfUploadStorage.layout.byteOffset(groupElement("retval")),
                if (begun >= 0) 0 else -1,
            )
            val ended = evdevIoctlPtr(fd, UI_END_FF_UPLOAD().toInt(), upload)
            if (debug) println("EVDEV-UINPUT-FF end-upload rc=$ended errno=${evdevErrno()}")
        }
    }

    private fun completeErase(requestId: Int) {
        val debug = System.getenv("KFFI_EVDEV_DEBUG") == "1"
        Arena.ofConfined().use { arena ->
            val erase = uinput_ff_erase.allocate(arena)
            erase.set(
                ValueLayout.JAVA_INT,
                uinput_ff_erase.layout.byteOffset(groupElement("request_id")),
                requestId,
            )
            val begun = evdevIoctlPtr(fd, UI_BEGIN_FF_ERASE().toInt(), erase)
            if (debug) println("EVDEV-UINPUT-FF begin-erase rc=$begun errno=${evdevErrno()}")
            erase.set(
                ValueLayout.JAVA_INT,
                uinput_ff_erase.layout.byteOffset(groupElement("retval")),
                if (begun >= 0) 0 else -1,
            )
            val ended = evdevIoctlPtr(fd, UI_END_FF_ERASE().toInt(), erase)
            if (debug) println("EVDEV-UINPUT-FF end-erase rc=$ended errno=${evdevErrno()}")
        }
    }

    override fun close() {
        if (!closed.compareAndSet(false, true)) return
        runCatching { evdevIoctlInt(fd, UI_DEV_DESTROY().toInt(), 0) }
        runCatching { evdevClose(fd) }
    }
}
