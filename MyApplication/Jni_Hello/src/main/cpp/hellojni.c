#include <jni.h>

JNIEXPORT jstring JNICALL
// JAVA_包名_类名_方法名
Java_com_lz_hellojni_MainActivity_HelloJniFromC(JNIEnv *env, jobject thiz) {
    return (*env)->NewStringUTF(env, "Hellojni from C！");
}
