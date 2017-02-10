#include "com_yip_yipjnidemo_JniText.h"
  /*
   * Class:     io_github_yanbober_ndkapplication_NdkJniUtils
   * Method:    getCLanguageString
   * Signature: ()Ljava/lang/String;
   */
JNIEXPORT jstring JNICALL Java_com_yip_yipjnidemo_JniText_getCLangString(JNIEnv *env, jobject obj)
{
return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
}