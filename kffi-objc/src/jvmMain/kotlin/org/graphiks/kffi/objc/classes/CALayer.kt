package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: CALayer
 * Superclass: NSObject
 * Protocols: NSSecureCoding, CAMediaTiming
 */
open class CALayer(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("CALayer") }

        fun layer(): MemorySegment {
            val sel = ObjCRuntime.sel("layer")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun defaultValueForKey(key: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("defaultValueForKey:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, key) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun defaultValueForKey(key: String): MemorySegment = defaultValueForKey(ObjCRuntime.newNSString(Arena.global(), key))

        fun needsDisplayForKey(key: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("needsDisplayForKey:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, key) as Boolean
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun needsDisplayForKey(key: String): Boolean = needsDisplayForKey(ObjCRuntime.newNSString(Arena.global(), key))

        fun cornerCurveExpansionFactor(curve: MemorySegment): Double {
            val sel = ObjCRuntime.sel("cornerCurveExpansionFactor:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel, curve) as Double
        }

        /** @return id<CAAction> */
        fun defaultActionForKey(event: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("defaultActionForKey:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, event) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun defaultActionForKey(event: String): MemorySegment = defaultActionForKey(ObjCRuntime.newNSString(Arena.global(), event))

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithLayer(layer: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLayer:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, layer) as MemorySegment
    }

    open fun presentationLayer(): MemorySegment {
        val sel = ObjCRuntime.sel("presentationLayer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun modelLayer(): MemorySegment {
        val sel = ObjCRuntime.sel("modelLayer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun shouldArchiveValueForKey(key: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("shouldArchiveValueForKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, key) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun shouldArchiveValueForKey(key: String): Boolean = shouldArchiveValueForKey(ObjCRuntime.newNSString(Arena.global(), key))

    open fun affineTransform(): CGAffineTransform {
        val sel = ObjCRuntime.sel("affineTransform")
        return CGAffineTransform(ObjCRuntime.msgSendStruct(CGAffineTransform.layout, ptr, sel))
    }

    open fun setAffineTransform(m: CGAffineTransform): Unit {
        val sel = ObjCRuntime.sel("setAffineTransform:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(m.segment, CGAffineTransform.layout))
    }

    open fun contentsAreFlipped(): Boolean {
        val sel = ObjCRuntime.sel("contentsAreFlipped")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun removeFromSuperlayer(): Unit {
        val sel = ObjCRuntime.sel("removeFromSuperlayer")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun addSublayer(layer: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addSublayer:")
        ObjCRuntime.msgSend(null, ptr, sel, layer)
    }

    open fun insertSublayer_atIndex(layer: MemorySegment, idx: Int): Unit {
        val sel = ObjCRuntime.sel("insertSublayer:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, layer, idx)
    }

    open fun insertSublayer_below(layer: MemorySegment, sibling: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertSublayer:below:")
        ObjCRuntime.msgSend(null, ptr, sel, layer, sibling)
    }

    open fun insertSublayer_above(layer: MemorySegment, sibling: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertSublayer:above:")
        ObjCRuntime.msgSend(null, ptr, sel, layer, sibling)
    }

    open fun replaceSublayer_with(oldLayer: MemorySegment, newLayer: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceSublayer:with:")
        ObjCRuntime.msgSend(null, ptr, sel, oldLayer, newLayer)
    }

    open fun convertPoint_fromLayer(p: CGPoint, l: MemorySegment): CGPoint {
        val sel = ObjCRuntime.sel("convertPoint:fromLayer:")
        return CGPoint(ObjCRuntime.msgSendStruct(CGPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(p.segment, CGPoint.layout), l))
    }

    open fun convertPoint_toLayer(p: CGPoint, l: MemorySegment): CGPoint {
        val sel = ObjCRuntime.sel("convertPoint:toLayer:")
        return CGPoint(ObjCRuntime.msgSendStruct(CGPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(p.segment, CGPoint.layout), l))
    }

    open fun convertRect_fromLayer(r: CGRect, l: MemorySegment): CGRect {
        val sel = ObjCRuntime.sel("convertRect:fromLayer:")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(r.segment, CGRect.layout), l))
    }

    open fun convertRect_toLayer(r: CGRect, l: MemorySegment): CGRect {
        val sel = ObjCRuntime.sel("convertRect:toLayer:")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(r.segment, CGRect.layout), l))
    }

    open fun convertTime_fromLayer(t: Double, l: MemorySegment): Double {
        val sel = ObjCRuntime.sel("convertTime:fromLayer:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, t, l) as Double
    }

    open fun convertTime_toLayer(t: Double, l: MemorySegment): Double {
        val sel = ObjCRuntime.sel("convertTime:toLayer:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, t, l) as Double
    }

    open fun hitTest(p: CGPoint): MemorySegment {
        val sel = ObjCRuntime.sel("hitTest:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(p.segment, CGPoint.layout)) as MemorySegment
    }

    open fun containsPoint(p: CGPoint): Boolean {
        val sel = ObjCRuntime.sel("containsPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(p.segment, CGPoint.layout)) as Boolean
    }

    open fun display(): Unit {
        val sel = ObjCRuntime.sel("display")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun setNeedsDisplay(): Unit {
        val sel = ObjCRuntime.sel("setNeedsDisplay")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun setNeedsDisplayInRect(r: CGRect): Unit {
        val sel = ObjCRuntime.sel("setNeedsDisplayInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(r.segment, CGRect.layout))
    }

    open fun needsDisplay(): Boolean {
        val sel = ObjCRuntime.sel("needsDisplay")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun displayIfNeeded(): Unit {
        val sel = ObjCRuntime.sel("displayIfNeeded")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun drawInContext(ctx: CGContextRef): Unit {
        val sel = ObjCRuntime.sel("drawInContext:")
        ObjCRuntime.msgSend(null, ptr, sel, ctx.segment)
    }

    open fun renderInContext(ctx: CGContextRef): Unit {
        val sel = ObjCRuntime.sel("renderInContext:")
        ObjCRuntime.msgSend(null, ptr, sel, ctx.segment)
    }

    open fun preferredFrameSize(): CGSize {
        val sel = ObjCRuntime.sel("preferredFrameSize")
        return CGSize(ObjCRuntime.msgSendStruct(CGSize.layout, ptr, sel))
    }

    open fun setNeedsLayout(): Unit {
        val sel = ObjCRuntime.sel("setNeedsLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun needsLayout(): Boolean {
        val sel = ObjCRuntime.sel("needsLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun layoutIfNeeded(): Unit {
        val sel = ObjCRuntime.sel("layoutIfNeeded")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun layoutSublayers(): Unit {
        val sel = ObjCRuntime.sel("layoutSublayers")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun resizeSublayersWithOldSize(size: CGSize): Unit {
        val sel = ObjCRuntime.sel("resizeSublayersWithOldSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout))
    }

    open fun resizeWithOldSuperlayerSize(size: CGSize): Unit {
        val sel = ObjCRuntime.sel("resizeWithOldSuperlayerSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout))
    }

    /** @return id<CAAction> */
    open fun actionForKey(event: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("actionForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, event) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun actionForKey(event: String): MemorySegment = actionForKey(ObjCRuntime.newNSString(Arena.global(), event))

    open fun addAnimation_forKey(anim: MemorySegment, key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addAnimation:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, anim, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun addAnimation_forKey(anim: MemorySegment, key: String): Unit = addAnimation_forKey(anim, ObjCRuntime.newNSString(Arena.global(), key))

    open fun removeAllAnimations(): Unit {
        val sel = ObjCRuntime.sel("removeAllAnimations")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun removeAnimationForKey(key: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeAnimationForKey:")
        ObjCRuntime.msgSend(null, ptr, sel, key)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun removeAnimationForKey(key: String): Unit = removeAnimationForKey(ObjCRuntime.newNSString(Arena.global(), key))

    /** @return NSArray<NSString *> * */
    open fun animationKeys(): MemorySegment {
        val sel = ObjCRuntime.sel("animationKeys")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun animationForKey(key: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("animationForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun animationForKey(key: String): MemorySegment = animationForKey(ObjCRuntime.newNSString(Arena.global(), key))

    // @property bounds
    open fun bounds(): CGRect {
        val sel = ObjCRuntime.sel("bounds")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }
    open fun setBounds(value: CGRect) {
        val sel = ObjCRuntime.sel("setBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGRect.layout))
    }

    // @property position
    open fun position(): CGPoint {
        val sel = ObjCRuntime.sel("position")
        return CGPoint(ObjCRuntime.msgSendStruct(CGPoint.layout, ptr, sel))
    }
    open fun setPosition(value: CGPoint) {
        val sel = ObjCRuntime.sel("setPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGPoint.layout))
    }

    // @property zPosition
    open fun zPosition(): Double {
        val sel = ObjCRuntime.sel("zPosition")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setZPosition(value: Double) {
        val sel = ObjCRuntime.sel("setZPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property anchorPoint
    open fun anchorPoint(): CGPoint {
        val sel = ObjCRuntime.sel("anchorPoint")
        return CGPoint(ObjCRuntime.msgSendStruct(CGPoint.layout, ptr, sel))
    }
    open fun setAnchorPoint(value: CGPoint) {
        val sel = ObjCRuntime.sel("setAnchorPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGPoint.layout))
    }

    // @property anchorPointZ
    open fun anchorPointZ(): Double {
        val sel = ObjCRuntime.sel("anchorPointZ")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setAnchorPointZ(value: Double) {
        val sel = ObjCRuntime.sel("setAnchorPointZ:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property transform
    open fun transform(): CATransform3D {
        val sel = ObjCRuntime.sel("transform")
        return CATransform3D(ObjCRuntime.msgSendStruct(CATransform3D.layout, ptr, sel))
    }
    open fun setTransform(value: CATransform3D) {
        val sel = ObjCRuntime.sel("setTransform:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CATransform3D.layout))
    }

    // @property frame
    open fun frame(): CGRect {
        val sel = ObjCRuntime.sel("frame")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }
    open fun setFrame(value: CGRect) {
        val sel = ObjCRuntime.sel("setFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGRect.layout))
    }

    // @property hidden
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setHidden(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidden:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property doubleSided
    open fun isDoubleSided(): Boolean {
        val sel = ObjCRuntime.sel("isDoubleSided")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setDoubleSided(value: Boolean) {
        val sel = ObjCRuntime.sel("setDoubleSided:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property geometryFlipped
    open fun isGeometryFlipped(): Boolean {
        val sel = ObjCRuntime.sel("isGeometryFlipped")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setGeometryFlipped(value: Boolean) {
        val sel = ObjCRuntime.sel("setGeometryFlipped:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property superlayer
    open fun superlayer(): MemorySegment {
        val sel = ObjCRuntime.sel("superlayer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property sublayers
    /** @return NSArray<__kindof CALayer *> * */
    open fun sublayers(): MemorySegment {
        val sel = ObjCRuntime.sel("sublayers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setSublayers(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSublayers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sublayerTransform
    open fun sublayerTransform(): CATransform3D {
        val sel = ObjCRuntime.sel("sublayerTransform")
        return CATransform3D(ObjCRuntime.msgSendStruct(CATransform3D.layout, ptr, sel))
    }
    open fun setSublayerTransform(value: CATransform3D) {
        val sel = ObjCRuntime.sel("setSublayerTransform:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CATransform3D.layout))
    }

    // @property mask
    open fun mask(): MemorySegment {
        val sel = ObjCRuntime.sel("mask")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMask(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property masksToBounds
    open fun masksToBounds(): Boolean {
        val sel = ObjCRuntime.sel("masksToBounds")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setMasksToBounds(value: Boolean) {
        val sel = ObjCRuntime.sel("setMasksToBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contents
    open fun contents(): MemorySegment {
        val sel = ObjCRuntime.sel("contents")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContents(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentsRect
    open fun contentsRect(): CGRect {
        val sel = ObjCRuntime.sel("contentsRect")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }
    open fun setContentsRect(value: CGRect) {
        val sel = ObjCRuntime.sel("setContentsRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGRect.layout))
    }

    // @property contentsGravity
    open fun contentsGravity(): MemorySegment {
        val sel = ObjCRuntime.sel("contentsGravity")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContentsGravity(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentsGravity:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentsScale
    open fun contentsScale(): Double {
        val sel = ObjCRuntime.sel("contentsScale")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setContentsScale(value: Double) {
        val sel = ObjCRuntime.sel("setContentsScale:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentsCenter
    open fun contentsCenter(): CGRect {
        val sel = ObjCRuntime.sel("contentsCenter")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }
    open fun setContentsCenter(value: CGRect) {
        val sel = ObjCRuntime.sel("setContentsCenter:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGRect.layout))
    }

    // @property contentsFormat
    open fun contentsFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("contentsFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContentsFormat(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentsFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property wantsExtendedDynamicRangeContent
    open fun wantsExtendedDynamicRangeContent(): Boolean {
        val sel = ObjCRuntime.sel("wantsExtendedDynamicRangeContent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setWantsExtendedDynamicRangeContent(value: Boolean) {
        val sel = ObjCRuntime.sel("setWantsExtendedDynamicRangeContent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property toneMapMode
    open fun toneMapMode(): MemorySegment {
        val sel = ObjCRuntime.sel("toneMapMode")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setToneMapMode(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setToneMapMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredDynamicRange
    open fun preferredDynamicRange(): MemorySegment {
        val sel = ObjCRuntime.sel("preferredDynamicRange")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPreferredDynamicRange(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPreferredDynamicRange:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentsHeadroom
    open fun contentsHeadroom(): Double {
        val sel = ObjCRuntime.sel("contentsHeadroom")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setContentsHeadroom(value: Double) {
        val sel = ObjCRuntime.sel("setContentsHeadroom:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property wantsDynamicContentScaling
    open fun wantsDynamicContentScaling(): Boolean {
        val sel = ObjCRuntime.sel("wantsDynamicContentScaling")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setWantsDynamicContentScaling(value: Boolean) {
        val sel = ObjCRuntime.sel("setWantsDynamicContentScaling:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minificationFilter
    open fun minificationFilter(): MemorySegment {
        val sel = ObjCRuntime.sel("minificationFilter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMinificationFilter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMinificationFilter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property magnificationFilter
    open fun magnificationFilter(): MemorySegment {
        val sel = ObjCRuntime.sel("magnificationFilter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMagnificationFilter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMagnificationFilter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minificationFilterBias
    open fun minificationFilterBias(): Float {
        val sel = ObjCRuntime.sel("minificationFilterBias")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    open fun setMinificationFilterBias(value: Float) {
        val sel = ObjCRuntime.sel("setMinificationFilterBias:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property opaque
    open fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setOpaque(value: Boolean) {
        val sel = ObjCRuntime.sel("setOpaque:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property needsDisplayOnBoundsChange
    open fun needsDisplayOnBoundsChange(): Boolean {
        val sel = ObjCRuntime.sel("needsDisplayOnBoundsChange")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setNeedsDisplayOnBoundsChange(value: Boolean) {
        val sel = ObjCRuntime.sel("setNeedsDisplayOnBoundsChange:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property drawsAsynchronously
    open fun drawsAsynchronously(): Boolean {
        val sel = ObjCRuntime.sel("drawsAsynchronously")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setDrawsAsynchronously(value: Boolean) {
        val sel = ObjCRuntime.sel("setDrawsAsynchronously:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property edgeAntialiasingMask
    open fun edgeAntialiasingMask(): CAEdgeAntialiasingMask {
        val sel = ObjCRuntime.sel("edgeAntialiasingMask")
        return CAEdgeAntialiasingMask(Integer.toUnsignedLong(ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int))
    }
    open fun setEdgeAntialiasingMask(value: CAEdgeAntialiasingMask) {
        val sel = ObjCRuntime.sel("setEdgeAntialiasingMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue.toInt())
    }

    // @property allowsEdgeAntialiasing
    open fun allowsEdgeAntialiasing(): Boolean {
        val sel = ObjCRuntime.sel("allowsEdgeAntialiasing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsEdgeAntialiasing(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsEdgeAntialiasing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundColor
    open fun backgroundColor(): CGColorRef {
        val sel = ObjCRuntime.sel("backgroundColor")
        return CGColorRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    open fun setBackgroundColor(value: CGColorRef) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property cornerRadius
    open fun cornerRadius(): Double {
        val sel = ObjCRuntime.sel("cornerRadius")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setCornerRadius(value: Double) {
        val sel = ObjCRuntime.sel("setCornerRadius:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maskedCorners
    open fun maskedCorners(): CACornerMask {
        val sel = ObjCRuntime.sel("maskedCorners")
        return CACornerMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setMaskedCorners(value: CACornerMask) {
        val sel = ObjCRuntime.sel("setMaskedCorners:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property cornerCurve
    open fun cornerCurve(): MemorySegment {
        val sel = ObjCRuntime.sel("cornerCurve")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setCornerCurve(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCornerCurve:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property borderWidth
    open fun borderWidth(): Double {
        val sel = ObjCRuntime.sel("borderWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setBorderWidth(value: Double) {
        val sel = ObjCRuntime.sel("setBorderWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property borderColor
    open fun borderColor(): CGColorRef {
        val sel = ObjCRuntime.sel("borderColor")
        return CGColorRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    open fun setBorderColor(value: CGColorRef) {
        val sel = ObjCRuntime.sel("setBorderColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property opacity
    open fun opacity(): Float {
        val sel = ObjCRuntime.sel("opacity")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    open fun setOpacity(value: Float) {
        val sel = ObjCRuntime.sel("setOpacity:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsGroupOpacity
    open fun allowsGroupOpacity(): Boolean {
        val sel = ObjCRuntime.sel("allowsGroupOpacity")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsGroupOpacity(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsGroupOpacity:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property compositingFilter
    open fun compositingFilter(): MemorySegment {
        val sel = ObjCRuntime.sel("compositingFilter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setCompositingFilter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCompositingFilter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property filters
    open fun filters(): MemorySegment {
        val sel = ObjCRuntime.sel("filters")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setFilters(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFilters:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundFilters
    open fun backgroundFilters(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundFilters")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBackgroundFilters(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundFilters:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shouldRasterize
    open fun shouldRasterize(): Boolean {
        val sel = ObjCRuntime.sel("shouldRasterize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setShouldRasterize(value: Boolean) {
        val sel = ObjCRuntime.sel("setShouldRasterize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property rasterizationScale
    open fun rasterizationScale(): Double {
        val sel = ObjCRuntime.sel("rasterizationScale")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setRasterizationScale(value: Double) {
        val sel = ObjCRuntime.sel("setRasterizationScale:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shadowColor
    open fun shadowColor(): CGColorRef {
        val sel = ObjCRuntime.sel("shadowColor")
        return CGColorRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    open fun setShadowColor(value: CGColorRef) {
        val sel = ObjCRuntime.sel("setShadowColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property shadowOpacity
    open fun shadowOpacity(): Float {
        val sel = ObjCRuntime.sel("shadowOpacity")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    open fun setShadowOpacity(value: Float) {
        val sel = ObjCRuntime.sel("setShadowOpacity:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shadowOffset
    open fun shadowOffset(): CGSize {
        val sel = ObjCRuntime.sel("shadowOffset")
        return CGSize(ObjCRuntime.msgSendStruct(CGSize.layout, ptr, sel))
    }
    open fun setShadowOffset(value: CGSize) {
        val sel = ObjCRuntime.sel("setShadowOffset:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGSize.layout))
    }

    // @property shadowRadius
    open fun shadowRadius(): Double {
        val sel = ObjCRuntime.sel("shadowRadius")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setShadowRadius(value: Double) {
        val sel = ObjCRuntime.sel("setShadowRadius:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shadowPath
    open fun shadowPath(): CGPathRef {
        val sel = ObjCRuntime.sel("shadowPath")
        return CGPathRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    open fun setShadowPath(value: CGPathRef) {
        val sel = ObjCRuntime.sel("setShadowPath:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property autoresizingMask
    open fun autoresizingMask(): CAAutoresizingMask {
        val sel = ObjCRuntime.sel("autoresizingMask")
        return CAAutoresizingMask(Integer.toUnsignedLong(ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int))
    }
    open fun setAutoresizingMask(value: CAAutoresizingMask) {
        val sel = ObjCRuntime.sel("setAutoresizingMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue.toInt())
    }

    // @property layoutManager
    /** @return id<CALayoutManager> */
    open fun layoutManager(): MemorySegment {
        val sel = ObjCRuntime.sel("layoutManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setLayoutManager(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLayoutManager:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property actions
    /** @return NSDictionary<NSString *,id<CAAction>> * */
    open fun actions(): MemorySegment {
        val sel = ObjCRuntime.sel("actions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setActions(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setActions:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property name
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setName(value: String) = setName(ObjCRuntime.newNSString(Arena.global(), value))

    // @property delegate
    /** @return id<CALayerDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property style
    open fun style(): MemorySegment {
        val sel = ObjCRuntime.sel("style")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setStyle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun CALayer.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun CALayer.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun CALayer_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("CALayer")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/**
 * Required by Objective-C protocol CAMediaTiming.
 */
fun CALayer.beginTime(): Double {
    val sel = ObjCRuntime.sel("beginTime")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}
fun CALayer.setBeginTime(value: Double) {
    val sel = ObjCRuntime.sel("setBeginTime:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol CAMediaTiming.
 */
fun CALayer.duration(): Double {
    val sel = ObjCRuntime.sel("duration")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}
fun CALayer.setDuration(value: Double) {
    val sel = ObjCRuntime.sel("setDuration:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol CAMediaTiming.
 */
fun CALayer.speed(): Float {
    val sel = ObjCRuntime.sel("speed")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}
fun CALayer.setSpeed(value: Float) {
    val sel = ObjCRuntime.sel("setSpeed:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol CAMediaTiming.
 */
fun CALayer.timeOffset(): Double {
    val sel = ObjCRuntime.sel("timeOffset")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}
fun CALayer.setTimeOffset(value: Double) {
    val sel = ObjCRuntime.sel("setTimeOffset:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol CAMediaTiming.
 */
fun CALayer.repeatCount(): Float {
    val sel = ObjCRuntime.sel("repeatCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}
fun CALayer.setRepeatCount(value: Float) {
    val sel = ObjCRuntime.sel("setRepeatCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol CAMediaTiming.
 */
fun CALayer.repeatDuration(): Double {
    val sel = ObjCRuntime.sel("repeatDuration")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}
fun CALayer.setRepeatDuration(value: Double) {
    val sel = ObjCRuntime.sel("setRepeatDuration:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol CAMediaTiming.
 */
fun CALayer.autoreverses(): Boolean {
    val sel = ObjCRuntime.sel("autoreverses")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun CALayer.setAutoreverses(value: Boolean) {
    val sel = ObjCRuntime.sel("setAutoreverses:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol CAMediaTiming.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun CALayer.fillMode(): MemorySegment {
    val sel = ObjCRuntime.sel("fillMode")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun CALayer.setFillMode(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setFillMode:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}
