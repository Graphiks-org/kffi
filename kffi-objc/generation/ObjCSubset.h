#import <AppKit/AppKit.h>
#import <CoreHaptics/CoreHaptics.h>
#import <GameController/GameController.h>
#import <IOKit/hid/IOHIDManager.h>
#import <ScreenCaptureKit/SCShareableContent.h>

/*
 * SCStream.h imports CoreMedia's CMTime record. kextract cannot currently emit that record on
 * the JVM ABI because its declared record alignment is smaller than an aligned member. Keep the
 * ScreenCaptureKit delivery bridge deliberately narrow: SCStream and SCStreamOutput are reached
 * through private Objective-C selectors, while the C functions below retain their opaque ABI.
 * This is enough to turn a callback CMSampleBuffer into detached Kotlin bytes without exposing a
 * native ScreenCaptureKit, CoreMedia, CoreVideo, or IOSurface handle to consumers.
 */
@class SCStream;
@protocol SCStreamOutput;
typedef struct opaqueCMSampleBuffer *CMSampleBufferRef;
typedef struct __CVBuffer *CVPixelBufferRef;
typedef struct __IOSurface *IOSurfaceRef;
typedef int32_t CVReturn;
typedef uint64_t CVOptionFlags;

CVPixelBufferRef CMSampleBufferGetImageBuffer(CMSampleBufferRef sbuf);
CVReturn CVPixelBufferLockBaseAddress(CVPixelBufferRef pixelBuffer, CVOptionFlags lockFlags);
CVReturn CVPixelBufferUnlockBaseAddress(CVPixelBufferRef pixelBuffer, CVOptionFlags unlockFlags);
void *CVPixelBufferGetBaseAddress(CVPixelBufferRef pixelBuffer);
size_t CVPixelBufferGetBytesPerRow(CVPixelBufferRef pixelBuffer);
size_t CVPixelBufferGetHeight(CVPixelBufferRef pixelBuffer);
size_t CVPixelBufferGetPlaneCount(CVPixelBufferRef pixelBuffer);
void *CVPixelBufferGetBaseAddressOfPlane(CVPixelBufferRef pixelBuffer, size_t planeIndex);
size_t CVPixelBufferGetBytesPerRowOfPlane(CVPixelBufferRef pixelBuffer, size_t planeIndex);
size_t CVPixelBufferGetHeightOfPlane(CVPixelBufferRef pixelBuffer, size_t planeIndex);
