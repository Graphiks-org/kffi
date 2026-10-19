package org.graphiks.kffi.evdev.generated

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
    lu = SymbolLookup.libraryLookup("libc.so.6", Arena.global()).or(lu)
    lu = SymbolLookup.libraryLookup("libudev.so.1", Arena.global()).or(lu)
    lu
}

/**
 * {@snippet lang=c : #define _IOC_NRBITS 8
 */
fun _IOC_NRBITS(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define _IOC_TYPEBITS 8
 */
fun _IOC_TYPEBITS(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define _IOC_SIZEBITS 14
 */
fun _IOC_SIZEBITS(): Int = (14).toInt()

/**
 * {@snippet lang=c : #define _IOC_DIRBITS 2
 */
fun _IOC_DIRBITS(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define _IOC_NRSHIFT 0
 */
fun _IOC_NRSHIFT(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define O_RDONLY 0
 */
fun O_RDONLY(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define O_WRONLY 1
 */
fun O_WRONLY(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define O_RDWR 2
 */
fun O_RDWR(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define O_NONBLOCK 2048
 */
fun O_NONBLOCK(): Int = (2048).toInt()

/**
 * {@snippet lang=c : #define F_GETFD 1
 */
fun F_GETFD(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define F_SETFD 2
 */
fun F_SETFD(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define F_GETFL 3
 */
fun F_GETFL(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define F_SETFL 4
 */
fun F_SETFL(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define EV_SYN 0
 */
fun EV_SYN(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define EV_KEY 1
 */
fun EV_KEY(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define EV_REL 2
 */
fun EV_REL(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define EV_ABS 3
 */
fun EV_ABS(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define EV_MSC 4
 */
fun EV_MSC(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define EV_SW 5
 */
fun EV_SW(): Int = (5).toInt()

/**
 * {@snippet lang=c : #define EV_LED 17
 */
fun EV_LED(): Int = (17).toInt()

/**
 * {@snippet lang=c : #define EV_SND 18
 */
fun EV_SND(): Int = (18).toInt()

/**
 * {@snippet lang=c : #define EV_REP 20
 */
fun EV_REP(): Int = (20).toInt()

/**
 * {@snippet lang=c : #define EV_FF 21
 */
fun EV_FF(): Int = (21).toInt()

/**
 * {@snippet lang=c : #define EV_PWR 22
 */
fun EV_PWR(): Int = (22).toInt()

/**
 * {@snippet lang=c : #define EV_FF_STATUS 23
 */
fun EV_FF_STATUS(): Int = (23).toInt()

/**
 * {@snippet lang=c : #define EV_MAX 31
 */
fun EV_MAX(): Int = (31).toInt()

/**
 * {@snippet lang=c : #define SYN_REPORT 0
 */
fun SYN_REPORT(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define SYN_CONFIG 1
 */
fun SYN_CONFIG(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define SYN_MT_REPORT 2
 */
fun SYN_MT_REPORT(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define SYN_DROPPED 3
 */
fun SYN_DROPPED(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define SYN_MAX 15
 */
fun SYN_MAX(): Int = (15).toInt()

/**
 * {@snippet lang=c : #define BTN_MISC 256
 */
fun BTN_MISC(): Int = (256).toInt()

/**
 * {@snippet lang=c : #define BTN_0 256
 */
fun BTN_0(): Int = (256).toInt()

/**
 * {@snippet lang=c : #define BTN_1 257
 */
fun BTN_1(): Int = (257).toInt()

/**
 * {@snippet lang=c : #define BTN_2 258
 */
fun BTN_2(): Int = (258).toInt()

/**
 * {@snippet lang=c : #define BTN_3 259
 */
fun BTN_3(): Int = (259).toInt()

/**
 * {@snippet lang=c : #define BTN_4 260
 */
fun BTN_4(): Int = (260).toInt()

/**
 * {@snippet lang=c : #define BTN_5 261
 */
fun BTN_5(): Int = (261).toInt()

/**
 * {@snippet lang=c : #define BTN_6 262
 */
fun BTN_6(): Int = (262).toInt()

/**
 * {@snippet lang=c : #define BTN_7 263
 */
fun BTN_7(): Int = (263).toInt()

/**
 * {@snippet lang=c : #define BTN_8 264
 */
fun BTN_8(): Int = (264).toInt()

/**
 * {@snippet lang=c : #define BTN_9 265
 */
fun BTN_9(): Int = (265).toInt()

/**
 * {@snippet lang=c : #define BTN_MOUSE 272
 */
fun BTN_MOUSE(): Int = (272).toInt()

/**
 * {@snippet lang=c : #define BTN_LEFT 272
 */
fun BTN_LEFT(): Int = (272).toInt()

/**
 * {@snippet lang=c : #define BTN_RIGHT 273
 */
fun BTN_RIGHT(): Int = (273).toInt()

/**
 * {@snippet lang=c : #define BTN_MIDDLE 274
 */
fun BTN_MIDDLE(): Int = (274).toInt()

/**
 * {@snippet lang=c : #define BTN_SIDE 275
 */
fun BTN_SIDE(): Int = (275).toInt()

/**
 * {@snippet lang=c : #define BTN_EXTRA 276
 */
fun BTN_EXTRA(): Int = (276).toInt()

/**
 * {@snippet lang=c : #define BTN_FORWARD 277
 */
fun BTN_FORWARD(): Int = (277).toInt()

/**
 * {@snippet lang=c : #define BTN_BACK 278
 */
fun BTN_BACK(): Int = (278).toInt()

/**
 * {@snippet lang=c : #define BTN_TASK 279
 */
fun BTN_TASK(): Int = (279).toInt()

/**
 * {@snippet lang=c : #define BTN_JOYSTICK 288
 */
fun BTN_JOYSTICK(): Int = (288).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER 288
 */
fun BTN_TRIGGER(): Int = (288).toInt()

/**
 * {@snippet lang=c : #define BTN_THUMB 289
 */
fun BTN_THUMB(): Int = (289).toInt()

/**
 * {@snippet lang=c : #define BTN_THUMB2 290
 */
fun BTN_THUMB2(): Int = (290).toInt()

/**
 * {@snippet lang=c : #define BTN_TOP 291
 */
fun BTN_TOP(): Int = (291).toInt()

/**
 * {@snippet lang=c : #define BTN_TOP2 292
 */
fun BTN_TOP2(): Int = (292).toInt()

/**
 * {@snippet lang=c : #define BTN_PINKIE 293
 */
fun BTN_PINKIE(): Int = (293).toInt()

/**
 * {@snippet lang=c : #define BTN_BASE 294
 */
fun BTN_BASE(): Int = (294).toInt()

/**
 * {@snippet lang=c : #define BTN_BASE2 295
 */
fun BTN_BASE2(): Int = (295).toInt()

/**
 * {@snippet lang=c : #define BTN_BASE3 296
 */
fun BTN_BASE3(): Int = (296).toInt()

/**
 * {@snippet lang=c : #define BTN_BASE4 297
 */
fun BTN_BASE4(): Int = (297).toInt()

/**
 * {@snippet lang=c : #define BTN_BASE5 298
 */
fun BTN_BASE5(): Int = (298).toInt()

/**
 * {@snippet lang=c : #define BTN_BASE6 299
 */
fun BTN_BASE6(): Int = (299).toInt()

/**
 * {@snippet lang=c : #define BTN_DEAD 303
 */
fun BTN_DEAD(): Int = (303).toInt()

/**
 * {@snippet lang=c : #define BTN_GAMEPAD 304
 */
fun BTN_GAMEPAD(): Int = (304).toInt()

/**
 * {@snippet lang=c : #define BTN_SOUTH 304
 */
fun BTN_SOUTH(): Int = (304).toInt()

/**
 * {@snippet lang=c : #define BTN_EAST 305
 */
fun BTN_EAST(): Int = (305).toInt()

/**
 * {@snippet lang=c : #define BTN_C 306
 */
fun BTN_C(): Int = (306).toInt()

/**
 * {@snippet lang=c : #define BTN_NORTH 307
 */
fun BTN_NORTH(): Int = (307).toInt()

/**
 * {@snippet lang=c : #define BTN_WEST 308
 */
fun BTN_WEST(): Int = (308).toInt()

/**
 * {@snippet lang=c : #define BTN_Z 309
 */
fun BTN_Z(): Int = (309).toInt()

/**
 * {@snippet lang=c : #define BTN_TL 310
 */
fun BTN_TL(): Int = (310).toInt()

/**
 * {@snippet lang=c : #define BTN_TR 311
 */
fun BTN_TR(): Int = (311).toInt()

/**
 * {@snippet lang=c : #define BTN_TL2 312
 */
fun BTN_TL2(): Int = (312).toInt()

/**
 * {@snippet lang=c : #define BTN_TR2 313
 */
fun BTN_TR2(): Int = (313).toInt()

/**
 * {@snippet lang=c : #define BTN_SELECT 314
 */
fun BTN_SELECT(): Int = (314).toInt()

/**
 * {@snippet lang=c : #define BTN_START 315
 */
fun BTN_START(): Int = (315).toInt()

/**
 * {@snippet lang=c : #define BTN_MODE 316
 */
fun BTN_MODE(): Int = (316).toInt()

/**
 * {@snippet lang=c : #define BTN_THUMBL 317
 */
fun BTN_THUMBL(): Int = (317).toInt()

/**
 * {@snippet lang=c : #define BTN_THUMBR 318
 */
fun BTN_THUMBR(): Int = (318).toInt()

/**
 * {@snippet lang=c : #define BTN_DIGI 320
 */
fun BTN_DIGI(): Int = (320).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_PEN 320
 */
fun BTN_TOOL_PEN(): Int = (320).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_RUBBER 321
 */
fun BTN_TOOL_RUBBER(): Int = (321).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_BRUSH 322
 */
fun BTN_TOOL_BRUSH(): Int = (322).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_PENCIL 323
 */
fun BTN_TOOL_PENCIL(): Int = (323).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_AIRBRUSH 324
 */
fun BTN_TOOL_AIRBRUSH(): Int = (324).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_FINGER 325
 */
fun BTN_TOOL_FINGER(): Int = (325).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_MOUSE 326
 */
fun BTN_TOOL_MOUSE(): Int = (326).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_LENS 327
 */
fun BTN_TOOL_LENS(): Int = (327).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_QUINTTAP 328
 */
fun BTN_TOOL_QUINTTAP(): Int = (328).toInt()

/**
 * {@snippet lang=c : #define BTN_STYLUS3 329
 */
fun BTN_STYLUS3(): Int = (329).toInt()

/**
 * {@snippet lang=c : #define BTN_TOUCH 330
 */
fun BTN_TOUCH(): Int = (330).toInt()

/**
 * {@snippet lang=c : #define BTN_STYLUS 331
 */
fun BTN_STYLUS(): Int = (331).toInt()

/**
 * {@snippet lang=c : #define BTN_STYLUS2 332
 */
fun BTN_STYLUS2(): Int = (332).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_DOUBLETAP 333
 */
fun BTN_TOOL_DOUBLETAP(): Int = (333).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_TRIPLETAP 334
 */
fun BTN_TOOL_TRIPLETAP(): Int = (334).toInt()

/**
 * {@snippet lang=c : #define BTN_TOOL_QUADTAP 335
 */
fun BTN_TOOL_QUADTAP(): Int = (335).toInt()

/**
 * {@snippet lang=c : #define BTN_WHEEL 336
 */
fun BTN_WHEEL(): Int = (336).toInt()

/**
 * {@snippet lang=c : #define BTN_GEAR_DOWN 336
 */
fun BTN_GEAR_DOWN(): Int = (336).toInt()

/**
 * {@snippet lang=c : #define BTN_GEAR_UP 337
 */
fun BTN_GEAR_UP(): Int = (337).toInt()

/**
 * {@snippet lang=c : #define BTN_DPAD_UP 544
 */
fun BTN_DPAD_UP(): Int = (544).toInt()

/**
 * {@snippet lang=c : #define BTN_DPAD_DOWN 545
 */
fun BTN_DPAD_DOWN(): Int = (545).toInt()

/**
 * {@snippet lang=c : #define BTN_DPAD_LEFT 546
 */
fun BTN_DPAD_LEFT(): Int = (546).toInt()

/**
 * {@snippet lang=c : #define BTN_DPAD_RIGHT 547
 */
fun BTN_DPAD_RIGHT(): Int = (547).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY 704
 */
fun BTN_TRIGGER_HAPPY(): Int = (704).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY1 704
 */
fun BTN_TRIGGER_HAPPY1(): Int = (704).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY2 705
 */
fun BTN_TRIGGER_HAPPY2(): Int = (705).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY3 706
 */
fun BTN_TRIGGER_HAPPY3(): Int = (706).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY4 707
 */
fun BTN_TRIGGER_HAPPY4(): Int = (707).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY5 708
 */
fun BTN_TRIGGER_HAPPY5(): Int = (708).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY6 709
 */
fun BTN_TRIGGER_HAPPY6(): Int = (709).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY7 710
 */
fun BTN_TRIGGER_HAPPY7(): Int = (710).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY8 711
 */
fun BTN_TRIGGER_HAPPY8(): Int = (711).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY9 712
 */
fun BTN_TRIGGER_HAPPY9(): Int = (712).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY10 713
 */
fun BTN_TRIGGER_HAPPY10(): Int = (713).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY11 714
 */
fun BTN_TRIGGER_HAPPY11(): Int = (714).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY12 715
 */
fun BTN_TRIGGER_HAPPY12(): Int = (715).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY13 716
 */
fun BTN_TRIGGER_HAPPY13(): Int = (716).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY14 717
 */
fun BTN_TRIGGER_HAPPY14(): Int = (717).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY15 718
 */
fun BTN_TRIGGER_HAPPY15(): Int = (718).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY16 719
 */
fun BTN_TRIGGER_HAPPY16(): Int = (719).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY17 720
 */
fun BTN_TRIGGER_HAPPY17(): Int = (720).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY18 721
 */
fun BTN_TRIGGER_HAPPY18(): Int = (721).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY19 722
 */
fun BTN_TRIGGER_HAPPY19(): Int = (722).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY20 723
 */
fun BTN_TRIGGER_HAPPY20(): Int = (723).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY21 724
 */
fun BTN_TRIGGER_HAPPY21(): Int = (724).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY22 725
 */
fun BTN_TRIGGER_HAPPY22(): Int = (725).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY23 726
 */
fun BTN_TRIGGER_HAPPY23(): Int = (726).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY24 727
 */
fun BTN_TRIGGER_HAPPY24(): Int = (727).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY25 728
 */
fun BTN_TRIGGER_HAPPY25(): Int = (728).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY26 729
 */
fun BTN_TRIGGER_HAPPY26(): Int = (729).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY27 730
 */
fun BTN_TRIGGER_HAPPY27(): Int = (730).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY28 731
 */
fun BTN_TRIGGER_HAPPY28(): Int = (731).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY29 732
 */
fun BTN_TRIGGER_HAPPY29(): Int = (732).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY30 733
 */
fun BTN_TRIGGER_HAPPY30(): Int = (733).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY31 734
 */
fun BTN_TRIGGER_HAPPY31(): Int = (734).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY32 735
 */
fun BTN_TRIGGER_HAPPY32(): Int = (735).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY33 736
 */
fun BTN_TRIGGER_HAPPY33(): Int = (736).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY34 737
 */
fun BTN_TRIGGER_HAPPY34(): Int = (737).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY35 738
 */
fun BTN_TRIGGER_HAPPY35(): Int = (738).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY36 739
 */
fun BTN_TRIGGER_HAPPY36(): Int = (739).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY37 740
 */
fun BTN_TRIGGER_HAPPY37(): Int = (740).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY38 741
 */
fun BTN_TRIGGER_HAPPY38(): Int = (741).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY39 742
 */
fun BTN_TRIGGER_HAPPY39(): Int = (742).toInt()

/**
 * {@snippet lang=c : #define BTN_TRIGGER_HAPPY40 743
 */
fun BTN_TRIGGER_HAPPY40(): Int = (743).toInt()

/**
 * {@snippet lang=c : #define ABS_X 0
 */
fun ABS_X(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define ABS_Y 1
 */
fun ABS_Y(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define ABS_Z 2
 */
fun ABS_Z(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define ABS_RX 3
 */
fun ABS_RX(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define ABS_RY 4
 */
fun ABS_RY(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define ABS_RZ 5
 */
fun ABS_RZ(): Int = (5).toInt()

/**
 * {@snippet lang=c : #define ABS_THROTTLE 6
 */
fun ABS_THROTTLE(): Int = (6).toInt()

/**
 * {@snippet lang=c : #define ABS_RUDDER 7
 */
fun ABS_RUDDER(): Int = (7).toInt()

/**
 * {@snippet lang=c : #define ABS_WHEEL 8
 */
fun ABS_WHEEL(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define ABS_GAS 9
 */
fun ABS_GAS(): Int = (9).toInt()

/**
 * {@snippet lang=c : #define ABS_BRAKE 10
 */
fun ABS_BRAKE(): Int = (10).toInt()

/**
 * {@snippet lang=c : #define ABS_HAT0X 16
 */
fun ABS_HAT0X(): Int = (16).toInt()

/**
 * {@snippet lang=c : #define ABS_HAT0Y 17
 */
fun ABS_HAT0Y(): Int = (17).toInt()

/**
 * {@snippet lang=c : #define ABS_HAT1X 18
 */
fun ABS_HAT1X(): Int = (18).toInt()

/**
 * {@snippet lang=c : #define ABS_HAT1Y 19
 */
fun ABS_HAT1Y(): Int = (19).toInt()

/**
 * {@snippet lang=c : #define ABS_HAT2X 20
 */
fun ABS_HAT2X(): Int = (20).toInt()

/**
 * {@snippet lang=c : #define ABS_HAT2Y 21
 */
fun ABS_HAT2Y(): Int = (21).toInt()

/**
 * {@snippet lang=c : #define ABS_HAT3X 22
 */
fun ABS_HAT3X(): Int = (22).toInt()

/**
 * {@snippet lang=c : #define ABS_HAT3Y 23
 */
fun ABS_HAT3Y(): Int = (23).toInt()

/**
 * {@snippet lang=c : #define ABS_PRESSURE 24
 */
fun ABS_PRESSURE(): Int = (24).toInt()

/**
 * {@snippet lang=c : #define ABS_DISTANCE 25
 */
fun ABS_DISTANCE(): Int = (25).toInt()

/**
 * {@snippet lang=c : #define ABS_TILT_X 26
 */
fun ABS_TILT_X(): Int = (26).toInt()

/**
 * {@snippet lang=c : #define ABS_TILT_Y 27
 */
fun ABS_TILT_Y(): Int = (27).toInt()

/**
 * {@snippet lang=c : #define ABS_TOOL_WIDTH 28
 */
fun ABS_TOOL_WIDTH(): Int = (28).toInt()

/**
 * {@snippet lang=c : #define ABS_VOLUME 32
 */
fun ABS_VOLUME(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define ABS_PROFILE 33
 */
fun ABS_PROFILE(): Int = (33).toInt()

/**
 * {@snippet lang=c : #define ABS_MISC 40
 */
fun ABS_MISC(): Int = (40).toInt()

/**
 * {@snippet lang=c : #define ABS_RESERVED 46
 */
fun ABS_RESERVED(): Int = (46).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_SLOT 47
 */
fun ABS_MT_SLOT(): Int = (47).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_TOUCH_MAJOR 48
 */
fun ABS_MT_TOUCH_MAJOR(): Int = (48).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_TOUCH_MINOR 49
 */
fun ABS_MT_TOUCH_MINOR(): Int = (49).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_WIDTH_MAJOR 50
 */
fun ABS_MT_WIDTH_MAJOR(): Int = (50).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_WIDTH_MINOR 51
 */
fun ABS_MT_WIDTH_MINOR(): Int = (51).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_ORIENTATION 52
 */
fun ABS_MT_ORIENTATION(): Int = (52).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_POSITION_X 53
 */
fun ABS_MT_POSITION_X(): Int = (53).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_POSITION_Y 54
 */
fun ABS_MT_POSITION_Y(): Int = (54).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_TOOL_TYPE 55
 */
fun ABS_MT_TOOL_TYPE(): Int = (55).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_BLOB_ID 56
 */
fun ABS_MT_BLOB_ID(): Int = (56).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_TRACKING_ID 57
 */
fun ABS_MT_TRACKING_ID(): Int = (57).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_PRESSURE 58
 */
fun ABS_MT_PRESSURE(): Int = (58).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_DISTANCE 59
 */
fun ABS_MT_DISTANCE(): Int = (59).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_TOOL_X 60
 */
fun ABS_MT_TOOL_X(): Int = (60).toInt()

/**
 * {@snippet lang=c : #define ABS_MT_TOOL_Y 61
 */
fun ABS_MT_TOOL_Y(): Int = (61).toInt()

/**
 * {@snippet lang=c : #define ABS_MAX 63
 */
fun ABS_MAX(): Int = (63).toInt()

/**
 * {@snippet lang=c : #define EV_VERSION 65537
 */
fun EV_VERSION(): Int = (65537).toInt()

/**
 * {@snippet lang=c : #define BUS_PCI 1
 */
fun BUS_PCI(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define BUS_ISAPNP 2
 */
fun BUS_ISAPNP(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define BUS_USB 3
 */
fun BUS_USB(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define BUS_HIL 4
 */
fun BUS_HIL(): Int = (4).toInt()

/**
 * {@snippet lang=c : #define BUS_BLUETOOTH 5
 */
fun BUS_BLUETOOTH(): Int = (5).toInt()

/**
 * {@snippet lang=c : #define BUS_VIRTUAL 6
 */
fun BUS_VIRTUAL(): Int = (6).toInt()

/**
 * {@snippet lang=c : #define BUS_ISA 16
 */
fun BUS_ISA(): Int = (16).toInt()

/**
 * {@snippet lang=c : #define BUS_I8042 17
 */
fun BUS_I8042(): Int = (17).toInt()

/**
 * {@snippet lang=c : #define BUS_XTKBD 18
 */
fun BUS_XTKBD(): Int = (18).toInt()

/**
 * {@snippet lang=c : #define BUS_RS232 19
 */
fun BUS_RS232(): Int = (19).toInt()

/**
 * {@snippet lang=c : #define BUS_GAMEPORT 20
 */
fun BUS_GAMEPORT(): Int = (20).toInt()

/**
 * {@snippet lang=c : #define BUS_PARPORT 21
 */
fun BUS_PARPORT(): Int = (21).toInt()

/**
 * {@snippet lang=c : #define BUS_AMIGA 22
 */
fun BUS_AMIGA(): Int = (22).toInt()

/**
 * {@snippet lang=c : #define BUS_ADB 23
 */
fun BUS_ADB(): Int = (23).toInt()

/**
 * {@snippet lang=c : #define BUS_I2C 24
 */
fun BUS_I2C(): Int = (24).toInt()

/**
 * {@snippet lang=c : #define BUS_HOST 25
 */
fun BUS_HOST(): Int = (25).toInt()

/**
 * {@snippet lang=c : #define BUS_GSC 26
 */
fun BUS_GSC(): Int = (26).toInt()

/**
 * {@snippet lang=c : #define BUS_ATARI 27
 */
fun BUS_ATARI(): Int = (27).toInt()

/**
 * {@snippet lang=c : #define BUS_SPI 28
 */
fun BUS_SPI(): Int = (28).toInt()

/**
 * {@snippet lang=c : #define BUS_RMI 29
 */
fun BUS_RMI(): Int = (29).toInt()

/**
 * {@snippet lang=c : #define BUS_CEC 30
 */
fun BUS_CEC(): Int = (30).toInt()

/**
 * {@snippet lang=c : #define BUS_INTEL_ISHTP 31
 */
fun BUS_INTEL_ISHTP(): Int = (31).toInt()

/**
 * {@snippet lang=c : #define BUS_AMD_SFH 32
 */
fun BUS_AMD_SFH(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define FF_STATUS_STOPPED 0
 */
fun FF_STATUS_STOPPED(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define FF_STATUS_PLAYING 1
 */
fun FF_STATUS_PLAYING(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define FF_STATUS_MAX 1
 */
fun FF_STATUS_MAX(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define FF_RUMBLE 80
 */
fun FF_RUMBLE(): Int = (80).toInt()

/**
 * {@snippet lang=c : #define FF_PERIODIC 81
 */
fun FF_PERIODIC(): Int = (81).toInt()

/**
 * {@snippet lang=c : #define FF_CONSTANT 82
 */
fun FF_CONSTANT(): Int = (82).toInt()

/**
 * {@snippet lang=c : #define FF_SPRING 83
 */
fun FF_SPRING(): Int = (83).toInt()

/**
 * {@snippet lang=c : #define FF_FRICTION 84
 */
fun FF_FRICTION(): Int = (84).toInt()

/**
 * {@snippet lang=c : #define FF_DAMPER 85
 */
fun FF_DAMPER(): Int = (85).toInt()

/**
 * {@snippet lang=c : #define FF_INERTIA 86
 */
fun FF_INERTIA(): Int = (86).toInt()

/**
 * {@snippet lang=c : #define FF_RAMP 87
 */
fun FF_RAMP(): Int = (87).toInt()

/**
 * {@snippet lang=c : #define FF_SQUARE 88
 */
fun FF_SQUARE(): Int = (88).toInt()

/**
 * {@snippet lang=c : #define FF_TRIANGLE 89
 */
fun FF_TRIANGLE(): Int = (89).toInt()

/**
 * {@snippet lang=c : #define FF_SINE 90
 */
fun FF_SINE(): Int = (90).toInt()

/**
 * {@snippet lang=c : #define FF_SAW_UP 91
 */
fun FF_SAW_UP(): Int = (91).toInt()

/**
 * {@snippet lang=c : #define FF_SAW_DOWN 92
 */
fun FF_SAW_DOWN(): Int = (92).toInt()

/**
 * {@snippet lang=c : #define FF_CUSTOM 93
 */
fun FF_CUSTOM(): Int = (93).toInt()

/**
 * {@snippet lang=c : #define FF_GAIN 96
 */
fun FF_GAIN(): Int = (96).toInt()

/**
 * {@snippet lang=c : #define FF_AUTOCENTER 97
 */
fun FF_AUTOCENTER(): Int = (97).toInt()

/**
 * {@snippet lang=c : #define FF_MAX 127
 */
fun FF_MAX(): Int = (127).toInt()

/**
 * {@snippet lang=c : #define EV_UINPUT 257
 */
fun EV_UINPUT(): Int = (257).toInt()

/**
 * {@snippet lang=c : #define UI_FF_UPLOAD 1
 */
fun UI_FF_UPLOAD(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define UI_FF_ERASE 2
 */
fun UI_FF_ERASE(): Int = (2).toInt()

/**
 * {@snippet lang=c : __errno_location (Int)*()
 */
private val _errno_location_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val _errno_location_ADDR: MemorySegment by lazy { LOOKUP.find("__errno_location").orElseThrow() }
private val _errno_location_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(_errno_location_ADDR, _errno_location_DESC) }

fun _errno_location(): MemorySegment {
    try {
        return _errno_location_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : typedef Int error_t;}
 */
typealias error_t = Int

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
 * {@snippet lang=c : typedef UNSIGNED = Long size_t;}
 */
typealias size_t = Long

/**
 * NS_ENUM: {@snippet lang=c : enum __pid_type}
 */
enum class _pid_type(val value: Long) {
    F_OWNER_TID(0L), F_OWNER_PID(1L), F_OWNER_PGRP(2L), F_OWNER_GID(2L);

    companion object {
        fun fromValue(v: Long): _pid_type = entries.firstOrNull { it.value == v }
            ?: error("Unknown _pid_type value: $v")
    }
}

/**
 * {@snippet lang=c : typedef UNSIGNED = Int mode_t;}
 */
typealias mode_t = Int

/**
 * {@snippet lang=c : typedef Long off_t;}
 */
typealias off_t = Long

/**
 * {@snippet lang=c : typedef Long off64_t;}
 */
typealias off64_t = Long

/**
 * {@snippet lang=c : typedef Int pid_t;}
 */
typealias pid_t = Int

/**
 * {@snippet lang=c : typedef Long time_t;}
 */
typealias time_t = Long

/**
 * {@snippet lang=c : fcntl Int(Int,Int)
 */
private val fcntl_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val fcntl_ADDR: MemorySegment by lazy { LOOKUP.find("fcntl").orElseThrow() }
private val fcntl_HANDLE: MethodHandle by lazy {
    Linker.nativeLinker().downcallHandle(
        fcntl_ADDR, fcntl_DESC,
        Linker.Option.firstVariadicArg(2),
    )
}

fun fcntl(arg0: Int, arg1: Int, arg2: MemorySegment): Int {
    try {
        return fcntl_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : open Int((Char)*,Int)
 */
private val open_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val open_ADDR: MemorySegment by lazy { LOOKUP.find("open").orElseThrow() }
private val open_HANDLE: MethodHandle by lazy {
    Linker.nativeLinker().downcallHandle(
        open_ADDR, open_DESC,
        Linker.Option.firstVariadicArg(2),
    )
}

fun open(arg0: MemorySegment, arg1: Int, arg2: MemorySegment): Int {
    try {
        return open_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : STRUCT timeval
 */
class timeval {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withByteAlignment(8).withName("tv_sec"),
            ValueLayout.JAVA_LONG.withByteAlignment(8).withName("tv_usec")
        ).withByteAlignment(8L).withName("timeval")

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

    val tv_sec_VH: VarHandle = layout.varHandle(groupElement("tv_sec"))

    @Suppress("UNCHECKED_CAST")
    fun tv_sec(segment: MemorySegment): Long =
        tv_sec_VH.get(segment, 0L) as Long

    fun tv_sec(segment: MemorySegment, value: Long) =
        tv_sec_VH.set(segment, 0L, value)

    val tv_usec_VH: VarHandle = layout.varHandle(groupElement("tv_usec"))

    @Suppress("UNCHECKED_CAST")
    fun tv_usec(segment: MemorySegment): Long =
        tv_usec_VH.get(segment, 0L) as Long

    fun tv_usec(segment: MemorySegment, value: Long) =
        tv_usec_VH.set(segment, 0L, value)
} // End class

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
 * NS_ENUM: {@snippet lang=c : enum __itimer_which}
 */
enum class _itimer_which(val value: Long) {
    ITIMER_REAL(0L), ITIMER_VIRTUAL(1L), ITIMER_PROF(2L);

    companion object {
        fun fromValue(v: Long): _itimer_which = entries.firstOrNull { it.value == v }
            ?: error("Unknown _itimer_which value: $v")
    }
}

/**
 * {@snippet lang=c : ioctl Int(Int,UNSIGNED = Long)
 */
private val ioctl_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val ioctl_ADDR: MemorySegment by lazy { LOOKUP.find("ioctl").orElseThrow() }
private val ioctl_HANDLE: MethodHandle by lazy {
    Linker.nativeLinker().downcallHandle(
        ioctl_ADDR, ioctl_DESC,
        Linker.Option.firstVariadicArg(2),
    )
}

fun ioctl(arg0: Int, arg1: Long, arg2: MemorySegment): Int {
    try {
        return ioctl_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

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
 * {@snippet lang=c : typedef UNSIGNED = Int gid_t;}
 */
typealias gid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long nlink_t;}
 */
typealias nlink_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int uid_t;}
 */
typealias uid_t = Int

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
 * {@snippet lang=c : typedef UNSIGNED = Int useconds_t;}
 */
typealias useconds_t = Int

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
 * {@snippet lang=c : typedef SIGNED = Char __s8;}
 */
typealias _s8 = Byte

/**
 * {@snippet lang=c : typedef UNSIGNED = Char __u8;}
 */
typealias _u8 = Byte

/**
 * {@snippet lang=c : typedef Short __s16;}
 */
typealias _s16 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __u16;}
 */
typealias _u16 = Short

/**
 * {@snippet lang=c : typedef Int __s32;}
 */
typealias _s32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __u32;}
 */
typealias _u32 = Int

/**
 * {@snippet lang=c : typedef LongLong __s64;}
 */
typealias _s64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong __u64;}
 */
typealias _u64 = Long

/**
 * {@snippet lang=c : typedef Int __kernel_key_t;}
 */
typealias _kernel_key_t = Int

/**
 * {@snippet lang=c : typedef Int __kernel_mqd_t;}
 */
typealias _kernel_mqd_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __kernel_old_uid_t;}
 */
typealias _kernel_old_uid_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __kernel_old_gid_t;}
 */
typealias _kernel_old_gid_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __kernel_old_dev_t;}
 */
typealias _kernel_old_dev_t = Long

/**
 * {@snippet lang=c : typedef Long __kernel_long_t;}
 */
typealias _kernel_long_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __kernel_ulong_t;}
 */
typealias _kernel_ulong_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __kernel_ino_t;}
 */
typealias _kernel_ino_t = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __kernel_mode_t;}
 */
typealias _kernel_mode_t = Int

/**
 * {@snippet lang=c : typedef Int __kernel_pid_t;}
 */
typealias _kernel_pid_t = Int

/**
 * {@snippet lang=c : typedef Int __kernel_ipc_pid_t;}
 */
typealias _kernel_ipc_pid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __kernel_uid_t;}
 */
typealias _kernel_uid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __kernel_gid_t;}
 */
typealias _kernel_gid_t = Int

/**
 * {@snippet lang=c : typedef Long __kernel_suseconds_t;}
 */
typealias _kernel_suseconds_t = Long

/**
 * {@snippet lang=c : typedef Int __kernel_daddr_t;}
 */
typealias _kernel_daddr_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __kernel_uid32_t;}
 */
typealias _kernel_uid32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __kernel_gid32_t;}
 */
typealias _kernel_gid32_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Long __kernel_size_t;}
 */
typealias _kernel_size_t = Long

/**
 * {@snippet lang=c : typedef Long __kernel_ssize_t;}
 */
typealias _kernel_ssize_t = Long

/**
 * {@snippet lang=c : typedef Long __kernel_ptrdiff_t;}
 */
typealias _kernel_ptrdiff_t = Long

/**
 * {@snippet lang=c : typedef Long __kernel_off_t;}
 */
typealias _kernel_off_t = Long

/**
 * {@snippet lang=c : typedef LongLong __kernel_loff_t;}
 */
typealias _kernel_loff_t = Long

/**
 * {@snippet lang=c : typedef Long __kernel_old_time_t;}
 */
typealias _kernel_old_time_t = Long

/**
 * {@snippet lang=c : typedef Long __kernel_time_t;}
 */
typealias _kernel_time_t = Long

/**
 * {@snippet lang=c : typedef LongLong __kernel_time64_t;}
 */
typealias _kernel_time64_t = Long

/**
 * {@snippet lang=c : typedef Long __kernel_clock_t;}
 */
typealias _kernel_clock_t = Long

/**
 * {@snippet lang=c : typedef Int __kernel_timer_t;}
 */
typealias _kernel_timer_t = Int

/**
 * {@snippet lang=c : typedef Int __kernel_clockid_t;}
 */
typealias _kernel_clockid_t = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __kernel_uid16_t;}
 */
typealias _kernel_uid16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __kernel_gid16_t;}
 */
typealias _kernel_gid16_t = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __le16;}
 */
typealias _le16 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __be16;}
 */
typealias _be16 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __le32;}
 */
typealias _le32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __be32;}
 */
typealias _be32 = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong __le64;}
 */
typealias _le64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = LongLong __be64;}
 */
typealias _be64 = Long

/**
 * {@snippet lang=c : typedef UNSIGNED = Short __sum16;}
 */
typealias _sum16 = Short

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __wsum;}
 */
typealias _wsum = Int

/**
 * {@snippet lang=c : typedef UNSIGNED = Int __poll_t;}
 */
typealias _poll_t = Int

/**
 * {@snippet lang=c : STRUCT input_event
 */
class input_event {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            timeval.layout.withByteAlignment(8).withName("time"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("type"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("code"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("value")
        ).withByteAlignment(8L).withName("input_event")

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

    fun time(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("time")), layout.select(groupElement("time")).byteSize())

    val type_VH: VarHandle = layout.varHandle(groupElement("type"))

    @Suppress("UNCHECKED_CAST")
    fun type(segment: MemorySegment): Short =
        type_VH.get(segment, 0L) as Short

    fun type(segment: MemorySegment, value: Short) =
        type_VH.set(segment, 0L, value)

    val code_VH: VarHandle = layout.varHandle(groupElement("code"))

    @Suppress("UNCHECKED_CAST")
    fun code(segment: MemorySegment): Short =
        code_VH.get(segment, 0L) as Short

    fun code(segment: MemorySegment, value: Short) =
        code_VH.set(segment, 0L, value)

    val value_VH: VarHandle = layout.varHandle(groupElement("value"))

    @Suppress("UNCHECKED_CAST")
    fun value(segment: MemorySegment): Int =
        value_VH.get(segment, 0L) as Int

    fun value(segment: MemorySegment, value: Int) =
        value_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT input_id
 */
class input_id {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("bustype"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("vendor"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("product"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("version")
        ).withByteAlignment(2L).withName("input_id")

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

    val bustype_VH: VarHandle = layout.varHandle(groupElement("bustype"))

    @Suppress("UNCHECKED_CAST")
    fun bustype(segment: MemorySegment): Short =
        bustype_VH.get(segment, 0L) as Short

    fun bustype(segment: MemorySegment, value: Short) =
        bustype_VH.set(segment, 0L, value)

    val vendor_VH: VarHandle = layout.varHandle(groupElement("vendor"))

    @Suppress("UNCHECKED_CAST")
    fun vendor(segment: MemorySegment): Short =
        vendor_VH.get(segment, 0L) as Short

    fun vendor(segment: MemorySegment, value: Short) =
        vendor_VH.set(segment, 0L, value)

    val product_VH: VarHandle = layout.varHandle(groupElement("product"))

    @Suppress("UNCHECKED_CAST")
    fun product(segment: MemorySegment): Short =
        product_VH.get(segment, 0L) as Short

    fun product(segment: MemorySegment, value: Short) =
        product_VH.set(segment, 0L, value)

    val version_VH: VarHandle = layout.varHandle(groupElement("version"))

    @Suppress("UNCHECKED_CAST")
    fun version(segment: MemorySegment): Short =
        version_VH.get(segment, 0L) as Short

    fun version(segment: MemorySegment, value: Short) =
        version_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT input_absinfo
 */
class input_absinfo {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("value"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("minimum"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("maximum"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("fuzz"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("flat"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("resolution")
        ).withByteAlignment(4L).withName("input_absinfo")

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

    val value_VH: VarHandle = layout.varHandle(groupElement("value"))

    @Suppress("UNCHECKED_CAST")
    fun value(segment: MemorySegment): Int =
        value_VH.get(segment, 0L) as Int

    fun value(segment: MemorySegment, value: Int) =
        value_VH.set(segment, 0L, value)

    val minimum_VH: VarHandle = layout.varHandle(groupElement("minimum"))

    @Suppress("UNCHECKED_CAST")
    fun minimum(segment: MemorySegment): Int =
        minimum_VH.get(segment, 0L) as Int

    fun minimum(segment: MemorySegment, value: Int) =
        minimum_VH.set(segment, 0L, value)

    val maximum_VH: VarHandle = layout.varHandle(groupElement("maximum"))

    @Suppress("UNCHECKED_CAST")
    fun maximum(segment: MemorySegment): Int =
        maximum_VH.get(segment, 0L) as Int

    fun maximum(segment: MemorySegment, value: Int) =
        maximum_VH.set(segment, 0L, value)

    val fuzz_VH: VarHandle = layout.varHandle(groupElement("fuzz"))

    @Suppress("UNCHECKED_CAST")
    fun fuzz(segment: MemorySegment): Int =
        fuzz_VH.get(segment, 0L) as Int

    fun fuzz(segment: MemorySegment, value: Int) =
        fuzz_VH.set(segment, 0L, value)

    val flat_VH: VarHandle = layout.varHandle(groupElement("flat"))

    @Suppress("UNCHECKED_CAST")
    fun flat(segment: MemorySegment): Int =
        flat_VH.get(segment, 0L) as Int

    fun flat(segment: MemorySegment, value: Int) =
        flat_VH.set(segment, 0L, value)

    val resolution_VH: VarHandle = layout.varHandle(groupElement("resolution"))

    @Suppress("UNCHECKED_CAST")
    fun resolution(segment: MemorySegment): Int =
        resolution_VH.get(segment, 0L) as Int

    fun resolution(segment: MemorySegment, value: Int) =
        resolution_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT ff_replay
 */
class ff_replay {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("length"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("delay")
        ).withByteAlignment(2L).withName("ff_replay")

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

    val delay_VH: VarHandle = layout.varHandle(groupElement("delay"))

    @Suppress("UNCHECKED_CAST")
    fun delay(segment: MemorySegment): Short =
        delay_VH.get(segment, 0L) as Short

    fun delay(segment: MemorySegment, value: Short) =
        delay_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT ff_trigger
 */
class ff_trigger {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("button"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("interval")
        ).withByteAlignment(2L).withName("ff_trigger")

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

    val button_VH: VarHandle = layout.varHandle(groupElement("button"))

    @Suppress("UNCHECKED_CAST")
    fun button(segment: MemorySegment): Short =
        button_VH.get(segment, 0L) as Short

    fun button(segment: MemorySegment, value: Short) =
        button_VH.set(segment, 0L, value)

    val interval_VH: VarHandle = layout.varHandle(groupElement("interval"))

    @Suppress("UNCHECKED_CAST")
    fun interval(segment: MemorySegment): Short =
        interval_VH.get(segment, 0L) as Short

    fun interval(segment: MemorySegment, value: Short) =
        interval_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT ff_rumble_effect
 */
class ff_rumble_effect {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("strong_magnitude"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("weak_magnitude")
        ).withByteAlignment(2L).withName("ff_rumble_effect")

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

    val strong_magnitude_VH: VarHandle = layout.varHandle(groupElement("strong_magnitude"))

    @Suppress("UNCHECKED_CAST")
    fun strong_magnitude(segment: MemorySegment): Short =
        strong_magnitude_VH.get(segment, 0L) as Short

    fun strong_magnitude(segment: MemorySegment, value: Short) =
        strong_magnitude_VH.set(segment, 0L, value)

    val weak_magnitude_VH: VarHandle = layout.varHandle(groupElement("weak_magnitude"))

    @Suppress("UNCHECKED_CAST")
    fun weak_magnitude(segment: MemorySegment): Short =
        weak_magnitude_VH.get(segment, 0L) as Short

    fun weak_magnitude(segment: MemorySegment, value: Short) =
        weak_magnitude_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT uinput_ff_erase
 */
class uinput_ff_erase {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("request_id"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("retval"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("effect_id")
        ).withByteAlignment(4L).withName("uinput_ff_erase")

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

    val request_id_VH: VarHandle = layout.varHandle(groupElement("request_id"))

    @Suppress("UNCHECKED_CAST")
    fun request_id(segment: MemorySegment): Int =
        request_id_VH.get(segment, 0L) as Int

    fun request_id(segment: MemorySegment, value: Int) =
        request_id_VH.set(segment, 0L, value)

    val retval_VH: VarHandle = layout.varHandle(groupElement("retval"))

    @Suppress("UNCHECKED_CAST")
    fun retval(segment: MemorySegment): Int =
        retval_VH.get(segment, 0L) as Int

    fun retval(segment: MemorySegment, value: Int) =
        retval_VH.set(segment, 0L, value)

    val effect_id_VH: VarHandle = layout.varHandle(groupElement("effect_id"))

    @Suppress("UNCHECKED_CAST")
    fun effect_id(segment: MemorySegment): Int =
        effect_id_VH.get(segment, 0L) as Int

    fun effect_id(segment: MemorySegment, value: Int) =
        effect_id_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT uinput_setup
 */
class uinput_setup {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            input_id.layout.withByteAlignment(2).withName("id"),
            MemoryLayout.sequenceLayout(80, ValueLayout.JAVA_BYTE.withByteAlignment(1)).withByteAlignment(1).withName("name"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("ff_effects_max")
        ).withByteAlignment(4L).withName("uinput_setup")

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

    fun id(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("id")), layout.select(groupElement("id")).byteSize())

    fun name(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("name")), layout.select(groupElement("name")).byteSize())

    val ff_effects_max_VH: VarHandle = layout.varHandle(groupElement("ff_effects_max"))

    @Suppress("UNCHECKED_CAST")
    fun ff_effects_max(segment: MemorySegment): Int =
        ff_effects_max_VH.get(segment, 0L) as Int

    fun ff_effects_max(segment: MemorySegment, value: Int) =
        ff_effects_max_VH.set(segment, 0L, value)
} // End class

/**
 * {@snippet lang=c : STRUCT uinput_abs_setup
 */
class uinput_abs_setup {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("code"),
            MemoryLayout.paddingLayout(2L),
            input_absinfo.layout.withByteAlignment(4).withName("absinfo")
        ).withByteAlignment(4L).withName("uinput_abs_setup")

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

    val code_VH: VarHandle = layout.varHandle(groupElement("code"))

    @Suppress("UNCHECKED_CAST")
    fun code(segment: MemorySegment): Short =
        code_VH.get(segment, 0L) as Short

    fun code(segment: MemorySegment, value: Short) =
        code_VH.set(segment, 0L, value)

    fun absinfo(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("absinfo")), layout.select(groupElement("absinfo")).byteSize())
} // End class

/**
 * {@snippet lang=c : udev_ref (Declared(udev))*((Declared(udev))*)
 */
private val udev_ref_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_ref_ADDR: MemorySegment by lazy { LOOKUP.find("udev_ref").orElseThrow() }
private val udev_ref_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_ref_ADDR, udev_ref_DESC) }

fun udev_ref(arg0: MemorySegment): MemorySegment {
    try {
        return udev_ref_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_unref (Declared(udev))*((Declared(udev))*)
 */
private val udev_unref_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_unref_ADDR: MemorySegment by lazy { LOOKUP.find("udev_unref").orElseThrow() }
private val udev_unref_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_unref_ADDR, udev_unref_DESC) }

fun udev_unref(arg0: MemorySegment): MemorySegment {
    try {
        return udev_unref_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_new (Declared(udev))*()
 */
private val udev_new_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val udev_new_ADDR: MemorySegment by lazy { LOOKUP.find("udev_new").orElseThrow() }
private val udev_new_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_new_ADDR, udev_new_DESC) }

fun udev_new(): MemorySegment {
    try {
        return udev_new_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_list_entry_get_next (Declared(udev_list_entry))*((Declared(udev_list_entry))*)
 */
private val udev_list_entry_get_next_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_list_entry_get_next_ADDR: MemorySegment by lazy { LOOKUP.find("udev_list_entry_get_next").orElseThrow() }
private val udev_list_entry_get_next_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_list_entry_get_next_ADDR, udev_list_entry_get_next_DESC) }

fun udev_list_entry_get_next(arg0: MemorySegment): MemorySegment {
    try {
        return udev_list_entry_get_next_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_list_entry_get_name (Char)*((Declared(udev_list_entry))*)
 */
private val udev_list_entry_get_name_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_list_entry_get_name_ADDR: MemorySegment by lazy { LOOKUP.find("udev_list_entry_get_name").orElseThrow() }
private val udev_list_entry_get_name_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_list_entry_get_name_ADDR, udev_list_entry_get_name_DESC) }

fun udev_list_entry_get_name(arg0: MemorySegment): MemorySegment {
    try {
        return udev_list_entry_get_name_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_list_entry_get_value (Char)*((Declared(udev_list_entry))*)
 */
private val udev_list_entry_get_value_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_list_entry_get_value_ADDR: MemorySegment by lazy { LOOKUP.find("udev_list_entry_get_value").orElseThrow() }
private val udev_list_entry_get_value_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_list_entry_get_value_ADDR, udev_list_entry_get_value_DESC) }

fun udev_list_entry_get_value(arg0: MemorySegment): MemorySegment {
    try {
        return udev_list_entry_get_value_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_device_ref (Declared(udev_device))*((Declared(udev_device))*)
 */
private val udev_device_ref_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_device_ref_ADDR: MemorySegment by lazy { LOOKUP.find("udev_device_ref").orElseThrow() }
private val udev_device_ref_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_device_ref_ADDR, udev_device_ref_DESC) }

fun udev_device_ref(arg0: MemorySegment): MemorySegment {
    try {
        return udev_device_ref_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_device_unref (Declared(udev_device))*((Declared(udev_device))*)
 */
private val udev_device_unref_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_device_unref_ADDR: MemorySegment by lazy { LOOKUP.find("udev_device_unref").orElseThrow() }
private val udev_device_unref_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_device_unref_ADDR, udev_device_unref_DESC) }

fun udev_device_unref(arg0: MemorySegment): MemorySegment {
    try {
        return udev_device_unref_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_device_new_from_syspath (Declared(udev_device))*((Declared(udev))*,(Char)*)
 */
private val udev_device_new_from_syspath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_device_new_from_syspath_ADDR: MemorySegment by lazy { LOOKUP.find("udev_device_new_from_syspath").orElseThrow() }
private val udev_device_new_from_syspath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_device_new_from_syspath_ADDR, udev_device_new_from_syspath_DESC) }

fun udev_device_new_from_syspath(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return udev_device_new_from_syspath_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_device_get_devnode (Char)*((Declared(udev_device))*)
 */
private val udev_device_get_devnode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_device_get_devnode_ADDR: MemorySegment by lazy { LOOKUP.find("udev_device_get_devnode").orElseThrow() }
private val udev_device_get_devnode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_device_get_devnode_ADDR, udev_device_get_devnode_DESC) }

fun udev_device_get_devnode(arg0: MemorySegment): MemorySegment {
    try {
        return udev_device_get_devnode_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_device_get_action (Char)*((Declared(udev_device))*)
 */
private val udev_device_get_action_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_device_get_action_ADDR: MemorySegment by lazy { LOOKUP.find("udev_device_get_action").orElseThrow() }
private val udev_device_get_action_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_device_get_action_ADDR, udev_device_get_action_DESC) }

fun udev_device_get_action(arg0: MemorySegment): MemorySegment {
    try {
        return udev_device_get_action_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_device_get_sysattr_value (Char)*((Declared(udev_device))*,(Char)*)
 */
private val udev_device_get_sysattr_value_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_device_get_sysattr_value_ADDR: MemorySegment by lazy { LOOKUP.find("udev_device_get_sysattr_value").orElseThrow() }
private val udev_device_get_sysattr_value_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_device_get_sysattr_value_ADDR, udev_device_get_sysattr_value_DESC) }

fun udev_device_get_sysattr_value(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return udev_device_get_sysattr_value_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_monitor_ref (Declared(udev_monitor))*((Declared(udev_monitor))*)
 */
private val udev_monitor_ref_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_monitor_ref_ADDR: MemorySegment by lazy { LOOKUP.find("udev_monitor_ref").orElseThrow() }
private val udev_monitor_ref_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_monitor_ref_ADDR, udev_monitor_ref_DESC) }

fun udev_monitor_ref(arg0: MemorySegment): MemorySegment {
    try {
        return udev_monitor_ref_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_monitor_unref (Declared(udev_monitor))*((Declared(udev_monitor))*)
 */
private val udev_monitor_unref_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_monitor_unref_ADDR: MemorySegment by lazy { LOOKUP.find("udev_monitor_unref").orElseThrow() }
private val udev_monitor_unref_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_monitor_unref_ADDR, udev_monitor_unref_DESC) }

fun udev_monitor_unref(arg0: MemorySegment): MemorySegment {
    try {
        return udev_monitor_unref_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_monitor_new_from_netlink (Declared(udev_monitor))*((Declared(udev))*,(Char)*)
 */
private val udev_monitor_new_from_netlink_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_monitor_new_from_netlink_ADDR: MemorySegment by lazy { LOOKUP.find("udev_monitor_new_from_netlink").orElseThrow() }
private val udev_monitor_new_from_netlink_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_monitor_new_from_netlink_ADDR, udev_monitor_new_from_netlink_DESC) }

fun udev_monitor_new_from_netlink(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return udev_monitor_new_from_netlink_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_monitor_enable_receiving Int((Declared(udev_monitor))*)
 */
private val udev_monitor_enable_receiving_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val udev_monitor_enable_receiving_ADDR: MemorySegment by lazy { LOOKUP.find("udev_monitor_enable_receiving").orElseThrow() }
private val udev_monitor_enable_receiving_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_monitor_enable_receiving_ADDR, udev_monitor_enable_receiving_DESC) }

fun udev_monitor_enable_receiving(arg0: MemorySegment): Int {
    try {
        return udev_monitor_enable_receiving_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_monitor_get_fd Int((Declared(udev_monitor))*)
 */
private val udev_monitor_get_fd_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val udev_monitor_get_fd_ADDR: MemorySegment by lazy { LOOKUP.find("udev_monitor_get_fd").orElseThrow() }
private val udev_monitor_get_fd_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_monitor_get_fd_ADDR, udev_monitor_get_fd_DESC) }

fun udev_monitor_get_fd(arg0: MemorySegment): Int {
    try {
        return udev_monitor_get_fd_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_monitor_receive_device (Declared(udev_device))*((Declared(udev_monitor))*)
 */
private val udev_monitor_receive_device_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_monitor_receive_device_ADDR: MemorySegment by lazy { LOOKUP.find("udev_monitor_receive_device").orElseThrow() }
private val udev_monitor_receive_device_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_monitor_receive_device_ADDR, udev_monitor_receive_device_DESC) }

fun udev_monitor_receive_device(arg0: MemorySegment): MemorySegment {
    try {
        return udev_monitor_receive_device_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_monitor_filter_add_match_subsystem_devtype Int((Declared(udev_monitor))*,(Char)*,(Char)*)
 */
private val udev_monitor_filter_add_match_subsystem_devtype_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_monitor_filter_add_match_subsystem_devtype_ADDR: MemorySegment by lazy { LOOKUP.find("udev_monitor_filter_add_match_subsystem_devtype").orElseThrow() }
private val udev_monitor_filter_add_match_subsystem_devtype_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_monitor_filter_add_match_subsystem_devtype_ADDR, udev_monitor_filter_add_match_subsystem_devtype_DESC) }

fun udev_monitor_filter_add_match_subsystem_devtype(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Int {
    try {
        return udev_monitor_filter_add_match_subsystem_devtype_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_enumerate_ref (Declared(udev_enumerate))*((Declared(udev_enumerate))*)
 */
private val udev_enumerate_ref_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_enumerate_ref_ADDR: MemorySegment by lazy { LOOKUP.find("udev_enumerate_ref").orElseThrow() }
private val udev_enumerate_ref_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_enumerate_ref_ADDR, udev_enumerate_ref_DESC) }

fun udev_enumerate_ref(arg0: MemorySegment): MemorySegment {
    try {
        return udev_enumerate_ref_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_enumerate_unref (Declared(udev_enumerate))*((Declared(udev_enumerate))*)
 */
private val udev_enumerate_unref_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_enumerate_unref_ADDR: MemorySegment by lazy { LOOKUP.find("udev_enumerate_unref").orElseThrow() }
private val udev_enumerate_unref_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_enumerate_unref_ADDR, udev_enumerate_unref_DESC) }

fun udev_enumerate_unref(arg0: MemorySegment): MemorySegment {
    try {
        return udev_enumerate_unref_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_enumerate_new (Declared(udev_enumerate))*((Declared(udev))*)
 */
private val udev_enumerate_new_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_enumerate_new_ADDR: MemorySegment by lazy { LOOKUP.find("udev_enumerate_new").orElseThrow() }
private val udev_enumerate_new_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_enumerate_new_ADDR, udev_enumerate_new_DESC) }

fun udev_enumerate_new(arg0: MemorySegment): MemorySegment {
    try {
        return udev_enumerate_new_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_enumerate_add_match_subsystem Int((Declared(udev_enumerate))*,(Char)*)
 */
private val udev_enumerate_add_match_subsystem_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_enumerate_add_match_subsystem_ADDR: MemorySegment by lazy { LOOKUP.find("udev_enumerate_add_match_subsystem").orElseThrow() }
private val udev_enumerate_add_match_subsystem_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_enumerate_add_match_subsystem_ADDR, udev_enumerate_add_match_subsystem_DESC) }

fun udev_enumerate_add_match_subsystem(arg0: MemorySegment, arg1: MemorySegment): Int {
    try {
        return udev_enumerate_add_match_subsystem_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_enumerate_add_match_sysattr Int((Declared(udev_enumerate))*,(Char)*,(Char)*)
 */
private val udev_enumerate_add_match_sysattr_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_enumerate_add_match_sysattr_ADDR: MemorySegment by lazy { LOOKUP.find("udev_enumerate_add_match_sysattr").orElseThrow() }
private val udev_enumerate_add_match_sysattr_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_enumerate_add_match_sysattr_ADDR, udev_enumerate_add_match_sysattr_DESC) }

fun udev_enumerate_add_match_sysattr(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Int {
    try {
        return udev_enumerate_add_match_sysattr_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_enumerate_scan_devices Int((Declared(udev_enumerate))*)
 */
private val udev_enumerate_scan_devices_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val udev_enumerate_scan_devices_ADDR: MemorySegment by lazy { LOOKUP.find("udev_enumerate_scan_devices").orElseThrow() }
private val udev_enumerate_scan_devices_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_enumerate_scan_devices_ADDR, udev_enumerate_scan_devices_DESC) }

fun udev_enumerate_scan_devices(arg0: MemorySegment): Int {
    try {
        return udev_enumerate_scan_devices_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : udev_enumerate_get_list_entry (Declared(udev_list_entry))*((Declared(udev_enumerate))*)
 */
private val udev_enumerate_get_list_entry_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val udev_enumerate_get_list_entry_ADDR: MemorySegment by lazy { LOOKUP.find("udev_enumerate_get_list_entry").orElseThrow() }
private val udev_enumerate_get_list_entry_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(udev_enumerate_get_list_entry_ADDR, udev_enumerate_get_list_entry_DESC) }

fun udev_enumerate_get_list_entry(arg0: MemorySegment): MemorySegment {
    try {
        return udev_enumerate_get_list_entry_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

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
 * {@snippet lang=c : typedef UNSIGNED = Int socklen_t;}
 */
typealias socklen_t = Int

/**
 * {@snippet lang=c : close Int(Int)
 */
private val close_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val close_ADDR: MemorySegment by lazy { LOOKUP.find("close").orElseThrow() }
private val close_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(close_ADDR, close_DESC) }

fun close(arg0: Int): Int {
    try {
        return close_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : read Long(Int,(Void)*,UNSIGNED = Long)
 */
private val read_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val read_ADDR: MemorySegment by lazy { LOOKUP.find("read").orElseThrow() }
private val read_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(read_ADDR, read_DESC) }

fun read(arg0: Int, arg1: MemorySegment, arg2: Long): Long {
    try {
        return read_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : write Long(Int,(Void)*,UNSIGNED = Long)
 */
private val write_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val write_ADDR: MemorySegment by lazy { LOOKUP.find("write").orElseThrow() }
private val write_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(write_ADDR, write_DESC) }

fun write(arg0: Int, arg1: MemorySegment, arg2: Long): Long {
    try {
        return write_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

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
 * {@snippet lang=c : STRUCT KffiFfEffectStorage
 */
class KffiFfEffectStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("type"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("id"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("direction"),
            ff_replay.layout.withByteAlignment(2).withName("replay"),
            ff_trigger.layout.withByteAlignment(2).withName("trigger"),
            MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_BYTE.withByteAlignment(1)).withByteAlignment(1).withName("pad_before_union"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("rumble_strong_magnitude"),
            ValueLayout.JAVA_SHORT.withByteAlignment(2).withName("rumble_weak_magnitude"),
            MemoryLayout.sequenceLayout(28, ValueLayout.JAVA_BYTE.withByteAlignment(1)).withByteAlignment(1).withName("union_tail")
        ).withByteAlignment(2L).withName("KffiFfEffectStorage")

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
    fun type(segment: MemorySegment): Short =
        type_VH.get(segment, 0L) as Short

    fun type(segment: MemorySegment, value: Short) =
        type_VH.set(segment, 0L, value)

    val id_VH: VarHandle = layout.varHandle(groupElement("id"))

    @Suppress("UNCHECKED_CAST")
    fun id(segment: MemorySegment): Short =
        id_VH.get(segment, 0L) as Short

    fun id(segment: MemorySegment, value: Short) =
        id_VH.set(segment, 0L, value)

    val direction_VH: VarHandle = layout.varHandle(groupElement("direction"))

    @Suppress("UNCHECKED_CAST")
    fun direction(segment: MemorySegment): Short =
        direction_VH.get(segment, 0L) as Short

    fun direction(segment: MemorySegment, value: Short) =
        direction_VH.set(segment, 0L, value)

    fun replay(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("replay")), layout.select(groupElement("replay")).byteSize())

    fun trigger(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("trigger")), layout.select(groupElement("trigger")).byteSize())

    fun pad_before_union(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("pad_before_union")), layout.select(groupElement("pad_before_union")).byteSize())

    val rumble_strong_magnitude_VH: VarHandle = layout.varHandle(groupElement("rumble_strong_magnitude"))

    @Suppress("UNCHECKED_CAST")
    fun rumble_strong_magnitude(segment: MemorySegment): Short =
        rumble_strong_magnitude_VH.get(segment, 0L) as Short

    fun rumble_strong_magnitude(segment: MemorySegment, value: Short) =
        rumble_strong_magnitude_VH.set(segment, 0L, value)

    val rumble_weak_magnitude_VH: VarHandle = layout.varHandle(groupElement("rumble_weak_magnitude"))

    @Suppress("UNCHECKED_CAST")
    fun rumble_weak_magnitude(segment: MemorySegment): Short =
        rumble_weak_magnitude_VH.get(segment, 0L) as Short

    fun rumble_weak_magnitude(segment: MemorySegment, value: Short) =
        rumble_weak_magnitude_VH.set(segment, 0L, value)

    fun union_tail(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("union_tail")), layout.select(groupElement("union_tail")).byteSize())
} // End class

/**
 * {@snippet lang=c : STRUCT KffiFfUploadStorage
 */
class KffiFfUploadStorage {
    companion object {
        val layout: GroupLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("request_id"),
            ValueLayout.JAVA_INT.withByteAlignment(4).withName("retval"),
            KffiFfEffectStorage.layout.withByteAlignment(2).withName("effect"),
            KffiFfEffectStorage.layout.withByteAlignment(2).withName("old")
        ).withByteAlignment(4L).withName("KffiFfUploadStorage")

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

    val request_id_VH: VarHandle = layout.varHandle(groupElement("request_id"))

    @Suppress("UNCHECKED_CAST")
    fun request_id(segment: MemorySegment): Int =
        request_id_VH.get(segment, 0L) as Int

    fun request_id(segment: MemorySegment, value: Int) =
        request_id_VH.set(segment, 0L, value)

    val retval_VH: VarHandle = layout.varHandle(groupElement("retval"))

    @Suppress("UNCHECKED_CAST")
    fun retval(segment: MemorySegment): Int =
        retval_VH.get(segment, 0L) as Int

    fun retval(segment: MemorySegment, value: Int) =
        retval_VH.set(segment, 0L, value)

    fun effect(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("effect")), layout.select(groupElement("effect")).byteSize())

    fun old(segment: MemorySegment): MemorySegment =
        segment.asSlice(layout.byteOffset(groupElement("old")), layout.select(groupElement("old")).byteSize())
} // End class

/**
 * {@snippet lang=c : #define _IOC_NRMASK 255
 */
fun _IOC_NRMASK(): Int = (255).toInt()

/**
 * {@snippet lang=c : #define _IOC_TYPEMASK 255
 */
fun _IOC_TYPEMASK(): Int = (255).toInt()

/**
 * {@snippet lang=c : #define _IOC_SIZEMASK 16383
 */
fun _IOC_SIZEMASK(): Int = (16383).toInt()

/**
 * {@snippet lang=c : #define _IOC_DIRMASK 3
 */
fun _IOC_DIRMASK(): Int = (3).toInt()

/**
 * {@snippet lang=c : #define _IOC_TYPESHIFT 8
 */
fun _IOC_TYPESHIFT(): Int = (8).toInt()

/**
 * {@snippet lang=c : #define _IOC_SIZESHIFT 16
 */
fun _IOC_SIZESHIFT(): Int = (16).toInt()

/**
 * {@snippet lang=c : #define _IOC_DIRSHIFT 30
 */
fun _IOC_DIRSHIFT(): Int = (30).toInt()

/**
 * {@snippet lang=c : #define _IOC_NONE 0
 */
fun _IOC_NONE(): Int = (0).toInt()

/**
 * {@snippet lang=c : #define _IOC_WRITE 1
 */
fun _IOC_WRITE(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define _IOC_READ 2
 */
fun _IOC_READ(): Int = (2).toInt()

/**
 * {@snippet lang=c : #define O_CLOEXEC 524288
 */
fun O_CLOEXEC(): Int = (524288).toInt()

/**
 * {@snippet lang=c : #define EV_CNT 32
 */
fun EV_CNT(): Int = (32).toInt()

/**
 * {@snippet lang=c : #define SYN_CNT 16
 */
fun SYN_CNT(): Int = (16).toInt()

/**
 * {@snippet lang=c : #define BTN_A 304
 */
fun BTN_A(): Int = (304).toInt()

/**
 * {@snippet lang=c : #define BTN_B 305
 */
fun BTN_B(): Int = (305).toInt()

/**
 * {@snippet lang=c : #define BTN_X 307
 */
fun BTN_X(): Int = (307).toInt()

/**
 * {@snippet lang=c : #define BTN_Y 308
 */
fun BTN_Y(): Int = (308).toInt()

/**
 * {@snippet lang=c : #define ABS_CNT 64
 */
fun ABS_CNT(): Int = (64).toInt()

/**
 * {@snippet lang=c : #define EVIOCGVERSION 2147763457
 */
fun EVIOCGVERSION(): Long = 2147763457

/**
 * {@snippet lang=c : #define EVIOCGID 2148025602
 */
fun EVIOCGID(): Long = 2148025602

/**
 * {@snippet lang=c : #define EVIOCGREP 2148025603
 */
fun EVIOCGREP(): Long = 2148025603

/**
 * {@snippet lang=c : #define EVIOCSREP 1074283779
 */
fun EVIOCSREP(): Long = 1074283779

/**
 * {@snippet lang=c : #define EVIOCGKEYCODE 2148025604
 */
fun EVIOCGKEYCODE(): Long = 2148025604

/**
 * {@snippet lang=c : #define EVIOCSKEYCODE 1074283780
 */
fun EVIOCSKEYCODE(): Long = 1074283780

/**
 * {@snippet lang=c : #define EVIOCSFF 1076905344
 */
fun EVIOCSFF(): Long = 1076905344

/**
 * {@snippet lang=c : #define EVIOCRMFF 1074021761
 */
fun EVIOCRMFF(): Long = 1074021761

/**
 * {@snippet lang=c : #define EVIOCGEFFECTS 2147763588
 */
fun EVIOCGEFFECTS(): Long = 2147763588

/**
 * {@snippet lang=c : #define EVIOCGRAB 1074021776
 */
fun EVIOCGRAB(): Long = 1074021776

/**
 * {@snippet lang=c : #define EVIOCREVOKE 1074021777
 */
fun EVIOCREVOKE(): Long = 1074021777

/**
 * {@snippet lang=c : #define EVIOCGMASK 2148550034
 */
fun EVIOCGMASK(): Long = 2148550034

/**
 * {@snippet lang=c : #define EVIOCSMASK 1074808211
 */
fun EVIOCSMASK(): Long = 1074808211

/**
 * {@snippet lang=c : #define EVIOCSCLOCKID 1074021792
 */
fun EVIOCSCLOCKID(): Long = 1074021792

/**
 * {@snippet lang=c : #define FF_EFFECT_MIN 80
 */
fun FF_EFFECT_MIN(): Int = (80).toInt()

/**
 * {@snippet lang=c : #define FF_EFFECT_MAX 87
 */
fun FF_EFFECT_MAX(): Int = (87).toInt()

/**
 * {@snippet lang=c : #define FF_WAVEFORM_MIN 88
 */
fun FF_WAVEFORM_MIN(): Int = (88).toInt()

/**
 * {@snippet lang=c : #define FF_WAVEFORM_MAX 93
 */
fun FF_WAVEFORM_MAX(): Int = (93).toInt()

/**
 * {@snippet lang=c : #define FF_MAX_EFFECTS 96
 */
fun FF_MAX_EFFECTS(): Int = (96).toInt()

/**
 * {@snippet lang=c : #define FF_CNT 128
 */
fun FF_CNT(): Int = (128).toInt()

/**
 * {@snippet lang=c : #define UI_DEV_CREATE 21761
 */
fun UI_DEV_CREATE(): Int = (21761).toInt()

/**
 * {@snippet lang=c : #define UI_DEV_DESTROY 21762
 */
fun UI_DEV_DESTROY(): Int = (21762).toInt()

/**
 * {@snippet lang=c : #define UI_DEV_SETUP 1079792899
 */
fun UI_DEV_SETUP(): Long = 1079792899

/**
 * {@snippet lang=c : #define UI_ABS_SETUP 1075598596
 */
fun UI_ABS_SETUP(): Long = 1075598596

/**
 * {@snippet lang=c : #define UI_SET_EVBIT 1074025828
 */
fun UI_SET_EVBIT(): Long = 1074025828

/**
 * {@snippet lang=c : #define UI_SET_KEYBIT 1074025829
 */
fun UI_SET_KEYBIT(): Long = 1074025829

/**
 * {@snippet lang=c : #define UI_SET_RELBIT 1074025830
 */
fun UI_SET_RELBIT(): Long = 1074025830

/**
 * {@snippet lang=c : #define UI_SET_ABSBIT 1074025831
 */
fun UI_SET_ABSBIT(): Long = 1074025831

/**
 * {@snippet lang=c : #define UI_SET_MSCBIT 1074025832
 */
fun UI_SET_MSCBIT(): Long = 1074025832

/**
 * {@snippet lang=c : #define UI_SET_LEDBIT 1074025833
 */
fun UI_SET_LEDBIT(): Long = 1074025833

/**
 * {@snippet lang=c : #define UI_SET_SNDBIT 1074025834
 */
fun UI_SET_SNDBIT(): Long = 1074025834

/**
 * {@snippet lang=c : #define UI_SET_FFBIT 1074025835
 */
fun UI_SET_FFBIT(): Long = 1074025835

/**
 * {@snippet lang=c : #define UI_SET_PHYS 1074287980
 */
fun UI_SET_PHYS(): Long = 1074287980

/**
 * {@snippet lang=c : #define UI_SET_SWBIT 1074025837
 */
fun UI_SET_SWBIT(): Long = 1074025837

/**
 * {@snippet lang=c : #define UI_SET_PROPBIT 1074025838
 */
fun UI_SET_PROPBIT(): Long = 1074025838

/**
 * {@snippet lang=c : #define UI_BEGIN_FF_UPLOAD 3228063176
 */
fun UI_BEGIN_FF_UPLOAD(): Long = 3228063176

/**
 * {@snippet lang=c : #define UI_END_FF_UPLOAD 1080579529
 */
fun UI_END_FF_UPLOAD(): Long = 1080579529

/**
 * {@snippet lang=c : #define UI_BEGIN_FF_ERASE 3222033866
 */
fun UI_BEGIN_FF_ERASE(): Long = 3222033866

/**
 * {@snippet lang=c : #define UI_END_FF_ERASE 1074550219
 */
fun UI_END_FF_ERASE(): Long = 1074550219

/**
 * {@snippet lang=c : #define UI_GET_VERSION 2147767597
 */
fun UI_GET_VERSION(): Long = 2147767597

/**
 * {@snippet lang=c : #define KFFI_UI_FF_UPLOAD 1
 */
fun KFFI_UI_FF_UPLOAD(): Int = (1).toInt()

/**
 * {@snippet lang=c : #define KFFI_UI_FF_ERASE 2
 */
fun KFFI_UI_FF_ERASE(): Int = (2).toInt()
