#import <AppKit/AppKit.h>
#import <CoreHaptics/CoreHaptics.h>
#import <GameController/GameController.h>
#import <IOKit/hid/IOHIDManager.h>
#import <CoreVideo/CoreVideo.h>
#import <ScreenCaptureKit/SCContentSharingPicker.h>
#import <ScreenCaptureKit/SCStream.h>

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
