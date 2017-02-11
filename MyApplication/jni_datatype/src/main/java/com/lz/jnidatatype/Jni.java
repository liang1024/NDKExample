package com.lz.jnidatatype;

/**
 * Created by Administrator on 2017/2/3.
 */

public class Jni {
    static {
        System.loadLibrary("datatype");
    }

    public native String geText();

    public native int add(int a, int b);

    public native int[] arrElementsIncrease(int[] intArray);
}
