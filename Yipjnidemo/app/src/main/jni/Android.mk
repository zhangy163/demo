LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := Jnitext
LOCAL_SRC_FILES := com_yip_yipjnidemo_JniText.c
APP_ABI := armeabi armeabi-v7a x86
include $(BUILD_SHARED_LIBRARY)