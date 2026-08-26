package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCell
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding, NSUserInterfaceItemIdentification, NSAccessibilityElement, NSAccessibility
 */
open class NSCell(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCell") }

        fun _bulletStringForString_bulletCharacter(string: MemorySegment, bulletChar: Short): MemorySegment {
            val sel = ObjCRuntime.sel("_bulletStringForString:bulletCharacter:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, string, bulletChar) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        fun _bulletStringForString_bulletCharacterAsString(string: MemorySegment, bulletChar: Short): String = ObjCRuntime.toJavaString(_bulletStringForString_bulletCharacter(string, bulletChar))

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun _bulletStringForString_bulletCharacter(string: String, bulletChar: Short): MemorySegment = _bulletStringForString_bulletCharacter(ObjCRuntime.newNSString(Arena.global(), string), bulletChar)

        /** Convenience overload — [String] parameters and [String] return type. */
        fun _bulletStringForString_bulletCharacterAsString(string: String, bulletChar: Short): String = ObjCRuntime.toJavaString(_bulletStringForString_bulletCharacter(ObjCRuntime.newNSString(Arena.global(), string), bulletChar))

        fun prefersTrackingUntilMouseUp(): Boolean {
            val sel = ObjCRuntime.sel("prefersTrackingUntilMouseUp")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        fun defaultMenu(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultMenu")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initTextCell(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initTextCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initTextCell(string: String): MemorySegment = initTextCell(ObjCRuntime.newNSString(Arena.global(), string))

    open fun initImageCell(image: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initImageCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun sendActionOn(mask: NSEventMask): Long {
        val sel = ObjCRuntime.sel("sendActionOn:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, mask.rawValue) as Long
    }

    open fun compare(otherCell: MemorySegment): NSComparisonResult {
        val sel = ObjCRuntime.sel("compare:")
        return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, otherCell) as Long)
    }

    open fun takeIntValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeIntValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun takeFloatValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeFloatValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun takeDoubleValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeDoubleValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun takeStringValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeStringValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun takeObjectValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeObjectValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun takeIntegerValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeIntegerValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun cellAttribute(parameter: NSCellAttribute): Long {
        val sel = ObjCRuntime.sel("cellAttribute:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, parameter.rawValue) as Long
    }

    open fun setCellAttribute_to(parameter: NSCellAttribute, value: Long): Unit {
        val sel = ObjCRuntime.sel("setCellAttribute:to:")
        ObjCRuntime.msgSend(null, ptr, sel, parameter.rawValue, value)
    }

    open fun imageRectForBounds(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("imageRectForBounds:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun titleRectForBounds(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("titleRectForBounds:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun drawingRectForBounds(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("drawingRectForBounds:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun cellSizeForBounds(rect: NSRect): NSSize {
        val sel = ObjCRuntime.sel("cellSizeForBounds:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun highlightColorWithFrame_inView(cellFrame: NSRect, controlView: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("highlightColorWithFrame:inView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView) as MemorySegment
    }

    open fun calcDrawInfo(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("calcDrawInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun setUpFieldEditorAttributes(textObj: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("setUpFieldEditorAttributes:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textObj) as MemorySegment
    }

    open fun drawInteriorWithFrame_inView(cellFrame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawInteriorWithFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView)
    }

    open fun drawWithFrame_inView(cellFrame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawWithFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView)
    }

    open fun highlight_withFrame_inView(flag: Boolean, cellFrame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("highlight:withFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, flag, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView)
    }

    open fun getPeriodicDelay_interval(delay: MemorySegment, interval: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getPeriodicDelay:interval:")
        ObjCRuntime.msgSend(null, ptr, sel, delay, interval)
    }

    open fun startTrackingAt_inView(startPoint: NSPoint, controlView: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("startTrackingAt:inView:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(startPoint.segment, NSPoint.layout), controlView) as Boolean
    }

    open fun continueTracking_at_inView(lastPoint: NSPoint, currentPoint: NSPoint, controlView: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("continueTracking:at:inView:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(lastPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(currentPoint.segment, NSPoint.layout), controlView) as Boolean
    }

    open fun stopTracking_at_inView_mouseIsUp(lastPoint: NSPoint, stopPoint: NSPoint, controlView: MemorySegment, flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("stopTracking:at:inView:mouseIsUp:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(lastPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(stopPoint.segment, NSPoint.layout), controlView, flag)
    }

    open fun trackMouse_inRect_ofView_untilMouseUp(event: MemorySegment, cellFrame: NSRect, controlView: MemorySegment, flag: Boolean): Boolean {
        val sel = ObjCRuntime.sel("trackMouse:inRect:ofView:untilMouseUp:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView, flag) as Boolean
    }

    open fun editWithFrame_inView_editor_delegate_event(rect: NSRect, controlView: MemorySegment, textObj: MemorySegment, delegate: MemorySegment, event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("editWithFrame:inView:editor:delegate:event:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), controlView, textObj, delegate, event)
    }

    open fun selectWithFrame_inView_editor_delegate_start_length(rect: NSRect, controlView: MemorySegment, textObj: MemorySegment, delegate: MemorySegment, selStart: Long, selLength: Long): Unit {
        val sel = ObjCRuntime.sel("selectWithFrame:inView:editor:delegate:start:length:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), controlView, textObj, delegate, selStart, selLength)
    }

    open fun endEditing(textObj: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("endEditing:")
        ObjCRuntime.msgSend(null, ptr, sel, textObj)
    }

    open fun resetCursorRect_inView(cellFrame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("resetCursorRect:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView)
    }

    open fun menuForEvent_inRect_ofView(event: MemorySegment, cellFrame: NSRect, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("menuForEvent:inRect:ofView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, event, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), view) as MemorySegment
    }

    open fun fieldEditorForView(controlView: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fieldEditorForView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, controlView) as MemorySegment
    }

    /** @return NSArray<NSDraggingImageComponent *> * */
    open fun draggingImageComponentsWithFrame_inView(frame: NSRect, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("draggingImageComponentsWithFrame:inView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view) as MemorySegment
    }

    // @property controlView
    open fun controlView(): MemorySegment {
        val sel = ObjCRuntime.sel("controlView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setControlView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setControlView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property type
    open fun type(): NSCellType {
        val sel = ObjCRuntime.sel("type")
        return NSCellType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setType(value: NSCellType) {
        val sel = ObjCRuntime.sel("setType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property state
    open fun state(): Long {
        val sel = ObjCRuntime.sel("state")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setState(value: Long) {
        val sel = ObjCRuntime.sel("setState:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property target
    open fun target(): MemorySegment {
        val sel = ObjCRuntime.sel("target")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property action
    open fun action(): MemorySegment {
        val sel = ObjCRuntime.sel("action")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tag
    open fun tag(): Long {
        val sel = ObjCRuntime.sel("tag")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setTag(value: Long) {
        val sel = ObjCRuntime.sel("setTag:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property title
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setTitle(value: String) = setTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property opaque
    open fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property enabled
    open fun isEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property continuous
    open fun isContinuous(): Boolean {
        val sel = ObjCRuntime.sel("isContinuous")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setContinuous(value: Boolean) {
        val sel = ObjCRuntime.sel("setContinuous:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property editable
    open fun isEditable(): Boolean {
        val sel = ObjCRuntime.sel("isEditable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setEditable(value: Boolean) {
        val sel = ObjCRuntime.sel("setEditable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectable
    open fun isSelectable(): Boolean {
        val sel = ObjCRuntime.sel("isSelectable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSelectable(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelectable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bordered
    open fun isBordered(): Boolean {
        val sel = ObjCRuntime.sel("isBordered")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setBordered(value: Boolean) {
        val sel = ObjCRuntime.sel("setBordered:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bezeled
    open fun isBezeled(): Boolean {
        val sel = ObjCRuntime.sel("isBezeled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setBezeled(value: Boolean) {
        val sel = ObjCRuntime.sel("setBezeled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property scrollable
    open fun isScrollable(): Boolean {
        val sel = ObjCRuntime.sel("isScrollable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setScrollable(value: Boolean) {
        val sel = ObjCRuntime.sel("setScrollable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property highlighted
    open fun isHighlighted(): Boolean {
        val sel = ObjCRuntime.sel("isHighlighted")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setHighlighted(value: Boolean) {
        val sel = ObjCRuntime.sel("setHighlighted:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alignment
    open fun alignment(): NSTextAlignment {
        val sel = ObjCRuntime.sel("alignment")
        return NSTextAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setAlignment(value: NSTextAlignment) {
        val sel = ObjCRuntime.sel("setAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property wraps
    open fun wraps(): Boolean {
        val sel = ObjCRuntime.sel("wraps")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setWraps(value: Boolean) {
        val sel = ObjCRuntime.sel("setWraps:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property font
    open fun font(): MemorySegment {
        val sel = ObjCRuntime.sel("font")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setFont(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFont:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property keyEquivalent
    open fun keyEquivalent(): MemorySegment {
        val sel = ObjCRuntime.sel("keyEquivalent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun keyEquivalentAsString(): String = ObjCRuntime.toJavaString(keyEquivalent())

    // @property formatter
    open fun formatter(): MemorySegment {
        val sel = ObjCRuntime.sel("formatter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setFormatter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFormatter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property objectValue
    open fun objectValue(): MemorySegment {
        val sel = ObjCRuntime.sel("objectValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setObjectValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasValidObjectValue
    open fun hasValidObjectValue(): Boolean {
        val sel = ObjCRuntime.sel("hasValidObjectValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property stringValue
    open fun stringValue(): MemorySegment {
        val sel = ObjCRuntime.sel("stringValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setStringValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setStringValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun stringValueAsString(): String = ObjCRuntime.toJavaString(stringValue())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setStringValue(value: String) = setStringValue(ObjCRuntime.newNSString(Arena.global(), value))

    // @property intValue
    open fun intValue(): Int {
        val sel = ObjCRuntime.sel("intValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }
    open fun setIntValue(value: Int) {
        val sel = ObjCRuntime.sel("setIntValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property floatValue
    open fun floatValue(): Float {
        val sel = ObjCRuntime.sel("floatValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    open fun setFloatValue(value: Float) {
        val sel = ObjCRuntime.sel("setFloatValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property doubleValue
    open fun doubleValue(): Double {
        val sel = ObjCRuntime.sel("doubleValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setDoubleValue(value: Double) {
        val sel = ObjCRuntime.sel("setDoubleValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property integerValue
    open fun integerValue(): Long {
        val sel = ObjCRuntime.sel("integerValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setIntegerValue(value: Long) {
        val sel = ObjCRuntime.sel("setIntegerValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property image
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property controlSize
    open fun controlSize(): NSControlSize {
        val sel = ObjCRuntime.sel("controlSize")
        return NSControlSize(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setControlSize(value: NSControlSize) {
        val sel = ObjCRuntime.sel("setControlSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property representedObject
    open fun representedObject(): MemorySegment {
        val sel = ObjCRuntime.sel("representedObject")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setRepresentedObject(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRepresentedObject:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cellSize
    open fun cellSize(): NSSize {
        val sel = ObjCRuntime.sel("cellSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }

    // @property mouseDownFlags
    open fun mouseDownFlags(): Long {
        val sel = ObjCRuntime.sel("mouseDownFlags")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property menu
    open fun menu(): MemorySegment {
        val sel = ObjCRuntime.sel("menu")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMenu(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sendsActionOnEndEditing
    open fun sendsActionOnEndEditing(): Boolean {
        val sel = ObjCRuntime.sel("sendsActionOnEndEditing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSendsActionOnEndEditing(value: Boolean) {
        val sel = ObjCRuntime.sel("setSendsActionOnEndEditing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property baseWritingDirection
    open fun baseWritingDirection(): NSWritingDirection {
        val sel = ObjCRuntime.sel("baseWritingDirection")
        return NSWritingDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setBaseWritingDirection(value: NSWritingDirection) {
        val sel = ObjCRuntime.sel("setBaseWritingDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property lineBreakMode
    open fun lineBreakMode(): NSLineBreakMode {
        val sel = ObjCRuntime.sel("lineBreakMode")
        return NSLineBreakMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLineBreakMode(value: NSLineBreakMode) {
        val sel = ObjCRuntime.sel("setLineBreakMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property allowsUndo
    open fun allowsUndo(): Boolean {
        val sel = ObjCRuntime.sel("allowsUndo")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsUndo(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsUndo:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property truncatesLastVisibleLine
    open fun truncatesLastVisibleLine(): Boolean {
        val sel = ObjCRuntime.sel("truncatesLastVisibleLine")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setTruncatesLastVisibleLine(value: Boolean) {
        val sel = ObjCRuntime.sel("setTruncatesLastVisibleLine:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property userInterfaceLayoutDirection
    open fun userInterfaceLayoutDirection(): NSUserInterfaceLayoutDirection {
        val sel = ObjCRuntime.sel("userInterfaceLayoutDirection")
        return NSUserInterfaceLayoutDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setUserInterfaceLayoutDirection(value: NSUserInterfaceLayoutDirection) {
        val sel = ObjCRuntime.sel("setUserInterfaceLayoutDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property usesSingleLineMode
    open fun usesSingleLineMode(): Boolean {
        val sel = ObjCRuntime.sel("usesSingleLineMode")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setUsesSingleLineMode(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesSingleLineMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSCell.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSCell.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSUserInterfaceItemIdentification.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.identifier(): MemorySegment {
    val sel = ObjCRuntime.sel("identifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAccessibilityElement. */
fun NSCell.accessibilityFrame(): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrame")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

/** Required by Objective-C protocol NSAccessibilityElement. */
fun NSCell.accessibilityParent(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityParent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityElement(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityElement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityElement(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

fun NSCell.setAccessibilityFrame(value: NSRect) {
    val sel = ObjCRuntime.sel("setAccessibilityFrame:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityFocused(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFocused")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityFocused(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFocused:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityActivationPoint(): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityActivationPoint")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}
fun NSCell.setAccessibilityActivationPoint(value: NSPoint) {
    val sel = ObjCRuntime.sel("setAccessibilityActivationPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSPoint.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityTopLevelUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTopLevelUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityTopLevelUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTopLevelUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityURL(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityURL")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityURL(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityURL:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityValueDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValueDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityValueDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValueDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityVisibleChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityVisibleChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySubrole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySubrole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySubrole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySubrole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityTitle(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityTitleUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitleUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityTitleUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitleUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityNextContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityNextContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityNextContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityNextContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityOrientation(): NSAccessibilityOrientation {
    val sel = ObjCRuntime.sel("accessibilityOrientation")
    return NSAccessibilityOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSCell.setAccessibilityOrientation(value: NSAccessibilityOrientation) {
    val sel = ObjCRuntime.sel("setAccessibilityOrientation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityOverflowButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityOverflowButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityOverflowButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityOverflowButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

fun NSCell.setAccessibilityParent(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityParent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityPlaceholderValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPlaceholderValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityPlaceholderValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPlaceholderValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityPreviousContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPreviousContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityPreviousContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPreviousContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityRole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityRole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityRoleDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRoleDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityRoleDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRoleDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySearchButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySearchButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySearchMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySearchMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilitySelected(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelected")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilitySelected(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilitySelected:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySelectedChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySelectedChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityServesAsTitleForUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityServesAsTitleForUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityServesAsTitleForUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityServesAsTitleForUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityShownMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityShownMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityShownMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityShownMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMinValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMinValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMaxValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMaxValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMaxValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMaxValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityLinkedUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLinkedUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityLinkedUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLinkedUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityHelp(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHelp")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityHelp(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHelp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityFilename(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFilename")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityFilename(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFilename:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityExpanded(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityExpanded")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityExpanded(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityExpanded:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityEdited(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEdited")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityEdited(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEdited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityEnabled(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityChildrenInNavigationOrder(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildrenInNavigationOrder")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityChildrenInNavigationOrder(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildrenInNavigationOrder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityClearButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityClearButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityClearButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityClearButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityCancelButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCancelButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityCancelButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCancelButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityProtectedContent(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityProtectedContent")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityProtectedContent(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityProtectedContent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityLabel(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabel")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityLabel(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityAlternateUIVisible(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityAlternateUIVisible")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityAlternateUIVisible(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityAlternateUIVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySharedFocusElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedFocusElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySharedFocusElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedFocusElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityRequired(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityRequired")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityRequired(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityRequired:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityCustomRotors(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomRotors")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityCustomRotors(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomRotors:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityAttributedUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityAttributedUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAttributedUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityApplicationFocusedUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityApplicationFocusedUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityApplicationFocusedUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityApplicationFocusedUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMainWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMainWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMainWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMainWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityHidden(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityHidden")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityHidden(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityHidden:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityFrontmost(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFrontmost")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityFrontmost(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFrontmost:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityFocusedWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFocusedWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityFocusedWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFocusedWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityWindows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityWindows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityExtrasMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityExtrasMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityExtrasMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityExtrasMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityColumnTitles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnTitles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityColumnTitles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnTitles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityOrderedByRow(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityOrderedByRow")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityOrderedByRow(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityOrderedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityHorizontalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSCell.setAccessibilityHorizontalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityVerticalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSCell.setAccessibilityVerticalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityHorizontalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityHorizontalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityVerticalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityVerticalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityHandles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHandles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityHandles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHandles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityWarningValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWarningValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityWarningValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWarningValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityCriticalValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCriticalValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityCriticalValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCriticalValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityDisclosed(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityDisclosed")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityDisclosed(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosed:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityDisclosedByRow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedByRow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityDisclosedByRow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityDisclosedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityDisclosedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityDisclosureLevel(): Long {
    val sel = ObjCRuntime.sel("accessibilityDisclosureLevel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSCell.setAccessibilityDisclosureLevel(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosureLevel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMarkerUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMarkerUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMarkerValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMarkerValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMarkerGroupUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerGroupUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMarkerGroupUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerGroupUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSCell.setAccessibilityUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityRulerMarkerType(): NSAccessibilityRulerMarkerType {
    val sel = ObjCRuntime.sel("accessibilityRulerMarkerType")
    return NSAccessibilityRulerMarkerType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSCell.setAccessibilityRulerMarkerType(value: NSAccessibilityRulerMarkerType) {
    val sel = ObjCRuntime.sel("setAccessibilityRulerMarkerType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMarkerTypeDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerTypeDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMarkerTypeDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerTypeDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityHorizontalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityHorizontalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityVerticalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityVerticalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityAllowedValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAllowedValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityAllowedValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAllowedValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityLabelUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabelUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityLabelUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityLabelValue(): Float {
    val sel = ObjCRuntime.sel("accessibilityLabelValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}
fun NSCell.setAccessibilityLabelValue(value: Float) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySplitters(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySplitters")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySplitters(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySplitters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityDecrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDecrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityDecrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDecrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityIncrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIncrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityIncrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIncrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityTabs(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTabs")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityTabs(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTabs:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityHeader(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHeader")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityHeader(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHeader:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityColumnCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityColumnCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSCell.setAccessibilityColumnCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityRowCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityRowCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSCell.setAccessibilityRowCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityRowCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityIndex(): Long {
    val sel = ObjCRuntime.sel("accessibilityIndex")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSCell.setAccessibilityIndex(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityVisibleRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityVisibleRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySelectedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySelectedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityVisibleColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityVisibleColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySelectedColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySelectedColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilitySortDirection(): NSAccessibilitySortDirection {
    val sel = ObjCRuntime.sel("accessibilitySortDirection")
    return NSAccessibilitySortDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSCell.setAccessibilitySortDirection(value: NSAccessibilitySortDirection) {
    val sel = ObjCRuntime.sel("setAccessibilitySortDirection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityRowHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRowHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityRowHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRowHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySelectedCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySelectedCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityVisibleCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityVisibleCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityColumnHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityColumnHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityRowIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRowIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSCell.setAccessibilityRowIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityRowIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityColumnIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityColumnIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSCell.setAccessibilityColumnIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityInsertionPointLineNumber(): Long {
    val sel = ObjCRuntime.sel("accessibilityInsertionPointLineNumber")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSCell.setAccessibilityInsertionPointLineNumber(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityInsertionPointLineNumber:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilitySharedCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySharedCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSCell.setAccessibilitySharedCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySharedTextUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedTextUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySharedTextUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedTextUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityVisibleCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityVisibleCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSCell.setAccessibilityVisibleCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilityNumberOfCharacters(): Long {
    val sel = ObjCRuntime.sel("accessibilityNumberOfCharacters")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSCell.setAccessibilityNumberOfCharacters(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityNumberOfCharacters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySelectedText(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedText")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySelectedText(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.accessibilitySelectedTextRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSCell.setAccessibilitySelectedTextRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilitySelectedTextRanges(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRanges")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilitySelectedTextRanges(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRanges:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityToolbarButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityToolbarButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityToolbarButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityToolbarButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityModal(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityModal")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityModal(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityModal:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityProxy(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityProxy")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityProxy(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityProxy:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityMain(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMain")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityMain(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMain:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityFullScreenButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFullScreenButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityFullScreenButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFullScreenButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityGrowArea(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityGrowArea")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityGrowArea(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityGrowArea:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityDocument(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDocument")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityDocument(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDocument:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityDefaultButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDefaultButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityDefaultButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDefaultButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityCloseButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCloseButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityCloseButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCloseButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityZoomButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityZoomButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityZoomButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityZoomButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityMinimizeButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinimizeButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityMinimizeButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimizeButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSCell.isAccessibilityMinimized(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMinimized")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSCell.setAccessibilityMinimized(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimized:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSCell.accessibilityCustomActions(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomActions")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSCell.setAccessibilityCustomActions(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomActions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityLayoutPointForScreenPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityLayoutPointForScreenPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityLayoutSizeForScreenSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityLayoutSizeForScreenSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityScreenPointForLayoutPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityScreenPointForLayoutPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityScreenSizeForLayoutSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityScreenSizeForLayoutSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityCellForColumn_row(column: Long, row: Long): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCellForColumn:row:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, column, row) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityAttributedStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityRangeForLine(line: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForLine:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, line))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityRangeForPosition(point: NSPoint): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForPosition:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityFrameForRange(range: NSRange): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrameForRange:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityRTFForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRTFForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityStyleRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityStyleRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityLineForIndex(index: Long): Long {
    val sel = ObjCRuntime.sel("accessibilityLineForIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, index) as Long
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformCancel(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformCancel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformConfirm(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformConfirm")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformDecrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDecrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformDelete(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDelete")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformIncrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformIncrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformPick(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPick")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformPress(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPress")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformRaise(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformRaise")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformShowAlternateUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowAlternateUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformShowDefaultUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowDefaultUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.accessibilityPerformShowMenu(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowMenu")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSCell.isAccessibilitySelectorAllowed(selector: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelectorAllowed:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, selector) as Boolean
}

// ── Category: NSKeyboardUI on NSCell ─────────────────────────────────────────

fun NSCell.performClick(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("performClick:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSCell.drawFocusRingMaskWithFrame_inView(cellFrame: NSRect, controlView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawFocusRingMaskWithFrame:inView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView)
}

fun NSCell.focusRingMaskBoundsForFrame_inView(cellFrame: NSRect, controlView: MemorySegment): NSRect {
    val sel = ObjCRuntime.sel("focusRingMaskBoundsForFrame:inView:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView))
}

fun NSCell.refusesFirstResponder(): Boolean {
    val sel = ObjCRuntime.sel("refusesFirstResponder")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSCell.setRefusesFirstResponder(refusesFirstResponder: Boolean): Unit {
    val sel = ObjCRuntime.sel("setRefusesFirstResponder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, refusesFirstResponder)
}

fun NSCell.acceptsFirstResponder(): Boolean {
    val sel = ObjCRuntime.sel("acceptsFirstResponder")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSCell.showsFirstResponder(): Boolean {
    val sel = ObjCRuntime.sel("showsFirstResponder")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSCell.setShowsFirstResponder(showsFirstResponder: Boolean): Unit {
    val sel = ObjCRuntime.sel("setShowsFirstResponder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, showsFirstResponder)
}

fun NSCell.focusRingType(): NSFocusRingType {
    val sel = ObjCRuntime.sel("focusRingType")
    return NSFocusRingType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSCell.setFocusRingType(focusRingType: NSFocusRingType): Unit {
    val sel = ObjCRuntime.sel("setFocusRingType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, focusRingType.rawValue)
}

fun NSCell.wantsNotificationForMarkedText(): Boolean {
    val sel = ObjCRuntime.sel("wantsNotificationForMarkedText")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// Class method: +[NSCell defaultFocusRingType]
fun NSCell_defaultFocusRingType(): NSFocusRingType {
    val sel = ObjCRuntime.sel("defaultFocusRingType")
    val cls = ObjCRuntime.getClass("NSCell")
    return NSFocusRingType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, cls, sel) as Long)
}

// ── Category: NSCellAttributedStringMethods on NSCell ─────────────────────────────────────────

fun NSCell.attributedStringValue(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedStringValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSCell.setAttributedStringValue(attributedStringValue: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedStringValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributedStringValue)
}

fun NSCell.allowsEditingTextAttributes(): Boolean {
    val sel = ObjCRuntime.sel("allowsEditingTextAttributes")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSCell.setAllowsEditingTextAttributes(allowsEditingTextAttributes: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsEditingTextAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsEditingTextAttributes)
}

fun NSCell.importsGraphics(): Boolean {
    val sel = ObjCRuntime.sel("importsGraphics")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSCell.setImportsGraphics(importsGraphics: Boolean): Unit {
    val sel = ObjCRuntime.sel("setImportsGraphics:")
    ObjCRuntime.msgSend(null, this.ptr, sel, importsGraphics)
}

// ── Category: NSCellMixedState on NSCell ─────────────────────────────────────────

fun NSCell.setNextState(): Unit {
    val sel = ObjCRuntime.sel("setNextState")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSCell.allowsMixedState(): Boolean {
    val sel = ObjCRuntime.sel("allowsMixedState")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSCell.setAllowsMixedState(allowsMixedState: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsMixedState:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsMixedState)
}

fun NSCell.nextState(): Long {
    val sel = ObjCRuntime.sel("nextState")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

// ── Category: NSCellHitTest on NSCell ─────────────────────────────────────────

fun NSCell.hitTestForEvent_inRect_ofView(event: MemorySegment, cellFrame: NSRect, controlView: MemorySegment): NSCellHitResult {
    val sel = ObjCRuntime.sel("hitTestForEvent:inRect:ofView:")
    return NSCellHitResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, event, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView) as Long)
}

// ── Category: NSCellExpansion on NSCell ─────────────────────────────────────────

fun NSCell.expansionFrameWithFrame_inView(cellFrame: NSRect, view: MemorySegment): NSRect {
    val sel = ObjCRuntime.sel("expansionFrameWithFrame:inView:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), view))
}

fun NSCell.drawWithExpansionFrame_inView(cellFrame: NSRect, view: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawWithExpansionFrame:inView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), view)
}

// ── Category: NSCellBackgroundStyle on NSCell ─────────────────────────────────────────

fun NSCell.backgroundStyle(): NSBackgroundStyle {
    val sel = ObjCRuntime.sel("backgroundStyle")
    return NSBackgroundStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSCell.setBackgroundStyle(backgroundStyle: NSBackgroundStyle): Unit {
    val sel = ObjCRuntime.sel("setBackgroundStyle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, backgroundStyle.rawValue)
}

fun NSCell.interiorBackgroundStyle(): NSBackgroundStyle {
    val sel = ObjCRuntime.sel("interiorBackgroundStyle")
    return NSBackgroundStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

// ── Category: NSDeprecated on NSCell ─────────────────────────────────────────

fun NSCell.entryType(): Long {
    val sel = ObjCRuntime.sel("entryType")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSCell.setEntryType(type: Long): Unit {
    val sel = ObjCRuntime.sel("setEntryType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, type)
}

fun NSCell.isEntryAcceptable(string: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEntryAcceptable:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, string) as Boolean
}

fun NSCell.setFloatingPointFormat_left_right(autoRange: Boolean, leftDigits: Long, rightDigits: Long): Unit {
    val sel = ObjCRuntime.sel("setFloatingPointFormat:left:right:")
    ObjCRuntime.msgSend(null, this.ptr, sel, autoRange, leftDigits, rightDigits)
}

fun NSCell.setMnemonicLocation(location: Long): Unit {
    val sel = ObjCRuntime.sel("setMnemonicLocation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, location)
}

fun NSCell.mnemonicLocation(): Long {
    val sel = ObjCRuntime.sel("mnemonicLocation")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSCell.mnemonic(): MemorySegment {
    val sel = ObjCRuntime.sel("mnemonic")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSCell.setTitleWithMnemonic(stringWithAmpersand: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleWithMnemonic:")
    ObjCRuntime.msgSend(null, this.ptr, sel, stringWithAmpersand)
}

fun NSCell.controlTint(): NSControlTint {
    val sel = ObjCRuntime.sel("controlTint")
    return NSControlTint(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSCell.setControlTint(controlTint: NSControlTint): Unit {
    val sel = ObjCRuntime.sel("setControlTint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, controlTint.rawValue)
}
