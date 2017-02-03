#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_lz_jnidatatype_Jni_geText(JNIEnv *env, jobject clazz) {
    return (*env)->NewStringUTF(env, "我来自JNI");
}


JNIEXPORT jint JNICALL Java_com_lz_jnidatatype_Jni_add(JNIEnv *env, jobject clazz, jint a, jint b) {
    return a + b;
}

