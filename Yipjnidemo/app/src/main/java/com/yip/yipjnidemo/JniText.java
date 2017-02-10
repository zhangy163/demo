package com.yip.yipjnidemo;

/**
 * zhangy
 * Created by Administrator on 2017/2/10 0010.
 */

public class JniText {
    static {
        System.loadLibrary("Jnitext");
    }
    public static native String getCLangString();
}
